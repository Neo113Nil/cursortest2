package androidx.camera.viewfinder.compose.internal;

@kotlin.Metadata(d1 = {"\u0000:\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\r\u0010\u0002\u001a\u00020\u0003H\u0003¢\u0006\u0002\u0010\u0004\u001aP\u0010\u0005\u001a\u00020\u00062\b\b\u0002\u0010\u0007\u001a\u00020\b2\b\b\u0002\u0010\t\u001a\u00020\n2\b\b\u0002\u0010\u000b\u001a\u00020\f2\b\b\u0002\u0010\r\u001a\u00020\n2\u0017\u0010\u000e\u001a\u0013\u0012\u0004\u0012\u00020\u0010\u0012\u0004\u0012\u00020\u00060\u000f¢\u0006\u0002\b\u0011H\u0001¢\u0006\u0004\b\u0012\u0010\u0013\"\u000e\u0010\u0000\u001a\u00020\u0001X\u0082T¢\u0006\u0002\n\u0000¨\u0006\u0014"}, d2 = {"TAG", "", "rememberViewfinderExternalSurfaceState", "Landroidx/camera/viewfinder/compose/internal/ViewfinderExternalSurfaceState;", "(Landroidx/compose/runtime/Composer;I)Landroidx/camera/viewfinder/compose/internal/ViewfinderExternalSurfaceState;", "ViewfinderExternalSurface", "", "modifier", "Landroidx/compose/ui/Modifier;", "isOpaque", "", "surfaceSize", "Landroidx/compose/ui/unit/IntSize;", "isSecure", "onInit", "Lkotlin/Function1;", "Landroidx/camera/viewfinder/compose/internal/ViewfinderExternalSurfaceScope;", "Lkotlin/ExtensionFunctionType;", "ViewfinderExternalSurface-JQ-Ljw8", "(Landroidx/compose/ui/Modifier;ZJZLkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V", "viewfinder-compose"}, k = 2, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class ViewfinderExternalSurfaceKt {
    /* JADX WARN: Removed duplicated region for block: B:101:0x00d1  */
    /* JADX WARN: Removed duplicated region for block: B:103:0x00dc  */
    /* JADX WARN: Removed duplicated region for block: B:104:0x00c8  */
    /* JADX WARN: Removed duplicated region for block: B:106:0x0090  */
    /* JADX WARN: Removed duplicated region for block: B:107:0x0065  */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0049  */
    /* JADX WARN: Removed duplicated region for block: B:115:0x005c  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0062  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0080  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0098  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x01f3  */
    /* JADX WARN: Removed duplicated region for block: B:36:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:39:0x00b0  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x00ed  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x00f8  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x010c  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x012f  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x0140  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x014f  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x0165  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x0179  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x0185  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x0199  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x01a4  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x01b1  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x01e7  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x019c  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x017c  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x00c3  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x00cb  */
    /* renamed from: ViewfinderExternalSurface-JQ-Ljw8, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void m1048ViewfinderExternalSurfaceJQLjw8(androidx.compose.ui.Modifier modifier, boolean z, long j, boolean z2, final kotlin.jvm.functions.Function1<? super androidx.camera.viewfinder.compose.internal.ViewfinderExternalSurfaceScope, kotlin.Unit> function1, androidx.compose.runtime.Composer composer, final int i, final int i2) {
        androidx.compose.ui.Modifier modifier2;
        int i3;
        boolean z3;
        long j2;
        int i4;
        boolean z4;
        androidx.compose.ui.Modifier.Companion companion;
        boolean z5;
        boolean z6;
        final long j3;
        java.lang.Object rememberedValue;
        java.lang.Object rememberedValue2;
        java.lang.Object rememberedValue3;
        java.lang.Object rememberedValue4;
        boolean changedInstance;
        boolean z7;
        boolean z8;
        boolean z9;
        boolean z10;
        java.lang.Object rememberedValue5;
        final long j4;
        final boolean z11;
        androidx.compose.runtime.ScopeUpdateScope endRestartGroup;
        androidx.compose.runtime.Composer startRestartGroup = composer.startRestartGroup(1843357976);
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
            z3 = z;
            i3 |= startRestartGroup.changed(z3) ? 32 : 16;
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
                z4 = z2;
                i3 |= startRestartGroup.changed(z4) ? 2048 : 1024;
                if ((i & 24576) == 0) {
                    i3 |= startRestartGroup.changedInstance(function1) ? 16384 : 8192;
                }
                if ((i3 & 9363) != 9362 && startRestartGroup.getSkipping()) {
                    startRestartGroup.skipToGroupEnd();
                    companion = modifier2;
                    j4 = j2;
                    z11 = z4;
                } else {
                    startRestartGroup.startDefaults();
                    if ((i & 1) == 0 && !startRestartGroup.getDefaultsInvalid()) {
                        startRestartGroup.skipToGroupEnd();
                        if ((i2 & 4) != 0) {
                            i3 &= -897;
                        }
                        companion = modifier2;
                    } else {
                        companion = i5 != 0 ? androidx.compose.ui.Modifier.INSTANCE : modifier2;
                        if (i6 != 0) {
                            z3 = true;
                        }
                        if ((i2 & 4) != 0) {
                            i3 &= -897;
                            j2 = androidx.compose.ui.unit.IntSize.INSTANCE.m8777getZeroYbymL2g();
                        }
                        if (i4 != 0) {
                            z5 = z3;
                            z6 = false;
                            int i7 = i3;
                            j3 = j2;
                            startRestartGroup.endDefaults();
                            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                                androidx.compose.runtime.ComposerKt.traceEventStart(1843357976, i7, -1, "androidx.camera.viewfinder.compose.internal.ViewfinderExternalSurface (ViewfinderExternalSurface.kt:160)");
                            }
                            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                                androidx.compose.runtime.ComposerKt.traceEventStart(717030682, 0, -1, "androidx.camera.viewfinder.compose.internal.rememberViewfinderExternalSurfaceState (ViewfinderExternalSurface.kt:135)");
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
                                rememberedValue2 = new androidx.camera.viewfinder.compose.internal.ViewfinderExternalSurfaceState(coroutineScope);
                                startRestartGroup.updateRememberedValue(rememberedValue2);
                            }
                            final androidx.camera.viewfinder.compose.internal.ViewfinderExternalSurfaceState viewfinderExternalSurfaceState = (androidx.camera.viewfinder.compose.internal.ViewfinderExternalSurfaceState) rememberedValue2;
                            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                                androidx.compose.runtime.ComposerKt.traceEventEnd();
                            }
                            rememberedValue3 = startRestartGroup.rememberedValue();
                            if (rememberedValue3 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                                rememberedValue3 = new kotlin.jvm.functions.Function1() { // from class: androidx.camera.viewfinder.compose.internal.ViewfinderExternalSurfaceKt$$ExternalSyntheticLambda0
                                    @Override // kotlin.jvm.functions.Function1
                                    public final java.lang.Object invoke(java.lang.Object obj) {
                                        return androidx.camera.viewfinder.compose.internal.ViewfinderExternalSurfaceKt.$r8$lambda$4C2hpyQWrUumvNtzj7Ttq7qt5A0((android.content.Context) obj);
                                    }
                                };
                                startRestartGroup.updateRememberedValue(rememberedValue3);
                            }
                            kotlin.jvm.functions.Function1 function12 = (kotlin.jvm.functions.Function1) rememberedValue3;
                            rememberedValue4 = startRestartGroup.rememberedValue();
                            if (rememberedValue4 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                                rememberedValue4 = new kotlin.jvm.functions.Function1() { // from class: androidx.camera.viewfinder.compose.internal.ViewfinderExternalSurfaceKt$$ExternalSyntheticLambda1
                                    @Override // kotlin.jvm.functions.Function1
                                    public final java.lang.Object invoke(java.lang.Object obj) {
                                        return androidx.camera.viewfinder.compose.internal.ViewfinderExternalSurfaceKt.m1047$r8$lambda$c_Jqibh8O16sI4DQNynI46Q3c((androidx.camera.viewfinder.compose.internal.ViewfinderExternalSurfaceKt$ViewfinderExternalSurface$1$1$1) obj);
                                    }
                                };
                                startRestartGroup.updateRememberedValue(rememberedValue4);
                            }
                            kotlin.jvm.functions.Function1 function13 = (kotlin.jvm.functions.Function1) rememberedValue4;
                            changedInstance = startRestartGroup.changedInstance(viewfinderExternalSurfaceState);
                            z7 = (57344 & i7) != 16384;
                            z8 = (((i7 & 896) ^ 384) <= 256 && startRestartGroup.changed(j3)) || (i7 & 384) == 256;
                            z9 = (i7 & 112) != 32;
                            z10 = (i7 & 7168) == 2048;
                            rememberedValue5 = startRestartGroup.rememberedValue();
                            if (!(z9 | z8 | changedInstance | z7 | z10) || rememberedValue5 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                                final boolean z12 = z5;
                                final boolean z13 = z6;
                                rememberedValue5 = new kotlin.jvm.functions.Function1() { // from class: androidx.camera.viewfinder.compose.internal.ViewfinderExternalSurfaceKt$$ExternalSyntheticLambda2
                                    @Override // kotlin.jvm.functions.Function1
                                    public final java.lang.Object invoke(java.lang.Object obj) {
                                        return androidx.camera.viewfinder.compose.internal.ViewfinderExternalSurfaceKt.$r8$lambda$Tk_eFJImewlO3mkYacV2wxjv7EQ(androidx.camera.viewfinder.compose.internal.ViewfinderExternalSurfaceState.this, function1, j3, z12, z13, (androidx.camera.viewfinder.compose.internal.ViewfinderExternalSurfaceKt$ViewfinderExternalSurface$1$1$1) obj);
                                    }
                                };
                                startRestartGroup.updateRememberedValue(rememberedValue5);
                            }
                            androidx.compose.ui.viewinterop.AndroidView_androidKt.AndroidView(function12, companion, function13, null, (kotlin.jvm.functions.Function1) rememberedValue5, startRestartGroup, ((i7 << 3) & 112) | 390, 8);
                            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                                androidx.compose.runtime.ComposerKt.traceEventEnd();
                            }
                            z3 = z5;
                            j4 = j3;
                            z11 = z6;
                        }
                    }
                    z5 = z3;
                    z6 = z4;
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
                    final androidx.camera.viewfinder.compose.internal.ViewfinderExternalSurfaceState viewfinderExternalSurfaceState2 = (androidx.camera.viewfinder.compose.internal.ViewfinderExternalSurfaceState) rememberedValue2;
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
                    changedInstance = startRestartGroup.changedInstance(viewfinderExternalSurfaceState2);
                    if ((57344 & i72) != 16384) {
                    }
                    if (((i72 & 896) ^ 384) <= 256) {
                    }
                    if ((i72 & 112) != 32) {
                    }
                    if ((i72 & 7168) == 2048) {
                    }
                    rememberedValue5 = startRestartGroup.rememberedValue();
                    if (!(z9 | z8 | changedInstance | z7 | z10)) {
                    }
                    final boolean z122 = z5;
                    final boolean z132 = z6;
                    rememberedValue5 = new kotlin.jvm.functions.Function1() { // from class: androidx.camera.viewfinder.compose.internal.ViewfinderExternalSurfaceKt$$ExternalSyntheticLambda2
                        @Override // kotlin.jvm.functions.Function1
                        public final java.lang.Object invoke(java.lang.Object obj) {
                            return androidx.camera.viewfinder.compose.internal.ViewfinderExternalSurfaceKt.$r8$lambda$Tk_eFJImewlO3mkYacV2wxjv7EQ(androidx.camera.viewfinder.compose.internal.ViewfinderExternalSurfaceState.this, function1, j3, z122, z132, (androidx.camera.viewfinder.compose.internal.ViewfinderExternalSurfaceKt$ViewfinderExternalSurface$1$1$1) obj);
                        }
                    };
                    startRestartGroup.updateRememberedValue(rememberedValue5);
                    androidx.compose.ui.viewinterop.AndroidView_androidKt.AndroidView(function122, companion, function132, null, (kotlin.jvm.functions.Function1) rememberedValue5, startRestartGroup, ((i72 << 3) & 112) | 390, 8);
                    if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                    }
                    z3 = z5;
                    j4 = j3;
                    z11 = z6;
                }
                endRestartGroup = startRestartGroup.endRestartGroup();
                if (endRestartGroup != null) {
                    final androidx.compose.ui.Modifier modifier3 = companion;
                    final boolean z14 = z3;
                    endRestartGroup.updateScope(new kotlin.jvm.functions.Function2() { // from class: androidx.camera.viewfinder.compose.internal.ViewfinderExternalSurfaceKt$$ExternalSyntheticLambda3
                        @Override // kotlin.jvm.functions.Function2
                        public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                            return androidx.camera.viewfinder.compose.internal.ViewfinderExternalSurfaceKt.$r8$lambda$OxMHD89_L384yneZ2bGSWTHrVjs(androidx.compose.ui.Modifier.this, z14, j4, z11, function1, i, i2, (androidx.compose.runtime.Composer) obj, ((java.lang.Integer) obj2).intValue());
                        }
                    });
                    return;
                }
                return;
            }
            z4 = z2;
            if ((i & 24576) == 0) {
            }
            if ((i3 & 9363) != 9362) {
            }
            startRestartGroup.startDefaults();
            if ((i & 1) == 0) {
            }
            if (i5 != 0) {
            }
            if (i6 != 0) {
            }
            if ((i2 & 4) != 0) {
            }
            if (i4 != 0) {
            }
            z5 = z3;
            z6 = z4;
            int i722 = i3;
            j3 = j2;
            startRestartGroup.endDefaults();
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
            }
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
            }
            rememberedValue = startRestartGroup.rememberedValue();
            if (rememberedValue == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
            }
            kotlinx.coroutines.CoroutineScope coroutineScope22 = ((androidx.compose.runtime.CompositionScopedCoroutineScopeCanceller) rememberedValue).getCoroutineScope();
            rememberedValue2 = startRestartGroup.rememberedValue();
            if (rememberedValue2 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
            }
            final androidx.camera.viewfinder.compose.internal.ViewfinderExternalSurfaceState viewfinderExternalSurfaceState22 = (androidx.camera.viewfinder.compose.internal.ViewfinderExternalSurfaceState) rememberedValue2;
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
            }
            rememberedValue3 = startRestartGroup.rememberedValue();
            if (rememberedValue3 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
            }
            kotlin.jvm.functions.Function1 function1222 = (kotlin.jvm.functions.Function1) rememberedValue3;
            rememberedValue4 = startRestartGroup.rememberedValue();
            if (rememberedValue4 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
            }
            kotlin.jvm.functions.Function1 function1322 = (kotlin.jvm.functions.Function1) rememberedValue4;
            changedInstance = startRestartGroup.changedInstance(viewfinderExternalSurfaceState22);
            if ((57344 & i722) != 16384) {
            }
            if (((i722 & 896) ^ 384) <= 256) {
            }
            if ((i722 & 112) != 32) {
            }
            if ((i722 & 7168) == 2048) {
            }
            rememberedValue5 = startRestartGroup.rememberedValue();
            if (!(z9 | z8 | changedInstance | z7 | z10)) {
            }
            final boolean z1222 = z5;
            final boolean z1322 = z6;
            rememberedValue5 = new kotlin.jvm.functions.Function1() { // from class: androidx.camera.viewfinder.compose.internal.ViewfinderExternalSurfaceKt$$ExternalSyntheticLambda2
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj) {
                    return androidx.camera.viewfinder.compose.internal.ViewfinderExternalSurfaceKt.$r8$lambda$Tk_eFJImewlO3mkYacV2wxjv7EQ(androidx.camera.viewfinder.compose.internal.ViewfinderExternalSurfaceState.this, function1, j3, z1222, z1322, (androidx.camera.viewfinder.compose.internal.ViewfinderExternalSurfaceKt$ViewfinderExternalSurface$1$1$1) obj);
                }
            };
            startRestartGroup.updateRememberedValue(rememberedValue5);
            androidx.compose.ui.viewinterop.AndroidView_androidKt.AndroidView(function1222, companion, function1322, null, (kotlin.jvm.functions.Function1) rememberedValue5, startRestartGroup, ((i722 << 3) & 112) | 390, 8);
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
            }
            z3 = z5;
            j4 = j3;
            z11 = z6;
            endRestartGroup = startRestartGroup.endRestartGroup();
            if (endRestartGroup != null) {
            }
        }
        z3 = z;
        if ((i & 384) != 0) {
        }
        i4 = i2 & 8;
        if (i4 == 0) {
        }
        z4 = z2;
        if ((i & 24576) == 0) {
        }
        if ((i3 & 9363) != 9362) {
        }
        startRestartGroup.startDefaults();
        if ((i & 1) == 0) {
        }
        if (i5 != 0) {
        }
        if (i6 != 0) {
        }
        if ((i2 & 4) != 0) {
        }
        if (i4 != 0) {
        }
        z5 = z3;
        z6 = z4;
        int i7222 = i3;
        j3 = j2;
        startRestartGroup.endDefaults();
        if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
        }
        if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
        }
        rememberedValue = startRestartGroup.rememberedValue();
        if (rememberedValue == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
        }
        kotlinx.coroutines.CoroutineScope coroutineScope222 = ((androidx.compose.runtime.CompositionScopedCoroutineScopeCanceller) rememberedValue).getCoroutineScope();
        rememberedValue2 = startRestartGroup.rememberedValue();
        if (rememberedValue2 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
        }
        final androidx.camera.viewfinder.compose.internal.ViewfinderExternalSurfaceState viewfinderExternalSurfaceState222 = (androidx.camera.viewfinder.compose.internal.ViewfinderExternalSurfaceState) rememberedValue2;
        if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
        }
        rememberedValue3 = startRestartGroup.rememberedValue();
        if (rememberedValue3 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
        }
        kotlin.jvm.functions.Function1 function12222 = (kotlin.jvm.functions.Function1) rememberedValue3;
        rememberedValue4 = startRestartGroup.rememberedValue();
        if (rememberedValue4 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
        }
        kotlin.jvm.functions.Function1 function13222 = (kotlin.jvm.functions.Function1) rememberedValue4;
        changedInstance = startRestartGroup.changedInstance(viewfinderExternalSurfaceState222);
        if ((57344 & i7222) != 16384) {
        }
        if (((i7222 & 896) ^ 384) <= 256) {
        }
        if ((i7222 & 112) != 32) {
        }
        if ((i7222 & 7168) == 2048) {
        }
        rememberedValue5 = startRestartGroup.rememberedValue();
        if (!(z9 | z8 | changedInstance | z7 | z10)) {
        }
        final boolean z12222 = z5;
        final boolean z13222 = z6;
        rememberedValue5 = new kotlin.jvm.functions.Function1() { // from class: androidx.camera.viewfinder.compose.internal.ViewfinderExternalSurfaceKt$$ExternalSyntheticLambda2
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return androidx.camera.viewfinder.compose.internal.ViewfinderExternalSurfaceKt.$r8$lambda$Tk_eFJImewlO3mkYacV2wxjv7EQ(androidx.camera.viewfinder.compose.internal.ViewfinderExternalSurfaceState.this, function1, j3, z12222, z13222, (androidx.camera.viewfinder.compose.internal.ViewfinderExternalSurfaceKt$ViewfinderExternalSurface$1$1$1) obj);
            }
        };
        startRestartGroup.updateRememberedValue(rememberedValue5);
        androidx.compose.ui.viewinterop.AndroidView_androidKt.AndroidView(function12222, companion, function13222, null, (kotlin.jvm.functions.Function1) rememberedValue5, startRestartGroup, ((i7222 << 3) & 112) | 390, 8);
        if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
        }
        z3 = z5;
        j4 = j3;
        z11 = z6;
        endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
        }
    }

    public static /* synthetic */ androidx.camera.viewfinder.compose.internal.ViewfinderExternalSurfaceKt$ViewfinderExternalSurface$1$1$1 $r8$lambda$4C2hpyQWrUumvNtzj7Ttq7qt5A0(android.content.Context context) {
        return new androidx.camera.viewfinder.compose.internal.ViewfinderExternalSurfaceKt$ViewfinderExternalSurface$1$1$1(context);
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$OxMHD89_L384yneZ2bGSWTHrVjs(androidx.compose.ui.Modifier modifier, boolean z, long j, boolean z2, kotlin.jvm.functions.Function1 function1, int i, int i2, androidx.compose.runtime.Composer composer, int i3) {
        m1048ViewfinderExternalSurfaceJQLjw8(modifier, z, j, z2, function1, composer, androidx.compose.runtime.RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$Tk_eFJImewlO3mkYacV2wxjv7EQ(androidx.camera.viewfinder.compose.internal.ViewfinderExternalSurfaceState viewfinderExternalSurfaceState, kotlin.jvm.functions.Function1 function1, long j, boolean z, boolean z2, androidx.camera.viewfinder.compose.internal.ViewfinderExternalSurfaceKt$ViewfinderExternalSurface$1$1$1 viewfinderExternalSurfaceKt$ViewfinderExternalSurface$1$1$1) {
        if (viewfinderExternalSurfaceKt$ViewfinderExternalSurface$1$1$1.getAttachedState() != viewfinderExternalSurfaceState) {
            viewfinderExternalSurfaceState.getHighSpeedVideoSizes = viewfinderExternalSurfaceKt$ViewfinderExternalSurface$1$1$1;
            viewfinderExternalSurfaceKt$ViewfinderExternalSurface$1$1$1.setAttachedState(viewfinderExternalSurfaceState);
            function1.invoke(viewfinderExternalSurfaceState);
        }
        if (!androidx.compose.ui.unit.IntSize.m8770equalsimpl0(j, androidx.compose.ui.unit.IntSize.INSTANCE.m8777getZeroYbymL2g())) {
            viewfinderExternalSurfaceKt$ViewfinderExternalSurface$1$1$1.getHolder().setFixedSize(androidx.compose.ui.unit.IntSize.m8772getWidthimpl(j), androidx.compose.ui.unit.IntSize.m8771getHeightimpl(j));
        } else {
            viewfinderExternalSurfaceKt$ViewfinderExternalSurface$1$1$1.getHolder().setSizeFromLayout();
        }
        viewfinderExternalSurfaceKt$ViewfinderExternalSurface$1$1$1.getHolder().setFormat(z ? -1 : -3);
        viewfinderExternalSurfaceKt$ViewfinderExternalSurface$1$1$1.setSecure(z2);
        return kotlin.Unit.INSTANCE;
    }

    /* renamed from: $r8$lambda$c_Jqibh8O16s-I4D-QNynI46Q3c, reason: not valid java name */
    public static /* synthetic */ kotlin.Unit m1047$r8$lambda$c_Jqibh8O16sI4DQNynI46Q3c(androidx.camera.viewfinder.compose.internal.ViewfinderExternalSurfaceKt$ViewfinderExternalSurface$1$1$1 viewfinderExternalSurfaceKt$ViewfinderExternalSurface$1$1$1) {
        androidx.camera.viewfinder.compose.internal.ViewfinderExternalSurfaceHolder viewfinderExternalSurfaceHolder;
        androidx.camera.viewfinder.compose.internal.ViewfinderExternalSurfaceState attachedState = viewfinderExternalSurfaceKt$ViewfinderExternalSurface$1$1$1.getAttachedState();
        if (attachedState != null && (viewfinderExternalSurfaceHolder = attachedState.getHighResolutionOutputSizeshNQ4ISI) != null) {
            viewfinderExternalSurfaceHolder.detach();
        }
        viewfinderExternalSurfaceKt$ViewfinderExternalSurface$1$1$1.setAttachedState(null);
        return kotlin.Unit.INSTANCE;
    }
}
