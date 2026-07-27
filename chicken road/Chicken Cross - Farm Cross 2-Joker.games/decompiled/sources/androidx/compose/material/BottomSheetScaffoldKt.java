package androidx.compose.material;

import androidx.compose.animation.core.AnimationSpec;
import androidx.compose.foundation.gestures.Orientation;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.ColumnKt;
import androidx.compose.foundation.layout.ColumnScope;
import androidx.compose.foundation.layout.ColumnScopeInstance;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.PaddingValues;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.shape.CornerBasedShape;
import androidx.compose.runtime.Applier;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionScopedCoroutineScopeCanceller;
import androidx.compose.runtime.EffectsKt;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.ProvidableCompositionLocal;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.SkippableUpdater;
import androidx.compose.runtime.SnapshotStateKt__SnapshotStateKt;
import androidx.compose.runtime.State;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambda;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.runtime.saveable.RememberSaveableKt;
import androidx.compose.runtime.saveable.Saver;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.Shape;
import androidx.compose.ui.input.nestedscroll.NestedScrollModifierKt;
import androidx.compose.ui.layout.LayoutKt;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.layout.MeasureResult;
import androidx.compose.ui.layout.MeasureScope;
import androidx.compose.ui.layout.OnRemeasuredModifierKt;
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
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.Dp;
import androidx.compose.ui.unit.IntSize;
import androidx.compose.ui.unit.LayoutDirection;
import androidx.core.view.accessibility.AccessibilityEventCompat;
import androidx.profileinstaller.ProfileVerifier;
import com.google.android.exoplayer2.C;
import com.vungle.ads.internal.protos.Sdk;
import java.util.Map;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.ResultKt;
import kotlin.TuplesKt;
import kotlin.Unit;
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
import kotlin.jvm.internal.Intrinsics;
import kotlin.math.MathKt;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;

/* compiled from: BottomSheetScaffold.kt */
@Metadata(d1 = {"\u0000\u0098\u0001\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u001aá\u0002\u0010\u0003\u001a\u00020\u00042\u001c\u0010\u0005\u001a\u0018\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u00040\u0006¢\u0006\u0002\b\b¢\u0006\u0002\b\t2\b\b\u0002\u0010\n\u001a\u00020\u000b2\b\b\u0002\u0010\f\u001a\u00020\r2\u0015\b\u0002\u0010\u000e\u001a\u000f\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u000f¢\u0006\u0002\b\b2\u0019\b\u0002\u0010\u0010\u001a\u0013\u0012\u0004\u0012\u00020\u0011\u0012\u0004\u0012\u00020\u00040\u0006¢\u0006\u0002\b\b2\u0015\b\u0002\u0010\u0012\u001a\u000f\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u000f¢\u0006\u0002\b\b2\b\b\u0002\u0010\u0013\u001a\u00020\u00142\b\b\u0002\u0010\u0015\u001a\u00020\u00162\b\b\u0002\u0010\u0017\u001a\u00020\u00182\b\b\u0002\u0010\u0019\u001a\u00020\u00012\b\b\u0002\u0010\u001a\u001a\u00020\u001b2\b\b\u0002\u0010\u001c\u001a\u00020\u001b2\b\b\u0002\u0010\u001d\u001a\u00020\u00012 \b\u0002\u0010\u001e\u001a\u001a\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0006¢\u0006\u0002\b\b¢\u0006\u0002\b\t2\b\b\u0002\u0010\u001f\u001a\u00020\u00162\b\b\u0002\u0010 \u001a\u00020\u00182\b\b\u0002\u0010!\u001a\u00020\u00012\b\b\u0002\u0010\"\u001a\u00020\u001b2\b\b\u0002\u0010#\u001a\u00020\u001b2\b\b\u0002\u0010$\u001a\u00020\u001b2\b\b\u0002\u0010%\u001a\u00020\u001b2\b\b\u0002\u0010&\u001a\u00020\u001b2\u0017\u0010'\u001a\u0013\u0012\u0004\u0012\u00020(\u0012\u0004\u0012\u00020\u00040\u0006¢\u0006\u0002\b\bH\u0007ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b)\u0010*\u001aÈ\u0001\u0010+\u001a\u00020\u00042\u0013\u0010\u000e\u001a\u000f\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u000f¢\u0006\u0002\b\b2&\u0010,\u001a\"\u0012\u0013\u0012\u00110(¢\u0006\f\b-\u0012\b\b.\u0012\u0004\b\b(/\u0012\u0004\u0012\u00020\u00040\u0006¢\u0006\u0002\b\b2&\u00100\u001a\"\u0012\u0013\u0012\u001101¢\u0006\f\b-\u0012\b\b.\u0012\u0004\b\b(2\u0012\u0004\u0012\u00020\u00040\u0006¢\u0006\u0002\b\b2\u0013\u0010\u0012\u001a\u000f\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u000f¢\u0006\u0002\b\b2\u0011\u0010\u0010\u001a\r\u0012\u0004\u0012\u00020\u00040\u000f¢\u0006\u0002\b\b2\u0006\u0010\u001d\u001a\u00020\u00012\u0006\u0010\u0013\u001a\u00020\u00142\f\u00103\u001a\b\u0012\u0004\u0012\u000205042\u0006\u00106\u001a\u000207H\u0003ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b8\u00109\u001a+\u0010:\u001a\u00020\r2\b\b\u0002\u0010;\u001a\u00020<2\b\b\u0002\u0010=\u001a\u0002072\b\b\u0002\u0010>\u001a\u00020\u0011H\u0007¢\u0006\u0002\u0010?\u001a;\u0010@\u001a\u0002072\u0006\u0010A\u001a\u00020B2\u000e\b\u0002\u0010C\u001a\b\u0012\u0004\u0012\u0002050D2\u0014\b\u0002\u0010E\u001a\u000e\u0012\u0004\u0012\u00020B\u0012\u0004\u0012\u00020\u00160\u0006H\u0007¢\u0006\u0002\u0010F\"\u0013\u0010\u0000\u001a\u00020\u0001X\u0082\u0004ø\u0001\u0000¢\u0006\u0004\n\u0002\u0010\u0002\u0082\u0002\u000b\n\u0002\b\u0019\n\u0005\b¡\u001e0\u0001¨\u0006G"}, d2 = {"FabSpacing", "Landroidx/compose/ui/unit/Dp;", "F", "BottomSheetScaffold", "", "sheetContent", "Lkotlin/Function1;", "Landroidx/compose/foundation/layout/ColumnScope;", "Landroidx/compose/runtime/Composable;", "Lkotlin/ExtensionFunctionType;", "modifier", "Landroidx/compose/ui/Modifier;", "scaffoldState", "Landroidx/compose/material/BottomSheetScaffoldState;", "topBar", "Lkotlin/Function0;", "snackbarHost", "Landroidx/compose/material/SnackbarHostState;", "floatingActionButton", "floatingActionButtonPosition", "Landroidx/compose/material/FabPosition;", "sheetGesturesEnabled", "", "sheetShape", "Landroidx/compose/ui/graphics/Shape;", "sheetElevation", "sheetBackgroundColor", "Landroidx/compose/ui/graphics/Color;", "sheetContentColor", "sheetPeekHeight", "drawerContent", "drawerGesturesEnabled", "drawerShape", "drawerElevation", "drawerBackgroundColor", "drawerContentColor", "drawerScrimColor", "backgroundColor", "contentColor", "content", "Landroidx/compose/foundation/layout/PaddingValues;", "BottomSheetScaffold-bGncdBI", "(Lkotlin/jvm/functions/Function3;Landroidx/compose/ui/Modifier;Landroidx/compose/material/BottomSheetScaffoldState;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function3;Lkotlin/jvm/functions/Function2;IZLandroidx/compose/ui/graphics/Shape;FJJFLkotlin/jvm/functions/Function3;ZLandroidx/compose/ui/graphics/Shape;FJJJJJLkotlin/jvm/functions/Function3;Landroidx/compose/runtime/Composer;IIII)V", "BottomSheetScaffoldLayout", "body", "Lkotlin/ParameterName;", "name", "innerPadding", "bottomSheet", "", "layoutHeight", "sheetOffset", "Landroidx/compose/runtime/State;", "", "sheetState", "Landroidx/compose/material/BottomSheetState;", "BottomSheetScaffoldLayout-KCBPh4w", "(Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function3;Lkotlin/jvm/functions/Function3;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;FILandroidx/compose/runtime/State;Landroidx/compose/material/BottomSheetState;Landroidx/compose/runtime/Composer;I)V", "rememberBottomSheetScaffoldState", "drawerState", "Landroidx/compose/material/DrawerState;", "bottomSheetState", "snackbarHostState", "(Landroidx/compose/material/DrawerState;Landroidx/compose/material/BottomSheetState;Landroidx/compose/material/SnackbarHostState;Landroidx/compose/runtime/Composer;II)Landroidx/compose/material/BottomSheetScaffoldState;", "rememberBottomSheetState", "initialValue", "Landroidx/compose/material/BottomSheetValue;", "animationSpec", "Landroidx/compose/animation/core/AnimationSpec;", "confirmStateChange", "(Landroidx/compose/material/BottomSheetValue;Landroidx/compose/animation/core/AnimationSpec;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)Landroidx/compose/material/BottomSheetState;", "material_release"}, k = 2, mv = {1, 6, 0}, xi = 48)
/* loaded from: classes.dex */
public final class BottomSheetScaffoldKt {
    private static final float FabSpacing = Dp.m3840constructorimpl(16);

    @ExperimentalMaterialApi
    public static final BottomSheetState rememberBottomSheetState(final BottomSheetValue initialValue, final AnimationSpec<Float> animationSpec, final Function1<? super BottomSheetValue, Boolean> function1, Composer composer, int i, int i2) {
        Intrinsics.checkNotNullParameter(initialValue, "initialValue");
        composer.startReplaceableGroup(1808153344);
        ComposerKt.sourceInformation(composer, "C(rememberBottomSheetState)P(2)163@5857L371:BottomSheetScaffold.kt#jmzs0o");
        if ((i2 & 2) != 0) {
            animationSpec = SwipeableDefaults.INSTANCE.getAnimationSpec();
        }
        if ((i2 & 4) != 0) {
            function1 = new Function1<BottomSheetValue, Boolean>() { // from class: androidx.compose.material.BottomSheetScaffoldKt$rememberBottomSheetState$1
                @Override // kotlin.jvm.functions.Function1
                public final Boolean invoke(BottomSheetValue it) {
                    Intrinsics.checkNotNullParameter(it, "it");
                    return true;
                }
            };
        }
        BottomSheetState bottomSheetState = (BottomSheetState) RememberSaveableKt.m1296rememberSaveable(new Object[]{animationSpec}, (Saver) BottomSheetState.INSTANCE.Saver(animationSpec, function1), (String) null, (Function0) new Function0<BottomSheetState>() { // from class: androidx.compose.material.BottomSheetScaffoldKt$rememberBottomSheetState$2
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            {
                super(0);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // kotlin.jvm.functions.Function0
            public final BottomSheetState invoke() {
                return new BottomSheetState(BottomSheetValue.this, animationSpec, function1);
            }
        }, composer, 72, 4);
        composer.endReplaceableGroup();
        return bottomSheetState;
    }

    @ExperimentalMaterialApi
    public static final BottomSheetScaffoldState rememberBottomSheetScaffoldState(DrawerState drawerState, BottomSheetState bottomSheetState, SnackbarHostState snackbarHostState, Composer composer, int i, int i2) {
        composer.startReplaceableGroup(-1353009744);
        ComposerKt.sourceInformation(composer, "C(rememberBottomSheetScaffoldState)P(1)203@7102L39,204@7184L35,205@7264L32,207@7338L248:BottomSheetScaffold.kt#jmzs0o");
        if ((i2 & 1) != 0) {
            drawerState = DrawerKt.rememberDrawerState(DrawerValue.Closed, null, composer, 6, 2);
        }
        if ((i2 & 2) != 0) {
            bottomSheetState = rememberBottomSheetState(BottomSheetValue.Collapsed, null, null, composer, 6, 6);
        }
        if ((i2 & 4) != 0) {
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
        composer.startReplaceableGroup(1618982084);
        ComposerKt.sourceInformation(composer, "C(remember)P(1,2,3):Composables.kt#9igjgp");
        boolean changed = composer.changed(drawerState) | composer.changed(bottomSheetState) | composer.changed(snackbarHostState);
        Object rememberedValue2 = composer.rememberedValue();
        if (changed || rememberedValue2 == Composer.INSTANCE.getEmpty()) {
            rememberedValue2 = new BottomSheetScaffoldState(drawerState, bottomSheetState, snackbarHostState);
            composer.updateRememberedValue(rememberedValue2);
        }
        composer.endReplaceableGroup();
        BottomSheetScaffoldState bottomSheetScaffoldState = (BottomSheetScaffoldState) rememberedValue2;
        composer.endReplaceableGroup();
        return bottomSheetScaffoldState;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:102:0x0273  */
    /* JADX WARN: Removed duplicated region for block: B:10:0x005e  */
    /* JADX WARN: Removed duplicated region for block: B:110:0x028f  */
    /* JADX WARN: Removed duplicated region for block: B:118:0x02a7  */
    /* JADX WARN: Removed duplicated region for block: B:126:0x02c5  */
    /* JADX WARN: Removed duplicated region for block: B:129:0x02e0  */
    /* JADX WARN: Removed duplicated region for block: B:138:0x06ac  */
    /* JADX WARN: Removed duplicated region for block: B:141:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:144:0x0330  */
    /* JADX WARN: Removed duplicated region for block: B:179:0x0577  */
    /* JADX WARN: Removed duplicated region for block: B:182:0x05c6  */
    /* JADX WARN: Removed duplicated region for block: B:185:0x05e4  */
    /* JADX WARN: Removed duplicated region for block: B:187:0x05fc  */
    /* JADX WARN: Removed duplicated region for block: B:188:0x05d0  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x007e  */
    /* JADX WARN: Removed duplicated region for block: B:190:0x03b2  */
    /* JADX WARN: Removed duplicated region for block: B:193:0x03bf  */
    /* JADX WARN: Removed duplicated region for block: B:195:0x03fd  */
    /* JADX WARN: Removed duplicated region for block: B:197:0x0403  */
    /* JADX WARN: Removed duplicated region for block: B:199:0x040d  */
    /* JADX WARN: Removed duplicated region for block: B:201:0x0413  */
    /* JADX WARN: Removed duplicated region for block: B:203:0x041e  */
    /* JADX WARN: Removed duplicated region for block: B:206:0x0426  */
    /* JADX WARN: Removed duplicated region for block: B:208:0x0439  */
    /* JADX WARN: Removed duplicated region for block: B:211:0x0446  */
    /* JADX WARN: Removed duplicated region for block: B:214:0x0460  */
    /* JADX WARN: Removed duplicated region for block: B:216:0x046d  */
    /* JADX WARN: Removed duplicated region for block: B:218:0x0478  */
    /* JADX WARN: Removed duplicated region for block: B:220:0x047e  */
    /* JADX WARN: Removed duplicated region for block: B:223:0x048c  */
    /* JADX WARN: Removed duplicated region for block: B:225:0x04a7  */
    /* JADX WARN: Removed duplicated region for block: B:228:0x04b4  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x009d  */
    /* JADX WARN: Removed duplicated region for block: B:231:0x04d6  */
    /* JADX WARN: Removed duplicated region for block: B:234:0x04e7  */
    /* JADX WARN: Removed duplicated region for block: B:237:0x0503  */
    /* JADX WARN: Removed duplicated region for block: B:240:0x0519  */
    /* JADX WARN: Removed duplicated region for block: B:241:0x053a  */
    /* JADX WARN: Removed duplicated region for block: B:242:0x0512  */
    /* JADX WARN: Removed duplicated region for block: B:243:0x04f8  */
    /* JADX WARN: Removed duplicated region for block: B:244:0x04e1  */
    /* JADX WARN: Removed duplicated region for block: B:245:0x04cb  */
    /* JADX WARN: Removed duplicated region for block: B:246:0x04ae  */
    /* JADX WARN: Removed duplicated region for block: B:247:0x04a1  */
    /* JADX WARN: Removed duplicated region for block: B:248:0x0481  */
    /* JADX WARN: Removed duplicated region for block: B:249:0x047a  */
    /* JADX WARN: Removed duplicated region for block: B:250:0x0474  */
    /* JADX WARN: Removed duplicated region for block: B:251:0x0469  */
    /* JADX WARN: Removed duplicated region for block: B:252:0x0456  */
    /* JADX WARN: Removed duplicated region for block: B:253:0x0440  */
    /* JADX WARN: Removed duplicated region for block: B:254:0x0435  */
    /* JADX WARN: Removed duplicated region for block: B:255:0x0420  */
    /* JADX WARN: Removed duplicated region for block: B:256:0x041a  */
    /* JADX WARN: Removed duplicated region for block: B:257:0x040f  */
    /* JADX WARN: Removed duplicated region for block: B:258:0x040a  */
    /* JADX WARN: Removed duplicated region for block: B:259:0x03ff  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x00be  */
    /* JADX WARN: Removed duplicated region for block: B:260:0x03ea  */
    /* JADX WARN: Removed duplicated region for block: B:261:0x03b9  */
    /* JADX WARN: Removed duplicated region for block: B:262:0x02c8  */
    /* JADX WARN: Removed duplicated region for block: B:269:0x02bd  */
    /* JADX WARN: Removed duplicated region for block: B:271:0x02a0  */
    /* JADX WARN: Removed duplicated region for block: B:273:0x0287  */
    /* JADX WARN: Removed duplicated region for block: B:275:0x026b  */
    /* JADX WARN: Removed duplicated region for block: B:277:0x024d  */
    /* JADX WARN: Removed duplicated region for block: B:278:0x021e  */
    /* JADX WARN: Removed duplicated region for block: B:286:0x020f  */
    /* JADX WARN: Removed duplicated region for block: B:287:0x01d8  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x00e2  */
    /* JADX WARN: Removed duplicated region for block: B:293:0x01bb  */
    /* JADX WARN: Removed duplicated region for block: B:299:0x019e  */
    /* JADX WARN: Removed duplicated region for block: B:307:0x0195  */
    /* JADX WARN: Removed duplicated region for block: B:309:0x017b  */
    /* JADX WARN: Removed duplicated region for block: B:310:0x014a  */
    /* JADX WARN: Removed duplicated region for block: B:319:0x013f  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0102  */
    /* JADX WARN: Removed duplicated region for block: B:320:0x0107  */
    /* JADX WARN: Removed duplicated region for block: B:327:0x00e9  */
    /* JADX WARN: Removed duplicated region for block: B:334:0x00c5  */
    /* JADX WARN: Removed duplicated region for block: B:341:0x00a2  */
    /* JADX WARN: Removed duplicated region for block: B:348:0x0081  */
    /* JADX WARN: Removed duplicated region for block: B:357:0x0074  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0129  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x0145  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x016a  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x0182  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x019b  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x01b8  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x01d5  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x01f8  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x0217  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x0239  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x0255  */
    /* JADX WARN: Type inference failed for: r11v17, types: [androidx.compose.ui.Modifier] */
    @ExperimentalMaterialApi
    /* renamed from: BottomSheetScaffold-bGncdBI, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void m917BottomSheetScaffoldbGncdBI(final Function3<? super ColumnScope, ? super Composer, ? super Integer, Unit> sheetContent, Modifier modifier, BottomSheetScaffoldState bottomSheetScaffoldState, Function2<? super Composer, ? super Integer, Unit> function2, Function3<? super SnackbarHostState, ? super Composer, ? super Integer, Unit> function3, Function2<? super Composer, ? super Integer, Unit> function22, int i, boolean z, Shape shape, float f, long j, long j2, float f2, Function3<? super ColumnScope, ? super Composer, ? super Integer, Unit> function32, boolean z2, Shape shape2, float f3, long j3, long j4, long j5, long j6, long j7, final Function3<? super PaddingValues, ? super Composer, ? super Integer, Unit> content, Composer composer, final int i2, final int i3, final int i4, final int i5) {
        int i6;
        final BottomSheetScaffoldState bottomSheetScaffoldState2;
        int i7;
        int i8;
        Function3<? super SnackbarHostState, ? super Composer, ? super Integer, Unit> function33;
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
        long j8;
        int i23;
        int i24;
        int i25;
        int i26;
        int i27;
        int i28;
        int i29;
        final Function3<? super SnackbarHostState, ? super Composer, ? super Integer, Unit> m1001getLambda1$material_release;
        final Function2<? super Composer, ? super Integer, Unit> function23;
        final int m1064getEnd5ygKITE;
        final boolean z3;
        CornerBasedShape cornerBasedShape;
        float m915getSheetElevationD9Ej5fM;
        int i30;
        long j9;
        long j10;
        boolean z4;
        long j11;
        CornerBasedShape cornerBasedShape2;
        Shape shape3;
        float f4;
        long j12;
        long j13;
        long j14;
        int i31;
        long j15;
        long j16;
        int i32;
        Shape shape4;
        long j17;
        long j18;
        long j19;
        final Function3<? super ColumnScope, ? super Composer, ? super Integer, Unit> function34;
        Modifier modifier2;
        int i33;
        Function2<? super Composer, ? super Integer, Unit> function24;
        float f5;
        float f6;
        long j20;
        Object rememberedValue;
        final float mo315toPx0680j_4;
        Object rememberedValue2;
        Object obj;
        final MutableState mutableState;
        Composer composer2;
        Modifier modifier3;
        Modifier.Companion companion;
        Composer composer3;
        final float f7;
        final long j21;
        final Shape shape5;
        final float f8;
        final long j22;
        final long j23;
        final long j24;
        final Function2<? super Composer, ? super Integer, Unit> function25;
        final Modifier modifier4;
        final long j25;
        final long j26;
        ScopeUpdateScope endRestartGroup;
        int i34;
        int i35;
        Intrinsics.checkNotNullParameter(sheetContent, "sheetContent");
        Intrinsics.checkNotNullParameter(content, "content");
        Composer startRestartGroup = composer.startRestartGroup(46422755);
        ComposerKt.sourceInformation(startRestartGroup, "C(BottomSheetScaffold)P(15,12,13,22,21,10,11:c#material.FabPosition,18,20,17:c#ui.unit.Dp,14:c#ui.graphics.Color,16:c#ui.graphics.Color,19:c#ui.unit.Dp,4,7,9,6:c#ui.unit.Dp,3:c#ui.graphics.Color,5:c#ui.graphics.Color,8:c#ui.graphics.Color,0:c#ui.graphics.Color,2:c#ui.graphics.Color)269@11027L34,275@11396L6,277@11527L6,278@11574L37,282@11831L6,284@11946L6,285@11994L38,286@12079L10,287@12134L6,288@12179L32,291@12282L24,*292@12348L7,293@12413L41,374@16003L713:BottomSheetScaffold.kt#jmzs0o");
        if ((i5 & 1) != 0) {
            i6 = i2 | 6;
        } else if ((i2 & 14) == 0) {
            i6 = (startRestartGroup.changed(sheetContent) ? 4 : 2) | i2;
        } else {
            i6 = i2;
        }
        int i36 = i5 & 2;
        if (i36 != 0) {
            i6 |= 48;
        } else if ((i2 & 112) == 0) {
            i6 |= startRestartGroup.changed(modifier) ? 32 : 16;
            if ((i2 & 896) != 0) {
                if ((i5 & 4) == 0) {
                    bottomSheetScaffoldState2 = bottomSheetScaffoldState;
                    if (startRestartGroup.changed(bottomSheetScaffoldState2)) {
                        i35 = 256;
                        i6 |= i35;
                    }
                } else {
                    bottomSheetScaffoldState2 = bottomSheetScaffoldState;
                }
                i35 = 128;
                i6 |= i35;
            } else {
                bottomSheetScaffoldState2 = bottomSheetScaffoldState;
            }
            i7 = i5 & 8;
            if (i7 == 0) {
                i6 |= 3072;
            } else if ((i2 & 7168) == 0) {
                i6 |= startRestartGroup.changed(function2) ? 2048 : 1024;
                i8 = i5 & 16;
                if (i8 != 0) {
                    i6 |= 24576;
                    function33 = function3;
                } else {
                    function33 = function3;
                    if ((i2 & 57344) == 0) {
                        i6 |= startRestartGroup.changed(function33) ? 16384 : 8192;
                    }
                }
                i9 = i5 & 32;
                if (i9 != 0) {
                    i6 |= ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE;
                } else if ((i2 & 458752) == 0) {
                    i6 |= startRestartGroup.changed(function22) ? 131072 : 65536;
                }
                i10 = i5 & 64;
                if (i10 != 0) {
                    i6 |= 1572864;
                } else if ((i2 & 3670016) == 0) {
                    i6 |= startRestartGroup.changed(i) ? 1048576 : 524288;
                }
                i11 = i5 & 128;
                if (i11 != 0) {
                    i6 |= 12582912;
                } else if ((i2 & 29360128) == 0) {
                    i12 = i11;
                    i6 |= startRestartGroup.changed(z) ? 8388608 : 4194304;
                    if ((i2 & 234881024) == 0) {
                        if ((i5 & 256) == 0 && startRestartGroup.changed(shape)) {
                            i34 = AccessibilityEventCompat.TYPE_VIEW_TARGETED_BY_SCROLL;
                            i6 |= i34;
                        }
                        i34 = 33554432;
                        i6 |= i34;
                    }
                    i13 = i5 & 512;
                    if (i13 == 0) {
                        i6 |= C.ENCODING_PCM_32BIT;
                    } else if ((i2 & 1879048192) == 0) {
                        i14 = i13;
                        i6 |= startRestartGroup.changed(f) ? 536870912 : 268435456;
                        if ((i3 & 14) == 0) {
                            i15 = (((i5 & 1024) == 0 && startRestartGroup.changed(j)) ? 4 : 2) | i3;
                        } else {
                            i15 = i3;
                        }
                        if ((i3 & 112) == 0) {
                            i15 |= ((i5 & 2048) == 0 && startRestartGroup.changed(j2)) ? 32 : 16;
                        }
                        i16 = i5 & 4096;
                        if (i16 != 0) {
                            i15 |= 384;
                        } else if ((i3 & 896) == 0) {
                            i15 |= startRestartGroup.changed(f2) ? 256 : 128;
                            i17 = i5 & 8192;
                            if (i17 == 0) {
                                i15 |= 3072;
                            } else if ((i3 & 7168) == 0) {
                                i15 |= startRestartGroup.changed(function32) ? 2048 : 1024;
                                i18 = i5 & 16384;
                                if (i18 != 0) {
                                    i15 |= 24576;
                                } else if ((i3 & 57344) == 0) {
                                    i19 = i18;
                                    i15 |= startRestartGroup.changed(z2) ? 16384 : 8192;
                                    if ((i3 & 458752) == 0) {
                                        i15 |= ((i5 & 32768) == 0 && startRestartGroup.changed(shape2)) ? 131072 : 65536;
                                    }
                                    i20 = i5 & 65536;
                                    if (i20 == 0) {
                                        i15 |= 1572864;
                                    } else if ((i3 & 3670016) == 0) {
                                        i15 |= startRestartGroup.changed(f3) ? 1048576 : 524288;
                                    }
                                    if ((i3 & 29360128) == 0) {
                                        i15 |= ((i5 & 131072) == 0 && startRestartGroup.changed(j3)) ? 8388608 : 4194304;
                                    }
                                    if ((i3 & 234881024) == 0) {
                                        i15 |= ((i5 & 262144) == 0 && startRestartGroup.changed(j4)) ? AccessibilityEventCompat.TYPE_VIEW_TARGETED_BY_SCROLL : 33554432;
                                    }
                                    if ((i3 & 1879048192) == 0) {
                                        i15 |= ((i5 & 524288) == 0 && startRestartGroup.changed(j5)) ? 536870912 : 268435456;
                                    }
                                    i21 = i15;
                                    if ((i4 & 14) != 0) {
                                        i22 = (((i5 & 1048576) == 0 && startRestartGroup.changed(j6)) ? 4 : 2) | i4;
                                    } else {
                                        i22 = i4;
                                    }
                                    if ((i4 & 112) != 0) {
                                        j8 = j7;
                                        i22 |= ((i5 & 2097152) == 0 && startRestartGroup.changed(j8)) ? 32 : 16;
                                    } else {
                                        j8 = j7;
                                    }
                                    if ((i5 & 4194304) == 0) {
                                        i22 |= 384;
                                    } else if ((i4 & 896) == 0) {
                                        i22 |= startRestartGroup.changed(content) ? 256 : 128;
                                    }
                                    if ((1533916891 & i6) == 306783378 || (i21 & 1533916891) != 306783378 || (i22 & 731) != 146 || !startRestartGroup.getSkipping()) {
                                        startRestartGroup.startDefaults();
                                        if ((i2 & 1) != 0 || startRestartGroup.getDefaultsInvalid()) {
                                            Modifier modifier5 = i36 == 0 ? Modifier.INSTANCE : modifier;
                                            if ((i5 & 4) == 0) {
                                                i23 = i22;
                                                int i37 = i12;
                                                i25 = i17;
                                                i26 = i37;
                                                int i38 = i14;
                                                i27 = i19;
                                                i28 = i38;
                                                i29 = i6 & (-897);
                                                bottomSheetScaffoldState2 = rememberBottomSheetScaffoldState(null, null, null, startRestartGroup, 0, 7);
                                                i24 = 6;
                                            } else {
                                                int i39 = i6;
                                                i23 = i22;
                                                i24 = 6;
                                                int i40 = i12;
                                                i25 = i17;
                                                i26 = i40;
                                                int i41 = i14;
                                                i27 = i19;
                                                i28 = i41;
                                                i29 = i39;
                                            }
                                            Function2<? super Composer, ? super Integer, Unit> function26 = i7 == 0 ? null : function2;
                                            m1001getLambda1$material_release = i8 == 0 ? ComposableSingletons$BottomSheetScaffoldKt.INSTANCE.m1001getLambda1$material_release() : function33;
                                            function23 = i9 == 0 ? null : function22;
                                            m1064getEnd5ygKITE = i10 == 0 ? FabPosition.INSTANCE.m1064getEnd5ygKITE() : i;
                                            z3 = i26 == 0 ? true : z;
                                            if ((i5 & 256) == 0) {
                                                cornerBasedShape = MaterialTheme.INSTANCE.getShapes(startRestartGroup, i24).getLarge();
                                                i29 &= -234881025;
                                            } else {
                                                cornerBasedShape = shape;
                                            }
                                            m915getSheetElevationD9Ej5fM = i28 == 0 ? BottomSheetScaffoldDefaults.INSTANCE.m915getSheetElevationD9Ej5fM() : f;
                                            if ((i5 & 1024) == 0) {
                                                i30 = i29;
                                                j9 = MaterialTheme.INSTANCE.getColors(startRestartGroup, 6).m980getSurface0d7_KjU();
                                                i21 &= -15;
                                            } else {
                                                i30 = i29;
                                                j9 = j;
                                            }
                                            Function2<? super Composer, ? super Integer, Unit> function27 = function26;
                                            if ((i5 & 2048) == 0) {
                                                j10 = ColorsKt.m994contentColorForek8zF_U(j9, startRestartGroup, i21 & 14);
                                                i21 &= -113;
                                            } else {
                                                j10 = j2;
                                            }
                                            float m916getSheetPeekHeightD9Ej5fM = i16 == 0 ? BottomSheetScaffoldDefaults.INSTANCE.m916getSheetPeekHeightD9Ej5fM() : f2;
                                            Function3<? super ColumnScope, ? super Composer, ? super Integer, Unit> function35 = i25 == 0 ? null : function32;
                                            z4 = i27 == 0 ? true : z2;
                                            float f9 = m916getSheetPeekHeightD9Ej5fM;
                                            if ((i5 & 32768) == 0) {
                                                j11 = j9;
                                                cornerBasedShape2 = MaterialTheme.INSTANCE.getShapes(startRestartGroup, 6).getLarge();
                                                i21 &= -458753;
                                            } else {
                                                j11 = j9;
                                                cornerBasedShape2 = shape2;
                                            }
                                            float m1021getElevationD9Ej5fM = i20 == 0 ? DrawerDefaults.INSTANCE.m1021getElevationD9Ej5fM() : f3;
                                            if ((i5 & 131072) == 0) {
                                                shape3 = cornerBasedShape2;
                                                i21 &= -29360129;
                                                f4 = m1021getElevationD9Ej5fM;
                                                j12 = MaterialTheme.INSTANCE.getColors(startRestartGroup, 6).m980getSurface0d7_KjU();
                                            } else {
                                                shape3 = cornerBasedShape2;
                                                f4 = m1021getElevationD9Ej5fM;
                                                j12 = j3;
                                            }
                                            if ((262144 & i5) == 0) {
                                                j13 = ColorsKt.m994contentColorForek8zF_U(j12, startRestartGroup, (i21 >> 21) & 14);
                                                i21 &= -234881025;
                                            } else {
                                                j13 = j4;
                                            }
                                            if ((i5 & 524288) == 0) {
                                                j14 = j12;
                                                i31 = 6;
                                                j15 = DrawerDefaults.INSTANCE.getScrimColor(startRestartGroup, 6);
                                                i21 &= -1879048193;
                                            } else {
                                                j14 = j12;
                                                i31 = 6;
                                                j15 = j5;
                                            }
                                            long j27 = j15;
                                            if ((i5 & 1048576) == 0) {
                                                j16 = MaterialTheme.INSTANCE.getColors(startRestartGroup, i31).m969getBackground0d7_KjU();
                                                i23 &= -15;
                                            } else {
                                                j16 = j6;
                                            }
                                            if ((2097152 & i5) == 0) {
                                                long m994contentColorForek8zF_U = ColorsKt.m994contentColorForek8zF_U(j16, startRestartGroup, i23 & 14);
                                                shape4 = shape3;
                                                j20 = j27;
                                                j19 = j16;
                                                i33 = i23 & (-113);
                                                function34 = function35;
                                                modifier2 = modifier5;
                                                j18 = m994contentColorForek8zF_U;
                                                i32 = i30;
                                                function24 = function27;
                                                f5 = f9;
                                                f6 = f4;
                                                j17 = j14;
                                            } else {
                                                i32 = i30;
                                                shape4 = shape3;
                                                j17 = j14;
                                                j18 = j7;
                                                j19 = j16;
                                                function34 = function35;
                                                modifier2 = modifier5;
                                                i33 = i23;
                                                function24 = function27;
                                                f5 = f9;
                                                f6 = f4;
                                                j20 = j27;
                                            }
                                        } else {
                                            startRestartGroup.skipToGroupEnd();
                                            if ((i5 & 4) != 0) {
                                                i6 &= -897;
                                            }
                                            if ((i5 & 256) != 0) {
                                                i6 &= -234881025;
                                            }
                                            if ((i5 & 1024) != 0) {
                                                i21 &= -15;
                                            }
                                            if ((i5 & 2048) != 0) {
                                                i21 &= -113;
                                            }
                                            if ((32768 & i5) != 0) {
                                                i21 &= -458753;
                                            }
                                            if ((i5 & 131072) != 0) {
                                                i21 &= -29360129;
                                            }
                                            if ((262144 & i5) != 0) {
                                                i21 &= -234881025;
                                            }
                                            if ((i5 & 524288) != 0) {
                                                i21 &= -1879048193;
                                            }
                                            if ((i5 & 1048576) != 0) {
                                                i22 &= -15;
                                            }
                                            if ((2097152 & i5) != 0) {
                                                i22 &= -113;
                                            }
                                            modifier2 = modifier;
                                            m1064getEnd5ygKITE = i;
                                            z3 = z;
                                            m915getSheetElevationD9Ej5fM = f;
                                            j11 = j;
                                            j10 = j2;
                                            f5 = f2;
                                            function34 = function32;
                                            z4 = z2;
                                            shape4 = shape2;
                                            f6 = f3;
                                            j17 = j3;
                                            j13 = j4;
                                            j20 = j5;
                                            j19 = j6;
                                            j18 = j7;
                                            i32 = i6;
                                            i33 = i22;
                                            m1001getLambda1$material_release = function33;
                                            function24 = function2;
                                            function23 = function22;
                                            cornerBasedShape = shape;
                                        }
                                        startRestartGroup.endDefaults();
                                        startRestartGroup.startReplaceableGroup(773894976);
                                        ComposerKt.sourceInformation(startRestartGroup, "C(rememberCoroutineScope)475@19849L144:Effects.kt#9igjgp");
                                        startRestartGroup.startReplaceableGroup(-492369756);
                                        ComposerKt.sourceInformation(startRestartGroup, "C(remember):Composables.kt#9igjgp");
                                        rememberedValue = startRestartGroup.rememberedValue();
                                        if (rememberedValue == Composer.INSTANCE.getEmpty()) {
                                            CompositionScopedCoroutineScopeCanceller compositionScopedCoroutineScopeCanceller = new CompositionScopedCoroutineScopeCanceller(EffectsKt.createCompositionCoroutineScope(EmptyCoroutineContext.INSTANCE, startRestartGroup));
                                            startRestartGroup.updateRememberedValue(compositionScopedCoroutineScopeCanceller);
                                            rememberedValue = compositionScopedCoroutineScopeCanceller;
                                        }
                                        startRestartGroup.endReplaceableGroup();
                                        final CoroutineScope coroutineScope = ((CompositionScopedCoroutineScopeCanceller) rememberedValue).getCoroutineScope();
                                        startRestartGroup.endReplaceableGroup();
                                        ProvidableCompositionLocal<Density> localDensity = CompositionLocalsKt.getLocalDensity();
                                        ComposerKt.sourceInformationMarkerStart(startRestartGroup, 2023513938, "C:CompositionLocal.kt#9igjgp");
                                        Object consume = startRestartGroup.consume(localDensity);
                                        ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                                        mo315toPx0680j_4 = ((Density) consume).mo315toPx0680j_4(f5);
                                        startRestartGroup.startReplaceableGroup(-492369756);
                                        ComposerKt.sourceInformation(startRestartGroup, "C(remember):Composables.kt#9igjgp");
                                        rememberedValue2 = startRestartGroup.rememberedValue();
                                        if (rememberedValue2 != Composer.INSTANCE.getEmpty()) {
                                            obj = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(null, null, 2, null);
                                            startRestartGroup.updateRememberedValue(obj);
                                        } else {
                                            obj = rememberedValue2;
                                        }
                                        startRestartGroup.endReplaceableGroup();
                                        mutableState = (MutableState) obj;
                                        if (Intrinsics.areEqual(mo315toPx0680j_4, m919BottomSheetScaffold_bGncdBI$lambda4(mutableState))) {
                                            composer2 = startRestartGroup;
                                            modifier3 = modifier2;
                                            companion = SemanticsModifierKt.semantics$default(Modifier.INSTANCE, false, new Function1<SemanticsPropertyReceiver, Unit>() { // from class: androidx.compose.material.BottomSheetScaffoldKt$BottomSheetScaffold$semantics$1
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
                                                    if (BottomSheetScaffoldState.this.getBottomSheetState().isCollapsed()) {
                                                        final BottomSheetScaffoldState bottomSheetScaffoldState3 = BottomSheetScaffoldState.this;
                                                        final CoroutineScope coroutineScope2 = coroutineScope;
                                                        SemanticsPropertiesKt.expand$default(semantics, null, new Function0<Boolean>() { // from class: androidx.compose.material.BottomSheetScaffoldKt$BottomSheetScaffold$semantics$1.1
                                                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                                            {
                                                                super(0);
                                                            }

                                                            /* JADX WARN: Can't rename method to resolve collision */
                                                            @Override // kotlin.jvm.functions.Function0
                                                            public final Boolean invoke() {
                                                                if (BottomSheetScaffoldState.this.getBottomSheetState().getConfirmStateChange$material_release().invoke(BottomSheetValue.Expanded).booleanValue()) {
                                                                    BuildersKt__Builders_commonKt.launch$default(coroutineScope2, null, null, new C00311(BottomSheetScaffoldState.this, null), 3, null);
                                                                }
                                                                return true;
                                                            }

                                                            /* compiled from: BottomSheetScaffold.kt */
                                                            @Metadata(k = 3, mv = {1, 6, 0}, xi = 48)
                                                            @DebugMetadata(c = "androidx.compose.material.BottomSheetScaffoldKt$BottomSheetScaffold$semantics$1$1$1", f = "BottomSheetScaffold.kt", i = {}, l = {Sdk.SDKError.Reason.MRAID_ERROR_VALUE}, m = "invokeSuspend", n = {}, s = {})
                                                            /* renamed from: androidx.compose.material.BottomSheetScaffoldKt$BottomSheetScaffold$semantics$1$1$1, reason: invalid class name and collision with other inner class name */
                                                            static final class C00311 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
                                                                final /* synthetic */ BottomSheetScaffoldState $scaffoldState;
                                                                int label;

                                                                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                                                C00311(BottomSheetScaffoldState bottomSheetScaffoldState, Continuation<? super C00311> continuation) {
                                                                    super(2, continuation);
                                                                    this.$scaffoldState = bottomSheetScaffoldState;
                                                                }

                                                                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                                                                public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                                                                    return new C00311(this.$scaffoldState, continuation);
                                                                }

                                                                @Override // kotlin.jvm.functions.Function2
                                                                public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
                                                                    return ((C00311) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
                                                                }

                                                                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                                                                public final Object invokeSuspend(Object obj) {
                                                                    Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                                                                    int i = this.label;
                                                                    if (i == 0) {
                                                                        ResultKt.throwOnFailure(obj);
                                                                        this.label = 1;
                                                                        if (this.$scaffoldState.getBottomSheetState().expand(this) == coroutine_suspended) {
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
                                                        final BottomSheetScaffoldState bottomSheetScaffoldState4 = BottomSheetScaffoldState.this;
                                                        final CoroutineScope coroutineScope3 = coroutineScope;
                                                        SemanticsPropertiesKt.collapse$default(semantics, null, new Function0<Boolean>() { // from class: androidx.compose.material.BottomSheetScaffoldKt$BottomSheetScaffold$semantics$1.2
                                                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                                            {
                                                                super(0);
                                                            }

                                                            /* JADX WARN: Can't rename method to resolve collision */
                                                            @Override // kotlin.jvm.functions.Function0
                                                            public final Boolean invoke() {
                                                                if (BottomSheetScaffoldState.this.getBottomSheetState().getConfirmStateChange$material_release().invoke(BottomSheetValue.Collapsed).booleanValue()) {
                                                                    BuildersKt__Builders_commonKt.launch$default(coroutineScope3, null, null, new AnonymousClass1(BottomSheetScaffoldState.this, null), 3, null);
                                                                }
                                                                return true;
                                                            }

                                                            /* compiled from: BottomSheetScaffold.kt */
                                                            @Metadata(k = 3, mv = {1, 6, 0}, xi = 48)
                                                            @DebugMetadata(c = "androidx.compose.material.BottomSheetScaffoldKt$BottomSheetScaffold$semantics$1$2$1", f = "BottomSheetScaffold.kt", i = {}, l = {308}, m = "invokeSuspend", n = {}, s = {})
                                                            /* renamed from: androidx.compose.material.BottomSheetScaffoldKt$BottomSheetScaffold$semantics$1$2$1, reason: invalid class name */
                                                            static final class AnonymousClass1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
                                                                final /* synthetic */ BottomSheetScaffoldState $scaffoldState;
                                                                int label;

                                                                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                                                AnonymousClass1(BottomSheetScaffoldState bottomSheetScaffoldState, Continuation<? super AnonymousClass1> continuation) {
                                                                    super(2, continuation);
                                                                    this.$scaffoldState = bottomSheetScaffoldState;
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
                                                                        if (this.$scaffoldState.getBottomSheetState().collapse(this) == coroutine_suspended) {
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
                                        } else {
                                            composer2 = startRestartGroup;
                                            modifier3 = modifier2;
                                            companion = Modifier.INSTANCE;
                                        }
                                        final BottomSheetScaffoldState bottomSheetScaffoldState3 = bottomSheetScaffoldState2;
                                        final Function2<? super Composer, ? super Integer, Unit> function28 = function24;
                                        final Function2<? super Composer, ? super Integer, Unit> function29 = function23;
                                        final float f10 = f5;
                                        final int i42 = m1064getEnd5ygKITE;
                                        final int i43 = i32;
                                        final int i44 = i33;
                                        final int i45 = i21;
                                        final boolean z5 = z3;
                                        final Modifier.Companion companion2 = companion;
                                        final Shape shape6 = cornerBasedShape;
                                        final long j28 = j11;
                                        final long j29 = j10;
                                        final float f11 = m915getSheetElevationD9Ej5fM;
                                        final Function3<? super SnackbarHostState, ? super Composer, ? super Integer, Unit> function36 = m1001getLambda1$material_release;
                                        composer3 = composer2;
                                        final ComposableLambda composableLambda = ComposableLambdaKt.composableLambda(composer3, 893101063, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material.BottomSheetScaffoldKt$BottomSheetScaffold$child$1
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

                                            public final void invoke(Composer composer4, int i46) {
                                                ComposerKt.sourceInformation(composer4, "C316@13233L2758:BottomSheetScaffold.kt#jmzs0o");
                                                if ((i46 & 11) != 2 || !composer4.getSkipping()) {
                                                    State<Float> offset = BottomSheetScaffoldState.this.getBottomSheetState().getOffset();
                                                    BottomSheetState bottomSheetState = BottomSheetScaffoldState.this.getBottomSheetState();
                                                    Function2<Composer, Integer, Unit> function210 = function28;
                                                    Function3<PaddingValues, Composer, Integer, Unit> function37 = content;
                                                    final float f12 = mo315toPx0680j_4;
                                                    final BottomSheetScaffoldState bottomSheetScaffoldState4 = BottomSheetScaffoldState.this;
                                                    final boolean z6 = z5;
                                                    final Modifier modifier6 = companion2;
                                                    final float f13 = f10;
                                                    final MutableState<Float> mutableState2 = mutableState;
                                                    final Shape shape7 = shape6;
                                                    final long j30 = j28;
                                                    final long j31 = j29;
                                                    final float f14 = f11;
                                                    final int i47 = i43;
                                                    final int i48 = i45;
                                                    final Function3<ColumnScope, Composer, Integer, Unit> function38 = sheetContent;
                                                    ComposableLambda composableLambda2 = ComposableLambdaKt.composableLambda(composer4, -1378534681, true, new Function3<Integer, Composer, Integer, Unit>() { // from class: androidx.compose.material.BottomSheetScaffoldKt$BottomSheetScaffold$child$1.1
                                                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                                        /* JADX WARN: Multi-variable type inference failed */
                                                        {
                                                            super(3);
                                                        }

                                                        @Override // kotlin.jvm.functions.Function3
                                                        public /* bridge */ /* synthetic */ Unit invoke(Integer num, Composer composer5, Integer num2) {
                                                            invoke(num.intValue(), composer5, num2.intValue());
                                                            return Unit.INSTANCE;
                                                        }

                                                        public final void invoke(int i49, Composer composer5, int i50) {
                                                            int i51;
                                                            Float m919BottomSheetScaffold_bGncdBI$lambda4;
                                                            Float m919BottomSheetScaffold_bGncdBI$lambda42;
                                                            Map mapOf;
                                                            Modifier.Companion m1182swipeablepPrIpRY;
                                                            ComposerKt.sourceInformation(composer5, "C354@15208L95,347@14851L711:BottomSheetScaffold.kt#jmzs0o");
                                                            if ((i50 & 14) == 0) {
                                                                i51 = i50 | (composer5.changed(i49) ? 4 : 2);
                                                            } else {
                                                                i51 = i50;
                                                            }
                                                            if ((i51 & 91) != 18 || !composer5.getSkipping()) {
                                                                m919BottomSheetScaffold_bGncdBI$lambda4 = BottomSheetScaffoldKt.m919BottomSheetScaffold_bGncdBI$lambda4(mutableState2);
                                                                if (m919BottomSheetScaffold_bGncdBI$lambda4 == null) {
                                                                    m1182swipeablepPrIpRY = Modifier.INSTANCE;
                                                                } else {
                                                                    if (MathKt.roundToInt(m919BottomSheetScaffold_bGncdBI$lambda4.floatValue()) != MathKt.roundToInt(f12)) {
                                                                        float f15 = i49;
                                                                        m919BottomSheetScaffold_bGncdBI$lambda42 = BottomSheetScaffoldKt.m919BottomSheetScaffold_bGncdBI$lambda4(mutableState2);
                                                                        Intrinsics.checkNotNull(m919BottomSheetScaffold_bGncdBI$lambda42);
                                                                        mapOf = MapsKt.mapOf(TuplesKt.to(Float.valueOf(f15 - m919BottomSheetScaffold_bGncdBI$lambda42.floatValue()), BottomSheetValue.Expanded), TuplesKt.to(Float.valueOf(f15 - f12), BottomSheetValue.Collapsed));
                                                                    } else {
                                                                        mapOf = MapsKt.mapOf(TuplesKt.to(Float.valueOf(i49 - m919BottomSheetScaffold_bGncdBI$lambda4.floatValue()), BottomSheetValue.Collapsed));
                                                                    }
                                                                    m1182swipeablepPrIpRY = SwipeableKt.m1182swipeablepPrIpRY(Modifier.INSTANCE, bottomSheetScaffoldState4.getBottomSheetState(), r13, Orientation.Vertical, (r26 & 8) != 0 ? true : z6, (r26 & 16) != 0 ? false : false, (r26 & 32) != 0 ? null : null, (r26 & 64) != 0 ? new Function2<T, T, FixedThreshold>() { // from class: androidx.compose.material.SwipeableKt$swipeable$1
                                                                        /* JADX WARN: Can't rename method to resolve collision */
                                                                        @Override // kotlin.jvm.functions.Function2
                                                                        public final FixedThreshold invoke(T t, T t2) {
                                                                            return new FixedThreshold(Dp.m3840constructorimpl(56), null);
                                                                        }
                                                                    } : null, (r26 & 128) != 0 ? SwipeableDefaults.resistanceConfig$default(SwipeableDefaults.INSTANCE, mapOf.keySet(), 0.0f, 0.0f, 6, null) : null, (r26 & 256) != 0 ? SwipeableDefaults.INSTANCE.m1181getVelocityThresholdD9Ej5fM() : 0.0f);
                                                                }
                                                                Modifier m452requiredHeightInVpY3zN4$default = SizeKt.m452requiredHeightInVpY3zN4$default(SizeKt.fillMaxWidth$default(NestedScrollModifierKt.nestedScroll$default(Modifier.INSTANCE, bottomSheetScaffoldState4.getBottomSheetState().getNestedScrollConnection(), null, 2, null).then(m1182swipeablepPrIpRY).then(modifier6), 0.0f, 1, null), f13, 0.0f, 2, null);
                                                                final MutableState<Float> mutableState3 = mutableState2;
                                                                composer5.startReplaceableGroup(1157296644);
                                                                ComposerKt.sourceInformation(composer5, "C(remember)P(1):Composables.kt#9igjgp");
                                                                boolean changed = composer5.changed(mutableState3);
                                                                Object rememberedValue3 = composer5.rememberedValue();
                                                                if (changed || rememberedValue3 == Composer.INSTANCE.getEmpty()) {
                                                                    rememberedValue3 = (Function1) new Function1<IntSize, Unit>() { // from class: androidx.compose.material.BottomSheetScaffoldKt$BottomSheetScaffold$child$1$1$1$1
                                                                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                                                        {
                                                                            super(1);
                                                                        }

                                                                        @Override // kotlin.jvm.functions.Function1
                                                                        public /* bridge */ /* synthetic */ Unit invoke(IntSize intSize) {
                                                                            m924invokeozmzZPI(intSize.getPackedValue());
                                                                            return Unit.INSTANCE;
                                                                        }

                                                                        /* renamed from: invoke-ozmzZPI, reason: not valid java name */
                                                                        public final void m924invokeozmzZPI(long j32) {
                                                                            mutableState3.setValue(Float.valueOf(IntSize.m3999getHeightimpl(j32)));
                                                                        }
                                                                    };
                                                                    composer5.updateRememberedValue(rememberedValue3);
                                                                }
                                                                composer5.endReplaceableGroup();
                                                                Modifier onSizeChanged = OnRemeasuredModifierKt.onSizeChanged(m452requiredHeightInVpY3zN4$default, (Function1) rememberedValue3);
                                                                Shape shape8 = shape7;
                                                                long j32 = j30;
                                                                long j33 = j31;
                                                                float f16 = f14;
                                                                final Function3<ColumnScope, Composer, Integer, Unit> function39 = function38;
                                                                final int i52 = i47;
                                                                ComposableLambda composableLambda3 = ComposableLambdaKt.composableLambda(composer5, -698903261, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material.BottomSheetScaffoldKt.BottomSheetScaffold.child.1.1.2
                                                                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                                                    /* JADX WARN: Multi-variable type inference failed */
                                                                    {
                                                                        super(2);
                                                                    }

                                                                    @Override // kotlin.jvm.functions.Function2
                                                                    public /* bridge */ /* synthetic */ Unit invoke(Composer composer6, Integer num) {
                                                                        invoke(composer6, num.intValue());
                                                                        return Unit.INSTANCE;
                                                                    }

                                                                    public final void invoke(Composer composer6, int i53) {
                                                                        ComposerKt.sourceInformation(composer6, "C361@15529L30:BottomSheetScaffold.kt#jmzs0o");
                                                                        if ((i53 & 11) == 2 && composer6.getSkipping()) {
                                                                            composer6.skipToGroupEnd();
                                                                            return;
                                                                        }
                                                                        Function3<ColumnScope, Composer, Integer, Unit> function310 = function39;
                                                                        int i54 = (i52 << 9) & 7168;
                                                                        composer6.startReplaceableGroup(-483455358);
                                                                        ComposerKt.sourceInformation(composer6, "C(Column)P(2,3,1)77@3880L61,78@3946L133:Column.kt#2w3rfo");
                                                                        Modifier.Companion companion3 = Modifier.INSTANCE;
                                                                        MeasurePolicy columnMeasurePolicy = ColumnKt.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), Alignment.INSTANCE.getStart(), composer6, 0);
                                                                        composer6.startReplaceableGroup(-1323940314);
                                                                        ComposerKt.sourceInformation(composer6, "C(Layout)P(!1,2)74@2915L7,75@2970L7,76@3029L7,77@3041L460:Layout.kt#80mrfh");
                                                                        ProvidableCompositionLocal<Density> localDensity2 = CompositionLocalsKt.getLocalDensity();
                                                                        ComposerKt.sourceInformationMarkerStart(composer6, 2023513938, "C:CompositionLocal.kt#9igjgp");
                                                                        Object consume2 = composer6.consume(localDensity2);
                                                                        ComposerKt.sourceInformationMarkerEnd(composer6);
                                                                        Density density = (Density) consume2;
                                                                        ProvidableCompositionLocal<LayoutDirection> localLayoutDirection = CompositionLocalsKt.getLocalLayoutDirection();
                                                                        ComposerKt.sourceInformationMarkerStart(composer6, 2023513938, "C:CompositionLocal.kt#9igjgp");
                                                                        Object consume3 = composer6.consume(localLayoutDirection);
                                                                        ComposerKt.sourceInformationMarkerEnd(composer6);
                                                                        LayoutDirection layoutDirection = (LayoutDirection) consume3;
                                                                        ProvidableCompositionLocal<ViewConfiguration> localViewConfiguration = CompositionLocalsKt.getLocalViewConfiguration();
                                                                        ComposerKt.sourceInformationMarkerStart(composer6, 2023513938, "C:CompositionLocal.kt#9igjgp");
                                                                        Object consume4 = composer6.consume(localViewConfiguration);
                                                                        ComposerKt.sourceInformationMarkerEnd(composer6);
                                                                        ViewConfiguration viewConfiguration = (ViewConfiguration) consume4;
                                                                        Function0<ComposeUiNode> constructor = ComposeUiNode.INSTANCE.getConstructor();
                                                                        Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> materializerOf = LayoutKt.materializerOf(companion3);
                                                                        if (!(composer6.getApplier() instanceof Applier)) {
                                                                            ComposablesKt.invalidApplier();
                                                                        }
                                                                        composer6.startReusableNode();
                                                                        if (composer6.getInserting()) {
                                                                            composer6.createNode(constructor);
                                                                        } else {
                                                                            composer6.useNode();
                                                                        }
                                                                        composer6.disableReusing();
                                                                        Composer m1283constructorimpl = Updater.m1283constructorimpl(composer6);
                                                                        Updater.m1290setimpl(m1283constructorimpl, columnMeasurePolicy, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
                                                                        Updater.m1290setimpl(m1283constructorimpl, density, ComposeUiNode.INSTANCE.getSetDensity());
                                                                        Updater.m1290setimpl(m1283constructorimpl, layoutDirection, ComposeUiNode.INSTANCE.getSetLayoutDirection());
                                                                        Updater.m1290setimpl(m1283constructorimpl, viewConfiguration, ComposeUiNode.INSTANCE.getSetViewConfiguration());
                                                                        composer6.enableReusing();
                                                                        materializerOf.invoke(SkippableUpdater.m1273boximpl(SkippableUpdater.m1274constructorimpl(composer6)), composer6, 0);
                                                                        composer6.startReplaceableGroup(2058660585);
                                                                        composer6.startReplaceableGroup(-1163856341);
                                                                        ComposerKt.sourceInformation(composer6, "C79@3994L9:Column.kt#2w3rfo");
                                                                        function310.invoke(ColumnScopeInstance.INSTANCE, composer6, Integer.valueOf(((i54 >> 6) & 112) | 6));
                                                                        composer6.endReplaceableGroup();
                                                                        composer6.endReplaceableGroup();
                                                                        composer6.endNode();
                                                                        composer6.endReplaceableGroup();
                                                                        composer6.endReplaceableGroup();
                                                                    }
                                                                });
                                                                int i53 = i47;
                                                                int i54 = i48;
                                                                SurfaceKt.m1172SurfaceFjzlyU(onSizeChanged, shape8, j32, j33, null, f16, composableLambda3, composer5, ((i53 >> 21) & 112) | 1572864 | ((i54 << 6) & 896) | ((i54 << 6) & 7168) | ((i53 >> 12) & 458752), 16);
                                                                return;
                                                            }
                                                            composer5.skipToGroupEnd();
                                                        }
                                                    });
                                                    Function2<Composer, Integer, Unit> function211 = function29;
                                                    final Function3<SnackbarHostState, Composer, Integer, Unit> function39 = function36;
                                                    final BottomSheetScaffoldState bottomSheetScaffoldState5 = BottomSheetScaffoldState.this;
                                                    final int i49 = i43;
                                                    ComposableLambda composableLambda3 = ComposableLambdaKt.composableLambda(composer4, -486138068, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material.BottomSheetScaffoldKt$BottomSheetScaffold$child$1.2
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

                                                        public final void invoke(Composer composer5, int i50) {
                                                            ComposerKt.sourceInformation(composer5, "C365@15680L45:BottomSheetScaffold.kt#jmzs0o");
                                                            if ((i50 & 11) == 2 && composer5.getSkipping()) {
                                                                composer5.skipToGroupEnd();
                                                            } else {
                                                                function39.invoke(bottomSheetScaffoldState5.getSnackbarHostState(), composer5, Integer.valueOf((i49 >> 9) & 112));
                                                            }
                                                        }
                                                    });
                                                    float f15 = f10;
                                                    int i50 = i42;
                                                    int i51 = i43;
                                                    BottomSheetScaffoldKt.m918BottomSheetScaffoldLayoutKCBPh4w(function210, function37, composableLambda2, function211, composableLambda3, f15, i50, offset, bottomSheetState, composer4, ((i51 >> 9) & 14) | 24960 | ((i44 >> 3) & 112) | ((i51 >> 6) & 7168) | ((i45 << 9) & 458752) | (i51 & 3670016));
                                                    return;
                                                }
                                                composer4.skipToGroupEnd();
                                            }
                                        });
                                        Modifier modifier6 = modifier3;
                                        final Function3<? super ColumnScope, ? super Composer, ? super Integer, Unit> function37 = function34;
                                        final BottomSheetScaffoldState bottomSheetScaffoldState4 = bottomSheetScaffoldState2;
                                        final boolean z6 = z4;
                                        final Shape shape7 = shape4;
                                        final float f12 = f6;
                                        final long j30 = j17;
                                        final long j31 = j13;
                                        final long j32 = j20;
                                        final int i46 = i21;
                                        int i47 = i33 << 6;
                                        SurfaceKt.m1172SurfaceFjzlyU(SizeKt.fillMaxSize$default(modifier6, 0.0f, 1, null), null, j19, j18, null, 0.0f, ComposableLambdaKt.composableLambda(composer3, 1273816607, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material.BottomSheetScaffoldKt$BottomSheetScaffold$1
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

                                            public final void invoke(Composer composer4, int i48) {
                                                ComposerKt.sourceInformation(composer4, "C:BottomSheetScaffold.kt#jmzs0o");
                                                if ((i48 & 11) != 2 || !composer4.getSkipping()) {
                                                    if (function37 == null) {
                                                        composer4.startReplaceableGroup(-249544858);
                                                        ComposerKt.sourceInformation(composer4, "381@16183L7");
                                                        composableLambda.invoke(composer4, 6);
                                                        composer4.endReplaceableGroup();
                                                        return;
                                                    }
                                                    composer4.startReplaceableGroup(-249544821);
                                                    ComposerKt.sourceInformation(composer4, "383@16220L480");
                                                    Function3<ColumnScope, Composer, Integer, Unit> function38 = function37;
                                                    DrawerState drawerState = bottomSheetScaffoldState4.getDrawerState();
                                                    boolean z7 = z6;
                                                    Shape shape8 = shape7;
                                                    float f13 = f12;
                                                    long j33 = j30;
                                                    long j34 = j31;
                                                    long j35 = j32;
                                                    Function2<Composer, Integer, Unit> function210 = composableLambda;
                                                    int i49 = i46;
                                                    DrawerKt.m1025ModalDrawerGs3lGvM(function38, null, drawerState, z7, shape8, f13, j33, j34, j35, function210, composer4, ((i49 >> 3) & 7168) | ((i49 >> 9) & 14) | C.ENCODING_PCM_32BIT | ((i49 >> 3) & 57344) | ((i49 >> 3) & 458752) | ((i49 >> 3) & 3670016) | ((i49 >> 3) & 29360128) | ((i49 >> 3) & 234881024), 2);
                                                    composer4.endReplaceableGroup();
                                                    return;
                                                }
                                                composer4.skipToGroupEnd();
                                            }
                                        }), composer3, (i47 & 7168) | (i47 & 896) | 1572864, 50);
                                        f7 = f5;
                                        j21 = j10;
                                        shape5 = shape4;
                                        f8 = f6;
                                        j22 = j17;
                                        j23 = j20;
                                        j24 = j19;
                                        function25 = function24;
                                        modifier4 = modifier6;
                                        j25 = j11;
                                        j26 = j18;
                                    } else {
                                        startRestartGroup.skipToGroupEnd();
                                        modifier4 = modifier;
                                        function25 = function2;
                                        function23 = function22;
                                        m915getSheetElevationD9Ej5fM = f;
                                        j25 = j;
                                        j21 = j2;
                                        f7 = f2;
                                        function34 = function32;
                                        z4 = z2;
                                        shape5 = shape2;
                                        f8 = f3;
                                        j22 = j3;
                                        j13 = j4;
                                        j23 = j5;
                                        j24 = j6;
                                        composer3 = startRestartGroup;
                                        j26 = j8;
                                        m1001getLambda1$material_release = function33;
                                        m1064getEnd5ygKITE = i;
                                        z3 = z;
                                        cornerBasedShape = shape;
                                    }
                                    endRestartGroup = composer3.endRestartGroup();
                                    if (endRestartGroup != null) {
                                        return;
                                    }
                                    final BottomSheetScaffoldState bottomSheetScaffoldState5 = bottomSheetScaffoldState2;
                                    final Shape shape8 = cornerBasedShape;
                                    final float f13 = m915getSheetElevationD9Ej5fM;
                                    final boolean z7 = z4;
                                    final long j33 = j13;
                                    endRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material.BottomSheetScaffoldKt$BottomSheetScaffold$2
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

                                        public final void invoke(Composer composer4, int i48) {
                                            BottomSheetScaffoldKt.m917BottomSheetScaffoldbGncdBI(sheetContent, modifier4, bottomSheetScaffoldState5, function25, m1001getLambda1$material_release, function23, m1064getEnd5ygKITE, z3, shape8, f13, j25, j21, f7, function34, z7, shape5, f8, j22, j33, j23, j24, j26, content, composer4, i2 | 1, i3, i4, i5);
                                        }
                                    });
                                    return;
                                }
                                i19 = i18;
                                if ((i3 & 458752) == 0) {
                                }
                                i20 = i5 & 65536;
                                if (i20 == 0) {
                                }
                                if ((i3 & 29360128) == 0) {
                                }
                                if ((i3 & 234881024) == 0) {
                                }
                                if ((i3 & 1879048192) == 0) {
                                }
                                i21 = i15;
                                if ((i4 & 14) != 0) {
                                }
                                if ((i4 & 112) != 0) {
                                }
                                if ((i5 & 4194304) == 0) {
                                }
                                if ((1533916891 & i6) == 306783378) {
                                }
                                startRestartGroup.startDefaults();
                                if ((i2 & 1) != 0) {
                                }
                                if (i36 == 0) {
                                }
                                if ((i5 & 4) == 0) {
                                }
                                if (i7 == 0) {
                                }
                                if (i8 == 0) {
                                }
                                if (i9 == 0) {
                                }
                                if (i10 == 0) {
                                }
                                if (i26 == 0) {
                                }
                                if ((i5 & 256) == 0) {
                                }
                                if (i28 == 0) {
                                }
                                if ((i5 & 1024) == 0) {
                                }
                                Function2<? super Composer, ? super Integer, Unit> function272 = function26;
                                if ((i5 & 2048) == 0) {
                                }
                                if (i16 == 0) {
                                }
                                if (i25 == 0) {
                                }
                                if (i27 == 0) {
                                }
                                float f92 = m916getSheetPeekHeightD9Ej5fM;
                                if ((i5 & 32768) == 0) {
                                }
                                if (i20 == 0) {
                                }
                                if ((i5 & 131072) == 0) {
                                }
                                if ((262144 & i5) == 0) {
                                }
                                if ((i5 & 524288) == 0) {
                                }
                                long j272 = j15;
                                if ((i5 & 1048576) == 0) {
                                }
                                if ((2097152 & i5) == 0) {
                                }
                                startRestartGroup.endDefaults();
                                startRestartGroup.startReplaceableGroup(773894976);
                                ComposerKt.sourceInformation(startRestartGroup, "C(rememberCoroutineScope)475@19849L144:Effects.kt#9igjgp");
                                startRestartGroup.startReplaceableGroup(-492369756);
                                ComposerKt.sourceInformation(startRestartGroup, "C(remember):Composables.kt#9igjgp");
                                rememberedValue = startRestartGroup.rememberedValue();
                                if (rememberedValue == Composer.INSTANCE.getEmpty()) {
                                }
                                startRestartGroup.endReplaceableGroup();
                                final CoroutineScope coroutineScope2 = ((CompositionScopedCoroutineScopeCanceller) rememberedValue).getCoroutineScope();
                                startRestartGroup.endReplaceableGroup();
                                ProvidableCompositionLocal<Density> localDensity2 = CompositionLocalsKt.getLocalDensity();
                                ComposerKt.sourceInformationMarkerStart(startRestartGroup, 2023513938, "C:CompositionLocal.kt#9igjgp");
                                Object consume2 = startRestartGroup.consume(localDensity2);
                                ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                                mo315toPx0680j_4 = ((Density) consume2).mo315toPx0680j_4(f5);
                                startRestartGroup.startReplaceableGroup(-492369756);
                                ComposerKt.sourceInformation(startRestartGroup, "C(remember):Composables.kt#9igjgp");
                                rememberedValue2 = startRestartGroup.rememberedValue();
                                if (rememberedValue2 != Composer.INSTANCE.getEmpty()) {
                                }
                                startRestartGroup.endReplaceableGroup();
                                mutableState = (MutableState) obj;
                                if (Intrinsics.areEqual(mo315toPx0680j_4, m919BottomSheetScaffold_bGncdBI$lambda4(mutableState))) {
                                }
                                final BottomSheetScaffoldState bottomSheetScaffoldState32 = bottomSheetScaffoldState2;
                                final Function2<? super Composer, ? super Integer, Unit> function282 = function24;
                                final Function2<? super Composer, ? super Integer, Unit> function292 = function23;
                                final float f102 = f5;
                                final int i422 = m1064getEnd5ygKITE;
                                final int i432 = i32;
                                final int i442 = i33;
                                final int i452 = i21;
                                final boolean z52 = z3;
                                final Modifier companion22 = companion;
                                final Shape shape62 = cornerBasedShape;
                                final long j282 = j11;
                                final long j292 = j10;
                                final float f112 = m915getSheetElevationD9Ej5fM;
                                final Function3<? super SnackbarHostState, ? super Composer, ? super Integer, Unit> function362 = m1001getLambda1$material_release;
                                composer3 = composer2;
                                final Function2<? super Composer, ? super Integer, Unit> composableLambda2 = ComposableLambdaKt.composableLambda(composer3, 893101063, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material.BottomSheetScaffoldKt$BottomSheetScaffold$child$1
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

                                    public final void invoke(Composer composer4, int i462) {
                                        ComposerKt.sourceInformation(composer4, "C316@13233L2758:BottomSheetScaffold.kt#jmzs0o");
                                        if ((i462 & 11) != 2 || !composer4.getSkipping()) {
                                            State<Float> offset = BottomSheetScaffoldState.this.getBottomSheetState().getOffset();
                                            BottomSheetState bottomSheetState = BottomSheetScaffoldState.this.getBottomSheetState();
                                            Function2<Composer, Integer, Unit> function210 = function282;
                                            Function3<PaddingValues, Composer, Integer, Unit> function372 = content;
                                            final float f122 = mo315toPx0680j_4;
                                            final BottomSheetScaffoldState bottomSheetScaffoldState42 = BottomSheetScaffoldState.this;
                                            final boolean z62 = z52;
                                            final Modifier modifier62 = companion22;
                                            final float f132 = f102;
                                            final MutableState<Float> mutableState2 = mutableState;
                                            final Shape shape72 = shape62;
                                            final long j302 = j282;
                                            final long j312 = j292;
                                            final float f14 = f112;
                                            final int i472 = i432;
                                            final int i48 = i452;
                                            final Function3<? super ColumnScope, ? super Composer, ? super Integer, Unit> function38 = sheetContent;
                                            ComposableLambda composableLambda22 = ComposableLambdaKt.composableLambda(composer4, -1378534681, true, new Function3<Integer, Composer, Integer, Unit>() { // from class: androidx.compose.material.BottomSheetScaffoldKt$BottomSheetScaffold$child$1.1
                                                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                                /* JADX WARN: Multi-variable type inference failed */
                                                {
                                                    super(3);
                                                }

                                                @Override // kotlin.jvm.functions.Function3
                                                public /* bridge */ /* synthetic */ Unit invoke(Integer num, Composer composer5, Integer num2) {
                                                    invoke(num.intValue(), composer5, num2.intValue());
                                                    return Unit.INSTANCE;
                                                }

                                                public final void invoke(int i49, Composer composer5, int i50) {
                                                    int i51;
                                                    Float m919BottomSheetScaffold_bGncdBI$lambda4;
                                                    Float m919BottomSheetScaffold_bGncdBI$lambda42;
                                                    Map mapOf;
                                                    Modifier.Companion m1182swipeablepPrIpRY;
                                                    ComposerKt.sourceInformation(composer5, "C354@15208L95,347@14851L711:BottomSheetScaffold.kt#jmzs0o");
                                                    if ((i50 & 14) == 0) {
                                                        i51 = i50 | (composer5.changed(i49) ? 4 : 2);
                                                    } else {
                                                        i51 = i50;
                                                    }
                                                    if ((i51 & 91) != 18 || !composer5.getSkipping()) {
                                                        m919BottomSheetScaffold_bGncdBI$lambda4 = BottomSheetScaffoldKt.m919BottomSheetScaffold_bGncdBI$lambda4(mutableState2);
                                                        if (m919BottomSheetScaffold_bGncdBI$lambda4 == null) {
                                                            m1182swipeablepPrIpRY = Modifier.INSTANCE;
                                                        } else {
                                                            if (MathKt.roundToInt(m919BottomSheetScaffold_bGncdBI$lambda4.floatValue()) != MathKt.roundToInt(f122)) {
                                                                float f15 = i49;
                                                                m919BottomSheetScaffold_bGncdBI$lambda42 = BottomSheetScaffoldKt.m919BottomSheetScaffold_bGncdBI$lambda4(mutableState2);
                                                                Intrinsics.checkNotNull(m919BottomSheetScaffold_bGncdBI$lambda42);
                                                                mapOf = MapsKt.mapOf(TuplesKt.to(Float.valueOf(f15 - m919BottomSheetScaffold_bGncdBI$lambda42.floatValue()), BottomSheetValue.Expanded), TuplesKt.to(Float.valueOf(f15 - f122), BottomSheetValue.Collapsed));
                                                            } else {
                                                                mapOf = MapsKt.mapOf(TuplesKt.to(Float.valueOf(i49 - m919BottomSheetScaffold_bGncdBI$lambda4.floatValue()), BottomSheetValue.Collapsed));
                                                            }
                                                            m1182swipeablepPrIpRY = SwipeableKt.m1182swipeablepPrIpRY(Modifier.INSTANCE, bottomSheetScaffoldState42.getBottomSheetState(), r13, Orientation.Vertical, (r26 & 8) != 0 ? true : z62, (r26 & 16) != 0 ? false : false, (r26 & 32) != 0 ? null : null, (r26 & 64) != 0 ? new Function2<T, T, FixedThreshold>() { // from class: androidx.compose.material.SwipeableKt$swipeable$1
                                                                /* JADX WARN: Can't rename method to resolve collision */
                                                                @Override // kotlin.jvm.functions.Function2
                                                                public final FixedThreshold invoke(T t, T t2) {
                                                                    return new FixedThreshold(Dp.m3840constructorimpl(56), null);
                                                                }
                                                            } : null, (r26 & 128) != 0 ? SwipeableDefaults.resistanceConfig$default(SwipeableDefaults.INSTANCE, mapOf.keySet(), 0.0f, 0.0f, 6, null) : null, (r26 & 256) != 0 ? SwipeableDefaults.INSTANCE.m1181getVelocityThresholdD9Ej5fM() : 0.0f);
                                                        }
                                                        Modifier m452requiredHeightInVpY3zN4$default = SizeKt.m452requiredHeightInVpY3zN4$default(SizeKt.fillMaxWidth$default(NestedScrollModifierKt.nestedScroll$default(Modifier.INSTANCE, bottomSheetScaffoldState42.getBottomSheetState().getNestedScrollConnection(), null, 2, null).then(m1182swipeablepPrIpRY).then(modifier62), 0.0f, 1, null), f132, 0.0f, 2, null);
                                                        final MutableState<Float> mutableState3 = mutableState2;
                                                        composer5.startReplaceableGroup(1157296644);
                                                        ComposerKt.sourceInformation(composer5, "C(remember)P(1):Composables.kt#9igjgp");
                                                        boolean changed = composer5.changed(mutableState3);
                                                        Object rememberedValue3 = composer5.rememberedValue();
                                                        if (changed || rememberedValue3 == Composer.INSTANCE.getEmpty()) {
                                                            rememberedValue3 = (Function1) new Function1<IntSize, Unit>() { // from class: androidx.compose.material.BottomSheetScaffoldKt$BottomSheetScaffold$child$1$1$1$1
                                                                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                                                {
                                                                    super(1);
                                                                }

                                                                @Override // kotlin.jvm.functions.Function1
                                                                public /* bridge */ /* synthetic */ Unit invoke(IntSize intSize) {
                                                                    m924invokeozmzZPI(intSize.getPackedValue());
                                                                    return Unit.INSTANCE;
                                                                }

                                                                /* renamed from: invoke-ozmzZPI, reason: not valid java name */
                                                                public final void m924invokeozmzZPI(long j322) {
                                                                    mutableState3.setValue(Float.valueOf(IntSize.m3999getHeightimpl(j322)));
                                                                }
                                                            };
                                                            composer5.updateRememberedValue(rememberedValue3);
                                                        }
                                                        composer5.endReplaceableGroup();
                                                        Modifier onSizeChanged = OnRemeasuredModifierKt.onSizeChanged(m452requiredHeightInVpY3zN4$default, (Function1) rememberedValue3);
                                                        Shape shape82 = shape72;
                                                        long j322 = j302;
                                                        long j332 = j312;
                                                        float f16 = f14;
                                                        final Function3<? super ColumnScope, ? super Composer, ? super Integer, Unit> function39 = function38;
                                                        final int i52 = i472;
                                                        ComposableLambda composableLambda3 = ComposableLambdaKt.composableLambda(composer5, -698903261, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material.BottomSheetScaffoldKt.BottomSheetScaffold.child.1.1.2
                                                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                                            /* JADX WARN: Multi-variable type inference failed */
                                                            {
                                                                super(2);
                                                            }

                                                            @Override // kotlin.jvm.functions.Function2
                                                            public /* bridge */ /* synthetic */ Unit invoke(Composer composer6, Integer num) {
                                                                invoke(composer6, num.intValue());
                                                                return Unit.INSTANCE;
                                                            }

                                                            public final void invoke(Composer composer6, int i53) {
                                                                ComposerKt.sourceInformation(composer6, "C361@15529L30:BottomSheetScaffold.kt#jmzs0o");
                                                                if ((i53 & 11) == 2 && composer6.getSkipping()) {
                                                                    composer6.skipToGroupEnd();
                                                                    return;
                                                                }
                                                                Function3<ColumnScope, Composer, Integer, Unit> function310 = function39;
                                                                int i54 = (i52 << 9) & 7168;
                                                                composer6.startReplaceableGroup(-483455358);
                                                                ComposerKt.sourceInformation(composer6, "C(Column)P(2,3,1)77@3880L61,78@3946L133:Column.kt#2w3rfo");
                                                                Modifier.Companion companion3 = Modifier.INSTANCE;
                                                                MeasurePolicy columnMeasurePolicy = ColumnKt.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), Alignment.INSTANCE.getStart(), composer6, 0);
                                                                composer6.startReplaceableGroup(-1323940314);
                                                                ComposerKt.sourceInformation(composer6, "C(Layout)P(!1,2)74@2915L7,75@2970L7,76@3029L7,77@3041L460:Layout.kt#80mrfh");
                                                                ProvidableCompositionLocal<Density> localDensity22 = CompositionLocalsKt.getLocalDensity();
                                                                ComposerKt.sourceInformationMarkerStart(composer6, 2023513938, "C:CompositionLocal.kt#9igjgp");
                                                                Object consume22 = composer6.consume(localDensity22);
                                                                ComposerKt.sourceInformationMarkerEnd(composer6);
                                                                Density density = (Density) consume22;
                                                                ProvidableCompositionLocal<LayoutDirection> localLayoutDirection = CompositionLocalsKt.getLocalLayoutDirection();
                                                                ComposerKt.sourceInformationMarkerStart(composer6, 2023513938, "C:CompositionLocal.kt#9igjgp");
                                                                Object consume3 = composer6.consume(localLayoutDirection);
                                                                ComposerKt.sourceInformationMarkerEnd(composer6);
                                                                LayoutDirection layoutDirection = (LayoutDirection) consume3;
                                                                ProvidableCompositionLocal<ViewConfiguration> localViewConfiguration = CompositionLocalsKt.getLocalViewConfiguration();
                                                                ComposerKt.sourceInformationMarkerStart(composer6, 2023513938, "C:CompositionLocal.kt#9igjgp");
                                                                Object consume4 = composer6.consume(localViewConfiguration);
                                                                ComposerKt.sourceInformationMarkerEnd(composer6);
                                                                ViewConfiguration viewConfiguration = (ViewConfiguration) consume4;
                                                                Function0<ComposeUiNode> constructor = ComposeUiNode.INSTANCE.getConstructor();
                                                                Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> materializerOf = LayoutKt.materializerOf(companion3);
                                                                if (!(composer6.getApplier() instanceof Applier)) {
                                                                    ComposablesKt.invalidApplier();
                                                                }
                                                                composer6.startReusableNode();
                                                                if (composer6.getInserting()) {
                                                                    composer6.createNode(constructor);
                                                                } else {
                                                                    composer6.useNode();
                                                                }
                                                                composer6.disableReusing();
                                                                Composer m1283constructorimpl = Updater.m1283constructorimpl(composer6);
                                                                Updater.m1290setimpl(m1283constructorimpl, columnMeasurePolicy, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
                                                                Updater.m1290setimpl(m1283constructorimpl, density, ComposeUiNode.INSTANCE.getSetDensity());
                                                                Updater.m1290setimpl(m1283constructorimpl, layoutDirection, ComposeUiNode.INSTANCE.getSetLayoutDirection());
                                                                Updater.m1290setimpl(m1283constructorimpl, viewConfiguration, ComposeUiNode.INSTANCE.getSetViewConfiguration());
                                                                composer6.enableReusing();
                                                                materializerOf.invoke(SkippableUpdater.m1273boximpl(SkippableUpdater.m1274constructorimpl(composer6)), composer6, 0);
                                                                composer6.startReplaceableGroup(2058660585);
                                                                composer6.startReplaceableGroup(-1163856341);
                                                                ComposerKt.sourceInformation(composer6, "C79@3994L9:Column.kt#2w3rfo");
                                                                function310.invoke(ColumnScopeInstance.INSTANCE, composer6, Integer.valueOf(((i54 >> 6) & 112) | 6));
                                                                composer6.endReplaceableGroup();
                                                                composer6.endReplaceableGroup();
                                                                composer6.endNode();
                                                                composer6.endReplaceableGroup();
                                                                composer6.endReplaceableGroup();
                                                            }
                                                        });
                                                        int i53 = i472;
                                                        int i54 = i48;
                                                        SurfaceKt.m1172SurfaceFjzlyU(onSizeChanged, shape82, j322, j332, null, f16, composableLambda3, composer5, ((i53 >> 21) & 112) | 1572864 | ((i54 << 6) & 896) | ((i54 << 6) & 7168) | ((i53 >> 12) & 458752), 16);
                                                        return;
                                                    }
                                                    composer5.skipToGroupEnd();
                                                }
                                            });
                                            Function2<Composer, Integer, Unit> function211 = function292;
                                            final Function3<? super SnackbarHostState, ? super Composer, ? super Integer, Unit> function39 = function362;
                                            final BottomSheetScaffoldState bottomSheetScaffoldState52 = BottomSheetScaffoldState.this;
                                            final int i49 = i432;
                                            ComposableLambda composableLambda3 = ComposableLambdaKt.composableLambda(composer4, -486138068, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material.BottomSheetScaffoldKt$BottomSheetScaffold$child$1.2
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

                                                public final void invoke(Composer composer5, int i50) {
                                                    ComposerKt.sourceInformation(composer5, "C365@15680L45:BottomSheetScaffold.kt#jmzs0o");
                                                    if ((i50 & 11) == 2 && composer5.getSkipping()) {
                                                        composer5.skipToGroupEnd();
                                                    } else {
                                                        function39.invoke(bottomSheetScaffoldState52.getSnackbarHostState(), composer5, Integer.valueOf((i49 >> 9) & 112));
                                                    }
                                                }
                                            });
                                            float f15 = f102;
                                            int i50 = i422;
                                            int i51 = i432;
                                            BottomSheetScaffoldKt.m918BottomSheetScaffoldLayoutKCBPh4w(function210, function372, composableLambda22, function211, composableLambda3, f15, i50, offset, bottomSheetState, composer4, ((i51 >> 9) & 14) | 24960 | ((i442 >> 3) & 112) | ((i51 >> 6) & 7168) | ((i452 << 9) & 458752) | (i51 & 3670016));
                                            return;
                                        }
                                        composer4.skipToGroupEnd();
                                    }
                                });
                                Modifier modifier62 = modifier3;
                                final Function3<? super ColumnScope, ? super Composer, ? super Integer, Unit> function372 = function34;
                                final BottomSheetScaffoldState bottomSheetScaffoldState42 = bottomSheetScaffoldState2;
                                final boolean z62 = z4;
                                final Shape shape72 = shape4;
                                final float f122 = f6;
                                final long j302 = j17;
                                final long j312 = j13;
                                final long j322 = j20;
                                final int i462 = i21;
                                int i472 = i33 << 6;
                                SurfaceKt.m1172SurfaceFjzlyU(SizeKt.fillMaxSize$default(modifier62, 0.0f, 1, null), null, j19, j18, null, 0.0f, ComposableLambdaKt.composableLambda(composer3, 1273816607, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material.BottomSheetScaffoldKt$BottomSheetScaffold$1
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

                                    public final void invoke(Composer composer4, int i48) {
                                        ComposerKt.sourceInformation(composer4, "C:BottomSheetScaffold.kt#jmzs0o");
                                        if ((i48 & 11) != 2 || !composer4.getSkipping()) {
                                            if (function372 == null) {
                                                composer4.startReplaceableGroup(-249544858);
                                                ComposerKt.sourceInformation(composer4, "381@16183L7");
                                                composableLambda2.invoke(composer4, 6);
                                                composer4.endReplaceableGroup();
                                                return;
                                            }
                                            composer4.startReplaceableGroup(-249544821);
                                            ComposerKt.sourceInformation(composer4, "383@16220L480");
                                            Function3<ColumnScope, Composer, Integer, Unit> function38 = function372;
                                            DrawerState drawerState = bottomSheetScaffoldState42.getDrawerState();
                                            boolean z72 = z62;
                                            Shape shape82 = shape72;
                                            float f132 = f122;
                                            long j332 = j302;
                                            long j34 = j312;
                                            long j35 = j322;
                                            Function2<Composer, Integer, Unit> function210 = composableLambda2;
                                            int i49 = i462;
                                            DrawerKt.m1025ModalDrawerGs3lGvM(function38, null, drawerState, z72, shape82, f132, j332, j34, j35, function210, composer4, ((i49 >> 3) & 7168) | ((i49 >> 9) & 14) | C.ENCODING_PCM_32BIT | ((i49 >> 3) & 57344) | ((i49 >> 3) & 458752) | ((i49 >> 3) & 3670016) | ((i49 >> 3) & 29360128) | ((i49 >> 3) & 234881024), 2);
                                            composer4.endReplaceableGroup();
                                            return;
                                        }
                                        composer4.skipToGroupEnd();
                                    }
                                }), composer3, (i472 & 7168) | (i472 & 896) | 1572864, 50);
                                f7 = f5;
                                j21 = j10;
                                shape5 = shape4;
                                f8 = f6;
                                j22 = j17;
                                j23 = j20;
                                j24 = j19;
                                function25 = function24;
                                modifier4 = modifier62;
                                j25 = j11;
                                j26 = j18;
                                endRestartGroup = composer3.endRestartGroup();
                                if (endRestartGroup != null) {
                                }
                            }
                            i18 = i5 & 16384;
                            if (i18 != 0) {
                            }
                            i19 = i18;
                            if ((i3 & 458752) == 0) {
                            }
                            i20 = i5 & 65536;
                            if (i20 == 0) {
                            }
                            if ((i3 & 29360128) == 0) {
                            }
                            if ((i3 & 234881024) == 0) {
                            }
                            if ((i3 & 1879048192) == 0) {
                            }
                            i21 = i15;
                            if ((i4 & 14) != 0) {
                            }
                            if ((i4 & 112) != 0) {
                            }
                            if ((i5 & 4194304) == 0) {
                            }
                            if ((1533916891 & i6) == 306783378) {
                            }
                            startRestartGroup.startDefaults();
                            if ((i2 & 1) != 0) {
                            }
                            if (i36 == 0) {
                            }
                            if ((i5 & 4) == 0) {
                            }
                            if (i7 == 0) {
                            }
                            if (i8 == 0) {
                            }
                            if (i9 == 0) {
                            }
                            if (i10 == 0) {
                            }
                            if (i26 == 0) {
                            }
                            if ((i5 & 256) == 0) {
                            }
                            if (i28 == 0) {
                            }
                            if ((i5 & 1024) == 0) {
                            }
                            Function2<? super Composer, ? super Integer, Unit> function2722 = function26;
                            if ((i5 & 2048) == 0) {
                            }
                            if (i16 == 0) {
                            }
                            if (i25 == 0) {
                            }
                            if (i27 == 0) {
                            }
                            float f922 = m916getSheetPeekHeightD9Ej5fM;
                            if ((i5 & 32768) == 0) {
                            }
                            if (i20 == 0) {
                            }
                            if ((i5 & 131072) == 0) {
                            }
                            if ((262144 & i5) == 0) {
                            }
                            if ((i5 & 524288) == 0) {
                            }
                            long j2722 = j15;
                            if ((i5 & 1048576) == 0) {
                            }
                            if ((2097152 & i5) == 0) {
                            }
                            startRestartGroup.endDefaults();
                            startRestartGroup.startReplaceableGroup(773894976);
                            ComposerKt.sourceInformation(startRestartGroup, "C(rememberCoroutineScope)475@19849L144:Effects.kt#9igjgp");
                            startRestartGroup.startReplaceableGroup(-492369756);
                            ComposerKt.sourceInformation(startRestartGroup, "C(remember):Composables.kt#9igjgp");
                            rememberedValue = startRestartGroup.rememberedValue();
                            if (rememberedValue == Composer.INSTANCE.getEmpty()) {
                            }
                            startRestartGroup.endReplaceableGroup();
                            final CoroutineScope coroutineScope22 = ((CompositionScopedCoroutineScopeCanceller) rememberedValue).getCoroutineScope();
                            startRestartGroup.endReplaceableGroup();
                            ProvidableCompositionLocal<Density> localDensity22 = CompositionLocalsKt.getLocalDensity();
                            ComposerKt.sourceInformationMarkerStart(startRestartGroup, 2023513938, "C:CompositionLocal.kt#9igjgp");
                            Object consume22 = startRestartGroup.consume(localDensity22);
                            ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                            mo315toPx0680j_4 = ((Density) consume22).mo315toPx0680j_4(f5);
                            startRestartGroup.startReplaceableGroup(-492369756);
                            ComposerKt.sourceInformation(startRestartGroup, "C(remember):Composables.kt#9igjgp");
                            rememberedValue2 = startRestartGroup.rememberedValue();
                            if (rememberedValue2 != Composer.INSTANCE.getEmpty()) {
                            }
                            startRestartGroup.endReplaceableGroup();
                            mutableState = (MutableState) obj;
                            if (Intrinsics.areEqual(mo315toPx0680j_4, m919BottomSheetScaffold_bGncdBI$lambda4(mutableState))) {
                            }
                            final BottomSheetScaffoldState bottomSheetScaffoldState322 = bottomSheetScaffoldState2;
                            final Function2<? super Composer, ? super Integer, Unit> function2822 = function24;
                            final Function2<? super Composer, ? super Integer, Unit> function2922 = function23;
                            final float f1022 = f5;
                            final int i4222 = m1064getEnd5ygKITE;
                            final int i4322 = i32;
                            final int i4422 = i33;
                            final int i4522 = i21;
                            final boolean z522 = z3;
                            final Modifier companion222 = companion;
                            final Shape shape622 = cornerBasedShape;
                            final long j2822 = j11;
                            final long j2922 = j10;
                            final float f1122 = m915getSheetElevationD9Ej5fM;
                            final Function3<? super SnackbarHostState, ? super Composer, ? super Integer, Unit> function3622 = m1001getLambda1$material_release;
                            composer3 = composer2;
                            final Function2<? super Composer, ? super Integer, Unit> composableLambda22 = ComposableLambdaKt.composableLambda(composer3, 893101063, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material.BottomSheetScaffoldKt$BottomSheetScaffold$child$1
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

                                public final void invoke(Composer composer4, int i4622) {
                                    ComposerKt.sourceInformation(composer4, "C316@13233L2758:BottomSheetScaffold.kt#jmzs0o");
                                    if ((i4622 & 11) != 2 || !composer4.getSkipping()) {
                                        State<Float> offset = BottomSheetScaffoldState.this.getBottomSheetState().getOffset();
                                        BottomSheetState bottomSheetState = BottomSheetScaffoldState.this.getBottomSheetState();
                                        Function2<Composer, Integer, Unit> function210 = function2822;
                                        Function3<PaddingValues, Composer, Integer, Unit> function3722 = content;
                                        final float f1222 = mo315toPx0680j_4;
                                        final BottomSheetScaffoldState bottomSheetScaffoldState422 = BottomSheetScaffoldState.this;
                                        final boolean z622 = z522;
                                        final Modifier modifier622 = companion222;
                                        final float f132 = f1022;
                                        final MutableState<Float> mutableState2 = mutableState;
                                        final Shape shape722 = shape622;
                                        final long j3022 = j2822;
                                        final long j3122 = j2922;
                                        final float f14 = f1122;
                                        final int i4722 = i4322;
                                        final int i48 = i4522;
                                        final Function3<? super ColumnScope, ? super Composer, ? super Integer, Unit> function38 = sheetContent;
                                        ComposableLambda composableLambda222 = ComposableLambdaKt.composableLambda(composer4, -1378534681, true, new Function3<Integer, Composer, Integer, Unit>() { // from class: androidx.compose.material.BottomSheetScaffoldKt$BottomSheetScaffold$child$1.1
                                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                            /* JADX WARN: Multi-variable type inference failed */
                                            {
                                                super(3);
                                            }

                                            @Override // kotlin.jvm.functions.Function3
                                            public /* bridge */ /* synthetic */ Unit invoke(Integer num, Composer composer5, Integer num2) {
                                                invoke(num.intValue(), composer5, num2.intValue());
                                                return Unit.INSTANCE;
                                            }

                                            public final void invoke(int i49, Composer composer5, int i50) {
                                                int i51;
                                                Float m919BottomSheetScaffold_bGncdBI$lambda4;
                                                Float m919BottomSheetScaffold_bGncdBI$lambda42;
                                                Map mapOf;
                                                Modifier.Companion m1182swipeablepPrIpRY;
                                                ComposerKt.sourceInformation(composer5, "C354@15208L95,347@14851L711:BottomSheetScaffold.kt#jmzs0o");
                                                if ((i50 & 14) == 0) {
                                                    i51 = i50 | (composer5.changed(i49) ? 4 : 2);
                                                } else {
                                                    i51 = i50;
                                                }
                                                if ((i51 & 91) != 18 || !composer5.getSkipping()) {
                                                    m919BottomSheetScaffold_bGncdBI$lambda4 = BottomSheetScaffoldKt.m919BottomSheetScaffold_bGncdBI$lambda4(mutableState2);
                                                    if (m919BottomSheetScaffold_bGncdBI$lambda4 == null) {
                                                        m1182swipeablepPrIpRY = Modifier.INSTANCE;
                                                    } else {
                                                        if (MathKt.roundToInt(m919BottomSheetScaffold_bGncdBI$lambda4.floatValue()) != MathKt.roundToInt(f1222)) {
                                                            float f15 = i49;
                                                            m919BottomSheetScaffold_bGncdBI$lambda42 = BottomSheetScaffoldKt.m919BottomSheetScaffold_bGncdBI$lambda4(mutableState2);
                                                            Intrinsics.checkNotNull(m919BottomSheetScaffold_bGncdBI$lambda42);
                                                            mapOf = MapsKt.mapOf(TuplesKt.to(Float.valueOf(f15 - m919BottomSheetScaffold_bGncdBI$lambda42.floatValue()), BottomSheetValue.Expanded), TuplesKt.to(Float.valueOf(f15 - f1222), BottomSheetValue.Collapsed));
                                                        } else {
                                                            mapOf = MapsKt.mapOf(TuplesKt.to(Float.valueOf(i49 - m919BottomSheetScaffold_bGncdBI$lambda4.floatValue()), BottomSheetValue.Collapsed));
                                                        }
                                                        m1182swipeablepPrIpRY = SwipeableKt.m1182swipeablepPrIpRY(Modifier.INSTANCE, bottomSheetScaffoldState422.getBottomSheetState(), r13, Orientation.Vertical, (r26 & 8) != 0 ? true : z622, (r26 & 16) != 0 ? false : false, (r26 & 32) != 0 ? null : null, (r26 & 64) != 0 ? new Function2<T, T, FixedThreshold>() { // from class: androidx.compose.material.SwipeableKt$swipeable$1
                                                            /* JADX WARN: Can't rename method to resolve collision */
                                                            @Override // kotlin.jvm.functions.Function2
                                                            public final FixedThreshold invoke(T t, T t2) {
                                                                return new FixedThreshold(Dp.m3840constructorimpl(56), null);
                                                            }
                                                        } : null, (r26 & 128) != 0 ? SwipeableDefaults.resistanceConfig$default(SwipeableDefaults.INSTANCE, mapOf.keySet(), 0.0f, 0.0f, 6, null) : null, (r26 & 256) != 0 ? SwipeableDefaults.INSTANCE.m1181getVelocityThresholdD9Ej5fM() : 0.0f);
                                                    }
                                                    Modifier m452requiredHeightInVpY3zN4$default = SizeKt.m452requiredHeightInVpY3zN4$default(SizeKt.fillMaxWidth$default(NestedScrollModifierKt.nestedScroll$default(Modifier.INSTANCE, bottomSheetScaffoldState422.getBottomSheetState().getNestedScrollConnection(), null, 2, null).then(m1182swipeablepPrIpRY).then(modifier622), 0.0f, 1, null), f132, 0.0f, 2, null);
                                                    final MutableState<Float> mutableState3 = mutableState2;
                                                    composer5.startReplaceableGroup(1157296644);
                                                    ComposerKt.sourceInformation(composer5, "C(remember)P(1):Composables.kt#9igjgp");
                                                    boolean changed = composer5.changed(mutableState3);
                                                    Object rememberedValue3 = composer5.rememberedValue();
                                                    if (changed || rememberedValue3 == Composer.INSTANCE.getEmpty()) {
                                                        rememberedValue3 = (Function1) new Function1<IntSize, Unit>() { // from class: androidx.compose.material.BottomSheetScaffoldKt$BottomSheetScaffold$child$1$1$1$1
                                                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                                            {
                                                                super(1);
                                                            }

                                                            @Override // kotlin.jvm.functions.Function1
                                                            public /* bridge */ /* synthetic */ Unit invoke(IntSize intSize) {
                                                                m924invokeozmzZPI(intSize.getPackedValue());
                                                                return Unit.INSTANCE;
                                                            }

                                                            /* renamed from: invoke-ozmzZPI, reason: not valid java name */
                                                            public final void m924invokeozmzZPI(long j3222) {
                                                                mutableState3.setValue(Float.valueOf(IntSize.m3999getHeightimpl(j3222)));
                                                            }
                                                        };
                                                        composer5.updateRememberedValue(rememberedValue3);
                                                    }
                                                    composer5.endReplaceableGroup();
                                                    Modifier onSizeChanged = OnRemeasuredModifierKt.onSizeChanged(m452requiredHeightInVpY3zN4$default, (Function1) rememberedValue3);
                                                    Shape shape82 = shape722;
                                                    long j3222 = j3022;
                                                    long j332 = j3122;
                                                    float f16 = f14;
                                                    final Function3<? super ColumnScope, ? super Composer, ? super Integer, Unit> function39 = function38;
                                                    final int i52 = i4722;
                                                    ComposableLambda composableLambda3 = ComposableLambdaKt.composableLambda(composer5, -698903261, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material.BottomSheetScaffoldKt.BottomSheetScaffold.child.1.1.2
                                                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                                        /* JADX WARN: Multi-variable type inference failed */
                                                        {
                                                            super(2);
                                                        }

                                                        @Override // kotlin.jvm.functions.Function2
                                                        public /* bridge */ /* synthetic */ Unit invoke(Composer composer6, Integer num) {
                                                            invoke(composer6, num.intValue());
                                                            return Unit.INSTANCE;
                                                        }

                                                        public final void invoke(Composer composer6, int i53) {
                                                            ComposerKt.sourceInformation(composer6, "C361@15529L30:BottomSheetScaffold.kt#jmzs0o");
                                                            if ((i53 & 11) == 2 && composer6.getSkipping()) {
                                                                composer6.skipToGroupEnd();
                                                                return;
                                                            }
                                                            Function3<ColumnScope, Composer, Integer, Unit> function310 = function39;
                                                            int i54 = (i52 << 9) & 7168;
                                                            composer6.startReplaceableGroup(-483455358);
                                                            ComposerKt.sourceInformation(composer6, "C(Column)P(2,3,1)77@3880L61,78@3946L133:Column.kt#2w3rfo");
                                                            Modifier.Companion companion3 = Modifier.INSTANCE;
                                                            MeasurePolicy columnMeasurePolicy = ColumnKt.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), Alignment.INSTANCE.getStart(), composer6, 0);
                                                            composer6.startReplaceableGroup(-1323940314);
                                                            ComposerKt.sourceInformation(composer6, "C(Layout)P(!1,2)74@2915L7,75@2970L7,76@3029L7,77@3041L460:Layout.kt#80mrfh");
                                                            ProvidableCompositionLocal<Density> localDensity222 = CompositionLocalsKt.getLocalDensity();
                                                            ComposerKt.sourceInformationMarkerStart(composer6, 2023513938, "C:CompositionLocal.kt#9igjgp");
                                                            Object consume222 = composer6.consume(localDensity222);
                                                            ComposerKt.sourceInformationMarkerEnd(composer6);
                                                            Density density = (Density) consume222;
                                                            ProvidableCompositionLocal<LayoutDirection> localLayoutDirection = CompositionLocalsKt.getLocalLayoutDirection();
                                                            ComposerKt.sourceInformationMarkerStart(composer6, 2023513938, "C:CompositionLocal.kt#9igjgp");
                                                            Object consume3 = composer6.consume(localLayoutDirection);
                                                            ComposerKt.sourceInformationMarkerEnd(composer6);
                                                            LayoutDirection layoutDirection = (LayoutDirection) consume3;
                                                            ProvidableCompositionLocal<ViewConfiguration> localViewConfiguration = CompositionLocalsKt.getLocalViewConfiguration();
                                                            ComposerKt.sourceInformationMarkerStart(composer6, 2023513938, "C:CompositionLocal.kt#9igjgp");
                                                            Object consume4 = composer6.consume(localViewConfiguration);
                                                            ComposerKt.sourceInformationMarkerEnd(composer6);
                                                            ViewConfiguration viewConfiguration = (ViewConfiguration) consume4;
                                                            Function0<ComposeUiNode> constructor = ComposeUiNode.INSTANCE.getConstructor();
                                                            Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> materializerOf = LayoutKt.materializerOf(companion3);
                                                            if (!(composer6.getApplier() instanceof Applier)) {
                                                                ComposablesKt.invalidApplier();
                                                            }
                                                            composer6.startReusableNode();
                                                            if (composer6.getInserting()) {
                                                                composer6.createNode(constructor);
                                                            } else {
                                                                composer6.useNode();
                                                            }
                                                            composer6.disableReusing();
                                                            Composer m1283constructorimpl = Updater.m1283constructorimpl(composer6);
                                                            Updater.m1290setimpl(m1283constructorimpl, columnMeasurePolicy, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
                                                            Updater.m1290setimpl(m1283constructorimpl, density, ComposeUiNode.INSTANCE.getSetDensity());
                                                            Updater.m1290setimpl(m1283constructorimpl, layoutDirection, ComposeUiNode.INSTANCE.getSetLayoutDirection());
                                                            Updater.m1290setimpl(m1283constructorimpl, viewConfiguration, ComposeUiNode.INSTANCE.getSetViewConfiguration());
                                                            composer6.enableReusing();
                                                            materializerOf.invoke(SkippableUpdater.m1273boximpl(SkippableUpdater.m1274constructorimpl(composer6)), composer6, 0);
                                                            composer6.startReplaceableGroup(2058660585);
                                                            composer6.startReplaceableGroup(-1163856341);
                                                            ComposerKt.sourceInformation(composer6, "C79@3994L9:Column.kt#2w3rfo");
                                                            function310.invoke(ColumnScopeInstance.INSTANCE, composer6, Integer.valueOf(((i54 >> 6) & 112) | 6));
                                                            composer6.endReplaceableGroup();
                                                            composer6.endReplaceableGroup();
                                                            composer6.endNode();
                                                            composer6.endReplaceableGroup();
                                                            composer6.endReplaceableGroup();
                                                        }
                                                    });
                                                    int i53 = i4722;
                                                    int i54 = i48;
                                                    SurfaceKt.m1172SurfaceFjzlyU(onSizeChanged, shape82, j3222, j332, null, f16, composableLambda3, composer5, ((i53 >> 21) & 112) | 1572864 | ((i54 << 6) & 896) | ((i54 << 6) & 7168) | ((i53 >> 12) & 458752), 16);
                                                    return;
                                                }
                                                composer5.skipToGroupEnd();
                                            }
                                        });
                                        Function2<Composer, Integer, Unit> function211 = function2922;
                                        final Function3<? super SnackbarHostState, ? super Composer, ? super Integer, Unit> function39 = function3622;
                                        final BottomSheetScaffoldState bottomSheetScaffoldState52 = BottomSheetScaffoldState.this;
                                        final int i49 = i4322;
                                        ComposableLambda composableLambda3 = ComposableLambdaKt.composableLambda(composer4, -486138068, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material.BottomSheetScaffoldKt$BottomSheetScaffold$child$1.2
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

                                            public final void invoke(Composer composer5, int i50) {
                                                ComposerKt.sourceInformation(composer5, "C365@15680L45:BottomSheetScaffold.kt#jmzs0o");
                                                if ((i50 & 11) == 2 && composer5.getSkipping()) {
                                                    composer5.skipToGroupEnd();
                                                } else {
                                                    function39.invoke(bottomSheetScaffoldState52.getSnackbarHostState(), composer5, Integer.valueOf((i49 >> 9) & 112));
                                                }
                                            }
                                        });
                                        float f15 = f1022;
                                        int i50 = i4222;
                                        int i51 = i4322;
                                        BottomSheetScaffoldKt.m918BottomSheetScaffoldLayoutKCBPh4w(function210, function3722, composableLambda222, function211, composableLambda3, f15, i50, offset, bottomSheetState, composer4, ((i51 >> 9) & 14) | 24960 | ((i4422 >> 3) & 112) | ((i51 >> 6) & 7168) | ((i4522 << 9) & 458752) | (i51 & 3670016));
                                        return;
                                    }
                                    composer4.skipToGroupEnd();
                                }
                            });
                            Modifier modifier622 = modifier3;
                            final Function3<? super ColumnScope, ? super Composer, ? super Integer, Unit> function3722 = function34;
                            final BottomSheetScaffoldState bottomSheetScaffoldState422 = bottomSheetScaffoldState2;
                            final boolean z622 = z4;
                            final Shape shape722 = shape4;
                            final float f1222 = f6;
                            final long j3022 = j17;
                            final long j3122 = j13;
                            final long j3222 = j20;
                            final int i4622 = i21;
                            int i4722 = i33 << 6;
                            SurfaceKt.m1172SurfaceFjzlyU(SizeKt.fillMaxSize$default(modifier622, 0.0f, 1, null), null, j19, j18, null, 0.0f, ComposableLambdaKt.composableLambda(composer3, 1273816607, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material.BottomSheetScaffoldKt$BottomSheetScaffold$1
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

                                public final void invoke(Composer composer4, int i48) {
                                    ComposerKt.sourceInformation(composer4, "C:BottomSheetScaffold.kt#jmzs0o");
                                    if ((i48 & 11) != 2 || !composer4.getSkipping()) {
                                        if (function3722 == null) {
                                            composer4.startReplaceableGroup(-249544858);
                                            ComposerKt.sourceInformation(composer4, "381@16183L7");
                                            composableLambda22.invoke(composer4, 6);
                                            composer4.endReplaceableGroup();
                                            return;
                                        }
                                        composer4.startReplaceableGroup(-249544821);
                                        ComposerKt.sourceInformation(composer4, "383@16220L480");
                                        Function3<ColumnScope, Composer, Integer, Unit> function38 = function3722;
                                        DrawerState drawerState = bottomSheetScaffoldState422.getDrawerState();
                                        boolean z72 = z622;
                                        Shape shape82 = shape722;
                                        float f132 = f1222;
                                        long j332 = j3022;
                                        long j34 = j3122;
                                        long j35 = j3222;
                                        Function2<Composer, Integer, Unit> function210 = composableLambda22;
                                        int i49 = i4622;
                                        DrawerKt.m1025ModalDrawerGs3lGvM(function38, null, drawerState, z72, shape82, f132, j332, j34, j35, function210, composer4, ((i49 >> 3) & 7168) | ((i49 >> 9) & 14) | C.ENCODING_PCM_32BIT | ((i49 >> 3) & 57344) | ((i49 >> 3) & 458752) | ((i49 >> 3) & 3670016) | ((i49 >> 3) & 29360128) | ((i49 >> 3) & 234881024), 2);
                                        composer4.endReplaceableGroup();
                                        return;
                                    }
                                    composer4.skipToGroupEnd();
                                }
                            }), composer3, (i4722 & 7168) | (i4722 & 896) | 1572864, 50);
                            f7 = f5;
                            j21 = j10;
                            shape5 = shape4;
                            f8 = f6;
                            j22 = j17;
                            j23 = j20;
                            j24 = j19;
                            function25 = function24;
                            modifier4 = modifier622;
                            j25 = j11;
                            j26 = j18;
                            endRestartGroup = composer3.endRestartGroup();
                            if (endRestartGroup != null) {
                            }
                        }
                        i17 = i5 & 8192;
                        if (i17 == 0) {
                        }
                        i18 = i5 & 16384;
                        if (i18 != 0) {
                        }
                        i19 = i18;
                        if ((i3 & 458752) == 0) {
                        }
                        i20 = i5 & 65536;
                        if (i20 == 0) {
                        }
                        if ((i3 & 29360128) == 0) {
                        }
                        if ((i3 & 234881024) == 0) {
                        }
                        if ((i3 & 1879048192) == 0) {
                        }
                        i21 = i15;
                        if ((i4 & 14) != 0) {
                        }
                        if ((i4 & 112) != 0) {
                        }
                        if ((i5 & 4194304) == 0) {
                        }
                        if ((1533916891 & i6) == 306783378) {
                        }
                        startRestartGroup.startDefaults();
                        if ((i2 & 1) != 0) {
                        }
                        if (i36 == 0) {
                        }
                        if ((i5 & 4) == 0) {
                        }
                        if (i7 == 0) {
                        }
                        if (i8 == 0) {
                        }
                        if (i9 == 0) {
                        }
                        if (i10 == 0) {
                        }
                        if (i26 == 0) {
                        }
                        if ((i5 & 256) == 0) {
                        }
                        if (i28 == 0) {
                        }
                        if ((i5 & 1024) == 0) {
                        }
                        Function2<? super Composer, ? super Integer, Unit> function27222 = function26;
                        if ((i5 & 2048) == 0) {
                        }
                        if (i16 == 0) {
                        }
                        if (i25 == 0) {
                        }
                        if (i27 == 0) {
                        }
                        float f9222 = m916getSheetPeekHeightD9Ej5fM;
                        if ((i5 & 32768) == 0) {
                        }
                        if (i20 == 0) {
                        }
                        if ((i5 & 131072) == 0) {
                        }
                        if ((262144 & i5) == 0) {
                        }
                        if ((i5 & 524288) == 0) {
                        }
                        long j27222 = j15;
                        if ((i5 & 1048576) == 0) {
                        }
                        if ((2097152 & i5) == 0) {
                        }
                        startRestartGroup.endDefaults();
                        startRestartGroup.startReplaceableGroup(773894976);
                        ComposerKt.sourceInformation(startRestartGroup, "C(rememberCoroutineScope)475@19849L144:Effects.kt#9igjgp");
                        startRestartGroup.startReplaceableGroup(-492369756);
                        ComposerKt.sourceInformation(startRestartGroup, "C(remember):Composables.kt#9igjgp");
                        rememberedValue = startRestartGroup.rememberedValue();
                        if (rememberedValue == Composer.INSTANCE.getEmpty()) {
                        }
                        startRestartGroup.endReplaceableGroup();
                        final CoroutineScope coroutineScope222 = ((CompositionScopedCoroutineScopeCanceller) rememberedValue).getCoroutineScope();
                        startRestartGroup.endReplaceableGroup();
                        ProvidableCompositionLocal<Density> localDensity222 = CompositionLocalsKt.getLocalDensity();
                        ComposerKt.sourceInformationMarkerStart(startRestartGroup, 2023513938, "C:CompositionLocal.kt#9igjgp");
                        Object consume222 = startRestartGroup.consume(localDensity222);
                        ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                        mo315toPx0680j_4 = ((Density) consume222).mo315toPx0680j_4(f5);
                        startRestartGroup.startReplaceableGroup(-492369756);
                        ComposerKt.sourceInformation(startRestartGroup, "C(remember):Composables.kt#9igjgp");
                        rememberedValue2 = startRestartGroup.rememberedValue();
                        if (rememberedValue2 != Composer.INSTANCE.getEmpty()) {
                        }
                        startRestartGroup.endReplaceableGroup();
                        mutableState = (MutableState) obj;
                        if (Intrinsics.areEqual(mo315toPx0680j_4, m919BottomSheetScaffold_bGncdBI$lambda4(mutableState))) {
                        }
                        final BottomSheetScaffoldState bottomSheetScaffoldState3222 = bottomSheetScaffoldState2;
                        final Function2<? super Composer, ? super Integer, Unit> function28222 = function24;
                        final Function2<? super Composer, ? super Integer, Unit> function29222 = function23;
                        final float f10222 = f5;
                        final int i42222 = m1064getEnd5ygKITE;
                        final int i43222 = i32;
                        final int i44222 = i33;
                        final int i45222 = i21;
                        final boolean z5222 = z3;
                        final Modifier companion2222 = companion;
                        final Shape shape6222 = cornerBasedShape;
                        final long j28222 = j11;
                        final long j29222 = j10;
                        final float f11222 = m915getSheetElevationD9Ej5fM;
                        final Function3<? super SnackbarHostState, ? super Composer, ? super Integer, Unit> function36222 = m1001getLambda1$material_release;
                        composer3 = composer2;
                        final Function2<? super Composer, ? super Integer, Unit> composableLambda222 = ComposableLambdaKt.composableLambda(composer3, 893101063, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material.BottomSheetScaffoldKt$BottomSheetScaffold$child$1
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

                            public final void invoke(Composer composer4, int i46222) {
                                ComposerKt.sourceInformation(composer4, "C316@13233L2758:BottomSheetScaffold.kt#jmzs0o");
                                if ((i46222 & 11) != 2 || !composer4.getSkipping()) {
                                    State<Float> offset = BottomSheetScaffoldState.this.getBottomSheetState().getOffset();
                                    BottomSheetState bottomSheetState = BottomSheetScaffoldState.this.getBottomSheetState();
                                    Function2<Composer, Integer, Unit> function210 = function28222;
                                    Function3<PaddingValues, Composer, Integer, Unit> function37222 = content;
                                    final float f12222 = mo315toPx0680j_4;
                                    final BottomSheetScaffoldState bottomSheetScaffoldState4222 = BottomSheetScaffoldState.this;
                                    final boolean z6222 = z5222;
                                    final Modifier modifier6222 = companion2222;
                                    final float f132 = f10222;
                                    final MutableState<Float> mutableState2 = mutableState;
                                    final Shape shape7222 = shape6222;
                                    final long j30222 = j28222;
                                    final long j31222 = j29222;
                                    final float f14 = f11222;
                                    final int i47222 = i43222;
                                    final int i48 = i45222;
                                    final Function3<? super ColumnScope, ? super Composer, ? super Integer, Unit> function38 = sheetContent;
                                    ComposableLambda composableLambda2222 = ComposableLambdaKt.composableLambda(composer4, -1378534681, true, new Function3<Integer, Composer, Integer, Unit>() { // from class: androidx.compose.material.BottomSheetScaffoldKt$BottomSheetScaffold$child$1.1
                                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                        /* JADX WARN: Multi-variable type inference failed */
                                        {
                                            super(3);
                                        }

                                        @Override // kotlin.jvm.functions.Function3
                                        public /* bridge */ /* synthetic */ Unit invoke(Integer num, Composer composer5, Integer num2) {
                                            invoke(num.intValue(), composer5, num2.intValue());
                                            return Unit.INSTANCE;
                                        }

                                        public final void invoke(int i49, Composer composer5, int i50) {
                                            int i51;
                                            Float m919BottomSheetScaffold_bGncdBI$lambda4;
                                            Float m919BottomSheetScaffold_bGncdBI$lambda42;
                                            Map mapOf;
                                            Modifier.Companion m1182swipeablepPrIpRY;
                                            ComposerKt.sourceInformation(composer5, "C354@15208L95,347@14851L711:BottomSheetScaffold.kt#jmzs0o");
                                            if ((i50 & 14) == 0) {
                                                i51 = i50 | (composer5.changed(i49) ? 4 : 2);
                                            } else {
                                                i51 = i50;
                                            }
                                            if ((i51 & 91) != 18 || !composer5.getSkipping()) {
                                                m919BottomSheetScaffold_bGncdBI$lambda4 = BottomSheetScaffoldKt.m919BottomSheetScaffold_bGncdBI$lambda4(mutableState2);
                                                if (m919BottomSheetScaffold_bGncdBI$lambda4 == null) {
                                                    m1182swipeablepPrIpRY = Modifier.INSTANCE;
                                                } else {
                                                    if (MathKt.roundToInt(m919BottomSheetScaffold_bGncdBI$lambda4.floatValue()) != MathKt.roundToInt(f12222)) {
                                                        float f15 = i49;
                                                        m919BottomSheetScaffold_bGncdBI$lambda42 = BottomSheetScaffoldKt.m919BottomSheetScaffold_bGncdBI$lambda4(mutableState2);
                                                        Intrinsics.checkNotNull(m919BottomSheetScaffold_bGncdBI$lambda42);
                                                        mapOf = MapsKt.mapOf(TuplesKt.to(Float.valueOf(f15 - m919BottomSheetScaffold_bGncdBI$lambda42.floatValue()), BottomSheetValue.Expanded), TuplesKt.to(Float.valueOf(f15 - f12222), BottomSheetValue.Collapsed));
                                                    } else {
                                                        mapOf = MapsKt.mapOf(TuplesKt.to(Float.valueOf(i49 - m919BottomSheetScaffold_bGncdBI$lambda4.floatValue()), BottomSheetValue.Collapsed));
                                                    }
                                                    m1182swipeablepPrIpRY = SwipeableKt.m1182swipeablepPrIpRY(Modifier.INSTANCE, bottomSheetScaffoldState4222.getBottomSheetState(), r13, Orientation.Vertical, (r26 & 8) != 0 ? true : z6222, (r26 & 16) != 0 ? false : false, (r26 & 32) != 0 ? null : null, (r26 & 64) != 0 ? new Function2<T, T, FixedThreshold>() { // from class: androidx.compose.material.SwipeableKt$swipeable$1
                                                        /* JADX WARN: Can't rename method to resolve collision */
                                                        @Override // kotlin.jvm.functions.Function2
                                                        public final FixedThreshold invoke(T t, T t2) {
                                                            return new FixedThreshold(Dp.m3840constructorimpl(56), null);
                                                        }
                                                    } : null, (r26 & 128) != 0 ? SwipeableDefaults.resistanceConfig$default(SwipeableDefaults.INSTANCE, mapOf.keySet(), 0.0f, 0.0f, 6, null) : null, (r26 & 256) != 0 ? SwipeableDefaults.INSTANCE.m1181getVelocityThresholdD9Ej5fM() : 0.0f);
                                                }
                                                Modifier m452requiredHeightInVpY3zN4$default = SizeKt.m452requiredHeightInVpY3zN4$default(SizeKt.fillMaxWidth$default(NestedScrollModifierKt.nestedScroll$default(Modifier.INSTANCE, bottomSheetScaffoldState4222.getBottomSheetState().getNestedScrollConnection(), null, 2, null).then(m1182swipeablepPrIpRY).then(modifier6222), 0.0f, 1, null), f132, 0.0f, 2, null);
                                                final MutableState<Float> mutableState3 = mutableState2;
                                                composer5.startReplaceableGroup(1157296644);
                                                ComposerKt.sourceInformation(composer5, "C(remember)P(1):Composables.kt#9igjgp");
                                                boolean changed = composer5.changed(mutableState3);
                                                Object rememberedValue3 = composer5.rememberedValue();
                                                if (changed || rememberedValue3 == Composer.INSTANCE.getEmpty()) {
                                                    rememberedValue3 = (Function1) new Function1<IntSize, Unit>() { // from class: androidx.compose.material.BottomSheetScaffoldKt$BottomSheetScaffold$child$1$1$1$1
                                                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                                        {
                                                            super(1);
                                                        }

                                                        @Override // kotlin.jvm.functions.Function1
                                                        public /* bridge */ /* synthetic */ Unit invoke(IntSize intSize) {
                                                            m924invokeozmzZPI(intSize.getPackedValue());
                                                            return Unit.INSTANCE;
                                                        }

                                                        /* renamed from: invoke-ozmzZPI, reason: not valid java name */
                                                        public final void m924invokeozmzZPI(long j32222) {
                                                            mutableState3.setValue(Float.valueOf(IntSize.m3999getHeightimpl(j32222)));
                                                        }
                                                    };
                                                    composer5.updateRememberedValue(rememberedValue3);
                                                }
                                                composer5.endReplaceableGroup();
                                                Modifier onSizeChanged = OnRemeasuredModifierKt.onSizeChanged(m452requiredHeightInVpY3zN4$default, (Function1) rememberedValue3);
                                                Shape shape82 = shape7222;
                                                long j32222 = j30222;
                                                long j332 = j31222;
                                                float f16 = f14;
                                                final Function3<? super ColumnScope, ? super Composer, ? super Integer, Unit> function39 = function38;
                                                final int i52 = i47222;
                                                ComposableLambda composableLambda3 = ComposableLambdaKt.composableLambda(composer5, -698903261, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material.BottomSheetScaffoldKt.BottomSheetScaffold.child.1.1.2
                                                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                                    /* JADX WARN: Multi-variable type inference failed */
                                                    {
                                                        super(2);
                                                    }

                                                    @Override // kotlin.jvm.functions.Function2
                                                    public /* bridge */ /* synthetic */ Unit invoke(Composer composer6, Integer num) {
                                                        invoke(composer6, num.intValue());
                                                        return Unit.INSTANCE;
                                                    }

                                                    public final void invoke(Composer composer6, int i53) {
                                                        ComposerKt.sourceInformation(composer6, "C361@15529L30:BottomSheetScaffold.kt#jmzs0o");
                                                        if ((i53 & 11) == 2 && composer6.getSkipping()) {
                                                            composer6.skipToGroupEnd();
                                                            return;
                                                        }
                                                        Function3<ColumnScope, Composer, Integer, Unit> function310 = function39;
                                                        int i54 = (i52 << 9) & 7168;
                                                        composer6.startReplaceableGroup(-483455358);
                                                        ComposerKt.sourceInformation(composer6, "C(Column)P(2,3,1)77@3880L61,78@3946L133:Column.kt#2w3rfo");
                                                        Modifier.Companion companion3 = Modifier.INSTANCE;
                                                        MeasurePolicy columnMeasurePolicy = ColumnKt.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), Alignment.INSTANCE.getStart(), composer6, 0);
                                                        composer6.startReplaceableGroup(-1323940314);
                                                        ComposerKt.sourceInformation(composer6, "C(Layout)P(!1,2)74@2915L7,75@2970L7,76@3029L7,77@3041L460:Layout.kt#80mrfh");
                                                        ProvidableCompositionLocal<Density> localDensity2222 = CompositionLocalsKt.getLocalDensity();
                                                        ComposerKt.sourceInformationMarkerStart(composer6, 2023513938, "C:CompositionLocal.kt#9igjgp");
                                                        Object consume2222 = composer6.consume(localDensity2222);
                                                        ComposerKt.sourceInformationMarkerEnd(composer6);
                                                        Density density = (Density) consume2222;
                                                        ProvidableCompositionLocal<LayoutDirection> localLayoutDirection = CompositionLocalsKt.getLocalLayoutDirection();
                                                        ComposerKt.sourceInformationMarkerStart(composer6, 2023513938, "C:CompositionLocal.kt#9igjgp");
                                                        Object consume3 = composer6.consume(localLayoutDirection);
                                                        ComposerKt.sourceInformationMarkerEnd(composer6);
                                                        LayoutDirection layoutDirection = (LayoutDirection) consume3;
                                                        ProvidableCompositionLocal<ViewConfiguration> localViewConfiguration = CompositionLocalsKt.getLocalViewConfiguration();
                                                        ComposerKt.sourceInformationMarkerStart(composer6, 2023513938, "C:CompositionLocal.kt#9igjgp");
                                                        Object consume4 = composer6.consume(localViewConfiguration);
                                                        ComposerKt.sourceInformationMarkerEnd(composer6);
                                                        ViewConfiguration viewConfiguration = (ViewConfiguration) consume4;
                                                        Function0<ComposeUiNode> constructor = ComposeUiNode.INSTANCE.getConstructor();
                                                        Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> materializerOf = LayoutKt.materializerOf(companion3);
                                                        if (!(composer6.getApplier() instanceof Applier)) {
                                                            ComposablesKt.invalidApplier();
                                                        }
                                                        composer6.startReusableNode();
                                                        if (composer6.getInserting()) {
                                                            composer6.createNode(constructor);
                                                        } else {
                                                            composer6.useNode();
                                                        }
                                                        composer6.disableReusing();
                                                        Composer m1283constructorimpl = Updater.m1283constructorimpl(composer6);
                                                        Updater.m1290setimpl(m1283constructorimpl, columnMeasurePolicy, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
                                                        Updater.m1290setimpl(m1283constructorimpl, density, ComposeUiNode.INSTANCE.getSetDensity());
                                                        Updater.m1290setimpl(m1283constructorimpl, layoutDirection, ComposeUiNode.INSTANCE.getSetLayoutDirection());
                                                        Updater.m1290setimpl(m1283constructorimpl, viewConfiguration, ComposeUiNode.INSTANCE.getSetViewConfiguration());
                                                        composer6.enableReusing();
                                                        materializerOf.invoke(SkippableUpdater.m1273boximpl(SkippableUpdater.m1274constructorimpl(composer6)), composer6, 0);
                                                        composer6.startReplaceableGroup(2058660585);
                                                        composer6.startReplaceableGroup(-1163856341);
                                                        ComposerKt.sourceInformation(composer6, "C79@3994L9:Column.kt#2w3rfo");
                                                        function310.invoke(ColumnScopeInstance.INSTANCE, composer6, Integer.valueOf(((i54 >> 6) & 112) | 6));
                                                        composer6.endReplaceableGroup();
                                                        composer6.endReplaceableGroup();
                                                        composer6.endNode();
                                                        composer6.endReplaceableGroup();
                                                        composer6.endReplaceableGroup();
                                                    }
                                                });
                                                int i53 = i47222;
                                                int i54 = i48;
                                                SurfaceKt.m1172SurfaceFjzlyU(onSizeChanged, shape82, j32222, j332, null, f16, composableLambda3, composer5, ((i53 >> 21) & 112) | 1572864 | ((i54 << 6) & 896) | ((i54 << 6) & 7168) | ((i53 >> 12) & 458752), 16);
                                                return;
                                            }
                                            composer5.skipToGroupEnd();
                                        }
                                    });
                                    Function2<Composer, Integer, Unit> function211 = function29222;
                                    final Function3<? super SnackbarHostState, ? super Composer, ? super Integer, Unit> function39 = function36222;
                                    final BottomSheetScaffoldState bottomSheetScaffoldState52 = BottomSheetScaffoldState.this;
                                    final int i49 = i43222;
                                    ComposableLambda composableLambda3 = ComposableLambdaKt.composableLambda(composer4, -486138068, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material.BottomSheetScaffoldKt$BottomSheetScaffold$child$1.2
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

                                        public final void invoke(Composer composer5, int i50) {
                                            ComposerKt.sourceInformation(composer5, "C365@15680L45:BottomSheetScaffold.kt#jmzs0o");
                                            if ((i50 & 11) == 2 && composer5.getSkipping()) {
                                                composer5.skipToGroupEnd();
                                            } else {
                                                function39.invoke(bottomSheetScaffoldState52.getSnackbarHostState(), composer5, Integer.valueOf((i49 >> 9) & 112));
                                            }
                                        }
                                    });
                                    float f15 = f10222;
                                    int i50 = i42222;
                                    int i51 = i43222;
                                    BottomSheetScaffoldKt.m918BottomSheetScaffoldLayoutKCBPh4w(function210, function37222, composableLambda2222, function211, composableLambda3, f15, i50, offset, bottomSheetState, composer4, ((i51 >> 9) & 14) | 24960 | ((i44222 >> 3) & 112) | ((i51 >> 6) & 7168) | ((i45222 << 9) & 458752) | (i51 & 3670016));
                                    return;
                                }
                                composer4.skipToGroupEnd();
                            }
                        });
                        Modifier modifier6222 = modifier3;
                        final Function3<? super ColumnScope, ? super Composer, ? super Integer, Unit> function37222 = function34;
                        final BottomSheetScaffoldState bottomSheetScaffoldState4222 = bottomSheetScaffoldState2;
                        final boolean z6222 = z4;
                        final Shape shape7222 = shape4;
                        final float f12222 = f6;
                        final long j30222 = j17;
                        final long j31222 = j13;
                        final long j32222 = j20;
                        final int i46222 = i21;
                        int i47222 = i33 << 6;
                        SurfaceKt.m1172SurfaceFjzlyU(SizeKt.fillMaxSize$default(modifier6222, 0.0f, 1, null), null, j19, j18, null, 0.0f, ComposableLambdaKt.composableLambda(composer3, 1273816607, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material.BottomSheetScaffoldKt$BottomSheetScaffold$1
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

                            public final void invoke(Composer composer4, int i48) {
                                ComposerKt.sourceInformation(composer4, "C:BottomSheetScaffold.kt#jmzs0o");
                                if ((i48 & 11) != 2 || !composer4.getSkipping()) {
                                    if (function37222 == null) {
                                        composer4.startReplaceableGroup(-249544858);
                                        ComposerKt.sourceInformation(composer4, "381@16183L7");
                                        composableLambda222.invoke(composer4, 6);
                                        composer4.endReplaceableGroup();
                                        return;
                                    }
                                    composer4.startReplaceableGroup(-249544821);
                                    ComposerKt.sourceInformation(composer4, "383@16220L480");
                                    Function3<ColumnScope, Composer, Integer, Unit> function38 = function37222;
                                    DrawerState drawerState = bottomSheetScaffoldState4222.getDrawerState();
                                    boolean z72 = z6222;
                                    Shape shape82 = shape7222;
                                    float f132 = f12222;
                                    long j332 = j30222;
                                    long j34 = j31222;
                                    long j35 = j32222;
                                    Function2<Composer, Integer, Unit> function210 = composableLambda222;
                                    int i49 = i46222;
                                    DrawerKt.m1025ModalDrawerGs3lGvM(function38, null, drawerState, z72, shape82, f132, j332, j34, j35, function210, composer4, ((i49 >> 3) & 7168) | ((i49 >> 9) & 14) | C.ENCODING_PCM_32BIT | ((i49 >> 3) & 57344) | ((i49 >> 3) & 458752) | ((i49 >> 3) & 3670016) | ((i49 >> 3) & 29360128) | ((i49 >> 3) & 234881024), 2);
                                    composer4.endReplaceableGroup();
                                    return;
                                }
                                composer4.skipToGroupEnd();
                            }
                        }), composer3, (i47222 & 7168) | (i47222 & 896) | 1572864, 50);
                        f7 = f5;
                        j21 = j10;
                        shape5 = shape4;
                        f8 = f6;
                        j22 = j17;
                        j23 = j20;
                        j24 = j19;
                        function25 = function24;
                        modifier4 = modifier6222;
                        j25 = j11;
                        j26 = j18;
                        endRestartGroup = composer3.endRestartGroup();
                        if (endRestartGroup != null) {
                        }
                    }
                    i14 = i13;
                    if ((i3 & 14) == 0) {
                    }
                    if ((i3 & 112) == 0) {
                    }
                    i16 = i5 & 4096;
                    if (i16 != 0) {
                    }
                    i17 = i5 & 8192;
                    if (i17 == 0) {
                    }
                    i18 = i5 & 16384;
                    if (i18 != 0) {
                    }
                    i19 = i18;
                    if ((i3 & 458752) == 0) {
                    }
                    i20 = i5 & 65536;
                    if (i20 == 0) {
                    }
                    if ((i3 & 29360128) == 0) {
                    }
                    if ((i3 & 234881024) == 0) {
                    }
                    if ((i3 & 1879048192) == 0) {
                    }
                    i21 = i15;
                    if ((i4 & 14) != 0) {
                    }
                    if ((i4 & 112) != 0) {
                    }
                    if ((i5 & 4194304) == 0) {
                    }
                    if ((1533916891 & i6) == 306783378) {
                    }
                    startRestartGroup.startDefaults();
                    if ((i2 & 1) != 0) {
                    }
                    if (i36 == 0) {
                    }
                    if ((i5 & 4) == 0) {
                    }
                    if (i7 == 0) {
                    }
                    if (i8 == 0) {
                    }
                    if (i9 == 0) {
                    }
                    if (i10 == 0) {
                    }
                    if (i26 == 0) {
                    }
                    if ((i5 & 256) == 0) {
                    }
                    if (i28 == 0) {
                    }
                    if ((i5 & 1024) == 0) {
                    }
                    Function2<? super Composer, ? super Integer, Unit> function272222 = function26;
                    if ((i5 & 2048) == 0) {
                    }
                    if (i16 == 0) {
                    }
                    if (i25 == 0) {
                    }
                    if (i27 == 0) {
                    }
                    float f92222 = m916getSheetPeekHeightD9Ej5fM;
                    if ((i5 & 32768) == 0) {
                    }
                    if (i20 == 0) {
                    }
                    if ((i5 & 131072) == 0) {
                    }
                    if ((262144 & i5) == 0) {
                    }
                    if ((i5 & 524288) == 0) {
                    }
                    long j272222 = j15;
                    if ((i5 & 1048576) == 0) {
                    }
                    if ((2097152 & i5) == 0) {
                    }
                    startRestartGroup.endDefaults();
                    startRestartGroup.startReplaceableGroup(773894976);
                    ComposerKt.sourceInformation(startRestartGroup, "C(rememberCoroutineScope)475@19849L144:Effects.kt#9igjgp");
                    startRestartGroup.startReplaceableGroup(-492369756);
                    ComposerKt.sourceInformation(startRestartGroup, "C(remember):Composables.kt#9igjgp");
                    rememberedValue = startRestartGroup.rememberedValue();
                    if (rememberedValue == Composer.INSTANCE.getEmpty()) {
                    }
                    startRestartGroup.endReplaceableGroup();
                    final CoroutineScope coroutineScope2222 = ((CompositionScopedCoroutineScopeCanceller) rememberedValue).getCoroutineScope();
                    startRestartGroup.endReplaceableGroup();
                    ProvidableCompositionLocal<Density> localDensity2222 = CompositionLocalsKt.getLocalDensity();
                    ComposerKt.sourceInformationMarkerStart(startRestartGroup, 2023513938, "C:CompositionLocal.kt#9igjgp");
                    Object consume2222 = startRestartGroup.consume(localDensity2222);
                    ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                    mo315toPx0680j_4 = ((Density) consume2222).mo315toPx0680j_4(f5);
                    startRestartGroup.startReplaceableGroup(-492369756);
                    ComposerKt.sourceInformation(startRestartGroup, "C(remember):Composables.kt#9igjgp");
                    rememberedValue2 = startRestartGroup.rememberedValue();
                    if (rememberedValue2 != Composer.INSTANCE.getEmpty()) {
                    }
                    startRestartGroup.endReplaceableGroup();
                    mutableState = (MutableState) obj;
                    if (Intrinsics.areEqual(mo315toPx0680j_4, m919BottomSheetScaffold_bGncdBI$lambda4(mutableState))) {
                    }
                    final BottomSheetScaffoldState bottomSheetScaffoldState32222 = bottomSheetScaffoldState2;
                    final Function2<? super Composer, ? super Integer, Unit> function282222 = function24;
                    final Function2<? super Composer, ? super Integer, Unit> function292222 = function23;
                    final float f102222 = f5;
                    final int i422222 = m1064getEnd5ygKITE;
                    final int i432222 = i32;
                    final int i442222 = i33;
                    final int i452222 = i21;
                    final boolean z52222 = z3;
                    final Modifier companion22222 = companion;
                    final Shape shape62222 = cornerBasedShape;
                    final long j282222 = j11;
                    final long j292222 = j10;
                    final float f112222 = m915getSheetElevationD9Ej5fM;
                    final Function3<? super SnackbarHostState, ? super Composer, ? super Integer, Unit> function362222 = m1001getLambda1$material_release;
                    composer3 = composer2;
                    final Function2<? super Composer, ? super Integer, Unit> composableLambda2222 = ComposableLambdaKt.composableLambda(composer3, 893101063, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material.BottomSheetScaffoldKt$BottomSheetScaffold$child$1
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

                        public final void invoke(Composer composer4, int i462222) {
                            ComposerKt.sourceInformation(composer4, "C316@13233L2758:BottomSheetScaffold.kt#jmzs0o");
                            if ((i462222 & 11) != 2 || !composer4.getSkipping()) {
                                State<Float> offset = BottomSheetScaffoldState.this.getBottomSheetState().getOffset();
                                BottomSheetState bottomSheetState = BottomSheetScaffoldState.this.getBottomSheetState();
                                Function2<Composer, Integer, Unit> function210 = function282222;
                                Function3<PaddingValues, Composer, Integer, Unit> function372222 = content;
                                final float f122222 = mo315toPx0680j_4;
                                final BottomSheetScaffoldState bottomSheetScaffoldState42222 = BottomSheetScaffoldState.this;
                                final boolean z62222 = z52222;
                                final Modifier modifier62222 = companion22222;
                                final float f132 = f102222;
                                final MutableState<Float> mutableState2 = mutableState;
                                final Shape shape72222 = shape62222;
                                final long j302222 = j282222;
                                final long j312222 = j292222;
                                final float f14 = f112222;
                                final int i472222 = i432222;
                                final int i48 = i452222;
                                final Function3<? super ColumnScope, ? super Composer, ? super Integer, Unit> function38 = sheetContent;
                                ComposableLambda composableLambda22222 = ComposableLambdaKt.composableLambda(composer4, -1378534681, true, new Function3<Integer, Composer, Integer, Unit>() { // from class: androidx.compose.material.BottomSheetScaffoldKt$BottomSheetScaffold$child$1.1
                                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                    /* JADX WARN: Multi-variable type inference failed */
                                    {
                                        super(3);
                                    }

                                    @Override // kotlin.jvm.functions.Function3
                                    public /* bridge */ /* synthetic */ Unit invoke(Integer num, Composer composer5, Integer num2) {
                                        invoke(num.intValue(), composer5, num2.intValue());
                                        return Unit.INSTANCE;
                                    }

                                    public final void invoke(int i49, Composer composer5, int i50) {
                                        int i51;
                                        Float m919BottomSheetScaffold_bGncdBI$lambda4;
                                        Float m919BottomSheetScaffold_bGncdBI$lambda42;
                                        Map mapOf;
                                        Modifier.Companion m1182swipeablepPrIpRY;
                                        ComposerKt.sourceInformation(composer5, "C354@15208L95,347@14851L711:BottomSheetScaffold.kt#jmzs0o");
                                        if ((i50 & 14) == 0) {
                                            i51 = i50 | (composer5.changed(i49) ? 4 : 2);
                                        } else {
                                            i51 = i50;
                                        }
                                        if ((i51 & 91) != 18 || !composer5.getSkipping()) {
                                            m919BottomSheetScaffold_bGncdBI$lambda4 = BottomSheetScaffoldKt.m919BottomSheetScaffold_bGncdBI$lambda4(mutableState2);
                                            if (m919BottomSheetScaffold_bGncdBI$lambda4 == null) {
                                                m1182swipeablepPrIpRY = Modifier.INSTANCE;
                                            } else {
                                                if (MathKt.roundToInt(m919BottomSheetScaffold_bGncdBI$lambda4.floatValue()) != MathKt.roundToInt(f122222)) {
                                                    float f15 = i49;
                                                    m919BottomSheetScaffold_bGncdBI$lambda42 = BottomSheetScaffoldKt.m919BottomSheetScaffold_bGncdBI$lambda4(mutableState2);
                                                    Intrinsics.checkNotNull(m919BottomSheetScaffold_bGncdBI$lambda42);
                                                    mapOf = MapsKt.mapOf(TuplesKt.to(Float.valueOf(f15 - m919BottomSheetScaffold_bGncdBI$lambda42.floatValue()), BottomSheetValue.Expanded), TuplesKt.to(Float.valueOf(f15 - f122222), BottomSheetValue.Collapsed));
                                                } else {
                                                    mapOf = MapsKt.mapOf(TuplesKt.to(Float.valueOf(i49 - m919BottomSheetScaffold_bGncdBI$lambda4.floatValue()), BottomSheetValue.Collapsed));
                                                }
                                                m1182swipeablepPrIpRY = SwipeableKt.m1182swipeablepPrIpRY(Modifier.INSTANCE, bottomSheetScaffoldState42222.getBottomSheetState(), r13, Orientation.Vertical, (r26 & 8) != 0 ? true : z62222, (r26 & 16) != 0 ? false : false, (r26 & 32) != 0 ? null : null, (r26 & 64) != 0 ? new Function2<T, T, FixedThreshold>() { // from class: androidx.compose.material.SwipeableKt$swipeable$1
                                                    /* JADX WARN: Can't rename method to resolve collision */
                                                    @Override // kotlin.jvm.functions.Function2
                                                    public final FixedThreshold invoke(T t, T t2) {
                                                        return new FixedThreshold(Dp.m3840constructorimpl(56), null);
                                                    }
                                                } : null, (r26 & 128) != 0 ? SwipeableDefaults.resistanceConfig$default(SwipeableDefaults.INSTANCE, mapOf.keySet(), 0.0f, 0.0f, 6, null) : null, (r26 & 256) != 0 ? SwipeableDefaults.INSTANCE.m1181getVelocityThresholdD9Ej5fM() : 0.0f);
                                            }
                                            Modifier m452requiredHeightInVpY3zN4$default = SizeKt.m452requiredHeightInVpY3zN4$default(SizeKt.fillMaxWidth$default(NestedScrollModifierKt.nestedScroll$default(Modifier.INSTANCE, bottomSheetScaffoldState42222.getBottomSheetState().getNestedScrollConnection(), null, 2, null).then(m1182swipeablepPrIpRY).then(modifier62222), 0.0f, 1, null), f132, 0.0f, 2, null);
                                            final MutableState<Float> mutableState3 = mutableState2;
                                            composer5.startReplaceableGroup(1157296644);
                                            ComposerKt.sourceInformation(composer5, "C(remember)P(1):Composables.kt#9igjgp");
                                            boolean changed = composer5.changed(mutableState3);
                                            Object rememberedValue3 = composer5.rememberedValue();
                                            if (changed || rememberedValue3 == Composer.INSTANCE.getEmpty()) {
                                                rememberedValue3 = (Function1) new Function1<IntSize, Unit>() { // from class: androidx.compose.material.BottomSheetScaffoldKt$BottomSheetScaffold$child$1$1$1$1
                                                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                                    {
                                                        super(1);
                                                    }

                                                    @Override // kotlin.jvm.functions.Function1
                                                    public /* bridge */ /* synthetic */ Unit invoke(IntSize intSize) {
                                                        m924invokeozmzZPI(intSize.getPackedValue());
                                                        return Unit.INSTANCE;
                                                    }

                                                    /* renamed from: invoke-ozmzZPI, reason: not valid java name */
                                                    public final void m924invokeozmzZPI(long j322222) {
                                                        mutableState3.setValue(Float.valueOf(IntSize.m3999getHeightimpl(j322222)));
                                                    }
                                                };
                                                composer5.updateRememberedValue(rememberedValue3);
                                            }
                                            composer5.endReplaceableGroup();
                                            Modifier onSizeChanged = OnRemeasuredModifierKt.onSizeChanged(m452requiredHeightInVpY3zN4$default, (Function1) rememberedValue3);
                                            Shape shape82 = shape72222;
                                            long j322222 = j302222;
                                            long j332 = j312222;
                                            float f16 = f14;
                                            final Function3<? super ColumnScope, ? super Composer, ? super Integer, Unit> function39 = function38;
                                            final int i52 = i472222;
                                            ComposableLambda composableLambda3 = ComposableLambdaKt.composableLambda(composer5, -698903261, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material.BottomSheetScaffoldKt.BottomSheetScaffold.child.1.1.2
                                                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                                /* JADX WARN: Multi-variable type inference failed */
                                                {
                                                    super(2);
                                                }

                                                @Override // kotlin.jvm.functions.Function2
                                                public /* bridge */ /* synthetic */ Unit invoke(Composer composer6, Integer num) {
                                                    invoke(composer6, num.intValue());
                                                    return Unit.INSTANCE;
                                                }

                                                public final void invoke(Composer composer6, int i53) {
                                                    ComposerKt.sourceInformation(composer6, "C361@15529L30:BottomSheetScaffold.kt#jmzs0o");
                                                    if ((i53 & 11) == 2 && composer6.getSkipping()) {
                                                        composer6.skipToGroupEnd();
                                                        return;
                                                    }
                                                    Function3<ColumnScope, Composer, Integer, Unit> function310 = function39;
                                                    int i54 = (i52 << 9) & 7168;
                                                    composer6.startReplaceableGroup(-483455358);
                                                    ComposerKt.sourceInformation(composer6, "C(Column)P(2,3,1)77@3880L61,78@3946L133:Column.kt#2w3rfo");
                                                    Modifier.Companion companion3 = Modifier.INSTANCE;
                                                    MeasurePolicy columnMeasurePolicy = ColumnKt.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), Alignment.INSTANCE.getStart(), composer6, 0);
                                                    composer6.startReplaceableGroup(-1323940314);
                                                    ComposerKt.sourceInformation(composer6, "C(Layout)P(!1,2)74@2915L7,75@2970L7,76@3029L7,77@3041L460:Layout.kt#80mrfh");
                                                    ProvidableCompositionLocal<Density> localDensity22222 = CompositionLocalsKt.getLocalDensity();
                                                    ComposerKt.sourceInformationMarkerStart(composer6, 2023513938, "C:CompositionLocal.kt#9igjgp");
                                                    Object consume22222 = composer6.consume(localDensity22222);
                                                    ComposerKt.sourceInformationMarkerEnd(composer6);
                                                    Density density = (Density) consume22222;
                                                    ProvidableCompositionLocal<LayoutDirection> localLayoutDirection = CompositionLocalsKt.getLocalLayoutDirection();
                                                    ComposerKt.sourceInformationMarkerStart(composer6, 2023513938, "C:CompositionLocal.kt#9igjgp");
                                                    Object consume3 = composer6.consume(localLayoutDirection);
                                                    ComposerKt.sourceInformationMarkerEnd(composer6);
                                                    LayoutDirection layoutDirection = (LayoutDirection) consume3;
                                                    ProvidableCompositionLocal<ViewConfiguration> localViewConfiguration = CompositionLocalsKt.getLocalViewConfiguration();
                                                    ComposerKt.sourceInformationMarkerStart(composer6, 2023513938, "C:CompositionLocal.kt#9igjgp");
                                                    Object consume4 = composer6.consume(localViewConfiguration);
                                                    ComposerKt.sourceInformationMarkerEnd(composer6);
                                                    ViewConfiguration viewConfiguration = (ViewConfiguration) consume4;
                                                    Function0<ComposeUiNode> constructor = ComposeUiNode.INSTANCE.getConstructor();
                                                    Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> materializerOf = LayoutKt.materializerOf(companion3);
                                                    if (!(composer6.getApplier() instanceof Applier)) {
                                                        ComposablesKt.invalidApplier();
                                                    }
                                                    composer6.startReusableNode();
                                                    if (composer6.getInserting()) {
                                                        composer6.createNode(constructor);
                                                    } else {
                                                        composer6.useNode();
                                                    }
                                                    composer6.disableReusing();
                                                    Composer m1283constructorimpl = Updater.m1283constructorimpl(composer6);
                                                    Updater.m1290setimpl(m1283constructorimpl, columnMeasurePolicy, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
                                                    Updater.m1290setimpl(m1283constructorimpl, density, ComposeUiNode.INSTANCE.getSetDensity());
                                                    Updater.m1290setimpl(m1283constructorimpl, layoutDirection, ComposeUiNode.INSTANCE.getSetLayoutDirection());
                                                    Updater.m1290setimpl(m1283constructorimpl, viewConfiguration, ComposeUiNode.INSTANCE.getSetViewConfiguration());
                                                    composer6.enableReusing();
                                                    materializerOf.invoke(SkippableUpdater.m1273boximpl(SkippableUpdater.m1274constructorimpl(composer6)), composer6, 0);
                                                    composer6.startReplaceableGroup(2058660585);
                                                    composer6.startReplaceableGroup(-1163856341);
                                                    ComposerKt.sourceInformation(composer6, "C79@3994L9:Column.kt#2w3rfo");
                                                    function310.invoke(ColumnScopeInstance.INSTANCE, composer6, Integer.valueOf(((i54 >> 6) & 112) | 6));
                                                    composer6.endReplaceableGroup();
                                                    composer6.endReplaceableGroup();
                                                    composer6.endNode();
                                                    composer6.endReplaceableGroup();
                                                    composer6.endReplaceableGroup();
                                                }
                                            });
                                            int i53 = i472222;
                                            int i54 = i48;
                                            SurfaceKt.m1172SurfaceFjzlyU(onSizeChanged, shape82, j322222, j332, null, f16, composableLambda3, composer5, ((i53 >> 21) & 112) | 1572864 | ((i54 << 6) & 896) | ((i54 << 6) & 7168) | ((i53 >> 12) & 458752), 16);
                                            return;
                                        }
                                        composer5.skipToGroupEnd();
                                    }
                                });
                                Function2<Composer, Integer, Unit> function211 = function292222;
                                final Function3<? super SnackbarHostState, ? super Composer, ? super Integer, Unit> function39 = function362222;
                                final BottomSheetScaffoldState bottomSheetScaffoldState52 = BottomSheetScaffoldState.this;
                                final int i49 = i432222;
                                ComposableLambda composableLambda3 = ComposableLambdaKt.composableLambda(composer4, -486138068, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material.BottomSheetScaffoldKt$BottomSheetScaffold$child$1.2
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

                                    public final void invoke(Composer composer5, int i50) {
                                        ComposerKt.sourceInformation(composer5, "C365@15680L45:BottomSheetScaffold.kt#jmzs0o");
                                        if ((i50 & 11) == 2 && composer5.getSkipping()) {
                                            composer5.skipToGroupEnd();
                                        } else {
                                            function39.invoke(bottomSheetScaffoldState52.getSnackbarHostState(), composer5, Integer.valueOf((i49 >> 9) & 112));
                                        }
                                    }
                                });
                                float f15 = f102222;
                                int i50 = i422222;
                                int i51 = i432222;
                                BottomSheetScaffoldKt.m918BottomSheetScaffoldLayoutKCBPh4w(function210, function372222, composableLambda22222, function211, composableLambda3, f15, i50, offset, bottomSheetState, composer4, ((i51 >> 9) & 14) | 24960 | ((i442222 >> 3) & 112) | ((i51 >> 6) & 7168) | ((i452222 << 9) & 458752) | (i51 & 3670016));
                                return;
                            }
                            composer4.skipToGroupEnd();
                        }
                    });
                    Modifier modifier62222 = modifier3;
                    final Function3<? super ColumnScope, ? super Composer, ? super Integer, Unit> function372222 = function34;
                    final BottomSheetScaffoldState bottomSheetScaffoldState42222 = bottomSheetScaffoldState2;
                    final boolean z62222 = z4;
                    final Shape shape72222 = shape4;
                    final float f122222 = f6;
                    final long j302222 = j17;
                    final long j312222 = j13;
                    final long j322222 = j20;
                    final int i462222 = i21;
                    int i472222 = i33 << 6;
                    SurfaceKt.m1172SurfaceFjzlyU(SizeKt.fillMaxSize$default(modifier62222, 0.0f, 1, null), null, j19, j18, null, 0.0f, ComposableLambdaKt.composableLambda(composer3, 1273816607, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material.BottomSheetScaffoldKt$BottomSheetScaffold$1
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

                        public final void invoke(Composer composer4, int i48) {
                            ComposerKt.sourceInformation(composer4, "C:BottomSheetScaffold.kt#jmzs0o");
                            if ((i48 & 11) != 2 || !composer4.getSkipping()) {
                                if (function372222 == null) {
                                    composer4.startReplaceableGroup(-249544858);
                                    ComposerKt.sourceInformation(composer4, "381@16183L7");
                                    composableLambda2222.invoke(composer4, 6);
                                    composer4.endReplaceableGroup();
                                    return;
                                }
                                composer4.startReplaceableGroup(-249544821);
                                ComposerKt.sourceInformation(composer4, "383@16220L480");
                                Function3<ColumnScope, Composer, Integer, Unit> function38 = function372222;
                                DrawerState drawerState = bottomSheetScaffoldState42222.getDrawerState();
                                boolean z72 = z62222;
                                Shape shape82 = shape72222;
                                float f132 = f122222;
                                long j332 = j302222;
                                long j34 = j312222;
                                long j35 = j322222;
                                Function2<Composer, Integer, Unit> function210 = composableLambda2222;
                                int i49 = i462222;
                                DrawerKt.m1025ModalDrawerGs3lGvM(function38, null, drawerState, z72, shape82, f132, j332, j34, j35, function210, composer4, ((i49 >> 3) & 7168) | ((i49 >> 9) & 14) | C.ENCODING_PCM_32BIT | ((i49 >> 3) & 57344) | ((i49 >> 3) & 458752) | ((i49 >> 3) & 3670016) | ((i49 >> 3) & 29360128) | ((i49 >> 3) & 234881024), 2);
                                composer4.endReplaceableGroup();
                                return;
                            }
                            composer4.skipToGroupEnd();
                        }
                    }), composer3, (i472222 & 7168) | (i472222 & 896) | 1572864, 50);
                    f7 = f5;
                    j21 = j10;
                    shape5 = shape4;
                    f8 = f6;
                    j22 = j17;
                    j23 = j20;
                    j24 = j19;
                    function25 = function24;
                    modifier4 = modifier62222;
                    j25 = j11;
                    j26 = j18;
                    endRestartGroup = composer3.endRestartGroup();
                    if (endRestartGroup != null) {
                    }
                }
                i12 = i11;
                if ((i2 & 234881024) == 0) {
                }
                i13 = i5 & 512;
                if (i13 == 0) {
                }
                i14 = i13;
                if ((i3 & 14) == 0) {
                }
                if ((i3 & 112) == 0) {
                }
                i16 = i5 & 4096;
                if (i16 != 0) {
                }
                i17 = i5 & 8192;
                if (i17 == 0) {
                }
                i18 = i5 & 16384;
                if (i18 != 0) {
                }
                i19 = i18;
                if ((i3 & 458752) == 0) {
                }
                i20 = i5 & 65536;
                if (i20 == 0) {
                }
                if ((i3 & 29360128) == 0) {
                }
                if ((i3 & 234881024) == 0) {
                }
                if ((i3 & 1879048192) == 0) {
                }
                i21 = i15;
                if ((i4 & 14) != 0) {
                }
                if ((i4 & 112) != 0) {
                }
                if ((i5 & 4194304) == 0) {
                }
                if ((1533916891 & i6) == 306783378) {
                }
                startRestartGroup.startDefaults();
                if ((i2 & 1) != 0) {
                }
                if (i36 == 0) {
                }
                if ((i5 & 4) == 0) {
                }
                if (i7 == 0) {
                }
                if (i8 == 0) {
                }
                if (i9 == 0) {
                }
                if (i10 == 0) {
                }
                if (i26 == 0) {
                }
                if ((i5 & 256) == 0) {
                }
                if (i28 == 0) {
                }
                if ((i5 & 1024) == 0) {
                }
                Function2<? super Composer, ? super Integer, Unit> function2722222 = function26;
                if ((i5 & 2048) == 0) {
                }
                if (i16 == 0) {
                }
                if (i25 == 0) {
                }
                if (i27 == 0) {
                }
                float f922222 = m916getSheetPeekHeightD9Ej5fM;
                if ((i5 & 32768) == 0) {
                }
                if (i20 == 0) {
                }
                if ((i5 & 131072) == 0) {
                }
                if ((262144 & i5) == 0) {
                }
                if ((i5 & 524288) == 0) {
                }
                long j2722222 = j15;
                if ((i5 & 1048576) == 0) {
                }
                if ((2097152 & i5) == 0) {
                }
                startRestartGroup.endDefaults();
                startRestartGroup.startReplaceableGroup(773894976);
                ComposerKt.sourceInformation(startRestartGroup, "C(rememberCoroutineScope)475@19849L144:Effects.kt#9igjgp");
                startRestartGroup.startReplaceableGroup(-492369756);
                ComposerKt.sourceInformation(startRestartGroup, "C(remember):Composables.kt#9igjgp");
                rememberedValue = startRestartGroup.rememberedValue();
                if (rememberedValue == Composer.INSTANCE.getEmpty()) {
                }
                startRestartGroup.endReplaceableGroup();
                final CoroutineScope coroutineScope22222 = ((CompositionScopedCoroutineScopeCanceller) rememberedValue).getCoroutineScope();
                startRestartGroup.endReplaceableGroup();
                ProvidableCompositionLocal<Density> localDensity22222 = CompositionLocalsKt.getLocalDensity();
                ComposerKt.sourceInformationMarkerStart(startRestartGroup, 2023513938, "C:CompositionLocal.kt#9igjgp");
                Object consume22222 = startRestartGroup.consume(localDensity22222);
                ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                mo315toPx0680j_4 = ((Density) consume22222).mo315toPx0680j_4(f5);
                startRestartGroup.startReplaceableGroup(-492369756);
                ComposerKt.sourceInformation(startRestartGroup, "C(remember):Composables.kt#9igjgp");
                rememberedValue2 = startRestartGroup.rememberedValue();
                if (rememberedValue2 != Composer.INSTANCE.getEmpty()) {
                }
                startRestartGroup.endReplaceableGroup();
                mutableState = (MutableState) obj;
                if (Intrinsics.areEqual(mo315toPx0680j_4, m919BottomSheetScaffold_bGncdBI$lambda4(mutableState))) {
                }
                final BottomSheetScaffoldState bottomSheetScaffoldState322222 = bottomSheetScaffoldState2;
                final Function2<? super Composer, ? super Integer, Unit> function2822222 = function24;
                final Function2<? super Composer, ? super Integer, Unit> function2922222 = function23;
                final float f1022222 = f5;
                final int i4222222 = m1064getEnd5ygKITE;
                final int i4322222 = i32;
                final int i4422222 = i33;
                final int i4522222 = i21;
                final boolean z522222 = z3;
                final Modifier companion222222 = companion;
                final Shape shape622222 = cornerBasedShape;
                final long j2822222 = j11;
                final long j2922222 = j10;
                final float f1122222 = m915getSheetElevationD9Ej5fM;
                final Function3<? super SnackbarHostState, ? super Composer, ? super Integer, Unit> function3622222 = m1001getLambda1$material_release;
                composer3 = composer2;
                final Function2<? super Composer, ? super Integer, Unit> composableLambda22222 = ComposableLambdaKt.composableLambda(composer3, 893101063, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material.BottomSheetScaffoldKt$BottomSheetScaffold$child$1
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

                    public final void invoke(Composer composer4, int i4622222) {
                        ComposerKt.sourceInformation(composer4, "C316@13233L2758:BottomSheetScaffold.kt#jmzs0o");
                        if ((i4622222 & 11) != 2 || !composer4.getSkipping()) {
                            State<Float> offset = BottomSheetScaffoldState.this.getBottomSheetState().getOffset();
                            BottomSheetState bottomSheetState = BottomSheetScaffoldState.this.getBottomSheetState();
                            Function2<Composer, Integer, Unit> function210 = function2822222;
                            Function3<PaddingValues, Composer, Integer, Unit> function3722222 = content;
                            final float f1222222 = mo315toPx0680j_4;
                            final BottomSheetScaffoldState bottomSheetScaffoldState422222 = BottomSheetScaffoldState.this;
                            final boolean z622222 = z522222;
                            final Modifier modifier622222 = companion222222;
                            final float f132 = f1022222;
                            final MutableState<Float> mutableState2 = mutableState;
                            final Shape shape722222 = shape622222;
                            final long j3022222 = j2822222;
                            final long j3122222 = j2922222;
                            final float f14 = f1122222;
                            final int i4722222 = i4322222;
                            final int i48 = i4522222;
                            final Function3<? super ColumnScope, ? super Composer, ? super Integer, Unit> function38 = sheetContent;
                            ComposableLambda composableLambda222222 = ComposableLambdaKt.composableLambda(composer4, -1378534681, true, new Function3<Integer, Composer, Integer, Unit>() { // from class: androidx.compose.material.BottomSheetScaffoldKt$BottomSheetScaffold$child$1.1
                                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                /* JADX WARN: Multi-variable type inference failed */
                                {
                                    super(3);
                                }

                                @Override // kotlin.jvm.functions.Function3
                                public /* bridge */ /* synthetic */ Unit invoke(Integer num, Composer composer5, Integer num2) {
                                    invoke(num.intValue(), composer5, num2.intValue());
                                    return Unit.INSTANCE;
                                }

                                public final void invoke(int i49, Composer composer5, int i50) {
                                    int i51;
                                    Float m919BottomSheetScaffold_bGncdBI$lambda4;
                                    Float m919BottomSheetScaffold_bGncdBI$lambda42;
                                    Map mapOf;
                                    Modifier.Companion m1182swipeablepPrIpRY;
                                    ComposerKt.sourceInformation(composer5, "C354@15208L95,347@14851L711:BottomSheetScaffold.kt#jmzs0o");
                                    if ((i50 & 14) == 0) {
                                        i51 = i50 | (composer5.changed(i49) ? 4 : 2);
                                    } else {
                                        i51 = i50;
                                    }
                                    if ((i51 & 91) != 18 || !composer5.getSkipping()) {
                                        m919BottomSheetScaffold_bGncdBI$lambda4 = BottomSheetScaffoldKt.m919BottomSheetScaffold_bGncdBI$lambda4(mutableState2);
                                        if (m919BottomSheetScaffold_bGncdBI$lambda4 == null) {
                                            m1182swipeablepPrIpRY = Modifier.INSTANCE;
                                        } else {
                                            if (MathKt.roundToInt(m919BottomSheetScaffold_bGncdBI$lambda4.floatValue()) != MathKt.roundToInt(f1222222)) {
                                                float f15 = i49;
                                                m919BottomSheetScaffold_bGncdBI$lambda42 = BottomSheetScaffoldKt.m919BottomSheetScaffold_bGncdBI$lambda4(mutableState2);
                                                Intrinsics.checkNotNull(m919BottomSheetScaffold_bGncdBI$lambda42);
                                                mapOf = MapsKt.mapOf(TuplesKt.to(Float.valueOf(f15 - m919BottomSheetScaffold_bGncdBI$lambda42.floatValue()), BottomSheetValue.Expanded), TuplesKt.to(Float.valueOf(f15 - f1222222), BottomSheetValue.Collapsed));
                                            } else {
                                                mapOf = MapsKt.mapOf(TuplesKt.to(Float.valueOf(i49 - m919BottomSheetScaffold_bGncdBI$lambda4.floatValue()), BottomSheetValue.Collapsed));
                                            }
                                            m1182swipeablepPrIpRY = SwipeableKt.m1182swipeablepPrIpRY(Modifier.INSTANCE, bottomSheetScaffoldState422222.getBottomSheetState(), r13, Orientation.Vertical, (r26 & 8) != 0 ? true : z622222, (r26 & 16) != 0 ? false : false, (r26 & 32) != 0 ? null : null, (r26 & 64) != 0 ? new Function2<T, T, FixedThreshold>() { // from class: androidx.compose.material.SwipeableKt$swipeable$1
                                                /* JADX WARN: Can't rename method to resolve collision */
                                                @Override // kotlin.jvm.functions.Function2
                                                public final FixedThreshold invoke(T t, T t2) {
                                                    return new FixedThreshold(Dp.m3840constructorimpl(56), null);
                                                }
                                            } : null, (r26 & 128) != 0 ? SwipeableDefaults.resistanceConfig$default(SwipeableDefaults.INSTANCE, mapOf.keySet(), 0.0f, 0.0f, 6, null) : null, (r26 & 256) != 0 ? SwipeableDefaults.INSTANCE.m1181getVelocityThresholdD9Ej5fM() : 0.0f);
                                        }
                                        Modifier m452requiredHeightInVpY3zN4$default = SizeKt.m452requiredHeightInVpY3zN4$default(SizeKt.fillMaxWidth$default(NestedScrollModifierKt.nestedScroll$default(Modifier.INSTANCE, bottomSheetScaffoldState422222.getBottomSheetState().getNestedScrollConnection(), null, 2, null).then(m1182swipeablepPrIpRY).then(modifier622222), 0.0f, 1, null), f132, 0.0f, 2, null);
                                        final MutableState<Float> mutableState3 = mutableState2;
                                        composer5.startReplaceableGroup(1157296644);
                                        ComposerKt.sourceInformation(composer5, "C(remember)P(1):Composables.kt#9igjgp");
                                        boolean changed = composer5.changed(mutableState3);
                                        Object rememberedValue3 = composer5.rememberedValue();
                                        if (changed || rememberedValue3 == Composer.INSTANCE.getEmpty()) {
                                            rememberedValue3 = (Function1) new Function1<IntSize, Unit>() { // from class: androidx.compose.material.BottomSheetScaffoldKt$BottomSheetScaffold$child$1$1$1$1
                                                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                                {
                                                    super(1);
                                                }

                                                @Override // kotlin.jvm.functions.Function1
                                                public /* bridge */ /* synthetic */ Unit invoke(IntSize intSize) {
                                                    m924invokeozmzZPI(intSize.getPackedValue());
                                                    return Unit.INSTANCE;
                                                }

                                                /* renamed from: invoke-ozmzZPI, reason: not valid java name */
                                                public final void m924invokeozmzZPI(long j3222222) {
                                                    mutableState3.setValue(Float.valueOf(IntSize.m3999getHeightimpl(j3222222)));
                                                }
                                            };
                                            composer5.updateRememberedValue(rememberedValue3);
                                        }
                                        composer5.endReplaceableGroup();
                                        Modifier onSizeChanged = OnRemeasuredModifierKt.onSizeChanged(m452requiredHeightInVpY3zN4$default, (Function1) rememberedValue3);
                                        Shape shape82 = shape722222;
                                        long j3222222 = j3022222;
                                        long j332 = j3122222;
                                        float f16 = f14;
                                        final Function3<? super ColumnScope, ? super Composer, ? super Integer, Unit> function39 = function38;
                                        final int i52 = i4722222;
                                        ComposableLambda composableLambda3 = ComposableLambdaKt.composableLambda(composer5, -698903261, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material.BottomSheetScaffoldKt.BottomSheetScaffold.child.1.1.2
                                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                            /* JADX WARN: Multi-variable type inference failed */
                                            {
                                                super(2);
                                            }

                                            @Override // kotlin.jvm.functions.Function2
                                            public /* bridge */ /* synthetic */ Unit invoke(Composer composer6, Integer num) {
                                                invoke(composer6, num.intValue());
                                                return Unit.INSTANCE;
                                            }

                                            public final void invoke(Composer composer6, int i53) {
                                                ComposerKt.sourceInformation(composer6, "C361@15529L30:BottomSheetScaffold.kt#jmzs0o");
                                                if ((i53 & 11) == 2 && composer6.getSkipping()) {
                                                    composer6.skipToGroupEnd();
                                                    return;
                                                }
                                                Function3<ColumnScope, Composer, Integer, Unit> function310 = function39;
                                                int i54 = (i52 << 9) & 7168;
                                                composer6.startReplaceableGroup(-483455358);
                                                ComposerKt.sourceInformation(composer6, "C(Column)P(2,3,1)77@3880L61,78@3946L133:Column.kt#2w3rfo");
                                                Modifier.Companion companion3 = Modifier.INSTANCE;
                                                MeasurePolicy columnMeasurePolicy = ColumnKt.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), Alignment.INSTANCE.getStart(), composer6, 0);
                                                composer6.startReplaceableGroup(-1323940314);
                                                ComposerKt.sourceInformation(composer6, "C(Layout)P(!1,2)74@2915L7,75@2970L7,76@3029L7,77@3041L460:Layout.kt#80mrfh");
                                                ProvidableCompositionLocal<Density> localDensity222222 = CompositionLocalsKt.getLocalDensity();
                                                ComposerKt.sourceInformationMarkerStart(composer6, 2023513938, "C:CompositionLocal.kt#9igjgp");
                                                Object consume222222 = composer6.consume(localDensity222222);
                                                ComposerKt.sourceInformationMarkerEnd(composer6);
                                                Density density = (Density) consume222222;
                                                ProvidableCompositionLocal<LayoutDirection> localLayoutDirection = CompositionLocalsKt.getLocalLayoutDirection();
                                                ComposerKt.sourceInformationMarkerStart(composer6, 2023513938, "C:CompositionLocal.kt#9igjgp");
                                                Object consume3 = composer6.consume(localLayoutDirection);
                                                ComposerKt.sourceInformationMarkerEnd(composer6);
                                                LayoutDirection layoutDirection = (LayoutDirection) consume3;
                                                ProvidableCompositionLocal<ViewConfiguration> localViewConfiguration = CompositionLocalsKt.getLocalViewConfiguration();
                                                ComposerKt.sourceInformationMarkerStart(composer6, 2023513938, "C:CompositionLocal.kt#9igjgp");
                                                Object consume4 = composer6.consume(localViewConfiguration);
                                                ComposerKt.sourceInformationMarkerEnd(composer6);
                                                ViewConfiguration viewConfiguration = (ViewConfiguration) consume4;
                                                Function0<ComposeUiNode> constructor = ComposeUiNode.INSTANCE.getConstructor();
                                                Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> materializerOf = LayoutKt.materializerOf(companion3);
                                                if (!(composer6.getApplier() instanceof Applier)) {
                                                    ComposablesKt.invalidApplier();
                                                }
                                                composer6.startReusableNode();
                                                if (composer6.getInserting()) {
                                                    composer6.createNode(constructor);
                                                } else {
                                                    composer6.useNode();
                                                }
                                                composer6.disableReusing();
                                                Composer m1283constructorimpl = Updater.m1283constructorimpl(composer6);
                                                Updater.m1290setimpl(m1283constructorimpl, columnMeasurePolicy, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
                                                Updater.m1290setimpl(m1283constructorimpl, density, ComposeUiNode.INSTANCE.getSetDensity());
                                                Updater.m1290setimpl(m1283constructorimpl, layoutDirection, ComposeUiNode.INSTANCE.getSetLayoutDirection());
                                                Updater.m1290setimpl(m1283constructorimpl, viewConfiguration, ComposeUiNode.INSTANCE.getSetViewConfiguration());
                                                composer6.enableReusing();
                                                materializerOf.invoke(SkippableUpdater.m1273boximpl(SkippableUpdater.m1274constructorimpl(composer6)), composer6, 0);
                                                composer6.startReplaceableGroup(2058660585);
                                                composer6.startReplaceableGroup(-1163856341);
                                                ComposerKt.sourceInformation(composer6, "C79@3994L9:Column.kt#2w3rfo");
                                                function310.invoke(ColumnScopeInstance.INSTANCE, composer6, Integer.valueOf(((i54 >> 6) & 112) | 6));
                                                composer6.endReplaceableGroup();
                                                composer6.endReplaceableGroup();
                                                composer6.endNode();
                                                composer6.endReplaceableGroup();
                                                composer6.endReplaceableGroup();
                                            }
                                        });
                                        int i53 = i4722222;
                                        int i54 = i48;
                                        SurfaceKt.m1172SurfaceFjzlyU(onSizeChanged, shape82, j3222222, j332, null, f16, composableLambda3, composer5, ((i53 >> 21) & 112) | 1572864 | ((i54 << 6) & 896) | ((i54 << 6) & 7168) | ((i53 >> 12) & 458752), 16);
                                        return;
                                    }
                                    composer5.skipToGroupEnd();
                                }
                            });
                            Function2<Composer, Integer, Unit> function211 = function2922222;
                            final Function3<? super SnackbarHostState, ? super Composer, ? super Integer, Unit> function39 = function3622222;
                            final BottomSheetScaffoldState bottomSheetScaffoldState52 = BottomSheetScaffoldState.this;
                            final int i49 = i4322222;
                            ComposableLambda composableLambda3 = ComposableLambdaKt.composableLambda(composer4, -486138068, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material.BottomSheetScaffoldKt$BottomSheetScaffold$child$1.2
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

                                public final void invoke(Composer composer5, int i50) {
                                    ComposerKt.sourceInformation(composer5, "C365@15680L45:BottomSheetScaffold.kt#jmzs0o");
                                    if ((i50 & 11) == 2 && composer5.getSkipping()) {
                                        composer5.skipToGroupEnd();
                                    } else {
                                        function39.invoke(bottomSheetScaffoldState52.getSnackbarHostState(), composer5, Integer.valueOf((i49 >> 9) & 112));
                                    }
                                }
                            });
                            float f15 = f1022222;
                            int i50 = i4222222;
                            int i51 = i4322222;
                            BottomSheetScaffoldKt.m918BottomSheetScaffoldLayoutKCBPh4w(function210, function3722222, composableLambda222222, function211, composableLambda3, f15, i50, offset, bottomSheetState, composer4, ((i51 >> 9) & 14) | 24960 | ((i4422222 >> 3) & 112) | ((i51 >> 6) & 7168) | ((i4522222 << 9) & 458752) | (i51 & 3670016));
                            return;
                        }
                        composer4.skipToGroupEnd();
                    }
                });
                Modifier modifier622222 = modifier3;
                final Function3<? super ColumnScope, ? super Composer, ? super Integer, Unit> function3722222 = function34;
                final BottomSheetScaffoldState bottomSheetScaffoldState422222 = bottomSheetScaffoldState2;
                final boolean z622222 = z4;
                final Shape shape722222 = shape4;
                final float f1222222 = f6;
                final long j3022222 = j17;
                final long j3122222 = j13;
                final long j3222222 = j20;
                final int i4622222 = i21;
                int i4722222 = i33 << 6;
                SurfaceKt.m1172SurfaceFjzlyU(SizeKt.fillMaxSize$default(modifier622222, 0.0f, 1, null), null, j19, j18, null, 0.0f, ComposableLambdaKt.composableLambda(composer3, 1273816607, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material.BottomSheetScaffoldKt$BottomSheetScaffold$1
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

                    public final void invoke(Composer composer4, int i48) {
                        ComposerKt.sourceInformation(composer4, "C:BottomSheetScaffold.kt#jmzs0o");
                        if ((i48 & 11) != 2 || !composer4.getSkipping()) {
                            if (function3722222 == null) {
                                composer4.startReplaceableGroup(-249544858);
                                ComposerKt.sourceInformation(composer4, "381@16183L7");
                                composableLambda22222.invoke(composer4, 6);
                                composer4.endReplaceableGroup();
                                return;
                            }
                            composer4.startReplaceableGroup(-249544821);
                            ComposerKt.sourceInformation(composer4, "383@16220L480");
                            Function3<ColumnScope, Composer, Integer, Unit> function38 = function3722222;
                            DrawerState drawerState = bottomSheetScaffoldState422222.getDrawerState();
                            boolean z72 = z622222;
                            Shape shape82 = shape722222;
                            float f132 = f1222222;
                            long j332 = j3022222;
                            long j34 = j3122222;
                            long j35 = j3222222;
                            Function2<Composer, Integer, Unit> function210 = composableLambda22222;
                            int i49 = i4622222;
                            DrawerKt.m1025ModalDrawerGs3lGvM(function38, null, drawerState, z72, shape82, f132, j332, j34, j35, function210, composer4, ((i49 >> 3) & 7168) | ((i49 >> 9) & 14) | C.ENCODING_PCM_32BIT | ((i49 >> 3) & 57344) | ((i49 >> 3) & 458752) | ((i49 >> 3) & 3670016) | ((i49 >> 3) & 29360128) | ((i49 >> 3) & 234881024), 2);
                            composer4.endReplaceableGroup();
                            return;
                        }
                        composer4.skipToGroupEnd();
                    }
                }), composer3, (i4722222 & 7168) | (i4722222 & 896) | 1572864, 50);
                f7 = f5;
                j21 = j10;
                shape5 = shape4;
                f8 = f6;
                j22 = j17;
                j23 = j20;
                j24 = j19;
                function25 = function24;
                modifier4 = modifier622222;
                j25 = j11;
                j26 = j18;
                endRestartGroup = composer3.endRestartGroup();
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
            i12 = i11;
            if ((i2 & 234881024) == 0) {
            }
            i13 = i5 & 512;
            if (i13 == 0) {
            }
            i14 = i13;
            if ((i3 & 14) == 0) {
            }
            if ((i3 & 112) == 0) {
            }
            i16 = i5 & 4096;
            if (i16 != 0) {
            }
            i17 = i5 & 8192;
            if (i17 == 0) {
            }
            i18 = i5 & 16384;
            if (i18 != 0) {
            }
            i19 = i18;
            if ((i3 & 458752) == 0) {
            }
            i20 = i5 & 65536;
            if (i20 == 0) {
            }
            if ((i3 & 29360128) == 0) {
            }
            if ((i3 & 234881024) == 0) {
            }
            if ((i3 & 1879048192) == 0) {
            }
            i21 = i15;
            if ((i4 & 14) != 0) {
            }
            if ((i4 & 112) != 0) {
            }
            if ((i5 & 4194304) == 0) {
            }
            if ((1533916891 & i6) == 306783378) {
            }
            startRestartGroup.startDefaults();
            if ((i2 & 1) != 0) {
            }
            if (i36 == 0) {
            }
            if ((i5 & 4) == 0) {
            }
            if (i7 == 0) {
            }
            if (i8 == 0) {
            }
            if (i9 == 0) {
            }
            if (i10 == 0) {
            }
            if (i26 == 0) {
            }
            if ((i5 & 256) == 0) {
            }
            if (i28 == 0) {
            }
            if ((i5 & 1024) == 0) {
            }
            Function2<? super Composer, ? super Integer, Unit> function27222222 = function26;
            if ((i5 & 2048) == 0) {
            }
            if (i16 == 0) {
            }
            if (i25 == 0) {
            }
            if (i27 == 0) {
            }
            float f9222222 = m916getSheetPeekHeightD9Ej5fM;
            if ((i5 & 32768) == 0) {
            }
            if (i20 == 0) {
            }
            if ((i5 & 131072) == 0) {
            }
            if ((262144 & i5) == 0) {
            }
            if ((i5 & 524288) == 0) {
            }
            long j27222222 = j15;
            if ((i5 & 1048576) == 0) {
            }
            if ((2097152 & i5) == 0) {
            }
            startRestartGroup.endDefaults();
            startRestartGroup.startReplaceableGroup(773894976);
            ComposerKt.sourceInformation(startRestartGroup, "C(rememberCoroutineScope)475@19849L144:Effects.kt#9igjgp");
            startRestartGroup.startReplaceableGroup(-492369756);
            ComposerKt.sourceInformation(startRestartGroup, "C(remember):Composables.kt#9igjgp");
            rememberedValue = startRestartGroup.rememberedValue();
            if (rememberedValue == Composer.INSTANCE.getEmpty()) {
            }
            startRestartGroup.endReplaceableGroup();
            final CoroutineScope coroutineScope222222 = ((CompositionScopedCoroutineScopeCanceller) rememberedValue).getCoroutineScope();
            startRestartGroup.endReplaceableGroup();
            ProvidableCompositionLocal<Density> localDensity222222 = CompositionLocalsKt.getLocalDensity();
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, 2023513938, "C:CompositionLocal.kt#9igjgp");
            Object consume222222 = startRestartGroup.consume(localDensity222222);
            ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
            mo315toPx0680j_4 = ((Density) consume222222).mo315toPx0680j_4(f5);
            startRestartGroup.startReplaceableGroup(-492369756);
            ComposerKt.sourceInformation(startRestartGroup, "C(remember):Composables.kt#9igjgp");
            rememberedValue2 = startRestartGroup.rememberedValue();
            if (rememberedValue2 != Composer.INSTANCE.getEmpty()) {
            }
            startRestartGroup.endReplaceableGroup();
            mutableState = (MutableState) obj;
            if (Intrinsics.areEqual(mo315toPx0680j_4, m919BottomSheetScaffold_bGncdBI$lambda4(mutableState))) {
            }
            final BottomSheetScaffoldState bottomSheetScaffoldState3222222 = bottomSheetScaffoldState2;
            final Function2<? super Composer, ? super Integer, Unit> function28222222 = function24;
            final Function2<? super Composer, ? super Integer, Unit> function29222222 = function23;
            final float f10222222 = f5;
            final int i42222222 = m1064getEnd5ygKITE;
            final int i43222222 = i32;
            final int i44222222 = i33;
            final int i45222222 = i21;
            final boolean z5222222 = z3;
            final Modifier companion2222222 = companion;
            final Shape shape6222222 = cornerBasedShape;
            final long j28222222 = j11;
            final long j29222222 = j10;
            final float f11222222 = m915getSheetElevationD9Ej5fM;
            final Function3<? super SnackbarHostState, ? super Composer, ? super Integer, Unit> function36222222 = m1001getLambda1$material_release;
            composer3 = composer2;
            final Function2<? super Composer, ? super Integer, Unit> composableLambda222222 = ComposableLambdaKt.composableLambda(composer3, 893101063, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material.BottomSheetScaffoldKt$BottomSheetScaffold$child$1
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

                public final void invoke(Composer composer4, int i46222222) {
                    ComposerKt.sourceInformation(composer4, "C316@13233L2758:BottomSheetScaffold.kt#jmzs0o");
                    if ((i46222222 & 11) != 2 || !composer4.getSkipping()) {
                        State<Float> offset = BottomSheetScaffoldState.this.getBottomSheetState().getOffset();
                        BottomSheetState bottomSheetState = BottomSheetScaffoldState.this.getBottomSheetState();
                        Function2<Composer, Integer, Unit> function210 = function28222222;
                        Function3<PaddingValues, Composer, Integer, Unit> function37222222 = content;
                        final float f12222222 = mo315toPx0680j_4;
                        final BottomSheetScaffoldState bottomSheetScaffoldState4222222 = BottomSheetScaffoldState.this;
                        final boolean z6222222 = z5222222;
                        final Modifier modifier6222222 = companion2222222;
                        final float f132 = f10222222;
                        final MutableState<Float> mutableState2 = mutableState;
                        final Shape shape7222222 = shape6222222;
                        final long j30222222 = j28222222;
                        final long j31222222 = j29222222;
                        final float f14 = f11222222;
                        final int i47222222 = i43222222;
                        final int i48 = i45222222;
                        final Function3<? super ColumnScope, ? super Composer, ? super Integer, Unit> function38 = sheetContent;
                        ComposableLambda composableLambda2222222 = ComposableLambdaKt.composableLambda(composer4, -1378534681, true, new Function3<Integer, Composer, Integer, Unit>() { // from class: androidx.compose.material.BottomSheetScaffoldKt$BottomSheetScaffold$child$1.1
                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            /* JADX WARN: Multi-variable type inference failed */
                            {
                                super(3);
                            }

                            @Override // kotlin.jvm.functions.Function3
                            public /* bridge */ /* synthetic */ Unit invoke(Integer num, Composer composer5, Integer num2) {
                                invoke(num.intValue(), composer5, num2.intValue());
                                return Unit.INSTANCE;
                            }

                            public final void invoke(int i49, Composer composer5, int i50) {
                                int i51;
                                Float m919BottomSheetScaffold_bGncdBI$lambda4;
                                Float m919BottomSheetScaffold_bGncdBI$lambda42;
                                Map mapOf;
                                Modifier.Companion m1182swipeablepPrIpRY;
                                ComposerKt.sourceInformation(composer5, "C354@15208L95,347@14851L711:BottomSheetScaffold.kt#jmzs0o");
                                if ((i50 & 14) == 0) {
                                    i51 = i50 | (composer5.changed(i49) ? 4 : 2);
                                } else {
                                    i51 = i50;
                                }
                                if ((i51 & 91) != 18 || !composer5.getSkipping()) {
                                    m919BottomSheetScaffold_bGncdBI$lambda4 = BottomSheetScaffoldKt.m919BottomSheetScaffold_bGncdBI$lambda4(mutableState2);
                                    if (m919BottomSheetScaffold_bGncdBI$lambda4 == null) {
                                        m1182swipeablepPrIpRY = Modifier.INSTANCE;
                                    } else {
                                        if (MathKt.roundToInt(m919BottomSheetScaffold_bGncdBI$lambda4.floatValue()) != MathKt.roundToInt(f12222222)) {
                                            float f15 = i49;
                                            m919BottomSheetScaffold_bGncdBI$lambda42 = BottomSheetScaffoldKt.m919BottomSheetScaffold_bGncdBI$lambda4(mutableState2);
                                            Intrinsics.checkNotNull(m919BottomSheetScaffold_bGncdBI$lambda42);
                                            mapOf = MapsKt.mapOf(TuplesKt.to(Float.valueOf(f15 - m919BottomSheetScaffold_bGncdBI$lambda42.floatValue()), BottomSheetValue.Expanded), TuplesKt.to(Float.valueOf(f15 - f12222222), BottomSheetValue.Collapsed));
                                        } else {
                                            mapOf = MapsKt.mapOf(TuplesKt.to(Float.valueOf(i49 - m919BottomSheetScaffold_bGncdBI$lambda4.floatValue()), BottomSheetValue.Collapsed));
                                        }
                                        m1182swipeablepPrIpRY = SwipeableKt.m1182swipeablepPrIpRY(Modifier.INSTANCE, bottomSheetScaffoldState4222222.getBottomSheetState(), r13, Orientation.Vertical, (r26 & 8) != 0 ? true : z6222222, (r26 & 16) != 0 ? false : false, (r26 & 32) != 0 ? null : null, (r26 & 64) != 0 ? new Function2<T, T, FixedThreshold>() { // from class: androidx.compose.material.SwipeableKt$swipeable$1
                                            /* JADX WARN: Can't rename method to resolve collision */
                                            @Override // kotlin.jvm.functions.Function2
                                            public final FixedThreshold invoke(T t, T t2) {
                                                return new FixedThreshold(Dp.m3840constructorimpl(56), null);
                                            }
                                        } : null, (r26 & 128) != 0 ? SwipeableDefaults.resistanceConfig$default(SwipeableDefaults.INSTANCE, mapOf.keySet(), 0.0f, 0.0f, 6, null) : null, (r26 & 256) != 0 ? SwipeableDefaults.INSTANCE.m1181getVelocityThresholdD9Ej5fM() : 0.0f);
                                    }
                                    Modifier m452requiredHeightInVpY3zN4$default = SizeKt.m452requiredHeightInVpY3zN4$default(SizeKt.fillMaxWidth$default(NestedScrollModifierKt.nestedScroll$default(Modifier.INSTANCE, bottomSheetScaffoldState4222222.getBottomSheetState().getNestedScrollConnection(), null, 2, null).then(m1182swipeablepPrIpRY).then(modifier6222222), 0.0f, 1, null), f132, 0.0f, 2, null);
                                    final MutableState<Float> mutableState3 = mutableState2;
                                    composer5.startReplaceableGroup(1157296644);
                                    ComposerKt.sourceInformation(composer5, "C(remember)P(1):Composables.kt#9igjgp");
                                    boolean changed = composer5.changed(mutableState3);
                                    Object rememberedValue3 = composer5.rememberedValue();
                                    if (changed || rememberedValue3 == Composer.INSTANCE.getEmpty()) {
                                        rememberedValue3 = (Function1) new Function1<IntSize, Unit>() { // from class: androidx.compose.material.BottomSheetScaffoldKt$BottomSheetScaffold$child$1$1$1$1
                                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                            {
                                                super(1);
                                            }

                                            @Override // kotlin.jvm.functions.Function1
                                            public /* bridge */ /* synthetic */ Unit invoke(IntSize intSize) {
                                                m924invokeozmzZPI(intSize.getPackedValue());
                                                return Unit.INSTANCE;
                                            }

                                            /* renamed from: invoke-ozmzZPI, reason: not valid java name */
                                            public final void m924invokeozmzZPI(long j32222222) {
                                                mutableState3.setValue(Float.valueOf(IntSize.m3999getHeightimpl(j32222222)));
                                            }
                                        };
                                        composer5.updateRememberedValue(rememberedValue3);
                                    }
                                    composer5.endReplaceableGroup();
                                    Modifier onSizeChanged = OnRemeasuredModifierKt.onSizeChanged(m452requiredHeightInVpY3zN4$default, (Function1) rememberedValue3);
                                    Shape shape82 = shape7222222;
                                    long j32222222 = j30222222;
                                    long j332 = j31222222;
                                    float f16 = f14;
                                    final Function3<? super ColumnScope, ? super Composer, ? super Integer, Unit> function39 = function38;
                                    final int i52 = i47222222;
                                    ComposableLambda composableLambda3 = ComposableLambdaKt.composableLambda(composer5, -698903261, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material.BottomSheetScaffoldKt.BottomSheetScaffold.child.1.1.2
                                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                        /* JADX WARN: Multi-variable type inference failed */
                                        {
                                            super(2);
                                        }

                                        @Override // kotlin.jvm.functions.Function2
                                        public /* bridge */ /* synthetic */ Unit invoke(Composer composer6, Integer num) {
                                            invoke(composer6, num.intValue());
                                            return Unit.INSTANCE;
                                        }

                                        public final void invoke(Composer composer6, int i53) {
                                            ComposerKt.sourceInformation(composer6, "C361@15529L30:BottomSheetScaffold.kt#jmzs0o");
                                            if ((i53 & 11) == 2 && composer6.getSkipping()) {
                                                composer6.skipToGroupEnd();
                                                return;
                                            }
                                            Function3<ColumnScope, Composer, Integer, Unit> function310 = function39;
                                            int i54 = (i52 << 9) & 7168;
                                            composer6.startReplaceableGroup(-483455358);
                                            ComposerKt.sourceInformation(composer6, "C(Column)P(2,3,1)77@3880L61,78@3946L133:Column.kt#2w3rfo");
                                            Modifier.Companion companion3 = Modifier.INSTANCE;
                                            MeasurePolicy columnMeasurePolicy = ColumnKt.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), Alignment.INSTANCE.getStart(), composer6, 0);
                                            composer6.startReplaceableGroup(-1323940314);
                                            ComposerKt.sourceInformation(composer6, "C(Layout)P(!1,2)74@2915L7,75@2970L7,76@3029L7,77@3041L460:Layout.kt#80mrfh");
                                            ProvidableCompositionLocal<Density> localDensity2222222 = CompositionLocalsKt.getLocalDensity();
                                            ComposerKt.sourceInformationMarkerStart(composer6, 2023513938, "C:CompositionLocal.kt#9igjgp");
                                            Object consume2222222 = composer6.consume(localDensity2222222);
                                            ComposerKt.sourceInformationMarkerEnd(composer6);
                                            Density density = (Density) consume2222222;
                                            ProvidableCompositionLocal<LayoutDirection> localLayoutDirection = CompositionLocalsKt.getLocalLayoutDirection();
                                            ComposerKt.sourceInformationMarkerStart(composer6, 2023513938, "C:CompositionLocal.kt#9igjgp");
                                            Object consume3 = composer6.consume(localLayoutDirection);
                                            ComposerKt.sourceInformationMarkerEnd(composer6);
                                            LayoutDirection layoutDirection = (LayoutDirection) consume3;
                                            ProvidableCompositionLocal<ViewConfiguration> localViewConfiguration = CompositionLocalsKt.getLocalViewConfiguration();
                                            ComposerKt.sourceInformationMarkerStart(composer6, 2023513938, "C:CompositionLocal.kt#9igjgp");
                                            Object consume4 = composer6.consume(localViewConfiguration);
                                            ComposerKt.sourceInformationMarkerEnd(composer6);
                                            ViewConfiguration viewConfiguration = (ViewConfiguration) consume4;
                                            Function0<ComposeUiNode> constructor = ComposeUiNode.INSTANCE.getConstructor();
                                            Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> materializerOf = LayoutKt.materializerOf(companion3);
                                            if (!(composer6.getApplier() instanceof Applier)) {
                                                ComposablesKt.invalidApplier();
                                            }
                                            composer6.startReusableNode();
                                            if (composer6.getInserting()) {
                                                composer6.createNode(constructor);
                                            } else {
                                                composer6.useNode();
                                            }
                                            composer6.disableReusing();
                                            Composer m1283constructorimpl = Updater.m1283constructorimpl(composer6);
                                            Updater.m1290setimpl(m1283constructorimpl, columnMeasurePolicy, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
                                            Updater.m1290setimpl(m1283constructorimpl, density, ComposeUiNode.INSTANCE.getSetDensity());
                                            Updater.m1290setimpl(m1283constructorimpl, layoutDirection, ComposeUiNode.INSTANCE.getSetLayoutDirection());
                                            Updater.m1290setimpl(m1283constructorimpl, viewConfiguration, ComposeUiNode.INSTANCE.getSetViewConfiguration());
                                            composer6.enableReusing();
                                            materializerOf.invoke(SkippableUpdater.m1273boximpl(SkippableUpdater.m1274constructorimpl(composer6)), composer6, 0);
                                            composer6.startReplaceableGroup(2058660585);
                                            composer6.startReplaceableGroup(-1163856341);
                                            ComposerKt.sourceInformation(composer6, "C79@3994L9:Column.kt#2w3rfo");
                                            function310.invoke(ColumnScopeInstance.INSTANCE, composer6, Integer.valueOf(((i54 >> 6) & 112) | 6));
                                            composer6.endReplaceableGroup();
                                            composer6.endReplaceableGroup();
                                            composer6.endNode();
                                            composer6.endReplaceableGroup();
                                            composer6.endReplaceableGroup();
                                        }
                                    });
                                    int i53 = i47222222;
                                    int i54 = i48;
                                    SurfaceKt.m1172SurfaceFjzlyU(onSizeChanged, shape82, j32222222, j332, null, f16, composableLambda3, composer5, ((i53 >> 21) & 112) | 1572864 | ((i54 << 6) & 896) | ((i54 << 6) & 7168) | ((i53 >> 12) & 458752), 16);
                                    return;
                                }
                                composer5.skipToGroupEnd();
                            }
                        });
                        Function2<Composer, Integer, Unit> function211 = function29222222;
                        final Function3<? super SnackbarHostState, ? super Composer, ? super Integer, Unit> function39 = function36222222;
                        final BottomSheetScaffoldState bottomSheetScaffoldState52 = BottomSheetScaffoldState.this;
                        final int i49 = i43222222;
                        ComposableLambda composableLambda3 = ComposableLambdaKt.composableLambda(composer4, -486138068, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material.BottomSheetScaffoldKt$BottomSheetScaffold$child$1.2
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

                            public final void invoke(Composer composer5, int i50) {
                                ComposerKt.sourceInformation(composer5, "C365@15680L45:BottomSheetScaffold.kt#jmzs0o");
                                if ((i50 & 11) == 2 && composer5.getSkipping()) {
                                    composer5.skipToGroupEnd();
                                } else {
                                    function39.invoke(bottomSheetScaffoldState52.getSnackbarHostState(), composer5, Integer.valueOf((i49 >> 9) & 112));
                                }
                            }
                        });
                        float f15 = f10222222;
                        int i50 = i42222222;
                        int i51 = i43222222;
                        BottomSheetScaffoldKt.m918BottomSheetScaffoldLayoutKCBPh4w(function210, function37222222, composableLambda2222222, function211, composableLambda3, f15, i50, offset, bottomSheetState, composer4, ((i51 >> 9) & 14) | 24960 | ((i44222222 >> 3) & 112) | ((i51 >> 6) & 7168) | ((i45222222 << 9) & 458752) | (i51 & 3670016));
                        return;
                    }
                    composer4.skipToGroupEnd();
                }
            });
            Modifier modifier6222222 = modifier3;
            final Function3<? super ColumnScope, ? super Composer, ? super Integer, Unit> function37222222 = function34;
            final BottomSheetScaffoldState bottomSheetScaffoldState4222222 = bottomSheetScaffoldState2;
            final boolean z6222222 = z4;
            final Shape shape7222222 = shape4;
            final float f12222222 = f6;
            final long j30222222 = j17;
            final long j31222222 = j13;
            final long j32222222 = j20;
            final int i46222222 = i21;
            int i47222222 = i33 << 6;
            SurfaceKt.m1172SurfaceFjzlyU(SizeKt.fillMaxSize$default(modifier6222222, 0.0f, 1, null), null, j19, j18, null, 0.0f, ComposableLambdaKt.composableLambda(composer3, 1273816607, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material.BottomSheetScaffoldKt$BottomSheetScaffold$1
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

                public final void invoke(Composer composer4, int i48) {
                    ComposerKt.sourceInformation(composer4, "C:BottomSheetScaffold.kt#jmzs0o");
                    if ((i48 & 11) != 2 || !composer4.getSkipping()) {
                        if (function37222222 == null) {
                            composer4.startReplaceableGroup(-249544858);
                            ComposerKt.sourceInformation(composer4, "381@16183L7");
                            composableLambda222222.invoke(composer4, 6);
                            composer4.endReplaceableGroup();
                            return;
                        }
                        composer4.startReplaceableGroup(-249544821);
                        ComposerKt.sourceInformation(composer4, "383@16220L480");
                        Function3<ColumnScope, Composer, Integer, Unit> function38 = function37222222;
                        DrawerState drawerState = bottomSheetScaffoldState4222222.getDrawerState();
                        boolean z72 = z6222222;
                        Shape shape82 = shape7222222;
                        float f132 = f12222222;
                        long j332 = j30222222;
                        long j34 = j31222222;
                        long j35 = j32222222;
                        Function2<Composer, Integer, Unit> function210 = composableLambda222222;
                        int i49 = i46222222;
                        DrawerKt.m1025ModalDrawerGs3lGvM(function38, null, drawerState, z72, shape82, f132, j332, j34, j35, function210, composer4, ((i49 >> 3) & 7168) | ((i49 >> 9) & 14) | C.ENCODING_PCM_32BIT | ((i49 >> 3) & 57344) | ((i49 >> 3) & 458752) | ((i49 >> 3) & 3670016) | ((i49 >> 3) & 29360128) | ((i49 >> 3) & 234881024), 2);
                        composer4.endReplaceableGroup();
                        return;
                    }
                    composer4.skipToGroupEnd();
                }
            }), composer3, (i47222222 & 7168) | (i47222222 & 896) | 1572864, 50);
            f7 = f5;
            j21 = j10;
            shape5 = shape4;
            f8 = f6;
            j22 = j17;
            j23 = j20;
            j24 = j19;
            function25 = function24;
            modifier4 = modifier6222222;
            j25 = j11;
            j26 = j18;
            endRestartGroup = composer3.endRestartGroup();
            if (endRestartGroup != null) {
            }
        }
        if ((i2 & 896) != 0) {
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
        i12 = i11;
        if ((i2 & 234881024) == 0) {
        }
        i13 = i5 & 512;
        if (i13 == 0) {
        }
        i14 = i13;
        if ((i3 & 14) == 0) {
        }
        if ((i3 & 112) == 0) {
        }
        i16 = i5 & 4096;
        if (i16 != 0) {
        }
        i17 = i5 & 8192;
        if (i17 == 0) {
        }
        i18 = i5 & 16384;
        if (i18 != 0) {
        }
        i19 = i18;
        if ((i3 & 458752) == 0) {
        }
        i20 = i5 & 65536;
        if (i20 == 0) {
        }
        if ((i3 & 29360128) == 0) {
        }
        if ((i3 & 234881024) == 0) {
        }
        if ((i3 & 1879048192) == 0) {
        }
        i21 = i15;
        if ((i4 & 14) != 0) {
        }
        if ((i4 & 112) != 0) {
        }
        if ((i5 & 4194304) == 0) {
        }
        if ((1533916891 & i6) == 306783378) {
        }
        startRestartGroup.startDefaults();
        if ((i2 & 1) != 0) {
        }
        if (i36 == 0) {
        }
        if ((i5 & 4) == 0) {
        }
        if (i7 == 0) {
        }
        if (i8 == 0) {
        }
        if (i9 == 0) {
        }
        if (i10 == 0) {
        }
        if (i26 == 0) {
        }
        if ((i5 & 256) == 0) {
        }
        if (i28 == 0) {
        }
        if ((i5 & 1024) == 0) {
        }
        Function2<? super Composer, ? super Integer, Unit> function272222222 = function26;
        if ((i5 & 2048) == 0) {
        }
        if (i16 == 0) {
        }
        if (i25 == 0) {
        }
        if (i27 == 0) {
        }
        float f92222222 = m916getSheetPeekHeightD9Ej5fM;
        if ((i5 & 32768) == 0) {
        }
        if (i20 == 0) {
        }
        if ((i5 & 131072) == 0) {
        }
        if ((262144 & i5) == 0) {
        }
        if ((i5 & 524288) == 0) {
        }
        long j272222222 = j15;
        if ((i5 & 1048576) == 0) {
        }
        if ((2097152 & i5) == 0) {
        }
        startRestartGroup.endDefaults();
        startRestartGroup.startReplaceableGroup(773894976);
        ComposerKt.sourceInformation(startRestartGroup, "C(rememberCoroutineScope)475@19849L144:Effects.kt#9igjgp");
        startRestartGroup.startReplaceableGroup(-492369756);
        ComposerKt.sourceInformation(startRestartGroup, "C(remember):Composables.kt#9igjgp");
        rememberedValue = startRestartGroup.rememberedValue();
        if (rememberedValue == Composer.INSTANCE.getEmpty()) {
        }
        startRestartGroup.endReplaceableGroup();
        final CoroutineScope coroutineScope2222222 = ((CompositionScopedCoroutineScopeCanceller) rememberedValue).getCoroutineScope();
        startRestartGroup.endReplaceableGroup();
        ProvidableCompositionLocal<Density> localDensity2222222 = CompositionLocalsKt.getLocalDensity();
        ComposerKt.sourceInformationMarkerStart(startRestartGroup, 2023513938, "C:CompositionLocal.kt#9igjgp");
        Object consume2222222 = startRestartGroup.consume(localDensity2222222);
        ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
        mo315toPx0680j_4 = ((Density) consume2222222).mo315toPx0680j_4(f5);
        startRestartGroup.startReplaceableGroup(-492369756);
        ComposerKt.sourceInformation(startRestartGroup, "C(remember):Composables.kt#9igjgp");
        rememberedValue2 = startRestartGroup.rememberedValue();
        if (rememberedValue2 != Composer.INSTANCE.getEmpty()) {
        }
        startRestartGroup.endReplaceableGroup();
        mutableState = (MutableState) obj;
        if (Intrinsics.areEqual(mo315toPx0680j_4, m919BottomSheetScaffold_bGncdBI$lambda4(mutableState))) {
        }
        final BottomSheetScaffoldState bottomSheetScaffoldState32222222 = bottomSheetScaffoldState2;
        final Function2<? super Composer, ? super Integer, Unit> function282222222 = function24;
        final Function2<? super Composer, ? super Integer, Unit> function292222222 = function23;
        final float f102222222 = f5;
        final int i422222222 = m1064getEnd5ygKITE;
        final int i432222222 = i32;
        final int i442222222 = i33;
        final int i452222222 = i21;
        final boolean z52222222 = z3;
        final Modifier companion22222222 = companion;
        final Shape shape62222222 = cornerBasedShape;
        final long j282222222 = j11;
        final long j292222222 = j10;
        final float f112222222 = m915getSheetElevationD9Ej5fM;
        final Function3<? super SnackbarHostState, ? super Composer, ? super Integer, Unit> function362222222 = m1001getLambda1$material_release;
        composer3 = composer2;
        final Function2<? super Composer, ? super Integer, Unit> composableLambda2222222 = ComposableLambdaKt.composableLambda(composer3, 893101063, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material.BottomSheetScaffoldKt$BottomSheetScaffold$child$1
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

            public final void invoke(Composer composer4, int i462222222) {
                ComposerKt.sourceInformation(composer4, "C316@13233L2758:BottomSheetScaffold.kt#jmzs0o");
                if ((i462222222 & 11) != 2 || !composer4.getSkipping()) {
                    State<Float> offset = BottomSheetScaffoldState.this.getBottomSheetState().getOffset();
                    BottomSheetState bottomSheetState = BottomSheetScaffoldState.this.getBottomSheetState();
                    Function2<Composer, Integer, Unit> function210 = function282222222;
                    Function3<PaddingValues, Composer, Integer, Unit> function372222222 = content;
                    final float f122222222 = mo315toPx0680j_4;
                    final BottomSheetScaffoldState bottomSheetScaffoldState42222222 = BottomSheetScaffoldState.this;
                    final boolean z62222222 = z52222222;
                    final Modifier modifier62222222 = companion22222222;
                    final float f132 = f102222222;
                    final MutableState<Float> mutableState2 = mutableState;
                    final Shape shape72222222 = shape62222222;
                    final long j302222222 = j282222222;
                    final long j312222222 = j292222222;
                    final float f14 = f112222222;
                    final int i472222222 = i432222222;
                    final int i48 = i452222222;
                    final Function3<? super ColumnScope, ? super Composer, ? super Integer, Unit> function38 = sheetContent;
                    ComposableLambda composableLambda22222222 = ComposableLambdaKt.composableLambda(composer4, -1378534681, true, new Function3<Integer, Composer, Integer, Unit>() { // from class: androidx.compose.material.BottomSheetScaffoldKt$BottomSheetScaffold$child$1.1
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        /* JADX WARN: Multi-variable type inference failed */
                        {
                            super(3);
                        }

                        @Override // kotlin.jvm.functions.Function3
                        public /* bridge */ /* synthetic */ Unit invoke(Integer num, Composer composer5, Integer num2) {
                            invoke(num.intValue(), composer5, num2.intValue());
                            return Unit.INSTANCE;
                        }

                        public final void invoke(int i49, Composer composer5, int i50) {
                            int i51;
                            Float m919BottomSheetScaffold_bGncdBI$lambda4;
                            Float m919BottomSheetScaffold_bGncdBI$lambda42;
                            Map mapOf;
                            Modifier.Companion m1182swipeablepPrIpRY;
                            ComposerKt.sourceInformation(composer5, "C354@15208L95,347@14851L711:BottomSheetScaffold.kt#jmzs0o");
                            if ((i50 & 14) == 0) {
                                i51 = i50 | (composer5.changed(i49) ? 4 : 2);
                            } else {
                                i51 = i50;
                            }
                            if ((i51 & 91) != 18 || !composer5.getSkipping()) {
                                m919BottomSheetScaffold_bGncdBI$lambda4 = BottomSheetScaffoldKt.m919BottomSheetScaffold_bGncdBI$lambda4(mutableState2);
                                if (m919BottomSheetScaffold_bGncdBI$lambda4 == null) {
                                    m1182swipeablepPrIpRY = Modifier.INSTANCE;
                                } else {
                                    if (MathKt.roundToInt(m919BottomSheetScaffold_bGncdBI$lambda4.floatValue()) != MathKt.roundToInt(f122222222)) {
                                        float f15 = i49;
                                        m919BottomSheetScaffold_bGncdBI$lambda42 = BottomSheetScaffoldKt.m919BottomSheetScaffold_bGncdBI$lambda4(mutableState2);
                                        Intrinsics.checkNotNull(m919BottomSheetScaffold_bGncdBI$lambda42);
                                        mapOf = MapsKt.mapOf(TuplesKt.to(Float.valueOf(f15 - m919BottomSheetScaffold_bGncdBI$lambda42.floatValue()), BottomSheetValue.Expanded), TuplesKt.to(Float.valueOf(f15 - f122222222), BottomSheetValue.Collapsed));
                                    } else {
                                        mapOf = MapsKt.mapOf(TuplesKt.to(Float.valueOf(i49 - m919BottomSheetScaffold_bGncdBI$lambda4.floatValue()), BottomSheetValue.Collapsed));
                                    }
                                    m1182swipeablepPrIpRY = SwipeableKt.m1182swipeablepPrIpRY(Modifier.INSTANCE, bottomSheetScaffoldState42222222.getBottomSheetState(), r13, Orientation.Vertical, (r26 & 8) != 0 ? true : z62222222, (r26 & 16) != 0 ? false : false, (r26 & 32) != 0 ? null : null, (r26 & 64) != 0 ? new Function2<T, T, FixedThreshold>() { // from class: androidx.compose.material.SwipeableKt$swipeable$1
                                        /* JADX WARN: Can't rename method to resolve collision */
                                        @Override // kotlin.jvm.functions.Function2
                                        public final FixedThreshold invoke(T t, T t2) {
                                            return new FixedThreshold(Dp.m3840constructorimpl(56), null);
                                        }
                                    } : null, (r26 & 128) != 0 ? SwipeableDefaults.resistanceConfig$default(SwipeableDefaults.INSTANCE, mapOf.keySet(), 0.0f, 0.0f, 6, null) : null, (r26 & 256) != 0 ? SwipeableDefaults.INSTANCE.m1181getVelocityThresholdD9Ej5fM() : 0.0f);
                                }
                                Modifier m452requiredHeightInVpY3zN4$default = SizeKt.m452requiredHeightInVpY3zN4$default(SizeKt.fillMaxWidth$default(NestedScrollModifierKt.nestedScroll$default(Modifier.INSTANCE, bottomSheetScaffoldState42222222.getBottomSheetState().getNestedScrollConnection(), null, 2, null).then(m1182swipeablepPrIpRY).then(modifier62222222), 0.0f, 1, null), f132, 0.0f, 2, null);
                                final MutableState<Float> mutableState3 = mutableState2;
                                composer5.startReplaceableGroup(1157296644);
                                ComposerKt.sourceInformation(composer5, "C(remember)P(1):Composables.kt#9igjgp");
                                boolean changed = composer5.changed(mutableState3);
                                Object rememberedValue3 = composer5.rememberedValue();
                                if (changed || rememberedValue3 == Composer.INSTANCE.getEmpty()) {
                                    rememberedValue3 = (Function1) new Function1<IntSize, Unit>() { // from class: androidx.compose.material.BottomSheetScaffoldKt$BottomSheetScaffold$child$1$1$1$1
                                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                        {
                                            super(1);
                                        }

                                        @Override // kotlin.jvm.functions.Function1
                                        public /* bridge */ /* synthetic */ Unit invoke(IntSize intSize) {
                                            m924invokeozmzZPI(intSize.getPackedValue());
                                            return Unit.INSTANCE;
                                        }

                                        /* renamed from: invoke-ozmzZPI, reason: not valid java name */
                                        public final void m924invokeozmzZPI(long j322222222) {
                                            mutableState3.setValue(Float.valueOf(IntSize.m3999getHeightimpl(j322222222)));
                                        }
                                    };
                                    composer5.updateRememberedValue(rememberedValue3);
                                }
                                composer5.endReplaceableGroup();
                                Modifier onSizeChanged = OnRemeasuredModifierKt.onSizeChanged(m452requiredHeightInVpY3zN4$default, (Function1) rememberedValue3);
                                Shape shape82 = shape72222222;
                                long j322222222 = j302222222;
                                long j332 = j312222222;
                                float f16 = f14;
                                final Function3<? super ColumnScope, ? super Composer, ? super Integer, Unit> function39 = function38;
                                final int i52 = i472222222;
                                ComposableLambda composableLambda3 = ComposableLambdaKt.composableLambda(composer5, -698903261, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material.BottomSheetScaffoldKt.BottomSheetScaffold.child.1.1.2
                                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                    /* JADX WARN: Multi-variable type inference failed */
                                    {
                                        super(2);
                                    }

                                    @Override // kotlin.jvm.functions.Function2
                                    public /* bridge */ /* synthetic */ Unit invoke(Composer composer6, Integer num) {
                                        invoke(composer6, num.intValue());
                                        return Unit.INSTANCE;
                                    }

                                    public final void invoke(Composer composer6, int i53) {
                                        ComposerKt.sourceInformation(composer6, "C361@15529L30:BottomSheetScaffold.kt#jmzs0o");
                                        if ((i53 & 11) == 2 && composer6.getSkipping()) {
                                            composer6.skipToGroupEnd();
                                            return;
                                        }
                                        Function3<ColumnScope, Composer, Integer, Unit> function310 = function39;
                                        int i54 = (i52 << 9) & 7168;
                                        composer6.startReplaceableGroup(-483455358);
                                        ComposerKt.sourceInformation(composer6, "C(Column)P(2,3,1)77@3880L61,78@3946L133:Column.kt#2w3rfo");
                                        Modifier.Companion companion3 = Modifier.INSTANCE;
                                        MeasurePolicy columnMeasurePolicy = ColumnKt.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), Alignment.INSTANCE.getStart(), composer6, 0);
                                        composer6.startReplaceableGroup(-1323940314);
                                        ComposerKt.sourceInformation(composer6, "C(Layout)P(!1,2)74@2915L7,75@2970L7,76@3029L7,77@3041L460:Layout.kt#80mrfh");
                                        ProvidableCompositionLocal<Density> localDensity22222222 = CompositionLocalsKt.getLocalDensity();
                                        ComposerKt.sourceInformationMarkerStart(composer6, 2023513938, "C:CompositionLocal.kt#9igjgp");
                                        Object consume22222222 = composer6.consume(localDensity22222222);
                                        ComposerKt.sourceInformationMarkerEnd(composer6);
                                        Density density = (Density) consume22222222;
                                        ProvidableCompositionLocal<LayoutDirection> localLayoutDirection = CompositionLocalsKt.getLocalLayoutDirection();
                                        ComposerKt.sourceInformationMarkerStart(composer6, 2023513938, "C:CompositionLocal.kt#9igjgp");
                                        Object consume3 = composer6.consume(localLayoutDirection);
                                        ComposerKt.sourceInformationMarkerEnd(composer6);
                                        LayoutDirection layoutDirection = (LayoutDirection) consume3;
                                        ProvidableCompositionLocal<ViewConfiguration> localViewConfiguration = CompositionLocalsKt.getLocalViewConfiguration();
                                        ComposerKt.sourceInformationMarkerStart(composer6, 2023513938, "C:CompositionLocal.kt#9igjgp");
                                        Object consume4 = composer6.consume(localViewConfiguration);
                                        ComposerKt.sourceInformationMarkerEnd(composer6);
                                        ViewConfiguration viewConfiguration = (ViewConfiguration) consume4;
                                        Function0<ComposeUiNode> constructor = ComposeUiNode.INSTANCE.getConstructor();
                                        Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> materializerOf = LayoutKt.materializerOf(companion3);
                                        if (!(composer6.getApplier() instanceof Applier)) {
                                            ComposablesKt.invalidApplier();
                                        }
                                        composer6.startReusableNode();
                                        if (composer6.getInserting()) {
                                            composer6.createNode(constructor);
                                        } else {
                                            composer6.useNode();
                                        }
                                        composer6.disableReusing();
                                        Composer m1283constructorimpl = Updater.m1283constructorimpl(composer6);
                                        Updater.m1290setimpl(m1283constructorimpl, columnMeasurePolicy, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
                                        Updater.m1290setimpl(m1283constructorimpl, density, ComposeUiNode.INSTANCE.getSetDensity());
                                        Updater.m1290setimpl(m1283constructorimpl, layoutDirection, ComposeUiNode.INSTANCE.getSetLayoutDirection());
                                        Updater.m1290setimpl(m1283constructorimpl, viewConfiguration, ComposeUiNode.INSTANCE.getSetViewConfiguration());
                                        composer6.enableReusing();
                                        materializerOf.invoke(SkippableUpdater.m1273boximpl(SkippableUpdater.m1274constructorimpl(composer6)), composer6, 0);
                                        composer6.startReplaceableGroup(2058660585);
                                        composer6.startReplaceableGroup(-1163856341);
                                        ComposerKt.sourceInformation(composer6, "C79@3994L9:Column.kt#2w3rfo");
                                        function310.invoke(ColumnScopeInstance.INSTANCE, composer6, Integer.valueOf(((i54 >> 6) & 112) | 6));
                                        composer6.endReplaceableGroup();
                                        composer6.endReplaceableGroup();
                                        composer6.endNode();
                                        composer6.endReplaceableGroup();
                                        composer6.endReplaceableGroup();
                                    }
                                });
                                int i53 = i472222222;
                                int i54 = i48;
                                SurfaceKt.m1172SurfaceFjzlyU(onSizeChanged, shape82, j322222222, j332, null, f16, composableLambda3, composer5, ((i53 >> 21) & 112) | 1572864 | ((i54 << 6) & 896) | ((i54 << 6) & 7168) | ((i53 >> 12) & 458752), 16);
                                return;
                            }
                            composer5.skipToGroupEnd();
                        }
                    });
                    Function2<Composer, Integer, Unit> function211 = function292222222;
                    final Function3<? super SnackbarHostState, ? super Composer, ? super Integer, Unit> function39 = function362222222;
                    final BottomSheetScaffoldState bottomSheetScaffoldState52 = BottomSheetScaffoldState.this;
                    final int i49 = i432222222;
                    ComposableLambda composableLambda3 = ComposableLambdaKt.composableLambda(composer4, -486138068, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material.BottomSheetScaffoldKt$BottomSheetScaffold$child$1.2
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

                        public final void invoke(Composer composer5, int i50) {
                            ComposerKt.sourceInformation(composer5, "C365@15680L45:BottomSheetScaffold.kt#jmzs0o");
                            if ((i50 & 11) == 2 && composer5.getSkipping()) {
                                composer5.skipToGroupEnd();
                            } else {
                                function39.invoke(bottomSheetScaffoldState52.getSnackbarHostState(), composer5, Integer.valueOf((i49 >> 9) & 112));
                            }
                        }
                    });
                    float f15 = f102222222;
                    int i50 = i422222222;
                    int i51 = i432222222;
                    BottomSheetScaffoldKt.m918BottomSheetScaffoldLayoutKCBPh4w(function210, function372222222, composableLambda22222222, function211, composableLambda3, f15, i50, offset, bottomSheetState, composer4, ((i51 >> 9) & 14) | 24960 | ((i442222222 >> 3) & 112) | ((i51 >> 6) & 7168) | ((i452222222 << 9) & 458752) | (i51 & 3670016));
                    return;
                }
                composer4.skipToGroupEnd();
            }
        });
        Modifier modifier62222222 = modifier3;
        final Function3<? super ColumnScope, ? super Composer, ? super Integer, Unit> function372222222 = function34;
        final BottomSheetScaffoldState bottomSheetScaffoldState42222222 = bottomSheetScaffoldState2;
        final boolean z62222222 = z4;
        final Shape shape72222222 = shape4;
        final float f122222222 = f6;
        final long j302222222 = j17;
        final long j312222222 = j13;
        final long j322222222 = j20;
        final int i462222222 = i21;
        int i472222222 = i33 << 6;
        SurfaceKt.m1172SurfaceFjzlyU(SizeKt.fillMaxSize$default(modifier62222222, 0.0f, 1, null), null, j19, j18, null, 0.0f, ComposableLambdaKt.composableLambda(composer3, 1273816607, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material.BottomSheetScaffoldKt$BottomSheetScaffold$1
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

            public final void invoke(Composer composer4, int i48) {
                ComposerKt.sourceInformation(composer4, "C:BottomSheetScaffold.kt#jmzs0o");
                if ((i48 & 11) != 2 || !composer4.getSkipping()) {
                    if (function372222222 == null) {
                        composer4.startReplaceableGroup(-249544858);
                        ComposerKt.sourceInformation(composer4, "381@16183L7");
                        composableLambda2222222.invoke(composer4, 6);
                        composer4.endReplaceableGroup();
                        return;
                    }
                    composer4.startReplaceableGroup(-249544821);
                    ComposerKt.sourceInformation(composer4, "383@16220L480");
                    Function3<ColumnScope, Composer, Integer, Unit> function38 = function372222222;
                    DrawerState drawerState = bottomSheetScaffoldState42222222.getDrawerState();
                    boolean z72 = z62222222;
                    Shape shape82 = shape72222222;
                    float f132 = f122222222;
                    long j332 = j302222222;
                    long j34 = j312222222;
                    long j35 = j322222222;
                    Function2<Composer, Integer, Unit> function210 = composableLambda2222222;
                    int i49 = i462222222;
                    DrawerKt.m1025ModalDrawerGs3lGvM(function38, null, drawerState, z72, shape82, f132, j332, j34, j35, function210, composer4, ((i49 >> 3) & 7168) | ((i49 >> 9) & 14) | C.ENCODING_PCM_32BIT | ((i49 >> 3) & 57344) | ((i49 >> 3) & 458752) | ((i49 >> 3) & 3670016) | ((i49 >> 3) & 29360128) | ((i49 >> 3) & 234881024), 2);
                    composer4.endReplaceableGroup();
                    return;
                }
                composer4.skipToGroupEnd();
            }
        }), composer3, (i472222222 & 7168) | (i472222222 & 896) | 1572864, 50);
        f7 = f5;
        j21 = j10;
        shape5 = shape4;
        f8 = f6;
        j22 = j17;
        j23 = j20;
        j24 = j19;
        function25 = function24;
        modifier4 = modifier62222222;
        j25 = j11;
        j26 = j18;
        endRestartGroup = composer3.endRestartGroup();
        if (endRestartGroup != null) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: BottomSheetScaffold_bGncdBI$lambda-4, reason: not valid java name */
    public static final Float m919BottomSheetScaffold_bGncdBI$lambda4(MutableState<Float> mutableState) {
        return mutableState.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: BottomSheetScaffoldLayout-KCBPh4w, reason: not valid java name */
    public static final void m918BottomSheetScaffoldLayoutKCBPh4w(final Function2<? super Composer, ? super Integer, Unit> function2, final Function3<? super PaddingValues, ? super Composer, ? super Integer, Unit> function3, final Function3<? super Integer, ? super Composer, ? super Integer, Unit> function32, final Function2<? super Composer, ? super Integer, Unit> function22, final Function2<? super Composer, ? super Integer, Unit> function23, final float f, final int i, final State<Float> state, final BottomSheetState bottomSheetState, Composer composer, final int i2) {
        int i3;
        Composer startRestartGroup = composer.startRestartGroup(499725572);
        ComposerKt.sourceInformation(startRestartGroup, "C(BottomSheetScaffoldLayout)P(8!3,7,5:c#ui.unit.Dp,3:c#material.FabPosition)429@17635L2479,429@17618L2496:BottomSheetScaffold.kt#jmzs0o");
        int i4 = (i2 & 14) == 0 ? (startRestartGroup.changed(function2) ? 4 : 2) | i2 : i2;
        if ((i2 & 112) == 0) {
            i4 |= startRestartGroup.changed(function3) ? 32 : 16;
        }
        if ((i2 & 896) == 0) {
            i4 |= startRestartGroup.changed(function32) ? 256 : 128;
        }
        if ((i2 & 7168) == 0) {
            i4 |= startRestartGroup.changed(function22) ? 2048 : 1024;
        }
        if ((57344 & i2) == 0) {
            i4 |= startRestartGroup.changed(function23) ? 16384 : 8192;
        }
        if ((458752 & i2) == 0) {
            i4 |= startRestartGroup.changed(f) ? 131072 : 65536;
        }
        if ((3670016 & i2) == 0) {
            i4 |= startRestartGroup.changed(i) ? 1048576 : 524288;
        }
        if ((29360128 & i2) == 0) {
            i4 |= startRestartGroup.changed(state) ? 8388608 : 4194304;
        }
        if ((234881024 & i2) == 0) {
            i4 |= startRestartGroup.changed(bottomSheetState) ? AccessibilityEventCompat.TYPE_VIEW_TARGETED_BY_SCROLL : 33554432;
        }
        final int i5 = i4;
        if ((i5 & 191739611) != 38347922 || !startRestartGroup.getSkipping()) {
            Object[] objArr = {function32, state, function2, function3, Dp.m3838boximpl(f), function22, FabPosition.m1056boximpl(i), function23, bottomSheetState};
            startRestartGroup.startReplaceableGroup(-568225417);
            ComposerKt.sourceInformation(startRestartGroup, "C(remember)P(1):Composables.kt#9igjgp");
            boolean z = false;
            for (int i6 = 0; i6 < 9; i6++) {
                z |= startRestartGroup.changed(objArr[i6]);
            }
            Object rememberedValue = startRestartGroup.rememberedValue();
            if (z || rememberedValue == Composer.INSTANCE.getEmpty()) {
                i3 = 0;
                rememberedValue = (Function2) new Function2<SubcomposeMeasureScope, Constraints, MeasureResult>() { // from class: androidx.compose.material.BottomSheetScaffoldKt$BottomSheetScaffoldLayout$1$1

                    /* compiled from: BottomSheetScaffold.kt */
                    @Metadata(k = 3, mv = {1, 6, 0}, xi = 48)
                    public /* synthetic */ class WhenMappings {
                        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

                        static {
                            int[] iArr = new int[BottomSheetValue.values().length];
                            iArr[BottomSheetValue.Collapsed.ordinal()] = 1;
                            iArr[BottomSheetValue.Expanded.ordinal()] = 2;
                            $EnumSwitchMapping$0 = iArr;
                        }
                    }

                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    /* JADX WARN: Multi-variable type inference failed */
                    {
                        super(2);
                    }

                    @Override // kotlin.jvm.functions.Function2
                    public /* bridge */ /* synthetic */ MeasureResult invoke(SubcomposeMeasureScope subcomposeMeasureScope, Constraints constraints) {
                        return m925invoke0kLqBqw(subcomposeMeasureScope, constraints.getValue());
                    }

                    /* renamed from: invoke-0kLqBqw, reason: not valid java name */
                    public final MeasureResult m925invoke0kLqBqw(SubcomposeMeasureScope SubcomposeLayout, long j) {
                        final Placeable placeable;
                        float f2;
                        int i7;
                        int i8;
                        int height;
                        float f3;
                        Intrinsics.checkNotNullParameter(SubcomposeLayout, "$this$SubcomposeLayout");
                        int m3796getMaxWidthimpl = Constraints.m3796getMaxWidthimpl(j);
                        final int m3795getMaxHeightimpl = Constraints.m3795getMaxHeightimpl(j);
                        long m3787copyZbe2FdA$default = Constraints.m3787copyZbe2FdA$default(j, 0, 0, 0, 0, 10, null);
                        BottomSheetScaffoldLayoutSlot bottomSheetScaffoldLayoutSlot = BottomSheetScaffoldLayoutSlot.Sheet;
                        final Function3<Integer, Composer, Integer, Unit> function33 = function32;
                        final int i9 = i5;
                        final Placeable mo3121measureBRTryo0 = SubcomposeLayout.subcompose(bottomSheetScaffoldLayoutSlot, ComposableLambdaKt.composableLambdaInstance(520491296, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material.BottomSheetScaffoldKt$BottomSheetScaffoldLayout$1$1$sheetPlaceable$1
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

                            public final void invoke(Composer composer2, int i10) {
                                ComposerKt.sourceInformation(composer2, "C435@17917L25:BottomSheetScaffold.kt#jmzs0o");
                                if ((i10 & 11) == 2 && composer2.getSkipping()) {
                                    composer2.skipToGroupEnd();
                                } else {
                                    function33.invoke(Integer.valueOf(m3795getMaxHeightimpl), composer2, Integer.valueOf((i9 >> 3) & 112));
                                }
                            }
                        })).get(0).mo3121measureBRTryo0(m3787copyZbe2FdA$default);
                        final int roundToInt = MathKt.roundToInt(state.getValue().floatValue());
                        final Function2<Composer, Integer, Unit> function24 = function2;
                        if (function24 != null) {
                            final int i10 = i5;
                            placeable = SubcomposeLayout.subcompose(BottomSheetScaffoldLayoutSlot.TopBar, ComposableLambdaKt.composableLambdaInstance(1988456983, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material.BottomSheetScaffoldKt$BottomSheetScaffoldLayout$1$1$topBarPlaceable$1$1
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

                                public final void invoke(Composer composer2, int i11) {
                                    ComposerKt.sourceInformation(composer2, "C440@18148L8:BottomSheetScaffold.kt#jmzs0o");
                                    if ((i11 & 11) == 2 && composer2.getSkipping()) {
                                        composer2.skipToGroupEnd();
                                    } else {
                                        function24.invoke(composer2, Integer.valueOf(i10 & 14));
                                    }
                                }
                            })).get(0).mo3121measureBRTryo0(m3787copyZbe2FdA$default);
                        } else {
                            placeable = null;
                        }
                        final int height2 = placeable != null ? placeable.getHeight() : 0;
                        long m3787copyZbe2FdA$default2 = Constraints.m3787copyZbe2FdA$default(m3787copyZbe2FdA$default, 0, 0, 0, m3795getMaxHeightimpl - height2, 7, null);
                        BottomSheetScaffoldLayoutSlot bottomSheetScaffoldLayoutSlot2 = BottomSheetScaffoldLayoutSlot.Body;
                        final Function3<PaddingValues, Composer, Integer, Unit> function34 = function3;
                        final float f4 = f;
                        final int i11 = i5;
                        final Placeable mo3121measureBRTryo02 = SubcomposeLayout.subcompose(bottomSheetScaffoldLayoutSlot2, ComposableLambdaKt.composableLambdaInstance(1466287989, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material.BottomSheetScaffoldKt$BottomSheetScaffoldLayout$1$1$bodyPlaceable$1
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

                            public final void invoke(Composer composer2, int i12) {
                                ComposerKt.sourceInformation(composer2, "C447@18454L45:BottomSheetScaffold.kt#jmzs0o");
                                if ((i12 & 11) == 2 && composer2.getSkipping()) {
                                    composer2.skipToGroupEnd();
                                } else {
                                    function34.invoke(PaddingKt.m417PaddingValuesa9UjIt4$default(0.0f, 0.0f, 0.0f, f4, 7, null), composer2, Integer.valueOf(i11 & 112));
                                }
                            }
                        })).get(0).mo3121measureBRTryo0(m3787copyZbe2FdA$default2);
                        Function2<Composer, Integer, Unit> function25 = function22;
                        Placeable mo3121measureBRTryo03 = function25 != null ? SubcomposeLayout.subcompose(BottomSheetScaffoldLayoutSlot.Fab, function25).get(0).mo3121measureBRTryo0(m3787copyZbe2FdA$default) : null;
                        int width = mo3121measureBRTryo03 != null ? mo3121measureBRTryo03.getWidth() : 0;
                        int height3 = mo3121measureBRTryo03 != null ? mo3121measureBRTryo03.getHeight() : 0;
                        if (FabPosition.m1059equalsimpl0(i, FabPosition.INSTANCE.m1063getCenter5ygKITE())) {
                            i7 = (m3796getMaxWidthimpl - width) / 2;
                        } else {
                            f2 = BottomSheetScaffoldKt.FabSpacing;
                            i7 = (m3796getMaxWidthimpl - width) - SubcomposeLayout.mo309roundToPx0680j_4(f2);
                        }
                        int i12 = height3 / 2;
                        if (SubcomposeLayout.mo315toPx0680j_4(f) < i12) {
                            f3 = BottomSheetScaffoldKt.FabSpacing;
                            i8 = (roundToInt - height3) - SubcomposeLayout.mo309roundToPx0680j_4(f3);
                        } else {
                            i8 = roundToInt - i12;
                        }
                        final int i13 = i8;
                        final Placeable mo3121measureBRTryo04 = SubcomposeLayout.subcompose(BottomSheetScaffoldLayoutSlot.Snackbar, function23).get(0).mo3121measureBRTryo0(m3787copyZbe2FdA$default);
                        final int width2 = (m3796getMaxWidthimpl - mo3121measureBRTryo04.getWidth()) / 2;
                        int i14 = WhenMappings.$EnumSwitchMapping$0[bottomSheetState.getCurrentValue().ordinal()];
                        if (i14 == 1) {
                            height = i13 - mo3121measureBRTryo04.getHeight();
                        } else {
                            if (i14 != 2) {
                                throw new NoWhenBranchMatchedException();
                            }
                            height = m3795getMaxHeightimpl - mo3121measureBRTryo04.getHeight();
                        }
                        final int i15 = height;
                        final Placeable placeable2 = mo3121measureBRTryo03;
                        final int i16 = i7;
                        return MeasureScope.layout$default(SubcomposeLayout, m3796getMaxWidthimpl, m3795getMaxHeightimpl, null, new Function1<Placeable.PlacementScope, Unit>() { // from class: androidx.compose.material.BottomSheetScaffoldKt$BottomSheetScaffoldLayout$1$1.1
                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
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
                                Placeable.PlacementScope.placeRelative$default(layout, Placeable.this, 0, height2, 0.0f, 4, null);
                                Placeable placeable3 = placeable;
                                if (placeable3 != null) {
                                    Placeable.PlacementScope.placeRelative$default(layout, placeable3, 0, 0, 0.0f, 4, null);
                                }
                                Placeable.PlacementScope.placeRelative$default(layout, mo3121measureBRTryo0, 0, roundToInt, 0.0f, 4, null);
                                Placeable placeable4 = placeable2;
                                if (placeable4 != null) {
                                    Placeable.PlacementScope.placeRelative$default(layout, placeable4, i16, i13, 0.0f, 4, null);
                                }
                                Placeable.PlacementScope.placeRelative$default(layout, mo3121measureBRTryo04, width2, i15, 0.0f, 4, null);
                            }
                        }, 4, null);
                    }
                };
                startRestartGroup.updateRememberedValue(rememberedValue);
            } else {
                i3 = 0;
            }
            startRestartGroup.endReplaceableGroup();
            SubcomposeLayoutKt.SubcomposeLayout(null, (Function2) rememberedValue, startRestartGroup, i3, 1);
        } else {
            startRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup == null) {
            return;
        }
        endRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material.BottomSheetScaffoldKt$BottomSheetScaffoldLayout$2
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

            public final void invoke(Composer composer2, int i7) {
                BottomSheetScaffoldKt.m918BottomSheetScaffoldLayoutKCBPh4w(function2, function3, function32, function22, function23, f, i, state, bottomSheetState, composer2, i2 | 1);
            }
        });
    }
}
