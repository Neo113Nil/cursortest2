package androidx.compose.material;

/* compiled from: FloatingActionButton.kt */
@kotlin.Metadata(d1 = {"\u0000@\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\u001a\u0089\u0001\u0010\u0006\u001a\u00020\u00072\u0011\u0010\b\u001a\r\u0012\u0004\u0012\u00020\u00070\t¢\u0006\u0002\b\n2\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00070\t2\b\b\u0002\u0010\f\u001a\u00020\r2\u0015\b\u0002\u0010\u000e\u001a\u000f\u0012\u0004\u0012\u00020\u0007\u0018\u00010\t¢\u0006\u0002\b\n2\b\b\u0002\u0010\u000f\u001a\u00020\u00102\b\b\u0002\u0010\u0011\u001a\u00020\u00122\b\b\u0002\u0010\u0013\u001a\u00020\u00142\b\b\u0002\u0010\u0015\u001a\u00020\u00142\b\b\u0002\u0010\u0016\u001a\u00020\u0017H\u0007ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u0018\u0010\u0019\u001ar\u0010\u001a\u001a\u00020\u00072\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00070\t2\b\b\u0002\u0010\f\u001a\u00020\r2\b\b\u0002\u0010\u000f\u001a\u00020\u00102\b\b\u0002\u0010\u0011\u001a\u00020\u00122\b\b\u0002\u0010\u0013\u001a\u00020\u00142\b\b\u0002\u0010\u0015\u001a\u00020\u00142\b\b\u0002\u0010\u0016\u001a\u00020\u00172\u0011\u0010\u001b\u001a\r\u0012\u0004\u0012\u00020\u00070\t¢\u0006\u0002\b\nH\u0007ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u001c\u0010\u001d\"\u0013\u0010\u0000\u001a\u00020\u0001X\u0082\u0004ø\u0001\u0000¢\u0006\u0004\n\u0002\u0010\u0002\"\u0013\u0010\u0003\u001a\u00020\u0001X\u0082\u0004ø\u0001\u0000¢\u0006\u0004\n\u0002\u0010\u0002\"\u0013\u0010\u0004\u001a\u00020\u0001X\u0082\u0004ø\u0001\u0000¢\u0006\u0004\n\u0002\u0010\u0002\"\u0013\u0010\u0005\u001a\u00020\u0001X\u0082\u0004ø\u0001\u0000¢\u0006\u0004\n\u0002\u0010\u0002\u0082\u0002\u000b\n\u0002\b\u0019\n\u0005\b¡\u001e0\u0001¨\u0006\u001e"}, d2 = {"ExtendedFabIconPadding", "Landroidx/compose/ui/unit/Dp;", "F", "ExtendedFabSize", "ExtendedFabTextPadding", "FabSize", "ExtendedFloatingActionButton", "", "text", "Lkotlin/Function0;", "Landroidx/compose/runtime/Composable;", "onClick", "modifier", "Landroidx/compose/ui/Modifier;", "icon", "interactionSource", "Landroidx/compose/foundation/interaction/MutableInteractionSource;", "shape", "Landroidx/compose/ui/graphics/Shape;", "backgroundColor", "Landroidx/compose/ui/graphics/Color;", "contentColor", "elevation", "Landroidx/compose/material/FloatingActionButtonElevation;", "ExtendedFloatingActionButton-wqdebIU", "(Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function0;Landroidx/compose/ui/Modifier;Lkotlin/jvm/functions/Function2;Landroidx/compose/foundation/interaction/MutableInteractionSource;Landroidx/compose/ui/graphics/Shape;JJLandroidx/compose/material/FloatingActionButtonElevation;Landroidx/compose/runtime/Composer;II)V", "FloatingActionButton", "content", "FloatingActionButton-bogVsAg", "(Lkotlin/jvm/functions/Function0;Landroidx/compose/ui/Modifier;Landroidx/compose/foundation/interaction/MutableInteractionSource;Landroidx/compose/ui/graphics/Shape;JJLandroidx/compose/material/FloatingActionButtonElevation;Lkotlin/jvm/functions/Function2;Landroidx/compose/runtime/Composer;II)V", "material_release"}, k = 2, mv = {1, 6, 0}, xi = 48)
/* loaded from: classes.dex */
public final class FloatingActionButtonKt {
    private static final float FabSize = androidx.compose.ui.unit.Dp.m4478constructorimpl(56);
    private static final float ExtendedFabSize = androidx.compose.ui.unit.Dp.m4478constructorimpl(48);
    private static final float ExtendedFabIconPadding = androidx.compose.ui.unit.Dp.m4478constructorimpl(12);
    private static final float ExtendedFabTextPadding = androidx.compose.ui.unit.Dp.m4478constructorimpl(20);

    /* JADX WARN: Removed duplicated region for block: B:100:0x01a8  */
    /* JADX WARN: Removed duplicated region for block: B:101:0x0188  */
    /* JADX WARN: Removed duplicated region for block: B:102:0x0160  */
    /* JADX WARN: Removed duplicated region for block: B:103:0x00ea  */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0057  */
    /* JADX WARN: Removed duplicated region for block: B:110:0x00e0  */
    /* JADX WARN: Removed duplicated region for block: B:113:0x00c4  */
    /* JADX WARN: Removed duplicated region for block: B:116:0x00a6  */
    /* JADX WARN: Removed duplicated region for block: B:119:0x0088  */
    /* JADX WARN: Removed duplicated region for block: B:120:0x005a  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0073  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0091  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x00ae  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00cc  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x00e6  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x0104  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x0282  */
    /* JADX WARN: Removed duplicated region for block: B:58:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:61:0x012d  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x015b  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x0164  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x018f  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x01ad  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x01bf  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x01cf  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x01ca  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x01ba  */
    /* renamed from: FloatingActionButton-bogVsAg, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void m1410FloatingActionButtonbogVsAg(final kotlin.jvm.functions.Function0<kotlin.Unit> onClick, androidx.compose.ui.Modifier modifier, androidx.compose.foundation.interaction.MutableInteractionSource mutableInteractionSource, androidx.compose.ui.graphics.Shape shape, long j, long j2, androidx.compose.material.FloatingActionButtonElevation floatingActionButtonElevation, final kotlin.jvm.functions.Function2<? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.Unit> content, androidx.compose.runtime.Composer composer, final int i, final int i2) {
        final int i3;
        int i4;
        androidx.compose.ui.graphics.Shape shape2;
        long j3;
        final long j4;
        androidx.compose.material.FloatingActionButtonElevation floatingActionButtonElevation2;
        androidx.compose.foundation.interaction.MutableInteractionSource mutableInteractionSource2;
        androidx.compose.foundation.shape.CornerBasedShape cornerBasedShape;
        long j5;
        long j6;
        androidx.compose.ui.Modifier modifier2;
        androidx.compose.foundation.interaction.MutableInteractionSource mutableInteractionSource3;
        androidx.compose.ui.graphics.Shape shape3;
        long j7;
        androidx.compose.runtime.Composer composer2;
        final androidx.compose.ui.Modifier modifier3;
        final androidx.compose.foundation.interaction.MutableInteractionSource mutableInteractionSource4;
        final androidx.compose.ui.graphics.Shape shape4;
        final long j8;
        final androidx.compose.material.FloatingActionButtonElevation floatingActionButtonElevation3;
        final long j9;
        androidx.compose.runtime.ScopeUpdateScope endRestartGroup;
        int i5;
        int i6;
        int i7;
        int i8;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(onClick, "onClick");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(content, "content");
        androidx.compose.runtime.Composer startRestartGroup = composer.startRestartGroup(1028985328);
        androidx.compose.runtime.ComposerKt.sourceInformation(startRestartGroup, "C(FloatingActionButton)P(6,5,4,7,0:c#ui.graphics.Color,2:c#ui.graphics.Color,3)81@3832L39,82@3906L6,83@3994L6,84@4038L32,85@4148L11,94@4393L28,88@4205L685:FloatingActionButton.kt#jmzs0o");
        if ((i2 & 1) != 0) {
            i3 = i | 6;
        } else if ((i & 14) == 0) {
            i3 = (startRestartGroup.changed(onClick) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        int i9 = i2 & 2;
        if (i9 != 0) {
            i3 |= 48;
        } else if ((i & 112) == 0) {
            i3 |= startRestartGroup.changed(modifier) ? 32 : 16;
            i4 = i2 & 4;
            if (i4 == 0) {
                i3 |= 384;
            } else if ((i & 896) == 0) {
                i3 |= startRestartGroup.changed(mutableInteractionSource) ? 256 : 128;
                if ((i & 7168) == 0) {
                    if ((i2 & 8) == 0) {
                        shape2 = shape;
                        if (startRestartGroup.changed(shape2)) {
                            i8 = 2048;
                            i3 |= i8;
                        }
                    } else {
                        shape2 = shape;
                    }
                    i8 = 1024;
                    i3 |= i8;
                } else {
                    shape2 = shape;
                }
                if ((i & 57344) == 0) {
                    if ((i2 & 16) == 0) {
                        j3 = j;
                        if (startRestartGroup.changed(j3)) {
                            i7 = 16384;
                            i3 |= i7;
                        }
                    } else {
                        j3 = j;
                    }
                    i7 = 8192;
                    i3 |= i7;
                } else {
                    j3 = j;
                }
                if ((i & 458752) == 0) {
                    if ((i2 & 32) == 0) {
                        j4 = j2;
                        if (startRestartGroup.changed(j4)) {
                            i6 = 131072;
                            i3 |= i6;
                        }
                    } else {
                        j4 = j2;
                    }
                    i6 = 65536;
                    i3 |= i6;
                } else {
                    j4 = j2;
                }
                if ((i & 3670016) == 0) {
                    floatingActionButtonElevation2 = floatingActionButtonElevation;
                    i3 |= ((i2 & 64) == 0 && startRestartGroup.changed(floatingActionButtonElevation2)) ? 1048576 : 524288;
                } else {
                    floatingActionButtonElevation2 = floatingActionButtonElevation;
                }
                if ((i2 & 128) == 0) {
                    i5 = (29360128 & i) == 0 ? startRestartGroup.changed(content) ? 8388608 : 4194304 : 12582912;
                    if ((23967451 & i3) == 4793490 || !startRestartGroup.getSkipping()) {
                        startRestartGroup.startDefaults();
                        if ((i & 1) != 0 || startRestartGroup.getDefaultsInvalid()) {
                            androidx.compose.ui.Modifier.Companion companion = i9 == 0 ? androidx.compose.ui.Modifier.INSTANCE : modifier;
                            if (i4 == 0) {
                                startRestartGroup.startReplaceableGroup(-492369756);
                                androidx.compose.runtime.ComposerKt.sourceInformation(startRestartGroup, "C(remember):Composables.kt#9igjgp");
                                java.lang.Object rememberedValue = startRestartGroup.rememberedValue();
                                if (rememberedValue == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                                    rememberedValue = androidx.compose.foundation.interaction.InteractionSourceKt.MutableInteractionSource();
                                    startRestartGroup.updateRememberedValue(rememberedValue);
                                }
                                startRestartGroup.endReplaceableGroup();
                                mutableInteractionSource2 = (androidx.compose.foundation.interaction.MutableInteractionSource) rememberedValue;
                            } else {
                                mutableInteractionSource2 = mutableInteractionSource;
                            }
                            if ((i2 & 8) == 0) {
                                cornerBasedShape = androidx.compose.material.MaterialTheme.INSTANCE.getShapes(startRestartGroup, 6).getSmall().copy(androidx.compose.foundation.shape.CornerSizeKt.CornerSize(50));
                                i3 &= -7169;
                            } else {
                                cornerBasedShape = shape2;
                            }
                            if ((i2 & 16) == 0) {
                                j5 = androidx.compose.material.MaterialTheme.INSTANCE.getColors(startRestartGroup, 6).m1317getSecondary0d7_KjU();
                                i3 &= -57345;
                            } else {
                                j5 = j3;
                            }
                            if ((i2 & 32) == 0) {
                                j6 = androidx.compose.material.ColorsKt.m1333contentColorForek8zF_U(j5, startRestartGroup, (i3 >> 12) & 14);
                                i3 &= -458753;
                            } else {
                                j6 = j4;
                            }
                            if ((i2 & 64) != 0) {
                                floatingActionButtonElevation2 = androidx.compose.material.FloatingActionButtonDefaults.INSTANCE.m1408elevationxZ9QkE(0.0f, 0.0f, 0.0f, 0.0f, startRestartGroup, 24576, 15);
                                i3 &= -3670017;
                            }
                            modifier2 = companion;
                            mutableInteractionSource3 = mutableInteractionSource2;
                            shape3 = cornerBasedShape;
                            j7 = j5;
                            j4 = j6;
                        } else {
                            startRestartGroup.skipToGroupEnd();
                            if ((i2 & 8) != 0) {
                                i3 &= -7169;
                            }
                            if ((i2 & 16) != 0) {
                                i3 &= -57345;
                            }
                            if ((i2 & 32) != 0) {
                                i3 &= -458753;
                            }
                            if ((i2 & 64) != 0) {
                                i3 &= -3670017;
                            }
                            modifier2 = modifier;
                            mutableInteractionSource3 = mutableInteractionSource;
                            shape3 = shape2;
                            j7 = j3;
                        }
                        androidx.compose.material.FloatingActionButtonElevation floatingActionButtonElevation4 = floatingActionButtonElevation2;
                        startRestartGroup.endDefaults();
                        long j10 = j4;
                        composer2 = startRestartGroup;
                        androidx.compose.material.SurfaceKt.m1512SurfaceLPr_se0(onClick, modifier2, false, shape3, j7, j4, null, floatingActionButtonElevation4.elevation(mutableInteractionSource3, startRestartGroup, ((i3 >> 6) & 14) | ((i3 >> 15) & 112)).getValue().m4492unboximpl(), mutableInteractionSource3, androidx.compose.runtime.internal.ComposableLambdaKt.composableLambda(startRestartGroup, 1972871863, true, new kotlin.jvm.functions.Function2<androidx.compose.runtime.Composer, java.lang.Integer, kotlin.Unit>() { // from class: androidx.compose.material.FloatingActionButtonKt$FloatingActionButton$2
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
                                androidx.compose.runtime.ComposerKt.sourceInformation(composer3, "C97@4492L392:FloatingActionButton.kt#jmzs0o");
                                if ((i10 & 11) == 2 && composer3.getSkipping()) {
                                    composer3.skipToGroupEnd();
                                    return;
                                }
                                androidx.compose.runtime.ProvidedValue[] providedValueArr = {androidx.compose.material.ContentAlphaKt.getLocalContentAlpha().provides(java.lang.Float.valueOf(androidx.compose.ui.graphics.Color.m2115getAlphaimpl(j4)))};
                                final kotlin.jvm.functions.Function2<androidx.compose.runtime.Composer, java.lang.Integer, kotlin.Unit> function2 = content;
                                final int i11 = i3;
                                androidx.compose.runtime.CompositionLocalKt.CompositionLocalProvider((androidx.compose.runtime.ProvidedValue<?>[]) providedValueArr, androidx.compose.runtime.internal.ComposableLambdaKt.composableLambda(composer3, 1867794295, true, new kotlin.jvm.functions.Function2<androidx.compose.runtime.Composer, java.lang.Integer, kotlin.Unit>() { // from class: androidx.compose.material.FloatingActionButtonKt$FloatingActionButton$2.1
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

                                    public final void invoke(androidx.compose.runtime.Composer composer4, int i12) {
                                        androidx.compose.runtime.ComposerKt.sourceInformation(composer4, "C98@4609L10,98@4578L296:FloatingActionButton.kt#jmzs0o");
                                        if ((i12 & 11) != 2 || !composer4.getSkipping()) {
                                            androidx.compose.ui.text.TextStyle button = androidx.compose.material.MaterialTheme.INSTANCE.getTypography(composer4, 6).getButton();
                                            final kotlin.jvm.functions.Function2<androidx.compose.runtime.Composer, java.lang.Integer, kotlin.Unit> function22 = function2;
                                            final int i13 = i11;
                                            androidx.compose.material.TextKt.ProvideTextStyle(button, androidx.compose.runtime.internal.ComposableLambdaKt.composableLambda(composer4, -1567914264, true, new kotlin.jvm.functions.Function2<androidx.compose.runtime.Composer, java.lang.Integer, kotlin.Unit>() { // from class: androidx.compose.material.FloatingActionButtonKt.FloatingActionButton.2.1.1
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

                                                public final void invoke(androidx.compose.runtime.Composer composer5, int i14) {
                                                    float f;
                                                    float f2;
                                                    androidx.compose.runtime.ComposerKt.sourceInformation(composer5, "C99@4646L214:FloatingActionButton.kt#jmzs0o");
                                                    if ((i14 & 11) != 2 || !composer5.getSkipping()) {
                                                        androidx.compose.ui.Modifier.Companion companion2 = androidx.compose.ui.Modifier.INSTANCE;
                                                        f = androidx.compose.material.FloatingActionButtonKt.FabSize;
                                                        f2 = androidx.compose.material.FloatingActionButtonKt.FabSize;
                                                        androidx.compose.ui.Modifier m601defaultMinSizeVpY3zN4 = androidx.compose.foundation.layout.SizeKt.m601defaultMinSizeVpY3zN4(companion2, f, f2);
                                                        androidx.compose.ui.Alignment center = androidx.compose.ui.Alignment.INSTANCE.getCenter();
                                                        kotlin.jvm.functions.Function2<androidx.compose.runtime.Composer, java.lang.Integer, kotlin.Unit> function23 = function22;
                                                        int i15 = i13;
                                                        composer5.startReplaceableGroup(733328855);
                                                        androidx.compose.runtime.ComposerKt.sourceInformation(composer5, "C(Box)P(2,1,3)70@3267L67,71@3339L130:Box.kt#2w3rfo");
                                                        androidx.compose.ui.layout.MeasurePolicy rememberBoxMeasurePolicy = androidx.compose.foundation.layout.BoxKt.rememberBoxMeasurePolicy(center, false, composer5, 6);
                                                        composer5.startReplaceableGroup(-1323940314);
                                                        androidx.compose.runtime.ComposerKt.sourceInformation(composer5, "C(Layout)P(!1,2)74@2915L7,75@2970L7,76@3029L7,77@3041L460:Layout.kt#80mrfh");
                                                        androidx.compose.runtime.ProvidableCompositionLocal<androidx.compose.ui.unit.Density> localDensity = androidx.compose.ui.platform.CompositionLocalsKt.getLocalDensity();
                                                        androidx.compose.runtime.ComposerKt.sourceInformationMarkerStart(composer5, 2023513938, "C:CompositionLocal.kt#9igjgp");
                                                        java.lang.Object consume = composer5.consume(localDensity);
                                                        androidx.compose.runtime.ComposerKt.sourceInformationMarkerEnd(composer5);
                                                        androidx.compose.ui.unit.Density density = (androidx.compose.ui.unit.Density) consume;
                                                        androidx.compose.runtime.ProvidableCompositionLocal<androidx.compose.ui.unit.LayoutDirection> localLayoutDirection = androidx.compose.ui.platform.CompositionLocalsKt.getLocalLayoutDirection();
                                                        androidx.compose.runtime.ComposerKt.sourceInformationMarkerStart(composer5, 2023513938, "C:CompositionLocal.kt#9igjgp");
                                                        java.lang.Object consume2 = composer5.consume(localLayoutDirection);
                                                        androidx.compose.runtime.ComposerKt.sourceInformationMarkerEnd(composer5);
                                                        androidx.compose.ui.unit.LayoutDirection layoutDirection = (androidx.compose.ui.unit.LayoutDirection) consume2;
                                                        androidx.compose.runtime.ProvidableCompositionLocal<androidx.compose.ui.platform.ViewConfiguration> localViewConfiguration = androidx.compose.ui.platform.CompositionLocalsKt.getLocalViewConfiguration();
                                                        androidx.compose.runtime.ComposerKt.sourceInformationMarkerStart(composer5, 2023513938, "C:CompositionLocal.kt#9igjgp");
                                                        java.lang.Object consume3 = composer5.consume(localViewConfiguration);
                                                        androidx.compose.runtime.ComposerKt.sourceInformationMarkerEnd(composer5);
                                                        androidx.compose.ui.platform.ViewConfiguration viewConfiguration = (androidx.compose.ui.platform.ViewConfiguration) consume3;
                                                        kotlin.jvm.functions.Function0<androidx.compose.ui.node.ComposeUiNode> constructor = androidx.compose.ui.node.ComposeUiNode.INSTANCE.getConstructor();
                                                        kotlin.jvm.functions.Function3<androidx.compose.runtime.SkippableUpdater<androidx.compose.ui.node.ComposeUiNode>, androidx.compose.runtime.Composer, java.lang.Integer, kotlin.Unit> materializerOf = androidx.compose.ui.layout.LayoutKt.materializerOf(m601defaultMinSizeVpY3zN4);
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
                                                        composer5.startReplaceableGroup(-1049034642);
                                                        androidx.compose.runtime.ComposerKt.sourceInformation(composer5, "C103@4849L9:FloatingActionButton.kt#jmzs0o");
                                                        function23.invoke(composer5, java.lang.Integer.valueOf((i15 >> 21) & 14));
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
                                            }), composer4, 48);
                                            return;
                                        }
                                        composer4.skipToGroupEnd();
                                    }
                                }), composer3, 56);
                            }
                        }), composer2, (i3 & 14) | 805306368 | (i3 & 112) | (i3 & 7168) | (57344 & i3) | (458752 & i3) | ((i3 << 18) & 234881024), 68);
                        modifier3 = modifier2;
                        mutableInteractionSource4 = mutableInteractionSource3;
                        shape4 = shape3;
                        j8 = j7;
                        floatingActionButtonElevation3 = floatingActionButtonElevation4;
                        j9 = j10;
                    } else {
                        startRestartGroup.skipToGroupEnd();
                        modifier3 = modifier;
                        mutableInteractionSource4 = mutableInteractionSource;
                        shape4 = shape2;
                        composer2 = startRestartGroup;
                        long j11 = j4;
                        floatingActionButtonElevation3 = floatingActionButtonElevation2;
                        j8 = j3;
                        j9 = j11;
                    }
                    endRestartGroup = composer2.endRestartGroup();
                    if (endRestartGroup != null) {
                        return;
                    }
                    endRestartGroup.updateScope(new kotlin.jvm.functions.Function2<androidx.compose.runtime.Composer, java.lang.Integer, kotlin.Unit>() { // from class: androidx.compose.material.FloatingActionButtonKt$FloatingActionButton$3
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
                            androidx.compose.material.FloatingActionButtonKt.m1410FloatingActionButtonbogVsAg(onClick, modifier3, mutableInteractionSource4, shape4, j8, j9, floatingActionButtonElevation3, content, composer3, i | 1, i2);
                        }
                    });
                    return;
                }
                i3 |= i5;
                if ((23967451 & i3) == 4793490) {
                }
                startRestartGroup.startDefaults();
                if ((i & 1) != 0) {
                }
                if (i9 == 0) {
                }
                if (i4 == 0) {
                }
                if ((i2 & 8) == 0) {
                }
                if ((i2 & 16) == 0) {
                }
                if ((i2 & 32) == 0) {
                }
                if ((i2 & 64) != 0) {
                }
                modifier2 = companion;
                mutableInteractionSource3 = mutableInteractionSource2;
                shape3 = cornerBasedShape;
                j7 = j5;
                j4 = j6;
                androidx.compose.material.FloatingActionButtonElevation floatingActionButtonElevation42 = floatingActionButtonElevation2;
                startRestartGroup.endDefaults();
                long j102 = j4;
                composer2 = startRestartGroup;
                androidx.compose.material.SurfaceKt.m1512SurfaceLPr_se0(onClick, modifier2, false, shape3, j7, j4, null, floatingActionButtonElevation42.elevation(mutableInteractionSource3, startRestartGroup, ((i3 >> 6) & 14) | ((i3 >> 15) & 112)).getValue().m4492unboximpl(), mutableInteractionSource3, androidx.compose.runtime.internal.ComposableLambdaKt.composableLambda(startRestartGroup, 1972871863, true, new kotlin.jvm.functions.Function2<androidx.compose.runtime.Composer, java.lang.Integer, kotlin.Unit>() { // from class: androidx.compose.material.FloatingActionButtonKt$FloatingActionButton$2
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
                        androidx.compose.runtime.ComposerKt.sourceInformation(composer3, "C97@4492L392:FloatingActionButton.kt#jmzs0o");
                        if ((i10 & 11) == 2 && composer3.getSkipping()) {
                            composer3.skipToGroupEnd();
                            return;
                        }
                        androidx.compose.runtime.ProvidedValue[] providedValueArr = {androidx.compose.material.ContentAlphaKt.getLocalContentAlpha().provides(java.lang.Float.valueOf(androidx.compose.ui.graphics.Color.m2115getAlphaimpl(j4)))};
                        final kotlin.jvm.functions.Function2<? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.Unit> function2 = content;
                        final int i11 = i3;
                        androidx.compose.runtime.CompositionLocalKt.CompositionLocalProvider((androidx.compose.runtime.ProvidedValue<?>[]) providedValueArr, androidx.compose.runtime.internal.ComposableLambdaKt.composableLambda(composer3, 1867794295, true, new kotlin.jvm.functions.Function2<androidx.compose.runtime.Composer, java.lang.Integer, kotlin.Unit>() { // from class: androidx.compose.material.FloatingActionButtonKt$FloatingActionButton$2.1
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

                            public final void invoke(androidx.compose.runtime.Composer composer4, int i12) {
                                androidx.compose.runtime.ComposerKt.sourceInformation(composer4, "C98@4609L10,98@4578L296:FloatingActionButton.kt#jmzs0o");
                                if ((i12 & 11) != 2 || !composer4.getSkipping()) {
                                    androidx.compose.ui.text.TextStyle button = androidx.compose.material.MaterialTheme.INSTANCE.getTypography(composer4, 6).getButton();
                                    final kotlin.jvm.functions.Function2<? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.Unit> function22 = function2;
                                    final int i13 = i11;
                                    androidx.compose.material.TextKt.ProvideTextStyle(button, androidx.compose.runtime.internal.ComposableLambdaKt.composableLambda(composer4, -1567914264, true, new kotlin.jvm.functions.Function2<androidx.compose.runtime.Composer, java.lang.Integer, kotlin.Unit>() { // from class: androidx.compose.material.FloatingActionButtonKt.FloatingActionButton.2.1.1
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

                                        public final void invoke(androidx.compose.runtime.Composer composer5, int i14) {
                                            float f;
                                            float f2;
                                            androidx.compose.runtime.ComposerKt.sourceInformation(composer5, "C99@4646L214:FloatingActionButton.kt#jmzs0o");
                                            if ((i14 & 11) != 2 || !composer5.getSkipping()) {
                                                androidx.compose.ui.Modifier.Companion companion2 = androidx.compose.ui.Modifier.INSTANCE;
                                                f = androidx.compose.material.FloatingActionButtonKt.FabSize;
                                                f2 = androidx.compose.material.FloatingActionButtonKt.FabSize;
                                                androidx.compose.ui.Modifier m601defaultMinSizeVpY3zN4 = androidx.compose.foundation.layout.SizeKt.m601defaultMinSizeVpY3zN4(companion2, f, f2);
                                                androidx.compose.ui.Alignment center = androidx.compose.ui.Alignment.INSTANCE.getCenter();
                                                kotlin.jvm.functions.Function2<androidx.compose.runtime.Composer, java.lang.Integer, kotlin.Unit> function23 = function22;
                                                int i15 = i13;
                                                composer5.startReplaceableGroup(733328855);
                                                androidx.compose.runtime.ComposerKt.sourceInformation(composer5, "C(Box)P(2,1,3)70@3267L67,71@3339L130:Box.kt#2w3rfo");
                                                androidx.compose.ui.layout.MeasurePolicy rememberBoxMeasurePolicy = androidx.compose.foundation.layout.BoxKt.rememberBoxMeasurePolicy(center, false, composer5, 6);
                                                composer5.startReplaceableGroup(-1323940314);
                                                androidx.compose.runtime.ComposerKt.sourceInformation(composer5, "C(Layout)P(!1,2)74@2915L7,75@2970L7,76@3029L7,77@3041L460:Layout.kt#80mrfh");
                                                androidx.compose.runtime.ProvidableCompositionLocal<androidx.compose.ui.unit.Density> localDensity = androidx.compose.ui.platform.CompositionLocalsKt.getLocalDensity();
                                                androidx.compose.runtime.ComposerKt.sourceInformationMarkerStart(composer5, 2023513938, "C:CompositionLocal.kt#9igjgp");
                                                java.lang.Object consume = composer5.consume(localDensity);
                                                androidx.compose.runtime.ComposerKt.sourceInformationMarkerEnd(composer5);
                                                androidx.compose.ui.unit.Density density = (androidx.compose.ui.unit.Density) consume;
                                                androidx.compose.runtime.ProvidableCompositionLocal<androidx.compose.ui.unit.LayoutDirection> localLayoutDirection = androidx.compose.ui.platform.CompositionLocalsKt.getLocalLayoutDirection();
                                                androidx.compose.runtime.ComposerKt.sourceInformationMarkerStart(composer5, 2023513938, "C:CompositionLocal.kt#9igjgp");
                                                java.lang.Object consume2 = composer5.consume(localLayoutDirection);
                                                androidx.compose.runtime.ComposerKt.sourceInformationMarkerEnd(composer5);
                                                androidx.compose.ui.unit.LayoutDirection layoutDirection = (androidx.compose.ui.unit.LayoutDirection) consume2;
                                                androidx.compose.runtime.ProvidableCompositionLocal<androidx.compose.ui.platform.ViewConfiguration> localViewConfiguration = androidx.compose.ui.platform.CompositionLocalsKt.getLocalViewConfiguration();
                                                androidx.compose.runtime.ComposerKt.sourceInformationMarkerStart(composer5, 2023513938, "C:CompositionLocal.kt#9igjgp");
                                                java.lang.Object consume3 = composer5.consume(localViewConfiguration);
                                                androidx.compose.runtime.ComposerKt.sourceInformationMarkerEnd(composer5);
                                                androidx.compose.ui.platform.ViewConfiguration viewConfiguration = (androidx.compose.ui.platform.ViewConfiguration) consume3;
                                                kotlin.jvm.functions.Function0<androidx.compose.ui.node.ComposeUiNode> constructor = androidx.compose.ui.node.ComposeUiNode.INSTANCE.getConstructor();
                                                kotlin.jvm.functions.Function3<androidx.compose.runtime.SkippableUpdater<androidx.compose.ui.node.ComposeUiNode>, androidx.compose.runtime.Composer, java.lang.Integer, kotlin.Unit> materializerOf = androidx.compose.ui.layout.LayoutKt.materializerOf(m601defaultMinSizeVpY3zN4);
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
                                                composer5.startReplaceableGroup(-1049034642);
                                                androidx.compose.runtime.ComposerKt.sourceInformation(composer5, "C103@4849L9:FloatingActionButton.kt#jmzs0o");
                                                function23.invoke(composer5, java.lang.Integer.valueOf((i15 >> 21) & 14));
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
                                    }), composer4, 48);
                                    return;
                                }
                                composer4.skipToGroupEnd();
                            }
                        }), composer3, 56);
                    }
                }), composer2, (i3 & 14) | 805306368 | (i3 & 112) | (i3 & 7168) | (57344 & i3) | (458752 & i3) | ((i3 << 18) & 234881024), 68);
                modifier3 = modifier2;
                mutableInteractionSource4 = mutableInteractionSource3;
                shape4 = shape3;
                j8 = j7;
                floatingActionButtonElevation3 = floatingActionButtonElevation42;
                j9 = j102;
                endRestartGroup = composer2.endRestartGroup();
                if (endRestartGroup != null) {
                }
            }
            if ((i & 7168) == 0) {
            }
            if ((i & 57344) == 0) {
            }
            if ((i & 458752) == 0) {
            }
            if ((i & 3670016) == 0) {
            }
            if ((i2 & 128) == 0) {
            }
            i3 |= i5;
            if ((23967451 & i3) == 4793490) {
            }
            startRestartGroup.startDefaults();
            if ((i & 1) != 0) {
            }
            if (i9 == 0) {
            }
            if (i4 == 0) {
            }
            if ((i2 & 8) == 0) {
            }
            if ((i2 & 16) == 0) {
            }
            if ((i2 & 32) == 0) {
            }
            if ((i2 & 64) != 0) {
            }
            modifier2 = companion;
            mutableInteractionSource3 = mutableInteractionSource2;
            shape3 = cornerBasedShape;
            j7 = j5;
            j4 = j6;
            androidx.compose.material.FloatingActionButtonElevation floatingActionButtonElevation422 = floatingActionButtonElevation2;
            startRestartGroup.endDefaults();
            long j1022 = j4;
            composer2 = startRestartGroup;
            androidx.compose.material.SurfaceKt.m1512SurfaceLPr_se0(onClick, modifier2, false, shape3, j7, j4, null, floatingActionButtonElevation422.elevation(mutableInteractionSource3, startRestartGroup, ((i3 >> 6) & 14) | ((i3 >> 15) & 112)).getValue().m4492unboximpl(), mutableInteractionSource3, androidx.compose.runtime.internal.ComposableLambdaKt.composableLambda(startRestartGroup, 1972871863, true, new kotlin.jvm.functions.Function2<androidx.compose.runtime.Composer, java.lang.Integer, kotlin.Unit>() { // from class: androidx.compose.material.FloatingActionButtonKt$FloatingActionButton$2
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
                    androidx.compose.runtime.ComposerKt.sourceInformation(composer3, "C97@4492L392:FloatingActionButton.kt#jmzs0o");
                    if ((i10 & 11) == 2 && composer3.getSkipping()) {
                        composer3.skipToGroupEnd();
                        return;
                    }
                    androidx.compose.runtime.ProvidedValue[] providedValueArr = {androidx.compose.material.ContentAlphaKt.getLocalContentAlpha().provides(java.lang.Float.valueOf(androidx.compose.ui.graphics.Color.m2115getAlphaimpl(j4)))};
                    final kotlin.jvm.functions.Function2<? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.Unit> function2 = content;
                    final int i11 = i3;
                    androidx.compose.runtime.CompositionLocalKt.CompositionLocalProvider((androidx.compose.runtime.ProvidedValue<?>[]) providedValueArr, androidx.compose.runtime.internal.ComposableLambdaKt.composableLambda(composer3, 1867794295, true, new kotlin.jvm.functions.Function2<androidx.compose.runtime.Composer, java.lang.Integer, kotlin.Unit>() { // from class: androidx.compose.material.FloatingActionButtonKt$FloatingActionButton$2.1
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

                        public final void invoke(androidx.compose.runtime.Composer composer4, int i12) {
                            androidx.compose.runtime.ComposerKt.sourceInformation(composer4, "C98@4609L10,98@4578L296:FloatingActionButton.kt#jmzs0o");
                            if ((i12 & 11) != 2 || !composer4.getSkipping()) {
                                androidx.compose.ui.text.TextStyle button = androidx.compose.material.MaterialTheme.INSTANCE.getTypography(composer4, 6).getButton();
                                final kotlin.jvm.functions.Function2<? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.Unit> function22 = function2;
                                final int i13 = i11;
                                androidx.compose.material.TextKt.ProvideTextStyle(button, androidx.compose.runtime.internal.ComposableLambdaKt.composableLambda(composer4, -1567914264, true, new kotlin.jvm.functions.Function2<androidx.compose.runtime.Composer, java.lang.Integer, kotlin.Unit>() { // from class: androidx.compose.material.FloatingActionButtonKt.FloatingActionButton.2.1.1
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

                                    public final void invoke(androidx.compose.runtime.Composer composer5, int i14) {
                                        float f;
                                        float f2;
                                        androidx.compose.runtime.ComposerKt.sourceInformation(composer5, "C99@4646L214:FloatingActionButton.kt#jmzs0o");
                                        if ((i14 & 11) != 2 || !composer5.getSkipping()) {
                                            androidx.compose.ui.Modifier.Companion companion2 = androidx.compose.ui.Modifier.INSTANCE;
                                            f = androidx.compose.material.FloatingActionButtonKt.FabSize;
                                            f2 = androidx.compose.material.FloatingActionButtonKt.FabSize;
                                            androidx.compose.ui.Modifier m601defaultMinSizeVpY3zN4 = androidx.compose.foundation.layout.SizeKt.m601defaultMinSizeVpY3zN4(companion2, f, f2);
                                            androidx.compose.ui.Alignment center = androidx.compose.ui.Alignment.INSTANCE.getCenter();
                                            kotlin.jvm.functions.Function2<androidx.compose.runtime.Composer, java.lang.Integer, kotlin.Unit> function23 = function22;
                                            int i15 = i13;
                                            composer5.startReplaceableGroup(733328855);
                                            androidx.compose.runtime.ComposerKt.sourceInformation(composer5, "C(Box)P(2,1,3)70@3267L67,71@3339L130:Box.kt#2w3rfo");
                                            androidx.compose.ui.layout.MeasurePolicy rememberBoxMeasurePolicy = androidx.compose.foundation.layout.BoxKt.rememberBoxMeasurePolicy(center, false, composer5, 6);
                                            composer5.startReplaceableGroup(-1323940314);
                                            androidx.compose.runtime.ComposerKt.sourceInformation(composer5, "C(Layout)P(!1,2)74@2915L7,75@2970L7,76@3029L7,77@3041L460:Layout.kt#80mrfh");
                                            androidx.compose.runtime.ProvidableCompositionLocal<androidx.compose.ui.unit.Density> localDensity = androidx.compose.ui.platform.CompositionLocalsKt.getLocalDensity();
                                            androidx.compose.runtime.ComposerKt.sourceInformationMarkerStart(composer5, 2023513938, "C:CompositionLocal.kt#9igjgp");
                                            java.lang.Object consume = composer5.consume(localDensity);
                                            androidx.compose.runtime.ComposerKt.sourceInformationMarkerEnd(composer5);
                                            androidx.compose.ui.unit.Density density = (androidx.compose.ui.unit.Density) consume;
                                            androidx.compose.runtime.ProvidableCompositionLocal<androidx.compose.ui.unit.LayoutDirection> localLayoutDirection = androidx.compose.ui.platform.CompositionLocalsKt.getLocalLayoutDirection();
                                            androidx.compose.runtime.ComposerKt.sourceInformationMarkerStart(composer5, 2023513938, "C:CompositionLocal.kt#9igjgp");
                                            java.lang.Object consume2 = composer5.consume(localLayoutDirection);
                                            androidx.compose.runtime.ComposerKt.sourceInformationMarkerEnd(composer5);
                                            androidx.compose.ui.unit.LayoutDirection layoutDirection = (androidx.compose.ui.unit.LayoutDirection) consume2;
                                            androidx.compose.runtime.ProvidableCompositionLocal<androidx.compose.ui.platform.ViewConfiguration> localViewConfiguration = androidx.compose.ui.platform.CompositionLocalsKt.getLocalViewConfiguration();
                                            androidx.compose.runtime.ComposerKt.sourceInformationMarkerStart(composer5, 2023513938, "C:CompositionLocal.kt#9igjgp");
                                            java.lang.Object consume3 = composer5.consume(localViewConfiguration);
                                            androidx.compose.runtime.ComposerKt.sourceInformationMarkerEnd(composer5);
                                            androidx.compose.ui.platform.ViewConfiguration viewConfiguration = (androidx.compose.ui.platform.ViewConfiguration) consume3;
                                            kotlin.jvm.functions.Function0<androidx.compose.ui.node.ComposeUiNode> constructor = androidx.compose.ui.node.ComposeUiNode.INSTANCE.getConstructor();
                                            kotlin.jvm.functions.Function3<androidx.compose.runtime.SkippableUpdater<androidx.compose.ui.node.ComposeUiNode>, androidx.compose.runtime.Composer, java.lang.Integer, kotlin.Unit> materializerOf = androidx.compose.ui.layout.LayoutKt.materializerOf(m601defaultMinSizeVpY3zN4);
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
                                            composer5.startReplaceableGroup(-1049034642);
                                            androidx.compose.runtime.ComposerKt.sourceInformation(composer5, "C103@4849L9:FloatingActionButton.kt#jmzs0o");
                                            function23.invoke(composer5, java.lang.Integer.valueOf((i15 >> 21) & 14));
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
                                }), composer4, 48);
                                return;
                            }
                            composer4.skipToGroupEnd();
                        }
                    }), composer3, 56);
                }
            }), composer2, (i3 & 14) | 805306368 | (i3 & 112) | (i3 & 7168) | (57344 & i3) | (458752 & i3) | ((i3 << 18) & 234881024), 68);
            modifier3 = modifier2;
            mutableInteractionSource4 = mutableInteractionSource3;
            shape4 = shape3;
            j8 = j7;
            floatingActionButtonElevation3 = floatingActionButtonElevation422;
            j9 = j1022;
            endRestartGroup = composer2.endRestartGroup();
            if (endRestartGroup != null) {
            }
        }
        i4 = i2 & 4;
        if (i4 == 0) {
        }
        if ((i & 7168) == 0) {
        }
        if ((i & 57344) == 0) {
        }
        if ((i & 458752) == 0) {
        }
        if ((i & 3670016) == 0) {
        }
        if ((i2 & 128) == 0) {
        }
        i3 |= i5;
        if ((23967451 & i3) == 4793490) {
        }
        startRestartGroup.startDefaults();
        if ((i & 1) != 0) {
        }
        if (i9 == 0) {
        }
        if (i4 == 0) {
        }
        if ((i2 & 8) == 0) {
        }
        if ((i2 & 16) == 0) {
        }
        if ((i2 & 32) == 0) {
        }
        if ((i2 & 64) != 0) {
        }
        modifier2 = companion;
        mutableInteractionSource3 = mutableInteractionSource2;
        shape3 = cornerBasedShape;
        j7 = j5;
        j4 = j6;
        androidx.compose.material.FloatingActionButtonElevation floatingActionButtonElevation4222 = floatingActionButtonElevation2;
        startRestartGroup.endDefaults();
        long j10222 = j4;
        composer2 = startRestartGroup;
        androidx.compose.material.SurfaceKt.m1512SurfaceLPr_se0(onClick, modifier2, false, shape3, j7, j4, null, floatingActionButtonElevation4222.elevation(mutableInteractionSource3, startRestartGroup, ((i3 >> 6) & 14) | ((i3 >> 15) & 112)).getValue().m4492unboximpl(), mutableInteractionSource3, androidx.compose.runtime.internal.ComposableLambdaKt.composableLambda(startRestartGroup, 1972871863, true, new kotlin.jvm.functions.Function2<androidx.compose.runtime.Composer, java.lang.Integer, kotlin.Unit>() { // from class: androidx.compose.material.FloatingActionButtonKt$FloatingActionButton$2
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
                androidx.compose.runtime.ComposerKt.sourceInformation(composer3, "C97@4492L392:FloatingActionButton.kt#jmzs0o");
                if ((i10 & 11) == 2 && composer3.getSkipping()) {
                    composer3.skipToGroupEnd();
                    return;
                }
                androidx.compose.runtime.ProvidedValue[] providedValueArr = {androidx.compose.material.ContentAlphaKt.getLocalContentAlpha().provides(java.lang.Float.valueOf(androidx.compose.ui.graphics.Color.m2115getAlphaimpl(j4)))};
                final kotlin.jvm.functions.Function2<? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.Unit> function2 = content;
                final int i11 = i3;
                androidx.compose.runtime.CompositionLocalKt.CompositionLocalProvider((androidx.compose.runtime.ProvidedValue<?>[]) providedValueArr, androidx.compose.runtime.internal.ComposableLambdaKt.composableLambda(composer3, 1867794295, true, new kotlin.jvm.functions.Function2<androidx.compose.runtime.Composer, java.lang.Integer, kotlin.Unit>() { // from class: androidx.compose.material.FloatingActionButtonKt$FloatingActionButton$2.1
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

                    public final void invoke(androidx.compose.runtime.Composer composer4, int i12) {
                        androidx.compose.runtime.ComposerKt.sourceInformation(composer4, "C98@4609L10,98@4578L296:FloatingActionButton.kt#jmzs0o");
                        if ((i12 & 11) != 2 || !composer4.getSkipping()) {
                            androidx.compose.ui.text.TextStyle button = androidx.compose.material.MaterialTheme.INSTANCE.getTypography(composer4, 6).getButton();
                            final kotlin.jvm.functions.Function2<? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.Unit> function22 = function2;
                            final int i13 = i11;
                            androidx.compose.material.TextKt.ProvideTextStyle(button, androidx.compose.runtime.internal.ComposableLambdaKt.composableLambda(composer4, -1567914264, true, new kotlin.jvm.functions.Function2<androidx.compose.runtime.Composer, java.lang.Integer, kotlin.Unit>() { // from class: androidx.compose.material.FloatingActionButtonKt.FloatingActionButton.2.1.1
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

                                public final void invoke(androidx.compose.runtime.Composer composer5, int i14) {
                                    float f;
                                    float f2;
                                    androidx.compose.runtime.ComposerKt.sourceInformation(composer5, "C99@4646L214:FloatingActionButton.kt#jmzs0o");
                                    if ((i14 & 11) != 2 || !composer5.getSkipping()) {
                                        androidx.compose.ui.Modifier.Companion companion2 = androidx.compose.ui.Modifier.INSTANCE;
                                        f = androidx.compose.material.FloatingActionButtonKt.FabSize;
                                        f2 = androidx.compose.material.FloatingActionButtonKt.FabSize;
                                        androidx.compose.ui.Modifier m601defaultMinSizeVpY3zN4 = androidx.compose.foundation.layout.SizeKt.m601defaultMinSizeVpY3zN4(companion2, f, f2);
                                        androidx.compose.ui.Alignment center = androidx.compose.ui.Alignment.INSTANCE.getCenter();
                                        kotlin.jvm.functions.Function2<androidx.compose.runtime.Composer, java.lang.Integer, kotlin.Unit> function23 = function22;
                                        int i15 = i13;
                                        composer5.startReplaceableGroup(733328855);
                                        androidx.compose.runtime.ComposerKt.sourceInformation(composer5, "C(Box)P(2,1,3)70@3267L67,71@3339L130:Box.kt#2w3rfo");
                                        androidx.compose.ui.layout.MeasurePolicy rememberBoxMeasurePolicy = androidx.compose.foundation.layout.BoxKt.rememberBoxMeasurePolicy(center, false, composer5, 6);
                                        composer5.startReplaceableGroup(-1323940314);
                                        androidx.compose.runtime.ComposerKt.sourceInformation(composer5, "C(Layout)P(!1,2)74@2915L7,75@2970L7,76@3029L7,77@3041L460:Layout.kt#80mrfh");
                                        androidx.compose.runtime.ProvidableCompositionLocal<androidx.compose.ui.unit.Density> localDensity = androidx.compose.ui.platform.CompositionLocalsKt.getLocalDensity();
                                        androidx.compose.runtime.ComposerKt.sourceInformationMarkerStart(composer5, 2023513938, "C:CompositionLocal.kt#9igjgp");
                                        java.lang.Object consume = composer5.consume(localDensity);
                                        androidx.compose.runtime.ComposerKt.sourceInformationMarkerEnd(composer5);
                                        androidx.compose.ui.unit.Density density = (androidx.compose.ui.unit.Density) consume;
                                        androidx.compose.runtime.ProvidableCompositionLocal<androidx.compose.ui.unit.LayoutDirection> localLayoutDirection = androidx.compose.ui.platform.CompositionLocalsKt.getLocalLayoutDirection();
                                        androidx.compose.runtime.ComposerKt.sourceInformationMarkerStart(composer5, 2023513938, "C:CompositionLocal.kt#9igjgp");
                                        java.lang.Object consume2 = composer5.consume(localLayoutDirection);
                                        androidx.compose.runtime.ComposerKt.sourceInformationMarkerEnd(composer5);
                                        androidx.compose.ui.unit.LayoutDirection layoutDirection = (androidx.compose.ui.unit.LayoutDirection) consume2;
                                        androidx.compose.runtime.ProvidableCompositionLocal<androidx.compose.ui.platform.ViewConfiguration> localViewConfiguration = androidx.compose.ui.platform.CompositionLocalsKt.getLocalViewConfiguration();
                                        androidx.compose.runtime.ComposerKt.sourceInformationMarkerStart(composer5, 2023513938, "C:CompositionLocal.kt#9igjgp");
                                        java.lang.Object consume3 = composer5.consume(localViewConfiguration);
                                        androidx.compose.runtime.ComposerKt.sourceInformationMarkerEnd(composer5);
                                        androidx.compose.ui.platform.ViewConfiguration viewConfiguration = (androidx.compose.ui.platform.ViewConfiguration) consume3;
                                        kotlin.jvm.functions.Function0<androidx.compose.ui.node.ComposeUiNode> constructor = androidx.compose.ui.node.ComposeUiNode.INSTANCE.getConstructor();
                                        kotlin.jvm.functions.Function3<androidx.compose.runtime.SkippableUpdater<androidx.compose.ui.node.ComposeUiNode>, androidx.compose.runtime.Composer, java.lang.Integer, kotlin.Unit> materializerOf = androidx.compose.ui.layout.LayoutKt.materializerOf(m601defaultMinSizeVpY3zN4);
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
                                        composer5.startReplaceableGroup(-1049034642);
                                        androidx.compose.runtime.ComposerKt.sourceInformation(composer5, "C103@4849L9:FloatingActionButton.kt#jmzs0o");
                                        function23.invoke(composer5, java.lang.Integer.valueOf((i15 >> 21) & 14));
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
                            }), composer4, 48);
                            return;
                        }
                        composer4.skipToGroupEnd();
                    }
                }), composer3, 56);
            }
        }), composer2, (i3 & 14) | 805306368 | (i3 & 112) | (i3 & 7168) | (57344 & i3) | (458752 & i3) | ((i3 << 18) & 234881024), 68);
        modifier3 = modifier2;
        mutableInteractionSource4 = mutableInteractionSource3;
        shape4 = shape3;
        j8 = j7;
        floatingActionButtonElevation3 = floatingActionButtonElevation4222;
        j9 = j10222;
        endRestartGroup = composer2.endRestartGroup();
        if (endRestartGroup != null) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:100:0x01fe  */
    /* JADX WARN: Removed duplicated region for block: B:101:0x0232  */
    /* JADX WARN: Removed duplicated region for block: B:102:0x01f9  */
    /* JADX WARN: Removed duplicated region for block: B:103:0x01d7  */
    /* JADX WARN: Removed duplicated region for block: B:104:0x01b8  */
    /* JADX WARN: Removed duplicated region for block: B:105:0x0190  */
    /* JADX WARN: Removed duplicated region for block: B:106:0x018a  */
    /* JADX WARN: Removed duplicated region for block: B:109:0x0116  */
    /* JADX WARN: Removed duplicated region for block: B:111:0x00f8  */
    /* JADX WARN: Removed duplicated region for block: B:113:0x00dc  */
    /* JADX WARN: Removed duplicated region for block: B:116:0x00c0  */
    /* JADX WARN: Removed duplicated region for block: B:117:0x0090  */
    /* JADX WARN: Removed duplicated region for block: B:124:0x0071  */
    /* JADX WARN: Removed duplicated region for block: B:13:0x006e  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x008d  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x00ab  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x00c8  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00e4  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x0100  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x0122  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x02b7  */
    /* JADX WARN: Removed duplicated region for block: B:61:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:64:0x014f  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x0185  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x018e  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x0194  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x01be  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x01dd  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x01ee  */
    /* renamed from: ExtendedFloatingActionButton-wqdebIU, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void m1409ExtendedFloatingActionButtonwqdebIU(final kotlin.jvm.functions.Function2<? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.Unit> text, final kotlin.jvm.functions.Function0<kotlin.Unit> onClick, androidx.compose.ui.Modifier modifier, kotlin.jvm.functions.Function2<? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.Unit> function2, androidx.compose.foundation.interaction.MutableInteractionSource mutableInteractionSource, androidx.compose.ui.graphics.Shape shape, long j, long j2, androidx.compose.material.FloatingActionButtonElevation floatingActionButtonElevation, androidx.compose.runtime.Composer composer, final int i, final int i2) {
        final int i3;
        int i4;
        int i5;
        long j3;
        long j4;
        androidx.compose.material.FloatingActionButtonElevation floatingActionButtonElevation2;
        androidx.compose.foundation.interaction.MutableInteractionSource mutableInteractionSource2;
        androidx.compose.foundation.shape.CornerBasedShape cornerBasedShape;
        long j5;
        androidx.compose.ui.Modifier modifier2;
        androidx.compose.foundation.interaction.MutableInteractionSource mutableInteractionSource3;
        androidx.compose.ui.graphics.Shape shape2;
        long j6;
        long j7;
        androidx.compose.material.FloatingActionButtonElevation floatingActionButtonElevation3;
        final kotlin.jvm.functions.Function2<? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.Unit> function22;
        androidx.compose.runtime.Composer composer2;
        final androidx.compose.ui.Modifier modifier3;
        final androidx.compose.foundation.interaction.MutableInteractionSource mutableInteractionSource4;
        final androidx.compose.ui.graphics.Shape shape3;
        final long j8;
        final kotlin.jvm.functions.Function2<? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.Unit> function23;
        final long j9;
        final androidx.compose.material.FloatingActionButtonElevation floatingActionButtonElevation4;
        androidx.compose.runtime.ScopeUpdateScope endRestartGroup;
        int i6;
        int i7;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(text, "text");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(onClick, "onClick");
        androidx.compose.runtime.Composer startRestartGroup = composer.startRestartGroup(-1555720195);
        androidx.compose.runtime.ComposerKt.sourceInformation(startRestartGroup, "C(ExtendedFloatingActionButton)P(8,6,5,3,4,7,0:c#ui.graphics.Color,1:c#ui.graphics.Color)148@7090L39,149@7164L6,150@7252L6,151@7296L32,152@7406L11,154@7426L849:FloatingActionButton.kt#jmzs0o");
        if ((i2 & 1) != 0) {
            i3 = i | 6;
        } else if ((i & 14) == 0) {
            i3 = (startRestartGroup.changed(text) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i2 & 2) != 0) {
            i3 |= 48;
        } else if ((i & 112) == 0) {
            i3 |= startRestartGroup.changed(onClick) ? 32 : 16;
        }
        int i8 = i2 & 4;
        if (i8 != 0) {
            i3 |= 384;
        } else if ((i & 896) == 0) {
            i3 |= startRestartGroup.changed(modifier) ? 256 : 128;
            i4 = i2 & 8;
            if (i4 == 0) {
                i3 |= 3072;
            } else if ((i & 7168) == 0) {
                i3 |= startRestartGroup.changed(function2) ? 2048 : 1024;
                i5 = i2 & 16;
                if (i5 != 0) {
                    i3 |= 24576;
                } else if ((i & 57344) == 0) {
                    i3 |= startRestartGroup.changed(mutableInteractionSource) ? 16384 : 8192;
                    if ((i & 458752) == 0) {
                        if ((i2 & 32) == 0 && startRestartGroup.changed(shape)) {
                            i7 = 131072;
                            i3 |= i7;
                        }
                        i7 = 65536;
                        i3 |= i7;
                    }
                    if ((i & 3670016) != 0) {
                        j3 = j;
                        i3 |= ((i2 & 64) == 0 && startRestartGroup.changed(j3)) ? 1048576 : 524288;
                    } else {
                        j3 = j;
                    }
                    if ((i & 29360128) != 0) {
                        j4 = j2;
                        i3 |= ((i2 & 128) == 0 && startRestartGroup.changed(j4)) ? 8388608 : 4194304;
                    } else {
                        j4 = j2;
                    }
                    if ((i & 234881024) != 0) {
                        if ((i2 & 256) == 0) {
                            floatingActionButtonElevation2 = floatingActionButtonElevation;
                            if (startRestartGroup.changed(floatingActionButtonElevation2)) {
                                i6 = androidx.core.view.accessibility.AccessibilityEventCompat.TYPE_VIEW_TARGETED_BY_SCROLL;
                                i3 |= i6;
                            }
                        } else {
                            floatingActionButtonElevation2 = floatingActionButtonElevation;
                        }
                        i6 = 33554432;
                        i3 |= i6;
                    } else {
                        floatingActionButtonElevation2 = floatingActionButtonElevation;
                    }
                    if ((i3 & 191739611) == 38347922 || !startRestartGroup.getSkipping()) {
                        startRestartGroup.startDefaults();
                        if ((i & 1) != 0 || startRestartGroup.getDefaultsInvalid()) {
                            androidx.compose.ui.Modifier.Companion companion = i8 == 0 ? androidx.compose.ui.Modifier.INSTANCE : modifier;
                            kotlin.jvm.functions.Function2<? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.Unit> function24 = i4 == 0 ? null : function2;
                            if (i5 == 0) {
                                startRestartGroup.startReplaceableGroup(-492369756);
                                androidx.compose.runtime.ComposerKt.sourceInformation(startRestartGroup, "C(remember):Composables.kt#9igjgp");
                                java.lang.Object rememberedValue = startRestartGroup.rememberedValue();
                                if (rememberedValue == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                                    rememberedValue = androidx.compose.foundation.interaction.InteractionSourceKt.MutableInteractionSource();
                                    startRestartGroup.updateRememberedValue(rememberedValue);
                                }
                                startRestartGroup.endReplaceableGroup();
                                mutableInteractionSource2 = (androidx.compose.foundation.interaction.MutableInteractionSource) rememberedValue;
                            } else {
                                mutableInteractionSource2 = mutableInteractionSource;
                            }
                            if ((i2 & 32) == 0) {
                                cornerBasedShape = androidx.compose.material.MaterialTheme.INSTANCE.getShapes(startRestartGroup, 6).getSmall().copy(androidx.compose.foundation.shape.CornerSizeKt.CornerSize(50));
                                i3 &= -458753;
                            } else {
                                cornerBasedShape = shape;
                            }
                            if ((i2 & 64) != 0) {
                                j3 = androidx.compose.material.MaterialTheme.INSTANCE.getColors(startRestartGroup, 6).m1317getSecondary0d7_KjU();
                                i3 &= -3670017;
                            }
                            if ((i2 & 128) == 0) {
                                j5 = androidx.compose.material.ColorsKt.m1333contentColorForek8zF_U(j3, startRestartGroup, (i3 >> 18) & 14);
                                i3 &= -29360129;
                            } else {
                                j5 = j4;
                            }
                            if ((i2 & 256) == 0) {
                                i3 &= -234881025;
                                modifier2 = companion;
                                function22 = function24;
                                mutableInteractionSource3 = mutableInteractionSource2;
                                shape2 = cornerBasedShape;
                                j6 = j5;
                                floatingActionButtonElevation3 = androidx.compose.material.FloatingActionButtonDefaults.INSTANCE.m1408elevationxZ9QkE(0.0f, 0.0f, 0.0f, 0.0f, startRestartGroup, 24576, 15);
                                j7 = j3;
                            } else {
                                modifier2 = companion;
                                mutableInteractionSource3 = mutableInteractionSource2;
                                shape2 = cornerBasedShape;
                                j6 = j5;
                                j7 = j3;
                                floatingActionButtonElevation3 = floatingActionButtonElevation2;
                                function22 = function24;
                            }
                        } else {
                            startRestartGroup.skipToGroupEnd();
                            if ((i2 & 32) != 0) {
                                i3 &= -458753;
                            }
                            if ((i2 & 64) != 0) {
                                i3 &= -3670017;
                            }
                            if ((i2 & 128) != 0) {
                                i3 &= -29360129;
                            }
                            if ((i2 & 256) != 0) {
                                i3 &= -234881025;
                            }
                            modifier2 = modifier;
                            mutableInteractionSource3 = mutableInteractionSource;
                            shape2 = shape;
                            j6 = j4;
                            j7 = j3;
                            floatingActionButtonElevation3 = floatingActionButtonElevation2;
                            function22 = function2;
                        }
                        startRestartGroup.endDefaults();
                        float f = ExtendedFabSize;
                        androidx.compose.ui.Modifier m621sizeInqDBjuR0$default = androidx.compose.foundation.layout.SizeKt.m621sizeInqDBjuR0$default(modifier2, f, f, 0.0f, 0.0f, 12, null);
                        androidx.compose.runtime.internal.ComposableLambda composableLambda = androidx.compose.runtime.internal.ComposableLambdaKt.composableLambda(startRestartGroup, 1418981691, true, new kotlin.jvm.functions.Function2<androidx.compose.runtime.Composer, java.lang.Integer, kotlin.Unit>() { // from class: androidx.compose.material.FloatingActionButtonKt$ExtendedFloatingActionButton$2
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
                                float f2;
                                float f3;
                                androidx.compose.runtime.ComposerKt.sourceInformation(composer3, "C167@7894L375:FloatingActionButton.kt#jmzs0o");
                                if ((i9 & 11) != 2 || !composer3.getSkipping()) {
                                    float f4 = function22 == null ? androidx.compose.material.FloatingActionButtonKt.ExtendedFabTextPadding : androidx.compose.material.FloatingActionButtonKt.ExtendedFabIconPadding;
                                    androidx.compose.ui.Modifier.Companion companion2 = androidx.compose.ui.Modifier.INSTANCE;
                                    f2 = androidx.compose.material.FloatingActionButtonKt.ExtendedFabTextPadding;
                                    androidx.compose.ui.Modifier m572paddingqDBjuR0$default = androidx.compose.foundation.layout.PaddingKt.m572paddingqDBjuR0$default(companion2, f4, 0.0f, f2, 0.0f, 10, null);
                                    androidx.compose.ui.Alignment.Vertical centerVertically = androidx.compose.ui.Alignment.INSTANCE.getCenterVertically();
                                    kotlin.jvm.functions.Function2<androidx.compose.runtime.Composer, java.lang.Integer, kotlin.Unit> function25 = function22;
                                    int i10 = i3;
                                    kotlin.jvm.functions.Function2<androidx.compose.runtime.Composer, java.lang.Integer, kotlin.Unit> function26 = text;
                                    composer3.startReplaceableGroup(693286680);
                                    androidx.compose.runtime.ComposerKt.sourceInformation(composer3, "C(Row)P(2,1,3)78@3880L58,79@3943L130:Row.kt#2w3rfo");
                                    androidx.compose.ui.layout.MeasurePolicy rowMeasurePolicy = androidx.compose.foundation.layout.RowKt.rowMeasurePolicy(androidx.compose.foundation.layout.Arrangement.INSTANCE.getStart(), centerVertically, composer3, 48);
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
                                    kotlin.jvm.functions.Function3<androidx.compose.runtime.SkippableUpdater<androidx.compose.ui.node.ComposeUiNode>, androidx.compose.runtime.Composer, java.lang.Integer, kotlin.Unit> materializerOf = androidx.compose.ui.layout.LayoutKt.materializerOf(m572paddingqDBjuR0$default);
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
                                    androidx.compose.runtime.Updater.m1648setimpl(m1641constructorimpl, rowMeasurePolicy, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetMeasurePolicy());
                                    androidx.compose.runtime.Updater.m1648setimpl(m1641constructorimpl, density, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetDensity());
                                    androidx.compose.runtime.Updater.m1648setimpl(m1641constructorimpl, layoutDirection, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetLayoutDirection());
                                    androidx.compose.runtime.Updater.m1648setimpl(m1641constructorimpl, viewConfiguration, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetViewConfiguration());
                                    composer3.enableReusing();
                                    materializerOf.invoke(androidx.compose.runtime.SkippableUpdater.m1632boximpl(androidx.compose.runtime.SkippableUpdater.m1633constructorimpl(composer3)), composer3, 0);
                                    composer3.startReplaceableGroup(2058660585);
                                    composer3.startReplaceableGroup(-678309503);
                                    androidx.compose.runtime.ComposerKt.sourceInformation(composer3, "C80@3988L9:Row.kt#2w3rfo");
                                    androidx.compose.foundation.layout.RowScopeInstance rowScopeInstance = androidx.compose.foundation.layout.RowScopeInstance.INSTANCE;
                                    composer3.startReplaceableGroup(-388203689);
                                    androidx.compose.runtime.ComposerKt.sourceInformation(composer3, "C178@8253L6:FloatingActionButton.kt#jmzs0o");
                                    composer3.startReplaceableGroup(-1435223762);
                                    androidx.compose.runtime.ComposerKt.sourceInformation(composer3, "175@8157L6,176@8180L46");
                                    if (function25 != null) {
                                        function25.invoke(composer3, java.lang.Integer.valueOf((i10 >> 9) & 14));
                                        androidx.compose.ui.Modifier.Companion companion3 = androidx.compose.ui.Modifier.INSTANCE;
                                        f3 = androidx.compose.material.FloatingActionButtonKt.ExtendedFabIconPadding;
                                        androidx.compose.foundation.layout.SpacerKt.Spacer(androidx.compose.foundation.layout.SizeKt.m622width3ABfNKs(companion3, f3), composer3, 6);
                                    }
                                    composer3.endReplaceableGroup();
                                    function26.invoke(composer3, java.lang.Integer.valueOf(i10 & 14));
                                    composer3.endReplaceableGroup();
                                    composer3.endReplaceableGroup();
                                    composer3.endReplaceableGroup();
                                    composer3.endNode();
                                    composer3.endReplaceableGroup();
                                    composer3.endReplaceableGroup();
                                    return;
                                }
                                composer3.skipToGroupEnd();
                            }
                        });
                        int i9 = ((i3 >> 3) & 14) | 12582912;
                        int i10 = i3 >> 6;
                        composer2 = startRestartGroup;
                        m1410FloatingActionButtonbogVsAg(onClick, m621sizeInqDBjuR0$default, mutableInteractionSource3, shape2, j7, j6, floatingActionButtonElevation3, composableLambda, startRestartGroup, i9 | (i10 & 896) | (i10 & 7168) | (57344 & i10) | (458752 & i10) | (i10 & 3670016), 0);
                        modifier3 = modifier2;
                        mutableInteractionSource4 = mutableInteractionSource3;
                        shape3 = shape2;
                        j8 = j7;
                        function23 = function22;
                        j9 = j6;
                        floatingActionButtonElevation4 = floatingActionButtonElevation3;
                    } else {
                        startRestartGroup.skipToGroupEnd();
                        modifier3 = modifier;
                        function23 = function2;
                        mutableInteractionSource4 = mutableInteractionSource;
                        shape3 = shape;
                        composer2 = startRestartGroup;
                        floatingActionButtonElevation4 = floatingActionButtonElevation2;
                        j9 = j4;
                        j8 = j3;
                    }
                    endRestartGroup = composer2.endRestartGroup();
                    if (endRestartGroup != null) {
                        return;
                    }
                    endRestartGroup.updateScope(new kotlin.jvm.functions.Function2<androidx.compose.runtime.Composer, java.lang.Integer, kotlin.Unit>() { // from class: androidx.compose.material.FloatingActionButtonKt$ExtendedFloatingActionButton$3
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
                            androidx.compose.material.FloatingActionButtonKt.m1409ExtendedFloatingActionButtonwqdebIU(text, onClick, modifier3, function23, mutableInteractionSource4, shape3, j8, j9, floatingActionButtonElevation4, composer3, i | 1, i2);
                        }
                    });
                    return;
                }
                if ((i & 458752) == 0) {
                }
                if ((i & 3670016) != 0) {
                }
                if ((i & 29360128) != 0) {
                }
                if ((i & 234881024) != 0) {
                }
                if ((i3 & 191739611) == 38347922) {
                }
                startRestartGroup.startDefaults();
                if ((i & 1) != 0) {
                }
                if (i8 == 0) {
                }
                if (i4 == 0) {
                }
                if (i5 == 0) {
                }
                if ((i2 & 32) == 0) {
                }
                if ((i2 & 64) != 0) {
                }
                if ((i2 & 128) == 0) {
                }
                if ((i2 & 256) == 0) {
                }
                startRestartGroup.endDefaults();
                float f2 = ExtendedFabSize;
                androidx.compose.ui.Modifier m621sizeInqDBjuR0$default2 = androidx.compose.foundation.layout.SizeKt.m621sizeInqDBjuR0$default(modifier2, f2, f2, 0.0f, 0.0f, 12, null);
                androidx.compose.runtime.internal.ComposableLambda composableLambda2 = androidx.compose.runtime.internal.ComposableLambdaKt.composableLambda(startRestartGroup, 1418981691, true, new kotlin.jvm.functions.Function2<androidx.compose.runtime.Composer, java.lang.Integer, kotlin.Unit>() { // from class: androidx.compose.material.FloatingActionButtonKt$ExtendedFloatingActionButton$2
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

                    public final void invoke(androidx.compose.runtime.Composer composer3, int i92) {
                        float f22;
                        float f3;
                        androidx.compose.runtime.ComposerKt.sourceInformation(composer3, "C167@7894L375:FloatingActionButton.kt#jmzs0o");
                        if ((i92 & 11) != 2 || !composer3.getSkipping()) {
                            float f4 = function22 == null ? androidx.compose.material.FloatingActionButtonKt.ExtendedFabTextPadding : androidx.compose.material.FloatingActionButtonKt.ExtendedFabIconPadding;
                            androidx.compose.ui.Modifier.Companion companion2 = androidx.compose.ui.Modifier.INSTANCE;
                            f22 = androidx.compose.material.FloatingActionButtonKt.ExtendedFabTextPadding;
                            androidx.compose.ui.Modifier m572paddingqDBjuR0$default = androidx.compose.foundation.layout.PaddingKt.m572paddingqDBjuR0$default(companion2, f4, 0.0f, f22, 0.0f, 10, null);
                            androidx.compose.ui.Alignment.Vertical centerVertically = androidx.compose.ui.Alignment.INSTANCE.getCenterVertically();
                            kotlin.jvm.functions.Function2<androidx.compose.runtime.Composer, java.lang.Integer, kotlin.Unit> function25 = function22;
                            int i102 = i3;
                            kotlin.jvm.functions.Function2<androidx.compose.runtime.Composer, java.lang.Integer, kotlin.Unit> function26 = text;
                            composer3.startReplaceableGroup(693286680);
                            androidx.compose.runtime.ComposerKt.sourceInformation(composer3, "C(Row)P(2,1,3)78@3880L58,79@3943L130:Row.kt#2w3rfo");
                            androidx.compose.ui.layout.MeasurePolicy rowMeasurePolicy = androidx.compose.foundation.layout.RowKt.rowMeasurePolicy(androidx.compose.foundation.layout.Arrangement.INSTANCE.getStart(), centerVertically, composer3, 48);
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
                            kotlin.jvm.functions.Function3<androidx.compose.runtime.SkippableUpdater<androidx.compose.ui.node.ComposeUiNode>, androidx.compose.runtime.Composer, java.lang.Integer, kotlin.Unit> materializerOf = androidx.compose.ui.layout.LayoutKt.materializerOf(m572paddingqDBjuR0$default);
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
                            androidx.compose.runtime.Updater.m1648setimpl(m1641constructorimpl, rowMeasurePolicy, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetMeasurePolicy());
                            androidx.compose.runtime.Updater.m1648setimpl(m1641constructorimpl, density, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetDensity());
                            androidx.compose.runtime.Updater.m1648setimpl(m1641constructorimpl, layoutDirection, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetLayoutDirection());
                            androidx.compose.runtime.Updater.m1648setimpl(m1641constructorimpl, viewConfiguration, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetViewConfiguration());
                            composer3.enableReusing();
                            materializerOf.invoke(androidx.compose.runtime.SkippableUpdater.m1632boximpl(androidx.compose.runtime.SkippableUpdater.m1633constructorimpl(composer3)), composer3, 0);
                            composer3.startReplaceableGroup(2058660585);
                            composer3.startReplaceableGroup(-678309503);
                            androidx.compose.runtime.ComposerKt.sourceInformation(composer3, "C80@3988L9:Row.kt#2w3rfo");
                            androidx.compose.foundation.layout.RowScopeInstance rowScopeInstance = androidx.compose.foundation.layout.RowScopeInstance.INSTANCE;
                            composer3.startReplaceableGroup(-388203689);
                            androidx.compose.runtime.ComposerKt.sourceInformation(composer3, "C178@8253L6:FloatingActionButton.kt#jmzs0o");
                            composer3.startReplaceableGroup(-1435223762);
                            androidx.compose.runtime.ComposerKt.sourceInformation(composer3, "175@8157L6,176@8180L46");
                            if (function25 != null) {
                                function25.invoke(composer3, java.lang.Integer.valueOf((i102 >> 9) & 14));
                                androidx.compose.ui.Modifier.Companion companion3 = androidx.compose.ui.Modifier.INSTANCE;
                                f3 = androidx.compose.material.FloatingActionButtonKt.ExtendedFabIconPadding;
                                androidx.compose.foundation.layout.SpacerKt.Spacer(androidx.compose.foundation.layout.SizeKt.m622width3ABfNKs(companion3, f3), composer3, 6);
                            }
                            composer3.endReplaceableGroup();
                            function26.invoke(composer3, java.lang.Integer.valueOf(i102 & 14));
                            composer3.endReplaceableGroup();
                            composer3.endReplaceableGroup();
                            composer3.endReplaceableGroup();
                            composer3.endNode();
                            composer3.endReplaceableGroup();
                            composer3.endReplaceableGroup();
                            return;
                        }
                        composer3.skipToGroupEnd();
                    }
                });
                int i92 = ((i3 >> 3) & 14) | 12582912;
                int i102 = i3 >> 6;
                composer2 = startRestartGroup;
                m1410FloatingActionButtonbogVsAg(onClick, m621sizeInqDBjuR0$default2, mutableInteractionSource3, shape2, j7, j6, floatingActionButtonElevation3, composableLambda2, startRestartGroup, i92 | (i102 & 896) | (i102 & 7168) | (57344 & i102) | (458752 & i102) | (i102 & 3670016), 0);
                modifier3 = modifier2;
                mutableInteractionSource4 = mutableInteractionSource3;
                shape3 = shape2;
                j8 = j7;
                function23 = function22;
                j9 = j6;
                floatingActionButtonElevation4 = floatingActionButtonElevation3;
                endRestartGroup = composer2.endRestartGroup();
                if (endRestartGroup != null) {
                }
            }
            i5 = i2 & 16;
            if (i5 != 0) {
            }
            if ((i & 458752) == 0) {
            }
            if ((i & 3670016) != 0) {
            }
            if ((i & 29360128) != 0) {
            }
            if ((i & 234881024) != 0) {
            }
            if ((i3 & 191739611) == 38347922) {
            }
            startRestartGroup.startDefaults();
            if ((i & 1) != 0) {
            }
            if (i8 == 0) {
            }
            if (i4 == 0) {
            }
            if (i5 == 0) {
            }
            if ((i2 & 32) == 0) {
            }
            if ((i2 & 64) != 0) {
            }
            if ((i2 & 128) == 0) {
            }
            if ((i2 & 256) == 0) {
            }
            startRestartGroup.endDefaults();
            float f22 = ExtendedFabSize;
            androidx.compose.ui.Modifier m621sizeInqDBjuR0$default22 = androidx.compose.foundation.layout.SizeKt.m621sizeInqDBjuR0$default(modifier2, f22, f22, 0.0f, 0.0f, 12, null);
            androidx.compose.runtime.internal.ComposableLambda composableLambda22 = androidx.compose.runtime.internal.ComposableLambdaKt.composableLambda(startRestartGroup, 1418981691, true, new kotlin.jvm.functions.Function2<androidx.compose.runtime.Composer, java.lang.Integer, kotlin.Unit>() { // from class: androidx.compose.material.FloatingActionButtonKt$ExtendedFloatingActionButton$2
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

                public final void invoke(androidx.compose.runtime.Composer composer3, int i922) {
                    float f222;
                    float f3;
                    androidx.compose.runtime.ComposerKt.sourceInformation(composer3, "C167@7894L375:FloatingActionButton.kt#jmzs0o");
                    if ((i922 & 11) != 2 || !composer3.getSkipping()) {
                        float f4 = function22 == null ? androidx.compose.material.FloatingActionButtonKt.ExtendedFabTextPadding : androidx.compose.material.FloatingActionButtonKt.ExtendedFabIconPadding;
                        androidx.compose.ui.Modifier.Companion companion2 = androidx.compose.ui.Modifier.INSTANCE;
                        f222 = androidx.compose.material.FloatingActionButtonKt.ExtendedFabTextPadding;
                        androidx.compose.ui.Modifier m572paddingqDBjuR0$default = androidx.compose.foundation.layout.PaddingKt.m572paddingqDBjuR0$default(companion2, f4, 0.0f, f222, 0.0f, 10, null);
                        androidx.compose.ui.Alignment.Vertical centerVertically = androidx.compose.ui.Alignment.INSTANCE.getCenterVertically();
                        kotlin.jvm.functions.Function2<androidx.compose.runtime.Composer, java.lang.Integer, kotlin.Unit> function25 = function22;
                        int i1022 = i3;
                        kotlin.jvm.functions.Function2<androidx.compose.runtime.Composer, java.lang.Integer, kotlin.Unit> function26 = text;
                        composer3.startReplaceableGroup(693286680);
                        androidx.compose.runtime.ComposerKt.sourceInformation(composer3, "C(Row)P(2,1,3)78@3880L58,79@3943L130:Row.kt#2w3rfo");
                        androidx.compose.ui.layout.MeasurePolicy rowMeasurePolicy = androidx.compose.foundation.layout.RowKt.rowMeasurePolicy(androidx.compose.foundation.layout.Arrangement.INSTANCE.getStart(), centerVertically, composer3, 48);
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
                        kotlin.jvm.functions.Function3<androidx.compose.runtime.SkippableUpdater<androidx.compose.ui.node.ComposeUiNode>, androidx.compose.runtime.Composer, java.lang.Integer, kotlin.Unit> materializerOf = androidx.compose.ui.layout.LayoutKt.materializerOf(m572paddingqDBjuR0$default);
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
                        androidx.compose.runtime.Updater.m1648setimpl(m1641constructorimpl, rowMeasurePolicy, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetMeasurePolicy());
                        androidx.compose.runtime.Updater.m1648setimpl(m1641constructorimpl, density, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetDensity());
                        androidx.compose.runtime.Updater.m1648setimpl(m1641constructorimpl, layoutDirection, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetLayoutDirection());
                        androidx.compose.runtime.Updater.m1648setimpl(m1641constructorimpl, viewConfiguration, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetViewConfiguration());
                        composer3.enableReusing();
                        materializerOf.invoke(androidx.compose.runtime.SkippableUpdater.m1632boximpl(androidx.compose.runtime.SkippableUpdater.m1633constructorimpl(composer3)), composer3, 0);
                        composer3.startReplaceableGroup(2058660585);
                        composer3.startReplaceableGroup(-678309503);
                        androidx.compose.runtime.ComposerKt.sourceInformation(composer3, "C80@3988L9:Row.kt#2w3rfo");
                        androidx.compose.foundation.layout.RowScopeInstance rowScopeInstance = androidx.compose.foundation.layout.RowScopeInstance.INSTANCE;
                        composer3.startReplaceableGroup(-388203689);
                        androidx.compose.runtime.ComposerKt.sourceInformation(composer3, "C178@8253L6:FloatingActionButton.kt#jmzs0o");
                        composer3.startReplaceableGroup(-1435223762);
                        androidx.compose.runtime.ComposerKt.sourceInformation(composer3, "175@8157L6,176@8180L46");
                        if (function25 != null) {
                            function25.invoke(composer3, java.lang.Integer.valueOf((i1022 >> 9) & 14));
                            androidx.compose.ui.Modifier.Companion companion3 = androidx.compose.ui.Modifier.INSTANCE;
                            f3 = androidx.compose.material.FloatingActionButtonKt.ExtendedFabIconPadding;
                            androidx.compose.foundation.layout.SpacerKt.Spacer(androidx.compose.foundation.layout.SizeKt.m622width3ABfNKs(companion3, f3), composer3, 6);
                        }
                        composer3.endReplaceableGroup();
                        function26.invoke(composer3, java.lang.Integer.valueOf(i1022 & 14));
                        composer3.endReplaceableGroup();
                        composer3.endReplaceableGroup();
                        composer3.endReplaceableGroup();
                        composer3.endNode();
                        composer3.endReplaceableGroup();
                        composer3.endReplaceableGroup();
                        return;
                    }
                    composer3.skipToGroupEnd();
                }
            });
            int i922 = ((i3 >> 3) & 14) | 12582912;
            int i1022 = i3 >> 6;
            composer2 = startRestartGroup;
            m1410FloatingActionButtonbogVsAg(onClick, m621sizeInqDBjuR0$default22, mutableInteractionSource3, shape2, j7, j6, floatingActionButtonElevation3, composableLambda22, startRestartGroup, i922 | (i1022 & 896) | (i1022 & 7168) | (57344 & i1022) | (458752 & i1022) | (i1022 & 3670016), 0);
            modifier3 = modifier2;
            mutableInteractionSource4 = mutableInteractionSource3;
            shape3 = shape2;
            j8 = j7;
            function23 = function22;
            j9 = j6;
            floatingActionButtonElevation4 = floatingActionButtonElevation3;
            endRestartGroup = composer2.endRestartGroup();
            if (endRestartGroup != null) {
            }
        }
        i4 = i2 & 8;
        if (i4 == 0) {
        }
        i5 = i2 & 16;
        if (i5 != 0) {
        }
        if ((i & 458752) == 0) {
        }
        if ((i & 3670016) != 0) {
        }
        if ((i & 29360128) != 0) {
        }
        if ((i & 234881024) != 0) {
        }
        if ((i3 & 191739611) == 38347922) {
        }
        startRestartGroup.startDefaults();
        if ((i & 1) != 0) {
        }
        if (i8 == 0) {
        }
        if (i4 == 0) {
        }
        if (i5 == 0) {
        }
        if ((i2 & 32) == 0) {
        }
        if ((i2 & 64) != 0) {
        }
        if ((i2 & 128) == 0) {
        }
        if ((i2 & 256) == 0) {
        }
        startRestartGroup.endDefaults();
        float f222 = ExtendedFabSize;
        androidx.compose.ui.Modifier m621sizeInqDBjuR0$default222 = androidx.compose.foundation.layout.SizeKt.m621sizeInqDBjuR0$default(modifier2, f222, f222, 0.0f, 0.0f, 12, null);
        androidx.compose.runtime.internal.ComposableLambda composableLambda222 = androidx.compose.runtime.internal.ComposableLambdaKt.composableLambda(startRestartGroup, 1418981691, true, new kotlin.jvm.functions.Function2<androidx.compose.runtime.Composer, java.lang.Integer, kotlin.Unit>() { // from class: androidx.compose.material.FloatingActionButtonKt$ExtendedFloatingActionButton$2
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

            public final void invoke(androidx.compose.runtime.Composer composer3, int i9222) {
                float f2222;
                float f3;
                androidx.compose.runtime.ComposerKt.sourceInformation(composer3, "C167@7894L375:FloatingActionButton.kt#jmzs0o");
                if ((i9222 & 11) != 2 || !composer3.getSkipping()) {
                    float f4 = function22 == null ? androidx.compose.material.FloatingActionButtonKt.ExtendedFabTextPadding : androidx.compose.material.FloatingActionButtonKt.ExtendedFabIconPadding;
                    androidx.compose.ui.Modifier.Companion companion2 = androidx.compose.ui.Modifier.INSTANCE;
                    f2222 = androidx.compose.material.FloatingActionButtonKt.ExtendedFabTextPadding;
                    androidx.compose.ui.Modifier m572paddingqDBjuR0$default = androidx.compose.foundation.layout.PaddingKt.m572paddingqDBjuR0$default(companion2, f4, 0.0f, f2222, 0.0f, 10, null);
                    androidx.compose.ui.Alignment.Vertical centerVertically = androidx.compose.ui.Alignment.INSTANCE.getCenterVertically();
                    kotlin.jvm.functions.Function2<androidx.compose.runtime.Composer, java.lang.Integer, kotlin.Unit> function25 = function22;
                    int i10222 = i3;
                    kotlin.jvm.functions.Function2<androidx.compose.runtime.Composer, java.lang.Integer, kotlin.Unit> function26 = text;
                    composer3.startReplaceableGroup(693286680);
                    androidx.compose.runtime.ComposerKt.sourceInformation(composer3, "C(Row)P(2,1,3)78@3880L58,79@3943L130:Row.kt#2w3rfo");
                    androidx.compose.ui.layout.MeasurePolicy rowMeasurePolicy = androidx.compose.foundation.layout.RowKt.rowMeasurePolicy(androidx.compose.foundation.layout.Arrangement.INSTANCE.getStart(), centerVertically, composer3, 48);
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
                    kotlin.jvm.functions.Function3<androidx.compose.runtime.SkippableUpdater<androidx.compose.ui.node.ComposeUiNode>, androidx.compose.runtime.Composer, java.lang.Integer, kotlin.Unit> materializerOf = androidx.compose.ui.layout.LayoutKt.materializerOf(m572paddingqDBjuR0$default);
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
                    androidx.compose.runtime.Updater.m1648setimpl(m1641constructorimpl, rowMeasurePolicy, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetMeasurePolicy());
                    androidx.compose.runtime.Updater.m1648setimpl(m1641constructorimpl, density, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetDensity());
                    androidx.compose.runtime.Updater.m1648setimpl(m1641constructorimpl, layoutDirection, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetLayoutDirection());
                    androidx.compose.runtime.Updater.m1648setimpl(m1641constructorimpl, viewConfiguration, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetViewConfiguration());
                    composer3.enableReusing();
                    materializerOf.invoke(androidx.compose.runtime.SkippableUpdater.m1632boximpl(androidx.compose.runtime.SkippableUpdater.m1633constructorimpl(composer3)), composer3, 0);
                    composer3.startReplaceableGroup(2058660585);
                    composer3.startReplaceableGroup(-678309503);
                    androidx.compose.runtime.ComposerKt.sourceInformation(composer3, "C80@3988L9:Row.kt#2w3rfo");
                    androidx.compose.foundation.layout.RowScopeInstance rowScopeInstance = androidx.compose.foundation.layout.RowScopeInstance.INSTANCE;
                    composer3.startReplaceableGroup(-388203689);
                    androidx.compose.runtime.ComposerKt.sourceInformation(composer3, "C178@8253L6:FloatingActionButton.kt#jmzs0o");
                    composer3.startReplaceableGroup(-1435223762);
                    androidx.compose.runtime.ComposerKt.sourceInformation(composer3, "175@8157L6,176@8180L46");
                    if (function25 != null) {
                        function25.invoke(composer3, java.lang.Integer.valueOf((i10222 >> 9) & 14));
                        androidx.compose.ui.Modifier.Companion companion3 = androidx.compose.ui.Modifier.INSTANCE;
                        f3 = androidx.compose.material.FloatingActionButtonKt.ExtendedFabIconPadding;
                        androidx.compose.foundation.layout.SpacerKt.Spacer(androidx.compose.foundation.layout.SizeKt.m622width3ABfNKs(companion3, f3), composer3, 6);
                    }
                    composer3.endReplaceableGroup();
                    function26.invoke(composer3, java.lang.Integer.valueOf(i10222 & 14));
                    composer3.endReplaceableGroup();
                    composer3.endReplaceableGroup();
                    composer3.endReplaceableGroup();
                    composer3.endNode();
                    composer3.endReplaceableGroup();
                    composer3.endReplaceableGroup();
                    return;
                }
                composer3.skipToGroupEnd();
            }
        });
        int i9222 = ((i3 >> 3) & 14) | 12582912;
        int i10222 = i3 >> 6;
        composer2 = startRestartGroup;
        m1410FloatingActionButtonbogVsAg(onClick, m621sizeInqDBjuR0$default222, mutableInteractionSource3, shape2, j7, j6, floatingActionButtonElevation3, composableLambda222, startRestartGroup, i9222 | (i10222 & 896) | (i10222 & 7168) | (57344 & i10222) | (458752 & i10222) | (i10222 & 3670016), 0);
        modifier3 = modifier2;
        mutableInteractionSource4 = mutableInteractionSource3;
        shape3 = shape2;
        j8 = j7;
        function23 = function22;
        j9 = j6;
        floatingActionButtonElevation4 = floatingActionButtonElevation3;
        endRestartGroup = composer2.endRestartGroup();
        if (endRestartGroup != null) {
        }
    }
}
