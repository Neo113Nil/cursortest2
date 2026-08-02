package androidx.camera.viewfinder.compose.internal;

@kotlin.Metadata(d1 = {"\u0000>\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\r\u0010\u0002\u001a\u00020\u0003H\u0003¢\u0006\u0002\u0010\u0004\u001aR\u0010\u0005\u001a\u00020\u00062\b\b\u0002\u0010\u0007\u001a\u00020\b2\b\b\u0002\u0010\t\u001a\u00020\n2\b\b\u0002\u0010\u000b\u001a\u00020\f2\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u000e2\u0017\u0010\u000f\u001a\u0013\u0012\u0004\u0012\u00020\u0011\u0012\u0004\u0012\u00020\u00060\u0010¢\u0006\u0002\b\u0012H\u0001¢\u0006\u0004\b\u0013\u0010\u0014\"\u000e\u0010\u0000\u001a\u00020\u0001X\u0082T¢\u0006\u0002\n\u0000¨\u0006\u0015"}, d2 = {"TAG", "", "rememberViewfinderEmbeddedExternalSurfaceState", "Landroidx/camera/viewfinder/compose/internal/ViewfinderEmbeddedExternalSurfaceState;", "(Landroidx/compose/runtime/Composer;I)Landroidx/camera/viewfinder/compose/internal/ViewfinderEmbeddedExternalSurfaceState;", "ViewfinderEmbeddedExternalSurface", "", "modifier", "Landroidx/compose/ui/Modifier;", "isOpaque", "", "surfaceSize", "Landroidx/compose/ui/unit/IntSize;", "transform", "Landroidx/compose/ui/graphics/Matrix;", "onInit", "Lkotlin/Function1;", "Landroidx/camera/viewfinder/compose/internal/ViewfinderExternalSurfaceScope;", "Lkotlin/ExtensionFunctionType;", "ViewfinderEmbeddedExternalSurface-sv6N_fY", "(Landroidx/compose/ui/Modifier;ZJ[FLkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V", "viewfinder-compose"}, k = 2, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class ViewfinderEmbeddedExternalSurfaceKt {
    /* JADX WARN: Removed duplicated region for block: B:100:0x00d2  */
    /* JADX WARN: Removed duplicated region for block: B:103:0x00d7  */
    /* JADX WARN: Removed duplicated region for block: B:105:0x00e2  */
    /* JADX WARN: Removed duplicated region for block: B:106:0x00e5  */
    /* JADX WARN: Removed duplicated region for block: B:107:0x00cf  */
    /* JADX WARN: Removed duplicated region for block: B:109:0x0094  */
    /* JADX WARN: Removed duplicated region for block: B:10:0x004b  */
    /* JADX WARN: Removed duplicated region for block: B:110:0x0066  */
    /* JADX WARN: Removed duplicated region for block: B:121:0x005d  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0063  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0084  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x00f2  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x00fe  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x0112  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x0135  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x0146  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x0155  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x019a  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x01a3  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x01aa  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x01f9  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x01af  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x01a6  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x019c  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x00ca  */
    /* renamed from: ViewfinderEmbeddedExternalSurface-sv6N_fY, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void m1046ViewfinderEmbeddedExternalSurfacesv6N_fY(androidx.compose.ui.Modifier modifier, boolean z, long j, float[] fArr, final kotlin.jvm.functions.Function1<? super androidx.camera.viewfinder.compose.internal.ViewfinderExternalSurfaceScope, kotlin.Unit> function1, androidx.compose.runtime.Composer composer, final int i, final int i2) {
        androidx.compose.ui.Modifier modifier2;
        int i3;
        boolean z2;
        long j2;
        int i4;
        androidx.compose.ui.Modifier.Companion companion;
        float[] fArr2;
        boolean z3;
        final long j3;
        java.lang.Object rememberedValue;
        java.lang.Object rememberedValue2;
        java.lang.Object rememberedValue3;
        boolean changedInstance;
        java.lang.Object rememberedValue4;
        boolean z4;
        boolean changedInstance2;
        boolean z5;
        boolean z6;
        boolean changedInstance3;
        java.lang.Object rememberedValue5;
        final long j4;
        final float[] fArr3;
        androidx.compose.runtime.Composer startRestartGroup = composer.startRestartGroup(1813075079);
        int i5 = i2 & 1;
        if (i5 != 0) {
            i3 = i | 6;
            modifier2 = modifier;
        } else if ((i & 6) == 0) {
            modifier2 = modifier;
            i3 = (startRestartGroup.changed(modifier2) ? 4 : 2) | i;
        } else {
            modifier2 = modifier;
            i3 = i;
        }
        int i6 = i2 & 2;
        if (i6 != 0) {
            i3 |= 48;
        } else if ((i & 48) == 0) {
            z2 = z;
            i3 |= startRestartGroup.changed(z2) ? 32 : 16;
            if ((i & 384) != 0) {
                j2 = j;
                i3 |= ((i2 & 4) == 0 && startRestartGroup.changed(j2)) ? 256 : 128;
            } else {
                j2 = j;
            }
            i4 = i2 & 8;
            if (i4 == 0) {
                i3 |= 3072;
            } else if ((i & 3072) == 0) {
                i3 |= startRestartGroup.changedInstance(fArr != null ? androidx.compose.ui.graphics.Matrix.m6221boximpl(fArr) : null) ? 2048 : 1024;
            }
            if ((i & 24576) == 0) {
                i3 |= startRestartGroup.changedInstance(function1) ? 16384 : 8192;
            }
            if ((i3 & 9363) != 9362 && startRestartGroup.getSkipping()) {
                startRestartGroup.skipToGroupEnd();
                fArr3 = fArr;
                companion = modifier2;
                j4 = j2;
            } else {
                startRestartGroup.startDefaults();
                if ((i & 1) == 0 && !startRestartGroup.getDefaultsInvalid()) {
                    startRestartGroup.skipToGroupEnd();
                    if ((i2 & 4) != 0) {
                        i3 &= -897;
                    }
                    fArr2 = fArr;
                    companion = modifier2;
                } else {
                    companion = i5 == 0 ? androidx.compose.ui.Modifier.INSTANCE : modifier2;
                    if (i6 != 0) {
                        z2 = true;
                    }
                    if ((i2 & 4) != 0) {
                        i3 &= -897;
                        j2 = androidx.compose.ui.unit.IntSize.INSTANCE.m8777getZeroYbymL2g();
                    }
                    if (i4 == 0) {
                        z3 = z2;
                        fArr2 = null;
                        int i7 = i3;
                        j3 = j2;
                        startRestartGroup.endDefaults();
                        if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                            androidx.compose.runtime.ComposerKt.traceEventStart(1813075079, i7, -1, "androidx.camera.viewfinder.compose.internal.ViewfinderEmbeddedExternalSurface (ViewfinderEmbeddedExternalSurface.kt:154)");
                        }
                        if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                            androidx.compose.runtime.ComposerKt.traceEventStart(1362770328, 0, -1, "androidx.camera.viewfinder.compose.internal.rememberViewfinderEmbeddedExternalSurfaceState (ViewfinderEmbeddedExternalSurface.kt:130)");
                        }
                        rememberedValue = startRestartGroup.rememberedValue();
                        if (rememberedValue == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                            java.lang.Object compositionScopedCoroutineScopeCanceller = new androidx.compose.runtime.CompositionScopedCoroutineScopeCanceller(androidx.compose.runtime.EffectsKt.createCompositionCoroutineScope(kotlin.coroutines.EmptyCoroutineContext.INSTANCE, startRestartGroup));
                            startRestartGroup.updateRememberedValue(compositionScopedCoroutineScopeCanceller);
                            rememberedValue = compositionScopedCoroutineScopeCanceller;
                        }
                        kotlinx.coroutines.CoroutineScope coroutineScope = ((androidx.compose.runtime.CompositionScopedCoroutineScopeCanceller) rememberedValue).getCoroutineScope();
                        rememberedValue2 = startRestartGroup.rememberedValue();
                        if (rememberedValue2 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                            rememberedValue2 = new androidx.camera.viewfinder.compose.internal.ViewfinderEmbeddedExternalSurfaceState(coroutineScope);
                            startRestartGroup.updateRememberedValue(rememberedValue2);
                        }
                        final androidx.camera.viewfinder.compose.internal.ViewfinderEmbeddedExternalSurfaceState viewfinderEmbeddedExternalSurfaceState = (androidx.camera.viewfinder.compose.internal.ViewfinderEmbeddedExternalSurfaceState) rememberedValue2;
                        if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                            androidx.compose.runtime.ComposerKt.traceEventEnd();
                        }
                        rememberedValue3 = startRestartGroup.rememberedValue();
                        if (rememberedValue3 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                            rememberedValue3 = new kotlin.jvm.functions.Function1() { // from class: androidx.camera.viewfinder.compose.internal.ViewfinderEmbeddedExternalSurfaceKt$$ExternalSyntheticLambda0
                                @Override // kotlin.jvm.functions.Function1
                                public final java.lang.Object invoke(java.lang.Object obj) {
                                    return androidx.camera.viewfinder.compose.internal.ViewfinderEmbeddedExternalSurfaceKt.$r8$lambda$0CxdECgezNoruJcahWCde17XrqM((android.content.Context) obj);
                                }
                            };
                            startRestartGroup.updateRememberedValue(rememberedValue3);
                        }
                        kotlin.jvm.functions.Function1 function12 = (kotlin.jvm.functions.Function1) rememberedValue3;
                        changedInstance = startRestartGroup.changedInstance(viewfinderEmbeddedExternalSurfaceState);
                        rememberedValue4 = startRestartGroup.rememberedValue();
                        if (!changedInstance || rememberedValue4 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                            rememberedValue4 = new kotlin.jvm.functions.Function1() { // from class: androidx.camera.viewfinder.compose.internal.ViewfinderEmbeddedExternalSurfaceKt$$ExternalSyntheticLambda1
                                @Override // kotlin.jvm.functions.Function1
                                public final java.lang.Object invoke(java.lang.Object obj) {
                                    return androidx.camera.viewfinder.compose.internal.ViewfinderEmbeddedExternalSurfaceKt.m1044$r8$lambda$HLk9u2IWLBoo1EneKNHa3u5rAM(androidx.camera.viewfinder.compose.internal.ViewfinderEmbeddedExternalSurfaceState.this, (androidx.camera.viewfinder.compose.internal.ViewfinderEmbeddedExternalSurfaceKt$ViewfinderEmbeddedExternalSurface$1$1$1) obj);
                                }
                            };
                            startRestartGroup.updateRememberedValue(rememberedValue4);
                        }
                        kotlin.jvm.functions.Function1 function13 = (kotlin.jvm.functions.Function1) rememberedValue4;
                        z4 = (((i7 & 896) ^ 384) <= 256 && startRestartGroup.changed(j3)) || (i7 & 384) == 256;
                        changedInstance2 = startRestartGroup.changedInstance(viewfinderEmbeddedExternalSurfaceState);
                        z5 = (i7 & 57344) != 16384;
                        z6 = (i7 & 112) != 32;
                        changedInstance3 = startRestartGroup.changedInstance(fArr2 == null ? androidx.compose.ui.graphics.Matrix.m6221boximpl(fArr2) : null);
                        rememberedValue5 = startRestartGroup.rememberedValue();
                        if (!(changedInstance3 | z4 | changedInstance2 | z5 | z6) || rememberedValue5 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                            final boolean z7 = z3;
                            final float[] fArr4 = fArr2;
                            rememberedValue5 = new kotlin.jvm.functions.Function1() { // from class: androidx.camera.viewfinder.compose.internal.ViewfinderEmbeddedExternalSurfaceKt$$ExternalSyntheticLambda2
                                @Override // kotlin.jvm.functions.Function1
                                public final java.lang.Object invoke(java.lang.Object obj) {
                                    return androidx.camera.viewfinder.compose.internal.ViewfinderEmbeddedExternalSurfaceKt.$r8$lambda$20yc_xFvHpHPaqiQyH58KH88fkU(j3, viewfinderEmbeddedExternalSurfaceState, function1, z7, fArr4, (androidx.camera.viewfinder.compose.internal.ViewfinderEmbeddedExternalSurfaceKt$ViewfinderEmbeddedExternalSurface$1$1$1) obj);
                                }
                            };
                            startRestartGroup.updateRememberedValue(rememberedValue5);
                        }
                        androidx.compose.ui.viewinterop.AndroidView_androidKt.AndroidView(function12, companion, function13, null, (kotlin.jvm.functions.Function1) rememberedValue5, startRestartGroup, ((i7 << 3) & 112) | 6, 8);
                        if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                            androidx.compose.runtime.ComposerKt.traceEventEnd();
                        }
                        z2 = z3;
                        j4 = j3;
                        fArr3 = fArr2;
                    } else {
                        fArr2 = fArr;
                    }
                }
                z3 = z2;
                int i72 = i3;
                j3 = j2;
                startRestartGroup.endDefaults();
                if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                }
                if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                }
                rememberedValue = startRestartGroup.rememberedValue();
                if (rememberedValue == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                }
                kotlinx.coroutines.CoroutineScope coroutineScope2 = ((androidx.compose.runtime.CompositionScopedCoroutineScopeCanceller) rememberedValue).getCoroutineScope();
                rememberedValue2 = startRestartGroup.rememberedValue();
                if (rememberedValue2 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                }
                final androidx.camera.viewfinder.compose.internal.ViewfinderEmbeddedExternalSurfaceState viewfinderEmbeddedExternalSurfaceState2 = (androidx.camera.viewfinder.compose.internal.ViewfinderEmbeddedExternalSurfaceState) rememberedValue2;
                if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                }
                rememberedValue3 = startRestartGroup.rememberedValue();
                if (rememberedValue3 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                }
                kotlin.jvm.functions.Function1 function122 = (kotlin.jvm.functions.Function1) rememberedValue3;
                changedInstance = startRestartGroup.changedInstance(viewfinderEmbeddedExternalSurfaceState2);
                rememberedValue4 = startRestartGroup.rememberedValue();
                if (!changedInstance) {
                }
                rememberedValue4 = new kotlin.jvm.functions.Function1() { // from class: androidx.camera.viewfinder.compose.internal.ViewfinderEmbeddedExternalSurfaceKt$$ExternalSyntheticLambda1
                    @Override // kotlin.jvm.functions.Function1
                    public final java.lang.Object invoke(java.lang.Object obj) {
                        return androidx.camera.viewfinder.compose.internal.ViewfinderEmbeddedExternalSurfaceKt.m1044$r8$lambda$HLk9u2IWLBoo1EneKNHa3u5rAM(androidx.camera.viewfinder.compose.internal.ViewfinderEmbeddedExternalSurfaceState.this, (androidx.camera.viewfinder.compose.internal.ViewfinderEmbeddedExternalSurfaceKt$ViewfinderEmbeddedExternalSurface$1$1$1) obj);
                    }
                };
                startRestartGroup.updateRememberedValue(rememberedValue4);
                kotlin.jvm.functions.Function1 function132 = (kotlin.jvm.functions.Function1) rememberedValue4;
                if (((i72 & 896) ^ 384) <= 256) {
                }
                changedInstance2 = startRestartGroup.changedInstance(viewfinderEmbeddedExternalSurfaceState2);
                if ((i72 & 57344) != 16384) {
                }
                if ((i72 & 112) != 32) {
                }
                changedInstance3 = startRestartGroup.changedInstance(fArr2 == null ? androidx.compose.ui.graphics.Matrix.m6221boximpl(fArr2) : null);
                rememberedValue5 = startRestartGroup.rememberedValue();
                if (!(changedInstance3 | z4 | changedInstance2 | z5 | z6)) {
                }
                final boolean z72 = z3;
                final float[] fArr42 = fArr2;
                rememberedValue5 = new kotlin.jvm.functions.Function1() { // from class: androidx.camera.viewfinder.compose.internal.ViewfinderEmbeddedExternalSurfaceKt$$ExternalSyntheticLambda2
                    @Override // kotlin.jvm.functions.Function1
                    public final java.lang.Object invoke(java.lang.Object obj) {
                        return androidx.camera.viewfinder.compose.internal.ViewfinderEmbeddedExternalSurfaceKt.$r8$lambda$20yc_xFvHpHPaqiQyH58KH88fkU(j3, viewfinderEmbeddedExternalSurfaceState2, function1, z72, fArr42, (androidx.camera.viewfinder.compose.internal.ViewfinderEmbeddedExternalSurfaceKt$ViewfinderEmbeddedExternalSurface$1$1$1) obj);
                    }
                };
                startRestartGroup.updateRememberedValue(rememberedValue5);
                androidx.compose.ui.viewinterop.AndroidView_androidKt.AndroidView(function122, companion, function132, null, (kotlin.jvm.functions.Function1) rememberedValue5, startRestartGroup, ((i72 << 3) & 112) | 6, 8);
                if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                }
                z2 = z3;
                j4 = j3;
                fArr3 = fArr2;
            }
            androidx.compose.runtime.ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
            if (endRestartGroup != null) {
                final androidx.compose.ui.Modifier modifier3 = companion;
                final boolean z8 = z2;
                endRestartGroup.updateScope(new kotlin.jvm.functions.Function2() { // from class: androidx.camera.viewfinder.compose.internal.ViewfinderEmbeddedExternalSurfaceKt$$ExternalSyntheticLambda3
                    @Override // kotlin.jvm.functions.Function2
                    public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                        return androidx.camera.viewfinder.compose.internal.ViewfinderEmbeddedExternalSurfaceKt.m1045$r8$lambda$Uu7fcwq6bxUfYPHpVsrsmIlpbY(androidx.compose.ui.Modifier.this, z8, j4, fArr3, function1, i, i2, (androidx.compose.runtime.Composer) obj, ((java.lang.Integer) obj2).intValue());
                    }
                });
                return;
            }
            return;
        }
        z2 = z;
        if ((i & 384) != 0) {
        }
        i4 = i2 & 8;
        if (i4 == 0) {
        }
        if ((i & 24576) == 0) {
        }
        if ((i3 & 9363) != 9362) {
        }
        startRestartGroup.startDefaults();
        if ((i & 1) == 0) {
        }
        if (i5 == 0) {
        }
        if (i6 != 0) {
        }
        if ((i2 & 4) != 0) {
        }
        if (i4 == 0) {
        }
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [androidx.camera.viewfinder.compose.internal.ViewfinderEmbeddedExternalSurfaceKt$ViewfinderEmbeddedExternalSurface$1$1$1] */
    public static /* synthetic */ androidx.camera.viewfinder.compose.internal.ViewfinderEmbeddedExternalSurfaceKt$ViewfinderEmbeddedExternalSurface$1$1$1 $r8$lambda$0CxdECgezNoruJcahWCde17XrqM(final android.content.Context context) {
        return new android.view.TextureView(context) { // from class: androidx.camera.viewfinder.compose.internal.ViewfinderEmbeddedExternalSurfaceKt$ViewfinderEmbeddedExternalSurface$1$1$1
            @Override // android.view.TextureView, android.view.View
            protected final void onAttachedToWindow() {
                super.onAttachedToWindow();
                android.view.TextureView.SurfaceTextureListener surfaceTextureListener = getSurfaceTextureListener();
                androidx.camera.viewfinder.compose.internal.ViewfinderEmbeddedExternalSurfaceState viewfinderEmbeddedExternalSurfaceState = surfaceTextureListener instanceof androidx.camera.viewfinder.compose.internal.ViewfinderEmbeddedExternalSurfaceState ? (androidx.camera.viewfinder.compose.internal.ViewfinderEmbeddedExternalSurfaceState) surfaceTextureListener : null;
                if (viewfinderEmbeddedExternalSurfaceState != null) {
                    androidx.camera.viewfinder.compose.internal.ViewfinderEmbeddedExternalSurfaceKt$ViewfinderEmbeddedExternalSurface$1$1$1 viewfinderEmbeddedExternalSurfaceKt$ViewfinderEmbeddedExternalSurface$1$1$1 = this;
                    androidx.camera.viewfinder.compose.internal.ViewfinderEmbeddedExternalSurfaceHolder viewfinderEmbeddedExternalSurfaceHolder = viewfinderEmbeddedExternalSurfaceState.Camera2StreamConfigurationMap;
                    if (viewfinderEmbeddedExternalSurfaceHolder != null) {
                        if (viewfinderEmbeddedExternalSurfaceHolder.getHighSpeedVideoFpsRanges) {
                            if (viewfinderEmbeddedExternalSurfaceHolder.getRefCountedSurface().acquire() != null) {
                                viewfinderEmbeddedExternalSurfaceKt$ViewfinderEmbeddedExternalSurface$1$1$1.setSurfaceTexture(viewfinderEmbeddedExternalSurfaceHolder.getHighSpeedVideoSizes);
                                android.graphics.SurfaceTexture surfaceTexture = viewfinderEmbeddedExternalSurfaceHolder.getHighSpeedVideoSizes;
                                viewfinderEmbeddedExternalSurfaceHolder.getHighSpeedVideoFpsRanges = false;
                                return;
                            }
                            android.graphics.SurfaceTexture surfaceTexture2 = viewfinderEmbeddedExternalSurfaceHolder.getHighSpeedVideoSizes;
                            return;
                        }
                        android.graphics.SurfaceTexture surfaceTexture3 = viewfinderEmbeddedExternalSurfaceHolder.getHighSpeedVideoSizes;
                    }
                }
            }
        };
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$20yc_xFvHpHPaqiQyH58KH88fkU(long j, androidx.camera.viewfinder.compose.internal.ViewfinderEmbeddedExternalSurfaceState viewfinderEmbeddedExternalSurfaceState, kotlin.jvm.functions.Function1 function1, boolean z, float[] fArr, androidx.camera.viewfinder.compose.internal.ViewfinderEmbeddedExternalSurfaceKt$ViewfinderEmbeddedExternalSurface$1$1$1 viewfinderEmbeddedExternalSurfaceKt$ViewfinderEmbeddedExternalSurface$1$1$1) {
        android.graphics.Matrix matrix;
        android.graphics.SurfaceTexture surfaceTexture;
        if (!androidx.compose.ui.unit.IntSize.m8770equalsimpl0(j, androidx.compose.ui.unit.IntSize.INSTANCE.m8777getZeroYbymL2g()) && (surfaceTexture = viewfinderEmbeddedExternalSurfaceKt$ViewfinderEmbeddedExternalSurface$1$1$1.getSurfaceTexture()) != null) {
            surfaceTexture.setDefaultBufferSize(androidx.compose.ui.unit.IntSize.m8772getWidthimpl(j), androidx.compose.ui.unit.IntSize.m8771getHeightimpl(j));
        }
        viewfinderEmbeddedExternalSurfaceState.getHighSpeedVideoSizes = j;
        if (viewfinderEmbeddedExternalSurfaceKt$ViewfinderEmbeddedExternalSurface$1$1$1.getSurfaceTextureListener() != viewfinderEmbeddedExternalSurfaceState) {
            function1.invoke(viewfinderEmbeddedExternalSurfaceState);
            viewfinderEmbeddedExternalSurfaceKt$ViewfinderEmbeddedExternalSurface$1$1$1.setSurfaceTextureListener(viewfinderEmbeddedExternalSurfaceState);
        }
        viewfinderEmbeddedExternalSurfaceKt$ViewfinderEmbeddedExternalSurface$1$1$1.setOpaque(z);
        if (fArr != null) {
            matrix = viewfinderEmbeddedExternalSurfaceState.getGetHighResolutionOutputSizeshNQ4ISI();
            androidx.compose.ui.graphics.AndroidMatrixConversions_androidKt.m5864setFromEL8BTi8(matrix, fArr);
        } else {
            matrix = null;
        }
        viewfinderEmbeddedExternalSurfaceKt$ViewfinderEmbeddedExternalSurface$1$1$1.setTransform(matrix);
        return kotlin.Unit.INSTANCE;
    }

    /* renamed from: $r8$lambda$HLk9u2IW-LBoo1EneKNHa3u5rAM, reason: not valid java name */
    public static /* synthetic */ kotlin.Unit m1044$r8$lambda$HLk9u2IWLBoo1EneKNHa3u5rAM(androidx.camera.viewfinder.compose.internal.ViewfinderEmbeddedExternalSurfaceState viewfinderEmbeddedExternalSurfaceState, androidx.camera.viewfinder.compose.internal.ViewfinderEmbeddedExternalSurfaceKt$ViewfinderEmbeddedExternalSurface$1$1$1 viewfinderEmbeddedExternalSurfaceKt$ViewfinderEmbeddedExternalSurface$1$1$1) {
        androidx.camera.viewfinder.compose.internal.ViewfinderEmbeddedExternalSurfaceHolder viewfinderEmbeddedExternalSurfaceHolder;
        android.view.TextureView.SurfaceTextureListener surfaceTextureListener = viewfinderEmbeddedExternalSurfaceKt$ViewfinderEmbeddedExternalSurface$1$1$1.getSurfaceTextureListener();
        if ((surfaceTextureListener instanceof androidx.camera.viewfinder.compose.internal.ViewfinderEmbeddedExternalSurfaceState ? (androidx.camera.viewfinder.compose.internal.ViewfinderEmbeddedExternalSurfaceState) surfaceTextureListener : null) != null && (viewfinderEmbeddedExternalSurfaceHolder = viewfinderEmbeddedExternalSurfaceState.Camera2StreamConfigurationMap) != null) {
            viewfinderEmbeddedExternalSurfaceHolder.detach();
        }
        viewfinderEmbeddedExternalSurfaceKt$ViewfinderEmbeddedExternalSurface$1$1$1.setSurfaceTextureListener(null);
        return kotlin.Unit.INSTANCE;
    }

    /* renamed from: $r8$lambda$Uu7fcwq6bxUfYPHpVsr-smIlpbY, reason: not valid java name */
    public static /* synthetic */ kotlin.Unit m1045$r8$lambda$Uu7fcwq6bxUfYPHpVsrsmIlpbY(androidx.compose.ui.Modifier modifier, boolean z, long j, float[] fArr, kotlin.jvm.functions.Function1 function1, int i, int i2, androidx.compose.runtime.Composer composer, int i3) {
        m1046ViewfinderEmbeddedExternalSurfacesv6N_fY(modifier, z, j, fArr, function1, composer, androidx.compose.runtime.RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
        return kotlin.Unit.INSTANCE;
    }
}
