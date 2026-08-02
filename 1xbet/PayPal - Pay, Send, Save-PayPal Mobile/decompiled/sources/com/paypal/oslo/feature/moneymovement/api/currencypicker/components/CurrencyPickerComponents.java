package com.paypal.oslo.feature.moneymovement.api.currencypicker.components;

@kotlin.Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J/\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\t2\b\b\u0002\u0010\n\u001a\u00020\u000bH'¢\u0006\u0002\u0010\fJ?\u0010\r\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u000e2\u0006\u0010\u0006\u001a\u00020\u000f2\b\b\u0002\u0010\n\u001a\u00020\u000b2\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u00112\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u0013H'¢\u0006\u0002\u0010\u0014¨\u0006\u0015À\u0006\u0003"}, d2 = {"Lcom/paypal/oslo/feature/moneymovement/api/currencypicker/components/CurrencyPickerComponents;", "", "SearchCurrency", "", com.google.firebase.messaging.Constants.ScionAnalytics.MessageType.DATA_MESSAGE, "Lcom/paypal/oslo/feature/moneymovement/api/currencypicker/components/searchcurrency/SearchCurrencyData;", "callbacks", "Lcom/paypal/oslo/feature/moneymovement/api/currencypicker/components/searchcurrency/SearchCurrencyCallbacks;", "config", "Lcom/paypal/oslo/feature/moneymovement/api/currencypicker/components/searchcurrency/SearchCurrencyConfig;", "modifier", "Landroidx/compose/ui/Modifier;", "(Lcom/paypal/oslo/feature/moneymovement/api/currencypicker/components/searchcurrency/SearchCurrencyData;Lcom/paypal/oslo/feature/moneymovement/api/currencypicker/components/searchcurrency/SearchCurrencyCallbacks;Lcom/paypal/oslo/feature/moneymovement/api/currencypicker/components/searchcurrency/SearchCurrencyConfig;Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;I)V", "CurrencyTabSelector", "Lcom/paypal/oslo/feature/moneymovement/api/currencypicker/components/tabselector/CurrencyTabSelectorData;", "Lcom/paypal/oslo/feature/moneymovement/api/currencypicker/components/tabselector/CurrencyTabSelectorCallbacks;", "sharedTransitionScope", "Landroidx/compose/animation/SharedTransitionScope;", "animatedContentScope", "Landroidx/compose/animation/AnimatedContentScope;", "(Lcom/paypal/oslo/feature/moneymovement/api/currencypicker/components/tabselector/CurrencyTabSelectorData;Lcom/paypal/oslo/feature/moneymovement/api/currencypicker/components/tabselector/CurrencyTabSelectorCallbacks;Landroidx/compose/ui/Modifier;Landroidx/compose/animation/SharedTransitionScope;Landroidx/compose/animation/AnimatedContentScope;Landroidx/compose/runtime/Composer;I)V", "money-movement-api_prodRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes13.dex */
public interface CurrencyPickerComponents {
    void CurrencyTabSelector(com.paypal.oslo.feature.moneymovement.api.currencypicker.components.tabselector.CurrencyTabSelectorData currencyTabSelectorData, com.paypal.oslo.feature.moneymovement.api.currencypicker.components.tabselector.CurrencyTabSelectorCallbacks currencyTabSelectorCallbacks, androidx.compose.ui.Modifier modifier, androidx.compose.animation.SharedTransitionScope sharedTransitionScope, androidx.compose.animation.AnimatedContentScope animatedContentScope, androidx.compose.runtime.Composer composer, int i);

    void SearchCurrency(com.paypal.oslo.feature.moneymovement.api.currencypicker.components.searchcurrency.SearchCurrencyData searchCurrencyData, com.paypal.oslo.feature.moneymovement.api.currencypicker.components.searchcurrency.SearchCurrencyCallbacks searchCurrencyCallbacks, com.paypal.oslo.feature.moneymovement.api.currencypicker.components.searchcurrency.SearchCurrencyConfig searchCurrencyConfig, androidx.compose.ui.Modifier modifier, androidx.compose.runtime.Composer composer, int i);

    @kotlin.Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final class ComposeDefaultImpls {
        /* JADX WARN: Removed duplicated region for block: B:27:0x006f  */
        /* JADX WARN: Removed duplicated region for block: B:37:0x008c  */
        /* JADX WARN: Removed duplicated region for block: B:40:0x0097  */
        /* JADX WARN: Removed duplicated region for block: B:51:0x00d1  */
        /* JADX WARN: Removed duplicated region for block: B:54:? A[RETURN, SYNTHETIC] */
        /* JADX WARN: Removed duplicated region for block: B:56:0x00c7  */
        /* JADX WARN: Removed duplicated region for block: B:57:0x008e  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public static final void SearchCurrency$default(final com.paypal.oslo.feature.moneymovement.api.currencypicker.components.searchcurrency.SearchCurrencyData searchCurrencyData, final com.paypal.oslo.feature.moneymovement.api.currencypicker.components.searchcurrency.SearchCurrencyCallbacks searchCurrencyCallbacks, final com.paypal.oslo.feature.moneymovement.api.currencypicker.components.searchcurrency.SearchCurrencyConfig searchCurrencyConfig, androidx.compose.ui.Modifier modifier, final com.paypal.oslo.feature.moneymovement.api.currencypicker.components.CurrencyPickerComponents currencyPickerComponents, androidx.compose.runtime.Composer composer, final int i, final int i2) {
            int i3;
            androidx.compose.ui.Modifier modifier2;
            final androidx.compose.ui.Modifier modifier3;
            androidx.compose.runtime.ScopeUpdateScope endRestartGroup;
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(searchCurrencyData, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(searchCurrencyCallbacks, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(searchCurrencyConfig, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(currencyPickerComponents, "");
            androidx.compose.runtime.Composer startRestartGroup = composer.startRestartGroup(766158924);
            if ((i & 6) == 0) {
                i3 = (startRestartGroup.changed(searchCurrencyData) ? 4 : 2) | i;
            } else {
                i3 = i;
            }
            if ((i & 48) == 0) {
                i3 |= startRestartGroup.changed(searchCurrencyCallbacks) ? 32 : 16;
            }
            if ((i & 384) == 0) {
                i3 |= startRestartGroup.changed(searchCurrencyConfig) ? 256 : 128;
            }
            int i4 = i2 & 8;
            if (i4 != 0) {
                i3 |= 3072;
            } else if ((i & 3072) == 0) {
                modifier2 = modifier;
                i3 |= startRestartGroup.changed(modifier2) ? 2048 : 1024;
                if ((i & 24576) == 0) {
                    i3 |= (32768 & i) == 0 ? startRestartGroup.changed(currencyPickerComponents) : startRestartGroup.changedInstance(currencyPickerComponents) ? 16384 : 8192;
                }
                if (startRestartGroup.shouldExecute((i3 & 9363) == 9362, i3 & 1)) {
                    startRestartGroup.skipToGroupEnd();
                    modifier3 = modifier2;
                } else {
                    androidx.compose.ui.Modifier modifier4 = i4 != 0 ? androidx.compose.ui.Modifier.INSTANCE : modifier2;
                    if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                        androidx.compose.runtime.ComposerKt.traceEventStart(766158924, i3, -1, "com.paypal.oslo.feature.moneymovement.api.currencypicker.components.CurrencyPickerComponents.ComposeDefaultImpls.SearchCurrency$default (CurrencyPickerComponents.kt:-1)");
                    }
                    currencyPickerComponents.SearchCurrency(searchCurrencyData, searchCurrencyCallbacks, searchCurrencyConfig, modifier4, startRestartGroup, i3 & org.apache.commons.imaging.formats.jpeg.JpegConstants.COM_MARKER);
                    if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                        androidx.compose.runtime.ComposerKt.traceEventEnd();
                    }
                    modifier3 = modifier4;
                }
                endRestartGroup = startRestartGroup.endRestartGroup();
                if (endRestartGroup == null) {
                    endRestartGroup.updateScope(new kotlin.jvm.functions.Function2() { // from class: com.paypal.oslo.feature.moneymovement.api.currencypicker.components.CurrencyPickerComponents$ComposeDefaultImpls$$ExternalSyntheticLambda0
                        @Override // kotlin.jvm.functions.Function2
                        public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                            return com.paypal.oslo.feature.moneymovement.api.currencypicker.components.CurrencyPickerComponents.ComposeDefaultImpls.$r8$lambda$yCrUWtJssootzERYIlziUIOu430(com.paypal.oslo.feature.moneymovement.api.currencypicker.components.searchcurrency.SearchCurrencyData.this, searchCurrencyCallbacks, searchCurrencyConfig, modifier3, currencyPickerComponents, i, i2, (androidx.compose.runtime.Composer) obj, ((java.lang.Integer) obj2).intValue());
                        }
                    });
                    return;
                }
                return;
            }
            modifier2 = modifier;
            if ((i & 24576) == 0) {
            }
            if (startRestartGroup.shouldExecute((i3 & 9363) == 9362, i3 & 1)) {
            }
            endRestartGroup = startRestartGroup.endRestartGroup();
            if (endRestartGroup == null) {
            }
        }

        /* JADX WARN: Removed duplicated region for block: B:20:0x005c  */
        /* JADX WARN: Removed duplicated region for block: B:24:0x0078  */
        /* JADX WARN: Removed duplicated region for block: B:28:0x0095  */
        /* JADX WARN: Removed duplicated region for block: B:38:0x00b4  */
        /* JADX WARN: Removed duplicated region for block: B:41:0x00bf  */
        /* JADX WARN: Removed duplicated region for block: B:57:0x0109  */
        /* JADX WARN: Removed duplicated region for block: B:60:? A[RETURN, SYNTHETIC] */
        /* JADX WARN: Removed duplicated region for block: B:64:0x00fe  */
        /* JADX WARN: Removed duplicated region for block: B:65:0x00b6  */
        /* JADX WARN: Removed duplicated region for block: B:66:0x007b  */
        /* JADX WARN: Removed duplicated region for block: B:73:0x005f  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public static final void CurrencyTabSelector$default(final com.paypal.oslo.feature.moneymovement.api.currencypicker.components.tabselector.CurrencyTabSelectorData currencyTabSelectorData, final com.paypal.oslo.feature.moneymovement.api.currencypicker.components.tabselector.CurrencyTabSelectorCallbacks currencyTabSelectorCallbacks, androidx.compose.ui.Modifier modifier, androidx.compose.animation.SharedTransitionScope sharedTransitionScope, androidx.compose.animation.AnimatedContentScope animatedContentScope, final com.paypal.oslo.feature.moneymovement.api.currencypicker.components.CurrencyPickerComponents currencyPickerComponents, androidx.compose.runtime.Composer composer, final int i, final int i2) {
            int i3;
            final androidx.compose.ui.Modifier modifier2;
            int i4;
            androidx.compose.animation.SharedTransitionScope sharedTransitionScope2;
            int i5;
            androidx.compose.animation.AnimatedContentScope animatedContentScope2;
            final androidx.compose.animation.SharedTransitionScope sharedTransitionScope3;
            final androidx.compose.animation.AnimatedContentScope animatedContentScope3;
            androidx.compose.runtime.ScopeUpdateScope endRestartGroup;
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(currencyTabSelectorData, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(currencyTabSelectorCallbacks, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(currencyPickerComponents, "");
            androidx.compose.runtime.Composer startRestartGroup = composer.startRestartGroup(-1495284711);
            if ((i & 6) == 0) {
                i3 = (startRestartGroup.changed(currencyTabSelectorData) ? 4 : 2) | i;
            } else {
                i3 = i;
            }
            if ((i & 48) == 0) {
                i3 |= startRestartGroup.changed(currencyTabSelectorCallbacks) ? 32 : 16;
            }
            int i6 = i2 & 4;
            if (i6 != 0) {
                i3 |= 384;
            } else if ((i & 384) == 0) {
                modifier2 = modifier;
                i3 |= startRestartGroup.changed(modifier2) ? 256 : 128;
                i4 = i2 & 8;
                if (i4 == 0) {
                    i3 |= 3072;
                } else if ((i & 3072) == 0) {
                    sharedTransitionScope2 = sharedTransitionScope;
                    i3 |= startRestartGroup.changed(sharedTransitionScope2) ? 2048 : 1024;
                    i5 = i2 & 16;
                    if (i5 != 0) {
                        i3 |= 24576;
                    } else if ((i & 24576) == 0) {
                        animatedContentScope2 = animatedContentScope;
                        i3 |= startRestartGroup.changedInstance(animatedContentScope2) ? 16384 : 8192;
                        if ((196608 & i) == 0) {
                            i3 |= (262144 & i) == 0 ? startRestartGroup.changed(currencyPickerComponents) : startRestartGroup.changedInstance(currencyPickerComponents) ? 131072 : 65536;
                        }
                        if (startRestartGroup.shouldExecute((74899 & i3) == 74898, i3 & 1)) {
                            startRestartGroup.skipToGroupEnd();
                            sharedTransitionScope3 = sharedTransitionScope2;
                            animatedContentScope3 = animatedContentScope2;
                        } else {
                            androidx.compose.ui.Modifier modifier3 = i6 != 0 ? androidx.compose.ui.Modifier.INSTANCE : modifier2;
                            androidx.compose.animation.SharedTransitionScope sharedTransitionScope4 = i4 != 0 ? null : sharedTransitionScope2;
                            androidx.compose.animation.AnimatedContentScope animatedContentScope4 = i5 != 0 ? null : animatedContentScope2;
                            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                                androidx.compose.runtime.ComposerKt.traceEventStart(-1495284711, i3, -1, "com.paypal.oslo.feature.moneymovement.api.currencypicker.components.CurrencyPickerComponents.ComposeDefaultImpls.CurrencyTabSelector$default (CurrencyPickerComponents.kt:-1)");
                            }
                            currencyPickerComponents.CurrencyTabSelector(currencyTabSelectorData, currencyTabSelectorCallbacks, modifier3, sharedTransitionScope4, animatedContentScope4, startRestartGroup, i3 & 524286);
                            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                                androidx.compose.runtime.ComposerKt.traceEventEnd();
                            }
                            modifier2 = modifier3;
                            sharedTransitionScope3 = sharedTransitionScope4;
                            animatedContentScope3 = animatedContentScope4;
                        }
                        endRestartGroup = startRestartGroup.endRestartGroup();
                        if (endRestartGroup == null) {
                            endRestartGroup.updateScope(new kotlin.jvm.functions.Function2() { // from class: com.paypal.oslo.feature.moneymovement.api.currencypicker.components.CurrencyPickerComponents$ComposeDefaultImpls$$ExternalSyntheticLambda1
                                @Override // kotlin.jvm.functions.Function2
                                public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                                    return com.paypal.oslo.feature.moneymovement.api.currencypicker.components.CurrencyPickerComponents.ComposeDefaultImpls.m15612$r8$lambda$Cs7MDzFmVBlcAzpmftMVDRkigw(com.paypal.oslo.feature.moneymovement.api.currencypicker.components.tabselector.CurrencyTabSelectorData.this, currencyTabSelectorCallbacks, modifier2, sharedTransitionScope3, animatedContentScope3, currencyPickerComponents, i, i2, (androidx.compose.runtime.Composer) obj, ((java.lang.Integer) obj2).intValue());
                                }
                            });
                            return;
                        }
                        return;
                    }
                    animatedContentScope2 = animatedContentScope;
                    if ((196608 & i) == 0) {
                    }
                    if (startRestartGroup.shouldExecute((74899 & i3) == 74898, i3 & 1)) {
                    }
                    endRestartGroup = startRestartGroup.endRestartGroup();
                    if (endRestartGroup == null) {
                    }
                }
                sharedTransitionScope2 = sharedTransitionScope;
                i5 = i2 & 16;
                if (i5 != 0) {
                }
                animatedContentScope2 = animatedContentScope;
                if ((196608 & i) == 0) {
                }
                if (startRestartGroup.shouldExecute((74899 & i3) == 74898, i3 & 1)) {
                }
                endRestartGroup = startRestartGroup.endRestartGroup();
                if (endRestartGroup == null) {
                }
            }
            modifier2 = modifier;
            i4 = i2 & 8;
            if (i4 == 0) {
            }
            sharedTransitionScope2 = sharedTransitionScope;
            i5 = i2 & 16;
            if (i5 != 0) {
            }
            animatedContentScope2 = animatedContentScope;
            if ((196608 & i) == 0) {
            }
            if (startRestartGroup.shouldExecute((74899 & i3) == 74898, i3 & 1)) {
            }
            endRestartGroup = startRestartGroup.endRestartGroup();
            if (endRestartGroup == null) {
            }
        }

        /* renamed from: $r8$lambda$Cs7MDzFmVBlcAzpmft-MVDRkigw, reason: not valid java name */
        public static /* synthetic */ kotlin.Unit m15612$r8$lambda$Cs7MDzFmVBlcAzpmftMVDRkigw(com.paypal.oslo.feature.moneymovement.api.currencypicker.components.tabselector.CurrencyTabSelectorData currencyTabSelectorData, com.paypal.oslo.feature.moneymovement.api.currencypicker.components.tabselector.CurrencyTabSelectorCallbacks currencyTabSelectorCallbacks, androidx.compose.ui.Modifier modifier, androidx.compose.animation.SharedTransitionScope sharedTransitionScope, androidx.compose.animation.AnimatedContentScope animatedContentScope, com.paypal.oslo.feature.moneymovement.api.currencypicker.components.CurrencyPickerComponents currencyPickerComponents, int i, int i2, androidx.compose.runtime.Composer composer, int i3) {
            CurrencyTabSelector$default(currencyTabSelectorData, currencyTabSelectorCallbacks, modifier, sharedTransitionScope, animatedContentScope, currencyPickerComponents, composer, androidx.compose.runtime.RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
            return kotlin.Unit.INSTANCE;
        }

        public static /* synthetic */ kotlin.Unit $r8$lambda$yCrUWtJssootzERYIlziUIOu430(com.paypal.oslo.feature.moneymovement.api.currencypicker.components.searchcurrency.SearchCurrencyData searchCurrencyData, com.paypal.oslo.feature.moneymovement.api.currencypicker.components.searchcurrency.SearchCurrencyCallbacks searchCurrencyCallbacks, com.paypal.oslo.feature.moneymovement.api.currencypicker.components.searchcurrency.SearchCurrencyConfig searchCurrencyConfig, androidx.compose.ui.Modifier modifier, com.paypal.oslo.feature.moneymovement.api.currencypicker.components.CurrencyPickerComponents currencyPickerComponents, int i, int i2, androidx.compose.runtime.Composer composer, int i3) {
            SearchCurrency$default(searchCurrencyData, searchCurrencyCallbacks, searchCurrencyConfig, modifier, currencyPickerComponents, composer, androidx.compose.runtime.RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
            return kotlin.Unit.INSTANCE;
        }
    }
}
