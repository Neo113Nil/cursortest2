package com.paypal.oslo.feature.shoppingrewards.rewards.rewardstab.ui.components.firstpartyoffergallery;

@kotlin.Metadata(d1 = {"\u0000.\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\t\n\u0002\b\u0003\u001a9\u0010\u0000\u001a\u00020\u00012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\u0012\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00010\u00062\b\b\u0002\u0010\u0007\u001a\u00020\bH\u0007¢\u0006\u0002\u0010\t\u001a\r\u0010\n\u001a\u00020\u0001H\u0003¢\u0006\u0002\u0010\u000b\"\u000e\u0010\f\u001a\u00020\rX\u0082T¢\u0006\u0002\n\u0000\"\u000e\u0010\u000e\u001a\u00020\u000fX\u0082T¢\u0006\u0002\n\u0000\"\u000e\u0010\u0010\u001a\u00020\u000fX\u0082T¢\u0006\u0002\n\u0000\"\u000e\u0010\u0011\u001a\u00020\u000fX\u0082T¢\u0006\u0002\n\u0000¨\u0006\u0012"}, d2 = {"FirstPartyOfferCarousel", "", "offers", "", "Lcom/paypal/oslo/feature/shoppingrewards/rewards/rewardstab/ui/components/firstpartyoffercard/FirstPartyOfferCardUiData;", "onOfferClick", "Lkotlin/Function1;", "modifier", "Landroidx/compose/ui/Modifier;", "(Ljava/util/List;Lkotlin/jvm/functions/Function1;Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;II)V", "FirstPartyOfferCarouselPreview", "(Landroidx/compose/runtime/Composer;I)V", "PreviewImageUrl", "", "PreviewRedColor", "", "PreviewGreenColor", "PreviewBlueColor", "shopping-rewards_prodRelease"}, k = 2, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class FirstPartyOfferCarouselKt {
    /* JADX WARN: Removed duplicated region for block: B:20:0x005a  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0065  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00c3  */
    /* JADX WARN: Removed duplicated region for block: B:37:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:39:0x00ba  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x005c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void FirstPartyOfferCarousel(final java.util.List<com.paypal.oslo.feature.shoppingrewards.rewards.rewardstab.ui.components.firstpartyoffercard.FirstPartyOfferCardUiData> list, final kotlin.jvm.functions.Function1<? super com.paypal.oslo.feature.shoppingrewards.rewards.rewardstab.ui.components.firstpartyoffercard.FirstPartyOfferCardUiData, kotlin.Unit> function1, androidx.compose.ui.Modifier modifier, androidx.compose.runtime.Composer composer, final int i, final int i2) {
        int i3;
        final androidx.compose.ui.Modifier modifier2;
        androidx.compose.runtime.ScopeUpdateScope endRestartGroup;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(list, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(function1, "");
        androidx.compose.runtime.Composer startRestartGroup = composer.startRestartGroup(187061218);
        if ((i & 6) == 0) {
            i3 = (startRestartGroup.changedInstance(list) ? 4 : 2) | i;
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
                    androidx.compose.runtime.ComposerKt.traceEventStart(187061218, i3, -1, "com.paypal.oslo.feature.shoppingrewards.rewards.rewardstab.ui.components.firstpartyoffergallery.FirstPartyOfferCarousel (FirstPartyOfferCarousel.kt:44)");
                }
                com.paypal.oslo.core.commonui.components.containers.GalleryKt.Gallery(list, modifier3, androidx.compose.foundation.layout.PaddingKt.m1703PaddingValuesa9UjIt4$default(com.paypal.pds.core.ConstantsKt.getSpacing16(), 0.0f, com.paypal.pds.core.ConstantsKt.getSpacing28(), 0.0f, 10, null), androidx.compose.runtime.internal.ComposableLambdaKt.rememberComposableLambda(-1208319460, true, new kotlin.jvm.functions.Function4() { // from class: com.paypal.oslo.feature.shoppingrewards.rewards.rewardstab.ui.components.firstpartyoffergallery.FirstPartyOfferCarouselKt$$ExternalSyntheticLambda3
                    @Override // kotlin.jvm.functions.Function4
                    public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2, java.lang.Object obj3, java.lang.Object obj4) {
                        return com.paypal.oslo.feature.shoppingrewards.rewards.rewardstab.ui.components.firstpartyoffergallery.FirstPartyOfferCarouselKt.m19502$r8$lambda$HHjhXY1KTyvNEltvC75YKf5ftg(kotlin.jvm.functions.Function1.this, (kotlin.Pair) obj, (com.paypal.oslo.feature.shoppingrewards.rewards.rewardstab.ui.components.firstpartyoffercard.FirstPartyOfferCardUiData) obj2, (androidx.compose.runtime.Composer) obj3, ((java.lang.Integer) obj4).intValue());
                    }
                }, startRestartGroup, 54), startRestartGroup, ((i3 >> 3) & 112) | (i3 & 14) | 3072, 0);
                if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                    androidx.compose.runtime.ComposerKt.traceEventEnd();
                }
                modifier2 = modifier3;
            }
            endRestartGroup = startRestartGroup.endRestartGroup();
            if (endRestartGroup == null) {
                endRestartGroup.updateScope(new kotlin.jvm.functions.Function2() { // from class: com.paypal.oslo.feature.shoppingrewards.rewards.rewardstab.ui.components.firstpartyoffergallery.FirstPartyOfferCarouselKt$$ExternalSyntheticLambda4
                    @Override // kotlin.jvm.functions.Function2
                    public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                        return com.paypal.oslo.feature.shoppingrewards.rewards.rewardstab.ui.components.firstpartyoffergallery.FirstPartyOfferCarouselKt.$r8$lambda$DSYgpYP7zf6u20pK8ITuEp61l8E(list, function1, modifier2, i, i2, (androidx.compose.runtime.Composer) obj, ((java.lang.Integer) obj2).intValue());
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

    public static /* synthetic */ kotlin.Unit $r8$lambda$4ESSXNP3kh7ajnylStk7qjNiGNY(int i, androidx.compose.runtime.Composer composer, int i2) {
        final int updateChangedFlags = androidx.compose.runtime.RecomposeScopeImplKt.updateChangedFlags(i | 1);
        androidx.compose.runtime.Composer startRestartGroup = composer.startRestartGroup(-1937231118);
        if (!startRestartGroup.shouldExecute(updateChangedFlags != 0, updateChangedFlags & 1)) {
            startRestartGroup.skipToGroupEnd();
        } else {
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventStart(-1937231118, updateChangedFlags, -1, "com.paypal.oslo.feature.shoppingrewards.rewards.rewardstab.ui.components.firstpartyoffergallery.FirstPartyOfferCarouselPreview (FirstPartyOfferCarousel.kt:70)");
            }
            java.util.List listOf = kotlin.collections.CollectionsKt.listOf((java.lang.Object[]) new com.paypal.oslo.feature.shoppingrewards.rewards.rewardstab.ui.components.firstpartyoffercard.FirstPartyOfferCardUiData[]{new com.paypal.oslo.feature.shoppingrewards.rewards.rewardstab.ui.components.firstpartyoffercard.FirstPartyOfferCardUiData("preview_fpo_1", "10 points per $1", "Ends 6/10", "Netflix and earn – on your next 3 payments with PayPal", "https://placeholder.com/400", "Activate", androidx.compose.ui.graphics.ColorKt.Color(4286583582L), null), new com.paypal.oslo.feature.shoppingrewards.rewards.rewardstab.ui.components.firstpartyoffercard.FirstPartyOfferCardUiData("preview_fpo_2", "3 points per $1 spent", "Ends 7/15", "Shop at Lululemon and earn bonus rewards", "https://placeholder.com/400", "Shop Now", androidx.compose.ui.graphics.ColorKt.Color(4279983648L), null), new com.paypal.oslo.feature.shoppingrewards.rewards.rewardstab.ui.components.firstpartyoffercard.FirstPartyOfferCardUiData("preview_fpo_3", "5X points", "New", "Earn bonus points on your next purchase at Target", "https://placeholder.com/400", "Activate", androidx.compose.ui.graphics.ColorKt.Color(4279060385L), null)});
            java.lang.Object rememberedValue = startRestartGroup.rememberedValue();
            if (rememberedValue == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                rememberedValue = new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.shoppingrewards.rewards.rewardstab.ui.components.firstpartyoffergallery.FirstPartyOfferCarouselKt$$ExternalSyntheticLambda0
                    @Override // kotlin.jvm.functions.Function1
                    public final java.lang.Object invoke(java.lang.Object obj) {
                        return com.paypal.oslo.feature.shoppingrewards.rewards.rewardstab.ui.components.firstpartyoffergallery.FirstPartyOfferCarouselKt.$r8$lambda$phoSojEMMb3v12x5QmxWhvMSpo8((com.paypal.oslo.feature.shoppingrewards.rewards.rewardstab.ui.components.firstpartyoffercard.FirstPartyOfferCardUiData) obj);
                    }
                };
                startRestartGroup.updateRememberedValue(rememberedValue);
            }
            FirstPartyOfferCarousel(listOf, (kotlin.jvm.functions.Function1) rememberedValue, null, startRestartGroup, 54, 4);
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventEnd();
            }
        }
        androidx.compose.runtime.ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new kotlin.jvm.functions.Function2() { // from class: com.paypal.oslo.feature.shoppingrewards.rewards.rewardstab.ui.components.firstpartyoffergallery.FirstPartyOfferCarouselKt$$ExternalSyntheticLambda1
                @Override // kotlin.jvm.functions.Function2
                public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                    return com.paypal.oslo.feature.shoppingrewards.rewards.rewardstab.ui.components.firstpartyoffergallery.FirstPartyOfferCarouselKt.$r8$lambda$4ESSXNP3kh7ajnylStk7qjNiGNY(updateChangedFlags, (androidx.compose.runtime.Composer) obj, ((java.lang.Integer) obj2).intValue());
                }
            });
        }
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$DSYgpYP7zf6u20pK8ITuEp61l8E(java.util.List list, kotlin.jvm.functions.Function1 function1, androidx.compose.ui.Modifier modifier, int i, int i2, androidx.compose.runtime.Composer composer, int i3) {
        FirstPartyOfferCarousel(list, function1, modifier, composer, androidx.compose.runtime.RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
        return kotlin.Unit.INSTANCE;
    }

    /* renamed from: $r8$lambda$HHjhXY1KTyvNEltvC75YKf5-ftg, reason: not valid java name */
    public static /* synthetic */ kotlin.Unit m19502$r8$lambda$HHjhXY1KTyvNEltvC75YKf5ftg(final kotlin.jvm.functions.Function1 function1, kotlin.Pair pair, final com.paypal.oslo.feature.shoppingrewards.rewards.rewardstab.ui.components.firstpartyoffercard.FirstPartyOfferCardUiData firstPartyOfferCardUiData, androidx.compose.runtime.Composer composer, int i) {
        int i2;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(pair, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(firstPartyOfferCardUiData, "");
        if ((i & 6) == 0) {
            i2 = (composer.changed(pair) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= composer.changed(firstPartyOfferCardUiData) ? 32 : 16;
        }
        if (composer.shouldExecute((i2 & 147) != 146, i2 & 1)) {
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventStart(-1208319460, i2, -1, "com.paypal.oslo.feature.shoppingrewards.rewards.rewardstab.ui.components.firstpartyoffergallery.FirstPartyOfferCarousel.<anonymous> (FirstPartyOfferCarousel.kt:50)");
            }
            int intValue = ((java.lang.Number) pair.component1()).intValue();
            java.lang.Integer valueOf = java.lang.Integer.valueOf(((java.lang.Number) pair.component2()).intValue());
            java.lang.String str = null;
            if (valueOf.intValue() <= 1) {
                valueOf = null;
            }
            if (valueOf == null) {
                composer.startReplaceGroup(-924040081);
                composer.endReplaceGroup();
            } else {
                composer.startReplaceGroup(-924040080);
                java.lang.String stringResource = androidx.compose.ui.res.StringResources_androidKt.stringResource(com.paypal.oslo.feature.shoppingrewards.R.string.feature_shopping_rewards_offer_pagination_label, new java.lang.Object[]{java.lang.Integer.valueOf(intValue + 1), java.lang.Integer.valueOf(valueOf.intValue())}, composer, 0);
                composer.endReplaceGroup();
                str = stringResource;
            }
            boolean changed = composer.changed(function1);
            boolean z = (i2 & 112) == 32;
            java.lang.Object rememberedValue = composer.rememberedValue();
            if ((changed | z) || rememberedValue == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                rememberedValue = new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.feature.shoppingrewards.rewards.rewardstab.ui.components.firstpartyoffergallery.FirstPartyOfferCarouselKt$$ExternalSyntheticLambda2
                    @Override // kotlin.jvm.functions.Function0
                    public final java.lang.Object invoke() {
                        return com.paypal.oslo.feature.shoppingrewards.rewards.rewardstab.ui.components.firstpartyoffergallery.FirstPartyOfferCarouselKt.m19503$r8$lambda$oqDBT0nu2GN6fnNWQd6pauU1h0(kotlin.jvm.functions.Function1.this, firstPartyOfferCardUiData);
                    }
                };
                composer.updateRememberedValue(rememberedValue);
            }
            com.paypal.oslo.feature.shoppingrewards.rewards.rewardstab.ui.components.firstpartyoffercard.FirstPartyOfferCardKt.FirstPartyOfferCard(firstPartyOfferCardUiData, (kotlin.jvm.functions.Function0) rememberedValue, androidx.compose.ui.platform.TestTagKt.testTag(androidx.compose.ui.Modifier.INSTANCE, "fpo_carousel_item_".concat(java.lang.String.valueOf(firstPartyOfferCardUiData.getId()))), str, composer, (i2 >> 3) & 14, 0);
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventEnd();
            }
        } else {
            composer.skipToGroupEnd();
        }
        return kotlin.Unit.INSTANCE;
    }

    /* renamed from: $r8$lambda$oqDBT0nu2GN6fnNWQd6pau-U1h0, reason: not valid java name */
    public static /* synthetic */ kotlin.Unit m19503$r8$lambda$oqDBT0nu2GN6fnNWQd6pauU1h0(kotlin.jvm.functions.Function1 function1, com.paypal.oslo.feature.shoppingrewards.rewards.rewardstab.ui.components.firstpartyoffercard.FirstPartyOfferCardUiData firstPartyOfferCardUiData) {
        function1.invoke(firstPartyOfferCardUiData);
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$phoSojEMMb3v12x5QmxWhvMSpo8(com.paypal.oslo.feature.shoppingrewards.rewards.rewardstab.ui.components.firstpartyoffercard.FirstPartyOfferCardUiData firstPartyOfferCardUiData) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(firstPartyOfferCardUiData, "");
        return kotlin.Unit.INSTANCE;
    }
}
