package androidx.compose.material;

@kotlin.Metadata(d1 = {"\u0000\u008e\u0001\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\u001a;\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\u0014\b\u0002\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\t0\bH\u0007¢\u0006\u0002\u0010\n\u001a!\u0010\u000b\u001a\u00020\f2\b\b\u0002\u0010\r\u001a\u00020\u00012\b\b\u0002\u0010\u000e\u001a\u00020\u000fH\u0007¢\u0006\u0002\u0010\u0010\u001aý\u0001\u0010\u0011\u001a\u00020\u00122\u001c\u0010\u0013\u001a\u0018\u0012\u0004\u0012\u00020\u0014\u0012\u0004\u0012\u00020\u00120\b¢\u0006\u0002\b\u0015¢\u0006\u0002\b\u00162\b\b\u0002\u0010\u0017\u001a\u00020\u00182\b\b\u0002\u0010\u0019\u001a\u00020\f2\u0015\b\u0002\u0010\u001a\u001a\u000f\u0012\u0004\u0012\u00020\u0012\u0018\u00010\u001b¢\u0006\u0002\b\u00152\u0019\b\u0002\u0010\u001c\u001a\u0013\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020\u00120\b¢\u0006\u0002\b\u00152\u0015\b\u0002\u0010\u001d\u001a\u000f\u0012\u0004\u0012\u00020\u0012\u0018\u00010\u001b¢\u0006\u0002\b\u00152\b\b\u0002\u0010\u001e\u001a\u00020\u001f2\b\b\u0002\u0010 \u001a\u00020\t2\b\b\u0002\u0010!\u001a\u00020\"2\b\b\u0002\u0010#\u001a\u00020$2\b\b\u0002\u0010%\u001a\u00020&2\b\b\u0002\u0010'\u001a\u00020&2\b\b\u0002\u0010(\u001a\u00020$2\b\b\u0002\u0010)\u001a\u00020&2\b\b\u0002\u0010*\u001a\u00020&2\u0017\u0010+\u001a\u0013\u0012\u0004\u0012\u00020,\u0012\u0004\u0012\u00020\u00120\b¢\u0006\u0002\b\u0015H\u0007¢\u0006\u0004\b-\u0010.\u001ao\u0010/\u001a\u00020\u00122\u0006\u00100\u001a\u00020\u00012\u0006\u0010 \u001a\u00020\t2\u0006\u0010!\u001a\u00020\"2\u0006\u0010#\u001a\u00020$2\u0006\u0010%\u001a\u00020&2\u0006\u0010'\u001a\u00020&2\u0006\u0010(\u001a\u00020$2\b\b\u0002\u0010\u0017\u001a\u00020\u00182\u001c\u0010+\u001a\u0018\u0012\u0004\u0012\u00020\u0014\u0012\u0004\u0012\u00020\u00120\b¢\u0006\u0002\b\u0015¢\u0006\u0002\b\u0016H\u0003¢\u0006\u0004\b1\u00102\u001a\u0098\u0001\u00103\u001a\u00020\u00122\u0013\u0010\u001a\u001a\u000f\u0012\u0004\u0012\u00020\u0012\u0018\u00010\u001b¢\u0006\u0002\b\u00152\u0011\u00104\u001a\r\u0012\u0004\u0012\u00020\u00120\u001b¢\u0006\u0002\b\u00152\u0011\u00105\u001a\r\u0012\u0004\u0012\u00020\u00120\u001b¢\u0006\u0002\b\u00152\u0013\u0010\u001d\u001a\u000f\u0012\u0004\u0012\u00020\u0012\u0018\u00010\u001b¢\u0006\u0002\b\u00152\u0011\u0010\u001c\u001a\r\u0012\u0004\u0012\u00020\u00120\u001b¢\u0006\u0002\b\u00152\u0006\u0010(\u001a\u00020$2\f\u00106\u001a\b\u0012\u0004\u0012\u00020\u00060\u001b2\u0006\u0010\u001e\u001a\u00020\u001f2\u0006\u00107\u001a\u00020\u0001H\u0003¢\u0006\u0004\b8\u00109\u001a\u001c\u0010:\u001a\u00020;2\n\u00100\u001a\u0006\u0012\u0002\b\u00030<2\u0006\u0010=\u001a\u00020>H\u0002\"\u0010\u0010?\u001a\u00020$X\u0082\u0004¢\u0006\u0004\n\u0002\u0010@\"\u0010\u0010A\u001a\u00020$X\u0082\u0004¢\u0006\u0004\n\u0002\u0010@\"\u0010\u0010B\u001a\u00020$X\u0082\u0004¢\u0006\u0004\n\u0002\u0010@¨\u0006C"}, d2 = {"rememberBottomSheetState", "Landroidx/compose/material/BottomSheetState;", "initialValue", "Landroidx/compose/material/BottomSheetValue;", "animationSpec", "Landroidx/compose/animation/core/AnimationSpec;", "", "confirmStateChange", "Lkotlin/Function1;", "", "(Landroidx/compose/material/BottomSheetValue;Landroidx/compose/animation/core/AnimationSpec;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)Landroidx/compose/material/BottomSheetState;", "rememberBottomSheetScaffoldState", "Landroidx/compose/material/BottomSheetScaffoldState;", "bottomSheetState", "snackbarHostState", "Landroidx/compose/material/SnackbarHostState;", "(Landroidx/compose/material/BottomSheetState;Landroidx/compose/material/SnackbarHostState;Landroidx/compose/runtime/Composer;II)Landroidx/compose/material/BottomSheetScaffoldState;", "BottomSheetScaffold", "", "sheetContent", "Landroidx/compose/foundation/layout/ColumnScope;", "Landroidx/compose/runtime/Composable;", "Lkotlin/ExtensionFunctionType;", "modifier", "Landroidx/compose/ui/Modifier;", "scaffoldState", "topBar", "Lkotlin/Function0;", "snackbarHost", "floatingActionButton", "floatingActionButtonPosition", "Landroidx/compose/material/FabPosition;", "sheetGesturesEnabled", "sheetShape", "Landroidx/compose/ui/graphics/Shape;", "sheetElevation", "Landroidx/compose/ui/unit/Dp;", "sheetBackgroundColor", "Landroidx/compose/ui/graphics/Color;", "sheetContentColor", "sheetPeekHeight", "backgroundColor", "contentColor", "content", "Landroidx/compose/foundation/layout/PaddingValues;", "BottomSheetScaffold-HnlDQGw", "(Lkotlin/jvm/functions/Function3;Landroidx/compose/ui/Modifier;Landroidx/compose/material/BottomSheetScaffoldState;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function3;Lkotlin/jvm/functions/Function2;IZLandroidx/compose/ui/graphics/Shape;FJJFJJLkotlin/jvm/functions/Function3;Landroidx/compose/runtime/Composer;III)V", "BottomSheet", "state", "BottomSheet-dAqlCkY", "(Landroidx/compose/material/BottomSheetState;ZLandroidx/compose/ui/graphics/Shape;FJJFLandroidx/compose/ui/Modifier;Lkotlin/jvm/functions/Function3;Landroidx/compose/runtime/Composer;II)V", "BottomSheetScaffoldLayout", com.adobe.marketing.mobile.messaging.MessagingConstants.ContentCard.UIKeys.BODY, "bottomSheet", "sheetOffset", "sheetState", "BottomSheetScaffoldLayout-HJHHjMs", "(Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;FLkotlin/jvm/functions/Function0;ILandroidx/compose/material/BottomSheetState;Landroidx/compose/runtime/Composer;I)V", "ConsumeSwipeWithinBottomSheetBoundsNestedScrollConnection", "Landroidx/compose/ui/input/nestedscroll/NestedScrollConnection;", "Landroidx/compose/material/AnchoredDraggableState;", "orientation", "Landroidx/compose/foundation/gestures/Orientation;", "FabSpacing", com.adobe.marketing.mobile.internal.CoreConstants.Wrapper.Type.FLUTTER, "BottomSheetScaffoldPositionalThreshold", "BottomSheetScaffoldVelocityThreshold", "material"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes.dex */
public final class BottomSheetScaffoldKt {
    private static final float getHighSpeedVideoSizes = androidx.compose.ui.unit.Dp.m8601constructorimpl(16.0f);
    private static final float Camera2StreamConfigurationMap = androidx.compose.ui.unit.Dp.m8601constructorimpl(56.0f);
    private static final float getHighSpeedVideoFpsRanges = androidx.compose.ui.unit.Dp.m8601constructorimpl(125.0f);

    public static /* synthetic */ boolean $r8$lambda$DooMF06SmtC9mm7IkzXKW46qM38(androidx.compose.material.BottomSheetValue bottomSheetValue) {
        return true;
    }

    public static final androidx.compose.material.BottomSheetState rememberBottomSheetState(final androidx.compose.material.BottomSheetValue bottomSheetValue, final androidx.compose.animation.core.AnimationSpec<java.lang.Float> animationSpec, final kotlin.jvm.functions.Function1<? super androidx.compose.material.BottomSheetValue, java.lang.Boolean> function1, androidx.compose.runtime.Composer composer, int i, int i2) {
        if ((i2 & 2) != 0) {
            animationSpec = androidx.compose.material.BottomSheetScaffoldDefaults.INSTANCE.getAnimationSpec();
        }
        if ((i2 & 4) != 0) {
            java.lang.Object rememberedValue = composer.rememberedValue();
            if (rememberedValue == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                rememberedValue = new kotlin.jvm.functions.Function1() { // from class: androidx.compose.material.BottomSheetScaffoldKt$$ExternalSyntheticLambda0
                    @Override // kotlin.jvm.functions.Function1
                    public final java.lang.Object invoke(java.lang.Object obj) {
                        return java.lang.Boolean.valueOf(androidx.compose.material.BottomSheetScaffoldKt.$r8$lambda$DooMF06SmtC9mm7IkzXKW46qM38((androidx.compose.material.BottomSheetValue) obj));
                    }
                };
                composer.updateRememberedValue(rememberedValue);
            }
            function1 = (kotlin.jvm.functions.Function1) rememberedValue;
        }
        if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
            androidx.compose.runtime.ComposerKt.traceEventStart(1808153344, i, -1, "androidx.compose.material.rememberBottomSheetState (BottomSheetScaffold.kt:224)");
        }
        final androidx.compose.ui.unit.Density density = (androidx.compose.ui.unit.Density) composer.consume(androidx.compose.ui.platform.CompositionLocalsKt.getLocalDensity());
        java.lang.Object[] objArr = {animationSpec};
        androidx.compose.runtime.saveable.Saver<androidx.compose.material.BottomSheetState, ?> Saver = androidx.compose.material.BottomSheetState.INSTANCE.Saver(animationSpec, function1, density);
        boolean z = true;
        boolean z2 = (((i & 14) ^ 6) > 4 && composer.changed(bottomSheetValue.ordinal())) || (i & 6) == 4;
        boolean changed = composer.changed(density);
        boolean changedInstance = composer.changedInstance(animationSpec);
        if ((((i & 896) ^ 384) <= 256 || !composer.changed(function1)) && (i & 384) != 256) {
            z = false;
        }
        java.lang.Object rememberedValue2 = composer.rememberedValue();
        if ((z2 | changed | changedInstance | z) || rememberedValue2 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
            rememberedValue2 = new kotlin.jvm.functions.Function0() { // from class: androidx.compose.material.BottomSheetScaffoldKt$$ExternalSyntheticLambda7
                @Override // kotlin.jvm.functions.Function0
                public final java.lang.Object invoke() {
                    return androidx.compose.material.BottomSheetScaffoldKt.$r8$lambda$zWiZ0w1NjoMmD5lr5vQS0seaSGE(androidx.compose.material.BottomSheetValue.this, density, animationSpec, function1);
                }
            };
            composer.updateRememberedValue(rememberedValue2);
        }
        androidx.compose.material.BottomSheetState bottomSheetState = (androidx.compose.material.BottomSheetState) androidx.compose.runtime.saveable.RememberSaveableKt.m5465rememberSaveable(objArr, (androidx.compose.runtime.saveable.Saver) Saver, (kotlin.jvm.functions.Function0) rememberedValue2, composer, 0);
        if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
            androidx.compose.runtime.ComposerKt.traceEventEnd();
        }
        return bottomSheetState;
    }

    public static final androidx.compose.material.BottomSheetScaffoldState rememberBottomSheetScaffoldState(androidx.compose.material.BottomSheetState bottomSheetState, androidx.compose.material.SnackbarHostState snackbarHostState, androidx.compose.runtime.Composer composer, int i, int i2) {
        if ((i2 & 1) != 0) {
            bottomSheetState = rememberBottomSheetState(androidx.compose.material.BottomSheetValue.Collapsed, null, null, composer, 6, 6);
        }
        if ((i2 & 2) != 0) {
            java.lang.Object rememberedValue = composer.rememberedValue();
            if (rememberedValue == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                rememberedValue = new androidx.compose.material.SnackbarHostState();
                composer.updateRememberedValue(rememberedValue);
            }
            snackbarHostState = (androidx.compose.material.SnackbarHostState) rememberedValue;
        }
        if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
            androidx.compose.runtime.ComposerKt.traceEventStart(-1022285988, i, -1, "androidx.compose.material.rememberBottomSheetScaffoldState (BottomSheetScaffold.kt:266)");
        }
        boolean z = (((i & 14) ^ 6) > 4 && composer.changed(bottomSheetState)) || (i & 6) == 4;
        boolean z2 = (((i & 112) ^ 48) > 32 && composer.changed(snackbarHostState)) || (i & 48) == 32;
        java.lang.Object rememberedValue2 = composer.rememberedValue();
        if ((z | z2) || rememberedValue2 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
            rememberedValue2 = new androidx.compose.material.BottomSheetScaffoldState(bottomSheetState, snackbarHostState);
            composer.updateRememberedValue(rememberedValue2);
        }
        androidx.compose.material.BottomSheetScaffoldState bottomSheetScaffoldState = (androidx.compose.material.BottomSheetScaffoldState) rememberedValue2;
        if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
            androidx.compose.runtime.ComposerKt.traceEventEnd();
        }
        return bottomSheetScaffoldState;
    }

    /* JADX WARN: Code restructure failed: missing block: B:81:0x0194, code lost:
    
        if (r1.changed(r49) == false) goto L146;
     */
    /* JADX WARN: Code restructure failed: missing block: B:89:0x01ae, code lost:
    
        if (r1.changed(r51) == false) goto L157;
     */
    /* JADX WARN: Removed duplicated region for block: B:101:0x01d7  */
    /* JADX WARN: Removed duplicated region for block: B:106:0x01eb  */
    /* JADX WARN: Removed duplicated region for block: B:13:0x0043  */
    /* JADX WARN: Removed duplicated region for block: B:144:0x03c0  */
    /* JADX WARN: Removed duplicated region for block: B:147:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:195:0x03a0  */
    /* JADX WARN: Removed duplicated region for block: B:198:0x01b8  */
    /* JADX WARN: Removed duplicated region for block: B:200:0x019e  */
    /* JADX WARN: Removed duplicated region for block: B:203:0x0184  */
    /* JADX WARN: Removed duplicated region for block: B:206:0x0168  */
    /* JADX WARN: Removed duplicated region for block: B:208:0x014b  */
    /* JADX WARN: Removed duplicated region for block: B:211:0x0131  */
    /* JADX WARN: Removed duplicated region for block: B:214:0x0113  */
    /* JADX WARN: Removed duplicated region for block: B:215:0x00e4  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0063  */
    /* JADX WARN: Removed duplicated region for block: B:222:0x00c6  */
    /* JADX WARN: Removed duplicated region for block: B:229:0x00a8  */
    /* JADX WARN: Removed duplicated region for block: B:236:0x0087  */
    /* JADX WARN: Removed duplicated region for block: B:243:0x0066  */
    /* JADX WARN: Removed duplicated region for block: B:252:0x0059  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0084  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x00a3  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x00c1  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00df  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00fd  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x011b  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x0137  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x0152  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x016e  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x018a  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x01a4  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x01c0  */
    /* renamed from: BottomSheetScaffold-HnlDQGw, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void m2520BottomSheetScaffoldHnlDQGw(final kotlin.jvm.functions.Function3<? super androidx.compose.foundation.layout.ColumnScope, ? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.Unit> function3, androidx.compose.ui.Modifier modifier, androidx.compose.material.BottomSheetScaffoldState bottomSheetScaffoldState, kotlin.jvm.functions.Function2<? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.Unit> function2, kotlin.jvm.functions.Function3<? super androidx.compose.material.SnackbarHostState, ? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.Unit> function32, kotlin.jvm.functions.Function2<? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.Unit> function22, int i, boolean z, androidx.compose.ui.graphics.Shape shape, float f, long j, long j2, float f2, long j3, long j4, final kotlin.jvm.functions.Function3<? super androidx.compose.foundation.layout.PaddingValues, ? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.Unit> function33, androidx.compose.runtime.Composer composer, final int i2, final int i3, final int i4) {
        int i5;
        androidx.compose.ui.Modifier modifier2;
        androidx.compose.material.BottomSheetScaffoldState bottomSheetScaffoldState2;
        int i6;
        int i7;
        int i8;
        kotlin.jvm.functions.Function2<? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.Unit> function23;
        int i9;
        int i10;
        int i11;
        boolean z2;
        int i12;
        final kotlin.jvm.functions.Function2<? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.Unit> function24;
        final kotlin.jvm.functions.Function3<? super androidx.compose.material.SnackbarHostState, ? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.Unit> function34;
        final long j5;
        final float f3;
        final long j6;
        final long j7;
        final kotlin.jvm.functions.Function2<? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.Unit> function25;
        final int i13;
        final androidx.compose.ui.Modifier modifier3;
        final androidx.compose.material.BottomSheetScaffoldState bottomSheetScaffoldState3;
        final boolean z3;
        final androidx.compose.ui.graphics.Shape shape2;
        final float f4;
        final long j8;
        androidx.compose.runtime.ScopeUpdateScope endRestartGroup;
        kotlin.jvm.functions.Function3<? super androidx.compose.material.SnackbarHostState, ? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.Unit> lambda$937349512$material;
        androidx.compose.foundation.shape.CornerBasedShape cornerBasedShape;
        float f5;
        kotlin.jvm.functions.Function2<? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.Unit> function26;
        long j9;
        long j10;
        float f6;
        long j11;
        long j12;
        long j13;
        int i14;
        int i15;
        kotlin.jvm.functions.Function2<? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.Unit> function27;
        long j14;
        float f7;
        float f8;
        long j15;
        int i16;
        int i17;
        int i18;
        int i19;
        int i20;
        androidx.compose.runtime.Composer startRestartGroup = composer.startRestartGroup(194495313);
        if ((i2 & 6) == 0) {
            i5 = (startRestartGroup.changedInstance(function3) ? 4 : 2) | i2;
        } else {
            i5 = i2;
        }
        int i21 = i4 & 2;
        if (i21 != 0) {
            i5 |= 48;
        } else if ((i2 & 48) == 0) {
            modifier2 = modifier;
            i5 |= startRestartGroup.changed(modifier2) ? 32 : 16;
            if ((i2 & 384) != 0) {
                if ((i4 & 4) == 0) {
                    bottomSheetScaffoldState2 = bottomSheetScaffoldState;
                    if (startRestartGroup.changed(bottomSheetScaffoldState2)) {
                        i20 = 256;
                        i5 |= i20;
                    }
                } else {
                    bottomSheetScaffoldState2 = bottomSheetScaffoldState;
                }
                i20 = 128;
                i5 |= i20;
            } else {
                bottomSheetScaffoldState2 = bottomSheetScaffoldState;
            }
            i6 = i4 & 8;
            int i22 = 2048;
            if (i6 == 0) {
                i5 |= 3072;
            } else if ((i2 & 3072) == 0) {
                i5 |= startRestartGroup.changedInstance(function2) ? 2048 : 1024;
                i7 = i4 & 16;
                int i23 = 16384;
                if (i7 != 0) {
                    i5 |= 24576;
                } else if ((i2 & 24576) == 0) {
                    i5 |= startRestartGroup.changedInstance(function32) ? 16384 : 8192;
                    i8 = i4 & 32;
                    if (i8 == 0) {
                        i5 |= androidx.profileinstaller.ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE;
                        function23 = function22;
                    } else {
                        function23 = function22;
                        if ((i2 & androidx.profileinstaller.ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE) == 0) {
                            i5 |= startRestartGroup.changedInstance(function23) ? 131072 : 65536;
                        }
                    }
                    i9 = i4 & 64;
                    if (i9 == 0) {
                        i5 |= 1572864;
                        i10 = i;
                    } else {
                        i10 = i;
                        if ((i2 & 1572864) == 0) {
                            i5 |= startRestartGroup.changed(i10) ? 1048576 : 524288;
                        }
                    }
                    i11 = i4 & 128;
                    if (i11 == 0) {
                        i5 |= 12582912;
                        z2 = z;
                    } else {
                        z2 = z;
                        if ((i2 & 12582912) == 0) {
                            i5 |= startRestartGroup.changed(z2) ? 8388608 : 4194304;
                        }
                    }
                    if ((i2 & 100663296) == 0) {
                        if ((i4 & 256) == 0 && startRestartGroup.changed(shape)) {
                            i19 = 67108864;
                            i5 |= i19;
                        }
                        i19 = 33554432;
                        i5 |= i19;
                    }
                    if ((i2 & 805306368) == 0) {
                        if ((i4 & 512) == 0 && startRestartGroup.changed(f)) {
                            i18 = 536870912;
                            i5 |= i18;
                        }
                        i18 = 268435456;
                        i5 |= i18;
                    }
                    if ((i3 & 6) != 0) {
                        i12 = i3 | (((i4 & 1024) == 0 && startRestartGroup.changed(j)) ? 4 : 2);
                    } else {
                        i12 = i3;
                    }
                    if ((i3 & 48) == 0) {
                        if ((i4 & 2048) == 0 && startRestartGroup.changed(j2)) {
                            i17 = 32;
                            i12 |= i17;
                        }
                        i17 = 16;
                        i12 |= i17;
                    }
                    if ((i3 & 384) == 0) {
                        if ((i4 & 4096) == 0 && startRestartGroup.changed(f2)) {
                            i16 = 256;
                            i12 |= i16;
                        }
                        i16 = 128;
                        i12 |= i16;
                    }
                    if ((i3 & 3072) == 0) {
                        if ((i4 & 8192) != 0) {
                        }
                        i22 = 1024;
                        i12 |= i22;
                    }
                    if ((i3 & 24576) == 0) {
                        if ((i4 & 16384) != 0) {
                        }
                        i23 = 8192;
                        i12 |= i23;
                    }
                    if ((i3 & androidx.profileinstaller.ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE) == 0) {
                        i12 |= startRestartGroup.changedInstance(function33) ? 131072 : 65536;
                    }
                    if (!startRestartGroup.shouldExecute((i5 & 306783379) == 306783378 || (74899 & i12) != 74898, i5 & 1)) {
                        startRestartGroup.startDefaults();
                        if ((i2 & 1) != 0 && !startRestartGroup.getDefaultsInvalid()) {
                            startRestartGroup.skipToGroupEnd();
                            if ((i4 & 4) != 0) {
                                i5 &= -897;
                            }
                            if ((i4 & 256) != 0) {
                                i5 &= -234881025;
                            }
                            if ((i4 & 512) != 0) {
                                i5 &= -1879048193;
                            }
                            if ((i4 & 1024) != 0) {
                                i12 &= -15;
                            }
                            if ((i4 & 2048) != 0) {
                                i12 &= -113;
                            }
                            if ((i4 & 4096) != 0) {
                                i12 &= -897;
                            }
                            if ((i4 & 8192) != 0) {
                                i12 &= -7169;
                            }
                            if ((i4 & 16384) != 0) {
                                i12 &= -57345;
                            }
                            lambda$937349512$material = function32;
                            cornerBasedShape = shape;
                            f8 = f;
                            j11 = j;
                            j10 = j2;
                            f7 = f2;
                            j13 = j4;
                            i14 = i12;
                            i15 = i5;
                            function27 = function2;
                            j14 = j3;
                        } else {
                            if (i21 != 0) {
                                modifier2 = androidx.compose.ui.Modifier.INSTANCE;
                            }
                            if ((i4 & 4) != 0) {
                                i5 &= -897;
                                bottomSheetScaffoldState2 = rememberBottomSheetScaffoldState(null, null, startRestartGroup, 0, 3);
                            }
                            kotlin.jvm.functions.Function2<? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.Unit> function28 = i6 != 0 ? null : function2;
                            lambda$937349512$material = i7 != 0 ? androidx.compose.material.ComposableSingletons$BottomSheetScaffoldKt.INSTANCE.getLambda$937349512$material() : function32;
                            if (i8 != 0) {
                                function23 = null;
                            }
                            if (i9 != 0) {
                                i10 = androidx.compose.material.FabPosition.INSTANCE.m2634getEnd5ygKITE();
                            }
                            if (i11 != 0) {
                                z2 = true;
                            }
                            if ((i4 & 256) != 0) {
                                cornerBasedShape = androidx.compose.material.MaterialTheme.INSTANCE.getShapes(startRestartGroup, 6).getLarge();
                                i5 &= -234881025;
                            } else {
                                cornerBasedShape = shape;
                            }
                            if ((i4 & 512) != 0) {
                                f5 = androidx.compose.material.BottomSheetScaffoldDefaults.INSTANCE.m2513getSheetElevationD9Ej5fM();
                                i5 &= -1879048193;
                            } else {
                                f5 = f;
                            }
                            if ((i4 & 1024) != 0) {
                                function26 = function28;
                                j9 = androidx.compose.material.MaterialTheme.INSTANCE.getColors(startRestartGroup, 6).m2566getSurface0d7_KjU();
                                i12 &= -15;
                            } else {
                                function26 = function28;
                                j9 = j;
                            }
                            float f9 = f5;
                            if ((i4 & 2048) != 0) {
                                j10 = androidx.compose.material.ColorsKt.m2580contentColorForek8zF_U(j9, startRestartGroup, i12 & 14);
                                i12 &= -113;
                            } else {
                                j10 = j2;
                            }
                            if ((i4 & 4096) != 0) {
                                f6 = androidx.compose.material.BottomSheetScaffoldDefaults.INSTANCE.m2514getSheetPeekHeightD9Ej5fM();
                                i12 &= -897;
                            } else {
                                f6 = f2;
                            }
                            j11 = j9;
                            if ((i4 & 8192) != 0) {
                                j12 = androidx.compose.material.MaterialTheme.INSTANCE.getColors(startRestartGroup, 6).m2555getBackground0d7_KjU();
                                i12 &= -7169;
                            } else {
                                j12 = j3;
                            }
                            float f10 = f6;
                            if ((i4 & 16384) != 0) {
                                j13 = androidx.compose.material.ColorsKt.m2580contentColorForek8zF_U(j12, startRestartGroup, (i12 >> 9) & 14);
                                i12 &= -57345;
                            } else {
                                j13 = j4;
                            }
                            i14 = i12;
                            i15 = i5;
                            function27 = function26;
                            j14 = j12;
                            f7 = f10;
                            f8 = f9;
                        }
                        startRestartGroup.endDefaults();
                        if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                            j15 = j14;
                            androidx.compose.runtime.ComposerKt.traceEventStart(194495313, i15, i14, "androidx.compose.material.BottomSheetScaffold (BottomSheetScaffold.kt:336)");
                        } else {
                            j15 = j14;
                        }
                        androidx.compose.ui.Modifier fillMaxSize$default = androidx.compose.foundation.layout.SizeKt.fillMaxSize$default(modifier2, 0.0f, 1, null);
                        final androidx.compose.material.BottomSheetScaffoldState bottomSheetScaffoldState4 = bottomSheetScaffoldState2;
                        final kotlin.jvm.functions.Function2<? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.Unit> function29 = function27;
                        final kotlin.jvm.functions.Function2<? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.Unit> function210 = function23;
                        final float f11 = f7;
                        final int i24 = i10;
                        final boolean z4 = z2;
                        final androidx.compose.ui.graphics.Shape shape3 = cornerBasedShape;
                        final float f12 = f8;
                        final long j16 = j11;
                        final long j17 = j10;
                        final kotlin.jvm.functions.Function3<? super androidx.compose.material.SnackbarHostState, ? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.Unit> function35 = lambda$937349512$material;
                        kotlin.jvm.functions.Function2 function211 = new kotlin.jvm.functions.Function2() { // from class: androidx.compose.material.BottomSheetScaffoldKt$$ExternalSyntheticLambda4
                            @Override // kotlin.jvm.functions.Function2
                            public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                                return androidx.compose.material.BottomSheetScaffoldKt.$r8$lambda$aw6iVYYDtYDrg0RQoI7aMED_uLQ(androidx.compose.material.BottomSheetScaffoldState.this, function29, function210, f11, i24, function33, z4, shape3, f12, j16, j17, function3, function35, (androidx.compose.runtime.Composer) obj, ((java.lang.Integer) obj2).intValue());
                            }
                        };
                        kotlin.jvm.functions.Function2<? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.Unit> function212 = function27;
                        androidx.compose.runtime.internal.ComposableLambda rememberComposableLambda = androidx.compose.runtime.internal.ComposableLambdaKt.rememberComposableLambda(-747577963, true, function211, startRestartGroup, 54);
                        int i25 = i14 >> 3;
                        androidx.compose.material.SurfaceKt.m2766SurfaceFjzlyU(fillMaxSize$default, null, j15, j13, null, 0.0f, rememberComposableLambda, startRestartGroup, (i25 & 896) | 1572864 | (i25 & 7168), 50);
                        if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                            androidx.compose.runtime.ComposerKt.traceEventEnd();
                        }
                        function24 = function212;
                        f3 = f7;
                        function34 = lambda$937349512$material;
                        function25 = function23;
                        i13 = i10;
                        bottomSheetScaffoldState3 = bottomSheetScaffoldState2;
                        z3 = z2;
                        j5 = j10;
                        j6 = j15;
                        f4 = f8;
                        modifier3 = modifier2;
                        shape2 = cornerBasedShape;
                        j8 = j11;
                        j7 = j13;
                    } else {
                        startRestartGroup.skipToGroupEnd();
                        function24 = function2;
                        function34 = function32;
                        j5 = j2;
                        f3 = f2;
                        j6 = j3;
                        j7 = j4;
                        function25 = function23;
                        i13 = i10;
                        modifier3 = modifier2;
                        bottomSheetScaffoldState3 = bottomSheetScaffoldState2;
                        z3 = z2;
                        shape2 = shape;
                        f4 = f;
                        j8 = j;
                    }
                    endRestartGroup = startRestartGroup.endRestartGroup();
                    if (endRestartGroup == null) {
                        endRestartGroup.updateScope(new kotlin.jvm.functions.Function2() { // from class: androidx.compose.material.BottomSheetScaffoldKt$$ExternalSyntheticLambda5
                            @Override // kotlin.jvm.functions.Function2
                            public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                                return androidx.compose.material.BottomSheetScaffoldKt.$r8$lambda$wZvYNf9fm_YJlisW47TfF5H9VYI(kotlin.jvm.functions.Function3.this, modifier3, bottomSheetScaffoldState3, function24, function34, function25, i13, z3, shape2, f4, j8, j5, f3, j6, j7, function33, i2, i3, i4, (androidx.compose.runtime.Composer) obj, ((java.lang.Integer) obj2).intValue());
                            }
                        });
                        return;
                    }
                    return;
                }
                i8 = i4 & 32;
                if (i8 == 0) {
                }
                i9 = i4 & 64;
                if (i9 == 0) {
                }
                i11 = i4 & 128;
                if (i11 == 0) {
                }
                if ((i2 & 100663296) == 0) {
                }
                if ((i2 & 805306368) == 0) {
                }
                if ((i3 & 6) != 0) {
                }
                if ((i3 & 48) == 0) {
                }
                if ((i3 & 384) == 0) {
                }
                if ((i3 & 3072) == 0) {
                }
                if ((i3 & 24576) == 0) {
                }
                if ((i3 & androidx.profileinstaller.ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE) == 0) {
                }
                if (!startRestartGroup.shouldExecute((i5 & 306783379) == 306783378 || (74899 & i12) != 74898, i5 & 1)) {
                }
                endRestartGroup = startRestartGroup.endRestartGroup();
                if (endRestartGroup == null) {
                }
            }
            i7 = i4 & 16;
            int i232 = 16384;
            if (i7 != 0) {
            }
            i8 = i4 & 32;
            if (i8 == 0) {
            }
            i9 = i4 & 64;
            if (i9 == 0) {
            }
            i11 = i4 & 128;
            if (i11 == 0) {
            }
            if ((i2 & 100663296) == 0) {
            }
            if ((i2 & 805306368) == 0) {
            }
            if ((i3 & 6) != 0) {
            }
            if ((i3 & 48) == 0) {
            }
            if ((i3 & 384) == 0) {
            }
            if ((i3 & 3072) == 0) {
            }
            if ((i3 & 24576) == 0) {
            }
            if ((i3 & androidx.profileinstaller.ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE) == 0) {
            }
            if (!startRestartGroup.shouldExecute((i5 & 306783379) == 306783378 || (74899 & i12) != 74898, i5 & 1)) {
            }
            endRestartGroup = startRestartGroup.endRestartGroup();
            if (endRestartGroup == null) {
            }
        }
        modifier2 = modifier;
        if ((i2 & 384) != 0) {
        }
        i6 = i4 & 8;
        int i222 = 2048;
        if (i6 == 0) {
        }
        i7 = i4 & 16;
        int i2322 = 16384;
        if (i7 != 0) {
        }
        i8 = i4 & 32;
        if (i8 == 0) {
        }
        i9 = i4 & 64;
        if (i9 == 0) {
        }
        i11 = i4 & 128;
        if (i11 == 0) {
        }
        if ((i2 & 100663296) == 0) {
        }
        if ((i2 & 805306368) == 0) {
        }
        if ((i3 & 6) != 0) {
        }
        if ((i3 & 48) == 0) {
        }
        if ((i3 & 384) == 0) {
        }
        if ((i3 & 3072) == 0) {
        }
        if ((i3 & 24576) == 0) {
        }
        if ((i3 & androidx.profileinstaller.ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE) == 0) {
        }
        if (!startRestartGroup.shouldExecute((i5 & 306783379) == 306783378 || (74899 & i12) != 74898, i5 & 1)) {
        }
        endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup == null) {
        }
    }

    private static final void getHighSpeedVideoSizes(final androidx.compose.material.BottomSheetState bottomSheetState, final boolean z, final androidx.compose.ui.graphics.Shape shape, final float f, final long j, final long j2, final float f2, androidx.compose.ui.Modifier modifier, final kotlin.jvm.functions.Function3<? super androidx.compose.foundation.layout.ColumnScope, ? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.Unit> function3, androidx.compose.runtime.Composer composer, final int i, final int i2) {
        int i3;
        androidx.compose.ui.Modifier modifier2;
        androidx.compose.runtime.Composer startRestartGroup = composer.startRestartGroup(-426833549);
        if ((i & 6) == 0) {
            i3 = (startRestartGroup.changed(bottomSheetState) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i & 48) == 0) {
            i3 |= startRestartGroup.changed(z) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i3 |= startRestartGroup.changed(shape) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i3 |= startRestartGroup.changed(f) ? 2048 : 1024;
        }
        if ((i & 24576) == 0) {
            i3 |= startRestartGroup.changed(j) ? 16384 : 8192;
        }
        if ((196608 & i) == 0) {
            i3 |= startRestartGroup.changed(j2) ? 131072 : 65536;
        }
        if ((i & 1572864) == 0) {
            i3 |= startRestartGroup.changed(f2) ? 1048576 : 524288;
        }
        int i4 = i2 & 128;
        if (i4 != 0) {
            i3 |= 12582912;
            modifier2 = modifier;
        } else {
            modifier2 = modifier;
            if ((i & 12582912) == 0) {
                i3 |= startRestartGroup.changed(modifier2) ? 8388608 : 4194304;
            }
        }
        if ((i & 100663296) == 0) {
            i3 |= startRestartGroup.changedInstance(function3) ? 67108864 : 33554432;
        }
        if (!startRestartGroup.shouldExecute((i3 & 38347923) != 38347922, i3 & 1)) {
            startRestartGroup.skipToGroupEnd();
        } else {
            if (i4 != 0) {
                modifier2 = androidx.compose.ui.Modifier.INSTANCE;
            }
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventStart(-426833549, i3, -1, "androidx.compose.material.BottomSheet (BottomSheetScaffold.kt:387)");
            }
            java.lang.Object rememberedValue = startRestartGroup.rememberedValue();
            if (rememberedValue == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                rememberedValue = androidx.compose.runtime.EffectsKt.createCompositionCoroutineScope(kotlin.coroutines.EmptyCoroutineContext.INSTANCE, startRestartGroup);
                startRestartGroup.updateRememberedValue(rememberedValue);
            }
            final kotlinx.coroutines.CoroutineScope coroutineScope = (kotlinx.coroutines.CoroutineScope) rememberedValue;
            final float mo1418toPx0680j_4 = ((androidx.compose.ui.unit.Density) startRestartGroup.consume(androidx.compose.ui.platform.CompositionLocalsKt.getLocalDensity())).mo1418toPx0680j_4(f2);
            androidx.compose.material.AnchoredDraggableState<androidx.compose.material.BottomSheetValue> anchoredDraggableState$material = bottomSheetState.getAnchoredDraggableState$material();
            androidx.compose.foundation.gestures.Orientation orientation = androidx.compose.foundation.gestures.Orientation.Vertical;
            boolean changed = startRestartGroup.changed(mo1418toPx0680j_4);
            int i5 = i3 & 14;
            boolean z2 = i5 == 4;
            java.lang.Object rememberedValue2 = startRestartGroup.rememberedValue();
            if ((changed | z2) || rememberedValue2 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                rememberedValue2 = new kotlin.jvm.functions.Function2() { // from class: androidx.compose.material.BottomSheetScaffoldKt$$ExternalSyntheticLambda15
                    @Override // kotlin.jvm.functions.Function2
                    public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                        return androidx.compose.material.BottomSheetScaffoldKt.$r8$lambda$KyG3ttlQLl9ULKAMbPVWex6xA3U(androidx.compose.material.BottomSheetState.this, mo1418toPx0680j_4, (androidx.compose.ui.unit.IntSize) obj, (androidx.compose.ui.unit.Constraints) obj2);
                    }
                };
                startRestartGroup.updateRememberedValue(rememberedValue2);
            }
            androidx.compose.ui.Modifier anchoredDraggable$default = androidx.compose.material.AnchoredDraggableKt.anchoredDraggable$default(androidx.compose.material.AnchoredDraggableKt.draggableAnchors(modifier2, anchoredDraggableState$material, orientation, (kotlin.jvm.functions.Function2) rememberedValue2), bottomSheetState.getAnchoredDraggableState$material(), androidx.compose.foundation.gestures.Orientation.Vertical, z, false, null, false, 56, null);
            boolean z3 = i5 == 4;
            boolean changedInstance = startRestartGroup.changedInstance(coroutineScope);
            java.lang.Object rememberedValue3 = startRestartGroup.rememberedValue();
            if ((z3 | changedInstance) || rememberedValue3 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                rememberedValue3 = new kotlin.jvm.functions.Function1() { // from class: androidx.compose.material.BottomSheetScaffoldKt$$ExternalSyntheticLambda1
                    @Override // kotlin.jvm.functions.Function1
                    public final java.lang.Object invoke(java.lang.Object obj) {
                        return androidx.compose.material.BottomSheetScaffoldKt.m2518$r8$lambda$vC59uQYEs4rnCQwvwun1IUMPYk(androidx.compose.material.BottomSheetState.this, coroutineScope, (androidx.compose.ui.semantics.SemanticsPropertyReceiver) obj);
                    }
                };
                startRestartGroup.updateRememberedValue(rememberedValue3);
            }
            int i6 = i3 >> 6;
            androidx.compose.material.SurfaceKt.m2766SurfaceFjzlyU(androidx.compose.ui.semantics.SemanticsModifierKt.semantics$default(anchoredDraggable$default, false, (kotlin.jvm.functions.Function1) rememberedValue3, 1, null), shape, j, j2, null, f, androidx.compose.runtime.internal.ComposableLambdaKt.rememberComposableLambda(1065607095, true, new kotlin.jvm.functions.Function2() { // from class: androidx.compose.material.BottomSheetScaffoldKt$$ExternalSyntheticLambda2
                @Override // kotlin.jvm.functions.Function2
                public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                    return androidx.compose.material.BottomSheetScaffoldKt.$r8$lambda$cTxDf65WQmaMOi6fY95mLnECIGg(kotlin.jvm.functions.Function3.this, (androidx.compose.runtime.Composer) obj, ((java.lang.Integer) obj2).intValue());
                }
            }, startRestartGroup, 54), startRestartGroup, (i6 & 7168) | ((i3 >> 3) & 112) | 1572864 | (i6 & 896) | ((i3 << 6) & 458752), 16);
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventEnd();
            }
        }
        final androidx.compose.ui.Modifier modifier3 = modifier2;
        androidx.compose.runtime.ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new kotlin.jvm.functions.Function2() { // from class: androidx.compose.material.BottomSheetScaffoldKt$$ExternalSyntheticLambda3
                @Override // kotlin.jvm.functions.Function2
                public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                    return androidx.compose.material.BottomSheetScaffoldKt.m2516$r8$lambda$QEJ4SbTW1vCpjWXMMJZimUwwo(androidx.compose.material.BottomSheetState.this, z, shape, f, j, j2, f2, modifier3, function3, i, i2, (androidx.compose.runtime.Composer) obj, ((java.lang.Integer) obj2).intValue());
                }
            });
        }
    }

    private static final void getHighSpeedVideoSizes(final kotlin.jvm.functions.Function2<? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.Unit> function2, final kotlin.jvm.functions.Function2<? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.Unit> function22, final kotlin.jvm.functions.Function2<? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.Unit> function23, final kotlin.jvm.functions.Function2<? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.Unit> function24, final kotlin.jvm.functions.Function2<? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.Unit> function25, final float f, final kotlin.jvm.functions.Function0<java.lang.Float> function0, final int i, final androidx.compose.material.BottomSheetState bottomSheetState, androidx.compose.runtime.Composer composer, final int i2) {
        int i3;
        androidx.compose.runtime.Composer startRestartGroup = composer.startRestartGroup(757616750);
        if ((i2 & 6) == 0) {
            i3 = (startRestartGroup.changedInstance(function2) ? 4 : 2) | i2;
        } else {
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            i3 |= startRestartGroup.changedInstance(function22) ? 32 : 16;
        }
        if ((i2 & 384) == 0) {
            i3 |= startRestartGroup.changedInstance(function23) ? 256 : 128;
        }
        if ((i2 & 3072) == 0) {
            i3 |= startRestartGroup.changedInstance(function24) ? 2048 : 1024;
        }
        if ((i2 & 24576) == 0) {
            i3 |= startRestartGroup.changedInstance(function25) ? 16384 : 8192;
        }
        if ((196608 & i2) == 0) {
            i3 |= startRestartGroup.changed(f) ? 131072 : 65536;
        }
        if ((1572864 & i2) == 0) {
            i3 |= startRestartGroup.changedInstance(function0) ? 1048576 : 524288;
        }
        if ((12582912 & i2) == 0) {
            i3 |= startRestartGroup.changed(i) ? 8388608 : 4194304;
        }
        if ((100663296 & i2) == 0) {
            i3 |= startRestartGroup.changed(bottomSheetState) ? 67108864 : 33554432;
        }
        if (!startRestartGroup.shouldExecute((38347923 & i3) != 38347922, i3 & 1)) {
            startRestartGroup.skipToGroupEnd();
        } else {
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventStart(757616750, i3, -1, "androidx.compose.material.BottomSheetScaffoldLayout (BottomSheetScaffold.kt:469)");
            }
            kotlin.jvm.functions.Function2[] function2Arr = new kotlin.jvm.functions.Function2[5];
            function2Arr[0] = function2 == null ? androidx.compose.material.ComposableSingletons$BottomSheetScaffoldKt.INSTANCE.m2585getLambda$505419337$material() : function2;
            function2Arr[1] = function22;
            function2Arr[2] = function23;
            function2Arr[3] = function24 == null ? androidx.compose.material.ComposableSingletons$BottomSheetScaffoldKt.INSTANCE.getLambda$687232378$material() : function24;
            function2Arr[4] = function25;
            java.util.List listOf = kotlin.collections.CollectionsKt.listOf((java.lang.Object[]) function2Arr);
            boolean z = (3670016 & i3) == 1048576;
            boolean z2 = (29360128 & i3) == 8388608;
            boolean z3 = (458752 & i3) == 131072;
            boolean z4 = (i3 & 234881024) == 67108864;
            androidx.compose.material.BottomSheetScaffoldKt$BottomSheetScaffoldLayout$1$1 rememberedValue = startRestartGroup.rememberedValue();
            if ((z3 | z | z2 | z4) || rememberedValue == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                rememberedValue = new androidx.compose.material.BottomSheetScaffoldKt$BottomSheetScaffoldLayout$1$1(function0, i, f, bottomSheetState);
                startRestartGroup.updateRememberedValue(rememberedValue);
            }
            androidx.compose.ui.layout.MultiContentMeasurePolicy multiContentMeasurePolicy = (androidx.compose.ui.layout.MultiContentMeasurePolicy) rememberedValue;
            androidx.compose.ui.Modifier.Companion companion = androidx.compose.ui.Modifier.INSTANCE;
            kotlin.jvm.functions.Function2<androidx.compose.runtime.Composer, java.lang.Integer, kotlin.Unit> combineAsVirtualLayouts = androidx.compose.ui.layout.LayoutKt.combineAsVirtualLayouts(listOf);
            boolean changed = startRestartGroup.changed(multiContentMeasurePolicy);
            java.lang.Object rememberedValue2 = startRestartGroup.rememberedValue();
            if (changed || rememberedValue2 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                rememberedValue2 = androidx.compose.ui.layout.MultiContentMeasurePolicyKt.createMeasurePolicy(multiContentMeasurePolicy);
                startRestartGroup.updateRememberedValue(rememberedValue2);
            }
            androidx.compose.ui.layout.MeasurePolicy measurePolicy = (androidx.compose.ui.layout.MeasurePolicy) rememberedValue2;
            int currentCompositeKeyHash = androidx.compose.runtime.ComposablesKt.getCurrentCompositeKeyHash(startRestartGroup, 0);
            androidx.compose.runtime.CompositionLocalMap currentCompositionLocalMap = startRestartGroup.getCurrentCompositionLocalMap();
            androidx.compose.ui.Modifier materializeModifier = androidx.compose.ui.ComposedModifierKt.materializeModifier(startRestartGroup, companion);
            kotlin.jvm.functions.Function0<androidx.compose.ui.node.ComposeUiNode> constructor = androidx.compose.ui.node.ComposeUiNode.INSTANCE.getConstructor();
            if (!(startRestartGroup.getApplier() instanceof androidx.compose.runtime.Applier)) {
                androidx.compose.runtime.ComposablesKt.invalidApplier();
            }
            startRestartGroup.startReusableNode();
            if (startRestartGroup.getInserting()) {
                startRestartGroup.createNode(constructor);
            } else {
                startRestartGroup.useNode();
            }
            androidx.compose.runtime.Composer m5299constructorimpl = androidx.compose.runtime.Updater.m5299constructorimpl(startRestartGroup);
            androidx.compose.runtime.Updater.m5307setimpl(m5299constructorimpl, measurePolicy, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetMeasurePolicy());
            androidx.compose.runtime.Updater.m5307setimpl(m5299constructorimpl, currentCompositionLocalMap, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
            kotlin.jvm.functions.Function2<androidx.compose.ui.node.ComposeUiNode, java.lang.Integer, kotlin.Unit> setCompositeKeyHash = androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
            if (m5299constructorimpl.getInserting() || !kotlin.jvm.internal.Intrinsics.areEqual(m5299constructorimpl.rememberedValue(), java.lang.Integer.valueOf(currentCompositeKeyHash))) {
                m5299constructorimpl.updateRememberedValue(java.lang.Integer.valueOf(currentCompositeKeyHash));
                m5299constructorimpl.apply(java.lang.Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
            }
            androidx.compose.runtime.Updater.m5307setimpl(m5299constructorimpl, materializeModifier, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetModifier());
            combineAsVirtualLayouts.invoke(startRestartGroup, 0);
            startRestartGroup.endNode();
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventEnd();
            }
        }
        androidx.compose.runtime.ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new kotlin.jvm.functions.Function2() { // from class: androidx.compose.material.BottomSheetScaffoldKt$$ExternalSyntheticLambda10
                @Override // kotlin.jvm.functions.Function2
                public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                    return androidx.compose.material.BottomSheetScaffoldKt.m2517$r8$lambda$U22WA4pCnrEst6jx7ef6QzPbAo(kotlin.jvm.functions.Function2.this, function22, function23, function24, function25, f, function0, i, bottomSheetState, i2, (androidx.compose.runtime.Composer) obj, ((java.lang.Integer) obj2).intValue());
                }
            });
        }
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$Al2nLCZktkh9fFUcmk0MUp5lLL4(kotlin.jvm.functions.Function3 function3, float f, androidx.compose.runtime.Composer composer, int i) {
        if (composer.shouldExecute((i & 3) != 2, i & 1)) {
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventStart(601061661, i, -1, "androidx.compose.material.BottomSheetScaffold.<anonymous>.<anonymous> (BottomSheetScaffold.kt:340)");
            }
            function3.invoke(androidx.compose.foundation.layout.PaddingKt.m1703PaddingValuesa9UjIt4$default(0.0f, 0.0f, 0.0f, f, 7, null), composer, 0);
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventEnd();
            }
        } else {
            composer.skipToGroupEnd();
        }
        return kotlin.Unit.INSTANCE;
    }

    /* renamed from: $r8$lambda$HIk6B_0l3iRRaqhUous54-GX2D8, reason: not valid java name */
    public static /* synthetic */ kotlin.Unit m2515$r8$lambda$HIk6B_0l3iRRaqhUous54GX2D8(boolean z, androidx.compose.material.BottomSheetScaffoldState bottomSheetScaffoldState, float f, androidx.compose.ui.graphics.Shape shape, float f2, long j, long j2, kotlin.jvm.functions.Function3 function3, androidx.compose.runtime.Composer composer, int i) {
        androidx.compose.ui.Modifier.Companion companion;
        if (composer.shouldExecute((i & 3) != 2, i & 1)) {
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventStart(1835125948, i, -1, "androidx.compose.material.BottomSheetScaffold.<anonymous>.<anonymous> (BottomSheetScaffold.kt:342)");
            }
            if (z) {
                composer.startReplaceGroup(-401495582);
                androidx.compose.ui.Modifier.Companion companion2 = androidx.compose.ui.Modifier.INSTANCE;
                boolean changed = composer.changed(bottomSheetScaffoldState.getBottomSheetState().getAnchoredDraggableState$material());
                androidx.compose.material.BottomSheetScaffoldKt$ConsumeSwipeWithinBottomSheetBoundsNestedScrollConnection$1 rememberedValue = composer.rememberedValue();
                if (changed || rememberedValue == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                    rememberedValue = new androidx.compose.material.BottomSheetScaffoldKt$ConsumeSwipeWithinBottomSheetBoundsNestedScrollConnection$1(bottomSheetScaffoldState.getBottomSheetState().getAnchoredDraggableState$material(), androidx.compose.foundation.gestures.Orientation.Vertical);
                    composer.updateRememberedValue(rememberedValue);
                }
                companion = androidx.compose.ui.input.nestedscroll.NestedScrollModifierKt.nestedScroll$default(companion2, (androidx.compose.ui.input.nestedscroll.NestedScrollConnection) rememberedValue, null, 2, null);
                composer.endReplaceGroup();
            } else {
                composer.startReplaceGroup(-1675503260);
                composer.endReplaceGroup();
                companion = androidx.compose.ui.Modifier.INSTANCE;
            }
            getHighSpeedVideoSizes(bottomSheetScaffoldState.getBottomSheetState(), z, shape, f2, j, j2, f, androidx.compose.foundation.layout.SizeKt.m1731requiredHeightInVpY3zN4$default(androidx.compose.foundation.layout.SizeKt.fillMaxWidth$default(companion, 0.0f, 1, null), f, 0.0f, 2, null), function3, composer, 0, 0);
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventEnd();
            }
        } else {
            composer.skipToGroupEnd();
        }
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$KrPvnN78q7YPU2bup7XFjo2ETGQ(kotlin.jvm.functions.Function3 function3, androidx.compose.material.BottomSheetScaffoldState bottomSheetScaffoldState, androidx.compose.runtime.Composer composer, int i) {
        if (composer.shouldExecute((i & 3) != 2, i & 1)) {
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventStart(8287226, i, -1, "androidx.compose.material.BottomSheetScaffold.<anonymous>.<anonymous> (BottomSheetScaffold.kt:366)");
            }
            function3.invoke(bottomSheetScaffoldState.getSnackbarHostState(), composer, 0);
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventEnd();
            }
        } else {
            composer.skipToGroupEnd();
        }
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Pair $r8$lambda$KyG3ttlQLl9ULKAMbPVWex6xA3U(androidx.compose.material.BottomSheetState bottomSheetState, final float f, androidx.compose.ui.unit.IntSize intSize, androidx.compose.ui.unit.Constraints constraints) {
        androidx.compose.material.BottomSheetValue bottomSheetValue;
        final int m8553getMaxHeightimpl = androidx.compose.ui.unit.Constraints.m8553getMaxHeightimpl(constraints.getGetHighSpeedVideoFpsRangesFor());
        final float m8776unboximpl = (int) (intSize.m8776unboximpl() & 4294967295L);
        androidx.compose.material.DraggableAnchors DraggableAnchors = androidx.compose.material.AnchoredDraggableKt.DraggableAnchors(new kotlin.jvm.functions.Function1() { // from class: androidx.compose.material.BottomSheetScaffoldKt$$ExternalSyntheticLambda6
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return androidx.compose.material.BottomSheetScaffoldKt.$r8$lambda$tQ5wcbjo_KXc3dA2xN2mpOFyQZ0(m8553getMaxHeightimpl, f, m8776unboximpl, (androidx.compose.material.DraggableAnchorsConfig) obj);
            }
        });
        int i = androidx.compose.material.BottomSheetScaffoldKt.WhenMappings.$EnumSwitchMapping$0[bottomSheetState.getAnchoredDraggableState$material().getTargetValue().ordinal()];
        if (i == 1) {
            bottomSheetValue = androidx.compose.material.BottomSheetValue.Collapsed;
        } else {
            if (i != 2) {
                throw new kotlin.NoWhenBranchMatchedException();
            }
            bottomSheetValue = DraggableAnchors.hasAnchorFor(androidx.compose.material.BottomSheetValue.Expanded) ? androidx.compose.material.BottomSheetValue.Expanded : androidx.compose.material.BottomSheetValue.Collapsed;
        }
        return kotlin.TuplesKt.to(DraggableAnchors, bottomSheetValue);
    }

    public static /* synthetic */ boolean $r8$lambda$MFQSEJnXsa8v2UeG2iNGJlqbFkY(androidx.compose.material.BottomSheetState bottomSheetState, kotlinx.coroutines.CoroutineScope coroutineScope) {
        if (!bottomSheetState.getAnchoredDraggableState$material().getConfirmValueChange$material().invoke(androidx.compose.material.BottomSheetValue.Collapsed).booleanValue()) {
            return true;
        }
        kotlinx.coroutines.BuildersKt__Builders_commonKt.launch$default(coroutineScope, null, null, new androidx.compose.material.BottomSheetScaffoldKt$BottomSheet$2$1$2$1(bottomSheetState, null), 3, null);
        return true;
    }

    /* renamed from: $r8$lambda$QEJ-4SbTW1vCpjWXM-MJZimUwwo, reason: not valid java name */
    public static /* synthetic */ kotlin.Unit m2516$r8$lambda$QEJ4SbTW1vCpjWXMMJZimUwwo(androidx.compose.material.BottomSheetState bottomSheetState, boolean z, androidx.compose.ui.graphics.Shape shape, float f, long j, long j2, float f2, androidx.compose.ui.Modifier modifier, kotlin.jvm.functions.Function3 function3, int i, int i2, androidx.compose.runtime.Composer composer, int i3) {
        getHighSpeedVideoSizes(bottomSheetState, z, shape, f, j, j2, f2, modifier, function3, composer, androidx.compose.runtime.RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
        return kotlin.Unit.INSTANCE;
    }

    /* renamed from: $r8$lambda$U22WA4pCnrEst6jx7ef6-QzPbAo, reason: not valid java name */
    public static /* synthetic */ kotlin.Unit m2517$r8$lambda$U22WA4pCnrEst6jx7ef6QzPbAo(kotlin.jvm.functions.Function2 function2, kotlin.jvm.functions.Function2 function22, kotlin.jvm.functions.Function2 function23, kotlin.jvm.functions.Function2 function24, kotlin.jvm.functions.Function2 function25, float f, kotlin.jvm.functions.Function0 function0, int i, androidx.compose.material.BottomSheetState bottomSheetState, int i2, androidx.compose.runtime.Composer composer, int i3) {
        getHighSpeedVideoSizes(function2, function22, function23, function24, function25, f, function0, i, bottomSheetState, composer, androidx.compose.runtime.RecomposeScopeImplKt.updateChangedFlags(i2 | 1));
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$aw6iVYYDtYDrg0RQoI7aMED_uLQ(final androidx.compose.material.BottomSheetScaffoldState bottomSheetScaffoldState, kotlin.jvm.functions.Function2 function2, kotlin.jvm.functions.Function2 function22, final float f, int i, final kotlin.jvm.functions.Function3 function3, final boolean z, final androidx.compose.ui.graphics.Shape shape, final float f2, final long j, final long j2, final kotlin.jvm.functions.Function3 function32, final kotlin.jvm.functions.Function3 function33, androidx.compose.runtime.Composer composer, int i2) {
        if (composer.shouldExecute((i2 & 3) != 2, i2 & 1)) {
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventStart(-747577963, i2, -1, "androidx.compose.material.BottomSheetScaffold.<anonymous> (BottomSheetScaffold.kt:338)");
            }
            androidx.compose.material.BottomSheetState bottomSheetState = bottomSheetScaffoldState.getBottomSheetState();
            androidx.compose.runtime.internal.ComposableLambda rememberComposableLambda = androidx.compose.runtime.internal.ComposableLambdaKt.rememberComposableLambda(601061661, true, new kotlin.jvm.functions.Function2() { // from class: androidx.compose.material.BottomSheetScaffoldKt$$ExternalSyntheticLambda11
                @Override // kotlin.jvm.functions.Function2
                public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                    return androidx.compose.material.BottomSheetScaffoldKt.$r8$lambda$Al2nLCZktkh9fFUcmk0MUp5lLL4(kotlin.jvm.functions.Function3.this, f, (androidx.compose.runtime.Composer) obj, ((java.lang.Integer) obj2).intValue());
                }
            }, composer, 54);
            androidx.compose.runtime.internal.ComposableLambda rememberComposableLambda2 = androidx.compose.runtime.internal.ComposableLambdaKt.rememberComposableLambda(1835125948, true, new kotlin.jvm.functions.Function2() { // from class: androidx.compose.material.BottomSheetScaffoldKt$$ExternalSyntheticLambda12
                @Override // kotlin.jvm.functions.Function2
                public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                    return androidx.compose.material.BottomSheetScaffoldKt.m2515$r8$lambda$HIk6B_0l3iRRaqhUous54GX2D8(z, bottomSheetScaffoldState, f, shape, f2, j, j2, function32, (androidx.compose.runtime.Composer) obj, ((java.lang.Integer) obj2).intValue());
                }
            }, composer, 54);
            androidx.compose.runtime.internal.ComposableLambda rememberComposableLambda3 = androidx.compose.runtime.internal.ComposableLambdaKt.rememberComposableLambda(8287226, true, new kotlin.jvm.functions.Function2() { // from class: androidx.compose.material.BottomSheetScaffoldKt$$ExternalSyntheticLambda13
                @Override // kotlin.jvm.functions.Function2
                public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                    return androidx.compose.material.BottomSheetScaffoldKt.$r8$lambda$KrPvnN78q7YPU2bup7XFjo2ETGQ(kotlin.jvm.functions.Function3.this, bottomSheetScaffoldState, (androidx.compose.runtime.Composer) obj, ((java.lang.Integer) obj2).intValue());
                }
            }, composer, 54);
            boolean changed = composer.changed(bottomSheetScaffoldState);
            java.lang.Object rememberedValue = composer.rememberedValue();
            if (changed || rememberedValue == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                rememberedValue = new kotlin.jvm.functions.Function0() { // from class: androidx.compose.material.BottomSheetScaffoldKt$$ExternalSyntheticLambda14
                    @Override // kotlin.jvm.functions.Function0
                    public final java.lang.Object invoke() {
                        float requireOffset;
                        requireOffset = androidx.compose.material.BottomSheetScaffoldState.this.getBottomSheetState().requireOffset();
                        return java.lang.Float.valueOf(requireOffset);
                    }
                };
                composer.updateRememberedValue(rememberedValue);
            }
            getHighSpeedVideoSizes(function2, rememberComposableLambda, rememberComposableLambda2, function22, rememberComposableLambda3, f, (kotlin.jvm.functions.Function0) rememberedValue, i, bottomSheetState, composer, 25008);
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventEnd();
            }
        } else {
            composer.skipToGroupEnd();
        }
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$cTxDf65WQmaMOi6fY95mLnECIGg(kotlin.jvm.functions.Function3 function3, androidx.compose.runtime.Composer composer, int i) {
        if (composer.shouldExecute((i & 3) != 2, i & 1)) {
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventStart(1065607095, i, -1, "androidx.compose.material.BottomSheet.<anonymous> (BottomSheetScaffold.kt:440)");
            }
            androidx.compose.ui.Modifier.Companion companion = androidx.compose.ui.Modifier.INSTANCE;
            androidx.compose.ui.layout.MeasurePolicy columnMeasurePolicy = androidx.compose.foundation.layout.ColumnKt.columnMeasurePolicy(androidx.compose.foundation.layout.Arrangement.INSTANCE.getTop(), androidx.compose.ui.Alignment.INSTANCE.getStart(), composer, 0);
            int currentCompositeKeyHash = androidx.compose.runtime.ComposablesKt.getCurrentCompositeKeyHash(composer, 0);
            androidx.compose.runtime.CompositionLocalMap currentCompositionLocalMap = composer.getCurrentCompositionLocalMap();
            androidx.compose.ui.Modifier materializeModifier = androidx.compose.ui.ComposedModifierKt.materializeModifier(composer, companion);
            kotlin.jvm.functions.Function0<androidx.compose.ui.node.ComposeUiNode> constructor = androidx.compose.ui.node.ComposeUiNode.INSTANCE.getConstructor();
            if (!(composer.getApplier() instanceof androidx.compose.runtime.Applier)) {
                androidx.compose.runtime.ComposablesKt.invalidApplier();
            }
            composer.startReusableNode();
            if (composer.getInserting()) {
                composer.createNode(constructor);
            } else {
                composer.useNode();
            }
            androidx.compose.runtime.Composer m5299constructorimpl = androidx.compose.runtime.Updater.m5299constructorimpl(composer);
            androidx.compose.runtime.Updater.m5307setimpl(m5299constructorimpl, columnMeasurePolicy, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetMeasurePolicy());
            androidx.compose.runtime.Updater.m5307setimpl(m5299constructorimpl, currentCompositionLocalMap, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
            kotlin.jvm.functions.Function2<androidx.compose.ui.node.ComposeUiNode, java.lang.Integer, kotlin.Unit> setCompositeKeyHash = androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
            if (m5299constructorimpl.getInserting() || !kotlin.jvm.internal.Intrinsics.areEqual(m5299constructorimpl.rememberedValue(), java.lang.Integer.valueOf(currentCompositeKeyHash))) {
                m5299constructorimpl.updateRememberedValue(java.lang.Integer.valueOf(currentCompositeKeyHash));
                m5299constructorimpl.apply(java.lang.Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
            }
            androidx.compose.runtime.Updater.m5307setimpl(m5299constructorimpl, materializeModifier, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetModifier());
            function3.invoke(androidx.compose.foundation.layout.ColumnScopeInstance.INSTANCE, composer, 6);
            composer.endNode();
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventEnd();
            }
        } else {
            composer.skipToGroupEnd();
        }
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ boolean $r8$lambda$gF3ZbPscuKbjgzYVYcT9lzo7kyI(androidx.compose.material.BottomSheetState bottomSheetState, kotlinx.coroutines.CoroutineScope coroutineScope) {
        if (!bottomSheetState.getAnchoredDraggableState$material().getConfirmValueChange$material().invoke(androidx.compose.material.BottomSheetValue.Expanded).booleanValue()) {
            return true;
        }
        kotlinx.coroutines.BuildersKt__Builders_commonKt.launch$default(coroutineScope, null, null, new androidx.compose.material.BottomSheetScaffoldKt$BottomSheet$2$1$1$1(bottomSheetState, null), 3, null);
        return true;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$tQ5wcbjo_KXc3dA2xN2mpOFyQZ0(int i, float f, float f2, androidx.compose.material.DraggableAnchorsConfig draggableAnchorsConfig) {
        float f3 = i;
        draggableAnchorsConfig.at(androidx.compose.material.BottomSheetValue.Collapsed, f3 - f);
        if (f2 > 0.0f && f2 != f) {
            draggableAnchorsConfig.at(androidx.compose.material.BottomSheetValue.Expanded, f3 - f2);
        }
        return kotlin.Unit.INSTANCE;
    }

    /* renamed from: $r8$lambda$vC59u-QYEs4rnCQwvwun1IUMPYk, reason: not valid java name */
    public static /* synthetic */ kotlin.Unit m2518$r8$lambda$vC59uQYEs4rnCQwvwun1IUMPYk(final androidx.compose.material.BottomSheetState bottomSheetState, final kotlinx.coroutines.CoroutineScope coroutineScope, androidx.compose.ui.semantics.SemanticsPropertyReceiver semanticsPropertyReceiver) {
        if (bottomSheetState.getAnchoredDraggableState$material().getAnchors().getSize() > 1) {
            if (bottomSheetState.isCollapsed()) {
                androidx.compose.ui.semantics.SemanticsPropertiesKt.expand$default(semanticsPropertyReceiver, null, new kotlin.jvm.functions.Function0() { // from class: androidx.compose.material.BottomSheetScaffoldKt$$ExternalSyntheticLambda8
                    @Override // kotlin.jvm.functions.Function0
                    public final java.lang.Object invoke() {
                        return java.lang.Boolean.valueOf(androidx.compose.material.BottomSheetScaffoldKt.$r8$lambda$gF3ZbPscuKbjgzYVYcT9lzo7kyI(androidx.compose.material.BottomSheetState.this, coroutineScope));
                    }
                }, 1, null);
            } else {
                androidx.compose.ui.semantics.SemanticsPropertiesKt.collapse$default(semanticsPropertyReceiver, null, new kotlin.jvm.functions.Function0() { // from class: androidx.compose.material.BottomSheetScaffoldKt$$ExternalSyntheticLambda9
                    @Override // kotlin.jvm.functions.Function0
                    public final java.lang.Object invoke() {
                        return java.lang.Boolean.valueOf(androidx.compose.material.BottomSheetScaffoldKt.$r8$lambda$MFQSEJnXsa8v2UeG2iNGJlqbFkY(androidx.compose.material.BottomSheetState.this, coroutineScope));
                    }
                }, 1, null);
            }
        }
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$wZvYNf9fm_YJlisW47TfF5H9VYI(kotlin.jvm.functions.Function3 function3, androidx.compose.ui.Modifier modifier, androidx.compose.material.BottomSheetScaffoldState bottomSheetScaffoldState, kotlin.jvm.functions.Function2 function2, kotlin.jvm.functions.Function3 function32, kotlin.jvm.functions.Function2 function22, int i, boolean z, androidx.compose.ui.graphics.Shape shape, float f, long j, long j2, float f2, long j3, long j4, kotlin.jvm.functions.Function3 function33, int i2, int i3, int i4, androidx.compose.runtime.Composer composer, int i5) {
        m2520BottomSheetScaffoldHnlDQGw(function3, modifier, bottomSheetScaffoldState, function2, function32, function22, i, z, shape, f, j, j2, f2, j3, j4, function33, composer, androidx.compose.runtime.RecomposeScopeImplKt.updateChangedFlags(i2 | 1), androidx.compose.runtime.RecomposeScopeImplKt.updateChangedFlags(i3), i4);
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ androidx.compose.material.BottomSheetState $r8$lambda$zWiZ0w1NjoMmD5lr5vQS0seaSGE(androidx.compose.material.BottomSheetValue bottomSheetValue, androidx.compose.ui.unit.Density density, androidx.compose.animation.core.AnimationSpec animationSpec, kotlin.jvm.functions.Function1 function1) {
        return new androidx.compose.material.BottomSheetState(bottomSheetValue, density, animationSpec, function1);
    }

    @kotlin.Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    /* loaded from: classes6.dex */
    public static final /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[androidx.compose.material.BottomSheetValue.values().length];
            try {
                iArr[androidx.compose.material.BottomSheetValue.Collapsed.ordinal()] = 1;
            } catch (java.lang.NoSuchFieldError unused) {
            }
            try {
                iArr[androidx.compose.material.BottomSheetValue.Expanded.ordinal()] = 2;
            } catch (java.lang.NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }
}
