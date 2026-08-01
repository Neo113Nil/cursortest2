package androidx.compose.foundation.text;

import androidx.compose.foundation.gestures.Orientation;
import androidx.compose.foundation.interaction.MutableInteractionSource;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.BoxScopeInstance;
import androidx.compose.foundation.relocation.BringIntoViewRequester;
import androidx.compose.foundation.relocation.BringIntoViewRequesterKt;
import androidx.compose.foundation.text.selection.SelectionHandleInfo;
import androidx.compose.foundation.text.selection.SelectionHandlesKt;
import androidx.compose.foundation.text.selection.SimpleLayoutKt;
import androidx.compose.foundation.text.selection.TextFieldSelectionManager;
import androidx.compose.foundation.text.selection.TextFieldSelectionManagerKt;
import androidx.compose.foundation.text.selection.TextFieldSelectionManager_androidKt;
import androidx.compose.foundation.text.selection.TextSelectionColors;
import androidx.compose.foundation.text.selection.TextSelectionColorsKt;
import androidx.compose.runtime.Applier;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionScopedCoroutineScopeCanceller;
import androidx.compose.runtime.DisposableEffectResult;
import androidx.compose.runtime.DisposableEffectScope;
import androidx.compose.runtime.EffectsKt;
import androidx.compose.runtime.ProvidableCompositionLocal;
import androidx.compose.runtime.RecomposeScope;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.SkippableUpdater;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.runtime.saveable.RememberSaveableKt;
import androidx.compose.runtime.saveable.Saver;
import androidx.compose.runtime.snapshots.Snapshot;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.draw.DrawModifierKt;
import androidx.compose.ui.focus.FocusManager;
import androidx.compose.ui.focus.FocusRequester;
import androidx.compose.ui.focus.FocusState;
import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.geometry.Rect;
import androidx.compose.ui.graphics.Brush;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.SolidColor;
import androidx.compose.ui.graphics.drawscope.DrawScope;
import androidx.compose.ui.hapticfeedback.HapticFeedback;
import androidx.compose.ui.input.key.KeyEvent;
import androidx.compose.ui.input.key.KeyInputModifierKt;
import androidx.compose.ui.input.pointer.PointerIconKt;
import androidx.compose.ui.input.pointer.SuspendingPointerInputFilterKt;
import androidx.compose.ui.layout.AlignmentLineKt;
import androidx.compose.ui.layout.IntrinsicMeasurable;
import androidx.compose.ui.layout.IntrinsicMeasureScope;
import androidx.compose.ui.layout.LayoutCoordinates;
import androidx.compose.ui.layout.LayoutKt;
import androidx.compose.ui.layout.Measurable;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.layout.MeasureResult;
import androidx.compose.ui.layout.MeasureScope;
import androidx.compose.ui.layout.OnGloballyPositionedModifierKt;
import androidx.compose.ui.layout.Placeable;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.platform.ClipboardManager;
import androidx.compose.ui.platform.CompositionLocalsKt;
import androidx.compose.ui.platform.TextToolbar;
import androidx.compose.ui.platform.ViewConfiguration;
import androidx.compose.ui.semantics.SemanticsModifierKt;
import androidx.compose.ui.semantics.SemanticsPropertiesKt;
import androidx.compose.ui.semantics.SemanticsPropertyReceiver;
import androidx.compose.ui.text.AnnotatedString;
import androidx.compose.ui.text.TextLayoutResult;
import androidx.compose.ui.text.TextRange;
import androidx.compose.ui.text.TextRangeKt;
import androidx.compose.ui.text.TextStyle;
import androidx.compose.ui.text.font.FontFamily;
import androidx.compose.ui.text.input.ImeOptions;
import androidx.compose.ui.text.input.OffsetMapping;
import androidx.compose.ui.text.input.PasswordVisualTransformation;
import androidx.compose.ui.text.input.TextFieldValue;
import androidx.compose.ui.text.input.TextInputService;
import androidx.compose.ui.text.input.TextInputSession;
import androidx.compose.ui.text.input.TransformedText;
import androidx.compose.ui.text.input.VisualTransformation;
import androidx.compose.ui.text.style.ResolvedTextDirection;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.IntSize;
import androidx.compose.ui.unit.LayoutDirection;
import androidx.core.view.accessibility.AccessibilityEventCompat;
import androidx.profileinstaller.ProfileVerifier;
import com.google.android.exoplayer2.C;
import java.util.List;
import kotlin.Metadata;
import kotlin.Triple;
import kotlin.TuplesKt;
import kotlin.Unit;
import kotlin.collections.MapsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.EmptyCoroutineContext;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.math.MathKt;
import kotlin.ranges.RangesKt;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;

/* compiled from: CoreTextField.kt */
@Metadata(d1 = {"\u0000\u0096\u0001\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u001aä\u0001\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0012\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00010\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\t2\b\b\u0002\u0010\n\u001a\u00020\u000b2\u0014\b\u0002\u0010\f\u001a\u000e\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\u00010\u00052\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u000f2\b\b\u0002\u0010\u0010\u001a\u00020\u00112\b\b\u0002\u0010\u0012\u001a\u00020\u00132\b\b\u0002\u0010\u0014\u001a\u00020\u00152\b\b\u0002\u0010\u0016\u001a\u00020\u00172\b\b\u0002\u0010\u0018\u001a\u00020\u00192\b\b\u0002\u0010\u001a\u001a\u00020\u00132\b\b\u0002\u0010\u001b\u001a\u00020\u001323\b\u0002\u0010\u001c\u001a-\u0012\u001e\u0012\u001c\u0012\u0004\u0012\u00020\u00010\u001d¢\u0006\u0002\b\u001e¢\u0006\f\b\u001f\u0012\b\b \u0012\u0004\b\b(!\u0012\u0004\u0012\u00020\u00010\u0005¢\u0006\u0002\b\u001eH\u0001¢\u0006\u0002\u0010\"\u001a0\u0010#\u001a\u00020\u00012\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010$\u001a\u00020%2\u0011\u0010&\u001a\r\u0012\u0004\u0012\u00020\u00010\u001d¢\u0006\u0002\b\u001eH\u0003¢\u0006\u0002\u0010'\u001a\u001d\u0010(\u001a\u00020\u00012\u0006\u0010$\u001a\u00020%2\u0006\u0010)\u001a\u00020\u0013H\u0003¢\u0006\u0002\u0010*\u001a\u0015\u0010+\u001a\u00020\u00012\u0006\u0010$\u001a\u00020%H\u0001¢\u0006\u0002\u0010,\u001a(\u0010-\u001a\u00020\u00012\u0006\u0010.\u001a\u00020/2\u0006\u00100\u001a\u0002012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0016\u001a\u00020\u0017H\u0002\u001a\u0010\u00102\u001a\u00020\u00012\u0006\u00100\u001a\u000201H\u0002\u001a \u00103\u001a\u00020\u00012\u0006\u00100\u001a\u0002012\u0006\u00104\u001a\u0002052\u0006\u00106\u001a\u00020\u0013H\u0002\u001a5\u00107\u001a\u00020\u0001*\u0002082\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u00109\u001a\u00020:2\u0006\u0010;\u001a\u00020\r2\u0006\u0010<\u001a\u00020=H\u0080@ø\u0001\u0000¢\u0006\u0002\u0010>\u001a\u001c\u0010?\u001a\u00020\u0007*\u00020\u00072\u0006\u00100\u001a\u0002012\u0006\u0010$\u001a\u00020%H\u0002\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006@"}, d2 = {"CoreTextField", "", "value", "Landroidx/compose/ui/text/input/TextFieldValue;", "onValueChange", "Lkotlin/Function1;", "modifier", "Landroidx/compose/ui/Modifier;", "textStyle", "Landroidx/compose/ui/text/TextStyle;", "visualTransformation", "Landroidx/compose/ui/text/input/VisualTransformation;", "onTextLayout", "Landroidx/compose/ui/text/TextLayoutResult;", "interactionSource", "Landroidx/compose/foundation/interaction/MutableInteractionSource;", "cursorBrush", "Landroidx/compose/ui/graphics/Brush;", "softWrap", "", "maxLines", "", "imeOptions", "Landroidx/compose/ui/text/input/ImeOptions;", "keyboardActions", "Landroidx/compose/foundation/text/KeyboardActions;", "enabled", "readOnly", "decorationBox", "Lkotlin/Function0;", "Landroidx/compose/runtime/Composable;", "Lkotlin/ParameterName;", "name", "innerTextField", "(Landroidx/compose/ui/text/input/TextFieldValue;Lkotlin/jvm/functions/Function1;Landroidx/compose/ui/Modifier;Landroidx/compose/ui/text/TextStyle;Landroidx/compose/ui/text/input/VisualTransformation;Lkotlin/jvm/functions/Function1;Landroidx/compose/foundation/interaction/MutableInteractionSource;Landroidx/compose/ui/graphics/Brush;ZILandroidx/compose/ui/text/input/ImeOptions;Landroidx/compose/foundation/text/KeyboardActions;ZZLkotlin/jvm/functions/Function3;Landroidx/compose/runtime/Composer;III)V", "CoreTextFieldRootBox", "manager", "Landroidx/compose/foundation/text/selection/TextFieldSelectionManager;", "content", "(Landroidx/compose/ui/Modifier;Landroidx/compose/foundation/text/selection/TextFieldSelectionManager;Lkotlin/jvm/functions/Function2;Landroidx/compose/runtime/Composer;I)V", "SelectionToolbarAndHandles", "show", "(Landroidx/compose/foundation/text/selection/TextFieldSelectionManager;ZLandroidx/compose/runtime/Composer;I)V", "TextFieldCursorHandle", "(Landroidx/compose/foundation/text/selection/TextFieldSelectionManager;Landroidx/compose/runtime/Composer;I)V", "notifyTextInputServiceOnFocusChange", "textInputService", "Landroidx/compose/ui/text/input/TextInputService;", "state", "Landroidx/compose/foundation/text/TextFieldState;", "onBlur", "tapToFocus", "focusRequester", "Landroidx/compose/ui/focus/FocusRequester;", "allowKeyboard", "bringSelectionEndIntoView", "Landroidx/compose/foundation/relocation/BringIntoViewRequester;", "textDelegate", "Landroidx/compose/foundation/text/TextDelegate;", "textLayoutResult", "offsetMapping", "Landroidx/compose/ui/text/input/OffsetMapping;", "(Landroidx/compose/foundation/relocation/BringIntoViewRequester;Landroidx/compose/ui/text/input/TextFieldValue;Landroidx/compose/foundation/text/TextDelegate;Landroidx/compose/ui/text/TextLayoutResult;Landroidx/compose/ui/text/input/OffsetMapping;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "previewKeyEventToDeselectOnBack", "foundation_release"}, k = 2, mv = {1, 6, 0}, xi = 48)
/* loaded from: classes.dex */
public final class CoreTextFieldKt {
    /* JADX WARN: Removed duplicated region for block: B:101:0x0476  */
    /* JADX WARN: Removed duplicated region for block: B:104:0x04e0  */
    /* JADX WARN: Removed duplicated region for block: B:107:0x0516  */
    /* JADX WARN: Removed duplicated region for block: B:110:0x05a1  */
    /* JADX WARN: Removed duplicated region for block: B:113:0x05d3  */
    /* JADX WARN: Removed duplicated region for block: B:116:0x0615  */
    /* JADX WARN: Removed duplicated region for block: B:119:0x06b1 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:123:0x06ef  */
    /* JADX WARN: Removed duplicated region for block: B:126:0x0735  */
    /* JADX WARN: Removed duplicated region for block: B:132:0x0748  */
    /* JADX WARN: Removed duplicated region for block: B:134:0x0751  */
    /* JADX WARN: Removed duplicated region for block: B:136:0x06f2  */
    /* JADX WARN: Removed duplicated region for block: B:138:0x0648  */
    /* JADX WARN: Removed duplicated region for block: B:13:0x0075  */
    /* JADX WARN: Removed duplicated region for block: B:141:0x0433  */
    /* JADX WARN: Removed duplicated region for block: B:151:0x026a  */
    /* JADX WARN: Removed duplicated region for block: B:153:0x0273  */
    /* JADX WARN: Removed duplicated region for block: B:155:0x027e  */
    /* JADX WARN: Removed duplicated region for block: B:157:0x0289  */
    /* JADX WARN: Removed duplicated region for block: B:159:0x0292  */
    /* JADX WARN: Removed duplicated region for block: B:162:0x029b  */
    /* JADX WARN: Removed duplicated region for block: B:164:0x02b3  */
    /* JADX WARN: Removed duplicated region for block: B:166:0x02b9  */
    /* JADX WARN: Removed duplicated region for block: B:169:0x02c3  */
    /* JADX WARN: Removed duplicated region for block: B:171:0x02d0  */
    /* JADX WARN: Removed duplicated region for block: B:173:0x02db  */
    /* JADX WARN: Removed duplicated region for block: B:175:0x02e1  */
    /* JADX WARN: Removed duplicated region for block: B:177:0x02e7  */
    /* JADX WARN: Removed duplicated region for block: B:179:0x02fb  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0096  */
    /* JADX WARN: Removed duplicated region for block: B:180:0x02e3  */
    /* JADX WARN: Removed duplicated region for block: B:181:0x02dd  */
    /* JADX WARN: Removed duplicated region for block: B:182:0x02d7  */
    /* JADX WARN: Removed duplicated region for block: B:183:0x02cc  */
    /* JADX WARN: Removed duplicated region for block: B:184:0x02bd  */
    /* JADX WARN: Removed duplicated region for block: B:185:0x02b5  */
    /* JADX WARN: Removed duplicated region for block: B:186:0x02ad  */
    /* JADX WARN: Removed duplicated region for block: B:187:0x0295  */
    /* JADX WARN: Removed duplicated region for block: B:188:0x028e  */
    /* JADX WARN: Removed duplicated region for block: B:189:0x0285  */
    /* JADX WARN: Removed duplicated region for block: B:190:0x027a  */
    /* JADX WARN: Removed duplicated region for block: B:191:0x026f  */
    /* JADX WARN: Removed duplicated region for block: B:192:0x01ca  */
    /* JADX WARN: Removed duplicated region for block: B:198:0x01ad  */
    /* JADX WARN: Removed duplicated region for block: B:204:0x0190  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x00b5  */
    /* JADX WARN: Removed duplicated region for block: B:211:0x0174  */
    /* JADX WARN: Removed duplicated region for block: B:220:0x0169  */
    /* JADX WARN: Removed duplicated region for block: B:221:0x013a  */
    /* JADX WARN: Removed duplicated region for block: B:228:0x011a  */
    /* JADX WARN: Removed duplicated region for block: B:237:0x010d  */
    /* JADX WARN: Removed duplicated region for block: B:238:0x00dc  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x00d5  */
    /* JADX WARN: Removed duplicated region for block: B:245:0x00bc  */
    /* JADX WARN: Removed duplicated region for block: B:252:0x009b  */
    /* JADX WARN: Removed duplicated region for block: B:259:0x0078  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x00f7  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0113  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0133  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x0153  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0171  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x018d  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x01aa  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x01c5  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x01e8  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x07cc  */
    /* JADX WARN: Removed duplicated region for block: B:72:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:75:0x021e  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x032c A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:86:0x0397 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:92:0x03c7  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x0413  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void CoreTextField(final TextFieldValue value, final Function1<? super TextFieldValue, Unit> onValueChange, Modifier modifier, TextStyle textStyle, VisualTransformation visualTransformation, Function1<? super TextLayoutResult, Unit> function1, MutableInteractionSource mutableInteractionSource, Brush brush, boolean z, int i, ImeOptions imeOptions, KeyboardActions keyboardActions, boolean z2, boolean z3, Function3<? super Function2<? super Composer, ? super Integer, Unit>, ? super Composer, ? super Integer, Unit> function3, Composer composer, final int i2, final int i3, final int i4) {
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
        Modifier modifier2;
        SolidColor solidColor;
        ImeOptions imeOptions2;
        Modifier modifier3;
        Function3<? super Function2<? super Composer, ? super Integer, Unit>, ? super Composer, ? super Integer, Unit> function32;
        Brush brush2;
        boolean z4;
        KeyboardActions keyboardActions2;
        int i17;
        boolean z5;
        VisualTransformation visualTransformation2;
        ImeOptions imeOptions3;
        Function1<? super TextLayoutResult, Unit> function12;
        MutableInteractionSource mutableInteractionSource2;
        int i18;
        TextStyle textStyle2;
        boolean z6;
        final TextInputService textInputService;
        final Orientation orientation;
        boolean changed;
        Object rememberedValue;
        boolean changed2;
        Object rememberedValue2;
        TextRange composition;
        boolean z7;
        ImeOptions imeOptions4;
        Object rememberedValue3;
        Object rememberedValue4;
        Object rememberedValue5;
        Object rememberedValue6;
        Object rememberedValue7;
        MutableInteractionSource mutableInteractionSource3;
        BringIntoViewRequester bringIntoViewRequester;
        boolean z8;
        Modifier pointerHoverIcon$default;
        boolean z9;
        Modifier.Companion companion;
        Composer composer2;
        final TextStyle textStyle3;
        final ImeOptions imeOptions5;
        final Function1<? super TextLayoutResult, Unit> function13;
        final Brush brush3;
        final boolean z10;
        final KeyboardActions keyboardActions3;
        final boolean z11;
        final Function3<? super Function2<? super Composer, ? super Integer, Unit>, ? super Composer, ? super Integer, Unit> function33;
        final MutableInteractionSource mutableInteractionSource4;
        final int i19;
        final boolean z12;
        final Modifier modifier4;
        final VisualTransformation visualTransformation3;
        ScopeUpdateScope endRestartGroup;
        int i20;
        int i21;
        Intrinsics.checkNotNullParameter(value, "value");
        Intrinsics.checkNotNullParameter(onValueChange, "onValueChange");
        Composer startRestartGroup = composer.startRestartGroup(109313709);
        ComposerKt.sourceInformation(startRestartGroup, "C(CoreTextField)P(13,9,7,12,14,8,4!1,11,6,3,5,2,10)196@10936L7,197@10997L7,198@11065L7,199@11130L7,207@11439L42,204@11346L135,210@11522L254,222@12081L21,223@12119L324,250@12811L26,253@12897L51,259@13200L7,260@13251L7,261@13308L7,265@13419L24,266@13477L37,312@15342L139,481@21495L86,485@21587L515,531@23235L3445:CoreTextField.kt#423gt5");
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
            if (i6 == 0) {
                i5 |= 3072;
            } else if ((i2 & 7168) == 0) {
                i5 |= startRestartGroup.changed(textStyle) ? 2048 : 1024;
                i7 = i4 & 16;
                if (i7 != 0) {
                    i5 |= 24576;
                } else if ((i2 & 57344) == 0) {
                    i5 |= startRestartGroup.changed(visualTransformation) ? 16384 : 8192;
                }
                i8 = i4 & 32;
                if (i8 != 0) {
                    i5 |= ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE;
                } else if ((i2 & 458752) == 0) {
                    i5 |= startRestartGroup.changed(function1) ? 131072 : 65536;
                }
                i9 = i4 & 64;
                if (i9 != 0) {
                    i5 |= 1572864;
                } else if ((i2 & 3670016) == 0) {
                    i5 |= startRestartGroup.changed(mutableInteractionSource) ? 1048576 : 524288;
                }
                if ((i2 & 29360128) == 0) {
                    if ((i4 & 128) == 0 && startRestartGroup.changed(brush)) {
                        i21 = 8388608;
                        i5 |= i21;
                    }
                    i21 = 4194304;
                    i5 |= i21;
                }
                i10 = i4 & 256;
                if (i10 != 0) {
                    i5 |= 100663296;
                } else if ((i2 & 234881024) == 0) {
                    i5 |= startRestartGroup.changed(z) ? AccessibilityEventCompat.TYPE_VIEW_TARGETED_BY_SCROLL : 33554432;
                }
                i11 = i4 & 512;
                if (i11 != 0) {
                    i5 |= C.ENCODING_PCM_32BIT;
                } else if ((i2 & 1879048192) == 0) {
                    i5 |= startRestartGroup.changed(i) ? 536870912 : 268435456;
                }
                if ((i3 & 14) == 0) {
                    if ((i4 & 1024) == 0 && startRestartGroup.changed(imeOptions)) {
                        i20 = 4;
                        i12 = i3 | i20;
                    }
                    i20 = 2;
                    i12 = i3 | i20;
                } else {
                    i12 = i3;
                }
                i13 = i4 & 2048;
                if (i13 != 0) {
                    i12 |= 48;
                } else if ((i3 & 112) == 0) {
                    i12 |= startRestartGroup.changed(keyboardActions) ? 32 : 16;
                }
                int i23 = i12;
                i14 = i4 & 4096;
                if (i14 != 0) {
                    i23 |= 384;
                } else if ((i3 & 896) == 0) {
                    i23 |= startRestartGroup.changed(z2) ? 256 : 128;
                    i15 = i4 & 8192;
                    if (i15 == 0) {
                        i23 |= 3072;
                    } else if ((i3 & 7168) == 0) {
                        i23 |= startRestartGroup.changed(z3) ? 2048 : 1024;
                        i16 = i4 & 16384;
                        if (i16 != 0) {
                            i23 |= 24576;
                        } else if ((i3 & 57344) == 0) {
                            i23 |= startRestartGroup.changed(function3) ? 16384 : 8192;
                        }
                        if ((i5 & 1533916891) == 306783378 || (46811 & i23) != 9362 || !startRestartGroup.getSkipping()) {
                            startRestartGroup.startDefaults();
                            if ((i2 & 1) != 0 || startRestartGroup.getDefaultsInvalid()) {
                                Modifier.Companion companion2 = i22 != 0 ? Modifier.INSTANCE : modifier;
                                TextStyle textStyle4 = i6 != 0 ? TextStyle.INSTANCE.getDefault() : textStyle;
                                VisualTransformation none = i7 != 0 ? VisualTransformation.INSTANCE.getNone() : visualTransformation;
                                CoreTextFieldKt$CoreTextField$1 coreTextFieldKt$CoreTextField$1 = i8 != 0 ? new Function1<TextLayoutResult, Unit>() { // from class: androidx.compose.foundation.text.CoreTextFieldKt$CoreTextField$1
                                    /* renamed from: invoke, reason: avoid collision after fix types in other method */
                                    public final void invoke2(TextLayoutResult it) {
                                        Intrinsics.checkNotNullParameter(it, "it");
                                    }

                                    @Override // kotlin.jvm.functions.Function1
                                    public /* bridge */ /* synthetic */ Unit invoke(TextLayoutResult textLayoutResult) {
                                        invoke2(textLayoutResult);
                                        return Unit.INSTANCE;
                                    }
                                } : function1;
                                MutableInteractionSource mutableInteractionSource5 = i9 != 0 ? null : mutableInteractionSource;
                                if ((i4 & 128) != 0) {
                                    modifier2 = companion2;
                                    solidColor = new SolidColor(Color.INSTANCE.m1664getUnspecified0d7_KjU(), null);
                                } else {
                                    modifier2 = companion2;
                                    solidColor = brush;
                                }
                                boolean z13 = i10 != 0 ? true : z;
                                int i24 = i11 != 0 ? Integer.MAX_VALUE : i;
                                if ((i4 & 1024) != 0) {
                                    imeOptions2 = ImeOptions.INSTANCE.getDefault();
                                    i23 &= -15;
                                } else {
                                    imeOptions2 = imeOptions;
                                }
                                KeyboardActions keyboardActions4 = i13 != 0 ? KeyboardActions.INSTANCE.getDefault() : keyboardActions;
                                boolean z14 = i14 != 0 ? true : z2;
                                boolean z15 = i15 != 0 ? false : z3;
                                if (i16 != 0) {
                                    modifier3 = modifier2;
                                    brush2 = solidColor;
                                    z4 = z13;
                                    keyboardActions2 = keyboardActions4;
                                    i17 = i23;
                                    z5 = z15;
                                    function32 = ComposableSingletons$CoreTextFieldKt.INSTANCE.m688getLambda1$foundation_release();
                                } else {
                                    modifier3 = modifier2;
                                    function32 = function3;
                                    brush2 = solidColor;
                                    z4 = z13;
                                    keyboardActions2 = keyboardActions4;
                                    i17 = i23;
                                    z5 = z15;
                                }
                                visualTransformation2 = none;
                                imeOptions3 = imeOptions2;
                                function12 = coreTextFieldKt$CoreTextField$1;
                                mutableInteractionSource2 = mutableInteractionSource5;
                                i18 = i24;
                                textStyle2 = textStyle4;
                                z6 = z14;
                            } else {
                                startRestartGroup.skipToGroupEnd();
                                if ((i4 & 1024) != 0) {
                                    modifier3 = modifier;
                                    textStyle2 = textStyle;
                                    visualTransformation2 = visualTransformation;
                                    function12 = function1;
                                    mutableInteractionSource2 = mutableInteractionSource;
                                    brush2 = brush;
                                    z4 = z;
                                    i18 = i;
                                    imeOptions3 = imeOptions;
                                    keyboardActions2 = keyboardActions;
                                    z6 = z2;
                                    z5 = z3;
                                    function32 = function3;
                                    i17 = i23 & (-15);
                                } else {
                                    modifier3 = modifier;
                                    textStyle2 = textStyle;
                                    visualTransformation2 = visualTransformation;
                                    function12 = function1;
                                    mutableInteractionSource2 = mutableInteractionSource;
                                    brush2 = brush;
                                    z4 = z;
                                    i18 = i;
                                    imeOptions3 = imeOptions;
                                    keyboardActions2 = keyboardActions;
                                    z6 = z2;
                                    z5 = z3;
                                    function32 = function3;
                                    i17 = i23;
                                }
                            }
                            startRestartGroup.endDefaults();
                            final FocusRequester focusRequester = new FocusRequester();
                            startRestartGroup.startReplaceableGroup(-55013392);
                            ComposerKt.sourceInformation(startRestartGroup, "195@10897L7");
                            if (z6 || z5) {
                                textInputService = null;
                            } else {
                                ProvidableCompositionLocal<TextInputService> localTextInputService = CompositionLocalsKt.getLocalTextInputService();
                                ComposerKt.sourceInformationMarkerStart(startRestartGroup, 2023513938, "C:CompositionLocal.kt#9igjgp");
                                Object consume = startRestartGroup.consume(localTextInputService);
                                ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                                textInputService = (TextInputService) consume;
                            }
                            startRestartGroup.endReplaceableGroup();
                            ProvidableCompositionLocal<Density> localDensity = CompositionLocalsKt.getLocalDensity();
                            ComposerKt.sourceInformationMarkerStart(startRestartGroup, 2023513938, "C:CompositionLocal.kt#9igjgp");
                            Object consume2 = startRestartGroup.consume(localDensity);
                            ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                            Density density = (Density) consume2;
                            ProvidableCompositionLocal<FontFamily.Resolver> localFontFamilyResolver = CompositionLocalsKt.getLocalFontFamilyResolver();
                            ComposerKt.sourceInformationMarkerStart(startRestartGroup, 2023513938, "C:CompositionLocal.kt#9igjgp");
                            Object consume3 = startRestartGroup.consume(localFontFamilyResolver);
                            ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                            FontFamily.Resolver resolver = (FontFamily.Resolver) consume3;
                            ProvidableCompositionLocal<TextSelectionColors> localTextSelectionColors = TextSelectionColorsKt.getLocalTextSelectionColors();
                            ComposerKt.sourceInformationMarkerStart(startRestartGroup, 2023513938, "C:CompositionLocal.kt#9igjgp");
                            Object consume4 = startRestartGroup.consume(localTextSelectionColors);
                            ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                            long backgroundColor = ((TextSelectionColors) consume4).getBackgroundColor();
                            ProvidableCompositionLocal<FocusManager> localFocusManager = CompositionLocalsKt.getLocalFocusManager();
                            ComposerKt.sourceInformationMarkerStart(startRestartGroup, 2023513938, "C:CompositionLocal.kt#9igjgp");
                            Object consume5 = startRestartGroup.consume(localFocusManager);
                            ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                            FocusManager focusManager = (FocusManager) consume5;
                            orientation = (i18 == 1 || z4 || !imeOptions3.getSingleLine()) ? Orientation.Vertical : Orientation.Horizontal;
                            Object[] objArr = {orientation};
                            Saver<TextFieldScrollerPosition, Object> saver = TextFieldScrollerPosition.INSTANCE.getSaver();
                            Modifier modifier5 = modifier3;
                            startRestartGroup.startReplaceableGroup(1157296644);
                            ComposerKt.sourceInformation(startRestartGroup, "C(remember)P(1):Composables.kt#9igjgp");
                            changed = startRestartGroup.changed(orientation);
                            final int i25 = i18;
                            rememberedValue = startRestartGroup.rememberedValue();
                            if (!changed || rememberedValue == Composer.INSTANCE.getEmpty()) {
                                rememberedValue = (Function0) new Function0<TextFieldScrollerPosition>() { // from class: androidx.compose.foundation.text.CoreTextFieldKt$CoreTextField$scrollerPosition$1$1
                                    {
                                        super(0);
                                    }

                                    /* JADX WARN: Can't rename method to resolve collision */
                                    @Override // kotlin.jvm.functions.Function0
                                    public final TextFieldScrollerPosition invoke() {
                                        return new TextFieldScrollerPosition(Orientation.this, 0.0f, 2, null);
                                    }
                                };
                                startRestartGroup.updateRememberedValue(rememberedValue);
                            }
                            startRestartGroup.endReplaceableGroup();
                            final TextFieldScrollerPosition textFieldScrollerPosition = (TextFieldScrollerPosition) RememberSaveableKt.m1296rememberSaveable(objArr, (Saver) saver, (String) null, (Function0) rememberedValue, startRestartGroup, 72, 4);
                            startRestartGroup.startReplaceableGroup(511388516);
                            ComposerKt.sourceInformation(startRestartGroup, "C(remember)P(1,2):Composables.kt#9igjgp");
                            changed2 = startRestartGroup.changed(value) | startRestartGroup.changed(visualTransformation2);
                            rememberedValue2 = startRestartGroup.rememberedValue();
                            if (!changed2 || rememberedValue2 == Composer.INSTANCE.getEmpty()) {
                                TransformedText filter = visualTransformation2.filter(value.getAnnotatedString());
                                composition = value.getComposition();
                                z7 = z6;
                                imeOptions4 = imeOptions3;
                                if (composition != null) {
                                    Object m747applyCompositionDecoration72CqOWE = TextFieldDelegate.INSTANCE.m747applyCompositionDecoration72CqOWE(composition.getPackedValue(), filter);
                                    if (m747applyCompositionDecoration72CqOWE != null) {
                                        rememberedValue2 = m747applyCompositionDecoration72CqOWE;
                                        startRestartGroup.updateRememberedValue(rememberedValue2);
                                    }
                                }
                                rememberedValue2 = filter;
                                startRestartGroup.updateRememberedValue(rememberedValue2);
                            } else {
                                z7 = z6;
                                imeOptions4 = imeOptions3;
                            }
                            startRestartGroup.endReplaceableGroup();
                            final TransformedText transformedText = (TransformedText) rememberedValue2;
                            AnnotatedString text = transformedText.getText();
                            final OffsetMapping offsetMapping = transformedText.getOffsetMapping();
                            RecomposeScope currentRecomposeScope = ComposablesKt.getCurrentRecomposeScope(startRestartGroup, 0);
                            startRestartGroup.startReplaceableGroup(-492369756);
                            ComposerKt.sourceInformation(startRestartGroup, "C(remember):Composables.kt#9igjgp");
                            final int i26 = i17;
                            rememberedValue3 = startRestartGroup.rememberedValue();
                            if (rememberedValue3 == Composer.INSTANCE.getEmpty()) {
                                rememberedValue3 = new TextFieldState(new TextDelegate(text, textStyle2, 0, z4, 0, density, resolver, null, 148, null), currentRecomposeScope);
                                startRestartGroup.updateRememberedValue(rememberedValue3);
                            }
                            startRestartGroup.endReplaceableGroup();
                            final TextFieldState textFieldState = (TextFieldState) rememberedValue3;
                            textFieldState.m763updateaKPrnQ(text, textStyle2, z4, density, resolver, onValueChange, keyboardActions2, focusManager, backgroundColor);
                            textFieldState.getProcessor().reset(value, textFieldState.getInputSession());
                            startRestartGroup.startReplaceableGroup(-492369756);
                            ComposerKt.sourceInformation(startRestartGroup, "C(remember):Composables.kt#9igjgp");
                            rememberedValue4 = startRestartGroup.rememberedValue();
                            if (rememberedValue4 == Composer.INSTANCE.getEmpty()) {
                                rememberedValue4 = new UndoManager(0, 1, null);
                                startRestartGroup.updateRememberedValue(rememberedValue4);
                            }
                            startRestartGroup.endReplaceableGroup();
                            UndoManager undoManager = (UndoManager) rememberedValue4;
                            UndoManager.snapshotIfNeeded$default(undoManager, value, 0L, 2, null);
                            startRestartGroup.startReplaceableGroup(-492369756);
                            ComposerKt.sourceInformation(startRestartGroup, "C(remember):Composables.kt#9igjgp");
                            rememberedValue5 = startRestartGroup.rememberedValue();
                            if (rememberedValue5 == Composer.INSTANCE.getEmpty()) {
                                rememberedValue5 = new TextFieldSelectionManager(undoManager);
                                startRestartGroup.updateRememberedValue(rememberedValue5);
                            }
                            startRestartGroup.endReplaceableGroup();
                            final TextFieldSelectionManager textFieldSelectionManager = (TextFieldSelectionManager) rememberedValue5;
                            textFieldSelectionManager.setOffsetMapping$foundation_release(offsetMapping);
                            textFieldSelectionManager.setVisualTransformation$foundation_release(visualTransformation2);
                            textFieldSelectionManager.setOnValueChange$foundation_release(textFieldState.getOnValueChange());
                            textFieldSelectionManager.setState$foundation_release(textFieldState);
                            textFieldSelectionManager.setValue$foundation_release(value);
                            ProvidableCompositionLocal<ClipboardManager> localClipboardManager = CompositionLocalsKt.getLocalClipboardManager();
                            ComposerKt.sourceInformationMarkerStart(startRestartGroup, 2023513938, "C:CompositionLocal.kt#9igjgp");
                            Object consume6 = startRestartGroup.consume(localClipboardManager);
                            ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                            textFieldSelectionManager.setClipboardManager$foundation_release((ClipboardManager) consume6);
                            ProvidableCompositionLocal<TextToolbar> localTextToolbar = CompositionLocalsKt.getLocalTextToolbar();
                            ComposerKt.sourceInformationMarkerStart(startRestartGroup, 2023513938, "C:CompositionLocal.kt#9igjgp");
                            Object consume7 = startRestartGroup.consume(localTextToolbar);
                            ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                            textFieldSelectionManager.setTextToolbar((TextToolbar) consume7);
                            ProvidableCompositionLocal<HapticFeedback> localHapticFeedback = CompositionLocalsKt.getLocalHapticFeedback();
                            ComposerKt.sourceInformationMarkerStart(startRestartGroup, 2023513938, "C:CompositionLocal.kt#9igjgp");
                            Object consume8 = startRestartGroup.consume(localHapticFeedback);
                            ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                            textFieldSelectionManager.setHapticFeedBack((HapticFeedback) consume8);
                            textFieldSelectionManager.setFocusRequester(focusRequester);
                            textFieldSelectionManager.setEditable(!z5);
                            startRestartGroup.startReplaceableGroup(773894976);
                            ComposerKt.sourceInformation(startRestartGroup, "C(rememberCoroutineScope)475@19849L144:Effects.kt#9igjgp");
                            startRestartGroup.startReplaceableGroup(-492369756);
                            ComposerKt.sourceInformation(startRestartGroup, "C(remember):Composables.kt#9igjgp");
                            rememberedValue6 = startRestartGroup.rememberedValue();
                            if (rememberedValue6 == Composer.INSTANCE.getEmpty()) {
                                Object compositionScopedCoroutineScopeCanceller = new CompositionScopedCoroutineScopeCanceller(EffectsKt.createCompositionCoroutineScope(EmptyCoroutineContext.INSTANCE, startRestartGroup));
                                startRestartGroup.updateRememberedValue(compositionScopedCoroutineScopeCanceller);
                                rememberedValue6 = compositionScopedCoroutineScopeCanceller;
                            }
                            startRestartGroup.endReplaceableGroup();
                            final CoroutineScope coroutineScope = ((CompositionScopedCoroutineScopeCanceller) rememberedValue6).getCoroutineScope();
                            startRestartGroup.endReplaceableGroup();
                            startRestartGroup.startReplaceableGroup(-492369756);
                            ComposerKt.sourceInformation(startRestartGroup, "C(remember):Composables.kt#9igjgp");
                            rememberedValue7 = startRestartGroup.rememberedValue();
                            if (rememberedValue7 == Composer.INSTANCE.getEmpty()) {
                                rememberedValue7 = BringIntoViewRequesterKt.BringIntoViewRequester();
                                startRestartGroup.updateRememberedValue(rememberedValue7);
                            }
                            startRestartGroup.endReplaceableGroup();
                            final BringIntoViewRequester bringIntoViewRequester2 = (BringIntoViewRequester) rememberedValue7;
                            final TextInputService textInputService2 = textInputService;
                            final ImeOptions imeOptions6 = imeOptions4;
                            final boolean z16 = z7;
                            Modifier textFieldFocusModifier = TextFieldGestureModifiersKt.textFieldFocusModifier(Modifier.INSTANCE, z16, focusRequester, mutableInteractionSource2, new Function1<FocusState, Unit>() { // from class: androidx.compose.foundation.text.CoreTextFieldKt$CoreTextField$focusModifier$1
                                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                {
                                    super(1);
                                }

                                @Override // kotlin.jvm.functions.Function1
                                public /* bridge */ /* synthetic */ Unit invoke(FocusState focusState) {
                                    invoke2(focusState);
                                    return Unit.INSTANCE;
                                }

                                /* renamed from: invoke, reason: avoid collision after fix types in other method */
                                public final void invoke2(FocusState it) {
                                    TextLayoutResultProxy layoutResult;
                                    Intrinsics.checkNotNullParameter(it, "it");
                                    if (TextFieldState.this.getHasFocus() == it.isFocused()) {
                                        return;
                                    }
                                    TextFieldState.this.setHasFocus(it.isFocused());
                                    TextInputService textInputService3 = textInputService2;
                                    if (textInputService3 != null) {
                                        CoreTextFieldKt.notifyTextInputServiceOnFocusChange(textInputService3, TextFieldState.this, value, imeOptions6);
                                        if (it.isFocused() && (layoutResult = TextFieldState.this.getLayoutResult()) != null) {
                                            BuildersKt__Builders_commonKt.launch$default(coroutineScope, null, null, new CoreTextFieldKt$CoreTextField$focusModifier$1$1$1(bringIntoViewRequester2, value, TextFieldState.this, layoutResult, offsetMapping, null), 3, null);
                                        }
                                    }
                                    if (it.isFocused()) {
                                        return;
                                    }
                                    TextFieldSelectionManager.m860deselect_kEHs6E$foundation_release$default(textFieldSelectionManager, null, 1, null);
                                }
                            });
                            EffectsKt.DisposableEffect(textFieldState, new Function1<DisposableEffectScope, DisposableEffectResult>() { // from class: androidx.compose.foundation.text.CoreTextFieldKt$CoreTextField$2
                                {
                                    super(1);
                                }

                                @Override // kotlin.jvm.functions.Function1
                                public final DisposableEffectResult invoke(DisposableEffectScope DisposableEffect) {
                                    Intrinsics.checkNotNullParameter(DisposableEffect, "$this$DisposableEffect");
                                    final TextFieldState textFieldState2 = TextFieldState.this;
                                    return new DisposableEffectResult() { // from class: androidx.compose.foundation.text.CoreTextFieldKt$CoreTextField$2$invoke$$inlined$onDispose$1
                                        @Override // androidx.compose.runtime.DisposableEffectResult
                                        public void dispose() {
                                            if (TextFieldState.this.getHasFocus()) {
                                                CoreTextFieldKt.onBlur(TextFieldState.this);
                                            }
                                        }
                                    };
                                }
                            }, startRestartGroup, 8);
                            if (TouchMode_androidKt.isInTouchMode()) {
                                final boolean z17 = z5;
                                pointerHoverIcon$default = TextFieldPressGestureFilterKt.tapPressTextFieldModifier(Modifier.INSTANCE, mutableInteractionSource2, z16, new Function1<Offset, Unit>() { // from class: androidx.compose.foundation.text.CoreTextFieldKt$CoreTextField$pointerModifier$1
                                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                    {
                                        super(1);
                                    }

                                    @Override // kotlin.jvm.functions.Function1
                                    public /* bridge */ /* synthetic */ Unit invoke(Offset offset) {
                                        m689invokek4lQ0M(offset.getPackedValue());
                                        return Unit.INSTANCE;
                                    }

                                    /* renamed from: invoke-k-4lQ0M, reason: not valid java name */
                                    public final void m689invokek4lQ0M(long j) {
                                        CoreTextFieldKt.tapToFocus(TextFieldState.this, focusRequester, !z17);
                                        if (TextFieldState.this.getHasFocus()) {
                                            if (TextFieldState.this.getHandleState() != HandleState.Selection) {
                                                TextLayoutResultProxy layoutResult = TextFieldState.this.getLayoutResult();
                                                if (layoutResult != null) {
                                                    TextFieldState textFieldState2 = TextFieldState.this;
                                                    TextFieldDelegate.INSTANCE.m749setCursorOffsetULxng0E$foundation_release(j, layoutResult, textFieldState2.getProcessor(), offsetMapping, textFieldState2.getOnValueChange());
                                                    if (textFieldState2.getTextDelegate().getText().length() > 0) {
                                                        textFieldState2.setHandleState(HandleState.Cursor);
                                                        return;
                                                    }
                                                    return;
                                                }
                                                return;
                                            }
                                            textFieldSelectionManager.m863deselect_kEHs6E$foundation_release(Offset.m1381boximpl(j));
                                        }
                                    }
                                }).then(TextFieldGestureModifiersKt.longPressDragGestureFilter(Modifier.INSTANCE, textFieldSelectionManager.getTouchSelectionObserver(), z16));
                                mutableInteractionSource3 = mutableInteractionSource2;
                                bringIntoViewRequester = bringIntoViewRequester2;
                                z8 = false;
                            } else {
                                mutableInteractionSource3 = mutableInteractionSource2;
                                bringIntoViewRequester = bringIntoViewRequester2;
                                z8 = false;
                                pointerHoverIcon$default = PointerIconKt.pointerHoverIcon$default(TextFieldGestureModifiersKt.mouseDragGestureDetector(Modifier.INSTANCE, textFieldSelectionManager.getMouseSelectionObserver(), z16), TextPointerIcon_androidKt.getTextPointerIcon(), false, 2, null);
                            }
                            final Modifier drawBehind = DrawModifierKt.drawBehind(Modifier.INSTANCE, new Function1<DrawScope, Unit>() { // from class: androidx.compose.foundation.text.CoreTextFieldKt$CoreTextField$drawModifier$1
                                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                {
                                    super(1);
                                }

                                @Override // kotlin.jvm.functions.Function1
                                public /* bridge */ /* synthetic */ Unit invoke(DrawScope drawScope) {
                                    invoke2(drawScope);
                                    return Unit.INSTANCE;
                                }

                                /* renamed from: invoke, reason: avoid collision after fix types in other method */
                                public final void invoke2(DrawScope drawBehind2) {
                                    Intrinsics.checkNotNullParameter(drawBehind2, "$this$drawBehind");
                                    TextLayoutResultProxy layoutResult = TextFieldState.this.getLayoutResult();
                                    if (layoutResult != null) {
                                        TextFieldValue textFieldValue = value;
                                        OffsetMapping offsetMapping2 = offsetMapping;
                                        TextFieldState textFieldState2 = TextFieldState.this;
                                        TextFieldDelegate.INSTANCE.draw$foundation_release(drawBehind2.getDrawContext().getCanvas(), textFieldValue, offsetMapping2, layoutResult.getValue(), textFieldState2.getSelectionPaint());
                                    }
                                }
                            });
                            final Modifier onGloballyPositioned = OnGloballyPositionedModifierKt.onGloballyPositioned(Modifier.INSTANCE, new Function1<LayoutCoordinates, Unit>() { // from class: androidx.compose.foundation.text.CoreTextFieldKt$CoreTextField$onPositionedModifier$1
                                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                {
                                    super(1);
                                }

                                @Override // kotlin.jvm.functions.Function1
                                public /* bridge */ /* synthetic */ Unit invoke(LayoutCoordinates layoutCoordinates) {
                                    invoke2(layoutCoordinates);
                                    return Unit.INSTANCE;
                                }

                                /* renamed from: invoke, reason: avoid collision after fix types in other method */
                                public final void invoke2(LayoutCoordinates it) {
                                    Intrinsics.checkNotNullParameter(it, "it");
                                    TextFieldState.this.setLayoutCoordinates(it);
                                    if (z16) {
                                        if (TextFieldState.this.getHandleState() == HandleState.Selection) {
                                            if (TextFieldState.this.getShowFloatingToolbar()) {
                                                textFieldSelectionManager.showSelectionToolbar$foundation_release();
                                            } else {
                                                textFieldSelectionManager.hideSelectionToolbar$foundation_release();
                                            }
                                            TextFieldState.this.setShowSelectionHandleStart(TextFieldSelectionManagerKt.isSelectionHandleInVisibleBound(textFieldSelectionManager, true));
                                            TextFieldState.this.setShowSelectionHandleEnd(TextFieldSelectionManagerKt.isSelectionHandleInVisibleBound(textFieldSelectionManager, false));
                                        } else if (TextFieldState.this.getHandleState() == HandleState.Cursor) {
                                            TextFieldState.this.setShowCursorHandle(TextFieldSelectionManagerKt.isSelectionHandleInVisibleBound(textFieldSelectionManager, true));
                                        }
                                    }
                                    TextLayoutResultProxy layoutResult = TextFieldState.this.getLayoutResult();
                                    if (layoutResult == null) {
                                        return;
                                    }
                                    layoutResult.setInnerTextFieldCoordinates(it);
                                }
                            });
                            final boolean z18 = visualTransformation2 instanceof PasswordVisualTransformation;
                            final ImeOptions imeOptions7 = imeOptions4;
                            final boolean z19 = z5;
                            Modifier semantics = SemanticsModifierKt.semantics(Modifier.INSTANCE, true, new Function1<SemanticsPropertyReceiver, Unit>() { // from class: androidx.compose.foundation.text.CoreTextFieldKt$CoreTextField$semanticsModifier$1
                                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                {
                                    super(1);
                                }

                                @Override // kotlin.jvm.functions.Function1
                                public /* bridge */ /* synthetic */ Unit invoke(SemanticsPropertyReceiver semanticsPropertyReceiver) {
                                    invoke2(semanticsPropertyReceiver);
                                    return Unit.INSTANCE;
                                }

                                /* renamed from: invoke, reason: avoid collision after fix types in other method */
                                public final void invoke2(SemanticsPropertyReceiver semantics2) {
                                    Intrinsics.checkNotNullParameter(semantics2, "$this$semantics");
                                    SemanticsPropertiesKt.m3395setImeAction4L7nppU(semantics2, ImeOptions.this.getImeAction());
                                    SemanticsPropertiesKt.setEditableText(semantics2, transformedText.getText());
                                    SemanticsPropertiesKt.m3398setTextSelectionRangeFDrldGo(semantics2, value.getSelection());
                                    if (!z16) {
                                        SemanticsPropertiesKt.disabled(semantics2);
                                    }
                                    if (z18) {
                                        SemanticsPropertiesKt.password(semantics2);
                                    }
                                    final TextFieldState textFieldState2 = textFieldState;
                                    SemanticsPropertiesKt.getTextLayoutResult$default(semantics2, null, new Function1<List<TextLayoutResult>, Boolean>() { // from class: androidx.compose.foundation.text.CoreTextFieldKt$CoreTextField$semanticsModifier$1.1
                                        {
                                            super(1);
                                        }

                                        @Override // kotlin.jvm.functions.Function1
                                        public final Boolean invoke(List<TextLayoutResult> it) {
                                            boolean z20;
                                            Intrinsics.checkNotNullParameter(it, "it");
                                            if (TextFieldState.this.getLayoutResult() != null) {
                                                TextLayoutResultProxy layoutResult = TextFieldState.this.getLayoutResult();
                                                Intrinsics.checkNotNull(layoutResult);
                                                it.add(layoutResult.getValue());
                                                z20 = true;
                                            } else {
                                                z20 = false;
                                            }
                                            return Boolean.valueOf(z20);
                                        }
                                    }, 1, null);
                                    final TextFieldState textFieldState3 = textFieldState;
                                    SemanticsPropertiesKt.setText$default(semantics2, null, new Function1<AnnotatedString, Boolean>() { // from class: androidx.compose.foundation.text.CoreTextFieldKt$CoreTextField$semanticsModifier$1.2
                                        {
                                            super(1);
                                        }

                                        @Override // kotlin.jvm.functions.Function1
                                        public final Boolean invoke(AnnotatedString it) {
                                            Intrinsics.checkNotNullParameter(it, "it");
                                            TextFieldState.this.getOnValueChange().invoke(new TextFieldValue(it.getText(), TextRangeKt.TextRange(it.getText().length()), (TextRange) null, 4, (DefaultConstructorMarker) null));
                                            return true;
                                        }
                                    }, 1, null);
                                    final OffsetMapping offsetMapping2 = offsetMapping;
                                    final boolean z20 = z16;
                                    final TextFieldValue textFieldValue = value;
                                    final TextFieldSelectionManager textFieldSelectionManager2 = textFieldSelectionManager;
                                    final TextFieldState textFieldState4 = textFieldState;
                                    SemanticsPropertiesKt.setSelection$default(semantics2, null, new Function3<Integer, Integer, Boolean, Boolean>() { // from class: androidx.compose.foundation.text.CoreTextFieldKt$CoreTextField$semanticsModifier$1.3
                                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                        {
                                            super(3);
                                        }

                                        @Override // kotlin.jvm.functions.Function3
                                        public /* bridge */ /* synthetic */ Boolean invoke(Integer num, Integer num2, Boolean bool) {
                                            return invoke(num.intValue(), num2.intValue(), bool.booleanValue());
                                        }

                                        public final Boolean invoke(int i27, int i28, boolean z21) {
                                            if (!z21) {
                                                i27 = OffsetMapping.this.transformedToOriginal(i27);
                                            }
                                            if (!z21) {
                                                i28 = OffsetMapping.this.transformedToOriginal(i28);
                                            }
                                            boolean z22 = false;
                                            if (z20 && (i27 != TextRange.m3486getStartimpl(textFieldValue.getSelection()) || i28 != TextRange.m3481getEndimpl(textFieldValue.getSelection()))) {
                                                if (RangesKt.coerceAtMost(i27, i28) >= 0 && RangesKt.coerceAtLeast(i27, i28) <= textFieldValue.getAnnotatedString().length()) {
                                                    if (z21 || i27 == i28) {
                                                        textFieldSelectionManager2.exitSelectionMode$foundation_release();
                                                    } else {
                                                        textFieldSelectionManager2.enterSelectionMode$foundation_release();
                                                    }
                                                    textFieldState4.getOnValueChange().invoke(new TextFieldValue(textFieldValue.getAnnotatedString(), TextRangeKt.TextRange(i27, i28), (TextRange) null, 4, (DefaultConstructorMarker) null));
                                                    z22 = true;
                                                } else {
                                                    textFieldSelectionManager2.exitSelectionMode$foundation_release();
                                                }
                                            }
                                            return Boolean.valueOf(z22);
                                        }
                                    }, 1, null);
                                    final TextFieldState textFieldState5 = textFieldState;
                                    final FocusRequester focusRequester2 = focusRequester;
                                    final boolean z21 = z19;
                                    SemanticsPropertiesKt.onClick$default(semantics2, null, new Function0<Boolean>() { // from class: androidx.compose.foundation.text.CoreTextFieldKt$CoreTextField$semanticsModifier$1.4
                                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                        {
                                            super(0);
                                        }

                                        /* JADX WARN: Can't rename method to resolve collision */
                                        @Override // kotlin.jvm.functions.Function0
                                        public final Boolean invoke() {
                                            CoreTextFieldKt.tapToFocus(TextFieldState.this, focusRequester2, !z21);
                                            return true;
                                        }
                                    }, 1, null);
                                    final TextFieldSelectionManager textFieldSelectionManager3 = textFieldSelectionManager;
                                    SemanticsPropertiesKt.onLongClick$default(semantics2, null, new Function0<Boolean>() { // from class: androidx.compose.foundation.text.CoreTextFieldKt$CoreTextField$semanticsModifier$1.5
                                        {
                                            super(0);
                                        }

                                        /* JADX WARN: Can't rename method to resolve collision */
                                        @Override // kotlin.jvm.functions.Function0
                                        public final Boolean invoke() {
                                            TextFieldSelectionManager.this.enterSelectionMode$foundation_release();
                                            return true;
                                        }
                                    }, 1, null);
                                    if (!TextRange.m3480getCollapsedimpl(value.getSelection()) && !z18) {
                                        final TextFieldSelectionManager textFieldSelectionManager4 = textFieldSelectionManager;
                                        SemanticsPropertiesKt.copyText$default(semantics2, null, new Function0<Boolean>() { // from class: androidx.compose.foundation.text.CoreTextFieldKt$CoreTextField$semanticsModifier$1.6
                                            {
                                                super(0);
                                            }

                                            /* JADX WARN: Can't rename method to resolve collision */
                                            @Override // kotlin.jvm.functions.Function0
                                            public final Boolean invoke() {
                                                TextFieldSelectionManager.copy$foundation_release$default(TextFieldSelectionManager.this, false, 1, null);
                                                return true;
                                            }
                                        }, 1, null);
                                        if (z16 && !z19) {
                                            final TextFieldSelectionManager textFieldSelectionManager5 = textFieldSelectionManager;
                                            SemanticsPropertiesKt.cutText$default(semantics2, null, new Function0<Boolean>() { // from class: androidx.compose.foundation.text.CoreTextFieldKt$CoreTextField$semanticsModifier$1.7
                                                {
                                                    super(0);
                                                }

                                                /* JADX WARN: Can't rename method to resolve collision */
                                                @Override // kotlin.jvm.functions.Function0
                                                public final Boolean invoke() {
                                                    TextFieldSelectionManager.this.cut$foundation_release();
                                                    return true;
                                                }
                                            }, 1, null);
                                        }
                                    }
                                    if (!z16 || z19) {
                                        return;
                                    }
                                    final TextFieldSelectionManager textFieldSelectionManager6 = textFieldSelectionManager;
                                    SemanticsPropertiesKt.pasteText$default(semantics2, null, new Function0<Boolean>() { // from class: androidx.compose.foundation.text.CoreTextFieldKt$CoreTextField$semanticsModifier$1.8
                                        {
                                            super(0);
                                        }

                                        /* JADX WARN: Can't rename method to resolve collision */
                                        @Override // kotlin.jvm.functions.Function0
                                        public final Boolean invoke() {
                                            TextFieldSelectionManager.this.paste$foundation_release();
                                            return true;
                                        }
                                    }, 1, null);
                                }
                            });
                            final Modifier cursor = TextFieldCursorKt.cursor(Modifier.INSTANCE, textFieldState, value, offsetMapping, brush2, (z16 || z5) ? z8 : true);
                            EffectsKt.DisposableEffect(textFieldSelectionManager, new Function1<DisposableEffectScope, DisposableEffectResult>() { // from class: androidx.compose.foundation.text.CoreTextFieldKt$CoreTextField$3
                                {
                                    super(1);
                                }

                                @Override // kotlin.jvm.functions.Function1
                                public final DisposableEffectResult invoke(DisposableEffectScope DisposableEffect) {
                                    Intrinsics.checkNotNullParameter(DisposableEffect, "$this$DisposableEffect");
                                    final TextFieldSelectionManager textFieldSelectionManager2 = TextFieldSelectionManager.this;
                                    return new DisposableEffectResult() { // from class: androidx.compose.foundation.text.CoreTextFieldKt$CoreTextField$3$invoke$$inlined$onDispose$1
                                        @Override // androidx.compose.runtime.DisposableEffectResult
                                        public void dispose() {
                                            TextFieldSelectionManager.this.hideSelectionToolbar$foundation_release();
                                        }
                                    };
                                }
                            }, startRestartGroup, 8);
                            final ImeOptions imeOptions8 = imeOptions4;
                            EffectsKt.DisposableEffect(imeOptions8, new Function1<DisposableEffectScope, DisposableEffectResult>() { // from class: androidx.compose.foundation.text.CoreTextFieldKt$CoreTextField$4
                                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                {
                                    super(1);
                                }

                                @Override // kotlin.jvm.functions.Function1
                                public final DisposableEffectResult invoke(DisposableEffectScope DisposableEffect) {
                                    Intrinsics.checkNotNullParameter(DisposableEffect, "$this$DisposableEffect");
                                    if (TextInputService.this != null && textFieldState.getHasFocus()) {
                                        textFieldState.setInputSession(TextFieldDelegate.INSTANCE.restartInput$foundation_release(TextInputService.this, value, textFieldState.getProcessor(), imeOptions8, textFieldState.getOnValueChange(), textFieldState.getOnImeActionPerformed()));
                                    }
                                    return new DisposableEffectResult() { // from class: androidx.compose.foundation.text.CoreTextFieldKt$CoreTextField$4$invoke$$inlined$onDispose$1
                                        @Override // androidx.compose.runtime.DisposableEffectResult
                                        public void dispose() {
                                        }
                                    };
                                }
                            }, startRestartGroup, i26 & 14);
                            MutableInteractionSource mutableInteractionSource6 = mutableInteractionSource3;
                            Modifier onGloballyPositioned2 = OnGloballyPositionedModifierKt.onGloballyPositioned(TextFieldScrollKt.textFieldScrollable(previewKeyEventToDeselectOnBack(modifier5.then(textFieldFocusModifier), textFieldState, textFieldSelectionManager).then(TextFieldKeyInputKt.textFieldKeyInput(Modifier.INSTANCE, textFieldState, textFieldSelectionManager, value, textFieldState.getOnValueChange(), !z5, i25 == 1, offsetMapping, undoManager)), textFieldScrollerPosition, mutableInteractionSource6, z16).then(pointerHoverIcon$default).then(semantics), new Function1<LayoutCoordinates, Unit>() { // from class: androidx.compose.foundation.text.CoreTextFieldKt$CoreTextField$decorationBoxModifier$1
                                {
                                    super(1);
                                }

                                @Override // kotlin.jvm.functions.Function1
                                public /* bridge */ /* synthetic */ Unit invoke(LayoutCoordinates layoutCoordinates) {
                                    invoke2(layoutCoordinates);
                                    return Unit.INSTANCE;
                                }

                                /* renamed from: invoke, reason: avoid collision after fix types in other method */
                                public final void invoke2(LayoutCoordinates it) {
                                    Intrinsics.checkNotNullParameter(it, "it");
                                    TextLayoutResultProxy layoutResult = TextFieldState.this.getLayoutResult();
                                    if (layoutResult == null) {
                                        return;
                                    }
                                    layoutResult.setDecorationBoxCoordinates(it);
                                }
                            });
                            z9 = !z16 && textFieldState.getHasFocus() && TouchMode_androidKt.isInTouchMode();
                            if (z9) {
                                companion = TextFieldSelectionManager_androidKt.textFieldMagnifier(Modifier.INSTANCE, textFieldSelectionManager);
                            } else {
                                companion = Modifier.INSTANCE;
                            }
                            final Modifier modifier6 = companion;
                            final Function3<? super Function2<? super Composer, ? super Integer, Unit>, ? super Composer, ? super Integer, Unit> function34 = function32;
                            final TextStyle textStyle5 = textStyle2;
                            final VisualTransformation visualTransformation4 = visualTransformation2;
                            final BringIntoViewRequester bringIntoViewRequester3 = bringIntoViewRequester;
                            VisualTransformation visualTransformation5 = visualTransformation2;
                            final boolean z20 = z9;
                            final boolean z21 = z5;
                            final Function1<? super TextLayoutResult, Unit> function14 = function12;
                            Function2<Composer, Integer, Unit> function2 = new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.foundation.text.CoreTextFieldKt$CoreTextField$5
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

                                public final void invoke(Composer composer3, int i27) {
                                    ComposerKt.sourceInformation(composer3, "C532@23298L3376:CoreTextField.kt#423gt5");
                                    if ((i27 & 11) != 2 || !composer3.getSkipping()) {
                                        Function3<Function2<? super Composer, ? super Integer, Unit>, Composer, Integer, Unit> function35 = function34;
                                        final int i28 = i25;
                                        final TextStyle textStyle6 = textStyle5;
                                        final TextFieldScrollerPosition textFieldScrollerPosition2 = textFieldScrollerPosition;
                                        final TextFieldValue textFieldValue = value;
                                        final VisualTransformation visualTransformation6 = visualTransformation4;
                                        final Modifier modifier7 = cursor;
                                        final Modifier modifier8 = drawBehind;
                                        final Modifier modifier9 = onGloballyPositioned;
                                        final Modifier modifier10 = modifier6;
                                        final BringIntoViewRequester bringIntoViewRequester4 = bringIntoViewRequester3;
                                        final TextFieldState textFieldState2 = textFieldState;
                                        final TextFieldSelectionManager textFieldSelectionManager2 = textFieldSelectionManager;
                                        final boolean z22 = z20;
                                        final boolean z23 = z21;
                                        final Function1<TextLayoutResult, Unit> function15 = function14;
                                        function35.invoke(ComposableLambdaKt.composableLambda(composer3, 207445534, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.foundation.text.CoreTextFieldKt$CoreTextField$5.1
                                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                            /* JADX WARN: Multi-variable type inference failed */
                                            {
                                                super(2);
                                            }

                                            @Override // kotlin.jvm.functions.Function2
                                            public /* bridge */ /* synthetic */ Unit invoke(Composer composer4, Integer num) {
                                                invoke(composer4, num.intValue());
                                                return Unit.INSTANCE;
                                            }

                                            public final void invoke(Composer composer4, int i29) {
                                                ComposerKt.sourceInformation(composer4, "C550@24083L2581:CoreTextField.kt#423gt5");
                                                if ((i29 & 11) != 2 || !composer4.getSkipping()) {
                                                    Modifier maxLinesHeight = MaxLinesHeightModifierKt.maxLinesHeight(Modifier.INSTANCE, i28, textStyle6);
                                                    TextFieldScrollerPosition textFieldScrollerPosition3 = textFieldScrollerPosition2;
                                                    TextFieldValue textFieldValue2 = textFieldValue;
                                                    VisualTransformation visualTransformation7 = visualTransformation6;
                                                    final TextFieldState textFieldState3 = textFieldState2;
                                                    Modifier bringIntoViewRequester5 = BringIntoViewRequesterKt.bringIntoViewRequester(TextFieldSizeKt.textFieldMinSize(TextFieldScrollKt.textFieldScroll(maxLinesHeight, textFieldScrollerPosition3, textFieldValue2, visualTransformation7, new Function0<TextLayoutResultProxy>() { // from class: androidx.compose.foundation.text.CoreTextFieldKt$CoreTextField$5$1$coreTextFieldModifier$1
                                                        {
                                                            super(0);
                                                        }

                                                        /* JADX WARN: Can't rename method to resolve collision */
                                                        @Override // kotlin.jvm.functions.Function0
                                                        public final TextLayoutResultProxy invoke() {
                                                            return TextFieldState.this.getLayoutResult();
                                                        }
                                                    }).then(modifier7).then(modifier8), textStyle6).then(modifier9).then(modifier10), bringIntoViewRequester4);
                                                    final TextFieldSelectionManager textFieldSelectionManager3 = textFieldSelectionManager2;
                                                    final TextFieldState textFieldState4 = textFieldState2;
                                                    final boolean z24 = z22;
                                                    final boolean z25 = z23;
                                                    final Function1<TextLayoutResult, Unit> function16 = function15;
                                                    SimpleLayoutKt.SimpleLayout(bringIntoViewRequester5, ComposableLambdaKt.composableLambda(composer4, 19580180, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.foundation.text.CoreTextFieldKt.CoreTextField.5.1.1
                                                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                                        /* JADX WARN: Multi-variable type inference failed */
                                                        {
                                                            super(2);
                                                        }

                                                        @Override // kotlin.jvm.functions.Function2
                                                        public /* bridge */ /* synthetic */ Unit invoke(Composer composer5, Integer num) {
                                                            invoke(composer5, num.intValue());
                                                            return Unit.INSTANCE;
                                                        }

                                                        public final void invoke(Composer composer5, int i30) {
                                                            ComposerKt.sourceInformation(composer5, "C551@24137L1909,591@26064L327,603@26592L40:CoreTextField.kt#423gt5");
                                                            if ((i30 & 11) != 2 || !composer5.getSkipping()) {
                                                                final TextFieldState textFieldState5 = textFieldState4;
                                                                final Function1<TextLayoutResult, Unit> function17 = function16;
                                                                MeasurePolicy measurePolicy = new MeasurePolicy() { // from class: androidx.compose.foundation.text.CoreTextFieldKt.CoreTextField.5.1.1.2
                                                                    @Override // androidx.compose.ui.layout.MeasurePolicy
                                                                    /* renamed from: measure-3p2s80s */
                                                                    public MeasureResult mo15measure3p2s80s(MeasureScope measure, List<? extends Measurable> measurables, long j) {
                                                                        Intrinsics.checkNotNullParameter(measure, "$this$measure");
                                                                        Intrinsics.checkNotNullParameter(measurables, "measurables");
                                                                        Snapshot.Companion companion3 = Snapshot.INSTANCE;
                                                                        TextFieldState textFieldState6 = TextFieldState.this;
                                                                        Snapshot createNonObservableSnapshot = companion3.createNonObservableSnapshot();
                                                                        try {
                                                                            Snapshot makeCurrent = createNonObservableSnapshot.makeCurrent();
                                                                            try {
                                                                                TextLayoutResultProxy layoutResult = textFieldState6.getLayoutResult();
                                                                                TextLayoutResult value2 = layoutResult != null ? layoutResult.getValue() : null;
                                                                                createNonObservableSnapshot.dispose();
                                                                                Triple<Integer, Integer, TextLayoutResult> m748layout_EkL_Y$foundation_release = TextFieldDelegate.INSTANCE.m748layout_EkL_Y$foundation_release(TextFieldState.this.getTextDelegate(), j, measure.getLayoutDirection(), value2);
                                                                                int intValue = m748layout_EkL_Y$foundation_release.component1().intValue();
                                                                                int intValue2 = m748layout_EkL_Y$foundation_release.component2().intValue();
                                                                                TextLayoutResult component3 = m748layout_EkL_Y$foundation_release.component3();
                                                                                if (!Intrinsics.areEqual(value2, component3)) {
                                                                                    TextFieldState.this.setLayoutResult(new TextLayoutResultProxy(component3));
                                                                                    function17.invoke(component3);
                                                                                }
                                                                                return measure.layout(intValue, intValue2, MapsKt.mapOf(TuplesKt.to(AlignmentLineKt.getFirstBaseline(), Integer.valueOf(MathKt.roundToInt(component3.getFirstBaseline()))), TuplesKt.to(AlignmentLineKt.getLastBaseline(), Integer.valueOf(MathKt.roundToInt(component3.getLastBaseline())))), new Function1<Placeable.PlacementScope, Unit>() { // from class: androidx.compose.foundation.text.CoreTextFieldKt$CoreTextField$5$1$1$2$measure$1
                                                                                    /* renamed from: invoke, reason: avoid collision after fix types in other method */
                                                                                    public final void invoke2(Placeable.PlacementScope layout) {
                                                                                        Intrinsics.checkNotNullParameter(layout, "$this$layout");
                                                                                    }

                                                                                    @Override // kotlin.jvm.functions.Function1
                                                                                    public /* bridge */ /* synthetic */ Unit invoke(Placeable.PlacementScope placementScope) {
                                                                                        invoke2(placementScope);
                                                                                        return Unit.INSTANCE;
                                                                                    }
                                                                                });
                                                                            } finally {
                                                                                createNonObservableSnapshot.restoreCurrent(makeCurrent);
                                                                            }
                                                                        } catch (Throwable th) {
                                                                            createNonObservableSnapshot.dispose();
                                                                            throw th;
                                                                        }
                                                                    }

                                                                    @Override // androidx.compose.ui.layout.MeasurePolicy
                                                                    public int maxIntrinsicWidth(IntrinsicMeasureScope intrinsicMeasureScope, List<? extends IntrinsicMeasurable> measurables, int i31) {
                                                                        Intrinsics.checkNotNullParameter(intrinsicMeasureScope, "<this>");
                                                                        Intrinsics.checkNotNullParameter(measurables, "measurables");
                                                                        TextFieldState.this.getTextDelegate().layoutIntrinsics(intrinsicMeasureScope.getLayoutDirection());
                                                                        return TextFieldState.this.getTextDelegate().getMaxIntrinsicWidth();
                                                                    }
                                                                };
                                                                composer5.startReplaceableGroup(-1323940314);
                                                                ComposerKt.sourceInformation(composer5, "C(Layout)P(!1,2)74@2915L7,75@2970L7,76@3029L7,77@3041L460:Layout.kt#80mrfh");
                                                                Modifier.Companion companion3 = Modifier.INSTANCE;
                                                                ProvidableCompositionLocal<Density> localDensity2 = CompositionLocalsKt.getLocalDensity();
                                                                ComposerKt.sourceInformationMarkerStart(composer5, 2023513938, "C:CompositionLocal.kt#9igjgp");
                                                                Object consume9 = composer5.consume(localDensity2);
                                                                ComposerKt.sourceInformationMarkerEnd(composer5);
                                                                Density density2 = (Density) consume9;
                                                                ProvidableCompositionLocal<LayoutDirection> localLayoutDirection = CompositionLocalsKt.getLocalLayoutDirection();
                                                                ComposerKt.sourceInformationMarkerStart(composer5, 2023513938, "C:CompositionLocal.kt#9igjgp");
                                                                Object consume10 = composer5.consume(localLayoutDirection);
                                                                ComposerKt.sourceInformationMarkerEnd(composer5);
                                                                LayoutDirection layoutDirection = (LayoutDirection) consume10;
                                                                ProvidableCompositionLocal<ViewConfiguration> localViewConfiguration = CompositionLocalsKt.getLocalViewConfiguration();
                                                                ComposerKt.sourceInformationMarkerStart(composer5, 2023513938, "C:CompositionLocal.kt#9igjgp");
                                                                Object consume11 = composer5.consume(localViewConfiguration);
                                                                ComposerKt.sourceInformationMarkerEnd(composer5);
                                                                ViewConfiguration viewConfiguration = (ViewConfiguration) consume11;
                                                                Function0<ComposeUiNode> constructor = ComposeUiNode.INSTANCE.getConstructor();
                                                                Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> materializerOf = LayoutKt.materializerOf(companion3);
                                                                if (!(composer5.getApplier() instanceof Applier)) {
                                                                    ComposablesKt.invalidApplier();
                                                                }
                                                                composer5.startReusableNode();
                                                                if (composer5.getInserting()) {
                                                                    composer5.createNode(constructor);
                                                                } else {
                                                                    composer5.useNode();
                                                                }
                                                                composer5.disableReusing();
                                                                Composer m1283constructorimpl = Updater.m1283constructorimpl(composer5);
                                                                Updater.m1290setimpl(m1283constructorimpl, measurePolicy, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
                                                                Updater.m1290setimpl(m1283constructorimpl, density2, ComposeUiNode.INSTANCE.getSetDensity());
                                                                Updater.m1290setimpl(m1283constructorimpl, layoutDirection, ComposeUiNode.INSTANCE.getSetLayoutDirection());
                                                                Updater.m1290setimpl(m1283constructorimpl, viewConfiguration, ComposeUiNode.INSTANCE.getSetViewConfiguration());
                                                                composer5.enableReusing();
                                                                boolean z26 = false;
                                                                materializerOf.invoke(SkippableUpdater.m1273boximpl(SkippableUpdater.m1274constructorimpl(composer5)), composer5, 0);
                                                                composer5.startReplaceableGroup(2058660585);
                                                                composer5.startReplaceableGroup(1714611517);
                                                                ComposerKt.sourceInformation(composer5, "C:CoreTextField.kt#423gt5");
                                                                composer5.endReplaceableGroup();
                                                                composer5.endReplaceableGroup();
                                                                composer5.endNode();
                                                                composer5.endReplaceableGroup();
                                                                TextFieldSelectionManager textFieldSelectionManager4 = TextFieldSelectionManager.this;
                                                                if (textFieldState4.getHandleState() == HandleState.Selection && textFieldState4.getLayoutCoordinates() != null) {
                                                                    LayoutCoordinates layoutCoordinates = textFieldState4.getLayoutCoordinates();
                                                                    Intrinsics.checkNotNull(layoutCoordinates);
                                                                    if (layoutCoordinates.isAttached() && z24) {
                                                                        z26 = true;
                                                                    }
                                                                }
                                                                CoreTextFieldKt.SelectionToolbarAndHandles(textFieldSelectionManager4, z26, composer5, 8);
                                                                if (textFieldState4.getHandleState() == HandleState.Cursor && !z25 && z24) {
                                                                    CoreTextFieldKt.TextFieldCursorHandle(TextFieldSelectionManager.this, composer5, 8);
                                                                    return;
                                                                }
                                                                return;
                                                            }
                                                            composer5.skipToGroupEnd();
                                                        }
                                                    }), composer4, 48, 0);
                                                    return;
                                                }
                                                composer4.skipToGroupEnd();
                                            }
                                        }), composer3, Integer.valueOf(((i26 >> 9) & 112) | 6));
                                        return;
                                    }
                                    composer3.skipToGroupEnd();
                                }
                            };
                            composer2 = startRestartGroup;
                            CoreTextFieldRootBox(onGloballyPositioned2, textFieldSelectionManager, ComposableLambdaKt.composableLambda(composer2, -1885146845, true, function2), composer2, 448);
                            textStyle3 = textStyle2;
                            imeOptions5 = imeOptions8;
                            function13 = function12;
                            brush3 = brush2;
                            z10 = z4;
                            keyboardActions3 = keyboardActions2;
                            z11 = z5;
                            function33 = function32;
                            mutableInteractionSource4 = mutableInteractionSource6;
                            i19 = i25;
                            z12 = z16;
                            modifier4 = modifier5;
                            visualTransformation3 = visualTransformation5;
                        } else {
                            startRestartGroup.skipToGroupEnd();
                            modifier4 = modifier;
                            textStyle3 = textStyle;
                            visualTransformation3 = visualTransformation;
                            function13 = function1;
                            mutableInteractionSource4 = mutableInteractionSource;
                            brush3 = brush;
                            z10 = z;
                            imeOptions5 = imeOptions;
                            keyboardActions3 = keyboardActions;
                            z12 = z2;
                            z11 = z3;
                            function33 = function3;
                            composer2 = startRestartGroup;
                            i19 = i;
                        }
                        endRestartGroup = composer2.endRestartGroup();
                        if (endRestartGroup == null) {
                            return;
                        }
                        endRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.foundation.text.CoreTextFieldKt$CoreTextField$6
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

                            public final void invoke(Composer composer3, int i27) {
                                CoreTextFieldKt.CoreTextField(TextFieldValue.this, onValueChange, modifier4, textStyle3, visualTransformation3, function13, mutableInteractionSource4, brush3, z10, i19, imeOptions5, keyboardActions3, z12, z11, function33, composer3, i2 | 1, i3, i4);
                            }
                        });
                        return;
                    }
                    i16 = i4 & 16384;
                    if (i16 != 0) {
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
                    if (i8 != 0) {
                    }
                    if (i9 != 0) {
                    }
                    if ((i4 & 128) != 0) {
                    }
                    if (i10 != 0) {
                    }
                    if (i11 != 0) {
                    }
                    if ((i4 & 1024) != 0) {
                    }
                    if (i13 != 0) {
                    }
                    if (i14 != 0) {
                    }
                    if (i15 != 0) {
                    }
                    if (i16 != 0) {
                    }
                    visualTransformation2 = none;
                    imeOptions3 = imeOptions2;
                    function12 = coreTextFieldKt$CoreTextField$1;
                    mutableInteractionSource2 = mutableInteractionSource5;
                    i18 = i24;
                    textStyle2 = textStyle4;
                    z6 = z14;
                    startRestartGroup.endDefaults();
                    final FocusRequester focusRequester2 = new FocusRequester();
                    startRestartGroup.startReplaceableGroup(-55013392);
                    ComposerKt.sourceInformation(startRestartGroup, "195@10897L7");
                    if (z6) {
                    }
                    textInputService = null;
                    startRestartGroup.endReplaceableGroup();
                    ProvidableCompositionLocal<Density> localDensity2 = CompositionLocalsKt.getLocalDensity();
                    ComposerKt.sourceInformationMarkerStart(startRestartGroup, 2023513938, "C:CompositionLocal.kt#9igjgp");
                    Object consume22 = startRestartGroup.consume(localDensity2);
                    ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                    Density density2 = (Density) consume22;
                    ProvidableCompositionLocal<FontFamily.Resolver> localFontFamilyResolver2 = CompositionLocalsKt.getLocalFontFamilyResolver();
                    ComposerKt.sourceInformationMarkerStart(startRestartGroup, 2023513938, "C:CompositionLocal.kt#9igjgp");
                    Object consume32 = startRestartGroup.consume(localFontFamilyResolver2);
                    ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                    FontFamily.Resolver resolver2 = (FontFamily.Resolver) consume32;
                    ProvidableCompositionLocal<TextSelectionColors> localTextSelectionColors2 = TextSelectionColorsKt.getLocalTextSelectionColors();
                    ComposerKt.sourceInformationMarkerStart(startRestartGroup, 2023513938, "C:CompositionLocal.kt#9igjgp");
                    Object consume42 = startRestartGroup.consume(localTextSelectionColors2);
                    ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                    long backgroundColor2 = ((TextSelectionColors) consume42).getBackgroundColor();
                    ProvidableCompositionLocal<FocusManager> localFocusManager2 = CompositionLocalsKt.getLocalFocusManager();
                    ComposerKt.sourceInformationMarkerStart(startRestartGroup, 2023513938, "C:CompositionLocal.kt#9igjgp");
                    Object consume52 = startRestartGroup.consume(localFocusManager2);
                    ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                    FocusManager focusManager2 = (FocusManager) consume52;
                    if (i18 == 1) {
                    }
                    Object[] objArr2 = {orientation};
                    Saver<TextFieldScrollerPosition, Object> saver2 = TextFieldScrollerPosition.INSTANCE.getSaver();
                    Modifier modifier52 = modifier3;
                    startRestartGroup.startReplaceableGroup(1157296644);
                    ComposerKt.sourceInformation(startRestartGroup, "C(remember)P(1):Composables.kt#9igjgp");
                    changed = startRestartGroup.changed(orientation);
                    final int i252 = i18;
                    rememberedValue = startRestartGroup.rememberedValue();
                    if (!changed) {
                    }
                    rememberedValue = (Function0) new Function0<TextFieldScrollerPosition>() { // from class: androidx.compose.foundation.text.CoreTextFieldKt$CoreTextField$scrollerPosition$1$1
                        {
                            super(0);
                        }

                        /* JADX WARN: Can't rename method to resolve collision */
                        @Override // kotlin.jvm.functions.Function0
                        public final TextFieldScrollerPosition invoke() {
                            return new TextFieldScrollerPosition(Orientation.this, 0.0f, 2, null);
                        }
                    };
                    startRestartGroup.updateRememberedValue(rememberedValue);
                    startRestartGroup.endReplaceableGroup();
                    final TextFieldScrollerPosition textFieldScrollerPosition2 = (TextFieldScrollerPosition) RememberSaveableKt.m1296rememberSaveable(objArr2, (Saver) saver2, (String) null, (Function0) rememberedValue, startRestartGroup, 72, 4);
                    startRestartGroup.startReplaceableGroup(511388516);
                    ComposerKt.sourceInformation(startRestartGroup, "C(remember)P(1,2):Composables.kt#9igjgp");
                    changed2 = startRestartGroup.changed(value) | startRestartGroup.changed(visualTransformation2);
                    rememberedValue2 = startRestartGroup.rememberedValue();
                    if (changed2) {
                    }
                    TransformedText filter2 = visualTransformation2.filter(value.getAnnotatedString());
                    composition = value.getComposition();
                    z7 = z6;
                    imeOptions4 = imeOptions3;
                    if (composition != null) {
                    }
                    rememberedValue2 = filter2;
                    startRestartGroup.updateRememberedValue(rememberedValue2);
                    startRestartGroup.endReplaceableGroup();
                    final TransformedText transformedText2 = (TransformedText) rememberedValue2;
                    AnnotatedString text2 = transformedText2.getText();
                    final OffsetMapping offsetMapping2 = transformedText2.getOffsetMapping();
                    RecomposeScope currentRecomposeScope2 = ComposablesKt.getCurrentRecomposeScope(startRestartGroup, 0);
                    startRestartGroup.startReplaceableGroup(-492369756);
                    ComposerKt.sourceInformation(startRestartGroup, "C(remember):Composables.kt#9igjgp");
                    final int i262 = i17;
                    rememberedValue3 = startRestartGroup.rememberedValue();
                    if (rememberedValue3 == Composer.INSTANCE.getEmpty()) {
                    }
                    startRestartGroup.endReplaceableGroup();
                    final TextFieldState textFieldState2 = (TextFieldState) rememberedValue3;
                    textFieldState2.m763updateaKPrnQ(text2, textStyle2, z4, density2, resolver2, onValueChange, keyboardActions2, focusManager2, backgroundColor2);
                    textFieldState2.getProcessor().reset(value, textFieldState2.getInputSession());
                    startRestartGroup.startReplaceableGroup(-492369756);
                    ComposerKt.sourceInformation(startRestartGroup, "C(remember):Composables.kt#9igjgp");
                    rememberedValue4 = startRestartGroup.rememberedValue();
                    if (rememberedValue4 == Composer.INSTANCE.getEmpty()) {
                    }
                    startRestartGroup.endReplaceableGroup();
                    UndoManager undoManager2 = (UndoManager) rememberedValue4;
                    UndoManager.snapshotIfNeeded$default(undoManager2, value, 0L, 2, null);
                    startRestartGroup.startReplaceableGroup(-492369756);
                    ComposerKt.sourceInformation(startRestartGroup, "C(remember):Composables.kt#9igjgp");
                    rememberedValue5 = startRestartGroup.rememberedValue();
                    if (rememberedValue5 == Composer.INSTANCE.getEmpty()) {
                    }
                    startRestartGroup.endReplaceableGroup();
                    final TextFieldSelectionManager textFieldSelectionManager2 = (TextFieldSelectionManager) rememberedValue5;
                    textFieldSelectionManager2.setOffsetMapping$foundation_release(offsetMapping2);
                    textFieldSelectionManager2.setVisualTransformation$foundation_release(visualTransformation2);
                    textFieldSelectionManager2.setOnValueChange$foundation_release(textFieldState2.getOnValueChange());
                    textFieldSelectionManager2.setState$foundation_release(textFieldState2);
                    textFieldSelectionManager2.setValue$foundation_release(value);
                    ProvidableCompositionLocal<ClipboardManager> localClipboardManager2 = CompositionLocalsKt.getLocalClipboardManager();
                    ComposerKt.sourceInformationMarkerStart(startRestartGroup, 2023513938, "C:CompositionLocal.kt#9igjgp");
                    Object consume62 = startRestartGroup.consume(localClipboardManager2);
                    ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                    textFieldSelectionManager2.setClipboardManager$foundation_release((ClipboardManager) consume62);
                    ProvidableCompositionLocal<TextToolbar> localTextToolbar2 = CompositionLocalsKt.getLocalTextToolbar();
                    ComposerKt.sourceInformationMarkerStart(startRestartGroup, 2023513938, "C:CompositionLocal.kt#9igjgp");
                    Object consume72 = startRestartGroup.consume(localTextToolbar2);
                    ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                    textFieldSelectionManager2.setTextToolbar((TextToolbar) consume72);
                    ProvidableCompositionLocal<HapticFeedback> localHapticFeedback2 = CompositionLocalsKt.getLocalHapticFeedback();
                    ComposerKt.sourceInformationMarkerStart(startRestartGroup, 2023513938, "C:CompositionLocal.kt#9igjgp");
                    Object consume82 = startRestartGroup.consume(localHapticFeedback2);
                    ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                    textFieldSelectionManager2.setHapticFeedBack((HapticFeedback) consume82);
                    textFieldSelectionManager2.setFocusRequester(focusRequester2);
                    textFieldSelectionManager2.setEditable(!z5);
                    startRestartGroup.startReplaceableGroup(773894976);
                    ComposerKt.sourceInformation(startRestartGroup, "C(rememberCoroutineScope)475@19849L144:Effects.kt#9igjgp");
                    startRestartGroup.startReplaceableGroup(-492369756);
                    ComposerKt.sourceInformation(startRestartGroup, "C(remember):Composables.kt#9igjgp");
                    rememberedValue6 = startRestartGroup.rememberedValue();
                    if (rememberedValue6 == Composer.INSTANCE.getEmpty()) {
                    }
                    startRestartGroup.endReplaceableGroup();
                    final CoroutineScope coroutineScope2 = ((CompositionScopedCoroutineScopeCanceller) rememberedValue6).getCoroutineScope();
                    startRestartGroup.endReplaceableGroup();
                    startRestartGroup.startReplaceableGroup(-492369756);
                    ComposerKt.sourceInformation(startRestartGroup, "C(remember):Composables.kt#9igjgp");
                    rememberedValue7 = startRestartGroup.rememberedValue();
                    if (rememberedValue7 == Composer.INSTANCE.getEmpty()) {
                    }
                    startRestartGroup.endReplaceableGroup();
                    final BringIntoViewRequester bringIntoViewRequester22 = (BringIntoViewRequester) rememberedValue7;
                    final TextInputService textInputService22 = textInputService;
                    final ImeOptions imeOptions62 = imeOptions4;
                    final boolean z162 = z7;
                    Modifier textFieldFocusModifier2 = TextFieldGestureModifiersKt.textFieldFocusModifier(Modifier.INSTANCE, z162, focusRequester2, mutableInteractionSource2, new Function1<FocusState, Unit>() { // from class: androidx.compose.foundation.text.CoreTextFieldKt$CoreTextField$focusModifier$1
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        {
                            super(1);
                        }

                        @Override // kotlin.jvm.functions.Function1
                        public /* bridge */ /* synthetic */ Unit invoke(FocusState focusState) {
                            invoke2(focusState);
                            return Unit.INSTANCE;
                        }

                        /* renamed from: invoke, reason: avoid collision after fix types in other method */
                        public final void invoke2(FocusState it) {
                            TextLayoutResultProxy layoutResult;
                            Intrinsics.checkNotNullParameter(it, "it");
                            if (TextFieldState.this.getHasFocus() == it.isFocused()) {
                                return;
                            }
                            TextFieldState.this.setHasFocus(it.isFocused());
                            TextInputService textInputService3 = textInputService22;
                            if (textInputService3 != null) {
                                CoreTextFieldKt.notifyTextInputServiceOnFocusChange(textInputService3, TextFieldState.this, value, imeOptions62);
                                if (it.isFocused() && (layoutResult = TextFieldState.this.getLayoutResult()) != null) {
                                    BuildersKt__Builders_commonKt.launch$default(coroutineScope2, null, null, new CoreTextFieldKt$CoreTextField$focusModifier$1$1$1(bringIntoViewRequester22, value, TextFieldState.this, layoutResult, offsetMapping2, null), 3, null);
                                }
                            }
                            if (it.isFocused()) {
                                return;
                            }
                            TextFieldSelectionManager.m860deselect_kEHs6E$foundation_release$default(textFieldSelectionManager2, null, 1, null);
                        }
                    });
                    EffectsKt.DisposableEffect(textFieldState2, new Function1<DisposableEffectScope, DisposableEffectResult>() { // from class: androidx.compose.foundation.text.CoreTextFieldKt$CoreTextField$2
                        {
                            super(1);
                        }

                        @Override // kotlin.jvm.functions.Function1
                        public final DisposableEffectResult invoke(DisposableEffectScope DisposableEffect) {
                            Intrinsics.checkNotNullParameter(DisposableEffect, "$this$DisposableEffect");
                            final TextFieldState textFieldState22 = TextFieldState.this;
                            return new DisposableEffectResult() { // from class: androidx.compose.foundation.text.CoreTextFieldKt$CoreTextField$2$invoke$$inlined$onDispose$1
                                @Override // androidx.compose.runtime.DisposableEffectResult
                                public void dispose() {
                                    if (TextFieldState.this.getHasFocus()) {
                                        CoreTextFieldKt.onBlur(TextFieldState.this);
                                    }
                                }
                            };
                        }
                    }, startRestartGroup, 8);
                    if (TouchMode_androidKt.isInTouchMode()) {
                    }
                    final Modifier drawBehind2 = DrawModifierKt.drawBehind(Modifier.INSTANCE, new Function1<DrawScope, Unit>() { // from class: androidx.compose.foundation.text.CoreTextFieldKt$CoreTextField$drawModifier$1
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        {
                            super(1);
                        }

                        @Override // kotlin.jvm.functions.Function1
                        public /* bridge */ /* synthetic */ Unit invoke(DrawScope drawScope) {
                            invoke2(drawScope);
                            return Unit.INSTANCE;
                        }

                        /* renamed from: invoke, reason: avoid collision after fix types in other method */
                        public final void invoke2(DrawScope drawBehind22) {
                            Intrinsics.checkNotNullParameter(drawBehind22, "$this$drawBehind");
                            TextLayoutResultProxy layoutResult = TextFieldState.this.getLayoutResult();
                            if (layoutResult != null) {
                                TextFieldValue textFieldValue = value;
                                OffsetMapping offsetMapping22 = offsetMapping2;
                                TextFieldState textFieldState22 = TextFieldState.this;
                                TextFieldDelegate.INSTANCE.draw$foundation_release(drawBehind22.getDrawContext().getCanvas(), textFieldValue, offsetMapping22, layoutResult.getValue(), textFieldState22.getSelectionPaint());
                            }
                        }
                    });
                    final Modifier onGloballyPositioned3 = OnGloballyPositionedModifierKt.onGloballyPositioned(Modifier.INSTANCE, new Function1<LayoutCoordinates, Unit>() { // from class: androidx.compose.foundation.text.CoreTextFieldKt$CoreTextField$onPositionedModifier$1
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        {
                            super(1);
                        }

                        @Override // kotlin.jvm.functions.Function1
                        public /* bridge */ /* synthetic */ Unit invoke(LayoutCoordinates layoutCoordinates) {
                            invoke2(layoutCoordinates);
                            return Unit.INSTANCE;
                        }

                        /* renamed from: invoke, reason: avoid collision after fix types in other method */
                        public final void invoke2(LayoutCoordinates it) {
                            Intrinsics.checkNotNullParameter(it, "it");
                            TextFieldState.this.setLayoutCoordinates(it);
                            if (z162) {
                                if (TextFieldState.this.getHandleState() == HandleState.Selection) {
                                    if (TextFieldState.this.getShowFloatingToolbar()) {
                                        textFieldSelectionManager2.showSelectionToolbar$foundation_release();
                                    } else {
                                        textFieldSelectionManager2.hideSelectionToolbar$foundation_release();
                                    }
                                    TextFieldState.this.setShowSelectionHandleStart(TextFieldSelectionManagerKt.isSelectionHandleInVisibleBound(textFieldSelectionManager2, true));
                                    TextFieldState.this.setShowSelectionHandleEnd(TextFieldSelectionManagerKt.isSelectionHandleInVisibleBound(textFieldSelectionManager2, false));
                                } else if (TextFieldState.this.getHandleState() == HandleState.Cursor) {
                                    TextFieldState.this.setShowCursorHandle(TextFieldSelectionManagerKt.isSelectionHandleInVisibleBound(textFieldSelectionManager2, true));
                                }
                            }
                            TextLayoutResultProxy layoutResult = TextFieldState.this.getLayoutResult();
                            if (layoutResult == null) {
                                return;
                            }
                            layoutResult.setInnerTextFieldCoordinates(it);
                        }
                    });
                    final boolean z182 = visualTransformation2 instanceof PasswordVisualTransformation;
                    final ImeOptions imeOptions72 = imeOptions4;
                    final boolean z192 = z5;
                    Modifier semantics2 = SemanticsModifierKt.semantics(Modifier.INSTANCE, true, new Function1<SemanticsPropertyReceiver, Unit>() { // from class: androidx.compose.foundation.text.CoreTextFieldKt$CoreTextField$semanticsModifier$1
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        {
                            super(1);
                        }

                        @Override // kotlin.jvm.functions.Function1
                        public /* bridge */ /* synthetic */ Unit invoke(SemanticsPropertyReceiver semanticsPropertyReceiver) {
                            invoke2(semanticsPropertyReceiver);
                            return Unit.INSTANCE;
                        }

                        /* renamed from: invoke, reason: avoid collision after fix types in other method */
                        public final void invoke2(SemanticsPropertyReceiver semantics22) {
                            Intrinsics.checkNotNullParameter(semantics22, "$this$semantics");
                            SemanticsPropertiesKt.m3395setImeAction4L7nppU(semantics22, ImeOptions.this.getImeAction());
                            SemanticsPropertiesKt.setEditableText(semantics22, transformedText2.getText());
                            SemanticsPropertiesKt.m3398setTextSelectionRangeFDrldGo(semantics22, value.getSelection());
                            if (!z162) {
                                SemanticsPropertiesKt.disabled(semantics22);
                            }
                            if (z182) {
                                SemanticsPropertiesKt.password(semantics22);
                            }
                            final TextFieldState textFieldState22 = textFieldState2;
                            SemanticsPropertiesKt.getTextLayoutResult$default(semantics22, null, new Function1<List<TextLayoutResult>, Boolean>() { // from class: androidx.compose.foundation.text.CoreTextFieldKt$CoreTextField$semanticsModifier$1.1
                                {
                                    super(1);
                                }

                                @Override // kotlin.jvm.functions.Function1
                                public final Boolean invoke(List<TextLayoutResult> it) {
                                    boolean z202;
                                    Intrinsics.checkNotNullParameter(it, "it");
                                    if (TextFieldState.this.getLayoutResult() != null) {
                                        TextLayoutResultProxy layoutResult = TextFieldState.this.getLayoutResult();
                                        Intrinsics.checkNotNull(layoutResult);
                                        it.add(layoutResult.getValue());
                                        z202 = true;
                                    } else {
                                        z202 = false;
                                    }
                                    return Boolean.valueOf(z202);
                                }
                            }, 1, null);
                            final TextFieldState textFieldState3 = textFieldState2;
                            SemanticsPropertiesKt.setText$default(semantics22, null, new Function1<AnnotatedString, Boolean>() { // from class: androidx.compose.foundation.text.CoreTextFieldKt$CoreTextField$semanticsModifier$1.2
                                {
                                    super(1);
                                }

                                @Override // kotlin.jvm.functions.Function1
                                public final Boolean invoke(AnnotatedString it) {
                                    Intrinsics.checkNotNullParameter(it, "it");
                                    TextFieldState.this.getOnValueChange().invoke(new TextFieldValue(it.getText(), TextRangeKt.TextRange(it.getText().length()), (TextRange) null, 4, (DefaultConstructorMarker) null));
                                    return true;
                                }
                            }, 1, null);
                            final OffsetMapping offsetMapping22 = offsetMapping2;
                            final boolean z202 = z162;
                            final TextFieldValue textFieldValue = value;
                            final TextFieldSelectionManager textFieldSelectionManager22 = textFieldSelectionManager2;
                            final TextFieldState textFieldState4 = textFieldState2;
                            SemanticsPropertiesKt.setSelection$default(semantics22, null, new Function3<Integer, Integer, Boolean, Boolean>() { // from class: androidx.compose.foundation.text.CoreTextFieldKt$CoreTextField$semanticsModifier$1.3
                                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                {
                                    super(3);
                                }

                                @Override // kotlin.jvm.functions.Function3
                                public /* bridge */ /* synthetic */ Boolean invoke(Integer num, Integer num2, Boolean bool) {
                                    return invoke(num.intValue(), num2.intValue(), bool.booleanValue());
                                }

                                public final Boolean invoke(int i27, int i28, boolean z212) {
                                    if (!z212) {
                                        i27 = OffsetMapping.this.transformedToOriginal(i27);
                                    }
                                    if (!z212) {
                                        i28 = OffsetMapping.this.transformedToOriginal(i28);
                                    }
                                    boolean z22 = false;
                                    if (z202 && (i27 != TextRange.m3486getStartimpl(textFieldValue.getSelection()) || i28 != TextRange.m3481getEndimpl(textFieldValue.getSelection()))) {
                                        if (RangesKt.coerceAtMost(i27, i28) >= 0 && RangesKt.coerceAtLeast(i27, i28) <= textFieldValue.getAnnotatedString().length()) {
                                            if (z212 || i27 == i28) {
                                                textFieldSelectionManager22.exitSelectionMode$foundation_release();
                                            } else {
                                                textFieldSelectionManager22.enterSelectionMode$foundation_release();
                                            }
                                            textFieldState4.getOnValueChange().invoke(new TextFieldValue(textFieldValue.getAnnotatedString(), TextRangeKt.TextRange(i27, i28), (TextRange) null, 4, (DefaultConstructorMarker) null));
                                            z22 = true;
                                        } else {
                                            textFieldSelectionManager22.exitSelectionMode$foundation_release();
                                        }
                                    }
                                    return Boolean.valueOf(z22);
                                }
                            }, 1, null);
                            final TextFieldState textFieldState5 = textFieldState2;
                            final FocusRequester focusRequester22 = focusRequester2;
                            final boolean z212 = z192;
                            SemanticsPropertiesKt.onClick$default(semantics22, null, new Function0<Boolean>() { // from class: androidx.compose.foundation.text.CoreTextFieldKt$CoreTextField$semanticsModifier$1.4
                                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                {
                                    super(0);
                                }

                                /* JADX WARN: Can't rename method to resolve collision */
                                @Override // kotlin.jvm.functions.Function0
                                public final Boolean invoke() {
                                    CoreTextFieldKt.tapToFocus(TextFieldState.this, focusRequester22, !z212);
                                    return true;
                                }
                            }, 1, null);
                            final TextFieldSelectionManager textFieldSelectionManager3 = textFieldSelectionManager2;
                            SemanticsPropertiesKt.onLongClick$default(semantics22, null, new Function0<Boolean>() { // from class: androidx.compose.foundation.text.CoreTextFieldKt$CoreTextField$semanticsModifier$1.5
                                {
                                    super(0);
                                }

                                /* JADX WARN: Can't rename method to resolve collision */
                                @Override // kotlin.jvm.functions.Function0
                                public final Boolean invoke() {
                                    TextFieldSelectionManager.this.enterSelectionMode$foundation_release();
                                    return true;
                                }
                            }, 1, null);
                            if (!TextRange.m3480getCollapsedimpl(value.getSelection()) && !z182) {
                                final TextFieldSelectionManager textFieldSelectionManager4 = textFieldSelectionManager2;
                                SemanticsPropertiesKt.copyText$default(semantics22, null, new Function0<Boolean>() { // from class: androidx.compose.foundation.text.CoreTextFieldKt$CoreTextField$semanticsModifier$1.6
                                    {
                                        super(0);
                                    }

                                    /* JADX WARN: Can't rename method to resolve collision */
                                    @Override // kotlin.jvm.functions.Function0
                                    public final Boolean invoke() {
                                        TextFieldSelectionManager.copy$foundation_release$default(TextFieldSelectionManager.this, false, 1, null);
                                        return true;
                                    }
                                }, 1, null);
                                if (z162 && !z192) {
                                    final TextFieldSelectionManager textFieldSelectionManager5 = textFieldSelectionManager2;
                                    SemanticsPropertiesKt.cutText$default(semantics22, null, new Function0<Boolean>() { // from class: androidx.compose.foundation.text.CoreTextFieldKt$CoreTextField$semanticsModifier$1.7
                                        {
                                            super(0);
                                        }

                                        /* JADX WARN: Can't rename method to resolve collision */
                                        @Override // kotlin.jvm.functions.Function0
                                        public final Boolean invoke() {
                                            TextFieldSelectionManager.this.cut$foundation_release();
                                            return true;
                                        }
                                    }, 1, null);
                                }
                            }
                            if (!z162 || z192) {
                                return;
                            }
                            final TextFieldSelectionManager textFieldSelectionManager6 = textFieldSelectionManager2;
                            SemanticsPropertiesKt.pasteText$default(semantics22, null, new Function0<Boolean>() { // from class: androidx.compose.foundation.text.CoreTextFieldKt$CoreTextField$semanticsModifier$1.8
                                {
                                    super(0);
                                }

                                /* JADX WARN: Can't rename method to resolve collision */
                                @Override // kotlin.jvm.functions.Function0
                                public final Boolean invoke() {
                                    TextFieldSelectionManager.this.paste$foundation_release();
                                    return true;
                                }
                            }, 1, null);
                        }
                    });
                    final Modifier cursor2 = TextFieldCursorKt.cursor(Modifier.INSTANCE, textFieldState2, value, offsetMapping2, brush2, (z162 || z5) ? z8 : true);
                    EffectsKt.DisposableEffect(textFieldSelectionManager2, new Function1<DisposableEffectScope, DisposableEffectResult>() { // from class: androidx.compose.foundation.text.CoreTextFieldKt$CoreTextField$3
                        {
                            super(1);
                        }

                        @Override // kotlin.jvm.functions.Function1
                        public final DisposableEffectResult invoke(DisposableEffectScope DisposableEffect) {
                            Intrinsics.checkNotNullParameter(DisposableEffect, "$this$DisposableEffect");
                            final TextFieldSelectionManager textFieldSelectionManager22 = TextFieldSelectionManager.this;
                            return new DisposableEffectResult() { // from class: androidx.compose.foundation.text.CoreTextFieldKt$CoreTextField$3$invoke$$inlined$onDispose$1
                                @Override // androidx.compose.runtime.DisposableEffectResult
                                public void dispose() {
                                    TextFieldSelectionManager.this.hideSelectionToolbar$foundation_release();
                                }
                            };
                        }
                    }, startRestartGroup, 8);
                    final ImeOptions imeOptions82 = imeOptions4;
                    EffectsKt.DisposableEffect(imeOptions82, new Function1<DisposableEffectScope, DisposableEffectResult>() { // from class: androidx.compose.foundation.text.CoreTextFieldKt$CoreTextField$4
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        {
                            super(1);
                        }

                        @Override // kotlin.jvm.functions.Function1
                        public final DisposableEffectResult invoke(DisposableEffectScope DisposableEffect) {
                            Intrinsics.checkNotNullParameter(DisposableEffect, "$this$DisposableEffect");
                            if (TextInputService.this != null && textFieldState2.getHasFocus()) {
                                textFieldState2.setInputSession(TextFieldDelegate.INSTANCE.restartInput$foundation_release(TextInputService.this, value, textFieldState2.getProcessor(), imeOptions82, textFieldState2.getOnValueChange(), textFieldState2.getOnImeActionPerformed()));
                            }
                            return new DisposableEffectResult() { // from class: androidx.compose.foundation.text.CoreTextFieldKt$CoreTextField$4$invoke$$inlined$onDispose$1
                                @Override // androidx.compose.runtime.DisposableEffectResult
                                public void dispose() {
                                }
                            };
                        }
                    }, startRestartGroup, i262 & 14);
                    MutableInteractionSource mutableInteractionSource62 = mutableInteractionSource3;
                    Modifier onGloballyPositioned22 = OnGloballyPositionedModifierKt.onGloballyPositioned(TextFieldScrollKt.textFieldScrollable(previewKeyEventToDeselectOnBack(modifier52.then(textFieldFocusModifier2), textFieldState2, textFieldSelectionManager2).then(TextFieldKeyInputKt.textFieldKeyInput(Modifier.INSTANCE, textFieldState2, textFieldSelectionManager2, value, textFieldState2.getOnValueChange(), !z5, i252 == 1, offsetMapping2, undoManager2)), textFieldScrollerPosition2, mutableInteractionSource62, z162).then(pointerHoverIcon$default).then(semantics2), new Function1<LayoutCoordinates, Unit>() { // from class: androidx.compose.foundation.text.CoreTextFieldKt$CoreTextField$decorationBoxModifier$1
                        {
                            super(1);
                        }

                        @Override // kotlin.jvm.functions.Function1
                        public /* bridge */ /* synthetic */ Unit invoke(LayoutCoordinates layoutCoordinates) {
                            invoke2(layoutCoordinates);
                            return Unit.INSTANCE;
                        }

                        /* renamed from: invoke, reason: avoid collision after fix types in other method */
                        public final void invoke2(LayoutCoordinates it) {
                            Intrinsics.checkNotNullParameter(it, "it");
                            TextLayoutResultProxy layoutResult = TextFieldState.this.getLayoutResult();
                            if (layoutResult == null) {
                                return;
                            }
                            layoutResult.setDecorationBoxCoordinates(it);
                        }
                    });
                    if (z162) {
                    }
                    if (z9) {
                    }
                    final Modifier modifier62 = companion;
                    final Function3<? super Function2<? super Composer, ? super Integer, Unit>, ? super Composer, ? super Integer, Unit> function342 = function32;
                    final TextStyle textStyle52 = textStyle2;
                    final VisualTransformation visualTransformation42 = visualTransformation2;
                    final BringIntoViewRequester bringIntoViewRequester32 = bringIntoViewRequester;
                    VisualTransformation visualTransformation52 = visualTransformation2;
                    final boolean z202 = z9;
                    final boolean z212 = z5;
                    final Function1<? super TextLayoutResult, Unit> function142 = function12;
                    Function2<Composer, Integer, Unit> function22 = new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.foundation.text.CoreTextFieldKt$CoreTextField$5
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

                        public final void invoke(Composer composer3, int i27) {
                            ComposerKt.sourceInformation(composer3, "C532@23298L3376:CoreTextField.kt#423gt5");
                            if ((i27 & 11) != 2 || !composer3.getSkipping()) {
                                Function3<Function2<? super Composer, ? super Integer, Unit>, Composer, Integer, Unit> function35 = function342;
                                final int i28 = i252;
                                final TextStyle textStyle6 = textStyle52;
                                final TextFieldScrollerPosition textFieldScrollerPosition22 = textFieldScrollerPosition2;
                                final TextFieldValue textFieldValue = value;
                                final VisualTransformation visualTransformation6 = visualTransformation42;
                                final Modifier modifier7 = cursor2;
                                final Modifier modifier8 = drawBehind2;
                                final Modifier modifier9 = onGloballyPositioned3;
                                final Modifier modifier10 = modifier62;
                                final BringIntoViewRequester bringIntoViewRequester4 = bringIntoViewRequester32;
                                final TextFieldState textFieldState22 = textFieldState2;
                                final TextFieldSelectionManager textFieldSelectionManager22 = textFieldSelectionManager2;
                                final boolean z22 = z202;
                                final boolean z23 = z212;
                                final Function1<? super TextLayoutResult, Unit> function15 = function142;
                                function35.invoke(ComposableLambdaKt.composableLambda(composer3, 207445534, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.foundation.text.CoreTextFieldKt$CoreTextField$5.1
                                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                    /* JADX WARN: Multi-variable type inference failed */
                                    {
                                        super(2);
                                    }

                                    @Override // kotlin.jvm.functions.Function2
                                    public /* bridge */ /* synthetic */ Unit invoke(Composer composer4, Integer num) {
                                        invoke(composer4, num.intValue());
                                        return Unit.INSTANCE;
                                    }

                                    public final void invoke(Composer composer4, int i29) {
                                        ComposerKt.sourceInformation(composer4, "C550@24083L2581:CoreTextField.kt#423gt5");
                                        if ((i29 & 11) != 2 || !composer4.getSkipping()) {
                                            Modifier maxLinesHeight = MaxLinesHeightModifierKt.maxLinesHeight(Modifier.INSTANCE, i28, textStyle6);
                                            TextFieldScrollerPosition textFieldScrollerPosition3 = textFieldScrollerPosition22;
                                            TextFieldValue textFieldValue2 = textFieldValue;
                                            VisualTransformation visualTransformation7 = visualTransformation6;
                                            final TextFieldState textFieldState3 = textFieldState22;
                                            Modifier bringIntoViewRequester5 = BringIntoViewRequesterKt.bringIntoViewRequester(TextFieldSizeKt.textFieldMinSize(TextFieldScrollKt.textFieldScroll(maxLinesHeight, textFieldScrollerPosition3, textFieldValue2, visualTransformation7, new Function0<TextLayoutResultProxy>() { // from class: androidx.compose.foundation.text.CoreTextFieldKt$CoreTextField$5$1$coreTextFieldModifier$1
                                                {
                                                    super(0);
                                                }

                                                /* JADX WARN: Can't rename method to resolve collision */
                                                @Override // kotlin.jvm.functions.Function0
                                                public final TextLayoutResultProxy invoke() {
                                                    return TextFieldState.this.getLayoutResult();
                                                }
                                            }).then(modifier7).then(modifier8), textStyle6).then(modifier9).then(modifier10), bringIntoViewRequester4);
                                            final TextFieldSelectionManager textFieldSelectionManager3 = textFieldSelectionManager22;
                                            final TextFieldState textFieldState4 = textFieldState22;
                                            final boolean z24 = z22;
                                            final boolean z25 = z23;
                                            final Function1<? super TextLayoutResult, Unit> function16 = function15;
                                            SimpleLayoutKt.SimpleLayout(bringIntoViewRequester5, ComposableLambdaKt.composableLambda(composer4, 19580180, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.foundation.text.CoreTextFieldKt.CoreTextField.5.1.1
                                                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                                /* JADX WARN: Multi-variable type inference failed */
                                                {
                                                    super(2);
                                                }

                                                @Override // kotlin.jvm.functions.Function2
                                                public /* bridge */ /* synthetic */ Unit invoke(Composer composer5, Integer num) {
                                                    invoke(composer5, num.intValue());
                                                    return Unit.INSTANCE;
                                                }

                                                public final void invoke(Composer composer5, int i30) {
                                                    ComposerKt.sourceInformation(composer5, "C551@24137L1909,591@26064L327,603@26592L40:CoreTextField.kt#423gt5");
                                                    if ((i30 & 11) != 2 || !composer5.getSkipping()) {
                                                        final TextFieldState textFieldState5 = textFieldState4;
                                                        final Function1<? super TextLayoutResult, Unit> function17 = function16;
                                                        MeasurePolicy measurePolicy = new MeasurePolicy() { // from class: androidx.compose.foundation.text.CoreTextFieldKt.CoreTextField.5.1.1.2
                                                            @Override // androidx.compose.ui.layout.MeasurePolicy
                                                            /* renamed from: measure-3p2s80s */
                                                            public MeasureResult mo15measure3p2s80s(MeasureScope measure, List<? extends Measurable> measurables, long j) {
                                                                Intrinsics.checkNotNullParameter(measure, "$this$measure");
                                                                Intrinsics.checkNotNullParameter(measurables, "measurables");
                                                                Snapshot.Companion companion3 = Snapshot.INSTANCE;
                                                                TextFieldState textFieldState6 = TextFieldState.this;
                                                                Snapshot createNonObservableSnapshot = companion3.createNonObservableSnapshot();
                                                                try {
                                                                    Snapshot makeCurrent = createNonObservableSnapshot.makeCurrent();
                                                                    try {
                                                                        TextLayoutResultProxy layoutResult = textFieldState6.getLayoutResult();
                                                                        TextLayoutResult value2 = layoutResult != null ? layoutResult.getValue() : null;
                                                                        createNonObservableSnapshot.dispose();
                                                                        Triple<Integer, Integer, TextLayoutResult> m748layout_EkL_Y$foundation_release = TextFieldDelegate.INSTANCE.m748layout_EkL_Y$foundation_release(TextFieldState.this.getTextDelegate(), j, measure.getLayoutDirection(), value2);
                                                                        int intValue = m748layout_EkL_Y$foundation_release.component1().intValue();
                                                                        int intValue2 = m748layout_EkL_Y$foundation_release.component2().intValue();
                                                                        TextLayoutResult component3 = m748layout_EkL_Y$foundation_release.component3();
                                                                        if (!Intrinsics.areEqual(value2, component3)) {
                                                                            TextFieldState.this.setLayoutResult(new TextLayoutResultProxy(component3));
                                                                            function17.invoke(component3);
                                                                        }
                                                                        return measure.layout(intValue, intValue2, MapsKt.mapOf(TuplesKt.to(AlignmentLineKt.getFirstBaseline(), Integer.valueOf(MathKt.roundToInt(component3.getFirstBaseline()))), TuplesKt.to(AlignmentLineKt.getLastBaseline(), Integer.valueOf(MathKt.roundToInt(component3.getLastBaseline())))), new Function1<Placeable.PlacementScope, Unit>() { // from class: androidx.compose.foundation.text.CoreTextFieldKt$CoreTextField$5$1$1$2$measure$1
                                                                            /* renamed from: invoke, reason: avoid collision after fix types in other method */
                                                                            public final void invoke2(Placeable.PlacementScope layout) {
                                                                                Intrinsics.checkNotNullParameter(layout, "$this$layout");
                                                                            }

                                                                            @Override // kotlin.jvm.functions.Function1
                                                                            public /* bridge */ /* synthetic */ Unit invoke(Placeable.PlacementScope placementScope) {
                                                                                invoke2(placementScope);
                                                                                return Unit.INSTANCE;
                                                                            }
                                                                        });
                                                                    } finally {
                                                                        createNonObservableSnapshot.restoreCurrent(makeCurrent);
                                                                    }
                                                                } catch (Throwable th) {
                                                                    createNonObservableSnapshot.dispose();
                                                                    throw th;
                                                                }
                                                            }

                                                            @Override // androidx.compose.ui.layout.MeasurePolicy
                                                            public int maxIntrinsicWidth(IntrinsicMeasureScope intrinsicMeasureScope, List<? extends IntrinsicMeasurable> measurables, int i31) {
                                                                Intrinsics.checkNotNullParameter(intrinsicMeasureScope, "<this>");
                                                                Intrinsics.checkNotNullParameter(measurables, "measurables");
                                                                TextFieldState.this.getTextDelegate().layoutIntrinsics(intrinsicMeasureScope.getLayoutDirection());
                                                                return TextFieldState.this.getTextDelegate().getMaxIntrinsicWidth();
                                                            }
                                                        };
                                                        composer5.startReplaceableGroup(-1323940314);
                                                        ComposerKt.sourceInformation(composer5, "C(Layout)P(!1,2)74@2915L7,75@2970L7,76@3029L7,77@3041L460:Layout.kt#80mrfh");
                                                        Modifier.Companion companion3 = Modifier.INSTANCE;
                                                        ProvidableCompositionLocal<Density> localDensity22 = CompositionLocalsKt.getLocalDensity();
                                                        ComposerKt.sourceInformationMarkerStart(composer5, 2023513938, "C:CompositionLocal.kt#9igjgp");
                                                        Object consume9 = composer5.consume(localDensity22);
                                                        ComposerKt.sourceInformationMarkerEnd(composer5);
                                                        Density density22 = (Density) consume9;
                                                        ProvidableCompositionLocal<LayoutDirection> localLayoutDirection = CompositionLocalsKt.getLocalLayoutDirection();
                                                        ComposerKt.sourceInformationMarkerStart(composer5, 2023513938, "C:CompositionLocal.kt#9igjgp");
                                                        Object consume10 = composer5.consume(localLayoutDirection);
                                                        ComposerKt.sourceInformationMarkerEnd(composer5);
                                                        LayoutDirection layoutDirection = (LayoutDirection) consume10;
                                                        ProvidableCompositionLocal<ViewConfiguration> localViewConfiguration = CompositionLocalsKt.getLocalViewConfiguration();
                                                        ComposerKt.sourceInformationMarkerStart(composer5, 2023513938, "C:CompositionLocal.kt#9igjgp");
                                                        Object consume11 = composer5.consume(localViewConfiguration);
                                                        ComposerKt.sourceInformationMarkerEnd(composer5);
                                                        ViewConfiguration viewConfiguration = (ViewConfiguration) consume11;
                                                        Function0<ComposeUiNode> constructor = ComposeUiNode.INSTANCE.getConstructor();
                                                        Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> materializerOf = LayoutKt.materializerOf(companion3);
                                                        if (!(composer5.getApplier() instanceof Applier)) {
                                                            ComposablesKt.invalidApplier();
                                                        }
                                                        composer5.startReusableNode();
                                                        if (composer5.getInserting()) {
                                                            composer5.createNode(constructor);
                                                        } else {
                                                            composer5.useNode();
                                                        }
                                                        composer5.disableReusing();
                                                        Composer m1283constructorimpl = Updater.m1283constructorimpl(composer5);
                                                        Updater.m1290setimpl(m1283constructorimpl, measurePolicy, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
                                                        Updater.m1290setimpl(m1283constructorimpl, density22, ComposeUiNode.INSTANCE.getSetDensity());
                                                        Updater.m1290setimpl(m1283constructorimpl, layoutDirection, ComposeUiNode.INSTANCE.getSetLayoutDirection());
                                                        Updater.m1290setimpl(m1283constructorimpl, viewConfiguration, ComposeUiNode.INSTANCE.getSetViewConfiguration());
                                                        composer5.enableReusing();
                                                        boolean z26 = false;
                                                        materializerOf.invoke(SkippableUpdater.m1273boximpl(SkippableUpdater.m1274constructorimpl(composer5)), composer5, 0);
                                                        composer5.startReplaceableGroup(2058660585);
                                                        composer5.startReplaceableGroup(1714611517);
                                                        ComposerKt.sourceInformation(composer5, "C:CoreTextField.kt#423gt5");
                                                        composer5.endReplaceableGroup();
                                                        composer5.endReplaceableGroup();
                                                        composer5.endNode();
                                                        composer5.endReplaceableGroup();
                                                        TextFieldSelectionManager textFieldSelectionManager4 = TextFieldSelectionManager.this;
                                                        if (textFieldState4.getHandleState() == HandleState.Selection && textFieldState4.getLayoutCoordinates() != null) {
                                                            LayoutCoordinates layoutCoordinates = textFieldState4.getLayoutCoordinates();
                                                            Intrinsics.checkNotNull(layoutCoordinates);
                                                            if (layoutCoordinates.isAttached() && z24) {
                                                                z26 = true;
                                                            }
                                                        }
                                                        CoreTextFieldKt.SelectionToolbarAndHandles(textFieldSelectionManager4, z26, composer5, 8);
                                                        if (textFieldState4.getHandleState() == HandleState.Cursor && !z25 && z24) {
                                                            CoreTextFieldKt.TextFieldCursorHandle(TextFieldSelectionManager.this, composer5, 8);
                                                            return;
                                                        }
                                                        return;
                                                    }
                                                    composer5.skipToGroupEnd();
                                                }
                                            }), composer4, 48, 0);
                                            return;
                                        }
                                        composer4.skipToGroupEnd();
                                    }
                                }), composer3, Integer.valueOf(((i262 >> 9) & 112) | 6));
                                return;
                            }
                            composer3.skipToGroupEnd();
                        }
                    };
                    composer2 = startRestartGroup;
                    CoreTextFieldRootBox(onGloballyPositioned22, textFieldSelectionManager2, ComposableLambdaKt.composableLambda(composer2, -1885146845, true, function22), composer2, 448);
                    textStyle3 = textStyle2;
                    imeOptions5 = imeOptions82;
                    function13 = function12;
                    brush3 = brush2;
                    z10 = z4;
                    keyboardActions3 = keyboardActions2;
                    z11 = z5;
                    function33 = function32;
                    mutableInteractionSource4 = mutableInteractionSource62;
                    i19 = i252;
                    z12 = z162;
                    modifier4 = modifier52;
                    visualTransformation3 = visualTransformation52;
                    endRestartGroup = composer2.endRestartGroup();
                    if (endRestartGroup == null) {
                    }
                }
                i15 = i4 & 8192;
                if (i15 == 0) {
                }
                i16 = i4 & 16384;
                if (i16 != 0) {
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
                if (i8 != 0) {
                }
                if (i9 != 0) {
                }
                if ((i4 & 128) != 0) {
                }
                if (i10 != 0) {
                }
                if (i11 != 0) {
                }
                if ((i4 & 1024) != 0) {
                }
                if (i13 != 0) {
                }
                if (i14 != 0) {
                }
                if (i15 != 0) {
                }
                if (i16 != 0) {
                }
                visualTransformation2 = none;
                imeOptions3 = imeOptions2;
                function12 = coreTextFieldKt$CoreTextField$1;
                mutableInteractionSource2 = mutableInteractionSource5;
                i18 = i24;
                textStyle2 = textStyle4;
                z6 = z14;
                startRestartGroup.endDefaults();
                final FocusRequester focusRequester22 = new FocusRequester();
                startRestartGroup.startReplaceableGroup(-55013392);
                ComposerKt.sourceInformation(startRestartGroup, "195@10897L7");
                if (z6) {
                }
                textInputService = null;
                startRestartGroup.endReplaceableGroup();
                ProvidableCompositionLocal<Density> localDensity22 = CompositionLocalsKt.getLocalDensity();
                ComposerKt.sourceInformationMarkerStart(startRestartGroup, 2023513938, "C:CompositionLocal.kt#9igjgp");
                Object consume222 = startRestartGroup.consume(localDensity22);
                ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                Density density22 = (Density) consume222;
                ProvidableCompositionLocal<FontFamily.Resolver> localFontFamilyResolver22 = CompositionLocalsKt.getLocalFontFamilyResolver();
                ComposerKt.sourceInformationMarkerStart(startRestartGroup, 2023513938, "C:CompositionLocal.kt#9igjgp");
                Object consume322 = startRestartGroup.consume(localFontFamilyResolver22);
                ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                FontFamily.Resolver resolver22 = (FontFamily.Resolver) consume322;
                ProvidableCompositionLocal<TextSelectionColors> localTextSelectionColors22 = TextSelectionColorsKt.getLocalTextSelectionColors();
                ComposerKt.sourceInformationMarkerStart(startRestartGroup, 2023513938, "C:CompositionLocal.kt#9igjgp");
                Object consume422 = startRestartGroup.consume(localTextSelectionColors22);
                ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                long backgroundColor22 = ((TextSelectionColors) consume422).getBackgroundColor();
                ProvidableCompositionLocal<FocusManager> localFocusManager22 = CompositionLocalsKt.getLocalFocusManager();
                ComposerKt.sourceInformationMarkerStart(startRestartGroup, 2023513938, "C:CompositionLocal.kt#9igjgp");
                Object consume522 = startRestartGroup.consume(localFocusManager22);
                ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                FocusManager focusManager22 = (FocusManager) consume522;
                if (i18 == 1) {
                }
                Object[] objArr22 = {orientation};
                Saver<TextFieldScrollerPosition, Object> saver22 = TextFieldScrollerPosition.INSTANCE.getSaver();
                Modifier modifier522 = modifier3;
                startRestartGroup.startReplaceableGroup(1157296644);
                ComposerKt.sourceInformation(startRestartGroup, "C(remember)P(1):Composables.kt#9igjgp");
                changed = startRestartGroup.changed(orientation);
                final int i2522 = i18;
                rememberedValue = startRestartGroup.rememberedValue();
                if (!changed) {
                }
                rememberedValue = (Function0) new Function0<TextFieldScrollerPosition>() { // from class: androidx.compose.foundation.text.CoreTextFieldKt$CoreTextField$scrollerPosition$1$1
                    {
                        super(0);
                    }

                    /* JADX WARN: Can't rename method to resolve collision */
                    @Override // kotlin.jvm.functions.Function0
                    public final TextFieldScrollerPosition invoke() {
                        return new TextFieldScrollerPosition(Orientation.this, 0.0f, 2, null);
                    }
                };
                startRestartGroup.updateRememberedValue(rememberedValue);
                startRestartGroup.endReplaceableGroup();
                final TextFieldScrollerPosition textFieldScrollerPosition22 = (TextFieldScrollerPosition) RememberSaveableKt.m1296rememberSaveable(objArr22, (Saver) saver22, (String) null, (Function0) rememberedValue, startRestartGroup, 72, 4);
                startRestartGroup.startReplaceableGroup(511388516);
                ComposerKt.sourceInformation(startRestartGroup, "C(remember)P(1,2):Composables.kt#9igjgp");
                changed2 = startRestartGroup.changed(value) | startRestartGroup.changed(visualTransformation2);
                rememberedValue2 = startRestartGroup.rememberedValue();
                if (changed2) {
                }
                TransformedText filter22 = visualTransformation2.filter(value.getAnnotatedString());
                composition = value.getComposition();
                z7 = z6;
                imeOptions4 = imeOptions3;
                if (composition != null) {
                }
                rememberedValue2 = filter22;
                startRestartGroup.updateRememberedValue(rememberedValue2);
                startRestartGroup.endReplaceableGroup();
                final TransformedText transformedText22 = (TransformedText) rememberedValue2;
                AnnotatedString text22 = transformedText22.getText();
                final OffsetMapping offsetMapping22 = transformedText22.getOffsetMapping();
                RecomposeScope currentRecomposeScope22 = ComposablesKt.getCurrentRecomposeScope(startRestartGroup, 0);
                startRestartGroup.startReplaceableGroup(-492369756);
                ComposerKt.sourceInformation(startRestartGroup, "C(remember):Composables.kt#9igjgp");
                final int i2622 = i17;
                rememberedValue3 = startRestartGroup.rememberedValue();
                if (rememberedValue3 == Composer.INSTANCE.getEmpty()) {
                }
                startRestartGroup.endReplaceableGroup();
                final TextFieldState textFieldState22 = (TextFieldState) rememberedValue3;
                textFieldState22.m763updateaKPrnQ(text22, textStyle2, z4, density22, resolver22, onValueChange, keyboardActions2, focusManager22, backgroundColor22);
                textFieldState22.getProcessor().reset(value, textFieldState22.getInputSession());
                startRestartGroup.startReplaceableGroup(-492369756);
                ComposerKt.sourceInformation(startRestartGroup, "C(remember):Composables.kt#9igjgp");
                rememberedValue4 = startRestartGroup.rememberedValue();
                if (rememberedValue4 == Composer.INSTANCE.getEmpty()) {
                }
                startRestartGroup.endReplaceableGroup();
                UndoManager undoManager22 = (UndoManager) rememberedValue4;
                UndoManager.snapshotIfNeeded$default(undoManager22, value, 0L, 2, null);
                startRestartGroup.startReplaceableGroup(-492369756);
                ComposerKt.sourceInformation(startRestartGroup, "C(remember):Composables.kt#9igjgp");
                rememberedValue5 = startRestartGroup.rememberedValue();
                if (rememberedValue5 == Composer.INSTANCE.getEmpty()) {
                }
                startRestartGroup.endReplaceableGroup();
                final TextFieldSelectionManager textFieldSelectionManager22 = (TextFieldSelectionManager) rememberedValue5;
                textFieldSelectionManager22.setOffsetMapping$foundation_release(offsetMapping22);
                textFieldSelectionManager22.setVisualTransformation$foundation_release(visualTransformation2);
                textFieldSelectionManager22.setOnValueChange$foundation_release(textFieldState22.getOnValueChange());
                textFieldSelectionManager22.setState$foundation_release(textFieldState22);
                textFieldSelectionManager22.setValue$foundation_release(value);
                ProvidableCompositionLocal<ClipboardManager> localClipboardManager22 = CompositionLocalsKt.getLocalClipboardManager();
                ComposerKt.sourceInformationMarkerStart(startRestartGroup, 2023513938, "C:CompositionLocal.kt#9igjgp");
                Object consume622 = startRestartGroup.consume(localClipboardManager22);
                ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                textFieldSelectionManager22.setClipboardManager$foundation_release((ClipboardManager) consume622);
                ProvidableCompositionLocal<TextToolbar> localTextToolbar22 = CompositionLocalsKt.getLocalTextToolbar();
                ComposerKt.sourceInformationMarkerStart(startRestartGroup, 2023513938, "C:CompositionLocal.kt#9igjgp");
                Object consume722 = startRestartGroup.consume(localTextToolbar22);
                ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                textFieldSelectionManager22.setTextToolbar((TextToolbar) consume722);
                ProvidableCompositionLocal<HapticFeedback> localHapticFeedback22 = CompositionLocalsKt.getLocalHapticFeedback();
                ComposerKt.sourceInformationMarkerStart(startRestartGroup, 2023513938, "C:CompositionLocal.kt#9igjgp");
                Object consume822 = startRestartGroup.consume(localHapticFeedback22);
                ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                textFieldSelectionManager22.setHapticFeedBack((HapticFeedback) consume822);
                textFieldSelectionManager22.setFocusRequester(focusRequester22);
                textFieldSelectionManager22.setEditable(!z5);
                startRestartGroup.startReplaceableGroup(773894976);
                ComposerKt.sourceInformation(startRestartGroup, "C(rememberCoroutineScope)475@19849L144:Effects.kt#9igjgp");
                startRestartGroup.startReplaceableGroup(-492369756);
                ComposerKt.sourceInformation(startRestartGroup, "C(remember):Composables.kt#9igjgp");
                rememberedValue6 = startRestartGroup.rememberedValue();
                if (rememberedValue6 == Composer.INSTANCE.getEmpty()) {
                }
                startRestartGroup.endReplaceableGroup();
                final CoroutineScope coroutineScope22 = ((CompositionScopedCoroutineScopeCanceller) rememberedValue6).getCoroutineScope();
                startRestartGroup.endReplaceableGroup();
                startRestartGroup.startReplaceableGroup(-492369756);
                ComposerKt.sourceInformation(startRestartGroup, "C(remember):Composables.kt#9igjgp");
                rememberedValue7 = startRestartGroup.rememberedValue();
                if (rememberedValue7 == Composer.INSTANCE.getEmpty()) {
                }
                startRestartGroup.endReplaceableGroup();
                final BringIntoViewRequester bringIntoViewRequester222 = (BringIntoViewRequester) rememberedValue7;
                final TextInputService textInputService222 = textInputService;
                final ImeOptions imeOptions622 = imeOptions4;
                final boolean z1622 = z7;
                Modifier textFieldFocusModifier22 = TextFieldGestureModifiersKt.textFieldFocusModifier(Modifier.INSTANCE, z1622, focusRequester22, mutableInteractionSource2, new Function1<FocusState, Unit>() { // from class: androidx.compose.foundation.text.CoreTextFieldKt$CoreTextField$focusModifier$1
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(1);
                    }

                    @Override // kotlin.jvm.functions.Function1
                    public /* bridge */ /* synthetic */ Unit invoke(FocusState focusState) {
                        invoke2(focusState);
                        return Unit.INSTANCE;
                    }

                    /* renamed from: invoke, reason: avoid collision after fix types in other method */
                    public final void invoke2(FocusState it) {
                        TextLayoutResultProxy layoutResult;
                        Intrinsics.checkNotNullParameter(it, "it");
                        if (TextFieldState.this.getHasFocus() == it.isFocused()) {
                            return;
                        }
                        TextFieldState.this.setHasFocus(it.isFocused());
                        TextInputService textInputService3 = textInputService222;
                        if (textInputService3 != null) {
                            CoreTextFieldKt.notifyTextInputServiceOnFocusChange(textInputService3, TextFieldState.this, value, imeOptions622);
                            if (it.isFocused() && (layoutResult = TextFieldState.this.getLayoutResult()) != null) {
                                BuildersKt__Builders_commonKt.launch$default(coroutineScope22, null, null, new CoreTextFieldKt$CoreTextField$focusModifier$1$1$1(bringIntoViewRequester222, value, TextFieldState.this, layoutResult, offsetMapping22, null), 3, null);
                            }
                        }
                        if (it.isFocused()) {
                            return;
                        }
                        TextFieldSelectionManager.m860deselect_kEHs6E$foundation_release$default(textFieldSelectionManager22, null, 1, null);
                    }
                });
                EffectsKt.DisposableEffect(textFieldState22, new Function1<DisposableEffectScope, DisposableEffectResult>() { // from class: androidx.compose.foundation.text.CoreTextFieldKt$CoreTextField$2
                    {
                        super(1);
                    }

                    @Override // kotlin.jvm.functions.Function1
                    public final DisposableEffectResult invoke(DisposableEffectScope DisposableEffect) {
                        Intrinsics.checkNotNullParameter(DisposableEffect, "$this$DisposableEffect");
                        final TextFieldState textFieldState222 = TextFieldState.this;
                        return new DisposableEffectResult() { // from class: androidx.compose.foundation.text.CoreTextFieldKt$CoreTextField$2$invoke$$inlined$onDispose$1
                            @Override // androidx.compose.runtime.DisposableEffectResult
                            public void dispose() {
                                if (TextFieldState.this.getHasFocus()) {
                                    CoreTextFieldKt.onBlur(TextFieldState.this);
                                }
                            }
                        };
                    }
                }, startRestartGroup, 8);
                if (TouchMode_androidKt.isInTouchMode()) {
                }
                final Modifier drawBehind22 = DrawModifierKt.drawBehind(Modifier.INSTANCE, new Function1<DrawScope, Unit>() { // from class: androidx.compose.foundation.text.CoreTextFieldKt$CoreTextField$drawModifier$1
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(1);
                    }

                    @Override // kotlin.jvm.functions.Function1
                    public /* bridge */ /* synthetic */ Unit invoke(DrawScope drawScope) {
                        invoke2(drawScope);
                        return Unit.INSTANCE;
                    }

                    /* renamed from: invoke, reason: avoid collision after fix types in other method */
                    public final void invoke2(DrawScope drawBehind222) {
                        Intrinsics.checkNotNullParameter(drawBehind222, "$this$drawBehind");
                        TextLayoutResultProxy layoutResult = TextFieldState.this.getLayoutResult();
                        if (layoutResult != null) {
                            TextFieldValue textFieldValue = value;
                            OffsetMapping offsetMapping222 = offsetMapping22;
                            TextFieldState textFieldState222 = TextFieldState.this;
                            TextFieldDelegate.INSTANCE.draw$foundation_release(drawBehind222.getDrawContext().getCanvas(), textFieldValue, offsetMapping222, layoutResult.getValue(), textFieldState222.getSelectionPaint());
                        }
                    }
                });
                final Modifier onGloballyPositioned32 = OnGloballyPositionedModifierKt.onGloballyPositioned(Modifier.INSTANCE, new Function1<LayoutCoordinates, Unit>() { // from class: androidx.compose.foundation.text.CoreTextFieldKt$CoreTextField$onPositionedModifier$1
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(1);
                    }

                    @Override // kotlin.jvm.functions.Function1
                    public /* bridge */ /* synthetic */ Unit invoke(LayoutCoordinates layoutCoordinates) {
                        invoke2(layoutCoordinates);
                        return Unit.INSTANCE;
                    }

                    /* renamed from: invoke, reason: avoid collision after fix types in other method */
                    public final void invoke2(LayoutCoordinates it) {
                        Intrinsics.checkNotNullParameter(it, "it");
                        TextFieldState.this.setLayoutCoordinates(it);
                        if (z1622) {
                            if (TextFieldState.this.getHandleState() == HandleState.Selection) {
                                if (TextFieldState.this.getShowFloatingToolbar()) {
                                    textFieldSelectionManager22.showSelectionToolbar$foundation_release();
                                } else {
                                    textFieldSelectionManager22.hideSelectionToolbar$foundation_release();
                                }
                                TextFieldState.this.setShowSelectionHandleStart(TextFieldSelectionManagerKt.isSelectionHandleInVisibleBound(textFieldSelectionManager22, true));
                                TextFieldState.this.setShowSelectionHandleEnd(TextFieldSelectionManagerKt.isSelectionHandleInVisibleBound(textFieldSelectionManager22, false));
                            } else if (TextFieldState.this.getHandleState() == HandleState.Cursor) {
                                TextFieldState.this.setShowCursorHandle(TextFieldSelectionManagerKt.isSelectionHandleInVisibleBound(textFieldSelectionManager22, true));
                            }
                        }
                        TextLayoutResultProxy layoutResult = TextFieldState.this.getLayoutResult();
                        if (layoutResult == null) {
                            return;
                        }
                        layoutResult.setInnerTextFieldCoordinates(it);
                    }
                });
                final boolean z1822 = visualTransformation2 instanceof PasswordVisualTransformation;
                final ImeOptions imeOptions722 = imeOptions4;
                final boolean z1922 = z5;
                Modifier semantics22 = SemanticsModifierKt.semantics(Modifier.INSTANCE, true, new Function1<SemanticsPropertyReceiver, Unit>() { // from class: androidx.compose.foundation.text.CoreTextFieldKt$CoreTextField$semanticsModifier$1
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(1);
                    }

                    @Override // kotlin.jvm.functions.Function1
                    public /* bridge */ /* synthetic */ Unit invoke(SemanticsPropertyReceiver semanticsPropertyReceiver) {
                        invoke2(semanticsPropertyReceiver);
                        return Unit.INSTANCE;
                    }

                    /* renamed from: invoke, reason: avoid collision after fix types in other method */
                    public final void invoke2(SemanticsPropertyReceiver semantics222) {
                        Intrinsics.checkNotNullParameter(semantics222, "$this$semantics");
                        SemanticsPropertiesKt.m3395setImeAction4L7nppU(semantics222, ImeOptions.this.getImeAction());
                        SemanticsPropertiesKt.setEditableText(semantics222, transformedText22.getText());
                        SemanticsPropertiesKt.m3398setTextSelectionRangeFDrldGo(semantics222, value.getSelection());
                        if (!z1622) {
                            SemanticsPropertiesKt.disabled(semantics222);
                        }
                        if (z1822) {
                            SemanticsPropertiesKt.password(semantics222);
                        }
                        final TextFieldState textFieldState222 = textFieldState22;
                        SemanticsPropertiesKt.getTextLayoutResult$default(semantics222, null, new Function1<List<TextLayoutResult>, Boolean>() { // from class: androidx.compose.foundation.text.CoreTextFieldKt$CoreTextField$semanticsModifier$1.1
                            {
                                super(1);
                            }

                            @Override // kotlin.jvm.functions.Function1
                            public final Boolean invoke(List<TextLayoutResult> it) {
                                boolean z2022;
                                Intrinsics.checkNotNullParameter(it, "it");
                                if (TextFieldState.this.getLayoutResult() != null) {
                                    TextLayoutResultProxy layoutResult = TextFieldState.this.getLayoutResult();
                                    Intrinsics.checkNotNull(layoutResult);
                                    it.add(layoutResult.getValue());
                                    z2022 = true;
                                } else {
                                    z2022 = false;
                                }
                                return Boolean.valueOf(z2022);
                            }
                        }, 1, null);
                        final TextFieldState textFieldState3 = textFieldState22;
                        SemanticsPropertiesKt.setText$default(semantics222, null, new Function1<AnnotatedString, Boolean>() { // from class: androidx.compose.foundation.text.CoreTextFieldKt$CoreTextField$semanticsModifier$1.2
                            {
                                super(1);
                            }

                            @Override // kotlin.jvm.functions.Function1
                            public final Boolean invoke(AnnotatedString it) {
                                Intrinsics.checkNotNullParameter(it, "it");
                                TextFieldState.this.getOnValueChange().invoke(new TextFieldValue(it.getText(), TextRangeKt.TextRange(it.getText().length()), (TextRange) null, 4, (DefaultConstructorMarker) null));
                                return true;
                            }
                        }, 1, null);
                        final OffsetMapping offsetMapping222 = offsetMapping22;
                        final boolean z2022 = z1622;
                        final TextFieldValue textFieldValue = value;
                        final TextFieldSelectionManager textFieldSelectionManager222 = textFieldSelectionManager22;
                        final TextFieldState textFieldState4 = textFieldState22;
                        SemanticsPropertiesKt.setSelection$default(semantics222, null, new Function3<Integer, Integer, Boolean, Boolean>() { // from class: androidx.compose.foundation.text.CoreTextFieldKt$CoreTextField$semanticsModifier$1.3
                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            {
                                super(3);
                            }

                            @Override // kotlin.jvm.functions.Function3
                            public /* bridge */ /* synthetic */ Boolean invoke(Integer num, Integer num2, Boolean bool) {
                                return invoke(num.intValue(), num2.intValue(), bool.booleanValue());
                            }

                            public final Boolean invoke(int i27, int i28, boolean z2122) {
                                if (!z2122) {
                                    i27 = OffsetMapping.this.transformedToOriginal(i27);
                                }
                                if (!z2122) {
                                    i28 = OffsetMapping.this.transformedToOriginal(i28);
                                }
                                boolean z22 = false;
                                if (z2022 && (i27 != TextRange.m3486getStartimpl(textFieldValue.getSelection()) || i28 != TextRange.m3481getEndimpl(textFieldValue.getSelection()))) {
                                    if (RangesKt.coerceAtMost(i27, i28) >= 0 && RangesKt.coerceAtLeast(i27, i28) <= textFieldValue.getAnnotatedString().length()) {
                                        if (z2122 || i27 == i28) {
                                            textFieldSelectionManager222.exitSelectionMode$foundation_release();
                                        } else {
                                            textFieldSelectionManager222.enterSelectionMode$foundation_release();
                                        }
                                        textFieldState4.getOnValueChange().invoke(new TextFieldValue(textFieldValue.getAnnotatedString(), TextRangeKt.TextRange(i27, i28), (TextRange) null, 4, (DefaultConstructorMarker) null));
                                        z22 = true;
                                    } else {
                                        textFieldSelectionManager222.exitSelectionMode$foundation_release();
                                    }
                                }
                                return Boolean.valueOf(z22);
                            }
                        }, 1, null);
                        final TextFieldState textFieldState5 = textFieldState22;
                        final FocusRequester focusRequester222 = focusRequester22;
                        final boolean z2122 = z1922;
                        SemanticsPropertiesKt.onClick$default(semantics222, null, new Function0<Boolean>() { // from class: androidx.compose.foundation.text.CoreTextFieldKt$CoreTextField$semanticsModifier$1.4
                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            {
                                super(0);
                            }

                            /* JADX WARN: Can't rename method to resolve collision */
                            @Override // kotlin.jvm.functions.Function0
                            public final Boolean invoke() {
                                CoreTextFieldKt.tapToFocus(TextFieldState.this, focusRequester222, !z2122);
                                return true;
                            }
                        }, 1, null);
                        final TextFieldSelectionManager textFieldSelectionManager3 = textFieldSelectionManager22;
                        SemanticsPropertiesKt.onLongClick$default(semantics222, null, new Function0<Boolean>() { // from class: androidx.compose.foundation.text.CoreTextFieldKt$CoreTextField$semanticsModifier$1.5
                            {
                                super(0);
                            }

                            /* JADX WARN: Can't rename method to resolve collision */
                            @Override // kotlin.jvm.functions.Function0
                            public final Boolean invoke() {
                                TextFieldSelectionManager.this.enterSelectionMode$foundation_release();
                                return true;
                            }
                        }, 1, null);
                        if (!TextRange.m3480getCollapsedimpl(value.getSelection()) && !z1822) {
                            final TextFieldSelectionManager textFieldSelectionManager4 = textFieldSelectionManager22;
                            SemanticsPropertiesKt.copyText$default(semantics222, null, new Function0<Boolean>() { // from class: androidx.compose.foundation.text.CoreTextFieldKt$CoreTextField$semanticsModifier$1.6
                                {
                                    super(0);
                                }

                                /* JADX WARN: Can't rename method to resolve collision */
                                @Override // kotlin.jvm.functions.Function0
                                public final Boolean invoke() {
                                    TextFieldSelectionManager.copy$foundation_release$default(TextFieldSelectionManager.this, false, 1, null);
                                    return true;
                                }
                            }, 1, null);
                            if (z1622 && !z1922) {
                                final TextFieldSelectionManager textFieldSelectionManager5 = textFieldSelectionManager22;
                                SemanticsPropertiesKt.cutText$default(semantics222, null, new Function0<Boolean>() { // from class: androidx.compose.foundation.text.CoreTextFieldKt$CoreTextField$semanticsModifier$1.7
                                    {
                                        super(0);
                                    }

                                    /* JADX WARN: Can't rename method to resolve collision */
                                    @Override // kotlin.jvm.functions.Function0
                                    public final Boolean invoke() {
                                        TextFieldSelectionManager.this.cut$foundation_release();
                                        return true;
                                    }
                                }, 1, null);
                            }
                        }
                        if (!z1622 || z1922) {
                            return;
                        }
                        final TextFieldSelectionManager textFieldSelectionManager6 = textFieldSelectionManager22;
                        SemanticsPropertiesKt.pasteText$default(semantics222, null, new Function0<Boolean>() { // from class: androidx.compose.foundation.text.CoreTextFieldKt$CoreTextField$semanticsModifier$1.8
                            {
                                super(0);
                            }

                            /* JADX WARN: Can't rename method to resolve collision */
                            @Override // kotlin.jvm.functions.Function0
                            public final Boolean invoke() {
                                TextFieldSelectionManager.this.paste$foundation_release();
                                return true;
                            }
                        }, 1, null);
                    }
                });
                final Modifier cursor22 = TextFieldCursorKt.cursor(Modifier.INSTANCE, textFieldState22, value, offsetMapping22, brush2, (z1622 || z5) ? z8 : true);
                EffectsKt.DisposableEffect(textFieldSelectionManager22, new Function1<DisposableEffectScope, DisposableEffectResult>() { // from class: androidx.compose.foundation.text.CoreTextFieldKt$CoreTextField$3
                    {
                        super(1);
                    }

                    @Override // kotlin.jvm.functions.Function1
                    public final DisposableEffectResult invoke(DisposableEffectScope DisposableEffect) {
                        Intrinsics.checkNotNullParameter(DisposableEffect, "$this$DisposableEffect");
                        final TextFieldSelectionManager textFieldSelectionManager222 = TextFieldSelectionManager.this;
                        return new DisposableEffectResult() { // from class: androidx.compose.foundation.text.CoreTextFieldKt$CoreTextField$3$invoke$$inlined$onDispose$1
                            @Override // androidx.compose.runtime.DisposableEffectResult
                            public void dispose() {
                                TextFieldSelectionManager.this.hideSelectionToolbar$foundation_release();
                            }
                        };
                    }
                }, startRestartGroup, 8);
                final ImeOptions imeOptions822 = imeOptions4;
                EffectsKt.DisposableEffect(imeOptions822, new Function1<DisposableEffectScope, DisposableEffectResult>() { // from class: androidx.compose.foundation.text.CoreTextFieldKt$CoreTextField$4
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(1);
                    }

                    @Override // kotlin.jvm.functions.Function1
                    public final DisposableEffectResult invoke(DisposableEffectScope DisposableEffect) {
                        Intrinsics.checkNotNullParameter(DisposableEffect, "$this$DisposableEffect");
                        if (TextInputService.this != null && textFieldState22.getHasFocus()) {
                            textFieldState22.setInputSession(TextFieldDelegate.INSTANCE.restartInput$foundation_release(TextInputService.this, value, textFieldState22.getProcessor(), imeOptions822, textFieldState22.getOnValueChange(), textFieldState22.getOnImeActionPerformed()));
                        }
                        return new DisposableEffectResult() { // from class: androidx.compose.foundation.text.CoreTextFieldKt$CoreTextField$4$invoke$$inlined$onDispose$1
                            @Override // androidx.compose.runtime.DisposableEffectResult
                            public void dispose() {
                            }
                        };
                    }
                }, startRestartGroup, i2622 & 14);
                MutableInteractionSource mutableInteractionSource622 = mutableInteractionSource3;
                Modifier onGloballyPositioned222 = OnGloballyPositionedModifierKt.onGloballyPositioned(TextFieldScrollKt.textFieldScrollable(previewKeyEventToDeselectOnBack(modifier522.then(textFieldFocusModifier22), textFieldState22, textFieldSelectionManager22).then(TextFieldKeyInputKt.textFieldKeyInput(Modifier.INSTANCE, textFieldState22, textFieldSelectionManager22, value, textFieldState22.getOnValueChange(), !z5, i2522 == 1, offsetMapping22, undoManager22)), textFieldScrollerPosition22, mutableInteractionSource622, z1622).then(pointerHoverIcon$default).then(semantics22), new Function1<LayoutCoordinates, Unit>() { // from class: androidx.compose.foundation.text.CoreTextFieldKt$CoreTextField$decorationBoxModifier$1
                    {
                        super(1);
                    }

                    @Override // kotlin.jvm.functions.Function1
                    public /* bridge */ /* synthetic */ Unit invoke(LayoutCoordinates layoutCoordinates) {
                        invoke2(layoutCoordinates);
                        return Unit.INSTANCE;
                    }

                    /* renamed from: invoke, reason: avoid collision after fix types in other method */
                    public final void invoke2(LayoutCoordinates it) {
                        Intrinsics.checkNotNullParameter(it, "it");
                        TextLayoutResultProxy layoutResult = TextFieldState.this.getLayoutResult();
                        if (layoutResult == null) {
                            return;
                        }
                        layoutResult.setDecorationBoxCoordinates(it);
                    }
                });
                if (z1622) {
                }
                if (z9) {
                }
                final Modifier modifier622 = companion;
                final Function3<? super Function2<? super Composer, ? super Integer, Unit>, ? super Composer, ? super Integer, Unit> function3422 = function32;
                final TextStyle textStyle522 = textStyle2;
                final VisualTransformation visualTransformation422 = visualTransformation2;
                final BringIntoViewRequester bringIntoViewRequester322 = bringIntoViewRequester;
                VisualTransformation visualTransformation522 = visualTransformation2;
                final boolean z2022 = z9;
                final boolean z2122 = z5;
                final Function1<? super TextLayoutResult, Unit> function1422 = function12;
                Function2<Composer, Integer, Unit> function222 = new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.foundation.text.CoreTextFieldKt$CoreTextField$5
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

                    public final void invoke(Composer composer3, int i27) {
                        ComposerKt.sourceInformation(composer3, "C532@23298L3376:CoreTextField.kt#423gt5");
                        if ((i27 & 11) != 2 || !composer3.getSkipping()) {
                            Function3<Function2<? super Composer, ? super Integer, Unit>, Composer, Integer, Unit> function35 = function3422;
                            final int i28 = i2522;
                            final TextStyle textStyle6 = textStyle522;
                            final TextFieldScrollerPosition textFieldScrollerPosition222 = textFieldScrollerPosition22;
                            final TextFieldValue textFieldValue = value;
                            final VisualTransformation visualTransformation6 = visualTransformation422;
                            final Modifier modifier7 = cursor22;
                            final Modifier modifier8 = drawBehind22;
                            final Modifier modifier9 = onGloballyPositioned32;
                            final Modifier modifier10 = modifier622;
                            final BringIntoViewRequester bringIntoViewRequester4 = bringIntoViewRequester322;
                            final TextFieldState textFieldState222 = textFieldState22;
                            final TextFieldSelectionManager textFieldSelectionManager222 = textFieldSelectionManager22;
                            final boolean z22 = z2022;
                            final boolean z23 = z2122;
                            final Function1<? super TextLayoutResult, Unit> function15 = function1422;
                            function35.invoke(ComposableLambdaKt.composableLambda(composer3, 207445534, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.foundation.text.CoreTextFieldKt$CoreTextField$5.1
                                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                /* JADX WARN: Multi-variable type inference failed */
                                {
                                    super(2);
                                }

                                @Override // kotlin.jvm.functions.Function2
                                public /* bridge */ /* synthetic */ Unit invoke(Composer composer4, Integer num) {
                                    invoke(composer4, num.intValue());
                                    return Unit.INSTANCE;
                                }

                                public final void invoke(Composer composer4, int i29) {
                                    ComposerKt.sourceInformation(composer4, "C550@24083L2581:CoreTextField.kt#423gt5");
                                    if ((i29 & 11) != 2 || !composer4.getSkipping()) {
                                        Modifier maxLinesHeight = MaxLinesHeightModifierKt.maxLinesHeight(Modifier.INSTANCE, i28, textStyle6);
                                        TextFieldScrollerPosition textFieldScrollerPosition3 = textFieldScrollerPosition222;
                                        TextFieldValue textFieldValue2 = textFieldValue;
                                        VisualTransformation visualTransformation7 = visualTransformation6;
                                        final TextFieldState textFieldState3 = textFieldState222;
                                        Modifier bringIntoViewRequester5 = BringIntoViewRequesterKt.bringIntoViewRequester(TextFieldSizeKt.textFieldMinSize(TextFieldScrollKt.textFieldScroll(maxLinesHeight, textFieldScrollerPosition3, textFieldValue2, visualTransformation7, new Function0<TextLayoutResultProxy>() { // from class: androidx.compose.foundation.text.CoreTextFieldKt$CoreTextField$5$1$coreTextFieldModifier$1
                                            {
                                                super(0);
                                            }

                                            /* JADX WARN: Can't rename method to resolve collision */
                                            @Override // kotlin.jvm.functions.Function0
                                            public final TextLayoutResultProxy invoke() {
                                                return TextFieldState.this.getLayoutResult();
                                            }
                                        }).then(modifier7).then(modifier8), textStyle6).then(modifier9).then(modifier10), bringIntoViewRequester4);
                                        final TextFieldSelectionManager textFieldSelectionManager3 = textFieldSelectionManager222;
                                        final TextFieldState textFieldState4 = textFieldState222;
                                        final boolean z24 = z22;
                                        final boolean z25 = z23;
                                        final Function1<? super TextLayoutResult, Unit> function16 = function15;
                                        SimpleLayoutKt.SimpleLayout(bringIntoViewRequester5, ComposableLambdaKt.composableLambda(composer4, 19580180, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.foundation.text.CoreTextFieldKt.CoreTextField.5.1.1
                                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                            /* JADX WARN: Multi-variable type inference failed */
                                            {
                                                super(2);
                                            }

                                            @Override // kotlin.jvm.functions.Function2
                                            public /* bridge */ /* synthetic */ Unit invoke(Composer composer5, Integer num) {
                                                invoke(composer5, num.intValue());
                                                return Unit.INSTANCE;
                                            }

                                            public final void invoke(Composer composer5, int i30) {
                                                ComposerKt.sourceInformation(composer5, "C551@24137L1909,591@26064L327,603@26592L40:CoreTextField.kt#423gt5");
                                                if ((i30 & 11) != 2 || !composer5.getSkipping()) {
                                                    final TextFieldState textFieldState5 = textFieldState4;
                                                    final Function1<? super TextLayoutResult, Unit> function17 = function16;
                                                    MeasurePolicy measurePolicy = new MeasurePolicy() { // from class: androidx.compose.foundation.text.CoreTextFieldKt.CoreTextField.5.1.1.2
                                                        @Override // androidx.compose.ui.layout.MeasurePolicy
                                                        /* renamed from: measure-3p2s80s */
                                                        public MeasureResult mo15measure3p2s80s(MeasureScope measure, List<? extends Measurable> measurables, long j) {
                                                            Intrinsics.checkNotNullParameter(measure, "$this$measure");
                                                            Intrinsics.checkNotNullParameter(measurables, "measurables");
                                                            Snapshot.Companion companion3 = Snapshot.INSTANCE;
                                                            TextFieldState textFieldState6 = TextFieldState.this;
                                                            Snapshot createNonObservableSnapshot = companion3.createNonObservableSnapshot();
                                                            try {
                                                                Snapshot makeCurrent = createNonObservableSnapshot.makeCurrent();
                                                                try {
                                                                    TextLayoutResultProxy layoutResult = textFieldState6.getLayoutResult();
                                                                    TextLayoutResult value2 = layoutResult != null ? layoutResult.getValue() : null;
                                                                    createNonObservableSnapshot.dispose();
                                                                    Triple<Integer, Integer, TextLayoutResult> m748layout_EkL_Y$foundation_release = TextFieldDelegate.INSTANCE.m748layout_EkL_Y$foundation_release(TextFieldState.this.getTextDelegate(), j, measure.getLayoutDirection(), value2);
                                                                    int intValue = m748layout_EkL_Y$foundation_release.component1().intValue();
                                                                    int intValue2 = m748layout_EkL_Y$foundation_release.component2().intValue();
                                                                    TextLayoutResult component3 = m748layout_EkL_Y$foundation_release.component3();
                                                                    if (!Intrinsics.areEqual(value2, component3)) {
                                                                        TextFieldState.this.setLayoutResult(new TextLayoutResultProxy(component3));
                                                                        function17.invoke(component3);
                                                                    }
                                                                    return measure.layout(intValue, intValue2, MapsKt.mapOf(TuplesKt.to(AlignmentLineKt.getFirstBaseline(), Integer.valueOf(MathKt.roundToInt(component3.getFirstBaseline()))), TuplesKt.to(AlignmentLineKt.getLastBaseline(), Integer.valueOf(MathKt.roundToInt(component3.getLastBaseline())))), new Function1<Placeable.PlacementScope, Unit>() { // from class: androidx.compose.foundation.text.CoreTextFieldKt$CoreTextField$5$1$1$2$measure$1
                                                                        /* renamed from: invoke, reason: avoid collision after fix types in other method */
                                                                        public final void invoke2(Placeable.PlacementScope layout) {
                                                                            Intrinsics.checkNotNullParameter(layout, "$this$layout");
                                                                        }

                                                                        @Override // kotlin.jvm.functions.Function1
                                                                        public /* bridge */ /* synthetic */ Unit invoke(Placeable.PlacementScope placementScope) {
                                                                            invoke2(placementScope);
                                                                            return Unit.INSTANCE;
                                                                        }
                                                                    });
                                                                } finally {
                                                                    createNonObservableSnapshot.restoreCurrent(makeCurrent);
                                                                }
                                                            } catch (Throwable th) {
                                                                createNonObservableSnapshot.dispose();
                                                                throw th;
                                                            }
                                                        }

                                                        @Override // androidx.compose.ui.layout.MeasurePolicy
                                                        public int maxIntrinsicWidth(IntrinsicMeasureScope intrinsicMeasureScope, List<? extends IntrinsicMeasurable> measurables, int i31) {
                                                            Intrinsics.checkNotNullParameter(intrinsicMeasureScope, "<this>");
                                                            Intrinsics.checkNotNullParameter(measurables, "measurables");
                                                            TextFieldState.this.getTextDelegate().layoutIntrinsics(intrinsicMeasureScope.getLayoutDirection());
                                                            return TextFieldState.this.getTextDelegate().getMaxIntrinsicWidth();
                                                        }
                                                    };
                                                    composer5.startReplaceableGroup(-1323940314);
                                                    ComposerKt.sourceInformation(composer5, "C(Layout)P(!1,2)74@2915L7,75@2970L7,76@3029L7,77@3041L460:Layout.kt#80mrfh");
                                                    Modifier.Companion companion3 = Modifier.INSTANCE;
                                                    ProvidableCompositionLocal<Density> localDensity222 = CompositionLocalsKt.getLocalDensity();
                                                    ComposerKt.sourceInformationMarkerStart(composer5, 2023513938, "C:CompositionLocal.kt#9igjgp");
                                                    Object consume9 = composer5.consume(localDensity222);
                                                    ComposerKt.sourceInformationMarkerEnd(composer5);
                                                    Density density222 = (Density) consume9;
                                                    ProvidableCompositionLocal<LayoutDirection> localLayoutDirection = CompositionLocalsKt.getLocalLayoutDirection();
                                                    ComposerKt.sourceInformationMarkerStart(composer5, 2023513938, "C:CompositionLocal.kt#9igjgp");
                                                    Object consume10 = composer5.consume(localLayoutDirection);
                                                    ComposerKt.sourceInformationMarkerEnd(composer5);
                                                    LayoutDirection layoutDirection = (LayoutDirection) consume10;
                                                    ProvidableCompositionLocal<ViewConfiguration> localViewConfiguration = CompositionLocalsKt.getLocalViewConfiguration();
                                                    ComposerKt.sourceInformationMarkerStart(composer5, 2023513938, "C:CompositionLocal.kt#9igjgp");
                                                    Object consume11 = composer5.consume(localViewConfiguration);
                                                    ComposerKt.sourceInformationMarkerEnd(composer5);
                                                    ViewConfiguration viewConfiguration = (ViewConfiguration) consume11;
                                                    Function0<ComposeUiNode> constructor = ComposeUiNode.INSTANCE.getConstructor();
                                                    Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> materializerOf = LayoutKt.materializerOf(companion3);
                                                    if (!(composer5.getApplier() instanceof Applier)) {
                                                        ComposablesKt.invalidApplier();
                                                    }
                                                    composer5.startReusableNode();
                                                    if (composer5.getInserting()) {
                                                        composer5.createNode(constructor);
                                                    } else {
                                                        composer5.useNode();
                                                    }
                                                    composer5.disableReusing();
                                                    Composer m1283constructorimpl = Updater.m1283constructorimpl(composer5);
                                                    Updater.m1290setimpl(m1283constructorimpl, measurePolicy, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
                                                    Updater.m1290setimpl(m1283constructorimpl, density222, ComposeUiNode.INSTANCE.getSetDensity());
                                                    Updater.m1290setimpl(m1283constructorimpl, layoutDirection, ComposeUiNode.INSTANCE.getSetLayoutDirection());
                                                    Updater.m1290setimpl(m1283constructorimpl, viewConfiguration, ComposeUiNode.INSTANCE.getSetViewConfiguration());
                                                    composer5.enableReusing();
                                                    boolean z26 = false;
                                                    materializerOf.invoke(SkippableUpdater.m1273boximpl(SkippableUpdater.m1274constructorimpl(composer5)), composer5, 0);
                                                    composer5.startReplaceableGroup(2058660585);
                                                    composer5.startReplaceableGroup(1714611517);
                                                    ComposerKt.sourceInformation(composer5, "C:CoreTextField.kt#423gt5");
                                                    composer5.endReplaceableGroup();
                                                    composer5.endReplaceableGroup();
                                                    composer5.endNode();
                                                    composer5.endReplaceableGroup();
                                                    TextFieldSelectionManager textFieldSelectionManager4 = TextFieldSelectionManager.this;
                                                    if (textFieldState4.getHandleState() == HandleState.Selection && textFieldState4.getLayoutCoordinates() != null) {
                                                        LayoutCoordinates layoutCoordinates = textFieldState4.getLayoutCoordinates();
                                                        Intrinsics.checkNotNull(layoutCoordinates);
                                                        if (layoutCoordinates.isAttached() && z24) {
                                                            z26 = true;
                                                        }
                                                    }
                                                    CoreTextFieldKt.SelectionToolbarAndHandles(textFieldSelectionManager4, z26, composer5, 8);
                                                    if (textFieldState4.getHandleState() == HandleState.Cursor && !z25 && z24) {
                                                        CoreTextFieldKt.TextFieldCursorHandle(TextFieldSelectionManager.this, composer5, 8);
                                                        return;
                                                    }
                                                    return;
                                                }
                                                composer5.skipToGroupEnd();
                                            }
                                        }), composer4, 48, 0);
                                        return;
                                    }
                                    composer4.skipToGroupEnd();
                                }
                            }), composer3, Integer.valueOf(((i2622 >> 9) & 112) | 6));
                            return;
                        }
                        composer3.skipToGroupEnd();
                    }
                };
                composer2 = startRestartGroup;
                CoreTextFieldRootBox(onGloballyPositioned222, textFieldSelectionManager22, ComposableLambdaKt.composableLambda(composer2, -1885146845, true, function222), composer2, 448);
                textStyle3 = textStyle2;
                imeOptions5 = imeOptions822;
                function13 = function12;
                brush3 = brush2;
                z10 = z4;
                keyboardActions3 = keyboardActions2;
                z11 = z5;
                function33 = function32;
                mutableInteractionSource4 = mutableInteractionSource622;
                i19 = i2522;
                z12 = z1622;
                modifier4 = modifier522;
                visualTransformation3 = visualTransformation522;
                endRestartGroup = composer2.endRestartGroup();
                if (endRestartGroup == null) {
                }
            }
            i7 = i4 & 16;
            if (i7 != 0) {
            }
            i8 = i4 & 32;
            if (i8 != 0) {
            }
            i9 = i4 & 64;
            if (i9 != 0) {
            }
            if ((i2 & 29360128) == 0) {
            }
            i10 = i4 & 256;
            if (i10 != 0) {
            }
            i11 = i4 & 512;
            if (i11 != 0) {
            }
            if ((i3 & 14) == 0) {
            }
            i13 = i4 & 2048;
            if (i13 != 0) {
            }
            int i232 = i12;
            i14 = i4 & 4096;
            if (i14 != 0) {
            }
            i15 = i4 & 8192;
            if (i15 == 0) {
            }
            i16 = i4 & 16384;
            if (i16 != 0) {
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
            if (i8 != 0) {
            }
            if (i9 != 0) {
            }
            if ((i4 & 128) != 0) {
            }
            if (i10 != 0) {
            }
            if (i11 != 0) {
            }
            if ((i4 & 1024) != 0) {
            }
            if (i13 != 0) {
            }
            if (i14 != 0) {
            }
            if (i15 != 0) {
            }
            if (i16 != 0) {
            }
            visualTransformation2 = none;
            imeOptions3 = imeOptions2;
            function12 = coreTextFieldKt$CoreTextField$1;
            mutableInteractionSource2 = mutableInteractionSource5;
            i18 = i24;
            textStyle2 = textStyle4;
            z6 = z14;
            startRestartGroup.endDefaults();
            final FocusRequester focusRequester222 = new FocusRequester();
            startRestartGroup.startReplaceableGroup(-55013392);
            ComposerKt.sourceInformation(startRestartGroup, "195@10897L7");
            if (z6) {
            }
            textInputService = null;
            startRestartGroup.endReplaceableGroup();
            ProvidableCompositionLocal<Density> localDensity222 = CompositionLocalsKt.getLocalDensity();
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, 2023513938, "C:CompositionLocal.kt#9igjgp");
            Object consume2222 = startRestartGroup.consume(localDensity222);
            ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
            Density density222 = (Density) consume2222;
            ProvidableCompositionLocal<FontFamily.Resolver> localFontFamilyResolver222 = CompositionLocalsKt.getLocalFontFamilyResolver();
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, 2023513938, "C:CompositionLocal.kt#9igjgp");
            Object consume3222 = startRestartGroup.consume(localFontFamilyResolver222);
            ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
            FontFamily.Resolver resolver222 = (FontFamily.Resolver) consume3222;
            ProvidableCompositionLocal<TextSelectionColors> localTextSelectionColors222 = TextSelectionColorsKt.getLocalTextSelectionColors();
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, 2023513938, "C:CompositionLocal.kt#9igjgp");
            Object consume4222 = startRestartGroup.consume(localTextSelectionColors222);
            ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
            long backgroundColor222 = ((TextSelectionColors) consume4222).getBackgroundColor();
            ProvidableCompositionLocal<FocusManager> localFocusManager222 = CompositionLocalsKt.getLocalFocusManager();
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, 2023513938, "C:CompositionLocal.kt#9igjgp");
            Object consume5222 = startRestartGroup.consume(localFocusManager222);
            ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
            FocusManager focusManager222 = (FocusManager) consume5222;
            if (i18 == 1) {
            }
            Object[] objArr222 = {orientation};
            Saver<TextFieldScrollerPosition, Object> saver222 = TextFieldScrollerPosition.INSTANCE.getSaver();
            Modifier modifier5222 = modifier3;
            startRestartGroup.startReplaceableGroup(1157296644);
            ComposerKt.sourceInformation(startRestartGroup, "C(remember)P(1):Composables.kt#9igjgp");
            changed = startRestartGroup.changed(orientation);
            final int i25222 = i18;
            rememberedValue = startRestartGroup.rememberedValue();
            if (!changed) {
            }
            rememberedValue = (Function0) new Function0<TextFieldScrollerPosition>() { // from class: androidx.compose.foundation.text.CoreTextFieldKt$CoreTextField$scrollerPosition$1$1
                {
                    super(0);
                }

                /* JADX WARN: Can't rename method to resolve collision */
                @Override // kotlin.jvm.functions.Function0
                public final TextFieldScrollerPosition invoke() {
                    return new TextFieldScrollerPosition(Orientation.this, 0.0f, 2, null);
                }
            };
            startRestartGroup.updateRememberedValue(rememberedValue);
            startRestartGroup.endReplaceableGroup();
            final TextFieldScrollerPosition textFieldScrollerPosition222 = (TextFieldScrollerPosition) RememberSaveableKt.m1296rememberSaveable(objArr222, (Saver) saver222, (String) null, (Function0) rememberedValue, startRestartGroup, 72, 4);
            startRestartGroup.startReplaceableGroup(511388516);
            ComposerKt.sourceInformation(startRestartGroup, "C(remember)P(1,2):Composables.kt#9igjgp");
            changed2 = startRestartGroup.changed(value) | startRestartGroup.changed(visualTransformation2);
            rememberedValue2 = startRestartGroup.rememberedValue();
            if (changed2) {
            }
            TransformedText filter222 = visualTransformation2.filter(value.getAnnotatedString());
            composition = value.getComposition();
            z7 = z6;
            imeOptions4 = imeOptions3;
            if (composition != null) {
            }
            rememberedValue2 = filter222;
            startRestartGroup.updateRememberedValue(rememberedValue2);
            startRestartGroup.endReplaceableGroup();
            final TransformedText transformedText222 = (TransformedText) rememberedValue2;
            AnnotatedString text222 = transformedText222.getText();
            final OffsetMapping offsetMapping222 = transformedText222.getOffsetMapping();
            RecomposeScope currentRecomposeScope222 = ComposablesKt.getCurrentRecomposeScope(startRestartGroup, 0);
            startRestartGroup.startReplaceableGroup(-492369756);
            ComposerKt.sourceInformation(startRestartGroup, "C(remember):Composables.kt#9igjgp");
            final int i26222 = i17;
            rememberedValue3 = startRestartGroup.rememberedValue();
            if (rememberedValue3 == Composer.INSTANCE.getEmpty()) {
            }
            startRestartGroup.endReplaceableGroup();
            final TextFieldState textFieldState222 = (TextFieldState) rememberedValue3;
            textFieldState222.m763updateaKPrnQ(text222, textStyle2, z4, density222, resolver222, onValueChange, keyboardActions2, focusManager222, backgroundColor222);
            textFieldState222.getProcessor().reset(value, textFieldState222.getInputSession());
            startRestartGroup.startReplaceableGroup(-492369756);
            ComposerKt.sourceInformation(startRestartGroup, "C(remember):Composables.kt#9igjgp");
            rememberedValue4 = startRestartGroup.rememberedValue();
            if (rememberedValue4 == Composer.INSTANCE.getEmpty()) {
            }
            startRestartGroup.endReplaceableGroup();
            UndoManager undoManager222 = (UndoManager) rememberedValue4;
            UndoManager.snapshotIfNeeded$default(undoManager222, value, 0L, 2, null);
            startRestartGroup.startReplaceableGroup(-492369756);
            ComposerKt.sourceInformation(startRestartGroup, "C(remember):Composables.kt#9igjgp");
            rememberedValue5 = startRestartGroup.rememberedValue();
            if (rememberedValue5 == Composer.INSTANCE.getEmpty()) {
            }
            startRestartGroup.endReplaceableGroup();
            final TextFieldSelectionManager textFieldSelectionManager222 = (TextFieldSelectionManager) rememberedValue5;
            textFieldSelectionManager222.setOffsetMapping$foundation_release(offsetMapping222);
            textFieldSelectionManager222.setVisualTransformation$foundation_release(visualTransformation2);
            textFieldSelectionManager222.setOnValueChange$foundation_release(textFieldState222.getOnValueChange());
            textFieldSelectionManager222.setState$foundation_release(textFieldState222);
            textFieldSelectionManager222.setValue$foundation_release(value);
            ProvidableCompositionLocal<ClipboardManager> localClipboardManager222 = CompositionLocalsKt.getLocalClipboardManager();
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, 2023513938, "C:CompositionLocal.kt#9igjgp");
            Object consume6222 = startRestartGroup.consume(localClipboardManager222);
            ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
            textFieldSelectionManager222.setClipboardManager$foundation_release((ClipboardManager) consume6222);
            ProvidableCompositionLocal<TextToolbar> localTextToolbar222 = CompositionLocalsKt.getLocalTextToolbar();
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, 2023513938, "C:CompositionLocal.kt#9igjgp");
            Object consume7222 = startRestartGroup.consume(localTextToolbar222);
            ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
            textFieldSelectionManager222.setTextToolbar((TextToolbar) consume7222);
            ProvidableCompositionLocal<HapticFeedback> localHapticFeedback222 = CompositionLocalsKt.getLocalHapticFeedback();
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, 2023513938, "C:CompositionLocal.kt#9igjgp");
            Object consume8222 = startRestartGroup.consume(localHapticFeedback222);
            ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
            textFieldSelectionManager222.setHapticFeedBack((HapticFeedback) consume8222);
            textFieldSelectionManager222.setFocusRequester(focusRequester222);
            textFieldSelectionManager222.setEditable(!z5);
            startRestartGroup.startReplaceableGroup(773894976);
            ComposerKt.sourceInformation(startRestartGroup, "C(rememberCoroutineScope)475@19849L144:Effects.kt#9igjgp");
            startRestartGroup.startReplaceableGroup(-492369756);
            ComposerKt.sourceInformation(startRestartGroup, "C(remember):Composables.kt#9igjgp");
            rememberedValue6 = startRestartGroup.rememberedValue();
            if (rememberedValue6 == Composer.INSTANCE.getEmpty()) {
            }
            startRestartGroup.endReplaceableGroup();
            final CoroutineScope coroutineScope222 = ((CompositionScopedCoroutineScopeCanceller) rememberedValue6).getCoroutineScope();
            startRestartGroup.endReplaceableGroup();
            startRestartGroup.startReplaceableGroup(-492369756);
            ComposerKt.sourceInformation(startRestartGroup, "C(remember):Composables.kt#9igjgp");
            rememberedValue7 = startRestartGroup.rememberedValue();
            if (rememberedValue7 == Composer.INSTANCE.getEmpty()) {
            }
            startRestartGroup.endReplaceableGroup();
            final BringIntoViewRequester bringIntoViewRequester2222 = (BringIntoViewRequester) rememberedValue7;
            final TextInputService textInputService2222 = textInputService;
            final ImeOptions imeOptions6222 = imeOptions4;
            final boolean z16222 = z7;
            Modifier textFieldFocusModifier222 = TextFieldGestureModifiersKt.textFieldFocusModifier(Modifier.INSTANCE, z16222, focusRequester222, mutableInteractionSource2, new Function1<FocusState, Unit>() { // from class: androidx.compose.foundation.text.CoreTextFieldKt$CoreTextField$focusModifier$1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(1);
                }

                @Override // kotlin.jvm.functions.Function1
                public /* bridge */ /* synthetic */ Unit invoke(FocusState focusState) {
                    invoke2(focusState);
                    return Unit.INSTANCE;
                }

                /* renamed from: invoke, reason: avoid collision after fix types in other method */
                public final void invoke2(FocusState it) {
                    TextLayoutResultProxy layoutResult;
                    Intrinsics.checkNotNullParameter(it, "it");
                    if (TextFieldState.this.getHasFocus() == it.isFocused()) {
                        return;
                    }
                    TextFieldState.this.setHasFocus(it.isFocused());
                    TextInputService textInputService3 = textInputService2222;
                    if (textInputService3 != null) {
                        CoreTextFieldKt.notifyTextInputServiceOnFocusChange(textInputService3, TextFieldState.this, value, imeOptions6222);
                        if (it.isFocused() && (layoutResult = TextFieldState.this.getLayoutResult()) != null) {
                            BuildersKt__Builders_commonKt.launch$default(coroutineScope222, null, null, new CoreTextFieldKt$CoreTextField$focusModifier$1$1$1(bringIntoViewRequester2222, value, TextFieldState.this, layoutResult, offsetMapping222, null), 3, null);
                        }
                    }
                    if (it.isFocused()) {
                        return;
                    }
                    TextFieldSelectionManager.m860deselect_kEHs6E$foundation_release$default(textFieldSelectionManager222, null, 1, null);
                }
            });
            EffectsKt.DisposableEffect(textFieldState222, new Function1<DisposableEffectScope, DisposableEffectResult>() { // from class: androidx.compose.foundation.text.CoreTextFieldKt$CoreTextField$2
                {
                    super(1);
                }

                @Override // kotlin.jvm.functions.Function1
                public final DisposableEffectResult invoke(DisposableEffectScope DisposableEffect) {
                    Intrinsics.checkNotNullParameter(DisposableEffect, "$this$DisposableEffect");
                    final TextFieldState textFieldState2222 = TextFieldState.this;
                    return new DisposableEffectResult() { // from class: androidx.compose.foundation.text.CoreTextFieldKt$CoreTextField$2$invoke$$inlined$onDispose$1
                        @Override // androidx.compose.runtime.DisposableEffectResult
                        public void dispose() {
                            if (TextFieldState.this.getHasFocus()) {
                                CoreTextFieldKt.onBlur(TextFieldState.this);
                            }
                        }
                    };
                }
            }, startRestartGroup, 8);
            if (TouchMode_androidKt.isInTouchMode()) {
            }
            final Modifier drawBehind222 = DrawModifierKt.drawBehind(Modifier.INSTANCE, new Function1<DrawScope, Unit>() { // from class: androidx.compose.foundation.text.CoreTextFieldKt$CoreTextField$drawModifier$1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(1);
                }

                @Override // kotlin.jvm.functions.Function1
                public /* bridge */ /* synthetic */ Unit invoke(DrawScope drawScope) {
                    invoke2(drawScope);
                    return Unit.INSTANCE;
                }

                /* renamed from: invoke, reason: avoid collision after fix types in other method */
                public final void invoke2(DrawScope drawBehind2222) {
                    Intrinsics.checkNotNullParameter(drawBehind2222, "$this$drawBehind");
                    TextLayoutResultProxy layoutResult = TextFieldState.this.getLayoutResult();
                    if (layoutResult != null) {
                        TextFieldValue textFieldValue = value;
                        OffsetMapping offsetMapping2222 = offsetMapping222;
                        TextFieldState textFieldState2222 = TextFieldState.this;
                        TextFieldDelegate.INSTANCE.draw$foundation_release(drawBehind2222.getDrawContext().getCanvas(), textFieldValue, offsetMapping2222, layoutResult.getValue(), textFieldState2222.getSelectionPaint());
                    }
                }
            });
            final Modifier onGloballyPositioned322 = OnGloballyPositionedModifierKt.onGloballyPositioned(Modifier.INSTANCE, new Function1<LayoutCoordinates, Unit>() { // from class: androidx.compose.foundation.text.CoreTextFieldKt$CoreTextField$onPositionedModifier$1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(1);
                }

                @Override // kotlin.jvm.functions.Function1
                public /* bridge */ /* synthetic */ Unit invoke(LayoutCoordinates layoutCoordinates) {
                    invoke2(layoutCoordinates);
                    return Unit.INSTANCE;
                }

                /* renamed from: invoke, reason: avoid collision after fix types in other method */
                public final void invoke2(LayoutCoordinates it) {
                    Intrinsics.checkNotNullParameter(it, "it");
                    TextFieldState.this.setLayoutCoordinates(it);
                    if (z16222) {
                        if (TextFieldState.this.getHandleState() == HandleState.Selection) {
                            if (TextFieldState.this.getShowFloatingToolbar()) {
                                textFieldSelectionManager222.showSelectionToolbar$foundation_release();
                            } else {
                                textFieldSelectionManager222.hideSelectionToolbar$foundation_release();
                            }
                            TextFieldState.this.setShowSelectionHandleStart(TextFieldSelectionManagerKt.isSelectionHandleInVisibleBound(textFieldSelectionManager222, true));
                            TextFieldState.this.setShowSelectionHandleEnd(TextFieldSelectionManagerKt.isSelectionHandleInVisibleBound(textFieldSelectionManager222, false));
                        } else if (TextFieldState.this.getHandleState() == HandleState.Cursor) {
                            TextFieldState.this.setShowCursorHandle(TextFieldSelectionManagerKt.isSelectionHandleInVisibleBound(textFieldSelectionManager222, true));
                        }
                    }
                    TextLayoutResultProxy layoutResult = TextFieldState.this.getLayoutResult();
                    if (layoutResult == null) {
                        return;
                    }
                    layoutResult.setInnerTextFieldCoordinates(it);
                }
            });
            final boolean z18222 = visualTransformation2 instanceof PasswordVisualTransformation;
            final ImeOptions imeOptions7222 = imeOptions4;
            final boolean z19222 = z5;
            Modifier semantics222 = SemanticsModifierKt.semantics(Modifier.INSTANCE, true, new Function1<SemanticsPropertyReceiver, Unit>() { // from class: androidx.compose.foundation.text.CoreTextFieldKt$CoreTextField$semanticsModifier$1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(1);
                }

                @Override // kotlin.jvm.functions.Function1
                public /* bridge */ /* synthetic */ Unit invoke(SemanticsPropertyReceiver semanticsPropertyReceiver) {
                    invoke2(semanticsPropertyReceiver);
                    return Unit.INSTANCE;
                }

                /* renamed from: invoke, reason: avoid collision after fix types in other method */
                public final void invoke2(SemanticsPropertyReceiver semantics2222) {
                    Intrinsics.checkNotNullParameter(semantics2222, "$this$semantics");
                    SemanticsPropertiesKt.m3395setImeAction4L7nppU(semantics2222, ImeOptions.this.getImeAction());
                    SemanticsPropertiesKt.setEditableText(semantics2222, transformedText222.getText());
                    SemanticsPropertiesKt.m3398setTextSelectionRangeFDrldGo(semantics2222, value.getSelection());
                    if (!z16222) {
                        SemanticsPropertiesKt.disabled(semantics2222);
                    }
                    if (z18222) {
                        SemanticsPropertiesKt.password(semantics2222);
                    }
                    final TextFieldState textFieldState2222 = textFieldState222;
                    SemanticsPropertiesKt.getTextLayoutResult$default(semantics2222, null, new Function1<List<TextLayoutResult>, Boolean>() { // from class: androidx.compose.foundation.text.CoreTextFieldKt$CoreTextField$semanticsModifier$1.1
                        {
                            super(1);
                        }

                        @Override // kotlin.jvm.functions.Function1
                        public final Boolean invoke(List<TextLayoutResult> it) {
                            boolean z20222;
                            Intrinsics.checkNotNullParameter(it, "it");
                            if (TextFieldState.this.getLayoutResult() != null) {
                                TextLayoutResultProxy layoutResult = TextFieldState.this.getLayoutResult();
                                Intrinsics.checkNotNull(layoutResult);
                                it.add(layoutResult.getValue());
                                z20222 = true;
                            } else {
                                z20222 = false;
                            }
                            return Boolean.valueOf(z20222);
                        }
                    }, 1, null);
                    final TextFieldState textFieldState3 = textFieldState222;
                    SemanticsPropertiesKt.setText$default(semantics2222, null, new Function1<AnnotatedString, Boolean>() { // from class: androidx.compose.foundation.text.CoreTextFieldKt$CoreTextField$semanticsModifier$1.2
                        {
                            super(1);
                        }

                        @Override // kotlin.jvm.functions.Function1
                        public final Boolean invoke(AnnotatedString it) {
                            Intrinsics.checkNotNullParameter(it, "it");
                            TextFieldState.this.getOnValueChange().invoke(new TextFieldValue(it.getText(), TextRangeKt.TextRange(it.getText().length()), (TextRange) null, 4, (DefaultConstructorMarker) null));
                            return true;
                        }
                    }, 1, null);
                    final OffsetMapping offsetMapping2222 = offsetMapping222;
                    final boolean z20222 = z16222;
                    final TextFieldValue textFieldValue = value;
                    final TextFieldSelectionManager textFieldSelectionManager2222 = textFieldSelectionManager222;
                    final TextFieldState textFieldState4 = textFieldState222;
                    SemanticsPropertiesKt.setSelection$default(semantics2222, null, new Function3<Integer, Integer, Boolean, Boolean>() { // from class: androidx.compose.foundation.text.CoreTextFieldKt$CoreTextField$semanticsModifier$1.3
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        {
                            super(3);
                        }

                        @Override // kotlin.jvm.functions.Function3
                        public /* bridge */ /* synthetic */ Boolean invoke(Integer num, Integer num2, Boolean bool) {
                            return invoke(num.intValue(), num2.intValue(), bool.booleanValue());
                        }

                        public final Boolean invoke(int i27, int i28, boolean z21222) {
                            if (!z21222) {
                                i27 = OffsetMapping.this.transformedToOriginal(i27);
                            }
                            if (!z21222) {
                                i28 = OffsetMapping.this.transformedToOriginal(i28);
                            }
                            boolean z22 = false;
                            if (z20222 && (i27 != TextRange.m3486getStartimpl(textFieldValue.getSelection()) || i28 != TextRange.m3481getEndimpl(textFieldValue.getSelection()))) {
                                if (RangesKt.coerceAtMost(i27, i28) >= 0 && RangesKt.coerceAtLeast(i27, i28) <= textFieldValue.getAnnotatedString().length()) {
                                    if (z21222 || i27 == i28) {
                                        textFieldSelectionManager2222.exitSelectionMode$foundation_release();
                                    } else {
                                        textFieldSelectionManager2222.enterSelectionMode$foundation_release();
                                    }
                                    textFieldState4.getOnValueChange().invoke(new TextFieldValue(textFieldValue.getAnnotatedString(), TextRangeKt.TextRange(i27, i28), (TextRange) null, 4, (DefaultConstructorMarker) null));
                                    z22 = true;
                                } else {
                                    textFieldSelectionManager2222.exitSelectionMode$foundation_release();
                                }
                            }
                            return Boolean.valueOf(z22);
                        }
                    }, 1, null);
                    final TextFieldState textFieldState5 = textFieldState222;
                    final FocusRequester focusRequester2222 = focusRequester222;
                    final boolean z21222 = z19222;
                    SemanticsPropertiesKt.onClick$default(semantics2222, null, new Function0<Boolean>() { // from class: androidx.compose.foundation.text.CoreTextFieldKt$CoreTextField$semanticsModifier$1.4
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        {
                            super(0);
                        }

                        /* JADX WARN: Can't rename method to resolve collision */
                        @Override // kotlin.jvm.functions.Function0
                        public final Boolean invoke() {
                            CoreTextFieldKt.tapToFocus(TextFieldState.this, focusRequester2222, !z21222);
                            return true;
                        }
                    }, 1, null);
                    final TextFieldSelectionManager textFieldSelectionManager3 = textFieldSelectionManager222;
                    SemanticsPropertiesKt.onLongClick$default(semantics2222, null, new Function0<Boolean>() { // from class: androidx.compose.foundation.text.CoreTextFieldKt$CoreTextField$semanticsModifier$1.5
                        {
                            super(0);
                        }

                        /* JADX WARN: Can't rename method to resolve collision */
                        @Override // kotlin.jvm.functions.Function0
                        public final Boolean invoke() {
                            TextFieldSelectionManager.this.enterSelectionMode$foundation_release();
                            return true;
                        }
                    }, 1, null);
                    if (!TextRange.m3480getCollapsedimpl(value.getSelection()) && !z18222) {
                        final TextFieldSelectionManager textFieldSelectionManager4 = textFieldSelectionManager222;
                        SemanticsPropertiesKt.copyText$default(semantics2222, null, new Function0<Boolean>() { // from class: androidx.compose.foundation.text.CoreTextFieldKt$CoreTextField$semanticsModifier$1.6
                            {
                                super(0);
                            }

                            /* JADX WARN: Can't rename method to resolve collision */
                            @Override // kotlin.jvm.functions.Function0
                            public final Boolean invoke() {
                                TextFieldSelectionManager.copy$foundation_release$default(TextFieldSelectionManager.this, false, 1, null);
                                return true;
                            }
                        }, 1, null);
                        if (z16222 && !z19222) {
                            final TextFieldSelectionManager textFieldSelectionManager5 = textFieldSelectionManager222;
                            SemanticsPropertiesKt.cutText$default(semantics2222, null, new Function0<Boolean>() { // from class: androidx.compose.foundation.text.CoreTextFieldKt$CoreTextField$semanticsModifier$1.7
                                {
                                    super(0);
                                }

                                /* JADX WARN: Can't rename method to resolve collision */
                                @Override // kotlin.jvm.functions.Function0
                                public final Boolean invoke() {
                                    TextFieldSelectionManager.this.cut$foundation_release();
                                    return true;
                                }
                            }, 1, null);
                        }
                    }
                    if (!z16222 || z19222) {
                        return;
                    }
                    final TextFieldSelectionManager textFieldSelectionManager6 = textFieldSelectionManager222;
                    SemanticsPropertiesKt.pasteText$default(semantics2222, null, new Function0<Boolean>() { // from class: androidx.compose.foundation.text.CoreTextFieldKt$CoreTextField$semanticsModifier$1.8
                        {
                            super(0);
                        }

                        /* JADX WARN: Can't rename method to resolve collision */
                        @Override // kotlin.jvm.functions.Function0
                        public final Boolean invoke() {
                            TextFieldSelectionManager.this.paste$foundation_release();
                            return true;
                        }
                    }, 1, null);
                }
            });
            final Modifier cursor222 = TextFieldCursorKt.cursor(Modifier.INSTANCE, textFieldState222, value, offsetMapping222, brush2, (z16222 || z5) ? z8 : true);
            EffectsKt.DisposableEffect(textFieldSelectionManager222, new Function1<DisposableEffectScope, DisposableEffectResult>() { // from class: androidx.compose.foundation.text.CoreTextFieldKt$CoreTextField$3
                {
                    super(1);
                }

                @Override // kotlin.jvm.functions.Function1
                public final DisposableEffectResult invoke(DisposableEffectScope DisposableEffect) {
                    Intrinsics.checkNotNullParameter(DisposableEffect, "$this$DisposableEffect");
                    final TextFieldSelectionManager textFieldSelectionManager2222 = TextFieldSelectionManager.this;
                    return new DisposableEffectResult() { // from class: androidx.compose.foundation.text.CoreTextFieldKt$CoreTextField$3$invoke$$inlined$onDispose$1
                        @Override // androidx.compose.runtime.DisposableEffectResult
                        public void dispose() {
                            TextFieldSelectionManager.this.hideSelectionToolbar$foundation_release();
                        }
                    };
                }
            }, startRestartGroup, 8);
            final ImeOptions imeOptions8222 = imeOptions4;
            EffectsKt.DisposableEffect(imeOptions8222, new Function1<DisposableEffectScope, DisposableEffectResult>() { // from class: androidx.compose.foundation.text.CoreTextFieldKt$CoreTextField$4
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(1);
                }

                @Override // kotlin.jvm.functions.Function1
                public final DisposableEffectResult invoke(DisposableEffectScope DisposableEffect) {
                    Intrinsics.checkNotNullParameter(DisposableEffect, "$this$DisposableEffect");
                    if (TextInputService.this != null && textFieldState222.getHasFocus()) {
                        textFieldState222.setInputSession(TextFieldDelegate.INSTANCE.restartInput$foundation_release(TextInputService.this, value, textFieldState222.getProcessor(), imeOptions8222, textFieldState222.getOnValueChange(), textFieldState222.getOnImeActionPerformed()));
                    }
                    return new DisposableEffectResult() { // from class: androidx.compose.foundation.text.CoreTextFieldKt$CoreTextField$4$invoke$$inlined$onDispose$1
                        @Override // androidx.compose.runtime.DisposableEffectResult
                        public void dispose() {
                        }
                    };
                }
            }, startRestartGroup, i26222 & 14);
            MutableInteractionSource mutableInteractionSource6222 = mutableInteractionSource3;
            Modifier onGloballyPositioned2222 = OnGloballyPositionedModifierKt.onGloballyPositioned(TextFieldScrollKt.textFieldScrollable(previewKeyEventToDeselectOnBack(modifier5222.then(textFieldFocusModifier222), textFieldState222, textFieldSelectionManager222).then(TextFieldKeyInputKt.textFieldKeyInput(Modifier.INSTANCE, textFieldState222, textFieldSelectionManager222, value, textFieldState222.getOnValueChange(), !z5, i25222 == 1, offsetMapping222, undoManager222)), textFieldScrollerPosition222, mutableInteractionSource6222, z16222).then(pointerHoverIcon$default).then(semantics222), new Function1<LayoutCoordinates, Unit>() { // from class: androidx.compose.foundation.text.CoreTextFieldKt$CoreTextField$decorationBoxModifier$1
                {
                    super(1);
                }

                @Override // kotlin.jvm.functions.Function1
                public /* bridge */ /* synthetic */ Unit invoke(LayoutCoordinates layoutCoordinates) {
                    invoke2(layoutCoordinates);
                    return Unit.INSTANCE;
                }

                /* renamed from: invoke, reason: avoid collision after fix types in other method */
                public final void invoke2(LayoutCoordinates it) {
                    Intrinsics.checkNotNullParameter(it, "it");
                    TextLayoutResultProxy layoutResult = TextFieldState.this.getLayoutResult();
                    if (layoutResult == null) {
                        return;
                    }
                    layoutResult.setDecorationBoxCoordinates(it);
                }
            });
            if (z16222) {
            }
            if (z9) {
            }
            final Modifier modifier6222 = companion;
            final Function3<? super Function2<? super Composer, ? super Integer, Unit>, ? super Composer, ? super Integer, Unit> function34222 = function32;
            final TextStyle textStyle5222 = textStyle2;
            final VisualTransformation visualTransformation4222 = visualTransformation2;
            final BringIntoViewRequester bringIntoViewRequester3222 = bringIntoViewRequester;
            VisualTransformation visualTransformation5222 = visualTransformation2;
            final boolean z20222 = z9;
            final boolean z21222 = z5;
            final Function1<? super TextLayoutResult, Unit> function14222 = function12;
            Function2<Composer, Integer, Unit> function2222 = new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.foundation.text.CoreTextFieldKt$CoreTextField$5
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

                public final void invoke(Composer composer3, int i27) {
                    ComposerKt.sourceInformation(composer3, "C532@23298L3376:CoreTextField.kt#423gt5");
                    if ((i27 & 11) != 2 || !composer3.getSkipping()) {
                        Function3<Function2<? super Composer, ? super Integer, Unit>, Composer, Integer, Unit> function35 = function34222;
                        final int i28 = i25222;
                        final TextStyle textStyle6 = textStyle5222;
                        final TextFieldScrollerPosition textFieldScrollerPosition2222 = textFieldScrollerPosition222;
                        final TextFieldValue textFieldValue = value;
                        final VisualTransformation visualTransformation6 = visualTransformation4222;
                        final Modifier modifier7 = cursor222;
                        final Modifier modifier8 = drawBehind222;
                        final Modifier modifier9 = onGloballyPositioned322;
                        final Modifier modifier10 = modifier6222;
                        final BringIntoViewRequester bringIntoViewRequester4 = bringIntoViewRequester3222;
                        final TextFieldState textFieldState2222 = textFieldState222;
                        final TextFieldSelectionManager textFieldSelectionManager2222 = textFieldSelectionManager222;
                        final boolean z22 = z20222;
                        final boolean z23 = z21222;
                        final Function1<? super TextLayoutResult, Unit> function15 = function14222;
                        function35.invoke(ComposableLambdaKt.composableLambda(composer3, 207445534, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.foundation.text.CoreTextFieldKt$CoreTextField$5.1
                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            /* JADX WARN: Multi-variable type inference failed */
                            {
                                super(2);
                            }

                            @Override // kotlin.jvm.functions.Function2
                            public /* bridge */ /* synthetic */ Unit invoke(Composer composer4, Integer num) {
                                invoke(composer4, num.intValue());
                                return Unit.INSTANCE;
                            }

                            public final void invoke(Composer composer4, int i29) {
                                ComposerKt.sourceInformation(composer4, "C550@24083L2581:CoreTextField.kt#423gt5");
                                if ((i29 & 11) != 2 || !composer4.getSkipping()) {
                                    Modifier maxLinesHeight = MaxLinesHeightModifierKt.maxLinesHeight(Modifier.INSTANCE, i28, textStyle6);
                                    TextFieldScrollerPosition textFieldScrollerPosition3 = textFieldScrollerPosition2222;
                                    TextFieldValue textFieldValue2 = textFieldValue;
                                    VisualTransformation visualTransformation7 = visualTransformation6;
                                    final TextFieldState textFieldState3 = textFieldState2222;
                                    Modifier bringIntoViewRequester5 = BringIntoViewRequesterKt.bringIntoViewRequester(TextFieldSizeKt.textFieldMinSize(TextFieldScrollKt.textFieldScroll(maxLinesHeight, textFieldScrollerPosition3, textFieldValue2, visualTransformation7, new Function0<TextLayoutResultProxy>() { // from class: androidx.compose.foundation.text.CoreTextFieldKt$CoreTextField$5$1$coreTextFieldModifier$1
                                        {
                                            super(0);
                                        }

                                        /* JADX WARN: Can't rename method to resolve collision */
                                        @Override // kotlin.jvm.functions.Function0
                                        public final TextLayoutResultProxy invoke() {
                                            return TextFieldState.this.getLayoutResult();
                                        }
                                    }).then(modifier7).then(modifier8), textStyle6).then(modifier9).then(modifier10), bringIntoViewRequester4);
                                    final TextFieldSelectionManager textFieldSelectionManager3 = textFieldSelectionManager2222;
                                    final TextFieldState textFieldState4 = textFieldState2222;
                                    final boolean z24 = z22;
                                    final boolean z25 = z23;
                                    final Function1<? super TextLayoutResult, Unit> function16 = function15;
                                    SimpleLayoutKt.SimpleLayout(bringIntoViewRequester5, ComposableLambdaKt.composableLambda(composer4, 19580180, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.foundation.text.CoreTextFieldKt.CoreTextField.5.1.1
                                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                        /* JADX WARN: Multi-variable type inference failed */
                                        {
                                            super(2);
                                        }

                                        @Override // kotlin.jvm.functions.Function2
                                        public /* bridge */ /* synthetic */ Unit invoke(Composer composer5, Integer num) {
                                            invoke(composer5, num.intValue());
                                            return Unit.INSTANCE;
                                        }

                                        public final void invoke(Composer composer5, int i30) {
                                            ComposerKt.sourceInformation(composer5, "C551@24137L1909,591@26064L327,603@26592L40:CoreTextField.kt#423gt5");
                                            if ((i30 & 11) != 2 || !composer5.getSkipping()) {
                                                final TextFieldState textFieldState5 = textFieldState4;
                                                final Function1<? super TextLayoutResult, Unit> function17 = function16;
                                                MeasurePolicy measurePolicy = new MeasurePolicy() { // from class: androidx.compose.foundation.text.CoreTextFieldKt.CoreTextField.5.1.1.2
                                                    @Override // androidx.compose.ui.layout.MeasurePolicy
                                                    /* renamed from: measure-3p2s80s */
                                                    public MeasureResult mo15measure3p2s80s(MeasureScope measure, List<? extends Measurable> measurables, long j) {
                                                        Intrinsics.checkNotNullParameter(measure, "$this$measure");
                                                        Intrinsics.checkNotNullParameter(measurables, "measurables");
                                                        Snapshot.Companion companion3 = Snapshot.INSTANCE;
                                                        TextFieldState textFieldState6 = TextFieldState.this;
                                                        Snapshot createNonObservableSnapshot = companion3.createNonObservableSnapshot();
                                                        try {
                                                            Snapshot makeCurrent = createNonObservableSnapshot.makeCurrent();
                                                            try {
                                                                TextLayoutResultProxy layoutResult = textFieldState6.getLayoutResult();
                                                                TextLayoutResult value2 = layoutResult != null ? layoutResult.getValue() : null;
                                                                createNonObservableSnapshot.dispose();
                                                                Triple<Integer, Integer, TextLayoutResult> m748layout_EkL_Y$foundation_release = TextFieldDelegate.INSTANCE.m748layout_EkL_Y$foundation_release(TextFieldState.this.getTextDelegate(), j, measure.getLayoutDirection(), value2);
                                                                int intValue = m748layout_EkL_Y$foundation_release.component1().intValue();
                                                                int intValue2 = m748layout_EkL_Y$foundation_release.component2().intValue();
                                                                TextLayoutResult component3 = m748layout_EkL_Y$foundation_release.component3();
                                                                if (!Intrinsics.areEqual(value2, component3)) {
                                                                    TextFieldState.this.setLayoutResult(new TextLayoutResultProxy(component3));
                                                                    function17.invoke(component3);
                                                                }
                                                                return measure.layout(intValue, intValue2, MapsKt.mapOf(TuplesKt.to(AlignmentLineKt.getFirstBaseline(), Integer.valueOf(MathKt.roundToInt(component3.getFirstBaseline()))), TuplesKt.to(AlignmentLineKt.getLastBaseline(), Integer.valueOf(MathKt.roundToInt(component3.getLastBaseline())))), new Function1<Placeable.PlacementScope, Unit>() { // from class: androidx.compose.foundation.text.CoreTextFieldKt$CoreTextField$5$1$1$2$measure$1
                                                                    /* renamed from: invoke, reason: avoid collision after fix types in other method */
                                                                    public final void invoke2(Placeable.PlacementScope layout) {
                                                                        Intrinsics.checkNotNullParameter(layout, "$this$layout");
                                                                    }

                                                                    @Override // kotlin.jvm.functions.Function1
                                                                    public /* bridge */ /* synthetic */ Unit invoke(Placeable.PlacementScope placementScope) {
                                                                        invoke2(placementScope);
                                                                        return Unit.INSTANCE;
                                                                    }
                                                                });
                                                            } finally {
                                                                createNonObservableSnapshot.restoreCurrent(makeCurrent);
                                                            }
                                                        } catch (Throwable th) {
                                                            createNonObservableSnapshot.dispose();
                                                            throw th;
                                                        }
                                                    }

                                                    @Override // androidx.compose.ui.layout.MeasurePolicy
                                                    public int maxIntrinsicWidth(IntrinsicMeasureScope intrinsicMeasureScope, List<? extends IntrinsicMeasurable> measurables, int i31) {
                                                        Intrinsics.checkNotNullParameter(intrinsicMeasureScope, "<this>");
                                                        Intrinsics.checkNotNullParameter(measurables, "measurables");
                                                        TextFieldState.this.getTextDelegate().layoutIntrinsics(intrinsicMeasureScope.getLayoutDirection());
                                                        return TextFieldState.this.getTextDelegate().getMaxIntrinsicWidth();
                                                    }
                                                };
                                                composer5.startReplaceableGroup(-1323940314);
                                                ComposerKt.sourceInformation(composer5, "C(Layout)P(!1,2)74@2915L7,75@2970L7,76@3029L7,77@3041L460:Layout.kt#80mrfh");
                                                Modifier.Companion companion3 = Modifier.INSTANCE;
                                                ProvidableCompositionLocal<Density> localDensity2222 = CompositionLocalsKt.getLocalDensity();
                                                ComposerKt.sourceInformationMarkerStart(composer5, 2023513938, "C:CompositionLocal.kt#9igjgp");
                                                Object consume9 = composer5.consume(localDensity2222);
                                                ComposerKt.sourceInformationMarkerEnd(composer5);
                                                Density density2222 = (Density) consume9;
                                                ProvidableCompositionLocal<LayoutDirection> localLayoutDirection = CompositionLocalsKt.getLocalLayoutDirection();
                                                ComposerKt.sourceInformationMarkerStart(composer5, 2023513938, "C:CompositionLocal.kt#9igjgp");
                                                Object consume10 = composer5.consume(localLayoutDirection);
                                                ComposerKt.sourceInformationMarkerEnd(composer5);
                                                LayoutDirection layoutDirection = (LayoutDirection) consume10;
                                                ProvidableCompositionLocal<ViewConfiguration> localViewConfiguration = CompositionLocalsKt.getLocalViewConfiguration();
                                                ComposerKt.sourceInformationMarkerStart(composer5, 2023513938, "C:CompositionLocal.kt#9igjgp");
                                                Object consume11 = composer5.consume(localViewConfiguration);
                                                ComposerKt.sourceInformationMarkerEnd(composer5);
                                                ViewConfiguration viewConfiguration = (ViewConfiguration) consume11;
                                                Function0<ComposeUiNode> constructor = ComposeUiNode.INSTANCE.getConstructor();
                                                Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> materializerOf = LayoutKt.materializerOf(companion3);
                                                if (!(composer5.getApplier() instanceof Applier)) {
                                                    ComposablesKt.invalidApplier();
                                                }
                                                composer5.startReusableNode();
                                                if (composer5.getInserting()) {
                                                    composer5.createNode(constructor);
                                                } else {
                                                    composer5.useNode();
                                                }
                                                composer5.disableReusing();
                                                Composer m1283constructorimpl = Updater.m1283constructorimpl(composer5);
                                                Updater.m1290setimpl(m1283constructorimpl, measurePolicy, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
                                                Updater.m1290setimpl(m1283constructorimpl, density2222, ComposeUiNode.INSTANCE.getSetDensity());
                                                Updater.m1290setimpl(m1283constructorimpl, layoutDirection, ComposeUiNode.INSTANCE.getSetLayoutDirection());
                                                Updater.m1290setimpl(m1283constructorimpl, viewConfiguration, ComposeUiNode.INSTANCE.getSetViewConfiguration());
                                                composer5.enableReusing();
                                                boolean z26 = false;
                                                materializerOf.invoke(SkippableUpdater.m1273boximpl(SkippableUpdater.m1274constructorimpl(composer5)), composer5, 0);
                                                composer5.startReplaceableGroup(2058660585);
                                                composer5.startReplaceableGroup(1714611517);
                                                ComposerKt.sourceInformation(composer5, "C:CoreTextField.kt#423gt5");
                                                composer5.endReplaceableGroup();
                                                composer5.endReplaceableGroup();
                                                composer5.endNode();
                                                composer5.endReplaceableGroup();
                                                TextFieldSelectionManager textFieldSelectionManager4 = TextFieldSelectionManager.this;
                                                if (textFieldState4.getHandleState() == HandleState.Selection && textFieldState4.getLayoutCoordinates() != null) {
                                                    LayoutCoordinates layoutCoordinates = textFieldState4.getLayoutCoordinates();
                                                    Intrinsics.checkNotNull(layoutCoordinates);
                                                    if (layoutCoordinates.isAttached() && z24) {
                                                        z26 = true;
                                                    }
                                                }
                                                CoreTextFieldKt.SelectionToolbarAndHandles(textFieldSelectionManager4, z26, composer5, 8);
                                                if (textFieldState4.getHandleState() == HandleState.Cursor && !z25 && z24) {
                                                    CoreTextFieldKt.TextFieldCursorHandle(TextFieldSelectionManager.this, composer5, 8);
                                                    return;
                                                }
                                                return;
                                            }
                                            composer5.skipToGroupEnd();
                                        }
                                    }), composer4, 48, 0);
                                    return;
                                }
                                composer4.skipToGroupEnd();
                            }
                        }), composer3, Integer.valueOf(((i26222 >> 9) & 112) | 6));
                        return;
                    }
                    composer3.skipToGroupEnd();
                }
            };
            composer2 = startRestartGroup;
            CoreTextFieldRootBox(onGloballyPositioned2222, textFieldSelectionManager222, ComposableLambdaKt.composableLambda(composer2, -1885146845, true, function2222), composer2, 448);
            textStyle3 = textStyle2;
            imeOptions5 = imeOptions8222;
            function13 = function12;
            brush3 = brush2;
            z10 = z4;
            keyboardActions3 = keyboardActions2;
            z11 = z5;
            function33 = function32;
            mutableInteractionSource4 = mutableInteractionSource6222;
            i19 = i25222;
            z12 = z16222;
            modifier4 = modifier5222;
            visualTransformation3 = visualTransformation5222;
            endRestartGroup = composer2.endRestartGroup();
            if (endRestartGroup == null) {
            }
        }
        i6 = i4 & 8;
        if (i6 == 0) {
        }
        i7 = i4 & 16;
        if (i7 != 0) {
        }
        i8 = i4 & 32;
        if (i8 != 0) {
        }
        i9 = i4 & 64;
        if (i9 != 0) {
        }
        if ((i2 & 29360128) == 0) {
        }
        i10 = i4 & 256;
        if (i10 != 0) {
        }
        i11 = i4 & 512;
        if (i11 != 0) {
        }
        if ((i3 & 14) == 0) {
        }
        i13 = i4 & 2048;
        if (i13 != 0) {
        }
        int i2322 = i12;
        i14 = i4 & 4096;
        if (i14 != 0) {
        }
        i15 = i4 & 8192;
        if (i15 == 0) {
        }
        i16 = i4 & 16384;
        if (i16 != 0) {
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
        if (i8 != 0) {
        }
        if (i9 != 0) {
        }
        if ((i4 & 128) != 0) {
        }
        if (i10 != 0) {
        }
        if (i11 != 0) {
        }
        if ((i4 & 1024) != 0) {
        }
        if (i13 != 0) {
        }
        if (i14 != 0) {
        }
        if (i15 != 0) {
        }
        if (i16 != 0) {
        }
        visualTransformation2 = none;
        imeOptions3 = imeOptions2;
        function12 = coreTextFieldKt$CoreTextField$1;
        mutableInteractionSource2 = mutableInteractionSource5;
        i18 = i24;
        textStyle2 = textStyle4;
        z6 = z14;
        startRestartGroup.endDefaults();
        final FocusRequester focusRequester2222 = new FocusRequester();
        startRestartGroup.startReplaceableGroup(-55013392);
        ComposerKt.sourceInformation(startRestartGroup, "195@10897L7");
        if (z6) {
        }
        textInputService = null;
        startRestartGroup.endReplaceableGroup();
        ProvidableCompositionLocal<Density> localDensity2222 = CompositionLocalsKt.getLocalDensity();
        ComposerKt.sourceInformationMarkerStart(startRestartGroup, 2023513938, "C:CompositionLocal.kt#9igjgp");
        Object consume22222 = startRestartGroup.consume(localDensity2222);
        ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
        Density density2222 = (Density) consume22222;
        ProvidableCompositionLocal<FontFamily.Resolver> localFontFamilyResolver2222 = CompositionLocalsKt.getLocalFontFamilyResolver();
        ComposerKt.sourceInformationMarkerStart(startRestartGroup, 2023513938, "C:CompositionLocal.kt#9igjgp");
        Object consume32222 = startRestartGroup.consume(localFontFamilyResolver2222);
        ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
        FontFamily.Resolver resolver2222 = (FontFamily.Resolver) consume32222;
        ProvidableCompositionLocal<TextSelectionColors> localTextSelectionColors2222 = TextSelectionColorsKt.getLocalTextSelectionColors();
        ComposerKt.sourceInformationMarkerStart(startRestartGroup, 2023513938, "C:CompositionLocal.kt#9igjgp");
        Object consume42222 = startRestartGroup.consume(localTextSelectionColors2222);
        ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
        long backgroundColor2222 = ((TextSelectionColors) consume42222).getBackgroundColor();
        ProvidableCompositionLocal<FocusManager> localFocusManager2222 = CompositionLocalsKt.getLocalFocusManager();
        ComposerKt.sourceInformationMarkerStart(startRestartGroup, 2023513938, "C:CompositionLocal.kt#9igjgp");
        Object consume52222 = startRestartGroup.consume(localFocusManager2222);
        ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
        FocusManager focusManager2222 = (FocusManager) consume52222;
        if (i18 == 1) {
        }
        Object[] objArr2222 = {orientation};
        Saver<TextFieldScrollerPosition, Object> saver2222 = TextFieldScrollerPosition.INSTANCE.getSaver();
        Modifier modifier52222 = modifier3;
        startRestartGroup.startReplaceableGroup(1157296644);
        ComposerKt.sourceInformation(startRestartGroup, "C(remember)P(1):Composables.kt#9igjgp");
        changed = startRestartGroup.changed(orientation);
        final int i252222 = i18;
        rememberedValue = startRestartGroup.rememberedValue();
        if (!changed) {
        }
        rememberedValue = (Function0) new Function0<TextFieldScrollerPosition>() { // from class: androidx.compose.foundation.text.CoreTextFieldKt$CoreTextField$scrollerPosition$1$1
            {
                super(0);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // kotlin.jvm.functions.Function0
            public final TextFieldScrollerPosition invoke() {
                return new TextFieldScrollerPosition(Orientation.this, 0.0f, 2, null);
            }
        };
        startRestartGroup.updateRememberedValue(rememberedValue);
        startRestartGroup.endReplaceableGroup();
        final TextFieldScrollerPosition textFieldScrollerPosition2222 = (TextFieldScrollerPosition) RememberSaveableKt.m1296rememberSaveable(objArr2222, (Saver) saver2222, (String) null, (Function0) rememberedValue, startRestartGroup, 72, 4);
        startRestartGroup.startReplaceableGroup(511388516);
        ComposerKt.sourceInformation(startRestartGroup, "C(remember)P(1,2):Composables.kt#9igjgp");
        changed2 = startRestartGroup.changed(value) | startRestartGroup.changed(visualTransformation2);
        rememberedValue2 = startRestartGroup.rememberedValue();
        if (changed2) {
        }
        TransformedText filter2222 = visualTransformation2.filter(value.getAnnotatedString());
        composition = value.getComposition();
        z7 = z6;
        imeOptions4 = imeOptions3;
        if (composition != null) {
        }
        rememberedValue2 = filter2222;
        startRestartGroup.updateRememberedValue(rememberedValue2);
        startRestartGroup.endReplaceableGroup();
        final TransformedText transformedText2222 = (TransformedText) rememberedValue2;
        AnnotatedString text2222 = transformedText2222.getText();
        final OffsetMapping offsetMapping2222 = transformedText2222.getOffsetMapping();
        RecomposeScope currentRecomposeScope2222 = ComposablesKt.getCurrentRecomposeScope(startRestartGroup, 0);
        startRestartGroup.startReplaceableGroup(-492369756);
        ComposerKt.sourceInformation(startRestartGroup, "C(remember):Composables.kt#9igjgp");
        final int i262222 = i17;
        rememberedValue3 = startRestartGroup.rememberedValue();
        if (rememberedValue3 == Composer.INSTANCE.getEmpty()) {
        }
        startRestartGroup.endReplaceableGroup();
        final TextFieldState textFieldState2222 = (TextFieldState) rememberedValue3;
        textFieldState2222.m763updateaKPrnQ(text2222, textStyle2, z4, density2222, resolver2222, onValueChange, keyboardActions2, focusManager2222, backgroundColor2222);
        textFieldState2222.getProcessor().reset(value, textFieldState2222.getInputSession());
        startRestartGroup.startReplaceableGroup(-492369756);
        ComposerKt.sourceInformation(startRestartGroup, "C(remember):Composables.kt#9igjgp");
        rememberedValue4 = startRestartGroup.rememberedValue();
        if (rememberedValue4 == Composer.INSTANCE.getEmpty()) {
        }
        startRestartGroup.endReplaceableGroup();
        UndoManager undoManager2222 = (UndoManager) rememberedValue4;
        UndoManager.snapshotIfNeeded$default(undoManager2222, value, 0L, 2, null);
        startRestartGroup.startReplaceableGroup(-492369756);
        ComposerKt.sourceInformation(startRestartGroup, "C(remember):Composables.kt#9igjgp");
        rememberedValue5 = startRestartGroup.rememberedValue();
        if (rememberedValue5 == Composer.INSTANCE.getEmpty()) {
        }
        startRestartGroup.endReplaceableGroup();
        final TextFieldSelectionManager textFieldSelectionManager2222 = (TextFieldSelectionManager) rememberedValue5;
        textFieldSelectionManager2222.setOffsetMapping$foundation_release(offsetMapping2222);
        textFieldSelectionManager2222.setVisualTransformation$foundation_release(visualTransformation2);
        textFieldSelectionManager2222.setOnValueChange$foundation_release(textFieldState2222.getOnValueChange());
        textFieldSelectionManager2222.setState$foundation_release(textFieldState2222);
        textFieldSelectionManager2222.setValue$foundation_release(value);
        ProvidableCompositionLocal<ClipboardManager> localClipboardManager2222 = CompositionLocalsKt.getLocalClipboardManager();
        ComposerKt.sourceInformationMarkerStart(startRestartGroup, 2023513938, "C:CompositionLocal.kt#9igjgp");
        Object consume62222 = startRestartGroup.consume(localClipboardManager2222);
        ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
        textFieldSelectionManager2222.setClipboardManager$foundation_release((ClipboardManager) consume62222);
        ProvidableCompositionLocal<TextToolbar> localTextToolbar2222 = CompositionLocalsKt.getLocalTextToolbar();
        ComposerKt.sourceInformationMarkerStart(startRestartGroup, 2023513938, "C:CompositionLocal.kt#9igjgp");
        Object consume72222 = startRestartGroup.consume(localTextToolbar2222);
        ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
        textFieldSelectionManager2222.setTextToolbar((TextToolbar) consume72222);
        ProvidableCompositionLocal<HapticFeedback> localHapticFeedback2222 = CompositionLocalsKt.getLocalHapticFeedback();
        ComposerKt.sourceInformationMarkerStart(startRestartGroup, 2023513938, "C:CompositionLocal.kt#9igjgp");
        Object consume82222 = startRestartGroup.consume(localHapticFeedback2222);
        ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
        textFieldSelectionManager2222.setHapticFeedBack((HapticFeedback) consume82222);
        textFieldSelectionManager2222.setFocusRequester(focusRequester2222);
        textFieldSelectionManager2222.setEditable(!z5);
        startRestartGroup.startReplaceableGroup(773894976);
        ComposerKt.sourceInformation(startRestartGroup, "C(rememberCoroutineScope)475@19849L144:Effects.kt#9igjgp");
        startRestartGroup.startReplaceableGroup(-492369756);
        ComposerKt.sourceInformation(startRestartGroup, "C(remember):Composables.kt#9igjgp");
        rememberedValue6 = startRestartGroup.rememberedValue();
        if (rememberedValue6 == Composer.INSTANCE.getEmpty()) {
        }
        startRestartGroup.endReplaceableGroup();
        final CoroutineScope coroutineScope2222 = ((CompositionScopedCoroutineScopeCanceller) rememberedValue6).getCoroutineScope();
        startRestartGroup.endReplaceableGroup();
        startRestartGroup.startReplaceableGroup(-492369756);
        ComposerKt.sourceInformation(startRestartGroup, "C(remember):Composables.kt#9igjgp");
        rememberedValue7 = startRestartGroup.rememberedValue();
        if (rememberedValue7 == Composer.INSTANCE.getEmpty()) {
        }
        startRestartGroup.endReplaceableGroup();
        final BringIntoViewRequester bringIntoViewRequester22222 = (BringIntoViewRequester) rememberedValue7;
        final TextInputService textInputService22222 = textInputService;
        final ImeOptions imeOptions62222 = imeOptions4;
        final boolean z162222 = z7;
        Modifier textFieldFocusModifier2222 = TextFieldGestureModifiersKt.textFieldFocusModifier(Modifier.INSTANCE, z162222, focusRequester2222, mutableInteractionSource2, new Function1<FocusState, Unit>() { // from class: androidx.compose.foundation.text.CoreTextFieldKt$CoreTextField$focusModifier$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(FocusState focusState) {
                invoke2(focusState);
                return Unit.INSTANCE;
            }

            /* renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(FocusState it) {
                TextLayoutResultProxy layoutResult;
                Intrinsics.checkNotNullParameter(it, "it");
                if (TextFieldState.this.getHasFocus() == it.isFocused()) {
                    return;
                }
                TextFieldState.this.setHasFocus(it.isFocused());
                TextInputService textInputService3 = textInputService22222;
                if (textInputService3 != null) {
                    CoreTextFieldKt.notifyTextInputServiceOnFocusChange(textInputService3, TextFieldState.this, value, imeOptions62222);
                    if (it.isFocused() && (layoutResult = TextFieldState.this.getLayoutResult()) != null) {
                        BuildersKt__Builders_commonKt.launch$default(coroutineScope2222, null, null, new CoreTextFieldKt$CoreTextField$focusModifier$1$1$1(bringIntoViewRequester22222, value, TextFieldState.this, layoutResult, offsetMapping2222, null), 3, null);
                    }
                }
                if (it.isFocused()) {
                    return;
                }
                TextFieldSelectionManager.m860deselect_kEHs6E$foundation_release$default(textFieldSelectionManager2222, null, 1, null);
            }
        });
        EffectsKt.DisposableEffect(textFieldState2222, new Function1<DisposableEffectScope, DisposableEffectResult>() { // from class: androidx.compose.foundation.text.CoreTextFieldKt$CoreTextField$2
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public final DisposableEffectResult invoke(DisposableEffectScope DisposableEffect) {
                Intrinsics.checkNotNullParameter(DisposableEffect, "$this$DisposableEffect");
                final TextFieldState textFieldState22222 = TextFieldState.this;
                return new DisposableEffectResult() { // from class: androidx.compose.foundation.text.CoreTextFieldKt$CoreTextField$2$invoke$$inlined$onDispose$1
                    @Override // androidx.compose.runtime.DisposableEffectResult
                    public void dispose() {
                        if (TextFieldState.this.getHasFocus()) {
                            CoreTextFieldKt.onBlur(TextFieldState.this);
                        }
                    }
                };
            }
        }, startRestartGroup, 8);
        if (TouchMode_androidKt.isInTouchMode()) {
        }
        final Modifier drawBehind2222 = DrawModifierKt.drawBehind(Modifier.INSTANCE, new Function1<DrawScope, Unit>() { // from class: androidx.compose.foundation.text.CoreTextFieldKt$CoreTextField$drawModifier$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(DrawScope drawScope) {
                invoke2(drawScope);
                return Unit.INSTANCE;
            }

            /* renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(DrawScope drawBehind22222) {
                Intrinsics.checkNotNullParameter(drawBehind22222, "$this$drawBehind");
                TextLayoutResultProxy layoutResult = TextFieldState.this.getLayoutResult();
                if (layoutResult != null) {
                    TextFieldValue textFieldValue = value;
                    OffsetMapping offsetMapping22222 = offsetMapping2222;
                    TextFieldState textFieldState22222 = TextFieldState.this;
                    TextFieldDelegate.INSTANCE.draw$foundation_release(drawBehind22222.getDrawContext().getCanvas(), textFieldValue, offsetMapping22222, layoutResult.getValue(), textFieldState22222.getSelectionPaint());
                }
            }
        });
        final Modifier onGloballyPositioned3222 = OnGloballyPositionedModifierKt.onGloballyPositioned(Modifier.INSTANCE, new Function1<LayoutCoordinates, Unit>() { // from class: androidx.compose.foundation.text.CoreTextFieldKt$CoreTextField$onPositionedModifier$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(LayoutCoordinates layoutCoordinates) {
                invoke2(layoutCoordinates);
                return Unit.INSTANCE;
            }

            /* renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(LayoutCoordinates it) {
                Intrinsics.checkNotNullParameter(it, "it");
                TextFieldState.this.setLayoutCoordinates(it);
                if (z162222) {
                    if (TextFieldState.this.getHandleState() == HandleState.Selection) {
                        if (TextFieldState.this.getShowFloatingToolbar()) {
                            textFieldSelectionManager2222.showSelectionToolbar$foundation_release();
                        } else {
                            textFieldSelectionManager2222.hideSelectionToolbar$foundation_release();
                        }
                        TextFieldState.this.setShowSelectionHandleStart(TextFieldSelectionManagerKt.isSelectionHandleInVisibleBound(textFieldSelectionManager2222, true));
                        TextFieldState.this.setShowSelectionHandleEnd(TextFieldSelectionManagerKt.isSelectionHandleInVisibleBound(textFieldSelectionManager2222, false));
                    } else if (TextFieldState.this.getHandleState() == HandleState.Cursor) {
                        TextFieldState.this.setShowCursorHandle(TextFieldSelectionManagerKt.isSelectionHandleInVisibleBound(textFieldSelectionManager2222, true));
                    }
                }
                TextLayoutResultProxy layoutResult = TextFieldState.this.getLayoutResult();
                if (layoutResult == null) {
                    return;
                }
                layoutResult.setInnerTextFieldCoordinates(it);
            }
        });
        final boolean z182222 = visualTransformation2 instanceof PasswordVisualTransformation;
        final ImeOptions imeOptions72222 = imeOptions4;
        final boolean z192222 = z5;
        Modifier semantics2222 = SemanticsModifierKt.semantics(Modifier.INSTANCE, true, new Function1<SemanticsPropertyReceiver, Unit>() { // from class: androidx.compose.foundation.text.CoreTextFieldKt$CoreTextField$semanticsModifier$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(SemanticsPropertyReceiver semanticsPropertyReceiver) {
                invoke2(semanticsPropertyReceiver);
                return Unit.INSTANCE;
            }

            /* renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(SemanticsPropertyReceiver semantics22222) {
                Intrinsics.checkNotNullParameter(semantics22222, "$this$semantics");
                SemanticsPropertiesKt.m3395setImeAction4L7nppU(semantics22222, ImeOptions.this.getImeAction());
                SemanticsPropertiesKt.setEditableText(semantics22222, transformedText2222.getText());
                SemanticsPropertiesKt.m3398setTextSelectionRangeFDrldGo(semantics22222, value.getSelection());
                if (!z162222) {
                    SemanticsPropertiesKt.disabled(semantics22222);
                }
                if (z182222) {
                    SemanticsPropertiesKt.password(semantics22222);
                }
                final TextFieldState textFieldState22222 = textFieldState2222;
                SemanticsPropertiesKt.getTextLayoutResult$default(semantics22222, null, new Function1<List<TextLayoutResult>, Boolean>() { // from class: androidx.compose.foundation.text.CoreTextFieldKt$CoreTextField$semanticsModifier$1.1
                    {
                        super(1);
                    }

                    @Override // kotlin.jvm.functions.Function1
                    public final Boolean invoke(List<TextLayoutResult> it) {
                        boolean z202222;
                        Intrinsics.checkNotNullParameter(it, "it");
                        if (TextFieldState.this.getLayoutResult() != null) {
                            TextLayoutResultProxy layoutResult = TextFieldState.this.getLayoutResult();
                            Intrinsics.checkNotNull(layoutResult);
                            it.add(layoutResult.getValue());
                            z202222 = true;
                        } else {
                            z202222 = false;
                        }
                        return Boolean.valueOf(z202222);
                    }
                }, 1, null);
                final TextFieldState textFieldState3 = textFieldState2222;
                SemanticsPropertiesKt.setText$default(semantics22222, null, new Function1<AnnotatedString, Boolean>() { // from class: androidx.compose.foundation.text.CoreTextFieldKt$CoreTextField$semanticsModifier$1.2
                    {
                        super(1);
                    }

                    @Override // kotlin.jvm.functions.Function1
                    public final Boolean invoke(AnnotatedString it) {
                        Intrinsics.checkNotNullParameter(it, "it");
                        TextFieldState.this.getOnValueChange().invoke(new TextFieldValue(it.getText(), TextRangeKt.TextRange(it.getText().length()), (TextRange) null, 4, (DefaultConstructorMarker) null));
                        return true;
                    }
                }, 1, null);
                final OffsetMapping offsetMapping22222 = offsetMapping2222;
                final boolean z202222 = z162222;
                final TextFieldValue textFieldValue = value;
                final TextFieldSelectionManager textFieldSelectionManager22222 = textFieldSelectionManager2222;
                final TextFieldState textFieldState4 = textFieldState2222;
                SemanticsPropertiesKt.setSelection$default(semantics22222, null, new Function3<Integer, Integer, Boolean, Boolean>() { // from class: androidx.compose.foundation.text.CoreTextFieldKt$CoreTextField$semanticsModifier$1.3
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(3);
                    }

                    @Override // kotlin.jvm.functions.Function3
                    public /* bridge */ /* synthetic */ Boolean invoke(Integer num, Integer num2, Boolean bool) {
                        return invoke(num.intValue(), num2.intValue(), bool.booleanValue());
                    }

                    public final Boolean invoke(int i27, int i28, boolean z212222) {
                        if (!z212222) {
                            i27 = OffsetMapping.this.transformedToOriginal(i27);
                        }
                        if (!z212222) {
                            i28 = OffsetMapping.this.transformedToOriginal(i28);
                        }
                        boolean z22 = false;
                        if (z202222 && (i27 != TextRange.m3486getStartimpl(textFieldValue.getSelection()) || i28 != TextRange.m3481getEndimpl(textFieldValue.getSelection()))) {
                            if (RangesKt.coerceAtMost(i27, i28) >= 0 && RangesKt.coerceAtLeast(i27, i28) <= textFieldValue.getAnnotatedString().length()) {
                                if (z212222 || i27 == i28) {
                                    textFieldSelectionManager22222.exitSelectionMode$foundation_release();
                                } else {
                                    textFieldSelectionManager22222.enterSelectionMode$foundation_release();
                                }
                                textFieldState4.getOnValueChange().invoke(new TextFieldValue(textFieldValue.getAnnotatedString(), TextRangeKt.TextRange(i27, i28), (TextRange) null, 4, (DefaultConstructorMarker) null));
                                z22 = true;
                            } else {
                                textFieldSelectionManager22222.exitSelectionMode$foundation_release();
                            }
                        }
                        return Boolean.valueOf(z22);
                    }
                }, 1, null);
                final TextFieldState textFieldState5 = textFieldState2222;
                final FocusRequester focusRequester22222 = focusRequester2222;
                final boolean z212222 = z192222;
                SemanticsPropertiesKt.onClick$default(semantics22222, null, new Function0<Boolean>() { // from class: androidx.compose.foundation.text.CoreTextFieldKt$CoreTextField$semanticsModifier$1.4
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(0);
                    }

                    /* JADX WARN: Can't rename method to resolve collision */
                    @Override // kotlin.jvm.functions.Function0
                    public final Boolean invoke() {
                        CoreTextFieldKt.tapToFocus(TextFieldState.this, focusRequester22222, !z212222);
                        return true;
                    }
                }, 1, null);
                final TextFieldSelectionManager textFieldSelectionManager3 = textFieldSelectionManager2222;
                SemanticsPropertiesKt.onLongClick$default(semantics22222, null, new Function0<Boolean>() { // from class: androidx.compose.foundation.text.CoreTextFieldKt$CoreTextField$semanticsModifier$1.5
                    {
                        super(0);
                    }

                    /* JADX WARN: Can't rename method to resolve collision */
                    @Override // kotlin.jvm.functions.Function0
                    public final Boolean invoke() {
                        TextFieldSelectionManager.this.enterSelectionMode$foundation_release();
                        return true;
                    }
                }, 1, null);
                if (!TextRange.m3480getCollapsedimpl(value.getSelection()) && !z182222) {
                    final TextFieldSelectionManager textFieldSelectionManager4 = textFieldSelectionManager2222;
                    SemanticsPropertiesKt.copyText$default(semantics22222, null, new Function0<Boolean>() { // from class: androidx.compose.foundation.text.CoreTextFieldKt$CoreTextField$semanticsModifier$1.6
                        {
                            super(0);
                        }

                        /* JADX WARN: Can't rename method to resolve collision */
                        @Override // kotlin.jvm.functions.Function0
                        public final Boolean invoke() {
                            TextFieldSelectionManager.copy$foundation_release$default(TextFieldSelectionManager.this, false, 1, null);
                            return true;
                        }
                    }, 1, null);
                    if (z162222 && !z192222) {
                        final TextFieldSelectionManager textFieldSelectionManager5 = textFieldSelectionManager2222;
                        SemanticsPropertiesKt.cutText$default(semantics22222, null, new Function0<Boolean>() { // from class: androidx.compose.foundation.text.CoreTextFieldKt$CoreTextField$semanticsModifier$1.7
                            {
                                super(0);
                            }

                            /* JADX WARN: Can't rename method to resolve collision */
                            @Override // kotlin.jvm.functions.Function0
                            public final Boolean invoke() {
                                TextFieldSelectionManager.this.cut$foundation_release();
                                return true;
                            }
                        }, 1, null);
                    }
                }
                if (!z162222 || z192222) {
                    return;
                }
                final TextFieldSelectionManager textFieldSelectionManager6 = textFieldSelectionManager2222;
                SemanticsPropertiesKt.pasteText$default(semantics22222, null, new Function0<Boolean>() { // from class: androidx.compose.foundation.text.CoreTextFieldKt$CoreTextField$semanticsModifier$1.8
                    {
                        super(0);
                    }

                    /* JADX WARN: Can't rename method to resolve collision */
                    @Override // kotlin.jvm.functions.Function0
                    public final Boolean invoke() {
                        TextFieldSelectionManager.this.paste$foundation_release();
                        return true;
                    }
                }, 1, null);
            }
        });
        final Modifier cursor2222 = TextFieldCursorKt.cursor(Modifier.INSTANCE, textFieldState2222, value, offsetMapping2222, brush2, (z162222 || z5) ? z8 : true);
        EffectsKt.DisposableEffect(textFieldSelectionManager2222, new Function1<DisposableEffectScope, DisposableEffectResult>() { // from class: androidx.compose.foundation.text.CoreTextFieldKt$CoreTextField$3
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public final DisposableEffectResult invoke(DisposableEffectScope DisposableEffect) {
                Intrinsics.checkNotNullParameter(DisposableEffect, "$this$DisposableEffect");
                final TextFieldSelectionManager textFieldSelectionManager22222 = TextFieldSelectionManager.this;
                return new DisposableEffectResult() { // from class: androidx.compose.foundation.text.CoreTextFieldKt$CoreTextField$3$invoke$$inlined$onDispose$1
                    @Override // androidx.compose.runtime.DisposableEffectResult
                    public void dispose() {
                        TextFieldSelectionManager.this.hideSelectionToolbar$foundation_release();
                    }
                };
            }
        }, startRestartGroup, 8);
        final ImeOptions imeOptions82222 = imeOptions4;
        EffectsKt.DisposableEffect(imeOptions82222, new Function1<DisposableEffectScope, DisposableEffectResult>() { // from class: androidx.compose.foundation.text.CoreTextFieldKt$CoreTextField$4
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public final DisposableEffectResult invoke(DisposableEffectScope DisposableEffect) {
                Intrinsics.checkNotNullParameter(DisposableEffect, "$this$DisposableEffect");
                if (TextInputService.this != null && textFieldState2222.getHasFocus()) {
                    textFieldState2222.setInputSession(TextFieldDelegate.INSTANCE.restartInput$foundation_release(TextInputService.this, value, textFieldState2222.getProcessor(), imeOptions82222, textFieldState2222.getOnValueChange(), textFieldState2222.getOnImeActionPerformed()));
                }
                return new DisposableEffectResult() { // from class: androidx.compose.foundation.text.CoreTextFieldKt$CoreTextField$4$invoke$$inlined$onDispose$1
                    @Override // androidx.compose.runtime.DisposableEffectResult
                    public void dispose() {
                    }
                };
            }
        }, startRestartGroup, i262222 & 14);
        MutableInteractionSource mutableInteractionSource62222 = mutableInteractionSource3;
        Modifier onGloballyPositioned22222 = OnGloballyPositionedModifierKt.onGloballyPositioned(TextFieldScrollKt.textFieldScrollable(previewKeyEventToDeselectOnBack(modifier52222.then(textFieldFocusModifier2222), textFieldState2222, textFieldSelectionManager2222).then(TextFieldKeyInputKt.textFieldKeyInput(Modifier.INSTANCE, textFieldState2222, textFieldSelectionManager2222, value, textFieldState2222.getOnValueChange(), !z5, i252222 == 1, offsetMapping2222, undoManager2222)), textFieldScrollerPosition2222, mutableInteractionSource62222, z162222).then(pointerHoverIcon$default).then(semantics2222), new Function1<LayoutCoordinates, Unit>() { // from class: androidx.compose.foundation.text.CoreTextFieldKt$CoreTextField$decorationBoxModifier$1
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(LayoutCoordinates layoutCoordinates) {
                invoke2(layoutCoordinates);
                return Unit.INSTANCE;
            }

            /* renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(LayoutCoordinates it) {
                Intrinsics.checkNotNullParameter(it, "it");
                TextLayoutResultProxy layoutResult = TextFieldState.this.getLayoutResult();
                if (layoutResult == null) {
                    return;
                }
                layoutResult.setDecorationBoxCoordinates(it);
            }
        });
        if (z162222) {
        }
        if (z9) {
        }
        final Modifier modifier62222 = companion;
        final Function3<? super Function2<? super Composer, ? super Integer, Unit>, ? super Composer, ? super Integer, Unit> function342222 = function32;
        final TextStyle textStyle52222 = textStyle2;
        final VisualTransformation visualTransformation42222 = visualTransformation2;
        final BringIntoViewRequester bringIntoViewRequester32222 = bringIntoViewRequester;
        VisualTransformation visualTransformation52222 = visualTransformation2;
        final boolean z202222 = z9;
        final boolean z212222 = z5;
        final Function1<? super TextLayoutResult, Unit> function142222 = function12;
        Function2<Composer, Integer, Unit> function22222 = new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.foundation.text.CoreTextFieldKt$CoreTextField$5
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

            public final void invoke(Composer composer3, int i27) {
                ComposerKt.sourceInformation(composer3, "C532@23298L3376:CoreTextField.kt#423gt5");
                if ((i27 & 11) != 2 || !composer3.getSkipping()) {
                    Function3<Function2<? super Composer, ? super Integer, Unit>, Composer, Integer, Unit> function35 = function342222;
                    final int i28 = i252222;
                    final TextStyle textStyle6 = textStyle52222;
                    final TextFieldScrollerPosition textFieldScrollerPosition22222 = textFieldScrollerPosition2222;
                    final TextFieldValue textFieldValue = value;
                    final VisualTransformation visualTransformation6 = visualTransformation42222;
                    final Modifier modifier7 = cursor2222;
                    final Modifier modifier8 = drawBehind2222;
                    final Modifier modifier9 = onGloballyPositioned3222;
                    final Modifier modifier10 = modifier62222;
                    final BringIntoViewRequester bringIntoViewRequester4 = bringIntoViewRequester32222;
                    final TextFieldState textFieldState22222 = textFieldState2222;
                    final TextFieldSelectionManager textFieldSelectionManager22222 = textFieldSelectionManager2222;
                    final boolean z22 = z202222;
                    final boolean z23 = z212222;
                    final Function1<? super TextLayoutResult, Unit> function15 = function142222;
                    function35.invoke(ComposableLambdaKt.composableLambda(composer3, 207445534, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.foundation.text.CoreTextFieldKt$CoreTextField$5.1
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        /* JADX WARN: Multi-variable type inference failed */
                        {
                            super(2);
                        }

                        @Override // kotlin.jvm.functions.Function2
                        public /* bridge */ /* synthetic */ Unit invoke(Composer composer4, Integer num) {
                            invoke(composer4, num.intValue());
                            return Unit.INSTANCE;
                        }

                        public final void invoke(Composer composer4, int i29) {
                            ComposerKt.sourceInformation(composer4, "C550@24083L2581:CoreTextField.kt#423gt5");
                            if ((i29 & 11) != 2 || !composer4.getSkipping()) {
                                Modifier maxLinesHeight = MaxLinesHeightModifierKt.maxLinesHeight(Modifier.INSTANCE, i28, textStyle6);
                                TextFieldScrollerPosition textFieldScrollerPosition3 = textFieldScrollerPosition22222;
                                TextFieldValue textFieldValue2 = textFieldValue;
                                VisualTransformation visualTransformation7 = visualTransformation6;
                                final TextFieldState textFieldState3 = textFieldState22222;
                                Modifier bringIntoViewRequester5 = BringIntoViewRequesterKt.bringIntoViewRequester(TextFieldSizeKt.textFieldMinSize(TextFieldScrollKt.textFieldScroll(maxLinesHeight, textFieldScrollerPosition3, textFieldValue2, visualTransformation7, new Function0<TextLayoutResultProxy>() { // from class: androidx.compose.foundation.text.CoreTextFieldKt$CoreTextField$5$1$coreTextFieldModifier$1
                                    {
                                        super(0);
                                    }

                                    /* JADX WARN: Can't rename method to resolve collision */
                                    @Override // kotlin.jvm.functions.Function0
                                    public final TextLayoutResultProxy invoke() {
                                        return TextFieldState.this.getLayoutResult();
                                    }
                                }).then(modifier7).then(modifier8), textStyle6).then(modifier9).then(modifier10), bringIntoViewRequester4);
                                final TextFieldSelectionManager textFieldSelectionManager3 = textFieldSelectionManager22222;
                                final TextFieldState textFieldState4 = textFieldState22222;
                                final boolean z24 = z22;
                                final boolean z25 = z23;
                                final Function1<? super TextLayoutResult, Unit> function16 = function15;
                                SimpleLayoutKt.SimpleLayout(bringIntoViewRequester5, ComposableLambdaKt.composableLambda(composer4, 19580180, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.foundation.text.CoreTextFieldKt.CoreTextField.5.1.1
                                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                    /* JADX WARN: Multi-variable type inference failed */
                                    {
                                        super(2);
                                    }

                                    @Override // kotlin.jvm.functions.Function2
                                    public /* bridge */ /* synthetic */ Unit invoke(Composer composer5, Integer num) {
                                        invoke(composer5, num.intValue());
                                        return Unit.INSTANCE;
                                    }

                                    public final void invoke(Composer composer5, int i30) {
                                        ComposerKt.sourceInformation(composer5, "C551@24137L1909,591@26064L327,603@26592L40:CoreTextField.kt#423gt5");
                                        if ((i30 & 11) != 2 || !composer5.getSkipping()) {
                                            final TextFieldState textFieldState5 = textFieldState4;
                                            final Function1<? super TextLayoutResult, Unit> function17 = function16;
                                            MeasurePolicy measurePolicy = new MeasurePolicy() { // from class: androidx.compose.foundation.text.CoreTextFieldKt.CoreTextField.5.1.1.2
                                                @Override // androidx.compose.ui.layout.MeasurePolicy
                                                /* renamed from: measure-3p2s80s */
                                                public MeasureResult mo15measure3p2s80s(MeasureScope measure, List<? extends Measurable> measurables, long j) {
                                                    Intrinsics.checkNotNullParameter(measure, "$this$measure");
                                                    Intrinsics.checkNotNullParameter(measurables, "measurables");
                                                    Snapshot.Companion companion3 = Snapshot.INSTANCE;
                                                    TextFieldState textFieldState6 = TextFieldState.this;
                                                    Snapshot createNonObservableSnapshot = companion3.createNonObservableSnapshot();
                                                    try {
                                                        Snapshot makeCurrent = createNonObservableSnapshot.makeCurrent();
                                                        try {
                                                            TextLayoutResultProxy layoutResult = textFieldState6.getLayoutResult();
                                                            TextLayoutResult value2 = layoutResult != null ? layoutResult.getValue() : null;
                                                            createNonObservableSnapshot.dispose();
                                                            Triple<Integer, Integer, TextLayoutResult> m748layout_EkL_Y$foundation_release = TextFieldDelegate.INSTANCE.m748layout_EkL_Y$foundation_release(TextFieldState.this.getTextDelegate(), j, measure.getLayoutDirection(), value2);
                                                            int intValue = m748layout_EkL_Y$foundation_release.component1().intValue();
                                                            int intValue2 = m748layout_EkL_Y$foundation_release.component2().intValue();
                                                            TextLayoutResult component3 = m748layout_EkL_Y$foundation_release.component3();
                                                            if (!Intrinsics.areEqual(value2, component3)) {
                                                                TextFieldState.this.setLayoutResult(new TextLayoutResultProxy(component3));
                                                                function17.invoke(component3);
                                                            }
                                                            return measure.layout(intValue, intValue2, MapsKt.mapOf(TuplesKt.to(AlignmentLineKt.getFirstBaseline(), Integer.valueOf(MathKt.roundToInt(component3.getFirstBaseline()))), TuplesKt.to(AlignmentLineKt.getLastBaseline(), Integer.valueOf(MathKt.roundToInt(component3.getLastBaseline())))), new Function1<Placeable.PlacementScope, Unit>() { // from class: androidx.compose.foundation.text.CoreTextFieldKt$CoreTextField$5$1$1$2$measure$1
                                                                /* renamed from: invoke, reason: avoid collision after fix types in other method */
                                                                public final void invoke2(Placeable.PlacementScope layout) {
                                                                    Intrinsics.checkNotNullParameter(layout, "$this$layout");
                                                                }

                                                                @Override // kotlin.jvm.functions.Function1
                                                                public /* bridge */ /* synthetic */ Unit invoke(Placeable.PlacementScope placementScope) {
                                                                    invoke2(placementScope);
                                                                    return Unit.INSTANCE;
                                                                }
                                                            });
                                                        } finally {
                                                            createNonObservableSnapshot.restoreCurrent(makeCurrent);
                                                        }
                                                    } catch (Throwable th) {
                                                        createNonObservableSnapshot.dispose();
                                                        throw th;
                                                    }
                                                }

                                                @Override // androidx.compose.ui.layout.MeasurePolicy
                                                public int maxIntrinsicWidth(IntrinsicMeasureScope intrinsicMeasureScope, List<? extends IntrinsicMeasurable> measurables, int i31) {
                                                    Intrinsics.checkNotNullParameter(intrinsicMeasureScope, "<this>");
                                                    Intrinsics.checkNotNullParameter(measurables, "measurables");
                                                    TextFieldState.this.getTextDelegate().layoutIntrinsics(intrinsicMeasureScope.getLayoutDirection());
                                                    return TextFieldState.this.getTextDelegate().getMaxIntrinsicWidth();
                                                }
                                            };
                                            composer5.startReplaceableGroup(-1323940314);
                                            ComposerKt.sourceInformation(composer5, "C(Layout)P(!1,2)74@2915L7,75@2970L7,76@3029L7,77@3041L460:Layout.kt#80mrfh");
                                            Modifier.Companion companion3 = Modifier.INSTANCE;
                                            ProvidableCompositionLocal<Density> localDensity22222 = CompositionLocalsKt.getLocalDensity();
                                            ComposerKt.sourceInformationMarkerStart(composer5, 2023513938, "C:CompositionLocal.kt#9igjgp");
                                            Object consume9 = composer5.consume(localDensity22222);
                                            ComposerKt.sourceInformationMarkerEnd(composer5);
                                            Density density22222 = (Density) consume9;
                                            ProvidableCompositionLocal<LayoutDirection> localLayoutDirection = CompositionLocalsKt.getLocalLayoutDirection();
                                            ComposerKt.sourceInformationMarkerStart(composer5, 2023513938, "C:CompositionLocal.kt#9igjgp");
                                            Object consume10 = composer5.consume(localLayoutDirection);
                                            ComposerKt.sourceInformationMarkerEnd(composer5);
                                            LayoutDirection layoutDirection = (LayoutDirection) consume10;
                                            ProvidableCompositionLocal<ViewConfiguration> localViewConfiguration = CompositionLocalsKt.getLocalViewConfiguration();
                                            ComposerKt.sourceInformationMarkerStart(composer5, 2023513938, "C:CompositionLocal.kt#9igjgp");
                                            Object consume11 = composer5.consume(localViewConfiguration);
                                            ComposerKt.sourceInformationMarkerEnd(composer5);
                                            ViewConfiguration viewConfiguration = (ViewConfiguration) consume11;
                                            Function0<ComposeUiNode> constructor = ComposeUiNode.INSTANCE.getConstructor();
                                            Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> materializerOf = LayoutKt.materializerOf(companion3);
                                            if (!(composer5.getApplier() instanceof Applier)) {
                                                ComposablesKt.invalidApplier();
                                            }
                                            composer5.startReusableNode();
                                            if (composer5.getInserting()) {
                                                composer5.createNode(constructor);
                                            } else {
                                                composer5.useNode();
                                            }
                                            composer5.disableReusing();
                                            Composer m1283constructorimpl = Updater.m1283constructorimpl(composer5);
                                            Updater.m1290setimpl(m1283constructorimpl, measurePolicy, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
                                            Updater.m1290setimpl(m1283constructorimpl, density22222, ComposeUiNode.INSTANCE.getSetDensity());
                                            Updater.m1290setimpl(m1283constructorimpl, layoutDirection, ComposeUiNode.INSTANCE.getSetLayoutDirection());
                                            Updater.m1290setimpl(m1283constructorimpl, viewConfiguration, ComposeUiNode.INSTANCE.getSetViewConfiguration());
                                            composer5.enableReusing();
                                            boolean z26 = false;
                                            materializerOf.invoke(SkippableUpdater.m1273boximpl(SkippableUpdater.m1274constructorimpl(composer5)), composer5, 0);
                                            composer5.startReplaceableGroup(2058660585);
                                            composer5.startReplaceableGroup(1714611517);
                                            ComposerKt.sourceInformation(composer5, "C:CoreTextField.kt#423gt5");
                                            composer5.endReplaceableGroup();
                                            composer5.endReplaceableGroup();
                                            composer5.endNode();
                                            composer5.endReplaceableGroup();
                                            TextFieldSelectionManager textFieldSelectionManager4 = TextFieldSelectionManager.this;
                                            if (textFieldState4.getHandleState() == HandleState.Selection && textFieldState4.getLayoutCoordinates() != null) {
                                                LayoutCoordinates layoutCoordinates = textFieldState4.getLayoutCoordinates();
                                                Intrinsics.checkNotNull(layoutCoordinates);
                                                if (layoutCoordinates.isAttached() && z24) {
                                                    z26 = true;
                                                }
                                            }
                                            CoreTextFieldKt.SelectionToolbarAndHandles(textFieldSelectionManager4, z26, composer5, 8);
                                            if (textFieldState4.getHandleState() == HandleState.Cursor && !z25 && z24) {
                                                CoreTextFieldKt.TextFieldCursorHandle(TextFieldSelectionManager.this, composer5, 8);
                                                return;
                                            }
                                            return;
                                        }
                                        composer5.skipToGroupEnd();
                                    }
                                }), composer4, 48, 0);
                                return;
                            }
                            composer4.skipToGroupEnd();
                        }
                    }), composer3, Integer.valueOf(((i262222 >> 9) & 112) | 6));
                    return;
                }
                composer3.skipToGroupEnd();
            }
        };
        composer2 = startRestartGroup;
        CoreTextFieldRootBox(onGloballyPositioned22222, textFieldSelectionManager2222, ComposableLambdaKt.composableLambda(composer2, -1885146845, true, function22222), composer2, 448);
        textStyle3 = textStyle2;
        imeOptions5 = imeOptions82222;
        function13 = function12;
        brush3 = brush2;
        z10 = z4;
        keyboardActions3 = keyboardActions2;
        z11 = z5;
        function33 = function32;
        mutableInteractionSource4 = mutableInteractionSource62222;
        i19 = i252222;
        z12 = z162222;
        modifier4 = modifier52222;
        visualTransformation3 = visualTransformation52222;
        endRestartGroup = composer2.endRestartGroup();
        if (endRestartGroup == null) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void CoreTextFieldRootBox(final Modifier modifier, final TextFieldSelectionManager textFieldSelectionManager, final Function2<? super Composer, ? super Integer, Unit> function2, Composer composer, final int i) {
        Composer startRestartGroup = composer.startRestartGroup(-20551815);
        ComposerKt.sourceInformation(startRestartGroup, "C(CoreTextFieldRootBox)P(2,1)616@26838L95:CoreTextField.kt#423gt5");
        startRestartGroup.startReplaceableGroup(733328855);
        ComposerKt.sourceInformation(startRestartGroup, "C(Box)P(2,1,3)70@3267L67,71@3339L130:Box.kt#2w3rfo");
        MeasurePolicy rememberBoxMeasurePolicy = BoxKt.rememberBoxMeasurePolicy(Alignment.INSTANCE.getTopStart(), true, startRestartGroup, 48);
        startRestartGroup.startReplaceableGroup(-1323940314);
        ComposerKt.sourceInformation(startRestartGroup, "C(Layout)P(!1,2)74@2915L7,75@2970L7,76@3029L7,77@3041L460:Layout.kt#80mrfh");
        ProvidableCompositionLocal<Density> localDensity = CompositionLocalsKt.getLocalDensity();
        ComposerKt.sourceInformationMarkerStart(startRestartGroup, 2023513938, "C:CompositionLocal.kt#9igjgp");
        Object consume = startRestartGroup.consume(localDensity);
        ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
        Density density = (Density) consume;
        ProvidableCompositionLocal<LayoutDirection> localLayoutDirection = CompositionLocalsKt.getLocalLayoutDirection();
        ComposerKt.sourceInformationMarkerStart(startRestartGroup, 2023513938, "C:CompositionLocal.kt#9igjgp");
        Object consume2 = startRestartGroup.consume(localLayoutDirection);
        ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
        LayoutDirection layoutDirection = (LayoutDirection) consume2;
        ProvidableCompositionLocal<ViewConfiguration> localViewConfiguration = CompositionLocalsKt.getLocalViewConfiguration();
        ComposerKt.sourceInformationMarkerStart(startRestartGroup, 2023513938, "C:CompositionLocal.kt#9igjgp");
        Object consume3 = startRestartGroup.consume(localViewConfiguration);
        ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
        ViewConfiguration viewConfiguration = (ViewConfiguration) consume3;
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
        Updater.m1290setimpl(m1283constructorimpl, rememberBoxMeasurePolicy, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
        Updater.m1290setimpl(m1283constructorimpl, density, ComposeUiNode.INSTANCE.getSetDensity());
        Updater.m1290setimpl(m1283constructorimpl, layoutDirection, ComposeUiNode.INSTANCE.getSetLayoutDirection());
        Updater.m1290setimpl(m1283constructorimpl, viewConfiguration, ComposeUiNode.INSTANCE.getSetViewConfiguration());
        startRestartGroup.enableReusing();
        materializerOf.invoke(SkippableUpdater.m1273boximpl(SkippableUpdater.m1274constructorimpl(startRestartGroup)), startRestartGroup, 0);
        startRestartGroup.startReplaceableGroup(2058660585);
        startRestartGroup.startReplaceableGroup(-2137368960);
        ComposerKt.sourceInformation(startRestartGroup, "C72@3384L9:Box.kt#2w3rfo");
        BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
        startRestartGroup.startReplaceableGroup(1524757375);
        ComposerKt.sourceInformation(startRestartGroup, "C617@26894L33:CoreTextField.kt#423gt5");
        ContextMenu_androidKt.ContextMenuArea(textFieldSelectionManager, function2, startRestartGroup, ((i >> 3) & 112) | 8);
        startRestartGroup.endReplaceableGroup();
        startRestartGroup.endReplaceableGroup();
        startRestartGroup.endReplaceableGroup();
        startRestartGroup.endNode();
        startRestartGroup.endReplaceableGroup();
        startRestartGroup.endReplaceableGroup();
        ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup == null) {
            return;
        }
        endRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.foundation.text.CoreTextFieldKt$CoreTextFieldRootBox$2
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

            public final void invoke(Composer composer2, int i2) {
                CoreTextFieldKt.CoreTextFieldRootBox(Modifier.this, textFieldSelectionManager, function2, composer2, i | 1);
            }
        });
    }

    private static final Modifier previewKeyEventToDeselectOnBack(Modifier modifier, final TextFieldState textFieldState, final TextFieldSelectionManager textFieldSelectionManager) {
        return KeyInputModifierKt.onPreviewKeyEvent(modifier, new Function1<KeyEvent, Boolean>() { // from class: androidx.compose.foundation.text.CoreTextFieldKt$previewKeyEventToDeselectOnBack$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Boolean invoke(KeyEvent keyEvent) {
                return m690invokeZmokQxo(keyEvent.m2851unboximpl());
            }

            /* renamed from: invoke-ZmokQxo, reason: not valid java name */
            public final Boolean m690invokeZmokQxo(android.view.KeyEvent keyEvent) {
                boolean z;
                Intrinsics.checkNotNullParameter(keyEvent, "keyEvent");
                if (TextFieldState.this.getHandleState() == HandleState.Selection && KeyEventHelpers_androidKt.m695cancelsTextSelectionZmokQxo(keyEvent)) {
                    z = true;
                    TextFieldSelectionManager.m860deselect_kEHs6E$foundation_release$default(textFieldSelectionManager, null, 1, null);
                } else {
                    z = false;
                }
                return Boolean.valueOf(z);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void tapToFocus(TextFieldState textFieldState, FocusRequester focusRequester, boolean z) {
        TextInputSession inputSession;
        if (!textFieldState.getHasFocus()) {
            focusRequester.requestFocus();
        } else {
            if (!z || (inputSession = textFieldState.getInputSession()) == null) {
                return;
            }
            inputSession.showSoftwareKeyboard();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void notifyTextInputServiceOnFocusChange(TextInputService textInputService, TextFieldState textFieldState, TextFieldValue textFieldValue, ImeOptions imeOptions) {
        if (textFieldState.getHasFocus()) {
            textFieldState.setInputSession(TextFieldDelegate.INSTANCE.onFocus$foundation_release(textInputService, textFieldValue, textFieldState.getProcessor(), imeOptions, textFieldState.getOnValueChange(), textFieldState.getOnImeActionPerformed()));
        } else {
            onBlur(textFieldState);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void onBlur(TextFieldState textFieldState) {
        TextInputSession inputSession = textFieldState.getInputSession();
        if (inputSession != null) {
            TextFieldDelegate.INSTANCE.onBlur$foundation_release(inputSession, textFieldState.getProcessor(), textFieldState.getOnValueChange());
        }
        textFieldState.setInputSession(null);
    }

    public static final Object bringSelectionEndIntoView(BringIntoViewRequester bringIntoViewRequester, TextFieldValue textFieldValue, TextDelegate textDelegate, TextLayoutResult textLayoutResult, OffsetMapping offsetMapping, Continuation<? super Unit> continuation) {
        Rect rect;
        int originalToTransformed = offsetMapping.originalToTransformed(TextRange.m3483getMaximpl(textFieldValue.getSelection()));
        if (originalToTransformed < textLayoutResult.getLayoutInput().getText().length()) {
            rect = textLayoutResult.getBoundingBox(originalToTransformed);
        } else if (originalToTransformed != 0) {
            rect = textLayoutResult.getBoundingBox(originalToTransformed - 1);
        } else {
            rect = new Rect(0.0f, 0.0f, 1.0f, IntSize.m3999getHeightimpl(TextFieldDelegateKt.computeSizeForDefaultText$default(textDelegate.getStyle(), textDelegate.getDensity(), textDelegate.getFontFamilyResolver(), null, 0, 24, null)));
        }
        Object bringIntoView = bringIntoViewRequester.bringIntoView(rect, continuation);
        return bringIntoView == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? bringIntoView : Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void SelectionToolbarAndHandles(final TextFieldSelectionManager textFieldSelectionManager, final boolean z, Composer composer, final int i) {
        TextLayoutResultProxy layoutResult;
        Composer startRestartGroup = composer.startRestartGroup(626339208);
        ComposerKt.sourceInformation(startRestartGroup, "C(SelectionToolbarAndHandles)914@38583L202:CoreTextField.kt#423gt5");
        if (z) {
            TextFieldState state = textFieldSelectionManager.getState();
            TextLayoutResult value = (state == null || (layoutResult = state.getLayoutResult()) == null) ? null : layoutResult.getValue();
            if (value != null) {
                if (!TextRange.m3480getCollapsedimpl(textFieldSelectionManager.getValue$foundation_release().getSelection())) {
                    int originalToTransformed = textFieldSelectionManager.getOffsetMapping().originalToTransformed(TextRange.m3486getStartimpl(textFieldSelectionManager.getValue$foundation_release().getSelection()));
                    int originalToTransformed2 = textFieldSelectionManager.getOffsetMapping().originalToTransformed(TextRange.m3481getEndimpl(textFieldSelectionManager.getValue$foundation_release().getSelection()));
                    ResolvedTextDirection bidiRunDirection = value.getBidiRunDirection(originalToTransformed);
                    ResolvedTextDirection bidiRunDirection2 = value.getBidiRunDirection(Math.max(originalToTransformed2 - 1, 0));
                    startRestartGroup.startReplaceableGroup(-498396421);
                    ComposerKt.sourceInformation(startRestartGroup, "907@38260L203");
                    TextFieldState state2 = textFieldSelectionManager.getState();
                    if (state2 != null && state2.getShowSelectionHandleStart()) {
                        TextFieldSelectionManagerKt.TextFieldSelectionHandle(true, bidiRunDirection, textFieldSelectionManager, startRestartGroup, 518);
                    }
                    startRestartGroup.endReplaceableGroup();
                    TextFieldState state3 = textFieldSelectionManager.getState();
                    if (state3 != null && state3.getShowSelectionHandleEnd()) {
                        TextFieldSelectionManagerKt.TextFieldSelectionHandle(false, bidiRunDirection2, textFieldSelectionManager, startRestartGroup, 518);
                    }
                }
                TextFieldState state4 = textFieldSelectionManager.getState();
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
        ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup == null) {
            return;
        }
        endRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.foundation.text.CoreTextFieldKt$SelectionToolbarAndHandles$2
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(2);
            }

            @Override // kotlin.jvm.functions.Function2
            public /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                invoke(composer2, num.intValue());
                return Unit.INSTANCE;
            }

            public final void invoke(Composer composer2, int i2) {
                CoreTextFieldKt.SelectionToolbarAndHandles(TextFieldSelectionManager.this, z, composer2, i | 1);
            }
        });
    }

    public static final void TextFieldCursorHandle(final TextFieldSelectionManager manager, Composer composer, final int i) {
        Intrinsics.checkNotNullParameter(manager, "manager");
        Composer startRestartGroup = composer.startRestartGroup(-1436003720);
        ComposerKt.sourceInformation(startRestartGroup, "C(TextFieldCursorHandle)940@39636L50,941@39749L7,948@40006L205,942@39766L483:CoreTextField.kt#423gt5");
        TextFieldState state = manager.getState();
        if (state != null && state.getShowCursorHandle()) {
            startRestartGroup.startReplaceableGroup(1157296644);
            ComposerKt.sourceInformation(startRestartGroup, "C(remember)P(1):Composables.kt#9igjgp");
            boolean changed = startRestartGroup.changed(manager);
            Object rememberedValue = startRestartGroup.rememberedValue();
            if (changed || rememberedValue == Composer.INSTANCE.getEmpty()) {
                rememberedValue = manager.cursorDragObserver$foundation_release();
                startRestartGroup.updateRememberedValue(rememberedValue);
            }
            startRestartGroup.endReplaceableGroup();
            TextDragObserver textDragObserver = (TextDragObserver) rememberedValue;
            ProvidableCompositionLocal<Density> localDensity = CompositionLocalsKt.getLocalDensity();
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, 2023513938, "C:CompositionLocal.kt#9igjgp");
            Object consume = startRestartGroup.consume(localDensity);
            ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
            final long m865getCursorPositiontuRUvjQ$foundation_release = manager.m865getCursorPositiontuRUvjQ$foundation_release((Density) consume);
            Modifier pointerInput = SuspendingPointerInputFilterKt.pointerInput(Modifier.INSTANCE, textDragObserver, new CoreTextFieldKt$TextFieldCursorHandle$1(textDragObserver, null));
            Offset m1381boximpl = Offset.m1381boximpl(m865getCursorPositiontuRUvjQ$foundation_release);
            startRestartGroup.startReplaceableGroup(1157296644);
            ComposerKt.sourceInformation(startRestartGroup, "C(remember)P(1):Composables.kt#9igjgp");
            boolean changed2 = startRestartGroup.changed(m1381boximpl);
            Object rememberedValue2 = startRestartGroup.rememberedValue();
            if (changed2 || rememberedValue2 == Composer.INSTANCE.getEmpty()) {
                rememberedValue2 = (Function1) new Function1<SemanticsPropertyReceiver, Unit>() { // from class: androidx.compose.foundation.text.CoreTextFieldKt$TextFieldCursorHandle$2$1
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(1);
                    }

                    @Override // kotlin.jvm.functions.Function1
                    public /* bridge */ /* synthetic */ Unit invoke(SemanticsPropertyReceiver semanticsPropertyReceiver) {
                        invoke2(semanticsPropertyReceiver);
                        return Unit.INSTANCE;
                    }

                    /* renamed from: invoke, reason: avoid collision after fix types in other method */
                    public final void invoke2(SemanticsPropertyReceiver semantics) {
                        Intrinsics.checkNotNullParameter(semantics, "$this$semantics");
                        semantics.set(SelectionHandlesKt.getSelectionHandleInfoKey(), new SelectionHandleInfo(Handle.Cursor, m865getCursorPositiontuRUvjQ$foundation_release, null));
                    }
                };
                startRestartGroup.updateRememberedValue(rememberedValue2);
            }
            startRestartGroup.endReplaceableGroup();
            AndroidCursorHandle_androidKt.m673CursorHandleULxng0E(m865getCursorPositiontuRUvjQ$foundation_release, SemanticsModifierKt.semantics$default(pointerInput, false, (Function1) rememberedValue2, 1, null), null, startRestartGroup, 384);
        }
        ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup == null) {
            return;
        }
        endRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.foundation.text.CoreTextFieldKt$TextFieldCursorHandle$3
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(2);
            }

            @Override // kotlin.jvm.functions.Function2
            public /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                invoke(composer2, num.intValue());
                return Unit.INSTANCE;
            }

            public final void invoke(Composer composer2, int i2) {
                CoreTextFieldKt.TextFieldCursorHandle(TextFieldSelectionManager.this, composer2, i | 1);
            }
        });
    }
}
