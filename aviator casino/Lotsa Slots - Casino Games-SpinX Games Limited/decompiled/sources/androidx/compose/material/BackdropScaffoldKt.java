package androidx.compose.material;

/* compiled from: BackdropScaffold.kt */
@kotlin.Metadata(d1 = {"\u0000r\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a;\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0011\u0010\u0007\u001a\r\u0012\u0004\u0012\u00020\u00040\b¢\u0006\u0002\b\t2\u0011\u0010\n\u001a\r\u0012\u0004\u0012\u00020\u00040\b¢\u0006\u0002\b\tH\u0003¢\u0006\u0002\u0010\u000b\u001aõ\u0001\u0010\f\u001a\u00020\u00042\u0011\u0010\u0007\u001a\r\u0012\u0004\u0012\u00020\u00040\b¢\u0006\u0002\b\t2\u0011\u0010\r\u001a\r\u0012\u0004\u0012\u00020\u00040\b¢\u0006\u0002\b\t2\u0011\u0010\u000e\u001a\r\u0012\u0004\u0012\u00020\u00040\b¢\u0006\u0002\b\t2\b\b\u0002\u0010\u000f\u001a\u00020\u00102\b\b\u0002\u0010\u0011\u001a\u00020\u00122\b\b\u0002\u0010\u0013\u001a\u00020\u00142\b\b\u0002\u0010\u0015\u001a\u00020\u00012\b\b\u0002\u0010\u0016\u001a\u00020\u00012\b\b\u0002\u0010\u0017\u001a\u00020\u00142\b\b\u0002\u0010\u0018\u001a\u00020\u00142\b\b\u0002\u0010\u0019\u001a\u00020\u001a2\b\b\u0002\u0010\u001b\u001a\u00020\u001a2\b\b\u0002\u0010\u001c\u001a\u00020\u001d2\b\b\u0002\u0010\u001e\u001a\u00020\u00012\b\b\u0002\u0010\u001f\u001a\u00020\u001a2\b\b\u0002\u0010 \u001a\u00020\u001a2\b\b\u0002\u0010!\u001a\u00020\u001a2\u0019\b\u0002\u0010\"\u001a\u0013\u0012\u0004\u0012\u00020$\u0012\u0004\u0012\u00020\u00040#¢\u0006\u0002\b\tH\u0007ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b%\u0010&\u001ah\u0010'\u001a\u00020\u00042\u0006\u0010\u000f\u001a\u00020\u00102\u0016\u0010(\u001a\u0012\u0012\u0004\u0012\u00020\u00040\b¢\u0006\u0002\b\t¢\u0006\u0002\b)2\u0012\u0010*\u001a\u000e\u0012\u0004\u0012\u00020+\u0012\u0004\u0012\u00020+0#2\"\u0010,\u001a\u001e\u0012\u0004\u0012\u00020+\u0012\u0004\u0012\u00020.\u0012\u0004\u0012\u00020\u00040-¢\u0006\u0002\b\t¢\u0006\u0002\b)H\u0003ø\u0001\u0000¢\u0006\u0002\u0010/\u001a3\u00100\u001a\u00020\u00042\u0006\u00101\u001a\u00020\u001a2\f\u00102\u001a\b\u0012\u0004\u0012\u00020\u00040\b2\u0006\u00103\u001a\u00020\u0014H\u0003ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b4\u00105\u001aE\u00106\u001a\u00020\u00122\u0006\u00107\u001a\u00020\u00062\u000e\b\u0002\u00108\u001a\b\u0012\u0004\u0012\u00020.092\u0014\b\u0002\u0010:\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00140#2\b\b\u0002\u0010;\u001a\u00020$H\u0007¢\u0006\u0002\u0010<\"\u0013\u0010\u0000\u001a\u00020\u0001X\u0082\u0004ø\u0001\u0000¢\u0006\u0004\n\u0002\u0010\u0002\u0082\u0002\u000b\n\u0002\b\u0019\n\u0005\b¡\u001e0\u0001¨\u0006="}, d2 = {"AnimationSlideOffset", "Landroidx/compose/ui/unit/Dp;", "F", "BackLayerTransition", "", "target", "Landroidx/compose/material/BackdropValue;", "appBar", "Lkotlin/Function0;", "Landroidx/compose/runtime/Composable;", "content", "(Landroidx/compose/material/BackdropValue;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;Landroidx/compose/runtime/Composer;I)V", "BackdropScaffold", "backLayerContent", "frontLayerContent", "modifier", "Landroidx/compose/ui/Modifier;", "scaffoldState", "Landroidx/compose/material/BackdropScaffoldState;", "gesturesEnabled", "", "peekHeight", "headerHeight", "persistentAppBar", "stickyFrontLayer", "backLayerBackgroundColor", "Landroidx/compose/ui/graphics/Color;", "backLayerContentColor", "frontLayerShape", "Landroidx/compose/ui/graphics/Shape;", "frontLayerElevation", "frontLayerBackgroundColor", "frontLayerContentColor", "frontLayerScrimColor", "snackbarHost", "Lkotlin/Function1;", "Landroidx/compose/material/SnackbarHostState;", "BackdropScaffold-BZszfkY", "(Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;Landroidx/compose/ui/Modifier;Landroidx/compose/material/BackdropScaffoldState;ZFFZZJJLandroidx/compose/ui/graphics/Shape;FJJJLkotlin/jvm/functions/Function3;Landroidx/compose/runtime/Composer;III)V", "BackdropStack", "backLayer", "Landroidx/compose/ui/UiComposable;", "calculateBackLayerConstraints", "Landroidx/compose/ui/unit/Constraints;", "frontLayer", "Lkotlin/Function2;", "", "(Landroidx/compose/ui/Modifier;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function4;Landroidx/compose/runtime/Composer;I)V", "Scrim", "color", "onDismiss", com.helpshift.HelpshiftEvent.DATA_SDK_VISIBLE, "Scrim-3J-VO9M", "(JLkotlin/jvm/functions/Function0;ZLandroidx/compose/runtime/Composer;I)V", "rememberBackdropScaffoldState", "initialValue", "animationSpec", "Landroidx/compose/animation/core/AnimationSpec;", "confirmStateChange", "snackbarHostState", "(Landroidx/compose/material/BackdropValue;Landroidx/compose/animation/core/AnimationSpec;Lkotlin/jvm/functions/Function1;Landroidx/compose/material/SnackbarHostState;Landroidx/compose/runtime/Composer;II)Landroidx/compose/material/BackdropScaffoldState;", "material_release"}, k = 2, mv = {1, 6, 0}, xi = 48)
/* loaded from: classes.dex */
public final class BackdropScaffoldKt {
    private static final float AnimationSlideOffset = androidx.compose.ui.unit.Dp.m4478constructorimpl(20);

    @androidx.compose.material.ExperimentalMaterialApi
    public static final androidx.compose.material.BackdropScaffoldState rememberBackdropScaffoldState(final androidx.compose.material.BackdropValue initialValue, final androidx.compose.animation.core.AnimationSpec<java.lang.Float> animationSpec, final kotlin.jvm.functions.Function1<? super androidx.compose.material.BackdropValue, java.lang.Boolean> function1, final androidx.compose.material.SnackbarHostState snackbarHostState, androidx.compose.runtime.Composer composer, int i, int i2) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(initialValue, "initialValue");
        composer.startReplaceableGroup(-862178912);
        androidx.compose.runtime.ComposerKt.sourceInformation(composer, "C(rememberBackdropScaffoldState)P(2)171@6447L32,173@6518L538:BackdropScaffold.kt#jmzs0o");
        if ((i2 & 2) != 0) {
            animationSpec = androidx.compose.material.SwipeableDefaults.INSTANCE.getAnimationSpec();
        }
        if ((i2 & 4) != 0) {
            function1 = new kotlin.jvm.functions.Function1<androidx.compose.material.BackdropValue, java.lang.Boolean>() { // from class: androidx.compose.material.BackdropScaffoldKt$rememberBackdropScaffoldState$1
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Boolean invoke(androidx.compose.material.BackdropValue it) {
                    kotlin.jvm.internal.Intrinsics.checkNotNullParameter(it, "it");
                    return true;
                }
            };
        }
        if ((i2 & 8) != 0) {
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
        androidx.compose.material.BackdropScaffoldState backdropScaffoldState = (androidx.compose.material.BackdropScaffoldState) androidx.compose.runtime.saveable.RememberSaveableKt.m1729rememberSaveable(new java.lang.Object[]{animationSpec, function1, snackbarHostState}, (androidx.compose.runtime.saveable.Saver) androidx.compose.material.BackdropScaffoldState.INSTANCE.Saver(animationSpec, function1, snackbarHostState), (java.lang.String) null, (kotlin.jvm.functions.Function0) new kotlin.jvm.functions.Function0<androidx.compose.material.BackdropScaffoldState>() { // from class: androidx.compose.material.BackdropScaffoldKt$rememberBackdropScaffoldState$3
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            {
                super(0);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // kotlin.jvm.functions.Function0
            public final androidx.compose.material.BackdropScaffoldState invoke() {
                return new androidx.compose.material.BackdropScaffoldState(androidx.compose.material.BackdropValue.this, animationSpec, function1, snackbarHostState);
            }
        }, composer, 72, 4);
        composer.endReplaceableGroup();
        return backdropScaffoldState;
    }

    /* JADX WARN: Code restructure failed: missing block: B:61:0x01a6, code lost:
    
        if (r12.changed(r8) != false) goto L136;
     */
    /* JADX WARN: Removed duplicated region for block: B:104:0x051e  */
    /* JADX WARN: Removed duplicated region for block: B:107:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:110:0x0283  */
    /* JADX WARN: Removed duplicated region for block: B:136:0x0482  */
    /* JADX WARN: Removed duplicated region for block: B:141:0x02df  */
    /* JADX WARN: Removed duplicated region for block: B:144:0x02e9  */
    /* JADX WARN: Removed duplicated region for block: B:146:0x031a  */
    /* JADX WARN: Removed duplicated region for block: B:148:0x0320  */
    /* JADX WARN: Removed duplicated region for block: B:150:0x032b  */
    /* JADX WARN: Removed duplicated region for block: B:152:0x0336  */
    /* JADX WARN: Removed duplicated region for block: B:154:0x033c  */
    /* JADX WARN: Removed duplicated region for block: B:157:0x0344  */
    /* JADX WARN: Removed duplicated region for block: B:160:0x0361  */
    /* JADX WARN: Removed duplicated region for block: B:163:0x0372  */
    /* JADX WARN: Removed duplicated region for block: B:165:0x0384  */
    /* JADX WARN: Removed duplicated region for block: B:168:0x0393  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x009a  */
    /* JADX WARN: Removed duplicated region for block: B:171:0x03ab  */
    /* JADX WARN: Removed duplicated region for block: B:174:0x03c2  */
    /* JADX WARN: Removed duplicated region for block: B:176:0x03d6  */
    /* JADX WARN: Removed duplicated region for block: B:178:0x03f8  */
    /* JADX WARN: Removed duplicated region for block: B:179:0x03d0  */
    /* JADX WARN: Removed duplicated region for block: B:180:0x03ba  */
    /* JADX WARN: Removed duplicated region for block: B:181:0x03a3  */
    /* JADX WARN: Removed duplicated region for block: B:182:0x038b  */
    /* JADX WARN: Removed duplicated region for block: B:183:0x037e  */
    /* JADX WARN: Removed duplicated region for block: B:184:0x036a  */
    /* JADX WARN: Removed duplicated region for block: B:185:0x0358  */
    /* JADX WARN: Removed duplicated region for block: B:186:0x033e  */
    /* JADX WARN: Removed duplicated region for block: B:187:0x0338  */
    /* JADX WARN: Removed duplicated region for block: B:188:0x0332  */
    /* JADX WARN: Removed duplicated region for block: B:189:0x0327  */
    /* JADX WARN: Removed duplicated region for block: B:190:0x031c  */
    /* JADX WARN: Removed duplicated region for block: B:191:0x030d  */
    /* JADX WARN: Removed duplicated region for block: B:192:0x02e4  */
    /* JADX WARN: Removed duplicated region for block: B:193:0x022a  */
    /* JADX WARN: Removed duplicated region for block: B:201:0x021d  */
    /* JADX WARN: Removed duplicated region for block: B:203:0x0203  */
    /* JADX WARN: Removed duplicated region for block: B:204:0x01e6  */
    /* JADX WARN: Removed duplicated region for block: B:205:0x01b8  */
    /* JADX WARN: Removed duplicated region for block: B:213:0x01af  */
    /* JADX WARN: Removed duplicated region for block: B:215:0x0196  */
    /* JADX WARN: Removed duplicated region for block: B:217:0x017b  */
    /* JADX WARN: Removed duplicated region for block: B:218:0x0147  */
    /* JADX WARN: Removed duplicated region for block: B:225:0x0122  */
    /* JADX WARN: Removed duplicated region for block: B:232:0x00fd  */
    /* JADX WARN: Removed duplicated region for block: B:239:0x00df  */
    /* JADX WARN: Removed duplicated region for block: B:246:0x00bf  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x00b8  */
    /* JADX WARN: Removed duplicated region for block: B:254:0x00ae  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x00d8  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x00f8  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x011d  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0142  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0167  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x0182  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x019c  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x01b5  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x01d5  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x01f0  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x020a  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x0223  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x0248  */
    @androidx.compose.material.ExperimentalMaterialApi
    /* renamed from: BackdropScaffold-BZszfkY, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void m1232BackdropScaffoldBZszfkY(final kotlin.jvm.functions.Function2<? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.Unit> appBar, final kotlin.jvm.functions.Function2<? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.Unit> backLayerContent, final kotlin.jvm.functions.Function2<? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.Unit> frontLayerContent, androidx.compose.ui.Modifier modifier, androidx.compose.material.BackdropScaffoldState backdropScaffoldState, boolean z, float f, float f2, boolean z2, boolean z3, long j, long j2, androidx.compose.ui.graphics.Shape shape, float f3, long j3, long j4, long j5, kotlin.jvm.functions.Function3<? super androidx.compose.material.SnackbarHostState, ? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.Unit> function3, androidx.compose.runtime.Composer composer, final int i, final int i2, final int i3) {
        int i4;
        final androidx.compose.ui.Modifier modifier2;
        final androidx.compose.material.BackdropScaffoldState backdropScaffoldState2;
        int i5;
        int i6;
        int i7;
        int i8;
        int i9;
        int i10;
        int i11;
        int i12;
        int i13;
        androidx.compose.ui.graphics.Shape shape2;
        int i14;
        int i15;
        kotlin.jvm.functions.Function3<? super androidx.compose.material.SnackbarHostState, ? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.Unit> function32;
        androidx.compose.ui.Modifier modifier3;
        int i16;
        int i17;
        int i18;
        int i19;
        int i20;
        long j6;
        long j7;
        int i21;
        androidx.compose.ui.graphics.Shape shape3;
        float f4;
        long j8;
        boolean z4;
        long j9;
        long j10;
        long j11;
        androidx.compose.ui.Modifier modifier4;
        androidx.compose.ui.graphics.Shape shape4;
        float f5;
        kotlin.jvm.functions.Function3<? super androidx.compose.material.SnackbarHostState, ? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.Unit> function33;
        boolean z5;
        int i22;
        long j12;
        androidx.compose.material.BackdropScaffoldState backdropScaffoldState3;
        boolean z6;
        boolean z7;
        long j13;
        long j14;
        long j15;
        long j16;
        int i23;
        float f6;
        float f7;
        boolean changed;
        java.lang.Object rememberedValue;
        androidx.compose.runtime.Composer composer2;
        final boolean z8;
        final boolean z9;
        final boolean z10;
        final androidx.compose.ui.graphics.Shape shape5;
        final long j17;
        final long j18;
        final float f8;
        final long j19;
        final long j20;
        final long j21;
        final kotlin.jvm.functions.Function3<? super androidx.compose.material.SnackbarHostState, ? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.Unit> function34;
        final float f9;
        final float f10;
        androidx.compose.runtime.ScopeUpdateScope endRestartGroup;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(appBar, "appBar");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(backLayerContent, "backLayerContent");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(frontLayerContent, "frontLayerContent");
        androidx.compose.runtime.Composer startRestartGroup = composer.startRestartGroup(1397420093);
        androidx.compose.runtime.ComposerKt.sourceInformation(startRestartGroup, "C(BackdropScaffold)P(!1,2,5,12,15,10,13:c#ui.unit.Dp,11:c#ui.unit.Dp,14,17,1:c#ui.graphics.Color,3:c#ui.graphics.Color,9,7:c#ui.unit.Dp,4:c#ui.graphics.Color,6:c#ui.graphics.Color,8:c#ui.graphics.Color)260@11766L40,266@12093L6,267@12144L41,268@12241L15,270@12387L6,271@12439L42,272@12542L20,*275@12690L7,276@12764L7,288@13147L100,293@13271L3282:BackdropScaffold.kt#jmzs0o");
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
                i4 |= androidx.profileinstaller.ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE;
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
                    i4 |= startRestartGroup.changed(z2) ? androidx.core.view.accessibility.AccessibilityEventCompat.TYPE_VIEW_TARGETED_BY_SCROLL : 33554432;
                    i11 = i3 & 512;
                    if (i11 == 0) {
                        i4 |= 805306368;
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
                                    androidx.compose.ui.Modifier.Companion companion = i25 == 0 ? androidx.compose.ui.Modifier.INSTANCE : modifier2;
                                    if ((i3 & 16) == 0) {
                                        i16 = i14;
                                        modifier3 = companion;
                                        i17 = i8;
                                        i18 = i10;
                                        i19 = i12;
                                        i4 &= -57345;
                                        backdropScaffoldState2 = rememberBackdropScaffoldState(androidx.compose.material.BackdropValue.Concealed, null, null, null, startRestartGroup, 6, 14);
                                    } else {
                                        modifier3 = companion;
                                        i16 = i14;
                                        i17 = i8;
                                        i18 = i10;
                                        i19 = i12;
                                    }
                                    boolean z11 = i5 == 0 ? true : z;
                                    float m1230getPeekHeightD9Ej5fM = i6 == 0 ? androidx.compose.material.BackdropScaffoldDefaults.INSTANCE.m1230getPeekHeightD9Ej5fM() : f;
                                    float m1229getHeaderHeightD9Ej5fM = i17 == 0 ? androidx.compose.material.BackdropScaffoldDefaults.INSTANCE.m1229getHeaderHeightD9Ej5fM() : f2;
                                    boolean z12 = i18 == 0 ? true : z2;
                                    boolean z13 = i19 == 0 ? true : z3;
                                    if ((i3 & 1024) == 0) {
                                        i20 = i27 & (-15);
                                        j6 = androidx.compose.material.MaterialTheme.INSTANCE.getColors(startRestartGroup, 6).m1315getPrimary0d7_KjU();
                                    } else {
                                        i20 = i27;
                                        j6 = j;
                                    }
                                    if ((i3 & 2048) == 0) {
                                        j7 = androidx.compose.material.ColorsKt.m1333contentColorForek8zF_U(j6, startRestartGroup, i20 & 14);
                                        i20 &= -113;
                                    } else {
                                        j7 = j2;
                                    }
                                    int i28 = i20;
                                    if ((i3 & 4096) == 0) {
                                        i21 = i4;
                                        shape3 = androidx.compose.material.BackdropScaffoldDefaults.INSTANCE.getFrontLayerShape(startRestartGroup, 6);
                                        i28 &= -897;
                                    } else {
                                        i21 = i4;
                                        shape3 = shape;
                                    }
                                    float m1228getFrontLayerElevationD9Ej5fM = i16 == 0 ? androidx.compose.material.BackdropScaffoldDefaults.INSTANCE.m1228getFrontLayerElevationD9Ej5fM() : f3;
                                    androidx.compose.ui.graphics.Shape shape6 = shape3;
                                    if ((i3 & 16384) == 0) {
                                        f4 = m1228getFrontLayerElevationD9Ej5fM;
                                        j8 = androidx.compose.material.MaterialTheme.INSTANCE.getColors(startRestartGroup, 6).m1319getSurface0d7_KjU();
                                        i28 &= -57345;
                                    } else {
                                        f4 = m1228getFrontLayerElevationD9Ej5fM;
                                        j8 = j3;
                                    }
                                    if ((i3 & 32768) == 0) {
                                        z4 = z11;
                                        j9 = androidx.compose.material.ColorsKt.m1333contentColorForek8zF_U(j8, startRestartGroup, (i28 >> 12) & 14);
                                        i28 &= -458753;
                                    } else {
                                        z4 = z11;
                                        j9 = j4;
                                    }
                                    if ((i3 & 65536) == 0) {
                                        j10 = j8;
                                        j11 = androidx.compose.material.BackdropScaffoldDefaults.INSTANCE.getFrontLayerScrimColor(startRestartGroup, 6);
                                        i28 &= -3670017;
                                    } else {
                                        j10 = j8;
                                        j11 = j5;
                                    }
                                    if (i15 == 0) {
                                        shape4 = shape6;
                                        f5 = f4;
                                        z5 = z4;
                                        function33 = androidx.compose.material.ComposableSingletons$BackdropScaffoldKt.INSTANCE.m1339getLambda1$material_release();
                                        i22 = i28;
                                        j12 = j11;
                                        backdropScaffoldState3 = backdropScaffoldState2;
                                        z6 = z12;
                                        z7 = z13;
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
                                        z5 = z4;
                                        i22 = i28;
                                        j12 = j11;
                                        backdropScaffoldState3 = backdropScaffoldState2;
                                        z6 = z12;
                                        z7 = z13;
                                        j13 = j6;
                                        j14 = j9;
                                        j15 = j7;
                                        j16 = j10;
                                    }
                                    i23 = i21;
                                    f6 = m1230getPeekHeightD9Ej5fM;
                                    f7 = m1229getHeaderHeightD9Ej5fM;
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
                                    z5 = z;
                                    f7 = f2;
                                    z6 = z2;
                                    z7 = z3;
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
                                androidx.compose.runtime.ProvidableCompositionLocal<androidx.compose.ui.unit.Density> localDensity = androidx.compose.ui.platform.CompositionLocalsKt.getLocalDensity();
                                androidx.compose.runtime.ComposerKt.sourceInformationMarkerStart(startRestartGroup, 2023513938, "C:CompositionLocal.kt#9igjgp");
                                java.lang.Object consume = startRestartGroup.consume(localDensity);
                                androidx.compose.runtime.ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                                final float mo315toPx0680j_4 = ((androidx.compose.ui.unit.Density) consume).mo315toPx0680j_4(f6);
                                androidx.compose.runtime.ProvidableCompositionLocal<androidx.compose.ui.unit.Density> localDensity2 = androidx.compose.ui.platform.CompositionLocalsKt.getLocalDensity();
                                androidx.compose.runtime.ComposerKt.sourceInformationMarkerStart(startRestartGroup, 2023513938, "C:CompositionLocal.kt#9igjgp");
                                java.lang.Object consume2 = startRestartGroup.consume(localDensity2);
                                androidx.compose.runtime.ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                                final float mo315toPx0680j_42 = ((androidx.compose.ui.unit.Density) consume2).mo315toPx0680j_4(f7);
                                final boolean z14 = z6;
                                final androidx.compose.material.BackdropScaffoldState backdropScaffoldState4 = backdropScaffoldState3;
                                final int i29 = i23;
                                final androidx.compose.runtime.internal.ComposableLambda composableLambda = androidx.compose.runtime.internal.ComposableLambdaKt.composableLambda(startRestartGroup, 1744778315, true, new kotlin.jvm.functions.Function2<androidx.compose.runtime.Composer, java.lang.Integer, kotlin.Unit>() { // from class: androidx.compose.material.BackdropScaffoldKt$BackdropScaffold$backLayer$1
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

                                    public final void invoke(androidx.compose.runtime.Composer composer3, int i30) {
                                        androidx.compose.runtime.ComposerKt.sourceInformation(composer3, "C:BackdropScaffold.kt#jmzs0o");
                                        if ((i30 & 11) != 2 || !composer3.getSkipping()) {
                                            if (z14) {
                                                composer3.startReplaceableGroup(-1017265331);
                                                androidx.compose.runtime.ComposerKt.sourceInformation(composer3, "280@12876L82");
                                                kotlin.jvm.functions.Function2<androidx.compose.runtime.Composer, java.lang.Integer, kotlin.Unit> function2 = appBar;
                                                int i31 = i29;
                                                kotlin.jvm.functions.Function2<androidx.compose.runtime.Composer, java.lang.Integer, kotlin.Unit> function22 = backLayerContent;
                                                composer3.startReplaceableGroup(-483455358);
                                                androidx.compose.runtime.ComposerKt.sourceInformation(composer3, "C(Column)P(2,3,1)77@3880L61,78@3946L133:Column.kt#2w3rfo");
                                                androidx.compose.ui.Modifier.Companion companion2 = androidx.compose.ui.Modifier.INSTANCE;
                                                androidx.compose.ui.layout.MeasurePolicy columnMeasurePolicy = androidx.compose.foundation.layout.ColumnKt.columnMeasurePolicy(androidx.compose.foundation.layout.Arrangement.INSTANCE.getTop(), androidx.compose.ui.Alignment.INSTANCE.getStart(), composer3, 0);
                                                composer3.startReplaceableGroup(-1323940314);
                                                androidx.compose.runtime.ComposerKt.sourceInformation(composer3, "C(Layout)P(!1,2)74@2915L7,75@2970L7,76@3029L7,77@3041L460:Layout.kt#80mrfh");
                                                androidx.compose.runtime.ProvidableCompositionLocal<androidx.compose.ui.unit.Density> localDensity3 = androidx.compose.ui.platform.CompositionLocalsKt.getLocalDensity();
                                                androidx.compose.runtime.ComposerKt.sourceInformationMarkerStart(composer3, 2023513938, "C:CompositionLocal.kt#9igjgp");
                                                java.lang.Object consume3 = composer3.consume(localDensity3);
                                                androidx.compose.runtime.ComposerKt.sourceInformationMarkerEnd(composer3);
                                                androidx.compose.ui.unit.Density density = (androidx.compose.ui.unit.Density) consume3;
                                                androidx.compose.runtime.ProvidableCompositionLocal<androidx.compose.ui.unit.LayoutDirection> localLayoutDirection = androidx.compose.ui.platform.CompositionLocalsKt.getLocalLayoutDirection();
                                                androidx.compose.runtime.ComposerKt.sourceInformationMarkerStart(composer3, 2023513938, "C:CompositionLocal.kt#9igjgp");
                                                java.lang.Object consume4 = composer3.consume(localLayoutDirection);
                                                androidx.compose.runtime.ComposerKt.sourceInformationMarkerEnd(composer3);
                                                androidx.compose.ui.unit.LayoutDirection layoutDirection = (androidx.compose.ui.unit.LayoutDirection) consume4;
                                                androidx.compose.runtime.ProvidableCompositionLocal<androidx.compose.ui.platform.ViewConfiguration> localViewConfiguration = androidx.compose.ui.platform.CompositionLocalsKt.getLocalViewConfiguration();
                                                androidx.compose.runtime.ComposerKt.sourceInformationMarkerStart(composer3, 2023513938, "C:CompositionLocal.kt#9igjgp");
                                                java.lang.Object consume5 = composer3.consume(localViewConfiguration);
                                                androidx.compose.runtime.ComposerKt.sourceInformationMarkerEnd(composer3);
                                                androidx.compose.ui.platform.ViewConfiguration viewConfiguration = (androidx.compose.ui.platform.ViewConfiguration) consume5;
                                                kotlin.jvm.functions.Function0<androidx.compose.ui.node.ComposeUiNode> constructor = androidx.compose.ui.node.ComposeUiNode.INSTANCE.getConstructor();
                                                kotlin.jvm.functions.Function3<androidx.compose.runtime.SkippableUpdater<androidx.compose.ui.node.ComposeUiNode>, androidx.compose.runtime.Composer, java.lang.Integer, kotlin.Unit> materializerOf = androidx.compose.ui.layout.LayoutKt.materializerOf(companion2);
                                                if (!(composer3.getApplier() instanceof androidx.compose.runtime.Applier)) {
                                                    androidx.compose.runtime.ComposablesKt.invalidApplier();
                                                }
                                                composer3.startReusableNode();
                                                if (composer3.getInserting()) {
                                                    composer3.createNode(constructor);
                                                } else {
                                                    composer3.useNode();
                                                }
                                                composer3.disableReusing();
                                                androidx.compose.runtime.Composer m1641constructorimpl = androidx.compose.runtime.Updater.m1641constructorimpl(composer3);
                                                androidx.compose.runtime.Updater.m1648setimpl(m1641constructorimpl, columnMeasurePolicy, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetMeasurePolicy());
                                                androidx.compose.runtime.Updater.m1648setimpl(m1641constructorimpl, density, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetDensity());
                                                androidx.compose.runtime.Updater.m1648setimpl(m1641constructorimpl, layoutDirection, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetLayoutDirection());
                                                androidx.compose.runtime.Updater.m1648setimpl(m1641constructorimpl, viewConfiguration, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetViewConfiguration());
                                                composer3.enableReusing();
                                                materializerOf.invoke(androidx.compose.runtime.SkippableUpdater.m1632boximpl(androidx.compose.runtime.SkippableUpdater.m1633constructorimpl(composer3)), composer3, 0);
                                                composer3.startReplaceableGroup(2058660585);
                                                composer3.startReplaceableGroup(-1163856341);
                                                androidx.compose.runtime.ComposerKt.sourceInformation(composer3, "C79@3994L9:Column.kt#2w3rfo");
                                                androidx.compose.foundation.layout.ColumnScopeInstance columnScopeInstance = androidx.compose.foundation.layout.ColumnScopeInstance.INSTANCE;
                                                composer3.startReplaceableGroup(-18835878);
                                                androidx.compose.runtime.ComposerKt.sourceInformation(composer3, "C281@12901L8,282@12926L18:BackdropScaffold.kt#jmzs0o");
                                                function2.invoke(composer3, java.lang.Integer.valueOf(i31 & 14));
                                                function22.invoke(composer3, java.lang.Integer.valueOf((i31 >> 3) & 14));
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
                                            androidx.compose.runtime.ComposerKt.sourceInformation(composer3, "285@12988L72");
                                            androidx.compose.material.BackdropValue targetValue = backdropScaffoldState4.getTargetValue();
                                            kotlin.jvm.functions.Function2<androidx.compose.runtime.Composer, java.lang.Integer, kotlin.Unit> function23 = appBar;
                                            kotlin.jvm.functions.Function2<androidx.compose.runtime.Composer, java.lang.Integer, kotlin.Unit> function24 = backLayerContent;
                                            int i32 = i29;
                                            androidx.compose.material.BackdropScaffoldKt.BackLayerTransition(targetValue, function23, function24, composer3, ((i32 << 3) & 896) | ((i32 << 3) & 112));
                                            composer3.endReplaceableGroup();
                                            return;
                                        }
                                        composer3.skipToGroupEnd();
                                    }
                                });
                                java.lang.Float valueOf = java.lang.Float.valueOf(mo315toPx0680j_42);
                                startRestartGroup.startReplaceableGroup(1157296644);
                                androidx.compose.runtime.ComposerKt.sourceInformation(startRestartGroup, "C(remember)P(1):Composables.kt#9igjgp");
                                changed = startRestartGroup.changed(valueOf);
                                rememberedValue = startRestartGroup.rememberedValue();
                                if (!changed || rememberedValue == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                                    rememberedValue = (kotlin.jvm.functions.Function1) new kotlin.jvm.functions.Function1<androidx.compose.ui.unit.Constraints, androidx.compose.ui.unit.Constraints>() { // from class: androidx.compose.material.BackdropScaffoldKt$BackdropScaffold$calculateBackLayerConstraints$1$1
                                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                        {
                                            super(1);
                                        }

                                        @Override // kotlin.jvm.functions.Function1
                                        public /* bridge */ /* synthetic */ androidx.compose.ui.unit.Constraints invoke(androidx.compose.ui.unit.Constraints constraints) {
                                            return androidx.compose.ui.unit.Constraints.m4412boximpl(m1239invokeZezNO4M(constraints.getValue()));
                                        }

                                        /* renamed from: invoke-ZezNO4M, reason: not valid java name */
                                        public final long m1239invokeZezNO4M(long j22) {
                                            return androidx.compose.ui.unit.ConstraintsKt.m4441offsetNN6EwU$default(androidx.compose.ui.unit.Constraints.m4415copyZbe2FdA$default(j22, 0, 0, 0, 0, 10, null), 0, -kotlin.math.MathKt.roundToInt(mo315toPx0680j_42), 1, null);
                                        }
                                    };
                                    startRestartGroup.updateRememberedValue(rememberedValue);
                                }
                                startRestartGroup.endReplaceableGroup();
                                final kotlin.jvm.functions.Function1 function1 = (kotlin.jvm.functions.Function1) rememberedValue;
                                final androidx.compose.ui.Modifier modifier5 = modifier4;
                                final boolean z15 = z7;
                                final boolean z16 = z5;
                                final float f11 = f7;
                                final androidx.compose.material.BackdropScaffoldState backdropScaffoldState5 = backdropScaffoldState3;
                                final float f12 = f6;
                                androidx.compose.material.BackdropScaffoldState backdropScaffoldState6 = backdropScaffoldState3;
                                composer2 = startRestartGroup;
                                final int i30 = i23;
                                final androidx.compose.ui.graphics.Shape shape7 = shape4;
                                final long j22 = j16;
                                final long j23 = j14;
                                final float f13 = f5;
                                final int i31 = i22;
                                final long j24 = j12;
                                final kotlin.jvm.functions.Function3<? super androidx.compose.material.SnackbarHostState, ? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.Unit> function35 = function33;
                                int i32 = i22 << 6;
                                androidx.compose.material.SurfaceKt.m1511SurfaceFjzlyU(null, null, j13, j15, null, 0.0f, androidx.compose.runtime.internal.ComposableLambdaKt.composableLambda(composer2, -1049909631, true, new kotlin.jvm.functions.Function2<androidx.compose.runtime.Composer, java.lang.Integer, kotlin.Unit>() { // from class: androidx.compose.material.BackdropScaffoldKt$BackdropScaffold$1
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

                                    public final void invoke(androidx.compose.runtime.Composer composer3, int i33) {
                                        androidx.compose.runtime.ComposerKt.sourceInformation(composer3, "C297@13395L24,298@13428L3119:BackdropScaffold.kt#jmzs0o");
                                        if ((i33 & 11) != 2 || !composer3.getSkipping()) {
                                            composer3.startReplaceableGroup(773894976);
                                            androidx.compose.runtime.ComposerKt.sourceInformation(composer3, "C(rememberCoroutineScope)475@19849L144:Effects.kt#9igjgp");
                                            composer3.startReplaceableGroup(-492369756);
                                            androidx.compose.runtime.ComposerKt.sourceInformation(composer3, "C(remember):Composables.kt#9igjgp");
                                            java.lang.Object rememberedValue2 = composer3.rememberedValue();
                                            if (rememberedValue2 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                                                androidx.compose.runtime.CompositionScopedCoroutineScopeCanceller compositionScopedCoroutineScopeCanceller = new androidx.compose.runtime.CompositionScopedCoroutineScopeCanceller(androidx.compose.runtime.EffectsKt.createCompositionCoroutineScope(kotlin.coroutines.EmptyCoroutineContext.INSTANCE, composer3));
                                                composer3.updateRememberedValue(compositionScopedCoroutineScopeCanceller);
                                                rememberedValue2 = compositionScopedCoroutineScopeCanceller;
                                            }
                                            composer3.endReplaceableGroup();
                                            final kotlinx.coroutines.CoroutineScope coroutineScope = ((androidx.compose.runtime.CompositionScopedCoroutineScopeCanceller) rememberedValue2).getCoroutineScope();
                                            composer3.endReplaceableGroup();
                                            androidx.compose.ui.Modifier fillMaxSize$default = androidx.compose.foundation.layout.SizeKt.fillMaxSize$default(androidx.compose.ui.Modifier.this, 0.0f, 1, null);
                                            kotlin.jvm.functions.Function2<androidx.compose.runtime.Composer, java.lang.Integer, kotlin.Unit> function2 = composableLambda;
                                            kotlin.jvm.functions.Function1<androidx.compose.ui.unit.Constraints, androidx.compose.ui.unit.Constraints> function12 = function1;
                                            final float f14 = mo315toPx0680j_42;
                                            final boolean z17 = z15;
                                            final boolean z18 = z16;
                                            final androidx.compose.material.BackdropScaffoldState backdropScaffoldState7 = backdropScaffoldState5;
                                            final float f15 = mo315toPx0680j_4;
                                            final int i34 = i30;
                                            final androidx.compose.ui.graphics.Shape shape8 = shape7;
                                            final long j25 = j22;
                                            final long j26 = j23;
                                            final float f16 = f13;
                                            final int i35 = i31;
                                            final float f17 = f11;
                                            final float f18 = f12;
                                            final kotlin.jvm.functions.Function2<androidx.compose.runtime.Composer, java.lang.Integer, kotlin.Unit> function22 = frontLayerContent;
                                            final long j27 = j24;
                                            final kotlin.jvm.functions.Function3<androidx.compose.material.SnackbarHostState, androidx.compose.runtime.Composer, java.lang.Integer, kotlin.Unit> function36 = function35;
                                            androidx.compose.material.BackdropScaffoldKt.BackdropStack(fillMaxSize$default, function2, function12, androidx.compose.runtime.internal.ComposableLambdaKt.composableLambda(composer3, 1800047509, true, new kotlin.jvm.functions.Function4<androidx.compose.ui.unit.Constraints, java.lang.Float, androidx.compose.runtime.Composer, java.lang.Integer, kotlin.Unit>() { // from class: androidx.compose.material.BackdropScaffoldKt$BackdropScaffold$1.1
                                                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                                /* JADX WARN: Multi-variable type inference failed */
                                                {
                                                    super(4);
                                                }

                                                @Override // kotlin.jvm.functions.Function4
                                                public /* bridge */ /* synthetic */ kotlin.Unit invoke(androidx.compose.ui.unit.Constraints constraints, java.lang.Float f19, androidx.compose.runtime.Composer composer4, java.lang.Integer num) {
                                                    m1237invokejYbf7pk(constraints.getValue(), f19.floatValue(), composer4, num.intValue());
                                                    return kotlin.Unit.INSTANCE;
                                                }

                                                /* renamed from: invoke-jYbf7pk, reason: not valid java name */
                                                public final void m1237invokejYbf7pk(long j28, float f19, androidx.compose.runtime.Composer composer4, int i36) {
                                                    int i37;
                                                    androidx.compose.ui.Modifier.Companion companion2;
                                                    androidx.compose.ui.Modifier m1521swipeablepPrIpRY;
                                                    float m4478constructorimpl;
                                                    androidx.compose.runtime.ComposerKt.sourceInformation(composer4, "CP(1:c#ui.unit.Constraints)344@15194L57,342@15132L942,366@16117L420:BackdropScaffold.kt#jmzs0o");
                                                    if ((i36 & 14) == 0) {
                                                        i37 = i36 | (composer4.changed(j28) ? 4 : 2);
                                                    } else {
                                                        i37 = i36;
                                                    }
                                                    if ((i36 & 112) == 0) {
                                                        i37 |= composer4.changed(f19) ? 32 : 16;
                                                    }
                                                    if ((i37 & 731) != 146 || !composer4.getSkipping()) {
                                                        float m4423getMaxHeightimpl = androidx.compose.ui.unit.Constraints.m4423getMaxHeightimpl(j28);
                                                        float f20 = m4423getMaxHeightimpl - f14;
                                                        if (z17) {
                                                            f20 = java.lang.Math.min(f20, f19);
                                                        }
                                                        float f21 = f20;
                                                        if (z18) {
                                                            companion2 = androidx.compose.ui.input.nestedscroll.NestedScrollModifierKt.nestedScroll$default(androidx.compose.ui.Modifier.INSTANCE, backdropScaffoldState7.getNestedScrollConnection(), null, 2, null);
                                                        } else {
                                                            companion2 = androidx.compose.ui.Modifier.INSTANCE;
                                                        }
                                                        m1521swipeablepPrIpRY = androidx.compose.material.SwipeableKt.m1521swipeablepPrIpRY(androidx.compose.ui.Modifier.INSTANCE.then(companion2), backdropScaffoldState7, r18, androidx.compose.foundation.gestures.Orientation.Vertical, (r26 & 8) != 0 ? true : z18, (r26 & 16) != 0 ? false : false, (r26 & 32) != 0 ? null : null, (r26 & 64) != 0 ? new kotlin.jvm.functions.Function2<T, T, androidx.compose.material.FixedThreshold>() { // from class: androidx.compose.material.SwipeableKt$swipeable$1
                                                            /* JADX WARN: Can't rename method to resolve collision */
                                                            @Override // kotlin.jvm.functions.Function2
                                                            public final androidx.compose.material.FixedThreshold invoke(T t, T t2) {
                                                                return new androidx.compose.material.FixedThreshold(androidx.compose.ui.unit.Dp.m4478constructorimpl(56), null);
                                                            }
                                                        } : null, (r26 & 128) != 0 ? androidx.compose.material.SwipeableDefaults.resistanceConfig$default(androidx.compose.material.SwipeableDefaults.INSTANCE, kotlin.collections.MapsKt.mapOf(kotlin.TuplesKt.to(java.lang.Float.valueOf(f15), androidx.compose.material.BackdropValue.Concealed), kotlin.TuplesKt.to(java.lang.Float.valueOf(f21), androidx.compose.material.BackdropValue.Revealed)).keySet(), 0.0f, 0.0f, 6, null) : null, (r26 & 256) != 0 ? androidx.compose.material.SwipeableDefaults.INSTANCE.m1520getVelocityThresholdD9Ej5fM() : 0.0f);
                                                        final androidx.compose.material.BackdropScaffoldState backdropScaffoldState8 = backdropScaffoldState7;
                                                        final kotlinx.coroutines.CoroutineScope coroutineScope2 = coroutineScope;
                                                        androidx.compose.ui.Modifier semantics$default = androidx.compose.ui.semantics.SemanticsModifierKt.semantics$default(m1521swipeablepPrIpRY, false, new kotlin.jvm.functions.Function1<androidx.compose.ui.semantics.SemanticsPropertyReceiver, kotlin.Unit>() { // from class: androidx.compose.material.BackdropScaffoldKt$BackdropScaffold$1$1$swipeable$1
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
                                                                if (androidx.compose.material.BackdropScaffoldState.this.isConcealed()) {
                                                                    final androidx.compose.material.BackdropScaffoldState backdropScaffoldState9 = androidx.compose.material.BackdropScaffoldState.this;
                                                                    final kotlinx.coroutines.CoroutineScope coroutineScope3 = coroutineScope2;
                                                                    androidx.compose.ui.semantics.SemanticsPropertiesKt.collapse$default(semantics, null, new kotlin.jvm.functions.Function0<java.lang.Boolean>() { // from class: androidx.compose.material.BackdropScaffoldKt$BackdropScaffold$1$1$swipeable$1.1
                                                                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                                                        {
                                                                            super(0);
                                                                        }

                                                                        /* JADX WARN: Can't rename method to resolve collision */
                                                                        @Override // kotlin.jvm.functions.Function0
                                                                        public final java.lang.Boolean invoke() {
                                                                            if (androidx.compose.material.BackdropScaffoldState.this.getConfirmStateChange$material_release().invoke(androidx.compose.material.BackdropValue.Revealed).booleanValue()) {
                                                                                kotlinx.coroutines.BuildersKt__Builders_commonKt.launch$default(coroutineScope3, null, null, new androidx.compose.material.BackdropScaffoldKt$BackdropScaffold$1$1$swipeable$1.AnonymousClass1.C00371(androidx.compose.material.BackdropScaffoldState.this, null), 3, null);
                                                                            }
                                                                            return true;
                                                                        }

                                                                        /* compiled from: BackdropScaffold.kt */
                                                                        @kotlin.Metadata(k = 3, mv = {1, 6, 0}, xi = 48)
                                                                        @kotlin.coroutines.jvm.internal.DebugMetadata(c = "androidx.compose.material.BackdropScaffoldKt$BackdropScaffold$1$1$swipeable$1$1$1", f = "BackdropScaffold.kt", i = {}, l = {330}, m = "invokeSuspend", n = {}, s = {})
                                                                        /* renamed from: androidx.compose.material.BackdropScaffoldKt$BackdropScaffold$1$1$swipeable$1$1$1, reason: invalid class name and collision with other inner class name */
                                                                        static final class C00371 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<kotlinx.coroutines.CoroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> {
                                                                            final /* synthetic */ androidx.compose.material.BackdropScaffoldState $scaffoldState;
                                                                            int label;

                                                                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                                                            C00371(androidx.compose.material.BackdropScaffoldState backdropScaffoldState, kotlin.coroutines.Continuation<? super androidx.compose.material.BackdropScaffoldKt$BackdropScaffold$1$1$swipeable$1.AnonymousClass1.C00371> continuation) {
                                                                                super(2, continuation);
                                                                                this.$scaffoldState = backdropScaffoldState;
                                                                            }

                                                                            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                                                                            public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object obj, kotlin.coroutines.Continuation<?> continuation) {
                                                                                return new androidx.compose.material.BackdropScaffoldKt$BackdropScaffold$1$1$swipeable$1.AnonymousClass1.C00371(this.$scaffoldState, continuation);
                                                                            }

                                                                            @Override // kotlin.jvm.functions.Function2
                                                                            public final java.lang.Object invoke(kotlinx.coroutines.CoroutineScope coroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
                                                                                return ((androidx.compose.material.BackdropScaffoldKt$BackdropScaffold$1$1$swipeable$1.AnonymousClass1.C00371) create(coroutineScope, continuation)).invokeSuspend(kotlin.Unit.INSTANCE);
                                                                            }

                                                                            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                                                                            public final java.lang.Object invokeSuspend(java.lang.Object obj) {
                                                                                java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
                                                                                int i = this.label;
                                                                                if (i == 0) {
                                                                                    kotlin.ResultKt.throwOnFailure(obj);
                                                                                    this.label = 1;
                                                                                    if (this.$scaffoldState.reveal(this) == coroutine_suspended) {
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
                                                                    final androidx.compose.material.BackdropScaffoldState backdropScaffoldState10 = androidx.compose.material.BackdropScaffoldState.this;
                                                                    final kotlinx.coroutines.CoroutineScope coroutineScope4 = coroutineScope2;
                                                                    androidx.compose.ui.semantics.SemanticsPropertiesKt.expand$default(semantics, null, new kotlin.jvm.functions.Function0<java.lang.Boolean>() { // from class: androidx.compose.material.BackdropScaffoldKt$BackdropScaffold$1$1$swipeable$1.2
                                                                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                                                        {
                                                                            super(0);
                                                                        }

                                                                        /* JADX WARN: Can't rename method to resolve collision */
                                                                        @Override // kotlin.jvm.functions.Function0
                                                                        public final java.lang.Boolean invoke() {
                                                                            if (androidx.compose.material.BackdropScaffoldState.this.getConfirmStateChange$material_release().invoke(androidx.compose.material.BackdropValue.Concealed).booleanValue()) {
                                                                                kotlinx.coroutines.BuildersKt__Builders_commonKt.launch$default(coroutineScope4, null, null, new androidx.compose.material.BackdropScaffoldKt$BackdropScaffold$1$1$swipeable$1.AnonymousClass2.AnonymousClass1(androidx.compose.material.BackdropScaffoldState.this, null), 3, null);
                                                                            }
                                                                            return true;
                                                                        }

                                                                        /* compiled from: BackdropScaffold.kt */
                                                                        @kotlin.Metadata(k = 3, mv = {1, 6, 0}, xi = 48)
                                                                        @kotlin.coroutines.jvm.internal.DebugMetadata(c = "androidx.compose.material.BackdropScaffoldKt$BackdropScaffold$1$1$swipeable$1$2$1", f = "BackdropScaffold.kt", i = {}, l = {336}, m = "invokeSuspend", n = {}, s = {})
                                                                        /* renamed from: androidx.compose.material.BackdropScaffoldKt$BackdropScaffold$1$1$swipeable$1$2$1, reason: invalid class name */
                                                                        static final class AnonymousClass1 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<kotlinx.coroutines.CoroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> {
                                                                            final /* synthetic */ androidx.compose.material.BackdropScaffoldState $scaffoldState;
                                                                            int label;

                                                                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                                                            AnonymousClass1(androidx.compose.material.BackdropScaffoldState backdropScaffoldState, kotlin.coroutines.Continuation<? super androidx.compose.material.BackdropScaffoldKt$BackdropScaffold$1$1$swipeable$1.AnonymousClass2.AnonymousClass1> continuation) {
                                                                                super(2, continuation);
                                                                                this.$scaffoldState = backdropScaffoldState;
                                                                            }

                                                                            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                                                                            public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object obj, kotlin.coroutines.Continuation<?> continuation) {
                                                                                return new androidx.compose.material.BackdropScaffoldKt$BackdropScaffold$1$1$swipeable$1.AnonymousClass2.AnonymousClass1(this.$scaffoldState, continuation);
                                                                            }

                                                                            @Override // kotlin.jvm.functions.Function2
                                                                            public final java.lang.Object invoke(kotlinx.coroutines.CoroutineScope coroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
                                                                                return ((androidx.compose.material.BackdropScaffoldKt$BackdropScaffold$1$1$swipeable$1.AnonymousClass2.AnonymousClass1) create(coroutineScope, continuation)).invokeSuspend(kotlin.Unit.INSTANCE);
                                                                            }

                                                                            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                                                                            public final java.lang.Object invokeSuspend(java.lang.Object obj) {
                                                                                java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
                                                                                int i = this.label;
                                                                                if (i == 0) {
                                                                                    kotlin.ResultKt.throwOnFailure(obj);
                                                                                    this.label = 1;
                                                                                    if (this.$scaffoldState.conceal(this) == coroutine_suspended) {
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
                                                        androidx.compose.ui.Modifier.Companion companion3 = androidx.compose.ui.Modifier.INSTANCE;
                                                        final androidx.compose.material.BackdropScaffoldState backdropScaffoldState9 = backdropScaffoldState7;
                                                        composer4.startReplaceableGroup(1157296644);
                                                        androidx.compose.runtime.ComposerKt.sourceInformation(composer4, "C(remember)P(1):Composables.kt#9igjgp");
                                                        boolean changed2 = composer4.changed(backdropScaffoldState9);
                                                        java.lang.Object rememberedValue3 = composer4.rememberedValue();
                                                        if (changed2 || rememberedValue3 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                                                            rememberedValue3 = (kotlin.jvm.functions.Function1) new kotlin.jvm.functions.Function1<androidx.compose.ui.unit.Density, androidx.compose.ui.unit.IntOffset>() { // from class: androidx.compose.material.BackdropScaffoldKt$BackdropScaffold$1$1$1$1
                                                                {
                                                                    super(1);
                                                                }

                                                                @Override // kotlin.jvm.functions.Function1
                                                                public /* bridge */ /* synthetic */ androidx.compose.ui.unit.IntOffset invoke(androidx.compose.ui.unit.Density density) {
                                                                    return androidx.compose.ui.unit.IntOffset.m4601boximpl(m1238invokeBjo55l4(density));
                                                                }

                                                                /* renamed from: invoke-Bjo55l4, reason: not valid java name */
                                                                public final long m1238invokeBjo55l4(androidx.compose.ui.unit.Density offset) {
                                                                    kotlin.jvm.internal.Intrinsics.checkNotNullParameter(offset, "$this$offset");
                                                                    return androidx.compose.ui.unit.IntOffsetKt.IntOffset(0, kotlin.math.MathKt.roundToInt(androidx.compose.material.BackdropScaffoldState.this.getOffset().getValue().floatValue()));
                                                                }
                                                            };
                                                            composer4.updateRememberedValue(rememberedValue3);
                                                        }
                                                        composer4.endReplaceableGroup();
                                                        androidx.compose.ui.Modifier then = androidx.compose.foundation.layout.OffsetKt.offset(companion3, (kotlin.jvm.functions.Function1) rememberedValue3).then(semantics$default);
                                                        androidx.compose.ui.graphics.Shape shape9 = shape8;
                                                        long j29 = j25;
                                                        long j30 = j26;
                                                        float f22 = f16;
                                                        final float f23 = f18;
                                                        final kotlin.jvm.functions.Function2<androidx.compose.runtime.Composer, java.lang.Integer, kotlin.Unit> function23 = function22;
                                                        final int i38 = i34;
                                                        final long j31 = j27;
                                                        final androidx.compose.material.BackdropScaffoldState backdropScaffoldState10 = backdropScaffoldState7;
                                                        final int i39 = i35;
                                                        final boolean z19 = z18;
                                                        final kotlinx.coroutines.CoroutineScope coroutineScope3 = coroutineScope;
                                                        androidx.compose.runtime.internal.ComposableLambda composableLambda2 = androidx.compose.runtime.internal.ComposableLambdaKt.composableLambda(composer4, -1065299503, true, new kotlin.jvm.functions.Function2<androidx.compose.runtime.Composer, java.lang.Integer, kotlin.Unit>() { // from class: androidx.compose.material.BackdropScaffoldKt.BackdropScaffold.1.1.2
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

                                                            public final void invoke(androidx.compose.runtime.Composer composer5, int i40) {
                                                                androidx.compose.runtime.ComposerKt.sourceInformation(composer5, "C351@15517L543:BackdropScaffold.kt#jmzs0o");
                                                                if ((i40 & 11) != 2 || !composer5.getSkipping()) {
                                                                    androidx.compose.ui.Modifier m572paddingqDBjuR0$default = androidx.compose.foundation.layout.PaddingKt.m572paddingqDBjuR0$default(androidx.compose.ui.Modifier.INSTANCE, 0.0f, 0.0f, 0.0f, f23, 7, null);
                                                                    kotlin.jvm.functions.Function2<androidx.compose.runtime.Composer, java.lang.Integer, kotlin.Unit> function24 = function23;
                                                                    int i41 = i38;
                                                                    long j32 = j31;
                                                                    final androidx.compose.material.BackdropScaffoldState backdropScaffoldState11 = backdropScaffoldState10;
                                                                    int i42 = i39;
                                                                    final boolean z20 = z19;
                                                                    final kotlinx.coroutines.CoroutineScope coroutineScope4 = coroutineScope3;
                                                                    composer5.startReplaceableGroup(733328855);
                                                                    androidx.compose.runtime.ComposerKt.sourceInformation(composer5, "C(Box)P(2,1,3)70@3267L67,71@3339L130:Box.kt#2w3rfo");
                                                                    androidx.compose.ui.layout.MeasurePolicy rememberBoxMeasurePolicy = androidx.compose.foundation.layout.BoxKt.rememberBoxMeasurePolicy(androidx.compose.ui.Alignment.INSTANCE.getTopStart(), false, composer5, 0);
                                                                    composer5.startReplaceableGroup(-1323940314);
                                                                    androidx.compose.runtime.ComposerKt.sourceInformation(composer5, "C(Layout)P(!1,2)74@2915L7,75@2970L7,76@3029L7,77@3041L460:Layout.kt#80mrfh");
                                                                    androidx.compose.runtime.ProvidableCompositionLocal<androidx.compose.ui.unit.Density> localDensity3 = androidx.compose.ui.platform.CompositionLocalsKt.getLocalDensity();
                                                                    androidx.compose.runtime.ComposerKt.sourceInformationMarkerStart(composer5, 2023513938, "C:CompositionLocal.kt#9igjgp");
                                                                    java.lang.Object consume3 = composer5.consume(localDensity3);
                                                                    androidx.compose.runtime.ComposerKt.sourceInformationMarkerEnd(composer5);
                                                                    androidx.compose.ui.unit.Density density = (androidx.compose.ui.unit.Density) consume3;
                                                                    androidx.compose.runtime.ProvidableCompositionLocal<androidx.compose.ui.unit.LayoutDirection> localLayoutDirection = androidx.compose.ui.platform.CompositionLocalsKt.getLocalLayoutDirection();
                                                                    androidx.compose.runtime.ComposerKt.sourceInformationMarkerStart(composer5, 2023513938, "C:CompositionLocal.kt#9igjgp");
                                                                    java.lang.Object consume4 = composer5.consume(localLayoutDirection);
                                                                    androidx.compose.runtime.ComposerKt.sourceInformationMarkerEnd(composer5);
                                                                    androidx.compose.ui.unit.LayoutDirection layoutDirection = (androidx.compose.ui.unit.LayoutDirection) consume4;
                                                                    androidx.compose.runtime.ProvidableCompositionLocal<androidx.compose.ui.platform.ViewConfiguration> localViewConfiguration = androidx.compose.ui.platform.CompositionLocalsKt.getLocalViewConfiguration();
                                                                    androidx.compose.runtime.ComposerKt.sourceInformationMarkerStart(composer5, 2023513938, "C:CompositionLocal.kt#9igjgp");
                                                                    java.lang.Object consume5 = composer5.consume(localViewConfiguration);
                                                                    androidx.compose.runtime.ComposerKt.sourceInformationMarkerEnd(composer5);
                                                                    androidx.compose.ui.platform.ViewConfiguration viewConfiguration = (androidx.compose.ui.platform.ViewConfiguration) consume5;
                                                                    kotlin.jvm.functions.Function0<androidx.compose.ui.node.ComposeUiNode> constructor = androidx.compose.ui.node.ComposeUiNode.INSTANCE.getConstructor();
                                                                    kotlin.jvm.functions.Function3<androidx.compose.runtime.SkippableUpdater<androidx.compose.ui.node.ComposeUiNode>, androidx.compose.runtime.Composer, java.lang.Integer, kotlin.Unit> materializerOf = androidx.compose.ui.layout.LayoutKt.materializerOf(m572paddingqDBjuR0$default);
                                                                    if (!(composer5.getApplier() instanceof androidx.compose.runtime.Applier)) {
                                                                        androidx.compose.runtime.ComposablesKt.invalidApplier();
                                                                    }
                                                                    composer5.startReusableNode();
                                                                    if (composer5.getInserting()) {
                                                                        composer5.createNode(constructor);
                                                                    } else {
                                                                        composer5.useNode();
                                                                    }
                                                                    composer5.disableReusing();
                                                                    androidx.compose.runtime.Composer m1641constructorimpl = androidx.compose.runtime.Updater.m1641constructorimpl(composer5);
                                                                    androidx.compose.runtime.Updater.m1648setimpl(m1641constructorimpl, rememberBoxMeasurePolicy, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetMeasurePolicy());
                                                                    androidx.compose.runtime.Updater.m1648setimpl(m1641constructorimpl, density, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetDensity());
                                                                    androidx.compose.runtime.Updater.m1648setimpl(m1641constructorimpl, layoutDirection, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetLayoutDirection());
                                                                    androidx.compose.runtime.Updater.m1648setimpl(m1641constructorimpl, viewConfiguration, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetViewConfiguration());
                                                                    composer5.enableReusing();
                                                                    materializerOf.invoke(androidx.compose.runtime.SkippableUpdater.m1632boximpl(androidx.compose.runtime.SkippableUpdater.m1633constructorimpl(composer5)), composer5, 0);
                                                                    composer5.startReplaceableGroup(2058660585);
                                                                    composer5.startReplaceableGroup(-2137368960);
                                                                    androidx.compose.runtime.ComposerKt.sourceInformation(composer5, "C72@3384L9:Box.kt#2w3rfo");
                                                                    androidx.compose.foundation.layout.BoxScopeInstance boxScopeInstance = androidx.compose.foundation.layout.BoxScopeInstance.INSTANCE;
                                                                    composer5.startReplaceableGroup(-1889954677);
                                                                    androidx.compose.runtime.ComposerKt.sourceInformation(composer5, "C352@15582L19,353@15622L420:BackdropScaffold.kt#jmzs0o");
                                                                    function24.invoke(composer5, java.lang.Integer.valueOf((i41 >> 6) & 14));
                                                                    androidx.compose.material.BackdropScaffoldKt.m1233Scrim3JVO9M(j32, new kotlin.jvm.functions.Function0<kotlin.Unit>() { // from class: androidx.compose.material.BackdropScaffoldKt$BackdropScaffold$1$1$2$1$1
                                                                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                                                        {
                                                                            super(0);
                                                                        }

                                                                        @Override // kotlin.jvm.functions.Function0
                                                                        public /* bridge */ /* synthetic */ kotlin.Unit invoke() {
                                                                            invoke2();
                                                                            return kotlin.Unit.INSTANCE;
                                                                        }

                                                                        /* renamed from: invoke, reason: avoid collision after fix types in other method */
                                                                        public final void invoke2() {
                                                                            if (z20 && backdropScaffoldState11.getConfirmStateChange$material_release().invoke(androidx.compose.material.BackdropValue.Concealed).booleanValue()) {
                                                                                kotlinx.coroutines.BuildersKt__Builders_commonKt.launch$default(coroutineScope4, null, null, new androidx.compose.material.BackdropScaffoldKt$BackdropScaffold$1$1$2$1$1.AnonymousClass1(backdropScaffoldState11, null), 3, null);
                                                                            }
                                                                        }

                                                                        /* compiled from: BackdropScaffold.kt */
                                                                        @kotlin.Metadata(k = 3, mv = {1, 6, 0}, xi = 48)
                                                                        @kotlin.coroutines.jvm.internal.DebugMetadata(c = "androidx.compose.material.BackdropScaffoldKt$BackdropScaffold$1$1$2$1$1$1", f = "BackdropScaffold.kt", i = {}, l = {358}, m = "invokeSuspend", n = {}, s = {})
                                                                        /* renamed from: androidx.compose.material.BackdropScaffoldKt$BackdropScaffold$1$1$2$1$1$1, reason: invalid class name */
                                                                        static final class AnonymousClass1 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<kotlinx.coroutines.CoroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> {
                                                                            final /* synthetic */ androidx.compose.material.BackdropScaffoldState $scaffoldState;
                                                                            int label;

                                                                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                                                            AnonymousClass1(androidx.compose.material.BackdropScaffoldState backdropScaffoldState, kotlin.coroutines.Continuation<? super androidx.compose.material.BackdropScaffoldKt$BackdropScaffold$1$1$2$1$1.AnonymousClass1> continuation) {
                                                                                super(2, continuation);
                                                                                this.$scaffoldState = backdropScaffoldState;
                                                                            }

                                                                            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                                                                            public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object obj, kotlin.coroutines.Continuation<?> continuation) {
                                                                                return new androidx.compose.material.BackdropScaffoldKt$BackdropScaffold$1$1$2$1$1.AnonymousClass1(this.$scaffoldState, continuation);
                                                                            }

                                                                            @Override // kotlin.jvm.functions.Function2
                                                                            public final java.lang.Object invoke(kotlinx.coroutines.CoroutineScope coroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
                                                                                return ((androidx.compose.material.BackdropScaffoldKt$BackdropScaffold$1$1$2$1$1.AnonymousClass1) create(coroutineScope, continuation)).invokeSuspend(kotlin.Unit.INSTANCE);
                                                                            }

                                                                            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                                                                            public final java.lang.Object invokeSuspend(java.lang.Object obj) {
                                                                                java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
                                                                                int i = this.label;
                                                                                if (i == 0) {
                                                                                    kotlin.ResultKt.throwOnFailure(obj);
                                                                                    this.label = 1;
                                                                                    if (this.$scaffoldState.conceal(this) == coroutine_suspended) {
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
                                                                    }, backdropScaffoldState11.getTargetValue() == androidx.compose.material.BackdropValue.Revealed, composer5, (i42 >> 18) & 14);
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
                                                        androidx.compose.material.SurfaceKt.m1511SurfaceFjzlyU(then, shape9, j29, j30, null, f22, composableLambda2, composer4, ((i40 >> 3) & 112) | 1572864 | ((i40 >> 6) & 896) | ((i40 >> 6) & 7168) | ((i40 << 6) & 458752), 16);
                                                        androidx.compose.ui.Modifier.Companion companion4 = androidx.compose.ui.Modifier.INSTANCE;
                                                        if (backdropScaffoldState7.isRevealed() && f21 == m4423getMaxHeightimpl - f14) {
                                                            m4478constructorimpl = f17;
                                                        } else {
                                                            m4478constructorimpl = androidx.compose.ui.unit.Dp.m4478constructorimpl(0);
                                                        }
                                                        androidx.compose.ui.Modifier m572paddingqDBjuR0$default = androidx.compose.foundation.layout.PaddingKt.m572paddingqDBjuR0$default(companion4, 0.0f, 0.0f, 0.0f, m4478constructorimpl, 7, null);
                                                        androidx.compose.ui.Alignment bottomCenter = androidx.compose.ui.Alignment.INSTANCE.getBottomCenter();
                                                        kotlin.jvm.functions.Function3<androidx.compose.material.SnackbarHostState, androidx.compose.runtime.Composer, java.lang.Integer, kotlin.Unit> function37 = function36;
                                                        androidx.compose.material.BackdropScaffoldState backdropScaffoldState11 = backdropScaffoldState7;
                                                        int i41 = i35;
                                                        composer4.startReplaceableGroup(733328855);
                                                        androidx.compose.runtime.ComposerKt.sourceInformation(composer4, "C(Box)P(2,1,3)70@3267L67,71@3339L130:Box.kt#2w3rfo");
                                                        androidx.compose.ui.layout.MeasurePolicy rememberBoxMeasurePolicy = androidx.compose.foundation.layout.BoxKt.rememberBoxMeasurePolicy(bottomCenter, false, composer4, 6);
                                                        composer4.startReplaceableGroup(-1323940314);
                                                        androidx.compose.runtime.ComposerKt.sourceInformation(composer4, "C(Layout)P(!1,2)74@2915L7,75@2970L7,76@3029L7,77@3041L460:Layout.kt#80mrfh");
                                                        androidx.compose.runtime.ProvidableCompositionLocal<androidx.compose.ui.unit.Density> localDensity3 = androidx.compose.ui.platform.CompositionLocalsKt.getLocalDensity();
                                                        androidx.compose.runtime.ComposerKt.sourceInformationMarkerStart(composer4, 2023513938, "C:CompositionLocal.kt#9igjgp");
                                                        java.lang.Object consume3 = composer4.consume(localDensity3);
                                                        androidx.compose.runtime.ComposerKt.sourceInformationMarkerEnd(composer4);
                                                        androidx.compose.ui.unit.Density density = (androidx.compose.ui.unit.Density) consume3;
                                                        androidx.compose.runtime.ProvidableCompositionLocal<androidx.compose.ui.unit.LayoutDirection> localLayoutDirection = androidx.compose.ui.platform.CompositionLocalsKt.getLocalLayoutDirection();
                                                        androidx.compose.runtime.ComposerKt.sourceInformationMarkerStart(composer4, 2023513938, "C:CompositionLocal.kt#9igjgp");
                                                        java.lang.Object consume4 = composer4.consume(localLayoutDirection);
                                                        androidx.compose.runtime.ComposerKt.sourceInformationMarkerEnd(composer4);
                                                        androidx.compose.ui.unit.LayoutDirection layoutDirection = (androidx.compose.ui.unit.LayoutDirection) consume4;
                                                        androidx.compose.runtime.ProvidableCompositionLocal<androidx.compose.ui.platform.ViewConfiguration> localViewConfiguration = androidx.compose.ui.platform.CompositionLocalsKt.getLocalViewConfiguration();
                                                        androidx.compose.runtime.ComposerKt.sourceInformationMarkerStart(composer4, 2023513938, "C:CompositionLocal.kt#9igjgp");
                                                        java.lang.Object consume5 = composer4.consume(localViewConfiguration);
                                                        androidx.compose.runtime.ComposerKt.sourceInformationMarkerEnd(composer4);
                                                        androidx.compose.ui.platform.ViewConfiguration viewConfiguration = (androidx.compose.ui.platform.ViewConfiguration) consume5;
                                                        kotlin.jvm.functions.Function0<androidx.compose.ui.node.ComposeUiNode> constructor = androidx.compose.ui.node.ComposeUiNode.INSTANCE.getConstructor();
                                                        kotlin.jvm.functions.Function3<androidx.compose.runtime.SkippableUpdater<androidx.compose.ui.node.ComposeUiNode>, androidx.compose.runtime.Composer, java.lang.Integer, kotlin.Unit> materializerOf = androidx.compose.ui.layout.LayoutKt.materializerOf(m572paddingqDBjuR0$default);
                                                        if (!(composer4.getApplier() instanceof androidx.compose.runtime.Applier)) {
                                                            androidx.compose.runtime.ComposablesKt.invalidApplier();
                                                        }
                                                        composer4.startReusableNode();
                                                        if (composer4.getInserting()) {
                                                            composer4.createNode(constructor);
                                                        } else {
                                                            composer4.useNode();
                                                        }
                                                        composer4.disableReusing();
                                                        androidx.compose.runtime.Composer m1641constructorimpl = androidx.compose.runtime.Updater.m1641constructorimpl(composer4);
                                                        androidx.compose.runtime.Updater.m1648setimpl(m1641constructorimpl, rememberBoxMeasurePolicy, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetMeasurePolicy());
                                                        androidx.compose.runtime.Updater.m1648setimpl(m1641constructorimpl, density, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetDensity());
                                                        androidx.compose.runtime.Updater.m1648setimpl(m1641constructorimpl, layoutDirection, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetLayoutDirection());
                                                        androidx.compose.runtime.Updater.m1648setimpl(m1641constructorimpl, viewConfiguration, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetViewConfiguration());
                                                        composer4.enableReusing();
                                                        materializerOf.invoke(androidx.compose.runtime.SkippableUpdater.m1632boximpl(androidx.compose.runtime.SkippableUpdater.m1633constructorimpl(composer4)), composer4, 0);
                                                        composer4.startReplaceableGroup(2058660585);
                                                        composer4.startReplaceableGroup(-2137368960);
                                                        androidx.compose.runtime.ComposerKt.sourceInformation(composer4, "C72@3384L9:Box.kt#2w3rfo");
                                                        androidx.compose.foundation.layout.BoxScopeInstance boxScopeInstance = androidx.compose.foundation.layout.BoxScopeInstance.INSTANCE;
                                                        composer4.startReplaceableGroup(1815906203);
                                                        androidx.compose.runtime.ComposerKt.sourceInformation(composer4, "C375@16478L45:BackdropScaffold.kt#jmzs0o");
                                                        function37.invoke(backdropScaffoldState11.getSnackbarHostState(), composer4, java.lang.Integer.valueOf((i41 >> 18) & 112));
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
                                z8 = z5;
                                z9 = z6;
                                z10 = z7;
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
                                z8 = z;
                                f10 = f;
                                z9 = z2;
                                j18 = j2;
                                f8 = f3;
                                j19 = j3;
                                j20 = j4;
                                j21 = j5;
                                shape5 = shape2;
                                function34 = function32;
                                composer2 = startRestartGroup;
                                f9 = f2;
                                z10 = z3;
                                j17 = j;
                            }
                            endRestartGroup = composer2.endRestartGroup();
                            if (endRestartGroup != null) {
                                return;
                            }
                            endRestartGroup.updateScope(new kotlin.jvm.functions.Function2<androidx.compose.runtime.Composer, java.lang.Integer, kotlin.Unit>() { // from class: androidx.compose.material.BackdropScaffoldKt$BackdropScaffold$2
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

                                public final void invoke(androidx.compose.runtime.Composer composer3, int i33) {
                                    androidx.compose.material.BackdropScaffoldKt.m1232BackdropScaffoldBZszfkY(appBar, backLayerContent, frontLayerContent, modifier2, backdropScaffoldState2, z8, f10, f9, z9, z10, j17, j18, shape5, f8, j19, j20, j21, function34, composer3, i | 1, i2, i3);
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
                        androidx.compose.ui.graphics.Shape shape62 = shape3;
                        if ((i3 & 16384) == 0) {
                        }
                        if ((i3 & 32768) == 0) {
                        }
                        if ((i3 & 65536) == 0) {
                        }
                        if (i15 == 0) {
                        }
                        i23 = i21;
                        f6 = m1230getPeekHeightD9Ej5fM;
                        f7 = m1229getHeaderHeightD9Ej5fM;
                        startRestartGroup.endDefaults();
                        androidx.compose.runtime.ProvidableCompositionLocal<androidx.compose.ui.unit.Density> localDensity3 = androidx.compose.ui.platform.CompositionLocalsKt.getLocalDensity();
                        androidx.compose.runtime.ComposerKt.sourceInformationMarkerStart(startRestartGroup, 2023513938, "C:CompositionLocal.kt#9igjgp");
                        java.lang.Object consume3 = startRestartGroup.consume(localDensity3);
                        androidx.compose.runtime.ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                        final float mo315toPx0680j_43 = ((androidx.compose.ui.unit.Density) consume3).mo315toPx0680j_4(f6);
                        androidx.compose.runtime.ProvidableCompositionLocal<androidx.compose.ui.unit.Density> localDensity22 = androidx.compose.ui.platform.CompositionLocalsKt.getLocalDensity();
                        androidx.compose.runtime.ComposerKt.sourceInformationMarkerStart(startRestartGroup, 2023513938, "C:CompositionLocal.kt#9igjgp");
                        java.lang.Object consume22 = startRestartGroup.consume(localDensity22);
                        androidx.compose.runtime.ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                        final float mo315toPx0680j_422 = ((androidx.compose.ui.unit.Density) consume22).mo315toPx0680j_4(f7);
                        final boolean z142 = z6;
                        final androidx.compose.material.BackdropScaffoldState backdropScaffoldState42 = backdropScaffoldState3;
                        final int i292 = i23;
                        final kotlin.jvm.functions.Function2<? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.Unit> composableLambda2 = androidx.compose.runtime.internal.ComposableLambdaKt.composableLambda(startRestartGroup, 1744778315, true, new kotlin.jvm.functions.Function2<androidx.compose.runtime.Composer, java.lang.Integer, kotlin.Unit>() { // from class: androidx.compose.material.BackdropScaffoldKt$BackdropScaffold$backLayer$1
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

                            public final void invoke(androidx.compose.runtime.Composer composer3, int i302) {
                                androidx.compose.runtime.ComposerKt.sourceInformation(composer3, "C:BackdropScaffold.kt#jmzs0o");
                                if ((i302 & 11) != 2 || !composer3.getSkipping()) {
                                    if (z142) {
                                        composer3.startReplaceableGroup(-1017265331);
                                        androidx.compose.runtime.ComposerKt.sourceInformation(composer3, "280@12876L82");
                                        kotlin.jvm.functions.Function2<androidx.compose.runtime.Composer, java.lang.Integer, kotlin.Unit> function2 = appBar;
                                        int i312 = i292;
                                        kotlin.jvm.functions.Function2<androidx.compose.runtime.Composer, java.lang.Integer, kotlin.Unit> function22 = backLayerContent;
                                        composer3.startReplaceableGroup(-483455358);
                                        androidx.compose.runtime.ComposerKt.sourceInformation(composer3, "C(Column)P(2,3,1)77@3880L61,78@3946L133:Column.kt#2w3rfo");
                                        androidx.compose.ui.Modifier.Companion companion2 = androidx.compose.ui.Modifier.INSTANCE;
                                        androidx.compose.ui.layout.MeasurePolicy columnMeasurePolicy = androidx.compose.foundation.layout.ColumnKt.columnMeasurePolicy(androidx.compose.foundation.layout.Arrangement.INSTANCE.getTop(), androidx.compose.ui.Alignment.INSTANCE.getStart(), composer3, 0);
                                        composer3.startReplaceableGroup(-1323940314);
                                        androidx.compose.runtime.ComposerKt.sourceInformation(composer3, "C(Layout)P(!1,2)74@2915L7,75@2970L7,76@3029L7,77@3041L460:Layout.kt#80mrfh");
                                        androidx.compose.runtime.ProvidableCompositionLocal<androidx.compose.ui.unit.Density> localDensity32 = androidx.compose.ui.platform.CompositionLocalsKt.getLocalDensity();
                                        androidx.compose.runtime.ComposerKt.sourceInformationMarkerStart(composer3, 2023513938, "C:CompositionLocal.kt#9igjgp");
                                        java.lang.Object consume32 = composer3.consume(localDensity32);
                                        androidx.compose.runtime.ComposerKt.sourceInformationMarkerEnd(composer3);
                                        androidx.compose.ui.unit.Density density = (androidx.compose.ui.unit.Density) consume32;
                                        androidx.compose.runtime.ProvidableCompositionLocal<androidx.compose.ui.unit.LayoutDirection> localLayoutDirection = androidx.compose.ui.platform.CompositionLocalsKt.getLocalLayoutDirection();
                                        androidx.compose.runtime.ComposerKt.sourceInformationMarkerStart(composer3, 2023513938, "C:CompositionLocal.kt#9igjgp");
                                        java.lang.Object consume4 = composer3.consume(localLayoutDirection);
                                        androidx.compose.runtime.ComposerKt.sourceInformationMarkerEnd(composer3);
                                        androidx.compose.ui.unit.LayoutDirection layoutDirection = (androidx.compose.ui.unit.LayoutDirection) consume4;
                                        androidx.compose.runtime.ProvidableCompositionLocal<androidx.compose.ui.platform.ViewConfiguration> localViewConfiguration = androidx.compose.ui.platform.CompositionLocalsKt.getLocalViewConfiguration();
                                        androidx.compose.runtime.ComposerKt.sourceInformationMarkerStart(composer3, 2023513938, "C:CompositionLocal.kt#9igjgp");
                                        java.lang.Object consume5 = composer3.consume(localViewConfiguration);
                                        androidx.compose.runtime.ComposerKt.sourceInformationMarkerEnd(composer3);
                                        androidx.compose.ui.platform.ViewConfiguration viewConfiguration = (androidx.compose.ui.platform.ViewConfiguration) consume5;
                                        kotlin.jvm.functions.Function0<androidx.compose.ui.node.ComposeUiNode> constructor = androidx.compose.ui.node.ComposeUiNode.INSTANCE.getConstructor();
                                        kotlin.jvm.functions.Function3<androidx.compose.runtime.SkippableUpdater<androidx.compose.ui.node.ComposeUiNode>, androidx.compose.runtime.Composer, java.lang.Integer, kotlin.Unit> materializerOf = androidx.compose.ui.layout.LayoutKt.materializerOf(companion2);
                                        if (!(composer3.getApplier() instanceof androidx.compose.runtime.Applier)) {
                                            androidx.compose.runtime.ComposablesKt.invalidApplier();
                                        }
                                        composer3.startReusableNode();
                                        if (composer3.getInserting()) {
                                            composer3.createNode(constructor);
                                        } else {
                                            composer3.useNode();
                                        }
                                        composer3.disableReusing();
                                        androidx.compose.runtime.Composer m1641constructorimpl = androidx.compose.runtime.Updater.m1641constructorimpl(composer3);
                                        androidx.compose.runtime.Updater.m1648setimpl(m1641constructorimpl, columnMeasurePolicy, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetMeasurePolicy());
                                        androidx.compose.runtime.Updater.m1648setimpl(m1641constructorimpl, density, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetDensity());
                                        androidx.compose.runtime.Updater.m1648setimpl(m1641constructorimpl, layoutDirection, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetLayoutDirection());
                                        androidx.compose.runtime.Updater.m1648setimpl(m1641constructorimpl, viewConfiguration, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetViewConfiguration());
                                        composer3.enableReusing();
                                        materializerOf.invoke(androidx.compose.runtime.SkippableUpdater.m1632boximpl(androidx.compose.runtime.SkippableUpdater.m1633constructorimpl(composer3)), composer3, 0);
                                        composer3.startReplaceableGroup(2058660585);
                                        composer3.startReplaceableGroup(-1163856341);
                                        androidx.compose.runtime.ComposerKt.sourceInformation(composer3, "C79@3994L9:Column.kt#2w3rfo");
                                        androidx.compose.foundation.layout.ColumnScopeInstance columnScopeInstance = androidx.compose.foundation.layout.ColumnScopeInstance.INSTANCE;
                                        composer3.startReplaceableGroup(-18835878);
                                        androidx.compose.runtime.ComposerKt.sourceInformation(composer3, "C281@12901L8,282@12926L18:BackdropScaffold.kt#jmzs0o");
                                        function2.invoke(composer3, java.lang.Integer.valueOf(i312 & 14));
                                        function22.invoke(composer3, java.lang.Integer.valueOf((i312 >> 3) & 14));
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
                                    androidx.compose.runtime.ComposerKt.sourceInformation(composer3, "285@12988L72");
                                    androidx.compose.material.BackdropValue targetValue = backdropScaffoldState42.getTargetValue();
                                    kotlin.jvm.functions.Function2<androidx.compose.runtime.Composer, java.lang.Integer, kotlin.Unit> function23 = appBar;
                                    kotlin.jvm.functions.Function2<androidx.compose.runtime.Composer, java.lang.Integer, kotlin.Unit> function24 = backLayerContent;
                                    int i322 = i292;
                                    androidx.compose.material.BackdropScaffoldKt.BackLayerTransition(targetValue, function23, function24, composer3, ((i322 << 3) & 896) | ((i322 << 3) & 112));
                                    composer3.endReplaceableGroup();
                                    return;
                                }
                                composer3.skipToGroupEnd();
                            }
                        });
                        java.lang.Float valueOf2 = java.lang.Float.valueOf(mo315toPx0680j_422);
                        startRestartGroup.startReplaceableGroup(1157296644);
                        androidx.compose.runtime.ComposerKt.sourceInformation(startRestartGroup, "C(remember)P(1):Composables.kt#9igjgp");
                        changed = startRestartGroup.changed(valueOf2);
                        rememberedValue = startRestartGroup.rememberedValue();
                        if (!changed) {
                        }
                        rememberedValue = (kotlin.jvm.functions.Function1) new kotlin.jvm.functions.Function1<androidx.compose.ui.unit.Constraints, androidx.compose.ui.unit.Constraints>() { // from class: androidx.compose.material.BackdropScaffoldKt$BackdropScaffold$calculateBackLayerConstraints$1$1
                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            {
                                super(1);
                            }

                            @Override // kotlin.jvm.functions.Function1
                            public /* bridge */ /* synthetic */ androidx.compose.ui.unit.Constraints invoke(androidx.compose.ui.unit.Constraints constraints) {
                                return androidx.compose.ui.unit.Constraints.m4412boximpl(m1239invokeZezNO4M(constraints.getValue()));
                            }

                            /* renamed from: invoke-ZezNO4M, reason: not valid java name */
                            public final long m1239invokeZezNO4M(long j222) {
                                return androidx.compose.ui.unit.ConstraintsKt.m4441offsetNN6EwU$default(androidx.compose.ui.unit.Constraints.m4415copyZbe2FdA$default(j222, 0, 0, 0, 0, 10, null), 0, -kotlin.math.MathKt.roundToInt(mo315toPx0680j_422), 1, null);
                            }
                        };
                        startRestartGroup.updateRememberedValue(rememberedValue);
                        startRestartGroup.endReplaceableGroup();
                        final kotlin.jvm.functions.Function1<? super androidx.compose.ui.unit.Constraints, androidx.compose.ui.unit.Constraints> function12 = (kotlin.jvm.functions.Function1) rememberedValue;
                        final androidx.compose.ui.Modifier modifier52 = modifier4;
                        final boolean z152 = z7;
                        final boolean z162 = z5;
                        final float f112 = f7;
                        final androidx.compose.material.BackdropScaffoldState backdropScaffoldState52 = backdropScaffoldState3;
                        final float f122 = f6;
                        androidx.compose.material.BackdropScaffoldState backdropScaffoldState62 = backdropScaffoldState3;
                        composer2 = startRestartGroup;
                        final int i302 = i23;
                        final androidx.compose.ui.graphics.Shape shape72 = shape4;
                        final long j222 = j16;
                        final long j232 = j14;
                        final float f132 = f5;
                        final int i312 = i22;
                        final long j242 = j12;
                        final kotlin.jvm.functions.Function3<? super androidx.compose.material.SnackbarHostState, ? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.Unit> function352 = function33;
                        int i322 = i22 << 6;
                        androidx.compose.material.SurfaceKt.m1511SurfaceFjzlyU(null, null, j13, j15, null, 0.0f, androidx.compose.runtime.internal.ComposableLambdaKt.composableLambda(composer2, -1049909631, true, new kotlin.jvm.functions.Function2<androidx.compose.runtime.Composer, java.lang.Integer, kotlin.Unit>() { // from class: androidx.compose.material.BackdropScaffoldKt$BackdropScaffold$1
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

                            public final void invoke(androidx.compose.runtime.Composer composer3, int i33) {
                                androidx.compose.runtime.ComposerKt.sourceInformation(composer3, "C297@13395L24,298@13428L3119:BackdropScaffold.kt#jmzs0o");
                                if ((i33 & 11) != 2 || !composer3.getSkipping()) {
                                    composer3.startReplaceableGroup(773894976);
                                    androidx.compose.runtime.ComposerKt.sourceInformation(composer3, "C(rememberCoroutineScope)475@19849L144:Effects.kt#9igjgp");
                                    composer3.startReplaceableGroup(-492369756);
                                    androidx.compose.runtime.ComposerKt.sourceInformation(composer3, "C(remember):Composables.kt#9igjgp");
                                    java.lang.Object rememberedValue2 = composer3.rememberedValue();
                                    if (rememberedValue2 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                                        androidx.compose.runtime.CompositionScopedCoroutineScopeCanceller compositionScopedCoroutineScopeCanceller = new androidx.compose.runtime.CompositionScopedCoroutineScopeCanceller(androidx.compose.runtime.EffectsKt.createCompositionCoroutineScope(kotlin.coroutines.EmptyCoroutineContext.INSTANCE, composer3));
                                        composer3.updateRememberedValue(compositionScopedCoroutineScopeCanceller);
                                        rememberedValue2 = compositionScopedCoroutineScopeCanceller;
                                    }
                                    composer3.endReplaceableGroup();
                                    final kotlinx.coroutines.CoroutineScope coroutineScope = ((androidx.compose.runtime.CompositionScopedCoroutineScopeCanceller) rememberedValue2).getCoroutineScope();
                                    composer3.endReplaceableGroup();
                                    androidx.compose.ui.Modifier fillMaxSize$default = androidx.compose.foundation.layout.SizeKt.fillMaxSize$default(androidx.compose.ui.Modifier.this, 0.0f, 1, null);
                                    kotlin.jvm.functions.Function2<androidx.compose.runtime.Composer, java.lang.Integer, kotlin.Unit> function2 = composableLambda2;
                                    kotlin.jvm.functions.Function1<androidx.compose.ui.unit.Constraints, androidx.compose.ui.unit.Constraints> function122 = function12;
                                    final float f14 = mo315toPx0680j_422;
                                    final boolean z17 = z152;
                                    final boolean z18 = z162;
                                    final androidx.compose.material.BackdropScaffoldState backdropScaffoldState7 = backdropScaffoldState52;
                                    final float f15 = mo315toPx0680j_43;
                                    final int i34 = i302;
                                    final androidx.compose.ui.graphics.Shape shape8 = shape72;
                                    final long j25 = j222;
                                    final long j26 = j232;
                                    final float f16 = f132;
                                    final int i35 = i312;
                                    final float f17 = f112;
                                    final float f18 = f122;
                                    final kotlin.jvm.functions.Function2<? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.Unit> function22 = frontLayerContent;
                                    final long j27 = j242;
                                    final kotlin.jvm.functions.Function3<? super androidx.compose.material.SnackbarHostState, ? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.Unit> function36 = function352;
                                    androidx.compose.material.BackdropScaffoldKt.BackdropStack(fillMaxSize$default, function2, function122, androidx.compose.runtime.internal.ComposableLambdaKt.composableLambda(composer3, 1800047509, true, new kotlin.jvm.functions.Function4<androidx.compose.ui.unit.Constraints, java.lang.Float, androidx.compose.runtime.Composer, java.lang.Integer, kotlin.Unit>() { // from class: androidx.compose.material.BackdropScaffoldKt$BackdropScaffold$1.1
                                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                        /* JADX WARN: Multi-variable type inference failed */
                                        {
                                            super(4);
                                        }

                                        @Override // kotlin.jvm.functions.Function4
                                        public /* bridge */ /* synthetic */ kotlin.Unit invoke(androidx.compose.ui.unit.Constraints constraints, java.lang.Float f19, androidx.compose.runtime.Composer composer4, java.lang.Integer num) {
                                            m1237invokejYbf7pk(constraints.getValue(), f19.floatValue(), composer4, num.intValue());
                                            return kotlin.Unit.INSTANCE;
                                        }

                                        /* renamed from: invoke-jYbf7pk, reason: not valid java name */
                                        public final void m1237invokejYbf7pk(long j28, float f19, androidx.compose.runtime.Composer composer4, int i36) {
                                            int i37;
                                            androidx.compose.ui.Modifier.Companion companion2;
                                            androidx.compose.ui.Modifier m1521swipeablepPrIpRY;
                                            float m4478constructorimpl;
                                            androidx.compose.runtime.ComposerKt.sourceInformation(composer4, "CP(1:c#ui.unit.Constraints)344@15194L57,342@15132L942,366@16117L420:BackdropScaffold.kt#jmzs0o");
                                            if ((i36 & 14) == 0) {
                                                i37 = i36 | (composer4.changed(j28) ? 4 : 2);
                                            } else {
                                                i37 = i36;
                                            }
                                            if ((i36 & 112) == 0) {
                                                i37 |= composer4.changed(f19) ? 32 : 16;
                                            }
                                            if ((i37 & 731) != 146 || !composer4.getSkipping()) {
                                                float m4423getMaxHeightimpl = androidx.compose.ui.unit.Constraints.m4423getMaxHeightimpl(j28);
                                                float f20 = m4423getMaxHeightimpl - f14;
                                                if (z17) {
                                                    f20 = java.lang.Math.min(f20, f19);
                                                }
                                                float f21 = f20;
                                                if (z18) {
                                                    companion2 = androidx.compose.ui.input.nestedscroll.NestedScrollModifierKt.nestedScroll$default(androidx.compose.ui.Modifier.INSTANCE, backdropScaffoldState7.getNestedScrollConnection(), null, 2, null);
                                                } else {
                                                    companion2 = androidx.compose.ui.Modifier.INSTANCE;
                                                }
                                                m1521swipeablepPrIpRY = androidx.compose.material.SwipeableKt.m1521swipeablepPrIpRY(androidx.compose.ui.Modifier.INSTANCE.then(companion2), backdropScaffoldState7, r18, androidx.compose.foundation.gestures.Orientation.Vertical, (r26 & 8) != 0 ? true : z18, (r26 & 16) != 0 ? false : false, (r26 & 32) != 0 ? null : null, (r26 & 64) != 0 ? new kotlin.jvm.functions.Function2<T, T, androidx.compose.material.FixedThreshold>() { // from class: androidx.compose.material.SwipeableKt$swipeable$1
                                                    /* JADX WARN: Can't rename method to resolve collision */
                                                    @Override // kotlin.jvm.functions.Function2
                                                    public final androidx.compose.material.FixedThreshold invoke(T t, T t2) {
                                                        return new androidx.compose.material.FixedThreshold(androidx.compose.ui.unit.Dp.m4478constructorimpl(56), null);
                                                    }
                                                } : null, (r26 & 128) != 0 ? androidx.compose.material.SwipeableDefaults.resistanceConfig$default(androidx.compose.material.SwipeableDefaults.INSTANCE, kotlin.collections.MapsKt.mapOf(kotlin.TuplesKt.to(java.lang.Float.valueOf(f15), androidx.compose.material.BackdropValue.Concealed), kotlin.TuplesKt.to(java.lang.Float.valueOf(f21), androidx.compose.material.BackdropValue.Revealed)).keySet(), 0.0f, 0.0f, 6, null) : null, (r26 & 256) != 0 ? androidx.compose.material.SwipeableDefaults.INSTANCE.m1520getVelocityThresholdD9Ej5fM() : 0.0f);
                                                final androidx.compose.material.BackdropScaffoldState backdropScaffoldState8 = backdropScaffoldState7;
                                                final kotlinx.coroutines.CoroutineScope coroutineScope2 = coroutineScope;
                                                androidx.compose.ui.Modifier semantics$default = androidx.compose.ui.semantics.SemanticsModifierKt.semantics$default(m1521swipeablepPrIpRY, false, new kotlin.jvm.functions.Function1<androidx.compose.ui.semantics.SemanticsPropertyReceiver, kotlin.Unit>() { // from class: androidx.compose.material.BackdropScaffoldKt$BackdropScaffold$1$1$swipeable$1
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
                                                        if (androidx.compose.material.BackdropScaffoldState.this.isConcealed()) {
                                                            final androidx.compose.material.BackdropScaffoldState backdropScaffoldState9 = androidx.compose.material.BackdropScaffoldState.this;
                                                            final kotlinx.coroutines.CoroutineScope coroutineScope3 = coroutineScope2;
                                                            androidx.compose.ui.semantics.SemanticsPropertiesKt.collapse$default(semantics, null, new kotlin.jvm.functions.Function0<java.lang.Boolean>() { // from class: androidx.compose.material.BackdropScaffoldKt$BackdropScaffold$1$1$swipeable$1.1
                                                                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                                                {
                                                                    super(0);
                                                                }

                                                                /* JADX WARN: Can't rename method to resolve collision */
                                                                @Override // kotlin.jvm.functions.Function0
                                                                public final java.lang.Boolean invoke() {
                                                                    if (androidx.compose.material.BackdropScaffoldState.this.getConfirmStateChange$material_release().invoke(androidx.compose.material.BackdropValue.Revealed).booleanValue()) {
                                                                        kotlinx.coroutines.BuildersKt__Builders_commonKt.launch$default(coroutineScope3, null, null, new androidx.compose.material.BackdropScaffoldKt$BackdropScaffold$1$1$swipeable$1.AnonymousClass1.C00371(androidx.compose.material.BackdropScaffoldState.this, null), 3, null);
                                                                    }
                                                                    return true;
                                                                }

                                                                /* compiled from: BackdropScaffold.kt */
                                                                @kotlin.Metadata(k = 3, mv = {1, 6, 0}, xi = 48)
                                                                @kotlin.coroutines.jvm.internal.DebugMetadata(c = "androidx.compose.material.BackdropScaffoldKt$BackdropScaffold$1$1$swipeable$1$1$1", f = "BackdropScaffold.kt", i = {}, l = {330}, m = "invokeSuspend", n = {}, s = {})
                                                                /* renamed from: androidx.compose.material.BackdropScaffoldKt$BackdropScaffold$1$1$swipeable$1$1$1, reason: invalid class name and collision with other inner class name */
                                                                static final class C00371 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<kotlinx.coroutines.CoroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> {
                                                                    final /* synthetic */ androidx.compose.material.BackdropScaffoldState $scaffoldState;
                                                                    int label;

                                                                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                                                    C00371(androidx.compose.material.BackdropScaffoldState backdropScaffoldState, kotlin.coroutines.Continuation<? super androidx.compose.material.BackdropScaffoldKt$BackdropScaffold$1$1$swipeable$1.AnonymousClass1.C00371> continuation) {
                                                                        super(2, continuation);
                                                                        this.$scaffoldState = backdropScaffoldState;
                                                                    }

                                                                    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                                                                    public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object obj, kotlin.coroutines.Continuation<?> continuation) {
                                                                        return new androidx.compose.material.BackdropScaffoldKt$BackdropScaffold$1$1$swipeable$1.AnonymousClass1.C00371(this.$scaffoldState, continuation);
                                                                    }

                                                                    @Override // kotlin.jvm.functions.Function2
                                                                    public final java.lang.Object invoke(kotlinx.coroutines.CoroutineScope coroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
                                                                        return ((androidx.compose.material.BackdropScaffoldKt$BackdropScaffold$1$1$swipeable$1.AnonymousClass1.C00371) create(coroutineScope, continuation)).invokeSuspend(kotlin.Unit.INSTANCE);
                                                                    }

                                                                    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                                                                    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
                                                                        java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
                                                                        int i = this.label;
                                                                        if (i == 0) {
                                                                            kotlin.ResultKt.throwOnFailure(obj);
                                                                            this.label = 1;
                                                                            if (this.$scaffoldState.reveal(this) == coroutine_suspended) {
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
                                                            final androidx.compose.material.BackdropScaffoldState backdropScaffoldState10 = androidx.compose.material.BackdropScaffoldState.this;
                                                            final kotlinx.coroutines.CoroutineScope coroutineScope4 = coroutineScope2;
                                                            androidx.compose.ui.semantics.SemanticsPropertiesKt.expand$default(semantics, null, new kotlin.jvm.functions.Function0<java.lang.Boolean>() { // from class: androidx.compose.material.BackdropScaffoldKt$BackdropScaffold$1$1$swipeable$1.2
                                                                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                                                {
                                                                    super(0);
                                                                }

                                                                /* JADX WARN: Can't rename method to resolve collision */
                                                                @Override // kotlin.jvm.functions.Function0
                                                                public final java.lang.Boolean invoke() {
                                                                    if (androidx.compose.material.BackdropScaffoldState.this.getConfirmStateChange$material_release().invoke(androidx.compose.material.BackdropValue.Concealed).booleanValue()) {
                                                                        kotlinx.coroutines.BuildersKt__Builders_commonKt.launch$default(coroutineScope4, null, null, new androidx.compose.material.BackdropScaffoldKt$BackdropScaffold$1$1$swipeable$1.AnonymousClass2.AnonymousClass1(androidx.compose.material.BackdropScaffoldState.this, null), 3, null);
                                                                    }
                                                                    return true;
                                                                }

                                                                /* compiled from: BackdropScaffold.kt */
                                                                @kotlin.Metadata(k = 3, mv = {1, 6, 0}, xi = 48)
                                                                @kotlin.coroutines.jvm.internal.DebugMetadata(c = "androidx.compose.material.BackdropScaffoldKt$BackdropScaffold$1$1$swipeable$1$2$1", f = "BackdropScaffold.kt", i = {}, l = {336}, m = "invokeSuspend", n = {}, s = {})
                                                                /* renamed from: androidx.compose.material.BackdropScaffoldKt$BackdropScaffold$1$1$swipeable$1$2$1, reason: invalid class name */
                                                                static final class AnonymousClass1 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<kotlinx.coroutines.CoroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> {
                                                                    final /* synthetic */ androidx.compose.material.BackdropScaffoldState $scaffoldState;
                                                                    int label;

                                                                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                                                    AnonymousClass1(androidx.compose.material.BackdropScaffoldState backdropScaffoldState, kotlin.coroutines.Continuation<? super androidx.compose.material.BackdropScaffoldKt$BackdropScaffold$1$1$swipeable$1.AnonymousClass2.AnonymousClass1> continuation) {
                                                                        super(2, continuation);
                                                                        this.$scaffoldState = backdropScaffoldState;
                                                                    }

                                                                    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                                                                    public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object obj, kotlin.coroutines.Continuation<?> continuation) {
                                                                        return new androidx.compose.material.BackdropScaffoldKt$BackdropScaffold$1$1$swipeable$1.AnonymousClass2.AnonymousClass1(this.$scaffoldState, continuation);
                                                                    }

                                                                    @Override // kotlin.jvm.functions.Function2
                                                                    public final java.lang.Object invoke(kotlinx.coroutines.CoroutineScope coroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
                                                                        return ((androidx.compose.material.BackdropScaffoldKt$BackdropScaffold$1$1$swipeable$1.AnonymousClass2.AnonymousClass1) create(coroutineScope, continuation)).invokeSuspend(kotlin.Unit.INSTANCE);
                                                                    }

                                                                    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                                                                    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
                                                                        java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
                                                                        int i = this.label;
                                                                        if (i == 0) {
                                                                            kotlin.ResultKt.throwOnFailure(obj);
                                                                            this.label = 1;
                                                                            if (this.$scaffoldState.conceal(this) == coroutine_suspended) {
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
                                                androidx.compose.ui.Modifier.Companion companion3 = androidx.compose.ui.Modifier.INSTANCE;
                                                final androidx.compose.material.BackdropScaffoldState backdropScaffoldState9 = backdropScaffoldState7;
                                                composer4.startReplaceableGroup(1157296644);
                                                androidx.compose.runtime.ComposerKt.sourceInformation(composer4, "C(remember)P(1):Composables.kt#9igjgp");
                                                boolean changed2 = composer4.changed(backdropScaffoldState9);
                                                java.lang.Object rememberedValue3 = composer4.rememberedValue();
                                                if (changed2 || rememberedValue3 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                                                    rememberedValue3 = (kotlin.jvm.functions.Function1) new kotlin.jvm.functions.Function1<androidx.compose.ui.unit.Density, androidx.compose.ui.unit.IntOffset>() { // from class: androidx.compose.material.BackdropScaffoldKt$BackdropScaffold$1$1$1$1
                                                        {
                                                            super(1);
                                                        }

                                                        @Override // kotlin.jvm.functions.Function1
                                                        public /* bridge */ /* synthetic */ androidx.compose.ui.unit.IntOffset invoke(androidx.compose.ui.unit.Density density) {
                                                            return androidx.compose.ui.unit.IntOffset.m4601boximpl(m1238invokeBjo55l4(density));
                                                        }

                                                        /* renamed from: invoke-Bjo55l4, reason: not valid java name */
                                                        public final long m1238invokeBjo55l4(androidx.compose.ui.unit.Density offset) {
                                                            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(offset, "$this$offset");
                                                            return androidx.compose.ui.unit.IntOffsetKt.IntOffset(0, kotlin.math.MathKt.roundToInt(androidx.compose.material.BackdropScaffoldState.this.getOffset().getValue().floatValue()));
                                                        }
                                                    };
                                                    composer4.updateRememberedValue(rememberedValue3);
                                                }
                                                composer4.endReplaceableGroup();
                                                androidx.compose.ui.Modifier then = androidx.compose.foundation.layout.OffsetKt.offset(companion3, (kotlin.jvm.functions.Function1) rememberedValue3).then(semantics$default);
                                                androidx.compose.ui.graphics.Shape shape9 = shape8;
                                                long j29 = j25;
                                                long j30 = j26;
                                                float f22 = f16;
                                                final float f23 = f18;
                                                final kotlin.jvm.functions.Function2<? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.Unit> function23 = function22;
                                                final int i38 = i34;
                                                final long j31 = j27;
                                                final androidx.compose.material.BackdropScaffoldState backdropScaffoldState10 = backdropScaffoldState7;
                                                final int i39 = i35;
                                                final boolean z19 = z18;
                                                final kotlinx.coroutines.CoroutineScope coroutineScope3 = coroutineScope;
                                                androidx.compose.runtime.internal.ComposableLambda composableLambda22 = androidx.compose.runtime.internal.ComposableLambdaKt.composableLambda(composer4, -1065299503, true, new kotlin.jvm.functions.Function2<androidx.compose.runtime.Composer, java.lang.Integer, kotlin.Unit>() { // from class: androidx.compose.material.BackdropScaffoldKt.BackdropScaffold.1.1.2
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

                                                    public final void invoke(androidx.compose.runtime.Composer composer5, int i40) {
                                                        androidx.compose.runtime.ComposerKt.sourceInformation(composer5, "C351@15517L543:BackdropScaffold.kt#jmzs0o");
                                                        if ((i40 & 11) != 2 || !composer5.getSkipping()) {
                                                            androidx.compose.ui.Modifier m572paddingqDBjuR0$default = androidx.compose.foundation.layout.PaddingKt.m572paddingqDBjuR0$default(androidx.compose.ui.Modifier.INSTANCE, 0.0f, 0.0f, 0.0f, f23, 7, null);
                                                            kotlin.jvm.functions.Function2<androidx.compose.runtime.Composer, java.lang.Integer, kotlin.Unit> function24 = function23;
                                                            int i41 = i38;
                                                            long j32 = j31;
                                                            final androidx.compose.material.BackdropScaffoldState backdropScaffoldState11 = backdropScaffoldState10;
                                                            int i42 = i39;
                                                            final boolean z20 = z19;
                                                            final kotlinx.coroutines.CoroutineScope coroutineScope4 = coroutineScope3;
                                                            composer5.startReplaceableGroup(733328855);
                                                            androidx.compose.runtime.ComposerKt.sourceInformation(composer5, "C(Box)P(2,1,3)70@3267L67,71@3339L130:Box.kt#2w3rfo");
                                                            androidx.compose.ui.layout.MeasurePolicy rememberBoxMeasurePolicy = androidx.compose.foundation.layout.BoxKt.rememberBoxMeasurePolicy(androidx.compose.ui.Alignment.INSTANCE.getTopStart(), false, composer5, 0);
                                                            composer5.startReplaceableGroup(-1323940314);
                                                            androidx.compose.runtime.ComposerKt.sourceInformation(composer5, "C(Layout)P(!1,2)74@2915L7,75@2970L7,76@3029L7,77@3041L460:Layout.kt#80mrfh");
                                                            androidx.compose.runtime.ProvidableCompositionLocal<androidx.compose.ui.unit.Density> localDensity32 = androidx.compose.ui.platform.CompositionLocalsKt.getLocalDensity();
                                                            androidx.compose.runtime.ComposerKt.sourceInformationMarkerStart(composer5, 2023513938, "C:CompositionLocal.kt#9igjgp");
                                                            java.lang.Object consume32 = composer5.consume(localDensity32);
                                                            androidx.compose.runtime.ComposerKt.sourceInformationMarkerEnd(composer5);
                                                            androidx.compose.ui.unit.Density density = (androidx.compose.ui.unit.Density) consume32;
                                                            androidx.compose.runtime.ProvidableCompositionLocal<androidx.compose.ui.unit.LayoutDirection> localLayoutDirection = androidx.compose.ui.platform.CompositionLocalsKt.getLocalLayoutDirection();
                                                            androidx.compose.runtime.ComposerKt.sourceInformationMarkerStart(composer5, 2023513938, "C:CompositionLocal.kt#9igjgp");
                                                            java.lang.Object consume4 = composer5.consume(localLayoutDirection);
                                                            androidx.compose.runtime.ComposerKt.sourceInformationMarkerEnd(composer5);
                                                            androidx.compose.ui.unit.LayoutDirection layoutDirection = (androidx.compose.ui.unit.LayoutDirection) consume4;
                                                            androidx.compose.runtime.ProvidableCompositionLocal<androidx.compose.ui.platform.ViewConfiguration> localViewConfiguration = androidx.compose.ui.platform.CompositionLocalsKt.getLocalViewConfiguration();
                                                            androidx.compose.runtime.ComposerKt.sourceInformationMarkerStart(composer5, 2023513938, "C:CompositionLocal.kt#9igjgp");
                                                            java.lang.Object consume5 = composer5.consume(localViewConfiguration);
                                                            androidx.compose.runtime.ComposerKt.sourceInformationMarkerEnd(composer5);
                                                            androidx.compose.ui.platform.ViewConfiguration viewConfiguration = (androidx.compose.ui.platform.ViewConfiguration) consume5;
                                                            kotlin.jvm.functions.Function0<androidx.compose.ui.node.ComposeUiNode> constructor = androidx.compose.ui.node.ComposeUiNode.INSTANCE.getConstructor();
                                                            kotlin.jvm.functions.Function3<androidx.compose.runtime.SkippableUpdater<androidx.compose.ui.node.ComposeUiNode>, androidx.compose.runtime.Composer, java.lang.Integer, kotlin.Unit> materializerOf = androidx.compose.ui.layout.LayoutKt.materializerOf(m572paddingqDBjuR0$default);
                                                            if (!(composer5.getApplier() instanceof androidx.compose.runtime.Applier)) {
                                                                androidx.compose.runtime.ComposablesKt.invalidApplier();
                                                            }
                                                            composer5.startReusableNode();
                                                            if (composer5.getInserting()) {
                                                                composer5.createNode(constructor);
                                                            } else {
                                                                composer5.useNode();
                                                            }
                                                            composer5.disableReusing();
                                                            androidx.compose.runtime.Composer m1641constructorimpl = androidx.compose.runtime.Updater.m1641constructorimpl(composer5);
                                                            androidx.compose.runtime.Updater.m1648setimpl(m1641constructorimpl, rememberBoxMeasurePolicy, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetMeasurePolicy());
                                                            androidx.compose.runtime.Updater.m1648setimpl(m1641constructorimpl, density, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetDensity());
                                                            androidx.compose.runtime.Updater.m1648setimpl(m1641constructorimpl, layoutDirection, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetLayoutDirection());
                                                            androidx.compose.runtime.Updater.m1648setimpl(m1641constructorimpl, viewConfiguration, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetViewConfiguration());
                                                            composer5.enableReusing();
                                                            materializerOf.invoke(androidx.compose.runtime.SkippableUpdater.m1632boximpl(androidx.compose.runtime.SkippableUpdater.m1633constructorimpl(composer5)), composer5, 0);
                                                            composer5.startReplaceableGroup(2058660585);
                                                            composer5.startReplaceableGroup(-2137368960);
                                                            androidx.compose.runtime.ComposerKt.sourceInformation(composer5, "C72@3384L9:Box.kt#2w3rfo");
                                                            androidx.compose.foundation.layout.BoxScopeInstance boxScopeInstance = androidx.compose.foundation.layout.BoxScopeInstance.INSTANCE;
                                                            composer5.startReplaceableGroup(-1889954677);
                                                            androidx.compose.runtime.ComposerKt.sourceInformation(composer5, "C352@15582L19,353@15622L420:BackdropScaffold.kt#jmzs0o");
                                                            function24.invoke(composer5, java.lang.Integer.valueOf((i41 >> 6) & 14));
                                                            androidx.compose.material.BackdropScaffoldKt.m1233Scrim3JVO9M(j32, new kotlin.jvm.functions.Function0<kotlin.Unit>() { // from class: androidx.compose.material.BackdropScaffoldKt$BackdropScaffold$1$1$2$1$1
                                                                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                                                {
                                                                    super(0);
                                                                }

                                                                @Override // kotlin.jvm.functions.Function0
                                                                public /* bridge */ /* synthetic */ kotlin.Unit invoke() {
                                                                    invoke2();
                                                                    return kotlin.Unit.INSTANCE;
                                                                }

                                                                /* renamed from: invoke, reason: avoid collision after fix types in other method */
                                                                public final void invoke2() {
                                                                    if (z20 && backdropScaffoldState11.getConfirmStateChange$material_release().invoke(androidx.compose.material.BackdropValue.Concealed).booleanValue()) {
                                                                        kotlinx.coroutines.BuildersKt__Builders_commonKt.launch$default(coroutineScope4, null, null, new androidx.compose.material.BackdropScaffoldKt$BackdropScaffold$1$1$2$1$1.AnonymousClass1(backdropScaffoldState11, null), 3, null);
                                                                    }
                                                                }

                                                                /* compiled from: BackdropScaffold.kt */
                                                                @kotlin.Metadata(k = 3, mv = {1, 6, 0}, xi = 48)
                                                                @kotlin.coroutines.jvm.internal.DebugMetadata(c = "androidx.compose.material.BackdropScaffoldKt$BackdropScaffold$1$1$2$1$1$1", f = "BackdropScaffold.kt", i = {}, l = {358}, m = "invokeSuspend", n = {}, s = {})
                                                                /* renamed from: androidx.compose.material.BackdropScaffoldKt$BackdropScaffold$1$1$2$1$1$1, reason: invalid class name */
                                                                static final class AnonymousClass1 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<kotlinx.coroutines.CoroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> {
                                                                    final /* synthetic */ androidx.compose.material.BackdropScaffoldState $scaffoldState;
                                                                    int label;

                                                                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                                                    AnonymousClass1(androidx.compose.material.BackdropScaffoldState backdropScaffoldState, kotlin.coroutines.Continuation<? super androidx.compose.material.BackdropScaffoldKt$BackdropScaffold$1$1$2$1$1.AnonymousClass1> continuation) {
                                                                        super(2, continuation);
                                                                        this.$scaffoldState = backdropScaffoldState;
                                                                    }

                                                                    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                                                                    public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object obj, kotlin.coroutines.Continuation<?> continuation) {
                                                                        return new androidx.compose.material.BackdropScaffoldKt$BackdropScaffold$1$1$2$1$1.AnonymousClass1(this.$scaffoldState, continuation);
                                                                    }

                                                                    @Override // kotlin.jvm.functions.Function2
                                                                    public final java.lang.Object invoke(kotlinx.coroutines.CoroutineScope coroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
                                                                        return ((androidx.compose.material.BackdropScaffoldKt$BackdropScaffold$1$1$2$1$1.AnonymousClass1) create(coroutineScope, continuation)).invokeSuspend(kotlin.Unit.INSTANCE);
                                                                    }

                                                                    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                                                                    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
                                                                        java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
                                                                        int i = this.label;
                                                                        if (i == 0) {
                                                                            kotlin.ResultKt.throwOnFailure(obj);
                                                                            this.label = 1;
                                                                            if (this.$scaffoldState.conceal(this) == coroutine_suspended) {
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
                                                            }, backdropScaffoldState11.getTargetValue() == androidx.compose.material.BackdropValue.Revealed, composer5, (i42 >> 18) & 14);
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
                                                androidx.compose.material.SurfaceKt.m1511SurfaceFjzlyU(then, shape9, j29, j30, null, f22, composableLambda22, composer4, ((i40 >> 3) & 112) | 1572864 | ((i40 >> 6) & 896) | ((i40 >> 6) & 7168) | ((i40 << 6) & 458752), 16);
                                                androidx.compose.ui.Modifier.Companion companion4 = androidx.compose.ui.Modifier.INSTANCE;
                                                if (backdropScaffoldState7.isRevealed() && f21 == m4423getMaxHeightimpl - f14) {
                                                    m4478constructorimpl = f17;
                                                } else {
                                                    m4478constructorimpl = androidx.compose.ui.unit.Dp.m4478constructorimpl(0);
                                                }
                                                androidx.compose.ui.Modifier m572paddingqDBjuR0$default = androidx.compose.foundation.layout.PaddingKt.m572paddingqDBjuR0$default(companion4, 0.0f, 0.0f, 0.0f, m4478constructorimpl, 7, null);
                                                androidx.compose.ui.Alignment bottomCenter = androidx.compose.ui.Alignment.INSTANCE.getBottomCenter();
                                                kotlin.jvm.functions.Function3<androidx.compose.material.SnackbarHostState, androidx.compose.runtime.Composer, java.lang.Integer, kotlin.Unit> function37 = function36;
                                                androidx.compose.material.BackdropScaffoldState backdropScaffoldState11 = backdropScaffoldState7;
                                                int i41 = i35;
                                                composer4.startReplaceableGroup(733328855);
                                                androidx.compose.runtime.ComposerKt.sourceInformation(composer4, "C(Box)P(2,1,3)70@3267L67,71@3339L130:Box.kt#2w3rfo");
                                                androidx.compose.ui.layout.MeasurePolicy rememberBoxMeasurePolicy = androidx.compose.foundation.layout.BoxKt.rememberBoxMeasurePolicy(bottomCenter, false, composer4, 6);
                                                composer4.startReplaceableGroup(-1323940314);
                                                androidx.compose.runtime.ComposerKt.sourceInformation(composer4, "C(Layout)P(!1,2)74@2915L7,75@2970L7,76@3029L7,77@3041L460:Layout.kt#80mrfh");
                                                androidx.compose.runtime.ProvidableCompositionLocal<androidx.compose.ui.unit.Density> localDensity32 = androidx.compose.ui.platform.CompositionLocalsKt.getLocalDensity();
                                                androidx.compose.runtime.ComposerKt.sourceInformationMarkerStart(composer4, 2023513938, "C:CompositionLocal.kt#9igjgp");
                                                java.lang.Object consume32 = composer4.consume(localDensity32);
                                                androidx.compose.runtime.ComposerKt.sourceInformationMarkerEnd(composer4);
                                                androidx.compose.ui.unit.Density density = (androidx.compose.ui.unit.Density) consume32;
                                                androidx.compose.runtime.ProvidableCompositionLocal<androidx.compose.ui.unit.LayoutDirection> localLayoutDirection = androidx.compose.ui.platform.CompositionLocalsKt.getLocalLayoutDirection();
                                                androidx.compose.runtime.ComposerKt.sourceInformationMarkerStart(composer4, 2023513938, "C:CompositionLocal.kt#9igjgp");
                                                java.lang.Object consume4 = composer4.consume(localLayoutDirection);
                                                androidx.compose.runtime.ComposerKt.sourceInformationMarkerEnd(composer4);
                                                androidx.compose.ui.unit.LayoutDirection layoutDirection = (androidx.compose.ui.unit.LayoutDirection) consume4;
                                                androidx.compose.runtime.ProvidableCompositionLocal<androidx.compose.ui.platform.ViewConfiguration> localViewConfiguration = androidx.compose.ui.platform.CompositionLocalsKt.getLocalViewConfiguration();
                                                androidx.compose.runtime.ComposerKt.sourceInformationMarkerStart(composer4, 2023513938, "C:CompositionLocal.kt#9igjgp");
                                                java.lang.Object consume5 = composer4.consume(localViewConfiguration);
                                                androidx.compose.runtime.ComposerKt.sourceInformationMarkerEnd(composer4);
                                                androidx.compose.ui.platform.ViewConfiguration viewConfiguration = (androidx.compose.ui.platform.ViewConfiguration) consume5;
                                                kotlin.jvm.functions.Function0<androidx.compose.ui.node.ComposeUiNode> constructor = androidx.compose.ui.node.ComposeUiNode.INSTANCE.getConstructor();
                                                kotlin.jvm.functions.Function3<androidx.compose.runtime.SkippableUpdater<androidx.compose.ui.node.ComposeUiNode>, androidx.compose.runtime.Composer, java.lang.Integer, kotlin.Unit> materializerOf = androidx.compose.ui.layout.LayoutKt.materializerOf(m572paddingqDBjuR0$default);
                                                if (!(composer4.getApplier() instanceof androidx.compose.runtime.Applier)) {
                                                    androidx.compose.runtime.ComposablesKt.invalidApplier();
                                                }
                                                composer4.startReusableNode();
                                                if (composer4.getInserting()) {
                                                    composer4.createNode(constructor);
                                                } else {
                                                    composer4.useNode();
                                                }
                                                composer4.disableReusing();
                                                androidx.compose.runtime.Composer m1641constructorimpl = androidx.compose.runtime.Updater.m1641constructorimpl(composer4);
                                                androidx.compose.runtime.Updater.m1648setimpl(m1641constructorimpl, rememberBoxMeasurePolicy, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetMeasurePolicy());
                                                androidx.compose.runtime.Updater.m1648setimpl(m1641constructorimpl, density, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetDensity());
                                                androidx.compose.runtime.Updater.m1648setimpl(m1641constructorimpl, layoutDirection, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetLayoutDirection());
                                                androidx.compose.runtime.Updater.m1648setimpl(m1641constructorimpl, viewConfiguration, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetViewConfiguration());
                                                composer4.enableReusing();
                                                materializerOf.invoke(androidx.compose.runtime.SkippableUpdater.m1632boximpl(androidx.compose.runtime.SkippableUpdater.m1633constructorimpl(composer4)), composer4, 0);
                                                composer4.startReplaceableGroup(2058660585);
                                                composer4.startReplaceableGroup(-2137368960);
                                                androidx.compose.runtime.ComposerKt.sourceInformation(composer4, "C72@3384L9:Box.kt#2w3rfo");
                                                androidx.compose.foundation.layout.BoxScopeInstance boxScopeInstance = androidx.compose.foundation.layout.BoxScopeInstance.INSTANCE;
                                                composer4.startReplaceableGroup(1815906203);
                                                androidx.compose.runtime.ComposerKt.sourceInformation(composer4, "C375@16478L45:BackdropScaffold.kt#jmzs0o");
                                                function37.invoke(backdropScaffoldState11.getSnackbarHostState(), composer4, java.lang.Integer.valueOf((i41 >> 18) & 112));
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
                        z8 = z5;
                        z9 = z6;
                        z10 = z7;
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
                    androidx.compose.ui.graphics.Shape shape622 = shape3;
                    if ((i3 & 16384) == 0) {
                    }
                    if ((i3 & 32768) == 0) {
                    }
                    if ((i3 & 65536) == 0) {
                    }
                    if (i15 == 0) {
                    }
                    i23 = i21;
                    f6 = m1230getPeekHeightD9Ej5fM;
                    f7 = m1229getHeaderHeightD9Ej5fM;
                    startRestartGroup.endDefaults();
                    androidx.compose.runtime.ProvidableCompositionLocal<androidx.compose.ui.unit.Density> localDensity32 = androidx.compose.ui.platform.CompositionLocalsKt.getLocalDensity();
                    androidx.compose.runtime.ComposerKt.sourceInformationMarkerStart(startRestartGroup, 2023513938, "C:CompositionLocal.kt#9igjgp");
                    java.lang.Object consume32 = startRestartGroup.consume(localDensity32);
                    androidx.compose.runtime.ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                    final float mo315toPx0680j_432 = ((androidx.compose.ui.unit.Density) consume32).mo315toPx0680j_4(f6);
                    androidx.compose.runtime.ProvidableCompositionLocal<androidx.compose.ui.unit.Density> localDensity222 = androidx.compose.ui.platform.CompositionLocalsKt.getLocalDensity();
                    androidx.compose.runtime.ComposerKt.sourceInformationMarkerStart(startRestartGroup, 2023513938, "C:CompositionLocal.kt#9igjgp");
                    java.lang.Object consume222 = startRestartGroup.consume(localDensity222);
                    androidx.compose.runtime.ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                    final float mo315toPx0680j_4222 = ((androidx.compose.ui.unit.Density) consume222).mo315toPx0680j_4(f7);
                    final boolean z1422 = z6;
                    final androidx.compose.material.BackdropScaffoldState backdropScaffoldState422 = backdropScaffoldState3;
                    final int i2922 = i23;
                    final kotlin.jvm.functions.Function2<? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.Unit> composableLambda22 = androidx.compose.runtime.internal.ComposableLambdaKt.composableLambda(startRestartGroup, 1744778315, true, new kotlin.jvm.functions.Function2<androidx.compose.runtime.Composer, java.lang.Integer, kotlin.Unit>() { // from class: androidx.compose.material.BackdropScaffoldKt$BackdropScaffold$backLayer$1
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

                        public final void invoke(androidx.compose.runtime.Composer composer3, int i3022) {
                            androidx.compose.runtime.ComposerKt.sourceInformation(composer3, "C:BackdropScaffold.kt#jmzs0o");
                            if ((i3022 & 11) != 2 || !composer3.getSkipping()) {
                                if (z1422) {
                                    composer3.startReplaceableGroup(-1017265331);
                                    androidx.compose.runtime.ComposerKt.sourceInformation(composer3, "280@12876L82");
                                    kotlin.jvm.functions.Function2<androidx.compose.runtime.Composer, java.lang.Integer, kotlin.Unit> function2 = appBar;
                                    int i3122 = i2922;
                                    kotlin.jvm.functions.Function2<androidx.compose.runtime.Composer, java.lang.Integer, kotlin.Unit> function22 = backLayerContent;
                                    composer3.startReplaceableGroup(-483455358);
                                    androidx.compose.runtime.ComposerKt.sourceInformation(composer3, "C(Column)P(2,3,1)77@3880L61,78@3946L133:Column.kt#2w3rfo");
                                    androidx.compose.ui.Modifier.Companion companion2 = androidx.compose.ui.Modifier.INSTANCE;
                                    androidx.compose.ui.layout.MeasurePolicy columnMeasurePolicy = androidx.compose.foundation.layout.ColumnKt.columnMeasurePolicy(androidx.compose.foundation.layout.Arrangement.INSTANCE.getTop(), androidx.compose.ui.Alignment.INSTANCE.getStart(), composer3, 0);
                                    composer3.startReplaceableGroup(-1323940314);
                                    androidx.compose.runtime.ComposerKt.sourceInformation(composer3, "C(Layout)P(!1,2)74@2915L7,75@2970L7,76@3029L7,77@3041L460:Layout.kt#80mrfh");
                                    androidx.compose.runtime.ProvidableCompositionLocal<androidx.compose.ui.unit.Density> localDensity322 = androidx.compose.ui.platform.CompositionLocalsKt.getLocalDensity();
                                    androidx.compose.runtime.ComposerKt.sourceInformationMarkerStart(composer3, 2023513938, "C:CompositionLocal.kt#9igjgp");
                                    java.lang.Object consume322 = composer3.consume(localDensity322);
                                    androidx.compose.runtime.ComposerKt.sourceInformationMarkerEnd(composer3);
                                    androidx.compose.ui.unit.Density density = (androidx.compose.ui.unit.Density) consume322;
                                    androidx.compose.runtime.ProvidableCompositionLocal<androidx.compose.ui.unit.LayoutDirection> localLayoutDirection = androidx.compose.ui.platform.CompositionLocalsKt.getLocalLayoutDirection();
                                    androidx.compose.runtime.ComposerKt.sourceInformationMarkerStart(composer3, 2023513938, "C:CompositionLocal.kt#9igjgp");
                                    java.lang.Object consume4 = composer3.consume(localLayoutDirection);
                                    androidx.compose.runtime.ComposerKt.sourceInformationMarkerEnd(composer3);
                                    androidx.compose.ui.unit.LayoutDirection layoutDirection = (androidx.compose.ui.unit.LayoutDirection) consume4;
                                    androidx.compose.runtime.ProvidableCompositionLocal<androidx.compose.ui.platform.ViewConfiguration> localViewConfiguration = androidx.compose.ui.platform.CompositionLocalsKt.getLocalViewConfiguration();
                                    androidx.compose.runtime.ComposerKt.sourceInformationMarkerStart(composer3, 2023513938, "C:CompositionLocal.kt#9igjgp");
                                    java.lang.Object consume5 = composer3.consume(localViewConfiguration);
                                    androidx.compose.runtime.ComposerKt.sourceInformationMarkerEnd(composer3);
                                    androidx.compose.ui.platform.ViewConfiguration viewConfiguration = (androidx.compose.ui.platform.ViewConfiguration) consume5;
                                    kotlin.jvm.functions.Function0<androidx.compose.ui.node.ComposeUiNode> constructor = androidx.compose.ui.node.ComposeUiNode.INSTANCE.getConstructor();
                                    kotlin.jvm.functions.Function3<androidx.compose.runtime.SkippableUpdater<androidx.compose.ui.node.ComposeUiNode>, androidx.compose.runtime.Composer, java.lang.Integer, kotlin.Unit> materializerOf = androidx.compose.ui.layout.LayoutKt.materializerOf(companion2);
                                    if (!(composer3.getApplier() instanceof androidx.compose.runtime.Applier)) {
                                        androidx.compose.runtime.ComposablesKt.invalidApplier();
                                    }
                                    composer3.startReusableNode();
                                    if (composer3.getInserting()) {
                                        composer3.createNode(constructor);
                                    } else {
                                        composer3.useNode();
                                    }
                                    composer3.disableReusing();
                                    androidx.compose.runtime.Composer m1641constructorimpl = androidx.compose.runtime.Updater.m1641constructorimpl(composer3);
                                    androidx.compose.runtime.Updater.m1648setimpl(m1641constructorimpl, columnMeasurePolicy, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetMeasurePolicy());
                                    androidx.compose.runtime.Updater.m1648setimpl(m1641constructorimpl, density, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetDensity());
                                    androidx.compose.runtime.Updater.m1648setimpl(m1641constructorimpl, layoutDirection, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetLayoutDirection());
                                    androidx.compose.runtime.Updater.m1648setimpl(m1641constructorimpl, viewConfiguration, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetViewConfiguration());
                                    composer3.enableReusing();
                                    materializerOf.invoke(androidx.compose.runtime.SkippableUpdater.m1632boximpl(androidx.compose.runtime.SkippableUpdater.m1633constructorimpl(composer3)), composer3, 0);
                                    composer3.startReplaceableGroup(2058660585);
                                    composer3.startReplaceableGroup(-1163856341);
                                    androidx.compose.runtime.ComposerKt.sourceInformation(composer3, "C79@3994L9:Column.kt#2w3rfo");
                                    androidx.compose.foundation.layout.ColumnScopeInstance columnScopeInstance = androidx.compose.foundation.layout.ColumnScopeInstance.INSTANCE;
                                    composer3.startReplaceableGroup(-18835878);
                                    androidx.compose.runtime.ComposerKt.sourceInformation(composer3, "C281@12901L8,282@12926L18:BackdropScaffold.kt#jmzs0o");
                                    function2.invoke(composer3, java.lang.Integer.valueOf(i3122 & 14));
                                    function22.invoke(composer3, java.lang.Integer.valueOf((i3122 >> 3) & 14));
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
                                androidx.compose.runtime.ComposerKt.sourceInformation(composer3, "285@12988L72");
                                androidx.compose.material.BackdropValue targetValue = backdropScaffoldState422.getTargetValue();
                                kotlin.jvm.functions.Function2<androidx.compose.runtime.Composer, java.lang.Integer, kotlin.Unit> function23 = appBar;
                                kotlin.jvm.functions.Function2<androidx.compose.runtime.Composer, java.lang.Integer, kotlin.Unit> function24 = backLayerContent;
                                int i3222 = i2922;
                                androidx.compose.material.BackdropScaffoldKt.BackLayerTransition(targetValue, function23, function24, composer3, ((i3222 << 3) & 896) | ((i3222 << 3) & 112));
                                composer3.endReplaceableGroup();
                                return;
                            }
                            composer3.skipToGroupEnd();
                        }
                    });
                    java.lang.Float valueOf22 = java.lang.Float.valueOf(mo315toPx0680j_4222);
                    startRestartGroup.startReplaceableGroup(1157296644);
                    androidx.compose.runtime.ComposerKt.sourceInformation(startRestartGroup, "C(remember)P(1):Composables.kt#9igjgp");
                    changed = startRestartGroup.changed(valueOf22);
                    rememberedValue = startRestartGroup.rememberedValue();
                    if (!changed) {
                    }
                    rememberedValue = (kotlin.jvm.functions.Function1) new kotlin.jvm.functions.Function1<androidx.compose.ui.unit.Constraints, androidx.compose.ui.unit.Constraints>() { // from class: androidx.compose.material.BackdropScaffoldKt$BackdropScaffold$calculateBackLayerConstraints$1$1
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        {
                            super(1);
                        }

                        @Override // kotlin.jvm.functions.Function1
                        public /* bridge */ /* synthetic */ androidx.compose.ui.unit.Constraints invoke(androidx.compose.ui.unit.Constraints constraints) {
                            return androidx.compose.ui.unit.Constraints.m4412boximpl(m1239invokeZezNO4M(constraints.getValue()));
                        }

                        /* renamed from: invoke-ZezNO4M, reason: not valid java name */
                        public final long m1239invokeZezNO4M(long j2222) {
                            return androidx.compose.ui.unit.ConstraintsKt.m4441offsetNN6EwU$default(androidx.compose.ui.unit.Constraints.m4415copyZbe2FdA$default(j2222, 0, 0, 0, 0, 10, null), 0, -kotlin.math.MathKt.roundToInt(mo315toPx0680j_4222), 1, null);
                        }
                    };
                    startRestartGroup.updateRememberedValue(rememberedValue);
                    startRestartGroup.endReplaceableGroup();
                    final kotlin.jvm.functions.Function1<? super androidx.compose.ui.unit.Constraints, androidx.compose.ui.unit.Constraints> function122 = (kotlin.jvm.functions.Function1) rememberedValue;
                    final androidx.compose.ui.Modifier modifier522 = modifier4;
                    final boolean z1522 = z7;
                    final boolean z1622 = z5;
                    final float f1122 = f7;
                    final androidx.compose.material.BackdropScaffoldState backdropScaffoldState522 = backdropScaffoldState3;
                    final float f1222 = f6;
                    androidx.compose.material.BackdropScaffoldState backdropScaffoldState622 = backdropScaffoldState3;
                    composer2 = startRestartGroup;
                    final int i3022 = i23;
                    final androidx.compose.ui.graphics.Shape shape722 = shape4;
                    final long j2222 = j16;
                    final long j2322 = j14;
                    final float f1322 = f5;
                    final int i3122 = i22;
                    final long j2422 = j12;
                    final kotlin.jvm.functions.Function3<? super androidx.compose.material.SnackbarHostState, ? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.Unit> function3522 = function33;
                    int i3222 = i22 << 6;
                    androidx.compose.material.SurfaceKt.m1511SurfaceFjzlyU(null, null, j13, j15, null, 0.0f, androidx.compose.runtime.internal.ComposableLambdaKt.composableLambda(composer2, -1049909631, true, new kotlin.jvm.functions.Function2<androidx.compose.runtime.Composer, java.lang.Integer, kotlin.Unit>() { // from class: androidx.compose.material.BackdropScaffoldKt$BackdropScaffold$1
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

                        public final void invoke(androidx.compose.runtime.Composer composer3, int i33) {
                            androidx.compose.runtime.ComposerKt.sourceInformation(composer3, "C297@13395L24,298@13428L3119:BackdropScaffold.kt#jmzs0o");
                            if ((i33 & 11) != 2 || !composer3.getSkipping()) {
                                composer3.startReplaceableGroup(773894976);
                                androidx.compose.runtime.ComposerKt.sourceInformation(composer3, "C(rememberCoroutineScope)475@19849L144:Effects.kt#9igjgp");
                                composer3.startReplaceableGroup(-492369756);
                                androidx.compose.runtime.ComposerKt.sourceInformation(composer3, "C(remember):Composables.kt#9igjgp");
                                java.lang.Object rememberedValue2 = composer3.rememberedValue();
                                if (rememberedValue2 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                                    androidx.compose.runtime.CompositionScopedCoroutineScopeCanceller compositionScopedCoroutineScopeCanceller = new androidx.compose.runtime.CompositionScopedCoroutineScopeCanceller(androidx.compose.runtime.EffectsKt.createCompositionCoroutineScope(kotlin.coroutines.EmptyCoroutineContext.INSTANCE, composer3));
                                    composer3.updateRememberedValue(compositionScopedCoroutineScopeCanceller);
                                    rememberedValue2 = compositionScopedCoroutineScopeCanceller;
                                }
                                composer3.endReplaceableGroup();
                                final kotlinx.coroutines.CoroutineScope coroutineScope = ((androidx.compose.runtime.CompositionScopedCoroutineScopeCanceller) rememberedValue2).getCoroutineScope();
                                composer3.endReplaceableGroup();
                                androidx.compose.ui.Modifier fillMaxSize$default = androidx.compose.foundation.layout.SizeKt.fillMaxSize$default(androidx.compose.ui.Modifier.this, 0.0f, 1, null);
                                kotlin.jvm.functions.Function2<androidx.compose.runtime.Composer, java.lang.Integer, kotlin.Unit> function2 = composableLambda22;
                                kotlin.jvm.functions.Function1<androidx.compose.ui.unit.Constraints, androidx.compose.ui.unit.Constraints> function1222 = function122;
                                final float f14 = mo315toPx0680j_4222;
                                final boolean z17 = z1522;
                                final boolean z18 = z1622;
                                final androidx.compose.material.BackdropScaffoldState backdropScaffoldState7 = backdropScaffoldState522;
                                final float f15 = mo315toPx0680j_432;
                                final int i34 = i3022;
                                final androidx.compose.ui.graphics.Shape shape8 = shape722;
                                final long j25 = j2222;
                                final long j26 = j2322;
                                final float f16 = f1322;
                                final int i35 = i3122;
                                final float f17 = f1122;
                                final float f18 = f1222;
                                final kotlin.jvm.functions.Function2<? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.Unit> function22 = frontLayerContent;
                                final long j27 = j2422;
                                final kotlin.jvm.functions.Function3<? super androidx.compose.material.SnackbarHostState, ? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.Unit> function36 = function3522;
                                androidx.compose.material.BackdropScaffoldKt.BackdropStack(fillMaxSize$default, function2, function1222, androidx.compose.runtime.internal.ComposableLambdaKt.composableLambda(composer3, 1800047509, true, new kotlin.jvm.functions.Function4<androidx.compose.ui.unit.Constraints, java.lang.Float, androidx.compose.runtime.Composer, java.lang.Integer, kotlin.Unit>() { // from class: androidx.compose.material.BackdropScaffoldKt$BackdropScaffold$1.1
                                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                    /* JADX WARN: Multi-variable type inference failed */
                                    {
                                        super(4);
                                    }

                                    @Override // kotlin.jvm.functions.Function4
                                    public /* bridge */ /* synthetic */ kotlin.Unit invoke(androidx.compose.ui.unit.Constraints constraints, java.lang.Float f19, androidx.compose.runtime.Composer composer4, java.lang.Integer num) {
                                        m1237invokejYbf7pk(constraints.getValue(), f19.floatValue(), composer4, num.intValue());
                                        return kotlin.Unit.INSTANCE;
                                    }

                                    /* renamed from: invoke-jYbf7pk, reason: not valid java name */
                                    public final void m1237invokejYbf7pk(long j28, float f19, androidx.compose.runtime.Composer composer4, int i36) {
                                        int i37;
                                        androidx.compose.ui.Modifier.Companion companion2;
                                        androidx.compose.ui.Modifier m1521swipeablepPrIpRY;
                                        float m4478constructorimpl;
                                        androidx.compose.runtime.ComposerKt.sourceInformation(composer4, "CP(1:c#ui.unit.Constraints)344@15194L57,342@15132L942,366@16117L420:BackdropScaffold.kt#jmzs0o");
                                        if ((i36 & 14) == 0) {
                                            i37 = i36 | (composer4.changed(j28) ? 4 : 2);
                                        } else {
                                            i37 = i36;
                                        }
                                        if ((i36 & 112) == 0) {
                                            i37 |= composer4.changed(f19) ? 32 : 16;
                                        }
                                        if ((i37 & 731) != 146 || !composer4.getSkipping()) {
                                            float m4423getMaxHeightimpl = androidx.compose.ui.unit.Constraints.m4423getMaxHeightimpl(j28);
                                            float f20 = m4423getMaxHeightimpl - f14;
                                            if (z17) {
                                                f20 = java.lang.Math.min(f20, f19);
                                            }
                                            float f21 = f20;
                                            if (z18) {
                                                companion2 = androidx.compose.ui.input.nestedscroll.NestedScrollModifierKt.nestedScroll$default(androidx.compose.ui.Modifier.INSTANCE, backdropScaffoldState7.getNestedScrollConnection(), null, 2, null);
                                            } else {
                                                companion2 = androidx.compose.ui.Modifier.INSTANCE;
                                            }
                                            m1521swipeablepPrIpRY = androidx.compose.material.SwipeableKt.m1521swipeablepPrIpRY(androidx.compose.ui.Modifier.INSTANCE.then(companion2), backdropScaffoldState7, r18, androidx.compose.foundation.gestures.Orientation.Vertical, (r26 & 8) != 0 ? true : z18, (r26 & 16) != 0 ? false : false, (r26 & 32) != 0 ? null : null, (r26 & 64) != 0 ? new kotlin.jvm.functions.Function2<T, T, androidx.compose.material.FixedThreshold>() { // from class: androidx.compose.material.SwipeableKt$swipeable$1
                                                /* JADX WARN: Can't rename method to resolve collision */
                                                @Override // kotlin.jvm.functions.Function2
                                                public final androidx.compose.material.FixedThreshold invoke(T t, T t2) {
                                                    return new androidx.compose.material.FixedThreshold(androidx.compose.ui.unit.Dp.m4478constructorimpl(56), null);
                                                }
                                            } : null, (r26 & 128) != 0 ? androidx.compose.material.SwipeableDefaults.resistanceConfig$default(androidx.compose.material.SwipeableDefaults.INSTANCE, kotlin.collections.MapsKt.mapOf(kotlin.TuplesKt.to(java.lang.Float.valueOf(f15), androidx.compose.material.BackdropValue.Concealed), kotlin.TuplesKt.to(java.lang.Float.valueOf(f21), androidx.compose.material.BackdropValue.Revealed)).keySet(), 0.0f, 0.0f, 6, null) : null, (r26 & 256) != 0 ? androidx.compose.material.SwipeableDefaults.INSTANCE.m1520getVelocityThresholdD9Ej5fM() : 0.0f);
                                            final androidx.compose.material.BackdropScaffoldState backdropScaffoldState8 = backdropScaffoldState7;
                                            final kotlinx.coroutines.CoroutineScope coroutineScope2 = coroutineScope;
                                            androidx.compose.ui.Modifier semantics$default = androidx.compose.ui.semantics.SemanticsModifierKt.semantics$default(m1521swipeablepPrIpRY, false, new kotlin.jvm.functions.Function1<androidx.compose.ui.semantics.SemanticsPropertyReceiver, kotlin.Unit>() { // from class: androidx.compose.material.BackdropScaffoldKt$BackdropScaffold$1$1$swipeable$1
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
                                                    if (androidx.compose.material.BackdropScaffoldState.this.isConcealed()) {
                                                        final androidx.compose.material.BackdropScaffoldState backdropScaffoldState9 = androidx.compose.material.BackdropScaffoldState.this;
                                                        final kotlinx.coroutines.CoroutineScope coroutineScope3 = coroutineScope2;
                                                        androidx.compose.ui.semantics.SemanticsPropertiesKt.collapse$default(semantics, null, new kotlin.jvm.functions.Function0<java.lang.Boolean>() { // from class: androidx.compose.material.BackdropScaffoldKt$BackdropScaffold$1$1$swipeable$1.1
                                                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                                            {
                                                                super(0);
                                                            }

                                                            /* JADX WARN: Can't rename method to resolve collision */
                                                            @Override // kotlin.jvm.functions.Function0
                                                            public final java.lang.Boolean invoke() {
                                                                if (androidx.compose.material.BackdropScaffoldState.this.getConfirmStateChange$material_release().invoke(androidx.compose.material.BackdropValue.Revealed).booleanValue()) {
                                                                    kotlinx.coroutines.BuildersKt__Builders_commonKt.launch$default(coroutineScope3, null, null, new androidx.compose.material.BackdropScaffoldKt$BackdropScaffold$1$1$swipeable$1.AnonymousClass1.C00371(androidx.compose.material.BackdropScaffoldState.this, null), 3, null);
                                                                }
                                                                return true;
                                                            }

                                                            /* compiled from: BackdropScaffold.kt */
                                                            @kotlin.Metadata(k = 3, mv = {1, 6, 0}, xi = 48)
                                                            @kotlin.coroutines.jvm.internal.DebugMetadata(c = "androidx.compose.material.BackdropScaffoldKt$BackdropScaffold$1$1$swipeable$1$1$1", f = "BackdropScaffold.kt", i = {}, l = {330}, m = "invokeSuspend", n = {}, s = {})
                                                            /* renamed from: androidx.compose.material.BackdropScaffoldKt$BackdropScaffold$1$1$swipeable$1$1$1, reason: invalid class name and collision with other inner class name */
                                                            static final class C00371 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<kotlinx.coroutines.CoroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> {
                                                                final /* synthetic */ androidx.compose.material.BackdropScaffoldState $scaffoldState;
                                                                int label;

                                                                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                                                C00371(androidx.compose.material.BackdropScaffoldState backdropScaffoldState, kotlin.coroutines.Continuation<? super androidx.compose.material.BackdropScaffoldKt$BackdropScaffold$1$1$swipeable$1.AnonymousClass1.C00371> continuation) {
                                                                    super(2, continuation);
                                                                    this.$scaffoldState = backdropScaffoldState;
                                                                }

                                                                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                                                                public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object obj, kotlin.coroutines.Continuation<?> continuation) {
                                                                    return new androidx.compose.material.BackdropScaffoldKt$BackdropScaffold$1$1$swipeable$1.AnonymousClass1.C00371(this.$scaffoldState, continuation);
                                                                }

                                                                @Override // kotlin.jvm.functions.Function2
                                                                public final java.lang.Object invoke(kotlinx.coroutines.CoroutineScope coroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
                                                                    return ((androidx.compose.material.BackdropScaffoldKt$BackdropScaffold$1$1$swipeable$1.AnonymousClass1.C00371) create(coroutineScope, continuation)).invokeSuspend(kotlin.Unit.INSTANCE);
                                                                }

                                                                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                                                                public final java.lang.Object invokeSuspend(java.lang.Object obj) {
                                                                    java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
                                                                    int i = this.label;
                                                                    if (i == 0) {
                                                                        kotlin.ResultKt.throwOnFailure(obj);
                                                                        this.label = 1;
                                                                        if (this.$scaffoldState.reveal(this) == coroutine_suspended) {
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
                                                        final androidx.compose.material.BackdropScaffoldState backdropScaffoldState10 = androidx.compose.material.BackdropScaffoldState.this;
                                                        final kotlinx.coroutines.CoroutineScope coroutineScope4 = coroutineScope2;
                                                        androidx.compose.ui.semantics.SemanticsPropertiesKt.expand$default(semantics, null, new kotlin.jvm.functions.Function0<java.lang.Boolean>() { // from class: androidx.compose.material.BackdropScaffoldKt$BackdropScaffold$1$1$swipeable$1.2
                                                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                                            {
                                                                super(0);
                                                            }

                                                            /* JADX WARN: Can't rename method to resolve collision */
                                                            @Override // kotlin.jvm.functions.Function0
                                                            public final java.lang.Boolean invoke() {
                                                                if (androidx.compose.material.BackdropScaffoldState.this.getConfirmStateChange$material_release().invoke(androidx.compose.material.BackdropValue.Concealed).booleanValue()) {
                                                                    kotlinx.coroutines.BuildersKt__Builders_commonKt.launch$default(coroutineScope4, null, null, new androidx.compose.material.BackdropScaffoldKt$BackdropScaffold$1$1$swipeable$1.AnonymousClass2.AnonymousClass1(androidx.compose.material.BackdropScaffoldState.this, null), 3, null);
                                                                }
                                                                return true;
                                                            }

                                                            /* compiled from: BackdropScaffold.kt */
                                                            @kotlin.Metadata(k = 3, mv = {1, 6, 0}, xi = 48)
                                                            @kotlin.coroutines.jvm.internal.DebugMetadata(c = "androidx.compose.material.BackdropScaffoldKt$BackdropScaffold$1$1$swipeable$1$2$1", f = "BackdropScaffold.kt", i = {}, l = {336}, m = "invokeSuspend", n = {}, s = {})
                                                            /* renamed from: androidx.compose.material.BackdropScaffoldKt$BackdropScaffold$1$1$swipeable$1$2$1, reason: invalid class name */
                                                            static final class AnonymousClass1 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<kotlinx.coroutines.CoroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> {
                                                                final /* synthetic */ androidx.compose.material.BackdropScaffoldState $scaffoldState;
                                                                int label;

                                                                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                                                AnonymousClass1(androidx.compose.material.BackdropScaffoldState backdropScaffoldState, kotlin.coroutines.Continuation<? super androidx.compose.material.BackdropScaffoldKt$BackdropScaffold$1$1$swipeable$1.AnonymousClass2.AnonymousClass1> continuation) {
                                                                    super(2, continuation);
                                                                    this.$scaffoldState = backdropScaffoldState;
                                                                }

                                                                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                                                                public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object obj, kotlin.coroutines.Continuation<?> continuation) {
                                                                    return new androidx.compose.material.BackdropScaffoldKt$BackdropScaffold$1$1$swipeable$1.AnonymousClass2.AnonymousClass1(this.$scaffoldState, continuation);
                                                                }

                                                                @Override // kotlin.jvm.functions.Function2
                                                                public final java.lang.Object invoke(kotlinx.coroutines.CoroutineScope coroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
                                                                    return ((androidx.compose.material.BackdropScaffoldKt$BackdropScaffold$1$1$swipeable$1.AnonymousClass2.AnonymousClass1) create(coroutineScope, continuation)).invokeSuspend(kotlin.Unit.INSTANCE);
                                                                }

                                                                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                                                                public final java.lang.Object invokeSuspend(java.lang.Object obj) {
                                                                    java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
                                                                    int i = this.label;
                                                                    if (i == 0) {
                                                                        kotlin.ResultKt.throwOnFailure(obj);
                                                                        this.label = 1;
                                                                        if (this.$scaffoldState.conceal(this) == coroutine_suspended) {
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
                                            androidx.compose.ui.Modifier.Companion companion3 = androidx.compose.ui.Modifier.INSTANCE;
                                            final androidx.compose.material.BackdropScaffoldState backdropScaffoldState9 = backdropScaffoldState7;
                                            composer4.startReplaceableGroup(1157296644);
                                            androidx.compose.runtime.ComposerKt.sourceInformation(composer4, "C(remember)P(1):Composables.kt#9igjgp");
                                            boolean changed2 = composer4.changed(backdropScaffoldState9);
                                            java.lang.Object rememberedValue3 = composer4.rememberedValue();
                                            if (changed2 || rememberedValue3 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                                                rememberedValue3 = (kotlin.jvm.functions.Function1) new kotlin.jvm.functions.Function1<androidx.compose.ui.unit.Density, androidx.compose.ui.unit.IntOffset>() { // from class: androidx.compose.material.BackdropScaffoldKt$BackdropScaffold$1$1$1$1
                                                    {
                                                        super(1);
                                                    }

                                                    @Override // kotlin.jvm.functions.Function1
                                                    public /* bridge */ /* synthetic */ androidx.compose.ui.unit.IntOffset invoke(androidx.compose.ui.unit.Density density) {
                                                        return androidx.compose.ui.unit.IntOffset.m4601boximpl(m1238invokeBjo55l4(density));
                                                    }

                                                    /* renamed from: invoke-Bjo55l4, reason: not valid java name */
                                                    public final long m1238invokeBjo55l4(androidx.compose.ui.unit.Density offset) {
                                                        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(offset, "$this$offset");
                                                        return androidx.compose.ui.unit.IntOffsetKt.IntOffset(0, kotlin.math.MathKt.roundToInt(androidx.compose.material.BackdropScaffoldState.this.getOffset().getValue().floatValue()));
                                                    }
                                                };
                                                composer4.updateRememberedValue(rememberedValue3);
                                            }
                                            composer4.endReplaceableGroup();
                                            androidx.compose.ui.Modifier then = androidx.compose.foundation.layout.OffsetKt.offset(companion3, (kotlin.jvm.functions.Function1) rememberedValue3).then(semantics$default);
                                            androidx.compose.ui.graphics.Shape shape9 = shape8;
                                            long j29 = j25;
                                            long j30 = j26;
                                            float f22 = f16;
                                            final float f23 = f18;
                                            final kotlin.jvm.functions.Function2<? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.Unit> function23 = function22;
                                            final int i38 = i34;
                                            final long j31 = j27;
                                            final androidx.compose.material.BackdropScaffoldState backdropScaffoldState10 = backdropScaffoldState7;
                                            final int i39 = i35;
                                            final boolean z19 = z18;
                                            final kotlinx.coroutines.CoroutineScope coroutineScope3 = coroutineScope;
                                            androidx.compose.runtime.internal.ComposableLambda composableLambda222 = androidx.compose.runtime.internal.ComposableLambdaKt.composableLambda(composer4, -1065299503, true, new kotlin.jvm.functions.Function2<androidx.compose.runtime.Composer, java.lang.Integer, kotlin.Unit>() { // from class: androidx.compose.material.BackdropScaffoldKt.BackdropScaffold.1.1.2
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

                                                public final void invoke(androidx.compose.runtime.Composer composer5, int i40) {
                                                    androidx.compose.runtime.ComposerKt.sourceInformation(composer5, "C351@15517L543:BackdropScaffold.kt#jmzs0o");
                                                    if ((i40 & 11) != 2 || !composer5.getSkipping()) {
                                                        androidx.compose.ui.Modifier m572paddingqDBjuR0$default = androidx.compose.foundation.layout.PaddingKt.m572paddingqDBjuR0$default(androidx.compose.ui.Modifier.INSTANCE, 0.0f, 0.0f, 0.0f, f23, 7, null);
                                                        kotlin.jvm.functions.Function2<androidx.compose.runtime.Composer, java.lang.Integer, kotlin.Unit> function24 = function23;
                                                        int i41 = i38;
                                                        long j32 = j31;
                                                        final androidx.compose.material.BackdropScaffoldState backdropScaffoldState11 = backdropScaffoldState10;
                                                        int i42 = i39;
                                                        final boolean z20 = z19;
                                                        final kotlinx.coroutines.CoroutineScope coroutineScope4 = coroutineScope3;
                                                        composer5.startReplaceableGroup(733328855);
                                                        androidx.compose.runtime.ComposerKt.sourceInformation(composer5, "C(Box)P(2,1,3)70@3267L67,71@3339L130:Box.kt#2w3rfo");
                                                        androidx.compose.ui.layout.MeasurePolicy rememberBoxMeasurePolicy = androidx.compose.foundation.layout.BoxKt.rememberBoxMeasurePolicy(androidx.compose.ui.Alignment.INSTANCE.getTopStart(), false, composer5, 0);
                                                        composer5.startReplaceableGroup(-1323940314);
                                                        androidx.compose.runtime.ComposerKt.sourceInformation(composer5, "C(Layout)P(!1,2)74@2915L7,75@2970L7,76@3029L7,77@3041L460:Layout.kt#80mrfh");
                                                        androidx.compose.runtime.ProvidableCompositionLocal<androidx.compose.ui.unit.Density> localDensity322 = androidx.compose.ui.platform.CompositionLocalsKt.getLocalDensity();
                                                        androidx.compose.runtime.ComposerKt.sourceInformationMarkerStart(composer5, 2023513938, "C:CompositionLocal.kt#9igjgp");
                                                        java.lang.Object consume322 = composer5.consume(localDensity322);
                                                        androidx.compose.runtime.ComposerKt.sourceInformationMarkerEnd(composer5);
                                                        androidx.compose.ui.unit.Density density = (androidx.compose.ui.unit.Density) consume322;
                                                        androidx.compose.runtime.ProvidableCompositionLocal<androidx.compose.ui.unit.LayoutDirection> localLayoutDirection = androidx.compose.ui.platform.CompositionLocalsKt.getLocalLayoutDirection();
                                                        androidx.compose.runtime.ComposerKt.sourceInformationMarkerStart(composer5, 2023513938, "C:CompositionLocal.kt#9igjgp");
                                                        java.lang.Object consume4 = composer5.consume(localLayoutDirection);
                                                        androidx.compose.runtime.ComposerKt.sourceInformationMarkerEnd(composer5);
                                                        androidx.compose.ui.unit.LayoutDirection layoutDirection = (androidx.compose.ui.unit.LayoutDirection) consume4;
                                                        androidx.compose.runtime.ProvidableCompositionLocal<androidx.compose.ui.platform.ViewConfiguration> localViewConfiguration = androidx.compose.ui.platform.CompositionLocalsKt.getLocalViewConfiguration();
                                                        androidx.compose.runtime.ComposerKt.sourceInformationMarkerStart(composer5, 2023513938, "C:CompositionLocal.kt#9igjgp");
                                                        java.lang.Object consume5 = composer5.consume(localViewConfiguration);
                                                        androidx.compose.runtime.ComposerKt.sourceInformationMarkerEnd(composer5);
                                                        androidx.compose.ui.platform.ViewConfiguration viewConfiguration = (androidx.compose.ui.platform.ViewConfiguration) consume5;
                                                        kotlin.jvm.functions.Function0<androidx.compose.ui.node.ComposeUiNode> constructor = androidx.compose.ui.node.ComposeUiNode.INSTANCE.getConstructor();
                                                        kotlin.jvm.functions.Function3<androidx.compose.runtime.SkippableUpdater<androidx.compose.ui.node.ComposeUiNode>, androidx.compose.runtime.Composer, java.lang.Integer, kotlin.Unit> materializerOf = androidx.compose.ui.layout.LayoutKt.materializerOf(m572paddingqDBjuR0$default);
                                                        if (!(composer5.getApplier() instanceof androidx.compose.runtime.Applier)) {
                                                            androidx.compose.runtime.ComposablesKt.invalidApplier();
                                                        }
                                                        composer5.startReusableNode();
                                                        if (composer5.getInserting()) {
                                                            composer5.createNode(constructor);
                                                        } else {
                                                            composer5.useNode();
                                                        }
                                                        composer5.disableReusing();
                                                        androidx.compose.runtime.Composer m1641constructorimpl = androidx.compose.runtime.Updater.m1641constructorimpl(composer5);
                                                        androidx.compose.runtime.Updater.m1648setimpl(m1641constructorimpl, rememberBoxMeasurePolicy, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetMeasurePolicy());
                                                        androidx.compose.runtime.Updater.m1648setimpl(m1641constructorimpl, density, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetDensity());
                                                        androidx.compose.runtime.Updater.m1648setimpl(m1641constructorimpl, layoutDirection, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetLayoutDirection());
                                                        androidx.compose.runtime.Updater.m1648setimpl(m1641constructorimpl, viewConfiguration, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetViewConfiguration());
                                                        composer5.enableReusing();
                                                        materializerOf.invoke(androidx.compose.runtime.SkippableUpdater.m1632boximpl(androidx.compose.runtime.SkippableUpdater.m1633constructorimpl(composer5)), composer5, 0);
                                                        composer5.startReplaceableGroup(2058660585);
                                                        composer5.startReplaceableGroup(-2137368960);
                                                        androidx.compose.runtime.ComposerKt.sourceInformation(composer5, "C72@3384L9:Box.kt#2w3rfo");
                                                        androidx.compose.foundation.layout.BoxScopeInstance boxScopeInstance = androidx.compose.foundation.layout.BoxScopeInstance.INSTANCE;
                                                        composer5.startReplaceableGroup(-1889954677);
                                                        androidx.compose.runtime.ComposerKt.sourceInformation(composer5, "C352@15582L19,353@15622L420:BackdropScaffold.kt#jmzs0o");
                                                        function24.invoke(composer5, java.lang.Integer.valueOf((i41 >> 6) & 14));
                                                        androidx.compose.material.BackdropScaffoldKt.m1233Scrim3JVO9M(j32, new kotlin.jvm.functions.Function0<kotlin.Unit>() { // from class: androidx.compose.material.BackdropScaffoldKt$BackdropScaffold$1$1$2$1$1
                                                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                                            {
                                                                super(0);
                                                            }

                                                            @Override // kotlin.jvm.functions.Function0
                                                            public /* bridge */ /* synthetic */ kotlin.Unit invoke() {
                                                                invoke2();
                                                                return kotlin.Unit.INSTANCE;
                                                            }

                                                            /* renamed from: invoke, reason: avoid collision after fix types in other method */
                                                            public final void invoke2() {
                                                                if (z20 && backdropScaffoldState11.getConfirmStateChange$material_release().invoke(androidx.compose.material.BackdropValue.Concealed).booleanValue()) {
                                                                    kotlinx.coroutines.BuildersKt__Builders_commonKt.launch$default(coroutineScope4, null, null, new androidx.compose.material.BackdropScaffoldKt$BackdropScaffold$1$1$2$1$1.AnonymousClass1(backdropScaffoldState11, null), 3, null);
                                                                }
                                                            }

                                                            /* compiled from: BackdropScaffold.kt */
                                                            @kotlin.Metadata(k = 3, mv = {1, 6, 0}, xi = 48)
                                                            @kotlin.coroutines.jvm.internal.DebugMetadata(c = "androidx.compose.material.BackdropScaffoldKt$BackdropScaffold$1$1$2$1$1$1", f = "BackdropScaffold.kt", i = {}, l = {358}, m = "invokeSuspend", n = {}, s = {})
                                                            /* renamed from: androidx.compose.material.BackdropScaffoldKt$BackdropScaffold$1$1$2$1$1$1, reason: invalid class name */
                                                            static final class AnonymousClass1 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<kotlinx.coroutines.CoroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> {
                                                                final /* synthetic */ androidx.compose.material.BackdropScaffoldState $scaffoldState;
                                                                int label;

                                                                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                                                AnonymousClass1(androidx.compose.material.BackdropScaffoldState backdropScaffoldState, kotlin.coroutines.Continuation<? super androidx.compose.material.BackdropScaffoldKt$BackdropScaffold$1$1$2$1$1.AnonymousClass1> continuation) {
                                                                    super(2, continuation);
                                                                    this.$scaffoldState = backdropScaffoldState;
                                                                }

                                                                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                                                                public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object obj, kotlin.coroutines.Continuation<?> continuation) {
                                                                    return new androidx.compose.material.BackdropScaffoldKt$BackdropScaffold$1$1$2$1$1.AnonymousClass1(this.$scaffoldState, continuation);
                                                                }

                                                                @Override // kotlin.jvm.functions.Function2
                                                                public final java.lang.Object invoke(kotlinx.coroutines.CoroutineScope coroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
                                                                    return ((androidx.compose.material.BackdropScaffoldKt$BackdropScaffold$1$1$2$1$1.AnonymousClass1) create(coroutineScope, continuation)).invokeSuspend(kotlin.Unit.INSTANCE);
                                                                }

                                                                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                                                                public final java.lang.Object invokeSuspend(java.lang.Object obj) {
                                                                    java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
                                                                    int i = this.label;
                                                                    if (i == 0) {
                                                                        kotlin.ResultKt.throwOnFailure(obj);
                                                                        this.label = 1;
                                                                        if (this.$scaffoldState.conceal(this) == coroutine_suspended) {
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
                                                        }, backdropScaffoldState11.getTargetValue() == androidx.compose.material.BackdropValue.Revealed, composer5, (i42 >> 18) & 14);
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
                                            androidx.compose.material.SurfaceKt.m1511SurfaceFjzlyU(then, shape9, j29, j30, null, f22, composableLambda222, composer4, ((i40 >> 3) & 112) | 1572864 | ((i40 >> 6) & 896) | ((i40 >> 6) & 7168) | ((i40 << 6) & 458752), 16);
                                            androidx.compose.ui.Modifier.Companion companion4 = androidx.compose.ui.Modifier.INSTANCE;
                                            if (backdropScaffoldState7.isRevealed() && f21 == m4423getMaxHeightimpl - f14) {
                                                m4478constructorimpl = f17;
                                            } else {
                                                m4478constructorimpl = androidx.compose.ui.unit.Dp.m4478constructorimpl(0);
                                            }
                                            androidx.compose.ui.Modifier m572paddingqDBjuR0$default = androidx.compose.foundation.layout.PaddingKt.m572paddingqDBjuR0$default(companion4, 0.0f, 0.0f, 0.0f, m4478constructorimpl, 7, null);
                                            androidx.compose.ui.Alignment bottomCenter = androidx.compose.ui.Alignment.INSTANCE.getBottomCenter();
                                            kotlin.jvm.functions.Function3<androidx.compose.material.SnackbarHostState, androidx.compose.runtime.Composer, java.lang.Integer, kotlin.Unit> function37 = function36;
                                            androidx.compose.material.BackdropScaffoldState backdropScaffoldState11 = backdropScaffoldState7;
                                            int i41 = i35;
                                            composer4.startReplaceableGroup(733328855);
                                            androidx.compose.runtime.ComposerKt.sourceInformation(composer4, "C(Box)P(2,1,3)70@3267L67,71@3339L130:Box.kt#2w3rfo");
                                            androidx.compose.ui.layout.MeasurePolicy rememberBoxMeasurePolicy = androidx.compose.foundation.layout.BoxKt.rememberBoxMeasurePolicy(bottomCenter, false, composer4, 6);
                                            composer4.startReplaceableGroup(-1323940314);
                                            androidx.compose.runtime.ComposerKt.sourceInformation(composer4, "C(Layout)P(!1,2)74@2915L7,75@2970L7,76@3029L7,77@3041L460:Layout.kt#80mrfh");
                                            androidx.compose.runtime.ProvidableCompositionLocal<androidx.compose.ui.unit.Density> localDensity322 = androidx.compose.ui.platform.CompositionLocalsKt.getLocalDensity();
                                            androidx.compose.runtime.ComposerKt.sourceInformationMarkerStart(composer4, 2023513938, "C:CompositionLocal.kt#9igjgp");
                                            java.lang.Object consume322 = composer4.consume(localDensity322);
                                            androidx.compose.runtime.ComposerKt.sourceInformationMarkerEnd(composer4);
                                            androidx.compose.ui.unit.Density density = (androidx.compose.ui.unit.Density) consume322;
                                            androidx.compose.runtime.ProvidableCompositionLocal<androidx.compose.ui.unit.LayoutDirection> localLayoutDirection = androidx.compose.ui.platform.CompositionLocalsKt.getLocalLayoutDirection();
                                            androidx.compose.runtime.ComposerKt.sourceInformationMarkerStart(composer4, 2023513938, "C:CompositionLocal.kt#9igjgp");
                                            java.lang.Object consume4 = composer4.consume(localLayoutDirection);
                                            androidx.compose.runtime.ComposerKt.sourceInformationMarkerEnd(composer4);
                                            androidx.compose.ui.unit.LayoutDirection layoutDirection = (androidx.compose.ui.unit.LayoutDirection) consume4;
                                            androidx.compose.runtime.ProvidableCompositionLocal<androidx.compose.ui.platform.ViewConfiguration> localViewConfiguration = androidx.compose.ui.platform.CompositionLocalsKt.getLocalViewConfiguration();
                                            androidx.compose.runtime.ComposerKt.sourceInformationMarkerStart(composer4, 2023513938, "C:CompositionLocal.kt#9igjgp");
                                            java.lang.Object consume5 = composer4.consume(localViewConfiguration);
                                            androidx.compose.runtime.ComposerKt.sourceInformationMarkerEnd(composer4);
                                            androidx.compose.ui.platform.ViewConfiguration viewConfiguration = (androidx.compose.ui.platform.ViewConfiguration) consume5;
                                            kotlin.jvm.functions.Function0<androidx.compose.ui.node.ComposeUiNode> constructor = androidx.compose.ui.node.ComposeUiNode.INSTANCE.getConstructor();
                                            kotlin.jvm.functions.Function3<androidx.compose.runtime.SkippableUpdater<androidx.compose.ui.node.ComposeUiNode>, androidx.compose.runtime.Composer, java.lang.Integer, kotlin.Unit> materializerOf = androidx.compose.ui.layout.LayoutKt.materializerOf(m572paddingqDBjuR0$default);
                                            if (!(composer4.getApplier() instanceof androidx.compose.runtime.Applier)) {
                                                androidx.compose.runtime.ComposablesKt.invalidApplier();
                                            }
                                            composer4.startReusableNode();
                                            if (composer4.getInserting()) {
                                                composer4.createNode(constructor);
                                            } else {
                                                composer4.useNode();
                                            }
                                            composer4.disableReusing();
                                            androidx.compose.runtime.Composer m1641constructorimpl = androidx.compose.runtime.Updater.m1641constructorimpl(composer4);
                                            androidx.compose.runtime.Updater.m1648setimpl(m1641constructorimpl, rememberBoxMeasurePolicy, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetMeasurePolicy());
                                            androidx.compose.runtime.Updater.m1648setimpl(m1641constructorimpl, density, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetDensity());
                                            androidx.compose.runtime.Updater.m1648setimpl(m1641constructorimpl, layoutDirection, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetLayoutDirection());
                                            androidx.compose.runtime.Updater.m1648setimpl(m1641constructorimpl, viewConfiguration, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetViewConfiguration());
                                            composer4.enableReusing();
                                            materializerOf.invoke(androidx.compose.runtime.SkippableUpdater.m1632boximpl(androidx.compose.runtime.SkippableUpdater.m1633constructorimpl(composer4)), composer4, 0);
                                            composer4.startReplaceableGroup(2058660585);
                                            composer4.startReplaceableGroup(-2137368960);
                                            androidx.compose.runtime.ComposerKt.sourceInformation(composer4, "C72@3384L9:Box.kt#2w3rfo");
                                            androidx.compose.foundation.layout.BoxScopeInstance boxScopeInstance = androidx.compose.foundation.layout.BoxScopeInstance.INSTANCE;
                                            composer4.startReplaceableGroup(1815906203);
                                            androidx.compose.runtime.ComposerKt.sourceInformation(composer4, "C375@16478L45:BackdropScaffold.kt#jmzs0o");
                                            function37.invoke(backdropScaffoldState11.getSnackbarHostState(), composer4, java.lang.Integer.valueOf((i41 >> 18) & 112));
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
                    z8 = z5;
                    z9 = z6;
                    z10 = z7;
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
                androidx.compose.ui.graphics.Shape shape6222 = shape3;
                if ((i3 & 16384) == 0) {
                }
                if ((i3 & 32768) == 0) {
                }
                if ((i3 & 65536) == 0) {
                }
                if (i15 == 0) {
                }
                i23 = i21;
                f6 = m1230getPeekHeightD9Ej5fM;
                f7 = m1229getHeaderHeightD9Ej5fM;
                startRestartGroup.endDefaults();
                androidx.compose.runtime.ProvidableCompositionLocal<androidx.compose.ui.unit.Density> localDensity322 = androidx.compose.ui.platform.CompositionLocalsKt.getLocalDensity();
                androidx.compose.runtime.ComposerKt.sourceInformationMarkerStart(startRestartGroup, 2023513938, "C:CompositionLocal.kt#9igjgp");
                java.lang.Object consume322 = startRestartGroup.consume(localDensity322);
                androidx.compose.runtime.ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                final float mo315toPx0680j_4322 = ((androidx.compose.ui.unit.Density) consume322).mo315toPx0680j_4(f6);
                androidx.compose.runtime.ProvidableCompositionLocal<androidx.compose.ui.unit.Density> localDensity2222 = androidx.compose.ui.platform.CompositionLocalsKt.getLocalDensity();
                androidx.compose.runtime.ComposerKt.sourceInformationMarkerStart(startRestartGroup, 2023513938, "C:CompositionLocal.kt#9igjgp");
                java.lang.Object consume2222 = startRestartGroup.consume(localDensity2222);
                androidx.compose.runtime.ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                final float mo315toPx0680j_42222 = ((androidx.compose.ui.unit.Density) consume2222).mo315toPx0680j_4(f7);
                final boolean z14222 = z6;
                final androidx.compose.material.BackdropScaffoldState backdropScaffoldState4222 = backdropScaffoldState3;
                final int i29222 = i23;
                final kotlin.jvm.functions.Function2<? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.Unit> composableLambda222 = androidx.compose.runtime.internal.ComposableLambdaKt.composableLambda(startRestartGroup, 1744778315, true, new kotlin.jvm.functions.Function2<androidx.compose.runtime.Composer, java.lang.Integer, kotlin.Unit>() { // from class: androidx.compose.material.BackdropScaffoldKt$BackdropScaffold$backLayer$1
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

                    public final void invoke(androidx.compose.runtime.Composer composer3, int i30222) {
                        androidx.compose.runtime.ComposerKt.sourceInformation(composer3, "C:BackdropScaffold.kt#jmzs0o");
                        if ((i30222 & 11) != 2 || !composer3.getSkipping()) {
                            if (z14222) {
                                composer3.startReplaceableGroup(-1017265331);
                                androidx.compose.runtime.ComposerKt.sourceInformation(composer3, "280@12876L82");
                                kotlin.jvm.functions.Function2<androidx.compose.runtime.Composer, java.lang.Integer, kotlin.Unit> function2 = appBar;
                                int i31222 = i29222;
                                kotlin.jvm.functions.Function2<androidx.compose.runtime.Composer, java.lang.Integer, kotlin.Unit> function22 = backLayerContent;
                                composer3.startReplaceableGroup(-483455358);
                                androidx.compose.runtime.ComposerKt.sourceInformation(composer3, "C(Column)P(2,3,1)77@3880L61,78@3946L133:Column.kt#2w3rfo");
                                androidx.compose.ui.Modifier.Companion companion2 = androidx.compose.ui.Modifier.INSTANCE;
                                androidx.compose.ui.layout.MeasurePolicy columnMeasurePolicy = androidx.compose.foundation.layout.ColumnKt.columnMeasurePolicy(androidx.compose.foundation.layout.Arrangement.INSTANCE.getTop(), androidx.compose.ui.Alignment.INSTANCE.getStart(), composer3, 0);
                                composer3.startReplaceableGroup(-1323940314);
                                androidx.compose.runtime.ComposerKt.sourceInformation(composer3, "C(Layout)P(!1,2)74@2915L7,75@2970L7,76@3029L7,77@3041L460:Layout.kt#80mrfh");
                                androidx.compose.runtime.ProvidableCompositionLocal<androidx.compose.ui.unit.Density> localDensity3222 = androidx.compose.ui.platform.CompositionLocalsKt.getLocalDensity();
                                androidx.compose.runtime.ComposerKt.sourceInformationMarkerStart(composer3, 2023513938, "C:CompositionLocal.kt#9igjgp");
                                java.lang.Object consume3222 = composer3.consume(localDensity3222);
                                androidx.compose.runtime.ComposerKt.sourceInformationMarkerEnd(composer3);
                                androidx.compose.ui.unit.Density density = (androidx.compose.ui.unit.Density) consume3222;
                                androidx.compose.runtime.ProvidableCompositionLocal<androidx.compose.ui.unit.LayoutDirection> localLayoutDirection = androidx.compose.ui.platform.CompositionLocalsKt.getLocalLayoutDirection();
                                androidx.compose.runtime.ComposerKt.sourceInformationMarkerStart(composer3, 2023513938, "C:CompositionLocal.kt#9igjgp");
                                java.lang.Object consume4 = composer3.consume(localLayoutDirection);
                                androidx.compose.runtime.ComposerKt.sourceInformationMarkerEnd(composer3);
                                androidx.compose.ui.unit.LayoutDirection layoutDirection = (androidx.compose.ui.unit.LayoutDirection) consume4;
                                androidx.compose.runtime.ProvidableCompositionLocal<androidx.compose.ui.platform.ViewConfiguration> localViewConfiguration = androidx.compose.ui.platform.CompositionLocalsKt.getLocalViewConfiguration();
                                androidx.compose.runtime.ComposerKt.sourceInformationMarkerStart(composer3, 2023513938, "C:CompositionLocal.kt#9igjgp");
                                java.lang.Object consume5 = composer3.consume(localViewConfiguration);
                                androidx.compose.runtime.ComposerKt.sourceInformationMarkerEnd(composer3);
                                androidx.compose.ui.platform.ViewConfiguration viewConfiguration = (androidx.compose.ui.platform.ViewConfiguration) consume5;
                                kotlin.jvm.functions.Function0<androidx.compose.ui.node.ComposeUiNode> constructor = androidx.compose.ui.node.ComposeUiNode.INSTANCE.getConstructor();
                                kotlin.jvm.functions.Function3<androidx.compose.runtime.SkippableUpdater<androidx.compose.ui.node.ComposeUiNode>, androidx.compose.runtime.Composer, java.lang.Integer, kotlin.Unit> materializerOf = androidx.compose.ui.layout.LayoutKt.materializerOf(companion2);
                                if (!(composer3.getApplier() instanceof androidx.compose.runtime.Applier)) {
                                    androidx.compose.runtime.ComposablesKt.invalidApplier();
                                }
                                composer3.startReusableNode();
                                if (composer3.getInserting()) {
                                    composer3.createNode(constructor);
                                } else {
                                    composer3.useNode();
                                }
                                composer3.disableReusing();
                                androidx.compose.runtime.Composer m1641constructorimpl = androidx.compose.runtime.Updater.m1641constructorimpl(composer3);
                                androidx.compose.runtime.Updater.m1648setimpl(m1641constructorimpl, columnMeasurePolicy, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetMeasurePolicy());
                                androidx.compose.runtime.Updater.m1648setimpl(m1641constructorimpl, density, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetDensity());
                                androidx.compose.runtime.Updater.m1648setimpl(m1641constructorimpl, layoutDirection, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetLayoutDirection());
                                androidx.compose.runtime.Updater.m1648setimpl(m1641constructorimpl, viewConfiguration, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetViewConfiguration());
                                composer3.enableReusing();
                                materializerOf.invoke(androidx.compose.runtime.SkippableUpdater.m1632boximpl(androidx.compose.runtime.SkippableUpdater.m1633constructorimpl(composer3)), composer3, 0);
                                composer3.startReplaceableGroup(2058660585);
                                composer3.startReplaceableGroup(-1163856341);
                                androidx.compose.runtime.ComposerKt.sourceInformation(composer3, "C79@3994L9:Column.kt#2w3rfo");
                                androidx.compose.foundation.layout.ColumnScopeInstance columnScopeInstance = androidx.compose.foundation.layout.ColumnScopeInstance.INSTANCE;
                                composer3.startReplaceableGroup(-18835878);
                                androidx.compose.runtime.ComposerKt.sourceInformation(composer3, "C281@12901L8,282@12926L18:BackdropScaffold.kt#jmzs0o");
                                function2.invoke(composer3, java.lang.Integer.valueOf(i31222 & 14));
                                function22.invoke(composer3, java.lang.Integer.valueOf((i31222 >> 3) & 14));
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
                            androidx.compose.runtime.ComposerKt.sourceInformation(composer3, "285@12988L72");
                            androidx.compose.material.BackdropValue targetValue = backdropScaffoldState4222.getTargetValue();
                            kotlin.jvm.functions.Function2<androidx.compose.runtime.Composer, java.lang.Integer, kotlin.Unit> function23 = appBar;
                            kotlin.jvm.functions.Function2<androidx.compose.runtime.Composer, java.lang.Integer, kotlin.Unit> function24 = backLayerContent;
                            int i32222 = i29222;
                            androidx.compose.material.BackdropScaffoldKt.BackLayerTransition(targetValue, function23, function24, composer3, ((i32222 << 3) & 896) | ((i32222 << 3) & 112));
                            composer3.endReplaceableGroup();
                            return;
                        }
                        composer3.skipToGroupEnd();
                    }
                });
                java.lang.Float valueOf222 = java.lang.Float.valueOf(mo315toPx0680j_42222);
                startRestartGroup.startReplaceableGroup(1157296644);
                androidx.compose.runtime.ComposerKt.sourceInformation(startRestartGroup, "C(remember)P(1):Composables.kt#9igjgp");
                changed = startRestartGroup.changed(valueOf222);
                rememberedValue = startRestartGroup.rememberedValue();
                if (!changed) {
                }
                rememberedValue = (kotlin.jvm.functions.Function1) new kotlin.jvm.functions.Function1<androidx.compose.ui.unit.Constraints, androidx.compose.ui.unit.Constraints>() { // from class: androidx.compose.material.BackdropScaffoldKt$BackdropScaffold$calculateBackLayerConstraints$1$1
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(1);
                    }

                    @Override // kotlin.jvm.functions.Function1
                    public /* bridge */ /* synthetic */ androidx.compose.ui.unit.Constraints invoke(androidx.compose.ui.unit.Constraints constraints) {
                        return androidx.compose.ui.unit.Constraints.m4412boximpl(m1239invokeZezNO4M(constraints.getValue()));
                    }

                    /* renamed from: invoke-ZezNO4M, reason: not valid java name */
                    public final long m1239invokeZezNO4M(long j22222) {
                        return androidx.compose.ui.unit.ConstraintsKt.m4441offsetNN6EwU$default(androidx.compose.ui.unit.Constraints.m4415copyZbe2FdA$default(j22222, 0, 0, 0, 0, 10, null), 0, -kotlin.math.MathKt.roundToInt(mo315toPx0680j_42222), 1, null);
                    }
                };
                startRestartGroup.updateRememberedValue(rememberedValue);
                startRestartGroup.endReplaceableGroup();
                final kotlin.jvm.functions.Function1<? super androidx.compose.ui.unit.Constraints, androidx.compose.ui.unit.Constraints> function1222 = (kotlin.jvm.functions.Function1) rememberedValue;
                final androidx.compose.ui.Modifier modifier5222 = modifier4;
                final boolean z15222 = z7;
                final boolean z16222 = z5;
                final float f11222 = f7;
                final androidx.compose.material.BackdropScaffoldState backdropScaffoldState5222 = backdropScaffoldState3;
                final float f12222 = f6;
                androidx.compose.material.BackdropScaffoldState backdropScaffoldState6222 = backdropScaffoldState3;
                composer2 = startRestartGroup;
                final int i30222 = i23;
                final androidx.compose.ui.graphics.Shape shape7222 = shape4;
                final long j22222 = j16;
                final long j23222 = j14;
                final float f13222 = f5;
                final int i31222 = i22;
                final long j24222 = j12;
                final kotlin.jvm.functions.Function3<? super androidx.compose.material.SnackbarHostState, ? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.Unit> function35222 = function33;
                int i32222 = i22 << 6;
                androidx.compose.material.SurfaceKt.m1511SurfaceFjzlyU(null, null, j13, j15, null, 0.0f, androidx.compose.runtime.internal.ComposableLambdaKt.composableLambda(composer2, -1049909631, true, new kotlin.jvm.functions.Function2<androidx.compose.runtime.Composer, java.lang.Integer, kotlin.Unit>() { // from class: androidx.compose.material.BackdropScaffoldKt$BackdropScaffold$1
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

                    public final void invoke(androidx.compose.runtime.Composer composer3, int i33) {
                        androidx.compose.runtime.ComposerKt.sourceInformation(composer3, "C297@13395L24,298@13428L3119:BackdropScaffold.kt#jmzs0o");
                        if ((i33 & 11) != 2 || !composer3.getSkipping()) {
                            composer3.startReplaceableGroup(773894976);
                            androidx.compose.runtime.ComposerKt.sourceInformation(composer3, "C(rememberCoroutineScope)475@19849L144:Effects.kt#9igjgp");
                            composer3.startReplaceableGroup(-492369756);
                            androidx.compose.runtime.ComposerKt.sourceInformation(composer3, "C(remember):Composables.kt#9igjgp");
                            java.lang.Object rememberedValue2 = composer3.rememberedValue();
                            if (rememberedValue2 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                                androidx.compose.runtime.CompositionScopedCoroutineScopeCanceller compositionScopedCoroutineScopeCanceller = new androidx.compose.runtime.CompositionScopedCoroutineScopeCanceller(androidx.compose.runtime.EffectsKt.createCompositionCoroutineScope(kotlin.coroutines.EmptyCoroutineContext.INSTANCE, composer3));
                                composer3.updateRememberedValue(compositionScopedCoroutineScopeCanceller);
                                rememberedValue2 = compositionScopedCoroutineScopeCanceller;
                            }
                            composer3.endReplaceableGroup();
                            final kotlinx.coroutines.CoroutineScope coroutineScope = ((androidx.compose.runtime.CompositionScopedCoroutineScopeCanceller) rememberedValue2).getCoroutineScope();
                            composer3.endReplaceableGroup();
                            androidx.compose.ui.Modifier fillMaxSize$default = androidx.compose.foundation.layout.SizeKt.fillMaxSize$default(androidx.compose.ui.Modifier.this, 0.0f, 1, null);
                            kotlin.jvm.functions.Function2<androidx.compose.runtime.Composer, java.lang.Integer, kotlin.Unit> function2 = composableLambda222;
                            kotlin.jvm.functions.Function1<androidx.compose.ui.unit.Constraints, androidx.compose.ui.unit.Constraints> function12222 = function1222;
                            final float f14 = mo315toPx0680j_42222;
                            final boolean z17 = z15222;
                            final boolean z18 = z16222;
                            final androidx.compose.material.BackdropScaffoldState backdropScaffoldState7 = backdropScaffoldState5222;
                            final float f15 = mo315toPx0680j_4322;
                            final int i34 = i30222;
                            final androidx.compose.ui.graphics.Shape shape8 = shape7222;
                            final long j25 = j22222;
                            final long j26 = j23222;
                            final float f16 = f13222;
                            final int i35 = i31222;
                            final float f17 = f11222;
                            final float f18 = f12222;
                            final kotlin.jvm.functions.Function2<? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.Unit> function22 = frontLayerContent;
                            final long j27 = j24222;
                            final kotlin.jvm.functions.Function3<? super androidx.compose.material.SnackbarHostState, ? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.Unit> function36 = function35222;
                            androidx.compose.material.BackdropScaffoldKt.BackdropStack(fillMaxSize$default, function2, function12222, androidx.compose.runtime.internal.ComposableLambdaKt.composableLambda(composer3, 1800047509, true, new kotlin.jvm.functions.Function4<androidx.compose.ui.unit.Constraints, java.lang.Float, androidx.compose.runtime.Composer, java.lang.Integer, kotlin.Unit>() { // from class: androidx.compose.material.BackdropScaffoldKt$BackdropScaffold$1.1
                                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                /* JADX WARN: Multi-variable type inference failed */
                                {
                                    super(4);
                                }

                                @Override // kotlin.jvm.functions.Function4
                                public /* bridge */ /* synthetic */ kotlin.Unit invoke(androidx.compose.ui.unit.Constraints constraints, java.lang.Float f19, androidx.compose.runtime.Composer composer4, java.lang.Integer num) {
                                    m1237invokejYbf7pk(constraints.getValue(), f19.floatValue(), composer4, num.intValue());
                                    return kotlin.Unit.INSTANCE;
                                }

                                /* renamed from: invoke-jYbf7pk, reason: not valid java name */
                                public final void m1237invokejYbf7pk(long j28, float f19, androidx.compose.runtime.Composer composer4, int i36) {
                                    int i37;
                                    androidx.compose.ui.Modifier.Companion companion2;
                                    androidx.compose.ui.Modifier m1521swipeablepPrIpRY;
                                    float m4478constructorimpl;
                                    androidx.compose.runtime.ComposerKt.sourceInformation(composer4, "CP(1:c#ui.unit.Constraints)344@15194L57,342@15132L942,366@16117L420:BackdropScaffold.kt#jmzs0o");
                                    if ((i36 & 14) == 0) {
                                        i37 = i36 | (composer4.changed(j28) ? 4 : 2);
                                    } else {
                                        i37 = i36;
                                    }
                                    if ((i36 & 112) == 0) {
                                        i37 |= composer4.changed(f19) ? 32 : 16;
                                    }
                                    if ((i37 & 731) != 146 || !composer4.getSkipping()) {
                                        float m4423getMaxHeightimpl = androidx.compose.ui.unit.Constraints.m4423getMaxHeightimpl(j28);
                                        float f20 = m4423getMaxHeightimpl - f14;
                                        if (z17) {
                                            f20 = java.lang.Math.min(f20, f19);
                                        }
                                        float f21 = f20;
                                        if (z18) {
                                            companion2 = androidx.compose.ui.input.nestedscroll.NestedScrollModifierKt.nestedScroll$default(androidx.compose.ui.Modifier.INSTANCE, backdropScaffoldState7.getNestedScrollConnection(), null, 2, null);
                                        } else {
                                            companion2 = androidx.compose.ui.Modifier.INSTANCE;
                                        }
                                        m1521swipeablepPrIpRY = androidx.compose.material.SwipeableKt.m1521swipeablepPrIpRY(androidx.compose.ui.Modifier.INSTANCE.then(companion2), backdropScaffoldState7, r18, androidx.compose.foundation.gestures.Orientation.Vertical, (r26 & 8) != 0 ? true : z18, (r26 & 16) != 0 ? false : false, (r26 & 32) != 0 ? null : null, (r26 & 64) != 0 ? new kotlin.jvm.functions.Function2<T, T, androidx.compose.material.FixedThreshold>() { // from class: androidx.compose.material.SwipeableKt$swipeable$1
                                            /* JADX WARN: Can't rename method to resolve collision */
                                            @Override // kotlin.jvm.functions.Function2
                                            public final androidx.compose.material.FixedThreshold invoke(T t, T t2) {
                                                return new androidx.compose.material.FixedThreshold(androidx.compose.ui.unit.Dp.m4478constructorimpl(56), null);
                                            }
                                        } : null, (r26 & 128) != 0 ? androidx.compose.material.SwipeableDefaults.resistanceConfig$default(androidx.compose.material.SwipeableDefaults.INSTANCE, kotlin.collections.MapsKt.mapOf(kotlin.TuplesKt.to(java.lang.Float.valueOf(f15), androidx.compose.material.BackdropValue.Concealed), kotlin.TuplesKt.to(java.lang.Float.valueOf(f21), androidx.compose.material.BackdropValue.Revealed)).keySet(), 0.0f, 0.0f, 6, null) : null, (r26 & 256) != 0 ? androidx.compose.material.SwipeableDefaults.INSTANCE.m1520getVelocityThresholdD9Ej5fM() : 0.0f);
                                        final androidx.compose.material.BackdropScaffoldState backdropScaffoldState8 = backdropScaffoldState7;
                                        final kotlinx.coroutines.CoroutineScope coroutineScope2 = coroutineScope;
                                        androidx.compose.ui.Modifier semantics$default = androidx.compose.ui.semantics.SemanticsModifierKt.semantics$default(m1521swipeablepPrIpRY, false, new kotlin.jvm.functions.Function1<androidx.compose.ui.semantics.SemanticsPropertyReceiver, kotlin.Unit>() { // from class: androidx.compose.material.BackdropScaffoldKt$BackdropScaffold$1$1$swipeable$1
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
                                                if (androidx.compose.material.BackdropScaffoldState.this.isConcealed()) {
                                                    final androidx.compose.material.BackdropScaffoldState backdropScaffoldState9 = androidx.compose.material.BackdropScaffoldState.this;
                                                    final kotlinx.coroutines.CoroutineScope coroutineScope3 = coroutineScope2;
                                                    androidx.compose.ui.semantics.SemanticsPropertiesKt.collapse$default(semantics, null, new kotlin.jvm.functions.Function0<java.lang.Boolean>() { // from class: androidx.compose.material.BackdropScaffoldKt$BackdropScaffold$1$1$swipeable$1.1
                                                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                                        {
                                                            super(0);
                                                        }

                                                        /* JADX WARN: Can't rename method to resolve collision */
                                                        @Override // kotlin.jvm.functions.Function0
                                                        public final java.lang.Boolean invoke() {
                                                            if (androidx.compose.material.BackdropScaffoldState.this.getConfirmStateChange$material_release().invoke(androidx.compose.material.BackdropValue.Revealed).booleanValue()) {
                                                                kotlinx.coroutines.BuildersKt__Builders_commonKt.launch$default(coroutineScope3, null, null, new androidx.compose.material.BackdropScaffoldKt$BackdropScaffold$1$1$swipeable$1.AnonymousClass1.C00371(androidx.compose.material.BackdropScaffoldState.this, null), 3, null);
                                                            }
                                                            return true;
                                                        }

                                                        /* compiled from: BackdropScaffold.kt */
                                                        @kotlin.Metadata(k = 3, mv = {1, 6, 0}, xi = 48)
                                                        @kotlin.coroutines.jvm.internal.DebugMetadata(c = "androidx.compose.material.BackdropScaffoldKt$BackdropScaffold$1$1$swipeable$1$1$1", f = "BackdropScaffold.kt", i = {}, l = {330}, m = "invokeSuspend", n = {}, s = {})
                                                        /* renamed from: androidx.compose.material.BackdropScaffoldKt$BackdropScaffold$1$1$swipeable$1$1$1, reason: invalid class name and collision with other inner class name */
                                                        static final class C00371 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<kotlinx.coroutines.CoroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> {
                                                            final /* synthetic */ androidx.compose.material.BackdropScaffoldState $scaffoldState;
                                                            int label;

                                                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                                            C00371(androidx.compose.material.BackdropScaffoldState backdropScaffoldState, kotlin.coroutines.Continuation<? super androidx.compose.material.BackdropScaffoldKt$BackdropScaffold$1$1$swipeable$1.AnonymousClass1.C00371> continuation) {
                                                                super(2, continuation);
                                                                this.$scaffoldState = backdropScaffoldState;
                                                            }

                                                            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                                                            public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object obj, kotlin.coroutines.Continuation<?> continuation) {
                                                                return new androidx.compose.material.BackdropScaffoldKt$BackdropScaffold$1$1$swipeable$1.AnonymousClass1.C00371(this.$scaffoldState, continuation);
                                                            }

                                                            @Override // kotlin.jvm.functions.Function2
                                                            public final java.lang.Object invoke(kotlinx.coroutines.CoroutineScope coroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
                                                                return ((androidx.compose.material.BackdropScaffoldKt$BackdropScaffold$1$1$swipeable$1.AnonymousClass1.C00371) create(coroutineScope, continuation)).invokeSuspend(kotlin.Unit.INSTANCE);
                                                            }

                                                            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                                                            public final java.lang.Object invokeSuspend(java.lang.Object obj) {
                                                                java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
                                                                int i = this.label;
                                                                if (i == 0) {
                                                                    kotlin.ResultKt.throwOnFailure(obj);
                                                                    this.label = 1;
                                                                    if (this.$scaffoldState.reveal(this) == coroutine_suspended) {
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
                                                    final androidx.compose.material.BackdropScaffoldState backdropScaffoldState10 = androidx.compose.material.BackdropScaffoldState.this;
                                                    final kotlinx.coroutines.CoroutineScope coroutineScope4 = coroutineScope2;
                                                    androidx.compose.ui.semantics.SemanticsPropertiesKt.expand$default(semantics, null, new kotlin.jvm.functions.Function0<java.lang.Boolean>() { // from class: androidx.compose.material.BackdropScaffoldKt$BackdropScaffold$1$1$swipeable$1.2
                                                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                                        {
                                                            super(0);
                                                        }

                                                        /* JADX WARN: Can't rename method to resolve collision */
                                                        @Override // kotlin.jvm.functions.Function0
                                                        public final java.lang.Boolean invoke() {
                                                            if (androidx.compose.material.BackdropScaffoldState.this.getConfirmStateChange$material_release().invoke(androidx.compose.material.BackdropValue.Concealed).booleanValue()) {
                                                                kotlinx.coroutines.BuildersKt__Builders_commonKt.launch$default(coroutineScope4, null, null, new androidx.compose.material.BackdropScaffoldKt$BackdropScaffold$1$1$swipeable$1.AnonymousClass2.AnonymousClass1(androidx.compose.material.BackdropScaffoldState.this, null), 3, null);
                                                            }
                                                            return true;
                                                        }

                                                        /* compiled from: BackdropScaffold.kt */
                                                        @kotlin.Metadata(k = 3, mv = {1, 6, 0}, xi = 48)
                                                        @kotlin.coroutines.jvm.internal.DebugMetadata(c = "androidx.compose.material.BackdropScaffoldKt$BackdropScaffold$1$1$swipeable$1$2$1", f = "BackdropScaffold.kt", i = {}, l = {336}, m = "invokeSuspend", n = {}, s = {})
                                                        /* renamed from: androidx.compose.material.BackdropScaffoldKt$BackdropScaffold$1$1$swipeable$1$2$1, reason: invalid class name */
                                                        static final class AnonymousClass1 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<kotlinx.coroutines.CoroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> {
                                                            final /* synthetic */ androidx.compose.material.BackdropScaffoldState $scaffoldState;
                                                            int label;

                                                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                                            AnonymousClass1(androidx.compose.material.BackdropScaffoldState backdropScaffoldState, kotlin.coroutines.Continuation<? super androidx.compose.material.BackdropScaffoldKt$BackdropScaffold$1$1$swipeable$1.AnonymousClass2.AnonymousClass1> continuation) {
                                                                super(2, continuation);
                                                                this.$scaffoldState = backdropScaffoldState;
                                                            }

                                                            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                                                            public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object obj, kotlin.coroutines.Continuation<?> continuation) {
                                                                return new androidx.compose.material.BackdropScaffoldKt$BackdropScaffold$1$1$swipeable$1.AnonymousClass2.AnonymousClass1(this.$scaffoldState, continuation);
                                                            }

                                                            @Override // kotlin.jvm.functions.Function2
                                                            public final java.lang.Object invoke(kotlinx.coroutines.CoroutineScope coroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
                                                                return ((androidx.compose.material.BackdropScaffoldKt$BackdropScaffold$1$1$swipeable$1.AnonymousClass2.AnonymousClass1) create(coroutineScope, continuation)).invokeSuspend(kotlin.Unit.INSTANCE);
                                                            }

                                                            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                                                            public final java.lang.Object invokeSuspend(java.lang.Object obj) {
                                                                java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
                                                                int i = this.label;
                                                                if (i == 0) {
                                                                    kotlin.ResultKt.throwOnFailure(obj);
                                                                    this.label = 1;
                                                                    if (this.$scaffoldState.conceal(this) == coroutine_suspended) {
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
                                        androidx.compose.ui.Modifier.Companion companion3 = androidx.compose.ui.Modifier.INSTANCE;
                                        final androidx.compose.material.BackdropScaffoldState backdropScaffoldState9 = backdropScaffoldState7;
                                        composer4.startReplaceableGroup(1157296644);
                                        androidx.compose.runtime.ComposerKt.sourceInformation(composer4, "C(remember)P(1):Composables.kt#9igjgp");
                                        boolean changed2 = composer4.changed(backdropScaffoldState9);
                                        java.lang.Object rememberedValue3 = composer4.rememberedValue();
                                        if (changed2 || rememberedValue3 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                                            rememberedValue3 = (kotlin.jvm.functions.Function1) new kotlin.jvm.functions.Function1<androidx.compose.ui.unit.Density, androidx.compose.ui.unit.IntOffset>() { // from class: androidx.compose.material.BackdropScaffoldKt$BackdropScaffold$1$1$1$1
                                                {
                                                    super(1);
                                                }

                                                @Override // kotlin.jvm.functions.Function1
                                                public /* bridge */ /* synthetic */ androidx.compose.ui.unit.IntOffset invoke(androidx.compose.ui.unit.Density density) {
                                                    return androidx.compose.ui.unit.IntOffset.m4601boximpl(m1238invokeBjo55l4(density));
                                                }

                                                /* renamed from: invoke-Bjo55l4, reason: not valid java name */
                                                public final long m1238invokeBjo55l4(androidx.compose.ui.unit.Density offset) {
                                                    kotlin.jvm.internal.Intrinsics.checkNotNullParameter(offset, "$this$offset");
                                                    return androidx.compose.ui.unit.IntOffsetKt.IntOffset(0, kotlin.math.MathKt.roundToInt(androidx.compose.material.BackdropScaffoldState.this.getOffset().getValue().floatValue()));
                                                }
                                            };
                                            composer4.updateRememberedValue(rememberedValue3);
                                        }
                                        composer4.endReplaceableGroup();
                                        androidx.compose.ui.Modifier then = androidx.compose.foundation.layout.OffsetKt.offset(companion3, (kotlin.jvm.functions.Function1) rememberedValue3).then(semantics$default);
                                        androidx.compose.ui.graphics.Shape shape9 = shape8;
                                        long j29 = j25;
                                        long j30 = j26;
                                        float f22 = f16;
                                        final float f23 = f18;
                                        final kotlin.jvm.functions.Function2<? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.Unit> function23 = function22;
                                        final int i38 = i34;
                                        final long j31 = j27;
                                        final androidx.compose.material.BackdropScaffoldState backdropScaffoldState10 = backdropScaffoldState7;
                                        final int i39 = i35;
                                        final boolean z19 = z18;
                                        final kotlinx.coroutines.CoroutineScope coroutineScope3 = coroutineScope;
                                        androidx.compose.runtime.internal.ComposableLambda composableLambda2222 = androidx.compose.runtime.internal.ComposableLambdaKt.composableLambda(composer4, -1065299503, true, new kotlin.jvm.functions.Function2<androidx.compose.runtime.Composer, java.lang.Integer, kotlin.Unit>() { // from class: androidx.compose.material.BackdropScaffoldKt.BackdropScaffold.1.1.2
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

                                            public final void invoke(androidx.compose.runtime.Composer composer5, int i40) {
                                                androidx.compose.runtime.ComposerKt.sourceInformation(composer5, "C351@15517L543:BackdropScaffold.kt#jmzs0o");
                                                if ((i40 & 11) != 2 || !composer5.getSkipping()) {
                                                    androidx.compose.ui.Modifier m572paddingqDBjuR0$default = androidx.compose.foundation.layout.PaddingKt.m572paddingqDBjuR0$default(androidx.compose.ui.Modifier.INSTANCE, 0.0f, 0.0f, 0.0f, f23, 7, null);
                                                    kotlin.jvm.functions.Function2<androidx.compose.runtime.Composer, java.lang.Integer, kotlin.Unit> function24 = function23;
                                                    int i41 = i38;
                                                    long j32 = j31;
                                                    final androidx.compose.material.BackdropScaffoldState backdropScaffoldState11 = backdropScaffoldState10;
                                                    int i42 = i39;
                                                    final boolean z20 = z19;
                                                    final kotlinx.coroutines.CoroutineScope coroutineScope4 = coroutineScope3;
                                                    composer5.startReplaceableGroup(733328855);
                                                    androidx.compose.runtime.ComposerKt.sourceInformation(composer5, "C(Box)P(2,1,3)70@3267L67,71@3339L130:Box.kt#2w3rfo");
                                                    androidx.compose.ui.layout.MeasurePolicy rememberBoxMeasurePolicy = androidx.compose.foundation.layout.BoxKt.rememberBoxMeasurePolicy(androidx.compose.ui.Alignment.INSTANCE.getTopStart(), false, composer5, 0);
                                                    composer5.startReplaceableGroup(-1323940314);
                                                    androidx.compose.runtime.ComposerKt.sourceInformation(composer5, "C(Layout)P(!1,2)74@2915L7,75@2970L7,76@3029L7,77@3041L460:Layout.kt#80mrfh");
                                                    androidx.compose.runtime.ProvidableCompositionLocal<androidx.compose.ui.unit.Density> localDensity3222 = androidx.compose.ui.platform.CompositionLocalsKt.getLocalDensity();
                                                    androidx.compose.runtime.ComposerKt.sourceInformationMarkerStart(composer5, 2023513938, "C:CompositionLocal.kt#9igjgp");
                                                    java.lang.Object consume3222 = composer5.consume(localDensity3222);
                                                    androidx.compose.runtime.ComposerKt.sourceInformationMarkerEnd(composer5);
                                                    androidx.compose.ui.unit.Density density = (androidx.compose.ui.unit.Density) consume3222;
                                                    androidx.compose.runtime.ProvidableCompositionLocal<androidx.compose.ui.unit.LayoutDirection> localLayoutDirection = androidx.compose.ui.platform.CompositionLocalsKt.getLocalLayoutDirection();
                                                    androidx.compose.runtime.ComposerKt.sourceInformationMarkerStart(composer5, 2023513938, "C:CompositionLocal.kt#9igjgp");
                                                    java.lang.Object consume4 = composer5.consume(localLayoutDirection);
                                                    androidx.compose.runtime.ComposerKt.sourceInformationMarkerEnd(composer5);
                                                    androidx.compose.ui.unit.LayoutDirection layoutDirection = (androidx.compose.ui.unit.LayoutDirection) consume4;
                                                    androidx.compose.runtime.ProvidableCompositionLocal<androidx.compose.ui.platform.ViewConfiguration> localViewConfiguration = androidx.compose.ui.platform.CompositionLocalsKt.getLocalViewConfiguration();
                                                    androidx.compose.runtime.ComposerKt.sourceInformationMarkerStart(composer5, 2023513938, "C:CompositionLocal.kt#9igjgp");
                                                    java.lang.Object consume5 = composer5.consume(localViewConfiguration);
                                                    androidx.compose.runtime.ComposerKt.sourceInformationMarkerEnd(composer5);
                                                    androidx.compose.ui.platform.ViewConfiguration viewConfiguration = (androidx.compose.ui.platform.ViewConfiguration) consume5;
                                                    kotlin.jvm.functions.Function0<androidx.compose.ui.node.ComposeUiNode> constructor = androidx.compose.ui.node.ComposeUiNode.INSTANCE.getConstructor();
                                                    kotlin.jvm.functions.Function3<androidx.compose.runtime.SkippableUpdater<androidx.compose.ui.node.ComposeUiNode>, androidx.compose.runtime.Composer, java.lang.Integer, kotlin.Unit> materializerOf = androidx.compose.ui.layout.LayoutKt.materializerOf(m572paddingqDBjuR0$default);
                                                    if (!(composer5.getApplier() instanceof androidx.compose.runtime.Applier)) {
                                                        androidx.compose.runtime.ComposablesKt.invalidApplier();
                                                    }
                                                    composer5.startReusableNode();
                                                    if (composer5.getInserting()) {
                                                        composer5.createNode(constructor);
                                                    } else {
                                                        composer5.useNode();
                                                    }
                                                    composer5.disableReusing();
                                                    androidx.compose.runtime.Composer m1641constructorimpl = androidx.compose.runtime.Updater.m1641constructorimpl(composer5);
                                                    androidx.compose.runtime.Updater.m1648setimpl(m1641constructorimpl, rememberBoxMeasurePolicy, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetMeasurePolicy());
                                                    androidx.compose.runtime.Updater.m1648setimpl(m1641constructorimpl, density, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetDensity());
                                                    androidx.compose.runtime.Updater.m1648setimpl(m1641constructorimpl, layoutDirection, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetLayoutDirection());
                                                    androidx.compose.runtime.Updater.m1648setimpl(m1641constructorimpl, viewConfiguration, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetViewConfiguration());
                                                    composer5.enableReusing();
                                                    materializerOf.invoke(androidx.compose.runtime.SkippableUpdater.m1632boximpl(androidx.compose.runtime.SkippableUpdater.m1633constructorimpl(composer5)), composer5, 0);
                                                    composer5.startReplaceableGroup(2058660585);
                                                    composer5.startReplaceableGroup(-2137368960);
                                                    androidx.compose.runtime.ComposerKt.sourceInformation(composer5, "C72@3384L9:Box.kt#2w3rfo");
                                                    androidx.compose.foundation.layout.BoxScopeInstance boxScopeInstance = androidx.compose.foundation.layout.BoxScopeInstance.INSTANCE;
                                                    composer5.startReplaceableGroup(-1889954677);
                                                    androidx.compose.runtime.ComposerKt.sourceInformation(composer5, "C352@15582L19,353@15622L420:BackdropScaffold.kt#jmzs0o");
                                                    function24.invoke(composer5, java.lang.Integer.valueOf((i41 >> 6) & 14));
                                                    androidx.compose.material.BackdropScaffoldKt.m1233Scrim3JVO9M(j32, new kotlin.jvm.functions.Function0<kotlin.Unit>() { // from class: androidx.compose.material.BackdropScaffoldKt$BackdropScaffold$1$1$2$1$1
                                                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                                        {
                                                            super(0);
                                                        }

                                                        @Override // kotlin.jvm.functions.Function0
                                                        public /* bridge */ /* synthetic */ kotlin.Unit invoke() {
                                                            invoke2();
                                                            return kotlin.Unit.INSTANCE;
                                                        }

                                                        /* renamed from: invoke, reason: avoid collision after fix types in other method */
                                                        public final void invoke2() {
                                                            if (z20 && backdropScaffoldState11.getConfirmStateChange$material_release().invoke(androidx.compose.material.BackdropValue.Concealed).booleanValue()) {
                                                                kotlinx.coroutines.BuildersKt__Builders_commonKt.launch$default(coroutineScope4, null, null, new androidx.compose.material.BackdropScaffoldKt$BackdropScaffold$1$1$2$1$1.AnonymousClass1(backdropScaffoldState11, null), 3, null);
                                                            }
                                                        }

                                                        /* compiled from: BackdropScaffold.kt */
                                                        @kotlin.Metadata(k = 3, mv = {1, 6, 0}, xi = 48)
                                                        @kotlin.coroutines.jvm.internal.DebugMetadata(c = "androidx.compose.material.BackdropScaffoldKt$BackdropScaffold$1$1$2$1$1$1", f = "BackdropScaffold.kt", i = {}, l = {358}, m = "invokeSuspend", n = {}, s = {})
                                                        /* renamed from: androidx.compose.material.BackdropScaffoldKt$BackdropScaffold$1$1$2$1$1$1, reason: invalid class name */
                                                        static final class AnonymousClass1 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<kotlinx.coroutines.CoroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> {
                                                            final /* synthetic */ androidx.compose.material.BackdropScaffoldState $scaffoldState;
                                                            int label;

                                                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                                            AnonymousClass1(androidx.compose.material.BackdropScaffoldState backdropScaffoldState, kotlin.coroutines.Continuation<? super androidx.compose.material.BackdropScaffoldKt$BackdropScaffold$1$1$2$1$1.AnonymousClass1> continuation) {
                                                                super(2, continuation);
                                                                this.$scaffoldState = backdropScaffoldState;
                                                            }

                                                            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                                                            public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object obj, kotlin.coroutines.Continuation<?> continuation) {
                                                                return new androidx.compose.material.BackdropScaffoldKt$BackdropScaffold$1$1$2$1$1.AnonymousClass1(this.$scaffoldState, continuation);
                                                            }

                                                            @Override // kotlin.jvm.functions.Function2
                                                            public final java.lang.Object invoke(kotlinx.coroutines.CoroutineScope coroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
                                                                return ((androidx.compose.material.BackdropScaffoldKt$BackdropScaffold$1$1$2$1$1.AnonymousClass1) create(coroutineScope, continuation)).invokeSuspend(kotlin.Unit.INSTANCE);
                                                            }

                                                            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                                                            public final java.lang.Object invokeSuspend(java.lang.Object obj) {
                                                                java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
                                                                int i = this.label;
                                                                if (i == 0) {
                                                                    kotlin.ResultKt.throwOnFailure(obj);
                                                                    this.label = 1;
                                                                    if (this.$scaffoldState.conceal(this) == coroutine_suspended) {
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
                                                    }, backdropScaffoldState11.getTargetValue() == androidx.compose.material.BackdropValue.Revealed, composer5, (i42 >> 18) & 14);
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
                                        androidx.compose.material.SurfaceKt.m1511SurfaceFjzlyU(then, shape9, j29, j30, null, f22, composableLambda2222, composer4, ((i40 >> 3) & 112) | 1572864 | ((i40 >> 6) & 896) | ((i40 >> 6) & 7168) | ((i40 << 6) & 458752), 16);
                                        androidx.compose.ui.Modifier.Companion companion4 = androidx.compose.ui.Modifier.INSTANCE;
                                        if (backdropScaffoldState7.isRevealed() && f21 == m4423getMaxHeightimpl - f14) {
                                            m4478constructorimpl = f17;
                                        } else {
                                            m4478constructorimpl = androidx.compose.ui.unit.Dp.m4478constructorimpl(0);
                                        }
                                        androidx.compose.ui.Modifier m572paddingqDBjuR0$default = androidx.compose.foundation.layout.PaddingKt.m572paddingqDBjuR0$default(companion4, 0.0f, 0.0f, 0.0f, m4478constructorimpl, 7, null);
                                        androidx.compose.ui.Alignment bottomCenter = androidx.compose.ui.Alignment.INSTANCE.getBottomCenter();
                                        kotlin.jvm.functions.Function3<androidx.compose.material.SnackbarHostState, androidx.compose.runtime.Composer, java.lang.Integer, kotlin.Unit> function37 = function36;
                                        androidx.compose.material.BackdropScaffoldState backdropScaffoldState11 = backdropScaffoldState7;
                                        int i41 = i35;
                                        composer4.startReplaceableGroup(733328855);
                                        androidx.compose.runtime.ComposerKt.sourceInformation(composer4, "C(Box)P(2,1,3)70@3267L67,71@3339L130:Box.kt#2w3rfo");
                                        androidx.compose.ui.layout.MeasurePolicy rememberBoxMeasurePolicy = androidx.compose.foundation.layout.BoxKt.rememberBoxMeasurePolicy(bottomCenter, false, composer4, 6);
                                        composer4.startReplaceableGroup(-1323940314);
                                        androidx.compose.runtime.ComposerKt.sourceInformation(composer4, "C(Layout)P(!1,2)74@2915L7,75@2970L7,76@3029L7,77@3041L460:Layout.kt#80mrfh");
                                        androidx.compose.runtime.ProvidableCompositionLocal<androidx.compose.ui.unit.Density> localDensity3222 = androidx.compose.ui.platform.CompositionLocalsKt.getLocalDensity();
                                        androidx.compose.runtime.ComposerKt.sourceInformationMarkerStart(composer4, 2023513938, "C:CompositionLocal.kt#9igjgp");
                                        java.lang.Object consume3222 = composer4.consume(localDensity3222);
                                        androidx.compose.runtime.ComposerKt.sourceInformationMarkerEnd(composer4);
                                        androidx.compose.ui.unit.Density density = (androidx.compose.ui.unit.Density) consume3222;
                                        androidx.compose.runtime.ProvidableCompositionLocal<androidx.compose.ui.unit.LayoutDirection> localLayoutDirection = androidx.compose.ui.platform.CompositionLocalsKt.getLocalLayoutDirection();
                                        androidx.compose.runtime.ComposerKt.sourceInformationMarkerStart(composer4, 2023513938, "C:CompositionLocal.kt#9igjgp");
                                        java.lang.Object consume4 = composer4.consume(localLayoutDirection);
                                        androidx.compose.runtime.ComposerKt.sourceInformationMarkerEnd(composer4);
                                        androidx.compose.ui.unit.LayoutDirection layoutDirection = (androidx.compose.ui.unit.LayoutDirection) consume4;
                                        androidx.compose.runtime.ProvidableCompositionLocal<androidx.compose.ui.platform.ViewConfiguration> localViewConfiguration = androidx.compose.ui.platform.CompositionLocalsKt.getLocalViewConfiguration();
                                        androidx.compose.runtime.ComposerKt.sourceInformationMarkerStart(composer4, 2023513938, "C:CompositionLocal.kt#9igjgp");
                                        java.lang.Object consume5 = composer4.consume(localViewConfiguration);
                                        androidx.compose.runtime.ComposerKt.sourceInformationMarkerEnd(composer4);
                                        androidx.compose.ui.platform.ViewConfiguration viewConfiguration = (androidx.compose.ui.platform.ViewConfiguration) consume5;
                                        kotlin.jvm.functions.Function0<androidx.compose.ui.node.ComposeUiNode> constructor = androidx.compose.ui.node.ComposeUiNode.INSTANCE.getConstructor();
                                        kotlin.jvm.functions.Function3<androidx.compose.runtime.SkippableUpdater<androidx.compose.ui.node.ComposeUiNode>, androidx.compose.runtime.Composer, java.lang.Integer, kotlin.Unit> materializerOf = androidx.compose.ui.layout.LayoutKt.materializerOf(m572paddingqDBjuR0$default);
                                        if (!(composer4.getApplier() instanceof androidx.compose.runtime.Applier)) {
                                            androidx.compose.runtime.ComposablesKt.invalidApplier();
                                        }
                                        composer4.startReusableNode();
                                        if (composer4.getInserting()) {
                                            composer4.createNode(constructor);
                                        } else {
                                            composer4.useNode();
                                        }
                                        composer4.disableReusing();
                                        androidx.compose.runtime.Composer m1641constructorimpl = androidx.compose.runtime.Updater.m1641constructorimpl(composer4);
                                        androidx.compose.runtime.Updater.m1648setimpl(m1641constructorimpl, rememberBoxMeasurePolicy, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetMeasurePolicy());
                                        androidx.compose.runtime.Updater.m1648setimpl(m1641constructorimpl, density, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetDensity());
                                        androidx.compose.runtime.Updater.m1648setimpl(m1641constructorimpl, layoutDirection, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetLayoutDirection());
                                        androidx.compose.runtime.Updater.m1648setimpl(m1641constructorimpl, viewConfiguration, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetViewConfiguration());
                                        composer4.enableReusing();
                                        materializerOf.invoke(androidx.compose.runtime.SkippableUpdater.m1632boximpl(androidx.compose.runtime.SkippableUpdater.m1633constructorimpl(composer4)), composer4, 0);
                                        composer4.startReplaceableGroup(2058660585);
                                        composer4.startReplaceableGroup(-2137368960);
                                        androidx.compose.runtime.ComposerKt.sourceInformation(composer4, "C72@3384L9:Box.kt#2w3rfo");
                                        androidx.compose.foundation.layout.BoxScopeInstance boxScopeInstance = androidx.compose.foundation.layout.BoxScopeInstance.INSTANCE;
                                        composer4.startReplaceableGroup(1815906203);
                                        androidx.compose.runtime.ComposerKt.sourceInformation(composer4, "C375@16478L45:BackdropScaffold.kt#jmzs0o");
                                        function37.invoke(backdropScaffoldState11.getSnackbarHostState(), composer4, java.lang.Integer.valueOf((i41 >> 18) & 112));
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
                z8 = z5;
                z9 = z6;
                z10 = z7;
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
            androidx.compose.ui.graphics.Shape shape62222 = shape3;
            if ((i3 & 16384) == 0) {
            }
            if ((i3 & 32768) == 0) {
            }
            if ((i3 & 65536) == 0) {
            }
            if (i15 == 0) {
            }
            i23 = i21;
            f6 = m1230getPeekHeightD9Ej5fM;
            f7 = m1229getHeaderHeightD9Ej5fM;
            startRestartGroup.endDefaults();
            androidx.compose.runtime.ProvidableCompositionLocal<androidx.compose.ui.unit.Density> localDensity3222 = androidx.compose.ui.platform.CompositionLocalsKt.getLocalDensity();
            androidx.compose.runtime.ComposerKt.sourceInformationMarkerStart(startRestartGroup, 2023513938, "C:CompositionLocal.kt#9igjgp");
            java.lang.Object consume3222 = startRestartGroup.consume(localDensity3222);
            androidx.compose.runtime.ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
            final float mo315toPx0680j_43222 = ((androidx.compose.ui.unit.Density) consume3222).mo315toPx0680j_4(f6);
            androidx.compose.runtime.ProvidableCompositionLocal<androidx.compose.ui.unit.Density> localDensity22222 = androidx.compose.ui.platform.CompositionLocalsKt.getLocalDensity();
            androidx.compose.runtime.ComposerKt.sourceInformationMarkerStart(startRestartGroup, 2023513938, "C:CompositionLocal.kt#9igjgp");
            java.lang.Object consume22222 = startRestartGroup.consume(localDensity22222);
            androidx.compose.runtime.ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
            final float mo315toPx0680j_422222 = ((androidx.compose.ui.unit.Density) consume22222).mo315toPx0680j_4(f7);
            final boolean z142222 = z6;
            final androidx.compose.material.BackdropScaffoldState backdropScaffoldState42222 = backdropScaffoldState3;
            final int i292222 = i23;
            final kotlin.jvm.functions.Function2<? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.Unit> composableLambda2222 = androidx.compose.runtime.internal.ComposableLambdaKt.composableLambda(startRestartGroup, 1744778315, true, new kotlin.jvm.functions.Function2<androidx.compose.runtime.Composer, java.lang.Integer, kotlin.Unit>() { // from class: androidx.compose.material.BackdropScaffoldKt$BackdropScaffold$backLayer$1
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

                public final void invoke(androidx.compose.runtime.Composer composer3, int i302222) {
                    androidx.compose.runtime.ComposerKt.sourceInformation(composer3, "C:BackdropScaffold.kt#jmzs0o");
                    if ((i302222 & 11) != 2 || !composer3.getSkipping()) {
                        if (z142222) {
                            composer3.startReplaceableGroup(-1017265331);
                            androidx.compose.runtime.ComposerKt.sourceInformation(composer3, "280@12876L82");
                            kotlin.jvm.functions.Function2<androidx.compose.runtime.Composer, java.lang.Integer, kotlin.Unit> function2 = appBar;
                            int i312222 = i292222;
                            kotlin.jvm.functions.Function2<androidx.compose.runtime.Composer, java.lang.Integer, kotlin.Unit> function22 = backLayerContent;
                            composer3.startReplaceableGroup(-483455358);
                            androidx.compose.runtime.ComposerKt.sourceInformation(composer3, "C(Column)P(2,3,1)77@3880L61,78@3946L133:Column.kt#2w3rfo");
                            androidx.compose.ui.Modifier.Companion companion2 = androidx.compose.ui.Modifier.INSTANCE;
                            androidx.compose.ui.layout.MeasurePolicy columnMeasurePolicy = androidx.compose.foundation.layout.ColumnKt.columnMeasurePolicy(androidx.compose.foundation.layout.Arrangement.INSTANCE.getTop(), androidx.compose.ui.Alignment.INSTANCE.getStart(), composer3, 0);
                            composer3.startReplaceableGroup(-1323940314);
                            androidx.compose.runtime.ComposerKt.sourceInformation(composer3, "C(Layout)P(!1,2)74@2915L7,75@2970L7,76@3029L7,77@3041L460:Layout.kt#80mrfh");
                            androidx.compose.runtime.ProvidableCompositionLocal<androidx.compose.ui.unit.Density> localDensity32222 = androidx.compose.ui.platform.CompositionLocalsKt.getLocalDensity();
                            androidx.compose.runtime.ComposerKt.sourceInformationMarkerStart(composer3, 2023513938, "C:CompositionLocal.kt#9igjgp");
                            java.lang.Object consume32222 = composer3.consume(localDensity32222);
                            androidx.compose.runtime.ComposerKt.sourceInformationMarkerEnd(composer3);
                            androidx.compose.ui.unit.Density density = (androidx.compose.ui.unit.Density) consume32222;
                            androidx.compose.runtime.ProvidableCompositionLocal<androidx.compose.ui.unit.LayoutDirection> localLayoutDirection = androidx.compose.ui.platform.CompositionLocalsKt.getLocalLayoutDirection();
                            androidx.compose.runtime.ComposerKt.sourceInformationMarkerStart(composer3, 2023513938, "C:CompositionLocal.kt#9igjgp");
                            java.lang.Object consume4 = composer3.consume(localLayoutDirection);
                            androidx.compose.runtime.ComposerKt.sourceInformationMarkerEnd(composer3);
                            androidx.compose.ui.unit.LayoutDirection layoutDirection = (androidx.compose.ui.unit.LayoutDirection) consume4;
                            androidx.compose.runtime.ProvidableCompositionLocal<androidx.compose.ui.platform.ViewConfiguration> localViewConfiguration = androidx.compose.ui.platform.CompositionLocalsKt.getLocalViewConfiguration();
                            androidx.compose.runtime.ComposerKt.sourceInformationMarkerStart(composer3, 2023513938, "C:CompositionLocal.kt#9igjgp");
                            java.lang.Object consume5 = composer3.consume(localViewConfiguration);
                            androidx.compose.runtime.ComposerKt.sourceInformationMarkerEnd(composer3);
                            androidx.compose.ui.platform.ViewConfiguration viewConfiguration = (androidx.compose.ui.platform.ViewConfiguration) consume5;
                            kotlin.jvm.functions.Function0<androidx.compose.ui.node.ComposeUiNode> constructor = androidx.compose.ui.node.ComposeUiNode.INSTANCE.getConstructor();
                            kotlin.jvm.functions.Function3<androidx.compose.runtime.SkippableUpdater<androidx.compose.ui.node.ComposeUiNode>, androidx.compose.runtime.Composer, java.lang.Integer, kotlin.Unit> materializerOf = androidx.compose.ui.layout.LayoutKt.materializerOf(companion2);
                            if (!(composer3.getApplier() instanceof androidx.compose.runtime.Applier)) {
                                androidx.compose.runtime.ComposablesKt.invalidApplier();
                            }
                            composer3.startReusableNode();
                            if (composer3.getInserting()) {
                                composer3.createNode(constructor);
                            } else {
                                composer3.useNode();
                            }
                            composer3.disableReusing();
                            androidx.compose.runtime.Composer m1641constructorimpl = androidx.compose.runtime.Updater.m1641constructorimpl(composer3);
                            androidx.compose.runtime.Updater.m1648setimpl(m1641constructorimpl, columnMeasurePolicy, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetMeasurePolicy());
                            androidx.compose.runtime.Updater.m1648setimpl(m1641constructorimpl, density, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetDensity());
                            androidx.compose.runtime.Updater.m1648setimpl(m1641constructorimpl, layoutDirection, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetLayoutDirection());
                            androidx.compose.runtime.Updater.m1648setimpl(m1641constructorimpl, viewConfiguration, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetViewConfiguration());
                            composer3.enableReusing();
                            materializerOf.invoke(androidx.compose.runtime.SkippableUpdater.m1632boximpl(androidx.compose.runtime.SkippableUpdater.m1633constructorimpl(composer3)), composer3, 0);
                            composer3.startReplaceableGroup(2058660585);
                            composer3.startReplaceableGroup(-1163856341);
                            androidx.compose.runtime.ComposerKt.sourceInformation(composer3, "C79@3994L9:Column.kt#2w3rfo");
                            androidx.compose.foundation.layout.ColumnScopeInstance columnScopeInstance = androidx.compose.foundation.layout.ColumnScopeInstance.INSTANCE;
                            composer3.startReplaceableGroup(-18835878);
                            androidx.compose.runtime.ComposerKt.sourceInformation(composer3, "C281@12901L8,282@12926L18:BackdropScaffold.kt#jmzs0o");
                            function2.invoke(composer3, java.lang.Integer.valueOf(i312222 & 14));
                            function22.invoke(composer3, java.lang.Integer.valueOf((i312222 >> 3) & 14));
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
                        androidx.compose.runtime.ComposerKt.sourceInformation(composer3, "285@12988L72");
                        androidx.compose.material.BackdropValue targetValue = backdropScaffoldState42222.getTargetValue();
                        kotlin.jvm.functions.Function2<androidx.compose.runtime.Composer, java.lang.Integer, kotlin.Unit> function23 = appBar;
                        kotlin.jvm.functions.Function2<androidx.compose.runtime.Composer, java.lang.Integer, kotlin.Unit> function24 = backLayerContent;
                        int i322222 = i292222;
                        androidx.compose.material.BackdropScaffoldKt.BackLayerTransition(targetValue, function23, function24, composer3, ((i322222 << 3) & 896) | ((i322222 << 3) & 112));
                        composer3.endReplaceableGroup();
                        return;
                    }
                    composer3.skipToGroupEnd();
                }
            });
            java.lang.Float valueOf2222 = java.lang.Float.valueOf(mo315toPx0680j_422222);
            startRestartGroup.startReplaceableGroup(1157296644);
            androidx.compose.runtime.ComposerKt.sourceInformation(startRestartGroup, "C(remember)P(1):Composables.kt#9igjgp");
            changed = startRestartGroup.changed(valueOf2222);
            rememberedValue = startRestartGroup.rememberedValue();
            if (!changed) {
            }
            rememberedValue = (kotlin.jvm.functions.Function1) new kotlin.jvm.functions.Function1<androidx.compose.ui.unit.Constraints, androidx.compose.ui.unit.Constraints>() { // from class: androidx.compose.material.BackdropScaffoldKt$BackdropScaffold$calculateBackLayerConstraints$1$1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(1);
                }

                @Override // kotlin.jvm.functions.Function1
                public /* bridge */ /* synthetic */ androidx.compose.ui.unit.Constraints invoke(androidx.compose.ui.unit.Constraints constraints) {
                    return androidx.compose.ui.unit.Constraints.m4412boximpl(m1239invokeZezNO4M(constraints.getValue()));
                }

                /* renamed from: invoke-ZezNO4M, reason: not valid java name */
                public final long m1239invokeZezNO4M(long j222222) {
                    return androidx.compose.ui.unit.ConstraintsKt.m4441offsetNN6EwU$default(androidx.compose.ui.unit.Constraints.m4415copyZbe2FdA$default(j222222, 0, 0, 0, 0, 10, null), 0, -kotlin.math.MathKt.roundToInt(mo315toPx0680j_422222), 1, null);
                }
            };
            startRestartGroup.updateRememberedValue(rememberedValue);
            startRestartGroup.endReplaceableGroup();
            final kotlin.jvm.functions.Function1<? super androidx.compose.ui.unit.Constraints, androidx.compose.ui.unit.Constraints> function12222 = (kotlin.jvm.functions.Function1) rememberedValue;
            final androidx.compose.ui.Modifier modifier52222 = modifier4;
            final boolean z152222 = z7;
            final boolean z162222 = z5;
            final float f112222 = f7;
            final androidx.compose.material.BackdropScaffoldState backdropScaffoldState52222 = backdropScaffoldState3;
            final float f122222 = f6;
            androidx.compose.material.BackdropScaffoldState backdropScaffoldState62222 = backdropScaffoldState3;
            composer2 = startRestartGroup;
            final int i302222 = i23;
            final androidx.compose.ui.graphics.Shape shape72222 = shape4;
            final long j222222 = j16;
            final long j232222 = j14;
            final float f132222 = f5;
            final int i312222 = i22;
            final long j242222 = j12;
            final kotlin.jvm.functions.Function3<? super androidx.compose.material.SnackbarHostState, ? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.Unit> function352222 = function33;
            int i322222 = i22 << 6;
            androidx.compose.material.SurfaceKt.m1511SurfaceFjzlyU(null, null, j13, j15, null, 0.0f, androidx.compose.runtime.internal.ComposableLambdaKt.composableLambda(composer2, -1049909631, true, new kotlin.jvm.functions.Function2<androidx.compose.runtime.Composer, java.lang.Integer, kotlin.Unit>() { // from class: androidx.compose.material.BackdropScaffoldKt$BackdropScaffold$1
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

                public final void invoke(androidx.compose.runtime.Composer composer3, int i33) {
                    androidx.compose.runtime.ComposerKt.sourceInformation(composer3, "C297@13395L24,298@13428L3119:BackdropScaffold.kt#jmzs0o");
                    if ((i33 & 11) != 2 || !composer3.getSkipping()) {
                        composer3.startReplaceableGroup(773894976);
                        androidx.compose.runtime.ComposerKt.sourceInformation(composer3, "C(rememberCoroutineScope)475@19849L144:Effects.kt#9igjgp");
                        composer3.startReplaceableGroup(-492369756);
                        androidx.compose.runtime.ComposerKt.sourceInformation(composer3, "C(remember):Composables.kt#9igjgp");
                        java.lang.Object rememberedValue2 = composer3.rememberedValue();
                        if (rememberedValue2 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                            androidx.compose.runtime.CompositionScopedCoroutineScopeCanceller compositionScopedCoroutineScopeCanceller = new androidx.compose.runtime.CompositionScopedCoroutineScopeCanceller(androidx.compose.runtime.EffectsKt.createCompositionCoroutineScope(kotlin.coroutines.EmptyCoroutineContext.INSTANCE, composer3));
                            composer3.updateRememberedValue(compositionScopedCoroutineScopeCanceller);
                            rememberedValue2 = compositionScopedCoroutineScopeCanceller;
                        }
                        composer3.endReplaceableGroup();
                        final kotlinx.coroutines.CoroutineScope coroutineScope = ((androidx.compose.runtime.CompositionScopedCoroutineScopeCanceller) rememberedValue2).getCoroutineScope();
                        composer3.endReplaceableGroup();
                        androidx.compose.ui.Modifier fillMaxSize$default = androidx.compose.foundation.layout.SizeKt.fillMaxSize$default(androidx.compose.ui.Modifier.this, 0.0f, 1, null);
                        kotlin.jvm.functions.Function2<androidx.compose.runtime.Composer, java.lang.Integer, kotlin.Unit> function2 = composableLambda2222;
                        kotlin.jvm.functions.Function1<androidx.compose.ui.unit.Constraints, androidx.compose.ui.unit.Constraints> function122222 = function12222;
                        final float f14 = mo315toPx0680j_422222;
                        final boolean z17 = z152222;
                        final boolean z18 = z162222;
                        final androidx.compose.material.BackdropScaffoldState backdropScaffoldState7 = backdropScaffoldState52222;
                        final float f15 = mo315toPx0680j_43222;
                        final int i34 = i302222;
                        final androidx.compose.ui.graphics.Shape shape8 = shape72222;
                        final long j25 = j222222;
                        final long j26 = j232222;
                        final float f16 = f132222;
                        final int i35 = i312222;
                        final float f17 = f112222;
                        final float f18 = f122222;
                        final kotlin.jvm.functions.Function2<? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.Unit> function22 = frontLayerContent;
                        final long j27 = j242222;
                        final kotlin.jvm.functions.Function3<? super androidx.compose.material.SnackbarHostState, ? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.Unit> function36 = function352222;
                        androidx.compose.material.BackdropScaffoldKt.BackdropStack(fillMaxSize$default, function2, function122222, androidx.compose.runtime.internal.ComposableLambdaKt.composableLambda(composer3, 1800047509, true, new kotlin.jvm.functions.Function4<androidx.compose.ui.unit.Constraints, java.lang.Float, androidx.compose.runtime.Composer, java.lang.Integer, kotlin.Unit>() { // from class: androidx.compose.material.BackdropScaffoldKt$BackdropScaffold$1.1
                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            /* JADX WARN: Multi-variable type inference failed */
                            {
                                super(4);
                            }

                            @Override // kotlin.jvm.functions.Function4
                            public /* bridge */ /* synthetic */ kotlin.Unit invoke(androidx.compose.ui.unit.Constraints constraints, java.lang.Float f19, androidx.compose.runtime.Composer composer4, java.lang.Integer num) {
                                m1237invokejYbf7pk(constraints.getValue(), f19.floatValue(), composer4, num.intValue());
                                return kotlin.Unit.INSTANCE;
                            }

                            /* renamed from: invoke-jYbf7pk, reason: not valid java name */
                            public final void m1237invokejYbf7pk(long j28, float f19, androidx.compose.runtime.Composer composer4, int i36) {
                                int i37;
                                androidx.compose.ui.Modifier.Companion companion2;
                                androidx.compose.ui.Modifier m1521swipeablepPrIpRY;
                                float m4478constructorimpl;
                                androidx.compose.runtime.ComposerKt.sourceInformation(composer4, "CP(1:c#ui.unit.Constraints)344@15194L57,342@15132L942,366@16117L420:BackdropScaffold.kt#jmzs0o");
                                if ((i36 & 14) == 0) {
                                    i37 = i36 | (composer4.changed(j28) ? 4 : 2);
                                } else {
                                    i37 = i36;
                                }
                                if ((i36 & 112) == 0) {
                                    i37 |= composer4.changed(f19) ? 32 : 16;
                                }
                                if ((i37 & 731) != 146 || !composer4.getSkipping()) {
                                    float m4423getMaxHeightimpl = androidx.compose.ui.unit.Constraints.m4423getMaxHeightimpl(j28);
                                    float f20 = m4423getMaxHeightimpl - f14;
                                    if (z17) {
                                        f20 = java.lang.Math.min(f20, f19);
                                    }
                                    float f21 = f20;
                                    if (z18) {
                                        companion2 = androidx.compose.ui.input.nestedscroll.NestedScrollModifierKt.nestedScroll$default(androidx.compose.ui.Modifier.INSTANCE, backdropScaffoldState7.getNestedScrollConnection(), null, 2, null);
                                    } else {
                                        companion2 = androidx.compose.ui.Modifier.INSTANCE;
                                    }
                                    m1521swipeablepPrIpRY = androidx.compose.material.SwipeableKt.m1521swipeablepPrIpRY(androidx.compose.ui.Modifier.INSTANCE.then(companion2), backdropScaffoldState7, r18, androidx.compose.foundation.gestures.Orientation.Vertical, (r26 & 8) != 0 ? true : z18, (r26 & 16) != 0 ? false : false, (r26 & 32) != 0 ? null : null, (r26 & 64) != 0 ? new kotlin.jvm.functions.Function2<T, T, androidx.compose.material.FixedThreshold>() { // from class: androidx.compose.material.SwipeableKt$swipeable$1
                                        /* JADX WARN: Can't rename method to resolve collision */
                                        @Override // kotlin.jvm.functions.Function2
                                        public final androidx.compose.material.FixedThreshold invoke(T t, T t2) {
                                            return new androidx.compose.material.FixedThreshold(androidx.compose.ui.unit.Dp.m4478constructorimpl(56), null);
                                        }
                                    } : null, (r26 & 128) != 0 ? androidx.compose.material.SwipeableDefaults.resistanceConfig$default(androidx.compose.material.SwipeableDefaults.INSTANCE, kotlin.collections.MapsKt.mapOf(kotlin.TuplesKt.to(java.lang.Float.valueOf(f15), androidx.compose.material.BackdropValue.Concealed), kotlin.TuplesKt.to(java.lang.Float.valueOf(f21), androidx.compose.material.BackdropValue.Revealed)).keySet(), 0.0f, 0.0f, 6, null) : null, (r26 & 256) != 0 ? androidx.compose.material.SwipeableDefaults.INSTANCE.m1520getVelocityThresholdD9Ej5fM() : 0.0f);
                                    final androidx.compose.material.BackdropScaffoldState backdropScaffoldState8 = backdropScaffoldState7;
                                    final kotlinx.coroutines.CoroutineScope coroutineScope2 = coroutineScope;
                                    androidx.compose.ui.Modifier semantics$default = androidx.compose.ui.semantics.SemanticsModifierKt.semantics$default(m1521swipeablepPrIpRY, false, new kotlin.jvm.functions.Function1<androidx.compose.ui.semantics.SemanticsPropertyReceiver, kotlin.Unit>() { // from class: androidx.compose.material.BackdropScaffoldKt$BackdropScaffold$1$1$swipeable$1
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
                                            if (androidx.compose.material.BackdropScaffoldState.this.isConcealed()) {
                                                final androidx.compose.material.BackdropScaffoldState backdropScaffoldState9 = androidx.compose.material.BackdropScaffoldState.this;
                                                final kotlinx.coroutines.CoroutineScope coroutineScope3 = coroutineScope2;
                                                androidx.compose.ui.semantics.SemanticsPropertiesKt.collapse$default(semantics, null, new kotlin.jvm.functions.Function0<java.lang.Boolean>() { // from class: androidx.compose.material.BackdropScaffoldKt$BackdropScaffold$1$1$swipeable$1.1
                                                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                                    {
                                                        super(0);
                                                    }

                                                    /* JADX WARN: Can't rename method to resolve collision */
                                                    @Override // kotlin.jvm.functions.Function0
                                                    public final java.lang.Boolean invoke() {
                                                        if (androidx.compose.material.BackdropScaffoldState.this.getConfirmStateChange$material_release().invoke(androidx.compose.material.BackdropValue.Revealed).booleanValue()) {
                                                            kotlinx.coroutines.BuildersKt__Builders_commonKt.launch$default(coroutineScope3, null, null, new androidx.compose.material.BackdropScaffoldKt$BackdropScaffold$1$1$swipeable$1.AnonymousClass1.C00371(androidx.compose.material.BackdropScaffoldState.this, null), 3, null);
                                                        }
                                                        return true;
                                                    }

                                                    /* compiled from: BackdropScaffold.kt */
                                                    @kotlin.Metadata(k = 3, mv = {1, 6, 0}, xi = 48)
                                                    @kotlin.coroutines.jvm.internal.DebugMetadata(c = "androidx.compose.material.BackdropScaffoldKt$BackdropScaffold$1$1$swipeable$1$1$1", f = "BackdropScaffold.kt", i = {}, l = {330}, m = "invokeSuspend", n = {}, s = {})
                                                    /* renamed from: androidx.compose.material.BackdropScaffoldKt$BackdropScaffold$1$1$swipeable$1$1$1, reason: invalid class name and collision with other inner class name */
                                                    static final class C00371 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<kotlinx.coroutines.CoroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> {
                                                        final /* synthetic */ androidx.compose.material.BackdropScaffoldState $scaffoldState;
                                                        int label;

                                                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                                        C00371(androidx.compose.material.BackdropScaffoldState backdropScaffoldState, kotlin.coroutines.Continuation<? super androidx.compose.material.BackdropScaffoldKt$BackdropScaffold$1$1$swipeable$1.AnonymousClass1.C00371> continuation) {
                                                            super(2, continuation);
                                                            this.$scaffoldState = backdropScaffoldState;
                                                        }

                                                        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                                                        public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object obj, kotlin.coroutines.Continuation<?> continuation) {
                                                            return new androidx.compose.material.BackdropScaffoldKt$BackdropScaffold$1$1$swipeable$1.AnonymousClass1.C00371(this.$scaffoldState, continuation);
                                                        }

                                                        @Override // kotlin.jvm.functions.Function2
                                                        public final java.lang.Object invoke(kotlinx.coroutines.CoroutineScope coroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
                                                            return ((androidx.compose.material.BackdropScaffoldKt$BackdropScaffold$1$1$swipeable$1.AnonymousClass1.C00371) create(coroutineScope, continuation)).invokeSuspend(kotlin.Unit.INSTANCE);
                                                        }

                                                        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                                                        public final java.lang.Object invokeSuspend(java.lang.Object obj) {
                                                            java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
                                                            int i = this.label;
                                                            if (i == 0) {
                                                                kotlin.ResultKt.throwOnFailure(obj);
                                                                this.label = 1;
                                                                if (this.$scaffoldState.reveal(this) == coroutine_suspended) {
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
                                                final androidx.compose.material.BackdropScaffoldState backdropScaffoldState10 = androidx.compose.material.BackdropScaffoldState.this;
                                                final kotlinx.coroutines.CoroutineScope coroutineScope4 = coroutineScope2;
                                                androidx.compose.ui.semantics.SemanticsPropertiesKt.expand$default(semantics, null, new kotlin.jvm.functions.Function0<java.lang.Boolean>() { // from class: androidx.compose.material.BackdropScaffoldKt$BackdropScaffold$1$1$swipeable$1.2
                                                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                                    {
                                                        super(0);
                                                    }

                                                    /* JADX WARN: Can't rename method to resolve collision */
                                                    @Override // kotlin.jvm.functions.Function0
                                                    public final java.lang.Boolean invoke() {
                                                        if (androidx.compose.material.BackdropScaffoldState.this.getConfirmStateChange$material_release().invoke(androidx.compose.material.BackdropValue.Concealed).booleanValue()) {
                                                            kotlinx.coroutines.BuildersKt__Builders_commonKt.launch$default(coroutineScope4, null, null, new androidx.compose.material.BackdropScaffoldKt$BackdropScaffold$1$1$swipeable$1.AnonymousClass2.AnonymousClass1(androidx.compose.material.BackdropScaffoldState.this, null), 3, null);
                                                        }
                                                        return true;
                                                    }

                                                    /* compiled from: BackdropScaffold.kt */
                                                    @kotlin.Metadata(k = 3, mv = {1, 6, 0}, xi = 48)
                                                    @kotlin.coroutines.jvm.internal.DebugMetadata(c = "androidx.compose.material.BackdropScaffoldKt$BackdropScaffold$1$1$swipeable$1$2$1", f = "BackdropScaffold.kt", i = {}, l = {336}, m = "invokeSuspend", n = {}, s = {})
                                                    /* renamed from: androidx.compose.material.BackdropScaffoldKt$BackdropScaffold$1$1$swipeable$1$2$1, reason: invalid class name */
                                                    static final class AnonymousClass1 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<kotlinx.coroutines.CoroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> {
                                                        final /* synthetic */ androidx.compose.material.BackdropScaffoldState $scaffoldState;
                                                        int label;

                                                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                                        AnonymousClass1(androidx.compose.material.BackdropScaffoldState backdropScaffoldState, kotlin.coroutines.Continuation<? super androidx.compose.material.BackdropScaffoldKt$BackdropScaffold$1$1$swipeable$1.AnonymousClass2.AnonymousClass1> continuation) {
                                                            super(2, continuation);
                                                            this.$scaffoldState = backdropScaffoldState;
                                                        }

                                                        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                                                        public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object obj, kotlin.coroutines.Continuation<?> continuation) {
                                                            return new androidx.compose.material.BackdropScaffoldKt$BackdropScaffold$1$1$swipeable$1.AnonymousClass2.AnonymousClass1(this.$scaffoldState, continuation);
                                                        }

                                                        @Override // kotlin.jvm.functions.Function2
                                                        public final java.lang.Object invoke(kotlinx.coroutines.CoroutineScope coroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
                                                            return ((androidx.compose.material.BackdropScaffoldKt$BackdropScaffold$1$1$swipeable$1.AnonymousClass2.AnonymousClass1) create(coroutineScope, continuation)).invokeSuspend(kotlin.Unit.INSTANCE);
                                                        }

                                                        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                                                        public final java.lang.Object invokeSuspend(java.lang.Object obj) {
                                                            java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
                                                            int i = this.label;
                                                            if (i == 0) {
                                                                kotlin.ResultKt.throwOnFailure(obj);
                                                                this.label = 1;
                                                                if (this.$scaffoldState.conceal(this) == coroutine_suspended) {
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
                                    androidx.compose.ui.Modifier.Companion companion3 = androidx.compose.ui.Modifier.INSTANCE;
                                    final androidx.compose.material.BackdropScaffoldState backdropScaffoldState9 = backdropScaffoldState7;
                                    composer4.startReplaceableGroup(1157296644);
                                    androidx.compose.runtime.ComposerKt.sourceInformation(composer4, "C(remember)P(1):Composables.kt#9igjgp");
                                    boolean changed2 = composer4.changed(backdropScaffoldState9);
                                    java.lang.Object rememberedValue3 = composer4.rememberedValue();
                                    if (changed2 || rememberedValue3 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                                        rememberedValue3 = (kotlin.jvm.functions.Function1) new kotlin.jvm.functions.Function1<androidx.compose.ui.unit.Density, androidx.compose.ui.unit.IntOffset>() { // from class: androidx.compose.material.BackdropScaffoldKt$BackdropScaffold$1$1$1$1
                                            {
                                                super(1);
                                            }

                                            @Override // kotlin.jvm.functions.Function1
                                            public /* bridge */ /* synthetic */ androidx.compose.ui.unit.IntOffset invoke(androidx.compose.ui.unit.Density density) {
                                                return androidx.compose.ui.unit.IntOffset.m4601boximpl(m1238invokeBjo55l4(density));
                                            }

                                            /* renamed from: invoke-Bjo55l4, reason: not valid java name */
                                            public final long m1238invokeBjo55l4(androidx.compose.ui.unit.Density offset) {
                                                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(offset, "$this$offset");
                                                return androidx.compose.ui.unit.IntOffsetKt.IntOffset(0, kotlin.math.MathKt.roundToInt(androidx.compose.material.BackdropScaffoldState.this.getOffset().getValue().floatValue()));
                                            }
                                        };
                                        composer4.updateRememberedValue(rememberedValue3);
                                    }
                                    composer4.endReplaceableGroup();
                                    androidx.compose.ui.Modifier then = androidx.compose.foundation.layout.OffsetKt.offset(companion3, (kotlin.jvm.functions.Function1) rememberedValue3).then(semantics$default);
                                    androidx.compose.ui.graphics.Shape shape9 = shape8;
                                    long j29 = j25;
                                    long j30 = j26;
                                    float f22 = f16;
                                    final float f23 = f18;
                                    final kotlin.jvm.functions.Function2<? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.Unit> function23 = function22;
                                    final int i38 = i34;
                                    final long j31 = j27;
                                    final androidx.compose.material.BackdropScaffoldState backdropScaffoldState10 = backdropScaffoldState7;
                                    final int i39 = i35;
                                    final boolean z19 = z18;
                                    final kotlinx.coroutines.CoroutineScope coroutineScope3 = coroutineScope;
                                    androidx.compose.runtime.internal.ComposableLambda composableLambda22222 = androidx.compose.runtime.internal.ComposableLambdaKt.composableLambda(composer4, -1065299503, true, new kotlin.jvm.functions.Function2<androidx.compose.runtime.Composer, java.lang.Integer, kotlin.Unit>() { // from class: androidx.compose.material.BackdropScaffoldKt.BackdropScaffold.1.1.2
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

                                        public final void invoke(androidx.compose.runtime.Composer composer5, int i40) {
                                            androidx.compose.runtime.ComposerKt.sourceInformation(composer5, "C351@15517L543:BackdropScaffold.kt#jmzs0o");
                                            if ((i40 & 11) != 2 || !composer5.getSkipping()) {
                                                androidx.compose.ui.Modifier m572paddingqDBjuR0$default = androidx.compose.foundation.layout.PaddingKt.m572paddingqDBjuR0$default(androidx.compose.ui.Modifier.INSTANCE, 0.0f, 0.0f, 0.0f, f23, 7, null);
                                                kotlin.jvm.functions.Function2<androidx.compose.runtime.Composer, java.lang.Integer, kotlin.Unit> function24 = function23;
                                                int i41 = i38;
                                                long j32 = j31;
                                                final androidx.compose.material.BackdropScaffoldState backdropScaffoldState11 = backdropScaffoldState10;
                                                int i42 = i39;
                                                final boolean z20 = z19;
                                                final kotlinx.coroutines.CoroutineScope coroutineScope4 = coroutineScope3;
                                                composer5.startReplaceableGroup(733328855);
                                                androidx.compose.runtime.ComposerKt.sourceInformation(composer5, "C(Box)P(2,1,3)70@3267L67,71@3339L130:Box.kt#2w3rfo");
                                                androidx.compose.ui.layout.MeasurePolicy rememberBoxMeasurePolicy = androidx.compose.foundation.layout.BoxKt.rememberBoxMeasurePolicy(androidx.compose.ui.Alignment.INSTANCE.getTopStart(), false, composer5, 0);
                                                composer5.startReplaceableGroup(-1323940314);
                                                androidx.compose.runtime.ComposerKt.sourceInformation(composer5, "C(Layout)P(!1,2)74@2915L7,75@2970L7,76@3029L7,77@3041L460:Layout.kt#80mrfh");
                                                androidx.compose.runtime.ProvidableCompositionLocal<androidx.compose.ui.unit.Density> localDensity32222 = androidx.compose.ui.platform.CompositionLocalsKt.getLocalDensity();
                                                androidx.compose.runtime.ComposerKt.sourceInformationMarkerStart(composer5, 2023513938, "C:CompositionLocal.kt#9igjgp");
                                                java.lang.Object consume32222 = composer5.consume(localDensity32222);
                                                androidx.compose.runtime.ComposerKt.sourceInformationMarkerEnd(composer5);
                                                androidx.compose.ui.unit.Density density = (androidx.compose.ui.unit.Density) consume32222;
                                                androidx.compose.runtime.ProvidableCompositionLocal<androidx.compose.ui.unit.LayoutDirection> localLayoutDirection = androidx.compose.ui.platform.CompositionLocalsKt.getLocalLayoutDirection();
                                                androidx.compose.runtime.ComposerKt.sourceInformationMarkerStart(composer5, 2023513938, "C:CompositionLocal.kt#9igjgp");
                                                java.lang.Object consume4 = composer5.consume(localLayoutDirection);
                                                androidx.compose.runtime.ComposerKt.sourceInformationMarkerEnd(composer5);
                                                androidx.compose.ui.unit.LayoutDirection layoutDirection = (androidx.compose.ui.unit.LayoutDirection) consume4;
                                                androidx.compose.runtime.ProvidableCompositionLocal<androidx.compose.ui.platform.ViewConfiguration> localViewConfiguration = androidx.compose.ui.platform.CompositionLocalsKt.getLocalViewConfiguration();
                                                androidx.compose.runtime.ComposerKt.sourceInformationMarkerStart(composer5, 2023513938, "C:CompositionLocal.kt#9igjgp");
                                                java.lang.Object consume5 = composer5.consume(localViewConfiguration);
                                                androidx.compose.runtime.ComposerKt.sourceInformationMarkerEnd(composer5);
                                                androidx.compose.ui.platform.ViewConfiguration viewConfiguration = (androidx.compose.ui.platform.ViewConfiguration) consume5;
                                                kotlin.jvm.functions.Function0<androidx.compose.ui.node.ComposeUiNode> constructor = androidx.compose.ui.node.ComposeUiNode.INSTANCE.getConstructor();
                                                kotlin.jvm.functions.Function3<androidx.compose.runtime.SkippableUpdater<androidx.compose.ui.node.ComposeUiNode>, androidx.compose.runtime.Composer, java.lang.Integer, kotlin.Unit> materializerOf = androidx.compose.ui.layout.LayoutKt.materializerOf(m572paddingqDBjuR0$default);
                                                if (!(composer5.getApplier() instanceof androidx.compose.runtime.Applier)) {
                                                    androidx.compose.runtime.ComposablesKt.invalidApplier();
                                                }
                                                composer5.startReusableNode();
                                                if (composer5.getInserting()) {
                                                    composer5.createNode(constructor);
                                                } else {
                                                    composer5.useNode();
                                                }
                                                composer5.disableReusing();
                                                androidx.compose.runtime.Composer m1641constructorimpl = androidx.compose.runtime.Updater.m1641constructorimpl(composer5);
                                                androidx.compose.runtime.Updater.m1648setimpl(m1641constructorimpl, rememberBoxMeasurePolicy, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetMeasurePolicy());
                                                androidx.compose.runtime.Updater.m1648setimpl(m1641constructorimpl, density, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetDensity());
                                                androidx.compose.runtime.Updater.m1648setimpl(m1641constructorimpl, layoutDirection, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetLayoutDirection());
                                                androidx.compose.runtime.Updater.m1648setimpl(m1641constructorimpl, viewConfiguration, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetViewConfiguration());
                                                composer5.enableReusing();
                                                materializerOf.invoke(androidx.compose.runtime.SkippableUpdater.m1632boximpl(androidx.compose.runtime.SkippableUpdater.m1633constructorimpl(composer5)), composer5, 0);
                                                composer5.startReplaceableGroup(2058660585);
                                                composer5.startReplaceableGroup(-2137368960);
                                                androidx.compose.runtime.ComposerKt.sourceInformation(composer5, "C72@3384L9:Box.kt#2w3rfo");
                                                androidx.compose.foundation.layout.BoxScopeInstance boxScopeInstance = androidx.compose.foundation.layout.BoxScopeInstance.INSTANCE;
                                                composer5.startReplaceableGroup(-1889954677);
                                                androidx.compose.runtime.ComposerKt.sourceInformation(composer5, "C352@15582L19,353@15622L420:BackdropScaffold.kt#jmzs0o");
                                                function24.invoke(composer5, java.lang.Integer.valueOf((i41 >> 6) & 14));
                                                androidx.compose.material.BackdropScaffoldKt.m1233Scrim3JVO9M(j32, new kotlin.jvm.functions.Function0<kotlin.Unit>() { // from class: androidx.compose.material.BackdropScaffoldKt$BackdropScaffold$1$1$2$1$1
                                                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                                    {
                                                        super(0);
                                                    }

                                                    @Override // kotlin.jvm.functions.Function0
                                                    public /* bridge */ /* synthetic */ kotlin.Unit invoke() {
                                                        invoke2();
                                                        return kotlin.Unit.INSTANCE;
                                                    }

                                                    /* renamed from: invoke, reason: avoid collision after fix types in other method */
                                                    public final void invoke2() {
                                                        if (z20 && backdropScaffoldState11.getConfirmStateChange$material_release().invoke(androidx.compose.material.BackdropValue.Concealed).booleanValue()) {
                                                            kotlinx.coroutines.BuildersKt__Builders_commonKt.launch$default(coroutineScope4, null, null, new androidx.compose.material.BackdropScaffoldKt$BackdropScaffold$1$1$2$1$1.AnonymousClass1(backdropScaffoldState11, null), 3, null);
                                                        }
                                                    }

                                                    /* compiled from: BackdropScaffold.kt */
                                                    @kotlin.Metadata(k = 3, mv = {1, 6, 0}, xi = 48)
                                                    @kotlin.coroutines.jvm.internal.DebugMetadata(c = "androidx.compose.material.BackdropScaffoldKt$BackdropScaffold$1$1$2$1$1$1", f = "BackdropScaffold.kt", i = {}, l = {358}, m = "invokeSuspend", n = {}, s = {})
                                                    /* renamed from: androidx.compose.material.BackdropScaffoldKt$BackdropScaffold$1$1$2$1$1$1, reason: invalid class name */
                                                    static final class AnonymousClass1 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<kotlinx.coroutines.CoroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> {
                                                        final /* synthetic */ androidx.compose.material.BackdropScaffoldState $scaffoldState;
                                                        int label;

                                                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                                        AnonymousClass1(androidx.compose.material.BackdropScaffoldState backdropScaffoldState, kotlin.coroutines.Continuation<? super androidx.compose.material.BackdropScaffoldKt$BackdropScaffold$1$1$2$1$1.AnonymousClass1> continuation) {
                                                            super(2, continuation);
                                                            this.$scaffoldState = backdropScaffoldState;
                                                        }

                                                        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                                                        public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object obj, kotlin.coroutines.Continuation<?> continuation) {
                                                            return new androidx.compose.material.BackdropScaffoldKt$BackdropScaffold$1$1$2$1$1.AnonymousClass1(this.$scaffoldState, continuation);
                                                        }

                                                        @Override // kotlin.jvm.functions.Function2
                                                        public final java.lang.Object invoke(kotlinx.coroutines.CoroutineScope coroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
                                                            return ((androidx.compose.material.BackdropScaffoldKt$BackdropScaffold$1$1$2$1$1.AnonymousClass1) create(coroutineScope, continuation)).invokeSuspend(kotlin.Unit.INSTANCE);
                                                        }

                                                        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                                                        public final java.lang.Object invokeSuspend(java.lang.Object obj) {
                                                            java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
                                                            int i = this.label;
                                                            if (i == 0) {
                                                                kotlin.ResultKt.throwOnFailure(obj);
                                                                this.label = 1;
                                                                if (this.$scaffoldState.conceal(this) == coroutine_suspended) {
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
                                                }, backdropScaffoldState11.getTargetValue() == androidx.compose.material.BackdropValue.Revealed, composer5, (i42 >> 18) & 14);
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
                                    androidx.compose.material.SurfaceKt.m1511SurfaceFjzlyU(then, shape9, j29, j30, null, f22, composableLambda22222, composer4, ((i40 >> 3) & 112) | 1572864 | ((i40 >> 6) & 896) | ((i40 >> 6) & 7168) | ((i40 << 6) & 458752), 16);
                                    androidx.compose.ui.Modifier.Companion companion4 = androidx.compose.ui.Modifier.INSTANCE;
                                    if (backdropScaffoldState7.isRevealed() && f21 == m4423getMaxHeightimpl - f14) {
                                        m4478constructorimpl = f17;
                                    } else {
                                        m4478constructorimpl = androidx.compose.ui.unit.Dp.m4478constructorimpl(0);
                                    }
                                    androidx.compose.ui.Modifier m572paddingqDBjuR0$default = androidx.compose.foundation.layout.PaddingKt.m572paddingqDBjuR0$default(companion4, 0.0f, 0.0f, 0.0f, m4478constructorimpl, 7, null);
                                    androidx.compose.ui.Alignment bottomCenter = androidx.compose.ui.Alignment.INSTANCE.getBottomCenter();
                                    kotlin.jvm.functions.Function3<androidx.compose.material.SnackbarHostState, androidx.compose.runtime.Composer, java.lang.Integer, kotlin.Unit> function37 = function36;
                                    androidx.compose.material.BackdropScaffoldState backdropScaffoldState11 = backdropScaffoldState7;
                                    int i41 = i35;
                                    composer4.startReplaceableGroup(733328855);
                                    androidx.compose.runtime.ComposerKt.sourceInformation(composer4, "C(Box)P(2,1,3)70@3267L67,71@3339L130:Box.kt#2w3rfo");
                                    androidx.compose.ui.layout.MeasurePolicy rememberBoxMeasurePolicy = androidx.compose.foundation.layout.BoxKt.rememberBoxMeasurePolicy(bottomCenter, false, composer4, 6);
                                    composer4.startReplaceableGroup(-1323940314);
                                    androidx.compose.runtime.ComposerKt.sourceInformation(composer4, "C(Layout)P(!1,2)74@2915L7,75@2970L7,76@3029L7,77@3041L460:Layout.kt#80mrfh");
                                    androidx.compose.runtime.ProvidableCompositionLocal<androidx.compose.ui.unit.Density> localDensity32222 = androidx.compose.ui.platform.CompositionLocalsKt.getLocalDensity();
                                    androidx.compose.runtime.ComposerKt.sourceInformationMarkerStart(composer4, 2023513938, "C:CompositionLocal.kt#9igjgp");
                                    java.lang.Object consume32222 = composer4.consume(localDensity32222);
                                    androidx.compose.runtime.ComposerKt.sourceInformationMarkerEnd(composer4);
                                    androidx.compose.ui.unit.Density density = (androidx.compose.ui.unit.Density) consume32222;
                                    androidx.compose.runtime.ProvidableCompositionLocal<androidx.compose.ui.unit.LayoutDirection> localLayoutDirection = androidx.compose.ui.platform.CompositionLocalsKt.getLocalLayoutDirection();
                                    androidx.compose.runtime.ComposerKt.sourceInformationMarkerStart(composer4, 2023513938, "C:CompositionLocal.kt#9igjgp");
                                    java.lang.Object consume4 = composer4.consume(localLayoutDirection);
                                    androidx.compose.runtime.ComposerKt.sourceInformationMarkerEnd(composer4);
                                    androidx.compose.ui.unit.LayoutDirection layoutDirection = (androidx.compose.ui.unit.LayoutDirection) consume4;
                                    androidx.compose.runtime.ProvidableCompositionLocal<androidx.compose.ui.platform.ViewConfiguration> localViewConfiguration = androidx.compose.ui.platform.CompositionLocalsKt.getLocalViewConfiguration();
                                    androidx.compose.runtime.ComposerKt.sourceInformationMarkerStart(composer4, 2023513938, "C:CompositionLocal.kt#9igjgp");
                                    java.lang.Object consume5 = composer4.consume(localViewConfiguration);
                                    androidx.compose.runtime.ComposerKt.sourceInformationMarkerEnd(composer4);
                                    androidx.compose.ui.platform.ViewConfiguration viewConfiguration = (androidx.compose.ui.platform.ViewConfiguration) consume5;
                                    kotlin.jvm.functions.Function0<androidx.compose.ui.node.ComposeUiNode> constructor = androidx.compose.ui.node.ComposeUiNode.INSTANCE.getConstructor();
                                    kotlin.jvm.functions.Function3<androidx.compose.runtime.SkippableUpdater<androidx.compose.ui.node.ComposeUiNode>, androidx.compose.runtime.Composer, java.lang.Integer, kotlin.Unit> materializerOf = androidx.compose.ui.layout.LayoutKt.materializerOf(m572paddingqDBjuR0$default);
                                    if (!(composer4.getApplier() instanceof androidx.compose.runtime.Applier)) {
                                        androidx.compose.runtime.ComposablesKt.invalidApplier();
                                    }
                                    composer4.startReusableNode();
                                    if (composer4.getInserting()) {
                                        composer4.createNode(constructor);
                                    } else {
                                        composer4.useNode();
                                    }
                                    composer4.disableReusing();
                                    androidx.compose.runtime.Composer m1641constructorimpl = androidx.compose.runtime.Updater.m1641constructorimpl(composer4);
                                    androidx.compose.runtime.Updater.m1648setimpl(m1641constructorimpl, rememberBoxMeasurePolicy, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetMeasurePolicy());
                                    androidx.compose.runtime.Updater.m1648setimpl(m1641constructorimpl, density, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetDensity());
                                    androidx.compose.runtime.Updater.m1648setimpl(m1641constructorimpl, layoutDirection, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetLayoutDirection());
                                    androidx.compose.runtime.Updater.m1648setimpl(m1641constructorimpl, viewConfiguration, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetViewConfiguration());
                                    composer4.enableReusing();
                                    materializerOf.invoke(androidx.compose.runtime.SkippableUpdater.m1632boximpl(androidx.compose.runtime.SkippableUpdater.m1633constructorimpl(composer4)), composer4, 0);
                                    composer4.startReplaceableGroup(2058660585);
                                    composer4.startReplaceableGroup(-2137368960);
                                    androidx.compose.runtime.ComposerKt.sourceInformation(composer4, "C72@3384L9:Box.kt#2w3rfo");
                                    androidx.compose.foundation.layout.BoxScopeInstance boxScopeInstance = androidx.compose.foundation.layout.BoxScopeInstance.INSTANCE;
                                    composer4.startReplaceableGroup(1815906203);
                                    androidx.compose.runtime.ComposerKt.sourceInformation(composer4, "C375@16478L45:BackdropScaffold.kt#jmzs0o");
                                    function37.invoke(backdropScaffoldState11.getSnackbarHostState(), composer4, java.lang.Integer.valueOf((i41 >> 18) & 112));
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
            z8 = z5;
            z9 = z6;
            z10 = z7;
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
        androidx.compose.ui.graphics.Shape shape622222 = shape3;
        if ((i3 & 16384) == 0) {
        }
        if ((i3 & 32768) == 0) {
        }
        if ((i3 & 65536) == 0) {
        }
        if (i15 == 0) {
        }
        i23 = i21;
        f6 = m1230getPeekHeightD9Ej5fM;
        f7 = m1229getHeaderHeightD9Ej5fM;
        startRestartGroup.endDefaults();
        androidx.compose.runtime.ProvidableCompositionLocal<androidx.compose.ui.unit.Density> localDensity32222 = androidx.compose.ui.platform.CompositionLocalsKt.getLocalDensity();
        androidx.compose.runtime.ComposerKt.sourceInformationMarkerStart(startRestartGroup, 2023513938, "C:CompositionLocal.kt#9igjgp");
        java.lang.Object consume32222 = startRestartGroup.consume(localDensity32222);
        androidx.compose.runtime.ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
        final float mo315toPx0680j_432222 = ((androidx.compose.ui.unit.Density) consume32222).mo315toPx0680j_4(f6);
        androidx.compose.runtime.ProvidableCompositionLocal<androidx.compose.ui.unit.Density> localDensity222222 = androidx.compose.ui.platform.CompositionLocalsKt.getLocalDensity();
        androidx.compose.runtime.ComposerKt.sourceInformationMarkerStart(startRestartGroup, 2023513938, "C:CompositionLocal.kt#9igjgp");
        java.lang.Object consume222222 = startRestartGroup.consume(localDensity222222);
        androidx.compose.runtime.ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
        final float mo315toPx0680j_4222222 = ((androidx.compose.ui.unit.Density) consume222222).mo315toPx0680j_4(f7);
        final boolean z1422222 = z6;
        final androidx.compose.material.BackdropScaffoldState backdropScaffoldState422222 = backdropScaffoldState3;
        final int i2922222 = i23;
        final kotlin.jvm.functions.Function2<? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.Unit> composableLambda22222 = androidx.compose.runtime.internal.ComposableLambdaKt.composableLambda(startRestartGroup, 1744778315, true, new kotlin.jvm.functions.Function2<androidx.compose.runtime.Composer, java.lang.Integer, kotlin.Unit>() { // from class: androidx.compose.material.BackdropScaffoldKt$BackdropScaffold$backLayer$1
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

            public final void invoke(androidx.compose.runtime.Composer composer3, int i3022222) {
                androidx.compose.runtime.ComposerKt.sourceInformation(composer3, "C:BackdropScaffold.kt#jmzs0o");
                if ((i3022222 & 11) != 2 || !composer3.getSkipping()) {
                    if (z1422222) {
                        composer3.startReplaceableGroup(-1017265331);
                        androidx.compose.runtime.ComposerKt.sourceInformation(composer3, "280@12876L82");
                        kotlin.jvm.functions.Function2<androidx.compose.runtime.Composer, java.lang.Integer, kotlin.Unit> function2 = appBar;
                        int i3122222 = i2922222;
                        kotlin.jvm.functions.Function2<androidx.compose.runtime.Composer, java.lang.Integer, kotlin.Unit> function22 = backLayerContent;
                        composer3.startReplaceableGroup(-483455358);
                        androidx.compose.runtime.ComposerKt.sourceInformation(composer3, "C(Column)P(2,3,1)77@3880L61,78@3946L133:Column.kt#2w3rfo");
                        androidx.compose.ui.Modifier.Companion companion2 = androidx.compose.ui.Modifier.INSTANCE;
                        androidx.compose.ui.layout.MeasurePolicy columnMeasurePolicy = androidx.compose.foundation.layout.ColumnKt.columnMeasurePolicy(androidx.compose.foundation.layout.Arrangement.INSTANCE.getTop(), androidx.compose.ui.Alignment.INSTANCE.getStart(), composer3, 0);
                        composer3.startReplaceableGroup(-1323940314);
                        androidx.compose.runtime.ComposerKt.sourceInformation(composer3, "C(Layout)P(!1,2)74@2915L7,75@2970L7,76@3029L7,77@3041L460:Layout.kt#80mrfh");
                        androidx.compose.runtime.ProvidableCompositionLocal<androidx.compose.ui.unit.Density> localDensity322222 = androidx.compose.ui.platform.CompositionLocalsKt.getLocalDensity();
                        androidx.compose.runtime.ComposerKt.sourceInformationMarkerStart(composer3, 2023513938, "C:CompositionLocal.kt#9igjgp");
                        java.lang.Object consume322222 = composer3.consume(localDensity322222);
                        androidx.compose.runtime.ComposerKt.sourceInformationMarkerEnd(composer3);
                        androidx.compose.ui.unit.Density density = (androidx.compose.ui.unit.Density) consume322222;
                        androidx.compose.runtime.ProvidableCompositionLocal<androidx.compose.ui.unit.LayoutDirection> localLayoutDirection = androidx.compose.ui.platform.CompositionLocalsKt.getLocalLayoutDirection();
                        androidx.compose.runtime.ComposerKt.sourceInformationMarkerStart(composer3, 2023513938, "C:CompositionLocal.kt#9igjgp");
                        java.lang.Object consume4 = composer3.consume(localLayoutDirection);
                        androidx.compose.runtime.ComposerKt.sourceInformationMarkerEnd(composer3);
                        androidx.compose.ui.unit.LayoutDirection layoutDirection = (androidx.compose.ui.unit.LayoutDirection) consume4;
                        androidx.compose.runtime.ProvidableCompositionLocal<androidx.compose.ui.platform.ViewConfiguration> localViewConfiguration = androidx.compose.ui.platform.CompositionLocalsKt.getLocalViewConfiguration();
                        androidx.compose.runtime.ComposerKt.sourceInformationMarkerStart(composer3, 2023513938, "C:CompositionLocal.kt#9igjgp");
                        java.lang.Object consume5 = composer3.consume(localViewConfiguration);
                        androidx.compose.runtime.ComposerKt.sourceInformationMarkerEnd(composer3);
                        androidx.compose.ui.platform.ViewConfiguration viewConfiguration = (androidx.compose.ui.platform.ViewConfiguration) consume5;
                        kotlin.jvm.functions.Function0<androidx.compose.ui.node.ComposeUiNode> constructor = androidx.compose.ui.node.ComposeUiNode.INSTANCE.getConstructor();
                        kotlin.jvm.functions.Function3<androidx.compose.runtime.SkippableUpdater<androidx.compose.ui.node.ComposeUiNode>, androidx.compose.runtime.Composer, java.lang.Integer, kotlin.Unit> materializerOf = androidx.compose.ui.layout.LayoutKt.materializerOf(companion2);
                        if (!(composer3.getApplier() instanceof androidx.compose.runtime.Applier)) {
                            androidx.compose.runtime.ComposablesKt.invalidApplier();
                        }
                        composer3.startReusableNode();
                        if (composer3.getInserting()) {
                            composer3.createNode(constructor);
                        } else {
                            composer3.useNode();
                        }
                        composer3.disableReusing();
                        androidx.compose.runtime.Composer m1641constructorimpl = androidx.compose.runtime.Updater.m1641constructorimpl(composer3);
                        androidx.compose.runtime.Updater.m1648setimpl(m1641constructorimpl, columnMeasurePolicy, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetMeasurePolicy());
                        androidx.compose.runtime.Updater.m1648setimpl(m1641constructorimpl, density, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetDensity());
                        androidx.compose.runtime.Updater.m1648setimpl(m1641constructorimpl, layoutDirection, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetLayoutDirection());
                        androidx.compose.runtime.Updater.m1648setimpl(m1641constructorimpl, viewConfiguration, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetViewConfiguration());
                        composer3.enableReusing();
                        materializerOf.invoke(androidx.compose.runtime.SkippableUpdater.m1632boximpl(androidx.compose.runtime.SkippableUpdater.m1633constructorimpl(composer3)), composer3, 0);
                        composer3.startReplaceableGroup(2058660585);
                        composer3.startReplaceableGroup(-1163856341);
                        androidx.compose.runtime.ComposerKt.sourceInformation(composer3, "C79@3994L9:Column.kt#2w3rfo");
                        androidx.compose.foundation.layout.ColumnScopeInstance columnScopeInstance = androidx.compose.foundation.layout.ColumnScopeInstance.INSTANCE;
                        composer3.startReplaceableGroup(-18835878);
                        androidx.compose.runtime.ComposerKt.sourceInformation(composer3, "C281@12901L8,282@12926L18:BackdropScaffold.kt#jmzs0o");
                        function2.invoke(composer3, java.lang.Integer.valueOf(i3122222 & 14));
                        function22.invoke(composer3, java.lang.Integer.valueOf((i3122222 >> 3) & 14));
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
                    androidx.compose.runtime.ComposerKt.sourceInformation(composer3, "285@12988L72");
                    androidx.compose.material.BackdropValue targetValue = backdropScaffoldState422222.getTargetValue();
                    kotlin.jvm.functions.Function2<androidx.compose.runtime.Composer, java.lang.Integer, kotlin.Unit> function23 = appBar;
                    kotlin.jvm.functions.Function2<androidx.compose.runtime.Composer, java.lang.Integer, kotlin.Unit> function24 = backLayerContent;
                    int i3222222 = i2922222;
                    androidx.compose.material.BackdropScaffoldKt.BackLayerTransition(targetValue, function23, function24, composer3, ((i3222222 << 3) & 896) | ((i3222222 << 3) & 112));
                    composer3.endReplaceableGroup();
                    return;
                }
                composer3.skipToGroupEnd();
            }
        });
        java.lang.Float valueOf22222 = java.lang.Float.valueOf(mo315toPx0680j_4222222);
        startRestartGroup.startReplaceableGroup(1157296644);
        androidx.compose.runtime.ComposerKt.sourceInformation(startRestartGroup, "C(remember)P(1):Composables.kt#9igjgp");
        changed = startRestartGroup.changed(valueOf22222);
        rememberedValue = startRestartGroup.rememberedValue();
        if (!changed) {
        }
        rememberedValue = (kotlin.jvm.functions.Function1) new kotlin.jvm.functions.Function1<androidx.compose.ui.unit.Constraints, androidx.compose.ui.unit.Constraints>() { // from class: androidx.compose.material.BackdropScaffoldKt$BackdropScaffold$calculateBackLayerConstraints$1$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ androidx.compose.ui.unit.Constraints invoke(androidx.compose.ui.unit.Constraints constraints) {
                return androidx.compose.ui.unit.Constraints.m4412boximpl(m1239invokeZezNO4M(constraints.getValue()));
            }

            /* renamed from: invoke-ZezNO4M, reason: not valid java name */
            public final long m1239invokeZezNO4M(long j2222222) {
                return androidx.compose.ui.unit.ConstraintsKt.m4441offsetNN6EwU$default(androidx.compose.ui.unit.Constraints.m4415copyZbe2FdA$default(j2222222, 0, 0, 0, 0, 10, null), 0, -kotlin.math.MathKt.roundToInt(mo315toPx0680j_4222222), 1, null);
            }
        };
        startRestartGroup.updateRememberedValue(rememberedValue);
        startRestartGroup.endReplaceableGroup();
        final kotlin.jvm.functions.Function1<? super androidx.compose.ui.unit.Constraints, androidx.compose.ui.unit.Constraints> function122222 = (kotlin.jvm.functions.Function1) rememberedValue;
        final androidx.compose.ui.Modifier modifier522222 = modifier4;
        final boolean z1522222 = z7;
        final boolean z1622222 = z5;
        final float f1122222 = f7;
        final androidx.compose.material.BackdropScaffoldState backdropScaffoldState522222 = backdropScaffoldState3;
        final float f1222222 = f6;
        androidx.compose.material.BackdropScaffoldState backdropScaffoldState622222 = backdropScaffoldState3;
        composer2 = startRestartGroup;
        final int i3022222 = i23;
        final androidx.compose.ui.graphics.Shape shape722222 = shape4;
        final long j2222222 = j16;
        final long j2322222 = j14;
        final float f1322222 = f5;
        final int i3122222 = i22;
        final long j2422222 = j12;
        final kotlin.jvm.functions.Function3<? super androidx.compose.material.SnackbarHostState, ? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.Unit> function3522222 = function33;
        int i3222222 = i22 << 6;
        androidx.compose.material.SurfaceKt.m1511SurfaceFjzlyU(null, null, j13, j15, null, 0.0f, androidx.compose.runtime.internal.ComposableLambdaKt.composableLambda(composer2, -1049909631, true, new kotlin.jvm.functions.Function2<androidx.compose.runtime.Composer, java.lang.Integer, kotlin.Unit>() { // from class: androidx.compose.material.BackdropScaffoldKt$BackdropScaffold$1
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

            public final void invoke(androidx.compose.runtime.Composer composer3, int i33) {
                androidx.compose.runtime.ComposerKt.sourceInformation(composer3, "C297@13395L24,298@13428L3119:BackdropScaffold.kt#jmzs0o");
                if ((i33 & 11) != 2 || !composer3.getSkipping()) {
                    composer3.startReplaceableGroup(773894976);
                    androidx.compose.runtime.ComposerKt.sourceInformation(composer3, "C(rememberCoroutineScope)475@19849L144:Effects.kt#9igjgp");
                    composer3.startReplaceableGroup(-492369756);
                    androidx.compose.runtime.ComposerKt.sourceInformation(composer3, "C(remember):Composables.kt#9igjgp");
                    java.lang.Object rememberedValue2 = composer3.rememberedValue();
                    if (rememberedValue2 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                        androidx.compose.runtime.CompositionScopedCoroutineScopeCanceller compositionScopedCoroutineScopeCanceller = new androidx.compose.runtime.CompositionScopedCoroutineScopeCanceller(androidx.compose.runtime.EffectsKt.createCompositionCoroutineScope(kotlin.coroutines.EmptyCoroutineContext.INSTANCE, composer3));
                        composer3.updateRememberedValue(compositionScopedCoroutineScopeCanceller);
                        rememberedValue2 = compositionScopedCoroutineScopeCanceller;
                    }
                    composer3.endReplaceableGroup();
                    final kotlinx.coroutines.CoroutineScope coroutineScope = ((androidx.compose.runtime.CompositionScopedCoroutineScopeCanceller) rememberedValue2).getCoroutineScope();
                    composer3.endReplaceableGroup();
                    androidx.compose.ui.Modifier fillMaxSize$default = androidx.compose.foundation.layout.SizeKt.fillMaxSize$default(androidx.compose.ui.Modifier.this, 0.0f, 1, null);
                    kotlin.jvm.functions.Function2<androidx.compose.runtime.Composer, java.lang.Integer, kotlin.Unit> function2 = composableLambda22222;
                    kotlin.jvm.functions.Function1<androidx.compose.ui.unit.Constraints, androidx.compose.ui.unit.Constraints> function1222222 = function122222;
                    final float f14 = mo315toPx0680j_4222222;
                    final boolean z17 = z1522222;
                    final boolean z18 = z1622222;
                    final androidx.compose.material.BackdropScaffoldState backdropScaffoldState7 = backdropScaffoldState522222;
                    final float f15 = mo315toPx0680j_432222;
                    final int i34 = i3022222;
                    final androidx.compose.ui.graphics.Shape shape8 = shape722222;
                    final long j25 = j2222222;
                    final long j26 = j2322222;
                    final float f16 = f1322222;
                    final int i35 = i3122222;
                    final float f17 = f1122222;
                    final float f18 = f1222222;
                    final kotlin.jvm.functions.Function2<? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.Unit> function22 = frontLayerContent;
                    final long j27 = j2422222;
                    final kotlin.jvm.functions.Function3<? super androidx.compose.material.SnackbarHostState, ? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.Unit> function36 = function3522222;
                    androidx.compose.material.BackdropScaffoldKt.BackdropStack(fillMaxSize$default, function2, function1222222, androidx.compose.runtime.internal.ComposableLambdaKt.composableLambda(composer3, 1800047509, true, new kotlin.jvm.functions.Function4<androidx.compose.ui.unit.Constraints, java.lang.Float, androidx.compose.runtime.Composer, java.lang.Integer, kotlin.Unit>() { // from class: androidx.compose.material.BackdropScaffoldKt$BackdropScaffold$1.1
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        /* JADX WARN: Multi-variable type inference failed */
                        {
                            super(4);
                        }

                        @Override // kotlin.jvm.functions.Function4
                        public /* bridge */ /* synthetic */ kotlin.Unit invoke(androidx.compose.ui.unit.Constraints constraints, java.lang.Float f19, androidx.compose.runtime.Composer composer4, java.lang.Integer num) {
                            m1237invokejYbf7pk(constraints.getValue(), f19.floatValue(), composer4, num.intValue());
                            return kotlin.Unit.INSTANCE;
                        }

                        /* renamed from: invoke-jYbf7pk, reason: not valid java name */
                        public final void m1237invokejYbf7pk(long j28, float f19, androidx.compose.runtime.Composer composer4, int i36) {
                            int i37;
                            androidx.compose.ui.Modifier.Companion companion2;
                            androidx.compose.ui.Modifier m1521swipeablepPrIpRY;
                            float m4478constructorimpl;
                            androidx.compose.runtime.ComposerKt.sourceInformation(composer4, "CP(1:c#ui.unit.Constraints)344@15194L57,342@15132L942,366@16117L420:BackdropScaffold.kt#jmzs0o");
                            if ((i36 & 14) == 0) {
                                i37 = i36 | (composer4.changed(j28) ? 4 : 2);
                            } else {
                                i37 = i36;
                            }
                            if ((i36 & 112) == 0) {
                                i37 |= composer4.changed(f19) ? 32 : 16;
                            }
                            if ((i37 & 731) != 146 || !composer4.getSkipping()) {
                                float m4423getMaxHeightimpl = androidx.compose.ui.unit.Constraints.m4423getMaxHeightimpl(j28);
                                float f20 = m4423getMaxHeightimpl - f14;
                                if (z17) {
                                    f20 = java.lang.Math.min(f20, f19);
                                }
                                float f21 = f20;
                                if (z18) {
                                    companion2 = androidx.compose.ui.input.nestedscroll.NestedScrollModifierKt.nestedScroll$default(androidx.compose.ui.Modifier.INSTANCE, backdropScaffoldState7.getNestedScrollConnection(), null, 2, null);
                                } else {
                                    companion2 = androidx.compose.ui.Modifier.INSTANCE;
                                }
                                m1521swipeablepPrIpRY = androidx.compose.material.SwipeableKt.m1521swipeablepPrIpRY(androidx.compose.ui.Modifier.INSTANCE.then(companion2), backdropScaffoldState7, r18, androidx.compose.foundation.gestures.Orientation.Vertical, (r26 & 8) != 0 ? true : z18, (r26 & 16) != 0 ? false : false, (r26 & 32) != 0 ? null : null, (r26 & 64) != 0 ? new kotlin.jvm.functions.Function2<T, T, androidx.compose.material.FixedThreshold>() { // from class: androidx.compose.material.SwipeableKt$swipeable$1
                                    /* JADX WARN: Can't rename method to resolve collision */
                                    @Override // kotlin.jvm.functions.Function2
                                    public final androidx.compose.material.FixedThreshold invoke(T t, T t2) {
                                        return new androidx.compose.material.FixedThreshold(androidx.compose.ui.unit.Dp.m4478constructorimpl(56), null);
                                    }
                                } : null, (r26 & 128) != 0 ? androidx.compose.material.SwipeableDefaults.resistanceConfig$default(androidx.compose.material.SwipeableDefaults.INSTANCE, kotlin.collections.MapsKt.mapOf(kotlin.TuplesKt.to(java.lang.Float.valueOf(f15), androidx.compose.material.BackdropValue.Concealed), kotlin.TuplesKt.to(java.lang.Float.valueOf(f21), androidx.compose.material.BackdropValue.Revealed)).keySet(), 0.0f, 0.0f, 6, null) : null, (r26 & 256) != 0 ? androidx.compose.material.SwipeableDefaults.INSTANCE.m1520getVelocityThresholdD9Ej5fM() : 0.0f);
                                final androidx.compose.material.BackdropScaffoldState backdropScaffoldState8 = backdropScaffoldState7;
                                final kotlinx.coroutines.CoroutineScope coroutineScope2 = coroutineScope;
                                androidx.compose.ui.Modifier semantics$default = androidx.compose.ui.semantics.SemanticsModifierKt.semantics$default(m1521swipeablepPrIpRY, false, new kotlin.jvm.functions.Function1<androidx.compose.ui.semantics.SemanticsPropertyReceiver, kotlin.Unit>() { // from class: androidx.compose.material.BackdropScaffoldKt$BackdropScaffold$1$1$swipeable$1
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
                                        if (androidx.compose.material.BackdropScaffoldState.this.isConcealed()) {
                                            final androidx.compose.material.BackdropScaffoldState backdropScaffoldState9 = androidx.compose.material.BackdropScaffoldState.this;
                                            final kotlinx.coroutines.CoroutineScope coroutineScope3 = coroutineScope2;
                                            androidx.compose.ui.semantics.SemanticsPropertiesKt.collapse$default(semantics, null, new kotlin.jvm.functions.Function0<java.lang.Boolean>() { // from class: androidx.compose.material.BackdropScaffoldKt$BackdropScaffold$1$1$swipeable$1.1
                                                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                                {
                                                    super(0);
                                                }

                                                /* JADX WARN: Can't rename method to resolve collision */
                                                @Override // kotlin.jvm.functions.Function0
                                                public final java.lang.Boolean invoke() {
                                                    if (androidx.compose.material.BackdropScaffoldState.this.getConfirmStateChange$material_release().invoke(androidx.compose.material.BackdropValue.Revealed).booleanValue()) {
                                                        kotlinx.coroutines.BuildersKt__Builders_commonKt.launch$default(coroutineScope3, null, null, new androidx.compose.material.BackdropScaffoldKt$BackdropScaffold$1$1$swipeable$1.AnonymousClass1.C00371(androidx.compose.material.BackdropScaffoldState.this, null), 3, null);
                                                    }
                                                    return true;
                                                }

                                                /* compiled from: BackdropScaffold.kt */
                                                @kotlin.Metadata(k = 3, mv = {1, 6, 0}, xi = 48)
                                                @kotlin.coroutines.jvm.internal.DebugMetadata(c = "androidx.compose.material.BackdropScaffoldKt$BackdropScaffold$1$1$swipeable$1$1$1", f = "BackdropScaffold.kt", i = {}, l = {330}, m = "invokeSuspend", n = {}, s = {})
                                                /* renamed from: androidx.compose.material.BackdropScaffoldKt$BackdropScaffold$1$1$swipeable$1$1$1, reason: invalid class name and collision with other inner class name */
                                                static final class C00371 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<kotlinx.coroutines.CoroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> {
                                                    final /* synthetic */ androidx.compose.material.BackdropScaffoldState $scaffoldState;
                                                    int label;

                                                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                                    C00371(androidx.compose.material.BackdropScaffoldState backdropScaffoldState, kotlin.coroutines.Continuation<? super androidx.compose.material.BackdropScaffoldKt$BackdropScaffold$1$1$swipeable$1.AnonymousClass1.C00371> continuation) {
                                                        super(2, continuation);
                                                        this.$scaffoldState = backdropScaffoldState;
                                                    }

                                                    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                                                    public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object obj, kotlin.coroutines.Continuation<?> continuation) {
                                                        return new androidx.compose.material.BackdropScaffoldKt$BackdropScaffold$1$1$swipeable$1.AnonymousClass1.C00371(this.$scaffoldState, continuation);
                                                    }

                                                    @Override // kotlin.jvm.functions.Function2
                                                    public final java.lang.Object invoke(kotlinx.coroutines.CoroutineScope coroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
                                                        return ((androidx.compose.material.BackdropScaffoldKt$BackdropScaffold$1$1$swipeable$1.AnonymousClass1.C00371) create(coroutineScope, continuation)).invokeSuspend(kotlin.Unit.INSTANCE);
                                                    }

                                                    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                                                    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
                                                        java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
                                                        int i = this.label;
                                                        if (i == 0) {
                                                            kotlin.ResultKt.throwOnFailure(obj);
                                                            this.label = 1;
                                                            if (this.$scaffoldState.reveal(this) == coroutine_suspended) {
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
                                            final androidx.compose.material.BackdropScaffoldState backdropScaffoldState10 = androidx.compose.material.BackdropScaffoldState.this;
                                            final kotlinx.coroutines.CoroutineScope coroutineScope4 = coroutineScope2;
                                            androidx.compose.ui.semantics.SemanticsPropertiesKt.expand$default(semantics, null, new kotlin.jvm.functions.Function0<java.lang.Boolean>() { // from class: androidx.compose.material.BackdropScaffoldKt$BackdropScaffold$1$1$swipeable$1.2
                                                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                                {
                                                    super(0);
                                                }

                                                /* JADX WARN: Can't rename method to resolve collision */
                                                @Override // kotlin.jvm.functions.Function0
                                                public final java.lang.Boolean invoke() {
                                                    if (androidx.compose.material.BackdropScaffoldState.this.getConfirmStateChange$material_release().invoke(androidx.compose.material.BackdropValue.Concealed).booleanValue()) {
                                                        kotlinx.coroutines.BuildersKt__Builders_commonKt.launch$default(coroutineScope4, null, null, new androidx.compose.material.BackdropScaffoldKt$BackdropScaffold$1$1$swipeable$1.AnonymousClass2.AnonymousClass1(androidx.compose.material.BackdropScaffoldState.this, null), 3, null);
                                                    }
                                                    return true;
                                                }

                                                /* compiled from: BackdropScaffold.kt */
                                                @kotlin.Metadata(k = 3, mv = {1, 6, 0}, xi = 48)
                                                @kotlin.coroutines.jvm.internal.DebugMetadata(c = "androidx.compose.material.BackdropScaffoldKt$BackdropScaffold$1$1$swipeable$1$2$1", f = "BackdropScaffold.kt", i = {}, l = {336}, m = "invokeSuspend", n = {}, s = {})
                                                /* renamed from: androidx.compose.material.BackdropScaffoldKt$BackdropScaffold$1$1$swipeable$1$2$1, reason: invalid class name */
                                                static final class AnonymousClass1 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<kotlinx.coroutines.CoroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> {
                                                    final /* synthetic */ androidx.compose.material.BackdropScaffoldState $scaffoldState;
                                                    int label;

                                                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                                    AnonymousClass1(androidx.compose.material.BackdropScaffoldState backdropScaffoldState, kotlin.coroutines.Continuation<? super androidx.compose.material.BackdropScaffoldKt$BackdropScaffold$1$1$swipeable$1.AnonymousClass2.AnonymousClass1> continuation) {
                                                        super(2, continuation);
                                                        this.$scaffoldState = backdropScaffoldState;
                                                    }

                                                    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                                                    public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object obj, kotlin.coroutines.Continuation<?> continuation) {
                                                        return new androidx.compose.material.BackdropScaffoldKt$BackdropScaffold$1$1$swipeable$1.AnonymousClass2.AnonymousClass1(this.$scaffoldState, continuation);
                                                    }

                                                    @Override // kotlin.jvm.functions.Function2
                                                    public final java.lang.Object invoke(kotlinx.coroutines.CoroutineScope coroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
                                                        return ((androidx.compose.material.BackdropScaffoldKt$BackdropScaffold$1$1$swipeable$1.AnonymousClass2.AnonymousClass1) create(coroutineScope, continuation)).invokeSuspend(kotlin.Unit.INSTANCE);
                                                    }

                                                    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                                                    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
                                                        java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
                                                        int i = this.label;
                                                        if (i == 0) {
                                                            kotlin.ResultKt.throwOnFailure(obj);
                                                            this.label = 1;
                                                            if (this.$scaffoldState.conceal(this) == coroutine_suspended) {
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
                                androidx.compose.ui.Modifier.Companion companion3 = androidx.compose.ui.Modifier.INSTANCE;
                                final androidx.compose.material.BackdropScaffoldState backdropScaffoldState9 = backdropScaffoldState7;
                                composer4.startReplaceableGroup(1157296644);
                                androidx.compose.runtime.ComposerKt.sourceInformation(composer4, "C(remember)P(1):Composables.kt#9igjgp");
                                boolean changed2 = composer4.changed(backdropScaffoldState9);
                                java.lang.Object rememberedValue3 = composer4.rememberedValue();
                                if (changed2 || rememberedValue3 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                                    rememberedValue3 = (kotlin.jvm.functions.Function1) new kotlin.jvm.functions.Function1<androidx.compose.ui.unit.Density, androidx.compose.ui.unit.IntOffset>() { // from class: androidx.compose.material.BackdropScaffoldKt$BackdropScaffold$1$1$1$1
                                        {
                                            super(1);
                                        }

                                        @Override // kotlin.jvm.functions.Function1
                                        public /* bridge */ /* synthetic */ androidx.compose.ui.unit.IntOffset invoke(androidx.compose.ui.unit.Density density) {
                                            return androidx.compose.ui.unit.IntOffset.m4601boximpl(m1238invokeBjo55l4(density));
                                        }

                                        /* renamed from: invoke-Bjo55l4, reason: not valid java name */
                                        public final long m1238invokeBjo55l4(androidx.compose.ui.unit.Density offset) {
                                            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(offset, "$this$offset");
                                            return androidx.compose.ui.unit.IntOffsetKt.IntOffset(0, kotlin.math.MathKt.roundToInt(androidx.compose.material.BackdropScaffoldState.this.getOffset().getValue().floatValue()));
                                        }
                                    };
                                    composer4.updateRememberedValue(rememberedValue3);
                                }
                                composer4.endReplaceableGroup();
                                androidx.compose.ui.Modifier then = androidx.compose.foundation.layout.OffsetKt.offset(companion3, (kotlin.jvm.functions.Function1) rememberedValue3).then(semantics$default);
                                androidx.compose.ui.graphics.Shape shape9 = shape8;
                                long j29 = j25;
                                long j30 = j26;
                                float f22 = f16;
                                final float f23 = f18;
                                final kotlin.jvm.functions.Function2<? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.Unit> function23 = function22;
                                final int i38 = i34;
                                final long j31 = j27;
                                final androidx.compose.material.BackdropScaffoldState backdropScaffoldState10 = backdropScaffoldState7;
                                final int i39 = i35;
                                final boolean z19 = z18;
                                final kotlinx.coroutines.CoroutineScope coroutineScope3 = coroutineScope;
                                androidx.compose.runtime.internal.ComposableLambda composableLambda222222 = androidx.compose.runtime.internal.ComposableLambdaKt.composableLambda(composer4, -1065299503, true, new kotlin.jvm.functions.Function2<androidx.compose.runtime.Composer, java.lang.Integer, kotlin.Unit>() { // from class: androidx.compose.material.BackdropScaffoldKt.BackdropScaffold.1.1.2
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

                                    public final void invoke(androidx.compose.runtime.Composer composer5, int i40) {
                                        androidx.compose.runtime.ComposerKt.sourceInformation(composer5, "C351@15517L543:BackdropScaffold.kt#jmzs0o");
                                        if ((i40 & 11) != 2 || !composer5.getSkipping()) {
                                            androidx.compose.ui.Modifier m572paddingqDBjuR0$default = androidx.compose.foundation.layout.PaddingKt.m572paddingqDBjuR0$default(androidx.compose.ui.Modifier.INSTANCE, 0.0f, 0.0f, 0.0f, f23, 7, null);
                                            kotlin.jvm.functions.Function2<androidx.compose.runtime.Composer, java.lang.Integer, kotlin.Unit> function24 = function23;
                                            int i41 = i38;
                                            long j32 = j31;
                                            final androidx.compose.material.BackdropScaffoldState backdropScaffoldState11 = backdropScaffoldState10;
                                            int i42 = i39;
                                            final boolean z20 = z19;
                                            final kotlinx.coroutines.CoroutineScope coroutineScope4 = coroutineScope3;
                                            composer5.startReplaceableGroup(733328855);
                                            androidx.compose.runtime.ComposerKt.sourceInformation(composer5, "C(Box)P(2,1,3)70@3267L67,71@3339L130:Box.kt#2w3rfo");
                                            androidx.compose.ui.layout.MeasurePolicy rememberBoxMeasurePolicy = androidx.compose.foundation.layout.BoxKt.rememberBoxMeasurePolicy(androidx.compose.ui.Alignment.INSTANCE.getTopStart(), false, composer5, 0);
                                            composer5.startReplaceableGroup(-1323940314);
                                            androidx.compose.runtime.ComposerKt.sourceInformation(composer5, "C(Layout)P(!1,2)74@2915L7,75@2970L7,76@3029L7,77@3041L460:Layout.kt#80mrfh");
                                            androidx.compose.runtime.ProvidableCompositionLocal<androidx.compose.ui.unit.Density> localDensity322222 = androidx.compose.ui.platform.CompositionLocalsKt.getLocalDensity();
                                            androidx.compose.runtime.ComposerKt.sourceInformationMarkerStart(composer5, 2023513938, "C:CompositionLocal.kt#9igjgp");
                                            java.lang.Object consume322222 = composer5.consume(localDensity322222);
                                            androidx.compose.runtime.ComposerKt.sourceInformationMarkerEnd(composer5);
                                            androidx.compose.ui.unit.Density density = (androidx.compose.ui.unit.Density) consume322222;
                                            androidx.compose.runtime.ProvidableCompositionLocal<androidx.compose.ui.unit.LayoutDirection> localLayoutDirection = androidx.compose.ui.platform.CompositionLocalsKt.getLocalLayoutDirection();
                                            androidx.compose.runtime.ComposerKt.sourceInformationMarkerStart(composer5, 2023513938, "C:CompositionLocal.kt#9igjgp");
                                            java.lang.Object consume4 = composer5.consume(localLayoutDirection);
                                            androidx.compose.runtime.ComposerKt.sourceInformationMarkerEnd(composer5);
                                            androidx.compose.ui.unit.LayoutDirection layoutDirection = (androidx.compose.ui.unit.LayoutDirection) consume4;
                                            androidx.compose.runtime.ProvidableCompositionLocal<androidx.compose.ui.platform.ViewConfiguration> localViewConfiguration = androidx.compose.ui.platform.CompositionLocalsKt.getLocalViewConfiguration();
                                            androidx.compose.runtime.ComposerKt.sourceInformationMarkerStart(composer5, 2023513938, "C:CompositionLocal.kt#9igjgp");
                                            java.lang.Object consume5 = composer5.consume(localViewConfiguration);
                                            androidx.compose.runtime.ComposerKt.sourceInformationMarkerEnd(composer5);
                                            androidx.compose.ui.platform.ViewConfiguration viewConfiguration = (androidx.compose.ui.platform.ViewConfiguration) consume5;
                                            kotlin.jvm.functions.Function0<androidx.compose.ui.node.ComposeUiNode> constructor = androidx.compose.ui.node.ComposeUiNode.INSTANCE.getConstructor();
                                            kotlin.jvm.functions.Function3<androidx.compose.runtime.SkippableUpdater<androidx.compose.ui.node.ComposeUiNode>, androidx.compose.runtime.Composer, java.lang.Integer, kotlin.Unit> materializerOf = androidx.compose.ui.layout.LayoutKt.materializerOf(m572paddingqDBjuR0$default);
                                            if (!(composer5.getApplier() instanceof androidx.compose.runtime.Applier)) {
                                                androidx.compose.runtime.ComposablesKt.invalidApplier();
                                            }
                                            composer5.startReusableNode();
                                            if (composer5.getInserting()) {
                                                composer5.createNode(constructor);
                                            } else {
                                                composer5.useNode();
                                            }
                                            composer5.disableReusing();
                                            androidx.compose.runtime.Composer m1641constructorimpl = androidx.compose.runtime.Updater.m1641constructorimpl(composer5);
                                            androidx.compose.runtime.Updater.m1648setimpl(m1641constructorimpl, rememberBoxMeasurePolicy, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetMeasurePolicy());
                                            androidx.compose.runtime.Updater.m1648setimpl(m1641constructorimpl, density, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetDensity());
                                            androidx.compose.runtime.Updater.m1648setimpl(m1641constructorimpl, layoutDirection, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetLayoutDirection());
                                            androidx.compose.runtime.Updater.m1648setimpl(m1641constructorimpl, viewConfiguration, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetViewConfiguration());
                                            composer5.enableReusing();
                                            materializerOf.invoke(androidx.compose.runtime.SkippableUpdater.m1632boximpl(androidx.compose.runtime.SkippableUpdater.m1633constructorimpl(composer5)), composer5, 0);
                                            composer5.startReplaceableGroup(2058660585);
                                            composer5.startReplaceableGroup(-2137368960);
                                            androidx.compose.runtime.ComposerKt.sourceInformation(composer5, "C72@3384L9:Box.kt#2w3rfo");
                                            androidx.compose.foundation.layout.BoxScopeInstance boxScopeInstance = androidx.compose.foundation.layout.BoxScopeInstance.INSTANCE;
                                            composer5.startReplaceableGroup(-1889954677);
                                            androidx.compose.runtime.ComposerKt.sourceInformation(composer5, "C352@15582L19,353@15622L420:BackdropScaffold.kt#jmzs0o");
                                            function24.invoke(composer5, java.lang.Integer.valueOf((i41 >> 6) & 14));
                                            androidx.compose.material.BackdropScaffoldKt.m1233Scrim3JVO9M(j32, new kotlin.jvm.functions.Function0<kotlin.Unit>() { // from class: androidx.compose.material.BackdropScaffoldKt$BackdropScaffold$1$1$2$1$1
                                                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                                {
                                                    super(0);
                                                }

                                                @Override // kotlin.jvm.functions.Function0
                                                public /* bridge */ /* synthetic */ kotlin.Unit invoke() {
                                                    invoke2();
                                                    return kotlin.Unit.INSTANCE;
                                                }

                                                /* renamed from: invoke, reason: avoid collision after fix types in other method */
                                                public final void invoke2() {
                                                    if (z20 && backdropScaffoldState11.getConfirmStateChange$material_release().invoke(androidx.compose.material.BackdropValue.Concealed).booleanValue()) {
                                                        kotlinx.coroutines.BuildersKt__Builders_commonKt.launch$default(coroutineScope4, null, null, new androidx.compose.material.BackdropScaffoldKt$BackdropScaffold$1$1$2$1$1.AnonymousClass1(backdropScaffoldState11, null), 3, null);
                                                    }
                                                }

                                                /* compiled from: BackdropScaffold.kt */
                                                @kotlin.Metadata(k = 3, mv = {1, 6, 0}, xi = 48)
                                                @kotlin.coroutines.jvm.internal.DebugMetadata(c = "androidx.compose.material.BackdropScaffoldKt$BackdropScaffold$1$1$2$1$1$1", f = "BackdropScaffold.kt", i = {}, l = {358}, m = "invokeSuspend", n = {}, s = {})
                                                /* renamed from: androidx.compose.material.BackdropScaffoldKt$BackdropScaffold$1$1$2$1$1$1, reason: invalid class name */
                                                static final class AnonymousClass1 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<kotlinx.coroutines.CoroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> {
                                                    final /* synthetic */ androidx.compose.material.BackdropScaffoldState $scaffoldState;
                                                    int label;

                                                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                                    AnonymousClass1(androidx.compose.material.BackdropScaffoldState backdropScaffoldState, kotlin.coroutines.Continuation<? super androidx.compose.material.BackdropScaffoldKt$BackdropScaffold$1$1$2$1$1.AnonymousClass1> continuation) {
                                                        super(2, continuation);
                                                        this.$scaffoldState = backdropScaffoldState;
                                                    }

                                                    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                                                    public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object obj, kotlin.coroutines.Continuation<?> continuation) {
                                                        return new androidx.compose.material.BackdropScaffoldKt$BackdropScaffold$1$1$2$1$1.AnonymousClass1(this.$scaffoldState, continuation);
                                                    }

                                                    @Override // kotlin.jvm.functions.Function2
                                                    public final java.lang.Object invoke(kotlinx.coroutines.CoroutineScope coroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
                                                        return ((androidx.compose.material.BackdropScaffoldKt$BackdropScaffold$1$1$2$1$1.AnonymousClass1) create(coroutineScope, continuation)).invokeSuspend(kotlin.Unit.INSTANCE);
                                                    }

                                                    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                                                    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
                                                        java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
                                                        int i = this.label;
                                                        if (i == 0) {
                                                            kotlin.ResultKt.throwOnFailure(obj);
                                                            this.label = 1;
                                                            if (this.$scaffoldState.conceal(this) == coroutine_suspended) {
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
                                            }, backdropScaffoldState11.getTargetValue() == androidx.compose.material.BackdropValue.Revealed, composer5, (i42 >> 18) & 14);
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
                                androidx.compose.material.SurfaceKt.m1511SurfaceFjzlyU(then, shape9, j29, j30, null, f22, composableLambda222222, composer4, ((i40 >> 3) & 112) | 1572864 | ((i40 >> 6) & 896) | ((i40 >> 6) & 7168) | ((i40 << 6) & 458752), 16);
                                androidx.compose.ui.Modifier.Companion companion4 = androidx.compose.ui.Modifier.INSTANCE;
                                if (backdropScaffoldState7.isRevealed() && f21 == m4423getMaxHeightimpl - f14) {
                                    m4478constructorimpl = f17;
                                } else {
                                    m4478constructorimpl = androidx.compose.ui.unit.Dp.m4478constructorimpl(0);
                                }
                                androidx.compose.ui.Modifier m572paddingqDBjuR0$default = androidx.compose.foundation.layout.PaddingKt.m572paddingqDBjuR0$default(companion4, 0.0f, 0.0f, 0.0f, m4478constructorimpl, 7, null);
                                androidx.compose.ui.Alignment bottomCenter = androidx.compose.ui.Alignment.INSTANCE.getBottomCenter();
                                kotlin.jvm.functions.Function3<androidx.compose.material.SnackbarHostState, androidx.compose.runtime.Composer, java.lang.Integer, kotlin.Unit> function37 = function36;
                                androidx.compose.material.BackdropScaffoldState backdropScaffoldState11 = backdropScaffoldState7;
                                int i41 = i35;
                                composer4.startReplaceableGroup(733328855);
                                androidx.compose.runtime.ComposerKt.sourceInformation(composer4, "C(Box)P(2,1,3)70@3267L67,71@3339L130:Box.kt#2w3rfo");
                                androidx.compose.ui.layout.MeasurePolicy rememberBoxMeasurePolicy = androidx.compose.foundation.layout.BoxKt.rememberBoxMeasurePolicy(bottomCenter, false, composer4, 6);
                                composer4.startReplaceableGroup(-1323940314);
                                androidx.compose.runtime.ComposerKt.sourceInformation(composer4, "C(Layout)P(!1,2)74@2915L7,75@2970L7,76@3029L7,77@3041L460:Layout.kt#80mrfh");
                                androidx.compose.runtime.ProvidableCompositionLocal<androidx.compose.ui.unit.Density> localDensity322222 = androidx.compose.ui.platform.CompositionLocalsKt.getLocalDensity();
                                androidx.compose.runtime.ComposerKt.sourceInformationMarkerStart(composer4, 2023513938, "C:CompositionLocal.kt#9igjgp");
                                java.lang.Object consume322222 = composer4.consume(localDensity322222);
                                androidx.compose.runtime.ComposerKt.sourceInformationMarkerEnd(composer4);
                                androidx.compose.ui.unit.Density density = (androidx.compose.ui.unit.Density) consume322222;
                                androidx.compose.runtime.ProvidableCompositionLocal<androidx.compose.ui.unit.LayoutDirection> localLayoutDirection = androidx.compose.ui.platform.CompositionLocalsKt.getLocalLayoutDirection();
                                androidx.compose.runtime.ComposerKt.sourceInformationMarkerStart(composer4, 2023513938, "C:CompositionLocal.kt#9igjgp");
                                java.lang.Object consume4 = composer4.consume(localLayoutDirection);
                                androidx.compose.runtime.ComposerKt.sourceInformationMarkerEnd(composer4);
                                androidx.compose.ui.unit.LayoutDirection layoutDirection = (androidx.compose.ui.unit.LayoutDirection) consume4;
                                androidx.compose.runtime.ProvidableCompositionLocal<androidx.compose.ui.platform.ViewConfiguration> localViewConfiguration = androidx.compose.ui.platform.CompositionLocalsKt.getLocalViewConfiguration();
                                androidx.compose.runtime.ComposerKt.sourceInformationMarkerStart(composer4, 2023513938, "C:CompositionLocal.kt#9igjgp");
                                java.lang.Object consume5 = composer4.consume(localViewConfiguration);
                                androidx.compose.runtime.ComposerKt.sourceInformationMarkerEnd(composer4);
                                androidx.compose.ui.platform.ViewConfiguration viewConfiguration = (androidx.compose.ui.platform.ViewConfiguration) consume5;
                                kotlin.jvm.functions.Function0<androidx.compose.ui.node.ComposeUiNode> constructor = androidx.compose.ui.node.ComposeUiNode.INSTANCE.getConstructor();
                                kotlin.jvm.functions.Function3<androidx.compose.runtime.SkippableUpdater<androidx.compose.ui.node.ComposeUiNode>, androidx.compose.runtime.Composer, java.lang.Integer, kotlin.Unit> materializerOf = androidx.compose.ui.layout.LayoutKt.materializerOf(m572paddingqDBjuR0$default);
                                if (!(composer4.getApplier() instanceof androidx.compose.runtime.Applier)) {
                                    androidx.compose.runtime.ComposablesKt.invalidApplier();
                                }
                                composer4.startReusableNode();
                                if (composer4.getInserting()) {
                                    composer4.createNode(constructor);
                                } else {
                                    composer4.useNode();
                                }
                                composer4.disableReusing();
                                androidx.compose.runtime.Composer m1641constructorimpl = androidx.compose.runtime.Updater.m1641constructorimpl(composer4);
                                androidx.compose.runtime.Updater.m1648setimpl(m1641constructorimpl, rememberBoxMeasurePolicy, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetMeasurePolicy());
                                androidx.compose.runtime.Updater.m1648setimpl(m1641constructorimpl, density, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetDensity());
                                androidx.compose.runtime.Updater.m1648setimpl(m1641constructorimpl, layoutDirection, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetLayoutDirection());
                                androidx.compose.runtime.Updater.m1648setimpl(m1641constructorimpl, viewConfiguration, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetViewConfiguration());
                                composer4.enableReusing();
                                materializerOf.invoke(androidx.compose.runtime.SkippableUpdater.m1632boximpl(androidx.compose.runtime.SkippableUpdater.m1633constructorimpl(composer4)), composer4, 0);
                                composer4.startReplaceableGroup(2058660585);
                                composer4.startReplaceableGroup(-2137368960);
                                androidx.compose.runtime.ComposerKt.sourceInformation(composer4, "C72@3384L9:Box.kt#2w3rfo");
                                androidx.compose.foundation.layout.BoxScopeInstance boxScopeInstance = androidx.compose.foundation.layout.BoxScopeInstance.INSTANCE;
                                composer4.startReplaceableGroup(1815906203);
                                androidx.compose.runtime.ComposerKt.sourceInformation(composer4, "C375@16478L45:BackdropScaffold.kt#jmzs0o");
                                function37.invoke(backdropScaffoldState11.getSnackbarHostState(), composer4, java.lang.Integer.valueOf((i41 >> 18) & 112));
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
        z8 = z5;
        z9 = z6;
        z10 = z7;
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
    public static final void m1233Scrim3JVO9M(final long j, final kotlin.jvm.functions.Function0<kotlin.Unit> function0, final boolean z, androidx.compose.runtime.Composer composer, final int i) {
        int i2;
        androidx.compose.ui.Modifier.Companion companion;
        androidx.compose.runtime.Composer startRestartGroup = composer.startRestartGroup(-92141505);
        androidx.compose.runtime.ComposerKt.sourceInformation(startRestartGroup, "C(Scrim)P(0:c#ui.graphics.Color)388@16708L121,401@17118L62,397@17009L171:BackdropScaffold.kt#jmzs0o");
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
        } else if (j != androidx.compose.ui.graphics.Color.INSTANCE.m2149getUnspecified0d7_KjU()) {
            final androidx.compose.runtime.State animateFloatAsState = androidx.compose.animation.core.AnimateAsStateKt.animateFloatAsState(z ? 1.0f : 0.0f, new androidx.compose.animation.core.TweenSpec(0, 0, null, 7, null), 0.0f, null, startRestartGroup, 0, 12);
            startRestartGroup.startReplaceableGroup(1010547004);
            androidx.compose.runtime.ComposerKt.sourceInformation(startRestartGroup, "393@16915L37");
            if (z) {
                androidx.compose.ui.Modifier.Companion companion2 = androidx.compose.ui.Modifier.INSTANCE;
                kotlin.Unit unit = kotlin.Unit.INSTANCE;
                startRestartGroup.startReplaceableGroup(1157296644);
                androidx.compose.runtime.ComposerKt.sourceInformation(startRestartGroup, "C(remember)P(1):Composables.kt#9igjgp");
                boolean changed = startRestartGroup.changed(function0);
                androidx.compose.material.BackdropScaffoldKt$Scrim$dismissModifier$1$1 rememberedValue = startRestartGroup.rememberedValue();
                if (changed || rememberedValue == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                    rememberedValue = new androidx.compose.material.BackdropScaffoldKt$Scrim$dismissModifier$1$1(function0, null);
                    startRestartGroup.updateRememberedValue(rememberedValue);
                }
                startRestartGroup.endReplaceableGroup();
                companion = androidx.compose.ui.input.pointer.SuspendingPointerInputFilterKt.pointerInput(companion2, unit, (kotlin.jvm.functions.Function2<? super androidx.compose.ui.input.pointer.PointerInputScope, ? super kotlin.coroutines.Continuation<? super kotlin.Unit>, ? extends java.lang.Object>) rememberedValue);
            } else {
                companion = androidx.compose.ui.Modifier.INSTANCE;
            }
            startRestartGroup.endReplaceableGroup();
            androidx.compose.ui.Modifier then = androidx.compose.foundation.layout.SizeKt.fillMaxSize$default(androidx.compose.ui.Modifier.INSTANCE, 0.0f, 1, null).then(companion);
            androidx.compose.ui.graphics.Color m2103boximpl = androidx.compose.ui.graphics.Color.m2103boximpl(j);
            startRestartGroup.startReplaceableGroup(511388516);
            androidx.compose.runtime.ComposerKt.sourceInformation(startRestartGroup, "C(remember)P(1,2):Composables.kt#9igjgp");
            boolean changed2 = startRestartGroup.changed(m2103boximpl) | startRestartGroup.changed(animateFloatAsState);
            java.lang.Object rememberedValue2 = startRestartGroup.rememberedValue();
            if (changed2 || rememberedValue2 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                rememberedValue2 = (kotlin.jvm.functions.Function1) new kotlin.jvm.functions.Function1<androidx.compose.ui.graphics.drawscope.DrawScope, kotlin.Unit>() { // from class: androidx.compose.material.BackdropScaffoldKt$Scrim$1$1
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(1);
                    }

                    @Override // kotlin.jvm.functions.Function1
                    public /* bridge */ /* synthetic */ kotlin.Unit invoke(androidx.compose.ui.graphics.drawscope.DrawScope drawScope) {
                        invoke2(drawScope);
                        return kotlin.Unit.INSTANCE;
                    }

                    /* renamed from: invoke, reason: avoid collision after fix types in other method */
                    public final void invoke2(androidx.compose.ui.graphics.drawscope.DrawScope Canvas) {
                        float m1234Scrim_3J_VO9M$lambda4;
                        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(Canvas, "$this$Canvas");
                        long j2 = j;
                        m1234Scrim_3J_VO9M$lambda4 = androidx.compose.material.BackdropScaffoldKt.m1234Scrim_3J_VO9M$lambda4(animateFloatAsState);
                        androidx.compose.ui.graphics.drawscope.DrawScope.CC.m2672drawRectnJ9OG0$default(Canvas, j2, 0L, 0L, m1234Scrim_3J_VO9M$lambda4, null, null, 0, 118, null);
                    }
                };
                startRestartGroup.updateRememberedValue(rememberedValue2);
            }
            startRestartGroup.endReplaceableGroup();
            androidx.compose.foundation.CanvasKt.Canvas(then, (kotlin.jvm.functions.Function1) rememberedValue2, startRestartGroup, 0);
        }
        androidx.compose.runtime.ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup == null) {
            return;
        }
        endRestartGroup.updateScope(new kotlin.jvm.functions.Function2<androidx.compose.runtime.Composer, java.lang.Integer, kotlin.Unit>() { // from class: androidx.compose.material.BackdropScaffoldKt$Scrim$2
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(2);
            }

            @Override // kotlin.jvm.functions.Function2
            public /* bridge */ /* synthetic */ kotlin.Unit invoke(androidx.compose.runtime.Composer composer2, java.lang.Integer num) {
                invoke(composer2, num.intValue());
                return kotlin.Unit.INSTANCE;
            }

            public final void invoke(androidx.compose.runtime.Composer composer2, int i3) {
                androidx.compose.material.BackdropScaffoldKt.m1233Scrim3JVO9M(j, function0, z, composer2, i | 1);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void BackLayerTransition(final androidx.compose.material.BackdropValue backdropValue, final kotlin.jvm.functions.Function2<? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.Unit> function2, kotlin.jvm.functions.Function2<? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.Unit> function22, androidx.compose.runtime.Composer composer, final int i) {
        int i2;
        androidx.compose.ui.Modifier m2276graphicsLayerpANQ8Wg;
        androidx.compose.ui.Modifier m2276graphicsLayerpANQ8Wg2;
        final kotlin.jvm.functions.Function2<? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.Unit> function23 = function22;
        androidx.compose.runtime.Composer startRestartGroup = composer.startRestartGroup(-950970976);
        androidx.compose.runtime.ComposerKt.sourceInformation(startRestartGroup, "C(BackLayerTransition)P(2)421@17840L112,*424@18002L7,429@18176L486:BackdropScaffold.kt#jmzs0o");
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
            androidx.compose.runtime.State animateFloatAsState = androidx.compose.animation.core.AnimateAsStateKt.animateFloatAsState(backdropValue == androidx.compose.material.BackdropValue.Revealed ? 0.0f : 2.0f, new androidx.compose.animation.core.TweenSpec(0, 0, null, 7, null), 0.0f, null, startRestartGroup, 0, 12);
            androidx.compose.runtime.ProvidableCompositionLocal<androidx.compose.ui.unit.Density> localDensity = androidx.compose.ui.platform.CompositionLocalsKt.getLocalDensity();
            androidx.compose.runtime.ComposerKt.sourceInformationMarkerStart(startRestartGroup, 2023513938, "C:CompositionLocal.kt#9igjgp");
            java.lang.Object consume = startRestartGroup.consume(localDensity);
            androidx.compose.runtime.ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
            float mo315toPx0680j_4 = ((androidx.compose.ui.unit.Density) consume).mo315toPx0680j_4(AnimationSlideOffset);
            float f = 1;
            float coerceIn = kotlin.ranges.RangesKt.coerceIn(m1231BackLayerTransition$lambda7(animateFloatAsState) - f, 0.0f, 1.0f);
            float coerceIn2 = kotlin.ranges.RangesKt.coerceIn(f - m1231BackLayerTransition$lambda7(animateFloatAsState), 0.0f, 1.0f);
            startRestartGroup.startReplaceableGroup(733328855);
            androidx.compose.runtime.ComposerKt.sourceInformation(startRestartGroup, "C(Box)P(2,1,3)70@3267L67,71@3339L130:Box.kt#2w3rfo");
            androidx.compose.ui.Modifier.Companion companion = androidx.compose.ui.Modifier.INSTANCE;
            androidx.compose.ui.layout.MeasurePolicy rememberBoxMeasurePolicy = androidx.compose.foundation.layout.BoxKt.rememberBoxMeasurePolicy(androidx.compose.ui.Alignment.INSTANCE.getTopStart(), false, startRestartGroup, 0);
            startRestartGroup.startReplaceableGroup(-1323940314);
            androidx.compose.runtime.ComposerKt.sourceInformation(startRestartGroup, "C(Layout)P(!1,2)74@2915L7,75@2970L7,76@3029L7,77@3041L460:Layout.kt#80mrfh");
            androidx.compose.runtime.ProvidableCompositionLocal<androidx.compose.ui.unit.Density> localDensity2 = androidx.compose.ui.platform.CompositionLocalsKt.getLocalDensity();
            androidx.compose.runtime.ComposerKt.sourceInformationMarkerStart(startRestartGroup, 2023513938, "C:CompositionLocal.kt#9igjgp");
            java.lang.Object consume2 = startRestartGroup.consume(localDensity2);
            androidx.compose.runtime.ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
            androidx.compose.ui.unit.Density density = (androidx.compose.ui.unit.Density) consume2;
            androidx.compose.runtime.ProvidableCompositionLocal<androidx.compose.ui.unit.LayoutDirection> localLayoutDirection = androidx.compose.ui.platform.CompositionLocalsKt.getLocalLayoutDirection();
            androidx.compose.runtime.ComposerKt.sourceInformationMarkerStart(startRestartGroup, 2023513938, "C:CompositionLocal.kt#9igjgp");
            java.lang.Object consume3 = startRestartGroup.consume(localLayoutDirection);
            androidx.compose.runtime.ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
            androidx.compose.ui.unit.LayoutDirection layoutDirection = (androidx.compose.ui.unit.LayoutDirection) consume3;
            androidx.compose.runtime.ProvidableCompositionLocal<androidx.compose.ui.platform.ViewConfiguration> localViewConfiguration = androidx.compose.ui.platform.CompositionLocalsKt.getLocalViewConfiguration();
            androidx.compose.runtime.ComposerKt.sourceInformationMarkerStart(startRestartGroup, 2023513938, "C:CompositionLocal.kt#9igjgp");
            java.lang.Object consume4 = startRestartGroup.consume(localViewConfiguration);
            androidx.compose.runtime.ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
            androidx.compose.ui.platform.ViewConfiguration viewConfiguration = (androidx.compose.ui.platform.ViewConfiguration) consume4;
            kotlin.jvm.functions.Function0<androidx.compose.ui.node.ComposeUiNode> constructor = androidx.compose.ui.node.ComposeUiNode.INSTANCE.getConstructor();
            kotlin.jvm.functions.Function3<androidx.compose.runtime.SkippableUpdater<androidx.compose.ui.node.ComposeUiNode>, androidx.compose.runtime.Composer, java.lang.Integer, kotlin.Unit> materializerOf = androidx.compose.ui.layout.LayoutKt.materializerOf(companion);
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
            androidx.compose.runtime.Updater.m1648setimpl(m1641constructorimpl, rememberBoxMeasurePolicy, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetMeasurePolicy());
            androidx.compose.runtime.Updater.m1648setimpl(m1641constructorimpl, density, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetDensity());
            androidx.compose.runtime.Updater.m1648setimpl(m1641constructorimpl, layoutDirection, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetLayoutDirection());
            androidx.compose.runtime.Updater.m1648setimpl(m1641constructorimpl, viewConfiguration, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetViewConfiguration());
            startRestartGroup.enableReusing();
            materializerOf.invoke(androidx.compose.runtime.SkippableUpdater.m1632boximpl(androidx.compose.runtime.SkippableUpdater.m1633constructorimpl(startRestartGroup)), startRestartGroup, 0);
            startRestartGroup.startReplaceableGroup(2058660585);
            startRestartGroup.startReplaceableGroup(-2137368960);
            androidx.compose.runtime.ComposerKt.sourceInformation(startRestartGroup, "C72@3384L9:Box.kt#2w3rfo");
            androidx.compose.foundation.layout.BoxScopeInstance boxScopeInstance = androidx.compose.foundation.layout.BoxScopeInstance.INSTANCE;
            startRestartGroup.startReplaceableGroup(2065804710);
            androidx.compose.runtime.ComposerKt.sourceInformation(startRestartGroup, "C430@18190L226,438@18425L231:BackdropScaffold.kt#jmzs0o");
            m2276graphicsLayerpANQ8Wg = androidx.compose.ui.graphics.GraphicsLayerModifierKt.m2276graphicsLayerpANQ8Wg(androidx.compose.ui.ZIndexModifierKt.zIndex(androidx.compose.ui.Modifier.INSTANCE, coerceIn), (r39 & 1) != 0 ? 1.0f : 0.0f, (r39 & 2) != 0 ? 1.0f : 0.0f, (r39 & 4) == 0 ? coerceIn : 1.0f, (r39 & 8) != 0 ? 0.0f : 0.0f, (r39 & 16) != 0 ? 0.0f : (f - coerceIn) * mo315toPx0680j_4, (r39 & 32) != 0 ? 0.0f : 0.0f, (r39 & 64) != 0 ? 0.0f : 0.0f, (r39 & 128) != 0 ? 0.0f : 0.0f, (r39 & 256) == 0 ? 0.0f : 0.0f, (r39 & 512) != 0 ? 8.0f : 0.0f, (r39 & 1024) != 0 ? androidx.compose.ui.graphics.TransformOrigin.INSTANCE.m2512getCenterSzJe1aQ() : 0L, (r39 & 2048) != 0 ? androidx.compose.ui.graphics.RectangleShapeKt.getRectangleShape() : null, (r39 & 4096) != 0 ? false : false, (r39 & 8192) != 0 ? null : null, (r39 & 16384) != 0 ? androidx.compose.ui.graphics.GraphicsLayerScopeKt.getDefaultShadowColor() : 0L, (r39 & 32768) != 0 ? androidx.compose.ui.graphics.GraphicsLayerScopeKt.getDefaultShadowColor() : 0L);
            startRestartGroup.startReplaceableGroup(733328855);
            androidx.compose.runtime.ComposerKt.sourceInformation(startRestartGroup, "C(Box)P(2,1,3)70@3267L67,71@3339L130:Box.kt#2w3rfo");
            androidx.compose.ui.layout.MeasurePolicy rememberBoxMeasurePolicy2 = androidx.compose.foundation.layout.BoxKt.rememberBoxMeasurePolicy(androidx.compose.ui.Alignment.INSTANCE.getTopStart(), false, startRestartGroup, 0);
            startRestartGroup.startReplaceableGroup(-1323940314);
            androidx.compose.runtime.ComposerKt.sourceInformation(startRestartGroup, "C(Layout)P(!1,2)74@2915L7,75@2970L7,76@3029L7,77@3041L460:Layout.kt#80mrfh");
            androidx.compose.runtime.ProvidableCompositionLocal<androidx.compose.ui.unit.Density> localDensity3 = androidx.compose.ui.platform.CompositionLocalsKt.getLocalDensity();
            androidx.compose.runtime.ComposerKt.sourceInformationMarkerStart(startRestartGroup, 2023513938, "C:CompositionLocal.kt#9igjgp");
            java.lang.Object consume5 = startRestartGroup.consume(localDensity3);
            androidx.compose.runtime.ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
            androidx.compose.ui.unit.Density density2 = (androidx.compose.ui.unit.Density) consume5;
            androidx.compose.runtime.ProvidableCompositionLocal<androidx.compose.ui.unit.LayoutDirection> localLayoutDirection2 = androidx.compose.ui.platform.CompositionLocalsKt.getLocalLayoutDirection();
            androidx.compose.runtime.ComposerKt.sourceInformationMarkerStart(startRestartGroup, 2023513938, "C:CompositionLocal.kt#9igjgp");
            java.lang.Object consume6 = startRestartGroup.consume(localLayoutDirection2);
            androidx.compose.runtime.ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
            androidx.compose.ui.unit.LayoutDirection layoutDirection2 = (androidx.compose.ui.unit.LayoutDirection) consume6;
            androidx.compose.runtime.ProvidableCompositionLocal<androidx.compose.ui.platform.ViewConfiguration> localViewConfiguration2 = androidx.compose.ui.platform.CompositionLocalsKt.getLocalViewConfiguration();
            androidx.compose.runtime.ComposerKt.sourceInformationMarkerStart(startRestartGroup, 2023513938, "C:CompositionLocal.kt#9igjgp");
            java.lang.Object consume7 = startRestartGroup.consume(localViewConfiguration2);
            androidx.compose.runtime.ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
            androidx.compose.ui.platform.ViewConfiguration viewConfiguration2 = (androidx.compose.ui.platform.ViewConfiguration) consume7;
            kotlin.jvm.functions.Function0<androidx.compose.ui.node.ComposeUiNode> constructor2 = androidx.compose.ui.node.ComposeUiNode.INSTANCE.getConstructor();
            kotlin.jvm.functions.Function3<androidx.compose.runtime.SkippableUpdater<androidx.compose.ui.node.ComposeUiNode>, androidx.compose.runtime.Composer, java.lang.Integer, kotlin.Unit> materializerOf2 = androidx.compose.ui.layout.LayoutKt.materializerOf(m2276graphicsLayerpANQ8Wg);
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
            androidx.compose.runtime.Updater.m1648setimpl(m1641constructorimpl2, rememberBoxMeasurePolicy2, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetMeasurePolicy());
            androidx.compose.runtime.Updater.m1648setimpl(m1641constructorimpl2, density2, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetDensity());
            androidx.compose.runtime.Updater.m1648setimpl(m1641constructorimpl2, layoutDirection2, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetLayoutDirection());
            androidx.compose.runtime.Updater.m1648setimpl(m1641constructorimpl2, viewConfiguration2, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetViewConfiguration());
            startRestartGroup.enableReusing();
            materializerOf2.invoke(androidx.compose.runtime.SkippableUpdater.m1632boximpl(androidx.compose.runtime.SkippableUpdater.m1633constructorimpl(startRestartGroup)), startRestartGroup, 0);
            startRestartGroup.startReplaceableGroup(2058660585);
            startRestartGroup.startReplaceableGroup(-2137368960);
            androidx.compose.runtime.ComposerKt.sourceInformation(startRestartGroup, "C72@3384L9:Box.kt#2w3rfo");
            androidx.compose.foundation.layout.BoxScopeInstance boxScopeInstance2 = androidx.compose.foundation.layout.BoxScopeInstance.INSTANCE;
            startRestartGroup.startReplaceableGroup(-1057690836);
            androidx.compose.runtime.ComposerKt.sourceInformation(startRestartGroup, "C436@18398L8:BackdropScaffold.kt#jmzs0o");
            function2.invoke(startRestartGroup, java.lang.Integer.valueOf((i3 >> 3) & 14));
            startRestartGroup.endReplaceableGroup();
            startRestartGroup.endReplaceableGroup();
            startRestartGroup.endReplaceableGroup();
            startRestartGroup.endNode();
            startRestartGroup.endReplaceableGroup();
            startRestartGroup.endReplaceableGroup();
            m2276graphicsLayerpANQ8Wg2 = androidx.compose.ui.graphics.GraphicsLayerModifierKt.m2276graphicsLayerpANQ8Wg(androidx.compose.ui.ZIndexModifierKt.zIndex(androidx.compose.ui.Modifier.INSTANCE, coerceIn2), (r39 & 1) != 0 ? 1.0f : 0.0f, (r39 & 2) != 0 ? 1.0f : 0.0f, (r39 & 4) == 0 ? coerceIn2 : 1.0f, (r39 & 8) != 0 ? 0.0f : 0.0f, (r39 & 16) != 0 ? 0.0f : (f - coerceIn2) * (-mo315toPx0680j_4), (r39 & 32) != 0 ? 0.0f : 0.0f, (r39 & 64) != 0 ? 0.0f : 0.0f, (r39 & 128) != 0 ? 0.0f : 0.0f, (r39 & 256) == 0 ? 0.0f : 0.0f, (r39 & 512) != 0 ? 8.0f : 0.0f, (r39 & 1024) != 0 ? androidx.compose.ui.graphics.TransformOrigin.INSTANCE.m2512getCenterSzJe1aQ() : 0L, (r39 & 2048) != 0 ? androidx.compose.ui.graphics.RectangleShapeKt.getRectangleShape() : null, (r39 & 4096) != 0 ? false : false, (r39 & 8192) != 0 ? null : null, (r39 & 16384) != 0 ? androidx.compose.ui.graphics.GraphicsLayerScopeKt.getDefaultShadowColor() : 0L, (r39 & 32768) != 0 ? androidx.compose.ui.graphics.GraphicsLayerScopeKt.getDefaultShadowColor() : 0L);
            startRestartGroup.startReplaceableGroup(733328855);
            androidx.compose.runtime.ComposerKt.sourceInformation(startRestartGroup, "C(Box)P(2,1,3)70@3267L67,71@3339L130:Box.kt#2w3rfo");
            androidx.compose.ui.layout.MeasurePolicy rememberBoxMeasurePolicy3 = androidx.compose.foundation.layout.BoxKt.rememberBoxMeasurePolicy(androidx.compose.ui.Alignment.INSTANCE.getTopStart(), false, startRestartGroup, 0);
            startRestartGroup.startReplaceableGroup(-1323940314);
            androidx.compose.runtime.ComposerKt.sourceInformation(startRestartGroup, "C(Layout)P(!1,2)74@2915L7,75@2970L7,76@3029L7,77@3041L460:Layout.kt#80mrfh");
            androidx.compose.runtime.ProvidableCompositionLocal<androidx.compose.ui.unit.Density> localDensity4 = androidx.compose.ui.platform.CompositionLocalsKt.getLocalDensity();
            androidx.compose.runtime.ComposerKt.sourceInformationMarkerStart(startRestartGroup, 2023513938, "C:CompositionLocal.kt#9igjgp");
            java.lang.Object consume8 = startRestartGroup.consume(localDensity4);
            androidx.compose.runtime.ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
            androidx.compose.ui.unit.Density density3 = (androidx.compose.ui.unit.Density) consume8;
            androidx.compose.runtime.ProvidableCompositionLocal<androidx.compose.ui.unit.LayoutDirection> localLayoutDirection3 = androidx.compose.ui.platform.CompositionLocalsKt.getLocalLayoutDirection();
            androidx.compose.runtime.ComposerKt.sourceInformationMarkerStart(startRestartGroup, 2023513938, "C:CompositionLocal.kt#9igjgp");
            java.lang.Object consume9 = startRestartGroup.consume(localLayoutDirection3);
            androidx.compose.runtime.ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
            androidx.compose.ui.unit.LayoutDirection layoutDirection3 = (androidx.compose.ui.unit.LayoutDirection) consume9;
            androidx.compose.runtime.ProvidableCompositionLocal<androidx.compose.ui.platform.ViewConfiguration> localViewConfiguration3 = androidx.compose.ui.platform.CompositionLocalsKt.getLocalViewConfiguration();
            androidx.compose.runtime.ComposerKt.sourceInformationMarkerStart(startRestartGroup, 2023513938, "C:CompositionLocal.kt#9igjgp");
            java.lang.Object consume10 = startRestartGroup.consume(localViewConfiguration3);
            androidx.compose.runtime.ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
            androidx.compose.ui.platform.ViewConfiguration viewConfiguration3 = (androidx.compose.ui.platform.ViewConfiguration) consume10;
            kotlin.jvm.functions.Function0<androidx.compose.ui.node.ComposeUiNode> constructor3 = androidx.compose.ui.node.ComposeUiNode.INSTANCE.getConstructor();
            kotlin.jvm.functions.Function3<androidx.compose.runtime.SkippableUpdater<androidx.compose.ui.node.ComposeUiNode>, androidx.compose.runtime.Composer, java.lang.Integer, kotlin.Unit> materializerOf3 = androidx.compose.ui.layout.LayoutKt.materializerOf(m2276graphicsLayerpANQ8Wg2);
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
            androidx.compose.runtime.Updater.m1648setimpl(m1641constructorimpl3, rememberBoxMeasurePolicy3, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetMeasurePolicy());
            androidx.compose.runtime.Updater.m1648setimpl(m1641constructorimpl3, density3, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetDensity());
            androidx.compose.runtime.Updater.m1648setimpl(m1641constructorimpl3, layoutDirection3, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetLayoutDirection());
            androidx.compose.runtime.Updater.m1648setimpl(m1641constructorimpl3, viewConfiguration3, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetViewConfiguration());
            startRestartGroup.enableReusing();
            materializerOf3.invoke(androidx.compose.runtime.SkippableUpdater.m1632boximpl(androidx.compose.runtime.SkippableUpdater.m1633constructorimpl(startRestartGroup)), startRestartGroup, 0);
            startRestartGroup.startReplaceableGroup(2058660585);
            startRestartGroup.startReplaceableGroup(-2137368960);
            androidx.compose.runtime.ComposerKt.sourceInformation(startRestartGroup, "C72@3384L9:Box.kt#2w3rfo");
            androidx.compose.foundation.layout.BoxScopeInstance boxScopeInstance3 = androidx.compose.foundation.layout.BoxScopeInstance.INSTANCE;
            startRestartGroup.startReplaceableGroup(-676544093);
            androidx.compose.runtime.ComposerKt.sourceInformation(startRestartGroup, "C444@18637L9:BackdropScaffold.kt#jmzs0o");
            function23 = function22;
            function23.invoke(startRestartGroup, java.lang.Integer.valueOf((i3 >> 6) & 14));
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
        androidx.compose.runtime.ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup == null) {
            return;
        }
        endRestartGroup.updateScope(new kotlin.jvm.functions.Function2<androidx.compose.runtime.Composer, java.lang.Integer, kotlin.Unit>() { // from class: androidx.compose.material.BackdropScaffoldKt$BackLayerTransition$2
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

            public final void invoke(androidx.compose.runtime.Composer composer2, int i4) {
                androidx.compose.material.BackdropScaffoldKt.BackLayerTransition(androidx.compose.material.BackdropValue.this, function2, function23, composer2, i | 1);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void BackdropStack(final androidx.compose.ui.Modifier modifier, final kotlin.jvm.functions.Function2<? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.Unit> function2, final kotlin.jvm.functions.Function1<? super androidx.compose.ui.unit.Constraints, androidx.compose.ui.unit.Constraints> function1, final kotlin.jvm.functions.Function4<? super androidx.compose.ui.unit.Constraints, ? super java.lang.Float, ? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.Unit> function4, androidx.compose.runtime.Composer composer, final int i) {
        final int i2;
        androidx.compose.runtime.Composer startRestartGroup = composer.startRestartGroup(-1248995194);
        androidx.compose.runtime.ComposerKt.sourceInformation(startRestartGroup, "C(BackdropStack)P(3)457@18967L890,457@18940L917:BackdropScaffold.kt#jmzs0o");
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
            androidx.compose.runtime.ComposerKt.sourceInformation(startRestartGroup, "C(remember)P(1,2,3):Composables.kt#9igjgp");
            boolean changed = startRestartGroup.changed(function2) | startRestartGroup.changed(function1) | startRestartGroup.changed(function4);
            java.lang.Object rememberedValue = startRestartGroup.rememberedValue();
            if (changed || rememberedValue == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                rememberedValue = (kotlin.jvm.functions.Function2) new kotlin.jvm.functions.Function2<androidx.compose.ui.layout.SubcomposeMeasureScope, androidx.compose.ui.unit.Constraints, androidx.compose.ui.layout.MeasureResult>() { // from class: androidx.compose.material.BackdropScaffoldKt$BackdropStack$1$1
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    /* JADX WARN: Multi-variable type inference failed */
                    {
                        super(2);
                    }

                    @Override // kotlin.jvm.functions.Function2
                    public /* bridge */ /* synthetic */ androidx.compose.ui.layout.MeasureResult invoke(androidx.compose.ui.layout.SubcomposeMeasureScope subcomposeMeasureScope, androidx.compose.ui.unit.Constraints constraints) {
                        return m1240invoke0kLqBqw(subcomposeMeasureScope, constraints.getValue());
                    }

                    /* renamed from: invoke-0kLqBqw, reason: not valid java name */
                    public final androidx.compose.ui.layout.MeasureResult m1240invoke0kLqBqw(androidx.compose.ui.layout.SubcomposeMeasureScope SubcomposeLayout, final long j) {
                        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(SubcomposeLayout, "$this$SubcomposeLayout");
                        final androidx.compose.ui.layout.Placeable mo3402measureBRTryo0 = ((androidx.compose.ui.layout.Measurable) kotlin.collections.CollectionsKt.first((java.util.List) SubcomposeLayout.subcompose(androidx.compose.material.BackdropLayers.Back, function2))).mo3402measureBRTryo0(function1.invoke(androidx.compose.ui.unit.Constraints.m4412boximpl(j)).getValue());
                        final float height = mo3402measureBRTryo0.getHeight();
                        androidx.compose.material.BackdropLayers backdropLayers = androidx.compose.material.BackdropLayers.Front;
                        final kotlin.jvm.functions.Function4<androidx.compose.ui.unit.Constraints, java.lang.Float, androidx.compose.runtime.Composer, java.lang.Integer, kotlin.Unit> function42 = function4;
                        final int i3 = i2;
                        java.util.List<androidx.compose.ui.layout.Measurable> subcompose = SubcomposeLayout.subcompose(backdropLayers, androidx.compose.runtime.internal.ComposableLambdaKt.composableLambdaInstance(-1222642649, true, new kotlin.jvm.functions.Function2<androidx.compose.runtime.Composer, java.lang.Integer, kotlin.Unit>() { // from class: androidx.compose.material.BackdropScaffoldKt$BackdropStack$1$1$placeables$1
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

                            public final void invoke(androidx.compose.runtime.Composer composer2, int i4) {
                                androidx.compose.runtime.ComposerKt.sourceInformation(composer2, "C466@19305L40:BackdropScaffold.kt#jmzs0o");
                                if ((i4 & 11) == 2 && composer2.getSkipping()) {
                                    composer2.skipToGroupEnd();
                                } else {
                                    function42.invoke(androidx.compose.ui.unit.Constraints.m4412boximpl(j), java.lang.Float.valueOf(height), composer2, java.lang.Integer.valueOf((i3 >> 3) & 896));
                                }
                            }
                        }));
                        java.util.ArrayList arrayList = new java.util.ArrayList(subcompose.size());
                        int size = subcompose.size();
                        for (int i4 = 0; i4 < size; i4++) {
                            arrayList.add(subcompose.get(i4).mo3402measureBRTryo0(j));
                        }
                        final java.util.ArrayList arrayList2 = arrayList;
                        int max = java.lang.Math.max(androidx.compose.ui.unit.Constraints.m4426getMinWidthimpl(j), mo3402measureBRTryo0.getWidth());
                        int max2 = java.lang.Math.max(androidx.compose.ui.unit.Constraints.m4425getMinHeightimpl(j), mo3402measureBRTryo0.getHeight());
                        int size2 = arrayList2.size();
                        int i5 = max2;
                        int i6 = max;
                        for (int i7 = 0; i7 < size2; i7++) {
                            androidx.compose.ui.layout.Placeable placeable = (androidx.compose.ui.layout.Placeable) arrayList2.get(i7);
                            i6 = java.lang.Math.max(i6, placeable.getWidth());
                            i5 = java.lang.Math.max(i5, placeable.getHeight());
                        }
                        return androidx.compose.ui.layout.MeasureScope.CC.layout$default(SubcomposeLayout, i6, i5, null, new kotlin.jvm.functions.Function1<androidx.compose.ui.layout.Placeable.PlacementScope, kotlin.Unit>() { // from class: androidx.compose.material.BackdropScaffoldKt$BackdropStack$1$1.2
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
                                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(layout, "$this$layout");
                                androidx.compose.ui.layout.Placeable.PlacementScope.placeRelative$default(layout, androidx.compose.ui.layout.Placeable.this, 0, 0, 0.0f, 4, null);
                                java.util.List<androidx.compose.ui.layout.Placeable> list = arrayList2;
                                int size3 = list.size();
                                for (int i8 = 0; i8 < size3; i8++) {
                                    androidx.compose.ui.layout.Placeable.PlacementScope.placeRelative$default(layout, list.get(i8), 0, 0, 0.0f, 4, null);
                                }
                            }
                        }, 4, null);
                    }
                };
                startRestartGroup.updateRememberedValue(rememberedValue);
            }
            startRestartGroup.endReplaceableGroup();
            androidx.compose.ui.layout.SubcomposeLayoutKt.SubcomposeLayout(modifier, (kotlin.jvm.functions.Function2) rememberedValue, startRestartGroup, i2 & 14, 0);
        } else {
            startRestartGroup.skipToGroupEnd();
        }
        androidx.compose.runtime.ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup == null) {
            return;
        }
        endRestartGroup.updateScope(new kotlin.jvm.functions.Function2<androidx.compose.runtime.Composer, java.lang.Integer, kotlin.Unit>() { // from class: androidx.compose.material.BackdropScaffoldKt$BackdropStack$2
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

            public final void invoke(androidx.compose.runtime.Composer composer2, int i3) {
                androidx.compose.material.BackdropScaffoldKt.BackdropStack(androidx.compose.ui.Modifier.this, function2, function1, function4, composer2, i | 1);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: Scrim_3J_VO9M$lambda-4, reason: not valid java name */
    public static final float m1234Scrim_3J_VO9M$lambda4(androidx.compose.runtime.State<java.lang.Float> state) {
        return state.getValue().floatValue();
    }

    /* renamed from: BackLayerTransition$lambda-7, reason: not valid java name */
    private static final float m1231BackLayerTransition$lambda7(androidx.compose.runtime.State<java.lang.Float> state) {
        return state.getValue().floatValue();
    }
}
