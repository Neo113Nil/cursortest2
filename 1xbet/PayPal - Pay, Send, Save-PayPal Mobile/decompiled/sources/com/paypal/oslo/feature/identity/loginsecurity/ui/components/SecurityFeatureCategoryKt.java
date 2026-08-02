package com.paypal.oslo.feature.identity.loginsecurity.ui.components;

@kotlin.Metadata(d1 = {"\u0000R\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u001af\u0010\u000e\u001a\u00020\u000f*\u00020\u00102\b\b\u0001\u0010\u0011\u001a\u00020\u00122\f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00150\u00142\b\b\u0002\u0010\u0016\u001a\u00020\u00172\u0018\u0010\u0018\u001a\u0014\u0012\u0004\u0012\u00020\u0015\u0012\u0004\u0012\u00020\u0017\u0012\u0004\u0012\u00020\u000f0\u00192\u0012\u0010\u001a\u001a\u000e\u0012\u0004\u0012\u00020\u0015\u0012\u0004\u0012\u00020\u000f0\u001b2\b\b\u0002\u0010\u001c\u001a\u00020\u0017H\u0000\u001a*\u0010\u001d\u001a\u00020\u000f2\b\b\u0002\u0010\u001e\u001a\u00020\u001f2\u0011\u0010 \u001a\r\u0012\u0004\u0012\u00020\u000f0!¢\u0006\u0002\b\"H\u0001¢\u0006\u0002\u0010#\u001a\u0017\u0010$\u001a\u00020\u000f2\b\b\u0002\u0010\u001e\u001a\u00020\u001fH\u0001¢\u0006\u0002\u0010%\"\u0016\u0010\u0000\u001a\u00020\u0001X\u0080\u0004¢\u0006\n\n\u0002\u0010\u0004\u001a\u0004\b\u0002\u0010\u0003\"\u0016\u0010\u0005\u001a\u00020\u0006X\u0080\u0004¢\u0006\n\n\u0002\u0010\t\u001a\u0004\b\u0007\u0010\b\"\u0016\u0010\n\u001a\u00020\u0006X\u0080\u0004¢\u0006\n\n\u0002\u0010\t\u001a\u0004\b\u000b\u0010\b\"\u0016\u0010\f\u001a\u00020\u0001X\u0080\u0004¢\u0006\n\n\u0002\u0010\u0004\u001a\u0004\b\r\u0010\u0003¨\u0006&"}, d2 = {"CARD_CORNER_RADIUS", "Landroidx/compose/ui/unit/Dp;", "getCARD_CORNER_RADIUS", "()F", com.adobe.marketing.mobile.internal.CoreConstants.Wrapper.Type.FLUTTER, "CARD_BACKGROUND_COLOR", "Landroidx/compose/ui/graphics/Color;", "getCARD_BACKGROUND_COLOR", "()J", "J", "DIVIDER_COLOR", "getDIVIDER_COLOR", "DIVIDER_HEIGHT", "getDIVIDER_HEIGHT", "securityFeatureCategory", "", "Landroidx/compose/foundation/lazy/LazyListScope;", "titleResId", "", "features", "", "Lcom/paypal/oslo/feature/identity/loginsecurity/domain/model/LoginAndSecurityFeature;", "showSpacerBefore", "", "onToggle", "Lkotlin/Function2;", "onClick", "Lkotlin/Function1;", "renderDividers", "FeatureCard", "modifier", "Landroidx/compose/ui/Modifier;", "content", "Lkotlin/Function0;", "Landroidx/compose/runtime/Composable;", "(Landroidx/compose/ui/Modifier;Lkotlin/jvm/functions/Function2;Landroidx/compose/runtime/Composer;II)V", "FeatureDivider", "(Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;II)V", "identity_prodRelease"}, k = 2, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class SecurityFeatureCategoryKt {
    private static final float getHighResolutionOutputSizeshNQ4ISI = com.paypal.pds.core.ConstantsKt.getSpacing12();
    private static final long getHighSpeedVideoSizes = androidx.compose.ui.graphics.Color.INSTANCE.m6033getWhite0d7_KjU();
    private static final long getHighSpeedVideoFpsRangesFor = androidx.compose.ui.graphics.ColorKt.Color(4292927712L);
    private static final float Camera2StreamConfigurationMap = com.paypal.pds.core.ConstantsKt.getSpacing2();

    public static final float getCARD_CORNER_RADIUS() {
        return getHighResolutionOutputSizeshNQ4ISI;
    }

    public static final long getCARD_BACKGROUND_COLOR() {
        return getHighSpeedVideoSizes;
    }

    public static final long getDIVIDER_COLOR() {
        return getHighSpeedVideoFpsRangesFor;
    }

    public static final float getDIVIDER_HEIGHT() {
        return Camera2StreamConfigurationMap;
    }

    public static final void securityFeatureCategory(androidx.compose.foundation.lazy.LazyListScope lazyListScope, final int i, final java.util.List<com.paypal.oslo.feature.identity.loginsecurity.domain.model.LoginAndSecurityFeature> list, boolean z, final kotlin.jvm.functions.Function2<? super com.paypal.oslo.feature.identity.loginsecurity.domain.model.LoginAndSecurityFeature, ? super java.lang.Boolean, kotlin.Unit> function2, final kotlin.jvm.functions.Function1<? super com.paypal.oslo.feature.identity.loginsecurity.domain.model.LoginAndSecurityFeature, kotlin.Unit> function1, final boolean z2) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(lazyListScope, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(list, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(function2, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(function1, "");
        if (list.isEmpty()) {
            return;
        }
        if (z) {
            androidx.compose.foundation.lazy.LazyListScope.item$default(lazyListScope, null, null, com.paypal.oslo.feature.identity.loginsecurity.ui.components.ComposableSingletons$SecurityFeatureCategoryKt.INSTANCE.getLambda$1876204157$identity_prodRelease(), 3, null);
        }
        androidx.compose.foundation.lazy.LazyListScope.item$default(lazyListScope, null, null, androidx.compose.runtime.internal.ComposableLambdaKt.composableLambdaInstance(1385971471, true, new kotlin.jvm.functions.Function3() { // from class: com.paypal.oslo.feature.identity.loginsecurity.ui.components.SecurityFeatureCategoryKt$$ExternalSyntheticLambda2
            @Override // kotlin.jvm.functions.Function3
            public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2, java.lang.Object obj3) {
                return com.paypal.oslo.feature.identity.loginsecurity.ui.components.SecurityFeatureCategoryKt.$r8$lambda$nqcEW_Pd1LFeXb_PZyeblA5lWNs(i, (androidx.compose.foundation.lazy.LazyItemScope) obj, (androidx.compose.runtime.Composer) obj2, ((java.lang.Integer) obj3).intValue());
            }
        }), 3, null);
        androidx.compose.foundation.lazy.LazyListScope.item$default(lazyListScope, null, null, androidx.compose.runtime.internal.ComposableLambdaKt.composableLambdaInstance(1183838008, true, new kotlin.jvm.functions.Function3() { // from class: com.paypal.oslo.feature.identity.loginsecurity.ui.components.SecurityFeatureCategoryKt$$ExternalSyntheticLambda3
            @Override // kotlin.jvm.functions.Function3
            public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2, java.lang.Object obj3) {
                return com.paypal.oslo.feature.identity.loginsecurity.ui.components.SecurityFeatureCategoryKt.$r8$lambda$6MHSRlGp_7z4BItvzYoHZi69vxM(list, function2, function1, z2, (androidx.compose.foundation.lazy.LazyItemScope) obj, (androidx.compose.runtime.Composer) obj2, ((java.lang.Integer) obj3).intValue());
            }
        }), 3, null);
    }

    public static final void FeatureCard(final androidx.compose.ui.Modifier modifier, final kotlin.jvm.functions.Function2<? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.Unit> function2, androidx.compose.runtime.Composer composer, final int i, final int i2) {
        int i3;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(function2, "");
        androidx.compose.runtime.Composer startRestartGroup = composer.startRestartGroup(1842258394);
        int i4 = i2 & 1;
        if (i4 != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            i3 = (startRestartGroup.changed(modifier) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i & 48) == 0) {
            i3 |= startRestartGroup.changedInstance(function2) ? 32 : 16;
        }
        if (!startRestartGroup.shouldExecute((i3 & 19) != 18, i3 & 1)) {
            startRestartGroup.skipToGroupEnd();
        } else {
            if (i4 != 0) {
                modifier = androidx.compose.ui.Modifier.INSTANCE;
            }
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventStart(1842258394, i3, -1, "com.paypal.oslo.feature.identity.loginsecurity.ui.components.FeatureCard (SecurityFeatureCategory.kt:98)");
            }
            androidx.compose.ui.Modifier fillMaxWidth$default = androidx.compose.foundation.layout.SizeKt.fillMaxWidth$default(modifier, 0.0f, 1, null);
            java.lang.Object rememberedValue = startRestartGroup.rememberedValue();
            if (rememberedValue == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                rememberedValue = new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.identity.loginsecurity.ui.components.SecurityFeatureCategoryKt$$ExternalSyntheticLambda7
                    @Override // kotlin.jvm.functions.Function1
                    public final java.lang.Object invoke(java.lang.Object obj) {
                        return com.paypal.oslo.feature.identity.loginsecurity.ui.components.SecurityFeatureCategoryKt.$r8$lambda$gWdzS4IRXIlnOwlN5vs53pA9wE0((androidx.compose.ui.graphics.drawscope.DrawScope) obj);
                    }
                };
                startRestartGroup.updateRememberedValue(rememberedValue);
            }
            androidx.compose.ui.Modifier drawBehind = androidx.compose.ui.draw.DrawModifierKt.drawBehind(fillMaxWidth$default, (kotlin.jvm.functions.Function1) rememberedValue);
            androidx.compose.ui.layout.MeasurePolicy maybeCachedBoxMeasurePolicy = androidx.compose.foundation.layout.BoxKt.maybeCachedBoxMeasurePolicy(androidx.compose.ui.Alignment.INSTANCE.getTopStart(), false);
            int hashCode = java.lang.Long.hashCode(androidx.compose.runtime.ComposablesKt.getCurrentCompositeKeyHashCode(startRestartGroup, 0));
            androidx.compose.runtime.CompositionLocalMap currentCompositionLocalMap = startRestartGroup.getCurrentCompositionLocalMap();
            androidx.compose.ui.Modifier materializeModifier = androidx.compose.ui.ComposedModifierKt.materializeModifier(startRestartGroup, drawBehind);
            kotlin.jvm.functions.Function0<androidx.compose.ui.node.ComposeUiNode> constructor = androidx.compose.ui.node.ComposeUiNode.INSTANCE.getConstructor();
            if (!(startRestartGroup.getApplier() instanceof androidx.compose.runtime.Applier)) {
                androidx.compose.runtime.ComposablesKt.invalidApplier();
            }
            startRestartGroup.startReusableNode();
            if (startRestartGroup.getInserting()) {
                startRestartGroup.createNode(constructor);
            } else {
                startRestartGroup.useNode();
            }
            androidx.compose.runtime.Composer m5299constructorimpl = androidx.compose.runtime.Updater.m5299constructorimpl(startRestartGroup);
            androidx.compose.runtime.Updater.m5307setimpl(m5299constructorimpl, maybeCachedBoxMeasurePolicy, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetMeasurePolicy());
            androidx.compose.runtime.Updater.m5307setimpl(m5299constructorimpl, currentCompositionLocalMap, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
            androidx.compose.runtime.Updater.m5303initimpl(m5299constructorimpl, java.lang.Integer.valueOf(hashCode), androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetCompositeKeyHash());
            androidx.compose.runtime.Updater.m5305reconcileimpl(m5299constructorimpl, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getApplyOnDeactivatedNodeAssertion());
            androidx.compose.runtime.Updater.m5307setimpl(m5299constructorimpl, materializeModifier, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetModifier());
            androidx.compose.foundation.layout.BoxScopeInstance boxScopeInstance = androidx.compose.foundation.layout.BoxScopeInstance.INSTANCE;
            androidx.compose.ui.Modifier.Companion companion = androidx.compose.ui.Modifier.INSTANCE;
            androidx.compose.ui.layout.MeasurePolicy columnMeasurePolicy = androidx.compose.foundation.layout.ColumnKt.columnMeasurePolicy(androidx.compose.foundation.layout.Arrangement.INSTANCE.getTop(), androidx.compose.ui.Alignment.INSTANCE.getStart(), startRestartGroup, 0);
            int hashCode2 = java.lang.Long.hashCode(androidx.compose.runtime.ComposablesKt.getCurrentCompositeKeyHashCode(startRestartGroup, 0));
            androidx.compose.runtime.CompositionLocalMap currentCompositionLocalMap2 = startRestartGroup.getCurrentCompositionLocalMap();
            androidx.compose.ui.Modifier materializeModifier2 = androidx.compose.ui.ComposedModifierKt.materializeModifier(startRestartGroup, companion);
            kotlin.jvm.functions.Function0<androidx.compose.ui.node.ComposeUiNode> constructor2 = androidx.compose.ui.node.ComposeUiNode.INSTANCE.getConstructor();
            if (!(startRestartGroup.getApplier() instanceof androidx.compose.runtime.Applier)) {
                androidx.compose.runtime.ComposablesKt.invalidApplier();
            }
            startRestartGroup.startReusableNode();
            if (startRestartGroup.getInserting()) {
                startRestartGroup.createNode(constructor2);
            } else {
                startRestartGroup.useNode();
            }
            androidx.compose.runtime.Composer m5299constructorimpl2 = androidx.compose.runtime.Updater.m5299constructorimpl(startRestartGroup);
            androidx.compose.runtime.Updater.m5307setimpl(m5299constructorimpl2, columnMeasurePolicy, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetMeasurePolicy());
            androidx.compose.runtime.Updater.m5307setimpl(m5299constructorimpl2, currentCompositionLocalMap2, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
            androidx.compose.runtime.Updater.m5303initimpl(m5299constructorimpl2, java.lang.Integer.valueOf(hashCode2), androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetCompositeKeyHash());
            androidx.compose.runtime.Updater.m5305reconcileimpl(m5299constructorimpl2, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getApplyOnDeactivatedNodeAssertion());
            androidx.compose.runtime.Updater.m5307setimpl(m5299constructorimpl2, materializeModifier2, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetModifier());
            androidx.compose.foundation.layout.ColumnScopeInstance columnScopeInstance = androidx.compose.foundation.layout.ColumnScopeInstance.INSTANCE;
            function2.invoke(startRestartGroup, java.lang.Integer.valueOf((i3 >> 3) & 14));
            startRestartGroup.endNode();
            startRestartGroup.endNode();
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventEnd();
            }
        }
        androidx.compose.runtime.ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new kotlin.jvm.functions.Function2() { // from class: com.paypal.oslo.feature.identity.loginsecurity.ui.components.SecurityFeatureCategoryKt$$ExternalSyntheticLambda8
                @Override // kotlin.jvm.functions.Function2
                public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                    return com.paypal.oslo.feature.identity.loginsecurity.ui.components.SecurityFeatureCategoryKt.m15187$r8$lambda$joP0yjeLX8U0gEJF3xkSJRJE5U(androidx.compose.ui.Modifier.this, function2, i, i2, (androidx.compose.runtime.Composer) obj, ((java.lang.Integer) obj2).intValue());
                }
            });
        }
    }

    public static final void FeatureDivider(final androidx.compose.ui.Modifier modifier, androidx.compose.runtime.Composer composer, final int i, final int i2) {
        int i3;
        androidx.compose.runtime.Composer startRestartGroup = composer.startRestartGroup(-1369017662);
        int i4 = i2 & 1;
        if (i4 != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            i3 = (startRestartGroup.changed(modifier) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if (!startRestartGroup.shouldExecute((i3 & 3) != 2, i3 & 1)) {
            startRestartGroup.skipToGroupEnd();
        } else {
            if (i4 != 0) {
                modifier = androidx.compose.ui.Modifier.INSTANCE;
            }
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventStart(-1369017662, i3, -1, "com.paypal.oslo.feature.identity.loginsecurity.ui.components.FeatureDivider (SecurityFeatureCategory.kt:130)");
            }
            androidx.compose.ui.Modifier m1708paddingVpY3zN4$default = androidx.compose.foundation.layout.PaddingKt.m1708paddingVpY3zN4$default(androidx.compose.foundation.layout.SizeKt.m1726height3ABfNKs(androidx.compose.foundation.layout.SizeKt.fillMaxWidth$default(modifier, 0.0f, 1, null), Camera2StreamConfigurationMap), com.paypal.pds.core.ConstantsKt.getSpacing16(), 0.0f, 2, null);
            java.lang.Object rememberedValue = startRestartGroup.rememberedValue();
            if (rememberedValue == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                rememberedValue = new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.identity.loginsecurity.ui.components.SecurityFeatureCategoryKt$$ExternalSyntheticLambda4
                    @Override // kotlin.jvm.functions.Function1
                    public final java.lang.Object invoke(java.lang.Object obj) {
                        return com.paypal.oslo.feature.identity.loginsecurity.ui.components.SecurityFeatureCategoryKt.$r8$lambda$uXUr4MMfvJVj6OwntlKJN25GMAk((androidx.compose.ui.graphics.drawscope.DrawScope) obj);
                    }
                };
                startRestartGroup.updateRememberedValue(rememberedValue);
            }
            androidx.compose.foundation.layout.BoxKt.Box(androidx.compose.ui.draw.DrawModifierKt.drawBehind(m1708paddingVpY3zN4$default, (kotlin.jvm.functions.Function1) rememberedValue), startRestartGroup, 0);
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventEnd();
            }
        }
        androidx.compose.runtime.ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new kotlin.jvm.functions.Function2() { // from class: com.paypal.oslo.feature.identity.loginsecurity.ui.components.SecurityFeatureCategoryKt$$ExternalSyntheticLambda5
                @Override // kotlin.jvm.functions.Function2
                public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                    return com.paypal.oslo.feature.identity.loginsecurity.ui.components.SecurityFeatureCategoryKt.$r8$lambda$cJuK6v0X5P4r22Hg5klz74jw_kU(androidx.compose.ui.Modifier.this, i, i2, (androidx.compose.runtime.Composer) obj, ((java.lang.Integer) obj2).intValue());
                }
            });
        }
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$5xi7bG2yO153M9jxrpmsJ7Mb4W8(java.util.List list, final kotlin.jvm.functions.Function2 function2, final kotlin.jvm.functions.Function1 function1, boolean z, androidx.compose.runtime.Composer composer, int i) {
        if (composer.shouldExecute((i & 3) != 2, i & 1)) {
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventStart(-2024382242, i, -1, "com.paypal.oslo.feature.identity.loginsecurity.ui.components.securityFeatureCategory.<anonymous>.<anonymous> (SecurityFeatureCategory.kt:77)");
            }
            int i2 = 0;
            for (java.lang.Object obj : list) {
                if (i2 < 0) {
                    kotlin.collections.CollectionsKt.throwIndexOverflow();
                }
                final com.paypal.oslo.feature.identity.loginsecurity.domain.model.LoginAndSecurityFeature loginAndSecurityFeature = (com.paypal.oslo.feature.identity.loginsecurity.domain.model.LoginAndSecurityFeature) obj;
                boolean changed = composer.changed(function2);
                boolean changed2 = composer.changed(loginAndSecurityFeature);
                java.lang.Object rememberedValue = composer.rememberedValue();
                if ((changed | changed2) || rememberedValue == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                    rememberedValue = new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.identity.loginsecurity.ui.components.SecurityFeatureCategoryKt$$ExternalSyntheticLambda0
                        @Override // kotlin.jvm.functions.Function1
                        public final java.lang.Object invoke(java.lang.Object obj2) {
                            return com.paypal.oslo.feature.identity.loginsecurity.ui.components.SecurityFeatureCategoryKt.m15186$r8$lambda$VjFGEl6rUVQT2ET_iWVcKsaZXE(kotlin.jvm.functions.Function2.this, loginAndSecurityFeature, ((java.lang.Boolean) obj2).booleanValue());
                        }
                    };
                    composer.updateRememberedValue(rememberedValue);
                }
                kotlin.jvm.functions.Function1 function12 = (kotlin.jvm.functions.Function1) rememberedValue;
                boolean changed3 = composer.changed(function1);
                boolean changed4 = composer.changed(loginAndSecurityFeature);
                java.lang.Object rememberedValue2 = composer.rememberedValue();
                if ((changed3 | changed4) || rememberedValue2 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                    rememberedValue2 = new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.feature.identity.loginsecurity.ui.components.SecurityFeatureCategoryKt$$ExternalSyntheticLambda1
                        @Override // kotlin.jvm.functions.Function0
                        public final java.lang.Object invoke() {
                            return com.paypal.oslo.feature.identity.loginsecurity.ui.components.SecurityFeatureCategoryKt.$r8$lambda$O0gAKnTtwqvrR3wMZGagq2qqSzc(kotlin.jvm.functions.Function1.this, loginAndSecurityFeature);
                        }
                    };
                    composer.updateRememberedValue(rememberedValue2);
                }
                com.paypal.oslo.feature.identity.loginsecurity.ui.LoginAndSecurityScreenKt.SecurityFeatureItem(loginAndSecurityFeature, function12, (kotlin.jvm.functions.Function0) rememberedValue2, null, composer, 0, 8);
                if (!z || i2 >= list.size() - 1) {
                    composer.startReplaceGroup(1232336005);
                    composer.endReplaceGroup();
                } else {
                    composer.startReplaceGroup(1232282189);
                    FeatureDivider(null, composer, 0, 1);
                    composer.endReplaceGroup();
                }
                i2++;
            }
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventEnd();
            }
        } else {
            composer.skipToGroupEnd();
        }
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$6MHSRlGp_7z4BItvzYoHZi69vxM(final java.util.List list, final kotlin.jvm.functions.Function2 function2, final kotlin.jvm.functions.Function1 function1, final boolean z, androidx.compose.foundation.lazy.LazyItemScope lazyItemScope, androidx.compose.runtime.Composer composer, int i) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(lazyItemScope, "");
        if (composer.shouldExecute((i & 17) != 16, i & 1)) {
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventStart(1183838008, i, -1, "com.paypal.oslo.feature.identity.loginsecurity.ui.components.securityFeatureCategory.<anonymous> (SecurityFeatureCategory.kt:76)");
            }
            FeatureCard(null, androidx.compose.runtime.internal.ComposableLambdaKt.rememberComposableLambda(-2024382242, true, new kotlin.jvm.functions.Function2() { // from class: com.paypal.oslo.feature.identity.loginsecurity.ui.components.SecurityFeatureCategoryKt$$ExternalSyntheticLambda6
                @Override // kotlin.jvm.functions.Function2
                public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                    return com.paypal.oslo.feature.identity.loginsecurity.ui.components.SecurityFeatureCategoryKt.$r8$lambda$5xi7bG2yO153M9jxrpmsJ7Mb4W8(list, function2, function1, z, (androidx.compose.runtime.Composer) obj, ((java.lang.Integer) obj2).intValue());
                }
            }, composer, 54), composer, 48, 1);
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventEnd();
            }
        } else {
            composer.skipToGroupEnd();
        }
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$O0gAKnTtwqvrR3wMZGagq2qqSzc(kotlin.jvm.functions.Function1 function1, com.paypal.oslo.feature.identity.loginsecurity.domain.model.LoginAndSecurityFeature loginAndSecurityFeature) {
        function1.invoke(loginAndSecurityFeature);
        return kotlin.Unit.INSTANCE;
    }

    /* renamed from: $r8$lambda$VjFGEl6rUVQT2ET_iWVc-KsaZXE, reason: not valid java name */
    public static /* synthetic */ kotlin.Unit m15186$r8$lambda$VjFGEl6rUVQT2ET_iWVcKsaZXE(kotlin.jvm.functions.Function2 function2, com.paypal.oslo.feature.identity.loginsecurity.domain.model.LoginAndSecurityFeature loginAndSecurityFeature, boolean z) {
        function2.invoke(loginAndSecurityFeature, java.lang.Boolean.valueOf(z));
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$cJuK6v0X5P4r22Hg5klz74jw_kU(androidx.compose.ui.Modifier modifier, int i, int i2, androidx.compose.runtime.Composer composer, int i3) {
        FeatureDivider(modifier, composer, androidx.compose.runtime.RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$gWdzS4IRXIlnOwlN5vs53pA9wE0(androidx.compose.ui.graphics.drawscope.DrawScope drawScope) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(drawScope, "");
        float f = drawScope.mo1418toPx0680j_4(getHighResolutionOutputSizeshNQ4ISI);
        androidx.compose.ui.graphics.Path Path = androidx.compose.ui.graphics.AndroidPath_androidKt.Path();
        androidx.compose.ui.graphics.Path.addRoundRect$default(Path, androidx.compose.ui.geometry.RoundRectKt.m5806RoundRectgG7oq9Y(0.0f, 0.0f, java.lang.Float.intBitsToFloat((int) (drawScope.mo6531getSizeNHjbRc() >> 32)), java.lang.Float.intBitsToFloat((int) (drawScope.mo6531getSizeNHjbRc() & 4294967295L)), androidx.compose.ui.geometry.CornerRadius.m5706constructorimpl((java.lang.Float.floatToRawIntBits(f) << 32) | (java.lang.Float.floatToRawIntBits(f) & 4294967295L))), null, 2, null);
        androidx.compose.ui.graphics.drawscope.DrawScope.m6522drawPathLG529CI$default(drawScope, Path, getHighSpeedVideoSizes, 0.0f, null, null, 0, 60, null);
        return kotlin.Unit.INSTANCE;
    }

    /* renamed from: $r8$lambda$joP0yjeLX8U0gEJF3-xkSJRJE5U, reason: not valid java name */
    public static /* synthetic */ kotlin.Unit m15187$r8$lambda$joP0yjeLX8U0gEJF3xkSJRJE5U(androidx.compose.ui.Modifier modifier, kotlin.jvm.functions.Function2 function2, int i, int i2, androidx.compose.runtime.Composer composer, int i3) {
        FeatureCard(modifier, function2, composer, androidx.compose.runtime.RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$nqcEW_Pd1LFeXb_PZyeblA5lWNs(int i, androidx.compose.foundation.lazy.LazyItemScope lazyItemScope, androidx.compose.runtime.Composer composer, int i2) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(lazyItemScope, "");
        if (composer.shouldExecute((i2 & 17) != 16, i2 & 1)) {
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventStart(1385971471, i2, -1, "com.paypal.oslo.feature.identity.loginsecurity.ui.components.securityFeatureCategory.<anonymous> (SecurityFeatureCategory.kt:67)");
            }
            com.paypal.pds.components.LabelKt.m21914LabelPL_sNV4(androidx.compose.ui.res.StringResources_androidKt.stringResource(i, composer, 0), androidx.compose.foundation.layout.PaddingKt.m1708paddingVpY3zN4$default(androidx.compose.ui.Modifier.INSTANCE, 0.0f, com.paypal.pds.core.ConstantsKt.getSpacing8(), 1, null), com.paypal.pds.core.Color.ContentMuted.INSTANCE, null, null, null, false, 0, 0, null, com.paypal.pds.core.Typography.BodySmall.INSTANCE, composer, 384, 6, 1016);
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventEnd();
            }
        } else {
            composer.skipToGroupEnd();
        }
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$uXUr4MMfvJVj6OwntlKJN25GMAk(androidx.compose.ui.graphics.drawscope.DrawScope drawScope) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(drawScope, "");
        androidx.compose.ui.graphics.drawscope.DrawScope.m6526drawRectnJ9OG0$default(drawScope, getHighSpeedVideoFpsRangesFor, 0L, 0L, 0.0f, null, null, 0, 126, null);
        return kotlin.Unit.INSTANCE;
    }
}
