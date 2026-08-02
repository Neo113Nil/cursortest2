package com.paypal.oslo.feature.home.ui;

@kotlin.Metadata(d1 = {"\u0000.\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0007\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\u001a7\u0010\u0007\u001a\u00020\b2\n\u0010\t\u001a\u0006\u0012\u0002\b\u00030\n2\u0012\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\b0\f2\b\b\u0002\u0010\u000e\u001a\u00020\u000fH\u0001¢\u0006\u0002\u0010\u0010\u001a\u0017\u0010\u0011\u001a\u00020\u00012\u0006\u0010\u0012\u001a\u00020\u0001H\u0000¢\u0006\u0004\b\u0013\u0010\u0014\u001a\r\u0010\u0015\u001a\u00020\bH\u0003¢\u0006\u0002\u0010\u0016\"\u0016\u0010\u0000\u001a\u00020\u0001X\u0080\u0004¢\u0006\n\n\u0002\u0010\u0004\u001a\u0004\b\u0002\u0010\u0003\"\u000e\u0010\u0005\u001a\u00020\u0006X\u0082T¢\u0006\u0002\n\u0000¨\u0006\u0017"}, d2 = {"AccountSnapshotContainerHeightDp", "Landroidx/compose/ui/unit/Dp;", "getAccountSnapshotContainerHeightDp", "()F", com.adobe.marketing.mobile.internal.CoreConstants.Wrapper.Type.FLUTTER, "AccountSnapshotContainerHeightAmplifier", "", "AccountSnapshotContainer", "", "section", "Lcom/paypal/oslo/feature/home/domain/model/Section;", "onAccountSnapshotItemClick", "Lkotlin/Function1;", "Lcom/paypal/oslo/feature/home/domain/model/AccountSnapshotItem;", "modifier", "Landroidx/compose/ui/Modifier;", "(Lcom/paypal/oslo/feature/home/domain/model/Section;Lkotlin/jvm/functions/Function1;Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;II)V", "calculateChipsWidth", "screenWidth", "calculateChipsWidth-0680j_4", "(F)F", "WalletContainerPreview", "(Landroidx/compose/runtime/Composer;I)V", "home_prodRelease"}, k = 2, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class AccountSnapshotContainerKt {
    private static final float getHighSpeedVideoFpsRangesFor = androidx.compose.ui.unit.Dp.m8601constructorimpl(104.0f);

    public static final float getAccountSnapshotContainerHeightDp() {
        return getHighSpeedVideoFpsRangesFor;
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x0059  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0064  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0100  */
    /* JADX WARN: Removed duplicated region for block: B:44:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:47:0x00f7  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x005b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void AccountSnapshotContainer(final com.paypal.oslo.feature.home.domain.model.Section<?> section, final kotlin.jvm.functions.Function1<? super com.paypal.oslo.feature.home.domain.model.AccountSnapshotItem, kotlin.Unit> function1, androidx.compose.ui.Modifier modifier, androidx.compose.runtime.Composer composer, final int i, final int i2) {
        int i3;
        final androidx.compose.ui.Modifier modifier2;
        androidx.compose.runtime.ScopeUpdateScope endRestartGroup;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(section, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(function1, "");
        androidx.compose.runtime.Composer startRestartGroup = composer.startRestartGroup(-547078991);
        if ((i & 6) == 0) {
            i3 = (startRestartGroup.changedInstance(section) ? 4 : 2) | i;
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
                    androidx.compose.runtime.ComposerKt.traceEventStart(-547078991, i3, -1, "com.paypal.oslo.feature.home.ui.AccountSnapshotContainer (AccountSnapshotContainer.kt:61)");
                }
                float m8601constructorimpl = androidx.compose.ui.unit.Dp.m8601constructorimpl(((android.content.res.Configuration) startRestartGroup.consume(androidx.compose.ui.platform.AndroidCompositionLocals_androidKt.getLocalConfiguration())).screenWidthDp);
                boolean changed = startRestartGroup.changed(m8601constructorimpl);
                java.lang.Object rememberedValue = startRestartGroup.rememberedValue();
                if (changed || rememberedValue == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                    rememberedValue = androidx.compose.ui.unit.Dp.m8599boximpl(m14874calculateChipsWidth0680j_4(m8601constructorimpl));
                    startRestartGroup.updateRememberedValue(rememberedValue);
                }
                final float m8615unboximpl = ((androidx.compose.ui.unit.Dp) rememberedValue).m8615unboximpl();
                java.lang.Object rememberedValue2 = startRestartGroup.rememberedValue();
                if (rememberedValue2 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                    rememberedValue2 = new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.feature.home.ui.AccountSnapshotContainerKt$$ExternalSyntheticLambda2
                        @Override // kotlin.jvm.functions.Function0
                        public final java.lang.Object invoke() {
                            kotlin.Unit unit;
                            unit = kotlin.Unit.INSTANCE;
                            return unit;
                        }
                    };
                    startRestartGroup.updateRememberedValue(rememberedValue2);
                }
                com.paypal.oslo.feature.home.ui.HomeCollectionsKt.CollectionSection(section, (kotlin.jvm.functions.Function0) rememberedValue2, modifier3, null, null, false, androidx.compose.runtime.internal.ComposableLambdaKt.rememberComposableLambda(469818647, true, new kotlin.jvm.functions.Function3() { // from class: com.paypal.oslo.feature.home.ui.AccountSnapshotContainerKt$$ExternalSyntheticLambda3
                    @Override // kotlin.jvm.functions.Function3
                    public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2, java.lang.Object obj3) {
                        return com.paypal.oslo.feature.home.ui.AccountSnapshotContainerKt.$r8$lambda$sJ4EyGouyR1pyr8_0wua4HBM8rI(com.paypal.oslo.feature.home.domain.model.Section.this, function1, m8615unboximpl, (androidx.compose.foundation.layout.ColumnScope) obj, (androidx.compose.runtime.Composer) obj2, ((java.lang.Integer) obj3).intValue());
                    }
                }, startRestartGroup, 54), startRestartGroup, (i3 & 14) | 1572912 | (i3 & 896), 56);
                if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                    androidx.compose.runtime.ComposerKt.traceEventEnd();
                }
                modifier2 = modifier3;
            }
            endRestartGroup = startRestartGroup.endRestartGroup();
            if (endRestartGroup == null) {
                endRestartGroup.updateScope(new kotlin.jvm.functions.Function2() { // from class: com.paypal.oslo.feature.home.ui.AccountSnapshotContainerKt$$ExternalSyntheticLambda4
                    @Override // kotlin.jvm.functions.Function2
                    public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                        return com.paypal.oslo.feature.home.ui.AccountSnapshotContainerKt.$r8$lambda$WoeEywf28nkMYP9zPRksQza4WgY(com.paypal.oslo.feature.home.domain.model.Section.this, function1, modifier2, i, i2, (androidx.compose.runtime.Composer) obj, ((java.lang.Integer) obj2).intValue());
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

    /* renamed from: calculateChipsWidth-0680j_4, reason: not valid java name */
    public static final float m14874calculateChipsWidth0680j_4(float f) {
        float max = java.lang.Math.max(1.0f, (float) java.lang.Math.floor(f / com.paypal.oslo.feature.home.ui.AccountSnapshotChipKt.getAccountSnapshotChipMaxWidthDp()));
        return ((androidx.compose.ui.unit.Dp) kotlin.ranges.RangesKt.coerceAtMost(androidx.compose.ui.unit.Dp.m8599boximpl(androidx.compose.ui.unit.Dp.m8601constructorimpl(androidx.compose.ui.unit.Dp.m8601constructorimpl(androidx.compose.ui.unit.Dp.m8601constructorimpl(androidx.compose.ui.unit.Dp.m8601constructorimpl(f - com.paypal.pds.core.ConstantsKt.getSpacing16()) - com.paypal.pds.core.ConstantsKt.getSize24()) - androidx.compose.ui.unit.Dp.m8601constructorimpl(com.paypal.pds.core.ConstantsKt.getSpacing8() * max)) / max)), androidx.compose.ui.unit.Dp.m8599boximpl(com.paypal.oslo.feature.home.ui.AccountSnapshotChipKt.getAccountSnapshotChipMaxWidthDp()))).m8615unboximpl();
    }

    public static /* synthetic */ java.lang.Object $r8$lambda$5tlSDgLPa5Ham0sQ70UhECqxEM0(int i, com.paypal.oslo.feature.home.domain.model.AccountSnapshotItem accountSnapshotItem) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(accountSnapshotItem, "");
        return accountSnapshotItem.getId();
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$Ak7oMBrCtAQHsiguUynvwHER8Rk(final com.paypal.oslo.feature.home.domain.model.Section section, final kotlin.jvm.functions.Function1 function1, final float f, androidx.compose.foundation.lazy.LazyListScope lazyListScope) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(lazyListScope, "");
        final java.util.List displayItems = com.paypal.oslo.feature.home.domain.section.UtilsKt.getDisplayItems(section);
        final kotlin.jvm.functions.Function2 function2 = new kotlin.jvm.functions.Function2() { // from class: com.paypal.oslo.feature.home.ui.AccountSnapshotContainerKt$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function2
            public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                return com.paypal.oslo.feature.home.ui.AccountSnapshotContainerKt.$r8$lambda$5tlSDgLPa5Ham0sQ70UhECqxEM0(((java.lang.Integer) obj).intValue(), (com.paypal.oslo.feature.home.domain.model.AccountSnapshotItem) obj2);
            }
        };
        lazyListScope.items(displayItems.size(), new kotlin.jvm.functions.Function1<java.lang.Integer, java.lang.Object>() { // from class: com.paypal.oslo.feature.home.ui.AccountSnapshotContainerKt$AccountSnapshotContainer$lambda$2$0$0$$inlined$itemsIndexed$default$1
            @Override // kotlin.jvm.functions.Function1
            public final /* synthetic */ java.lang.Object invoke(java.lang.Integer num) {
                return invoke(num.intValue());
            }

            public final java.lang.Object invoke(int i) {
                return kotlin.jvm.functions.Function2.this.invoke(java.lang.Integer.valueOf(i), displayItems.get(i));
            }
        }, new kotlin.jvm.functions.Function1<java.lang.Integer, java.lang.Object>() { // from class: com.paypal.oslo.feature.home.ui.AccountSnapshotContainerKt$AccountSnapshotContainer$lambda$2$0$0$$inlined$itemsIndexed$default$2
            @Override // kotlin.jvm.functions.Function1
            public final /* synthetic */ java.lang.Object invoke(java.lang.Integer num) {
                return invoke(num.intValue());
            }

            public final java.lang.Object invoke(int i) {
                displayItems.get(i);
                return null;
            }
        }, androidx.compose.runtime.internal.ComposableLambdaKt.composableLambdaInstance(2039820996, true, new kotlin.jvm.functions.Function4<androidx.compose.foundation.lazy.LazyItemScope, java.lang.Integer, androidx.compose.runtime.Composer, java.lang.Integer, kotlin.Unit>() { // from class: com.paypal.oslo.feature.home.ui.AccountSnapshotContainerKt$AccountSnapshotContainer$lambda$2$0$0$$inlined$itemsIndexed$default$3
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
                final com.paypal.oslo.feature.home.domain.model.AccountSnapshotItem accountSnapshotItem = (com.paypal.oslo.feature.home.domain.model.AccountSnapshotItem) displayItems.get(i);
                composer.startReplaceGroup(128972562);
                androidx.compose.ui.Modifier sectionItemTestTag = com.paypal.oslo.feature.home.ui.utils.TestTagKt.sectionItemTestTag(com.paypal.pds.components.ShimmerKt.shimmer(androidx.compose.ui.Modifier.INSTANCE, com.paypal.oslo.feature.home.domain.section.UtilsKt.isLoading(section), null, composer, 6, 2), section, i);
                boolean changed = composer.changed(function1);
                boolean changedInstance = composer.changedInstance(accountSnapshotItem);
                java.lang.Object rememberedValue = composer.rememberedValue();
                if ((changed | changedInstance) || rememberedValue == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                    final kotlin.jvm.functions.Function1 function12 = function1;
                    rememberedValue = (kotlin.jvm.functions.Function0) new kotlin.jvm.functions.Function0<kotlin.Unit>() { // from class: com.paypal.oslo.feature.home.ui.AccountSnapshotContainerKt$AccountSnapshotContainer$2$1$1$2$1$1
                        @Override // kotlin.jvm.functions.Function0
                        public final /* bridge */ /* synthetic */ kotlin.Unit invoke() {
                            function12.invoke(accountSnapshotItem);
                            return kotlin.Unit.INSTANCE;
                        }
                    };
                    composer.updateRememberedValue(rememberedValue);
                }
                com.paypal.oslo.feature.home.ui.AccountSnapshotChipKt.m14873AccountSnapshotChipjt2gSs(accountSnapshotItem, (kotlin.jvm.functions.Function0) rememberedValue, sectionItemTestTag, f, composer, 0, 0);
                composer.endReplaceGroup();
                if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                    androidx.compose.runtime.ComposerKt.traceEventEnd();
                }
            }
        }));
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$OEcZPqqJbB5e95VrDf0UJXo2sYM(int i, androidx.compose.runtime.Composer composer, int i2) {
        final int updateChangedFlags = androidx.compose.runtime.RecomposeScopeImplKt.updateChangedFlags(i | 1);
        androidx.compose.runtime.Composer startRestartGroup = composer.startRestartGroup(-1912188688);
        if (!startRestartGroup.shouldExecute(updateChangedFlags != 0, updateChangedFlags & 1)) {
            startRestartGroup.skipToGroupEnd();
        } else {
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventStart(-1912188688, updateChangedFlags, -1, "com.paypal.oslo.feature.home.ui.WalletContainerPreview (AccountSnapshotContainer.kt:127)");
            }
            com.paypal.oslo.feature.home.ui.preview.HomePreviewKt.HomePreview(com.paypal.oslo.feature.home.ui.ComposableSingletons$AccountSnapshotContainerKt.INSTANCE.getLambda$107629358$home_prodRelease(), startRestartGroup, 6);
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventEnd();
            }
        }
        androidx.compose.runtime.ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new kotlin.jvm.functions.Function2() { // from class: com.paypal.oslo.feature.home.ui.AccountSnapshotContainerKt$$ExternalSyntheticLambda5
                @Override // kotlin.jvm.functions.Function2
                public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                    return com.paypal.oslo.feature.home.ui.AccountSnapshotContainerKt.$r8$lambda$OEcZPqqJbB5e95VrDf0UJXo2sYM(updateChangedFlags, (androidx.compose.runtime.Composer) obj, ((java.lang.Integer) obj2).intValue());
                }
            });
        }
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$WoeEywf28nkMYP9zPRksQza4WgY(com.paypal.oslo.feature.home.domain.model.Section section, kotlin.jvm.functions.Function1 function1, androidx.compose.ui.Modifier modifier, int i, int i2, androidx.compose.runtime.Composer composer, int i3) {
        AccountSnapshotContainer(section, function1, modifier, composer, androidx.compose.runtime.RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$sJ4EyGouyR1pyr8_0wua4HBM8rI(final com.paypal.oslo.feature.home.domain.model.Section section, final kotlin.jvm.functions.Function1 function1, final float f, androidx.compose.foundation.layout.ColumnScope columnScope, androidx.compose.runtime.Composer composer, int i) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(columnScope, "");
        if (composer.shouldExecute((i & 17) != 16, i & 1)) {
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventStart(469818647, i, -1, "com.paypal.oslo.feature.home.ui.AccountSnapshotContainer.<anonymous> (AccountSnapshotContainer.kt:70)");
            }
            androidx.compose.foundation.layout.Arrangement.HorizontalOrVertical m1602spacedBy0680j_4 = androidx.compose.foundation.layout.Arrangement.INSTANCE.m1602spacedBy0680j_4(com.paypal.pds.core.ConstantsKt.getSpacing8());
            androidx.compose.foundation.layout.PaddingValues m1701PaddingValuesYgX7TsA$default = androidx.compose.foundation.layout.PaddingKt.m1701PaddingValuesYgX7TsA$default(com.paypal.pds.core.ConstantsKt.getSpacing16(), 0.0f, 2, null);
            androidx.compose.ui.Modifier testTag = androidx.compose.ui.platform.TestTagKt.testTag(com.paypal.oslo.feature.home.ui.utils.AccessibilityUtilsKt.m14985fontScaledHeightDzVHIIc(androidx.compose.foundation.layout.SizeKt.fillMaxWidth$default(androidx.compose.ui.Modifier.INSTANCE, 0.0f, 1, null), getHighSpeedVideoFpsRangesFor, 1.25f, 0.0f, composer, 438, 4), "AccountSnapshot_LazyRow_".concat(java.lang.String.valueOf(section.getId())));
            androidx.compose.foundation.layout.Arrangement.HorizontalOrVertical horizontalOrVertical = m1602spacedBy0680j_4;
            boolean changedInstance = composer.changedInstance(section);
            boolean changed = composer.changed(function1);
            boolean changed2 = composer.changed(f);
            java.lang.Object rememberedValue = composer.rememberedValue();
            if ((changedInstance | changed | changed2) || rememberedValue == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                rememberedValue = new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.home.ui.AccountSnapshotContainerKt$$ExternalSyntheticLambda1
                    @Override // kotlin.jvm.functions.Function1
                    public final java.lang.Object invoke(java.lang.Object obj) {
                        return com.paypal.oslo.feature.home.ui.AccountSnapshotContainerKt.$r8$lambda$Ak7oMBrCtAQHsiguUynvwHER8Rk(com.paypal.oslo.feature.home.domain.model.Section.this, function1, f, (androidx.compose.foundation.lazy.LazyListScope) obj);
                    }
                };
                composer.updateRememberedValue(rememberedValue);
            }
            androidx.compose.foundation.lazy.LazyDslKt.LazyRow(testTag, null, m1701PaddingValuesYgX7TsA$default, false, horizontalOrVertical, null, null, false, null, (kotlin.jvm.functions.Function1) rememberedValue, composer, 0, 490);
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventEnd();
            }
        } else {
            composer.skipToGroupEnd();
        }
        return kotlin.Unit.INSTANCE;
    }
}
