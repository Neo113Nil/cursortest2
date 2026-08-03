package com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.ui;

/* loaded from: classes5.dex */
public final class p {

    public static final class a implements kotlin.jvm.functions.Function3<com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.ui.q, androidx.compose.runtime.Composer, java.lang.Integer, kotlin.Unit> {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ kotlin.jvm.functions.Function0<kotlin.Unit> f7646a;
        public final /* synthetic */ boolean b;
        public final /* synthetic */ long c;
        public final /* synthetic */ long d;
        public final /* synthetic */ long e;

        /* renamed from: com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.ui.p$a$a, reason: collision with other inner class name */
        public static final class C0271a implements kotlin.jvm.functions.Function3<androidx.compose.foundation.layout.RowScope, androidx.compose.runtime.Composer, java.lang.Integer, kotlin.Unit> {

            /* renamed from: a, reason: collision with root package name */
            public final /* synthetic */ com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.ui.q f7647a;
            public final /* synthetic */ long b;
            public final /* synthetic */ androidx.compose.ui.text.TextStyle c;

            public C0271a(com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.ui.q qVar, long j, androidx.compose.ui.text.TextStyle textStyle) {
                this.f7647a = qVar;
                this.b = j;
                this.c = textStyle;
            }

            public final void a(androidx.compose.foundation.layout.RowScope TextButton, androidx.compose.runtime.Composer composer, int i) {
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(TextButton, "$this$TextButton");
                if ((i & 17) == 16 && composer.getSkipping()) {
                    composer.skipToGroupEnd();
                    return;
                }
                if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                    androidx.compose.runtime.ComposerKt.traceEventStart(171301213, i, -1, "com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.ui.CountdownButton.<anonymous>.<anonymous>.<anonymous> (CountdownButton.kt:87)");
                }
                androidx.compose.material.TextKt.m1582TextfLXpl1I(((com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.ui.q.c) this.f7647a).a(), null, 0L, this.b, null, null, null, 0L, null, androidx.compose.ui.text.style.TextAlign.m4353boximpl(androidx.compose.ui.text.style.TextAlign.INSTANCE.m4360getCentere0LSkKk()), 0L, 0, false, 1, null, this.c, composer, 0, 3072, 24054);
                if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                    androidx.compose.runtime.ComposerKt.traceEventEnd();
                }
            }

            @Override // kotlin.jvm.functions.Function3
            public /* bridge */ /* synthetic */ kotlin.Unit invoke(androidx.compose.foundation.layout.RowScope rowScope, androidx.compose.runtime.Composer composer, java.lang.Integer num) {
                a(rowScope, composer, num.intValue());
                return kotlin.Unit.INSTANCE;
            }
        }

        public a(kotlin.jvm.functions.Function0<kotlin.Unit> function0, boolean z, long j, long j2, long j3) {
            this.f7646a = function0;
            this.b = z;
            this.c = j;
            this.d = j2;
            this.e = j3;
        }

        public final void a(com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.ui.q buttonPart, androidx.compose.runtime.Composer composer, int i) {
            int i2;
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(buttonPart, "buttonPart");
            if ((i & 6) == 0) {
                i2 = i | (composer.changed(buttonPart) ? 4 : 2);
            } else {
                i2 = i;
            }
            if ((i2 & 19) == 18 && composer.getSkipping()) {
                composer.skipToGroupEnd();
                return;
            }
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventStart(1810312736, i2, -1, "com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.ui.CountdownButton.<anonymous>.<anonymous> (CountdownButton.kt:59)");
            }
            androidx.compose.ui.text.TextStyle h6 = androidx.compose.material.MaterialTheme.INSTANCE.getTypography(composer, androidx.compose.material.MaterialTheme.$stable).getH6();
            if (buttonPart instanceof com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.ui.q.a) {
                composer.startReplaceableGroup(1000266506);
                composer.endReplaceableGroup();
            } else if (buttonPart instanceof com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.ui.q.b) {
                composer.startReplaceableGroup(1000608622);
                com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.ui.q.b bVar = (com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.ui.q.b) buttonPart;
                com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.ui.t.a(bVar.e(), this.f7646a, null, this.b, bVar.c(), this.c, this.d, bVar.d(), bVar.b(), bVar.a(), composer, 0, 4);
                composer.endReplaceableGroup();
            } else if (buttonPart instanceof com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.ui.q.c) {
                composer.startReplaceableGroup(-1491723097);
                kotlin.jvm.functions.Function0<kotlin.Unit> function0 = this.f7646a;
                boolean z = this.b;
                androidx.compose.material.ButtonDefaults buttonDefaults = androidx.compose.material.ButtonDefaults.INSTANCE;
                long j = this.c;
                androidx.compose.material.ButtonKt.TextButton(function0, null, z, null, null, null, null, buttonDefaults.m1274textButtonColorsRGew2ao(0L, j, j, composer, androidx.compose.material.ButtonDefaults.$stable << 9, 1), null, androidx.compose.runtime.internal.ComposableLambdaKt.composableLambda(composer, 171301213, true, new com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.ui.p.a.C0271a(buttonPart, this.e, h6)), composer, 805306368, 378);
                composer.endReplaceableGroup();
            } else {
                if (!(buttonPart instanceof com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.ui.q.d)) {
                    composer.startReplaceableGroup(-1491754012);
                    composer.endReplaceableGroup();
                    throw new kotlin.NoWhenBranchMatchedException();
                }
                composer.startReplaceableGroup(1001871283);
                com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.ui.q.d dVar = (com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.ui.q.d) buttonPart;
                long d = androidx.compose.ui.unit.TextUnit.m4670equalsimpl0(dVar.d(), androidx.compose.ui.unit.TextUnit.INSTANCE.m4684getUnspecifiedXSAIIZE()) ? this.e : dVar.d();
                com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.ui.x.a(dVar.h(), dVar.g(), dVar.c(), dVar.f(), dVar.b(), dVar.a(), androidx.compose.ui.unit.DpKt.m4500DpSizeYgX7TsA(androidx.compose.ui.unit.Dp.m4478constructorimpl(120), androidx.compose.ui.unit.Dp.m4478constructorimpl(20)), dVar.e(), dVar.i(), dVar.j(), d, this.f7646a, composer, 1572864, 0, 0);
                composer.endReplaceableGroup();
            }
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventEnd();
            }
        }

        @Override // kotlin.jvm.functions.Function3
        public /* bridge */ /* synthetic */ kotlin.Unit invoke(com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.ui.q qVar, androidx.compose.runtime.Composer composer, java.lang.Integer num) {
            a(qVar, composer, num.intValue());
            return kotlin.Unit.INSTANCE;
        }
    }

    public static final kotlin.Unit a(com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.ui.q qVar, androidx.compose.ui.Modifier modifier, kotlin.jvm.functions.Function0 function0, boolean z, long j, long j2, long j3, com.moloco.sdk.internal.ortb.model.k kVar, kotlin.jvm.functions.Function0 function02, int i, int i2, androidx.compose.runtime.Composer composer, int i3) {
        a(qVar, modifier, function0, z, j, j2, j3, kVar, function02, composer, androidx.compose.runtime.RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
        return kotlin.Unit.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:103:0x00d2  */
    /* JADX WARN: Removed duplicated region for block: B:10:0x005b  */
    /* JADX WARN: Removed duplicated region for block: B:110:0x00b0  */
    /* JADX WARN: Removed duplicated region for block: B:120:0x00a2  */
    /* JADX WARN: Removed duplicated region for block: B:121:0x0077  */
    /* JADX WARN: Removed duplicated region for block: B:128:0x005e  */
    /* JADX WARN: Removed duplicated region for block: B:13:0x0072  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x008d  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x00aa  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x00cd  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x00eb  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0105  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x02c7  */
    /* JADX WARN: Removed duplicated region for block: B:44:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:56:0x0192  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x01da  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x01e6  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x0209  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x0247 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:72:0x0252  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x02b8  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x01ea  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x015d  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x0164  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x0174  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x017d  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x0179  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x0108  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x00ee  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void a(final com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.ui.q countdownButtonPart, androidx.compose.ui.Modifier modifier, final kotlin.jvm.functions.Function0<kotlin.Unit> onClick, final boolean z, long j, long j2, long j3, final com.moloco.sdk.internal.ortb.model.k kVar, final kotlin.jvm.functions.Function0<kotlin.Unit> onTimerFinish, androidx.compose.runtime.Composer composer, final int i, final int i2) {
        int i3;
        androidx.compose.ui.Modifier modifier2;
        long j4;
        int i4;
        int i5;
        int i6;
        long b;
        long j5;
        int i7;
        long d;
        androidx.compose.ui.Modifier modifier3;
        int currentCompositeKeyHash;
        androidx.compose.runtime.Composer m1641constructorimpl;
        long j6;
        androidx.compose.runtime.Composer composer2;
        final androidx.compose.ui.Modifier modifier4;
        final long j7;
        final long j8;
        com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.ui.q.a aVar;
        androidx.compose.runtime.ScopeUpdateScope endRestartGroup;
        int i8;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(countdownButtonPart, "countdownButtonPart");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(onClick, "onClick");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(onTimerFinish, "onTimerFinish");
        androidx.compose.runtime.Composer startRestartGroup = composer.startRestartGroup(1730954989);
        if ((i2 & 1) != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            i3 = (startRestartGroup.changed(countdownButtonPart) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        int i9 = i2 & 2;
        if (i9 != 0) {
            i3 |= 48;
        } else if ((i & 48) == 0) {
            modifier2 = modifier;
            i3 |= startRestartGroup.changed(modifier2) ? 32 : 16;
            if ((i2 & 4) == 0) {
                i3 |= 384;
            } else if ((i & 384) == 0) {
                i3 |= startRestartGroup.changedInstance(onClick) ? 256 : 128;
            }
            if ((i2 & 8) == 0) {
                i3 |= 3072;
            } else if ((i & 3072) == 0) {
                i3 |= startRestartGroup.changed(z) ? 2048 : 1024;
            }
            if ((i & 24576) != 0) {
                if ((i2 & 16) == 0) {
                    j4 = j;
                    if (startRestartGroup.changed(j4)) {
                        i8 = 16384;
                        i3 |= i8;
                    }
                } else {
                    j4 = j;
                }
                i8 = 8192;
                i3 |= i8;
            } else {
                j4 = j;
            }
            i4 = i2 & 32;
            if (i4 == 0) {
                i5 = i3 | androidx.profileinstaller.ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE;
            } else {
                int i10 = i3;
                if ((196608 & i) == 0) {
                    i5 = i10 | (startRestartGroup.changed(j2) ? 131072 : 65536);
                } else {
                    i5 = i10;
                }
            }
            i6 = i2 & 64;
            if (i6 == 0) {
                i5 |= 1572864;
            } else if ((i & 1572864) == 0) {
                i5 |= startRestartGroup.changed(j3) ? 1048576 : 524288;
            }
            if ((i2 & 128) == 0) {
                i5 |= 12582912;
            } else if ((i & 12582912) == 0) {
                i5 |= startRestartGroup.changed(kVar) ? 8388608 : 4194304;
            }
            if ((i2 & 256) == 0) {
                i5 |= 100663296;
            } else if ((i & 100663296) == 0) {
                i5 |= startRestartGroup.changedInstance(onTimerFinish) ? androidx.core.view.accessibility.AccessibilityEventCompat.TYPE_VIEW_TARGETED_BY_SCROLL : 33554432;
            }
            if ((i5 & 38347923) == 38347922 || !startRestartGroup.getSkipping()) {
                startRestartGroup.startDefaults();
                if ((i & 1) != 0 || startRestartGroup.getDefaultsInvalid()) {
                    if (i9 != 0) {
                        modifier2 = androidx.compose.ui.Modifier.INSTANCE;
                    }
                    if ((i2 & 16) != 0) {
                        j4 = androidx.compose.material.MaterialTheme.INSTANCE.getColors(startRestartGroup, androidx.compose.material.MaterialTheme.$stable).m1315getPrimary0d7_KjU();
                        i5 &= -57345;
                    }
                    b = i4 == 0 ? com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.ui.utils.a.b() : j2;
                    if (i6 != 0) {
                        j5 = j4;
                        i7 = i5;
                        d = com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.ui.utils.a.d();
                        modifier3 = modifier2;
                        startRestartGroup.endDefaults();
                        if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                            androidx.compose.runtime.ComposerKt.traceEventStart(1730954989, i7, -1, "com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.ui.CountdownButton (CountdownButton.kt:38)");
                        }
                        androidx.compose.ui.Modifier m618size6HolHcs = androidx.compose.foundation.layout.SizeKt.m618size6HolHcs(androidx.compose.foundation.layout.SizeKt.fillMaxSize$default(androidx.compose.ui.Modifier.INSTANCE, 0.0f, 1, null), b);
                        androidx.compose.ui.Alignment topEnd = androidx.compose.ui.Alignment.INSTANCE.getTopEnd();
                        startRestartGroup.startReplaceableGroup(733328855);
                        androidx.compose.ui.layout.MeasurePolicy rememberBoxMeasurePolicy = androidx.compose.foundation.layout.BoxKt.rememberBoxMeasurePolicy(topEnd, false, startRestartGroup, 6);
                        startRestartGroup.startReplaceableGroup(-1323940314);
                        currentCompositeKeyHash = androidx.compose.runtime.ComposablesKt.getCurrentCompositeKeyHash(startRestartGroup, 0);
                        androidx.compose.runtime.CompositionLocalMap currentCompositionLocalMap = startRestartGroup.getCurrentCompositionLocalMap();
                        androidx.compose.ui.node.ComposeUiNode.Companion companion = androidx.compose.ui.node.ComposeUiNode.INSTANCE;
                        kotlin.jvm.functions.Function0<androidx.compose.ui.node.ComposeUiNode> constructor = companion.getConstructor();
                        kotlin.jvm.functions.Function3<androidx.compose.runtime.SkippableUpdater<androidx.compose.ui.node.ComposeUiNode>, androidx.compose.runtime.Composer, java.lang.Integer, kotlin.Unit> modifierMaterializerOf = androidx.compose.ui.layout.LayoutKt.modifierMaterializerOf(m618size6HolHcs);
                        if (!(startRestartGroup.getApplier() instanceof androidx.compose.runtime.Applier)) {
                            androidx.compose.runtime.ComposablesKt.invalidApplier();
                        }
                        startRestartGroup.startReusableNode();
                        if (startRestartGroup.getInserting()) {
                            startRestartGroup.createNode(constructor);
                        } else {
                            startRestartGroup.useNode();
                        }
                        m1641constructorimpl = androidx.compose.runtime.Updater.m1641constructorimpl(startRestartGroup);
                        androidx.compose.runtime.Updater.m1648setimpl(m1641constructorimpl, rememberBoxMeasurePolicy, companion.getSetMeasurePolicy());
                        androidx.compose.runtime.Updater.m1648setimpl(m1641constructorimpl, currentCompositionLocalMap, companion.getSetResolvedCompositionLocals());
                        kotlin.jvm.functions.Function2<androidx.compose.ui.node.ComposeUiNode, java.lang.Integer, kotlin.Unit> setCompositeKeyHash = companion.getSetCompositeKeyHash();
                        if (!m1641constructorimpl.getInserting() || !kotlin.jvm.internal.Intrinsics.areEqual(m1641constructorimpl.rememberedValue(), java.lang.Integer.valueOf(currentCompositeKeyHash))) {
                            m1641constructorimpl.updateRememberedValue(java.lang.Integer.valueOf(currentCompositeKeyHash));
                            m1641constructorimpl.apply(java.lang.Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
                        }
                        modifierMaterializerOf.invoke(androidx.compose.runtime.SkippableUpdater.m1632boximpl(androidx.compose.runtime.SkippableUpdater.m1633constructorimpl(startRestartGroup)), startRestartGroup, 0);
                        startRestartGroup.startReplaceableGroup(2058660585);
                        androidx.compose.foundation.layout.BoxScopeInstance boxScopeInstance = androidx.compose.foundation.layout.BoxScopeInstance.INSTANCE;
                        startRestartGroup.startReplaceableGroup(523924163);
                        if ((countdownButtonPart instanceof com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.ui.q.a) && kVar != null) {
                            aVar = (com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.ui.q.a) countdownButtonPart;
                            if (aVar.b()) {
                                com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.ui.rewardedcountdowntimer.a.a(kVar, aVar.c(), aVar.a(), onTimerFinish, startRestartGroup, ((i7 >> 21) & 14) | ((i7 >> 15) & 7168));
                            }
                        }
                        startRestartGroup.endReplaceableGroup();
                        int i11 = i7;
                        j6 = b;
                        composer2 = startRestartGroup;
                        androidx.compose.animation.CrossfadeKt.Crossfade(countdownButtonPart, modifier3, (androidx.compose.animation.core.FiniteAnimationSpec<java.lang.Float>) null, (java.lang.String) null, androidx.compose.runtime.internal.ComposableLambdaKt.composableLambda(startRestartGroup, 1810312736, true, new com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.ui.p.a(onClick, z, j5, b, d)), composer2, (i11 & 112) | (i11 & 14) | 24576, 12);
                        composer2.endReplaceableGroup();
                        composer2.endNode();
                        composer2.endReplaceableGroup();
                        composer2.endReplaceableGroup();
                        if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                            androidx.compose.runtime.ComposerKt.traceEventEnd();
                        }
                        modifier4 = modifier3;
                        j7 = j5;
                        j8 = d;
                    }
                } else {
                    startRestartGroup.skipToGroupEnd();
                    if ((i2 & 16) != 0) {
                        i5 &= -57345;
                    }
                    b = j2;
                }
                d = j3;
                modifier3 = modifier2;
                j5 = j4;
                i7 = i5;
                startRestartGroup.endDefaults();
                if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                }
                androidx.compose.ui.Modifier m618size6HolHcs2 = androidx.compose.foundation.layout.SizeKt.m618size6HolHcs(androidx.compose.foundation.layout.SizeKt.fillMaxSize$default(androidx.compose.ui.Modifier.INSTANCE, 0.0f, 1, null), b);
                androidx.compose.ui.Alignment topEnd2 = androidx.compose.ui.Alignment.INSTANCE.getTopEnd();
                startRestartGroup.startReplaceableGroup(733328855);
                androidx.compose.ui.layout.MeasurePolicy rememberBoxMeasurePolicy2 = androidx.compose.foundation.layout.BoxKt.rememberBoxMeasurePolicy(topEnd2, false, startRestartGroup, 6);
                startRestartGroup.startReplaceableGroup(-1323940314);
                currentCompositeKeyHash = androidx.compose.runtime.ComposablesKt.getCurrentCompositeKeyHash(startRestartGroup, 0);
                androidx.compose.runtime.CompositionLocalMap currentCompositionLocalMap2 = startRestartGroup.getCurrentCompositionLocalMap();
                androidx.compose.ui.node.ComposeUiNode.Companion companion2 = androidx.compose.ui.node.ComposeUiNode.INSTANCE;
                kotlin.jvm.functions.Function0<androidx.compose.ui.node.ComposeUiNode> constructor2 = companion2.getConstructor();
                kotlin.jvm.functions.Function3<androidx.compose.runtime.SkippableUpdater<androidx.compose.ui.node.ComposeUiNode>, androidx.compose.runtime.Composer, java.lang.Integer, kotlin.Unit> modifierMaterializerOf2 = androidx.compose.ui.layout.LayoutKt.modifierMaterializerOf(m618size6HolHcs2);
                if (!(startRestartGroup.getApplier() instanceof androidx.compose.runtime.Applier)) {
                }
                startRestartGroup.startReusableNode();
                if (startRestartGroup.getInserting()) {
                }
                m1641constructorimpl = androidx.compose.runtime.Updater.m1641constructorimpl(startRestartGroup);
                androidx.compose.runtime.Updater.m1648setimpl(m1641constructorimpl, rememberBoxMeasurePolicy2, companion2.getSetMeasurePolicy());
                androidx.compose.runtime.Updater.m1648setimpl(m1641constructorimpl, currentCompositionLocalMap2, companion2.getSetResolvedCompositionLocals());
                kotlin.jvm.functions.Function2<androidx.compose.ui.node.ComposeUiNode, java.lang.Integer, kotlin.Unit> setCompositeKeyHash2 = companion2.getSetCompositeKeyHash();
                if (!m1641constructorimpl.getInserting()) {
                }
                m1641constructorimpl.updateRememberedValue(java.lang.Integer.valueOf(currentCompositeKeyHash));
                m1641constructorimpl.apply(java.lang.Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash2);
                modifierMaterializerOf2.invoke(androidx.compose.runtime.SkippableUpdater.m1632boximpl(androidx.compose.runtime.SkippableUpdater.m1633constructorimpl(startRestartGroup)), startRestartGroup, 0);
                startRestartGroup.startReplaceableGroup(2058660585);
                androidx.compose.foundation.layout.BoxScopeInstance boxScopeInstance2 = androidx.compose.foundation.layout.BoxScopeInstance.INSTANCE;
                startRestartGroup.startReplaceableGroup(523924163);
                if (countdownButtonPart instanceof com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.ui.q.a) {
                    aVar = (com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.ui.q.a) countdownButtonPart;
                    if (aVar.b()) {
                    }
                }
                startRestartGroup.endReplaceableGroup();
                int i112 = i7;
                j6 = b;
                composer2 = startRestartGroup;
                androidx.compose.animation.CrossfadeKt.Crossfade(countdownButtonPart, modifier3, (androidx.compose.animation.core.FiniteAnimationSpec<java.lang.Float>) null, (java.lang.String) null, androidx.compose.runtime.internal.ComposableLambdaKt.composableLambda(startRestartGroup, 1810312736, true, new com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.ui.p.a(onClick, z, j5, b, d)), composer2, (i112 & 112) | (i112 & 14) | 24576, 12);
                composer2.endReplaceableGroup();
                composer2.endNode();
                composer2.endReplaceableGroup();
                composer2.endReplaceableGroup();
                if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                }
                modifier4 = modifier3;
                j7 = j5;
                j8 = d;
            } else {
                startRestartGroup.skipToGroupEnd();
                composer2 = startRestartGroup;
                modifier4 = modifier2;
                j7 = j4;
                j6 = j2;
                j8 = j3;
            }
            endRestartGroup = composer2.endRestartGroup();
            if (endRestartGroup == null) {
                final long j9 = j6;
                endRestartGroup.updateScope(new kotlin.jvm.functions.Function2() { // from class: com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.ui.p$$ExternalSyntheticLambda0
                    @Override // kotlin.jvm.functions.Function2
                    public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                        return com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.ui.p.a(com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.ui.q.this, modifier4, onClick, z, j7, j9, j8, kVar, onTimerFinish, i, i2, (androidx.compose.runtime.Composer) obj, ((java.lang.Integer) obj2).intValue());
                    }
                });
                return;
            }
            return;
        }
        modifier2 = modifier;
        if ((i2 & 4) == 0) {
        }
        if ((i2 & 8) == 0) {
        }
        if ((i & 24576) != 0) {
        }
        i4 = i2 & 32;
        if (i4 == 0) {
        }
        i6 = i2 & 64;
        if (i6 == 0) {
        }
        if ((i2 & 128) == 0) {
        }
        if ((i2 & 256) == 0) {
        }
        if ((i5 & 38347923) == 38347922) {
        }
        startRestartGroup.startDefaults();
        if ((i & 1) != 0) {
        }
        if (i9 != 0) {
        }
        if ((i2 & 16) != 0) {
        }
        if (i4 == 0) {
        }
        if (i6 != 0) {
        }
        d = j3;
        modifier3 = modifier2;
        j5 = j4;
        i7 = i5;
        startRestartGroup.endDefaults();
        if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
        }
        androidx.compose.ui.Modifier m618size6HolHcs22 = androidx.compose.foundation.layout.SizeKt.m618size6HolHcs(androidx.compose.foundation.layout.SizeKt.fillMaxSize$default(androidx.compose.ui.Modifier.INSTANCE, 0.0f, 1, null), b);
        androidx.compose.ui.Alignment topEnd22 = androidx.compose.ui.Alignment.INSTANCE.getTopEnd();
        startRestartGroup.startReplaceableGroup(733328855);
        androidx.compose.ui.layout.MeasurePolicy rememberBoxMeasurePolicy22 = androidx.compose.foundation.layout.BoxKt.rememberBoxMeasurePolicy(topEnd22, false, startRestartGroup, 6);
        startRestartGroup.startReplaceableGroup(-1323940314);
        currentCompositeKeyHash = androidx.compose.runtime.ComposablesKt.getCurrentCompositeKeyHash(startRestartGroup, 0);
        androidx.compose.runtime.CompositionLocalMap currentCompositionLocalMap22 = startRestartGroup.getCurrentCompositionLocalMap();
        androidx.compose.ui.node.ComposeUiNode.Companion companion22 = androidx.compose.ui.node.ComposeUiNode.INSTANCE;
        kotlin.jvm.functions.Function0<androidx.compose.ui.node.ComposeUiNode> constructor22 = companion22.getConstructor();
        kotlin.jvm.functions.Function3<androidx.compose.runtime.SkippableUpdater<androidx.compose.ui.node.ComposeUiNode>, androidx.compose.runtime.Composer, java.lang.Integer, kotlin.Unit> modifierMaterializerOf22 = androidx.compose.ui.layout.LayoutKt.modifierMaterializerOf(m618size6HolHcs22);
        if (!(startRestartGroup.getApplier() instanceof androidx.compose.runtime.Applier)) {
        }
        startRestartGroup.startReusableNode();
        if (startRestartGroup.getInserting()) {
        }
        m1641constructorimpl = androidx.compose.runtime.Updater.m1641constructorimpl(startRestartGroup);
        androidx.compose.runtime.Updater.m1648setimpl(m1641constructorimpl, rememberBoxMeasurePolicy22, companion22.getSetMeasurePolicy());
        androidx.compose.runtime.Updater.m1648setimpl(m1641constructorimpl, currentCompositionLocalMap22, companion22.getSetResolvedCompositionLocals());
        kotlin.jvm.functions.Function2<androidx.compose.ui.node.ComposeUiNode, java.lang.Integer, kotlin.Unit> setCompositeKeyHash22 = companion22.getSetCompositeKeyHash();
        if (!m1641constructorimpl.getInserting()) {
        }
        m1641constructorimpl.updateRememberedValue(java.lang.Integer.valueOf(currentCompositeKeyHash));
        m1641constructorimpl.apply(java.lang.Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash22);
        modifierMaterializerOf22.invoke(androidx.compose.runtime.SkippableUpdater.m1632boximpl(androidx.compose.runtime.SkippableUpdater.m1633constructorimpl(startRestartGroup)), startRestartGroup, 0);
        startRestartGroup.startReplaceableGroup(2058660585);
        androidx.compose.foundation.layout.BoxScopeInstance boxScopeInstance22 = androidx.compose.foundation.layout.BoxScopeInstance.INSTANCE;
        startRestartGroup.startReplaceableGroup(523924163);
        if (countdownButtonPart instanceof com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.ui.q.a) {
        }
        startRestartGroup.endReplaceableGroup();
        int i1122 = i7;
        j6 = b;
        composer2 = startRestartGroup;
        androidx.compose.animation.CrossfadeKt.Crossfade(countdownButtonPart, modifier3, (androidx.compose.animation.core.FiniteAnimationSpec<java.lang.Float>) null, (java.lang.String) null, androidx.compose.runtime.internal.ComposableLambdaKt.composableLambda(startRestartGroup, 1810312736, true, new com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.ui.p.a(onClick, z, j5, b, d)), composer2, (i1122 & 112) | (i1122 & 14) | 24576, 12);
        composer2.endReplaceableGroup();
        composer2.endNode();
        composer2.endReplaceableGroup();
        composer2.endReplaceableGroup();
        if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
        }
        modifier4 = modifier3;
        j7 = j5;
        j8 = d;
        endRestartGroup = composer2.endRestartGroup();
        if (endRestartGroup == null) {
        }
    }
}
