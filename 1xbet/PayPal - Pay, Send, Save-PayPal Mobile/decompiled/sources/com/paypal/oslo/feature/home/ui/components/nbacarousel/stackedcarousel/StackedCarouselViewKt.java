package com.paypal.oslo.feature.home.ui.components.nbacarousel.stackedcarousel;

@kotlin.Metadata(d1 = {"\u0000@\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0007\n\u0000\u001aM\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072&\u0010\b\u001a\"\u0012\u0013\u0012\u00110\u0003¢\u0006\f\b\n\u0012\b\b\u000b\u0012\u0004\b\b(\u0002\u0012\u0004\u0012\u00020\u00010\t¢\u0006\u0002\b\fH\u0003¢\u0006\u0002\u0010\r\u001ae\u0010\u000e\u001a\u00020\u00012\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00030\u00102\b\b\u0002\u0010\u0011\u001a\u00020\u00122&\u0010\b\u001a\"\u0012\u0013\u0012\u00110\u0003¢\u0006\f\b\n\u0012\b\b\u000b\u0012\u0004\b\b(\u0002\u0012\u0004\u0012\u00020\u00010\t¢\u0006\u0002\b\f2\u0016\b\u0002\u0010\u0013\u001a\u0010\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u0001\u0018\u00010\tH\u0001¢\u0006\u0002\u0010\u0014¨\u0006\u0015²\u0006\n\u0010\u0016\u001a\u00020\u0017X\u008a\u0084\u0002²\u0006\n\u0010\u0018\u001a\u00020\u0017X\u008a\u0084\u0002"}, d2 = {"CarouselCard", "", "item", "Lcom/paypal/oslo/feature/home/domain/model/OfferNBAItem;", "index", "", "controller", "Lcom/paypal/oslo/feature/home/ui/components/nbacarousel/stackedcarousel/StackController;", "content", "Lkotlin/Function1;", "Lkotlin/ParameterName;", "name", "Landroidx/compose/runtime/Composable;", "(Lcom/paypal/oslo/feature/home/domain/model/OfferNBAItem;ILcom/paypal/oslo/feature/home/ui/components/nbacarousel/stackedcarousel/StackController;Lkotlin/jvm/functions/Function3;Landroidx/compose/runtime/Composer;I)V", "StackedCarouselView", "items", "", "modifier", "Landroidx/compose/ui/Modifier;", "onItemChanged", "(Ljava/util/List;Landroidx/compose/ui/Modifier;Lkotlin/jvm/functions/Function3;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V", "home_prodRelease", "animatedScale", "", "animatedAlpha"}, k = 2, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class StackedCarouselViewKt {
    private static final void getHighSpeedVideoFpsRanges(final com.paypal.oslo.feature.home.domain.model.OfferNBAItem offerNBAItem, final int i, final com.paypal.oslo.feature.home.ui.components.nbacarousel.stackedcarousel.StackController stackController, final kotlin.jvm.functions.Function3<? super com.paypal.oslo.feature.home.domain.model.OfferNBAItem, ? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.Unit> function3, androidx.compose.runtime.Composer composer, final int i2) {
        int i3;
        androidx.compose.runtime.Composer composer2;
        int i4;
        androidx.compose.ui.Modifier.Companion companion;
        androidx.compose.runtime.Composer startRestartGroup = composer.startRestartGroup(-931378269);
        if ((i2 & 6) == 0) {
            i3 = ((i2 & 8) == 0 ? startRestartGroup.changed(offerNBAItem) : startRestartGroup.changedInstance(offerNBAItem) ? 4 : 2) | i2;
        } else {
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            i3 |= startRestartGroup.changed(i) ? 32 : 16;
        }
        if ((i2 & 384) == 0) {
            i3 |= startRestartGroup.changedInstance(stackController) ? 256 : 128;
        }
        if ((i2 & 3072) == 0) {
            i3 |= startRestartGroup.changedInstance(function3) ? 2048 : 1024;
        }
        int i5 = i3;
        if (!startRestartGroup.shouldExecute((i5 & 1171) != 1170, i5 & 1)) {
            composer2 = startRestartGroup;
            composer2.skipToGroupEnd();
        } else {
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventStart(-931378269, i5, -1, "com.paypal.oslo.feature.home.ui.components.nbacarousel.stackedcarousel.CarouselCard (StackedCarouselView.kt:36)");
            }
            com.paypal.oslo.feature.home.ui.components.nbacarousel.stackedcarousel.StackCardTransform transform = stackController.transform(i);
            boolean z = stackController.relativePosition(i) == 0;
            androidx.compose.ui.Modifier cardTransform = com.paypal.oslo.feature.home.ui.components.nbacarousel.stackedcarousel.CardTransformModifierKt.cardTransform(androidx.compose.ui.ZIndexModifierKt.zIndex(androidx.compose.ui.Modifier.INSTANCE, transform.getZIndex()), new com.paypal.oslo.feature.home.ui.components.nbacarousel.stackedcarousel.StackCardTransform(androidx.compose.animation.core.AnimateAsStateKt.animateFloatAsState(transform.getScale(), com.paypal.oslo.feature.home.ui.components.nbacarousel.stackedcarousel.StackConfiguration.INSTANCE.getSWIPE_ANIMATION(), 0.0f, "card scale animation", null, startRestartGroup, 3072, 20).getValue().floatValue(), transform.m14975getOffsetXD9Ej5fM(), transform.m14976getOffsetYD9Ej5fM(), transform.getZIndex(), androidx.compose.animation.core.AnimateAsStateKt.animateFloatAsState(transform.getAlpha(), com.paypal.oslo.feature.home.ui.components.nbacarousel.stackedcarousel.StackConfiguration.INSTANCE.getSWIPE_ANIMATION(), 0.0f, "card alpha animation", null, startRestartGroup, 3072, 20).getValue().floatValue(), null), startRestartGroup, 0);
            if (z) {
                startRestartGroup.startReplaceGroup(-1200060883);
                androidx.compose.ui.Modifier.Companion companion2 = androidx.compose.ui.Modifier.INSTANCE;
                com.paypal.pds.core.PDSIndication.None none = com.paypal.pds.core.PDSIndication.None.INSTANCE;
                boolean changedInstance = startRestartGroup.changedInstance(stackController);
                java.lang.Object rememberedValue = startRestartGroup.rememberedValue();
                if (changedInstance || rememberedValue == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                    rememberedValue = new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.feature.home.ui.components.nbacarousel.stackedcarousel.StackedCarouselViewKt$$ExternalSyntheticLambda2
                        @Override // kotlin.jvm.functions.Function0
                        public final java.lang.Object invoke() {
                            return com.paypal.oslo.feature.home.ui.components.nbacarousel.stackedcarousel.StackedCarouselViewKt.$r8$lambda$cfplrq_BMugH56UDZPbHk23hFTA(com.paypal.oslo.feature.home.ui.components.nbacarousel.stackedcarousel.StackController.this);
                        }
                    };
                    startRestartGroup.updateRememberedValue(rememberedValue);
                }
                i4 = i5;
                companion = com.paypal.pds.core.ModifierExtensionsKt.m22100clickable_mRqjOc(companion2, null, none, false, null, null, (kotlin.jvm.functions.Function0) rememberedValue, startRestartGroup, 390, 29);
                startRestartGroup.endReplaceGroup();
                composer2 = startRestartGroup;
            } else {
                i4 = i5;
                composer2 = startRestartGroup;
                composer2.startReplaceGroup(-1199820881);
                composer2.endReplaceGroup();
                companion = androidx.compose.ui.Modifier.INSTANCE;
            }
            androidx.compose.ui.Modifier then = cardTransform.then(companion);
            androidx.compose.ui.layout.MeasurePolicy maybeCachedBoxMeasurePolicy = androidx.compose.foundation.layout.BoxKt.maybeCachedBoxMeasurePolicy(androidx.compose.ui.Alignment.INSTANCE.getTopStart(), false);
            int hashCode = java.lang.Long.hashCode(androidx.compose.runtime.ComposablesKt.getCurrentCompositeKeyHashCode(composer2, 0));
            androidx.compose.runtime.CompositionLocalMap currentCompositionLocalMap = composer2.getCurrentCompositionLocalMap();
            androidx.compose.ui.Modifier materializeModifier = androidx.compose.ui.ComposedModifierKt.materializeModifier(composer2, then);
            kotlin.jvm.functions.Function0<androidx.compose.ui.node.ComposeUiNode> constructor = androidx.compose.ui.node.ComposeUiNode.INSTANCE.getConstructor();
            if (!(composer2.getApplier() instanceof androidx.compose.runtime.Applier)) {
                androidx.compose.runtime.ComposablesKt.invalidApplier();
            }
            composer2.startReusableNode();
            if (composer2.getInserting()) {
                composer2.createNode(constructor);
            } else {
                composer2.useNode();
            }
            androidx.compose.runtime.Composer m5299constructorimpl = androidx.compose.runtime.Updater.m5299constructorimpl(composer2);
            androidx.compose.runtime.Updater.m5307setimpl(m5299constructorimpl, maybeCachedBoxMeasurePolicy, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetMeasurePolicy());
            androidx.compose.runtime.Updater.m5307setimpl(m5299constructorimpl, currentCompositionLocalMap, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
            androidx.compose.runtime.Updater.m5303initimpl(m5299constructorimpl, java.lang.Integer.valueOf(hashCode), androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetCompositeKeyHash());
            androidx.compose.runtime.Updater.m5305reconcileimpl(m5299constructorimpl, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getApplyOnDeactivatedNodeAssertion());
            androidx.compose.runtime.Updater.m5307setimpl(m5299constructorimpl, materializeModifier, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetModifier());
            androidx.compose.foundation.layout.BoxScopeInstance boxScopeInstance = androidx.compose.foundation.layout.BoxScopeInstance.INSTANCE;
            function3.invoke(offerNBAItem, composer2, java.lang.Integer.valueOf(com.paypal.oslo.core.telemetry.analytics.context.AnalyticsContext.$stable | (i4 & 14) | ((i4 >> 6) & 112)));
            composer2.endNode();
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventEnd();
            }
        }
        androidx.compose.runtime.ScopeUpdateScope endRestartGroup = composer2.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new kotlin.jvm.functions.Function2() { // from class: com.paypal.oslo.feature.home.ui.components.nbacarousel.stackedcarousel.StackedCarouselViewKt$$ExternalSyntheticLambda3
                @Override // kotlin.jvm.functions.Function2
                public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                    return com.paypal.oslo.feature.home.ui.components.nbacarousel.stackedcarousel.StackedCarouselViewKt.$r8$lambda$oGLmdilE9k88KB_S8Cr_gbZxnRg(com.paypal.oslo.feature.home.domain.model.OfferNBAItem.this, i, stackController, function3, i2, (androidx.compose.runtime.Composer) obj, ((java.lang.Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0047  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0059  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0079  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0084  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x01f0  */
    /* JADX WARN: Removed duplicated region for block: B:86:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:92:0x01e5  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x007b  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x005c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void StackedCarouselView(final java.util.List<com.paypal.oslo.feature.home.domain.model.OfferNBAItem> list, androidx.compose.ui.Modifier modifier, final kotlin.jvm.functions.Function3<? super com.paypal.oslo.feature.home.domain.model.OfferNBAItem, ? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.Unit> function3, kotlin.jvm.functions.Function1<? super java.lang.Integer, kotlin.Unit> function1, androidx.compose.runtime.Composer composer, final int i, final int i2) {
        int i3;
        androidx.compose.ui.Modifier modifier2;
        int i4;
        kotlin.jvm.functions.Function1<? super java.lang.Integer, kotlin.Unit> function12;
        int i5;
        final androidx.compose.ui.Modifier modifier3;
        final kotlin.jvm.functions.Function1<? super java.lang.Integer, kotlin.Unit> function13;
        androidx.compose.runtime.ScopeUpdateScope endRestartGroup;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(list, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(function3, "");
        androidx.compose.runtime.Composer startRestartGroup = composer.startRestartGroup(876899490);
        if ((i & 6) == 0) {
            i3 = (startRestartGroup.changedInstance(list) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        int i6 = i2 & 2;
        if (i6 != 0) {
            i3 |= 48;
        } else if ((i & 48) == 0) {
            modifier2 = modifier;
            i3 |= startRestartGroup.changed(modifier2) ? 32 : 16;
            if ((i & 384) == 0) {
                i3 |= startRestartGroup.changedInstance(function3) ? 256 : 128;
            }
            i4 = i2 & 8;
            if (i4 == 0) {
                i3 |= 3072;
            } else if ((i & 3072) == 0) {
                function12 = function1;
                i3 |= startRestartGroup.changedInstance(function12) ? 2048 : 1024;
                i5 = i3;
                int i7 = 0;
                if (!startRestartGroup.shouldExecute((i5 & 1171) != 1170, i5 & 1)) {
                    startRestartGroup.skipToGroupEnd();
                    modifier3 = modifier2;
                    function13 = function12;
                } else {
                    androidx.compose.ui.Modifier modifier4 = i6 != 0 ? androidx.compose.ui.Modifier.INSTANCE : modifier2;
                    kotlin.jvm.functions.Function1<? super java.lang.Integer, kotlin.Unit> function14 = i4 != 0 ? null : function12;
                    if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                        androidx.compose.runtime.ComposerKt.traceEventStart(876899490, i5, -1, "com.paypal.oslo.feature.home.ui.components.nbacarousel.stackedcarousel.StackedCarouselView (StackedCarouselView.kt:89)");
                    }
                    if (list.isEmpty()) {
                        if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                            androidx.compose.runtime.ComposerKt.traceEventEnd();
                        }
                        androidx.compose.runtime.ScopeUpdateScope endRestartGroup2 = startRestartGroup.endRestartGroup();
                        if (endRestartGroup2 != null) {
                            final androidx.compose.ui.Modifier modifier5 = modifier4;
                            final kotlin.jvm.functions.Function1<? super java.lang.Integer, kotlin.Unit> function15 = function14;
                            endRestartGroup2.updateScope(new kotlin.jvm.functions.Function2() { // from class: com.paypal.oslo.feature.home.ui.components.nbacarousel.stackedcarousel.StackedCarouselViewKt$$ExternalSyntheticLambda0
                                @Override // kotlin.jvm.functions.Function2
                                public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                                    return com.paypal.oslo.feature.home.ui.components.nbacarousel.stackedcarousel.StackedCarouselViewKt.$r8$lambda$bZ0aW_YQv9Wkyk32UjAEhUYDtwc(list, modifier5, function3, function15, i, i2, (androidx.compose.runtime.Composer) obj, ((java.lang.Integer) obj2).intValue());
                                }
                            });
                            return;
                        }
                        return;
                    }
                    java.lang.Object rememberedValue = startRestartGroup.rememberedValue();
                    if (rememberedValue == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                        rememberedValue = new com.paypal.oslo.feature.home.ui.components.nbacarousel.stackedcarousel.StackController(list);
                        startRestartGroup.updateRememberedValue(rememberedValue);
                    }
                    com.paypal.oslo.feature.home.ui.components.nbacarousel.stackedcarousel.StackController stackController = (com.paypal.oslo.feature.home.ui.components.nbacarousel.stackedcarousel.StackController) rememberedValue;
                    int currentIndex = stackController.getCurrentIndex();
                    boolean z = (i5 & 7168) == 2048;
                    boolean changedInstance = startRestartGroup.changedInstance(stackController);
                    com.paypal.oslo.feature.home.ui.components.nbacarousel.stackedcarousel.StackedCarouselViewKt$StackedCarouselView$2$1 rememberedValue2 = startRestartGroup.rememberedValue();
                    if ((z | changedInstance) || rememberedValue2 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                        rememberedValue2 = new com.paypal.oslo.feature.home.ui.components.nbacarousel.stackedcarousel.StackedCarouselViewKt$StackedCarouselView$2$1(function14, stackController, null);
                        startRestartGroup.updateRememberedValue(rememberedValue2);
                    }
                    androidx.compose.runtime.EffectsKt.LaunchedEffect(java.lang.Integer.valueOf(currentIndex), (kotlin.jvm.functions.Function2<? super kotlinx.coroutines.CoroutineScope, ? super kotlin.coroutines.Continuation<? super kotlin.Unit>, ? extends java.lang.Object>) rememberedValue2, startRestartGroup, 0);
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
                    startRestartGroup.startReplaceGroup(-1634080133);
                    java.util.Iterator<T> it = list.iterator();
                    while (true) {
                        int i8 = i7;
                        if (!it.hasNext()) {
                            break;
                        }
                        java.lang.Object next = it.next();
                        i7 = i8 + 1;
                        if (i8 < 0) {
                            kotlin.collections.CollectionsKt.throwIndexOverflow();
                        }
                        com.paypal.oslo.feature.home.domain.model.OfferNBAItem offerNBAItem = (com.paypal.oslo.feature.home.domain.model.OfferNBAItem) next;
                        if (stackController.isVisible(i8)) {
                            startRestartGroup.startReplaceGroup(808463601);
                            getHighSpeedVideoFpsRanges(offerNBAItem, i8, stackController, function3, startRestartGroup, com.paypal.oslo.core.telemetry.analytics.context.AnalyticsContext.$stable | ((i5 << 3) & 7168));
                            startRestartGroup.endReplaceGroup();
                        } else {
                            startRestartGroup.startReplaceGroup(808669255);
                            startRestartGroup.endReplaceGroup();
                        }
                    }
                    startRestartGroup.endReplaceGroup();
                    startRestartGroup.endNode();
                    if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                        androidx.compose.runtime.ComposerKt.traceEventEnd();
                    }
                    modifier3 = modifier4;
                    function13 = function14;
                }
                endRestartGroup = startRestartGroup.endRestartGroup();
                if (endRestartGroup != null) {
                    endRestartGroup.updateScope(new kotlin.jvm.functions.Function2() { // from class: com.paypal.oslo.feature.home.ui.components.nbacarousel.stackedcarousel.StackedCarouselViewKt$$ExternalSyntheticLambda1
                        @Override // kotlin.jvm.functions.Function2
                        public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                            return com.paypal.oslo.feature.home.ui.components.nbacarousel.stackedcarousel.StackedCarouselViewKt.m14979$r8$lambda$NJORpp18cgb4TXAUH1HoOkrytI(list, modifier3, function3, function13, i, i2, (androidx.compose.runtime.Composer) obj, ((java.lang.Integer) obj2).intValue());
                        }
                    });
                    return;
                }
                return;
            }
            function12 = function1;
            i5 = i3;
            int i72 = 0;
            if (!startRestartGroup.shouldExecute((i5 & 1171) != 1170, i5 & 1)) {
            }
            endRestartGroup = startRestartGroup.endRestartGroup();
            if (endRestartGroup != null) {
            }
        }
        modifier2 = modifier;
        if ((i & 384) == 0) {
        }
        i4 = i2 & 8;
        if (i4 == 0) {
        }
        function12 = function1;
        i5 = i3;
        int i722 = 0;
        if (!startRestartGroup.shouldExecute((i5 & 1171) != 1170, i5 & 1)) {
        }
        endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
        }
    }

    /* renamed from: $r8$lambda$NJORpp18cgb4TXAUH1Ho-OkrytI, reason: not valid java name */
    public static /* synthetic */ kotlin.Unit m14979$r8$lambda$NJORpp18cgb4TXAUH1HoOkrytI(java.util.List list, androidx.compose.ui.Modifier modifier, kotlin.jvm.functions.Function3 function3, kotlin.jvm.functions.Function1 function1, int i, int i2, androidx.compose.runtime.Composer composer, int i3) {
        StackedCarouselView(list, modifier, function3, function1, composer, androidx.compose.runtime.RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$bZ0aW_YQv9Wkyk32UjAEhUYDtwc(java.util.List list, androidx.compose.ui.Modifier modifier, kotlin.jvm.functions.Function3 function3, kotlin.jvm.functions.Function1 function1, int i, int i2, androidx.compose.runtime.Composer composer, int i3) {
        StackedCarouselView(list, modifier, function3, function1, composer, androidx.compose.runtime.RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$cfplrq_BMugH56UDZPbHk23hFTA(com.paypal.oslo.feature.home.ui.components.nbacarousel.stackedcarousel.StackController stackController) {
        stackController.moveToNext();
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$oGLmdilE9k88KB_S8Cr_gbZxnRg(com.paypal.oslo.feature.home.domain.model.OfferNBAItem offerNBAItem, int i, com.paypal.oslo.feature.home.ui.components.nbacarousel.stackedcarousel.StackController stackController, kotlin.jvm.functions.Function3 function3, int i2, androidx.compose.runtime.Composer composer, int i3) {
        getHighSpeedVideoFpsRanges(offerNBAItem, i, stackController, function3, composer, androidx.compose.runtime.RecomposeScopeImplKt.updateChangedFlags(i2 | 1));
        return kotlin.Unit.INSTANCE;
    }
}
