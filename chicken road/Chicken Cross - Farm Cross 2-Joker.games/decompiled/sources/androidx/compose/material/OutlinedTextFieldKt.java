package androidx.compose.material;

import androidx.compose.foundation.BackgroundKt;
import androidx.compose.foundation.interaction.InteractionSourceKt;
import androidx.compose.foundation.interaction.MutableInteractionSource;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.BoxScopeInstance;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.PaddingValues;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.shape.CornerBasedShape;
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
import androidx.compose.runtime.internal.ComposableLambda;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.draw.DrawModifierKt;
import androidx.compose.ui.geometry.Size;
import androidx.compose.ui.graphics.ClipOp;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.Shadow;
import androidx.compose.ui.graphics.Shape;
import androidx.compose.ui.graphics.SolidColor;
import androidx.compose.ui.graphics.drawscope.ContentDrawScope;
import androidx.compose.ui.graphics.drawscope.DrawContext;
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
import androidx.compose.ui.unit.IntOffset;
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

/* compiled from: OutlinedTextField.kt */
@Metadata(d1 = {"\u0000¤\u0001\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\u001a\u0087\u0002\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000b2\u0012\u0010\f\u001a\u000e\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\t0\r2\b\b\u0002\u0010\u000e\u001a\u00020\u000f2\b\b\u0002\u0010\u0010\u001a\u00020\u00112\b\b\u0002\u0010\u0012\u001a\u00020\u00112\b\b\u0002\u0010\u0013\u001a\u00020\u00142\u0015\b\u0002\u0010\u0015\u001a\u000f\u0012\u0004\u0012\u00020\t\u0018\u00010\u0016¢\u0006\u0002\b\u00172\u0015\b\u0002\u0010\u0018\u001a\u000f\u0012\u0004\u0012\u00020\t\u0018\u00010\u0016¢\u0006\u0002\b\u00172\u0015\b\u0002\u0010\u0019\u001a\u000f\u0012\u0004\u0012\u00020\t\u0018\u00010\u0016¢\u0006\u0002\b\u00172\u0015\b\u0002\u0010\u001a\u001a\u000f\u0012\u0004\u0012\u00020\t\u0018\u00010\u0016¢\u0006\u0002\b\u00172\b\b\u0002\u0010\u001b\u001a\u00020\u00112\b\b\u0002\u0010\u001c\u001a\u00020\u001d2\b\b\u0002\u0010\u001e\u001a\u00020\u001f2\b\b\u0002\u0010 \u001a\u00020!2\b\b\u0002\u0010\"\u001a\u00020\u00112\b\b\u0002\u0010#\u001a\u00020$2\b\b\u0002\u0010%\u001a\u00020&2\b\b\u0002\u0010'\u001a\u00020(2\b\b\u0002\u0010)\u001a\u00020*H\u0007¢\u0006\u0002\u0010+\u001a\u0087\u0002\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u00012\u0012\u0010\f\u001a\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\t0\r2\b\b\u0002\u0010\u000e\u001a\u00020\u000f2\b\b\u0002\u0010\u0010\u001a\u00020\u00112\b\b\u0002\u0010\u0012\u001a\u00020\u00112\b\b\u0002\u0010\u0013\u001a\u00020\u00142\u0015\b\u0002\u0010\u0015\u001a\u000f\u0012\u0004\u0012\u00020\t\u0018\u00010\u0016¢\u0006\u0002\b\u00172\u0015\b\u0002\u0010\u0018\u001a\u000f\u0012\u0004\u0012\u00020\t\u0018\u00010\u0016¢\u0006\u0002\b\u00172\u0015\b\u0002\u0010\u0019\u001a\u000f\u0012\u0004\u0012\u00020\t\u0018\u00010\u0016¢\u0006\u0002\b\u00172\u0015\b\u0002\u0010\u001a\u001a\u000f\u0012\u0004\u0012\u00020\t\u0018\u00010\u0016¢\u0006\u0002\b\u00172\b\b\u0002\u0010\u001b\u001a\u00020\u00112\b\b\u0002\u0010\u001c\u001a\u00020\u001d2\b\b\u0002\u0010\u001e\u001a\u00020\u001f2\b\b\u0002\u0010 \u001a\u00020!2\b\b\u0002\u0010\"\u001a\u00020\u00112\b\b\u0002\u0010#\u001a\u00020$2\b\b\u0002\u0010%\u001a\u00020&2\b\b\u0002\u0010'\u001a\u00020(2\b\b\u0002\u0010)\u001a\u00020*H\u0007¢\u0006\u0002\u0010,\u001aÄ\u0001\u0010-\u001a\u00020\t2\u0006\u0010\u000e\u001a\u00020\u000f2\u0011\u0010.\u001a\r\u0012\u0004\u0012\u00020\t0\u0016¢\u0006\u0002\b\u00172\u0019\u0010\u0018\u001a\u0015\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020\t\u0018\u00010\r¢\u0006\u0002\b\u00172\u0013\u0010\u0015\u001a\u000f\u0012\u0004\u0012\u00020\t\u0018\u00010\u0016¢\u0006\u0002\b\u00172\u0013\u0010/\u001a\u000f\u0012\u0004\u0012\u00020\t\u0018\u00010\u0016¢\u0006\u0002\b\u00172\u0013\u00100\u001a\u000f\u0012\u0004\u0012\u00020\t\u0018\u00010\u0016¢\u0006\u0002\b\u00172\u0006\u0010\"\u001a\u00020\u00112\u0006\u00101\u001a\u0002022\u0012\u00103\u001a\u000e\u0012\u0004\u0012\u000204\u0012\u0004\u0012\u00020\t0\r2\u0011\u00105\u001a\r\u0012\u0004\u0012\u00020\t0\u0016¢\u0006\u0002\b\u00172\u0006\u00106\u001a\u000207H\u0001ø\u0001\u0000¢\u0006\u0002\u00108\u001aU\u00109\u001a\u00020$2\u0006\u0010:\u001a\u00020$2\u0006\u0010;\u001a\u00020$2\u0006\u0010<\u001a\u00020$2\u0006\u0010=\u001a\u00020$2\u0006\u0010>\u001a\u00020$2\u0006\u0010?\u001a\u00020@2\u0006\u0010A\u001a\u0002022\u0006\u00106\u001a\u000207H\u0002ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\bB\u0010C\u001aE\u0010D\u001a\u00020$2\u0006\u0010E\u001a\u00020$2\u0006\u0010F\u001a\u00020$2\u0006\u0010G\u001a\u00020$2\u0006\u0010H\u001a\u00020$2\u0006\u0010I\u001a\u00020$2\u0006\u0010?\u001a\u00020@H\u0002ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\bJ\u0010K\u001a)\u0010L\u001a\u00020\u000f*\u00020\u000f2\u0006\u0010M\u001a\u0002042\u0006\u00106\u001a\u000207H\u0000ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\bN\u0010O\u001a|\u0010P\u001a\u00020\t*\u00020Q2\u0006\u0010R\u001a\u00020$2\u0006\u0010S\u001a\u00020$2\b\u0010T\u001a\u0004\u0018\u00010U2\b\u0010V\u001a\u0004\u0018\u00010U2\u0006\u0010W\u001a\u00020U2\b\u0010X\u001a\u0004\u0018\u00010U2\b\u0010Y\u001a\u0004\u0018\u00010U2\u0006\u0010Z\u001a\u00020U2\u0006\u00101\u001a\u0002022\u0006\u0010\"\u001a\u00020\u00112\u0006\u0010A\u001a\u0002022\u0006\u0010[\u001a\u00020\\2\u0006\u00106\u001a\u000207H\u0002\"\u000e\u0010\u0000\u001a\u00020\u0001X\u0080T¢\u0006\u0002\n\u0000\"\u0013\u0010\u0002\u001a\u00020\u0003X\u0082\u0004ø\u0001\u0000¢\u0006\u0004\n\u0002\u0010\u0004\"\u0019\u0010\u0005\u001a\u00020\u0003X\u0080\u0004ø\u0001\u0000¢\u0006\n\n\u0002\u0010\u0004\u001a\u0004\b\u0006\u0010\u0007\u0082\u0002\u000b\n\u0002\b\u0019\n\u0005\b¡\u001e0\u0001¨\u0006]"}, d2 = {"BorderId", "", "OutlinedTextFieldInnerPadding", "Landroidx/compose/ui/unit/Dp;", "F", "OutlinedTextFieldTopPadding", "getOutlinedTextFieldTopPadding", "()F", "OutlinedTextField", "", "value", "Landroidx/compose/ui/text/input/TextFieldValue;", "onValueChange", "Lkotlin/Function1;", "modifier", "Landroidx/compose/ui/Modifier;", "enabled", "", "readOnly", "textStyle", "Landroidx/compose/ui/text/TextStyle;", "label", "Lkotlin/Function0;", "Landroidx/compose/runtime/Composable;", "placeholder", "leadingIcon", "trailingIcon", "isError", "visualTransformation", "Landroidx/compose/ui/text/input/VisualTransformation;", "keyboardOptions", "Landroidx/compose/foundation/text/KeyboardOptions;", "keyboardActions", "Landroidx/compose/foundation/text/KeyboardActions;", "singleLine", "maxLines", "", "interactionSource", "Landroidx/compose/foundation/interaction/MutableInteractionSource;", "shape", "Landroidx/compose/ui/graphics/Shape;", "colors", "Landroidx/compose/material/TextFieldColors;", "(Landroidx/compose/ui/text/input/TextFieldValue;Lkotlin/jvm/functions/Function1;Landroidx/compose/ui/Modifier;ZZLandroidx/compose/ui/text/TextStyle;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;ZLandroidx/compose/ui/text/input/VisualTransformation;Landroidx/compose/foundation/text/KeyboardOptions;Landroidx/compose/foundation/text/KeyboardActions;ZILandroidx/compose/foundation/interaction/MutableInteractionSource;Landroidx/compose/ui/graphics/Shape;Landroidx/compose/material/TextFieldColors;Landroidx/compose/runtime/Composer;III)V", "(Ljava/lang/String;Lkotlin/jvm/functions/Function1;Landroidx/compose/ui/Modifier;ZZLandroidx/compose/ui/text/TextStyle;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;ZLandroidx/compose/ui/text/input/VisualTransformation;Landroidx/compose/foundation/text/KeyboardOptions;Landroidx/compose/foundation/text/KeyboardActions;ZILandroidx/compose/foundation/interaction/MutableInteractionSource;Landroidx/compose/ui/graphics/Shape;Landroidx/compose/material/TextFieldColors;Landroidx/compose/runtime/Composer;III)V", "OutlinedTextFieldLayout", "textField", "leading", "trailing", "animationProgress", "", "onLabelMeasured", "Landroidx/compose/ui/geometry/Size;", OutlinedTextFieldKt.BorderId, "paddingValues", "Landroidx/compose/foundation/layout/PaddingValues;", "(Landroidx/compose/ui/Modifier;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function3;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;ZFLkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function2;Landroidx/compose/foundation/layout/PaddingValues;Landroidx/compose/runtime/Composer;II)V", "calculateHeight", "leadingPlaceableHeight", "trailingPlaceableHeight", "textFieldPlaceableHeight", "labelPlaceableHeight", "placeholderPlaceableHeight", "constraints", "Landroidx/compose/ui/unit/Constraints;", "density", "calculateHeight-zUg2_y0", "(IIIIIJFLandroidx/compose/foundation/layout/PaddingValues;)I", "calculateWidth", "leadingPlaceableWidth", "trailingPlaceableWidth", "textFieldPlaceableWidth", "labelPlaceableWidth", "placeholderPlaceableWidth", "calculateWidth-VsPV1Ek", "(IIIIIJ)I", "outlineCutout", "labelSize", "outlineCutout-12SF9DM", "(Landroidx/compose/ui/Modifier;JLandroidx/compose/foundation/layout/PaddingValues;)Landroidx/compose/ui/Modifier;", "place", "Landroidx/compose/ui/layout/Placeable$PlacementScope;", "height", "width", "leadingPlaceable", "Landroidx/compose/ui/layout/Placeable;", "trailingPlaceable", "textFieldPlaceable", "labelPlaceable", "placeholderPlaceable", "borderPlaceable", "layoutDirection", "Landroidx/compose/ui/unit/LayoutDirection;", "material_release"}, k = 2, mv = {1, 6, 0}, xi = 48)
/* loaded from: classes.dex */
public final class OutlinedTextFieldKt {
    public static final String BorderId = "border";
    private static final float OutlinedTextFieldInnerPadding = Dp.m3840constructorimpl(4);
    private static final float OutlinedTextFieldTopPadding = Dp.m3840constructorimpl(8);

    /* JADX WARN: Code restructure failed: missing block: B:57:0x01b6, code lost:
    
        if (r7.changed(r82) == false) goto L145;
     */
    /* JADX WARN: Removed duplicated region for block: B:100:0x02a2  */
    /* JADX WARN: Removed duplicated region for block: B:121:0x047a  */
    /* JADX WARN: Removed duplicated region for block: B:124:0x04ca  */
    /* JADX WARN: Removed duplicated region for block: B:126:0x04e6  */
    /* JADX WARN: Removed duplicated region for block: B:128:0x02f7  */
    /* JADX WARN: Removed duplicated region for block: B:130:0x0300  */
    /* JADX WARN: Removed duplicated region for block: B:132:0x0306  */
    /* JADX WARN: Removed duplicated region for block: B:135:0x030e  */
    /* JADX WARN: Removed duplicated region for block: B:137:0x0338  */
    /* JADX WARN: Removed duplicated region for block: B:139:0x033e  */
    /* JADX WARN: Removed duplicated region for block: B:13:0x0075  */
    /* JADX WARN: Removed duplicated region for block: B:141:0x0344  */
    /* JADX WARN: Removed duplicated region for block: B:143:0x034a  */
    /* JADX WARN: Removed duplicated region for block: B:145:0x0350  */
    /* JADX WARN: Removed duplicated region for block: B:147:0x0356  */
    /* JADX WARN: Removed duplicated region for block: B:150:0x0363  */
    /* JADX WARN: Removed duplicated region for block: B:153:0x0374  */
    /* JADX WARN: Removed duplicated region for block: B:155:0x0381  */
    /* JADX WARN: Removed duplicated region for block: B:157:0x0387  */
    /* JADX WARN: Removed duplicated region for block: B:160:0x0393  */
    /* JADX WARN: Removed duplicated region for block: B:166:0x03c1  */
    /* JADX WARN: Removed duplicated region for block: B:169:0x03df  */
    /* JADX WARN: Removed duplicated region for block: B:170:0x043e  */
    /* JADX WARN: Removed duplicated region for block: B:171:0x03d6  */
    /* JADX WARN: Removed duplicated region for block: B:172:0x03b9  */
    /* JADX WARN: Removed duplicated region for block: B:173:0x038d  */
    /* JADX WARN: Removed duplicated region for block: B:174:0x0383  */
    /* JADX WARN: Removed duplicated region for block: B:175:0x037d  */
    /* JADX WARN: Removed duplicated region for block: B:176:0x036c  */
    /* JADX WARN: Removed duplicated region for block: B:177:0x035d  */
    /* JADX WARN: Removed duplicated region for block: B:178:0x0352  */
    /* JADX WARN: Removed duplicated region for block: B:179:0x034c  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0096  */
    /* JADX WARN: Removed duplicated region for block: B:180:0x0346  */
    /* JADX WARN: Removed duplicated region for block: B:181:0x0340  */
    /* JADX WARN: Removed duplicated region for block: B:182:0x033a  */
    /* JADX WARN: Removed duplicated region for block: B:183:0x0330  */
    /* JADX WARN: Removed duplicated region for block: B:184:0x0308  */
    /* JADX WARN: Removed duplicated region for block: B:185:0x0302  */
    /* JADX WARN: Removed duplicated region for block: B:186:0x02fc  */
    /* JADX WARN: Removed duplicated region for block: B:188:0x0256  */
    /* JADX WARN: Removed duplicated region for block: B:190:0x023a  */
    /* JADX WARN: Removed duplicated region for block: B:191:0x020f  */
    /* JADX WARN: Removed duplicated region for block: B:198:0x01ef  */
    /* JADX WARN: Removed duplicated region for block: B:205:0x01cd  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x00bb  */
    /* JADX WARN: Removed duplicated region for block: B:212:0x01c0  */
    /* JADX WARN: Removed duplicated region for block: B:215:0x01a6  */
    /* JADX WARN: Removed duplicated region for block: B:216:0x0179  */
    /* JADX WARN: Removed duplicated region for block: B:223:0x015a  */
    /* JADX WARN: Removed duplicated region for block: B:231:0x013c  */
    /* JADX WARN: Removed duplicated region for block: B:238:0x011e  */
    /* JADX WARN: Removed duplicated region for block: B:245:0x00fe  */
    /* JADX WARN: Removed duplicated region for block: B:252:0x00de  */
    /* JADX WARN: Removed duplicated region for block: B:260:0x00cf  */
    /* JADX WARN: Removed duplicated region for block: B:261:0x009b  */
    /* JADX WARN: Removed duplicated region for block: B:268:0x0078  */
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
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void OutlinedTextField(final String value, final Function1<? super String, Unit> onValueChange, Modifier modifier, boolean z, boolean z2, TextStyle textStyle, Function2<? super Composer, ? super Integer, Unit> function2, Function2<? super Composer, ? super Integer, Unit> function22, Function2<? super Composer, ? super Integer, Unit> function23, Function2<? super Composer, ? super Integer, Unit> function24, boolean z3, VisualTransformation visualTransformation, KeyboardOptions keyboardOptions, KeyboardActions keyboardActions, boolean z4, int i, MutableInteractionSource mutableInteractionSource, Shape shape, TextFieldColors textFieldColors, Composer composer, final int i2, final int i3, final int i4) {
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
        Modifier modifier2;
        boolean z5;
        TextStyle textStyle2;
        KeyboardOptions keyboardOptions2;
        KeyboardActions keyboardActions2;
        int i18;
        Function2<? super Composer, ? super Integer, Unit> function25;
        MutableInteractionSource mutableInteractionSource2;
        MutableInteractionSource mutableInteractionSource3;
        CornerBasedShape cornerBasedShape;
        Modifier modifier3;
        KeyboardActions keyboardActions3;
        Function2<? super Composer, ? super Integer, Unit> function26;
        MutableInteractionSource mutableInteractionSource4;
        Function2<? super Composer, ? super Integer, Unit> function27;
        VisualTransformation visualTransformation2;
        Function2<? super Composer, ? super Integer, Unit> function28;
        Function2<? super Composer, ? super Integer, Unit> function29;
        boolean z6;
        KeyboardOptions keyboardOptions3;
        boolean z7;
        boolean z8;
        Shape shape2;
        TextStyle textStyle3;
        boolean z9;
        TextFieldColors m1221outlinedTextFieldColorsdx8h9Zs;
        long m3502getColor0d7_KjU;
        Composer composer2;
        final Modifier modifier4;
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
        final boolean z12;
        final TextFieldColors textFieldColors2;
        final Shape shape3;
        final TextStyle textStyle4;
        final boolean z13;
        final int i19;
        int i20;
        Intrinsics.checkNotNullParameter(value, "value");
        Intrinsics.checkNotNullParameter(onValueChange, "onValueChange");
        Composer startRestartGroup = composer.startRestartGroup(-2099955827);
        ComposerKt.sourceInformation(startRestartGroup, "C(OutlinedTextField)P(17,10,9,1,12,15,6,11,7,16,3,18,5,4,14,8,2,13)137@7575L7,148@8135L39,149@8209L6,150@8271L25,166@8821L24,175@9187L20,159@8599L1801:OutlinedTextField.kt#jmzs0o");
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
                    i23 |= ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE;
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
                    i23 |= ((i4 & 262144) == 0 && startRestartGroup.changed(textFieldColors)) ? AccessibilityEventCompat.TYPE_VIEW_TARGETED_BY_SCROLL : 33554432;
                }
                if ((i5 & 1533916891) == 306783378 || (191739611 & i23) != 38347922 || !startRestartGroup.getSkipping()) {
                    startRestartGroup.startDefaults();
                    if ((i2 & 1) != 0 || startRestartGroup.getDefaultsInvalid()) {
                        Modifier.Companion companion = i21 != 0 ? Modifier.INSTANCE : modifier;
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
                        boolean z16 = i12 != 0 ? false : z3;
                        VisualTransformation none = i14 != 0 ? VisualTransformation.INSTANCE.getNone() : visualTransformation;
                        if ((i4 & 4096) != 0) {
                            keyboardOptions2 = KeyboardOptions.INSTANCE.getDefault();
                            i23 &= -897;
                        } else {
                            keyboardOptions2 = keyboardOptions;
                        }
                        int i24 = i5;
                        if ((i4 & 8192) != 0) {
                            keyboardActions2 = KeyboardActions.INSTANCE.getDefault();
                            i23 &= -7169;
                        } else {
                            keyboardActions2 = keyboardActions;
                        }
                        boolean z17 = i15 != 0 ? false : z4;
                        i18 = i16 != 0 ? Integer.MAX_VALUE : i;
                        KeyboardActions keyboardActions5 = keyboardActions2;
                        if (i17 != 0) {
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
                            cornerBasedShape = MaterialTheme.INSTANCE.getShapes(startRestartGroup, 6).getSmall();
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
                            m1221outlinedTextFieldColorsdx8h9Zs = TextFieldDefaults.INSTANCE.m1221outlinedTextFieldColorsdx8h9Zs(0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, startRestartGroup, 0, 0, 48, 2097151);
                            startRestartGroup.endDefaults();
                            startRestartGroup.startReplaceableGroup(1961394975);
                            ComposerKt.sourceInformation(startRestartGroup, "*154@8448L18");
                            m3502getColor0d7_KjU = textStyle3.m3502getColor0d7_KjU();
                            if (m3502getColor0d7_KjU == Color.INSTANCE.m1664getUnspecified0d7_KjU()) {
                                m3502getColor0d7_KjU = m1221outlinedTextFieldColorsdx8h9Zs.textColor(z8, startRestartGroup, ((i5 >> 9) & 14) | ((i23 >> 21) & 112)).getValue().m1638unboximpl();
                            }
                            startRestartGroup.endReplaceableGroup();
                            TextStyle merge = textStyle3.merge(new TextStyle(m3502getColor0d7_KjU, 0L, (FontWeight) null, (FontStyle) null, (FontSynthesis) null, (FontFamily) null, (String) null, 0L, (BaselineShift) null, (TextGeometricTransform) null, (LocaleList) null, 0L, (TextDecoration) null, (Shadow) null, (TextAlign) null, (TextDirection) null, 0L, (TextIndent) null, 262142, (DefaultConstructorMarker) null));
                            int i25 = (i23 >> 21) & 112;
                            final boolean z18 = z8;
                            final boolean z19 = z6;
                            final VisualTransformation visualTransformation4 = visualTransformation2;
                            final MutableInteractionSource mutableInteractionSource6 = mutableInteractionSource4;
                            final boolean z20 = z9;
                            final Function2<? super Composer, ? super Integer, Unit> function218 = function29;
                            final Function2<? super Composer, ? super Integer, Unit> function219 = function28;
                            final Function2<? super Composer, ? super Integer, Unit> function220 = function26;
                            final Function2<? super Composer, ? super Integer, Unit> function221 = function27;
                            final TextFieldColors textFieldColors3 = m1221outlinedTextFieldColorsdx8h9Zs;
                            final int i26 = i5;
                            final int i27 = i23;
                            final Shape shape4 = shape2;
                            int i28 = i23 << 12;
                            Shape shape5 = shape2;
                            composer2 = startRestartGroup;
                            TextStyle textStyle5 = textStyle3;
                            boolean z21 = z8;
                            BasicTextFieldKt.BasicTextField(value, onValueChange, SizeKt.m445defaultMinSizeVpY3zN4(BackgroundKt.m172backgroundbw27NRU(function29 == null ? PaddingKt.m424paddingqDBjuR0$default(modifier3, 0.0f, OutlinedTextFieldTopPadding, 0.0f, 0.0f, 13, null) : modifier3, m1221outlinedTextFieldColorsdx8h9Zs.backgroundColor(z8, startRestartGroup, ((i5 >> 9) & 14) | i25).getValue().m1638unboximpl(), shape2), TextFieldDefaults.INSTANCE.m1218getMinWidthD9Ej5fM(), TextFieldDefaults.INSTANCE.m1217getMinHeightD9Ej5fM()), z8, z7, merge, keyboardOptions3, keyboardActions3, z6, i18, visualTransformation2, (Function1<? super TextLayoutResult, Unit>) null, mutableInteractionSource4, new SolidColor(m1221outlinedTextFieldColorsdx8h9Zs.cursorColor(z9, startRestartGroup, i25 | (i23 & 14)).getValue().m1638unboximpl(), null), ComposableLambdaKt.composableLambda(startRestartGroup, 986454116, true, new Function3<Function2<? super Composer, ? super Integer, ? extends Unit>, Composer, Integer, Unit>() { // from class: androidx.compose.material.OutlinedTextFieldKt$OutlinedTextField$2
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
                                    ComposerKt.sourceInformation(composer3, "C183@9550L834:OutlinedTextField.kt#jmzs0o");
                                    if ((i29 & 14) == 0) {
                                        i30 = i29 | (composer3.changed(innerTextField) ? 4 : 2);
                                    } else {
                                        i30 = i29;
                                    }
                                    if ((i30 & 91) != 18 || !composer3.getSkipping()) {
                                        TextFieldDefaults textFieldDefaults = TextFieldDefaults.INSTANCE;
                                        String str = value;
                                        boolean z22 = z18;
                                        boolean z23 = z19;
                                        VisualTransformation visualTransformation5 = visualTransformation4;
                                        MutableInteractionSource mutableInteractionSource7 = mutableInteractionSource6;
                                        boolean z24 = z20;
                                        Function2<Composer, Integer, Unit> function222 = function218;
                                        Function2<Composer, Integer, Unit> function223 = function219;
                                        Function2<Composer, Integer, Unit> function224 = function220;
                                        Function2<Composer, Integer, Unit> function225 = function221;
                                        TextFieldColors textFieldColors4 = textFieldColors3;
                                        final boolean z25 = z18;
                                        final boolean z26 = z20;
                                        final MutableInteractionSource mutableInteractionSource8 = mutableInteractionSource6;
                                        final TextFieldColors textFieldColors5 = textFieldColors3;
                                        final Shape shape6 = shape4;
                                        final int i31 = i26;
                                        final int i32 = i27;
                                        ComposableLambda composableLambda = ComposableLambdaKt.composableLambda(composer3, 329542189, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material.OutlinedTextFieldKt$OutlinedTextField$2.1
                                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                            {
                                                super(2);
                                            }

                                            @Override // kotlin.jvm.functions.Function2
                                            public /* bridge */ /* synthetic */ Unit invoke(Composer composer4, Integer num) {
                                                invoke(composer4, num.intValue());
                                                return Unit.INSTANCE;
                                            }

                                            public final void invoke(Composer composer4, int i33) {
                                                ComposerKt.sourceInformation(composer4, "C197@10149L203:OutlinedTextField.kt#jmzs0o");
                                                if ((i33 & 11) != 2 || !composer4.getSkipping()) {
                                                    TextFieldDefaults textFieldDefaults2 = TextFieldDefaults.INSTANCE;
                                                    boolean z27 = z25;
                                                    boolean z28 = z26;
                                                    MutableInteractionSource mutableInteractionSource9 = mutableInteractionSource8;
                                                    TextFieldColors textFieldColors6 = textFieldColors5;
                                                    Shape shape7 = shape6;
                                                    int i34 = ((i31 >> 9) & 14) | 12582912;
                                                    int i35 = i32;
                                                    textFieldDefaults2.m1215BorderBoxnbWgWpA(z27, z28, mutableInteractionSource9, textFieldColors6, shape7, 0.0f, 0.0f, composer4, i34 | ((i35 << 3) & 112) | ((i35 >> 12) & 896) | ((i35 >> 15) & 7168) | ((i35 >> 9) & 57344), 96);
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
                            }), composer2, (i5 & 64638) | (i28 & 3670016) | (KeyboardActions.$stable << 21) | (i28 & 29360128) | (i28 & 234881024) | (i28 & 1879048192), ((i23 >> 3) & 14) | 24576 | ((i23 >> 12) & 896), 2048);
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
                            textFieldColors2 = m1221outlinedTextFieldColorsdx8h9Zs;
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
                    m1221outlinedTextFieldColorsdx8h9Zs = textFieldColors;
                    startRestartGroup.endDefaults();
                    startRestartGroup.startReplaceableGroup(1961394975);
                    ComposerKt.sourceInformation(startRestartGroup, "*154@8448L18");
                    m3502getColor0d7_KjU = textStyle3.m3502getColor0d7_KjU();
                    if (m3502getColor0d7_KjU == Color.INSTANCE.m1664getUnspecified0d7_KjU()) {
                    }
                    startRestartGroup.endReplaceableGroup();
                    TextStyle merge2 = textStyle3.merge(new TextStyle(m3502getColor0d7_KjU, 0L, (FontWeight) null, (FontStyle) null, (FontSynthesis) null, (FontFamily) null, (String) null, 0L, (BaselineShift) null, (TextGeometricTransform) null, (LocaleList) null, 0L, (TextDecoration) null, (Shadow) null, (TextAlign) null, (TextDirection) null, 0L, (TextIndent) null, 262142, (DefaultConstructorMarker) null));
                    int i252 = (i23 >> 21) & 112;
                    final boolean z182 = z8;
                    final boolean z192 = z6;
                    final VisualTransformation visualTransformation42 = visualTransformation2;
                    final MutableInteractionSource mutableInteractionSource62 = mutableInteractionSource4;
                    final boolean z202 = z9;
                    final Function2<? super Composer, ? super Integer, Unit> function2182 = function29;
                    final Function2<? super Composer, ? super Integer, Unit> function2192 = function28;
                    final Function2<? super Composer, ? super Integer, Unit> function2202 = function26;
                    final Function2<? super Composer, ? super Integer, Unit> function2212 = function27;
                    final TextFieldColors textFieldColors32 = m1221outlinedTextFieldColorsdx8h9Zs;
                    final int i262 = i5;
                    final int i272 = i23;
                    final Shape shape42 = shape2;
                    int i282 = i23 << 12;
                    Shape shape52 = shape2;
                    composer2 = startRestartGroup;
                    TextStyle textStyle52 = textStyle3;
                    boolean z212 = z8;
                    BasicTextFieldKt.BasicTextField(value, onValueChange, SizeKt.m445defaultMinSizeVpY3zN4(BackgroundKt.m172backgroundbw27NRU(function29 == null ? PaddingKt.m424paddingqDBjuR0$default(modifier3, 0.0f, OutlinedTextFieldTopPadding, 0.0f, 0.0f, 13, null) : modifier3, m1221outlinedTextFieldColorsdx8h9Zs.backgroundColor(z8, startRestartGroup, ((i5 >> 9) & 14) | i252).getValue().m1638unboximpl(), shape2), TextFieldDefaults.INSTANCE.m1218getMinWidthD9Ej5fM(), TextFieldDefaults.INSTANCE.m1217getMinHeightD9Ej5fM()), z8, z7, merge2, keyboardOptions3, keyboardActions3, z6, i18, visualTransformation2, (Function1<? super TextLayoutResult, Unit>) null, mutableInteractionSource4, new SolidColor(m1221outlinedTextFieldColorsdx8h9Zs.cursorColor(z9, startRestartGroup, i252 | (i23 & 14)).getValue().m1638unboximpl(), null), ComposableLambdaKt.composableLambda(startRestartGroup, 986454116, true, new Function3<Function2<? super Composer, ? super Integer, ? extends Unit>, Composer, Integer, Unit>() { // from class: androidx.compose.material.OutlinedTextFieldKt$OutlinedTextField$2
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
                            ComposerKt.sourceInformation(composer3, "C183@9550L834:OutlinedTextField.kt#jmzs0o");
                            if ((i29 & 14) == 0) {
                                i30 = i29 | (composer3.changed(innerTextField) ? 4 : 2);
                            } else {
                                i30 = i29;
                            }
                            if ((i30 & 91) != 18 || !composer3.getSkipping()) {
                                TextFieldDefaults textFieldDefaults = TextFieldDefaults.INSTANCE;
                                String str = value;
                                boolean z22 = z182;
                                boolean z23 = z192;
                                VisualTransformation visualTransformation5 = visualTransformation42;
                                MutableInteractionSource mutableInteractionSource7 = mutableInteractionSource62;
                                boolean z24 = z202;
                                Function2<Composer, Integer, Unit> function222 = function2182;
                                Function2<Composer, Integer, Unit> function223 = function2192;
                                Function2<Composer, Integer, Unit> function224 = function2202;
                                Function2<Composer, Integer, Unit> function225 = function2212;
                                TextFieldColors textFieldColors4 = textFieldColors32;
                                final boolean z25 = z182;
                                final boolean z26 = z202;
                                final MutableInteractionSource mutableInteractionSource8 = mutableInteractionSource62;
                                final TextFieldColors textFieldColors5 = textFieldColors32;
                                final Shape shape6 = shape42;
                                final int i31 = i262;
                                final int i32 = i272;
                                ComposableLambda composableLambda = ComposableLambdaKt.composableLambda(composer3, 329542189, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material.OutlinedTextFieldKt$OutlinedTextField$2.1
                                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                    {
                                        super(2);
                                    }

                                    @Override // kotlin.jvm.functions.Function2
                                    public /* bridge */ /* synthetic */ Unit invoke(Composer composer4, Integer num) {
                                        invoke(composer4, num.intValue());
                                        return Unit.INSTANCE;
                                    }

                                    public final void invoke(Composer composer4, int i33) {
                                        ComposerKt.sourceInformation(composer4, "C197@10149L203:OutlinedTextField.kt#jmzs0o");
                                        if ((i33 & 11) != 2 || !composer4.getSkipping()) {
                                            TextFieldDefaults textFieldDefaults2 = TextFieldDefaults.INSTANCE;
                                            boolean z27 = z25;
                                            boolean z28 = z26;
                                            MutableInteractionSource mutableInteractionSource9 = mutableInteractionSource8;
                                            TextFieldColors textFieldColors6 = textFieldColors5;
                                            Shape shape7 = shape6;
                                            int i34 = ((i31 >> 9) & 14) | 12582912;
                                            int i35 = i32;
                                            textFieldDefaults2.m1215BorderBoxnbWgWpA(z27, z28, mutableInteractionSource9, textFieldColors6, shape7, 0.0f, 0.0f, composer4, i34 | ((i35 << 3) & 112) | ((i35 >> 12) & 896) | ((i35 >> 15) & 7168) | ((i35 >> 9) & 57344), 96);
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
                    }), composer2, (i5 & 64638) | (i282 & 3670016) | (KeyboardActions.$stable << 21) | (i282 & 29360128) | (i282 & 234881024) | (i282 & 1879048192), ((i23 >> 3) & 14) | 24576 | ((i23 >> 12) & 896), 2048);
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
                    textFieldColors2 = m1221outlinedTextFieldColorsdx8h9Zs;
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
                ScopeUpdateScope endRestartGroup = composer2.endRestartGroup();
                if (endRestartGroup == null) {
                    return;
                }
                endRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material.OutlinedTextFieldKt$OutlinedTextField$3
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
                        OutlinedTextFieldKt.OutlinedTextField(value, onValueChange, modifier4, z13, z10, textStyle4, function210, function211, function212, function213, z12, visualTransformation3, keyboardOptions4, keyboardActions4, z11, i19, mutableInteractionSource5, shape3, textFieldColors2, composer3, i2 | 1, i3, i4);
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
            KeyboardActions keyboardActions52 = keyboardActions2;
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
        KeyboardActions keyboardActions522 = keyboardActions2;
        if (i17 != 0) {
        }
        if ((i4 & 131072) != 0) {
        }
        if ((262144 & i4) != 0) {
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:57:0x01b6, code lost:
    
        if (r7.changed(r82) == false) goto L145;
     */
    /* JADX WARN: Removed duplicated region for block: B:100:0x02a2  */
    /* JADX WARN: Removed duplicated region for block: B:121:0x0495  */
    /* JADX WARN: Removed duplicated region for block: B:124:0x04e5  */
    /* JADX WARN: Removed duplicated region for block: B:126:0x0501  */
    /* JADX WARN: Removed duplicated region for block: B:128:0x02f7  */
    /* JADX WARN: Removed duplicated region for block: B:130:0x0300  */
    /* JADX WARN: Removed duplicated region for block: B:132:0x0306  */
    /* JADX WARN: Removed duplicated region for block: B:135:0x030e  */
    /* JADX WARN: Removed duplicated region for block: B:137:0x0338  */
    /* JADX WARN: Removed duplicated region for block: B:139:0x033e  */
    /* JADX WARN: Removed duplicated region for block: B:13:0x0075  */
    /* JADX WARN: Removed duplicated region for block: B:141:0x0344  */
    /* JADX WARN: Removed duplicated region for block: B:143:0x034a  */
    /* JADX WARN: Removed duplicated region for block: B:145:0x0350  */
    /* JADX WARN: Removed duplicated region for block: B:147:0x0356  */
    /* JADX WARN: Removed duplicated region for block: B:150:0x0363  */
    /* JADX WARN: Removed duplicated region for block: B:153:0x0374  */
    /* JADX WARN: Removed duplicated region for block: B:155:0x03a2  */
    /* JADX WARN: Removed duplicated region for block: B:157:0x03a8  */
    /* JADX WARN: Removed duplicated region for block: B:160:0x03b4  */
    /* JADX WARN: Removed duplicated region for block: B:166:0x03e2  */
    /* JADX WARN: Removed duplicated region for block: B:169:0x03fa  */
    /* JADX WARN: Removed duplicated region for block: B:170:0x0459  */
    /* JADX WARN: Removed duplicated region for block: B:171:0x03f1  */
    /* JADX WARN: Removed duplicated region for block: B:172:0x03da  */
    /* JADX WARN: Removed duplicated region for block: B:173:0x03ae  */
    /* JADX WARN: Removed duplicated region for block: B:174:0x03a4  */
    /* JADX WARN: Removed duplicated region for block: B:175:0x039e  */
    /* JADX WARN: Removed duplicated region for block: B:176:0x036c  */
    /* JADX WARN: Removed duplicated region for block: B:177:0x035d  */
    /* JADX WARN: Removed duplicated region for block: B:178:0x0352  */
    /* JADX WARN: Removed duplicated region for block: B:179:0x034c  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0096  */
    /* JADX WARN: Removed duplicated region for block: B:180:0x0346  */
    /* JADX WARN: Removed duplicated region for block: B:181:0x0340  */
    /* JADX WARN: Removed duplicated region for block: B:182:0x033a  */
    /* JADX WARN: Removed duplicated region for block: B:183:0x0330  */
    /* JADX WARN: Removed duplicated region for block: B:184:0x0308  */
    /* JADX WARN: Removed duplicated region for block: B:185:0x0302  */
    /* JADX WARN: Removed duplicated region for block: B:186:0x02fc  */
    /* JADX WARN: Removed duplicated region for block: B:188:0x0256  */
    /* JADX WARN: Removed duplicated region for block: B:190:0x023a  */
    /* JADX WARN: Removed duplicated region for block: B:191:0x020f  */
    /* JADX WARN: Removed duplicated region for block: B:198:0x01ef  */
    /* JADX WARN: Removed duplicated region for block: B:205:0x01cd  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x00bb  */
    /* JADX WARN: Removed duplicated region for block: B:212:0x01c0  */
    /* JADX WARN: Removed duplicated region for block: B:215:0x01a6  */
    /* JADX WARN: Removed duplicated region for block: B:216:0x0179  */
    /* JADX WARN: Removed duplicated region for block: B:223:0x015a  */
    /* JADX WARN: Removed duplicated region for block: B:231:0x013c  */
    /* JADX WARN: Removed duplicated region for block: B:238:0x011e  */
    /* JADX WARN: Removed duplicated region for block: B:245:0x00fe  */
    /* JADX WARN: Removed duplicated region for block: B:252:0x00de  */
    /* JADX WARN: Removed duplicated region for block: B:260:0x00cf  */
    /* JADX WARN: Removed duplicated region for block: B:261:0x009b  */
    /* JADX WARN: Removed duplicated region for block: B:268:0x0078  */
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
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void OutlinedTextField(final TextFieldValue value, final Function1<? super TextFieldValue, Unit> onValueChange, Modifier modifier, boolean z, boolean z2, TextStyle textStyle, Function2<? super Composer, ? super Integer, Unit> function2, Function2<? super Composer, ? super Integer, Unit> function22, Function2<? super Composer, ? super Integer, Unit> function23, Function2<? super Composer, ? super Integer, Unit> function24, boolean z3, VisualTransformation visualTransformation, KeyboardOptions keyboardOptions, KeyboardActions keyboardActions, boolean z4, int i, MutableInteractionSource mutableInteractionSource, Shape shape, TextFieldColors textFieldColors, Composer composer, final int i2, final int i3, final int i4) {
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
        Modifier modifier2;
        boolean z5;
        TextStyle textStyle2;
        KeyboardOptions keyboardOptions2;
        KeyboardActions keyboardActions2;
        int i18;
        Function2<? super Composer, ? super Integer, Unit> function25;
        MutableInteractionSource mutableInteractionSource2;
        MutableInteractionSource mutableInteractionSource3;
        Shape shape2;
        Modifier modifier3;
        KeyboardActions keyboardActions3;
        Function2<? super Composer, ? super Integer, Unit> function26;
        MutableInteractionSource mutableInteractionSource4;
        Function2<? super Composer, ? super Integer, Unit> function27;
        VisualTransformation visualTransformation2;
        Function2<? super Composer, ? super Integer, Unit> function28;
        Function2<? super Composer, ? super Integer, Unit> function29;
        boolean z6;
        KeyboardOptions keyboardOptions3;
        boolean z7;
        boolean z8;
        Shape shape3;
        TextStyle textStyle3;
        boolean z9;
        TextFieldColors m1221outlinedTextFieldColorsdx8h9Zs;
        long m3502getColor0d7_KjU;
        Composer composer2;
        final Modifier modifier4;
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
        final boolean z12;
        final TextFieldColors textFieldColors2;
        final Shape shape4;
        final TextStyle textStyle4;
        final boolean z13;
        final int i19;
        int i20;
        Intrinsics.checkNotNullParameter(value, "value");
        Intrinsics.checkNotNullParameter(onValueChange, "onValueChange");
        Composer startRestartGroup = composer.startRestartGroup(-288998816);
        ComposerKt.sourceInformation(startRestartGroup, "C(OutlinedTextField)P(17,10,9,1,12,15,6,11,7,16,3,18,5,4,14,8,2,13)281@15178L7,292@15732L39,293@15810L22,294@15882L25,310@16432L24,319@16798L20,303@16210L1806:OutlinedTextField.kt#jmzs0o");
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
                    i23 |= ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE;
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
                    i23 |= ((i4 & 262144) == 0 && startRestartGroup.changed(textFieldColors)) ? AccessibilityEventCompat.TYPE_VIEW_TARGETED_BY_SCROLL : 33554432;
                }
                if ((i5 & 1533916891) == 306783378 || (191739611 & i23) != 38347922 || !startRestartGroup.getSkipping()) {
                    startRestartGroup.startDefaults();
                    if ((i2 & 1) != 0 || startRestartGroup.getDefaultsInvalid()) {
                        Modifier.Companion companion = i21 != 0 ? Modifier.INSTANCE : modifier;
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
                        boolean z16 = i12 != 0 ? false : z3;
                        VisualTransformation none = i14 != 0 ? VisualTransformation.INSTANCE.getNone() : visualTransformation;
                        if ((i4 & 4096) != 0) {
                            keyboardOptions2 = KeyboardOptions.INSTANCE.getDefault();
                            i23 &= -897;
                        } else {
                            keyboardOptions2 = keyboardOptions;
                        }
                        int i24 = i5;
                        if ((i4 & 8192) != 0) {
                            keyboardActions2 = new KeyboardActions(null, null, null, null, null, null, 63, null);
                            i23 &= -7169;
                        } else {
                            keyboardActions2 = keyboardActions;
                        }
                        boolean z17 = i15 != 0 ? false : z4;
                        i18 = i16 != 0 ? Integer.MAX_VALUE : i;
                        KeyboardActions keyboardActions5 = keyboardActions2;
                        if (i17 != 0) {
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
                            shape2 = TextFieldDefaults.INSTANCE.getOutlinedTextFieldShape(startRestartGroup, 6);
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
                            m1221outlinedTextFieldColorsdx8h9Zs = TextFieldDefaults.INSTANCE.m1221outlinedTextFieldColorsdx8h9Zs(0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, startRestartGroup, 0, 0, 48, 2097151);
                            startRestartGroup.endDefaults();
                            startRestartGroup.startReplaceableGroup(1961402586);
                            ComposerKt.sourceInformation(startRestartGroup, "*298@16059L18");
                            m3502getColor0d7_KjU = textStyle3.m3502getColor0d7_KjU();
                            if (m3502getColor0d7_KjU == Color.INSTANCE.m1664getUnspecified0d7_KjU()) {
                                m3502getColor0d7_KjU = m1221outlinedTextFieldColorsdx8h9Zs.textColor(z8, startRestartGroup, ((i5 >> 9) & 14) | ((i23 >> 21) & 112)).getValue().m1638unboximpl();
                            }
                            startRestartGroup.endReplaceableGroup();
                            TextStyle merge = textStyle3.merge(new TextStyle(m3502getColor0d7_KjU, 0L, (FontWeight) null, (FontStyle) null, (FontSynthesis) null, (FontFamily) null, (String) null, 0L, (BaselineShift) null, (TextGeometricTransform) null, (LocaleList) null, 0L, (TextDecoration) null, (Shadow) null, (TextAlign) null, (TextDirection) null, 0L, (TextIndent) null, 262142, (DefaultConstructorMarker) null));
                            int i25 = (i23 >> 21) & 112;
                            final boolean z18 = z8;
                            final boolean z19 = z6;
                            final VisualTransformation visualTransformation4 = visualTransformation2;
                            final MutableInteractionSource mutableInteractionSource6 = mutableInteractionSource4;
                            final boolean z20 = z9;
                            final Function2<? super Composer, ? super Integer, Unit> function218 = function29;
                            final Function2<? super Composer, ? super Integer, Unit> function219 = function28;
                            final Function2<? super Composer, ? super Integer, Unit> function220 = function26;
                            final Function2<? super Composer, ? super Integer, Unit> function221 = function27;
                            final TextFieldColors textFieldColors3 = m1221outlinedTextFieldColorsdx8h9Zs;
                            final int i26 = i5;
                            final int i27 = i23;
                            final Shape shape5 = shape3;
                            int i28 = i23 << 12;
                            Shape shape6 = shape3;
                            composer2 = startRestartGroup;
                            TextStyle textStyle5 = textStyle3;
                            boolean z21 = z8;
                            BasicTextFieldKt.BasicTextField(value, onValueChange, SizeKt.m445defaultMinSizeVpY3zN4(BackgroundKt.m172backgroundbw27NRU(function29 == null ? PaddingKt.m424paddingqDBjuR0$default(modifier3, 0.0f, OutlinedTextFieldTopPadding, 0.0f, 0.0f, 13, null) : modifier3, m1221outlinedTextFieldColorsdx8h9Zs.backgroundColor(z8, startRestartGroup, ((i5 >> 9) & 14) | i25).getValue().m1638unboximpl(), shape3), TextFieldDefaults.INSTANCE.m1218getMinWidthD9Ej5fM(), TextFieldDefaults.INSTANCE.m1217getMinHeightD9Ej5fM()), z8, z7, merge, keyboardOptions3, keyboardActions3, z6, i18, visualTransformation2, (Function1<? super TextLayoutResult, Unit>) null, mutableInteractionSource4, new SolidColor(m1221outlinedTextFieldColorsdx8h9Zs.cursorColor(z9, startRestartGroup, i25 | (i23 & 14)).getValue().m1638unboximpl(), null), ComposableLambdaKt.composableLambda(startRestartGroup, -1219079113, true, new Function3<Function2<? super Composer, ? super Integer, ? extends Unit>, Composer, Integer, Unit>() { // from class: androidx.compose.material.OutlinedTextFieldKt$OutlinedTextField$5
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
                                    ComposerKt.sourceInformation(composer3, "C327@17161L839:OutlinedTextField.kt#jmzs0o");
                                    if ((i29 & 14) == 0) {
                                        i30 = i29 | (composer3.changed(innerTextField) ? 4 : 2);
                                    } else {
                                        i30 = i29;
                                    }
                                    if ((i30 & 91) != 18 || !composer3.getSkipping()) {
                                        TextFieldDefaults textFieldDefaults = TextFieldDefaults.INSTANCE;
                                        String text = TextFieldValue.this.getText();
                                        boolean z22 = z18;
                                        boolean z23 = z19;
                                        VisualTransformation visualTransformation5 = visualTransformation4;
                                        MutableInteractionSource mutableInteractionSource7 = mutableInteractionSource6;
                                        boolean z24 = z20;
                                        Function2<Composer, Integer, Unit> function222 = function218;
                                        Function2<Composer, Integer, Unit> function223 = function219;
                                        Function2<Composer, Integer, Unit> function224 = function220;
                                        Function2<Composer, Integer, Unit> function225 = function221;
                                        TextFieldColors textFieldColors4 = textFieldColors3;
                                        final boolean z25 = z18;
                                        final boolean z26 = z20;
                                        final MutableInteractionSource mutableInteractionSource8 = mutableInteractionSource6;
                                        final TextFieldColors textFieldColors5 = textFieldColors3;
                                        final Shape shape7 = shape5;
                                        final int i31 = i26;
                                        final int i32 = i27;
                                        ComposableLambda composableLambda = ComposableLambdaKt.composableLambda(composer3, 1225313536, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material.OutlinedTextFieldKt$OutlinedTextField$5.1
                                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                            {
                                                super(2);
                                            }

                                            @Override // kotlin.jvm.functions.Function2
                                            public /* bridge */ /* synthetic */ Unit invoke(Composer composer4, Integer num) {
                                                invoke(composer4, num.intValue());
                                                return Unit.INSTANCE;
                                            }

                                            public final void invoke(Composer composer4, int i33) {
                                                ComposerKt.sourceInformation(composer4, "C341@17765L203:OutlinedTextField.kt#jmzs0o");
                                                if ((i33 & 11) != 2 || !composer4.getSkipping()) {
                                                    TextFieldDefaults textFieldDefaults2 = TextFieldDefaults.INSTANCE;
                                                    boolean z27 = z25;
                                                    boolean z28 = z26;
                                                    MutableInteractionSource mutableInteractionSource9 = mutableInteractionSource8;
                                                    TextFieldColors textFieldColors6 = textFieldColors5;
                                                    Shape shape8 = shape7;
                                                    int i34 = ((i31 >> 9) & 14) | 12582912;
                                                    int i35 = i32;
                                                    textFieldDefaults2.m1215BorderBoxnbWgWpA(z27, z28, mutableInteractionSource9, textFieldColors6, shape8, 0.0f, 0.0f, composer4, i34 | ((i35 << 3) & 112) | ((i35 >> 12) & 896) | ((i35 >> 15) & 7168) | ((i35 >> 9) & 57344), 96);
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
                            }), composer2, (i5 & 64638) | (i28 & 3670016) | (KeyboardActions.$stable << 21) | (i28 & 29360128) | (i28 & 234881024) | (i28 & 1879048192), ((i23 >> 3) & 14) | 24576 | ((i23 >> 12) & 896), 2048);
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
                            textFieldColors2 = m1221outlinedTextFieldColorsdx8h9Zs;
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
                    m1221outlinedTextFieldColorsdx8h9Zs = textFieldColors;
                    startRestartGroup.endDefaults();
                    startRestartGroup.startReplaceableGroup(1961402586);
                    ComposerKt.sourceInformation(startRestartGroup, "*298@16059L18");
                    m3502getColor0d7_KjU = textStyle3.m3502getColor0d7_KjU();
                    if (m3502getColor0d7_KjU == Color.INSTANCE.m1664getUnspecified0d7_KjU()) {
                    }
                    startRestartGroup.endReplaceableGroup();
                    TextStyle merge2 = textStyle3.merge(new TextStyle(m3502getColor0d7_KjU, 0L, (FontWeight) null, (FontStyle) null, (FontSynthesis) null, (FontFamily) null, (String) null, 0L, (BaselineShift) null, (TextGeometricTransform) null, (LocaleList) null, 0L, (TextDecoration) null, (Shadow) null, (TextAlign) null, (TextDirection) null, 0L, (TextIndent) null, 262142, (DefaultConstructorMarker) null));
                    int i252 = (i23 >> 21) & 112;
                    final boolean z182 = z8;
                    final boolean z192 = z6;
                    final VisualTransformation visualTransformation42 = visualTransformation2;
                    final MutableInteractionSource mutableInteractionSource62 = mutableInteractionSource4;
                    final boolean z202 = z9;
                    final Function2<? super Composer, ? super Integer, Unit> function2182 = function29;
                    final Function2<? super Composer, ? super Integer, Unit> function2192 = function28;
                    final Function2<? super Composer, ? super Integer, Unit> function2202 = function26;
                    final Function2<? super Composer, ? super Integer, Unit> function2212 = function27;
                    final TextFieldColors textFieldColors32 = m1221outlinedTextFieldColorsdx8h9Zs;
                    final int i262 = i5;
                    final int i272 = i23;
                    final Shape shape52 = shape3;
                    int i282 = i23 << 12;
                    Shape shape62 = shape3;
                    composer2 = startRestartGroup;
                    TextStyle textStyle52 = textStyle3;
                    boolean z212 = z8;
                    BasicTextFieldKt.BasicTextField(value, onValueChange, SizeKt.m445defaultMinSizeVpY3zN4(BackgroundKt.m172backgroundbw27NRU(function29 == null ? PaddingKt.m424paddingqDBjuR0$default(modifier3, 0.0f, OutlinedTextFieldTopPadding, 0.0f, 0.0f, 13, null) : modifier3, m1221outlinedTextFieldColorsdx8h9Zs.backgroundColor(z8, startRestartGroup, ((i5 >> 9) & 14) | i252).getValue().m1638unboximpl(), shape3), TextFieldDefaults.INSTANCE.m1218getMinWidthD9Ej5fM(), TextFieldDefaults.INSTANCE.m1217getMinHeightD9Ej5fM()), z8, z7, merge2, keyboardOptions3, keyboardActions3, z6, i18, visualTransformation2, (Function1<? super TextLayoutResult, Unit>) null, mutableInteractionSource4, new SolidColor(m1221outlinedTextFieldColorsdx8h9Zs.cursorColor(z9, startRestartGroup, i252 | (i23 & 14)).getValue().m1638unboximpl(), null), ComposableLambdaKt.composableLambda(startRestartGroup, -1219079113, true, new Function3<Function2<? super Composer, ? super Integer, ? extends Unit>, Composer, Integer, Unit>() { // from class: androidx.compose.material.OutlinedTextFieldKt$OutlinedTextField$5
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
                            ComposerKt.sourceInformation(composer3, "C327@17161L839:OutlinedTextField.kt#jmzs0o");
                            if ((i29 & 14) == 0) {
                                i30 = i29 | (composer3.changed(innerTextField) ? 4 : 2);
                            } else {
                                i30 = i29;
                            }
                            if ((i30 & 91) != 18 || !composer3.getSkipping()) {
                                TextFieldDefaults textFieldDefaults = TextFieldDefaults.INSTANCE;
                                String text = TextFieldValue.this.getText();
                                boolean z22 = z182;
                                boolean z23 = z192;
                                VisualTransformation visualTransformation5 = visualTransformation42;
                                MutableInteractionSource mutableInteractionSource7 = mutableInteractionSource62;
                                boolean z24 = z202;
                                Function2<Composer, Integer, Unit> function222 = function2182;
                                Function2<Composer, Integer, Unit> function223 = function2192;
                                Function2<Composer, Integer, Unit> function224 = function2202;
                                Function2<Composer, Integer, Unit> function225 = function2212;
                                TextFieldColors textFieldColors4 = textFieldColors32;
                                final boolean z25 = z182;
                                final boolean z26 = z202;
                                final MutableInteractionSource mutableInteractionSource8 = mutableInteractionSource62;
                                final TextFieldColors textFieldColors5 = textFieldColors32;
                                final Shape shape7 = shape52;
                                final int i31 = i262;
                                final int i32 = i272;
                                ComposableLambda composableLambda = ComposableLambdaKt.composableLambda(composer3, 1225313536, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material.OutlinedTextFieldKt$OutlinedTextField$5.1
                                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                    {
                                        super(2);
                                    }

                                    @Override // kotlin.jvm.functions.Function2
                                    public /* bridge */ /* synthetic */ Unit invoke(Composer composer4, Integer num) {
                                        invoke(composer4, num.intValue());
                                        return Unit.INSTANCE;
                                    }

                                    public final void invoke(Composer composer4, int i33) {
                                        ComposerKt.sourceInformation(composer4, "C341@17765L203:OutlinedTextField.kt#jmzs0o");
                                        if ((i33 & 11) != 2 || !composer4.getSkipping()) {
                                            TextFieldDefaults textFieldDefaults2 = TextFieldDefaults.INSTANCE;
                                            boolean z27 = z25;
                                            boolean z28 = z26;
                                            MutableInteractionSource mutableInteractionSource9 = mutableInteractionSource8;
                                            TextFieldColors textFieldColors6 = textFieldColors5;
                                            Shape shape8 = shape7;
                                            int i34 = ((i31 >> 9) & 14) | 12582912;
                                            int i35 = i32;
                                            textFieldDefaults2.m1215BorderBoxnbWgWpA(z27, z28, mutableInteractionSource9, textFieldColors6, shape8, 0.0f, 0.0f, composer4, i34 | ((i35 << 3) & 112) | ((i35 >> 12) & 896) | ((i35 >> 15) & 7168) | ((i35 >> 9) & 57344), 96);
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
                    }), composer2, (i5 & 64638) | (i282 & 3670016) | (KeyboardActions.$stable << 21) | (i282 & 29360128) | (i282 & 234881024) | (i282 & 1879048192), ((i23 >> 3) & 14) | 24576 | ((i23 >> 12) & 896), 2048);
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
                    textFieldColors2 = m1221outlinedTextFieldColorsdx8h9Zs;
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
                ScopeUpdateScope endRestartGroup = composer2.endRestartGroup();
                if (endRestartGroup == null) {
                    return;
                }
                endRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material.OutlinedTextFieldKt$OutlinedTextField$6
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
                        OutlinedTextFieldKt.OutlinedTextField(TextFieldValue.this, onValueChange, modifier4, z13, z10, textStyle4, function210, function211, function212, function213, z12, visualTransformation3, keyboardOptions4, keyboardActions4, z11, i19, mutableInteractionSource5, shape4, textFieldColors2, composer3, i2 | 1, i3, i4);
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
            KeyboardActions keyboardActions52 = keyboardActions2;
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
        KeyboardActions keyboardActions522 = keyboardActions2;
        if (i17 != 0) {
        }
        if ((i4 & 131072) != 0) {
        }
        if ((262144 & i4) != 0) {
        }
    }

    public static final void OutlinedTextFieldLayout(final Modifier modifier, final Function2<? super Composer, ? super Integer, Unit> textField, final Function3<? super Modifier, ? super Composer, ? super Integer, Unit> function3, final Function2<? super Composer, ? super Integer, Unit> function2, final Function2<? super Composer, ? super Integer, Unit> function22, final Function2<? super Composer, ? super Integer, Unit> function23, final boolean z, final float f, final Function1<? super Size, Unit> onLabelMeasured, final Function2<? super Composer, ? super Integer, Unit> border, final PaddingValues paddingValues, Composer composer, final int i, final int i2) {
        int i3;
        Intrinsics.checkNotNullParameter(modifier, "modifier");
        Intrinsics.checkNotNullParameter(textField, "textField");
        Intrinsics.checkNotNullParameter(onLabelMeasured, "onLabelMeasured");
        Intrinsics.checkNotNullParameter(border, "border");
        Intrinsics.checkNotNullParameter(paddingValues, "paddingValues");
        Composer startRestartGroup = composer.startRestartGroup(-2049536174);
        ComposerKt.sourceInformation(startRestartGroup, "C(OutlinedTextFieldLayout)P(4,9,7,2,3,10,8!1,5)374@18737L239,382@19024L7,383@19036L2308:OutlinedTextField.kt#jmzs0o");
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
            i4 |= startRestartGroup.changed(onLabelMeasured) ? AccessibilityEventCompat.TYPE_VIEW_TARGETED_BY_SCROLL : 33554432;
        }
        if ((1879048192 & i) == 0) {
            i4 |= startRestartGroup.changed(border) ? 536870912 : 268435456;
        }
        int i5 = (i2 & 14) == 0 ? i2 | (startRestartGroup.changed(paddingValues) ? 4 : 2) : i2;
        if ((i4 & 1533916891) != 306783378 || (i5 & 11) != 2 || !startRestartGroup.getSkipping()) {
            Object[] objArr = {onLabelMeasured, Boolean.valueOf(z), Float.valueOf(f), paddingValues};
            startRestartGroup.startReplaceableGroup(-568225417);
            ComposerKt.sourceInformation(startRestartGroup, "C(remember)P(1):Composables.kt#9igjgp");
            int i6 = 0;
            boolean z2 = false;
            for (int i7 = 4; i6 < i7; i7 = 4) {
                z2 |= startRestartGroup.changed(objArr[i6]);
                i6++;
            }
            Object rememberedValue = startRestartGroup.rememberedValue();
            if (z2 || rememberedValue == Composer.INSTANCE.getEmpty()) {
                rememberedValue = new OutlinedTextFieldMeasurePolicy(onLabelMeasured, z, f, paddingValues);
                startRestartGroup.updateRememberedValue(rememberedValue);
            }
            startRestartGroup.endReplaceableGroup();
            OutlinedTextFieldMeasurePolicy outlinedTextFieldMeasurePolicy = (OutlinedTextFieldMeasurePolicy) rememberedValue;
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
            Updater.m1290setimpl(m1283constructorimpl, outlinedTextFieldMeasurePolicy, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
            Updater.m1290setimpl(m1283constructorimpl, density, ComposeUiNode.INSTANCE.getSetDensity());
            Updater.m1290setimpl(m1283constructorimpl, layoutDirection2, ComposeUiNode.INSTANCE.getSetLayoutDirection());
            Updater.m1290setimpl(m1283constructorimpl, viewConfiguration, ComposeUiNode.INSTANCE.getSetViewConfiguration());
            startRestartGroup.enableReusing();
            materializerOf.invoke(SkippableUpdater.m1273boximpl(SkippableUpdater.m1274constructorimpl(startRestartGroup)), startRestartGroup, 0);
            startRestartGroup.startReplaceableGroup(2058660585);
            startRestartGroup.startReplaceableGroup(118153609);
            ComposerKt.sourceInformation(startRestartGroup, "C391@19540L8,430@20988L182,438@21221L54:OutlinedTextField.kt#jmzs0o");
            border.invoke(startRestartGroup, Integer.valueOf((i4 >> 27) & 14));
            startRestartGroup.startReplaceableGroup(1169914108);
            ComposerKt.sourceInformation(startRestartGroup, "394@19601L219");
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
                startRestartGroup.startReplaceableGroup(1691709354);
                ComposerKt.sourceInformation(startRestartGroup, "C398@19793L9:OutlinedTextField.kt#jmzs0o");
                function22.invoke(startRestartGroup, Integer.valueOf((i4 >> 12) & 14));
                startRestartGroup.endReplaceableGroup();
                startRestartGroup.endReplaceableGroup();
                startRestartGroup.endReplaceableGroup();
                startRestartGroup.endNode();
                startRestartGroup.endReplaceableGroup();
                startRestartGroup.endReplaceableGroup();
            }
            startRestartGroup.endReplaceableGroup();
            startRestartGroup.startReplaceableGroup(1169914393);
            ComposerKt.sourceInformation(startRestartGroup, "402@19887L221");
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
                startRestartGroup.startReplaceableGroup(-1351586719);
                ComposerKt.sourceInformation(startRestartGroup, "C406@20080L10:OutlinedTextField.kt#jmzs0o");
                function23.invoke(startRestartGroup, Integer.valueOf((i4 >> 15) & 14));
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
            startRestartGroup.startReplaceableGroup(1169915404);
            ComposerKt.sourceInformation(startRestartGroup, "427@20901L59");
            if (function3 != null) {
                function3.invoke(LayoutIdKt.layoutId(Modifier.INSTANCE, TextFieldImplKt.PlaceholderId).then(m424paddingqDBjuR0$default), startRestartGroup, Integer.valueOf((i4 >> 3) & 112));
            }
            startRestartGroup.endReplaceableGroup();
            Modifier then3 = LayoutIdKt.layoutId(Modifier.INSTANCE, TextFieldImplKt.TextFieldId).then(m424paddingqDBjuR0$default);
            startRestartGroup.startReplaceableGroup(733328855);
            ComposerKt.sourceInformation(startRestartGroup, "C(Box)P(2,1,3)70@3267L67,71@3339L130:Box.kt#2w3rfo");
            MeasurePolicy rememberBoxMeasurePolicy3 = BoxKt.rememberBoxMeasurePolicy(Alignment.INSTANCE.getTopStart(), true, startRestartGroup, 48);
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
            startRestartGroup.startReplaceableGroup(-1205597937);
            ComposerKt.sourceInformation(startRestartGroup, "C434@21145L11:OutlinedTextField.kt#jmzs0o");
            textField.invoke(startRestartGroup, Integer.valueOf((i4 >> 3) & 14));
            startRestartGroup.endReplaceableGroup();
            startRestartGroup.endReplaceableGroup();
            startRestartGroup.endReplaceableGroup();
            startRestartGroup.endNode();
            startRestartGroup.endReplaceableGroup();
            startRestartGroup.endReplaceableGroup();
            if (function2 != null) {
                Modifier layoutId = LayoutIdKt.layoutId(Modifier.INSTANCE, TextFieldImplKt.LabelId);
                startRestartGroup.startReplaceableGroup(733328855);
                ComposerKt.sourceInformation(startRestartGroup, "C(Box)P(2,1,3)70@3267L67,71@3339L130:Box.kt#2w3rfo");
                MeasurePolicy rememberBoxMeasurePolicy4 = BoxKt.rememberBoxMeasurePolicy(Alignment.INSTANCE.getTopStart(), false, startRestartGroup, 0);
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
                Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> materializerOf5 = LayoutKt.materializerOf(layoutId);
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
                startRestartGroup.startReplaceableGroup(-55131805);
                ComposerKt.sourceInformation(startRestartGroup, "C438@21266L7:OutlinedTextField.kt#jmzs0o");
                function2.invoke(startRestartGroup, Integer.valueOf((i4 >> 9) & 14));
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
        ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup == null) {
            return;
        }
        endRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material.OutlinedTextFieldKt$OutlinedTextFieldLayout$2
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

            public final void invoke(Composer composer2, int i8) {
                OutlinedTextFieldKt.OutlinedTextFieldLayout(Modifier.this, textField, function3, function2, function22, function23, z, f, onLabelMeasured, border, paddingValues, composer2, i | 1, i2);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: calculateWidth-VsPV1Ek, reason: not valid java name */
    public static final int m1110calculateWidthVsPV1Ek(int i, int i2, int i3, int i4, int i5, long j) {
        return Math.max(i + Math.max(i3, Math.max(i4, i5)) + i2, Constraints.m3798getMinWidthimpl(j));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: calculateHeight-zUg2_y0, reason: not valid java name */
    public static final int m1109calculateHeightzUg2_y0(int i, int i2, int i3, int i4, int i5, long j, float f, PaddingValues paddingValues) {
        return Math.max(Constraints.m3797getMinHeightimpl(j), Math.max(i, Math.max(i2, MathKt.roundToInt(Math.max(i3, i5) + (paddingValues.getBottom() * f) + Math.max(paddingValues.getTop() * f, i4 / 2.0f)))));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void place(Placeable.PlacementScope placementScope, int i, int i2, Placeable placeable, Placeable placeable2, Placeable placeable3, Placeable placeable4, Placeable placeable5, Placeable placeable6, float f, boolean z, float f2, LayoutDirection layoutDirection, PaddingValues paddingValues) {
        int roundToInt = MathKt.roundToInt(paddingValues.getTop() * f2);
        int roundToInt2 = MathKt.roundToInt(PaddingKt.calculateStartPadding(paddingValues, layoutDirection) * f2);
        float horizontalIconPadding = TextFieldImplKt.getHorizontalIconPadding() * f2;
        if (placeable != null) {
            Placeable.PlacementScope.placeRelative$default(placementScope, placeable, 0, Alignment.INSTANCE.getCenterVertically().align(placeable.getHeight(), i), 0.0f, 4, null);
        }
        if (placeable2 != null) {
            Placeable.PlacementScope.placeRelative$default(placementScope, placeable2, i2 - placeable2.getWidth(), Alignment.INSTANCE.getCenterVertically().align(placeable2.getHeight(), i), 0.0f, 4, null);
        }
        if (placeable4 != null) {
            float f3 = 1 - f;
            Placeable.PlacementScope.placeRelative$default(placementScope, placeable4, MathKt.roundToInt(placeable == null ? 0.0f : f3 * (TextFieldImplKt.widthOrZero(placeable) - horizontalIconPadding)) + roundToInt2, MathKt.roundToInt(((z ? Alignment.INSTANCE.getCenterVertically().align(placeable4.getHeight(), i) : roundToInt) * f3) - ((placeable4.getHeight() / 2) * f)), 0.0f, 4, null);
        }
        Placeable.PlacementScope.placeRelative$default(placementScope, placeable3, TextFieldImplKt.widthOrZero(placeable), Math.max(z ? Alignment.INSTANCE.getCenterVertically().align(placeable3.getHeight(), i) : roundToInt, TextFieldImplKt.heightOrZero(placeable4) / 2), 0.0f, 4, null);
        if (placeable5 != null) {
            if (z) {
                roundToInt = Alignment.INSTANCE.getCenterVertically().align(placeable5.getHeight(), i);
            }
            Placeable.PlacementScope.placeRelative$default(placementScope, placeable5, TextFieldImplKt.widthOrZero(placeable), roundToInt, 0.0f, 4, null);
        }
        Placeable.PlacementScope.m3163place70tqf50$default(placementScope, placeable6, IntOffset.INSTANCE.m3968getZeronOccac(), 0.0f, 2, null);
    }

    /* renamed from: outlineCutout-12SF9DM, reason: not valid java name */
    public static final Modifier m1111outlineCutout12SF9DM(Modifier outlineCutout, final long j, final PaddingValues paddingValues) {
        Intrinsics.checkNotNullParameter(outlineCutout, "$this$outlineCutout");
        Intrinsics.checkNotNullParameter(paddingValues, "paddingValues");
        return DrawModifierKt.drawWithContent(outlineCutout, new Function1<ContentDrawScope, Unit>() { // from class: androidx.compose.material.OutlinedTextFieldKt$outlineCutout$1

            /* compiled from: OutlinedTextField.kt */
            @Metadata(k = 3, mv = {1, 6, 0}, xi = 48)
            public /* synthetic */ class WhenMappings {
                public static final /* synthetic */ int[] $EnumSwitchMapping$0;

                static {
                    int[] iArr = new int[LayoutDirection.values().length];
                    iArr[LayoutDirection.Rtl.ordinal()] = 1;
                    $EnumSwitchMapping$0 = iArr;
                }
            }

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
                float f;
                float coerceAtLeast;
                Intrinsics.checkNotNullParameter(drawWithContent, "$this$drawWithContent");
                float m1461getWidthimpl = Size.m1461getWidthimpl(j);
                if (m1461getWidthimpl > 0.0f) {
                    f = OutlinedTextFieldKt.OutlinedTextFieldInnerPadding;
                    float f2 = drawWithContent.mo315toPx0680j_4(f);
                    float f3 = drawWithContent.mo315toPx0680j_4(paddingValues.mo401calculateLeftPaddingu2uoSUM(drawWithContent.getLayoutDirection())) - f2;
                    float f4 = 2;
                    float f5 = m1461getWidthimpl + f3 + (f2 * f4);
                    if (WhenMappings.$EnumSwitchMapping$0[drawWithContent.getLayoutDirection().ordinal()] == 1) {
                        coerceAtLeast = Size.m1461getWidthimpl(drawWithContent.mo2122getSizeNHjbRc()) - f5;
                    } else {
                        coerceAtLeast = RangesKt.coerceAtLeast(f3, 0.0f);
                    }
                    float f6 = coerceAtLeast;
                    if (WhenMappings.$EnumSwitchMapping$0[drawWithContent.getLayoutDirection().ordinal()] == 1) {
                        f5 = Size.m1461getWidthimpl(drawWithContent.mo2122getSizeNHjbRc()) - RangesKt.coerceAtLeast(f3, 0.0f);
                    }
                    float f7 = f5;
                    float m1458getHeightimpl = Size.m1458getHeightimpl(j);
                    float f8 = (-m1458getHeightimpl) / f4;
                    float f9 = m1458getHeightimpl / f4;
                    int m1616getDifferencertfAjoo = ClipOp.INSTANCE.m1616getDifferencertfAjoo();
                    DrawContext drawContext = drawWithContent.getDrawContext();
                    long mo2047getSizeNHjbRc = drawContext.mo2047getSizeNHjbRc();
                    drawContext.getCanvas().save();
                    drawContext.getTransform().mo2050clipRectN_I0leg(f6, f8, f7, f9, m1616getDifferencertfAjoo);
                    drawWithContent.drawContent();
                    drawContext.getCanvas().restore();
                    drawContext.mo2048setSizeuvyYCjk(mo2047getSizeNHjbRc);
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
