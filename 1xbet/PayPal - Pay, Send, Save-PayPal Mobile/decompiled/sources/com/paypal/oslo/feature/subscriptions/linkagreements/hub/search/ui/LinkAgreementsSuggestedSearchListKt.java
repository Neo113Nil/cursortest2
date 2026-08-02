package com.paypal.oslo.feature.subscriptions.linkagreements.hub.search.ui;

@kotlin.Metadata(d1 = {"\u0000&\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u001aC\u0010\u0000\u001a\u00020\u00012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\u0012\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00010\u00062\b\b\u0002\u0010\u0007\u001a\u00020\b2\b\b\u0002\u0010\t\u001a\u00020\nH\u0007¢\u0006\u0002\u0010\u000b\u001a\r\u0010\f\u001a\u00020\u0001H\u0003¢\u0006\u0002\u0010\r¨\u0006\u000e"}, d2 = {"LinkAgreementsSuggestedSearchList", "", "merchantSearchSuggestions", "", "Lcom/paypal/oslo/feature/subscriptions/linkagreements/hub/domain/model/ConsumerAgreementMerchant;", "onMerchantSelect", "Lkotlin/Function1;", "modifier", "Landroidx/compose/ui/Modifier;", "lazyListState", "Landroidx/compose/foundation/lazy/LazyListState;", "(Ljava/util/List;Lkotlin/jvm/functions/Function1;Landroidx/compose/ui/Modifier;Landroidx/compose/foundation/lazy/LazyListState;Landroidx/compose/runtime/Composer;II)V", "LinkAgreementsSuggestedSearchListPreview", "(Landroidx/compose/runtime/Composer;I)V", "subscriptions_prodRelease"}, k = 2, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class LinkAgreementsSuggestedSearchListKt {
    /* JADX WARN: Removed duplicated region for block: B:20:0x0058  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0077  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0082  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x0124  */
    /* JADX WARN: Removed duplicated region for block: B:58:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:68:0x011a  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x0079  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x006d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void LinkAgreementsSuggestedSearchList(final java.util.List<com.paypal.oslo.feature.subscriptions.linkagreements.hub.domain.model.ConsumerAgreementMerchant> list, final kotlin.jvm.functions.Function1<? super com.paypal.oslo.feature.subscriptions.linkagreements.hub.domain.model.ConsumerAgreementMerchant, kotlin.Unit> function1, androidx.compose.ui.Modifier modifier, androidx.compose.foundation.lazy.LazyListState lazyListState, androidx.compose.runtime.Composer composer, final int i, final int i2) {
        int i3;
        androidx.compose.ui.Modifier modifier2;
        androidx.compose.foundation.lazy.LazyListState lazyListState2;
        androidx.compose.ui.Modifier modifier3;
        androidx.compose.runtime.ScopeUpdateScope endRestartGroup;
        androidx.compose.foundation.lazy.LazyListState lazyListState3;
        int i4;
        int i5;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(list, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(function1, "");
        androidx.compose.runtime.Composer startRestartGroup = composer.startRestartGroup(-1483152048);
        if ((i & 6) == 0) {
            i3 = (startRestartGroup.changedInstance(list) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i & 48) == 0) {
            i3 |= startRestartGroup.changedInstance(function1) ? 32 : 16;
        }
        int i6 = i2 & 4;
        if (i6 != 0) {
            i3 |= 384;
        } else if ((i & 384) == 0) {
            modifier2 = modifier;
            i3 |= startRestartGroup.changed(modifier2) ? 256 : 128;
            if ((i & 3072) != 0) {
                if ((i2 & 8) == 0) {
                    lazyListState2 = lazyListState;
                    if (startRestartGroup.changed(lazyListState2)) {
                        i5 = 2048;
                        i3 |= i5;
                    }
                } else {
                    lazyListState2 = lazyListState;
                }
                i5 = 1024;
                i3 |= i5;
            } else {
                lazyListState2 = lazyListState;
            }
            if (!startRestartGroup.shouldExecute((i3 & 1171) == 1170, i3 & 1)) {
                startRestartGroup.startDefaults();
                if ((i & 1) != 0 && !startRestartGroup.getDefaultsInvalid()) {
                    startRestartGroup.skipToGroupEnd();
                    if ((i2 & 8) != 0) {
                        i3 &= -7169;
                    }
                    i4 = i3;
                    modifier3 = modifier2;
                    lazyListState3 = lazyListState2;
                } else {
                    androidx.compose.ui.Modifier.Companion companion = i6 != 0 ? androidx.compose.ui.Modifier.INSTANCE : modifier2;
                    if ((i2 & 8) != 0) {
                        i3 &= -7169;
                        lazyListState3 = androidx.compose.foundation.lazy.LazyListStateKt.rememberLazyListState(0, 0, startRestartGroup, 0, 3);
                    } else {
                        lazyListState3 = lazyListState2;
                    }
                    androidx.compose.ui.Modifier modifier4 = companion;
                    i4 = i3;
                    modifier3 = modifier4;
                }
                startRestartGroup.endDefaults();
                if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                    androidx.compose.runtime.ComposerKt.traceEventStart(-1483152048, i4, -1, "com.paypal.oslo.feature.subscriptions.linkagreements.hub.search.ui.LinkAgreementsSuggestedSearchList (LinkAgreementsSuggestedSearchList.kt:34)");
                }
                androidx.compose.ui.Modifier testTag = androidx.compose.ui.platform.TestTagKt.testTag(androidx.compose.foundation.layout.SizeKt.fillMaxWidth$default(modifier3, 0.0f, 1, null), "search_suggestions_list");
                boolean changedInstance = startRestartGroup.changedInstance(list);
                boolean z = (i4 & 112) == 32;
                java.lang.Object rememberedValue = startRestartGroup.rememberedValue();
                if ((changedInstance | z) || rememberedValue == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                    rememberedValue = new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.subscriptions.linkagreements.hub.search.ui.LinkAgreementsSuggestedSearchListKt$$ExternalSyntheticLambda2
                        @Override // kotlin.jvm.functions.Function1
                        public final java.lang.Object invoke(java.lang.Object obj) {
                            return com.paypal.oslo.feature.subscriptions.linkagreements.hub.search.ui.LinkAgreementsSuggestedSearchListKt.m19911$r8$lambda$xIEMbHmuNkxHq3P3kvGWX8gKLM(list, function1, (androidx.compose.foundation.lazy.LazyListScope) obj);
                        }
                    };
                    startRestartGroup.updateRememberedValue(rememberedValue);
                }
                androidx.compose.foundation.lazy.LazyDslKt.LazyColumn(testTag, lazyListState3, null, false, null, null, null, false, null, (kotlin.jvm.functions.Function1) rememberedValue, startRestartGroup, (i4 >> 6) & 112, androidx.constraintlayout.core.motion.utils.TypedValues.PositionType.TYPE_CURVE_FIT);
                if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                    androidx.compose.runtime.ComposerKt.traceEventEnd();
                }
                lazyListState2 = lazyListState3;
            } else {
                startRestartGroup.skipToGroupEnd();
                modifier3 = modifier2;
            }
            endRestartGroup = startRestartGroup.endRestartGroup();
            if (endRestartGroup == null) {
                final androidx.compose.ui.Modifier modifier5 = modifier3;
                final androidx.compose.foundation.lazy.LazyListState lazyListState4 = lazyListState2;
                endRestartGroup.updateScope(new kotlin.jvm.functions.Function2() { // from class: com.paypal.oslo.feature.subscriptions.linkagreements.hub.search.ui.LinkAgreementsSuggestedSearchListKt$$ExternalSyntheticLambda3
                    @Override // kotlin.jvm.functions.Function2
                    public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                        return com.paypal.oslo.feature.subscriptions.linkagreements.hub.search.ui.LinkAgreementsSuggestedSearchListKt.m19909$r8$lambda$hkGFZStzP1cfWr_fjafhrVWiA(list, function1, modifier5, lazyListState4, i, i2, (androidx.compose.runtime.Composer) obj, ((java.lang.Integer) obj2).intValue());
                    }
                });
                return;
            }
            return;
        }
        modifier2 = modifier;
        if ((i & 3072) != 0) {
        }
        if (!startRestartGroup.shouldExecute((i3 & 1171) == 1170, i3 & 1)) {
        }
        endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup == null) {
        }
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$IcPvaO4FPQur7CCjrc9G9QTnRoQ(java.util.List list, final kotlin.jvm.functions.Function1 function1, androidx.compose.foundation.lazy.LazyItemScope lazyItemScope, int i, androidx.compose.runtime.Composer composer, int i2) {
        int i3;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(lazyItemScope, "");
        if ((i2 & 48) == 0) {
            i3 = i2 | (composer.changed(i) ? 32 : 16);
        } else {
            i3 = i2;
        }
        if (composer.shouldExecute((i3 & 145) != 144, i3 & 1)) {
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventStart(1969202286, i3, -1, "com.paypal.oslo.feature.subscriptions.linkagreements.hub.search.ui.LinkAgreementsSuggestedSearchList.<anonymous>.<anonymous>.<anonymous> (LinkAgreementsSuggestedSearchList.kt:42)");
            }
            final com.paypal.oslo.feature.subscriptions.linkagreements.hub.domain.model.ConsumerAgreementMerchant consumerAgreementMerchant = (com.paypal.oslo.feature.subscriptions.linkagreements.hub.domain.model.ConsumerAgreementMerchant) list.get(i);
            java.lang.String name2 = consumerAgreementMerchant.getName();
            float spacing16 = com.paypal.pds.core.ConstantsKt.getSpacing16();
            androidx.compose.ui.Modifier testTag = androidx.compose.ui.platform.TestTagKt.testTag(androidx.compose.ui.Modifier.INSTANCE, "search_result_item_".concat(java.lang.String.valueOf(consumerAgreementMerchant.getName())));
            kotlin.jvm.functions.Function2<androidx.compose.runtime.Composer, java.lang.Integer, kotlin.Unit> m19901getLambda$1492209767$subscriptions_prodRelease = com.paypal.oslo.feature.subscriptions.linkagreements.hub.search.ui.ComposableSingletons$LinkAgreementsSuggestedSearchListKt.INSTANCE.m19901getLambda$1492209767$subscriptions_prodRelease();
            boolean changed = composer.changed(function1);
            boolean changed2 = composer.changed(consumerAgreementMerchant);
            java.lang.Object rememberedValue = composer.rememberedValue();
            if ((changed | changed2) || rememberedValue == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                rememberedValue = new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.feature.subscriptions.linkagreements.hub.search.ui.LinkAgreementsSuggestedSearchListKt$$ExternalSyntheticLambda1
                    @Override // kotlin.jvm.functions.Function0
                    public final java.lang.Object invoke() {
                        return com.paypal.oslo.feature.subscriptions.linkagreements.hub.search.ui.LinkAgreementsSuggestedSearchListKt.m19910$r8$lambda$rRvuHEkAUjyKlnIyWqm4XnN0xc(kotlin.jvm.functions.Function1.this, consumerAgreementMerchant);
                    }
                };
                composer.updateRememberedValue(rememberedValue);
            }
            com.paypal.pds.components.ListKt.m21934ListItemViewBxoFyMc(name2, testTag, null, null, null, true, false, null, m19901getLambda$1492209767$subscriptions_prodRelease, null, null, null, false, (kotlin.jvm.functions.Function0) rememberedValue, null, androidx.compose.ui.unit.Dp.m8599boximpl(spacing16), null, null, false, composer, 100859904, 0, 483036);
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventEnd();
            }
        } else {
            composer.skipToGroupEnd();
        }
        return kotlin.Unit.INSTANCE;
    }

    /* renamed from: $r8$lambda$RQBQz4x-uxY1w6pZZDF19oGDbjg, reason: not valid java name */
    public static /* synthetic */ kotlin.Unit m19908$r8$lambda$RQBQz4xuxY1w6pZZDF19oGDbjg(com.paypal.oslo.feature.subscriptions.linkagreements.hub.domain.model.ConsumerAgreementMerchant consumerAgreementMerchant) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(consumerAgreementMerchant, "");
        return kotlin.Unit.INSTANCE;
    }

    /* renamed from: $r8$lambda$hk-GFZStzP1-cfWr_fjafhrVWiA, reason: not valid java name */
    public static /* synthetic */ kotlin.Unit m19909$r8$lambda$hkGFZStzP1cfWr_fjafhrVWiA(java.util.List list, kotlin.jvm.functions.Function1 function1, androidx.compose.ui.Modifier modifier, androidx.compose.foundation.lazy.LazyListState lazyListState, int i, int i2, androidx.compose.runtime.Composer composer, int i3) {
        LinkAgreementsSuggestedSearchList(list, function1, modifier, lazyListState, composer, androidx.compose.runtime.RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
        return kotlin.Unit.INSTANCE;
    }

    /* renamed from: $r8$lambda$rRvuHEkAUjyKlnIyWqm4XnN-0xc, reason: not valid java name */
    public static /* synthetic */ kotlin.Unit m19910$r8$lambda$rRvuHEkAUjyKlnIyWqm4XnN0xc(kotlin.jvm.functions.Function1 function1, com.paypal.oslo.feature.subscriptions.linkagreements.hub.domain.model.ConsumerAgreementMerchant consumerAgreementMerchant) {
        function1.invoke(consumerAgreementMerchant);
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$s5rseJYbqz0Vs9Gg24QE5tZfsfU(int i, androidx.compose.runtime.Composer composer, int i2) {
        final int updateChangedFlags = androidx.compose.runtime.RecomposeScopeImplKt.updateChangedFlags(i | 1);
        androidx.compose.runtime.Composer startRestartGroup = composer.startRestartGroup(1613938125);
        if (!startRestartGroup.shouldExecute(updateChangedFlags != 0, updateChangedFlags & 1)) {
            startRestartGroup.skipToGroupEnd();
        } else {
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventStart(1613938125, updateChangedFlags, -1, "com.paypal.oslo.feature.subscriptions.linkagreements.hub.search.ui.LinkAgreementsSuggestedSearchListPreview (LinkAgreementsSuggestedSearchList.kt:61)");
            }
            java.util.List listOf = kotlin.collections.CollectionsKt.listOf((java.lang.Object[]) new com.paypal.oslo.feature.subscriptions.linkagreements.hub.domain.model.ConsumerAgreementMerchant[]{new com.paypal.oslo.feature.subscriptions.linkagreements.hub.domain.model.ConsumerAgreementMerchant("1", "Netflix", "https://www.netflix.com", ""), new com.paypal.oslo.feature.subscriptions.linkagreements.hub.domain.model.ConsumerAgreementMerchant(androidx.exifinterface.media.ExifInterface.GPS_MEASUREMENT_2D, "Spotify", "https://www.spotify.com", ""), new com.paypal.oslo.feature.subscriptions.linkagreements.hub.domain.model.ConsumerAgreementMerchant(androidx.exifinterface.media.ExifInterface.GPS_MEASUREMENT_3D, "Amazon Prime", "https://www.amazon.com/prime", "")});
            java.lang.Object rememberedValue = startRestartGroup.rememberedValue();
            if (rememberedValue == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                rememberedValue = new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.subscriptions.linkagreements.hub.search.ui.LinkAgreementsSuggestedSearchListKt$$ExternalSyntheticLambda4
                    @Override // kotlin.jvm.functions.Function1
                    public final java.lang.Object invoke(java.lang.Object obj) {
                        return com.paypal.oslo.feature.subscriptions.linkagreements.hub.search.ui.LinkAgreementsSuggestedSearchListKt.m19908$r8$lambda$RQBQz4xuxY1w6pZZDF19oGDbjg((com.paypal.oslo.feature.subscriptions.linkagreements.hub.domain.model.ConsumerAgreementMerchant) obj);
                    }
                };
                startRestartGroup.updateRememberedValue(rememberedValue);
            }
            LinkAgreementsSuggestedSearchList(listOf, (kotlin.jvm.functions.Function1) rememberedValue, null, null, startRestartGroup, 48, 12);
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventEnd();
            }
        }
        androidx.compose.runtime.ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new kotlin.jvm.functions.Function2() { // from class: com.paypal.oslo.feature.subscriptions.linkagreements.hub.search.ui.LinkAgreementsSuggestedSearchListKt$$ExternalSyntheticLambda5
                @Override // kotlin.jvm.functions.Function2
                public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                    return com.paypal.oslo.feature.subscriptions.linkagreements.hub.search.ui.LinkAgreementsSuggestedSearchListKt.$r8$lambda$s5rseJYbqz0Vs9Gg24QE5tZfsfU(updateChangedFlags, (androidx.compose.runtime.Composer) obj, ((java.lang.Integer) obj2).intValue());
                }
            });
        }
        return kotlin.Unit.INSTANCE;
    }

    /* renamed from: $r8$lambda$xIEMbHmu-NkxHq3P3kvGWX8gKLM, reason: not valid java name */
    public static /* synthetic */ kotlin.Unit m19911$r8$lambda$xIEMbHmuNkxHq3P3kvGWX8gKLM(final java.util.List list, final kotlin.jvm.functions.Function1 function1, androidx.compose.foundation.lazy.LazyListScope lazyListScope) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(lazyListScope, "");
        androidx.compose.foundation.lazy.LazyListScope.items$default(lazyListScope, list.size(), null, null, androidx.compose.runtime.internal.ComposableLambdaKt.composableLambdaInstance(1969202286, true, new kotlin.jvm.functions.Function4() { // from class: com.paypal.oslo.feature.subscriptions.linkagreements.hub.search.ui.LinkAgreementsSuggestedSearchListKt$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function4
            public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2, java.lang.Object obj3, java.lang.Object obj4) {
                return com.paypal.oslo.feature.subscriptions.linkagreements.hub.search.ui.LinkAgreementsSuggestedSearchListKt.$r8$lambda$IcPvaO4FPQur7CCjrc9G9QTnRoQ(list, function1, (androidx.compose.foundation.lazy.LazyItemScope) obj, ((java.lang.Integer) obj2).intValue(), (androidx.compose.runtime.Composer) obj3, ((java.lang.Integer) obj4).intValue());
            }
        }), 6, null);
        return kotlin.Unit.INSTANCE;
    }
}
