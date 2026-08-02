package com.paypal.oslo.feature.businessinventory.ui.edititem;

@kotlin.Metadata(d1 = {"\u0000$\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0007\u001a;\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\u0014\b\u0002\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\u00010\bH\u0001¢\u0006\u0002\u0010\n\u001a/\u0010\u000b\u001a\u00020\u00032\b\b\u0002\u0010\f\u001a\u00020\t2\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\t2\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\tH\u0001¢\u0006\u0002\u0010\u000f¨\u0006\u0010"}, d2 = {"EditableUserInput", "", "inputState", "Lcom/paypal/oslo/feature/businessinventory/ui/edititem/EditableUserInputState;", "alerts", "", "Lcom/paypal/pds/components/textinput/ValidationAlert;", "onValueChange", "Lkotlin/Function1;", "", "(Lcom/paypal/oslo/feature/businessinventory/ui/edititem/EditableUserInputState;Ljava/util/List;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V", "rememberSaveableTextInputState", "initialValue", "label", "prefix", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Landroidx/compose/runtime/Composer;II)Lcom/paypal/oslo/feature/businessinventory/ui/edititem/EditableUserInputState;", "business-inventory_prodRelease"}, k = 2, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class EditableUserInputKt {
    /* JADX WARN: Removed duplicated region for block: B:13:0x0045  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0064  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x006f  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x010e  */
    /* JADX WARN: Removed duplicated region for block: B:48:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:53:0x0102  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x0066  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x0048  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void EditableUserInput(final com.paypal.oslo.feature.businessinventory.ui.edititem.EditableUserInputState editableUserInputState, java.util.List<? extends com.paypal.pds.components.textinput.ValidationAlert> list, kotlin.jvm.functions.Function1<? super java.lang.String, kotlin.Unit> function1, androidx.compose.runtime.Composer composer, final int i, final int i2) {
        int i3;
        java.util.List<? extends com.paypal.pds.components.textinput.ValidationAlert> list2;
        int i4;
        kotlin.jvm.functions.Function1<? super java.lang.String, kotlin.Unit> function12;
        java.util.List<? extends com.paypal.pds.components.textinput.ValidationAlert> list3;
        final kotlin.jvm.functions.Function1<? super java.lang.String, kotlin.Unit> function13;
        androidx.compose.runtime.ScopeUpdateScope endRestartGroup;
        final kotlin.jvm.functions.Function1<? super java.lang.String, kotlin.Unit> function14;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(editableUserInputState, "");
        androidx.compose.runtime.Composer startRestartGroup = composer.startRestartGroup(1621264361);
        if ((i & 6) == 0) {
            i3 = (startRestartGroup.changed(editableUserInputState) ? 4 : 2) | i;
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
                            rememberedValue = new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.businessinventory.ui.edititem.EditableUserInputKt$$ExternalSyntheticLambda0
                                @Override // kotlin.jvm.functions.Function1
                                public final java.lang.Object invoke(java.lang.Object obj) {
                                    return com.paypal.oslo.feature.businessinventory.ui.edititem.EditableUserInputKt.$r8$lambda$7YBif3ekWm5N9NXtkisyAQSuaoU((java.lang.String) obj);
                                }
                            };
                            startRestartGroup.updateRememberedValue(rememberedValue);
                        }
                        function14 = (kotlin.jvm.functions.Function1) rememberedValue;
                    } else {
                        function14 = function12;
                    }
                    if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                        androidx.compose.runtime.ComposerKt.traceEventStart(1621264361, i3, -1, "com.paypal.oslo.feature.businessinventory.ui.edititem.EditableUserInput (EditableUserInput.kt:28)");
                    }
                    java.lang.String label = editableUserInputState.getLabel();
                    java.lang.String value = editableUserInputState.getValue();
                    boolean z = (i3 & 14) == 4;
                    boolean z2 = (i3 & 896) == 256;
                    java.lang.Object rememberedValue2 = startRestartGroup.rememberedValue();
                    if ((z | z2) || rememberedValue2 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                        rememberedValue2 = new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.businessinventory.ui.edititem.EditableUserInputKt$$ExternalSyntheticLambda1
                            @Override // kotlin.jvm.functions.Function1
                            public final java.lang.Object invoke(java.lang.Object obj) {
                                return com.paypal.oslo.feature.businessinventory.ui.edititem.EditableUserInputKt.$r8$lambda$sbfDkSnmioR8dD0_TzfPdaF8ybU(com.paypal.oslo.feature.businessinventory.ui.edititem.EditableUserInputState.this, function14, (java.lang.String) obj);
                            }
                        };
                        startRestartGroup.updateRememberedValue(rememberedValue2);
                    }
                    int i6 = ((i3 << 9) & 57344) | 48;
                    function13 = function14;
                    com.paypal.pds.components.TextInputKt.TextInput(value, (kotlin.jvm.functions.Function1<? super java.lang.String, kotlin.Unit>) rememberedValue2, (androidx.compose.ui.Modifier) null, label, (java.lang.String) null, (java.lang.String) null, false, false, (androidx.compose.foundation.text.KeyboardOptions) null, (kotlin.jvm.functions.Function1<? super kotlin.jvm.functions.Function0<kotlin.Unit>, kotlin.Unit>) null, (androidx.compose.foundation.interaction.MutableInteractionSource) null, true, (com.paypal.pds.components.textinput.VisualTransformation) null, (androidx.compose.ui.autofill.ContentType) null, list3, (kotlin.jvm.functions.Function2<? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.Unit>) null, (kotlin.jvm.functions.Function2<? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.Unit>) null, startRestartGroup, 0, i6, 112628);
                    if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                        androidx.compose.runtime.ComposerKt.traceEventEnd();
                    }
                }
                endRestartGroup = startRestartGroup.endRestartGroup();
                if (endRestartGroup != null) {
                    final java.util.List<? extends com.paypal.pds.components.textinput.ValidationAlert> list4 = list3;
                    endRestartGroup.updateScope(new kotlin.jvm.functions.Function2() { // from class: com.paypal.oslo.feature.businessinventory.ui.edititem.EditableUserInputKt$$ExternalSyntheticLambda2
                        @Override // kotlin.jvm.functions.Function2
                        public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                            return com.paypal.oslo.feature.businessinventory.ui.edititem.EditableUserInputKt.$r8$lambda$PhEBJSNK4UIcBh3u8mZ2UMNfH3U(com.paypal.oslo.feature.businessinventory.ui.edititem.EditableUserInputState.this, list4, function13, i, i2, (androidx.compose.runtime.Composer) obj, ((java.lang.Integer) obj2).intValue());
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

    public static final com.paypal.oslo.feature.businessinventory.ui.edititem.EditableUserInputState rememberSaveableTextInputState(final java.lang.String str, final java.lang.String str2, final java.lang.String str3, androidx.compose.runtime.Composer composer, int i, int i2) {
        if ((i2 & 1) != 0) {
            str = "";
        }
        if ((i2 & 2) != 0) {
            str2 = null;
        }
        if ((i2 & 4) != 0) {
            str3 = null;
        }
        if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
            androidx.compose.runtime.ComposerKt.traceEventStart(1442156782, i, -1, "com.paypal.oslo.feature.businessinventory.ui.edititem.rememberSaveableTextInputState (EditableUserInput.kt:79)");
        }
        java.lang.Object[] objArr = {str2, str, str3};
        androidx.compose.runtime.saveable.Saver<com.paypal.oslo.feature.businessinventory.ui.edititem.EditableUserInputState, ?> saver = com.paypal.oslo.feature.businessinventory.ui.edititem.EditableUserInputState.INSTANCE.getSaver();
        boolean z = true;
        boolean z2 = (((i & 112) ^ 48) > 32 && composer.changed(str2)) || (i & 48) == 32;
        boolean z3 = (((i & 14) ^ 6) > 4 && composer.changed(str)) || (i & 6) == 4;
        if ((((i & 896) ^ 384) <= 256 || !composer.changed(str3)) && (i & 384) != 256) {
            z = false;
        }
        java.lang.Object rememberedValue = composer.rememberedValue();
        if ((z3 | z2 | z) || rememberedValue == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
            rememberedValue = new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.feature.businessinventory.ui.edititem.EditableUserInputKt$$ExternalSyntheticLambda3
                @Override // kotlin.jvm.functions.Function0
                public final java.lang.Object invoke() {
                    return com.paypal.oslo.feature.businessinventory.ui.edititem.EditableUserInputKt.m13047$r8$lambda$lMgsF3BkYG7hwLafMpa8yHosF8(str2, str, str3);
                }
            };
            composer.updateRememberedValue(rememberedValue);
        }
        com.paypal.oslo.feature.businessinventory.ui.edititem.EditableUserInputState editableUserInputState = (com.paypal.oslo.feature.businessinventory.ui.edititem.EditableUserInputState) androidx.compose.runtime.saveable.RememberSaveableKt.m5465rememberSaveable(objArr, (androidx.compose.runtime.saveable.Saver) saver, (kotlin.jvm.functions.Function0) rememberedValue, composer, 0);
        if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
            androidx.compose.runtime.ComposerKt.traceEventEnd();
        }
        return editableUserInputState;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$7YBif3ekWm5N9NXtkisyAQSuaoU(java.lang.String str) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$PhEBJSNK4UIcBh3u8mZ2UMNfH3U(com.paypal.oslo.feature.businessinventory.ui.edititem.EditableUserInputState editableUserInputState, java.util.List list, kotlin.jvm.functions.Function1 function1, int i, int i2, androidx.compose.runtime.Composer composer, int i3) {
        EditableUserInput(editableUserInputState, list, function1, composer, androidx.compose.runtime.RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
        return kotlin.Unit.INSTANCE;
    }

    /* renamed from: $r8$lambda$lMgsF3BkYG7hwL-afMpa8yHosF8, reason: not valid java name */
    public static /* synthetic */ com.paypal.oslo.feature.businessinventory.ui.edititem.EditableUserInputState m13047$r8$lambda$lMgsF3BkYG7hwLafMpa8yHosF8(java.lang.String str, java.lang.String str2, java.lang.String str3) {
        return new com.paypal.oslo.feature.businessinventory.ui.edititem.EditableUserInputState(str, str2, str3);
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$sbfDkSnmioR8dD0_TzfPdaF8ybU(com.paypal.oslo.feature.businessinventory.ui.edititem.EditableUserInputState editableUserInputState, kotlin.jvm.functions.Function1 function1, java.lang.String str) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
        editableUserInputState.updateValue(str);
        function1.invoke(str);
        return kotlin.Unit.INSTANCE;
    }
}
