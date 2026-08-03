package androidx.compose.material;

/* compiled from: TextField.kt */
@kotlin.Metadata(d1 = {"\u0000\u009c\u0001\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\t\u001a\u0087\u0002\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\f2\u0012\u0010\r\u001a\u000e\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\n0\u000e2\b\b\u0002\u0010\u000f\u001a\u00020\u00102\b\b\u0002\u0010\u0011\u001a\u00020\u00122\b\b\u0002\u0010\u0013\u001a\u00020\u00122\b\b\u0002\u0010\u0014\u001a\u00020\u00152\u0015\b\u0002\u0010\u0016\u001a\u000f\u0012\u0004\u0012\u00020\n\u0018\u00010\u0017¢\u0006\u0002\b\u00182\u0015\b\u0002\u0010\u0019\u001a\u000f\u0012\u0004\u0012\u00020\n\u0018\u00010\u0017¢\u0006\u0002\b\u00182\u0015\b\u0002\u0010\u001a\u001a\u000f\u0012\u0004\u0012\u00020\n\u0018\u00010\u0017¢\u0006\u0002\b\u00182\u0015\b\u0002\u0010\u001b\u001a\u000f\u0012\u0004\u0012\u00020\n\u0018\u00010\u0017¢\u0006\u0002\b\u00182\b\b\u0002\u0010\u001c\u001a\u00020\u00122\b\b\u0002\u0010\u001d\u001a\u00020\u001e2\b\b\u0002\u0010\u001f\u001a\u00020 2\b\b\u0002\u0010!\u001a\u00020\"2\b\b\u0002\u0010#\u001a\u00020\u00122\b\b\u0002\u0010$\u001a\u00020%2\b\b\u0002\u0010&\u001a\u00020'2\b\b\u0002\u0010(\u001a\u00020)2\b\b\u0002\u0010*\u001a\u00020+H\u0007¢\u0006\u0002\u0010,\u001a\u0087\u0002\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020-2\u0012\u0010\r\u001a\u000e\u0012\u0004\u0012\u00020-\u0012\u0004\u0012\u00020\n0\u000e2\b\b\u0002\u0010\u000f\u001a\u00020\u00102\b\b\u0002\u0010\u0011\u001a\u00020\u00122\b\b\u0002\u0010\u0013\u001a\u00020\u00122\b\b\u0002\u0010\u0014\u001a\u00020\u00152\u0015\b\u0002\u0010\u0016\u001a\u000f\u0012\u0004\u0012\u00020\n\u0018\u00010\u0017¢\u0006\u0002\b\u00182\u0015\b\u0002\u0010\u0019\u001a\u000f\u0012\u0004\u0012\u00020\n\u0018\u00010\u0017¢\u0006\u0002\b\u00182\u0015\b\u0002\u0010\u001a\u001a\u000f\u0012\u0004\u0012\u00020\n\u0018\u00010\u0017¢\u0006\u0002\b\u00182\u0015\b\u0002\u0010\u001b\u001a\u000f\u0012\u0004\u0012\u00020\n\u0018\u00010\u0017¢\u0006\u0002\b\u00182\b\b\u0002\u0010\u001c\u001a\u00020\u00122\b\b\u0002\u0010\u001d\u001a\u00020\u001e2\b\b\u0002\u0010\u001f\u001a\u00020 2\b\b\u0002\u0010!\u001a\u00020\"2\b\b\u0002\u0010#\u001a\u00020\u00122\b\b\u0002\u0010$\u001a\u00020%2\b\b\u0002\u0010&\u001a\u00020'2\b\b\u0002\u0010(\u001a\u00020)2\b\b\u0002\u0010*\u001a\u00020+H\u0007¢\u0006\u0002\u0010.\u001a\u009a\u0001\u0010/\u001a\u00020\n2\u0006\u0010\u000f\u001a\u00020\u00102\u0011\u00100\u001a\r\u0012\u0004\u0012\u00020\n0\u0017¢\u0006\u0002\b\u00182\u0013\u0010\u0016\u001a\u000f\u0012\u0004\u0012\u00020\n\u0018\u00010\u0017¢\u0006\u0002\b\u00182\u0019\u0010\u0019\u001a\u0015\u0012\u0004\u0012\u00020\u0010\u0012\u0004\u0012\u00020\n\u0018\u00010\u000e¢\u0006\u0002\b\u00182\u0013\u00101\u001a\u000f\u0012\u0004\u0012\u00020\n\u0018\u00010\u0017¢\u0006\u0002\b\u00182\u0013\u00102\u001a\u000f\u0012\u0004\u0012\u00020\n\u0018\u00010\u0017¢\u0006\u0002\b\u00182\u0006\u0010#\u001a\u00020\u00122\u0006\u00103\u001a\u0002042\u0006\u00105\u001a\u000206H\u0001¢\u0006\u0002\u00107\u001a]\u00108\u001a\u00020%2\u0006\u00109\u001a\u00020%2\u0006\u0010:\u001a\u00020\u00122\u0006\u0010;\u001a\u00020%2\u0006\u0010<\u001a\u00020%2\u0006\u0010=\u001a\u00020%2\u0006\u0010>\u001a\u00020%2\u0006\u0010?\u001a\u00020@2\u0006\u0010A\u001a\u0002042\u0006\u00105\u001a\u000206H\u0002ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\bB\u0010C\u001aE\u0010D\u001a\u00020%2\u0006\u0010E\u001a\u00020%2\u0006\u0010F\u001a\u00020%2\u0006\u0010G\u001a\u00020%2\u0006\u0010H\u001a\u00020%2\u0006\u0010I\u001a\u00020%2\u0006\u0010?\u001a\u00020@H\u0002ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\bJ\u0010K\u001a\u0014\u0010L\u001a\u00020\u0010*\u00020\u00102\u0006\u0010M\u001a\u00020NH\u0000\u001at\u0010O\u001a\u00020\n*\u00020P2\u0006\u0010Q\u001a\u00020%2\u0006\u0010R\u001a\u00020%2\u0006\u0010S\u001a\u00020T2\b\u0010U\u001a\u0004\u0018\u00010T2\b\u0010V\u001a\u0004\u0018\u00010T2\b\u0010W\u001a\u0004\u0018\u00010T2\b\u0010X\u001a\u0004\u0018\u00010T2\u0006\u0010#\u001a\u00020\u00122\u0006\u0010Y\u001a\u00020%2\u0006\u0010Z\u001a\u00020%2\u0006\u00103\u001a\u0002042\u0006\u0010A\u001a\u000204H\u0002\u001aZ\u0010[\u001a\u00020\n*\u00020P2\u0006\u0010Q\u001a\u00020%2\u0006\u0010R\u001a\u00020%2\u0006\u0010\\\u001a\u00020T2\b\u0010V\u001a\u0004\u0018\u00010T2\b\u0010W\u001a\u0004\u0018\u00010T2\b\u0010X\u001a\u0004\u0018\u00010T2\u0006\u0010#\u001a\u00020\u00122\u0006\u0010A\u001a\u0002042\u0006\u00105\u001a\u000206H\u0002\"\u0019\u0010\u0000\u001a\u00020\u0001X\u0080\u0004ø\u0001\u0000¢\u0006\n\n\u0002\u0010\u0004\u001a\u0004\b\u0002\u0010\u0003\"\u0019\u0010\u0005\u001a\u00020\u0001X\u0080\u0004ø\u0001\u0000¢\u0006\n\n\u0002\u0010\u0004\u001a\u0004\b\u0006\u0010\u0003\"\u0019\u0010\u0007\u001a\u00020\u0001X\u0080\u0004ø\u0001\u0000¢\u0006\n\n\u0002\u0010\u0004\u001a\u0004\b\b\u0010\u0003\u0082\u0002\u000b\n\u0002\b\u0019\n\u0005\b¡\u001e0\u0001¨\u0006]"}, d2 = {"FirstBaselineOffset", "Landroidx/compose/ui/unit/Dp;", "getFirstBaselineOffset", "()F", "F", "TextFieldBottomPadding", "getTextFieldBottomPadding", "TextFieldTopPadding", "getTextFieldTopPadding", androidx.compose.material.TextFieldImplKt.TextFieldId, "", "value", "Landroidx/compose/ui/text/input/TextFieldValue;", "onValueChange", "Lkotlin/Function1;", "modifier", "Landroidx/compose/ui/Modifier;", "enabled", "", "readOnly", "textStyle", "Landroidx/compose/ui/text/TextStyle;", "label", "Lkotlin/Function0;", "Landroidx/compose/runtime/Composable;", "placeholder", "leadingIcon", "trailingIcon", "isError", "visualTransformation", "Landroidx/compose/ui/text/input/VisualTransformation;", "keyboardOptions", "Landroidx/compose/foundation/text/KeyboardOptions;", "keyboardActions", "Landroidx/compose/foundation/text/KeyboardActions;", "singleLine", com.helpshift.proactive.InAppViewConstants.MAX_LINES, "", "interactionSource", "Landroidx/compose/foundation/interaction/MutableInteractionSource;", "shape", "Landroidx/compose/ui/graphics/Shape;", "colors", "Landroidx/compose/material/TextFieldColors;", "(Landroidx/compose/ui/text/input/TextFieldValue;Lkotlin/jvm/functions/Function1;Landroidx/compose/ui/Modifier;ZZLandroidx/compose/ui/text/TextStyle;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;ZLandroidx/compose/ui/text/input/VisualTransformation;Landroidx/compose/foundation/text/KeyboardOptions;Landroidx/compose/foundation/text/KeyboardActions;ZILandroidx/compose/foundation/interaction/MutableInteractionSource;Landroidx/compose/ui/graphics/Shape;Landroidx/compose/material/TextFieldColors;Landroidx/compose/runtime/Composer;III)V", "", "(Ljava/lang/String;Lkotlin/jvm/functions/Function1;Landroidx/compose/ui/Modifier;ZZLandroidx/compose/ui/text/TextStyle;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;ZLandroidx/compose/ui/text/input/VisualTransformation;Landroidx/compose/foundation/text/KeyboardOptions;Landroidx/compose/foundation/text/KeyboardActions;ZILandroidx/compose/foundation/interaction/MutableInteractionSource;Landroidx/compose/ui/graphics/Shape;Landroidx/compose/material/TextFieldColors;Landroidx/compose/runtime/Composer;III)V", "TextFieldLayout", "textField", "leading", "trailing", "animationProgress", "", "paddingValues", "Landroidx/compose/foundation/layout/PaddingValues;", "(Landroidx/compose/ui/Modifier;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function3;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;ZFLandroidx/compose/foundation/layout/PaddingValues;Landroidx/compose/runtime/Composer;I)V", "calculateHeight", "textFieldHeight", "hasLabel", "labelBaseline", "leadingHeight", "trailingHeight", "placeholderHeight", "constraints", "Landroidx/compose/ui/unit/Constraints;", "density", "calculateHeight-O3s9Psw", "(IZIIIIJFLandroidx/compose/foundation/layout/PaddingValues;)I", "calculateWidth", "leadingWidth", "trailingWidth", "textFieldWidth", "labelWidth", "placeholderWidth", "calculateWidth-VsPV1Ek", "(IIIIIJ)I", "drawIndicatorLine", "indicatorBorder", "Landroidx/compose/foundation/BorderStroke;", "placeWithLabel", "Landroidx/compose/ui/layout/Placeable$PlacementScope;", "width", "height", "textfieldPlaceable", "Landroidx/compose/ui/layout/Placeable;", "labelPlaceable", "placeholderPlaceable", "leadingPlaceable", "trailingPlaceable", "labelEndPosition", "textPosition", "placeWithoutLabel", "textPlaceable", "material_release"}, k = 2, mv = {1, 6, 0}, xi = 48)
/* loaded from: classes.dex */
public final class TextFieldKt {
    private static final float FirstBaselineOffset = androidx.compose.ui.unit.Dp.m4478constructorimpl(20);
    private static final float TextFieldBottomPadding = androidx.compose.ui.unit.Dp.m4478constructorimpl(10);
    private static final float TextFieldTopPadding = androidx.compose.ui.unit.Dp.m4478constructorimpl(4);

    /* JADX WARN: Code restructure failed: missing block: B:57:0x01b6, code lost:
    
        if (r7.changed(r81) == false) goto L145;
     */
    /* JADX WARN: Removed duplicated region for block: B:100:0x02a3  */
    /* JADX WARN: Removed duplicated region for block: B:120:0x04a6  */
    /* JADX WARN: Removed duplicated region for block: B:123:0x02f8  */
    /* JADX WARN: Removed duplicated region for block: B:125:0x0301  */
    /* JADX WARN: Removed duplicated region for block: B:127:0x0307  */
    /* JADX WARN: Removed duplicated region for block: B:130:0x030f  */
    /* JADX WARN: Removed duplicated region for block: B:132:0x0339  */
    /* JADX WARN: Removed duplicated region for block: B:134:0x033f  */
    /* JADX WARN: Removed duplicated region for block: B:136:0x0345  */
    /* JADX WARN: Removed duplicated region for block: B:138:0x034b  */
    /* JADX WARN: Removed duplicated region for block: B:13:0x0075  */
    /* JADX WARN: Removed duplicated region for block: B:140:0x0351  */
    /* JADX WARN: Removed duplicated region for block: B:142:0x0357  */
    /* JADX WARN: Removed duplicated region for block: B:145:0x0364  */
    /* JADX WARN: Removed duplicated region for block: B:148:0x0375  */
    /* JADX WARN: Removed duplicated region for block: B:150:0x03a3  */
    /* JADX WARN: Removed duplicated region for block: B:152:0x03a9  */
    /* JADX WARN: Removed duplicated region for block: B:155:0x03b6  */
    /* JADX WARN: Removed duplicated region for block: B:161:0x03e4  */
    /* JADX WARN: Removed duplicated region for block: B:164:0x0424  */
    /* JADX WARN: Removed duplicated region for block: B:166:0x046b  */
    /* JADX WARN: Removed duplicated region for block: B:167:0x041b  */
    /* JADX WARN: Removed duplicated region for block: B:168:0x03dc  */
    /* JADX WARN: Removed duplicated region for block: B:169:0x03b0  */
    /* JADX WARN: Removed duplicated region for block: B:170:0x03a5  */
    /* JADX WARN: Removed duplicated region for block: B:171:0x039f  */
    /* JADX WARN: Removed duplicated region for block: B:172:0x036d  */
    /* JADX WARN: Removed duplicated region for block: B:173:0x035e  */
    /* JADX WARN: Removed duplicated region for block: B:174:0x0353  */
    /* JADX WARN: Removed duplicated region for block: B:175:0x034d  */
    /* JADX WARN: Removed duplicated region for block: B:176:0x0347  */
    /* JADX WARN: Removed duplicated region for block: B:177:0x0341  */
    /* JADX WARN: Removed duplicated region for block: B:178:0x033b  */
    /* JADX WARN: Removed duplicated region for block: B:179:0x0331  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0099  */
    /* JADX WARN: Removed duplicated region for block: B:180:0x0309  */
    /* JADX WARN: Removed duplicated region for block: B:181:0x0303  */
    /* JADX WARN: Removed duplicated region for block: B:182:0x02fd  */
    /* JADX WARN: Removed duplicated region for block: B:184:0x0257  */
    /* JADX WARN: Removed duplicated region for block: B:186:0x0239  */
    /* JADX WARN: Removed duplicated region for block: B:187:0x020c  */
    /* JADX WARN: Removed duplicated region for block: B:194:0x01ec  */
    /* JADX WARN: Removed duplicated region for block: B:201:0x01cd  */
    /* JADX WARN: Removed duplicated region for block: B:208:0x01c0  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x00bb  */
    /* JADX WARN: Removed duplicated region for block: B:211:0x01a6  */
    /* JADX WARN: Removed duplicated region for block: B:212:0x0179  */
    /* JADX WARN: Removed duplicated region for block: B:219:0x015a  */
    /* JADX WARN: Removed duplicated region for block: B:227:0x013c  */
    /* JADX WARN: Removed duplicated region for block: B:234:0x011c  */
    /* JADX WARN: Removed duplicated region for block: B:241:0x00fc  */
    /* JADX WARN: Removed duplicated region for block: B:248:0x00de  */
    /* JADX WARN: Removed duplicated region for block: B:256:0x00cf  */
    /* JADX WARN: Removed duplicated region for block: B:257:0x009e  */
    /* JADX WARN: Removed duplicated region for block: B:264:0x0078  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x00d7  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x00f5  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0115  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0135  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x0155  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x0174  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x0190  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x01ac  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x01c8  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x01e5  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x0205  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x0225  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x0241  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x0263  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x060f  */
    /* JADX WARN: Removed duplicated region for block: B:97:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void TextField(final java.lang.String value, final kotlin.jvm.functions.Function1<? super java.lang.String, kotlin.Unit> onValueChange, androidx.compose.ui.Modifier modifier, boolean z, boolean z2, androidx.compose.ui.text.TextStyle textStyle, kotlin.jvm.functions.Function2<? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.Unit> function2, kotlin.jvm.functions.Function2<? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.Unit> function22, kotlin.jvm.functions.Function2<? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.Unit> function23, kotlin.jvm.functions.Function2<? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.Unit> function24, boolean z3, androidx.compose.ui.text.input.VisualTransformation visualTransformation, androidx.compose.foundation.text.KeyboardOptions keyboardOptions, androidx.compose.foundation.text.KeyboardActions keyboardActions, boolean z4, int i, androidx.compose.foundation.interaction.MutableInteractionSource mutableInteractionSource, androidx.compose.ui.graphics.Shape shape, androidx.compose.material.TextFieldColors textFieldColors, androidx.compose.runtime.Composer composer, final int i2, final int i3, final int i4) {
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
        androidx.compose.ui.Modifier modifier2;
        boolean z5;
        androidx.compose.ui.text.TextStyle textStyle2;
        boolean z6;
        androidx.compose.foundation.text.KeyboardOptions keyboardOptions2;
        androidx.compose.foundation.text.KeyboardActions keyboardActions2;
        int i19;
        kotlin.jvm.functions.Function2<? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.Unit> function25;
        androidx.compose.foundation.interaction.MutableInteractionSource mutableInteractionSource2;
        androidx.compose.foundation.interaction.MutableInteractionSource mutableInteractionSource3;
        androidx.compose.foundation.shape.CornerBasedShape cornerBasedShape;
        androidx.compose.foundation.text.KeyboardActions keyboardActions3;
        kotlin.jvm.functions.Function2<? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.Unit> function26;
        androidx.compose.foundation.interaction.MutableInteractionSource mutableInteractionSource4;
        androidx.compose.material.TextFieldColors textFieldColors2;
        kotlin.jvm.functions.Function2<? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.Unit> function27;
        androidx.compose.ui.text.input.VisualTransformation visualTransformation2;
        kotlin.jvm.functions.Function2<? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.Unit> function28;
        kotlin.jvm.functions.Function2<? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.Unit> function29;
        boolean z7;
        androidx.compose.foundation.text.KeyboardOptions keyboardOptions3;
        boolean z8;
        androidx.compose.ui.Modifier modifier3;
        boolean z9;
        androidx.compose.ui.text.TextStyle textStyle3;
        androidx.compose.ui.graphics.Shape shape2;
        long m3994getColor0d7_KjU;
        androidx.compose.ui.Modifier m1559indicatorLinegv0btCI;
        androidx.compose.runtime.Composer composer2;
        final boolean z10;
        final kotlin.jvm.functions.Function2<? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.Unit> function210;
        final kotlin.jvm.functions.Function2<? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.Unit> function211;
        final kotlin.jvm.functions.Function2<? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.Unit> function212;
        final kotlin.jvm.functions.Function2<? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.Unit> function213;
        final androidx.compose.ui.text.input.VisualTransformation visualTransformation3;
        final androidx.compose.foundation.text.KeyboardOptions keyboardOptions4;
        final androidx.compose.foundation.text.KeyboardActions keyboardActions4;
        final boolean z11;
        final androidx.compose.foundation.interaction.MutableInteractionSource mutableInteractionSource5;
        final androidx.compose.material.TextFieldColors textFieldColors3;
        final androidx.compose.ui.graphics.Shape shape3;
        final boolean z12;
        final androidx.compose.ui.text.TextStyle textStyle4;
        final boolean z13;
        final androidx.compose.ui.Modifier modifier4;
        final int i20;
        androidx.compose.runtime.ScopeUpdateScope endRestartGroup;
        int i21;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(value, "value");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(onValueChange, "onValueChange");
        androidx.compose.runtime.Composer startRestartGroup = composer.startRestartGroup(-1690895095);
        androidx.compose.runtime.ComposerKt.sourceInformation(startRestartGroup, "C(TextField)P(17,10,9,1,12,15,6,11,7,16,3,18,5,4,14,8,2,13)163@8397L7,174@8951L39,176@9033L6,177@9158L17,189@9576L24,199@10014L20,186@9478L1542:TextField.kt#jmzs0o");
        if ((i4 & 1) != 0) {
            i5 = i2 | 6;
        } else if ((i2 & 14) == 0) {
            i5 = (startRestartGroup.changed(value) ? 4 : 2) | i2;
        } else {
            i5 = i2;
        }
        if ((i4 & 2) != 0) {
            i5 |= 48;
        } else if ((i2 & 112) == 0) {
            i5 |= startRestartGroup.changed(onValueChange) ? 32 : 16;
        }
        int i22 = i4 & 4;
        if (i22 != 0) {
            i5 |= 384;
        } else if ((i2 & 896) == 0) {
            i5 |= startRestartGroup.changed(modifier) ? 256 : 128;
            i6 = i4 & 8;
            int i23 = 2048;
            if (i6 == 0) {
                i5 |= 3072;
            } else if ((i2 & 7168) == 0) {
                i5 |= startRestartGroup.changed(z) ? 2048 : 1024;
                i7 = i4 & 16;
                if (i7 != 0) {
                    i5 |= 24576;
                } else if ((i2 & 57344) == 0) {
                    i5 |= startRestartGroup.changed(z2) ? 16384 : 8192;
                }
                if ((i2 & 458752) == 0) {
                    i5 |= ((i4 & 32) == 0 && startRestartGroup.changed(textStyle)) ? 131072 : 65536;
                }
                i8 = i4 & 64;
                if (i8 != 0) {
                    i5 |= 1572864;
                } else if ((i2 & 3670016) == 0) {
                    i5 |= startRestartGroup.changed(function2) ? 1048576 : 524288;
                }
                i9 = i4 & 128;
                if (i9 != 0) {
                    i5 |= 12582912;
                } else if ((i2 & 29360128) == 0) {
                    i5 |= startRestartGroup.changed(function22) ? 8388608 : 4194304;
                }
                i10 = i4 & 256;
                if (i10 != 0) {
                    i5 |= 100663296;
                } else if ((i2 & 234881024) == 0) {
                    i5 |= startRestartGroup.changed(function23) ? androidx.core.view.accessibility.AccessibilityEventCompat.TYPE_VIEW_TARGETED_BY_SCROLL : 33554432;
                }
                i11 = i4 & 512;
                if (i11 != 0) {
                    i5 |= 805306368;
                } else if ((i2 & 1879048192) == 0) {
                    i5 |= startRestartGroup.changed(function24) ? 536870912 : 268435456;
                }
                i12 = i4 & 1024;
                if (i12 != 0) {
                    i13 = i3 | 6;
                } else if ((i3 & 14) == 0) {
                    i13 = i3 | (startRestartGroup.changed(z3) ? 4 : 2);
                } else {
                    i13 = i3;
                }
                i14 = i4 & 2048;
                if (i14 != 0) {
                    i13 |= 48;
                } else if ((i3 & 112) == 0) {
                    i13 |= startRestartGroup.changed(visualTransformation) ? 32 : 16;
                }
                if ((i3 & 896) == 0) {
                    if ((i4 & 4096) == 0 && startRestartGroup.changed(keyboardOptions)) {
                        i21 = 256;
                        i13 |= i21;
                    }
                    i21 = 128;
                    i13 |= i21;
                }
                if ((i3 & 7168) == 0) {
                    if ((i4 & 8192) != 0) {
                    }
                    i23 = 1024;
                    i13 |= i23;
                }
                i15 = i13;
                i16 = i4 & 16384;
                if (i16 != 0) {
                    i15 |= 24576;
                } else if ((i3 & 57344) == 0) {
                    i15 |= startRestartGroup.changed(z4) ? 16384 : 8192;
                }
                i17 = i4 & 32768;
                if (i17 != 0) {
                    i15 |= androidx.profileinstaller.ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE;
                } else if ((i3 & 458752) == 0) {
                    i15 |= startRestartGroup.changed(i) ? 131072 : 65536;
                }
                i18 = i4 & 65536;
                if (i18 != 0) {
                    i15 |= 1572864;
                } else if ((i3 & 3670016) == 0) {
                    i15 |= startRestartGroup.changed(mutableInteractionSource) ? 1048576 : 524288;
                }
                if ((i3 & 29360128) == 0) {
                    i15 |= ((i4 & 131072) == 0 && startRestartGroup.changed(shape)) ? 8388608 : 4194304;
                }
                if ((i3 & 234881024) == 0) {
                    i15 |= ((i4 & 262144) == 0 && startRestartGroup.changed(textFieldColors)) ? androidx.core.view.accessibility.AccessibilityEventCompat.TYPE_VIEW_TARGETED_BY_SCROLL : 33554432;
                }
                if ((i5 & 1533916891) == 306783378 || (191739611 & i15) != 38347922 || !startRestartGroup.getSkipping()) {
                    startRestartGroup.startDefaults();
                    if ((i2 & 1) != 0 || startRestartGroup.getDefaultsInvalid()) {
                        androidx.compose.ui.Modifier.Companion companion = i22 != 0 ? androidx.compose.ui.Modifier.INSTANCE : modifier;
                        boolean z14 = i6 != 0 ? true : z;
                        boolean z15 = i7 != 0 ? false : z2;
                        if ((i4 & 32) != 0) {
                            androidx.compose.runtime.ProvidableCompositionLocal<androidx.compose.ui.text.TextStyle> localTextStyle = androidx.compose.material.TextKt.getLocalTextStyle();
                            modifier2 = companion;
                            z5 = z14;
                            androidx.compose.runtime.ComposerKt.sourceInformationMarkerStart(startRestartGroup, 2023513938, "C:CompositionLocal.kt#9igjgp");
                            java.lang.Object consume = startRestartGroup.consume(localTextStyle);
                            androidx.compose.runtime.ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                            textStyle2 = (androidx.compose.ui.text.TextStyle) consume;
                            i5 &= -458753;
                        } else {
                            modifier2 = companion;
                            z5 = z14;
                            textStyle2 = textStyle;
                        }
                        kotlin.jvm.functions.Function2<? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.Unit> function214 = i8 != 0 ? null : function2;
                        kotlin.jvm.functions.Function2<? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.Unit> function215 = i9 != 0 ? null : function22;
                        kotlin.jvm.functions.Function2<? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.Unit> function216 = i10 != 0 ? null : function23;
                        kotlin.jvm.functions.Function2<? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.Unit> function217 = i11 != 0 ? null : function24;
                        z6 = i12 != 0 ? false : z3;
                        androidx.compose.ui.text.input.VisualTransformation none = i14 != 0 ? androidx.compose.ui.text.input.VisualTransformation.INSTANCE.getNone() : visualTransformation;
                        if ((i4 & 4096) != 0) {
                            keyboardOptions2 = androidx.compose.foundation.text.KeyboardOptions.INSTANCE.getDefault();
                            i15 &= -897;
                        } else {
                            keyboardOptions2 = keyboardOptions;
                        }
                        int i24 = i5;
                        if ((i4 & 8192) != 0) {
                            keyboardActions2 = new androidx.compose.foundation.text.KeyboardActions(null, null, null, null, null, null, 63, null);
                            i15 &= -7169;
                        } else {
                            keyboardActions2 = keyboardActions;
                        }
                        boolean z16 = i16 != 0 ? false : z4;
                        i19 = i17 != 0 ? Integer.MAX_VALUE : i;
                        androidx.compose.foundation.text.KeyboardActions keyboardActions5 = keyboardActions2;
                        if (i18 != 0) {
                            startRestartGroup.startReplaceableGroup(-492369756);
                            androidx.compose.runtime.ComposerKt.sourceInformation(startRestartGroup, "C(remember):Composables.kt#9igjgp");
                            java.lang.Object rememberedValue = startRestartGroup.rememberedValue();
                            function25 = function216;
                            if (rememberedValue == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                                rememberedValue = androidx.compose.foundation.interaction.InteractionSourceKt.MutableInteractionSource();
                                startRestartGroup.updateRememberedValue(rememberedValue);
                            }
                            startRestartGroup.endReplaceableGroup();
                            mutableInteractionSource2 = (androidx.compose.foundation.interaction.MutableInteractionSource) rememberedValue;
                        } else {
                            function25 = function216;
                            mutableInteractionSource2 = mutableInteractionSource;
                        }
                        if ((i4 & 131072) != 0) {
                            mutableInteractionSource3 = mutableInteractionSource2;
                            cornerBasedShape = androidx.compose.foundation.shape.CornerBasedShape.copy$default(androidx.compose.material.MaterialTheme.INSTANCE.getShapes(startRestartGroup, 6).getSmall(), null, null, androidx.compose.foundation.shape.CornerSizeKt.getZeroCornerSize(), androidx.compose.foundation.shape.CornerSizeKt.getZeroCornerSize(), 3, null);
                            i15 = (-29360129) & i15;
                        } else {
                            mutableInteractionSource3 = mutableInteractionSource2;
                            cornerBasedShape = shape;
                        }
                        if ((262144 & i4) != 0) {
                            textFieldColors2 = androidx.compose.material.TextFieldDefaults.INSTANCE.m1562textFieldColorsdx8h9Zs(0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, startRestartGroup, 0, 0, 48, 2097151);
                            i15 &= -234881025;
                            keyboardActions3 = keyboardActions5;
                            function26 = function25;
                            mutableInteractionSource4 = mutableInteractionSource3;
                        } else {
                            keyboardActions3 = keyboardActions5;
                            function26 = function25;
                            mutableInteractionSource4 = mutableInteractionSource3;
                            textFieldColors2 = textFieldColors;
                        }
                        function27 = function217;
                        visualTransformation2 = none;
                        function28 = function215;
                        function29 = function214;
                        z7 = z16;
                        keyboardOptions3 = keyboardOptions2;
                        z8 = z15;
                        modifier3 = modifier2;
                        z9 = z5;
                        textStyle3 = textStyle2;
                        shape2 = cornerBasedShape;
                        i5 = i24;
                    } else {
                        startRestartGroup.skipToGroupEnd();
                        if ((i4 & 32) != 0) {
                            i5 &= -458753;
                        }
                        if ((i4 & 4096) != 0) {
                            i15 &= -897;
                        }
                        if ((i4 & 8192) != 0) {
                            i15 &= -7169;
                        }
                        if ((i4 & 131072) != 0) {
                            i15 &= -29360129;
                        }
                        if ((262144 & i4) != 0) {
                            i15 &= -234881025;
                        }
                        modifier3 = modifier;
                        z9 = z;
                        z8 = z2;
                        textStyle3 = textStyle;
                        function29 = function2;
                        function28 = function22;
                        function26 = function23;
                        function27 = function24;
                        z6 = z3;
                        visualTransformation2 = visualTransformation;
                        keyboardOptions3 = keyboardOptions;
                        keyboardActions3 = keyboardActions;
                        z7 = z4;
                        i19 = i;
                        mutableInteractionSource4 = mutableInteractionSource;
                        shape2 = shape;
                        textFieldColors2 = textFieldColors;
                    }
                    startRestartGroup.endDefaults();
                    startRestartGroup.startReplaceableGroup(-833027444);
                    androidx.compose.runtime.ComposerKt.sourceInformation(startRestartGroup, "*181@9327L18");
                    m3994getColor0d7_KjU = textStyle3.m3994getColor0d7_KjU();
                    if (m3994getColor0d7_KjU == androidx.compose.ui.graphics.Color.INSTANCE.m2149getUnspecified0d7_KjU()) {
                        m3994getColor0d7_KjU = textFieldColors2.textColor(z9, startRestartGroup, ((i5 >> 9) & 14) | ((i15 >> 21) & 112)).getValue().m2123unboximpl();
                    }
                    startRestartGroup.endReplaceableGroup();
                    androidx.compose.ui.text.TextStyle merge = textStyle3.merge(new androidx.compose.ui.text.TextStyle(m3994getColor0d7_KjU, 0L, (androidx.compose.ui.text.font.FontWeight) null, (androidx.compose.ui.text.font.FontStyle) null, (androidx.compose.ui.text.font.FontSynthesis) null, (androidx.compose.ui.text.font.FontFamily) null, (java.lang.String) null, 0L, (androidx.compose.ui.text.style.BaselineShift) null, (androidx.compose.ui.text.style.TextGeometricTransform) null, (androidx.compose.ui.text.intl.LocaleList) null, 0L, (androidx.compose.ui.text.style.TextDecoration) null, (androidx.compose.ui.graphics.Shadow) null, (androidx.compose.ui.text.style.TextAlign) null, (androidx.compose.ui.text.style.TextDirection) null, 0L, (androidx.compose.ui.text.style.TextIndent) null, 262142, (kotlin.jvm.internal.DefaultConstructorMarker) null));
                    int i25 = (i15 >> 21) & 112;
                    final boolean z17 = z9;
                    m1559indicatorLinegv0btCI = androidx.compose.material.TextFieldDefaults.INSTANCE.m1559indicatorLinegv0btCI(androidx.compose.foundation.BackgroundKt.m211backgroundbw27NRU(modifier3, textFieldColors2.backgroundColor(z9, startRestartGroup, ((i5 >> 9) & 14) | i25).getValue().m2123unboximpl(), shape2), z17, z6, mutableInteractionSource4, textFieldColors2, (r17 & 16) != 0 ? androidx.compose.material.TextFieldDefaults.FocusedBorderThickness : 0.0f, (r17 & 32) != 0 ? androidx.compose.material.TextFieldDefaults.UnfocusedBorderThickness : 0.0f);
                    final boolean z18 = z7;
                    final androidx.compose.ui.text.input.VisualTransformation visualTransformation4 = visualTransformation2;
                    final androidx.compose.foundation.interaction.MutableInteractionSource mutableInteractionSource6 = mutableInteractionSource4;
                    final boolean z19 = z6;
                    final kotlin.jvm.functions.Function2<? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.Unit> function218 = function29;
                    final kotlin.jvm.functions.Function2<? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.Unit> function219 = function28;
                    final kotlin.jvm.functions.Function2<? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.Unit> function220 = function26;
                    final kotlin.jvm.functions.Function2<? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.Unit> function221 = function27;
                    final androidx.compose.material.TextFieldColors textFieldColors4 = textFieldColors2;
                    final int i26 = i5;
                    final int i27 = i15;
                    int i28 = i15 << 12;
                    composer2 = startRestartGroup;
                    boolean z20 = z9;
                    androidx.compose.ui.Modifier modifier5 = modifier3;
                    androidx.compose.foundation.text.BasicTextFieldKt.BasicTextField(value, onValueChange, androidx.compose.foundation.layout.SizeKt.m601defaultMinSizeVpY3zN4(m1559indicatorLinegv0btCI, androidx.compose.material.TextFieldDefaults.INSTANCE.m1557getMinWidthD9Ej5fM(), androidx.compose.material.TextFieldDefaults.INSTANCE.m1556getMinHeightD9Ej5fM()), z9, z8, merge, keyboardOptions3, keyboardActions3, z7, i19, visualTransformation2, (kotlin.jvm.functions.Function1) null, mutableInteractionSource4, new androidx.compose.ui.graphics.SolidColor(textFieldColors2.cursorColor(z6, startRestartGroup, (i15 & 14) | i25).getValue().m2123unboximpl(), null), androidx.compose.runtime.internal.ComposableLambdaKt.composableLambda(startRestartGroup, -1994363936, true, new kotlin.jvm.functions.Function3<kotlin.jvm.functions.Function2<? super androidx.compose.runtime.Composer, ? super java.lang.Integer, ? extends kotlin.Unit>, androidx.compose.runtime.Composer, java.lang.Integer, kotlin.Unit>() { // from class: androidx.compose.material.TextFieldKt$TextField$2
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        /* JADX WARN: Multi-variable type inference failed */
                        {
                            super(3);
                        }

                        @Override // kotlin.jvm.functions.Function3
                        public /* bridge */ /* synthetic */ kotlin.Unit invoke(kotlin.jvm.functions.Function2<? super androidx.compose.runtime.Composer, ? super java.lang.Integer, ? extends kotlin.Unit> function222, androidx.compose.runtime.Composer composer3, java.lang.Integer num) {
                            invoke((kotlin.jvm.functions.Function2<? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.Unit>) function222, composer3, num.intValue());
                            return kotlin.Unit.INSTANCE;
                        }

                        public final void invoke(kotlin.jvm.functions.Function2<? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.Unit> innerTextField, androidx.compose.runtime.Composer composer3, int i29) {
                            int i30;
                            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(innerTextField, "innerTextField");
                            androidx.compose.runtime.ComposerKt.sourceInformation(composer3, "C208@10466L538:TextField.kt#jmzs0o");
                            if ((i29 & 14) == 0) {
                                i30 = i29 | (composer3.changed(innerTextField) ? 4 : 2);
                            } else {
                                i30 = i29;
                            }
                            if ((i30 & 91) != 18 || !composer3.getSkipping()) {
                                androidx.compose.material.TextFieldDefaults textFieldDefaults = androidx.compose.material.TextFieldDefaults.INSTANCE;
                                java.lang.String str = value;
                                boolean z21 = z17;
                                boolean z22 = z18;
                                androidx.compose.ui.text.input.VisualTransformation visualTransformation5 = visualTransformation4;
                                androidx.compose.foundation.interaction.MutableInteractionSource mutableInteractionSource7 = mutableInteractionSource6;
                                boolean z23 = z19;
                                kotlin.jvm.functions.Function2<androidx.compose.runtime.Composer, java.lang.Integer, kotlin.Unit> function222 = function218;
                                kotlin.jvm.functions.Function2<androidx.compose.runtime.Composer, java.lang.Integer, kotlin.Unit> function223 = function219;
                                kotlin.jvm.functions.Function2<androidx.compose.runtime.Composer, java.lang.Integer, kotlin.Unit> function224 = function220;
                                kotlin.jvm.functions.Function2<androidx.compose.runtime.Composer, java.lang.Integer, kotlin.Unit> function225 = function221;
                                androidx.compose.material.TextFieldColors textFieldColors5 = textFieldColors4;
                                int i31 = i26;
                                int i32 = i27;
                                textFieldDefaults.TextFieldDecorationBox(str, innerTextField, z21, z22, visualTransformation5, mutableInteractionSource7, z23, function222, function223, function224, function225, textFieldColors5, null, composer3, ((i32 >> 3) & 7168) | (i31 & 14) | ((i30 << 3) & 112) | ((i31 >> 3) & 896) | ((i32 << 9) & 57344) | ((i32 >> 3) & 458752) | ((i32 << 18) & 3670016) | ((i31 << 3) & 29360128) | ((i31 << 3) & 234881024) | ((i31 << 3) & 1879048192), ((i31 >> 27) & 14) | 3072 | ((i32 >> 21) & 112), 4096);
                                return;
                            }
                            composer3.skipToGroupEnd();
                        }
                    }), composer2, (i5 & 57344) | (i5 & 14) | (i5 & 112) | (i5 & 7168) | (i28 & 3670016) | (androidx.compose.foundation.text.KeyboardActions.$stable << 21) | (29360128 & i28) | (234881024 & i28) | (i28 & 1879048192), ((i15 >> 3) & 14) | 24576 | ((i15 >> 12) & 896), 2048);
                    z10 = z8;
                    function210 = function29;
                    function211 = function28;
                    function212 = function26;
                    function213 = function27;
                    visualTransformation3 = visualTransformation2;
                    keyboardOptions4 = keyboardOptions3;
                    keyboardActions4 = keyboardActions3;
                    z11 = z7;
                    mutableInteractionSource5 = mutableInteractionSource4;
                    textFieldColors3 = textFieldColors2;
                    shape3 = shape2;
                    z12 = z6;
                    textStyle4 = textStyle3;
                    z13 = z20;
                    modifier4 = modifier5;
                    i20 = i19;
                } else {
                    startRestartGroup.skipToGroupEnd();
                    modifier4 = modifier;
                    z13 = z;
                    z10 = z2;
                    textStyle4 = textStyle;
                    function211 = function22;
                    function212 = function23;
                    function213 = function24;
                    z12 = z3;
                    visualTransformation3 = visualTransformation;
                    keyboardOptions4 = keyboardOptions;
                    keyboardActions4 = keyboardActions;
                    z11 = z4;
                    i20 = i;
                    mutableInteractionSource5 = mutableInteractionSource;
                    shape3 = shape;
                    textFieldColors3 = textFieldColors;
                    composer2 = startRestartGroup;
                    function210 = function2;
                }
                endRestartGroup = composer2.endRestartGroup();
                if (endRestartGroup == null) {
                    return;
                }
                endRestartGroup.updateScope(new kotlin.jvm.functions.Function2<androidx.compose.runtime.Composer, java.lang.Integer, kotlin.Unit>() { // from class: androidx.compose.material.TextFieldKt$TextField$3
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

                    public final void invoke(androidx.compose.runtime.Composer composer3, int i29) {
                        androidx.compose.material.TextFieldKt.TextField(value, onValueChange, modifier4, z13, z10, textStyle4, function210, function211, function212, function213, z12, visualTransformation3, keyboardOptions4, keyboardActions4, z11, i20, mutableInteractionSource5, shape3, textFieldColors3, composer3, i2 | 1, i3, i4);
                    }
                });
                return;
            }
            i7 = i4 & 16;
            if (i7 != 0) {
            }
            if ((i2 & 458752) == 0) {
            }
            i8 = i4 & 64;
            if (i8 != 0) {
            }
            i9 = i4 & 128;
            if (i9 != 0) {
            }
            i10 = i4 & 256;
            if (i10 != 0) {
            }
            i11 = i4 & 512;
            if (i11 != 0) {
            }
            i12 = i4 & 1024;
            if (i12 != 0) {
            }
            i14 = i4 & 2048;
            if (i14 != 0) {
            }
            if ((i3 & 896) == 0) {
            }
            if ((i3 & 7168) == 0) {
            }
            i15 = i13;
            i16 = i4 & 16384;
            if (i16 != 0) {
            }
            i17 = i4 & 32768;
            if (i17 != 0) {
            }
            i18 = i4 & 65536;
            if (i18 != 0) {
            }
            if ((i3 & 29360128) == 0) {
            }
            if ((i3 & 234881024) == 0) {
            }
            if ((i5 & 1533916891) == 306783378) {
            }
            startRestartGroup.startDefaults();
            if ((i2 & 1) != 0) {
            }
            if (i22 != 0) {
            }
            if (i6 != 0) {
            }
            if (i7 != 0) {
            }
            if ((i4 & 32) != 0) {
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
            if ((i4 & 4096) != 0) {
            }
            int i242 = i5;
            if ((i4 & 8192) != 0) {
            }
            if (i16 != 0) {
            }
            if (i17 != 0) {
            }
            androidx.compose.foundation.text.KeyboardActions keyboardActions52 = keyboardActions2;
            if (i18 != 0) {
            }
            if ((i4 & 131072) != 0) {
            }
            if ((262144 & i4) != 0) {
            }
            function27 = function217;
            visualTransformation2 = none;
            function28 = function215;
            function29 = function214;
            z7 = z16;
            keyboardOptions3 = keyboardOptions2;
            z8 = z15;
            modifier3 = modifier2;
            z9 = z5;
            textStyle3 = textStyle2;
            shape2 = cornerBasedShape;
            i5 = i242;
            startRestartGroup.endDefaults();
            startRestartGroup.startReplaceableGroup(-833027444);
            androidx.compose.runtime.ComposerKt.sourceInformation(startRestartGroup, "*181@9327L18");
            m3994getColor0d7_KjU = textStyle3.m3994getColor0d7_KjU();
            if (m3994getColor0d7_KjU == androidx.compose.ui.graphics.Color.INSTANCE.m2149getUnspecified0d7_KjU()) {
            }
            startRestartGroup.endReplaceableGroup();
            androidx.compose.ui.text.TextStyle merge2 = textStyle3.merge(new androidx.compose.ui.text.TextStyle(m3994getColor0d7_KjU, 0L, (androidx.compose.ui.text.font.FontWeight) null, (androidx.compose.ui.text.font.FontStyle) null, (androidx.compose.ui.text.font.FontSynthesis) null, (androidx.compose.ui.text.font.FontFamily) null, (java.lang.String) null, 0L, (androidx.compose.ui.text.style.BaselineShift) null, (androidx.compose.ui.text.style.TextGeometricTransform) null, (androidx.compose.ui.text.intl.LocaleList) null, 0L, (androidx.compose.ui.text.style.TextDecoration) null, (androidx.compose.ui.graphics.Shadow) null, (androidx.compose.ui.text.style.TextAlign) null, (androidx.compose.ui.text.style.TextDirection) null, 0L, (androidx.compose.ui.text.style.TextIndent) null, 262142, (kotlin.jvm.internal.DefaultConstructorMarker) null));
            int i252 = (i15 >> 21) & 112;
            final boolean z172 = z9;
            m1559indicatorLinegv0btCI = androidx.compose.material.TextFieldDefaults.INSTANCE.m1559indicatorLinegv0btCI(androidx.compose.foundation.BackgroundKt.m211backgroundbw27NRU(modifier3, textFieldColors2.backgroundColor(z9, startRestartGroup, ((i5 >> 9) & 14) | i252).getValue().m2123unboximpl(), shape2), z172, z6, mutableInteractionSource4, textFieldColors2, (r17 & 16) != 0 ? androidx.compose.material.TextFieldDefaults.FocusedBorderThickness : 0.0f, (r17 & 32) != 0 ? androidx.compose.material.TextFieldDefaults.UnfocusedBorderThickness : 0.0f);
            final boolean z182 = z7;
            final androidx.compose.ui.text.input.VisualTransformation visualTransformation42 = visualTransformation2;
            final androidx.compose.foundation.interaction.MutableInteractionSource mutableInteractionSource62 = mutableInteractionSource4;
            final boolean z192 = z6;
            final kotlin.jvm.functions.Function2<? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.Unit> function2182 = function29;
            final kotlin.jvm.functions.Function2<? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.Unit> function2192 = function28;
            final kotlin.jvm.functions.Function2<? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.Unit> function2202 = function26;
            final kotlin.jvm.functions.Function2<? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.Unit> function2212 = function27;
            final androidx.compose.material.TextFieldColors textFieldColors42 = textFieldColors2;
            final int i262 = i5;
            final int i272 = i15;
            int i282 = i15 << 12;
            composer2 = startRestartGroup;
            boolean z202 = z9;
            androidx.compose.ui.Modifier modifier52 = modifier3;
            androidx.compose.foundation.text.BasicTextFieldKt.BasicTextField(value, onValueChange, androidx.compose.foundation.layout.SizeKt.m601defaultMinSizeVpY3zN4(m1559indicatorLinegv0btCI, androidx.compose.material.TextFieldDefaults.INSTANCE.m1557getMinWidthD9Ej5fM(), androidx.compose.material.TextFieldDefaults.INSTANCE.m1556getMinHeightD9Ej5fM()), z9, z8, merge2, keyboardOptions3, keyboardActions3, z7, i19, visualTransformation2, (kotlin.jvm.functions.Function1) null, mutableInteractionSource4, new androidx.compose.ui.graphics.SolidColor(textFieldColors2.cursorColor(z6, startRestartGroup, (i15 & 14) | i252).getValue().m2123unboximpl(), null), androidx.compose.runtime.internal.ComposableLambdaKt.composableLambda(startRestartGroup, -1994363936, true, new kotlin.jvm.functions.Function3<kotlin.jvm.functions.Function2<? super androidx.compose.runtime.Composer, ? super java.lang.Integer, ? extends kotlin.Unit>, androidx.compose.runtime.Composer, java.lang.Integer, kotlin.Unit>() { // from class: androidx.compose.material.TextFieldKt$TextField$2
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                /* JADX WARN: Multi-variable type inference failed */
                {
                    super(3);
                }

                @Override // kotlin.jvm.functions.Function3
                public /* bridge */ /* synthetic */ kotlin.Unit invoke(kotlin.jvm.functions.Function2<? super androidx.compose.runtime.Composer, ? super java.lang.Integer, ? extends kotlin.Unit> function222, androidx.compose.runtime.Composer composer3, java.lang.Integer num) {
                    invoke((kotlin.jvm.functions.Function2<? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.Unit>) function222, composer3, num.intValue());
                    return kotlin.Unit.INSTANCE;
                }

                public final void invoke(kotlin.jvm.functions.Function2<? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.Unit> innerTextField, androidx.compose.runtime.Composer composer3, int i29) {
                    int i30;
                    kotlin.jvm.internal.Intrinsics.checkNotNullParameter(innerTextField, "innerTextField");
                    androidx.compose.runtime.ComposerKt.sourceInformation(composer3, "C208@10466L538:TextField.kt#jmzs0o");
                    if ((i29 & 14) == 0) {
                        i30 = i29 | (composer3.changed(innerTextField) ? 4 : 2);
                    } else {
                        i30 = i29;
                    }
                    if ((i30 & 91) != 18 || !composer3.getSkipping()) {
                        androidx.compose.material.TextFieldDefaults textFieldDefaults = androidx.compose.material.TextFieldDefaults.INSTANCE;
                        java.lang.String str = value;
                        boolean z21 = z172;
                        boolean z22 = z182;
                        androidx.compose.ui.text.input.VisualTransformation visualTransformation5 = visualTransformation42;
                        androidx.compose.foundation.interaction.MutableInteractionSource mutableInteractionSource7 = mutableInteractionSource62;
                        boolean z23 = z192;
                        kotlin.jvm.functions.Function2<androidx.compose.runtime.Composer, java.lang.Integer, kotlin.Unit> function222 = function2182;
                        kotlin.jvm.functions.Function2<androidx.compose.runtime.Composer, java.lang.Integer, kotlin.Unit> function223 = function2192;
                        kotlin.jvm.functions.Function2<androidx.compose.runtime.Composer, java.lang.Integer, kotlin.Unit> function224 = function2202;
                        kotlin.jvm.functions.Function2<androidx.compose.runtime.Composer, java.lang.Integer, kotlin.Unit> function225 = function2212;
                        androidx.compose.material.TextFieldColors textFieldColors5 = textFieldColors42;
                        int i31 = i262;
                        int i32 = i272;
                        textFieldDefaults.TextFieldDecorationBox(str, innerTextField, z21, z22, visualTransformation5, mutableInteractionSource7, z23, function222, function223, function224, function225, textFieldColors5, null, composer3, ((i32 >> 3) & 7168) | (i31 & 14) | ((i30 << 3) & 112) | ((i31 >> 3) & 896) | ((i32 << 9) & 57344) | ((i32 >> 3) & 458752) | ((i32 << 18) & 3670016) | ((i31 << 3) & 29360128) | ((i31 << 3) & 234881024) | ((i31 << 3) & 1879048192), ((i31 >> 27) & 14) | 3072 | ((i32 >> 21) & 112), 4096);
                        return;
                    }
                    composer3.skipToGroupEnd();
                }
            }), composer2, (i5 & 57344) | (i5 & 14) | (i5 & 112) | (i5 & 7168) | (i282 & 3670016) | (androidx.compose.foundation.text.KeyboardActions.$stable << 21) | (29360128 & i282) | (234881024 & i282) | (i282 & 1879048192), ((i15 >> 3) & 14) | 24576 | ((i15 >> 12) & 896), 2048);
            z10 = z8;
            function210 = function29;
            function211 = function28;
            function212 = function26;
            function213 = function27;
            visualTransformation3 = visualTransformation2;
            keyboardOptions4 = keyboardOptions3;
            keyboardActions4 = keyboardActions3;
            z11 = z7;
            mutableInteractionSource5 = mutableInteractionSource4;
            textFieldColors3 = textFieldColors2;
            shape3 = shape2;
            z12 = z6;
            textStyle4 = textStyle3;
            z13 = z202;
            modifier4 = modifier52;
            i20 = i19;
            endRestartGroup = composer2.endRestartGroup();
            if (endRestartGroup == null) {
            }
        }
        i6 = i4 & 8;
        int i232 = 2048;
        if (i6 == 0) {
        }
        i7 = i4 & 16;
        if (i7 != 0) {
        }
        if ((i2 & 458752) == 0) {
        }
        i8 = i4 & 64;
        if (i8 != 0) {
        }
        i9 = i4 & 128;
        if (i9 != 0) {
        }
        i10 = i4 & 256;
        if (i10 != 0) {
        }
        i11 = i4 & 512;
        if (i11 != 0) {
        }
        i12 = i4 & 1024;
        if (i12 != 0) {
        }
        i14 = i4 & 2048;
        if (i14 != 0) {
        }
        if ((i3 & 896) == 0) {
        }
        if ((i3 & 7168) == 0) {
        }
        i15 = i13;
        i16 = i4 & 16384;
        if (i16 != 0) {
        }
        i17 = i4 & 32768;
        if (i17 != 0) {
        }
        i18 = i4 & 65536;
        if (i18 != 0) {
        }
        if ((i3 & 29360128) == 0) {
        }
        if ((i3 & 234881024) == 0) {
        }
        if ((i5 & 1533916891) == 306783378) {
        }
        startRestartGroup.startDefaults();
        if ((i2 & 1) != 0) {
        }
        if (i22 != 0) {
        }
        if (i6 != 0) {
        }
        if (i7 != 0) {
        }
        if ((i4 & 32) != 0) {
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
        if ((i4 & 4096) != 0) {
        }
        int i2422 = i5;
        if ((i4 & 8192) != 0) {
        }
        if (i16 != 0) {
        }
        if (i17 != 0) {
        }
        androidx.compose.foundation.text.KeyboardActions keyboardActions522 = keyboardActions2;
        if (i18 != 0) {
        }
        if ((i4 & 131072) != 0) {
        }
        if ((262144 & i4) != 0) {
        }
        function27 = function217;
        visualTransformation2 = none;
        function28 = function215;
        function29 = function214;
        z7 = z16;
        keyboardOptions3 = keyboardOptions2;
        z8 = z15;
        modifier3 = modifier2;
        z9 = z5;
        textStyle3 = textStyle2;
        shape2 = cornerBasedShape;
        i5 = i2422;
        startRestartGroup.endDefaults();
        startRestartGroup.startReplaceableGroup(-833027444);
        androidx.compose.runtime.ComposerKt.sourceInformation(startRestartGroup, "*181@9327L18");
        m3994getColor0d7_KjU = textStyle3.m3994getColor0d7_KjU();
        if (m3994getColor0d7_KjU == androidx.compose.ui.graphics.Color.INSTANCE.m2149getUnspecified0d7_KjU()) {
        }
        startRestartGroup.endReplaceableGroup();
        androidx.compose.ui.text.TextStyle merge22 = textStyle3.merge(new androidx.compose.ui.text.TextStyle(m3994getColor0d7_KjU, 0L, (androidx.compose.ui.text.font.FontWeight) null, (androidx.compose.ui.text.font.FontStyle) null, (androidx.compose.ui.text.font.FontSynthesis) null, (androidx.compose.ui.text.font.FontFamily) null, (java.lang.String) null, 0L, (androidx.compose.ui.text.style.BaselineShift) null, (androidx.compose.ui.text.style.TextGeometricTransform) null, (androidx.compose.ui.text.intl.LocaleList) null, 0L, (androidx.compose.ui.text.style.TextDecoration) null, (androidx.compose.ui.graphics.Shadow) null, (androidx.compose.ui.text.style.TextAlign) null, (androidx.compose.ui.text.style.TextDirection) null, 0L, (androidx.compose.ui.text.style.TextIndent) null, 262142, (kotlin.jvm.internal.DefaultConstructorMarker) null));
        int i2522 = (i15 >> 21) & 112;
        final boolean z1722 = z9;
        m1559indicatorLinegv0btCI = androidx.compose.material.TextFieldDefaults.INSTANCE.m1559indicatorLinegv0btCI(androidx.compose.foundation.BackgroundKt.m211backgroundbw27NRU(modifier3, textFieldColors2.backgroundColor(z9, startRestartGroup, ((i5 >> 9) & 14) | i2522).getValue().m2123unboximpl(), shape2), z1722, z6, mutableInteractionSource4, textFieldColors2, (r17 & 16) != 0 ? androidx.compose.material.TextFieldDefaults.FocusedBorderThickness : 0.0f, (r17 & 32) != 0 ? androidx.compose.material.TextFieldDefaults.UnfocusedBorderThickness : 0.0f);
        final boolean z1822 = z7;
        final androidx.compose.ui.text.input.VisualTransformation visualTransformation422 = visualTransformation2;
        final androidx.compose.foundation.interaction.MutableInteractionSource mutableInteractionSource622 = mutableInteractionSource4;
        final boolean z1922 = z6;
        final kotlin.jvm.functions.Function2<? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.Unit> function21822 = function29;
        final kotlin.jvm.functions.Function2<? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.Unit> function21922 = function28;
        final kotlin.jvm.functions.Function2<? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.Unit> function22022 = function26;
        final kotlin.jvm.functions.Function2<? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.Unit> function22122 = function27;
        final androidx.compose.material.TextFieldColors textFieldColors422 = textFieldColors2;
        final int i2622 = i5;
        final int i2722 = i15;
        int i2822 = i15 << 12;
        composer2 = startRestartGroup;
        boolean z2022 = z9;
        androidx.compose.ui.Modifier modifier522 = modifier3;
        androidx.compose.foundation.text.BasicTextFieldKt.BasicTextField(value, onValueChange, androidx.compose.foundation.layout.SizeKt.m601defaultMinSizeVpY3zN4(m1559indicatorLinegv0btCI, androidx.compose.material.TextFieldDefaults.INSTANCE.m1557getMinWidthD9Ej5fM(), androidx.compose.material.TextFieldDefaults.INSTANCE.m1556getMinHeightD9Ej5fM()), z9, z8, merge22, keyboardOptions3, keyboardActions3, z7, i19, visualTransformation2, (kotlin.jvm.functions.Function1) null, mutableInteractionSource4, new androidx.compose.ui.graphics.SolidColor(textFieldColors2.cursorColor(z6, startRestartGroup, (i15 & 14) | i2522).getValue().m2123unboximpl(), null), androidx.compose.runtime.internal.ComposableLambdaKt.composableLambda(startRestartGroup, -1994363936, true, new kotlin.jvm.functions.Function3<kotlin.jvm.functions.Function2<? super androidx.compose.runtime.Composer, ? super java.lang.Integer, ? extends kotlin.Unit>, androidx.compose.runtime.Composer, java.lang.Integer, kotlin.Unit>() { // from class: androidx.compose.material.TextFieldKt$TextField$2
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            {
                super(3);
            }

            @Override // kotlin.jvm.functions.Function3
            public /* bridge */ /* synthetic */ kotlin.Unit invoke(kotlin.jvm.functions.Function2<? super androidx.compose.runtime.Composer, ? super java.lang.Integer, ? extends kotlin.Unit> function222, androidx.compose.runtime.Composer composer3, java.lang.Integer num) {
                invoke((kotlin.jvm.functions.Function2<? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.Unit>) function222, composer3, num.intValue());
                return kotlin.Unit.INSTANCE;
            }

            public final void invoke(kotlin.jvm.functions.Function2<? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.Unit> innerTextField, androidx.compose.runtime.Composer composer3, int i29) {
                int i30;
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(innerTextField, "innerTextField");
                androidx.compose.runtime.ComposerKt.sourceInformation(composer3, "C208@10466L538:TextField.kt#jmzs0o");
                if ((i29 & 14) == 0) {
                    i30 = i29 | (composer3.changed(innerTextField) ? 4 : 2);
                } else {
                    i30 = i29;
                }
                if ((i30 & 91) != 18 || !composer3.getSkipping()) {
                    androidx.compose.material.TextFieldDefaults textFieldDefaults = androidx.compose.material.TextFieldDefaults.INSTANCE;
                    java.lang.String str = value;
                    boolean z21 = z1722;
                    boolean z22 = z1822;
                    androidx.compose.ui.text.input.VisualTransformation visualTransformation5 = visualTransformation422;
                    androidx.compose.foundation.interaction.MutableInteractionSource mutableInteractionSource7 = mutableInteractionSource622;
                    boolean z23 = z1922;
                    kotlin.jvm.functions.Function2<androidx.compose.runtime.Composer, java.lang.Integer, kotlin.Unit> function222 = function21822;
                    kotlin.jvm.functions.Function2<androidx.compose.runtime.Composer, java.lang.Integer, kotlin.Unit> function223 = function21922;
                    kotlin.jvm.functions.Function2<androidx.compose.runtime.Composer, java.lang.Integer, kotlin.Unit> function224 = function22022;
                    kotlin.jvm.functions.Function2<androidx.compose.runtime.Composer, java.lang.Integer, kotlin.Unit> function225 = function22122;
                    androidx.compose.material.TextFieldColors textFieldColors5 = textFieldColors422;
                    int i31 = i2622;
                    int i32 = i2722;
                    textFieldDefaults.TextFieldDecorationBox(str, innerTextField, z21, z22, visualTransformation5, mutableInteractionSource7, z23, function222, function223, function224, function225, textFieldColors5, null, composer3, ((i32 >> 3) & 7168) | (i31 & 14) | ((i30 << 3) & 112) | ((i31 >> 3) & 896) | ((i32 << 9) & 57344) | ((i32 >> 3) & 458752) | ((i32 << 18) & 3670016) | ((i31 << 3) & 29360128) | ((i31 << 3) & 234881024) | ((i31 << 3) & 1879048192), ((i31 >> 27) & 14) | 3072 | ((i32 >> 21) & 112), 4096);
                    return;
                }
                composer3.skipToGroupEnd();
            }
        }), composer2, (i5 & 57344) | (i5 & 14) | (i5 & 112) | (i5 & 7168) | (i2822 & 3670016) | (androidx.compose.foundation.text.KeyboardActions.$stable << 21) | (29360128 & i2822) | (234881024 & i2822) | (i2822 & 1879048192), ((i15 >> 3) & 14) | 24576 | ((i15 >> 12) & 896), 2048);
        z10 = z8;
        function210 = function29;
        function211 = function28;
        function212 = function26;
        function213 = function27;
        visualTransformation3 = visualTransformation2;
        keyboardOptions4 = keyboardOptions3;
        keyboardActions4 = keyboardActions3;
        z11 = z7;
        mutableInteractionSource5 = mutableInteractionSource4;
        textFieldColors3 = textFieldColors2;
        shape3 = shape2;
        z12 = z6;
        textStyle4 = textStyle3;
        z13 = z2022;
        modifier4 = modifier522;
        i20 = i19;
        endRestartGroup = composer2.endRestartGroup();
        if (endRestartGroup == null) {
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:57:0x01b6, code lost:
    
        if (r7.changed(r81) == false) goto L145;
     */
    /* JADX WARN: Removed duplicated region for block: B:100:0x02a3  */
    /* JADX WARN: Removed duplicated region for block: B:120:0x047e  */
    /* JADX WARN: Removed duplicated region for block: B:123:0x02f8  */
    /* JADX WARN: Removed duplicated region for block: B:125:0x0301  */
    /* JADX WARN: Removed duplicated region for block: B:127:0x0307  */
    /* JADX WARN: Removed duplicated region for block: B:130:0x030f  */
    /* JADX WARN: Removed duplicated region for block: B:132:0x0339  */
    /* JADX WARN: Removed duplicated region for block: B:134:0x033f  */
    /* JADX WARN: Removed duplicated region for block: B:136:0x0345  */
    /* JADX WARN: Removed duplicated region for block: B:138:0x034b  */
    /* JADX WARN: Removed duplicated region for block: B:13:0x0075  */
    /* JADX WARN: Removed duplicated region for block: B:140:0x0351  */
    /* JADX WARN: Removed duplicated region for block: B:142:0x0357  */
    /* JADX WARN: Removed duplicated region for block: B:145:0x0364  */
    /* JADX WARN: Removed duplicated region for block: B:148:0x0375  */
    /* JADX WARN: Removed duplicated region for block: B:150:0x03a3  */
    /* JADX WARN: Removed duplicated region for block: B:152:0x03a9  */
    /* JADX WARN: Removed duplicated region for block: B:155:0x03b6  */
    /* JADX WARN: Removed duplicated region for block: B:161:0x03e4  */
    /* JADX WARN: Removed duplicated region for block: B:164:0x03fc  */
    /* JADX WARN: Removed duplicated region for block: B:166:0x0443  */
    /* JADX WARN: Removed duplicated region for block: B:167:0x03f3  */
    /* JADX WARN: Removed duplicated region for block: B:168:0x03dc  */
    /* JADX WARN: Removed duplicated region for block: B:169:0x03b0  */
    /* JADX WARN: Removed duplicated region for block: B:170:0x03a5  */
    /* JADX WARN: Removed duplicated region for block: B:171:0x039f  */
    /* JADX WARN: Removed duplicated region for block: B:172:0x036d  */
    /* JADX WARN: Removed duplicated region for block: B:173:0x035e  */
    /* JADX WARN: Removed duplicated region for block: B:174:0x0353  */
    /* JADX WARN: Removed duplicated region for block: B:175:0x034d  */
    /* JADX WARN: Removed duplicated region for block: B:176:0x0347  */
    /* JADX WARN: Removed duplicated region for block: B:177:0x0341  */
    /* JADX WARN: Removed duplicated region for block: B:178:0x033b  */
    /* JADX WARN: Removed duplicated region for block: B:179:0x0331  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0099  */
    /* JADX WARN: Removed duplicated region for block: B:180:0x0309  */
    /* JADX WARN: Removed duplicated region for block: B:181:0x0303  */
    /* JADX WARN: Removed duplicated region for block: B:182:0x02fd  */
    /* JADX WARN: Removed duplicated region for block: B:184:0x0257  */
    /* JADX WARN: Removed duplicated region for block: B:186:0x0239  */
    /* JADX WARN: Removed duplicated region for block: B:187:0x020c  */
    /* JADX WARN: Removed duplicated region for block: B:194:0x01ec  */
    /* JADX WARN: Removed duplicated region for block: B:201:0x01cd  */
    /* JADX WARN: Removed duplicated region for block: B:208:0x01c0  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x00bb  */
    /* JADX WARN: Removed duplicated region for block: B:211:0x01a6  */
    /* JADX WARN: Removed duplicated region for block: B:212:0x0179  */
    /* JADX WARN: Removed duplicated region for block: B:219:0x015a  */
    /* JADX WARN: Removed duplicated region for block: B:227:0x013c  */
    /* JADX WARN: Removed duplicated region for block: B:234:0x011c  */
    /* JADX WARN: Removed duplicated region for block: B:241:0x00fc  */
    /* JADX WARN: Removed duplicated region for block: B:248:0x00de  */
    /* JADX WARN: Removed duplicated region for block: B:256:0x00cf  */
    /* JADX WARN: Removed duplicated region for block: B:257:0x009e  */
    /* JADX WARN: Removed duplicated region for block: B:264:0x0078  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x00d7  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x00f5  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0115  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0135  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x0155  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x0174  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x0190  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x01ac  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x01c8  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x01e5  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x0205  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x0225  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x0241  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x0263  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x05e7  */
    /* JADX WARN: Removed duplicated region for block: B:97:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void TextField(final androidx.compose.ui.text.input.TextFieldValue value, final kotlin.jvm.functions.Function1<? super androidx.compose.ui.text.input.TextFieldValue, kotlin.Unit> onValueChange, androidx.compose.ui.Modifier modifier, boolean z, boolean z2, androidx.compose.ui.text.TextStyle textStyle, kotlin.jvm.functions.Function2<? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.Unit> function2, kotlin.jvm.functions.Function2<? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.Unit> function22, kotlin.jvm.functions.Function2<? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.Unit> function23, kotlin.jvm.functions.Function2<? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.Unit> function24, boolean z3, androidx.compose.ui.text.input.VisualTransformation visualTransformation, androidx.compose.foundation.text.KeyboardOptions keyboardOptions, androidx.compose.foundation.text.KeyboardActions keyboardActions, boolean z4, int i, androidx.compose.foundation.interaction.MutableInteractionSource mutableInteractionSource, androidx.compose.ui.graphics.Shape shape, androidx.compose.material.TextFieldColors textFieldColors, androidx.compose.runtime.Composer composer, final int i2, final int i3, final int i4) {
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
        androidx.compose.ui.Modifier modifier2;
        boolean z5;
        androidx.compose.ui.text.TextStyle textStyle2;
        boolean z6;
        androidx.compose.foundation.text.KeyboardOptions keyboardOptions2;
        androidx.compose.foundation.text.KeyboardActions keyboardActions2;
        int i19;
        kotlin.jvm.functions.Function2<? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.Unit> function25;
        androidx.compose.foundation.interaction.MutableInteractionSource mutableInteractionSource2;
        androidx.compose.foundation.interaction.MutableInteractionSource mutableInteractionSource3;
        androidx.compose.ui.graphics.Shape shape2;
        androidx.compose.foundation.text.KeyboardActions keyboardActions3;
        kotlin.jvm.functions.Function2<? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.Unit> function26;
        androidx.compose.foundation.interaction.MutableInteractionSource mutableInteractionSource4;
        androidx.compose.material.TextFieldColors textFieldColors2;
        kotlin.jvm.functions.Function2<? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.Unit> function27;
        androidx.compose.ui.text.input.VisualTransformation visualTransformation2;
        kotlin.jvm.functions.Function2<? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.Unit> function28;
        kotlin.jvm.functions.Function2<? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.Unit> function29;
        boolean z7;
        androidx.compose.foundation.text.KeyboardOptions keyboardOptions3;
        boolean z8;
        androidx.compose.ui.Modifier modifier3;
        boolean z9;
        androidx.compose.ui.text.TextStyle textStyle3;
        androidx.compose.ui.graphics.Shape shape3;
        long m3994getColor0d7_KjU;
        androidx.compose.ui.Modifier m1559indicatorLinegv0btCI;
        androidx.compose.runtime.Composer composer2;
        final boolean z10;
        final kotlin.jvm.functions.Function2<? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.Unit> function210;
        final kotlin.jvm.functions.Function2<? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.Unit> function211;
        final kotlin.jvm.functions.Function2<? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.Unit> function212;
        final kotlin.jvm.functions.Function2<? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.Unit> function213;
        final androidx.compose.ui.text.input.VisualTransformation visualTransformation3;
        final androidx.compose.foundation.text.KeyboardOptions keyboardOptions4;
        final androidx.compose.foundation.text.KeyboardActions keyboardActions4;
        final boolean z11;
        final androidx.compose.foundation.interaction.MutableInteractionSource mutableInteractionSource5;
        final androidx.compose.material.TextFieldColors textFieldColors3;
        final androidx.compose.ui.graphics.Shape shape4;
        final boolean z12;
        final androidx.compose.ui.text.TextStyle textStyle4;
        final boolean z13;
        final androidx.compose.ui.Modifier modifier4;
        final int i20;
        androidx.compose.runtime.ScopeUpdateScope endRestartGroup;
        int i21;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(value, "value");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(onValueChange, "onValueChange");
        androidx.compose.runtime.Composer startRestartGroup = composer.startRestartGroup(-1576622884);
        androidx.compose.runtime.ComposerKt.sourceInformation(startRestartGroup, "C(TextField)P(17,10,9,1,12,15,6,11,7,16,3,18,5,4,14,8,2,13)298@15761L7,309@16315L39,310@16393L14,311@16457L17,323@16875L24,333@17313L20,320@16777L1547:TextField.kt#jmzs0o");
        if ((i4 & 1) != 0) {
            i5 = i2 | 6;
        } else if ((i2 & 14) == 0) {
            i5 = (startRestartGroup.changed(value) ? 4 : 2) | i2;
        } else {
            i5 = i2;
        }
        if ((i4 & 2) != 0) {
            i5 |= 48;
        } else if ((i2 & 112) == 0) {
            i5 |= startRestartGroup.changed(onValueChange) ? 32 : 16;
        }
        int i22 = i4 & 4;
        if (i22 != 0) {
            i5 |= 384;
        } else if ((i2 & 896) == 0) {
            i5 |= startRestartGroup.changed(modifier) ? 256 : 128;
            i6 = i4 & 8;
            int i23 = 2048;
            if (i6 == 0) {
                i5 |= 3072;
            } else if ((i2 & 7168) == 0) {
                i5 |= startRestartGroup.changed(z) ? 2048 : 1024;
                i7 = i4 & 16;
                if (i7 != 0) {
                    i5 |= 24576;
                } else if ((i2 & 57344) == 0) {
                    i5 |= startRestartGroup.changed(z2) ? 16384 : 8192;
                }
                if ((i2 & 458752) == 0) {
                    i5 |= ((i4 & 32) == 0 && startRestartGroup.changed(textStyle)) ? 131072 : 65536;
                }
                i8 = i4 & 64;
                if (i8 != 0) {
                    i5 |= 1572864;
                } else if ((i2 & 3670016) == 0) {
                    i5 |= startRestartGroup.changed(function2) ? 1048576 : 524288;
                }
                i9 = i4 & 128;
                if (i9 != 0) {
                    i5 |= 12582912;
                } else if ((i2 & 29360128) == 0) {
                    i5 |= startRestartGroup.changed(function22) ? 8388608 : 4194304;
                }
                i10 = i4 & 256;
                if (i10 != 0) {
                    i5 |= 100663296;
                } else if ((i2 & 234881024) == 0) {
                    i5 |= startRestartGroup.changed(function23) ? androidx.core.view.accessibility.AccessibilityEventCompat.TYPE_VIEW_TARGETED_BY_SCROLL : 33554432;
                }
                i11 = i4 & 512;
                if (i11 != 0) {
                    i5 |= 805306368;
                } else if ((i2 & 1879048192) == 0) {
                    i5 |= startRestartGroup.changed(function24) ? 536870912 : 268435456;
                }
                i12 = i4 & 1024;
                if (i12 != 0) {
                    i13 = i3 | 6;
                } else if ((i3 & 14) == 0) {
                    i13 = i3 | (startRestartGroup.changed(z3) ? 4 : 2);
                } else {
                    i13 = i3;
                }
                i14 = i4 & 2048;
                if (i14 != 0) {
                    i13 |= 48;
                } else if ((i3 & 112) == 0) {
                    i13 |= startRestartGroup.changed(visualTransformation) ? 32 : 16;
                }
                if ((i3 & 896) == 0) {
                    if ((i4 & 4096) == 0 && startRestartGroup.changed(keyboardOptions)) {
                        i21 = 256;
                        i13 |= i21;
                    }
                    i21 = 128;
                    i13 |= i21;
                }
                if ((i3 & 7168) == 0) {
                    if ((i4 & 8192) != 0) {
                    }
                    i23 = 1024;
                    i13 |= i23;
                }
                i15 = i13;
                i16 = i4 & 16384;
                if (i16 != 0) {
                    i15 |= 24576;
                } else if ((i3 & 57344) == 0) {
                    i15 |= startRestartGroup.changed(z4) ? 16384 : 8192;
                }
                i17 = i4 & 32768;
                if (i17 != 0) {
                    i15 |= androidx.profileinstaller.ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE;
                } else if ((i3 & 458752) == 0) {
                    i15 |= startRestartGroup.changed(i) ? 131072 : 65536;
                }
                i18 = i4 & 65536;
                if (i18 != 0) {
                    i15 |= 1572864;
                } else if ((i3 & 3670016) == 0) {
                    i15 |= startRestartGroup.changed(mutableInteractionSource) ? 1048576 : 524288;
                }
                if ((i3 & 29360128) == 0) {
                    i15 |= ((i4 & 131072) == 0 && startRestartGroup.changed(shape)) ? 8388608 : 4194304;
                }
                if ((i3 & 234881024) == 0) {
                    i15 |= ((i4 & 262144) == 0 && startRestartGroup.changed(textFieldColors)) ? androidx.core.view.accessibility.AccessibilityEventCompat.TYPE_VIEW_TARGETED_BY_SCROLL : 33554432;
                }
                if ((i5 & 1533916891) == 306783378 || (191739611 & i15) != 38347922 || !startRestartGroup.getSkipping()) {
                    startRestartGroup.startDefaults();
                    if ((i2 & 1) != 0 || startRestartGroup.getDefaultsInvalid()) {
                        androidx.compose.ui.Modifier.Companion companion = i22 != 0 ? androidx.compose.ui.Modifier.INSTANCE : modifier;
                        boolean z14 = i6 != 0 ? true : z;
                        boolean z15 = i7 != 0 ? false : z2;
                        if ((i4 & 32) != 0) {
                            androidx.compose.runtime.ProvidableCompositionLocal<androidx.compose.ui.text.TextStyle> localTextStyle = androidx.compose.material.TextKt.getLocalTextStyle();
                            modifier2 = companion;
                            z5 = z14;
                            androidx.compose.runtime.ComposerKt.sourceInformationMarkerStart(startRestartGroup, 2023513938, "C:CompositionLocal.kt#9igjgp");
                            java.lang.Object consume = startRestartGroup.consume(localTextStyle);
                            androidx.compose.runtime.ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                            textStyle2 = (androidx.compose.ui.text.TextStyle) consume;
                            i5 &= -458753;
                        } else {
                            modifier2 = companion;
                            z5 = z14;
                            textStyle2 = textStyle;
                        }
                        kotlin.jvm.functions.Function2<? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.Unit> function214 = i8 != 0 ? null : function2;
                        kotlin.jvm.functions.Function2<? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.Unit> function215 = i9 != 0 ? null : function22;
                        kotlin.jvm.functions.Function2<? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.Unit> function216 = i10 != 0 ? null : function23;
                        kotlin.jvm.functions.Function2<? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.Unit> function217 = i11 != 0 ? null : function24;
                        z6 = i12 != 0 ? false : z3;
                        androidx.compose.ui.text.input.VisualTransformation none = i14 != 0 ? androidx.compose.ui.text.input.VisualTransformation.INSTANCE.getNone() : visualTransformation;
                        if ((i4 & 4096) != 0) {
                            keyboardOptions2 = androidx.compose.foundation.text.KeyboardOptions.INSTANCE.getDefault();
                            i15 &= -897;
                        } else {
                            keyboardOptions2 = keyboardOptions;
                        }
                        int i24 = i5;
                        if ((i4 & 8192) != 0) {
                            keyboardActions2 = new androidx.compose.foundation.text.KeyboardActions(null, null, null, null, null, null, 63, null);
                            i15 &= -7169;
                        } else {
                            keyboardActions2 = keyboardActions;
                        }
                        boolean z16 = i16 != 0 ? false : z4;
                        i19 = i17 != 0 ? Integer.MAX_VALUE : i;
                        androidx.compose.foundation.text.KeyboardActions keyboardActions5 = keyboardActions2;
                        if (i18 != 0) {
                            startRestartGroup.startReplaceableGroup(-492369756);
                            androidx.compose.runtime.ComposerKt.sourceInformation(startRestartGroup, "C(remember):Composables.kt#9igjgp");
                            java.lang.Object rememberedValue = startRestartGroup.rememberedValue();
                            function25 = function216;
                            if (rememberedValue == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                                rememberedValue = androidx.compose.foundation.interaction.InteractionSourceKt.MutableInteractionSource();
                                startRestartGroup.updateRememberedValue(rememberedValue);
                            }
                            startRestartGroup.endReplaceableGroup();
                            mutableInteractionSource2 = (androidx.compose.foundation.interaction.MutableInteractionSource) rememberedValue;
                        } else {
                            function25 = function216;
                            mutableInteractionSource2 = mutableInteractionSource;
                        }
                        if ((i4 & 131072) != 0) {
                            mutableInteractionSource3 = mutableInteractionSource2;
                            shape2 = androidx.compose.material.TextFieldDefaults.INSTANCE.getTextFieldShape(startRestartGroup, 6);
                            i15 = (-29360129) & i15;
                        } else {
                            mutableInteractionSource3 = mutableInteractionSource2;
                            shape2 = shape;
                        }
                        if ((262144 & i4) != 0) {
                            textFieldColors2 = androidx.compose.material.TextFieldDefaults.INSTANCE.m1562textFieldColorsdx8h9Zs(0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, startRestartGroup, 0, 0, 48, 2097151);
                            i15 &= -234881025;
                            keyboardActions3 = keyboardActions5;
                            function26 = function25;
                            mutableInteractionSource4 = mutableInteractionSource3;
                        } else {
                            keyboardActions3 = keyboardActions5;
                            function26 = function25;
                            mutableInteractionSource4 = mutableInteractionSource3;
                            textFieldColors2 = textFieldColors;
                        }
                        function27 = function217;
                        visualTransformation2 = none;
                        function28 = function215;
                        function29 = function214;
                        z7 = z16;
                        keyboardOptions3 = keyboardOptions2;
                        z8 = z15;
                        modifier3 = modifier2;
                        z9 = z5;
                        textStyle3 = textStyle2;
                        shape3 = shape2;
                        i5 = i24;
                    } else {
                        startRestartGroup.skipToGroupEnd();
                        if ((i4 & 32) != 0) {
                            i5 &= -458753;
                        }
                        if ((i4 & 4096) != 0) {
                            i15 &= -897;
                        }
                        if ((i4 & 8192) != 0) {
                            i15 &= -7169;
                        }
                        if ((i4 & 131072) != 0) {
                            i15 &= -29360129;
                        }
                        if ((262144 & i4) != 0) {
                            i15 &= -234881025;
                        }
                        modifier3 = modifier;
                        z9 = z;
                        z8 = z2;
                        textStyle3 = textStyle;
                        function29 = function2;
                        function28 = function22;
                        function26 = function23;
                        function27 = function24;
                        z6 = z3;
                        visualTransformation2 = visualTransformation;
                        keyboardOptions3 = keyboardOptions;
                        keyboardActions3 = keyboardActions;
                        z7 = z4;
                        i19 = i;
                        mutableInteractionSource4 = mutableInteractionSource;
                        shape3 = shape;
                        textFieldColors2 = textFieldColors;
                    }
                    startRestartGroup.endDefaults();
                    startRestartGroup.startReplaceableGroup(-833020145);
                    androidx.compose.runtime.ComposerKt.sourceInformation(startRestartGroup, "*315@16626L18");
                    m3994getColor0d7_KjU = textStyle3.m3994getColor0d7_KjU();
                    if (m3994getColor0d7_KjU == androidx.compose.ui.graphics.Color.INSTANCE.m2149getUnspecified0d7_KjU()) {
                        m3994getColor0d7_KjU = textFieldColors2.textColor(z9, startRestartGroup, ((i5 >> 9) & 14) | ((i15 >> 21) & 112)).getValue().m2123unboximpl();
                    }
                    startRestartGroup.endReplaceableGroup();
                    androidx.compose.ui.text.TextStyle merge = textStyle3.merge(new androidx.compose.ui.text.TextStyle(m3994getColor0d7_KjU, 0L, (androidx.compose.ui.text.font.FontWeight) null, (androidx.compose.ui.text.font.FontStyle) null, (androidx.compose.ui.text.font.FontSynthesis) null, (androidx.compose.ui.text.font.FontFamily) null, (java.lang.String) null, 0L, (androidx.compose.ui.text.style.BaselineShift) null, (androidx.compose.ui.text.style.TextGeometricTransform) null, (androidx.compose.ui.text.intl.LocaleList) null, 0L, (androidx.compose.ui.text.style.TextDecoration) null, (androidx.compose.ui.graphics.Shadow) null, (androidx.compose.ui.text.style.TextAlign) null, (androidx.compose.ui.text.style.TextDirection) null, 0L, (androidx.compose.ui.text.style.TextIndent) null, 262142, (kotlin.jvm.internal.DefaultConstructorMarker) null));
                    int i25 = (i15 >> 21) & 112;
                    final boolean z17 = z9;
                    m1559indicatorLinegv0btCI = androidx.compose.material.TextFieldDefaults.INSTANCE.m1559indicatorLinegv0btCI(androidx.compose.foundation.BackgroundKt.m211backgroundbw27NRU(modifier3, textFieldColors2.backgroundColor(z9, startRestartGroup, ((i5 >> 9) & 14) | i25).getValue().m2123unboximpl(), shape3), z17, z6, mutableInteractionSource4, textFieldColors2, (r17 & 16) != 0 ? androidx.compose.material.TextFieldDefaults.FocusedBorderThickness : 0.0f, (r17 & 32) != 0 ? androidx.compose.material.TextFieldDefaults.UnfocusedBorderThickness : 0.0f);
                    final boolean z18 = z7;
                    final androidx.compose.ui.text.input.VisualTransformation visualTransformation4 = visualTransformation2;
                    final androidx.compose.foundation.interaction.MutableInteractionSource mutableInteractionSource6 = mutableInteractionSource4;
                    final boolean z19 = z6;
                    final kotlin.jvm.functions.Function2<? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.Unit> function218 = function29;
                    final kotlin.jvm.functions.Function2<? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.Unit> function219 = function28;
                    final kotlin.jvm.functions.Function2<? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.Unit> function220 = function26;
                    final kotlin.jvm.functions.Function2<? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.Unit> function221 = function27;
                    final androidx.compose.material.TextFieldColors textFieldColors4 = textFieldColors2;
                    final int i26 = i5;
                    final int i27 = i15;
                    int i28 = i15 << 12;
                    composer2 = startRestartGroup;
                    boolean z20 = z9;
                    androidx.compose.ui.Modifier modifier5 = modifier3;
                    androidx.compose.foundation.text.BasicTextFieldKt.BasicTextField(value, onValueChange, androidx.compose.foundation.layout.SizeKt.m601defaultMinSizeVpY3zN4(m1559indicatorLinegv0btCI, androidx.compose.material.TextFieldDefaults.INSTANCE.m1557getMinWidthD9Ej5fM(), androidx.compose.material.TextFieldDefaults.INSTANCE.m1556getMinHeightD9Ej5fM()), z9, z8, merge, keyboardOptions3, keyboardActions3, z7, i19, visualTransformation2, (kotlin.jvm.functions.Function1) null, mutableInteractionSource4, new androidx.compose.ui.graphics.SolidColor(textFieldColors2.cursorColor(z6, startRestartGroup, (i15 & 14) | i25).getValue().m2123unboximpl(), null), androidx.compose.runtime.internal.ComposableLambdaKt.composableLambda(startRestartGroup, -2078585677, true, new kotlin.jvm.functions.Function3<kotlin.jvm.functions.Function2<? super androidx.compose.runtime.Composer, ? super java.lang.Integer, ? extends kotlin.Unit>, androidx.compose.runtime.Composer, java.lang.Integer, kotlin.Unit>() { // from class: androidx.compose.material.TextFieldKt$TextField$5
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        /* JADX WARN: Multi-variable type inference failed */
                        {
                            super(3);
                        }

                        @Override // kotlin.jvm.functions.Function3
                        public /* bridge */ /* synthetic */ kotlin.Unit invoke(kotlin.jvm.functions.Function2<? super androidx.compose.runtime.Composer, ? super java.lang.Integer, ? extends kotlin.Unit> function222, androidx.compose.runtime.Composer composer3, java.lang.Integer num) {
                            invoke((kotlin.jvm.functions.Function2<? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.Unit>) function222, composer3, num.intValue());
                            return kotlin.Unit.INSTANCE;
                        }

                        public final void invoke(kotlin.jvm.functions.Function2<? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.Unit> innerTextField, androidx.compose.runtime.Composer composer3, int i29) {
                            int i30;
                            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(innerTextField, "innerTextField");
                            androidx.compose.runtime.ComposerKt.sourceInformation(composer3, "C342@17765L543:TextField.kt#jmzs0o");
                            if ((i29 & 14) == 0) {
                                i30 = i29 | (composer3.changed(innerTextField) ? 4 : 2);
                            } else {
                                i30 = i29;
                            }
                            if ((i30 & 91) != 18 || !composer3.getSkipping()) {
                                androidx.compose.material.TextFieldDefaults textFieldDefaults = androidx.compose.material.TextFieldDefaults.INSTANCE;
                                java.lang.String text = androidx.compose.ui.text.input.TextFieldValue.this.getText();
                                boolean z21 = z17;
                                boolean z22 = z18;
                                androidx.compose.ui.text.input.VisualTransformation visualTransformation5 = visualTransformation4;
                                androidx.compose.foundation.interaction.MutableInteractionSource mutableInteractionSource7 = mutableInteractionSource6;
                                boolean z23 = z19;
                                kotlin.jvm.functions.Function2<androidx.compose.runtime.Composer, java.lang.Integer, kotlin.Unit> function222 = function218;
                                kotlin.jvm.functions.Function2<androidx.compose.runtime.Composer, java.lang.Integer, kotlin.Unit> function223 = function219;
                                kotlin.jvm.functions.Function2<androidx.compose.runtime.Composer, java.lang.Integer, kotlin.Unit> function224 = function220;
                                kotlin.jvm.functions.Function2<androidx.compose.runtime.Composer, java.lang.Integer, kotlin.Unit> function225 = function221;
                                androidx.compose.material.TextFieldColors textFieldColors5 = textFieldColors4;
                                int i31 = i26;
                                int i32 = i27;
                                textFieldDefaults.TextFieldDecorationBox(text, innerTextField, z21, z22, visualTransformation5, mutableInteractionSource7, z23, function222, function223, function224, function225, textFieldColors5, null, composer3, ((i32 >> 3) & 7168) | ((i30 << 3) & 112) | ((i31 >> 3) & 896) | ((i32 << 9) & 57344) | ((i32 >> 3) & 458752) | ((i32 << 18) & 3670016) | ((i31 << 3) & 29360128) | ((i31 << 3) & 234881024) | ((i31 << 3) & 1879048192), ((i31 >> 27) & 14) | 3072 | ((i32 >> 21) & 112), 4096);
                                return;
                            }
                            composer3.skipToGroupEnd();
                        }
                    }), composer2, (i5 & 57344) | (i5 & 14) | (i5 & 112) | (i5 & 7168) | (i28 & 3670016) | (androidx.compose.foundation.text.KeyboardActions.$stable << 21) | (29360128 & i28) | (234881024 & i28) | (i28 & 1879048192), ((i15 >> 3) & 14) | 24576 | ((i15 >> 12) & 896), 2048);
                    z10 = z8;
                    function210 = function29;
                    function211 = function28;
                    function212 = function26;
                    function213 = function27;
                    visualTransformation3 = visualTransformation2;
                    keyboardOptions4 = keyboardOptions3;
                    keyboardActions4 = keyboardActions3;
                    z11 = z7;
                    mutableInteractionSource5 = mutableInteractionSource4;
                    textFieldColors3 = textFieldColors2;
                    shape4 = shape3;
                    z12 = z6;
                    textStyle4 = textStyle3;
                    z13 = z20;
                    modifier4 = modifier5;
                    i20 = i19;
                } else {
                    startRestartGroup.skipToGroupEnd();
                    modifier4 = modifier;
                    z13 = z;
                    z10 = z2;
                    textStyle4 = textStyle;
                    function211 = function22;
                    function212 = function23;
                    function213 = function24;
                    z12 = z3;
                    visualTransformation3 = visualTransformation;
                    keyboardOptions4 = keyboardOptions;
                    keyboardActions4 = keyboardActions;
                    z11 = z4;
                    i20 = i;
                    mutableInteractionSource5 = mutableInteractionSource;
                    shape4 = shape;
                    textFieldColors3 = textFieldColors;
                    composer2 = startRestartGroup;
                    function210 = function2;
                }
                endRestartGroup = composer2.endRestartGroup();
                if (endRestartGroup == null) {
                    return;
                }
                endRestartGroup.updateScope(new kotlin.jvm.functions.Function2<androidx.compose.runtime.Composer, java.lang.Integer, kotlin.Unit>() { // from class: androidx.compose.material.TextFieldKt$TextField$6
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

                    public final void invoke(androidx.compose.runtime.Composer composer3, int i29) {
                        androidx.compose.material.TextFieldKt.TextField(androidx.compose.ui.text.input.TextFieldValue.this, onValueChange, modifier4, z13, z10, textStyle4, function210, function211, function212, function213, z12, visualTransformation3, keyboardOptions4, keyboardActions4, z11, i20, mutableInteractionSource5, shape4, textFieldColors3, composer3, i2 | 1, i3, i4);
                    }
                });
                return;
            }
            i7 = i4 & 16;
            if (i7 != 0) {
            }
            if ((i2 & 458752) == 0) {
            }
            i8 = i4 & 64;
            if (i8 != 0) {
            }
            i9 = i4 & 128;
            if (i9 != 0) {
            }
            i10 = i4 & 256;
            if (i10 != 0) {
            }
            i11 = i4 & 512;
            if (i11 != 0) {
            }
            i12 = i4 & 1024;
            if (i12 != 0) {
            }
            i14 = i4 & 2048;
            if (i14 != 0) {
            }
            if ((i3 & 896) == 0) {
            }
            if ((i3 & 7168) == 0) {
            }
            i15 = i13;
            i16 = i4 & 16384;
            if (i16 != 0) {
            }
            i17 = i4 & 32768;
            if (i17 != 0) {
            }
            i18 = i4 & 65536;
            if (i18 != 0) {
            }
            if ((i3 & 29360128) == 0) {
            }
            if ((i3 & 234881024) == 0) {
            }
            if ((i5 & 1533916891) == 306783378) {
            }
            startRestartGroup.startDefaults();
            if ((i2 & 1) != 0) {
            }
            if (i22 != 0) {
            }
            if (i6 != 0) {
            }
            if (i7 != 0) {
            }
            if ((i4 & 32) != 0) {
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
            if ((i4 & 4096) != 0) {
            }
            int i242 = i5;
            if ((i4 & 8192) != 0) {
            }
            if (i16 != 0) {
            }
            if (i17 != 0) {
            }
            androidx.compose.foundation.text.KeyboardActions keyboardActions52 = keyboardActions2;
            if (i18 != 0) {
            }
            if ((i4 & 131072) != 0) {
            }
            if ((262144 & i4) != 0) {
            }
            function27 = function217;
            visualTransformation2 = none;
            function28 = function215;
            function29 = function214;
            z7 = z16;
            keyboardOptions3 = keyboardOptions2;
            z8 = z15;
            modifier3 = modifier2;
            z9 = z5;
            textStyle3 = textStyle2;
            shape3 = shape2;
            i5 = i242;
            startRestartGroup.endDefaults();
            startRestartGroup.startReplaceableGroup(-833020145);
            androidx.compose.runtime.ComposerKt.sourceInformation(startRestartGroup, "*315@16626L18");
            m3994getColor0d7_KjU = textStyle3.m3994getColor0d7_KjU();
            if (m3994getColor0d7_KjU == androidx.compose.ui.graphics.Color.INSTANCE.m2149getUnspecified0d7_KjU()) {
            }
            startRestartGroup.endReplaceableGroup();
            androidx.compose.ui.text.TextStyle merge2 = textStyle3.merge(new androidx.compose.ui.text.TextStyle(m3994getColor0d7_KjU, 0L, (androidx.compose.ui.text.font.FontWeight) null, (androidx.compose.ui.text.font.FontStyle) null, (androidx.compose.ui.text.font.FontSynthesis) null, (androidx.compose.ui.text.font.FontFamily) null, (java.lang.String) null, 0L, (androidx.compose.ui.text.style.BaselineShift) null, (androidx.compose.ui.text.style.TextGeometricTransform) null, (androidx.compose.ui.text.intl.LocaleList) null, 0L, (androidx.compose.ui.text.style.TextDecoration) null, (androidx.compose.ui.graphics.Shadow) null, (androidx.compose.ui.text.style.TextAlign) null, (androidx.compose.ui.text.style.TextDirection) null, 0L, (androidx.compose.ui.text.style.TextIndent) null, 262142, (kotlin.jvm.internal.DefaultConstructorMarker) null));
            int i252 = (i15 >> 21) & 112;
            final boolean z172 = z9;
            m1559indicatorLinegv0btCI = androidx.compose.material.TextFieldDefaults.INSTANCE.m1559indicatorLinegv0btCI(androidx.compose.foundation.BackgroundKt.m211backgroundbw27NRU(modifier3, textFieldColors2.backgroundColor(z9, startRestartGroup, ((i5 >> 9) & 14) | i252).getValue().m2123unboximpl(), shape3), z172, z6, mutableInteractionSource4, textFieldColors2, (r17 & 16) != 0 ? androidx.compose.material.TextFieldDefaults.FocusedBorderThickness : 0.0f, (r17 & 32) != 0 ? androidx.compose.material.TextFieldDefaults.UnfocusedBorderThickness : 0.0f);
            final boolean z182 = z7;
            final androidx.compose.ui.text.input.VisualTransformation visualTransformation42 = visualTransformation2;
            final androidx.compose.foundation.interaction.MutableInteractionSource mutableInteractionSource62 = mutableInteractionSource4;
            final boolean z192 = z6;
            final kotlin.jvm.functions.Function2<? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.Unit> function2182 = function29;
            final kotlin.jvm.functions.Function2<? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.Unit> function2192 = function28;
            final kotlin.jvm.functions.Function2<? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.Unit> function2202 = function26;
            final kotlin.jvm.functions.Function2<? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.Unit> function2212 = function27;
            final androidx.compose.material.TextFieldColors textFieldColors42 = textFieldColors2;
            final int i262 = i5;
            final int i272 = i15;
            int i282 = i15 << 12;
            composer2 = startRestartGroup;
            boolean z202 = z9;
            androidx.compose.ui.Modifier modifier52 = modifier3;
            androidx.compose.foundation.text.BasicTextFieldKt.BasicTextField(value, onValueChange, androidx.compose.foundation.layout.SizeKt.m601defaultMinSizeVpY3zN4(m1559indicatorLinegv0btCI, androidx.compose.material.TextFieldDefaults.INSTANCE.m1557getMinWidthD9Ej5fM(), androidx.compose.material.TextFieldDefaults.INSTANCE.m1556getMinHeightD9Ej5fM()), z9, z8, merge2, keyboardOptions3, keyboardActions3, z7, i19, visualTransformation2, (kotlin.jvm.functions.Function1) null, mutableInteractionSource4, new androidx.compose.ui.graphics.SolidColor(textFieldColors2.cursorColor(z6, startRestartGroup, (i15 & 14) | i252).getValue().m2123unboximpl(), null), androidx.compose.runtime.internal.ComposableLambdaKt.composableLambda(startRestartGroup, -2078585677, true, new kotlin.jvm.functions.Function3<kotlin.jvm.functions.Function2<? super androidx.compose.runtime.Composer, ? super java.lang.Integer, ? extends kotlin.Unit>, androidx.compose.runtime.Composer, java.lang.Integer, kotlin.Unit>() { // from class: androidx.compose.material.TextFieldKt$TextField$5
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                /* JADX WARN: Multi-variable type inference failed */
                {
                    super(3);
                }

                @Override // kotlin.jvm.functions.Function3
                public /* bridge */ /* synthetic */ kotlin.Unit invoke(kotlin.jvm.functions.Function2<? super androidx.compose.runtime.Composer, ? super java.lang.Integer, ? extends kotlin.Unit> function222, androidx.compose.runtime.Composer composer3, java.lang.Integer num) {
                    invoke((kotlin.jvm.functions.Function2<? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.Unit>) function222, composer3, num.intValue());
                    return kotlin.Unit.INSTANCE;
                }

                public final void invoke(kotlin.jvm.functions.Function2<? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.Unit> innerTextField, androidx.compose.runtime.Composer composer3, int i29) {
                    int i30;
                    kotlin.jvm.internal.Intrinsics.checkNotNullParameter(innerTextField, "innerTextField");
                    androidx.compose.runtime.ComposerKt.sourceInformation(composer3, "C342@17765L543:TextField.kt#jmzs0o");
                    if ((i29 & 14) == 0) {
                        i30 = i29 | (composer3.changed(innerTextField) ? 4 : 2);
                    } else {
                        i30 = i29;
                    }
                    if ((i30 & 91) != 18 || !composer3.getSkipping()) {
                        androidx.compose.material.TextFieldDefaults textFieldDefaults = androidx.compose.material.TextFieldDefaults.INSTANCE;
                        java.lang.String text = androidx.compose.ui.text.input.TextFieldValue.this.getText();
                        boolean z21 = z172;
                        boolean z22 = z182;
                        androidx.compose.ui.text.input.VisualTransformation visualTransformation5 = visualTransformation42;
                        androidx.compose.foundation.interaction.MutableInteractionSource mutableInteractionSource7 = mutableInteractionSource62;
                        boolean z23 = z192;
                        kotlin.jvm.functions.Function2<androidx.compose.runtime.Composer, java.lang.Integer, kotlin.Unit> function222 = function2182;
                        kotlin.jvm.functions.Function2<androidx.compose.runtime.Composer, java.lang.Integer, kotlin.Unit> function223 = function2192;
                        kotlin.jvm.functions.Function2<androidx.compose.runtime.Composer, java.lang.Integer, kotlin.Unit> function224 = function2202;
                        kotlin.jvm.functions.Function2<androidx.compose.runtime.Composer, java.lang.Integer, kotlin.Unit> function225 = function2212;
                        androidx.compose.material.TextFieldColors textFieldColors5 = textFieldColors42;
                        int i31 = i262;
                        int i32 = i272;
                        textFieldDefaults.TextFieldDecorationBox(text, innerTextField, z21, z22, visualTransformation5, mutableInteractionSource7, z23, function222, function223, function224, function225, textFieldColors5, null, composer3, ((i32 >> 3) & 7168) | ((i30 << 3) & 112) | ((i31 >> 3) & 896) | ((i32 << 9) & 57344) | ((i32 >> 3) & 458752) | ((i32 << 18) & 3670016) | ((i31 << 3) & 29360128) | ((i31 << 3) & 234881024) | ((i31 << 3) & 1879048192), ((i31 >> 27) & 14) | 3072 | ((i32 >> 21) & 112), 4096);
                        return;
                    }
                    composer3.skipToGroupEnd();
                }
            }), composer2, (i5 & 57344) | (i5 & 14) | (i5 & 112) | (i5 & 7168) | (i282 & 3670016) | (androidx.compose.foundation.text.KeyboardActions.$stable << 21) | (29360128 & i282) | (234881024 & i282) | (i282 & 1879048192), ((i15 >> 3) & 14) | 24576 | ((i15 >> 12) & 896), 2048);
            z10 = z8;
            function210 = function29;
            function211 = function28;
            function212 = function26;
            function213 = function27;
            visualTransformation3 = visualTransformation2;
            keyboardOptions4 = keyboardOptions3;
            keyboardActions4 = keyboardActions3;
            z11 = z7;
            mutableInteractionSource5 = mutableInteractionSource4;
            textFieldColors3 = textFieldColors2;
            shape4 = shape3;
            z12 = z6;
            textStyle4 = textStyle3;
            z13 = z202;
            modifier4 = modifier52;
            i20 = i19;
            endRestartGroup = composer2.endRestartGroup();
            if (endRestartGroup == null) {
            }
        }
        i6 = i4 & 8;
        int i232 = 2048;
        if (i6 == 0) {
        }
        i7 = i4 & 16;
        if (i7 != 0) {
        }
        if ((i2 & 458752) == 0) {
        }
        i8 = i4 & 64;
        if (i8 != 0) {
        }
        i9 = i4 & 128;
        if (i9 != 0) {
        }
        i10 = i4 & 256;
        if (i10 != 0) {
        }
        i11 = i4 & 512;
        if (i11 != 0) {
        }
        i12 = i4 & 1024;
        if (i12 != 0) {
        }
        i14 = i4 & 2048;
        if (i14 != 0) {
        }
        if ((i3 & 896) == 0) {
        }
        if ((i3 & 7168) == 0) {
        }
        i15 = i13;
        i16 = i4 & 16384;
        if (i16 != 0) {
        }
        i17 = i4 & 32768;
        if (i17 != 0) {
        }
        i18 = i4 & 65536;
        if (i18 != 0) {
        }
        if ((i3 & 29360128) == 0) {
        }
        if ((i3 & 234881024) == 0) {
        }
        if ((i5 & 1533916891) == 306783378) {
        }
        startRestartGroup.startDefaults();
        if ((i2 & 1) != 0) {
        }
        if (i22 != 0) {
        }
        if (i6 != 0) {
        }
        if (i7 != 0) {
        }
        if ((i4 & 32) != 0) {
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
        if ((i4 & 4096) != 0) {
        }
        int i2422 = i5;
        if ((i4 & 8192) != 0) {
        }
        if (i16 != 0) {
        }
        if (i17 != 0) {
        }
        androidx.compose.foundation.text.KeyboardActions keyboardActions522 = keyboardActions2;
        if (i18 != 0) {
        }
        if ((i4 & 131072) != 0) {
        }
        if ((262144 & i4) != 0) {
        }
        function27 = function217;
        visualTransformation2 = none;
        function28 = function215;
        function29 = function214;
        z7 = z16;
        keyboardOptions3 = keyboardOptions2;
        z8 = z15;
        modifier3 = modifier2;
        z9 = z5;
        textStyle3 = textStyle2;
        shape3 = shape2;
        i5 = i2422;
        startRestartGroup.endDefaults();
        startRestartGroup.startReplaceableGroup(-833020145);
        androidx.compose.runtime.ComposerKt.sourceInformation(startRestartGroup, "*315@16626L18");
        m3994getColor0d7_KjU = textStyle3.m3994getColor0d7_KjU();
        if (m3994getColor0d7_KjU == androidx.compose.ui.graphics.Color.INSTANCE.m2149getUnspecified0d7_KjU()) {
        }
        startRestartGroup.endReplaceableGroup();
        androidx.compose.ui.text.TextStyle merge22 = textStyle3.merge(new androidx.compose.ui.text.TextStyle(m3994getColor0d7_KjU, 0L, (androidx.compose.ui.text.font.FontWeight) null, (androidx.compose.ui.text.font.FontStyle) null, (androidx.compose.ui.text.font.FontSynthesis) null, (androidx.compose.ui.text.font.FontFamily) null, (java.lang.String) null, 0L, (androidx.compose.ui.text.style.BaselineShift) null, (androidx.compose.ui.text.style.TextGeometricTransform) null, (androidx.compose.ui.text.intl.LocaleList) null, 0L, (androidx.compose.ui.text.style.TextDecoration) null, (androidx.compose.ui.graphics.Shadow) null, (androidx.compose.ui.text.style.TextAlign) null, (androidx.compose.ui.text.style.TextDirection) null, 0L, (androidx.compose.ui.text.style.TextIndent) null, 262142, (kotlin.jvm.internal.DefaultConstructorMarker) null));
        int i2522 = (i15 >> 21) & 112;
        final boolean z1722 = z9;
        m1559indicatorLinegv0btCI = androidx.compose.material.TextFieldDefaults.INSTANCE.m1559indicatorLinegv0btCI(androidx.compose.foundation.BackgroundKt.m211backgroundbw27NRU(modifier3, textFieldColors2.backgroundColor(z9, startRestartGroup, ((i5 >> 9) & 14) | i2522).getValue().m2123unboximpl(), shape3), z1722, z6, mutableInteractionSource4, textFieldColors2, (r17 & 16) != 0 ? androidx.compose.material.TextFieldDefaults.FocusedBorderThickness : 0.0f, (r17 & 32) != 0 ? androidx.compose.material.TextFieldDefaults.UnfocusedBorderThickness : 0.0f);
        final boolean z1822 = z7;
        final androidx.compose.ui.text.input.VisualTransformation visualTransformation422 = visualTransformation2;
        final androidx.compose.foundation.interaction.MutableInteractionSource mutableInteractionSource622 = mutableInteractionSource4;
        final boolean z1922 = z6;
        final kotlin.jvm.functions.Function2<? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.Unit> function21822 = function29;
        final kotlin.jvm.functions.Function2<? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.Unit> function21922 = function28;
        final kotlin.jvm.functions.Function2<? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.Unit> function22022 = function26;
        final kotlin.jvm.functions.Function2<? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.Unit> function22122 = function27;
        final androidx.compose.material.TextFieldColors textFieldColors422 = textFieldColors2;
        final int i2622 = i5;
        final int i2722 = i15;
        int i2822 = i15 << 12;
        composer2 = startRestartGroup;
        boolean z2022 = z9;
        androidx.compose.ui.Modifier modifier522 = modifier3;
        androidx.compose.foundation.text.BasicTextFieldKt.BasicTextField(value, onValueChange, androidx.compose.foundation.layout.SizeKt.m601defaultMinSizeVpY3zN4(m1559indicatorLinegv0btCI, androidx.compose.material.TextFieldDefaults.INSTANCE.m1557getMinWidthD9Ej5fM(), androidx.compose.material.TextFieldDefaults.INSTANCE.m1556getMinHeightD9Ej5fM()), z9, z8, merge22, keyboardOptions3, keyboardActions3, z7, i19, visualTransformation2, (kotlin.jvm.functions.Function1) null, mutableInteractionSource4, new androidx.compose.ui.graphics.SolidColor(textFieldColors2.cursorColor(z6, startRestartGroup, (i15 & 14) | i2522).getValue().m2123unboximpl(), null), androidx.compose.runtime.internal.ComposableLambdaKt.composableLambda(startRestartGroup, -2078585677, true, new kotlin.jvm.functions.Function3<kotlin.jvm.functions.Function2<? super androidx.compose.runtime.Composer, ? super java.lang.Integer, ? extends kotlin.Unit>, androidx.compose.runtime.Composer, java.lang.Integer, kotlin.Unit>() { // from class: androidx.compose.material.TextFieldKt$TextField$5
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            {
                super(3);
            }

            @Override // kotlin.jvm.functions.Function3
            public /* bridge */ /* synthetic */ kotlin.Unit invoke(kotlin.jvm.functions.Function2<? super androidx.compose.runtime.Composer, ? super java.lang.Integer, ? extends kotlin.Unit> function222, androidx.compose.runtime.Composer composer3, java.lang.Integer num) {
                invoke((kotlin.jvm.functions.Function2<? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.Unit>) function222, composer3, num.intValue());
                return kotlin.Unit.INSTANCE;
            }

            public final void invoke(kotlin.jvm.functions.Function2<? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.Unit> innerTextField, androidx.compose.runtime.Composer composer3, int i29) {
                int i30;
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(innerTextField, "innerTextField");
                androidx.compose.runtime.ComposerKt.sourceInformation(composer3, "C342@17765L543:TextField.kt#jmzs0o");
                if ((i29 & 14) == 0) {
                    i30 = i29 | (composer3.changed(innerTextField) ? 4 : 2);
                } else {
                    i30 = i29;
                }
                if ((i30 & 91) != 18 || !composer3.getSkipping()) {
                    androidx.compose.material.TextFieldDefaults textFieldDefaults = androidx.compose.material.TextFieldDefaults.INSTANCE;
                    java.lang.String text = androidx.compose.ui.text.input.TextFieldValue.this.getText();
                    boolean z21 = z1722;
                    boolean z22 = z1822;
                    androidx.compose.ui.text.input.VisualTransformation visualTransformation5 = visualTransformation422;
                    androidx.compose.foundation.interaction.MutableInteractionSource mutableInteractionSource7 = mutableInteractionSource622;
                    boolean z23 = z1922;
                    kotlin.jvm.functions.Function2<androidx.compose.runtime.Composer, java.lang.Integer, kotlin.Unit> function222 = function21822;
                    kotlin.jvm.functions.Function2<androidx.compose.runtime.Composer, java.lang.Integer, kotlin.Unit> function223 = function21922;
                    kotlin.jvm.functions.Function2<androidx.compose.runtime.Composer, java.lang.Integer, kotlin.Unit> function224 = function22022;
                    kotlin.jvm.functions.Function2<androidx.compose.runtime.Composer, java.lang.Integer, kotlin.Unit> function225 = function22122;
                    androidx.compose.material.TextFieldColors textFieldColors5 = textFieldColors422;
                    int i31 = i2622;
                    int i32 = i2722;
                    textFieldDefaults.TextFieldDecorationBox(text, innerTextField, z21, z22, visualTransformation5, mutableInteractionSource7, z23, function222, function223, function224, function225, textFieldColors5, null, composer3, ((i32 >> 3) & 7168) | ((i30 << 3) & 112) | ((i31 >> 3) & 896) | ((i32 << 9) & 57344) | ((i32 >> 3) & 458752) | ((i32 << 18) & 3670016) | ((i31 << 3) & 29360128) | ((i31 << 3) & 234881024) | ((i31 << 3) & 1879048192), ((i31 >> 27) & 14) | 3072 | ((i32 >> 21) & 112), 4096);
                    return;
                }
                composer3.skipToGroupEnd();
            }
        }), composer2, (i5 & 57344) | (i5 & 14) | (i5 & 112) | (i5 & 7168) | (i2822 & 3670016) | (androidx.compose.foundation.text.KeyboardActions.$stable << 21) | (29360128 & i2822) | (234881024 & i2822) | (i2822 & 1879048192), ((i15 >> 3) & 14) | 24576 | ((i15 >> 12) & 896), 2048);
        z10 = z8;
        function210 = function29;
        function211 = function28;
        function212 = function26;
        function213 = function27;
        visualTransformation3 = visualTransformation2;
        keyboardOptions4 = keyboardOptions3;
        keyboardActions4 = keyboardActions3;
        z11 = z7;
        mutableInteractionSource5 = mutableInteractionSource4;
        textFieldColors3 = textFieldColors2;
        shape4 = shape3;
        z12 = z6;
        textStyle4 = textStyle3;
        z13 = z2022;
        modifier4 = modifier522;
        i20 = i19;
        endRestartGroup = composer2.endRestartGroup();
        if (endRestartGroup == null) {
        }
    }

    public static final void TextFieldLayout(final androidx.compose.ui.Modifier modifier, final kotlin.jvm.functions.Function2<? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.Unit> textField, final kotlin.jvm.functions.Function2<? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.Unit> function2, final kotlin.jvm.functions.Function3<? super androidx.compose.ui.Modifier, ? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.Unit> function3, final kotlin.jvm.functions.Function2<? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.Unit> function22, final kotlin.jvm.functions.Function2<? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.Unit> function23, final boolean z, final float f, final androidx.compose.foundation.layout.PaddingValues paddingValues, androidx.compose.runtime.Composer composer, final int i) {
        int i2;
        int i3;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(modifier, "modifier");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(textField, "textField");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(paddingValues, "paddingValues");
        androidx.compose.runtime.Composer startRestartGroup = composer.startRestartGroup(-2112507061);
        androidx.compose.runtime.ComposerKt.sourceInformation(startRestartGroup, "C(TextFieldLayout)P(3,7,1,5,2,8,6)376@18854L139,379@19041L7,380@19053L1853:TextField.kt#jmzs0o");
        if ((i & 14) == 0) {
            i2 = (startRestartGroup.changed(modifier) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 112) == 0) {
            i2 |= startRestartGroup.changed(textField) ? 32 : 16;
        }
        if ((i & 896) == 0) {
            i2 |= startRestartGroup.changed(function2) ? 256 : 128;
        }
        if ((i & 7168) == 0) {
            i2 |= startRestartGroup.changed(function3) ? 2048 : 1024;
        }
        if ((57344 & i) == 0) {
            i2 |= startRestartGroup.changed(function22) ? 16384 : 8192;
        }
        if ((458752 & i) == 0) {
            i2 |= startRestartGroup.changed(function23) ? 131072 : 65536;
        }
        if ((3670016 & i) == 0) {
            i2 |= startRestartGroup.changed(z) ? 1048576 : 524288;
        }
        if ((29360128 & i) == 0) {
            i2 |= startRestartGroup.changed(f) ? 8388608 : 4194304;
        }
        if ((234881024 & i) == 0) {
            i2 |= startRestartGroup.changed(paddingValues) ? androidx.core.view.accessibility.AccessibilityEventCompat.TYPE_VIEW_TARGETED_BY_SCROLL : 33554432;
        }
        if ((191739611 & i2) != 38347922 || !startRestartGroup.getSkipping()) {
            java.lang.Boolean valueOf = java.lang.Boolean.valueOf(z);
            java.lang.Float valueOf2 = java.lang.Float.valueOf(f);
            startRestartGroup.startReplaceableGroup(1618982084);
            androidx.compose.runtime.ComposerKt.sourceInformation(startRestartGroup, "C(remember)P(1,2,3):Composables.kt#9igjgp");
            boolean changed = startRestartGroup.changed(valueOf) | startRestartGroup.changed(valueOf2) | startRestartGroup.changed(paddingValues);
            java.lang.Object rememberedValue = startRestartGroup.rememberedValue();
            if (changed || rememberedValue == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                rememberedValue = new androidx.compose.material.TextFieldMeasurePolicy(z, f, paddingValues);
                startRestartGroup.updateRememberedValue(rememberedValue);
            }
            startRestartGroup.endReplaceableGroup();
            androidx.compose.material.TextFieldMeasurePolicy textFieldMeasurePolicy = (androidx.compose.material.TextFieldMeasurePolicy) rememberedValue;
            androidx.compose.runtime.ProvidableCompositionLocal<androidx.compose.ui.unit.LayoutDirection> localLayoutDirection = androidx.compose.ui.platform.CompositionLocalsKt.getLocalLayoutDirection();
            androidx.compose.runtime.ComposerKt.sourceInformationMarkerStart(startRestartGroup, 2023513938, "C:CompositionLocal.kt#9igjgp");
            java.lang.Object consume = startRestartGroup.consume(localLayoutDirection);
            androidx.compose.runtime.ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
            androidx.compose.ui.unit.LayoutDirection layoutDirection = (androidx.compose.ui.unit.LayoutDirection) consume;
            startRestartGroup.startReplaceableGroup(-1323940314);
            androidx.compose.runtime.ComposerKt.sourceInformation(startRestartGroup, "C(Layout)P(!1,2)74@2915L7,75@2970L7,76@3029L7,77@3041L460:Layout.kt#80mrfh");
            androidx.compose.runtime.ProvidableCompositionLocal<androidx.compose.ui.unit.Density> localDensity = androidx.compose.ui.platform.CompositionLocalsKt.getLocalDensity();
            androidx.compose.runtime.ComposerKt.sourceInformationMarkerStart(startRestartGroup, 2023513938, "C:CompositionLocal.kt#9igjgp");
            java.lang.Object consume2 = startRestartGroup.consume(localDensity);
            androidx.compose.runtime.ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
            androidx.compose.ui.unit.Density density = (androidx.compose.ui.unit.Density) consume2;
            androidx.compose.runtime.ProvidableCompositionLocal<androidx.compose.ui.unit.LayoutDirection> localLayoutDirection2 = androidx.compose.ui.platform.CompositionLocalsKt.getLocalLayoutDirection();
            androidx.compose.runtime.ComposerKt.sourceInformationMarkerStart(startRestartGroup, 2023513938, "C:CompositionLocal.kt#9igjgp");
            java.lang.Object consume3 = startRestartGroup.consume(localLayoutDirection2);
            androidx.compose.runtime.ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
            androidx.compose.ui.unit.LayoutDirection layoutDirection2 = (androidx.compose.ui.unit.LayoutDirection) consume3;
            androidx.compose.runtime.ProvidableCompositionLocal<androidx.compose.ui.platform.ViewConfiguration> localViewConfiguration = androidx.compose.ui.platform.CompositionLocalsKt.getLocalViewConfiguration();
            androidx.compose.runtime.ComposerKt.sourceInformationMarkerStart(startRestartGroup, 2023513938, "C:CompositionLocal.kt#9igjgp");
            java.lang.Object consume4 = startRestartGroup.consume(localViewConfiguration);
            androidx.compose.runtime.ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
            androidx.compose.ui.platform.ViewConfiguration viewConfiguration = (androidx.compose.ui.platform.ViewConfiguration) consume4;
            kotlin.jvm.functions.Function0<androidx.compose.ui.node.ComposeUiNode> constructor = androidx.compose.ui.node.ComposeUiNode.INSTANCE.getConstructor();
            kotlin.jvm.functions.Function3<androidx.compose.runtime.SkippableUpdater<androidx.compose.ui.node.ComposeUiNode>, androidx.compose.runtime.Composer, java.lang.Integer, kotlin.Unit> materializerOf = androidx.compose.ui.layout.LayoutKt.materializerOf(modifier);
            if (!(startRestartGroup.getApplier() instanceof androidx.compose.runtime.Applier)) {
                androidx.compose.runtime.ComposablesKt.invalidApplier();
            }
            startRestartGroup.startReusableNode();
            if (startRestartGroup.getInserting()) {
                startRestartGroup.createNode(constructor);
            } else {
                startRestartGroup.useNode();
            }
            startRestartGroup.disableReusing();
            androidx.compose.runtime.Composer m1641constructorimpl = androidx.compose.runtime.Updater.m1641constructorimpl(startRestartGroup);
            androidx.compose.runtime.Updater.m1648setimpl(m1641constructorimpl, textFieldMeasurePolicy, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetMeasurePolicy());
            androidx.compose.runtime.Updater.m1648setimpl(m1641constructorimpl, density, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetDensity());
            androidx.compose.runtime.Updater.m1648setimpl(m1641constructorimpl, layoutDirection2, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetLayoutDirection());
            androidx.compose.runtime.Updater.m1648setimpl(m1641constructorimpl, viewConfiguration, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetViewConfiguration());
            startRestartGroup.enableReusing();
            materializerOf.invoke(androidx.compose.runtime.SkippableUpdater.m1632boximpl(androidx.compose.runtime.SkippableUpdater.m1633constructorimpl(startRestartGroup)), startRestartGroup, 0);
            startRestartGroup.startReplaceableGroup(2058660585);
            startRestartGroup.startReplaceableGroup(642667778);
            androidx.compose.runtime.ComposerKt.sourceInformation(startRestartGroup, "C422@20668L183:TextField.kt#jmzs0o");
            startRestartGroup.startReplaceableGroup(254816194);
            androidx.compose.runtime.ComposerKt.sourceInformation(startRestartGroup, "384@19161L219");
            if (function22 != null) {
                androidx.compose.ui.Modifier then = androidx.compose.ui.layout.LayoutIdKt.layoutId(androidx.compose.ui.Modifier.INSTANCE, androidx.compose.material.TextFieldImplKt.LeadingId).then(androidx.compose.material.TextFieldImplKt.getIconDefaultSizeModifier());
                androidx.compose.ui.Alignment center = androidx.compose.ui.Alignment.INSTANCE.getCenter();
                startRestartGroup.startReplaceableGroup(733328855);
                androidx.compose.runtime.ComposerKt.sourceInformation(startRestartGroup, "C(Box)P(2,1,3)70@3267L67,71@3339L130:Box.kt#2w3rfo");
                androidx.compose.ui.layout.MeasurePolicy rememberBoxMeasurePolicy = androidx.compose.foundation.layout.BoxKt.rememberBoxMeasurePolicy(center, false, startRestartGroup, 6);
                startRestartGroup.startReplaceableGroup(-1323940314);
                androidx.compose.runtime.ComposerKt.sourceInformation(startRestartGroup, "C(Layout)P(!1,2)74@2915L7,75@2970L7,76@3029L7,77@3041L460:Layout.kt#80mrfh");
                androidx.compose.runtime.ProvidableCompositionLocal<androidx.compose.ui.unit.Density> localDensity2 = androidx.compose.ui.platform.CompositionLocalsKt.getLocalDensity();
                androidx.compose.runtime.ComposerKt.sourceInformationMarkerStart(startRestartGroup, 2023513938, "C:CompositionLocal.kt#9igjgp");
                java.lang.Object consume5 = startRestartGroup.consume(localDensity2);
                androidx.compose.runtime.ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                androidx.compose.ui.unit.Density density2 = (androidx.compose.ui.unit.Density) consume5;
                androidx.compose.runtime.ProvidableCompositionLocal<androidx.compose.ui.unit.LayoutDirection> localLayoutDirection3 = androidx.compose.ui.platform.CompositionLocalsKt.getLocalLayoutDirection();
                androidx.compose.runtime.ComposerKt.sourceInformationMarkerStart(startRestartGroup, 2023513938, "C:CompositionLocal.kt#9igjgp");
                java.lang.Object consume6 = startRestartGroup.consume(localLayoutDirection3);
                androidx.compose.runtime.ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                androidx.compose.ui.unit.LayoutDirection layoutDirection3 = (androidx.compose.ui.unit.LayoutDirection) consume6;
                androidx.compose.runtime.ProvidableCompositionLocal<androidx.compose.ui.platform.ViewConfiguration> localViewConfiguration2 = androidx.compose.ui.platform.CompositionLocalsKt.getLocalViewConfiguration();
                androidx.compose.runtime.ComposerKt.sourceInformationMarkerStart(startRestartGroup, 2023513938, "C:CompositionLocal.kt#9igjgp");
                java.lang.Object consume7 = startRestartGroup.consume(localViewConfiguration2);
                androidx.compose.runtime.ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                androidx.compose.ui.platform.ViewConfiguration viewConfiguration2 = (androidx.compose.ui.platform.ViewConfiguration) consume7;
                kotlin.jvm.functions.Function0<androidx.compose.ui.node.ComposeUiNode> constructor2 = androidx.compose.ui.node.ComposeUiNode.INSTANCE.getConstructor();
                kotlin.jvm.functions.Function3<androidx.compose.runtime.SkippableUpdater<androidx.compose.ui.node.ComposeUiNode>, androidx.compose.runtime.Composer, java.lang.Integer, kotlin.Unit> materializerOf2 = androidx.compose.ui.layout.LayoutKt.materializerOf(then);
                if (!(startRestartGroup.getApplier() instanceof androidx.compose.runtime.Applier)) {
                    androidx.compose.runtime.ComposablesKt.invalidApplier();
                }
                startRestartGroup.startReusableNode();
                if (startRestartGroup.getInserting()) {
                    startRestartGroup.createNode(constructor2);
                } else {
                    startRestartGroup.useNode();
                }
                startRestartGroup.disableReusing();
                androidx.compose.runtime.Composer m1641constructorimpl2 = androidx.compose.runtime.Updater.m1641constructorimpl(startRestartGroup);
                androidx.compose.runtime.Updater.m1648setimpl(m1641constructorimpl2, rememberBoxMeasurePolicy, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetMeasurePolicy());
                androidx.compose.runtime.Updater.m1648setimpl(m1641constructorimpl2, density2, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetDensity());
                androidx.compose.runtime.Updater.m1648setimpl(m1641constructorimpl2, layoutDirection3, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetLayoutDirection());
                androidx.compose.runtime.Updater.m1648setimpl(m1641constructorimpl2, viewConfiguration2, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetViewConfiguration());
                startRestartGroup.enableReusing();
                materializerOf2.invoke(androidx.compose.runtime.SkippableUpdater.m1632boximpl(androidx.compose.runtime.SkippableUpdater.m1633constructorimpl(startRestartGroup)), startRestartGroup, 0);
                startRestartGroup.startReplaceableGroup(2058660585);
                startRestartGroup.startReplaceableGroup(-2137368960);
                androidx.compose.runtime.ComposerKt.sourceInformation(startRestartGroup, "C72@3384L9:Box.kt#2w3rfo");
                androidx.compose.foundation.layout.BoxScopeInstance boxScopeInstance = androidx.compose.foundation.layout.BoxScopeInstance.INSTANCE;
                startRestartGroup.startReplaceableGroup(822730659);
                androidx.compose.runtime.ComposerKt.sourceInformation(startRestartGroup, "C388@19353L9:TextField.kt#jmzs0o");
                function22.invoke(startRestartGroup, java.lang.Integer.valueOf((i2 >> 12) & 14));
                startRestartGroup.endReplaceableGroup();
                startRestartGroup.endReplaceableGroup();
                startRestartGroup.endReplaceableGroup();
                startRestartGroup.endNode();
                startRestartGroup.endReplaceableGroup();
                startRestartGroup.endReplaceableGroup();
            }
            startRestartGroup.endReplaceableGroup();
            startRestartGroup.startReplaceableGroup(254816479);
            androidx.compose.runtime.ComposerKt.sourceInformation(startRestartGroup, "392@19447L221");
            if (function23 != null) {
                androidx.compose.ui.Modifier then2 = androidx.compose.ui.layout.LayoutIdKt.layoutId(androidx.compose.ui.Modifier.INSTANCE, androidx.compose.material.TextFieldImplKt.TrailingId).then(androidx.compose.material.TextFieldImplKt.getIconDefaultSizeModifier());
                androidx.compose.ui.Alignment center2 = androidx.compose.ui.Alignment.INSTANCE.getCenter();
                startRestartGroup.startReplaceableGroup(733328855);
                androidx.compose.runtime.ComposerKt.sourceInformation(startRestartGroup, "C(Box)P(2,1,3)70@3267L67,71@3339L130:Box.kt#2w3rfo");
                androidx.compose.ui.layout.MeasurePolicy rememberBoxMeasurePolicy2 = androidx.compose.foundation.layout.BoxKt.rememberBoxMeasurePolicy(center2, false, startRestartGroup, 6);
                startRestartGroup.startReplaceableGroup(-1323940314);
                androidx.compose.runtime.ComposerKt.sourceInformation(startRestartGroup, "C(Layout)P(!1,2)74@2915L7,75@2970L7,76@3029L7,77@3041L460:Layout.kt#80mrfh");
                androidx.compose.runtime.ProvidableCompositionLocal<androidx.compose.ui.unit.Density> localDensity3 = androidx.compose.ui.platform.CompositionLocalsKt.getLocalDensity();
                androidx.compose.runtime.ComposerKt.sourceInformationMarkerStart(startRestartGroup, 2023513938, "C:CompositionLocal.kt#9igjgp");
                java.lang.Object consume8 = startRestartGroup.consume(localDensity3);
                androidx.compose.runtime.ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                androidx.compose.ui.unit.Density density3 = (androidx.compose.ui.unit.Density) consume8;
                androidx.compose.runtime.ProvidableCompositionLocal<androidx.compose.ui.unit.LayoutDirection> localLayoutDirection4 = androidx.compose.ui.platform.CompositionLocalsKt.getLocalLayoutDirection();
                androidx.compose.runtime.ComposerKt.sourceInformationMarkerStart(startRestartGroup, 2023513938, "C:CompositionLocal.kt#9igjgp");
                java.lang.Object consume9 = startRestartGroup.consume(localLayoutDirection4);
                androidx.compose.runtime.ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                androidx.compose.ui.unit.LayoutDirection layoutDirection4 = (androidx.compose.ui.unit.LayoutDirection) consume9;
                androidx.compose.runtime.ProvidableCompositionLocal<androidx.compose.ui.platform.ViewConfiguration> localViewConfiguration3 = androidx.compose.ui.platform.CompositionLocalsKt.getLocalViewConfiguration();
                androidx.compose.runtime.ComposerKt.sourceInformationMarkerStart(startRestartGroup, 2023513938, "C:CompositionLocal.kt#9igjgp");
                java.lang.Object consume10 = startRestartGroup.consume(localViewConfiguration3);
                androidx.compose.runtime.ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                androidx.compose.ui.platform.ViewConfiguration viewConfiguration3 = (androidx.compose.ui.platform.ViewConfiguration) consume10;
                kotlin.jvm.functions.Function0<androidx.compose.ui.node.ComposeUiNode> constructor3 = androidx.compose.ui.node.ComposeUiNode.INSTANCE.getConstructor();
                kotlin.jvm.functions.Function3<androidx.compose.runtime.SkippableUpdater<androidx.compose.ui.node.ComposeUiNode>, androidx.compose.runtime.Composer, java.lang.Integer, kotlin.Unit> materializerOf3 = androidx.compose.ui.layout.LayoutKt.materializerOf(then2);
                if (!(startRestartGroup.getApplier() instanceof androidx.compose.runtime.Applier)) {
                    androidx.compose.runtime.ComposablesKt.invalidApplier();
                }
                startRestartGroup.startReusableNode();
                if (startRestartGroup.getInserting()) {
                    startRestartGroup.createNode(constructor3);
                } else {
                    startRestartGroup.useNode();
                }
                startRestartGroup.disableReusing();
                androidx.compose.runtime.Composer m1641constructorimpl3 = androidx.compose.runtime.Updater.m1641constructorimpl(startRestartGroup);
                androidx.compose.runtime.Updater.m1648setimpl(m1641constructorimpl3, rememberBoxMeasurePolicy2, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetMeasurePolicy());
                androidx.compose.runtime.Updater.m1648setimpl(m1641constructorimpl3, density3, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetDensity());
                androidx.compose.runtime.Updater.m1648setimpl(m1641constructorimpl3, layoutDirection4, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetLayoutDirection());
                androidx.compose.runtime.Updater.m1648setimpl(m1641constructorimpl3, viewConfiguration3, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetViewConfiguration());
                startRestartGroup.enableReusing();
                materializerOf3.invoke(androidx.compose.runtime.SkippableUpdater.m1632boximpl(androidx.compose.runtime.SkippableUpdater.m1633constructorimpl(startRestartGroup)), startRestartGroup, 0);
                startRestartGroup.startReplaceableGroup(2058660585);
                startRestartGroup.startReplaceableGroup(-2137368960);
                androidx.compose.runtime.ComposerKt.sourceInformation(startRestartGroup, "C72@3384L9:Box.kt#2w3rfo");
                androidx.compose.foundation.layout.BoxScopeInstance boxScopeInstance2 = androidx.compose.foundation.layout.BoxScopeInstance.INSTANCE;
                startRestartGroup.startReplaceableGroup(-1007916070);
                androidx.compose.runtime.ComposerKt.sourceInformation(startRestartGroup, "C396@19640L10:TextField.kt#jmzs0o");
                function23.invoke(startRestartGroup, java.lang.Integer.valueOf((i2 >> 15) & 14));
                startRestartGroup.endReplaceableGroup();
                startRestartGroup.endReplaceableGroup();
                startRestartGroup.endReplaceableGroup();
                startRestartGroup.endNode();
                startRestartGroup.endReplaceableGroup();
                startRestartGroup.endReplaceableGroup();
            }
            startRestartGroup.endReplaceableGroup();
            float calculateStartPadding = androidx.compose.foundation.layout.PaddingKt.calculateStartPadding(paddingValues, layoutDirection);
            float calculateEndPadding = androidx.compose.foundation.layout.PaddingKt.calculateEndPadding(paddingValues, layoutDirection);
            androidx.compose.ui.Modifier.Companion companion = androidx.compose.ui.Modifier.INSTANCE;
            if (function22 != null) {
                i3 = 0;
                calculateStartPadding = androidx.compose.ui.unit.Dp.m4478constructorimpl(kotlin.ranges.RangesKt.coerceAtLeast(androidx.compose.ui.unit.Dp.m4478constructorimpl(calculateStartPadding - androidx.compose.material.TextFieldImplKt.getHorizontalIconPadding()), androidx.compose.ui.unit.Dp.m4478constructorimpl(0)));
            } else {
                i3 = 0;
            }
            float f2 = calculateStartPadding;
            if (function23 != null) {
                calculateEndPadding = androidx.compose.ui.unit.Dp.m4478constructorimpl(kotlin.ranges.RangesKt.coerceAtLeast(androidx.compose.ui.unit.Dp.m4478constructorimpl(calculateEndPadding - androidx.compose.material.TextFieldImplKt.getHorizontalIconPadding()), androidx.compose.ui.unit.Dp.m4478constructorimpl(i3)));
            }
            androidx.compose.ui.Modifier m572paddingqDBjuR0$default = androidx.compose.foundation.layout.PaddingKt.m572paddingqDBjuR0$default(companion, f2, 0.0f, calculateEndPadding, 0.0f, 10, null);
            startRestartGroup.startReplaceableGroup(254817490);
            androidx.compose.runtime.ComposerKt.sourceInformation(startRestartGroup, "417@20461L59");
            if (function3 != null) {
                function3.invoke(androidx.compose.ui.layout.LayoutIdKt.layoutId(androidx.compose.ui.Modifier.INSTANCE, androidx.compose.material.TextFieldImplKt.PlaceholderId).then(m572paddingqDBjuR0$default), startRestartGroup, java.lang.Integer.valueOf((i2 >> 6) & 112));
            }
            startRestartGroup.endReplaceableGroup();
            startRestartGroup.startReplaceableGroup(254817619);
            androidx.compose.runtime.ComposerKt.sourceInformation(startRestartGroup, "420@20584L57");
            if (function2 != null) {
                androidx.compose.ui.Modifier then3 = androidx.compose.ui.layout.LayoutIdKt.layoutId(androidx.compose.ui.Modifier.INSTANCE, androidx.compose.material.TextFieldImplKt.LabelId).then(m572paddingqDBjuR0$default);
                startRestartGroup.startReplaceableGroup(733328855);
                androidx.compose.runtime.ComposerKt.sourceInformation(startRestartGroup, "C(Box)P(2,1,3)70@3267L67,71@3339L130:Box.kt#2w3rfo");
                androidx.compose.ui.layout.MeasurePolicy rememberBoxMeasurePolicy3 = androidx.compose.foundation.layout.BoxKt.rememberBoxMeasurePolicy(androidx.compose.ui.Alignment.INSTANCE.getTopStart(), false, startRestartGroup, 0);
                startRestartGroup.startReplaceableGroup(-1323940314);
                androidx.compose.runtime.ComposerKt.sourceInformation(startRestartGroup, "C(Layout)P(!1,2)74@2915L7,75@2970L7,76@3029L7,77@3041L460:Layout.kt#80mrfh");
                androidx.compose.runtime.ProvidableCompositionLocal<androidx.compose.ui.unit.Density> localDensity4 = androidx.compose.ui.platform.CompositionLocalsKt.getLocalDensity();
                androidx.compose.runtime.ComposerKt.sourceInformationMarkerStart(startRestartGroup, 2023513938, "C:CompositionLocal.kt#9igjgp");
                java.lang.Object consume11 = startRestartGroup.consume(localDensity4);
                androidx.compose.runtime.ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                androidx.compose.ui.unit.Density density4 = (androidx.compose.ui.unit.Density) consume11;
                androidx.compose.runtime.ProvidableCompositionLocal<androidx.compose.ui.unit.LayoutDirection> localLayoutDirection5 = androidx.compose.ui.platform.CompositionLocalsKt.getLocalLayoutDirection();
                androidx.compose.runtime.ComposerKt.sourceInformationMarkerStart(startRestartGroup, 2023513938, "C:CompositionLocal.kt#9igjgp");
                java.lang.Object consume12 = startRestartGroup.consume(localLayoutDirection5);
                androidx.compose.runtime.ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                androidx.compose.ui.unit.LayoutDirection layoutDirection5 = (androidx.compose.ui.unit.LayoutDirection) consume12;
                androidx.compose.runtime.ProvidableCompositionLocal<androidx.compose.ui.platform.ViewConfiguration> localViewConfiguration4 = androidx.compose.ui.platform.CompositionLocalsKt.getLocalViewConfiguration();
                androidx.compose.runtime.ComposerKt.sourceInformationMarkerStart(startRestartGroup, 2023513938, "C:CompositionLocal.kt#9igjgp");
                java.lang.Object consume13 = startRestartGroup.consume(localViewConfiguration4);
                androidx.compose.runtime.ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                androidx.compose.ui.platform.ViewConfiguration viewConfiguration4 = (androidx.compose.ui.platform.ViewConfiguration) consume13;
                kotlin.jvm.functions.Function0<androidx.compose.ui.node.ComposeUiNode> constructor4 = androidx.compose.ui.node.ComposeUiNode.INSTANCE.getConstructor();
                kotlin.jvm.functions.Function3<androidx.compose.runtime.SkippableUpdater<androidx.compose.ui.node.ComposeUiNode>, androidx.compose.runtime.Composer, java.lang.Integer, kotlin.Unit> materializerOf4 = androidx.compose.ui.layout.LayoutKt.materializerOf(then3);
                if (!(startRestartGroup.getApplier() instanceof androidx.compose.runtime.Applier)) {
                    androidx.compose.runtime.ComposablesKt.invalidApplier();
                }
                startRestartGroup.startReusableNode();
                if (startRestartGroup.getInserting()) {
                    startRestartGroup.createNode(constructor4);
                } else {
                    startRestartGroup.useNode();
                }
                startRestartGroup.disableReusing();
                androidx.compose.runtime.Composer m1641constructorimpl4 = androidx.compose.runtime.Updater.m1641constructorimpl(startRestartGroup);
                androidx.compose.runtime.Updater.m1648setimpl(m1641constructorimpl4, rememberBoxMeasurePolicy3, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetMeasurePolicy());
                androidx.compose.runtime.Updater.m1648setimpl(m1641constructorimpl4, density4, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetDensity());
                androidx.compose.runtime.Updater.m1648setimpl(m1641constructorimpl4, layoutDirection5, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetLayoutDirection());
                androidx.compose.runtime.Updater.m1648setimpl(m1641constructorimpl4, viewConfiguration4, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetViewConfiguration());
                startRestartGroup.enableReusing();
                materializerOf4.invoke(androidx.compose.runtime.SkippableUpdater.m1632boximpl(androidx.compose.runtime.SkippableUpdater.m1633constructorimpl(startRestartGroup)), startRestartGroup, 0);
                startRestartGroup.startReplaceableGroup(2058660585);
                startRestartGroup.startReplaceableGroup(-2137368960);
                androidx.compose.runtime.ComposerKt.sourceInformation(startRestartGroup, "C72@3384L9:Box.kt#2w3rfo");
                androidx.compose.foundation.layout.BoxScopeInstance boxScopeInstance3 = androidx.compose.foundation.layout.BoxScopeInstance.INSTANCE;
                startRestartGroup.startReplaceableGroup(1319246300);
                androidx.compose.runtime.ComposerKt.sourceInformation(startRestartGroup, "C420@20632L7:TextField.kt#jmzs0o");
                function2.invoke(startRestartGroup, java.lang.Integer.valueOf((i2 >> 6) & 14));
                startRestartGroup.endReplaceableGroup();
                startRestartGroup.endReplaceableGroup();
                startRestartGroup.endReplaceableGroup();
                startRestartGroup.endNode();
                startRestartGroup.endReplaceableGroup();
                startRestartGroup.endReplaceableGroup();
            }
            startRestartGroup.endReplaceableGroup();
            androidx.compose.ui.Modifier then4 = androidx.compose.ui.layout.LayoutIdKt.layoutId(androidx.compose.ui.Modifier.INSTANCE, androidx.compose.material.TextFieldImplKt.TextFieldId).then(m572paddingqDBjuR0$default);
            startRestartGroup.startReplaceableGroup(733328855);
            androidx.compose.runtime.ComposerKt.sourceInformation(startRestartGroup, "C(Box)P(2,1,3)70@3267L67,71@3339L130:Box.kt#2w3rfo");
            androidx.compose.ui.layout.MeasurePolicy rememberBoxMeasurePolicy4 = androidx.compose.foundation.layout.BoxKt.rememberBoxMeasurePolicy(androidx.compose.ui.Alignment.INSTANCE.getTopStart(), true, startRestartGroup, 48);
            startRestartGroup.startReplaceableGroup(-1323940314);
            androidx.compose.runtime.ComposerKt.sourceInformation(startRestartGroup, "C(Layout)P(!1,2)74@2915L7,75@2970L7,76@3029L7,77@3041L460:Layout.kt#80mrfh");
            androidx.compose.runtime.ProvidableCompositionLocal<androidx.compose.ui.unit.Density> localDensity5 = androidx.compose.ui.platform.CompositionLocalsKt.getLocalDensity();
            androidx.compose.runtime.ComposerKt.sourceInformationMarkerStart(startRestartGroup, 2023513938, "C:CompositionLocal.kt#9igjgp");
            java.lang.Object consume14 = startRestartGroup.consume(localDensity5);
            androidx.compose.runtime.ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
            androidx.compose.ui.unit.Density density5 = (androidx.compose.ui.unit.Density) consume14;
            androidx.compose.runtime.ProvidableCompositionLocal<androidx.compose.ui.unit.LayoutDirection> localLayoutDirection6 = androidx.compose.ui.platform.CompositionLocalsKt.getLocalLayoutDirection();
            androidx.compose.runtime.ComposerKt.sourceInformationMarkerStart(startRestartGroup, 2023513938, "C:CompositionLocal.kt#9igjgp");
            java.lang.Object consume15 = startRestartGroup.consume(localLayoutDirection6);
            androidx.compose.runtime.ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
            androidx.compose.ui.unit.LayoutDirection layoutDirection6 = (androidx.compose.ui.unit.LayoutDirection) consume15;
            androidx.compose.runtime.ProvidableCompositionLocal<androidx.compose.ui.platform.ViewConfiguration> localViewConfiguration5 = androidx.compose.ui.platform.CompositionLocalsKt.getLocalViewConfiguration();
            androidx.compose.runtime.ComposerKt.sourceInformationMarkerStart(startRestartGroup, 2023513938, "C:CompositionLocal.kt#9igjgp");
            java.lang.Object consume16 = startRestartGroup.consume(localViewConfiguration5);
            androidx.compose.runtime.ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
            androidx.compose.ui.platform.ViewConfiguration viewConfiguration5 = (androidx.compose.ui.platform.ViewConfiguration) consume16;
            kotlin.jvm.functions.Function0<androidx.compose.ui.node.ComposeUiNode> constructor5 = androidx.compose.ui.node.ComposeUiNode.INSTANCE.getConstructor();
            kotlin.jvm.functions.Function3<androidx.compose.runtime.SkippableUpdater<androidx.compose.ui.node.ComposeUiNode>, androidx.compose.runtime.Composer, java.lang.Integer, kotlin.Unit> materializerOf5 = androidx.compose.ui.layout.LayoutKt.materializerOf(then4);
            if (!(startRestartGroup.getApplier() instanceof androidx.compose.runtime.Applier)) {
                androidx.compose.runtime.ComposablesKt.invalidApplier();
            }
            startRestartGroup.startReusableNode();
            if (startRestartGroup.getInserting()) {
                startRestartGroup.createNode(constructor5);
            } else {
                startRestartGroup.useNode();
            }
            startRestartGroup.disableReusing();
            androidx.compose.runtime.Composer m1641constructorimpl5 = androidx.compose.runtime.Updater.m1641constructorimpl(startRestartGroup);
            androidx.compose.runtime.Updater.m1648setimpl(m1641constructorimpl5, rememberBoxMeasurePolicy4, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetMeasurePolicy());
            androidx.compose.runtime.Updater.m1648setimpl(m1641constructorimpl5, density5, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetDensity());
            androidx.compose.runtime.Updater.m1648setimpl(m1641constructorimpl5, layoutDirection6, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetLayoutDirection());
            androidx.compose.runtime.Updater.m1648setimpl(m1641constructorimpl5, viewConfiguration5, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetViewConfiguration());
            startRestartGroup.enableReusing();
            materializerOf5.invoke(androidx.compose.runtime.SkippableUpdater.m1632boximpl(androidx.compose.runtime.SkippableUpdater.m1633constructorimpl(startRestartGroup)), startRestartGroup, 0);
            startRestartGroup.startReplaceableGroup(2058660585);
            startRestartGroup.startReplaceableGroup(-2137368960);
            androidx.compose.runtime.ComposerKt.sourceInformation(startRestartGroup, "C72@3384L9:Box.kt#2w3rfo");
            androidx.compose.foundation.layout.BoxScopeInstance boxScopeInstance4 = androidx.compose.foundation.layout.BoxScopeInstance.INSTANCE;
            startRestartGroup.startReplaceableGroup(-2048931960);
            androidx.compose.runtime.ComposerKt.sourceInformation(startRestartGroup, "C426@20826L11:TextField.kt#jmzs0o");
            textField.invoke(startRestartGroup, java.lang.Integer.valueOf((i2 >> 3) & 14));
            startRestartGroup.endReplaceableGroup();
            startRestartGroup.endReplaceableGroup();
            startRestartGroup.endReplaceableGroup();
            startRestartGroup.endNode();
            startRestartGroup.endReplaceableGroup();
            startRestartGroup.endReplaceableGroup();
            startRestartGroup.endReplaceableGroup();
            startRestartGroup.endReplaceableGroup();
            startRestartGroup.endNode();
            startRestartGroup.endReplaceableGroup();
        } else {
            startRestartGroup.skipToGroupEnd();
        }
        androidx.compose.runtime.ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup == null) {
            return;
        }
        endRestartGroup.updateScope(new kotlin.jvm.functions.Function2<androidx.compose.runtime.Composer, java.lang.Integer, kotlin.Unit>() { // from class: androidx.compose.material.TextFieldKt$TextFieldLayout$2
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

            public final void invoke(androidx.compose.runtime.Composer composer2, int i4) {
                androidx.compose.material.TextFieldKt.TextFieldLayout(androidx.compose.ui.Modifier.this, textField, function2, function3, function22, function23, z, f, paddingValues, composer2, i | 1);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: calculateWidth-VsPV1Ek, reason: not valid java name */
    public static final int m1575calculateWidthVsPV1Ek(int i, int i2, int i3, int i4, int i5, long j) {
        return java.lang.Math.max(i + java.lang.Math.max(i3, java.lang.Math.max(i4, i5)) + i2, androidx.compose.ui.unit.Constraints.m4426getMinWidthimpl(j));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: calculateHeight-O3s9Psw, reason: not valid java name */
    public static final int m1574calculateHeightO3s9Psw(int i, boolean z, int i2, int i3, int i4, int i5, long j, float f, androidx.compose.foundation.layout.PaddingValues paddingValues) {
        float f2 = TextFieldTopPadding * f;
        float top = paddingValues.getTop() * f;
        float bottom = paddingValues.getBottom() * f;
        int max = java.lang.Math.max(i, i5);
        return java.lang.Math.max(kotlin.math.MathKt.roundToInt(z ? i2 + f2 + max + bottom : top + max + bottom), java.lang.Math.max(java.lang.Math.max(i3, i4), androidx.compose.ui.unit.Constraints.m4425getMinHeightimpl(j)));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void placeWithLabel(androidx.compose.ui.layout.Placeable.PlacementScope placementScope, int i, int i2, androidx.compose.ui.layout.Placeable placeable, androidx.compose.ui.layout.Placeable placeable2, androidx.compose.ui.layout.Placeable placeable3, androidx.compose.ui.layout.Placeable placeable4, androidx.compose.ui.layout.Placeable placeable5, boolean z, int i3, int i4, float f, float f2) {
        int roundToInt;
        if (placeable4 != null) {
            androidx.compose.ui.layout.Placeable.PlacementScope.placeRelative$default(placementScope, placeable4, 0, androidx.compose.ui.Alignment.INSTANCE.getCenterVertically().align(placeable4.getHeight(), i2), 0.0f, 4, null);
        }
        if (placeable5 != null) {
            androidx.compose.ui.layout.Placeable.PlacementScope.placeRelative$default(placementScope, placeable5, i - placeable5.getWidth(), androidx.compose.ui.Alignment.INSTANCE.getCenterVertically().align(placeable5.getHeight(), i2), 0.0f, 4, null);
        }
        if (placeable2 != null) {
            if (z) {
                roundToInt = androidx.compose.ui.Alignment.INSTANCE.getCenterVertically().align(placeable2.getHeight(), i2);
            } else {
                roundToInt = kotlin.math.MathKt.roundToInt(androidx.compose.material.TextFieldImplKt.getTextFieldPadding() * f2);
            }
            androidx.compose.ui.layout.Placeable.PlacementScope.placeRelative$default(placementScope, placeable2, androidx.compose.material.TextFieldImplKt.widthOrZero(placeable4), roundToInt - kotlin.math.MathKt.roundToInt((roundToInt - i3) * f), 0.0f, 4, null);
        }
        androidx.compose.ui.layout.Placeable.PlacementScope.placeRelative$default(placementScope, placeable, androidx.compose.material.TextFieldImplKt.widthOrZero(placeable4), i4, 0.0f, 4, null);
        if (placeable3 != null) {
            androidx.compose.ui.layout.Placeable.PlacementScope.placeRelative$default(placementScope, placeable3, androidx.compose.material.TextFieldImplKt.widthOrZero(placeable4), i4, 0.0f, 4, null);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void placeWithoutLabel(androidx.compose.ui.layout.Placeable.PlacementScope placementScope, int i, int i2, androidx.compose.ui.layout.Placeable placeable, androidx.compose.ui.layout.Placeable placeable2, androidx.compose.ui.layout.Placeable placeable3, androidx.compose.ui.layout.Placeable placeable4, boolean z, float f, androidx.compose.foundation.layout.PaddingValues paddingValues) {
        int roundToInt = kotlin.math.MathKt.roundToInt(paddingValues.getTop() * f);
        if (placeable3 != null) {
            androidx.compose.ui.layout.Placeable.PlacementScope.placeRelative$default(placementScope, placeable3, 0, androidx.compose.ui.Alignment.INSTANCE.getCenterVertically().align(placeable3.getHeight(), i2), 0.0f, 4, null);
        }
        if (placeable4 != null) {
            androidx.compose.ui.layout.Placeable.PlacementScope.placeRelative$default(placementScope, placeable4, i - placeable4.getWidth(), androidx.compose.ui.Alignment.INSTANCE.getCenterVertically().align(placeable4.getHeight(), i2), 0.0f, 4, null);
        }
        androidx.compose.ui.layout.Placeable.PlacementScope.placeRelative$default(placementScope, placeable, androidx.compose.material.TextFieldImplKt.widthOrZero(placeable3), z ? androidx.compose.ui.Alignment.INSTANCE.getCenterVertically().align(placeable.getHeight(), i2) : roundToInt, 0.0f, 4, null);
        if (placeable2 != null) {
            if (z) {
                roundToInt = androidx.compose.ui.Alignment.INSTANCE.getCenterVertically().align(placeable2.getHeight(), i2);
            }
            androidx.compose.ui.layout.Placeable.PlacementScope.placeRelative$default(placementScope, placeable2, androidx.compose.material.TextFieldImplKt.widthOrZero(placeable3), roundToInt, 0.0f, 4, null);
        }
    }

    public static final androidx.compose.ui.Modifier drawIndicatorLine(androidx.compose.ui.Modifier modifier, final androidx.compose.foundation.BorderStroke indicatorBorder) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(modifier, "<this>");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(indicatorBorder, "indicatorBorder");
        final float width = indicatorBorder.getWidth();
        return androidx.compose.ui.draw.DrawModifierKt.drawWithContent(modifier, new kotlin.jvm.functions.Function1<androidx.compose.ui.graphics.drawscope.ContentDrawScope, kotlin.Unit>() { // from class: androidx.compose.material.TextFieldKt$drawIndicatorLine$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ kotlin.Unit invoke(androidx.compose.ui.graphics.drawscope.ContentDrawScope contentDrawScope) {
                invoke2(contentDrawScope);
                return kotlin.Unit.INSTANCE;
            }

            /* renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(androidx.compose.ui.graphics.drawscope.ContentDrawScope drawWithContent) {
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(drawWithContent, "$this$drawWithContent");
                drawWithContent.drawContent();
                if (androidx.compose.ui.unit.Dp.m4483equalsimpl0(width, androidx.compose.ui.unit.Dp.INSTANCE.m4496getHairlineD9Ej5fM())) {
                    return;
                }
                float density = width * drawWithContent.getDensity();
                float m1937getHeightimpl = androidx.compose.ui.geometry.Size.m1937getHeightimpl(drawWithContent.mo2592getSizeNHjbRc()) - (density / 2);
                androidx.compose.ui.graphics.drawscope.DrawScope.CC.m2663drawLine1RTmtNc$default(drawWithContent, indicatorBorder.getBrush(), androidx.compose.ui.geometry.OffsetKt.Offset(0.0f, m1937getHeightimpl), androidx.compose.ui.geometry.OffsetKt.Offset(androidx.compose.ui.geometry.Size.m1940getWidthimpl(drawWithContent.mo2592getSizeNHjbRc()), m1937getHeightimpl), density, 0, null, 0.0f, null, 0, 496, null);
            }
        });
    }

    public static final float getFirstBaselineOffset() {
        return FirstBaselineOffset;
    }

    public static final float getTextFieldBottomPadding() {
        return TextFieldBottomPadding;
    }

    public static final float getTextFieldTopPadding() {
        return TextFieldTopPadding;
    }
}
