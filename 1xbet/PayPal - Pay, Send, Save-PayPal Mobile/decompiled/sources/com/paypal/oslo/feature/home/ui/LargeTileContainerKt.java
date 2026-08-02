package com.paypal.oslo.feature.home.ui;

@kotlin.Metadata(d1 = {"\u0000(\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a[\u0010\u0000\u001a\u00020\u00012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\u0012\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00010\u00062\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00010\u00062\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00010\t2\b\b\u0002\u0010\n\u001a\u00020\u000bH\u0001¢\u0006\u0002\u0010\f\u001a\r\u0010\r\u001a\u00020\u0001H\u0003¢\u0006\u0002\u0010\u000e¨\u0006\u000f"}, d2 = {"LargeTileContainer", "", "section", "Lcom/paypal/oslo/feature/home/domain/model/Section;", "Lcom/paypal/oslo/feature/home/domain/model/LargeTileContent;", "onFavoriteClick", "Lkotlin/Function1;", "onCollectionItemClick", "onViewAllClick", "Lkotlin/Function0;", "modifier", "Landroidx/compose/ui/Modifier;", "(Lcom/paypal/oslo/feature/home/domain/model/Section;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function0;Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;II)V", "LargeTileContainerPreview", "(Landroidx/compose/runtime/Composer;I)V", "home_prodRelease"}, k = 2, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class LargeTileContainerKt {
    /* JADX WARN: Removed duplicated region for block: B:34:0x0085  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0090  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x00f7  */
    /* JADX WARN: Removed duplicated region for block: B:51:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:53:0x00ed  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x0087  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void LargeTileContainer(final com.paypal.oslo.feature.home.domain.model.Section<com.paypal.oslo.feature.home.domain.model.LargeTileContent> section, final kotlin.jvm.functions.Function1<? super com.paypal.oslo.feature.home.domain.model.LargeTileContent, kotlin.Unit> function1, final kotlin.jvm.functions.Function1<? super com.paypal.oslo.feature.home.domain.model.LargeTileContent, kotlin.Unit> function12, final kotlin.jvm.functions.Function0<kotlin.Unit> function0, androidx.compose.ui.Modifier modifier, androidx.compose.runtime.Composer composer, final int i, final int i2) {
        int i3;
        androidx.compose.ui.Modifier modifier2;
        final androidx.compose.ui.Modifier modifier3;
        androidx.compose.runtime.ScopeUpdateScope endRestartGroup;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(section, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(function1, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(function12, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(function0, "");
        androidx.compose.runtime.Composer startRestartGroup = composer.startRestartGroup(1222382696);
        if ((i & 6) == 0) {
            i3 = (startRestartGroup.changedInstance(section) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i & 48) == 0) {
            i3 |= startRestartGroup.changedInstance(function1) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i3 |= startRestartGroup.changedInstance(function12) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i3 |= startRestartGroup.changedInstance(function0) ? 2048 : 1024;
        }
        int i4 = i2 & 16;
        if (i4 != 0) {
            i3 |= 24576;
        } else if ((i & 24576) == 0) {
            modifier2 = modifier;
            i3 |= startRestartGroup.changed(modifier2) ? 16384 : 8192;
            if (startRestartGroup.shouldExecute((i3 & 9363) == 9362, i3 & 1)) {
                startRestartGroup.skipToGroupEnd();
                modifier3 = modifier2;
            } else {
                androidx.compose.ui.Modifier modifier4 = i4 != 0 ? androidx.compose.ui.Modifier.INSTANCE : modifier2;
                if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                    androidx.compose.runtime.ComposerKt.traceEventStart(1222382696, i3, -1, "com.paypal.oslo.feature.home.ui.LargeTileContainer (LargeTileContainer.kt:53)");
                }
                androidx.compose.ui.Modifier modifier5 = modifier4;
                com.paypal.oslo.feature.home.ui.HomeCollectionsKt.CollectionSection(section, function0, androidx.compose.foundation.layout.PaddingKt.m1708paddingVpY3zN4$default(modifier4, com.paypal.pds.core.ConstantsKt.getSpacing16(), 0.0f, 2, null), com.paypal.pds.core.Color.BackgroundMuted.INSTANCE, null, false, androidx.compose.runtime.internal.ComposableLambdaKt.rememberComposableLambda(35450574, true, new kotlin.jvm.functions.Function3() { // from class: com.paypal.oslo.feature.home.ui.LargeTileContainerKt$$ExternalSyntheticLambda0
                    @Override // kotlin.jvm.functions.Function3
                    public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2, java.lang.Object obj3) {
                        return com.paypal.oslo.feature.home.ui.LargeTileContainerKt.m14909$r8$lambda$ybTREDPndw9rnlFdg_uS9z453E(com.paypal.oslo.feature.home.domain.model.Section.this, function1, function12, (androidx.compose.foundation.layout.ColumnScope) obj, (androidx.compose.runtime.Composer) obj2, ((java.lang.Integer) obj3).intValue());
                    }
                }, startRestartGroup, 54), startRestartGroup, (i3 & 14) | 1575936 | ((i3 >> 6) & 112), 48);
                if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                    androidx.compose.runtime.ComposerKt.traceEventEnd();
                }
                modifier3 = modifier5;
            }
            endRestartGroup = startRestartGroup.endRestartGroup();
            if (endRestartGroup == null) {
                endRestartGroup.updateScope(new kotlin.jvm.functions.Function2() { // from class: com.paypal.oslo.feature.home.ui.LargeTileContainerKt$$ExternalSyntheticLambda1
                    @Override // kotlin.jvm.functions.Function2
                    public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                        return com.paypal.oslo.feature.home.ui.LargeTileContainerKt.m14910$r8$lambda$zPN6YTufdTE5KcAInKaxtUptgQ(com.paypal.oslo.feature.home.domain.model.Section.this, function1, function12, function0, modifier3, i, i2, (androidx.compose.runtime.Composer) obj, ((java.lang.Integer) obj2).intValue());
                    }
                });
                return;
            }
            return;
        }
        modifier2 = modifier;
        if (startRestartGroup.shouldExecute((i3 & 9363) == 9362, i3 & 1)) {
        }
        endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup == null) {
        }
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$2ZUlkMGF_0c5gw2LxLicjX8ydYI(com.paypal.oslo.feature.home.domain.model.Section section, final kotlin.jvm.functions.Function1 function1, final kotlin.jvm.functions.Function1 function12, androidx.compose.foundation.lazy.LazyListScope lazyListScope) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(lazyListScope, "");
        final java.util.List items = section.getItems();
        final kotlin.jvm.functions.Function2 function2 = new kotlin.jvm.functions.Function2() { // from class: com.paypal.oslo.feature.home.ui.LargeTileContainerKt$$ExternalSyntheticLambda8
            @Override // kotlin.jvm.functions.Function2
            public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                return com.paypal.oslo.feature.home.ui.LargeTileContainerKt.$r8$lambda$ThowOf4zFciIjzVh3ay8bCcdL7c(((java.lang.Integer) obj).intValue(), (com.paypal.oslo.feature.home.domain.model.LargeTileContent) obj2);
            }
        };
        lazyListScope.items(items.size(), new kotlin.jvm.functions.Function1<java.lang.Integer, java.lang.Object>() { // from class: com.paypal.oslo.feature.home.ui.LargeTileContainerKt$LargeTileContainer$lambda$0$0$0$$inlined$itemsIndexed$default$1
            @Override // kotlin.jvm.functions.Function1
            public final /* synthetic */ java.lang.Object invoke(java.lang.Integer num) {
                return invoke(num.intValue());
            }

            public final java.lang.Object invoke(int i) {
                return kotlin.jvm.functions.Function2.this.invoke(java.lang.Integer.valueOf(i), items.get(i));
            }
        }, new kotlin.jvm.functions.Function1<java.lang.Integer, java.lang.Object>() { // from class: com.paypal.oslo.feature.home.ui.LargeTileContainerKt$LargeTileContainer$lambda$0$0$0$$inlined$itemsIndexed$default$2
            @Override // kotlin.jvm.functions.Function1
            public final /* synthetic */ java.lang.Object invoke(java.lang.Integer num) {
                return invoke(num.intValue());
            }

            public final java.lang.Object invoke(int i) {
                items.get(i);
                return null;
            }
        }, androidx.compose.runtime.internal.ComposableLambdaKt.composableLambdaInstance(2039820996, true, new kotlin.jvm.functions.Function4<androidx.compose.foundation.lazy.LazyItemScope, java.lang.Integer, androidx.compose.runtime.Composer, java.lang.Integer, kotlin.Unit>() { // from class: com.paypal.oslo.feature.home.ui.LargeTileContainerKt$LargeTileContainer$lambda$0$0$0$$inlined$itemsIndexed$default$3
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
                final com.paypal.oslo.feature.home.domain.model.LargeTileContent largeTileContent = (com.paypal.oslo.feature.home.domain.model.LargeTileContent) items.get(i);
                composer.startReplaceGroup(-1013258826);
                androidx.compose.ui.Modifier testTag = androidx.compose.ui.platform.TestTagKt.testTag(androidx.compose.ui.Modifier.INSTANCE, "large_tile_collection_section_item_".concat(java.lang.String.valueOf(i)));
                boolean changed = composer.changed(function1);
                boolean changedInstance = composer.changedInstance(largeTileContent);
                java.lang.Object rememberedValue = composer.rememberedValue();
                if ((changed | changedInstance) || rememberedValue == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                    final kotlin.jvm.functions.Function1 function13 = function1;
                    rememberedValue = (kotlin.jvm.functions.Function0) new kotlin.jvm.functions.Function0<kotlin.Unit>() { // from class: com.paypal.oslo.feature.home.ui.LargeTileContainerKt$LargeTileContainer$1$1$1$2$1$1
                        @Override // kotlin.jvm.functions.Function0
                        public final /* bridge */ /* synthetic */ kotlin.Unit invoke() {
                            function13.invoke(largeTileContent);
                            return kotlin.Unit.INSTANCE;
                        }
                    };
                    composer.updateRememberedValue(rememberedValue);
                }
                kotlin.jvm.functions.Function0 function0 = (kotlin.jvm.functions.Function0) rememberedValue;
                boolean changed2 = composer.changed(function12);
                boolean changedInstance2 = composer.changedInstance(largeTileContent);
                java.lang.Object rememberedValue2 = composer.rememberedValue();
                if ((changed2 | changedInstance2) || rememberedValue2 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                    final kotlin.jvm.functions.Function1 function14 = function12;
                    rememberedValue2 = (kotlin.jvm.functions.Function0) new kotlin.jvm.functions.Function0<kotlin.Unit>() { // from class: com.paypal.oslo.feature.home.ui.LargeTileContainerKt$LargeTileContainer$1$1$1$2$2$1
                        @Override // kotlin.jvm.functions.Function0
                        public final /* bridge */ /* synthetic */ kotlin.Unit invoke() {
                            function14.invoke(largeTileContent);
                            return kotlin.Unit.INSTANCE;
                        }
                    };
                    composer.updateRememberedValue(rememberedValue2);
                }
                com.paypal.oslo.feature.home.ui.LargeTileKt.LargeTile(largeTileContent, testTag, function0, (kotlin.jvm.functions.Function0) rememberedValue2, composer, 0, 0);
                composer.endReplaceGroup();
                if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                    androidx.compose.runtime.ComposerKt.traceEventEnd();
                }
            }
        }));
        return kotlin.Unit.INSTANCE;
    }

    /* renamed from: $r8$lambda$HF-p4Dl3o3OYGdhCZY2K1gBdRSc, reason: not valid java name */
    public static /* synthetic */ kotlin.Unit m14906$r8$lambda$HFp4Dl3o3OYGdhCZY2K1gBdRSc(int i, androidx.compose.runtime.Composer composer, int i2) {
        final int updateChangedFlags = androidx.compose.runtime.RecomposeScopeImplKt.updateChangedFlags(i | 1);
        androidx.compose.runtime.Composer startRestartGroup = composer.startRestartGroup(809964596);
        if (!startRestartGroup.shouldExecute(updateChangedFlags != 0, updateChangedFlags & 1)) {
            startRestartGroup.skipToGroupEnd();
        } else {
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventStart(809964596, updateChangedFlags, -1, "com.paypal.oslo.feature.home.ui.LargeTileContainerPreview (LargeTileContainer.kt:88)");
            }
            final com.paypal.oslo.feature.home.domain.model.Section section = new com.paypal.oslo.feature.home.domain.model.Section("featured_content", com.paypal.oslo.feature.home.domain.model.SectionTypes.LARGE_TILE, "Featured Content", "Exclusive offers and rewards", com.paypal.oslo.feature.home.ui.preview.LargeTilePreviews.INSTANCE.createSampleLargeTiles$home_prodRelease(5), "See all featured content", (java.lang.String) null, (com.paypal.oslo.feature.home.domain.model.SectionInstrumentation) null, 192, (kotlin.jvm.internal.DefaultConstructorMarker) null);
            com.paypal.oslo.feature.home.ui.preview.HomePreviewKt.HomePreview(androidx.compose.runtime.internal.ComposableLambdaKt.rememberComposableLambda(-1986432330, true, new kotlin.jvm.functions.Function2() { // from class: com.paypal.oslo.feature.home.ui.LargeTileContainerKt$$ExternalSyntheticLambda2
                @Override // kotlin.jvm.functions.Function2
                public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                    return com.paypal.oslo.feature.home.ui.LargeTileContainerKt.m14908$r8$lambda$LmFjgooOX3jYDbAq4BenCDi8Eo(com.paypal.oslo.feature.home.domain.model.Section.this, (androidx.compose.runtime.Composer) obj, ((java.lang.Integer) obj2).intValue());
                }
            }, startRestartGroup, 54), startRestartGroup, 6);
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventEnd();
            }
        }
        androidx.compose.runtime.ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new kotlin.jvm.functions.Function2() { // from class: com.paypal.oslo.feature.home.ui.LargeTileContainerKt$$ExternalSyntheticLambda3
                @Override // kotlin.jvm.functions.Function2
                public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                    return com.paypal.oslo.feature.home.ui.LargeTileContainerKt.m14906$r8$lambda$HFp4Dl3o3OYGdhCZY2K1gBdRSc(updateChangedFlags, (androidx.compose.runtime.Composer) obj, ((java.lang.Integer) obj2).intValue());
                }
            });
        }
        return kotlin.Unit.INSTANCE;
    }

    /* renamed from: $r8$lambda$JyAmiO2nyLP2M8-Iu9t_mgOzR0M, reason: not valid java name */
    public static /* synthetic */ kotlin.Unit m14907$r8$lambda$JyAmiO2nyLP2M8Iu9t_mgOzR0M(com.paypal.oslo.feature.home.domain.model.LargeTileContent largeTileContent) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(largeTileContent, "");
        return kotlin.Unit.INSTANCE;
    }

    /* renamed from: $r8$lambda$LmFjgoo-OX3jYDbAq4BenCDi8Eo, reason: not valid java name */
    public static /* synthetic */ kotlin.Unit m14908$r8$lambda$LmFjgooOX3jYDbAq4BenCDi8Eo(com.paypal.oslo.feature.home.domain.model.Section section, androidx.compose.runtime.Composer composer, int i) {
        if (composer.shouldExecute((i & 3) != 2, i & 1)) {
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventStart(-1986432330, i, -1, "com.paypal.oslo.feature.home.ui.LargeTileContainerPreview.<anonymous> (LargeTileContainer.kt:99)");
            }
            java.lang.Object rememberedValue = composer.rememberedValue();
            if (rememberedValue == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                rememberedValue = new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.home.ui.LargeTileContainerKt$$ExternalSyntheticLambda4
                    @Override // kotlin.jvm.functions.Function1
                    public final java.lang.Object invoke(java.lang.Object obj) {
                        return com.paypal.oslo.feature.home.ui.LargeTileContainerKt.$r8$lambda$hfw9sl5mnXBYtZw2Lb3PFtkOtRs((com.paypal.oslo.feature.home.domain.model.LargeTileContent) obj);
                    }
                };
                composer.updateRememberedValue(rememberedValue);
            }
            kotlin.jvm.functions.Function1 function1 = (kotlin.jvm.functions.Function1) rememberedValue;
            java.lang.Object rememberedValue2 = composer.rememberedValue();
            if (rememberedValue2 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                rememberedValue2 = new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.home.ui.LargeTileContainerKt$$ExternalSyntheticLambda5
                    @Override // kotlin.jvm.functions.Function1
                    public final java.lang.Object invoke(java.lang.Object obj) {
                        return com.paypal.oslo.feature.home.ui.LargeTileContainerKt.m14907$r8$lambda$JyAmiO2nyLP2M8Iu9t_mgOzR0M((com.paypal.oslo.feature.home.domain.model.LargeTileContent) obj);
                    }
                };
                composer.updateRememberedValue(rememberedValue2);
            }
            kotlin.jvm.functions.Function1 function12 = (kotlin.jvm.functions.Function1) rememberedValue2;
            java.lang.Object rememberedValue3 = composer.rememberedValue();
            if (rememberedValue3 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                rememberedValue3 = new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.feature.home.ui.LargeTileContainerKt$$ExternalSyntheticLambda6
                    @Override // kotlin.jvm.functions.Function0
                    public final java.lang.Object invoke() {
                        kotlin.Unit unit;
                        unit = kotlin.Unit.INSTANCE;
                        return unit;
                    }
                };
                composer.updateRememberedValue(rememberedValue3);
            }
            LargeTileContainer(section, function1, function12, (kotlin.jvm.functions.Function0) rememberedValue3, null, composer, 3504, 16);
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventEnd();
            }
        } else {
            composer.skipToGroupEnd();
        }
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ java.lang.Object $r8$lambda$ThowOf4zFciIjzVh3ay8bCcdL7c(int i, com.paypal.oslo.feature.home.domain.model.LargeTileContent largeTileContent) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(largeTileContent, "");
        return largeTileContent.getId();
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$hfw9sl5mnXBYtZw2Lb3PFtkOtRs(com.paypal.oslo.feature.home.domain.model.LargeTileContent largeTileContent) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(largeTileContent, "");
        return kotlin.Unit.INSTANCE;
    }

    /* renamed from: $r8$lambda$ybTREDPndw9rnlFdg_uS-9z453E, reason: not valid java name */
    public static /* synthetic */ kotlin.Unit m14909$r8$lambda$ybTREDPndw9rnlFdg_uS9z453E(final com.paypal.oslo.feature.home.domain.model.Section section, final kotlin.jvm.functions.Function1 function1, final kotlin.jvm.functions.Function1 function12, androidx.compose.foundation.layout.ColumnScope columnScope, androidx.compose.runtime.Composer composer, int i) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(columnScope, "");
        if (composer.shouldExecute((i & 17) != 16, i & 1)) {
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventStart(35450574, i, -1, "com.paypal.oslo.feature.home.ui.LargeTileContainer.<anonymous> (LargeTileContainer.kt:60)");
            }
            androidx.compose.foundation.layout.SpacerKt.Spacer(androidx.compose.foundation.layout.SizeKt.m1726height3ABfNKs(androidx.compose.ui.Modifier.INSTANCE, com.paypal.pds.core.ConstantsKt.getSpacing32()), composer, 0);
            androidx.compose.foundation.layout.PaddingValues m1701PaddingValuesYgX7TsA$default = androidx.compose.foundation.layout.PaddingKt.m1701PaddingValuesYgX7TsA$default(com.paypal.pds.core.ConstantsKt.getSpacing16(), 0.0f, 2, null);
            androidx.compose.foundation.layout.Arrangement.HorizontalOrVertical m1602spacedBy0680j_4 = androidx.compose.foundation.layout.Arrangement.INSTANCE.m1602spacedBy0680j_4(com.paypal.pds.core.ConstantsKt.getSpacing8());
            androidx.compose.ui.Modifier testTag = androidx.compose.ui.platform.TestTagKt.testTag(androidx.compose.foundation.layout.SizeKt.wrapContentHeight$default(androidx.compose.foundation.layout.SizeKt.fillMaxWidth$default(androidx.compose.ui.Modifier.INSTANCE, 0.0f, 1, null), null, false, 3, null), "large_tile_collection_section");
            androidx.compose.foundation.layout.Arrangement.HorizontalOrVertical horizontalOrVertical = m1602spacedBy0680j_4;
            boolean changedInstance = composer.changedInstance(section);
            boolean changed = composer.changed(function1);
            boolean changed2 = composer.changed(function12);
            java.lang.Object rememberedValue = composer.rememberedValue();
            if ((changedInstance | changed | changed2) || rememberedValue == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                rememberedValue = new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.home.ui.LargeTileContainerKt$$ExternalSyntheticLambda7
                    @Override // kotlin.jvm.functions.Function1
                    public final java.lang.Object invoke(java.lang.Object obj) {
                        return com.paypal.oslo.feature.home.ui.LargeTileContainerKt.$r8$lambda$2ZUlkMGF_0c5gw2LxLicjX8ydYI(com.paypal.oslo.feature.home.domain.model.Section.this, function1, function12, (androidx.compose.foundation.lazy.LazyListScope) obj);
                    }
                };
                composer.updateRememberedValue(rememberedValue);
            }
            androidx.compose.foundation.lazy.LazyDslKt.LazyRow(testTag, null, m1701PaddingValuesYgX7TsA$default, false, horizontalOrVertical, null, null, false, null, (kotlin.jvm.functions.Function1) rememberedValue, composer, 6, 490);
            androidx.compose.foundation.layout.SpacerKt.Spacer(androidx.compose.foundation.layout.SizeKt.m1726height3ABfNKs(androidx.compose.ui.Modifier.INSTANCE, com.paypal.pds.core.ConstantsKt.getSpacing16()), composer, 0);
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventEnd();
            }
        } else {
            composer.skipToGroupEnd();
        }
        return kotlin.Unit.INSTANCE;
    }

    /* renamed from: $r8$lambda$zPN6YTuf-dTE5KcAInKaxtUptgQ, reason: not valid java name */
    public static /* synthetic */ kotlin.Unit m14910$r8$lambda$zPN6YTufdTE5KcAInKaxtUptgQ(com.paypal.oslo.feature.home.domain.model.Section section, kotlin.jvm.functions.Function1 function1, kotlin.jvm.functions.Function1 function12, kotlin.jvm.functions.Function0 function0, androidx.compose.ui.Modifier modifier, int i, int i2, androidx.compose.runtime.Composer composer, int i3) {
        LargeTileContainer(section, function1, function12, function0, modifier, composer, androidx.compose.runtime.RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
        return kotlin.Unit.INSTANCE;
    }
}
