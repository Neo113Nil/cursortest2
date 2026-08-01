package androidx.compose.material;

import androidx.compose.animation.core.AnimateAsStateKt;
import androidx.compose.animation.core.AnimationSpec;
import androidx.compose.animation.core.TweenSpec;
import androidx.compose.foundation.CanvasKt;
import androidx.compose.foundation.gestures.Orientation;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.BoxScopeInstance;
import androidx.compose.foundation.layout.ColumnKt;
import androidx.compose.foundation.layout.ColumnScopeInstance;
import androidx.compose.foundation.layout.OffsetKt;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.runtime.Applier;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionScopedCoroutineScopeCanceller;
import androidx.compose.runtime.EffectsKt;
import androidx.compose.runtime.ProvidableCompositionLocal;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.SkippableUpdater;
import androidx.compose.runtime.State;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambda;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.runtime.saveable.RememberSaveableKt;
import androidx.compose.runtime.saveable.Saver;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.ZIndexModifierKt;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.GraphicsLayerModifierKt;
import androidx.compose.ui.graphics.Shape;
import androidx.compose.ui.graphics.drawscope.DrawScope;
import androidx.compose.ui.input.nestedscroll.NestedScrollModifierKt;
import androidx.compose.ui.input.pointer.PointerInputScope;
import androidx.compose.ui.input.pointer.SuspendingPointerInputFilterKt;
import androidx.compose.ui.layout.LayoutKt;
import androidx.compose.ui.layout.Measurable;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.layout.MeasureResult;
import androidx.compose.ui.layout.MeasureScope;
import androidx.compose.ui.layout.Placeable;
import androidx.compose.ui.layout.SubcomposeLayoutKt;
import androidx.compose.ui.layout.SubcomposeMeasureScope;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.platform.CompositionLocalsKt;
import androidx.compose.ui.platform.ViewConfiguration;
import androidx.compose.ui.semantics.SemanticsModifierKt;
import androidx.compose.ui.semantics.SemanticsPropertiesKt;
import androidx.compose.ui.semantics.SemanticsPropertyReceiver;
import androidx.compose.ui.unit.Constraints;
import androidx.compose.ui.unit.ConstraintsKt;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.Dp;
import androidx.compose.ui.unit.IntOffset;
import androidx.compose.ui.unit.IntOffsetKt;
import androidx.compose.ui.unit.LayoutDirection;
import androidx.core.view.accessibility.AccessibilityEventCompat;
import androidx.profileinstaller.ProfileVerifier;
import com.google.android.exoplayer2.C;
import com.vungle.ads.internal.protos.Sdk;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.TuplesKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.collections.MapsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.EmptyCoroutineContext;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.functions.Function4;
import kotlin.jvm.internal.Intrinsics;
import kotlin.math.MathKt;
import kotlin.ranges.RangesKt;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;

/* compiled from: BackdropScaffold.kt */
@Metadata(d1 = {"\u0000r\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a;\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0011\u0010\u0007\u001a\r\u0012\u0004\u0012\u00020\u00040\b¢\u0006\u0002\b\t2\u0011\u0010\n\u001a\r\u0012\u0004\u0012\u00020\u00040\b¢\u0006\u0002\b\tH\u0003¢\u0006\u0002\u0010\u000b\u001aõ\u0001\u0010\f\u001a\u00020\u00042\u0011\u0010\u0007\u001a\r\u0012\u0004\u0012\u00020\u00040\b¢\u0006\u0002\b\t2\u0011\u0010\r\u001a\r\u0012\u0004\u0012\u00020\u00040\b¢\u0006\u0002\b\t2\u0011\u0010\u000e\u001a\r\u0012\u0004\u0012\u00020\u00040\b¢\u0006\u0002\b\t2\b\b\u0002\u0010\u000f\u001a\u00020\u00102\b\b\u0002\u0010\u0011\u001a\u00020\u00122\b\b\u0002\u0010\u0013\u001a\u00020\u00142\b\b\u0002\u0010\u0015\u001a\u00020\u00012\b\b\u0002\u0010\u0016\u001a\u00020\u00012\b\b\u0002\u0010\u0017\u001a\u00020\u00142\b\b\u0002\u0010\u0018\u001a\u00020\u00142\b\b\u0002\u0010\u0019\u001a\u00020\u001a2\b\b\u0002\u0010\u001b\u001a\u00020\u001a2\b\b\u0002\u0010\u001c\u001a\u00020\u001d2\b\b\u0002\u0010\u001e\u001a\u00020\u00012\b\b\u0002\u0010\u001f\u001a\u00020\u001a2\b\b\u0002\u0010 \u001a\u00020\u001a2\b\b\u0002\u0010!\u001a\u00020\u001a2\u0019\b\u0002\u0010\"\u001a\u0013\u0012\u0004\u0012\u00020$\u0012\u0004\u0012\u00020\u00040#¢\u0006\u0002\b\tH\u0007ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b%\u0010&\u001ah\u0010'\u001a\u00020\u00042\u0006\u0010\u000f\u001a\u00020\u00102\u0016\u0010(\u001a\u0012\u0012\u0004\u0012\u00020\u00040\b¢\u0006\u0002\b\t¢\u0006\u0002\b)2\u0012\u0010*\u001a\u000e\u0012\u0004\u0012\u00020+\u0012\u0004\u0012\u00020+0#2\"\u0010,\u001a\u001e\u0012\u0004\u0012\u00020+\u0012\u0004\u0012\u00020.\u0012\u0004\u0012\u00020\u00040-¢\u0006\u0002\b\t¢\u0006\u0002\b)H\u0003ø\u0001\u0000¢\u0006\u0002\u0010/\u001a3\u00100\u001a\u00020\u00042\u0006\u00101\u001a\u00020\u001a2\f\u00102\u001a\b\u0012\u0004\u0012\u00020\u00040\b2\u0006\u00103\u001a\u00020\u0014H\u0003ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b4\u00105\u001aE\u00106\u001a\u00020\u00122\u0006\u00107\u001a\u00020\u00062\u000e\b\u0002\u00108\u001a\b\u0012\u0004\u0012\u00020.092\u0014\b\u0002\u0010:\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00140#2\b\b\u0002\u0010;\u001a\u00020$H\u0007¢\u0006\u0002\u0010<\"\u0013\u0010\u0000\u001a\u00020\u0001X\u0082\u0004ø\u0001\u0000¢\u0006\u0004\n\u0002\u0010\u0002\u0082\u0002\u000b\n\u0002\b\u0019\n\u0005\b¡\u001e0\u0001¨\u0006="}, d2 = {"AnimationSlideOffset", "Landroidx/compose/ui/unit/Dp;", "F", "BackLayerTransition", "", "target", "Landroidx/compose/material/BackdropValue;", "appBar", "Lkotlin/Function0;", "Landroidx/compose/runtime/Composable;", "content", "(Landroidx/compose/material/BackdropValue;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;Landroidx/compose/runtime/Composer;I)V", "BackdropScaffold", "backLayerContent", "frontLayerContent", "modifier", "Landroidx/compose/ui/Modifier;", "scaffoldState", "Landroidx/compose/material/BackdropScaffoldState;", "gesturesEnabled", "", "peekHeight", "headerHeight", "persistentAppBar", "stickyFrontLayer", "backLayerBackgroundColor", "Landroidx/compose/ui/graphics/Color;", "backLayerContentColor", "frontLayerShape", "Landroidx/compose/ui/graphics/Shape;", "frontLayerElevation", "frontLayerBackgroundColor", "frontLayerContentColor", "frontLayerScrimColor", "snackbarHost", "Lkotlin/Function1;", "Landroidx/compose/material/SnackbarHostState;", "BackdropScaffold-BZszfkY", "(Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;Landroidx/compose/ui/Modifier;Landroidx/compose/material/BackdropScaffoldState;ZFFZZJJLandroidx/compose/ui/graphics/Shape;FJJJLkotlin/jvm/functions/Function3;Landroidx/compose/runtime/Composer;III)V", "BackdropStack", "backLayer", "Landroidx/compose/ui/UiComposable;", "calculateBackLayerConstraints", "Landroidx/compose/ui/unit/Constraints;", "frontLayer", "Lkotlin/Function2;", "", "(Landroidx/compose/ui/Modifier;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function4;Landroidx/compose/runtime/Composer;I)V", "Scrim", "color", "onDismiss", "visible", "Scrim-3J-VO9M", "(JLkotlin/jvm/functions/Function0;ZLandroidx/compose/runtime/Composer;I)V", "rememberBackdropScaffoldState", "initialValue", "animationSpec", "Landroidx/compose/animation/core/AnimationSpec;", "confirmStateChange", "snackbarHostState", "(Landroidx/compose/material/BackdropValue;Landroidx/compose/animation/core/AnimationSpec;Lkotlin/jvm/functions/Function1;Landroidx/compose/material/SnackbarHostState;Landroidx/compose/runtime/Composer;II)Landroidx/compose/material/BackdropScaffoldState;", "material_release"}, k = 2, mv = {1, 6, 0}, xi = 48)
/* loaded from: classes.dex */
public final class BackdropScaffoldKt {
    private static final float AnimationSlideOffset = Dp.m3840constructorimpl(20);

    @ExperimentalMaterialApi
    public static final BackdropScaffoldState rememberBackdropScaffoldState(final BackdropValue initialValue, final AnimationSpec<Float> animationSpec, final Function1<? super BackdropValue, Boolean> function1, final SnackbarHostState snackbarHostState, Composer composer, int i, int i2) {
        Intrinsics.checkNotNullParameter(initialValue, "initialValue");
        composer.startReplaceableGroup(-862178912);
        ComposerKt.sourceInformation(composer, "C(rememberBackdropScaffoldState)P(2)171@6447L32,173@6518L538:BackdropScaffold.kt#jmzs0o");
        if ((i2 & 2) != 0) {
            animationSpec = SwipeableDefaults.INSTANCE.getAnimationSpec();
        }
        if ((i2 & 4) != 0) {
            function1 = new Function1<BackdropValue, Boolean>() { // from class: androidx.compose.material.BackdropScaffoldKt$rememberBackdropScaffoldState$1
                @Override // kotlin.jvm.functions.Function1
                public final Boolean invoke(BackdropValue it) {
                    Intrinsics.checkNotNullParameter(it, "it");
                    return true;
                }
            };
        }
        if ((i2 & 8) != 0) {
            composer.startReplaceableGroup(-492369756);
            ComposerKt.sourceInformation(composer, "C(remember):Composables.kt#9igjgp");
            Object rememberedValue = composer.rememberedValue();
            if (rememberedValue == Composer.INSTANCE.getEmpty()) {
                rememberedValue = new SnackbarHostState();
                composer.updateRememberedValue(rememberedValue);
            }
            composer.endReplaceableGroup();
            snackbarHostState = (SnackbarHostState) rememberedValue;
        }
        BackdropScaffoldState backdropScaffoldState = (BackdropScaffoldState) RememberSaveableKt.m1296rememberSaveable(new Object[]{animationSpec, function1, snackbarHostState}, (Saver) BackdropScaffoldState.INSTANCE.Saver(animationSpec, function1, snackbarHostState), (String) null, (Function0) new Function0<BackdropScaffoldState>() { // from class: androidx.compose.material.BackdropScaffoldKt$rememberBackdropScaffoldState$3
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            {
                super(0);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // kotlin.jvm.functions.Function0
            public final BackdropScaffoldState invoke() {
                return new BackdropScaffoldState(BackdropValue.this, animationSpec, function1, snackbarHostState);
            }
        }, composer, 72, 4);
        composer.endReplaceableGroup();
        return backdropScaffoldState;
    }

    /* JADX WARN: Code restructure failed: missing block: B:61:0x01a5, code lost:
    
        if (r12.changed(r8) != false) goto L136;
     */
    /* JADX WARN: Removed duplicated region for block: B:104:0x051d  */
    /* JADX WARN: Removed duplicated region for block: B:107:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:110:0x0282  */
    /* JADX WARN: Removed duplicated region for block: B:136:0x0481  */
    /* JADX WARN: Removed duplicated region for block: B:141:0x02de  */
    /* JADX WARN: Removed duplicated region for block: B:144:0x02e8  */
    /* JADX WARN: Removed duplicated region for block: B:146:0x0319  */
    /* JADX WARN: Removed duplicated region for block: B:148:0x031f  */
    /* JADX WARN: Removed duplicated region for block: B:150:0x032a  */
    /* JADX WARN: Removed duplicated region for block: B:152:0x0335  */
    /* JADX WARN: Removed duplicated region for block: B:154:0x033b  */
    /* JADX WARN: Removed duplicated region for block: B:157:0x0343  */
    /* JADX WARN: Removed duplicated region for block: B:160:0x0360  */
    /* JADX WARN: Removed duplicated region for block: B:163:0x0371  */
    /* JADX WARN: Removed duplicated region for block: B:165:0x0383  */
    /* JADX WARN: Removed duplicated region for block: B:168:0x0392  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0099  */
    /* JADX WARN: Removed duplicated region for block: B:171:0x03aa  */
    /* JADX WARN: Removed duplicated region for block: B:174:0x03c1  */
    /* JADX WARN: Removed duplicated region for block: B:176:0x03d5  */
    /* JADX WARN: Removed duplicated region for block: B:178:0x03f7  */
    /* JADX WARN: Removed duplicated region for block: B:179:0x03cf  */
    /* JADX WARN: Removed duplicated region for block: B:180:0x03b9  */
    /* JADX WARN: Removed duplicated region for block: B:181:0x03a2  */
    /* JADX WARN: Removed duplicated region for block: B:182:0x038a  */
    /* JADX WARN: Removed duplicated region for block: B:183:0x037d  */
    /* JADX WARN: Removed duplicated region for block: B:184:0x0369  */
    /* JADX WARN: Removed duplicated region for block: B:185:0x0357  */
    /* JADX WARN: Removed duplicated region for block: B:186:0x033d  */
    /* JADX WARN: Removed duplicated region for block: B:187:0x0337  */
    /* JADX WARN: Removed duplicated region for block: B:188:0x0331  */
    /* JADX WARN: Removed duplicated region for block: B:189:0x0326  */
    /* JADX WARN: Removed duplicated region for block: B:190:0x031b  */
    /* JADX WARN: Removed duplicated region for block: B:191:0x030c  */
    /* JADX WARN: Removed duplicated region for block: B:192:0x02e3  */
    /* JADX WARN: Removed duplicated region for block: B:193:0x0229  */
    /* JADX WARN: Removed duplicated region for block: B:201:0x021c  */
    /* JADX WARN: Removed duplicated region for block: B:203:0x0202  */
    /* JADX WARN: Removed duplicated region for block: B:204:0x01e5  */
    /* JADX WARN: Removed duplicated region for block: B:205:0x01b7  */
    /* JADX WARN: Removed duplicated region for block: B:213:0x01ae  */
    /* JADX WARN: Removed duplicated region for block: B:215:0x0195  */
    /* JADX WARN: Removed duplicated region for block: B:217:0x017a  */
    /* JADX WARN: Removed duplicated region for block: B:218:0x0146  */
    /* JADX WARN: Removed duplicated region for block: B:225:0x0121  */
    /* JADX WARN: Removed duplicated region for block: B:232:0x00fc  */
    /* JADX WARN: Removed duplicated region for block: B:239:0x00de  */
    /* JADX WARN: Removed duplicated region for block: B:246:0x00be  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x00b7  */
    /* JADX WARN: Removed duplicated region for block: B:254:0x00ad  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x00d7  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x00f7  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x011c  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0141  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0166  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x0181  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x019b  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x01b4  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x01d4  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x01ef  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x0209  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x0222  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x0247  */
    @ExperimentalMaterialApi
    /* renamed from: BackdropScaffold-BZszfkY, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void m893BackdropScaffoldBZszfkY(final Function2<? super Composer, ? super Integer, Unit> appBar, final Function2<? super Composer, ? super Integer, Unit> backLayerContent, final Function2<? super Composer, ? super Integer, Unit> frontLayerContent, Modifier modifier, BackdropScaffoldState backdropScaffoldState, boolean z, float f, float f2, boolean z2, boolean z3, long j, long j2, Shape shape, float f3, long j3, long j4, long j5, Function3<? super SnackbarHostState, ? super Composer, ? super Integer, Unit> function3, Composer composer, final int i, final int i2, final int i3) {
        int i4;
        final Modifier modifier2;
        final BackdropScaffoldState backdropScaffoldState2;
        int i5;
        int i6;
        int i7;
        int i8;
        int i9;
        int i10;
        int i11;
        int i12;
        int i13;
        Shape shape2;
        int i14;
        int i15;
        Function3<? super SnackbarHostState, ? super Composer, ? super Integer, Unit> function32;
        Modifier modifier3;
        int i16;
        boolean z4;
        int i17;
        int i18;
        int i19;
        int i20;
        long j6;
        long j7;
        int i21;
        Shape shape3;
        float f4;
        long j8;
        boolean z5;
        long j9;
        long j10;
        long j11;
        Modifier modifier4;
        Shape shape4;
        float f5;
        Function3<? super SnackbarHostState, ? super Composer, ? super Integer, Unit> function33;
        boolean z6;
        int i22;
        long j12;
        BackdropScaffoldState backdropScaffoldState3;
        boolean z7;
        boolean z8;
        long j13;
        long j14;
        long j15;
        long j16;
        int i23;
        float f6;
        float f7;
        boolean changed;
        Object rememberedValue;
        Composer composer2;
        final boolean z9;
        final boolean z10;
        final boolean z11;
        final Shape shape5;
        final long j17;
        final long j18;
        final float f8;
        final long j19;
        final long j20;
        final long j21;
        final Function3<? super SnackbarHostState, ? super Composer, ? super Integer, Unit> function34;
        final float f9;
        final float f10;
        ScopeUpdateScope endRestartGroup;
        Intrinsics.checkNotNullParameter(appBar, "appBar");
        Intrinsics.checkNotNullParameter(backLayerContent, "backLayerContent");
        Intrinsics.checkNotNullParameter(frontLayerContent, "frontLayerContent");
        Composer startRestartGroup = composer.startRestartGroup(1397420093);
        ComposerKt.sourceInformation(startRestartGroup, "C(BackdropScaffold)P(!1,2,5,12,15,10,13:c#ui.unit.Dp,11:c#ui.unit.Dp,14,17,1:c#ui.graphics.Color,3:c#ui.graphics.Color,9,7:c#ui.unit.Dp,4:c#ui.graphics.Color,6:c#ui.graphics.Color,8:c#ui.graphics.Color)260@11766L40,266@12093L6,267@12144L41,268@12241L15,270@12387L6,271@12439L42,272@12542L20,*275@12690L7,276@12764L7,288@13147L100,293@13271L3282:BackdropScaffold.kt#jmzs0o");
        if ((i3 & 1) != 0) {
            i4 = i | 6;
        } else if ((i & 14) == 0) {
            i4 = (startRestartGroup.changed(appBar) ? 4 : 2) | i;
        } else {
            i4 = i;
        }
        if ((i3 & 2) != 0) {
            i4 |= 48;
        } else if ((i & 112) == 0) {
            i4 |= startRestartGroup.changed(backLayerContent) ? 32 : 16;
        }
        int i24 = 256;
        if ((i3 & 4) != 0) {
            i4 |= 384;
        } else if ((i & 896) == 0) {
            i4 |= startRestartGroup.changed(frontLayerContent) ? 256 : 128;
        }
        int i25 = i3 & 8;
        if (i25 != 0) {
            i4 |= 3072;
        } else if ((i & 7168) == 0) {
            modifier2 = modifier;
            i4 |= startRestartGroup.changed(modifier2) ? 2048 : 1024;
            int i26 = 8192;
            if ((i & 57344) != 0) {
                backdropScaffoldState2 = backdropScaffoldState;
                i4 |= ((i3 & 16) == 0 && startRestartGroup.changed(backdropScaffoldState2)) ? 16384 : 8192;
            } else {
                backdropScaffoldState2 = backdropScaffoldState;
            }
            i5 = i3 & 32;
            if (i5 == 0) {
                i4 |= ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE;
            } else if ((i & 458752) == 0) {
                i4 |= startRestartGroup.changed(z) ? 131072 : 65536;
            }
            i6 = i3 & 64;
            if (i6 == 0) {
                i4 |= 1572864;
            } else if ((i & 3670016) == 0) {
                i4 |= startRestartGroup.changed(f) ? 1048576 : 524288;
            }
            i7 = i3 & 128;
            if (i7 == 0) {
                i4 |= 12582912;
            } else if ((i & 29360128) == 0) {
                i8 = i7;
                i4 |= startRestartGroup.changed(f2) ? 8388608 : 4194304;
                i9 = i3 & 256;
                if (i9 != 0) {
                    i4 |= 100663296;
                } else if ((i & 234881024) == 0) {
                    i10 = i9;
                    i4 |= startRestartGroup.changed(z2) ? AccessibilityEventCompat.TYPE_VIEW_TARGETED_BY_SCROLL : 33554432;
                    i11 = i3 & 512;
                    if (i11 == 0) {
                        i4 |= C.ENCODING_PCM_32BIT;
                    } else if ((i & 1879048192) == 0) {
                        i12 = i11;
                        i4 |= startRestartGroup.changed(z3) ? 536870912 : 268435456;
                        if ((i2 & 14) == 0) {
                            i13 = i2 | (((i3 & 1024) == 0 && startRestartGroup.changed(j)) ? 4 : 2);
                        } else {
                            i13 = i2;
                        }
                        if ((i2 & 112) == 0) {
                            i13 |= ((i3 & 2048) == 0 && startRestartGroup.changed(j2)) ? 32 : 16;
                        }
                        if ((i2 & 896) == 0) {
                            if ((i3 & 4096) == 0) {
                                shape2 = shape;
                            } else {
                                shape2 = shape;
                            }
                            i24 = 128;
                            i13 |= i24;
                        } else {
                            shape2 = shape;
                        }
                        i14 = i3 & 8192;
                        if (i14 != 0) {
                            i13 |= 3072;
                        } else if ((i2 & 7168) == 0) {
                            i13 |= startRestartGroup.changed(f3) ? 2048 : 1024;
                            if ((i2 & 57344) == 0) {
                                if ((i3 & 16384) == 0 && startRestartGroup.changed(j3)) {
                                    i26 = 16384;
                                }
                                i13 |= i26;
                            }
                            if ((458752 & i2) == 0) {
                                i13 |= ((i3 & 32768) == 0 && startRestartGroup.changed(j4)) ? 131072 : 65536;
                            }
                            if ((3670016 & i2) == 0) {
                                i13 |= ((i3 & 65536) == 0 && startRestartGroup.changed(j5)) ? 1048576 : 524288;
                            }
                            i15 = i3 & 131072;
                            if (i15 == 0) {
                                i13 |= 12582912;
                                function32 = function3;
                            } else {
                                function32 = function3;
                                if ((i2 & 29360128) == 0) {
                                    i13 |= startRestartGroup.changed(function32) ? 8388608 : 4194304;
                                }
                            }
                            int i27 = i13;
                            if ((1533916891 & i4) == 306783378 || (23967451 & i27) != 4793490 || !startRestartGroup.getSkipping()) {
                                startRestartGroup.startDefaults();
                                if ((i & 1) != 0 || startRestartGroup.getDefaultsInvalid()) {
                                    Modifier.Companion companion = i25 == 0 ? Modifier.INSTANCE : modifier2;
                                    if ((i3 & 16) == 0) {
                                        i16 = i14;
                                        modifier3 = companion;
                                        z4 = true;
                                        i17 = i8;
                                        i18 = i10;
                                        i19 = i12;
                                        i4 &= -57345;
                                        backdropScaffoldState2 = rememberBackdropScaffoldState(BackdropValue.Concealed, null, null, null, startRestartGroup, 6, 14);
                                    } else {
                                        modifier3 = companion;
                                        i16 = i14;
                                        z4 = true;
                                        i17 = i8;
                                        i18 = i10;
                                        i19 = i12;
                                    }
                                    boolean z12 = i5 == 0 ? z4 : z;
                                    float m891getPeekHeightD9Ej5fM = i6 == 0 ? BackdropScaffoldDefaults.INSTANCE.m891getPeekHeightD9Ej5fM() : f;
                                    float m890getHeaderHeightD9Ej5fM = i17 == 0 ? BackdropScaffoldDefaults.INSTANCE.m890getHeaderHeightD9Ej5fM() : f2;
                                    boolean z13 = i18 == 0 ? z4 : z2;
                                    boolean z14 = i19 == 0 ? z4 : z3;
                                    if ((i3 & 1024) == 0) {
                                        i20 = i27 & (-15);
                                        j6 = MaterialTheme.INSTANCE.getColors(startRestartGroup, 6).m976getPrimary0d7_KjU();
                                    } else {
                                        i20 = i27;
                                        j6 = j;
                                    }
                                    if ((i3 & 2048) == 0) {
                                        j7 = ColorsKt.m994contentColorForek8zF_U(j6, startRestartGroup, i20 & 14);
                                        i20 &= -113;
                                    } else {
                                        j7 = j2;
                                    }
                                    int i28 = i20;
                                    if ((i3 & 4096) == 0) {
                                        i21 = i4;
                                        shape3 = BackdropScaffoldDefaults.INSTANCE.getFrontLayerShape(startRestartGroup, 6);
                                        i28 &= -897;
                                    } else {
                                        i21 = i4;
                                        shape3 = shape;
                                    }
                                    float m889getFrontLayerElevationD9Ej5fM = i16 == 0 ? BackdropScaffoldDefaults.INSTANCE.m889getFrontLayerElevationD9Ej5fM() : f3;
                                    Shape shape6 = shape3;
                                    if ((i3 & 16384) == 0) {
                                        f4 = m889getFrontLayerElevationD9Ej5fM;
                                        j8 = MaterialTheme.INSTANCE.getColors(startRestartGroup, 6).m980getSurface0d7_KjU();
                                        i28 &= -57345;
                                    } else {
                                        f4 = m889getFrontLayerElevationD9Ej5fM;
                                        j8 = j3;
                                    }
                                    if ((i3 & 32768) == 0) {
                                        z5 = z12;
                                        j9 = ColorsKt.m994contentColorForek8zF_U(j8, startRestartGroup, (i28 >> 12) & 14);
                                        i28 &= -458753;
                                    } else {
                                        z5 = z12;
                                        j9 = j4;
                                    }
                                    if ((i3 & 65536) == 0) {
                                        j10 = j8;
                                        j11 = BackdropScaffoldDefaults.INSTANCE.getFrontLayerScrimColor(startRestartGroup, 6);
                                        i28 &= -3670017;
                                    } else {
                                        j10 = j8;
                                        j11 = j5;
                                    }
                                    if (i15 == 0) {
                                        shape4 = shape6;
                                        f5 = f4;
                                        z6 = z5;
                                        function33 = ComposableSingletons$BackdropScaffoldKt.INSTANCE.m1000getLambda1$material_release();
                                        i22 = i28;
                                        j12 = j11;
                                        backdropScaffoldState3 = backdropScaffoldState2;
                                        z7 = z13;
                                        z8 = z14;
                                        j13 = j6;
                                        j14 = j9;
                                        j15 = j7;
                                        j16 = j10;
                                        modifier4 = modifier3;
                                    } else {
                                        modifier4 = modifier3;
                                        shape4 = shape6;
                                        f5 = f4;
                                        function33 = function3;
                                        z6 = z5;
                                        i22 = i28;
                                        j12 = j11;
                                        backdropScaffoldState3 = backdropScaffoldState2;
                                        z7 = z13;
                                        z8 = z14;
                                        j13 = j6;
                                        j14 = j9;
                                        j15 = j7;
                                        j16 = j10;
                                    }
                                    i23 = i21;
                                    f6 = m891getPeekHeightD9Ej5fM;
                                    f7 = m890getHeaderHeightD9Ej5fM;
                                } else {
                                    startRestartGroup.skipToGroupEnd();
                                    if ((i3 & 16) != 0) {
                                        i4 &= -57345;
                                    }
                                    if ((i3 & 1024) != 0) {
                                        i27 &= -15;
                                    }
                                    if ((i3 & 2048) != 0) {
                                        i27 &= -113;
                                    }
                                    if ((i3 & 4096) != 0) {
                                        i27 &= -897;
                                    }
                                    if ((i3 & 16384) != 0) {
                                        i27 &= -57345;
                                    }
                                    if ((i3 & 32768) != 0) {
                                        i27 &= -458753;
                                    }
                                    if ((i3 & 65536) != 0) {
                                        i27 &= -3670017;
                                    }
                                    z6 = z;
                                    f7 = f2;
                                    z7 = z2;
                                    z8 = z3;
                                    j13 = j;
                                    j15 = j2;
                                    f5 = f3;
                                    j16 = j3;
                                    j14 = j4;
                                    j12 = j5;
                                    function33 = function3;
                                    i23 = i4;
                                    modifier4 = modifier2;
                                    backdropScaffoldState3 = backdropScaffoldState2;
                                    shape4 = shape2;
                                    i22 = i27;
                                    f6 = f;
                                }
                                startRestartGroup.endDefaults();
                                ProvidableCompositionLocal<Density> localDensity = CompositionLocalsKt.getLocalDensity();
                                ComposerKt.sourceInformationMarkerStart(startRestartGroup, 2023513938, "C:CompositionLocal.kt#9igjgp");
                                Object consume = startRestartGroup.consume(localDensity);
                                ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                                final float mo315toPx0680j_4 = ((Density) consume).mo315toPx0680j_4(f6);
                                ProvidableCompositionLocal<Density> localDensity2 = CompositionLocalsKt.getLocalDensity();
                                ComposerKt.sourceInformationMarkerStart(startRestartGroup, 2023513938, "C:CompositionLocal.kt#9igjgp");
                                Object consume2 = startRestartGroup.consume(localDensity2);
                                ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                                final float mo315toPx0680j_42 = ((Density) consume2).mo315toPx0680j_4(f7);
                                final boolean z15 = z7;
                                final BackdropScaffoldState backdropScaffoldState4 = backdropScaffoldState3;
                                final int i29 = i23;
                                final ComposableLambda composableLambda = ComposableLambdaKt.composableLambda(startRestartGroup, 1744778315, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material.BackdropScaffoldKt$BackdropScaffold$backLayer$1
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

                                    public final void invoke(Composer composer3, int i30) {
                                        ComposerKt.sourceInformation(composer3, "C:BackdropScaffold.kt#jmzs0o");
                                        if ((i30 & 11) != 2 || !composer3.getSkipping()) {
                                            if (z15) {
                                                composer3.startReplaceableGroup(-1017265331);
                                                ComposerKt.sourceInformation(composer3, "280@12876L82");
                                                Function2<Composer, Integer, Unit> function2 = appBar;
                                                int i31 = i29;
                                                Function2<Composer, Integer, Unit> function22 = backLayerContent;
                                                composer3.startReplaceableGroup(-483455358);
                                                ComposerKt.sourceInformation(composer3, "C(Column)P(2,3,1)77@3880L61,78@3946L133:Column.kt#2w3rfo");
                                                Modifier.Companion companion2 = Modifier.INSTANCE;
                                                MeasurePolicy columnMeasurePolicy = ColumnKt.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), Alignment.INSTANCE.getStart(), composer3, 0);
                                                composer3.startReplaceableGroup(-1323940314);
                                                ComposerKt.sourceInformation(composer3, "C(Layout)P(!1,2)74@2915L7,75@2970L7,76@3029L7,77@3041L460:Layout.kt#80mrfh");
                                                ProvidableCompositionLocal<Density> localDensity3 = CompositionLocalsKt.getLocalDensity();
                                                ComposerKt.sourceInformationMarkerStart(composer3, 2023513938, "C:CompositionLocal.kt#9igjgp");
                                                Object consume3 = composer3.consume(localDensity3);
                                                ComposerKt.sourceInformationMarkerEnd(composer3);
                                                Density density = (Density) consume3;
                                                ProvidableCompositionLocal<LayoutDirection> localLayoutDirection = CompositionLocalsKt.getLocalLayoutDirection();
                                                ComposerKt.sourceInformationMarkerStart(composer3, 2023513938, "C:CompositionLocal.kt#9igjgp");
                                                Object consume4 = composer3.consume(localLayoutDirection);
                                                ComposerKt.sourceInformationMarkerEnd(composer3);
                                                LayoutDirection layoutDirection = (LayoutDirection) consume4;
                                                ProvidableCompositionLocal<ViewConfiguration> localViewConfiguration = CompositionLocalsKt.getLocalViewConfiguration();
                                                ComposerKt.sourceInformationMarkerStart(composer3, 2023513938, "C:CompositionLocal.kt#9igjgp");
                                                Object consume5 = composer3.consume(localViewConfiguration);
                                                ComposerKt.sourceInformationMarkerEnd(composer3);
                                                ViewConfiguration viewConfiguration = (ViewConfiguration) consume5;
                                                Function0<ComposeUiNode> constructor = ComposeUiNode.INSTANCE.getConstructor();
                                                Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> materializerOf = LayoutKt.materializerOf(companion2);
                                                if (!(composer3.getApplier() instanceof Applier)) {
                                                    ComposablesKt.invalidApplier();
                                                }
                                                composer3.startReusableNode();
                                                if (composer3.getInserting()) {
                                                    composer3.createNode(constructor);
                                                } else {
                                                    composer3.useNode();
                                                }
                                                composer3.disableReusing();
                                                Composer m1283constructorimpl = Updater.m1283constructorimpl(composer3);
                                                Updater.m1290setimpl(m1283constructorimpl, columnMeasurePolicy, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
                                                Updater.m1290setimpl(m1283constructorimpl, density, ComposeUiNode.INSTANCE.getSetDensity());
                                                Updater.m1290setimpl(m1283constructorimpl, layoutDirection, ComposeUiNode.INSTANCE.getSetLayoutDirection());
                                                Updater.m1290setimpl(m1283constructorimpl, viewConfiguration, ComposeUiNode.INSTANCE.getSetViewConfiguration());
                                                composer3.enableReusing();
                                                materializerOf.invoke(SkippableUpdater.m1273boximpl(SkippableUpdater.m1274constructorimpl(composer3)), composer3, 0);
                                                composer3.startReplaceableGroup(2058660585);
                                                composer3.startReplaceableGroup(-1163856341);
                                                ComposerKt.sourceInformation(composer3, "C79@3994L9:Column.kt#2w3rfo");
                                                ColumnScopeInstance columnScopeInstance = ColumnScopeInstance.INSTANCE;
                                                composer3.startReplaceableGroup(-18835878);
                                                ComposerKt.sourceInformation(composer3, "C281@12901L8,282@12926L18:BackdropScaffold.kt#jmzs0o");
                                                function2.invoke(composer3, Integer.valueOf(i31 & 14));
                                                function22.invoke(composer3, Integer.valueOf((i31 >> 3) & 14));
                                                composer3.endReplaceableGroup();
                                                composer3.endReplaceableGroup();
                                                composer3.endReplaceableGroup();
                                                composer3.endNode();
                                                composer3.endReplaceableGroup();
                                                composer3.endReplaceableGroup();
                                                composer3.endReplaceableGroup();
                                                return;
                                            }
                                            composer3.startReplaceableGroup(-1017265219);
                                            ComposerKt.sourceInformation(composer3, "285@12988L72");
                                            BackdropValue targetValue = backdropScaffoldState4.getTargetValue();
                                            Function2<Composer, Integer, Unit> function23 = appBar;
                                            Function2<Composer, Integer, Unit> function24 = backLayerContent;
                                            int i32 = i29;
                                            BackdropScaffoldKt.BackLayerTransition(targetValue, function23, function24, composer3, ((i32 << 3) & 896) | ((i32 << 3) & 112));
                                            composer3.endReplaceableGroup();
                                            return;
                                        }
                                        composer3.skipToGroupEnd();
                                    }
                                });
                                Float valueOf = Float.valueOf(mo315toPx0680j_42);
                                startRestartGroup.startReplaceableGroup(1157296644);
                                ComposerKt.sourceInformation(startRestartGroup, "C(remember)P(1):Composables.kt#9igjgp");
                                changed = startRestartGroup.changed(valueOf);
                                rememberedValue = startRestartGroup.rememberedValue();
                                if (!changed || rememberedValue == Composer.INSTANCE.getEmpty()) {
                                    rememberedValue = (Function1) new Function1<Constraints, Constraints>() { // from class: androidx.compose.material.BackdropScaffoldKt$BackdropScaffold$calculateBackLayerConstraints$1$1
                                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                        {
                                            super(1);
                                        }

                                        @Override // kotlin.jvm.functions.Function1
                                        public /* bridge */ /* synthetic */ Constraints invoke(Constraints constraints) {
                                            return Constraints.m3784boximpl(m900invokeZezNO4M(constraints.getValue()));
                                        }

                                        /* renamed from: invoke-ZezNO4M, reason: not valid java name */
                                        public final long m900invokeZezNO4M(long j22) {
                                            return ConstraintsKt.m3813offsetNN6EwU$default(Constraints.m3787copyZbe2FdA$default(j22, 0, 0, 0, 0, 10, null), 0, -MathKt.roundToInt(mo315toPx0680j_42), 1, null);
                                        }
                                    };
                                    startRestartGroup.updateRememberedValue(rememberedValue);
                                }
                                startRestartGroup.endReplaceableGroup();
                                final Function1 function1 = (Function1) rememberedValue;
                                final Modifier modifier5 = modifier4;
                                final boolean z16 = z8;
                                final boolean z17 = z6;
                                final float f11 = f7;
                                final BackdropScaffoldState backdropScaffoldState5 = backdropScaffoldState3;
                                final float f12 = f6;
                                BackdropScaffoldState backdropScaffoldState6 = backdropScaffoldState3;
                                composer2 = startRestartGroup;
                                final int i30 = i23;
                                final Shape shape7 = shape4;
                                final long j22 = j16;
                                final long j23 = j14;
                                final float f13 = f5;
                                final int i31 = i22;
                                final long j24 = j12;
                                final Function3<? super SnackbarHostState, ? super Composer, ? super Integer, Unit> function35 = function33;
                                int i32 = i22 << 6;
                                SurfaceKt.m1172SurfaceFjzlyU(null, null, j13, j15, null, 0.0f, ComposableLambdaKt.composableLambda(composer2, -1049909631, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material.BackdropScaffoldKt$BackdropScaffold$1
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

                                    public final void invoke(Composer composer3, int i33) {
                                        ComposerKt.sourceInformation(composer3, "C297@13395L24,298@13428L3119:BackdropScaffold.kt#jmzs0o");
                                        if ((i33 & 11) != 2 || !composer3.getSkipping()) {
                                            composer3.startReplaceableGroup(773894976);
                                            ComposerKt.sourceInformation(composer3, "C(rememberCoroutineScope)475@19849L144:Effects.kt#9igjgp");
                                            composer3.startReplaceableGroup(-492369756);
                                            ComposerKt.sourceInformation(composer3, "C(remember):Composables.kt#9igjgp");
                                            Object rememberedValue2 = composer3.rememberedValue();
                                            if (rememberedValue2 == Composer.INSTANCE.getEmpty()) {
                                                CompositionScopedCoroutineScopeCanceller compositionScopedCoroutineScopeCanceller = new CompositionScopedCoroutineScopeCanceller(EffectsKt.createCompositionCoroutineScope(EmptyCoroutineContext.INSTANCE, composer3));
                                                composer3.updateRememberedValue(compositionScopedCoroutineScopeCanceller);
                                                rememberedValue2 = compositionScopedCoroutineScopeCanceller;
                                            }
                                            composer3.endReplaceableGroup();
                                            final CoroutineScope coroutineScope = ((CompositionScopedCoroutineScopeCanceller) rememberedValue2).getCoroutineScope();
                                            composer3.endReplaceableGroup();
                                            Modifier fillMaxSize$default = SizeKt.fillMaxSize$default(Modifier.this, 0.0f, 1, null);
                                            Function2<Composer, Integer, Unit> function2 = composableLambda;
                                            Function1<Constraints, Constraints> function12 = function1;
                                            final float f14 = mo315toPx0680j_42;
                                            final boolean z18 = z16;
                                            final boolean z19 = z17;
                                            final BackdropScaffoldState backdropScaffoldState7 = backdropScaffoldState5;
                                            final float f15 = mo315toPx0680j_4;
                                            final int i34 = i30;
                                            final Shape shape8 = shape7;
                                            final long j25 = j22;
                                            final long j26 = j23;
                                            final float f16 = f13;
                                            final int i35 = i31;
                                            final float f17 = f11;
                                            final float f18 = f12;
                                            final Function2<Composer, Integer, Unit> function22 = frontLayerContent;
                                            final long j27 = j24;
                                            final Function3<SnackbarHostState, Composer, Integer, Unit> function36 = function35;
                                            BackdropScaffoldKt.BackdropStack(fillMaxSize$default, function2, function12, ComposableLambdaKt.composableLambda(composer3, 1800047509, true, new Function4<Constraints, Float, Composer, Integer, Unit>() { // from class: androidx.compose.material.BackdropScaffoldKt$BackdropScaffold$1.1
                                                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                                /* JADX WARN: Multi-variable type inference failed */
                                                {
                                                    super(4);
                                                }

                                                @Override // kotlin.jvm.functions.Function4
                                                public /* bridge */ /* synthetic */ Unit invoke(Constraints constraints, Float f19, Composer composer4, Integer num) {
                                                    m898invokejYbf7pk(constraints.getValue(), f19.floatValue(), composer4, num.intValue());
                                                    return Unit.INSTANCE;
                                                }

                                                /* renamed from: invoke-jYbf7pk, reason: not valid java name */
                                                public final void m898invokejYbf7pk(long j28, float f19, Composer composer4, int i36) {
                                                    int i37;
                                                    Modifier.Companion companion2;
                                                    Modifier m1182swipeablepPrIpRY;
                                                    float m3840constructorimpl;
                                                    ComposerKt.sourceInformation(composer4, "CP(1:c#ui.unit.Constraints)344@15194L57,342@15132L942,366@16117L420:BackdropScaffold.kt#jmzs0o");
                                                    if ((i36 & 14) == 0) {
                                                        i37 = i36 | (composer4.changed(j28) ? 4 : 2);
                                                    } else {
                                                        i37 = i36;
                                                    }
                                                    if ((i36 & 112) == 0) {
                                                        i37 |= composer4.changed(f19) ? 32 : 16;
                                                    }
                                                    if ((i37 & 731) != 146 || !composer4.getSkipping()) {
                                                        float m3795getMaxHeightimpl = Constraints.m3795getMaxHeightimpl(j28);
                                                        float f20 = m3795getMaxHeightimpl - f14;
                                                        if (z18) {
                                                            f20 = Math.min(f20, f19);
                                                        }
                                                        float f21 = f20;
                                                        if (z19) {
                                                            companion2 = NestedScrollModifierKt.nestedScroll$default(Modifier.INSTANCE, backdropScaffoldState7.getNestedScrollConnection(), null, 2, null);
                                                        } else {
                                                            companion2 = Modifier.INSTANCE;
                                                        }
                                                        m1182swipeablepPrIpRY = SwipeableKt.m1182swipeablepPrIpRY(Modifier.INSTANCE.then(companion2), backdropScaffoldState7, r18, Orientation.Vertical, (r26 & 8) != 0 ? true : z19, (r26 & 16) != 0 ? false : false, (r26 & 32) != 0 ? null : null, (r26 & 64) != 0 ? new Function2<T, T, FixedThreshold>() { // from class: androidx.compose.material.SwipeableKt$swipeable$1
                                                            /* JADX WARN: Can't rename method to resolve collision */
                                                            @Override // kotlin.jvm.functions.Function2
                                                            public final FixedThreshold invoke(T t, T t2) {
                                                                return new FixedThreshold(Dp.m3840constructorimpl(56), null);
                                                            }
                                                        } : null, (r26 & 128) != 0 ? SwipeableDefaults.resistanceConfig$default(SwipeableDefaults.INSTANCE, MapsKt.mapOf(TuplesKt.to(Float.valueOf(f15), BackdropValue.Concealed), TuplesKt.to(Float.valueOf(f21), BackdropValue.Revealed)).keySet(), 0.0f, 0.0f, 6, null) : null, (r26 & 256) != 0 ? SwipeableDefaults.INSTANCE.m1181getVelocityThresholdD9Ej5fM() : 0.0f);
                                                        final BackdropScaffoldState backdropScaffoldState8 = backdropScaffoldState7;
                                                        final CoroutineScope coroutineScope2 = coroutineScope;
                                                        Modifier semantics$default = SemanticsModifierKt.semantics$default(m1182swipeablepPrIpRY, false, new Function1<SemanticsPropertyReceiver, Unit>() { // from class: androidx.compose.material.BackdropScaffoldKt$BackdropScaffold$1$1$swipeable$1
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
                                                                if (BackdropScaffoldState.this.isConcealed()) {
                                                                    final BackdropScaffoldState backdropScaffoldState9 = BackdropScaffoldState.this;
                                                                    final CoroutineScope coroutineScope3 = coroutineScope2;
                                                                    SemanticsPropertiesKt.collapse$default(semantics, null, new Function0<Boolean>() { // from class: androidx.compose.material.BackdropScaffoldKt$BackdropScaffold$1$1$swipeable$1.1
                                                                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                                                        {
                                                                            super(0);
                                                                        }

                                                                        /* JADX WARN: Can't rename method to resolve collision */
                                                                        @Override // kotlin.jvm.functions.Function0
                                                                        public final Boolean invoke() {
                                                                            if (BackdropScaffoldState.this.getConfirmStateChange$material_release().invoke(BackdropValue.Revealed).booleanValue()) {
                                                                                BuildersKt__Builders_commonKt.launch$default(coroutineScope3, null, null, new C00301(BackdropScaffoldState.this, null), 3, null);
                                                                            }
                                                                            return true;
                                                                        }

                                                                        /* compiled from: BackdropScaffold.kt */
                                                                        @Metadata(k = 3, mv = {1, 6, 0}, xi = 48)
                                                                        @DebugMetadata(c = "androidx.compose.material.BackdropScaffoldKt$BackdropScaffold$1$1$swipeable$1$1$1", f = "BackdropScaffold.kt", i = {}, l = {330}, m = "invokeSuspend", n = {}, s = {})
                                                                        /* renamed from: androidx.compose.material.BackdropScaffoldKt$BackdropScaffold$1$1$swipeable$1$1$1, reason: invalid class name and collision with other inner class name */
                                                                        static final class C00301 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
                                                                            final /* synthetic */ BackdropScaffoldState $scaffoldState;
                                                                            int label;

                                                                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                                                            C00301(BackdropScaffoldState backdropScaffoldState, Continuation<? super C00301> continuation) {
                                                                                super(2, continuation);
                                                                                this.$scaffoldState = backdropScaffoldState;
                                                                            }

                                                                            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                                                                            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                                                                                return new C00301(this.$scaffoldState, continuation);
                                                                            }

                                                                            @Override // kotlin.jvm.functions.Function2
                                                                            public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
                                                                                return ((C00301) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
                                                                            }

                                                                            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                                                                            public final Object invokeSuspend(Object obj) {
                                                                                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                                                                                int i = this.label;
                                                                                if (i == 0) {
                                                                                    ResultKt.throwOnFailure(obj);
                                                                                    this.label = 1;
                                                                                    if (this.$scaffoldState.reveal(this) == coroutine_suspended) {
                                                                                        return coroutine_suspended;
                                                                                    }
                                                                                } else {
                                                                                    if (i != 1) {
                                                                                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                                                                                    }
                                                                                    ResultKt.throwOnFailure(obj);
                                                                                }
                                                                                return Unit.INSTANCE;
                                                                            }
                                                                        }
                                                                    }, 1, null);
                                                                } else {
                                                                    final BackdropScaffoldState backdropScaffoldState10 = BackdropScaffoldState.this;
                                                                    final CoroutineScope coroutineScope4 = coroutineScope2;
                                                                    SemanticsPropertiesKt.expand$default(semantics, null, new Function0<Boolean>() { // from class: androidx.compose.material.BackdropScaffoldKt$BackdropScaffold$1$1$swipeable$1.2
                                                                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                                                        {
                                                                            super(0);
                                                                        }

                                                                        /* JADX WARN: Can't rename method to resolve collision */
                                                                        @Override // kotlin.jvm.functions.Function0
                                                                        public final Boolean invoke() {
                                                                            if (BackdropScaffoldState.this.getConfirmStateChange$material_release().invoke(BackdropValue.Concealed).booleanValue()) {
                                                                                BuildersKt__Builders_commonKt.launch$default(coroutineScope4, null, null, new AnonymousClass1(BackdropScaffoldState.this, null), 3, null);
                                                                            }
                                                                            return true;
                                                                        }

                                                                        /* compiled from: BackdropScaffold.kt */
                                                                        @Metadata(k = 3, mv = {1, 6, 0}, xi = 48)
                                                                        @DebugMetadata(c = "androidx.compose.material.BackdropScaffoldKt$BackdropScaffold$1$1$swipeable$1$2$1", f = "BackdropScaffold.kt", i = {}, l = {336}, m = "invokeSuspend", n = {}, s = {})
                                                                        /* renamed from: androidx.compose.material.BackdropScaffoldKt$BackdropScaffold$1$1$swipeable$1$2$1, reason: invalid class name */
                                                                        static final class AnonymousClass1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
                                                                            final /* synthetic */ BackdropScaffoldState $scaffoldState;
                                                                            int label;

                                                                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                                                            AnonymousClass1(BackdropScaffoldState backdropScaffoldState, Continuation<? super AnonymousClass1> continuation) {
                                                                                super(2, continuation);
                                                                                this.$scaffoldState = backdropScaffoldState;
                                                                            }

                                                                            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                                                                            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                                                                                return new AnonymousClass1(this.$scaffoldState, continuation);
                                                                            }

                                                                            @Override // kotlin.jvm.functions.Function2
                                                                            public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
                                                                                return ((AnonymousClass1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
                                                                            }

                                                                            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                                                                            public final Object invokeSuspend(Object obj) {
                                                                                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                                                                                int i = this.label;
                                                                                if (i == 0) {
                                                                                    ResultKt.throwOnFailure(obj);
                                                                                    this.label = 1;
                                                                                    if (this.$scaffoldState.conceal(this) == coroutine_suspended) {
                                                                                        return coroutine_suspended;
                                                                                    }
                                                                                } else {
                                                                                    if (i != 1) {
                                                                                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                                                                                    }
                                                                                    ResultKt.throwOnFailure(obj);
                                                                                }
                                                                                return Unit.INSTANCE;
                                                                            }
                                                                        }
                                                                    }, 1, null);
                                                                }
                                                            }
                                                        }, 1, null);
                                                        Modifier.Companion companion3 = Modifier.INSTANCE;
                                                        final BackdropScaffoldState backdropScaffoldState9 = backdropScaffoldState7;
                                                        composer4.startReplaceableGroup(1157296644);
                                                        ComposerKt.sourceInformation(composer4, "C(remember)P(1):Composables.kt#9igjgp");
                                                        boolean changed2 = composer4.changed(backdropScaffoldState9);
                                                        Object rememberedValue3 = composer4.rememberedValue();
                                                        if (changed2 || rememberedValue3 == Composer.INSTANCE.getEmpty()) {
                                                            rememberedValue3 = (Function1) new Function1<Density, IntOffset>() { // from class: androidx.compose.material.BackdropScaffoldKt$BackdropScaffold$1$1$1$1
                                                                {
                                                                    super(1);
                                                                }

                                                                @Override // kotlin.jvm.functions.Function1
                                                                public /* bridge */ /* synthetic */ IntOffset invoke(Density density) {
                                                                    return IntOffset.m3949boximpl(m899invokeBjo55l4(density));
                                                                }

                                                                /* renamed from: invoke-Bjo55l4, reason: not valid java name */
                                                                public final long m899invokeBjo55l4(Density offset) {
                                                                    Intrinsics.checkNotNullParameter(offset, "$this$offset");
                                                                    return IntOffsetKt.IntOffset(0, MathKt.roundToInt(BackdropScaffoldState.this.getOffset().getValue().floatValue()));
                                                                }
                                                            };
                                                            composer4.updateRememberedValue(rememberedValue3);
                                                        }
                                                        composer4.endReplaceableGroup();
                                                        Modifier then = OffsetKt.offset(companion3, (Function1) rememberedValue3).then(semantics$default);
                                                        Shape shape9 = shape8;
                                                        long j29 = j25;
                                                        long j30 = j26;
                                                        float f22 = f16;
                                                        final float f23 = f18;
                                                        final Function2<Composer, Integer, Unit> function23 = function22;
                                                        final int i38 = i34;
                                                        final long j31 = j27;
                                                        final BackdropScaffoldState backdropScaffoldState10 = backdropScaffoldState7;
                                                        final int i39 = i35;
                                                        final boolean z20 = z19;
                                                        final CoroutineScope coroutineScope3 = coroutineScope;
                                                        ComposableLambda composableLambda2 = ComposableLambdaKt.composableLambda(composer4, -1065299503, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material.BackdropScaffoldKt.BackdropScaffold.1.1.2
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

                                                            public final void invoke(Composer composer5, int i40) {
                                                                ComposerKt.sourceInformation(composer5, "C351@15517L543:BackdropScaffold.kt#jmzs0o");
                                                                if ((i40 & 11) != 2 || !composer5.getSkipping()) {
                                                                    Modifier m424paddingqDBjuR0$default = PaddingKt.m424paddingqDBjuR0$default(Modifier.INSTANCE, 0.0f, 0.0f, 0.0f, f23, 7, null);
                                                                    Function2<Composer, Integer, Unit> function24 = function23;
                                                                    int i41 = i38;
                                                                    long j32 = j31;
                                                                    final BackdropScaffoldState backdropScaffoldState11 = backdropScaffoldState10;
                                                                    int i42 = i39;
                                                                    final boolean z21 = z20;
                                                                    final CoroutineScope coroutineScope4 = coroutineScope3;
                                                                    composer5.startReplaceableGroup(733328855);
                                                                    ComposerKt.sourceInformation(composer5, "C(Box)P(2,1,3)70@3267L67,71@3339L130:Box.kt#2w3rfo");
                                                                    MeasurePolicy rememberBoxMeasurePolicy = BoxKt.rememberBoxMeasurePolicy(Alignment.INSTANCE.getTopStart(), false, composer5, 0);
                                                                    composer5.startReplaceableGroup(-1323940314);
                                                                    ComposerKt.sourceInformation(composer5, "C(Layout)P(!1,2)74@2915L7,75@2970L7,76@3029L7,77@3041L460:Layout.kt#80mrfh");
                                                                    ProvidableCompositionLocal<Density> localDensity3 = CompositionLocalsKt.getLocalDensity();
                                                                    ComposerKt.sourceInformationMarkerStart(composer5, 2023513938, "C:CompositionLocal.kt#9igjgp");
                                                                    Object consume3 = composer5.consume(localDensity3);
                                                                    ComposerKt.sourceInformationMarkerEnd(composer5);
                                                                    Density density = (Density) consume3;
                                                                    ProvidableCompositionLocal<LayoutDirection> localLayoutDirection = CompositionLocalsKt.getLocalLayoutDirection();
                                                                    ComposerKt.sourceInformationMarkerStart(composer5, 2023513938, "C:CompositionLocal.kt#9igjgp");
                                                                    Object consume4 = composer5.consume(localLayoutDirection);
                                                                    ComposerKt.sourceInformationMarkerEnd(composer5);
                                                                    LayoutDirection layoutDirection = (LayoutDirection) consume4;
                                                                    ProvidableCompositionLocal<ViewConfiguration> localViewConfiguration = CompositionLocalsKt.getLocalViewConfiguration();
                                                                    ComposerKt.sourceInformationMarkerStart(composer5, 2023513938, "C:CompositionLocal.kt#9igjgp");
                                                                    Object consume5 = composer5.consume(localViewConfiguration);
                                                                    ComposerKt.sourceInformationMarkerEnd(composer5);
                                                                    ViewConfiguration viewConfiguration = (ViewConfiguration) consume5;
                                                                    Function0<ComposeUiNode> constructor = ComposeUiNode.INSTANCE.getConstructor();
                                                                    Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> materializerOf = LayoutKt.materializerOf(m424paddingqDBjuR0$default);
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
                                                                    Updater.m1290setimpl(m1283constructorimpl, rememberBoxMeasurePolicy, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
                                                                    Updater.m1290setimpl(m1283constructorimpl, density, ComposeUiNode.INSTANCE.getSetDensity());
                                                                    Updater.m1290setimpl(m1283constructorimpl, layoutDirection, ComposeUiNode.INSTANCE.getSetLayoutDirection());
                                                                    Updater.m1290setimpl(m1283constructorimpl, viewConfiguration, ComposeUiNode.INSTANCE.getSetViewConfiguration());
                                                                    composer5.enableReusing();
                                                                    materializerOf.invoke(SkippableUpdater.m1273boximpl(SkippableUpdater.m1274constructorimpl(composer5)), composer5, 0);
                                                                    composer5.startReplaceableGroup(2058660585);
                                                                    composer5.startReplaceableGroup(-2137368960);
                                                                    ComposerKt.sourceInformation(composer5, "C72@3384L9:Box.kt#2w3rfo");
                                                                    BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
                                                                    composer5.startReplaceableGroup(-1889954677);
                                                                    ComposerKt.sourceInformation(composer5, "C352@15582L19,353@15622L420:BackdropScaffold.kt#jmzs0o");
                                                                    function24.invoke(composer5, Integer.valueOf((i41 >> 6) & 14));
                                                                    BackdropScaffoldKt.m894Scrim3JVO9M(j32, new Function0<Unit>() { // from class: androidx.compose.material.BackdropScaffoldKt$BackdropScaffold$1$1$2$1$1
                                                                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                                                        {
                                                                            super(0);
                                                                        }

                                                                        @Override // kotlin.jvm.functions.Function0
                                                                        public /* bridge */ /* synthetic */ Unit invoke() {
                                                                            invoke2();
                                                                            return Unit.INSTANCE;
                                                                        }

                                                                        /* renamed from: invoke, reason: avoid collision after fix types in other method */
                                                                        public final void invoke2() {
                                                                            if (z21 && backdropScaffoldState11.getConfirmStateChange$material_release().invoke(BackdropValue.Concealed).booleanValue()) {
                                                                                BuildersKt__Builders_commonKt.launch$default(coroutineScope4, null, null, new AnonymousClass1(backdropScaffoldState11, null), 3, null);
                                                                            }
                                                                        }

                                                                        /* compiled from: BackdropScaffold.kt */
                                                                        @Metadata(k = 3, mv = {1, 6, 0}, xi = 48)
                                                                        @DebugMetadata(c = "androidx.compose.material.BackdropScaffoldKt$BackdropScaffold$1$1$2$1$1$1", f = "BackdropScaffold.kt", i = {}, l = {358}, m = "invokeSuspend", n = {}, s = {})
                                                                        /* renamed from: androidx.compose.material.BackdropScaffoldKt$BackdropScaffold$1$1$2$1$1$1, reason: invalid class name */
                                                                        static final class AnonymousClass1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
                                                                            final /* synthetic */ BackdropScaffoldState $scaffoldState;
                                                                            int label;

                                                                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                                                            AnonymousClass1(BackdropScaffoldState backdropScaffoldState, Continuation<? super AnonymousClass1> continuation) {
                                                                                super(2, continuation);
                                                                                this.$scaffoldState = backdropScaffoldState;
                                                                            }

                                                                            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                                                                            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                                                                                return new AnonymousClass1(this.$scaffoldState, continuation);
                                                                            }

                                                                            @Override // kotlin.jvm.functions.Function2
                                                                            public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
                                                                                return ((AnonymousClass1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
                                                                            }

                                                                            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                                                                            public final Object invokeSuspend(Object obj) {
                                                                                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                                                                                int i = this.label;
                                                                                if (i == 0) {
                                                                                    ResultKt.throwOnFailure(obj);
                                                                                    this.label = 1;
                                                                                    if (this.$scaffoldState.conceal(this) == coroutine_suspended) {
                                                                                        return coroutine_suspended;
                                                                                    }
                                                                                } else {
                                                                                    if (i != 1) {
                                                                                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                                                                                    }
                                                                                    ResultKt.throwOnFailure(obj);
                                                                                }
                                                                                return Unit.INSTANCE;
                                                                            }
                                                                        }
                                                                    }, backdropScaffoldState11.getTargetValue() == BackdropValue.Revealed, composer5, (i42 >> 18) & 14);
                                                                    composer5.endReplaceableGroup();
                                                                    composer5.endReplaceableGroup();
                                                                    composer5.endReplaceableGroup();
                                                                    composer5.endNode();
                                                                    composer5.endReplaceableGroup();
                                                                    composer5.endReplaceableGroup();
                                                                    return;
                                                                }
                                                                composer5.skipToGroupEnd();
                                                            }
                                                        });
                                                        int i40 = i35;
                                                        SurfaceKt.m1172SurfaceFjzlyU(then, shape9, j29, j30, null, f22, composableLambda2, composer4, ((i40 >> 3) & 112) | 1572864 | ((i40 >> 6) & 896) | ((i40 >> 6) & 7168) | ((i40 << 6) & 458752), 16);
                                                        Modifier.Companion companion4 = Modifier.INSTANCE;
                                                        if (backdropScaffoldState7.isRevealed() && f21 == m3795getMaxHeightimpl - f14) {
                                                            m3840constructorimpl = f17;
                                                        } else {
                                                            m3840constructorimpl = Dp.m3840constructorimpl(0);
                                                        }
                                                        Modifier m424paddingqDBjuR0$default = PaddingKt.m424paddingqDBjuR0$default(companion4, 0.0f, 0.0f, 0.0f, m3840constructorimpl, 7, null);
                                                        Alignment bottomCenter = Alignment.INSTANCE.getBottomCenter();
                                                        Function3<SnackbarHostState, Composer, Integer, Unit> function37 = function36;
                                                        BackdropScaffoldState backdropScaffoldState11 = backdropScaffoldState7;
                                                        int i41 = i35;
                                                        composer4.startReplaceableGroup(733328855);
                                                        ComposerKt.sourceInformation(composer4, "C(Box)P(2,1,3)70@3267L67,71@3339L130:Box.kt#2w3rfo");
                                                        MeasurePolicy rememberBoxMeasurePolicy = BoxKt.rememberBoxMeasurePolicy(bottomCenter, false, composer4, 6);
                                                        composer4.startReplaceableGroup(-1323940314);
                                                        ComposerKt.sourceInformation(composer4, "C(Layout)P(!1,2)74@2915L7,75@2970L7,76@3029L7,77@3041L460:Layout.kt#80mrfh");
                                                        ProvidableCompositionLocal<Density> localDensity3 = CompositionLocalsKt.getLocalDensity();
                                                        ComposerKt.sourceInformationMarkerStart(composer4, 2023513938, "C:CompositionLocal.kt#9igjgp");
                                                        Object consume3 = composer4.consume(localDensity3);
                                                        ComposerKt.sourceInformationMarkerEnd(composer4);
                                                        Density density = (Density) consume3;
                                                        ProvidableCompositionLocal<LayoutDirection> localLayoutDirection = CompositionLocalsKt.getLocalLayoutDirection();
                                                        ComposerKt.sourceInformationMarkerStart(composer4, 2023513938, "C:CompositionLocal.kt#9igjgp");
                                                        Object consume4 = composer4.consume(localLayoutDirection);
                                                        ComposerKt.sourceInformationMarkerEnd(composer4);
                                                        LayoutDirection layoutDirection = (LayoutDirection) consume4;
                                                        ProvidableCompositionLocal<ViewConfiguration> localViewConfiguration = CompositionLocalsKt.getLocalViewConfiguration();
                                                        ComposerKt.sourceInformationMarkerStart(composer4, 2023513938, "C:CompositionLocal.kt#9igjgp");
                                                        Object consume5 = composer4.consume(localViewConfiguration);
                                                        ComposerKt.sourceInformationMarkerEnd(composer4);
                                                        ViewConfiguration viewConfiguration = (ViewConfiguration) consume5;
                                                        Function0<ComposeUiNode> constructor = ComposeUiNode.INSTANCE.getConstructor();
                                                        Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> materializerOf = LayoutKt.materializerOf(m424paddingqDBjuR0$default);
                                                        if (!(composer4.getApplier() instanceof Applier)) {
                                                            ComposablesKt.invalidApplier();
                                                        }
                                                        composer4.startReusableNode();
                                                        if (composer4.getInserting()) {
                                                            composer4.createNode(constructor);
                                                        } else {
                                                            composer4.useNode();
                                                        }
                                                        composer4.disableReusing();
                                                        Composer m1283constructorimpl = Updater.m1283constructorimpl(composer4);
                                                        Updater.m1290setimpl(m1283constructorimpl, rememberBoxMeasurePolicy, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
                                                        Updater.m1290setimpl(m1283constructorimpl, density, ComposeUiNode.INSTANCE.getSetDensity());
                                                        Updater.m1290setimpl(m1283constructorimpl, layoutDirection, ComposeUiNode.INSTANCE.getSetLayoutDirection());
                                                        Updater.m1290setimpl(m1283constructorimpl, viewConfiguration, ComposeUiNode.INSTANCE.getSetViewConfiguration());
                                                        composer4.enableReusing();
                                                        materializerOf.invoke(SkippableUpdater.m1273boximpl(SkippableUpdater.m1274constructorimpl(composer4)), composer4, 0);
                                                        composer4.startReplaceableGroup(2058660585);
                                                        composer4.startReplaceableGroup(-2137368960);
                                                        ComposerKt.sourceInformation(composer4, "C72@3384L9:Box.kt#2w3rfo");
                                                        BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
                                                        composer4.startReplaceableGroup(1815906203);
                                                        ComposerKt.sourceInformation(composer4, "C375@16478L45:BackdropScaffold.kt#jmzs0o");
                                                        function37.invoke(backdropScaffoldState11.getSnackbarHostState(), composer4, Integer.valueOf((i41 >> 18) & 112));
                                                        composer4.endReplaceableGroup();
                                                        composer4.endReplaceableGroup();
                                                        composer4.endReplaceableGroup();
                                                        composer4.endNode();
                                                        composer4.endReplaceableGroup();
                                                        composer4.endReplaceableGroup();
                                                        return;
                                                    }
                                                    composer4.skipToGroupEnd();
                                                }
                                            }), composer3, 3120);
                                            return;
                                        }
                                        composer3.skipToGroupEnd();
                                    }
                                }), composer2, (i32 & 7168) | (i32 & 896) | 1572864, 51);
                                modifier2 = modifier4;
                                backdropScaffoldState2 = backdropScaffoldState6;
                                z9 = z6;
                                z10 = z7;
                                z11 = z8;
                                shape5 = shape4;
                                j17 = j13;
                                j18 = j15;
                                f8 = f5;
                                j19 = j16;
                                j20 = j14;
                                j21 = j12;
                                function34 = function33;
                                f9 = f11;
                                f10 = f12;
                            } else {
                                startRestartGroup.skipToGroupEnd();
                                z9 = z;
                                f10 = f;
                                z10 = z2;
                                j18 = j2;
                                f8 = f3;
                                j19 = j3;
                                j20 = j4;
                                j21 = j5;
                                shape5 = shape2;
                                function34 = function32;
                                composer2 = startRestartGroup;
                                f9 = f2;
                                z11 = z3;
                                j17 = j;
                            }
                            endRestartGroup = composer2.endRestartGroup();
                            if (endRestartGroup != null) {
                                return;
                            }
                            endRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material.BackdropScaffoldKt$BackdropScaffold$2
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

                                public final void invoke(Composer composer3, int i33) {
                                    BackdropScaffoldKt.m893BackdropScaffoldBZszfkY(appBar, backLayerContent, frontLayerContent, modifier2, backdropScaffoldState2, z9, f10, f9, z10, z11, j17, j18, shape5, f8, j19, j20, j21, function34, composer3, i | 1, i2, i3);
                                }
                            });
                            return;
                        }
                        if ((i2 & 57344) == 0) {
                        }
                        if ((458752 & i2) == 0) {
                        }
                        if ((3670016 & i2) == 0) {
                        }
                        i15 = i3 & 131072;
                        if (i15 == 0) {
                        }
                        int i272 = i13;
                        if ((1533916891 & i4) == 306783378) {
                        }
                        startRestartGroup.startDefaults();
                        if ((i & 1) != 0) {
                        }
                        if (i25 == 0) {
                        }
                        if ((i3 & 16) == 0) {
                        }
                        if (i5 == 0) {
                        }
                        if (i6 == 0) {
                        }
                        if (i17 == 0) {
                        }
                        if (i18 == 0) {
                        }
                        if (i19 == 0) {
                        }
                        if ((i3 & 1024) == 0) {
                        }
                        if ((i3 & 2048) == 0) {
                        }
                        int i282 = i20;
                        if ((i3 & 4096) == 0) {
                        }
                        if (i16 == 0) {
                        }
                        Shape shape62 = shape3;
                        if ((i3 & 16384) == 0) {
                        }
                        if ((i3 & 32768) == 0) {
                        }
                        if ((i3 & 65536) == 0) {
                        }
                        if (i15 == 0) {
                        }
                        i23 = i21;
                        f6 = m891getPeekHeightD9Ej5fM;
                        f7 = m890getHeaderHeightD9Ej5fM;
                        startRestartGroup.endDefaults();
                        ProvidableCompositionLocal<Density> localDensity3 = CompositionLocalsKt.getLocalDensity();
                        ComposerKt.sourceInformationMarkerStart(startRestartGroup, 2023513938, "C:CompositionLocal.kt#9igjgp");
                        Object consume3 = startRestartGroup.consume(localDensity3);
                        ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                        final float mo315toPx0680j_43 = ((Density) consume3).mo315toPx0680j_4(f6);
                        ProvidableCompositionLocal<Density> localDensity22 = CompositionLocalsKt.getLocalDensity();
                        ComposerKt.sourceInformationMarkerStart(startRestartGroup, 2023513938, "C:CompositionLocal.kt#9igjgp");
                        Object consume22 = startRestartGroup.consume(localDensity22);
                        ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                        final float mo315toPx0680j_422 = ((Density) consume22).mo315toPx0680j_4(f7);
                        final boolean z152 = z7;
                        final BackdropScaffoldState backdropScaffoldState42 = backdropScaffoldState3;
                        final int i292 = i23;
                        final Function2<? super Composer, ? super Integer, Unit> composableLambda2 = ComposableLambdaKt.composableLambda(startRestartGroup, 1744778315, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material.BackdropScaffoldKt$BackdropScaffold$backLayer$1
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

                            public final void invoke(Composer composer3, int i302) {
                                ComposerKt.sourceInformation(composer3, "C:BackdropScaffold.kt#jmzs0o");
                                if ((i302 & 11) != 2 || !composer3.getSkipping()) {
                                    if (z152) {
                                        composer3.startReplaceableGroup(-1017265331);
                                        ComposerKt.sourceInformation(composer3, "280@12876L82");
                                        Function2<Composer, Integer, Unit> function2 = appBar;
                                        int i312 = i292;
                                        Function2<Composer, Integer, Unit> function22 = backLayerContent;
                                        composer3.startReplaceableGroup(-483455358);
                                        ComposerKt.sourceInformation(composer3, "C(Column)P(2,3,1)77@3880L61,78@3946L133:Column.kt#2w3rfo");
                                        Modifier.Companion companion2 = Modifier.INSTANCE;
                                        MeasurePolicy columnMeasurePolicy = ColumnKt.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), Alignment.INSTANCE.getStart(), composer3, 0);
                                        composer3.startReplaceableGroup(-1323940314);
                                        ComposerKt.sourceInformation(composer3, "C(Layout)P(!1,2)74@2915L7,75@2970L7,76@3029L7,77@3041L460:Layout.kt#80mrfh");
                                        ProvidableCompositionLocal<Density> localDensity32 = CompositionLocalsKt.getLocalDensity();
                                        ComposerKt.sourceInformationMarkerStart(composer3, 2023513938, "C:CompositionLocal.kt#9igjgp");
                                        Object consume32 = composer3.consume(localDensity32);
                                        ComposerKt.sourceInformationMarkerEnd(composer3);
                                        Density density = (Density) consume32;
                                        ProvidableCompositionLocal<LayoutDirection> localLayoutDirection = CompositionLocalsKt.getLocalLayoutDirection();
                                        ComposerKt.sourceInformationMarkerStart(composer3, 2023513938, "C:CompositionLocal.kt#9igjgp");
                                        Object consume4 = composer3.consume(localLayoutDirection);
                                        ComposerKt.sourceInformationMarkerEnd(composer3);
                                        LayoutDirection layoutDirection = (LayoutDirection) consume4;
                                        ProvidableCompositionLocal<ViewConfiguration> localViewConfiguration = CompositionLocalsKt.getLocalViewConfiguration();
                                        ComposerKt.sourceInformationMarkerStart(composer3, 2023513938, "C:CompositionLocal.kt#9igjgp");
                                        Object consume5 = composer3.consume(localViewConfiguration);
                                        ComposerKt.sourceInformationMarkerEnd(composer3);
                                        ViewConfiguration viewConfiguration = (ViewConfiguration) consume5;
                                        Function0<ComposeUiNode> constructor = ComposeUiNode.INSTANCE.getConstructor();
                                        Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> materializerOf = LayoutKt.materializerOf(companion2);
                                        if (!(composer3.getApplier() instanceof Applier)) {
                                            ComposablesKt.invalidApplier();
                                        }
                                        composer3.startReusableNode();
                                        if (composer3.getInserting()) {
                                            composer3.createNode(constructor);
                                        } else {
                                            composer3.useNode();
                                        }
                                        composer3.disableReusing();
                                        Composer m1283constructorimpl = Updater.m1283constructorimpl(composer3);
                                        Updater.m1290setimpl(m1283constructorimpl, columnMeasurePolicy, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
                                        Updater.m1290setimpl(m1283constructorimpl, density, ComposeUiNode.INSTANCE.getSetDensity());
                                        Updater.m1290setimpl(m1283constructorimpl, layoutDirection, ComposeUiNode.INSTANCE.getSetLayoutDirection());
                                        Updater.m1290setimpl(m1283constructorimpl, viewConfiguration, ComposeUiNode.INSTANCE.getSetViewConfiguration());
                                        composer3.enableReusing();
                                        materializerOf.invoke(SkippableUpdater.m1273boximpl(SkippableUpdater.m1274constructorimpl(composer3)), composer3, 0);
                                        composer3.startReplaceableGroup(2058660585);
                                        composer3.startReplaceableGroup(-1163856341);
                                        ComposerKt.sourceInformation(composer3, "C79@3994L9:Column.kt#2w3rfo");
                                        ColumnScopeInstance columnScopeInstance = ColumnScopeInstance.INSTANCE;
                                        composer3.startReplaceableGroup(-18835878);
                                        ComposerKt.sourceInformation(composer3, "C281@12901L8,282@12926L18:BackdropScaffold.kt#jmzs0o");
                                        function2.invoke(composer3, Integer.valueOf(i312 & 14));
                                        function22.invoke(composer3, Integer.valueOf((i312 >> 3) & 14));
                                        composer3.endReplaceableGroup();
                                        composer3.endReplaceableGroup();
                                        composer3.endReplaceableGroup();
                                        composer3.endNode();
                                        composer3.endReplaceableGroup();
                                        composer3.endReplaceableGroup();
                                        composer3.endReplaceableGroup();
                                        return;
                                    }
                                    composer3.startReplaceableGroup(-1017265219);
                                    ComposerKt.sourceInformation(composer3, "285@12988L72");
                                    BackdropValue targetValue = backdropScaffoldState42.getTargetValue();
                                    Function2<Composer, Integer, Unit> function23 = appBar;
                                    Function2<Composer, Integer, Unit> function24 = backLayerContent;
                                    int i322 = i292;
                                    BackdropScaffoldKt.BackLayerTransition(targetValue, function23, function24, composer3, ((i322 << 3) & 896) | ((i322 << 3) & 112));
                                    composer3.endReplaceableGroup();
                                    return;
                                }
                                composer3.skipToGroupEnd();
                            }
                        });
                        Float valueOf2 = Float.valueOf(mo315toPx0680j_422);
                        startRestartGroup.startReplaceableGroup(1157296644);
                        ComposerKt.sourceInformation(startRestartGroup, "C(remember)P(1):Composables.kt#9igjgp");
                        changed = startRestartGroup.changed(valueOf2);
                        rememberedValue = startRestartGroup.rememberedValue();
                        if (!changed) {
                        }
                        rememberedValue = (Function1) new Function1<Constraints, Constraints>() { // from class: androidx.compose.material.BackdropScaffoldKt$BackdropScaffold$calculateBackLayerConstraints$1$1
                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            {
                                super(1);
                            }

                            @Override // kotlin.jvm.functions.Function1
                            public /* bridge */ /* synthetic */ Constraints invoke(Constraints constraints) {
                                return Constraints.m3784boximpl(m900invokeZezNO4M(constraints.getValue()));
                            }

                            /* renamed from: invoke-ZezNO4M, reason: not valid java name */
                            public final long m900invokeZezNO4M(long j222) {
                                return ConstraintsKt.m3813offsetNN6EwU$default(Constraints.m3787copyZbe2FdA$default(j222, 0, 0, 0, 0, 10, null), 0, -MathKt.roundToInt(mo315toPx0680j_422), 1, null);
                            }
                        };
                        startRestartGroup.updateRememberedValue(rememberedValue);
                        startRestartGroup.endReplaceableGroup();
                        final Function1<? super Constraints, Constraints> function12 = (Function1) rememberedValue;
                        final Modifier modifier52 = modifier4;
                        final boolean z162 = z8;
                        final boolean z172 = z6;
                        final float f112 = f7;
                        final BackdropScaffoldState backdropScaffoldState52 = backdropScaffoldState3;
                        final float f122 = f6;
                        BackdropScaffoldState backdropScaffoldState62 = backdropScaffoldState3;
                        composer2 = startRestartGroup;
                        final int i302 = i23;
                        final Shape shape72 = shape4;
                        final long j222 = j16;
                        final long j232 = j14;
                        final float f132 = f5;
                        final int i312 = i22;
                        final long j242 = j12;
                        final Function3<? super SnackbarHostState, ? super Composer, ? super Integer, Unit> function352 = function33;
                        int i322 = i22 << 6;
                        SurfaceKt.m1172SurfaceFjzlyU(null, null, j13, j15, null, 0.0f, ComposableLambdaKt.composableLambda(composer2, -1049909631, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material.BackdropScaffoldKt$BackdropScaffold$1
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

                            public final void invoke(Composer composer3, int i33) {
                                ComposerKt.sourceInformation(composer3, "C297@13395L24,298@13428L3119:BackdropScaffold.kt#jmzs0o");
                                if ((i33 & 11) != 2 || !composer3.getSkipping()) {
                                    composer3.startReplaceableGroup(773894976);
                                    ComposerKt.sourceInformation(composer3, "C(rememberCoroutineScope)475@19849L144:Effects.kt#9igjgp");
                                    composer3.startReplaceableGroup(-492369756);
                                    ComposerKt.sourceInformation(composer3, "C(remember):Composables.kt#9igjgp");
                                    Object rememberedValue2 = composer3.rememberedValue();
                                    if (rememberedValue2 == Composer.INSTANCE.getEmpty()) {
                                        CompositionScopedCoroutineScopeCanceller compositionScopedCoroutineScopeCanceller = new CompositionScopedCoroutineScopeCanceller(EffectsKt.createCompositionCoroutineScope(EmptyCoroutineContext.INSTANCE, composer3));
                                        composer3.updateRememberedValue(compositionScopedCoroutineScopeCanceller);
                                        rememberedValue2 = compositionScopedCoroutineScopeCanceller;
                                    }
                                    composer3.endReplaceableGroup();
                                    final CoroutineScope coroutineScope = ((CompositionScopedCoroutineScopeCanceller) rememberedValue2).getCoroutineScope();
                                    composer3.endReplaceableGroup();
                                    Modifier fillMaxSize$default = SizeKt.fillMaxSize$default(Modifier.this, 0.0f, 1, null);
                                    Function2<Composer, Integer, Unit> function2 = composableLambda2;
                                    Function1<Constraints, Constraints> function122 = function12;
                                    final float f14 = mo315toPx0680j_422;
                                    final boolean z18 = z162;
                                    final boolean z19 = z172;
                                    final BackdropScaffoldState backdropScaffoldState7 = backdropScaffoldState52;
                                    final float f15 = mo315toPx0680j_43;
                                    final int i34 = i302;
                                    final Shape shape8 = shape72;
                                    final long j25 = j222;
                                    final long j26 = j232;
                                    final float f16 = f132;
                                    final int i35 = i312;
                                    final float f17 = f112;
                                    final float f18 = f122;
                                    final Function2<? super Composer, ? super Integer, Unit> function22 = frontLayerContent;
                                    final long j27 = j242;
                                    final Function3<? super SnackbarHostState, ? super Composer, ? super Integer, Unit> function36 = function352;
                                    BackdropScaffoldKt.BackdropStack(fillMaxSize$default, function2, function122, ComposableLambdaKt.composableLambda(composer3, 1800047509, true, new Function4<Constraints, Float, Composer, Integer, Unit>() { // from class: androidx.compose.material.BackdropScaffoldKt$BackdropScaffold$1.1
                                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                        /* JADX WARN: Multi-variable type inference failed */
                                        {
                                            super(4);
                                        }

                                        @Override // kotlin.jvm.functions.Function4
                                        public /* bridge */ /* synthetic */ Unit invoke(Constraints constraints, Float f19, Composer composer4, Integer num) {
                                            m898invokejYbf7pk(constraints.getValue(), f19.floatValue(), composer4, num.intValue());
                                            return Unit.INSTANCE;
                                        }

                                        /* renamed from: invoke-jYbf7pk, reason: not valid java name */
                                        public final void m898invokejYbf7pk(long j28, float f19, Composer composer4, int i36) {
                                            int i37;
                                            Modifier.Companion companion2;
                                            Modifier m1182swipeablepPrIpRY;
                                            float m3840constructorimpl;
                                            ComposerKt.sourceInformation(composer4, "CP(1:c#ui.unit.Constraints)344@15194L57,342@15132L942,366@16117L420:BackdropScaffold.kt#jmzs0o");
                                            if ((i36 & 14) == 0) {
                                                i37 = i36 | (composer4.changed(j28) ? 4 : 2);
                                            } else {
                                                i37 = i36;
                                            }
                                            if ((i36 & 112) == 0) {
                                                i37 |= composer4.changed(f19) ? 32 : 16;
                                            }
                                            if ((i37 & 731) != 146 || !composer4.getSkipping()) {
                                                float m3795getMaxHeightimpl = Constraints.m3795getMaxHeightimpl(j28);
                                                float f20 = m3795getMaxHeightimpl - f14;
                                                if (z18) {
                                                    f20 = Math.min(f20, f19);
                                                }
                                                float f21 = f20;
                                                if (z19) {
                                                    companion2 = NestedScrollModifierKt.nestedScroll$default(Modifier.INSTANCE, backdropScaffoldState7.getNestedScrollConnection(), null, 2, null);
                                                } else {
                                                    companion2 = Modifier.INSTANCE;
                                                }
                                                m1182swipeablepPrIpRY = SwipeableKt.m1182swipeablepPrIpRY(Modifier.INSTANCE.then(companion2), backdropScaffoldState7, r18, Orientation.Vertical, (r26 & 8) != 0 ? true : z19, (r26 & 16) != 0 ? false : false, (r26 & 32) != 0 ? null : null, (r26 & 64) != 0 ? new Function2<T, T, FixedThreshold>() { // from class: androidx.compose.material.SwipeableKt$swipeable$1
                                                    /* JADX WARN: Can't rename method to resolve collision */
                                                    @Override // kotlin.jvm.functions.Function2
                                                    public final FixedThreshold invoke(T t, T t2) {
                                                        return new FixedThreshold(Dp.m3840constructorimpl(56), null);
                                                    }
                                                } : null, (r26 & 128) != 0 ? SwipeableDefaults.resistanceConfig$default(SwipeableDefaults.INSTANCE, MapsKt.mapOf(TuplesKt.to(Float.valueOf(f15), BackdropValue.Concealed), TuplesKt.to(Float.valueOf(f21), BackdropValue.Revealed)).keySet(), 0.0f, 0.0f, 6, null) : null, (r26 & 256) != 0 ? SwipeableDefaults.INSTANCE.m1181getVelocityThresholdD9Ej5fM() : 0.0f);
                                                final BackdropScaffoldState backdropScaffoldState8 = backdropScaffoldState7;
                                                final CoroutineScope coroutineScope2 = coroutineScope;
                                                Modifier semantics$default = SemanticsModifierKt.semantics$default(m1182swipeablepPrIpRY, false, new Function1<SemanticsPropertyReceiver, Unit>() { // from class: androidx.compose.material.BackdropScaffoldKt$BackdropScaffold$1$1$swipeable$1
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
                                                        if (BackdropScaffoldState.this.isConcealed()) {
                                                            final BackdropScaffoldState backdropScaffoldState9 = BackdropScaffoldState.this;
                                                            final CoroutineScope coroutineScope3 = coroutineScope2;
                                                            SemanticsPropertiesKt.collapse$default(semantics, null, new Function0<Boolean>() { // from class: androidx.compose.material.BackdropScaffoldKt$BackdropScaffold$1$1$swipeable$1.1
                                                                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                                                {
                                                                    super(0);
                                                                }

                                                                /* JADX WARN: Can't rename method to resolve collision */
                                                                @Override // kotlin.jvm.functions.Function0
                                                                public final Boolean invoke() {
                                                                    if (BackdropScaffoldState.this.getConfirmStateChange$material_release().invoke(BackdropValue.Revealed).booleanValue()) {
                                                                        BuildersKt__Builders_commonKt.launch$default(coroutineScope3, null, null, new C00301(BackdropScaffoldState.this, null), 3, null);
                                                                    }
                                                                    return true;
                                                                }

                                                                /* compiled from: BackdropScaffold.kt */
                                                                @Metadata(k = 3, mv = {1, 6, 0}, xi = 48)
                                                                @DebugMetadata(c = "androidx.compose.material.BackdropScaffoldKt$BackdropScaffold$1$1$swipeable$1$1$1", f = "BackdropScaffold.kt", i = {}, l = {330}, m = "invokeSuspend", n = {}, s = {})
                                                                /* renamed from: androidx.compose.material.BackdropScaffoldKt$BackdropScaffold$1$1$swipeable$1$1$1, reason: invalid class name and collision with other inner class name */
                                                                static final class C00301 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
                                                                    final /* synthetic */ BackdropScaffoldState $scaffoldState;
                                                                    int label;

                                                                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                                                    C00301(BackdropScaffoldState backdropScaffoldState, Continuation<? super C00301> continuation) {
                                                                        super(2, continuation);
                                                                        this.$scaffoldState = backdropScaffoldState;
                                                                    }

                                                                    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                                                                    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                                                                        return new C00301(this.$scaffoldState, continuation);
                                                                    }

                                                                    @Override // kotlin.jvm.functions.Function2
                                                                    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
                                                                        return ((C00301) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
                                                                    }

                                                                    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                                                                    public final Object invokeSuspend(Object obj) {
                                                                        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                                                                        int i = this.label;
                                                                        if (i == 0) {
                                                                            ResultKt.throwOnFailure(obj);
                                                                            this.label = 1;
                                                                            if (this.$scaffoldState.reveal(this) == coroutine_suspended) {
                                                                                return coroutine_suspended;
                                                                            }
                                                                        } else {
                                                                            if (i != 1) {
                                                                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                                                                            }
                                                                            ResultKt.throwOnFailure(obj);
                                                                        }
                                                                        return Unit.INSTANCE;
                                                                    }
                                                                }
                                                            }, 1, null);
                                                        } else {
                                                            final BackdropScaffoldState backdropScaffoldState10 = BackdropScaffoldState.this;
                                                            final CoroutineScope coroutineScope4 = coroutineScope2;
                                                            SemanticsPropertiesKt.expand$default(semantics, null, new Function0<Boolean>() { // from class: androidx.compose.material.BackdropScaffoldKt$BackdropScaffold$1$1$swipeable$1.2
                                                                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                                                {
                                                                    super(0);
                                                                }

                                                                /* JADX WARN: Can't rename method to resolve collision */
                                                                @Override // kotlin.jvm.functions.Function0
                                                                public final Boolean invoke() {
                                                                    if (BackdropScaffoldState.this.getConfirmStateChange$material_release().invoke(BackdropValue.Concealed).booleanValue()) {
                                                                        BuildersKt__Builders_commonKt.launch$default(coroutineScope4, null, null, new AnonymousClass1(BackdropScaffoldState.this, null), 3, null);
                                                                    }
                                                                    return true;
                                                                }

                                                                /* compiled from: BackdropScaffold.kt */
                                                                @Metadata(k = 3, mv = {1, 6, 0}, xi = 48)
                                                                @DebugMetadata(c = "androidx.compose.material.BackdropScaffoldKt$BackdropScaffold$1$1$swipeable$1$2$1", f = "BackdropScaffold.kt", i = {}, l = {336}, m = "invokeSuspend", n = {}, s = {})
                                                                /* renamed from: androidx.compose.material.BackdropScaffoldKt$BackdropScaffold$1$1$swipeable$1$2$1, reason: invalid class name */
                                                                static final class AnonymousClass1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
                                                                    final /* synthetic */ BackdropScaffoldState $scaffoldState;
                                                                    int label;

                                                                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                                                    AnonymousClass1(BackdropScaffoldState backdropScaffoldState, Continuation<? super AnonymousClass1> continuation) {
                                                                        super(2, continuation);
                                                                        this.$scaffoldState = backdropScaffoldState;
                                                                    }

                                                                    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                                                                    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                                                                        return new AnonymousClass1(this.$scaffoldState, continuation);
                                                                    }

                                                                    @Override // kotlin.jvm.functions.Function2
                                                                    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
                                                                        return ((AnonymousClass1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
                                                                    }

                                                                    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                                                                    public final Object invokeSuspend(Object obj) {
                                                                        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                                                                        int i = this.label;
                                                                        if (i == 0) {
                                                                            ResultKt.throwOnFailure(obj);
                                                                            this.label = 1;
                                                                            if (this.$scaffoldState.conceal(this) == coroutine_suspended) {
                                                                                return coroutine_suspended;
                                                                            }
                                                                        } else {
                                                                            if (i != 1) {
                                                                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                                                                            }
                                                                            ResultKt.throwOnFailure(obj);
                                                                        }
                                                                        return Unit.INSTANCE;
                                                                    }
                                                                }
                                                            }, 1, null);
                                                        }
                                                    }
                                                }, 1, null);
                                                Modifier.Companion companion3 = Modifier.INSTANCE;
                                                final BackdropScaffoldState backdropScaffoldState9 = backdropScaffoldState7;
                                                composer4.startReplaceableGroup(1157296644);
                                                ComposerKt.sourceInformation(composer4, "C(remember)P(1):Composables.kt#9igjgp");
                                                boolean changed2 = composer4.changed(backdropScaffoldState9);
                                                Object rememberedValue3 = composer4.rememberedValue();
                                                if (changed2 || rememberedValue3 == Composer.INSTANCE.getEmpty()) {
                                                    rememberedValue3 = (Function1) new Function1<Density, IntOffset>() { // from class: androidx.compose.material.BackdropScaffoldKt$BackdropScaffold$1$1$1$1
                                                        {
                                                            super(1);
                                                        }

                                                        @Override // kotlin.jvm.functions.Function1
                                                        public /* bridge */ /* synthetic */ IntOffset invoke(Density density) {
                                                            return IntOffset.m3949boximpl(m899invokeBjo55l4(density));
                                                        }

                                                        /* renamed from: invoke-Bjo55l4, reason: not valid java name */
                                                        public final long m899invokeBjo55l4(Density offset) {
                                                            Intrinsics.checkNotNullParameter(offset, "$this$offset");
                                                            return IntOffsetKt.IntOffset(0, MathKt.roundToInt(BackdropScaffoldState.this.getOffset().getValue().floatValue()));
                                                        }
                                                    };
                                                    composer4.updateRememberedValue(rememberedValue3);
                                                }
                                                composer4.endReplaceableGroup();
                                                Modifier then = OffsetKt.offset(companion3, (Function1) rememberedValue3).then(semantics$default);
                                                Shape shape9 = shape8;
                                                long j29 = j25;
                                                long j30 = j26;
                                                float f22 = f16;
                                                final float f23 = f18;
                                                final Function2<? super Composer, ? super Integer, Unit> function23 = function22;
                                                final int i38 = i34;
                                                final long j31 = j27;
                                                final BackdropScaffoldState backdropScaffoldState10 = backdropScaffoldState7;
                                                final int i39 = i35;
                                                final boolean z20 = z19;
                                                final CoroutineScope coroutineScope3 = coroutineScope;
                                                ComposableLambda composableLambda22 = ComposableLambdaKt.composableLambda(composer4, -1065299503, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material.BackdropScaffoldKt.BackdropScaffold.1.1.2
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

                                                    public final void invoke(Composer composer5, int i40) {
                                                        ComposerKt.sourceInformation(composer5, "C351@15517L543:BackdropScaffold.kt#jmzs0o");
                                                        if ((i40 & 11) != 2 || !composer5.getSkipping()) {
                                                            Modifier m424paddingqDBjuR0$default = PaddingKt.m424paddingqDBjuR0$default(Modifier.INSTANCE, 0.0f, 0.0f, 0.0f, f23, 7, null);
                                                            Function2<Composer, Integer, Unit> function24 = function23;
                                                            int i41 = i38;
                                                            long j32 = j31;
                                                            final BackdropScaffoldState backdropScaffoldState11 = backdropScaffoldState10;
                                                            int i42 = i39;
                                                            final boolean z21 = z20;
                                                            final CoroutineScope coroutineScope4 = coroutineScope3;
                                                            composer5.startReplaceableGroup(733328855);
                                                            ComposerKt.sourceInformation(composer5, "C(Box)P(2,1,3)70@3267L67,71@3339L130:Box.kt#2w3rfo");
                                                            MeasurePolicy rememberBoxMeasurePolicy = BoxKt.rememberBoxMeasurePolicy(Alignment.INSTANCE.getTopStart(), false, composer5, 0);
                                                            composer5.startReplaceableGroup(-1323940314);
                                                            ComposerKt.sourceInformation(composer5, "C(Layout)P(!1,2)74@2915L7,75@2970L7,76@3029L7,77@3041L460:Layout.kt#80mrfh");
                                                            ProvidableCompositionLocal<Density> localDensity32 = CompositionLocalsKt.getLocalDensity();
                                                            ComposerKt.sourceInformationMarkerStart(composer5, 2023513938, "C:CompositionLocal.kt#9igjgp");
                                                            Object consume32 = composer5.consume(localDensity32);
                                                            ComposerKt.sourceInformationMarkerEnd(composer5);
                                                            Density density = (Density) consume32;
                                                            ProvidableCompositionLocal<LayoutDirection> localLayoutDirection = CompositionLocalsKt.getLocalLayoutDirection();
                                                            ComposerKt.sourceInformationMarkerStart(composer5, 2023513938, "C:CompositionLocal.kt#9igjgp");
                                                            Object consume4 = composer5.consume(localLayoutDirection);
                                                            ComposerKt.sourceInformationMarkerEnd(composer5);
                                                            LayoutDirection layoutDirection = (LayoutDirection) consume4;
                                                            ProvidableCompositionLocal<ViewConfiguration> localViewConfiguration = CompositionLocalsKt.getLocalViewConfiguration();
                                                            ComposerKt.sourceInformationMarkerStart(composer5, 2023513938, "C:CompositionLocal.kt#9igjgp");
                                                            Object consume5 = composer5.consume(localViewConfiguration);
                                                            ComposerKt.sourceInformationMarkerEnd(composer5);
                                                            ViewConfiguration viewConfiguration = (ViewConfiguration) consume5;
                                                            Function0<ComposeUiNode> constructor = ComposeUiNode.INSTANCE.getConstructor();
                                                            Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> materializerOf = LayoutKt.materializerOf(m424paddingqDBjuR0$default);
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
                                                            Updater.m1290setimpl(m1283constructorimpl, rememberBoxMeasurePolicy, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
                                                            Updater.m1290setimpl(m1283constructorimpl, density, ComposeUiNode.INSTANCE.getSetDensity());
                                                            Updater.m1290setimpl(m1283constructorimpl, layoutDirection, ComposeUiNode.INSTANCE.getSetLayoutDirection());
                                                            Updater.m1290setimpl(m1283constructorimpl, viewConfiguration, ComposeUiNode.INSTANCE.getSetViewConfiguration());
                                                            composer5.enableReusing();
                                                            materializerOf.invoke(SkippableUpdater.m1273boximpl(SkippableUpdater.m1274constructorimpl(composer5)), composer5, 0);
                                                            composer5.startReplaceableGroup(2058660585);
                                                            composer5.startReplaceableGroup(-2137368960);
                                                            ComposerKt.sourceInformation(composer5, "C72@3384L9:Box.kt#2w3rfo");
                                                            BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
                                                            composer5.startReplaceableGroup(-1889954677);
                                                            ComposerKt.sourceInformation(composer5, "C352@15582L19,353@15622L420:BackdropScaffold.kt#jmzs0o");
                                                            function24.invoke(composer5, Integer.valueOf((i41 >> 6) & 14));
                                                            BackdropScaffoldKt.m894Scrim3JVO9M(j32, new Function0<Unit>() { // from class: androidx.compose.material.BackdropScaffoldKt$BackdropScaffold$1$1$2$1$1
                                                                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                                                {
                                                                    super(0);
                                                                }

                                                                @Override // kotlin.jvm.functions.Function0
                                                                public /* bridge */ /* synthetic */ Unit invoke() {
                                                                    invoke2();
                                                                    return Unit.INSTANCE;
                                                                }

                                                                /* renamed from: invoke, reason: avoid collision after fix types in other method */
                                                                public final void invoke2() {
                                                                    if (z21 && backdropScaffoldState11.getConfirmStateChange$material_release().invoke(BackdropValue.Concealed).booleanValue()) {
                                                                        BuildersKt__Builders_commonKt.launch$default(coroutineScope4, null, null, new AnonymousClass1(backdropScaffoldState11, null), 3, null);
                                                                    }
                                                                }

                                                                /* compiled from: BackdropScaffold.kt */
                                                                @Metadata(k = 3, mv = {1, 6, 0}, xi = 48)
                                                                @DebugMetadata(c = "androidx.compose.material.BackdropScaffoldKt$BackdropScaffold$1$1$2$1$1$1", f = "BackdropScaffold.kt", i = {}, l = {358}, m = "invokeSuspend", n = {}, s = {})
                                                                /* renamed from: androidx.compose.material.BackdropScaffoldKt$BackdropScaffold$1$1$2$1$1$1, reason: invalid class name */
                                                                static final class AnonymousClass1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
                                                                    final /* synthetic */ BackdropScaffoldState $scaffoldState;
                                                                    int label;

                                                                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                                                    AnonymousClass1(BackdropScaffoldState backdropScaffoldState, Continuation<? super AnonymousClass1> continuation) {
                                                                        super(2, continuation);
                                                                        this.$scaffoldState = backdropScaffoldState;
                                                                    }

                                                                    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                                                                    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                                                                        return new AnonymousClass1(this.$scaffoldState, continuation);
                                                                    }

                                                                    @Override // kotlin.jvm.functions.Function2
                                                                    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
                                                                        return ((AnonymousClass1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
                                                                    }

                                                                    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                                                                    public final Object invokeSuspend(Object obj) {
                                                                        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                                                                        int i = this.label;
                                                                        if (i == 0) {
                                                                            ResultKt.throwOnFailure(obj);
                                                                            this.label = 1;
                                                                            if (this.$scaffoldState.conceal(this) == coroutine_suspended) {
                                                                                return coroutine_suspended;
                                                                            }
                                                                        } else {
                                                                            if (i != 1) {
                                                                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                                                                            }
                                                                            ResultKt.throwOnFailure(obj);
                                                                        }
                                                                        return Unit.INSTANCE;
                                                                    }
                                                                }
                                                            }, backdropScaffoldState11.getTargetValue() == BackdropValue.Revealed, composer5, (i42 >> 18) & 14);
                                                            composer5.endReplaceableGroup();
                                                            composer5.endReplaceableGroup();
                                                            composer5.endReplaceableGroup();
                                                            composer5.endNode();
                                                            composer5.endReplaceableGroup();
                                                            composer5.endReplaceableGroup();
                                                            return;
                                                        }
                                                        composer5.skipToGroupEnd();
                                                    }
                                                });
                                                int i40 = i35;
                                                SurfaceKt.m1172SurfaceFjzlyU(then, shape9, j29, j30, null, f22, composableLambda22, composer4, ((i40 >> 3) & 112) | 1572864 | ((i40 >> 6) & 896) | ((i40 >> 6) & 7168) | ((i40 << 6) & 458752), 16);
                                                Modifier.Companion companion4 = Modifier.INSTANCE;
                                                if (backdropScaffoldState7.isRevealed() && f21 == m3795getMaxHeightimpl - f14) {
                                                    m3840constructorimpl = f17;
                                                } else {
                                                    m3840constructorimpl = Dp.m3840constructorimpl(0);
                                                }
                                                Modifier m424paddingqDBjuR0$default = PaddingKt.m424paddingqDBjuR0$default(companion4, 0.0f, 0.0f, 0.0f, m3840constructorimpl, 7, null);
                                                Alignment bottomCenter = Alignment.INSTANCE.getBottomCenter();
                                                Function3<SnackbarHostState, Composer, Integer, Unit> function37 = function36;
                                                BackdropScaffoldState backdropScaffoldState11 = backdropScaffoldState7;
                                                int i41 = i35;
                                                composer4.startReplaceableGroup(733328855);
                                                ComposerKt.sourceInformation(composer4, "C(Box)P(2,1,3)70@3267L67,71@3339L130:Box.kt#2w3rfo");
                                                MeasurePolicy rememberBoxMeasurePolicy = BoxKt.rememberBoxMeasurePolicy(bottomCenter, false, composer4, 6);
                                                composer4.startReplaceableGroup(-1323940314);
                                                ComposerKt.sourceInformation(composer4, "C(Layout)P(!1,2)74@2915L7,75@2970L7,76@3029L7,77@3041L460:Layout.kt#80mrfh");
                                                ProvidableCompositionLocal<Density> localDensity32 = CompositionLocalsKt.getLocalDensity();
                                                ComposerKt.sourceInformationMarkerStart(composer4, 2023513938, "C:CompositionLocal.kt#9igjgp");
                                                Object consume32 = composer4.consume(localDensity32);
                                                ComposerKt.sourceInformationMarkerEnd(composer4);
                                                Density density = (Density) consume32;
                                                ProvidableCompositionLocal<LayoutDirection> localLayoutDirection = CompositionLocalsKt.getLocalLayoutDirection();
                                                ComposerKt.sourceInformationMarkerStart(composer4, 2023513938, "C:CompositionLocal.kt#9igjgp");
                                                Object consume4 = composer4.consume(localLayoutDirection);
                                                ComposerKt.sourceInformationMarkerEnd(composer4);
                                                LayoutDirection layoutDirection = (LayoutDirection) consume4;
                                                ProvidableCompositionLocal<ViewConfiguration> localViewConfiguration = CompositionLocalsKt.getLocalViewConfiguration();
                                                ComposerKt.sourceInformationMarkerStart(composer4, 2023513938, "C:CompositionLocal.kt#9igjgp");
                                                Object consume5 = composer4.consume(localViewConfiguration);
                                                ComposerKt.sourceInformationMarkerEnd(composer4);
                                                ViewConfiguration viewConfiguration = (ViewConfiguration) consume5;
                                                Function0<ComposeUiNode> constructor = ComposeUiNode.INSTANCE.getConstructor();
                                                Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> materializerOf = LayoutKt.materializerOf(m424paddingqDBjuR0$default);
                                                if (!(composer4.getApplier() instanceof Applier)) {
                                                    ComposablesKt.invalidApplier();
                                                }
                                                composer4.startReusableNode();
                                                if (composer4.getInserting()) {
                                                    composer4.createNode(constructor);
                                                } else {
                                                    composer4.useNode();
                                                }
                                                composer4.disableReusing();
                                                Composer m1283constructorimpl = Updater.m1283constructorimpl(composer4);
                                                Updater.m1290setimpl(m1283constructorimpl, rememberBoxMeasurePolicy, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
                                                Updater.m1290setimpl(m1283constructorimpl, density, ComposeUiNode.INSTANCE.getSetDensity());
                                                Updater.m1290setimpl(m1283constructorimpl, layoutDirection, ComposeUiNode.INSTANCE.getSetLayoutDirection());
                                                Updater.m1290setimpl(m1283constructorimpl, viewConfiguration, ComposeUiNode.INSTANCE.getSetViewConfiguration());
                                                composer4.enableReusing();
                                                materializerOf.invoke(SkippableUpdater.m1273boximpl(SkippableUpdater.m1274constructorimpl(composer4)), composer4, 0);
                                                composer4.startReplaceableGroup(2058660585);
                                                composer4.startReplaceableGroup(-2137368960);
                                                ComposerKt.sourceInformation(composer4, "C72@3384L9:Box.kt#2w3rfo");
                                                BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
                                                composer4.startReplaceableGroup(1815906203);
                                                ComposerKt.sourceInformation(composer4, "C375@16478L45:BackdropScaffold.kt#jmzs0o");
                                                function37.invoke(backdropScaffoldState11.getSnackbarHostState(), composer4, Integer.valueOf((i41 >> 18) & 112));
                                                composer4.endReplaceableGroup();
                                                composer4.endReplaceableGroup();
                                                composer4.endReplaceableGroup();
                                                composer4.endNode();
                                                composer4.endReplaceableGroup();
                                                composer4.endReplaceableGroup();
                                                return;
                                            }
                                            composer4.skipToGroupEnd();
                                        }
                                    }), composer3, 3120);
                                    return;
                                }
                                composer3.skipToGroupEnd();
                            }
                        }), composer2, (i322 & 7168) | (i322 & 896) | 1572864, 51);
                        modifier2 = modifier4;
                        backdropScaffoldState2 = backdropScaffoldState62;
                        z9 = z6;
                        z10 = z7;
                        z11 = z8;
                        shape5 = shape4;
                        j17 = j13;
                        j18 = j15;
                        f8 = f5;
                        j19 = j16;
                        j20 = j14;
                        j21 = j12;
                        function34 = function33;
                        f9 = f112;
                        f10 = f122;
                        endRestartGroup = composer2.endRestartGroup();
                        if (endRestartGroup != null) {
                        }
                    }
                    i12 = i11;
                    if ((i2 & 14) == 0) {
                    }
                    if ((i2 & 112) == 0) {
                    }
                    if ((i2 & 896) == 0) {
                    }
                    i14 = i3 & 8192;
                    if (i14 != 0) {
                    }
                    if ((i2 & 57344) == 0) {
                    }
                    if ((458752 & i2) == 0) {
                    }
                    if ((3670016 & i2) == 0) {
                    }
                    i15 = i3 & 131072;
                    if (i15 == 0) {
                    }
                    int i2722 = i13;
                    if ((1533916891 & i4) == 306783378) {
                    }
                    startRestartGroup.startDefaults();
                    if ((i & 1) != 0) {
                    }
                    if (i25 == 0) {
                    }
                    if ((i3 & 16) == 0) {
                    }
                    if (i5 == 0) {
                    }
                    if (i6 == 0) {
                    }
                    if (i17 == 0) {
                    }
                    if (i18 == 0) {
                    }
                    if (i19 == 0) {
                    }
                    if ((i3 & 1024) == 0) {
                    }
                    if ((i3 & 2048) == 0) {
                    }
                    int i2822 = i20;
                    if ((i3 & 4096) == 0) {
                    }
                    if (i16 == 0) {
                    }
                    Shape shape622 = shape3;
                    if ((i3 & 16384) == 0) {
                    }
                    if ((i3 & 32768) == 0) {
                    }
                    if ((i3 & 65536) == 0) {
                    }
                    if (i15 == 0) {
                    }
                    i23 = i21;
                    f6 = m891getPeekHeightD9Ej5fM;
                    f7 = m890getHeaderHeightD9Ej5fM;
                    startRestartGroup.endDefaults();
                    ProvidableCompositionLocal<Density> localDensity32 = CompositionLocalsKt.getLocalDensity();
                    ComposerKt.sourceInformationMarkerStart(startRestartGroup, 2023513938, "C:CompositionLocal.kt#9igjgp");
                    Object consume32 = startRestartGroup.consume(localDensity32);
                    ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                    final float mo315toPx0680j_432 = ((Density) consume32).mo315toPx0680j_4(f6);
                    ProvidableCompositionLocal<Density> localDensity222 = CompositionLocalsKt.getLocalDensity();
                    ComposerKt.sourceInformationMarkerStart(startRestartGroup, 2023513938, "C:CompositionLocal.kt#9igjgp");
                    Object consume222 = startRestartGroup.consume(localDensity222);
                    ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                    final float mo315toPx0680j_4222 = ((Density) consume222).mo315toPx0680j_4(f7);
                    final boolean z1522 = z7;
                    final BackdropScaffoldState backdropScaffoldState422 = backdropScaffoldState3;
                    final int i2922 = i23;
                    final Function2<? super Composer, ? super Integer, Unit> composableLambda22 = ComposableLambdaKt.composableLambda(startRestartGroup, 1744778315, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material.BackdropScaffoldKt$BackdropScaffold$backLayer$1
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

                        public final void invoke(Composer composer3, int i3022) {
                            ComposerKt.sourceInformation(composer3, "C:BackdropScaffold.kt#jmzs0o");
                            if ((i3022 & 11) != 2 || !composer3.getSkipping()) {
                                if (z1522) {
                                    composer3.startReplaceableGroup(-1017265331);
                                    ComposerKt.sourceInformation(composer3, "280@12876L82");
                                    Function2<Composer, Integer, Unit> function2 = appBar;
                                    int i3122 = i2922;
                                    Function2<Composer, Integer, Unit> function22 = backLayerContent;
                                    composer3.startReplaceableGroup(-483455358);
                                    ComposerKt.sourceInformation(composer3, "C(Column)P(2,3,1)77@3880L61,78@3946L133:Column.kt#2w3rfo");
                                    Modifier.Companion companion2 = Modifier.INSTANCE;
                                    MeasurePolicy columnMeasurePolicy = ColumnKt.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), Alignment.INSTANCE.getStart(), composer3, 0);
                                    composer3.startReplaceableGroup(-1323940314);
                                    ComposerKt.sourceInformation(composer3, "C(Layout)P(!1,2)74@2915L7,75@2970L7,76@3029L7,77@3041L460:Layout.kt#80mrfh");
                                    ProvidableCompositionLocal<Density> localDensity322 = CompositionLocalsKt.getLocalDensity();
                                    ComposerKt.sourceInformationMarkerStart(composer3, 2023513938, "C:CompositionLocal.kt#9igjgp");
                                    Object consume322 = composer3.consume(localDensity322);
                                    ComposerKt.sourceInformationMarkerEnd(composer3);
                                    Density density = (Density) consume322;
                                    ProvidableCompositionLocal<LayoutDirection> localLayoutDirection = CompositionLocalsKt.getLocalLayoutDirection();
                                    ComposerKt.sourceInformationMarkerStart(composer3, 2023513938, "C:CompositionLocal.kt#9igjgp");
                                    Object consume4 = composer3.consume(localLayoutDirection);
                                    ComposerKt.sourceInformationMarkerEnd(composer3);
                                    LayoutDirection layoutDirection = (LayoutDirection) consume4;
                                    ProvidableCompositionLocal<ViewConfiguration> localViewConfiguration = CompositionLocalsKt.getLocalViewConfiguration();
                                    ComposerKt.sourceInformationMarkerStart(composer3, 2023513938, "C:CompositionLocal.kt#9igjgp");
                                    Object consume5 = composer3.consume(localViewConfiguration);
                                    ComposerKt.sourceInformationMarkerEnd(composer3);
                                    ViewConfiguration viewConfiguration = (ViewConfiguration) consume5;
                                    Function0<ComposeUiNode> constructor = ComposeUiNode.INSTANCE.getConstructor();
                                    Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> materializerOf = LayoutKt.materializerOf(companion2);
                                    if (!(composer3.getApplier() instanceof Applier)) {
                                        ComposablesKt.invalidApplier();
                                    }
                                    composer3.startReusableNode();
                                    if (composer3.getInserting()) {
                                        composer3.createNode(constructor);
                                    } else {
                                        composer3.useNode();
                                    }
                                    composer3.disableReusing();
                                    Composer m1283constructorimpl = Updater.m1283constructorimpl(composer3);
                                    Updater.m1290setimpl(m1283constructorimpl, columnMeasurePolicy, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
                                    Updater.m1290setimpl(m1283constructorimpl, density, ComposeUiNode.INSTANCE.getSetDensity());
                                    Updater.m1290setimpl(m1283constructorimpl, layoutDirection, ComposeUiNode.INSTANCE.getSetLayoutDirection());
                                    Updater.m1290setimpl(m1283constructorimpl, viewConfiguration, ComposeUiNode.INSTANCE.getSetViewConfiguration());
                                    composer3.enableReusing();
                                    materializerOf.invoke(SkippableUpdater.m1273boximpl(SkippableUpdater.m1274constructorimpl(composer3)), composer3, 0);
                                    composer3.startReplaceableGroup(2058660585);
                                    composer3.startReplaceableGroup(-1163856341);
                                    ComposerKt.sourceInformation(composer3, "C79@3994L9:Column.kt#2w3rfo");
                                    ColumnScopeInstance columnScopeInstance = ColumnScopeInstance.INSTANCE;
                                    composer3.startReplaceableGroup(-18835878);
                                    ComposerKt.sourceInformation(composer3, "C281@12901L8,282@12926L18:BackdropScaffold.kt#jmzs0o");
                                    function2.invoke(composer3, Integer.valueOf(i3122 & 14));
                                    function22.invoke(composer3, Integer.valueOf((i3122 >> 3) & 14));
                                    composer3.endReplaceableGroup();
                                    composer3.endReplaceableGroup();
                                    composer3.endReplaceableGroup();
                                    composer3.endNode();
                                    composer3.endReplaceableGroup();
                                    composer3.endReplaceableGroup();
                                    composer3.endReplaceableGroup();
                                    return;
                                }
                                composer3.startReplaceableGroup(-1017265219);
                                ComposerKt.sourceInformation(composer3, "285@12988L72");
                                BackdropValue targetValue = backdropScaffoldState422.getTargetValue();
                                Function2<Composer, Integer, Unit> function23 = appBar;
                                Function2<Composer, Integer, Unit> function24 = backLayerContent;
                                int i3222 = i2922;
                                BackdropScaffoldKt.BackLayerTransition(targetValue, function23, function24, composer3, ((i3222 << 3) & 896) | ((i3222 << 3) & 112));
                                composer3.endReplaceableGroup();
                                return;
                            }
                            composer3.skipToGroupEnd();
                        }
                    });
                    Float valueOf22 = Float.valueOf(mo315toPx0680j_4222);
                    startRestartGroup.startReplaceableGroup(1157296644);
                    ComposerKt.sourceInformation(startRestartGroup, "C(remember)P(1):Composables.kt#9igjgp");
                    changed = startRestartGroup.changed(valueOf22);
                    rememberedValue = startRestartGroup.rememberedValue();
                    if (!changed) {
                    }
                    rememberedValue = (Function1) new Function1<Constraints, Constraints>() { // from class: androidx.compose.material.BackdropScaffoldKt$BackdropScaffold$calculateBackLayerConstraints$1$1
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        {
                            super(1);
                        }

                        @Override // kotlin.jvm.functions.Function1
                        public /* bridge */ /* synthetic */ Constraints invoke(Constraints constraints) {
                            return Constraints.m3784boximpl(m900invokeZezNO4M(constraints.getValue()));
                        }

                        /* renamed from: invoke-ZezNO4M, reason: not valid java name */
                        public final long m900invokeZezNO4M(long j2222) {
                            return ConstraintsKt.m3813offsetNN6EwU$default(Constraints.m3787copyZbe2FdA$default(j2222, 0, 0, 0, 0, 10, null), 0, -MathKt.roundToInt(mo315toPx0680j_4222), 1, null);
                        }
                    };
                    startRestartGroup.updateRememberedValue(rememberedValue);
                    startRestartGroup.endReplaceableGroup();
                    final Function1<? super Constraints, Constraints> function122 = (Function1) rememberedValue;
                    final Modifier modifier522 = modifier4;
                    final boolean z1622 = z8;
                    final boolean z1722 = z6;
                    final float f1122 = f7;
                    final BackdropScaffoldState backdropScaffoldState522 = backdropScaffoldState3;
                    final float f1222 = f6;
                    BackdropScaffoldState backdropScaffoldState622 = backdropScaffoldState3;
                    composer2 = startRestartGroup;
                    final int i3022 = i23;
                    final Shape shape722 = shape4;
                    final long j2222 = j16;
                    final long j2322 = j14;
                    final float f1322 = f5;
                    final int i3122 = i22;
                    final long j2422 = j12;
                    final Function3<? super SnackbarHostState, ? super Composer, ? super Integer, Unit> function3522 = function33;
                    int i3222 = i22 << 6;
                    SurfaceKt.m1172SurfaceFjzlyU(null, null, j13, j15, null, 0.0f, ComposableLambdaKt.composableLambda(composer2, -1049909631, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material.BackdropScaffoldKt$BackdropScaffold$1
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

                        public final void invoke(Composer composer3, int i33) {
                            ComposerKt.sourceInformation(composer3, "C297@13395L24,298@13428L3119:BackdropScaffold.kt#jmzs0o");
                            if ((i33 & 11) != 2 || !composer3.getSkipping()) {
                                composer3.startReplaceableGroup(773894976);
                                ComposerKt.sourceInformation(composer3, "C(rememberCoroutineScope)475@19849L144:Effects.kt#9igjgp");
                                composer3.startReplaceableGroup(-492369756);
                                ComposerKt.sourceInformation(composer3, "C(remember):Composables.kt#9igjgp");
                                Object rememberedValue2 = composer3.rememberedValue();
                                if (rememberedValue2 == Composer.INSTANCE.getEmpty()) {
                                    CompositionScopedCoroutineScopeCanceller compositionScopedCoroutineScopeCanceller = new CompositionScopedCoroutineScopeCanceller(EffectsKt.createCompositionCoroutineScope(EmptyCoroutineContext.INSTANCE, composer3));
                                    composer3.updateRememberedValue(compositionScopedCoroutineScopeCanceller);
                                    rememberedValue2 = compositionScopedCoroutineScopeCanceller;
                                }
                                composer3.endReplaceableGroup();
                                final CoroutineScope coroutineScope = ((CompositionScopedCoroutineScopeCanceller) rememberedValue2).getCoroutineScope();
                                composer3.endReplaceableGroup();
                                Modifier fillMaxSize$default = SizeKt.fillMaxSize$default(Modifier.this, 0.0f, 1, null);
                                Function2<Composer, Integer, Unit> function2 = composableLambda22;
                                Function1<Constraints, Constraints> function1222 = function122;
                                final float f14 = mo315toPx0680j_4222;
                                final boolean z18 = z1622;
                                final boolean z19 = z1722;
                                final BackdropScaffoldState backdropScaffoldState7 = backdropScaffoldState522;
                                final float f15 = mo315toPx0680j_432;
                                final int i34 = i3022;
                                final Shape shape8 = shape722;
                                final long j25 = j2222;
                                final long j26 = j2322;
                                final float f16 = f1322;
                                final int i35 = i3122;
                                final float f17 = f1122;
                                final float f18 = f1222;
                                final Function2<? super Composer, ? super Integer, Unit> function22 = frontLayerContent;
                                final long j27 = j2422;
                                final Function3<? super SnackbarHostState, ? super Composer, ? super Integer, Unit> function36 = function3522;
                                BackdropScaffoldKt.BackdropStack(fillMaxSize$default, function2, function1222, ComposableLambdaKt.composableLambda(composer3, 1800047509, true, new Function4<Constraints, Float, Composer, Integer, Unit>() { // from class: androidx.compose.material.BackdropScaffoldKt$BackdropScaffold$1.1
                                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                    /* JADX WARN: Multi-variable type inference failed */
                                    {
                                        super(4);
                                    }

                                    @Override // kotlin.jvm.functions.Function4
                                    public /* bridge */ /* synthetic */ Unit invoke(Constraints constraints, Float f19, Composer composer4, Integer num) {
                                        m898invokejYbf7pk(constraints.getValue(), f19.floatValue(), composer4, num.intValue());
                                        return Unit.INSTANCE;
                                    }

                                    /* renamed from: invoke-jYbf7pk, reason: not valid java name */
                                    public final void m898invokejYbf7pk(long j28, float f19, Composer composer4, int i36) {
                                        int i37;
                                        Modifier.Companion companion2;
                                        Modifier m1182swipeablepPrIpRY;
                                        float m3840constructorimpl;
                                        ComposerKt.sourceInformation(composer4, "CP(1:c#ui.unit.Constraints)344@15194L57,342@15132L942,366@16117L420:BackdropScaffold.kt#jmzs0o");
                                        if ((i36 & 14) == 0) {
                                            i37 = i36 | (composer4.changed(j28) ? 4 : 2);
                                        } else {
                                            i37 = i36;
                                        }
                                        if ((i36 & 112) == 0) {
                                            i37 |= composer4.changed(f19) ? 32 : 16;
                                        }
                                        if ((i37 & 731) != 146 || !composer4.getSkipping()) {
                                            float m3795getMaxHeightimpl = Constraints.m3795getMaxHeightimpl(j28);
                                            float f20 = m3795getMaxHeightimpl - f14;
                                            if (z18) {
                                                f20 = Math.min(f20, f19);
                                            }
                                            float f21 = f20;
                                            if (z19) {
                                                companion2 = NestedScrollModifierKt.nestedScroll$default(Modifier.INSTANCE, backdropScaffoldState7.getNestedScrollConnection(), null, 2, null);
                                            } else {
                                                companion2 = Modifier.INSTANCE;
                                            }
                                            m1182swipeablepPrIpRY = SwipeableKt.m1182swipeablepPrIpRY(Modifier.INSTANCE.then(companion2), backdropScaffoldState7, r18, Orientation.Vertical, (r26 & 8) != 0 ? true : z19, (r26 & 16) != 0 ? false : false, (r26 & 32) != 0 ? null : null, (r26 & 64) != 0 ? new Function2<T, T, FixedThreshold>() { // from class: androidx.compose.material.SwipeableKt$swipeable$1
                                                /* JADX WARN: Can't rename method to resolve collision */
                                                @Override // kotlin.jvm.functions.Function2
                                                public final FixedThreshold invoke(T t, T t2) {
                                                    return new FixedThreshold(Dp.m3840constructorimpl(56), null);
                                                }
                                            } : null, (r26 & 128) != 0 ? SwipeableDefaults.resistanceConfig$default(SwipeableDefaults.INSTANCE, MapsKt.mapOf(TuplesKt.to(Float.valueOf(f15), BackdropValue.Concealed), TuplesKt.to(Float.valueOf(f21), BackdropValue.Revealed)).keySet(), 0.0f, 0.0f, 6, null) : null, (r26 & 256) != 0 ? SwipeableDefaults.INSTANCE.m1181getVelocityThresholdD9Ej5fM() : 0.0f);
                                            final BackdropScaffoldState backdropScaffoldState8 = backdropScaffoldState7;
                                            final CoroutineScope coroutineScope2 = coroutineScope;
                                            Modifier semantics$default = SemanticsModifierKt.semantics$default(m1182swipeablepPrIpRY, false, new Function1<SemanticsPropertyReceiver, Unit>() { // from class: androidx.compose.material.BackdropScaffoldKt$BackdropScaffold$1$1$swipeable$1
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
                                                    if (BackdropScaffoldState.this.isConcealed()) {
                                                        final BackdropScaffoldState backdropScaffoldState9 = BackdropScaffoldState.this;
                                                        final CoroutineScope coroutineScope3 = coroutineScope2;
                                                        SemanticsPropertiesKt.collapse$default(semantics, null, new Function0<Boolean>() { // from class: androidx.compose.material.BackdropScaffoldKt$BackdropScaffold$1$1$swipeable$1.1
                                                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                                            {
                                                                super(0);
                                                            }

                                                            /* JADX WARN: Can't rename method to resolve collision */
                                                            @Override // kotlin.jvm.functions.Function0
                                                            public final Boolean invoke() {
                                                                if (BackdropScaffoldState.this.getConfirmStateChange$material_release().invoke(BackdropValue.Revealed).booleanValue()) {
                                                                    BuildersKt__Builders_commonKt.launch$default(coroutineScope3, null, null, new C00301(BackdropScaffoldState.this, null), 3, null);
                                                                }
                                                                return true;
                                                            }

                                                            /* compiled from: BackdropScaffold.kt */
                                                            @Metadata(k = 3, mv = {1, 6, 0}, xi = 48)
                                                            @DebugMetadata(c = "androidx.compose.material.BackdropScaffoldKt$BackdropScaffold$1$1$swipeable$1$1$1", f = "BackdropScaffold.kt", i = {}, l = {330}, m = "invokeSuspend", n = {}, s = {})
                                                            /* renamed from: androidx.compose.material.BackdropScaffoldKt$BackdropScaffold$1$1$swipeable$1$1$1, reason: invalid class name and collision with other inner class name */
                                                            static final class C00301 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
                                                                final /* synthetic */ BackdropScaffoldState $scaffoldState;
                                                                int label;

                                                                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                                                C00301(BackdropScaffoldState backdropScaffoldState, Continuation<? super C00301> continuation) {
                                                                    super(2, continuation);
                                                                    this.$scaffoldState = backdropScaffoldState;
                                                                }

                                                                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                                                                public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                                                                    return new C00301(this.$scaffoldState, continuation);
                                                                }

                                                                @Override // kotlin.jvm.functions.Function2
                                                                public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
                                                                    return ((C00301) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
                                                                }

                                                                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                                                                public final Object invokeSuspend(Object obj) {
                                                                    Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                                                                    int i = this.label;
                                                                    if (i == 0) {
                                                                        ResultKt.throwOnFailure(obj);
                                                                        this.label = 1;
                                                                        if (this.$scaffoldState.reveal(this) == coroutine_suspended) {
                                                                            return coroutine_suspended;
                                                                        }
                                                                    } else {
                                                                        if (i != 1) {
                                                                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                                                                        }
                                                                        ResultKt.throwOnFailure(obj);
                                                                    }
                                                                    return Unit.INSTANCE;
                                                                }
                                                            }
                                                        }, 1, null);
                                                    } else {
                                                        final BackdropScaffoldState backdropScaffoldState10 = BackdropScaffoldState.this;
                                                        final CoroutineScope coroutineScope4 = coroutineScope2;
                                                        SemanticsPropertiesKt.expand$default(semantics, null, new Function0<Boolean>() { // from class: androidx.compose.material.BackdropScaffoldKt$BackdropScaffold$1$1$swipeable$1.2
                                                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                                            {
                                                                super(0);
                                                            }

                                                            /* JADX WARN: Can't rename method to resolve collision */
                                                            @Override // kotlin.jvm.functions.Function0
                                                            public final Boolean invoke() {
                                                                if (BackdropScaffoldState.this.getConfirmStateChange$material_release().invoke(BackdropValue.Concealed).booleanValue()) {
                                                                    BuildersKt__Builders_commonKt.launch$default(coroutineScope4, null, null, new AnonymousClass1(BackdropScaffoldState.this, null), 3, null);
                                                                }
                                                                return true;
                                                            }

                                                            /* compiled from: BackdropScaffold.kt */
                                                            @Metadata(k = 3, mv = {1, 6, 0}, xi = 48)
                                                            @DebugMetadata(c = "androidx.compose.material.BackdropScaffoldKt$BackdropScaffold$1$1$swipeable$1$2$1", f = "BackdropScaffold.kt", i = {}, l = {336}, m = "invokeSuspend", n = {}, s = {})
                                                            /* renamed from: androidx.compose.material.BackdropScaffoldKt$BackdropScaffold$1$1$swipeable$1$2$1, reason: invalid class name */
                                                            static final class AnonymousClass1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
                                                                final /* synthetic */ BackdropScaffoldState $scaffoldState;
                                                                int label;

                                                                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                                                AnonymousClass1(BackdropScaffoldState backdropScaffoldState, Continuation<? super AnonymousClass1> continuation) {
                                                                    super(2, continuation);
                                                                    this.$scaffoldState = backdropScaffoldState;
                                                                }

                                                                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                                                                public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                                                                    return new AnonymousClass1(this.$scaffoldState, continuation);
                                                                }

                                                                @Override // kotlin.jvm.functions.Function2
                                                                public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
                                                                    return ((AnonymousClass1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
                                                                }

                                                                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                                                                public final Object invokeSuspend(Object obj) {
                                                                    Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                                                                    int i = this.label;
                                                                    if (i == 0) {
                                                                        ResultKt.throwOnFailure(obj);
                                                                        this.label = 1;
                                                                        if (this.$scaffoldState.conceal(this) == coroutine_suspended) {
                                                                            return coroutine_suspended;
                                                                        }
                                                                    } else {
                                                                        if (i != 1) {
                                                                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                                                                        }
                                                                        ResultKt.throwOnFailure(obj);
                                                                    }
                                                                    return Unit.INSTANCE;
                                                                }
                                                            }
                                                        }, 1, null);
                                                    }
                                                }
                                            }, 1, null);
                                            Modifier.Companion companion3 = Modifier.INSTANCE;
                                            final BackdropScaffoldState backdropScaffoldState9 = backdropScaffoldState7;
                                            composer4.startReplaceableGroup(1157296644);
                                            ComposerKt.sourceInformation(composer4, "C(remember)P(1):Composables.kt#9igjgp");
                                            boolean changed2 = composer4.changed(backdropScaffoldState9);
                                            Object rememberedValue3 = composer4.rememberedValue();
                                            if (changed2 || rememberedValue3 == Composer.INSTANCE.getEmpty()) {
                                                rememberedValue3 = (Function1) new Function1<Density, IntOffset>() { // from class: androidx.compose.material.BackdropScaffoldKt$BackdropScaffold$1$1$1$1
                                                    {
                                                        super(1);
                                                    }

                                                    @Override // kotlin.jvm.functions.Function1
                                                    public /* bridge */ /* synthetic */ IntOffset invoke(Density density) {
                                                        return IntOffset.m3949boximpl(m899invokeBjo55l4(density));
                                                    }

                                                    /* renamed from: invoke-Bjo55l4, reason: not valid java name */
                                                    public final long m899invokeBjo55l4(Density offset) {
                                                        Intrinsics.checkNotNullParameter(offset, "$this$offset");
                                                        return IntOffsetKt.IntOffset(0, MathKt.roundToInt(BackdropScaffoldState.this.getOffset().getValue().floatValue()));
                                                    }
                                                };
                                                composer4.updateRememberedValue(rememberedValue3);
                                            }
                                            composer4.endReplaceableGroup();
                                            Modifier then = OffsetKt.offset(companion3, (Function1) rememberedValue3).then(semantics$default);
                                            Shape shape9 = shape8;
                                            long j29 = j25;
                                            long j30 = j26;
                                            float f22 = f16;
                                            final float f23 = f18;
                                            final Function2<? super Composer, ? super Integer, Unit> function23 = function22;
                                            final int i38 = i34;
                                            final long j31 = j27;
                                            final BackdropScaffoldState backdropScaffoldState10 = backdropScaffoldState7;
                                            final int i39 = i35;
                                            final boolean z20 = z19;
                                            final CoroutineScope coroutineScope3 = coroutineScope;
                                            ComposableLambda composableLambda222 = ComposableLambdaKt.composableLambda(composer4, -1065299503, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material.BackdropScaffoldKt.BackdropScaffold.1.1.2
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

                                                public final void invoke(Composer composer5, int i40) {
                                                    ComposerKt.sourceInformation(composer5, "C351@15517L543:BackdropScaffold.kt#jmzs0o");
                                                    if ((i40 & 11) != 2 || !composer5.getSkipping()) {
                                                        Modifier m424paddingqDBjuR0$default = PaddingKt.m424paddingqDBjuR0$default(Modifier.INSTANCE, 0.0f, 0.0f, 0.0f, f23, 7, null);
                                                        Function2<Composer, Integer, Unit> function24 = function23;
                                                        int i41 = i38;
                                                        long j32 = j31;
                                                        final BackdropScaffoldState backdropScaffoldState11 = backdropScaffoldState10;
                                                        int i42 = i39;
                                                        final boolean z21 = z20;
                                                        final CoroutineScope coroutineScope4 = coroutineScope3;
                                                        composer5.startReplaceableGroup(733328855);
                                                        ComposerKt.sourceInformation(composer5, "C(Box)P(2,1,3)70@3267L67,71@3339L130:Box.kt#2w3rfo");
                                                        MeasurePolicy rememberBoxMeasurePolicy = BoxKt.rememberBoxMeasurePolicy(Alignment.INSTANCE.getTopStart(), false, composer5, 0);
                                                        composer5.startReplaceableGroup(-1323940314);
                                                        ComposerKt.sourceInformation(composer5, "C(Layout)P(!1,2)74@2915L7,75@2970L7,76@3029L7,77@3041L460:Layout.kt#80mrfh");
                                                        ProvidableCompositionLocal<Density> localDensity322 = CompositionLocalsKt.getLocalDensity();
                                                        ComposerKt.sourceInformationMarkerStart(composer5, 2023513938, "C:CompositionLocal.kt#9igjgp");
                                                        Object consume322 = composer5.consume(localDensity322);
                                                        ComposerKt.sourceInformationMarkerEnd(composer5);
                                                        Density density = (Density) consume322;
                                                        ProvidableCompositionLocal<LayoutDirection> localLayoutDirection = CompositionLocalsKt.getLocalLayoutDirection();
                                                        ComposerKt.sourceInformationMarkerStart(composer5, 2023513938, "C:CompositionLocal.kt#9igjgp");
                                                        Object consume4 = composer5.consume(localLayoutDirection);
                                                        ComposerKt.sourceInformationMarkerEnd(composer5);
                                                        LayoutDirection layoutDirection = (LayoutDirection) consume4;
                                                        ProvidableCompositionLocal<ViewConfiguration> localViewConfiguration = CompositionLocalsKt.getLocalViewConfiguration();
                                                        ComposerKt.sourceInformationMarkerStart(composer5, 2023513938, "C:CompositionLocal.kt#9igjgp");
                                                        Object consume5 = composer5.consume(localViewConfiguration);
                                                        ComposerKt.sourceInformationMarkerEnd(composer5);
                                                        ViewConfiguration viewConfiguration = (ViewConfiguration) consume5;
                                                        Function0<ComposeUiNode> constructor = ComposeUiNode.INSTANCE.getConstructor();
                                                        Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> materializerOf = LayoutKt.materializerOf(m424paddingqDBjuR0$default);
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
                                                        Updater.m1290setimpl(m1283constructorimpl, rememberBoxMeasurePolicy, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
                                                        Updater.m1290setimpl(m1283constructorimpl, density, ComposeUiNode.INSTANCE.getSetDensity());
                                                        Updater.m1290setimpl(m1283constructorimpl, layoutDirection, ComposeUiNode.INSTANCE.getSetLayoutDirection());
                                                        Updater.m1290setimpl(m1283constructorimpl, viewConfiguration, ComposeUiNode.INSTANCE.getSetViewConfiguration());
                                                        composer5.enableReusing();
                                                        materializerOf.invoke(SkippableUpdater.m1273boximpl(SkippableUpdater.m1274constructorimpl(composer5)), composer5, 0);
                                                        composer5.startReplaceableGroup(2058660585);
                                                        composer5.startReplaceableGroup(-2137368960);
                                                        ComposerKt.sourceInformation(composer5, "C72@3384L9:Box.kt#2w3rfo");
                                                        BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
                                                        composer5.startReplaceableGroup(-1889954677);
                                                        ComposerKt.sourceInformation(composer5, "C352@15582L19,353@15622L420:BackdropScaffold.kt#jmzs0o");
                                                        function24.invoke(composer5, Integer.valueOf((i41 >> 6) & 14));
                                                        BackdropScaffoldKt.m894Scrim3JVO9M(j32, new Function0<Unit>() { // from class: androidx.compose.material.BackdropScaffoldKt$BackdropScaffold$1$1$2$1$1
                                                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                                            {
                                                                super(0);
                                                            }

                                                            @Override // kotlin.jvm.functions.Function0
                                                            public /* bridge */ /* synthetic */ Unit invoke() {
                                                                invoke2();
                                                                return Unit.INSTANCE;
                                                            }

                                                            /* renamed from: invoke, reason: avoid collision after fix types in other method */
                                                            public final void invoke2() {
                                                                if (z21 && backdropScaffoldState11.getConfirmStateChange$material_release().invoke(BackdropValue.Concealed).booleanValue()) {
                                                                    BuildersKt__Builders_commonKt.launch$default(coroutineScope4, null, null, new AnonymousClass1(backdropScaffoldState11, null), 3, null);
                                                                }
                                                            }

                                                            /* compiled from: BackdropScaffold.kt */
                                                            @Metadata(k = 3, mv = {1, 6, 0}, xi = 48)
                                                            @DebugMetadata(c = "androidx.compose.material.BackdropScaffoldKt$BackdropScaffold$1$1$2$1$1$1", f = "BackdropScaffold.kt", i = {}, l = {358}, m = "invokeSuspend", n = {}, s = {})
                                                            /* renamed from: androidx.compose.material.BackdropScaffoldKt$BackdropScaffold$1$1$2$1$1$1, reason: invalid class name */
                                                            static final class AnonymousClass1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
                                                                final /* synthetic */ BackdropScaffoldState $scaffoldState;
                                                                int label;

                                                                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                                                AnonymousClass1(BackdropScaffoldState backdropScaffoldState, Continuation<? super AnonymousClass1> continuation) {
                                                                    super(2, continuation);
                                                                    this.$scaffoldState = backdropScaffoldState;
                                                                }

                                                                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                                                                public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                                                                    return new AnonymousClass1(this.$scaffoldState, continuation);
                                                                }

                                                                @Override // kotlin.jvm.functions.Function2
                                                                public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
                                                                    return ((AnonymousClass1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
                                                                }

                                                                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                                                                public final Object invokeSuspend(Object obj) {
                                                                    Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                                                                    int i = this.label;
                                                                    if (i == 0) {
                                                                        ResultKt.throwOnFailure(obj);
                                                                        this.label = 1;
                                                                        if (this.$scaffoldState.conceal(this) == coroutine_suspended) {
                                                                            return coroutine_suspended;
                                                                        }
                                                                    } else {
                                                                        if (i != 1) {
                                                                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                                                                        }
                                                                        ResultKt.throwOnFailure(obj);
                                                                    }
                                                                    return Unit.INSTANCE;
                                                                }
                                                            }
                                                        }, backdropScaffoldState11.getTargetValue() == BackdropValue.Revealed, composer5, (i42 >> 18) & 14);
                                                        composer5.endReplaceableGroup();
                                                        composer5.endReplaceableGroup();
                                                        composer5.endReplaceableGroup();
                                                        composer5.endNode();
                                                        composer5.endReplaceableGroup();
                                                        composer5.endReplaceableGroup();
                                                        return;
                                                    }
                                                    composer5.skipToGroupEnd();
                                                }
                                            });
                                            int i40 = i35;
                                            SurfaceKt.m1172SurfaceFjzlyU(then, shape9, j29, j30, null, f22, composableLambda222, composer4, ((i40 >> 3) & 112) | 1572864 | ((i40 >> 6) & 896) | ((i40 >> 6) & 7168) | ((i40 << 6) & 458752), 16);
                                            Modifier.Companion companion4 = Modifier.INSTANCE;
                                            if (backdropScaffoldState7.isRevealed() && f21 == m3795getMaxHeightimpl - f14) {
                                                m3840constructorimpl = f17;
                                            } else {
                                                m3840constructorimpl = Dp.m3840constructorimpl(0);
                                            }
                                            Modifier m424paddingqDBjuR0$default = PaddingKt.m424paddingqDBjuR0$default(companion4, 0.0f, 0.0f, 0.0f, m3840constructorimpl, 7, null);
                                            Alignment bottomCenter = Alignment.INSTANCE.getBottomCenter();
                                            Function3<SnackbarHostState, Composer, Integer, Unit> function37 = function36;
                                            BackdropScaffoldState backdropScaffoldState11 = backdropScaffoldState7;
                                            int i41 = i35;
                                            composer4.startReplaceableGroup(733328855);
                                            ComposerKt.sourceInformation(composer4, "C(Box)P(2,1,3)70@3267L67,71@3339L130:Box.kt#2w3rfo");
                                            MeasurePolicy rememberBoxMeasurePolicy = BoxKt.rememberBoxMeasurePolicy(bottomCenter, false, composer4, 6);
                                            composer4.startReplaceableGroup(-1323940314);
                                            ComposerKt.sourceInformation(composer4, "C(Layout)P(!1,2)74@2915L7,75@2970L7,76@3029L7,77@3041L460:Layout.kt#80mrfh");
                                            ProvidableCompositionLocal<Density> localDensity322 = CompositionLocalsKt.getLocalDensity();
                                            ComposerKt.sourceInformationMarkerStart(composer4, 2023513938, "C:CompositionLocal.kt#9igjgp");
                                            Object consume322 = composer4.consume(localDensity322);
                                            ComposerKt.sourceInformationMarkerEnd(composer4);
                                            Density density = (Density) consume322;
                                            ProvidableCompositionLocal<LayoutDirection> localLayoutDirection = CompositionLocalsKt.getLocalLayoutDirection();
                                            ComposerKt.sourceInformationMarkerStart(composer4, 2023513938, "C:CompositionLocal.kt#9igjgp");
                                            Object consume4 = composer4.consume(localLayoutDirection);
                                            ComposerKt.sourceInformationMarkerEnd(composer4);
                                            LayoutDirection layoutDirection = (LayoutDirection) consume4;
                                            ProvidableCompositionLocal<ViewConfiguration> localViewConfiguration = CompositionLocalsKt.getLocalViewConfiguration();
                                            ComposerKt.sourceInformationMarkerStart(composer4, 2023513938, "C:CompositionLocal.kt#9igjgp");
                                            Object consume5 = composer4.consume(localViewConfiguration);
                                            ComposerKt.sourceInformationMarkerEnd(composer4);
                                            ViewConfiguration viewConfiguration = (ViewConfiguration) consume5;
                                            Function0<ComposeUiNode> constructor = ComposeUiNode.INSTANCE.getConstructor();
                                            Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> materializerOf = LayoutKt.materializerOf(m424paddingqDBjuR0$default);
                                            if (!(composer4.getApplier() instanceof Applier)) {
                                                ComposablesKt.invalidApplier();
                                            }
                                            composer4.startReusableNode();
                                            if (composer4.getInserting()) {
                                                composer4.createNode(constructor);
                                            } else {
                                                composer4.useNode();
                                            }
                                            composer4.disableReusing();
                                            Composer m1283constructorimpl = Updater.m1283constructorimpl(composer4);
                                            Updater.m1290setimpl(m1283constructorimpl, rememberBoxMeasurePolicy, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
                                            Updater.m1290setimpl(m1283constructorimpl, density, ComposeUiNode.INSTANCE.getSetDensity());
                                            Updater.m1290setimpl(m1283constructorimpl, layoutDirection, ComposeUiNode.INSTANCE.getSetLayoutDirection());
                                            Updater.m1290setimpl(m1283constructorimpl, viewConfiguration, ComposeUiNode.INSTANCE.getSetViewConfiguration());
                                            composer4.enableReusing();
                                            materializerOf.invoke(SkippableUpdater.m1273boximpl(SkippableUpdater.m1274constructorimpl(composer4)), composer4, 0);
                                            composer4.startReplaceableGroup(2058660585);
                                            composer4.startReplaceableGroup(-2137368960);
                                            ComposerKt.sourceInformation(composer4, "C72@3384L9:Box.kt#2w3rfo");
                                            BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
                                            composer4.startReplaceableGroup(1815906203);
                                            ComposerKt.sourceInformation(composer4, "C375@16478L45:BackdropScaffold.kt#jmzs0o");
                                            function37.invoke(backdropScaffoldState11.getSnackbarHostState(), composer4, Integer.valueOf((i41 >> 18) & 112));
                                            composer4.endReplaceableGroup();
                                            composer4.endReplaceableGroup();
                                            composer4.endReplaceableGroup();
                                            composer4.endNode();
                                            composer4.endReplaceableGroup();
                                            composer4.endReplaceableGroup();
                                            return;
                                        }
                                        composer4.skipToGroupEnd();
                                    }
                                }), composer3, 3120);
                                return;
                            }
                            composer3.skipToGroupEnd();
                        }
                    }), composer2, (i3222 & 7168) | (i3222 & 896) | 1572864, 51);
                    modifier2 = modifier4;
                    backdropScaffoldState2 = backdropScaffoldState622;
                    z9 = z6;
                    z10 = z7;
                    z11 = z8;
                    shape5 = shape4;
                    j17 = j13;
                    j18 = j15;
                    f8 = f5;
                    j19 = j16;
                    j20 = j14;
                    j21 = j12;
                    function34 = function33;
                    f9 = f1122;
                    f10 = f1222;
                    endRestartGroup = composer2.endRestartGroup();
                    if (endRestartGroup != null) {
                    }
                }
                i10 = i9;
                i11 = i3 & 512;
                if (i11 == 0) {
                }
                i12 = i11;
                if ((i2 & 14) == 0) {
                }
                if ((i2 & 112) == 0) {
                }
                if ((i2 & 896) == 0) {
                }
                i14 = i3 & 8192;
                if (i14 != 0) {
                }
                if ((i2 & 57344) == 0) {
                }
                if ((458752 & i2) == 0) {
                }
                if ((3670016 & i2) == 0) {
                }
                i15 = i3 & 131072;
                if (i15 == 0) {
                }
                int i27222 = i13;
                if ((1533916891 & i4) == 306783378) {
                }
                startRestartGroup.startDefaults();
                if ((i & 1) != 0) {
                }
                if (i25 == 0) {
                }
                if ((i3 & 16) == 0) {
                }
                if (i5 == 0) {
                }
                if (i6 == 0) {
                }
                if (i17 == 0) {
                }
                if (i18 == 0) {
                }
                if (i19 == 0) {
                }
                if ((i3 & 1024) == 0) {
                }
                if ((i3 & 2048) == 0) {
                }
                int i28222 = i20;
                if ((i3 & 4096) == 0) {
                }
                if (i16 == 0) {
                }
                Shape shape6222 = shape3;
                if ((i3 & 16384) == 0) {
                }
                if ((i3 & 32768) == 0) {
                }
                if ((i3 & 65536) == 0) {
                }
                if (i15 == 0) {
                }
                i23 = i21;
                f6 = m891getPeekHeightD9Ej5fM;
                f7 = m890getHeaderHeightD9Ej5fM;
                startRestartGroup.endDefaults();
                ProvidableCompositionLocal<Density> localDensity322 = CompositionLocalsKt.getLocalDensity();
                ComposerKt.sourceInformationMarkerStart(startRestartGroup, 2023513938, "C:CompositionLocal.kt#9igjgp");
                Object consume322 = startRestartGroup.consume(localDensity322);
                ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                final float mo315toPx0680j_4322 = ((Density) consume322).mo315toPx0680j_4(f6);
                ProvidableCompositionLocal<Density> localDensity2222 = CompositionLocalsKt.getLocalDensity();
                ComposerKt.sourceInformationMarkerStart(startRestartGroup, 2023513938, "C:CompositionLocal.kt#9igjgp");
                Object consume2222 = startRestartGroup.consume(localDensity2222);
                ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                final float mo315toPx0680j_42222 = ((Density) consume2222).mo315toPx0680j_4(f7);
                final boolean z15222 = z7;
                final BackdropScaffoldState backdropScaffoldState4222 = backdropScaffoldState3;
                final int i29222 = i23;
                final Function2<? super Composer, ? super Integer, Unit> composableLambda222 = ComposableLambdaKt.composableLambda(startRestartGroup, 1744778315, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material.BackdropScaffoldKt$BackdropScaffold$backLayer$1
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

                    public final void invoke(Composer composer3, int i30222) {
                        ComposerKt.sourceInformation(composer3, "C:BackdropScaffold.kt#jmzs0o");
                        if ((i30222 & 11) != 2 || !composer3.getSkipping()) {
                            if (z15222) {
                                composer3.startReplaceableGroup(-1017265331);
                                ComposerKt.sourceInformation(composer3, "280@12876L82");
                                Function2<Composer, Integer, Unit> function2 = appBar;
                                int i31222 = i29222;
                                Function2<Composer, Integer, Unit> function22 = backLayerContent;
                                composer3.startReplaceableGroup(-483455358);
                                ComposerKt.sourceInformation(composer3, "C(Column)P(2,3,1)77@3880L61,78@3946L133:Column.kt#2w3rfo");
                                Modifier.Companion companion2 = Modifier.INSTANCE;
                                MeasurePolicy columnMeasurePolicy = ColumnKt.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), Alignment.INSTANCE.getStart(), composer3, 0);
                                composer3.startReplaceableGroup(-1323940314);
                                ComposerKt.sourceInformation(composer3, "C(Layout)P(!1,2)74@2915L7,75@2970L7,76@3029L7,77@3041L460:Layout.kt#80mrfh");
                                ProvidableCompositionLocal<Density> localDensity3222 = CompositionLocalsKt.getLocalDensity();
                                ComposerKt.sourceInformationMarkerStart(composer3, 2023513938, "C:CompositionLocal.kt#9igjgp");
                                Object consume3222 = composer3.consume(localDensity3222);
                                ComposerKt.sourceInformationMarkerEnd(composer3);
                                Density density = (Density) consume3222;
                                ProvidableCompositionLocal<LayoutDirection> localLayoutDirection = CompositionLocalsKt.getLocalLayoutDirection();
                                ComposerKt.sourceInformationMarkerStart(composer3, 2023513938, "C:CompositionLocal.kt#9igjgp");
                                Object consume4 = composer3.consume(localLayoutDirection);
                                ComposerKt.sourceInformationMarkerEnd(composer3);
                                LayoutDirection layoutDirection = (LayoutDirection) consume4;
                                ProvidableCompositionLocal<ViewConfiguration> localViewConfiguration = CompositionLocalsKt.getLocalViewConfiguration();
                                ComposerKt.sourceInformationMarkerStart(composer3, 2023513938, "C:CompositionLocal.kt#9igjgp");
                                Object consume5 = composer3.consume(localViewConfiguration);
                                ComposerKt.sourceInformationMarkerEnd(composer3);
                                ViewConfiguration viewConfiguration = (ViewConfiguration) consume5;
                                Function0<ComposeUiNode> constructor = ComposeUiNode.INSTANCE.getConstructor();
                                Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> materializerOf = LayoutKt.materializerOf(companion2);
                                if (!(composer3.getApplier() instanceof Applier)) {
                                    ComposablesKt.invalidApplier();
                                }
                                composer3.startReusableNode();
                                if (composer3.getInserting()) {
                                    composer3.createNode(constructor);
                                } else {
                                    composer3.useNode();
                                }
                                composer3.disableReusing();
                                Composer m1283constructorimpl = Updater.m1283constructorimpl(composer3);
                                Updater.m1290setimpl(m1283constructorimpl, columnMeasurePolicy, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
                                Updater.m1290setimpl(m1283constructorimpl, density, ComposeUiNode.INSTANCE.getSetDensity());
                                Updater.m1290setimpl(m1283constructorimpl, layoutDirection, ComposeUiNode.INSTANCE.getSetLayoutDirection());
                                Updater.m1290setimpl(m1283constructorimpl, viewConfiguration, ComposeUiNode.INSTANCE.getSetViewConfiguration());
                                composer3.enableReusing();
                                materializerOf.invoke(SkippableUpdater.m1273boximpl(SkippableUpdater.m1274constructorimpl(composer3)), composer3, 0);
                                composer3.startReplaceableGroup(2058660585);
                                composer3.startReplaceableGroup(-1163856341);
                                ComposerKt.sourceInformation(composer3, "C79@3994L9:Column.kt#2w3rfo");
                                ColumnScopeInstance columnScopeInstance = ColumnScopeInstance.INSTANCE;
                                composer3.startReplaceableGroup(-18835878);
                                ComposerKt.sourceInformation(composer3, "C281@12901L8,282@12926L18:BackdropScaffold.kt#jmzs0o");
                                function2.invoke(composer3, Integer.valueOf(i31222 & 14));
                                function22.invoke(composer3, Integer.valueOf((i31222 >> 3) & 14));
                                composer3.endReplaceableGroup();
                                composer3.endReplaceableGroup();
                                composer3.endReplaceableGroup();
                                composer3.endNode();
                                composer3.endReplaceableGroup();
                                composer3.endReplaceableGroup();
                                composer3.endReplaceableGroup();
                                return;
                            }
                            composer3.startReplaceableGroup(-1017265219);
                            ComposerKt.sourceInformation(composer3, "285@12988L72");
                            BackdropValue targetValue = backdropScaffoldState4222.getTargetValue();
                            Function2<Composer, Integer, Unit> function23 = appBar;
                            Function2<Composer, Integer, Unit> function24 = backLayerContent;
                            int i32222 = i29222;
                            BackdropScaffoldKt.BackLayerTransition(targetValue, function23, function24, composer3, ((i32222 << 3) & 896) | ((i32222 << 3) & 112));
                            composer3.endReplaceableGroup();
                            return;
                        }
                        composer3.skipToGroupEnd();
                    }
                });
                Float valueOf222 = Float.valueOf(mo315toPx0680j_42222);
                startRestartGroup.startReplaceableGroup(1157296644);
                ComposerKt.sourceInformation(startRestartGroup, "C(remember)P(1):Composables.kt#9igjgp");
                changed = startRestartGroup.changed(valueOf222);
                rememberedValue = startRestartGroup.rememberedValue();
                if (!changed) {
                }
                rememberedValue = (Function1) new Function1<Constraints, Constraints>() { // from class: androidx.compose.material.BackdropScaffoldKt$BackdropScaffold$calculateBackLayerConstraints$1$1
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(1);
                    }

                    @Override // kotlin.jvm.functions.Function1
                    public /* bridge */ /* synthetic */ Constraints invoke(Constraints constraints) {
                        return Constraints.m3784boximpl(m900invokeZezNO4M(constraints.getValue()));
                    }

                    /* renamed from: invoke-ZezNO4M, reason: not valid java name */
                    public final long m900invokeZezNO4M(long j22222) {
                        return ConstraintsKt.m3813offsetNN6EwU$default(Constraints.m3787copyZbe2FdA$default(j22222, 0, 0, 0, 0, 10, null), 0, -MathKt.roundToInt(mo315toPx0680j_42222), 1, null);
                    }
                };
                startRestartGroup.updateRememberedValue(rememberedValue);
                startRestartGroup.endReplaceableGroup();
                final Function1<? super Constraints, Constraints> function1222 = (Function1) rememberedValue;
                final Modifier modifier5222 = modifier4;
                final boolean z16222 = z8;
                final boolean z17222 = z6;
                final float f11222 = f7;
                final BackdropScaffoldState backdropScaffoldState5222 = backdropScaffoldState3;
                final float f12222 = f6;
                BackdropScaffoldState backdropScaffoldState6222 = backdropScaffoldState3;
                composer2 = startRestartGroup;
                final int i30222 = i23;
                final Shape shape7222 = shape4;
                final long j22222 = j16;
                final long j23222 = j14;
                final float f13222 = f5;
                final int i31222 = i22;
                final long j24222 = j12;
                final Function3<? super SnackbarHostState, ? super Composer, ? super Integer, Unit> function35222 = function33;
                int i32222 = i22 << 6;
                SurfaceKt.m1172SurfaceFjzlyU(null, null, j13, j15, null, 0.0f, ComposableLambdaKt.composableLambda(composer2, -1049909631, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material.BackdropScaffoldKt$BackdropScaffold$1
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

                    public final void invoke(Composer composer3, int i33) {
                        ComposerKt.sourceInformation(composer3, "C297@13395L24,298@13428L3119:BackdropScaffold.kt#jmzs0o");
                        if ((i33 & 11) != 2 || !composer3.getSkipping()) {
                            composer3.startReplaceableGroup(773894976);
                            ComposerKt.sourceInformation(composer3, "C(rememberCoroutineScope)475@19849L144:Effects.kt#9igjgp");
                            composer3.startReplaceableGroup(-492369756);
                            ComposerKt.sourceInformation(composer3, "C(remember):Composables.kt#9igjgp");
                            Object rememberedValue2 = composer3.rememberedValue();
                            if (rememberedValue2 == Composer.INSTANCE.getEmpty()) {
                                CompositionScopedCoroutineScopeCanceller compositionScopedCoroutineScopeCanceller = new CompositionScopedCoroutineScopeCanceller(EffectsKt.createCompositionCoroutineScope(EmptyCoroutineContext.INSTANCE, composer3));
                                composer3.updateRememberedValue(compositionScopedCoroutineScopeCanceller);
                                rememberedValue2 = compositionScopedCoroutineScopeCanceller;
                            }
                            composer3.endReplaceableGroup();
                            final CoroutineScope coroutineScope = ((CompositionScopedCoroutineScopeCanceller) rememberedValue2).getCoroutineScope();
                            composer3.endReplaceableGroup();
                            Modifier fillMaxSize$default = SizeKt.fillMaxSize$default(Modifier.this, 0.0f, 1, null);
                            Function2<Composer, Integer, Unit> function2 = composableLambda222;
                            Function1<Constraints, Constraints> function12222 = function1222;
                            final float f14 = mo315toPx0680j_42222;
                            final boolean z18 = z16222;
                            final boolean z19 = z17222;
                            final BackdropScaffoldState backdropScaffoldState7 = backdropScaffoldState5222;
                            final float f15 = mo315toPx0680j_4322;
                            final int i34 = i30222;
                            final Shape shape8 = shape7222;
                            final long j25 = j22222;
                            final long j26 = j23222;
                            final float f16 = f13222;
                            final int i35 = i31222;
                            final float f17 = f11222;
                            final float f18 = f12222;
                            final Function2<? super Composer, ? super Integer, Unit> function22 = frontLayerContent;
                            final long j27 = j24222;
                            final Function3<? super SnackbarHostState, ? super Composer, ? super Integer, Unit> function36 = function35222;
                            BackdropScaffoldKt.BackdropStack(fillMaxSize$default, function2, function12222, ComposableLambdaKt.composableLambda(composer3, 1800047509, true, new Function4<Constraints, Float, Composer, Integer, Unit>() { // from class: androidx.compose.material.BackdropScaffoldKt$BackdropScaffold$1.1
                                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                /* JADX WARN: Multi-variable type inference failed */
                                {
                                    super(4);
                                }

                                @Override // kotlin.jvm.functions.Function4
                                public /* bridge */ /* synthetic */ Unit invoke(Constraints constraints, Float f19, Composer composer4, Integer num) {
                                    m898invokejYbf7pk(constraints.getValue(), f19.floatValue(), composer4, num.intValue());
                                    return Unit.INSTANCE;
                                }

                                /* renamed from: invoke-jYbf7pk, reason: not valid java name */
                                public final void m898invokejYbf7pk(long j28, float f19, Composer composer4, int i36) {
                                    int i37;
                                    Modifier.Companion companion2;
                                    Modifier m1182swipeablepPrIpRY;
                                    float m3840constructorimpl;
                                    ComposerKt.sourceInformation(composer4, "CP(1:c#ui.unit.Constraints)344@15194L57,342@15132L942,366@16117L420:BackdropScaffold.kt#jmzs0o");
                                    if ((i36 & 14) == 0) {
                                        i37 = i36 | (composer4.changed(j28) ? 4 : 2);
                                    } else {
                                        i37 = i36;
                                    }
                                    if ((i36 & 112) == 0) {
                                        i37 |= composer4.changed(f19) ? 32 : 16;
                                    }
                                    if ((i37 & 731) != 146 || !composer4.getSkipping()) {
                                        float m3795getMaxHeightimpl = Constraints.m3795getMaxHeightimpl(j28);
                                        float f20 = m3795getMaxHeightimpl - f14;
                                        if (z18) {
                                            f20 = Math.min(f20, f19);
                                        }
                                        float f21 = f20;
                                        if (z19) {
                                            companion2 = NestedScrollModifierKt.nestedScroll$default(Modifier.INSTANCE, backdropScaffoldState7.getNestedScrollConnection(), null, 2, null);
                                        } else {
                                            companion2 = Modifier.INSTANCE;
                                        }
                                        m1182swipeablepPrIpRY = SwipeableKt.m1182swipeablepPrIpRY(Modifier.INSTANCE.then(companion2), backdropScaffoldState7, r18, Orientation.Vertical, (r26 & 8) != 0 ? true : z19, (r26 & 16) != 0 ? false : false, (r26 & 32) != 0 ? null : null, (r26 & 64) != 0 ? new Function2<T, T, FixedThreshold>() { // from class: androidx.compose.material.SwipeableKt$swipeable$1
                                            /* JADX WARN: Can't rename method to resolve collision */
                                            @Override // kotlin.jvm.functions.Function2
                                            public final FixedThreshold invoke(T t, T t2) {
                                                return new FixedThreshold(Dp.m3840constructorimpl(56), null);
                                            }
                                        } : null, (r26 & 128) != 0 ? SwipeableDefaults.resistanceConfig$default(SwipeableDefaults.INSTANCE, MapsKt.mapOf(TuplesKt.to(Float.valueOf(f15), BackdropValue.Concealed), TuplesKt.to(Float.valueOf(f21), BackdropValue.Revealed)).keySet(), 0.0f, 0.0f, 6, null) : null, (r26 & 256) != 0 ? SwipeableDefaults.INSTANCE.m1181getVelocityThresholdD9Ej5fM() : 0.0f);
                                        final BackdropScaffoldState backdropScaffoldState8 = backdropScaffoldState7;
                                        final CoroutineScope coroutineScope2 = coroutineScope;
                                        Modifier semantics$default = SemanticsModifierKt.semantics$default(m1182swipeablepPrIpRY, false, new Function1<SemanticsPropertyReceiver, Unit>() { // from class: androidx.compose.material.BackdropScaffoldKt$BackdropScaffold$1$1$swipeable$1
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
                                                if (BackdropScaffoldState.this.isConcealed()) {
                                                    final BackdropScaffoldState backdropScaffoldState9 = BackdropScaffoldState.this;
                                                    final CoroutineScope coroutineScope3 = coroutineScope2;
                                                    SemanticsPropertiesKt.collapse$default(semantics, null, new Function0<Boolean>() { // from class: androidx.compose.material.BackdropScaffoldKt$BackdropScaffold$1$1$swipeable$1.1
                                                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                                        {
                                                            super(0);
                                                        }

                                                        /* JADX WARN: Can't rename method to resolve collision */
                                                        @Override // kotlin.jvm.functions.Function0
                                                        public final Boolean invoke() {
                                                            if (BackdropScaffoldState.this.getConfirmStateChange$material_release().invoke(BackdropValue.Revealed).booleanValue()) {
                                                                BuildersKt__Builders_commonKt.launch$default(coroutineScope3, null, null, new C00301(BackdropScaffoldState.this, null), 3, null);
                                                            }
                                                            return true;
                                                        }

                                                        /* compiled from: BackdropScaffold.kt */
                                                        @Metadata(k = 3, mv = {1, 6, 0}, xi = 48)
                                                        @DebugMetadata(c = "androidx.compose.material.BackdropScaffoldKt$BackdropScaffold$1$1$swipeable$1$1$1", f = "BackdropScaffold.kt", i = {}, l = {330}, m = "invokeSuspend", n = {}, s = {})
                                                        /* renamed from: androidx.compose.material.BackdropScaffoldKt$BackdropScaffold$1$1$swipeable$1$1$1, reason: invalid class name and collision with other inner class name */
                                                        static final class C00301 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
                                                            final /* synthetic */ BackdropScaffoldState $scaffoldState;
                                                            int label;

                                                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                                            C00301(BackdropScaffoldState backdropScaffoldState, Continuation<? super C00301> continuation) {
                                                                super(2, continuation);
                                                                this.$scaffoldState = backdropScaffoldState;
                                                            }

                                                            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                                                            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                                                                return new C00301(this.$scaffoldState, continuation);
                                                            }

                                                            @Override // kotlin.jvm.functions.Function2
                                                            public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
                                                                return ((C00301) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
                                                            }

                                                            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                                                            public final Object invokeSuspend(Object obj) {
                                                                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                                                                int i = this.label;
                                                                if (i == 0) {
                                                                    ResultKt.throwOnFailure(obj);
                                                                    this.label = 1;
                                                                    if (this.$scaffoldState.reveal(this) == coroutine_suspended) {
                                                                        return coroutine_suspended;
                                                                    }
                                                                } else {
                                                                    if (i != 1) {
                                                                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                                                                    }
                                                                    ResultKt.throwOnFailure(obj);
                                                                }
                                                                return Unit.INSTANCE;
                                                            }
                                                        }
                                                    }, 1, null);
                                                } else {
                                                    final BackdropScaffoldState backdropScaffoldState10 = BackdropScaffoldState.this;
                                                    final CoroutineScope coroutineScope4 = coroutineScope2;
                                                    SemanticsPropertiesKt.expand$default(semantics, null, new Function0<Boolean>() { // from class: androidx.compose.material.BackdropScaffoldKt$BackdropScaffold$1$1$swipeable$1.2
                                                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                                        {
                                                            super(0);
                                                        }

                                                        /* JADX WARN: Can't rename method to resolve collision */
                                                        @Override // kotlin.jvm.functions.Function0
                                                        public final Boolean invoke() {
                                                            if (BackdropScaffoldState.this.getConfirmStateChange$material_release().invoke(BackdropValue.Concealed).booleanValue()) {
                                                                BuildersKt__Builders_commonKt.launch$default(coroutineScope4, null, null, new AnonymousClass1(BackdropScaffoldState.this, null), 3, null);
                                                            }
                                                            return true;
                                                        }

                                                        /* compiled from: BackdropScaffold.kt */
                                                        @Metadata(k = 3, mv = {1, 6, 0}, xi = 48)
                                                        @DebugMetadata(c = "androidx.compose.material.BackdropScaffoldKt$BackdropScaffold$1$1$swipeable$1$2$1", f = "BackdropScaffold.kt", i = {}, l = {336}, m = "invokeSuspend", n = {}, s = {})
                                                        /* renamed from: androidx.compose.material.BackdropScaffoldKt$BackdropScaffold$1$1$swipeable$1$2$1, reason: invalid class name */
                                                        static final class AnonymousClass1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
                                                            final /* synthetic */ BackdropScaffoldState $scaffoldState;
                                                            int label;

                                                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                                            AnonymousClass1(BackdropScaffoldState backdropScaffoldState, Continuation<? super AnonymousClass1> continuation) {
                                                                super(2, continuation);
                                                                this.$scaffoldState = backdropScaffoldState;
                                                            }

                                                            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                                                            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                                                                return new AnonymousClass1(this.$scaffoldState, continuation);
                                                            }

                                                            @Override // kotlin.jvm.functions.Function2
                                                            public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
                                                                return ((AnonymousClass1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
                                                            }

                                                            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                                                            public final Object invokeSuspend(Object obj) {
                                                                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                                                                int i = this.label;
                                                                if (i == 0) {
                                                                    ResultKt.throwOnFailure(obj);
                                                                    this.label = 1;
                                                                    if (this.$scaffoldState.conceal(this) == coroutine_suspended) {
                                                                        return coroutine_suspended;
                                                                    }
                                                                } else {
                                                                    if (i != 1) {
                                                                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                                                                    }
                                                                    ResultKt.throwOnFailure(obj);
                                                                }
                                                                return Unit.INSTANCE;
                                                            }
                                                        }
                                                    }, 1, null);
                                                }
                                            }
                                        }, 1, null);
                                        Modifier.Companion companion3 = Modifier.INSTANCE;
                                        final BackdropScaffoldState backdropScaffoldState9 = backdropScaffoldState7;
                                        composer4.startReplaceableGroup(1157296644);
                                        ComposerKt.sourceInformation(composer4, "C(remember)P(1):Composables.kt#9igjgp");
                                        boolean changed2 = composer4.changed(backdropScaffoldState9);
                                        Object rememberedValue3 = composer4.rememberedValue();
                                        if (changed2 || rememberedValue3 == Composer.INSTANCE.getEmpty()) {
                                            rememberedValue3 = (Function1) new Function1<Density, IntOffset>() { // from class: androidx.compose.material.BackdropScaffoldKt$BackdropScaffold$1$1$1$1
                                                {
                                                    super(1);
                                                }

                                                @Override // kotlin.jvm.functions.Function1
                                                public /* bridge */ /* synthetic */ IntOffset invoke(Density density) {
                                                    return IntOffset.m3949boximpl(m899invokeBjo55l4(density));
                                                }

                                                /* renamed from: invoke-Bjo55l4, reason: not valid java name */
                                                public final long m899invokeBjo55l4(Density offset) {
                                                    Intrinsics.checkNotNullParameter(offset, "$this$offset");
                                                    return IntOffsetKt.IntOffset(0, MathKt.roundToInt(BackdropScaffoldState.this.getOffset().getValue().floatValue()));
                                                }
                                            };
                                            composer4.updateRememberedValue(rememberedValue3);
                                        }
                                        composer4.endReplaceableGroup();
                                        Modifier then = OffsetKt.offset(companion3, (Function1) rememberedValue3).then(semantics$default);
                                        Shape shape9 = shape8;
                                        long j29 = j25;
                                        long j30 = j26;
                                        float f22 = f16;
                                        final float f23 = f18;
                                        final Function2<? super Composer, ? super Integer, Unit> function23 = function22;
                                        final int i38 = i34;
                                        final long j31 = j27;
                                        final BackdropScaffoldState backdropScaffoldState10 = backdropScaffoldState7;
                                        final int i39 = i35;
                                        final boolean z20 = z19;
                                        final CoroutineScope coroutineScope3 = coroutineScope;
                                        ComposableLambda composableLambda2222 = ComposableLambdaKt.composableLambda(composer4, -1065299503, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material.BackdropScaffoldKt.BackdropScaffold.1.1.2
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

                                            public final void invoke(Composer composer5, int i40) {
                                                ComposerKt.sourceInformation(composer5, "C351@15517L543:BackdropScaffold.kt#jmzs0o");
                                                if ((i40 & 11) != 2 || !composer5.getSkipping()) {
                                                    Modifier m424paddingqDBjuR0$default = PaddingKt.m424paddingqDBjuR0$default(Modifier.INSTANCE, 0.0f, 0.0f, 0.0f, f23, 7, null);
                                                    Function2<Composer, Integer, Unit> function24 = function23;
                                                    int i41 = i38;
                                                    long j32 = j31;
                                                    final BackdropScaffoldState backdropScaffoldState11 = backdropScaffoldState10;
                                                    int i42 = i39;
                                                    final boolean z21 = z20;
                                                    final CoroutineScope coroutineScope4 = coroutineScope3;
                                                    composer5.startReplaceableGroup(733328855);
                                                    ComposerKt.sourceInformation(composer5, "C(Box)P(2,1,3)70@3267L67,71@3339L130:Box.kt#2w3rfo");
                                                    MeasurePolicy rememberBoxMeasurePolicy = BoxKt.rememberBoxMeasurePolicy(Alignment.INSTANCE.getTopStart(), false, composer5, 0);
                                                    composer5.startReplaceableGroup(-1323940314);
                                                    ComposerKt.sourceInformation(composer5, "C(Layout)P(!1,2)74@2915L7,75@2970L7,76@3029L7,77@3041L460:Layout.kt#80mrfh");
                                                    ProvidableCompositionLocal<Density> localDensity3222 = CompositionLocalsKt.getLocalDensity();
                                                    ComposerKt.sourceInformationMarkerStart(composer5, 2023513938, "C:CompositionLocal.kt#9igjgp");
                                                    Object consume3222 = composer5.consume(localDensity3222);
                                                    ComposerKt.sourceInformationMarkerEnd(composer5);
                                                    Density density = (Density) consume3222;
                                                    ProvidableCompositionLocal<LayoutDirection> localLayoutDirection = CompositionLocalsKt.getLocalLayoutDirection();
                                                    ComposerKt.sourceInformationMarkerStart(composer5, 2023513938, "C:CompositionLocal.kt#9igjgp");
                                                    Object consume4 = composer5.consume(localLayoutDirection);
                                                    ComposerKt.sourceInformationMarkerEnd(composer5);
                                                    LayoutDirection layoutDirection = (LayoutDirection) consume4;
                                                    ProvidableCompositionLocal<ViewConfiguration> localViewConfiguration = CompositionLocalsKt.getLocalViewConfiguration();
                                                    ComposerKt.sourceInformationMarkerStart(composer5, 2023513938, "C:CompositionLocal.kt#9igjgp");
                                                    Object consume5 = composer5.consume(localViewConfiguration);
                                                    ComposerKt.sourceInformationMarkerEnd(composer5);
                                                    ViewConfiguration viewConfiguration = (ViewConfiguration) consume5;
                                                    Function0<ComposeUiNode> constructor = ComposeUiNode.INSTANCE.getConstructor();
                                                    Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> materializerOf = LayoutKt.materializerOf(m424paddingqDBjuR0$default);
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
                                                    Updater.m1290setimpl(m1283constructorimpl, rememberBoxMeasurePolicy, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
                                                    Updater.m1290setimpl(m1283constructorimpl, density, ComposeUiNode.INSTANCE.getSetDensity());
                                                    Updater.m1290setimpl(m1283constructorimpl, layoutDirection, ComposeUiNode.INSTANCE.getSetLayoutDirection());
                                                    Updater.m1290setimpl(m1283constructorimpl, viewConfiguration, ComposeUiNode.INSTANCE.getSetViewConfiguration());
                                                    composer5.enableReusing();
                                                    materializerOf.invoke(SkippableUpdater.m1273boximpl(SkippableUpdater.m1274constructorimpl(composer5)), composer5, 0);
                                                    composer5.startReplaceableGroup(2058660585);
                                                    composer5.startReplaceableGroup(-2137368960);
                                                    ComposerKt.sourceInformation(composer5, "C72@3384L9:Box.kt#2w3rfo");
                                                    BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
                                                    composer5.startReplaceableGroup(-1889954677);
                                                    ComposerKt.sourceInformation(composer5, "C352@15582L19,353@15622L420:BackdropScaffold.kt#jmzs0o");
                                                    function24.invoke(composer5, Integer.valueOf((i41 >> 6) & 14));
                                                    BackdropScaffoldKt.m894Scrim3JVO9M(j32, new Function0<Unit>() { // from class: androidx.compose.material.BackdropScaffoldKt$BackdropScaffold$1$1$2$1$1
                                                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                                        {
                                                            super(0);
                                                        }

                                                        @Override // kotlin.jvm.functions.Function0
                                                        public /* bridge */ /* synthetic */ Unit invoke() {
                                                            invoke2();
                                                            return Unit.INSTANCE;
                                                        }

                                                        /* renamed from: invoke, reason: avoid collision after fix types in other method */
                                                        public final void invoke2() {
                                                            if (z21 && backdropScaffoldState11.getConfirmStateChange$material_release().invoke(BackdropValue.Concealed).booleanValue()) {
                                                                BuildersKt__Builders_commonKt.launch$default(coroutineScope4, null, null, new AnonymousClass1(backdropScaffoldState11, null), 3, null);
                                                            }
                                                        }

                                                        /* compiled from: BackdropScaffold.kt */
                                                        @Metadata(k = 3, mv = {1, 6, 0}, xi = 48)
                                                        @DebugMetadata(c = "androidx.compose.material.BackdropScaffoldKt$BackdropScaffold$1$1$2$1$1$1", f = "BackdropScaffold.kt", i = {}, l = {358}, m = "invokeSuspend", n = {}, s = {})
                                                        /* renamed from: androidx.compose.material.BackdropScaffoldKt$BackdropScaffold$1$1$2$1$1$1, reason: invalid class name */
                                                        static final class AnonymousClass1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
                                                            final /* synthetic */ BackdropScaffoldState $scaffoldState;
                                                            int label;

                                                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                                            AnonymousClass1(BackdropScaffoldState backdropScaffoldState, Continuation<? super AnonymousClass1> continuation) {
                                                                super(2, continuation);
                                                                this.$scaffoldState = backdropScaffoldState;
                                                            }

                                                            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                                                            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                                                                return new AnonymousClass1(this.$scaffoldState, continuation);
                                                            }

                                                            @Override // kotlin.jvm.functions.Function2
                                                            public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
                                                                return ((AnonymousClass1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
                                                            }

                                                            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                                                            public final Object invokeSuspend(Object obj) {
                                                                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                                                                int i = this.label;
                                                                if (i == 0) {
                                                                    ResultKt.throwOnFailure(obj);
                                                                    this.label = 1;
                                                                    if (this.$scaffoldState.conceal(this) == coroutine_suspended) {
                                                                        return coroutine_suspended;
                                                                    }
                                                                } else {
                                                                    if (i != 1) {
                                                                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                                                                    }
                                                                    ResultKt.throwOnFailure(obj);
                                                                }
                                                                return Unit.INSTANCE;
                                                            }
                                                        }
                                                    }, backdropScaffoldState11.getTargetValue() == BackdropValue.Revealed, composer5, (i42 >> 18) & 14);
                                                    composer5.endReplaceableGroup();
                                                    composer5.endReplaceableGroup();
                                                    composer5.endReplaceableGroup();
                                                    composer5.endNode();
                                                    composer5.endReplaceableGroup();
                                                    composer5.endReplaceableGroup();
                                                    return;
                                                }
                                                composer5.skipToGroupEnd();
                                            }
                                        });
                                        int i40 = i35;
                                        SurfaceKt.m1172SurfaceFjzlyU(then, shape9, j29, j30, null, f22, composableLambda2222, composer4, ((i40 >> 3) & 112) | 1572864 | ((i40 >> 6) & 896) | ((i40 >> 6) & 7168) | ((i40 << 6) & 458752), 16);
                                        Modifier.Companion companion4 = Modifier.INSTANCE;
                                        if (backdropScaffoldState7.isRevealed() && f21 == m3795getMaxHeightimpl - f14) {
                                            m3840constructorimpl = f17;
                                        } else {
                                            m3840constructorimpl = Dp.m3840constructorimpl(0);
                                        }
                                        Modifier m424paddingqDBjuR0$default = PaddingKt.m424paddingqDBjuR0$default(companion4, 0.0f, 0.0f, 0.0f, m3840constructorimpl, 7, null);
                                        Alignment bottomCenter = Alignment.INSTANCE.getBottomCenter();
                                        Function3<SnackbarHostState, Composer, Integer, Unit> function37 = function36;
                                        BackdropScaffoldState backdropScaffoldState11 = backdropScaffoldState7;
                                        int i41 = i35;
                                        composer4.startReplaceableGroup(733328855);
                                        ComposerKt.sourceInformation(composer4, "C(Box)P(2,1,3)70@3267L67,71@3339L130:Box.kt#2w3rfo");
                                        MeasurePolicy rememberBoxMeasurePolicy = BoxKt.rememberBoxMeasurePolicy(bottomCenter, false, composer4, 6);
                                        composer4.startReplaceableGroup(-1323940314);
                                        ComposerKt.sourceInformation(composer4, "C(Layout)P(!1,2)74@2915L7,75@2970L7,76@3029L7,77@3041L460:Layout.kt#80mrfh");
                                        ProvidableCompositionLocal<Density> localDensity3222 = CompositionLocalsKt.getLocalDensity();
                                        ComposerKt.sourceInformationMarkerStart(composer4, 2023513938, "C:CompositionLocal.kt#9igjgp");
                                        Object consume3222 = composer4.consume(localDensity3222);
                                        ComposerKt.sourceInformationMarkerEnd(composer4);
                                        Density density = (Density) consume3222;
                                        ProvidableCompositionLocal<LayoutDirection> localLayoutDirection = CompositionLocalsKt.getLocalLayoutDirection();
                                        ComposerKt.sourceInformationMarkerStart(composer4, 2023513938, "C:CompositionLocal.kt#9igjgp");
                                        Object consume4 = composer4.consume(localLayoutDirection);
                                        ComposerKt.sourceInformationMarkerEnd(composer4);
                                        LayoutDirection layoutDirection = (LayoutDirection) consume4;
                                        ProvidableCompositionLocal<ViewConfiguration> localViewConfiguration = CompositionLocalsKt.getLocalViewConfiguration();
                                        ComposerKt.sourceInformationMarkerStart(composer4, 2023513938, "C:CompositionLocal.kt#9igjgp");
                                        Object consume5 = composer4.consume(localViewConfiguration);
                                        ComposerKt.sourceInformationMarkerEnd(composer4);
                                        ViewConfiguration viewConfiguration = (ViewConfiguration) consume5;
                                        Function0<ComposeUiNode> constructor = ComposeUiNode.INSTANCE.getConstructor();
                                        Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> materializerOf = LayoutKt.materializerOf(m424paddingqDBjuR0$default);
                                        if (!(composer4.getApplier() instanceof Applier)) {
                                            ComposablesKt.invalidApplier();
                                        }
                                        composer4.startReusableNode();
                                        if (composer4.getInserting()) {
                                            composer4.createNode(constructor);
                                        } else {
                                            composer4.useNode();
                                        }
                                        composer4.disableReusing();
                                        Composer m1283constructorimpl = Updater.m1283constructorimpl(composer4);
                                        Updater.m1290setimpl(m1283constructorimpl, rememberBoxMeasurePolicy, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
                                        Updater.m1290setimpl(m1283constructorimpl, density, ComposeUiNode.INSTANCE.getSetDensity());
                                        Updater.m1290setimpl(m1283constructorimpl, layoutDirection, ComposeUiNode.INSTANCE.getSetLayoutDirection());
                                        Updater.m1290setimpl(m1283constructorimpl, viewConfiguration, ComposeUiNode.INSTANCE.getSetViewConfiguration());
                                        composer4.enableReusing();
                                        materializerOf.invoke(SkippableUpdater.m1273boximpl(SkippableUpdater.m1274constructorimpl(composer4)), composer4, 0);
                                        composer4.startReplaceableGroup(2058660585);
                                        composer4.startReplaceableGroup(-2137368960);
                                        ComposerKt.sourceInformation(composer4, "C72@3384L9:Box.kt#2w3rfo");
                                        BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
                                        composer4.startReplaceableGroup(1815906203);
                                        ComposerKt.sourceInformation(composer4, "C375@16478L45:BackdropScaffold.kt#jmzs0o");
                                        function37.invoke(backdropScaffoldState11.getSnackbarHostState(), composer4, Integer.valueOf((i41 >> 18) & 112));
                                        composer4.endReplaceableGroup();
                                        composer4.endReplaceableGroup();
                                        composer4.endReplaceableGroup();
                                        composer4.endNode();
                                        composer4.endReplaceableGroup();
                                        composer4.endReplaceableGroup();
                                        return;
                                    }
                                    composer4.skipToGroupEnd();
                                }
                            }), composer3, 3120);
                            return;
                        }
                        composer3.skipToGroupEnd();
                    }
                }), composer2, (i32222 & 7168) | (i32222 & 896) | 1572864, 51);
                modifier2 = modifier4;
                backdropScaffoldState2 = backdropScaffoldState6222;
                z9 = z6;
                z10 = z7;
                z11 = z8;
                shape5 = shape4;
                j17 = j13;
                j18 = j15;
                f8 = f5;
                j19 = j16;
                j20 = j14;
                j21 = j12;
                function34 = function33;
                f9 = f11222;
                f10 = f12222;
                endRestartGroup = composer2.endRestartGroup();
                if (endRestartGroup != null) {
                }
            }
            i8 = i7;
            i9 = i3 & 256;
            if (i9 != 0) {
            }
            i10 = i9;
            i11 = i3 & 512;
            if (i11 == 0) {
            }
            i12 = i11;
            if ((i2 & 14) == 0) {
            }
            if ((i2 & 112) == 0) {
            }
            if ((i2 & 896) == 0) {
            }
            i14 = i3 & 8192;
            if (i14 != 0) {
            }
            if ((i2 & 57344) == 0) {
            }
            if ((458752 & i2) == 0) {
            }
            if ((3670016 & i2) == 0) {
            }
            i15 = i3 & 131072;
            if (i15 == 0) {
            }
            int i272222 = i13;
            if ((1533916891 & i4) == 306783378) {
            }
            startRestartGroup.startDefaults();
            if ((i & 1) != 0) {
            }
            if (i25 == 0) {
            }
            if ((i3 & 16) == 0) {
            }
            if (i5 == 0) {
            }
            if (i6 == 0) {
            }
            if (i17 == 0) {
            }
            if (i18 == 0) {
            }
            if (i19 == 0) {
            }
            if ((i3 & 1024) == 0) {
            }
            if ((i3 & 2048) == 0) {
            }
            int i282222 = i20;
            if ((i3 & 4096) == 0) {
            }
            if (i16 == 0) {
            }
            Shape shape62222 = shape3;
            if ((i3 & 16384) == 0) {
            }
            if ((i3 & 32768) == 0) {
            }
            if ((i3 & 65536) == 0) {
            }
            if (i15 == 0) {
            }
            i23 = i21;
            f6 = m891getPeekHeightD9Ej5fM;
            f7 = m890getHeaderHeightD9Ej5fM;
            startRestartGroup.endDefaults();
            ProvidableCompositionLocal<Density> localDensity3222 = CompositionLocalsKt.getLocalDensity();
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, 2023513938, "C:CompositionLocal.kt#9igjgp");
            Object consume3222 = startRestartGroup.consume(localDensity3222);
            ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
            final float mo315toPx0680j_43222 = ((Density) consume3222).mo315toPx0680j_4(f6);
            ProvidableCompositionLocal<Density> localDensity22222 = CompositionLocalsKt.getLocalDensity();
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, 2023513938, "C:CompositionLocal.kt#9igjgp");
            Object consume22222 = startRestartGroup.consume(localDensity22222);
            ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
            final float mo315toPx0680j_422222 = ((Density) consume22222).mo315toPx0680j_4(f7);
            final boolean z152222 = z7;
            final BackdropScaffoldState backdropScaffoldState42222 = backdropScaffoldState3;
            final int i292222 = i23;
            final Function2<? super Composer, ? super Integer, Unit> composableLambda2222 = ComposableLambdaKt.composableLambda(startRestartGroup, 1744778315, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material.BackdropScaffoldKt$BackdropScaffold$backLayer$1
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

                public final void invoke(Composer composer3, int i302222) {
                    ComposerKt.sourceInformation(composer3, "C:BackdropScaffold.kt#jmzs0o");
                    if ((i302222 & 11) != 2 || !composer3.getSkipping()) {
                        if (z152222) {
                            composer3.startReplaceableGroup(-1017265331);
                            ComposerKt.sourceInformation(composer3, "280@12876L82");
                            Function2<Composer, Integer, Unit> function2 = appBar;
                            int i312222 = i292222;
                            Function2<Composer, Integer, Unit> function22 = backLayerContent;
                            composer3.startReplaceableGroup(-483455358);
                            ComposerKt.sourceInformation(composer3, "C(Column)P(2,3,1)77@3880L61,78@3946L133:Column.kt#2w3rfo");
                            Modifier.Companion companion2 = Modifier.INSTANCE;
                            MeasurePolicy columnMeasurePolicy = ColumnKt.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), Alignment.INSTANCE.getStart(), composer3, 0);
                            composer3.startReplaceableGroup(-1323940314);
                            ComposerKt.sourceInformation(composer3, "C(Layout)P(!1,2)74@2915L7,75@2970L7,76@3029L7,77@3041L460:Layout.kt#80mrfh");
                            ProvidableCompositionLocal<Density> localDensity32222 = CompositionLocalsKt.getLocalDensity();
                            ComposerKt.sourceInformationMarkerStart(composer3, 2023513938, "C:CompositionLocal.kt#9igjgp");
                            Object consume32222 = composer3.consume(localDensity32222);
                            ComposerKt.sourceInformationMarkerEnd(composer3);
                            Density density = (Density) consume32222;
                            ProvidableCompositionLocal<LayoutDirection> localLayoutDirection = CompositionLocalsKt.getLocalLayoutDirection();
                            ComposerKt.sourceInformationMarkerStart(composer3, 2023513938, "C:CompositionLocal.kt#9igjgp");
                            Object consume4 = composer3.consume(localLayoutDirection);
                            ComposerKt.sourceInformationMarkerEnd(composer3);
                            LayoutDirection layoutDirection = (LayoutDirection) consume4;
                            ProvidableCompositionLocal<ViewConfiguration> localViewConfiguration = CompositionLocalsKt.getLocalViewConfiguration();
                            ComposerKt.sourceInformationMarkerStart(composer3, 2023513938, "C:CompositionLocal.kt#9igjgp");
                            Object consume5 = composer3.consume(localViewConfiguration);
                            ComposerKt.sourceInformationMarkerEnd(composer3);
                            ViewConfiguration viewConfiguration = (ViewConfiguration) consume5;
                            Function0<ComposeUiNode> constructor = ComposeUiNode.INSTANCE.getConstructor();
                            Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> materializerOf = LayoutKt.materializerOf(companion2);
                            if (!(composer3.getApplier() instanceof Applier)) {
                                ComposablesKt.invalidApplier();
                            }
                            composer3.startReusableNode();
                            if (composer3.getInserting()) {
                                composer3.createNode(constructor);
                            } else {
                                composer3.useNode();
                            }
                            composer3.disableReusing();
                            Composer m1283constructorimpl = Updater.m1283constructorimpl(composer3);
                            Updater.m1290setimpl(m1283constructorimpl, columnMeasurePolicy, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
                            Updater.m1290setimpl(m1283constructorimpl, density, ComposeUiNode.INSTANCE.getSetDensity());
                            Updater.m1290setimpl(m1283constructorimpl, layoutDirection, ComposeUiNode.INSTANCE.getSetLayoutDirection());
                            Updater.m1290setimpl(m1283constructorimpl, viewConfiguration, ComposeUiNode.INSTANCE.getSetViewConfiguration());
                            composer3.enableReusing();
                            materializerOf.invoke(SkippableUpdater.m1273boximpl(SkippableUpdater.m1274constructorimpl(composer3)), composer3, 0);
                            composer3.startReplaceableGroup(2058660585);
                            composer3.startReplaceableGroup(-1163856341);
                            ComposerKt.sourceInformation(composer3, "C79@3994L9:Column.kt#2w3rfo");
                            ColumnScopeInstance columnScopeInstance = ColumnScopeInstance.INSTANCE;
                            composer3.startReplaceableGroup(-18835878);
                            ComposerKt.sourceInformation(composer3, "C281@12901L8,282@12926L18:BackdropScaffold.kt#jmzs0o");
                            function2.invoke(composer3, Integer.valueOf(i312222 & 14));
                            function22.invoke(composer3, Integer.valueOf((i312222 >> 3) & 14));
                            composer3.endReplaceableGroup();
                            composer3.endReplaceableGroup();
                            composer3.endReplaceableGroup();
                            composer3.endNode();
                            composer3.endReplaceableGroup();
                            composer3.endReplaceableGroup();
                            composer3.endReplaceableGroup();
                            return;
                        }
                        composer3.startReplaceableGroup(-1017265219);
                        ComposerKt.sourceInformation(composer3, "285@12988L72");
                        BackdropValue targetValue = backdropScaffoldState42222.getTargetValue();
                        Function2<Composer, Integer, Unit> function23 = appBar;
                        Function2<Composer, Integer, Unit> function24 = backLayerContent;
                        int i322222 = i292222;
                        BackdropScaffoldKt.BackLayerTransition(targetValue, function23, function24, composer3, ((i322222 << 3) & 896) | ((i322222 << 3) & 112));
                        composer3.endReplaceableGroup();
                        return;
                    }
                    composer3.skipToGroupEnd();
                }
            });
            Float valueOf2222 = Float.valueOf(mo315toPx0680j_422222);
            startRestartGroup.startReplaceableGroup(1157296644);
            ComposerKt.sourceInformation(startRestartGroup, "C(remember)P(1):Composables.kt#9igjgp");
            changed = startRestartGroup.changed(valueOf2222);
            rememberedValue = startRestartGroup.rememberedValue();
            if (!changed) {
            }
            rememberedValue = (Function1) new Function1<Constraints, Constraints>() { // from class: androidx.compose.material.BackdropScaffoldKt$BackdropScaffold$calculateBackLayerConstraints$1$1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(1);
                }

                @Override // kotlin.jvm.functions.Function1
                public /* bridge */ /* synthetic */ Constraints invoke(Constraints constraints) {
                    return Constraints.m3784boximpl(m900invokeZezNO4M(constraints.getValue()));
                }

                /* renamed from: invoke-ZezNO4M, reason: not valid java name */
                public final long m900invokeZezNO4M(long j222222) {
                    return ConstraintsKt.m3813offsetNN6EwU$default(Constraints.m3787copyZbe2FdA$default(j222222, 0, 0, 0, 0, 10, null), 0, -MathKt.roundToInt(mo315toPx0680j_422222), 1, null);
                }
            };
            startRestartGroup.updateRememberedValue(rememberedValue);
            startRestartGroup.endReplaceableGroup();
            final Function1<? super Constraints, Constraints> function12222 = (Function1) rememberedValue;
            final Modifier modifier52222 = modifier4;
            final boolean z162222 = z8;
            final boolean z172222 = z6;
            final float f112222 = f7;
            final BackdropScaffoldState backdropScaffoldState52222 = backdropScaffoldState3;
            final float f122222 = f6;
            BackdropScaffoldState backdropScaffoldState62222 = backdropScaffoldState3;
            composer2 = startRestartGroup;
            final int i302222 = i23;
            final Shape shape72222 = shape4;
            final long j222222 = j16;
            final long j232222 = j14;
            final float f132222 = f5;
            final int i312222 = i22;
            final long j242222 = j12;
            final Function3<? super SnackbarHostState, ? super Composer, ? super Integer, Unit> function352222 = function33;
            int i322222 = i22 << 6;
            SurfaceKt.m1172SurfaceFjzlyU(null, null, j13, j15, null, 0.0f, ComposableLambdaKt.composableLambda(composer2, -1049909631, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material.BackdropScaffoldKt$BackdropScaffold$1
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

                public final void invoke(Composer composer3, int i33) {
                    ComposerKt.sourceInformation(composer3, "C297@13395L24,298@13428L3119:BackdropScaffold.kt#jmzs0o");
                    if ((i33 & 11) != 2 || !composer3.getSkipping()) {
                        composer3.startReplaceableGroup(773894976);
                        ComposerKt.sourceInformation(composer3, "C(rememberCoroutineScope)475@19849L144:Effects.kt#9igjgp");
                        composer3.startReplaceableGroup(-492369756);
                        ComposerKt.sourceInformation(composer3, "C(remember):Composables.kt#9igjgp");
                        Object rememberedValue2 = composer3.rememberedValue();
                        if (rememberedValue2 == Composer.INSTANCE.getEmpty()) {
                            CompositionScopedCoroutineScopeCanceller compositionScopedCoroutineScopeCanceller = new CompositionScopedCoroutineScopeCanceller(EffectsKt.createCompositionCoroutineScope(EmptyCoroutineContext.INSTANCE, composer3));
                            composer3.updateRememberedValue(compositionScopedCoroutineScopeCanceller);
                            rememberedValue2 = compositionScopedCoroutineScopeCanceller;
                        }
                        composer3.endReplaceableGroup();
                        final CoroutineScope coroutineScope = ((CompositionScopedCoroutineScopeCanceller) rememberedValue2).getCoroutineScope();
                        composer3.endReplaceableGroup();
                        Modifier fillMaxSize$default = SizeKt.fillMaxSize$default(Modifier.this, 0.0f, 1, null);
                        Function2<Composer, Integer, Unit> function2 = composableLambda2222;
                        Function1<Constraints, Constraints> function122222 = function12222;
                        final float f14 = mo315toPx0680j_422222;
                        final boolean z18 = z162222;
                        final boolean z19 = z172222;
                        final BackdropScaffoldState backdropScaffoldState7 = backdropScaffoldState52222;
                        final float f15 = mo315toPx0680j_43222;
                        final int i34 = i302222;
                        final Shape shape8 = shape72222;
                        final long j25 = j222222;
                        final long j26 = j232222;
                        final float f16 = f132222;
                        final int i35 = i312222;
                        final float f17 = f112222;
                        final float f18 = f122222;
                        final Function2<? super Composer, ? super Integer, Unit> function22 = frontLayerContent;
                        final long j27 = j242222;
                        final Function3<? super SnackbarHostState, ? super Composer, ? super Integer, Unit> function36 = function352222;
                        BackdropScaffoldKt.BackdropStack(fillMaxSize$default, function2, function122222, ComposableLambdaKt.composableLambda(composer3, 1800047509, true, new Function4<Constraints, Float, Composer, Integer, Unit>() { // from class: androidx.compose.material.BackdropScaffoldKt$BackdropScaffold$1.1
                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            /* JADX WARN: Multi-variable type inference failed */
                            {
                                super(4);
                            }

                            @Override // kotlin.jvm.functions.Function4
                            public /* bridge */ /* synthetic */ Unit invoke(Constraints constraints, Float f19, Composer composer4, Integer num) {
                                m898invokejYbf7pk(constraints.getValue(), f19.floatValue(), composer4, num.intValue());
                                return Unit.INSTANCE;
                            }

                            /* renamed from: invoke-jYbf7pk, reason: not valid java name */
                            public final void m898invokejYbf7pk(long j28, float f19, Composer composer4, int i36) {
                                int i37;
                                Modifier.Companion companion2;
                                Modifier m1182swipeablepPrIpRY;
                                float m3840constructorimpl;
                                ComposerKt.sourceInformation(composer4, "CP(1:c#ui.unit.Constraints)344@15194L57,342@15132L942,366@16117L420:BackdropScaffold.kt#jmzs0o");
                                if ((i36 & 14) == 0) {
                                    i37 = i36 | (composer4.changed(j28) ? 4 : 2);
                                } else {
                                    i37 = i36;
                                }
                                if ((i36 & 112) == 0) {
                                    i37 |= composer4.changed(f19) ? 32 : 16;
                                }
                                if ((i37 & 731) != 146 || !composer4.getSkipping()) {
                                    float m3795getMaxHeightimpl = Constraints.m3795getMaxHeightimpl(j28);
                                    float f20 = m3795getMaxHeightimpl - f14;
                                    if (z18) {
                                        f20 = Math.min(f20, f19);
                                    }
                                    float f21 = f20;
                                    if (z19) {
                                        companion2 = NestedScrollModifierKt.nestedScroll$default(Modifier.INSTANCE, backdropScaffoldState7.getNestedScrollConnection(), null, 2, null);
                                    } else {
                                        companion2 = Modifier.INSTANCE;
                                    }
                                    m1182swipeablepPrIpRY = SwipeableKt.m1182swipeablepPrIpRY(Modifier.INSTANCE.then(companion2), backdropScaffoldState7, r18, Orientation.Vertical, (r26 & 8) != 0 ? true : z19, (r26 & 16) != 0 ? false : false, (r26 & 32) != 0 ? null : null, (r26 & 64) != 0 ? new Function2<T, T, FixedThreshold>() { // from class: androidx.compose.material.SwipeableKt$swipeable$1
                                        /* JADX WARN: Can't rename method to resolve collision */
                                        @Override // kotlin.jvm.functions.Function2
                                        public final FixedThreshold invoke(T t, T t2) {
                                            return new FixedThreshold(Dp.m3840constructorimpl(56), null);
                                        }
                                    } : null, (r26 & 128) != 0 ? SwipeableDefaults.resistanceConfig$default(SwipeableDefaults.INSTANCE, MapsKt.mapOf(TuplesKt.to(Float.valueOf(f15), BackdropValue.Concealed), TuplesKt.to(Float.valueOf(f21), BackdropValue.Revealed)).keySet(), 0.0f, 0.0f, 6, null) : null, (r26 & 256) != 0 ? SwipeableDefaults.INSTANCE.m1181getVelocityThresholdD9Ej5fM() : 0.0f);
                                    final BackdropScaffoldState backdropScaffoldState8 = backdropScaffoldState7;
                                    final CoroutineScope coroutineScope2 = coroutineScope;
                                    Modifier semantics$default = SemanticsModifierKt.semantics$default(m1182swipeablepPrIpRY, false, new Function1<SemanticsPropertyReceiver, Unit>() { // from class: androidx.compose.material.BackdropScaffoldKt$BackdropScaffold$1$1$swipeable$1
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
                                            if (BackdropScaffoldState.this.isConcealed()) {
                                                final BackdropScaffoldState backdropScaffoldState9 = BackdropScaffoldState.this;
                                                final CoroutineScope coroutineScope3 = coroutineScope2;
                                                SemanticsPropertiesKt.collapse$default(semantics, null, new Function0<Boolean>() { // from class: androidx.compose.material.BackdropScaffoldKt$BackdropScaffold$1$1$swipeable$1.1
                                                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                                    {
                                                        super(0);
                                                    }

                                                    /* JADX WARN: Can't rename method to resolve collision */
                                                    @Override // kotlin.jvm.functions.Function0
                                                    public final Boolean invoke() {
                                                        if (BackdropScaffoldState.this.getConfirmStateChange$material_release().invoke(BackdropValue.Revealed).booleanValue()) {
                                                            BuildersKt__Builders_commonKt.launch$default(coroutineScope3, null, null, new C00301(BackdropScaffoldState.this, null), 3, null);
                                                        }
                                                        return true;
                                                    }

                                                    /* compiled from: BackdropScaffold.kt */
                                                    @Metadata(k = 3, mv = {1, 6, 0}, xi = 48)
                                                    @DebugMetadata(c = "androidx.compose.material.BackdropScaffoldKt$BackdropScaffold$1$1$swipeable$1$1$1", f = "BackdropScaffold.kt", i = {}, l = {330}, m = "invokeSuspend", n = {}, s = {})
                                                    /* renamed from: androidx.compose.material.BackdropScaffoldKt$BackdropScaffold$1$1$swipeable$1$1$1, reason: invalid class name and collision with other inner class name */
                                                    static final class C00301 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
                                                        final /* synthetic */ BackdropScaffoldState $scaffoldState;
                                                        int label;

                                                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                                        C00301(BackdropScaffoldState backdropScaffoldState, Continuation<? super C00301> continuation) {
                                                            super(2, continuation);
                                                            this.$scaffoldState = backdropScaffoldState;
                                                        }

                                                        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                                                        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                                                            return new C00301(this.$scaffoldState, continuation);
                                                        }

                                                        @Override // kotlin.jvm.functions.Function2
                                                        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
                                                            return ((C00301) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
                                                        }

                                                        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                                                        public final Object invokeSuspend(Object obj) {
                                                            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                                                            int i = this.label;
                                                            if (i == 0) {
                                                                ResultKt.throwOnFailure(obj);
                                                                this.label = 1;
                                                                if (this.$scaffoldState.reveal(this) == coroutine_suspended) {
                                                                    return coroutine_suspended;
                                                                }
                                                            } else {
                                                                if (i != 1) {
                                                                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                                                                }
                                                                ResultKt.throwOnFailure(obj);
                                                            }
                                                            return Unit.INSTANCE;
                                                        }
                                                    }
                                                }, 1, null);
                                            } else {
                                                final BackdropScaffoldState backdropScaffoldState10 = BackdropScaffoldState.this;
                                                final CoroutineScope coroutineScope4 = coroutineScope2;
                                                SemanticsPropertiesKt.expand$default(semantics, null, new Function0<Boolean>() { // from class: androidx.compose.material.BackdropScaffoldKt$BackdropScaffold$1$1$swipeable$1.2
                                                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                                    {
                                                        super(0);
                                                    }

                                                    /* JADX WARN: Can't rename method to resolve collision */
                                                    @Override // kotlin.jvm.functions.Function0
                                                    public final Boolean invoke() {
                                                        if (BackdropScaffoldState.this.getConfirmStateChange$material_release().invoke(BackdropValue.Concealed).booleanValue()) {
                                                            BuildersKt__Builders_commonKt.launch$default(coroutineScope4, null, null, new AnonymousClass1(BackdropScaffoldState.this, null), 3, null);
                                                        }
                                                        return true;
                                                    }

                                                    /* compiled from: BackdropScaffold.kt */
                                                    @Metadata(k = 3, mv = {1, 6, 0}, xi = 48)
                                                    @DebugMetadata(c = "androidx.compose.material.BackdropScaffoldKt$BackdropScaffold$1$1$swipeable$1$2$1", f = "BackdropScaffold.kt", i = {}, l = {336}, m = "invokeSuspend", n = {}, s = {})
                                                    /* renamed from: androidx.compose.material.BackdropScaffoldKt$BackdropScaffold$1$1$swipeable$1$2$1, reason: invalid class name */
                                                    static final class AnonymousClass1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
                                                        final /* synthetic */ BackdropScaffoldState $scaffoldState;
                                                        int label;

                                                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                                        AnonymousClass1(BackdropScaffoldState backdropScaffoldState, Continuation<? super AnonymousClass1> continuation) {
                                                            super(2, continuation);
                                                            this.$scaffoldState = backdropScaffoldState;
                                                        }

                                                        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                                                        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                                                            return new AnonymousClass1(this.$scaffoldState, continuation);
                                                        }

                                                        @Override // kotlin.jvm.functions.Function2
                                                        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
                                                            return ((AnonymousClass1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
                                                        }

                                                        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                                                        public final Object invokeSuspend(Object obj) {
                                                            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                                                            int i = this.label;
                                                            if (i == 0) {
                                                                ResultKt.throwOnFailure(obj);
                                                                this.label = 1;
                                                                if (this.$scaffoldState.conceal(this) == coroutine_suspended) {
                                                                    return coroutine_suspended;
                                                                }
                                                            } else {
                                                                if (i != 1) {
                                                                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                                                                }
                                                                ResultKt.throwOnFailure(obj);
                                                            }
                                                            return Unit.INSTANCE;
                                                        }
                                                    }
                                                }, 1, null);
                                            }
                                        }
                                    }, 1, null);
                                    Modifier.Companion companion3 = Modifier.INSTANCE;
                                    final BackdropScaffoldState backdropScaffoldState9 = backdropScaffoldState7;
                                    composer4.startReplaceableGroup(1157296644);
                                    ComposerKt.sourceInformation(composer4, "C(remember)P(1):Composables.kt#9igjgp");
                                    boolean changed2 = composer4.changed(backdropScaffoldState9);
                                    Object rememberedValue3 = composer4.rememberedValue();
                                    if (changed2 || rememberedValue3 == Composer.INSTANCE.getEmpty()) {
                                        rememberedValue3 = (Function1) new Function1<Density, IntOffset>() { // from class: androidx.compose.material.BackdropScaffoldKt$BackdropScaffold$1$1$1$1
                                            {
                                                super(1);
                                            }

                                            @Override // kotlin.jvm.functions.Function1
                                            public /* bridge */ /* synthetic */ IntOffset invoke(Density density) {
                                                return IntOffset.m3949boximpl(m899invokeBjo55l4(density));
                                            }

                                            /* renamed from: invoke-Bjo55l4, reason: not valid java name */
                                            public final long m899invokeBjo55l4(Density offset) {
                                                Intrinsics.checkNotNullParameter(offset, "$this$offset");
                                                return IntOffsetKt.IntOffset(0, MathKt.roundToInt(BackdropScaffoldState.this.getOffset().getValue().floatValue()));
                                            }
                                        };
                                        composer4.updateRememberedValue(rememberedValue3);
                                    }
                                    composer4.endReplaceableGroup();
                                    Modifier then = OffsetKt.offset(companion3, (Function1) rememberedValue3).then(semantics$default);
                                    Shape shape9 = shape8;
                                    long j29 = j25;
                                    long j30 = j26;
                                    float f22 = f16;
                                    final float f23 = f18;
                                    final Function2<? super Composer, ? super Integer, Unit> function23 = function22;
                                    final int i38 = i34;
                                    final long j31 = j27;
                                    final BackdropScaffoldState backdropScaffoldState10 = backdropScaffoldState7;
                                    final int i39 = i35;
                                    final boolean z20 = z19;
                                    final CoroutineScope coroutineScope3 = coroutineScope;
                                    ComposableLambda composableLambda22222 = ComposableLambdaKt.composableLambda(composer4, -1065299503, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material.BackdropScaffoldKt.BackdropScaffold.1.1.2
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

                                        public final void invoke(Composer composer5, int i40) {
                                            ComposerKt.sourceInformation(composer5, "C351@15517L543:BackdropScaffold.kt#jmzs0o");
                                            if ((i40 & 11) != 2 || !composer5.getSkipping()) {
                                                Modifier m424paddingqDBjuR0$default = PaddingKt.m424paddingqDBjuR0$default(Modifier.INSTANCE, 0.0f, 0.0f, 0.0f, f23, 7, null);
                                                Function2<Composer, Integer, Unit> function24 = function23;
                                                int i41 = i38;
                                                long j32 = j31;
                                                final BackdropScaffoldState backdropScaffoldState11 = backdropScaffoldState10;
                                                int i42 = i39;
                                                final boolean z21 = z20;
                                                final CoroutineScope coroutineScope4 = coroutineScope3;
                                                composer5.startReplaceableGroup(733328855);
                                                ComposerKt.sourceInformation(composer5, "C(Box)P(2,1,3)70@3267L67,71@3339L130:Box.kt#2w3rfo");
                                                MeasurePolicy rememberBoxMeasurePolicy = BoxKt.rememberBoxMeasurePolicy(Alignment.INSTANCE.getTopStart(), false, composer5, 0);
                                                composer5.startReplaceableGroup(-1323940314);
                                                ComposerKt.sourceInformation(composer5, "C(Layout)P(!1,2)74@2915L7,75@2970L7,76@3029L7,77@3041L460:Layout.kt#80mrfh");
                                                ProvidableCompositionLocal<Density> localDensity32222 = CompositionLocalsKt.getLocalDensity();
                                                ComposerKt.sourceInformationMarkerStart(composer5, 2023513938, "C:CompositionLocal.kt#9igjgp");
                                                Object consume32222 = composer5.consume(localDensity32222);
                                                ComposerKt.sourceInformationMarkerEnd(composer5);
                                                Density density = (Density) consume32222;
                                                ProvidableCompositionLocal<LayoutDirection> localLayoutDirection = CompositionLocalsKt.getLocalLayoutDirection();
                                                ComposerKt.sourceInformationMarkerStart(composer5, 2023513938, "C:CompositionLocal.kt#9igjgp");
                                                Object consume4 = composer5.consume(localLayoutDirection);
                                                ComposerKt.sourceInformationMarkerEnd(composer5);
                                                LayoutDirection layoutDirection = (LayoutDirection) consume4;
                                                ProvidableCompositionLocal<ViewConfiguration> localViewConfiguration = CompositionLocalsKt.getLocalViewConfiguration();
                                                ComposerKt.sourceInformationMarkerStart(composer5, 2023513938, "C:CompositionLocal.kt#9igjgp");
                                                Object consume5 = composer5.consume(localViewConfiguration);
                                                ComposerKt.sourceInformationMarkerEnd(composer5);
                                                ViewConfiguration viewConfiguration = (ViewConfiguration) consume5;
                                                Function0<ComposeUiNode> constructor = ComposeUiNode.INSTANCE.getConstructor();
                                                Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> materializerOf = LayoutKt.materializerOf(m424paddingqDBjuR0$default);
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
                                                Updater.m1290setimpl(m1283constructorimpl, rememberBoxMeasurePolicy, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
                                                Updater.m1290setimpl(m1283constructorimpl, density, ComposeUiNode.INSTANCE.getSetDensity());
                                                Updater.m1290setimpl(m1283constructorimpl, layoutDirection, ComposeUiNode.INSTANCE.getSetLayoutDirection());
                                                Updater.m1290setimpl(m1283constructorimpl, viewConfiguration, ComposeUiNode.INSTANCE.getSetViewConfiguration());
                                                composer5.enableReusing();
                                                materializerOf.invoke(SkippableUpdater.m1273boximpl(SkippableUpdater.m1274constructorimpl(composer5)), composer5, 0);
                                                composer5.startReplaceableGroup(2058660585);
                                                composer5.startReplaceableGroup(-2137368960);
                                                ComposerKt.sourceInformation(composer5, "C72@3384L9:Box.kt#2w3rfo");
                                                BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
                                                composer5.startReplaceableGroup(-1889954677);
                                                ComposerKt.sourceInformation(composer5, "C352@15582L19,353@15622L420:BackdropScaffold.kt#jmzs0o");
                                                function24.invoke(composer5, Integer.valueOf((i41 >> 6) & 14));
                                                BackdropScaffoldKt.m894Scrim3JVO9M(j32, new Function0<Unit>() { // from class: androidx.compose.material.BackdropScaffoldKt$BackdropScaffold$1$1$2$1$1
                                                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                                    {
                                                        super(0);
                                                    }

                                                    @Override // kotlin.jvm.functions.Function0
                                                    public /* bridge */ /* synthetic */ Unit invoke() {
                                                        invoke2();
                                                        return Unit.INSTANCE;
                                                    }

                                                    /* renamed from: invoke, reason: avoid collision after fix types in other method */
                                                    public final void invoke2() {
                                                        if (z21 && backdropScaffoldState11.getConfirmStateChange$material_release().invoke(BackdropValue.Concealed).booleanValue()) {
                                                            BuildersKt__Builders_commonKt.launch$default(coroutineScope4, null, null, new AnonymousClass1(backdropScaffoldState11, null), 3, null);
                                                        }
                                                    }

                                                    /* compiled from: BackdropScaffold.kt */
                                                    @Metadata(k = 3, mv = {1, 6, 0}, xi = 48)
                                                    @DebugMetadata(c = "androidx.compose.material.BackdropScaffoldKt$BackdropScaffold$1$1$2$1$1$1", f = "BackdropScaffold.kt", i = {}, l = {358}, m = "invokeSuspend", n = {}, s = {})
                                                    /* renamed from: androidx.compose.material.BackdropScaffoldKt$BackdropScaffold$1$1$2$1$1$1, reason: invalid class name */
                                                    static final class AnonymousClass1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
                                                        final /* synthetic */ BackdropScaffoldState $scaffoldState;
                                                        int label;

                                                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                                        AnonymousClass1(BackdropScaffoldState backdropScaffoldState, Continuation<? super AnonymousClass1> continuation) {
                                                            super(2, continuation);
                                                            this.$scaffoldState = backdropScaffoldState;
                                                        }

                                                        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                                                        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                                                            return new AnonymousClass1(this.$scaffoldState, continuation);
                                                        }

                                                        @Override // kotlin.jvm.functions.Function2
                                                        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
                                                            return ((AnonymousClass1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
                                                        }

                                                        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                                                        public final Object invokeSuspend(Object obj) {
                                                            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                                                            int i = this.label;
                                                            if (i == 0) {
                                                                ResultKt.throwOnFailure(obj);
                                                                this.label = 1;
                                                                if (this.$scaffoldState.conceal(this) == coroutine_suspended) {
                                                                    return coroutine_suspended;
                                                                }
                                                            } else {
                                                                if (i != 1) {
                                                                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                                                                }
                                                                ResultKt.throwOnFailure(obj);
                                                            }
                                                            return Unit.INSTANCE;
                                                        }
                                                    }
                                                }, backdropScaffoldState11.getTargetValue() == BackdropValue.Revealed, composer5, (i42 >> 18) & 14);
                                                composer5.endReplaceableGroup();
                                                composer5.endReplaceableGroup();
                                                composer5.endReplaceableGroup();
                                                composer5.endNode();
                                                composer5.endReplaceableGroup();
                                                composer5.endReplaceableGroup();
                                                return;
                                            }
                                            composer5.skipToGroupEnd();
                                        }
                                    });
                                    int i40 = i35;
                                    SurfaceKt.m1172SurfaceFjzlyU(then, shape9, j29, j30, null, f22, composableLambda22222, composer4, ((i40 >> 3) & 112) | 1572864 | ((i40 >> 6) & 896) | ((i40 >> 6) & 7168) | ((i40 << 6) & 458752), 16);
                                    Modifier.Companion companion4 = Modifier.INSTANCE;
                                    if (backdropScaffoldState7.isRevealed() && f21 == m3795getMaxHeightimpl - f14) {
                                        m3840constructorimpl = f17;
                                    } else {
                                        m3840constructorimpl = Dp.m3840constructorimpl(0);
                                    }
                                    Modifier m424paddingqDBjuR0$default = PaddingKt.m424paddingqDBjuR0$default(companion4, 0.0f, 0.0f, 0.0f, m3840constructorimpl, 7, null);
                                    Alignment bottomCenter = Alignment.INSTANCE.getBottomCenter();
                                    Function3<SnackbarHostState, Composer, Integer, Unit> function37 = function36;
                                    BackdropScaffoldState backdropScaffoldState11 = backdropScaffoldState7;
                                    int i41 = i35;
                                    composer4.startReplaceableGroup(733328855);
                                    ComposerKt.sourceInformation(composer4, "C(Box)P(2,1,3)70@3267L67,71@3339L130:Box.kt#2w3rfo");
                                    MeasurePolicy rememberBoxMeasurePolicy = BoxKt.rememberBoxMeasurePolicy(bottomCenter, false, composer4, 6);
                                    composer4.startReplaceableGroup(-1323940314);
                                    ComposerKt.sourceInformation(composer4, "C(Layout)P(!1,2)74@2915L7,75@2970L7,76@3029L7,77@3041L460:Layout.kt#80mrfh");
                                    ProvidableCompositionLocal<Density> localDensity32222 = CompositionLocalsKt.getLocalDensity();
                                    ComposerKt.sourceInformationMarkerStart(composer4, 2023513938, "C:CompositionLocal.kt#9igjgp");
                                    Object consume32222 = composer4.consume(localDensity32222);
                                    ComposerKt.sourceInformationMarkerEnd(composer4);
                                    Density density = (Density) consume32222;
                                    ProvidableCompositionLocal<LayoutDirection> localLayoutDirection = CompositionLocalsKt.getLocalLayoutDirection();
                                    ComposerKt.sourceInformationMarkerStart(composer4, 2023513938, "C:CompositionLocal.kt#9igjgp");
                                    Object consume4 = composer4.consume(localLayoutDirection);
                                    ComposerKt.sourceInformationMarkerEnd(composer4);
                                    LayoutDirection layoutDirection = (LayoutDirection) consume4;
                                    ProvidableCompositionLocal<ViewConfiguration> localViewConfiguration = CompositionLocalsKt.getLocalViewConfiguration();
                                    ComposerKt.sourceInformationMarkerStart(composer4, 2023513938, "C:CompositionLocal.kt#9igjgp");
                                    Object consume5 = composer4.consume(localViewConfiguration);
                                    ComposerKt.sourceInformationMarkerEnd(composer4);
                                    ViewConfiguration viewConfiguration = (ViewConfiguration) consume5;
                                    Function0<ComposeUiNode> constructor = ComposeUiNode.INSTANCE.getConstructor();
                                    Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> materializerOf = LayoutKt.materializerOf(m424paddingqDBjuR0$default);
                                    if (!(composer4.getApplier() instanceof Applier)) {
                                        ComposablesKt.invalidApplier();
                                    }
                                    composer4.startReusableNode();
                                    if (composer4.getInserting()) {
                                        composer4.createNode(constructor);
                                    } else {
                                        composer4.useNode();
                                    }
                                    composer4.disableReusing();
                                    Composer m1283constructorimpl = Updater.m1283constructorimpl(composer4);
                                    Updater.m1290setimpl(m1283constructorimpl, rememberBoxMeasurePolicy, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
                                    Updater.m1290setimpl(m1283constructorimpl, density, ComposeUiNode.INSTANCE.getSetDensity());
                                    Updater.m1290setimpl(m1283constructorimpl, layoutDirection, ComposeUiNode.INSTANCE.getSetLayoutDirection());
                                    Updater.m1290setimpl(m1283constructorimpl, viewConfiguration, ComposeUiNode.INSTANCE.getSetViewConfiguration());
                                    composer4.enableReusing();
                                    materializerOf.invoke(SkippableUpdater.m1273boximpl(SkippableUpdater.m1274constructorimpl(composer4)), composer4, 0);
                                    composer4.startReplaceableGroup(2058660585);
                                    composer4.startReplaceableGroup(-2137368960);
                                    ComposerKt.sourceInformation(composer4, "C72@3384L9:Box.kt#2w3rfo");
                                    BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
                                    composer4.startReplaceableGroup(1815906203);
                                    ComposerKt.sourceInformation(composer4, "C375@16478L45:BackdropScaffold.kt#jmzs0o");
                                    function37.invoke(backdropScaffoldState11.getSnackbarHostState(), composer4, Integer.valueOf((i41 >> 18) & 112));
                                    composer4.endReplaceableGroup();
                                    composer4.endReplaceableGroup();
                                    composer4.endReplaceableGroup();
                                    composer4.endNode();
                                    composer4.endReplaceableGroup();
                                    composer4.endReplaceableGroup();
                                    return;
                                }
                                composer4.skipToGroupEnd();
                            }
                        }), composer3, 3120);
                        return;
                    }
                    composer3.skipToGroupEnd();
                }
            }), composer2, (i322222 & 7168) | (i322222 & 896) | 1572864, 51);
            modifier2 = modifier4;
            backdropScaffoldState2 = backdropScaffoldState62222;
            z9 = z6;
            z10 = z7;
            z11 = z8;
            shape5 = shape4;
            j17 = j13;
            j18 = j15;
            f8 = f5;
            j19 = j16;
            j20 = j14;
            j21 = j12;
            function34 = function33;
            f9 = f112222;
            f10 = f122222;
            endRestartGroup = composer2.endRestartGroup();
            if (endRestartGroup != null) {
            }
        }
        modifier2 = modifier;
        int i262 = 8192;
        if ((i & 57344) != 0) {
        }
        i5 = i3 & 32;
        if (i5 == 0) {
        }
        i6 = i3 & 64;
        if (i6 == 0) {
        }
        i7 = i3 & 128;
        if (i7 == 0) {
        }
        i8 = i7;
        i9 = i3 & 256;
        if (i9 != 0) {
        }
        i10 = i9;
        i11 = i3 & 512;
        if (i11 == 0) {
        }
        i12 = i11;
        if ((i2 & 14) == 0) {
        }
        if ((i2 & 112) == 0) {
        }
        if ((i2 & 896) == 0) {
        }
        i14 = i3 & 8192;
        if (i14 != 0) {
        }
        if ((i2 & 57344) == 0) {
        }
        if ((458752 & i2) == 0) {
        }
        if ((3670016 & i2) == 0) {
        }
        i15 = i3 & 131072;
        if (i15 == 0) {
        }
        int i2722222 = i13;
        if ((1533916891 & i4) == 306783378) {
        }
        startRestartGroup.startDefaults();
        if ((i & 1) != 0) {
        }
        if (i25 == 0) {
        }
        if ((i3 & 16) == 0) {
        }
        if (i5 == 0) {
        }
        if (i6 == 0) {
        }
        if (i17 == 0) {
        }
        if (i18 == 0) {
        }
        if (i19 == 0) {
        }
        if ((i3 & 1024) == 0) {
        }
        if ((i3 & 2048) == 0) {
        }
        int i2822222 = i20;
        if ((i3 & 4096) == 0) {
        }
        if (i16 == 0) {
        }
        Shape shape622222 = shape3;
        if ((i3 & 16384) == 0) {
        }
        if ((i3 & 32768) == 0) {
        }
        if ((i3 & 65536) == 0) {
        }
        if (i15 == 0) {
        }
        i23 = i21;
        f6 = m891getPeekHeightD9Ej5fM;
        f7 = m890getHeaderHeightD9Ej5fM;
        startRestartGroup.endDefaults();
        ProvidableCompositionLocal<Density> localDensity32222 = CompositionLocalsKt.getLocalDensity();
        ComposerKt.sourceInformationMarkerStart(startRestartGroup, 2023513938, "C:CompositionLocal.kt#9igjgp");
        Object consume32222 = startRestartGroup.consume(localDensity32222);
        ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
        final float mo315toPx0680j_432222 = ((Density) consume32222).mo315toPx0680j_4(f6);
        ProvidableCompositionLocal<Density> localDensity222222 = CompositionLocalsKt.getLocalDensity();
        ComposerKt.sourceInformationMarkerStart(startRestartGroup, 2023513938, "C:CompositionLocal.kt#9igjgp");
        Object consume222222 = startRestartGroup.consume(localDensity222222);
        ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
        final float mo315toPx0680j_4222222 = ((Density) consume222222).mo315toPx0680j_4(f7);
        final boolean z1522222 = z7;
        final BackdropScaffoldState backdropScaffoldState422222 = backdropScaffoldState3;
        final int i2922222 = i23;
        final Function2<? super Composer, ? super Integer, Unit> composableLambda22222 = ComposableLambdaKt.composableLambda(startRestartGroup, 1744778315, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material.BackdropScaffoldKt$BackdropScaffold$backLayer$1
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

            public final void invoke(Composer composer3, int i3022222) {
                ComposerKt.sourceInformation(composer3, "C:BackdropScaffold.kt#jmzs0o");
                if ((i3022222 & 11) != 2 || !composer3.getSkipping()) {
                    if (z1522222) {
                        composer3.startReplaceableGroup(-1017265331);
                        ComposerKt.sourceInformation(composer3, "280@12876L82");
                        Function2<Composer, Integer, Unit> function2 = appBar;
                        int i3122222 = i2922222;
                        Function2<Composer, Integer, Unit> function22 = backLayerContent;
                        composer3.startReplaceableGroup(-483455358);
                        ComposerKt.sourceInformation(composer3, "C(Column)P(2,3,1)77@3880L61,78@3946L133:Column.kt#2w3rfo");
                        Modifier.Companion companion2 = Modifier.INSTANCE;
                        MeasurePolicy columnMeasurePolicy = ColumnKt.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), Alignment.INSTANCE.getStart(), composer3, 0);
                        composer3.startReplaceableGroup(-1323940314);
                        ComposerKt.sourceInformation(composer3, "C(Layout)P(!1,2)74@2915L7,75@2970L7,76@3029L7,77@3041L460:Layout.kt#80mrfh");
                        ProvidableCompositionLocal<Density> localDensity322222 = CompositionLocalsKt.getLocalDensity();
                        ComposerKt.sourceInformationMarkerStart(composer3, 2023513938, "C:CompositionLocal.kt#9igjgp");
                        Object consume322222 = composer3.consume(localDensity322222);
                        ComposerKt.sourceInformationMarkerEnd(composer3);
                        Density density = (Density) consume322222;
                        ProvidableCompositionLocal<LayoutDirection> localLayoutDirection = CompositionLocalsKt.getLocalLayoutDirection();
                        ComposerKt.sourceInformationMarkerStart(composer3, 2023513938, "C:CompositionLocal.kt#9igjgp");
                        Object consume4 = composer3.consume(localLayoutDirection);
                        ComposerKt.sourceInformationMarkerEnd(composer3);
                        LayoutDirection layoutDirection = (LayoutDirection) consume4;
                        ProvidableCompositionLocal<ViewConfiguration> localViewConfiguration = CompositionLocalsKt.getLocalViewConfiguration();
                        ComposerKt.sourceInformationMarkerStart(composer3, 2023513938, "C:CompositionLocal.kt#9igjgp");
                        Object consume5 = composer3.consume(localViewConfiguration);
                        ComposerKt.sourceInformationMarkerEnd(composer3);
                        ViewConfiguration viewConfiguration = (ViewConfiguration) consume5;
                        Function0<ComposeUiNode> constructor = ComposeUiNode.INSTANCE.getConstructor();
                        Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> materializerOf = LayoutKt.materializerOf(companion2);
                        if (!(composer3.getApplier() instanceof Applier)) {
                            ComposablesKt.invalidApplier();
                        }
                        composer3.startReusableNode();
                        if (composer3.getInserting()) {
                            composer3.createNode(constructor);
                        } else {
                            composer3.useNode();
                        }
                        composer3.disableReusing();
                        Composer m1283constructorimpl = Updater.m1283constructorimpl(composer3);
                        Updater.m1290setimpl(m1283constructorimpl, columnMeasurePolicy, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
                        Updater.m1290setimpl(m1283constructorimpl, density, ComposeUiNode.INSTANCE.getSetDensity());
                        Updater.m1290setimpl(m1283constructorimpl, layoutDirection, ComposeUiNode.INSTANCE.getSetLayoutDirection());
                        Updater.m1290setimpl(m1283constructorimpl, viewConfiguration, ComposeUiNode.INSTANCE.getSetViewConfiguration());
                        composer3.enableReusing();
                        materializerOf.invoke(SkippableUpdater.m1273boximpl(SkippableUpdater.m1274constructorimpl(composer3)), composer3, 0);
                        composer3.startReplaceableGroup(2058660585);
                        composer3.startReplaceableGroup(-1163856341);
                        ComposerKt.sourceInformation(composer3, "C79@3994L9:Column.kt#2w3rfo");
                        ColumnScopeInstance columnScopeInstance = ColumnScopeInstance.INSTANCE;
                        composer3.startReplaceableGroup(-18835878);
                        ComposerKt.sourceInformation(composer3, "C281@12901L8,282@12926L18:BackdropScaffold.kt#jmzs0o");
                        function2.invoke(composer3, Integer.valueOf(i3122222 & 14));
                        function22.invoke(composer3, Integer.valueOf((i3122222 >> 3) & 14));
                        composer3.endReplaceableGroup();
                        composer3.endReplaceableGroup();
                        composer3.endReplaceableGroup();
                        composer3.endNode();
                        composer3.endReplaceableGroup();
                        composer3.endReplaceableGroup();
                        composer3.endReplaceableGroup();
                        return;
                    }
                    composer3.startReplaceableGroup(-1017265219);
                    ComposerKt.sourceInformation(composer3, "285@12988L72");
                    BackdropValue targetValue = backdropScaffoldState422222.getTargetValue();
                    Function2<Composer, Integer, Unit> function23 = appBar;
                    Function2<Composer, Integer, Unit> function24 = backLayerContent;
                    int i3222222 = i2922222;
                    BackdropScaffoldKt.BackLayerTransition(targetValue, function23, function24, composer3, ((i3222222 << 3) & 896) | ((i3222222 << 3) & 112));
                    composer3.endReplaceableGroup();
                    return;
                }
                composer3.skipToGroupEnd();
            }
        });
        Float valueOf22222 = Float.valueOf(mo315toPx0680j_4222222);
        startRestartGroup.startReplaceableGroup(1157296644);
        ComposerKt.sourceInformation(startRestartGroup, "C(remember)P(1):Composables.kt#9igjgp");
        changed = startRestartGroup.changed(valueOf22222);
        rememberedValue = startRestartGroup.rememberedValue();
        if (!changed) {
        }
        rememberedValue = (Function1) new Function1<Constraints, Constraints>() { // from class: androidx.compose.material.BackdropScaffoldKt$BackdropScaffold$calculateBackLayerConstraints$1$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Constraints invoke(Constraints constraints) {
                return Constraints.m3784boximpl(m900invokeZezNO4M(constraints.getValue()));
            }

            /* renamed from: invoke-ZezNO4M, reason: not valid java name */
            public final long m900invokeZezNO4M(long j2222222) {
                return ConstraintsKt.m3813offsetNN6EwU$default(Constraints.m3787copyZbe2FdA$default(j2222222, 0, 0, 0, 0, 10, null), 0, -MathKt.roundToInt(mo315toPx0680j_4222222), 1, null);
            }
        };
        startRestartGroup.updateRememberedValue(rememberedValue);
        startRestartGroup.endReplaceableGroup();
        final Function1<? super Constraints, Constraints> function122222 = (Function1) rememberedValue;
        final Modifier modifier522222 = modifier4;
        final boolean z1622222 = z8;
        final boolean z1722222 = z6;
        final float f1122222 = f7;
        final BackdropScaffoldState backdropScaffoldState522222 = backdropScaffoldState3;
        final float f1222222 = f6;
        BackdropScaffoldState backdropScaffoldState622222 = backdropScaffoldState3;
        composer2 = startRestartGroup;
        final int i3022222 = i23;
        final Shape shape722222 = shape4;
        final long j2222222 = j16;
        final long j2322222 = j14;
        final float f1322222 = f5;
        final int i3122222 = i22;
        final long j2422222 = j12;
        final Function3<? super SnackbarHostState, ? super Composer, ? super Integer, Unit> function3522222 = function33;
        int i3222222 = i22 << 6;
        SurfaceKt.m1172SurfaceFjzlyU(null, null, j13, j15, null, 0.0f, ComposableLambdaKt.composableLambda(composer2, -1049909631, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material.BackdropScaffoldKt$BackdropScaffold$1
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

            public final void invoke(Composer composer3, int i33) {
                ComposerKt.sourceInformation(composer3, "C297@13395L24,298@13428L3119:BackdropScaffold.kt#jmzs0o");
                if ((i33 & 11) != 2 || !composer3.getSkipping()) {
                    composer3.startReplaceableGroup(773894976);
                    ComposerKt.sourceInformation(composer3, "C(rememberCoroutineScope)475@19849L144:Effects.kt#9igjgp");
                    composer3.startReplaceableGroup(-492369756);
                    ComposerKt.sourceInformation(composer3, "C(remember):Composables.kt#9igjgp");
                    Object rememberedValue2 = composer3.rememberedValue();
                    if (rememberedValue2 == Composer.INSTANCE.getEmpty()) {
                        CompositionScopedCoroutineScopeCanceller compositionScopedCoroutineScopeCanceller = new CompositionScopedCoroutineScopeCanceller(EffectsKt.createCompositionCoroutineScope(EmptyCoroutineContext.INSTANCE, composer3));
                        composer3.updateRememberedValue(compositionScopedCoroutineScopeCanceller);
                        rememberedValue2 = compositionScopedCoroutineScopeCanceller;
                    }
                    composer3.endReplaceableGroup();
                    final CoroutineScope coroutineScope = ((CompositionScopedCoroutineScopeCanceller) rememberedValue2).getCoroutineScope();
                    composer3.endReplaceableGroup();
                    Modifier fillMaxSize$default = SizeKt.fillMaxSize$default(Modifier.this, 0.0f, 1, null);
                    Function2<Composer, Integer, Unit> function2 = composableLambda22222;
                    Function1<Constraints, Constraints> function1222222 = function122222;
                    final float f14 = mo315toPx0680j_4222222;
                    final boolean z18 = z1622222;
                    final boolean z19 = z1722222;
                    final BackdropScaffoldState backdropScaffoldState7 = backdropScaffoldState522222;
                    final float f15 = mo315toPx0680j_432222;
                    final int i34 = i3022222;
                    final Shape shape8 = shape722222;
                    final long j25 = j2222222;
                    final long j26 = j2322222;
                    final float f16 = f1322222;
                    final int i35 = i3122222;
                    final float f17 = f1122222;
                    final float f18 = f1222222;
                    final Function2<? super Composer, ? super Integer, Unit> function22 = frontLayerContent;
                    final long j27 = j2422222;
                    final Function3<? super SnackbarHostState, ? super Composer, ? super Integer, Unit> function36 = function3522222;
                    BackdropScaffoldKt.BackdropStack(fillMaxSize$default, function2, function1222222, ComposableLambdaKt.composableLambda(composer3, 1800047509, true, new Function4<Constraints, Float, Composer, Integer, Unit>() { // from class: androidx.compose.material.BackdropScaffoldKt$BackdropScaffold$1.1
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        /* JADX WARN: Multi-variable type inference failed */
                        {
                            super(4);
                        }

                        @Override // kotlin.jvm.functions.Function4
                        public /* bridge */ /* synthetic */ Unit invoke(Constraints constraints, Float f19, Composer composer4, Integer num) {
                            m898invokejYbf7pk(constraints.getValue(), f19.floatValue(), composer4, num.intValue());
                            return Unit.INSTANCE;
                        }

                        /* renamed from: invoke-jYbf7pk, reason: not valid java name */
                        public final void m898invokejYbf7pk(long j28, float f19, Composer composer4, int i36) {
                            int i37;
                            Modifier.Companion companion2;
                            Modifier m1182swipeablepPrIpRY;
                            float m3840constructorimpl;
                            ComposerKt.sourceInformation(composer4, "CP(1:c#ui.unit.Constraints)344@15194L57,342@15132L942,366@16117L420:BackdropScaffold.kt#jmzs0o");
                            if ((i36 & 14) == 0) {
                                i37 = i36 | (composer4.changed(j28) ? 4 : 2);
                            } else {
                                i37 = i36;
                            }
                            if ((i36 & 112) == 0) {
                                i37 |= composer4.changed(f19) ? 32 : 16;
                            }
                            if ((i37 & 731) != 146 || !composer4.getSkipping()) {
                                float m3795getMaxHeightimpl = Constraints.m3795getMaxHeightimpl(j28);
                                float f20 = m3795getMaxHeightimpl - f14;
                                if (z18) {
                                    f20 = Math.min(f20, f19);
                                }
                                float f21 = f20;
                                if (z19) {
                                    companion2 = NestedScrollModifierKt.nestedScroll$default(Modifier.INSTANCE, backdropScaffoldState7.getNestedScrollConnection(), null, 2, null);
                                } else {
                                    companion2 = Modifier.INSTANCE;
                                }
                                m1182swipeablepPrIpRY = SwipeableKt.m1182swipeablepPrIpRY(Modifier.INSTANCE.then(companion2), backdropScaffoldState7, r18, Orientation.Vertical, (r26 & 8) != 0 ? true : z19, (r26 & 16) != 0 ? false : false, (r26 & 32) != 0 ? null : null, (r26 & 64) != 0 ? new Function2<T, T, FixedThreshold>() { // from class: androidx.compose.material.SwipeableKt$swipeable$1
                                    /* JADX WARN: Can't rename method to resolve collision */
                                    @Override // kotlin.jvm.functions.Function2
                                    public final FixedThreshold invoke(T t, T t2) {
                                        return new FixedThreshold(Dp.m3840constructorimpl(56), null);
                                    }
                                } : null, (r26 & 128) != 0 ? SwipeableDefaults.resistanceConfig$default(SwipeableDefaults.INSTANCE, MapsKt.mapOf(TuplesKt.to(Float.valueOf(f15), BackdropValue.Concealed), TuplesKt.to(Float.valueOf(f21), BackdropValue.Revealed)).keySet(), 0.0f, 0.0f, 6, null) : null, (r26 & 256) != 0 ? SwipeableDefaults.INSTANCE.m1181getVelocityThresholdD9Ej5fM() : 0.0f);
                                final BackdropScaffoldState backdropScaffoldState8 = backdropScaffoldState7;
                                final CoroutineScope coroutineScope2 = coroutineScope;
                                Modifier semantics$default = SemanticsModifierKt.semantics$default(m1182swipeablepPrIpRY, false, new Function1<SemanticsPropertyReceiver, Unit>() { // from class: androidx.compose.material.BackdropScaffoldKt$BackdropScaffold$1$1$swipeable$1
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
                                        if (BackdropScaffoldState.this.isConcealed()) {
                                            final BackdropScaffoldState backdropScaffoldState9 = BackdropScaffoldState.this;
                                            final CoroutineScope coroutineScope3 = coroutineScope2;
                                            SemanticsPropertiesKt.collapse$default(semantics, null, new Function0<Boolean>() { // from class: androidx.compose.material.BackdropScaffoldKt$BackdropScaffold$1$1$swipeable$1.1
                                                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                                {
                                                    super(0);
                                                }

                                                /* JADX WARN: Can't rename method to resolve collision */
                                                @Override // kotlin.jvm.functions.Function0
                                                public final Boolean invoke() {
                                                    if (BackdropScaffoldState.this.getConfirmStateChange$material_release().invoke(BackdropValue.Revealed).booleanValue()) {
                                                        BuildersKt__Builders_commonKt.launch$default(coroutineScope3, null, null, new C00301(BackdropScaffoldState.this, null), 3, null);
                                                    }
                                                    return true;
                                                }

                                                /* compiled from: BackdropScaffold.kt */
                                                @Metadata(k = 3, mv = {1, 6, 0}, xi = 48)
                                                @DebugMetadata(c = "androidx.compose.material.BackdropScaffoldKt$BackdropScaffold$1$1$swipeable$1$1$1", f = "BackdropScaffold.kt", i = {}, l = {330}, m = "invokeSuspend", n = {}, s = {})
                                                /* renamed from: androidx.compose.material.BackdropScaffoldKt$BackdropScaffold$1$1$swipeable$1$1$1, reason: invalid class name and collision with other inner class name */
                                                static final class C00301 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
                                                    final /* synthetic */ BackdropScaffoldState $scaffoldState;
                                                    int label;

                                                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                                    C00301(BackdropScaffoldState backdropScaffoldState, Continuation<? super C00301> continuation) {
                                                        super(2, continuation);
                                                        this.$scaffoldState = backdropScaffoldState;
                                                    }

                                                    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                                                    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                                                        return new C00301(this.$scaffoldState, continuation);
                                                    }

                                                    @Override // kotlin.jvm.functions.Function2
                                                    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
                                                        return ((C00301) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
                                                    }

                                                    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                                                    public final Object invokeSuspend(Object obj) {
                                                        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                                                        int i = this.label;
                                                        if (i == 0) {
                                                            ResultKt.throwOnFailure(obj);
                                                            this.label = 1;
                                                            if (this.$scaffoldState.reveal(this) == coroutine_suspended) {
                                                                return coroutine_suspended;
                                                            }
                                                        } else {
                                                            if (i != 1) {
                                                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                                                            }
                                                            ResultKt.throwOnFailure(obj);
                                                        }
                                                        return Unit.INSTANCE;
                                                    }
                                                }
                                            }, 1, null);
                                        } else {
                                            final BackdropScaffoldState backdropScaffoldState10 = BackdropScaffoldState.this;
                                            final CoroutineScope coroutineScope4 = coroutineScope2;
                                            SemanticsPropertiesKt.expand$default(semantics, null, new Function0<Boolean>() { // from class: androidx.compose.material.BackdropScaffoldKt$BackdropScaffold$1$1$swipeable$1.2
                                                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                                {
                                                    super(0);
                                                }

                                                /* JADX WARN: Can't rename method to resolve collision */
                                                @Override // kotlin.jvm.functions.Function0
                                                public final Boolean invoke() {
                                                    if (BackdropScaffoldState.this.getConfirmStateChange$material_release().invoke(BackdropValue.Concealed).booleanValue()) {
                                                        BuildersKt__Builders_commonKt.launch$default(coroutineScope4, null, null, new AnonymousClass1(BackdropScaffoldState.this, null), 3, null);
                                                    }
                                                    return true;
                                                }

                                                /* compiled from: BackdropScaffold.kt */
                                                @Metadata(k = 3, mv = {1, 6, 0}, xi = 48)
                                                @DebugMetadata(c = "androidx.compose.material.BackdropScaffoldKt$BackdropScaffold$1$1$swipeable$1$2$1", f = "BackdropScaffold.kt", i = {}, l = {336}, m = "invokeSuspend", n = {}, s = {})
                                                /* renamed from: androidx.compose.material.BackdropScaffoldKt$BackdropScaffold$1$1$swipeable$1$2$1, reason: invalid class name */
                                                static final class AnonymousClass1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
                                                    final /* synthetic */ BackdropScaffoldState $scaffoldState;
                                                    int label;

                                                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                                    AnonymousClass1(BackdropScaffoldState backdropScaffoldState, Continuation<? super AnonymousClass1> continuation) {
                                                        super(2, continuation);
                                                        this.$scaffoldState = backdropScaffoldState;
                                                    }

                                                    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                                                    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                                                        return new AnonymousClass1(this.$scaffoldState, continuation);
                                                    }

                                                    @Override // kotlin.jvm.functions.Function2
                                                    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
                                                        return ((AnonymousClass1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
                                                    }

                                                    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                                                    public final Object invokeSuspend(Object obj) {
                                                        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                                                        int i = this.label;
                                                        if (i == 0) {
                                                            ResultKt.throwOnFailure(obj);
                                                            this.label = 1;
                                                            if (this.$scaffoldState.conceal(this) == coroutine_suspended) {
                                                                return coroutine_suspended;
                                                            }
                                                        } else {
                                                            if (i != 1) {
                                                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                                                            }
                                                            ResultKt.throwOnFailure(obj);
                                                        }
                                                        return Unit.INSTANCE;
                                                    }
                                                }
                                            }, 1, null);
                                        }
                                    }
                                }, 1, null);
                                Modifier.Companion companion3 = Modifier.INSTANCE;
                                final BackdropScaffoldState backdropScaffoldState9 = backdropScaffoldState7;
                                composer4.startReplaceableGroup(1157296644);
                                ComposerKt.sourceInformation(composer4, "C(remember)P(1):Composables.kt#9igjgp");
                                boolean changed2 = composer4.changed(backdropScaffoldState9);
                                Object rememberedValue3 = composer4.rememberedValue();
                                if (changed2 || rememberedValue3 == Composer.INSTANCE.getEmpty()) {
                                    rememberedValue3 = (Function1) new Function1<Density, IntOffset>() { // from class: androidx.compose.material.BackdropScaffoldKt$BackdropScaffold$1$1$1$1
                                        {
                                            super(1);
                                        }

                                        @Override // kotlin.jvm.functions.Function1
                                        public /* bridge */ /* synthetic */ IntOffset invoke(Density density) {
                                            return IntOffset.m3949boximpl(m899invokeBjo55l4(density));
                                        }

                                        /* renamed from: invoke-Bjo55l4, reason: not valid java name */
                                        public final long m899invokeBjo55l4(Density offset) {
                                            Intrinsics.checkNotNullParameter(offset, "$this$offset");
                                            return IntOffsetKt.IntOffset(0, MathKt.roundToInt(BackdropScaffoldState.this.getOffset().getValue().floatValue()));
                                        }
                                    };
                                    composer4.updateRememberedValue(rememberedValue3);
                                }
                                composer4.endReplaceableGroup();
                                Modifier then = OffsetKt.offset(companion3, (Function1) rememberedValue3).then(semantics$default);
                                Shape shape9 = shape8;
                                long j29 = j25;
                                long j30 = j26;
                                float f22 = f16;
                                final float f23 = f18;
                                final Function2<? super Composer, ? super Integer, Unit> function23 = function22;
                                final int i38 = i34;
                                final long j31 = j27;
                                final BackdropScaffoldState backdropScaffoldState10 = backdropScaffoldState7;
                                final int i39 = i35;
                                final boolean z20 = z19;
                                final CoroutineScope coroutineScope3 = coroutineScope;
                                ComposableLambda composableLambda222222 = ComposableLambdaKt.composableLambda(composer4, -1065299503, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material.BackdropScaffoldKt.BackdropScaffold.1.1.2
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

                                    public final void invoke(Composer composer5, int i40) {
                                        ComposerKt.sourceInformation(composer5, "C351@15517L543:BackdropScaffold.kt#jmzs0o");
                                        if ((i40 & 11) != 2 || !composer5.getSkipping()) {
                                            Modifier m424paddingqDBjuR0$default = PaddingKt.m424paddingqDBjuR0$default(Modifier.INSTANCE, 0.0f, 0.0f, 0.0f, f23, 7, null);
                                            Function2<Composer, Integer, Unit> function24 = function23;
                                            int i41 = i38;
                                            long j32 = j31;
                                            final BackdropScaffoldState backdropScaffoldState11 = backdropScaffoldState10;
                                            int i42 = i39;
                                            final boolean z21 = z20;
                                            final CoroutineScope coroutineScope4 = coroutineScope3;
                                            composer5.startReplaceableGroup(733328855);
                                            ComposerKt.sourceInformation(composer5, "C(Box)P(2,1,3)70@3267L67,71@3339L130:Box.kt#2w3rfo");
                                            MeasurePolicy rememberBoxMeasurePolicy = BoxKt.rememberBoxMeasurePolicy(Alignment.INSTANCE.getTopStart(), false, composer5, 0);
                                            composer5.startReplaceableGroup(-1323940314);
                                            ComposerKt.sourceInformation(composer5, "C(Layout)P(!1,2)74@2915L7,75@2970L7,76@3029L7,77@3041L460:Layout.kt#80mrfh");
                                            ProvidableCompositionLocal<Density> localDensity322222 = CompositionLocalsKt.getLocalDensity();
                                            ComposerKt.sourceInformationMarkerStart(composer5, 2023513938, "C:CompositionLocal.kt#9igjgp");
                                            Object consume322222 = composer5.consume(localDensity322222);
                                            ComposerKt.sourceInformationMarkerEnd(composer5);
                                            Density density = (Density) consume322222;
                                            ProvidableCompositionLocal<LayoutDirection> localLayoutDirection = CompositionLocalsKt.getLocalLayoutDirection();
                                            ComposerKt.sourceInformationMarkerStart(composer5, 2023513938, "C:CompositionLocal.kt#9igjgp");
                                            Object consume4 = composer5.consume(localLayoutDirection);
                                            ComposerKt.sourceInformationMarkerEnd(composer5);
                                            LayoutDirection layoutDirection = (LayoutDirection) consume4;
                                            ProvidableCompositionLocal<ViewConfiguration> localViewConfiguration = CompositionLocalsKt.getLocalViewConfiguration();
                                            ComposerKt.sourceInformationMarkerStart(composer5, 2023513938, "C:CompositionLocal.kt#9igjgp");
                                            Object consume5 = composer5.consume(localViewConfiguration);
                                            ComposerKt.sourceInformationMarkerEnd(composer5);
                                            ViewConfiguration viewConfiguration = (ViewConfiguration) consume5;
                                            Function0<ComposeUiNode> constructor = ComposeUiNode.INSTANCE.getConstructor();
                                            Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> materializerOf = LayoutKt.materializerOf(m424paddingqDBjuR0$default);
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
                                            Updater.m1290setimpl(m1283constructorimpl, rememberBoxMeasurePolicy, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
                                            Updater.m1290setimpl(m1283constructorimpl, density, ComposeUiNode.INSTANCE.getSetDensity());
                                            Updater.m1290setimpl(m1283constructorimpl, layoutDirection, ComposeUiNode.INSTANCE.getSetLayoutDirection());
                                            Updater.m1290setimpl(m1283constructorimpl, viewConfiguration, ComposeUiNode.INSTANCE.getSetViewConfiguration());
                                            composer5.enableReusing();
                                            materializerOf.invoke(SkippableUpdater.m1273boximpl(SkippableUpdater.m1274constructorimpl(composer5)), composer5, 0);
                                            composer5.startReplaceableGroup(2058660585);
                                            composer5.startReplaceableGroup(-2137368960);
                                            ComposerKt.sourceInformation(composer5, "C72@3384L9:Box.kt#2w3rfo");
                                            BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
                                            composer5.startReplaceableGroup(-1889954677);
                                            ComposerKt.sourceInformation(composer5, "C352@15582L19,353@15622L420:BackdropScaffold.kt#jmzs0o");
                                            function24.invoke(composer5, Integer.valueOf((i41 >> 6) & 14));
                                            BackdropScaffoldKt.m894Scrim3JVO9M(j32, new Function0<Unit>() { // from class: androidx.compose.material.BackdropScaffoldKt$BackdropScaffold$1$1$2$1$1
                                                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                                {
                                                    super(0);
                                                }

                                                @Override // kotlin.jvm.functions.Function0
                                                public /* bridge */ /* synthetic */ Unit invoke() {
                                                    invoke2();
                                                    return Unit.INSTANCE;
                                                }

                                                /* renamed from: invoke, reason: avoid collision after fix types in other method */
                                                public final void invoke2() {
                                                    if (z21 && backdropScaffoldState11.getConfirmStateChange$material_release().invoke(BackdropValue.Concealed).booleanValue()) {
                                                        BuildersKt__Builders_commonKt.launch$default(coroutineScope4, null, null, new AnonymousClass1(backdropScaffoldState11, null), 3, null);
                                                    }
                                                }

                                                /* compiled from: BackdropScaffold.kt */
                                                @Metadata(k = 3, mv = {1, 6, 0}, xi = 48)
                                                @DebugMetadata(c = "androidx.compose.material.BackdropScaffoldKt$BackdropScaffold$1$1$2$1$1$1", f = "BackdropScaffold.kt", i = {}, l = {358}, m = "invokeSuspend", n = {}, s = {})
                                                /* renamed from: androidx.compose.material.BackdropScaffoldKt$BackdropScaffold$1$1$2$1$1$1, reason: invalid class name */
                                                static final class AnonymousClass1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
                                                    final /* synthetic */ BackdropScaffoldState $scaffoldState;
                                                    int label;

                                                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                                    AnonymousClass1(BackdropScaffoldState backdropScaffoldState, Continuation<? super AnonymousClass1> continuation) {
                                                        super(2, continuation);
                                                        this.$scaffoldState = backdropScaffoldState;
                                                    }

                                                    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                                                    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                                                        return new AnonymousClass1(this.$scaffoldState, continuation);
                                                    }

                                                    @Override // kotlin.jvm.functions.Function2
                                                    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
                                                        return ((AnonymousClass1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
                                                    }

                                                    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                                                    public final Object invokeSuspend(Object obj) {
                                                        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                                                        int i = this.label;
                                                        if (i == 0) {
                                                            ResultKt.throwOnFailure(obj);
                                                            this.label = 1;
                                                            if (this.$scaffoldState.conceal(this) == coroutine_suspended) {
                                                                return coroutine_suspended;
                                                            }
                                                        } else {
                                                            if (i != 1) {
                                                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                                                            }
                                                            ResultKt.throwOnFailure(obj);
                                                        }
                                                        return Unit.INSTANCE;
                                                    }
                                                }
                                            }, backdropScaffoldState11.getTargetValue() == BackdropValue.Revealed, composer5, (i42 >> 18) & 14);
                                            composer5.endReplaceableGroup();
                                            composer5.endReplaceableGroup();
                                            composer5.endReplaceableGroup();
                                            composer5.endNode();
                                            composer5.endReplaceableGroup();
                                            composer5.endReplaceableGroup();
                                            return;
                                        }
                                        composer5.skipToGroupEnd();
                                    }
                                });
                                int i40 = i35;
                                SurfaceKt.m1172SurfaceFjzlyU(then, shape9, j29, j30, null, f22, composableLambda222222, composer4, ((i40 >> 3) & 112) | 1572864 | ((i40 >> 6) & 896) | ((i40 >> 6) & 7168) | ((i40 << 6) & 458752), 16);
                                Modifier.Companion companion4 = Modifier.INSTANCE;
                                if (backdropScaffoldState7.isRevealed() && f21 == m3795getMaxHeightimpl - f14) {
                                    m3840constructorimpl = f17;
                                } else {
                                    m3840constructorimpl = Dp.m3840constructorimpl(0);
                                }
                                Modifier m424paddingqDBjuR0$default = PaddingKt.m424paddingqDBjuR0$default(companion4, 0.0f, 0.0f, 0.0f, m3840constructorimpl, 7, null);
                                Alignment bottomCenter = Alignment.INSTANCE.getBottomCenter();
                                Function3<SnackbarHostState, Composer, Integer, Unit> function37 = function36;
                                BackdropScaffoldState backdropScaffoldState11 = backdropScaffoldState7;
                                int i41 = i35;
                                composer4.startReplaceableGroup(733328855);
                                ComposerKt.sourceInformation(composer4, "C(Box)P(2,1,3)70@3267L67,71@3339L130:Box.kt#2w3rfo");
                                MeasurePolicy rememberBoxMeasurePolicy = BoxKt.rememberBoxMeasurePolicy(bottomCenter, false, composer4, 6);
                                composer4.startReplaceableGroup(-1323940314);
                                ComposerKt.sourceInformation(composer4, "C(Layout)P(!1,2)74@2915L7,75@2970L7,76@3029L7,77@3041L460:Layout.kt#80mrfh");
                                ProvidableCompositionLocal<Density> localDensity322222 = CompositionLocalsKt.getLocalDensity();
                                ComposerKt.sourceInformationMarkerStart(composer4, 2023513938, "C:CompositionLocal.kt#9igjgp");
                                Object consume322222 = composer4.consume(localDensity322222);
                                ComposerKt.sourceInformationMarkerEnd(composer4);
                                Density density = (Density) consume322222;
                                ProvidableCompositionLocal<LayoutDirection> localLayoutDirection = CompositionLocalsKt.getLocalLayoutDirection();
                                ComposerKt.sourceInformationMarkerStart(composer4, 2023513938, "C:CompositionLocal.kt#9igjgp");
                                Object consume4 = composer4.consume(localLayoutDirection);
                                ComposerKt.sourceInformationMarkerEnd(composer4);
                                LayoutDirection layoutDirection = (LayoutDirection) consume4;
                                ProvidableCompositionLocal<ViewConfiguration> localViewConfiguration = CompositionLocalsKt.getLocalViewConfiguration();
                                ComposerKt.sourceInformationMarkerStart(composer4, 2023513938, "C:CompositionLocal.kt#9igjgp");
                                Object consume5 = composer4.consume(localViewConfiguration);
                                ComposerKt.sourceInformationMarkerEnd(composer4);
                                ViewConfiguration viewConfiguration = (ViewConfiguration) consume5;
                                Function0<ComposeUiNode> constructor = ComposeUiNode.INSTANCE.getConstructor();
                                Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> materializerOf = LayoutKt.materializerOf(m424paddingqDBjuR0$default);
                                if (!(composer4.getApplier() instanceof Applier)) {
                                    ComposablesKt.invalidApplier();
                                }
                                composer4.startReusableNode();
                                if (composer4.getInserting()) {
                                    composer4.createNode(constructor);
                                } else {
                                    composer4.useNode();
                                }
                                composer4.disableReusing();
                                Composer m1283constructorimpl = Updater.m1283constructorimpl(composer4);
                                Updater.m1290setimpl(m1283constructorimpl, rememberBoxMeasurePolicy, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
                                Updater.m1290setimpl(m1283constructorimpl, density, ComposeUiNode.INSTANCE.getSetDensity());
                                Updater.m1290setimpl(m1283constructorimpl, layoutDirection, ComposeUiNode.INSTANCE.getSetLayoutDirection());
                                Updater.m1290setimpl(m1283constructorimpl, viewConfiguration, ComposeUiNode.INSTANCE.getSetViewConfiguration());
                                composer4.enableReusing();
                                materializerOf.invoke(SkippableUpdater.m1273boximpl(SkippableUpdater.m1274constructorimpl(composer4)), composer4, 0);
                                composer4.startReplaceableGroup(2058660585);
                                composer4.startReplaceableGroup(-2137368960);
                                ComposerKt.sourceInformation(composer4, "C72@3384L9:Box.kt#2w3rfo");
                                BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
                                composer4.startReplaceableGroup(1815906203);
                                ComposerKt.sourceInformation(composer4, "C375@16478L45:BackdropScaffold.kt#jmzs0o");
                                function37.invoke(backdropScaffoldState11.getSnackbarHostState(), composer4, Integer.valueOf((i41 >> 18) & 112));
                                composer4.endReplaceableGroup();
                                composer4.endReplaceableGroup();
                                composer4.endReplaceableGroup();
                                composer4.endNode();
                                composer4.endReplaceableGroup();
                                composer4.endReplaceableGroup();
                                return;
                            }
                            composer4.skipToGroupEnd();
                        }
                    }), composer3, 3120);
                    return;
                }
                composer3.skipToGroupEnd();
            }
        }), composer2, (i3222222 & 7168) | (i3222222 & 896) | 1572864, 51);
        modifier2 = modifier4;
        backdropScaffoldState2 = backdropScaffoldState622222;
        z9 = z6;
        z10 = z7;
        z11 = z8;
        shape5 = shape4;
        j17 = j13;
        j18 = j15;
        f8 = f5;
        j19 = j16;
        j20 = j14;
        j21 = j12;
        function34 = function33;
        f9 = f1122222;
        f10 = f1222222;
        endRestartGroup = composer2.endRestartGroup();
        if (endRestartGroup != null) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: Scrim-3J-VO9M, reason: not valid java name */
    public static final void m894Scrim3JVO9M(final long j, final Function0<Unit> function0, final boolean z, Composer composer, final int i) {
        int i2;
        Modifier.Companion companion;
        Composer startRestartGroup = composer.startRestartGroup(-92141505);
        ComposerKt.sourceInformation(startRestartGroup, "C(Scrim)P(0:c#ui.graphics.Color)388@16708L121,401@17118L62,397@17009L171:BackdropScaffold.kt#jmzs0o");
        if ((i & 14) == 0) {
            i2 = (startRestartGroup.changed(j) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 112) == 0) {
            i2 |= startRestartGroup.changed(function0) ? 32 : 16;
        }
        if ((i & 896) == 0) {
            i2 |= startRestartGroup.changed(z) ? 256 : 128;
        }
        if ((i2 & 731) == 146 && startRestartGroup.getSkipping()) {
            startRestartGroup.skipToGroupEnd();
        } else if (j != Color.INSTANCE.m1664getUnspecified0d7_KjU()) {
            final State<Float> animateFloatAsState = AnimateAsStateKt.animateFloatAsState(z ? 1.0f : 0.0f, new TweenSpec(0, 0, null, 7, null), 0.0f, null, startRestartGroup, 0, 12);
            startRestartGroup.startReplaceableGroup(1010547004);
            ComposerKt.sourceInformation(startRestartGroup, "393@16915L37");
            if (z) {
                Modifier.Companion companion2 = Modifier.INSTANCE;
                Unit unit = Unit.INSTANCE;
                startRestartGroup.startReplaceableGroup(1157296644);
                ComposerKt.sourceInformation(startRestartGroup, "C(remember)P(1):Composables.kt#9igjgp");
                boolean changed = startRestartGroup.changed(function0);
                BackdropScaffoldKt$Scrim$dismissModifier$1$1 rememberedValue = startRestartGroup.rememberedValue();
                if (changed || rememberedValue == Composer.INSTANCE.getEmpty()) {
                    rememberedValue = new BackdropScaffoldKt$Scrim$dismissModifier$1$1(function0, null);
                    startRestartGroup.updateRememberedValue(rememberedValue);
                }
                startRestartGroup.endReplaceableGroup();
                companion = SuspendingPointerInputFilterKt.pointerInput(companion2, unit, (Function2<? super PointerInputScope, ? super Continuation<? super Unit>, ? extends Object>) rememberedValue);
            } else {
                companion = Modifier.INSTANCE;
            }
            startRestartGroup.endReplaceableGroup();
            Modifier then = SizeKt.fillMaxSize$default(Modifier.INSTANCE, 0.0f, 1, null).then(companion);
            Color m1618boximpl = Color.m1618boximpl(j);
            startRestartGroup.startReplaceableGroup(511388516);
            ComposerKt.sourceInformation(startRestartGroup, "C(remember)P(1,2):Composables.kt#9igjgp");
            boolean changed2 = startRestartGroup.changed(m1618boximpl) | startRestartGroup.changed(animateFloatAsState);
            Object rememberedValue2 = startRestartGroup.rememberedValue();
            if (changed2 || rememberedValue2 == Composer.INSTANCE.getEmpty()) {
                rememberedValue2 = (Function1) new Function1<DrawScope, Unit>() { // from class: androidx.compose.material.BackdropScaffoldKt$Scrim$1$1
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
                    public final void invoke2(DrawScope Canvas) {
                        float m895Scrim_3J_VO9M$lambda4;
                        Intrinsics.checkNotNullParameter(Canvas, "$this$Canvas");
                        long j2 = j;
                        m895Scrim_3J_VO9M$lambda4 = BackdropScaffoldKt.m895Scrim_3J_VO9M$lambda4(animateFloatAsState);
                        DrawScope.m2117drawRectnJ9OG0$default(Canvas, j2, 0L, 0L, m895Scrim_3J_VO9M$lambda4, null, null, 0, Sdk.SDKError.Reason.PROTOBUF_SERIALIZATION_ERROR_VALUE, null);
                    }
                };
                startRestartGroup.updateRememberedValue(rememberedValue2);
            }
            startRestartGroup.endReplaceableGroup();
            CanvasKt.Canvas(then, (Function1) rememberedValue2, startRestartGroup, 0);
        }
        ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup == null) {
            return;
        }
        endRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material.BackdropScaffoldKt$Scrim$2
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(2);
            }

            @Override // kotlin.jvm.functions.Function2
            public /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                invoke(composer2, num.intValue());
                return Unit.INSTANCE;
            }

            public final void invoke(Composer composer2, int i3) {
                BackdropScaffoldKt.m894Scrim3JVO9M(j, function0, z, composer2, i | 1);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void BackLayerTransition(final BackdropValue backdropValue, final Function2<? super Composer, ? super Integer, Unit> function2, Function2<? super Composer, ? super Integer, Unit> function22, Composer composer, final int i) {
        int i2;
        final Function2<? super Composer, ? super Integer, Unit> function23 = function22;
        Composer startRestartGroup = composer.startRestartGroup(-950970976);
        ComposerKt.sourceInformation(startRestartGroup, "C(BackLayerTransition)P(2)421@17840L112,*424@18002L7,429@18176L486:BackdropScaffold.kt#jmzs0o");
        if ((i & 14) == 0) {
            i2 = (startRestartGroup.changed(backdropValue) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 112) == 0) {
            i2 |= startRestartGroup.changed(function2) ? 32 : 16;
        }
        if ((i & 896) == 0) {
            i2 |= startRestartGroup.changed(function23) ? 256 : 128;
        }
        int i3 = i2;
        if ((i3 & 731) != 146 || !startRestartGroup.getSkipping()) {
            State<Float> animateFloatAsState = AnimateAsStateKt.animateFloatAsState(backdropValue == BackdropValue.Revealed ? 0.0f : 2.0f, new TweenSpec(0, 0, null, 7, null), 0.0f, null, startRestartGroup, 0, 12);
            ProvidableCompositionLocal<Density> localDensity = CompositionLocalsKt.getLocalDensity();
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, 2023513938, "C:CompositionLocal.kt#9igjgp");
            Object consume = startRestartGroup.consume(localDensity);
            ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
            float mo315toPx0680j_4 = ((Density) consume).mo315toPx0680j_4(AnimationSlideOffset);
            float f = 1;
            float coerceIn = RangesKt.coerceIn(m892BackLayerTransition$lambda7(animateFloatAsState) - f, 0.0f, 1.0f);
            float coerceIn2 = RangesKt.coerceIn(f - m892BackLayerTransition$lambda7(animateFloatAsState), 0.0f, 1.0f);
            startRestartGroup.startReplaceableGroup(733328855);
            ComposerKt.sourceInformation(startRestartGroup, "C(Box)P(2,1,3)70@3267L67,71@3339L130:Box.kt#2w3rfo");
            Modifier.Companion companion = Modifier.INSTANCE;
            MeasurePolicy rememberBoxMeasurePolicy = BoxKt.rememberBoxMeasurePolicy(Alignment.INSTANCE.getTopStart(), false, startRestartGroup, 0);
            startRestartGroup.startReplaceableGroup(-1323940314);
            ComposerKt.sourceInformation(startRestartGroup, "C(Layout)P(!1,2)74@2915L7,75@2970L7,76@3029L7,77@3041L460:Layout.kt#80mrfh");
            ProvidableCompositionLocal<Density> localDensity2 = CompositionLocalsKt.getLocalDensity();
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, 2023513938, "C:CompositionLocal.kt#9igjgp");
            Object consume2 = startRestartGroup.consume(localDensity2);
            ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
            Density density = (Density) consume2;
            ProvidableCompositionLocal<LayoutDirection> localLayoutDirection = CompositionLocalsKt.getLocalLayoutDirection();
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, 2023513938, "C:CompositionLocal.kt#9igjgp");
            Object consume3 = startRestartGroup.consume(localLayoutDirection);
            ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
            LayoutDirection layoutDirection = (LayoutDirection) consume3;
            ProvidableCompositionLocal<ViewConfiguration> localViewConfiguration = CompositionLocalsKt.getLocalViewConfiguration();
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, 2023513938, "C:CompositionLocal.kt#9igjgp");
            Object consume4 = startRestartGroup.consume(localViewConfiguration);
            ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
            ViewConfiguration viewConfiguration = (ViewConfiguration) consume4;
            Function0<ComposeUiNode> constructor = ComposeUiNode.INSTANCE.getConstructor();
            Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> materializerOf = LayoutKt.materializerOf(companion);
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
            startRestartGroup.startReplaceableGroup(2065804710);
            ComposerKt.sourceInformation(startRestartGroup, "C430@18190L226,438@18425L231:BackdropScaffold.kt#jmzs0o");
            Modifier m1765graphicsLayerpANQ8Wg$default = GraphicsLayerModifierKt.m1765graphicsLayerpANQ8Wg$default(ZIndexModifierKt.zIndex(Modifier.INSTANCE, coerceIn), 0.0f, 0.0f, coerceIn, 0.0f, (f - coerceIn) * mo315toPx0680j_4, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0L, null, false, null, 0L, 0L, 65515, null);
            startRestartGroup.startReplaceableGroup(733328855);
            ComposerKt.sourceInformation(startRestartGroup, "C(Box)P(2,1,3)70@3267L67,71@3339L130:Box.kt#2w3rfo");
            MeasurePolicy rememberBoxMeasurePolicy2 = BoxKt.rememberBoxMeasurePolicy(Alignment.INSTANCE.getTopStart(), false, startRestartGroup, 0);
            startRestartGroup.startReplaceableGroup(-1323940314);
            ComposerKt.sourceInformation(startRestartGroup, "C(Layout)P(!1,2)74@2915L7,75@2970L7,76@3029L7,77@3041L460:Layout.kt#80mrfh");
            ProvidableCompositionLocal<Density> localDensity3 = CompositionLocalsKt.getLocalDensity();
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, 2023513938, "C:CompositionLocal.kt#9igjgp");
            Object consume5 = startRestartGroup.consume(localDensity3);
            ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
            Density density2 = (Density) consume5;
            ProvidableCompositionLocal<LayoutDirection> localLayoutDirection2 = CompositionLocalsKt.getLocalLayoutDirection();
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, 2023513938, "C:CompositionLocal.kt#9igjgp");
            Object consume6 = startRestartGroup.consume(localLayoutDirection2);
            ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
            LayoutDirection layoutDirection2 = (LayoutDirection) consume6;
            ProvidableCompositionLocal<ViewConfiguration> localViewConfiguration2 = CompositionLocalsKt.getLocalViewConfiguration();
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, 2023513938, "C:CompositionLocal.kt#9igjgp");
            Object consume7 = startRestartGroup.consume(localViewConfiguration2);
            ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
            ViewConfiguration viewConfiguration2 = (ViewConfiguration) consume7;
            Function0<ComposeUiNode> constructor2 = ComposeUiNode.INSTANCE.getConstructor();
            Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> materializerOf2 = LayoutKt.materializerOf(m1765graphicsLayerpANQ8Wg$default);
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
            Updater.m1290setimpl(m1283constructorimpl2, rememberBoxMeasurePolicy2, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
            Updater.m1290setimpl(m1283constructorimpl2, density2, ComposeUiNode.INSTANCE.getSetDensity());
            Updater.m1290setimpl(m1283constructorimpl2, layoutDirection2, ComposeUiNode.INSTANCE.getSetLayoutDirection());
            Updater.m1290setimpl(m1283constructorimpl2, viewConfiguration2, ComposeUiNode.INSTANCE.getSetViewConfiguration());
            startRestartGroup.enableReusing();
            materializerOf2.invoke(SkippableUpdater.m1273boximpl(SkippableUpdater.m1274constructorimpl(startRestartGroup)), startRestartGroup, 0);
            startRestartGroup.startReplaceableGroup(2058660585);
            startRestartGroup.startReplaceableGroup(-2137368960);
            ComposerKt.sourceInformation(startRestartGroup, "C72@3384L9:Box.kt#2w3rfo");
            BoxScopeInstance boxScopeInstance2 = BoxScopeInstance.INSTANCE;
            startRestartGroup.startReplaceableGroup(-1057690836);
            ComposerKt.sourceInformation(startRestartGroup, "C436@18398L8:BackdropScaffold.kt#jmzs0o");
            function2.invoke(startRestartGroup, Integer.valueOf((i3 >> 3) & 14));
            startRestartGroup.endReplaceableGroup();
            startRestartGroup.endReplaceableGroup();
            startRestartGroup.endReplaceableGroup();
            startRestartGroup.endNode();
            startRestartGroup.endReplaceableGroup();
            startRestartGroup.endReplaceableGroup();
            Modifier m1765graphicsLayerpANQ8Wg$default2 = GraphicsLayerModifierKt.m1765graphicsLayerpANQ8Wg$default(ZIndexModifierKt.zIndex(Modifier.INSTANCE, coerceIn2), 0.0f, 0.0f, coerceIn2, 0.0f, (f - coerceIn2) * (-mo315toPx0680j_4), 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0L, null, false, null, 0L, 0L, 65515, null);
            startRestartGroup.startReplaceableGroup(733328855);
            ComposerKt.sourceInformation(startRestartGroup, "C(Box)P(2,1,3)70@3267L67,71@3339L130:Box.kt#2w3rfo");
            MeasurePolicy rememberBoxMeasurePolicy3 = BoxKt.rememberBoxMeasurePolicy(Alignment.INSTANCE.getTopStart(), false, startRestartGroup, 0);
            startRestartGroup.startReplaceableGroup(-1323940314);
            ComposerKt.sourceInformation(startRestartGroup, "C(Layout)P(!1,2)74@2915L7,75@2970L7,76@3029L7,77@3041L460:Layout.kt#80mrfh");
            ProvidableCompositionLocal<Density> localDensity4 = CompositionLocalsKt.getLocalDensity();
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, 2023513938, "C:CompositionLocal.kt#9igjgp");
            Object consume8 = startRestartGroup.consume(localDensity4);
            ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
            Density density3 = (Density) consume8;
            ProvidableCompositionLocal<LayoutDirection> localLayoutDirection3 = CompositionLocalsKt.getLocalLayoutDirection();
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, 2023513938, "C:CompositionLocal.kt#9igjgp");
            Object consume9 = startRestartGroup.consume(localLayoutDirection3);
            ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
            LayoutDirection layoutDirection3 = (LayoutDirection) consume9;
            ProvidableCompositionLocal<ViewConfiguration> localViewConfiguration3 = CompositionLocalsKt.getLocalViewConfiguration();
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, 2023513938, "C:CompositionLocal.kt#9igjgp");
            Object consume10 = startRestartGroup.consume(localViewConfiguration3);
            ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
            ViewConfiguration viewConfiguration3 = (ViewConfiguration) consume10;
            Function0<ComposeUiNode> constructor3 = ComposeUiNode.INSTANCE.getConstructor();
            Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> materializerOf3 = LayoutKt.materializerOf(m1765graphicsLayerpANQ8Wg$default2);
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
            Updater.m1290setimpl(m1283constructorimpl3, rememberBoxMeasurePolicy3, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
            Updater.m1290setimpl(m1283constructorimpl3, density3, ComposeUiNode.INSTANCE.getSetDensity());
            Updater.m1290setimpl(m1283constructorimpl3, layoutDirection3, ComposeUiNode.INSTANCE.getSetLayoutDirection());
            Updater.m1290setimpl(m1283constructorimpl3, viewConfiguration3, ComposeUiNode.INSTANCE.getSetViewConfiguration());
            startRestartGroup.enableReusing();
            materializerOf3.invoke(SkippableUpdater.m1273boximpl(SkippableUpdater.m1274constructorimpl(startRestartGroup)), startRestartGroup, 0);
            startRestartGroup.startReplaceableGroup(2058660585);
            startRestartGroup.startReplaceableGroup(-2137368960);
            ComposerKt.sourceInformation(startRestartGroup, "C72@3384L9:Box.kt#2w3rfo");
            BoxScopeInstance boxScopeInstance3 = BoxScopeInstance.INSTANCE;
            startRestartGroup.startReplaceableGroup(-676544093);
            ComposerKt.sourceInformation(startRestartGroup, "C444@18637L9:BackdropScaffold.kt#jmzs0o");
            function23 = function22;
            function23.invoke(startRestartGroup, Integer.valueOf((i3 >> 6) & 14));
            startRestartGroup.endReplaceableGroup();
            startRestartGroup.endReplaceableGroup();
            startRestartGroup.endReplaceableGroup();
            startRestartGroup.endNode();
            startRestartGroup.endReplaceableGroup();
            startRestartGroup.endReplaceableGroup();
            startRestartGroup.endReplaceableGroup();
            startRestartGroup.endReplaceableGroup();
            startRestartGroup.endReplaceableGroup();
            startRestartGroup.endNode();
            startRestartGroup.endReplaceableGroup();
            startRestartGroup.endReplaceableGroup();
        } else {
            startRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup == null) {
            return;
        }
        endRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material.BackdropScaffoldKt$BackLayerTransition$2
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
                BackdropScaffoldKt.BackLayerTransition(BackdropValue.this, function2, function23, composer2, i | 1);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void BackdropStack(final Modifier modifier, final Function2<? super Composer, ? super Integer, Unit> function2, final Function1<? super Constraints, Constraints> function1, final Function4<? super Constraints, ? super Float, ? super Composer, ? super Integer, Unit> function4, Composer composer, final int i) {
        final int i2;
        Composer startRestartGroup = composer.startRestartGroup(-1248995194);
        ComposerKt.sourceInformation(startRestartGroup, "C(BackdropStack)P(3)457@18967L890,457@18940L917:BackdropScaffold.kt#jmzs0o");
        if ((i & 14) == 0) {
            i2 = (startRestartGroup.changed(modifier) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 112) == 0) {
            i2 |= startRestartGroup.changed(function2) ? 32 : 16;
        }
        if ((i & 896) == 0) {
            i2 |= startRestartGroup.changed(function1) ? 256 : 128;
        }
        if ((i & 7168) == 0) {
            i2 |= startRestartGroup.changed(function4) ? 2048 : 1024;
        }
        if ((i2 & 5851) != 1170 || !startRestartGroup.getSkipping()) {
            startRestartGroup.startReplaceableGroup(1618982084);
            ComposerKt.sourceInformation(startRestartGroup, "C(remember)P(1,2,3):Composables.kt#9igjgp");
            boolean changed = startRestartGroup.changed(function2) | startRestartGroup.changed(function1) | startRestartGroup.changed(function4);
            Object rememberedValue = startRestartGroup.rememberedValue();
            if (changed || rememberedValue == Composer.INSTANCE.getEmpty()) {
                rememberedValue = (Function2) new Function2<SubcomposeMeasureScope, Constraints, MeasureResult>() { // from class: androidx.compose.material.BackdropScaffoldKt$BackdropStack$1$1
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    /* JADX WARN: Multi-variable type inference failed */
                    {
                        super(2);
                    }

                    @Override // kotlin.jvm.functions.Function2
                    public /* bridge */ /* synthetic */ MeasureResult invoke(SubcomposeMeasureScope subcomposeMeasureScope, Constraints constraints) {
                        return m901invoke0kLqBqw(subcomposeMeasureScope, constraints.getValue());
                    }

                    /* renamed from: invoke-0kLqBqw, reason: not valid java name */
                    public final MeasureResult m901invoke0kLqBqw(SubcomposeMeasureScope SubcomposeLayout, final long j) {
                        Intrinsics.checkNotNullParameter(SubcomposeLayout, "$this$SubcomposeLayout");
                        final Placeable mo3121measureBRTryo0 = ((Measurable) CollectionsKt.first((List) SubcomposeLayout.subcompose(BackdropLayers.Back, function2))).mo3121measureBRTryo0(function1.invoke(Constraints.m3784boximpl(j)).getValue());
                        final float height = mo3121measureBRTryo0.getHeight();
                        BackdropLayers backdropLayers = BackdropLayers.Front;
                        final Function4<Constraints, Float, Composer, Integer, Unit> function42 = function4;
                        final int i3 = i2;
                        List<Measurable> subcompose = SubcomposeLayout.subcompose(backdropLayers, ComposableLambdaKt.composableLambdaInstance(-1222642649, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material.BackdropScaffoldKt$BackdropStack$1$1$placeables$1
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
                                ComposerKt.sourceInformation(composer2, "C466@19305L40:BackdropScaffold.kt#jmzs0o");
                                if ((i4 & 11) == 2 && composer2.getSkipping()) {
                                    composer2.skipToGroupEnd();
                                } else {
                                    function42.invoke(Constraints.m3784boximpl(j), Float.valueOf(height), composer2, Integer.valueOf((i3 >> 3) & 896));
                                }
                            }
                        }));
                        ArrayList arrayList = new ArrayList(subcompose.size());
                        int size = subcompose.size();
                        for (int i4 = 0; i4 < size; i4++) {
                            arrayList.add(subcompose.get(i4).mo3121measureBRTryo0(j));
                        }
                        final ArrayList arrayList2 = arrayList;
                        int max = Math.max(Constraints.m3798getMinWidthimpl(j), mo3121measureBRTryo0.getWidth());
                        int max2 = Math.max(Constraints.m3797getMinHeightimpl(j), mo3121measureBRTryo0.getHeight());
                        int size2 = arrayList2.size();
                        int i5 = max2;
                        int i6 = max;
                        for (int i7 = 0; i7 < size2; i7++) {
                            Placeable placeable = (Placeable) arrayList2.get(i7);
                            i6 = Math.max(i6, placeable.getWidth());
                            i5 = Math.max(i5, placeable.getHeight());
                        }
                        return MeasureScope.layout$default(SubcomposeLayout, i6, i5, null, new Function1<Placeable.PlacementScope, Unit>() { // from class: androidx.compose.material.BackdropScaffoldKt$BackdropStack$1$1.2
                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            /* JADX WARN: Multi-variable type inference failed */
                            {
                                super(1);
                            }

                            @Override // kotlin.jvm.functions.Function1
                            public /* bridge */ /* synthetic */ Unit invoke(Placeable.PlacementScope placementScope) {
                                invoke2(placementScope);
                                return Unit.INSTANCE;
                            }

                            /* renamed from: invoke, reason: avoid collision after fix types in other method */
                            public final void invoke2(Placeable.PlacementScope layout) {
                                Intrinsics.checkNotNullParameter(layout, "$this$layout");
                                Placeable.PlacementScope.placeRelative$default(layout, Placeable.this, 0, 0, 0.0f, 4, null);
                                List<Placeable> list = arrayList2;
                                int size3 = list.size();
                                for (int i8 = 0; i8 < size3; i8++) {
                                    Placeable.PlacementScope.placeRelative$default(layout, list.get(i8), 0, 0, 0.0f, 4, null);
                                }
                            }
                        }, 4, null);
                    }
                };
                startRestartGroup.updateRememberedValue(rememberedValue);
            }
            startRestartGroup.endReplaceableGroup();
            SubcomposeLayoutKt.SubcomposeLayout(modifier, (Function2) rememberedValue, startRestartGroup, i2 & 14, 0);
        } else {
            startRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup == null) {
            return;
        }
        endRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material.BackdropScaffoldKt$BackdropStack$2
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

            public final void invoke(Composer composer2, int i3) {
                BackdropScaffoldKt.BackdropStack(Modifier.this, function2, function1, function4, composer2, i | 1);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: Scrim_3J_VO9M$lambda-4, reason: not valid java name */
    public static final float m895Scrim_3J_VO9M$lambda4(State<Float> state) {
        return state.getValue().floatValue();
    }

    /* renamed from: BackLayerTransition$lambda-7, reason: not valid java name */
    private static final float m892BackLayerTransition$lambda7(State<Float> state) {
        return state.getValue().floatValue();
    }
}
