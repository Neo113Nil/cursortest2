package com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.ui;

/* loaded from: classes5.dex */
public final class r {

    /* renamed from: a, reason: collision with root package name */
    public static final long f7649a = androidx.compose.ui.graphics.ColorKt.Color$default(71, 118, 238, 0, 8, null);
    public static final long b = androidx.compose.ui.graphics.Color.INSTANCE.m2150getWhite0d7_KjU();

    public static final class a implements kotlin.jvm.functions.Function3<androidx.compose.foundation.layout.RowScope, androidx.compose.runtime.Composer, java.lang.Integer, kotlin.Unit> {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ java.lang.String f7650a;
        public final /* synthetic */ java.lang.Integer b;
        public final /* synthetic */ long c;

        public a(java.lang.String str, java.lang.Integer num, long j) {
            this.f7650a = str;
            this.b = num;
            this.c = j;
        }

        public final void a(androidx.compose.foundation.layout.RowScope Button, androidx.compose.runtime.Composer composer, int i) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(Button, "$this$Button");
            if ((i & 17) == 16 && composer.getSkipping()) {
                composer.skipToGroupEnd();
                return;
            }
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventStart(-469621531, i, -1, "com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.ui.RotatingGradientButton.<anonymous> (DEC.kt:230)");
            }
            java.lang.String str = this.f7650a;
            if (str == null) {
                str = "";
            }
            java.lang.Integer num = this.b;
            androidx.compose.ui.unit.TextUnit m4663boximpl = num != null ? androidx.compose.ui.unit.TextUnit.m4663boximpl(androidx.compose.ui.unit.TextUnitKt.getSp(num.intValue())) : null;
            composer.startReplaceableGroup(-1245056940);
            long m3995getFontSizeXSAIIZE = m4663boximpl == null ? androidx.compose.material.MaterialTheme.INSTANCE.getTypography(composer, androidx.compose.material.MaterialTheme.$stable).getButton().m3995getFontSizeXSAIIZE() : m4663boximpl.getPackedValue();
            composer.endReplaceableGroup();
            androidx.compose.material.TextKt.m1582TextfLXpl1I(str, null, this.c, m3995getFontSizeXSAIIZE, null, androidx.compose.ui.text.font.FontWeight.INSTANCE.getBold(), null, 0L, null, null, 0L, androidx.compose.ui.text.style.TextOverflow.INSTANCE.m4410getEllipsisgIe3tQ8(), false, 1, null, null, composer, androidx.profileinstaller.ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE, 3120, 55250);
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

    public static final kotlin.Unit a(androidx.compose.ui.Modifier modifier, java.lang.String str, kotlin.jvm.functions.Function0 function0, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.C3461q c3461q, int i, int i2, androidx.compose.runtime.Composer composer, int i3) {
        a(modifier, str, function0, c3461q, composer, androidx.compose.runtime.RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
        return kotlin.Unit.INSTANCE;
    }

    public static final kotlin.Unit a(int i, androidx.compose.runtime.Composer composer, int i2) {
        a(composer, androidx.compose.runtime.RecomposeScopeImplKt.updateChangedFlags(i | 1));
        return kotlin.Unit.INSTANCE;
    }

    public static final kotlin.Unit a(java.lang.String str, kotlin.jvm.functions.Function0 function0, java.lang.Integer num, java.lang.Integer num2, java.util.List list, boolean z, long j, long j2, int i, boolean z2, int i2, int i3, androidx.compose.runtime.Composer composer, int i4) {
        a(str, function0, num, num2, list, z, j, j2, i, z2, composer, androidx.compose.runtime.RecomposeScopeImplKt.updateChangedFlags(i2 | 1), i3);
        return kotlin.Unit.INSTANCE;
    }

    /* JADX WARN: Code restructure failed: missing block: B:69:0x02a6, code lost:
    
        if (r0 == null) goto L104;
     */
    /* JADX WARN: Code restructure failed: missing block: B:70:0x02a9, code lost:
    
        if (r0 == null) goto L108;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void a(androidx.compose.ui.Modifier modifier, final java.lang.String str, final kotlin.jvm.functions.Function0<kotlin.Unit> onClick, final com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.C3461q decRenderingData, androidx.compose.runtime.Composer composer, final int i, final int i2) {
        androidx.compose.ui.Modifier modifier2;
        int i3;
        float m4478constructorimpl;
        androidx.compose.ui.Modifier modifier3;
        float m4478constructorimpl2;
        androidx.compose.ui.Modifier.Companion companion;
        androidx.compose.runtime.Composer composer2;
        java.lang.Float f;
        int i4;
        int i5;
        float m4478constructorimpl3;
        androidx.compose.runtime.Composer composer3;
        androidx.compose.ui.Modifier.Companion companion2;
        float m4478constructorimpl4;
        java.lang.String str2;
        final androidx.compose.ui.Modifier modifier4;
        java.lang.Integer c;
        java.lang.String h;
        java.lang.String m;
        java.lang.Integer n;
        java.lang.String f2;
        java.lang.String h2;
        java.lang.Integer c2;
        java.util.List<java.lang.String> d;
        java.lang.Integer f3;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(onClick, "onClick");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(decRenderingData, "decRenderingData");
        androidx.compose.runtime.Composer startRestartGroup = composer.startRestartGroup(-264197625);
        int i6 = i2 & 1;
        if (i6 != 0) {
            i3 = i | 6;
            modifier2 = modifier;
        } else if ((i & 6) == 0) {
            modifier2 = modifier;
            i3 = (startRestartGroup.changed(modifier2) ? 4 : 2) | i;
        } else {
            modifier2 = modifier;
            i3 = i;
        }
        if ((i2 & 2) != 0) {
            i3 |= 48;
        } else if ((i & 48) == 0) {
            i3 |= startRestartGroup.changed(str) ? 32 : 16;
        }
        if ((i2 & 4) != 0) {
            i3 |= 384;
        } else if ((i & 384) == 0) {
            i3 |= startRestartGroup.changedInstance(onClick) ? 256 : 128;
        }
        if ((i2 & 8) != 0) {
            i3 |= 3072;
        } else if ((i & 3072) == 0) {
            i3 |= startRestartGroup.changedInstance(decRenderingData) ? 2048 : 1024;
        }
        int i7 = i3;
        if ((i7 & 1171) == 1170 && startRestartGroup.getSkipping()) {
            startRestartGroup.skipToGroupEnd();
            modifier4 = modifier2;
            composer3 = startRestartGroup;
        } else {
            androidx.compose.ui.Modifier modifier5 = i6 != 0 ? androidx.compose.ui.Modifier.INSTANCE : modifier2;
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventStart(-264197625, i7, -1, "com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.ui.DEC (DEC.kt:58)");
            }
            androidx.compose.ui.Modifier modifier6 = modifier5;
            androidx.compose.ui.Modifier m246clickableXHw0xAI$default = androidx.compose.foundation.ClickableKt.m246clickableXHw0xAI$default(androidx.compose.foundation.layout.SizeKt.fillMaxSize$default(modifier5, 0.0f, 1, null), false, null, null, onClick, 7, null);
            startRestartGroup.startReplaceableGroup(733328855);
            androidx.compose.ui.Alignment.Companion companion3 = androidx.compose.ui.Alignment.INSTANCE;
            androidx.compose.ui.layout.MeasurePolicy rememberBoxMeasurePolicy = androidx.compose.foundation.layout.BoxKt.rememberBoxMeasurePolicy(companion3.getTopStart(), false, startRestartGroup, 0);
            startRestartGroup.startReplaceableGroup(-1323940314);
            int currentCompositeKeyHash = androidx.compose.runtime.ComposablesKt.getCurrentCompositeKeyHash(startRestartGroup, 0);
            androidx.compose.runtime.CompositionLocalMap currentCompositionLocalMap = startRestartGroup.getCurrentCompositionLocalMap();
            androidx.compose.ui.node.ComposeUiNode.Companion companion4 = androidx.compose.ui.node.ComposeUiNode.INSTANCE;
            kotlin.jvm.functions.Function0<androidx.compose.ui.node.ComposeUiNode> constructor = companion4.getConstructor();
            kotlin.jvm.functions.Function3<androidx.compose.runtime.SkippableUpdater<androidx.compose.ui.node.ComposeUiNode>, androidx.compose.runtime.Composer, java.lang.Integer, kotlin.Unit> modifierMaterializerOf = androidx.compose.ui.layout.LayoutKt.modifierMaterializerOf(m246clickableXHw0xAI$default);
            if (!(startRestartGroup.getApplier() instanceof androidx.compose.runtime.Applier)) {
                androidx.compose.runtime.ComposablesKt.invalidApplier();
            }
            startRestartGroup.startReusableNode();
            if (startRestartGroup.getInserting()) {
                startRestartGroup.createNode(constructor);
            } else {
                startRestartGroup.useNode();
            }
            androidx.compose.runtime.Composer m1641constructorimpl = androidx.compose.runtime.Updater.m1641constructorimpl(startRestartGroup);
            androidx.compose.runtime.Updater.m1648setimpl(m1641constructorimpl, rememberBoxMeasurePolicy, companion4.getSetMeasurePolicy());
            androidx.compose.runtime.Updater.m1648setimpl(m1641constructorimpl, currentCompositionLocalMap, companion4.getSetResolvedCompositionLocals());
            kotlin.jvm.functions.Function2<androidx.compose.ui.node.ComposeUiNode, java.lang.Integer, kotlin.Unit> setCompositeKeyHash = companion4.getSetCompositeKeyHash();
            if (m1641constructorimpl.getInserting() || !kotlin.jvm.internal.Intrinsics.areEqual(m1641constructorimpl.rememberedValue(), java.lang.Integer.valueOf(currentCompositeKeyHash))) {
                m1641constructorimpl.updateRememberedValue(java.lang.Integer.valueOf(currentCompositeKeyHash));
                m1641constructorimpl.apply(java.lang.Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
            }
            modifierMaterializerOf.invoke(androidx.compose.runtime.SkippableUpdater.m1632boximpl(androidx.compose.runtime.SkippableUpdater.m1633constructorimpl(startRestartGroup)), startRestartGroup, 0);
            startRestartGroup.startReplaceableGroup(2058660585);
            androidx.compose.foundation.layout.BoxScopeInstance boxScopeInstance = androidx.compose.foundation.layout.BoxScopeInstance.INSTANCE;
            androidx.compose.ui.Modifier.Companion companion5 = androidx.compose.ui.Modifier.INSTANCE;
            androidx.compose.ui.Modifier fillMaxSize$default = androidx.compose.foundation.layout.SizeKt.fillMaxSize$default(companion5, 0.0f, 1, null);
            androidx.compose.foundation.layout.Arrangement.HorizontalOrVertical center = androidx.compose.foundation.layout.Arrangement.INSTANCE.getCenter();
            androidx.compose.ui.Alignment.Horizontal centerHorizontally = companion3.getCenterHorizontally();
            startRestartGroup.startReplaceableGroup(-483455358);
            androidx.compose.ui.layout.MeasurePolicy columnMeasurePolicy = androidx.compose.foundation.layout.ColumnKt.columnMeasurePolicy(center, centerHorizontally, startRestartGroup, 54);
            startRestartGroup.startReplaceableGroup(-1323940314);
            int currentCompositeKeyHash2 = androidx.compose.runtime.ComposablesKt.getCurrentCompositeKeyHash(startRestartGroup, 0);
            androidx.compose.runtime.CompositionLocalMap currentCompositionLocalMap2 = startRestartGroup.getCurrentCompositionLocalMap();
            kotlin.jvm.functions.Function0<androidx.compose.ui.node.ComposeUiNode> constructor2 = companion4.getConstructor();
            kotlin.jvm.functions.Function3<androidx.compose.runtime.SkippableUpdater<androidx.compose.ui.node.ComposeUiNode>, androidx.compose.runtime.Composer, java.lang.Integer, kotlin.Unit> modifierMaterializerOf2 = androidx.compose.ui.layout.LayoutKt.modifierMaterializerOf(fillMaxSize$default);
            if (!(startRestartGroup.getApplier() instanceof androidx.compose.runtime.Applier)) {
                androidx.compose.runtime.ComposablesKt.invalidApplier();
            }
            startRestartGroup.startReusableNode();
            if (startRestartGroup.getInserting()) {
                startRestartGroup.createNode(constructor2);
            } else {
                startRestartGroup.useNode();
            }
            androidx.compose.runtime.Composer m1641constructorimpl2 = androidx.compose.runtime.Updater.m1641constructorimpl(startRestartGroup);
            androidx.compose.runtime.Updater.m1648setimpl(m1641constructorimpl2, columnMeasurePolicy, companion4.getSetMeasurePolicy());
            androidx.compose.runtime.Updater.m1648setimpl(m1641constructorimpl2, currentCompositionLocalMap2, companion4.getSetResolvedCompositionLocals());
            kotlin.jvm.functions.Function2<androidx.compose.ui.node.ComposeUiNode, java.lang.Integer, kotlin.Unit> setCompositeKeyHash2 = companion4.getSetCompositeKeyHash();
            if (m1641constructorimpl2.getInserting() || !kotlin.jvm.internal.Intrinsics.areEqual(m1641constructorimpl2.rememberedValue(), java.lang.Integer.valueOf(currentCompositeKeyHash2))) {
                m1641constructorimpl2.updateRememberedValue(java.lang.Integer.valueOf(currentCompositeKeyHash2));
                m1641constructorimpl2.apply(java.lang.Integer.valueOf(currentCompositeKeyHash2), setCompositeKeyHash2);
            }
            modifierMaterializerOf2.invoke(androidx.compose.runtime.SkippableUpdater.m1632boximpl(androidx.compose.runtime.SkippableUpdater.m1633constructorimpl(startRestartGroup)), startRestartGroup, 0);
            startRestartGroup.startReplaceableGroup(2058660585);
            androidx.compose.foundation.layout.ColumnScopeInstance columnScopeInstance = androidx.compose.foundation.layout.ColumnScopeInstance.INSTANCE;
            com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.C3454j f4 = decRenderingData.f();
            if (f4 != null && (f3 = f4.f()) != null) {
                m4478constructorimpl = androidx.compose.ui.unit.Dp.m4478constructorimpl(f3.intValue());
            } else {
                m4478constructorimpl = androidx.compose.ui.unit.Dp.m4478constructorimpl(128);
            }
            com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.C3454j f5 = decRenderingData.f();
            java.lang.String d2 = f5 != null ? f5.d() : null;
            com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.C3454j f6 = decRenderingData.f();
            com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.C3455k e = f6 != null ? f6.e() : null;
            float m4478constructorimpl5 = androidx.compose.ui.unit.Dp.m4478constructorimpl(28);
            androidx.compose.ui.Modifier zIndex = androidx.compose.ui.ZIndexModifierKt.zIndex(androidx.compose.foundation.layout.SizeKt.m617size3ABfNKs(companion5, m4478constructorimpl), 1.0f);
            if (e != null && (d = e.d()) != null) {
                java.util.List listOf = d.isEmpty() ^ true ? kotlin.collections.CollectionsKt.listOf((java.lang.Object[]) new androidx.compose.ui.graphics.Color[]{androidx.compose.ui.graphics.Color.m2103boximpl(androidx.compose.ui.graphics.ColorKt.Color(android.graphics.Color.parseColor((java.lang.String) kotlin.collections.CollectionsKt.first((java.util.List) d)))), androidx.compose.ui.graphics.Color.m2103boximpl(androidx.compose.ui.graphics.ColorKt.Color(android.graphics.Color.parseColor((java.lang.String) kotlin.collections.CollectionsKt.last((java.util.List) d))))}) : null;
                if (listOf != null) {
                    androidx.compose.ui.graphics.Brush.Companion companion6 = androidx.compose.ui.graphics.Brush.INSTANCE;
                    androidx.compose.ui.geometry.Offset.Companion companion7 = androidx.compose.ui.geometry.Offset.INSTANCE;
                    modifier3 = androidx.compose.foundation.BackgroundKt.background$default(companion5, androidx.compose.ui.graphics.Brush.Companion.m2064linearGradientmHitzGk$default(companion6, listOf, companion7.m1887getZeroF1C5BW0(), companion7.m1885getInfiniteF1C5BW0(), 0, 8, (java.lang.Object) null), androidx.compose.foundation.shape.RoundedCornerShapeKt.m846RoundedCornerShape0680j_4(m4478constructorimpl5), 0.0f, 4, null);
                }
                modifier3 = companion5;
            }
            modifier3 = companion5;
            androidx.compose.ui.Modifier then = zIndex.then(modifier3);
            if (e != null && (c2 = e.c()) != null) {
                m4478constructorimpl2 = androidx.compose.ui.unit.Dp.m4478constructorimpl(c2.intValue());
            } else {
                m4478constructorimpl2 = androidx.compose.ui.unit.Dp.m4478constructorimpl(4);
            }
            androidx.compose.ui.Modifier clip = androidx.compose.ui.draw.ClipKt.clip(androidx.compose.foundation.layout.PaddingKt.m568padding3ABfNKs(then, m4478constructorimpl2), (e != null ? e.d() : null) != null ? androidx.compose.foundation.shape.RoundedCornerShapeKt.m846RoundedCornerShape0680j_4(m4478constructorimpl5) : androidx.compose.foundation.shape.RoundedCornerShapeKt.m846RoundedCornerShape0680j_4(androidx.compose.ui.unit.Dp.m4478constructorimpl(0)));
            startRestartGroup.startReplaceableGroup(733328855);
            androidx.compose.ui.layout.MeasurePolicy rememberBoxMeasurePolicy2 = androidx.compose.foundation.layout.BoxKt.rememberBoxMeasurePolicy(companion3.getTopStart(), false, startRestartGroup, 0);
            startRestartGroup.startReplaceableGroup(-1323940314);
            int currentCompositeKeyHash3 = androidx.compose.runtime.ComposablesKt.getCurrentCompositeKeyHash(startRestartGroup, 0);
            androidx.compose.runtime.CompositionLocalMap currentCompositionLocalMap3 = startRestartGroup.getCurrentCompositionLocalMap();
            kotlin.jvm.functions.Function0<androidx.compose.ui.node.ComposeUiNode> constructor3 = companion4.getConstructor();
            kotlin.jvm.functions.Function3<androidx.compose.runtime.SkippableUpdater<androidx.compose.ui.node.ComposeUiNode>, androidx.compose.runtime.Composer, java.lang.Integer, kotlin.Unit> modifierMaterializerOf3 = androidx.compose.ui.layout.LayoutKt.modifierMaterializerOf(clip);
            if (!(startRestartGroup.getApplier() instanceof androidx.compose.runtime.Applier)) {
                androidx.compose.runtime.ComposablesKt.invalidApplier();
            }
            startRestartGroup.startReusableNode();
            if (startRestartGroup.getInserting()) {
                startRestartGroup.createNode(constructor3);
            } else {
                startRestartGroup.useNode();
            }
            androidx.compose.runtime.Composer m1641constructorimpl3 = androidx.compose.runtime.Updater.m1641constructorimpl(startRestartGroup);
            androidx.compose.runtime.Updater.m1648setimpl(m1641constructorimpl3, rememberBoxMeasurePolicy2, companion4.getSetMeasurePolicy());
            androidx.compose.runtime.Updater.m1648setimpl(m1641constructorimpl3, currentCompositionLocalMap3, companion4.getSetResolvedCompositionLocals());
            kotlin.jvm.functions.Function2<androidx.compose.ui.node.ComposeUiNode, java.lang.Integer, kotlin.Unit> setCompositeKeyHash3 = companion4.getSetCompositeKeyHash();
            if (m1641constructorimpl3.getInserting() || !kotlin.jvm.internal.Intrinsics.areEqual(m1641constructorimpl3.rememberedValue(), java.lang.Integer.valueOf(currentCompositeKeyHash3))) {
                m1641constructorimpl3.updateRememberedValue(java.lang.Integer.valueOf(currentCompositeKeyHash3));
                m1641constructorimpl3.apply(java.lang.Integer.valueOf(currentCompositeKeyHash3), setCompositeKeyHash3);
            }
            modifierMaterializerOf3.invoke(androidx.compose.runtime.SkippableUpdater.m1632boximpl(androidx.compose.runtime.SkippableUpdater.m1633constructorimpl(startRestartGroup)), startRestartGroup, 0);
            startRestartGroup.startReplaceableGroup(2058660585);
            com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.ui.k.a(d2, androidx.compose.ui.layout.ContentScale.INSTANCE.getCrop(), androidx.compose.foundation.layout.SizeKt.m617size3ABfNKs(companion5, m4478constructorimpl), startRestartGroup, 48);
            startRestartGroup.endReplaceableGroup();
            startRestartGroup.endNode();
            startRestartGroup.endReplaceableGroup();
            startRestartGroup.endReplaceableGroup();
            startRestartGroup.startReplaceableGroup(1049067275);
            if (str != null) {
                androidx.compose.foundation.layout.SpacerKt.Spacer(androidx.compose.foundation.layout.SizeKt.m603height3ABfNKs(companion5, androidx.compose.ui.unit.Dp.m4478constructorimpl(12)), startRestartGroup, 6);
                long m2150getWhite0d7_KjU = androidx.compose.ui.graphics.Color.INSTANCE.m2150getWhite0d7_KjU();
                java.lang.Integer e2 = decRenderingData.e();
                androidx.compose.ui.unit.TextUnit m4663boximpl = e2 != null ? androidx.compose.ui.unit.TextUnit.m4663boximpl(androidx.compose.ui.unit.TextUnitKt.getSp(e2.intValue())) : null;
                startRestartGroup.startReplaceableGroup(1049073645);
                long m3995getFontSizeXSAIIZE = m4663boximpl == null ? androidx.compose.material.MaterialTheme.INSTANCE.getTypography(startRestartGroup, androidx.compose.material.MaterialTheme.$stable).getButton().m3995getFontSizeXSAIIZE() : m4663boximpl.getPackedValue();
                startRestartGroup.endReplaceableGroup();
                companion = companion5;
                f = null;
                i4 = 2;
                composer2 = startRestartGroup;
                androidx.compose.material.TextKt.m1582TextfLXpl1I(str, null, m2150getWhite0d7_KjU, m3995getFontSizeXSAIIZE, null, androidx.compose.ui.text.font.FontWeight.INSTANCE.getBold(), null, 0L, null, null, 0L, androidx.compose.ui.text.style.TextOverflow.INSTANCE.m4410getEllipsisgIe3tQ8(), false, 2, null, null, composer2, ((i7 >> 3) & 14) | 196992, 3120, 55250);
            } else {
                companion = companion5;
                composer2 = startRestartGroup;
                f = null;
                i4 = 2;
            }
            composer2.endReplaceableGroup();
            if (decRenderingData.h() != null) {
                m4478constructorimpl3 = androidx.compose.ui.unit.Dp.m4478constructorimpl(r0.i());
                i5 = 12;
            } else {
                i5 = 12;
                m4478constructorimpl3 = androidx.compose.ui.unit.Dp.m4478constructorimpl(12);
            }
            com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.C3460p h3 = decRenderingData.h();
            long m2151getYellow0d7_KjU = (h3 == null || (h2 = h3.h()) == null) ? androidx.compose.ui.graphics.Color.INSTANCE.m2151getYellow0d7_KjU() : androidx.compose.ui.graphics.ColorKt.Color(android.graphics.Color.parseColor(h2));
            com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.C3460p h4 = decRenderingData.h();
            long m2143getGray0d7_KjU = (h4 == null || (f2 = h4.f()) == null) ? androidx.compose.ui.graphics.Color.INSTANCE.m2143getGray0d7_KjU() : androidx.compose.ui.graphics.ColorKt.Color(android.graphics.Color.parseColor(f2));
            com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.C3460p h5 = decRenderingData.h();
            int g = h5 != null ? h5.g() : 9;
            com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.C3460p h6 = decRenderingData.h();
            java.lang.Float j = h6 != null ? h6.j() : f;
            composer3 = composer2;
            composer3.startReplaceableGroup(1049096610);
            if (j == null) {
                companion2 = companion;
            } else {
                float floatValue = j.floatValue();
                companion2 = companion;
                androidx.compose.foundation.layout.SpacerKt.Spacer(androidx.compose.foundation.layout.SizeKt.m603height3ABfNKs(companion2, androidx.compose.ui.unit.Dp.m4478constructorimpl(i5)), composer3, 6);
                com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.ui.w.a(floatValue, 5, m4478constructorimpl3, m2151getYellow0d7_KjU, m2143getGray0d7_KjU, g, null, composer3, 48, 64);
                kotlin.Unit unit = kotlin.Unit.INSTANCE;
            }
            composer3.endReplaceableGroup();
            com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.C3456l g2 = decRenderingData.g();
            if (g2 != null && (n = g2.n()) != null) {
                m4478constructorimpl4 = androidx.compose.ui.unit.Dp.m4478constructorimpl(n.intValue());
            } else {
                m4478constructorimpl4 = androidx.compose.ui.unit.Dp.m4478constructorimpl(8);
            }
            androidx.compose.foundation.layout.SpacerKt.Spacer(androidx.compose.foundation.layout.SizeKt.m603height3ABfNKs(companion2, m4478constructorimpl4), composer3, 0);
            com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.C3456l g3 = decRenderingData.g();
            if (g3 == null || (str2 = g3.k()) == null) {
                str2 = "GET";
            }
            com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.C3456l g4 = decRenderingData.g();
            java.lang.Integer j2 = g4 != null ? g4.j() : f;
            com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.C3456l g5 = decRenderingData.g();
            java.lang.Integer l = g5 != null ? g5.l() : f;
            com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.C3456l g6 = decRenderingData.g();
            com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.C3455k i8 = g6 != null ? g6.i() : f;
            com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.C3456l g7 = decRenderingData.g();
            long Color = (g7 == null || (m = g7.m()) == null) ? b : androidx.compose.ui.graphics.ColorKt.Color(android.graphics.Color.parseColor(m));
            com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.C3456l g8 = decRenderingData.g();
            long Color2 = (g8 == null || (h = g8.h()) == null) ? f7649a : androidx.compose.ui.graphics.ColorKt.Color(android.graphics.Color.parseColor(h));
            java.util.List<java.lang.String> d3 = i8 != null ? i8.d() : f;
            boolean z = i8 != null;
            if (i8 != null && (c = i8.c()) != null) {
                i4 = c.intValue();
            }
            a(str2, onClick, j2, l, d3, z, Color, Color2, i4, false, composer3, (i7 >> 3) & 112, 512);
            composer3.endReplaceableGroup();
            composer3.endNode();
            composer3.endReplaceableGroup();
            composer3.endReplaceableGroup();
            composer3.endReplaceableGroup();
            composer3.endNode();
            composer3.endReplaceableGroup();
            composer3.endReplaceableGroup();
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventEnd();
            }
            modifier4 = modifier6;
        }
        androidx.compose.runtime.ScopeUpdateScope endRestartGroup = composer3.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new kotlin.jvm.functions.Function2() { // from class: com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.ui.r$$ExternalSyntheticLambda2
                @Override // kotlin.jvm.functions.Function2
                public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                    return com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.ui.r.a(androidx.compose.ui.Modifier.this, str, onClick, decRenderingData, i, i2, (androidx.compose.runtime.Composer) obj, ((java.lang.Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:28:0x00ec  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0105  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x02ee  */
    /* JADX WARN: Removed duplicated region for block: B:42:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:44:0x0137  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0142  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x014f  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x027a  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x02e3  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x0287  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x018d  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x013a  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x010a  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x00ef  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void a(final java.lang.String str, final kotlin.jvm.functions.Function0<kotlin.Unit> onClick, final java.lang.Integer num, final java.lang.Integer num2, final java.util.List<java.lang.String> list, final boolean z, final long j, final long j2, final int i, boolean z2, androidx.compose.runtime.Composer composer, final int i2, final int i3) {
        int i4;
        int i5;
        boolean z3;
        androidx.compose.runtime.State state;
        java.util.List listOf;
        androidx.compose.runtime.Composer composer2;
        final boolean z4;
        androidx.compose.runtime.ScopeUpdateScope endRestartGroup;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(onClick, "onClick");
        androidx.compose.runtime.Composer startRestartGroup = composer.startRestartGroup(1721864917);
        if ((i3 & 1) != 0) {
            i4 = i2 | 6;
        } else if ((i2 & 6) == 0) {
            i4 = (startRestartGroup.changed(str) ? 4 : 2) | i2;
        } else {
            i4 = i2;
        }
        if ((i3 & 2) != 0) {
            i4 |= 48;
        } else if ((i2 & 48) == 0) {
            i4 |= startRestartGroup.changedInstance(onClick) ? 32 : 16;
        }
        if ((i3 & 4) != 0) {
            i4 |= 384;
        } else if ((i2 & 384) == 0) {
            i4 |= startRestartGroup.changed(num) ? 256 : 128;
        }
        if ((i3 & 8) != 0) {
            i4 |= 3072;
        } else if ((i2 & 3072) == 0) {
            i4 |= startRestartGroup.changed(num2) ? 2048 : 1024;
        }
        if ((i3 & 16) != 0) {
            i4 |= 24576;
        } else if ((i2 & 24576) == 0) {
            i4 |= startRestartGroup.changedInstance(list) ? 16384 : 8192;
        }
        if ((i3 & 32) != 0) {
            i4 |= androidx.profileinstaller.ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE;
        } else if ((i2 & androidx.profileinstaller.ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE) == 0) {
            i4 |= startRestartGroup.changed(z) ? 131072 : 65536;
        }
        if ((i3 & 64) != 0) {
            i4 |= 1572864;
        } else if ((i2 & 1572864) == 0) {
            i4 |= startRestartGroup.changed(j) ? 1048576 : 524288;
        }
        if ((i3 & 128) != 0) {
            i4 |= 12582912;
        } else if ((i2 & 12582912) == 0) {
            i4 |= startRestartGroup.changed(j2) ? 8388608 : 4194304;
            if ((i3 & 256) == 0) {
                i4 |= 100663296;
            } else if ((i2 & 100663296) == 0) {
                i4 |= startRestartGroup.changed(i) ? androidx.core.view.accessibility.AccessibilityEventCompat.TYPE_VIEW_TARGETED_BY_SCROLL : 33554432;
            }
            i5 = i3 & 512;
            if (i5 == 0) {
                i4 |= 805306368;
            } else if ((i2 & 805306368) == 0) {
                i4 |= startRestartGroup.changed(z2) ? 536870912 : 268435456;
            }
            if ((306783379 & i4) != 306783378 && startRestartGroup.getSkipping()) {
                startRestartGroup.skipToGroupEnd();
                z4 = z2;
                composer2 = startRestartGroup;
            } else {
                z3 = i5 == 0 ? false : z2;
                if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                    androidx.compose.runtime.ComposerKt.traceEventStart(1721864917, i4, -1, "com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.ui.RotatingGradientButton (DEC.kt:176)");
                }
                if (!z3) {
                    startRestartGroup.startReplaceableGroup(-1672286657);
                    state = androidx.compose.animation.core.InfiniteTransitionKt.animateFloat(androidx.compose.animation.core.InfiniteTransitionKt.rememberInfiniteTransition(null, startRestartGroup, 0, 1), 0.0f, 360.0f, androidx.compose.animation.core.AnimationSpecKt.m128infiniteRepeatable9IiC70o$default(androidx.compose.animation.core.AnimationSpecKt.tween$default(com.vungle.ads.internal.protos.Sdk.SDKError.Reason.VUNGLE_OIT_CREATION_ERROR_VALUE, 0, androidx.compose.animation.core.EasingKt.getLinearEasing(), 2, null), androidx.compose.animation.core.RepeatMode.Restart, 0L, 4, null), null, startRestartGroup, androidx.compose.animation.core.InfiniteTransition.$stable | 432 | (androidx.compose.animation.core.InfiniteRepeatableSpec.$stable << 9), 8);
                    startRestartGroup.endReplaceableGroup();
                } else {
                    startRestartGroup.startReplaceableGroup(-1671934187);
                    startRestartGroup.startReplaceableGroup(2024277948);
                    java.lang.Object rememberedValue = startRestartGroup.rememberedValue();
                    if (rememberedValue == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                        rememberedValue = androidx.compose.runtime.SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(java.lang.Float.valueOf(0.0f), null, 2, null);
                        startRestartGroup.updateRememberedValue(rememberedValue);
                    }
                    state = (androidx.compose.runtime.MutableState) rememberedValue;
                    startRestartGroup.endReplaceableGroup();
                    startRestartGroup.endReplaceableGroup();
                }
                double radians = java.lang.Math.toRadians(a(state));
                int i6 = i4;
                long Offset = androidx.compose.ui.geometry.OffsetKt.Offset(((float) java.lang.Math.cos(radians)) * 300.0f, ((float) java.lang.Math.sin(radians)) * 300.0f);
                double d = radians + 3.141592653589793d;
                long Offset2 = androidx.compose.ui.geometry.OffsetKt.Offset(((float) java.lang.Math.cos(d)) * 300.0f, ((float) java.lang.Math.sin(d)) * 300.0f);
                if (list == null && !list.isEmpty()) {
                    listOf = kotlin.collections.CollectionsKt.listOf((java.lang.Object[]) new androidx.compose.ui.graphics.Color[]{androidx.compose.ui.graphics.Color.m2103boximpl(androidx.compose.ui.graphics.ColorKt.Color(android.graphics.Color.parseColor((java.lang.String) kotlin.collections.CollectionsKt.first((java.util.List) list)))), androidx.compose.ui.graphics.Color.m2103boximpl(androidx.compose.ui.graphics.ColorKt.Color(android.graphics.Color.parseColor((java.lang.String) kotlin.collections.CollectionsKt.last((java.util.List) list))))});
                } else {
                    long j3 = f7649a;
                    listOf = kotlin.collections.CollectionsKt.listOf((java.lang.Object[]) new androidx.compose.ui.graphics.Color[]{androidx.compose.ui.graphics.Color.m2103boximpl(j3), androidx.compose.ui.graphics.Color.m2103boximpl(j3)});
                }
                androidx.compose.ui.graphics.Brush m2064linearGradientmHitzGk$default = androidx.compose.ui.graphics.Brush.Companion.m2064linearGradientmHitzGk$default(androidx.compose.ui.graphics.Brush.INSTANCE, listOf, Offset, Offset2, 0, 8, (java.lang.Object) null);
                androidx.compose.foundation.shape.RoundedCornerShape circleShape = androidx.compose.foundation.shape.RoundedCornerShapeKt.getCircleShape();
                androidx.compose.material.ButtonColors m1265buttonColorsro_MJ88 = androidx.compose.material.ButtonDefaults.INSTANCE.m1265buttonColorsro_MJ88(j2, j, 0L, 0L, startRestartGroup, ((i6 >> 21) & 14) | ((i6 >> 15) & 112) | (androidx.compose.material.ButtonDefaults.$stable << 12), 12);
                androidx.compose.foundation.BorderStroke borderStroke = !z ? new androidx.compose.foundation.BorderStroke(androidx.compose.ui.unit.Dp.m4478constructorimpl(i), m2064linearGradientmHitzGk$default, null) : null;
                if (num != null || (r2 = androidx.compose.foundation.layout.SizeKt.m619sizeVpY3zN4(androidx.compose.ui.Modifier.INSTANCE, androidx.compose.ui.unit.Dp.m4478constructorimpl(num.intValue()), androidx.compose.ui.unit.Dp.m4478constructorimpl(num.intValue() * 0.33f))) == null) {
                    androidx.compose.ui.Modifier modifier = androidx.compose.ui.Modifier.INSTANCE;
                }
                composer2 = startRestartGroup;
                androidx.compose.material.ButtonKt.Button(onClick, modifier, false, null, null, circleShape, borderStroke, m1265buttonColorsro_MJ88, null, androidx.compose.runtime.internal.ComposableLambdaKt.composableLambda(startRestartGroup, -469621531, true, new com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.ui.r.a(str, num2, j)), composer2, ((i6 >> 3) & 14) | 805306368, 284);
                if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                    androidx.compose.runtime.ComposerKt.traceEventEnd();
                }
                z4 = z3;
            }
            endRestartGroup = composer2.endRestartGroup();
            if (endRestartGroup == null) {
                endRestartGroup.updateScope(new kotlin.jvm.functions.Function2() { // from class: com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.ui.r$$ExternalSyntheticLambda0
                    @Override // kotlin.jvm.functions.Function2
                    public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                        return com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.ui.r.a(str, onClick, num, num2, list, z, j, j2, i, z4, i2, i3, (androidx.compose.runtime.Composer) obj, ((java.lang.Integer) obj2).intValue());
                    }
                });
                return;
            }
            return;
        }
        if ((i3 & 256) == 0) {
        }
        i5 = i3 & 512;
        if (i5 == 0) {
        }
        if ((306783379 & i4) != 306783378) {
        }
        if (i5 == 0) {
        }
        if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
        }
        if (!z3) {
        }
        double radians2 = java.lang.Math.toRadians(a(state));
        int i62 = i4;
        long Offset3 = androidx.compose.ui.geometry.OffsetKt.Offset(((float) java.lang.Math.cos(radians2)) * 300.0f, ((float) java.lang.Math.sin(radians2)) * 300.0f);
        double d2 = radians2 + 3.141592653589793d;
        long Offset22 = androidx.compose.ui.geometry.OffsetKt.Offset(((float) java.lang.Math.cos(d2)) * 300.0f, ((float) java.lang.Math.sin(d2)) * 300.0f);
        if (list == null) {
        }
        long j32 = f7649a;
        listOf = kotlin.collections.CollectionsKt.listOf((java.lang.Object[]) new androidx.compose.ui.graphics.Color[]{androidx.compose.ui.graphics.Color.m2103boximpl(j32), androidx.compose.ui.graphics.Color.m2103boximpl(j32)});
        androidx.compose.ui.graphics.Brush m2064linearGradientmHitzGk$default2 = androidx.compose.ui.graphics.Brush.Companion.m2064linearGradientmHitzGk$default(androidx.compose.ui.graphics.Brush.INSTANCE, listOf, Offset3, Offset22, 0, 8, (java.lang.Object) null);
        androidx.compose.foundation.shape.RoundedCornerShape circleShape2 = androidx.compose.foundation.shape.RoundedCornerShapeKt.getCircleShape();
        androidx.compose.material.ButtonColors m1265buttonColorsro_MJ882 = androidx.compose.material.ButtonDefaults.INSTANCE.m1265buttonColorsro_MJ88(j2, j, 0L, 0L, startRestartGroup, ((i62 >> 21) & 14) | ((i62 >> 15) & 112) | (androidx.compose.material.ButtonDefaults.$stable << 12), 12);
        if (!z) {
        }
        if (num != null) {
        }
        androidx.compose.ui.Modifier modifier2 = androidx.compose.ui.Modifier.INSTANCE;
        composer2 = startRestartGroup;
        androidx.compose.material.ButtonKt.Button(onClick, modifier2, false, null, null, circleShape2, borderStroke, m1265buttonColorsro_MJ882, null, androidx.compose.runtime.internal.ComposableLambdaKt.composableLambda(startRestartGroup, -469621531, true, new com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.ui.r.a(str, num2, j)), composer2, ((i62 >> 3) & 14) | 805306368, 284);
        if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
        }
        z4 = z3;
        endRestartGroup = composer2.endRestartGroup();
        if (endRestartGroup == null) {
        }
    }

    public static final void a(androidx.compose.runtime.Composer composer, final int i) {
        androidx.compose.runtime.Composer startRestartGroup = composer.startRestartGroup(-227963495);
        if (i == 0 && startRestartGroup.getSkipping()) {
            startRestartGroup.skipToGroupEnd();
        } else {
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventStart(-227963495, i, -1, "com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.ui.DECPreview (DEC.kt:246)");
            }
            androidx.compose.material.MaterialThemeKt.MaterialTheme(null, null, null, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.ui.m.f7640a.a(), startRestartGroup, 3072, 7);
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventEnd();
            }
        }
        androidx.compose.runtime.ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new kotlin.jvm.functions.Function2() { // from class: com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.ui.r$$ExternalSyntheticLambda1
                @Override // kotlin.jvm.functions.Function2
                public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                    return com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.ui.r.a(i, (androidx.compose.runtime.Composer) obj, ((java.lang.Integer) obj2).intValue());
                }
            });
        }
    }

    public static final float a(androidx.compose.runtime.State<java.lang.Float> state) {
        return state.getValue().floatValue();
    }
}
