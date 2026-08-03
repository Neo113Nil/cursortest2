package androidx.compose.material;

/* compiled from: BottomSheetScaffold.kt */
@kotlin.Metadata(d1 = {"\u0000\u0098\u0001\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u001aá\u0002\u0010\u0003\u001a\u00020\u00042\u001c\u0010\u0005\u001a\u0018\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u00040\u0006¢\u0006\u0002\b\b¢\u0006\u0002\b\t2\b\b\u0002\u0010\n\u001a\u00020\u000b2\b\b\u0002\u0010\f\u001a\u00020\r2\u0015\b\u0002\u0010\u000e\u001a\u000f\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u000f¢\u0006\u0002\b\b2\u0019\b\u0002\u0010\u0010\u001a\u0013\u0012\u0004\u0012\u00020\u0011\u0012\u0004\u0012\u00020\u00040\u0006¢\u0006\u0002\b\b2\u0015\b\u0002\u0010\u0012\u001a\u000f\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u000f¢\u0006\u0002\b\b2\b\b\u0002\u0010\u0013\u001a\u00020\u00142\b\b\u0002\u0010\u0015\u001a\u00020\u00162\b\b\u0002\u0010\u0017\u001a\u00020\u00182\b\b\u0002\u0010\u0019\u001a\u00020\u00012\b\b\u0002\u0010\u001a\u001a\u00020\u001b2\b\b\u0002\u0010\u001c\u001a\u00020\u001b2\b\b\u0002\u0010\u001d\u001a\u00020\u00012 \b\u0002\u0010\u001e\u001a\u001a\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0006¢\u0006\u0002\b\b¢\u0006\u0002\b\t2\b\b\u0002\u0010\u001f\u001a\u00020\u00162\b\b\u0002\u0010 \u001a\u00020\u00182\b\b\u0002\u0010!\u001a\u00020\u00012\b\b\u0002\u0010\"\u001a\u00020\u001b2\b\b\u0002\u0010#\u001a\u00020\u001b2\b\b\u0002\u0010$\u001a\u00020\u001b2\b\b\u0002\u0010%\u001a\u00020\u001b2\b\b\u0002\u0010&\u001a\u00020\u001b2\u0017\u0010'\u001a\u0013\u0012\u0004\u0012\u00020(\u0012\u0004\u0012\u00020\u00040\u0006¢\u0006\u0002\b\bH\u0007ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b)\u0010*\u001aÈ\u0001\u0010+\u001a\u00020\u00042\u0013\u0010\u000e\u001a\u000f\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u000f¢\u0006\u0002\b\b2&\u0010,\u001a\"\u0012\u0013\u0012\u00110(¢\u0006\f\b-\u0012\b\b.\u0012\u0004\b\b(/\u0012\u0004\u0012\u00020\u00040\u0006¢\u0006\u0002\b\b2&\u00100\u001a\"\u0012\u0013\u0012\u001101¢\u0006\f\b-\u0012\b\b.\u0012\u0004\b\b(2\u0012\u0004\u0012\u00020\u00040\u0006¢\u0006\u0002\b\b2\u0013\u0010\u0012\u001a\u000f\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u000f¢\u0006\u0002\b\b2\u0011\u0010\u0010\u001a\r\u0012\u0004\u0012\u00020\u00040\u000f¢\u0006\u0002\b\b2\u0006\u0010\u001d\u001a\u00020\u00012\u0006\u0010\u0013\u001a\u00020\u00142\f\u00103\u001a\b\u0012\u0004\u0012\u000205042\u0006\u00106\u001a\u000207H\u0003ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b8\u00109\u001a+\u0010:\u001a\u00020\r2\b\b\u0002\u0010;\u001a\u00020<2\b\b\u0002\u0010=\u001a\u0002072\b\b\u0002\u0010>\u001a\u00020\u0011H\u0007¢\u0006\u0002\u0010?\u001a;\u0010@\u001a\u0002072\u0006\u0010A\u001a\u00020B2\u000e\b\u0002\u0010C\u001a\b\u0012\u0004\u0012\u0002050D2\u0014\b\u0002\u0010E\u001a\u000e\u0012\u0004\u0012\u00020B\u0012\u0004\u0012\u00020\u00160\u0006H\u0007¢\u0006\u0002\u0010F\"\u0013\u0010\u0000\u001a\u00020\u0001X\u0082\u0004ø\u0001\u0000¢\u0006\u0004\n\u0002\u0010\u0002\u0082\u0002\u000b\n\u0002\b\u0019\n\u0005\b¡\u001e0\u0001¨\u0006G"}, d2 = {"FabSpacing", "Landroidx/compose/ui/unit/Dp;", "F", "BottomSheetScaffold", "", "sheetContent", "Lkotlin/Function1;", "Landroidx/compose/foundation/layout/ColumnScope;", "Landroidx/compose/runtime/Composable;", "Lkotlin/ExtensionFunctionType;", "modifier", "Landroidx/compose/ui/Modifier;", "scaffoldState", "Landroidx/compose/material/BottomSheetScaffoldState;", "topBar", "Lkotlin/Function0;", "snackbarHost", "Landroidx/compose/material/SnackbarHostState;", "floatingActionButton", "floatingActionButtonPosition", "Landroidx/compose/material/FabPosition;", "sheetGesturesEnabled", "", "sheetShape", "Landroidx/compose/ui/graphics/Shape;", "sheetElevation", "sheetBackgroundColor", "Landroidx/compose/ui/graphics/Color;", "sheetContentColor", "sheetPeekHeight", "drawerContent", "drawerGesturesEnabled", "drawerShape", "drawerElevation", "drawerBackgroundColor", "drawerContentColor", "drawerScrimColor", "backgroundColor", "contentColor", "content", "Landroidx/compose/foundation/layout/PaddingValues;", "BottomSheetScaffold-bGncdBI", "(Lkotlin/jvm/functions/Function3;Landroidx/compose/ui/Modifier;Landroidx/compose/material/BottomSheetScaffoldState;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function3;Lkotlin/jvm/functions/Function2;IZLandroidx/compose/ui/graphics/Shape;FJJFLkotlin/jvm/functions/Function3;ZLandroidx/compose/ui/graphics/Shape;FJJJJJLkotlin/jvm/functions/Function3;Landroidx/compose/runtime/Composer;IIII)V", "BottomSheetScaffoldLayout", "body", "Lkotlin/ParameterName;", "name", "innerPadding", "bottomSheet", "", "layoutHeight", "sheetOffset", "Landroidx/compose/runtime/State;", "", "sheetState", "Landroidx/compose/material/BottomSheetState;", "BottomSheetScaffoldLayout-KCBPh4w", "(Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function3;Lkotlin/jvm/functions/Function3;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;FILandroidx/compose/runtime/State;Landroidx/compose/material/BottomSheetState;Landroidx/compose/runtime/Composer;I)V", "rememberBottomSheetScaffoldState", "drawerState", "Landroidx/compose/material/DrawerState;", "bottomSheetState", "snackbarHostState", "(Landroidx/compose/material/DrawerState;Landroidx/compose/material/BottomSheetState;Landroidx/compose/material/SnackbarHostState;Landroidx/compose/runtime/Composer;II)Landroidx/compose/material/BottomSheetScaffoldState;", "rememberBottomSheetState", "initialValue", "Landroidx/compose/material/BottomSheetValue;", "animationSpec", "Landroidx/compose/animation/core/AnimationSpec;", "confirmStateChange", "(Landroidx/compose/material/BottomSheetValue;Landroidx/compose/animation/core/AnimationSpec;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)Landroidx/compose/material/BottomSheetState;", "material_release"}, k = 2, mv = {1, 6, 0}, xi = 48)
/* loaded from: classes.dex */
public final class BottomSheetScaffoldKt {
    private static final float FabSpacing = androidx.compose.ui.unit.Dp.m4478constructorimpl(16);

    @androidx.compose.material.ExperimentalMaterialApi
    public static final androidx.compose.material.BottomSheetState rememberBottomSheetState(final androidx.compose.material.BottomSheetValue initialValue, final androidx.compose.animation.core.AnimationSpec<java.lang.Float> animationSpec, final kotlin.jvm.functions.Function1<? super androidx.compose.material.BottomSheetValue, java.lang.Boolean> function1, androidx.compose.runtime.Composer composer, int i, int i2) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(initialValue, "initialValue");
        composer.startReplaceableGroup(1808153344);
        androidx.compose.runtime.ComposerKt.sourceInformation(composer, "C(rememberBottomSheetState)P(2)163@5857L371:BottomSheetScaffold.kt#jmzs0o");
        if ((i2 & 2) != 0) {
            animationSpec = androidx.compose.material.SwipeableDefaults.INSTANCE.getAnimationSpec();
        }
        if ((i2 & 4) != 0) {
            function1 = new kotlin.jvm.functions.Function1<androidx.compose.material.BottomSheetValue, java.lang.Boolean>() { // from class: androidx.compose.material.BottomSheetScaffoldKt$rememberBottomSheetState$1
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Boolean invoke(androidx.compose.material.BottomSheetValue it) {
                    kotlin.jvm.internal.Intrinsics.checkNotNullParameter(it, "it");
                    return true;
                }
            };
        }
        androidx.compose.material.BottomSheetState bottomSheetState = (androidx.compose.material.BottomSheetState) androidx.compose.runtime.saveable.RememberSaveableKt.m1729rememberSaveable(new java.lang.Object[]{animationSpec}, (androidx.compose.runtime.saveable.Saver) androidx.compose.material.BottomSheetState.INSTANCE.Saver(animationSpec, function1), (java.lang.String) null, (kotlin.jvm.functions.Function0) new kotlin.jvm.functions.Function0<androidx.compose.material.BottomSheetState>() { // from class: androidx.compose.material.BottomSheetScaffoldKt$rememberBottomSheetState$2
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            {
                super(0);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // kotlin.jvm.functions.Function0
            public final androidx.compose.material.BottomSheetState invoke() {
                return new androidx.compose.material.BottomSheetState(androidx.compose.material.BottomSheetValue.this, animationSpec, function1);
            }
        }, composer, 72, 4);
        composer.endReplaceableGroup();
        return bottomSheetState;
    }

    @androidx.compose.material.ExperimentalMaterialApi
    public static final androidx.compose.material.BottomSheetScaffoldState rememberBottomSheetScaffoldState(androidx.compose.material.DrawerState drawerState, androidx.compose.material.BottomSheetState bottomSheetState, androidx.compose.material.SnackbarHostState snackbarHostState, androidx.compose.runtime.Composer composer, int i, int i2) {
        composer.startReplaceableGroup(-1353009744);
        androidx.compose.runtime.ComposerKt.sourceInformation(composer, "C(rememberBottomSheetScaffoldState)P(1)203@7102L39,204@7184L35,205@7264L32,207@7338L248:BottomSheetScaffold.kt#jmzs0o");
        if ((i2 & 1) != 0) {
            drawerState = androidx.compose.material.DrawerKt.rememberDrawerState(androidx.compose.material.DrawerValue.Closed, null, composer, 6, 2);
        }
        if ((i2 & 2) != 0) {
            bottomSheetState = rememberBottomSheetState(androidx.compose.material.BottomSheetValue.Collapsed, null, null, composer, 6, 6);
        }
        if ((i2 & 4) != 0) {
            composer.startReplaceableGroup(-492369756);
            androidx.compose.runtime.ComposerKt.sourceInformation(composer, "C(remember):Composables.kt#9igjgp");
            java.lang.Object rememberedValue = composer.rememberedValue();
            if (rememberedValue == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                rememberedValue = new androidx.compose.material.SnackbarHostState();
                composer.updateRememberedValue(rememberedValue);
            }
            composer.endReplaceableGroup();
            snackbarHostState = (androidx.compose.material.SnackbarHostState) rememberedValue;
        }
        composer.startReplaceableGroup(1618982084);
        androidx.compose.runtime.ComposerKt.sourceInformation(composer, "C(remember)P(1,2,3):Composables.kt#9igjgp");
        boolean changed = composer.changed(drawerState) | composer.changed(bottomSheetState) | composer.changed(snackbarHostState);
        java.lang.Object rememberedValue2 = composer.rememberedValue();
        if (changed || rememberedValue2 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
            rememberedValue2 = new androidx.compose.material.BottomSheetScaffoldState(drawerState, bottomSheetState, snackbarHostState);
            composer.updateRememberedValue(rememberedValue2);
        }
        composer.endReplaceableGroup();
        androidx.compose.material.BottomSheetScaffoldState bottomSheetScaffoldState = (androidx.compose.material.BottomSheetScaffoldState) rememberedValue2;
        composer.endReplaceableGroup();
        return bottomSheetScaffoldState;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:102:0x0272  */
    /* JADX WARN: Removed duplicated region for block: B:10:0x005d  */
    /* JADX WARN: Removed duplicated region for block: B:110:0x028e  */
    /* JADX WARN: Removed duplicated region for block: B:118:0x02a6  */
    /* JADX WARN: Removed duplicated region for block: B:126:0x02c4  */
    /* JADX WARN: Removed duplicated region for block: B:129:0x02df  */
    /* JADX WARN: Removed duplicated region for block: B:138:0x06a8  */
    /* JADX WARN: Removed duplicated region for block: B:141:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:144:0x032f  */
    /* JADX WARN: Removed duplicated region for block: B:179:0x0573  */
    /* JADX WARN: Removed duplicated region for block: B:182:0x05c2  */
    /* JADX WARN: Removed duplicated region for block: B:185:0x05e0  */
    /* JADX WARN: Removed duplicated region for block: B:187:0x05f8  */
    /* JADX WARN: Removed duplicated region for block: B:188:0x05cc  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x007d  */
    /* JADX WARN: Removed duplicated region for block: B:190:0x03b1  */
    /* JADX WARN: Removed duplicated region for block: B:193:0x03be  */
    /* JADX WARN: Removed duplicated region for block: B:195:0x03f9  */
    /* JADX WARN: Removed duplicated region for block: B:197:0x03ff  */
    /* JADX WARN: Removed duplicated region for block: B:199:0x0409  */
    /* JADX WARN: Removed duplicated region for block: B:201:0x040f  */
    /* JADX WARN: Removed duplicated region for block: B:203:0x041a  */
    /* JADX WARN: Removed duplicated region for block: B:206:0x0422  */
    /* JADX WARN: Removed duplicated region for block: B:208:0x0435  */
    /* JADX WARN: Removed duplicated region for block: B:211:0x0442  */
    /* JADX WARN: Removed duplicated region for block: B:214:0x045c  */
    /* JADX WARN: Removed duplicated region for block: B:216:0x0469  */
    /* JADX WARN: Removed duplicated region for block: B:218:0x0474  */
    /* JADX WARN: Removed duplicated region for block: B:220:0x047a  */
    /* JADX WARN: Removed duplicated region for block: B:223:0x0488  */
    /* JADX WARN: Removed duplicated region for block: B:225:0x04a3  */
    /* JADX WARN: Removed duplicated region for block: B:228:0x04b0  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x009c  */
    /* JADX WARN: Removed duplicated region for block: B:231:0x04d2  */
    /* JADX WARN: Removed duplicated region for block: B:234:0x04e3  */
    /* JADX WARN: Removed duplicated region for block: B:237:0x04ff  */
    /* JADX WARN: Removed duplicated region for block: B:240:0x0515  */
    /* JADX WARN: Removed duplicated region for block: B:241:0x0536  */
    /* JADX WARN: Removed duplicated region for block: B:242:0x050e  */
    /* JADX WARN: Removed duplicated region for block: B:243:0x04f4  */
    /* JADX WARN: Removed duplicated region for block: B:244:0x04dd  */
    /* JADX WARN: Removed duplicated region for block: B:245:0x04c7  */
    /* JADX WARN: Removed duplicated region for block: B:246:0x04aa  */
    /* JADX WARN: Removed duplicated region for block: B:247:0x049d  */
    /* JADX WARN: Removed duplicated region for block: B:248:0x047d  */
    /* JADX WARN: Removed duplicated region for block: B:249:0x0476  */
    /* JADX WARN: Removed duplicated region for block: B:250:0x0470  */
    /* JADX WARN: Removed duplicated region for block: B:251:0x0465  */
    /* JADX WARN: Removed duplicated region for block: B:252:0x0452  */
    /* JADX WARN: Removed duplicated region for block: B:253:0x043c  */
    /* JADX WARN: Removed duplicated region for block: B:254:0x0431  */
    /* JADX WARN: Removed duplicated region for block: B:255:0x041c  */
    /* JADX WARN: Removed duplicated region for block: B:256:0x0416  */
    /* JADX WARN: Removed duplicated region for block: B:257:0x040b  */
    /* JADX WARN: Removed duplicated region for block: B:258:0x0406  */
    /* JADX WARN: Removed duplicated region for block: B:259:0x03fb  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x00bd  */
    /* JADX WARN: Removed duplicated region for block: B:260:0x03e6  */
    /* JADX WARN: Removed duplicated region for block: B:261:0x03b8  */
    /* JADX WARN: Removed duplicated region for block: B:262:0x02c7  */
    /* JADX WARN: Removed duplicated region for block: B:269:0x02bc  */
    /* JADX WARN: Removed duplicated region for block: B:271:0x029f  */
    /* JADX WARN: Removed duplicated region for block: B:273:0x0286  */
    /* JADX WARN: Removed duplicated region for block: B:275:0x026a  */
    /* JADX WARN: Removed duplicated region for block: B:277:0x024c  */
    /* JADX WARN: Removed duplicated region for block: B:278:0x021d  */
    /* JADX WARN: Removed duplicated region for block: B:286:0x020e  */
    /* JADX WARN: Removed duplicated region for block: B:287:0x01d7  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x00e1  */
    /* JADX WARN: Removed duplicated region for block: B:293:0x01ba  */
    /* JADX WARN: Removed duplicated region for block: B:299:0x019d  */
    /* JADX WARN: Removed duplicated region for block: B:307:0x0194  */
    /* JADX WARN: Removed duplicated region for block: B:309:0x017a  */
    /* JADX WARN: Removed duplicated region for block: B:310:0x0149  */
    /* JADX WARN: Removed duplicated region for block: B:319:0x013e  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0101  */
    /* JADX WARN: Removed duplicated region for block: B:320:0x0106  */
    /* JADX WARN: Removed duplicated region for block: B:327:0x00e8  */
    /* JADX WARN: Removed duplicated region for block: B:334:0x00c4  */
    /* JADX WARN: Removed duplicated region for block: B:341:0x00a1  */
    /* JADX WARN: Removed duplicated region for block: B:348:0x0080  */
    /* JADX WARN: Removed duplicated region for block: B:357:0x0073  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0128  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x0144  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0169  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x0181  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x019a  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x01b7  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x01d4  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x01f7  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x0216  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x0238  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x0254  */
    /* JADX WARN: Type inference failed for: r11v17, types: [androidx.compose.ui.Modifier] */
    @androidx.compose.material.ExperimentalMaterialApi
    /* renamed from: BottomSheetScaffold-bGncdBI, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void m1256BottomSheetScaffoldbGncdBI(final kotlin.jvm.functions.Function3<? super androidx.compose.foundation.layout.ColumnScope, ? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.Unit> sheetContent, androidx.compose.ui.Modifier modifier, androidx.compose.material.BottomSheetScaffoldState bottomSheetScaffoldState, kotlin.jvm.functions.Function2<? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.Unit> function2, kotlin.jvm.functions.Function3<? super androidx.compose.material.SnackbarHostState, ? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.Unit> function3, kotlin.jvm.functions.Function2<? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.Unit> function22, int i, boolean z, androidx.compose.ui.graphics.Shape shape, float f, long j, long j2, float f2, kotlin.jvm.functions.Function3<? super androidx.compose.foundation.layout.ColumnScope, ? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.Unit> function32, boolean z2, androidx.compose.ui.graphics.Shape shape2, float f3, long j3, long j4, long j5, long j6, long j7, final kotlin.jvm.functions.Function3<? super androidx.compose.foundation.layout.PaddingValues, ? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.Unit> content, androidx.compose.runtime.Composer composer, final int i2, final int i3, final int i4, final int i5) {
        int i6;
        final androidx.compose.material.BottomSheetScaffoldState bottomSheetScaffoldState2;
        int i7;
        int i8;
        kotlin.jvm.functions.Function3<? super androidx.compose.material.SnackbarHostState, ? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.Unit> function33;
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
        final kotlin.jvm.functions.Function3<? super androidx.compose.material.SnackbarHostState, ? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.Unit> m1340getLambda1$material_release;
        final kotlin.jvm.functions.Function2<? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.Unit> function23;
        final int m1403getEnd5ygKITE;
        final boolean z3;
        androidx.compose.foundation.shape.CornerBasedShape cornerBasedShape;
        float m1254getSheetElevationD9Ej5fM;
        int i30;
        long j9;
        long j10;
        boolean z4;
        long j11;
        androidx.compose.foundation.shape.CornerBasedShape cornerBasedShape2;
        androidx.compose.ui.graphics.Shape shape3;
        float f4;
        long j12;
        long j13;
        long j14;
        int i31;
        long j15;
        long j16;
        int i32;
        androidx.compose.ui.graphics.Shape shape4;
        long j17;
        long j18;
        long j19;
        final kotlin.jvm.functions.Function3<? super androidx.compose.foundation.layout.ColumnScope, ? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.Unit> function34;
        androidx.compose.ui.Modifier modifier2;
        int i33;
        kotlin.jvm.functions.Function2<? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.Unit> function24;
        float f5;
        float f6;
        long j20;
        java.lang.Object rememberedValue;
        final float mo315toPx0680j_4;
        java.lang.Object rememberedValue2;
        java.lang.Object obj;
        final androidx.compose.runtime.MutableState mutableState;
        androidx.compose.runtime.Composer composer2;
        androidx.compose.ui.Modifier modifier3;
        androidx.compose.ui.Modifier.Companion companion;
        androidx.compose.runtime.Composer composer3;
        final float f7;
        final long j21;
        final androidx.compose.ui.graphics.Shape shape5;
        final float f8;
        final long j22;
        final long j23;
        final long j24;
        final kotlin.jvm.functions.Function2<? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.Unit> function25;
        final androidx.compose.ui.Modifier modifier4;
        final long j25;
        final long j26;
        androidx.compose.runtime.ScopeUpdateScope endRestartGroup;
        int i34;
        int i35;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(sheetContent, "sheetContent");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(content, "content");
        androidx.compose.runtime.Composer startRestartGroup = composer.startRestartGroup(46422755);
        androidx.compose.runtime.ComposerKt.sourceInformation(startRestartGroup, "C(BottomSheetScaffold)P(15,12,13,22,21,10,11:c#material.FabPosition,18,20,17:c#ui.unit.Dp,14:c#ui.graphics.Color,16:c#ui.graphics.Color,19:c#ui.unit.Dp,4,7,9,6:c#ui.unit.Dp,3:c#ui.graphics.Color,5:c#ui.graphics.Color,8:c#ui.graphics.Color,0:c#ui.graphics.Color,2:c#ui.graphics.Color)269@11027L34,275@11396L6,277@11527L6,278@11574L37,282@11831L6,284@11946L6,285@11994L38,286@12079L10,287@12134L6,288@12179L32,291@12282L24,*292@12348L7,293@12413L41,374@16003L713:BottomSheetScaffold.kt#jmzs0o");
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
                    i6 |= androidx.profileinstaller.ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE;
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
                            i34 = androidx.core.view.accessibility.AccessibilityEventCompat.TYPE_VIEW_TARGETED_BY_SCROLL;
                            i6 |= i34;
                        }
                        i34 = 33554432;
                        i6 |= i34;
                    }
                    i13 = i5 & 512;
                    if (i13 == 0) {
                        i6 |= 805306368;
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
                                        i15 |= ((i5 & 262144) == 0 && startRestartGroup.changed(j4)) ? androidx.core.view.accessibility.AccessibilityEventCompat.TYPE_VIEW_TARGETED_BY_SCROLL : 33554432;
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
                                            androidx.compose.ui.Modifier modifier5 = i36 == 0 ? androidx.compose.ui.Modifier.INSTANCE : modifier;
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
                                            kotlin.jvm.functions.Function2<? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.Unit> function26 = i7 == 0 ? null : function2;
                                            m1340getLambda1$material_release = i8 == 0 ? androidx.compose.material.ComposableSingletons$BottomSheetScaffoldKt.INSTANCE.m1340getLambda1$material_release() : function33;
                                            function23 = i9 == 0 ? null : function22;
                                            m1403getEnd5ygKITE = i10 == 0 ? androidx.compose.material.FabPosition.INSTANCE.m1403getEnd5ygKITE() : i;
                                            z3 = i26 == 0 ? true : z;
                                            if ((i5 & 256) == 0) {
                                                cornerBasedShape = androidx.compose.material.MaterialTheme.INSTANCE.getShapes(startRestartGroup, i24).getLarge();
                                                i29 &= -234881025;
                                            } else {
                                                cornerBasedShape = shape;
                                            }
                                            m1254getSheetElevationD9Ej5fM = i28 == 0 ? androidx.compose.material.BottomSheetScaffoldDefaults.INSTANCE.m1254getSheetElevationD9Ej5fM() : f;
                                            if ((i5 & 1024) == 0) {
                                                i30 = i29;
                                                j9 = androidx.compose.material.MaterialTheme.INSTANCE.getColors(startRestartGroup, 6).m1319getSurface0d7_KjU();
                                                i21 &= -15;
                                            } else {
                                                i30 = i29;
                                                j9 = j;
                                            }
                                            kotlin.jvm.functions.Function2<? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.Unit> function27 = function26;
                                            if ((i5 & 2048) == 0) {
                                                j10 = androidx.compose.material.ColorsKt.m1333contentColorForek8zF_U(j9, startRestartGroup, i21 & 14);
                                                i21 &= -113;
                                            } else {
                                                j10 = j2;
                                            }
                                            float m1255getSheetPeekHeightD9Ej5fM = i16 == 0 ? androidx.compose.material.BottomSheetScaffoldDefaults.INSTANCE.m1255getSheetPeekHeightD9Ej5fM() : f2;
                                            kotlin.jvm.functions.Function3<? super androidx.compose.foundation.layout.ColumnScope, ? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.Unit> function35 = i25 == 0 ? null : function32;
                                            z4 = i27 == 0 ? true : z2;
                                            float f9 = m1255getSheetPeekHeightD9Ej5fM;
                                            if ((i5 & 32768) == 0) {
                                                j11 = j9;
                                                cornerBasedShape2 = androidx.compose.material.MaterialTheme.INSTANCE.getShapes(startRestartGroup, 6).getLarge();
                                                i21 &= -458753;
                                            } else {
                                                j11 = j9;
                                                cornerBasedShape2 = shape2;
                                            }
                                            float m1360getElevationD9Ej5fM = i20 == 0 ? androidx.compose.material.DrawerDefaults.INSTANCE.m1360getElevationD9Ej5fM() : f3;
                                            if ((i5 & 131072) == 0) {
                                                shape3 = cornerBasedShape2;
                                                i21 &= -29360129;
                                                f4 = m1360getElevationD9Ej5fM;
                                                j12 = androidx.compose.material.MaterialTheme.INSTANCE.getColors(startRestartGroup, 6).m1319getSurface0d7_KjU();
                                            } else {
                                                shape3 = cornerBasedShape2;
                                                f4 = m1360getElevationD9Ej5fM;
                                                j12 = j3;
                                            }
                                            if ((262144 & i5) == 0) {
                                                j13 = androidx.compose.material.ColorsKt.m1333contentColorForek8zF_U(j12, startRestartGroup, (i21 >> 21) & 14);
                                                i21 &= -234881025;
                                            } else {
                                                j13 = j4;
                                            }
                                            if ((i5 & 524288) == 0) {
                                                j14 = j12;
                                                i31 = 6;
                                                j15 = androidx.compose.material.DrawerDefaults.INSTANCE.getScrimColor(startRestartGroup, 6);
                                                i21 &= -1879048193;
                                            } else {
                                                j14 = j12;
                                                i31 = 6;
                                                j15 = j5;
                                            }
                                            long j27 = j15;
                                            if ((i5 & 1048576) == 0) {
                                                j16 = androidx.compose.material.MaterialTheme.INSTANCE.getColors(startRestartGroup, i31).m1308getBackground0d7_KjU();
                                                i23 &= -15;
                                            } else {
                                                j16 = j6;
                                            }
                                            if ((2097152 & i5) == 0) {
                                                long m1333contentColorForek8zF_U = androidx.compose.material.ColorsKt.m1333contentColorForek8zF_U(j16, startRestartGroup, i23 & 14);
                                                shape4 = shape3;
                                                j20 = j27;
                                                j19 = j16;
                                                i33 = i23 & (-113);
                                                function34 = function35;
                                                modifier2 = modifier5;
                                                j18 = m1333contentColorForek8zF_U;
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
                                            m1403getEnd5ygKITE = i;
                                            z3 = z;
                                            m1254getSheetElevationD9Ej5fM = f;
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
                                            m1340getLambda1$material_release = function33;
                                            function24 = function2;
                                            function23 = function22;
                                            cornerBasedShape = shape;
                                        }
                                        startRestartGroup.endDefaults();
                                        startRestartGroup.startReplaceableGroup(773894976);
                                        androidx.compose.runtime.ComposerKt.sourceInformation(startRestartGroup, "C(rememberCoroutineScope)475@19849L144:Effects.kt#9igjgp");
                                        startRestartGroup.startReplaceableGroup(-492369756);
                                        androidx.compose.runtime.ComposerKt.sourceInformation(startRestartGroup, "C(remember):Composables.kt#9igjgp");
                                        rememberedValue = startRestartGroup.rememberedValue();
                                        if (rememberedValue == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                                            androidx.compose.runtime.CompositionScopedCoroutineScopeCanceller compositionScopedCoroutineScopeCanceller = new androidx.compose.runtime.CompositionScopedCoroutineScopeCanceller(androidx.compose.runtime.EffectsKt.createCompositionCoroutineScope(kotlin.coroutines.EmptyCoroutineContext.INSTANCE, startRestartGroup));
                                            startRestartGroup.updateRememberedValue(compositionScopedCoroutineScopeCanceller);
                                            rememberedValue = compositionScopedCoroutineScopeCanceller;
                                        }
                                        startRestartGroup.endReplaceableGroup();
                                        final kotlinx.coroutines.CoroutineScope coroutineScope = ((androidx.compose.runtime.CompositionScopedCoroutineScopeCanceller) rememberedValue).getCoroutineScope();
                                        startRestartGroup.endReplaceableGroup();
                                        androidx.compose.runtime.ProvidableCompositionLocal<androidx.compose.ui.unit.Density> localDensity = androidx.compose.ui.platform.CompositionLocalsKt.getLocalDensity();
                                        androidx.compose.runtime.ComposerKt.sourceInformationMarkerStart(startRestartGroup, 2023513938, "C:CompositionLocal.kt#9igjgp");
                                        java.lang.Object consume = startRestartGroup.consume(localDensity);
                                        androidx.compose.runtime.ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                                        mo315toPx0680j_4 = ((androidx.compose.ui.unit.Density) consume).mo315toPx0680j_4(f5);
                                        startRestartGroup.startReplaceableGroup(-492369756);
                                        androidx.compose.runtime.ComposerKt.sourceInformation(startRestartGroup, "C(remember):Composables.kt#9igjgp");
                                        rememberedValue2 = startRestartGroup.rememberedValue();
                                        if (rememberedValue2 != androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                                            obj = androidx.compose.runtime.SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(null, null, 2, null);
                                            startRestartGroup.updateRememberedValue(obj);
                                        } else {
                                            obj = rememberedValue2;
                                        }
                                        startRestartGroup.endReplaceableGroup();
                                        mutableState = (androidx.compose.runtime.MutableState) obj;
                                        if (kotlin.jvm.internal.Intrinsics.areEqual(mo315toPx0680j_4, m1258BottomSheetScaffold_bGncdBI$lambda4(mutableState))) {
                                            composer2 = startRestartGroup;
                                            modifier3 = modifier2;
                                            companion = androidx.compose.ui.semantics.SemanticsModifierKt.semantics$default(androidx.compose.ui.Modifier.INSTANCE, false, new kotlin.jvm.functions.Function1<androidx.compose.ui.semantics.SemanticsPropertyReceiver, kotlin.Unit>() { // from class: androidx.compose.material.BottomSheetScaffoldKt$BottomSheetScaffold$semantics$1
                                                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                                {
                                                    super(1);
                                                }

                                                @Override // kotlin.jvm.functions.Function1
                                                public /* bridge */ /* synthetic */ kotlin.Unit invoke(androidx.compose.ui.semantics.SemanticsPropertyReceiver semanticsPropertyReceiver) {
                                                    invoke2(semanticsPropertyReceiver);
                                                    return kotlin.Unit.INSTANCE;
                                                }

                                                /* renamed from: invoke, reason: avoid collision after fix types in other method */
                                                public final void invoke2(androidx.compose.ui.semantics.SemanticsPropertyReceiver semantics) {
                                                    kotlin.jvm.internal.Intrinsics.checkNotNullParameter(semantics, "$this$semantics");
                                                    if (androidx.compose.material.BottomSheetScaffoldState.this.getBottomSheetState().isCollapsed()) {
                                                        final androidx.compose.material.BottomSheetScaffoldState bottomSheetScaffoldState3 = androidx.compose.material.BottomSheetScaffoldState.this;
                                                        final kotlinx.coroutines.CoroutineScope coroutineScope2 = coroutineScope;
                                                        androidx.compose.ui.semantics.SemanticsPropertiesKt.expand$default(semantics, null, new kotlin.jvm.functions.Function0<java.lang.Boolean>() { // from class: androidx.compose.material.BottomSheetScaffoldKt$BottomSheetScaffold$semantics$1.1
                                                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                                            {
                                                                super(0);
                                                            }

                                                            /* JADX WARN: Can't rename method to resolve collision */
                                                            @Override // kotlin.jvm.functions.Function0
                                                            public final java.lang.Boolean invoke() {
                                                                if (androidx.compose.material.BottomSheetScaffoldState.this.getBottomSheetState().getConfirmStateChange$material_release().invoke(androidx.compose.material.BottomSheetValue.Expanded).booleanValue()) {
                                                                    kotlinx.coroutines.BuildersKt__Builders_commonKt.launch$default(coroutineScope2, null, null, new androidx.compose.material.BottomSheetScaffoldKt$BottomSheetScaffold$semantics$1.AnonymousClass1.C00381(androidx.compose.material.BottomSheetScaffoldState.this, null), 3, null);
                                                                }
                                                                return true;
                                                            }

                                                            /* compiled from: BottomSheetScaffold.kt */
                                                            @kotlin.Metadata(k = 3, mv = {1, 6, 0}, xi = 48)
                                                            @kotlin.coroutines.jvm.internal.DebugMetadata(c = "androidx.compose.material.BottomSheetScaffoldKt$BottomSheetScaffold$semantics$1$1$1", f = "BottomSheetScaffold.kt", i = {}, l = {com.vungle.ads.internal.protos.Sdk.SDKError.Reason.MRAID_ERROR_VALUE}, m = "invokeSuspend", n = {}, s = {})
                                                            /* renamed from: androidx.compose.material.BottomSheetScaffoldKt$BottomSheetScaffold$semantics$1$1$1, reason: invalid class name and collision with other inner class name */
                                                            static final class C00381 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<kotlinx.coroutines.CoroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> {
                                                                final /* synthetic */ androidx.compose.material.BottomSheetScaffoldState $scaffoldState;
                                                                int label;

                                                                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                                                C00381(androidx.compose.material.BottomSheetScaffoldState bottomSheetScaffoldState, kotlin.coroutines.Continuation<? super androidx.compose.material.BottomSheetScaffoldKt$BottomSheetScaffold$semantics$1.AnonymousClass1.C00381> continuation) {
                                                                    super(2, continuation);
                                                                    this.$scaffoldState = bottomSheetScaffoldState;
                                                                }

                                                                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                                                                public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object obj, kotlin.coroutines.Continuation<?> continuation) {
                                                                    return new androidx.compose.material.BottomSheetScaffoldKt$BottomSheetScaffold$semantics$1.AnonymousClass1.C00381(this.$scaffoldState, continuation);
                                                                }

                                                                @Override // kotlin.jvm.functions.Function2
                                                                public final java.lang.Object invoke(kotlinx.coroutines.CoroutineScope coroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
                                                                    return ((androidx.compose.material.BottomSheetScaffoldKt$BottomSheetScaffold$semantics$1.AnonymousClass1.C00381) create(coroutineScope, continuation)).invokeSuspend(kotlin.Unit.INSTANCE);
                                                                }

                                                                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                                                                public final java.lang.Object invokeSuspend(java.lang.Object obj) {
                                                                    java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
                                                                    int i = this.label;
                                                                    if (i == 0) {
                                                                        kotlin.ResultKt.throwOnFailure(obj);
                                                                        this.label = 1;
                                                                        if (this.$scaffoldState.getBottomSheetState().expand(this) == coroutine_suspended) {
                                                                            return coroutine_suspended;
                                                                        }
                                                                    } else {
                                                                        if (i != 1) {
                                                                            throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                                                                        }
                                                                        kotlin.ResultKt.throwOnFailure(obj);
                                                                    }
                                                                    return kotlin.Unit.INSTANCE;
                                                                }
                                                            }
                                                        }, 1, null);
                                                    } else {
                                                        final androidx.compose.material.BottomSheetScaffoldState bottomSheetScaffoldState4 = androidx.compose.material.BottomSheetScaffoldState.this;
                                                        final kotlinx.coroutines.CoroutineScope coroutineScope3 = coroutineScope;
                                                        androidx.compose.ui.semantics.SemanticsPropertiesKt.collapse$default(semantics, null, new kotlin.jvm.functions.Function0<java.lang.Boolean>() { // from class: androidx.compose.material.BottomSheetScaffoldKt$BottomSheetScaffold$semantics$1.2
                                                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                                            {
                                                                super(0);
                                                            }

                                                            /* JADX WARN: Can't rename method to resolve collision */
                                                            @Override // kotlin.jvm.functions.Function0
                                                            public final java.lang.Boolean invoke() {
                                                                if (androidx.compose.material.BottomSheetScaffoldState.this.getBottomSheetState().getConfirmStateChange$material_release().invoke(androidx.compose.material.BottomSheetValue.Collapsed).booleanValue()) {
                                                                    kotlinx.coroutines.BuildersKt__Builders_commonKt.launch$default(coroutineScope3, null, null, new androidx.compose.material.BottomSheetScaffoldKt$BottomSheetScaffold$semantics$1.AnonymousClass2.AnonymousClass1(androidx.compose.material.BottomSheetScaffoldState.this, null), 3, null);
                                                                }
                                                                return true;
                                                            }

                                                            /* compiled from: BottomSheetScaffold.kt */
                                                            @kotlin.Metadata(k = 3, mv = {1, 6, 0}, xi = 48)
                                                            @kotlin.coroutines.jvm.internal.DebugMetadata(c = "androidx.compose.material.BottomSheetScaffoldKt$BottomSheetScaffold$semantics$1$2$1", f = "BottomSheetScaffold.kt", i = {}, l = {308}, m = "invokeSuspend", n = {}, s = {})
                                                            /* renamed from: androidx.compose.material.BottomSheetScaffoldKt$BottomSheetScaffold$semantics$1$2$1, reason: invalid class name */
                                                            static final class AnonymousClass1 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<kotlinx.coroutines.CoroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> {
                                                                final /* synthetic */ androidx.compose.material.BottomSheetScaffoldState $scaffoldState;
                                                                int label;

                                                                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                                                AnonymousClass1(androidx.compose.material.BottomSheetScaffoldState bottomSheetScaffoldState, kotlin.coroutines.Continuation<? super androidx.compose.material.BottomSheetScaffoldKt$BottomSheetScaffold$semantics$1.AnonymousClass2.AnonymousClass1> continuation) {
                                                                    super(2, continuation);
                                                                    this.$scaffoldState = bottomSheetScaffoldState;
                                                                }

                                                                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                                                                public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object obj, kotlin.coroutines.Continuation<?> continuation) {
                                                                    return new androidx.compose.material.BottomSheetScaffoldKt$BottomSheetScaffold$semantics$1.AnonymousClass2.AnonymousClass1(this.$scaffoldState, continuation);
                                                                }

                                                                @Override // kotlin.jvm.functions.Function2
                                                                public final java.lang.Object invoke(kotlinx.coroutines.CoroutineScope coroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
                                                                    return ((androidx.compose.material.BottomSheetScaffoldKt$BottomSheetScaffold$semantics$1.AnonymousClass2.AnonymousClass1) create(coroutineScope, continuation)).invokeSuspend(kotlin.Unit.INSTANCE);
                                                                }

                                                                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                                                                public final java.lang.Object invokeSuspend(java.lang.Object obj) {
                                                                    java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
                                                                    int i = this.label;
                                                                    if (i == 0) {
                                                                        kotlin.ResultKt.throwOnFailure(obj);
                                                                        this.label = 1;
                                                                        if (this.$scaffoldState.getBottomSheetState().collapse(this) == coroutine_suspended) {
                                                                            return coroutine_suspended;
                                                                        }
                                                                    } else {
                                                                        if (i != 1) {
                                                                            throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                                                                        }
                                                                        kotlin.ResultKt.throwOnFailure(obj);
                                                                    }
                                                                    return kotlin.Unit.INSTANCE;
                                                                }
                                                            }
                                                        }, 1, null);
                                                    }
                                                }
                                            }, 1, null);
                                        } else {
                                            composer2 = startRestartGroup;
                                            modifier3 = modifier2;
                                            companion = androidx.compose.ui.Modifier.INSTANCE;
                                        }
                                        final androidx.compose.material.BottomSheetScaffoldState bottomSheetScaffoldState3 = bottomSheetScaffoldState2;
                                        final kotlin.jvm.functions.Function2<? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.Unit> function28 = function24;
                                        final kotlin.jvm.functions.Function2<? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.Unit> function29 = function23;
                                        final float f10 = f5;
                                        final int i42 = m1403getEnd5ygKITE;
                                        final int i43 = i32;
                                        final int i44 = i33;
                                        final int i45 = i21;
                                        final boolean z5 = z3;
                                        final androidx.compose.ui.Modifier.Companion companion2 = companion;
                                        final androidx.compose.ui.graphics.Shape shape6 = cornerBasedShape;
                                        final long j28 = j11;
                                        final long j29 = j10;
                                        final float f11 = m1254getSheetElevationD9Ej5fM;
                                        final kotlin.jvm.functions.Function3<? super androidx.compose.material.SnackbarHostState, ? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.Unit> function36 = m1340getLambda1$material_release;
                                        composer3 = composer2;
                                        final androidx.compose.runtime.internal.ComposableLambda composableLambda = androidx.compose.runtime.internal.ComposableLambdaKt.composableLambda(composer3, 893101063, true, new kotlin.jvm.functions.Function2<androidx.compose.runtime.Composer, java.lang.Integer, kotlin.Unit>() { // from class: androidx.compose.material.BottomSheetScaffoldKt$BottomSheetScaffold$child$1
                                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                            /* JADX WARN: Multi-variable type inference failed */
                                            {
                                                super(2);
                                            }

                                            @Override // kotlin.jvm.functions.Function2
                                            public /* bridge */ /* synthetic */ kotlin.Unit invoke(androidx.compose.runtime.Composer composer4, java.lang.Integer num) {
                                                invoke(composer4, num.intValue());
                                                return kotlin.Unit.INSTANCE;
                                            }

                                            public final void invoke(androidx.compose.runtime.Composer composer4, int i46) {
                                                androidx.compose.runtime.ComposerKt.sourceInformation(composer4, "C316@13233L2758:BottomSheetScaffold.kt#jmzs0o");
                                                if ((i46 & 11) != 2 || !composer4.getSkipping()) {
                                                    androidx.compose.runtime.State<java.lang.Float> offset = androidx.compose.material.BottomSheetScaffoldState.this.getBottomSheetState().getOffset();
                                                    androidx.compose.material.BottomSheetState bottomSheetState = androidx.compose.material.BottomSheetScaffoldState.this.getBottomSheetState();
                                                    kotlin.jvm.functions.Function2<androidx.compose.runtime.Composer, java.lang.Integer, kotlin.Unit> function210 = function28;
                                                    kotlin.jvm.functions.Function3<androidx.compose.foundation.layout.PaddingValues, androidx.compose.runtime.Composer, java.lang.Integer, kotlin.Unit> function37 = content;
                                                    final float f12 = mo315toPx0680j_4;
                                                    final androidx.compose.material.BottomSheetScaffoldState bottomSheetScaffoldState4 = androidx.compose.material.BottomSheetScaffoldState.this;
                                                    final boolean z6 = z5;
                                                    final androidx.compose.ui.Modifier modifier6 = companion2;
                                                    final float f13 = f10;
                                                    final androidx.compose.runtime.MutableState<java.lang.Float> mutableState2 = mutableState;
                                                    final androidx.compose.ui.graphics.Shape shape7 = shape6;
                                                    final long j30 = j28;
                                                    final long j31 = j29;
                                                    final float f14 = f11;
                                                    final int i47 = i43;
                                                    final int i48 = i45;
                                                    final kotlin.jvm.functions.Function3<androidx.compose.foundation.layout.ColumnScope, androidx.compose.runtime.Composer, java.lang.Integer, kotlin.Unit> function38 = sheetContent;
                                                    androidx.compose.runtime.internal.ComposableLambda composableLambda2 = androidx.compose.runtime.internal.ComposableLambdaKt.composableLambda(composer4, -1378534681, true, new kotlin.jvm.functions.Function3<java.lang.Integer, androidx.compose.runtime.Composer, java.lang.Integer, kotlin.Unit>() { // from class: androidx.compose.material.BottomSheetScaffoldKt$BottomSheetScaffold$child$1.1
                                                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                                        /* JADX WARN: Multi-variable type inference failed */
                                                        {
                                                            super(3);
                                                        }

                                                        @Override // kotlin.jvm.functions.Function3
                                                        public /* bridge */ /* synthetic */ kotlin.Unit invoke(java.lang.Integer num, androidx.compose.runtime.Composer composer5, java.lang.Integer num2) {
                                                            invoke(num.intValue(), composer5, num2.intValue());
                                                            return kotlin.Unit.INSTANCE;
                                                        }

                                                        public final void invoke(int i49, androidx.compose.runtime.Composer composer5, int i50) {
                                                            int i51;
                                                            java.lang.Float m1258BottomSheetScaffold_bGncdBI$lambda4;
                                                            java.lang.Float m1258BottomSheetScaffold_bGncdBI$lambda42;
                                                            java.util.Map mapOf;
                                                            androidx.compose.ui.Modifier.Companion m1521swipeablepPrIpRY;
                                                            androidx.compose.runtime.ComposerKt.sourceInformation(composer5, "C354@15208L95,347@14851L711:BottomSheetScaffold.kt#jmzs0o");
                                                            if ((i50 & 14) == 0) {
                                                                i51 = i50 | (composer5.changed(i49) ? 4 : 2);
                                                            } else {
                                                                i51 = i50;
                                                            }
                                                            if ((i51 & 91) != 18 || !composer5.getSkipping()) {
                                                                m1258BottomSheetScaffold_bGncdBI$lambda4 = androidx.compose.material.BottomSheetScaffoldKt.m1258BottomSheetScaffold_bGncdBI$lambda4(mutableState2);
                                                                if (m1258BottomSheetScaffold_bGncdBI$lambda4 == null) {
                                                                    m1521swipeablepPrIpRY = androidx.compose.ui.Modifier.INSTANCE;
                                                                } else {
                                                                    if (kotlin.math.MathKt.roundToInt(m1258BottomSheetScaffold_bGncdBI$lambda4.floatValue()) != kotlin.math.MathKt.roundToInt(f12)) {
                                                                        float f15 = i49;
                                                                        m1258BottomSheetScaffold_bGncdBI$lambda42 = androidx.compose.material.BottomSheetScaffoldKt.m1258BottomSheetScaffold_bGncdBI$lambda4(mutableState2);
                                                                        kotlin.jvm.internal.Intrinsics.checkNotNull(m1258BottomSheetScaffold_bGncdBI$lambda42);
                                                                        mapOf = kotlin.collections.MapsKt.mapOf(kotlin.TuplesKt.to(java.lang.Float.valueOf(f15 - m1258BottomSheetScaffold_bGncdBI$lambda42.floatValue()), androidx.compose.material.BottomSheetValue.Expanded), kotlin.TuplesKt.to(java.lang.Float.valueOf(f15 - f12), androidx.compose.material.BottomSheetValue.Collapsed));
                                                                    } else {
                                                                        mapOf = kotlin.collections.MapsKt.mapOf(kotlin.TuplesKt.to(java.lang.Float.valueOf(i49 - m1258BottomSheetScaffold_bGncdBI$lambda4.floatValue()), androidx.compose.material.BottomSheetValue.Collapsed));
                                                                    }
                                                                    m1521swipeablepPrIpRY = androidx.compose.material.SwipeableKt.m1521swipeablepPrIpRY(androidx.compose.ui.Modifier.INSTANCE, bottomSheetScaffoldState4.getBottomSheetState(), r13, androidx.compose.foundation.gestures.Orientation.Vertical, (r26 & 8) != 0 ? true : z6, (r26 & 16) != 0 ? false : false, (r26 & 32) != 0 ? null : null, (r26 & 64) != 0 ? new kotlin.jvm.functions.Function2<T, T, androidx.compose.material.FixedThreshold>() { // from class: androidx.compose.material.SwipeableKt$swipeable$1
                                                                        /* JADX WARN: Can't rename method to resolve collision */
                                                                        @Override // kotlin.jvm.functions.Function2
                                                                        public final androidx.compose.material.FixedThreshold invoke(T t, T t2) {
                                                                            return new androidx.compose.material.FixedThreshold(androidx.compose.ui.unit.Dp.m4478constructorimpl(56), null);
                                                                        }
                                                                    } : null, (r26 & 128) != 0 ? androidx.compose.material.SwipeableDefaults.resistanceConfig$default(androidx.compose.material.SwipeableDefaults.INSTANCE, mapOf.keySet(), 0.0f, 0.0f, 6, null) : null, (r26 & 256) != 0 ? androidx.compose.material.SwipeableDefaults.INSTANCE.m1520getVelocityThresholdD9Ej5fM() : 0.0f);
                                                                }
                                                                androidx.compose.ui.Modifier m608requiredHeightInVpY3zN4$default = androidx.compose.foundation.layout.SizeKt.m608requiredHeightInVpY3zN4$default(androidx.compose.foundation.layout.SizeKt.fillMaxWidth$default(androidx.compose.ui.input.nestedscroll.NestedScrollModifierKt.nestedScroll$default(androidx.compose.ui.Modifier.INSTANCE, bottomSheetScaffoldState4.getBottomSheetState().getNestedScrollConnection(), null, 2, null).then(m1521swipeablepPrIpRY).then(modifier6), 0.0f, 1, null), f13, 0.0f, 2, null);
                                                                final androidx.compose.runtime.MutableState<java.lang.Float> mutableState3 = mutableState2;
                                                                composer5.startReplaceableGroup(1157296644);
                                                                androidx.compose.runtime.ComposerKt.sourceInformation(composer5, "C(remember)P(1):Composables.kt#9igjgp");
                                                                boolean changed = composer5.changed(mutableState3);
                                                                java.lang.Object rememberedValue3 = composer5.rememberedValue();
                                                                if (changed || rememberedValue3 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                                                                    rememberedValue3 = (kotlin.jvm.functions.Function1) new kotlin.jvm.functions.Function1<androidx.compose.ui.unit.IntSize, kotlin.Unit>() { // from class: androidx.compose.material.BottomSheetScaffoldKt$BottomSheetScaffold$child$1$1$1$1
                                                                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                                                        {
                                                                            super(1);
                                                                        }

                                                                        @Override // kotlin.jvm.functions.Function1
                                                                        public /* bridge */ /* synthetic */ kotlin.Unit invoke(androidx.compose.ui.unit.IntSize intSize) {
                                                                            m1263invokeozmzZPI(intSize.getPackedValue());
                                                                            return kotlin.Unit.INSTANCE;
                                                                        }

                                                                        /* renamed from: invoke-ozmzZPI, reason: not valid java name */
                                                                        public final void m1263invokeozmzZPI(long j32) {
                                                                            mutableState3.setValue(java.lang.Float.valueOf(androidx.compose.ui.unit.IntSize.m4651getHeightimpl(j32)));
                                                                        }
                                                                    };
                                                                    composer5.updateRememberedValue(rememberedValue3);
                                                                }
                                                                composer5.endReplaceableGroup();
                                                                androidx.compose.ui.Modifier onSizeChanged = androidx.compose.ui.layout.OnRemeasuredModifierKt.onSizeChanged(m608requiredHeightInVpY3zN4$default, (kotlin.jvm.functions.Function1) rememberedValue3);
                                                                androidx.compose.ui.graphics.Shape shape8 = shape7;
                                                                long j32 = j30;
                                                                long j33 = j31;
                                                                float f16 = f14;
                                                                final kotlin.jvm.functions.Function3<androidx.compose.foundation.layout.ColumnScope, androidx.compose.runtime.Composer, java.lang.Integer, kotlin.Unit> function39 = function38;
                                                                final int i52 = i47;
                                                                androidx.compose.runtime.internal.ComposableLambda composableLambda3 = androidx.compose.runtime.internal.ComposableLambdaKt.composableLambda(composer5, -698903261, true, new kotlin.jvm.functions.Function2<androidx.compose.runtime.Composer, java.lang.Integer, kotlin.Unit>() { // from class: androidx.compose.material.BottomSheetScaffoldKt.BottomSheetScaffold.child.1.1.2
                                                                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                                                    /* JADX WARN: Multi-variable type inference failed */
                                                                    {
                                                                        super(2);
                                                                    }

                                                                    @Override // kotlin.jvm.functions.Function2
                                                                    public /* bridge */ /* synthetic */ kotlin.Unit invoke(androidx.compose.runtime.Composer composer6, java.lang.Integer num) {
                                                                        invoke(composer6, num.intValue());
                                                                        return kotlin.Unit.INSTANCE;
                                                                    }

                                                                    public final void invoke(androidx.compose.runtime.Composer composer6, int i53) {
                                                                        androidx.compose.runtime.ComposerKt.sourceInformation(composer6, "C361@15529L30:BottomSheetScaffold.kt#jmzs0o");
                                                                        if ((i53 & 11) == 2 && composer6.getSkipping()) {
                                                                            composer6.skipToGroupEnd();
                                                                            return;
                                                                        }
                                                                        kotlin.jvm.functions.Function3<androidx.compose.foundation.layout.ColumnScope, androidx.compose.runtime.Composer, java.lang.Integer, kotlin.Unit> function310 = function39;
                                                                        int i54 = (i52 << 9) & 7168;
                                                                        composer6.startReplaceableGroup(-483455358);
                                                                        androidx.compose.runtime.ComposerKt.sourceInformation(composer6, "C(Column)P(2,3,1)77@3880L61,78@3946L133:Column.kt#2w3rfo");
                                                                        androidx.compose.ui.Modifier.Companion companion3 = androidx.compose.ui.Modifier.INSTANCE;
                                                                        androidx.compose.ui.layout.MeasurePolicy columnMeasurePolicy = androidx.compose.foundation.layout.ColumnKt.columnMeasurePolicy(androidx.compose.foundation.layout.Arrangement.INSTANCE.getTop(), androidx.compose.ui.Alignment.INSTANCE.getStart(), composer6, 0);
                                                                        composer6.startReplaceableGroup(-1323940314);
                                                                        androidx.compose.runtime.ComposerKt.sourceInformation(composer6, "C(Layout)P(!1,2)74@2915L7,75@2970L7,76@3029L7,77@3041L460:Layout.kt#80mrfh");
                                                                        androidx.compose.runtime.ProvidableCompositionLocal<androidx.compose.ui.unit.Density> localDensity2 = androidx.compose.ui.platform.CompositionLocalsKt.getLocalDensity();
                                                                        androidx.compose.runtime.ComposerKt.sourceInformationMarkerStart(composer6, 2023513938, "C:CompositionLocal.kt#9igjgp");
                                                                        java.lang.Object consume2 = composer6.consume(localDensity2);
                                                                        androidx.compose.runtime.ComposerKt.sourceInformationMarkerEnd(composer6);
                                                                        androidx.compose.ui.unit.Density density = (androidx.compose.ui.unit.Density) consume2;
                                                                        androidx.compose.runtime.ProvidableCompositionLocal<androidx.compose.ui.unit.LayoutDirection> localLayoutDirection = androidx.compose.ui.platform.CompositionLocalsKt.getLocalLayoutDirection();
                                                                        androidx.compose.runtime.ComposerKt.sourceInformationMarkerStart(composer6, 2023513938, "C:CompositionLocal.kt#9igjgp");
                                                                        java.lang.Object consume3 = composer6.consume(localLayoutDirection);
                                                                        androidx.compose.runtime.ComposerKt.sourceInformationMarkerEnd(composer6);
                                                                        androidx.compose.ui.unit.LayoutDirection layoutDirection = (androidx.compose.ui.unit.LayoutDirection) consume3;
                                                                        androidx.compose.runtime.ProvidableCompositionLocal<androidx.compose.ui.platform.ViewConfiguration> localViewConfiguration = androidx.compose.ui.platform.CompositionLocalsKt.getLocalViewConfiguration();
                                                                        androidx.compose.runtime.ComposerKt.sourceInformationMarkerStart(composer6, 2023513938, "C:CompositionLocal.kt#9igjgp");
                                                                        java.lang.Object consume4 = composer6.consume(localViewConfiguration);
                                                                        androidx.compose.runtime.ComposerKt.sourceInformationMarkerEnd(composer6);
                                                                        androidx.compose.ui.platform.ViewConfiguration viewConfiguration = (androidx.compose.ui.platform.ViewConfiguration) consume4;
                                                                        kotlin.jvm.functions.Function0<androidx.compose.ui.node.ComposeUiNode> constructor = androidx.compose.ui.node.ComposeUiNode.INSTANCE.getConstructor();
                                                                        kotlin.jvm.functions.Function3<androidx.compose.runtime.SkippableUpdater<androidx.compose.ui.node.ComposeUiNode>, androidx.compose.runtime.Composer, java.lang.Integer, kotlin.Unit> materializerOf = androidx.compose.ui.layout.LayoutKt.materializerOf(companion3);
                                                                        if (!(composer6.getApplier() instanceof androidx.compose.runtime.Applier)) {
                                                                            androidx.compose.runtime.ComposablesKt.invalidApplier();
                                                                        }
                                                                        composer6.startReusableNode();
                                                                        if (composer6.getInserting()) {
                                                                            composer6.createNode(constructor);
                                                                        } else {
                                                                            composer6.useNode();
                                                                        }
                                                                        composer6.disableReusing();
                                                                        androidx.compose.runtime.Composer m1641constructorimpl = androidx.compose.runtime.Updater.m1641constructorimpl(composer6);
                                                                        androidx.compose.runtime.Updater.m1648setimpl(m1641constructorimpl, columnMeasurePolicy, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetMeasurePolicy());
                                                                        androidx.compose.runtime.Updater.m1648setimpl(m1641constructorimpl, density, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetDensity());
                                                                        androidx.compose.runtime.Updater.m1648setimpl(m1641constructorimpl, layoutDirection, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetLayoutDirection());
                                                                        androidx.compose.runtime.Updater.m1648setimpl(m1641constructorimpl, viewConfiguration, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetViewConfiguration());
                                                                        composer6.enableReusing();
                                                                        materializerOf.invoke(androidx.compose.runtime.SkippableUpdater.m1632boximpl(androidx.compose.runtime.SkippableUpdater.m1633constructorimpl(composer6)), composer6, 0);
                                                                        composer6.startReplaceableGroup(2058660585);
                                                                        composer6.startReplaceableGroup(-1163856341);
                                                                        androidx.compose.runtime.ComposerKt.sourceInformation(composer6, "C79@3994L9:Column.kt#2w3rfo");
                                                                        function310.invoke(androidx.compose.foundation.layout.ColumnScopeInstance.INSTANCE, composer6, java.lang.Integer.valueOf(((i54 >> 6) & 112) | 6));
                                                                        composer6.endReplaceableGroup();
                                                                        composer6.endReplaceableGroup();
                                                                        composer6.endNode();
                                                                        composer6.endReplaceableGroup();
                                                                        composer6.endReplaceableGroup();
                                                                    }
                                                                });
                                                                int i53 = i47;
                                                                int i54 = i48;
                                                                androidx.compose.material.SurfaceKt.m1511SurfaceFjzlyU(onSizeChanged, shape8, j32, j33, null, f16, composableLambda3, composer5, ((i53 >> 21) & 112) | 1572864 | ((i54 << 6) & 896) | ((i54 << 6) & 7168) | ((i53 >> 12) & 458752), 16);
                                                                return;
                                                            }
                                                            composer5.skipToGroupEnd();
                                                        }
                                                    });
                                                    kotlin.jvm.functions.Function2<androidx.compose.runtime.Composer, java.lang.Integer, kotlin.Unit> function211 = function29;
                                                    final kotlin.jvm.functions.Function3<androidx.compose.material.SnackbarHostState, androidx.compose.runtime.Composer, java.lang.Integer, kotlin.Unit> function39 = function36;
                                                    final androidx.compose.material.BottomSheetScaffoldState bottomSheetScaffoldState5 = androidx.compose.material.BottomSheetScaffoldState.this;
                                                    final int i49 = i43;
                                                    androidx.compose.runtime.internal.ComposableLambda composableLambda3 = androidx.compose.runtime.internal.ComposableLambdaKt.composableLambda(composer4, -486138068, true, new kotlin.jvm.functions.Function2<androidx.compose.runtime.Composer, java.lang.Integer, kotlin.Unit>() { // from class: androidx.compose.material.BottomSheetScaffoldKt$BottomSheetScaffold$child$1.2
                                                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                                        /* JADX WARN: Multi-variable type inference failed */
                                                        {
                                                            super(2);
                                                        }

                                                        @Override // kotlin.jvm.functions.Function2
                                                        public /* bridge */ /* synthetic */ kotlin.Unit invoke(androidx.compose.runtime.Composer composer5, java.lang.Integer num) {
                                                            invoke(composer5, num.intValue());
                                                            return kotlin.Unit.INSTANCE;
                                                        }

                                                        public final void invoke(androidx.compose.runtime.Composer composer5, int i50) {
                                                            androidx.compose.runtime.ComposerKt.sourceInformation(composer5, "C365@15680L45:BottomSheetScaffold.kt#jmzs0o");
                                                            if ((i50 & 11) == 2 && composer5.getSkipping()) {
                                                                composer5.skipToGroupEnd();
                                                            } else {
                                                                function39.invoke(bottomSheetScaffoldState5.getSnackbarHostState(), composer5, java.lang.Integer.valueOf((i49 >> 9) & 112));
                                                            }
                                                        }
                                                    });
                                                    float f15 = f10;
                                                    int i50 = i42;
                                                    int i51 = i43;
                                                    androidx.compose.material.BottomSheetScaffoldKt.m1257BottomSheetScaffoldLayoutKCBPh4w(function210, function37, composableLambda2, function211, composableLambda3, f15, i50, offset, bottomSheetState, composer4, ((i51 >> 9) & 14) | 24960 | ((i44 >> 3) & 112) | ((i51 >> 6) & 7168) | ((i45 << 9) & 458752) | (i51 & 3670016));
                                                    return;
                                                }
                                                composer4.skipToGroupEnd();
                                            }
                                        });
                                        androidx.compose.ui.Modifier modifier6 = modifier3;
                                        final kotlin.jvm.functions.Function3<? super androidx.compose.foundation.layout.ColumnScope, ? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.Unit> function37 = function34;
                                        final androidx.compose.material.BottomSheetScaffoldState bottomSheetScaffoldState4 = bottomSheetScaffoldState2;
                                        final boolean z6 = z4;
                                        final androidx.compose.ui.graphics.Shape shape7 = shape4;
                                        final float f12 = f6;
                                        final long j30 = j17;
                                        final long j31 = j13;
                                        final long j32 = j20;
                                        final int i46 = i21;
                                        int i47 = i33 << 6;
                                        androidx.compose.material.SurfaceKt.m1511SurfaceFjzlyU(androidx.compose.foundation.layout.SizeKt.fillMaxSize$default(modifier6, 0.0f, 1, null), null, j19, j18, null, 0.0f, androidx.compose.runtime.internal.ComposableLambdaKt.composableLambda(composer3, 1273816607, true, new kotlin.jvm.functions.Function2<androidx.compose.runtime.Composer, java.lang.Integer, kotlin.Unit>() { // from class: androidx.compose.material.BottomSheetScaffoldKt$BottomSheetScaffold$1
                                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                            /* JADX WARN: Multi-variable type inference failed */
                                            {
                                                super(2);
                                            }

                                            @Override // kotlin.jvm.functions.Function2
                                            public /* bridge */ /* synthetic */ kotlin.Unit invoke(androidx.compose.runtime.Composer composer4, java.lang.Integer num) {
                                                invoke(composer4, num.intValue());
                                                return kotlin.Unit.INSTANCE;
                                            }

                                            public final void invoke(androidx.compose.runtime.Composer composer4, int i48) {
                                                androidx.compose.runtime.ComposerKt.sourceInformation(composer4, "C:BottomSheetScaffold.kt#jmzs0o");
                                                if ((i48 & 11) != 2 || !composer4.getSkipping()) {
                                                    if (function37 == null) {
                                                        composer4.startReplaceableGroup(-249544858);
                                                        androidx.compose.runtime.ComposerKt.sourceInformation(composer4, "381@16183L7");
                                                        composableLambda.invoke(composer4, 6);
                                                        composer4.endReplaceableGroup();
                                                        return;
                                                    }
                                                    composer4.startReplaceableGroup(-249544821);
                                                    androidx.compose.runtime.ComposerKt.sourceInformation(composer4, "383@16220L480");
                                                    kotlin.jvm.functions.Function3<androidx.compose.foundation.layout.ColumnScope, androidx.compose.runtime.Composer, java.lang.Integer, kotlin.Unit> function38 = function37;
                                                    androidx.compose.material.DrawerState drawerState = bottomSheetScaffoldState4.getDrawerState();
                                                    boolean z7 = z6;
                                                    androidx.compose.ui.graphics.Shape shape8 = shape7;
                                                    float f13 = f12;
                                                    long j33 = j30;
                                                    long j34 = j31;
                                                    long j35 = j32;
                                                    kotlin.jvm.functions.Function2<androidx.compose.runtime.Composer, java.lang.Integer, kotlin.Unit> function210 = composableLambda;
                                                    int i49 = i46;
                                                    androidx.compose.material.DrawerKt.m1364ModalDrawerGs3lGvM(function38, null, drawerState, z7, shape8, f13, j33, j34, j35, function210, composer4, ((i49 >> 3) & 7168) | ((i49 >> 9) & 14) | 805306368 | ((i49 >> 3) & 57344) | ((i49 >> 3) & 458752) | ((i49 >> 3) & 3670016) | ((i49 >> 3) & 29360128) | ((i49 >> 3) & 234881024), 2);
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
                                        m1254getSheetElevationD9Ej5fM = f;
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
                                        m1340getLambda1$material_release = function33;
                                        m1403getEnd5ygKITE = i;
                                        z3 = z;
                                        cornerBasedShape = shape;
                                    }
                                    endRestartGroup = composer3.endRestartGroup();
                                    if (endRestartGroup != null) {
                                        return;
                                    }
                                    final androidx.compose.material.BottomSheetScaffoldState bottomSheetScaffoldState5 = bottomSheetScaffoldState2;
                                    final androidx.compose.ui.graphics.Shape shape8 = cornerBasedShape;
                                    final float f13 = m1254getSheetElevationD9Ej5fM;
                                    final boolean z7 = z4;
                                    final long j33 = j13;
                                    endRestartGroup.updateScope(new kotlin.jvm.functions.Function2<androidx.compose.runtime.Composer, java.lang.Integer, kotlin.Unit>() { // from class: androidx.compose.material.BottomSheetScaffoldKt$BottomSheetScaffold$2
                                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                        /* JADX WARN: Multi-variable type inference failed */
                                        {
                                            super(2);
                                        }

                                        @Override // kotlin.jvm.functions.Function2
                                        public /* bridge */ /* synthetic */ kotlin.Unit invoke(androidx.compose.runtime.Composer composer4, java.lang.Integer num) {
                                            invoke(composer4, num.intValue());
                                            return kotlin.Unit.INSTANCE;
                                        }

                                        public final void invoke(androidx.compose.runtime.Composer composer4, int i48) {
                                            androidx.compose.material.BottomSheetScaffoldKt.m1256BottomSheetScaffoldbGncdBI(sheetContent, modifier4, bottomSheetScaffoldState5, function25, m1340getLambda1$material_release, function23, m1403getEnd5ygKITE, z3, shape8, f13, j25, j21, f7, function34, z7, shape5, f8, j22, j33, j23, j24, j26, content, composer4, i2 | 1, i3, i4, i5);
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
                                kotlin.jvm.functions.Function2<? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.Unit> function272 = function26;
                                if ((i5 & 2048) == 0) {
                                }
                                if (i16 == 0) {
                                }
                                if (i25 == 0) {
                                }
                                if (i27 == 0) {
                                }
                                float f92 = m1255getSheetPeekHeightD9Ej5fM;
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
                                androidx.compose.runtime.ComposerKt.sourceInformation(startRestartGroup, "C(rememberCoroutineScope)475@19849L144:Effects.kt#9igjgp");
                                startRestartGroup.startReplaceableGroup(-492369756);
                                androidx.compose.runtime.ComposerKt.sourceInformation(startRestartGroup, "C(remember):Composables.kt#9igjgp");
                                rememberedValue = startRestartGroup.rememberedValue();
                                if (rememberedValue == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                                }
                                startRestartGroup.endReplaceableGroup();
                                final kotlinx.coroutines.CoroutineScope coroutineScope2 = ((androidx.compose.runtime.CompositionScopedCoroutineScopeCanceller) rememberedValue).getCoroutineScope();
                                startRestartGroup.endReplaceableGroup();
                                androidx.compose.runtime.ProvidableCompositionLocal<androidx.compose.ui.unit.Density> localDensity2 = androidx.compose.ui.platform.CompositionLocalsKt.getLocalDensity();
                                androidx.compose.runtime.ComposerKt.sourceInformationMarkerStart(startRestartGroup, 2023513938, "C:CompositionLocal.kt#9igjgp");
                                java.lang.Object consume2 = startRestartGroup.consume(localDensity2);
                                androidx.compose.runtime.ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                                mo315toPx0680j_4 = ((androidx.compose.ui.unit.Density) consume2).mo315toPx0680j_4(f5);
                                startRestartGroup.startReplaceableGroup(-492369756);
                                androidx.compose.runtime.ComposerKt.sourceInformation(startRestartGroup, "C(remember):Composables.kt#9igjgp");
                                rememberedValue2 = startRestartGroup.rememberedValue();
                                if (rememberedValue2 != androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                                }
                                startRestartGroup.endReplaceableGroup();
                                mutableState = (androidx.compose.runtime.MutableState) obj;
                                if (kotlin.jvm.internal.Intrinsics.areEqual(mo315toPx0680j_4, m1258BottomSheetScaffold_bGncdBI$lambda4(mutableState))) {
                                }
                                final androidx.compose.material.BottomSheetScaffoldState bottomSheetScaffoldState32 = bottomSheetScaffoldState2;
                                final kotlin.jvm.functions.Function2<? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.Unit> function282 = function24;
                                final kotlin.jvm.functions.Function2<? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.Unit> function292 = function23;
                                final float f102 = f5;
                                final int i422 = m1403getEnd5ygKITE;
                                final int i432 = i32;
                                final int i442 = i33;
                                final int i452 = i21;
                                final boolean z52 = z3;
                                final androidx.compose.ui.Modifier companion22 = companion;
                                final androidx.compose.ui.graphics.Shape shape62 = cornerBasedShape;
                                final long j282 = j11;
                                final long j292 = j10;
                                final float f112 = m1254getSheetElevationD9Ej5fM;
                                final kotlin.jvm.functions.Function3<? super androidx.compose.material.SnackbarHostState, ? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.Unit> function362 = m1340getLambda1$material_release;
                                composer3 = composer2;
                                final kotlin.jvm.functions.Function2<? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.Unit> composableLambda2 = androidx.compose.runtime.internal.ComposableLambdaKt.composableLambda(composer3, 893101063, true, new kotlin.jvm.functions.Function2<androidx.compose.runtime.Composer, java.lang.Integer, kotlin.Unit>() { // from class: androidx.compose.material.BottomSheetScaffoldKt$BottomSheetScaffold$child$1
                                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                    /* JADX WARN: Multi-variable type inference failed */
                                    {
                                        super(2);
                                    }

                                    @Override // kotlin.jvm.functions.Function2
                                    public /* bridge */ /* synthetic */ kotlin.Unit invoke(androidx.compose.runtime.Composer composer4, java.lang.Integer num) {
                                        invoke(composer4, num.intValue());
                                        return kotlin.Unit.INSTANCE;
                                    }

                                    public final void invoke(androidx.compose.runtime.Composer composer4, int i462) {
                                        androidx.compose.runtime.ComposerKt.sourceInformation(composer4, "C316@13233L2758:BottomSheetScaffold.kt#jmzs0o");
                                        if ((i462 & 11) != 2 || !composer4.getSkipping()) {
                                            androidx.compose.runtime.State<java.lang.Float> offset = androidx.compose.material.BottomSheetScaffoldState.this.getBottomSheetState().getOffset();
                                            androidx.compose.material.BottomSheetState bottomSheetState = androidx.compose.material.BottomSheetScaffoldState.this.getBottomSheetState();
                                            kotlin.jvm.functions.Function2<androidx.compose.runtime.Composer, java.lang.Integer, kotlin.Unit> function210 = function282;
                                            kotlin.jvm.functions.Function3<androidx.compose.foundation.layout.PaddingValues, androidx.compose.runtime.Composer, java.lang.Integer, kotlin.Unit> function372 = content;
                                            final float f122 = mo315toPx0680j_4;
                                            final androidx.compose.material.BottomSheetScaffoldState bottomSheetScaffoldState42 = androidx.compose.material.BottomSheetScaffoldState.this;
                                            final boolean z62 = z52;
                                            final androidx.compose.ui.Modifier modifier62 = companion22;
                                            final float f132 = f102;
                                            final androidx.compose.runtime.MutableState<java.lang.Float> mutableState2 = mutableState;
                                            final androidx.compose.ui.graphics.Shape shape72 = shape62;
                                            final long j302 = j282;
                                            final long j312 = j292;
                                            final float f14 = f112;
                                            final int i472 = i432;
                                            final int i48 = i452;
                                            final kotlin.jvm.functions.Function3<? super androidx.compose.foundation.layout.ColumnScope, ? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.Unit> function38 = sheetContent;
                                            androidx.compose.runtime.internal.ComposableLambda composableLambda22 = androidx.compose.runtime.internal.ComposableLambdaKt.composableLambda(composer4, -1378534681, true, new kotlin.jvm.functions.Function3<java.lang.Integer, androidx.compose.runtime.Composer, java.lang.Integer, kotlin.Unit>() { // from class: androidx.compose.material.BottomSheetScaffoldKt$BottomSheetScaffold$child$1.1
                                                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                                /* JADX WARN: Multi-variable type inference failed */
                                                {
                                                    super(3);
                                                }

                                                @Override // kotlin.jvm.functions.Function3
                                                public /* bridge */ /* synthetic */ kotlin.Unit invoke(java.lang.Integer num, androidx.compose.runtime.Composer composer5, java.lang.Integer num2) {
                                                    invoke(num.intValue(), composer5, num2.intValue());
                                                    return kotlin.Unit.INSTANCE;
                                                }

                                                public final void invoke(int i49, androidx.compose.runtime.Composer composer5, int i50) {
                                                    int i51;
                                                    java.lang.Float m1258BottomSheetScaffold_bGncdBI$lambda4;
                                                    java.lang.Float m1258BottomSheetScaffold_bGncdBI$lambda42;
                                                    java.util.Map mapOf;
                                                    androidx.compose.ui.Modifier.Companion m1521swipeablepPrIpRY;
                                                    androidx.compose.runtime.ComposerKt.sourceInformation(composer5, "C354@15208L95,347@14851L711:BottomSheetScaffold.kt#jmzs0o");
                                                    if ((i50 & 14) == 0) {
                                                        i51 = i50 | (composer5.changed(i49) ? 4 : 2);
                                                    } else {
                                                        i51 = i50;
                                                    }
                                                    if ((i51 & 91) != 18 || !composer5.getSkipping()) {
                                                        m1258BottomSheetScaffold_bGncdBI$lambda4 = androidx.compose.material.BottomSheetScaffoldKt.m1258BottomSheetScaffold_bGncdBI$lambda4(mutableState2);
                                                        if (m1258BottomSheetScaffold_bGncdBI$lambda4 == null) {
                                                            m1521swipeablepPrIpRY = androidx.compose.ui.Modifier.INSTANCE;
                                                        } else {
                                                            if (kotlin.math.MathKt.roundToInt(m1258BottomSheetScaffold_bGncdBI$lambda4.floatValue()) != kotlin.math.MathKt.roundToInt(f122)) {
                                                                float f15 = i49;
                                                                m1258BottomSheetScaffold_bGncdBI$lambda42 = androidx.compose.material.BottomSheetScaffoldKt.m1258BottomSheetScaffold_bGncdBI$lambda4(mutableState2);
                                                                kotlin.jvm.internal.Intrinsics.checkNotNull(m1258BottomSheetScaffold_bGncdBI$lambda42);
                                                                mapOf = kotlin.collections.MapsKt.mapOf(kotlin.TuplesKt.to(java.lang.Float.valueOf(f15 - m1258BottomSheetScaffold_bGncdBI$lambda42.floatValue()), androidx.compose.material.BottomSheetValue.Expanded), kotlin.TuplesKt.to(java.lang.Float.valueOf(f15 - f122), androidx.compose.material.BottomSheetValue.Collapsed));
                                                            } else {
                                                                mapOf = kotlin.collections.MapsKt.mapOf(kotlin.TuplesKt.to(java.lang.Float.valueOf(i49 - m1258BottomSheetScaffold_bGncdBI$lambda4.floatValue()), androidx.compose.material.BottomSheetValue.Collapsed));
                                                            }
                                                            m1521swipeablepPrIpRY = androidx.compose.material.SwipeableKt.m1521swipeablepPrIpRY(androidx.compose.ui.Modifier.INSTANCE, bottomSheetScaffoldState42.getBottomSheetState(), r13, androidx.compose.foundation.gestures.Orientation.Vertical, (r26 & 8) != 0 ? true : z62, (r26 & 16) != 0 ? false : false, (r26 & 32) != 0 ? null : null, (r26 & 64) != 0 ? new kotlin.jvm.functions.Function2<T, T, androidx.compose.material.FixedThreshold>() { // from class: androidx.compose.material.SwipeableKt$swipeable$1
                                                                /* JADX WARN: Can't rename method to resolve collision */
                                                                @Override // kotlin.jvm.functions.Function2
                                                                public final androidx.compose.material.FixedThreshold invoke(T t, T t2) {
                                                                    return new androidx.compose.material.FixedThreshold(androidx.compose.ui.unit.Dp.m4478constructorimpl(56), null);
                                                                }
                                                            } : null, (r26 & 128) != 0 ? androidx.compose.material.SwipeableDefaults.resistanceConfig$default(androidx.compose.material.SwipeableDefaults.INSTANCE, mapOf.keySet(), 0.0f, 0.0f, 6, null) : null, (r26 & 256) != 0 ? androidx.compose.material.SwipeableDefaults.INSTANCE.m1520getVelocityThresholdD9Ej5fM() : 0.0f);
                                                        }
                                                        androidx.compose.ui.Modifier m608requiredHeightInVpY3zN4$default = androidx.compose.foundation.layout.SizeKt.m608requiredHeightInVpY3zN4$default(androidx.compose.foundation.layout.SizeKt.fillMaxWidth$default(androidx.compose.ui.input.nestedscroll.NestedScrollModifierKt.nestedScroll$default(androidx.compose.ui.Modifier.INSTANCE, bottomSheetScaffoldState42.getBottomSheetState().getNestedScrollConnection(), null, 2, null).then(m1521swipeablepPrIpRY).then(modifier62), 0.0f, 1, null), f132, 0.0f, 2, null);
                                                        final androidx.compose.runtime.MutableState<java.lang.Float> mutableState3 = mutableState2;
                                                        composer5.startReplaceableGroup(1157296644);
                                                        androidx.compose.runtime.ComposerKt.sourceInformation(composer5, "C(remember)P(1):Composables.kt#9igjgp");
                                                        boolean changed = composer5.changed(mutableState3);
                                                        java.lang.Object rememberedValue3 = composer5.rememberedValue();
                                                        if (changed || rememberedValue3 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                                                            rememberedValue3 = (kotlin.jvm.functions.Function1) new kotlin.jvm.functions.Function1<androidx.compose.ui.unit.IntSize, kotlin.Unit>() { // from class: androidx.compose.material.BottomSheetScaffoldKt$BottomSheetScaffold$child$1$1$1$1
                                                                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                                                {
                                                                    super(1);
                                                                }

                                                                @Override // kotlin.jvm.functions.Function1
                                                                public /* bridge */ /* synthetic */ kotlin.Unit invoke(androidx.compose.ui.unit.IntSize intSize) {
                                                                    m1263invokeozmzZPI(intSize.getPackedValue());
                                                                    return kotlin.Unit.INSTANCE;
                                                                }

                                                                /* renamed from: invoke-ozmzZPI, reason: not valid java name */
                                                                public final void m1263invokeozmzZPI(long j322) {
                                                                    mutableState3.setValue(java.lang.Float.valueOf(androidx.compose.ui.unit.IntSize.m4651getHeightimpl(j322)));
                                                                }
                                                            };
                                                            composer5.updateRememberedValue(rememberedValue3);
                                                        }
                                                        composer5.endReplaceableGroup();
                                                        androidx.compose.ui.Modifier onSizeChanged = androidx.compose.ui.layout.OnRemeasuredModifierKt.onSizeChanged(m608requiredHeightInVpY3zN4$default, (kotlin.jvm.functions.Function1) rememberedValue3);
                                                        androidx.compose.ui.graphics.Shape shape82 = shape72;
                                                        long j322 = j302;
                                                        long j332 = j312;
                                                        float f16 = f14;
                                                        final kotlin.jvm.functions.Function3<? super androidx.compose.foundation.layout.ColumnScope, ? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.Unit> function39 = function38;
                                                        final int i52 = i472;
                                                        androidx.compose.runtime.internal.ComposableLambda composableLambda3 = androidx.compose.runtime.internal.ComposableLambdaKt.composableLambda(composer5, -698903261, true, new kotlin.jvm.functions.Function2<androidx.compose.runtime.Composer, java.lang.Integer, kotlin.Unit>() { // from class: androidx.compose.material.BottomSheetScaffoldKt.BottomSheetScaffold.child.1.1.2
                                                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                                            /* JADX WARN: Multi-variable type inference failed */
                                                            {
                                                                super(2);
                                                            }

                                                            @Override // kotlin.jvm.functions.Function2
                                                            public /* bridge */ /* synthetic */ kotlin.Unit invoke(androidx.compose.runtime.Composer composer6, java.lang.Integer num) {
                                                                invoke(composer6, num.intValue());
                                                                return kotlin.Unit.INSTANCE;
                                                            }

                                                            public final void invoke(androidx.compose.runtime.Composer composer6, int i53) {
                                                                androidx.compose.runtime.ComposerKt.sourceInformation(composer6, "C361@15529L30:BottomSheetScaffold.kt#jmzs0o");
                                                                if ((i53 & 11) == 2 && composer6.getSkipping()) {
                                                                    composer6.skipToGroupEnd();
                                                                    return;
                                                                }
                                                                kotlin.jvm.functions.Function3<androidx.compose.foundation.layout.ColumnScope, androidx.compose.runtime.Composer, java.lang.Integer, kotlin.Unit> function310 = function39;
                                                                int i54 = (i52 << 9) & 7168;
                                                                composer6.startReplaceableGroup(-483455358);
                                                                androidx.compose.runtime.ComposerKt.sourceInformation(composer6, "C(Column)P(2,3,1)77@3880L61,78@3946L133:Column.kt#2w3rfo");
                                                                androidx.compose.ui.Modifier.Companion companion3 = androidx.compose.ui.Modifier.INSTANCE;
                                                                androidx.compose.ui.layout.MeasurePolicy columnMeasurePolicy = androidx.compose.foundation.layout.ColumnKt.columnMeasurePolicy(androidx.compose.foundation.layout.Arrangement.INSTANCE.getTop(), androidx.compose.ui.Alignment.INSTANCE.getStart(), composer6, 0);
                                                                composer6.startReplaceableGroup(-1323940314);
                                                                androidx.compose.runtime.ComposerKt.sourceInformation(composer6, "C(Layout)P(!1,2)74@2915L7,75@2970L7,76@3029L7,77@3041L460:Layout.kt#80mrfh");
                                                                androidx.compose.runtime.ProvidableCompositionLocal<androidx.compose.ui.unit.Density> localDensity22 = androidx.compose.ui.platform.CompositionLocalsKt.getLocalDensity();
                                                                androidx.compose.runtime.ComposerKt.sourceInformationMarkerStart(composer6, 2023513938, "C:CompositionLocal.kt#9igjgp");
                                                                java.lang.Object consume22 = composer6.consume(localDensity22);
                                                                androidx.compose.runtime.ComposerKt.sourceInformationMarkerEnd(composer6);
                                                                androidx.compose.ui.unit.Density density = (androidx.compose.ui.unit.Density) consume22;
                                                                androidx.compose.runtime.ProvidableCompositionLocal<androidx.compose.ui.unit.LayoutDirection> localLayoutDirection = androidx.compose.ui.platform.CompositionLocalsKt.getLocalLayoutDirection();
                                                                androidx.compose.runtime.ComposerKt.sourceInformationMarkerStart(composer6, 2023513938, "C:CompositionLocal.kt#9igjgp");
                                                                java.lang.Object consume3 = composer6.consume(localLayoutDirection);
                                                                androidx.compose.runtime.ComposerKt.sourceInformationMarkerEnd(composer6);
                                                                androidx.compose.ui.unit.LayoutDirection layoutDirection = (androidx.compose.ui.unit.LayoutDirection) consume3;
                                                                androidx.compose.runtime.ProvidableCompositionLocal<androidx.compose.ui.platform.ViewConfiguration> localViewConfiguration = androidx.compose.ui.platform.CompositionLocalsKt.getLocalViewConfiguration();
                                                                androidx.compose.runtime.ComposerKt.sourceInformationMarkerStart(composer6, 2023513938, "C:CompositionLocal.kt#9igjgp");
                                                                java.lang.Object consume4 = composer6.consume(localViewConfiguration);
                                                                androidx.compose.runtime.ComposerKt.sourceInformationMarkerEnd(composer6);
                                                                androidx.compose.ui.platform.ViewConfiguration viewConfiguration = (androidx.compose.ui.platform.ViewConfiguration) consume4;
                                                                kotlin.jvm.functions.Function0<androidx.compose.ui.node.ComposeUiNode> constructor = androidx.compose.ui.node.ComposeUiNode.INSTANCE.getConstructor();
                                                                kotlin.jvm.functions.Function3<androidx.compose.runtime.SkippableUpdater<androidx.compose.ui.node.ComposeUiNode>, androidx.compose.runtime.Composer, java.lang.Integer, kotlin.Unit> materializerOf = androidx.compose.ui.layout.LayoutKt.materializerOf(companion3);
                                                                if (!(composer6.getApplier() instanceof androidx.compose.runtime.Applier)) {
                                                                    androidx.compose.runtime.ComposablesKt.invalidApplier();
                                                                }
                                                                composer6.startReusableNode();
                                                                if (composer6.getInserting()) {
                                                                    composer6.createNode(constructor);
                                                                } else {
                                                                    composer6.useNode();
                                                                }
                                                                composer6.disableReusing();
                                                                androidx.compose.runtime.Composer m1641constructorimpl = androidx.compose.runtime.Updater.m1641constructorimpl(composer6);
                                                                androidx.compose.runtime.Updater.m1648setimpl(m1641constructorimpl, columnMeasurePolicy, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetMeasurePolicy());
                                                                androidx.compose.runtime.Updater.m1648setimpl(m1641constructorimpl, density, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetDensity());
                                                                androidx.compose.runtime.Updater.m1648setimpl(m1641constructorimpl, layoutDirection, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetLayoutDirection());
                                                                androidx.compose.runtime.Updater.m1648setimpl(m1641constructorimpl, viewConfiguration, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetViewConfiguration());
                                                                composer6.enableReusing();
                                                                materializerOf.invoke(androidx.compose.runtime.SkippableUpdater.m1632boximpl(androidx.compose.runtime.SkippableUpdater.m1633constructorimpl(composer6)), composer6, 0);
                                                                composer6.startReplaceableGroup(2058660585);
                                                                composer6.startReplaceableGroup(-1163856341);
                                                                androidx.compose.runtime.ComposerKt.sourceInformation(composer6, "C79@3994L9:Column.kt#2w3rfo");
                                                                function310.invoke(androidx.compose.foundation.layout.ColumnScopeInstance.INSTANCE, composer6, java.lang.Integer.valueOf(((i54 >> 6) & 112) | 6));
                                                                composer6.endReplaceableGroup();
                                                                composer6.endReplaceableGroup();
                                                                composer6.endNode();
                                                                composer6.endReplaceableGroup();
                                                                composer6.endReplaceableGroup();
                                                            }
                                                        });
                                                        int i53 = i472;
                                                        int i54 = i48;
                                                        androidx.compose.material.SurfaceKt.m1511SurfaceFjzlyU(onSizeChanged, shape82, j322, j332, null, f16, composableLambda3, composer5, ((i53 >> 21) & 112) | 1572864 | ((i54 << 6) & 896) | ((i54 << 6) & 7168) | ((i53 >> 12) & 458752), 16);
                                                        return;
                                                    }
                                                    composer5.skipToGroupEnd();
                                                }
                                            });
                                            kotlin.jvm.functions.Function2<androidx.compose.runtime.Composer, java.lang.Integer, kotlin.Unit> function211 = function292;
                                            final kotlin.jvm.functions.Function3<? super androidx.compose.material.SnackbarHostState, ? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.Unit> function39 = function362;
                                            final androidx.compose.material.BottomSheetScaffoldState bottomSheetScaffoldState52 = androidx.compose.material.BottomSheetScaffoldState.this;
                                            final int i49 = i432;
                                            androidx.compose.runtime.internal.ComposableLambda composableLambda3 = androidx.compose.runtime.internal.ComposableLambdaKt.composableLambda(composer4, -486138068, true, new kotlin.jvm.functions.Function2<androidx.compose.runtime.Composer, java.lang.Integer, kotlin.Unit>() { // from class: androidx.compose.material.BottomSheetScaffoldKt$BottomSheetScaffold$child$1.2
                                                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                                /* JADX WARN: Multi-variable type inference failed */
                                                {
                                                    super(2);
                                                }

                                                @Override // kotlin.jvm.functions.Function2
                                                public /* bridge */ /* synthetic */ kotlin.Unit invoke(androidx.compose.runtime.Composer composer5, java.lang.Integer num) {
                                                    invoke(composer5, num.intValue());
                                                    return kotlin.Unit.INSTANCE;
                                                }

                                                public final void invoke(androidx.compose.runtime.Composer composer5, int i50) {
                                                    androidx.compose.runtime.ComposerKt.sourceInformation(composer5, "C365@15680L45:BottomSheetScaffold.kt#jmzs0o");
                                                    if ((i50 & 11) == 2 && composer5.getSkipping()) {
                                                        composer5.skipToGroupEnd();
                                                    } else {
                                                        function39.invoke(bottomSheetScaffoldState52.getSnackbarHostState(), composer5, java.lang.Integer.valueOf((i49 >> 9) & 112));
                                                    }
                                                }
                                            });
                                            float f15 = f102;
                                            int i50 = i422;
                                            int i51 = i432;
                                            androidx.compose.material.BottomSheetScaffoldKt.m1257BottomSheetScaffoldLayoutKCBPh4w(function210, function372, composableLambda22, function211, composableLambda3, f15, i50, offset, bottomSheetState, composer4, ((i51 >> 9) & 14) | 24960 | ((i442 >> 3) & 112) | ((i51 >> 6) & 7168) | ((i452 << 9) & 458752) | (i51 & 3670016));
                                            return;
                                        }
                                        composer4.skipToGroupEnd();
                                    }
                                });
                                androidx.compose.ui.Modifier modifier62 = modifier3;
                                final kotlin.jvm.functions.Function3<? super androidx.compose.foundation.layout.ColumnScope, ? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.Unit> function372 = function34;
                                final androidx.compose.material.BottomSheetScaffoldState bottomSheetScaffoldState42 = bottomSheetScaffoldState2;
                                final boolean z62 = z4;
                                final androidx.compose.ui.graphics.Shape shape72 = shape4;
                                final float f122 = f6;
                                final long j302 = j17;
                                final long j312 = j13;
                                final long j322 = j20;
                                final int i462 = i21;
                                int i472 = i33 << 6;
                                androidx.compose.material.SurfaceKt.m1511SurfaceFjzlyU(androidx.compose.foundation.layout.SizeKt.fillMaxSize$default(modifier62, 0.0f, 1, null), null, j19, j18, null, 0.0f, androidx.compose.runtime.internal.ComposableLambdaKt.composableLambda(composer3, 1273816607, true, new kotlin.jvm.functions.Function2<androidx.compose.runtime.Composer, java.lang.Integer, kotlin.Unit>() { // from class: androidx.compose.material.BottomSheetScaffoldKt$BottomSheetScaffold$1
                                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                    /* JADX WARN: Multi-variable type inference failed */
                                    {
                                        super(2);
                                    }

                                    @Override // kotlin.jvm.functions.Function2
                                    public /* bridge */ /* synthetic */ kotlin.Unit invoke(androidx.compose.runtime.Composer composer4, java.lang.Integer num) {
                                        invoke(composer4, num.intValue());
                                        return kotlin.Unit.INSTANCE;
                                    }

                                    public final void invoke(androidx.compose.runtime.Composer composer4, int i48) {
                                        androidx.compose.runtime.ComposerKt.sourceInformation(composer4, "C:BottomSheetScaffold.kt#jmzs0o");
                                        if ((i48 & 11) != 2 || !composer4.getSkipping()) {
                                            if (function372 == null) {
                                                composer4.startReplaceableGroup(-249544858);
                                                androidx.compose.runtime.ComposerKt.sourceInformation(composer4, "381@16183L7");
                                                composableLambda2.invoke(composer4, 6);
                                                composer4.endReplaceableGroup();
                                                return;
                                            }
                                            composer4.startReplaceableGroup(-249544821);
                                            androidx.compose.runtime.ComposerKt.sourceInformation(composer4, "383@16220L480");
                                            kotlin.jvm.functions.Function3<androidx.compose.foundation.layout.ColumnScope, androidx.compose.runtime.Composer, java.lang.Integer, kotlin.Unit> function38 = function372;
                                            androidx.compose.material.DrawerState drawerState = bottomSheetScaffoldState42.getDrawerState();
                                            boolean z72 = z62;
                                            androidx.compose.ui.graphics.Shape shape82 = shape72;
                                            float f132 = f122;
                                            long j332 = j302;
                                            long j34 = j312;
                                            long j35 = j322;
                                            kotlin.jvm.functions.Function2<androidx.compose.runtime.Composer, java.lang.Integer, kotlin.Unit> function210 = composableLambda2;
                                            int i49 = i462;
                                            androidx.compose.material.DrawerKt.m1364ModalDrawerGs3lGvM(function38, null, drawerState, z72, shape82, f132, j332, j34, j35, function210, composer4, ((i49 >> 3) & 7168) | ((i49 >> 9) & 14) | 805306368 | ((i49 >> 3) & 57344) | ((i49 >> 3) & 458752) | ((i49 >> 3) & 3670016) | ((i49 >> 3) & 29360128) | ((i49 >> 3) & 234881024), 2);
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
                            kotlin.jvm.functions.Function2<? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.Unit> function2722 = function26;
                            if ((i5 & 2048) == 0) {
                            }
                            if (i16 == 0) {
                            }
                            if (i25 == 0) {
                            }
                            if (i27 == 0) {
                            }
                            float f922 = m1255getSheetPeekHeightD9Ej5fM;
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
                            androidx.compose.runtime.ComposerKt.sourceInformation(startRestartGroup, "C(rememberCoroutineScope)475@19849L144:Effects.kt#9igjgp");
                            startRestartGroup.startReplaceableGroup(-492369756);
                            androidx.compose.runtime.ComposerKt.sourceInformation(startRestartGroup, "C(remember):Composables.kt#9igjgp");
                            rememberedValue = startRestartGroup.rememberedValue();
                            if (rememberedValue == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                            }
                            startRestartGroup.endReplaceableGroup();
                            final kotlinx.coroutines.CoroutineScope coroutineScope22 = ((androidx.compose.runtime.CompositionScopedCoroutineScopeCanceller) rememberedValue).getCoroutineScope();
                            startRestartGroup.endReplaceableGroup();
                            androidx.compose.runtime.ProvidableCompositionLocal<androidx.compose.ui.unit.Density> localDensity22 = androidx.compose.ui.platform.CompositionLocalsKt.getLocalDensity();
                            androidx.compose.runtime.ComposerKt.sourceInformationMarkerStart(startRestartGroup, 2023513938, "C:CompositionLocal.kt#9igjgp");
                            java.lang.Object consume22 = startRestartGroup.consume(localDensity22);
                            androidx.compose.runtime.ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                            mo315toPx0680j_4 = ((androidx.compose.ui.unit.Density) consume22).mo315toPx0680j_4(f5);
                            startRestartGroup.startReplaceableGroup(-492369756);
                            androidx.compose.runtime.ComposerKt.sourceInformation(startRestartGroup, "C(remember):Composables.kt#9igjgp");
                            rememberedValue2 = startRestartGroup.rememberedValue();
                            if (rememberedValue2 != androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                            }
                            startRestartGroup.endReplaceableGroup();
                            mutableState = (androidx.compose.runtime.MutableState) obj;
                            if (kotlin.jvm.internal.Intrinsics.areEqual(mo315toPx0680j_4, m1258BottomSheetScaffold_bGncdBI$lambda4(mutableState))) {
                            }
                            final androidx.compose.material.BottomSheetScaffoldState bottomSheetScaffoldState322 = bottomSheetScaffoldState2;
                            final kotlin.jvm.functions.Function2<? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.Unit> function2822 = function24;
                            final kotlin.jvm.functions.Function2<? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.Unit> function2922 = function23;
                            final float f1022 = f5;
                            final int i4222 = m1403getEnd5ygKITE;
                            final int i4322 = i32;
                            final int i4422 = i33;
                            final int i4522 = i21;
                            final boolean z522 = z3;
                            final androidx.compose.ui.Modifier companion222 = companion;
                            final androidx.compose.ui.graphics.Shape shape622 = cornerBasedShape;
                            final long j2822 = j11;
                            final long j2922 = j10;
                            final float f1122 = m1254getSheetElevationD9Ej5fM;
                            final kotlin.jvm.functions.Function3<? super androidx.compose.material.SnackbarHostState, ? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.Unit> function3622 = m1340getLambda1$material_release;
                            composer3 = composer2;
                            final kotlin.jvm.functions.Function2<? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.Unit> composableLambda22 = androidx.compose.runtime.internal.ComposableLambdaKt.composableLambda(composer3, 893101063, true, new kotlin.jvm.functions.Function2<androidx.compose.runtime.Composer, java.lang.Integer, kotlin.Unit>() { // from class: androidx.compose.material.BottomSheetScaffoldKt$BottomSheetScaffold$child$1
                                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                /* JADX WARN: Multi-variable type inference failed */
                                {
                                    super(2);
                                }

                                @Override // kotlin.jvm.functions.Function2
                                public /* bridge */ /* synthetic */ kotlin.Unit invoke(androidx.compose.runtime.Composer composer4, java.lang.Integer num) {
                                    invoke(composer4, num.intValue());
                                    return kotlin.Unit.INSTANCE;
                                }

                                public final void invoke(androidx.compose.runtime.Composer composer4, int i4622) {
                                    androidx.compose.runtime.ComposerKt.sourceInformation(composer4, "C316@13233L2758:BottomSheetScaffold.kt#jmzs0o");
                                    if ((i4622 & 11) != 2 || !composer4.getSkipping()) {
                                        androidx.compose.runtime.State<java.lang.Float> offset = androidx.compose.material.BottomSheetScaffoldState.this.getBottomSheetState().getOffset();
                                        androidx.compose.material.BottomSheetState bottomSheetState = androidx.compose.material.BottomSheetScaffoldState.this.getBottomSheetState();
                                        kotlin.jvm.functions.Function2<androidx.compose.runtime.Composer, java.lang.Integer, kotlin.Unit> function210 = function2822;
                                        kotlin.jvm.functions.Function3<androidx.compose.foundation.layout.PaddingValues, androidx.compose.runtime.Composer, java.lang.Integer, kotlin.Unit> function3722 = content;
                                        final float f1222 = mo315toPx0680j_4;
                                        final androidx.compose.material.BottomSheetScaffoldState bottomSheetScaffoldState422 = androidx.compose.material.BottomSheetScaffoldState.this;
                                        final boolean z622 = z522;
                                        final androidx.compose.ui.Modifier modifier622 = companion222;
                                        final float f132 = f1022;
                                        final androidx.compose.runtime.MutableState<java.lang.Float> mutableState2 = mutableState;
                                        final androidx.compose.ui.graphics.Shape shape722 = shape622;
                                        final long j3022 = j2822;
                                        final long j3122 = j2922;
                                        final float f14 = f1122;
                                        final int i4722 = i4322;
                                        final int i48 = i4522;
                                        final kotlin.jvm.functions.Function3<? super androidx.compose.foundation.layout.ColumnScope, ? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.Unit> function38 = sheetContent;
                                        androidx.compose.runtime.internal.ComposableLambda composableLambda222 = androidx.compose.runtime.internal.ComposableLambdaKt.composableLambda(composer4, -1378534681, true, new kotlin.jvm.functions.Function3<java.lang.Integer, androidx.compose.runtime.Composer, java.lang.Integer, kotlin.Unit>() { // from class: androidx.compose.material.BottomSheetScaffoldKt$BottomSheetScaffold$child$1.1
                                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                            /* JADX WARN: Multi-variable type inference failed */
                                            {
                                                super(3);
                                            }

                                            @Override // kotlin.jvm.functions.Function3
                                            public /* bridge */ /* synthetic */ kotlin.Unit invoke(java.lang.Integer num, androidx.compose.runtime.Composer composer5, java.lang.Integer num2) {
                                                invoke(num.intValue(), composer5, num2.intValue());
                                                return kotlin.Unit.INSTANCE;
                                            }

                                            public final void invoke(int i49, androidx.compose.runtime.Composer composer5, int i50) {
                                                int i51;
                                                java.lang.Float m1258BottomSheetScaffold_bGncdBI$lambda4;
                                                java.lang.Float m1258BottomSheetScaffold_bGncdBI$lambda42;
                                                java.util.Map mapOf;
                                                androidx.compose.ui.Modifier.Companion m1521swipeablepPrIpRY;
                                                androidx.compose.runtime.ComposerKt.sourceInformation(composer5, "C354@15208L95,347@14851L711:BottomSheetScaffold.kt#jmzs0o");
                                                if ((i50 & 14) == 0) {
                                                    i51 = i50 | (composer5.changed(i49) ? 4 : 2);
                                                } else {
                                                    i51 = i50;
                                                }
                                                if ((i51 & 91) != 18 || !composer5.getSkipping()) {
                                                    m1258BottomSheetScaffold_bGncdBI$lambda4 = androidx.compose.material.BottomSheetScaffoldKt.m1258BottomSheetScaffold_bGncdBI$lambda4(mutableState2);
                                                    if (m1258BottomSheetScaffold_bGncdBI$lambda4 == null) {
                                                        m1521swipeablepPrIpRY = androidx.compose.ui.Modifier.INSTANCE;
                                                    } else {
                                                        if (kotlin.math.MathKt.roundToInt(m1258BottomSheetScaffold_bGncdBI$lambda4.floatValue()) != kotlin.math.MathKt.roundToInt(f1222)) {
                                                            float f15 = i49;
                                                            m1258BottomSheetScaffold_bGncdBI$lambda42 = androidx.compose.material.BottomSheetScaffoldKt.m1258BottomSheetScaffold_bGncdBI$lambda4(mutableState2);
                                                            kotlin.jvm.internal.Intrinsics.checkNotNull(m1258BottomSheetScaffold_bGncdBI$lambda42);
                                                            mapOf = kotlin.collections.MapsKt.mapOf(kotlin.TuplesKt.to(java.lang.Float.valueOf(f15 - m1258BottomSheetScaffold_bGncdBI$lambda42.floatValue()), androidx.compose.material.BottomSheetValue.Expanded), kotlin.TuplesKt.to(java.lang.Float.valueOf(f15 - f1222), androidx.compose.material.BottomSheetValue.Collapsed));
                                                        } else {
                                                            mapOf = kotlin.collections.MapsKt.mapOf(kotlin.TuplesKt.to(java.lang.Float.valueOf(i49 - m1258BottomSheetScaffold_bGncdBI$lambda4.floatValue()), androidx.compose.material.BottomSheetValue.Collapsed));
                                                        }
                                                        m1521swipeablepPrIpRY = androidx.compose.material.SwipeableKt.m1521swipeablepPrIpRY(androidx.compose.ui.Modifier.INSTANCE, bottomSheetScaffoldState422.getBottomSheetState(), r13, androidx.compose.foundation.gestures.Orientation.Vertical, (r26 & 8) != 0 ? true : z622, (r26 & 16) != 0 ? false : false, (r26 & 32) != 0 ? null : null, (r26 & 64) != 0 ? new kotlin.jvm.functions.Function2<T, T, androidx.compose.material.FixedThreshold>() { // from class: androidx.compose.material.SwipeableKt$swipeable$1
                                                            /* JADX WARN: Can't rename method to resolve collision */
                                                            @Override // kotlin.jvm.functions.Function2
                                                            public final androidx.compose.material.FixedThreshold invoke(T t, T t2) {
                                                                return new androidx.compose.material.FixedThreshold(androidx.compose.ui.unit.Dp.m4478constructorimpl(56), null);
                                                            }
                                                        } : null, (r26 & 128) != 0 ? androidx.compose.material.SwipeableDefaults.resistanceConfig$default(androidx.compose.material.SwipeableDefaults.INSTANCE, mapOf.keySet(), 0.0f, 0.0f, 6, null) : null, (r26 & 256) != 0 ? androidx.compose.material.SwipeableDefaults.INSTANCE.m1520getVelocityThresholdD9Ej5fM() : 0.0f);
                                                    }
                                                    androidx.compose.ui.Modifier m608requiredHeightInVpY3zN4$default = androidx.compose.foundation.layout.SizeKt.m608requiredHeightInVpY3zN4$default(androidx.compose.foundation.layout.SizeKt.fillMaxWidth$default(androidx.compose.ui.input.nestedscroll.NestedScrollModifierKt.nestedScroll$default(androidx.compose.ui.Modifier.INSTANCE, bottomSheetScaffoldState422.getBottomSheetState().getNestedScrollConnection(), null, 2, null).then(m1521swipeablepPrIpRY).then(modifier622), 0.0f, 1, null), f132, 0.0f, 2, null);
                                                    final androidx.compose.runtime.MutableState<java.lang.Float> mutableState3 = mutableState2;
                                                    composer5.startReplaceableGroup(1157296644);
                                                    androidx.compose.runtime.ComposerKt.sourceInformation(composer5, "C(remember)P(1):Composables.kt#9igjgp");
                                                    boolean changed = composer5.changed(mutableState3);
                                                    java.lang.Object rememberedValue3 = composer5.rememberedValue();
                                                    if (changed || rememberedValue3 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                                                        rememberedValue3 = (kotlin.jvm.functions.Function1) new kotlin.jvm.functions.Function1<androidx.compose.ui.unit.IntSize, kotlin.Unit>() { // from class: androidx.compose.material.BottomSheetScaffoldKt$BottomSheetScaffold$child$1$1$1$1
                                                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                                            {
                                                                super(1);
                                                            }

                                                            @Override // kotlin.jvm.functions.Function1
                                                            public /* bridge */ /* synthetic */ kotlin.Unit invoke(androidx.compose.ui.unit.IntSize intSize) {
                                                                m1263invokeozmzZPI(intSize.getPackedValue());
                                                                return kotlin.Unit.INSTANCE;
                                                            }

                                                            /* renamed from: invoke-ozmzZPI, reason: not valid java name */
                                                            public final void m1263invokeozmzZPI(long j3222) {
                                                                mutableState3.setValue(java.lang.Float.valueOf(androidx.compose.ui.unit.IntSize.m4651getHeightimpl(j3222)));
                                                            }
                                                        };
                                                        composer5.updateRememberedValue(rememberedValue3);
                                                    }
                                                    composer5.endReplaceableGroup();
                                                    androidx.compose.ui.Modifier onSizeChanged = androidx.compose.ui.layout.OnRemeasuredModifierKt.onSizeChanged(m608requiredHeightInVpY3zN4$default, (kotlin.jvm.functions.Function1) rememberedValue3);
                                                    androidx.compose.ui.graphics.Shape shape82 = shape722;
                                                    long j3222 = j3022;
                                                    long j332 = j3122;
                                                    float f16 = f14;
                                                    final kotlin.jvm.functions.Function3<? super androidx.compose.foundation.layout.ColumnScope, ? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.Unit> function39 = function38;
                                                    final int i52 = i4722;
                                                    androidx.compose.runtime.internal.ComposableLambda composableLambda3 = androidx.compose.runtime.internal.ComposableLambdaKt.composableLambda(composer5, -698903261, true, new kotlin.jvm.functions.Function2<androidx.compose.runtime.Composer, java.lang.Integer, kotlin.Unit>() { // from class: androidx.compose.material.BottomSheetScaffoldKt.BottomSheetScaffold.child.1.1.2
                                                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                                        /* JADX WARN: Multi-variable type inference failed */
                                                        {
                                                            super(2);
                                                        }

                                                        @Override // kotlin.jvm.functions.Function2
                                                        public /* bridge */ /* synthetic */ kotlin.Unit invoke(androidx.compose.runtime.Composer composer6, java.lang.Integer num) {
                                                            invoke(composer6, num.intValue());
                                                            return kotlin.Unit.INSTANCE;
                                                        }

                                                        public final void invoke(androidx.compose.runtime.Composer composer6, int i53) {
                                                            androidx.compose.runtime.ComposerKt.sourceInformation(composer6, "C361@15529L30:BottomSheetScaffold.kt#jmzs0o");
                                                            if ((i53 & 11) == 2 && composer6.getSkipping()) {
                                                                composer6.skipToGroupEnd();
                                                                return;
                                                            }
                                                            kotlin.jvm.functions.Function3<androidx.compose.foundation.layout.ColumnScope, androidx.compose.runtime.Composer, java.lang.Integer, kotlin.Unit> function310 = function39;
                                                            int i54 = (i52 << 9) & 7168;
                                                            composer6.startReplaceableGroup(-483455358);
                                                            androidx.compose.runtime.ComposerKt.sourceInformation(composer6, "C(Column)P(2,3,1)77@3880L61,78@3946L133:Column.kt#2w3rfo");
                                                            androidx.compose.ui.Modifier.Companion companion3 = androidx.compose.ui.Modifier.INSTANCE;
                                                            androidx.compose.ui.layout.MeasurePolicy columnMeasurePolicy = androidx.compose.foundation.layout.ColumnKt.columnMeasurePolicy(androidx.compose.foundation.layout.Arrangement.INSTANCE.getTop(), androidx.compose.ui.Alignment.INSTANCE.getStart(), composer6, 0);
                                                            composer6.startReplaceableGroup(-1323940314);
                                                            androidx.compose.runtime.ComposerKt.sourceInformation(composer6, "C(Layout)P(!1,2)74@2915L7,75@2970L7,76@3029L7,77@3041L460:Layout.kt#80mrfh");
                                                            androidx.compose.runtime.ProvidableCompositionLocal<androidx.compose.ui.unit.Density> localDensity222 = androidx.compose.ui.platform.CompositionLocalsKt.getLocalDensity();
                                                            androidx.compose.runtime.ComposerKt.sourceInformationMarkerStart(composer6, 2023513938, "C:CompositionLocal.kt#9igjgp");
                                                            java.lang.Object consume222 = composer6.consume(localDensity222);
                                                            androidx.compose.runtime.ComposerKt.sourceInformationMarkerEnd(composer6);
                                                            androidx.compose.ui.unit.Density density = (androidx.compose.ui.unit.Density) consume222;
                                                            androidx.compose.runtime.ProvidableCompositionLocal<androidx.compose.ui.unit.LayoutDirection> localLayoutDirection = androidx.compose.ui.platform.CompositionLocalsKt.getLocalLayoutDirection();
                                                            androidx.compose.runtime.ComposerKt.sourceInformationMarkerStart(composer6, 2023513938, "C:CompositionLocal.kt#9igjgp");
                                                            java.lang.Object consume3 = composer6.consume(localLayoutDirection);
                                                            androidx.compose.runtime.ComposerKt.sourceInformationMarkerEnd(composer6);
                                                            androidx.compose.ui.unit.LayoutDirection layoutDirection = (androidx.compose.ui.unit.LayoutDirection) consume3;
                                                            androidx.compose.runtime.ProvidableCompositionLocal<androidx.compose.ui.platform.ViewConfiguration> localViewConfiguration = androidx.compose.ui.platform.CompositionLocalsKt.getLocalViewConfiguration();
                                                            androidx.compose.runtime.ComposerKt.sourceInformationMarkerStart(composer6, 2023513938, "C:CompositionLocal.kt#9igjgp");
                                                            java.lang.Object consume4 = composer6.consume(localViewConfiguration);
                                                            androidx.compose.runtime.ComposerKt.sourceInformationMarkerEnd(composer6);
                                                            androidx.compose.ui.platform.ViewConfiguration viewConfiguration = (androidx.compose.ui.platform.ViewConfiguration) consume4;
                                                            kotlin.jvm.functions.Function0<androidx.compose.ui.node.ComposeUiNode> constructor = androidx.compose.ui.node.ComposeUiNode.INSTANCE.getConstructor();
                                                            kotlin.jvm.functions.Function3<androidx.compose.runtime.SkippableUpdater<androidx.compose.ui.node.ComposeUiNode>, androidx.compose.runtime.Composer, java.lang.Integer, kotlin.Unit> materializerOf = androidx.compose.ui.layout.LayoutKt.materializerOf(companion3);
                                                            if (!(composer6.getApplier() instanceof androidx.compose.runtime.Applier)) {
                                                                androidx.compose.runtime.ComposablesKt.invalidApplier();
                                                            }
                                                            composer6.startReusableNode();
                                                            if (composer6.getInserting()) {
                                                                composer6.createNode(constructor);
                                                            } else {
                                                                composer6.useNode();
                                                            }
                                                            composer6.disableReusing();
                                                            androidx.compose.runtime.Composer m1641constructorimpl = androidx.compose.runtime.Updater.m1641constructorimpl(composer6);
                                                            androidx.compose.runtime.Updater.m1648setimpl(m1641constructorimpl, columnMeasurePolicy, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetMeasurePolicy());
                                                            androidx.compose.runtime.Updater.m1648setimpl(m1641constructorimpl, density, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetDensity());
                                                            androidx.compose.runtime.Updater.m1648setimpl(m1641constructorimpl, layoutDirection, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetLayoutDirection());
                                                            androidx.compose.runtime.Updater.m1648setimpl(m1641constructorimpl, viewConfiguration, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetViewConfiguration());
                                                            composer6.enableReusing();
                                                            materializerOf.invoke(androidx.compose.runtime.SkippableUpdater.m1632boximpl(androidx.compose.runtime.SkippableUpdater.m1633constructorimpl(composer6)), composer6, 0);
                                                            composer6.startReplaceableGroup(2058660585);
                                                            composer6.startReplaceableGroup(-1163856341);
                                                            androidx.compose.runtime.ComposerKt.sourceInformation(composer6, "C79@3994L9:Column.kt#2w3rfo");
                                                            function310.invoke(androidx.compose.foundation.layout.ColumnScopeInstance.INSTANCE, composer6, java.lang.Integer.valueOf(((i54 >> 6) & 112) | 6));
                                                            composer6.endReplaceableGroup();
                                                            composer6.endReplaceableGroup();
                                                            composer6.endNode();
                                                            composer6.endReplaceableGroup();
                                                            composer6.endReplaceableGroup();
                                                        }
                                                    });
                                                    int i53 = i4722;
                                                    int i54 = i48;
                                                    androidx.compose.material.SurfaceKt.m1511SurfaceFjzlyU(onSizeChanged, shape82, j3222, j332, null, f16, composableLambda3, composer5, ((i53 >> 21) & 112) | 1572864 | ((i54 << 6) & 896) | ((i54 << 6) & 7168) | ((i53 >> 12) & 458752), 16);
                                                    return;
                                                }
                                                composer5.skipToGroupEnd();
                                            }
                                        });
                                        kotlin.jvm.functions.Function2<androidx.compose.runtime.Composer, java.lang.Integer, kotlin.Unit> function211 = function2922;
                                        final kotlin.jvm.functions.Function3<? super androidx.compose.material.SnackbarHostState, ? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.Unit> function39 = function3622;
                                        final androidx.compose.material.BottomSheetScaffoldState bottomSheetScaffoldState52 = androidx.compose.material.BottomSheetScaffoldState.this;
                                        final int i49 = i4322;
                                        androidx.compose.runtime.internal.ComposableLambda composableLambda3 = androidx.compose.runtime.internal.ComposableLambdaKt.composableLambda(composer4, -486138068, true, new kotlin.jvm.functions.Function2<androidx.compose.runtime.Composer, java.lang.Integer, kotlin.Unit>() { // from class: androidx.compose.material.BottomSheetScaffoldKt$BottomSheetScaffold$child$1.2
                                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                            /* JADX WARN: Multi-variable type inference failed */
                                            {
                                                super(2);
                                            }

                                            @Override // kotlin.jvm.functions.Function2
                                            public /* bridge */ /* synthetic */ kotlin.Unit invoke(androidx.compose.runtime.Composer composer5, java.lang.Integer num) {
                                                invoke(composer5, num.intValue());
                                                return kotlin.Unit.INSTANCE;
                                            }

                                            public final void invoke(androidx.compose.runtime.Composer composer5, int i50) {
                                                androidx.compose.runtime.ComposerKt.sourceInformation(composer5, "C365@15680L45:BottomSheetScaffold.kt#jmzs0o");
                                                if ((i50 & 11) == 2 && composer5.getSkipping()) {
                                                    composer5.skipToGroupEnd();
                                                } else {
                                                    function39.invoke(bottomSheetScaffoldState52.getSnackbarHostState(), composer5, java.lang.Integer.valueOf((i49 >> 9) & 112));
                                                }
                                            }
                                        });
                                        float f15 = f1022;
                                        int i50 = i4222;
                                        int i51 = i4322;
                                        androidx.compose.material.BottomSheetScaffoldKt.m1257BottomSheetScaffoldLayoutKCBPh4w(function210, function3722, composableLambda222, function211, composableLambda3, f15, i50, offset, bottomSheetState, composer4, ((i51 >> 9) & 14) | 24960 | ((i4422 >> 3) & 112) | ((i51 >> 6) & 7168) | ((i4522 << 9) & 458752) | (i51 & 3670016));
                                        return;
                                    }
                                    composer4.skipToGroupEnd();
                                }
                            });
                            androidx.compose.ui.Modifier modifier622 = modifier3;
                            final kotlin.jvm.functions.Function3<? super androidx.compose.foundation.layout.ColumnScope, ? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.Unit> function3722 = function34;
                            final androidx.compose.material.BottomSheetScaffoldState bottomSheetScaffoldState422 = bottomSheetScaffoldState2;
                            final boolean z622 = z4;
                            final androidx.compose.ui.graphics.Shape shape722 = shape4;
                            final float f1222 = f6;
                            final long j3022 = j17;
                            final long j3122 = j13;
                            final long j3222 = j20;
                            final int i4622 = i21;
                            int i4722 = i33 << 6;
                            androidx.compose.material.SurfaceKt.m1511SurfaceFjzlyU(androidx.compose.foundation.layout.SizeKt.fillMaxSize$default(modifier622, 0.0f, 1, null), null, j19, j18, null, 0.0f, androidx.compose.runtime.internal.ComposableLambdaKt.composableLambda(composer3, 1273816607, true, new kotlin.jvm.functions.Function2<androidx.compose.runtime.Composer, java.lang.Integer, kotlin.Unit>() { // from class: androidx.compose.material.BottomSheetScaffoldKt$BottomSheetScaffold$1
                                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                /* JADX WARN: Multi-variable type inference failed */
                                {
                                    super(2);
                                }

                                @Override // kotlin.jvm.functions.Function2
                                public /* bridge */ /* synthetic */ kotlin.Unit invoke(androidx.compose.runtime.Composer composer4, java.lang.Integer num) {
                                    invoke(composer4, num.intValue());
                                    return kotlin.Unit.INSTANCE;
                                }

                                public final void invoke(androidx.compose.runtime.Composer composer4, int i48) {
                                    androidx.compose.runtime.ComposerKt.sourceInformation(composer4, "C:BottomSheetScaffold.kt#jmzs0o");
                                    if ((i48 & 11) != 2 || !composer4.getSkipping()) {
                                        if (function3722 == null) {
                                            composer4.startReplaceableGroup(-249544858);
                                            androidx.compose.runtime.ComposerKt.sourceInformation(composer4, "381@16183L7");
                                            composableLambda22.invoke(composer4, 6);
                                            composer4.endReplaceableGroup();
                                            return;
                                        }
                                        composer4.startReplaceableGroup(-249544821);
                                        androidx.compose.runtime.ComposerKt.sourceInformation(composer4, "383@16220L480");
                                        kotlin.jvm.functions.Function3<androidx.compose.foundation.layout.ColumnScope, androidx.compose.runtime.Composer, java.lang.Integer, kotlin.Unit> function38 = function3722;
                                        androidx.compose.material.DrawerState drawerState = bottomSheetScaffoldState422.getDrawerState();
                                        boolean z72 = z622;
                                        androidx.compose.ui.graphics.Shape shape82 = shape722;
                                        float f132 = f1222;
                                        long j332 = j3022;
                                        long j34 = j3122;
                                        long j35 = j3222;
                                        kotlin.jvm.functions.Function2<androidx.compose.runtime.Composer, java.lang.Integer, kotlin.Unit> function210 = composableLambda22;
                                        int i49 = i4622;
                                        androidx.compose.material.DrawerKt.m1364ModalDrawerGs3lGvM(function38, null, drawerState, z72, shape82, f132, j332, j34, j35, function210, composer4, ((i49 >> 3) & 7168) | ((i49 >> 9) & 14) | 805306368 | ((i49 >> 3) & 57344) | ((i49 >> 3) & 458752) | ((i49 >> 3) & 3670016) | ((i49 >> 3) & 29360128) | ((i49 >> 3) & 234881024), 2);
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
                        kotlin.jvm.functions.Function2<? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.Unit> function27222 = function26;
                        if ((i5 & 2048) == 0) {
                        }
                        if (i16 == 0) {
                        }
                        if (i25 == 0) {
                        }
                        if (i27 == 0) {
                        }
                        float f9222 = m1255getSheetPeekHeightD9Ej5fM;
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
                        androidx.compose.runtime.ComposerKt.sourceInformation(startRestartGroup, "C(rememberCoroutineScope)475@19849L144:Effects.kt#9igjgp");
                        startRestartGroup.startReplaceableGroup(-492369756);
                        androidx.compose.runtime.ComposerKt.sourceInformation(startRestartGroup, "C(remember):Composables.kt#9igjgp");
                        rememberedValue = startRestartGroup.rememberedValue();
                        if (rememberedValue == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                        }
                        startRestartGroup.endReplaceableGroup();
                        final kotlinx.coroutines.CoroutineScope coroutineScope222 = ((androidx.compose.runtime.CompositionScopedCoroutineScopeCanceller) rememberedValue).getCoroutineScope();
                        startRestartGroup.endReplaceableGroup();
                        androidx.compose.runtime.ProvidableCompositionLocal<androidx.compose.ui.unit.Density> localDensity222 = androidx.compose.ui.platform.CompositionLocalsKt.getLocalDensity();
                        androidx.compose.runtime.ComposerKt.sourceInformationMarkerStart(startRestartGroup, 2023513938, "C:CompositionLocal.kt#9igjgp");
                        java.lang.Object consume222 = startRestartGroup.consume(localDensity222);
                        androidx.compose.runtime.ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                        mo315toPx0680j_4 = ((androidx.compose.ui.unit.Density) consume222).mo315toPx0680j_4(f5);
                        startRestartGroup.startReplaceableGroup(-492369756);
                        androidx.compose.runtime.ComposerKt.sourceInformation(startRestartGroup, "C(remember):Composables.kt#9igjgp");
                        rememberedValue2 = startRestartGroup.rememberedValue();
                        if (rememberedValue2 != androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                        }
                        startRestartGroup.endReplaceableGroup();
                        mutableState = (androidx.compose.runtime.MutableState) obj;
                        if (kotlin.jvm.internal.Intrinsics.areEqual(mo315toPx0680j_4, m1258BottomSheetScaffold_bGncdBI$lambda4(mutableState))) {
                        }
                        final androidx.compose.material.BottomSheetScaffoldState bottomSheetScaffoldState3222 = bottomSheetScaffoldState2;
                        final kotlin.jvm.functions.Function2<? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.Unit> function28222 = function24;
                        final kotlin.jvm.functions.Function2<? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.Unit> function29222 = function23;
                        final float f10222 = f5;
                        final int i42222 = m1403getEnd5ygKITE;
                        final int i43222 = i32;
                        final int i44222 = i33;
                        final int i45222 = i21;
                        final boolean z5222 = z3;
                        final androidx.compose.ui.Modifier companion2222 = companion;
                        final androidx.compose.ui.graphics.Shape shape6222 = cornerBasedShape;
                        final long j28222 = j11;
                        final long j29222 = j10;
                        final float f11222 = m1254getSheetElevationD9Ej5fM;
                        final kotlin.jvm.functions.Function3<? super androidx.compose.material.SnackbarHostState, ? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.Unit> function36222 = m1340getLambda1$material_release;
                        composer3 = composer2;
                        final kotlin.jvm.functions.Function2<? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.Unit> composableLambda222 = androidx.compose.runtime.internal.ComposableLambdaKt.composableLambda(composer3, 893101063, true, new kotlin.jvm.functions.Function2<androidx.compose.runtime.Composer, java.lang.Integer, kotlin.Unit>() { // from class: androidx.compose.material.BottomSheetScaffoldKt$BottomSheetScaffold$child$1
                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            /* JADX WARN: Multi-variable type inference failed */
                            {
                                super(2);
                            }

                            @Override // kotlin.jvm.functions.Function2
                            public /* bridge */ /* synthetic */ kotlin.Unit invoke(androidx.compose.runtime.Composer composer4, java.lang.Integer num) {
                                invoke(composer4, num.intValue());
                                return kotlin.Unit.INSTANCE;
                            }

                            public final void invoke(androidx.compose.runtime.Composer composer4, int i46222) {
                                androidx.compose.runtime.ComposerKt.sourceInformation(composer4, "C316@13233L2758:BottomSheetScaffold.kt#jmzs0o");
                                if ((i46222 & 11) != 2 || !composer4.getSkipping()) {
                                    androidx.compose.runtime.State<java.lang.Float> offset = androidx.compose.material.BottomSheetScaffoldState.this.getBottomSheetState().getOffset();
                                    androidx.compose.material.BottomSheetState bottomSheetState = androidx.compose.material.BottomSheetScaffoldState.this.getBottomSheetState();
                                    kotlin.jvm.functions.Function2<androidx.compose.runtime.Composer, java.lang.Integer, kotlin.Unit> function210 = function28222;
                                    kotlin.jvm.functions.Function3<androidx.compose.foundation.layout.PaddingValues, androidx.compose.runtime.Composer, java.lang.Integer, kotlin.Unit> function37222 = content;
                                    final float f12222 = mo315toPx0680j_4;
                                    final androidx.compose.material.BottomSheetScaffoldState bottomSheetScaffoldState4222 = androidx.compose.material.BottomSheetScaffoldState.this;
                                    final boolean z6222 = z5222;
                                    final androidx.compose.ui.Modifier modifier6222 = companion2222;
                                    final float f132 = f10222;
                                    final androidx.compose.runtime.MutableState<java.lang.Float> mutableState2 = mutableState;
                                    final androidx.compose.ui.graphics.Shape shape7222 = shape6222;
                                    final long j30222 = j28222;
                                    final long j31222 = j29222;
                                    final float f14 = f11222;
                                    final int i47222 = i43222;
                                    final int i48 = i45222;
                                    final kotlin.jvm.functions.Function3<? super androidx.compose.foundation.layout.ColumnScope, ? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.Unit> function38 = sheetContent;
                                    androidx.compose.runtime.internal.ComposableLambda composableLambda2222 = androidx.compose.runtime.internal.ComposableLambdaKt.composableLambda(composer4, -1378534681, true, new kotlin.jvm.functions.Function3<java.lang.Integer, androidx.compose.runtime.Composer, java.lang.Integer, kotlin.Unit>() { // from class: androidx.compose.material.BottomSheetScaffoldKt$BottomSheetScaffold$child$1.1
                                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                        /* JADX WARN: Multi-variable type inference failed */
                                        {
                                            super(3);
                                        }

                                        @Override // kotlin.jvm.functions.Function3
                                        public /* bridge */ /* synthetic */ kotlin.Unit invoke(java.lang.Integer num, androidx.compose.runtime.Composer composer5, java.lang.Integer num2) {
                                            invoke(num.intValue(), composer5, num2.intValue());
                                            return kotlin.Unit.INSTANCE;
                                        }

                                        public final void invoke(int i49, androidx.compose.runtime.Composer composer5, int i50) {
                                            int i51;
                                            java.lang.Float m1258BottomSheetScaffold_bGncdBI$lambda4;
                                            java.lang.Float m1258BottomSheetScaffold_bGncdBI$lambda42;
                                            java.util.Map mapOf;
                                            androidx.compose.ui.Modifier.Companion m1521swipeablepPrIpRY;
                                            androidx.compose.runtime.ComposerKt.sourceInformation(composer5, "C354@15208L95,347@14851L711:BottomSheetScaffold.kt#jmzs0o");
                                            if ((i50 & 14) == 0) {
                                                i51 = i50 | (composer5.changed(i49) ? 4 : 2);
                                            } else {
                                                i51 = i50;
                                            }
                                            if ((i51 & 91) != 18 || !composer5.getSkipping()) {
                                                m1258BottomSheetScaffold_bGncdBI$lambda4 = androidx.compose.material.BottomSheetScaffoldKt.m1258BottomSheetScaffold_bGncdBI$lambda4(mutableState2);
                                                if (m1258BottomSheetScaffold_bGncdBI$lambda4 == null) {
                                                    m1521swipeablepPrIpRY = androidx.compose.ui.Modifier.INSTANCE;
                                                } else {
                                                    if (kotlin.math.MathKt.roundToInt(m1258BottomSheetScaffold_bGncdBI$lambda4.floatValue()) != kotlin.math.MathKt.roundToInt(f12222)) {
                                                        float f15 = i49;
                                                        m1258BottomSheetScaffold_bGncdBI$lambda42 = androidx.compose.material.BottomSheetScaffoldKt.m1258BottomSheetScaffold_bGncdBI$lambda4(mutableState2);
                                                        kotlin.jvm.internal.Intrinsics.checkNotNull(m1258BottomSheetScaffold_bGncdBI$lambda42);
                                                        mapOf = kotlin.collections.MapsKt.mapOf(kotlin.TuplesKt.to(java.lang.Float.valueOf(f15 - m1258BottomSheetScaffold_bGncdBI$lambda42.floatValue()), androidx.compose.material.BottomSheetValue.Expanded), kotlin.TuplesKt.to(java.lang.Float.valueOf(f15 - f12222), androidx.compose.material.BottomSheetValue.Collapsed));
                                                    } else {
                                                        mapOf = kotlin.collections.MapsKt.mapOf(kotlin.TuplesKt.to(java.lang.Float.valueOf(i49 - m1258BottomSheetScaffold_bGncdBI$lambda4.floatValue()), androidx.compose.material.BottomSheetValue.Collapsed));
                                                    }
                                                    m1521swipeablepPrIpRY = androidx.compose.material.SwipeableKt.m1521swipeablepPrIpRY(androidx.compose.ui.Modifier.INSTANCE, bottomSheetScaffoldState4222.getBottomSheetState(), r13, androidx.compose.foundation.gestures.Orientation.Vertical, (r26 & 8) != 0 ? true : z6222, (r26 & 16) != 0 ? false : false, (r26 & 32) != 0 ? null : null, (r26 & 64) != 0 ? new kotlin.jvm.functions.Function2<T, T, androidx.compose.material.FixedThreshold>() { // from class: androidx.compose.material.SwipeableKt$swipeable$1
                                                        /* JADX WARN: Can't rename method to resolve collision */
                                                        @Override // kotlin.jvm.functions.Function2
                                                        public final androidx.compose.material.FixedThreshold invoke(T t, T t2) {
                                                            return new androidx.compose.material.FixedThreshold(androidx.compose.ui.unit.Dp.m4478constructorimpl(56), null);
                                                        }
                                                    } : null, (r26 & 128) != 0 ? androidx.compose.material.SwipeableDefaults.resistanceConfig$default(androidx.compose.material.SwipeableDefaults.INSTANCE, mapOf.keySet(), 0.0f, 0.0f, 6, null) : null, (r26 & 256) != 0 ? androidx.compose.material.SwipeableDefaults.INSTANCE.m1520getVelocityThresholdD9Ej5fM() : 0.0f);
                                                }
                                                androidx.compose.ui.Modifier m608requiredHeightInVpY3zN4$default = androidx.compose.foundation.layout.SizeKt.m608requiredHeightInVpY3zN4$default(androidx.compose.foundation.layout.SizeKt.fillMaxWidth$default(androidx.compose.ui.input.nestedscroll.NestedScrollModifierKt.nestedScroll$default(androidx.compose.ui.Modifier.INSTANCE, bottomSheetScaffoldState4222.getBottomSheetState().getNestedScrollConnection(), null, 2, null).then(m1521swipeablepPrIpRY).then(modifier6222), 0.0f, 1, null), f132, 0.0f, 2, null);
                                                final androidx.compose.runtime.MutableState<java.lang.Float> mutableState3 = mutableState2;
                                                composer5.startReplaceableGroup(1157296644);
                                                androidx.compose.runtime.ComposerKt.sourceInformation(composer5, "C(remember)P(1):Composables.kt#9igjgp");
                                                boolean changed = composer5.changed(mutableState3);
                                                java.lang.Object rememberedValue3 = composer5.rememberedValue();
                                                if (changed || rememberedValue3 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                                                    rememberedValue3 = (kotlin.jvm.functions.Function1) new kotlin.jvm.functions.Function1<androidx.compose.ui.unit.IntSize, kotlin.Unit>() { // from class: androidx.compose.material.BottomSheetScaffoldKt$BottomSheetScaffold$child$1$1$1$1
                                                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                                        {
                                                            super(1);
                                                        }

                                                        @Override // kotlin.jvm.functions.Function1
                                                        public /* bridge */ /* synthetic */ kotlin.Unit invoke(androidx.compose.ui.unit.IntSize intSize) {
                                                            m1263invokeozmzZPI(intSize.getPackedValue());
                                                            return kotlin.Unit.INSTANCE;
                                                        }

                                                        /* renamed from: invoke-ozmzZPI, reason: not valid java name */
                                                        public final void m1263invokeozmzZPI(long j32222) {
                                                            mutableState3.setValue(java.lang.Float.valueOf(androidx.compose.ui.unit.IntSize.m4651getHeightimpl(j32222)));
                                                        }
                                                    };
                                                    composer5.updateRememberedValue(rememberedValue3);
                                                }
                                                composer5.endReplaceableGroup();
                                                androidx.compose.ui.Modifier onSizeChanged = androidx.compose.ui.layout.OnRemeasuredModifierKt.onSizeChanged(m608requiredHeightInVpY3zN4$default, (kotlin.jvm.functions.Function1) rememberedValue3);
                                                androidx.compose.ui.graphics.Shape shape82 = shape7222;
                                                long j32222 = j30222;
                                                long j332 = j31222;
                                                float f16 = f14;
                                                final kotlin.jvm.functions.Function3<? super androidx.compose.foundation.layout.ColumnScope, ? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.Unit> function39 = function38;
                                                final int i52 = i47222;
                                                androidx.compose.runtime.internal.ComposableLambda composableLambda3 = androidx.compose.runtime.internal.ComposableLambdaKt.composableLambda(composer5, -698903261, true, new kotlin.jvm.functions.Function2<androidx.compose.runtime.Composer, java.lang.Integer, kotlin.Unit>() { // from class: androidx.compose.material.BottomSheetScaffoldKt.BottomSheetScaffold.child.1.1.2
                                                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                                    /* JADX WARN: Multi-variable type inference failed */
                                                    {
                                                        super(2);
                                                    }

                                                    @Override // kotlin.jvm.functions.Function2
                                                    public /* bridge */ /* synthetic */ kotlin.Unit invoke(androidx.compose.runtime.Composer composer6, java.lang.Integer num) {
                                                        invoke(composer6, num.intValue());
                                                        return kotlin.Unit.INSTANCE;
                                                    }

                                                    public final void invoke(androidx.compose.runtime.Composer composer6, int i53) {
                                                        androidx.compose.runtime.ComposerKt.sourceInformation(composer6, "C361@15529L30:BottomSheetScaffold.kt#jmzs0o");
                                                        if ((i53 & 11) == 2 && composer6.getSkipping()) {
                                                            composer6.skipToGroupEnd();
                                                            return;
                                                        }
                                                        kotlin.jvm.functions.Function3<androidx.compose.foundation.layout.ColumnScope, androidx.compose.runtime.Composer, java.lang.Integer, kotlin.Unit> function310 = function39;
                                                        int i54 = (i52 << 9) & 7168;
                                                        composer6.startReplaceableGroup(-483455358);
                                                        androidx.compose.runtime.ComposerKt.sourceInformation(composer6, "C(Column)P(2,3,1)77@3880L61,78@3946L133:Column.kt#2w3rfo");
                                                        androidx.compose.ui.Modifier.Companion companion3 = androidx.compose.ui.Modifier.INSTANCE;
                                                        androidx.compose.ui.layout.MeasurePolicy columnMeasurePolicy = androidx.compose.foundation.layout.ColumnKt.columnMeasurePolicy(androidx.compose.foundation.layout.Arrangement.INSTANCE.getTop(), androidx.compose.ui.Alignment.INSTANCE.getStart(), composer6, 0);
                                                        composer6.startReplaceableGroup(-1323940314);
                                                        androidx.compose.runtime.ComposerKt.sourceInformation(composer6, "C(Layout)P(!1,2)74@2915L7,75@2970L7,76@3029L7,77@3041L460:Layout.kt#80mrfh");
                                                        androidx.compose.runtime.ProvidableCompositionLocal<androidx.compose.ui.unit.Density> localDensity2222 = androidx.compose.ui.platform.CompositionLocalsKt.getLocalDensity();
                                                        androidx.compose.runtime.ComposerKt.sourceInformationMarkerStart(composer6, 2023513938, "C:CompositionLocal.kt#9igjgp");
                                                        java.lang.Object consume2222 = composer6.consume(localDensity2222);
                                                        androidx.compose.runtime.ComposerKt.sourceInformationMarkerEnd(composer6);
                                                        androidx.compose.ui.unit.Density density = (androidx.compose.ui.unit.Density) consume2222;
                                                        androidx.compose.runtime.ProvidableCompositionLocal<androidx.compose.ui.unit.LayoutDirection> localLayoutDirection = androidx.compose.ui.platform.CompositionLocalsKt.getLocalLayoutDirection();
                                                        androidx.compose.runtime.ComposerKt.sourceInformationMarkerStart(composer6, 2023513938, "C:CompositionLocal.kt#9igjgp");
                                                        java.lang.Object consume3 = composer6.consume(localLayoutDirection);
                                                        androidx.compose.runtime.ComposerKt.sourceInformationMarkerEnd(composer6);
                                                        androidx.compose.ui.unit.LayoutDirection layoutDirection = (androidx.compose.ui.unit.LayoutDirection) consume3;
                                                        androidx.compose.runtime.ProvidableCompositionLocal<androidx.compose.ui.platform.ViewConfiguration> localViewConfiguration = androidx.compose.ui.platform.CompositionLocalsKt.getLocalViewConfiguration();
                                                        androidx.compose.runtime.ComposerKt.sourceInformationMarkerStart(composer6, 2023513938, "C:CompositionLocal.kt#9igjgp");
                                                        java.lang.Object consume4 = composer6.consume(localViewConfiguration);
                                                        androidx.compose.runtime.ComposerKt.sourceInformationMarkerEnd(composer6);
                                                        androidx.compose.ui.platform.ViewConfiguration viewConfiguration = (androidx.compose.ui.platform.ViewConfiguration) consume4;
                                                        kotlin.jvm.functions.Function0<androidx.compose.ui.node.ComposeUiNode> constructor = androidx.compose.ui.node.ComposeUiNode.INSTANCE.getConstructor();
                                                        kotlin.jvm.functions.Function3<androidx.compose.runtime.SkippableUpdater<androidx.compose.ui.node.ComposeUiNode>, androidx.compose.runtime.Composer, java.lang.Integer, kotlin.Unit> materializerOf = androidx.compose.ui.layout.LayoutKt.materializerOf(companion3);
                                                        if (!(composer6.getApplier() instanceof androidx.compose.runtime.Applier)) {
                                                            androidx.compose.runtime.ComposablesKt.invalidApplier();
                                                        }
                                                        composer6.startReusableNode();
                                                        if (composer6.getInserting()) {
                                                            composer6.createNode(constructor);
                                                        } else {
                                                            composer6.useNode();
                                                        }
                                                        composer6.disableReusing();
                                                        androidx.compose.runtime.Composer m1641constructorimpl = androidx.compose.runtime.Updater.m1641constructorimpl(composer6);
                                                        androidx.compose.runtime.Updater.m1648setimpl(m1641constructorimpl, columnMeasurePolicy, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetMeasurePolicy());
                                                        androidx.compose.runtime.Updater.m1648setimpl(m1641constructorimpl, density, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetDensity());
                                                        androidx.compose.runtime.Updater.m1648setimpl(m1641constructorimpl, layoutDirection, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetLayoutDirection());
                                                        androidx.compose.runtime.Updater.m1648setimpl(m1641constructorimpl, viewConfiguration, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetViewConfiguration());
                                                        composer6.enableReusing();
                                                        materializerOf.invoke(androidx.compose.runtime.SkippableUpdater.m1632boximpl(androidx.compose.runtime.SkippableUpdater.m1633constructorimpl(composer6)), composer6, 0);
                                                        composer6.startReplaceableGroup(2058660585);
                                                        composer6.startReplaceableGroup(-1163856341);
                                                        androidx.compose.runtime.ComposerKt.sourceInformation(composer6, "C79@3994L9:Column.kt#2w3rfo");
                                                        function310.invoke(androidx.compose.foundation.layout.ColumnScopeInstance.INSTANCE, composer6, java.lang.Integer.valueOf(((i54 >> 6) & 112) | 6));
                                                        composer6.endReplaceableGroup();
                                                        composer6.endReplaceableGroup();
                                                        composer6.endNode();
                                                        composer6.endReplaceableGroup();
                                                        composer6.endReplaceableGroup();
                                                    }
                                                });
                                                int i53 = i47222;
                                                int i54 = i48;
                                                androidx.compose.material.SurfaceKt.m1511SurfaceFjzlyU(onSizeChanged, shape82, j32222, j332, null, f16, composableLambda3, composer5, ((i53 >> 21) & 112) | 1572864 | ((i54 << 6) & 896) | ((i54 << 6) & 7168) | ((i53 >> 12) & 458752), 16);
                                                return;
                                            }
                                            composer5.skipToGroupEnd();
                                        }
                                    });
                                    kotlin.jvm.functions.Function2<androidx.compose.runtime.Composer, java.lang.Integer, kotlin.Unit> function211 = function29222;
                                    final kotlin.jvm.functions.Function3<? super androidx.compose.material.SnackbarHostState, ? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.Unit> function39 = function36222;
                                    final androidx.compose.material.BottomSheetScaffoldState bottomSheetScaffoldState52 = androidx.compose.material.BottomSheetScaffoldState.this;
                                    final int i49 = i43222;
                                    androidx.compose.runtime.internal.ComposableLambda composableLambda3 = androidx.compose.runtime.internal.ComposableLambdaKt.composableLambda(composer4, -486138068, true, new kotlin.jvm.functions.Function2<androidx.compose.runtime.Composer, java.lang.Integer, kotlin.Unit>() { // from class: androidx.compose.material.BottomSheetScaffoldKt$BottomSheetScaffold$child$1.2
                                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                        /* JADX WARN: Multi-variable type inference failed */
                                        {
                                            super(2);
                                        }

                                        @Override // kotlin.jvm.functions.Function2
                                        public /* bridge */ /* synthetic */ kotlin.Unit invoke(androidx.compose.runtime.Composer composer5, java.lang.Integer num) {
                                            invoke(composer5, num.intValue());
                                            return kotlin.Unit.INSTANCE;
                                        }

                                        public final void invoke(androidx.compose.runtime.Composer composer5, int i50) {
                                            androidx.compose.runtime.ComposerKt.sourceInformation(composer5, "C365@15680L45:BottomSheetScaffold.kt#jmzs0o");
                                            if ((i50 & 11) == 2 && composer5.getSkipping()) {
                                                composer5.skipToGroupEnd();
                                            } else {
                                                function39.invoke(bottomSheetScaffoldState52.getSnackbarHostState(), composer5, java.lang.Integer.valueOf((i49 >> 9) & 112));
                                            }
                                        }
                                    });
                                    float f15 = f10222;
                                    int i50 = i42222;
                                    int i51 = i43222;
                                    androidx.compose.material.BottomSheetScaffoldKt.m1257BottomSheetScaffoldLayoutKCBPh4w(function210, function37222, composableLambda2222, function211, composableLambda3, f15, i50, offset, bottomSheetState, composer4, ((i51 >> 9) & 14) | 24960 | ((i44222 >> 3) & 112) | ((i51 >> 6) & 7168) | ((i45222 << 9) & 458752) | (i51 & 3670016));
                                    return;
                                }
                                composer4.skipToGroupEnd();
                            }
                        });
                        androidx.compose.ui.Modifier modifier6222 = modifier3;
                        final kotlin.jvm.functions.Function3<? super androidx.compose.foundation.layout.ColumnScope, ? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.Unit> function37222 = function34;
                        final androidx.compose.material.BottomSheetScaffoldState bottomSheetScaffoldState4222 = bottomSheetScaffoldState2;
                        final boolean z6222 = z4;
                        final androidx.compose.ui.graphics.Shape shape7222 = shape4;
                        final float f12222 = f6;
                        final long j30222 = j17;
                        final long j31222 = j13;
                        final long j32222 = j20;
                        final int i46222 = i21;
                        int i47222 = i33 << 6;
                        androidx.compose.material.SurfaceKt.m1511SurfaceFjzlyU(androidx.compose.foundation.layout.SizeKt.fillMaxSize$default(modifier6222, 0.0f, 1, null), null, j19, j18, null, 0.0f, androidx.compose.runtime.internal.ComposableLambdaKt.composableLambda(composer3, 1273816607, true, new kotlin.jvm.functions.Function2<androidx.compose.runtime.Composer, java.lang.Integer, kotlin.Unit>() { // from class: androidx.compose.material.BottomSheetScaffoldKt$BottomSheetScaffold$1
                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            /* JADX WARN: Multi-variable type inference failed */
                            {
                                super(2);
                            }

                            @Override // kotlin.jvm.functions.Function2
                            public /* bridge */ /* synthetic */ kotlin.Unit invoke(androidx.compose.runtime.Composer composer4, java.lang.Integer num) {
                                invoke(composer4, num.intValue());
                                return kotlin.Unit.INSTANCE;
                            }

                            public final void invoke(androidx.compose.runtime.Composer composer4, int i48) {
                                androidx.compose.runtime.ComposerKt.sourceInformation(composer4, "C:BottomSheetScaffold.kt#jmzs0o");
                                if ((i48 & 11) != 2 || !composer4.getSkipping()) {
                                    if (function37222 == null) {
                                        composer4.startReplaceableGroup(-249544858);
                                        androidx.compose.runtime.ComposerKt.sourceInformation(composer4, "381@16183L7");
                                        composableLambda222.invoke(composer4, 6);
                                        composer4.endReplaceableGroup();
                                        return;
                                    }
                                    composer4.startReplaceableGroup(-249544821);
                                    androidx.compose.runtime.ComposerKt.sourceInformation(composer4, "383@16220L480");
                                    kotlin.jvm.functions.Function3<androidx.compose.foundation.layout.ColumnScope, androidx.compose.runtime.Composer, java.lang.Integer, kotlin.Unit> function38 = function37222;
                                    androidx.compose.material.DrawerState drawerState = bottomSheetScaffoldState4222.getDrawerState();
                                    boolean z72 = z6222;
                                    androidx.compose.ui.graphics.Shape shape82 = shape7222;
                                    float f132 = f12222;
                                    long j332 = j30222;
                                    long j34 = j31222;
                                    long j35 = j32222;
                                    kotlin.jvm.functions.Function2<androidx.compose.runtime.Composer, java.lang.Integer, kotlin.Unit> function210 = composableLambda222;
                                    int i49 = i46222;
                                    androidx.compose.material.DrawerKt.m1364ModalDrawerGs3lGvM(function38, null, drawerState, z72, shape82, f132, j332, j34, j35, function210, composer4, ((i49 >> 3) & 7168) | ((i49 >> 9) & 14) | 805306368 | ((i49 >> 3) & 57344) | ((i49 >> 3) & 458752) | ((i49 >> 3) & 3670016) | ((i49 >> 3) & 29360128) | ((i49 >> 3) & 234881024), 2);
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
                    kotlin.jvm.functions.Function2<? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.Unit> function272222 = function26;
                    if ((i5 & 2048) == 0) {
                    }
                    if (i16 == 0) {
                    }
                    if (i25 == 0) {
                    }
                    if (i27 == 0) {
                    }
                    float f92222 = m1255getSheetPeekHeightD9Ej5fM;
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
                    androidx.compose.runtime.ComposerKt.sourceInformation(startRestartGroup, "C(rememberCoroutineScope)475@19849L144:Effects.kt#9igjgp");
                    startRestartGroup.startReplaceableGroup(-492369756);
                    androidx.compose.runtime.ComposerKt.sourceInformation(startRestartGroup, "C(remember):Composables.kt#9igjgp");
                    rememberedValue = startRestartGroup.rememberedValue();
                    if (rememberedValue == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                    }
                    startRestartGroup.endReplaceableGroup();
                    final kotlinx.coroutines.CoroutineScope coroutineScope2222 = ((androidx.compose.runtime.CompositionScopedCoroutineScopeCanceller) rememberedValue).getCoroutineScope();
                    startRestartGroup.endReplaceableGroup();
                    androidx.compose.runtime.ProvidableCompositionLocal<androidx.compose.ui.unit.Density> localDensity2222 = androidx.compose.ui.platform.CompositionLocalsKt.getLocalDensity();
                    androidx.compose.runtime.ComposerKt.sourceInformationMarkerStart(startRestartGroup, 2023513938, "C:CompositionLocal.kt#9igjgp");
                    java.lang.Object consume2222 = startRestartGroup.consume(localDensity2222);
                    androidx.compose.runtime.ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                    mo315toPx0680j_4 = ((androidx.compose.ui.unit.Density) consume2222).mo315toPx0680j_4(f5);
                    startRestartGroup.startReplaceableGroup(-492369756);
                    androidx.compose.runtime.ComposerKt.sourceInformation(startRestartGroup, "C(remember):Composables.kt#9igjgp");
                    rememberedValue2 = startRestartGroup.rememberedValue();
                    if (rememberedValue2 != androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                    }
                    startRestartGroup.endReplaceableGroup();
                    mutableState = (androidx.compose.runtime.MutableState) obj;
                    if (kotlin.jvm.internal.Intrinsics.areEqual(mo315toPx0680j_4, m1258BottomSheetScaffold_bGncdBI$lambda4(mutableState))) {
                    }
                    final androidx.compose.material.BottomSheetScaffoldState bottomSheetScaffoldState32222 = bottomSheetScaffoldState2;
                    final kotlin.jvm.functions.Function2<? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.Unit> function282222 = function24;
                    final kotlin.jvm.functions.Function2<? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.Unit> function292222 = function23;
                    final float f102222 = f5;
                    final int i422222 = m1403getEnd5ygKITE;
                    final int i432222 = i32;
                    final int i442222 = i33;
                    final int i452222 = i21;
                    final boolean z52222 = z3;
                    final androidx.compose.ui.Modifier companion22222 = companion;
                    final androidx.compose.ui.graphics.Shape shape62222 = cornerBasedShape;
                    final long j282222 = j11;
                    final long j292222 = j10;
                    final float f112222 = m1254getSheetElevationD9Ej5fM;
                    final kotlin.jvm.functions.Function3<? super androidx.compose.material.SnackbarHostState, ? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.Unit> function362222 = m1340getLambda1$material_release;
                    composer3 = composer2;
                    final kotlin.jvm.functions.Function2<? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.Unit> composableLambda2222 = androidx.compose.runtime.internal.ComposableLambdaKt.composableLambda(composer3, 893101063, true, new kotlin.jvm.functions.Function2<androidx.compose.runtime.Composer, java.lang.Integer, kotlin.Unit>() { // from class: androidx.compose.material.BottomSheetScaffoldKt$BottomSheetScaffold$child$1
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        /* JADX WARN: Multi-variable type inference failed */
                        {
                            super(2);
                        }

                        @Override // kotlin.jvm.functions.Function2
                        public /* bridge */ /* synthetic */ kotlin.Unit invoke(androidx.compose.runtime.Composer composer4, java.lang.Integer num) {
                            invoke(composer4, num.intValue());
                            return kotlin.Unit.INSTANCE;
                        }

                        public final void invoke(androidx.compose.runtime.Composer composer4, int i462222) {
                            androidx.compose.runtime.ComposerKt.sourceInformation(composer4, "C316@13233L2758:BottomSheetScaffold.kt#jmzs0o");
                            if ((i462222 & 11) != 2 || !composer4.getSkipping()) {
                                androidx.compose.runtime.State<java.lang.Float> offset = androidx.compose.material.BottomSheetScaffoldState.this.getBottomSheetState().getOffset();
                                androidx.compose.material.BottomSheetState bottomSheetState = androidx.compose.material.BottomSheetScaffoldState.this.getBottomSheetState();
                                kotlin.jvm.functions.Function2<androidx.compose.runtime.Composer, java.lang.Integer, kotlin.Unit> function210 = function282222;
                                kotlin.jvm.functions.Function3<androidx.compose.foundation.layout.PaddingValues, androidx.compose.runtime.Composer, java.lang.Integer, kotlin.Unit> function372222 = content;
                                final float f122222 = mo315toPx0680j_4;
                                final androidx.compose.material.BottomSheetScaffoldState bottomSheetScaffoldState42222 = androidx.compose.material.BottomSheetScaffoldState.this;
                                final boolean z62222 = z52222;
                                final androidx.compose.ui.Modifier modifier62222 = companion22222;
                                final float f132 = f102222;
                                final androidx.compose.runtime.MutableState<java.lang.Float> mutableState2 = mutableState;
                                final androidx.compose.ui.graphics.Shape shape72222 = shape62222;
                                final long j302222 = j282222;
                                final long j312222 = j292222;
                                final float f14 = f112222;
                                final int i472222 = i432222;
                                final int i48 = i452222;
                                final kotlin.jvm.functions.Function3<? super androidx.compose.foundation.layout.ColumnScope, ? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.Unit> function38 = sheetContent;
                                androidx.compose.runtime.internal.ComposableLambda composableLambda22222 = androidx.compose.runtime.internal.ComposableLambdaKt.composableLambda(composer4, -1378534681, true, new kotlin.jvm.functions.Function3<java.lang.Integer, androidx.compose.runtime.Composer, java.lang.Integer, kotlin.Unit>() { // from class: androidx.compose.material.BottomSheetScaffoldKt$BottomSheetScaffold$child$1.1
                                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                    /* JADX WARN: Multi-variable type inference failed */
                                    {
                                        super(3);
                                    }

                                    @Override // kotlin.jvm.functions.Function3
                                    public /* bridge */ /* synthetic */ kotlin.Unit invoke(java.lang.Integer num, androidx.compose.runtime.Composer composer5, java.lang.Integer num2) {
                                        invoke(num.intValue(), composer5, num2.intValue());
                                        return kotlin.Unit.INSTANCE;
                                    }

                                    public final void invoke(int i49, androidx.compose.runtime.Composer composer5, int i50) {
                                        int i51;
                                        java.lang.Float m1258BottomSheetScaffold_bGncdBI$lambda4;
                                        java.lang.Float m1258BottomSheetScaffold_bGncdBI$lambda42;
                                        java.util.Map mapOf;
                                        androidx.compose.ui.Modifier.Companion m1521swipeablepPrIpRY;
                                        androidx.compose.runtime.ComposerKt.sourceInformation(composer5, "C354@15208L95,347@14851L711:BottomSheetScaffold.kt#jmzs0o");
                                        if ((i50 & 14) == 0) {
                                            i51 = i50 | (composer5.changed(i49) ? 4 : 2);
                                        } else {
                                            i51 = i50;
                                        }
                                        if ((i51 & 91) != 18 || !composer5.getSkipping()) {
                                            m1258BottomSheetScaffold_bGncdBI$lambda4 = androidx.compose.material.BottomSheetScaffoldKt.m1258BottomSheetScaffold_bGncdBI$lambda4(mutableState2);
                                            if (m1258BottomSheetScaffold_bGncdBI$lambda4 == null) {
                                                m1521swipeablepPrIpRY = androidx.compose.ui.Modifier.INSTANCE;
                                            } else {
                                                if (kotlin.math.MathKt.roundToInt(m1258BottomSheetScaffold_bGncdBI$lambda4.floatValue()) != kotlin.math.MathKt.roundToInt(f122222)) {
                                                    float f15 = i49;
                                                    m1258BottomSheetScaffold_bGncdBI$lambda42 = androidx.compose.material.BottomSheetScaffoldKt.m1258BottomSheetScaffold_bGncdBI$lambda4(mutableState2);
                                                    kotlin.jvm.internal.Intrinsics.checkNotNull(m1258BottomSheetScaffold_bGncdBI$lambda42);
                                                    mapOf = kotlin.collections.MapsKt.mapOf(kotlin.TuplesKt.to(java.lang.Float.valueOf(f15 - m1258BottomSheetScaffold_bGncdBI$lambda42.floatValue()), androidx.compose.material.BottomSheetValue.Expanded), kotlin.TuplesKt.to(java.lang.Float.valueOf(f15 - f122222), androidx.compose.material.BottomSheetValue.Collapsed));
                                                } else {
                                                    mapOf = kotlin.collections.MapsKt.mapOf(kotlin.TuplesKt.to(java.lang.Float.valueOf(i49 - m1258BottomSheetScaffold_bGncdBI$lambda4.floatValue()), androidx.compose.material.BottomSheetValue.Collapsed));
                                                }
                                                m1521swipeablepPrIpRY = androidx.compose.material.SwipeableKt.m1521swipeablepPrIpRY(androidx.compose.ui.Modifier.INSTANCE, bottomSheetScaffoldState42222.getBottomSheetState(), r13, androidx.compose.foundation.gestures.Orientation.Vertical, (r26 & 8) != 0 ? true : z62222, (r26 & 16) != 0 ? false : false, (r26 & 32) != 0 ? null : null, (r26 & 64) != 0 ? new kotlin.jvm.functions.Function2<T, T, androidx.compose.material.FixedThreshold>() { // from class: androidx.compose.material.SwipeableKt$swipeable$1
                                                    /* JADX WARN: Can't rename method to resolve collision */
                                                    @Override // kotlin.jvm.functions.Function2
                                                    public final androidx.compose.material.FixedThreshold invoke(T t, T t2) {
                                                        return new androidx.compose.material.FixedThreshold(androidx.compose.ui.unit.Dp.m4478constructorimpl(56), null);
                                                    }
                                                } : null, (r26 & 128) != 0 ? androidx.compose.material.SwipeableDefaults.resistanceConfig$default(androidx.compose.material.SwipeableDefaults.INSTANCE, mapOf.keySet(), 0.0f, 0.0f, 6, null) : null, (r26 & 256) != 0 ? androidx.compose.material.SwipeableDefaults.INSTANCE.m1520getVelocityThresholdD9Ej5fM() : 0.0f);
                                            }
                                            androidx.compose.ui.Modifier m608requiredHeightInVpY3zN4$default = androidx.compose.foundation.layout.SizeKt.m608requiredHeightInVpY3zN4$default(androidx.compose.foundation.layout.SizeKt.fillMaxWidth$default(androidx.compose.ui.input.nestedscroll.NestedScrollModifierKt.nestedScroll$default(androidx.compose.ui.Modifier.INSTANCE, bottomSheetScaffoldState42222.getBottomSheetState().getNestedScrollConnection(), null, 2, null).then(m1521swipeablepPrIpRY).then(modifier62222), 0.0f, 1, null), f132, 0.0f, 2, null);
                                            final androidx.compose.runtime.MutableState<java.lang.Float> mutableState3 = mutableState2;
                                            composer5.startReplaceableGroup(1157296644);
                                            androidx.compose.runtime.ComposerKt.sourceInformation(composer5, "C(remember)P(1):Composables.kt#9igjgp");
                                            boolean changed = composer5.changed(mutableState3);
                                            java.lang.Object rememberedValue3 = composer5.rememberedValue();
                                            if (changed || rememberedValue3 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                                                rememberedValue3 = (kotlin.jvm.functions.Function1) new kotlin.jvm.functions.Function1<androidx.compose.ui.unit.IntSize, kotlin.Unit>() { // from class: androidx.compose.material.BottomSheetScaffoldKt$BottomSheetScaffold$child$1$1$1$1
                                                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                                    {
                                                        super(1);
                                                    }

                                                    @Override // kotlin.jvm.functions.Function1
                                                    public /* bridge */ /* synthetic */ kotlin.Unit invoke(androidx.compose.ui.unit.IntSize intSize) {
                                                        m1263invokeozmzZPI(intSize.getPackedValue());
                                                        return kotlin.Unit.INSTANCE;
                                                    }

                                                    /* renamed from: invoke-ozmzZPI, reason: not valid java name */
                                                    public final void m1263invokeozmzZPI(long j322222) {
                                                        mutableState3.setValue(java.lang.Float.valueOf(androidx.compose.ui.unit.IntSize.m4651getHeightimpl(j322222)));
                                                    }
                                                };
                                                composer5.updateRememberedValue(rememberedValue3);
                                            }
                                            composer5.endReplaceableGroup();
                                            androidx.compose.ui.Modifier onSizeChanged = androidx.compose.ui.layout.OnRemeasuredModifierKt.onSizeChanged(m608requiredHeightInVpY3zN4$default, (kotlin.jvm.functions.Function1) rememberedValue3);
                                            androidx.compose.ui.graphics.Shape shape82 = shape72222;
                                            long j322222 = j302222;
                                            long j332 = j312222;
                                            float f16 = f14;
                                            final kotlin.jvm.functions.Function3<? super androidx.compose.foundation.layout.ColumnScope, ? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.Unit> function39 = function38;
                                            final int i52 = i472222;
                                            androidx.compose.runtime.internal.ComposableLambda composableLambda3 = androidx.compose.runtime.internal.ComposableLambdaKt.composableLambda(composer5, -698903261, true, new kotlin.jvm.functions.Function2<androidx.compose.runtime.Composer, java.lang.Integer, kotlin.Unit>() { // from class: androidx.compose.material.BottomSheetScaffoldKt.BottomSheetScaffold.child.1.1.2
                                                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                                /* JADX WARN: Multi-variable type inference failed */
                                                {
                                                    super(2);
                                                }

                                                @Override // kotlin.jvm.functions.Function2
                                                public /* bridge */ /* synthetic */ kotlin.Unit invoke(androidx.compose.runtime.Composer composer6, java.lang.Integer num) {
                                                    invoke(composer6, num.intValue());
                                                    return kotlin.Unit.INSTANCE;
                                                }

                                                public final void invoke(androidx.compose.runtime.Composer composer6, int i53) {
                                                    androidx.compose.runtime.ComposerKt.sourceInformation(composer6, "C361@15529L30:BottomSheetScaffold.kt#jmzs0o");
                                                    if ((i53 & 11) == 2 && composer6.getSkipping()) {
                                                        composer6.skipToGroupEnd();
                                                        return;
                                                    }
                                                    kotlin.jvm.functions.Function3<androidx.compose.foundation.layout.ColumnScope, androidx.compose.runtime.Composer, java.lang.Integer, kotlin.Unit> function310 = function39;
                                                    int i54 = (i52 << 9) & 7168;
                                                    composer6.startReplaceableGroup(-483455358);
                                                    androidx.compose.runtime.ComposerKt.sourceInformation(composer6, "C(Column)P(2,3,1)77@3880L61,78@3946L133:Column.kt#2w3rfo");
                                                    androidx.compose.ui.Modifier.Companion companion3 = androidx.compose.ui.Modifier.INSTANCE;
                                                    androidx.compose.ui.layout.MeasurePolicy columnMeasurePolicy = androidx.compose.foundation.layout.ColumnKt.columnMeasurePolicy(androidx.compose.foundation.layout.Arrangement.INSTANCE.getTop(), androidx.compose.ui.Alignment.INSTANCE.getStart(), composer6, 0);
                                                    composer6.startReplaceableGroup(-1323940314);
                                                    androidx.compose.runtime.ComposerKt.sourceInformation(composer6, "C(Layout)P(!1,2)74@2915L7,75@2970L7,76@3029L7,77@3041L460:Layout.kt#80mrfh");
                                                    androidx.compose.runtime.ProvidableCompositionLocal<androidx.compose.ui.unit.Density> localDensity22222 = androidx.compose.ui.platform.CompositionLocalsKt.getLocalDensity();
                                                    androidx.compose.runtime.ComposerKt.sourceInformationMarkerStart(composer6, 2023513938, "C:CompositionLocal.kt#9igjgp");
                                                    java.lang.Object consume22222 = composer6.consume(localDensity22222);
                                                    androidx.compose.runtime.ComposerKt.sourceInformationMarkerEnd(composer6);
                                                    androidx.compose.ui.unit.Density density = (androidx.compose.ui.unit.Density) consume22222;
                                                    androidx.compose.runtime.ProvidableCompositionLocal<androidx.compose.ui.unit.LayoutDirection> localLayoutDirection = androidx.compose.ui.platform.CompositionLocalsKt.getLocalLayoutDirection();
                                                    androidx.compose.runtime.ComposerKt.sourceInformationMarkerStart(composer6, 2023513938, "C:CompositionLocal.kt#9igjgp");
                                                    java.lang.Object consume3 = composer6.consume(localLayoutDirection);
                                                    androidx.compose.runtime.ComposerKt.sourceInformationMarkerEnd(composer6);
                                                    androidx.compose.ui.unit.LayoutDirection layoutDirection = (androidx.compose.ui.unit.LayoutDirection) consume3;
                                                    androidx.compose.runtime.ProvidableCompositionLocal<androidx.compose.ui.platform.ViewConfiguration> localViewConfiguration = androidx.compose.ui.platform.CompositionLocalsKt.getLocalViewConfiguration();
                                                    androidx.compose.runtime.ComposerKt.sourceInformationMarkerStart(composer6, 2023513938, "C:CompositionLocal.kt#9igjgp");
                                                    java.lang.Object consume4 = composer6.consume(localViewConfiguration);
                                                    androidx.compose.runtime.ComposerKt.sourceInformationMarkerEnd(composer6);
                                                    androidx.compose.ui.platform.ViewConfiguration viewConfiguration = (androidx.compose.ui.platform.ViewConfiguration) consume4;
                                                    kotlin.jvm.functions.Function0<androidx.compose.ui.node.ComposeUiNode> constructor = androidx.compose.ui.node.ComposeUiNode.INSTANCE.getConstructor();
                                                    kotlin.jvm.functions.Function3<androidx.compose.runtime.SkippableUpdater<androidx.compose.ui.node.ComposeUiNode>, androidx.compose.runtime.Composer, java.lang.Integer, kotlin.Unit> materializerOf = androidx.compose.ui.layout.LayoutKt.materializerOf(companion3);
                                                    if (!(composer6.getApplier() instanceof androidx.compose.runtime.Applier)) {
                                                        androidx.compose.runtime.ComposablesKt.invalidApplier();
                                                    }
                                                    composer6.startReusableNode();
                                                    if (composer6.getInserting()) {
                                                        composer6.createNode(constructor);
                                                    } else {
                                                        composer6.useNode();
                                                    }
                                                    composer6.disableReusing();
                                                    androidx.compose.runtime.Composer m1641constructorimpl = androidx.compose.runtime.Updater.m1641constructorimpl(composer6);
                                                    androidx.compose.runtime.Updater.m1648setimpl(m1641constructorimpl, columnMeasurePolicy, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetMeasurePolicy());
                                                    androidx.compose.runtime.Updater.m1648setimpl(m1641constructorimpl, density, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetDensity());
                                                    androidx.compose.runtime.Updater.m1648setimpl(m1641constructorimpl, layoutDirection, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetLayoutDirection());
                                                    androidx.compose.runtime.Updater.m1648setimpl(m1641constructorimpl, viewConfiguration, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetViewConfiguration());
                                                    composer6.enableReusing();
                                                    materializerOf.invoke(androidx.compose.runtime.SkippableUpdater.m1632boximpl(androidx.compose.runtime.SkippableUpdater.m1633constructorimpl(composer6)), composer6, 0);
                                                    composer6.startReplaceableGroup(2058660585);
                                                    composer6.startReplaceableGroup(-1163856341);
                                                    androidx.compose.runtime.ComposerKt.sourceInformation(composer6, "C79@3994L9:Column.kt#2w3rfo");
                                                    function310.invoke(androidx.compose.foundation.layout.ColumnScopeInstance.INSTANCE, composer6, java.lang.Integer.valueOf(((i54 >> 6) & 112) | 6));
                                                    composer6.endReplaceableGroup();
                                                    composer6.endReplaceableGroup();
                                                    composer6.endNode();
                                                    composer6.endReplaceableGroup();
                                                    composer6.endReplaceableGroup();
                                                }
                                            });
                                            int i53 = i472222;
                                            int i54 = i48;
                                            androidx.compose.material.SurfaceKt.m1511SurfaceFjzlyU(onSizeChanged, shape82, j322222, j332, null, f16, composableLambda3, composer5, ((i53 >> 21) & 112) | 1572864 | ((i54 << 6) & 896) | ((i54 << 6) & 7168) | ((i53 >> 12) & 458752), 16);
                                            return;
                                        }
                                        composer5.skipToGroupEnd();
                                    }
                                });
                                kotlin.jvm.functions.Function2<androidx.compose.runtime.Composer, java.lang.Integer, kotlin.Unit> function211 = function292222;
                                final kotlin.jvm.functions.Function3<? super androidx.compose.material.SnackbarHostState, ? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.Unit> function39 = function362222;
                                final androidx.compose.material.BottomSheetScaffoldState bottomSheetScaffoldState52 = androidx.compose.material.BottomSheetScaffoldState.this;
                                final int i49 = i432222;
                                androidx.compose.runtime.internal.ComposableLambda composableLambda3 = androidx.compose.runtime.internal.ComposableLambdaKt.composableLambda(composer4, -486138068, true, new kotlin.jvm.functions.Function2<androidx.compose.runtime.Composer, java.lang.Integer, kotlin.Unit>() { // from class: androidx.compose.material.BottomSheetScaffoldKt$BottomSheetScaffold$child$1.2
                                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                    /* JADX WARN: Multi-variable type inference failed */
                                    {
                                        super(2);
                                    }

                                    @Override // kotlin.jvm.functions.Function2
                                    public /* bridge */ /* synthetic */ kotlin.Unit invoke(androidx.compose.runtime.Composer composer5, java.lang.Integer num) {
                                        invoke(composer5, num.intValue());
                                        return kotlin.Unit.INSTANCE;
                                    }

                                    public final void invoke(androidx.compose.runtime.Composer composer5, int i50) {
                                        androidx.compose.runtime.ComposerKt.sourceInformation(composer5, "C365@15680L45:BottomSheetScaffold.kt#jmzs0o");
                                        if ((i50 & 11) == 2 && composer5.getSkipping()) {
                                            composer5.skipToGroupEnd();
                                        } else {
                                            function39.invoke(bottomSheetScaffoldState52.getSnackbarHostState(), composer5, java.lang.Integer.valueOf((i49 >> 9) & 112));
                                        }
                                    }
                                });
                                float f15 = f102222;
                                int i50 = i422222;
                                int i51 = i432222;
                                androidx.compose.material.BottomSheetScaffoldKt.m1257BottomSheetScaffoldLayoutKCBPh4w(function210, function372222, composableLambda22222, function211, composableLambda3, f15, i50, offset, bottomSheetState, composer4, ((i51 >> 9) & 14) | 24960 | ((i442222 >> 3) & 112) | ((i51 >> 6) & 7168) | ((i452222 << 9) & 458752) | (i51 & 3670016));
                                return;
                            }
                            composer4.skipToGroupEnd();
                        }
                    });
                    androidx.compose.ui.Modifier modifier62222 = modifier3;
                    final kotlin.jvm.functions.Function3<? super androidx.compose.foundation.layout.ColumnScope, ? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.Unit> function372222 = function34;
                    final androidx.compose.material.BottomSheetScaffoldState bottomSheetScaffoldState42222 = bottomSheetScaffoldState2;
                    final boolean z62222 = z4;
                    final androidx.compose.ui.graphics.Shape shape72222 = shape4;
                    final float f122222 = f6;
                    final long j302222 = j17;
                    final long j312222 = j13;
                    final long j322222 = j20;
                    final int i462222 = i21;
                    int i472222 = i33 << 6;
                    androidx.compose.material.SurfaceKt.m1511SurfaceFjzlyU(androidx.compose.foundation.layout.SizeKt.fillMaxSize$default(modifier62222, 0.0f, 1, null), null, j19, j18, null, 0.0f, androidx.compose.runtime.internal.ComposableLambdaKt.composableLambda(composer3, 1273816607, true, new kotlin.jvm.functions.Function2<androidx.compose.runtime.Composer, java.lang.Integer, kotlin.Unit>() { // from class: androidx.compose.material.BottomSheetScaffoldKt$BottomSheetScaffold$1
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        /* JADX WARN: Multi-variable type inference failed */
                        {
                            super(2);
                        }

                        @Override // kotlin.jvm.functions.Function2
                        public /* bridge */ /* synthetic */ kotlin.Unit invoke(androidx.compose.runtime.Composer composer4, java.lang.Integer num) {
                            invoke(composer4, num.intValue());
                            return kotlin.Unit.INSTANCE;
                        }

                        public final void invoke(androidx.compose.runtime.Composer composer4, int i48) {
                            androidx.compose.runtime.ComposerKt.sourceInformation(composer4, "C:BottomSheetScaffold.kt#jmzs0o");
                            if ((i48 & 11) != 2 || !composer4.getSkipping()) {
                                if (function372222 == null) {
                                    composer4.startReplaceableGroup(-249544858);
                                    androidx.compose.runtime.ComposerKt.sourceInformation(composer4, "381@16183L7");
                                    composableLambda2222.invoke(composer4, 6);
                                    composer4.endReplaceableGroup();
                                    return;
                                }
                                composer4.startReplaceableGroup(-249544821);
                                androidx.compose.runtime.ComposerKt.sourceInformation(composer4, "383@16220L480");
                                kotlin.jvm.functions.Function3<androidx.compose.foundation.layout.ColumnScope, androidx.compose.runtime.Composer, java.lang.Integer, kotlin.Unit> function38 = function372222;
                                androidx.compose.material.DrawerState drawerState = bottomSheetScaffoldState42222.getDrawerState();
                                boolean z72 = z62222;
                                androidx.compose.ui.graphics.Shape shape82 = shape72222;
                                float f132 = f122222;
                                long j332 = j302222;
                                long j34 = j312222;
                                long j35 = j322222;
                                kotlin.jvm.functions.Function2<androidx.compose.runtime.Composer, java.lang.Integer, kotlin.Unit> function210 = composableLambda2222;
                                int i49 = i462222;
                                androidx.compose.material.DrawerKt.m1364ModalDrawerGs3lGvM(function38, null, drawerState, z72, shape82, f132, j332, j34, j35, function210, composer4, ((i49 >> 3) & 7168) | ((i49 >> 9) & 14) | 805306368 | ((i49 >> 3) & 57344) | ((i49 >> 3) & 458752) | ((i49 >> 3) & 3670016) | ((i49 >> 3) & 29360128) | ((i49 >> 3) & 234881024), 2);
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
                kotlin.jvm.functions.Function2<? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.Unit> function2722222 = function26;
                if ((i5 & 2048) == 0) {
                }
                if (i16 == 0) {
                }
                if (i25 == 0) {
                }
                if (i27 == 0) {
                }
                float f922222 = m1255getSheetPeekHeightD9Ej5fM;
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
                androidx.compose.runtime.ComposerKt.sourceInformation(startRestartGroup, "C(rememberCoroutineScope)475@19849L144:Effects.kt#9igjgp");
                startRestartGroup.startReplaceableGroup(-492369756);
                androidx.compose.runtime.ComposerKt.sourceInformation(startRestartGroup, "C(remember):Composables.kt#9igjgp");
                rememberedValue = startRestartGroup.rememberedValue();
                if (rememberedValue == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                }
                startRestartGroup.endReplaceableGroup();
                final kotlinx.coroutines.CoroutineScope coroutineScope22222 = ((androidx.compose.runtime.CompositionScopedCoroutineScopeCanceller) rememberedValue).getCoroutineScope();
                startRestartGroup.endReplaceableGroup();
                androidx.compose.runtime.ProvidableCompositionLocal<androidx.compose.ui.unit.Density> localDensity22222 = androidx.compose.ui.platform.CompositionLocalsKt.getLocalDensity();
                androidx.compose.runtime.ComposerKt.sourceInformationMarkerStart(startRestartGroup, 2023513938, "C:CompositionLocal.kt#9igjgp");
                java.lang.Object consume22222 = startRestartGroup.consume(localDensity22222);
                androidx.compose.runtime.ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                mo315toPx0680j_4 = ((androidx.compose.ui.unit.Density) consume22222).mo315toPx0680j_4(f5);
                startRestartGroup.startReplaceableGroup(-492369756);
                androidx.compose.runtime.ComposerKt.sourceInformation(startRestartGroup, "C(remember):Composables.kt#9igjgp");
                rememberedValue2 = startRestartGroup.rememberedValue();
                if (rememberedValue2 != androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                }
                startRestartGroup.endReplaceableGroup();
                mutableState = (androidx.compose.runtime.MutableState) obj;
                if (kotlin.jvm.internal.Intrinsics.areEqual(mo315toPx0680j_4, m1258BottomSheetScaffold_bGncdBI$lambda4(mutableState))) {
                }
                final androidx.compose.material.BottomSheetScaffoldState bottomSheetScaffoldState322222 = bottomSheetScaffoldState2;
                final kotlin.jvm.functions.Function2<? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.Unit> function2822222 = function24;
                final kotlin.jvm.functions.Function2<? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.Unit> function2922222 = function23;
                final float f1022222 = f5;
                final int i4222222 = m1403getEnd5ygKITE;
                final int i4322222 = i32;
                final int i4422222 = i33;
                final int i4522222 = i21;
                final boolean z522222 = z3;
                final androidx.compose.ui.Modifier companion222222 = companion;
                final androidx.compose.ui.graphics.Shape shape622222 = cornerBasedShape;
                final long j2822222 = j11;
                final long j2922222 = j10;
                final float f1122222 = m1254getSheetElevationD9Ej5fM;
                final kotlin.jvm.functions.Function3<? super androidx.compose.material.SnackbarHostState, ? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.Unit> function3622222 = m1340getLambda1$material_release;
                composer3 = composer2;
                final kotlin.jvm.functions.Function2<? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.Unit> composableLambda22222 = androidx.compose.runtime.internal.ComposableLambdaKt.composableLambda(composer3, 893101063, true, new kotlin.jvm.functions.Function2<androidx.compose.runtime.Composer, java.lang.Integer, kotlin.Unit>() { // from class: androidx.compose.material.BottomSheetScaffoldKt$BottomSheetScaffold$child$1
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    /* JADX WARN: Multi-variable type inference failed */
                    {
                        super(2);
                    }

                    @Override // kotlin.jvm.functions.Function2
                    public /* bridge */ /* synthetic */ kotlin.Unit invoke(androidx.compose.runtime.Composer composer4, java.lang.Integer num) {
                        invoke(composer4, num.intValue());
                        return kotlin.Unit.INSTANCE;
                    }

                    public final void invoke(androidx.compose.runtime.Composer composer4, int i4622222) {
                        androidx.compose.runtime.ComposerKt.sourceInformation(composer4, "C316@13233L2758:BottomSheetScaffold.kt#jmzs0o");
                        if ((i4622222 & 11) != 2 || !composer4.getSkipping()) {
                            androidx.compose.runtime.State<java.lang.Float> offset = androidx.compose.material.BottomSheetScaffoldState.this.getBottomSheetState().getOffset();
                            androidx.compose.material.BottomSheetState bottomSheetState = androidx.compose.material.BottomSheetScaffoldState.this.getBottomSheetState();
                            kotlin.jvm.functions.Function2<androidx.compose.runtime.Composer, java.lang.Integer, kotlin.Unit> function210 = function2822222;
                            kotlin.jvm.functions.Function3<androidx.compose.foundation.layout.PaddingValues, androidx.compose.runtime.Composer, java.lang.Integer, kotlin.Unit> function3722222 = content;
                            final float f1222222 = mo315toPx0680j_4;
                            final androidx.compose.material.BottomSheetScaffoldState bottomSheetScaffoldState422222 = androidx.compose.material.BottomSheetScaffoldState.this;
                            final boolean z622222 = z522222;
                            final androidx.compose.ui.Modifier modifier622222 = companion222222;
                            final float f132 = f1022222;
                            final androidx.compose.runtime.MutableState<java.lang.Float> mutableState2 = mutableState;
                            final androidx.compose.ui.graphics.Shape shape722222 = shape622222;
                            final long j3022222 = j2822222;
                            final long j3122222 = j2922222;
                            final float f14 = f1122222;
                            final int i4722222 = i4322222;
                            final int i48 = i4522222;
                            final kotlin.jvm.functions.Function3<? super androidx.compose.foundation.layout.ColumnScope, ? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.Unit> function38 = sheetContent;
                            androidx.compose.runtime.internal.ComposableLambda composableLambda222222 = androidx.compose.runtime.internal.ComposableLambdaKt.composableLambda(composer4, -1378534681, true, new kotlin.jvm.functions.Function3<java.lang.Integer, androidx.compose.runtime.Composer, java.lang.Integer, kotlin.Unit>() { // from class: androidx.compose.material.BottomSheetScaffoldKt$BottomSheetScaffold$child$1.1
                                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                /* JADX WARN: Multi-variable type inference failed */
                                {
                                    super(3);
                                }

                                @Override // kotlin.jvm.functions.Function3
                                public /* bridge */ /* synthetic */ kotlin.Unit invoke(java.lang.Integer num, androidx.compose.runtime.Composer composer5, java.lang.Integer num2) {
                                    invoke(num.intValue(), composer5, num2.intValue());
                                    return kotlin.Unit.INSTANCE;
                                }

                                public final void invoke(int i49, androidx.compose.runtime.Composer composer5, int i50) {
                                    int i51;
                                    java.lang.Float m1258BottomSheetScaffold_bGncdBI$lambda4;
                                    java.lang.Float m1258BottomSheetScaffold_bGncdBI$lambda42;
                                    java.util.Map mapOf;
                                    androidx.compose.ui.Modifier.Companion m1521swipeablepPrIpRY;
                                    androidx.compose.runtime.ComposerKt.sourceInformation(composer5, "C354@15208L95,347@14851L711:BottomSheetScaffold.kt#jmzs0o");
                                    if ((i50 & 14) == 0) {
                                        i51 = i50 | (composer5.changed(i49) ? 4 : 2);
                                    } else {
                                        i51 = i50;
                                    }
                                    if ((i51 & 91) != 18 || !composer5.getSkipping()) {
                                        m1258BottomSheetScaffold_bGncdBI$lambda4 = androidx.compose.material.BottomSheetScaffoldKt.m1258BottomSheetScaffold_bGncdBI$lambda4(mutableState2);
                                        if (m1258BottomSheetScaffold_bGncdBI$lambda4 == null) {
                                            m1521swipeablepPrIpRY = androidx.compose.ui.Modifier.INSTANCE;
                                        } else {
                                            if (kotlin.math.MathKt.roundToInt(m1258BottomSheetScaffold_bGncdBI$lambda4.floatValue()) != kotlin.math.MathKt.roundToInt(f1222222)) {
                                                float f15 = i49;
                                                m1258BottomSheetScaffold_bGncdBI$lambda42 = androidx.compose.material.BottomSheetScaffoldKt.m1258BottomSheetScaffold_bGncdBI$lambda4(mutableState2);
                                                kotlin.jvm.internal.Intrinsics.checkNotNull(m1258BottomSheetScaffold_bGncdBI$lambda42);
                                                mapOf = kotlin.collections.MapsKt.mapOf(kotlin.TuplesKt.to(java.lang.Float.valueOf(f15 - m1258BottomSheetScaffold_bGncdBI$lambda42.floatValue()), androidx.compose.material.BottomSheetValue.Expanded), kotlin.TuplesKt.to(java.lang.Float.valueOf(f15 - f1222222), androidx.compose.material.BottomSheetValue.Collapsed));
                                            } else {
                                                mapOf = kotlin.collections.MapsKt.mapOf(kotlin.TuplesKt.to(java.lang.Float.valueOf(i49 - m1258BottomSheetScaffold_bGncdBI$lambda4.floatValue()), androidx.compose.material.BottomSheetValue.Collapsed));
                                            }
                                            m1521swipeablepPrIpRY = androidx.compose.material.SwipeableKt.m1521swipeablepPrIpRY(androidx.compose.ui.Modifier.INSTANCE, bottomSheetScaffoldState422222.getBottomSheetState(), r13, androidx.compose.foundation.gestures.Orientation.Vertical, (r26 & 8) != 0 ? true : z622222, (r26 & 16) != 0 ? false : false, (r26 & 32) != 0 ? null : null, (r26 & 64) != 0 ? new kotlin.jvm.functions.Function2<T, T, androidx.compose.material.FixedThreshold>() { // from class: androidx.compose.material.SwipeableKt$swipeable$1
                                                /* JADX WARN: Can't rename method to resolve collision */
                                                @Override // kotlin.jvm.functions.Function2
                                                public final androidx.compose.material.FixedThreshold invoke(T t, T t2) {
                                                    return new androidx.compose.material.FixedThreshold(androidx.compose.ui.unit.Dp.m4478constructorimpl(56), null);
                                                }
                                            } : null, (r26 & 128) != 0 ? androidx.compose.material.SwipeableDefaults.resistanceConfig$default(androidx.compose.material.SwipeableDefaults.INSTANCE, mapOf.keySet(), 0.0f, 0.0f, 6, null) : null, (r26 & 256) != 0 ? androidx.compose.material.SwipeableDefaults.INSTANCE.m1520getVelocityThresholdD9Ej5fM() : 0.0f);
                                        }
                                        androidx.compose.ui.Modifier m608requiredHeightInVpY3zN4$default = androidx.compose.foundation.layout.SizeKt.m608requiredHeightInVpY3zN4$default(androidx.compose.foundation.layout.SizeKt.fillMaxWidth$default(androidx.compose.ui.input.nestedscroll.NestedScrollModifierKt.nestedScroll$default(androidx.compose.ui.Modifier.INSTANCE, bottomSheetScaffoldState422222.getBottomSheetState().getNestedScrollConnection(), null, 2, null).then(m1521swipeablepPrIpRY).then(modifier622222), 0.0f, 1, null), f132, 0.0f, 2, null);
                                        final androidx.compose.runtime.MutableState<java.lang.Float> mutableState3 = mutableState2;
                                        composer5.startReplaceableGroup(1157296644);
                                        androidx.compose.runtime.ComposerKt.sourceInformation(composer5, "C(remember)P(1):Composables.kt#9igjgp");
                                        boolean changed = composer5.changed(mutableState3);
                                        java.lang.Object rememberedValue3 = composer5.rememberedValue();
                                        if (changed || rememberedValue3 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                                            rememberedValue3 = (kotlin.jvm.functions.Function1) new kotlin.jvm.functions.Function1<androidx.compose.ui.unit.IntSize, kotlin.Unit>() { // from class: androidx.compose.material.BottomSheetScaffoldKt$BottomSheetScaffold$child$1$1$1$1
                                                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                                {
                                                    super(1);
                                                }

                                                @Override // kotlin.jvm.functions.Function1
                                                public /* bridge */ /* synthetic */ kotlin.Unit invoke(androidx.compose.ui.unit.IntSize intSize) {
                                                    m1263invokeozmzZPI(intSize.getPackedValue());
                                                    return kotlin.Unit.INSTANCE;
                                                }

                                                /* renamed from: invoke-ozmzZPI, reason: not valid java name */
                                                public final void m1263invokeozmzZPI(long j3222222) {
                                                    mutableState3.setValue(java.lang.Float.valueOf(androidx.compose.ui.unit.IntSize.m4651getHeightimpl(j3222222)));
                                                }
                                            };
                                            composer5.updateRememberedValue(rememberedValue3);
                                        }
                                        composer5.endReplaceableGroup();
                                        androidx.compose.ui.Modifier onSizeChanged = androidx.compose.ui.layout.OnRemeasuredModifierKt.onSizeChanged(m608requiredHeightInVpY3zN4$default, (kotlin.jvm.functions.Function1) rememberedValue3);
                                        androidx.compose.ui.graphics.Shape shape82 = shape722222;
                                        long j3222222 = j3022222;
                                        long j332 = j3122222;
                                        float f16 = f14;
                                        final kotlin.jvm.functions.Function3<? super androidx.compose.foundation.layout.ColumnScope, ? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.Unit> function39 = function38;
                                        final int i52 = i4722222;
                                        androidx.compose.runtime.internal.ComposableLambda composableLambda3 = androidx.compose.runtime.internal.ComposableLambdaKt.composableLambda(composer5, -698903261, true, new kotlin.jvm.functions.Function2<androidx.compose.runtime.Composer, java.lang.Integer, kotlin.Unit>() { // from class: androidx.compose.material.BottomSheetScaffoldKt.BottomSheetScaffold.child.1.1.2
                                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                            /* JADX WARN: Multi-variable type inference failed */
                                            {
                                                super(2);
                                            }

                                            @Override // kotlin.jvm.functions.Function2
                                            public /* bridge */ /* synthetic */ kotlin.Unit invoke(androidx.compose.runtime.Composer composer6, java.lang.Integer num) {
                                                invoke(composer6, num.intValue());
                                                return kotlin.Unit.INSTANCE;
                                            }

                                            public final void invoke(androidx.compose.runtime.Composer composer6, int i53) {
                                                androidx.compose.runtime.ComposerKt.sourceInformation(composer6, "C361@15529L30:BottomSheetScaffold.kt#jmzs0o");
                                                if ((i53 & 11) == 2 && composer6.getSkipping()) {
                                                    composer6.skipToGroupEnd();
                                                    return;
                                                }
                                                kotlin.jvm.functions.Function3<androidx.compose.foundation.layout.ColumnScope, androidx.compose.runtime.Composer, java.lang.Integer, kotlin.Unit> function310 = function39;
                                                int i54 = (i52 << 9) & 7168;
                                                composer6.startReplaceableGroup(-483455358);
                                                androidx.compose.runtime.ComposerKt.sourceInformation(composer6, "C(Column)P(2,3,1)77@3880L61,78@3946L133:Column.kt#2w3rfo");
                                                androidx.compose.ui.Modifier.Companion companion3 = androidx.compose.ui.Modifier.INSTANCE;
                                                androidx.compose.ui.layout.MeasurePolicy columnMeasurePolicy = androidx.compose.foundation.layout.ColumnKt.columnMeasurePolicy(androidx.compose.foundation.layout.Arrangement.INSTANCE.getTop(), androidx.compose.ui.Alignment.INSTANCE.getStart(), composer6, 0);
                                                composer6.startReplaceableGroup(-1323940314);
                                                androidx.compose.runtime.ComposerKt.sourceInformation(composer6, "C(Layout)P(!1,2)74@2915L7,75@2970L7,76@3029L7,77@3041L460:Layout.kt#80mrfh");
                                                androidx.compose.runtime.ProvidableCompositionLocal<androidx.compose.ui.unit.Density> localDensity222222 = androidx.compose.ui.platform.CompositionLocalsKt.getLocalDensity();
                                                androidx.compose.runtime.ComposerKt.sourceInformationMarkerStart(composer6, 2023513938, "C:CompositionLocal.kt#9igjgp");
                                                java.lang.Object consume222222 = composer6.consume(localDensity222222);
                                                androidx.compose.runtime.ComposerKt.sourceInformationMarkerEnd(composer6);
                                                androidx.compose.ui.unit.Density density = (androidx.compose.ui.unit.Density) consume222222;
                                                androidx.compose.runtime.ProvidableCompositionLocal<androidx.compose.ui.unit.LayoutDirection> localLayoutDirection = androidx.compose.ui.platform.CompositionLocalsKt.getLocalLayoutDirection();
                                                androidx.compose.runtime.ComposerKt.sourceInformationMarkerStart(composer6, 2023513938, "C:CompositionLocal.kt#9igjgp");
                                                java.lang.Object consume3 = composer6.consume(localLayoutDirection);
                                                androidx.compose.runtime.ComposerKt.sourceInformationMarkerEnd(composer6);
                                                androidx.compose.ui.unit.LayoutDirection layoutDirection = (androidx.compose.ui.unit.LayoutDirection) consume3;
                                                androidx.compose.runtime.ProvidableCompositionLocal<androidx.compose.ui.platform.ViewConfiguration> localViewConfiguration = androidx.compose.ui.platform.CompositionLocalsKt.getLocalViewConfiguration();
                                                androidx.compose.runtime.ComposerKt.sourceInformationMarkerStart(composer6, 2023513938, "C:CompositionLocal.kt#9igjgp");
                                                java.lang.Object consume4 = composer6.consume(localViewConfiguration);
                                                androidx.compose.runtime.ComposerKt.sourceInformationMarkerEnd(composer6);
                                                androidx.compose.ui.platform.ViewConfiguration viewConfiguration = (androidx.compose.ui.platform.ViewConfiguration) consume4;
                                                kotlin.jvm.functions.Function0<androidx.compose.ui.node.ComposeUiNode> constructor = androidx.compose.ui.node.ComposeUiNode.INSTANCE.getConstructor();
                                                kotlin.jvm.functions.Function3<androidx.compose.runtime.SkippableUpdater<androidx.compose.ui.node.ComposeUiNode>, androidx.compose.runtime.Composer, java.lang.Integer, kotlin.Unit> materializerOf = androidx.compose.ui.layout.LayoutKt.materializerOf(companion3);
                                                if (!(composer6.getApplier() instanceof androidx.compose.runtime.Applier)) {
                                                    androidx.compose.runtime.ComposablesKt.invalidApplier();
                                                }
                                                composer6.startReusableNode();
                                                if (composer6.getInserting()) {
                                                    composer6.createNode(constructor);
                                                } else {
                                                    composer6.useNode();
                                                }
                                                composer6.disableReusing();
                                                androidx.compose.runtime.Composer m1641constructorimpl = androidx.compose.runtime.Updater.m1641constructorimpl(composer6);
                                                androidx.compose.runtime.Updater.m1648setimpl(m1641constructorimpl, columnMeasurePolicy, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetMeasurePolicy());
                                                androidx.compose.runtime.Updater.m1648setimpl(m1641constructorimpl, density, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetDensity());
                                                androidx.compose.runtime.Updater.m1648setimpl(m1641constructorimpl, layoutDirection, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetLayoutDirection());
                                                androidx.compose.runtime.Updater.m1648setimpl(m1641constructorimpl, viewConfiguration, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetViewConfiguration());
                                                composer6.enableReusing();
                                                materializerOf.invoke(androidx.compose.runtime.SkippableUpdater.m1632boximpl(androidx.compose.runtime.SkippableUpdater.m1633constructorimpl(composer6)), composer6, 0);
                                                composer6.startReplaceableGroup(2058660585);
                                                composer6.startReplaceableGroup(-1163856341);
                                                androidx.compose.runtime.ComposerKt.sourceInformation(composer6, "C79@3994L9:Column.kt#2w3rfo");
                                                function310.invoke(androidx.compose.foundation.layout.ColumnScopeInstance.INSTANCE, composer6, java.lang.Integer.valueOf(((i54 >> 6) & 112) | 6));
                                                composer6.endReplaceableGroup();
                                                composer6.endReplaceableGroup();
                                                composer6.endNode();
                                                composer6.endReplaceableGroup();
                                                composer6.endReplaceableGroup();
                                            }
                                        });
                                        int i53 = i4722222;
                                        int i54 = i48;
                                        androidx.compose.material.SurfaceKt.m1511SurfaceFjzlyU(onSizeChanged, shape82, j3222222, j332, null, f16, composableLambda3, composer5, ((i53 >> 21) & 112) | 1572864 | ((i54 << 6) & 896) | ((i54 << 6) & 7168) | ((i53 >> 12) & 458752), 16);
                                        return;
                                    }
                                    composer5.skipToGroupEnd();
                                }
                            });
                            kotlin.jvm.functions.Function2<androidx.compose.runtime.Composer, java.lang.Integer, kotlin.Unit> function211 = function2922222;
                            final kotlin.jvm.functions.Function3<? super androidx.compose.material.SnackbarHostState, ? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.Unit> function39 = function3622222;
                            final androidx.compose.material.BottomSheetScaffoldState bottomSheetScaffoldState52 = androidx.compose.material.BottomSheetScaffoldState.this;
                            final int i49 = i4322222;
                            androidx.compose.runtime.internal.ComposableLambda composableLambda3 = androidx.compose.runtime.internal.ComposableLambdaKt.composableLambda(composer4, -486138068, true, new kotlin.jvm.functions.Function2<androidx.compose.runtime.Composer, java.lang.Integer, kotlin.Unit>() { // from class: androidx.compose.material.BottomSheetScaffoldKt$BottomSheetScaffold$child$1.2
                                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                /* JADX WARN: Multi-variable type inference failed */
                                {
                                    super(2);
                                }

                                @Override // kotlin.jvm.functions.Function2
                                public /* bridge */ /* synthetic */ kotlin.Unit invoke(androidx.compose.runtime.Composer composer5, java.lang.Integer num) {
                                    invoke(composer5, num.intValue());
                                    return kotlin.Unit.INSTANCE;
                                }

                                public final void invoke(androidx.compose.runtime.Composer composer5, int i50) {
                                    androidx.compose.runtime.ComposerKt.sourceInformation(composer5, "C365@15680L45:BottomSheetScaffold.kt#jmzs0o");
                                    if ((i50 & 11) == 2 && composer5.getSkipping()) {
                                        composer5.skipToGroupEnd();
                                    } else {
                                        function39.invoke(bottomSheetScaffoldState52.getSnackbarHostState(), composer5, java.lang.Integer.valueOf((i49 >> 9) & 112));
                                    }
                                }
                            });
                            float f15 = f1022222;
                            int i50 = i4222222;
                            int i51 = i4322222;
                            androidx.compose.material.BottomSheetScaffoldKt.m1257BottomSheetScaffoldLayoutKCBPh4w(function210, function3722222, composableLambda222222, function211, composableLambda3, f15, i50, offset, bottomSheetState, composer4, ((i51 >> 9) & 14) | 24960 | ((i4422222 >> 3) & 112) | ((i51 >> 6) & 7168) | ((i4522222 << 9) & 458752) | (i51 & 3670016));
                            return;
                        }
                        composer4.skipToGroupEnd();
                    }
                });
                androidx.compose.ui.Modifier modifier622222 = modifier3;
                final kotlin.jvm.functions.Function3<? super androidx.compose.foundation.layout.ColumnScope, ? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.Unit> function3722222 = function34;
                final androidx.compose.material.BottomSheetScaffoldState bottomSheetScaffoldState422222 = bottomSheetScaffoldState2;
                final boolean z622222 = z4;
                final androidx.compose.ui.graphics.Shape shape722222 = shape4;
                final float f1222222 = f6;
                final long j3022222 = j17;
                final long j3122222 = j13;
                final long j3222222 = j20;
                final int i4622222 = i21;
                int i4722222 = i33 << 6;
                androidx.compose.material.SurfaceKt.m1511SurfaceFjzlyU(androidx.compose.foundation.layout.SizeKt.fillMaxSize$default(modifier622222, 0.0f, 1, null), null, j19, j18, null, 0.0f, androidx.compose.runtime.internal.ComposableLambdaKt.composableLambda(composer3, 1273816607, true, new kotlin.jvm.functions.Function2<androidx.compose.runtime.Composer, java.lang.Integer, kotlin.Unit>() { // from class: androidx.compose.material.BottomSheetScaffoldKt$BottomSheetScaffold$1
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    /* JADX WARN: Multi-variable type inference failed */
                    {
                        super(2);
                    }

                    @Override // kotlin.jvm.functions.Function2
                    public /* bridge */ /* synthetic */ kotlin.Unit invoke(androidx.compose.runtime.Composer composer4, java.lang.Integer num) {
                        invoke(composer4, num.intValue());
                        return kotlin.Unit.INSTANCE;
                    }

                    public final void invoke(androidx.compose.runtime.Composer composer4, int i48) {
                        androidx.compose.runtime.ComposerKt.sourceInformation(composer4, "C:BottomSheetScaffold.kt#jmzs0o");
                        if ((i48 & 11) != 2 || !composer4.getSkipping()) {
                            if (function3722222 == null) {
                                composer4.startReplaceableGroup(-249544858);
                                androidx.compose.runtime.ComposerKt.sourceInformation(composer4, "381@16183L7");
                                composableLambda22222.invoke(composer4, 6);
                                composer4.endReplaceableGroup();
                                return;
                            }
                            composer4.startReplaceableGroup(-249544821);
                            androidx.compose.runtime.ComposerKt.sourceInformation(composer4, "383@16220L480");
                            kotlin.jvm.functions.Function3<androidx.compose.foundation.layout.ColumnScope, androidx.compose.runtime.Composer, java.lang.Integer, kotlin.Unit> function38 = function3722222;
                            androidx.compose.material.DrawerState drawerState = bottomSheetScaffoldState422222.getDrawerState();
                            boolean z72 = z622222;
                            androidx.compose.ui.graphics.Shape shape82 = shape722222;
                            float f132 = f1222222;
                            long j332 = j3022222;
                            long j34 = j3122222;
                            long j35 = j3222222;
                            kotlin.jvm.functions.Function2<androidx.compose.runtime.Composer, java.lang.Integer, kotlin.Unit> function210 = composableLambda22222;
                            int i49 = i4622222;
                            androidx.compose.material.DrawerKt.m1364ModalDrawerGs3lGvM(function38, null, drawerState, z72, shape82, f132, j332, j34, j35, function210, composer4, ((i49 >> 3) & 7168) | ((i49 >> 9) & 14) | 805306368 | ((i49 >> 3) & 57344) | ((i49 >> 3) & 458752) | ((i49 >> 3) & 3670016) | ((i49 >> 3) & 29360128) | ((i49 >> 3) & 234881024), 2);
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
            kotlin.jvm.functions.Function2<? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.Unit> function27222222 = function26;
            if ((i5 & 2048) == 0) {
            }
            if (i16 == 0) {
            }
            if (i25 == 0) {
            }
            if (i27 == 0) {
            }
            float f9222222 = m1255getSheetPeekHeightD9Ej5fM;
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
            androidx.compose.runtime.ComposerKt.sourceInformation(startRestartGroup, "C(rememberCoroutineScope)475@19849L144:Effects.kt#9igjgp");
            startRestartGroup.startReplaceableGroup(-492369756);
            androidx.compose.runtime.ComposerKt.sourceInformation(startRestartGroup, "C(remember):Composables.kt#9igjgp");
            rememberedValue = startRestartGroup.rememberedValue();
            if (rememberedValue == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
            }
            startRestartGroup.endReplaceableGroup();
            final kotlinx.coroutines.CoroutineScope coroutineScope222222 = ((androidx.compose.runtime.CompositionScopedCoroutineScopeCanceller) rememberedValue).getCoroutineScope();
            startRestartGroup.endReplaceableGroup();
            androidx.compose.runtime.ProvidableCompositionLocal<androidx.compose.ui.unit.Density> localDensity222222 = androidx.compose.ui.platform.CompositionLocalsKt.getLocalDensity();
            androidx.compose.runtime.ComposerKt.sourceInformationMarkerStart(startRestartGroup, 2023513938, "C:CompositionLocal.kt#9igjgp");
            java.lang.Object consume222222 = startRestartGroup.consume(localDensity222222);
            androidx.compose.runtime.ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
            mo315toPx0680j_4 = ((androidx.compose.ui.unit.Density) consume222222).mo315toPx0680j_4(f5);
            startRestartGroup.startReplaceableGroup(-492369756);
            androidx.compose.runtime.ComposerKt.sourceInformation(startRestartGroup, "C(remember):Composables.kt#9igjgp");
            rememberedValue2 = startRestartGroup.rememberedValue();
            if (rememberedValue2 != androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
            }
            startRestartGroup.endReplaceableGroup();
            mutableState = (androidx.compose.runtime.MutableState) obj;
            if (kotlin.jvm.internal.Intrinsics.areEqual(mo315toPx0680j_4, m1258BottomSheetScaffold_bGncdBI$lambda4(mutableState))) {
            }
            final androidx.compose.material.BottomSheetScaffoldState bottomSheetScaffoldState3222222 = bottomSheetScaffoldState2;
            final kotlin.jvm.functions.Function2<? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.Unit> function28222222 = function24;
            final kotlin.jvm.functions.Function2<? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.Unit> function29222222 = function23;
            final float f10222222 = f5;
            final int i42222222 = m1403getEnd5ygKITE;
            final int i43222222 = i32;
            final int i44222222 = i33;
            final int i45222222 = i21;
            final boolean z5222222 = z3;
            final androidx.compose.ui.Modifier companion2222222 = companion;
            final androidx.compose.ui.graphics.Shape shape6222222 = cornerBasedShape;
            final long j28222222 = j11;
            final long j29222222 = j10;
            final float f11222222 = m1254getSheetElevationD9Ej5fM;
            final kotlin.jvm.functions.Function3<? super androidx.compose.material.SnackbarHostState, ? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.Unit> function36222222 = m1340getLambda1$material_release;
            composer3 = composer2;
            final kotlin.jvm.functions.Function2<? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.Unit> composableLambda222222 = androidx.compose.runtime.internal.ComposableLambdaKt.composableLambda(composer3, 893101063, true, new kotlin.jvm.functions.Function2<androidx.compose.runtime.Composer, java.lang.Integer, kotlin.Unit>() { // from class: androidx.compose.material.BottomSheetScaffoldKt$BottomSheetScaffold$child$1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                /* JADX WARN: Multi-variable type inference failed */
                {
                    super(2);
                }

                @Override // kotlin.jvm.functions.Function2
                public /* bridge */ /* synthetic */ kotlin.Unit invoke(androidx.compose.runtime.Composer composer4, java.lang.Integer num) {
                    invoke(composer4, num.intValue());
                    return kotlin.Unit.INSTANCE;
                }

                public final void invoke(androidx.compose.runtime.Composer composer4, int i46222222) {
                    androidx.compose.runtime.ComposerKt.sourceInformation(composer4, "C316@13233L2758:BottomSheetScaffold.kt#jmzs0o");
                    if ((i46222222 & 11) != 2 || !composer4.getSkipping()) {
                        androidx.compose.runtime.State<java.lang.Float> offset = androidx.compose.material.BottomSheetScaffoldState.this.getBottomSheetState().getOffset();
                        androidx.compose.material.BottomSheetState bottomSheetState = androidx.compose.material.BottomSheetScaffoldState.this.getBottomSheetState();
                        kotlin.jvm.functions.Function2<androidx.compose.runtime.Composer, java.lang.Integer, kotlin.Unit> function210 = function28222222;
                        kotlin.jvm.functions.Function3<androidx.compose.foundation.layout.PaddingValues, androidx.compose.runtime.Composer, java.lang.Integer, kotlin.Unit> function37222222 = content;
                        final float f12222222 = mo315toPx0680j_4;
                        final androidx.compose.material.BottomSheetScaffoldState bottomSheetScaffoldState4222222 = androidx.compose.material.BottomSheetScaffoldState.this;
                        final boolean z6222222 = z5222222;
                        final androidx.compose.ui.Modifier modifier6222222 = companion2222222;
                        final float f132 = f10222222;
                        final androidx.compose.runtime.MutableState<java.lang.Float> mutableState2 = mutableState;
                        final androidx.compose.ui.graphics.Shape shape7222222 = shape6222222;
                        final long j30222222 = j28222222;
                        final long j31222222 = j29222222;
                        final float f14 = f11222222;
                        final int i47222222 = i43222222;
                        final int i48 = i45222222;
                        final kotlin.jvm.functions.Function3<? super androidx.compose.foundation.layout.ColumnScope, ? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.Unit> function38 = sheetContent;
                        androidx.compose.runtime.internal.ComposableLambda composableLambda2222222 = androidx.compose.runtime.internal.ComposableLambdaKt.composableLambda(composer4, -1378534681, true, new kotlin.jvm.functions.Function3<java.lang.Integer, androidx.compose.runtime.Composer, java.lang.Integer, kotlin.Unit>() { // from class: androidx.compose.material.BottomSheetScaffoldKt$BottomSheetScaffold$child$1.1
                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            /* JADX WARN: Multi-variable type inference failed */
                            {
                                super(3);
                            }

                            @Override // kotlin.jvm.functions.Function3
                            public /* bridge */ /* synthetic */ kotlin.Unit invoke(java.lang.Integer num, androidx.compose.runtime.Composer composer5, java.lang.Integer num2) {
                                invoke(num.intValue(), composer5, num2.intValue());
                                return kotlin.Unit.INSTANCE;
                            }

                            public final void invoke(int i49, androidx.compose.runtime.Composer composer5, int i50) {
                                int i51;
                                java.lang.Float m1258BottomSheetScaffold_bGncdBI$lambda4;
                                java.lang.Float m1258BottomSheetScaffold_bGncdBI$lambda42;
                                java.util.Map mapOf;
                                androidx.compose.ui.Modifier.Companion m1521swipeablepPrIpRY;
                                androidx.compose.runtime.ComposerKt.sourceInformation(composer5, "C354@15208L95,347@14851L711:BottomSheetScaffold.kt#jmzs0o");
                                if ((i50 & 14) == 0) {
                                    i51 = i50 | (composer5.changed(i49) ? 4 : 2);
                                } else {
                                    i51 = i50;
                                }
                                if ((i51 & 91) != 18 || !composer5.getSkipping()) {
                                    m1258BottomSheetScaffold_bGncdBI$lambda4 = androidx.compose.material.BottomSheetScaffoldKt.m1258BottomSheetScaffold_bGncdBI$lambda4(mutableState2);
                                    if (m1258BottomSheetScaffold_bGncdBI$lambda4 == null) {
                                        m1521swipeablepPrIpRY = androidx.compose.ui.Modifier.INSTANCE;
                                    } else {
                                        if (kotlin.math.MathKt.roundToInt(m1258BottomSheetScaffold_bGncdBI$lambda4.floatValue()) != kotlin.math.MathKt.roundToInt(f12222222)) {
                                            float f15 = i49;
                                            m1258BottomSheetScaffold_bGncdBI$lambda42 = androidx.compose.material.BottomSheetScaffoldKt.m1258BottomSheetScaffold_bGncdBI$lambda4(mutableState2);
                                            kotlin.jvm.internal.Intrinsics.checkNotNull(m1258BottomSheetScaffold_bGncdBI$lambda42);
                                            mapOf = kotlin.collections.MapsKt.mapOf(kotlin.TuplesKt.to(java.lang.Float.valueOf(f15 - m1258BottomSheetScaffold_bGncdBI$lambda42.floatValue()), androidx.compose.material.BottomSheetValue.Expanded), kotlin.TuplesKt.to(java.lang.Float.valueOf(f15 - f12222222), androidx.compose.material.BottomSheetValue.Collapsed));
                                        } else {
                                            mapOf = kotlin.collections.MapsKt.mapOf(kotlin.TuplesKt.to(java.lang.Float.valueOf(i49 - m1258BottomSheetScaffold_bGncdBI$lambda4.floatValue()), androidx.compose.material.BottomSheetValue.Collapsed));
                                        }
                                        m1521swipeablepPrIpRY = androidx.compose.material.SwipeableKt.m1521swipeablepPrIpRY(androidx.compose.ui.Modifier.INSTANCE, bottomSheetScaffoldState4222222.getBottomSheetState(), r13, androidx.compose.foundation.gestures.Orientation.Vertical, (r26 & 8) != 0 ? true : z6222222, (r26 & 16) != 0 ? false : false, (r26 & 32) != 0 ? null : null, (r26 & 64) != 0 ? new kotlin.jvm.functions.Function2<T, T, androidx.compose.material.FixedThreshold>() { // from class: androidx.compose.material.SwipeableKt$swipeable$1
                                            /* JADX WARN: Can't rename method to resolve collision */
                                            @Override // kotlin.jvm.functions.Function2
                                            public final androidx.compose.material.FixedThreshold invoke(T t, T t2) {
                                                return new androidx.compose.material.FixedThreshold(androidx.compose.ui.unit.Dp.m4478constructorimpl(56), null);
                                            }
                                        } : null, (r26 & 128) != 0 ? androidx.compose.material.SwipeableDefaults.resistanceConfig$default(androidx.compose.material.SwipeableDefaults.INSTANCE, mapOf.keySet(), 0.0f, 0.0f, 6, null) : null, (r26 & 256) != 0 ? androidx.compose.material.SwipeableDefaults.INSTANCE.m1520getVelocityThresholdD9Ej5fM() : 0.0f);
                                    }
                                    androidx.compose.ui.Modifier m608requiredHeightInVpY3zN4$default = androidx.compose.foundation.layout.SizeKt.m608requiredHeightInVpY3zN4$default(androidx.compose.foundation.layout.SizeKt.fillMaxWidth$default(androidx.compose.ui.input.nestedscroll.NestedScrollModifierKt.nestedScroll$default(androidx.compose.ui.Modifier.INSTANCE, bottomSheetScaffoldState4222222.getBottomSheetState().getNestedScrollConnection(), null, 2, null).then(m1521swipeablepPrIpRY).then(modifier6222222), 0.0f, 1, null), f132, 0.0f, 2, null);
                                    final androidx.compose.runtime.MutableState<java.lang.Float> mutableState3 = mutableState2;
                                    composer5.startReplaceableGroup(1157296644);
                                    androidx.compose.runtime.ComposerKt.sourceInformation(composer5, "C(remember)P(1):Composables.kt#9igjgp");
                                    boolean changed = composer5.changed(mutableState3);
                                    java.lang.Object rememberedValue3 = composer5.rememberedValue();
                                    if (changed || rememberedValue3 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                                        rememberedValue3 = (kotlin.jvm.functions.Function1) new kotlin.jvm.functions.Function1<androidx.compose.ui.unit.IntSize, kotlin.Unit>() { // from class: androidx.compose.material.BottomSheetScaffoldKt$BottomSheetScaffold$child$1$1$1$1
                                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                            {
                                                super(1);
                                            }

                                            @Override // kotlin.jvm.functions.Function1
                                            public /* bridge */ /* synthetic */ kotlin.Unit invoke(androidx.compose.ui.unit.IntSize intSize) {
                                                m1263invokeozmzZPI(intSize.getPackedValue());
                                                return kotlin.Unit.INSTANCE;
                                            }

                                            /* renamed from: invoke-ozmzZPI, reason: not valid java name */
                                            public final void m1263invokeozmzZPI(long j32222222) {
                                                mutableState3.setValue(java.lang.Float.valueOf(androidx.compose.ui.unit.IntSize.m4651getHeightimpl(j32222222)));
                                            }
                                        };
                                        composer5.updateRememberedValue(rememberedValue3);
                                    }
                                    composer5.endReplaceableGroup();
                                    androidx.compose.ui.Modifier onSizeChanged = androidx.compose.ui.layout.OnRemeasuredModifierKt.onSizeChanged(m608requiredHeightInVpY3zN4$default, (kotlin.jvm.functions.Function1) rememberedValue3);
                                    androidx.compose.ui.graphics.Shape shape82 = shape7222222;
                                    long j32222222 = j30222222;
                                    long j332 = j31222222;
                                    float f16 = f14;
                                    final kotlin.jvm.functions.Function3<? super androidx.compose.foundation.layout.ColumnScope, ? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.Unit> function39 = function38;
                                    final int i52 = i47222222;
                                    androidx.compose.runtime.internal.ComposableLambda composableLambda3 = androidx.compose.runtime.internal.ComposableLambdaKt.composableLambda(composer5, -698903261, true, new kotlin.jvm.functions.Function2<androidx.compose.runtime.Composer, java.lang.Integer, kotlin.Unit>() { // from class: androidx.compose.material.BottomSheetScaffoldKt.BottomSheetScaffold.child.1.1.2
                                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                        /* JADX WARN: Multi-variable type inference failed */
                                        {
                                            super(2);
                                        }

                                        @Override // kotlin.jvm.functions.Function2
                                        public /* bridge */ /* synthetic */ kotlin.Unit invoke(androidx.compose.runtime.Composer composer6, java.lang.Integer num) {
                                            invoke(composer6, num.intValue());
                                            return kotlin.Unit.INSTANCE;
                                        }

                                        public final void invoke(androidx.compose.runtime.Composer composer6, int i53) {
                                            androidx.compose.runtime.ComposerKt.sourceInformation(composer6, "C361@15529L30:BottomSheetScaffold.kt#jmzs0o");
                                            if ((i53 & 11) == 2 && composer6.getSkipping()) {
                                                composer6.skipToGroupEnd();
                                                return;
                                            }
                                            kotlin.jvm.functions.Function3<androidx.compose.foundation.layout.ColumnScope, androidx.compose.runtime.Composer, java.lang.Integer, kotlin.Unit> function310 = function39;
                                            int i54 = (i52 << 9) & 7168;
                                            composer6.startReplaceableGroup(-483455358);
                                            androidx.compose.runtime.ComposerKt.sourceInformation(composer6, "C(Column)P(2,3,1)77@3880L61,78@3946L133:Column.kt#2w3rfo");
                                            androidx.compose.ui.Modifier.Companion companion3 = androidx.compose.ui.Modifier.INSTANCE;
                                            androidx.compose.ui.layout.MeasurePolicy columnMeasurePolicy = androidx.compose.foundation.layout.ColumnKt.columnMeasurePolicy(androidx.compose.foundation.layout.Arrangement.INSTANCE.getTop(), androidx.compose.ui.Alignment.INSTANCE.getStart(), composer6, 0);
                                            composer6.startReplaceableGroup(-1323940314);
                                            androidx.compose.runtime.ComposerKt.sourceInformation(composer6, "C(Layout)P(!1,2)74@2915L7,75@2970L7,76@3029L7,77@3041L460:Layout.kt#80mrfh");
                                            androidx.compose.runtime.ProvidableCompositionLocal<androidx.compose.ui.unit.Density> localDensity2222222 = androidx.compose.ui.platform.CompositionLocalsKt.getLocalDensity();
                                            androidx.compose.runtime.ComposerKt.sourceInformationMarkerStart(composer6, 2023513938, "C:CompositionLocal.kt#9igjgp");
                                            java.lang.Object consume2222222 = composer6.consume(localDensity2222222);
                                            androidx.compose.runtime.ComposerKt.sourceInformationMarkerEnd(composer6);
                                            androidx.compose.ui.unit.Density density = (androidx.compose.ui.unit.Density) consume2222222;
                                            androidx.compose.runtime.ProvidableCompositionLocal<androidx.compose.ui.unit.LayoutDirection> localLayoutDirection = androidx.compose.ui.platform.CompositionLocalsKt.getLocalLayoutDirection();
                                            androidx.compose.runtime.ComposerKt.sourceInformationMarkerStart(composer6, 2023513938, "C:CompositionLocal.kt#9igjgp");
                                            java.lang.Object consume3 = composer6.consume(localLayoutDirection);
                                            androidx.compose.runtime.ComposerKt.sourceInformationMarkerEnd(composer6);
                                            androidx.compose.ui.unit.LayoutDirection layoutDirection = (androidx.compose.ui.unit.LayoutDirection) consume3;
                                            androidx.compose.runtime.ProvidableCompositionLocal<androidx.compose.ui.platform.ViewConfiguration> localViewConfiguration = androidx.compose.ui.platform.CompositionLocalsKt.getLocalViewConfiguration();
                                            androidx.compose.runtime.ComposerKt.sourceInformationMarkerStart(composer6, 2023513938, "C:CompositionLocal.kt#9igjgp");
                                            java.lang.Object consume4 = composer6.consume(localViewConfiguration);
                                            androidx.compose.runtime.ComposerKt.sourceInformationMarkerEnd(composer6);
                                            androidx.compose.ui.platform.ViewConfiguration viewConfiguration = (androidx.compose.ui.platform.ViewConfiguration) consume4;
                                            kotlin.jvm.functions.Function0<androidx.compose.ui.node.ComposeUiNode> constructor = androidx.compose.ui.node.ComposeUiNode.INSTANCE.getConstructor();
                                            kotlin.jvm.functions.Function3<androidx.compose.runtime.SkippableUpdater<androidx.compose.ui.node.ComposeUiNode>, androidx.compose.runtime.Composer, java.lang.Integer, kotlin.Unit> materializerOf = androidx.compose.ui.layout.LayoutKt.materializerOf(companion3);
                                            if (!(composer6.getApplier() instanceof androidx.compose.runtime.Applier)) {
                                                androidx.compose.runtime.ComposablesKt.invalidApplier();
                                            }
                                            composer6.startReusableNode();
                                            if (composer6.getInserting()) {
                                                composer6.createNode(constructor);
                                            } else {
                                                composer6.useNode();
                                            }
                                            composer6.disableReusing();
                                            androidx.compose.runtime.Composer m1641constructorimpl = androidx.compose.runtime.Updater.m1641constructorimpl(composer6);
                                            androidx.compose.runtime.Updater.m1648setimpl(m1641constructorimpl, columnMeasurePolicy, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetMeasurePolicy());
                                            androidx.compose.runtime.Updater.m1648setimpl(m1641constructorimpl, density, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetDensity());
                                            androidx.compose.runtime.Updater.m1648setimpl(m1641constructorimpl, layoutDirection, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetLayoutDirection());
                                            androidx.compose.runtime.Updater.m1648setimpl(m1641constructorimpl, viewConfiguration, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetViewConfiguration());
                                            composer6.enableReusing();
                                            materializerOf.invoke(androidx.compose.runtime.SkippableUpdater.m1632boximpl(androidx.compose.runtime.SkippableUpdater.m1633constructorimpl(composer6)), composer6, 0);
                                            composer6.startReplaceableGroup(2058660585);
                                            composer6.startReplaceableGroup(-1163856341);
                                            androidx.compose.runtime.ComposerKt.sourceInformation(composer6, "C79@3994L9:Column.kt#2w3rfo");
                                            function310.invoke(androidx.compose.foundation.layout.ColumnScopeInstance.INSTANCE, composer6, java.lang.Integer.valueOf(((i54 >> 6) & 112) | 6));
                                            composer6.endReplaceableGroup();
                                            composer6.endReplaceableGroup();
                                            composer6.endNode();
                                            composer6.endReplaceableGroup();
                                            composer6.endReplaceableGroup();
                                        }
                                    });
                                    int i53 = i47222222;
                                    int i54 = i48;
                                    androidx.compose.material.SurfaceKt.m1511SurfaceFjzlyU(onSizeChanged, shape82, j32222222, j332, null, f16, composableLambda3, composer5, ((i53 >> 21) & 112) | 1572864 | ((i54 << 6) & 896) | ((i54 << 6) & 7168) | ((i53 >> 12) & 458752), 16);
                                    return;
                                }
                                composer5.skipToGroupEnd();
                            }
                        });
                        kotlin.jvm.functions.Function2<androidx.compose.runtime.Composer, java.lang.Integer, kotlin.Unit> function211 = function29222222;
                        final kotlin.jvm.functions.Function3<? super androidx.compose.material.SnackbarHostState, ? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.Unit> function39 = function36222222;
                        final androidx.compose.material.BottomSheetScaffoldState bottomSheetScaffoldState52 = androidx.compose.material.BottomSheetScaffoldState.this;
                        final int i49 = i43222222;
                        androidx.compose.runtime.internal.ComposableLambda composableLambda3 = androidx.compose.runtime.internal.ComposableLambdaKt.composableLambda(composer4, -486138068, true, new kotlin.jvm.functions.Function2<androidx.compose.runtime.Composer, java.lang.Integer, kotlin.Unit>() { // from class: androidx.compose.material.BottomSheetScaffoldKt$BottomSheetScaffold$child$1.2
                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            /* JADX WARN: Multi-variable type inference failed */
                            {
                                super(2);
                            }

                            @Override // kotlin.jvm.functions.Function2
                            public /* bridge */ /* synthetic */ kotlin.Unit invoke(androidx.compose.runtime.Composer composer5, java.lang.Integer num) {
                                invoke(composer5, num.intValue());
                                return kotlin.Unit.INSTANCE;
                            }

                            public final void invoke(androidx.compose.runtime.Composer composer5, int i50) {
                                androidx.compose.runtime.ComposerKt.sourceInformation(composer5, "C365@15680L45:BottomSheetScaffold.kt#jmzs0o");
                                if ((i50 & 11) == 2 && composer5.getSkipping()) {
                                    composer5.skipToGroupEnd();
                                } else {
                                    function39.invoke(bottomSheetScaffoldState52.getSnackbarHostState(), composer5, java.lang.Integer.valueOf((i49 >> 9) & 112));
                                }
                            }
                        });
                        float f15 = f10222222;
                        int i50 = i42222222;
                        int i51 = i43222222;
                        androidx.compose.material.BottomSheetScaffoldKt.m1257BottomSheetScaffoldLayoutKCBPh4w(function210, function37222222, composableLambda2222222, function211, composableLambda3, f15, i50, offset, bottomSheetState, composer4, ((i51 >> 9) & 14) | 24960 | ((i44222222 >> 3) & 112) | ((i51 >> 6) & 7168) | ((i45222222 << 9) & 458752) | (i51 & 3670016));
                        return;
                    }
                    composer4.skipToGroupEnd();
                }
            });
            androidx.compose.ui.Modifier modifier6222222 = modifier3;
            final kotlin.jvm.functions.Function3<? super androidx.compose.foundation.layout.ColumnScope, ? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.Unit> function37222222 = function34;
            final androidx.compose.material.BottomSheetScaffoldState bottomSheetScaffoldState4222222 = bottomSheetScaffoldState2;
            final boolean z6222222 = z4;
            final androidx.compose.ui.graphics.Shape shape7222222 = shape4;
            final float f12222222 = f6;
            final long j30222222 = j17;
            final long j31222222 = j13;
            final long j32222222 = j20;
            final int i46222222 = i21;
            int i47222222 = i33 << 6;
            androidx.compose.material.SurfaceKt.m1511SurfaceFjzlyU(androidx.compose.foundation.layout.SizeKt.fillMaxSize$default(modifier6222222, 0.0f, 1, null), null, j19, j18, null, 0.0f, androidx.compose.runtime.internal.ComposableLambdaKt.composableLambda(composer3, 1273816607, true, new kotlin.jvm.functions.Function2<androidx.compose.runtime.Composer, java.lang.Integer, kotlin.Unit>() { // from class: androidx.compose.material.BottomSheetScaffoldKt$BottomSheetScaffold$1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                /* JADX WARN: Multi-variable type inference failed */
                {
                    super(2);
                }

                @Override // kotlin.jvm.functions.Function2
                public /* bridge */ /* synthetic */ kotlin.Unit invoke(androidx.compose.runtime.Composer composer4, java.lang.Integer num) {
                    invoke(composer4, num.intValue());
                    return kotlin.Unit.INSTANCE;
                }

                public final void invoke(androidx.compose.runtime.Composer composer4, int i48) {
                    androidx.compose.runtime.ComposerKt.sourceInformation(composer4, "C:BottomSheetScaffold.kt#jmzs0o");
                    if ((i48 & 11) != 2 || !composer4.getSkipping()) {
                        if (function37222222 == null) {
                            composer4.startReplaceableGroup(-249544858);
                            androidx.compose.runtime.ComposerKt.sourceInformation(composer4, "381@16183L7");
                            composableLambda222222.invoke(composer4, 6);
                            composer4.endReplaceableGroup();
                            return;
                        }
                        composer4.startReplaceableGroup(-249544821);
                        androidx.compose.runtime.ComposerKt.sourceInformation(composer4, "383@16220L480");
                        kotlin.jvm.functions.Function3<androidx.compose.foundation.layout.ColumnScope, androidx.compose.runtime.Composer, java.lang.Integer, kotlin.Unit> function38 = function37222222;
                        androidx.compose.material.DrawerState drawerState = bottomSheetScaffoldState4222222.getDrawerState();
                        boolean z72 = z6222222;
                        androidx.compose.ui.graphics.Shape shape82 = shape7222222;
                        float f132 = f12222222;
                        long j332 = j30222222;
                        long j34 = j31222222;
                        long j35 = j32222222;
                        kotlin.jvm.functions.Function2<androidx.compose.runtime.Composer, java.lang.Integer, kotlin.Unit> function210 = composableLambda222222;
                        int i49 = i46222222;
                        androidx.compose.material.DrawerKt.m1364ModalDrawerGs3lGvM(function38, null, drawerState, z72, shape82, f132, j332, j34, j35, function210, composer4, ((i49 >> 3) & 7168) | ((i49 >> 9) & 14) | 805306368 | ((i49 >> 3) & 57344) | ((i49 >> 3) & 458752) | ((i49 >> 3) & 3670016) | ((i49 >> 3) & 29360128) | ((i49 >> 3) & 234881024), 2);
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
        kotlin.jvm.functions.Function2<? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.Unit> function272222222 = function26;
        if ((i5 & 2048) == 0) {
        }
        if (i16 == 0) {
        }
        if (i25 == 0) {
        }
        if (i27 == 0) {
        }
        float f92222222 = m1255getSheetPeekHeightD9Ej5fM;
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
        androidx.compose.runtime.ComposerKt.sourceInformation(startRestartGroup, "C(rememberCoroutineScope)475@19849L144:Effects.kt#9igjgp");
        startRestartGroup.startReplaceableGroup(-492369756);
        androidx.compose.runtime.ComposerKt.sourceInformation(startRestartGroup, "C(remember):Composables.kt#9igjgp");
        rememberedValue = startRestartGroup.rememberedValue();
        if (rememberedValue == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
        }
        startRestartGroup.endReplaceableGroup();
        final kotlinx.coroutines.CoroutineScope coroutineScope2222222 = ((androidx.compose.runtime.CompositionScopedCoroutineScopeCanceller) rememberedValue).getCoroutineScope();
        startRestartGroup.endReplaceableGroup();
        androidx.compose.runtime.ProvidableCompositionLocal<androidx.compose.ui.unit.Density> localDensity2222222 = androidx.compose.ui.platform.CompositionLocalsKt.getLocalDensity();
        androidx.compose.runtime.ComposerKt.sourceInformationMarkerStart(startRestartGroup, 2023513938, "C:CompositionLocal.kt#9igjgp");
        java.lang.Object consume2222222 = startRestartGroup.consume(localDensity2222222);
        androidx.compose.runtime.ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
        mo315toPx0680j_4 = ((androidx.compose.ui.unit.Density) consume2222222).mo315toPx0680j_4(f5);
        startRestartGroup.startReplaceableGroup(-492369756);
        androidx.compose.runtime.ComposerKt.sourceInformation(startRestartGroup, "C(remember):Composables.kt#9igjgp");
        rememberedValue2 = startRestartGroup.rememberedValue();
        if (rememberedValue2 != androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
        }
        startRestartGroup.endReplaceableGroup();
        mutableState = (androidx.compose.runtime.MutableState) obj;
        if (kotlin.jvm.internal.Intrinsics.areEqual(mo315toPx0680j_4, m1258BottomSheetScaffold_bGncdBI$lambda4(mutableState))) {
        }
        final androidx.compose.material.BottomSheetScaffoldState bottomSheetScaffoldState32222222 = bottomSheetScaffoldState2;
        final kotlin.jvm.functions.Function2<? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.Unit> function282222222 = function24;
        final kotlin.jvm.functions.Function2<? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.Unit> function292222222 = function23;
        final float f102222222 = f5;
        final int i422222222 = m1403getEnd5ygKITE;
        final int i432222222 = i32;
        final int i442222222 = i33;
        final int i452222222 = i21;
        final boolean z52222222 = z3;
        final androidx.compose.ui.Modifier companion22222222 = companion;
        final androidx.compose.ui.graphics.Shape shape62222222 = cornerBasedShape;
        final long j282222222 = j11;
        final long j292222222 = j10;
        final float f112222222 = m1254getSheetElevationD9Ej5fM;
        final kotlin.jvm.functions.Function3<? super androidx.compose.material.SnackbarHostState, ? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.Unit> function362222222 = m1340getLambda1$material_release;
        composer3 = composer2;
        final kotlin.jvm.functions.Function2<? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.Unit> composableLambda2222222 = androidx.compose.runtime.internal.ComposableLambdaKt.composableLambda(composer3, 893101063, true, new kotlin.jvm.functions.Function2<androidx.compose.runtime.Composer, java.lang.Integer, kotlin.Unit>() { // from class: androidx.compose.material.BottomSheetScaffoldKt$BottomSheetScaffold$child$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            {
                super(2);
            }

            @Override // kotlin.jvm.functions.Function2
            public /* bridge */ /* synthetic */ kotlin.Unit invoke(androidx.compose.runtime.Composer composer4, java.lang.Integer num) {
                invoke(composer4, num.intValue());
                return kotlin.Unit.INSTANCE;
            }

            public final void invoke(androidx.compose.runtime.Composer composer4, int i462222222) {
                androidx.compose.runtime.ComposerKt.sourceInformation(composer4, "C316@13233L2758:BottomSheetScaffold.kt#jmzs0o");
                if ((i462222222 & 11) != 2 || !composer4.getSkipping()) {
                    androidx.compose.runtime.State<java.lang.Float> offset = androidx.compose.material.BottomSheetScaffoldState.this.getBottomSheetState().getOffset();
                    androidx.compose.material.BottomSheetState bottomSheetState = androidx.compose.material.BottomSheetScaffoldState.this.getBottomSheetState();
                    kotlin.jvm.functions.Function2<androidx.compose.runtime.Composer, java.lang.Integer, kotlin.Unit> function210 = function282222222;
                    kotlin.jvm.functions.Function3<androidx.compose.foundation.layout.PaddingValues, androidx.compose.runtime.Composer, java.lang.Integer, kotlin.Unit> function372222222 = content;
                    final float f122222222 = mo315toPx0680j_4;
                    final androidx.compose.material.BottomSheetScaffoldState bottomSheetScaffoldState42222222 = androidx.compose.material.BottomSheetScaffoldState.this;
                    final boolean z62222222 = z52222222;
                    final androidx.compose.ui.Modifier modifier62222222 = companion22222222;
                    final float f132 = f102222222;
                    final androidx.compose.runtime.MutableState<java.lang.Float> mutableState2 = mutableState;
                    final androidx.compose.ui.graphics.Shape shape72222222 = shape62222222;
                    final long j302222222 = j282222222;
                    final long j312222222 = j292222222;
                    final float f14 = f112222222;
                    final int i472222222 = i432222222;
                    final int i48 = i452222222;
                    final kotlin.jvm.functions.Function3<? super androidx.compose.foundation.layout.ColumnScope, ? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.Unit> function38 = sheetContent;
                    androidx.compose.runtime.internal.ComposableLambda composableLambda22222222 = androidx.compose.runtime.internal.ComposableLambdaKt.composableLambda(composer4, -1378534681, true, new kotlin.jvm.functions.Function3<java.lang.Integer, androidx.compose.runtime.Composer, java.lang.Integer, kotlin.Unit>() { // from class: androidx.compose.material.BottomSheetScaffoldKt$BottomSheetScaffold$child$1.1
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        /* JADX WARN: Multi-variable type inference failed */
                        {
                            super(3);
                        }

                        @Override // kotlin.jvm.functions.Function3
                        public /* bridge */ /* synthetic */ kotlin.Unit invoke(java.lang.Integer num, androidx.compose.runtime.Composer composer5, java.lang.Integer num2) {
                            invoke(num.intValue(), composer5, num2.intValue());
                            return kotlin.Unit.INSTANCE;
                        }

                        public final void invoke(int i49, androidx.compose.runtime.Composer composer5, int i50) {
                            int i51;
                            java.lang.Float m1258BottomSheetScaffold_bGncdBI$lambda4;
                            java.lang.Float m1258BottomSheetScaffold_bGncdBI$lambda42;
                            java.util.Map mapOf;
                            androidx.compose.ui.Modifier.Companion m1521swipeablepPrIpRY;
                            androidx.compose.runtime.ComposerKt.sourceInformation(composer5, "C354@15208L95,347@14851L711:BottomSheetScaffold.kt#jmzs0o");
                            if ((i50 & 14) == 0) {
                                i51 = i50 | (composer5.changed(i49) ? 4 : 2);
                            } else {
                                i51 = i50;
                            }
                            if ((i51 & 91) != 18 || !composer5.getSkipping()) {
                                m1258BottomSheetScaffold_bGncdBI$lambda4 = androidx.compose.material.BottomSheetScaffoldKt.m1258BottomSheetScaffold_bGncdBI$lambda4(mutableState2);
                                if (m1258BottomSheetScaffold_bGncdBI$lambda4 == null) {
                                    m1521swipeablepPrIpRY = androidx.compose.ui.Modifier.INSTANCE;
                                } else {
                                    if (kotlin.math.MathKt.roundToInt(m1258BottomSheetScaffold_bGncdBI$lambda4.floatValue()) != kotlin.math.MathKt.roundToInt(f122222222)) {
                                        float f15 = i49;
                                        m1258BottomSheetScaffold_bGncdBI$lambda42 = androidx.compose.material.BottomSheetScaffoldKt.m1258BottomSheetScaffold_bGncdBI$lambda4(mutableState2);
                                        kotlin.jvm.internal.Intrinsics.checkNotNull(m1258BottomSheetScaffold_bGncdBI$lambda42);
                                        mapOf = kotlin.collections.MapsKt.mapOf(kotlin.TuplesKt.to(java.lang.Float.valueOf(f15 - m1258BottomSheetScaffold_bGncdBI$lambda42.floatValue()), androidx.compose.material.BottomSheetValue.Expanded), kotlin.TuplesKt.to(java.lang.Float.valueOf(f15 - f122222222), androidx.compose.material.BottomSheetValue.Collapsed));
                                    } else {
                                        mapOf = kotlin.collections.MapsKt.mapOf(kotlin.TuplesKt.to(java.lang.Float.valueOf(i49 - m1258BottomSheetScaffold_bGncdBI$lambda4.floatValue()), androidx.compose.material.BottomSheetValue.Collapsed));
                                    }
                                    m1521swipeablepPrIpRY = androidx.compose.material.SwipeableKt.m1521swipeablepPrIpRY(androidx.compose.ui.Modifier.INSTANCE, bottomSheetScaffoldState42222222.getBottomSheetState(), r13, androidx.compose.foundation.gestures.Orientation.Vertical, (r26 & 8) != 0 ? true : z62222222, (r26 & 16) != 0 ? false : false, (r26 & 32) != 0 ? null : null, (r26 & 64) != 0 ? new kotlin.jvm.functions.Function2<T, T, androidx.compose.material.FixedThreshold>() { // from class: androidx.compose.material.SwipeableKt$swipeable$1
                                        /* JADX WARN: Can't rename method to resolve collision */
                                        @Override // kotlin.jvm.functions.Function2
                                        public final androidx.compose.material.FixedThreshold invoke(T t, T t2) {
                                            return new androidx.compose.material.FixedThreshold(androidx.compose.ui.unit.Dp.m4478constructorimpl(56), null);
                                        }
                                    } : null, (r26 & 128) != 0 ? androidx.compose.material.SwipeableDefaults.resistanceConfig$default(androidx.compose.material.SwipeableDefaults.INSTANCE, mapOf.keySet(), 0.0f, 0.0f, 6, null) : null, (r26 & 256) != 0 ? androidx.compose.material.SwipeableDefaults.INSTANCE.m1520getVelocityThresholdD9Ej5fM() : 0.0f);
                                }
                                androidx.compose.ui.Modifier m608requiredHeightInVpY3zN4$default = androidx.compose.foundation.layout.SizeKt.m608requiredHeightInVpY3zN4$default(androidx.compose.foundation.layout.SizeKt.fillMaxWidth$default(androidx.compose.ui.input.nestedscroll.NestedScrollModifierKt.nestedScroll$default(androidx.compose.ui.Modifier.INSTANCE, bottomSheetScaffoldState42222222.getBottomSheetState().getNestedScrollConnection(), null, 2, null).then(m1521swipeablepPrIpRY).then(modifier62222222), 0.0f, 1, null), f132, 0.0f, 2, null);
                                final androidx.compose.runtime.MutableState<java.lang.Float> mutableState3 = mutableState2;
                                composer5.startReplaceableGroup(1157296644);
                                androidx.compose.runtime.ComposerKt.sourceInformation(composer5, "C(remember)P(1):Composables.kt#9igjgp");
                                boolean changed = composer5.changed(mutableState3);
                                java.lang.Object rememberedValue3 = composer5.rememberedValue();
                                if (changed || rememberedValue3 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                                    rememberedValue3 = (kotlin.jvm.functions.Function1) new kotlin.jvm.functions.Function1<androidx.compose.ui.unit.IntSize, kotlin.Unit>() { // from class: androidx.compose.material.BottomSheetScaffoldKt$BottomSheetScaffold$child$1$1$1$1
                                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                        {
                                            super(1);
                                        }

                                        @Override // kotlin.jvm.functions.Function1
                                        public /* bridge */ /* synthetic */ kotlin.Unit invoke(androidx.compose.ui.unit.IntSize intSize) {
                                            m1263invokeozmzZPI(intSize.getPackedValue());
                                            return kotlin.Unit.INSTANCE;
                                        }

                                        /* renamed from: invoke-ozmzZPI, reason: not valid java name */
                                        public final void m1263invokeozmzZPI(long j322222222) {
                                            mutableState3.setValue(java.lang.Float.valueOf(androidx.compose.ui.unit.IntSize.m4651getHeightimpl(j322222222)));
                                        }
                                    };
                                    composer5.updateRememberedValue(rememberedValue3);
                                }
                                composer5.endReplaceableGroup();
                                androidx.compose.ui.Modifier onSizeChanged = androidx.compose.ui.layout.OnRemeasuredModifierKt.onSizeChanged(m608requiredHeightInVpY3zN4$default, (kotlin.jvm.functions.Function1) rememberedValue3);
                                androidx.compose.ui.graphics.Shape shape82 = shape72222222;
                                long j322222222 = j302222222;
                                long j332 = j312222222;
                                float f16 = f14;
                                final kotlin.jvm.functions.Function3<? super androidx.compose.foundation.layout.ColumnScope, ? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.Unit> function39 = function38;
                                final int i52 = i472222222;
                                androidx.compose.runtime.internal.ComposableLambda composableLambda3 = androidx.compose.runtime.internal.ComposableLambdaKt.composableLambda(composer5, -698903261, true, new kotlin.jvm.functions.Function2<androidx.compose.runtime.Composer, java.lang.Integer, kotlin.Unit>() { // from class: androidx.compose.material.BottomSheetScaffoldKt.BottomSheetScaffold.child.1.1.2
                                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                    /* JADX WARN: Multi-variable type inference failed */
                                    {
                                        super(2);
                                    }

                                    @Override // kotlin.jvm.functions.Function2
                                    public /* bridge */ /* synthetic */ kotlin.Unit invoke(androidx.compose.runtime.Composer composer6, java.lang.Integer num) {
                                        invoke(composer6, num.intValue());
                                        return kotlin.Unit.INSTANCE;
                                    }

                                    public final void invoke(androidx.compose.runtime.Composer composer6, int i53) {
                                        androidx.compose.runtime.ComposerKt.sourceInformation(composer6, "C361@15529L30:BottomSheetScaffold.kt#jmzs0o");
                                        if ((i53 & 11) == 2 && composer6.getSkipping()) {
                                            composer6.skipToGroupEnd();
                                            return;
                                        }
                                        kotlin.jvm.functions.Function3<androidx.compose.foundation.layout.ColumnScope, androidx.compose.runtime.Composer, java.lang.Integer, kotlin.Unit> function310 = function39;
                                        int i54 = (i52 << 9) & 7168;
                                        composer6.startReplaceableGroup(-483455358);
                                        androidx.compose.runtime.ComposerKt.sourceInformation(composer6, "C(Column)P(2,3,1)77@3880L61,78@3946L133:Column.kt#2w3rfo");
                                        androidx.compose.ui.Modifier.Companion companion3 = androidx.compose.ui.Modifier.INSTANCE;
                                        androidx.compose.ui.layout.MeasurePolicy columnMeasurePolicy = androidx.compose.foundation.layout.ColumnKt.columnMeasurePolicy(androidx.compose.foundation.layout.Arrangement.INSTANCE.getTop(), androidx.compose.ui.Alignment.INSTANCE.getStart(), composer6, 0);
                                        composer6.startReplaceableGroup(-1323940314);
                                        androidx.compose.runtime.ComposerKt.sourceInformation(composer6, "C(Layout)P(!1,2)74@2915L7,75@2970L7,76@3029L7,77@3041L460:Layout.kt#80mrfh");
                                        androidx.compose.runtime.ProvidableCompositionLocal<androidx.compose.ui.unit.Density> localDensity22222222 = androidx.compose.ui.platform.CompositionLocalsKt.getLocalDensity();
                                        androidx.compose.runtime.ComposerKt.sourceInformationMarkerStart(composer6, 2023513938, "C:CompositionLocal.kt#9igjgp");
                                        java.lang.Object consume22222222 = composer6.consume(localDensity22222222);
                                        androidx.compose.runtime.ComposerKt.sourceInformationMarkerEnd(composer6);
                                        androidx.compose.ui.unit.Density density = (androidx.compose.ui.unit.Density) consume22222222;
                                        androidx.compose.runtime.ProvidableCompositionLocal<androidx.compose.ui.unit.LayoutDirection> localLayoutDirection = androidx.compose.ui.platform.CompositionLocalsKt.getLocalLayoutDirection();
                                        androidx.compose.runtime.ComposerKt.sourceInformationMarkerStart(composer6, 2023513938, "C:CompositionLocal.kt#9igjgp");
                                        java.lang.Object consume3 = composer6.consume(localLayoutDirection);
                                        androidx.compose.runtime.ComposerKt.sourceInformationMarkerEnd(composer6);
                                        androidx.compose.ui.unit.LayoutDirection layoutDirection = (androidx.compose.ui.unit.LayoutDirection) consume3;
                                        androidx.compose.runtime.ProvidableCompositionLocal<androidx.compose.ui.platform.ViewConfiguration> localViewConfiguration = androidx.compose.ui.platform.CompositionLocalsKt.getLocalViewConfiguration();
                                        androidx.compose.runtime.ComposerKt.sourceInformationMarkerStart(composer6, 2023513938, "C:CompositionLocal.kt#9igjgp");
                                        java.lang.Object consume4 = composer6.consume(localViewConfiguration);
                                        androidx.compose.runtime.ComposerKt.sourceInformationMarkerEnd(composer6);
                                        androidx.compose.ui.platform.ViewConfiguration viewConfiguration = (androidx.compose.ui.platform.ViewConfiguration) consume4;
                                        kotlin.jvm.functions.Function0<androidx.compose.ui.node.ComposeUiNode> constructor = androidx.compose.ui.node.ComposeUiNode.INSTANCE.getConstructor();
                                        kotlin.jvm.functions.Function3<androidx.compose.runtime.SkippableUpdater<androidx.compose.ui.node.ComposeUiNode>, androidx.compose.runtime.Composer, java.lang.Integer, kotlin.Unit> materializerOf = androidx.compose.ui.layout.LayoutKt.materializerOf(companion3);
                                        if (!(composer6.getApplier() instanceof androidx.compose.runtime.Applier)) {
                                            androidx.compose.runtime.ComposablesKt.invalidApplier();
                                        }
                                        composer6.startReusableNode();
                                        if (composer6.getInserting()) {
                                            composer6.createNode(constructor);
                                        } else {
                                            composer6.useNode();
                                        }
                                        composer6.disableReusing();
                                        androidx.compose.runtime.Composer m1641constructorimpl = androidx.compose.runtime.Updater.m1641constructorimpl(composer6);
                                        androidx.compose.runtime.Updater.m1648setimpl(m1641constructorimpl, columnMeasurePolicy, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetMeasurePolicy());
                                        androidx.compose.runtime.Updater.m1648setimpl(m1641constructorimpl, density, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetDensity());
                                        androidx.compose.runtime.Updater.m1648setimpl(m1641constructorimpl, layoutDirection, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetLayoutDirection());
                                        androidx.compose.runtime.Updater.m1648setimpl(m1641constructorimpl, viewConfiguration, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetViewConfiguration());
                                        composer6.enableReusing();
                                        materializerOf.invoke(androidx.compose.runtime.SkippableUpdater.m1632boximpl(androidx.compose.runtime.SkippableUpdater.m1633constructorimpl(composer6)), composer6, 0);
                                        composer6.startReplaceableGroup(2058660585);
                                        composer6.startReplaceableGroup(-1163856341);
                                        androidx.compose.runtime.ComposerKt.sourceInformation(composer6, "C79@3994L9:Column.kt#2w3rfo");
                                        function310.invoke(androidx.compose.foundation.layout.ColumnScopeInstance.INSTANCE, composer6, java.lang.Integer.valueOf(((i54 >> 6) & 112) | 6));
                                        composer6.endReplaceableGroup();
                                        composer6.endReplaceableGroup();
                                        composer6.endNode();
                                        composer6.endReplaceableGroup();
                                        composer6.endReplaceableGroup();
                                    }
                                });
                                int i53 = i472222222;
                                int i54 = i48;
                                androidx.compose.material.SurfaceKt.m1511SurfaceFjzlyU(onSizeChanged, shape82, j322222222, j332, null, f16, composableLambda3, composer5, ((i53 >> 21) & 112) | 1572864 | ((i54 << 6) & 896) | ((i54 << 6) & 7168) | ((i53 >> 12) & 458752), 16);
                                return;
                            }
                            composer5.skipToGroupEnd();
                        }
                    });
                    kotlin.jvm.functions.Function2<androidx.compose.runtime.Composer, java.lang.Integer, kotlin.Unit> function211 = function292222222;
                    final kotlin.jvm.functions.Function3<? super androidx.compose.material.SnackbarHostState, ? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.Unit> function39 = function362222222;
                    final androidx.compose.material.BottomSheetScaffoldState bottomSheetScaffoldState52 = androidx.compose.material.BottomSheetScaffoldState.this;
                    final int i49 = i432222222;
                    androidx.compose.runtime.internal.ComposableLambda composableLambda3 = androidx.compose.runtime.internal.ComposableLambdaKt.composableLambda(composer4, -486138068, true, new kotlin.jvm.functions.Function2<androidx.compose.runtime.Composer, java.lang.Integer, kotlin.Unit>() { // from class: androidx.compose.material.BottomSheetScaffoldKt$BottomSheetScaffold$child$1.2
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        /* JADX WARN: Multi-variable type inference failed */
                        {
                            super(2);
                        }

                        @Override // kotlin.jvm.functions.Function2
                        public /* bridge */ /* synthetic */ kotlin.Unit invoke(androidx.compose.runtime.Composer composer5, java.lang.Integer num) {
                            invoke(composer5, num.intValue());
                            return kotlin.Unit.INSTANCE;
                        }

                        public final void invoke(androidx.compose.runtime.Composer composer5, int i50) {
                            androidx.compose.runtime.ComposerKt.sourceInformation(composer5, "C365@15680L45:BottomSheetScaffold.kt#jmzs0o");
                            if ((i50 & 11) == 2 && composer5.getSkipping()) {
                                composer5.skipToGroupEnd();
                            } else {
                                function39.invoke(bottomSheetScaffoldState52.getSnackbarHostState(), composer5, java.lang.Integer.valueOf((i49 >> 9) & 112));
                            }
                        }
                    });
                    float f15 = f102222222;
                    int i50 = i422222222;
                    int i51 = i432222222;
                    androidx.compose.material.BottomSheetScaffoldKt.m1257BottomSheetScaffoldLayoutKCBPh4w(function210, function372222222, composableLambda22222222, function211, composableLambda3, f15, i50, offset, bottomSheetState, composer4, ((i51 >> 9) & 14) | 24960 | ((i442222222 >> 3) & 112) | ((i51 >> 6) & 7168) | ((i452222222 << 9) & 458752) | (i51 & 3670016));
                    return;
                }
                composer4.skipToGroupEnd();
            }
        });
        androidx.compose.ui.Modifier modifier62222222 = modifier3;
        final kotlin.jvm.functions.Function3<? super androidx.compose.foundation.layout.ColumnScope, ? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.Unit> function372222222 = function34;
        final androidx.compose.material.BottomSheetScaffoldState bottomSheetScaffoldState42222222 = bottomSheetScaffoldState2;
        final boolean z62222222 = z4;
        final androidx.compose.ui.graphics.Shape shape72222222 = shape4;
        final float f122222222 = f6;
        final long j302222222 = j17;
        final long j312222222 = j13;
        final long j322222222 = j20;
        final int i462222222 = i21;
        int i472222222 = i33 << 6;
        androidx.compose.material.SurfaceKt.m1511SurfaceFjzlyU(androidx.compose.foundation.layout.SizeKt.fillMaxSize$default(modifier62222222, 0.0f, 1, null), null, j19, j18, null, 0.0f, androidx.compose.runtime.internal.ComposableLambdaKt.composableLambda(composer3, 1273816607, true, new kotlin.jvm.functions.Function2<androidx.compose.runtime.Composer, java.lang.Integer, kotlin.Unit>() { // from class: androidx.compose.material.BottomSheetScaffoldKt$BottomSheetScaffold$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            {
                super(2);
            }

            @Override // kotlin.jvm.functions.Function2
            public /* bridge */ /* synthetic */ kotlin.Unit invoke(androidx.compose.runtime.Composer composer4, java.lang.Integer num) {
                invoke(composer4, num.intValue());
                return kotlin.Unit.INSTANCE;
            }

            public final void invoke(androidx.compose.runtime.Composer composer4, int i48) {
                androidx.compose.runtime.ComposerKt.sourceInformation(composer4, "C:BottomSheetScaffold.kt#jmzs0o");
                if ((i48 & 11) != 2 || !composer4.getSkipping()) {
                    if (function372222222 == null) {
                        composer4.startReplaceableGroup(-249544858);
                        androidx.compose.runtime.ComposerKt.sourceInformation(composer4, "381@16183L7");
                        composableLambda2222222.invoke(composer4, 6);
                        composer4.endReplaceableGroup();
                        return;
                    }
                    composer4.startReplaceableGroup(-249544821);
                    androidx.compose.runtime.ComposerKt.sourceInformation(composer4, "383@16220L480");
                    kotlin.jvm.functions.Function3<androidx.compose.foundation.layout.ColumnScope, androidx.compose.runtime.Composer, java.lang.Integer, kotlin.Unit> function38 = function372222222;
                    androidx.compose.material.DrawerState drawerState = bottomSheetScaffoldState42222222.getDrawerState();
                    boolean z72 = z62222222;
                    androidx.compose.ui.graphics.Shape shape82 = shape72222222;
                    float f132 = f122222222;
                    long j332 = j302222222;
                    long j34 = j312222222;
                    long j35 = j322222222;
                    kotlin.jvm.functions.Function2<androidx.compose.runtime.Composer, java.lang.Integer, kotlin.Unit> function210 = composableLambda2222222;
                    int i49 = i462222222;
                    androidx.compose.material.DrawerKt.m1364ModalDrawerGs3lGvM(function38, null, drawerState, z72, shape82, f132, j332, j34, j35, function210, composer4, ((i49 >> 3) & 7168) | ((i49 >> 9) & 14) | 805306368 | ((i49 >> 3) & 57344) | ((i49 >> 3) & 458752) | ((i49 >> 3) & 3670016) | ((i49 >> 3) & 29360128) | ((i49 >> 3) & 234881024), 2);
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
    public static final java.lang.Float m1258BottomSheetScaffold_bGncdBI$lambda4(androidx.compose.runtime.MutableState<java.lang.Float> mutableState) {
        return mutableState.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: BottomSheetScaffoldLayout-KCBPh4w, reason: not valid java name */
    public static final void m1257BottomSheetScaffoldLayoutKCBPh4w(final kotlin.jvm.functions.Function2<? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.Unit> function2, final kotlin.jvm.functions.Function3<? super androidx.compose.foundation.layout.PaddingValues, ? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.Unit> function3, final kotlin.jvm.functions.Function3<? super java.lang.Integer, ? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.Unit> function32, final kotlin.jvm.functions.Function2<? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.Unit> function22, final kotlin.jvm.functions.Function2<? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.Unit> function23, final float f, final int i, final androidx.compose.runtime.State<java.lang.Float> state, final androidx.compose.material.BottomSheetState bottomSheetState, androidx.compose.runtime.Composer composer, final int i2) {
        androidx.compose.runtime.Composer composer2;
        androidx.compose.runtime.Composer startRestartGroup = composer.startRestartGroup(499725572);
        androidx.compose.runtime.ComposerKt.sourceInformation(startRestartGroup, "C(BottomSheetScaffoldLayout)P(8!3,7,5:c#ui.unit.Dp,3:c#material.FabPosition)429@17635L2479,429@17618L2496:BottomSheetScaffold.kt#jmzs0o");
        int i3 = (i2 & 14) == 0 ? (startRestartGroup.changed(function2) ? 4 : 2) | i2 : i2;
        if ((i2 & 112) == 0) {
            i3 |= startRestartGroup.changed(function3) ? 32 : 16;
        }
        if ((i2 & 896) == 0) {
            i3 |= startRestartGroup.changed(function32) ? 256 : 128;
        }
        if ((i2 & 7168) == 0) {
            i3 |= startRestartGroup.changed(function22) ? 2048 : 1024;
        }
        if ((57344 & i2) == 0) {
            i3 |= startRestartGroup.changed(function23) ? 16384 : 8192;
        }
        if ((458752 & i2) == 0) {
            i3 |= startRestartGroup.changed(f) ? 131072 : 65536;
        }
        if ((3670016 & i2) == 0) {
            i3 |= startRestartGroup.changed(i) ? 1048576 : 524288;
        }
        if ((29360128 & i2) == 0) {
            i3 |= startRestartGroup.changed(state) ? 8388608 : 4194304;
        }
        if ((234881024 & i2) == 0) {
            i3 |= startRestartGroup.changed(bottomSheetState) ? androidx.core.view.accessibility.AccessibilityEventCompat.TYPE_VIEW_TARGETED_BY_SCROLL : 33554432;
        }
        final int i4 = i3;
        if ((i4 & 191739611) != 38347922 || !startRestartGroup.getSkipping()) {
            java.lang.Object[] objArr = {function32, state, function2, function3, androidx.compose.ui.unit.Dp.m4476boximpl(f), function22, androidx.compose.material.FabPosition.m1395boximpl(i), function23, bottomSheetState};
            startRestartGroup.startReplaceableGroup(-568225417);
            androidx.compose.runtime.ComposerKt.sourceInformation(startRestartGroup, "C(remember)P(1):Composables.kt#9igjgp");
            boolean z = false;
            for (int i5 = 0; i5 < 9; i5++) {
                z |= startRestartGroup.changed(objArr[i5]);
            }
            java.lang.Object rememberedValue = startRestartGroup.rememberedValue();
            if (z || rememberedValue == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                composer2 = startRestartGroup;
                rememberedValue = (kotlin.jvm.functions.Function2) new kotlin.jvm.functions.Function2<androidx.compose.ui.layout.SubcomposeMeasureScope, androidx.compose.ui.unit.Constraints, androidx.compose.ui.layout.MeasureResult>() { // from class: androidx.compose.material.BottomSheetScaffoldKt$BottomSheetScaffoldLayout$1$1

                    /* compiled from: BottomSheetScaffold.kt */
                    @kotlin.Metadata(k = 3, mv = {1, 6, 0}, xi = 48)
                    public /* synthetic */ class WhenMappings {
                        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

                        static {
                            int[] iArr = new int[androidx.compose.material.BottomSheetValue.values().length];
                            iArr[androidx.compose.material.BottomSheetValue.Collapsed.ordinal()] = 1;
                            iArr[androidx.compose.material.BottomSheetValue.Expanded.ordinal()] = 2;
                            $EnumSwitchMapping$0 = iArr;
                        }
                    }

                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    /* JADX WARN: Multi-variable type inference failed */
                    {
                        super(2);
                    }

                    @Override // kotlin.jvm.functions.Function2
                    public /* bridge */ /* synthetic */ androidx.compose.ui.layout.MeasureResult invoke(androidx.compose.ui.layout.SubcomposeMeasureScope subcomposeMeasureScope, androidx.compose.ui.unit.Constraints constraints) {
                        return m1264invoke0kLqBqw(subcomposeMeasureScope, constraints.getValue());
                    }

                    /* renamed from: invoke-0kLqBqw, reason: not valid java name */
                    public final androidx.compose.ui.layout.MeasureResult m1264invoke0kLqBqw(androidx.compose.ui.layout.SubcomposeMeasureScope SubcomposeLayout, long j) {
                        final androidx.compose.ui.layout.Placeable placeable;
                        float f2;
                        int i6;
                        int i7;
                        int height;
                        float f3;
                        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(SubcomposeLayout, "$this$SubcomposeLayout");
                        int m4424getMaxWidthimpl = androidx.compose.ui.unit.Constraints.m4424getMaxWidthimpl(j);
                        final int m4423getMaxHeightimpl = androidx.compose.ui.unit.Constraints.m4423getMaxHeightimpl(j);
                        long m4415copyZbe2FdA$default = androidx.compose.ui.unit.Constraints.m4415copyZbe2FdA$default(j, 0, 0, 0, 0, 10, null);
                        androidx.compose.material.BottomSheetScaffoldLayoutSlot bottomSheetScaffoldLayoutSlot = androidx.compose.material.BottomSheetScaffoldLayoutSlot.Sheet;
                        final kotlin.jvm.functions.Function3<java.lang.Integer, androidx.compose.runtime.Composer, java.lang.Integer, kotlin.Unit> function33 = function32;
                        final int i8 = i4;
                        final androidx.compose.ui.layout.Placeable mo3402measureBRTryo0 = SubcomposeLayout.subcompose(bottomSheetScaffoldLayoutSlot, androidx.compose.runtime.internal.ComposableLambdaKt.composableLambdaInstance(520491296, true, new kotlin.jvm.functions.Function2<androidx.compose.runtime.Composer, java.lang.Integer, kotlin.Unit>() { // from class: androidx.compose.material.BottomSheetScaffoldKt$BottomSheetScaffoldLayout$1$1$sheetPlaceable$1
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

                            public final void invoke(androidx.compose.runtime.Composer composer3, int i9) {
                                androidx.compose.runtime.ComposerKt.sourceInformation(composer3, "C435@17917L25:BottomSheetScaffold.kt#jmzs0o");
                                if ((i9 & 11) == 2 && composer3.getSkipping()) {
                                    composer3.skipToGroupEnd();
                                } else {
                                    function33.invoke(java.lang.Integer.valueOf(m4423getMaxHeightimpl), composer3, java.lang.Integer.valueOf((i8 >> 3) & 112));
                                }
                            }
                        })).get(0).mo3402measureBRTryo0(m4415copyZbe2FdA$default);
                        final int roundToInt = kotlin.math.MathKt.roundToInt(state.getValue().floatValue());
                        final kotlin.jvm.functions.Function2<androidx.compose.runtime.Composer, java.lang.Integer, kotlin.Unit> function24 = function2;
                        if (function24 != null) {
                            final int i9 = i4;
                            placeable = SubcomposeLayout.subcompose(androidx.compose.material.BottomSheetScaffoldLayoutSlot.TopBar, androidx.compose.runtime.internal.ComposableLambdaKt.composableLambdaInstance(1988456983, true, new kotlin.jvm.functions.Function2<androidx.compose.runtime.Composer, java.lang.Integer, kotlin.Unit>() { // from class: androidx.compose.material.BottomSheetScaffoldKt$BottomSheetScaffoldLayout$1$1$topBarPlaceable$1$1
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

                                public final void invoke(androidx.compose.runtime.Composer composer3, int i10) {
                                    androidx.compose.runtime.ComposerKt.sourceInformation(composer3, "C440@18148L8:BottomSheetScaffold.kt#jmzs0o");
                                    if ((i10 & 11) == 2 && composer3.getSkipping()) {
                                        composer3.skipToGroupEnd();
                                    } else {
                                        function24.invoke(composer3, java.lang.Integer.valueOf(i9 & 14));
                                    }
                                }
                            })).get(0).mo3402measureBRTryo0(m4415copyZbe2FdA$default);
                        } else {
                            placeable = null;
                        }
                        final int height2 = placeable != null ? placeable.getHeight() : 0;
                        long m4415copyZbe2FdA$default2 = androidx.compose.ui.unit.Constraints.m4415copyZbe2FdA$default(m4415copyZbe2FdA$default, 0, 0, 0, m4423getMaxHeightimpl - height2, 7, null);
                        androidx.compose.material.BottomSheetScaffoldLayoutSlot bottomSheetScaffoldLayoutSlot2 = androidx.compose.material.BottomSheetScaffoldLayoutSlot.Body;
                        final kotlin.jvm.functions.Function3<androidx.compose.foundation.layout.PaddingValues, androidx.compose.runtime.Composer, java.lang.Integer, kotlin.Unit> function34 = function3;
                        final float f4 = f;
                        final int i10 = i4;
                        final androidx.compose.ui.layout.Placeable mo3402measureBRTryo02 = SubcomposeLayout.subcompose(bottomSheetScaffoldLayoutSlot2, androidx.compose.runtime.internal.ComposableLambdaKt.composableLambdaInstance(1466287989, true, new kotlin.jvm.functions.Function2<androidx.compose.runtime.Composer, java.lang.Integer, kotlin.Unit>() { // from class: androidx.compose.material.BottomSheetScaffoldKt$BottomSheetScaffoldLayout$1$1$bodyPlaceable$1
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

                            public final void invoke(androidx.compose.runtime.Composer composer3, int i11) {
                                androidx.compose.runtime.ComposerKt.sourceInformation(composer3, "C447@18454L45:BottomSheetScaffold.kt#jmzs0o");
                                if ((i11 & 11) == 2 && composer3.getSkipping()) {
                                    composer3.skipToGroupEnd();
                                } else {
                                    function34.invoke(androidx.compose.foundation.layout.PaddingKt.m565PaddingValuesa9UjIt4$default(0.0f, 0.0f, 0.0f, f4, 7, null), composer3, java.lang.Integer.valueOf(i10 & 112));
                                }
                            }
                        })).get(0).mo3402measureBRTryo0(m4415copyZbe2FdA$default2);
                        kotlin.jvm.functions.Function2<androidx.compose.runtime.Composer, java.lang.Integer, kotlin.Unit> function25 = function22;
                        androidx.compose.ui.layout.Placeable mo3402measureBRTryo03 = function25 != null ? SubcomposeLayout.subcompose(androidx.compose.material.BottomSheetScaffoldLayoutSlot.Fab, function25).get(0).mo3402measureBRTryo0(m4415copyZbe2FdA$default) : null;
                        int width = mo3402measureBRTryo03 != null ? mo3402measureBRTryo03.getWidth() : 0;
                        int height3 = mo3402measureBRTryo03 != null ? mo3402measureBRTryo03.getHeight() : 0;
                        if (androidx.compose.material.FabPosition.m1398equalsimpl0(i, androidx.compose.material.FabPosition.INSTANCE.m1402getCenter5ygKITE())) {
                            i6 = (m4424getMaxWidthimpl - width) / 2;
                        } else {
                            f2 = androidx.compose.material.BottomSheetScaffoldKt.FabSpacing;
                            i6 = (m4424getMaxWidthimpl - width) - SubcomposeLayout.mo309roundToPx0680j_4(f2);
                        }
                        int i11 = height3 / 2;
                        if (SubcomposeLayout.mo315toPx0680j_4(f) < i11) {
                            f3 = androidx.compose.material.BottomSheetScaffoldKt.FabSpacing;
                            i7 = (roundToInt - height3) - SubcomposeLayout.mo309roundToPx0680j_4(f3);
                        } else {
                            i7 = roundToInt - i11;
                        }
                        final int i12 = i7;
                        final androidx.compose.ui.layout.Placeable mo3402measureBRTryo04 = SubcomposeLayout.subcompose(androidx.compose.material.BottomSheetScaffoldLayoutSlot.Snackbar, function23).get(0).mo3402measureBRTryo0(m4415copyZbe2FdA$default);
                        final int width2 = (m4424getMaxWidthimpl - mo3402measureBRTryo04.getWidth()) / 2;
                        int i13 = androidx.compose.material.BottomSheetScaffoldKt$BottomSheetScaffoldLayout$1$1.WhenMappings.$EnumSwitchMapping$0[bottomSheetState.getCurrentValue().ordinal()];
                        if (i13 == 1) {
                            height = i12 - mo3402measureBRTryo04.getHeight();
                        } else {
                            if (i13 != 2) {
                                throw new kotlin.NoWhenBranchMatchedException();
                            }
                            height = m4423getMaxHeightimpl - mo3402measureBRTryo04.getHeight();
                        }
                        final int i14 = height;
                        final androidx.compose.ui.layout.Placeable placeable2 = mo3402measureBRTryo03;
                        final int i15 = i6;
                        return androidx.compose.ui.layout.MeasureScope.CC.layout$default(SubcomposeLayout, m4424getMaxWidthimpl, m4423getMaxHeightimpl, null, new kotlin.jvm.functions.Function1<androidx.compose.ui.layout.Placeable.PlacementScope, kotlin.Unit>() { // from class: androidx.compose.material.BottomSheetScaffoldKt$BottomSheetScaffoldLayout$1$1.1
                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            {
                                super(1);
                            }

                            @Override // kotlin.jvm.functions.Function1
                            public /* bridge */ /* synthetic */ kotlin.Unit invoke(androidx.compose.ui.layout.Placeable.PlacementScope placementScope) {
                                invoke2(placementScope);
                                return kotlin.Unit.INSTANCE;
                            }

                            /* renamed from: invoke, reason: avoid collision after fix types in other method */
                            public final void invoke2(androidx.compose.ui.layout.Placeable.PlacementScope layout) {
                                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(layout, "$this$layout");
                                androidx.compose.ui.layout.Placeable.PlacementScope.placeRelative$default(layout, androidx.compose.ui.layout.Placeable.this, 0, height2, 0.0f, 4, null);
                                androidx.compose.ui.layout.Placeable placeable3 = placeable;
                                if (placeable3 != null) {
                                    androidx.compose.ui.layout.Placeable.PlacementScope.placeRelative$default(layout, placeable3, 0, 0, 0.0f, 4, null);
                                }
                                androidx.compose.ui.layout.Placeable.PlacementScope.placeRelative$default(layout, mo3402measureBRTryo0, 0, roundToInt, 0.0f, 4, null);
                                androidx.compose.ui.layout.Placeable placeable4 = placeable2;
                                if (placeable4 != null) {
                                    androidx.compose.ui.layout.Placeable.PlacementScope.placeRelative$default(layout, placeable4, i15, i12, 0.0f, 4, null);
                                }
                                androidx.compose.ui.layout.Placeable.PlacementScope.placeRelative$default(layout, mo3402measureBRTryo04, width2, i14, 0.0f, 4, null);
                            }
                        }, 4, null);
                    }
                };
                composer2.updateRememberedValue(rememberedValue);
            } else {
                composer2 = startRestartGroup;
            }
            composer2.endReplaceableGroup();
            androidx.compose.ui.layout.SubcomposeLayoutKt.SubcomposeLayout(null, (kotlin.jvm.functions.Function2) rememberedValue, composer2, 0, 1);
        } else {
            startRestartGroup.skipToGroupEnd();
            composer2 = startRestartGroup;
        }
        androidx.compose.runtime.ScopeUpdateScope endRestartGroup = composer2.endRestartGroup();
        if (endRestartGroup == null) {
            return;
        }
        endRestartGroup.updateScope(new kotlin.jvm.functions.Function2<androidx.compose.runtime.Composer, java.lang.Integer, kotlin.Unit>() { // from class: androidx.compose.material.BottomSheetScaffoldKt$BottomSheetScaffoldLayout$2
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

            public final void invoke(androidx.compose.runtime.Composer composer3, int i6) {
                androidx.compose.material.BottomSheetScaffoldKt.m1257BottomSheetScaffoldLayoutKCBPh4w(function2, function3, function32, function22, function23, f, i, state, bottomSheetState, composer3, i2 | 1);
            }
        });
    }
}
