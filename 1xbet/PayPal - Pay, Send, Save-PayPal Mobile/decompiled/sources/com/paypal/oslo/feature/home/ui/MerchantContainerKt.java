package com.paypal.oslo.feature.home.ui;

@kotlin.Metadata(d1 = {"\u0000&\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\u001aE\u0010\u0000\u001a\u00020\u00012\n\u0010\u0002\u001a\u0006\u0012\u0002\b\u00030\u00032\u0012\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00010\u00052\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00010\b2\b\b\u0002\u0010\t\u001a\u00020\nH\u0001¢\u0006\u0002\u0010\u000b\u001a\r\u0010\f\u001a\u00020\u0001H\u0003¢\u0006\u0002\u0010\r\u001a\r\u0010\u000e\u001a\u00020\u0001H\u0003¢\u0006\u0002\u0010\r¨\u0006\u000f"}, d2 = {"MerchantContainer", "", "section", "Lcom/paypal/oslo/feature/home/domain/model/Section;", "onMerchantClick", "Lkotlin/Function1;", "Lcom/paypal/oslo/feature/home/domain/model/Merchant;", "onViewAllClick", "Lkotlin/Function0;", "modifier", "Landroidx/compose/ui/Modifier;", "(Lcom/paypal/oslo/feature/home/domain/model/Section;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function0;Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;II)V", "TrendingMerchantContainerPreview", "(Landroidx/compose/runtime/Composer;I)V", "RecentlyViewedMerchantContainerPreview", "home_prodRelease"}, k = 2, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class MerchantContainerKt {
    /* JADX WARN: Removed duplicated region for block: B:27:0x0070  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x007b  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x00dc  */
    /* JADX WARN: Removed duplicated region for block: B:44:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:46:0x00d3  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0072  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void MerchantContainer(final com.paypal.oslo.feature.home.domain.model.Section<?> section, final kotlin.jvm.functions.Function1<? super com.paypal.oslo.feature.home.domain.model.Merchant, kotlin.Unit> function1, final kotlin.jvm.functions.Function0<kotlin.Unit> function0, androidx.compose.ui.Modifier modifier, androidx.compose.runtime.Composer composer, final int i, final int i2) {
        int i3;
        final androidx.compose.ui.Modifier modifier2;
        androidx.compose.runtime.ScopeUpdateScope endRestartGroup;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(section, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(function1, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(function0, "");
        androidx.compose.runtime.Composer startRestartGroup = composer.startRestartGroup(-386136275);
        if ((i & 6) == 0) {
            i3 = (startRestartGroup.changedInstance(section) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i & 48) == 0) {
            i3 |= startRestartGroup.changedInstance(function1) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i3 |= startRestartGroup.changedInstance(function0) ? 256 : 128;
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
                    androidx.compose.runtime.ComposerKt.traceEventStart(-386136275, i3, -1, "com.paypal.oslo.feature.home.ui.MerchantContainer (MerchantContainer.kt:52)");
                }
                com.paypal.oslo.feature.home.ui.HomeCollectionsKt.CollectionSection(section, function0, androidx.compose.foundation.layout.PaddingKt.m1708paddingVpY3zN4$default(modifier3, com.paypal.pds.core.ConstantsKt.getSpacing16(), 0.0f, 2, null), com.paypal.pds.core.Color.BackgroundMuted.INSTANCE, null, false, androidx.compose.runtime.internal.ComposableLambdaKt.rememberComposableLambda(-1340814701, true, new kotlin.jvm.functions.Function3() { // from class: com.paypal.oslo.feature.home.ui.MerchantContainerKt$$ExternalSyntheticLambda0
                    @Override // kotlin.jvm.functions.Function3
                    public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2, java.lang.Object obj3) {
                        return com.paypal.oslo.feature.home.ui.MerchantContainerKt.m14914$r8$lambda$Omv7tEpCb5tlAENWCr39R8vAvs(com.paypal.oslo.feature.home.domain.model.Section.this, function1, (androidx.compose.foundation.layout.ColumnScope) obj, (androidx.compose.runtime.Composer) obj2, ((java.lang.Integer) obj3).intValue());
                    }
                }, startRestartGroup, 54), startRestartGroup, (i3 & 14) | 1575936 | ((i3 >> 3) & 112), 48);
                if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                    androidx.compose.runtime.ComposerKt.traceEventEnd();
                }
                modifier2 = modifier3;
            }
            endRestartGroup = startRestartGroup.endRestartGroup();
            if (endRestartGroup == null) {
                endRestartGroup.updateScope(new kotlin.jvm.functions.Function2() { // from class: com.paypal.oslo.feature.home.ui.MerchantContainerKt$$ExternalSyntheticLambda2
                    @Override // kotlin.jvm.functions.Function2
                    public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                        return com.paypal.oslo.feature.home.ui.MerchantContainerKt.m14919$r8$lambda$tBRBQUIeVPYSlriiy778du_6R8(com.paypal.oslo.feature.home.domain.model.Section.this, function1, function0, modifier2, i, i2, (androidx.compose.runtime.Composer) obj, ((java.lang.Integer) obj2).intValue());
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

    /* renamed from: $r8$lambda$LJGjla_pmYZ7yAJrZNi-CXerxl4, reason: not valid java name */
    public static /* synthetic */ kotlin.Unit m14913$r8$lambda$LJGjla_pmYZ7yAJrZNiCXerxl4(com.paypal.oslo.feature.home.domain.model.Section section, androidx.compose.runtime.Composer composer, int i) {
        if (composer.shouldExecute((i & 3) != 2, i & 1)) {
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventStart(-228433422, i, -1, "com.paypal.oslo.feature.home.ui.RecentlyViewedMerchantContainerPreview.<anonymous> (MerchantContainer.kt:114)");
            }
            java.lang.Object rememberedValue = composer.rememberedValue();
            if (rememberedValue == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                rememberedValue = new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.home.ui.MerchantContainerKt$$ExternalSyntheticLambda10
                    @Override // kotlin.jvm.functions.Function1
                    public final java.lang.Object invoke(java.lang.Object obj) {
                        return com.paypal.oslo.feature.home.ui.MerchantContainerKt.m14916$r8$lambda$Ttpvg6AWoKELGskOBxQmitkOq8((com.paypal.oslo.feature.home.domain.model.Merchant) obj);
                    }
                };
                composer.updateRememberedValue(rememberedValue);
            }
            kotlin.jvm.functions.Function1 function1 = (kotlin.jvm.functions.Function1) rememberedValue;
            java.lang.Object rememberedValue2 = composer.rememberedValue();
            if (rememberedValue2 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                rememberedValue2 = new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.feature.home.ui.MerchantContainerKt$$ExternalSyntheticLambda1
                    @Override // kotlin.jvm.functions.Function0
                    public final java.lang.Object invoke() {
                        kotlin.Unit unit;
                        unit = kotlin.Unit.INSTANCE;
                        return unit;
                    }
                };
                composer.updateRememberedValue(rememberedValue2);
            }
            MerchantContainer(section, function1, (kotlin.jvm.functions.Function0) rememberedValue2, null, composer, 432, 8);
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventEnd();
            }
        } else {
            composer.skipToGroupEnd();
        }
        return kotlin.Unit.INSTANCE;
    }

    /* renamed from: $r8$lambda$Omv7tEpCb5tlAENWCr39R8vA-vs, reason: not valid java name */
    public static /* synthetic */ kotlin.Unit m14914$r8$lambda$Omv7tEpCb5tlAENWCr39R8vAvs(com.paypal.oslo.feature.home.domain.model.Section section, final kotlin.jvm.functions.Function1 function1, androidx.compose.foundation.layout.ColumnScope columnScope, androidx.compose.runtime.Composer composer, int i) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(columnScope, "");
        int i2 = 0;
        if (composer.shouldExecute((i & 17) != 16, i & 1)) {
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventStart(-1340814701, i, -1, "com.paypal.oslo.feature.home.ui.MerchantContainer.<anonymous> (MerchantContainer.kt:59)");
            }
            androidx.compose.foundation.layout.SpacerKt.Spacer(androidx.compose.foundation.layout.SizeKt.m1726height3ABfNKs(androidx.compose.ui.Modifier.INSTANCE, com.paypal.pds.core.ConstantsKt.getSpacing16()), composer, 0);
            androidx.compose.foundation.layout.Arrangement.HorizontalOrVertical m1602spacedBy0680j_4 = androidx.compose.foundation.layout.Arrangement.INSTANCE.m1602spacedBy0680j_4(com.paypal.pds.core.ConstantsKt.getSpacing8());
            androidx.compose.ui.Modifier testTag = androidx.compose.ui.platform.TestTagKt.testTag(androidx.compose.foundation.layout.PaddingKt.m1708paddingVpY3zN4$default(androidx.compose.foundation.ScrollKt.horizontalScroll$default(androidx.compose.foundation.layout.SizeKt.fillMaxWidth$default(androidx.compose.ui.Modifier.INSTANCE, 0.0f, 1, null), androidx.compose.foundation.ScrollKt.rememberScrollState(0, composer, 0, 1), false, null, false, 14, null), com.paypal.pds.core.ConstantsKt.getSpacing16(), 0.0f, 2, null), "MerchantRow_".concat(java.lang.String.valueOf(section.getId())));
            androidx.compose.ui.layout.MeasurePolicy rowMeasurePolicy = androidx.compose.foundation.layout.RowKt.rowMeasurePolicy(m1602spacedBy0680j_4, androidx.compose.ui.Alignment.INSTANCE.getTop(), composer, 0);
            int hashCode = java.lang.Long.hashCode(androidx.compose.runtime.ComposablesKt.getCurrentCompositeKeyHashCode(composer, 0));
            androidx.compose.runtime.CompositionLocalMap currentCompositionLocalMap = composer.getCurrentCompositionLocalMap();
            androidx.compose.ui.Modifier materializeModifier = androidx.compose.ui.ComposedModifierKt.materializeModifier(composer, testTag);
            kotlin.jvm.functions.Function0<androidx.compose.ui.node.ComposeUiNode> constructor = androidx.compose.ui.node.ComposeUiNode.INSTANCE.getConstructor();
            if (!(composer.getApplier() instanceof androidx.compose.runtime.Applier)) {
                androidx.compose.runtime.ComposablesKt.invalidApplier();
            }
            composer.startReusableNode();
            if (composer.getInserting()) {
                composer.createNode(constructor);
            } else {
                composer.useNode();
            }
            androidx.compose.runtime.Composer m5299constructorimpl = androidx.compose.runtime.Updater.m5299constructorimpl(composer);
            androidx.compose.runtime.Updater.m5307setimpl(m5299constructorimpl, rowMeasurePolicy, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetMeasurePolicy());
            androidx.compose.runtime.Updater.m5307setimpl(m5299constructorimpl, currentCompositionLocalMap, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
            androidx.compose.runtime.Updater.m5303initimpl(m5299constructorimpl, java.lang.Integer.valueOf(hashCode), androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetCompositeKeyHash());
            androidx.compose.runtime.Updater.m5305reconcileimpl(m5299constructorimpl, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getApplyOnDeactivatedNodeAssertion());
            androidx.compose.runtime.Updater.m5307setimpl(m5299constructorimpl, materializeModifier, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetModifier());
            androidx.compose.foundation.layout.RowScopeInstance rowScopeInstance = androidx.compose.foundation.layout.RowScopeInstance.INSTANCE;
            composer.startReplaceGroup(-186794114);
            for (java.lang.Object obj : com.paypal.oslo.feature.home.domain.section.UtilsKt.getDisplayItems(section)) {
                if (i2 < 0) {
                    kotlin.collections.CollectionsKt.throwIndexOverflow();
                }
                final com.paypal.oslo.feature.home.domain.model.Merchant merchant = (com.paypal.oslo.feature.home.domain.model.Merchant) obj;
                boolean isLoading = com.paypal.oslo.feature.home.domain.section.UtilsKt.isLoading(section);
                androidx.compose.ui.Modifier sectionItemTestTag = com.paypal.oslo.feature.home.ui.utils.TestTagKt.sectionItemTestTag(androidx.compose.ui.Modifier.INSTANCE, section, i2);
                boolean changed = composer.changed(function1);
                boolean changedInstance = composer.changedInstance(merchant);
                java.lang.Object rememberedValue = composer.rememberedValue();
                if ((changed | changedInstance) || rememberedValue == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                    rememberedValue = new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.feature.home.ui.MerchantContainerKt$$ExternalSyntheticLambda3
                        @Override // kotlin.jvm.functions.Function0
                        public final java.lang.Object invoke() {
                            return com.paypal.oslo.feature.home.ui.MerchantContainerKt.m14915$r8$lambda$SlKW6cTMWKGZYVnGhq5laDeA(kotlin.jvm.functions.Function1.this, merchant);
                        }
                    };
                    composer.updateRememberedValue(rememberedValue);
                }
                com.paypal.oslo.feature.home.ui.MerchantTileKt.MerchantTile(merchant, (kotlin.jvm.functions.Function0) rememberedValue, sectionItemTestTag, isLoading, null, composer, 0, 16);
                i2++;
            }
            composer.endReplaceGroup();
            composer.endNode();
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventEnd();
            }
        } else {
            composer.skipToGroupEnd();
        }
        return kotlin.Unit.INSTANCE;
    }

    /* renamed from: $r8$lambda$Sl-K-W6cTMWKGZYVnGh-q5laDeA, reason: not valid java name */
    public static /* synthetic */ kotlin.Unit m14915$r8$lambda$SlKW6cTMWKGZYVnGhq5laDeA(kotlin.jvm.functions.Function1 function1, com.paypal.oslo.feature.home.domain.model.Merchant merchant) {
        function1.invoke(merchant);
        return kotlin.Unit.INSTANCE;
    }

    /* renamed from: $r8$lambda$Ttpvg6AWoKELGskOBxQmit-kOq8, reason: not valid java name */
    public static /* synthetic */ kotlin.Unit m14916$r8$lambda$Ttpvg6AWoKELGskOBxQmitkOq8(com.paypal.oslo.feature.home.domain.model.Merchant merchant) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(merchant, "");
        return kotlin.Unit.INSTANCE;
    }

    /* renamed from: $r8$lambda$aOyP3o5UiszVG-KYWGvdw0HrcVU, reason: not valid java name */
    public static /* synthetic */ kotlin.Unit m14917$r8$lambda$aOyP3o5UiszVGKYWGvdw0HrcVU(com.paypal.oslo.feature.home.domain.model.Section section, androidx.compose.runtime.Composer composer, int i) {
        if (composer.shouldExecute((i & 3) != 2, i & 1)) {
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventStart(614341195, i, -1, "com.paypal.oslo.feature.home.ui.TrendingMerchantContainerPreview.<anonymous> (MerchantContainer.kt:93)");
            }
            java.lang.Object rememberedValue = composer.rememberedValue();
            if (rememberedValue == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                rememberedValue = new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.home.ui.MerchantContainerKt$$ExternalSyntheticLambda4
                    @Override // kotlin.jvm.functions.Function1
                    public final java.lang.Object invoke(java.lang.Object obj) {
                        return com.paypal.oslo.feature.home.ui.MerchantContainerKt.$r8$lambda$hQ0u60ktyPH9G4gK_m4UOgY5YuE((com.paypal.oslo.feature.home.domain.model.Merchant) obj);
                    }
                };
                composer.updateRememberedValue(rememberedValue);
            }
            kotlin.jvm.functions.Function1 function1 = (kotlin.jvm.functions.Function1) rememberedValue;
            java.lang.Object rememberedValue2 = composer.rememberedValue();
            if (rememberedValue2 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                rememberedValue2 = new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.feature.home.ui.MerchantContainerKt$$ExternalSyntheticLambda5
                    @Override // kotlin.jvm.functions.Function0
                    public final java.lang.Object invoke() {
                        kotlin.Unit unit;
                        unit = kotlin.Unit.INSTANCE;
                        return unit;
                    }
                };
                composer.updateRememberedValue(rememberedValue2);
            }
            MerchantContainer(section, function1, (kotlin.jvm.functions.Function0) rememberedValue2, null, composer, 432, 8);
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventEnd();
            }
        } else {
            composer.skipToGroupEnd();
        }
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$gHSd6R3AJmjfKw30NbhEE9_WxQw(int i, androidx.compose.runtime.Composer composer, int i2) {
        final int updateChangedFlags = androidx.compose.runtime.RecomposeScopeImplKt.updateChangedFlags(i | 1);
        androidx.compose.runtime.Composer startRestartGroup = composer.startRestartGroup(706749769);
        if (!startRestartGroup.shouldExecute(updateChangedFlags != 0, updateChangedFlags & 1)) {
            startRestartGroup.skipToGroupEnd();
        } else {
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventStart(706749769, updateChangedFlags, -1, "com.paypal.oslo.feature.home.ui.TrendingMerchantContainerPreview (MerchantContainer.kt:85)");
            }
            final com.paypal.oslo.feature.home.domain.model.Section createSection$home_prodRelease$default = com.paypal.oslo.feature.home.ui.preview.SectionPreviews.createSection$home_prodRelease$default(com.paypal.oslo.feature.home.ui.preview.SectionPreviews.INSTANCE, null, null, "Trending Merchants", "Popular with shoppers like you", com.paypal.oslo.feature.home.ui.preview.MerchantPreviews.INSTANCE.createSampleMerchants$home_prodRelease(3), "See all trending", 3, null);
            com.paypal.oslo.feature.home.ui.preview.HomePreviewKt.HomePreview(androidx.compose.runtime.internal.ComposableLambdaKt.rememberComposableLambda(614341195, true, new kotlin.jvm.functions.Function2() { // from class: com.paypal.oslo.feature.home.ui.MerchantContainerKt$$ExternalSyntheticLambda6
                @Override // kotlin.jvm.functions.Function2
                public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                    return com.paypal.oslo.feature.home.ui.MerchantContainerKt.m14917$r8$lambda$aOyP3o5UiszVGKYWGvdw0HrcVU(com.paypal.oslo.feature.home.domain.model.Section.this, (androidx.compose.runtime.Composer) obj, ((java.lang.Integer) obj2).intValue());
                }
            }, startRestartGroup, 54), startRestartGroup, 6);
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventEnd();
            }
        }
        androidx.compose.runtime.ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new kotlin.jvm.functions.Function2() { // from class: com.paypal.oslo.feature.home.ui.MerchantContainerKt$$ExternalSyntheticLambda7
                @Override // kotlin.jvm.functions.Function2
                public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                    return com.paypal.oslo.feature.home.ui.MerchantContainerKt.$r8$lambda$gHSd6R3AJmjfKw30NbhEE9_WxQw(updateChangedFlags, (androidx.compose.runtime.Composer) obj, ((java.lang.Integer) obj2).intValue());
                }
            });
        }
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$hQ0u60ktyPH9G4gK_m4UOgY5YuE(com.paypal.oslo.feature.home.domain.model.Merchant merchant) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(merchant, "");
        return kotlin.Unit.INSTANCE;
    }

    /* renamed from: $r8$lambda$tBRBQUIeVPYS-lriiy778du_6R8, reason: not valid java name */
    public static /* synthetic */ kotlin.Unit m14919$r8$lambda$tBRBQUIeVPYSlriiy778du_6R8(com.paypal.oslo.feature.home.domain.model.Section section, kotlin.jvm.functions.Function1 function1, kotlin.jvm.functions.Function0 function0, androidx.compose.ui.Modifier modifier, int i, int i2, androidx.compose.runtime.Composer composer, int i3) {
        MerchantContainer(section, function1, function0, modifier, composer, androidx.compose.runtime.RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$yiMrhfGGdrsMZLDdD2qjnEQkrHg(int i, androidx.compose.runtime.Composer composer, int i2) {
        final int updateChangedFlags = androidx.compose.runtime.RecomposeScopeImplKt.updateChangedFlags(i | 1);
        androidx.compose.runtime.Composer startRestartGroup = composer.startRestartGroup(-920406416);
        if (!startRestartGroup.shouldExecute(updateChangedFlags != 0, updateChangedFlags & 1)) {
            startRestartGroup.skipToGroupEnd();
        } else {
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventStart(-920406416, updateChangedFlags, -1, "com.paypal.oslo.feature.home.ui.RecentlyViewedMerchantContainerPreview (MerchantContainer.kt:106)");
            }
            final com.paypal.oslo.feature.home.domain.model.Section createSection$home_prodRelease$default = com.paypal.oslo.feature.home.ui.preview.SectionPreviews.createSection$home_prodRelease$default(com.paypal.oslo.feature.home.ui.preview.SectionPreviews.INSTANCE, null, null, "Recently Viewed", null, com.paypal.oslo.feature.home.ui.preview.MerchantPreviews.INSTANCE.createSampleMerchants$home_prodRelease(2), null, 3, null);
            com.paypal.oslo.feature.home.ui.preview.HomePreviewKt.HomePreview(androidx.compose.runtime.internal.ComposableLambdaKt.rememberComposableLambda(-228433422, true, new kotlin.jvm.functions.Function2() { // from class: com.paypal.oslo.feature.home.ui.MerchantContainerKt$$ExternalSyntheticLambda8
                @Override // kotlin.jvm.functions.Function2
                public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                    return com.paypal.oslo.feature.home.ui.MerchantContainerKt.m14913$r8$lambda$LJGjla_pmYZ7yAJrZNiCXerxl4(com.paypal.oslo.feature.home.domain.model.Section.this, (androidx.compose.runtime.Composer) obj, ((java.lang.Integer) obj2).intValue());
                }
            }, startRestartGroup, 54), startRestartGroup, 6);
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventEnd();
            }
        }
        androidx.compose.runtime.ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new kotlin.jvm.functions.Function2() { // from class: com.paypal.oslo.feature.home.ui.MerchantContainerKt$$ExternalSyntheticLambda9
                @Override // kotlin.jvm.functions.Function2
                public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                    return com.paypal.oslo.feature.home.ui.MerchantContainerKt.$r8$lambda$yiMrhfGGdrsMZLDdD2qjnEQkrHg(updateChangedFlags, (androidx.compose.runtime.Composer) obj, ((java.lang.Integer) obj2).intValue());
                }
            });
        }
        return kotlin.Unit.INSTANCE;
    }
}
