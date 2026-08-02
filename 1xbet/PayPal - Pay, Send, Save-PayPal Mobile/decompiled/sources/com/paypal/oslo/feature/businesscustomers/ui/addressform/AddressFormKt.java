package com.paypal.oslo.feature.businesscustomers.ui.addressform;

@kotlin.Metadata(d1 = {"\u00000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a\\\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0018\u0010\u0004\u001a\u0014\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00070\u0006\u0012\u0004\u0012\u00020\u00010\u00052!\u0010\b\u001a\u001d\u0012\u0013\u0012\u00110\t¢\u0006\f\b\n\u0012\b\b\u000b\u0012\u0004\b\b(\f\u0012\u0004\u0012\u00020\u00010\u00052\b\b\u0002\u0010\r\u001a\u00020\u000eH\u0001¢\u0006\u0002\u0010\u000f¨\u0006\u0010"}, d2 = {"AddressLayoutForm", "", "state", "Lcom/paypal/oslo/feature/businesscustomers/ui/addressform/AddressLayoutComposeState;", "onDropdownStatesChanges", "Lkotlin/Function1;", "", "Lcom/paypal/pds/components/DropdownState;", "onUpdate", "Lcom/paypal/oslo/core/i18n/domain/model/Field;", "Lkotlin/ParameterName;", "name", "field", "modifier", "Landroidx/compose/ui/Modifier;", "(Lcom/paypal/oslo/feature/businesscustomers/ui/addressform/AddressLayoutComposeState;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;II)V", "business-customers_prodRelease"}, k = 2, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class AddressFormKt {
    /* JADX WARN: Removed duplicated region for block: B:27:0x0072  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x007d  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x01a4  */
    /* JADX WARN: Removed duplicated region for block: B:70:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:73:0x0199  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x0074  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void AddressLayoutForm(final com.paypal.oslo.feature.businesscustomers.ui.addressform.AddressLayoutComposeState addressLayoutComposeState, final kotlin.jvm.functions.Function1<? super java.util.List<com.paypal.pds.components.DropdownState>, kotlin.Unit> function1, final kotlin.jvm.functions.Function1<? super com.paypal.oslo.core.i18n.domain.model.Field, kotlin.Unit> function12, androidx.compose.ui.Modifier modifier, androidx.compose.runtime.Composer composer, final int i, final int i2) {
        androidx.compose.ui.Modifier modifier2;
        int i3;
        androidx.compose.ui.Modifier modifier3;
        androidx.compose.runtime.ScopeUpdateScope endRestartGroup;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(addressLayoutComposeState, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(function1, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(function12, "");
        androidx.compose.runtime.Composer startRestartGroup = composer.startRestartGroup(80876524);
        int i4 = (i & 6) == 0 ? (startRestartGroup.changed(addressLayoutComposeState) ? 4 : 2) | i : i;
        if ((i & 48) == 0) {
            i4 |= startRestartGroup.changedInstance(function1) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i4 |= startRestartGroup.changedInstance(function12) ? 256 : 128;
        }
        int i5 = i2 & 8;
        if (i5 != 0) {
            i4 |= 3072;
        } else if ((i & 3072) == 0) {
            modifier2 = modifier;
            i4 |= startRestartGroup.changed(modifier2) ? 2048 : 1024;
            i3 = i4;
            if (startRestartGroup.shouldExecute((i3 & 1171) == 1170, i3 & 1)) {
                startRestartGroup.skipToGroupEnd();
                modifier3 = modifier2;
            } else {
                androidx.compose.ui.Modifier modifier4 = i5 != 0 ? androidx.compose.ui.Modifier.INSTANCE : modifier2;
                if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                    androidx.compose.runtime.ComposerKt.traceEventStart(80876524, i3, -1, "com.paypal.oslo.feature.businesscustomers.ui.addressform.AddressLayoutForm (AddressForm.kt:27)");
                }
                final java.util.ArrayList arrayList = new java.util.ArrayList();
                androidx.compose.ui.layout.MeasurePolicy columnMeasurePolicy = androidx.compose.foundation.layout.ColumnKt.columnMeasurePolicy(androidx.compose.foundation.layout.Arrangement.INSTANCE.m1602spacedBy0680j_4(com.paypal.pds.core.ConstantsKt.getSpacing16()), androidx.compose.ui.Alignment.INSTANCE.getStart(), startRestartGroup, 0);
                int hashCode = java.lang.Long.hashCode(androidx.compose.runtime.ComposablesKt.getCurrentCompositeKeyHashCode(startRestartGroup, 0));
                androidx.compose.runtime.CompositionLocalMap currentCompositionLocalMap = startRestartGroup.getCurrentCompositionLocalMap();
                androidx.compose.ui.Modifier materializeModifier = androidx.compose.ui.ComposedModifierKt.materializeModifier(startRestartGroup, modifier4);
                kotlin.jvm.functions.Function0<androidx.compose.ui.node.ComposeUiNode> constructor = androidx.compose.ui.node.ComposeUiNode.INSTANCE.getConstructor();
                if (!(startRestartGroup.getApplier() instanceof androidx.compose.runtime.Applier)) {
                    androidx.compose.runtime.ComposablesKt.invalidApplier();
                }
                startRestartGroup.startReusableNode();
                if (startRestartGroup.getInserting()) {
                    startRestartGroup.createNode(constructor);
                } else {
                    startRestartGroup.useNode();
                }
                androidx.compose.runtime.Composer m5299constructorimpl = androidx.compose.runtime.Updater.m5299constructorimpl(startRestartGroup);
                androidx.compose.runtime.Updater.m5307setimpl(m5299constructorimpl, columnMeasurePolicy, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetMeasurePolicy());
                androidx.compose.runtime.Updater.m5307setimpl(m5299constructorimpl, currentCompositionLocalMap, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
                androidx.compose.runtime.Updater.m5303initimpl(m5299constructorimpl, java.lang.Integer.valueOf(hashCode), androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetCompositeKeyHash());
                androidx.compose.runtime.Updater.m5305reconcileimpl(m5299constructorimpl, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getApplyOnDeactivatedNodeAssertion());
                androidx.compose.runtime.Updater.m5307setimpl(m5299constructorimpl, materializeModifier, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetModifier());
                androidx.compose.foundation.layout.ColumnScopeInstance columnScopeInstance = androidx.compose.foundation.layout.ColumnScopeInstance.INSTANCE;
                startRestartGroup.startReplaceGroup(-242840001);
                for (com.paypal.oslo.feature.businesscustomers.ui.addressform.AddressLayoutRowComposeState addressLayoutRowComposeState : addressLayoutComposeState.getRows()) {
                    boolean changedInstance = startRestartGroup.changedInstance(arrayList);
                    java.lang.Object rememberedValue = startRestartGroup.rememberedValue();
                    if (changedInstance || rememberedValue == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                        rememberedValue = new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.businesscustomers.ui.addressform.AddressFormKt$$ExternalSyntheticLambda0
                            @Override // kotlin.jvm.functions.Function1
                            public final java.lang.Object invoke(java.lang.Object obj) {
                                return com.paypal.oslo.feature.businesscustomers.ui.addressform.AddressFormKt.$r8$lambda$bA2B8WGVB5d_jkICPk9cJm2vtlI(arrayList, (com.paypal.pds.components.DropdownState) obj);
                            }
                        };
                        startRestartGroup.updateRememberedValue(rememberedValue);
                    }
                    kotlin.jvm.functions.Function1 function13 = (kotlin.jvm.functions.Function1) rememberedValue;
                    boolean z = (i3 & 896) == 256;
                    java.lang.Object rememberedValue2 = startRestartGroup.rememberedValue();
                    if (z || rememberedValue2 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                        rememberedValue2 = new kotlin.jvm.functions.Function2() { // from class: com.paypal.oslo.feature.businesscustomers.ui.addressform.AddressFormKt$$ExternalSyntheticLambda1
                            @Override // kotlin.jvm.functions.Function2
                            public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                                return com.paypal.oslo.feature.businesscustomers.ui.addressform.AddressFormKt.$r8$lambda$HCfqUYaF7c6yjlvwvS1UjxTcENE(kotlin.jvm.functions.Function1.this, (com.paypal.oslo.core.i18n.domain.model.Field) obj, (java.lang.String) obj2);
                            }
                        };
                        startRestartGroup.updateRememberedValue(rememberedValue2);
                    }
                    com.paypal.oslo.feature.businesscustomers.ui.addressform.AddressLayoutRowKt.AddressLayoutRow(addressLayoutRowComposeState, function13, (kotlin.jvm.functions.Function2) rememberedValue2, null, startRestartGroup, 0, 8);
                    modifier4 = modifier4;
                }
                modifier3 = modifier4;
                startRestartGroup.endReplaceGroup();
                startRestartGroup.endNode();
                function1.invoke(arrayList);
                if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                    androidx.compose.runtime.ComposerKt.traceEventEnd();
                }
            }
            endRestartGroup = startRestartGroup.endRestartGroup();
            if (endRestartGroup == null) {
                final androidx.compose.ui.Modifier modifier5 = modifier3;
                endRestartGroup.updateScope(new kotlin.jvm.functions.Function2() { // from class: com.paypal.oslo.feature.businesscustomers.ui.addressform.AddressFormKt$$ExternalSyntheticLambda2
                    @Override // kotlin.jvm.functions.Function2
                    public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                        return com.paypal.oslo.feature.businesscustomers.ui.addressform.AddressFormKt.$r8$lambda$RREVajV29ymwg_RjZwdQyi_Lmlk(com.paypal.oslo.feature.businesscustomers.ui.addressform.AddressLayoutComposeState.this, function1, function12, modifier5, i, i2, (androidx.compose.runtime.Composer) obj, ((java.lang.Integer) obj2).intValue());
                    }
                });
                return;
            }
            return;
        }
        modifier2 = modifier;
        i3 = i4;
        if (startRestartGroup.shouldExecute((i3 & 1171) == 1170, i3 & 1)) {
        }
        endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup == null) {
        }
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$HCfqUYaF7c6yjlvwvS1UjxTcENE(kotlin.jvm.functions.Function1 function1, com.paypal.oslo.core.i18n.domain.model.Field field, java.lang.String str) {
        com.paypal.oslo.core.i18n.domain.model.Field updateWithValue;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(field, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
        if (com.paypal.oslo.feature.businesscustomers.ui.addressform.FieldExtKt.isSupportedForCustomers(field) && (updateWithValue = com.paypal.oslo.feature.businesscustomers.ui.addressform.FieldExtKt.updateWithValue(field, str)) != null) {
            function1.invoke(updateWithValue);
        }
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$RREVajV29ymwg_RjZwdQyi_Lmlk(com.paypal.oslo.feature.businesscustomers.ui.addressform.AddressLayoutComposeState addressLayoutComposeState, kotlin.jvm.functions.Function1 function1, kotlin.jvm.functions.Function1 function12, androidx.compose.ui.Modifier modifier, int i, int i2, androidx.compose.runtime.Composer composer, int i3) {
        AddressLayoutForm(addressLayoutComposeState, function1, function12, modifier, composer, androidx.compose.runtime.RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$bA2B8WGVB5d_jkICPk9cJm2vtlI(java.util.List list, com.paypal.pds.components.DropdownState dropdownState) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(dropdownState, "");
        list.add(dropdownState);
        return kotlin.Unit.INSTANCE;
    }
}
