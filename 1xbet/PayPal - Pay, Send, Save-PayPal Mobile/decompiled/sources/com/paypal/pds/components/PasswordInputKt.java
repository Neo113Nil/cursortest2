package com.paypal.pds.components;

@kotlin.Metadata(d1 = {"\u0000N\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\u001a\f\u0010\u0003\u001a\u00020\u0004*\u00020\u0004H\u0002\u001a|\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2!\u0010\t\u001a\u001d\u0012\u0013\u0012\u00110\b¢\u0006\f\b\u000b\u0012\b\b\f\u0012\u0004\b\b(\r\u0012\u0004\u0012\u00020\u00060\n2\b\b\u0002\u0010\u000e\u001a\u00020\u000f2\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\b2\b\b\u0002\u0010\u0011\u001a\u00020\u00122\u000e\b\u0002\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00150\u00142\b\b\u0002\u0010\u0016\u001a\u00020\u00172\b\b\u0002\u0010\u0018\u001a\u00020\u0019H\u0007¢\u0006\u0002\u0010\u001a\u001a\r\u0010\u001b\u001a\u00020\u0006H\u0003¢\u0006\u0002\u0010\u001c\u001a\r\u0010\u001d\u001a\u00020\u0006H\u0003¢\u0006\u0002\u0010\u001c\"\u000e\u0010\u0000\u001a\u00020\u0001X\u0082T¢\u0006\u0002\n\u0000\"\u000e\u0010\u0002\u001a\u00020\u0001X\u0082T¢\u0006\u0002\n\u0000¨\u0006\u001e²\u0006\n\u0010\u001f\u001a\u00020\u0012X\u008a\u008e\u0002²\u0006\n\u0010 \u001a\u00020\bX\u008a\u008e\u0002²\u0006\n\u0010 \u001a\u00020\bX\u008a\u008e\u0002²\u0006\n\u0010!\u001a\u00020\u0012X\u008a\u008e\u0002²\u0006\n\u0010\"\u001a\u00020\bX\u008a\u008e\u0002²\u0006\n\u0010#\u001a\u00020\u0012X\u008a\u008e\u0002"}, d2 = {"MaxLines", "", "MinLines", "toPasswordStyle", "Lcom/paypal/pds/components/ContextualAlertStyle;", "PasswordInput", "", com.datadog.android.rum.internal.metric.ViewEndedMetricDispatcher.KEY_VALUE, "", "onValueChange", "Lkotlin/Function1;", "Lkotlin/ParameterName;", "name", "text", "modifier", "Landroidx/compose/ui/Modifier;", "label", "hiddenInitial", "", "alerts", "", "Lcom/paypal/pds/components/textinput/ValidationAlert;", "keyboardOptions", "Landroidx/compose/foundation/text/KeyboardOptions;", "keyboardActions", "Landroidx/compose/foundation/text/KeyboardActions;", "(Ljava/lang/String;Lkotlin/jvm/functions/Function1;Landroidx/compose/ui/Modifier;Ljava/lang/String;ZLjava/util/List;Landroidx/compose/foundation/text/KeyboardOptions;Landroidx/compose/foundation/text/KeyboardActions;Landroidx/compose/runtime/Composer;II)V", "PasswordInputPreview", "(Landroidx/compose/runtime/Composer;I)V", "PasswordInputWithValidationPreview", "pds_release", "hidden", "input", com.paypal.oslo.feature.taptopay.api.analytics.TapToPayAnalytics.Action.SUBMITTED, "confirmInput", "confirmSubmitted"}, k = 2, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes16.dex */
public final class PasswordInputKt {
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:104:0x00b6  */
    /* JADX WARN: Removed duplicated region for block: B:111:0x0098  */
    /* JADX WARN: Removed duplicated region for block: B:118:0x0078  */
    /* JADX WARN: Removed duplicated region for block: B:125:0x005c  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0059  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0075  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0093  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x00b1  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00cf  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00f2  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x00fd  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x026d  */
    /* JADX WARN: Removed duplicated region for block: B:79:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:95:0x0259  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x00f4  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x00d4  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void PasswordInput(final java.lang.String str, final kotlin.jvm.functions.Function1<? super java.lang.String, kotlin.Unit> function1, androidx.compose.ui.Modifier modifier, java.lang.String str2, boolean z, java.util.List<? extends com.paypal.pds.components.textinput.ValidationAlert> list, androidx.compose.foundation.text.KeyboardOptions keyboardOptions, androidx.compose.foundation.text.KeyboardActions keyboardActions, androidx.compose.runtime.Composer composer, final int i, final int i2) {
        int i3;
        java.lang.String str3;
        int i4;
        boolean z2;
        int i5;
        int i6;
        androidx.compose.foundation.text.KeyboardOptions keyboardOptions2;
        int i7;
        androidx.compose.runtime.Composer composer2;
        final androidx.compose.ui.Modifier modifier2;
        final java.util.List<? extends com.paypal.pds.components.textinput.ValidationAlert> list2;
        final androidx.compose.foundation.text.KeyboardActions keyboardActions2;
        final java.lang.String str4;
        final androidx.compose.foundation.text.KeyboardOptions keyboardOptions3;
        final boolean z3;
        androidx.compose.runtime.ScopeUpdateScope endRestartGroup;
        com.paypal.pds.components.textinput.VisualTransformation.None none;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(function1, "");
        androidx.compose.runtime.Composer startRestartGroup = composer.startRestartGroup(-427441962);
        int i8 = (i & 6) == 0 ? (startRestartGroup.changed(str) ? 4 : 2) | i : i;
        if ((i & 48) == 0) {
            i8 |= startRestartGroup.changedInstance(function1) ? 32 : 16;
        }
        int i9 = i2 & 4;
        if (i9 != 0) {
            i8 |= 384;
        } else if ((i & 384) == 0) {
            i8 |= startRestartGroup.changed(modifier) ? 256 : 128;
            i3 = i2 & 8;
            if (i3 == 0) {
                i8 |= 3072;
            } else if ((i & 3072) == 0) {
                str3 = str2;
                i8 |= startRestartGroup.changed(str3) ? 2048 : 1024;
                i4 = i2 & 16;
                if (i4 != 0) {
                    i8 |= 24576;
                } else if ((i & 24576) == 0) {
                    z2 = z;
                    i8 |= startRestartGroup.changed(z2) ? 16384 : 8192;
                    i5 = i2 & 32;
                    if (i5 == 0) {
                        i8 |= androidx.profileinstaller.ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE;
                    } else if ((i & androidx.profileinstaller.ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE) == 0) {
                        i8 |= startRestartGroup.changedInstance(list) ? 131072 : 65536;
                    }
                    i6 = i2 & 64;
                    if (i6 == 0) {
                        i8 |= 1572864;
                        keyboardOptions2 = keyboardOptions;
                    } else {
                        keyboardOptions2 = keyboardOptions;
                        if ((i & 1572864) == 0) {
                            i8 |= startRestartGroup.changed(keyboardOptions2) ? 1048576 : 524288;
                        }
                    }
                    i7 = i2 & 128;
                    if (i7 == 0) {
                        i8 |= 12582912;
                    } else if ((i & 12582912) == 0) {
                        i8 |= startRestartGroup.changed(keyboardActions) ? 8388608 : 4194304;
                    }
                    if (startRestartGroup.shouldExecute((i8 & 4793491) == 4793490, i8 & 1)) {
                        composer2 = startRestartGroup;
                        composer2.skipToGroupEnd();
                        modifier2 = modifier;
                        list2 = list;
                        keyboardActions2 = keyboardActions;
                        str4 = str3;
                        keyboardOptions3 = keyboardOptions2;
                        z3 = z2;
                    } else {
                        androidx.compose.ui.Modifier modifier3 = i9 != 0 ? androidx.compose.ui.Modifier.INSTANCE : modifier;
                        java.lang.String str5 = i3 != 0 ? null : str3;
                        boolean z4 = i4 != 0 ? true : z2;
                        java.util.List<? extends com.paypal.pds.components.textinput.ValidationAlert> emptyList = i5 != 0 ? kotlin.collections.CollectionsKt.emptyList() : list;
                        androidx.compose.foundation.text.KeyboardOptions keyboardOptions4 = i6 != 0 ? androidx.compose.foundation.text.KeyboardOptions.INSTANCE.getDefault() : keyboardOptions2;
                        androidx.compose.foundation.text.KeyboardActions keyboardActions3 = i7 != 0 ? androidx.compose.foundation.text.KeyboardActions.INSTANCE.getDefault() : keyboardActions;
                        if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                            androidx.compose.runtime.ComposerKt.traceEventStart(-427441962, i8, -1, "com.paypal.pds.components.PasswordInput (PasswordInput.kt:120)");
                        }
                        boolean z5 = (57344 & i8) == 16384;
                        java.lang.Object rememberedValue = startRestartGroup.rememberedValue();
                        if (z5 || rememberedValue == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                            rememberedValue = androidx.compose.runtime.SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(java.lang.Boolean.valueOf(z4), null, 2, null);
                            startRestartGroup.updateRememberedValue(rememberedValue);
                        }
                        final androidx.compose.runtime.MutableState mutableState = (androidx.compose.runtime.MutableState) rememberedValue;
                        final java.lang.String stringResource = androidx.compose.ui.res.StringResources_androidKt.stringResource(com.paypal.pds.R.string.core_pds_password_validation_successful, startRestartGroup, 0);
                        final java.lang.String stringResource2 = androidx.compose.ui.res.StringResources_androidKt.stringResource(com.paypal.pds.R.string.core_pds_password_validation_not_successful, startRestartGroup, 0);
                        boolean changed = startRestartGroup.changed(emptyList);
                        boolean changed2 = startRestartGroup.changed(stringResource);
                        boolean changed3 = startRestartGroup.changed(stringResource2);
                        java.util.ArrayList rememberedValue2 = startRestartGroup.rememberedValue();
                        if ((changed | changed2 | changed3) || rememberedValue2 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                            java.util.List<? extends com.paypal.pds.components.textinput.ValidationAlert> list3 = emptyList;
                            java.util.ArrayList arrayList = new java.util.ArrayList(kotlin.collections.CollectionsKt.collectionSizeOrDefault(list3, 10));
                            for (final com.paypal.pds.components.textinput.ValidationAlert validationAlert : list3) {
                                arrayList.add(com.paypal.pds.components.textinput.ValidationAlert.INSTANCE.invoke(new kotlin.jvm.functions.Function1() { // from class: com.paypal.pds.components.PasswordInputKt$$ExternalSyntheticLambda1
                                    @Override // kotlin.jvm.functions.Function1
                                    public final java.lang.Object invoke(java.lang.Object obj) {
                                        return com.paypal.pds.components.PasswordInputKt.$r8$lambda$UqM9bSy6s203lYOPARnZMMUboqo(com.paypal.pds.components.textinput.ValidationAlert.this, stringResource, stringResource2, (java.lang.String) obj);
                                    }
                                }));
                            }
                            rememberedValue2 = arrayList;
                            startRestartGroup.updateRememberedValue(rememberedValue2);
                        }
                        java.util.List list4 = (java.util.List) rememberedValue2;
                        if (((java.lang.Boolean) mutableState.getValue()).booleanValue()) {
                            none = com.paypal.pds.components.textinput.VisualTransformation.Password.INSTANCE;
                        } else {
                            none = com.paypal.pds.components.textinput.VisualTransformation.None.INSTANCE;
                        }
                        java.util.List<? extends com.paypal.pds.components.textinput.ValidationAlert> list5 = emptyList;
                        composer2 = startRestartGroup;
                        com.paypal.pds.components.TextInputKt.TextInput(str, function1, modifier3, str5, null, null, false, false, keyboardOptions4, null, keyboardActions3, null, false, 3, 1, none, null, list4, false, null, null, androidx.compose.runtime.internal.ComposableLambdaKt.rememberComposableLambda(979052571, true, new kotlin.jvm.functions.Function2() { // from class: com.paypal.pds.components.PasswordInputKt$$ExternalSyntheticLambda2
                            @Override // kotlin.jvm.functions.Function2
                            public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                                return com.paypal.pds.components.PasswordInputKt.$r8$lambda$aqc1IxrygQjCFTB020SFDMbGsJ8(androidx.compose.runtime.MutableState.this, (androidx.compose.runtime.Composer) obj, ((java.lang.Integer) obj2).intValue());
                            }
                        }, startRestartGroup, 54), null, null, composer2, (i8 & 8190) | ((i8 << 6) & 234881024), ((i8 >> 21) & 14) | 27648, 48, 14490352);
                        if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                            androidx.compose.runtime.ComposerKt.traceEventEnd();
                        }
                        modifier2 = modifier3;
                        str4 = str5;
                        z3 = z4;
                        keyboardOptions3 = keyboardOptions4;
                        keyboardActions2 = keyboardActions3;
                        list2 = list5;
                    }
                    endRestartGroup = composer2.endRestartGroup();
                    if (endRestartGroup == null) {
                        endRestartGroup.updateScope(new kotlin.jvm.functions.Function2() { // from class: com.paypal.pds.components.PasswordInputKt$$ExternalSyntheticLambda3
                            @Override // kotlin.jvm.functions.Function2
                            public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                                return com.paypal.pds.components.PasswordInputKt.$r8$lambda$JZBAShqGyqXB_Nhcfb5CdHU03wo(str, function1, modifier2, str4, z3, list2, keyboardOptions3, keyboardActions2, i, i2, (androidx.compose.runtime.Composer) obj, ((java.lang.Integer) obj2).intValue());
                            }
                        });
                        return;
                    }
                    return;
                }
                z2 = z;
                i5 = i2 & 32;
                if (i5 == 0) {
                }
                i6 = i2 & 64;
                if (i6 == 0) {
                }
                i7 = i2 & 128;
                if (i7 == 0) {
                }
                if (startRestartGroup.shouldExecute((i8 & 4793491) == 4793490, i8 & 1)) {
                }
                endRestartGroup = composer2.endRestartGroup();
                if (endRestartGroup == null) {
                }
            }
            str3 = str2;
            i4 = i2 & 16;
            if (i4 != 0) {
            }
            z2 = z;
            i5 = i2 & 32;
            if (i5 == 0) {
            }
            i6 = i2 & 64;
            if (i6 == 0) {
            }
            i7 = i2 & 128;
            if (i7 == 0) {
            }
            if (startRestartGroup.shouldExecute((i8 & 4793491) == 4793490, i8 & 1)) {
            }
            endRestartGroup = composer2.endRestartGroup();
            if (endRestartGroup == null) {
            }
        }
        i3 = i2 & 8;
        if (i3 == 0) {
        }
        str3 = str2;
        i4 = i2 & 16;
        if (i4 != 0) {
        }
        z2 = z;
        i5 = i2 & 32;
        if (i5 == 0) {
        }
        i6 = i2 & 64;
        if (i6 == 0) {
        }
        i7 = i2 & 128;
        if (i7 == 0) {
        }
        if (startRestartGroup.shouldExecute((i8 & 4793491) == 4793490, i8 & 1)) {
        }
        endRestartGroup = composer2.endRestartGroup();
        if (endRestartGroup == null) {
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ kotlin.Unit $r8$lambda$7rWxDhUXWCT76Up25EyBfwne0EQ(int i, androidx.compose.runtime.Composer composer, int i2) {
        java.lang.String str;
        final int updateChangedFlags = androidx.compose.runtime.RecomposeScopeImplKt.updateChangedFlags(i | 1);
        androidx.compose.runtime.Composer startRestartGroup = composer.startRestartGroup(1490251418);
        java.lang.Boolean bool = java.lang.Boolean.FALSE;
        if (!startRestartGroup.shouldExecute(updateChangedFlags != 0, updateChangedFlags & 1)) {
            startRestartGroup.skipToGroupEnd();
        } else {
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventStart(1490251418, updateChangedFlags, -1, "com.paypal.pds.components.PasswordInputWithValidationPreview (PasswordInput.kt:204)");
            }
            java.lang.Object rememberedValue = startRestartGroup.rememberedValue();
            if (rememberedValue == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                rememberedValue = androidx.compose.runtime.SnapshotStateKt__SnapshotStateKt.mutableStateOf$default("", null, 2, null);
                startRestartGroup.updateRememberedValue(rememberedValue);
            }
            final androidx.compose.runtime.MutableState mutableState = (androidx.compose.runtime.MutableState) rememberedValue;
            java.lang.Object rememberedValue2 = startRestartGroup.rememberedValue();
            if (rememberedValue2 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                rememberedValue2 = androidx.compose.runtime.SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(bool, null, 2, null);
                startRestartGroup.updateRememberedValue(rememberedValue2);
            }
            final androidx.compose.runtime.MutableState mutableState2 = (androidx.compose.runtime.MutableState) rememberedValue2;
            java.lang.Object rememberedValue3 = startRestartGroup.rememberedValue();
            if (rememberedValue3 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                rememberedValue3 = androidx.compose.runtime.SnapshotStateKt__SnapshotStateKt.mutableStateOf$default("", null, 2, null);
                startRestartGroup.updateRememberedValue(rememberedValue3);
            }
            final androidx.compose.runtime.MutableState mutableState3 = (androidx.compose.runtime.MutableState) rememberedValue3;
            java.lang.Object rememberedValue4 = startRestartGroup.rememberedValue();
            if (rememberedValue4 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                rememberedValue4 = androidx.compose.runtime.SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(bool, null, 2, null);
                startRestartGroup.updateRememberedValue(rememberedValue4);
            }
            final androidx.compose.runtime.MutableState mutableState4 = (androidx.compose.runtime.MutableState) rememberedValue4;
            final androidx.compose.ui.focus.FocusManager focusManager = (androidx.compose.ui.focus.FocusManager) startRestartGroup.consume(androidx.compose.ui.platform.CompositionLocalsKt.getLocalFocusManager());
            java.lang.Object rememberedValue5 = startRestartGroup.rememberedValue();
            if (rememberedValue5 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                rememberedValue5 = new androidx.compose.ui.focus.FocusRequester();
                startRestartGroup.updateRememberedValue(rememberedValue5);
            }
            final androidx.compose.ui.focus.FocusRequester focusRequester = (androidx.compose.ui.focus.FocusRequester) rememberedValue5;
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
            java.lang.String str2 = (java.lang.String) mutableState.getValue();
            androidx.compose.foundation.text.KeyboardOptions keyboardOptions = new androidx.compose.foundation.text.KeyboardOptions(0, (java.lang.Boolean) null, 0, androidx.compose.ui.text.input.ImeAction.INSTANCE.m8216getNexteUduSuo(), (androidx.compose.ui.text.input.PlatformImeOptions) null, (java.lang.Boolean) null, (androidx.compose.ui.text.intl.LocaleList) null, 119, (kotlin.jvm.internal.DefaultConstructorMarker) null);
            java.lang.Object rememberedValue6 = startRestartGroup.rememberedValue();
            if (rememberedValue6 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                rememberedValue6 = new kotlin.jvm.functions.Function1() { // from class: com.paypal.pds.components.PasswordInputKt$$ExternalSyntheticLambda0
                    @Override // kotlin.jvm.functions.Function1
                    public final java.lang.Object invoke(java.lang.Object obj) {
                        return com.paypal.pds.components.PasswordInputKt.m21978$r8$lambda$VoYN7gi0u2nWbQccSdtblj1ZjE(androidx.compose.ui.focus.FocusRequester.this, mutableState2, (androidx.compose.foundation.text.KeyboardActionScope) obj);
                    }
                };
                startRestartGroup.updateRememberedValue(rememberedValue6);
            }
            androidx.compose.foundation.text.KeyboardActions keyboardActions = new androidx.compose.foundation.text.KeyboardActions(null, null, (kotlin.jvm.functions.Function1) rememberedValue6, null, null, null, 59, null);
            boolean changed = startRestartGroup.changed(((java.lang.Boolean) mutableState2.getValue()).booleanValue());
            java.lang.Object rememberedValue7 = startRestartGroup.rememberedValue();
            final java.lang.String str3 = "Password must be at least 10 characters";
            if (changed || rememberedValue7 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                str = "Password must be at least 10 characters";
                rememberedValue7 = kotlin.collections.CollectionsKt.listOf((java.lang.Object[]) new com.paypal.pds.components.textinput.ValidationAlert[]{com.paypal.pds.components.textinput.ValidationAlert.INSTANCE.invoke(new kotlin.jvm.functions.Function1() { // from class: com.paypal.pds.components.PasswordInputKt$$ExternalSyntheticLambda9
                    @Override // kotlin.jvm.functions.Function1
                    public final java.lang.Object invoke(java.lang.Object obj) {
                        return com.paypal.pds.components.PasswordInputKt.$r8$lambda$RqEq1Zx1tG_w__BeY5LE_Bpb3Qs(str3, mutableState2, (java.lang.String) obj);
                    }
                }), com.paypal.pds.components.textinput.ValidationAlert.INSTANCE.invoke(new kotlin.jvm.functions.Function1() { // from class: com.paypal.pds.components.PasswordInputKt$$ExternalSyntheticLambda10
                    @Override // kotlin.jvm.functions.Function1
                    public final java.lang.Object invoke(java.lang.Object obj) {
                        return com.paypal.pds.components.PasswordInputKt.m21977$r8$lambda$UxBa6kHx1rzkJRrwTiGQ7QDZAc(androidx.compose.runtime.MutableState.this, (java.lang.String) obj);
                    }
                }), com.paypal.pds.components.textinput.ValidationAlert.INSTANCE.invoke(new kotlin.jvm.functions.Function1() { // from class: com.paypal.pds.components.PasswordInputKt$$ExternalSyntheticLambda11
                    @Override // kotlin.jvm.functions.Function1
                    public final java.lang.Object invoke(java.lang.Object obj) {
                        return com.paypal.pds.components.PasswordInputKt.$r8$lambda$TPJkBUXHcmTAXU_T9U602_6vmVE(androidx.compose.runtime.MutableState.this, (java.lang.String) obj);
                    }
                }), com.paypal.pds.components.textinput.ValidationAlert.INSTANCE.invoke(new kotlin.jvm.functions.Function1() { // from class: com.paypal.pds.components.PasswordInputKt$$ExternalSyntheticLambda12
                    @Override // kotlin.jvm.functions.Function1
                    public final java.lang.Object invoke(java.lang.Object obj) {
                        return com.paypal.pds.components.PasswordInputKt.$r8$lambda$Uur8AO2YoIzGxoejfbZ9_QZJqTE(androidx.compose.runtime.MutableState.this, (java.lang.String) obj);
                    }
                })});
                startRestartGroup.updateRememberedValue(rememberedValue7);
            } else {
                str = "Password must be at least 10 characters";
            }
            java.util.List list = (java.util.List) rememberedValue7;
            java.lang.Object rememberedValue8 = startRestartGroup.rememberedValue();
            if (rememberedValue8 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                rememberedValue8 = new kotlin.jvm.functions.Function1() { // from class: com.paypal.pds.components.PasswordInputKt$$ExternalSyntheticLambda13
                    @Override // kotlin.jvm.functions.Function1
                    public final java.lang.Object invoke(java.lang.Object obj) {
                        return com.paypal.pds.components.PasswordInputKt.$r8$lambda$nNvFVYYgqTW5TJtJA6mW7G6Y6Zw(androidx.compose.runtime.MutableState.this, mutableState, (java.lang.String) obj);
                    }
                };
                startRestartGroup.updateRememberedValue(rememberedValue8);
            }
            final java.lang.String str4 = str;
            PasswordInput(str2, (kotlin.jvm.functions.Function1) rememberedValue8, null, "Password", false, list, keyboardOptions, keyboardActions, startRestartGroup, 1575984, 20);
            androidx.compose.foundation.layout.SpacerKt.Spacer(androidx.compose.foundation.layout.SizeKt.m1726height3ABfNKs(androidx.compose.ui.Modifier.INSTANCE, com.paypal.pds.core.ConstantsKt.getSpacing16()), startRestartGroup, 6);
            java.lang.String str5 = (java.lang.String) mutableState3.getValue();
            androidx.compose.ui.Modifier focusRequester2 = androidx.compose.ui.focus.FocusRequesterModifierKt.focusRequester(androidx.compose.ui.Modifier.INSTANCE, focusRequester);
            androidx.compose.foundation.text.KeyboardOptions keyboardOptions2 = new androidx.compose.foundation.text.KeyboardOptions(0, (java.lang.Boolean) null, 0, androidx.compose.ui.text.input.ImeAction.INSTANCE.m8214getDoneeUduSuo(), (androidx.compose.ui.text.input.PlatformImeOptions) null, (java.lang.Boolean) null, (androidx.compose.ui.text.intl.LocaleList) null, 119, (kotlin.jvm.internal.DefaultConstructorMarker) null);
            boolean changedInstance = startRestartGroup.changedInstance(focusManager);
            java.lang.Object rememberedValue9 = startRestartGroup.rememberedValue();
            if (changedInstance || rememberedValue9 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                rememberedValue9 = new kotlin.jvm.functions.Function1() { // from class: com.paypal.pds.components.PasswordInputKt$$ExternalSyntheticLambda14
                    @Override // kotlin.jvm.functions.Function1
                    public final java.lang.Object invoke(java.lang.Object obj) {
                        return com.paypal.pds.components.PasswordInputKt.$r8$lambda$sdSppbDpLo5Ce8x4CRdJ19v8pCg(androidx.compose.ui.focus.FocusManager.this, mutableState4, (androidx.compose.foundation.text.KeyboardActionScope) obj);
                    }
                };
                startRestartGroup.updateRememberedValue(rememberedValue9);
            }
            androidx.compose.foundation.text.KeyboardActions keyboardActions2 = new androidx.compose.foundation.text.KeyboardActions((kotlin.jvm.functions.Function1) rememberedValue9, null, null, null, null, null, 62, null);
            boolean changed2 = startRestartGroup.changed(((java.lang.Boolean) mutableState4.getValue()).booleanValue());
            java.lang.Object rememberedValue10 = startRestartGroup.rememberedValue();
            if (changed2 || rememberedValue10 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                rememberedValue10 = kotlin.collections.CollectionsKt.listOf(com.paypal.pds.components.textinput.ValidationAlert.INSTANCE.invoke(new kotlin.jvm.functions.Function1() { // from class: com.paypal.pds.components.PasswordInputKt$$ExternalSyntheticLambda15
                    @Override // kotlin.jvm.functions.Function1
                    public final java.lang.Object invoke(java.lang.Object obj) {
                        return com.paypal.pds.components.PasswordInputKt.m21976$r8$lambda$DLQeGIMA_XY308Zr0SCBHK1no(str4, mutableState4, (java.lang.String) obj);
                    }
                }));
                startRestartGroup.updateRememberedValue(rememberedValue10);
            }
            java.util.List list2 = (java.util.List) rememberedValue10;
            java.lang.Object rememberedValue11 = startRestartGroup.rememberedValue();
            if (rememberedValue11 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                rememberedValue11 = new kotlin.jvm.functions.Function1() { // from class: com.paypal.pds.components.PasswordInputKt$$ExternalSyntheticLambda16
                    @Override // kotlin.jvm.functions.Function1
                    public final java.lang.Object invoke(java.lang.Object obj) {
                        return com.paypal.pds.components.PasswordInputKt.m21979$r8$lambda$_2IeXczNWMIhF6IPbRuYH5PCmo(androidx.compose.runtime.MutableState.this, mutableState3, (java.lang.String) obj);
                    }
                };
                startRestartGroup.updateRememberedValue(rememberedValue11);
            }
            PasswordInput(str5, (kotlin.jvm.functions.Function1) rememberedValue11, focusRequester2, "Confirm Password", false, list2, keyboardOptions2, keyboardActions2, startRestartGroup, 1575984, 16);
            startRestartGroup.endNode();
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventEnd();
            }
        }
        androidx.compose.runtime.ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new kotlin.jvm.functions.Function2() { // from class: com.paypal.pds.components.PasswordInputKt$$ExternalSyntheticLambda17
                @Override // kotlin.jvm.functions.Function2
                public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                    return com.paypal.pds.components.PasswordInputKt.$r8$lambda$7rWxDhUXWCT76Up25EyBfwne0EQ(updateChangedFlags, (androidx.compose.runtime.Composer) obj, ((java.lang.Integer) obj2).intValue());
                }
            });
        }
        return kotlin.Unit.INSTANCE;
    }

    /* renamed from: $r8$lambda$9JYHxKgxaGgmfGZETK-Kgcsct-g, reason: not valid java name */
    public static /* synthetic */ com.paypal.pds.components.textinput.ValidationAlertData m21975$r8$lambda$9JYHxKgxaGgmfGZETKKgcsctg(java.lang.String str) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
        return new com.paypal.pds.components.textinput.ValidationAlertData("Password must be at least 8 characters", com.paypal.pds.components.ContextualAlertStyle.Positive.INSTANCE, false, null, null, 28, null);
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$CtKzxSHyYHKjgpfBMV11c5pHQ8s(androidx.compose.runtime.MutableState mutableState, java.lang.String str) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
        mutableState.setValue(str);
        return kotlin.Unit.INSTANCE;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: $r8$lambda$DLQeGIM--A_XY308Zr0SCBHK1no, reason: not valid java name */
    public static /* synthetic */ com.paypal.pds.components.textinput.ValidationAlertData m21976$r8$lambda$DLQeGIMA_XY308Zr0SCBHK1no(java.lang.String str, androidx.compose.runtime.MutableState mutableState, java.lang.String str2) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str2, "");
        return new com.paypal.pds.components.textinput.ValidationAlertData(str, str2.length() >= 10 ? com.paypal.pds.components.ContextualAlertStyle.Positive.INSTANCE : ((java.lang.Boolean) mutableState.getValue()).booleanValue() ? com.paypal.pds.components.ContextualAlertStyle.Negative.INSTANCE : com.paypal.pds.components.ContextualAlertStyle.Neutral.INSTANCE, false, null, null, 28, null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ kotlin.Unit $r8$lambda$EKYGxsLRRc0x0YLsSJcS9Qj4F6g(androidx.compose.runtime.MutableState mutableState) {
        mutableState.setValue(java.lang.Boolean.valueOf(!((java.lang.Boolean) mutableState.getValue()).booleanValue()));
        return kotlin.Unit.INSTANCE;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ kotlin.Unit $r8$lambda$G5Hsv3zhAFJ6Avujfo2be_W64rI(int i, androidx.compose.runtime.Composer composer, int i2) {
        final int updateChangedFlags = androidx.compose.runtime.RecomposeScopeImplKt.updateChangedFlags(i | 1);
        androidx.compose.runtime.Composer startRestartGroup = composer.startRestartGroup(1416837881);
        if (!startRestartGroup.shouldExecute(updateChangedFlags != 0, updateChangedFlags & 1)) {
            startRestartGroup.skipToGroupEnd();
        } else {
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventStart(1416837881, updateChangedFlags, -1, "com.paypal.pds.components.PasswordInputPreview (PasswordInput.kt:178)");
            }
            java.lang.Object rememberedValue = startRestartGroup.rememberedValue();
            if (rememberedValue == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                rememberedValue = androidx.compose.runtime.SnapshotStateKt__SnapshotStateKt.mutableStateOf$default("text", null, 2, null);
                startRestartGroup.updateRememberedValue(rememberedValue);
            }
            final androidx.compose.runtime.MutableState mutableState = (androidx.compose.runtime.MutableState) rememberedValue;
            java.lang.String str = (java.lang.String) mutableState.getValue();
            com.paypal.pds.components.textinput.ValidationAlert[] validationAlertArr = new com.paypal.pds.components.textinput.ValidationAlert[2];
            com.paypal.pds.components.textinput.ValidationAlert.Companion companion = com.paypal.pds.components.textinput.ValidationAlert.INSTANCE;
            java.lang.Object rememberedValue2 = startRestartGroup.rememberedValue();
            if (rememberedValue2 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                rememberedValue2 = new kotlin.jvm.functions.Function1() { // from class: com.paypal.pds.components.PasswordInputKt$$ExternalSyntheticLambda5
                    @Override // kotlin.jvm.functions.Function1
                    public final java.lang.Object invoke(java.lang.Object obj) {
                        return com.paypal.pds.components.PasswordInputKt.m21975$r8$lambda$9JYHxKgxaGgmfGZETKKgcsctg((java.lang.String) obj);
                    }
                };
                startRestartGroup.updateRememberedValue(rememberedValue2);
            }
            validationAlertArr[0] = companion.invoke((kotlin.jvm.functions.Function1) rememberedValue2);
            com.paypal.pds.components.textinput.ValidationAlert.Companion companion2 = com.paypal.pds.components.textinput.ValidationAlert.INSTANCE;
            java.lang.Object rememberedValue3 = startRestartGroup.rememberedValue();
            if (rememberedValue3 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                rememberedValue3 = new kotlin.jvm.functions.Function1() { // from class: com.paypal.pds.components.PasswordInputKt$$ExternalSyntheticLambda6
                    @Override // kotlin.jvm.functions.Function1
                    public final java.lang.Object invoke(java.lang.Object obj) {
                        return com.paypal.pds.components.PasswordInputKt.$r8$lambda$_cMnIHFalHCANf6_UPZQ4Zvhfok((java.lang.String) obj);
                    }
                };
                startRestartGroup.updateRememberedValue(rememberedValue3);
            }
            validationAlertArr[1] = companion2.invoke((kotlin.jvm.functions.Function1) rememberedValue3);
            java.util.List listOf = kotlin.collections.CollectionsKt.listOf((java.lang.Object[]) validationAlertArr);
            java.lang.Object rememberedValue4 = startRestartGroup.rememberedValue();
            if (rememberedValue4 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                rememberedValue4 = new kotlin.jvm.functions.Function1() { // from class: com.paypal.pds.components.PasswordInputKt$$ExternalSyntheticLambda7
                    @Override // kotlin.jvm.functions.Function1
                    public final java.lang.Object invoke(java.lang.Object obj) {
                        return com.paypal.pds.components.PasswordInputKt.$r8$lambda$CtKzxSHyYHKjgpfBMV11c5pHQ8s(androidx.compose.runtime.MutableState.this, (java.lang.String) obj);
                    }
                };
                startRestartGroup.updateRememberedValue(rememberedValue4);
            }
            PasswordInput(str, (kotlin.jvm.functions.Function1) rememberedValue4, null, "Password", false, listOf, null, null, startRestartGroup, 3120, com.plaid.internal.EnumC0527g.SDK_ASSET_ICON_OVERRIDE_VALUE);
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventEnd();
            }
        }
        androidx.compose.runtime.ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new kotlin.jvm.functions.Function2() { // from class: com.paypal.pds.components.PasswordInputKt$$ExternalSyntheticLambda8
                @Override // kotlin.jvm.functions.Function2
                public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                    return com.paypal.pds.components.PasswordInputKt.$r8$lambda$G5Hsv3zhAFJ6Avujfo2be_W64rI(updateChangedFlags, (androidx.compose.runtime.Composer) obj, ((java.lang.Integer) obj2).intValue());
                }
            });
        }
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$JZBAShqGyqXB_Nhcfb5CdHU03wo(java.lang.String str, kotlin.jvm.functions.Function1 function1, androidx.compose.ui.Modifier modifier, java.lang.String str2, boolean z, java.util.List list, androidx.compose.foundation.text.KeyboardOptions keyboardOptions, androidx.compose.foundation.text.KeyboardActions keyboardActions, int i, int i2, androidx.compose.runtime.Composer composer, int i3) {
        PasswordInput(str, function1, modifier, str2, z, list, keyboardOptions, keyboardActions, composer, androidx.compose.runtime.RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
        return kotlin.Unit.INSTANCE;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ com.paypal.pds.components.textinput.ValidationAlertData $r8$lambda$RqEq1Zx1tG_w__BeY5LE_Bpb3Qs(java.lang.String str, androidx.compose.runtime.MutableState mutableState, java.lang.String str2) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str2, "");
        return new com.paypal.pds.components.textinput.ValidationAlertData(str, str2.length() >= 10 ? com.paypal.pds.components.ContextualAlertStyle.Positive.INSTANCE : ((java.lang.Boolean) mutableState.getValue()).booleanValue() ? com.paypal.pds.components.ContextualAlertStyle.Negative.INSTANCE : com.paypal.pds.components.ContextualAlertStyle.Neutral.INSTANCE, false, null, null, 28, null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ com.paypal.pds.components.textinput.ValidationAlertData $r8$lambda$TPJkBUXHcmTAXU_T9U602_6vmVE(androidx.compose.runtime.MutableState mutableState, java.lang.String str) {
        com.paypal.pds.components.ContextualAlertStyle.Neutral neutral;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
        java.lang.String str2 = str;
        int i = 0;
        while (true) {
            if (i >= str2.length()) {
                neutral = ((java.lang.Boolean) mutableState.getValue()).booleanValue() ? com.paypal.pds.components.ContextualAlertStyle.Negative.INSTANCE : com.paypal.pds.components.ContextualAlertStyle.Neutral.INSTANCE;
            } else {
                if (java.lang.Character.isDigit(str2.charAt(i))) {
                    neutral = com.paypal.pds.components.ContextualAlertStyle.Positive.INSTANCE;
                    break;
                }
                i++;
            }
        }
        return new com.paypal.pds.components.textinput.ValidationAlertData("Password contains a number", neutral, false, null, null, 28, null);
    }

    public static /* synthetic */ com.paypal.pds.components.textinput.ValidationAlertData $r8$lambda$UqM9bSy6s203lYOPARnZMMUboqo(com.paypal.pds.components.textinput.ValidationAlert validationAlert, java.lang.String str, java.lang.String str2, java.lang.String str3) {
        java.lang.String text;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str3, "");
        com.paypal.pds.components.textinput.ValidationAlertData validate = validationAlert.validate(str3);
        if (validate == null) {
            return null;
        }
        com.paypal.pds.components.PasswordNeutral style = validate.getStyle();
        if (kotlin.jvm.internal.Intrinsics.areEqual(style, com.paypal.pds.components.ContextualAlertStyle.Positive.INSTANCE)) {
            style = com.paypal.pds.components.PasswordPositive.INSTANCE;
        } else if (kotlin.jvm.internal.Intrinsics.areEqual(style, com.paypal.pds.components.ContextualAlertStyle.Neutral.INSTANCE)) {
            style = com.paypal.pds.components.PasswordNeutral.INSTANCE;
        }
        com.paypal.pds.components.ContextualAlertStyle contextualAlertStyle = style;
        com.paypal.pds.components.ContextualAlertStyle style2 = validate.getStyle();
        if (kotlin.jvm.internal.Intrinsics.areEqual(style2, com.paypal.pds.components.ContextualAlertStyle.Positive.INSTANCE)) {
            text = java.lang.String.format(str, java.util.Arrays.copyOf(new java.lang.Object[]{validate.getText()}, 1));
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(text, "");
        } else if (kotlin.jvm.internal.Intrinsics.areEqual(style2, com.paypal.pds.components.ContextualAlertStyle.Negative.INSTANCE)) {
            text = java.lang.String.format(str2, java.util.Arrays.copyOf(new java.lang.Object[]{validate.getText()}, 1));
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(text, "");
        } else {
            text = validate.getText();
        }
        return com.paypal.pds.components.textinput.ValidationAlertData.m22091copyGSEOPJw$default(validate, null, contextualAlertStyle, false, text, androidx.compose.ui.semantics.LiveRegionMode.m7784boximpl(androidx.compose.ui.semantics.LiveRegionMode.INSTANCE.m7791getPolite0phEisY()), 5, null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ com.paypal.pds.components.textinput.ValidationAlertData $r8$lambda$Uur8AO2YoIzGxoejfbZ9_QZJqTE(androidx.compose.runtime.MutableState mutableState, java.lang.String str) {
        com.paypal.pds.components.ContextualAlertStyle.Neutral neutral;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
        java.lang.String str2 = str;
        int i = 0;
        while (true) {
            if (i >= str2.length()) {
                neutral = ((java.lang.Boolean) mutableState.getValue()).booleanValue() ? com.paypal.pds.components.ContextualAlertStyle.Negative.INSTANCE : com.paypal.pds.components.ContextualAlertStyle.Neutral.INSTANCE;
            } else {
                if (!java.lang.Character.isLetterOrDigit(str2.charAt(i))) {
                    neutral = com.paypal.pds.components.ContextualAlertStyle.Positive.INSTANCE;
                    break;
                }
                i++;
            }
        }
        return new com.paypal.pds.components.textinput.ValidationAlertData("Password should contain special character", neutral, false, null, null, 28, null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: $r8$lambda$UxBa6kHx1rzkJRr-wTiGQ7QDZAc, reason: not valid java name */
    public static /* synthetic */ com.paypal.pds.components.textinput.ValidationAlertData m21977$r8$lambda$UxBa6kHx1rzkJRrwTiGQ7QDZAc(androidx.compose.runtime.MutableState mutableState, java.lang.String str) {
        com.paypal.pds.components.ContextualAlertStyle.Neutral neutral;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
        java.lang.String str2 = str;
        int i = 0;
        while (true) {
            if (i >= str2.length()) {
                neutral = ((java.lang.Boolean) mutableState.getValue()).booleanValue() ? com.paypal.pds.components.ContextualAlertStyle.Negative.INSTANCE : com.paypal.pds.components.ContextualAlertStyle.Neutral.INSTANCE;
            } else {
                if (java.lang.Character.isUpperCase(str2.charAt(i))) {
                    neutral = com.paypal.pds.components.ContextualAlertStyle.Positive.INSTANCE;
                    break;
                }
                i++;
            }
        }
        return new com.paypal.pds.components.textinput.ValidationAlertData("Password must contain at least one uppercase letter", neutral, false, null, null, 28, null);
    }

    /* renamed from: $r8$lambda$VoYN7gi0u2nWbQccSd-tblj1ZjE, reason: not valid java name */
    public static /* synthetic */ kotlin.Unit m21978$r8$lambda$VoYN7gi0u2nWbQccSdtblj1ZjE(androidx.compose.ui.focus.FocusRequester focusRequester, androidx.compose.runtime.MutableState mutableState, androidx.compose.foundation.text.KeyboardActionScope keyboardActionScope) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(keyboardActionScope, "");
        mutableState.setValue(java.lang.Boolean.TRUE);
        androidx.compose.ui.focus.FocusRequester.m5670requestFocus3ESFkO8$default(focusRequester, 0, 1, null);
        return kotlin.Unit.INSTANCE;
    }

    /* renamed from: $r8$lambda$_2I-eXczNWMIhF6IPbRuYH5PCmo, reason: not valid java name */
    public static /* synthetic */ kotlin.Unit m21979$r8$lambda$_2IeXczNWMIhF6IPbRuYH5PCmo(androidx.compose.runtime.MutableState mutableState, androidx.compose.runtime.MutableState mutableState2, java.lang.String str) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
        mutableState.setValue(java.lang.Boolean.FALSE);
        mutableState2.setValue(str);
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ com.paypal.pds.components.textinput.ValidationAlertData $r8$lambda$_cMnIHFalHCANf6_UPZQ4Zvhfok(java.lang.String str) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
        return new com.paypal.pds.components.textinput.ValidationAlertData("Password must contain uppercase letters", com.paypal.pds.components.ContextualAlertStyle.Neutral.INSTANCE, false, null, null, 28, null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ kotlin.Unit $r8$lambda$aqc1IxrygQjCFTB020SFDMbGsJ8(final androidx.compose.runtime.MutableState mutableState, androidx.compose.runtime.Composer composer, int i) {
        if (composer.shouldExecute((i & 3) != 2, i & 1)) {
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventStart(979052571, i, -1, "com.paypal.pds.components.PasswordInput.<anonymous> (PasswordInput.kt:154)");
            }
            kotlin.Pair pair = ((java.lang.Boolean) mutableState.getValue()).booleanValue() ? kotlin.TuplesKt.to(com.paypal.pds.core.Icon.Eye.INSTANCE, com.paypal.pds.utils.TestTagKt.TestTag_PasswordInput_IconButton_View) : kotlin.TuplesKt.to(com.paypal.pds.core.Icon.EyeSlash.INSTANCE, com.paypal.pds.utils.TestTagKt.TestTag_PasswordInput_IconButton_Hide);
            com.paypal.pds.core.Icon icon = (com.paypal.pds.core.Icon) pair.component1();
            androidx.compose.ui.Modifier testTag = androidx.compose.ui.platform.TestTagKt.testTag(androidx.compose.ui.Modifier.INSTANCE, (java.lang.String) pair.component2());
            com.paypal.pds.components.ButtonStyle.Tertiary tertiary = com.paypal.pds.components.ButtonStyle.Tertiary.INSTANCE;
            boolean changed = composer.changed(mutableState);
            java.lang.Object rememberedValue = composer.rememberedValue();
            if (changed || rememberedValue == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                rememberedValue = new kotlin.jvm.functions.Function0() { // from class: com.paypal.pds.components.PasswordInputKt$$ExternalSyntheticLambda4
                    @Override // kotlin.jvm.functions.Function0
                    public final java.lang.Object invoke() {
                        return com.paypal.pds.components.PasswordInputKt.$r8$lambda$EKYGxsLRRc0x0YLsSJcS9Qj4F6g(androidx.compose.runtime.MutableState.this);
                    }
                };
                composer.updateRememberedValue(rememberedValue);
            }
            com.paypal.pds.components.IconButtonKt.IconButton(icon, (kotlin.jvm.functions.Function0) rememberedValue, testTag, tertiary, null, null, null, false, false, composer, 3072, 496);
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventEnd();
            }
        } else {
            composer.skipToGroupEnd();
        }
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$nNvFVYYgqTW5TJtJA6mW7G6Y6Zw(androidx.compose.runtime.MutableState mutableState, androidx.compose.runtime.MutableState mutableState2, java.lang.String str) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
        mutableState.setValue(java.lang.Boolean.FALSE);
        mutableState2.setValue(str);
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$sdSppbDpLo5Ce8x4CRdJ19v8pCg(androidx.compose.ui.focus.FocusManager focusManager, androidx.compose.runtime.MutableState mutableState, androidx.compose.foundation.text.KeyboardActionScope keyboardActionScope) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(keyboardActionScope, "");
        mutableState.setValue(java.lang.Boolean.TRUE);
        androidx.compose.ui.focus.FocusManager.clearFocus$default(focusManager, false, 1, null);
        return kotlin.Unit.INSTANCE;
    }
}
