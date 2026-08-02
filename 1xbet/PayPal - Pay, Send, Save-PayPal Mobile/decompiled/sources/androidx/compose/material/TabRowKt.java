package androidx.compose.material;

@kotlin.Metadata(d1 = {"\u0000T\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0000\u001a\u009c\u0001\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\u000723\b\u0002\u0010\t\u001a-\u0012\u0019\u0012\u0017\u0012\u0004\u0012\u00020\f0\u000b¢\u0006\f\b\r\u0012\b\b\u000e\u0012\u0004\b\b(\u000f\u0012\u0004\u0012\u00020\u00010\n¢\u0006\u0002\b\u0010¢\u0006\u0002\b\u00112\u0018\b\u0002\u0010\u0012\u001a\u0012\u0012\u0004\u0012\u00020\u00010\u0013¢\u0006\u0002\b\u0010¢\u0006\u0002\b\u00112\u0016\u0010\u0014\u001a\u0012\u0012\u0004\u0012\u00020\u00010\u0013¢\u0006\u0002\b\u0010¢\u0006\u0002\b\u0011H\u0007¢\u0006\u0004\b\u0015\u0010\u0016\u001a¦\u0001\u0010\u0017\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\u00072\b\b\u0002\u0010\u0018\u001a\u00020\u001923\b\u0002\u0010\t\u001a-\u0012\u0019\u0012\u0017\u0012\u0004\u0012\u00020\f0\u000b¢\u0006\f\b\r\u0012\b\b\u000e\u0012\u0004\b\b(\u000f\u0012\u0004\u0012\u00020\u00010\n¢\u0006\u0002\b\u0010¢\u0006\u0002\b\u00112\u0018\b\u0002\u0010\u0012\u001a\u0012\u0012\u0004\u0012\u00020\u00010\u0013¢\u0006\u0002\b\u0010¢\u0006\u0002\b\u00112\u0016\u0010\u0014\u001a\u0012\u0012\u0004\u0012\u00020\u00010\u0013¢\u0006\u0002\b\u0010¢\u0006\u0002\b\u0011H\u0007¢\u0006\u0004\b\u001a\u0010\u001b\"\u0010\u0010\u001c\u001a\u00020\u0019X\u0082\u0004¢\u0006\u0004\n\u0002\u0010\u001d\"\u0014\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020 0\u001fX\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006!"}, d2 = {"TabRow", "", "selectedTabIndex", "", "modifier", "Landroidx/compose/ui/Modifier;", "backgroundColor", "Landroidx/compose/ui/graphics/Color;", "contentColor", "indicator", "Lkotlin/Function1;", "", "Landroidx/compose/material/TabPosition;", "Lkotlin/ParameterName;", "name", "tabPositions", "Landroidx/compose/runtime/Composable;", "Landroidx/compose/ui/UiComposable;", "divider", "Lkotlin/Function0;", "tabs", "TabRow-pAZo6Ak", "(ILandroidx/compose/ui/Modifier;JJLkotlin/jvm/functions/Function3;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;Landroidx/compose/runtime/Composer;II)V", "ScrollableTabRow", "edgePadding", "Landroidx/compose/ui/unit/Dp;", "ScrollableTabRow-sKfQg0A", "(ILandroidx/compose/ui/Modifier;JJFLkotlin/jvm/functions/Function3;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;Landroidx/compose/runtime/Composer;II)V", "ScrollableTabRowMinimumTabWidth", com.adobe.marketing.mobile.internal.CoreConstants.Wrapper.Type.FLUTTER, "ScrollableTabRowScrollSpec", "Landroidx/compose/animation/core/AnimationSpec;", "", "material"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class TabRowKt {
    private static final float getHighSpeedVideoSizes = androidx.compose.ui.unit.Dp.m8601constructorimpl(90.0f);
    private static final androidx.compose.animation.core.AnimationSpec<java.lang.Float> getHighResolutionOutputSizeshNQ4ISI = androidx.compose.animation.core.AnimationSpecKt.tween$default(250, 0, androidx.compose.animation.core.EasingKt.getFastOutSlowInEasing(), 2, null);

    /* JADX WARN: Removed duplicated region for block: B:104:0x006d  */
    /* JADX WARN: Removed duplicated region for block: B:107:0x0054  */
    /* JADX WARN: Removed duplicated region for block: B:13:0x003f  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x005a  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0073  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0091  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00ae  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x00c6  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x00d1  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x0150  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x0190  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x01a7  */
    /* JADX WARN: Removed duplicated region for block: B:71:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:87:0x0199  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x00c8  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x0093  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x0076  */
    /* renamed from: TabRow-pAZo6Ak, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void m2801TabRowpAZo6Ak(final int i, androidx.compose.ui.Modifier modifier, long j, long j2, kotlin.jvm.functions.Function3<? super java.util.List<androidx.compose.material.TabPosition>, ? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.Unit> function3, kotlin.jvm.functions.Function2<? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.Unit> function2, final kotlin.jvm.functions.Function2<? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.Unit> function22, androidx.compose.runtime.Composer composer, final int i2, final int i3) {
        int i4;
        long j3;
        int i5;
        kotlin.jvm.functions.Function3<? super java.util.List<androidx.compose.material.TabPosition>, ? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.Unit> function32;
        int i6;
        kotlin.jvm.functions.Function2<? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.Unit> function23;
        androidx.compose.ui.Modifier modifier2;
        long j4;
        long j5;
        androidx.compose.runtime.ScopeUpdateScope endRestartGroup;
        androidx.compose.ui.Modifier.Companion companion;
        int i7;
        long j6;
        androidx.compose.runtime.internal.ComposableLambda rememberComposableLambda;
        final kotlin.jvm.functions.Function2<? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.Unit> m2595getLambda$1216856915$material;
        int i8;
        androidx.compose.runtime.Composer startRestartGroup = composer.startRestartGroup(113221600);
        if ((i2 & 6) == 0) {
            i4 = (startRestartGroup.changed(i) ? 4 : 2) | i2;
        } else {
            i4 = i2;
        }
        int i9 = i3 & 2;
        if (i9 != 0) {
            i4 |= 48;
        } else if ((i2 & 48) == 0) {
            i4 |= startRestartGroup.changed(modifier) ? 32 : 16;
            if ((i2 & 384) == 0) {
                if ((i3 & 4) == 0 && startRestartGroup.changed(j)) {
                    i8 = 256;
                    i4 |= i8;
                }
                i8 = 128;
                i4 |= i8;
            }
            if ((i2 & 3072) != 0) {
                j3 = j2;
                i4 |= ((i3 & 8) == 0 && startRestartGroup.changed(j3)) ? 2048 : 1024;
            } else {
                j3 = j2;
            }
            i5 = i3 & 16;
            if (i5 == 0) {
                i4 |= 24576;
            } else if ((i2 & 24576) == 0) {
                function32 = function3;
                i4 |= startRestartGroup.changedInstance(function32) ? 16384 : 8192;
                i6 = i3 & 32;
                if (i6 != 0) {
                    i4 |= androidx.profileinstaller.ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE;
                } else if ((196608 & i2) == 0) {
                    function23 = function2;
                    i4 |= startRestartGroup.changedInstance(function23) ? 131072 : 65536;
                    if ((i2 & 1572864) == 0) {
                        i4 |= startRestartGroup.changedInstance(function22) ? 1048576 : 524288;
                    }
                    if (!startRestartGroup.shouldExecute((i4 & 599187) == 599186, i4 & 1)) {
                        startRestartGroup.startDefaults();
                        if ((i2 & 1) != 0 && !startRestartGroup.getDefaultsInvalid()) {
                            startRestartGroup.skipToGroupEnd();
                            if ((i3 & 4) != 0) {
                                i4 &= -897;
                            }
                            if ((i3 & 8) != 0) {
                                i4 &= -7169;
                            }
                            companion = modifier;
                            i7 = i4;
                            rememberComposableLambda = function32;
                            j6 = j;
                        } else {
                            companion = i9 != 0 ? androidx.compose.ui.Modifier.INSTANCE : modifier;
                            if ((i3 & 4) != 0) {
                                i7 = i4 & (-897);
                                j6 = androidx.compose.material.ColorsKt.getPrimarySurface(androidx.compose.material.MaterialTheme.INSTANCE.getColors(startRestartGroup, 6));
                            } else {
                                i7 = i4;
                                j6 = j;
                            }
                            if ((i3 & 8) != 0) {
                                j3 = androidx.compose.material.ColorsKt.m2580contentColorForek8zF_U(j6, startRestartGroup, (i7 >> 6) & 14);
                                i7 &= -7169;
                            }
                            rememberComposableLambda = i5 != 0 ? androidx.compose.runtime.internal.ComposableLambdaKt.rememberComposableLambda(1896966245, true, new kotlin.jvm.functions.Function3() { // from class: androidx.compose.material.TabRowKt$$ExternalSyntheticLambda10
                                @Override // kotlin.jvm.functions.Function3
                                public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2, java.lang.Object obj3) {
                                    return androidx.compose.material.TabRowKt.$r8$lambda$192yJeakcI9VI_xMCc0xB1YyKLY(i, (java.util.List) obj, (androidx.compose.runtime.Composer) obj2, ((java.lang.Integer) obj3).intValue());
                                }
                            }, startRestartGroup, 54) : function32;
                            if (i6 != 0) {
                                m2595getLambda$1216856915$material = androidx.compose.material.ComposableSingletons$TabRowKt.INSTANCE.m2595getLambda$1216856915$material();
                                final kotlin.jvm.functions.Function3<? super java.util.List<androidx.compose.material.TabPosition>, ? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.Unit> function33 = rememberComposableLambda;
                                long j7 = j3;
                                int i10 = i7;
                                j5 = j7;
                                startRestartGroup.endDefaults();
                                if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                                    androidx.compose.runtime.ComposerKt.traceEventStart(113221600, i10, -1, "androidx.compose.material.TabRow (TabRow.kt:145)");
                                }
                                androidx.compose.ui.Modifier modifier3 = companion;
                                kotlin.jvm.functions.Function2<? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.Unit> function24 = m2595getLambda$1216856915$material;
                                androidx.compose.material.SurfaceKt.m2766SurfaceFjzlyU(androidx.compose.foundation.selection.SelectableGroupKt.selectableGroup(companion), null, j6, j5, null, 0.0f, androidx.compose.runtime.internal.ComposableLambdaKt.rememberComposableLambda(-638448612, true, new kotlin.jvm.functions.Function2() { // from class: androidx.compose.material.TabRowKt$$ExternalSyntheticLambda11
                                    @Override // kotlin.jvm.functions.Function2
                                    public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                                        return androidx.compose.material.TabRowKt.$r8$lambda$KQJsO3ll3VNedJZtpBrUY2XvYt0(kotlin.jvm.functions.Function2.this, m2595getLambda$1216856915$material, function33, (androidx.compose.runtime.Composer) obj, ((java.lang.Integer) obj2).intValue());
                                    }
                                }, startRestartGroup, 54), startRestartGroup, (i10 & 896) | 1572864 | (i10 & 7168), 50);
                                if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                                    androidx.compose.runtime.ComposerKt.traceEventEnd();
                                }
                                function23 = function24;
                                function32 = function33;
                                j4 = j6;
                                modifier2 = modifier3;
                            }
                        }
                        m2595getLambda$1216856915$material = function23;
                        final kotlin.jvm.functions.Function3 function332 = rememberComposableLambda;
                        long j72 = j3;
                        int i102 = i7;
                        j5 = j72;
                        startRestartGroup.endDefaults();
                        if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                        }
                        androidx.compose.ui.Modifier modifier32 = companion;
                        kotlin.jvm.functions.Function2<? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.Unit> function242 = m2595getLambda$1216856915$material;
                        androidx.compose.material.SurfaceKt.m2766SurfaceFjzlyU(androidx.compose.foundation.selection.SelectableGroupKt.selectableGroup(companion), null, j6, j5, null, 0.0f, androidx.compose.runtime.internal.ComposableLambdaKt.rememberComposableLambda(-638448612, true, new kotlin.jvm.functions.Function2() { // from class: androidx.compose.material.TabRowKt$$ExternalSyntheticLambda11
                            @Override // kotlin.jvm.functions.Function2
                            public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                                return androidx.compose.material.TabRowKt.$r8$lambda$KQJsO3ll3VNedJZtpBrUY2XvYt0(kotlin.jvm.functions.Function2.this, m2595getLambda$1216856915$material, function332, (androidx.compose.runtime.Composer) obj, ((java.lang.Integer) obj2).intValue());
                            }
                        }, startRestartGroup, 54), startRestartGroup, (i102 & 896) | 1572864 | (i102 & 7168), 50);
                        if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                        }
                        function23 = function242;
                        function32 = function332;
                        j4 = j6;
                        modifier2 = modifier32;
                    } else {
                        startRestartGroup.skipToGroupEnd();
                        modifier2 = modifier;
                        j4 = j;
                        j5 = j3;
                    }
                    endRestartGroup = startRestartGroup.endRestartGroup();
                    if (endRestartGroup == null) {
                        final androidx.compose.ui.Modifier modifier4 = modifier2;
                        final long j8 = j4;
                        final long j9 = j5;
                        final kotlin.jvm.functions.Function3<? super java.util.List<androidx.compose.material.TabPosition>, ? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.Unit> function34 = function32;
                        final kotlin.jvm.functions.Function2<? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.Unit> function25 = function23;
                        endRestartGroup.updateScope(new kotlin.jvm.functions.Function2() { // from class: androidx.compose.material.TabRowKt$$ExternalSyntheticLambda1
                            @Override // kotlin.jvm.functions.Function2
                            public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                                return androidx.compose.material.TabRowKt.m2796$r8$lambda$Lkt3VhlFIWAmlcTXeMgYrFBMYI(i, modifier4, j8, j9, function34, function25, function22, i2, i3, (androidx.compose.runtime.Composer) obj, ((java.lang.Integer) obj2).intValue());
                            }
                        });
                        return;
                    }
                    return;
                }
                function23 = function2;
                if ((i2 & 1572864) == 0) {
                }
                if (!startRestartGroup.shouldExecute((i4 & 599187) == 599186, i4 & 1)) {
                }
                endRestartGroup = startRestartGroup.endRestartGroup();
                if (endRestartGroup == null) {
                }
            }
            function32 = function3;
            i6 = i3 & 32;
            if (i6 != 0) {
            }
            function23 = function2;
            if ((i2 & 1572864) == 0) {
            }
            if (!startRestartGroup.shouldExecute((i4 & 599187) == 599186, i4 & 1)) {
            }
            endRestartGroup = startRestartGroup.endRestartGroup();
            if (endRestartGroup == null) {
            }
        }
        if ((i2 & 384) == 0) {
        }
        if ((i2 & 3072) != 0) {
        }
        i5 = i3 & 16;
        if (i5 == 0) {
        }
        function32 = function3;
        i6 = i3 & 32;
        if (i6 != 0) {
        }
        function23 = function2;
        if ((i2 & 1572864) == 0) {
        }
        if (!startRestartGroup.shouldExecute((i4 & 599187) == 599186, i4 & 1)) {
        }
        endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup == null) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:103:0x0093  */
    /* JADX WARN: Removed duplicated region for block: B:110:0x0076  */
    /* JADX WARN: Removed duplicated region for block: B:119:0x006d  */
    /* JADX WARN: Removed duplicated region for block: B:122:0x0052  */
    /* JADX WARN: Removed duplicated region for block: B:13:0x003d  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0058  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0073  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0091  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00ad  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x00cd  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x00e3  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x00ee  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x01df  */
    /* JADX WARN: Removed duplicated region for block: B:73:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:94:0x01ce  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x00e5  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x00b2  */
    /* renamed from: ScrollableTabRow-sKfQg0A, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void m2800ScrollableTabRowsKfQg0A(final int i, androidx.compose.ui.Modifier modifier, long j, long j2, float f, kotlin.jvm.functions.Function3<? super java.util.List<androidx.compose.material.TabPosition>, ? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.Unit> function3, kotlin.jvm.functions.Function2<? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.Unit> function2, final kotlin.jvm.functions.Function2<? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.Unit> function22, androidx.compose.runtime.Composer composer, final int i2, final int i3) {
        int i4;
        long j3;
        int i5;
        float f2;
        int i6;
        kotlin.jvm.functions.Function3<? super java.util.List<androidx.compose.material.TabPosition>, ? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.Unit> function32;
        int i7;
        androidx.compose.ui.Modifier modifier2;
        kotlin.jvm.functions.Function2<? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.Unit> function23;
        float f3;
        final kotlin.jvm.functions.Function3<? super java.util.List<androidx.compose.material.TabPosition>, ? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.Unit> function33;
        long j4;
        androidx.compose.runtime.ScopeUpdateScope endRestartGroup;
        androidx.compose.ui.Modifier.Companion companion;
        long j5;
        int i8;
        kotlin.jvm.functions.Function3<? super java.util.List<androidx.compose.material.TabPosition>, ? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.Unit> function34;
        long j6;
        int i9;
        int i10;
        androidx.compose.runtime.Composer startRestartGroup = composer.startRestartGroup(-1291546575);
        if ((i2 & 6) == 0) {
            i4 = (startRestartGroup.changed(i) ? 4 : 2) | i2;
        } else {
            i4 = i2;
        }
        int i11 = i3 & 2;
        if (i11 != 0) {
            i4 |= 48;
        } else if ((i2 & 48) == 0) {
            i4 |= startRestartGroup.changed(modifier) ? 32 : 16;
            if ((i2 & 384) != 0) {
                if ((i3 & 4) == 0) {
                    j3 = j;
                    if (startRestartGroup.changed(j3)) {
                        i10 = 256;
                        i4 |= i10;
                    }
                } else {
                    j3 = j;
                }
                i10 = 128;
                i4 |= i10;
            } else {
                j3 = j;
            }
            if ((i2 & 3072) == 0) {
                if ((i3 & 8) == 0 && startRestartGroup.changed(j2)) {
                    i9 = 2048;
                    i4 |= i9;
                }
                i9 = 1024;
                i4 |= i9;
            }
            i5 = i3 & 16;
            if (i5 == 0) {
                i4 |= 24576;
            } else if ((i2 & 24576) == 0) {
                f2 = f;
                i4 |= startRestartGroup.changed(f2) ? 16384 : 8192;
                i6 = i3 & 32;
                if (i6 != 0) {
                    i4 |= androidx.profileinstaller.ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE;
                } else if ((196608 & i2) == 0) {
                    function32 = function3;
                    i4 |= startRestartGroup.changedInstance(function32) ? 131072 : 65536;
                    i7 = i3 & 64;
                    if (i7 == 0) {
                        i4 |= 1572864;
                    } else if ((i2 & 1572864) == 0) {
                        i4 |= startRestartGroup.changedInstance(function2) ? 1048576 : 524288;
                    }
                    if ((i2 & 12582912) == 0) {
                        i4 |= startRestartGroup.changedInstance(function22) ? 8388608 : 4194304;
                    }
                    if (!startRestartGroup.shouldExecute((4793491 & i4) == 4793490, i4 & 1)) {
                        startRestartGroup.startDefaults();
                        if ((i2 & 1) != 0 && !startRestartGroup.getDefaultsInvalid()) {
                            startRestartGroup.skipToGroupEnd();
                            if ((i3 & 4) != 0) {
                                i4 &= -897;
                            }
                            if ((i3 & 8) != 0) {
                                i4 &= -7169;
                            }
                            companion = modifier;
                            function23 = function2;
                            f3 = f2;
                            function34 = function32;
                            i8 = i4;
                            j6 = j2;
                        } else {
                            companion = i11 != 0 ? androidx.compose.ui.Modifier.INSTANCE : modifier;
                            if ((i3 & 4) != 0) {
                                j3 = androidx.compose.material.ColorsKt.getPrimarySurface(androidx.compose.material.MaterialTheme.INSTANCE.getColors(startRestartGroup, 6));
                                i4 &= -897;
                            }
                            if ((i3 & 8) != 0) {
                                j5 = androidx.compose.material.ColorsKt.m2580contentColorForek8zF_U(j3, startRestartGroup, (i4 >> 6) & 14);
                                i4 &= -7169;
                            } else {
                                j5 = j2;
                            }
                            float m2795getScrollableTabRowPaddingD9Ej5fM = i5 != 0 ? androidx.compose.material.TabRowDefaults.INSTANCE.m2795getScrollableTabRowPaddingD9Ej5fM() : f2;
                            androidx.compose.runtime.internal.ComposableLambda rememberComposableLambda = i6 != 0 ? androidx.compose.runtime.internal.ComposableLambdaKt.rememberComposableLambda(-233732148, true, new kotlin.jvm.functions.Function3() { // from class: androidx.compose.material.TabRowKt$$ExternalSyntheticLambda0
                                @Override // kotlin.jvm.functions.Function3
                                public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2, java.lang.Object obj3) {
                                    return androidx.compose.material.TabRowKt.$r8$lambda$kQFktKI1GzULYWCR98UJfP_XjbA(i, (java.util.List) obj, (androidx.compose.runtime.Composer) obj2, ((java.lang.Integer) obj3).intValue());
                                }
                            }, startRestartGroup, 54) : function32;
                            if (i7 != 0) {
                                function34 = rememberComposableLambda;
                                function23 = androidx.compose.material.ComposableSingletons$TabRowKt.INSTANCE.m2596getLambda$222041980$material();
                                i8 = i4;
                            } else {
                                function23 = function2;
                                i8 = i4;
                                function34 = rememberComposableLambda;
                            }
                            f3 = m2795getScrollableTabRowPaddingD9Ej5fM;
                            j6 = j5;
                        }
                        startRestartGroup.endDefaults();
                        if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                            androidx.compose.runtime.ComposerKt.traceEventStart(-1291546575, i8, -1, "androidx.compose.material.ScrollableTabRow (TabRow.kt:236)");
                        }
                        final float f4 = f3;
                        final kotlin.jvm.functions.Function2<? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.Unit> function24 = function23;
                        final kotlin.jvm.functions.Function3<? super java.util.List<androidx.compose.material.TabPosition>, ? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.Unit> function35 = function34;
                        androidx.compose.material.SurfaceKt.m2766SurfaceFjzlyU(companion, null, j3, j6, null, 0.0f, androidx.compose.runtime.internal.ComposableLambdaKt.rememberComposableLambda(-1575164555, true, new kotlin.jvm.functions.Function2() { // from class: androidx.compose.material.TabRowKt$$ExternalSyntheticLambda3
                            @Override // kotlin.jvm.functions.Function2
                            public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                                return androidx.compose.material.TabRowKt.$r8$lambda$QLWbrmRymMS4E1SjedWGXEQOICY(f4, function22, function24, function35, i, (androidx.compose.runtime.Composer) obj, ((java.lang.Integer) obj2).intValue());
                            }
                        }, startRestartGroup, 54), startRestartGroup, ((i8 >> 3) & 14) | 1572864 | (i8 & 896) | (i8 & 7168), 50);
                        if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                            androidx.compose.runtime.ComposerKt.traceEventEnd();
                        }
                        j4 = j6;
                        function33 = function34;
                        modifier2 = companion;
                    } else {
                        startRestartGroup.skipToGroupEnd();
                        modifier2 = modifier;
                        function23 = function2;
                        f3 = f2;
                        function33 = function32;
                        j4 = j2;
                    }
                    endRestartGroup = startRestartGroup.endRestartGroup();
                    if (endRestartGroup == null) {
                        final androidx.compose.ui.Modifier modifier3 = modifier2;
                        final long j7 = j3;
                        final long j8 = j4;
                        final float f5 = f3;
                        final kotlin.jvm.functions.Function2<? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.Unit> function25 = function23;
                        endRestartGroup.updateScope(new kotlin.jvm.functions.Function2() { // from class: androidx.compose.material.TabRowKt$$ExternalSyntheticLambda4
                            @Override // kotlin.jvm.functions.Function2
                            public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                                return androidx.compose.material.TabRowKt.$r8$lambda$M55PVWG9akFwVQfEZkBwCC3yTFY(i, modifier3, j7, j8, f5, function33, function25, function22, i2, i3, (androidx.compose.runtime.Composer) obj, ((java.lang.Integer) obj2).intValue());
                            }
                        });
                        return;
                    }
                    return;
                }
                function32 = function3;
                i7 = i3 & 64;
                if (i7 == 0) {
                }
                if ((i2 & 12582912) == 0) {
                }
                if (!startRestartGroup.shouldExecute((4793491 & i4) == 4793490, i4 & 1)) {
                }
                endRestartGroup = startRestartGroup.endRestartGroup();
                if (endRestartGroup == null) {
                }
            }
            f2 = f;
            i6 = i3 & 32;
            if (i6 != 0) {
            }
            function32 = function3;
            i7 = i3 & 64;
            if (i7 == 0) {
            }
            if ((i2 & 12582912) == 0) {
            }
            if (!startRestartGroup.shouldExecute((4793491 & i4) == 4793490, i4 & 1)) {
            }
            endRestartGroup = startRestartGroup.endRestartGroup();
            if (endRestartGroup == null) {
            }
        }
        if ((i2 & 384) != 0) {
        }
        if ((i2 & 3072) == 0) {
        }
        i5 = i3 & 16;
        if (i5 == 0) {
        }
        f2 = f;
        i6 = i3 & 32;
        if (i6 != 0) {
        }
        function32 = function3;
        i7 = i3 & 64;
        if (i7 == 0) {
        }
        if ((i2 & 12582912) == 0) {
        }
        if (!startRestartGroup.shouldExecute((4793491 & i4) == 4793490, i4 & 1)) {
        }
        endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup == null) {
        }
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$192yJeakcI9VI_xMCc0xB1YyKLY(int i, java.util.List list, androidx.compose.runtime.Composer composer, int i2) {
        if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
            androidx.compose.runtime.ComposerKt.traceEventStart(1896966245, i2, -1, "androidx.compose.material.TabRow.<anonymous> (TabRow.kt:141)");
        }
        androidx.compose.material.TabRowDefaults tabRowDefaults = androidx.compose.material.TabRowDefaults.INSTANCE;
        tabRowDefaults.m2792Indicator9IZ8Weo(tabRowDefaults.tabIndicatorOffset(androidx.compose.ui.Modifier.INSTANCE, (androidx.compose.material.TabPosition) list.get(i)), 0.0f, 0L, composer, 3072, 6);
        if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
            androidx.compose.runtime.ComposerKt.traceEventEnd();
        }
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ androidx.compose.ui.layout.MeasureResult $r8$lambda$HxSTrGyG05nPkXOoE50Ar5fNbmQ(float f, kotlin.jvm.functions.Function2 function2, final kotlin.jvm.functions.Function2 function22, final androidx.compose.material.ScrollableTabData scrollableTabData, final int i, final kotlin.jvm.functions.Function3 function3, final androidx.compose.ui.layout.SubcomposeMeasureScope subcomposeMeasureScope, final androidx.compose.ui.unit.Constraints constraints) {
        int i2 = subcomposeMeasureScope.mo1412roundToPx0680j_4(getHighSpeedVideoSizes);
        final int i3 = subcomposeMeasureScope.mo1412roundToPx0680j_4(f);
        long m8545copyZbe2FdA$default = androidx.compose.ui.unit.Constraints.m8545copyZbe2FdA$default(constraints.getGetHighSpeedVideoFpsRangesFor(), i2, 0, 0, 0, 14, null);
        java.util.List<androidx.compose.ui.layout.Measurable> subcompose = subcomposeMeasureScope.subcompose(androidx.compose.material.TabSlots.getHighSpeedVideoSizes, function2);
        java.util.ArrayList arrayList = new java.util.ArrayList(subcompose.size());
        int size = subcompose.size();
        for (int i4 = 0; i4 < size; i4++) {
            arrayList.add(subcompose.get(i4).mo7353measureBRTryo0(m8545copyZbe2FdA$default));
        }
        final java.util.ArrayList arrayList2 = arrayList;
        final kotlin.jvm.internal.Ref.IntRef intRef = new kotlin.jvm.internal.Ref.IntRef();
        intRef.element = i3 * 2;
        final kotlin.jvm.internal.Ref.IntRef intRef2 = new kotlin.jvm.internal.Ref.IntRef();
        int size2 = arrayList2.size();
        for (int i5 = 0; i5 < size2; i5++) {
            androidx.compose.ui.layout.Placeable placeable = (androidx.compose.ui.layout.Placeable) arrayList2.get(i5);
            intRef.element += placeable.getWidth();
            intRef2.element = java.lang.Math.max(intRef2.element, placeable.getHeight());
        }
        return androidx.compose.ui.layout.MeasureScope.layout$default(subcomposeMeasureScope, intRef.element, intRef2.element, null, new kotlin.jvm.functions.Function1() { // from class: androidx.compose.material.TabRowKt$$ExternalSyntheticLambda9
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return androidx.compose.material.TabRowKt.m2799$r8$lambda$hJqhv4cXOnYOG0LNCctISbNxZk(i3, arrayList2, subcomposeMeasureScope, function22, scrollableTabData, i, constraints, intRef, intRef2, function3, (androidx.compose.ui.layout.Placeable.PlacementScope) obj);
            }
        }, 4, null);
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$KQJsO3ll3VNedJZtpBrUY2XvYt0(final kotlin.jvm.functions.Function2 function2, final kotlin.jvm.functions.Function2 function22, final kotlin.jvm.functions.Function3 function3, androidx.compose.runtime.Composer composer, int i) {
        if (composer.shouldExecute((i & 3) != 2, i & 1)) {
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventStart(-638448612, i, -1, "androidx.compose.material.TabRow.<anonymous> (TabRow.kt:151)");
            }
            androidx.compose.ui.Modifier fillMaxWidth$default = androidx.compose.foundation.layout.SizeKt.fillMaxWidth$default(androidx.compose.ui.Modifier.INSTANCE, 0.0f, 1, null);
            boolean changed = composer.changed(function2);
            boolean changed2 = composer.changed(function22);
            boolean changed3 = composer.changed(function3);
            java.lang.Object rememberedValue = composer.rememberedValue();
            if ((changed | changed2 | changed3) || rememberedValue == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                rememberedValue = new kotlin.jvm.functions.Function2() { // from class: androidx.compose.material.TabRowKt$$ExternalSyntheticLambda5
                    @Override // kotlin.jvm.functions.Function2
                    public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                        return androidx.compose.material.TabRowKt.$r8$lambda$st9bVtxd3K4i7u5unrBNeXGwtjU(kotlin.jvm.functions.Function2.this, function22, function3, (androidx.compose.ui.layout.SubcomposeMeasureScope) obj, (androidx.compose.ui.unit.Constraints) obj2);
                    }
                };
                composer.updateRememberedValue(rememberedValue);
            }
            androidx.compose.ui.layout.SubcomposeLayoutKt.SubcomposeLayout(fillMaxWidth$default, (kotlin.jvm.functions.Function2) rememberedValue, composer, 6, 0);
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventEnd();
            }
        } else {
            composer.skipToGroupEnd();
        }
        return kotlin.Unit.INSTANCE;
    }

    /* renamed from: $r8$lambda$Lkt-3VhlFIWAmlcTXeMgYrFBMYI, reason: not valid java name */
    public static /* synthetic */ kotlin.Unit m2796$r8$lambda$Lkt3VhlFIWAmlcTXeMgYrFBMYI(int i, androidx.compose.ui.Modifier modifier, long j, long j2, kotlin.jvm.functions.Function3 function3, kotlin.jvm.functions.Function2 function2, kotlin.jvm.functions.Function2 function22, int i2, int i3, androidx.compose.runtime.Composer composer, int i4) {
        m2801TabRowpAZo6Ak(i, modifier, j, j2, function3, function2, function22, composer, androidx.compose.runtime.RecomposeScopeImplKt.updateChangedFlags(i2 | 1), i3);
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$M55PVWG9akFwVQfEZkBwCC3yTFY(int i, androidx.compose.ui.Modifier modifier, long j, long j2, float f, kotlin.jvm.functions.Function3 function3, kotlin.jvm.functions.Function2 function2, kotlin.jvm.functions.Function2 function22, int i2, int i3, androidx.compose.runtime.Composer composer, int i4) {
        m2800ScrollableTabRowsKfQg0A(i, modifier, j, j2, f, function3, function2, function22, composer, androidx.compose.runtime.RecomposeScopeImplKt.updateChangedFlags(i2 | 1), i3);
        return kotlin.Unit.INSTANCE;
    }

    /* renamed from: $r8$lambda$NFQEnq91FZj5ryNM0tvYh-IqChY, reason: not valid java name */
    public static /* synthetic */ kotlin.Unit m2797$r8$lambda$NFQEnq91FZj5ryNM0tvYhIqChY(java.util.List list, androidx.compose.ui.layout.SubcomposeMeasureScope subcomposeMeasureScope, kotlin.jvm.functions.Function2 function2, int i, androidx.compose.ui.unit.Constraints constraints, int i2, final kotlin.jvm.functions.Function3 function3, final java.util.List list2, int i3, androidx.compose.ui.layout.Placeable.PlacementScope placementScope) {
        int size = list.size();
        for (int i4 = 0; i4 < size; i4++) {
            androidx.compose.ui.layout.Placeable.PlacementScope.placeRelative$default(placementScope, (androidx.compose.ui.layout.Placeable) list.get(i4), i4 * i, 0, 0.0f, 4, null);
        }
        java.util.List<androidx.compose.ui.layout.Measurable> subcompose = subcomposeMeasureScope.subcompose(androidx.compose.material.TabSlots.getHighResolutionOutputSizeshNQ4ISI, function2);
        int size2 = subcompose.size();
        for (int i5 = 0; i5 < size2; i5++) {
            androidx.compose.ui.layout.Placeable mo7353measureBRTryo0 = subcompose.get(i5).mo7353measureBRTryo0(androidx.compose.ui.unit.Constraints.m8545copyZbe2FdA$default(constraints.getGetHighSpeedVideoFpsRangesFor(), 0, 0, 0, 0, 11, null));
            androidx.compose.ui.layout.Placeable.PlacementScope.placeRelative$default(placementScope, mo7353measureBRTryo0, 0, i2 - mo7353measureBRTryo0.getHeight(), 0.0f, 4, null);
        }
        java.util.List<androidx.compose.ui.layout.Measurable> subcompose2 = subcomposeMeasureScope.subcompose(androidx.compose.material.TabSlots.Camera2StreamConfigurationMap, androidx.compose.runtime.internal.ComposableLambdaKt.composableLambdaInstance(-220665376, true, new kotlin.jvm.functions.Function2() { // from class: androidx.compose.material.TabRowKt$$ExternalSyntheticLambda7
            @Override // kotlin.jvm.functions.Function2
            public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                return androidx.compose.material.TabRowKt.m2798$r8$lambda$hvUpuDrlsRt0A_YlBzL58VIwlA(kotlin.jvm.functions.Function3.this, list2, (androidx.compose.runtime.Composer) obj, ((java.lang.Integer) obj2).intValue());
            }
        }));
        int size3 = subcompose2.size();
        for (int i6 = 0; i6 < size3; i6++) {
            androidx.compose.ui.layout.Placeable.PlacementScope.placeRelative$default(placementScope, subcompose2.get(i6).mo7353measureBRTryo0(androidx.compose.ui.unit.Constraints.INSTANCE.m8564fixedJhjzzOo(i3, i2)), 0, 0, 0.0f, 4, null);
        }
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$QLWbrmRymMS4E1SjedWGXEQOICY(final float f, final kotlin.jvm.functions.Function2 function2, final kotlin.jvm.functions.Function2 function22, final kotlin.jvm.functions.Function3 function3, final int i, androidx.compose.runtime.Composer composer, int i2) {
        if (composer.shouldExecute((i2 & 3) != 2, i2 & 1)) {
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventStart(-1575164555, i2, -1, "androidx.compose.material.ScrollableTabRow.<anonymous> (TabRow.kt:238)");
            }
            androidx.compose.foundation.ScrollState rememberScrollState = androidx.compose.foundation.ScrollKt.rememberScrollState(0, composer, 0, 1);
            java.lang.Object rememberedValue = composer.rememberedValue();
            if (rememberedValue == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                rememberedValue = androidx.compose.runtime.EffectsKt.createCompositionCoroutineScope(kotlin.coroutines.EmptyCoroutineContext.INSTANCE, composer);
                composer.updateRememberedValue(rememberedValue);
            }
            kotlinx.coroutines.CoroutineScope coroutineScope = (kotlinx.coroutines.CoroutineScope) rememberedValue;
            boolean changed = composer.changed(rememberScrollState);
            boolean changed2 = composer.changed(coroutineScope);
            java.lang.Object rememberedValue2 = composer.rememberedValue();
            if ((changed | changed2) || rememberedValue2 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                rememberedValue2 = new androidx.compose.material.ScrollableTabData(rememberScrollState, coroutineScope);
                composer.updateRememberedValue(rememberedValue2);
            }
            final androidx.compose.material.ScrollableTabData scrollableTabData = (androidx.compose.material.ScrollableTabData) rememberedValue2;
            androidx.compose.ui.Modifier clipToBounds = androidx.compose.ui.draw.ClipKt.clipToBounds(androidx.compose.foundation.selection.SelectableGroupKt.selectableGroup(androidx.compose.foundation.ScrollKt.horizontalScroll$default(androidx.compose.foundation.layout.SizeKt.wrapContentSize$default(androidx.compose.foundation.layout.SizeKt.fillMaxWidth$default(androidx.compose.ui.Modifier.INSTANCE, 0.0f, 1, null), androidx.compose.ui.Alignment.INSTANCE.getCenterStart(), false, 2, null), rememberScrollState, false, null, false, 14, null)));
            boolean changed3 = composer.changed(f);
            boolean changed4 = composer.changed(function2);
            boolean changed5 = composer.changed(function22);
            boolean changed6 = composer.changed(function3);
            boolean changedInstance = composer.changedInstance(scrollableTabData);
            boolean changed7 = composer.changed(i);
            java.lang.Object rememberedValue3 = composer.rememberedValue();
            if ((changed3 | changed4 | changed5 | changed6 | changedInstance | changed7) || rememberedValue3 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                java.lang.Object obj = new kotlin.jvm.functions.Function2() { // from class: androidx.compose.material.TabRowKt$$ExternalSyntheticLambda8
                    @Override // kotlin.jvm.functions.Function2
                    public final java.lang.Object invoke(java.lang.Object obj2, java.lang.Object obj3) {
                        return androidx.compose.material.TabRowKt.$r8$lambda$HxSTrGyG05nPkXOoE50Ar5fNbmQ(f, function2, function22, scrollableTabData, i, function3, (androidx.compose.ui.layout.SubcomposeMeasureScope) obj2, (androidx.compose.ui.unit.Constraints) obj3);
                    }
                };
                composer.updateRememberedValue(obj);
                rememberedValue3 = obj;
            }
            androidx.compose.ui.layout.SubcomposeLayoutKt.SubcomposeLayout(clipToBounds, (kotlin.jvm.functions.Function2) rememberedValue3, composer, 0, 0);
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventEnd();
            }
        } else {
            composer.skipToGroupEnd();
        }
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$e3jNItqLMqKiSo2muf8Q80IDtCs(kotlin.jvm.functions.Function3 function3, java.util.List list, androidx.compose.runtime.Composer composer, int i) {
        if (composer.shouldExecute((i & 3) != 2, i & 1)) {
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventStart(-43203918, i, -1, "androidx.compose.material.ScrollableTabRow.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous> (TabRow.kt:292)");
            }
            function3.invoke(list, composer, 0);
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventEnd();
            }
        } else {
            composer.skipToGroupEnd();
        }
        return kotlin.Unit.INSTANCE;
    }

    /* renamed from: $r8$lambda$h-vUpuDrlsRt0A_YlBzL58VIwlA, reason: not valid java name */
    public static /* synthetic */ kotlin.Unit m2798$r8$lambda$hvUpuDrlsRt0A_YlBzL58VIwlA(kotlin.jvm.functions.Function3 function3, java.util.List list, androidx.compose.runtime.Composer composer, int i) {
        if (composer.shouldExecute((i & 3) != 2, i & 1)) {
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventStart(-220665376, i, -1, "androidx.compose.material.TabRow.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous> (TabRow.kt:176)");
            }
            function3.invoke(list, composer, 0);
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventEnd();
            }
        } else {
            composer.skipToGroupEnd();
        }
        return kotlin.Unit.INSTANCE;
    }

    /* renamed from: $r8$lambda$hJqhv4cXOnYOG0LNCctIS-bNxZk, reason: not valid java name */
    public static /* synthetic */ kotlin.Unit m2799$r8$lambda$hJqhv4cXOnYOG0LNCctISbNxZk(int i, java.util.List list, androidx.compose.ui.layout.SubcomposeMeasureScope subcomposeMeasureScope, kotlin.jvm.functions.Function2 function2, androidx.compose.material.ScrollableTabData scrollableTabData, int i2, androidx.compose.ui.unit.Constraints constraints, kotlin.jvm.internal.Ref.IntRef intRef, kotlin.jvm.internal.Ref.IntRef intRef2, final kotlin.jvm.functions.Function3 function3, androidx.compose.ui.layout.Placeable.PlacementScope placementScope) {
        final java.util.ArrayList arrayList = new java.util.ArrayList();
        int size = list.size();
        int i3 = i;
        for (int i4 = 0; i4 < size; i4++) {
            androidx.compose.ui.layout.Placeable placeable = (androidx.compose.ui.layout.Placeable) list.get(i4);
            int i5 = i3;
            androidx.compose.ui.layout.Placeable.PlacementScope.placeRelative$default(placementScope, placeable, i3, 0, 0.0f, 4, null);
            arrayList.add(new androidx.compose.material.TabPosition(subcomposeMeasureScope.mo1415toDpu2uoSUM(i5), subcomposeMeasureScope.mo1415toDpu2uoSUM(placeable.getWidth()), null));
            i3 = i5 + placeable.getWidth();
        }
        java.util.List<androidx.compose.ui.layout.Measurable> subcompose = subcomposeMeasureScope.subcompose(androidx.compose.material.TabSlots.getHighResolutionOutputSizeshNQ4ISI, function2);
        int size2 = subcompose.size();
        for (int i6 = 0; i6 < size2; i6++) {
            androidx.compose.ui.layout.Placeable mo7353measureBRTryo0 = subcompose.get(i6).mo7353measureBRTryo0(androidx.compose.ui.unit.Constraints.m8545copyZbe2FdA$default(constraints.getGetHighSpeedVideoFpsRangesFor(), intRef.element, intRef.element, 0, 0, 8, null));
            androidx.compose.ui.layout.Placeable.PlacementScope.placeRelative$default(placementScope, mo7353measureBRTryo0, 0, intRef2.element - mo7353measureBRTryo0.getHeight(), 0.0f, 4, null);
        }
        java.util.List<androidx.compose.ui.layout.Measurable> subcompose2 = subcomposeMeasureScope.subcompose(androidx.compose.material.TabSlots.Camera2StreamConfigurationMap, androidx.compose.runtime.internal.ComposableLambdaKt.composableLambdaInstance(-43203918, true, new kotlin.jvm.functions.Function2() { // from class: androidx.compose.material.TabRowKt$$ExternalSyntheticLambda2
            @Override // kotlin.jvm.functions.Function2
            public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                return androidx.compose.material.TabRowKt.$r8$lambda$e3jNItqLMqKiSo2muf8Q80IDtCs(kotlin.jvm.functions.Function3.this, arrayList, (androidx.compose.runtime.Composer) obj, ((java.lang.Integer) obj2).intValue());
            }
        }));
        int size3 = subcompose2.size();
        for (int i7 = 0; i7 < size3; i7++) {
            androidx.compose.ui.layout.Placeable.PlacementScope.placeRelative$default(placementScope, subcompose2.get(i7).mo7353measureBRTryo0(androidx.compose.ui.unit.Constraints.INSTANCE.m8564fixedJhjzzOo(intRef.element, intRef2.element)), 0, 0, 0.0f, 4, null);
        }
        androidx.compose.ui.layout.SubcomposeMeasureScope subcomposeMeasureScope2 = subcomposeMeasureScope;
        java.lang.Integer num = scrollableTabData.getHighSpeedVideoSizes;
        if (num == null || num.intValue() != i2) {
            scrollableTabData.getHighSpeedVideoSizes = java.lang.Integer.valueOf(i2);
            androidx.compose.material.TabPosition tabPosition = (androidx.compose.material.TabPosition) kotlin.collections.CollectionsKt.getOrNull(arrayList, i2);
            if (tabPosition != null) {
                int mo1412roundToPx0680j_4 = subcomposeMeasureScope2.mo1412roundToPx0680j_4(((androidx.compose.material.TabPosition) kotlin.collections.CollectionsKt.last((java.util.List) arrayList)).m2788getRightD9Ej5fM()) + i;
                int maxValue = mo1412roundToPx0680j_4 - scrollableTabData.getHighResolutionOutputSizeshNQ4ISI.getMaxValue();
                int coerceIn = kotlin.ranges.RangesKt.coerceIn(subcomposeMeasureScope2.mo1412roundToPx0680j_4(tabPosition.getLeft()) - ((maxValue / 2) - (subcomposeMeasureScope2.mo1412roundToPx0680j_4(tabPosition.getWidth()) / 2)), 0, kotlin.ranges.RangesKt.coerceAtLeast(mo1412roundToPx0680j_4 - maxValue, 0));
                if (scrollableTabData.getHighResolutionOutputSizeshNQ4ISI.getValue() != coerceIn) {
                    kotlinx.coroutines.BuildersKt__Builders_commonKt.launch$default(scrollableTabData.getHighSpeedVideoFpsRangesFor, null, null, new androidx.compose.material.ScrollableTabData$onLaidOut$1$1(scrollableTabData, coerceIn, null), 3, null);
                }
            }
        }
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$kQFktKI1GzULYWCR98UJfP_XjbA(int i, java.util.List list, androidx.compose.runtime.Composer composer, int i2) {
        if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
            androidx.compose.runtime.ComposerKt.traceEventStart(-233732148, i2, -1, "androidx.compose.material.ScrollableTabRow.<anonymous> (TabRow.kt:232)");
        }
        androidx.compose.material.TabRowDefaults tabRowDefaults = androidx.compose.material.TabRowDefaults.INSTANCE;
        tabRowDefaults.m2792Indicator9IZ8Weo(tabRowDefaults.tabIndicatorOffset(androidx.compose.ui.Modifier.INSTANCE, (androidx.compose.material.TabPosition) list.get(i)), 0.0f, 0L, composer, 3072, 6);
        if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
            androidx.compose.runtime.ComposerKt.traceEventEnd();
        }
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ androidx.compose.ui.layout.MeasureResult $r8$lambda$st9bVtxd3K4i7u5unrBNeXGwtjU(kotlin.jvm.functions.Function2 function2, final kotlin.jvm.functions.Function2 function22, final kotlin.jvm.functions.Function3 function3, final androidx.compose.ui.layout.SubcomposeMeasureScope subcomposeMeasureScope, final androidx.compose.ui.unit.Constraints constraints) {
        java.lang.Object obj;
        final int m8554getMaxWidthimpl = androidx.compose.ui.unit.Constraints.m8554getMaxWidthimpl(constraints.getGetHighSpeedVideoFpsRangesFor());
        java.util.List<androidx.compose.ui.layout.Measurable> subcompose = subcomposeMeasureScope.subcompose(androidx.compose.material.TabSlots.getHighSpeedVideoSizes, function2);
        int size = subcompose.size();
        final int i = m8554getMaxWidthimpl / size;
        java.util.ArrayList arrayList = new java.util.ArrayList(subcompose.size());
        int size2 = subcompose.size();
        for (int i2 = 0; i2 < size2; i2++) {
            arrayList.add(subcompose.get(i2).mo7353measureBRTryo0(androidx.compose.ui.unit.Constraints.m8545copyZbe2FdA$default(constraints.getGetHighSpeedVideoFpsRangesFor(), i, i, 0, 0, 12, null)));
        }
        final java.util.ArrayList arrayList2 = arrayList;
        if (arrayList2.isEmpty()) {
            obj = null;
        } else {
            obj = arrayList2.get(0);
            int height = ((androidx.compose.ui.layout.Placeable) obj).getHeight();
            int lastIndex = kotlin.collections.CollectionsKt.getLastIndex(arrayList2);
            if (lastIndex > 0) {
                int i3 = 1;
                while (true) {
                    java.lang.Object obj2 = arrayList2.get(i3);
                    int height2 = ((androidx.compose.ui.layout.Placeable) obj2).getHeight();
                    if (height < height2) {
                        obj = obj2;
                        height = height2;
                    }
                    if (i3 == lastIndex) {
                        break;
                    }
                    i3++;
                }
            }
        }
        androidx.compose.ui.layout.Placeable placeable = (androidx.compose.ui.layout.Placeable) obj;
        int height3 = placeable != null ? placeable.getHeight() : 0;
        java.util.ArrayList arrayList3 = new java.util.ArrayList(size);
        for (int i4 = 0; i4 < size; i4++) {
            arrayList3.add(new androidx.compose.material.TabPosition(androidx.compose.ui.unit.Dp.m8601constructorimpl(subcomposeMeasureScope.mo1415toDpu2uoSUM(i) * i4), subcomposeMeasureScope.mo1415toDpu2uoSUM(i), null));
        }
        final java.util.ArrayList arrayList4 = arrayList3;
        final int i5 = height3;
        return androidx.compose.ui.layout.MeasureScope.layout$default(subcomposeMeasureScope, m8554getMaxWidthimpl, height3, null, new kotlin.jvm.functions.Function1() { // from class: androidx.compose.material.TabRowKt$$ExternalSyntheticLambda6
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj3) {
                return androidx.compose.material.TabRowKt.m2797$r8$lambda$NFQEnq91FZj5ryNM0tvYhIqChY(arrayList2, subcomposeMeasureScope, function22, i, constraints, i5, function3, arrayList4, m8554getMaxWidthimpl, (androidx.compose.ui.layout.Placeable.PlacementScope) obj3);
            }
        }, 4, null);
    }
}
