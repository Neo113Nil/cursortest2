package androidx.compose.foundation;

/* compiled from: AndroidExternalSurface.android.kt */
@kotlin.Metadata(d1 = {"\u0000H\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u001aU\u0010\u0000\u001a\u00020\u00012\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\t2\u0017\u0010\n\u001a\u0013\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\u00010\u000b¢\u0006\u0002\b\rH\u0007ø\u0001\u0000¢\u0006\u0004\b\u000e\u0010\u000f\u001a]\u0010\u0010\u001a\u00020\u00012\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\u0011\u001a\u00020\u00122\b\b\u0002\u0010\u0013\u001a\u00020\u00052\u0017\u0010\n\u001a\u0013\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\u00010\u000b¢\u0006\u0002\b\rH\u0007ø\u0001\u0000¢\u0006\u0004\b\u0014\u0010\u0015\u001a\r\u0010\u0016\u001a\u00020\u0017H\u0003¢\u0006\u0002\u0010\u0018\u001a\r\u0010\u0019\u001a\u00020\u001aH\u0003¢\u0006\u0002\u0010\u001b\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006\u001c"}, d2 = {"AndroidEmbeddedExternalSurface", "", "modifier", "Landroidx/compose/ui/Modifier;", "isOpaque", "", "surfaceSize", "Landroidx/compose/ui/unit/IntSize;", "transform", "Landroidx/compose/ui/graphics/Matrix;", "onInit", "Lkotlin/Function1;", "Landroidx/compose/foundation/AndroidExternalSurfaceScope;", "Lkotlin/ExtensionFunctionType;", "AndroidEmbeddedExternalSurface-sv6N_fY", "(Landroidx/compose/ui/Modifier;ZJ[FLkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V", "AndroidExternalSurface", "zOrder", "Landroidx/compose/foundation/AndroidExternalSurfaceZOrder;", "isSecure", "AndroidExternalSurface-58FFMhA", "(Landroidx/compose/ui/Modifier;ZJIZLkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V", "rememberAndroidEmbeddedExternalSurfaceState", "Landroidx/compose/foundation/AndroidEmbeddedExternalSurfaceState;", "(Landroidx/compose/runtime/Composer;I)Landroidx/compose/foundation/AndroidEmbeddedExternalSurfaceState;", "rememberAndroidExternalSurfaceState", "Landroidx/compose/foundation/AndroidExternalSurfaceState;", "(Landroidx/compose/runtime/Composer;I)Landroidx/compose/foundation/AndroidExternalSurfaceState;", "foundation_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public final class AndroidExternalSurface_androidKt {
    private static final androidx.compose.foundation.AndroidExternalSurfaceState rememberAndroidExternalSurfaceState(androidx.compose.runtime.Composer composer, int i) {
        composer.startReplaceableGroup(-873615933);
        androidx.compose.runtime.ComposerKt.sourceInformation(composer, "C(rememberAndroidExternalSurfaceState)190@7150L24,191@7186L47:AndroidExternalSurface.android.kt#71ulvw");
        if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
            androidx.compose.runtime.ComposerKt.traceEventStart(-873615933, i, -1, "androidx.compose.foundation.rememberAndroidExternalSurfaceState (AndroidExternalSurface.android.kt:189)");
        }
        composer.startReplaceableGroup(773894976);
        androidx.compose.runtime.ComposerKt.sourceInformation(composer, "CC(rememberCoroutineScope)489@20472L144:Effects.kt#9igjgp");
        composer.startReplaceableGroup(-492369756);
        androidx.compose.runtime.ComposerKt.sourceInformation(composer, "CC(remember):Composables.kt#9igjgp");
        java.lang.Object rememberedValue = composer.rememberedValue();
        if (rememberedValue == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
            androidx.compose.runtime.CompositionScopedCoroutineScopeCanceller compositionScopedCoroutineScopeCanceller = new androidx.compose.runtime.CompositionScopedCoroutineScopeCanceller(androidx.compose.runtime.EffectsKt.createCompositionCoroutineScope(kotlin.coroutines.EmptyCoroutineContext.INSTANCE, composer));
            composer.updateRememberedValue(compositionScopedCoroutineScopeCanceller);
            rememberedValue = compositionScopedCoroutineScopeCanceller;
        }
        composer.endReplaceableGroup();
        kotlinx.coroutines.CoroutineScope coroutineScope = ((androidx.compose.runtime.CompositionScopedCoroutineScopeCanceller) rememberedValue).getCoroutineScope();
        composer.endReplaceableGroup();
        composer.startReplaceableGroup(-492369756);
        androidx.compose.runtime.ComposerKt.sourceInformation(composer, "CC(remember):Composables.kt#9igjgp");
        java.lang.Object rememberedValue2 = composer.rememberedValue();
        if (rememberedValue2 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
            rememberedValue2 = new androidx.compose.foundation.AndroidExternalSurfaceState(coroutineScope);
            composer.updateRememberedValue(rememberedValue2);
        }
        composer.endReplaceableGroup();
        androidx.compose.foundation.AndroidExternalSurfaceState androidExternalSurfaceState = (androidx.compose.foundation.AndroidExternalSurfaceState) rememberedValue2;
        if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
            androidx.compose.runtime.ComposerKt.traceEventEnd();
        }
        composer.endReplaceableGroup();
        return androidExternalSurfaceState;
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0050  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x006b  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0087  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x00a5  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x00c3  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x019d  */
    /* JADX WARN: Removed duplicated region for block: B:38:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:41:0x00da  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x0120  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x0158  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x018f  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x00f2  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x00fa  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x0100  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x010b  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x0115  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x00f7  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x00a9  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x008a  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x006e  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x0065  */
    /* renamed from: AndroidExternalSurface-58FFMhA, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void m208AndroidExternalSurface58FFMhA(androidx.compose.ui.Modifier modifier, boolean z, long j, int i, boolean z2, final kotlin.jvm.functions.Function1<? super androidx.compose.foundation.AndroidExternalSurfaceScope, kotlin.Unit> function1, androidx.compose.runtime.Composer composer, final int i2, final int i3) {
        androidx.compose.ui.Modifier modifier2;
        int i4;
        boolean z3;
        long j2;
        int i5;
        int i6;
        int i7;
        boolean z4;
        int i8;
        androidx.compose.ui.Modifier.Companion companion;
        long j3;
        boolean z5;
        boolean changed;
        java.lang.Object rememberedValue;
        final boolean z6;
        final boolean z7;
        final int i9;
        androidx.compose.runtime.ScopeUpdateScope endRestartGroup;
        int i10;
        androidx.compose.runtime.Composer startRestartGroup = composer.startRestartGroup(640888974);
        androidx.compose.runtime.ComposerKt.sourceInformation(startRestartGroup, "C(AndroidExternalSurface)P(2!1,4:c#ui.unit.IntSize,5:c#foundation.AndroidExternalSurfaceZOrder)288@12167L37,290@12210L1032:AndroidExternalSurface.android.kt#71ulvw");
        int i11 = i3 & 1;
        if (i11 != 0) {
            i4 = i2 | 6;
            modifier2 = modifier;
        } else if ((i2 & 14) == 0) {
            modifier2 = modifier;
            i4 = (startRestartGroup.changed(modifier2) ? 4 : 2) | i2;
        } else {
            modifier2 = modifier;
            i4 = i2;
        }
        int i12 = i3 & 2;
        if (i12 != 0) {
            i4 |= 48;
        } else if ((i2 & 112) == 0) {
            z3 = z;
            i4 |= startRestartGroup.changed(z3) ? 32 : 16;
            if ((i2 & 896) != 0) {
                if ((i3 & 4) == 0) {
                    j2 = j;
                    if (startRestartGroup.changed(j2)) {
                        i10 = 256;
                        i4 |= i10;
                    }
                } else {
                    j2 = j;
                }
                i10 = 128;
                i4 |= i10;
            } else {
                j2 = j;
            }
            i5 = i3 & 8;
            if (i5 == 0) {
                i4 |= 3072;
            } else if ((i2 & 7168) == 0) {
                i6 = i;
                i4 |= startRestartGroup.changed(i6) ? 2048 : 1024;
                i7 = i3 & 16;
                if (i7 != 0) {
                    i4 |= 24576;
                } else if ((57344 & i2) == 0) {
                    z4 = z2;
                    i4 |= startRestartGroup.changed(z4) ? 16384 : 8192;
                    if ((i3 & 32) != 0) {
                        if ((458752 & i2) == 0) {
                            i8 = startRestartGroup.changedInstance(function1) ? 131072 : 65536;
                        }
                        if ((374491 & i4) == 74898 || !startRestartGroup.getSkipping()) {
                            startRestartGroup.startDefaults();
                            if ((i2 & 1) != 0 || startRestartGroup.getDefaultsInvalid()) {
                                companion = i11 != 0 ? androidx.compose.ui.Modifier.INSTANCE : modifier2;
                                if (i12 != 0) {
                                    z3 = true;
                                }
                                if ((i3 & 4) != 0) {
                                    i4 &= -897;
                                    j2 = androidx.compose.ui.unit.IntSize.INSTANCE.m4657getZeroYbymL2g();
                                }
                                if (i5 != 0) {
                                    i6 = androidx.compose.foundation.AndroidExternalSurfaceZOrder.INSTANCE.m204getBehindB_4ceCc();
                                }
                                j3 = j2;
                                if (i7 != 0) {
                                    z5 = false;
                                    int i13 = i4;
                                    final int i14 = i6;
                                    startRestartGroup.endDefaults();
                                    if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                                        androidx.compose.runtime.ComposerKt.traceEventStart(640888974, i13, -1, "androidx.compose.foundation.AndroidExternalSurface (AndroidExternalSurface.android.kt:287)");
                                    }
                                    final androidx.compose.foundation.AndroidExternalSurfaceState rememberAndroidExternalSurfaceState = rememberAndroidExternalSurfaceState(startRestartGroup, 0);
                                    kotlin.jvm.functions.Function1<android.content.Context, android.view.SurfaceView> function12 = new kotlin.jvm.functions.Function1<android.content.Context, android.view.SurfaceView>() { // from class: androidx.compose.foundation.AndroidExternalSurface_androidKt$AndroidExternalSurface$1
                                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                        /* JADX WARN: Multi-variable type inference failed */
                                        {
                                            super(1);
                                        }

                                        @Override // kotlin.jvm.functions.Function1
                                        public final android.view.SurfaceView invoke(android.content.Context context) {
                                            android.view.SurfaceView surfaceView = new android.view.SurfaceView(context);
                                            kotlin.jvm.functions.Function1<androidx.compose.foundation.AndroidExternalSurfaceScope, kotlin.Unit> function13 = function1;
                                            androidx.compose.foundation.AndroidExternalSurfaceState androidExternalSurfaceState = rememberAndroidExternalSurfaceState;
                                            function13.invoke(androidExternalSurfaceState);
                                            surfaceView.getHolder().addCallback(androidExternalSurfaceState);
                                            return surfaceView;
                                        }
                                    };
                                    androidx.compose.foundation.AndroidExternalSurface_androidKt$AndroidExternalSurface$2 androidExternalSurface_androidKt$AndroidExternalSurface$2 = new kotlin.jvm.functions.Function1<android.view.SurfaceView, kotlin.Unit>() { // from class: androidx.compose.foundation.AndroidExternalSurface_androidKt$AndroidExternalSurface$2
                                        /* renamed from: invoke, reason: avoid collision after fix types in other method */
                                        public final void invoke2(android.view.SurfaceView surfaceView) {
                                        }

                                        @Override // kotlin.jvm.functions.Function1
                                        public /* bridge */ /* synthetic */ kotlin.Unit invoke(android.view.SurfaceView surfaceView) {
                                            invoke2(surfaceView);
                                            return kotlin.Unit.INSTANCE;
                                        }
                                    };
                                    startRestartGroup.startReplaceableGroup(-1909066533);
                                    changed = startRestartGroup.changed(j3) | startRestartGroup.changed(z3) | startRestartGroup.changed(i14) | startRestartGroup.changed(z5);
                                    rememberedValue = startRestartGroup.rememberedValue();
                                    if (!changed || rememberedValue == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                                        final long j4 = j3;
                                        final boolean z8 = z3;
                                        final boolean z9 = z5;
                                        rememberedValue = (kotlin.jvm.functions.Function1) new kotlin.jvm.functions.Function1<android.view.SurfaceView, kotlin.Unit>() { // from class: androidx.compose.foundation.AndroidExternalSurface_androidKt$AndroidExternalSurface$3$1
                                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                            {
                                                super(1);
                                            }

                                            @Override // kotlin.jvm.functions.Function1
                                            public /* bridge */ /* synthetic */ kotlin.Unit invoke(android.view.SurfaceView surfaceView) {
                                                invoke2(surfaceView);
                                                return kotlin.Unit.INSTANCE;
                                            }

                                            /* renamed from: invoke, reason: avoid collision after fix types in other method */
                                            public final void invoke2(android.view.SurfaceView surfaceView) {
                                                if (!androidx.compose.ui.unit.IntSize.m4650equalsimpl0(j4, androidx.compose.ui.unit.IntSize.INSTANCE.m4657getZeroYbymL2g())) {
                                                    surfaceView.getHolder().setFixedSize(androidx.compose.ui.unit.IntSize.m4652getWidthimpl(j4), androidx.compose.ui.unit.IntSize.m4651getHeightimpl(j4));
                                                } else {
                                                    surfaceView.getHolder().setSizeFromLayout();
                                                }
                                                surfaceView.getHolder().setFormat(z8 ? -1 : -3);
                                                int i15 = i14;
                                                if (androidx.compose.foundation.AndroidExternalSurfaceZOrder.m200equalsimpl0(i15, androidx.compose.foundation.AndroidExternalSurfaceZOrder.INSTANCE.m204getBehindB_4ceCc())) {
                                                    surfaceView.setZOrderOnTop(false);
                                                } else if (androidx.compose.foundation.AndroidExternalSurfaceZOrder.m200equalsimpl0(i15, androidx.compose.foundation.AndroidExternalSurfaceZOrder.INSTANCE.m205getMediaOverlayB_4ceCc())) {
                                                    surfaceView.setZOrderMediaOverlay(true);
                                                } else if (androidx.compose.foundation.AndroidExternalSurfaceZOrder.m200equalsimpl0(i15, androidx.compose.foundation.AndroidExternalSurfaceZOrder.INSTANCE.m206getOnTopB_4ceCc())) {
                                                    surfaceView.setZOrderOnTop(true);
                                                }
                                                surfaceView.setSecure(z9);
                                            }
                                        };
                                        startRestartGroup.updateRememberedValue(rememberedValue);
                                    }
                                    startRestartGroup.endReplaceableGroup();
                                    androidx.compose.ui.viewinterop.AndroidView_androidKt.AndroidView(function12, companion, androidExternalSurface_androidKt$AndroidExternalSurface$2, null, (kotlin.jvm.functions.Function1) rememberedValue, startRestartGroup, ((i13 << 3) & 112) | 384, 8);
                                    if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                                        androidx.compose.runtime.ComposerKt.traceEventEnd();
                                    }
                                    j2 = j3;
                                    z6 = z3;
                                    modifier2 = companion;
                                    z7 = z5;
                                    i9 = i14;
                                }
                            } else {
                                startRestartGroup.skipToGroupEnd();
                                if ((i3 & 4) != 0) {
                                    i4 &= -897;
                                }
                                companion = modifier2;
                                j3 = j2;
                            }
                            z5 = z4;
                            int i132 = i4;
                            final int i142 = i6;
                            startRestartGroup.endDefaults();
                            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                            }
                            final androidx.compose.foundation.AndroidExternalSurfaceState rememberAndroidExternalSurfaceState2 = rememberAndroidExternalSurfaceState(startRestartGroup, 0);
                            kotlin.jvm.functions.Function1<android.content.Context, android.view.SurfaceView> function122 = new kotlin.jvm.functions.Function1<android.content.Context, android.view.SurfaceView>() { // from class: androidx.compose.foundation.AndroidExternalSurface_androidKt$AndroidExternalSurface$1
                                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                /* JADX WARN: Multi-variable type inference failed */
                                {
                                    super(1);
                                }

                                @Override // kotlin.jvm.functions.Function1
                                public final android.view.SurfaceView invoke(android.content.Context context) {
                                    android.view.SurfaceView surfaceView = new android.view.SurfaceView(context);
                                    kotlin.jvm.functions.Function1<androidx.compose.foundation.AndroidExternalSurfaceScope, kotlin.Unit> function13 = function1;
                                    androidx.compose.foundation.AndroidExternalSurfaceState androidExternalSurfaceState = rememberAndroidExternalSurfaceState2;
                                    function13.invoke(androidExternalSurfaceState);
                                    surfaceView.getHolder().addCallback(androidExternalSurfaceState);
                                    return surfaceView;
                                }
                            };
                            androidx.compose.foundation.AndroidExternalSurface_androidKt$AndroidExternalSurface$2 androidExternalSurface_androidKt$AndroidExternalSurface$22 = new kotlin.jvm.functions.Function1<android.view.SurfaceView, kotlin.Unit>() { // from class: androidx.compose.foundation.AndroidExternalSurface_androidKt$AndroidExternalSurface$2
                                /* renamed from: invoke, reason: avoid collision after fix types in other method */
                                public final void invoke2(android.view.SurfaceView surfaceView) {
                                }

                                @Override // kotlin.jvm.functions.Function1
                                public /* bridge */ /* synthetic */ kotlin.Unit invoke(android.view.SurfaceView surfaceView) {
                                    invoke2(surfaceView);
                                    return kotlin.Unit.INSTANCE;
                                }
                            };
                            startRestartGroup.startReplaceableGroup(-1909066533);
                            changed = startRestartGroup.changed(j3) | startRestartGroup.changed(z3) | startRestartGroup.changed(i142) | startRestartGroup.changed(z5);
                            rememberedValue = startRestartGroup.rememberedValue();
                            if (!changed) {
                            }
                            final long j42 = j3;
                            final boolean z82 = z3;
                            final boolean z92 = z5;
                            rememberedValue = (kotlin.jvm.functions.Function1) new kotlin.jvm.functions.Function1<android.view.SurfaceView, kotlin.Unit>() { // from class: androidx.compose.foundation.AndroidExternalSurface_androidKt$AndroidExternalSurface$3$1
                                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                {
                                    super(1);
                                }

                                @Override // kotlin.jvm.functions.Function1
                                public /* bridge */ /* synthetic */ kotlin.Unit invoke(android.view.SurfaceView surfaceView) {
                                    invoke2(surfaceView);
                                    return kotlin.Unit.INSTANCE;
                                }

                                /* renamed from: invoke, reason: avoid collision after fix types in other method */
                                public final void invoke2(android.view.SurfaceView surfaceView) {
                                    if (!androidx.compose.ui.unit.IntSize.m4650equalsimpl0(j42, androidx.compose.ui.unit.IntSize.INSTANCE.m4657getZeroYbymL2g())) {
                                        surfaceView.getHolder().setFixedSize(androidx.compose.ui.unit.IntSize.m4652getWidthimpl(j42), androidx.compose.ui.unit.IntSize.m4651getHeightimpl(j42));
                                    } else {
                                        surfaceView.getHolder().setSizeFromLayout();
                                    }
                                    surfaceView.getHolder().setFormat(z82 ? -1 : -3);
                                    int i15 = i142;
                                    if (androidx.compose.foundation.AndroidExternalSurfaceZOrder.m200equalsimpl0(i15, androidx.compose.foundation.AndroidExternalSurfaceZOrder.INSTANCE.m204getBehindB_4ceCc())) {
                                        surfaceView.setZOrderOnTop(false);
                                    } else if (androidx.compose.foundation.AndroidExternalSurfaceZOrder.m200equalsimpl0(i15, androidx.compose.foundation.AndroidExternalSurfaceZOrder.INSTANCE.m205getMediaOverlayB_4ceCc())) {
                                        surfaceView.setZOrderMediaOverlay(true);
                                    } else if (androidx.compose.foundation.AndroidExternalSurfaceZOrder.m200equalsimpl0(i15, androidx.compose.foundation.AndroidExternalSurfaceZOrder.INSTANCE.m206getOnTopB_4ceCc())) {
                                        surfaceView.setZOrderOnTop(true);
                                    }
                                    surfaceView.setSecure(z92);
                                }
                            };
                            startRestartGroup.updateRememberedValue(rememberedValue);
                            startRestartGroup.endReplaceableGroup();
                            androidx.compose.ui.viewinterop.AndroidView_androidKt.AndroidView(function122, companion, androidExternalSurface_androidKt$AndroidExternalSurface$22, null, (kotlin.jvm.functions.Function1) rememberedValue, startRestartGroup, ((i132 << 3) & 112) | 384, 8);
                            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                            }
                            j2 = j3;
                            z6 = z3;
                            modifier2 = companion;
                            z7 = z5;
                            i9 = i142;
                        } else {
                            startRestartGroup.skipToGroupEnd();
                            z6 = z3;
                            i9 = i6;
                            z7 = z4;
                        }
                        endRestartGroup = startRestartGroup.endRestartGroup();
                        if (endRestartGroup != null) {
                            final androidx.compose.ui.Modifier modifier3 = modifier2;
                            final long j5 = j2;
                            endRestartGroup.updateScope(new kotlin.jvm.functions.Function2<androidx.compose.runtime.Composer, java.lang.Integer, kotlin.Unit>() { // from class: androidx.compose.foundation.AndroidExternalSurface_androidKt$AndroidExternalSurface$4
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

                                public final void invoke(androidx.compose.runtime.Composer composer2, int i15) {
                                    androidx.compose.foundation.AndroidExternalSurface_androidKt.m208AndroidExternalSurface58FFMhA(androidx.compose.ui.Modifier.this, z6, j5, i9, z7, function1, composer2, androidx.compose.runtime.RecomposeScopeImplKt.updateChangedFlags(i2 | 1), i3);
                                }
                            });
                            return;
                        }
                        return;
                    }
                    i8 = androidx.profileinstaller.ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE;
                    i4 |= i8;
                    if ((374491 & i4) == 74898) {
                    }
                    startRestartGroup.startDefaults();
                    if ((i2 & 1) != 0) {
                    }
                    if (i11 != 0) {
                    }
                    if (i12 != 0) {
                    }
                    if ((i3 & 4) != 0) {
                    }
                    if (i5 != 0) {
                    }
                    j3 = j2;
                    if (i7 != 0) {
                    }
                    z5 = z4;
                    int i1322 = i4;
                    final int i1422 = i6;
                    startRestartGroup.endDefaults();
                    if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                    }
                    final androidx.compose.foundation.AndroidExternalSurfaceState rememberAndroidExternalSurfaceState22 = rememberAndroidExternalSurfaceState(startRestartGroup, 0);
                    kotlin.jvm.functions.Function1<android.content.Context, android.view.SurfaceView> function1222 = new kotlin.jvm.functions.Function1<android.content.Context, android.view.SurfaceView>() { // from class: androidx.compose.foundation.AndroidExternalSurface_androidKt$AndroidExternalSurface$1
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        /* JADX WARN: Multi-variable type inference failed */
                        {
                            super(1);
                        }

                        @Override // kotlin.jvm.functions.Function1
                        public final android.view.SurfaceView invoke(android.content.Context context) {
                            android.view.SurfaceView surfaceView = new android.view.SurfaceView(context);
                            kotlin.jvm.functions.Function1<androidx.compose.foundation.AndroidExternalSurfaceScope, kotlin.Unit> function13 = function1;
                            androidx.compose.foundation.AndroidExternalSurfaceState androidExternalSurfaceState = rememberAndroidExternalSurfaceState22;
                            function13.invoke(androidExternalSurfaceState);
                            surfaceView.getHolder().addCallback(androidExternalSurfaceState);
                            return surfaceView;
                        }
                    };
                    androidx.compose.foundation.AndroidExternalSurface_androidKt$AndroidExternalSurface$2 androidExternalSurface_androidKt$AndroidExternalSurface$222 = new kotlin.jvm.functions.Function1<android.view.SurfaceView, kotlin.Unit>() { // from class: androidx.compose.foundation.AndroidExternalSurface_androidKt$AndroidExternalSurface$2
                        /* renamed from: invoke, reason: avoid collision after fix types in other method */
                        public final void invoke2(android.view.SurfaceView surfaceView) {
                        }

                        @Override // kotlin.jvm.functions.Function1
                        public /* bridge */ /* synthetic */ kotlin.Unit invoke(android.view.SurfaceView surfaceView) {
                            invoke2(surfaceView);
                            return kotlin.Unit.INSTANCE;
                        }
                    };
                    startRestartGroup.startReplaceableGroup(-1909066533);
                    changed = startRestartGroup.changed(j3) | startRestartGroup.changed(z3) | startRestartGroup.changed(i1422) | startRestartGroup.changed(z5);
                    rememberedValue = startRestartGroup.rememberedValue();
                    if (!changed) {
                    }
                    final long j422 = j3;
                    final boolean z822 = z3;
                    final boolean z922 = z5;
                    rememberedValue = (kotlin.jvm.functions.Function1) new kotlin.jvm.functions.Function1<android.view.SurfaceView, kotlin.Unit>() { // from class: androidx.compose.foundation.AndroidExternalSurface_androidKt$AndroidExternalSurface$3$1
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        {
                            super(1);
                        }

                        @Override // kotlin.jvm.functions.Function1
                        public /* bridge */ /* synthetic */ kotlin.Unit invoke(android.view.SurfaceView surfaceView) {
                            invoke2(surfaceView);
                            return kotlin.Unit.INSTANCE;
                        }

                        /* renamed from: invoke, reason: avoid collision after fix types in other method */
                        public final void invoke2(android.view.SurfaceView surfaceView) {
                            if (!androidx.compose.ui.unit.IntSize.m4650equalsimpl0(j422, androidx.compose.ui.unit.IntSize.INSTANCE.m4657getZeroYbymL2g())) {
                                surfaceView.getHolder().setFixedSize(androidx.compose.ui.unit.IntSize.m4652getWidthimpl(j422), androidx.compose.ui.unit.IntSize.m4651getHeightimpl(j422));
                            } else {
                                surfaceView.getHolder().setSizeFromLayout();
                            }
                            surfaceView.getHolder().setFormat(z822 ? -1 : -3);
                            int i15 = i1422;
                            if (androidx.compose.foundation.AndroidExternalSurfaceZOrder.m200equalsimpl0(i15, androidx.compose.foundation.AndroidExternalSurfaceZOrder.INSTANCE.m204getBehindB_4ceCc())) {
                                surfaceView.setZOrderOnTop(false);
                            } else if (androidx.compose.foundation.AndroidExternalSurfaceZOrder.m200equalsimpl0(i15, androidx.compose.foundation.AndroidExternalSurfaceZOrder.INSTANCE.m205getMediaOverlayB_4ceCc())) {
                                surfaceView.setZOrderMediaOverlay(true);
                            } else if (androidx.compose.foundation.AndroidExternalSurfaceZOrder.m200equalsimpl0(i15, androidx.compose.foundation.AndroidExternalSurfaceZOrder.INSTANCE.m206getOnTopB_4ceCc())) {
                                surfaceView.setZOrderOnTop(true);
                            }
                            surfaceView.setSecure(z922);
                        }
                    };
                    startRestartGroup.updateRememberedValue(rememberedValue);
                    startRestartGroup.endReplaceableGroup();
                    androidx.compose.ui.viewinterop.AndroidView_androidKt.AndroidView(function1222, companion, androidExternalSurface_androidKt$AndroidExternalSurface$222, null, (kotlin.jvm.functions.Function1) rememberedValue, startRestartGroup, ((i1322 << 3) & 112) | 384, 8);
                    if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                    }
                    j2 = j3;
                    z6 = z3;
                    modifier2 = companion;
                    z7 = z5;
                    i9 = i1422;
                    endRestartGroup = startRestartGroup.endRestartGroup();
                    if (endRestartGroup != null) {
                    }
                }
                z4 = z2;
                if ((i3 & 32) != 0) {
                }
                i4 |= i8;
                if ((374491 & i4) == 74898) {
                }
                startRestartGroup.startDefaults();
                if ((i2 & 1) != 0) {
                }
                if (i11 != 0) {
                }
                if (i12 != 0) {
                }
                if ((i3 & 4) != 0) {
                }
                if (i5 != 0) {
                }
                j3 = j2;
                if (i7 != 0) {
                }
                z5 = z4;
                int i13222 = i4;
                final int i14222 = i6;
                startRestartGroup.endDefaults();
                if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                }
                final androidx.compose.foundation.AndroidExternalSurfaceState rememberAndroidExternalSurfaceState222 = rememberAndroidExternalSurfaceState(startRestartGroup, 0);
                kotlin.jvm.functions.Function1<android.content.Context, android.view.SurfaceView> function12222 = new kotlin.jvm.functions.Function1<android.content.Context, android.view.SurfaceView>() { // from class: androidx.compose.foundation.AndroidExternalSurface_androidKt$AndroidExternalSurface$1
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    /* JADX WARN: Multi-variable type inference failed */
                    {
                        super(1);
                    }

                    @Override // kotlin.jvm.functions.Function1
                    public final android.view.SurfaceView invoke(android.content.Context context) {
                        android.view.SurfaceView surfaceView = new android.view.SurfaceView(context);
                        kotlin.jvm.functions.Function1<androidx.compose.foundation.AndroidExternalSurfaceScope, kotlin.Unit> function13 = function1;
                        androidx.compose.foundation.AndroidExternalSurfaceState androidExternalSurfaceState = rememberAndroidExternalSurfaceState222;
                        function13.invoke(androidExternalSurfaceState);
                        surfaceView.getHolder().addCallback(androidExternalSurfaceState);
                        return surfaceView;
                    }
                };
                androidx.compose.foundation.AndroidExternalSurface_androidKt$AndroidExternalSurface$2 androidExternalSurface_androidKt$AndroidExternalSurface$2222 = new kotlin.jvm.functions.Function1<android.view.SurfaceView, kotlin.Unit>() { // from class: androidx.compose.foundation.AndroidExternalSurface_androidKt$AndroidExternalSurface$2
                    /* renamed from: invoke, reason: avoid collision after fix types in other method */
                    public final void invoke2(android.view.SurfaceView surfaceView) {
                    }

                    @Override // kotlin.jvm.functions.Function1
                    public /* bridge */ /* synthetic */ kotlin.Unit invoke(android.view.SurfaceView surfaceView) {
                        invoke2(surfaceView);
                        return kotlin.Unit.INSTANCE;
                    }
                };
                startRestartGroup.startReplaceableGroup(-1909066533);
                changed = startRestartGroup.changed(j3) | startRestartGroup.changed(z3) | startRestartGroup.changed(i14222) | startRestartGroup.changed(z5);
                rememberedValue = startRestartGroup.rememberedValue();
                if (!changed) {
                }
                final long j4222 = j3;
                final boolean z8222 = z3;
                final boolean z9222 = z5;
                rememberedValue = (kotlin.jvm.functions.Function1) new kotlin.jvm.functions.Function1<android.view.SurfaceView, kotlin.Unit>() { // from class: androidx.compose.foundation.AndroidExternalSurface_androidKt$AndroidExternalSurface$3$1
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(1);
                    }

                    @Override // kotlin.jvm.functions.Function1
                    public /* bridge */ /* synthetic */ kotlin.Unit invoke(android.view.SurfaceView surfaceView) {
                        invoke2(surfaceView);
                        return kotlin.Unit.INSTANCE;
                    }

                    /* renamed from: invoke, reason: avoid collision after fix types in other method */
                    public final void invoke2(android.view.SurfaceView surfaceView) {
                        if (!androidx.compose.ui.unit.IntSize.m4650equalsimpl0(j4222, androidx.compose.ui.unit.IntSize.INSTANCE.m4657getZeroYbymL2g())) {
                            surfaceView.getHolder().setFixedSize(androidx.compose.ui.unit.IntSize.m4652getWidthimpl(j4222), androidx.compose.ui.unit.IntSize.m4651getHeightimpl(j4222));
                        } else {
                            surfaceView.getHolder().setSizeFromLayout();
                        }
                        surfaceView.getHolder().setFormat(z8222 ? -1 : -3);
                        int i15 = i14222;
                        if (androidx.compose.foundation.AndroidExternalSurfaceZOrder.m200equalsimpl0(i15, androidx.compose.foundation.AndroidExternalSurfaceZOrder.INSTANCE.m204getBehindB_4ceCc())) {
                            surfaceView.setZOrderOnTop(false);
                        } else if (androidx.compose.foundation.AndroidExternalSurfaceZOrder.m200equalsimpl0(i15, androidx.compose.foundation.AndroidExternalSurfaceZOrder.INSTANCE.m205getMediaOverlayB_4ceCc())) {
                            surfaceView.setZOrderMediaOverlay(true);
                        } else if (androidx.compose.foundation.AndroidExternalSurfaceZOrder.m200equalsimpl0(i15, androidx.compose.foundation.AndroidExternalSurfaceZOrder.INSTANCE.m206getOnTopB_4ceCc())) {
                            surfaceView.setZOrderOnTop(true);
                        }
                        surfaceView.setSecure(z9222);
                    }
                };
                startRestartGroup.updateRememberedValue(rememberedValue);
                startRestartGroup.endReplaceableGroup();
                androidx.compose.ui.viewinterop.AndroidView_androidKt.AndroidView(function12222, companion, androidExternalSurface_androidKt$AndroidExternalSurface$2222, null, (kotlin.jvm.functions.Function1) rememberedValue, startRestartGroup, ((i13222 << 3) & 112) | 384, 8);
                if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                }
                j2 = j3;
                z6 = z3;
                modifier2 = companion;
                z7 = z5;
                i9 = i14222;
                endRestartGroup = startRestartGroup.endRestartGroup();
                if (endRestartGroup != null) {
                }
            }
            i6 = i;
            i7 = i3 & 16;
            if (i7 != 0) {
            }
            z4 = z2;
            if ((i3 & 32) != 0) {
            }
            i4 |= i8;
            if ((374491 & i4) == 74898) {
            }
            startRestartGroup.startDefaults();
            if ((i2 & 1) != 0) {
            }
            if (i11 != 0) {
            }
            if (i12 != 0) {
            }
            if ((i3 & 4) != 0) {
            }
            if (i5 != 0) {
            }
            j3 = j2;
            if (i7 != 0) {
            }
            z5 = z4;
            int i132222 = i4;
            final int i142222 = i6;
            startRestartGroup.endDefaults();
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
            }
            final androidx.compose.foundation.AndroidExternalSurfaceState rememberAndroidExternalSurfaceState2222 = rememberAndroidExternalSurfaceState(startRestartGroup, 0);
            kotlin.jvm.functions.Function1<android.content.Context, android.view.SurfaceView> function122222 = new kotlin.jvm.functions.Function1<android.content.Context, android.view.SurfaceView>() { // from class: androidx.compose.foundation.AndroidExternalSurface_androidKt$AndroidExternalSurface$1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                /* JADX WARN: Multi-variable type inference failed */
                {
                    super(1);
                }

                @Override // kotlin.jvm.functions.Function1
                public final android.view.SurfaceView invoke(android.content.Context context) {
                    android.view.SurfaceView surfaceView = new android.view.SurfaceView(context);
                    kotlin.jvm.functions.Function1<androidx.compose.foundation.AndroidExternalSurfaceScope, kotlin.Unit> function13 = function1;
                    androidx.compose.foundation.AndroidExternalSurfaceState androidExternalSurfaceState = rememberAndroidExternalSurfaceState2222;
                    function13.invoke(androidExternalSurfaceState);
                    surfaceView.getHolder().addCallback(androidExternalSurfaceState);
                    return surfaceView;
                }
            };
            androidx.compose.foundation.AndroidExternalSurface_androidKt$AndroidExternalSurface$2 androidExternalSurface_androidKt$AndroidExternalSurface$22222 = new kotlin.jvm.functions.Function1<android.view.SurfaceView, kotlin.Unit>() { // from class: androidx.compose.foundation.AndroidExternalSurface_androidKt$AndroidExternalSurface$2
                /* renamed from: invoke, reason: avoid collision after fix types in other method */
                public final void invoke2(android.view.SurfaceView surfaceView) {
                }

                @Override // kotlin.jvm.functions.Function1
                public /* bridge */ /* synthetic */ kotlin.Unit invoke(android.view.SurfaceView surfaceView) {
                    invoke2(surfaceView);
                    return kotlin.Unit.INSTANCE;
                }
            };
            startRestartGroup.startReplaceableGroup(-1909066533);
            changed = startRestartGroup.changed(j3) | startRestartGroup.changed(z3) | startRestartGroup.changed(i142222) | startRestartGroup.changed(z5);
            rememberedValue = startRestartGroup.rememberedValue();
            if (!changed) {
            }
            final long j42222 = j3;
            final boolean z82222 = z3;
            final boolean z92222 = z5;
            rememberedValue = (kotlin.jvm.functions.Function1) new kotlin.jvm.functions.Function1<android.view.SurfaceView, kotlin.Unit>() { // from class: androidx.compose.foundation.AndroidExternalSurface_androidKt$AndroidExternalSurface$3$1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(1);
                }

                @Override // kotlin.jvm.functions.Function1
                public /* bridge */ /* synthetic */ kotlin.Unit invoke(android.view.SurfaceView surfaceView) {
                    invoke2(surfaceView);
                    return kotlin.Unit.INSTANCE;
                }

                /* renamed from: invoke, reason: avoid collision after fix types in other method */
                public final void invoke2(android.view.SurfaceView surfaceView) {
                    if (!androidx.compose.ui.unit.IntSize.m4650equalsimpl0(j42222, androidx.compose.ui.unit.IntSize.INSTANCE.m4657getZeroYbymL2g())) {
                        surfaceView.getHolder().setFixedSize(androidx.compose.ui.unit.IntSize.m4652getWidthimpl(j42222), androidx.compose.ui.unit.IntSize.m4651getHeightimpl(j42222));
                    } else {
                        surfaceView.getHolder().setSizeFromLayout();
                    }
                    surfaceView.getHolder().setFormat(z82222 ? -1 : -3);
                    int i15 = i142222;
                    if (androidx.compose.foundation.AndroidExternalSurfaceZOrder.m200equalsimpl0(i15, androidx.compose.foundation.AndroidExternalSurfaceZOrder.INSTANCE.m204getBehindB_4ceCc())) {
                        surfaceView.setZOrderOnTop(false);
                    } else if (androidx.compose.foundation.AndroidExternalSurfaceZOrder.m200equalsimpl0(i15, androidx.compose.foundation.AndroidExternalSurfaceZOrder.INSTANCE.m205getMediaOverlayB_4ceCc())) {
                        surfaceView.setZOrderMediaOverlay(true);
                    } else if (androidx.compose.foundation.AndroidExternalSurfaceZOrder.m200equalsimpl0(i15, androidx.compose.foundation.AndroidExternalSurfaceZOrder.INSTANCE.m206getOnTopB_4ceCc())) {
                        surfaceView.setZOrderOnTop(true);
                    }
                    surfaceView.setSecure(z92222);
                }
            };
            startRestartGroup.updateRememberedValue(rememberedValue);
            startRestartGroup.endReplaceableGroup();
            androidx.compose.ui.viewinterop.AndroidView_androidKt.AndroidView(function122222, companion, androidExternalSurface_androidKt$AndroidExternalSurface$22222, null, (kotlin.jvm.functions.Function1) rememberedValue, startRestartGroup, ((i132222 << 3) & 112) | 384, 8);
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
            }
            j2 = j3;
            z6 = z3;
            modifier2 = companion;
            z7 = z5;
            i9 = i142222;
            endRestartGroup = startRestartGroup.endRestartGroup();
            if (endRestartGroup != null) {
            }
        }
        z3 = z;
        if ((i2 & 896) != 0) {
        }
        i5 = i3 & 8;
        if (i5 == 0) {
        }
        i6 = i;
        i7 = i3 & 16;
        if (i7 != 0) {
        }
        z4 = z2;
        if ((i3 & 32) != 0) {
        }
        i4 |= i8;
        if ((374491 & i4) == 74898) {
        }
        startRestartGroup.startDefaults();
        if ((i2 & 1) != 0) {
        }
        if (i11 != 0) {
        }
        if (i12 != 0) {
        }
        if ((i3 & 4) != 0) {
        }
        if (i5 != 0) {
        }
        j3 = j2;
        if (i7 != 0) {
        }
        z5 = z4;
        int i1322222 = i4;
        final int i1422222 = i6;
        startRestartGroup.endDefaults();
        if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
        }
        final androidx.compose.foundation.AndroidExternalSurfaceState rememberAndroidExternalSurfaceState22222 = rememberAndroidExternalSurfaceState(startRestartGroup, 0);
        kotlin.jvm.functions.Function1<android.content.Context, android.view.SurfaceView> function1222222 = new kotlin.jvm.functions.Function1<android.content.Context, android.view.SurfaceView>() { // from class: androidx.compose.foundation.AndroidExternalSurface_androidKt$AndroidExternalSurface$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public final android.view.SurfaceView invoke(android.content.Context context) {
                android.view.SurfaceView surfaceView = new android.view.SurfaceView(context);
                kotlin.jvm.functions.Function1<androidx.compose.foundation.AndroidExternalSurfaceScope, kotlin.Unit> function13 = function1;
                androidx.compose.foundation.AndroidExternalSurfaceState androidExternalSurfaceState = rememberAndroidExternalSurfaceState22222;
                function13.invoke(androidExternalSurfaceState);
                surfaceView.getHolder().addCallback(androidExternalSurfaceState);
                return surfaceView;
            }
        };
        androidx.compose.foundation.AndroidExternalSurface_androidKt$AndroidExternalSurface$2 androidExternalSurface_androidKt$AndroidExternalSurface$222222 = new kotlin.jvm.functions.Function1<android.view.SurfaceView, kotlin.Unit>() { // from class: androidx.compose.foundation.AndroidExternalSurface_androidKt$AndroidExternalSurface$2
            /* renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(android.view.SurfaceView surfaceView) {
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ kotlin.Unit invoke(android.view.SurfaceView surfaceView) {
                invoke2(surfaceView);
                return kotlin.Unit.INSTANCE;
            }
        };
        startRestartGroup.startReplaceableGroup(-1909066533);
        changed = startRestartGroup.changed(j3) | startRestartGroup.changed(z3) | startRestartGroup.changed(i1422222) | startRestartGroup.changed(z5);
        rememberedValue = startRestartGroup.rememberedValue();
        if (!changed) {
        }
        final long j422222 = j3;
        final boolean z822222 = z3;
        final boolean z922222 = z5;
        rememberedValue = (kotlin.jvm.functions.Function1) new kotlin.jvm.functions.Function1<android.view.SurfaceView, kotlin.Unit>() { // from class: androidx.compose.foundation.AndroidExternalSurface_androidKt$AndroidExternalSurface$3$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ kotlin.Unit invoke(android.view.SurfaceView surfaceView) {
                invoke2(surfaceView);
                return kotlin.Unit.INSTANCE;
            }

            /* renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(android.view.SurfaceView surfaceView) {
                if (!androidx.compose.ui.unit.IntSize.m4650equalsimpl0(j422222, androidx.compose.ui.unit.IntSize.INSTANCE.m4657getZeroYbymL2g())) {
                    surfaceView.getHolder().setFixedSize(androidx.compose.ui.unit.IntSize.m4652getWidthimpl(j422222), androidx.compose.ui.unit.IntSize.m4651getHeightimpl(j422222));
                } else {
                    surfaceView.getHolder().setSizeFromLayout();
                }
                surfaceView.getHolder().setFormat(z822222 ? -1 : -3);
                int i15 = i1422222;
                if (androidx.compose.foundation.AndroidExternalSurfaceZOrder.m200equalsimpl0(i15, androidx.compose.foundation.AndroidExternalSurfaceZOrder.INSTANCE.m204getBehindB_4ceCc())) {
                    surfaceView.setZOrderOnTop(false);
                } else if (androidx.compose.foundation.AndroidExternalSurfaceZOrder.m200equalsimpl0(i15, androidx.compose.foundation.AndroidExternalSurfaceZOrder.INSTANCE.m205getMediaOverlayB_4ceCc())) {
                    surfaceView.setZOrderMediaOverlay(true);
                } else if (androidx.compose.foundation.AndroidExternalSurfaceZOrder.m200equalsimpl0(i15, androidx.compose.foundation.AndroidExternalSurfaceZOrder.INSTANCE.m206getOnTopB_4ceCc())) {
                    surfaceView.setZOrderOnTop(true);
                }
                surfaceView.setSecure(z922222);
            }
        };
        startRestartGroup.updateRememberedValue(rememberedValue);
        startRestartGroup.endReplaceableGroup();
        androidx.compose.ui.viewinterop.AndroidView_androidKt.AndroidView(function1222222, companion, androidExternalSurface_androidKt$AndroidExternalSurface$222222, null, (kotlin.jvm.functions.Function1) rememberedValue, startRestartGroup, ((i1322222 << 3) & 112) | 384, 8);
        if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
        }
        j2 = j3;
        z6 = z3;
        modifier2 = companion;
        z7 = z5;
        i9 = i1422222;
        endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
        }
    }

    private static final androidx.compose.foundation.AndroidEmbeddedExternalSurfaceState rememberAndroidEmbeddedExternalSurfaceState(androidx.compose.runtime.Composer composer, int i) {
        composer.startReplaceableGroup(-1057437053);
        androidx.compose.runtime.ComposerKt.sourceInformation(composer, "C(rememberAndroidEmbeddedExternalSurfaceState)384@15036L24,385@15072L55:AndroidExternalSurface.android.kt#71ulvw");
        if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
            androidx.compose.runtime.ComposerKt.traceEventStart(-1057437053, i, -1, "androidx.compose.foundation.rememberAndroidEmbeddedExternalSurfaceState (AndroidExternalSurface.android.kt:383)");
        }
        composer.startReplaceableGroup(773894976);
        androidx.compose.runtime.ComposerKt.sourceInformation(composer, "CC(rememberCoroutineScope)489@20472L144:Effects.kt#9igjgp");
        composer.startReplaceableGroup(-492369756);
        androidx.compose.runtime.ComposerKt.sourceInformation(composer, "CC(remember):Composables.kt#9igjgp");
        java.lang.Object rememberedValue = composer.rememberedValue();
        if (rememberedValue == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
            androidx.compose.runtime.CompositionScopedCoroutineScopeCanceller compositionScopedCoroutineScopeCanceller = new androidx.compose.runtime.CompositionScopedCoroutineScopeCanceller(androidx.compose.runtime.EffectsKt.createCompositionCoroutineScope(kotlin.coroutines.EmptyCoroutineContext.INSTANCE, composer));
            composer.updateRememberedValue(compositionScopedCoroutineScopeCanceller);
            rememberedValue = compositionScopedCoroutineScopeCanceller;
        }
        composer.endReplaceableGroup();
        kotlinx.coroutines.CoroutineScope coroutineScope = ((androidx.compose.runtime.CompositionScopedCoroutineScopeCanceller) rememberedValue).getCoroutineScope();
        composer.endReplaceableGroup();
        composer.startReplaceableGroup(-492369756);
        androidx.compose.runtime.ComposerKt.sourceInformation(composer, "CC(remember):Composables.kt#9igjgp");
        java.lang.Object rememberedValue2 = composer.rememberedValue();
        if (rememberedValue2 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
            rememberedValue2 = new androidx.compose.foundation.AndroidEmbeddedExternalSurfaceState(coroutineScope);
            composer.updateRememberedValue(rememberedValue2);
        }
        composer.endReplaceableGroup();
        androidx.compose.foundation.AndroidEmbeddedExternalSurfaceState androidEmbeddedExternalSurfaceState = (androidx.compose.foundation.AndroidEmbeddedExternalSurfaceState) rememberedValue2;
        if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
            androidx.compose.runtime.ComposerKt.traceEventEnd();
        }
        composer.endReplaceableGroup();
        return androidEmbeddedExternalSurfaceState;
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0050  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x006b  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0071  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0135  */
    /* JADX WARN: Removed duplicated region for block: B:34:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:46:0x00ea  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0128  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x00c2  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x00ca  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x00d0  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x00da  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x00de  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x00c7  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x0074  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x0065  */
    /* renamed from: AndroidEmbeddedExternalSurface-sv6N_fY, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void m207AndroidEmbeddedExternalSurfacesv6N_fY(androidx.compose.ui.Modifier modifier, boolean z, long j, float[] fArr, final kotlin.jvm.functions.Function1<? super androidx.compose.foundation.AndroidExternalSurfaceScope, kotlin.Unit> function1, androidx.compose.runtime.Composer composer, final int i, final int i2) {
        androidx.compose.ui.Modifier modifier2;
        int i3;
        boolean z2;
        long j2;
        int i4;
        androidx.compose.ui.Modifier.Companion companion;
        float[] fArr2;
        final long j3;
        final float[] fArr3;
        androidx.compose.runtime.ScopeUpdateScope endRestartGroup;
        int i5;
        androidx.compose.runtime.Composer startRestartGroup = composer.startRestartGroup(217541314);
        androidx.compose.runtime.ComposerKt.sourceInformation(startRestartGroup, "C(AndroidEmbeddedExternalSurface)P(1!1,3:c#ui.unit.IntSize,4:c#ui.graphics.Matrix)455@18917L45,457@18968L796:AndroidExternalSurface.android.kt#71ulvw");
        int i6 = i2 & 1;
        if (i6 != 0) {
            i3 = i | 6;
            modifier2 = modifier;
        } else if ((i & 14) == 0) {
            modifier2 = modifier;
            i3 = (startRestartGroup.changed(modifier2) ? 4 : 2) | i;
        } else {
            modifier2 = modifier;
            i3 = i;
        }
        int i7 = i2 & 2;
        if (i7 != 0) {
            i3 |= 48;
        } else if ((i & 112) == 0) {
            z2 = z;
            i3 |= startRestartGroup.changed(z2) ? 32 : 16;
            if ((i & 896) != 0) {
                if ((i2 & 4) == 0) {
                    j2 = j;
                    if (startRestartGroup.changed(j2)) {
                        i5 = 256;
                        i3 |= i5;
                    }
                } else {
                    j2 = j;
                }
                i5 = 128;
                i3 |= i5;
            } else {
                j2 = j;
            }
            i4 = i2 & 8;
            if (i4 != 0) {
                i3 |= 1024;
            }
            if ((i2 & 16) == 0) {
                i3 |= 24576;
            } else if ((57344 & i) == 0) {
                i3 |= startRestartGroup.changedInstance(function1) ? 16384 : 8192;
            }
            if (i4 == 8 || (46811 & i3) != 9362 || !startRestartGroup.getSkipping()) {
                startRestartGroup.startDefaults();
                if ((i & 1) != 0 || startRestartGroup.getDefaultsInvalid()) {
                    companion = i6 == 0 ? androidx.compose.ui.Modifier.INSTANCE : modifier2;
                    if (i7 != 0) {
                        z2 = true;
                    }
                    if ((i2 & 4) != 0) {
                        j2 = androidx.compose.ui.unit.IntSize.INSTANCE.m4657getZeroYbymL2g();
                        i3 &= -897;
                    }
                    fArr2 = i4 == 0 ? null : fArr;
                } else {
                    startRestartGroup.skipToGroupEnd();
                    if ((i2 & 4) != 0) {
                        i3 &= -897;
                    }
                    fArr2 = fArr;
                    companion = modifier2;
                }
                int i8 = i3;
                final boolean z3 = z2;
                final long j4 = j2;
                startRestartGroup.endDefaults();
                if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                    androidx.compose.runtime.ComposerKt.traceEventStart(217541314, i8, -1, "androidx.compose.foundation.AndroidEmbeddedExternalSurface (AndroidExternalSurface.android.kt:454)");
                }
                final androidx.compose.foundation.AndroidEmbeddedExternalSurfaceState rememberAndroidEmbeddedExternalSurfaceState = rememberAndroidEmbeddedExternalSurfaceState(startRestartGroup, 0);
                final float[] fArr4 = fArr2;
                androidx.compose.ui.viewinterop.AndroidView_androidKt.AndroidView(new kotlin.jvm.functions.Function1<android.content.Context, android.view.TextureView>() { // from class: androidx.compose.foundation.AndroidExternalSurface_androidKt$AndroidEmbeddedExternalSurface$1
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    /* JADX WARN: Multi-variable type inference failed */
                    {
                        super(1);
                    }

                    @Override // kotlin.jvm.functions.Function1
                    public final android.view.TextureView invoke(android.content.Context context) {
                        android.view.TextureView textureView = new android.view.TextureView(context);
                        androidx.compose.foundation.AndroidEmbeddedExternalSurfaceState androidEmbeddedExternalSurfaceState = androidx.compose.foundation.AndroidEmbeddedExternalSurfaceState.this;
                        long j5 = j4;
                        kotlin.jvm.functions.Function1<androidx.compose.foundation.AndroidExternalSurfaceScope, kotlin.Unit> function12 = function1;
                        androidEmbeddedExternalSurfaceState.m196setSurfaceSizeozmzZPI(j5);
                        function12.invoke(androidEmbeddedExternalSurfaceState);
                        textureView.setSurfaceTextureListener(androidEmbeddedExternalSurfaceState);
                        return textureView;
                    }
                }, companion, new kotlin.jvm.functions.Function1<android.view.TextureView, kotlin.Unit>() { // from class: androidx.compose.foundation.AndroidExternalSurface_androidKt$AndroidEmbeddedExternalSurface$2
                    /* renamed from: invoke, reason: avoid collision after fix types in other method */
                    public final void invoke2(android.view.TextureView textureView) {
                    }

                    @Override // kotlin.jvm.functions.Function1
                    public /* bridge */ /* synthetic */ kotlin.Unit invoke(android.view.TextureView textureView) {
                        invoke2(textureView);
                        return kotlin.Unit.INSTANCE;
                    }
                }, null, new kotlin.jvm.functions.Function1<android.view.TextureView, kotlin.Unit>() { // from class: androidx.compose.foundation.AndroidExternalSurface_androidKt$AndroidEmbeddedExternalSurface$3
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(1);
                    }

                    @Override // kotlin.jvm.functions.Function1
                    public /* bridge */ /* synthetic */ kotlin.Unit invoke(android.view.TextureView textureView) {
                        invoke2(textureView);
                        return kotlin.Unit.INSTANCE;
                    }

                    /* renamed from: invoke, reason: avoid collision after fix types in other method */
                    public final void invoke2(android.view.TextureView textureView) {
                        android.graphics.Matrix matrix;
                        android.graphics.SurfaceTexture surfaceTexture;
                        if (!androidx.compose.ui.unit.IntSize.m4650equalsimpl0(j4, androidx.compose.ui.unit.IntSize.INSTANCE.m4657getZeroYbymL2g()) && (surfaceTexture = textureView.getSurfaceTexture()) != null) {
                            surfaceTexture.setDefaultBufferSize(androidx.compose.ui.unit.IntSize.m4652getWidthimpl(j4), androidx.compose.ui.unit.IntSize.m4651getHeightimpl(j4));
                        }
                        rememberAndroidEmbeddedExternalSurfaceState.m196setSurfaceSizeozmzZPI(j4);
                        textureView.setOpaque(z3);
                        float[] fArr5 = fArr4;
                        if (fArr5 != null) {
                            matrix = rememberAndroidEmbeddedExternalSurfaceState.getMatrix();
                            androidx.compose.ui.graphics.AndroidMatrixConversions_androidKt.m1983setFromEL8BTi8(matrix, fArr5);
                        } else {
                            matrix = null;
                        }
                        textureView.setTransform(matrix);
                    }
                }, startRestartGroup, ((i8 << 3) & 112) | 384, 8);
                if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                    androidx.compose.runtime.ComposerKt.traceEventEnd();
                }
                z2 = z3;
                j3 = j4;
                fArr3 = fArr2;
            } else {
                startRestartGroup.skipToGroupEnd();
                fArr3 = fArr;
                companion = modifier2;
                j3 = j2;
            }
            endRestartGroup = startRestartGroup.endRestartGroup();
            if (endRestartGroup == null) {
                final androidx.compose.ui.Modifier modifier3 = companion;
                final boolean z4 = z2;
                endRestartGroup.updateScope(new kotlin.jvm.functions.Function2<androidx.compose.runtime.Composer, java.lang.Integer, kotlin.Unit>() { // from class: androidx.compose.foundation.AndroidExternalSurface_androidKt$AndroidEmbeddedExternalSurface$4
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

                    public final void invoke(androidx.compose.runtime.Composer composer2, int i9) {
                        androidx.compose.foundation.AndroidExternalSurface_androidKt.m207AndroidEmbeddedExternalSurfacesv6N_fY(androidx.compose.ui.Modifier.this, z4, j3, fArr3, function1, composer2, androidx.compose.runtime.RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
                    }
                });
                return;
            }
            return;
        }
        z2 = z;
        if ((i & 896) != 0) {
        }
        i4 = i2 & 8;
        if (i4 != 0) {
        }
        if ((i2 & 16) == 0) {
        }
        if (i4 == 8) {
        }
        startRestartGroup.startDefaults();
        if ((i & 1) != 0) {
        }
        if (i6 == 0) {
        }
        if (i7 != 0) {
        }
        if ((i2 & 4) != 0) {
        }
        if (i4 == 0) {
        }
        int i82 = i3;
        final boolean z32 = z2;
        final long j42 = j2;
        startRestartGroup.endDefaults();
        if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
        }
        final androidx.compose.foundation.AndroidEmbeddedExternalSurfaceState rememberAndroidEmbeddedExternalSurfaceState2 = rememberAndroidEmbeddedExternalSurfaceState(startRestartGroup, 0);
        final float[] fArr42 = fArr2;
        androidx.compose.ui.viewinterop.AndroidView_androidKt.AndroidView(new kotlin.jvm.functions.Function1<android.content.Context, android.view.TextureView>() { // from class: androidx.compose.foundation.AndroidExternalSurface_androidKt$AndroidEmbeddedExternalSurface$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public final android.view.TextureView invoke(android.content.Context context) {
                android.view.TextureView textureView = new android.view.TextureView(context);
                androidx.compose.foundation.AndroidEmbeddedExternalSurfaceState androidEmbeddedExternalSurfaceState = androidx.compose.foundation.AndroidEmbeddedExternalSurfaceState.this;
                long j5 = j42;
                kotlin.jvm.functions.Function1<androidx.compose.foundation.AndroidExternalSurfaceScope, kotlin.Unit> function12 = function1;
                androidEmbeddedExternalSurfaceState.m196setSurfaceSizeozmzZPI(j5);
                function12.invoke(androidEmbeddedExternalSurfaceState);
                textureView.setSurfaceTextureListener(androidEmbeddedExternalSurfaceState);
                return textureView;
            }
        }, companion, new kotlin.jvm.functions.Function1<android.view.TextureView, kotlin.Unit>() { // from class: androidx.compose.foundation.AndroidExternalSurface_androidKt$AndroidEmbeddedExternalSurface$2
            /* renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(android.view.TextureView textureView) {
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ kotlin.Unit invoke(android.view.TextureView textureView) {
                invoke2(textureView);
                return kotlin.Unit.INSTANCE;
            }
        }, null, new kotlin.jvm.functions.Function1<android.view.TextureView, kotlin.Unit>() { // from class: androidx.compose.foundation.AndroidExternalSurface_androidKt$AndroidEmbeddedExternalSurface$3
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ kotlin.Unit invoke(android.view.TextureView textureView) {
                invoke2(textureView);
                return kotlin.Unit.INSTANCE;
            }

            /* renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(android.view.TextureView textureView) {
                android.graphics.Matrix matrix;
                android.graphics.SurfaceTexture surfaceTexture;
                if (!androidx.compose.ui.unit.IntSize.m4650equalsimpl0(j42, androidx.compose.ui.unit.IntSize.INSTANCE.m4657getZeroYbymL2g()) && (surfaceTexture = textureView.getSurfaceTexture()) != null) {
                    surfaceTexture.setDefaultBufferSize(androidx.compose.ui.unit.IntSize.m4652getWidthimpl(j42), androidx.compose.ui.unit.IntSize.m4651getHeightimpl(j42));
                }
                rememberAndroidEmbeddedExternalSurfaceState2.m196setSurfaceSizeozmzZPI(j42);
                textureView.setOpaque(z32);
                float[] fArr5 = fArr42;
                if (fArr5 != null) {
                    matrix = rememberAndroidEmbeddedExternalSurfaceState2.getMatrix();
                    androidx.compose.ui.graphics.AndroidMatrixConversions_androidKt.m1983setFromEL8BTi8(matrix, fArr5);
                } else {
                    matrix = null;
                }
                textureView.setTransform(matrix);
            }
        }, startRestartGroup, ((i82 << 3) & 112) | 384, 8);
        if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
        }
        z2 = z32;
        j3 = j42;
        fArr3 = fArr2;
        endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup == null) {
        }
    }
}
