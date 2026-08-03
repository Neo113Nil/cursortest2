package androidx.compose.material;

/* compiled from: Scaffold.kt */
@kotlin.Metadata(d1 = {"\u0000\u0080\u0001\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a¢\u0002\u0010\b\u001a\u00020\t2\b\b\u0002\u0010\n\u001a\u00020\u000b2\b\b\u0002\u0010\f\u001a\u00020\r2\u0013\b\u0002\u0010\u000e\u001a\r\u0012\u0004\u0012\u00020\t0\u000f¢\u0006\u0002\b\u00102\u0013\b\u0002\u0010\u0011\u001a\r\u0012\u0004\u0012\u00020\t0\u000f¢\u0006\u0002\b\u00102\u0019\b\u0002\u0010\u0012\u001a\u0013\u0012\u0004\u0012\u00020\u0014\u0012\u0004\u0012\u00020\t0\u0013¢\u0006\u0002\b\u00102\u0013\b\u0002\u0010\u0015\u001a\r\u0012\u0004\u0012\u00020\t0\u000f¢\u0006\u0002\b\u00102\b\b\u0002\u0010\u0016\u001a\u00020\u00172\b\b\u0002\u0010\u0018\u001a\u00020\u00192 \b\u0002\u0010\u001a\u001a\u001a\u0012\u0004\u0012\u00020\u001b\u0012\u0004\u0012\u00020\t\u0018\u00010\u0013¢\u0006\u0002\b\u0010¢\u0006\u0002\b\u001c2\b\b\u0002\u0010\u001d\u001a\u00020\u00192\b\b\u0002\u0010\u001e\u001a\u00020\u001f2\b\b\u0002\u0010 \u001a\u00020\u00012\b\b\u0002\u0010!\u001a\u00020\"2\b\b\u0002\u0010#\u001a\u00020\"2\b\b\u0002\u0010$\u001a\u00020\"2\b\b\u0002\u0010%\u001a\u00020\"2\b\b\u0002\u0010&\u001a\u00020\"2\u0017\u0010'\u001a\u0013\u0012\u0004\u0012\u00020(\u0012\u0004\u0012\u00020\t0\u0013¢\u0006\u0002\b\u0010H\u0007ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b)\u0010*\u001a£\u0001\u0010+\u001a\u00020\t2\u0006\u0010,\u001a\u00020\u00192\u0006\u0010-\u001a\u00020\u00172\u0016\u0010\u000e\u001a\u0012\u0012\u0004\u0012\u00020\t0\u000f¢\u0006\u0002\b\u0010¢\u0006\u0002\b.2\u001c\u0010'\u001a\u0018\u0012\u0004\u0012\u00020(\u0012\u0004\u0012\u00020\t0\u0013¢\u0006\u0002\b\u0010¢\u0006\u0002\b.2\u0016\u0010/\u001a\u0012\u0012\u0004\u0012\u00020\t0\u000f¢\u0006\u0002\b\u0010¢\u0006\u0002\b.2\u0016\u00100\u001a\u0012\u0012\u0004\u0012\u00020\t0\u000f¢\u0006\u0002\b\u0010¢\u0006\u0002\b.2\u0016\u0010\u0011\u001a\u0012\u0012\u0004\u0012\u00020\t0\u000f¢\u0006\u0002\b\u0010¢\u0006\u0002\b.H\u0003ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b1\u00102\u001a!\u00103\u001a\u00020\r2\b\b\u0002\u00104\u001a\u0002052\b\b\u0002\u00106\u001a\u00020\u0014H\u0007¢\u0006\u0002\u00107\"\u0013\u0010\u0000\u001a\u00020\u0001X\u0082\u0004ø\u0001\u0000¢\u0006\u0004\n\u0002\u0010\u0002\"\u001c\u0010\u0003\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00050\u0004X\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007\u0082\u0002\u000b\n\u0002\b\u0019\n\u0005\b¡\u001e0\u0001¨\u00068"}, d2 = {"FabSpacing", "Landroidx/compose/ui/unit/Dp;", "F", "LocalFabPlacement", "Landroidx/compose/runtime/ProvidableCompositionLocal;", "Landroidx/compose/material/FabPlacement;", "getLocalFabPlacement", "()Landroidx/compose/runtime/ProvidableCompositionLocal;", "Scaffold", "", "modifier", "Landroidx/compose/ui/Modifier;", "scaffoldState", "Landroidx/compose/material/ScaffoldState;", "topBar", "Lkotlin/Function0;", "Landroidx/compose/runtime/Composable;", "bottomBar", "snackbarHost", "Lkotlin/Function1;", "Landroidx/compose/material/SnackbarHostState;", "floatingActionButton", "floatingActionButtonPosition", "Landroidx/compose/material/FabPosition;", "isFloatingActionButtonDocked", "", "drawerContent", "Landroidx/compose/foundation/layout/ColumnScope;", "Lkotlin/ExtensionFunctionType;", "drawerGesturesEnabled", "drawerShape", "Landroidx/compose/ui/graphics/Shape;", "drawerElevation", "drawerBackgroundColor", "Landroidx/compose/ui/graphics/Color;", "drawerContentColor", "drawerScrimColor", "backgroundColor", "contentColor", "content", "Landroidx/compose/foundation/layout/PaddingValues;", "Scaffold-27mzLpw", "(Landroidx/compose/ui/Modifier;Landroidx/compose/material/ScaffoldState;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function3;Lkotlin/jvm/functions/Function2;IZLkotlin/jvm/functions/Function3;ZLandroidx/compose/ui/graphics/Shape;FJJJJJLkotlin/jvm/functions/Function3;Landroidx/compose/runtime/Composer;III)V", "ScaffoldLayout", "isFabDocked", "fabPosition", "Landroidx/compose/ui/UiComposable;", "snackbar", "fab", "ScaffoldLayout-MDYNRJg", "(ZILkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function3;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;Landroidx/compose/runtime/Composer;I)V", "rememberScaffoldState", "drawerState", "Landroidx/compose/material/DrawerState;", "snackbarHostState", "(Landroidx/compose/material/DrawerState;Landroidx/compose/material/SnackbarHostState;Landroidx/compose/runtime/Composer;II)Landroidx/compose/material/ScaffoldState;", "material_release"}, k = 2, mv = {1, 6, 0}, xi = 48)
/* loaded from: classes.dex */
public final class ScaffoldKt {
    private static final androidx.compose.runtime.ProvidableCompositionLocal<androidx.compose.material.FabPlacement> LocalFabPlacement = androidx.compose.runtime.CompositionLocalKt.staticCompositionLocalOf(new kotlin.jvm.functions.Function0<androidx.compose.material.FabPlacement>() { // from class: androidx.compose.material.ScaffoldKt$LocalFabPlacement$1
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // kotlin.jvm.functions.Function0
        public final androidx.compose.material.FabPlacement invoke() {
            return null;
        }
    });
    private static final float FabSpacing = androidx.compose.ui.unit.Dp.m4478constructorimpl(16);

    public static final androidx.compose.material.ScaffoldState rememberScaffoldState(androidx.compose.material.DrawerState drawerState, androidx.compose.material.SnackbarHostState snackbarHostState, androidx.compose.runtime.Composer composer, int i, int i2) {
        composer.startReplaceableGroup(1569641925);
        androidx.compose.runtime.ComposerKt.sourceInformation(composer, "C(rememberScaffoldState)63@2263L39,64@2347L32,65@2399L62:Scaffold.kt#jmzs0o");
        if ((i2 & 1) != 0) {
            drawerState = androidx.compose.material.DrawerKt.rememberDrawerState(androidx.compose.material.DrawerValue.Closed, null, composer, 6, 2);
        }
        if ((i2 & 2) != 0) {
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
        composer.startReplaceableGroup(-492369756);
        androidx.compose.runtime.ComposerKt.sourceInformation(composer, "C(remember):Composables.kt#9igjgp");
        java.lang.Object rememberedValue2 = composer.rememberedValue();
        if (rememberedValue2 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
            rememberedValue2 = new androidx.compose.material.ScaffoldState(drawerState, snackbarHostState);
            composer.updateRememberedValue(rememberedValue2);
        }
        composer.endReplaceableGroup();
        androidx.compose.material.ScaffoldState scaffoldState = (androidx.compose.material.ScaffoldState) rememberedValue2;
        composer.endReplaceableGroup();
        return scaffoldState;
    }

    /* JADX WARN: Code restructure failed: missing block: B:62:0x01bd, code lost:
    
        if (r0.changed(r53) == false) goto L146;
     */
    /* JADX WARN: Code restructure failed: missing block: B:70:0x01d7, code lost:
    
        if (r0.changed(r55) == false) goto L157;
     */
    /* JADX WARN: Removed duplicated region for block: B:102:0x04da  */
    /* JADX WARN: Removed duplicated region for block: B:105:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:108:0x027a  */
    /* JADX WARN: Removed duplicated region for block: B:134:0x043c  */
    /* JADX WARN: Removed duplicated region for block: B:136:0x04a6  */
    /* JADX WARN: Removed duplicated region for block: B:138:0x02df  */
    /* JADX WARN: Removed duplicated region for block: B:141:0x02ea  */
    /* JADX WARN: Removed duplicated region for block: B:143:0x02fd  */
    /* JADX WARN: Removed duplicated region for block: B:145:0x0308  */
    /* JADX WARN: Removed duplicated region for block: B:147:0x0313  */
    /* JADX WARN: Removed duplicated region for block: B:149:0x031e  */
    /* JADX WARN: Removed duplicated region for block: B:151:0x0329  */
    /* JADX WARN: Removed duplicated region for block: B:153:0x0331  */
    /* JADX WARN: Removed duplicated region for block: B:155:0x0337  */
    /* JADX WARN: Removed duplicated region for block: B:157:0x033d  */
    /* JADX WARN: Removed duplicated region for block: B:160:0x034a  */
    /* JADX WARN: Removed duplicated region for block: B:163:0x035f  */
    /* JADX WARN: Removed duplicated region for block: B:166:0x036c  */
    /* JADX WARN: Removed duplicated region for block: B:169:0x0396  */
    /* JADX WARN: Removed duplicated region for block: B:172:0x03a7  */
    /* JADX WARN: Removed duplicated region for block: B:175:0x03c0  */
    /* JADX WARN: Removed duplicated region for block: B:178:0x03d5  */
    /* JADX WARN: Removed duplicated region for block: B:180:0x03f2  */
    /* JADX WARN: Removed duplicated region for block: B:181:0x03cf  */
    /* JADX WARN: Removed duplicated region for block: B:182:0x03b5  */
    /* JADX WARN: Removed duplicated region for block: B:183:0x03a1  */
    /* JADX WARN: Removed duplicated region for block: B:184:0x0387  */
    /* JADX WARN: Removed duplicated region for block: B:185:0x0366  */
    /* JADX WARN: Removed duplicated region for block: B:186:0x0359  */
    /* JADX WARN: Removed duplicated region for block: B:187:0x033f  */
    /* JADX WARN: Removed duplicated region for block: B:188:0x0339  */
    /* JADX WARN: Removed duplicated region for block: B:189:0x0333  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0079  */
    /* JADX WARN: Removed duplicated region for block: B:190:0x0325  */
    /* JADX WARN: Removed duplicated region for block: B:191:0x031a  */
    /* JADX WARN: Removed duplicated region for block: B:192:0x030f  */
    /* JADX WARN: Removed duplicated region for block: B:193:0x0304  */
    /* JADX WARN: Removed duplicated region for block: B:194:0x02f7  */
    /* JADX WARN: Removed duplicated region for block: B:195:0x02e4  */
    /* JADX WARN: Removed duplicated region for block: B:196:0x0223  */
    /* JADX WARN: Removed duplicated region for block: B:203:0x0218  */
    /* JADX WARN: Removed duplicated region for block: B:205:0x01fe  */
    /* JADX WARN: Removed duplicated region for block: B:207:0x01e1  */
    /* JADX WARN: Removed duplicated region for block: B:209:0x01c7  */
    /* JADX WARN: Removed duplicated region for block: B:212:0x01ad  */
    /* JADX WARN: Removed duplicated region for block: B:213:0x0180  */
    /* JADX WARN: Removed duplicated region for block: B:222:0x0173  */
    /* JADX WARN: Removed duplicated region for block: B:223:0x0144  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x009d  */
    /* JADX WARN: Removed duplicated region for block: B:230:0x0124  */
    /* JADX WARN: Removed duplicated region for block: B:237:0x0106  */
    /* JADX WARN: Removed duplicated region for block: B:244:0x00e6  */
    /* JADX WARN: Removed duplicated region for block: B:251:0x00c6  */
    /* JADX WARN: Removed duplicated region for block: B:258:0x00a2  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x00bf  */
    /* JADX WARN: Removed duplicated region for block: B:265:0x007c  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x00df  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x00ff  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x011d  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x013d  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x015d  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x017b  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x0197  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x01b3  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x01cd  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x01e7  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x0204  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x021e  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x023d  */
    /* renamed from: Scaffold-27mzLpw, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void m1482Scaffold27mzLpw(androidx.compose.ui.Modifier modifier, androidx.compose.material.ScaffoldState scaffoldState, kotlin.jvm.functions.Function2<? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.Unit> function2, kotlin.jvm.functions.Function2<? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.Unit> function22, kotlin.jvm.functions.Function3<? super androidx.compose.material.SnackbarHostState, ? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.Unit> function3, kotlin.jvm.functions.Function2<? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.Unit> function23, int i, boolean z, kotlin.jvm.functions.Function3<? super androidx.compose.foundation.layout.ColumnScope, ? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.Unit> function32, boolean z2, androidx.compose.ui.graphics.Shape shape, float f, long j, long j2, long j3, long j4, long j5, final kotlin.jvm.functions.Function3<? super androidx.compose.foundation.layout.PaddingValues, ? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.Unit> content, androidx.compose.runtime.Composer composer, final int i2, final int i3, final int i4) {
        int i5;
        int i6;
        int i7;
        int i8;
        kotlin.jvm.functions.Function2<? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.Unit> function24;
        int i9;
        int i10;
        int i11;
        int i12;
        int i13;
        int i14;
        int i15;
        androidx.compose.ui.Modifier modifier2;
        androidx.compose.material.ScaffoldState scaffoldState2;
        kotlin.jvm.functions.Function2<? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.Unit> m1341getLambda1$material_release;
        kotlin.jvm.functions.Function2<? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.Unit> m1342getLambda2$material_release;
        kotlin.jvm.functions.Function3<? super androidx.compose.material.SnackbarHostState, ? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.Unit> m1343getLambda3$material_release;
        kotlin.jvm.functions.Function2<? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.Unit> m1344getLambda4$material_release;
        boolean z3;
        androidx.compose.foundation.shape.CornerBasedShape cornerBasedShape;
        androidx.compose.ui.graphics.Shape shape2;
        boolean z4;
        int i16;
        long j6;
        long j7;
        long j8;
        int i17;
        long j9;
        long j10;
        boolean z5;
        long j11;
        long j12;
        int i18;
        long j13;
        final androidx.compose.ui.Modifier modifier3;
        androidx.compose.material.ScaffoldState scaffoldState3;
        androidx.compose.ui.graphics.Shape shape3;
        long j14;
        float f2;
        int i19;
        kotlin.jvm.functions.Function3<? super androidx.compose.foundation.layout.ColumnScope, ? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.Unit> function33;
        androidx.compose.material.ScaffoldState scaffoldState4;
        final androidx.compose.material.ScaffoldState scaffoldState5;
        final kotlin.jvm.functions.Function2<? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.Unit> function25;
        final int i20;
        final float f3;
        final kotlin.jvm.functions.Function3<? super androidx.compose.foundation.layout.ColumnScope, ? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.Unit> function34;
        final boolean z6;
        final kotlin.jvm.functions.Function2<? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.Unit> function26;
        final kotlin.jvm.functions.Function2<? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.Unit> function27;
        final androidx.compose.ui.graphics.Shape shape4;
        final kotlin.jvm.functions.Function3<? super androidx.compose.material.SnackbarHostState, ? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.Unit> function35;
        final boolean z7;
        androidx.compose.runtime.ScopeUpdateScope endRestartGroup;
        int i21;
        int i22;
        int i23;
        int i24;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(content, "content");
        androidx.compose.runtime.Composer startRestartGroup = composer.startRestartGroup(1037492569);
        androidx.compose.runtime.ComposerKt.sourceInformation(startRestartGroup, "C(Scaffold)P(14,15,17,1,16,11,12:c#material.FabPosition,13,5,8,10,7:c#ui.unit.Dp,4:c#ui.graphics.Color,6:c#ui.graphics.Color,9:c#ui.graphics.Color,0:c#ui.graphics.Color,3:c#ui.graphics.Color)160@7052L23,169@7562L6,171@7677L6,172@7725L38,173@7810L10,174@7865L6,175@7910L32:Scaffold.kt#jmzs0o");
        int i25 = i4 & 1;
        if (i25 != 0) {
            i5 = i2 | 6;
        } else if ((i2 & 14) == 0) {
            i5 = (startRestartGroup.changed(modifier) ? 4 : 2) | i2;
        } else {
            i5 = i2;
        }
        if ((i2 & 112) == 0) {
            if ((i4 & 2) == 0 && startRestartGroup.changed(scaffoldState)) {
                i24 = 32;
                i5 |= i24;
            }
            i24 = 16;
            i5 |= i24;
        }
        int i26 = i4 & 4;
        if (i26 != 0) {
            i5 |= 384;
        } else if ((i2 & 896) == 0) {
            i5 |= startRestartGroup.changed(function2) ? 256 : 128;
            i6 = i4 & 8;
            int i27 = 2048;
            if (i6 == 0) {
                i5 |= 3072;
            } else if ((i2 & 7168) == 0) {
                i5 |= startRestartGroup.changed(function22) ? 2048 : 1024;
                i7 = i4 & 16;
                int i28 = 16384;
                if (i7 != 0) {
                    i5 |= 24576;
                } else if ((i2 & 57344) == 0) {
                    i5 |= startRestartGroup.changed(function3) ? 16384 : 8192;
                }
                i8 = i4 & 32;
                if (i8 != 0) {
                    i5 |= androidx.profileinstaller.ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE;
                    function24 = function23;
                } else {
                    function24 = function23;
                    if ((i2 & 458752) == 0) {
                        i5 |= startRestartGroup.changed(function24) ? 131072 : 65536;
                    }
                }
                i9 = i4 & 64;
                if (i9 != 0) {
                    i5 |= 1572864;
                    i10 = i;
                } else {
                    i10 = i;
                    if ((i2 & 3670016) == 0) {
                        i5 |= startRestartGroup.changed(i10) ? 1048576 : 524288;
                    }
                }
                i11 = i4 & 128;
                if (i11 != 0) {
                    i5 |= 12582912;
                } else if ((i2 & 29360128) == 0) {
                    i5 |= startRestartGroup.changed(z) ? 8388608 : 4194304;
                }
                i12 = i4 & 256;
                if (i12 != 0) {
                    i5 |= 100663296;
                } else if ((i2 & 234881024) == 0) {
                    i5 |= startRestartGroup.changed(function32) ? androidx.core.view.accessibility.AccessibilityEventCompat.TYPE_VIEW_TARGETED_BY_SCROLL : 33554432;
                }
                i13 = i4 & 512;
                if (i13 != 0) {
                    i5 |= 805306368;
                } else if ((i2 & 1879048192) == 0) {
                    i5 |= startRestartGroup.changed(z2) ? 536870912 : 268435456;
                }
                if ((i3 & 14) == 0) {
                    if ((i4 & 1024) == 0 && startRestartGroup.changed(shape)) {
                        i23 = 4;
                        i14 = i3 | i23;
                    }
                    i23 = 2;
                    i14 = i3 | i23;
                } else {
                    i14 = i3;
                }
                i15 = i4 & 2048;
                if (i15 != 0) {
                    i14 |= 48;
                } else if ((i3 & 112) == 0) {
                    i14 |= startRestartGroup.changed(f) ? 32 : 16;
                }
                if ((i3 & 896) == 0) {
                    if ((i4 & 4096) == 0 && startRestartGroup.changed(j)) {
                        i22 = 256;
                        i14 |= i22;
                    }
                    i22 = 128;
                    i14 |= i22;
                }
                if ((i3 & 7168) == 0) {
                    if ((i4 & 8192) != 0) {
                    }
                    i27 = 1024;
                    i14 |= i27;
                }
                if ((i3 & 57344) == 0) {
                    if ((i4 & 16384) != 0) {
                    }
                    i28 = 8192;
                    i14 |= i28;
                }
                if ((i3 & 458752) == 0) {
                    i14 |= ((i4 & 32768) == 0 && startRestartGroup.changed(j4)) ? 131072 : 65536;
                }
                if ((i3 & 3670016) == 0) {
                    i14 |= ((i4 & 65536) == 0 && startRestartGroup.changed(j5)) ? 1048576 : 524288;
                }
                if ((i4 & 131072) == 0) {
                    i21 = (i3 & 29360128) == 0 ? startRestartGroup.changed(content) ? 8388608 : 4194304 : 12582912;
                    if ((i5 & 1533916891) == 306783378 || (i14 & 23967451) != 4793490 || !startRestartGroup.getSkipping()) {
                        startRestartGroup.startDefaults();
                        if ((i2 & 1) != 0 || startRestartGroup.getDefaultsInvalid()) {
                            androidx.compose.ui.Modifier.Companion companion = i25 == 0 ? androidx.compose.ui.Modifier.INSTANCE : modifier;
                            if ((i4 & 2) == 0) {
                                modifier2 = companion;
                                scaffoldState2 = rememberScaffoldState(null, null, startRestartGroup, 0, 3);
                                i5 &= -113;
                            } else {
                                modifier2 = companion;
                                scaffoldState2 = scaffoldState;
                            }
                            m1341getLambda1$material_release = i26 == 0 ? androidx.compose.material.ComposableSingletons$ScaffoldKt.INSTANCE.m1341getLambda1$material_release() : function2;
                            m1342getLambda2$material_release = i6 == 0 ? androidx.compose.material.ComposableSingletons$ScaffoldKt.INSTANCE.m1342getLambda2$material_release() : function22;
                            m1343getLambda3$material_release = i7 == 0 ? androidx.compose.material.ComposableSingletons$ScaffoldKt.INSTANCE.m1343getLambda3$material_release() : function3;
                            m1344getLambda4$material_release = i8 == 0 ? androidx.compose.material.ComposableSingletons$ScaffoldKt.INSTANCE.m1344getLambda4$material_release() : function23;
                            if (i9 != 0) {
                                i10 = androidx.compose.material.FabPosition.INSTANCE.m1403getEnd5ygKITE();
                            }
                            z3 = i11 == 0 ? false : z;
                            kotlin.jvm.functions.Function3<? super androidx.compose.foundation.layout.ColumnScope, ? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.Unit> function36 = i12 == 0 ? null : function32;
                            boolean z8 = i13 == 0 ? true : z2;
                            androidx.compose.material.ScaffoldState scaffoldState6 = scaffoldState2;
                            kotlin.jvm.functions.Function3<? super androidx.compose.foundation.layout.ColumnScope, ? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.Unit> function37 = function36;
                            if ((i4 & 1024) == 0) {
                                cornerBasedShape = androidx.compose.material.MaterialTheme.INSTANCE.getShapes(startRestartGroup, 6).getLarge();
                                i14 &= -15;
                            } else {
                                cornerBasedShape = shape;
                            }
                            int i29 = i14;
                            float m1360getElevationD9Ej5fM = i15 == 0 ? androidx.compose.material.DrawerDefaults.INSTANCE.m1360getElevationD9Ej5fM() : f;
                            if ((i4 & 4096) == 0) {
                                shape2 = cornerBasedShape;
                                boolean z9 = z8;
                                i16 = i29 & (-897);
                                j6 = androidx.compose.material.MaterialTheme.INSTANCE.getColors(startRestartGroup, 6).m1319getSurface0d7_KjU();
                                z4 = z9;
                            } else {
                                shape2 = cornerBasedShape;
                                z4 = z8;
                                i16 = i29;
                                j6 = j;
                            }
                            float f4 = m1360getElevationD9Ej5fM;
                            if ((i4 & 8192) == 0) {
                                j7 = androidx.compose.material.ColorsKt.m1333contentColorForek8zF_U(j6, startRestartGroup, (i16 >> 6) & 14);
                                i16 &= -7169;
                            } else {
                                j7 = j2;
                            }
                            if ((i4 & 16384) == 0) {
                                j8 = j6;
                                i17 = 6;
                                j9 = androidx.compose.material.DrawerDefaults.INSTANCE.getScrimColor(startRestartGroup, 6);
                                i16 &= -57345;
                            } else {
                                j8 = j6;
                                i17 = 6;
                                j9 = j3;
                            }
                            if ((32768 & i4) == 0) {
                                j10 = androidx.compose.material.MaterialTheme.INSTANCE.getColors(startRestartGroup, i17).m1308getBackground0d7_KjU();
                                i16 &= -458753;
                            } else {
                                j10 = j4;
                            }
                            if ((i4 & 65536) == 0) {
                                long m1333contentColorForek8zF_U = androidx.compose.material.ColorsKt.m1333contentColorForek8zF_U(j10, startRestartGroup, (i16 >> 15) & 14);
                                i16 &= -3670017;
                                z5 = z4;
                                j12 = j10;
                                i18 = i5;
                                j11 = m1333contentColorForek8zF_U;
                                modifier3 = modifier2;
                                scaffoldState3 = scaffoldState6;
                                shape3 = shape2;
                                j13 = j9;
                            } else {
                                z5 = z4;
                                j11 = j5;
                                j12 = j10;
                                i18 = i5;
                                j13 = j9;
                                modifier3 = modifier2;
                                scaffoldState3 = scaffoldState6;
                                shape3 = shape2;
                            }
                            j14 = j7;
                            f2 = f4;
                            i19 = i16;
                            function33 = function37;
                        } else {
                            startRestartGroup.skipToGroupEnd();
                            if ((i4 & 2) != 0) {
                                i5 &= -113;
                            }
                            if ((i4 & 1024) != 0) {
                                i14 &= -15;
                            }
                            int i30 = i14;
                            if ((i4 & 4096) != 0) {
                                i30 &= -897;
                            }
                            if ((i4 & 8192) != 0) {
                                i30 &= -7169;
                            }
                            if ((i4 & 16384) != 0) {
                                i30 &= -57345;
                            }
                            if ((32768 & i4) != 0) {
                                i30 &= -458753;
                            }
                            if ((i4 & 65536) != 0) {
                                i30 &= -3670017;
                            }
                            scaffoldState3 = scaffoldState;
                            m1341getLambda1$material_release = function2;
                            m1342getLambda2$material_release = function22;
                            z3 = z;
                            function33 = function32;
                            z5 = z2;
                            f2 = f;
                            j8 = j;
                            j14 = j2;
                            j13 = j3;
                            j12 = j4;
                            j11 = j5;
                            i19 = i30;
                            i18 = i5;
                            m1344getLambda4$material_release = function24;
                            modifier3 = modifier;
                            m1343getLambda3$material_release = function3;
                            shape3 = shape;
                        }
                        startRestartGroup.endDefaults();
                        final long j15 = j12;
                        final long j16 = j11;
                        final int i31 = i19;
                        final boolean z10 = z3;
                        final int i32 = i10;
                        final kotlin.jvm.functions.Function2<? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.Unit> function28 = m1341getLambda1$material_release;
                        final kotlin.jvm.functions.Function2<? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.Unit> function29 = m1344getLambda4$material_release;
                        final kotlin.jvm.functions.Function2<? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.Unit> function210 = m1342getLambda2$material_release;
                        final int i33 = i18;
                        final kotlin.jvm.functions.Function3<? super androidx.compose.material.SnackbarHostState, ? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.Unit> function38 = m1343getLambda3$material_release;
                        final androidx.compose.material.ScaffoldState scaffoldState7 = scaffoldState3;
                        kotlin.jvm.functions.Function2<? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.Unit> function211 = m1341getLambda1$material_release;
                        kotlin.jvm.functions.Function2<? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.Unit> function212 = m1342getLambda2$material_release;
                        final androidx.compose.runtime.internal.ComposableLambda composableLambda = androidx.compose.runtime.internal.ComposableLambdaKt.composableLambda(startRestartGroup, 1823402604, true, new kotlin.jvm.functions.Function3<androidx.compose.ui.Modifier, androidx.compose.runtime.Composer, java.lang.Integer, kotlin.Unit>() { // from class: androidx.compose.material.ScaffoldKt$Scaffold$child$1
                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            /* JADX WARN: Multi-variable type inference failed */
                            {
                                super(3);
                            }

                            @Override // kotlin.jvm.functions.Function3
                            public /* bridge */ /* synthetic */ kotlin.Unit invoke(androidx.compose.ui.Modifier modifier4, androidx.compose.runtime.Composer composer2, java.lang.Integer num) {
                                invoke(modifier4, composer2, num.intValue());
                                return kotlin.Unit.INSTANCE;
                            }

                            public final void invoke(androidx.compose.ui.Modifier childModifier, androidx.compose.runtime.Composer composer2, int i34) {
                                int i35;
                                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(childModifier, "childModifier");
                                androidx.compose.runtime.ComposerKt.sourceInformation(composer2, "C179@8062L525:Scaffold.kt#jmzs0o");
                                if ((i34 & 14) == 0) {
                                    i35 = i34 | (composer2.changed(childModifier) ? 4 : 2);
                                } else {
                                    i35 = i34;
                                }
                                if ((i35 & 91) != 18 || !composer2.getSkipping()) {
                                    long j17 = j15;
                                    long j18 = j16;
                                    final boolean z11 = z10;
                                    final int i36 = i32;
                                    final kotlin.jvm.functions.Function2<androidx.compose.runtime.Composer, java.lang.Integer, kotlin.Unit> function213 = function28;
                                    final kotlin.jvm.functions.Function3<androidx.compose.foundation.layout.PaddingValues, androidx.compose.runtime.Composer, java.lang.Integer, kotlin.Unit> function39 = content;
                                    final kotlin.jvm.functions.Function2<androidx.compose.runtime.Composer, java.lang.Integer, kotlin.Unit> function214 = function29;
                                    final kotlin.jvm.functions.Function2<androidx.compose.runtime.Composer, java.lang.Integer, kotlin.Unit> function215 = function210;
                                    final int i37 = i33;
                                    final int i38 = i31;
                                    final kotlin.jvm.functions.Function3<androidx.compose.material.SnackbarHostState, androidx.compose.runtime.Composer, java.lang.Integer, kotlin.Unit> function310 = function38;
                                    final androidx.compose.material.ScaffoldState scaffoldState8 = scaffoldState7;
                                    androidx.compose.runtime.internal.ComposableLambda composableLambda2 = androidx.compose.runtime.internal.ComposableLambdaKt.composableLambda(composer2, -1128984656, true, new kotlin.jvm.functions.Function2<androidx.compose.runtime.Composer, java.lang.Integer, kotlin.Unit>() { // from class: androidx.compose.material.ScaffoldKt$Scaffold$child$1.1
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

                                        public final void invoke(androidx.compose.runtime.Composer composer3, int i39) {
                                            androidx.compose.runtime.ComposerKt.sourceInformation(composer3, "C180@8164L413:Scaffold.kt#jmzs0o");
                                            if ((i39 & 11) != 2 || !composer3.getSkipping()) {
                                                boolean z12 = z11;
                                                int i40 = i36;
                                                kotlin.jvm.functions.Function2<androidx.compose.runtime.Composer, java.lang.Integer, kotlin.Unit> function216 = function213;
                                                kotlin.jvm.functions.Function3<androidx.compose.foundation.layout.PaddingValues, androidx.compose.runtime.Composer, java.lang.Integer, kotlin.Unit> function311 = function39;
                                                final kotlin.jvm.functions.Function3<androidx.compose.material.SnackbarHostState, androidx.compose.runtime.Composer, java.lang.Integer, kotlin.Unit> function312 = function310;
                                                final androidx.compose.material.ScaffoldState scaffoldState9 = scaffoldState8;
                                                final int i41 = i37;
                                                androidx.compose.runtime.internal.ComposableLambda composableLambda3 = androidx.compose.runtime.internal.ComposableLambdaKt.composableLambda(composer3, 533782017, true, new kotlin.jvm.functions.Function2<androidx.compose.runtime.Composer, java.lang.Integer, kotlin.Unit>() { // from class: androidx.compose.material.ScaffoldKt.Scaffold.child.1.1.1
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

                                                    public final void invoke(androidx.compose.runtime.Composer composer4, int i42) {
                                                        androidx.compose.runtime.ComposerKt.sourceInformation(composer4, "C186@8417L45:Scaffold.kt#jmzs0o");
                                                        if ((i42 & 11) == 2 && composer4.getSkipping()) {
                                                            composer4.skipToGroupEnd();
                                                        } else {
                                                            function312.invoke(scaffoldState9.getSnackbarHostState(), composer4, java.lang.Integer.valueOf((i41 >> 9) & 112));
                                                        }
                                                    }
                                                });
                                                kotlin.jvm.functions.Function2<androidx.compose.runtime.Composer, java.lang.Integer, kotlin.Unit> function217 = function214;
                                                kotlin.jvm.functions.Function2<androidx.compose.runtime.Composer, java.lang.Integer, kotlin.Unit> function218 = function215;
                                                int i42 = i37;
                                                androidx.compose.material.ScaffoldKt.m1483ScaffoldLayoutMDYNRJg(z12, i40, function216, function311, composableLambda3, function217, function218, composer3, ((i42 >> 21) & 14) | 24576 | ((i42 >> 15) & 112) | (i42 & 896) | ((i38 >> 12) & 7168) | (458752 & i42) | ((i42 << 9) & 3670016));
                                                return;
                                            }
                                            composer3.skipToGroupEnd();
                                        }
                                    });
                                    int i39 = 1572864 | (i35 & 14);
                                    int i40 = i31;
                                    androidx.compose.material.SurfaceKt.m1511SurfaceFjzlyU(childModifier, null, j17, j18, null, 0.0f, composableLambda2, composer2, i39 | ((i40 >> 9) & 896) | ((i40 >> 9) & 7168), 50);
                                    return;
                                }
                                composer2.skipToGroupEnd();
                            }
                        });
                        if (function33 == null) {
                            startRestartGroup.startReplaceableGroup(-1013848234);
                            androidx.compose.runtime.ComposerKt.sourceInformation(startRestartGroup, "195@8636L487");
                            scaffoldState4 = scaffoldState3;
                            int i34 = i19 << 12;
                            androidx.compose.material.DrawerKt.m1364ModalDrawerGs3lGvM(function33, modifier3, scaffoldState3.getDrawerState(), z5, shape3, f2, j8, j14, j13, androidx.compose.runtime.internal.ComposableLambdaKt.composableLambda(startRestartGroup, 100842932, true, new kotlin.jvm.functions.Function2<androidx.compose.runtime.Composer, java.lang.Integer, kotlin.Unit>() { // from class: androidx.compose.material.ScaffoldKt$Scaffold$1
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

                                public final void invoke(androidx.compose.runtime.Composer composer2, int i35) {
                                    androidx.compose.runtime.ComposerKt.sourceInformation(composer2, "C205@9096L15:Scaffold.kt#jmzs0o");
                                    if ((i35 & 11) == 2 && composer2.getSkipping()) {
                                        composer2.skipToGroupEnd();
                                    } else {
                                        composableLambda.invoke(androidx.compose.ui.Modifier.INSTANCE, composer2, 54);
                                    }
                                }
                            }), startRestartGroup, ((i18 >> 24) & 14) | 805306368 | ((i18 << 3) & 112) | ((i18 >> 18) & 7168) | (i34 & 57344) | (i34 & 458752) | (i34 & 3670016) | (i34 & 29360128) | (i34 & 234881024), 0);
                            startRestartGroup.endReplaceableGroup();
                        } else {
                            scaffoldState4 = scaffoldState3;
                            startRestartGroup.startReplaceableGroup(-1013847725);
                            androidx.compose.runtime.ComposerKt.sourceInformation(startRestartGroup, "208@9145L15");
                            composableLambda.invoke(modifier3, startRestartGroup, java.lang.Integer.valueOf((i18 & 14) | 48));
                            startRestartGroup.endReplaceableGroup();
                        }
                        scaffoldState5 = scaffoldState4;
                        function25 = m1344getLambda4$material_release;
                        i20 = i10;
                        f3 = f2;
                        function34 = function33;
                        z6 = z5;
                        function26 = function211;
                        function27 = function212;
                        boolean z11 = z3;
                        shape4 = shape3;
                        function35 = m1343getLambda3$material_release;
                        z7 = z11;
                    } else {
                        startRestartGroup.skipToGroupEnd();
                        modifier3 = modifier;
                        scaffoldState5 = scaffoldState;
                        function26 = function2;
                        function27 = function22;
                        function35 = function3;
                        function34 = function32;
                        shape4 = shape;
                        f3 = f;
                        j8 = j;
                        j14 = j2;
                        j13 = j3;
                        j12 = j4;
                        j11 = j5;
                        function25 = function24;
                        i20 = i10;
                        z7 = z;
                        z6 = z2;
                    }
                    endRestartGroup = startRestartGroup.endRestartGroup();
                    if (endRestartGroup != null) {
                        return;
                    }
                    final long j17 = j8;
                    final long j18 = j14;
                    final long j19 = j13;
                    final long j20 = j12;
                    final long j21 = j11;
                    endRestartGroup.updateScope(new kotlin.jvm.functions.Function2<androidx.compose.runtime.Composer, java.lang.Integer, kotlin.Unit>() { // from class: androidx.compose.material.ScaffoldKt$Scaffold$2
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

                        public final void invoke(androidx.compose.runtime.Composer composer2, int i35) {
                            androidx.compose.material.ScaffoldKt.m1482Scaffold27mzLpw(androidx.compose.ui.Modifier.this, scaffoldState5, function26, function27, function35, function25, i20, z7, function34, z6, shape4, f3, j17, j18, j19, j20, j21, content, composer2, i2 | 1, i3, i4);
                        }
                    });
                    return;
                }
                i14 |= i21;
                if ((i5 & 1533916891) == 306783378) {
                }
                startRestartGroup.startDefaults();
                if ((i2 & 1) != 0) {
                }
                if (i25 == 0) {
                }
                if ((i4 & 2) == 0) {
                }
                if (i26 == 0) {
                }
                if (i6 == 0) {
                }
                if (i7 == 0) {
                }
                if (i8 == 0) {
                }
                if (i9 != 0) {
                }
                if (i11 == 0) {
                }
                if (i12 == 0) {
                }
                if (i13 == 0) {
                }
                androidx.compose.material.ScaffoldState scaffoldState62 = scaffoldState2;
                kotlin.jvm.functions.Function3<? super androidx.compose.foundation.layout.ColumnScope, ? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.Unit> function372 = function36;
                if ((i4 & 1024) == 0) {
                }
                int i292 = i14;
                if (i15 == 0) {
                }
                if ((i4 & 4096) == 0) {
                }
                float f42 = m1360getElevationD9Ej5fM;
                if ((i4 & 8192) == 0) {
                }
                if ((i4 & 16384) == 0) {
                }
                if ((32768 & i4) == 0) {
                }
                if ((i4 & 65536) == 0) {
                }
                j14 = j7;
                f2 = f42;
                i19 = i16;
                function33 = function372;
                startRestartGroup.endDefaults();
                final long j152 = j12;
                final long j162 = j11;
                final int i312 = i19;
                final boolean z102 = z3;
                final int i322 = i10;
                final kotlin.jvm.functions.Function2<? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.Unit> function282 = m1341getLambda1$material_release;
                final kotlin.jvm.functions.Function2<? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.Unit> function292 = m1344getLambda4$material_release;
                final kotlin.jvm.functions.Function2<? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.Unit> function2102 = m1342getLambda2$material_release;
                final int i332 = i18;
                final kotlin.jvm.functions.Function3<? super androidx.compose.material.SnackbarHostState, ? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.Unit> function382 = m1343getLambda3$material_release;
                final androidx.compose.material.ScaffoldState scaffoldState72 = scaffoldState3;
                kotlin.jvm.functions.Function2<? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.Unit> function2112 = m1341getLambda1$material_release;
                kotlin.jvm.functions.Function2<? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.Unit> function2122 = m1342getLambda2$material_release;
                final kotlin.jvm.functions.Function3<? super androidx.compose.ui.Modifier, ? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.Unit> composableLambda2 = androidx.compose.runtime.internal.ComposableLambdaKt.composableLambda(startRestartGroup, 1823402604, true, new kotlin.jvm.functions.Function3<androidx.compose.ui.Modifier, androidx.compose.runtime.Composer, java.lang.Integer, kotlin.Unit>() { // from class: androidx.compose.material.ScaffoldKt$Scaffold$child$1
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    /* JADX WARN: Multi-variable type inference failed */
                    {
                        super(3);
                    }

                    @Override // kotlin.jvm.functions.Function3
                    public /* bridge */ /* synthetic */ kotlin.Unit invoke(androidx.compose.ui.Modifier modifier4, androidx.compose.runtime.Composer composer2, java.lang.Integer num) {
                        invoke(modifier4, composer2, num.intValue());
                        return kotlin.Unit.INSTANCE;
                    }

                    public final void invoke(androidx.compose.ui.Modifier childModifier, androidx.compose.runtime.Composer composer2, int i342) {
                        int i35;
                        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(childModifier, "childModifier");
                        androidx.compose.runtime.ComposerKt.sourceInformation(composer2, "C179@8062L525:Scaffold.kt#jmzs0o");
                        if ((i342 & 14) == 0) {
                            i35 = i342 | (composer2.changed(childModifier) ? 4 : 2);
                        } else {
                            i35 = i342;
                        }
                        if ((i35 & 91) != 18 || !composer2.getSkipping()) {
                            long j172 = j152;
                            long j182 = j162;
                            final boolean z112 = z102;
                            final int i36 = i322;
                            final kotlin.jvm.functions.Function2<? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.Unit> function213 = function282;
                            final kotlin.jvm.functions.Function3<? super androidx.compose.foundation.layout.PaddingValues, ? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.Unit> function39 = content;
                            final kotlin.jvm.functions.Function2<? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.Unit> function214 = function292;
                            final kotlin.jvm.functions.Function2<? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.Unit> function215 = function2102;
                            final int i37 = i332;
                            final int i38 = i312;
                            final kotlin.jvm.functions.Function3<? super androidx.compose.material.SnackbarHostState, ? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.Unit> function310 = function382;
                            final androidx.compose.material.ScaffoldState scaffoldState8 = scaffoldState72;
                            androidx.compose.runtime.internal.ComposableLambda composableLambda22 = androidx.compose.runtime.internal.ComposableLambdaKt.composableLambda(composer2, -1128984656, true, new kotlin.jvm.functions.Function2<androidx.compose.runtime.Composer, java.lang.Integer, kotlin.Unit>() { // from class: androidx.compose.material.ScaffoldKt$Scaffold$child$1.1
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

                                public final void invoke(androidx.compose.runtime.Composer composer3, int i39) {
                                    androidx.compose.runtime.ComposerKt.sourceInformation(composer3, "C180@8164L413:Scaffold.kt#jmzs0o");
                                    if ((i39 & 11) != 2 || !composer3.getSkipping()) {
                                        boolean z12 = z112;
                                        int i40 = i36;
                                        kotlin.jvm.functions.Function2<androidx.compose.runtime.Composer, java.lang.Integer, kotlin.Unit> function216 = function213;
                                        kotlin.jvm.functions.Function3<androidx.compose.foundation.layout.PaddingValues, androidx.compose.runtime.Composer, java.lang.Integer, kotlin.Unit> function311 = function39;
                                        final kotlin.jvm.functions.Function3<? super androidx.compose.material.SnackbarHostState, ? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.Unit> function312 = function310;
                                        final androidx.compose.material.ScaffoldState scaffoldState9 = scaffoldState8;
                                        final int i41 = i37;
                                        androidx.compose.runtime.internal.ComposableLambda composableLambda3 = androidx.compose.runtime.internal.ComposableLambdaKt.composableLambda(composer3, 533782017, true, new kotlin.jvm.functions.Function2<androidx.compose.runtime.Composer, java.lang.Integer, kotlin.Unit>() { // from class: androidx.compose.material.ScaffoldKt.Scaffold.child.1.1.1
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

                                            public final void invoke(androidx.compose.runtime.Composer composer4, int i42) {
                                                androidx.compose.runtime.ComposerKt.sourceInformation(composer4, "C186@8417L45:Scaffold.kt#jmzs0o");
                                                if ((i42 & 11) == 2 && composer4.getSkipping()) {
                                                    composer4.skipToGroupEnd();
                                                } else {
                                                    function312.invoke(scaffoldState9.getSnackbarHostState(), composer4, java.lang.Integer.valueOf((i41 >> 9) & 112));
                                                }
                                            }
                                        });
                                        kotlin.jvm.functions.Function2<androidx.compose.runtime.Composer, java.lang.Integer, kotlin.Unit> function217 = function214;
                                        kotlin.jvm.functions.Function2<androidx.compose.runtime.Composer, java.lang.Integer, kotlin.Unit> function218 = function215;
                                        int i42 = i37;
                                        androidx.compose.material.ScaffoldKt.m1483ScaffoldLayoutMDYNRJg(z12, i40, function216, function311, composableLambda3, function217, function218, composer3, ((i42 >> 21) & 14) | 24576 | ((i42 >> 15) & 112) | (i42 & 896) | ((i38 >> 12) & 7168) | (458752 & i42) | ((i42 << 9) & 3670016));
                                        return;
                                    }
                                    composer3.skipToGroupEnd();
                                }
                            });
                            int i39 = 1572864 | (i35 & 14);
                            int i40 = i312;
                            androidx.compose.material.SurfaceKt.m1511SurfaceFjzlyU(childModifier, null, j172, j182, null, 0.0f, composableLambda22, composer2, i39 | ((i40 >> 9) & 896) | ((i40 >> 9) & 7168), 50);
                            return;
                        }
                        composer2.skipToGroupEnd();
                    }
                });
                if (function33 == null) {
                }
                scaffoldState5 = scaffoldState4;
                function25 = m1344getLambda4$material_release;
                i20 = i10;
                f3 = f2;
                function34 = function33;
                z6 = z5;
                function26 = function2112;
                function27 = function2122;
                boolean z112 = z3;
                shape4 = shape3;
                function35 = m1343getLambda3$material_release;
                z7 = z112;
                endRestartGroup = startRestartGroup.endRestartGroup();
                if (endRestartGroup != null) {
                }
            }
            i7 = i4 & 16;
            int i282 = 16384;
            if (i7 != 0) {
            }
            i8 = i4 & 32;
            if (i8 != 0) {
            }
            i9 = i4 & 64;
            if (i9 != 0) {
            }
            i11 = i4 & 128;
            if (i11 != 0) {
            }
            i12 = i4 & 256;
            if (i12 != 0) {
            }
            i13 = i4 & 512;
            if (i13 != 0) {
            }
            if ((i3 & 14) == 0) {
            }
            i15 = i4 & 2048;
            if (i15 != 0) {
            }
            if ((i3 & 896) == 0) {
            }
            if ((i3 & 7168) == 0) {
            }
            if ((i3 & 57344) == 0) {
            }
            if ((i3 & 458752) == 0) {
            }
            if ((i3 & 3670016) == 0) {
            }
            if ((i4 & 131072) == 0) {
            }
            i14 |= i21;
            if ((i5 & 1533916891) == 306783378) {
            }
            startRestartGroup.startDefaults();
            if ((i2 & 1) != 0) {
            }
            if (i25 == 0) {
            }
            if ((i4 & 2) == 0) {
            }
            if (i26 == 0) {
            }
            if (i6 == 0) {
            }
            if (i7 == 0) {
            }
            if (i8 == 0) {
            }
            if (i9 != 0) {
            }
            if (i11 == 0) {
            }
            if (i12 == 0) {
            }
            if (i13 == 0) {
            }
            androidx.compose.material.ScaffoldState scaffoldState622 = scaffoldState2;
            kotlin.jvm.functions.Function3<? super androidx.compose.foundation.layout.ColumnScope, ? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.Unit> function3722 = function36;
            if ((i4 & 1024) == 0) {
            }
            int i2922 = i14;
            if (i15 == 0) {
            }
            if ((i4 & 4096) == 0) {
            }
            float f422 = m1360getElevationD9Ej5fM;
            if ((i4 & 8192) == 0) {
            }
            if ((i4 & 16384) == 0) {
            }
            if ((32768 & i4) == 0) {
            }
            if ((i4 & 65536) == 0) {
            }
            j14 = j7;
            f2 = f422;
            i19 = i16;
            function33 = function3722;
            startRestartGroup.endDefaults();
            final long j1522 = j12;
            final long j1622 = j11;
            final int i3122 = i19;
            final boolean z1022 = z3;
            final int i3222 = i10;
            final kotlin.jvm.functions.Function2<? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.Unit> function2822 = m1341getLambda1$material_release;
            final kotlin.jvm.functions.Function2<? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.Unit> function2922 = m1344getLambda4$material_release;
            final kotlin.jvm.functions.Function2<? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.Unit> function21022 = m1342getLambda2$material_release;
            final int i3322 = i18;
            final kotlin.jvm.functions.Function3<? super androidx.compose.material.SnackbarHostState, ? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.Unit> function3822 = m1343getLambda3$material_release;
            final androidx.compose.material.ScaffoldState scaffoldState722 = scaffoldState3;
            kotlin.jvm.functions.Function2<? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.Unit> function21122 = m1341getLambda1$material_release;
            kotlin.jvm.functions.Function2<? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.Unit> function21222 = m1342getLambda2$material_release;
            final kotlin.jvm.functions.Function3<? super androidx.compose.ui.Modifier, ? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.Unit> composableLambda22 = androidx.compose.runtime.internal.ComposableLambdaKt.composableLambda(startRestartGroup, 1823402604, true, new kotlin.jvm.functions.Function3<androidx.compose.ui.Modifier, androidx.compose.runtime.Composer, java.lang.Integer, kotlin.Unit>() { // from class: androidx.compose.material.ScaffoldKt$Scaffold$child$1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                /* JADX WARN: Multi-variable type inference failed */
                {
                    super(3);
                }

                @Override // kotlin.jvm.functions.Function3
                public /* bridge */ /* synthetic */ kotlin.Unit invoke(androidx.compose.ui.Modifier modifier4, androidx.compose.runtime.Composer composer2, java.lang.Integer num) {
                    invoke(modifier4, composer2, num.intValue());
                    return kotlin.Unit.INSTANCE;
                }

                public final void invoke(androidx.compose.ui.Modifier childModifier, androidx.compose.runtime.Composer composer2, int i342) {
                    int i35;
                    kotlin.jvm.internal.Intrinsics.checkNotNullParameter(childModifier, "childModifier");
                    androidx.compose.runtime.ComposerKt.sourceInformation(composer2, "C179@8062L525:Scaffold.kt#jmzs0o");
                    if ((i342 & 14) == 0) {
                        i35 = i342 | (composer2.changed(childModifier) ? 4 : 2);
                    } else {
                        i35 = i342;
                    }
                    if ((i35 & 91) != 18 || !composer2.getSkipping()) {
                        long j172 = j1522;
                        long j182 = j1622;
                        final boolean z1122 = z1022;
                        final int i36 = i3222;
                        final kotlin.jvm.functions.Function2<? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.Unit> function213 = function2822;
                        final kotlin.jvm.functions.Function3<? super androidx.compose.foundation.layout.PaddingValues, ? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.Unit> function39 = content;
                        final kotlin.jvm.functions.Function2<? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.Unit> function214 = function2922;
                        final kotlin.jvm.functions.Function2<? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.Unit> function215 = function21022;
                        final int i37 = i3322;
                        final int i38 = i3122;
                        final kotlin.jvm.functions.Function3<? super androidx.compose.material.SnackbarHostState, ? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.Unit> function310 = function3822;
                        final androidx.compose.material.ScaffoldState scaffoldState8 = scaffoldState722;
                        androidx.compose.runtime.internal.ComposableLambda composableLambda222 = androidx.compose.runtime.internal.ComposableLambdaKt.composableLambda(composer2, -1128984656, true, new kotlin.jvm.functions.Function2<androidx.compose.runtime.Composer, java.lang.Integer, kotlin.Unit>() { // from class: androidx.compose.material.ScaffoldKt$Scaffold$child$1.1
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

                            public final void invoke(androidx.compose.runtime.Composer composer3, int i39) {
                                androidx.compose.runtime.ComposerKt.sourceInformation(composer3, "C180@8164L413:Scaffold.kt#jmzs0o");
                                if ((i39 & 11) != 2 || !composer3.getSkipping()) {
                                    boolean z12 = z1122;
                                    int i40 = i36;
                                    kotlin.jvm.functions.Function2<androidx.compose.runtime.Composer, java.lang.Integer, kotlin.Unit> function216 = function213;
                                    kotlin.jvm.functions.Function3<androidx.compose.foundation.layout.PaddingValues, androidx.compose.runtime.Composer, java.lang.Integer, kotlin.Unit> function311 = function39;
                                    final kotlin.jvm.functions.Function3<? super androidx.compose.material.SnackbarHostState, ? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.Unit> function312 = function310;
                                    final androidx.compose.material.ScaffoldState scaffoldState9 = scaffoldState8;
                                    final int i41 = i37;
                                    androidx.compose.runtime.internal.ComposableLambda composableLambda3 = androidx.compose.runtime.internal.ComposableLambdaKt.composableLambda(composer3, 533782017, true, new kotlin.jvm.functions.Function2<androidx.compose.runtime.Composer, java.lang.Integer, kotlin.Unit>() { // from class: androidx.compose.material.ScaffoldKt.Scaffold.child.1.1.1
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

                                        public final void invoke(androidx.compose.runtime.Composer composer4, int i42) {
                                            androidx.compose.runtime.ComposerKt.sourceInformation(composer4, "C186@8417L45:Scaffold.kt#jmzs0o");
                                            if ((i42 & 11) == 2 && composer4.getSkipping()) {
                                                composer4.skipToGroupEnd();
                                            } else {
                                                function312.invoke(scaffoldState9.getSnackbarHostState(), composer4, java.lang.Integer.valueOf((i41 >> 9) & 112));
                                            }
                                        }
                                    });
                                    kotlin.jvm.functions.Function2<androidx.compose.runtime.Composer, java.lang.Integer, kotlin.Unit> function217 = function214;
                                    kotlin.jvm.functions.Function2<androidx.compose.runtime.Composer, java.lang.Integer, kotlin.Unit> function218 = function215;
                                    int i42 = i37;
                                    androidx.compose.material.ScaffoldKt.m1483ScaffoldLayoutMDYNRJg(z12, i40, function216, function311, composableLambda3, function217, function218, composer3, ((i42 >> 21) & 14) | 24576 | ((i42 >> 15) & 112) | (i42 & 896) | ((i38 >> 12) & 7168) | (458752 & i42) | ((i42 << 9) & 3670016));
                                    return;
                                }
                                composer3.skipToGroupEnd();
                            }
                        });
                        int i39 = 1572864 | (i35 & 14);
                        int i40 = i3122;
                        androidx.compose.material.SurfaceKt.m1511SurfaceFjzlyU(childModifier, null, j172, j182, null, 0.0f, composableLambda222, composer2, i39 | ((i40 >> 9) & 896) | ((i40 >> 9) & 7168), 50);
                        return;
                    }
                    composer2.skipToGroupEnd();
                }
            });
            if (function33 == null) {
            }
            scaffoldState5 = scaffoldState4;
            function25 = m1344getLambda4$material_release;
            i20 = i10;
            f3 = f2;
            function34 = function33;
            z6 = z5;
            function26 = function21122;
            function27 = function21222;
            boolean z1122 = z3;
            shape4 = shape3;
            function35 = m1343getLambda3$material_release;
            z7 = z1122;
            endRestartGroup = startRestartGroup.endRestartGroup();
            if (endRestartGroup != null) {
            }
        }
        i6 = i4 & 8;
        int i272 = 2048;
        if (i6 == 0) {
        }
        i7 = i4 & 16;
        int i2822 = 16384;
        if (i7 != 0) {
        }
        i8 = i4 & 32;
        if (i8 != 0) {
        }
        i9 = i4 & 64;
        if (i9 != 0) {
        }
        i11 = i4 & 128;
        if (i11 != 0) {
        }
        i12 = i4 & 256;
        if (i12 != 0) {
        }
        i13 = i4 & 512;
        if (i13 != 0) {
        }
        if ((i3 & 14) == 0) {
        }
        i15 = i4 & 2048;
        if (i15 != 0) {
        }
        if ((i3 & 896) == 0) {
        }
        if ((i3 & 7168) == 0) {
        }
        if ((i3 & 57344) == 0) {
        }
        if ((i3 & 458752) == 0) {
        }
        if ((i3 & 3670016) == 0) {
        }
        if ((i4 & 131072) == 0) {
        }
        i14 |= i21;
        if ((i5 & 1533916891) == 306783378) {
        }
        startRestartGroup.startDefaults();
        if ((i2 & 1) != 0) {
        }
        if (i25 == 0) {
        }
        if ((i4 & 2) == 0) {
        }
        if (i26 == 0) {
        }
        if (i6 == 0) {
        }
        if (i7 == 0) {
        }
        if (i8 == 0) {
        }
        if (i9 != 0) {
        }
        if (i11 == 0) {
        }
        if (i12 == 0) {
        }
        if (i13 == 0) {
        }
        androidx.compose.material.ScaffoldState scaffoldState6222 = scaffoldState2;
        kotlin.jvm.functions.Function3<? super androidx.compose.foundation.layout.ColumnScope, ? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.Unit> function37222 = function36;
        if ((i4 & 1024) == 0) {
        }
        int i29222 = i14;
        if (i15 == 0) {
        }
        if ((i4 & 4096) == 0) {
        }
        float f4222 = m1360getElevationD9Ej5fM;
        if ((i4 & 8192) == 0) {
        }
        if ((i4 & 16384) == 0) {
        }
        if ((32768 & i4) == 0) {
        }
        if ((i4 & 65536) == 0) {
        }
        j14 = j7;
        f2 = f4222;
        i19 = i16;
        function33 = function37222;
        startRestartGroup.endDefaults();
        final long j15222 = j12;
        final long j16222 = j11;
        final int i31222 = i19;
        final boolean z10222 = z3;
        final int i32222 = i10;
        final kotlin.jvm.functions.Function2<? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.Unit> function28222 = m1341getLambda1$material_release;
        final kotlin.jvm.functions.Function2<? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.Unit> function29222 = m1344getLambda4$material_release;
        final kotlin.jvm.functions.Function2<? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.Unit> function210222 = m1342getLambda2$material_release;
        final int i33222 = i18;
        final kotlin.jvm.functions.Function3<? super androidx.compose.material.SnackbarHostState, ? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.Unit> function38222 = m1343getLambda3$material_release;
        final androidx.compose.material.ScaffoldState scaffoldState7222 = scaffoldState3;
        kotlin.jvm.functions.Function2<? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.Unit> function211222 = m1341getLambda1$material_release;
        kotlin.jvm.functions.Function2<? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.Unit> function212222 = m1342getLambda2$material_release;
        final kotlin.jvm.functions.Function3<? super androidx.compose.ui.Modifier, ? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.Unit> composableLambda222 = androidx.compose.runtime.internal.ComposableLambdaKt.composableLambda(startRestartGroup, 1823402604, true, new kotlin.jvm.functions.Function3<androidx.compose.ui.Modifier, androidx.compose.runtime.Composer, java.lang.Integer, kotlin.Unit>() { // from class: androidx.compose.material.ScaffoldKt$Scaffold$child$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            {
                super(3);
            }

            @Override // kotlin.jvm.functions.Function3
            public /* bridge */ /* synthetic */ kotlin.Unit invoke(androidx.compose.ui.Modifier modifier4, androidx.compose.runtime.Composer composer2, java.lang.Integer num) {
                invoke(modifier4, composer2, num.intValue());
                return kotlin.Unit.INSTANCE;
            }

            public final void invoke(androidx.compose.ui.Modifier childModifier, androidx.compose.runtime.Composer composer2, int i342) {
                int i35;
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(childModifier, "childModifier");
                androidx.compose.runtime.ComposerKt.sourceInformation(composer2, "C179@8062L525:Scaffold.kt#jmzs0o");
                if ((i342 & 14) == 0) {
                    i35 = i342 | (composer2.changed(childModifier) ? 4 : 2);
                } else {
                    i35 = i342;
                }
                if ((i35 & 91) != 18 || !composer2.getSkipping()) {
                    long j172 = j15222;
                    long j182 = j16222;
                    final boolean z11222 = z10222;
                    final int i36 = i32222;
                    final kotlin.jvm.functions.Function2<? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.Unit> function213 = function28222;
                    final kotlin.jvm.functions.Function3<? super androidx.compose.foundation.layout.PaddingValues, ? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.Unit> function39 = content;
                    final kotlin.jvm.functions.Function2<? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.Unit> function214 = function29222;
                    final kotlin.jvm.functions.Function2<? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.Unit> function215 = function210222;
                    final int i37 = i33222;
                    final int i38 = i31222;
                    final kotlin.jvm.functions.Function3<? super androidx.compose.material.SnackbarHostState, ? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.Unit> function310 = function38222;
                    final androidx.compose.material.ScaffoldState scaffoldState8 = scaffoldState7222;
                    androidx.compose.runtime.internal.ComposableLambda composableLambda2222 = androidx.compose.runtime.internal.ComposableLambdaKt.composableLambda(composer2, -1128984656, true, new kotlin.jvm.functions.Function2<androidx.compose.runtime.Composer, java.lang.Integer, kotlin.Unit>() { // from class: androidx.compose.material.ScaffoldKt$Scaffold$child$1.1
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

                        public final void invoke(androidx.compose.runtime.Composer composer3, int i39) {
                            androidx.compose.runtime.ComposerKt.sourceInformation(composer3, "C180@8164L413:Scaffold.kt#jmzs0o");
                            if ((i39 & 11) != 2 || !composer3.getSkipping()) {
                                boolean z12 = z11222;
                                int i40 = i36;
                                kotlin.jvm.functions.Function2<androidx.compose.runtime.Composer, java.lang.Integer, kotlin.Unit> function216 = function213;
                                kotlin.jvm.functions.Function3<androidx.compose.foundation.layout.PaddingValues, androidx.compose.runtime.Composer, java.lang.Integer, kotlin.Unit> function311 = function39;
                                final kotlin.jvm.functions.Function3<? super androidx.compose.material.SnackbarHostState, ? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.Unit> function312 = function310;
                                final androidx.compose.material.ScaffoldState scaffoldState9 = scaffoldState8;
                                final int i41 = i37;
                                androidx.compose.runtime.internal.ComposableLambda composableLambda3 = androidx.compose.runtime.internal.ComposableLambdaKt.composableLambda(composer3, 533782017, true, new kotlin.jvm.functions.Function2<androidx.compose.runtime.Composer, java.lang.Integer, kotlin.Unit>() { // from class: androidx.compose.material.ScaffoldKt.Scaffold.child.1.1.1
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

                                    public final void invoke(androidx.compose.runtime.Composer composer4, int i42) {
                                        androidx.compose.runtime.ComposerKt.sourceInformation(composer4, "C186@8417L45:Scaffold.kt#jmzs0o");
                                        if ((i42 & 11) == 2 && composer4.getSkipping()) {
                                            composer4.skipToGroupEnd();
                                        } else {
                                            function312.invoke(scaffoldState9.getSnackbarHostState(), composer4, java.lang.Integer.valueOf((i41 >> 9) & 112));
                                        }
                                    }
                                });
                                kotlin.jvm.functions.Function2<androidx.compose.runtime.Composer, java.lang.Integer, kotlin.Unit> function217 = function214;
                                kotlin.jvm.functions.Function2<androidx.compose.runtime.Composer, java.lang.Integer, kotlin.Unit> function218 = function215;
                                int i42 = i37;
                                androidx.compose.material.ScaffoldKt.m1483ScaffoldLayoutMDYNRJg(z12, i40, function216, function311, composableLambda3, function217, function218, composer3, ((i42 >> 21) & 14) | 24576 | ((i42 >> 15) & 112) | (i42 & 896) | ((i38 >> 12) & 7168) | (458752 & i42) | ((i42 << 9) & 3670016));
                                return;
                            }
                            composer3.skipToGroupEnd();
                        }
                    });
                    int i39 = 1572864 | (i35 & 14);
                    int i40 = i31222;
                    androidx.compose.material.SurfaceKt.m1511SurfaceFjzlyU(childModifier, null, j172, j182, null, 0.0f, composableLambda2222, composer2, i39 | ((i40 >> 9) & 896) | ((i40 >> 9) & 7168), 50);
                    return;
                }
                composer2.skipToGroupEnd();
            }
        });
        if (function33 == null) {
        }
        scaffoldState5 = scaffoldState4;
        function25 = m1344getLambda4$material_release;
        i20 = i10;
        f3 = f2;
        function34 = function33;
        z6 = z5;
        function26 = function211222;
        function27 = function212222;
        boolean z11222 = z3;
        shape4 = shape3;
        function35 = m1343getLambda3$material_release;
        z7 = z11222;
        endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: ScaffoldLayout-MDYNRJg, reason: not valid java name */
    public static final void m1483ScaffoldLayoutMDYNRJg(final boolean z, final int i, final kotlin.jvm.functions.Function2<? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.Unit> function2, final kotlin.jvm.functions.Function3<? super androidx.compose.foundation.layout.PaddingValues, ? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.Unit> function3, final kotlin.jvm.functions.Function2<? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.Unit> function22, final kotlin.jvm.functions.Function2<? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.Unit> function23, final kotlin.jvm.functions.Function2<? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.Unit> function24, androidx.compose.runtime.Composer composer, final int i2) {
        int i3;
        int i4;
        androidx.compose.runtime.Composer startRestartGroup = composer.startRestartGroup(-1401632215);
        androidx.compose.runtime.ComposerKt.sourceInformation(startRestartGroup, "C(ScaffoldLayout)P(4,3:c#material.FabPosition,6,1,5,2)236@10234L4498,236@10217L4515:Scaffold.kt#jmzs0o");
        int i5 = (i2 & 14) == 0 ? (startRestartGroup.changed(z) ? 4 : 2) | i2 : i2;
        if ((i2 & 112) == 0) {
            i5 |= startRestartGroup.changed(i) ? 32 : 16;
        }
        if ((i2 & 896) == 0) {
            i5 |= startRestartGroup.changed(function2) ? 256 : 128;
        }
        if ((i2 & 7168) == 0) {
            i5 |= startRestartGroup.changed(function3) ? 2048 : 1024;
        }
        if ((57344 & i2) == 0) {
            i5 |= startRestartGroup.changed(function22) ? 16384 : 8192;
        }
        if ((458752 & i2) == 0) {
            i5 |= startRestartGroup.changed(function23) ? 131072 : 65536;
        }
        if ((3670016 & i2) == 0) {
            i5 |= startRestartGroup.changed(function24) ? 1048576 : 524288;
        }
        final int i6 = i5;
        if ((i6 & 2995931) != 599186 || !startRestartGroup.getSkipping()) {
            java.lang.Object[] objArr = {function2, function22, function23, androidx.compose.material.FabPosition.m1395boximpl(i), java.lang.Boolean.valueOf(z), function24, function3};
            startRestartGroup.startReplaceableGroup(-568225417);
            androidx.compose.runtime.ComposerKt.sourceInformation(startRestartGroup, "C(remember)P(1):Composables.kt#9igjgp");
            boolean z2 = false;
            for (int i7 = 0; i7 < 7; i7++) {
                z2 |= startRestartGroup.changed(objArr[i7]);
            }
            java.lang.Object rememberedValue = startRestartGroup.rememberedValue();
            if (z2 || rememberedValue == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                i3 = 1;
                i4 = 0;
                rememberedValue = (kotlin.jvm.functions.Function2) new kotlin.jvm.functions.Function2<androidx.compose.ui.layout.SubcomposeMeasureScope, androidx.compose.ui.unit.Constraints, androidx.compose.ui.layout.MeasureResult>() { // from class: androidx.compose.material.ScaffoldKt$ScaffoldLayout$1$1
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    /* JADX WARN: Multi-variable type inference failed */
                    {
                        super(2);
                    }

                    @Override // kotlin.jvm.functions.Function2
                    public /* bridge */ /* synthetic */ androidx.compose.ui.layout.MeasureResult invoke(androidx.compose.ui.layout.SubcomposeMeasureScope subcomposeMeasureScope, androidx.compose.ui.unit.Constraints constraints) {
                        return m1485invoke0kLqBqw(subcomposeMeasureScope, constraints.getValue());
                    }

                    /* renamed from: invoke-0kLqBqw, reason: not valid java name */
                    public final androidx.compose.ui.layout.MeasureResult m1485invoke0kLqBqw(final androidx.compose.ui.layout.SubcomposeMeasureScope SubcomposeLayout, long j) {
                        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(SubcomposeLayout, "$this$SubcomposeLayout");
                        final int m4424getMaxWidthimpl = androidx.compose.ui.unit.Constraints.m4424getMaxWidthimpl(j);
                        final int m4423getMaxHeightimpl = androidx.compose.ui.unit.Constraints.m4423getMaxHeightimpl(j);
                        final long m4415copyZbe2FdA$default = androidx.compose.ui.unit.Constraints.m4415copyZbe2FdA$default(j, 0, 0, 0, 0, 10, null);
                        final kotlin.jvm.functions.Function2<androidx.compose.runtime.Composer, java.lang.Integer, kotlin.Unit> function25 = function2;
                        final kotlin.jvm.functions.Function2<androidx.compose.runtime.Composer, java.lang.Integer, kotlin.Unit> function26 = function22;
                        final kotlin.jvm.functions.Function2<androidx.compose.runtime.Composer, java.lang.Integer, kotlin.Unit> function27 = function23;
                        final int i8 = i;
                        final boolean z3 = z;
                        final kotlin.jvm.functions.Function2<androidx.compose.runtime.Composer, java.lang.Integer, kotlin.Unit> function28 = function24;
                        final int i9 = i6;
                        final kotlin.jvm.functions.Function3<androidx.compose.foundation.layout.PaddingValues, androidx.compose.runtime.Composer, java.lang.Integer, kotlin.Unit> function32 = function3;
                        return androidx.compose.ui.layout.MeasureScope.CC.layout$default(SubcomposeLayout, m4424getMaxWidthimpl, m4423getMaxHeightimpl, null, new kotlin.jvm.functions.Function1<androidx.compose.ui.layout.Placeable.PlacementScope, kotlin.Unit>() { // from class: androidx.compose.material.ScaffoldKt$ScaffoldLayout$1$1.1
                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            /* JADX WARN: Multi-variable type inference failed */
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
                                java.lang.Object obj;
                                java.lang.Object obj2;
                                final androidx.compose.material.FabPlacement fabPlacement;
                                java.lang.Object obj3;
                                java.lang.Integer num;
                                int i10;
                                int height;
                                float f;
                                int i11;
                                int height2;
                                float f2;
                                java.lang.Object obj4;
                                java.lang.Object obj5;
                                int i12;
                                float f3;
                                float f4;
                                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(layout, "$this$layout");
                                java.util.List<androidx.compose.ui.layout.Measurable> subcompose = androidx.compose.ui.layout.SubcomposeMeasureScope.this.subcompose(androidx.compose.material.ScaffoldLayoutContent.TopBar, function25);
                                long j2 = m4415copyZbe2FdA$default;
                                java.util.ArrayList arrayList = new java.util.ArrayList(subcompose.size());
                                int size = subcompose.size();
                                for (int i13 = 0; i13 < size; i13++) {
                                    arrayList.add(subcompose.get(i13).mo3402measureBRTryo0(j2));
                                }
                                java.util.ArrayList arrayList2 = arrayList;
                                if (arrayList2.isEmpty()) {
                                    obj = null;
                                } else {
                                    obj = arrayList2.get(0);
                                    int height3 = ((androidx.compose.ui.layout.Placeable) obj).getHeight();
                                    int lastIndex = kotlin.collections.CollectionsKt.getLastIndex(arrayList2);
                                    if (1 <= lastIndex) {
                                        int i14 = 1;
                                        while (true) {
                                            java.lang.Object obj6 = arrayList2.get(i14);
                                            int height4 = ((androidx.compose.ui.layout.Placeable) obj6).getHeight();
                                            if (height3 < height4) {
                                                obj = obj6;
                                                height3 = height4;
                                            }
                                            if (i14 == lastIndex) {
                                                break;
                                            } else {
                                                i14++;
                                            }
                                        }
                                    }
                                }
                                androidx.compose.ui.layout.Placeable placeable = (androidx.compose.ui.layout.Placeable) obj;
                                int height5 = placeable != null ? placeable.getHeight() : 0;
                                java.util.List<androidx.compose.ui.layout.Measurable> subcompose2 = androidx.compose.ui.layout.SubcomposeMeasureScope.this.subcompose(androidx.compose.material.ScaffoldLayoutContent.Snackbar, function26);
                                long j3 = m4415copyZbe2FdA$default;
                                java.util.ArrayList arrayList3 = new java.util.ArrayList(subcompose2.size());
                                int size2 = subcompose2.size();
                                for (int i15 = 0; i15 < size2; i15++) {
                                    arrayList3.add(subcompose2.get(i15).mo3402measureBRTryo0(j3));
                                }
                                java.util.ArrayList arrayList4 = arrayList3;
                                if (arrayList4.isEmpty()) {
                                    obj2 = null;
                                } else {
                                    obj2 = arrayList4.get(0);
                                    int height6 = ((androidx.compose.ui.layout.Placeable) obj2).getHeight();
                                    int lastIndex2 = kotlin.collections.CollectionsKt.getLastIndex(arrayList4);
                                    if (1 <= lastIndex2) {
                                        int i16 = 1;
                                        while (true) {
                                            java.lang.Object obj7 = arrayList4.get(i16);
                                            int height7 = ((androidx.compose.ui.layout.Placeable) obj7).getHeight();
                                            if (height6 < height7) {
                                                obj2 = obj7;
                                                height6 = height7;
                                            }
                                            if (i16 == lastIndex2) {
                                                break;
                                            } else {
                                                i16++;
                                            }
                                        }
                                    }
                                }
                                androidx.compose.ui.layout.Placeable placeable2 = (androidx.compose.ui.layout.Placeable) obj2;
                                int height8 = placeable2 != null ? placeable2.getHeight() : 0;
                                java.util.List<androidx.compose.ui.layout.Measurable> subcompose3 = androidx.compose.ui.layout.SubcomposeMeasureScope.this.subcompose(androidx.compose.material.ScaffoldLayoutContent.Fab, function27);
                                long j4 = m4415copyZbe2FdA$default;
                                java.util.ArrayList arrayList5 = new java.util.ArrayList();
                                java.util.Iterator<T> it = subcompose3.iterator();
                                while (it.hasNext()) {
                                    androidx.compose.ui.layout.Placeable mo3402measureBRTryo0 = ((androidx.compose.ui.layout.Measurable) it.next()).mo3402measureBRTryo0(j4);
                                    if (mo3402measureBRTryo0.getHeight() == 0 || mo3402measureBRTryo0.getWidth() == 0) {
                                        mo3402measureBRTryo0 = null;
                                    }
                                    if (mo3402measureBRTryo0 != null) {
                                        arrayList5.add(mo3402measureBRTryo0);
                                    }
                                }
                                java.util.ArrayList arrayList6 = arrayList5;
                                if (!(!arrayList6.isEmpty())) {
                                    fabPlacement = null;
                                } else {
                                    if (arrayList6.isEmpty()) {
                                        obj4 = null;
                                    } else {
                                        obj4 = arrayList6.get(0);
                                        int width = ((androidx.compose.ui.layout.Placeable) obj4).getWidth();
                                        int lastIndex3 = kotlin.collections.CollectionsKt.getLastIndex(arrayList6);
                                        if (1 <= lastIndex3) {
                                            int i17 = 1;
                                            while (true) {
                                                java.lang.Object obj8 = arrayList6.get(i17);
                                                int width2 = ((androidx.compose.ui.layout.Placeable) obj8).getWidth();
                                                if (width < width2) {
                                                    obj4 = obj8;
                                                    width = width2;
                                                }
                                                if (i17 == lastIndex3) {
                                                    break;
                                                } else {
                                                    i17++;
                                                }
                                            }
                                        }
                                    }
                                    kotlin.jvm.internal.Intrinsics.checkNotNull(obj4);
                                    int width3 = ((androidx.compose.ui.layout.Placeable) obj4).getWidth();
                                    if (arrayList6.isEmpty()) {
                                        obj5 = null;
                                    } else {
                                        obj5 = arrayList6.get(0);
                                        int height9 = ((androidx.compose.ui.layout.Placeable) obj5).getHeight();
                                        int lastIndex4 = kotlin.collections.CollectionsKt.getLastIndex(arrayList6);
                                        if (1 <= lastIndex4) {
                                            int i18 = 1;
                                            while (true) {
                                                java.lang.Object obj9 = arrayList6.get(i18);
                                                int height10 = ((androidx.compose.ui.layout.Placeable) obj9).getHeight();
                                                if (height9 < height10) {
                                                    height9 = height10;
                                                    obj5 = obj9;
                                                }
                                                if (i18 == lastIndex4) {
                                                    break;
                                                } else {
                                                    i18++;
                                                }
                                            }
                                        }
                                    }
                                    kotlin.jvm.internal.Intrinsics.checkNotNull(obj5);
                                    int height11 = ((androidx.compose.ui.layout.Placeable) obj5).getHeight();
                                    if (androidx.compose.material.FabPosition.m1398equalsimpl0(i8, androidx.compose.material.FabPosition.INSTANCE.m1403getEnd5ygKITE())) {
                                        if (androidx.compose.ui.layout.SubcomposeMeasureScope.this.getLayoutDirection() == androidx.compose.ui.unit.LayoutDirection.Ltr) {
                                            int i19 = m4424getMaxWidthimpl;
                                            androidx.compose.ui.layout.SubcomposeMeasureScope subcomposeMeasureScope = androidx.compose.ui.layout.SubcomposeMeasureScope.this;
                                            f4 = androidx.compose.material.ScaffoldKt.FabSpacing;
                                            i12 = (i19 - subcomposeMeasureScope.mo309roundToPx0680j_4(f4)) - width3;
                                        } else {
                                            androidx.compose.ui.layout.SubcomposeMeasureScope subcomposeMeasureScope2 = androidx.compose.ui.layout.SubcomposeMeasureScope.this;
                                            f3 = androidx.compose.material.ScaffoldKt.FabSpacing;
                                            i12 = subcomposeMeasureScope2.mo309roundToPx0680j_4(f3);
                                        }
                                    } else {
                                        i12 = (m4424getMaxWidthimpl - width3) / 2;
                                    }
                                    fabPlacement = new androidx.compose.material.FabPlacement(z3, i12, width3, height11);
                                }
                                androidx.compose.ui.layout.SubcomposeMeasureScope subcomposeMeasureScope3 = androidx.compose.ui.layout.SubcomposeMeasureScope.this;
                                androidx.compose.material.ScaffoldLayoutContent scaffoldLayoutContent = androidx.compose.material.ScaffoldLayoutContent.BottomBar;
                                final kotlin.jvm.functions.Function2<androidx.compose.runtime.Composer, java.lang.Integer, kotlin.Unit> function29 = function28;
                                final int i20 = i9;
                                java.util.List<androidx.compose.ui.layout.Measurable> subcompose4 = subcomposeMeasureScope3.subcompose(scaffoldLayoutContent, androidx.compose.runtime.internal.ComposableLambdaKt.composableLambdaInstance(1529070963, true, new kotlin.jvm.functions.Function2<androidx.compose.runtime.Composer, java.lang.Integer, kotlin.Unit>() { // from class: androidx.compose.material.ScaffoldKt$ScaffoldLayout$1$1$1$bottomBarPlaceables$1
                                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                    /* JADX WARN: Multi-variable type inference failed */
                                    {
                                        super(2);
                                    }

                                    @Override // kotlin.jvm.functions.Function2
                                    public /* bridge */ /* synthetic */ kotlin.Unit invoke(androidx.compose.runtime.Composer composer2, java.lang.Integer num2) {
                                        invoke(composer2, num2.intValue());
                                        return kotlin.Unit.INSTANCE;
                                    }

                                    public final void invoke(androidx.compose.runtime.Composer composer2, int i21) {
                                        androidx.compose.runtime.ComposerKt.sourceInformation(composer2, "C285@12279L144:Scaffold.kt#jmzs0o");
                                        if ((i21 & 11) != 2 || !composer2.getSkipping()) {
                                            androidx.compose.runtime.CompositionLocalKt.CompositionLocalProvider((androidx.compose.runtime.ProvidedValue<?>[]) new androidx.compose.runtime.ProvidedValue[]{androidx.compose.material.ScaffoldKt.getLocalFabPlacement().provides(androidx.compose.material.FabPlacement.this)}, function29, composer2, ((i20 >> 15) & 112) | 8);
                                        } else {
                                            composer2.skipToGroupEnd();
                                        }
                                    }
                                }));
                                long j5 = m4415copyZbe2FdA$default;
                                java.util.ArrayList arrayList7 = new java.util.ArrayList(subcompose4.size());
                                int size3 = subcompose4.size();
                                for (int i21 = 0; i21 < size3; i21++) {
                                    arrayList7.add(subcompose4.get(i21).mo3402measureBRTryo0(j5));
                                }
                                java.util.ArrayList arrayList8 = arrayList7;
                                if (arrayList8.isEmpty()) {
                                    obj3 = null;
                                } else {
                                    obj3 = arrayList8.get(0);
                                    int height12 = ((androidx.compose.ui.layout.Placeable) obj3).getHeight();
                                    int lastIndex5 = kotlin.collections.CollectionsKt.getLastIndex(arrayList8);
                                    if (1 <= lastIndex5) {
                                        int i22 = 1;
                                        while (true) {
                                            java.lang.Object obj10 = arrayList8.get(i22);
                                            int height13 = ((androidx.compose.ui.layout.Placeable) obj10).getHeight();
                                            if (height12 < height13) {
                                                obj3 = obj10;
                                                height12 = height13;
                                            }
                                            if (i22 == lastIndex5) {
                                                break;
                                            } else {
                                                i22++;
                                            }
                                        }
                                    }
                                }
                                androidx.compose.ui.layout.Placeable placeable3 = (androidx.compose.ui.layout.Placeable) obj3;
                                final int height14 = placeable3 != null ? placeable3.getHeight() : 0;
                                if (fabPlacement != null) {
                                    androidx.compose.ui.layout.SubcomposeMeasureScope subcomposeMeasureScope4 = androidx.compose.ui.layout.SubcomposeMeasureScope.this;
                                    boolean z4 = z3;
                                    if (height14 == 0) {
                                        height = fabPlacement.getHeight();
                                        f2 = androidx.compose.material.ScaffoldKt.FabSpacing;
                                        i11 = subcomposeMeasureScope4.mo309roundToPx0680j_4(f2);
                                    } else if (z4) {
                                        height2 = height14 + (fabPlacement.getHeight() / 2);
                                        num = java.lang.Integer.valueOf(height2);
                                    } else {
                                        height = fabPlacement.getHeight() + height14;
                                        f = androidx.compose.material.ScaffoldKt.FabSpacing;
                                        i11 = subcomposeMeasureScope4.mo309roundToPx0680j_4(f);
                                    }
                                    height2 = height + i11;
                                    num = java.lang.Integer.valueOf(height2);
                                } else {
                                    num = null;
                                }
                                if (height8 != 0) {
                                    i10 = height8 + (num != null ? num.intValue() : height14);
                                } else {
                                    i10 = 0;
                                }
                                int i23 = m4423getMaxHeightimpl - height5;
                                androidx.compose.ui.layout.SubcomposeMeasureScope subcomposeMeasureScope5 = androidx.compose.ui.layout.SubcomposeMeasureScope.this;
                                androidx.compose.material.ScaffoldLayoutContent scaffoldLayoutContent2 = androidx.compose.material.ScaffoldLayoutContent.MainContent;
                                final androidx.compose.ui.layout.SubcomposeMeasureScope subcomposeMeasureScope6 = androidx.compose.ui.layout.SubcomposeMeasureScope.this;
                                final kotlin.jvm.functions.Function3<androidx.compose.foundation.layout.PaddingValues, androidx.compose.runtime.Composer, java.lang.Integer, kotlin.Unit> function33 = function32;
                                final int i24 = i9;
                                java.util.List<androidx.compose.ui.layout.Measurable> subcompose5 = subcomposeMeasureScope5.subcompose(scaffoldLayoutContent2, androidx.compose.runtime.internal.ComposableLambdaKt.composableLambdaInstance(-1132241596, true, new kotlin.jvm.functions.Function2<androidx.compose.runtime.Composer, java.lang.Integer, kotlin.Unit>() { // from class: androidx.compose.material.ScaffoldKt$ScaffoldLayout$1$1$1$bodyContentPlaceables$1
                                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                    /* JADX WARN: Multi-variable type inference failed */
                                    {
                                        super(2);
                                    }

                                    @Override // kotlin.jvm.functions.Function2
                                    public /* bridge */ /* synthetic */ kotlin.Unit invoke(androidx.compose.runtime.Composer composer2, java.lang.Integer num2) {
                                        invoke(composer2, num2.intValue());
                                        return kotlin.Unit.INSTANCE;
                                    }

                                    public final void invoke(androidx.compose.runtime.Composer composer2, int i25) {
                                        androidx.compose.runtime.ComposerKt.sourceInformation(composer2, "C317@13701L21:Scaffold.kt#jmzs0o");
                                        if ((i25 & 11) != 2 || !composer2.getSkipping()) {
                                            function33.invoke(androidx.compose.foundation.layout.PaddingKt.m565PaddingValuesa9UjIt4$default(0.0f, 0.0f, 0.0f, androidx.compose.ui.layout.SubcomposeMeasureScope.this.mo312toDpu2uoSUM(height14), 7, null), composer2, java.lang.Integer.valueOf((i24 >> 6) & 112));
                                        } else {
                                            composer2.skipToGroupEnd();
                                        }
                                    }
                                }));
                                long j6 = m4415copyZbe2FdA$default;
                                java.util.ArrayList arrayList9 = new java.util.ArrayList(subcompose5.size());
                                int size4 = subcompose5.size();
                                int i25 = 0;
                                while (i25 < size4) {
                                    arrayList9.add(subcompose5.get(i25).mo3402measureBRTryo0(androidx.compose.ui.unit.Constraints.m4415copyZbe2FdA$default(j6, 0, 0, 0, i23, 7, null)));
                                    i25++;
                                    subcompose5 = subcompose5;
                                    size4 = size4;
                                    j6 = j6;
                                }
                                java.util.ArrayList arrayList10 = arrayList9;
                                int i26 = 0;
                                for (int size5 = arrayList10.size(); i26 < size5; size5 = size5) {
                                    androidx.compose.ui.layout.Placeable.PlacementScope.place$default(layout, (androidx.compose.ui.layout.Placeable) arrayList10.get(i26), 0, height5, 0.0f, 4, null);
                                    i26++;
                                    height14 = height14;
                                }
                                int i27 = height14;
                                int size6 = arrayList2.size();
                                for (int i28 = 0; i28 < size6; i28++) {
                                    androidx.compose.ui.layout.Placeable.PlacementScope.place$default(layout, (androidx.compose.ui.layout.Placeable) arrayList2.get(i28), 0, 0, 0.0f, 4, null);
                                }
                                int i29 = m4423getMaxHeightimpl;
                                int size7 = arrayList4.size();
                                for (int i30 = 0; i30 < size7; i30++) {
                                    androidx.compose.ui.layout.Placeable.PlacementScope.place$default(layout, (androidx.compose.ui.layout.Placeable) arrayList4.get(i30), 0, i29 - i10, 0.0f, 4, null);
                                }
                                int i31 = m4423getMaxHeightimpl;
                                int size8 = arrayList8.size();
                                for (int i32 = 0; i32 < size8; i32++) {
                                    androidx.compose.ui.layout.Placeable.PlacementScope.place$default(layout, (androidx.compose.ui.layout.Placeable) arrayList8.get(i32), 0, i31 - i27, 0.0f, 4, null);
                                }
                                if (fabPlacement != null) {
                                    int i33 = m4423getMaxHeightimpl;
                                    int size9 = arrayList6.size();
                                    for (int i34 = 0; i34 < size9; i34++) {
                                        androidx.compose.ui.layout.Placeable placeable4 = (androidx.compose.ui.layout.Placeable) arrayList6.get(i34);
                                        int left = fabPlacement.getLeft();
                                        kotlin.jvm.internal.Intrinsics.checkNotNull(num);
                                        androidx.compose.ui.layout.Placeable.PlacementScope.place$default(layout, placeable4, left, i33 - num.intValue(), 0.0f, 4, null);
                                    }
                                    kotlin.Unit unit = kotlin.Unit.INSTANCE;
                                    kotlin.Unit unit2 = kotlin.Unit.INSTANCE;
                                }
                            }
                        }, 4, null);
                    }
                };
                startRestartGroup.updateRememberedValue(rememberedValue);
            } else {
                i3 = 1;
                i4 = 0;
            }
            startRestartGroup.endReplaceableGroup();
            androidx.compose.ui.layout.SubcomposeLayoutKt.SubcomposeLayout(null, (kotlin.jvm.functions.Function2) rememberedValue, startRestartGroup, i4, i3);
        } else {
            startRestartGroup.skipToGroupEnd();
        }
        androidx.compose.runtime.ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup == null) {
            return;
        }
        endRestartGroup.updateScope(new kotlin.jvm.functions.Function2<androidx.compose.runtime.Composer, java.lang.Integer, kotlin.Unit>() { // from class: androidx.compose.material.ScaffoldKt$ScaffoldLayout$2
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

            public final void invoke(androidx.compose.runtime.Composer composer2, int i8) {
                androidx.compose.material.ScaffoldKt.m1483ScaffoldLayoutMDYNRJg(z, i, function2, function3, function22, function23, function24, composer2, i2 | 1);
            }
        });
    }

    public static final androidx.compose.runtime.ProvidableCompositionLocal<androidx.compose.material.FabPlacement> getLocalFabPlacement() {
        return LocalFabPlacement;
    }
}
