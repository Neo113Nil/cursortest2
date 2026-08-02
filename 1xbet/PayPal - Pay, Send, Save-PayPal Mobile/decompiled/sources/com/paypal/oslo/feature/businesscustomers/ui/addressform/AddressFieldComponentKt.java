package com.paypal.oslo.feature.businesscustomers.ui.addressform;

@kotlin.Metadata(d1 = {"\u0000N\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\b\u0004\u001ak\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0012\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00010\u000526\u0010\u0007\u001a2\u0012\u0013\u0012\u00110\t¢\u0006\f\b\n\u0012\b\b\u000b\u0012\u0004\b\b(\f\u0012\u0013\u0012\u00110\r¢\u0006\f\b\n\u0012\b\b\u000b\u0012\u0004\b\b(\u000e\u0012\u0004\u0012\u00020\u00010\b2\b\b\u0002\u0010\u000f\u001a\u00020\u0010H\u0001¢\u0006\u0002\u0010\u0011\u001aW\u0010\u0012\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u001326\u0010\u0007\u001a2\u0012\u0013\u0012\u00110\t¢\u0006\f\b\n\u0012\b\b\u000b\u0012\u0004\b\b(\f\u0012\u0013\u0012\u00110\r¢\u0006\f\b\n\u0012\b\b\u000b\u0012\u0004\b\b(\u000e\u0012\u0004\u0012\u00020\u00010\b2\b\b\u0002\u0010\u000f\u001a\u00020\u0010H\u0001¢\u0006\u0002\u0010\u0014\u001as\u0010\u0015\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u001626\u0010\u0007\u001a2\u0012\u0013\u0012\u00110\t¢\u0006\f\b\n\u0012\b\b\u000b\u0012\u0004\b\b(\f\u0012\u0013\u0012\u00110\r¢\u0006\f\b\n\u0012\b\b\u000b\u0012\u0004\b\b(\u000e\u0012\u0004\u0012\u00020\u00010\b2\u0012\u0010\u0017\u001a\u000e\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\r0\u00182\u0006\u0010\u0019\u001a\u00020\u00062\b\b\u0002\u0010\u000f\u001a\u00020\u0010H\u0001¢\u0006\u0002\u0010\u001a¨\u0006\u001b²\u0006\n\u0010\u001c\u001a\u00020\rX\u008a\u008e\u0002²\u0006\n\u0010\u001c\u001a\u00020\rX\u008a\u008e\u0002"}, d2 = {"AddressFieldComponent", "", "addressComponent", "Lcom/paypal/oslo/feature/businesscustomers/ui/addressform/AddressComponentComposeState;", "onDropdownState", "Lkotlin/Function1;", "Lcom/paypal/pds/components/DropdownState;", "onUpdate", "Lkotlin/Function2;", "Lcom/paypal/oslo/core/i18n/domain/model/Field;", "Lkotlin/ParameterName;", "name", "field", "", com.datadog.android.rum.internal.metric.ViewEndedMetricDispatcher.KEY_VALUE, "modifier", "Landroidx/compose/ui/Modifier;", "(Lcom/paypal/oslo/feature/businesscustomers/ui/addressform/AddressComponentComposeState;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function2;Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;II)V", "AddressFieldTextInputComponent", "Lcom/paypal/oslo/feature/businesscustomers/ui/addressform/AddressComponentComposeState$TextInput;", "(Lcom/paypal/oslo/feature/businesscustomers/ui/addressform/AddressComponentComposeState$TextInput;Lkotlin/jvm/functions/Function2;Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;II)V", "AddressFieldDropdownComponent", "Lcom/paypal/oslo/feature/businesscustomers/ui/addressform/AddressComponentComposeState$Dropdown;", "dropdownItemData", "", "dropdownState", "(Lcom/paypal/oslo/feature/businesscustomers/ui/addressform/AddressComponentComposeState$Dropdown;Lkotlin/jvm/functions/Function2;Ljava/util/Map;Lcom/paypal/pds/components/DropdownState;Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;II)V", "business-customers_prodRelease", "currentValue"}, k = 2, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class AddressFieldComponentKt {
    public static final void AddressFieldComponent(final com.paypal.oslo.feature.businesscustomers.ui.addressform.AddressComponentComposeState addressComponentComposeState, final kotlin.jvm.functions.Function1<? super com.paypal.pds.components.DropdownState, kotlin.Unit> function1, final kotlin.jvm.functions.Function2<? super com.paypal.oslo.core.i18n.domain.model.Field, ? super java.lang.String, kotlin.Unit> function2, androidx.compose.ui.Modifier modifier, androidx.compose.runtime.Composer composer, final int i, final int i2) {
        int i3;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(addressComponentComposeState, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(function1, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(function2, "");
        androidx.compose.runtime.Composer startRestartGroup = composer.startRestartGroup(-1590844562);
        if ((i & 6) == 0) {
            i3 = ((i & 8) == 0 ? startRestartGroup.changed(addressComponentComposeState) : startRestartGroup.changedInstance(addressComponentComposeState) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i & 48) == 0) {
            i3 |= startRestartGroup.changedInstance(function1) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i3 |= startRestartGroup.changedInstance(function2) ? 256 : 128;
        }
        int i4 = i2 & 8;
        if (i4 != 0) {
            i3 |= 3072;
        } else if ((i & 3072) == 0) {
            i3 |= startRestartGroup.changed(modifier) ? 2048 : 1024;
        }
        if (!startRestartGroup.shouldExecute((i3 & 1171) != 1170, i3 & 1)) {
            startRestartGroup.skipToGroupEnd();
        } else {
            if (i4 != 0) {
                modifier = androidx.compose.ui.Modifier.INSTANCE;
            }
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventStart(-1590844562, i3, -1, "com.paypal.oslo.feature.businesscustomers.ui.addressform.AddressFieldComponent (AddressFieldComponent.kt:33)");
            }
            if (addressComponentComposeState instanceof com.paypal.oslo.feature.businesscustomers.ui.addressform.AddressComponentComposeState.Dropdown) {
                startRestartGroup.startReplaceGroup(2114074076);
                com.paypal.pds.components.DropdownState rememberDropdownState = com.paypal.pds.components.DropdownKt.rememberDropdownState(startRestartGroup, 0);
                function1.invoke(rememberDropdownState);
                com.paypal.oslo.feature.businesscustomers.ui.addressform.AddressComponentComposeState.Dropdown dropdown = (com.paypal.oslo.feature.businesscustomers.ui.addressform.AddressComponentComposeState.Dropdown) addressComponentComposeState;
                AddressFieldDropdownComponent(dropdown, function2, dropdown.getDropdownValues(), rememberDropdownState, modifier, startRestartGroup, ((i3 << 3) & 57344) | ((i3 >> 3) & 112) | (i3 & 14) | (com.paypal.pds.components.DropdownState.$stable << 9), 0);
                startRestartGroup.endReplaceGroup();
            } else if (addressComponentComposeState instanceof com.paypal.oslo.feature.businesscustomers.ui.addressform.AddressComponentComposeState.TextInput) {
                startRestartGroup.startReplaceGroup(206758233);
                int i5 = i3 >> 3;
                AddressFieldTextInputComponent((com.paypal.oslo.feature.businesscustomers.ui.addressform.AddressComponentComposeState.TextInput) addressComponentComposeState, function2, modifier, startRestartGroup, (i3 & 14) | (i5 & 112) | (i5 & 896), 0);
                startRestartGroup.endReplaceGroup();
            } else {
                startRestartGroup.startReplaceGroup(206741096);
                startRestartGroup.endReplaceGroup();
                throw new kotlin.NoWhenBranchMatchedException();
            }
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventEnd();
            }
        }
        final androidx.compose.ui.Modifier modifier2 = modifier;
        androidx.compose.runtime.ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new kotlin.jvm.functions.Function2() { // from class: com.paypal.oslo.feature.businesscustomers.ui.addressform.AddressFieldComponentKt$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function2
                public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                    return com.paypal.oslo.feature.businesscustomers.ui.addressform.AddressFieldComponentKt.m12755$r8$lambda$swi4Gb0uFcRANquK0pE1PiT0Y(com.paypal.oslo.feature.businesscustomers.ui.addressform.AddressComponentComposeState.this, function1, function2, modifier2, i, i2, (androidx.compose.runtime.Composer) obj, ((java.lang.Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:20:0x005d  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0068  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x014d  */
    /* JADX WARN: Removed duplicated region for block: B:59:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:67:0x0142  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x005f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void AddressFieldTextInputComponent(final com.paypal.oslo.feature.businesscustomers.ui.addressform.AddressComponentComposeState.TextInput textInput, final kotlin.jvm.functions.Function2<? super com.paypal.oslo.core.i18n.domain.model.Field, ? super java.lang.String, kotlin.Unit> function2, androidx.compose.ui.Modifier modifier, androidx.compose.runtime.Composer composer, final int i, final int i2) {
        int i3;
        androidx.compose.ui.Modifier modifier2;
        androidx.compose.ui.Modifier modifier3;
        androidx.compose.runtime.ScopeUpdateScope endRestartGroup;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(textInput, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(function2, "");
        androidx.compose.runtime.Composer startRestartGroup = composer.startRestartGroup(97300089);
        if ((i & 6) == 0) {
            i3 = (startRestartGroup.changed(textInput) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i & 48) == 0) {
            i3 |= startRestartGroup.changedInstance(function2) ? 32 : 16;
        }
        int i4 = i2 & 4;
        if (i4 != 0) {
            i3 |= 384;
        } else if ((i & 384) == 0) {
            modifier2 = modifier;
            i3 |= startRestartGroup.changed(modifier2) ? 256 : 128;
            if (startRestartGroup.shouldExecute((i3 & 147) == 146, i3 & 1)) {
                startRestartGroup.skipToGroupEnd();
                modifier3 = modifier2;
            } else {
                modifier3 = i4 != 0 ? androidx.compose.ui.Modifier.INSTANCE : modifier2;
                if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                    androidx.compose.runtime.ComposerKt.traceEventStart(97300089, i3, -1, "com.paypal.oslo.feature.businesscustomers.ui.addressform.AddressFieldTextInputComponent (AddressFieldComponent.kt:61)");
                }
                java.lang.Object[] objArr = {textInput};
                int i5 = i3 & 14;
                boolean z = i5 == 4;
                java.lang.Object rememberedValue = startRestartGroup.rememberedValue();
                if (z || rememberedValue == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                    rememberedValue = new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.feature.businesscustomers.ui.addressform.AddressFieldComponentKt$$ExternalSyntheticLambda1
                        @Override // kotlin.jvm.functions.Function0
                        public final java.lang.Object invoke() {
                            androidx.compose.runtime.MutableState mutableStateOf$default;
                            mutableStateOf$default = androidx.compose.runtime.SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(com.paypal.oslo.feature.businesscustomers.ui.addressform.AddressComponentComposeState.TextInput.this.getField().getValue(), null, 2, null);
                            return mutableStateOf$default;
                        }
                    };
                    startRestartGroup.updateRememberedValue(rememberedValue);
                }
                final androidx.compose.runtime.MutableState mutableState = (androidx.compose.runtime.MutableState) androidx.compose.runtime.saveable.RememberSaveableKt.rememberSaveable(objArr, (kotlin.jvm.functions.Function0) rememberedValue, startRestartGroup, 0);
                java.lang.String value = textInput.getField().getValue();
                boolean changed = startRestartGroup.changed(mutableState);
                boolean z2 = i5 == 4;
                com.paypal.oslo.feature.businesscustomers.ui.addressform.AddressFieldComponentKt$AddressFieldTextInputComponent$1$1 rememberedValue2 = startRestartGroup.rememberedValue();
                if ((changed | z2) || rememberedValue2 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                    rememberedValue2 = new com.paypal.oslo.feature.businesscustomers.ui.addressform.AddressFieldComponentKt$AddressFieldTextInputComponent$1$1(textInput, mutableState, null);
                    startRestartGroup.updateRememberedValue(rememberedValue2);
                }
                androidx.compose.runtime.EffectsKt.LaunchedEffect(value, (kotlin.jvm.functions.Function2<? super kotlinx.coroutines.CoroutineScope, ? super kotlin.coroutines.Continuation<? super kotlin.Unit>, ? extends java.lang.Object>) rememberedValue2, startRestartGroup, 0);
                java.lang.String str = (java.lang.String) mutableState.getValue();
                java.lang.String label = textInput.getLabel();
                boolean changed2 = startRestartGroup.changed(mutableState);
                boolean z3 = (i3 & 112) == 32;
                boolean z4 = i5 == 4;
                java.lang.Object rememberedValue3 = startRestartGroup.rememberedValue();
                if ((z3 | changed2 | z4) || rememberedValue3 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                    rememberedValue3 = new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.businesscustomers.ui.addressform.AddressFieldComponentKt$$ExternalSyntheticLambda2
                        @Override // kotlin.jvm.functions.Function1
                        public final java.lang.Object invoke(java.lang.Object obj) {
                            return com.paypal.oslo.feature.businesscustomers.ui.addressform.AddressFieldComponentKt.m12757$r8$lambda$ur3rgIcyoG6uPkWphQ7Mj3BFFM(kotlin.jvm.functions.Function2.this, textInput, mutableState, (java.lang.String) obj);
                        }
                    };
                    startRestartGroup.updateRememberedValue(rememberedValue3);
                }
                com.paypal.pds.components.TextInputKt.TextInput(str, (kotlin.jvm.functions.Function1<? super java.lang.String, kotlin.Unit>) rememberedValue3, modifier3, label, (java.lang.String) null, (java.lang.String) null, false, false, (androidx.compose.foundation.text.KeyboardOptions) null, (kotlin.jvm.functions.Function1<? super kotlin.jvm.functions.Function0<kotlin.Unit>, kotlin.Unit>) null, (androidx.compose.foundation.interaction.MutableInteractionSource) null, false, (com.paypal.pds.components.textinput.VisualTransformation) null, (androidx.compose.ui.autofill.ContentType) null, (java.util.List<? extends com.paypal.pds.components.textinput.ValidationAlert>) null, (kotlin.jvm.functions.Function2<? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.Unit>) null, (kotlin.jvm.functions.Function2<? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.Unit>) null, startRestartGroup, i3 & 896, 0, 131056);
                if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                    androidx.compose.runtime.ComposerKt.traceEventEnd();
                }
            }
            endRestartGroup = startRestartGroup.endRestartGroup();
            if (endRestartGroup == null) {
                final androidx.compose.ui.Modifier modifier4 = modifier3;
                endRestartGroup.updateScope(new kotlin.jvm.functions.Function2() { // from class: com.paypal.oslo.feature.businesscustomers.ui.addressform.AddressFieldComponentKt$$ExternalSyntheticLambda3
                    @Override // kotlin.jvm.functions.Function2
                    public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                        return com.paypal.oslo.feature.businesscustomers.ui.addressform.AddressFieldComponentKt.m12756$r8$lambda$uWqAGCvevRJEfHS5ezItuuX8zY(com.paypal.oslo.feature.businesscustomers.ui.addressform.AddressComponentComposeState.TextInput.this, function2, modifier4, i, i2, (androidx.compose.runtime.Composer) obj, ((java.lang.Integer) obj2).intValue());
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

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:105:0x01f3  */
    /* JADX WARN: Removed duplicated region for block: B:106:0x0091  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x008f  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x009a  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x01ff  */
    /* JADX WARN: Removed duplicated region for block: B:93:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void AddressFieldDropdownComponent(final com.paypal.oslo.feature.businesscustomers.ui.addressform.AddressComponentComposeState.Dropdown dropdown, final kotlin.jvm.functions.Function2<? super com.paypal.oslo.core.i18n.domain.model.Field, ? super java.lang.String, kotlin.Unit> function2, final java.util.Map<java.lang.String, java.lang.String> map, final com.paypal.pds.components.DropdownState dropdownState, androidx.compose.ui.Modifier modifier, androidx.compose.runtime.Composer composer, final int i, final int i2) {
        androidx.compose.ui.Modifier modifier2;
        androidx.compose.runtime.Composer composer2;
        final androidx.compose.ui.Modifier modifier3;
        androidx.compose.runtime.ScopeUpdateScope endRestartGroup;
        java.lang.Object obj;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(dropdown, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(function2, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(map, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(dropdownState, "");
        androidx.compose.runtime.Composer startRestartGroup = composer.startRestartGroup(1267900733);
        int i3 = (i & 6) == 0 ? (startRestartGroup.changed(dropdown) ? 4 : 2) | i : i;
        if ((i & 48) == 0) {
            i3 |= startRestartGroup.changedInstance(function2) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i3 |= startRestartGroup.changedInstance(map) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i3 |= (i & 4096) == 0 ? startRestartGroup.changed(dropdownState) : startRestartGroup.changedInstance(dropdownState) ? 2048 : 1024;
        }
        int i4 = i2 & 16;
        if (i4 != 0) {
            i3 |= 24576;
        } else if ((i & 24576) == 0) {
            modifier2 = modifier;
            i3 |= startRestartGroup.changed(modifier2) ? 16384 : 8192;
            if (startRestartGroup.shouldExecute((i3 & 9363) == 9362, i3 & 1)) {
                composer2 = startRestartGroup;
                composer2.skipToGroupEnd();
                modifier3 = modifier2;
            } else {
                androidx.compose.ui.Modifier modifier4 = i4 != 0 ? androidx.compose.ui.Modifier.INSTANCE : modifier2;
                if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                    androidx.compose.runtime.ComposerKt.traceEventStart(1267900733, i3, -1, "com.paypal.oslo.feature.businesscustomers.ui.addressform.AddressFieldDropdownComponent (AddressFieldComponent.kt:86)");
                }
                java.lang.Object[] objArr = {dropdown};
                int i5 = i3 & 14;
                boolean z = i5 == 4;
                java.lang.Object rememberedValue = startRestartGroup.rememberedValue();
                if (z || rememberedValue == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                    rememberedValue = new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.feature.businesscustomers.ui.addressform.AddressFieldComponentKt$$ExternalSyntheticLambda4
                        @Override // kotlin.jvm.functions.Function0
                        public final java.lang.Object invoke() {
                            androidx.compose.runtime.MutableState mutableStateOf$default;
                            mutableStateOf$default = androidx.compose.runtime.SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(com.paypal.oslo.feature.businesscustomers.ui.addressform.AddressComponentComposeState.Dropdown.this.getField().getValue(), null, 2, null);
                            return mutableStateOf$default;
                        }
                    };
                    startRestartGroup.updateRememberedValue(rememberedValue);
                }
                final androidx.compose.runtime.MutableState mutableState = (androidx.compose.runtime.MutableState) androidx.compose.runtime.saveable.RememberSaveableKt.rememberSaveable(objArr, (kotlin.jvm.functions.Function0) rememberedValue, startRestartGroup, 0);
                java.lang.String value = dropdown.getField().getValue();
                boolean changed = startRestartGroup.changed(mutableState);
                boolean z2 = i5 == 4;
                java.lang.Object rememberedValue2 = startRestartGroup.rememberedValue();
                if ((changed | z2) || rememberedValue2 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                    rememberedValue2 = (kotlin.jvm.functions.Function2) new com.paypal.oslo.feature.businesscustomers.ui.addressform.AddressFieldComponentKt$AddressFieldDropdownComponent$1$1(dropdown, mutableState, null);
                    startRestartGroup.updateRememberedValue(rememberedValue2);
                }
                androidx.compose.runtime.EffectsKt.LaunchedEffect(value, (kotlin.jvm.functions.Function2<? super kotlinx.coroutines.CoroutineScope, ? super kotlin.coroutines.Continuation<? super kotlin.Unit>, ? extends java.lang.Object>) rememberedValue2, startRestartGroup, 0);
                java.util.ArrayList arrayList = new java.util.ArrayList(map.size());
                for (java.util.Map.Entry<java.lang.String, java.lang.String> entry : map.entrySet()) {
                    arrayList.add(new com.paypal.pds.components.MenuItem(null, entry.getValue(), entry.getKey(), null, null, 25, null));
                }
                java.util.ArrayList arrayList2 = arrayList;
                java.util.Iterator it = arrayList2.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        obj = null;
                        break;
                    }
                    java.lang.Object next = it.next();
                    if (kotlin.jvm.internal.Intrinsics.areEqual(((com.paypal.pds.components.MenuItem) next).getKey(), (java.lang.String) mutableState.getValue())) {
                        obj = next;
                        break;
                    }
                }
                com.paypal.pds.components.MenuItem menuItem = (com.paypal.pds.components.MenuItem) obj;
                java.lang.String label = dropdown.getLabel();
                java.lang.String str = label == null ? "" : label;
                boolean z3 = (i3 & 112) == 32;
                boolean z4 = i5 == 4;
                boolean changed2 = startRestartGroup.changed(mutableState);
                java.lang.Object rememberedValue3 = startRestartGroup.rememberedValue();
                if ((z3 | z4 | changed2) || rememberedValue3 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                    rememberedValue3 = new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.businesscustomers.ui.addressform.AddressFieldComponentKt$$ExternalSyntheticLambda5
                        @Override // kotlin.jvm.functions.Function1
                        public final java.lang.Object invoke(java.lang.Object obj2) {
                            return com.paypal.oslo.feature.businesscustomers.ui.addressform.AddressFieldComponentKt.$r8$lambda$momsQDQDM4jQIo0s5eixPv_qh3U(kotlin.jvm.functions.Function2.this, dropdown, mutableState, (com.paypal.pds.components.MenuItem) obj2);
                        }
                    };
                    startRestartGroup.updateRememberedValue(rememberedValue3);
                }
                composer2 = startRestartGroup;
                com.paypal.pds.components.DropdownKt.Dropdown(dropdownState, arrayList2, modifier4, menuItem, (kotlin.jvm.functions.Function1) rememberedValue3, str, null, false, null, false, null, null, null, null, null, null, null, composer2, com.paypal.pds.components.DropdownState.$stable | ((i3 >> 9) & 14) | ((i3 >> 6) & 896), 0, 131008);
                if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                    androidx.compose.runtime.ComposerKt.traceEventEnd();
                }
                modifier3 = modifier4;
            }
            endRestartGroup = composer2.endRestartGroup();
            if (endRestartGroup == null) {
                endRestartGroup.updateScope(new kotlin.jvm.functions.Function2() { // from class: com.paypal.oslo.feature.businesscustomers.ui.addressform.AddressFieldComponentKt$$ExternalSyntheticLambda6
                    @Override // kotlin.jvm.functions.Function2
                    public final java.lang.Object invoke(java.lang.Object obj2, java.lang.Object obj3) {
                        return com.paypal.oslo.feature.businesscustomers.ui.addressform.AddressFieldComponentKt.$r8$lambda$o5U53fEkexpCWd4zSRBKD0dZPao(com.paypal.oslo.feature.businesscustomers.ui.addressform.AddressComponentComposeState.Dropdown.this, function2, map, dropdownState, modifier3, i, i2, (androidx.compose.runtime.Composer) obj2, ((java.lang.Integer) obj3).intValue());
                    }
                });
                return;
            }
            return;
        }
        modifier2 = modifier;
        if (startRestartGroup.shouldExecute((i3 & 9363) == 9362, i3 & 1)) {
        }
        endRestartGroup = composer2.endRestartGroup();
        if (endRestartGroup == null) {
        }
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$momsQDQDM4jQIo0s5eixPv_qh3U(kotlin.jvm.functions.Function2 function2, com.paypal.oslo.feature.businesscustomers.ui.addressform.AddressComponentComposeState.Dropdown dropdown, androidx.compose.runtime.MutableState mutableState, com.paypal.pds.components.MenuItem menuItem) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(menuItem, "");
        com.paypal.oslo.core.i18n.domain.model.Field field = dropdown.getField();
        java.lang.Object key = menuItem.getKey();
        kotlin.jvm.internal.Intrinsics.checkNotNull(key, "");
        function2.invoke(field, (java.lang.String) key);
        mutableState.setValue(menuItem.getKey().toString());
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$o5U53fEkexpCWd4zSRBKD0dZPao(com.paypal.oslo.feature.businesscustomers.ui.addressform.AddressComponentComposeState.Dropdown dropdown, kotlin.jvm.functions.Function2 function2, java.util.Map map, com.paypal.pds.components.DropdownState dropdownState, androidx.compose.ui.Modifier modifier, int i, int i2, androidx.compose.runtime.Composer composer, int i3) {
        AddressFieldDropdownComponent(dropdown, function2, map, dropdownState, modifier, composer, androidx.compose.runtime.RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
        return kotlin.Unit.INSTANCE;
    }

    /* renamed from: $r8$lambda$swi4Gb0uFcRAN-quK-0pE1PiT0Y, reason: not valid java name */
    public static /* synthetic */ kotlin.Unit m12755$r8$lambda$swi4Gb0uFcRANquK0pE1PiT0Y(com.paypal.oslo.feature.businesscustomers.ui.addressform.AddressComponentComposeState addressComponentComposeState, kotlin.jvm.functions.Function1 function1, kotlin.jvm.functions.Function2 function2, androidx.compose.ui.Modifier modifier, int i, int i2, androidx.compose.runtime.Composer composer, int i3) {
        AddressFieldComponent(addressComponentComposeState, function1, function2, modifier, composer, androidx.compose.runtime.RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
        return kotlin.Unit.INSTANCE;
    }

    /* renamed from: $r8$lambda$uWqAGCvevRJEf-HS5ezItuuX8zY, reason: not valid java name */
    public static /* synthetic */ kotlin.Unit m12756$r8$lambda$uWqAGCvevRJEfHS5ezItuuX8zY(com.paypal.oslo.feature.businesscustomers.ui.addressform.AddressComponentComposeState.TextInput textInput, kotlin.jvm.functions.Function2 function2, androidx.compose.ui.Modifier modifier, int i, int i2, androidx.compose.runtime.Composer composer, int i3) {
        AddressFieldTextInputComponent(textInput, function2, modifier, composer, androidx.compose.runtime.RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
        return kotlin.Unit.INSTANCE;
    }

    /* renamed from: $r8$lambda$ur3rgI-cyoG6uPkWphQ7Mj3BFFM, reason: not valid java name */
    public static /* synthetic */ kotlin.Unit m12757$r8$lambda$ur3rgIcyoG6uPkWphQ7Mj3BFFM(kotlin.jvm.functions.Function2 function2, com.paypal.oslo.feature.businesscustomers.ui.addressform.AddressComponentComposeState.TextInput textInput, androidx.compose.runtime.MutableState mutableState, java.lang.String str) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
        mutableState.setValue(str);
        function2.invoke(textInput.getField(), str);
        return kotlin.Unit.INSTANCE;
    }
}
