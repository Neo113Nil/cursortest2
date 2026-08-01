package androidx.compose.material;

import androidx.compose.foundation.BackgroundKt;
import androidx.compose.foundation.BorderStroke;
import androidx.compose.foundation.interaction.InteractionSourceKt;
import androidx.compose.foundation.interaction.MutableInteractionSource;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.BoxScopeInstance;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.PaddingValues;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.shape.CornerBasedShape;
import androidx.compose.foundation.shape.CornerSizeKt;
import androidx.compose.foundation.text.BasicTextFieldKt;
import androidx.compose.foundation.text.KeyboardActions;
import androidx.compose.foundation.text.KeyboardOptions;
import androidx.compose.runtime.Applier;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.ProvidableCompositionLocal;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.SkippableUpdater;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.draw.DrawModifierKt;
import androidx.compose.ui.geometry.OffsetKt;
import androidx.compose.ui.geometry.Size;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.Shadow;
import androidx.compose.ui.graphics.Shape;
import androidx.compose.ui.graphics.SolidColor;
import androidx.compose.ui.graphics.drawscope.ContentDrawScope;
import androidx.compose.ui.graphics.drawscope.DrawScope;
import androidx.compose.ui.layout.LayoutIdKt;
import androidx.compose.ui.layout.LayoutKt;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.layout.Placeable;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.platform.CompositionLocalsKt;
import androidx.compose.ui.platform.ViewConfiguration;
import androidx.compose.ui.text.TextLayoutResult;
import androidx.compose.ui.text.TextStyle;
import androidx.compose.ui.text.font.FontFamily;
import androidx.compose.ui.text.font.FontStyle;
import androidx.compose.ui.text.font.FontSynthesis;
import androidx.compose.ui.text.font.FontWeight;
import androidx.compose.ui.text.input.TextFieldValue;
import androidx.compose.ui.text.input.VisualTransformation;
import androidx.compose.ui.text.intl.LocaleList;
import androidx.compose.ui.text.style.BaselineShift;
import androidx.compose.ui.text.style.TextAlign;
import androidx.compose.ui.text.style.TextDecoration;
import androidx.compose.ui.text.style.TextDirection;
import androidx.compose.ui.text.style.TextGeometricTransform;
import androidx.compose.ui.text.style.TextIndent;
import androidx.compose.ui.unit.Constraints;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.Dp;
import androidx.compose.ui.unit.LayoutDirection;
import androidx.core.view.accessibility.AccessibilityEventCompat;
import androidx.profileinstaller.ProfileVerifier;
import com.google.android.exoplayer2.C;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.math.MathKt;
import kotlin.ranges.RangesKt;

/* compiled from: TextField.kt */
@Metadata(d1 = {"\u0000\u009c\u0001\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\t\u001a\u0087\u0002\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\f2\u0012\u0010\r\u001a\u000e\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\n0\u000e2\b\b\u0002\u0010\u000f\u001a\u00020\u00102\b\b\u0002\u0010\u0011\u001a\u00020\u00122\b\b\u0002\u0010\u0013\u001a\u00020\u00122\b\b\u0002\u0010\u0014\u001a\u00020\u00152\u0015\b\u0002\u0010\u0016\u001a\u000f\u0012\u0004\u0012\u00020\n\u0018\u00010\u0017¢\u0006\u0002\b\u00182\u0015\b\u0002\u0010\u0019\u001a\u000f\u0012\u0004\u0012\u00020\n\u0018\u00010\u0017¢\u0006\u0002\b\u00182\u0015\b\u0002\u0010\u001a\u001a\u000f\u0012\u0004\u0012\u00020\n\u0018\u00010\u0017¢\u0006\u0002\b\u00182\u0015\b\u0002\u0010\u001b\u001a\u000f\u0012\u0004\u0012\u00020\n\u0018\u00010\u0017¢\u0006\u0002\b\u00182\b\b\u0002\u0010\u001c\u001a\u00020\u00122\b\b\u0002\u0010\u001d\u001a\u00020\u001e2\b\b\u0002\u0010\u001f\u001a\u00020 2\b\b\u0002\u0010!\u001a\u00020\"2\b\b\u0002\u0010#\u001a\u00020\u00122\b\b\u0002\u0010$\u001a\u00020%2\b\b\u0002\u0010&\u001a\u00020'2\b\b\u0002\u0010(\u001a\u00020)2\b\b\u0002\u0010*\u001a\u00020+H\u0007¢\u0006\u0002\u0010,\u001a\u0087\u0002\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020-2\u0012\u0010\r\u001a\u000e\u0012\u0004\u0012\u00020-\u0012\u0004\u0012\u00020\n0\u000e2\b\b\u0002\u0010\u000f\u001a\u00020\u00102\b\b\u0002\u0010\u0011\u001a\u00020\u00122\b\b\u0002\u0010\u0013\u001a\u00020\u00122\b\b\u0002\u0010\u0014\u001a\u00020\u00152\u0015\b\u0002\u0010\u0016\u001a\u000f\u0012\u0004\u0012\u00020\n\u0018\u00010\u0017¢\u0006\u0002\b\u00182\u0015\b\u0002\u0010\u0019\u001a\u000f\u0012\u0004\u0012\u00020\n\u0018\u00010\u0017¢\u0006\u0002\b\u00182\u0015\b\u0002\u0010\u001a\u001a\u000f\u0012\u0004\u0012\u00020\n\u0018\u00010\u0017¢\u0006\u0002\b\u00182\u0015\b\u0002\u0010\u001b\u001a\u000f\u0012\u0004\u0012\u00020\n\u0018\u00010\u0017¢\u0006\u0002\b\u00182\b\b\u0002\u0010\u001c\u001a\u00020\u00122\b\b\u0002\u0010\u001d\u001a\u00020\u001e2\b\b\u0002\u0010\u001f\u001a\u00020 2\b\b\u0002\u0010!\u001a\u00020\"2\b\b\u0002\u0010#\u001a\u00020\u00122\b\b\u0002\u0010$\u001a\u00020%2\b\b\u0002\u0010&\u001a\u00020'2\b\b\u0002\u0010(\u001a\u00020)2\b\b\u0002\u0010*\u001a\u00020+H\u0007¢\u0006\u0002\u0010.\u001a\u009a\u0001\u0010/\u001a\u00020\n2\u0006\u0010\u000f\u001a\u00020\u00102\u0011\u00100\u001a\r\u0012\u0004\u0012\u00020\n0\u0017¢\u0006\u0002\b\u00182\u0013\u0010\u0016\u001a\u000f\u0012\u0004\u0012\u00020\n\u0018\u00010\u0017¢\u0006\u0002\b\u00182\u0019\u0010\u0019\u001a\u0015\u0012\u0004\u0012\u00020\u0010\u0012\u0004\u0012\u00020\n\u0018\u00010\u000e¢\u0006\u0002\b\u00182\u0013\u00101\u001a\u000f\u0012\u0004\u0012\u00020\n\u0018\u00010\u0017¢\u0006\u0002\b\u00182\u0013\u00102\u001a\u000f\u0012\u0004\u0012\u00020\n\u0018\u00010\u0017¢\u0006\u0002\b\u00182\u0006\u0010#\u001a\u00020\u00122\u0006\u00103\u001a\u0002042\u0006\u00105\u001a\u000206H\u0001¢\u0006\u0002\u00107\u001a]\u00108\u001a\u00020%2\u0006\u00109\u001a\u00020%2\u0006\u0010:\u001a\u00020\u00122\u0006\u0010;\u001a\u00020%2\u0006\u0010<\u001a\u00020%2\u0006\u0010=\u001a\u00020%2\u0006\u0010>\u001a\u00020%2\u0006\u0010?\u001a\u00020@2\u0006\u0010A\u001a\u0002042\u0006\u00105\u001a\u000206H\u0002ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\bB\u0010C\u001aE\u0010D\u001a\u00020%2\u0006\u0010E\u001a\u00020%2\u0006\u0010F\u001a\u00020%2\u0006\u0010G\u001a\u00020%2\u0006\u0010H\u001a\u00020%2\u0006\u0010I\u001a\u00020%2\u0006\u0010?\u001a\u00020@H\u0002ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\bJ\u0010K\u001a\u0014\u0010L\u001a\u00020\u0010*\u00020\u00102\u0006\u0010M\u001a\u00020NH\u0000\u001at\u0010O\u001a\u00020\n*\u00020P2\u0006\u0010Q\u001a\u00020%2\u0006\u0010R\u001a\u00020%2\u0006\u0010S\u001a\u00020T2\b\u0010U\u001a\u0004\u0018\u00010T2\b\u0010V\u001a\u0004\u0018\u00010T2\b\u0010W\u001a\u0004\u0018\u00010T2\b\u0010X\u001a\u0004\u0018\u00010T2\u0006\u0010#\u001a\u00020\u00122\u0006\u0010Y\u001a\u00020%2\u0006\u0010Z\u001a\u00020%2\u0006\u00103\u001a\u0002042\u0006\u0010A\u001a\u000204H\u0002\u001aZ\u0010[\u001a\u00020\n*\u00020P2\u0006\u0010Q\u001a\u00020%2\u0006\u0010R\u001a\u00020%2\u0006\u0010\\\u001a\u00020T2\b\u0010V\u001a\u0004\u0018\u00010T2\b\u0010W\u001a\u0004\u0018\u00010T2\b\u0010X\u001a\u0004\u0018\u00010T2\u0006\u0010#\u001a\u00020\u00122\u0006\u0010A\u001a\u0002042\u0006\u00105\u001a\u000206H\u0002\"\u0019\u0010\u0000\u001a\u00020\u0001X\u0080\u0004ø\u0001\u0000¢\u0006\n\n\u0002\u0010\u0004\u001a\u0004\b\u0002\u0010\u0003\"\u0019\u0010\u0005\u001a\u00020\u0001X\u0080\u0004ø\u0001\u0000¢\u0006\n\n\u0002\u0010\u0004\u001a\u0004\b\u0006\u0010\u0003\"\u0019\u0010\u0007\u001a\u00020\u0001X\u0080\u0004ø\u0001\u0000¢\u0006\n\n\u0002\u0010\u0004\u001a\u0004\b\b\u0010\u0003\u0082\u0002\u000b\n\u0002\b\u0019\n\u0005\b¡\u001e0\u0001¨\u0006]"}, d2 = {"FirstBaselineOffset", "Landroidx/compose/ui/unit/Dp;", "getFirstBaselineOffset", "()F", "F", "TextFieldBottomPadding", "getTextFieldBottomPadding", "TextFieldTopPadding", "getTextFieldTopPadding", TextFieldImplKt.TextFieldId, "", "value", "Landroidx/compose/ui/text/input/TextFieldValue;", "onValueChange", "Lkotlin/Function1;", "modifier", "Landroidx/compose/ui/Modifier;", "enabled", "", "readOnly", "textStyle", "Landroidx/compose/ui/text/TextStyle;", "label", "Lkotlin/Function0;", "Landroidx/compose/runtime/Composable;", "placeholder", "leadingIcon", "trailingIcon", "isError", "visualTransformation", "Landroidx/compose/ui/text/input/VisualTransformation;", "keyboardOptions", "Landroidx/compose/foundation/text/KeyboardOptions;", "keyboardActions", "Landroidx/compose/foundation/text/KeyboardActions;", "singleLine", "maxLines", "", "interactionSource", "Landroidx/compose/foundation/interaction/MutableInteractionSource;", "shape", "Landroidx/compose/ui/graphics/Shape;", "colors", "Landroidx/compose/material/TextFieldColors;", "(Landroidx/compose/ui/text/input/TextFieldValue;Lkotlin/jvm/functions/Function1;Landroidx/compose/ui/Modifier;ZZLandroidx/compose/ui/text/TextStyle;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;ZLandroidx/compose/ui/text/input/VisualTransformation;Landroidx/compose/foundation/text/KeyboardOptions;Landroidx/compose/foundation/text/KeyboardActions;ZILandroidx/compose/foundation/interaction/MutableInteractionSource;Landroidx/compose/ui/graphics/Shape;Landroidx/compose/material/TextFieldColors;Landroidx/compose/runtime/Composer;III)V", "", "(Ljava/lang/String;Lkotlin/jvm/functions/Function1;Landroidx/compose/ui/Modifier;ZZLandroidx/compose/ui/text/TextStyle;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;ZLandroidx/compose/ui/text/input/VisualTransformation;Landroidx/compose/foundation/text/KeyboardOptions;Landroidx/compose/foundation/text/KeyboardActions;ZILandroidx/compose/foundation/interaction/MutableInteractionSource;Landroidx/compose/ui/graphics/Shape;Landroidx/compose/material/TextFieldColors;Landroidx/compose/runtime/Composer;III)V", "TextFieldLayout", "textField", "leading", "trailing", "animationProgress", "", "paddingValues", "Landroidx/compose/foundation/layout/PaddingValues;", "(Landroidx/compose/ui/Modifier;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function3;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;ZFLandroidx/compose/foundation/layout/PaddingValues;Landroidx/compose/runtime/Composer;I)V", "calculateHeight", "textFieldHeight", "hasLabel", "labelBaseline", "leadingHeight", "trailingHeight", "placeholderHeight", "constraints", "Landroidx/compose/ui/unit/Constraints;", "density", "calculateHeight-O3s9Psw", "(IZIIIIJFLandroidx/compose/foundation/layout/PaddingValues;)I", "calculateWidth", "leadingWidth", "trailingWidth", "textFieldWidth", "labelWidth", "placeholderWidth", "calculateWidth-VsPV1Ek", "(IIIIIJ)I", "drawIndicatorLine", "indicatorBorder", "Landroidx/compose/foundation/BorderStroke;", "placeWithLabel", "Landroidx/compose/ui/layout/Placeable$PlacementScope;", "width", "height", "textfieldPlaceable", "Landroidx/compose/ui/layout/Placeable;", "labelPlaceable", "placeholderPlaceable", "leadingPlaceable", "trailingPlaceable", "labelEndPosition", "textPosition", "placeWithoutLabel", "textPlaceable", "material_release"}, k = 2, mv = {1, 6, 0}, xi = 48)
/* loaded from: classes.dex */
public final class TextFieldKt {
    private static final float FirstBaselineOffset = Dp.m3840constructorimpl(20);
    private static final float TextFieldBottomPadding = Dp.m3840constructorimpl(10);
    private static final float TextFieldTopPadding = Dp.m3840constructorimpl(4);

    /* JADX WARN: Code restructure failed: missing block: B:57:0x01b6, code lost:
    
        if (r7.changed(r82) == false) goto L145;
     */
    /* JADX WARN: Removed duplicated region for block: B:100:0x02a2  */
    /* JADX WARN: Removed duplicated region for block: B:120:0x04a4  */
    /* JADX WARN: Removed duplicated region for block: B:123:0x02f7  */
    /* JADX WARN: Removed duplicated region for block: B:125:0x0300  */
    /* JADX WARN: Removed duplicated region for block: B:127:0x0306  */
    /* JADX WARN: Removed duplicated region for block: B:130:0x030e  */
    /* JADX WARN: Removed duplicated region for block: B:132:0x0338  */
    /* JADX WARN: Removed duplicated region for block: B:134:0x033e  */
    /* JADX WARN: Removed duplicated region for block: B:136:0x0344  */
    /* JADX WARN: Removed duplicated region for block: B:138:0x034a  */
    /* JADX WARN: Removed duplicated region for block: B:13:0x0075  */
    /* JADX WARN: Removed duplicated region for block: B:140:0x0350  */
    /* JADX WARN: Removed duplicated region for block: B:142:0x0356  */
    /* JADX WARN: Removed duplicated region for block: B:145:0x0363  */
    /* JADX WARN: Removed duplicated region for block: B:148:0x0374  */
    /* JADX WARN: Removed duplicated region for block: B:150:0x03a2  */
    /* JADX WARN: Removed duplicated region for block: B:152:0x03a8  */
    /* JADX WARN: Removed duplicated region for block: B:155:0x03b4  */
    /* JADX WARN: Removed duplicated region for block: B:161:0x03e2  */
    /* JADX WARN: Removed duplicated region for block: B:164:0x0422  */
    /* JADX WARN: Removed duplicated region for block: B:166:0x0469  */
    /* JADX WARN: Removed duplicated region for block: B:167:0x0419  */
    /* JADX WARN: Removed duplicated region for block: B:168:0x03da  */
    /* JADX WARN: Removed duplicated region for block: B:169:0x03ae  */
    /* JADX WARN: Removed duplicated region for block: B:170:0x03a4  */
    /* JADX WARN: Removed duplicated region for block: B:171:0x039e  */
    /* JADX WARN: Removed duplicated region for block: B:172:0x036c  */
    /* JADX WARN: Removed duplicated region for block: B:173:0x035d  */
    /* JADX WARN: Removed duplicated region for block: B:174:0x0352  */
    /* JADX WARN: Removed duplicated region for block: B:175:0x034c  */
    /* JADX WARN: Removed duplicated region for block: B:176:0x0346  */
    /* JADX WARN: Removed duplicated region for block: B:177:0x0340  */
    /* JADX WARN: Removed duplicated region for block: B:178:0x033a  */
    /* JADX WARN: Removed duplicated region for block: B:179:0x0330  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0096  */
    /* JADX WARN: Removed duplicated region for block: B:180:0x0308  */
    /* JADX WARN: Removed duplicated region for block: B:181:0x0302  */
    /* JADX WARN: Removed duplicated region for block: B:182:0x02fc  */
    /* JADX WARN: Removed duplicated region for block: B:184:0x0256  */
    /* JADX WARN: Removed duplicated region for block: B:186:0x023a  */
    /* JADX WARN: Removed duplicated region for block: B:187:0x020f  */
    /* JADX WARN: Removed duplicated region for block: B:194:0x01ef  */
    /* JADX WARN: Removed duplicated region for block: B:201:0x01cd  */
    /* JADX WARN: Removed duplicated region for block: B:208:0x01c0  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x00bb  */
    /* JADX WARN: Removed duplicated region for block: B:211:0x01a6  */
    /* JADX WARN: Removed duplicated region for block: B:212:0x0179  */
    /* JADX WARN: Removed duplicated region for block: B:219:0x015a  */
    /* JADX WARN: Removed duplicated region for block: B:227:0x013c  */
    /* JADX WARN: Removed duplicated region for block: B:234:0x011e  */
    /* JADX WARN: Removed duplicated region for block: B:241:0x00fe  */
    /* JADX WARN: Removed duplicated region for block: B:248:0x00de  */
    /* JADX WARN: Removed duplicated region for block: B:256:0x00cf  */
    /* JADX WARN: Removed duplicated region for block: B:257:0x009b  */
    /* JADX WARN: Removed duplicated region for block: B:264:0x0078  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x00d7  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x00f7  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0117  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0135  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x0155  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x0174  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x0190  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x01ac  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x01c8  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x01e8  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x0208  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x0226  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x0240  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x0262  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x0604  */
    /* JADX WARN: Removed duplicated region for block: B:97:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void TextField(final String value, final Function1<? super String, Unit> onValueChange, Modifier modifier, boolean z, boolean z2, TextStyle textStyle, Function2<? super Composer, ? super Integer, Unit> function2, Function2<? super Composer, ? super Integer, Unit> function22, Function2<? super Composer, ? super Integer, Unit> function23, Function2<? super Composer, ? super Integer, Unit> function24, boolean z3, VisualTransformation visualTransformation, KeyboardOptions keyboardOptions, KeyboardActions keyboardActions, boolean z4, int i, MutableInteractionSource mutableInteractionSource, Shape shape, TextFieldColors textFieldColors, Composer composer, final int i2, final int i3, final int i4) {
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
        Modifier modifier2;
        boolean z5;
        TextStyle textStyle2;
        boolean z6;
        KeyboardOptions keyboardOptions2;
        KeyboardActions keyboardActions2;
        int i19;
        Function2<? super Composer, ? super Integer, Unit> function25;
        MutableInteractionSource mutableInteractionSource2;
        MutableInteractionSource mutableInteractionSource3;
        CornerBasedShape cornerBasedShape;
        KeyboardActions keyboardActions3;
        Function2<? super Composer, ? super Integer, Unit> function26;
        MutableInteractionSource mutableInteractionSource4;
        TextFieldColors textFieldColors2;
        Function2<? super Composer, ? super Integer, Unit> function27;
        VisualTransformation visualTransformation2;
        Function2<? super Composer, ? super Integer, Unit> function28;
        Function2<? super Composer, ? super Integer, Unit> function29;
        boolean z7;
        KeyboardOptions keyboardOptions3;
        boolean z8;
        Modifier modifier3;
        boolean z9;
        TextStyle textStyle3;
        Shape shape2;
        long m3502getColor0d7_KjU;
        Modifier m1220indicatorLinegv0btCI;
        Composer composer2;
        final boolean z10;
        final Function2<? super Composer, ? super Integer, Unit> function210;
        final Function2<? super Composer, ? super Integer, Unit> function211;
        final Function2<? super Composer, ? super Integer, Unit> function212;
        final Function2<? super Composer, ? super Integer, Unit> function213;
        final VisualTransformation visualTransformation3;
        final KeyboardOptions keyboardOptions4;
        final KeyboardActions keyboardActions4;
        final boolean z11;
        final MutableInteractionSource mutableInteractionSource5;
        final TextFieldColors textFieldColors3;
        final Shape shape3;
        final boolean z12;
        final TextStyle textStyle4;
        final boolean z13;
        final Modifier modifier4;
        final int i20;
        ScopeUpdateScope endRestartGroup;
        int i21;
        Intrinsics.checkNotNullParameter(value, "value");
        Intrinsics.checkNotNullParameter(onValueChange, "onValueChange");
        Composer startRestartGroup = composer.startRestartGroup(-1690895095);
        ComposerKt.sourceInformation(startRestartGroup, "C(TextField)P(17,10,9,1,12,15,6,11,7,16,3,18,5,4,14,8,2,13)163@8397L7,174@8951L39,176@9033L6,177@9158L17,189@9576L24,199@10014L20,186@9478L1542:TextField.kt#jmzs0o");
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
                    i5 |= startRestartGroup.changed(function23) ? AccessibilityEventCompat.TYPE_VIEW_TARGETED_BY_SCROLL : 33554432;
                }
                i11 = i4 & 512;
                if (i11 != 0) {
                    i5 |= C.ENCODING_PCM_32BIT;
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
                    i15 |= ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE;
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
                    i15 |= ((i4 & 262144) == 0 && startRestartGroup.changed(textFieldColors)) ? AccessibilityEventCompat.TYPE_VIEW_TARGETED_BY_SCROLL : 33554432;
                }
                if ((i5 & 1533916891) == 306783378 || (191739611 & i15) != 38347922 || !startRestartGroup.getSkipping()) {
                    startRestartGroup.startDefaults();
                    if ((i2 & 1) != 0 || startRestartGroup.getDefaultsInvalid()) {
                        Modifier.Companion companion = i22 != 0 ? Modifier.INSTANCE : modifier;
                        boolean z14 = i6 != 0 ? true : z;
                        boolean z15 = i7 != 0 ? false : z2;
                        if ((i4 & 32) != 0) {
                            ProvidableCompositionLocal<TextStyle> localTextStyle = TextKt.getLocalTextStyle();
                            modifier2 = companion;
                            z5 = z14;
                            ComposerKt.sourceInformationMarkerStart(startRestartGroup, 2023513938, "C:CompositionLocal.kt#9igjgp");
                            Object consume = startRestartGroup.consume(localTextStyle);
                            ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                            textStyle2 = (TextStyle) consume;
                            i5 &= -458753;
                        } else {
                            modifier2 = companion;
                            z5 = z14;
                            textStyle2 = textStyle;
                        }
                        Function2<? super Composer, ? super Integer, Unit> function214 = i8 != 0 ? null : function2;
                        Function2<? super Composer, ? super Integer, Unit> function215 = i9 != 0 ? null : function22;
                        Function2<? super Composer, ? super Integer, Unit> function216 = i10 != 0 ? null : function23;
                        Function2<? super Composer, ? super Integer, Unit> function217 = i11 != 0 ? null : function24;
                        z6 = i12 != 0 ? false : z3;
                        VisualTransformation none = i14 != 0 ? VisualTransformation.INSTANCE.getNone() : visualTransformation;
                        if ((i4 & 4096) != 0) {
                            keyboardOptions2 = KeyboardOptions.INSTANCE.getDefault();
                            i15 &= -897;
                        } else {
                            keyboardOptions2 = keyboardOptions;
                        }
                        int i24 = i5;
                        if ((i4 & 8192) != 0) {
                            keyboardActions2 = new KeyboardActions(null, null, null, null, null, null, 63, null);
                            i15 &= -7169;
                        } else {
                            keyboardActions2 = keyboardActions;
                        }
                        boolean z16 = i16 != 0 ? false : z4;
                        i19 = i17 != 0 ? Integer.MAX_VALUE : i;
                        KeyboardActions keyboardActions5 = keyboardActions2;
                        if (i18 != 0) {
                            startRestartGroup.startReplaceableGroup(-492369756);
                            ComposerKt.sourceInformation(startRestartGroup, "C(remember):Composables.kt#9igjgp");
                            Object rememberedValue = startRestartGroup.rememberedValue();
                            function25 = function216;
                            if (rememberedValue == Composer.INSTANCE.getEmpty()) {
                                rememberedValue = InteractionSourceKt.MutableInteractionSource();
                                startRestartGroup.updateRememberedValue(rememberedValue);
                            }
                            startRestartGroup.endReplaceableGroup();
                            mutableInteractionSource2 = (MutableInteractionSource) rememberedValue;
                        } else {
                            function25 = function216;
                            mutableInteractionSource2 = mutableInteractionSource;
                        }
                        if ((i4 & 131072) != 0) {
                            mutableInteractionSource3 = mutableInteractionSource2;
                            cornerBasedShape = CornerBasedShape.copy$default(MaterialTheme.INSTANCE.getShapes(startRestartGroup, 6).getSmall(), null, null, CornerSizeKt.getZeroCornerSize(), CornerSizeKt.getZeroCornerSize(), 3, null);
                            i15 = (-29360129) & i15;
                        } else {
                            mutableInteractionSource3 = mutableInteractionSource2;
                            cornerBasedShape = shape;
                        }
                        if ((262144 & i4) != 0) {
                            textFieldColors2 = TextFieldDefaults.INSTANCE.m1223textFieldColorsdx8h9Zs(0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, startRestartGroup, 0, 0, 48, 2097151);
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
                    ComposerKt.sourceInformation(startRestartGroup, "*181@9327L18");
                    m3502getColor0d7_KjU = textStyle3.m3502getColor0d7_KjU();
                    if (m3502getColor0d7_KjU == Color.INSTANCE.m1664getUnspecified0d7_KjU()) {
                        m3502getColor0d7_KjU = textFieldColors2.textColor(z9, startRestartGroup, ((i5 >> 9) & 14) | ((i15 >> 21) & 112)).getValue().m1638unboximpl();
                    }
                    startRestartGroup.endReplaceableGroup();
                    TextStyle merge = textStyle3.merge(new TextStyle(m3502getColor0d7_KjU, 0L, (FontWeight) null, (FontStyle) null, (FontSynthesis) null, (FontFamily) null, (String) null, 0L, (BaselineShift) null, (TextGeometricTransform) null, (LocaleList) null, 0L, (TextDecoration) null, (Shadow) null, (TextAlign) null, (TextDirection) null, 0L, (TextIndent) null, 262142, (DefaultConstructorMarker) null));
                    int i25 = (i15 >> 21) & 112;
                    final boolean z17 = z9;
                    m1220indicatorLinegv0btCI = TextFieldDefaults.INSTANCE.m1220indicatorLinegv0btCI(BackgroundKt.m172backgroundbw27NRU(modifier3, textFieldColors2.backgroundColor(z9, startRestartGroup, ((i5 >> 9) & 14) | i25).getValue().m1638unboximpl(), shape2), z17, z6, mutableInteractionSource4, textFieldColors2, (r17 & 16) != 0 ? TextFieldDefaults.FocusedBorderThickness : 0.0f, (r17 & 32) != 0 ? TextFieldDefaults.UnfocusedBorderThickness : 0.0f);
                    final boolean z18 = z7;
                    final VisualTransformation visualTransformation4 = visualTransformation2;
                    final MutableInteractionSource mutableInteractionSource6 = mutableInteractionSource4;
                    final boolean z19 = z6;
                    final Function2<? super Composer, ? super Integer, Unit> function218 = function29;
                    final Function2<? super Composer, ? super Integer, Unit> function219 = function28;
                    final Function2<? super Composer, ? super Integer, Unit> function220 = function26;
                    final Function2<? super Composer, ? super Integer, Unit> function221 = function27;
                    final TextFieldColors textFieldColors4 = textFieldColors2;
                    final int i26 = i5;
                    final int i27 = i15;
                    int i28 = i15 << 12;
                    composer2 = startRestartGroup;
                    boolean z20 = z9;
                    Modifier modifier5 = modifier3;
                    BasicTextFieldKt.BasicTextField(value, onValueChange, SizeKt.m445defaultMinSizeVpY3zN4(m1220indicatorLinegv0btCI, TextFieldDefaults.INSTANCE.m1218getMinWidthD9Ej5fM(), TextFieldDefaults.INSTANCE.m1217getMinHeightD9Ej5fM()), z9, z8, merge, keyboardOptions3, keyboardActions3, z7, i19, visualTransformation2, (Function1<? super TextLayoutResult, Unit>) null, mutableInteractionSource4, new SolidColor(textFieldColors2.cursorColor(z6, startRestartGroup, (i15 & 14) | i25).getValue().m1638unboximpl(), null), ComposableLambdaKt.composableLambda(startRestartGroup, -1994363936, true, new Function3<Function2<? super Composer, ? super Integer, ? extends Unit>, Composer, Integer, Unit>() { // from class: androidx.compose.material.TextFieldKt$TextField$2
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        /* JADX WARN: Multi-variable type inference failed */
                        {
                            super(3);
                        }

                        @Override // kotlin.jvm.functions.Function3
                        public /* bridge */ /* synthetic */ Unit invoke(Function2<? super Composer, ? super Integer, ? extends Unit> function222, Composer composer3, Integer num) {
                            invoke((Function2<? super Composer, ? super Integer, Unit>) function222, composer3, num.intValue());
                            return Unit.INSTANCE;
                        }

                        public final void invoke(Function2<? super Composer, ? super Integer, Unit> innerTextField, Composer composer3, int i29) {
                            int i30;
                            Intrinsics.checkNotNullParameter(innerTextField, "innerTextField");
                            ComposerKt.sourceInformation(composer3, "C208@10466L538:TextField.kt#jmzs0o");
                            if ((i29 & 14) == 0) {
                                i30 = i29 | (composer3.changed(innerTextField) ? 4 : 2);
                            } else {
                                i30 = i29;
                            }
                            if ((i30 & 91) != 18 || !composer3.getSkipping()) {
                                TextFieldDefaults textFieldDefaults = TextFieldDefaults.INSTANCE;
                                String str = value;
                                boolean z21 = z17;
                                boolean z22 = z18;
                                VisualTransformation visualTransformation5 = visualTransformation4;
                                MutableInteractionSource mutableInteractionSource7 = mutableInteractionSource6;
                                boolean z23 = z19;
                                Function2<Composer, Integer, Unit> function222 = function218;
                                Function2<Composer, Integer, Unit> function223 = function219;
                                Function2<Composer, Integer, Unit> function224 = function220;
                                Function2<Composer, Integer, Unit> function225 = function221;
                                TextFieldColors textFieldColors5 = textFieldColors4;
                                int i31 = i26;
                                int i32 = i27;
                                textFieldDefaults.TextFieldDecorationBox(str, innerTextField, z21, z22, visualTransformation5, mutableInteractionSource7, z23, function222, function223, function224, function225, textFieldColors5, null, composer3, ((i32 >> 3) & 7168) | (i31 & 14) | ((i30 << 3) & 112) | ((i31 >> 3) & 896) | ((i32 << 9) & 57344) | ((i32 >> 3) & 458752) | ((i32 << 18) & 3670016) | ((i31 << 3) & 29360128) | ((i31 << 3) & 234881024) | ((i31 << 3) & 1879048192), ((i31 >> 27) & 14) | 3072 | ((i32 >> 21) & 112), 4096);
                                return;
                            }
                            composer3.skipToGroupEnd();
                        }
                    }), composer2, (i5 & 64638) | (i28 & 3670016) | (KeyboardActions.$stable << 21) | (i28 & 29360128) | (i28 & 234881024) | (i28 & 1879048192), ((i15 >> 3) & 14) | 24576 | ((i15 >> 12) & 896), 2048);
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
                endRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material.TextFieldKt$TextField$3
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    /* JADX WARN: Multi-variable type inference failed */
                    {
                        super(2);
                    }

                    @Override // kotlin.jvm.functions.Function2
                    public /* bridge */ /* synthetic */ Unit invoke(Composer composer3, Integer num) {
                        invoke(composer3, num.intValue());
                        return Unit.INSTANCE;
                    }

                    public final void invoke(Composer composer3, int i29) {
                        TextFieldKt.TextField(value, onValueChange, modifier4, z13, z10, textStyle4, function210, function211, function212, function213, z12, visualTransformation3, keyboardOptions4, keyboardActions4, z11, i20, mutableInteractionSource5, shape3, textFieldColors3, composer3, i2 | 1, i3, i4);
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
            KeyboardActions keyboardActions52 = keyboardActions2;
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
            ComposerKt.sourceInformation(startRestartGroup, "*181@9327L18");
            m3502getColor0d7_KjU = textStyle3.m3502getColor0d7_KjU();
            if (m3502getColor0d7_KjU == Color.INSTANCE.m1664getUnspecified0d7_KjU()) {
            }
            startRestartGroup.endReplaceableGroup();
            TextStyle merge2 = textStyle3.merge(new TextStyle(m3502getColor0d7_KjU, 0L, (FontWeight) null, (FontStyle) null, (FontSynthesis) null, (FontFamily) null, (String) null, 0L, (BaselineShift) null, (TextGeometricTransform) null, (LocaleList) null, 0L, (TextDecoration) null, (Shadow) null, (TextAlign) null, (TextDirection) null, 0L, (TextIndent) null, 262142, (DefaultConstructorMarker) null));
            int i252 = (i15 >> 21) & 112;
            final boolean z172 = z9;
            m1220indicatorLinegv0btCI = TextFieldDefaults.INSTANCE.m1220indicatorLinegv0btCI(BackgroundKt.m172backgroundbw27NRU(modifier3, textFieldColors2.backgroundColor(z9, startRestartGroup, ((i5 >> 9) & 14) | i252).getValue().m1638unboximpl(), shape2), z172, z6, mutableInteractionSource4, textFieldColors2, (r17 & 16) != 0 ? TextFieldDefaults.FocusedBorderThickness : 0.0f, (r17 & 32) != 0 ? TextFieldDefaults.UnfocusedBorderThickness : 0.0f);
            final boolean z182 = z7;
            final VisualTransformation visualTransformation42 = visualTransformation2;
            final MutableInteractionSource mutableInteractionSource62 = mutableInteractionSource4;
            final boolean z192 = z6;
            final Function2<? super Composer, ? super Integer, Unit> function2182 = function29;
            final Function2<? super Composer, ? super Integer, Unit> function2192 = function28;
            final Function2<? super Composer, ? super Integer, Unit> function2202 = function26;
            final Function2<? super Composer, ? super Integer, Unit> function2212 = function27;
            final TextFieldColors textFieldColors42 = textFieldColors2;
            final int i262 = i5;
            final int i272 = i15;
            int i282 = i15 << 12;
            composer2 = startRestartGroup;
            boolean z202 = z9;
            Modifier modifier52 = modifier3;
            BasicTextFieldKt.BasicTextField(value, onValueChange, SizeKt.m445defaultMinSizeVpY3zN4(m1220indicatorLinegv0btCI, TextFieldDefaults.INSTANCE.m1218getMinWidthD9Ej5fM(), TextFieldDefaults.INSTANCE.m1217getMinHeightD9Ej5fM()), z9, z8, merge2, keyboardOptions3, keyboardActions3, z7, i19, visualTransformation2, (Function1<? super TextLayoutResult, Unit>) null, mutableInteractionSource4, new SolidColor(textFieldColors2.cursorColor(z6, startRestartGroup, (i15 & 14) | i252).getValue().m1638unboximpl(), null), ComposableLambdaKt.composableLambda(startRestartGroup, -1994363936, true, new Function3<Function2<? super Composer, ? super Integer, ? extends Unit>, Composer, Integer, Unit>() { // from class: androidx.compose.material.TextFieldKt$TextField$2
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                /* JADX WARN: Multi-variable type inference failed */
                {
                    super(3);
                }

                @Override // kotlin.jvm.functions.Function3
                public /* bridge */ /* synthetic */ Unit invoke(Function2<? super Composer, ? super Integer, ? extends Unit> function222, Composer composer3, Integer num) {
                    invoke((Function2<? super Composer, ? super Integer, Unit>) function222, composer3, num.intValue());
                    return Unit.INSTANCE;
                }

                public final void invoke(Function2<? super Composer, ? super Integer, Unit> innerTextField, Composer composer3, int i29) {
                    int i30;
                    Intrinsics.checkNotNullParameter(innerTextField, "innerTextField");
                    ComposerKt.sourceInformation(composer3, "C208@10466L538:TextField.kt#jmzs0o");
                    if ((i29 & 14) == 0) {
                        i30 = i29 | (composer3.changed(innerTextField) ? 4 : 2);
                    } else {
                        i30 = i29;
                    }
                    if ((i30 & 91) != 18 || !composer3.getSkipping()) {
                        TextFieldDefaults textFieldDefaults = TextFieldDefaults.INSTANCE;
                        String str = value;
                        boolean z21 = z172;
                        boolean z22 = z182;
                        VisualTransformation visualTransformation5 = visualTransformation42;
                        MutableInteractionSource mutableInteractionSource7 = mutableInteractionSource62;
                        boolean z23 = z192;
                        Function2<Composer, Integer, Unit> function222 = function2182;
                        Function2<Composer, Integer, Unit> function223 = function2192;
                        Function2<Composer, Integer, Unit> function224 = function2202;
                        Function2<Composer, Integer, Unit> function225 = function2212;
                        TextFieldColors textFieldColors5 = textFieldColors42;
                        int i31 = i262;
                        int i32 = i272;
                        textFieldDefaults.TextFieldDecorationBox(str, innerTextField, z21, z22, visualTransformation5, mutableInteractionSource7, z23, function222, function223, function224, function225, textFieldColors5, null, composer3, ((i32 >> 3) & 7168) | (i31 & 14) | ((i30 << 3) & 112) | ((i31 >> 3) & 896) | ((i32 << 9) & 57344) | ((i32 >> 3) & 458752) | ((i32 << 18) & 3670016) | ((i31 << 3) & 29360128) | ((i31 << 3) & 234881024) | ((i31 << 3) & 1879048192), ((i31 >> 27) & 14) | 3072 | ((i32 >> 21) & 112), 4096);
                        return;
                    }
                    composer3.skipToGroupEnd();
                }
            }), composer2, (i5 & 64638) | (i282 & 3670016) | (KeyboardActions.$stable << 21) | (i282 & 29360128) | (i282 & 234881024) | (i282 & 1879048192), ((i15 >> 3) & 14) | 24576 | ((i15 >> 12) & 896), 2048);
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
        KeyboardActions keyboardActions522 = keyboardActions2;
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
        ComposerKt.sourceInformation(startRestartGroup, "*181@9327L18");
        m3502getColor0d7_KjU = textStyle3.m3502getColor0d7_KjU();
        if (m3502getColor0d7_KjU == Color.INSTANCE.m1664getUnspecified0d7_KjU()) {
        }
        startRestartGroup.endReplaceableGroup();
        TextStyle merge22 = textStyle3.merge(new TextStyle(m3502getColor0d7_KjU, 0L, (FontWeight) null, (FontStyle) null, (FontSynthesis) null, (FontFamily) null, (String) null, 0L, (BaselineShift) null, (TextGeometricTransform) null, (LocaleList) null, 0L, (TextDecoration) null, (Shadow) null, (TextAlign) null, (TextDirection) null, 0L, (TextIndent) null, 262142, (DefaultConstructorMarker) null));
        int i2522 = (i15 >> 21) & 112;
        final boolean z1722 = z9;
        m1220indicatorLinegv0btCI = TextFieldDefaults.INSTANCE.m1220indicatorLinegv0btCI(BackgroundKt.m172backgroundbw27NRU(modifier3, textFieldColors2.backgroundColor(z9, startRestartGroup, ((i5 >> 9) & 14) | i2522).getValue().m1638unboximpl(), shape2), z1722, z6, mutableInteractionSource4, textFieldColors2, (r17 & 16) != 0 ? TextFieldDefaults.FocusedBorderThickness : 0.0f, (r17 & 32) != 0 ? TextFieldDefaults.UnfocusedBorderThickness : 0.0f);
        final boolean z1822 = z7;
        final VisualTransformation visualTransformation422 = visualTransformation2;
        final MutableInteractionSource mutableInteractionSource622 = mutableInteractionSource4;
        final boolean z1922 = z6;
        final Function2<? super Composer, ? super Integer, Unit> function21822 = function29;
        final Function2<? super Composer, ? super Integer, Unit> function21922 = function28;
        final Function2<? super Composer, ? super Integer, Unit> function22022 = function26;
        final Function2<? super Composer, ? super Integer, Unit> function22122 = function27;
        final TextFieldColors textFieldColors422 = textFieldColors2;
        final int i2622 = i5;
        final int i2722 = i15;
        int i2822 = i15 << 12;
        composer2 = startRestartGroup;
        boolean z2022 = z9;
        Modifier modifier522 = modifier3;
        BasicTextFieldKt.BasicTextField(value, onValueChange, SizeKt.m445defaultMinSizeVpY3zN4(m1220indicatorLinegv0btCI, TextFieldDefaults.INSTANCE.m1218getMinWidthD9Ej5fM(), TextFieldDefaults.INSTANCE.m1217getMinHeightD9Ej5fM()), z9, z8, merge22, keyboardOptions3, keyboardActions3, z7, i19, visualTransformation2, (Function1<? super TextLayoutResult, Unit>) null, mutableInteractionSource4, new SolidColor(textFieldColors2.cursorColor(z6, startRestartGroup, (i15 & 14) | i2522).getValue().m1638unboximpl(), null), ComposableLambdaKt.composableLambda(startRestartGroup, -1994363936, true, new Function3<Function2<? super Composer, ? super Integer, ? extends Unit>, Composer, Integer, Unit>() { // from class: androidx.compose.material.TextFieldKt$TextField$2
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            {
                super(3);
            }

            @Override // kotlin.jvm.functions.Function3
            public /* bridge */ /* synthetic */ Unit invoke(Function2<? super Composer, ? super Integer, ? extends Unit> function222, Composer composer3, Integer num) {
                invoke((Function2<? super Composer, ? super Integer, Unit>) function222, composer3, num.intValue());
                return Unit.INSTANCE;
            }

            public final void invoke(Function2<? super Composer, ? super Integer, Unit> innerTextField, Composer composer3, int i29) {
                int i30;
                Intrinsics.checkNotNullParameter(innerTextField, "innerTextField");
                ComposerKt.sourceInformation(composer3, "C208@10466L538:TextField.kt#jmzs0o");
                if ((i29 & 14) == 0) {
                    i30 = i29 | (composer3.changed(innerTextField) ? 4 : 2);
                } else {
                    i30 = i29;
                }
                if ((i30 & 91) != 18 || !composer3.getSkipping()) {
                    TextFieldDefaults textFieldDefaults = TextFieldDefaults.INSTANCE;
                    String str = value;
                    boolean z21 = z1722;
                    boolean z22 = z1822;
                    VisualTransformation visualTransformation5 = visualTransformation422;
                    MutableInteractionSource mutableInteractionSource7 = mutableInteractionSource622;
                    boolean z23 = z1922;
                    Function2<Composer, Integer, Unit> function222 = function21822;
                    Function2<Composer, Integer, Unit> function223 = function21922;
                    Function2<Composer, Integer, Unit> function224 = function22022;
                    Function2<Composer, Integer, Unit> function225 = function22122;
                    TextFieldColors textFieldColors5 = textFieldColors422;
                    int i31 = i2622;
                    int i32 = i2722;
                    textFieldDefaults.TextFieldDecorationBox(str, innerTextField, z21, z22, visualTransformation5, mutableInteractionSource7, z23, function222, function223, function224, function225, textFieldColors5, null, composer3, ((i32 >> 3) & 7168) | (i31 & 14) | ((i30 << 3) & 112) | ((i31 >> 3) & 896) | ((i32 << 9) & 57344) | ((i32 >> 3) & 458752) | ((i32 << 18) & 3670016) | ((i31 << 3) & 29360128) | ((i31 << 3) & 234881024) | ((i31 << 3) & 1879048192), ((i31 >> 27) & 14) | 3072 | ((i32 >> 21) & 112), 4096);
                    return;
                }
                composer3.skipToGroupEnd();
            }
        }), composer2, (i5 & 64638) | (i2822 & 3670016) | (KeyboardActions.$stable << 21) | (i2822 & 29360128) | (i2822 & 234881024) | (i2822 & 1879048192), ((i15 >> 3) & 14) | 24576 | ((i15 >> 12) & 896), 2048);
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
    
        if (r7.changed(r82) == false) goto L145;
     */
    /* JADX WARN: Removed duplicated region for block: B:100:0x02a2  */
    /* JADX WARN: Removed duplicated region for block: B:120:0x047c  */
    /* JADX WARN: Removed duplicated region for block: B:123:0x02f7  */
    /* JADX WARN: Removed duplicated region for block: B:125:0x0300  */
    /* JADX WARN: Removed duplicated region for block: B:127:0x0306  */
    /* JADX WARN: Removed duplicated region for block: B:130:0x030e  */
    /* JADX WARN: Removed duplicated region for block: B:132:0x0338  */
    /* JADX WARN: Removed duplicated region for block: B:134:0x033e  */
    /* JADX WARN: Removed duplicated region for block: B:136:0x0344  */
    /* JADX WARN: Removed duplicated region for block: B:138:0x034a  */
    /* JADX WARN: Removed duplicated region for block: B:13:0x0075  */
    /* JADX WARN: Removed duplicated region for block: B:140:0x0350  */
    /* JADX WARN: Removed duplicated region for block: B:142:0x0356  */
    /* JADX WARN: Removed duplicated region for block: B:145:0x0363  */
    /* JADX WARN: Removed duplicated region for block: B:148:0x0374  */
    /* JADX WARN: Removed duplicated region for block: B:150:0x03a2  */
    /* JADX WARN: Removed duplicated region for block: B:152:0x03a8  */
    /* JADX WARN: Removed duplicated region for block: B:155:0x03b4  */
    /* JADX WARN: Removed duplicated region for block: B:161:0x03e2  */
    /* JADX WARN: Removed duplicated region for block: B:164:0x03fa  */
    /* JADX WARN: Removed duplicated region for block: B:166:0x0441  */
    /* JADX WARN: Removed duplicated region for block: B:167:0x03f1  */
    /* JADX WARN: Removed duplicated region for block: B:168:0x03da  */
    /* JADX WARN: Removed duplicated region for block: B:169:0x03ae  */
    /* JADX WARN: Removed duplicated region for block: B:170:0x03a4  */
    /* JADX WARN: Removed duplicated region for block: B:171:0x039e  */
    /* JADX WARN: Removed duplicated region for block: B:172:0x036c  */
    /* JADX WARN: Removed duplicated region for block: B:173:0x035d  */
    /* JADX WARN: Removed duplicated region for block: B:174:0x0352  */
    /* JADX WARN: Removed duplicated region for block: B:175:0x034c  */
    /* JADX WARN: Removed duplicated region for block: B:176:0x0346  */
    /* JADX WARN: Removed duplicated region for block: B:177:0x0340  */
    /* JADX WARN: Removed duplicated region for block: B:178:0x033a  */
    /* JADX WARN: Removed duplicated region for block: B:179:0x0330  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0096  */
    /* JADX WARN: Removed duplicated region for block: B:180:0x0308  */
    /* JADX WARN: Removed duplicated region for block: B:181:0x0302  */
    /* JADX WARN: Removed duplicated region for block: B:182:0x02fc  */
    /* JADX WARN: Removed duplicated region for block: B:184:0x0256  */
    /* JADX WARN: Removed duplicated region for block: B:186:0x023a  */
    /* JADX WARN: Removed duplicated region for block: B:187:0x020f  */
    /* JADX WARN: Removed duplicated region for block: B:194:0x01ef  */
    /* JADX WARN: Removed duplicated region for block: B:201:0x01cd  */
    /* JADX WARN: Removed duplicated region for block: B:208:0x01c0  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x00bb  */
    /* JADX WARN: Removed duplicated region for block: B:211:0x01a6  */
    /* JADX WARN: Removed duplicated region for block: B:212:0x0179  */
    /* JADX WARN: Removed duplicated region for block: B:219:0x015a  */
    /* JADX WARN: Removed duplicated region for block: B:227:0x013c  */
    /* JADX WARN: Removed duplicated region for block: B:234:0x011e  */
    /* JADX WARN: Removed duplicated region for block: B:241:0x00fe  */
    /* JADX WARN: Removed duplicated region for block: B:248:0x00de  */
    /* JADX WARN: Removed duplicated region for block: B:256:0x00cf  */
    /* JADX WARN: Removed duplicated region for block: B:257:0x009b  */
    /* JADX WARN: Removed duplicated region for block: B:264:0x0078  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x00d7  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x00f7  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0117  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0135  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x0155  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x0174  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x0190  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x01ac  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x01c8  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x01e8  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x0208  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x0226  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x0240  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x0262  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x05dc  */
    /* JADX WARN: Removed duplicated region for block: B:97:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void TextField(final TextFieldValue value, final Function1<? super TextFieldValue, Unit> onValueChange, Modifier modifier, boolean z, boolean z2, TextStyle textStyle, Function2<? super Composer, ? super Integer, Unit> function2, Function2<? super Composer, ? super Integer, Unit> function22, Function2<? super Composer, ? super Integer, Unit> function23, Function2<? super Composer, ? super Integer, Unit> function24, boolean z3, VisualTransformation visualTransformation, KeyboardOptions keyboardOptions, KeyboardActions keyboardActions, boolean z4, int i, MutableInteractionSource mutableInteractionSource, Shape shape, TextFieldColors textFieldColors, Composer composer, final int i2, final int i3, final int i4) {
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
        Modifier modifier2;
        boolean z5;
        TextStyle textStyle2;
        boolean z6;
        KeyboardOptions keyboardOptions2;
        KeyboardActions keyboardActions2;
        int i19;
        Function2<? super Composer, ? super Integer, Unit> function25;
        MutableInteractionSource mutableInteractionSource2;
        MutableInteractionSource mutableInteractionSource3;
        Shape shape2;
        KeyboardActions keyboardActions3;
        Function2<? super Composer, ? super Integer, Unit> function26;
        MutableInteractionSource mutableInteractionSource4;
        TextFieldColors textFieldColors2;
        Function2<? super Composer, ? super Integer, Unit> function27;
        VisualTransformation visualTransformation2;
        Function2<? super Composer, ? super Integer, Unit> function28;
        Function2<? super Composer, ? super Integer, Unit> function29;
        boolean z7;
        KeyboardOptions keyboardOptions3;
        boolean z8;
        Modifier modifier3;
        boolean z9;
        TextStyle textStyle3;
        Shape shape3;
        long m3502getColor0d7_KjU;
        Modifier m1220indicatorLinegv0btCI;
        Composer composer2;
        final boolean z10;
        final Function2<? super Composer, ? super Integer, Unit> function210;
        final Function2<? super Composer, ? super Integer, Unit> function211;
        final Function2<? super Composer, ? super Integer, Unit> function212;
        final Function2<? super Composer, ? super Integer, Unit> function213;
        final VisualTransformation visualTransformation3;
        final KeyboardOptions keyboardOptions4;
        final KeyboardActions keyboardActions4;
        final boolean z11;
        final MutableInteractionSource mutableInteractionSource5;
        final TextFieldColors textFieldColors3;
        final Shape shape4;
        final boolean z12;
        final TextStyle textStyle4;
        final boolean z13;
        final Modifier modifier4;
        final int i20;
        ScopeUpdateScope endRestartGroup;
        int i21;
        Intrinsics.checkNotNullParameter(value, "value");
        Intrinsics.checkNotNullParameter(onValueChange, "onValueChange");
        Composer startRestartGroup = composer.startRestartGroup(-1576622884);
        ComposerKt.sourceInformation(startRestartGroup, "C(TextField)P(17,10,9,1,12,15,6,11,7,16,3,18,5,4,14,8,2,13)298@15761L7,309@16315L39,310@16393L14,311@16457L17,323@16875L24,333@17313L20,320@16777L1547:TextField.kt#jmzs0o");
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
                    i5 |= startRestartGroup.changed(function23) ? AccessibilityEventCompat.TYPE_VIEW_TARGETED_BY_SCROLL : 33554432;
                }
                i11 = i4 & 512;
                if (i11 != 0) {
                    i5 |= C.ENCODING_PCM_32BIT;
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
                    i15 |= ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE;
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
                    i15 |= ((i4 & 262144) == 0 && startRestartGroup.changed(textFieldColors)) ? AccessibilityEventCompat.TYPE_VIEW_TARGETED_BY_SCROLL : 33554432;
                }
                if ((i5 & 1533916891) == 306783378 || (191739611 & i15) != 38347922 || !startRestartGroup.getSkipping()) {
                    startRestartGroup.startDefaults();
                    if ((i2 & 1) != 0 || startRestartGroup.getDefaultsInvalid()) {
                        Modifier.Companion companion = i22 != 0 ? Modifier.INSTANCE : modifier;
                        boolean z14 = i6 != 0 ? true : z;
                        boolean z15 = i7 != 0 ? false : z2;
                        if ((i4 & 32) != 0) {
                            ProvidableCompositionLocal<TextStyle> localTextStyle = TextKt.getLocalTextStyle();
                            modifier2 = companion;
                            z5 = z14;
                            ComposerKt.sourceInformationMarkerStart(startRestartGroup, 2023513938, "C:CompositionLocal.kt#9igjgp");
                            Object consume = startRestartGroup.consume(localTextStyle);
                            ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                            textStyle2 = (TextStyle) consume;
                            i5 &= -458753;
                        } else {
                            modifier2 = companion;
                            z5 = z14;
                            textStyle2 = textStyle;
                        }
                        Function2<? super Composer, ? super Integer, Unit> function214 = i8 != 0 ? null : function2;
                        Function2<? super Composer, ? super Integer, Unit> function215 = i9 != 0 ? null : function22;
                        Function2<? super Composer, ? super Integer, Unit> function216 = i10 != 0 ? null : function23;
                        Function2<? super Composer, ? super Integer, Unit> function217 = i11 != 0 ? null : function24;
                        z6 = i12 != 0 ? false : z3;
                        VisualTransformation none = i14 != 0 ? VisualTransformation.INSTANCE.getNone() : visualTransformation;
                        if ((i4 & 4096) != 0) {
                            keyboardOptions2 = KeyboardOptions.INSTANCE.getDefault();
                            i15 &= -897;
                        } else {
                            keyboardOptions2 = keyboardOptions;
                        }
                        int i24 = i5;
                        if ((i4 & 8192) != 0) {
                            keyboardActions2 = new KeyboardActions(null, null, null, null, null, null, 63, null);
                            i15 &= -7169;
                        } else {
                            keyboardActions2 = keyboardActions;
                        }
                        boolean z16 = i16 != 0 ? false : z4;
                        i19 = i17 != 0 ? Integer.MAX_VALUE : i;
                        KeyboardActions keyboardActions5 = keyboardActions2;
                        if (i18 != 0) {
                            startRestartGroup.startReplaceableGroup(-492369756);
                            ComposerKt.sourceInformation(startRestartGroup, "C(remember):Composables.kt#9igjgp");
                            Object rememberedValue = startRestartGroup.rememberedValue();
                            function25 = function216;
                            if (rememberedValue == Composer.INSTANCE.getEmpty()) {
                                rememberedValue = InteractionSourceKt.MutableInteractionSource();
                                startRestartGroup.updateRememberedValue(rememberedValue);
                            }
                            startRestartGroup.endReplaceableGroup();
                            mutableInteractionSource2 = (MutableInteractionSource) rememberedValue;
                        } else {
                            function25 = function216;
                            mutableInteractionSource2 = mutableInteractionSource;
                        }
                        if ((i4 & 131072) != 0) {
                            mutableInteractionSource3 = mutableInteractionSource2;
                            shape2 = TextFieldDefaults.INSTANCE.getTextFieldShape(startRestartGroup, 6);
                            i15 = (-29360129) & i15;
                        } else {
                            mutableInteractionSource3 = mutableInteractionSource2;
                            shape2 = shape;
                        }
                        if ((262144 & i4) != 0) {
                            textFieldColors2 = TextFieldDefaults.INSTANCE.m1223textFieldColorsdx8h9Zs(0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, startRestartGroup, 0, 0, 48, 2097151);
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
                    ComposerKt.sourceInformation(startRestartGroup, "*315@16626L18");
                    m3502getColor0d7_KjU = textStyle3.m3502getColor0d7_KjU();
                    if (m3502getColor0d7_KjU == Color.INSTANCE.m1664getUnspecified0d7_KjU()) {
                        m3502getColor0d7_KjU = textFieldColors2.textColor(z9, startRestartGroup, ((i5 >> 9) & 14) | ((i15 >> 21) & 112)).getValue().m1638unboximpl();
                    }
                    startRestartGroup.endReplaceableGroup();
                    TextStyle merge = textStyle3.merge(new TextStyle(m3502getColor0d7_KjU, 0L, (FontWeight) null, (FontStyle) null, (FontSynthesis) null, (FontFamily) null, (String) null, 0L, (BaselineShift) null, (TextGeometricTransform) null, (LocaleList) null, 0L, (TextDecoration) null, (Shadow) null, (TextAlign) null, (TextDirection) null, 0L, (TextIndent) null, 262142, (DefaultConstructorMarker) null));
                    int i25 = (i15 >> 21) & 112;
                    final boolean z17 = z9;
                    m1220indicatorLinegv0btCI = TextFieldDefaults.INSTANCE.m1220indicatorLinegv0btCI(BackgroundKt.m172backgroundbw27NRU(modifier3, textFieldColors2.backgroundColor(z9, startRestartGroup, ((i5 >> 9) & 14) | i25).getValue().m1638unboximpl(), shape3), z17, z6, mutableInteractionSource4, textFieldColors2, (r17 & 16) != 0 ? TextFieldDefaults.FocusedBorderThickness : 0.0f, (r17 & 32) != 0 ? TextFieldDefaults.UnfocusedBorderThickness : 0.0f);
                    final boolean z18 = z7;
                    final VisualTransformation visualTransformation4 = visualTransformation2;
                    final MutableInteractionSource mutableInteractionSource6 = mutableInteractionSource4;
                    final boolean z19 = z6;
                    final Function2<? super Composer, ? super Integer, Unit> function218 = function29;
                    final Function2<? super Composer, ? super Integer, Unit> function219 = function28;
                    final Function2<? super Composer, ? super Integer, Unit> function220 = function26;
                    final Function2<? super Composer, ? super Integer, Unit> function221 = function27;
                    final TextFieldColors textFieldColors4 = textFieldColors2;
                    final int i26 = i5;
                    final int i27 = i15;
                    int i28 = i15 << 12;
                    composer2 = startRestartGroup;
                    boolean z20 = z9;
                    Modifier modifier5 = modifier3;
                    BasicTextFieldKt.BasicTextField(value, onValueChange, SizeKt.m445defaultMinSizeVpY3zN4(m1220indicatorLinegv0btCI, TextFieldDefaults.INSTANCE.m1218getMinWidthD9Ej5fM(), TextFieldDefaults.INSTANCE.m1217getMinHeightD9Ej5fM()), z9, z8, merge, keyboardOptions3, keyboardActions3, z7, i19, visualTransformation2, (Function1<? super TextLayoutResult, Unit>) null, mutableInteractionSource4, new SolidColor(textFieldColors2.cursorColor(z6, startRestartGroup, (i15 & 14) | i25).getValue().m1638unboximpl(), null), ComposableLambdaKt.composableLambda(startRestartGroup, -2078585677, true, new Function3<Function2<? super Composer, ? super Integer, ? extends Unit>, Composer, Integer, Unit>() { // from class: androidx.compose.material.TextFieldKt$TextField$5
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        /* JADX WARN: Multi-variable type inference failed */
                        {
                            super(3);
                        }

                        @Override // kotlin.jvm.functions.Function3
                        public /* bridge */ /* synthetic */ Unit invoke(Function2<? super Composer, ? super Integer, ? extends Unit> function222, Composer composer3, Integer num) {
                            invoke((Function2<? super Composer, ? super Integer, Unit>) function222, composer3, num.intValue());
                            return Unit.INSTANCE;
                        }

                        public final void invoke(Function2<? super Composer, ? super Integer, Unit> innerTextField, Composer composer3, int i29) {
                            int i30;
                            Intrinsics.checkNotNullParameter(innerTextField, "innerTextField");
                            ComposerKt.sourceInformation(composer3, "C342@17765L543:TextField.kt#jmzs0o");
                            if ((i29 & 14) == 0) {
                                i30 = i29 | (composer3.changed(innerTextField) ? 4 : 2);
                            } else {
                                i30 = i29;
                            }
                            if ((i30 & 91) != 18 || !composer3.getSkipping()) {
                                TextFieldDefaults textFieldDefaults = TextFieldDefaults.INSTANCE;
                                String text = TextFieldValue.this.getText();
                                boolean z21 = z17;
                                boolean z22 = z18;
                                VisualTransformation visualTransformation5 = visualTransformation4;
                                MutableInteractionSource mutableInteractionSource7 = mutableInteractionSource6;
                                boolean z23 = z19;
                                Function2<Composer, Integer, Unit> function222 = function218;
                                Function2<Composer, Integer, Unit> function223 = function219;
                                Function2<Composer, Integer, Unit> function224 = function220;
                                Function2<Composer, Integer, Unit> function225 = function221;
                                TextFieldColors textFieldColors5 = textFieldColors4;
                                int i31 = i26;
                                int i32 = i27;
                                textFieldDefaults.TextFieldDecorationBox(text, innerTextField, z21, z22, visualTransformation5, mutableInteractionSource7, z23, function222, function223, function224, function225, textFieldColors5, null, composer3, ((i32 >> 3) & 7168) | ((i30 << 3) & 112) | ((i31 >> 3) & 896) | ((i32 << 9) & 57344) | ((i32 >> 3) & 458752) | ((i32 << 18) & 3670016) | ((i31 << 3) & 29360128) | ((i31 << 3) & 234881024) | ((i31 << 3) & 1879048192), ((i31 >> 27) & 14) | 3072 | ((i32 >> 21) & 112), 4096);
                                return;
                            }
                            composer3.skipToGroupEnd();
                        }
                    }), composer2, (i5 & 64638) | (i28 & 3670016) | (KeyboardActions.$stable << 21) | (i28 & 29360128) | (i28 & 234881024) | (i28 & 1879048192), ((i15 >> 3) & 14) | 24576 | ((i15 >> 12) & 896), 2048);
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
                endRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material.TextFieldKt$TextField$6
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    /* JADX WARN: Multi-variable type inference failed */
                    {
                        super(2);
                    }

                    @Override // kotlin.jvm.functions.Function2
                    public /* bridge */ /* synthetic */ Unit invoke(Composer composer3, Integer num) {
                        invoke(composer3, num.intValue());
                        return Unit.INSTANCE;
                    }

                    public final void invoke(Composer composer3, int i29) {
                        TextFieldKt.TextField(TextFieldValue.this, onValueChange, modifier4, z13, z10, textStyle4, function210, function211, function212, function213, z12, visualTransformation3, keyboardOptions4, keyboardActions4, z11, i20, mutableInteractionSource5, shape4, textFieldColors3, composer3, i2 | 1, i3, i4);
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
            KeyboardActions keyboardActions52 = keyboardActions2;
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
            ComposerKt.sourceInformation(startRestartGroup, "*315@16626L18");
            m3502getColor0d7_KjU = textStyle3.m3502getColor0d7_KjU();
            if (m3502getColor0d7_KjU == Color.INSTANCE.m1664getUnspecified0d7_KjU()) {
            }
            startRestartGroup.endReplaceableGroup();
            TextStyle merge2 = textStyle3.merge(new TextStyle(m3502getColor0d7_KjU, 0L, (FontWeight) null, (FontStyle) null, (FontSynthesis) null, (FontFamily) null, (String) null, 0L, (BaselineShift) null, (TextGeometricTransform) null, (LocaleList) null, 0L, (TextDecoration) null, (Shadow) null, (TextAlign) null, (TextDirection) null, 0L, (TextIndent) null, 262142, (DefaultConstructorMarker) null));
            int i252 = (i15 >> 21) & 112;
            final boolean z172 = z9;
            m1220indicatorLinegv0btCI = TextFieldDefaults.INSTANCE.m1220indicatorLinegv0btCI(BackgroundKt.m172backgroundbw27NRU(modifier3, textFieldColors2.backgroundColor(z9, startRestartGroup, ((i5 >> 9) & 14) | i252).getValue().m1638unboximpl(), shape3), z172, z6, mutableInteractionSource4, textFieldColors2, (r17 & 16) != 0 ? TextFieldDefaults.FocusedBorderThickness : 0.0f, (r17 & 32) != 0 ? TextFieldDefaults.UnfocusedBorderThickness : 0.0f);
            final boolean z182 = z7;
            final VisualTransformation visualTransformation42 = visualTransformation2;
            final MutableInteractionSource mutableInteractionSource62 = mutableInteractionSource4;
            final boolean z192 = z6;
            final Function2<? super Composer, ? super Integer, Unit> function2182 = function29;
            final Function2<? super Composer, ? super Integer, Unit> function2192 = function28;
            final Function2<? super Composer, ? super Integer, Unit> function2202 = function26;
            final Function2<? super Composer, ? super Integer, Unit> function2212 = function27;
            final TextFieldColors textFieldColors42 = textFieldColors2;
            final int i262 = i5;
            final int i272 = i15;
            int i282 = i15 << 12;
            composer2 = startRestartGroup;
            boolean z202 = z9;
            Modifier modifier52 = modifier3;
            BasicTextFieldKt.BasicTextField(value, onValueChange, SizeKt.m445defaultMinSizeVpY3zN4(m1220indicatorLinegv0btCI, TextFieldDefaults.INSTANCE.m1218getMinWidthD9Ej5fM(), TextFieldDefaults.INSTANCE.m1217getMinHeightD9Ej5fM()), z9, z8, merge2, keyboardOptions3, keyboardActions3, z7, i19, visualTransformation2, (Function1<? super TextLayoutResult, Unit>) null, mutableInteractionSource4, new SolidColor(textFieldColors2.cursorColor(z6, startRestartGroup, (i15 & 14) | i252).getValue().m1638unboximpl(), null), ComposableLambdaKt.composableLambda(startRestartGroup, -2078585677, true, new Function3<Function2<? super Composer, ? super Integer, ? extends Unit>, Composer, Integer, Unit>() { // from class: androidx.compose.material.TextFieldKt$TextField$5
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                /* JADX WARN: Multi-variable type inference failed */
                {
                    super(3);
                }

                @Override // kotlin.jvm.functions.Function3
                public /* bridge */ /* synthetic */ Unit invoke(Function2<? super Composer, ? super Integer, ? extends Unit> function222, Composer composer3, Integer num) {
                    invoke((Function2<? super Composer, ? super Integer, Unit>) function222, composer3, num.intValue());
                    return Unit.INSTANCE;
                }

                public final void invoke(Function2<? super Composer, ? super Integer, Unit> innerTextField, Composer composer3, int i29) {
                    int i30;
                    Intrinsics.checkNotNullParameter(innerTextField, "innerTextField");
                    ComposerKt.sourceInformation(composer3, "C342@17765L543:TextField.kt#jmzs0o");
                    if ((i29 & 14) == 0) {
                        i30 = i29 | (composer3.changed(innerTextField) ? 4 : 2);
                    } else {
                        i30 = i29;
                    }
                    if ((i30 & 91) != 18 || !composer3.getSkipping()) {
                        TextFieldDefaults textFieldDefaults = TextFieldDefaults.INSTANCE;
                        String text = TextFieldValue.this.getText();
                        boolean z21 = z172;
                        boolean z22 = z182;
                        VisualTransformation visualTransformation5 = visualTransformation42;
                        MutableInteractionSource mutableInteractionSource7 = mutableInteractionSource62;
                        boolean z23 = z192;
                        Function2<Composer, Integer, Unit> function222 = function2182;
                        Function2<Composer, Integer, Unit> function223 = function2192;
                        Function2<Composer, Integer, Unit> function224 = function2202;
                        Function2<Composer, Integer, Unit> function225 = function2212;
                        TextFieldColors textFieldColors5 = textFieldColors42;
                        int i31 = i262;
                        int i32 = i272;
                        textFieldDefaults.TextFieldDecorationBox(text, innerTextField, z21, z22, visualTransformation5, mutableInteractionSource7, z23, function222, function223, function224, function225, textFieldColors5, null, composer3, ((i32 >> 3) & 7168) | ((i30 << 3) & 112) | ((i31 >> 3) & 896) | ((i32 << 9) & 57344) | ((i32 >> 3) & 458752) | ((i32 << 18) & 3670016) | ((i31 << 3) & 29360128) | ((i31 << 3) & 234881024) | ((i31 << 3) & 1879048192), ((i31 >> 27) & 14) | 3072 | ((i32 >> 21) & 112), 4096);
                        return;
                    }
                    composer3.skipToGroupEnd();
                }
            }), composer2, (i5 & 64638) | (i282 & 3670016) | (KeyboardActions.$stable << 21) | (i282 & 29360128) | (i282 & 234881024) | (i282 & 1879048192), ((i15 >> 3) & 14) | 24576 | ((i15 >> 12) & 896), 2048);
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
        KeyboardActions keyboardActions522 = keyboardActions2;
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
        ComposerKt.sourceInformation(startRestartGroup, "*315@16626L18");
        m3502getColor0d7_KjU = textStyle3.m3502getColor0d7_KjU();
        if (m3502getColor0d7_KjU == Color.INSTANCE.m1664getUnspecified0d7_KjU()) {
        }
        startRestartGroup.endReplaceableGroup();
        TextStyle merge22 = textStyle3.merge(new TextStyle(m3502getColor0d7_KjU, 0L, (FontWeight) null, (FontStyle) null, (FontSynthesis) null, (FontFamily) null, (String) null, 0L, (BaselineShift) null, (TextGeometricTransform) null, (LocaleList) null, 0L, (TextDecoration) null, (Shadow) null, (TextAlign) null, (TextDirection) null, 0L, (TextIndent) null, 262142, (DefaultConstructorMarker) null));
        int i2522 = (i15 >> 21) & 112;
        final boolean z1722 = z9;
        m1220indicatorLinegv0btCI = TextFieldDefaults.INSTANCE.m1220indicatorLinegv0btCI(BackgroundKt.m172backgroundbw27NRU(modifier3, textFieldColors2.backgroundColor(z9, startRestartGroup, ((i5 >> 9) & 14) | i2522).getValue().m1638unboximpl(), shape3), z1722, z6, mutableInteractionSource4, textFieldColors2, (r17 & 16) != 0 ? TextFieldDefaults.FocusedBorderThickness : 0.0f, (r17 & 32) != 0 ? TextFieldDefaults.UnfocusedBorderThickness : 0.0f);
        final boolean z1822 = z7;
        final VisualTransformation visualTransformation422 = visualTransformation2;
        final MutableInteractionSource mutableInteractionSource622 = mutableInteractionSource4;
        final boolean z1922 = z6;
        final Function2<? super Composer, ? super Integer, Unit> function21822 = function29;
        final Function2<? super Composer, ? super Integer, Unit> function21922 = function28;
        final Function2<? super Composer, ? super Integer, Unit> function22022 = function26;
        final Function2<? super Composer, ? super Integer, Unit> function22122 = function27;
        final TextFieldColors textFieldColors422 = textFieldColors2;
        final int i2622 = i5;
        final int i2722 = i15;
        int i2822 = i15 << 12;
        composer2 = startRestartGroup;
        boolean z2022 = z9;
        Modifier modifier522 = modifier3;
        BasicTextFieldKt.BasicTextField(value, onValueChange, SizeKt.m445defaultMinSizeVpY3zN4(m1220indicatorLinegv0btCI, TextFieldDefaults.INSTANCE.m1218getMinWidthD9Ej5fM(), TextFieldDefaults.INSTANCE.m1217getMinHeightD9Ej5fM()), z9, z8, merge22, keyboardOptions3, keyboardActions3, z7, i19, visualTransformation2, (Function1<? super TextLayoutResult, Unit>) null, mutableInteractionSource4, new SolidColor(textFieldColors2.cursorColor(z6, startRestartGroup, (i15 & 14) | i2522).getValue().m1638unboximpl(), null), ComposableLambdaKt.composableLambda(startRestartGroup, -2078585677, true, new Function3<Function2<? super Composer, ? super Integer, ? extends Unit>, Composer, Integer, Unit>() { // from class: androidx.compose.material.TextFieldKt$TextField$5
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            {
                super(3);
            }

            @Override // kotlin.jvm.functions.Function3
            public /* bridge */ /* synthetic */ Unit invoke(Function2<? super Composer, ? super Integer, ? extends Unit> function222, Composer composer3, Integer num) {
                invoke((Function2<? super Composer, ? super Integer, Unit>) function222, composer3, num.intValue());
                return Unit.INSTANCE;
            }

            public final void invoke(Function2<? super Composer, ? super Integer, Unit> innerTextField, Composer composer3, int i29) {
                int i30;
                Intrinsics.checkNotNullParameter(innerTextField, "innerTextField");
                ComposerKt.sourceInformation(composer3, "C342@17765L543:TextField.kt#jmzs0o");
                if ((i29 & 14) == 0) {
                    i30 = i29 | (composer3.changed(innerTextField) ? 4 : 2);
                } else {
                    i30 = i29;
                }
                if ((i30 & 91) != 18 || !composer3.getSkipping()) {
                    TextFieldDefaults textFieldDefaults = TextFieldDefaults.INSTANCE;
                    String text = TextFieldValue.this.getText();
                    boolean z21 = z1722;
                    boolean z22 = z1822;
                    VisualTransformation visualTransformation5 = visualTransformation422;
                    MutableInteractionSource mutableInteractionSource7 = mutableInteractionSource622;
                    boolean z23 = z1922;
                    Function2<Composer, Integer, Unit> function222 = function21822;
                    Function2<Composer, Integer, Unit> function223 = function21922;
                    Function2<Composer, Integer, Unit> function224 = function22022;
                    Function2<Composer, Integer, Unit> function225 = function22122;
                    TextFieldColors textFieldColors5 = textFieldColors422;
                    int i31 = i2622;
                    int i32 = i2722;
                    textFieldDefaults.TextFieldDecorationBox(text, innerTextField, z21, z22, visualTransformation5, mutableInteractionSource7, z23, function222, function223, function224, function225, textFieldColors5, null, composer3, ((i32 >> 3) & 7168) | ((i30 << 3) & 112) | ((i31 >> 3) & 896) | ((i32 << 9) & 57344) | ((i32 >> 3) & 458752) | ((i32 << 18) & 3670016) | ((i31 << 3) & 29360128) | ((i31 << 3) & 234881024) | ((i31 << 3) & 1879048192), ((i31 >> 27) & 14) | 3072 | ((i32 >> 21) & 112), 4096);
                    return;
                }
                composer3.skipToGroupEnd();
            }
        }), composer2, (i5 & 64638) | (i2822 & 3670016) | (KeyboardActions.$stable << 21) | (i2822 & 29360128) | (i2822 & 234881024) | (i2822 & 1879048192), ((i15 >> 3) & 14) | 24576 | ((i15 >> 12) & 896), 2048);
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

    public static final void TextFieldLayout(final Modifier modifier, final Function2<? super Composer, ? super Integer, Unit> textField, final Function2<? super Composer, ? super Integer, Unit> function2, final Function3<? super Modifier, ? super Composer, ? super Integer, Unit> function3, final Function2<? super Composer, ? super Integer, Unit> function22, final Function2<? super Composer, ? super Integer, Unit> function23, final boolean z, final float f, final PaddingValues paddingValues, Composer composer, final int i) {
        int i2;
        int i3;
        Intrinsics.checkNotNullParameter(modifier, "modifier");
        Intrinsics.checkNotNullParameter(textField, "textField");
        Intrinsics.checkNotNullParameter(paddingValues, "paddingValues");
        Composer startRestartGroup = composer.startRestartGroup(-2112507061);
        ComposerKt.sourceInformation(startRestartGroup, "C(TextFieldLayout)P(3,7,1,5,2,8,6)376@18854L139,379@19041L7,380@19053L1853:TextField.kt#jmzs0o");
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
            i2 |= startRestartGroup.changed(paddingValues) ? AccessibilityEventCompat.TYPE_VIEW_TARGETED_BY_SCROLL : 33554432;
        }
        if ((191739611 & i2) != 38347922 || !startRestartGroup.getSkipping()) {
            Boolean valueOf = Boolean.valueOf(z);
            Float valueOf2 = Float.valueOf(f);
            startRestartGroup.startReplaceableGroup(1618982084);
            ComposerKt.sourceInformation(startRestartGroup, "C(remember)P(1,2,3):Composables.kt#9igjgp");
            boolean changed = startRestartGroup.changed(valueOf) | startRestartGroup.changed(valueOf2) | startRestartGroup.changed(paddingValues);
            Object rememberedValue = startRestartGroup.rememberedValue();
            if (changed || rememberedValue == Composer.INSTANCE.getEmpty()) {
                rememberedValue = new TextFieldMeasurePolicy(z, f, paddingValues);
                startRestartGroup.updateRememberedValue(rememberedValue);
            }
            startRestartGroup.endReplaceableGroup();
            TextFieldMeasurePolicy textFieldMeasurePolicy = (TextFieldMeasurePolicy) rememberedValue;
            ProvidableCompositionLocal<LayoutDirection> localLayoutDirection = CompositionLocalsKt.getLocalLayoutDirection();
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, 2023513938, "C:CompositionLocal.kt#9igjgp");
            Object consume = startRestartGroup.consume(localLayoutDirection);
            ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
            LayoutDirection layoutDirection = (LayoutDirection) consume;
            startRestartGroup.startReplaceableGroup(-1323940314);
            ComposerKt.sourceInformation(startRestartGroup, "C(Layout)P(!1,2)74@2915L7,75@2970L7,76@3029L7,77@3041L460:Layout.kt#80mrfh");
            ProvidableCompositionLocal<Density> localDensity = CompositionLocalsKt.getLocalDensity();
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, 2023513938, "C:CompositionLocal.kt#9igjgp");
            Object consume2 = startRestartGroup.consume(localDensity);
            ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
            Density density = (Density) consume2;
            ProvidableCompositionLocal<LayoutDirection> localLayoutDirection2 = CompositionLocalsKt.getLocalLayoutDirection();
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, 2023513938, "C:CompositionLocal.kt#9igjgp");
            Object consume3 = startRestartGroup.consume(localLayoutDirection2);
            ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
            LayoutDirection layoutDirection2 = (LayoutDirection) consume3;
            ProvidableCompositionLocal<ViewConfiguration> localViewConfiguration = CompositionLocalsKt.getLocalViewConfiguration();
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, 2023513938, "C:CompositionLocal.kt#9igjgp");
            Object consume4 = startRestartGroup.consume(localViewConfiguration);
            ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
            ViewConfiguration viewConfiguration = (ViewConfiguration) consume4;
            Function0<ComposeUiNode> constructor = ComposeUiNode.INSTANCE.getConstructor();
            Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> materializerOf = LayoutKt.materializerOf(modifier);
            if (!(startRestartGroup.getApplier() instanceof Applier)) {
                ComposablesKt.invalidApplier();
            }
            startRestartGroup.startReusableNode();
            if (startRestartGroup.getInserting()) {
                startRestartGroup.createNode(constructor);
            } else {
                startRestartGroup.useNode();
            }
            startRestartGroup.disableReusing();
            Composer m1283constructorimpl = Updater.m1283constructorimpl(startRestartGroup);
            Updater.m1290setimpl(m1283constructorimpl, textFieldMeasurePolicy, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
            Updater.m1290setimpl(m1283constructorimpl, density, ComposeUiNode.INSTANCE.getSetDensity());
            Updater.m1290setimpl(m1283constructorimpl, layoutDirection2, ComposeUiNode.INSTANCE.getSetLayoutDirection());
            Updater.m1290setimpl(m1283constructorimpl, viewConfiguration, ComposeUiNode.INSTANCE.getSetViewConfiguration());
            startRestartGroup.enableReusing();
            materializerOf.invoke(SkippableUpdater.m1273boximpl(SkippableUpdater.m1274constructorimpl(startRestartGroup)), startRestartGroup, 0);
            startRestartGroup.startReplaceableGroup(2058660585);
            startRestartGroup.startReplaceableGroup(642667778);
            ComposerKt.sourceInformation(startRestartGroup, "C422@20668L183:TextField.kt#jmzs0o");
            startRestartGroup.startReplaceableGroup(254816194);
            ComposerKt.sourceInformation(startRestartGroup, "384@19161L219");
            if (function22 != null) {
                Modifier then = LayoutIdKt.layoutId(Modifier.INSTANCE, TextFieldImplKt.LeadingId).then(TextFieldImplKt.getIconDefaultSizeModifier());
                Alignment center = Alignment.INSTANCE.getCenter();
                startRestartGroup.startReplaceableGroup(733328855);
                ComposerKt.sourceInformation(startRestartGroup, "C(Box)P(2,1,3)70@3267L67,71@3339L130:Box.kt#2w3rfo");
                MeasurePolicy rememberBoxMeasurePolicy = BoxKt.rememberBoxMeasurePolicy(center, false, startRestartGroup, 6);
                startRestartGroup.startReplaceableGroup(-1323940314);
                ComposerKt.sourceInformation(startRestartGroup, "C(Layout)P(!1,2)74@2915L7,75@2970L7,76@3029L7,77@3041L460:Layout.kt#80mrfh");
                ProvidableCompositionLocal<Density> localDensity2 = CompositionLocalsKt.getLocalDensity();
                ComposerKt.sourceInformationMarkerStart(startRestartGroup, 2023513938, "C:CompositionLocal.kt#9igjgp");
                Object consume5 = startRestartGroup.consume(localDensity2);
                ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                Density density2 = (Density) consume5;
                ProvidableCompositionLocal<LayoutDirection> localLayoutDirection3 = CompositionLocalsKt.getLocalLayoutDirection();
                ComposerKt.sourceInformationMarkerStart(startRestartGroup, 2023513938, "C:CompositionLocal.kt#9igjgp");
                Object consume6 = startRestartGroup.consume(localLayoutDirection3);
                ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                LayoutDirection layoutDirection3 = (LayoutDirection) consume6;
                ProvidableCompositionLocal<ViewConfiguration> localViewConfiguration2 = CompositionLocalsKt.getLocalViewConfiguration();
                ComposerKt.sourceInformationMarkerStart(startRestartGroup, 2023513938, "C:CompositionLocal.kt#9igjgp");
                Object consume7 = startRestartGroup.consume(localViewConfiguration2);
                ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                ViewConfiguration viewConfiguration2 = (ViewConfiguration) consume7;
                Function0<ComposeUiNode> constructor2 = ComposeUiNode.INSTANCE.getConstructor();
                Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> materializerOf2 = LayoutKt.materializerOf(then);
                if (!(startRestartGroup.getApplier() instanceof Applier)) {
                    ComposablesKt.invalidApplier();
                }
                startRestartGroup.startReusableNode();
                if (startRestartGroup.getInserting()) {
                    startRestartGroup.createNode(constructor2);
                } else {
                    startRestartGroup.useNode();
                }
                startRestartGroup.disableReusing();
                Composer m1283constructorimpl2 = Updater.m1283constructorimpl(startRestartGroup);
                Updater.m1290setimpl(m1283constructorimpl2, rememberBoxMeasurePolicy, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
                Updater.m1290setimpl(m1283constructorimpl2, density2, ComposeUiNode.INSTANCE.getSetDensity());
                Updater.m1290setimpl(m1283constructorimpl2, layoutDirection3, ComposeUiNode.INSTANCE.getSetLayoutDirection());
                Updater.m1290setimpl(m1283constructorimpl2, viewConfiguration2, ComposeUiNode.INSTANCE.getSetViewConfiguration());
                startRestartGroup.enableReusing();
                materializerOf2.invoke(SkippableUpdater.m1273boximpl(SkippableUpdater.m1274constructorimpl(startRestartGroup)), startRestartGroup, 0);
                startRestartGroup.startReplaceableGroup(2058660585);
                startRestartGroup.startReplaceableGroup(-2137368960);
                ComposerKt.sourceInformation(startRestartGroup, "C72@3384L9:Box.kt#2w3rfo");
                BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
                startRestartGroup.startReplaceableGroup(822730659);
                ComposerKt.sourceInformation(startRestartGroup, "C388@19353L9:TextField.kt#jmzs0o");
                function22.invoke(startRestartGroup, Integer.valueOf((i2 >> 12) & 14));
                startRestartGroup.endReplaceableGroup();
                startRestartGroup.endReplaceableGroup();
                startRestartGroup.endReplaceableGroup();
                startRestartGroup.endNode();
                startRestartGroup.endReplaceableGroup();
                startRestartGroup.endReplaceableGroup();
            }
            startRestartGroup.endReplaceableGroup();
            startRestartGroup.startReplaceableGroup(254816479);
            ComposerKt.sourceInformation(startRestartGroup, "392@19447L221");
            if (function23 != null) {
                Modifier then2 = LayoutIdKt.layoutId(Modifier.INSTANCE, TextFieldImplKt.TrailingId).then(TextFieldImplKt.getIconDefaultSizeModifier());
                Alignment center2 = Alignment.INSTANCE.getCenter();
                startRestartGroup.startReplaceableGroup(733328855);
                ComposerKt.sourceInformation(startRestartGroup, "C(Box)P(2,1,3)70@3267L67,71@3339L130:Box.kt#2w3rfo");
                MeasurePolicy rememberBoxMeasurePolicy2 = BoxKt.rememberBoxMeasurePolicy(center2, false, startRestartGroup, 6);
                startRestartGroup.startReplaceableGroup(-1323940314);
                ComposerKt.sourceInformation(startRestartGroup, "C(Layout)P(!1,2)74@2915L7,75@2970L7,76@3029L7,77@3041L460:Layout.kt#80mrfh");
                ProvidableCompositionLocal<Density> localDensity3 = CompositionLocalsKt.getLocalDensity();
                ComposerKt.sourceInformationMarkerStart(startRestartGroup, 2023513938, "C:CompositionLocal.kt#9igjgp");
                Object consume8 = startRestartGroup.consume(localDensity3);
                ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                Density density3 = (Density) consume8;
                ProvidableCompositionLocal<LayoutDirection> localLayoutDirection4 = CompositionLocalsKt.getLocalLayoutDirection();
                ComposerKt.sourceInformationMarkerStart(startRestartGroup, 2023513938, "C:CompositionLocal.kt#9igjgp");
                Object consume9 = startRestartGroup.consume(localLayoutDirection4);
                ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                LayoutDirection layoutDirection4 = (LayoutDirection) consume9;
                ProvidableCompositionLocal<ViewConfiguration> localViewConfiguration3 = CompositionLocalsKt.getLocalViewConfiguration();
                ComposerKt.sourceInformationMarkerStart(startRestartGroup, 2023513938, "C:CompositionLocal.kt#9igjgp");
                Object consume10 = startRestartGroup.consume(localViewConfiguration3);
                ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                ViewConfiguration viewConfiguration3 = (ViewConfiguration) consume10;
                Function0<ComposeUiNode> constructor3 = ComposeUiNode.INSTANCE.getConstructor();
                Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> materializerOf3 = LayoutKt.materializerOf(then2);
                if (!(startRestartGroup.getApplier() instanceof Applier)) {
                    ComposablesKt.invalidApplier();
                }
                startRestartGroup.startReusableNode();
                if (startRestartGroup.getInserting()) {
                    startRestartGroup.createNode(constructor3);
                } else {
                    startRestartGroup.useNode();
                }
                startRestartGroup.disableReusing();
                Composer m1283constructorimpl3 = Updater.m1283constructorimpl(startRestartGroup);
                Updater.m1290setimpl(m1283constructorimpl3, rememberBoxMeasurePolicy2, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
                Updater.m1290setimpl(m1283constructorimpl3, density3, ComposeUiNode.INSTANCE.getSetDensity());
                Updater.m1290setimpl(m1283constructorimpl3, layoutDirection4, ComposeUiNode.INSTANCE.getSetLayoutDirection());
                Updater.m1290setimpl(m1283constructorimpl3, viewConfiguration3, ComposeUiNode.INSTANCE.getSetViewConfiguration());
                startRestartGroup.enableReusing();
                materializerOf3.invoke(SkippableUpdater.m1273boximpl(SkippableUpdater.m1274constructorimpl(startRestartGroup)), startRestartGroup, 0);
                startRestartGroup.startReplaceableGroup(2058660585);
                startRestartGroup.startReplaceableGroup(-2137368960);
                ComposerKt.sourceInformation(startRestartGroup, "C72@3384L9:Box.kt#2w3rfo");
                BoxScopeInstance boxScopeInstance2 = BoxScopeInstance.INSTANCE;
                startRestartGroup.startReplaceableGroup(-1007916070);
                ComposerKt.sourceInformation(startRestartGroup, "C396@19640L10:TextField.kt#jmzs0o");
                function23.invoke(startRestartGroup, Integer.valueOf((i2 >> 15) & 14));
                startRestartGroup.endReplaceableGroup();
                startRestartGroup.endReplaceableGroup();
                startRestartGroup.endReplaceableGroup();
                startRestartGroup.endNode();
                startRestartGroup.endReplaceableGroup();
                startRestartGroup.endReplaceableGroup();
            }
            startRestartGroup.endReplaceableGroup();
            float calculateStartPadding = PaddingKt.calculateStartPadding(paddingValues, layoutDirection);
            float calculateEndPadding = PaddingKt.calculateEndPadding(paddingValues, layoutDirection);
            Modifier.Companion companion = Modifier.INSTANCE;
            if (function22 != null) {
                i3 = 0;
                calculateStartPadding = Dp.m3840constructorimpl(RangesKt.coerceAtLeast(Dp.m3840constructorimpl(calculateStartPadding - TextFieldImplKt.getHorizontalIconPadding()), Dp.m3840constructorimpl(0)));
            } else {
                i3 = 0;
            }
            float f2 = calculateStartPadding;
            if (function23 != null) {
                calculateEndPadding = Dp.m3840constructorimpl(RangesKt.coerceAtLeast(Dp.m3840constructorimpl(calculateEndPadding - TextFieldImplKt.getHorizontalIconPadding()), Dp.m3840constructorimpl(i3)));
            }
            Modifier m424paddingqDBjuR0$default = PaddingKt.m424paddingqDBjuR0$default(companion, f2, 0.0f, calculateEndPadding, 0.0f, 10, null);
            startRestartGroup.startReplaceableGroup(254817490);
            ComposerKt.sourceInformation(startRestartGroup, "417@20461L59");
            if (function3 != null) {
                function3.invoke(LayoutIdKt.layoutId(Modifier.INSTANCE, TextFieldImplKt.PlaceholderId).then(m424paddingqDBjuR0$default), startRestartGroup, Integer.valueOf((i2 >> 6) & 112));
            }
            startRestartGroup.endReplaceableGroup();
            startRestartGroup.startReplaceableGroup(254817619);
            ComposerKt.sourceInformation(startRestartGroup, "420@20584L57");
            if (function2 != null) {
                Modifier then3 = LayoutIdKt.layoutId(Modifier.INSTANCE, TextFieldImplKt.LabelId).then(m424paddingqDBjuR0$default);
                startRestartGroup.startReplaceableGroup(733328855);
                ComposerKt.sourceInformation(startRestartGroup, "C(Box)P(2,1,3)70@3267L67,71@3339L130:Box.kt#2w3rfo");
                MeasurePolicy rememberBoxMeasurePolicy3 = BoxKt.rememberBoxMeasurePolicy(Alignment.INSTANCE.getTopStart(), false, startRestartGroup, 0);
                startRestartGroup.startReplaceableGroup(-1323940314);
                ComposerKt.sourceInformation(startRestartGroup, "C(Layout)P(!1,2)74@2915L7,75@2970L7,76@3029L7,77@3041L460:Layout.kt#80mrfh");
                ProvidableCompositionLocal<Density> localDensity4 = CompositionLocalsKt.getLocalDensity();
                ComposerKt.sourceInformationMarkerStart(startRestartGroup, 2023513938, "C:CompositionLocal.kt#9igjgp");
                Object consume11 = startRestartGroup.consume(localDensity4);
                ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                Density density4 = (Density) consume11;
                ProvidableCompositionLocal<LayoutDirection> localLayoutDirection5 = CompositionLocalsKt.getLocalLayoutDirection();
                ComposerKt.sourceInformationMarkerStart(startRestartGroup, 2023513938, "C:CompositionLocal.kt#9igjgp");
                Object consume12 = startRestartGroup.consume(localLayoutDirection5);
                ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                LayoutDirection layoutDirection5 = (LayoutDirection) consume12;
                ProvidableCompositionLocal<ViewConfiguration> localViewConfiguration4 = CompositionLocalsKt.getLocalViewConfiguration();
                ComposerKt.sourceInformationMarkerStart(startRestartGroup, 2023513938, "C:CompositionLocal.kt#9igjgp");
                Object consume13 = startRestartGroup.consume(localViewConfiguration4);
                ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                ViewConfiguration viewConfiguration4 = (ViewConfiguration) consume13;
                Function0<ComposeUiNode> constructor4 = ComposeUiNode.INSTANCE.getConstructor();
                Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> materializerOf4 = LayoutKt.materializerOf(then3);
                if (!(startRestartGroup.getApplier() instanceof Applier)) {
                    ComposablesKt.invalidApplier();
                }
                startRestartGroup.startReusableNode();
                if (startRestartGroup.getInserting()) {
                    startRestartGroup.createNode(constructor4);
                } else {
                    startRestartGroup.useNode();
                }
                startRestartGroup.disableReusing();
                Composer m1283constructorimpl4 = Updater.m1283constructorimpl(startRestartGroup);
                Updater.m1290setimpl(m1283constructorimpl4, rememberBoxMeasurePolicy3, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
                Updater.m1290setimpl(m1283constructorimpl4, density4, ComposeUiNode.INSTANCE.getSetDensity());
                Updater.m1290setimpl(m1283constructorimpl4, layoutDirection5, ComposeUiNode.INSTANCE.getSetLayoutDirection());
                Updater.m1290setimpl(m1283constructorimpl4, viewConfiguration4, ComposeUiNode.INSTANCE.getSetViewConfiguration());
                startRestartGroup.enableReusing();
                materializerOf4.invoke(SkippableUpdater.m1273boximpl(SkippableUpdater.m1274constructorimpl(startRestartGroup)), startRestartGroup, 0);
                startRestartGroup.startReplaceableGroup(2058660585);
                startRestartGroup.startReplaceableGroup(-2137368960);
                ComposerKt.sourceInformation(startRestartGroup, "C72@3384L9:Box.kt#2w3rfo");
                BoxScopeInstance boxScopeInstance3 = BoxScopeInstance.INSTANCE;
                startRestartGroup.startReplaceableGroup(1319246300);
                ComposerKt.sourceInformation(startRestartGroup, "C420@20632L7:TextField.kt#jmzs0o");
                function2.invoke(startRestartGroup, Integer.valueOf((i2 >> 6) & 14));
                startRestartGroup.endReplaceableGroup();
                startRestartGroup.endReplaceableGroup();
                startRestartGroup.endReplaceableGroup();
                startRestartGroup.endNode();
                startRestartGroup.endReplaceableGroup();
                startRestartGroup.endReplaceableGroup();
            }
            startRestartGroup.endReplaceableGroup();
            Modifier then4 = LayoutIdKt.layoutId(Modifier.INSTANCE, TextFieldImplKt.TextFieldId).then(m424paddingqDBjuR0$default);
            startRestartGroup.startReplaceableGroup(733328855);
            ComposerKt.sourceInformation(startRestartGroup, "C(Box)P(2,1,3)70@3267L67,71@3339L130:Box.kt#2w3rfo");
            MeasurePolicy rememberBoxMeasurePolicy4 = BoxKt.rememberBoxMeasurePolicy(Alignment.INSTANCE.getTopStart(), true, startRestartGroup, 48);
            startRestartGroup.startReplaceableGroup(-1323940314);
            ComposerKt.sourceInformation(startRestartGroup, "C(Layout)P(!1,2)74@2915L7,75@2970L7,76@3029L7,77@3041L460:Layout.kt#80mrfh");
            ProvidableCompositionLocal<Density> localDensity5 = CompositionLocalsKt.getLocalDensity();
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, 2023513938, "C:CompositionLocal.kt#9igjgp");
            Object consume14 = startRestartGroup.consume(localDensity5);
            ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
            Density density5 = (Density) consume14;
            ProvidableCompositionLocal<LayoutDirection> localLayoutDirection6 = CompositionLocalsKt.getLocalLayoutDirection();
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, 2023513938, "C:CompositionLocal.kt#9igjgp");
            Object consume15 = startRestartGroup.consume(localLayoutDirection6);
            ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
            LayoutDirection layoutDirection6 = (LayoutDirection) consume15;
            ProvidableCompositionLocal<ViewConfiguration> localViewConfiguration5 = CompositionLocalsKt.getLocalViewConfiguration();
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, 2023513938, "C:CompositionLocal.kt#9igjgp");
            Object consume16 = startRestartGroup.consume(localViewConfiguration5);
            ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
            ViewConfiguration viewConfiguration5 = (ViewConfiguration) consume16;
            Function0<ComposeUiNode> constructor5 = ComposeUiNode.INSTANCE.getConstructor();
            Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> materializerOf5 = LayoutKt.materializerOf(then4);
            if (!(startRestartGroup.getApplier() instanceof Applier)) {
                ComposablesKt.invalidApplier();
            }
            startRestartGroup.startReusableNode();
            if (startRestartGroup.getInserting()) {
                startRestartGroup.createNode(constructor5);
            } else {
                startRestartGroup.useNode();
            }
            startRestartGroup.disableReusing();
            Composer m1283constructorimpl5 = Updater.m1283constructorimpl(startRestartGroup);
            Updater.m1290setimpl(m1283constructorimpl5, rememberBoxMeasurePolicy4, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
            Updater.m1290setimpl(m1283constructorimpl5, density5, ComposeUiNode.INSTANCE.getSetDensity());
            Updater.m1290setimpl(m1283constructorimpl5, layoutDirection6, ComposeUiNode.INSTANCE.getSetLayoutDirection());
            Updater.m1290setimpl(m1283constructorimpl5, viewConfiguration5, ComposeUiNode.INSTANCE.getSetViewConfiguration());
            startRestartGroup.enableReusing();
            materializerOf5.invoke(SkippableUpdater.m1273boximpl(SkippableUpdater.m1274constructorimpl(startRestartGroup)), startRestartGroup, 0);
            startRestartGroup.startReplaceableGroup(2058660585);
            startRestartGroup.startReplaceableGroup(-2137368960);
            ComposerKt.sourceInformation(startRestartGroup, "C72@3384L9:Box.kt#2w3rfo");
            BoxScopeInstance boxScopeInstance4 = BoxScopeInstance.INSTANCE;
            startRestartGroup.startReplaceableGroup(-2048931960);
            ComposerKt.sourceInformation(startRestartGroup, "C426@20826L11:TextField.kt#jmzs0o");
            textField.invoke(startRestartGroup, Integer.valueOf((i2 >> 3) & 14));
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
        ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup == null) {
            return;
        }
        endRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material.TextFieldKt$TextFieldLayout$2
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            {
                super(2);
            }

            @Override // kotlin.jvm.functions.Function2
            public /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                invoke(composer2, num.intValue());
                return Unit.INSTANCE;
            }

            public final void invoke(Composer composer2, int i4) {
                TextFieldKt.TextFieldLayout(Modifier.this, textField, function2, function3, function22, function23, z, f, paddingValues, composer2, i | 1);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: calculateWidth-VsPV1Ek, reason: not valid java name */
    public static final int m1236calculateWidthVsPV1Ek(int i, int i2, int i3, int i4, int i5, long j) {
        return Math.max(i + Math.max(i3, Math.max(i4, i5)) + i2, Constraints.m3798getMinWidthimpl(j));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: calculateHeight-O3s9Psw, reason: not valid java name */
    public static final int m1235calculateHeightO3s9Psw(int i, boolean z, int i2, int i3, int i4, int i5, long j, float f, PaddingValues paddingValues) {
        float f2 = TextFieldTopPadding * f;
        float top = paddingValues.getTop() * f;
        float bottom = paddingValues.getBottom() * f;
        int max = Math.max(i, i5);
        return Math.max(MathKt.roundToInt(z ? i2 + f2 + max + bottom : top + max + bottom), Math.max(Math.max(i3, i4), Constraints.m3797getMinHeightimpl(j)));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void placeWithLabel(Placeable.PlacementScope placementScope, int i, int i2, Placeable placeable, Placeable placeable2, Placeable placeable3, Placeable placeable4, Placeable placeable5, boolean z, int i3, int i4, float f, float f2) {
        int roundToInt;
        if (placeable4 != null) {
            Placeable.PlacementScope.placeRelative$default(placementScope, placeable4, 0, Alignment.INSTANCE.getCenterVertically().align(placeable4.getHeight(), i2), 0.0f, 4, null);
        }
        if (placeable5 != null) {
            Placeable.PlacementScope.placeRelative$default(placementScope, placeable5, i - placeable5.getWidth(), Alignment.INSTANCE.getCenterVertically().align(placeable5.getHeight(), i2), 0.0f, 4, null);
        }
        if (placeable2 != null) {
            if (z) {
                roundToInt = Alignment.INSTANCE.getCenterVertically().align(placeable2.getHeight(), i2);
            } else {
                roundToInt = MathKt.roundToInt(TextFieldImplKt.getTextFieldPadding() * f2);
            }
            Placeable.PlacementScope.placeRelative$default(placementScope, placeable2, TextFieldImplKt.widthOrZero(placeable4), roundToInt - MathKt.roundToInt((roundToInt - i3) * f), 0.0f, 4, null);
        }
        Placeable.PlacementScope.placeRelative$default(placementScope, placeable, TextFieldImplKt.widthOrZero(placeable4), i4, 0.0f, 4, null);
        if (placeable3 != null) {
            Placeable.PlacementScope.placeRelative$default(placementScope, placeable3, TextFieldImplKt.widthOrZero(placeable4), i4, 0.0f, 4, null);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void placeWithoutLabel(Placeable.PlacementScope placementScope, int i, int i2, Placeable placeable, Placeable placeable2, Placeable placeable3, Placeable placeable4, boolean z, float f, PaddingValues paddingValues) {
        int roundToInt = MathKt.roundToInt(paddingValues.getTop() * f);
        if (placeable3 != null) {
            Placeable.PlacementScope.placeRelative$default(placementScope, placeable3, 0, Alignment.INSTANCE.getCenterVertically().align(placeable3.getHeight(), i2), 0.0f, 4, null);
        }
        if (placeable4 != null) {
            Placeable.PlacementScope.placeRelative$default(placementScope, placeable4, i - placeable4.getWidth(), Alignment.INSTANCE.getCenterVertically().align(placeable4.getHeight(), i2), 0.0f, 4, null);
        }
        Placeable.PlacementScope.placeRelative$default(placementScope, placeable, TextFieldImplKt.widthOrZero(placeable3), z ? Alignment.INSTANCE.getCenterVertically().align(placeable.getHeight(), i2) : roundToInt, 0.0f, 4, null);
        if (placeable2 != null) {
            if (z) {
                roundToInt = Alignment.INSTANCE.getCenterVertically().align(placeable2.getHeight(), i2);
            }
            Placeable.PlacementScope.placeRelative$default(placementScope, placeable2, TextFieldImplKt.widthOrZero(placeable3), roundToInt, 0.0f, 4, null);
        }
    }

    public static final Modifier drawIndicatorLine(Modifier modifier, final BorderStroke indicatorBorder) {
        Intrinsics.checkNotNullParameter(modifier, "<this>");
        Intrinsics.checkNotNullParameter(indicatorBorder, "indicatorBorder");
        final float width = indicatorBorder.getWidth();
        return DrawModifierKt.drawWithContent(modifier, new Function1<ContentDrawScope, Unit>() { // from class: androidx.compose.material.TextFieldKt$drawIndicatorLine$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(ContentDrawScope contentDrawScope) {
                invoke2(contentDrawScope);
                return Unit.INSTANCE;
            }

            /* renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(ContentDrawScope drawWithContent) {
                Intrinsics.checkNotNullParameter(drawWithContent, "$this$drawWithContent");
                drawWithContent.drawContent();
                if (Dp.m3845equalsimpl0(width, Dp.INSTANCE.m3858getHairlineD9Ej5fM())) {
                    return;
                }
                float density = width * drawWithContent.getDensity();
                float m1458getHeightimpl = Size.m1458getHeightimpl(drawWithContent.mo2122getSizeNHjbRc()) - (density / 2);
                DrawScope.m2108drawLine1RTmtNc$default(drawWithContent, indicatorBorder.getBrush(), OffsetKt.Offset(0.0f, m1458getHeightimpl), OffsetKt.Offset(Size.m1461getWidthimpl(drawWithContent.mo2122getSizeNHjbRc()), m1458getHeightimpl), density, 0, null, 0.0f, null, 0, 496, null);
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
