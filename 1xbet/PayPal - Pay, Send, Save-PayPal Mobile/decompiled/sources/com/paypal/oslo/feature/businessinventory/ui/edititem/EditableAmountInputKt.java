package com.paypal.oslo.feature.businessinventory.ui.edititem;

@kotlin.Metadata(d1 = {"\u0000,\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\t\n\u0002\b\u0002\u001a;\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\u0014\b\u0002\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\u00010\bH\u0001¢\u0006\u0002\u0010\n\u001a-\u0010\u000b\u001a\u00020\u00032\u0006\u0010\f\u001a\u00020\t2\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\t2\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u000fH\u0001¢\u0006\u0002\u0010\u0010¨\u0006\u0011"}, d2 = {"EditableAmountInput", "", "inputState", "Lcom/paypal/oslo/feature/businessinventory/ui/edititem/EditableAmountInputState;", "alerts", "", "Lcom/paypal/pds/components/textinput/ValidationAlert;", "onValueChange", "Lkotlin/Function1;", "", "(Lcom/paypal/oslo/feature/businessinventory/ui/edititem/EditableAmountInputState;Ljava/util/List;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V", "rememberSaveableAmountInputState", "currencyCode", "label", "initialValue", "", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Long;Landroidx/compose/runtime/Composer;II)Lcom/paypal/oslo/feature/businessinventory/ui/edititem/EditableAmountInputState;", "business-inventory_prodRelease"}, k = 2, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class EditableAmountInputKt {
    /* JADX WARN: Removed duplicated region for block: B:13:0x0046  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0064  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x006f  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x0155  */
    /* JADX WARN: Removed duplicated region for block: B:54:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:60:0x014b  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x0066  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x0049  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void EditableAmountInput(final com.paypal.oslo.feature.businessinventory.ui.edititem.EditableAmountInputState editableAmountInputState, java.util.List<? extends com.paypal.pds.components.textinput.ValidationAlert> list, kotlin.jvm.functions.Function1<? super java.lang.String, kotlin.Unit> function1, androidx.compose.runtime.Composer composer, final int i, final int i2) {
        int i3;
        java.util.List<? extends com.paypal.pds.components.textinput.ValidationAlert> list2;
        int i4;
        kotlin.jvm.functions.Function1<? super java.lang.String, kotlin.Unit> function12;
        final java.util.List<? extends com.paypal.pds.components.textinput.ValidationAlert> list3;
        androidx.compose.runtime.ScopeUpdateScope endRestartGroup;
        final kotlin.jvm.functions.Function1<? super java.lang.String, kotlin.Unit> function13;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(editableAmountInputState, "");
        androidx.compose.runtime.Composer startRestartGroup = composer.startRestartGroup(-6644080);
        if ((i & 6) == 0) {
            i3 = (startRestartGroup.changed(editableAmountInputState) ? 4 : 2) | i;
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
                } else {
                    java.util.List<? extends com.paypal.pds.components.textinput.ValidationAlert> emptyList = i5 != 0 ? kotlin.collections.CollectionsKt.emptyList() : list2;
                    if (i4 != 0) {
                        java.lang.Object rememberedValue = startRestartGroup.rememberedValue();
                        if (rememberedValue == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                            rememberedValue = new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.businessinventory.ui.edititem.EditableAmountInputKt$$ExternalSyntheticLambda1
                                @Override // kotlin.jvm.functions.Function1
                                public final java.lang.Object invoke(java.lang.Object obj) {
                                    return com.paypal.oslo.feature.businessinventory.ui.edititem.EditableAmountInputKt.$r8$lambda$OoEWusXRH7eckWvEEiF5MvJAdeQ((java.lang.String) obj);
                                }
                            };
                            startRestartGroup.updateRememberedValue(rememberedValue);
                        }
                        function13 = (kotlin.jvm.functions.Function1) rememberedValue;
                    } else {
                        function13 = function12;
                    }
                    if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                        androidx.compose.runtime.ComposerKt.traceEventStart(-6644080, i3, -1, "com.paypal.oslo.feature.businessinventory.ui.edititem.EditableAmountInput (EditableAmountInput.kt:32)");
                    }
                    java.lang.String label = editableAmountInputState.getLabel();
                    java.lang.Long value = editableAmountInputState.getValue();
                    java.lang.String valueOf = value != null ? java.lang.String.valueOf(value.longValue()) : null;
                    if (valueOf == null) {
                        valueOf = "";
                    }
                    androidx.compose.foundation.text.KeyboardOptions keyboardOptions = new androidx.compose.foundation.text.KeyboardOptions(0, (java.lang.Boolean) null, androidx.compose.ui.text.input.KeyboardType.INSTANCE.m8268getNumberPjHm6EE(), 0, (androidx.compose.ui.text.input.PlatformImeOptions) null, (java.lang.Boolean) null, (androidx.compose.ui.text.intl.LocaleList) null, com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_CALENDAR_VALUE, (kotlin.jvm.internal.DefaultConstructorMarker) null);
                    java.util.Currency currency = java.util.Currency.getInstance(editableAmountInputState.getCurrencyCode());
                    kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(currency, "");
                    com.paypal.pds.components.textinput.VisualTransformation.Currency currency2 = new com.paypal.pds.components.textinput.VisualTransformation.Currency(currency, false, 2, null);
                    boolean z = (i3 & 14) == 4;
                    boolean z2 = (i3 & 896) == 256;
                    java.lang.Object rememberedValue2 = startRestartGroup.rememberedValue();
                    if ((z | z2) || rememberedValue2 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                        rememberedValue2 = new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.businessinventory.ui.edititem.EditableAmountInputKt$$ExternalSyntheticLambda2
                            @Override // kotlin.jvm.functions.Function1
                            public final java.lang.Object invoke(java.lang.Object obj) {
                                return com.paypal.oslo.feature.businessinventory.ui.edititem.EditableAmountInputKt.$r8$lambda$0IIw6sAxoCovEAU8030WSv7vUVM(com.paypal.oslo.feature.businessinventory.ui.edititem.EditableAmountInputState.this, function13, (java.lang.String) obj);
                            }
                        };
                        startRestartGroup.updateRememberedValue(rememberedValue2);
                    }
                    kotlin.jvm.functions.Function1<? super java.lang.String, kotlin.Unit> function14 = function13;
                    com.paypal.pds.components.TextInputKt.TextInput(valueOf, (kotlin.jvm.functions.Function1<? super java.lang.String, kotlin.Unit>) rememberedValue2, (androidx.compose.ui.Modifier) null, label, (java.lang.String) null, (java.lang.String) null, false, false, keyboardOptions, (kotlin.jvm.functions.Function1<? super kotlin.jvm.functions.Function0<kotlin.Unit>, kotlin.Unit>) null, (androidx.compose.foundation.interaction.MutableInteractionSource) null, true, (com.paypal.pds.components.textinput.VisualTransformation) currency2, (androidx.compose.ui.autofill.ContentType) null, emptyList, (kotlin.jvm.functions.Function2<? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.Unit>) null, (kotlin.jvm.functions.Function2<? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.Unit>) null, startRestartGroup, 100663296, (com.paypal.pds.components.textinput.VisualTransformation.Currency.$stable << 6) | 48 | ((i3 << 9) & 57344), 108276);
                    if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                        androidx.compose.runtime.ComposerKt.traceEventEnd();
                    }
                    function12 = function14;
                    list3 = emptyList;
                }
                endRestartGroup = startRestartGroup.endRestartGroup();
                if (endRestartGroup != null) {
                    final kotlin.jvm.functions.Function1<? super java.lang.String, kotlin.Unit> function15 = function12;
                    endRestartGroup.updateScope(new kotlin.jvm.functions.Function2() { // from class: com.paypal.oslo.feature.businessinventory.ui.edititem.EditableAmountInputKt$$ExternalSyntheticLambda3
                        @Override // kotlin.jvm.functions.Function2
                        public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                            return com.paypal.oslo.feature.businessinventory.ui.edititem.EditableAmountInputKt.m13046$r8$lambda$LPDPDgDsLf_9Vpr2s9ZNTIVVbs(com.paypal.oslo.feature.businessinventory.ui.edititem.EditableAmountInputState.this, list3, function15, i, i2, (androidx.compose.runtime.Composer) obj, ((java.lang.Integer) obj2).intValue());
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

    public static final com.paypal.oslo.feature.businessinventory.ui.edititem.EditableAmountInputState rememberSaveableAmountInputState(final java.lang.String str, final java.lang.String str2, final java.lang.Long l, androidx.compose.runtime.Composer composer, int i, int i2) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
        if ((i2 & 2) != 0) {
            str2 = null;
        }
        if ((i2 & 4) != 0) {
            l = null;
        }
        if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
            androidx.compose.runtime.ComposerKt.traceEventStart(-436003608, i, -1, "com.paypal.oslo.feature.businessinventory.ui.edititem.rememberSaveableAmountInputState (EditableAmountInput.kt:86)");
        }
        java.lang.Object[] objArr = {str, str2, l};
        androidx.compose.runtime.saveable.Saver<com.paypal.oslo.feature.businessinventory.ui.edititem.EditableAmountInputState, ?> saver = com.paypal.oslo.feature.businessinventory.ui.edititem.EditableAmountInputState.INSTANCE.getSaver();
        boolean z = true;
        boolean z2 = (((i & 14) ^ 6) > 4 && composer.changed(str)) || (i & 6) == 4;
        boolean z3 = (((i & 112) ^ 48) > 32 && composer.changed(str2)) || (i & 48) == 32;
        if ((((i & 896) ^ 384) <= 256 || !composer.changed(l)) && (i & 384) != 256) {
            z = false;
        }
        java.lang.Object rememberedValue = composer.rememberedValue();
        if ((z2 | z3 | z) || rememberedValue == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
            rememberedValue = new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.feature.businessinventory.ui.edititem.EditableAmountInputKt$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function0
                public final java.lang.Object invoke() {
                    return com.paypal.oslo.feature.businessinventory.ui.edititem.EditableAmountInputKt.$r8$lambda$ZnWWtdWVbQLMozRURz2DGDw0gYo(str, str2, l);
                }
            };
            composer.updateRememberedValue(rememberedValue);
        }
        com.paypal.oslo.feature.businessinventory.ui.edititem.EditableAmountInputState editableAmountInputState = (com.paypal.oslo.feature.businessinventory.ui.edititem.EditableAmountInputState) androidx.compose.runtime.saveable.RememberSaveableKt.m5465rememberSaveable(objArr, (androidx.compose.runtime.saveable.Saver) saver, (kotlin.jvm.functions.Function0) rememberedValue, composer, 0);
        if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
            androidx.compose.runtime.ComposerKt.traceEventEnd();
        }
        return editableAmountInputState;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$0IIw6sAxoCovEAU8030WSv7vUVM(com.paypal.oslo.feature.businessinventory.ui.edititem.EditableAmountInputState editableAmountInputState, kotlin.jvm.functions.Function1 function1, java.lang.String str) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
        editableAmountInputState.updateValue(str);
        function1.invoke(str);
        return kotlin.Unit.INSTANCE;
    }

    /* renamed from: $r8$lambda$LPD-PDgDsLf_9Vpr2s9ZNTIVVbs, reason: not valid java name */
    public static /* synthetic */ kotlin.Unit m13046$r8$lambda$LPDPDgDsLf_9Vpr2s9ZNTIVVbs(com.paypal.oslo.feature.businessinventory.ui.edititem.EditableAmountInputState editableAmountInputState, java.util.List list, kotlin.jvm.functions.Function1 function1, int i, int i2, androidx.compose.runtime.Composer composer, int i3) {
        EditableAmountInput(editableAmountInputState, list, function1, composer, androidx.compose.runtime.RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$OoEWusXRH7eckWvEEiF5MvJAdeQ(java.lang.String str) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ com.paypal.oslo.feature.businessinventory.ui.edititem.EditableAmountInputState $r8$lambda$ZnWWtdWVbQLMozRURz2DGDw0gYo(java.lang.String str, java.lang.String str2, java.lang.Long l) {
        return new com.paypal.oslo.feature.businessinventory.ui.edititem.EditableAmountInputState(str, str2, l);
    }
}
