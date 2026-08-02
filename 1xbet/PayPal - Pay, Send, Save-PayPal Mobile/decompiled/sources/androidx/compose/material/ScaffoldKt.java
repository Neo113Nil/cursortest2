package androidx.compose.material;

@kotlin.Metadata(d1 = {"\u0000\u0086\u0001\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\u001a!\u0010\u0000\u001a\u00020\u00012\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005H\u0007¢\u0006\u0002\u0010\u0006\u001a¤\u0002\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n2\b\b\u0002\u0010\u000b\u001a\u00020\f2\b\b\u0002\u0010\r\u001a\u00020\u00012\u0013\b\u0002\u0010\u000e\u001a\r\u0012\u0004\u0012\u00020\b0\u000f¢\u0006\u0002\b\u00102\u0013\b\u0002\u0010\u0011\u001a\r\u0012\u0004\u0012\u00020\b0\u000f¢\u0006\u0002\b\u00102\u0019\b\u0002\u0010\u0012\u001a\u0013\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\b0\u0013¢\u0006\u0002\b\u00102\u0013\b\u0002\u0010\u0014\u001a\r\u0012\u0004\u0012\u00020\b0\u000f¢\u0006\u0002\b\u00102\b\b\u0002\u0010\u0015\u001a\u00020\u00162\b\b\u0002\u0010\u0017\u001a\u00020\u00182 \b\u0002\u0010\u0019\u001a\u001a\u0012\u0004\u0012\u00020\u001a\u0012\u0004\u0012\u00020\b\u0018\u00010\u0013¢\u0006\u0002\b\u0010¢\u0006\u0002\b\u001b2\b\b\u0002\u0010\u001c\u001a\u00020\u00182\b\b\u0002\u0010\u001d\u001a\u00020\u001e2\b\b\u0002\u0010\u001f\u001a\u00020 2\b\b\u0002\u0010!\u001a\u00020\"2\b\b\u0002\u0010#\u001a\u00020\"2\b\b\u0002\u0010$\u001a\u00020\"2\b\b\u0002\u0010%\u001a\u00020\"2\b\b\u0002\u0010&\u001a\u00020\"2\u0017\u0010'\u001a\u0013\u0012\u0004\u0012\u00020(\u0012\u0004\u0012\u00020\b0\u0013¢\u0006\u0002\b\u0010H\u0007¢\u0006\u0004\b)\u0010*\u001a\u009c\u0002\u0010\u0007\u001a\u00020\b2\b\b\u0002\u0010\u000b\u001a\u00020\f2\b\b\u0002\u0010\r\u001a\u00020\u00012\u0013\b\u0002\u0010\u000e\u001a\r\u0012\u0004\u0012\u00020\b0\u000f¢\u0006\u0002\b\u00102\u0013\b\u0002\u0010\u0011\u001a\r\u0012\u0004\u0012\u00020\b0\u000f¢\u0006\u0002\b\u00102\u0019\b\u0002\u0010\u0012\u001a\u0013\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\b0\u0013¢\u0006\u0002\b\u00102\u0013\b\u0002\u0010\u0014\u001a\r\u0012\u0004\u0012\u00020\b0\u000f¢\u0006\u0002\b\u00102\b\b\u0002\u0010\u0015\u001a\u00020\u00162\b\b\u0002\u0010\u0017\u001a\u00020\u00182 \b\u0002\u0010\u0019\u001a\u001a\u0012\u0004\u0012\u00020\u001a\u0012\u0004\u0012\u00020\b\u0018\u00010\u0013¢\u0006\u0002\b\u0010¢\u0006\u0002\b\u001b2\b\b\u0002\u0010\u001c\u001a\u00020\u00182\b\b\u0002\u0010\u001d\u001a\u00020\u001e2\b\b\u0002\u0010\u001f\u001a\u00020 2\b\b\u0002\u0010!\u001a\u00020\"2\b\b\u0002\u0010#\u001a\u00020\"2\b\b\u0002\u0010$\u001a\u00020\"2\b\b\u0002\u0010%\u001a\u00020\"2\b\b\u0002\u0010&\u001a\u00020\"2\u0017\u0010'\u001a\u0013\u0012\u0004\u0012\u00020(\u0012\u0004\u0012\u00020\b0\u0013¢\u0006\u0002\b\u0010H\u0007¢\u0006\u0004\b+\u0010,\u001a¥\u0001\u0010-\u001a\u00020\b2\u0006\u0010.\u001a\u00020\u00182\u0006\u0010/\u001a\u00020\u00162\u0016\u0010\u000e\u001a\u0012\u0012\u0004\u0012\u00020\b0\u000f¢\u0006\u0002\b\u0010¢\u0006\u0002\b02\u001c\u0010'\u001a\u0018\u0012\u0004\u0012\u00020(\u0012\u0004\u0012\u00020\b0\u0013¢\u0006\u0002\b\u0010¢\u0006\u0002\b02\u0016\u00101\u001a\u0012\u0012\u0004\u0012\u00020\b0\u000f¢\u0006\u0002\b\u0010¢\u0006\u0002\b02\u0016\u00102\u001a\u0012\u0012\u0004\u0012\u00020\b0\u000f¢\u0006\u0002\b\u0010¢\u0006\u0002\b02\u0006\u0010\t\u001a\u00020\n2\u0016\u0010\u0011\u001a\u0012\u0012\u0004\u0012\u00020\b0\u000f¢\u0006\u0002\b\u0010¢\u0006\u0002\b0H\u0003¢\u0006\u0004\b3\u00104\"\u001c\u00105\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010706X\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b8\u00109\"\u0010\u0010:\u001a\u00020 X\u0082\u0004¢\u0006\u0004\n\u0002\u0010;¨\u0006<"}, d2 = {"rememberScaffoldState", "Landroidx/compose/material/ScaffoldState;", "drawerState", "Landroidx/compose/material/DrawerState;", "snackbarHostState", "Landroidx/compose/material/SnackbarHostState;", "(Landroidx/compose/material/DrawerState;Landroidx/compose/material/SnackbarHostState;Landroidx/compose/runtime/Composer;II)Landroidx/compose/material/ScaffoldState;", "Scaffold", "", "contentWindowInsets", "Landroidx/compose/foundation/layout/WindowInsets;", "modifier", "Landroidx/compose/ui/Modifier;", "scaffoldState", "topBar", "Lkotlin/Function0;", "Landroidx/compose/runtime/Composable;", "bottomBar", "snackbarHost", "Lkotlin/Function1;", "floatingActionButton", "floatingActionButtonPosition", "Landroidx/compose/material/FabPosition;", "isFloatingActionButtonDocked", "", "drawerContent", "Landroidx/compose/foundation/layout/ColumnScope;", "Lkotlin/ExtensionFunctionType;", "drawerGesturesEnabled", "drawerShape", "Landroidx/compose/ui/graphics/Shape;", "drawerElevation", "Landroidx/compose/ui/unit/Dp;", "drawerBackgroundColor", "Landroidx/compose/ui/graphics/Color;", "drawerContentColor", "drawerScrimColor", "backgroundColor", "contentColor", "content", "Landroidx/compose/foundation/layout/PaddingValues;", "Scaffold-u4IkXBM", "(Landroidx/compose/foundation/layout/WindowInsets;Landroidx/compose/ui/Modifier;Landroidx/compose/material/ScaffoldState;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function3;Lkotlin/jvm/functions/Function2;IZLkotlin/jvm/functions/Function3;ZLandroidx/compose/ui/graphics/Shape;FJJJJJLkotlin/jvm/functions/Function3;Landroidx/compose/runtime/Composer;III)V", "Scaffold-27mzLpw", "(Landroidx/compose/ui/Modifier;Landroidx/compose/material/ScaffoldState;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function3;Lkotlin/jvm/functions/Function2;IZLkotlin/jvm/functions/Function3;ZLandroidx/compose/ui/graphics/Shape;FJJJJJLkotlin/jvm/functions/Function3;Landroidx/compose/runtime/Composer;III)V", "ScaffoldLayout", "isFabDocked", "fabPosition", "Landroidx/compose/ui/UiComposable;", "snackbar", "fab", "ScaffoldLayout-i1QSOvI", "(ZILkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function3;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;Landroidx/compose/foundation/layout/WindowInsets;Lkotlin/jvm/functions/Function2;Landroidx/compose/runtime/Composer;I)V", "LocalFabPlacement", "Landroidx/compose/runtime/ProvidableCompositionLocal;", "Landroidx/compose/material/FabPlacement;", "getLocalFabPlacement", "()Landroidx/compose/runtime/ProvidableCompositionLocal;", "FabSpacing", com.adobe.marketing.mobile.internal.CoreConstants.Wrapper.Type.FLUTTER, "material"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class ScaffoldKt {
    private static final androidx.compose.runtime.ProvidableCompositionLocal<androidx.compose.material.FabPlacement> Camera2StreamConfigurationMap = androidx.compose.runtime.CompositionLocalKt.staticCompositionLocalOf(new kotlin.jvm.functions.Function0() { // from class: androidx.compose.material.ScaffoldKt$$ExternalSyntheticLambda0
        @Override // kotlin.jvm.functions.Function0
        public final java.lang.Object invoke() {
            return androidx.compose.material.ScaffoldKt.$r8$lambda$R_ColQfMhzt2ZEs9piidy7C_zM4();
        }
    });
    private static final float getHighResolutionOutputSizeshNQ4ISI = androidx.compose.ui.unit.Dp.m8601constructorimpl(16.0f);

    public static /* synthetic */ androidx.compose.material.FabPlacement $r8$lambda$R_ColQfMhzt2ZEs9piidy7C_zM4() {
        return null;
    }

    public static final androidx.compose.material.ScaffoldState rememberScaffoldState(androidx.compose.material.DrawerState drawerState, androidx.compose.material.SnackbarHostState snackbarHostState, androidx.compose.runtime.Composer composer, int i, int i2) {
        if ((i2 & 1) != 0) {
            drawerState = androidx.compose.material.DrawerKt.rememberDrawerState(androidx.compose.material.DrawerValue.Closed, null, composer, 6, 2);
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
            androidx.compose.runtime.ComposerKt.traceEventStart(1569641925, i, -1, "androidx.compose.material.rememberScaffoldState (Scaffold.kt:73)");
        }
        java.lang.Object rememberedValue2 = composer.rememberedValue();
        if (rememberedValue2 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
            rememberedValue2 = new androidx.compose.material.ScaffoldState(drawerState, snackbarHostState);
            composer.updateRememberedValue(rememberedValue2);
        }
        androidx.compose.material.ScaffoldState scaffoldState = (androidx.compose.material.ScaffoldState) rememberedValue2;
        if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
            androidx.compose.runtime.ComposerKt.traceEventEnd();
        }
        return scaffoldState;
    }

    /* JADX WARN: Code restructure failed: missing block: B:70:0x01b6, code lost:
    
        if (r0.changed(r52) == false) goto L155;
     */
    /* JADX WARN: Removed duplicated region for block: B:106:0x0234  */
    /* JADX WARN: Removed duplicated region for block: B:111:0x0248  */
    /* JADX WARN: Removed duplicated region for block: B:13:0x0041  */
    /* JADX WARN: Removed duplicated region for block: B:156:0x0501  */
    /* JADX WARN: Removed duplicated region for block: B:159:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0060  */
    /* JADX WARN: Removed duplicated region for block: B:222:0x04d6  */
    /* JADX WARN: Removed duplicated region for block: B:225:0x0213  */
    /* JADX WARN: Removed duplicated region for block: B:227:0x01f7  */
    /* JADX WARN: Removed duplicated region for block: B:229:0x01dd  */
    /* JADX WARN: Removed duplicated region for block: B:231:0x01c0  */
    /* JADX WARN: Removed duplicated region for block: B:233:0x01a6  */
    /* JADX WARN: Removed duplicated region for block: B:234:0x0178  */
    /* JADX WARN: Removed duplicated region for block: B:243:0x016d  */
    /* JADX WARN: Removed duplicated region for block: B:244:0x013d  */
    /* JADX WARN: Removed duplicated region for block: B:252:0x0121  */
    /* JADX WARN: Removed duplicated region for block: B:259:0x0103  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0081  */
    /* JADX WARN: Removed duplicated region for block: B:266:0x00e5  */
    /* JADX WARN: Removed duplicated region for block: B:273:0x00c7  */
    /* JADX WARN: Removed duplicated region for block: B:280:0x00a9  */
    /* JADX WARN: Removed duplicated region for block: B:287:0x0084  */
    /* JADX WARN: Removed duplicated region for block: B:294:0x0063  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x00a4  */
    /* JADX WARN: Removed duplicated region for block: B:303:0x0056  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x00c2  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00e0  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00fe  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x011c  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x0138  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0157  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x0175  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x0192  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x01ac  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x01c6  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x01e3  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x01ff  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x021d  */
    /* renamed from: Scaffold-u4IkXBM, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void m2720Scaffoldu4IkXBM(final androidx.compose.foundation.layout.WindowInsets windowInsets, androidx.compose.ui.Modifier modifier, androidx.compose.material.ScaffoldState scaffoldState, kotlin.jvm.functions.Function2<? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.Unit> function2, kotlin.jvm.functions.Function2<? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.Unit> function22, kotlin.jvm.functions.Function3<? super androidx.compose.material.SnackbarHostState, ? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.Unit> function3, kotlin.jvm.functions.Function2<? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.Unit> function23, int i, boolean z, kotlin.jvm.functions.Function3<? super androidx.compose.foundation.layout.ColumnScope, ? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.Unit> function32, boolean z2, androidx.compose.ui.graphics.Shape shape, float f, long j, long j2, long j3, long j4, long j5, final kotlin.jvm.functions.Function3<? super androidx.compose.foundation.layout.PaddingValues, ? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.Unit> function33, androidx.compose.runtime.Composer composer, final int i2, final int i3, final int i4) {
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
        final androidx.compose.ui.Modifier modifier2;
        final androidx.compose.material.ScaffoldState scaffoldState2;
        final kotlin.jvm.functions.Function2<? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.Unit> function24;
        final kotlin.jvm.functions.Function2<? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.Unit> function25;
        final kotlin.jvm.functions.Function3<? super androidx.compose.material.SnackbarHostState, ? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.Unit> function34;
        final kotlin.jvm.functions.Function2<? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.Unit> function26;
        final int i17;
        final boolean z3;
        final kotlin.jvm.functions.Function3<? super androidx.compose.foundation.layout.ColumnScope, ? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.Unit> function35;
        final boolean z4;
        final androidx.compose.ui.graphics.Shape shape2;
        final float f2;
        final long j6;
        final long j7;
        final long j8;
        final long j9;
        final long j10;
        androidx.compose.runtime.ScopeUpdateScope endRestartGroup;
        androidx.compose.ui.Modifier modifier3;
        boolean z5;
        androidx.compose.material.ScaffoldState scaffoldState3;
        kotlin.jvm.functions.Function2<? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.Unit> lambda$866784315$material;
        kotlin.jvm.functions.Function2<? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.Unit> lambda$1714259275$material;
        kotlin.jvm.functions.Function3<? super androidx.compose.material.SnackbarHostState, ? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.Unit> m2592getLambda$1836397928$material;
        kotlin.jvm.functions.Function2<? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.Unit> m2590getLambda$1406416085$material;
        int m2634getEnd5ygKITE;
        boolean z6;
        androidx.compose.foundation.shape.CornerBasedShape cornerBasedShape;
        float m2603getElevationD9Ej5fM;
        boolean z7;
        long j11;
        long j12;
        long j13;
        int i18;
        long j14;
        long j15;
        long j16;
        kotlin.jvm.functions.Function3<? super androidx.compose.foundation.layout.ColumnScope, ? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.Unit> function36;
        long j17;
        long j18;
        long j19;
        int i19;
        int i20;
        boolean z8;
        float f3;
        androidx.compose.material.ScaffoldState scaffoldState4;
        int i21;
        int i22;
        androidx.compose.runtime.Composer startRestartGroup = composer.startRestartGroup(50073903);
        if ((i2 & 6) == 0) {
            i5 = (startRestartGroup.changed(windowInsets) ? 4 : 2) | i2;
        } else {
            i5 = i2;
        }
        int i23 = i4 & 2;
        if (i23 != 0) {
            i5 |= 48;
        } else if ((i2 & 48) == 0) {
            i5 |= startRestartGroup.changed(modifier) ? 32 : 16;
            if ((i2 & 384) == 0) {
                if ((i4 & 4) == 0 && startRestartGroup.changed(scaffoldState)) {
                    i22 = 256;
                    i5 |= i22;
                }
                i22 = 128;
                i5 |= i22;
            }
            i6 = i4 & 8;
            int i24 = 1024;
            if (i6 == 0) {
                i5 |= 3072;
            } else if ((i2 & 3072) == 0) {
                i5 |= startRestartGroup.changedInstance(function2) ? 2048 : 1024;
                i7 = i4 & 16;
                int i25 = 16384;
                if (i7 != 0) {
                    i5 |= 24576;
                } else if ((i2 & 24576) == 0) {
                    i5 |= startRestartGroup.changedInstance(function22) ? 16384 : 8192;
                    i8 = i4 & 32;
                    if (i8 == 0) {
                        i5 |= androidx.profileinstaller.ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE;
                    } else if ((i2 & androidx.profileinstaller.ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE) == 0) {
                        i5 |= startRestartGroup.changedInstance(function3) ? 131072 : 65536;
                    }
                    i9 = i4 & 64;
                    if (i9 == 0) {
                        i5 |= 1572864;
                    } else if ((i2 & 1572864) == 0) {
                        i5 |= startRestartGroup.changedInstance(function23) ? 1048576 : 524288;
                    }
                    i10 = i4 & 128;
                    if (i10 == 0) {
                        i5 |= 12582912;
                    } else if ((i2 & 12582912) == 0) {
                        i5 |= startRestartGroup.changed(i) ? 8388608 : 4194304;
                    }
                    i11 = i4 & 256;
                    if (i11 == 0) {
                        i5 |= 100663296;
                    } else if ((i2 & 100663296) == 0) {
                        i5 |= startRestartGroup.changed(z) ? 67108864 : 33554432;
                    }
                    i12 = i4 & 512;
                    if (i12 == 0) {
                        i5 |= 805306368;
                    } else if ((i2 & 805306368) == 0) {
                        i5 |= startRestartGroup.changedInstance(function32) ? 536870912 : 268435456;
                    }
                    i13 = i4 & 1024;
                    if (i13 == 0) {
                        i14 = i3 | 6;
                    } else if ((i3 & 6) == 0) {
                        i14 = i3 | (startRestartGroup.changed(z2) ? 4 : 2);
                    } else {
                        i14 = i3;
                    }
                    if ((i3 & 48) == 0) {
                        if ((i4 & 2048) == 0 && startRestartGroup.changed(shape)) {
                            i21 = 32;
                            i14 |= i21;
                        }
                        i21 = 16;
                        i14 |= i21;
                    }
                    i15 = i14;
                    i16 = i4 & 4096;
                    if (i16 == 0) {
                        i15 |= 384;
                    } else if ((i3 & 384) == 0) {
                        i15 |= startRestartGroup.changed(f) ? 256 : 128;
                        if ((i3 & 3072) == 0) {
                            if ((i4 & 8192) == 0 && startRestartGroup.changed(j)) {
                                i24 = 2048;
                            }
                            i15 |= i24;
                        }
                        if ((i3 & 24576) == 0) {
                            if ((i4 & 16384) != 0) {
                            }
                            i25 = 8192;
                            i15 |= i25;
                        }
                        if ((i3 & androidx.profileinstaller.ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE) == 0) {
                            i15 |= ((i4 & 32768) == 0 && startRestartGroup.changed(j3)) ? 131072 : 65536;
                        }
                        if ((i3 & 1572864) == 0) {
                            i15 |= ((i4 & 65536) == 0 && startRestartGroup.changed(j4)) ? 1048576 : 524288;
                        }
                        if ((i3 & 12582912) == 0) {
                            i15 |= ((i4 & 131072) == 0 && startRestartGroup.changed(j5)) ? 8388608 : 4194304;
                        }
                        if ((i3 & 100663296) == 0) {
                            i15 |= startRestartGroup.changedInstance(function33) ? 67108864 : 33554432;
                        }
                        if (startRestartGroup.shouldExecute((i5 & 306783379) == 306783378 || (38347923 & i15) != 38347922, i5 & 1)) {
                            startRestartGroup.startDefaults();
                            if ((i2 & 1) != 0 && !startRestartGroup.getDefaultsInvalid()) {
                                startRestartGroup.skipToGroupEnd();
                                if ((i4 & 4) != 0) {
                                    i5 &= -897;
                                }
                                if ((i4 & 2048) != 0) {
                                    i15 &= -113;
                                }
                                if ((i4 & 8192) != 0) {
                                    i15 &= -7169;
                                }
                                if ((i4 & 16384) != 0) {
                                    i15 &= -57345;
                                }
                                if ((32768 & i4) != 0) {
                                    i15 &= -458753;
                                }
                                if ((i4 & 65536) != 0) {
                                    i15 &= -3670017;
                                }
                                if ((i4 & 131072) != 0) {
                                    i15 &= -29360129;
                                }
                                scaffoldState3 = scaffoldState;
                                lambda$866784315$material = function2;
                                lambda$1714259275$material = function22;
                                m2592getLambda$1836397928$material = function3;
                                m2590getLambda$1406416085$material = function23;
                                m2634getEnd5ygKITE = i;
                                z8 = z;
                                function36 = function32;
                                z6 = z2;
                                cornerBasedShape = shape;
                                m2603getElevationD9Ej5fM = f;
                                j13 = j;
                                j12 = j2;
                                j17 = j3;
                                j19 = j4;
                                j18 = j5;
                                i19 = i15;
                                i20 = i5;
                                modifier2 = modifier;
                            } else {
                                androidx.compose.ui.Modifier.Companion companion = i23 != 0 ? androidx.compose.ui.Modifier.INSTANCE : modifier;
                                if ((i4 & 4) != 0) {
                                    modifier3 = companion;
                                    z5 = false;
                                    scaffoldState3 = rememberScaffoldState(null, null, startRestartGroup, 0, 3);
                                    i5 &= -897;
                                } else {
                                    modifier3 = companion;
                                    z5 = false;
                                    scaffoldState3 = scaffoldState;
                                }
                                lambda$866784315$material = i6 != 0 ? androidx.compose.material.ComposableSingletons$ScaffoldKt.INSTANCE.getLambda$866784315$material() : function2;
                                lambda$1714259275$material = i7 != 0 ? androidx.compose.material.ComposableSingletons$ScaffoldKt.INSTANCE.getLambda$1714259275$material() : function22;
                                m2592getLambda$1836397928$material = i8 != 0 ? androidx.compose.material.ComposableSingletons$ScaffoldKt.INSTANCE.m2592getLambda$1836397928$material() : function3;
                                m2590getLambda$1406416085$material = i9 != 0 ? androidx.compose.material.ComposableSingletons$ScaffoldKt.INSTANCE.m2590getLambda$1406416085$material() : function23;
                                m2634getEnd5ygKITE = i10 != 0 ? androidx.compose.material.FabPosition.INSTANCE.m2634getEnd5ygKITE() : i;
                                boolean z9 = i11 != 0 ? z5 : z;
                                kotlin.jvm.functions.Function3<? super androidx.compose.foundation.layout.ColumnScope, ? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.Unit> function37 = i12 != 0 ? null : function32;
                                z6 = i13 != 0 ? true : z2;
                                int i26 = i5;
                                if ((i4 & 2048) != 0) {
                                    cornerBasedShape = androidx.compose.material.MaterialTheme.INSTANCE.getShapes(startRestartGroup, 6).getLarge();
                                    i15 &= -113;
                                } else {
                                    cornerBasedShape = shape;
                                }
                                m2603getElevationD9Ej5fM = i16 != 0 ? androidx.compose.material.DrawerDefaults.INSTANCE.m2603getElevationD9Ej5fM() : f;
                                if ((i4 & 8192) != 0) {
                                    z7 = z9;
                                    j11 = androidx.compose.material.MaterialTheme.INSTANCE.getColors(startRestartGroup, 6).m2566getSurface0d7_KjU();
                                    i15 &= -7169;
                                } else {
                                    z7 = z9;
                                    j11 = j;
                                }
                                kotlin.jvm.functions.Function3<? super androidx.compose.foundation.layout.ColumnScope, ? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.Unit> function38 = function37;
                                if ((i4 & 16384) != 0) {
                                    j12 = androidx.compose.material.ColorsKt.m2580contentColorForek8zF_U(j11, startRestartGroup, (i15 >> 9) & 14);
                                    i15 &= -57345;
                                } else {
                                    j12 = j2;
                                }
                                if ((32768 & i4) != 0) {
                                    j13 = j11;
                                    i18 = 6;
                                    j14 = androidx.compose.material.DrawerDefaults.INSTANCE.getScrimColor(startRestartGroup, 6);
                                    i15 &= -458753;
                                } else {
                                    j13 = j11;
                                    i18 = 6;
                                    j14 = j3;
                                }
                                if ((i4 & 65536) != 0) {
                                    j15 = j14;
                                    j16 = androidx.compose.material.MaterialTheme.INSTANCE.getColors(startRestartGroup, i18).m2555getBackground0d7_KjU();
                                    i15 = (-3670017) & i15;
                                } else {
                                    j15 = j14;
                                    j16 = j4;
                                }
                                if ((i4 & 131072) != 0) {
                                    function36 = function38;
                                    j19 = j16;
                                    i19 = i15 & (-29360129);
                                    j18 = androidx.compose.material.ColorsKt.m2580contentColorForek8zF_U(j16, startRestartGroup, (i15 >> 18) & 14);
                                    modifier2 = modifier3;
                                    i20 = i26;
                                    z8 = z7;
                                    j17 = j15;
                                } else {
                                    function36 = function38;
                                    j17 = j15;
                                    j18 = j5;
                                    j19 = j16;
                                    i19 = i15;
                                    modifier2 = modifier3;
                                    i20 = i26;
                                    z8 = z7;
                                }
                            }
                            startRestartGroup.endDefaults();
                            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                                f3 = m2603getElevationD9Ej5fM;
                                androidx.compose.runtime.ComposerKt.traceEventStart(50073903, i20, i19, "androidx.compose.material.Scaffold (Scaffold.kt:196)");
                            } else {
                                f3 = m2603getElevationD9Ej5fM;
                            }
                            boolean z10 = (i20 & 14) == 4;
                            java.lang.Object rememberedValue = startRestartGroup.rememberedValue();
                            if (z10 || rememberedValue == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                                rememberedValue = new androidx.compose.material.MutableWindowInsets(windowInsets);
                                startRestartGroup.updateRememberedValue(rememberedValue);
                            }
                            final androidx.compose.material.MutableWindowInsets mutableWindowInsets = (androidx.compose.material.MutableWindowInsets) rememberedValue;
                            final long j20 = j19;
                            final long j21 = j18;
                            final boolean z11 = z8;
                            final int i27 = m2634getEnd5ygKITE;
                            final kotlin.jvm.functions.Function2<? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.Unit> function27 = lambda$866784315$material;
                            final kotlin.jvm.functions.Function2<? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.Unit> function28 = m2590getLambda$1406416085$material;
                            final kotlin.jvm.functions.Function2<? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.Unit> function29 = lambda$1714259275$material;
                            final kotlin.jvm.functions.Function3<? super androidx.compose.material.SnackbarHostState, ? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.Unit> function39 = m2592getLambda$1836397928$material;
                            final androidx.compose.material.ScaffoldState scaffoldState5 = scaffoldState3;
                            boolean z12 = z8;
                            final androidx.compose.runtime.internal.ComposableLambda rememberComposableLambda = androidx.compose.runtime.internal.ComposableLambdaKt.rememberComposableLambda(-1236753028, true, new kotlin.jvm.functions.Function3() { // from class: androidx.compose.material.ScaffoldKt$$ExternalSyntheticLambda4
                                @Override // kotlin.jvm.functions.Function3
                                public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2, java.lang.Object obj3) {
                                    kotlin.Unit highResolutionOutputSizeshNQ4ISI;
                                    highResolutionOutputSizeshNQ4ISI = androidx.compose.material.ScaffoldKt.getHighResolutionOutputSizeshNQ4ISI(androidx.compose.material.MutableWindowInsets.this, windowInsets, j20, j21, z11, i27, function27, function33, function28, function29, function39, scaffoldState5, (androidx.compose.ui.Modifier) obj, (androidx.compose.runtime.Composer) obj2, ((java.lang.Integer) obj3).intValue());
                                    return highResolutionOutputSizeshNQ4ISI;
                                }
                            }, startRestartGroup, 54);
                            if (function36 != null) {
                                startRestartGroup.startReplaceGroup(1400257547);
                                scaffoldState4 = scaffoldState3;
                                int i28 = i19 << 9;
                                androidx.compose.material.DrawerKt.m2610ModalDrawerGs3lGvM(function36, modifier2, scaffoldState3.getDrawerState(), z6, cornerBasedShape, f3, j13, j12, j17, androidx.compose.runtime.internal.ComposableLambdaKt.rememberComposableLambda(-1888468172, true, new kotlin.jvm.functions.Function2() { // from class: androidx.compose.material.ScaffoldKt$$ExternalSyntheticLambda5
                                    @Override // kotlin.jvm.functions.Function2
                                    public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                                        kotlin.Unit highSpeedVideoSizes;
                                        highSpeedVideoSizes = androidx.compose.material.ScaffoldKt.getHighSpeedVideoSizes(kotlin.jvm.functions.Function3.this, (androidx.compose.runtime.Composer) obj, ((java.lang.Integer) obj2).intValue());
                                        return highSpeedVideoSizes;
                                    }
                                }, startRestartGroup, 54), startRestartGroup, (i28 & 234881024) | (i20 & 112) | ((i20 >> 27) & 14) | 805306368 | (i28 & 7168) | (57344 & i28) | (458752 & i28) | (3670016 & i28) | (29360128 & i28), 0);
                                startRestartGroup.endReplaceGroup();
                            } else {
                                scaffoldState4 = scaffoldState3;
                                startRestartGroup.startReplaceGroup(1400739380);
                                rememberComposableLambda.invoke(modifier2, startRestartGroup, java.lang.Integer.valueOf(((i20 >> 3) & 14) | 48));
                                startRestartGroup.endReplaceGroup();
                            }
                            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                                androidx.compose.runtime.ComposerKt.traceEventEnd();
                            }
                            f2 = f3;
                            z3 = z12;
                            scaffoldState2 = scaffoldState4;
                            i17 = m2634getEnd5ygKITE;
                            function26 = m2590getLambda$1406416085$material;
                            j7 = j12;
                            j8 = j17;
                            j10 = j18;
                            z4 = z6;
                            function34 = m2592getLambda$1836397928$material;
                            j6 = j13;
                            j9 = j19;
                            kotlin.jvm.functions.Function2<? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.Unit> function210 = lambda$866784315$material;
                            function35 = function36;
                            function24 = function210;
                            kotlin.jvm.functions.Function2<? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.Unit> function211 = lambda$1714259275$material;
                            shape2 = cornerBasedShape;
                            function25 = function211;
                        } else {
                            startRestartGroup.skipToGroupEnd();
                            modifier2 = modifier;
                            scaffoldState2 = scaffoldState;
                            function24 = function2;
                            function25 = function22;
                            function34 = function3;
                            function26 = function23;
                            i17 = i;
                            z3 = z;
                            function35 = function32;
                            z4 = z2;
                            shape2 = shape;
                            f2 = f;
                            j6 = j;
                            j7 = j2;
                            j8 = j3;
                            j9 = j4;
                            j10 = j5;
                        }
                        endRestartGroup = startRestartGroup.endRestartGroup();
                        if (endRestartGroup != null) {
                            endRestartGroup.updateScope(new kotlin.jvm.functions.Function2() { // from class: androidx.compose.material.ScaffoldKt$$ExternalSyntheticLambda6
                                @Override // kotlin.jvm.functions.Function2
                                public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                                    kotlin.Unit highSpeedVideoFpsRangesFor;
                                    ((java.lang.Integer) obj2).intValue();
                                    highSpeedVideoFpsRangesFor = androidx.compose.material.ScaffoldKt.getHighSpeedVideoFpsRangesFor(androidx.compose.foundation.layout.WindowInsets.this, modifier2, scaffoldState2, function24, function25, function34, function26, i17, z3, function35, z4, shape2, f2, j6, j7, j8, j9, j10, function33, i2, i3, i4, (androidx.compose.runtime.Composer) obj);
                                    return highSpeedVideoFpsRangesFor;
                                }
                            });
                            return;
                        }
                        return;
                    }
                    if ((i3 & 3072) == 0) {
                    }
                    if ((i3 & 24576) == 0) {
                    }
                    if ((i3 & androidx.profileinstaller.ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE) == 0) {
                    }
                    if ((i3 & 1572864) == 0) {
                    }
                    if ((i3 & 12582912) == 0) {
                    }
                    if ((i3 & 100663296) == 0) {
                    }
                    if (startRestartGroup.shouldExecute((i5 & 306783379) == 306783378 || (38347923 & i15) != 38347922, i5 & 1)) {
                    }
                    endRestartGroup = startRestartGroup.endRestartGroup();
                    if (endRestartGroup != null) {
                    }
                }
                i8 = i4 & 32;
                if (i8 == 0) {
                }
                i9 = i4 & 64;
                if (i9 == 0) {
                }
                i10 = i4 & 128;
                if (i10 == 0) {
                }
                i11 = i4 & 256;
                if (i11 == 0) {
                }
                i12 = i4 & 512;
                if (i12 == 0) {
                }
                i13 = i4 & 1024;
                if (i13 == 0) {
                }
                if ((i3 & 48) == 0) {
                }
                i15 = i14;
                i16 = i4 & 4096;
                if (i16 == 0) {
                }
                if ((i3 & 3072) == 0) {
                }
                if ((i3 & 24576) == 0) {
                }
                if ((i3 & androidx.profileinstaller.ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE) == 0) {
                }
                if ((i3 & 1572864) == 0) {
                }
                if ((i3 & 12582912) == 0) {
                }
                if ((i3 & 100663296) == 0) {
                }
                if (startRestartGroup.shouldExecute((i5 & 306783379) == 306783378 || (38347923 & i15) != 38347922, i5 & 1)) {
                }
                endRestartGroup = startRestartGroup.endRestartGroup();
                if (endRestartGroup != null) {
                }
            }
            i7 = i4 & 16;
            int i252 = 16384;
            if (i7 != 0) {
            }
            i8 = i4 & 32;
            if (i8 == 0) {
            }
            i9 = i4 & 64;
            if (i9 == 0) {
            }
            i10 = i4 & 128;
            if (i10 == 0) {
            }
            i11 = i4 & 256;
            if (i11 == 0) {
            }
            i12 = i4 & 512;
            if (i12 == 0) {
            }
            i13 = i4 & 1024;
            if (i13 == 0) {
            }
            if ((i3 & 48) == 0) {
            }
            i15 = i14;
            i16 = i4 & 4096;
            if (i16 == 0) {
            }
            if ((i3 & 3072) == 0) {
            }
            if ((i3 & 24576) == 0) {
            }
            if ((i3 & androidx.profileinstaller.ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE) == 0) {
            }
            if ((i3 & 1572864) == 0) {
            }
            if ((i3 & 12582912) == 0) {
            }
            if ((i3 & 100663296) == 0) {
            }
            if (startRestartGroup.shouldExecute((i5 & 306783379) == 306783378 || (38347923 & i15) != 38347922, i5 & 1)) {
            }
            endRestartGroup = startRestartGroup.endRestartGroup();
            if (endRestartGroup != null) {
            }
        }
        if ((i2 & 384) == 0) {
        }
        i6 = i4 & 8;
        int i242 = 1024;
        if (i6 == 0) {
        }
        i7 = i4 & 16;
        int i2522 = 16384;
        if (i7 != 0) {
        }
        i8 = i4 & 32;
        if (i8 == 0) {
        }
        i9 = i4 & 64;
        if (i9 == 0) {
        }
        i10 = i4 & 128;
        if (i10 == 0) {
        }
        i11 = i4 & 256;
        if (i11 == 0) {
        }
        i12 = i4 & 512;
        if (i12 == 0) {
        }
        i13 = i4 & 1024;
        if (i13 == 0) {
        }
        if ((i3 & 48) == 0) {
        }
        i15 = i14;
        i16 = i4 & 4096;
        if (i16 == 0) {
        }
        if ((i3 & 3072) == 0) {
        }
        if ((i3 & 24576) == 0) {
        }
        if ((i3 & androidx.profileinstaller.ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE) == 0) {
        }
        if ((i3 & 1572864) == 0) {
        }
        if ((i3 & 12582912) == 0) {
        }
        if ((i3 & 100663296) == 0) {
        }
        if (startRestartGroup.shouldExecute((i5 & 306783379) == 306783378 || (38347923 & i15) != 38347922, i5 & 1)) {
        }
        endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final kotlin.Unit getHighResolutionOutputSizeshNQ4ISI(final androidx.compose.material.MutableWindowInsets mutableWindowInsets, final androidx.compose.foundation.layout.WindowInsets windowInsets, long j, long j2, final boolean z, final int i, final kotlin.jvm.functions.Function2 function2, final kotlin.jvm.functions.Function3 function3, final kotlin.jvm.functions.Function2 function22, final kotlin.jvm.functions.Function2 function23, final kotlin.jvm.functions.Function3 function32, final androidx.compose.material.ScaffoldState scaffoldState, androidx.compose.ui.Modifier modifier, androidx.compose.runtime.Composer composer, int i2) {
        int i3;
        if ((i2 & 6) == 0) {
            i3 = i2 | (composer.changed(modifier) ? 4 : 2);
        } else {
            i3 = i2;
        }
        if (!composer.shouldExecute((i3 & 19) != 18, i3 & 1)) {
            composer.skipToGroupEnd();
        } else {
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventStart(-1236753028, i3, -1, "androidx.compose.material.Scaffold.<anonymous> (Scaffold.kt:200)");
            }
            boolean changed = composer.changed(mutableWindowInsets);
            boolean changed2 = composer.changed(windowInsets);
            java.lang.Object rememberedValue = composer.rememberedValue();
            if ((changed | changed2) || rememberedValue == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                rememberedValue = new kotlin.jvm.functions.Function1() { // from class: androidx.compose.material.ScaffoldKt$$ExternalSyntheticLambda9
                    @Override // kotlin.jvm.functions.Function1
                    public final java.lang.Object invoke(java.lang.Object obj) {
                        kotlin.Unit highResolutionOutputSizeshNQ4ISI;
                        highResolutionOutputSizeshNQ4ISI = androidx.compose.material.ScaffoldKt.getHighResolutionOutputSizeshNQ4ISI(androidx.compose.material.MutableWindowInsets.this, windowInsets, (androidx.compose.foundation.layout.WindowInsets) obj);
                        return highResolutionOutputSizeshNQ4ISI;
                    }
                };
                composer.updateRememberedValue(rememberedValue);
            }
            androidx.compose.material.SurfaceKt.m2766SurfaceFjzlyU(androidx.compose.foundation.layout.WindowInsetsPaddingKt.onConsumedWindowInsetsChanged(modifier, (kotlin.jvm.functions.Function1) rememberedValue), null, j, j2, null, 0.0f, androidx.compose.runtime.internal.ComposableLambdaKt.rememberComposableLambda(-1761194824, true, new kotlin.jvm.functions.Function2() { // from class: androidx.compose.material.ScaffoldKt$$ExternalSyntheticLambda10
                @Override // kotlin.jvm.functions.Function2
                public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                    kotlin.Unit Camera2StreamConfigurationMap2;
                    Camera2StreamConfigurationMap2 = androidx.compose.material.ScaffoldKt.Camera2StreamConfigurationMap(z, i, function2, function3, function22, mutableWindowInsets, function23, function32, scaffoldState, (androidx.compose.runtime.Composer) obj, ((java.lang.Integer) obj2).intValue());
                    return Camera2StreamConfigurationMap2;
                }
            }, composer, 54), composer, 1572864, 50);
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventEnd();
            }
        }
        return kotlin.Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final kotlin.Unit getHighResolutionOutputSizeshNQ4ISI(androidx.compose.material.MutableWindowInsets mutableWindowInsets, androidx.compose.foundation.layout.WindowInsets windowInsets, androidx.compose.foundation.layout.WindowInsets windowInsets2) {
        mutableWindowInsets.setInsets(androidx.compose.foundation.layout.WindowInsetsKt.exclude(windowInsets, windowInsets2));
        return kotlin.Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final kotlin.Unit Camera2StreamConfigurationMap(boolean z, int i, kotlin.jvm.functions.Function2 function2, kotlin.jvm.functions.Function3 function3, kotlin.jvm.functions.Function2 function22, androidx.compose.material.MutableWindowInsets mutableWindowInsets, kotlin.jvm.functions.Function2 function23, final kotlin.jvm.functions.Function3 function32, final androidx.compose.material.ScaffoldState scaffoldState, androidx.compose.runtime.Composer composer, int i2) {
        if (!composer.shouldExecute((i2 & 3) != 2, i2 & 1)) {
            composer.skipToGroupEnd();
        } else {
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventStart(-1761194824, i2, -1, "androidx.compose.material.Scaffold.<anonymous>.<anonymous> (Scaffold.kt:210)");
            }
            getHighResolutionOutputSizeshNQ4ISI(z, i, function2, function3, androidx.compose.runtime.internal.ComposableLambdaKt.rememberComposableLambda(545329543, true, new kotlin.jvm.functions.Function2() { // from class: androidx.compose.material.ScaffoldKt$$ExternalSyntheticLambda11
                @Override // kotlin.jvm.functions.Function2
                public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                    kotlin.Unit highSpeedVideoFpsRangesFor;
                    highSpeedVideoFpsRangesFor = androidx.compose.material.ScaffoldKt.getHighSpeedVideoFpsRangesFor(kotlin.jvm.functions.Function3.this, scaffoldState, (androidx.compose.runtime.Composer) obj, ((java.lang.Integer) obj2).intValue());
                    return highSpeedVideoFpsRangesFor;
                }
            }, composer, 54), function22, mutableWindowInsets, function23, composer, 24576);
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventEnd();
            }
        }
        return kotlin.Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final kotlin.Unit getHighSpeedVideoFpsRangesFor(kotlin.jvm.functions.Function3 function3, androidx.compose.material.ScaffoldState scaffoldState, androidx.compose.runtime.Composer composer, int i) {
        if (composer.shouldExecute((i & 3) != 2, i & 1)) {
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventStart(545329543, i, -1, "androidx.compose.material.Scaffold.<anonymous>.<anonymous>.<anonymous> (Scaffold.kt:216)");
            }
            function3.invoke(scaffoldState.getSnackbarHostState(), composer, 0);
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventEnd();
            }
        } else {
            composer.skipToGroupEnd();
        }
        return kotlin.Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final kotlin.Unit getHighSpeedVideoSizes(kotlin.jvm.functions.Function3 function3, androidx.compose.runtime.Composer composer, int i) {
        if (composer.shouldExecute((i & 3) != 2, i & 1)) {
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventStart(-1888468172, i, -1, "androidx.compose.material.Scaffold.<anonymous> (Scaffold.kt:234)");
            }
            function3.invoke(androidx.compose.ui.Modifier.INSTANCE, composer, 54);
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventEnd();
            }
        } else {
            composer.skipToGroupEnd();
        }
        return kotlin.Unit.INSTANCE;
    }

    /* JADX WARN: Code restructure failed: missing block: B:63:0x01a3, code lost:
    
        if (r0.changed(r72) == false) goto L147;
     */
    /* JADX WARN: Code restructure failed: missing block: B:71:0x01bd, code lost:
    
        if (r0.changed(r74) == false) goto L158;
     */
    /* JADX WARN: Removed duplicated region for block: B:104:0x0235  */
    /* JADX WARN: Removed duplicated region for block: B:139:0x048e  */
    /* JADX WARN: Removed duplicated region for block: B:142:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:18:0x006d  */
    /* JADX WARN: Removed duplicated region for block: B:203:0x0463  */
    /* JADX WARN: Removed duplicated region for block: B:206:0x01fe  */
    /* JADX WARN: Removed duplicated region for block: B:208:0x01e4  */
    /* JADX WARN: Removed duplicated region for block: B:210:0x01c7  */
    /* JADX WARN: Removed duplicated region for block: B:212:0x01ad  */
    /* JADX WARN: Removed duplicated region for block: B:215:0x0193  */
    /* JADX WARN: Removed duplicated region for block: B:216:0x0166  */
    /* JADX WARN: Removed duplicated region for block: B:225:0x0159  */
    /* JADX WARN: Removed duplicated region for block: B:226:0x012c  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x008e  */
    /* JADX WARN: Removed duplicated region for block: B:233:0x010e  */
    /* JADX WARN: Removed duplicated region for block: B:240:0x00f0  */
    /* JADX WARN: Removed duplicated region for block: B:247:0x00d2  */
    /* JADX WARN: Removed duplicated region for block: B:254:0x00b4  */
    /* JADX WARN: Removed duplicated region for block: B:261:0x0091  */
    /* JADX WARN: Removed duplicated region for block: B:268:0x0070  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x00af  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x00cd  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x00eb  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0109  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0127  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0143  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0161  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x017d  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x0199  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x01b3  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x01d0  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x01ea  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x0206  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x021f  */
    /* renamed from: Scaffold-27mzLpw, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void m2719Scaffold27mzLpw(androidx.compose.ui.Modifier modifier, androidx.compose.material.ScaffoldState scaffoldState, kotlin.jvm.functions.Function2<? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.Unit> function2, kotlin.jvm.functions.Function2<? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.Unit> function22, kotlin.jvm.functions.Function3<? super androidx.compose.material.SnackbarHostState, ? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.Unit> function3, kotlin.jvm.functions.Function2<? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.Unit> function23, int i, boolean z, kotlin.jvm.functions.Function3<? super androidx.compose.foundation.layout.ColumnScope, ? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.Unit> function32, boolean z2, androidx.compose.ui.graphics.Shape shape, float f, long j, long j2, long j3, long j4, long j5, final kotlin.jvm.functions.Function3<? super androidx.compose.foundation.layout.PaddingValues, ? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.Unit> function33, androidx.compose.runtime.Composer composer, final int i2, final int i3, final int i4) {
        int i5;
        kotlin.jvm.functions.Function2<? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.Unit> function24;
        int i6;
        int i7;
        int i8;
        int i9;
        int i10;
        int i11;
        boolean z3;
        int i12;
        int i13;
        int i14;
        int i15;
        androidx.compose.runtime.Composer composer2;
        final androidx.compose.ui.Modifier modifier2;
        final androidx.compose.material.ScaffoldState scaffoldState2;
        final kotlin.jvm.functions.Function2<? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.Unit> function25;
        final kotlin.jvm.functions.Function3<? super androidx.compose.material.SnackbarHostState, ? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.Unit> function34;
        final kotlin.jvm.functions.Function2<? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.Unit> function26;
        final int i16;
        final kotlin.jvm.functions.Function3<? super androidx.compose.foundation.layout.ColumnScope, ? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.Unit> function35;
        final boolean z4;
        final long j6;
        long j7;
        final long j8;
        final long j9;
        final long j10;
        final boolean z5;
        final kotlin.jvm.functions.Function2<? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.Unit> function27;
        final androidx.compose.ui.graphics.Shape shape2;
        final float f2;
        androidx.compose.runtime.ScopeUpdateScope endRestartGroup;
        androidx.compose.ui.Modifier modifier3;
        androidx.compose.material.ScaffoldState scaffoldState3;
        kotlin.jvm.functions.Function2<? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.Unit> lambda$566090785$material;
        kotlin.jvm.functions.Function2<? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.Unit> m2591getLambda$1624772335$material;
        kotlin.jvm.functions.Function3<? super androidx.compose.material.SnackbarHostState, ? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.Unit> lambda$939725476$material;
        kotlin.jvm.functions.Function2<? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.Unit> m2589getLambda$1341284559$material;
        int m2634getEnd5ygKITE;
        boolean z6;
        androidx.compose.foundation.shape.CornerBasedShape cornerBasedShape;
        androidx.compose.material.ScaffoldState scaffoldState4;
        int i17;
        kotlin.jvm.functions.Function3<? super androidx.compose.foundation.layout.ColumnScope, ? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.Unit> function36;
        long j11;
        long j12;
        long j13;
        int i18;
        long j14;
        long j15;
        long j16;
        long j17;
        kotlin.jvm.functions.Function3<? super androidx.compose.foundation.layout.ColumnScope, ? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.Unit> function37;
        long j18;
        long j19;
        int i19;
        int i20;
        long j20;
        long j21;
        long j22;
        androidx.compose.ui.graphics.Shape shape3;
        float f3;
        boolean z7;
        int i21;
        int i22;
        int i23;
        androidx.compose.runtime.Composer startRestartGroup = composer.startRestartGroup(1135600301);
        int i24 = i4 & 1;
        if (i24 != 0) {
            i5 = i2 | 6;
        } else if ((i2 & 6) == 0) {
            i5 = (startRestartGroup.changed(modifier) ? 4 : 2) | i2;
        } else {
            i5 = i2;
        }
        if ((i2 & 48) == 0) {
            if ((i4 & 2) == 0 && startRestartGroup.changed(scaffoldState)) {
                i23 = 32;
                i5 |= i23;
            }
            i23 = 16;
            i5 |= i23;
        }
        int i25 = i4 & 4;
        if (i25 != 0) {
            i5 |= 384;
        } else if ((i2 & 384) == 0) {
            function24 = function2;
            i5 |= startRestartGroup.changedInstance(function24) ? 256 : 128;
            i6 = i4 & 8;
            int i26 = 2048;
            if (i6 == 0) {
                i5 |= 3072;
            } else if ((i2 & 3072) == 0) {
                i5 |= startRestartGroup.changedInstance(function22) ? 2048 : 1024;
                i7 = i4 & 16;
                int i27 = 16384;
                if (i7 != 0) {
                    i5 |= 24576;
                } else if ((i2 & 24576) == 0) {
                    i5 |= startRestartGroup.changedInstance(function3) ? 16384 : 8192;
                    i8 = i4 & 32;
                    if (i8 == 0) {
                        i5 |= androidx.profileinstaller.ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE;
                    } else if ((i2 & androidx.profileinstaller.ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE) == 0) {
                        i5 |= startRestartGroup.changedInstance(function23) ? 131072 : 65536;
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
                        z3 = z;
                    } else {
                        z3 = z;
                        if ((i2 & 12582912) == 0) {
                            i5 |= startRestartGroup.changed(z3) ? 8388608 : 4194304;
                        }
                    }
                    i12 = i4 & 256;
                    if (i12 == 0) {
                        i5 |= 100663296;
                    } else if ((i2 & 100663296) == 0) {
                        i5 |= startRestartGroup.changedInstance(function32) ? 67108864 : 33554432;
                    }
                    i13 = i4 & 512;
                    if (i13 == 0) {
                        i5 |= 805306368;
                    } else if ((i2 & 805306368) == 0) {
                        i5 |= startRestartGroup.changed(z2) ? 536870912 : 268435456;
                    }
                    if ((i3 & 6) != 0) {
                        if ((i4 & 1024) == 0 && startRestartGroup.changed(shape)) {
                            i22 = 4;
                            i14 = i3 | i22;
                        }
                        i22 = 2;
                        i14 = i3 | i22;
                    } else {
                        i14 = i3;
                    }
                    i15 = i4 & 2048;
                    if (i15 == 0) {
                        i14 |= 48;
                    } else if ((i3 & 48) == 0) {
                        i14 |= startRestartGroup.changed(f) ? 32 : 16;
                    }
                    if ((i3 & 384) == 0) {
                        if ((i4 & 4096) == 0 && startRestartGroup.changed(j)) {
                            i21 = 256;
                            i14 |= i21;
                        }
                        i21 = 128;
                        i14 |= i21;
                    }
                    if ((i3 & 3072) == 0) {
                        if ((i4 & 8192) != 0) {
                        }
                        i26 = 1024;
                        i14 |= i26;
                    }
                    if ((i3 & 24576) == 0) {
                        if ((i4 & 16384) != 0) {
                        }
                        i27 = 8192;
                        i14 |= i27;
                    }
                    if ((i3 & androidx.profileinstaller.ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE) == 0) {
                        i14 |= ((i4 & 32768) == 0 && startRestartGroup.changed(j4)) ? 131072 : 65536;
                    }
                    if ((i3 & 1572864) == 0) {
                        i14 |= ((i4 & 65536) == 0 && startRestartGroup.changed(j5)) ? 1048576 : 524288;
                    }
                    if ((i3 & 12582912) == 0) {
                        i14 |= startRestartGroup.changedInstance(function33) ? 8388608 : 4194304;
                    }
                    if (!startRestartGroup.shouldExecute((i5 & 306783379) == 306783378 || (i14 & 4793491) != 4793490, i5 & 1)) {
                        startRestartGroup.startDefaults();
                        if ((i2 & 1) != 0 && !startRestartGroup.getDefaultsInvalid()) {
                            startRestartGroup.skipToGroupEnd();
                            if ((i4 & 2) != 0) {
                                i5 &= -113;
                            }
                            if ((i4 & 1024) != 0) {
                                i14 &= -15;
                            }
                            int i28 = i14;
                            if ((i4 & 4096) != 0) {
                                i28 &= -897;
                            }
                            if ((i4 & 8192) != 0) {
                                i28 &= -7169;
                            }
                            if ((i4 & 16384) != 0) {
                                i28 &= -57345;
                            }
                            if ((i4 & 32768) != 0) {
                                i28 &= -458753;
                            }
                            if ((i4 & 65536) != 0) {
                                i28 &= -3670017;
                            }
                            scaffoldState2 = scaffoldState;
                            m2591getLambda$1624772335$material = function22;
                            m2589getLambda$1341284559$material = function23;
                            function37 = function32;
                            z7 = z2;
                            j21 = j;
                            j20 = j2;
                            j18 = j3;
                            j19 = j4;
                            j22 = j5;
                            i20 = i28;
                            i19 = i5;
                            z6 = z3;
                            lambda$566090785$material = function24;
                            modifier2 = modifier;
                            shape3 = shape;
                            f3 = f;
                            m2634getEnd5ygKITE = i10;
                            lambda$939725476$material = function3;
                        } else {
                            androidx.compose.ui.Modifier.Companion companion = i24 != 0 ? androidx.compose.ui.Modifier.INSTANCE : modifier;
                            if ((i4 & 2) != 0) {
                                modifier3 = companion;
                                scaffoldState3 = rememberScaffoldState(null, null, startRestartGroup, 0, 3);
                                i5 &= -113;
                            } else {
                                modifier3 = companion;
                                scaffoldState3 = scaffoldState;
                            }
                            lambda$566090785$material = i25 != 0 ? androidx.compose.material.ComposableSingletons$ScaffoldKt.INSTANCE.getLambda$566090785$material() : function24;
                            m2591getLambda$1624772335$material = i6 != 0 ? androidx.compose.material.ComposableSingletons$ScaffoldKt.INSTANCE.m2591getLambda$1624772335$material() : function22;
                            lambda$939725476$material = i7 != 0 ? androidx.compose.material.ComposableSingletons$ScaffoldKt.INSTANCE.getLambda$939725476$material() : function3;
                            m2589getLambda$1341284559$material = i8 != 0 ? androidx.compose.material.ComposableSingletons$ScaffoldKt.INSTANCE.m2589getLambda$1341284559$material() : function23;
                            m2634getEnd5ygKITE = i9 != 0 ? androidx.compose.material.FabPosition.INSTANCE.m2634getEnd5ygKITE() : i;
                            z6 = i11 != 0 ? false : z3;
                            kotlin.jvm.functions.Function3<? super androidx.compose.foundation.layout.ColumnScope, ? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.Unit> function38 = i12 != 0 ? null : function32;
                            boolean z8 = i13 == 0 ? z2 : true;
                            if ((i4 & 1024) != 0) {
                                cornerBasedShape = androidx.compose.material.MaterialTheme.INSTANCE.getShapes(startRestartGroup, 6).getLarge();
                                i14 &= -15;
                            } else {
                                cornerBasedShape = shape;
                            }
                            int i29 = i14;
                            float m2603getElevationD9Ej5fM = i15 != 0 ? androidx.compose.material.DrawerDefaults.INSTANCE.m2603getElevationD9Ej5fM() : f;
                            if ((i4 & 4096) != 0) {
                                scaffoldState4 = scaffoldState3;
                                i17 = i29 & (-897);
                                function36 = function38;
                                j11 = androidx.compose.material.MaterialTheme.INSTANCE.getColors(startRestartGroup, 6).m2566getSurface0d7_KjU();
                            } else {
                                scaffoldState4 = scaffoldState3;
                                i17 = i29;
                                function36 = function38;
                                j11 = j;
                            }
                            androidx.compose.ui.graphics.Shape shape4 = cornerBasedShape;
                            if ((i4 & 8192) != 0) {
                                j12 = androidx.compose.material.ColorsKt.m2580contentColorForek8zF_U(j11, startRestartGroup, (i17 >> 6) & 14);
                                i17 &= -7169;
                            } else {
                                j12 = j2;
                            }
                            if ((i4 & 16384) != 0) {
                                j13 = j11;
                                i18 = 6;
                                j14 = androidx.compose.material.DrawerDefaults.INSTANCE.getScrimColor(startRestartGroup, 6);
                                i17 &= -57345;
                            } else {
                                j13 = j11;
                                i18 = 6;
                                j14 = j3;
                            }
                            if ((i4 & 32768) != 0) {
                                j15 = j14;
                                j16 = androidx.compose.material.MaterialTheme.INSTANCE.getColors(startRestartGroup, i18).m2555getBackground0d7_KjU();
                                i17 &= -458753;
                            } else {
                                j15 = j14;
                                j16 = j4;
                            }
                            if ((i4 & 65536) != 0) {
                                j17 = androidx.compose.material.ColorsKt.m2580contentColorForek8zF_U(j16, startRestartGroup, (i17 >> 15) & 14);
                                i17 = (-3670017) & i17;
                            } else {
                                j17 = j5;
                            }
                            function37 = function36;
                            j18 = j15;
                            j19 = j16;
                            i19 = i5;
                            i20 = i17;
                            j20 = j12;
                            j21 = j13;
                            j22 = j17;
                            modifier2 = modifier3;
                            shape3 = shape4;
                            scaffoldState2 = scaffoldState4;
                            f3 = m2603getElevationD9Ej5fM;
                            z7 = z8;
                        }
                        startRestartGroup.endDefaults();
                        if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                            composer2 = startRestartGroup;
                            androidx.compose.runtime.ComposerKt.traceEventStart(1135600301, i19, i20, "androidx.compose.material.Scaffold (Scaffold.kt:321)");
                        } else {
                            composer2 = startRestartGroup;
                        }
                        int i30 = i20 << 3;
                        m2720Scaffoldu4IkXBM(androidx.compose.foundation.layout.WindowInsetsKt.m1751WindowInsetsa9UjIt4$default(androidx.compose.ui.unit.Dp.m8601constructorimpl(0.0f), 0.0f, 0.0f, 0.0f, 14, null), modifier2, scaffoldState2, lambda$566090785$material, m2591getLambda$1624772335$material, lambda$939725476$material, m2589getLambda$1341284559$material, m2634getEnd5ygKITE, z6, function37, z7, shape3, f3, j21, j20, j18, j19, j22, function33, composer2, (i19 << 3) & 2147483632, ((i19 >> 27) & 14) | (i30 & 112) | (i30 & 896) | (i30 & 7168) | (57344 & i30) | (458752 & i30) | (3670016 & i30) | (29360128 & i30) | (i30 & 234881024), 0);
                        if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                            androidx.compose.runtime.ComposerKt.traceEventEnd();
                        }
                        j6 = j21;
                        j7 = j20;
                        j8 = j18;
                        j9 = j19;
                        j10 = j22;
                        kotlin.jvm.functions.Function2<? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.Unit> function28 = m2589getLambda$1341284559$material;
                        function35 = function37;
                        function27 = lambda$566090785$material;
                        function26 = function28;
                        boolean z9 = z6;
                        z4 = z7;
                        function25 = m2591getLambda$1624772335$material;
                        i16 = m2634getEnd5ygKITE;
                        f2 = f3;
                        shape2 = shape3;
                        function34 = lambda$939725476$material;
                        z5 = z9;
                    } else {
                        composer2 = startRestartGroup;
                        composer2.skipToGroupEnd();
                        modifier2 = modifier;
                        scaffoldState2 = scaffoldState;
                        function25 = function22;
                        function34 = function3;
                        function26 = function23;
                        i16 = i;
                        function35 = function32;
                        z4 = z2;
                        j6 = j;
                        j7 = j2;
                        j8 = j3;
                        j9 = j4;
                        j10 = j5;
                        z5 = z3;
                        function27 = function24;
                        shape2 = shape;
                        f2 = f;
                    }
                    endRestartGroup = composer2.endRestartGroup();
                    if (endRestartGroup == null) {
                        final long j23 = j7;
                        endRestartGroup.updateScope(new kotlin.jvm.functions.Function2() { // from class: androidx.compose.material.ScaffoldKt$$ExternalSyntheticLambda12
                            @Override // kotlin.jvm.functions.Function2
                            public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                                kotlin.Unit highSpeedVideoFpsRanges;
                                ((java.lang.Integer) obj2).intValue();
                                highSpeedVideoFpsRanges = androidx.compose.material.ScaffoldKt.getHighSpeedVideoFpsRanges(androidx.compose.ui.Modifier.this, scaffoldState2, function27, function25, function34, function26, i16, z5, function35, z4, shape2, f2, j6, j23, j8, j9, j10, function33, i2, i3, i4, (androidx.compose.runtime.Composer) obj);
                                return highSpeedVideoFpsRanges;
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
                i12 = i4 & 256;
                if (i12 == 0) {
                }
                i13 = i4 & 512;
                if (i13 == 0) {
                }
                if ((i3 & 6) != 0) {
                }
                i15 = i4 & 2048;
                if (i15 == 0) {
                }
                if ((i3 & 384) == 0) {
                }
                if ((i3 & 3072) == 0) {
                }
                if ((i3 & 24576) == 0) {
                }
                if ((i3 & androidx.profileinstaller.ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE) == 0) {
                }
                if ((i3 & 1572864) == 0) {
                }
                if ((i3 & 12582912) == 0) {
                }
                if (!startRestartGroup.shouldExecute((i5 & 306783379) == 306783378 || (i14 & 4793491) != 4793490, i5 & 1)) {
                }
                endRestartGroup = composer2.endRestartGroup();
                if (endRestartGroup == null) {
                }
            }
            i7 = i4 & 16;
            int i272 = 16384;
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
            i12 = i4 & 256;
            if (i12 == 0) {
            }
            i13 = i4 & 512;
            if (i13 == 0) {
            }
            if ((i3 & 6) != 0) {
            }
            i15 = i4 & 2048;
            if (i15 == 0) {
            }
            if ((i3 & 384) == 0) {
            }
            if ((i3 & 3072) == 0) {
            }
            if ((i3 & 24576) == 0) {
            }
            if ((i3 & androidx.profileinstaller.ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE) == 0) {
            }
            if ((i3 & 1572864) == 0) {
            }
            if ((i3 & 12582912) == 0) {
            }
            if (!startRestartGroup.shouldExecute((i5 & 306783379) == 306783378 || (i14 & 4793491) != 4793490, i5 & 1)) {
            }
            endRestartGroup = composer2.endRestartGroup();
            if (endRestartGroup == null) {
            }
        }
        function24 = function2;
        i6 = i4 & 8;
        int i262 = 2048;
        if (i6 == 0) {
        }
        i7 = i4 & 16;
        int i2722 = 16384;
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
        i12 = i4 & 256;
        if (i12 == 0) {
        }
        i13 = i4 & 512;
        if (i13 == 0) {
        }
        if ((i3 & 6) != 0) {
        }
        i15 = i4 & 2048;
        if (i15 == 0) {
        }
        if ((i3 & 384) == 0) {
        }
        if ((i3 & 3072) == 0) {
        }
        if ((i3 & 24576) == 0) {
        }
        if ((i3 & androidx.profileinstaller.ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE) == 0) {
        }
        if ((i3 & 1572864) == 0) {
        }
        if ((i3 & 12582912) == 0) {
        }
        if (!startRestartGroup.shouldExecute((i5 & 306783379) == 306783378 || (i14 & 4793491) != 4793490, i5 & 1)) {
        }
        endRestartGroup = composer2.endRestartGroup();
        if (endRestartGroup == null) {
        }
    }

    private static final void getHighResolutionOutputSizeshNQ4ISI(final boolean z, final int i, final kotlin.jvm.functions.Function2<? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.Unit> function2, final kotlin.jvm.functions.Function3<? super androidx.compose.foundation.layout.PaddingValues, ? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.Unit> function3, final kotlin.jvm.functions.Function2<? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.Unit> function22, final kotlin.jvm.functions.Function2<? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.Unit> function23, final androidx.compose.foundation.layout.WindowInsets windowInsets, final kotlin.jvm.functions.Function2<? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.Unit> function24, androidx.compose.runtime.Composer composer, final int i2) {
        int i3;
        int i4;
        androidx.compose.runtime.Composer startRestartGroup = composer.startRestartGroup(675142332);
        if ((i2 & 6) == 0) {
            i3 = (startRestartGroup.changed(z) ? 4 : 2) | i2;
        } else {
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            i3 |= startRestartGroup.changed(i) ? 32 : 16;
        }
        if ((i2 & 384) == 0) {
            i3 |= startRestartGroup.changedInstance(function2) ? 256 : 128;
        }
        if ((i2 & 3072) == 0) {
            i3 |= startRestartGroup.changedInstance(function3) ? 2048 : 1024;
        }
        if ((i2 & 24576) == 0) {
            i3 |= startRestartGroup.changedInstance(function22) ? 16384 : 8192;
        }
        if ((196608 & i2) == 0) {
            i3 |= startRestartGroup.changedInstance(function23) ? 131072 : 65536;
        }
        if ((i2 & 1572864) == 0) {
            i3 |= startRestartGroup.changed(windowInsets) ? 1048576 : 524288;
        }
        if ((i2 & 12582912) == 0) {
            i3 |= startRestartGroup.changedInstance(function24) ? 8388608 : 4194304;
        }
        if (!startRestartGroup.shouldExecute((i3 & 4793491) != 4793490, i3 & 1)) {
            startRestartGroup.skipToGroupEnd();
        } else {
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventStart(675142332, i3, -1, "androidx.compose.material.ScaffoldLayout (Scaffold.kt:377)");
            }
            java.lang.Object rememberedValue = startRestartGroup.rememberedValue();
            if (rememberedValue == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                rememberedValue = new androidx.compose.material.ScaffoldKt$ScaffoldLayout$contentPadding$1$1();
                startRestartGroup.updateRememberedValue(rememberedValue);
            }
            final androidx.compose.material.ScaffoldKt$ScaffoldLayout$contentPadding$1$1 scaffoldKt$ScaffoldLayout$contentPadding$1$1 = (androidx.compose.material.ScaffoldKt$ScaffoldLayout$contentPadding$1$1) rememberedValue;
            boolean z2 = (i3 & 896) == 256;
            boolean z3 = (57344 & i3) == 16384;
            boolean z4 = (3670016 & i3) == 1048576;
            boolean z5 = (458752 & i3) == 131072;
            boolean z6 = (i3 & 112) == 32;
            boolean z7 = (i3 & 14) == 4;
            boolean z8 = (29360128 & i3) == 8388608;
            boolean z9 = (i3 & 7168) == 2048;
            java.lang.Object rememberedValue2 = startRestartGroup.rememberedValue();
            if (((z5 | z4 | z2 | z3 | z6 | z7 | z8) || z9) || rememberedValue2 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                i4 = 0;
                kotlin.jvm.functions.Function2 function25 = new kotlin.jvm.functions.Function2() { // from class: androidx.compose.material.ScaffoldKt$$ExternalSyntheticLambda7
                    @Override // kotlin.jvm.functions.Function2
                    public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                        androidx.compose.ui.layout.MeasureResult highResolutionOutputSizeshNQ4ISI;
                        highResolutionOutputSizeshNQ4ISI = androidx.compose.material.ScaffoldKt.getHighResolutionOutputSizeshNQ4ISI(kotlin.jvm.functions.Function2.this, function22, function23, i, z, windowInsets, scaffoldKt$ScaffoldLayout$contentPadding$1$1, function24, function3, (androidx.compose.ui.layout.SubcomposeMeasureScope) obj, (androidx.compose.ui.unit.Constraints) obj2);
                        return highResolutionOutputSizeshNQ4ISI;
                    }
                };
                startRestartGroup.updateRememberedValue(function25);
                rememberedValue2 = function25;
            } else {
                i4 = 0;
            }
            androidx.compose.ui.layout.SubcomposeLayoutKt.SubcomposeLayout(null, (kotlin.jvm.functions.Function2) rememberedValue2, startRestartGroup, i4, 1);
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventEnd();
            }
        }
        androidx.compose.runtime.ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new kotlin.jvm.functions.Function2() { // from class: androidx.compose.material.ScaffoldKt$$ExternalSyntheticLambda8
                @Override // kotlin.jvm.functions.Function2
                public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                    kotlin.Unit highSpeedVideoFpsRanges;
                    ((java.lang.Integer) obj2).intValue();
                    highSpeedVideoFpsRanges = androidx.compose.material.ScaffoldKt.getHighSpeedVideoFpsRanges(z, i, function2, function3, function22, function23, windowInsets, function24, i2, (androidx.compose.runtime.Composer) obj);
                    return highSpeedVideoFpsRanges;
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0298 A[LOOP:3: B:48:0x0296->B:49:0x0298, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:53:0x02b4  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x02e4  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x02f3  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x0330  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x0355  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x03b7 A[LOOP:4: B:73:0x03b5->B:74:0x03b7, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:80:0x035a  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x0347  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x032c  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x02ef  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x02b6  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final androidx.compose.ui.layout.MeasureResult getHighResolutionOutputSizeshNQ4ISI(kotlin.jvm.functions.Function2 function2, kotlin.jvm.functions.Function2 function22, kotlin.jvm.functions.Function2 function23, int i, boolean z, androidx.compose.foundation.layout.WindowInsets windowInsets, final androidx.compose.material.ScaffoldKt$ScaffoldLayout$contentPadding$1$1 scaffoldKt$ScaffoldLayout$contentPadding$1$1, final kotlin.jvm.functions.Function2 function24, final kotlin.jvm.functions.Function3 function3, androidx.compose.ui.layout.SubcomposeMeasureScope subcomposeMeasureScope, androidx.compose.ui.unit.Constraints constraints) {
        java.lang.Object obj;
        java.lang.Object obj2;
        final androidx.compose.material.FabPlacement fabPlacement;
        int size;
        int i2;
        final java.util.ArrayList arrayList;
        java.lang.Object obj3;
        final java.lang.Integer num;
        int i3;
        androidx.compose.foundation.layout.PaddingValues asPaddingValues;
        float m8601constructorimpl;
        float bottom;
        int size2;
        int i4;
        int intValue;
        int intValue2;
        int i5;
        java.lang.Object obj4;
        java.lang.Object obj5;
        int i6;
        int m8554getMaxWidthimpl = androidx.compose.ui.unit.Constraints.m8554getMaxWidthimpl(constraints.getGetHighSpeedVideoFpsRangesFor());
        int m8553getMaxHeightimpl = androidx.compose.ui.unit.Constraints.m8553getMaxHeightimpl(constraints.getGetHighSpeedVideoFpsRangesFor());
        long m8545copyZbe2FdA$default = androidx.compose.ui.unit.Constraints.m8545copyZbe2FdA$default(constraints.getGetHighSpeedVideoFpsRangesFor(), 0, 0, 0, 0, 10, null);
        java.util.List<androidx.compose.ui.layout.Measurable> subcompose = subcomposeMeasureScope.subcompose(androidx.compose.material.ScaffoldLayoutContent.getHighSpeedVideoSizes, function2);
        java.util.ArrayList arrayList2 = new java.util.ArrayList(subcompose.size());
        int size3 = subcompose.size();
        for (int i7 = 0; i7 < size3; i7++) {
            arrayList2.add(subcompose.get(i7).mo7353measureBRTryo0(m8545copyZbe2FdA$default));
        }
        java.util.ArrayList arrayList3 = arrayList2;
        if (arrayList3.isEmpty()) {
            obj = null;
        } else {
            obj = arrayList3.get(0);
            int height = ((androidx.compose.ui.layout.Placeable) obj).getHeight();
            int lastIndex = kotlin.collections.CollectionsKt.getLastIndex(arrayList3);
            if (lastIndex > 0) {
                int i8 = 1;
                while (true) {
                    java.lang.Object obj6 = arrayList3.get(i8);
                    int height2 = ((androidx.compose.ui.layout.Placeable) obj6).getHeight();
                    if (height < height2) {
                        height = height2;
                        obj = obj6;
                    }
                    if (i8 == lastIndex) {
                        break;
                    }
                    i8++;
                }
            }
        }
        androidx.compose.ui.layout.Placeable placeable = (androidx.compose.ui.layout.Placeable) obj;
        int height3 = placeable != null ? placeable.getHeight() : 0;
        java.util.List<androidx.compose.ui.layout.Measurable> subcompose2 = subcomposeMeasureScope.subcompose(androidx.compose.material.ScaffoldLayoutContent.getHighResolutionOutputSizeshNQ4ISI, function22);
        java.util.ArrayList arrayList4 = new java.util.ArrayList(subcompose2.size());
        int size4 = subcompose2.size();
        int i9 = 0;
        while (i9 < size4) {
            int i10 = size4;
            androidx.compose.ui.layout.SubcomposeMeasureScope subcomposeMeasureScope2 = subcomposeMeasureScope;
            arrayList4.add(subcompose2.get(i9).mo7353measureBRTryo0(androidx.compose.ui.unit.ConstraintsKt.m8573offsetNN6EwU(m8545copyZbe2FdA$default, (-windowInsets.getLeft(subcomposeMeasureScope2, subcomposeMeasureScope.getLayoutDirection())) - windowInsets.getRight(subcomposeMeasureScope2, subcomposeMeasureScope.getLayoutDirection()), -windowInsets.getBottom(subcomposeMeasureScope2))));
            i9++;
            subcompose2 = subcompose2;
            size4 = i10;
            height3 = height3;
            m8553getMaxHeightimpl = m8553getMaxHeightimpl;
        }
        final int i11 = m8553getMaxHeightimpl;
        final int i12 = height3;
        java.util.ArrayList arrayList5 = arrayList4;
        if (arrayList5.isEmpty()) {
            obj2 = null;
        } else {
            obj2 = arrayList5.get(0);
            int height4 = ((androidx.compose.ui.layout.Placeable) obj2).getHeight();
            int lastIndex2 = kotlin.collections.CollectionsKt.getLastIndex(arrayList5);
            if (lastIndex2 > 0) {
                java.lang.Object obj7 = obj2;
                int i13 = height4;
                int i14 = 1;
                while (true) {
                    java.lang.Object obj8 = arrayList5.get(i14);
                    int height5 = ((androidx.compose.ui.layout.Placeable) obj8).getHeight();
                    if (i13 < height5) {
                        obj7 = obj8;
                        i13 = height5;
                    }
                    if (i14 == lastIndex2) {
                        break;
                    }
                    i14++;
                }
                obj2 = obj7;
            }
        }
        androidx.compose.ui.layout.Placeable placeable2 = (androidx.compose.ui.layout.Placeable) obj2;
        int height6 = placeable2 != null ? placeable2.getHeight() : 0;
        java.util.List<androidx.compose.ui.layout.Measurable> subcompose3 = subcomposeMeasureScope.subcompose(androidx.compose.material.ScaffoldLayoutContent.getHighSpeedVideoFpsRangesFor, function23);
        java.util.ArrayList arrayList6 = new java.util.ArrayList(subcompose3.size());
        int size5 = subcompose3.size();
        int i15 = 0;
        while (i15 < size5) {
            int i16 = size5;
            androidx.compose.ui.layout.SubcomposeMeasureScope subcomposeMeasureScope3 = subcomposeMeasureScope;
            arrayList6.add(subcompose3.get(i15).mo7353measureBRTryo0(androidx.compose.ui.unit.ConstraintsKt.m8573offsetNN6EwU(m8545copyZbe2FdA$default, (-windowInsets.getLeft(subcomposeMeasureScope3, subcomposeMeasureScope.getLayoutDirection())) - windowInsets.getRight(subcomposeMeasureScope3, subcomposeMeasureScope.getLayoutDirection()), -windowInsets.getBottom(subcomposeMeasureScope3))));
            i15++;
            subcompose3 = subcompose3;
            size5 = i16;
            arrayList3 = arrayList3;
            arrayList5 = arrayList5;
        }
        final java.util.ArrayList arrayList7 = arrayList3;
        final java.util.ArrayList arrayList8 = arrayList5;
        final java.util.ArrayList arrayList9 = arrayList6;
        if (!arrayList9.isEmpty()) {
            if (arrayList9.isEmpty()) {
                obj4 = null;
            } else {
                obj4 = arrayList9.get(0);
                int width = ((androidx.compose.ui.layout.Placeable) obj4).getWidth();
                int lastIndex3 = kotlin.collections.CollectionsKt.getLastIndex(arrayList9);
                if (lastIndex3 > 0) {
                    java.lang.Object obj9 = obj4;
                    int i17 = width;
                    int i18 = 1;
                    while (true) {
                        java.lang.Object obj10 = arrayList9.get(i18);
                        int width2 = ((androidx.compose.ui.layout.Placeable) obj10).getWidth();
                        if (i17 < width2) {
                            obj9 = obj10;
                            i17 = width2;
                        }
                        if (i18 == lastIndex3) {
                            break;
                        }
                        i18++;
                    }
                    obj4 = obj9;
                }
            }
            androidx.compose.ui.layout.Placeable placeable3 = (androidx.compose.ui.layout.Placeable) obj4;
            int width3 = placeable3 != null ? placeable3.getWidth() : 0;
            if (arrayList9.isEmpty()) {
                obj5 = null;
            } else {
                obj5 = arrayList9.get(0);
                int height7 = ((androidx.compose.ui.layout.Placeable) obj5).getHeight();
                int lastIndex4 = kotlin.collections.CollectionsKt.getLastIndex(arrayList9);
                if (lastIndex4 > 0) {
                    java.lang.Object obj11 = obj5;
                    int i19 = height7;
                    int i20 = 1;
                    while (true) {
                        java.lang.Object obj12 = arrayList9.get(i20);
                        java.lang.Object obj13 = obj11;
                        int height8 = ((androidx.compose.ui.layout.Placeable) obj12).getHeight();
                        if (i19 < height8) {
                            i19 = height8;
                            obj11 = obj12;
                        } else {
                            obj11 = obj13;
                        }
                        if (i20 == lastIndex4) {
                            break;
                        }
                        i20++;
                    }
                    obj5 = obj11;
                }
            }
            androidx.compose.ui.layout.Placeable placeable4 = (androidx.compose.ui.layout.Placeable) obj5;
            int height9 = placeable4 != null ? placeable4.getHeight() : 0;
            if (width3 != 0 && height9 != 0) {
                if (androidx.compose.material.FabPosition.m2629equalsimpl0(i, androidx.compose.material.FabPosition.INSTANCE.m2635getStart5ygKITE())) {
                    if (subcomposeMeasureScope.getLayoutDirection() == androidx.compose.ui.unit.LayoutDirection.Ltr) {
                        i6 = subcomposeMeasureScope.mo1412roundToPx0680j_4(getHighResolutionOutputSizeshNQ4ISI);
                        fabPlacement = new androidx.compose.material.FabPlacement(z, i6, width3, height9);
                    }
                    i6 = (m8554getMaxWidthimpl - subcomposeMeasureScope.mo1412roundToPx0680j_4(getHighResolutionOutputSizeshNQ4ISI)) - width3;
                    fabPlacement = new androidx.compose.material.FabPlacement(z, i6, width3, height9);
                } else {
                    if (androidx.compose.material.FabPosition.m2629equalsimpl0(i, androidx.compose.material.FabPosition.INSTANCE.m2634getEnd5ygKITE())) {
                        if (subcomposeMeasureScope.getLayoutDirection() != androidx.compose.ui.unit.LayoutDirection.Ltr) {
                            i6 = subcomposeMeasureScope.mo1412roundToPx0680j_4(getHighResolutionOutputSizeshNQ4ISI);
                        }
                        i6 = (m8554getMaxWidthimpl - subcomposeMeasureScope.mo1412roundToPx0680j_4(getHighResolutionOutputSizeshNQ4ISI)) - width3;
                    } else {
                        i6 = (m8554getMaxWidthimpl - width3) / 2;
                    }
                    fabPlacement = new androidx.compose.material.FabPlacement(z, i6, width3, height9);
                }
                java.util.List<androidx.compose.ui.layout.Measurable> subcompose4 = subcomposeMeasureScope.subcompose(androidx.compose.material.ScaffoldLayoutContent.getHighSpeedVideoFpsRanges, androidx.compose.runtime.internal.ComposableLambdaKt.composableLambdaInstance(-502652347, true, new kotlin.jvm.functions.Function2() { // from class: androidx.compose.material.ScaffoldKt$$ExternalSyntheticLambda1
                    @Override // kotlin.jvm.functions.Function2
                    public final java.lang.Object invoke(java.lang.Object obj14, java.lang.Object obj15) {
                        kotlin.Unit highSpeedVideoFpsRangesFor;
                        highSpeedVideoFpsRangesFor = androidx.compose.material.ScaffoldKt.getHighSpeedVideoFpsRangesFor(androidx.compose.material.FabPlacement.this, function24, (androidx.compose.runtime.Composer) obj14, ((java.lang.Integer) obj15).intValue());
                        return highSpeedVideoFpsRangesFor;
                    }
                }));
                java.util.ArrayList arrayList10 = new java.util.ArrayList(subcompose4.size());
                size = subcompose4.size();
                for (i2 = 0; i2 < size; i2++) {
                    arrayList10.add(subcompose4.get(i2).mo7353measureBRTryo0(m8545copyZbe2FdA$default));
                }
                arrayList = arrayList10;
                if (arrayList.isEmpty()) {
                    obj3 = arrayList.get(0);
                    int height10 = ((androidx.compose.ui.layout.Placeable) obj3).getHeight();
                    int lastIndex5 = kotlin.collections.CollectionsKt.getLastIndex(arrayList);
                    if (lastIndex5 > 0) {
                        int i21 = 1;
                        while (true) {
                            java.lang.Object obj14 = arrayList.get(i21);
                            int height11 = ((androidx.compose.ui.layout.Placeable) obj14).getHeight();
                            if (height10 < height11) {
                                height10 = height11;
                                obj3 = obj14;
                            }
                            if (i21 == lastIndex5) {
                                break;
                            }
                            i21++;
                        }
                    }
                } else {
                    obj3 = null;
                }
                androidx.compose.ui.layout.Placeable placeable5 = (androidx.compose.ui.layout.Placeable) obj3;
                final java.lang.Integer valueOf = placeable5 == null ? java.lang.Integer.valueOf(placeable5.getHeight()) : null;
                if (fabPlacement == null) {
                    if (valueOf == null) {
                        intValue2 = fabPlacement.getHeight() + subcomposeMeasureScope.mo1412roundToPx0680j_4(getHighResolutionOutputSizeshNQ4ISI);
                        i5 = windowInsets.getBottom(subcomposeMeasureScope);
                    } else if (z) {
                        intValue2 = valueOf.intValue();
                        i5 = fabPlacement.getHeight() / 2;
                    } else {
                        intValue2 = valueOf.intValue() + fabPlacement.getHeight();
                        i5 = subcomposeMeasureScope.mo1412roundToPx0680j_4(getHighResolutionOutputSizeshNQ4ISI);
                    }
                    num = java.lang.Integer.valueOf(intValue2 + i5);
                } else {
                    num = null;
                }
                if (height6 == 0) {
                    if (num != null) {
                        intValue = num.intValue();
                    } else {
                        intValue = valueOf != null ? valueOf.intValue() : windowInsets.getBottom(subcomposeMeasureScope);
                    }
                    i3 = height6 + intValue;
                } else {
                    i3 = 0;
                }
                asPaddingValues = androidx.compose.foundation.layout.WindowInsetsKt.asPaddingValues(windowInsets, subcomposeMeasureScope);
                if (!arrayList7.isEmpty()) {
                    m8601constructorimpl = asPaddingValues.getTop();
                } else {
                    m8601constructorimpl = androidx.compose.ui.unit.Dp.m8601constructorimpl(0.0f);
                }
                if (!arrayList.isEmpty() || valueOf == null) {
                    bottom = asPaddingValues.getBottom();
                } else {
                    bottom = subcomposeMeasureScope.mo1415toDpu2uoSUM(valueOf.intValue());
                }
                scaffoldKt$ScaffoldLayout$contentPadding$1$1.setPaddingHolder(androidx.compose.foundation.layout.PaddingKt.m1702PaddingValuesa9UjIt4(androidx.compose.foundation.layout.PaddingKt.calculateStartPadding(asPaddingValues, subcomposeMeasureScope.getLayoutDirection()), m8601constructorimpl, androidx.compose.foundation.layout.PaddingKt.calculateEndPadding(asPaddingValues, subcomposeMeasureScope.getLayoutDirection()), bottom));
                java.util.List<androidx.compose.ui.layout.Measurable> subcompose5 = subcomposeMeasureScope.subcompose(androidx.compose.material.ScaffoldLayoutContent.Camera2StreamConfigurationMap, androidx.compose.runtime.internal.ComposableLambdaKt.composableLambdaInstance(-574531306, true, new kotlin.jvm.functions.Function2() { // from class: androidx.compose.material.ScaffoldKt$$ExternalSyntheticLambda2
                    @Override // kotlin.jvm.functions.Function2
                    public final java.lang.Object invoke(java.lang.Object obj15, java.lang.Object obj16) {
                        kotlin.Unit highResolutionOutputSizeshNQ4ISI;
                        highResolutionOutputSizeshNQ4ISI = androidx.compose.material.ScaffoldKt.getHighResolutionOutputSizeshNQ4ISI(kotlin.jvm.functions.Function3.this, scaffoldKt$ScaffoldLayout$contentPadding$1$1, (androidx.compose.runtime.Composer) obj15, ((java.lang.Integer) obj16).intValue());
                        return highResolutionOutputSizeshNQ4ISI;
                    }
                }));
                java.util.ArrayList arrayList11 = new java.util.ArrayList(subcompose5.size());
                size2 = subcompose5.size();
                i4 = 0;
                while (i4 < size2) {
                    arrayList11.add(subcompose5.get(i4).mo7353measureBRTryo0(androidx.compose.ui.unit.Constraints.m8545copyZbe2FdA$default(m8545copyZbe2FdA$default, 0, 0, 0, i11 - i12, 7, null)));
                    i4++;
                    m8545copyZbe2FdA$default = m8545copyZbe2FdA$default;
                }
                final java.util.ArrayList arrayList12 = arrayList11;
                final int i22 = i3;
                final androidx.compose.material.FabPlacement fabPlacement2 = fabPlacement;
                return androidx.compose.ui.layout.MeasureScope.layout$default(subcomposeMeasureScope, m8554getMaxWidthimpl, i11, null, new kotlin.jvm.functions.Function1() { // from class: androidx.compose.material.ScaffoldKt$$ExternalSyntheticLambda3
                    @Override // kotlin.jvm.functions.Function1
                    public final java.lang.Object invoke(java.lang.Object obj15) {
                        kotlin.Unit Camera2StreamConfigurationMap2;
                        Camera2StreamConfigurationMap2 = androidx.compose.material.ScaffoldKt.Camera2StreamConfigurationMap(arrayList12, arrayList7, arrayList8, arrayList, arrayList9, i12, i11, i22, valueOf, fabPlacement2, num, (androidx.compose.ui.layout.Placeable.PlacementScope) obj15);
                        return Camera2StreamConfigurationMap2;
                    }
                }, 4, null);
            }
        }
        fabPlacement = null;
        java.util.List<androidx.compose.ui.layout.Measurable> subcompose42 = subcomposeMeasureScope.subcompose(androidx.compose.material.ScaffoldLayoutContent.getHighSpeedVideoFpsRanges, androidx.compose.runtime.internal.ComposableLambdaKt.composableLambdaInstance(-502652347, true, new kotlin.jvm.functions.Function2() { // from class: androidx.compose.material.ScaffoldKt$$ExternalSyntheticLambda1
            @Override // kotlin.jvm.functions.Function2
            public final java.lang.Object invoke(java.lang.Object obj142, java.lang.Object obj15) {
                kotlin.Unit highSpeedVideoFpsRangesFor;
                highSpeedVideoFpsRangesFor = androidx.compose.material.ScaffoldKt.getHighSpeedVideoFpsRangesFor(androidx.compose.material.FabPlacement.this, function24, (androidx.compose.runtime.Composer) obj142, ((java.lang.Integer) obj15).intValue());
                return highSpeedVideoFpsRangesFor;
            }
        }));
        java.util.ArrayList arrayList102 = new java.util.ArrayList(subcompose42.size());
        size = subcompose42.size();
        while (i2 < size) {
        }
        arrayList = arrayList102;
        if (arrayList.isEmpty()) {
        }
        androidx.compose.ui.layout.Placeable placeable52 = (androidx.compose.ui.layout.Placeable) obj3;
        if (placeable52 == null) {
        }
        if (fabPlacement == null) {
        }
        if (height6 == 0) {
        }
        asPaddingValues = androidx.compose.foundation.layout.WindowInsetsKt.asPaddingValues(windowInsets, subcomposeMeasureScope);
        if (!arrayList7.isEmpty()) {
        }
        if (!arrayList.isEmpty()) {
        }
        bottom = asPaddingValues.getBottom();
        scaffoldKt$ScaffoldLayout$contentPadding$1$1.setPaddingHolder(androidx.compose.foundation.layout.PaddingKt.m1702PaddingValuesa9UjIt4(androidx.compose.foundation.layout.PaddingKt.calculateStartPadding(asPaddingValues, subcomposeMeasureScope.getLayoutDirection()), m8601constructorimpl, androidx.compose.foundation.layout.PaddingKt.calculateEndPadding(asPaddingValues, subcomposeMeasureScope.getLayoutDirection()), bottom));
        java.util.List<androidx.compose.ui.layout.Measurable> subcompose52 = subcomposeMeasureScope.subcompose(androidx.compose.material.ScaffoldLayoutContent.Camera2StreamConfigurationMap, androidx.compose.runtime.internal.ComposableLambdaKt.composableLambdaInstance(-574531306, true, new kotlin.jvm.functions.Function2() { // from class: androidx.compose.material.ScaffoldKt$$ExternalSyntheticLambda2
            @Override // kotlin.jvm.functions.Function2
            public final java.lang.Object invoke(java.lang.Object obj15, java.lang.Object obj16) {
                kotlin.Unit highResolutionOutputSizeshNQ4ISI;
                highResolutionOutputSizeshNQ4ISI = androidx.compose.material.ScaffoldKt.getHighResolutionOutputSizeshNQ4ISI(kotlin.jvm.functions.Function3.this, scaffoldKt$ScaffoldLayout$contentPadding$1$1, (androidx.compose.runtime.Composer) obj15, ((java.lang.Integer) obj16).intValue());
                return highResolutionOutputSizeshNQ4ISI;
            }
        }));
        java.util.ArrayList arrayList112 = new java.util.ArrayList(subcompose52.size());
        size2 = subcompose52.size();
        i4 = 0;
        while (i4 < size2) {
        }
        final java.util.List arrayList122 = arrayList112;
        final int i222 = i3;
        final androidx.compose.material.FabPlacement fabPlacement22 = fabPlacement;
        return androidx.compose.ui.layout.MeasureScope.layout$default(subcomposeMeasureScope, m8554getMaxWidthimpl, i11, null, new kotlin.jvm.functions.Function1() { // from class: androidx.compose.material.ScaffoldKt$$ExternalSyntheticLambda3
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj15) {
                kotlin.Unit Camera2StreamConfigurationMap2;
                Camera2StreamConfigurationMap2 = androidx.compose.material.ScaffoldKt.Camera2StreamConfigurationMap(arrayList122, arrayList7, arrayList8, arrayList, arrayList9, i12, i11, i222, valueOf, fabPlacement22, num, (androidx.compose.ui.layout.Placeable.PlacementScope) obj15);
                return Camera2StreamConfigurationMap2;
            }
        }, 4, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final kotlin.Unit getHighSpeedVideoFpsRangesFor(androidx.compose.material.FabPlacement fabPlacement, kotlin.jvm.functions.Function2 function2, androidx.compose.runtime.Composer composer, int i) {
        if (!composer.shouldExecute((i & 3) != 2, i & 1)) {
            composer.skipToGroupEnd();
        } else {
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventStart(-502652347, i, -1, "androidx.compose.material.ScaffoldLayout.<anonymous>.<anonymous>.<anonymous> (Scaffold.kt:474)");
            }
            androidx.compose.runtime.CompositionLocalKt.CompositionLocalProvider(Camera2StreamConfigurationMap.provides(fabPlacement), (kotlin.jvm.functions.Function2<? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.Unit>) function2, composer, androidx.compose.runtime.ProvidedValue.$stable);
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventEnd();
            }
        }
        return kotlin.Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final kotlin.Unit getHighResolutionOutputSizeshNQ4ISI(kotlin.jvm.functions.Function3 function3, androidx.compose.material.ScaffoldKt$ScaffoldLayout$contentPadding$1$1 scaffoldKt$ScaffoldLayout$contentPadding$1$1, androidx.compose.runtime.Composer composer, int i) {
        if (composer.shouldExecute((i & 3) != 2, i & 1)) {
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventStart(-574531306, i, -1, "androidx.compose.material.ScaffoldLayout.<anonymous>.<anonymous>.<anonymous> (Scaffold.kt:533)");
            }
            function3.invoke(scaffoldKt$ScaffoldLayout$contentPadding$1$1, composer, 6);
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventEnd();
            }
        } else {
            composer.skipToGroupEnd();
        }
        return kotlin.Unit.INSTANCE;
    }

    public static final androidx.compose.runtime.ProvidableCompositionLocal<androidx.compose.material.FabPlacement> getLocalFabPlacement() {
        return Camera2StreamConfigurationMap;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final kotlin.Unit Camera2StreamConfigurationMap(java.util.List list, java.util.List list2, java.util.List list3, java.util.List list4, java.util.List list5, int i, int i2, int i3, java.lang.Integer num, androidx.compose.material.FabPlacement fabPlacement, java.lang.Integer num2, androidx.compose.ui.layout.Placeable.PlacementScope placementScope) {
        int size = list.size();
        for (int i4 = 0; i4 < size; i4++) {
            androidx.compose.ui.layout.Placeable.PlacementScope.place$default(placementScope, (androidx.compose.ui.layout.Placeable) list.get(i4), 0, i, 0.0f, 4, null);
        }
        int size2 = list2.size();
        for (int i5 = 0; i5 < size2; i5++) {
            androidx.compose.ui.layout.Placeable.PlacementScope.place$default(placementScope, (androidx.compose.ui.layout.Placeable) list2.get(i5), 0, 0, 0.0f, 4, null);
        }
        int size3 = list3.size();
        for (int i6 = 0; i6 < size3; i6++) {
            androidx.compose.ui.layout.Placeable.PlacementScope.place$default(placementScope, (androidx.compose.ui.layout.Placeable) list3.get(i6), 0, i2 - i3, 0.0f, 4, null);
        }
        int size4 = list4.size();
        for (int i7 = 0; i7 < size4; i7++) {
            androidx.compose.ui.layout.Placeable.PlacementScope.place$default(placementScope, (androidx.compose.ui.layout.Placeable) list4.get(i7), 0, i2 - (num != null ? num.intValue() : 0), 0.0f, 4, null);
        }
        int size5 = list5.size();
        for (int i8 = 0; i8 < size5; i8++) {
            androidx.compose.ui.layout.Placeable.PlacementScope.place$default(placementScope, (androidx.compose.ui.layout.Placeable) list5.get(i8), fabPlacement != null ? fabPlacement.getLeft() : 0, i2 - (num2 != null ? num2.intValue() : 0), 0.0f, 4, null);
        }
        return kotlin.Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final kotlin.Unit getHighSpeedVideoFpsRangesFor(androidx.compose.foundation.layout.WindowInsets windowInsets, androidx.compose.ui.Modifier modifier, androidx.compose.material.ScaffoldState scaffoldState, kotlin.jvm.functions.Function2 function2, kotlin.jvm.functions.Function2 function22, kotlin.jvm.functions.Function3 function3, kotlin.jvm.functions.Function2 function23, int i, boolean z, kotlin.jvm.functions.Function3 function32, boolean z2, androidx.compose.ui.graphics.Shape shape, float f, long j, long j2, long j3, long j4, long j5, kotlin.jvm.functions.Function3 function33, int i2, int i3, int i4, androidx.compose.runtime.Composer composer) {
        m2720Scaffoldu4IkXBM(windowInsets, modifier, scaffoldState, function2, function22, function3, function23, i, z, function32, z2, shape, f, j, j2, j3, j4, j5, function33, composer, androidx.compose.runtime.RecomposeScopeImplKt.updateChangedFlags(i2 | 1), androidx.compose.runtime.RecomposeScopeImplKt.updateChangedFlags(i3), i4);
        return kotlin.Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final kotlin.Unit getHighSpeedVideoFpsRanges(androidx.compose.ui.Modifier modifier, androidx.compose.material.ScaffoldState scaffoldState, kotlin.jvm.functions.Function2 function2, kotlin.jvm.functions.Function2 function22, kotlin.jvm.functions.Function3 function3, kotlin.jvm.functions.Function2 function23, int i, boolean z, kotlin.jvm.functions.Function3 function32, boolean z2, androidx.compose.ui.graphics.Shape shape, float f, long j, long j2, long j3, long j4, long j5, kotlin.jvm.functions.Function3 function33, int i2, int i3, int i4, androidx.compose.runtime.Composer composer) {
        m2719Scaffold27mzLpw(modifier, scaffoldState, function2, function22, function3, function23, i, z, function32, z2, shape, f, j, j2, j3, j4, j5, function33, composer, androidx.compose.runtime.RecomposeScopeImplKt.updateChangedFlags(i2 | 1), androidx.compose.runtime.RecomposeScopeImplKt.updateChangedFlags(i3), i4);
        return kotlin.Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final kotlin.Unit getHighSpeedVideoFpsRanges(boolean z, int i, kotlin.jvm.functions.Function2 function2, kotlin.jvm.functions.Function3 function3, kotlin.jvm.functions.Function2 function22, kotlin.jvm.functions.Function2 function23, androidx.compose.foundation.layout.WindowInsets windowInsets, kotlin.jvm.functions.Function2 function24, int i2, androidx.compose.runtime.Composer composer) {
        getHighResolutionOutputSizeshNQ4ISI(z, i, function2, function3, function22, function23, windowInsets, function24, composer, androidx.compose.runtime.RecomposeScopeImplKt.updateChangedFlags(i2 | 1));
        return kotlin.Unit.INSTANCE;
    }
}
