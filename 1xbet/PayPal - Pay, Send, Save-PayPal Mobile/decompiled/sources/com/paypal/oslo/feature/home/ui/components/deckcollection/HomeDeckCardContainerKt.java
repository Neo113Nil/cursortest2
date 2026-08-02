package com.paypal.oslo.feature.home.ui.components.deckcollection;

@kotlin.Metadata(d1 = {"\u0000&\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\u001aA\u0010\u0000\u001a\u00020\u00012\n\u0010\u0002\u001a\u0006\u0012\u0002\b\u00030\u00032\u0012\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00010\u00052\b\b\u0002\u0010\u0007\u001a\u00020\b2\b\b\u0002\u0010\t\u001a\u00020\nH\u0001¢\u0006\u0002\u0010\u000b\u001a\r\u0010\f\u001a\u00020\u0001H\u0003¢\u0006\u0002\u0010\r\u001a\r\u0010\u000e\u001a\u00020\u0001H\u0003¢\u0006\u0002\u0010\r¨\u0006\u000f"}, d2 = {"HomeDeckCardContainer", "", "section", "Lcom/paypal/oslo/feature/home/domain/model/Section;", "onCollectionItemClick", "Lkotlin/Function1;", "Lcom/paypal/oslo/feature/home/domain/model/DeckCardContent;", "modifier", "Landroidx/compose/ui/Modifier;", "hapticFeedbackEnabled", "", "(Lcom/paypal/oslo/feature/home/domain/model/Section;Lkotlin/jvm/functions/Function1;Landroidx/compose/ui/Modifier;ZLandroidx/compose/runtime/Composer;II)V", "FeaturedOffersHomeDeckCardContainerPreview", "(Landroidx/compose/runtime/Composer;I)V", "MinimalHomeDeckCardContainerPreview", "home_prodRelease"}, k = 2, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class HomeDeckCardContainerKt {
    /* JADX WARN: Removed duplicated region for block: B:20:0x0057  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0077  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0082  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0169  */
    /* JADX WARN: Removed duplicated region for block: B:51:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:64:0x015e  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x0079  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x005a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void HomeDeckCardContainer(final com.paypal.oslo.feature.home.domain.model.Section<?> section, final kotlin.jvm.functions.Function1<? super com.paypal.oslo.feature.home.domain.model.DeckCardContent, kotlin.Unit> function1, androidx.compose.ui.Modifier modifier, boolean z, androidx.compose.runtime.Composer composer, final int i, final int i2) {
        int i3;
        androidx.compose.ui.Modifier modifier2;
        int i4;
        boolean z2;
        androidx.compose.ui.Modifier modifier3;
        final boolean z3;
        androidx.compose.runtime.ScopeUpdateScope endRestartGroup;
        androidx.compose.ui.Modifier available;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(section, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(function1, "");
        androidx.compose.runtime.Composer startRestartGroup = composer.startRestartGroup(1749404662);
        if ((i & 6) == 0) {
            i3 = (startRestartGroup.changedInstance(section) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i & 48) == 0) {
            i3 |= startRestartGroup.changedInstance(function1) ? 32 : 16;
        }
        int i5 = i2 & 4;
        if (i5 != 0) {
            i3 |= 384;
        } else if ((i & 384) == 0) {
            modifier2 = modifier;
            i3 |= startRestartGroup.changed(modifier2) ? 256 : 128;
            i4 = i2 & 8;
            if (i4 == 0) {
                i3 |= 3072;
            } else if ((i & 3072) == 0) {
                z2 = z;
                i3 |= startRestartGroup.changed(z2) ? 2048 : 1024;
                if (!startRestartGroup.shouldExecute((i3 & 1171) != 1170, i3 & 1)) {
                    startRestartGroup.skipToGroupEnd();
                    modifier3 = modifier2;
                    z3 = z2;
                } else {
                    modifier3 = i5 != 0 ? androidx.compose.ui.Modifier.INSTANCE : modifier2;
                    boolean z4 = i4 != 0 ? false : z2;
                    if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                        androidx.compose.runtime.ComposerKt.traceEventStart(1749404662, i3, -1, "com.paypal.oslo.feature.home.ui.components.deckcollection.HomeDeckCardContainer (HomeDeckCardContainer.kt:48)");
                    }
                    final java.util.List displayItems = com.paypal.oslo.feature.home.domain.section.UtilsKt.getDisplayItems(section);
                    com.paypal.oslo.feature.home.domain.model.SectionInstrumentation instrumentation = section.getInstrumentation();
                    if (instrumentation != null) {
                        startRestartGroup.startReplaceGroup(1381432273);
                        androidx.compose.ui.Modifier module = com.paypal.oslo.core.telemetry.compose.ModifierExtensionsKt.module(!instrumentation.getContexts().isEmpty() ? com.paypal.oslo.core.telemetry.compose.ModifierExtensionsKt.context(modifier3, instrumentation.getContexts()) : modifier3, new com.paypal.oslo.core.telemetry.analytics.schema.context.UIContext.Module(instrumentation.getModuleName(), 0, null, java.lang.Integer.valueOf(instrumentation.getPosition()), 6, null));
                        boolean changedInstance = startRestartGroup.changedInstance(section);
                        java.lang.Object rememberedValue = startRestartGroup.rememberedValue();
                        if (changedInstance || rememberedValue == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                            rememberedValue = new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.feature.home.ui.components.deckcollection.HomeDeckCardContainerKt$$ExternalSyntheticLambda2
                                @Override // kotlin.jvm.functions.Function0
                                public final java.lang.Object invoke() {
                                    return java.lang.Boolean.valueOf(com.paypal.oslo.feature.home.ui.components.deckcollection.HomeDeckCardContainerKt.$r8$lambda$KP732MU0CTbDjh59WdykiEV84mo(com.paypal.oslo.feature.home.domain.model.Section.this));
                                }
                            };
                            startRestartGroup.updateRememberedValue(rememberedValue);
                        }
                        available = com.paypal.oslo.core.telemetry.compose.ModifierExtensionsKt.available(module, (kotlin.jvm.functions.Function0) rememberedValue, startRestartGroup, 0);
                        startRestartGroup.endReplaceGroup();
                    } else {
                        startRestartGroup.startReplaceGroup(1381432272);
                        startRestartGroup.endReplaceGroup();
                        available = null;
                    }
                    if (available == null) {
                        available = modifier3;
                    }
                    androidx.compose.ui.Modifier testTag = androidx.compose.ui.platform.TestTagKt.testTag(available, "deck_collection_section");
                    java.lang.Object rememberedValue2 = startRestartGroup.rememberedValue();
                    if (rememberedValue2 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                        rememberedValue2 = new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.home.ui.components.deckcollection.HomeDeckCardContainerKt$$ExternalSyntheticLambda3
                            @Override // kotlin.jvm.functions.Function1
                            public final java.lang.Object invoke(java.lang.Object obj) {
                                return com.paypal.oslo.feature.home.ui.components.deckcollection.HomeDeckCardContainerKt.$r8$lambda$mgCrDh6bUwpwIpHmN25yd9wugrU((com.paypal.oslo.feature.home.domain.model.DeckCardContent) obj);
                            }
                        };
                        startRestartGroup.updateRememberedValue(rememberedValue2);
                    }
                    com.paypal.oslo.core.commonui.components.containers.DeckKt.Deck(displayItems, (kotlin.jvm.functions.Function1) rememberedValue2, testTag, z4, null, androidx.compose.runtime.internal.ComposableLambdaKt.rememberComposableLambda(-175356345, true, new kotlin.jvm.functions.Function3() { // from class: com.paypal.oslo.feature.home.ui.components.deckcollection.HomeDeckCardContainerKt$$ExternalSyntheticLambda4
                        @Override // kotlin.jvm.functions.Function3
                        public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2, java.lang.Object obj3) {
                            return com.paypal.oslo.feature.home.ui.components.deckcollection.HomeDeckCardContainerKt.m14942$r8$lambda$Lz5uaJHTR6OmVHuqDYbosrclV8(com.paypal.oslo.feature.home.domain.model.Section.this, function1, displayItems, (com.paypal.oslo.feature.home.domain.model.DeckCardContent) obj, (androidx.compose.runtime.Composer) obj2, ((java.lang.Integer) obj3).intValue());
                        }
                    }, startRestartGroup, 54), startRestartGroup, (i3 & 7168) | 196656, 16);
                    if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                        androidx.compose.runtime.ComposerKt.traceEventEnd();
                    }
                    z3 = z4;
                }
                endRestartGroup = startRestartGroup.endRestartGroup();
                if (endRestartGroup != null) {
                    final androidx.compose.ui.Modifier modifier4 = modifier3;
                    endRestartGroup.updateScope(new kotlin.jvm.functions.Function2() { // from class: com.paypal.oslo.feature.home.ui.components.deckcollection.HomeDeckCardContainerKt$$ExternalSyntheticLambda5
                        @Override // kotlin.jvm.functions.Function2
                        public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                            return com.paypal.oslo.feature.home.ui.components.deckcollection.HomeDeckCardContainerKt.$r8$lambda$HZPkd3hgr4vY7uAxICvlTNl7_po(com.paypal.oslo.feature.home.domain.model.Section.this, function1, modifier4, z3, i, i2, (androidx.compose.runtime.Composer) obj, ((java.lang.Integer) obj2).intValue());
                        }
                    });
                    return;
                }
                return;
            }
            z2 = z;
            if (!startRestartGroup.shouldExecute((i3 & 1171) != 1170, i3 & 1)) {
            }
            endRestartGroup = startRestartGroup.endRestartGroup();
            if (endRestartGroup != null) {
            }
        }
        modifier2 = modifier;
        i4 = i2 & 8;
        if (i4 == 0) {
        }
        z2 = z;
        if (!startRestartGroup.shouldExecute((i3 & 1171) != 1170, i3 & 1)) {
        }
        endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
        }
    }

    /* renamed from: $r8$lambda$22-otHbt1RVIIfOShJwSq3xpLHE, reason: not valid java name */
    public static /* synthetic */ kotlin.Unit m14941$r8$lambda$22otHbt1RVIIfOShJwSq3xpLHE(com.paypal.oslo.feature.home.domain.model.Section section, androidx.compose.runtime.Composer composer, int i) {
        if (composer.shouldExecute((i & 3) != 2, i & 1)) {
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventStart(484987512, i, -1, "com.paypal.oslo.feature.home.ui.components.deckcollection.MinimalHomeDeckCardContainerPreview.<anonymous> (HomeDeckCardContainer.kt:113)");
            }
            java.lang.Object rememberedValue = composer.rememberedValue();
            if (rememberedValue == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                rememberedValue = new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.home.ui.components.deckcollection.HomeDeckCardContainerKt$$ExternalSyntheticLambda6
                    @Override // kotlin.jvm.functions.Function1
                    public final java.lang.Object invoke(java.lang.Object obj) {
                        return com.paypal.oslo.feature.home.ui.components.deckcollection.HomeDeckCardContainerKt.$r8$lambda$iqDbeisVLcX07F3wKldQfWSuBAY((com.paypal.oslo.feature.home.domain.model.DeckCardContent) obj);
                    }
                };
                composer.updateRememberedValue(rememberedValue);
            }
            HomeDeckCardContainer(section, (kotlin.jvm.functions.Function1) rememberedValue, androidx.compose.foundation.layout.SizeKt.fillMaxWidth$default(androidx.compose.ui.Modifier.INSTANCE, 0.0f, 1, null), false, composer, 432, 8);
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventEnd();
            }
        } else {
            composer.skipToGroupEnd();
        }
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$FD0o2soR_6szkZzMJJ0UVDeKwwE(int i, androidx.compose.runtime.Composer composer, int i2) {
        final int updateChangedFlags = androidx.compose.runtime.RecomposeScopeImplKt.updateChangedFlags(i | 1);
        androidx.compose.runtime.Composer startRestartGroup = composer.startRestartGroup(1957598618);
        if (!startRestartGroup.shouldExecute(updateChangedFlags != 0, updateChangedFlags & 1)) {
            startRestartGroup.skipToGroupEnd();
        } else {
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventStart(1957598618, updateChangedFlags, -1, "com.paypal.oslo.feature.home.ui.components.deckcollection.FeaturedOffersHomeDeckCardContainerPreview (HomeDeckCardContainer.kt:82)");
            }
            final com.paypal.oslo.feature.home.domain.model.Section createSection$home_prodRelease$default = com.paypal.oslo.feature.home.ui.preview.SectionPreviews.createSection$home_prodRelease$default(com.paypal.oslo.feature.home.ui.preview.SectionPreviews.INSTANCE, "deckCardSection", null, "Featured Offers", "Discover exclusive deals from top brands", com.paypal.oslo.feature.home.ui.preview.DeckCardPreviews.INSTANCE.createSampleDeckCards$home_prodRelease(3), null, 2, null);
            com.paypal.oslo.feature.home.ui.preview.HomePreviewKt.HomePreview(androidx.compose.runtime.internal.ComposableLambdaKt.rememberComposableLambda(-795615076, true, new kotlin.jvm.functions.Function2() { // from class: com.paypal.oslo.feature.home.ui.components.deckcollection.HomeDeckCardContainerKt$$ExternalSyntheticLambda8
                @Override // kotlin.jvm.functions.Function2
                public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                    return com.paypal.oslo.feature.home.ui.components.deckcollection.HomeDeckCardContainerKt.$r8$lambda$FrJH3FJ4gZndf8iZeaRFhSD1TPI(com.paypal.oslo.feature.home.domain.model.Section.this, (androidx.compose.runtime.Composer) obj, ((java.lang.Integer) obj2).intValue());
                }
            }, startRestartGroup, 54), startRestartGroup, 6);
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventEnd();
            }
        }
        androidx.compose.runtime.ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new kotlin.jvm.functions.Function2() { // from class: com.paypal.oslo.feature.home.ui.components.deckcollection.HomeDeckCardContainerKt$$ExternalSyntheticLambda9
                @Override // kotlin.jvm.functions.Function2
                public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                    return com.paypal.oslo.feature.home.ui.components.deckcollection.HomeDeckCardContainerKt.$r8$lambda$FD0o2soR_6szkZzMJJ0UVDeKwwE(updateChangedFlags, (androidx.compose.runtime.Composer) obj, ((java.lang.Integer) obj2).intValue());
                }
            });
        }
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$FrJH3FJ4gZndf8iZeaRFhSD1TPI(com.paypal.oslo.feature.home.domain.model.Section section, androidx.compose.runtime.Composer composer, int i) {
        if (composer.shouldExecute((i & 3) != 2, i & 1)) {
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventStart(-795615076, i, -1, "com.paypal.oslo.feature.home.ui.components.deckcollection.FeaturedOffersHomeDeckCardContainerPreview.<anonymous> (HomeDeckCardContainer.kt:91)");
            }
            java.lang.Object rememberedValue = composer.rememberedValue();
            if (rememberedValue == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                rememberedValue = new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.home.ui.components.deckcollection.HomeDeckCardContainerKt$$ExternalSyntheticLambda7
                    @Override // kotlin.jvm.functions.Function1
                    public final java.lang.Object invoke(java.lang.Object obj) {
                        return com.paypal.oslo.feature.home.ui.components.deckcollection.HomeDeckCardContainerKt.m14943$r8$lambda$q1seqGl48i8lQmKQwRWPBMz2ic((com.paypal.oslo.feature.home.domain.model.DeckCardContent) obj);
                    }
                };
                composer.updateRememberedValue(rememberedValue);
            }
            HomeDeckCardContainer(section, (kotlin.jvm.functions.Function1) rememberedValue, androidx.compose.foundation.layout.SizeKt.fillMaxWidth$default(androidx.compose.ui.Modifier.INSTANCE, 0.0f, 1, null), false, composer, 432, 8);
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventEnd();
            }
        } else {
            composer.skipToGroupEnd();
        }
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$HZPkd3hgr4vY7uAxICvlTNl7_po(com.paypal.oslo.feature.home.domain.model.Section section, kotlin.jvm.functions.Function1 function1, androidx.compose.ui.Modifier modifier, boolean z, int i, int i2, androidx.compose.runtime.Composer composer, int i3) {
        HomeDeckCardContainer(section, function1, modifier, z, composer, androidx.compose.runtime.RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ boolean $r8$lambda$KP732MU0CTbDjh59WdykiEV84mo(com.paypal.oslo.feature.home.domain.model.Section section) {
        return !com.paypal.oslo.feature.home.domain.section.UtilsKt.isLoading(section);
    }

    /* renamed from: $r8$lambda$Lz5uaJ-HTR6OmVHuqDYbosrclV8, reason: not valid java name */
    public static /* synthetic */ kotlin.Unit m14942$r8$lambda$Lz5uaJHTR6OmVHuqDYbosrclV8(com.paypal.oslo.feature.home.domain.model.Section section, final kotlin.jvm.functions.Function1 function1, java.util.List list, final com.paypal.oslo.feature.home.domain.model.DeckCardContent deckCardContent, androidx.compose.runtime.Composer composer, int i) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(deckCardContent, "");
        if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
            androidx.compose.runtime.ComposerKt.traceEventStart(-175356345, i, -1, "com.paypal.oslo.feature.home.ui.components.deckcollection.HomeDeckCardContainer.<anonymous> (HomeDeckCardContainer.kt:68)");
        }
        boolean isLoading = com.paypal.oslo.feature.home.domain.section.UtilsKt.isLoading(section);
        boolean changed = composer.changed(function1);
        boolean changedInstance = composer.changedInstance(deckCardContent);
        java.lang.Object rememberedValue = composer.rememberedValue();
        if ((changed | changedInstance) || rememberedValue == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
            rememberedValue = new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.feature.home.ui.components.deckcollection.HomeDeckCardContainerKt$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function0
                public final java.lang.Object invoke() {
                    return com.paypal.oslo.feature.home.ui.components.deckcollection.HomeDeckCardContainerKt.$r8$lambda$St5kHkMIWxFB2MrF7_DmmrlFrVI(kotlin.jvm.functions.Function1.this, deckCardContent);
                }
            };
            composer.updateRememberedValue(rememberedValue);
        }
        com.paypal.oslo.feature.home.ui.components.deckcollection.DeckCardKt.DeckCard(deckCardContent, isLoading, (kotlin.jvm.functions.Function0) rememberedValue, androidx.compose.ui.platform.TestTagKt.testTag(androidx.compose.ui.Modifier.INSTANCE, "deck_collection_section_item_".concat(java.lang.String.valueOf(list.indexOf(deckCardContent)))), composer, i & 14, 0);
        if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
            androidx.compose.runtime.ComposerKt.traceEventEnd();
        }
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$St5kHkMIWxFB2MrF7_DmmrlFrVI(kotlin.jvm.functions.Function1 function1, com.paypal.oslo.feature.home.domain.model.DeckCardContent deckCardContent) {
        function1.invoke(deckCardContent);
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$eatDydtv1MEakK8BdluwUlvQeh4(int i, androidx.compose.runtime.Composer composer, int i2) {
        final int updateChangedFlags = androidx.compose.runtime.RecomposeScopeImplKt.updateChangedFlags(i | 1);
        androidx.compose.runtime.Composer startRestartGroup = composer.startRestartGroup(852762426);
        if (!startRestartGroup.shouldExecute(updateChangedFlags != 0, updateChangedFlags & 1)) {
            startRestartGroup.skipToGroupEnd();
        } else {
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventStart(852762426, updateChangedFlags, -1, "com.paypal.oslo.feature.home.ui.components.deckcollection.MinimalHomeDeckCardContainerPreview (HomeDeckCardContainer.kt:104)");
            }
            final com.paypal.oslo.feature.home.domain.model.Section createSection$home_prodRelease$default = com.paypal.oslo.feature.home.ui.preview.SectionPreviews.createSection$home_prodRelease$default(com.paypal.oslo.feature.home.ui.preview.SectionPreviews.INSTANCE, "minimal-deck", null, "Limited Time Offers", null, com.paypal.oslo.feature.home.ui.preview.DeckCardPreviews.INSTANCE.createSampleDeckCards$home_prodRelease(2), null, 2, null);
            com.paypal.oslo.feature.home.ui.preview.HomePreviewKt.HomePreview(androidx.compose.runtime.internal.ComposableLambdaKt.rememberComposableLambda(484987512, true, new kotlin.jvm.functions.Function2() { // from class: com.paypal.oslo.feature.home.ui.components.deckcollection.HomeDeckCardContainerKt$$ExternalSyntheticLambda10
                @Override // kotlin.jvm.functions.Function2
                public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                    return com.paypal.oslo.feature.home.ui.components.deckcollection.HomeDeckCardContainerKt.m14941$r8$lambda$22otHbt1RVIIfOShJwSq3xpLHE(com.paypal.oslo.feature.home.domain.model.Section.this, (androidx.compose.runtime.Composer) obj, ((java.lang.Integer) obj2).intValue());
                }
            }, startRestartGroup, 54), startRestartGroup, 6);
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventEnd();
            }
        }
        androidx.compose.runtime.ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new kotlin.jvm.functions.Function2() { // from class: com.paypal.oslo.feature.home.ui.components.deckcollection.HomeDeckCardContainerKt$$ExternalSyntheticLambda1
                @Override // kotlin.jvm.functions.Function2
                public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                    return com.paypal.oslo.feature.home.ui.components.deckcollection.HomeDeckCardContainerKt.$r8$lambda$eatDydtv1MEakK8BdluwUlvQeh4(updateChangedFlags, (androidx.compose.runtime.Composer) obj, ((java.lang.Integer) obj2).intValue());
                }
            });
        }
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$iqDbeisVLcX07F3wKldQfWSuBAY(com.paypal.oslo.feature.home.domain.model.DeckCardContent deckCardContent) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(deckCardContent, "");
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ java.lang.Object $r8$lambda$mgCrDh6bUwpwIpHmN25yd9wugrU(com.paypal.oslo.feature.home.domain.model.DeckCardContent deckCardContent) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(deckCardContent, "");
        return deckCardContent.getId();
    }

    /* renamed from: $r8$lambda$q1seqGl48i8lQmK-QwRWPBMz2ic, reason: not valid java name */
    public static /* synthetic */ kotlin.Unit m14943$r8$lambda$q1seqGl48i8lQmKQwRWPBMz2ic(com.paypal.oslo.feature.home.domain.model.DeckCardContent deckCardContent) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(deckCardContent, "");
        return kotlin.Unit.INSTANCE;
    }
}
