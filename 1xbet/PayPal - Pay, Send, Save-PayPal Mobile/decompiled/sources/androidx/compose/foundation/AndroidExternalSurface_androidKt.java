package androidx.compose.foundation;

@kotlin.Metadata(d1 = {"\u0000J\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\r\u0010\u0000\u001a\u00020\u0001H\u0003¢\u0006\u0002\u0010\u0002\u001aZ\u0010\u0003\u001a\u00020\u00042\b\b\u0002\u0010\u0005\u001a\u00020\u00062\b\b\u0002\u0010\u0007\u001a\u00020\b2\b\b\u0002\u0010\t\u001a\u00020\n2\b\b\u0002\u0010\u000b\u001a\u00020\f2\b\b\u0002\u0010\r\u001a\u00020\b2\u0017\u0010\u000e\u001a\u0013\u0012\u0004\u0012\u00020\u0010\u0012\u0004\u0012\u00020\u00040\u000f¢\u0006\u0002\b\u0011H\u0007¢\u0006\u0004\b\u0012\u0010\u0013\u001a\r\u0010\u0014\u001a\u00020\u0015H\u0003¢\u0006\u0002\u0010\u0016\u001aR\u0010\u0017\u001a\u00020\u00042\b\b\u0002\u0010\u0005\u001a\u00020\u00062\b\b\u0002\u0010\u0007\u001a\u00020\b2\b\b\u0002\u0010\t\u001a\u00020\n2\n\b\u0002\u0010\u0018\u001a\u0004\u0018\u00010\u00192\u0017\u0010\u000e\u001a\u0013\u0012\u0004\u0012\u00020\u0010\u0012\u0004\u0012\u00020\u00040\u000f¢\u0006\u0002\b\u0011H\u0007¢\u0006\u0004\b\u001a\u0010\u001b¨\u0006\u001c"}, d2 = {"rememberAndroidExternalSurfaceState", "Landroidx/compose/foundation/AndroidExternalSurfaceState;", "(Landroidx/compose/runtime/Composer;I)Landroidx/compose/foundation/AndroidExternalSurfaceState;", "AndroidExternalSurface", "", "modifier", "Landroidx/compose/ui/Modifier;", "isOpaque", "", "surfaceSize", "Landroidx/compose/ui/unit/IntSize;", "zOrder", "Landroidx/compose/foundation/AndroidExternalSurfaceZOrder;", "isSecure", "onInit", "Lkotlin/Function1;", "Landroidx/compose/foundation/AndroidExternalSurfaceScope;", "Lkotlin/ExtensionFunctionType;", "AndroidExternalSurface-58FFMhA", "(Landroidx/compose/ui/Modifier;ZJIZLkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V", "rememberAndroidEmbeddedExternalSurfaceState", "Landroidx/compose/foundation/AndroidEmbeddedExternalSurfaceState;", "(Landroidx/compose/runtime/Composer;I)Landroidx/compose/foundation/AndroidEmbeddedExternalSurfaceState;", "AndroidEmbeddedExternalSurface", "transform", "Landroidx/compose/ui/graphics/Matrix;", "AndroidEmbeddedExternalSurface-sv6N_fY", "(Landroidx/compose/ui/Modifier;ZJ[FLkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V", "foundation"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class AndroidExternalSurface_androidKt {
    /* JADX WARN: Removed duplicated region for block: B:100:0x01d8  */
    /* JADX WARN: Removed duplicated region for block: B:101:0x01cc  */
    /* JADX WARN: Removed duplicated region for block: B:102:0x01c2  */
    /* JADX WARN: Removed duplicated region for block: B:107:0x016e  */
    /* JADX WARN: Removed duplicated region for block: B:10:0x004b  */
    /* JADX WARN: Removed duplicated region for block: B:120:0x021d  */
    /* JADX WARN: Removed duplicated region for block: B:121:0x00bd  */
    /* JADX WARN: Removed duplicated region for block: B:122:0x0084  */
    /* JADX WARN: Removed duplicated region for block: B:129:0x0067  */
    /* JADX WARN: Removed duplicated region for block: B:137:0x005e  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0064  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0081  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x00a0  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00ba  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00c6  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0116  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x0124  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x0138  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x0151  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x0161  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x016b  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x0199  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x01bf  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x01c9  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x01d5  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x0214  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x022a  */
    /* JADX WARN: Removed duplicated region for block: B:98:? A[RETURN, SYNTHETIC] */
    /* renamed from: AndroidExternalSurface-58FFMhA, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void m1282AndroidExternalSurface58FFMhA(androidx.compose.ui.Modifier modifier, boolean z, long j, int i, boolean z2, final kotlin.jvm.functions.Function1<? super androidx.compose.foundation.AndroidExternalSurfaceScope, kotlin.Unit> function1, androidx.compose.runtime.Composer composer, final int i2, final int i3) {
        androidx.compose.ui.Modifier modifier2;
        int i4;
        boolean z3;
        long j2;
        int i5;
        int i6;
        int i7;
        boolean z4;
        androidx.compose.ui.Modifier.Companion companion;
        final long j3;
        final boolean z5;
        final int i8;
        androidx.compose.runtime.ScopeUpdateScope endRestartGroup;
        boolean z6;
        boolean z7;
        final long j4;
        java.lang.Object rememberedValue;
        java.lang.Object rememberedValue2;
        boolean z8;
        boolean changedInstance;
        java.lang.Object rememberedValue3;
        java.lang.Object rememberedValue4;
        boolean z9;
        boolean z10;
        boolean z11;
        boolean z12;
        java.lang.Object rememberedValue5;
        androidx.compose.runtime.Composer startRestartGroup = composer.startRestartGroup(640888974);
        int i9 = i3 & 1;
        if (i9 != 0) {
            i4 = i2 | 6;
            modifier2 = modifier;
        } else if ((i2 & 6) == 0) {
            modifier2 = modifier;
            i4 = (startRestartGroup.changed(modifier2) ? 4 : 2) | i2;
        } else {
            modifier2 = modifier;
            i4 = i2;
        }
        int i10 = i3 & 2;
        if (i10 != 0) {
            i4 |= 48;
        } else if ((i2 & 48) == 0) {
            z3 = z;
            i4 |= startRestartGroup.changed(z3) ? 32 : 16;
            if ((i2 & 384) != 0) {
                j2 = j;
                i4 |= ((i3 & 4) == 0 && startRestartGroup.changed(j2)) ? 256 : 128;
            } else {
                j2 = j;
            }
            i5 = i3 & 8;
            if (i5 == 0) {
                i4 |= 3072;
            } else if ((i2 & 3072) == 0) {
                i6 = i;
                i4 |= startRestartGroup.changed(i6) ? 2048 : 1024;
                i7 = i3 & 16;
                if (i7 != 0) {
                    i4 |= 24576;
                } else if ((i2 & 24576) == 0) {
                    z4 = z2;
                    i4 |= startRestartGroup.changed(z4) ? 16384 : 8192;
                    if ((i2 & androidx.profileinstaller.ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE) == 0) {
                        i4 |= startRestartGroup.changedInstance(function1) ? 131072 : 65536;
                    }
                    if (!startRestartGroup.shouldExecute((i4 & 74899) == 74898, i4 & 1)) {
                        startRestartGroup.startDefaults();
                        if ((i2 & 1) != 0 && !startRestartGroup.getDefaultsInvalid()) {
                            startRestartGroup.skipToGroupEnd();
                            if ((i3 & 4) != 0) {
                                i4 &= -897;
                            }
                            companion = modifier2;
                        } else {
                            companion = i9 != 0 ? androidx.compose.ui.Modifier.INSTANCE : modifier2;
                            if (i10 != 0) {
                                z3 = true;
                            }
                            if ((i3 & 4) != 0) {
                                i4 &= -897;
                                j2 = androidx.compose.ui.unit.IntSize.INSTANCE.m8777getZeroYbymL2g();
                            }
                            if (i5 != 0) {
                                i6 = androidx.compose.foundation.AndroidExternalSurfaceZOrder.INSTANCE.m1275getBehindB_4ceCc();
                            }
                            if (i7 != 0) {
                                z6 = false;
                                z7 = z3;
                                final int i11 = i6;
                                int i12 = i4;
                                j4 = j2;
                                startRestartGroup.endDefaults();
                                if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                                    androidx.compose.runtime.ComposerKt.traceEventStart(640888974, i12, -1, "androidx.compose.foundation.AndroidExternalSurface (AndroidExternalSurface.android.kt:274)");
                                }
                                if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                                    androidx.compose.runtime.ComposerKt.traceEventStart(-873615933, 0, -1, "androidx.compose.foundation.rememberAndroidExternalSurfaceState (AndroidExternalSurface.android.kt:187)");
                                }
                                rememberedValue = startRestartGroup.rememberedValue();
                                if (rememberedValue == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                                    rememberedValue = androidx.compose.runtime.EffectsKt.createCompositionCoroutineScope(kotlin.coroutines.EmptyCoroutineContext.INSTANCE, startRestartGroup);
                                    startRestartGroup.updateRememberedValue(rememberedValue);
                                }
                                kotlinx.coroutines.CoroutineScope coroutineScope = (kotlinx.coroutines.CoroutineScope) rememberedValue;
                                rememberedValue2 = startRestartGroup.rememberedValue();
                                if (rememberedValue2 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                                    rememberedValue2 = new androidx.compose.foundation.AndroidExternalSurfaceState(coroutineScope);
                                    startRestartGroup.updateRememberedValue(rememberedValue2);
                                }
                                final androidx.compose.foundation.AndroidExternalSurfaceState androidExternalSurfaceState = (androidx.compose.foundation.AndroidExternalSurfaceState) rememberedValue2;
                                if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                                    androidx.compose.runtime.ComposerKt.traceEventEnd();
                                }
                                z8 = (458752 & i12) != 131072;
                                changedInstance = startRestartGroup.changedInstance(androidExternalSurfaceState);
                                rememberedValue3 = startRestartGroup.rememberedValue();
                                if (!(z8 | changedInstance) || rememberedValue3 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                                    rememberedValue3 = new kotlin.jvm.functions.Function1() { // from class: androidx.compose.foundation.AndroidExternalSurface_androidKt$$ExternalSyntheticLambda0
                                        @Override // kotlin.jvm.functions.Function1
                                        public final java.lang.Object invoke(java.lang.Object obj) {
                                            return androidx.compose.foundation.AndroidExternalSurface_androidKt.$r8$lambda$9SmtiSLAQ9hfeH2ebFaOKRh1n7g(kotlin.jvm.functions.Function1.this, androidExternalSurfaceState, (android.content.Context) obj);
                                        }
                                    };
                                    startRestartGroup.updateRememberedValue(rememberedValue3);
                                }
                                kotlin.jvm.functions.Function1 function12 = (kotlin.jvm.functions.Function1) rememberedValue3;
                                rememberedValue4 = startRestartGroup.rememberedValue();
                                if (rememberedValue4 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                                    rememberedValue4 = new kotlin.jvm.functions.Function1() { // from class: androidx.compose.foundation.AndroidExternalSurface_androidKt$$ExternalSyntheticLambda1
                                        @Override // kotlin.jvm.functions.Function1
                                        public final java.lang.Object invoke(java.lang.Object obj) {
                                            kotlin.Unit unit;
                                            unit = kotlin.Unit.INSTANCE;
                                            return unit;
                                        }
                                    };
                                    startRestartGroup.updateRememberedValue(rememberedValue4);
                                }
                                kotlin.jvm.functions.Function1 function13 = (kotlin.jvm.functions.Function1) rememberedValue4;
                                z9 = (((i12 & 896) ^ 384) <= 256 && startRestartGroup.changed(j4)) || (i12 & 384) == 256;
                                z10 = (i12 & 112) != 32;
                                z11 = (i12 & 7168) != 2048;
                                z12 = (57344 & i12) != 16384;
                                rememberedValue5 = startRestartGroup.rememberedValue();
                                if (!(z12 | z9 | z10 | z11) || rememberedValue5 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                                    final boolean z13 = z7;
                                    final boolean z14 = z6;
                                    rememberedValue5 = new kotlin.jvm.functions.Function1() { // from class: androidx.compose.foundation.AndroidExternalSurface_androidKt$$ExternalSyntheticLambda2
                                        @Override // kotlin.jvm.functions.Function1
                                        public final java.lang.Object invoke(java.lang.Object obj) {
                                            return androidx.compose.foundation.AndroidExternalSurface_androidKt.$r8$lambda$vtCG1ACX7GOhJVNcBTaeoO8jJAs(j4, z13, i11, z14, (android.view.SurfaceView) obj);
                                        }
                                    };
                                    startRestartGroup.updateRememberedValue(rememberedValue5);
                                }
                                androidx.compose.ui.viewinterop.AndroidView_androidKt.AndroidView(function12, companion, function13, null, (kotlin.jvm.functions.Function1) rememberedValue5, startRestartGroup, ((i12 << 3) & 112) | 384, 8);
                                if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                                    androidx.compose.runtime.ComposerKt.traceEventEnd();
                                }
                                z3 = z7;
                                j3 = j4;
                                i8 = i11;
                                z5 = z6;
                            }
                        }
                        z7 = z3;
                        z6 = z4;
                        final int i112 = i6;
                        int i122 = i4;
                        j4 = j2;
                        startRestartGroup.endDefaults();
                        if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                        }
                        if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                        }
                        rememberedValue = startRestartGroup.rememberedValue();
                        if (rememberedValue == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                        }
                        kotlinx.coroutines.CoroutineScope coroutineScope2 = (kotlinx.coroutines.CoroutineScope) rememberedValue;
                        rememberedValue2 = startRestartGroup.rememberedValue();
                        if (rememberedValue2 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                        }
                        final androidx.compose.foundation.AndroidExternalSurfaceState androidExternalSurfaceState2 = (androidx.compose.foundation.AndroidExternalSurfaceState) rememberedValue2;
                        if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                        }
                        if ((458752 & i122) != 131072) {
                        }
                        changedInstance = startRestartGroup.changedInstance(androidExternalSurfaceState2);
                        rememberedValue3 = startRestartGroup.rememberedValue();
                        if (!(z8 | changedInstance)) {
                        }
                        rememberedValue3 = new kotlin.jvm.functions.Function1() { // from class: androidx.compose.foundation.AndroidExternalSurface_androidKt$$ExternalSyntheticLambda0
                            @Override // kotlin.jvm.functions.Function1
                            public final java.lang.Object invoke(java.lang.Object obj) {
                                return androidx.compose.foundation.AndroidExternalSurface_androidKt.$r8$lambda$9SmtiSLAQ9hfeH2ebFaOKRh1n7g(kotlin.jvm.functions.Function1.this, androidExternalSurfaceState2, (android.content.Context) obj);
                            }
                        };
                        startRestartGroup.updateRememberedValue(rememberedValue3);
                        kotlin.jvm.functions.Function1 function122 = (kotlin.jvm.functions.Function1) rememberedValue3;
                        rememberedValue4 = startRestartGroup.rememberedValue();
                        if (rememberedValue4 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                        }
                        kotlin.jvm.functions.Function1 function132 = (kotlin.jvm.functions.Function1) rememberedValue4;
                        if (((i122 & 896) ^ 384) <= 256) {
                        }
                        if ((i122 & 112) != 32) {
                        }
                        if ((i122 & 7168) != 2048) {
                        }
                        if ((57344 & i122) != 16384) {
                        }
                        rememberedValue5 = startRestartGroup.rememberedValue();
                        if (!(z12 | z9 | z10 | z11)) {
                        }
                        final boolean z132 = z7;
                        final boolean z142 = z6;
                        rememberedValue5 = new kotlin.jvm.functions.Function1() { // from class: androidx.compose.foundation.AndroidExternalSurface_androidKt$$ExternalSyntheticLambda2
                            @Override // kotlin.jvm.functions.Function1
                            public final java.lang.Object invoke(java.lang.Object obj) {
                                return androidx.compose.foundation.AndroidExternalSurface_androidKt.$r8$lambda$vtCG1ACX7GOhJVNcBTaeoO8jJAs(j4, z132, i112, z142, (android.view.SurfaceView) obj);
                            }
                        };
                        startRestartGroup.updateRememberedValue(rememberedValue5);
                        androidx.compose.ui.viewinterop.AndroidView_androidKt.AndroidView(function122, companion, function132, null, (kotlin.jvm.functions.Function1) rememberedValue5, startRestartGroup, ((i122 << 3) & 112) | 384, 8);
                        if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                        }
                        z3 = z7;
                        j3 = j4;
                        i8 = i112;
                        z5 = z6;
                    } else {
                        startRestartGroup.skipToGroupEnd();
                        companion = modifier2;
                        j3 = j2;
                        z5 = z4;
                        i8 = i6;
                    }
                    endRestartGroup = startRestartGroup.endRestartGroup();
                    if (endRestartGroup == null) {
                        final androidx.compose.ui.Modifier modifier3 = companion;
                        final boolean z15 = z3;
                        endRestartGroup.updateScope(new kotlin.jvm.functions.Function2() { // from class: androidx.compose.foundation.AndroidExternalSurface_androidKt$$ExternalSyntheticLambda3
                            @Override // kotlin.jvm.functions.Function2
                            public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                                return androidx.compose.foundation.AndroidExternalSurface_androidKt.m1278$r8$lambda$V0jknNv99k0_nGkVpjLM_Aj7Po(androidx.compose.ui.Modifier.this, z15, j3, i8, z5, function1, i2, i3, (androidx.compose.runtime.Composer) obj, ((java.lang.Integer) obj2).intValue());
                            }
                        });
                        return;
                    }
                    return;
                }
                z4 = z2;
                if ((i2 & androidx.profileinstaller.ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE) == 0) {
                }
                if (!startRestartGroup.shouldExecute((i4 & 74899) == 74898, i4 & 1)) {
                }
                endRestartGroup = startRestartGroup.endRestartGroup();
                if (endRestartGroup == null) {
                }
            }
            i6 = i;
            i7 = i3 & 16;
            if (i7 != 0) {
            }
            z4 = z2;
            if ((i2 & androidx.profileinstaller.ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE) == 0) {
            }
            if (!startRestartGroup.shouldExecute((i4 & 74899) == 74898, i4 & 1)) {
            }
            endRestartGroup = startRestartGroup.endRestartGroup();
            if (endRestartGroup == null) {
            }
        }
        z3 = z;
        if ((i2 & 384) != 0) {
        }
        i5 = i3 & 8;
        if (i5 == 0) {
        }
        i6 = i;
        i7 = i3 & 16;
        if (i7 != 0) {
        }
        z4 = z2;
        if ((i2 & androidx.profileinstaller.ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE) == 0) {
        }
        if (!startRestartGroup.shouldExecute((i4 & 74899) == 74898, i4 & 1)) {
        }
        endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup == null) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:106:0x01ea  */
    /* JADX WARN: Removed duplicated region for block: B:107:0x00a0  */
    /* JADX WARN: Removed duplicated region for block: B:109:0x0092  */
    /* JADX WARN: Removed duplicated region for block: B:10:0x004b  */
    /* JADX WARN: Removed duplicated region for block: B:110:0x0066  */
    /* JADX WARN: Removed duplicated region for block: B:121:0x005d  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0063  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0082  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x009d  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x00a9  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00f1  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x00fc  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0110  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x0129  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x013a  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x0149  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x015f  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x0189  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x0193  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x0199  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x01e3  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x01f7  */
    /* JADX WARN: Removed duplicated region for block: B:87:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:89:0x019e  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x0196  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x018c  */
    /* renamed from: AndroidEmbeddedExternalSurface-sv6N_fY, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void m1281AndroidEmbeddedExternalSurfacesv6N_fY(androidx.compose.ui.Modifier modifier, boolean z, long j, float[] fArr, final kotlin.jvm.functions.Function1<? super androidx.compose.foundation.AndroidExternalSurfaceScope, kotlin.Unit> function1, androidx.compose.runtime.Composer composer, final int i, final int i2) {
        androidx.compose.ui.Modifier modifier2;
        int i3;
        boolean z2;
        long j2;
        int i4;
        final float[] fArr2;
        androidx.compose.ui.Modifier.Companion companion;
        final long j3;
        androidx.compose.runtime.ScopeUpdateScope endRestartGroup;
        float[] fArr3;
        boolean z3;
        final long j4;
        java.lang.Object rememberedValue;
        java.lang.Object rememberedValue2;
        java.lang.Object rememberedValue3;
        java.lang.Object rememberedValue4;
        boolean z4;
        boolean changedInstance;
        boolean z5;
        boolean z6;
        boolean changedInstance2;
        java.lang.Object rememberedValue5;
        androidx.compose.runtime.Composer startRestartGroup = composer.startRestartGroup(217541314);
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
            if (!startRestartGroup.shouldExecute((i3 & 9363) == 9362, i3 & 1)) {
                startRestartGroup.startDefaults();
                if ((i & 1) != 0 && !startRestartGroup.getDefaultsInvalid()) {
                    startRestartGroup.skipToGroupEnd();
                    if ((i2 & 4) != 0) {
                        i3 &= -897;
                    }
                    fArr3 = fArr;
                    companion = modifier2;
                } else {
                    companion = i5 != 0 ? androidx.compose.ui.Modifier.INSTANCE : modifier2;
                    if (i6 != 0) {
                        z2 = true;
                    }
                    if ((i2 & 4) != 0) {
                        i3 &= -897;
                        j2 = androidx.compose.ui.unit.IntSize.INSTANCE.m8777getZeroYbymL2g();
                    }
                    if (i4 != 0) {
                        z3 = z2;
                        fArr3 = null;
                        int i7 = i3;
                        j4 = j2;
                        startRestartGroup.endDefaults();
                        if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                            androidx.compose.runtime.ComposerKt.traceEventStart(217541314, i7, -1, "androidx.compose.foundation.AndroidEmbeddedExternalSurface (AndroidExternalSurface.android.kt:432)");
                        }
                        if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                            androidx.compose.runtime.ComposerKt.traceEventStart(-1057437053, 0, -1, "androidx.compose.foundation.rememberAndroidEmbeddedExternalSurfaceState (AndroidExternalSurface.android.kt:370)");
                        }
                        rememberedValue = startRestartGroup.rememberedValue();
                        if (rememberedValue == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                            rememberedValue = androidx.compose.runtime.EffectsKt.createCompositionCoroutineScope(kotlin.coroutines.EmptyCoroutineContext.INSTANCE, startRestartGroup);
                            startRestartGroup.updateRememberedValue(rememberedValue);
                        }
                        kotlinx.coroutines.CoroutineScope coroutineScope = (kotlinx.coroutines.CoroutineScope) rememberedValue;
                        rememberedValue2 = startRestartGroup.rememberedValue();
                        if (rememberedValue2 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                            rememberedValue2 = new androidx.compose.foundation.AndroidEmbeddedExternalSurfaceState(coroutineScope);
                            startRestartGroup.updateRememberedValue(rememberedValue2);
                        }
                        final androidx.compose.foundation.AndroidEmbeddedExternalSurfaceState androidEmbeddedExternalSurfaceState = (androidx.compose.foundation.AndroidEmbeddedExternalSurfaceState) rememberedValue2;
                        if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                            androidx.compose.runtime.ComposerKt.traceEventEnd();
                        }
                        rememberedValue3 = startRestartGroup.rememberedValue();
                        if (rememberedValue3 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                            rememberedValue3 = new kotlin.jvm.functions.Function1() { // from class: androidx.compose.foundation.AndroidExternalSurface_androidKt$$ExternalSyntheticLambda4
                                @Override // kotlin.jvm.functions.Function1
                                public final java.lang.Object invoke(java.lang.Object obj) {
                                    return androidx.compose.foundation.AndroidExternalSurface_androidKt.$r8$lambda$AADyQaGNBx4TcT2CHAXzE1MPVG8((android.content.Context) obj);
                                }
                            };
                            startRestartGroup.updateRememberedValue(rememberedValue3);
                        }
                        kotlin.jvm.functions.Function1 function12 = (kotlin.jvm.functions.Function1) rememberedValue3;
                        rememberedValue4 = startRestartGroup.rememberedValue();
                        if (rememberedValue4 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                            rememberedValue4 = new kotlin.jvm.functions.Function1() { // from class: androidx.compose.foundation.AndroidExternalSurface_androidKt$$ExternalSyntheticLambda5
                                @Override // kotlin.jvm.functions.Function1
                                public final java.lang.Object invoke(java.lang.Object obj) {
                                    kotlin.Unit unit;
                                    unit = kotlin.Unit.INSTANCE;
                                    return unit;
                                }
                            };
                            startRestartGroup.updateRememberedValue(rememberedValue4);
                        }
                        kotlin.jvm.functions.Function1 function13 = (kotlin.jvm.functions.Function1) rememberedValue4;
                        z4 = (((i7 & 896) ^ 384) <= 256 && startRestartGroup.changed(j4)) || (i7 & 384) == 256;
                        changedInstance = startRestartGroup.changedInstance(androidEmbeddedExternalSurfaceState);
                        z5 = (57344 & i7) != 16384;
                        z6 = (i7 & 112) != 32;
                        changedInstance2 = startRestartGroup.changedInstance(fArr3 == null ? androidx.compose.ui.graphics.Matrix.m6221boximpl(fArr3) : null);
                        rememberedValue5 = startRestartGroup.rememberedValue();
                        if (!(changedInstance2 | z4 | changedInstance | z5 | z6) || rememberedValue5 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                            final boolean z7 = z3;
                            final float[] fArr4 = fArr3;
                            rememberedValue5 = new kotlin.jvm.functions.Function1() { // from class: androidx.compose.foundation.AndroidExternalSurface_androidKt$$ExternalSyntheticLambda6
                                @Override // kotlin.jvm.functions.Function1
                                public final java.lang.Object invoke(java.lang.Object obj) {
                                    return androidx.compose.foundation.AndroidExternalSurface_androidKt.m1280$r8$lambda$y_m2f4LOZryKRPlLAkDxg9FoQ(j4, androidEmbeddedExternalSurfaceState, function1, z7, fArr4, (android.view.TextureView) obj);
                                }
                            };
                            startRestartGroup.updateRememberedValue(rememberedValue5);
                        }
                        androidx.compose.ui.viewinterop.AndroidView_androidKt.AndroidView(function12, companion, function13, null, (kotlin.jvm.functions.Function1) rememberedValue5, startRestartGroup, ((i7 << 3) & 112) | 390, 8);
                        if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                            androidx.compose.runtime.ComposerKt.traceEventEnd();
                        }
                        z2 = z3;
                        j3 = j4;
                        fArr2 = fArr3;
                    } else {
                        fArr3 = fArr;
                    }
                }
                z3 = z2;
                int i72 = i3;
                j4 = j2;
                startRestartGroup.endDefaults();
                if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                }
                if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                }
                rememberedValue = startRestartGroup.rememberedValue();
                if (rememberedValue == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                }
                kotlinx.coroutines.CoroutineScope coroutineScope2 = (kotlinx.coroutines.CoroutineScope) rememberedValue;
                rememberedValue2 = startRestartGroup.rememberedValue();
                if (rememberedValue2 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                }
                final androidx.compose.foundation.AndroidEmbeddedExternalSurfaceState androidEmbeddedExternalSurfaceState2 = (androidx.compose.foundation.AndroidEmbeddedExternalSurfaceState) rememberedValue2;
                if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                }
                rememberedValue3 = startRestartGroup.rememberedValue();
                if (rememberedValue3 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                }
                kotlin.jvm.functions.Function1 function122 = (kotlin.jvm.functions.Function1) rememberedValue3;
                rememberedValue4 = startRestartGroup.rememberedValue();
                if (rememberedValue4 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                }
                kotlin.jvm.functions.Function1 function132 = (kotlin.jvm.functions.Function1) rememberedValue4;
                if (((i72 & 896) ^ 384) <= 256) {
                }
                changedInstance = startRestartGroup.changedInstance(androidEmbeddedExternalSurfaceState2);
                if ((57344 & i72) != 16384) {
                }
                if ((i72 & 112) != 32) {
                }
                changedInstance2 = startRestartGroup.changedInstance(fArr3 == null ? androidx.compose.ui.graphics.Matrix.m6221boximpl(fArr3) : null);
                rememberedValue5 = startRestartGroup.rememberedValue();
                if (!(changedInstance2 | z4 | changedInstance | z5 | z6)) {
                }
                final boolean z72 = z3;
                final float[] fArr42 = fArr3;
                rememberedValue5 = new kotlin.jvm.functions.Function1() { // from class: androidx.compose.foundation.AndroidExternalSurface_androidKt$$ExternalSyntheticLambda6
                    @Override // kotlin.jvm.functions.Function1
                    public final java.lang.Object invoke(java.lang.Object obj) {
                        return androidx.compose.foundation.AndroidExternalSurface_androidKt.m1280$r8$lambda$y_m2f4LOZryKRPlLAkDxg9FoQ(j4, androidEmbeddedExternalSurfaceState2, function1, z72, fArr42, (android.view.TextureView) obj);
                    }
                };
                startRestartGroup.updateRememberedValue(rememberedValue5);
                androidx.compose.ui.viewinterop.AndroidView_androidKt.AndroidView(function122, companion, function132, null, (kotlin.jvm.functions.Function1) rememberedValue5, startRestartGroup, ((i72 << 3) & 112) | 390, 8);
                if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                }
                z2 = z3;
                j3 = j4;
                fArr2 = fArr3;
            } else {
                startRestartGroup.skipToGroupEnd();
                fArr2 = fArr;
                companion = modifier2;
                j3 = j2;
            }
            endRestartGroup = startRestartGroup.endRestartGroup();
            if (endRestartGroup == null) {
                final androidx.compose.ui.Modifier modifier3 = companion;
                final boolean z8 = z2;
                endRestartGroup.updateScope(new kotlin.jvm.functions.Function2() { // from class: androidx.compose.foundation.AndroidExternalSurface_androidKt$$ExternalSyntheticLambda7
                    @Override // kotlin.jvm.functions.Function2
                    public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                        return androidx.compose.foundation.AndroidExternalSurface_androidKt.m1279$r8$lambda$hTZLil1jlR821YHFeU4Mzj1YV8(androidx.compose.ui.Modifier.this, z8, j3, fArr2, function1, i, i2, (androidx.compose.runtime.Composer) obj, ((java.lang.Integer) obj2).intValue());
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
        if (!startRestartGroup.shouldExecute((i3 & 9363) == 9362, i3 & 1)) {
        }
        endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup == null) {
        }
    }

    public static /* synthetic */ android.view.SurfaceView $r8$lambda$9SmtiSLAQ9hfeH2ebFaOKRh1n7g(kotlin.jvm.functions.Function1 function1, androidx.compose.foundation.AndroidExternalSurfaceState androidExternalSurfaceState, android.content.Context context) {
        android.view.SurfaceView surfaceView = new android.view.SurfaceView(context);
        function1.invoke(androidExternalSurfaceState);
        surfaceView.getHolder().addCallback(androidExternalSurfaceState);
        return surfaceView;
    }

    public static /* synthetic */ android.view.TextureView $r8$lambda$AADyQaGNBx4TcT2CHAXzE1MPVG8(android.content.Context context) {
        return new android.view.TextureView(context);
    }

    /* renamed from: $r8$lambda$V0jknN-v99k0_nGkVpjLM_Aj7Po, reason: not valid java name */
    public static /* synthetic */ kotlin.Unit m1278$r8$lambda$V0jknNv99k0_nGkVpjLM_Aj7Po(androidx.compose.ui.Modifier modifier, boolean z, long j, int i, boolean z2, kotlin.jvm.functions.Function1 function1, int i2, int i3, androidx.compose.runtime.Composer composer, int i4) {
        m1282AndroidExternalSurface58FFMhA(modifier, z, j, i, z2, function1, composer, androidx.compose.runtime.RecomposeScopeImplKt.updateChangedFlags(i2 | 1), i3);
        return kotlin.Unit.INSTANCE;
    }

    /* renamed from: $r8$lambda$hTZL-il1jlR821YHFeU4Mzj1YV8, reason: not valid java name */
    public static /* synthetic */ kotlin.Unit m1279$r8$lambda$hTZLil1jlR821YHFeU4Mzj1YV8(androidx.compose.ui.Modifier modifier, boolean z, long j, float[] fArr, kotlin.jvm.functions.Function1 function1, int i, int i2, androidx.compose.runtime.Composer composer, int i3) {
        m1281AndroidEmbeddedExternalSurfacesv6N_fY(modifier, z, j, fArr, function1, composer, androidx.compose.runtime.RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$vtCG1ACX7GOhJVNcBTaeoO8jJAs(long j, boolean z, int i, boolean z2, android.view.SurfaceView surfaceView) {
        if (!androidx.compose.ui.unit.IntSize.m8770equalsimpl0(j, androidx.compose.ui.unit.IntSize.INSTANCE.m8777getZeroYbymL2g())) {
            surfaceView.getHolder().setFixedSize((int) (j >> 32), (int) (j & 4294967295L));
        } else {
            surfaceView.getHolder().setSizeFromLayout();
        }
        surfaceView.getHolder().setFormat(z ? -1 : -3);
        if (androidx.compose.foundation.AndroidExternalSurfaceZOrder.m1271equalsimpl0(i, androidx.compose.foundation.AndroidExternalSurfaceZOrder.INSTANCE.m1275getBehindB_4ceCc())) {
            surfaceView.setZOrderOnTop(false);
        } else if (androidx.compose.foundation.AndroidExternalSurfaceZOrder.m1271equalsimpl0(i, androidx.compose.foundation.AndroidExternalSurfaceZOrder.INSTANCE.m1276getMediaOverlayB_4ceCc())) {
            surfaceView.setZOrderMediaOverlay(true);
        } else if (androidx.compose.foundation.AndroidExternalSurfaceZOrder.m1271equalsimpl0(i, androidx.compose.foundation.AndroidExternalSurfaceZOrder.INSTANCE.m1277getOnTopB_4ceCc())) {
            surfaceView.setZOrderOnTop(true);
        }
        surfaceView.setSecure(z2);
        return kotlin.Unit.INSTANCE;
    }

    /* renamed from: $r8$lambda$y_m2f4L-OZryKRPlLAkDxg-9FoQ, reason: not valid java name */
    public static /* synthetic */ kotlin.Unit m1280$r8$lambda$y_m2f4LOZryKRPlLAkDxg9FoQ(long j, androidx.compose.foundation.AndroidEmbeddedExternalSurfaceState androidEmbeddedExternalSurfaceState, kotlin.jvm.functions.Function1 function1, boolean z, float[] fArr, android.view.TextureView textureView) {
        android.graphics.Matrix matrix;
        android.graphics.SurfaceTexture surfaceTexture;
        if (!androidx.compose.ui.unit.IntSize.m8770equalsimpl0(j, androidx.compose.ui.unit.IntSize.INSTANCE.m8777getZeroYbymL2g()) && (surfaceTexture = textureView.getSurfaceTexture()) != null) {
            surfaceTexture.setDefaultBufferSize((int) (j >> 32), (int) (4294967295L & j));
        }
        androidEmbeddedExternalSurfaceState.Camera2StreamConfigurationMap = j;
        if (textureView.getSurfaceTextureListener() != androidEmbeddedExternalSurfaceState) {
            function1.invoke(androidEmbeddedExternalSurfaceState);
            textureView.setSurfaceTextureListener(androidEmbeddedExternalSurfaceState);
        }
        textureView.setOpaque(z);
        if (fArr != null) {
            matrix = androidEmbeddedExternalSurfaceState.getGetHighSpeedVideoFpsRanges();
            androidx.compose.ui.graphics.AndroidMatrixConversions_androidKt.m5864setFromEL8BTi8(matrix, fArr);
        } else {
            matrix = null;
        }
        textureView.setTransform(matrix);
        return kotlin.Unit.INSTANCE;
    }
}
