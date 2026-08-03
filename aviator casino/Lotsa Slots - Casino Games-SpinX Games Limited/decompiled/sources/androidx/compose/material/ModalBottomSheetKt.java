package androidx.compose.material;

/* compiled from: ModalBottomSheet.kt */
@kotlin.Metadata(d1 = {"\u0000b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\u001a\u008c\u0001\u0010\u0000\u001a\u00020\u00012\u001c\u0010\u0002\u001a\u0018\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00010\u0003¢\u0006\u0002\b\u0005¢\u0006\u0002\b\u00062\b\b\u0002\u0010\u0007\u001a\u00020\b2\b\b\u0002\u0010\t\u001a\u00020\n2\b\b\u0002\u0010\u000b\u001a\u00020\f2\b\b\u0002\u0010\r\u001a\u00020\u000e2\b\b\u0002\u0010\u000f\u001a\u00020\u00102\b\b\u0002\u0010\u0011\u001a\u00020\u00102\b\b\u0002\u0010\u0012\u001a\u00020\u00102\u0011\u0010\u0013\u001a\r\u0012\u0004\u0012\u00020\u00010\u0014¢\u0006\u0002\b\u0005H\u0007ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u0015\u0010\u0016\u001a3\u0010\u0017\u001a\u00020\u00012\u0006\u0010\u0018\u001a\u00020\u00102\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00010\u00142\u0006\u0010\u001a\u001a\u00020\u001bH\u0003ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u001c\u0010\u001d\u001a;\u0010\u001e\u001a\u00020\n2\u0006\u0010\u001f\u001a\u00020 2\u000e\b\u0002\u0010!\u001a\b\u0012\u0004\u0012\u00020#0\"2\u0014\b\u0002\u0010$\u001a\u000e\u0012\u0004\u0012\u00020 \u0012\u0004\u0012\u00020\u001b0\u0003H\u0007¢\u0006\u0002\u0010%\u001aC\u0010\u001e\u001a\u00020\n2\u0006\u0010\u001f\u001a\u00020 2\u000e\b\u0002\u0010!\u001a\b\u0012\u0004\u0012\u00020#0\"2\u0006\u0010&\u001a\u00020\u001b2\u0014\b\u0002\u0010$\u001a\u000e\u0012\u0004\u0012\u00020 \u0012\u0004\u0012\u00020\u001b0\u0003H\u0007¢\u0006\u0002\u0010'\u001a,\u0010(\u001a\u00020\b*\u00020\b2\u0006\u0010\t\u001a\u00020\n2\u0006\u0010)\u001a\u00020#2\u000e\u0010*\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010#0+H\u0002\u0082\u0002\u000b\n\u0002\b\u0019\n\u0005\b¡\u001e0\u0001¨\u0006,"}, d2 = {"ModalBottomSheetLayout", "", "sheetContent", "Lkotlin/Function1;", "Landroidx/compose/foundation/layout/ColumnScope;", "Landroidx/compose/runtime/Composable;", "Lkotlin/ExtensionFunctionType;", "modifier", "Landroidx/compose/ui/Modifier;", "sheetState", "Landroidx/compose/material/ModalBottomSheetState;", "sheetShape", "Landroidx/compose/ui/graphics/Shape;", "sheetElevation", "Landroidx/compose/ui/unit/Dp;", "sheetBackgroundColor", "Landroidx/compose/ui/graphics/Color;", "sheetContentColor", "scrimColor", "content", "Lkotlin/Function0;", "ModalBottomSheetLayout-BzaUkTc", "(Lkotlin/jvm/functions/Function3;Landroidx/compose/ui/Modifier;Landroidx/compose/material/ModalBottomSheetState;Landroidx/compose/ui/graphics/Shape;FJJJLkotlin/jvm/functions/Function2;Landroidx/compose/runtime/Composer;II)V", "Scrim", "color", "onDismiss", com.helpshift.HelpshiftEvent.DATA_SDK_VISIBLE, "", "Scrim-3J-VO9M", "(JLkotlin/jvm/functions/Function0;ZLandroidx/compose/runtime/Composer;I)V", "rememberModalBottomSheetState", "initialValue", "Landroidx/compose/material/ModalBottomSheetValue;", "animationSpec", "Landroidx/compose/animation/core/AnimationSpec;", "", "confirmStateChange", "(Landroidx/compose/material/ModalBottomSheetValue;Landroidx/compose/animation/core/AnimationSpec;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)Landroidx/compose/material/ModalBottomSheetState;", "skipHalfExpanded", "(Landroidx/compose/material/ModalBottomSheetValue;Landroidx/compose/animation/core/AnimationSpec;ZLkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)Landroidx/compose/material/ModalBottomSheetState;", "bottomSheetSwipeable", "fullHeight", "sheetHeightState", "Landroidx/compose/runtime/State;", "material_release"}, k = 2, mv = {1, 6, 0}, xi = 48)
/* loaded from: classes.dex */
public final class ModalBottomSheetKt {
    @androidx.compose.material.ExperimentalMaterialApi
    public static final androidx.compose.material.ModalBottomSheetState rememberModalBottomSheetState(final androidx.compose.material.ModalBottomSheetValue initialValue, final androidx.compose.animation.core.AnimationSpec<java.lang.Float> animationSpec, final boolean z, final kotlin.jvm.functions.Function1<? super androidx.compose.material.ModalBottomSheetValue, java.lang.Boolean> function1, androidx.compose.runtime.Composer composer, int i, int i2) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(initialValue, "initialValue");
        composer.startReplaceableGroup(-409288536);
        androidx.compose.runtime.ComposerKt.sourceInformation(composer, "C(rememberModalBottomSheetState)P(2!1,3)245@9606L533:ModalBottomSheet.kt#jmzs0o");
        if ((i2 & 2) != 0) {
            animationSpec = androidx.compose.material.SwipeableDefaults.INSTANCE.getAnimationSpec();
        }
        if ((i2 & 8) != 0) {
            function1 = new kotlin.jvm.functions.Function1<androidx.compose.material.ModalBottomSheetValue, java.lang.Boolean>() { // from class: androidx.compose.material.ModalBottomSheetKt$rememberModalBottomSheetState$1
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Boolean invoke(androidx.compose.material.ModalBottomSheetValue it) {
                    kotlin.jvm.internal.Intrinsics.checkNotNullParameter(it, "it");
                    return true;
                }
            };
        }
        androidx.compose.material.ModalBottomSheetState modalBottomSheetState = (androidx.compose.material.ModalBottomSheetState) androidx.compose.runtime.saveable.RememberSaveableKt.m1729rememberSaveable(new java.lang.Object[]{initialValue, animationSpec, java.lang.Boolean.valueOf(z), function1}, (androidx.compose.runtime.saveable.Saver) androidx.compose.material.ModalBottomSheetState.INSTANCE.Saver(animationSpec, z, function1), (java.lang.String) null, (kotlin.jvm.functions.Function0) new kotlin.jvm.functions.Function0<androidx.compose.material.ModalBottomSheetState>() { // from class: androidx.compose.material.ModalBottomSheetKt$rememberModalBottomSheetState$2
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            {
                super(0);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // kotlin.jvm.functions.Function0
            public final androidx.compose.material.ModalBottomSheetState invoke() {
                return new androidx.compose.material.ModalBottomSheetState(androidx.compose.material.ModalBottomSheetValue.this, animationSpec, z, function1);
            }
        }, composer, 72, 4);
        composer.endReplaceableGroup();
        return modalBottomSheetState;
    }

    @androidx.compose.material.ExperimentalMaterialApi
    public static final androidx.compose.material.ModalBottomSheetState rememberModalBottomSheetState(androidx.compose.material.ModalBottomSheetValue initialValue, androidx.compose.animation.core.AnimationSpec<java.lang.Float> animationSpec, kotlin.jvm.functions.Function1<? super androidx.compose.material.ModalBottomSheetValue, java.lang.Boolean> function1, androidx.compose.runtime.Composer composer, int i, int i2) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(initialValue, "initialValue");
        composer.startReplaceableGroup(-1928569212);
        androidx.compose.runtime.ComposerKt.sourceInformation(composer, "C(rememberModalBottomSheetState)P(2)275@10738L174:ModalBottomSheet.kt#jmzs0o");
        if ((i2 & 2) != 0) {
            animationSpec = androidx.compose.material.SwipeableDefaults.INSTANCE.getAnimationSpec();
        }
        androidx.compose.animation.core.AnimationSpec<java.lang.Float> animationSpec2 = animationSpec;
        if ((i2 & 4) != 0) {
            function1 = new kotlin.jvm.functions.Function1<androidx.compose.material.ModalBottomSheetValue, java.lang.Boolean>() { // from class: androidx.compose.material.ModalBottomSheetKt$rememberModalBottomSheetState$3
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Boolean invoke(androidx.compose.material.ModalBottomSheetValue it) {
                    kotlin.jvm.internal.Intrinsics.checkNotNullParameter(it, "it");
                    return true;
                }
            };
        }
        androidx.compose.material.ModalBottomSheetState rememberModalBottomSheetState = rememberModalBottomSheetState(initialValue, animationSpec2, false, function1, composer, (i & 14) | 448 | ((i << 3) & 7168), 0);
        composer.endReplaceableGroup();
        return rememberModalBottomSheetState;
    }

    /* JADX WARN: Removed duplicated region for block: B:102:0x01bd  */
    /* JADX WARN: Removed duplicated region for block: B:105:0x01d0  */
    /* JADX WARN: Removed duplicated region for block: B:108:0x01e1  */
    /* JADX WARN: Removed duplicated region for block: B:109:0x01f7  */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0057  */
    /* JADX WARN: Removed duplicated region for block: B:110:0x01db  */
    /* JADX WARN: Removed duplicated region for block: B:111:0x01ca  */
    /* JADX WARN: Removed duplicated region for block: B:112:0x01b8  */
    /* JADX WARN: Removed duplicated region for block: B:113:0x01ad  */
    /* JADX WARN: Removed duplicated region for block: B:114:0x0198  */
    /* JADX WARN: Removed duplicated region for block: B:115:0x017e  */
    /* JADX WARN: Removed duplicated region for block: B:116:0x00fc  */
    /* JADX WARN: Removed duplicated region for block: B:124:0x00f2  */
    /* JADX WARN: Removed duplicated region for block: B:126:0x00d6  */
    /* JADX WARN: Removed duplicated region for block: B:128:0x00bc  */
    /* JADX WARN: Removed duplicated region for block: B:129:0x0090  */
    /* JADX WARN: Removed duplicated region for block: B:137:0x0085  */
    /* JADX WARN: Removed duplicated region for block: B:140:0x006c  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0072  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x008b  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x00a9  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00c3  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x00dd  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x00f8  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x0116  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x029a  */
    /* JADX WARN: Removed duplicated region for block: B:65:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:68:0x013c  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x022a  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x0177  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x0184  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x019e  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x01b1  */
    @androidx.compose.material.ExperimentalMaterialApi
    /* renamed from: ModalBottomSheetLayout-BzaUkTc, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void m1428ModalBottomSheetLayoutBzaUkTc(final kotlin.jvm.functions.Function3<? super androidx.compose.foundation.layout.ColumnScope, ? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.Unit> sheetContent, androidx.compose.ui.Modifier modifier, androidx.compose.material.ModalBottomSheetState modalBottomSheetState, androidx.compose.ui.graphics.Shape shape, float f, long j, long j2, long j3, final kotlin.jvm.functions.Function2<? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.Unit> content, androidx.compose.runtime.Composer composer, final int i, final int i2) {
        int i3;
        final androidx.compose.material.ModalBottomSheetState modalBottomSheetState2;
        int i4;
        float f2;
        long j4;
        long j5;
        androidx.compose.ui.Modifier modifier2;
        androidx.compose.material.ModalBottomSheetState modalBottomSheetState3;
        androidx.compose.foundation.shape.CornerBasedShape cornerBasedShape;
        long j6;
        long j7;
        long j8;
        int i5;
        androidx.compose.material.ModalBottomSheetState modalBottomSheetState4;
        androidx.compose.ui.graphics.Shape shape2;
        float f3;
        long j9;
        long j10;
        java.lang.Object rememberedValue;
        androidx.compose.runtime.Composer composer2;
        final long j11;
        final androidx.compose.ui.graphics.Shape shape3;
        final androidx.compose.ui.Modifier modifier3;
        final float f4;
        final long j12;
        final long j13;
        androidx.compose.runtime.ScopeUpdateScope endRestartGroup;
        int i6;
        int i7;
        int i8;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(sheetContent, "sheetContent");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(content, "content");
        androidx.compose.runtime.Composer startRestartGroup = composer.startRestartGroup(-1633763156);
        androidx.compose.runtime.ComposerKt.sourceInformation(startRestartGroup, "C(ModalBottomSheetLayout)P(4,1,8,7,6:c#ui.unit.Dp,3:c#ui.graphics.Color,5:c#ui.graphics.Color,2:c#ui.graphics.Color)316@12777L37,317@12854L6,319@12977L6,320@13024L37,321@13112L10,324@13180L24,325@13209L2723:ModalBottomSheet.kt#jmzs0o");
        if ((i2 & 1) != 0) {
            i3 = i | 6;
        } else if ((i & 14) == 0) {
            i3 = (startRestartGroup.changed(sheetContent) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        int i9 = i2 & 2;
        if (i9 != 0) {
            i3 |= 48;
        } else if ((i & 112) == 0) {
            i3 |= startRestartGroup.changed(modifier) ? 32 : 16;
            if ((i & 896) != 0) {
                if ((i2 & 4) == 0) {
                    modalBottomSheetState2 = modalBottomSheetState;
                    if (startRestartGroup.changed(modalBottomSheetState2)) {
                        i8 = 256;
                        i3 |= i8;
                    }
                } else {
                    modalBottomSheetState2 = modalBottomSheetState;
                }
                i8 = 128;
                i3 |= i8;
            } else {
                modalBottomSheetState2 = modalBottomSheetState;
            }
            if ((i & 7168) == 0) {
                i3 |= ((i2 & 8) == 0 && startRestartGroup.changed(shape)) ? 2048 : 1024;
            }
            i4 = i2 & 16;
            if (i4 == 0) {
                i3 |= 24576;
                f2 = f;
            } else {
                f2 = f;
                if ((57344 & i) == 0) {
                    i3 |= startRestartGroup.changed(f2) ? 16384 : 8192;
                }
            }
            if ((458752 & i) == 0) {
                i3 |= ((i2 & 32) == 0 && startRestartGroup.changed(j)) ? 131072 : 65536;
            }
            if ((3670016 & i) != 0) {
                j4 = j2;
                i3 |= ((i2 & 64) == 0 && startRestartGroup.changed(j4)) ? 1048576 : 524288;
            } else {
                j4 = j2;
            }
            if ((29360128 & i) != 0) {
                if ((i2 & 128) == 0) {
                    j5 = j3;
                    if (startRestartGroup.changed(j5)) {
                        i7 = 8388608;
                        i3 |= i7;
                    }
                } else {
                    j5 = j3;
                }
                i7 = 4194304;
                i3 |= i7;
            } else {
                j5 = j3;
            }
            if ((i2 & 256) != 0) {
                i6 = (234881024 & i) == 0 ? startRestartGroup.changed(content) ? androidx.core.view.accessibility.AccessibilityEventCompat.TYPE_VIEW_TARGETED_BY_SCROLL : 33554432 : 100663296;
                if ((191739611 & i3) == 38347922 || !startRestartGroup.getSkipping()) {
                    startRestartGroup.startDefaults();
                    if ((i & 1) != 0 || startRestartGroup.getDefaultsInvalid()) {
                        modifier2 = i9 != 0 ? androidx.compose.ui.Modifier.INSTANCE : modifier;
                        if ((i2 & 4) != 0) {
                            modalBottomSheetState3 = rememberModalBottomSheetState(androidx.compose.material.ModalBottomSheetValue.Hidden, null, null, startRestartGroup, 6, 6);
                            i3 &= -897;
                        } else {
                            modalBottomSheetState3 = modalBottomSheetState2;
                        }
                        if ((i2 & 8) != 0) {
                            cornerBasedShape = androidx.compose.material.MaterialTheme.INSTANCE.getShapes(startRestartGroup, 6).getLarge();
                            i3 &= -7169;
                        } else {
                            cornerBasedShape = shape;
                        }
                        float m1427getElevationD9Ej5fM = i4 != 0 ? androidx.compose.material.ModalBottomSheetDefaults.INSTANCE.m1427getElevationD9Ej5fM() : f2;
                        if ((i2 & 32) != 0) {
                            j6 = androidx.compose.material.MaterialTheme.INSTANCE.getColors(startRestartGroup, 6).m1319getSurface0d7_KjU();
                            i3 &= -458753;
                        } else {
                            j6 = j;
                        }
                        if ((i2 & 64) != 0) {
                            j7 = androidx.compose.material.ColorsKt.m1333contentColorForek8zF_U(j6, startRestartGroup, (i3 >> 15) & 14);
                            i3 &= -3670017;
                        } else {
                            j7 = j2;
                        }
                        if ((i2 & 128) != 0) {
                            i5 = i3 & (-29360129);
                            f3 = m1427getElevationD9Ej5fM;
                            j9 = j6;
                            j10 = j7;
                            j8 = androidx.compose.material.ModalBottomSheetDefaults.INSTANCE.getScrimColor(startRestartGroup, 6);
                            modalBottomSheetState4 = modalBottomSheetState3;
                            shape2 = cornerBasedShape;
                        } else {
                            j8 = j3;
                            i5 = i3;
                            modalBottomSheetState4 = modalBottomSheetState3;
                            shape2 = cornerBasedShape;
                            f3 = m1427getElevationD9Ej5fM;
                            j9 = j6;
                            j10 = j7;
                        }
                    } else {
                        startRestartGroup.skipToGroupEnd();
                        if ((i2 & 4) != 0) {
                            i3 &= -897;
                        }
                        if ((i2 & 8) != 0) {
                            i3 &= -7169;
                        }
                        if ((i2 & 32) != 0) {
                            i3 &= -458753;
                        }
                        if ((i2 & 64) != 0) {
                            i3 &= -3670017;
                        }
                        if ((i2 & 128) != 0) {
                            i3 &= -29360129;
                        }
                        modifier2 = modifier;
                        shape2 = shape;
                        j9 = j;
                        i5 = i3;
                        modalBottomSheetState4 = modalBottomSheetState2;
                        j8 = j5;
                        j10 = j4;
                        f3 = f2;
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
                    final androidx.compose.material.ModalBottomSheetState modalBottomSheetState5 = modalBottomSheetState4;
                    final int i10 = i5;
                    final androidx.compose.ui.graphics.Shape shape4 = shape2;
                    final long j14 = j9;
                    final long j15 = j10;
                    final float f5 = f3;
                    composer2 = startRestartGroup;
                    j11 = j8;
                    androidx.compose.foundation.layout.BoxWithConstraintsKt.BoxWithConstraints(modifier2, null, false, androidx.compose.runtime.internal.ComposableLambdaKt.composableLambda(composer2, 1607356310, true, new kotlin.jvm.functions.Function3<androidx.compose.foundation.layout.BoxWithConstraintsScope, androidx.compose.runtime.Composer, java.lang.Integer, kotlin.Unit>() { // from class: androidx.compose.material.ModalBottomSheetKt$ModalBottomSheetLayout$1
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        /* JADX WARN: Multi-variable type inference failed */
                        {
                            super(3);
                        }

                        @Override // kotlin.jvm.functions.Function3
                        public /* bridge */ /* synthetic */ kotlin.Unit invoke(androidx.compose.foundation.layout.BoxWithConstraintsScope boxWithConstraintsScope, androidx.compose.runtime.Composer composer3, java.lang.Integer num) {
                            invoke(boxWithConstraintsScope, composer3, num.intValue());
                            return kotlin.Unit.INSTANCE;
                        }

                        public final void invoke(androidx.compose.foundation.layout.BoxWithConstraintsScope BoxWithConstraints, androidx.compose.runtime.Composer composer3, int i11) {
                            int i12;
                            androidx.compose.ui.Modifier bottomSheetSwipeable;
                            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(BoxWithConstraints, "$this$BoxWithConstraints");
                            androidx.compose.runtime.ComposerKt.sourceInformation(composer3, "C327@13328L41,328@13378L384,344@13922L434,355@14475L89,340@13771L2155:ModalBottomSheet.kt#jmzs0o");
                            if ((i11 & 14) == 0) {
                                i12 = i11 | (composer3.changed(BoxWithConstraints) ? 4 : 2);
                            } else {
                                i12 = i11;
                            }
                            if ((i12 & 91) != 18 || !composer3.getSkipping()) {
                                final float m4423getMaxHeightimpl = androidx.compose.ui.unit.Constraints.m4423getMaxHeightimpl(BoxWithConstraints.mo504getConstraintsmsEJaDk());
                                composer3.startReplaceableGroup(-492369756);
                                androidx.compose.runtime.ComposerKt.sourceInformation(composer3, "C(remember):Composables.kt#9igjgp");
                                java.lang.Object rememberedValue2 = composer3.rememberedValue();
                                if (rememberedValue2 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                                    rememberedValue2 = androidx.compose.runtime.SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(null, null, 2, null);
                                    composer3.updateRememberedValue(rememberedValue2);
                                }
                                composer3.endReplaceableGroup();
                                final androidx.compose.runtime.MutableState mutableState = (androidx.compose.runtime.MutableState) rememberedValue2;
                                androidx.compose.ui.Modifier fillMaxSize$default = androidx.compose.foundation.layout.SizeKt.fillMaxSize$default(androidx.compose.ui.Modifier.INSTANCE, 0.0f, 1, null);
                                kotlin.jvm.functions.Function2<androidx.compose.runtime.Composer, java.lang.Integer, kotlin.Unit> function2 = content;
                                int i13 = i10;
                                long j16 = j11;
                                final androidx.compose.material.ModalBottomSheetState modalBottomSheetState6 = androidx.compose.material.ModalBottomSheetState.this;
                                final kotlinx.coroutines.CoroutineScope coroutineScope2 = coroutineScope;
                                composer3.startReplaceableGroup(733328855);
                                androidx.compose.runtime.ComposerKt.sourceInformation(composer3, "C(Box)P(2,1,3)70@3267L67,71@3339L130:Box.kt#2w3rfo");
                                androidx.compose.ui.layout.MeasurePolicy rememberBoxMeasurePolicy = androidx.compose.foundation.layout.BoxKt.rememberBoxMeasurePolicy(androidx.compose.ui.Alignment.INSTANCE.getTopStart(), false, composer3, 0);
                                composer3.startReplaceableGroup(-1323940314);
                                androidx.compose.runtime.ComposerKt.sourceInformation(composer3, "C(Layout)P(!1,2)74@2915L7,75@2970L7,76@3029L7,77@3041L460:Layout.kt#80mrfh");
                                androidx.compose.runtime.ProvidableCompositionLocal<androidx.compose.ui.unit.Density> localDensity = androidx.compose.ui.platform.CompositionLocalsKt.getLocalDensity();
                                androidx.compose.runtime.ComposerKt.sourceInformationMarkerStart(composer3, 2023513938, "C:CompositionLocal.kt#9igjgp");
                                java.lang.Object consume = composer3.consume(localDensity);
                                androidx.compose.runtime.ComposerKt.sourceInformationMarkerEnd(composer3);
                                androidx.compose.ui.unit.Density density = (androidx.compose.ui.unit.Density) consume;
                                androidx.compose.runtime.ProvidableCompositionLocal<androidx.compose.ui.unit.LayoutDirection> localLayoutDirection = androidx.compose.ui.platform.CompositionLocalsKt.getLocalLayoutDirection();
                                androidx.compose.runtime.ComposerKt.sourceInformationMarkerStart(composer3, 2023513938, "C:CompositionLocal.kt#9igjgp");
                                java.lang.Object consume2 = composer3.consume(localLayoutDirection);
                                androidx.compose.runtime.ComposerKt.sourceInformationMarkerEnd(composer3);
                                androidx.compose.ui.unit.LayoutDirection layoutDirection = (androidx.compose.ui.unit.LayoutDirection) consume2;
                                androidx.compose.runtime.ProvidableCompositionLocal<androidx.compose.ui.platform.ViewConfiguration> localViewConfiguration = androidx.compose.ui.platform.CompositionLocalsKt.getLocalViewConfiguration();
                                androidx.compose.runtime.ComposerKt.sourceInformationMarkerStart(composer3, 2023513938, "C:CompositionLocal.kt#9igjgp");
                                java.lang.Object consume3 = composer3.consume(localViewConfiguration);
                                androidx.compose.runtime.ComposerKt.sourceInformationMarkerEnd(composer3);
                                androidx.compose.ui.platform.ViewConfiguration viewConfiguration = (androidx.compose.ui.platform.ViewConfiguration) consume3;
                                kotlin.jvm.functions.Function0<androidx.compose.ui.node.ComposeUiNode> constructor = androidx.compose.ui.node.ComposeUiNode.INSTANCE.getConstructor();
                                kotlin.jvm.functions.Function3<androidx.compose.runtime.SkippableUpdater<androidx.compose.ui.node.ComposeUiNode>, androidx.compose.runtime.Composer, java.lang.Integer, kotlin.Unit> materializerOf = androidx.compose.ui.layout.LayoutKt.materializerOf(fillMaxSize$default);
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
                                androidx.compose.runtime.Updater.m1648setimpl(m1641constructorimpl, rememberBoxMeasurePolicy, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetMeasurePolicy());
                                androidx.compose.runtime.Updater.m1648setimpl(m1641constructorimpl, density, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetDensity());
                                androidx.compose.runtime.Updater.m1648setimpl(m1641constructorimpl, layoutDirection, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetLayoutDirection());
                                androidx.compose.runtime.Updater.m1648setimpl(m1641constructorimpl, viewConfiguration, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetViewConfiguration());
                                composer3.enableReusing();
                                materializerOf.invoke(androidx.compose.runtime.SkippableUpdater.m1632boximpl(androidx.compose.runtime.SkippableUpdater.m1633constructorimpl(composer3)), composer3, 0);
                                composer3.startReplaceableGroup(2058660585);
                                composer3.startReplaceableGroup(-2137368960);
                                androidx.compose.runtime.ComposerKt.sourceInformation(composer3, "C72@3384L9:Box.kt#2w3rfo");
                                androidx.compose.foundation.layout.BoxScopeInstance boxScopeInstance = androidx.compose.foundation.layout.BoxScopeInstance.INSTANCE;
                                composer3.startReplaceableGroup(-402723888);
                                androidx.compose.runtime.ComposerKt.sourceInformation(composer3, "C329@13420L9,330@13442L310:ModalBottomSheet.kt#jmzs0o");
                                function2.invoke(composer3, java.lang.Integer.valueOf((i13 >> 24) & 14));
                                androidx.compose.material.ModalBottomSheetKt.m1429Scrim3JVO9M(j16, new kotlin.jvm.functions.Function0<kotlin.Unit>() { // from class: androidx.compose.material.ModalBottomSheetKt$ModalBottomSheetLayout$1$1$1
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
                                        if (androidx.compose.material.ModalBottomSheetState.this.getConfirmStateChange$material_release().invoke(androidx.compose.material.ModalBottomSheetValue.Hidden).booleanValue()) {
                                            kotlinx.coroutines.BuildersKt__Builders_commonKt.launch$default(coroutineScope2, null, null, new androidx.compose.material.ModalBottomSheetKt$ModalBottomSheetLayout$1$1$1.AnonymousClass1(androidx.compose.material.ModalBottomSheetState.this, null), 3, null);
                                        }
                                    }

                                    /* compiled from: ModalBottomSheet.kt */
                                    @kotlin.Metadata(k = 3, mv = {1, 6, 0}, xi = 48)
                                    @kotlin.coroutines.jvm.internal.DebugMetadata(c = "androidx.compose.material.ModalBottomSheetKt$ModalBottomSheetLayout$1$1$1$1", f = "ModalBottomSheet.kt", i = {}, l = {335}, m = "invokeSuspend", n = {}, s = {})
                                    /* renamed from: androidx.compose.material.ModalBottomSheetKt$ModalBottomSheetLayout$1$1$1$1, reason: invalid class name */
                                    static final class AnonymousClass1 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<kotlinx.coroutines.CoroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> {
                                        final /* synthetic */ androidx.compose.material.ModalBottomSheetState $sheetState;
                                        int label;

                                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                        AnonymousClass1(androidx.compose.material.ModalBottomSheetState modalBottomSheetState, kotlin.coroutines.Continuation<? super androidx.compose.material.ModalBottomSheetKt$ModalBottomSheetLayout$1$1$1.AnonymousClass1> continuation) {
                                            super(2, continuation);
                                            this.$sheetState = modalBottomSheetState;
                                        }

                                        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                                        public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object obj, kotlin.coroutines.Continuation<?> continuation) {
                                            return new androidx.compose.material.ModalBottomSheetKt$ModalBottomSheetLayout$1$1$1.AnonymousClass1(this.$sheetState, continuation);
                                        }

                                        @Override // kotlin.jvm.functions.Function2
                                        public final java.lang.Object invoke(kotlinx.coroutines.CoroutineScope coroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
                                            return ((androidx.compose.material.ModalBottomSheetKt$ModalBottomSheetLayout$1$1$1.AnonymousClass1) create(coroutineScope, continuation)).invokeSuspend(kotlin.Unit.INSTANCE);
                                        }

                                        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                                        public final java.lang.Object invokeSuspend(java.lang.Object obj) {
                                            java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
                                            int i = this.label;
                                            if (i == 0) {
                                                kotlin.ResultKt.throwOnFailure(obj);
                                                this.label = 1;
                                                if (this.$sheetState.hide(this) == coroutine_suspended) {
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
                                }, modalBottomSheetState6.getTargetValue() != androidx.compose.material.ModalBottomSheetValue.Hidden, composer3, (i13 >> 21) & 14);
                                composer3.endReplaceableGroup();
                                composer3.endReplaceableGroup();
                                composer3.endReplaceableGroup();
                                composer3.endNode();
                                composer3.endReplaceableGroup();
                                composer3.endReplaceableGroup();
                                androidx.compose.ui.Modifier nestedScroll$default = androidx.compose.ui.input.nestedscroll.NestedScrollModifierKt.nestedScroll$default(androidx.compose.foundation.layout.SizeKt.fillMaxWidth$default(androidx.compose.ui.Modifier.INSTANCE, 0.0f, 1, null), androidx.compose.material.ModalBottomSheetState.this.getNestedScrollConnection(), null, 2, null);
                                java.lang.Object obj = androidx.compose.material.ModalBottomSheetState.this;
                                java.lang.Object valueOf = java.lang.Float.valueOf(m4423getMaxHeightimpl);
                                final androidx.compose.material.ModalBottomSheetState modalBottomSheetState7 = androidx.compose.material.ModalBottomSheetState.this;
                                composer3.startReplaceableGroup(511388516);
                                androidx.compose.runtime.ComposerKt.sourceInformation(composer3, "C(remember)P(1,2):Composables.kt#9igjgp");
                                boolean changed = composer3.changed(obj) | composer3.changed(valueOf);
                                java.lang.Object rememberedValue3 = composer3.rememberedValue();
                                if (changed || rememberedValue3 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                                    rememberedValue3 = (kotlin.jvm.functions.Function1) new kotlin.jvm.functions.Function1<androidx.compose.ui.unit.Density, androidx.compose.ui.unit.IntOffset>() { // from class: androidx.compose.material.ModalBottomSheetKt$ModalBottomSheetLayout$1$2$1
                                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                        {
                                            super(1);
                                        }

                                        @Override // kotlin.jvm.functions.Function1
                                        public /* bridge */ /* synthetic */ androidx.compose.ui.unit.IntOffset invoke(androidx.compose.ui.unit.Density density2) {
                                            return androidx.compose.ui.unit.IntOffset.m4601boximpl(m1433invokeBjo55l4(density2));
                                        }

                                        /* renamed from: invoke-Bjo55l4, reason: not valid java name */
                                        public final long m1433invokeBjo55l4(androidx.compose.ui.unit.Density offset) {
                                            int roundToInt;
                                            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(offset, "$this$offset");
                                            if (androidx.compose.material.ModalBottomSheetState.this.getAnchors$material_release().isEmpty()) {
                                                roundToInt = kotlin.math.MathKt.roundToInt(m4423getMaxHeightimpl);
                                            } else {
                                                roundToInt = kotlin.math.MathKt.roundToInt(androidx.compose.material.ModalBottomSheetState.this.getOffset().getValue().floatValue());
                                            }
                                            return androidx.compose.ui.unit.IntOffsetKt.IntOffset(0, roundToInt);
                                        }
                                    };
                                    composer3.updateRememberedValue(rememberedValue3);
                                }
                                composer3.endReplaceableGroup();
                                bottomSheetSwipeable = androidx.compose.material.ModalBottomSheetKt.bottomSheetSwipeable(androidx.compose.foundation.layout.OffsetKt.offset(nestedScroll$default, (kotlin.jvm.functions.Function1) rememberedValue3), androidx.compose.material.ModalBottomSheetState.this, m4423getMaxHeightimpl, mutableState);
                                composer3.startReplaceableGroup(1157296644);
                                androidx.compose.runtime.ComposerKt.sourceInformation(composer3, "C(remember)P(1):Composables.kt#9igjgp");
                                boolean changed2 = composer3.changed(mutableState);
                                java.lang.Object rememberedValue4 = composer3.rememberedValue();
                                if (changed2 || rememberedValue4 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                                    rememberedValue4 = (kotlin.jvm.functions.Function1) new kotlin.jvm.functions.Function1<androidx.compose.ui.layout.LayoutCoordinates, kotlin.Unit>() { // from class: androidx.compose.material.ModalBottomSheetKt$ModalBottomSheetLayout$1$3$1
                                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                        {
                                            super(1);
                                        }

                                        @Override // kotlin.jvm.functions.Function1
                                        public /* bridge */ /* synthetic */ kotlin.Unit invoke(androidx.compose.ui.layout.LayoutCoordinates layoutCoordinates) {
                                            invoke2(layoutCoordinates);
                                            return kotlin.Unit.INSTANCE;
                                        }

                                        /* renamed from: invoke, reason: avoid collision after fix types in other method */
                                        public final void invoke2(androidx.compose.ui.layout.LayoutCoordinates it) {
                                            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(it, "it");
                                            mutableState.setValue(java.lang.Float.valueOf(androidx.compose.ui.unit.IntSize.m4651getHeightimpl(it.mo3409getSizeYbymL2g())));
                                        }
                                    };
                                    composer3.updateRememberedValue(rememberedValue4);
                                }
                                composer3.endReplaceableGroup();
                                androidx.compose.ui.Modifier onGloballyPositioned = androidx.compose.ui.layout.OnGloballyPositionedModifierKt.onGloballyPositioned(bottomSheetSwipeable, (kotlin.jvm.functions.Function1) rememberedValue4);
                                final androidx.compose.material.ModalBottomSheetState modalBottomSheetState8 = androidx.compose.material.ModalBottomSheetState.this;
                                final kotlinx.coroutines.CoroutineScope coroutineScope3 = coroutineScope;
                                androidx.compose.ui.Modifier semantics$default = androidx.compose.ui.semantics.SemanticsModifierKt.semantics$default(onGloballyPositioned, false, new kotlin.jvm.functions.Function1<androidx.compose.ui.semantics.SemanticsPropertyReceiver, kotlin.Unit>() { // from class: androidx.compose.material.ModalBottomSheetKt$ModalBottomSheetLayout$1.4
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
                                        if (androidx.compose.material.ModalBottomSheetState.this.isVisible()) {
                                            final androidx.compose.material.ModalBottomSheetState modalBottomSheetState9 = androidx.compose.material.ModalBottomSheetState.this;
                                            final kotlinx.coroutines.CoroutineScope coroutineScope4 = coroutineScope3;
                                            androidx.compose.ui.semantics.SemanticsPropertiesKt.dismiss$default(semantics, null, new kotlin.jvm.functions.Function0<java.lang.Boolean>() { // from class: androidx.compose.material.ModalBottomSheetKt.ModalBottomSheetLayout.1.4.1
                                                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                                {
                                                    super(0);
                                                }

                                                /* JADX WARN: Can't rename method to resolve collision */
                                                @Override // kotlin.jvm.functions.Function0
                                                public final java.lang.Boolean invoke() {
                                                    if (androidx.compose.material.ModalBottomSheetState.this.getConfirmStateChange$material_release().invoke(androidx.compose.material.ModalBottomSheetValue.Hidden).booleanValue()) {
                                                        kotlinx.coroutines.BuildersKt__Builders_commonKt.launch$default(coroutineScope4, null, null, new androidx.compose.material.ModalBottomSheetKt$ModalBottomSheetLayout$1.AnonymousClass4.AnonymousClass1.C00471(androidx.compose.material.ModalBottomSheetState.this, null), 3, null);
                                                    }
                                                    return true;
                                                }

                                                /* compiled from: ModalBottomSheet.kt */
                                                @kotlin.Metadata(k = 3, mv = {1, 6, 0}, xi = 48)
                                                @kotlin.coroutines.jvm.internal.DebugMetadata(c = "androidx.compose.material.ModalBottomSheetKt$ModalBottomSheetLayout$1$4$1$1", f = "ModalBottomSheet.kt", i = {}, l = {363}, m = "invokeSuspend", n = {}, s = {})
                                                /* renamed from: androidx.compose.material.ModalBottomSheetKt$ModalBottomSheetLayout$1$4$1$1, reason: invalid class name and collision with other inner class name */
                                                static final class C00471 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<kotlinx.coroutines.CoroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> {
                                                    final /* synthetic */ androidx.compose.material.ModalBottomSheetState $sheetState;
                                                    int label;

                                                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                                    C00471(androidx.compose.material.ModalBottomSheetState modalBottomSheetState, kotlin.coroutines.Continuation<? super androidx.compose.material.ModalBottomSheetKt$ModalBottomSheetLayout$1.AnonymousClass4.AnonymousClass1.C00471> continuation) {
                                                        super(2, continuation);
                                                        this.$sheetState = modalBottomSheetState;
                                                    }

                                                    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                                                    public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object obj, kotlin.coroutines.Continuation<?> continuation) {
                                                        return new androidx.compose.material.ModalBottomSheetKt$ModalBottomSheetLayout$1.AnonymousClass4.AnonymousClass1.C00471(this.$sheetState, continuation);
                                                    }

                                                    @Override // kotlin.jvm.functions.Function2
                                                    public final java.lang.Object invoke(kotlinx.coroutines.CoroutineScope coroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
                                                        return ((androidx.compose.material.ModalBottomSheetKt$ModalBottomSheetLayout$1.AnonymousClass4.AnonymousClass1.C00471) create(coroutineScope, continuation)).invokeSuspend(kotlin.Unit.INSTANCE);
                                                    }

                                                    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                                                    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
                                                        java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
                                                        int i = this.label;
                                                        if (i == 0) {
                                                            kotlin.ResultKt.throwOnFailure(obj);
                                                            this.label = 1;
                                                            if (this.$sheetState.hide(this) == coroutine_suspended) {
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
                                            if (androidx.compose.material.ModalBottomSheetState.this.getCurrentValue() == androidx.compose.material.ModalBottomSheetValue.HalfExpanded) {
                                                final androidx.compose.material.ModalBottomSheetState modalBottomSheetState10 = androidx.compose.material.ModalBottomSheetState.this;
                                                final kotlinx.coroutines.CoroutineScope coroutineScope5 = coroutineScope3;
                                                androidx.compose.ui.semantics.SemanticsPropertiesKt.expand$default(semantics, null, new kotlin.jvm.functions.Function0<java.lang.Boolean>() { // from class: androidx.compose.material.ModalBottomSheetKt.ModalBottomSheetLayout.1.4.2
                                                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                                    {
                                                        super(0);
                                                    }

                                                    /* JADX WARN: Can't rename method to resolve collision */
                                                    @Override // kotlin.jvm.functions.Function0
                                                    public final java.lang.Boolean invoke() {
                                                        if (androidx.compose.material.ModalBottomSheetState.this.getConfirmStateChange$material_release().invoke(androidx.compose.material.ModalBottomSheetValue.Expanded).booleanValue()) {
                                                            kotlinx.coroutines.BuildersKt__Builders_commonKt.launch$default(coroutineScope5, null, null, new androidx.compose.material.ModalBottomSheetKt$ModalBottomSheetLayout$1.AnonymousClass4.AnonymousClass2.AnonymousClass1(androidx.compose.material.ModalBottomSheetState.this, null), 3, null);
                                                        }
                                                        return true;
                                                    }

                                                    /* compiled from: ModalBottomSheet.kt */
                                                    @kotlin.Metadata(k = 3, mv = {1, 6, 0}, xi = 48)
                                                    @kotlin.coroutines.jvm.internal.DebugMetadata(c = "androidx.compose.material.ModalBottomSheetKt$ModalBottomSheetLayout$1$4$2$1", f = "ModalBottomSheet.kt", i = {}, l = {370}, m = "invokeSuspend", n = {}, s = {})
                                                    /* renamed from: androidx.compose.material.ModalBottomSheetKt$ModalBottomSheetLayout$1$4$2$1, reason: invalid class name */
                                                    static final class AnonymousClass1 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<kotlinx.coroutines.CoroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> {
                                                        final /* synthetic */ androidx.compose.material.ModalBottomSheetState $sheetState;
                                                        int label;

                                                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                                        AnonymousClass1(androidx.compose.material.ModalBottomSheetState modalBottomSheetState, kotlin.coroutines.Continuation<? super androidx.compose.material.ModalBottomSheetKt$ModalBottomSheetLayout$1.AnonymousClass4.AnonymousClass2.AnonymousClass1> continuation) {
                                                            super(2, continuation);
                                                            this.$sheetState = modalBottomSheetState;
                                                        }

                                                        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                                                        public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object obj, kotlin.coroutines.Continuation<?> continuation) {
                                                            return new androidx.compose.material.ModalBottomSheetKt$ModalBottomSheetLayout$1.AnonymousClass4.AnonymousClass2.AnonymousClass1(this.$sheetState, continuation);
                                                        }

                                                        @Override // kotlin.jvm.functions.Function2
                                                        public final java.lang.Object invoke(kotlinx.coroutines.CoroutineScope coroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
                                                            return ((androidx.compose.material.ModalBottomSheetKt$ModalBottomSheetLayout$1.AnonymousClass4.AnonymousClass2.AnonymousClass1) create(coroutineScope, continuation)).invokeSuspend(kotlin.Unit.INSTANCE);
                                                        }

                                                        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                                                        public final java.lang.Object invokeSuspend(java.lang.Object obj) {
                                                            java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
                                                            int i = this.label;
                                                            if (i == 0) {
                                                                kotlin.ResultKt.throwOnFailure(obj);
                                                                this.label = 1;
                                                                if (this.$sheetState.expand$material_release(this) == coroutine_suspended) {
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
                                            } else if (androidx.compose.material.ModalBottomSheetState.this.getHasHalfExpandedState$material_release()) {
                                                final androidx.compose.material.ModalBottomSheetState modalBottomSheetState11 = androidx.compose.material.ModalBottomSheetState.this;
                                                final kotlinx.coroutines.CoroutineScope coroutineScope6 = coroutineScope3;
                                                androidx.compose.ui.semantics.SemanticsPropertiesKt.collapse$default(semantics, null, new kotlin.jvm.functions.Function0<java.lang.Boolean>() { // from class: androidx.compose.material.ModalBottomSheetKt.ModalBottomSheetLayout.1.4.3
                                                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                                    {
                                                        super(0);
                                                    }

                                                    /* JADX WARN: Can't rename method to resolve collision */
                                                    @Override // kotlin.jvm.functions.Function0
                                                    public final java.lang.Boolean invoke() {
                                                        if (androidx.compose.material.ModalBottomSheetState.this.getConfirmStateChange$material_release().invoke(androidx.compose.material.ModalBottomSheetValue.HalfExpanded).booleanValue()) {
                                                            kotlinx.coroutines.BuildersKt__Builders_commonKt.launch$default(coroutineScope6, null, null, new androidx.compose.material.ModalBottomSheetKt$ModalBottomSheetLayout$1.AnonymousClass4.AnonymousClass3.AnonymousClass1(androidx.compose.material.ModalBottomSheetState.this, null), 3, null);
                                                        }
                                                        return true;
                                                    }

                                                    /* compiled from: ModalBottomSheet.kt */
                                                    @kotlin.Metadata(k = 3, mv = {1, 6, 0}, xi = 48)
                                                    @kotlin.coroutines.jvm.internal.DebugMetadata(c = "androidx.compose.material.ModalBottomSheetKt$ModalBottomSheetLayout$1$4$3$1", f = "ModalBottomSheet.kt", i = {}, l = {377}, m = "invokeSuspend", n = {}, s = {})
                                                    /* renamed from: androidx.compose.material.ModalBottomSheetKt$ModalBottomSheetLayout$1$4$3$1, reason: invalid class name */
                                                    static final class AnonymousClass1 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<kotlinx.coroutines.CoroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> {
                                                        final /* synthetic */ androidx.compose.material.ModalBottomSheetState $sheetState;
                                                        int label;

                                                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                                        AnonymousClass1(androidx.compose.material.ModalBottomSheetState modalBottomSheetState, kotlin.coroutines.Continuation<? super androidx.compose.material.ModalBottomSheetKt$ModalBottomSheetLayout$1.AnonymousClass4.AnonymousClass3.AnonymousClass1> continuation) {
                                                            super(2, continuation);
                                                            this.$sheetState = modalBottomSheetState;
                                                        }

                                                        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                                                        public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object obj, kotlin.coroutines.Continuation<?> continuation) {
                                                            return new androidx.compose.material.ModalBottomSheetKt$ModalBottomSheetLayout$1.AnonymousClass4.AnonymousClass3.AnonymousClass1(this.$sheetState, continuation);
                                                        }

                                                        @Override // kotlin.jvm.functions.Function2
                                                        public final java.lang.Object invoke(kotlinx.coroutines.CoroutineScope coroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
                                                            return ((androidx.compose.material.ModalBottomSheetKt$ModalBottomSheetLayout$1.AnonymousClass4.AnonymousClass3.AnonymousClass1) create(coroutineScope, continuation)).invokeSuspend(kotlin.Unit.INSTANCE);
                                                        }

                                                        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                                                        public final java.lang.Object invokeSuspend(java.lang.Object obj) {
                                                            java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
                                                            int i = this.label;
                                                            if (i == 0) {
                                                                kotlin.ResultKt.throwOnFailure(obj);
                                                                this.label = 1;
                                                                if (this.$sheetState.halfExpand$material_release(this) == coroutine_suspended) {
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
                                    }
                                }, 1, null);
                                androidx.compose.ui.graphics.Shape shape5 = shape4;
                                long j17 = j14;
                                long j18 = j15;
                                float f6 = f5;
                                final kotlin.jvm.functions.Function3<androidx.compose.foundation.layout.ColumnScope, androidx.compose.runtime.Composer, java.lang.Integer, kotlin.Unit> function3 = sheetContent;
                                final int i14 = i10;
                                androidx.compose.runtime.internal.ComposableLambda composableLambda = androidx.compose.runtime.internal.ComposableLambdaKt.composableLambda(composer3, -1793508390, true, new kotlin.jvm.functions.Function2<androidx.compose.runtime.Composer, java.lang.Integer, kotlin.Unit>() { // from class: androidx.compose.material.ModalBottomSheetKt$ModalBottomSheetLayout$1.5
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

                                    public final void invoke(androidx.compose.runtime.Composer composer4, int i15) {
                                        androidx.compose.runtime.ComposerKt.sourceInformation(composer4, "C388@15886L30:ModalBottomSheet.kt#jmzs0o");
                                        if ((i15 & 11) == 2 && composer4.getSkipping()) {
                                            composer4.skipToGroupEnd();
                                            return;
                                        }
                                        kotlin.jvm.functions.Function3<androidx.compose.foundation.layout.ColumnScope, androidx.compose.runtime.Composer, java.lang.Integer, kotlin.Unit> function32 = function3;
                                        int i16 = (i14 << 9) & 7168;
                                        composer4.startReplaceableGroup(-483455358);
                                        androidx.compose.runtime.ComposerKt.sourceInformation(composer4, "C(Column)P(2,3,1)77@3880L61,78@3946L133:Column.kt#2w3rfo");
                                        androidx.compose.ui.Modifier.Companion companion = androidx.compose.ui.Modifier.INSTANCE;
                                        androidx.compose.ui.layout.MeasurePolicy columnMeasurePolicy = androidx.compose.foundation.layout.ColumnKt.columnMeasurePolicy(androidx.compose.foundation.layout.Arrangement.INSTANCE.getTop(), androidx.compose.ui.Alignment.INSTANCE.getStart(), composer4, 0);
                                        composer4.startReplaceableGroup(-1323940314);
                                        androidx.compose.runtime.ComposerKt.sourceInformation(composer4, "C(Layout)P(!1,2)74@2915L7,75@2970L7,76@3029L7,77@3041L460:Layout.kt#80mrfh");
                                        androidx.compose.runtime.ProvidableCompositionLocal<androidx.compose.ui.unit.Density> localDensity2 = androidx.compose.ui.platform.CompositionLocalsKt.getLocalDensity();
                                        androidx.compose.runtime.ComposerKt.sourceInformationMarkerStart(composer4, 2023513938, "C:CompositionLocal.kt#9igjgp");
                                        java.lang.Object consume4 = composer4.consume(localDensity2);
                                        androidx.compose.runtime.ComposerKt.sourceInformationMarkerEnd(composer4);
                                        androidx.compose.ui.unit.Density density2 = (androidx.compose.ui.unit.Density) consume4;
                                        androidx.compose.runtime.ProvidableCompositionLocal<androidx.compose.ui.unit.LayoutDirection> localLayoutDirection2 = androidx.compose.ui.platform.CompositionLocalsKt.getLocalLayoutDirection();
                                        androidx.compose.runtime.ComposerKt.sourceInformationMarkerStart(composer4, 2023513938, "C:CompositionLocal.kt#9igjgp");
                                        java.lang.Object consume5 = composer4.consume(localLayoutDirection2);
                                        androidx.compose.runtime.ComposerKt.sourceInformationMarkerEnd(composer4);
                                        androidx.compose.ui.unit.LayoutDirection layoutDirection2 = (androidx.compose.ui.unit.LayoutDirection) consume5;
                                        androidx.compose.runtime.ProvidableCompositionLocal<androidx.compose.ui.platform.ViewConfiguration> localViewConfiguration2 = androidx.compose.ui.platform.CompositionLocalsKt.getLocalViewConfiguration();
                                        androidx.compose.runtime.ComposerKt.sourceInformationMarkerStart(composer4, 2023513938, "C:CompositionLocal.kt#9igjgp");
                                        java.lang.Object consume6 = composer4.consume(localViewConfiguration2);
                                        androidx.compose.runtime.ComposerKt.sourceInformationMarkerEnd(composer4);
                                        androidx.compose.ui.platform.ViewConfiguration viewConfiguration2 = (androidx.compose.ui.platform.ViewConfiguration) consume6;
                                        kotlin.jvm.functions.Function0<androidx.compose.ui.node.ComposeUiNode> constructor2 = androidx.compose.ui.node.ComposeUiNode.INSTANCE.getConstructor();
                                        kotlin.jvm.functions.Function3<androidx.compose.runtime.SkippableUpdater<androidx.compose.ui.node.ComposeUiNode>, androidx.compose.runtime.Composer, java.lang.Integer, kotlin.Unit> materializerOf2 = androidx.compose.ui.layout.LayoutKt.materializerOf(companion);
                                        if (!(composer4.getApplier() instanceof androidx.compose.runtime.Applier)) {
                                            androidx.compose.runtime.ComposablesKt.invalidApplier();
                                        }
                                        composer4.startReusableNode();
                                        if (composer4.getInserting()) {
                                            composer4.createNode(constructor2);
                                        } else {
                                            composer4.useNode();
                                        }
                                        composer4.disableReusing();
                                        androidx.compose.runtime.Composer m1641constructorimpl2 = androidx.compose.runtime.Updater.m1641constructorimpl(composer4);
                                        androidx.compose.runtime.Updater.m1648setimpl(m1641constructorimpl2, columnMeasurePolicy, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetMeasurePolicy());
                                        androidx.compose.runtime.Updater.m1648setimpl(m1641constructorimpl2, density2, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetDensity());
                                        androidx.compose.runtime.Updater.m1648setimpl(m1641constructorimpl2, layoutDirection2, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetLayoutDirection());
                                        androidx.compose.runtime.Updater.m1648setimpl(m1641constructorimpl2, viewConfiguration2, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetViewConfiguration());
                                        composer4.enableReusing();
                                        materializerOf2.invoke(androidx.compose.runtime.SkippableUpdater.m1632boximpl(androidx.compose.runtime.SkippableUpdater.m1633constructorimpl(composer4)), composer4, 0);
                                        composer4.startReplaceableGroup(2058660585);
                                        composer4.startReplaceableGroup(-1163856341);
                                        androidx.compose.runtime.ComposerKt.sourceInformation(composer4, "C79@3994L9:Column.kt#2w3rfo");
                                        function32.invoke(androidx.compose.foundation.layout.ColumnScopeInstance.INSTANCE, composer4, java.lang.Integer.valueOf(((i16 >> 6) & 112) | 6));
                                        composer4.endReplaceableGroup();
                                        composer4.endReplaceableGroup();
                                        composer4.endNode();
                                        composer4.endReplaceableGroup();
                                        composer4.endReplaceableGroup();
                                    }
                                });
                                int i15 = i10;
                                androidx.compose.material.SurfaceKt.m1511SurfaceFjzlyU(semantics$default, shape5, j17, j18, null, f6, composableLambda, composer3, ((i15 >> 6) & 112) | 1572864 | ((i15 >> 9) & 896) | ((i15 >> 9) & 7168) | ((i15 << 3) & 458752), 16);
                                return;
                            }
                            composer3.skipToGroupEnd();
                        }
                    }), composer2, ((i5 >> 3) & 14) | 3072, 6);
                    modalBottomSheetState2 = modalBottomSheetState4;
                    shape3 = shape2;
                    modifier3 = modifier2;
                    f4 = f3;
                    j12 = j9;
                    j13 = j10;
                } else {
                    startRestartGroup.skipToGroupEnd();
                    modifier3 = modifier;
                    composer2 = startRestartGroup;
                    j11 = j5;
                    f4 = f2;
                    shape3 = shape;
                    j13 = j4;
                    j12 = j;
                }
                endRestartGroup = composer2.endRestartGroup();
                if (endRestartGroup == null) {
                    return;
                }
                endRestartGroup.updateScope(new kotlin.jvm.functions.Function2<androidx.compose.runtime.Composer, java.lang.Integer, kotlin.Unit>() { // from class: androidx.compose.material.ModalBottomSheetKt$ModalBottomSheetLayout$2
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
                        androidx.compose.material.ModalBottomSheetKt.m1428ModalBottomSheetLayoutBzaUkTc(sheetContent, modifier3, modalBottomSheetState2, shape3, f4, j12, j13, j11, content, composer3, i | 1, i2);
                    }
                });
                return;
            }
            i3 |= i6;
            if ((191739611 & i3) == 38347922) {
            }
            startRestartGroup.startDefaults();
            if ((i & 1) != 0) {
            }
            if (i9 != 0) {
            }
            if ((i2 & 4) != 0) {
            }
            if ((i2 & 8) != 0) {
            }
            if (i4 != 0) {
            }
            if ((i2 & 32) != 0) {
            }
            if ((i2 & 64) != 0) {
            }
            if ((i2 & 128) != 0) {
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
            final androidx.compose.material.ModalBottomSheetState modalBottomSheetState52 = modalBottomSheetState4;
            final int i102 = i5;
            final androidx.compose.ui.graphics.Shape shape42 = shape2;
            final long j142 = j9;
            final long j152 = j10;
            final float f52 = f3;
            composer2 = startRestartGroup;
            j11 = j8;
            androidx.compose.foundation.layout.BoxWithConstraintsKt.BoxWithConstraints(modifier2, null, false, androidx.compose.runtime.internal.ComposableLambdaKt.composableLambda(composer2, 1607356310, true, new kotlin.jvm.functions.Function3<androidx.compose.foundation.layout.BoxWithConstraintsScope, androidx.compose.runtime.Composer, java.lang.Integer, kotlin.Unit>() { // from class: androidx.compose.material.ModalBottomSheetKt$ModalBottomSheetLayout$1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                /* JADX WARN: Multi-variable type inference failed */
                {
                    super(3);
                }

                @Override // kotlin.jvm.functions.Function3
                public /* bridge */ /* synthetic */ kotlin.Unit invoke(androidx.compose.foundation.layout.BoxWithConstraintsScope boxWithConstraintsScope, androidx.compose.runtime.Composer composer3, java.lang.Integer num) {
                    invoke(boxWithConstraintsScope, composer3, num.intValue());
                    return kotlin.Unit.INSTANCE;
                }

                public final void invoke(androidx.compose.foundation.layout.BoxWithConstraintsScope BoxWithConstraints, androidx.compose.runtime.Composer composer3, int i11) {
                    int i12;
                    androidx.compose.ui.Modifier bottomSheetSwipeable;
                    kotlin.jvm.internal.Intrinsics.checkNotNullParameter(BoxWithConstraints, "$this$BoxWithConstraints");
                    androidx.compose.runtime.ComposerKt.sourceInformation(composer3, "C327@13328L41,328@13378L384,344@13922L434,355@14475L89,340@13771L2155:ModalBottomSheet.kt#jmzs0o");
                    if ((i11 & 14) == 0) {
                        i12 = i11 | (composer3.changed(BoxWithConstraints) ? 4 : 2);
                    } else {
                        i12 = i11;
                    }
                    if ((i12 & 91) != 18 || !composer3.getSkipping()) {
                        final float m4423getMaxHeightimpl = androidx.compose.ui.unit.Constraints.m4423getMaxHeightimpl(BoxWithConstraints.mo504getConstraintsmsEJaDk());
                        composer3.startReplaceableGroup(-492369756);
                        androidx.compose.runtime.ComposerKt.sourceInformation(composer3, "C(remember):Composables.kt#9igjgp");
                        java.lang.Object rememberedValue2 = composer3.rememberedValue();
                        if (rememberedValue2 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                            rememberedValue2 = androidx.compose.runtime.SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(null, null, 2, null);
                            composer3.updateRememberedValue(rememberedValue2);
                        }
                        composer3.endReplaceableGroup();
                        final androidx.compose.runtime.MutableState<java.lang.Float> mutableState = (androidx.compose.runtime.MutableState) rememberedValue2;
                        androidx.compose.ui.Modifier fillMaxSize$default = androidx.compose.foundation.layout.SizeKt.fillMaxSize$default(androidx.compose.ui.Modifier.INSTANCE, 0.0f, 1, null);
                        kotlin.jvm.functions.Function2<androidx.compose.runtime.Composer, java.lang.Integer, kotlin.Unit> function2 = content;
                        int i13 = i102;
                        long j16 = j11;
                        final androidx.compose.material.ModalBottomSheetState modalBottomSheetState6 = androidx.compose.material.ModalBottomSheetState.this;
                        final kotlinx.coroutines.CoroutineScope coroutineScope22 = coroutineScope2;
                        composer3.startReplaceableGroup(733328855);
                        androidx.compose.runtime.ComposerKt.sourceInformation(composer3, "C(Box)P(2,1,3)70@3267L67,71@3339L130:Box.kt#2w3rfo");
                        androidx.compose.ui.layout.MeasurePolicy rememberBoxMeasurePolicy = androidx.compose.foundation.layout.BoxKt.rememberBoxMeasurePolicy(androidx.compose.ui.Alignment.INSTANCE.getTopStart(), false, composer3, 0);
                        composer3.startReplaceableGroup(-1323940314);
                        androidx.compose.runtime.ComposerKt.sourceInformation(composer3, "C(Layout)P(!1,2)74@2915L7,75@2970L7,76@3029L7,77@3041L460:Layout.kt#80mrfh");
                        androidx.compose.runtime.ProvidableCompositionLocal<androidx.compose.ui.unit.Density> localDensity = androidx.compose.ui.platform.CompositionLocalsKt.getLocalDensity();
                        androidx.compose.runtime.ComposerKt.sourceInformationMarkerStart(composer3, 2023513938, "C:CompositionLocal.kt#9igjgp");
                        java.lang.Object consume = composer3.consume(localDensity);
                        androidx.compose.runtime.ComposerKt.sourceInformationMarkerEnd(composer3);
                        androidx.compose.ui.unit.Density density = (androidx.compose.ui.unit.Density) consume;
                        androidx.compose.runtime.ProvidableCompositionLocal<androidx.compose.ui.unit.LayoutDirection> localLayoutDirection = androidx.compose.ui.platform.CompositionLocalsKt.getLocalLayoutDirection();
                        androidx.compose.runtime.ComposerKt.sourceInformationMarkerStart(composer3, 2023513938, "C:CompositionLocal.kt#9igjgp");
                        java.lang.Object consume2 = composer3.consume(localLayoutDirection);
                        androidx.compose.runtime.ComposerKt.sourceInformationMarkerEnd(composer3);
                        androidx.compose.ui.unit.LayoutDirection layoutDirection = (androidx.compose.ui.unit.LayoutDirection) consume2;
                        androidx.compose.runtime.ProvidableCompositionLocal<androidx.compose.ui.platform.ViewConfiguration> localViewConfiguration = androidx.compose.ui.platform.CompositionLocalsKt.getLocalViewConfiguration();
                        androidx.compose.runtime.ComposerKt.sourceInformationMarkerStart(composer3, 2023513938, "C:CompositionLocal.kt#9igjgp");
                        java.lang.Object consume3 = composer3.consume(localViewConfiguration);
                        androidx.compose.runtime.ComposerKt.sourceInformationMarkerEnd(composer3);
                        androidx.compose.ui.platform.ViewConfiguration viewConfiguration = (androidx.compose.ui.platform.ViewConfiguration) consume3;
                        kotlin.jvm.functions.Function0<androidx.compose.ui.node.ComposeUiNode> constructor = androidx.compose.ui.node.ComposeUiNode.INSTANCE.getConstructor();
                        kotlin.jvm.functions.Function3<androidx.compose.runtime.SkippableUpdater<androidx.compose.ui.node.ComposeUiNode>, androidx.compose.runtime.Composer, java.lang.Integer, kotlin.Unit> materializerOf = androidx.compose.ui.layout.LayoutKt.materializerOf(fillMaxSize$default);
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
                        androidx.compose.runtime.Updater.m1648setimpl(m1641constructorimpl, rememberBoxMeasurePolicy, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetMeasurePolicy());
                        androidx.compose.runtime.Updater.m1648setimpl(m1641constructorimpl, density, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetDensity());
                        androidx.compose.runtime.Updater.m1648setimpl(m1641constructorimpl, layoutDirection, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetLayoutDirection());
                        androidx.compose.runtime.Updater.m1648setimpl(m1641constructorimpl, viewConfiguration, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetViewConfiguration());
                        composer3.enableReusing();
                        materializerOf.invoke(androidx.compose.runtime.SkippableUpdater.m1632boximpl(androidx.compose.runtime.SkippableUpdater.m1633constructorimpl(composer3)), composer3, 0);
                        composer3.startReplaceableGroup(2058660585);
                        composer3.startReplaceableGroup(-2137368960);
                        androidx.compose.runtime.ComposerKt.sourceInformation(composer3, "C72@3384L9:Box.kt#2w3rfo");
                        androidx.compose.foundation.layout.BoxScopeInstance boxScopeInstance = androidx.compose.foundation.layout.BoxScopeInstance.INSTANCE;
                        composer3.startReplaceableGroup(-402723888);
                        androidx.compose.runtime.ComposerKt.sourceInformation(composer3, "C329@13420L9,330@13442L310:ModalBottomSheet.kt#jmzs0o");
                        function2.invoke(composer3, java.lang.Integer.valueOf((i13 >> 24) & 14));
                        androidx.compose.material.ModalBottomSheetKt.m1429Scrim3JVO9M(j16, new kotlin.jvm.functions.Function0<kotlin.Unit>() { // from class: androidx.compose.material.ModalBottomSheetKt$ModalBottomSheetLayout$1$1$1
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
                                if (androidx.compose.material.ModalBottomSheetState.this.getConfirmStateChange$material_release().invoke(androidx.compose.material.ModalBottomSheetValue.Hidden).booleanValue()) {
                                    kotlinx.coroutines.BuildersKt__Builders_commonKt.launch$default(coroutineScope22, null, null, new androidx.compose.material.ModalBottomSheetKt$ModalBottomSheetLayout$1$1$1.AnonymousClass1(androidx.compose.material.ModalBottomSheetState.this, null), 3, null);
                                }
                            }

                            /* compiled from: ModalBottomSheet.kt */
                            @kotlin.Metadata(k = 3, mv = {1, 6, 0}, xi = 48)
                            @kotlin.coroutines.jvm.internal.DebugMetadata(c = "androidx.compose.material.ModalBottomSheetKt$ModalBottomSheetLayout$1$1$1$1", f = "ModalBottomSheet.kt", i = {}, l = {335}, m = "invokeSuspend", n = {}, s = {})
                            /* renamed from: androidx.compose.material.ModalBottomSheetKt$ModalBottomSheetLayout$1$1$1$1, reason: invalid class name */
                            static final class AnonymousClass1 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<kotlinx.coroutines.CoroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> {
                                final /* synthetic */ androidx.compose.material.ModalBottomSheetState $sheetState;
                                int label;

                                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                AnonymousClass1(androidx.compose.material.ModalBottomSheetState modalBottomSheetState, kotlin.coroutines.Continuation<? super androidx.compose.material.ModalBottomSheetKt$ModalBottomSheetLayout$1$1$1.AnonymousClass1> continuation) {
                                    super(2, continuation);
                                    this.$sheetState = modalBottomSheetState;
                                }

                                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                                public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object obj, kotlin.coroutines.Continuation<?> continuation) {
                                    return new androidx.compose.material.ModalBottomSheetKt$ModalBottomSheetLayout$1$1$1.AnonymousClass1(this.$sheetState, continuation);
                                }

                                @Override // kotlin.jvm.functions.Function2
                                public final java.lang.Object invoke(kotlinx.coroutines.CoroutineScope coroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
                                    return ((androidx.compose.material.ModalBottomSheetKt$ModalBottomSheetLayout$1$1$1.AnonymousClass1) create(coroutineScope, continuation)).invokeSuspend(kotlin.Unit.INSTANCE);
                                }

                                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                                public final java.lang.Object invokeSuspend(java.lang.Object obj) {
                                    java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
                                    int i = this.label;
                                    if (i == 0) {
                                        kotlin.ResultKt.throwOnFailure(obj);
                                        this.label = 1;
                                        if (this.$sheetState.hide(this) == coroutine_suspended) {
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
                        }, modalBottomSheetState6.getTargetValue() != androidx.compose.material.ModalBottomSheetValue.Hidden, composer3, (i13 >> 21) & 14);
                        composer3.endReplaceableGroup();
                        composer3.endReplaceableGroup();
                        composer3.endReplaceableGroup();
                        composer3.endNode();
                        composer3.endReplaceableGroup();
                        composer3.endReplaceableGroup();
                        androidx.compose.ui.Modifier nestedScroll$default = androidx.compose.ui.input.nestedscroll.NestedScrollModifierKt.nestedScroll$default(androidx.compose.foundation.layout.SizeKt.fillMaxWidth$default(androidx.compose.ui.Modifier.INSTANCE, 0.0f, 1, null), androidx.compose.material.ModalBottomSheetState.this.getNestedScrollConnection(), null, 2, null);
                        java.lang.Object obj = androidx.compose.material.ModalBottomSheetState.this;
                        java.lang.Object valueOf = java.lang.Float.valueOf(m4423getMaxHeightimpl);
                        final androidx.compose.material.ModalBottomSheetState modalBottomSheetState7 = androidx.compose.material.ModalBottomSheetState.this;
                        composer3.startReplaceableGroup(511388516);
                        androidx.compose.runtime.ComposerKt.sourceInformation(composer3, "C(remember)P(1,2):Composables.kt#9igjgp");
                        boolean changed = composer3.changed(obj) | composer3.changed(valueOf);
                        java.lang.Object rememberedValue3 = composer3.rememberedValue();
                        if (changed || rememberedValue3 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                            rememberedValue3 = (kotlin.jvm.functions.Function1) new kotlin.jvm.functions.Function1<androidx.compose.ui.unit.Density, androidx.compose.ui.unit.IntOffset>() { // from class: androidx.compose.material.ModalBottomSheetKt$ModalBottomSheetLayout$1$2$1
                                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                {
                                    super(1);
                                }

                                @Override // kotlin.jvm.functions.Function1
                                public /* bridge */ /* synthetic */ androidx.compose.ui.unit.IntOffset invoke(androidx.compose.ui.unit.Density density2) {
                                    return androidx.compose.ui.unit.IntOffset.m4601boximpl(m1433invokeBjo55l4(density2));
                                }

                                /* renamed from: invoke-Bjo55l4, reason: not valid java name */
                                public final long m1433invokeBjo55l4(androidx.compose.ui.unit.Density offset) {
                                    int roundToInt;
                                    kotlin.jvm.internal.Intrinsics.checkNotNullParameter(offset, "$this$offset");
                                    if (androidx.compose.material.ModalBottomSheetState.this.getAnchors$material_release().isEmpty()) {
                                        roundToInt = kotlin.math.MathKt.roundToInt(m4423getMaxHeightimpl);
                                    } else {
                                        roundToInt = kotlin.math.MathKt.roundToInt(androidx.compose.material.ModalBottomSheetState.this.getOffset().getValue().floatValue());
                                    }
                                    return androidx.compose.ui.unit.IntOffsetKt.IntOffset(0, roundToInt);
                                }
                            };
                            composer3.updateRememberedValue(rememberedValue3);
                        }
                        composer3.endReplaceableGroup();
                        bottomSheetSwipeable = androidx.compose.material.ModalBottomSheetKt.bottomSheetSwipeable(androidx.compose.foundation.layout.OffsetKt.offset(nestedScroll$default, (kotlin.jvm.functions.Function1) rememberedValue3), androidx.compose.material.ModalBottomSheetState.this, m4423getMaxHeightimpl, mutableState);
                        composer3.startReplaceableGroup(1157296644);
                        androidx.compose.runtime.ComposerKt.sourceInformation(composer3, "C(remember)P(1):Composables.kt#9igjgp");
                        boolean changed2 = composer3.changed(mutableState);
                        java.lang.Object rememberedValue4 = composer3.rememberedValue();
                        if (changed2 || rememberedValue4 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                            rememberedValue4 = (kotlin.jvm.functions.Function1) new kotlin.jvm.functions.Function1<androidx.compose.ui.layout.LayoutCoordinates, kotlin.Unit>() { // from class: androidx.compose.material.ModalBottomSheetKt$ModalBottomSheetLayout$1$3$1
                                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                {
                                    super(1);
                                }

                                @Override // kotlin.jvm.functions.Function1
                                public /* bridge */ /* synthetic */ kotlin.Unit invoke(androidx.compose.ui.layout.LayoutCoordinates layoutCoordinates) {
                                    invoke2(layoutCoordinates);
                                    return kotlin.Unit.INSTANCE;
                                }

                                /* renamed from: invoke, reason: avoid collision after fix types in other method */
                                public final void invoke2(androidx.compose.ui.layout.LayoutCoordinates it) {
                                    kotlin.jvm.internal.Intrinsics.checkNotNullParameter(it, "it");
                                    mutableState.setValue(java.lang.Float.valueOf(androidx.compose.ui.unit.IntSize.m4651getHeightimpl(it.mo3409getSizeYbymL2g())));
                                }
                            };
                            composer3.updateRememberedValue(rememberedValue4);
                        }
                        composer3.endReplaceableGroup();
                        androidx.compose.ui.Modifier onGloballyPositioned = androidx.compose.ui.layout.OnGloballyPositionedModifierKt.onGloballyPositioned(bottomSheetSwipeable, (kotlin.jvm.functions.Function1) rememberedValue4);
                        final androidx.compose.material.ModalBottomSheetState modalBottomSheetState8 = androidx.compose.material.ModalBottomSheetState.this;
                        final kotlinx.coroutines.CoroutineScope coroutineScope3 = coroutineScope2;
                        androidx.compose.ui.Modifier semantics$default = androidx.compose.ui.semantics.SemanticsModifierKt.semantics$default(onGloballyPositioned, false, new kotlin.jvm.functions.Function1<androidx.compose.ui.semantics.SemanticsPropertyReceiver, kotlin.Unit>() { // from class: androidx.compose.material.ModalBottomSheetKt$ModalBottomSheetLayout$1.4
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
                                if (androidx.compose.material.ModalBottomSheetState.this.isVisible()) {
                                    final androidx.compose.material.ModalBottomSheetState modalBottomSheetState9 = androidx.compose.material.ModalBottomSheetState.this;
                                    final kotlinx.coroutines.CoroutineScope coroutineScope4 = coroutineScope3;
                                    androidx.compose.ui.semantics.SemanticsPropertiesKt.dismiss$default(semantics, null, new kotlin.jvm.functions.Function0<java.lang.Boolean>() { // from class: androidx.compose.material.ModalBottomSheetKt.ModalBottomSheetLayout.1.4.1
                                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                        {
                                            super(0);
                                        }

                                        /* JADX WARN: Can't rename method to resolve collision */
                                        @Override // kotlin.jvm.functions.Function0
                                        public final java.lang.Boolean invoke() {
                                            if (androidx.compose.material.ModalBottomSheetState.this.getConfirmStateChange$material_release().invoke(androidx.compose.material.ModalBottomSheetValue.Hidden).booleanValue()) {
                                                kotlinx.coroutines.BuildersKt__Builders_commonKt.launch$default(coroutineScope4, null, null, new androidx.compose.material.ModalBottomSheetKt$ModalBottomSheetLayout$1.AnonymousClass4.AnonymousClass1.C00471(androidx.compose.material.ModalBottomSheetState.this, null), 3, null);
                                            }
                                            return true;
                                        }

                                        /* compiled from: ModalBottomSheet.kt */
                                        @kotlin.Metadata(k = 3, mv = {1, 6, 0}, xi = 48)
                                        @kotlin.coroutines.jvm.internal.DebugMetadata(c = "androidx.compose.material.ModalBottomSheetKt$ModalBottomSheetLayout$1$4$1$1", f = "ModalBottomSheet.kt", i = {}, l = {363}, m = "invokeSuspend", n = {}, s = {})
                                        /* renamed from: androidx.compose.material.ModalBottomSheetKt$ModalBottomSheetLayout$1$4$1$1, reason: invalid class name and collision with other inner class name */
                                        static final class C00471 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<kotlinx.coroutines.CoroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> {
                                            final /* synthetic */ androidx.compose.material.ModalBottomSheetState $sheetState;
                                            int label;

                                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                            C00471(androidx.compose.material.ModalBottomSheetState modalBottomSheetState, kotlin.coroutines.Continuation<? super androidx.compose.material.ModalBottomSheetKt$ModalBottomSheetLayout$1.AnonymousClass4.AnonymousClass1.C00471> continuation) {
                                                super(2, continuation);
                                                this.$sheetState = modalBottomSheetState;
                                            }

                                            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                                            public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object obj, kotlin.coroutines.Continuation<?> continuation) {
                                                return new androidx.compose.material.ModalBottomSheetKt$ModalBottomSheetLayout$1.AnonymousClass4.AnonymousClass1.C00471(this.$sheetState, continuation);
                                            }

                                            @Override // kotlin.jvm.functions.Function2
                                            public final java.lang.Object invoke(kotlinx.coroutines.CoroutineScope coroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
                                                return ((androidx.compose.material.ModalBottomSheetKt$ModalBottomSheetLayout$1.AnonymousClass4.AnonymousClass1.C00471) create(coroutineScope, continuation)).invokeSuspend(kotlin.Unit.INSTANCE);
                                            }

                                            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                                            public final java.lang.Object invokeSuspend(java.lang.Object obj) {
                                                java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
                                                int i = this.label;
                                                if (i == 0) {
                                                    kotlin.ResultKt.throwOnFailure(obj);
                                                    this.label = 1;
                                                    if (this.$sheetState.hide(this) == coroutine_suspended) {
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
                                    if (androidx.compose.material.ModalBottomSheetState.this.getCurrentValue() == androidx.compose.material.ModalBottomSheetValue.HalfExpanded) {
                                        final androidx.compose.material.ModalBottomSheetState modalBottomSheetState10 = androidx.compose.material.ModalBottomSheetState.this;
                                        final kotlinx.coroutines.CoroutineScope coroutineScope5 = coroutineScope3;
                                        androidx.compose.ui.semantics.SemanticsPropertiesKt.expand$default(semantics, null, new kotlin.jvm.functions.Function0<java.lang.Boolean>() { // from class: androidx.compose.material.ModalBottomSheetKt.ModalBottomSheetLayout.1.4.2
                                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                            {
                                                super(0);
                                            }

                                            /* JADX WARN: Can't rename method to resolve collision */
                                            @Override // kotlin.jvm.functions.Function0
                                            public final java.lang.Boolean invoke() {
                                                if (androidx.compose.material.ModalBottomSheetState.this.getConfirmStateChange$material_release().invoke(androidx.compose.material.ModalBottomSheetValue.Expanded).booleanValue()) {
                                                    kotlinx.coroutines.BuildersKt__Builders_commonKt.launch$default(coroutineScope5, null, null, new androidx.compose.material.ModalBottomSheetKt$ModalBottomSheetLayout$1.AnonymousClass4.AnonymousClass2.AnonymousClass1(androidx.compose.material.ModalBottomSheetState.this, null), 3, null);
                                                }
                                                return true;
                                            }

                                            /* compiled from: ModalBottomSheet.kt */
                                            @kotlin.Metadata(k = 3, mv = {1, 6, 0}, xi = 48)
                                            @kotlin.coroutines.jvm.internal.DebugMetadata(c = "androidx.compose.material.ModalBottomSheetKt$ModalBottomSheetLayout$1$4$2$1", f = "ModalBottomSheet.kt", i = {}, l = {370}, m = "invokeSuspend", n = {}, s = {})
                                            /* renamed from: androidx.compose.material.ModalBottomSheetKt$ModalBottomSheetLayout$1$4$2$1, reason: invalid class name */
                                            static final class AnonymousClass1 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<kotlinx.coroutines.CoroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> {
                                                final /* synthetic */ androidx.compose.material.ModalBottomSheetState $sheetState;
                                                int label;

                                                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                                AnonymousClass1(androidx.compose.material.ModalBottomSheetState modalBottomSheetState, kotlin.coroutines.Continuation<? super androidx.compose.material.ModalBottomSheetKt$ModalBottomSheetLayout$1.AnonymousClass4.AnonymousClass2.AnonymousClass1> continuation) {
                                                    super(2, continuation);
                                                    this.$sheetState = modalBottomSheetState;
                                                }

                                                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                                                public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object obj, kotlin.coroutines.Continuation<?> continuation) {
                                                    return new androidx.compose.material.ModalBottomSheetKt$ModalBottomSheetLayout$1.AnonymousClass4.AnonymousClass2.AnonymousClass1(this.$sheetState, continuation);
                                                }

                                                @Override // kotlin.jvm.functions.Function2
                                                public final java.lang.Object invoke(kotlinx.coroutines.CoroutineScope coroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
                                                    return ((androidx.compose.material.ModalBottomSheetKt$ModalBottomSheetLayout$1.AnonymousClass4.AnonymousClass2.AnonymousClass1) create(coroutineScope, continuation)).invokeSuspend(kotlin.Unit.INSTANCE);
                                                }

                                                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                                                public final java.lang.Object invokeSuspend(java.lang.Object obj) {
                                                    java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
                                                    int i = this.label;
                                                    if (i == 0) {
                                                        kotlin.ResultKt.throwOnFailure(obj);
                                                        this.label = 1;
                                                        if (this.$sheetState.expand$material_release(this) == coroutine_suspended) {
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
                                    } else if (androidx.compose.material.ModalBottomSheetState.this.getHasHalfExpandedState$material_release()) {
                                        final androidx.compose.material.ModalBottomSheetState modalBottomSheetState11 = androidx.compose.material.ModalBottomSheetState.this;
                                        final kotlinx.coroutines.CoroutineScope coroutineScope6 = coroutineScope3;
                                        androidx.compose.ui.semantics.SemanticsPropertiesKt.collapse$default(semantics, null, new kotlin.jvm.functions.Function0<java.lang.Boolean>() { // from class: androidx.compose.material.ModalBottomSheetKt.ModalBottomSheetLayout.1.4.3
                                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                            {
                                                super(0);
                                            }

                                            /* JADX WARN: Can't rename method to resolve collision */
                                            @Override // kotlin.jvm.functions.Function0
                                            public final java.lang.Boolean invoke() {
                                                if (androidx.compose.material.ModalBottomSheetState.this.getConfirmStateChange$material_release().invoke(androidx.compose.material.ModalBottomSheetValue.HalfExpanded).booleanValue()) {
                                                    kotlinx.coroutines.BuildersKt__Builders_commonKt.launch$default(coroutineScope6, null, null, new androidx.compose.material.ModalBottomSheetKt$ModalBottomSheetLayout$1.AnonymousClass4.AnonymousClass3.AnonymousClass1(androidx.compose.material.ModalBottomSheetState.this, null), 3, null);
                                                }
                                                return true;
                                            }

                                            /* compiled from: ModalBottomSheet.kt */
                                            @kotlin.Metadata(k = 3, mv = {1, 6, 0}, xi = 48)
                                            @kotlin.coroutines.jvm.internal.DebugMetadata(c = "androidx.compose.material.ModalBottomSheetKt$ModalBottomSheetLayout$1$4$3$1", f = "ModalBottomSheet.kt", i = {}, l = {377}, m = "invokeSuspend", n = {}, s = {})
                                            /* renamed from: androidx.compose.material.ModalBottomSheetKt$ModalBottomSheetLayout$1$4$3$1, reason: invalid class name */
                                            static final class AnonymousClass1 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<kotlinx.coroutines.CoroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> {
                                                final /* synthetic */ androidx.compose.material.ModalBottomSheetState $sheetState;
                                                int label;

                                                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                                AnonymousClass1(androidx.compose.material.ModalBottomSheetState modalBottomSheetState, kotlin.coroutines.Continuation<? super androidx.compose.material.ModalBottomSheetKt$ModalBottomSheetLayout$1.AnonymousClass4.AnonymousClass3.AnonymousClass1> continuation) {
                                                    super(2, continuation);
                                                    this.$sheetState = modalBottomSheetState;
                                                }

                                                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                                                public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object obj, kotlin.coroutines.Continuation<?> continuation) {
                                                    return new androidx.compose.material.ModalBottomSheetKt$ModalBottomSheetLayout$1.AnonymousClass4.AnonymousClass3.AnonymousClass1(this.$sheetState, continuation);
                                                }

                                                @Override // kotlin.jvm.functions.Function2
                                                public final java.lang.Object invoke(kotlinx.coroutines.CoroutineScope coroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
                                                    return ((androidx.compose.material.ModalBottomSheetKt$ModalBottomSheetLayout$1.AnonymousClass4.AnonymousClass3.AnonymousClass1) create(coroutineScope, continuation)).invokeSuspend(kotlin.Unit.INSTANCE);
                                                }

                                                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                                                public final java.lang.Object invokeSuspend(java.lang.Object obj) {
                                                    java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
                                                    int i = this.label;
                                                    if (i == 0) {
                                                        kotlin.ResultKt.throwOnFailure(obj);
                                                        this.label = 1;
                                                        if (this.$sheetState.halfExpand$material_release(this) == coroutine_suspended) {
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
                            }
                        }, 1, null);
                        androidx.compose.ui.graphics.Shape shape5 = shape42;
                        long j17 = j142;
                        long j18 = j152;
                        float f6 = f52;
                        final kotlin.jvm.functions.Function3<? super androidx.compose.foundation.layout.ColumnScope, ? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.Unit> function3 = sheetContent;
                        final int i14 = i102;
                        androidx.compose.runtime.internal.ComposableLambda composableLambda = androidx.compose.runtime.internal.ComposableLambdaKt.composableLambda(composer3, -1793508390, true, new kotlin.jvm.functions.Function2<androidx.compose.runtime.Composer, java.lang.Integer, kotlin.Unit>() { // from class: androidx.compose.material.ModalBottomSheetKt$ModalBottomSheetLayout$1.5
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

                            public final void invoke(androidx.compose.runtime.Composer composer4, int i15) {
                                androidx.compose.runtime.ComposerKt.sourceInformation(composer4, "C388@15886L30:ModalBottomSheet.kt#jmzs0o");
                                if ((i15 & 11) == 2 && composer4.getSkipping()) {
                                    composer4.skipToGroupEnd();
                                    return;
                                }
                                kotlin.jvm.functions.Function3<androidx.compose.foundation.layout.ColumnScope, androidx.compose.runtime.Composer, java.lang.Integer, kotlin.Unit> function32 = function3;
                                int i16 = (i14 << 9) & 7168;
                                composer4.startReplaceableGroup(-483455358);
                                androidx.compose.runtime.ComposerKt.sourceInformation(composer4, "C(Column)P(2,3,1)77@3880L61,78@3946L133:Column.kt#2w3rfo");
                                androidx.compose.ui.Modifier.Companion companion = androidx.compose.ui.Modifier.INSTANCE;
                                androidx.compose.ui.layout.MeasurePolicy columnMeasurePolicy = androidx.compose.foundation.layout.ColumnKt.columnMeasurePolicy(androidx.compose.foundation.layout.Arrangement.INSTANCE.getTop(), androidx.compose.ui.Alignment.INSTANCE.getStart(), composer4, 0);
                                composer4.startReplaceableGroup(-1323940314);
                                androidx.compose.runtime.ComposerKt.sourceInformation(composer4, "C(Layout)P(!1,2)74@2915L7,75@2970L7,76@3029L7,77@3041L460:Layout.kt#80mrfh");
                                androidx.compose.runtime.ProvidableCompositionLocal<androidx.compose.ui.unit.Density> localDensity2 = androidx.compose.ui.platform.CompositionLocalsKt.getLocalDensity();
                                androidx.compose.runtime.ComposerKt.sourceInformationMarkerStart(composer4, 2023513938, "C:CompositionLocal.kt#9igjgp");
                                java.lang.Object consume4 = composer4.consume(localDensity2);
                                androidx.compose.runtime.ComposerKt.sourceInformationMarkerEnd(composer4);
                                androidx.compose.ui.unit.Density density2 = (androidx.compose.ui.unit.Density) consume4;
                                androidx.compose.runtime.ProvidableCompositionLocal<androidx.compose.ui.unit.LayoutDirection> localLayoutDirection2 = androidx.compose.ui.platform.CompositionLocalsKt.getLocalLayoutDirection();
                                androidx.compose.runtime.ComposerKt.sourceInformationMarkerStart(composer4, 2023513938, "C:CompositionLocal.kt#9igjgp");
                                java.lang.Object consume5 = composer4.consume(localLayoutDirection2);
                                androidx.compose.runtime.ComposerKt.sourceInformationMarkerEnd(composer4);
                                androidx.compose.ui.unit.LayoutDirection layoutDirection2 = (androidx.compose.ui.unit.LayoutDirection) consume5;
                                androidx.compose.runtime.ProvidableCompositionLocal<androidx.compose.ui.platform.ViewConfiguration> localViewConfiguration2 = androidx.compose.ui.platform.CompositionLocalsKt.getLocalViewConfiguration();
                                androidx.compose.runtime.ComposerKt.sourceInformationMarkerStart(composer4, 2023513938, "C:CompositionLocal.kt#9igjgp");
                                java.lang.Object consume6 = composer4.consume(localViewConfiguration2);
                                androidx.compose.runtime.ComposerKt.sourceInformationMarkerEnd(composer4);
                                androidx.compose.ui.platform.ViewConfiguration viewConfiguration2 = (androidx.compose.ui.platform.ViewConfiguration) consume6;
                                kotlin.jvm.functions.Function0<androidx.compose.ui.node.ComposeUiNode> constructor2 = androidx.compose.ui.node.ComposeUiNode.INSTANCE.getConstructor();
                                kotlin.jvm.functions.Function3<androidx.compose.runtime.SkippableUpdater<androidx.compose.ui.node.ComposeUiNode>, androidx.compose.runtime.Composer, java.lang.Integer, kotlin.Unit> materializerOf2 = androidx.compose.ui.layout.LayoutKt.materializerOf(companion);
                                if (!(composer4.getApplier() instanceof androidx.compose.runtime.Applier)) {
                                    androidx.compose.runtime.ComposablesKt.invalidApplier();
                                }
                                composer4.startReusableNode();
                                if (composer4.getInserting()) {
                                    composer4.createNode(constructor2);
                                } else {
                                    composer4.useNode();
                                }
                                composer4.disableReusing();
                                androidx.compose.runtime.Composer m1641constructorimpl2 = androidx.compose.runtime.Updater.m1641constructorimpl(composer4);
                                androidx.compose.runtime.Updater.m1648setimpl(m1641constructorimpl2, columnMeasurePolicy, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetMeasurePolicy());
                                androidx.compose.runtime.Updater.m1648setimpl(m1641constructorimpl2, density2, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetDensity());
                                androidx.compose.runtime.Updater.m1648setimpl(m1641constructorimpl2, layoutDirection2, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetLayoutDirection());
                                androidx.compose.runtime.Updater.m1648setimpl(m1641constructorimpl2, viewConfiguration2, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetViewConfiguration());
                                composer4.enableReusing();
                                materializerOf2.invoke(androidx.compose.runtime.SkippableUpdater.m1632boximpl(androidx.compose.runtime.SkippableUpdater.m1633constructorimpl(composer4)), composer4, 0);
                                composer4.startReplaceableGroup(2058660585);
                                composer4.startReplaceableGroup(-1163856341);
                                androidx.compose.runtime.ComposerKt.sourceInformation(composer4, "C79@3994L9:Column.kt#2w3rfo");
                                function32.invoke(androidx.compose.foundation.layout.ColumnScopeInstance.INSTANCE, composer4, java.lang.Integer.valueOf(((i16 >> 6) & 112) | 6));
                                composer4.endReplaceableGroup();
                                composer4.endReplaceableGroup();
                                composer4.endNode();
                                composer4.endReplaceableGroup();
                                composer4.endReplaceableGroup();
                            }
                        });
                        int i15 = i102;
                        androidx.compose.material.SurfaceKt.m1511SurfaceFjzlyU(semantics$default, shape5, j17, j18, null, f6, composableLambda, composer3, ((i15 >> 6) & 112) | 1572864 | ((i15 >> 9) & 896) | ((i15 >> 9) & 7168) | ((i15 << 3) & 458752), 16);
                        return;
                    }
                    composer3.skipToGroupEnd();
                }
            }), composer2, ((i5 >> 3) & 14) | 3072, 6);
            modalBottomSheetState2 = modalBottomSheetState4;
            shape3 = shape2;
            modifier3 = modifier2;
            f4 = f3;
            j12 = j9;
            j13 = j10;
            endRestartGroup = composer2.endRestartGroup();
            if (endRestartGroup == null) {
            }
        }
        if ((i & 896) != 0) {
        }
        if ((i & 7168) == 0) {
        }
        i4 = i2 & 16;
        if (i4 == 0) {
        }
        if ((458752 & i) == 0) {
        }
        if ((3670016 & i) != 0) {
        }
        if ((29360128 & i) != 0) {
        }
        if ((i2 & 256) != 0) {
        }
        i3 |= i6;
        if ((191739611 & i3) == 38347922) {
        }
        startRestartGroup.startDefaults();
        if ((i & 1) != 0) {
        }
        if (i9 != 0) {
        }
        if ((i2 & 4) != 0) {
        }
        if ((i2 & 8) != 0) {
        }
        if (i4 != 0) {
        }
        if ((i2 & 32) != 0) {
        }
        if ((i2 & 64) != 0) {
        }
        if ((i2 & 128) != 0) {
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
        final androidx.compose.material.ModalBottomSheetState modalBottomSheetState522 = modalBottomSheetState4;
        final int i1022 = i5;
        final androidx.compose.ui.graphics.Shape shape422 = shape2;
        final long j1422 = j9;
        final long j1522 = j10;
        final float f522 = f3;
        composer2 = startRestartGroup;
        j11 = j8;
        androidx.compose.foundation.layout.BoxWithConstraintsKt.BoxWithConstraints(modifier2, null, false, androidx.compose.runtime.internal.ComposableLambdaKt.composableLambda(composer2, 1607356310, true, new kotlin.jvm.functions.Function3<androidx.compose.foundation.layout.BoxWithConstraintsScope, androidx.compose.runtime.Composer, java.lang.Integer, kotlin.Unit>() { // from class: androidx.compose.material.ModalBottomSheetKt$ModalBottomSheetLayout$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            {
                super(3);
            }

            @Override // kotlin.jvm.functions.Function3
            public /* bridge */ /* synthetic */ kotlin.Unit invoke(androidx.compose.foundation.layout.BoxWithConstraintsScope boxWithConstraintsScope, androidx.compose.runtime.Composer composer3, java.lang.Integer num) {
                invoke(boxWithConstraintsScope, composer3, num.intValue());
                return kotlin.Unit.INSTANCE;
            }

            public final void invoke(androidx.compose.foundation.layout.BoxWithConstraintsScope BoxWithConstraints, androidx.compose.runtime.Composer composer3, int i11) {
                int i12;
                androidx.compose.ui.Modifier bottomSheetSwipeable;
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(BoxWithConstraints, "$this$BoxWithConstraints");
                androidx.compose.runtime.ComposerKt.sourceInformation(composer3, "C327@13328L41,328@13378L384,344@13922L434,355@14475L89,340@13771L2155:ModalBottomSheet.kt#jmzs0o");
                if ((i11 & 14) == 0) {
                    i12 = i11 | (composer3.changed(BoxWithConstraints) ? 4 : 2);
                } else {
                    i12 = i11;
                }
                if ((i12 & 91) != 18 || !composer3.getSkipping()) {
                    final float m4423getMaxHeightimpl = androidx.compose.ui.unit.Constraints.m4423getMaxHeightimpl(BoxWithConstraints.mo504getConstraintsmsEJaDk());
                    composer3.startReplaceableGroup(-492369756);
                    androidx.compose.runtime.ComposerKt.sourceInformation(composer3, "C(remember):Composables.kt#9igjgp");
                    java.lang.Object rememberedValue2 = composer3.rememberedValue();
                    if (rememberedValue2 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                        rememberedValue2 = androidx.compose.runtime.SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(null, null, 2, null);
                        composer3.updateRememberedValue(rememberedValue2);
                    }
                    composer3.endReplaceableGroup();
                    final androidx.compose.runtime.MutableState<java.lang.Float> mutableState = (androidx.compose.runtime.MutableState) rememberedValue2;
                    androidx.compose.ui.Modifier fillMaxSize$default = androidx.compose.foundation.layout.SizeKt.fillMaxSize$default(androidx.compose.ui.Modifier.INSTANCE, 0.0f, 1, null);
                    kotlin.jvm.functions.Function2<androidx.compose.runtime.Composer, java.lang.Integer, kotlin.Unit> function2 = content;
                    int i13 = i1022;
                    long j16 = j11;
                    final androidx.compose.material.ModalBottomSheetState modalBottomSheetState6 = androidx.compose.material.ModalBottomSheetState.this;
                    final kotlinx.coroutines.CoroutineScope coroutineScope222 = coroutineScope22;
                    composer3.startReplaceableGroup(733328855);
                    androidx.compose.runtime.ComposerKt.sourceInformation(composer3, "C(Box)P(2,1,3)70@3267L67,71@3339L130:Box.kt#2w3rfo");
                    androidx.compose.ui.layout.MeasurePolicy rememberBoxMeasurePolicy = androidx.compose.foundation.layout.BoxKt.rememberBoxMeasurePolicy(androidx.compose.ui.Alignment.INSTANCE.getTopStart(), false, composer3, 0);
                    composer3.startReplaceableGroup(-1323940314);
                    androidx.compose.runtime.ComposerKt.sourceInformation(composer3, "C(Layout)P(!1,2)74@2915L7,75@2970L7,76@3029L7,77@3041L460:Layout.kt#80mrfh");
                    androidx.compose.runtime.ProvidableCompositionLocal<androidx.compose.ui.unit.Density> localDensity = androidx.compose.ui.platform.CompositionLocalsKt.getLocalDensity();
                    androidx.compose.runtime.ComposerKt.sourceInformationMarkerStart(composer3, 2023513938, "C:CompositionLocal.kt#9igjgp");
                    java.lang.Object consume = composer3.consume(localDensity);
                    androidx.compose.runtime.ComposerKt.sourceInformationMarkerEnd(composer3);
                    androidx.compose.ui.unit.Density density = (androidx.compose.ui.unit.Density) consume;
                    androidx.compose.runtime.ProvidableCompositionLocal<androidx.compose.ui.unit.LayoutDirection> localLayoutDirection = androidx.compose.ui.platform.CompositionLocalsKt.getLocalLayoutDirection();
                    androidx.compose.runtime.ComposerKt.sourceInformationMarkerStart(composer3, 2023513938, "C:CompositionLocal.kt#9igjgp");
                    java.lang.Object consume2 = composer3.consume(localLayoutDirection);
                    androidx.compose.runtime.ComposerKt.sourceInformationMarkerEnd(composer3);
                    androidx.compose.ui.unit.LayoutDirection layoutDirection = (androidx.compose.ui.unit.LayoutDirection) consume2;
                    androidx.compose.runtime.ProvidableCompositionLocal<androidx.compose.ui.platform.ViewConfiguration> localViewConfiguration = androidx.compose.ui.platform.CompositionLocalsKt.getLocalViewConfiguration();
                    androidx.compose.runtime.ComposerKt.sourceInformationMarkerStart(composer3, 2023513938, "C:CompositionLocal.kt#9igjgp");
                    java.lang.Object consume3 = composer3.consume(localViewConfiguration);
                    androidx.compose.runtime.ComposerKt.sourceInformationMarkerEnd(composer3);
                    androidx.compose.ui.platform.ViewConfiguration viewConfiguration = (androidx.compose.ui.platform.ViewConfiguration) consume3;
                    kotlin.jvm.functions.Function0<androidx.compose.ui.node.ComposeUiNode> constructor = androidx.compose.ui.node.ComposeUiNode.INSTANCE.getConstructor();
                    kotlin.jvm.functions.Function3<androidx.compose.runtime.SkippableUpdater<androidx.compose.ui.node.ComposeUiNode>, androidx.compose.runtime.Composer, java.lang.Integer, kotlin.Unit> materializerOf = androidx.compose.ui.layout.LayoutKt.materializerOf(fillMaxSize$default);
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
                    androidx.compose.runtime.Updater.m1648setimpl(m1641constructorimpl, rememberBoxMeasurePolicy, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetMeasurePolicy());
                    androidx.compose.runtime.Updater.m1648setimpl(m1641constructorimpl, density, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetDensity());
                    androidx.compose.runtime.Updater.m1648setimpl(m1641constructorimpl, layoutDirection, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetLayoutDirection());
                    androidx.compose.runtime.Updater.m1648setimpl(m1641constructorimpl, viewConfiguration, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetViewConfiguration());
                    composer3.enableReusing();
                    materializerOf.invoke(androidx.compose.runtime.SkippableUpdater.m1632boximpl(androidx.compose.runtime.SkippableUpdater.m1633constructorimpl(composer3)), composer3, 0);
                    composer3.startReplaceableGroup(2058660585);
                    composer3.startReplaceableGroup(-2137368960);
                    androidx.compose.runtime.ComposerKt.sourceInformation(composer3, "C72@3384L9:Box.kt#2w3rfo");
                    androidx.compose.foundation.layout.BoxScopeInstance boxScopeInstance = androidx.compose.foundation.layout.BoxScopeInstance.INSTANCE;
                    composer3.startReplaceableGroup(-402723888);
                    androidx.compose.runtime.ComposerKt.sourceInformation(composer3, "C329@13420L9,330@13442L310:ModalBottomSheet.kt#jmzs0o");
                    function2.invoke(composer3, java.lang.Integer.valueOf((i13 >> 24) & 14));
                    androidx.compose.material.ModalBottomSheetKt.m1429Scrim3JVO9M(j16, new kotlin.jvm.functions.Function0<kotlin.Unit>() { // from class: androidx.compose.material.ModalBottomSheetKt$ModalBottomSheetLayout$1$1$1
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
                            if (androidx.compose.material.ModalBottomSheetState.this.getConfirmStateChange$material_release().invoke(androidx.compose.material.ModalBottomSheetValue.Hidden).booleanValue()) {
                                kotlinx.coroutines.BuildersKt__Builders_commonKt.launch$default(coroutineScope222, null, null, new androidx.compose.material.ModalBottomSheetKt$ModalBottomSheetLayout$1$1$1.AnonymousClass1(androidx.compose.material.ModalBottomSheetState.this, null), 3, null);
                            }
                        }

                        /* compiled from: ModalBottomSheet.kt */
                        @kotlin.Metadata(k = 3, mv = {1, 6, 0}, xi = 48)
                        @kotlin.coroutines.jvm.internal.DebugMetadata(c = "androidx.compose.material.ModalBottomSheetKt$ModalBottomSheetLayout$1$1$1$1", f = "ModalBottomSheet.kt", i = {}, l = {335}, m = "invokeSuspend", n = {}, s = {})
                        /* renamed from: androidx.compose.material.ModalBottomSheetKt$ModalBottomSheetLayout$1$1$1$1, reason: invalid class name */
                        static final class AnonymousClass1 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<kotlinx.coroutines.CoroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> {
                            final /* synthetic */ androidx.compose.material.ModalBottomSheetState $sheetState;
                            int label;

                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            AnonymousClass1(androidx.compose.material.ModalBottomSheetState modalBottomSheetState, kotlin.coroutines.Continuation<? super androidx.compose.material.ModalBottomSheetKt$ModalBottomSheetLayout$1$1$1.AnonymousClass1> continuation) {
                                super(2, continuation);
                                this.$sheetState = modalBottomSheetState;
                            }

                            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                            public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object obj, kotlin.coroutines.Continuation<?> continuation) {
                                return new androidx.compose.material.ModalBottomSheetKt$ModalBottomSheetLayout$1$1$1.AnonymousClass1(this.$sheetState, continuation);
                            }

                            @Override // kotlin.jvm.functions.Function2
                            public final java.lang.Object invoke(kotlinx.coroutines.CoroutineScope coroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
                                return ((androidx.compose.material.ModalBottomSheetKt$ModalBottomSheetLayout$1$1$1.AnonymousClass1) create(coroutineScope, continuation)).invokeSuspend(kotlin.Unit.INSTANCE);
                            }

                            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                            public final java.lang.Object invokeSuspend(java.lang.Object obj) {
                                java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
                                int i = this.label;
                                if (i == 0) {
                                    kotlin.ResultKt.throwOnFailure(obj);
                                    this.label = 1;
                                    if (this.$sheetState.hide(this) == coroutine_suspended) {
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
                    }, modalBottomSheetState6.getTargetValue() != androidx.compose.material.ModalBottomSheetValue.Hidden, composer3, (i13 >> 21) & 14);
                    composer3.endReplaceableGroup();
                    composer3.endReplaceableGroup();
                    composer3.endReplaceableGroup();
                    composer3.endNode();
                    composer3.endReplaceableGroup();
                    composer3.endReplaceableGroup();
                    androidx.compose.ui.Modifier nestedScroll$default = androidx.compose.ui.input.nestedscroll.NestedScrollModifierKt.nestedScroll$default(androidx.compose.foundation.layout.SizeKt.fillMaxWidth$default(androidx.compose.ui.Modifier.INSTANCE, 0.0f, 1, null), androidx.compose.material.ModalBottomSheetState.this.getNestedScrollConnection(), null, 2, null);
                    java.lang.Object obj = androidx.compose.material.ModalBottomSheetState.this;
                    java.lang.Object valueOf = java.lang.Float.valueOf(m4423getMaxHeightimpl);
                    final androidx.compose.material.ModalBottomSheetState modalBottomSheetState7 = androidx.compose.material.ModalBottomSheetState.this;
                    composer3.startReplaceableGroup(511388516);
                    androidx.compose.runtime.ComposerKt.sourceInformation(composer3, "C(remember)P(1,2):Composables.kt#9igjgp");
                    boolean changed = composer3.changed(obj) | composer3.changed(valueOf);
                    java.lang.Object rememberedValue3 = composer3.rememberedValue();
                    if (changed || rememberedValue3 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                        rememberedValue3 = (kotlin.jvm.functions.Function1) new kotlin.jvm.functions.Function1<androidx.compose.ui.unit.Density, androidx.compose.ui.unit.IntOffset>() { // from class: androidx.compose.material.ModalBottomSheetKt$ModalBottomSheetLayout$1$2$1
                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            {
                                super(1);
                            }

                            @Override // kotlin.jvm.functions.Function1
                            public /* bridge */ /* synthetic */ androidx.compose.ui.unit.IntOffset invoke(androidx.compose.ui.unit.Density density2) {
                                return androidx.compose.ui.unit.IntOffset.m4601boximpl(m1433invokeBjo55l4(density2));
                            }

                            /* renamed from: invoke-Bjo55l4, reason: not valid java name */
                            public final long m1433invokeBjo55l4(androidx.compose.ui.unit.Density offset) {
                                int roundToInt;
                                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(offset, "$this$offset");
                                if (androidx.compose.material.ModalBottomSheetState.this.getAnchors$material_release().isEmpty()) {
                                    roundToInt = kotlin.math.MathKt.roundToInt(m4423getMaxHeightimpl);
                                } else {
                                    roundToInt = kotlin.math.MathKt.roundToInt(androidx.compose.material.ModalBottomSheetState.this.getOffset().getValue().floatValue());
                                }
                                return androidx.compose.ui.unit.IntOffsetKt.IntOffset(0, roundToInt);
                            }
                        };
                        composer3.updateRememberedValue(rememberedValue3);
                    }
                    composer3.endReplaceableGroup();
                    bottomSheetSwipeable = androidx.compose.material.ModalBottomSheetKt.bottomSheetSwipeable(androidx.compose.foundation.layout.OffsetKt.offset(nestedScroll$default, (kotlin.jvm.functions.Function1) rememberedValue3), androidx.compose.material.ModalBottomSheetState.this, m4423getMaxHeightimpl, mutableState);
                    composer3.startReplaceableGroup(1157296644);
                    androidx.compose.runtime.ComposerKt.sourceInformation(composer3, "C(remember)P(1):Composables.kt#9igjgp");
                    boolean changed2 = composer3.changed(mutableState);
                    java.lang.Object rememberedValue4 = composer3.rememberedValue();
                    if (changed2 || rememberedValue4 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                        rememberedValue4 = (kotlin.jvm.functions.Function1) new kotlin.jvm.functions.Function1<androidx.compose.ui.layout.LayoutCoordinates, kotlin.Unit>() { // from class: androidx.compose.material.ModalBottomSheetKt$ModalBottomSheetLayout$1$3$1
                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            {
                                super(1);
                            }

                            @Override // kotlin.jvm.functions.Function1
                            public /* bridge */ /* synthetic */ kotlin.Unit invoke(androidx.compose.ui.layout.LayoutCoordinates layoutCoordinates) {
                                invoke2(layoutCoordinates);
                                return kotlin.Unit.INSTANCE;
                            }

                            /* renamed from: invoke, reason: avoid collision after fix types in other method */
                            public final void invoke2(androidx.compose.ui.layout.LayoutCoordinates it) {
                                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(it, "it");
                                mutableState.setValue(java.lang.Float.valueOf(androidx.compose.ui.unit.IntSize.m4651getHeightimpl(it.mo3409getSizeYbymL2g())));
                            }
                        };
                        composer3.updateRememberedValue(rememberedValue4);
                    }
                    composer3.endReplaceableGroup();
                    androidx.compose.ui.Modifier onGloballyPositioned = androidx.compose.ui.layout.OnGloballyPositionedModifierKt.onGloballyPositioned(bottomSheetSwipeable, (kotlin.jvm.functions.Function1) rememberedValue4);
                    final androidx.compose.material.ModalBottomSheetState modalBottomSheetState8 = androidx.compose.material.ModalBottomSheetState.this;
                    final kotlinx.coroutines.CoroutineScope coroutineScope3 = coroutineScope22;
                    androidx.compose.ui.Modifier semantics$default = androidx.compose.ui.semantics.SemanticsModifierKt.semantics$default(onGloballyPositioned, false, new kotlin.jvm.functions.Function1<androidx.compose.ui.semantics.SemanticsPropertyReceiver, kotlin.Unit>() { // from class: androidx.compose.material.ModalBottomSheetKt$ModalBottomSheetLayout$1.4
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
                            if (androidx.compose.material.ModalBottomSheetState.this.isVisible()) {
                                final androidx.compose.material.ModalBottomSheetState modalBottomSheetState9 = androidx.compose.material.ModalBottomSheetState.this;
                                final kotlinx.coroutines.CoroutineScope coroutineScope4 = coroutineScope3;
                                androidx.compose.ui.semantics.SemanticsPropertiesKt.dismiss$default(semantics, null, new kotlin.jvm.functions.Function0<java.lang.Boolean>() { // from class: androidx.compose.material.ModalBottomSheetKt.ModalBottomSheetLayout.1.4.1
                                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                    {
                                        super(0);
                                    }

                                    /* JADX WARN: Can't rename method to resolve collision */
                                    @Override // kotlin.jvm.functions.Function0
                                    public final java.lang.Boolean invoke() {
                                        if (androidx.compose.material.ModalBottomSheetState.this.getConfirmStateChange$material_release().invoke(androidx.compose.material.ModalBottomSheetValue.Hidden).booleanValue()) {
                                            kotlinx.coroutines.BuildersKt__Builders_commonKt.launch$default(coroutineScope4, null, null, new androidx.compose.material.ModalBottomSheetKt$ModalBottomSheetLayout$1.AnonymousClass4.AnonymousClass1.C00471(androidx.compose.material.ModalBottomSheetState.this, null), 3, null);
                                        }
                                        return true;
                                    }

                                    /* compiled from: ModalBottomSheet.kt */
                                    @kotlin.Metadata(k = 3, mv = {1, 6, 0}, xi = 48)
                                    @kotlin.coroutines.jvm.internal.DebugMetadata(c = "androidx.compose.material.ModalBottomSheetKt$ModalBottomSheetLayout$1$4$1$1", f = "ModalBottomSheet.kt", i = {}, l = {363}, m = "invokeSuspend", n = {}, s = {})
                                    /* renamed from: androidx.compose.material.ModalBottomSheetKt$ModalBottomSheetLayout$1$4$1$1, reason: invalid class name and collision with other inner class name */
                                    static final class C00471 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<kotlinx.coroutines.CoroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> {
                                        final /* synthetic */ androidx.compose.material.ModalBottomSheetState $sheetState;
                                        int label;

                                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                        C00471(androidx.compose.material.ModalBottomSheetState modalBottomSheetState, kotlin.coroutines.Continuation<? super androidx.compose.material.ModalBottomSheetKt$ModalBottomSheetLayout$1.AnonymousClass4.AnonymousClass1.C00471> continuation) {
                                            super(2, continuation);
                                            this.$sheetState = modalBottomSheetState;
                                        }

                                        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                                        public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object obj, kotlin.coroutines.Continuation<?> continuation) {
                                            return new androidx.compose.material.ModalBottomSheetKt$ModalBottomSheetLayout$1.AnonymousClass4.AnonymousClass1.C00471(this.$sheetState, continuation);
                                        }

                                        @Override // kotlin.jvm.functions.Function2
                                        public final java.lang.Object invoke(kotlinx.coroutines.CoroutineScope coroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
                                            return ((androidx.compose.material.ModalBottomSheetKt$ModalBottomSheetLayout$1.AnonymousClass4.AnonymousClass1.C00471) create(coroutineScope, continuation)).invokeSuspend(kotlin.Unit.INSTANCE);
                                        }

                                        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                                        public final java.lang.Object invokeSuspend(java.lang.Object obj) {
                                            java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
                                            int i = this.label;
                                            if (i == 0) {
                                                kotlin.ResultKt.throwOnFailure(obj);
                                                this.label = 1;
                                                if (this.$sheetState.hide(this) == coroutine_suspended) {
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
                                if (androidx.compose.material.ModalBottomSheetState.this.getCurrentValue() == androidx.compose.material.ModalBottomSheetValue.HalfExpanded) {
                                    final androidx.compose.material.ModalBottomSheetState modalBottomSheetState10 = androidx.compose.material.ModalBottomSheetState.this;
                                    final kotlinx.coroutines.CoroutineScope coroutineScope5 = coroutineScope3;
                                    androidx.compose.ui.semantics.SemanticsPropertiesKt.expand$default(semantics, null, new kotlin.jvm.functions.Function0<java.lang.Boolean>() { // from class: androidx.compose.material.ModalBottomSheetKt.ModalBottomSheetLayout.1.4.2
                                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                        {
                                            super(0);
                                        }

                                        /* JADX WARN: Can't rename method to resolve collision */
                                        @Override // kotlin.jvm.functions.Function0
                                        public final java.lang.Boolean invoke() {
                                            if (androidx.compose.material.ModalBottomSheetState.this.getConfirmStateChange$material_release().invoke(androidx.compose.material.ModalBottomSheetValue.Expanded).booleanValue()) {
                                                kotlinx.coroutines.BuildersKt__Builders_commonKt.launch$default(coroutineScope5, null, null, new androidx.compose.material.ModalBottomSheetKt$ModalBottomSheetLayout$1.AnonymousClass4.AnonymousClass2.AnonymousClass1(androidx.compose.material.ModalBottomSheetState.this, null), 3, null);
                                            }
                                            return true;
                                        }

                                        /* compiled from: ModalBottomSheet.kt */
                                        @kotlin.Metadata(k = 3, mv = {1, 6, 0}, xi = 48)
                                        @kotlin.coroutines.jvm.internal.DebugMetadata(c = "androidx.compose.material.ModalBottomSheetKt$ModalBottomSheetLayout$1$4$2$1", f = "ModalBottomSheet.kt", i = {}, l = {370}, m = "invokeSuspend", n = {}, s = {})
                                        /* renamed from: androidx.compose.material.ModalBottomSheetKt$ModalBottomSheetLayout$1$4$2$1, reason: invalid class name */
                                        static final class AnonymousClass1 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<kotlinx.coroutines.CoroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> {
                                            final /* synthetic */ androidx.compose.material.ModalBottomSheetState $sheetState;
                                            int label;

                                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                            AnonymousClass1(androidx.compose.material.ModalBottomSheetState modalBottomSheetState, kotlin.coroutines.Continuation<? super androidx.compose.material.ModalBottomSheetKt$ModalBottomSheetLayout$1.AnonymousClass4.AnonymousClass2.AnonymousClass1> continuation) {
                                                super(2, continuation);
                                                this.$sheetState = modalBottomSheetState;
                                            }

                                            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                                            public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object obj, kotlin.coroutines.Continuation<?> continuation) {
                                                return new androidx.compose.material.ModalBottomSheetKt$ModalBottomSheetLayout$1.AnonymousClass4.AnonymousClass2.AnonymousClass1(this.$sheetState, continuation);
                                            }

                                            @Override // kotlin.jvm.functions.Function2
                                            public final java.lang.Object invoke(kotlinx.coroutines.CoroutineScope coroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
                                                return ((androidx.compose.material.ModalBottomSheetKt$ModalBottomSheetLayout$1.AnonymousClass4.AnonymousClass2.AnonymousClass1) create(coroutineScope, continuation)).invokeSuspend(kotlin.Unit.INSTANCE);
                                            }

                                            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                                            public final java.lang.Object invokeSuspend(java.lang.Object obj) {
                                                java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
                                                int i = this.label;
                                                if (i == 0) {
                                                    kotlin.ResultKt.throwOnFailure(obj);
                                                    this.label = 1;
                                                    if (this.$sheetState.expand$material_release(this) == coroutine_suspended) {
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
                                } else if (androidx.compose.material.ModalBottomSheetState.this.getHasHalfExpandedState$material_release()) {
                                    final androidx.compose.material.ModalBottomSheetState modalBottomSheetState11 = androidx.compose.material.ModalBottomSheetState.this;
                                    final kotlinx.coroutines.CoroutineScope coroutineScope6 = coroutineScope3;
                                    androidx.compose.ui.semantics.SemanticsPropertiesKt.collapse$default(semantics, null, new kotlin.jvm.functions.Function0<java.lang.Boolean>() { // from class: androidx.compose.material.ModalBottomSheetKt.ModalBottomSheetLayout.1.4.3
                                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                        {
                                            super(0);
                                        }

                                        /* JADX WARN: Can't rename method to resolve collision */
                                        @Override // kotlin.jvm.functions.Function0
                                        public final java.lang.Boolean invoke() {
                                            if (androidx.compose.material.ModalBottomSheetState.this.getConfirmStateChange$material_release().invoke(androidx.compose.material.ModalBottomSheetValue.HalfExpanded).booleanValue()) {
                                                kotlinx.coroutines.BuildersKt__Builders_commonKt.launch$default(coroutineScope6, null, null, new androidx.compose.material.ModalBottomSheetKt$ModalBottomSheetLayout$1.AnonymousClass4.AnonymousClass3.AnonymousClass1(androidx.compose.material.ModalBottomSheetState.this, null), 3, null);
                                            }
                                            return true;
                                        }

                                        /* compiled from: ModalBottomSheet.kt */
                                        @kotlin.Metadata(k = 3, mv = {1, 6, 0}, xi = 48)
                                        @kotlin.coroutines.jvm.internal.DebugMetadata(c = "androidx.compose.material.ModalBottomSheetKt$ModalBottomSheetLayout$1$4$3$1", f = "ModalBottomSheet.kt", i = {}, l = {377}, m = "invokeSuspend", n = {}, s = {})
                                        /* renamed from: androidx.compose.material.ModalBottomSheetKt$ModalBottomSheetLayout$1$4$3$1, reason: invalid class name */
                                        static final class AnonymousClass1 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<kotlinx.coroutines.CoroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> {
                                            final /* synthetic */ androidx.compose.material.ModalBottomSheetState $sheetState;
                                            int label;

                                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                            AnonymousClass1(androidx.compose.material.ModalBottomSheetState modalBottomSheetState, kotlin.coroutines.Continuation<? super androidx.compose.material.ModalBottomSheetKt$ModalBottomSheetLayout$1.AnonymousClass4.AnonymousClass3.AnonymousClass1> continuation) {
                                                super(2, continuation);
                                                this.$sheetState = modalBottomSheetState;
                                            }

                                            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                                            public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object obj, kotlin.coroutines.Continuation<?> continuation) {
                                                return new androidx.compose.material.ModalBottomSheetKt$ModalBottomSheetLayout$1.AnonymousClass4.AnonymousClass3.AnonymousClass1(this.$sheetState, continuation);
                                            }

                                            @Override // kotlin.jvm.functions.Function2
                                            public final java.lang.Object invoke(kotlinx.coroutines.CoroutineScope coroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
                                                return ((androidx.compose.material.ModalBottomSheetKt$ModalBottomSheetLayout$1.AnonymousClass4.AnonymousClass3.AnonymousClass1) create(coroutineScope, continuation)).invokeSuspend(kotlin.Unit.INSTANCE);
                                            }

                                            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                                            public final java.lang.Object invokeSuspend(java.lang.Object obj) {
                                                java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
                                                int i = this.label;
                                                if (i == 0) {
                                                    kotlin.ResultKt.throwOnFailure(obj);
                                                    this.label = 1;
                                                    if (this.$sheetState.halfExpand$material_release(this) == coroutine_suspended) {
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
                        }
                    }, 1, null);
                    androidx.compose.ui.graphics.Shape shape5 = shape422;
                    long j17 = j1422;
                    long j18 = j1522;
                    float f6 = f522;
                    final kotlin.jvm.functions.Function3<? super androidx.compose.foundation.layout.ColumnScope, ? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.Unit> function3 = sheetContent;
                    final int i14 = i1022;
                    androidx.compose.runtime.internal.ComposableLambda composableLambda = androidx.compose.runtime.internal.ComposableLambdaKt.composableLambda(composer3, -1793508390, true, new kotlin.jvm.functions.Function2<androidx.compose.runtime.Composer, java.lang.Integer, kotlin.Unit>() { // from class: androidx.compose.material.ModalBottomSheetKt$ModalBottomSheetLayout$1.5
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

                        public final void invoke(androidx.compose.runtime.Composer composer4, int i15) {
                            androidx.compose.runtime.ComposerKt.sourceInformation(composer4, "C388@15886L30:ModalBottomSheet.kt#jmzs0o");
                            if ((i15 & 11) == 2 && composer4.getSkipping()) {
                                composer4.skipToGroupEnd();
                                return;
                            }
                            kotlin.jvm.functions.Function3<androidx.compose.foundation.layout.ColumnScope, androidx.compose.runtime.Composer, java.lang.Integer, kotlin.Unit> function32 = function3;
                            int i16 = (i14 << 9) & 7168;
                            composer4.startReplaceableGroup(-483455358);
                            androidx.compose.runtime.ComposerKt.sourceInformation(composer4, "C(Column)P(2,3,1)77@3880L61,78@3946L133:Column.kt#2w3rfo");
                            androidx.compose.ui.Modifier.Companion companion = androidx.compose.ui.Modifier.INSTANCE;
                            androidx.compose.ui.layout.MeasurePolicy columnMeasurePolicy = androidx.compose.foundation.layout.ColumnKt.columnMeasurePolicy(androidx.compose.foundation.layout.Arrangement.INSTANCE.getTop(), androidx.compose.ui.Alignment.INSTANCE.getStart(), composer4, 0);
                            composer4.startReplaceableGroup(-1323940314);
                            androidx.compose.runtime.ComposerKt.sourceInformation(composer4, "C(Layout)P(!1,2)74@2915L7,75@2970L7,76@3029L7,77@3041L460:Layout.kt#80mrfh");
                            androidx.compose.runtime.ProvidableCompositionLocal<androidx.compose.ui.unit.Density> localDensity2 = androidx.compose.ui.platform.CompositionLocalsKt.getLocalDensity();
                            androidx.compose.runtime.ComposerKt.sourceInformationMarkerStart(composer4, 2023513938, "C:CompositionLocal.kt#9igjgp");
                            java.lang.Object consume4 = composer4.consume(localDensity2);
                            androidx.compose.runtime.ComposerKt.sourceInformationMarkerEnd(composer4);
                            androidx.compose.ui.unit.Density density2 = (androidx.compose.ui.unit.Density) consume4;
                            androidx.compose.runtime.ProvidableCompositionLocal<androidx.compose.ui.unit.LayoutDirection> localLayoutDirection2 = androidx.compose.ui.platform.CompositionLocalsKt.getLocalLayoutDirection();
                            androidx.compose.runtime.ComposerKt.sourceInformationMarkerStart(composer4, 2023513938, "C:CompositionLocal.kt#9igjgp");
                            java.lang.Object consume5 = composer4.consume(localLayoutDirection2);
                            androidx.compose.runtime.ComposerKt.sourceInformationMarkerEnd(composer4);
                            androidx.compose.ui.unit.LayoutDirection layoutDirection2 = (androidx.compose.ui.unit.LayoutDirection) consume5;
                            androidx.compose.runtime.ProvidableCompositionLocal<androidx.compose.ui.platform.ViewConfiguration> localViewConfiguration2 = androidx.compose.ui.platform.CompositionLocalsKt.getLocalViewConfiguration();
                            androidx.compose.runtime.ComposerKt.sourceInformationMarkerStart(composer4, 2023513938, "C:CompositionLocal.kt#9igjgp");
                            java.lang.Object consume6 = composer4.consume(localViewConfiguration2);
                            androidx.compose.runtime.ComposerKt.sourceInformationMarkerEnd(composer4);
                            androidx.compose.ui.platform.ViewConfiguration viewConfiguration2 = (androidx.compose.ui.platform.ViewConfiguration) consume6;
                            kotlin.jvm.functions.Function0<androidx.compose.ui.node.ComposeUiNode> constructor2 = androidx.compose.ui.node.ComposeUiNode.INSTANCE.getConstructor();
                            kotlin.jvm.functions.Function3<androidx.compose.runtime.SkippableUpdater<androidx.compose.ui.node.ComposeUiNode>, androidx.compose.runtime.Composer, java.lang.Integer, kotlin.Unit> materializerOf2 = androidx.compose.ui.layout.LayoutKt.materializerOf(companion);
                            if (!(composer4.getApplier() instanceof androidx.compose.runtime.Applier)) {
                                androidx.compose.runtime.ComposablesKt.invalidApplier();
                            }
                            composer4.startReusableNode();
                            if (composer4.getInserting()) {
                                composer4.createNode(constructor2);
                            } else {
                                composer4.useNode();
                            }
                            composer4.disableReusing();
                            androidx.compose.runtime.Composer m1641constructorimpl2 = androidx.compose.runtime.Updater.m1641constructorimpl(composer4);
                            androidx.compose.runtime.Updater.m1648setimpl(m1641constructorimpl2, columnMeasurePolicy, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetMeasurePolicy());
                            androidx.compose.runtime.Updater.m1648setimpl(m1641constructorimpl2, density2, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetDensity());
                            androidx.compose.runtime.Updater.m1648setimpl(m1641constructorimpl2, layoutDirection2, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetLayoutDirection());
                            androidx.compose.runtime.Updater.m1648setimpl(m1641constructorimpl2, viewConfiguration2, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetViewConfiguration());
                            composer4.enableReusing();
                            materializerOf2.invoke(androidx.compose.runtime.SkippableUpdater.m1632boximpl(androidx.compose.runtime.SkippableUpdater.m1633constructorimpl(composer4)), composer4, 0);
                            composer4.startReplaceableGroup(2058660585);
                            composer4.startReplaceableGroup(-1163856341);
                            androidx.compose.runtime.ComposerKt.sourceInformation(composer4, "C79@3994L9:Column.kt#2w3rfo");
                            function32.invoke(androidx.compose.foundation.layout.ColumnScopeInstance.INSTANCE, composer4, java.lang.Integer.valueOf(((i16 >> 6) & 112) | 6));
                            composer4.endReplaceableGroup();
                            composer4.endReplaceableGroup();
                            composer4.endNode();
                            composer4.endReplaceableGroup();
                            composer4.endReplaceableGroup();
                        }
                    });
                    int i15 = i1022;
                    androidx.compose.material.SurfaceKt.m1511SurfaceFjzlyU(semantics$default, shape5, j17, j18, null, f6, composableLambda, composer3, ((i15 >> 6) & 112) | 1572864 | ((i15 >> 9) & 896) | ((i15 >> 9) & 7168) | ((i15 << 3) & 458752), 16);
                    return;
                }
                composer3.skipToGroupEnd();
            }
        }), composer2, ((i5 >> 3) & 14) | 3072, 6);
        modalBottomSheetState2 = modalBottomSheetState4;
        shape3 = shape2;
        modifier3 = modifier2;
        f4 = f3;
        j12 = j9;
        j13 = j10;
        endRestartGroup = composer2.endRestartGroup();
        if (endRestartGroup == null) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final androidx.compose.ui.Modifier bottomSheetSwipeable(androidx.compose.ui.Modifier modifier, androidx.compose.material.ModalBottomSheetState modalBottomSheetState, float f, androidx.compose.runtime.State<java.lang.Float> state) {
        androidx.compose.ui.Modifier.Companion companion;
        java.util.Map mapOf;
        java.lang.Float value = state.getValue();
        if (value == null) {
            companion = androidx.compose.ui.Modifier.INSTANCE;
        } else {
            float f2 = f / 2;
            if (value.floatValue() < f2 || modalBottomSheetState.getIsSkipHalfExpanded()) {
                mapOf = kotlin.collections.MapsKt.mapOf(kotlin.TuplesKt.to(java.lang.Float.valueOf(f), androidx.compose.material.ModalBottomSheetValue.Hidden), kotlin.TuplesKt.to(java.lang.Float.valueOf(f - value.floatValue()), androidx.compose.material.ModalBottomSheetValue.Expanded));
            } else {
                mapOf = kotlin.collections.MapsKt.mapOf(kotlin.TuplesKt.to(java.lang.Float.valueOf(f), androidx.compose.material.ModalBottomSheetValue.Hidden), kotlin.TuplesKt.to(java.lang.Float.valueOf(f2), androidx.compose.material.ModalBottomSheetValue.HalfExpanded), kotlin.TuplesKt.to(java.lang.Float.valueOf(java.lang.Math.max(0.0f, f - value.floatValue())), androidx.compose.material.ModalBottomSheetValue.Expanded));
            }
            companion = androidx.compose.material.SwipeableKt.m1521swipeablepPrIpRY(androidx.compose.ui.Modifier.INSTANCE, modalBottomSheetState, r8, androidx.compose.foundation.gestures.Orientation.Vertical, (r26 & 8) != 0 ? true : modalBottomSheetState.getCurrentValue() != androidx.compose.material.ModalBottomSheetValue.Hidden, (r26 & 16) != 0 ? false : false, (r26 & 32) != 0 ? null : null, (r26 & 64) != 0 ? new kotlin.jvm.functions.Function2<T, T, androidx.compose.material.FixedThreshold>() { // from class: androidx.compose.material.SwipeableKt$swipeable$1
                /* JADX WARN: Can't rename method to resolve collision */
                @Override // kotlin.jvm.functions.Function2
                public final androidx.compose.material.FixedThreshold invoke(T t, T t2) {
                    return new androidx.compose.material.FixedThreshold(androidx.compose.ui.unit.Dp.m4478constructorimpl(56), null);
                }
            } : null, (r26 & 128) != 0 ? androidx.compose.material.SwipeableDefaults.resistanceConfig$default(androidx.compose.material.SwipeableDefaults.INSTANCE, mapOf.keySet(), 0.0f, 0.0f, 6, null) : null, (r26 & 256) != 0 ? androidx.compose.material.SwipeableDefaults.INSTANCE.m1520getVelocityThresholdD9Ej5fM() : 0.0f);
        }
        return modifier.then(companion);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: Scrim-3J-VO9M, reason: not valid java name */
    public static final void m1429Scrim3JVO9M(final long j, final kotlin.jvm.functions.Function0<kotlin.Unit> function0, final boolean z, androidx.compose.runtime.Composer composer, final int i) {
        int i2;
        androidx.compose.ui.Modifier.Companion companion;
        androidx.compose.runtime.Composer startRestartGroup = composer.startRestartGroup(-526532668);
        androidx.compose.runtime.ComposerKt.sourceInformation(startRestartGroup, "C(Scrim)P(0:c#ui.graphics.Color)435@17137L121,439@17284L29,455@17799L62,451@17690L171:ModalBottomSheet.kt#jmzs0o");
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
            final java.lang.String m1509getString4foXLRw = androidx.compose.material.Strings_androidKt.m1509getString4foXLRw(androidx.compose.material.Strings.INSTANCE.m1503getCloseSheetUdPEhr4(), startRestartGroup, 6);
            startRestartGroup.startReplaceableGroup(1010547488);
            androidx.compose.runtime.ComposerKt.sourceInformation(startRestartGroup, "442@17421L37,443@17511L121");
            if (z) {
                androidx.compose.ui.Modifier.Companion companion2 = androidx.compose.ui.Modifier.INSTANCE;
                startRestartGroup.startReplaceableGroup(1157296644);
                androidx.compose.runtime.ComposerKt.sourceInformation(startRestartGroup, "C(remember)P(1):Composables.kt#9igjgp");
                boolean changed = startRestartGroup.changed(function0);
                androidx.compose.material.ModalBottomSheetKt$Scrim$dismissModifier$1$1 rememberedValue = startRestartGroup.rememberedValue();
                if (changed || rememberedValue == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                    rememberedValue = new androidx.compose.material.ModalBottomSheetKt$Scrim$dismissModifier$1$1(function0, null);
                    startRestartGroup.updateRememberedValue(rememberedValue);
                }
                startRestartGroup.endReplaceableGroup();
                androidx.compose.ui.Modifier pointerInput = androidx.compose.ui.input.pointer.SuspendingPointerInputFilterKt.pointerInput(companion2, function0, (kotlin.jvm.functions.Function2<? super androidx.compose.ui.input.pointer.PointerInputScope, ? super kotlin.coroutines.Continuation<? super kotlin.Unit>, ? extends java.lang.Object>) rememberedValue);
                startRestartGroup.startReplaceableGroup(511388516);
                androidx.compose.runtime.ComposerKt.sourceInformation(startRestartGroup, "C(remember)P(1,2):Composables.kt#9igjgp");
                boolean changed2 = startRestartGroup.changed(m1509getString4foXLRw) | startRestartGroup.changed(function0);
                java.lang.Object rememberedValue2 = startRestartGroup.rememberedValue();
                if (changed2 || rememberedValue2 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                    rememberedValue2 = (kotlin.jvm.functions.Function1) new kotlin.jvm.functions.Function1<androidx.compose.ui.semantics.SemanticsPropertyReceiver, kotlin.Unit>() { // from class: androidx.compose.material.ModalBottomSheetKt$Scrim$dismissModifier$2$1
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
                            androidx.compose.ui.semantics.SemanticsPropertiesKt.setContentDescription(semantics, m1509getString4foXLRw);
                            final kotlin.jvm.functions.Function0<kotlin.Unit> function02 = function0;
                            androidx.compose.ui.semantics.SemanticsPropertiesKt.onClick$default(semantics, null, new kotlin.jvm.functions.Function0<java.lang.Boolean>() { // from class: androidx.compose.material.ModalBottomSheetKt$Scrim$dismissModifier$2$1.1
                                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                {
                                    super(0);
                                }

                                /* JADX WARN: Can't rename method to resolve collision */
                                @Override // kotlin.jvm.functions.Function0
                                public final java.lang.Boolean invoke() {
                                    function02.invoke();
                                    return true;
                                }
                            }, 1, null);
                        }
                    };
                    startRestartGroup.updateRememberedValue(rememberedValue2);
                }
                startRestartGroup.endReplaceableGroup();
                companion = androidx.compose.ui.semantics.SemanticsModifierKt.semantics(pointerInput, true, (kotlin.jvm.functions.Function1) rememberedValue2);
            } else {
                companion = androidx.compose.ui.Modifier.INSTANCE;
            }
            startRestartGroup.endReplaceableGroup();
            androidx.compose.ui.Modifier then = androidx.compose.foundation.layout.SizeKt.fillMaxSize$default(androidx.compose.ui.Modifier.INSTANCE, 0.0f, 1, null).then(companion);
            androidx.compose.ui.graphics.Color m2103boximpl = androidx.compose.ui.graphics.Color.m2103boximpl(j);
            startRestartGroup.startReplaceableGroup(511388516);
            androidx.compose.runtime.ComposerKt.sourceInformation(startRestartGroup, "C(remember)P(1,2):Composables.kt#9igjgp");
            boolean changed3 = startRestartGroup.changed(m2103boximpl) | startRestartGroup.changed(animateFloatAsState);
            java.lang.Object rememberedValue3 = startRestartGroup.rememberedValue();
            if (changed3 || rememberedValue3 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                rememberedValue3 = (kotlin.jvm.functions.Function1) new kotlin.jvm.functions.Function1<androidx.compose.ui.graphics.drawscope.DrawScope, kotlin.Unit>() { // from class: androidx.compose.material.ModalBottomSheetKt$Scrim$1$1
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
                        float m1430Scrim_3J_VO9M$lambda0;
                        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(Canvas, "$this$Canvas");
                        long j2 = j;
                        m1430Scrim_3J_VO9M$lambda0 = androidx.compose.material.ModalBottomSheetKt.m1430Scrim_3J_VO9M$lambda0(animateFloatAsState);
                        androidx.compose.ui.graphics.drawscope.DrawScope.CC.m2672drawRectnJ9OG0$default(Canvas, j2, 0L, 0L, m1430Scrim_3J_VO9M$lambda0, null, null, 0, 118, null);
                    }
                };
                startRestartGroup.updateRememberedValue(rememberedValue3);
            }
            startRestartGroup.endReplaceableGroup();
            androidx.compose.foundation.CanvasKt.Canvas(then, (kotlin.jvm.functions.Function1) rememberedValue3, startRestartGroup, 0);
        }
        androidx.compose.runtime.ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup == null) {
            return;
        }
        endRestartGroup.updateScope(new kotlin.jvm.functions.Function2<androidx.compose.runtime.Composer, java.lang.Integer, kotlin.Unit>() { // from class: androidx.compose.material.ModalBottomSheetKt$Scrim$2
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
                androidx.compose.material.ModalBottomSheetKt.m1429Scrim3JVO9M(j, function0, z, composer2, i | 1);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: Scrim_3J_VO9M$lambda-0, reason: not valid java name */
    public static final float m1430Scrim_3J_VO9M$lambda0(androidx.compose.runtime.State<java.lang.Float> state) {
        return state.getValue().floatValue();
    }
}
