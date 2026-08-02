package com.paypal.oslo.feature.businessinventory.ui.itemslist;

@kotlin.Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\u001aC\u0010\b\u001a\u00020\u0006\"\b\b\u0000\u0010\u0001*\u00020\u00002\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u00022\u0006\u0010\u0004\u001a\u00028\u00002\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u00060\u0005H\u0000¢\u0006\u0004\b\b\u0010\t"}, d2 = {"Lcom/paypal/oslo/feature/businessinventory/ui/itemslist/BusinessInventorySegmentedControlItemTransformer;", "T", "", "items", "selectedItem", "Lkotlin/Function1;", "", "onSelect", "BusinessInventorySegmentedControl", "(Ljava/util/List;Lcom/paypal/oslo/feature/businessinventory/ui/itemslist/BusinessInventorySegmentedControlItemTransformer;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;I)V"}, k = 2, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class BusinessInventorySegmentedControlKt {
    public static final <T extends com.paypal.oslo.feature.businessinventory.ui.itemslist.BusinessInventorySegmentedControlItemTransformer> void BusinessInventorySegmentedControl(final java.util.List<? extends T> list, final T t, final kotlin.jvm.functions.Function1<? super T, kotlin.Unit> function1, androidx.compose.runtime.Composer composer, final int i) {
        int i2;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(list, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(t, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(function1, "");
        androidx.compose.runtime.Composer startRestartGroup = composer.startRestartGroup(705936766);
        if ((i & 6) == 0) {
            i2 = (startRestartGroup.changedInstance(list) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= (i & 64) == 0 ? startRestartGroup.changed(t) : startRestartGroup.changedInstance(t) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= startRestartGroup.changedInstance(function1) ? 256 : 128;
        }
        if (!startRestartGroup.shouldExecute((i2 & 147) != 146, i2 & 1)) {
            startRestartGroup.skipToGroupEnd();
        } else {
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventStart(705936766, i2, -1, "com.paypal.oslo.feature.businessinventory.ui.itemslist.BusinessInventorySegmentedControl (BusinessInventorySegmentedControl.kt:33)");
            }
            final android.content.res.Resources resources = (android.content.res.Resources) startRestartGroup.consume(androidx.compose.ui.platform.AndroidCompositionLocals_androidKt.getLocalResources());
            androidx.compose.ui.Modifier m1731requiredHeightInVpY3zN4$default = androidx.compose.foundation.layout.SizeKt.m1731requiredHeightInVpY3zN4$default(androidx.compose.foundation.layout.PaddingKt.m1708paddingVpY3zN4$default(androidx.compose.ui.Modifier.INSTANCE, com.paypal.pds.core.ConstantsKt.getSpacing16(), 0.0f, 2, null), com.paypal.pds.core.ConstantsKt.getSize48(), 0.0f, 2, null);
            startRestartGroup.startReplaceGroup(-199584275);
            java.util.List<? extends T> list2 = list;
            java.util.ArrayList arrayList = new java.util.ArrayList(kotlin.collections.CollectionsKt.collectionSizeOrDefault(list2, 10));
            java.util.Iterator<T> it = list2.iterator();
            while (it.hasNext()) {
                com.paypal.oslo.feature.businessinventory.ui.itemslist.BusinessInventorySegmentedControlItemTransformer businessInventorySegmentedControlItemTransformer = (com.paypal.oslo.feature.businessinventory.ui.itemslist.BusinessInventorySegmentedControlItemTransformer) it.next();
                boolean changedInstance = startRestartGroup.changedInstance(resources);
                java.lang.Object rememberedValue = startRestartGroup.rememberedValue();
                if (changedInstance || rememberedValue == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                    rememberedValue = new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.businessinventory.ui.itemslist.BusinessInventorySegmentedControlKt$$ExternalSyntheticLambda0
                        @Override // kotlin.jvm.functions.Function1
                        public final java.lang.Object invoke(java.lang.Object obj) {
                            return com.paypal.oslo.feature.businessinventory.ui.itemslist.BusinessInventorySegmentedControlKt.$r8$lambda$vhqrGarMLKpPhdQTCa3IRJTpCHs(resources, ((java.lang.Integer) obj).intValue());
                        }
                    };
                    startRestartGroup.updateRememberedValue(rememberedValue);
                }
                arrayList.add(businessInventorySegmentedControlItemTransformer.toSegmentedControlItem((kotlin.jvm.functions.Function1) rememberedValue));
            }
            java.util.ArrayList arrayList2 = arrayList;
            startRestartGroup.endReplaceGroup();
            int indexOf = list.indexOf(t);
            boolean z = (i2 & 896) == 256;
            boolean changedInstance2 = startRestartGroup.changedInstance(list);
            java.lang.Object rememberedValue2 = startRestartGroup.rememberedValue();
            if ((changedInstance2 | z) || rememberedValue2 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                rememberedValue2 = new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.businessinventory.ui.itemslist.BusinessInventorySegmentedControlKt$$ExternalSyntheticLambda1
                    @Override // kotlin.jvm.functions.Function1
                    public final java.lang.Object invoke(java.lang.Object obj) {
                        return com.paypal.oslo.feature.businessinventory.ui.itemslist.BusinessInventorySegmentedControlKt.$r8$lambda$4TVYkX1_G73fEQMj0fgmU85PEhc(kotlin.jvm.functions.Function1.this, list, ((java.lang.Integer) obj).intValue());
                    }
                };
                startRestartGroup.updateRememberedValue(rememberedValue2);
            }
            com.paypal.pds.components.SegmentedControlKt.SegmentedControl(arrayList2, m1731requiredHeightInVpY3zN4$default, indexOf, (kotlin.jvm.functions.Function1) rememberedValue2, startRestartGroup, 0, 0);
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventEnd();
            }
        }
        androidx.compose.runtime.ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new kotlin.jvm.functions.Function2() { // from class: com.paypal.oslo.feature.businessinventory.ui.itemslist.BusinessInventorySegmentedControlKt$$ExternalSyntheticLambda2
                @Override // kotlin.jvm.functions.Function2
                public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                    return com.paypal.oslo.feature.businessinventory.ui.itemslist.BusinessInventorySegmentedControlKt.$r8$lambda$asJ_BkSh9MuVG0k56P7bYuN2miU(list, t, function1, i, (androidx.compose.runtime.Composer) obj, ((java.lang.Integer) obj2).intValue());
                }
            });
        }
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$4TVYkX1_G73fEQMj0fgmU85PEhc(kotlin.jvm.functions.Function1 function1, java.util.List list, int i) {
        function1.invoke(list.get(i));
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$asJ_BkSh9MuVG0k56P7bYuN2miU(java.util.List list, com.paypal.oslo.feature.businessinventory.ui.itemslist.BusinessInventorySegmentedControlItemTransformer businessInventorySegmentedControlItemTransformer, kotlin.jvm.functions.Function1 function1, int i, androidx.compose.runtime.Composer composer, int i2) {
        BusinessInventorySegmentedControl(list, businessInventorySegmentedControlItemTransformer, function1, composer, androidx.compose.runtime.RecomposeScopeImplKt.updateChangedFlags(i | 1));
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ java.lang.String $r8$lambda$vhqrGarMLKpPhdQTCa3IRJTpCHs(android.content.res.Resources resources, int i) {
        java.lang.String string = resources.getString(i);
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(string, "");
        return string;
    }
}
