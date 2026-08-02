package com.paypal.oslo.feature.searchandintelligence.ui.component.categorycard;

@kotlin.Metadata(d1 = {"\u0000 \n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a3\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0012\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00010\u00052\b\b\u0002\u0010\u0007\u001a\u00020\bH\u0001¢\u0006\u0002\u0010\t\u001a\r\u0010\n\u001a\u00020\u0001H\u0003¢\u0006\u0002\u0010\u000b¨\u0006\f"}, d2 = {"CategoryCardCarouselComponent", "", "carousel", "Lcom/paypal/oslo/feature/searchandintelligence/domain/model/categorycard/CategoryCardCarousel;", "onCardClick", "Lkotlin/Function1;", "Lcom/paypal/oslo/feature/searchandintelligence/domain/model/categorycard/CategoryCard;", "modifier", "Landroidx/compose/ui/Modifier;", "(Lcom/paypal/oslo/feature/searchandintelligence/domain/model/categorycard/CategoryCardCarousel;Lkotlin/jvm/functions/Function1;Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;II)V", "CategoryCardCarouselComponentPreview", "(Landroidx/compose/runtime/Composer;I)V", "search-and-intelligence_prodRelease"}, k = 2, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class CategoryCardCarouselComponentKt {
    /* JADX WARN: Removed duplicated region for block: B:20:0x005d  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0068  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x00e6  */
    /* JADX WARN: Removed duplicated region for block: B:44:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:47:0x00dd  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x005f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void CategoryCardCarouselComponent(final com.paypal.oslo.feature.searchandintelligence.domain.model.categorycard.CategoryCardCarousel categoryCardCarousel, final kotlin.jvm.functions.Function1<? super com.paypal.oslo.feature.searchandintelligence.domain.model.categorycard.CategoryCard, kotlin.Unit> function1, androidx.compose.ui.Modifier modifier, androidx.compose.runtime.Composer composer, final int i, final int i2) {
        int i3;
        androidx.compose.ui.Modifier modifier2;
        androidx.compose.runtime.ScopeUpdateScope endRestartGroup;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(categoryCardCarousel, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(function1, "");
        androidx.compose.runtime.Composer startRestartGroup = composer.startRestartGroup(-1930185650);
        if ((i & 6) == 0) {
            i3 = (startRestartGroup.changedInstance(categoryCardCarousel) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i & 48) == 0) {
            i3 |= startRestartGroup.changedInstance(function1) ? 32 : 16;
        }
        int i4 = i2 & 4;
        if (i4 != 0) {
            i3 |= 384;
        } else if ((i & 384) == 0) {
            modifier2 = modifier;
            i3 |= startRestartGroup.changed(modifier2) ? 256 : 128;
            if (startRestartGroup.shouldExecute((i3 & 147) == 146, i3 & 1)) {
                startRestartGroup.skipToGroupEnd();
            } else {
                androidx.compose.ui.Modifier modifier3 = i4 != 0 ? androidx.compose.ui.Modifier.INSTANCE : modifier2;
                if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                    androidx.compose.runtime.ComposerKt.traceEventStart(-1930185650, i3, -1, "com.paypal.oslo.feature.searchandintelligence.ui.component.categorycard.CategoryCardCarouselComponent (CategoryCardCarouselComponent.kt:46)");
                }
                androidx.compose.foundation.layout.PaddingValues m1701PaddingValuesYgX7TsA$default = androidx.compose.foundation.layout.PaddingKt.m1701PaddingValuesYgX7TsA$default(com.paypal.pds.core.ConstantsKt.getSpacing16(), 0.0f, 2, null);
                androidx.compose.foundation.layout.Arrangement.HorizontalOrVertical m1602spacedBy0680j_4 = androidx.compose.foundation.layout.Arrangement.INSTANCE.m1602spacedBy0680j_4(com.paypal.pds.core.ConstantsKt.getSpacing12());
                androidx.compose.ui.Modifier testTag = androidx.compose.ui.platform.TestTagKt.testTag(androidx.compose.foundation.layout.SizeKt.fillMaxWidth$default(modifier3, 0.0f, 1, null), "categoryCardCarousel");
                androidx.compose.foundation.layout.Arrangement.HorizontalOrVertical horizontalOrVertical = m1602spacedBy0680j_4;
                boolean changedInstance = startRestartGroup.changedInstance(categoryCardCarousel);
                boolean z = (i3 & 112) == 32;
                java.lang.Object rememberedValue = startRestartGroup.rememberedValue();
                if ((changedInstance | z) || rememberedValue == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                    rememberedValue = new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.searchandintelligence.ui.component.categorycard.CategoryCardCarouselComponentKt$$ExternalSyntheticLambda0
                        @Override // kotlin.jvm.functions.Function1
                        public final java.lang.Object invoke(java.lang.Object obj) {
                            return com.paypal.oslo.feature.searchandintelligence.ui.component.categorycard.CategoryCardCarouselComponentKt.m19176$r8$lambda$9K1rplbTCzNdGsu4E5dUKrOhs(com.paypal.oslo.feature.searchandintelligence.domain.model.categorycard.CategoryCardCarousel.this, function1, (androidx.compose.foundation.lazy.LazyListScope) obj);
                        }
                    };
                    startRestartGroup.updateRememberedValue(rememberedValue);
                }
                androidx.compose.ui.Modifier modifier4 = modifier3;
                androidx.compose.foundation.lazy.LazyDslKt.LazyRow(testTag, null, m1701PaddingValuesYgX7TsA$default, false, horizontalOrVertical, null, null, false, null, (kotlin.jvm.functions.Function1) rememberedValue, startRestartGroup, 0, 490);
                if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                    androidx.compose.runtime.ComposerKt.traceEventEnd();
                }
                modifier2 = modifier4;
            }
            endRestartGroup = startRestartGroup.endRestartGroup();
            if (endRestartGroup == null) {
                final androidx.compose.ui.Modifier modifier5 = modifier2;
                endRestartGroup.updateScope(new kotlin.jvm.functions.Function2() { // from class: com.paypal.oslo.feature.searchandintelligence.ui.component.categorycard.CategoryCardCarouselComponentKt$$ExternalSyntheticLambda1
                    @Override // kotlin.jvm.functions.Function2
                    public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                        return com.paypal.oslo.feature.searchandintelligence.ui.component.categorycard.CategoryCardCarouselComponentKt.m19177$r8$lambda$sMo8_dWhGIdhEccmeuLkq8Fjjg(com.paypal.oslo.feature.searchandintelligence.domain.model.categorycard.CategoryCardCarousel.this, function1, modifier5, i, i2, (androidx.compose.runtime.Composer) obj, ((java.lang.Integer) obj2).intValue());
                    }
                });
                return;
            }
            return;
        }
        modifier2 = modifier;
        if (startRestartGroup.shouldExecute((i3 & 147) == 146, i3 & 1)) {
        }
        endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup == null) {
        }
    }

    /* renamed from: $r8$lambda$9K-1rplbTCzNdGsu4E5dU-KrOhs, reason: not valid java name */
    public static /* synthetic */ kotlin.Unit m19176$r8$lambda$9K1rplbTCzNdGsu4E5dUKrOhs(com.paypal.oslo.feature.searchandintelligence.domain.model.categorycard.CategoryCardCarousel categoryCardCarousel, final kotlin.jvm.functions.Function1 function1, androidx.compose.foundation.lazy.LazyListScope lazyListScope) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(lazyListScope, "");
        final java.util.List<com.paypal.oslo.feature.searchandintelligence.domain.model.categorycard.CategoryCard> cards = categoryCardCarousel.getCards();
        final kotlin.jvm.functions.Function2 function2 = new kotlin.jvm.functions.Function2() { // from class: com.paypal.oslo.feature.searchandintelligence.ui.component.categorycard.CategoryCardCarouselComponentKt$$ExternalSyntheticLambda2
            @Override // kotlin.jvm.functions.Function2
            public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                return com.paypal.oslo.feature.searchandintelligence.ui.component.categorycard.CategoryCardCarouselComponentKt.$r8$lambda$i_0J3V68_lVi5Wi8aOnjEAZQSCE(((java.lang.Integer) obj).intValue(), (com.paypal.oslo.feature.searchandintelligence.domain.model.categorycard.CategoryCard) obj2);
            }
        };
        lazyListScope.items(cards.size(), new kotlin.jvm.functions.Function1<java.lang.Integer, java.lang.Object>() { // from class: com.paypal.oslo.feature.searchandintelligence.ui.component.categorycard.CategoryCardCarouselComponentKt$CategoryCardCarouselComponent$lambda$0$0$$inlined$itemsIndexed$default$1
            @Override // kotlin.jvm.functions.Function1
            public final /* synthetic */ java.lang.Object invoke(java.lang.Integer num) {
                return invoke(num.intValue());
            }

            public final java.lang.Object invoke(int i) {
                return kotlin.jvm.functions.Function2.this.invoke(java.lang.Integer.valueOf(i), cards.get(i));
            }
        }, new kotlin.jvm.functions.Function1<java.lang.Integer, java.lang.Object>() { // from class: com.paypal.oslo.feature.searchandintelligence.ui.component.categorycard.CategoryCardCarouselComponentKt$CategoryCardCarouselComponent$lambda$0$0$$inlined$itemsIndexed$default$2
            @Override // kotlin.jvm.functions.Function1
            public final /* synthetic */ java.lang.Object invoke(java.lang.Integer num) {
                return invoke(num.intValue());
            }

            public final java.lang.Object invoke(int i) {
                cards.get(i);
                return null;
            }
        }, androidx.compose.runtime.internal.ComposableLambdaKt.composableLambdaInstance(2039820996, true, new kotlin.jvm.functions.Function4<androidx.compose.foundation.lazy.LazyItemScope, java.lang.Integer, androidx.compose.runtime.Composer, java.lang.Integer, kotlin.Unit>() { // from class: com.paypal.oslo.feature.searchandintelligence.ui.component.categorycard.CategoryCardCarouselComponentKt$CategoryCardCarouselComponent$lambda$0$0$$inlined$itemsIndexed$default$3
            @Override // kotlin.jvm.functions.Function4
            public final /* synthetic */ kotlin.Unit invoke(androidx.compose.foundation.lazy.LazyItemScope lazyItemScope, java.lang.Integer num, androidx.compose.runtime.Composer composer, java.lang.Integer num2) {
                invoke(lazyItemScope, num.intValue(), composer, num2.intValue());
                return kotlin.Unit.INSTANCE;
            }

            public final void invoke(androidx.compose.foundation.lazy.LazyItemScope lazyItemScope, int i, androidx.compose.runtime.Composer composer, int i2) {
                int i3;
                if ((i2 & 6) == 0) {
                    i3 = (composer.changed(lazyItemScope) ? 4 : 2) | i2;
                } else {
                    i3 = i2;
                }
                if ((i2 & 48) == 0) {
                    i3 |= composer.changed(i) ? 32 : 16;
                }
                if (!composer.shouldExecute((i3 & 147) != 146, i3 & 1)) {
                    composer.skipToGroupEnd();
                    return;
                }
                if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                    androidx.compose.runtime.ComposerKt.traceEventStart(2039820996, i3, -1, "androidx.compose.foundation.lazy.itemsIndexed.<anonymous> (LazyDsl.kt:214)");
                }
                final com.paypal.oslo.feature.searchandintelligence.domain.model.categorycard.CategoryCard categoryCard = (com.paypal.oslo.feature.searchandintelligence.domain.model.categorycard.CategoryCard) cards.get(i);
                composer.startReplaceGroup(574165013);
                boolean changed = composer.changed(function1);
                boolean changedInstance = composer.changedInstance(categoryCard);
                java.lang.Object rememberedValue = composer.rememberedValue();
                if ((changed | changedInstance) || rememberedValue == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                    final kotlin.jvm.functions.Function1 function12 = function1;
                    rememberedValue = (kotlin.jvm.functions.Function0) new kotlin.jvm.functions.Function0<kotlin.Unit>() { // from class: com.paypal.oslo.feature.searchandintelligence.ui.component.categorycard.CategoryCardCarouselComponentKt$CategoryCardCarouselComponent$1$1$2$1$1
                        @Override // kotlin.jvm.functions.Function0
                        public final /* bridge */ /* synthetic */ kotlin.Unit invoke() {
                            function12.invoke(categoryCard);
                            return kotlin.Unit.INSTANCE;
                        }
                    };
                    composer.updateRememberedValue(rememberedValue);
                }
                com.paypal.oslo.feature.searchandintelligence.ui.component.categorycard.CategoryCardComponentKt.CategoryCardComponent(categoryCard, (kotlin.jvm.functions.Function0) rememberedValue, com.paypal.oslo.feature.searchandintelligence.ui.analytics.InstrumentationUtilsKt.instrument$default(androidx.compose.ui.Modifier.INSTANCE, com.paypal.oslo.feature.searchandintelligence.ui.analytics.categorycard.CategoryCardComponentAnalyticsConfig.INSTANCE, (java.lang.Integer) null, java.lang.Integer.valueOf(i), 2, (java.lang.Object) null), composer, 0, 0);
                composer.endReplaceGroup();
                if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                    androidx.compose.runtime.ComposerKt.traceEventEnd();
                }
            }
        }));
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$hX_Rdfx1ExLXfDMJMSYM6qPRG3Y(int i, androidx.compose.runtime.Composer composer, int i2) {
        final int updateChangedFlags = androidx.compose.runtime.RecomposeScopeImplKt.updateChangedFlags(i | 1);
        androidx.compose.runtime.Composer startRestartGroup = composer.startRestartGroup(-1094597810);
        if (!startRestartGroup.shouldExecute(updateChangedFlags != 0, updateChangedFlags & 1)) {
            startRestartGroup.skipToGroupEnd();
        } else {
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventStart(-1094597810, updateChangedFlags, -1, "com.paypal.oslo.feature.searchandintelligence.ui.component.categorycard.CategoryCardCarouselComponentPreview (CategoryCardCarouselComponent.kt:70)");
            }
            com.paypal.oslo.feature.searchandintelligence.ui.preview.SearchAndIntelligencePreviewKt.SearchAndIntelligencePreview(com.paypal.oslo.feature.searchandintelligence.ui.component.categorycard.ComposableSingletons$CategoryCardCarouselComponentKt.INSTANCE.getLambda$593061415$search_and_intelligence_prodRelease(), startRestartGroup, 6);
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventEnd();
            }
        }
        androidx.compose.runtime.ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new kotlin.jvm.functions.Function2() { // from class: com.paypal.oslo.feature.searchandintelligence.ui.component.categorycard.CategoryCardCarouselComponentKt$$ExternalSyntheticLambda3
                @Override // kotlin.jvm.functions.Function2
                public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                    return com.paypal.oslo.feature.searchandintelligence.ui.component.categorycard.CategoryCardCarouselComponentKt.$r8$lambda$hX_Rdfx1ExLXfDMJMSYM6qPRG3Y(updateChangedFlags, (androidx.compose.runtime.Composer) obj, ((java.lang.Integer) obj2).intValue());
                }
            });
        }
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ java.lang.Object $r8$lambda$i_0J3V68_lVi5Wi8aOnjEAZQSCE(int i, com.paypal.oslo.feature.searchandintelligence.domain.model.categorycard.CategoryCard categoryCard) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(categoryCard, "");
        return categoryCard.getName();
    }

    /* renamed from: $r8$lambda$sMo8_dWhGIdhE-ccmeuLkq8Fjjg, reason: not valid java name */
    public static /* synthetic */ kotlin.Unit m19177$r8$lambda$sMo8_dWhGIdhEccmeuLkq8Fjjg(com.paypal.oslo.feature.searchandintelligence.domain.model.categorycard.CategoryCardCarousel categoryCardCarousel, kotlin.jvm.functions.Function1 function1, androidx.compose.ui.Modifier modifier, int i, int i2, androidx.compose.runtime.Composer composer, int i3) {
        CategoryCardCarouselComponent(categoryCardCarousel, function1, modifier, composer, androidx.compose.runtime.RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
        return kotlin.Unit.INSTANCE;
    }
}
