package com.paypal.oslo.feature.businessinventory.ui.edititem;

@kotlin.Metadata(d1 = {"\u0000,\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0002\u001a;\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\u0014\b\u0002\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\u00010\bH\u0001¢\u0006\u0002\u0010\n\u001a/\u0010\u000b\u001a\u00020\u00032\b\b\u0002\u0010\f\u001a\u00020\t2\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\t2\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u000fH\u0001¢\u0006\u0002\u0010\u0010¨\u0006\u0011"}, d2 = {"EditableTextArea", "", "inputState", "Lcom/paypal/oslo/feature/businessinventory/ui/edititem/EditableTextAreaState;", "alerts", "", "Lcom/paypal/pds/components/textinput/ValidationAlert;", "onValueChange", "Lkotlin/Function1;", "", "(Lcom/paypal/oslo/feature/businessinventory/ui/edititem/EditableTextAreaState;Ljava/util/List;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V", "rememberSaveableTextAreaState", "initialValue", "label", "textLimit", "", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Landroidx/compose/runtime/Composer;II)Lcom/paypal/oslo/feature/businessinventory/ui/edititem/EditableTextAreaState;", "business-inventory_prodRelease"}, k = 2, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class EditableTextAreaKt {
    /* JADX WARN: Removed duplicated region for block: B:13:0x0045  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0064  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x006f  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x0181  */
    /* JADX WARN: Removed duplicated region for block: B:55:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:61:0x0175  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x0066  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x0048  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void EditableTextArea(final com.paypal.oslo.feature.businessinventory.ui.edititem.EditableTextAreaState editableTextAreaState, java.util.List<? extends com.paypal.pds.components.textinput.ValidationAlert> list, kotlin.jvm.functions.Function1<? super java.lang.String, kotlin.Unit> function1, androidx.compose.runtime.Composer composer, final int i, final int i2) {
        int i3;
        java.util.List<? extends com.paypal.pds.components.textinput.ValidationAlert> list2;
        int i4;
        kotlin.jvm.functions.Function1<? super java.lang.String, kotlin.Unit> function12;
        java.util.List<? extends com.paypal.pds.components.textinput.ValidationAlert> list3;
        final kotlin.jvm.functions.Function1<? super java.lang.String, kotlin.Unit> function13;
        androidx.compose.runtime.ScopeUpdateScope endRestartGroup;
        final kotlin.jvm.functions.Function1<? super java.lang.String, kotlin.Unit> function14;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(editableTextAreaState, "");
        androidx.compose.runtime.Composer startRestartGroup = composer.startRestartGroup(1204612486);
        if ((i & 6) == 0) {
            i3 = (startRestartGroup.changed(editableTextAreaState) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        int i5 = i2 & 2;
        if (i5 != 0) {
            i3 |= 48;
        } else if ((i & 48) == 0) {
            list2 = list;
            i3 |= startRestartGroup.changedInstance(list2) ? 32 : 16;
            i4 = i2 & 4;
            if (i4 == 0) {
                i3 |= 384;
            } else if ((i & 384) == 0) {
                function12 = function1;
                i3 |= startRestartGroup.changedInstance(function12) ? 256 : 128;
                if (!startRestartGroup.shouldExecute((i3 & 147) != 146, i3 & 1)) {
                    startRestartGroup.skipToGroupEnd();
                    list3 = list2;
                    function13 = function12;
                } else {
                    list3 = i5 != 0 ? kotlin.collections.CollectionsKt.emptyList() : list2;
                    if (i4 != 0) {
                        java.lang.Object rememberedValue = startRestartGroup.rememberedValue();
                        if (rememberedValue == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                            rememberedValue = new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.businessinventory.ui.edititem.EditableTextAreaKt$$ExternalSyntheticLambda1
                                @Override // kotlin.jvm.functions.Function1
                                public final java.lang.Object invoke(java.lang.Object obj) {
                                    return com.paypal.oslo.feature.businessinventory.ui.edititem.EditableTextAreaKt.$r8$lambda$lYvdXe9le2rB6eX99BdR7wv9xYg((java.lang.String) obj);
                                }
                            };
                            startRestartGroup.updateRememberedValue(rememberedValue);
                        }
                        function14 = (kotlin.jvm.functions.Function1) rememberedValue;
                    } else {
                        function14 = function12;
                    }
                    if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                        androidx.compose.runtime.ComposerKt.traceEventStart(1204612486, i3, -1, "com.paypal.oslo.feature.businessinventory.ui.edititem.EditableTextArea (EditableTextArea.kt:29)");
                    }
                    androidx.compose.ui.Modifier.Companion companion = androidx.compose.ui.Modifier.INSTANCE;
                    androidx.compose.ui.layout.MeasurePolicy columnMeasurePolicy = androidx.compose.foundation.layout.ColumnKt.columnMeasurePolicy(androidx.compose.foundation.layout.Arrangement.INSTANCE.getTop(), androidx.compose.ui.Alignment.INSTANCE.getStart(), startRestartGroup, 0);
                    int hashCode = java.lang.Long.hashCode(androidx.compose.runtime.ComposablesKt.getCurrentCompositeKeyHashCode(startRestartGroup, 0));
                    androidx.compose.runtime.CompositionLocalMap currentCompositionLocalMap = startRestartGroup.getCurrentCompositionLocalMap();
                    androidx.compose.ui.Modifier materializeModifier = androidx.compose.ui.ComposedModifierKt.materializeModifier(startRestartGroup, companion);
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
                    java.lang.String label = editableTextAreaState.getLabel();
                    java.lang.Integer textLimit = editableTextAreaState.getTextLimit();
                    java.lang.String value = editableTextAreaState.getValue();
                    boolean z = (i3 & 14) == 4;
                    boolean z2 = (i3 & 896) == 256;
                    java.lang.Object rememberedValue2 = startRestartGroup.rememberedValue();
                    if ((z | z2) || rememberedValue2 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                        rememberedValue2 = new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.businessinventory.ui.edititem.EditableTextAreaKt$$ExternalSyntheticLambda2
                            @Override // kotlin.jvm.functions.Function1
                            public final java.lang.Object invoke(java.lang.Object obj) {
                                return com.paypal.oslo.feature.businessinventory.ui.edititem.EditableTextAreaKt.$r8$lambda$JdOq_OdQf2GEayUE4nfFJKAnCGM(com.paypal.oslo.feature.businessinventory.ui.edititem.EditableTextAreaState.this, function14, (java.lang.String) obj);
                            }
                        };
                        startRestartGroup.updateRememberedValue(rememberedValue2);
                    }
                    kotlin.jvm.functions.Function1<? super java.lang.String, kotlin.Unit> function15 = function14;
                    com.paypal.pds.components.TextAreaKt.TextArea((kotlin.jvm.functions.Function1) rememberedValue2, null, textLimit, value, label, false, list3, 0, 0, null, startRestartGroup, (i3 << 15) & 3670016, 930);
                    startRestartGroup.endNode();
                    if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                        androidx.compose.runtime.ComposerKt.traceEventEnd();
                    }
                    function13 = function15;
                }
                endRestartGroup = startRestartGroup.endRestartGroup();
                if (endRestartGroup != null) {
                    final java.util.List<? extends com.paypal.pds.components.textinput.ValidationAlert> list4 = list3;
                    endRestartGroup.updateScope(new kotlin.jvm.functions.Function2() { // from class: com.paypal.oslo.feature.businessinventory.ui.edititem.EditableTextAreaKt$$ExternalSyntheticLambda3
                        @Override // kotlin.jvm.functions.Function2
                        public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                            return com.paypal.oslo.feature.businessinventory.ui.edititem.EditableTextAreaKt.$r8$lambda$5ROTzz9GWfn_VmG9krd6Jeur788(com.paypal.oslo.feature.businessinventory.ui.edititem.EditableTextAreaState.this, list4, function13, i, i2, (androidx.compose.runtime.Composer) obj, ((java.lang.Integer) obj2).intValue());
                        }
                    });
                    return;
                }
                return;
            }
            function12 = function1;
            if (!startRestartGroup.shouldExecute((i3 & 147) != 146, i3 & 1)) {
            }
            endRestartGroup = startRestartGroup.endRestartGroup();
            if (endRestartGroup != null) {
            }
        }
        list2 = list;
        i4 = i2 & 4;
        if (i4 == 0) {
        }
        function12 = function1;
        if (!startRestartGroup.shouldExecute((i3 & 147) != 146, i3 & 1)) {
        }
        endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
        }
    }

    public static final com.paypal.oslo.feature.businessinventory.ui.edititem.EditableTextAreaState rememberSaveableTextAreaState(final java.lang.String str, final java.lang.String str2, final java.lang.Integer num, androidx.compose.runtime.Composer composer, int i, int i2) {
        if ((i2 & 1) != 0) {
            str = "";
        }
        if ((i2 & 2) != 0) {
            str2 = null;
        }
        if ((i2 & 4) != 0) {
            num = null;
        }
        if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
            androidx.compose.runtime.ComposerKt.traceEventStart(1214974045, i, -1, "com.paypal.oslo.feature.businessinventory.ui.edititem.rememberSaveableTextAreaState (EditableTextArea.kt:82)");
        }
        java.lang.Object[] objArr = {str2, str, num};
        androidx.compose.runtime.saveable.Saver<com.paypal.oslo.feature.businessinventory.ui.edititem.EditableTextAreaState, ?> saver = com.paypal.oslo.feature.businessinventory.ui.edititem.EditableTextAreaState.INSTANCE.getSaver();
        boolean z = true;
        boolean z2 = (((i & 112) ^ 48) > 32 && composer.changed(str2)) || (i & 48) == 32;
        boolean z3 = (((i & 14) ^ 6) > 4 && composer.changed(str)) || (i & 6) == 4;
        if ((((i & 896) ^ 384) <= 256 || !composer.changed(num)) && (i & 384) != 256) {
            z = false;
        }
        java.lang.Object rememberedValue = composer.rememberedValue();
        if ((z3 | z2 | z) || rememberedValue == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
            rememberedValue = new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.feature.businessinventory.ui.edititem.EditableTextAreaKt$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function0
                public final java.lang.Object invoke() {
                    return com.paypal.oslo.feature.businessinventory.ui.edititem.EditableTextAreaKt.$r8$lambda$Id2zX8ncTzrF81Tc4IPK0lfvk4c(str2, str, num);
                }
            };
            composer.updateRememberedValue(rememberedValue);
        }
        com.paypal.oslo.feature.businessinventory.ui.edititem.EditableTextAreaState editableTextAreaState = (com.paypal.oslo.feature.businessinventory.ui.edititem.EditableTextAreaState) androidx.compose.runtime.saveable.RememberSaveableKt.m5465rememberSaveable(objArr, (androidx.compose.runtime.saveable.Saver) saver, (kotlin.jvm.functions.Function0) rememberedValue, composer, 0);
        if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
            androidx.compose.runtime.ComposerKt.traceEventEnd();
        }
        return editableTextAreaState;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$5ROTzz9GWfn_VmG9krd6Jeur788(com.paypal.oslo.feature.businessinventory.ui.edititem.EditableTextAreaState editableTextAreaState, java.util.List list, kotlin.jvm.functions.Function1 function1, int i, int i2, androidx.compose.runtime.Composer composer, int i3) {
        EditableTextArea(editableTextAreaState, list, function1, composer, androidx.compose.runtime.RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ com.paypal.oslo.feature.businessinventory.ui.edititem.EditableTextAreaState $r8$lambda$Id2zX8ncTzrF81Tc4IPK0lfvk4c(java.lang.String str, java.lang.String str2, java.lang.Integer num) {
        return new com.paypal.oslo.feature.businessinventory.ui.edititem.EditableTextAreaState(str, str2, num);
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$JdOq_OdQf2GEayUE4nfFJKAnCGM(com.paypal.oslo.feature.businessinventory.ui.edititem.EditableTextAreaState editableTextAreaState, kotlin.jvm.functions.Function1 function1, java.lang.String str) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
        editableTextAreaState.updateValue(str);
        function1.invoke(str);
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$lYvdXe9le2rB6eX99BdR7wv9xYg(java.lang.String str) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
        return kotlin.Unit.INSTANCE;
    }
}
