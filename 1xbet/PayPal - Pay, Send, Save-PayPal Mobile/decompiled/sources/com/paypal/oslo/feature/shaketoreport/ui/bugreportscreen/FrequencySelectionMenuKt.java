package com.paypal.oslo.feature.shaketoreport.ui.bugreportscreen;

@kotlin.Metadata(d1 = {"\u0000\u001c\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\u001a9\u0010\b\u001a\u00020\u00062\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u00002\u0006\u0010\u0004\u001a\u00020\u00032\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00060\u0005H\u0000¢\u0006\u0004\b\b\u0010\t"}, d2 = {"", "", "frequencies", "Lcom/paypal/pds/components/BottomSheetController;", "menuController", "Lkotlin/Function1;", "", "onFrequencySelect", "FrequencySelectionMenu", "(Ljava/util/List;Lcom/paypal/pds/components/BottomSheetController;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;I)V"}, k = 2, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class FrequencySelectionMenuKt {
    public static final void FrequencySelectionMenu(final java.util.List<java.lang.String> list, final com.paypal.pds.components.BottomSheetController bottomSheetController, final kotlin.jvm.functions.Function1<? super java.lang.String, kotlin.Unit> function1, androidx.compose.runtime.Composer composer, final int i) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(list, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(bottomSheetController, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(function1, "");
        androidx.compose.runtime.Composer startRestartGroup = composer.startRestartGroup(-2106052571);
        int i2 = (i & 6) == 0 ? (startRestartGroup.changedInstance(list) ? 4 : 2) | i : i;
        if ((i & 48) == 0) {
            i2 |= (i & 64) == 0 ? startRestartGroup.changed(bottomSheetController) : startRestartGroup.changedInstance(bottomSheetController) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= startRestartGroup.changedInstance(function1) ? 256 : 128;
        }
        if (!startRestartGroup.shouldExecute((i2 & 147) != 146, i2 & 1)) {
            startRestartGroup.skipToGroupEnd();
        } else {
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventStart(-2106052571, i2, -1, "com.paypal.oslo.feature.shaketoreport.ui.bugreportscreen.FrequencySelectionMenu (FrequencySelectionMenu.kt:33)");
            }
            java.util.List<java.lang.String> list2 = list;
            java.util.ArrayList arrayList = new java.util.ArrayList(kotlin.collections.CollectionsKt.collectionSizeOrDefault(list2, 10));
            for (java.lang.String str : list2) {
                arrayList.add(new com.paypal.pds.components.MenuItem(null, str, str, null, null, 25, null));
            }
            java.util.ArrayList arrayList2 = arrayList;
            com.paypal.pds.components.MenuBehavior menuBehavior = com.paypal.pds.components.MenuBehavior.SELECTION;
            java.lang.String stringResource = androidx.compose.ui.res.StringResources_androidKt.stringResource(com.paypal.oslo.feature.shaketoreport.R.string.feature_shake_to_report_menu_select_frequency, startRestartGroup, 0);
            boolean z = (i2 & 896) == 256;
            java.lang.Object rememberedValue = startRestartGroup.rememberedValue();
            if (z || rememberedValue == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                rememberedValue = new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.shaketoreport.ui.bugreportscreen.FrequencySelectionMenuKt$$ExternalSyntheticLambda0
                    @Override // kotlin.jvm.functions.Function1
                    public final java.lang.Object invoke(java.lang.Object obj) {
                        return com.paypal.oslo.feature.shaketoreport.ui.bugreportscreen.FrequencySelectionMenuKt.$r8$lambda$Mnen7c_5WCAdiLARqJ_uvZcVEO0(kotlin.jvm.functions.Function1.this, (com.paypal.pds.components.MenuItem) obj);
                    }
                };
                startRestartGroup.updateRememberedValue(rememberedValue);
            }
            com.paypal.pds.components.MenuKt.Menu(arrayList2, bottomSheetController, menuBehavior, null, (kotlin.jvm.functions.Function1) rememberedValue, null, stringResource, null, startRestartGroup, (com.paypal.pds.components.BottomSheetController.$stable << 3) | 3456 | (i2 & 112), 160);
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventEnd();
            }
        }
        androidx.compose.runtime.ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new kotlin.jvm.functions.Function2() { // from class: com.paypal.oslo.feature.shaketoreport.ui.bugreportscreen.FrequencySelectionMenuKt$$ExternalSyntheticLambda1
                @Override // kotlin.jvm.functions.Function2
                public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                    return com.paypal.oslo.feature.shaketoreport.ui.bugreportscreen.FrequencySelectionMenuKt.$r8$lambda$CHubXgG0eRPNu3EnsdjVDIETLOU(list, bottomSheetController, function1, i, (androidx.compose.runtime.Composer) obj, ((java.lang.Integer) obj2).intValue());
                }
            });
        }
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$CHubXgG0eRPNu3EnsdjVDIETLOU(java.util.List list, com.paypal.pds.components.BottomSheetController bottomSheetController, kotlin.jvm.functions.Function1 function1, int i, androidx.compose.runtime.Composer composer, int i2) {
        FrequencySelectionMenu(list, bottomSheetController, function1, composer, androidx.compose.runtime.RecomposeScopeImplKt.updateChangedFlags(i | 1));
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$Mnen7c_5WCAdiLARqJ_uvZcVEO0(kotlin.jvm.functions.Function1 function1, com.paypal.pds.components.MenuItem menuItem) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(menuItem, "");
        function1.invoke(menuItem.getLabel());
        return kotlin.Unit.INSTANCE;
    }
}
