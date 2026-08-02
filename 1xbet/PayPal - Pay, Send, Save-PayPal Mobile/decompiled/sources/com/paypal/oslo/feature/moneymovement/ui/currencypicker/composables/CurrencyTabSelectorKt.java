package com.paypal.oslo.feature.moneymovement.ui.currencypicker.composables;

@kotlin.Metadata(d1 = {"\u0000F\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a?\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\t2\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u000b2\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\rH\u0001¢\u0006\u0002\u0010\u000e\u001aY\u0010\u000f\u001a\u00020\u00032\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00120\u00112\u0006\u0010\u0013\u001a\u00020\u00142\u0012\u0010\u0015\u001a\u000e\u0012\u0004\u0012\u00020\u0014\u0012\u0004\u0012\u00020\u00030\u00162\b\b\u0002\u0010\b\u001a\u00020\t2\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u000b2\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\rH\u0001¢\u0006\u0002\u0010\u0017\"\u000e\u0010\u0000\u001a\u00020\u0001X\u0082T¢\u0006\u0002\n\u0000¨\u0006\u0018²\u0006\n\u0010\u0013\u001a\u00020\u0014X\u008a\u008e\u0002"}, d2 = {"SegmentedControlKey", "", "CurrencyTabSelector", "", com.google.firebase.messaging.Constants.ScionAnalytics.MessageType.DATA_MESSAGE, "Lcom/paypal/oslo/feature/moneymovement/api/currencypicker/components/tabselector/CurrencyTabSelectorData;", "callbacks", "Lcom/paypal/oslo/feature/moneymovement/api/currencypicker/components/tabselector/CurrencyTabSelectorCallbacks;", "modifier", "Landroidx/compose/ui/Modifier;", "sharedTransitionScope", "Landroidx/compose/animation/SharedTransitionScope;", "animatedContentScope", "Landroidx/compose/animation/AnimatedContentScope;", "(Lcom/paypal/oslo/feature/moneymovement/api/currencypicker/components/tabselector/CurrencyTabSelectorData;Lcom/paypal/oslo/feature/moneymovement/api/currencypicker/components/tabselector/CurrencyTabSelectorCallbacks;Landroidx/compose/ui/Modifier;Landroidx/compose/animation/SharedTransitionScope;Landroidx/compose/animation/AnimatedContentScope;Landroidx/compose/runtime/Composer;II)V", "CurrencyTabSelectorContent", "tabItems", "", "Lcom/paypal/pds/components/SegmentedControlItem;", "selectedIndex", "", "onTabClick", "Lkotlin/Function1;", "(Ljava/util/List;ILkotlin/jvm/functions/Function1;Landroidx/compose/ui/Modifier;Landroidx/compose/animation/SharedTransitionScope;Landroidx/compose/animation/AnimatedContentScope;Landroidx/compose/runtime/Composer;II)V", "money-movement_prodRelease"}, k = 2, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class CurrencyTabSelectorKt {
    /* JADX WARN: Removed duplicated region for block: B:105:0x005b  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0058  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0074  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0093  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x009e  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x01f3  */
    /* JADX WARN: Removed duplicated region for block: B:69:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:96:0x01e8  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x0095  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x0077  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void CurrencyTabSelector(final com.paypal.oslo.feature.moneymovement.api.currencypicker.components.tabselector.CurrencyTabSelectorData currencyTabSelectorData, final com.paypal.oslo.feature.moneymovement.api.currencypicker.components.tabselector.CurrencyTabSelectorCallbacks currencyTabSelectorCallbacks, androidx.compose.ui.Modifier modifier, androidx.compose.animation.SharedTransitionScope sharedTransitionScope, androidx.compose.animation.AnimatedContentScope animatedContentScope, androidx.compose.runtime.Composer composer, final int i, final int i2) {
        androidx.compose.ui.Modifier modifier2;
        int i3;
        androidx.compose.animation.SharedTransitionScope sharedTransitionScope2;
        int i4;
        androidx.compose.animation.AnimatedContentScope animatedContentScope2;
        final androidx.compose.animation.SharedTransitionScope sharedTransitionScope3;
        final androidx.compose.animation.AnimatedContentScope animatedContentScope3;
        androidx.compose.runtime.ScopeUpdateScope endRestartGroup;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(currencyTabSelectorData, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(currencyTabSelectorCallbacks, "");
        androidx.compose.runtime.Composer startRestartGroup = composer.startRestartGroup(-2045787106);
        int i5 = (i & 6) == 0 ? (startRestartGroup.changed(currencyTabSelectorData) ? 4 : 2) | i : i;
        if ((i & 48) == 0) {
            i5 |= startRestartGroup.changed(currencyTabSelectorCallbacks) ? 32 : 16;
        }
        int i6 = i2 & 4;
        if (i6 != 0) {
            i5 |= 384;
        } else if ((i & 384) == 0) {
            modifier2 = modifier;
            i5 |= startRestartGroup.changed(modifier2) ? 256 : 128;
            i3 = i2 & 8;
            if (i3 == 0) {
                i5 |= 3072;
            } else if ((i & 3072) == 0) {
                sharedTransitionScope2 = sharedTransitionScope;
                i5 |= startRestartGroup.changed(sharedTransitionScope2) ? 2048 : 1024;
                i4 = i2 & 16;
                if (i4 != 0) {
                    i5 |= 24576;
                } else if ((i & 24576) == 0) {
                    animatedContentScope2 = animatedContentScope;
                    i5 |= startRestartGroup.changedInstance(animatedContentScope2) ? 16384 : 8192;
                    if (startRestartGroup.shouldExecute((i5 & 9363) == 9362, i5 & 1)) {
                        startRestartGroup.skipToGroupEnd();
                        sharedTransitionScope3 = sharedTransitionScope2;
                        animatedContentScope3 = animatedContentScope2;
                    } else {
                        androidx.compose.ui.Modifier.Companion companion = i6 != 0 ? androidx.compose.ui.Modifier.INSTANCE : modifier2;
                        androidx.compose.animation.SharedTransitionScope sharedTransitionScope4 = i3 != 0 ? null : sharedTransitionScope2;
                        androidx.compose.animation.AnimatedContentScope animatedContentScope4 = i4 != 0 ? null : animatedContentScope2;
                        int i7 = -1;
                        if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                            androidx.compose.runtime.ComposerKt.traceEventStart(-2045787106, i5, -1, "com.paypal.oslo.feature.moneymovement.ui.currencypicker.composables.CurrencyTabSelector (CurrencyTabSelector.kt:53)");
                        }
                        boolean changed = startRestartGroup.changed(currencyTabSelectorData.getTabs());
                        java.lang.Object rememberedValue = startRestartGroup.rememberedValue();
                        if (changed || rememberedValue == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                            rememberedValue = com.paypal.oslo.feature.moneymovement.ui.currencypicker.mappers.TabItemMapperKt.toSegmentedControlItems(currencyTabSelectorData.getTabs());
                            startRestartGroup.updateRememberedValue(rememberedValue);
                        }
                        java.util.List list = (java.util.List) rememberedValue;
                        boolean changed2 = startRestartGroup.changed(currencyTabSelectorData.getTabs());
                        java.lang.Object rememberedValue2 = startRestartGroup.rememberedValue();
                        if (changed2 || rememberedValue2 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                            java.util.List<com.paypal.oslo.feature.moneymovement.api.currencypicker.components.tabselector.TabItem> tabs = currencyTabSelectorData.getTabs();
                            java.util.ArrayList arrayList = new java.util.ArrayList(kotlin.collections.CollectionsKt.collectionSizeOrDefault(tabs, 10));
                            int i8 = 0;
                            for (java.lang.Object obj : tabs) {
                                if (i8 < 0) {
                                    kotlin.collections.CollectionsKt.throwIndexOverflow();
                                }
                                arrayList.add(kotlin.TuplesKt.to(java.lang.Integer.valueOf(i8), ((com.paypal.oslo.feature.moneymovement.api.currencypicker.components.tabselector.TabItem) obj).getType()));
                                i8++;
                            }
                            rememberedValue2 = kotlin.collections.MapsKt.toMap(arrayList);
                            startRestartGroup.updateRememberedValue(rememberedValue2);
                        }
                        final java.util.Map map = (java.util.Map) rememberedValue2;
                        java.lang.Object tabs2 = currencyTabSelectorData.getTabs();
                        com.paypal.oslo.feature.moneymovement.api.shared.domain.CurrencyType selectedTab = currencyTabSelectorData.getSelectedTab();
                        boolean changed3 = startRestartGroup.changed(tabs2);
                        boolean changed4 = startRestartGroup.changed(selectedTab.ordinal());
                        java.lang.Object rememberedValue3 = startRestartGroup.rememberedValue();
                        if ((changed3 | changed4) || rememberedValue3 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                            java.util.Iterator<com.paypal.oslo.feature.moneymovement.api.currencypicker.components.tabselector.TabItem> it = currencyTabSelectorData.getTabs().iterator();
                            int i9 = 0;
                            while (true) {
                                if (!it.hasNext()) {
                                    break;
                                }
                                if (it.next().getType() == currencyTabSelectorData.getSelectedTab()) {
                                    i7 = i9;
                                    break;
                                }
                                i9++;
                            }
                            rememberedValue3 = androidx.compose.runtime.SnapshotIntStateKt.mutableIntStateOf(kotlin.ranges.RangesKt.coerceAtLeast(i7, 0));
                            startRestartGroup.updateRememberedValue(rememberedValue3);
                        }
                        final androidx.compose.runtime.MutableIntState mutableIntState = (androidx.compose.runtime.MutableIntState) rememberedValue3;
                        int intValue = mutableIntState.getIntValue();
                        boolean changed5 = startRestartGroup.changed(mutableIntState);
                        boolean changedInstance = startRestartGroup.changedInstance(map);
                        boolean z = (i5 & 112) == 32;
                        java.lang.Object rememberedValue4 = startRestartGroup.rememberedValue();
                        if ((changed5 | changedInstance | z) || rememberedValue4 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                            rememberedValue4 = new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.moneymovement.ui.currencypicker.composables.CurrencyTabSelectorKt$$ExternalSyntheticLambda0
                                @Override // kotlin.jvm.functions.Function1
                                public final java.lang.Object invoke(java.lang.Object obj2) {
                                    return com.paypal.oslo.feature.moneymovement.ui.currencypicker.composables.CurrencyTabSelectorKt.m15659$r8$lambda$If33C83uYfnq3O6erw17a11yE(map, mutableIntState, currencyTabSelectorCallbacks, ((java.lang.Integer) obj2).intValue());
                                }
                            };
                            startRestartGroup.updateRememberedValue(rememberedValue4);
                        }
                        CurrencyTabSelectorContent(list, intValue, (kotlin.jvm.functions.Function1) rememberedValue4, companion, sharedTransitionScope4, animatedContentScope4, startRestartGroup, (i5 << 3) & 523264, 0);
                        if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                            androidx.compose.runtime.ComposerKt.traceEventEnd();
                        }
                        modifier2 = companion;
                        sharedTransitionScope3 = sharedTransitionScope4;
                        animatedContentScope3 = animatedContentScope4;
                    }
                    endRestartGroup = startRestartGroup.endRestartGroup();
                    if (endRestartGroup == null) {
                        final androidx.compose.ui.Modifier modifier3 = modifier2;
                        endRestartGroup.updateScope(new kotlin.jvm.functions.Function2() { // from class: com.paypal.oslo.feature.moneymovement.ui.currencypicker.composables.CurrencyTabSelectorKt$$ExternalSyntheticLambda1
                            @Override // kotlin.jvm.functions.Function2
                            public final java.lang.Object invoke(java.lang.Object obj2, java.lang.Object obj3) {
                                return com.paypal.oslo.feature.moneymovement.ui.currencypicker.composables.CurrencyTabSelectorKt.$r8$lambda$R_YDsTuXpmLkIG8ARaSBXmrkZsE(com.paypal.oslo.feature.moneymovement.api.currencypicker.components.tabselector.CurrencyTabSelectorData.this, currencyTabSelectorCallbacks, modifier3, sharedTransitionScope3, animatedContentScope3, i, i2, (androidx.compose.runtime.Composer) obj2, ((java.lang.Integer) obj3).intValue());
                            }
                        });
                        return;
                    }
                    return;
                }
                animatedContentScope2 = animatedContentScope;
                if (startRestartGroup.shouldExecute((i5 & 9363) == 9362, i5 & 1)) {
                }
                endRestartGroup = startRestartGroup.endRestartGroup();
                if (endRestartGroup == null) {
                }
            }
            sharedTransitionScope2 = sharedTransitionScope;
            i4 = i2 & 16;
            if (i4 != 0) {
            }
            animatedContentScope2 = animatedContentScope;
            if (startRestartGroup.shouldExecute((i5 & 9363) == 9362, i5 & 1)) {
            }
            endRestartGroup = startRestartGroup.endRestartGroup();
            if (endRestartGroup == null) {
            }
        }
        modifier2 = modifier;
        i3 = i2 & 8;
        if (i3 == 0) {
        }
        sharedTransitionScope2 = sharedTransitionScope;
        i4 = i2 & 16;
        if (i4 != 0) {
        }
        animatedContentScope2 = animatedContentScope;
        if (startRestartGroup.shouldExecute((i5 & 9363) == 9362, i5 & 1)) {
        }
        endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup == null) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:27:0x006a  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0088  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00a7  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00b2  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x0140  */
    /* JADX WARN: Removed duplicated region for block: B:61:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:64:0x0135  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x00a9  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x008a  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x006d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void CurrencyTabSelectorContent(final java.util.List<com.paypal.pds.components.SegmentedControlItem> list, final int i, final kotlin.jvm.functions.Function1<? super java.lang.Integer, kotlin.Unit> function1, androidx.compose.ui.Modifier modifier, androidx.compose.animation.SharedTransitionScope sharedTransitionScope, androidx.compose.animation.AnimatedContentScope animatedContentScope, androidx.compose.runtime.Composer composer, final int i2, final int i3) {
        int i4;
        final androidx.compose.ui.Modifier modifier2;
        int i5;
        androidx.compose.animation.SharedTransitionScope sharedTransitionScope2;
        int i6;
        androidx.compose.animation.AnimatedContentScope animatedContentScope2;
        final androidx.compose.animation.SharedTransitionScope sharedTransitionScope3;
        final androidx.compose.animation.AnimatedContentScope animatedContentScope3;
        androidx.compose.runtime.ScopeUpdateScope endRestartGroup;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(list, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(function1, "");
        androidx.compose.runtime.Composer startRestartGroup = composer.startRestartGroup(-2037943159);
        if ((i2 & 6) == 0) {
            i4 = (startRestartGroup.changedInstance(list) ? 4 : 2) | i2;
        } else {
            i4 = i2;
        }
        if ((i2 & 48) == 0) {
            i4 |= startRestartGroup.changed(i) ? 32 : 16;
        }
        if ((i2 & 384) == 0) {
            i4 |= startRestartGroup.changedInstance(function1) ? 256 : 128;
        }
        int i7 = i3 & 8;
        if (i7 != 0) {
            i4 |= 3072;
        } else if ((i2 & 3072) == 0) {
            modifier2 = modifier;
            i4 |= startRestartGroup.changed(modifier2) ? 2048 : 1024;
            i5 = i3 & 16;
            if (i5 == 0) {
                i4 |= 24576;
            } else if ((i2 & 24576) == 0) {
                sharedTransitionScope2 = sharedTransitionScope;
                i4 |= startRestartGroup.changed(sharedTransitionScope2) ? 16384 : 8192;
                i6 = i3 & 32;
                if (i6 != 0) {
                    i4 |= androidx.profileinstaller.ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE;
                } else if ((196608 & i2) == 0) {
                    animatedContentScope2 = animatedContentScope;
                    i4 |= startRestartGroup.changedInstance(animatedContentScope2) ? 131072 : 65536;
                    if (startRestartGroup.shouldExecute((74899 & i4) == 74898, i4 & 1)) {
                        startRestartGroup.skipToGroupEnd();
                        sharedTransitionScope3 = sharedTransitionScope2;
                        animatedContentScope3 = animatedContentScope2;
                    } else {
                        androidx.compose.ui.Modifier modifier3 = i7 != 0 ? androidx.compose.ui.Modifier.INSTANCE : modifier2;
                        if (i5 != 0) {
                            sharedTransitionScope2 = null;
                        }
                        if (i6 != 0) {
                            animatedContentScope2 = null;
                        }
                        if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                            androidx.compose.runtime.ComposerKt.traceEventStart(-2037943159, i4, -1, "com.paypal.oslo.feature.moneymovement.ui.currencypicker.composables.CurrencyTabSelectorContent (CurrencyTabSelector.kt:99)");
                        }
                        androidx.compose.ui.Modifier m1708paddingVpY3zN4$default = androidx.compose.foundation.layout.PaddingKt.m1708paddingVpY3zN4$default(modifier3, com.paypal.pds.core.ConstantsKt.getSpacing16(), 0.0f, 2, null);
                        if (sharedTransitionScope2 != null && animatedContentScope2 != null) {
                            startRestartGroup.startReplaceGroup(1293518185);
                            androidx.compose.ui.Modifier sharedElement$default = androidx.compose.animation.SharedTransitionScope.sharedElement$default(sharedTransitionScope2, m1708paddingVpY3zN4$default, sharedTransitionScope2.rememberSharedContentState("SEGMENTED_CONTROL_KEY", startRestartGroup, 6), animatedContentScope2, null, null, false, 0.0f, null, com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_SIGNATURE_VALUE, null);
                            startRestartGroup.endReplaceGroup();
                            m1708paddingVpY3zN4$default = sharedElement$default;
                        } else {
                            startRestartGroup.startReplaceGroup(1293817769);
                            startRestartGroup.endReplaceGroup();
                        }
                        int i8 = i4 << 3;
                        androidx.compose.animation.SharedTransitionScope sharedTransitionScope4 = sharedTransitionScope2;
                        com.paypal.pds.components.SegmentedControlKt.SegmentedControl(list, m1708paddingVpY3zN4$default, i, function1, startRestartGroup, (i4 & 14) | (i8 & 896) | (i8 & 7168), 0);
                        if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                            androidx.compose.runtime.ComposerKt.traceEventEnd();
                        }
                        animatedContentScope3 = animatedContentScope2;
                        modifier2 = modifier3;
                        sharedTransitionScope3 = sharedTransitionScope4;
                    }
                    endRestartGroup = startRestartGroup.endRestartGroup();
                    if (endRestartGroup == null) {
                        endRestartGroup.updateScope(new kotlin.jvm.functions.Function2() { // from class: com.paypal.oslo.feature.moneymovement.ui.currencypicker.composables.CurrencyTabSelectorKt$$ExternalSyntheticLambda2
                            @Override // kotlin.jvm.functions.Function2
                            public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                                return com.paypal.oslo.feature.moneymovement.ui.currencypicker.composables.CurrencyTabSelectorKt.$r8$lambda$HvTVVVaFyF2K0VbEIv4Q9sCAj7M(list, i, function1, modifier2, sharedTransitionScope3, animatedContentScope3, i2, i3, (androidx.compose.runtime.Composer) obj, ((java.lang.Integer) obj2).intValue());
                            }
                        });
                        return;
                    }
                    return;
                }
                animatedContentScope2 = animatedContentScope;
                if (startRestartGroup.shouldExecute((74899 & i4) == 74898, i4 & 1)) {
                }
                endRestartGroup = startRestartGroup.endRestartGroup();
                if (endRestartGroup == null) {
                }
            }
            sharedTransitionScope2 = sharedTransitionScope;
            i6 = i3 & 32;
            if (i6 != 0) {
            }
            animatedContentScope2 = animatedContentScope;
            if (startRestartGroup.shouldExecute((74899 & i4) == 74898, i4 & 1)) {
            }
            endRestartGroup = startRestartGroup.endRestartGroup();
            if (endRestartGroup == null) {
            }
        }
        modifier2 = modifier;
        i5 = i3 & 16;
        if (i5 == 0) {
        }
        sharedTransitionScope2 = sharedTransitionScope;
        i6 = i3 & 32;
        if (i6 != 0) {
        }
        animatedContentScope2 = animatedContentScope;
        if (startRestartGroup.shouldExecute((74899 & i4) == 74898, i4 & 1)) {
        }
        endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup == null) {
        }
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$HvTVVVaFyF2K0VbEIv4Q9sCAj7M(java.util.List list, int i, kotlin.jvm.functions.Function1 function1, androidx.compose.ui.Modifier modifier, androidx.compose.animation.SharedTransitionScope sharedTransitionScope, androidx.compose.animation.AnimatedContentScope animatedContentScope, int i2, int i3, androidx.compose.runtime.Composer composer, int i4) {
        CurrencyTabSelectorContent(list, i, function1, modifier, sharedTransitionScope, animatedContentScope, composer, androidx.compose.runtime.RecomposeScopeImplKt.updateChangedFlags(i2 | 1), i3);
        return kotlin.Unit.INSTANCE;
    }

    /* renamed from: $r8$lambda$If33C83uYfnq3-O6erw17a1-1yE, reason: not valid java name */
    public static /* synthetic */ kotlin.Unit m15659$r8$lambda$If33C83uYfnq3O6erw17a11yE(java.util.Map map, androidx.compose.runtime.MutableIntState mutableIntState, com.paypal.oslo.feature.moneymovement.api.currencypicker.components.tabselector.CurrencyTabSelectorCallbacks currencyTabSelectorCallbacks, int i) {
        mutableIntState.setIntValue(i);
        com.paypal.oslo.feature.moneymovement.api.shared.domain.CurrencyType currencyType = (com.paypal.oslo.feature.moneymovement.api.shared.domain.CurrencyType) map.get(java.lang.Integer.valueOf(i));
        if (currencyType != null) {
            currencyTabSelectorCallbacks.onTabSelected(currencyType);
        }
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$R_YDsTuXpmLkIG8ARaSBXmrkZsE(com.paypal.oslo.feature.moneymovement.api.currencypicker.components.tabselector.CurrencyTabSelectorData currencyTabSelectorData, com.paypal.oslo.feature.moneymovement.api.currencypicker.components.tabselector.CurrencyTabSelectorCallbacks currencyTabSelectorCallbacks, androidx.compose.ui.Modifier modifier, androidx.compose.animation.SharedTransitionScope sharedTransitionScope, androidx.compose.animation.AnimatedContentScope animatedContentScope, int i, int i2, androidx.compose.runtime.Composer composer, int i3) {
        CurrencyTabSelector(currencyTabSelectorData, currencyTabSelectorCallbacks, modifier, sharedTransitionScope, animatedContentScope, composer, androidx.compose.runtime.RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
        return kotlin.Unit.INSTANCE;
    }
}
