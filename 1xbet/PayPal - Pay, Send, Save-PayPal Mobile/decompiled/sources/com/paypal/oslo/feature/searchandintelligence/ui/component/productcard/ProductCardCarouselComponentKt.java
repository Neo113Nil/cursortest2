package com.paypal.oslo.feature.searchandintelligence.ui.component.productcard;

@kotlin.Metadata(d1 = {"\u0000.\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a=\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u00052\u0012\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\u00010\u00072\b\b\u0002\u0010\t\u001a\u00020\nH\u0001¢\u0006\u0002\u0010\u000b\u001a\u0014\u0010\f\u001a\u0004\u0018\u00010\r2\b\u0010\u000e\u001a\u0004\u0018\u00010\u0005H\u0002\u001a\r\u0010\u000f\u001a\u00020\u0001H\u0003¢\u0006\u0002\u0010\u0010¨\u0006\u0011"}, d2 = {"ProductCardCarouselComponent", "", "carousel", "Lcom/paypal/oslo/feature/searchandintelligence/domain/model/productcard/ProductCardCarousel;", "type", "Lcom/paypal/oslo/feature/searchandintelligence/domain/model/productcard/CommerceItemType;", "onCardClick", "Lkotlin/Function1;", "Lcom/paypal/oslo/feature/searchandintelligence/domain/model/productcard/ProductCard;", "modifier", "Landroidx/compose/ui/Modifier;", "(Lcom/paypal/oslo/feature/searchandintelligence/domain/model/productcard/ProductCardCarousel;Lcom/paypal/oslo/feature/searchandintelligence/domain/model/productcard/CommerceItemType;Lkotlin/jvm/functions/Function1;Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;II)V", "getAnalyticsConfig", "Lcom/paypal/oslo/feature/searchandintelligence/api/analytics/SearchAndIntelligenceAnalyticsConfig$Component;", "carouselType", "ProductCardCarouselComponentPreview", "(Landroidx/compose/runtime/Composer;I)V", "search-and-intelligence_prodRelease"}, k = 2, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class ProductCardCarouselComponentKt {
    /* JADX WARN: Removed duplicated region for block: B:30:0x007b  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0086  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x0110  */
    /* JADX WARN: Removed duplicated region for block: B:57:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:61:0x0107  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x007d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void ProductCardCarouselComponent(final com.paypal.oslo.feature.searchandintelligence.domain.model.productcard.ProductCardCarousel productCardCarousel, final com.paypal.oslo.feature.searchandintelligence.domain.model.productcard.CommerceItemType commerceItemType, final kotlin.jvm.functions.Function1<? super com.paypal.oslo.feature.searchandintelligence.domain.model.productcard.ProductCard, kotlin.Unit> function1, androidx.compose.ui.Modifier modifier, androidx.compose.runtime.Composer composer, final int i, final int i2) {
        int i3;
        androidx.compose.ui.Modifier modifier2;
        androidx.compose.runtime.ScopeUpdateScope endRestartGroup;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(productCardCarousel, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(function1, "");
        androidx.compose.runtime.Composer startRestartGroup = composer.startRestartGroup(-243819094);
        if ((i & 6) == 0) {
            i3 = (startRestartGroup.changedInstance(productCardCarousel) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i & 48) == 0) {
            i3 |= startRestartGroup.changed(commerceItemType == null ? -1 : commerceItemType.ordinal()) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i3 |= startRestartGroup.changedInstance(function1) ? 256 : 128;
        }
        int i4 = i2 & 8;
        if (i4 != 0) {
            i3 |= 3072;
        } else if ((i & 3072) == 0) {
            modifier2 = modifier;
            i3 |= startRestartGroup.changed(modifier2) ? 2048 : 1024;
            if (startRestartGroup.shouldExecute((i3 & 1171) == 1170, i3 & 1)) {
                startRestartGroup.skipToGroupEnd();
            } else {
                androidx.compose.ui.Modifier modifier3 = i4 != 0 ? androidx.compose.ui.Modifier.INSTANCE : modifier2;
                if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                    androidx.compose.runtime.ComposerKt.traceEventStart(-243819094, i3, -1, "com.paypal.oslo.feature.searchandintelligence.ui.component.productcard.ProductCardCarouselComponent (ProductCardCarouselComponent.kt:49)");
                }
                androidx.compose.foundation.layout.PaddingValues m1701PaddingValuesYgX7TsA$default = androidx.compose.foundation.layout.PaddingKt.m1701PaddingValuesYgX7TsA$default(com.paypal.pds.core.ConstantsKt.getSpacing16(), 0.0f, 2, null);
                androidx.compose.foundation.layout.Arrangement.HorizontalOrVertical m1602spacedBy0680j_4 = androidx.compose.foundation.layout.Arrangement.INSTANCE.m1602spacedBy0680j_4(com.paypal.pds.core.ConstantsKt.getSpacing16());
                androidx.compose.ui.Modifier testTag = androidx.compose.ui.platform.TestTagKt.testTag(androidx.compose.foundation.layout.SizeKt.fillMaxWidth$default(modifier3, 0.0f, 1, null), "productCardCarousel");
                androidx.compose.foundation.layout.Arrangement.HorizontalOrVertical horizontalOrVertical = m1602spacedBy0680j_4;
                boolean changedInstance = startRestartGroup.changedInstance(productCardCarousel);
                boolean z = (i3 & 896) == 256;
                boolean z2 = (i3 & 112) == 32;
                java.lang.Object rememberedValue = startRestartGroup.rememberedValue();
                if ((changedInstance | z | z2) || rememberedValue == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                    rememberedValue = new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.searchandintelligence.ui.component.productcard.ProductCardCarouselComponentKt$$ExternalSyntheticLambda1
                        @Override // kotlin.jvm.functions.Function1
                        public final java.lang.Object invoke(java.lang.Object obj) {
                            return com.paypal.oslo.feature.searchandintelligence.ui.component.productcard.ProductCardCarouselComponentKt.$r8$lambda$Vp6Er0VoMij03uqbYn1oVXmwhEU(com.paypal.oslo.feature.searchandintelligence.domain.model.productcard.ProductCardCarousel.this, function1, commerceItemType, (androidx.compose.foundation.lazy.LazyListScope) obj);
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
                endRestartGroup.updateScope(new kotlin.jvm.functions.Function2() { // from class: com.paypal.oslo.feature.searchandintelligence.ui.component.productcard.ProductCardCarouselComponentKt$$ExternalSyntheticLambda2
                    @Override // kotlin.jvm.functions.Function2
                    public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                        return com.paypal.oslo.feature.searchandintelligence.ui.component.productcard.ProductCardCarouselComponentKt.$r8$lambda$xnS9SfqgDgXS3zGqNfJ4gs5tydc(com.paypal.oslo.feature.searchandintelligence.domain.model.productcard.ProductCardCarousel.this, commerceItemType, function1, modifier5, i, i2, (androidx.compose.runtime.Composer) obj, ((java.lang.Integer) obj2).intValue());
                    }
                });
                return;
            }
            return;
        }
        modifier2 = modifier;
        if (startRestartGroup.shouldExecute((i3 & 1171) == 1170, i3 & 1)) {
        }
        endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup == null) {
        }
    }

    public static /* synthetic */ java.lang.Object $r8$lambda$GYKNjvF8HqLH2WqnbJmB1xPMKiw(int i, com.paypal.oslo.feature.searchandintelligence.domain.model.productcard.ProductCard productCard) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(productCard, "");
        return productCard.getId();
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$RhdnHBZlVf1kahQexXv6S0eIxmk(int i, androidx.compose.runtime.Composer composer, int i2) {
        final int updateChangedFlags = androidx.compose.runtime.RecomposeScopeImplKt.updateChangedFlags(i | 1);
        androidx.compose.runtime.Composer startRestartGroup = composer.startRestartGroup(-1608644509);
        if (!startRestartGroup.shouldExecute(updateChangedFlags != 0, updateChangedFlags & 1)) {
            startRestartGroup.skipToGroupEnd();
        } else {
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventStart(-1608644509, updateChangedFlags, -1, "com.paypal.oslo.feature.searchandintelligence.ui.component.productcard.ProductCardCarouselComponentPreview (ProductCardCarouselComponent.kt:83)");
            }
            com.paypal.oslo.feature.searchandintelligence.ui.preview.SearchAndIntelligencePreviewKt.SearchAndIntelligencePreview(com.paypal.oslo.feature.searchandintelligence.ui.component.productcard.ComposableSingletons$ProductCardCarouselComponentKt.INSTANCE.m19179getLambda$675808214$search_and_intelligence_prodRelease(), startRestartGroup, 6);
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventEnd();
            }
        }
        androidx.compose.runtime.ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new kotlin.jvm.functions.Function2() { // from class: com.paypal.oslo.feature.searchandintelligence.ui.component.productcard.ProductCardCarouselComponentKt$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function2
                public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                    return com.paypal.oslo.feature.searchandintelligence.ui.component.productcard.ProductCardCarouselComponentKt.$r8$lambda$RhdnHBZlVf1kahQexXv6S0eIxmk(updateChangedFlags, (androidx.compose.runtime.Composer) obj, ((java.lang.Integer) obj2).intValue());
                }
            });
        }
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$Vp6Er0VoMij03uqbYn1oVXmwhEU(com.paypal.oslo.feature.searchandintelligence.domain.model.productcard.ProductCardCarousel productCardCarousel, final kotlin.jvm.functions.Function1 function1, final com.paypal.oslo.feature.searchandintelligence.domain.model.productcard.CommerceItemType commerceItemType, androidx.compose.foundation.lazy.LazyListScope lazyListScope) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(lazyListScope, "");
        final java.util.List<com.paypal.oslo.feature.searchandintelligence.domain.model.productcard.ProductCard> cards = productCardCarousel.getCards();
        final kotlin.jvm.functions.Function2 function2 = new kotlin.jvm.functions.Function2() { // from class: com.paypal.oslo.feature.searchandintelligence.ui.component.productcard.ProductCardCarouselComponentKt$$ExternalSyntheticLambda3
            @Override // kotlin.jvm.functions.Function2
            public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                return com.paypal.oslo.feature.searchandintelligence.ui.component.productcard.ProductCardCarouselComponentKt.$r8$lambda$GYKNjvF8HqLH2WqnbJmB1xPMKiw(((java.lang.Integer) obj).intValue(), (com.paypal.oslo.feature.searchandintelligence.domain.model.productcard.ProductCard) obj2);
            }
        };
        lazyListScope.items(cards.size(), new kotlin.jvm.functions.Function1<java.lang.Integer, java.lang.Object>() { // from class: com.paypal.oslo.feature.searchandintelligence.ui.component.productcard.ProductCardCarouselComponentKt$ProductCardCarouselComponent$lambda$0$0$$inlined$itemsIndexed$default$1
            @Override // kotlin.jvm.functions.Function1
            public final /* synthetic */ java.lang.Object invoke(java.lang.Integer num) {
                return invoke(num.intValue());
            }

            public final java.lang.Object invoke(int i) {
                return kotlin.jvm.functions.Function2.this.invoke(java.lang.Integer.valueOf(i), cards.get(i));
            }
        }, new kotlin.jvm.functions.Function1<java.lang.Integer, java.lang.Object>() { // from class: com.paypal.oslo.feature.searchandintelligence.ui.component.productcard.ProductCardCarouselComponentKt$ProductCardCarouselComponent$lambda$0$0$$inlined$itemsIndexed$default$2
            @Override // kotlin.jvm.functions.Function1
            public final /* synthetic */ java.lang.Object invoke(java.lang.Integer num) {
                return invoke(num.intValue());
            }

            public final java.lang.Object invoke(int i) {
                cards.get(i);
                return null;
            }
        }, androidx.compose.runtime.internal.ComposableLambdaKt.composableLambdaInstance(2039820996, true, new kotlin.jvm.functions.Function4<androidx.compose.foundation.lazy.LazyItemScope, java.lang.Integer, androidx.compose.runtime.Composer, java.lang.Integer, kotlin.Unit>() { // from class: com.paypal.oslo.feature.searchandintelligence.ui.component.productcard.ProductCardCarouselComponentKt$ProductCardCarouselComponent$lambda$0$0$$inlined$itemsIndexed$default$3
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
                final com.paypal.oslo.feature.searchandintelligence.domain.model.productcard.ProductCard productCard = (com.paypal.oslo.feature.searchandintelligence.domain.model.productcard.ProductCard) cards.get(i);
                composer.startReplaceGroup(-310283562);
                boolean changed = composer.changed(function1);
                boolean changedInstance = composer.changedInstance(productCard);
                java.lang.Object rememberedValue = composer.rememberedValue();
                if ((changed | changedInstance) || rememberedValue == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                    final kotlin.jvm.functions.Function1 function12 = function1;
                    rememberedValue = (kotlin.jvm.functions.Function0) new kotlin.jvm.functions.Function0<kotlin.Unit>() { // from class: com.paypal.oslo.feature.searchandintelligence.ui.component.productcard.ProductCardCarouselComponentKt$ProductCardCarouselComponent$1$1$2$1$1
                        @Override // kotlin.jvm.functions.Function0
                        public final /* bridge */ /* synthetic */ kotlin.Unit invoke() {
                            function12.invoke(productCard);
                            return kotlin.Unit.INSTANCE;
                        }
                    };
                    composer.updateRememberedValue(rememberedValue);
                }
                com.paypal.oslo.feature.searchandintelligence.ui.component.productcard.ProductCardComponentKt.ProductCardComponent(productCard, (kotlin.jvm.functions.Function0) rememberedValue, com.paypal.oslo.feature.searchandintelligence.ui.analytics.InstrumentationUtilsKt.instrument$default(androidx.compose.ui.Modifier.INSTANCE, com.paypal.oslo.feature.searchandintelligence.ui.component.productcard.ProductCardCarouselComponentKt.access$getAnalyticsConfig(commerceItemType), (java.lang.Integer) null, java.lang.Integer.valueOf(i), 2, (java.lang.Object) null), composer, 0, 0);
                composer.endReplaceGroup();
                if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                    androidx.compose.runtime.ComposerKt.traceEventEnd();
                }
            }
        }));
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$xnS9SfqgDgXS3zGqNfJ4gs5tydc(com.paypal.oslo.feature.searchandintelligence.domain.model.productcard.ProductCardCarousel productCardCarousel, com.paypal.oslo.feature.searchandintelligence.domain.model.productcard.CommerceItemType commerceItemType, kotlin.jvm.functions.Function1 function1, androidx.compose.ui.Modifier modifier, int i, int i2, androidx.compose.runtime.Composer composer, int i3) {
        ProductCardCarouselComponent(productCardCarousel, commerceItemType, function1, modifier, composer, androidx.compose.runtime.RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
        return kotlin.Unit.INSTANCE;
    }

    public static final /* synthetic */ com.paypal.oslo.feature.searchandintelligence.api.analytics.SearchAndIntelligenceAnalyticsConfig.Component access$getAnalyticsConfig(com.paypal.oslo.feature.searchandintelligence.domain.model.productcard.CommerceItemType commerceItemType) {
        if (commerceItemType == null) {
            return null;
        }
        if (commerceItemType == com.paypal.oslo.feature.searchandintelligence.domain.model.productcard.CommerceItemType.GIFT_CARD) {
            return com.paypal.oslo.feature.searchandintelligence.ui.analytics.productcard.GiftCardComponentAnalyticsConfig.INSTANCE;
        }
        return com.paypal.oslo.feature.searchandintelligence.ui.analytics.productcard.ProductCardComponentAnalyticsConfig.INSTANCE;
    }
}
