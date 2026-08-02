package com.paypal.oslo.feature.onboarding.signup.welcome.ui.component;

@kotlin.Metadata(d1 = {"\u0000P\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0002\b\u0005\u001a\u0010\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\u0002\u001a\u0010\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0002\u001a\u00020\u0003H\u0002\u001a\u0014\u0010\u0006\u001a\u00020\u0007*\u00020\b2\u0006\u0010\u0002\u001a\u00020\u0003H\u0002\u001a'\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\b2\u0006\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\f\u001a\u00020\rH\u0007¢\u0006\u0002\u0010\u000e\u001aE\u0010\u000f\u001a\u00020\n2\u0006\u0010\u0010\u001a\u00020\u00112\f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\b0\u00132\u0006\u0010\u000b\u001a\u00020\b2\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0014\u001a\u00020\u00012\u0006\u0010\u0015\u001a\u00020\u0016H\u0003¢\u0006\u0004\b\u0017\u0010\u0018\u001aC\u0010\u0019\u001a\u00020\n2\u0006\u0010\u001a\u001a\u00020\b2\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0014\u001a\u00020\u00012\u0006\u0010\u001b\u001a\u00020\u00032\u0014\u0010\u001c\u001a\u0010\u0012\u0004\u0012\u00020\u001e\u0012\u0004\u0012\u00020\n\u0018\u00010\u001dH\u0003¢\u0006\u0002\u0010\u001f\u001a\u0017\u0010 \u001a\u00020\n2\b\b\u0001\u0010\u001a\u001a\u00020\bH\u0003¢\u0006\u0002\u0010!¨\u0006\"²\u0006\n\u0010#\u001a\u00020\u0016X\u008a\u0084\u0002"}, d2 = {"getTypography", "Lcom/paypal/pds/core/Typography;", "isSubtitle", "", "getAnimationLabel", "", "getTextResId", "", "Lcom/paypal/oslo/feature/onboarding/signup/welcome/ui/model/WelcomePageId;", "WelcomeAnimatedTextCarousel", "", "currentPageId", "modifier", "Landroidx/compose/ui/Modifier;", "(Lcom/paypal/oslo/feature/onboarding/signup/welcome/ui/model/WelcomePageId;ZLandroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;II)V", "CarouselRow", "stateHolder", "Lcom/paypal/oslo/feature/onboarding/signup/welcome/ui/state/WelcomeTextCarouselStateHolder;", "pages", "", "typography", "animatedOffset", "Landroidx/compose/ui/unit/Dp;", "CarouselRow-aoAMqTM", "(Lcom/paypal/oslo/feature/onboarding/signup/welcome/ui/state/WelcomeTextCarouselStateHolder;Ljava/util/List;Lcom/paypal/oslo/feature/onboarding/signup/welcome/ui/model/WelcomePageId;ZLcom/paypal/pds/core/Typography;FLandroidx/compose/runtime/Composer;I)V", "AnimatedPageText", "pageId", "isActive", "onMeasured", "Lkotlin/Function1;", "", "(Lcom/paypal/oslo/feature/onboarding/signup/welcome/ui/model/WelcomePageId;ZLcom/paypal/pds/core/Typography;ZLkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;I)V", "AnimatedWordCarouselPreview", "(Lcom/paypal/oslo/feature/onboarding/signup/welcome/ui/model/WelcomePageId;Landroidx/compose/runtime/Composer;I)V", "onboarding_prodRelease", "rowOffset"}, k = 2, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class WelcomeAnimatedTextCarouselKt {
    /* JADX WARN: Removed duplicated region for block: B:20:0x0062  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x006d  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x022f  */
    /* JADX WARN: Removed duplicated region for block: B:76:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:88:0x0225  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x0064  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void WelcomeAnimatedTextCarousel(final com.paypal.oslo.feature.onboarding.signup.welcome.ui.model.WelcomePageId welcomePageId, final boolean z, androidx.compose.ui.Modifier modifier, androidx.compose.runtime.Composer composer, final int i, final int i2) {
        int i3;
        androidx.compose.ui.Modifier modifier2;
        int i4;
        final androidx.compose.ui.Modifier modifier3;
        androidx.compose.runtime.ScopeUpdateScope endRestartGroup;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(welcomePageId, "");
        androidx.compose.runtime.Composer startRestartGroup = composer.startRestartGroup(-1457719828);
        if ((i & 6) == 0) {
            i3 = (startRestartGroup.changed(welcomePageId.ordinal()) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i & 48) == 0) {
            i3 |= startRestartGroup.changed(z) ? 32 : 16;
        }
        int i5 = i2 & 4;
        if (i5 != 0) {
            i3 |= 384;
        } else if ((i & 384) == 0) {
            modifier2 = modifier;
            i3 |= startRestartGroup.changed(modifier2) ? 256 : 128;
            i4 = i3;
            if (startRestartGroup.shouldExecute((i4 & 147) == 146, i4 & 1)) {
                startRestartGroup.skipToGroupEnd();
                modifier3 = modifier2;
            } else {
                androidx.compose.ui.Modifier modifier4 = i5 != 0 ? androidx.compose.ui.Modifier.INSTANCE : modifier2;
                if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                    androidx.compose.runtime.ComposerKt.traceEventStart(-1457719828, i4, -1, "com.paypal.oslo.feature.onboarding.signup.welcome.ui.component.WelcomeAnimatedTextCarousel (WelcomeAnimatedTextCarousel.kt:84)");
                }
                java.lang.Object rememberedValue = startRestartGroup.rememberedValue();
                if (rememberedValue == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                    rememberedValue = androidx.compose.runtime.SnapshotStateKt.mutableStateMapOf();
                    startRestartGroup.updateRememberedValue(rememberedValue);
                }
                androidx.compose.runtime.snapshots.SnapshotStateMap snapshotStateMap = (androidx.compose.runtime.snapshots.SnapshotStateMap) rememberedValue;
                boolean z2 = (i4 & 112) == 32;
                java.lang.Object rememberedValue2 = startRestartGroup.rememberedValue();
                if (z2 || rememberedValue2 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                    rememberedValue2 = new com.paypal.oslo.feature.onboarding.signup.welcome.ui.state.WelcomeTextCarouselStateHolder(welcomePageId, snapshotStateMap, z);
                    startRestartGroup.updateRememberedValue(rememberedValue2);
                }
                final com.paypal.oslo.feature.onboarding.signup.welcome.ui.state.WelcomeTextCarouselStateHolder welcomeTextCarouselStateHolder = (com.paypal.oslo.feature.onboarding.signup.welcome.ui.state.WelcomeTextCarouselStateHolder) rememberedValue2;
                boolean changed = startRestartGroup.changed(welcomeTextCarouselStateHolder);
                int i6 = i4 & 14;
                boolean z3 = i6 == 4;
                java.lang.Object rememberedValue3 = startRestartGroup.rememberedValue();
                if ((changed | z3) || rememberedValue3 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                    rememberedValue3 = (kotlin.jvm.functions.Function2) new com.paypal.oslo.feature.onboarding.signup.welcome.ui.component.WelcomeAnimatedTextCarouselKt$WelcomeAnimatedTextCarousel$1$1(welcomeTextCarouselStateHolder, welcomePageId, null);
                    startRestartGroup.updateRememberedValue(rememberedValue3);
                }
                androidx.compose.runtime.EffectsKt.LaunchedEffect(welcomePageId, (kotlin.jvm.functions.Function2<? super kotlinx.coroutines.CoroutineScope, ? super kotlin.coroutines.Continuation<? super kotlin.Unit>, ? extends java.lang.Object>) rememberedValue3, startRestartGroup, i6);
                androidx.compose.ui.Modifier fillMaxWidth$default = androidx.compose.foundation.layout.SizeKt.fillMaxWidth$default(modifier4, 0.0f, 1, null);
                androidx.compose.ui.layout.MeasurePolicy maybeCachedBoxMeasurePolicy = androidx.compose.foundation.layout.BoxKt.maybeCachedBoxMeasurePolicy(androidx.compose.ui.Alignment.INSTANCE.getCenter(), false);
                int hashCode = java.lang.Long.hashCode(androidx.compose.runtime.ComposablesKt.getCurrentCompositeKeyHashCode(startRestartGroup, 0));
                androidx.compose.runtime.CompositionLocalMap currentCompositionLocalMap = startRestartGroup.getCurrentCompositionLocalMap();
                androidx.compose.ui.Modifier materializeModifier = androidx.compose.ui.ComposedModifierKt.materializeModifier(startRestartGroup, fillMaxWidth$default);
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
                int mo7767getContainerSizeYbymL2g = (int) (((androidx.compose.ui.platform.WindowInfo) startRestartGroup.consume(androidx.compose.ui.platform.CompositionLocalsKt.getLocalWindowInfo())).mo7767getContainerSizeYbymL2g() >> 32);
                androidx.compose.ui.unit.Density density = (androidx.compose.ui.unit.Density) startRestartGroup.consume(androidx.compose.ui.platform.CompositionLocalsKt.getLocalDensity());
                java.lang.String str = z ? "subtitleRowOffset" : "rowOffset";
                com.paypal.pds.core.Typography typography = z ? com.paypal.pds.core.Typography.HeadingSmall.INSTANCE : com.paypal.pds.core.Typography.DisplayLarge.INSTANCE;
                boolean changed2 = startRestartGroup.changed(mo7767getContainerSizeYbymL2g);
                boolean changed3 = startRestartGroup.changed(density);
                java.lang.Object rememberedValue4 = startRestartGroup.rememberedValue();
                if ((changed2 | changed3) || rememberedValue4 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                    rememberedValue4 = java.lang.Float.valueOf(density.mo1415toDpu2uoSUM(mo7767getContainerSizeYbymL2g));
                    startRestartGroup.updateRememberedValue(rememberedValue4);
                }
                final float floatValue = ((java.lang.Number) rememberedValue4).floatValue();
                boolean z4 = i6 == 4;
                boolean changed4 = startRestartGroup.changed(floatValue);
                java.lang.Object rememberedValue5 = startRestartGroup.rememberedValue();
                if ((changed4 | z4) || rememberedValue5 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                    rememberedValue5 = androidx.compose.runtime.SnapshotStateKt.derivedStateOf(new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.feature.onboarding.signup.welcome.ui.component.WelcomeAnimatedTextCarouselKt$$ExternalSyntheticLambda2
                        @Override // kotlin.jvm.functions.Function0
                        public final java.lang.Object invoke() {
                            androidx.compose.ui.unit.Dp m8599boximpl;
                            m8599boximpl = androidx.compose.ui.unit.Dp.m8599boximpl(androidx.compose.ui.unit.Dp.m8601constructorimpl(com.paypal.oslo.feature.onboarding.signup.welcome.ui.state.WelcomeTextCarouselStateHolder.this.calculateRowOffset(floatValue)));
                            return m8599boximpl;
                        }
                    });
                    startRestartGroup.updateRememberedValue(rememberedValue5);
                }
                getHighSpeedVideoFpsRanges(welcomeTextCarouselStateHolder, welcomeTextCarouselStateHolder.getPagesWithMessages(), welcomePageId, z, typography, androidx.compose.animation.core.AnimateAsStateKt.m1173animateDpAsStateAjpBEmI(((androidx.compose.ui.unit.Dp) ((androidx.compose.runtime.State) rememberedValue5).getValue()).m8615unboximpl(), androidx.compose.animation.core.AnimationSpecKt.tween$default(1500, 200, null, 4, null), str, null, startRestartGroup, 48, 8).getValue().m8615unboximpl(), startRestartGroup, (i4 << 6) & 8064);
                startRestartGroup.endNode();
                if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                    androidx.compose.runtime.ComposerKt.traceEventEnd();
                }
                modifier3 = modifier4;
            }
            endRestartGroup = startRestartGroup.endRestartGroup();
            if (endRestartGroup == null) {
                endRestartGroup.updateScope(new kotlin.jvm.functions.Function2() { // from class: com.paypal.oslo.feature.onboarding.signup.welcome.ui.component.WelcomeAnimatedTextCarouselKt$$ExternalSyntheticLambda3
                    @Override // kotlin.jvm.functions.Function2
                    public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                        return com.paypal.oslo.feature.onboarding.signup.welcome.ui.component.WelcomeAnimatedTextCarouselKt.$r8$lambda$3OoatuPgYZHXHhDrIysmfsqin44(com.paypal.oslo.feature.onboarding.signup.welcome.ui.model.WelcomePageId.this, z, modifier3, i, i2, (androidx.compose.runtime.Composer) obj, ((java.lang.Integer) obj2).intValue());
                    }
                });
                return;
            }
            return;
        }
        modifier2 = modifier;
        i4 = i3;
        if (startRestartGroup.shouldExecute((i4 & 147) == 146, i4 & 1)) {
        }
        endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup == null) {
        }
    }

    private static final void getHighSpeedVideoFpsRanges(final com.paypal.oslo.feature.onboarding.signup.welcome.ui.state.WelcomeTextCarouselStateHolder welcomeTextCarouselStateHolder, final java.util.List<? extends com.paypal.oslo.feature.onboarding.signup.welcome.ui.model.WelcomePageId> list, final com.paypal.oslo.feature.onboarding.signup.welcome.ui.model.WelcomePageId welcomePageId, final boolean z, final com.paypal.pds.core.Typography typography, final float f, androidx.compose.runtime.Composer composer, final int i) {
        int i2;
        final com.paypal.oslo.feature.onboarding.signup.welcome.ui.state.WelcomeTextCarouselStateHolder welcomeTextCarouselStateHolder2 = welcomeTextCarouselStateHolder;
        androidx.compose.runtime.Composer startRestartGroup = composer.startRestartGroup(-1616721690);
        if ((i & 6) == 0) {
            i2 = (startRestartGroup.changed(welcomeTextCarouselStateHolder2) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= startRestartGroup.changedInstance(list) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= startRestartGroup.changed(welcomePageId.ordinal()) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= startRestartGroup.changed(z) ? 2048 : 1024;
        }
        if ((i & 24576) == 0) {
            i2 |= startRestartGroup.changed(typography) ? 16384 : 8192;
        }
        if ((196608 & i) == 0) {
            i2 |= startRestartGroup.changed(f) ? 131072 : 65536;
        }
        boolean z2 = false;
        if (!startRestartGroup.shouldExecute((74899 & i2) != 74898, i2 & 1)) {
            startRestartGroup.skipToGroupEnd();
        } else {
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventStart(-1616721690, i2, -1, "com.paypal.oslo.feature.onboarding.signup.welcome.ui.component.CarouselRow (WelcomeAnimatedTextCarousel.kt:157)");
            }
            androidx.compose.ui.Modifier m1679offsetVpY3zN4$default = androidx.compose.foundation.layout.OffsetKt.m1679offsetVpY3zN4$default(androidx.compose.foundation.layout.SizeKt.wrapContentWidth(androidx.compose.foundation.layout.SizeKt.fillMaxWidth$default(androidx.compose.ui.Modifier.INSTANCE, 0.0f, 1, null), androidx.compose.ui.Alignment.INSTANCE.getStart(), true), f, 0.0f, 2, null);
            androidx.compose.ui.layout.MeasurePolicy rowMeasurePolicy = androidx.compose.foundation.layout.RowKt.rowMeasurePolicy(androidx.compose.foundation.layout.Arrangement.INSTANCE.getStart(), androidx.compose.ui.Alignment.INSTANCE.getCenterVertically(), startRestartGroup, 54);
            int hashCode = java.lang.Long.hashCode(androidx.compose.runtime.ComposablesKt.getCurrentCompositeKeyHashCode(startRestartGroup, 0));
            androidx.compose.runtime.CompositionLocalMap currentCompositionLocalMap = startRestartGroup.getCurrentCompositionLocalMap();
            androidx.compose.ui.Modifier materializeModifier = androidx.compose.ui.ComposedModifierKt.materializeModifier(startRestartGroup, m1679offsetVpY3zN4$default);
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
            androidx.compose.runtime.Updater.m5307setimpl(m5299constructorimpl, rowMeasurePolicy, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetMeasurePolicy());
            androidx.compose.runtime.Updater.m5307setimpl(m5299constructorimpl, currentCompositionLocalMap, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
            androidx.compose.runtime.Updater.m5303initimpl(m5299constructorimpl, java.lang.Integer.valueOf(hashCode), androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetCompositeKeyHash());
            androidx.compose.runtime.Updater.m5305reconcileimpl(m5299constructorimpl, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getApplyOnDeactivatedNodeAssertion());
            androidx.compose.runtime.Updater.m5307setimpl(m5299constructorimpl, materializeModifier, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetModifier());
            androidx.compose.foundation.layout.RowScopeInstance rowScopeInstance = androidx.compose.foundation.layout.RowScopeInstance.INSTANCE;
            startRestartGroup.startReplaceGroup(487132736);
            java.util.Iterator it = list.iterator();
            int i3 = 0;
            while (it.hasNext()) {
                java.lang.Object next = it.next();
                if (i3 < 0) {
                    kotlin.collections.CollectionsKt.throwIndexOverflow();
                }
                final com.paypal.oslo.feature.onboarding.signup.welcome.ui.model.WelcomePageId welcomePageId2 = (com.paypal.oslo.feature.onboarding.signup.welcome.ui.model.WelcomePageId) next;
                boolean changed = startRestartGroup.changed(welcomePageId2.ordinal());
                java.lang.Object rememberedValue = startRestartGroup.rememberedValue();
                if (changed || rememberedValue == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                    rememberedValue = new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.onboarding.signup.welcome.ui.component.WelcomeAnimatedTextCarouselKt$$ExternalSyntheticLambda0
                        @Override // kotlin.jvm.functions.Function1
                        public final java.lang.Object invoke(java.lang.Object obj) {
                            return com.paypal.oslo.feature.onboarding.signup.welcome.ui.component.WelcomeAnimatedTextCarouselKt.$r8$lambda$BnqKDVhPYPa9NzEvZjdT5x9bn3U(com.paypal.oslo.feature.onboarding.signup.welcome.ui.state.WelcomeTextCarouselStateHolder.this, welcomePageId2, ((java.lang.Float) obj).floatValue());
                        }
                    };
                    startRestartGroup.updateRememberedValue(rememberedValue);
                }
                java.util.Iterator it2 = it;
                int i4 = i3;
                boolean z3 = z2;
                Camera2StreamConfigurationMap(welcomePageId2, z, typography, welcomePageId == welcomePageId2 ? true : z2, (kotlin.jvm.functions.Function1) rememberedValue, startRestartGroup, (i2 >> 6) & 1008);
                if (i4 != kotlin.collections.CollectionsKt.getLastIndex(list)) {
                    startRestartGroup.startReplaceGroup(146038115);
                    androidx.compose.foundation.layout.SpacerKt.Spacer(androidx.compose.foundation.layout.SizeKt.m1745width3ABfNKs(androidx.compose.ui.Modifier.INSTANCE, welcomeTextCarouselStateHolder.m16509getWordPaddingD9Ej5fM()), startRestartGroup, z3 ? 1 : 0);
                    startRestartGroup.endReplaceGroup();
                } else {
                    startRestartGroup.startReplaceGroup(146124605);
                    startRestartGroup.endReplaceGroup();
                }
                i3 = i4 + 1;
                z2 = z3 ? 1 : 0;
                it = it2;
                welcomeTextCarouselStateHolder2 = welcomeTextCarouselStateHolder;
            }
            startRestartGroup.endReplaceGroup();
            startRestartGroup.endNode();
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventEnd();
            }
        }
        androidx.compose.runtime.ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new kotlin.jvm.functions.Function2() { // from class: com.paypal.oslo.feature.onboarding.signup.welcome.ui.component.WelcomeAnimatedTextCarouselKt$$ExternalSyntheticLambda1
                @Override // kotlin.jvm.functions.Function2
                public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                    return com.paypal.oslo.feature.onboarding.signup.welcome.ui.component.WelcomeAnimatedTextCarouselKt.$r8$lambda$f1f5uQc7jYk3EufPHjk6YAjuCgk(com.paypal.oslo.feature.onboarding.signup.welcome.ui.state.WelcomeTextCarouselStateHolder.this, list, welcomePageId, z, typography, f, i, (androidx.compose.runtime.Composer) obj, ((java.lang.Integer) obj2).intValue());
                }
            });
        }
    }

    private static final void Camera2StreamConfigurationMap(final com.paypal.oslo.feature.onboarding.signup.welcome.ui.model.WelcomePageId welcomePageId, final boolean z, final com.paypal.pds.core.Typography typography, final boolean z2, final kotlin.jvm.functions.Function1<? super java.lang.Float, kotlin.Unit> function1, androidx.compose.runtime.Composer composer, final int i) {
        int i2;
        androidx.compose.runtime.ScopeUpdateScope endRestartGroup;
        kotlin.jvm.functions.Function2<? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.Unit> function2;
        androidx.compose.runtime.Composer startRestartGroup = composer.startRestartGroup(1937353732);
        if ((i & 6) == 0) {
            i2 = (startRestartGroup.changed(welcomePageId.ordinal()) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= startRestartGroup.changed(z) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= startRestartGroup.changed(typography) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= startRestartGroup.changed(z2) ? 2048 : 1024;
        }
        if ((i & 24576) == 0) {
            i2 |= startRestartGroup.changedInstance(function1) ? 16384 : 8192;
        }
        if (!startRestartGroup.shouldExecute((i2 & 9363) != 9362, i2 & 1)) {
            startRestartGroup.skipToGroupEnd();
        } else {
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventStart(1937353732, i2, -1, "com.paypal.oslo.feature.onboarding.signup.welcome.ui.component.AnimatedPageText (WelcomeAnimatedTextCarousel.kt:206)");
            }
            int subtitleResId = z ? welcomePageId.getSubtitleResId() : welcomePageId.getMessageResId();
            if (subtitleResId == 0) {
                if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                    androidx.compose.runtime.ComposerKt.traceEventEnd();
                }
                endRestartGroup = startRestartGroup.endRestartGroup();
                if (endRestartGroup != null) {
                    function2 = new kotlin.jvm.functions.Function2() { // from class: com.paypal.oslo.feature.onboarding.signup.welcome.ui.component.WelcomeAnimatedTextCarouselKt$$ExternalSyntheticLambda5
                        @Override // kotlin.jvm.functions.Function2
                        public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                            return com.paypal.oslo.feature.onboarding.signup.welcome.ui.component.WelcomeAnimatedTextCarouselKt.$r8$lambda$2Hb62tSVFx5unXqF_fAqmX79O10(com.paypal.oslo.feature.onboarding.signup.welcome.ui.model.WelcomePageId.this, z, typography, z2, function1, i, (androidx.compose.runtime.Composer) obj, ((java.lang.Integer) obj2).intValue());
                        }
                    };
                    endRestartGroup.updateScope(function2);
                }
                return;
            }
            com.paypal.pds.components.LabelKt.m21914LabelPL_sNV4(androidx.compose.ui.res.StringResources_androidKt.stringResource(subtitleResId, startRestartGroup, 0), com.paypal.oslo.feature.onboarding.signup.welcome.ui.state.WelcomeTextAnimationUtilsKt.welcomeTextModifier(androidx.compose.ui.Modifier.INSTANCE, z2 ? 1.0f : 0.6f, (androidx.compose.ui.unit.Density) startRestartGroup.consume(androidx.compose.ui.platform.CompositionLocalsKt.getLocalDensity()), function1), com.paypal.pds.core.Color.ContentUtilityInverse.INSTANCE, null, androidx.compose.ui.text.style.TextAlign.m8436boximpl(androidx.compose.ui.text.style.TextAlign.INSTANCE.m8443getCentere0LSkKk()), androidx.compose.ui.text.style.TextOverflow.m8488boximpl(androidx.compose.ui.text.style.TextOverflow.INSTANCE.m8504getVisiblegIe3tQ8()), false, 1, 0, null, typography, startRestartGroup, 12779904, (i2 >> 6) & 14, androidx.window.core.layout.WindowSizeClass.WIDTH_DP_EXPANDED_LOWER_BOUND);
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventEnd();
            }
        }
        endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            function2 = new kotlin.jvm.functions.Function2() { // from class: com.paypal.oslo.feature.onboarding.signup.welcome.ui.component.WelcomeAnimatedTextCarouselKt$$ExternalSyntheticLambda6
                @Override // kotlin.jvm.functions.Function2
                public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                    return com.paypal.oslo.feature.onboarding.signup.welcome.ui.component.WelcomeAnimatedTextCarouselKt.m16508$r8$lambda$YT9E91N38FIvlaYRfCRdAYenb4(com.paypal.oslo.feature.onboarding.signup.welcome.ui.model.WelcomePageId.this, z, typography, z2, function1, i, (androidx.compose.runtime.Composer) obj, ((java.lang.Integer) obj2).intValue());
                }
            };
            endRestartGroup.updateScope(function2);
        }
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$2Hb62tSVFx5unXqF_fAqmX79O10(com.paypal.oslo.feature.onboarding.signup.welcome.ui.model.WelcomePageId welcomePageId, boolean z, com.paypal.pds.core.Typography typography, boolean z2, kotlin.jvm.functions.Function1 function1, int i, androidx.compose.runtime.Composer composer, int i2) {
        Camera2StreamConfigurationMap(welcomePageId, z, typography, z2, function1, composer, androidx.compose.runtime.RecomposeScopeImplKt.updateChangedFlags(i | 1));
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$3OoatuPgYZHXHhDrIysmfsqin44(com.paypal.oslo.feature.onboarding.signup.welcome.ui.model.WelcomePageId welcomePageId, boolean z, androidx.compose.ui.Modifier modifier, int i, int i2, androidx.compose.runtime.Composer composer, int i3) {
        WelcomeAnimatedTextCarousel(welcomePageId, z, modifier, composer, androidx.compose.runtime.RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$7rG2HNHrkV9HgEkiwjj4l_bLptc(final com.paypal.oslo.feature.onboarding.signup.welcome.ui.model.WelcomePageId welcomePageId, int i, androidx.compose.runtime.Composer composer, int i2) {
        int i3;
        final int updateChangedFlags = androidx.compose.runtime.RecomposeScopeImplKt.updateChangedFlags(i | 1);
        androidx.compose.runtime.Composer startRestartGroup = composer.startRestartGroup(130862910);
        if ((updateChangedFlags & 6) == 0) {
            i3 = (startRestartGroup.changed(welcomePageId.ordinal()) ? 4 : 2) | updateChangedFlags;
        } else {
            i3 = updateChangedFlags;
        }
        if (!startRestartGroup.shouldExecute((i3 & 3) != 2, i3 & 1)) {
            startRestartGroup.skipToGroupEnd();
        } else {
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventStart(130862910, i3, -1, "com.paypal.oslo.feature.onboarding.signup.welcome.ui.component.AnimatedWordCarouselPreview (WelcomeAnimatedTextCarousel.kt:244)");
            }
            WelcomeAnimatedTextCarousel(welcomePageId, false, null, startRestartGroup, (i3 & 14) | 48, 4);
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventEnd();
            }
        }
        androidx.compose.runtime.ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new kotlin.jvm.functions.Function2() { // from class: com.paypal.oslo.feature.onboarding.signup.welcome.ui.component.WelcomeAnimatedTextCarouselKt$$ExternalSyntheticLambda4
                @Override // kotlin.jvm.functions.Function2
                public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                    return com.paypal.oslo.feature.onboarding.signup.welcome.ui.component.WelcomeAnimatedTextCarouselKt.$r8$lambda$7rG2HNHrkV9HgEkiwjj4l_bLptc(com.paypal.oslo.feature.onboarding.signup.welcome.ui.model.WelcomePageId.this, updateChangedFlags, (androidx.compose.runtime.Composer) obj, ((java.lang.Integer) obj2).intValue());
                }
            });
        }
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$BnqKDVhPYPa9NzEvZjdT5x9bn3U(com.paypal.oslo.feature.onboarding.signup.welcome.ui.state.WelcomeTextCarouselStateHolder welcomeTextCarouselStateHolder, com.paypal.oslo.feature.onboarding.signup.welcome.ui.model.WelcomePageId welcomePageId, float f) {
        welcomeTextCarouselStateHolder.updateWordWidth(welcomePageId, f);
        return kotlin.Unit.INSTANCE;
    }

    /* renamed from: $r8$lambda$YT9E91N38FIvlaYR-fCRdAYenb4, reason: not valid java name */
    public static /* synthetic */ kotlin.Unit m16508$r8$lambda$YT9E91N38FIvlaYRfCRdAYenb4(com.paypal.oslo.feature.onboarding.signup.welcome.ui.model.WelcomePageId welcomePageId, boolean z, com.paypal.pds.core.Typography typography, boolean z2, kotlin.jvm.functions.Function1 function1, int i, androidx.compose.runtime.Composer composer, int i2) {
        Camera2StreamConfigurationMap(welcomePageId, z, typography, z2, function1, composer, androidx.compose.runtime.RecomposeScopeImplKt.updateChangedFlags(i | 1));
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$f1f5uQc7jYk3EufPHjk6YAjuCgk(com.paypal.oslo.feature.onboarding.signup.welcome.ui.state.WelcomeTextCarouselStateHolder welcomeTextCarouselStateHolder, java.util.List list, com.paypal.oslo.feature.onboarding.signup.welcome.ui.model.WelcomePageId welcomePageId, boolean z, com.paypal.pds.core.Typography typography, float f, int i, androidx.compose.runtime.Composer composer, int i2) {
        getHighSpeedVideoFpsRanges(welcomeTextCarouselStateHolder, list, welcomePageId, z, typography, f, composer, androidx.compose.runtime.RecomposeScopeImplKt.updateChangedFlags(i | 1));
        return kotlin.Unit.INSTANCE;
    }
}
