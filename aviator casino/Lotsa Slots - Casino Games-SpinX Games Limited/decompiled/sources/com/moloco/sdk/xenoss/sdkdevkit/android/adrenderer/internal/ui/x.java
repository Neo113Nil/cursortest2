package com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.ui;

/* loaded from: classes5.dex */
public final class x {

    public static final class a implements kotlin.jvm.functions.Function2<androidx.compose.runtime.Composer, java.lang.Integer, kotlin.Unit> {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ float f7671a;
        public final /* synthetic */ java.lang.String b;
        public final /* synthetic */ kotlin.jvm.functions.Function0<kotlin.Unit> c;
        public final /* synthetic */ boolean d;
        public final /* synthetic */ boolean e;
        public final /* synthetic */ java.lang.String f;
        public final /* synthetic */ long g;
        public final /* synthetic */ long h;
        public final /* synthetic */ long i;
        public final /* synthetic */ androidx.compose.ui.graphics.painter.Painter j;

        /* renamed from: com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.ui.x$a$a, reason: collision with other inner class name */
        public static final class C0277a implements kotlin.jvm.functions.Function2<androidx.compose.runtime.Composer, java.lang.Integer, kotlin.Unit> {

            /* renamed from: a, reason: collision with root package name */
            public final /* synthetic */ long f7672a;
            public final /* synthetic */ androidx.compose.ui.graphics.painter.Painter b;
            public final /* synthetic */ java.lang.String c;
            public final /* synthetic */ long d;

            public C0277a(long j, androidx.compose.ui.graphics.painter.Painter painter, java.lang.String str, long j2) {
                this.f7672a = j;
                this.b = painter;
                this.c = str;
                this.d = j2;
            }

            public final void a(androidx.compose.runtime.Composer composer, int i) {
                if ((i & 3) == 2 && composer.getSkipping()) {
                    composer.skipToGroupEnd();
                    return;
                }
                if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                    androidx.compose.runtime.ComposerKt.traceEventStart(367056260, i, -1, "com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.ui.TextIconButton.<anonymous>.<anonymous>.<anonymous> (TextIconButton.kt:75)");
                }
                androidx.compose.material.IconKt.m1412Iconww6aTOc(this.b, this.c, androidx.compose.foundation.layout.SizeKt.m618size6HolHcs(androidx.compose.ui.Modifier.INSTANCE, this.f7672a), this.d, composer, 0, 0);
                if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                    androidx.compose.runtime.ComposerKt.traceEventEnd();
                }
            }

            @Override // kotlin.jvm.functions.Function2
            public /* bridge */ /* synthetic */ kotlin.Unit invoke(androidx.compose.runtime.Composer composer, java.lang.Integer num) {
                a(composer, num.intValue());
                return kotlin.Unit.INSTANCE;
            }
        }

        public static final class b implements kotlin.jvm.functions.Function2<androidx.compose.runtime.Composer, java.lang.Integer, kotlin.Unit> {

            /* renamed from: a, reason: collision with root package name */
            public final /* synthetic */ java.lang.String f7673a;
            public final /* synthetic */ long b;
            public final /* synthetic */ long c;

            public b(java.lang.String str, long j, long j2) {
                this.f7673a = str;
                this.b = j;
                this.c = j2;
            }

            public final void a(androidx.compose.runtime.Composer composer, int i) {
                if ((i & 3) == 2 && composer.getSkipping()) {
                    composer.skipToGroupEnd();
                    return;
                }
                if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                    androidx.compose.runtime.ComposerKt.traceEventStart(-618324232, i, -1, "com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.ui.TextIconButton.<anonymous>.<anonymous>.<anonymous> (TextIconButton.kt:67)");
                }
                androidx.compose.material.TextKt.m1582TextfLXpl1I(this.f7673a, androidx.compose.foundation.layout.OffsetKt.m529offsetVpY3zN4$default(androidx.compose.ui.Modifier.INSTANCE, 0.0f, androidx.compose.ui.unit.Dp.m4478constructorimpl(-1), 1, null), this.b, this.c, null, null, null, 0L, null, null, 0L, 0, false, 0, null, null, composer, 48, 0, 65520);
                if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                    androidx.compose.runtime.ComposerKt.traceEventEnd();
                }
            }

            @Override // kotlin.jvm.functions.Function2
            public /* bridge */ /* synthetic */ kotlin.Unit invoke(androidx.compose.runtime.Composer composer, java.lang.Integer num) {
                a(composer, num.intValue());
                return kotlin.Unit.INSTANCE;
            }
        }

        public a(float f, java.lang.String str, kotlin.jvm.functions.Function0<kotlin.Unit> function0, boolean z, boolean z2, java.lang.String str2, long j, long j2, long j3, androidx.compose.ui.graphics.painter.Painter painter) {
            this.f7671a = f;
            this.b = str;
            this.c = function0;
            this.d = z;
            this.e = z2;
            this.f = str2;
            this.g = j;
            this.h = j2;
            this.i = j3;
            this.j = painter;
        }

        public final void a(androidx.compose.runtime.Composer composer, int i) {
            androidx.compose.ui.Modifier m243clickableO2vRcR0;
            if ((i & 3) == 2 && composer.getSkipping()) {
                composer.skipToGroupEnd();
                return;
            }
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventStart(-1541935208, i, -1, "com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.ui.TextIconButton.<anonymous> (TextIconButton.kt:52)");
            }
            androidx.compose.ui.Modifier.Companion companion = androidx.compose.ui.Modifier.INSTANCE;
            androidx.compose.ui.Modifier m569paddingVpY3zN4 = androidx.compose.foundation.layout.PaddingKt.m569paddingVpY3zN4(androidx.compose.foundation.layout.SizeKt.m605heightInVpY3zN4$default(companion, this.f7671a, 0.0f, 2, null), androidx.compose.ui.unit.Dp.m4478constructorimpl(10), androidx.compose.ui.unit.Dp.m4478constructorimpl(6));
            androidx.compose.foundation.Indication m1601rememberRipple9IZ8Weo = androidx.compose.material.ripple.RippleKt.m1601rememberRipple9IZ8Weo(true, 0.0f, 0L, composer, 6, 6);
            composer.startReplaceableGroup(1151230561);
            java.lang.Object rememberedValue = composer.rememberedValue();
            if (rememberedValue == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                rememberedValue = androidx.compose.foundation.interaction.InteractionSourceKt.MutableInteractionSource();
                composer.updateRememberedValue(rememberedValue);
            }
            composer.endReplaceableGroup();
            m243clickableO2vRcR0 = androidx.compose.foundation.ClickableKt.m243clickableO2vRcR0(m569paddingVpY3zN4, (androidx.compose.foundation.interaction.MutableInteractionSource) rememberedValue, m1601rememberRipple9IZ8Weo, (r14 & 4) != 0, (r14 & 8) != 0 ? null : this.b, (r14 & 16) != 0 ? null : androidx.compose.ui.semantics.Role.m3785boximpl(androidx.compose.ui.semantics.Role.INSTANCE.m3792getButtono7Vup1c()), this.c);
            androidx.compose.ui.Alignment.Vertical centerVertically = androidx.compose.ui.Alignment.INSTANCE.getCenterVertically();
            androidx.compose.foundation.layout.Arrangement.HorizontalOrVertical center = androidx.compose.foundation.layout.Arrangement.INSTANCE.getCenter();
            boolean z = this.d;
            boolean z2 = this.e;
            java.lang.String str = this.f;
            long j = this.g;
            long j2 = this.h;
            long j3 = this.i;
            androidx.compose.ui.graphics.painter.Painter painter = this.j;
            java.lang.String str2 = this.b;
            composer.startReplaceableGroup(693286680);
            androidx.compose.ui.layout.MeasurePolicy rowMeasurePolicy = androidx.compose.foundation.layout.RowKt.rowMeasurePolicy(center, centerVertically, composer, 54);
            composer.startReplaceableGroup(-1323940314);
            int currentCompositeKeyHash = androidx.compose.runtime.ComposablesKt.getCurrentCompositeKeyHash(composer, 0);
            androidx.compose.runtime.CompositionLocalMap currentCompositionLocalMap = composer.getCurrentCompositionLocalMap();
            androidx.compose.ui.node.ComposeUiNode.Companion companion2 = androidx.compose.ui.node.ComposeUiNode.INSTANCE;
            kotlin.jvm.functions.Function0<androidx.compose.ui.node.ComposeUiNode> constructor = companion2.getConstructor();
            kotlin.jvm.functions.Function3<androidx.compose.runtime.SkippableUpdater<androidx.compose.ui.node.ComposeUiNode>, androidx.compose.runtime.Composer, java.lang.Integer, kotlin.Unit> modifierMaterializerOf = androidx.compose.ui.layout.LayoutKt.modifierMaterializerOf(m243clickableO2vRcR0);
            if (!(composer.getApplier() instanceof androidx.compose.runtime.Applier)) {
                androidx.compose.runtime.ComposablesKt.invalidApplier();
            }
            composer.startReusableNode();
            if (composer.getInserting()) {
                composer.createNode(constructor);
            } else {
                composer.useNode();
            }
            androidx.compose.runtime.Composer m1641constructorimpl = androidx.compose.runtime.Updater.m1641constructorimpl(composer);
            androidx.compose.runtime.Updater.m1648setimpl(m1641constructorimpl, rowMeasurePolicy, companion2.getSetMeasurePolicy());
            androidx.compose.runtime.Updater.m1648setimpl(m1641constructorimpl, currentCompositionLocalMap, companion2.getSetResolvedCompositionLocals());
            kotlin.jvm.functions.Function2<androidx.compose.ui.node.ComposeUiNode, java.lang.Integer, kotlin.Unit> setCompositeKeyHash = companion2.getSetCompositeKeyHash();
            if (m1641constructorimpl.getInserting() || !kotlin.jvm.internal.Intrinsics.areEqual(m1641constructorimpl.rememberedValue(), java.lang.Integer.valueOf(currentCompositeKeyHash))) {
                m1641constructorimpl.updateRememberedValue(java.lang.Integer.valueOf(currentCompositeKeyHash));
                m1641constructorimpl.apply(java.lang.Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
            }
            modifierMaterializerOf.invoke(androidx.compose.runtime.SkippableUpdater.m1632boximpl(androidx.compose.runtime.SkippableUpdater.m1633constructorimpl(composer)), composer, 0);
            composer.startReplaceableGroup(2058660585);
            androidx.compose.foundation.layout.RowScopeInstance rowScopeInstance = androidx.compose.foundation.layout.RowScopeInstance.INSTANCE;
            androidx.compose.runtime.internal.ComposableLambda composableLambda = androidx.compose.runtime.internal.ComposableLambdaKt.composableLambda(composer, -618324232, true, new com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.ui.x.a.b(str, j, j2));
            androidx.compose.runtime.internal.ComposableLambda composableLambda2 = androidx.compose.runtime.internal.ComposableLambdaKt.composableLambda(composer, 367056260, true, new com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.ui.x.a.C0277a(j3, painter, str2, j));
            if (z) {
                composer.startReplaceableGroup(774006835);
                composableLambda.invoke(composer, 6);
                if (z2) {
                    androidx.compose.foundation.layout.SpacerKt.Spacer(androidx.compose.foundation.layout.SizeKt.m622width3ABfNKs(companion, androidx.compose.ui.unit.Dp.m4478constructorimpl(4)), composer, 6);
                    composableLambda2.invoke(composer, 6);
                }
                composer.endReplaceableGroup();
            } else {
                composer.startReplaceableGroup(774193331);
                composer.startReplaceableGroup(717711159);
                if (z2) {
                    composableLambda2.invoke(composer, 6);
                    androidx.compose.foundation.layout.SpacerKt.Spacer(androidx.compose.foundation.layout.SizeKt.m622width3ABfNKs(companion, androidx.compose.ui.unit.Dp.m4478constructorimpl(4)), composer, 6);
                }
                composer.endReplaceableGroup();
                composableLambda.invoke(composer, 6);
                composer.endReplaceableGroup();
            }
            composer.endReplaceableGroup();
            composer.endNode();
            composer.endReplaceableGroup();
            composer.endReplaceableGroup();
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventEnd();
            }
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ kotlin.Unit invoke(androidx.compose.runtime.Composer composer, java.lang.Integer num) {
            a(composer, num.intValue());
            return kotlin.Unit.INSTANCE;
        }
    }

    public static final kotlin.Unit a(int i, androidx.compose.runtime.Composer composer, int i2) {
        a(composer, androidx.compose.runtime.RecomposeScopeImplKt.updateChangedFlags(i | 1));
        return kotlin.Unit.INSTANCE;
    }

    public static final kotlin.Unit a(java.lang.String str, androidx.compose.ui.graphics.painter.Painter painter, java.lang.String str2, long j, androidx.compose.ui.graphics.Shape shape, long j2, long j3, long j4, boolean z, boolean z2, long j5, kotlin.jvm.functions.Function0 function0, int i, int i2, int i3, androidx.compose.runtime.Composer composer, int i4) {
        a(str, painter, str2, j, shape, j2, j3, j4, z, z2, j5, function0, composer, androidx.compose.runtime.RecomposeScopeImplKt.updateChangedFlags(i | 1), androidx.compose.runtime.RecomposeScopeImplKt.updateChangedFlags(i2), i3);
        return kotlin.Unit.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:106:0x010c  */
    /* JADX WARN: Removed duplicated region for block: B:113:0x00ee  */
    /* JADX WARN: Removed duplicated region for block: B:120:0x00d0  */
    /* JADX WARN: Removed duplicated region for block: B:127:0x00b0  */
    /* JADX WARN: Removed duplicated region for block: B:134:0x0093  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0090  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x00a9  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x00cb  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x00e9  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0107  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0125  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0141  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0160  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x026c  */
    /* JADX WARN: Removed duplicated region for block: B:55:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:66:0x01f3  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x025b  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x01be  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x01cc  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x01d2  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x01d5  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x01e0  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x01ce  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x01c8  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x0163  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x0146  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x012a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void a(final java.lang.String text, androidx.compose.ui.graphics.painter.Painter painter, final java.lang.String str, final long j, final androidx.compose.ui.graphics.Shape backgroundShape, final long j2, final long j3, final long j4, boolean z, boolean z2, long j5, final kotlin.jvm.functions.Function0<kotlin.Unit> onClick, androidx.compose.runtime.Composer composer, final int i, final int i2, final int i3) {
        int i4;
        int i5;
        int i6;
        int i7;
        boolean z3;
        int i8;
        int i9;
        androidx.compose.ui.graphics.painter.Painter painter2;
        long j6;
        boolean z4;
        boolean z5;
        int i10;
        androidx.compose.ui.graphics.painter.Painter painter3;
        androidx.compose.runtime.Composer composer2;
        final androidx.compose.ui.graphics.painter.Painter painter4;
        final boolean z6;
        final boolean z7;
        final long j7;
        androidx.compose.runtime.ScopeUpdateScope endRestartGroup;
        int i11;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(text, "text");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(backgroundShape, "backgroundShape");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(onClick, "onClick");
        androidx.compose.runtime.Composer startRestartGroup = composer.startRestartGroup(-2051575724);
        if ((i3 & 1) != 0) {
            i4 = i | 6;
        } else if ((i & 6) == 0) {
            i4 = (startRestartGroup.changed(text) ? 4 : 2) | i;
        } else {
            i4 = i;
        }
        if ((i & 48) == 0) {
            if ((i3 & 2) == 0 && startRestartGroup.changedInstance(painter)) {
                i11 = 32;
                i4 |= i11;
            }
            i11 = 16;
            i4 |= i11;
        }
        if ((i3 & 4) != 0) {
            i4 |= 384;
        } else if ((i & 384) == 0) {
            i4 |= startRestartGroup.changed(str) ? 256 : 128;
        }
        if ((i3 & 8) != 0) {
            i4 |= 3072;
        } else if ((i & 3072) == 0) {
            i4 |= startRestartGroup.changed(j) ? 2048 : 1024;
            if ((i3 & 16) == 0) {
                i4 |= 24576;
            } else if ((i & 24576) == 0) {
                i4 |= startRestartGroup.changed(backgroundShape) ? 16384 : 8192;
            }
            if ((i3 & 32) == 0) {
                i5 = i4 | androidx.profileinstaller.ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE;
            } else {
                i5 = i4;
                if ((i & androidx.profileinstaller.ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE) == 0) {
                    i5 |= startRestartGroup.changed(j2) ? 131072 : 65536;
                }
            }
            if ((i3 & 64) == 0) {
                i5 |= 1572864;
            } else if ((i & 1572864) == 0) {
                i5 |= startRestartGroup.changed(j3) ? 1048576 : 524288;
            }
            if ((i3 & 128) == 0) {
                i5 |= 12582912;
            } else if ((i & 12582912) == 0) {
                i5 |= startRestartGroup.changed(j4) ? 8388608 : 4194304;
            }
            i6 = i3 & 256;
            if (i6 == 0) {
                i5 |= 100663296;
            } else if ((i & 100663296) == 0) {
                i5 |= startRestartGroup.changed(z) ? androidx.core.view.accessibility.AccessibilityEventCompat.TYPE_VIEW_TARGETED_BY_SCROLL : 33554432;
            }
            i7 = i3 & 512;
            if (i7 == 0) {
                i5 |= 805306368;
                z3 = z2;
            } else {
                z3 = z2;
                if ((i & 805306368) == 0) {
                    i5 |= startRestartGroup.changed(z3) ? 536870912 : 268435456;
                }
            }
            i8 = i3 & 1024;
            if (i8 == 0) {
                i9 = i2 | 6;
            } else if ((i2 & 6) == 0) {
                i9 = i2 | (startRestartGroup.changed(j5) ? 4 : 2);
            } else {
                i9 = i2;
            }
            if ((i3 & 2048) == 0) {
                i9 |= 48;
            } else if ((i2 & 48) == 0) {
                i9 |= startRestartGroup.changedInstance(onClick) ? 32 : 16;
            }
            if ((i5 & 306783379) != 306783378 && (i9 & 19) == 18 && startRestartGroup.getSkipping()) {
                startRestartGroup.skipToGroupEnd();
                painter4 = painter;
                z6 = z;
                j7 = j5;
                z7 = z3;
                composer2 = startRestartGroup;
            } else {
                startRestartGroup.startDefaults();
                if ((i & 1) != 0 || startRestartGroup.getDefaultsInvalid()) {
                    if ((i3 & 2) == 0) {
                        painter2 = androidx.compose.ui.res.PainterResources_androidKt.painterResource(com.moloco.sdk.R.drawable.double_arrow_24, startRestartGroup, 0);
                        i5 &= -113;
                    } else {
                        painter2 = painter;
                    }
                    boolean z8 = i6 == 0 ? true : z;
                    if (i7 != 0) {
                        z3 = true;
                    }
                    if (i8 == 0) {
                        z4 = z8;
                        j6 = androidx.compose.ui.unit.TextUnit.INSTANCE.m4684getUnspecifiedXSAIIZE();
                    } else {
                        j6 = j5;
                        z4 = z8;
                    }
                    z5 = z3;
                    i10 = i5;
                    painter3 = painter2;
                } else {
                    startRestartGroup.skipToGroupEnd();
                    if ((i3 & 2) != 0) {
                        i5 &= -113;
                    }
                    z4 = z;
                    j6 = j5;
                    z5 = z3;
                    i10 = i5;
                    painter3 = painter;
                }
                startRestartGroup.endDefaults();
                if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                    androidx.compose.runtime.ComposerKt.traceEventStart(-2051575724, i10, i9, "com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.ui.TextIconButton (TextIconButton.kt:48)");
                }
                composer2 = startRestartGroup;
                int i12 = i10 >> 9;
                androidx.compose.material.SurfaceKt.m1511SurfaceFjzlyU(null, backgroundShape, j2, 0L, null, 0.0f, androidx.compose.runtime.internal.ComposableLambdaKt.composableLambda(composer2, -1541935208, true, new com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.ui.x.a(((androidx.compose.ui.unit.Dp) kotlin.comparisons.ComparisonsKt.maxOf(androidx.compose.ui.unit.Dp.m4476boximpl(androidx.compose.ui.unit.DpSize.m4574getHeightD9Ej5fM(j3)), androidx.compose.ui.unit.Dp.m4476boximpl(androidx.compose.ui.unit.DpSize.m4574getHeightD9Ej5fM(j)))).m4492unboximpl(), str, onClick, z4, z5, text, j4, j6, j, painter3)), composer2, (i12 & 112) | 1572864 | (i12 & 896), 57);
                if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                    androidx.compose.runtime.ComposerKt.traceEventEnd();
                }
                painter4 = painter3;
                z6 = z4;
                z7 = z5;
                j7 = j6;
            }
            endRestartGroup = composer2.endRestartGroup();
            if (endRestartGroup == null) {
                endRestartGroup.updateScope(new kotlin.jvm.functions.Function2() { // from class: com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.ui.x$$ExternalSyntheticLambda0
                    @Override // kotlin.jvm.functions.Function2
                    public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                        return com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.ui.x.a(text, painter4, str, j, backgroundShape, j2, j3, j4, z6, z7, j7, onClick, i, i2, i3, (androidx.compose.runtime.Composer) obj, ((java.lang.Integer) obj2).intValue());
                    }
                });
                return;
            }
            return;
        }
        if ((i3 & 16) == 0) {
        }
        if ((i3 & 32) == 0) {
        }
        if ((i3 & 64) == 0) {
        }
        if ((i3 & 128) == 0) {
        }
        i6 = i3 & 256;
        if (i6 == 0) {
        }
        i7 = i3 & 512;
        if (i7 == 0) {
        }
        i8 = i3 & 1024;
        if (i8 == 0) {
        }
        if ((i3 & 2048) == 0) {
        }
        if ((i5 & 306783379) != 306783378) {
        }
        startRestartGroup.startDefaults();
        if ((i & 1) != 0) {
        }
        if ((i3 & 2) == 0) {
        }
        if (i6 == 0) {
        }
        if (i7 != 0) {
        }
        if (i8 == 0) {
        }
        z5 = z3;
        i10 = i5;
        painter3 = painter2;
        startRestartGroup.endDefaults();
        if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
        }
        composer2 = startRestartGroup;
        int i122 = i10 >> 9;
        androidx.compose.material.SurfaceKt.m1511SurfaceFjzlyU(null, backgroundShape, j2, 0L, null, 0.0f, androidx.compose.runtime.internal.ComposableLambdaKt.composableLambda(composer2, -1541935208, true, new com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.ui.x.a(((androidx.compose.ui.unit.Dp) kotlin.comparisons.ComparisonsKt.maxOf(androidx.compose.ui.unit.Dp.m4476boximpl(androidx.compose.ui.unit.DpSize.m4574getHeightD9Ej5fM(j3)), androidx.compose.ui.unit.Dp.m4476boximpl(androidx.compose.ui.unit.DpSize.m4574getHeightD9Ej5fM(j)))).m4492unboximpl(), str, onClick, z4, z5, text, j4, j6, j, painter3)), composer2, (i122 & 112) | 1572864 | (i122 & 896), 57);
        if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
        }
        painter4 = painter3;
        z6 = z4;
        z7 = z5;
        j7 = j6;
        endRestartGroup = composer2.endRestartGroup();
        if (endRestartGroup == null) {
        }
    }

    public static final void a(androidx.compose.runtime.Composer composer, final int i) {
        androidx.compose.runtime.Composer startRestartGroup = composer.startRestartGroup(-863217207);
        if (i == 0 && startRestartGroup.getSkipping()) {
            startRestartGroup.skipToGroupEnd();
        } else {
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventStart(-863217207, i, -1, "com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.ui.TextIconButtonPreview (TextIconButton.kt:105)");
            }
            com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.ui.theme.c.a(false, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.ui.o.f7644a.a(), startRestartGroup, 48, 1);
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventEnd();
            }
        }
        androidx.compose.runtime.ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new kotlin.jvm.functions.Function2() { // from class: com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.ui.x$$ExternalSyntheticLambda1
                @Override // kotlin.jvm.functions.Function2
                public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                    return com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.ui.x.a(i, (androidx.compose.runtime.Composer) obj, ((java.lang.Integer) obj2).intValue());
                }
            });
        }
    }
}
