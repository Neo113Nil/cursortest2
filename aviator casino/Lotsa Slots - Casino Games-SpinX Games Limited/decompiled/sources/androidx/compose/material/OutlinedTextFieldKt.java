package androidx.compose.material;

/* compiled from: OutlinedTextField.kt */
@kotlin.Metadata(d1 = {"\u0000¤\u0001\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\u001a\u0087\u0002\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000b2\u0012\u0010\f\u001a\u000e\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\t0\r2\b\b\u0002\u0010\u000e\u001a\u00020\u000f2\b\b\u0002\u0010\u0010\u001a\u00020\u00112\b\b\u0002\u0010\u0012\u001a\u00020\u00112\b\b\u0002\u0010\u0013\u001a\u00020\u00142\u0015\b\u0002\u0010\u0015\u001a\u000f\u0012\u0004\u0012\u00020\t\u0018\u00010\u0016¢\u0006\u0002\b\u00172\u0015\b\u0002\u0010\u0018\u001a\u000f\u0012\u0004\u0012\u00020\t\u0018\u00010\u0016¢\u0006\u0002\b\u00172\u0015\b\u0002\u0010\u0019\u001a\u000f\u0012\u0004\u0012\u00020\t\u0018\u00010\u0016¢\u0006\u0002\b\u00172\u0015\b\u0002\u0010\u001a\u001a\u000f\u0012\u0004\u0012\u00020\t\u0018\u00010\u0016¢\u0006\u0002\b\u00172\b\b\u0002\u0010\u001b\u001a\u00020\u00112\b\b\u0002\u0010\u001c\u001a\u00020\u001d2\b\b\u0002\u0010\u001e\u001a\u00020\u001f2\b\b\u0002\u0010 \u001a\u00020!2\b\b\u0002\u0010\"\u001a\u00020\u00112\b\b\u0002\u0010#\u001a\u00020$2\b\b\u0002\u0010%\u001a\u00020&2\b\b\u0002\u0010'\u001a\u00020(2\b\b\u0002\u0010)\u001a\u00020*H\u0007¢\u0006\u0002\u0010+\u001a\u0087\u0002\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u00012\u0012\u0010\f\u001a\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\t0\r2\b\b\u0002\u0010\u000e\u001a\u00020\u000f2\b\b\u0002\u0010\u0010\u001a\u00020\u00112\b\b\u0002\u0010\u0012\u001a\u00020\u00112\b\b\u0002\u0010\u0013\u001a\u00020\u00142\u0015\b\u0002\u0010\u0015\u001a\u000f\u0012\u0004\u0012\u00020\t\u0018\u00010\u0016¢\u0006\u0002\b\u00172\u0015\b\u0002\u0010\u0018\u001a\u000f\u0012\u0004\u0012\u00020\t\u0018\u00010\u0016¢\u0006\u0002\b\u00172\u0015\b\u0002\u0010\u0019\u001a\u000f\u0012\u0004\u0012\u00020\t\u0018\u00010\u0016¢\u0006\u0002\b\u00172\u0015\b\u0002\u0010\u001a\u001a\u000f\u0012\u0004\u0012\u00020\t\u0018\u00010\u0016¢\u0006\u0002\b\u00172\b\b\u0002\u0010\u001b\u001a\u00020\u00112\b\b\u0002\u0010\u001c\u001a\u00020\u001d2\b\b\u0002\u0010\u001e\u001a\u00020\u001f2\b\b\u0002\u0010 \u001a\u00020!2\b\b\u0002\u0010\"\u001a\u00020\u00112\b\b\u0002\u0010#\u001a\u00020$2\b\b\u0002\u0010%\u001a\u00020&2\b\b\u0002\u0010'\u001a\u00020(2\b\b\u0002\u0010)\u001a\u00020*H\u0007¢\u0006\u0002\u0010,\u001aÄ\u0001\u0010-\u001a\u00020\t2\u0006\u0010\u000e\u001a\u00020\u000f2\u0011\u0010.\u001a\r\u0012\u0004\u0012\u00020\t0\u0016¢\u0006\u0002\b\u00172\u0019\u0010\u0018\u001a\u0015\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020\t\u0018\u00010\r¢\u0006\u0002\b\u00172\u0013\u0010\u0015\u001a\u000f\u0012\u0004\u0012\u00020\t\u0018\u00010\u0016¢\u0006\u0002\b\u00172\u0013\u0010/\u001a\u000f\u0012\u0004\u0012\u00020\t\u0018\u00010\u0016¢\u0006\u0002\b\u00172\u0013\u00100\u001a\u000f\u0012\u0004\u0012\u00020\t\u0018\u00010\u0016¢\u0006\u0002\b\u00172\u0006\u0010\"\u001a\u00020\u00112\u0006\u00101\u001a\u0002022\u0012\u00103\u001a\u000e\u0012\u0004\u0012\u000204\u0012\u0004\u0012\u00020\t0\r2\u0011\u00105\u001a\r\u0012\u0004\u0012\u00020\t0\u0016¢\u0006\u0002\b\u00172\u0006\u00106\u001a\u000207H\u0001ø\u0001\u0000¢\u0006\u0002\u00108\u001aU\u00109\u001a\u00020$2\u0006\u0010:\u001a\u00020$2\u0006\u0010;\u001a\u00020$2\u0006\u0010<\u001a\u00020$2\u0006\u0010=\u001a\u00020$2\u0006\u0010>\u001a\u00020$2\u0006\u0010?\u001a\u00020@2\u0006\u0010A\u001a\u0002022\u0006\u00106\u001a\u000207H\u0002ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\bB\u0010C\u001aE\u0010D\u001a\u00020$2\u0006\u0010E\u001a\u00020$2\u0006\u0010F\u001a\u00020$2\u0006\u0010G\u001a\u00020$2\u0006\u0010H\u001a\u00020$2\u0006\u0010I\u001a\u00020$2\u0006\u0010?\u001a\u00020@H\u0002ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\bJ\u0010K\u001a)\u0010L\u001a\u00020\u000f*\u00020\u000f2\u0006\u0010M\u001a\u0002042\u0006\u00106\u001a\u000207H\u0000ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\bN\u0010O\u001a|\u0010P\u001a\u00020\t*\u00020Q2\u0006\u0010R\u001a\u00020$2\u0006\u0010S\u001a\u00020$2\b\u0010T\u001a\u0004\u0018\u00010U2\b\u0010V\u001a\u0004\u0018\u00010U2\u0006\u0010W\u001a\u00020U2\b\u0010X\u001a\u0004\u0018\u00010U2\b\u0010Y\u001a\u0004\u0018\u00010U2\u0006\u0010Z\u001a\u00020U2\u0006\u00101\u001a\u0002022\u0006\u0010\"\u001a\u00020\u00112\u0006\u0010A\u001a\u0002022\u0006\u0010[\u001a\u00020\\2\u0006\u00106\u001a\u000207H\u0002\"\u000e\u0010\u0000\u001a\u00020\u0001X\u0080T¢\u0006\u0002\n\u0000\"\u0013\u0010\u0002\u001a\u00020\u0003X\u0082\u0004ø\u0001\u0000¢\u0006\u0004\n\u0002\u0010\u0004\"\u0019\u0010\u0005\u001a\u00020\u0003X\u0080\u0004ø\u0001\u0000¢\u0006\n\n\u0002\u0010\u0004\u001a\u0004\b\u0006\u0010\u0007\u0082\u0002\u000b\n\u0002\b\u0019\n\u0005\b¡\u001e0\u0001¨\u0006]"}, d2 = {"BorderId", "", "OutlinedTextFieldInnerPadding", "Landroidx/compose/ui/unit/Dp;", "F", "OutlinedTextFieldTopPadding", "getOutlinedTextFieldTopPadding", "()F", "OutlinedTextField", "", "value", "Landroidx/compose/ui/text/input/TextFieldValue;", "onValueChange", "Lkotlin/Function1;", "modifier", "Landroidx/compose/ui/Modifier;", "enabled", "", "readOnly", "textStyle", "Landroidx/compose/ui/text/TextStyle;", "label", "Lkotlin/Function0;", "Landroidx/compose/runtime/Composable;", "placeholder", "leadingIcon", "trailingIcon", "isError", "visualTransformation", "Landroidx/compose/ui/text/input/VisualTransformation;", "keyboardOptions", "Landroidx/compose/foundation/text/KeyboardOptions;", "keyboardActions", "Landroidx/compose/foundation/text/KeyboardActions;", "singleLine", com.helpshift.proactive.InAppViewConstants.MAX_LINES, "", "interactionSource", "Landroidx/compose/foundation/interaction/MutableInteractionSource;", "shape", "Landroidx/compose/ui/graphics/Shape;", "colors", "Landroidx/compose/material/TextFieldColors;", "(Landroidx/compose/ui/text/input/TextFieldValue;Lkotlin/jvm/functions/Function1;Landroidx/compose/ui/Modifier;ZZLandroidx/compose/ui/text/TextStyle;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;ZLandroidx/compose/ui/text/input/VisualTransformation;Landroidx/compose/foundation/text/KeyboardOptions;Landroidx/compose/foundation/text/KeyboardActions;ZILandroidx/compose/foundation/interaction/MutableInteractionSource;Landroidx/compose/ui/graphics/Shape;Landroidx/compose/material/TextFieldColors;Landroidx/compose/runtime/Composer;III)V", "(Ljava/lang/String;Lkotlin/jvm/functions/Function1;Landroidx/compose/ui/Modifier;ZZLandroidx/compose/ui/text/TextStyle;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;ZLandroidx/compose/ui/text/input/VisualTransformation;Landroidx/compose/foundation/text/KeyboardOptions;Landroidx/compose/foundation/text/KeyboardActions;ZILandroidx/compose/foundation/interaction/MutableInteractionSource;Landroidx/compose/ui/graphics/Shape;Landroidx/compose/material/TextFieldColors;Landroidx/compose/runtime/Composer;III)V", "OutlinedTextFieldLayout", "textField", "leading", "trailing", "animationProgress", "", "onLabelMeasured", "Landroidx/compose/ui/geometry/Size;", androidx.compose.material.OutlinedTextFieldKt.BorderId, "paddingValues", "Landroidx/compose/foundation/layout/PaddingValues;", "(Landroidx/compose/ui/Modifier;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function3;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;ZFLkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function2;Landroidx/compose/foundation/layout/PaddingValues;Landroidx/compose/runtime/Composer;II)V", "calculateHeight", "leadingPlaceableHeight", "trailingPlaceableHeight", "textFieldPlaceableHeight", "labelPlaceableHeight", "placeholderPlaceableHeight", "constraints", "Landroidx/compose/ui/unit/Constraints;", "density", "calculateHeight-zUg2_y0", "(IIIIIJFLandroidx/compose/foundation/layout/PaddingValues;)I", "calculateWidth", "leadingPlaceableWidth", "trailingPlaceableWidth", "textFieldPlaceableWidth", "labelPlaceableWidth", "placeholderPlaceableWidth", "calculateWidth-VsPV1Ek", "(IIIIIJ)I", "outlineCutout", "labelSize", "outlineCutout-12SF9DM", "(Landroidx/compose/ui/Modifier;JLandroidx/compose/foundation/layout/PaddingValues;)Landroidx/compose/ui/Modifier;", "place", "Landroidx/compose/ui/layout/Placeable$PlacementScope;", "height", "width", "leadingPlaceable", "Landroidx/compose/ui/layout/Placeable;", "trailingPlaceable", "textFieldPlaceable", "labelPlaceable", "placeholderPlaceable", "borderPlaceable", "layoutDirection", "Landroidx/compose/ui/unit/LayoutDirection;", "material_release"}, k = 2, mv = {1, 6, 0}, xi = 48)
/* loaded from: classes.dex */
public final class OutlinedTextFieldKt {
    public static final java.lang.String BorderId = "border";
    private static final float OutlinedTextFieldInnerPadding = androidx.compose.ui.unit.Dp.m4478constructorimpl(4);
    private static final float OutlinedTextFieldTopPadding = androidx.compose.ui.unit.Dp.m4478constructorimpl(8);

    /* JADX WARN: Code restructure failed: missing block: B:57:0x01b6, code lost:
    
        if (r7.changed(r81) == false) goto L145;
     */
    /* JADX WARN: Removed duplicated region for block: B:100:0x02a3  */
    /* JADX WARN: Removed duplicated region for block: B:121:0x047c  */
    /* JADX WARN: Removed duplicated region for block: B:124:0x04cc  */
    /* JADX WARN: Removed duplicated region for block: B:126:0x04e8  */
    /* JADX WARN: Removed duplicated region for block: B:128:0x02f8  */
    /* JADX WARN: Removed duplicated region for block: B:130:0x0301  */
    /* JADX WARN: Removed duplicated region for block: B:132:0x0307  */
    /* JADX WARN: Removed duplicated region for block: B:135:0x030f  */
    /* JADX WARN: Removed duplicated region for block: B:137:0x0339  */
    /* JADX WARN: Removed duplicated region for block: B:139:0x033f  */
    /* JADX WARN: Removed duplicated region for block: B:13:0x0075  */
    /* JADX WARN: Removed duplicated region for block: B:141:0x0345  */
    /* JADX WARN: Removed duplicated region for block: B:143:0x034b  */
    /* JADX WARN: Removed duplicated region for block: B:145:0x0351  */
    /* JADX WARN: Removed duplicated region for block: B:147:0x0357  */
    /* JADX WARN: Removed duplicated region for block: B:150:0x0364  */
    /* JADX WARN: Removed duplicated region for block: B:153:0x0375  */
    /* JADX WARN: Removed duplicated region for block: B:155:0x0382  */
    /* JADX WARN: Removed duplicated region for block: B:157:0x0388  */
    /* JADX WARN: Removed duplicated region for block: B:160:0x0395  */
    /* JADX WARN: Removed duplicated region for block: B:166:0x03c3  */
    /* JADX WARN: Removed duplicated region for block: B:169:0x03e1  */
    /* JADX WARN: Removed duplicated region for block: B:170:0x0440  */
    /* JADX WARN: Removed duplicated region for block: B:171:0x03d8  */
    /* JADX WARN: Removed duplicated region for block: B:172:0x03bb  */
    /* JADX WARN: Removed duplicated region for block: B:173:0x038f  */
    /* JADX WARN: Removed duplicated region for block: B:174:0x0384  */
    /* JADX WARN: Removed duplicated region for block: B:175:0x037e  */
    /* JADX WARN: Removed duplicated region for block: B:176:0x036d  */
    /* JADX WARN: Removed duplicated region for block: B:177:0x035e  */
    /* JADX WARN: Removed duplicated region for block: B:178:0x0353  */
    /* JADX WARN: Removed duplicated region for block: B:179:0x034d  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0099  */
    /* JADX WARN: Removed duplicated region for block: B:180:0x0347  */
    /* JADX WARN: Removed duplicated region for block: B:181:0x0341  */
    /* JADX WARN: Removed duplicated region for block: B:182:0x033b  */
    /* JADX WARN: Removed duplicated region for block: B:183:0x0331  */
    /* JADX WARN: Removed duplicated region for block: B:184:0x0309  */
    /* JADX WARN: Removed duplicated region for block: B:185:0x0303  */
    /* JADX WARN: Removed duplicated region for block: B:186:0x02fd  */
    /* JADX WARN: Removed duplicated region for block: B:188:0x0257  */
    /* JADX WARN: Removed duplicated region for block: B:190:0x0239  */
    /* JADX WARN: Removed duplicated region for block: B:191:0x020c  */
    /* JADX WARN: Removed duplicated region for block: B:198:0x01ec  */
    /* JADX WARN: Removed duplicated region for block: B:205:0x01cd  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x00bb  */
    /* JADX WARN: Removed duplicated region for block: B:212:0x01c0  */
    /* JADX WARN: Removed duplicated region for block: B:215:0x01a6  */
    /* JADX WARN: Removed duplicated region for block: B:216:0x0179  */
    /* JADX WARN: Removed duplicated region for block: B:223:0x015a  */
    /* JADX WARN: Removed duplicated region for block: B:231:0x013c  */
    /* JADX WARN: Removed duplicated region for block: B:238:0x011c  */
    /* JADX WARN: Removed duplicated region for block: B:245:0x00fc  */
    /* JADX WARN: Removed duplicated region for block: B:252:0x00de  */
    /* JADX WARN: Removed duplicated region for block: B:260:0x00cf  */
    /* JADX WARN: Removed duplicated region for block: B:261:0x009e  */
    /* JADX WARN: Removed duplicated region for block: B:268:0x0078  */
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
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void OutlinedTextField(final java.lang.String value, final kotlin.jvm.functions.Function1<? super java.lang.String, kotlin.Unit> onValueChange, androidx.compose.ui.Modifier modifier, boolean z, boolean z2, androidx.compose.ui.text.TextStyle textStyle, kotlin.jvm.functions.Function2<? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.Unit> function2, kotlin.jvm.functions.Function2<? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.Unit> function22, kotlin.jvm.functions.Function2<? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.Unit> function23, kotlin.jvm.functions.Function2<? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.Unit> function24, boolean z3, androidx.compose.ui.text.input.VisualTransformation visualTransformation, androidx.compose.foundation.text.KeyboardOptions keyboardOptions, androidx.compose.foundation.text.KeyboardActions keyboardActions, boolean z4, int i, androidx.compose.foundation.interaction.MutableInteractionSource mutableInteractionSource, androidx.compose.ui.graphics.Shape shape, androidx.compose.material.TextFieldColors textFieldColors, androidx.compose.runtime.Composer composer, final int i2, final int i3, final int i4) {
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
        androidx.compose.ui.Modifier modifier2;
        boolean z5;
        androidx.compose.ui.text.TextStyle textStyle2;
        androidx.compose.foundation.text.KeyboardOptions keyboardOptions2;
        androidx.compose.foundation.text.KeyboardActions keyboardActions2;
        int i18;
        kotlin.jvm.functions.Function2<? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.Unit> function25;
        androidx.compose.foundation.interaction.MutableInteractionSource mutableInteractionSource2;
        androidx.compose.foundation.interaction.MutableInteractionSource mutableInteractionSource3;
        androidx.compose.foundation.shape.CornerBasedShape cornerBasedShape;
        androidx.compose.ui.Modifier modifier3;
        androidx.compose.foundation.text.KeyboardActions keyboardActions3;
        kotlin.jvm.functions.Function2<? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.Unit> function26;
        androidx.compose.foundation.interaction.MutableInteractionSource mutableInteractionSource4;
        kotlin.jvm.functions.Function2<? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.Unit> function27;
        androidx.compose.ui.text.input.VisualTransformation visualTransformation2;
        kotlin.jvm.functions.Function2<? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.Unit> function28;
        kotlin.jvm.functions.Function2<? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.Unit> function29;
        boolean z6;
        androidx.compose.foundation.text.KeyboardOptions keyboardOptions3;
        boolean z7;
        boolean z8;
        androidx.compose.ui.graphics.Shape shape2;
        androidx.compose.ui.text.TextStyle textStyle3;
        boolean z9;
        androidx.compose.material.TextFieldColors m1560outlinedTextFieldColorsdx8h9Zs;
        long m3994getColor0d7_KjU;
        androidx.compose.runtime.Composer composer2;
        final androidx.compose.ui.Modifier modifier4;
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
        final boolean z12;
        final androidx.compose.material.TextFieldColors textFieldColors2;
        final androidx.compose.ui.graphics.Shape shape3;
        final androidx.compose.ui.text.TextStyle textStyle4;
        final boolean z13;
        final int i19;
        int i20;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(value, "value");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(onValueChange, "onValueChange");
        androidx.compose.runtime.Composer startRestartGroup = composer.startRestartGroup(-2099955827);
        androidx.compose.runtime.ComposerKt.sourceInformation(startRestartGroup, "C(OutlinedTextField)P(17,10,9,1,12,15,6,11,7,16,3,18,5,4,14,8,2,13)137@7575L7,148@8135L39,149@8209L6,150@8271L25,166@8821L24,175@9187L20,159@8599L1801:OutlinedTextField.kt#jmzs0o");
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
        int i21 = i4 & 4;
        if (i21 != 0) {
            i5 |= 384;
        } else if ((i2 & 896) == 0) {
            i5 |= startRestartGroup.changed(modifier) ? 256 : 128;
            i6 = i4 & 8;
            int i22 = 2048;
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
                        i20 = 256;
                        i13 |= i20;
                    }
                    i20 = 128;
                    i13 |= i20;
                }
                if ((i3 & 7168) == 0) {
                    if ((i4 & 8192) != 0) {
                    }
                    i22 = 1024;
                    i13 |= i22;
                }
                int i23 = i13;
                i15 = i4 & 16384;
                if (i15 != 0) {
                    i23 |= 24576;
                } else if ((i3 & 57344) == 0) {
                    i23 |= startRestartGroup.changed(z4) ? 16384 : 8192;
                }
                i16 = i4 & 32768;
                if (i16 != 0) {
                    i23 |= androidx.profileinstaller.ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE;
                } else if ((i3 & 458752) == 0) {
                    i23 |= startRestartGroup.changed(i) ? 131072 : 65536;
                }
                i17 = i4 & 65536;
                if (i17 != 0) {
                    i23 |= 1572864;
                } else if ((i3 & 3670016) == 0) {
                    i23 |= startRestartGroup.changed(mutableInteractionSource) ? 1048576 : 524288;
                }
                if ((i3 & 29360128) == 0) {
                    i23 |= ((i4 & 131072) == 0 && startRestartGroup.changed(shape)) ? 8388608 : 4194304;
                }
                if ((i3 & 234881024) == 0) {
                    i23 |= ((i4 & 262144) == 0 && startRestartGroup.changed(textFieldColors)) ? androidx.core.view.accessibility.AccessibilityEventCompat.TYPE_VIEW_TARGETED_BY_SCROLL : 33554432;
                }
                if ((i5 & 1533916891) == 306783378 || (191739611 & i23) != 38347922 || !startRestartGroup.getSkipping()) {
                    startRestartGroup.startDefaults();
                    if ((i2 & 1) != 0 || startRestartGroup.getDefaultsInvalid()) {
                        androidx.compose.ui.Modifier.Companion companion = i21 != 0 ? androidx.compose.ui.Modifier.INSTANCE : modifier;
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
                        boolean z16 = i12 != 0 ? false : z3;
                        androidx.compose.ui.text.input.VisualTransformation none = i14 != 0 ? androidx.compose.ui.text.input.VisualTransformation.INSTANCE.getNone() : visualTransformation;
                        if ((i4 & 4096) != 0) {
                            keyboardOptions2 = androidx.compose.foundation.text.KeyboardOptions.INSTANCE.getDefault();
                            i23 &= -897;
                        } else {
                            keyboardOptions2 = keyboardOptions;
                        }
                        int i24 = i5;
                        if ((i4 & 8192) != 0) {
                            keyboardActions2 = androidx.compose.foundation.text.KeyboardActions.INSTANCE.getDefault();
                            i23 &= -7169;
                        } else {
                            keyboardActions2 = keyboardActions;
                        }
                        boolean z17 = i15 != 0 ? false : z4;
                        i18 = i16 != 0 ? Integer.MAX_VALUE : i;
                        androidx.compose.foundation.text.KeyboardActions keyboardActions5 = keyboardActions2;
                        if (i17 != 0) {
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
                            cornerBasedShape = androidx.compose.material.MaterialTheme.INSTANCE.getShapes(startRestartGroup, 6).getSmall();
                            i23 = (-29360129) & i23;
                        } else {
                            mutableInteractionSource3 = mutableInteractionSource2;
                            cornerBasedShape = shape;
                        }
                        if ((262144 & i4) != 0) {
                            i23 &= -234881025;
                            modifier3 = modifier2;
                            keyboardActions3 = keyboardActions5;
                            function26 = function25;
                            mutableInteractionSource4 = mutableInteractionSource3;
                            function27 = function217;
                            visualTransformation2 = none;
                            function28 = function215;
                            function29 = function214;
                            z6 = z17;
                            keyboardOptions3 = keyboardOptions2;
                            z7 = z15;
                            z8 = z5;
                            shape2 = cornerBasedShape;
                            textStyle3 = textStyle2;
                            z9 = z16;
                            i5 = i24;
                            m1560outlinedTextFieldColorsdx8h9Zs = androidx.compose.material.TextFieldDefaults.INSTANCE.m1560outlinedTextFieldColorsdx8h9Zs(0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, startRestartGroup, 0, 0, 48, 2097151);
                            startRestartGroup.endDefaults();
                            startRestartGroup.startReplaceableGroup(1961394975);
                            androidx.compose.runtime.ComposerKt.sourceInformation(startRestartGroup, "*154@8448L18");
                            m3994getColor0d7_KjU = textStyle3.m3994getColor0d7_KjU();
                            if (m3994getColor0d7_KjU == androidx.compose.ui.graphics.Color.INSTANCE.m2149getUnspecified0d7_KjU()) {
                                m3994getColor0d7_KjU = m1560outlinedTextFieldColorsdx8h9Zs.textColor(z8, startRestartGroup, ((i5 >> 9) & 14) | ((i23 >> 21) & 112)).getValue().m2123unboximpl();
                            }
                            startRestartGroup.endReplaceableGroup();
                            androidx.compose.ui.text.TextStyle merge = textStyle3.merge(new androidx.compose.ui.text.TextStyle(m3994getColor0d7_KjU, 0L, (androidx.compose.ui.text.font.FontWeight) null, (androidx.compose.ui.text.font.FontStyle) null, (androidx.compose.ui.text.font.FontSynthesis) null, (androidx.compose.ui.text.font.FontFamily) null, (java.lang.String) null, 0L, (androidx.compose.ui.text.style.BaselineShift) null, (androidx.compose.ui.text.style.TextGeometricTransform) null, (androidx.compose.ui.text.intl.LocaleList) null, 0L, (androidx.compose.ui.text.style.TextDecoration) null, (androidx.compose.ui.graphics.Shadow) null, (androidx.compose.ui.text.style.TextAlign) null, (androidx.compose.ui.text.style.TextDirection) null, 0L, (androidx.compose.ui.text.style.TextIndent) null, 262142, (kotlin.jvm.internal.DefaultConstructorMarker) null));
                            int i25 = (i23 >> 21) & 112;
                            final boolean z18 = z8;
                            final boolean z19 = z6;
                            final androidx.compose.ui.text.input.VisualTransformation visualTransformation4 = visualTransformation2;
                            final androidx.compose.foundation.interaction.MutableInteractionSource mutableInteractionSource6 = mutableInteractionSource4;
                            final boolean z20 = z9;
                            final kotlin.jvm.functions.Function2<? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.Unit> function218 = function29;
                            final kotlin.jvm.functions.Function2<? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.Unit> function219 = function28;
                            final kotlin.jvm.functions.Function2<? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.Unit> function220 = function26;
                            final kotlin.jvm.functions.Function2<? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.Unit> function221 = function27;
                            final androidx.compose.material.TextFieldColors textFieldColors3 = m1560outlinedTextFieldColorsdx8h9Zs;
                            final int i26 = i5;
                            final int i27 = i23;
                            final androidx.compose.ui.graphics.Shape shape4 = shape2;
                            int i28 = i23 << 12;
                            androidx.compose.ui.graphics.Shape shape5 = shape2;
                            composer2 = startRestartGroup;
                            androidx.compose.ui.text.TextStyle textStyle5 = textStyle3;
                            boolean z21 = z8;
                            androidx.compose.foundation.text.BasicTextFieldKt.BasicTextField(value, onValueChange, androidx.compose.foundation.layout.SizeKt.m601defaultMinSizeVpY3zN4(androidx.compose.foundation.BackgroundKt.m211backgroundbw27NRU(function29 == null ? androidx.compose.foundation.layout.PaddingKt.m572paddingqDBjuR0$default(modifier3, 0.0f, OutlinedTextFieldTopPadding, 0.0f, 0.0f, 13, null) : modifier3, m1560outlinedTextFieldColorsdx8h9Zs.backgroundColor(z8, startRestartGroup, ((i5 >> 9) & 14) | i25).getValue().m2123unboximpl(), shape2), androidx.compose.material.TextFieldDefaults.INSTANCE.m1557getMinWidthD9Ej5fM(), androidx.compose.material.TextFieldDefaults.INSTANCE.m1556getMinHeightD9Ej5fM()), z8, z7, merge, keyboardOptions3, keyboardActions3, z6, i18, visualTransformation2, (kotlin.jvm.functions.Function1) null, mutableInteractionSource4, new androidx.compose.ui.graphics.SolidColor(m1560outlinedTextFieldColorsdx8h9Zs.cursorColor(z9, startRestartGroup, i25 | (i23 & 14)).getValue().m2123unboximpl(), null), androidx.compose.runtime.internal.ComposableLambdaKt.composableLambda(startRestartGroup, 986454116, true, new kotlin.jvm.functions.Function3<kotlin.jvm.functions.Function2<? super androidx.compose.runtime.Composer, ? super java.lang.Integer, ? extends kotlin.Unit>, androidx.compose.runtime.Composer, java.lang.Integer, kotlin.Unit>() { // from class: androidx.compose.material.OutlinedTextFieldKt$OutlinedTextField$2
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
                                    androidx.compose.runtime.ComposerKt.sourceInformation(composer3, "C183@9550L834:OutlinedTextField.kt#jmzs0o");
                                    if ((i29 & 14) == 0) {
                                        i30 = i29 | (composer3.changed(innerTextField) ? 4 : 2);
                                    } else {
                                        i30 = i29;
                                    }
                                    if ((i30 & 91) != 18 || !composer3.getSkipping()) {
                                        androidx.compose.material.TextFieldDefaults textFieldDefaults = androidx.compose.material.TextFieldDefaults.INSTANCE;
                                        java.lang.String str = value;
                                        boolean z22 = z18;
                                        boolean z23 = z19;
                                        androidx.compose.ui.text.input.VisualTransformation visualTransformation5 = visualTransformation4;
                                        androidx.compose.foundation.interaction.MutableInteractionSource mutableInteractionSource7 = mutableInteractionSource6;
                                        boolean z24 = z20;
                                        kotlin.jvm.functions.Function2<androidx.compose.runtime.Composer, java.lang.Integer, kotlin.Unit> function222 = function218;
                                        kotlin.jvm.functions.Function2<androidx.compose.runtime.Composer, java.lang.Integer, kotlin.Unit> function223 = function219;
                                        kotlin.jvm.functions.Function2<androidx.compose.runtime.Composer, java.lang.Integer, kotlin.Unit> function224 = function220;
                                        kotlin.jvm.functions.Function2<androidx.compose.runtime.Composer, java.lang.Integer, kotlin.Unit> function225 = function221;
                                        androidx.compose.material.TextFieldColors textFieldColors4 = textFieldColors3;
                                        final boolean z25 = z18;
                                        final boolean z26 = z20;
                                        final androidx.compose.foundation.interaction.MutableInteractionSource mutableInteractionSource8 = mutableInteractionSource6;
                                        final androidx.compose.material.TextFieldColors textFieldColors5 = textFieldColors3;
                                        final androidx.compose.ui.graphics.Shape shape6 = shape4;
                                        final int i31 = i26;
                                        final int i32 = i27;
                                        androidx.compose.runtime.internal.ComposableLambda composableLambda = androidx.compose.runtime.internal.ComposableLambdaKt.composableLambda(composer3, 329542189, true, new kotlin.jvm.functions.Function2<androidx.compose.runtime.Composer, java.lang.Integer, kotlin.Unit>() { // from class: androidx.compose.material.OutlinedTextFieldKt$OutlinedTextField$2.1
                                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                            {
                                                super(2);
                                            }

                                            @Override // kotlin.jvm.functions.Function2
                                            public /* bridge */ /* synthetic */ kotlin.Unit invoke(androidx.compose.runtime.Composer composer4, java.lang.Integer num) {
                                                invoke(composer4, num.intValue());
                                                return kotlin.Unit.INSTANCE;
                                            }

                                            public final void invoke(androidx.compose.runtime.Composer composer4, int i33) {
                                                androidx.compose.runtime.ComposerKt.sourceInformation(composer4, "C197@10149L203:OutlinedTextField.kt#jmzs0o");
                                                if ((i33 & 11) != 2 || !composer4.getSkipping()) {
                                                    androidx.compose.material.TextFieldDefaults textFieldDefaults2 = androidx.compose.material.TextFieldDefaults.INSTANCE;
                                                    boolean z27 = z25;
                                                    boolean z28 = z26;
                                                    androidx.compose.foundation.interaction.MutableInteractionSource mutableInteractionSource9 = mutableInteractionSource8;
                                                    androidx.compose.material.TextFieldColors textFieldColors6 = textFieldColors5;
                                                    androidx.compose.ui.graphics.Shape shape7 = shape6;
                                                    int i34 = ((i31 >> 9) & 14) | 12582912;
                                                    int i35 = i32;
                                                    textFieldDefaults2.m1554BorderBoxnbWgWpA(z27, z28, mutableInteractionSource9, textFieldColors6, shape7, 0.0f, 0.0f, composer4, i34 | ((i35 << 3) & 112) | ((i35 >> 12) & 896) | ((i35 >> 15) & 7168) | ((i35 >> 9) & 57344), 96);
                                                    return;
                                                }
                                                composer4.skipToGroupEnd();
                                            }
                                        });
                                        int i33 = i26;
                                        int i34 = i27;
                                        textFieldDefaults.OutlinedTextFieldDecorationBox(str, innerTextField, z22, z23, visualTransformation5, mutableInteractionSource7, z24, function222, function223, function224, function225, textFieldColors4, null, composableLambda, composer3, (i33 & 14) | ((i30 << 3) & 112) | ((i33 >> 3) & 896) | ((i34 >> 3) & 7168) | ((i34 << 9) & 57344) | ((i34 >> 3) & 458752) | ((i34 << 18) & 3670016) | ((i33 << 3) & 29360128) | ((i33 << 3) & 234881024) | ((i33 << 3) & 1879048192), ((i33 >> 27) & 14) | 27648 | ((i34 >> 21) & 112), 4096);
                                        return;
                                    }
                                    composer3.skipToGroupEnd();
                                }
                            }), composer2, (i5 & 57344) | (i5 & 14) | (i5 & 112) | (i5 & 7168) | (i28 & 3670016) | (androidx.compose.foundation.text.KeyboardActions.$stable << 21) | (29360128 & i28) | (234881024 & i28) | (i28 & 1879048192), ((i23 >> 3) & 14) | 24576 | ((i23 >> 12) & 896), 2048);
                            modifier4 = modifier3;
                            z10 = z7;
                            function210 = function29;
                            function211 = function28;
                            function212 = function26;
                            function213 = function27;
                            visualTransformation3 = visualTransformation2;
                            keyboardOptions4 = keyboardOptions3;
                            keyboardActions4 = keyboardActions3;
                            z11 = z6;
                            mutableInteractionSource5 = mutableInteractionSource4;
                            z12 = z9;
                            textFieldColors2 = m1560outlinedTextFieldColorsdx8h9Zs;
                            shape3 = shape5;
                            textStyle4 = textStyle5;
                            z13 = z21;
                            i19 = i18;
                        } else {
                            modifier3 = modifier2;
                            keyboardActions3 = keyboardActions5;
                            function26 = function25;
                            mutableInteractionSource4 = mutableInteractionSource3;
                            function27 = function217;
                            visualTransformation2 = none;
                            function28 = function215;
                            function29 = function214;
                            z6 = z17;
                            keyboardOptions3 = keyboardOptions2;
                            z7 = z15;
                            z8 = z5;
                            shape2 = cornerBasedShape;
                            textStyle3 = textStyle2;
                            z9 = z16;
                            i5 = i24;
                        }
                    } else {
                        startRestartGroup.skipToGroupEnd();
                        if ((i4 & 32) != 0) {
                            i5 &= -458753;
                        }
                        if ((i4 & 4096) != 0) {
                            i23 &= -897;
                        }
                        if ((i4 & 8192) != 0) {
                            i23 &= -7169;
                        }
                        if ((i4 & 131072) != 0) {
                            i23 &= -29360129;
                        }
                        if ((262144 & i4) != 0) {
                            i23 &= -234881025;
                        }
                        modifier3 = modifier;
                        z8 = z;
                        z7 = z2;
                        textStyle3 = textStyle;
                        function29 = function2;
                        function28 = function22;
                        function26 = function23;
                        function27 = function24;
                        z9 = z3;
                        visualTransformation2 = visualTransformation;
                        keyboardOptions3 = keyboardOptions;
                        keyboardActions3 = keyboardActions;
                        z6 = z4;
                        i18 = i;
                        mutableInteractionSource4 = mutableInteractionSource;
                        shape2 = shape;
                    }
                    m1560outlinedTextFieldColorsdx8h9Zs = textFieldColors;
                    startRestartGroup.endDefaults();
                    startRestartGroup.startReplaceableGroup(1961394975);
                    androidx.compose.runtime.ComposerKt.sourceInformation(startRestartGroup, "*154@8448L18");
                    m3994getColor0d7_KjU = textStyle3.m3994getColor0d7_KjU();
                    if (m3994getColor0d7_KjU == androidx.compose.ui.graphics.Color.INSTANCE.m2149getUnspecified0d7_KjU()) {
                    }
                    startRestartGroup.endReplaceableGroup();
                    androidx.compose.ui.text.TextStyle merge2 = textStyle3.merge(new androidx.compose.ui.text.TextStyle(m3994getColor0d7_KjU, 0L, (androidx.compose.ui.text.font.FontWeight) null, (androidx.compose.ui.text.font.FontStyle) null, (androidx.compose.ui.text.font.FontSynthesis) null, (androidx.compose.ui.text.font.FontFamily) null, (java.lang.String) null, 0L, (androidx.compose.ui.text.style.BaselineShift) null, (androidx.compose.ui.text.style.TextGeometricTransform) null, (androidx.compose.ui.text.intl.LocaleList) null, 0L, (androidx.compose.ui.text.style.TextDecoration) null, (androidx.compose.ui.graphics.Shadow) null, (androidx.compose.ui.text.style.TextAlign) null, (androidx.compose.ui.text.style.TextDirection) null, 0L, (androidx.compose.ui.text.style.TextIndent) null, 262142, (kotlin.jvm.internal.DefaultConstructorMarker) null));
                    int i252 = (i23 >> 21) & 112;
                    final boolean z182 = z8;
                    final boolean z192 = z6;
                    final androidx.compose.ui.text.input.VisualTransformation visualTransformation42 = visualTransformation2;
                    final androidx.compose.foundation.interaction.MutableInteractionSource mutableInteractionSource62 = mutableInteractionSource4;
                    final boolean z202 = z9;
                    final kotlin.jvm.functions.Function2<? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.Unit> function2182 = function29;
                    final kotlin.jvm.functions.Function2<? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.Unit> function2192 = function28;
                    final kotlin.jvm.functions.Function2<? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.Unit> function2202 = function26;
                    final kotlin.jvm.functions.Function2<? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.Unit> function2212 = function27;
                    final androidx.compose.material.TextFieldColors textFieldColors32 = m1560outlinedTextFieldColorsdx8h9Zs;
                    final int i262 = i5;
                    final int i272 = i23;
                    final androidx.compose.ui.graphics.Shape shape42 = shape2;
                    int i282 = i23 << 12;
                    androidx.compose.ui.graphics.Shape shape52 = shape2;
                    composer2 = startRestartGroup;
                    androidx.compose.ui.text.TextStyle textStyle52 = textStyle3;
                    boolean z212 = z8;
                    androidx.compose.foundation.text.BasicTextFieldKt.BasicTextField(value, onValueChange, androidx.compose.foundation.layout.SizeKt.m601defaultMinSizeVpY3zN4(androidx.compose.foundation.BackgroundKt.m211backgroundbw27NRU(function29 == null ? androidx.compose.foundation.layout.PaddingKt.m572paddingqDBjuR0$default(modifier3, 0.0f, OutlinedTextFieldTopPadding, 0.0f, 0.0f, 13, null) : modifier3, m1560outlinedTextFieldColorsdx8h9Zs.backgroundColor(z8, startRestartGroup, ((i5 >> 9) & 14) | i252).getValue().m2123unboximpl(), shape2), androidx.compose.material.TextFieldDefaults.INSTANCE.m1557getMinWidthD9Ej5fM(), androidx.compose.material.TextFieldDefaults.INSTANCE.m1556getMinHeightD9Ej5fM()), z8, z7, merge2, keyboardOptions3, keyboardActions3, z6, i18, visualTransformation2, (kotlin.jvm.functions.Function1) null, mutableInteractionSource4, new androidx.compose.ui.graphics.SolidColor(m1560outlinedTextFieldColorsdx8h9Zs.cursorColor(z9, startRestartGroup, i252 | (i23 & 14)).getValue().m2123unboximpl(), null), androidx.compose.runtime.internal.ComposableLambdaKt.composableLambda(startRestartGroup, 986454116, true, new kotlin.jvm.functions.Function3<kotlin.jvm.functions.Function2<? super androidx.compose.runtime.Composer, ? super java.lang.Integer, ? extends kotlin.Unit>, androidx.compose.runtime.Composer, java.lang.Integer, kotlin.Unit>() { // from class: androidx.compose.material.OutlinedTextFieldKt$OutlinedTextField$2
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
                            androidx.compose.runtime.ComposerKt.sourceInformation(composer3, "C183@9550L834:OutlinedTextField.kt#jmzs0o");
                            if ((i29 & 14) == 0) {
                                i30 = i29 | (composer3.changed(innerTextField) ? 4 : 2);
                            } else {
                                i30 = i29;
                            }
                            if ((i30 & 91) != 18 || !composer3.getSkipping()) {
                                androidx.compose.material.TextFieldDefaults textFieldDefaults = androidx.compose.material.TextFieldDefaults.INSTANCE;
                                java.lang.String str = value;
                                boolean z22 = z182;
                                boolean z23 = z192;
                                androidx.compose.ui.text.input.VisualTransformation visualTransformation5 = visualTransformation42;
                                androidx.compose.foundation.interaction.MutableInteractionSource mutableInteractionSource7 = mutableInteractionSource62;
                                boolean z24 = z202;
                                kotlin.jvm.functions.Function2<androidx.compose.runtime.Composer, java.lang.Integer, kotlin.Unit> function222 = function2182;
                                kotlin.jvm.functions.Function2<androidx.compose.runtime.Composer, java.lang.Integer, kotlin.Unit> function223 = function2192;
                                kotlin.jvm.functions.Function2<androidx.compose.runtime.Composer, java.lang.Integer, kotlin.Unit> function224 = function2202;
                                kotlin.jvm.functions.Function2<androidx.compose.runtime.Composer, java.lang.Integer, kotlin.Unit> function225 = function2212;
                                androidx.compose.material.TextFieldColors textFieldColors4 = textFieldColors32;
                                final boolean z25 = z182;
                                final boolean z26 = z202;
                                final androidx.compose.foundation.interaction.MutableInteractionSource mutableInteractionSource8 = mutableInteractionSource62;
                                final androidx.compose.material.TextFieldColors textFieldColors5 = textFieldColors32;
                                final androidx.compose.ui.graphics.Shape shape6 = shape42;
                                final int i31 = i262;
                                final int i32 = i272;
                                androidx.compose.runtime.internal.ComposableLambda composableLambda = androidx.compose.runtime.internal.ComposableLambdaKt.composableLambda(composer3, 329542189, true, new kotlin.jvm.functions.Function2<androidx.compose.runtime.Composer, java.lang.Integer, kotlin.Unit>() { // from class: androidx.compose.material.OutlinedTextFieldKt$OutlinedTextField$2.1
                                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                    {
                                        super(2);
                                    }

                                    @Override // kotlin.jvm.functions.Function2
                                    public /* bridge */ /* synthetic */ kotlin.Unit invoke(androidx.compose.runtime.Composer composer4, java.lang.Integer num) {
                                        invoke(composer4, num.intValue());
                                        return kotlin.Unit.INSTANCE;
                                    }

                                    public final void invoke(androidx.compose.runtime.Composer composer4, int i33) {
                                        androidx.compose.runtime.ComposerKt.sourceInformation(composer4, "C197@10149L203:OutlinedTextField.kt#jmzs0o");
                                        if ((i33 & 11) != 2 || !composer4.getSkipping()) {
                                            androidx.compose.material.TextFieldDefaults textFieldDefaults2 = androidx.compose.material.TextFieldDefaults.INSTANCE;
                                            boolean z27 = z25;
                                            boolean z28 = z26;
                                            androidx.compose.foundation.interaction.MutableInteractionSource mutableInteractionSource9 = mutableInteractionSource8;
                                            androidx.compose.material.TextFieldColors textFieldColors6 = textFieldColors5;
                                            androidx.compose.ui.graphics.Shape shape7 = shape6;
                                            int i34 = ((i31 >> 9) & 14) | 12582912;
                                            int i35 = i32;
                                            textFieldDefaults2.m1554BorderBoxnbWgWpA(z27, z28, mutableInteractionSource9, textFieldColors6, shape7, 0.0f, 0.0f, composer4, i34 | ((i35 << 3) & 112) | ((i35 >> 12) & 896) | ((i35 >> 15) & 7168) | ((i35 >> 9) & 57344), 96);
                                            return;
                                        }
                                        composer4.skipToGroupEnd();
                                    }
                                });
                                int i33 = i262;
                                int i34 = i272;
                                textFieldDefaults.OutlinedTextFieldDecorationBox(str, innerTextField, z22, z23, visualTransformation5, mutableInteractionSource7, z24, function222, function223, function224, function225, textFieldColors4, null, composableLambda, composer3, (i33 & 14) | ((i30 << 3) & 112) | ((i33 >> 3) & 896) | ((i34 >> 3) & 7168) | ((i34 << 9) & 57344) | ((i34 >> 3) & 458752) | ((i34 << 18) & 3670016) | ((i33 << 3) & 29360128) | ((i33 << 3) & 234881024) | ((i33 << 3) & 1879048192), ((i33 >> 27) & 14) | 27648 | ((i34 >> 21) & 112), 4096);
                                return;
                            }
                            composer3.skipToGroupEnd();
                        }
                    }), composer2, (i5 & 57344) | (i5 & 14) | (i5 & 112) | (i5 & 7168) | (i282 & 3670016) | (androidx.compose.foundation.text.KeyboardActions.$stable << 21) | (29360128 & i282) | (234881024 & i282) | (i282 & 1879048192), ((i23 >> 3) & 14) | 24576 | ((i23 >> 12) & 896), 2048);
                    modifier4 = modifier3;
                    z10 = z7;
                    function210 = function29;
                    function211 = function28;
                    function212 = function26;
                    function213 = function27;
                    visualTransformation3 = visualTransformation2;
                    keyboardOptions4 = keyboardOptions3;
                    keyboardActions4 = keyboardActions3;
                    z11 = z6;
                    mutableInteractionSource5 = mutableInteractionSource4;
                    z12 = z9;
                    textFieldColors2 = m1560outlinedTextFieldColorsdx8h9Zs;
                    shape3 = shape52;
                    textStyle4 = textStyle52;
                    z13 = z212;
                    i19 = i18;
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
                    i19 = i;
                    mutableInteractionSource5 = mutableInteractionSource;
                    shape3 = shape;
                    textFieldColors2 = textFieldColors;
                    composer2 = startRestartGroup;
                    function210 = function2;
                }
                androidx.compose.runtime.ScopeUpdateScope endRestartGroup = composer2.endRestartGroup();
                if (endRestartGroup == null) {
                    return;
                }
                endRestartGroup.updateScope(new kotlin.jvm.functions.Function2<androidx.compose.runtime.Composer, java.lang.Integer, kotlin.Unit>() { // from class: androidx.compose.material.OutlinedTextFieldKt$OutlinedTextField$3
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
                        androidx.compose.material.OutlinedTextFieldKt.OutlinedTextField(value, onValueChange, modifier4, z13, z10, textStyle4, function210, function211, function212, function213, z12, visualTransformation3, keyboardOptions4, keyboardActions4, z11, i19, mutableInteractionSource5, shape3, textFieldColors2, composer3, i2 | 1, i3, i4);
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
            int i232 = i13;
            i15 = i4 & 16384;
            if (i15 != 0) {
            }
            i16 = i4 & 32768;
            if (i16 != 0) {
            }
            i17 = i4 & 65536;
            if (i17 != 0) {
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
            if (i21 != 0) {
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
            if (i15 != 0) {
            }
            if (i16 != 0) {
            }
            androidx.compose.foundation.text.KeyboardActions keyboardActions52 = keyboardActions2;
            if (i17 != 0) {
            }
            if ((i4 & 131072) != 0) {
            }
            if ((262144 & i4) != 0) {
            }
        }
        i6 = i4 & 8;
        int i222 = 2048;
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
        int i2322 = i13;
        i15 = i4 & 16384;
        if (i15 != 0) {
        }
        i16 = i4 & 32768;
        if (i16 != 0) {
        }
        i17 = i4 & 65536;
        if (i17 != 0) {
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
        if (i21 != 0) {
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
        if (i15 != 0) {
        }
        if (i16 != 0) {
        }
        androidx.compose.foundation.text.KeyboardActions keyboardActions522 = keyboardActions2;
        if (i17 != 0) {
        }
        if ((i4 & 131072) != 0) {
        }
        if ((262144 & i4) != 0) {
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:57:0x01b6, code lost:
    
        if (r7.changed(r81) == false) goto L145;
     */
    /* JADX WARN: Removed duplicated region for block: B:100:0x02a3  */
    /* JADX WARN: Removed duplicated region for block: B:121:0x0497  */
    /* JADX WARN: Removed duplicated region for block: B:124:0x04e7  */
    /* JADX WARN: Removed duplicated region for block: B:126:0x0503  */
    /* JADX WARN: Removed duplicated region for block: B:128:0x02f8  */
    /* JADX WARN: Removed duplicated region for block: B:130:0x0301  */
    /* JADX WARN: Removed duplicated region for block: B:132:0x0307  */
    /* JADX WARN: Removed duplicated region for block: B:135:0x030f  */
    /* JADX WARN: Removed duplicated region for block: B:137:0x0339  */
    /* JADX WARN: Removed duplicated region for block: B:139:0x033f  */
    /* JADX WARN: Removed duplicated region for block: B:13:0x0075  */
    /* JADX WARN: Removed duplicated region for block: B:141:0x0345  */
    /* JADX WARN: Removed duplicated region for block: B:143:0x034b  */
    /* JADX WARN: Removed duplicated region for block: B:145:0x0351  */
    /* JADX WARN: Removed duplicated region for block: B:147:0x0357  */
    /* JADX WARN: Removed duplicated region for block: B:150:0x0364  */
    /* JADX WARN: Removed duplicated region for block: B:153:0x0375  */
    /* JADX WARN: Removed duplicated region for block: B:155:0x03a3  */
    /* JADX WARN: Removed duplicated region for block: B:157:0x03a9  */
    /* JADX WARN: Removed duplicated region for block: B:160:0x03b6  */
    /* JADX WARN: Removed duplicated region for block: B:166:0x03e4  */
    /* JADX WARN: Removed duplicated region for block: B:169:0x03fc  */
    /* JADX WARN: Removed duplicated region for block: B:170:0x045b  */
    /* JADX WARN: Removed duplicated region for block: B:171:0x03f3  */
    /* JADX WARN: Removed duplicated region for block: B:172:0x03dc  */
    /* JADX WARN: Removed duplicated region for block: B:173:0x03b0  */
    /* JADX WARN: Removed duplicated region for block: B:174:0x03a5  */
    /* JADX WARN: Removed duplicated region for block: B:175:0x039f  */
    /* JADX WARN: Removed duplicated region for block: B:176:0x036d  */
    /* JADX WARN: Removed duplicated region for block: B:177:0x035e  */
    /* JADX WARN: Removed duplicated region for block: B:178:0x0353  */
    /* JADX WARN: Removed duplicated region for block: B:179:0x034d  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0099  */
    /* JADX WARN: Removed duplicated region for block: B:180:0x0347  */
    /* JADX WARN: Removed duplicated region for block: B:181:0x0341  */
    /* JADX WARN: Removed duplicated region for block: B:182:0x033b  */
    /* JADX WARN: Removed duplicated region for block: B:183:0x0331  */
    /* JADX WARN: Removed duplicated region for block: B:184:0x0309  */
    /* JADX WARN: Removed duplicated region for block: B:185:0x0303  */
    /* JADX WARN: Removed duplicated region for block: B:186:0x02fd  */
    /* JADX WARN: Removed duplicated region for block: B:188:0x0257  */
    /* JADX WARN: Removed duplicated region for block: B:190:0x0239  */
    /* JADX WARN: Removed duplicated region for block: B:191:0x020c  */
    /* JADX WARN: Removed duplicated region for block: B:198:0x01ec  */
    /* JADX WARN: Removed duplicated region for block: B:205:0x01cd  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x00bb  */
    /* JADX WARN: Removed duplicated region for block: B:212:0x01c0  */
    /* JADX WARN: Removed duplicated region for block: B:215:0x01a6  */
    /* JADX WARN: Removed duplicated region for block: B:216:0x0179  */
    /* JADX WARN: Removed duplicated region for block: B:223:0x015a  */
    /* JADX WARN: Removed duplicated region for block: B:231:0x013c  */
    /* JADX WARN: Removed duplicated region for block: B:238:0x011c  */
    /* JADX WARN: Removed duplicated region for block: B:245:0x00fc  */
    /* JADX WARN: Removed duplicated region for block: B:252:0x00de  */
    /* JADX WARN: Removed duplicated region for block: B:260:0x00cf  */
    /* JADX WARN: Removed duplicated region for block: B:261:0x009e  */
    /* JADX WARN: Removed duplicated region for block: B:268:0x0078  */
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
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void OutlinedTextField(final androidx.compose.ui.text.input.TextFieldValue value, final kotlin.jvm.functions.Function1<? super androidx.compose.ui.text.input.TextFieldValue, kotlin.Unit> onValueChange, androidx.compose.ui.Modifier modifier, boolean z, boolean z2, androidx.compose.ui.text.TextStyle textStyle, kotlin.jvm.functions.Function2<? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.Unit> function2, kotlin.jvm.functions.Function2<? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.Unit> function22, kotlin.jvm.functions.Function2<? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.Unit> function23, kotlin.jvm.functions.Function2<? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.Unit> function24, boolean z3, androidx.compose.ui.text.input.VisualTransformation visualTransformation, androidx.compose.foundation.text.KeyboardOptions keyboardOptions, androidx.compose.foundation.text.KeyboardActions keyboardActions, boolean z4, int i, androidx.compose.foundation.interaction.MutableInteractionSource mutableInteractionSource, androidx.compose.ui.graphics.Shape shape, androidx.compose.material.TextFieldColors textFieldColors, androidx.compose.runtime.Composer composer, final int i2, final int i3, final int i4) {
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
        androidx.compose.ui.Modifier modifier2;
        boolean z5;
        androidx.compose.ui.text.TextStyle textStyle2;
        androidx.compose.foundation.text.KeyboardOptions keyboardOptions2;
        androidx.compose.foundation.text.KeyboardActions keyboardActions2;
        int i18;
        kotlin.jvm.functions.Function2<? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.Unit> function25;
        androidx.compose.foundation.interaction.MutableInteractionSource mutableInteractionSource2;
        androidx.compose.foundation.interaction.MutableInteractionSource mutableInteractionSource3;
        androidx.compose.ui.graphics.Shape shape2;
        androidx.compose.ui.Modifier modifier3;
        androidx.compose.foundation.text.KeyboardActions keyboardActions3;
        kotlin.jvm.functions.Function2<? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.Unit> function26;
        androidx.compose.foundation.interaction.MutableInteractionSource mutableInteractionSource4;
        kotlin.jvm.functions.Function2<? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.Unit> function27;
        androidx.compose.ui.text.input.VisualTransformation visualTransformation2;
        kotlin.jvm.functions.Function2<? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.Unit> function28;
        kotlin.jvm.functions.Function2<? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.Unit> function29;
        boolean z6;
        androidx.compose.foundation.text.KeyboardOptions keyboardOptions3;
        boolean z7;
        boolean z8;
        androidx.compose.ui.graphics.Shape shape3;
        androidx.compose.ui.text.TextStyle textStyle3;
        boolean z9;
        androidx.compose.material.TextFieldColors m1560outlinedTextFieldColorsdx8h9Zs;
        long m3994getColor0d7_KjU;
        androidx.compose.runtime.Composer composer2;
        final androidx.compose.ui.Modifier modifier4;
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
        final boolean z12;
        final androidx.compose.material.TextFieldColors textFieldColors2;
        final androidx.compose.ui.graphics.Shape shape4;
        final androidx.compose.ui.text.TextStyle textStyle4;
        final boolean z13;
        final int i19;
        int i20;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(value, "value");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(onValueChange, "onValueChange");
        androidx.compose.runtime.Composer startRestartGroup = composer.startRestartGroup(-288998816);
        androidx.compose.runtime.ComposerKt.sourceInformation(startRestartGroup, "C(OutlinedTextField)P(17,10,9,1,12,15,6,11,7,16,3,18,5,4,14,8,2,13)281@15178L7,292@15732L39,293@15810L22,294@15882L25,310@16432L24,319@16798L20,303@16210L1806:OutlinedTextField.kt#jmzs0o");
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
        int i21 = i4 & 4;
        if (i21 != 0) {
            i5 |= 384;
        } else if ((i2 & 896) == 0) {
            i5 |= startRestartGroup.changed(modifier) ? 256 : 128;
            i6 = i4 & 8;
            int i22 = 2048;
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
                        i20 = 256;
                        i13 |= i20;
                    }
                    i20 = 128;
                    i13 |= i20;
                }
                if ((i3 & 7168) == 0) {
                    if ((i4 & 8192) != 0) {
                    }
                    i22 = 1024;
                    i13 |= i22;
                }
                int i23 = i13;
                i15 = i4 & 16384;
                if (i15 != 0) {
                    i23 |= 24576;
                } else if ((i3 & 57344) == 0) {
                    i23 |= startRestartGroup.changed(z4) ? 16384 : 8192;
                }
                i16 = i4 & 32768;
                if (i16 != 0) {
                    i23 |= androidx.profileinstaller.ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE;
                } else if ((i3 & 458752) == 0) {
                    i23 |= startRestartGroup.changed(i) ? 131072 : 65536;
                }
                i17 = i4 & 65536;
                if (i17 != 0) {
                    i23 |= 1572864;
                } else if ((i3 & 3670016) == 0) {
                    i23 |= startRestartGroup.changed(mutableInteractionSource) ? 1048576 : 524288;
                }
                if ((i3 & 29360128) == 0) {
                    i23 |= ((i4 & 131072) == 0 && startRestartGroup.changed(shape)) ? 8388608 : 4194304;
                }
                if ((i3 & 234881024) == 0) {
                    i23 |= ((i4 & 262144) == 0 && startRestartGroup.changed(textFieldColors)) ? androidx.core.view.accessibility.AccessibilityEventCompat.TYPE_VIEW_TARGETED_BY_SCROLL : 33554432;
                }
                if ((i5 & 1533916891) == 306783378 || (191739611 & i23) != 38347922 || !startRestartGroup.getSkipping()) {
                    startRestartGroup.startDefaults();
                    if ((i2 & 1) != 0 || startRestartGroup.getDefaultsInvalid()) {
                        androidx.compose.ui.Modifier.Companion companion = i21 != 0 ? androidx.compose.ui.Modifier.INSTANCE : modifier;
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
                        boolean z16 = i12 != 0 ? false : z3;
                        androidx.compose.ui.text.input.VisualTransformation none = i14 != 0 ? androidx.compose.ui.text.input.VisualTransformation.INSTANCE.getNone() : visualTransformation;
                        if ((i4 & 4096) != 0) {
                            keyboardOptions2 = androidx.compose.foundation.text.KeyboardOptions.INSTANCE.getDefault();
                            i23 &= -897;
                        } else {
                            keyboardOptions2 = keyboardOptions;
                        }
                        int i24 = i5;
                        if ((i4 & 8192) != 0) {
                            keyboardActions2 = new androidx.compose.foundation.text.KeyboardActions(null, null, null, null, null, null, 63, null);
                            i23 &= -7169;
                        } else {
                            keyboardActions2 = keyboardActions;
                        }
                        boolean z17 = i15 != 0 ? false : z4;
                        i18 = i16 != 0 ? Integer.MAX_VALUE : i;
                        androidx.compose.foundation.text.KeyboardActions keyboardActions5 = keyboardActions2;
                        if (i17 != 0) {
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
                            shape2 = androidx.compose.material.TextFieldDefaults.INSTANCE.getOutlinedTextFieldShape(startRestartGroup, 6);
                            i23 = (-29360129) & i23;
                        } else {
                            mutableInteractionSource3 = mutableInteractionSource2;
                            shape2 = shape;
                        }
                        if ((262144 & i4) != 0) {
                            i23 &= -234881025;
                            modifier3 = modifier2;
                            keyboardActions3 = keyboardActions5;
                            function26 = function25;
                            mutableInteractionSource4 = mutableInteractionSource3;
                            function27 = function217;
                            visualTransformation2 = none;
                            function28 = function215;
                            function29 = function214;
                            z6 = z17;
                            keyboardOptions3 = keyboardOptions2;
                            z7 = z15;
                            z8 = z5;
                            shape3 = shape2;
                            textStyle3 = textStyle2;
                            z9 = z16;
                            i5 = i24;
                            m1560outlinedTextFieldColorsdx8h9Zs = androidx.compose.material.TextFieldDefaults.INSTANCE.m1560outlinedTextFieldColorsdx8h9Zs(0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, startRestartGroup, 0, 0, 48, 2097151);
                            startRestartGroup.endDefaults();
                            startRestartGroup.startReplaceableGroup(1961402586);
                            androidx.compose.runtime.ComposerKt.sourceInformation(startRestartGroup, "*298@16059L18");
                            m3994getColor0d7_KjU = textStyle3.m3994getColor0d7_KjU();
                            if (m3994getColor0d7_KjU == androidx.compose.ui.graphics.Color.INSTANCE.m2149getUnspecified0d7_KjU()) {
                                m3994getColor0d7_KjU = m1560outlinedTextFieldColorsdx8h9Zs.textColor(z8, startRestartGroup, ((i5 >> 9) & 14) | ((i23 >> 21) & 112)).getValue().m2123unboximpl();
                            }
                            startRestartGroup.endReplaceableGroup();
                            androidx.compose.ui.text.TextStyle merge = textStyle3.merge(new androidx.compose.ui.text.TextStyle(m3994getColor0d7_KjU, 0L, (androidx.compose.ui.text.font.FontWeight) null, (androidx.compose.ui.text.font.FontStyle) null, (androidx.compose.ui.text.font.FontSynthesis) null, (androidx.compose.ui.text.font.FontFamily) null, (java.lang.String) null, 0L, (androidx.compose.ui.text.style.BaselineShift) null, (androidx.compose.ui.text.style.TextGeometricTransform) null, (androidx.compose.ui.text.intl.LocaleList) null, 0L, (androidx.compose.ui.text.style.TextDecoration) null, (androidx.compose.ui.graphics.Shadow) null, (androidx.compose.ui.text.style.TextAlign) null, (androidx.compose.ui.text.style.TextDirection) null, 0L, (androidx.compose.ui.text.style.TextIndent) null, 262142, (kotlin.jvm.internal.DefaultConstructorMarker) null));
                            int i25 = (i23 >> 21) & 112;
                            final boolean z18 = z8;
                            final boolean z19 = z6;
                            final androidx.compose.ui.text.input.VisualTransformation visualTransformation4 = visualTransformation2;
                            final androidx.compose.foundation.interaction.MutableInteractionSource mutableInteractionSource6 = mutableInteractionSource4;
                            final boolean z20 = z9;
                            final kotlin.jvm.functions.Function2<? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.Unit> function218 = function29;
                            final kotlin.jvm.functions.Function2<? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.Unit> function219 = function28;
                            final kotlin.jvm.functions.Function2<? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.Unit> function220 = function26;
                            final kotlin.jvm.functions.Function2<? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.Unit> function221 = function27;
                            final androidx.compose.material.TextFieldColors textFieldColors3 = m1560outlinedTextFieldColorsdx8h9Zs;
                            final int i26 = i5;
                            final int i27 = i23;
                            final androidx.compose.ui.graphics.Shape shape5 = shape3;
                            int i28 = i23 << 12;
                            androidx.compose.ui.graphics.Shape shape6 = shape3;
                            composer2 = startRestartGroup;
                            androidx.compose.ui.text.TextStyle textStyle5 = textStyle3;
                            boolean z21 = z8;
                            androidx.compose.foundation.text.BasicTextFieldKt.BasicTextField(value, onValueChange, androidx.compose.foundation.layout.SizeKt.m601defaultMinSizeVpY3zN4(androidx.compose.foundation.BackgroundKt.m211backgroundbw27NRU(function29 == null ? androidx.compose.foundation.layout.PaddingKt.m572paddingqDBjuR0$default(modifier3, 0.0f, OutlinedTextFieldTopPadding, 0.0f, 0.0f, 13, null) : modifier3, m1560outlinedTextFieldColorsdx8h9Zs.backgroundColor(z8, startRestartGroup, ((i5 >> 9) & 14) | i25).getValue().m2123unboximpl(), shape3), androidx.compose.material.TextFieldDefaults.INSTANCE.m1557getMinWidthD9Ej5fM(), androidx.compose.material.TextFieldDefaults.INSTANCE.m1556getMinHeightD9Ej5fM()), z8, z7, merge, keyboardOptions3, keyboardActions3, z6, i18, visualTransformation2, (kotlin.jvm.functions.Function1) null, mutableInteractionSource4, new androidx.compose.ui.graphics.SolidColor(m1560outlinedTextFieldColorsdx8h9Zs.cursorColor(z9, startRestartGroup, i25 | (i23 & 14)).getValue().m2123unboximpl(), null), androidx.compose.runtime.internal.ComposableLambdaKt.composableLambda(startRestartGroup, -1219079113, true, new kotlin.jvm.functions.Function3<kotlin.jvm.functions.Function2<? super androidx.compose.runtime.Composer, ? super java.lang.Integer, ? extends kotlin.Unit>, androidx.compose.runtime.Composer, java.lang.Integer, kotlin.Unit>() { // from class: androidx.compose.material.OutlinedTextFieldKt$OutlinedTextField$5
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
                                    androidx.compose.runtime.ComposerKt.sourceInformation(composer3, "C327@17161L839:OutlinedTextField.kt#jmzs0o");
                                    if ((i29 & 14) == 0) {
                                        i30 = i29 | (composer3.changed(innerTextField) ? 4 : 2);
                                    } else {
                                        i30 = i29;
                                    }
                                    if ((i30 & 91) != 18 || !composer3.getSkipping()) {
                                        androidx.compose.material.TextFieldDefaults textFieldDefaults = androidx.compose.material.TextFieldDefaults.INSTANCE;
                                        java.lang.String text = androidx.compose.ui.text.input.TextFieldValue.this.getText();
                                        boolean z22 = z18;
                                        boolean z23 = z19;
                                        androidx.compose.ui.text.input.VisualTransformation visualTransformation5 = visualTransformation4;
                                        androidx.compose.foundation.interaction.MutableInteractionSource mutableInteractionSource7 = mutableInteractionSource6;
                                        boolean z24 = z20;
                                        kotlin.jvm.functions.Function2<androidx.compose.runtime.Composer, java.lang.Integer, kotlin.Unit> function222 = function218;
                                        kotlin.jvm.functions.Function2<androidx.compose.runtime.Composer, java.lang.Integer, kotlin.Unit> function223 = function219;
                                        kotlin.jvm.functions.Function2<androidx.compose.runtime.Composer, java.lang.Integer, kotlin.Unit> function224 = function220;
                                        kotlin.jvm.functions.Function2<androidx.compose.runtime.Composer, java.lang.Integer, kotlin.Unit> function225 = function221;
                                        androidx.compose.material.TextFieldColors textFieldColors4 = textFieldColors3;
                                        final boolean z25 = z18;
                                        final boolean z26 = z20;
                                        final androidx.compose.foundation.interaction.MutableInteractionSource mutableInteractionSource8 = mutableInteractionSource6;
                                        final androidx.compose.material.TextFieldColors textFieldColors5 = textFieldColors3;
                                        final androidx.compose.ui.graphics.Shape shape7 = shape5;
                                        final int i31 = i26;
                                        final int i32 = i27;
                                        androidx.compose.runtime.internal.ComposableLambda composableLambda = androidx.compose.runtime.internal.ComposableLambdaKt.composableLambda(composer3, 1225313536, true, new kotlin.jvm.functions.Function2<androidx.compose.runtime.Composer, java.lang.Integer, kotlin.Unit>() { // from class: androidx.compose.material.OutlinedTextFieldKt$OutlinedTextField$5.1
                                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                            {
                                                super(2);
                                            }

                                            @Override // kotlin.jvm.functions.Function2
                                            public /* bridge */ /* synthetic */ kotlin.Unit invoke(androidx.compose.runtime.Composer composer4, java.lang.Integer num) {
                                                invoke(composer4, num.intValue());
                                                return kotlin.Unit.INSTANCE;
                                            }

                                            public final void invoke(androidx.compose.runtime.Composer composer4, int i33) {
                                                androidx.compose.runtime.ComposerKt.sourceInformation(composer4, "C341@17765L203:OutlinedTextField.kt#jmzs0o");
                                                if ((i33 & 11) != 2 || !composer4.getSkipping()) {
                                                    androidx.compose.material.TextFieldDefaults textFieldDefaults2 = androidx.compose.material.TextFieldDefaults.INSTANCE;
                                                    boolean z27 = z25;
                                                    boolean z28 = z26;
                                                    androidx.compose.foundation.interaction.MutableInteractionSource mutableInteractionSource9 = mutableInteractionSource8;
                                                    androidx.compose.material.TextFieldColors textFieldColors6 = textFieldColors5;
                                                    androidx.compose.ui.graphics.Shape shape8 = shape7;
                                                    int i34 = ((i31 >> 9) & 14) | 12582912;
                                                    int i35 = i32;
                                                    textFieldDefaults2.m1554BorderBoxnbWgWpA(z27, z28, mutableInteractionSource9, textFieldColors6, shape8, 0.0f, 0.0f, composer4, i34 | ((i35 << 3) & 112) | ((i35 >> 12) & 896) | ((i35 >> 15) & 7168) | ((i35 >> 9) & 57344), 96);
                                                    return;
                                                }
                                                composer4.skipToGroupEnd();
                                            }
                                        });
                                        int i33 = i26;
                                        int i34 = i27;
                                        textFieldDefaults.OutlinedTextFieldDecorationBox(text, innerTextField, z22, z23, visualTransformation5, mutableInteractionSource7, z24, function222, function223, function224, function225, textFieldColors4, null, composableLambda, composer3, ((i30 << 3) & 112) | ((i33 >> 3) & 896) | ((i34 >> 3) & 7168) | ((i34 << 9) & 57344) | ((i34 >> 3) & 458752) | ((i34 << 18) & 3670016) | ((i33 << 3) & 29360128) | ((i33 << 3) & 234881024) | ((i33 << 3) & 1879048192), ((i33 >> 27) & 14) | 27648 | ((i34 >> 21) & 112), 4096);
                                        return;
                                    }
                                    composer3.skipToGroupEnd();
                                }
                            }), composer2, (i5 & 57344) | (i5 & 14) | (i5 & 112) | (i5 & 7168) | (i28 & 3670016) | (androidx.compose.foundation.text.KeyboardActions.$stable << 21) | (29360128 & i28) | (234881024 & i28) | (i28 & 1879048192), ((i23 >> 3) & 14) | 24576 | ((i23 >> 12) & 896), 2048);
                            modifier4 = modifier3;
                            z10 = z7;
                            function210 = function29;
                            function211 = function28;
                            function212 = function26;
                            function213 = function27;
                            visualTransformation3 = visualTransformation2;
                            keyboardOptions4 = keyboardOptions3;
                            keyboardActions4 = keyboardActions3;
                            z11 = z6;
                            mutableInteractionSource5 = mutableInteractionSource4;
                            z12 = z9;
                            textFieldColors2 = m1560outlinedTextFieldColorsdx8h9Zs;
                            shape4 = shape6;
                            textStyle4 = textStyle5;
                            z13 = z21;
                            i19 = i18;
                        } else {
                            modifier3 = modifier2;
                            keyboardActions3 = keyboardActions5;
                            function26 = function25;
                            mutableInteractionSource4 = mutableInteractionSource3;
                            function27 = function217;
                            visualTransformation2 = none;
                            function28 = function215;
                            function29 = function214;
                            z6 = z17;
                            keyboardOptions3 = keyboardOptions2;
                            z7 = z15;
                            z8 = z5;
                            shape3 = shape2;
                            textStyle3 = textStyle2;
                            z9 = z16;
                            i5 = i24;
                        }
                    } else {
                        startRestartGroup.skipToGroupEnd();
                        if ((i4 & 32) != 0) {
                            i5 &= -458753;
                        }
                        if ((i4 & 4096) != 0) {
                            i23 &= -897;
                        }
                        if ((i4 & 8192) != 0) {
                            i23 &= -7169;
                        }
                        if ((i4 & 131072) != 0) {
                            i23 &= -29360129;
                        }
                        if ((262144 & i4) != 0) {
                            i23 &= -234881025;
                        }
                        modifier3 = modifier;
                        z8 = z;
                        z7 = z2;
                        textStyle3 = textStyle;
                        function29 = function2;
                        function28 = function22;
                        function26 = function23;
                        function27 = function24;
                        z9 = z3;
                        visualTransformation2 = visualTransformation;
                        keyboardOptions3 = keyboardOptions;
                        keyboardActions3 = keyboardActions;
                        z6 = z4;
                        i18 = i;
                        mutableInteractionSource4 = mutableInteractionSource;
                        shape3 = shape;
                    }
                    m1560outlinedTextFieldColorsdx8h9Zs = textFieldColors;
                    startRestartGroup.endDefaults();
                    startRestartGroup.startReplaceableGroup(1961402586);
                    androidx.compose.runtime.ComposerKt.sourceInformation(startRestartGroup, "*298@16059L18");
                    m3994getColor0d7_KjU = textStyle3.m3994getColor0d7_KjU();
                    if (m3994getColor0d7_KjU == androidx.compose.ui.graphics.Color.INSTANCE.m2149getUnspecified0d7_KjU()) {
                    }
                    startRestartGroup.endReplaceableGroup();
                    androidx.compose.ui.text.TextStyle merge2 = textStyle3.merge(new androidx.compose.ui.text.TextStyle(m3994getColor0d7_KjU, 0L, (androidx.compose.ui.text.font.FontWeight) null, (androidx.compose.ui.text.font.FontStyle) null, (androidx.compose.ui.text.font.FontSynthesis) null, (androidx.compose.ui.text.font.FontFamily) null, (java.lang.String) null, 0L, (androidx.compose.ui.text.style.BaselineShift) null, (androidx.compose.ui.text.style.TextGeometricTransform) null, (androidx.compose.ui.text.intl.LocaleList) null, 0L, (androidx.compose.ui.text.style.TextDecoration) null, (androidx.compose.ui.graphics.Shadow) null, (androidx.compose.ui.text.style.TextAlign) null, (androidx.compose.ui.text.style.TextDirection) null, 0L, (androidx.compose.ui.text.style.TextIndent) null, 262142, (kotlin.jvm.internal.DefaultConstructorMarker) null));
                    int i252 = (i23 >> 21) & 112;
                    final boolean z182 = z8;
                    final boolean z192 = z6;
                    final androidx.compose.ui.text.input.VisualTransformation visualTransformation42 = visualTransformation2;
                    final androidx.compose.foundation.interaction.MutableInteractionSource mutableInteractionSource62 = mutableInteractionSource4;
                    final boolean z202 = z9;
                    final kotlin.jvm.functions.Function2<? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.Unit> function2182 = function29;
                    final kotlin.jvm.functions.Function2<? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.Unit> function2192 = function28;
                    final kotlin.jvm.functions.Function2<? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.Unit> function2202 = function26;
                    final kotlin.jvm.functions.Function2<? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.Unit> function2212 = function27;
                    final androidx.compose.material.TextFieldColors textFieldColors32 = m1560outlinedTextFieldColorsdx8h9Zs;
                    final int i262 = i5;
                    final int i272 = i23;
                    final androidx.compose.ui.graphics.Shape shape52 = shape3;
                    int i282 = i23 << 12;
                    androidx.compose.ui.graphics.Shape shape62 = shape3;
                    composer2 = startRestartGroup;
                    androidx.compose.ui.text.TextStyle textStyle52 = textStyle3;
                    boolean z212 = z8;
                    androidx.compose.foundation.text.BasicTextFieldKt.BasicTextField(value, onValueChange, androidx.compose.foundation.layout.SizeKt.m601defaultMinSizeVpY3zN4(androidx.compose.foundation.BackgroundKt.m211backgroundbw27NRU(function29 == null ? androidx.compose.foundation.layout.PaddingKt.m572paddingqDBjuR0$default(modifier3, 0.0f, OutlinedTextFieldTopPadding, 0.0f, 0.0f, 13, null) : modifier3, m1560outlinedTextFieldColorsdx8h9Zs.backgroundColor(z8, startRestartGroup, ((i5 >> 9) & 14) | i252).getValue().m2123unboximpl(), shape3), androidx.compose.material.TextFieldDefaults.INSTANCE.m1557getMinWidthD9Ej5fM(), androidx.compose.material.TextFieldDefaults.INSTANCE.m1556getMinHeightD9Ej5fM()), z8, z7, merge2, keyboardOptions3, keyboardActions3, z6, i18, visualTransformation2, (kotlin.jvm.functions.Function1) null, mutableInteractionSource4, new androidx.compose.ui.graphics.SolidColor(m1560outlinedTextFieldColorsdx8h9Zs.cursorColor(z9, startRestartGroup, i252 | (i23 & 14)).getValue().m2123unboximpl(), null), androidx.compose.runtime.internal.ComposableLambdaKt.composableLambda(startRestartGroup, -1219079113, true, new kotlin.jvm.functions.Function3<kotlin.jvm.functions.Function2<? super androidx.compose.runtime.Composer, ? super java.lang.Integer, ? extends kotlin.Unit>, androidx.compose.runtime.Composer, java.lang.Integer, kotlin.Unit>() { // from class: androidx.compose.material.OutlinedTextFieldKt$OutlinedTextField$5
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
                            androidx.compose.runtime.ComposerKt.sourceInformation(composer3, "C327@17161L839:OutlinedTextField.kt#jmzs0o");
                            if ((i29 & 14) == 0) {
                                i30 = i29 | (composer3.changed(innerTextField) ? 4 : 2);
                            } else {
                                i30 = i29;
                            }
                            if ((i30 & 91) != 18 || !composer3.getSkipping()) {
                                androidx.compose.material.TextFieldDefaults textFieldDefaults = androidx.compose.material.TextFieldDefaults.INSTANCE;
                                java.lang.String text = androidx.compose.ui.text.input.TextFieldValue.this.getText();
                                boolean z22 = z182;
                                boolean z23 = z192;
                                androidx.compose.ui.text.input.VisualTransformation visualTransformation5 = visualTransformation42;
                                androidx.compose.foundation.interaction.MutableInteractionSource mutableInteractionSource7 = mutableInteractionSource62;
                                boolean z24 = z202;
                                kotlin.jvm.functions.Function2<androidx.compose.runtime.Composer, java.lang.Integer, kotlin.Unit> function222 = function2182;
                                kotlin.jvm.functions.Function2<androidx.compose.runtime.Composer, java.lang.Integer, kotlin.Unit> function223 = function2192;
                                kotlin.jvm.functions.Function2<androidx.compose.runtime.Composer, java.lang.Integer, kotlin.Unit> function224 = function2202;
                                kotlin.jvm.functions.Function2<androidx.compose.runtime.Composer, java.lang.Integer, kotlin.Unit> function225 = function2212;
                                androidx.compose.material.TextFieldColors textFieldColors4 = textFieldColors32;
                                final boolean z25 = z182;
                                final boolean z26 = z202;
                                final androidx.compose.foundation.interaction.MutableInteractionSource mutableInteractionSource8 = mutableInteractionSource62;
                                final androidx.compose.material.TextFieldColors textFieldColors5 = textFieldColors32;
                                final androidx.compose.ui.graphics.Shape shape7 = shape52;
                                final int i31 = i262;
                                final int i32 = i272;
                                androidx.compose.runtime.internal.ComposableLambda composableLambda = androidx.compose.runtime.internal.ComposableLambdaKt.composableLambda(composer3, 1225313536, true, new kotlin.jvm.functions.Function2<androidx.compose.runtime.Composer, java.lang.Integer, kotlin.Unit>() { // from class: androidx.compose.material.OutlinedTextFieldKt$OutlinedTextField$5.1
                                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                    {
                                        super(2);
                                    }

                                    @Override // kotlin.jvm.functions.Function2
                                    public /* bridge */ /* synthetic */ kotlin.Unit invoke(androidx.compose.runtime.Composer composer4, java.lang.Integer num) {
                                        invoke(composer4, num.intValue());
                                        return kotlin.Unit.INSTANCE;
                                    }

                                    public final void invoke(androidx.compose.runtime.Composer composer4, int i33) {
                                        androidx.compose.runtime.ComposerKt.sourceInformation(composer4, "C341@17765L203:OutlinedTextField.kt#jmzs0o");
                                        if ((i33 & 11) != 2 || !composer4.getSkipping()) {
                                            androidx.compose.material.TextFieldDefaults textFieldDefaults2 = androidx.compose.material.TextFieldDefaults.INSTANCE;
                                            boolean z27 = z25;
                                            boolean z28 = z26;
                                            androidx.compose.foundation.interaction.MutableInteractionSource mutableInteractionSource9 = mutableInteractionSource8;
                                            androidx.compose.material.TextFieldColors textFieldColors6 = textFieldColors5;
                                            androidx.compose.ui.graphics.Shape shape8 = shape7;
                                            int i34 = ((i31 >> 9) & 14) | 12582912;
                                            int i35 = i32;
                                            textFieldDefaults2.m1554BorderBoxnbWgWpA(z27, z28, mutableInteractionSource9, textFieldColors6, shape8, 0.0f, 0.0f, composer4, i34 | ((i35 << 3) & 112) | ((i35 >> 12) & 896) | ((i35 >> 15) & 7168) | ((i35 >> 9) & 57344), 96);
                                            return;
                                        }
                                        composer4.skipToGroupEnd();
                                    }
                                });
                                int i33 = i262;
                                int i34 = i272;
                                textFieldDefaults.OutlinedTextFieldDecorationBox(text, innerTextField, z22, z23, visualTransformation5, mutableInteractionSource7, z24, function222, function223, function224, function225, textFieldColors4, null, composableLambda, composer3, ((i30 << 3) & 112) | ((i33 >> 3) & 896) | ((i34 >> 3) & 7168) | ((i34 << 9) & 57344) | ((i34 >> 3) & 458752) | ((i34 << 18) & 3670016) | ((i33 << 3) & 29360128) | ((i33 << 3) & 234881024) | ((i33 << 3) & 1879048192), ((i33 >> 27) & 14) | 27648 | ((i34 >> 21) & 112), 4096);
                                return;
                            }
                            composer3.skipToGroupEnd();
                        }
                    }), composer2, (i5 & 57344) | (i5 & 14) | (i5 & 112) | (i5 & 7168) | (i282 & 3670016) | (androidx.compose.foundation.text.KeyboardActions.$stable << 21) | (29360128 & i282) | (234881024 & i282) | (i282 & 1879048192), ((i23 >> 3) & 14) | 24576 | ((i23 >> 12) & 896), 2048);
                    modifier4 = modifier3;
                    z10 = z7;
                    function210 = function29;
                    function211 = function28;
                    function212 = function26;
                    function213 = function27;
                    visualTransformation3 = visualTransformation2;
                    keyboardOptions4 = keyboardOptions3;
                    keyboardActions4 = keyboardActions3;
                    z11 = z6;
                    mutableInteractionSource5 = mutableInteractionSource4;
                    z12 = z9;
                    textFieldColors2 = m1560outlinedTextFieldColorsdx8h9Zs;
                    shape4 = shape62;
                    textStyle4 = textStyle52;
                    z13 = z212;
                    i19 = i18;
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
                    i19 = i;
                    mutableInteractionSource5 = mutableInteractionSource;
                    shape4 = shape;
                    textFieldColors2 = textFieldColors;
                    composer2 = startRestartGroup;
                    function210 = function2;
                }
                androidx.compose.runtime.ScopeUpdateScope endRestartGroup = composer2.endRestartGroup();
                if (endRestartGroup == null) {
                    return;
                }
                endRestartGroup.updateScope(new kotlin.jvm.functions.Function2<androidx.compose.runtime.Composer, java.lang.Integer, kotlin.Unit>() { // from class: androidx.compose.material.OutlinedTextFieldKt$OutlinedTextField$6
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
                        androidx.compose.material.OutlinedTextFieldKt.OutlinedTextField(androidx.compose.ui.text.input.TextFieldValue.this, onValueChange, modifier4, z13, z10, textStyle4, function210, function211, function212, function213, z12, visualTransformation3, keyboardOptions4, keyboardActions4, z11, i19, mutableInteractionSource5, shape4, textFieldColors2, composer3, i2 | 1, i3, i4);
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
            int i232 = i13;
            i15 = i4 & 16384;
            if (i15 != 0) {
            }
            i16 = i4 & 32768;
            if (i16 != 0) {
            }
            i17 = i4 & 65536;
            if (i17 != 0) {
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
            if (i21 != 0) {
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
            if (i15 != 0) {
            }
            if (i16 != 0) {
            }
            androidx.compose.foundation.text.KeyboardActions keyboardActions52 = keyboardActions2;
            if (i17 != 0) {
            }
            if ((i4 & 131072) != 0) {
            }
            if ((262144 & i4) != 0) {
            }
        }
        i6 = i4 & 8;
        int i222 = 2048;
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
        int i2322 = i13;
        i15 = i4 & 16384;
        if (i15 != 0) {
        }
        i16 = i4 & 32768;
        if (i16 != 0) {
        }
        i17 = i4 & 65536;
        if (i17 != 0) {
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
        if (i21 != 0) {
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
        if (i15 != 0) {
        }
        if (i16 != 0) {
        }
        androidx.compose.foundation.text.KeyboardActions keyboardActions522 = keyboardActions2;
        if (i17 != 0) {
        }
        if ((i4 & 131072) != 0) {
        }
        if ((262144 & i4) != 0) {
        }
    }

    public static final void OutlinedTextFieldLayout(final androidx.compose.ui.Modifier modifier, final kotlin.jvm.functions.Function2<? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.Unit> textField, final kotlin.jvm.functions.Function3<? super androidx.compose.ui.Modifier, ? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.Unit> function3, final kotlin.jvm.functions.Function2<? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.Unit> function2, final kotlin.jvm.functions.Function2<? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.Unit> function22, final kotlin.jvm.functions.Function2<? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.Unit> function23, final boolean z, final float f, final kotlin.jvm.functions.Function1<? super androidx.compose.ui.geometry.Size, kotlin.Unit> onLabelMeasured, final kotlin.jvm.functions.Function2<? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.Unit> border, final androidx.compose.foundation.layout.PaddingValues paddingValues, androidx.compose.runtime.Composer composer, final int i, final int i2) {
        int i3;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(modifier, "modifier");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(textField, "textField");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(onLabelMeasured, "onLabelMeasured");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(border, "border");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(paddingValues, "paddingValues");
        androidx.compose.runtime.Composer startRestartGroup = composer.startRestartGroup(-2049536174);
        androidx.compose.runtime.ComposerKt.sourceInformation(startRestartGroup, "C(OutlinedTextFieldLayout)P(4,9,7,2,3,10,8!1,5)374@18737L239,382@19024L7,383@19036L2308:OutlinedTextField.kt#jmzs0o");
        int i4 = (i & 14) == 0 ? (startRestartGroup.changed(modifier) ? 4 : 2) | i : i;
        if ((i & 112) == 0) {
            i4 |= startRestartGroup.changed(textField) ? 32 : 16;
        }
        if ((i & 896) == 0) {
            i4 |= startRestartGroup.changed(function3) ? 256 : 128;
        }
        if ((i & 7168) == 0) {
            i4 |= startRestartGroup.changed(function2) ? 2048 : 1024;
        }
        if ((57344 & i) == 0) {
            i4 |= startRestartGroup.changed(function22) ? 16384 : 8192;
        }
        if ((458752 & i) == 0) {
            i4 |= startRestartGroup.changed(function23) ? 131072 : 65536;
        }
        if ((3670016 & i) == 0) {
            i4 |= startRestartGroup.changed(z) ? 1048576 : 524288;
        }
        if ((29360128 & i) == 0) {
            i4 |= startRestartGroup.changed(f) ? 8388608 : 4194304;
        }
        if ((234881024 & i) == 0) {
            i4 |= startRestartGroup.changed(onLabelMeasured) ? androidx.core.view.accessibility.AccessibilityEventCompat.TYPE_VIEW_TARGETED_BY_SCROLL : 33554432;
        }
        if ((1879048192 & i) == 0) {
            i4 |= startRestartGroup.changed(border) ? 536870912 : 268435456;
        }
        int i5 = (i2 & 14) == 0 ? i2 | (startRestartGroup.changed(paddingValues) ? 4 : 2) : i2;
        if ((i4 & 1533916891) != 306783378 || (i5 & 11) != 2 || !startRestartGroup.getSkipping()) {
            java.lang.Object[] objArr = {onLabelMeasured, java.lang.Boolean.valueOf(z), java.lang.Float.valueOf(f), paddingValues};
            startRestartGroup.startReplaceableGroup(-568225417);
            androidx.compose.runtime.ComposerKt.sourceInformation(startRestartGroup, "C(remember)P(1):Composables.kt#9igjgp");
            boolean z2 = false;
            for (int i6 = 0; i6 < 4; i6++) {
                z2 |= startRestartGroup.changed(objArr[i6]);
            }
            java.lang.Object rememberedValue = startRestartGroup.rememberedValue();
            if (z2 || rememberedValue == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                rememberedValue = new androidx.compose.material.OutlinedTextFieldMeasurePolicy(onLabelMeasured, z, f, paddingValues);
                startRestartGroup.updateRememberedValue(rememberedValue);
            }
            startRestartGroup.endReplaceableGroup();
            androidx.compose.material.OutlinedTextFieldMeasurePolicy outlinedTextFieldMeasurePolicy = (androidx.compose.material.OutlinedTextFieldMeasurePolicy) rememberedValue;
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
            androidx.compose.runtime.Updater.m1648setimpl(m1641constructorimpl, outlinedTextFieldMeasurePolicy, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetMeasurePolicy());
            androidx.compose.runtime.Updater.m1648setimpl(m1641constructorimpl, density, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetDensity());
            androidx.compose.runtime.Updater.m1648setimpl(m1641constructorimpl, layoutDirection2, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetLayoutDirection());
            androidx.compose.runtime.Updater.m1648setimpl(m1641constructorimpl, viewConfiguration, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetViewConfiguration());
            startRestartGroup.enableReusing();
            materializerOf.invoke(androidx.compose.runtime.SkippableUpdater.m1632boximpl(androidx.compose.runtime.SkippableUpdater.m1633constructorimpl(startRestartGroup)), startRestartGroup, 0);
            startRestartGroup.startReplaceableGroup(2058660585);
            startRestartGroup.startReplaceableGroup(118153609);
            androidx.compose.runtime.ComposerKt.sourceInformation(startRestartGroup, "C391@19540L8,430@20988L182,438@21221L54:OutlinedTextField.kt#jmzs0o");
            border.invoke(startRestartGroup, java.lang.Integer.valueOf((i4 >> 27) & 14));
            startRestartGroup.startReplaceableGroup(1169914108);
            androidx.compose.runtime.ComposerKt.sourceInformation(startRestartGroup, "394@19601L219");
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
                startRestartGroup.startReplaceableGroup(1691709354);
                androidx.compose.runtime.ComposerKt.sourceInformation(startRestartGroup, "C398@19793L9:OutlinedTextField.kt#jmzs0o");
                function22.invoke(startRestartGroup, java.lang.Integer.valueOf((i4 >> 12) & 14));
                startRestartGroup.endReplaceableGroup();
                startRestartGroup.endReplaceableGroup();
                startRestartGroup.endReplaceableGroup();
                startRestartGroup.endNode();
                startRestartGroup.endReplaceableGroup();
                startRestartGroup.endReplaceableGroup();
            }
            startRestartGroup.endReplaceableGroup();
            startRestartGroup.startReplaceableGroup(1169914393);
            androidx.compose.runtime.ComposerKt.sourceInformation(startRestartGroup, "402@19887L221");
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
                startRestartGroup.startReplaceableGroup(-1351586719);
                androidx.compose.runtime.ComposerKt.sourceInformation(startRestartGroup, "C406@20080L10:OutlinedTextField.kt#jmzs0o");
                function23.invoke(startRestartGroup, java.lang.Integer.valueOf((i4 >> 15) & 14));
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
            startRestartGroup.startReplaceableGroup(1169915404);
            androidx.compose.runtime.ComposerKt.sourceInformation(startRestartGroup, "427@20901L59");
            if (function3 != null) {
                function3.invoke(androidx.compose.ui.layout.LayoutIdKt.layoutId(androidx.compose.ui.Modifier.INSTANCE, androidx.compose.material.TextFieldImplKt.PlaceholderId).then(m572paddingqDBjuR0$default), startRestartGroup, java.lang.Integer.valueOf((i4 >> 3) & 112));
            }
            startRestartGroup.endReplaceableGroup();
            androidx.compose.ui.Modifier then3 = androidx.compose.ui.layout.LayoutIdKt.layoutId(androidx.compose.ui.Modifier.INSTANCE, androidx.compose.material.TextFieldImplKt.TextFieldId).then(m572paddingqDBjuR0$default);
            startRestartGroup.startReplaceableGroup(733328855);
            androidx.compose.runtime.ComposerKt.sourceInformation(startRestartGroup, "C(Box)P(2,1,3)70@3267L67,71@3339L130:Box.kt#2w3rfo");
            androidx.compose.ui.layout.MeasurePolicy rememberBoxMeasurePolicy3 = androidx.compose.foundation.layout.BoxKt.rememberBoxMeasurePolicy(androidx.compose.ui.Alignment.INSTANCE.getTopStart(), true, startRestartGroup, 48);
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
            startRestartGroup.startReplaceableGroup(-1205597937);
            androidx.compose.runtime.ComposerKt.sourceInformation(startRestartGroup, "C434@21145L11:OutlinedTextField.kt#jmzs0o");
            textField.invoke(startRestartGroup, java.lang.Integer.valueOf((i4 >> 3) & 14));
            startRestartGroup.endReplaceableGroup();
            startRestartGroup.endReplaceableGroup();
            startRestartGroup.endReplaceableGroup();
            startRestartGroup.endNode();
            startRestartGroup.endReplaceableGroup();
            startRestartGroup.endReplaceableGroup();
            if (function2 != null) {
                androidx.compose.ui.Modifier layoutId = androidx.compose.ui.layout.LayoutIdKt.layoutId(androidx.compose.ui.Modifier.INSTANCE, androidx.compose.material.TextFieldImplKt.LabelId);
                startRestartGroup.startReplaceableGroup(733328855);
                androidx.compose.runtime.ComposerKt.sourceInformation(startRestartGroup, "C(Box)P(2,1,3)70@3267L67,71@3339L130:Box.kt#2w3rfo");
                androidx.compose.ui.layout.MeasurePolicy rememberBoxMeasurePolicy4 = androidx.compose.foundation.layout.BoxKt.rememberBoxMeasurePolicy(androidx.compose.ui.Alignment.INSTANCE.getTopStart(), false, startRestartGroup, 0);
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
                kotlin.jvm.functions.Function3<androidx.compose.runtime.SkippableUpdater<androidx.compose.ui.node.ComposeUiNode>, androidx.compose.runtime.Composer, java.lang.Integer, kotlin.Unit> materializerOf5 = androidx.compose.ui.layout.LayoutKt.materializerOf(layoutId);
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
                startRestartGroup.startReplaceableGroup(-55131805);
                androidx.compose.runtime.ComposerKt.sourceInformation(startRestartGroup, "C438@21266L7:OutlinedTextField.kt#jmzs0o");
                function2.invoke(startRestartGroup, java.lang.Integer.valueOf((i4 >> 9) & 14));
                startRestartGroup.endReplaceableGroup();
                startRestartGroup.endReplaceableGroup();
                startRestartGroup.endReplaceableGroup();
                startRestartGroup.endNode();
                startRestartGroup.endReplaceableGroup();
                startRestartGroup.endReplaceableGroup();
            }
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
        endRestartGroup.updateScope(new kotlin.jvm.functions.Function2<androidx.compose.runtime.Composer, java.lang.Integer, kotlin.Unit>() { // from class: androidx.compose.material.OutlinedTextFieldKt$OutlinedTextFieldLayout$2
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

            public final void invoke(androidx.compose.runtime.Composer composer2, int i7) {
                androidx.compose.material.OutlinedTextFieldKt.OutlinedTextFieldLayout(androidx.compose.ui.Modifier.this, textField, function3, function2, function22, function23, z, f, onLabelMeasured, border, paddingValues, composer2, i | 1, i2);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: calculateWidth-VsPV1Ek, reason: not valid java name */
    public static final int m1449calculateWidthVsPV1Ek(int i, int i2, int i3, int i4, int i5, long j) {
        return java.lang.Math.max(i + java.lang.Math.max(i3, java.lang.Math.max(i4, i5)) + i2, androidx.compose.ui.unit.Constraints.m4426getMinWidthimpl(j));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: calculateHeight-zUg2_y0, reason: not valid java name */
    public static final int m1448calculateHeightzUg2_y0(int i, int i2, int i3, int i4, int i5, long j, float f, androidx.compose.foundation.layout.PaddingValues paddingValues) {
        return java.lang.Math.max(androidx.compose.ui.unit.Constraints.m4425getMinHeightimpl(j), java.lang.Math.max(i, java.lang.Math.max(i2, kotlin.math.MathKt.roundToInt(java.lang.Math.max(i3, i5) + (paddingValues.getBottom() * f) + java.lang.Math.max(paddingValues.getTop() * f, i4 / 2.0f)))));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void place(androidx.compose.ui.layout.Placeable.PlacementScope placementScope, int i, int i2, androidx.compose.ui.layout.Placeable placeable, androidx.compose.ui.layout.Placeable placeable2, androidx.compose.ui.layout.Placeable placeable3, androidx.compose.ui.layout.Placeable placeable4, androidx.compose.ui.layout.Placeable placeable5, androidx.compose.ui.layout.Placeable placeable6, float f, boolean z, float f2, androidx.compose.ui.unit.LayoutDirection layoutDirection, androidx.compose.foundation.layout.PaddingValues paddingValues) {
        int roundToInt = kotlin.math.MathKt.roundToInt(paddingValues.getTop() * f2);
        int roundToInt2 = kotlin.math.MathKt.roundToInt(androidx.compose.foundation.layout.PaddingKt.calculateStartPadding(paddingValues, layoutDirection) * f2);
        float horizontalIconPadding = androidx.compose.material.TextFieldImplKt.getHorizontalIconPadding() * f2;
        if (placeable != null) {
            androidx.compose.ui.layout.Placeable.PlacementScope.placeRelative$default(placementScope, placeable, 0, androidx.compose.ui.Alignment.INSTANCE.getCenterVertically().align(placeable.getHeight(), i), 0.0f, 4, null);
        }
        if (placeable2 != null) {
            androidx.compose.ui.layout.Placeable.PlacementScope.placeRelative$default(placementScope, placeable2, i2 - placeable2.getWidth(), androidx.compose.ui.Alignment.INSTANCE.getCenterVertically().align(placeable2.getHeight(), i), 0.0f, 4, null);
        }
        if (placeable4 != null) {
            float f3 = 1 - f;
            androidx.compose.ui.layout.Placeable.PlacementScope.placeRelative$default(placementScope, placeable4, kotlin.math.MathKt.roundToInt(placeable == null ? 0.0f : f3 * (androidx.compose.material.TextFieldImplKt.widthOrZero(placeable) - horizontalIconPadding)) + roundToInt2, kotlin.math.MathKt.roundToInt(((z ? androidx.compose.ui.Alignment.INSTANCE.getCenterVertically().align(placeable4.getHeight(), i) : roundToInt) * f3) - ((placeable4.getHeight() / 2) * f)), 0.0f, 4, null);
        }
        androidx.compose.ui.layout.Placeable.PlacementScope.placeRelative$default(placementScope, placeable3, androidx.compose.material.TextFieldImplKt.widthOrZero(placeable), java.lang.Math.max(z ? androidx.compose.ui.Alignment.INSTANCE.getCenterVertically().align(placeable3.getHeight(), i) : roundToInt, androidx.compose.material.TextFieldImplKt.heightOrZero(placeable4) / 2), 0.0f, 4, null);
        if (placeable5 != null) {
            if (z) {
                roundToInt = androidx.compose.ui.Alignment.INSTANCE.getCenterVertically().align(placeable5.getHeight(), i);
            }
            androidx.compose.ui.layout.Placeable.PlacementScope.placeRelative$default(placementScope, placeable5, androidx.compose.material.TextFieldImplKt.widthOrZero(placeable), roundToInt, 0.0f, 4, null);
        }
        androidx.compose.ui.layout.Placeable.PlacementScope.m3456place70tqf50$default(placementScope, placeable6, androidx.compose.ui.unit.IntOffset.INSTANCE.m4620getZeronOccac(), 0.0f, 2, null);
    }

    /* renamed from: outlineCutout-12SF9DM, reason: not valid java name */
    public static final androidx.compose.ui.Modifier m1450outlineCutout12SF9DM(androidx.compose.ui.Modifier outlineCutout, final long j, final androidx.compose.foundation.layout.PaddingValues paddingValues) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(outlineCutout, "$this$outlineCutout");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(paddingValues, "paddingValues");
        return androidx.compose.ui.draw.DrawModifierKt.drawWithContent(outlineCutout, new kotlin.jvm.functions.Function1<androidx.compose.ui.graphics.drawscope.ContentDrawScope, kotlin.Unit>() { // from class: androidx.compose.material.OutlinedTextFieldKt$outlineCutout$1

            /* compiled from: OutlinedTextField.kt */
            @kotlin.Metadata(k = 3, mv = {1, 6, 0}, xi = 48)
            public /* synthetic */ class WhenMappings {
                public static final /* synthetic */ int[] $EnumSwitchMapping$0;

                static {
                    int[] iArr = new int[androidx.compose.ui.unit.LayoutDirection.values().length];
                    iArr[androidx.compose.ui.unit.LayoutDirection.Rtl.ordinal()] = 1;
                    $EnumSwitchMapping$0 = iArr;
                }
            }

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
                float f;
                float coerceAtLeast;
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(drawWithContent, "$this$drawWithContent");
                float m1940getWidthimpl = androidx.compose.ui.geometry.Size.m1940getWidthimpl(j);
                if (m1940getWidthimpl > 0.0f) {
                    f = androidx.compose.material.OutlinedTextFieldKt.OutlinedTextFieldInnerPadding;
                    float f2 = drawWithContent.mo315toPx0680j_4(f);
                    float f3 = drawWithContent.mo315toPx0680j_4(paddingValues.mo519calculateLeftPaddingu2uoSUM(drawWithContent.getLayoutDirection())) - f2;
                    float f4 = 2;
                    float f5 = m1940getWidthimpl + f3 + (f2 * f4);
                    if (androidx.compose.material.OutlinedTextFieldKt$outlineCutout$1.WhenMappings.$EnumSwitchMapping$0[drawWithContent.getLayoutDirection().ordinal()] == 1) {
                        coerceAtLeast = androidx.compose.ui.geometry.Size.m1940getWidthimpl(drawWithContent.mo2592getSizeNHjbRc()) - f5;
                    } else {
                        coerceAtLeast = kotlin.ranges.RangesKt.coerceAtLeast(f3, 0.0f);
                    }
                    float f6 = coerceAtLeast;
                    if (androidx.compose.material.OutlinedTextFieldKt$outlineCutout$1.WhenMappings.$EnumSwitchMapping$0[drawWithContent.getLayoutDirection().ordinal()] == 1) {
                        f5 = androidx.compose.ui.geometry.Size.m1940getWidthimpl(drawWithContent.mo2592getSizeNHjbRc()) - kotlin.ranges.RangesKt.coerceAtLeast(f3, 0.0f);
                    }
                    float f7 = f5;
                    float m1937getHeightimpl = androidx.compose.ui.geometry.Size.m1937getHeightimpl(j);
                    float f8 = (-m1937getHeightimpl) / f4;
                    float f9 = m1937getHeightimpl / f4;
                    int m2101getDifferencertfAjoo = androidx.compose.ui.graphics.ClipOp.INSTANCE.m2101getDifferencertfAjoo();
                    androidx.compose.ui.graphics.drawscope.DrawContext drawContext = drawWithContent.getDrawContext();
                    long mo2598getSizeNHjbRc = drawContext.mo2598getSizeNHjbRc();
                    drawContext.getCanvas().save();
                    drawContext.getTransform().mo2601clipRectN_I0leg(f6, f8, f7, f9, m2101getDifferencertfAjoo);
                    drawWithContent.drawContent();
                    drawContext.getCanvas().restore();
                    drawContext.mo2599setSizeuvyYCjk(mo2598getSizeNHjbRc);
                    return;
                }
                drawWithContent.drawContent();
            }
        });
    }

    public static final float getOutlinedTextFieldTopPadding() {
        return OutlinedTextFieldTopPadding;
    }
}
