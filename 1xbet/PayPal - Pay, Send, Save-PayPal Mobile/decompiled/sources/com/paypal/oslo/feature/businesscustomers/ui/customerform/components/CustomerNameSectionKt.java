package com.paypal.oslo.feature.businesscustomers.ui.customerform.components;

@kotlin.Metadata(d1 = {"\u0000,\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a9\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0018\u0010\t\u001a\u0014\u0012\n\u0012\b\u0012\u0004\u0012\u00020\f0\u000b\u0012\u0004\u0012\u00020\u00060\n2\b\b\u0002\u0010\r\u001a\u00020\u000eH\u0001¢\u0006\u0002\u0010\u000f\u001a\r\u0010\u0010\u001a\u00020\u0006H\u0001¢\u0006\u0002\u0010\u0011\"\u000e\u0010\u0000\u001a\u00020\u0001X\u0080T¢\u0006\u0002\n\u0000\"\u000e\u0010\u0002\u001a\u00020\u0001X\u0080T¢\u0006\u0002\n\u0000\"\u000e\u0010\u0003\u001a\u00020\u0001X\u0080T¢\u0006\u0002\n\u0000\"\u000e\u0010\u0004\u001a\u00020\u0001X\u0080T¢\u0006\u0002\n\u0000¨\u0006\u0012"}, d2 = {"CustomerNameSectionFullNameInputTestTag", "", "CustomerNameSectionFirstNameInputTestTag", "CustomerNameSectionLastNameInputTestTag", "CustomerNameSectionBusinessNameInputTestTag", "CustomerNameSection", "", "state", "Lcom/paypal/oslo/feature/businesscustomers/ui/model/NameInputState;", "onClearErrors", "Lkotlin/Function1;", "", "Lcom/paypal/oslo/feature/businesscustomers/ui/customerform/CustomerFormError;", "modifier", "Landroidx/compose/ui/Modifier;", "(Lcom/paypal/oslo/feature/businesscustomers/ui/model/NameInputState;Lkotlin/jvm/functions/Function1;Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;II)V", "CustomerNameSectionPreview", "(Landroidx/compose/runtime/Composer;I)V", "business-customers_prodRelease"}, k = 2, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class CustomerNameSectionKt {
    public static final java.lang.String CustomerNameSectionBusinessNameInputTestTag = "CustomerNameSection_BusinessNameInput";
    public static final java.lang.String CustomerNameSectionFirstNameInputTestTag = "CustomerNameSection_FirstNameInput";
    public static final java.lang.String CustomerNameSectionFullNameInputTestTag = "CustomerNameSection_FullNameInput";
    public static final java.lang.String CustomerNameSectionLastNameInputTestTag = "CustomerNameSection_LastNameInput";

    /* JADX WARN: Removed duplicated region for block: B:20:0x005c  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0067  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x010f  */
    /* JADX WARN: Removed duplicated region for block: B:48:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:52:0x0105  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x005e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void CustomerNameSection(final com.paypal.oslo.feature.businesscustomers.ui.model.NameInputState nameInputState, final kotlin.jvm.functions.Function1<? super java.util.List<? extends com.paypal.oslo.feature.businesscustomers.ui.customerform.CustomerFormError>, kotlin.Unit> function1, androidx.compose.ui.Modifier modifier, androidx.compose.runtime.Composer composer, final int i, final int i2) {
        int i3;
        androidx.compose.ui.Modifier modifier2;
        androidx.compose.ui.Modifier modifier3;
        androidx.compose.runtime.ScopeUpdateScope endRestartGroup;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(nameInputState, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(function1, "");
        androidx.compose.runtime.Composer startRestartGroup = composer.startRestartGroup(-497619556);
        if ((i & 6) == 0) {
            i3 = (startRestartGroup.changed(nameInputState) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i & 48) == 0) {
            i3 |= startRestartGroup.changedInstance(function1) ? 32 : 16;
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
                    androidx.compose.runtime.ComposerKt.traceEventStart(-497619556, i3, -1, "com.paypal.oslo.feature.businesscustomers.ui.customerform.components.CustomerNameSection (CustomerNameSection.kt:40)");
                }
                java.lang.String stringResource = androidx.compose.ui.res.StringResources_androidKt.stringResource(com.paypal.oslo.feature.businesscustomers.R.string.feature_business_customers_form_add_business_name_label, startRestartGroup, 0);
                com.paypal.oslo.feature.businesscustomers.ui.utils.TrackedElement.Item item = new com.paypal.oslo.feature.businesscustomers.ui.utils.TrackedElement.Item(com.paypal.oslo.feature.businesscustomers.analytics.UiContextValues.ItemName.CustomerForm.AddBusinessNameButton, null, null, null, 14, null);
                boolean z = (nameInputState.getName().getLastName() == null && nameInputState.getName().getBusinessName() == null) ? false : true;
                com.paypal.oslo.feature.businesscustomers.ui.utils.TrackedElement.Item item2 = item;
                boolean z2 = (i3 & 14) == 4;
                java.lang.Object rememberedValue = startRestartGroup.rememberedValue();
                if (z2 || rememberedValue == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                    rememberedValue = new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.feature.businesscustomers.ui.customerform.components.CustomerNameSectionKt$$ExternalSyntheticLambda0
                        @Override // kotlin.jvm.functions.Function0
                        public final java.lang.Object invoke() {
                            return com.paypal.oslo.feature.businesscustomers.ui.customerform.components.CustomerNameSectionKt.$r8$lambda$YyfjZtOU2Q59h5PkYZLn0i7mbVo(com.paypal.oslo.feature.businesscustomers.ui.model.NameInputState.this);
                        }
                    };
                    startRestartGroup.updateRememberedValue(rememberedValue);
                }
                com.paypal.oslo.feature.businesscustomers.ui.customerform.components.ExpandableInputSectionKt.ExpandableInputSection(stringResource, modifier3, item2, z, (kotlin.jvm.functions.Function0) rememberedValue, androidx.compose.runtime.internal.ComposableLambdaKt.rememberComposableLambda(-186999477, true, new kotlin.jvm.functions.Function3() { // from class: com.paypal.oslo.feature.businesscustomers.ui.customerform.components.CustomerNameSectionKt$$ExternalSyntheticLambda3
                    @Override // kotlin.jvm.functions.Function3
                    public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2, java.lang.Object obj3) {
                        return com.paypal.oslo.feature.businesscustomers.ui.customerform.components.CustomerNameSectionKt.$r8$lambda$RtY8SFeNpTK5mFNSZIgltNi5D10(com.paypal.oslo.feature.businesscustomers.ui.model.NameInputState.this, function1, ((java.lang.Boolean) obj).booleanValue(), (androidx.compose.runtime.Composer) obj2, ((java.lang.Integer) obj3).intValue());
                    }
                }, startRestartGroup, 54), androidx.compose.runtime.internal.ComposableLambdaKt.rememberComposableLambda(-371687682, true, new kotlin.jvm.functions.Function2() { // from class: com.paypal.oslo.feature.businesscustomers.ui.customerform.components.CustomerNameSectionKt$$ExternalSyntheticLambda4
                    @Override // kotlin.jvm.functions.Function2
                    public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                        return com.paypal.oslo.feature.businesscustomers.ui.customerform.components.CustomerNameSectionKt.m12794$r8$lambda$JfboIccymmR6oNhwPnLgdl7IoY(com.paypal.oslo.feature.businesscustomers.ui.model.NameInputState.this, function1, (androidx.compose.runtime.Composer) obj, ((java.lang.Integer) obj2).intValue());
                    }
                }, startRestartGroup, 54), startRestartGroup, ((i3 >> 3) & 112) | 1769472, 0);
                if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                    androidx.compose.runtime.ComposerKt.traceEventEnd();
                }
            }
            endRestartGroup = startRestartGroup.endRestartGroup();
            if (endRestartGroup == null) {
                final androidx.compose.ui.Modifier modifier4 = modifier3;
                endRestartGroup.updateScope(new kotlin.jvm.functions.Function2() { // from class: com.paypal.oslo.feature.businesscustomers.ui.customerform.components.CustomerNameSectionKt$$ExternalSyntheticLambda5
                    @Override // kotlin.jvm.functions.Function2
                    public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                        return com.paypal.oslo.feature.businesscustomers.ui.customerform.components.CustomerNameSectionKt.$r8$lambda$hFn_4gT0mIVCb63sXr55OTKorys(com.paypal.oslo.feature.businesscustomers.ui.model.NameInputState.this, function1, modifier4, i, i2, (androidx.compose.runtime.Composer) obj, ((java.lang.Integer) obj2).intValue());
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

    public static final void CustomerNameSectionPreview(androidx.compose.runtime.Composer composer, final int i) {
        androidx.compose.runtime.Composer startRestartGroup = composer.startRestartGroup(537401024);
        if (!startRestartGroup.shouldExecute(i != 0, i & 1)) {
            startRestartGroup.skipToGroupEnd();
        } else {
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventStart(537401024, i, -1, "com.paypal.oslo.feature.businesscustomers.ui.customerform.components.CustomerNameSectionPreview (CustomerNameSection.kt:91)");
            }
            androidx.compose.ui.Modifier background = com.paypal.pds.core.ModifierExtensionsKt.background((androidx.compose.ui.Modifier) androidx.compose.ui.Modifier.INSTANCE, (com.paypal.pds.core.Color) com.paypal.pds.core.Color.BackgroundBase.INSTANCE, (androidx.compose.ui.graphics.Shape) null, startRestartGroup, 54, 2);
            java.lang.Object rememberedValue = startRestartGroup.rememberedValue();
            if (rememberedValue == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                rememberedValue = new com.paypal.oslo.feature.businesscustomers.ui.model.NameInputState(null, 1, null);
                startRestartGroup.updateRememberedValue(rememberedValue);
            }
            com.paypal.oslo.feature.businesscustomers.ui.model.NameInputState nameInputState = (com.paypal.oslo.feature.businesscustomers.ui.model.NameInputState) rememberedValue;
            java.lang.Object rememberedValue2 = startRestartGroup.rememberedValue();
            if (rememberedValue2 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                rememberedValue2 = new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.businesscustomers.ui.customerform.components.CustomerNameSectionKt$$ExternalSyntheticLambda10
                    @Override // kotlin.jvm.functions.Function1
                    public final java.lang.Object invoke(java.lang.Object obj) {
                        return com.paypal.oslo.feature.businesscustomers.ui.customerform.components.CustomerNameSectionKt.$r8$lambda$7_OoGZ8tzbdBnX_VXgeOIgR2VuE((java.util.List) obj);
                    }
                };
                startRestartGroup.updateRememberedValue(rememberedValue2);
            }
            CustomerNameSection(nameInputState, (kotlin.jvm.functions.Function1) rememberedValue2, background, startRestartGroup, 54, 0);
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventEnd();
            }
        }
        androidx.compose.runtime.ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new kotlin.jvm.functions.Function2() { // from class: com.paypal.oslo.feature.businesscustomers.ui.customerform.components.CustomerNameSectionKt$$ExternalSyntheticLambda11
                @Override // kotlin.jvm.functions.Function2
                public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                    return com.paypal.oslo.feature.businesscustomers.ui.customerform.components.CustomerNameSectionKt.$r8$lambda$ng5tqDgdxa81vXLDwiBrtf4Ydxc(i, (androidx.compose.runtime.Composer) obj, ((java.lang.Integer) obj2).intValue());
                }
            });
        }
    }

    public static /* synthetic */ com.paypal.oslo.feature.businesscustomers.ui.model.NameFields $r8$lambda$4Z6gazlX15i8JnG2qEpnapjF7Jc(java.lang.String str, com.paypal.oslo.feature.businesscustomers.ui.model.NameFields nameFields) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(nameFields, "");
        return com.paypal.oslo.feature.businesscustomers.ui.model.NameFields.copy$default(nameFields, null, null, str, 3, null);
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$7_OoGZ8tzbdBnX_VXgeOIgR2VuE(java.util.List list) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(list, "");
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$8lXNAgU3ZbGErbuOK_fn98QMOyU(com.paypal.oslo.feature.businesscustomers.ui.model.NameInputState nameInputState, kotlin.jvm.functions.Function1 function1, final java.lang.String str) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
        nameInputState.update(new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.businesscustomers.ui.customerform.components.CustomerNameSectionKt$$ExternalSyntheticLambda1
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return com.paypal.oslo.feature.businesscustomers.ui.customerform.components.CustomerNameSectionKt.m12795$r8$lambda$KGgHmvncP0IcVUkE05nzfAxOQU(str, (com.paypal.oslo.feature.businesscustomers.ui.model.NameFields) obj);
            }
        });
        function1.invoke(kotlin.collections.CollectionsKt.listOf(com.paypal.oslo.feature.businesscustomers.ui.customerform.CustomerFormError.EmptyName));
        return kotlin.Unit.INSTANCE;
    }

    /* renamed from: $r8$lambda$DPpCqDFRq-djJ204V3Vv9EZjGU4, reason: not valid java name */
    public static /* synthetic */ kotlin.Unit m12793$r8$lambda$DPpCqDFRqdjJ204V3Vv9EZjGU4(com.paypal.oslo.feature.businesscustomers.ui.model.NameInputState nameInputState, kotlin.jvm.functions.Function1 function1, final java.lang.String str) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
        nameInputState.update(new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.businesscustomers.ui.customerform.components.CustomerNameSectionKt$$ExternalSyntheticLambda9
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return com.paypal.oslo.feature.businesscustomers.ui.customerform.components.CustomerNameSectionKt.$r8$lambda$4Z6gazlX15i8JnG2qEpnapjF7Jc(str, (com.paypal.oslo.feature.businesscustomers.ui.model.NameFields) obj);
            }
        });
        function1.invoke(kotlin.collections.CollectionsKt.listOf(com.paypal.oslo.feature.businesscustomers.ui.customerform.CustomerFormError.EmptyName));
        return kotlin.Unit.INSTANCE;
    }

    /* renamed from: $r8$lambda$JfboIccymmR6o-NhwPnLgdl7IoY, reason: not valid java name */
    public static /* synthetic */ kotlin.Unit m12794$r8$lambda$JfboIccymmR6oNhwPnLgdl7IoY(final com.paypal.oslo.feature.businesscustomers.ui.model.NameInputState nameInputState, final kotlin.jvm.functions.Function1 function1, androidx.compose.runtime.Composer composer, int i) {
        if (composer.shouldExecute((i & 3) != 2, i & 1)) {
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventStart(-371687682, i, -1, "com.paypal.oslo.feature.businesscustomers.ui.customerform.components.CustomerNameSection.<anonymous> (CustomerNameSection.kt:67)");
            }
            java.lang.String lastName = nameInputState.getName().getLastName();
            if (lastName == null) {
                lastName = "";
            }
            java.lang.String stringResource = androidx.compose.ui.res.StringResources_androidKt.stringResource(com.paypal.oslo.feature.businesscustomers.R.string.feature_business_customers_form_last_name_label, composer, 0);
            androidx.compose.ui.Modifier testTag = androidx.compose.ui.platform.TestTagKt.testTag(androidx.compose.ui.Modifier.INSTANCE, CustomerNameSectionLastNameInputTestTag);
            boolean changed = composer.changed(nameInputState);
            boolean changed2 = composer.changed(function1);
            java.lang.Object rememberedValue = composer.rememberedValue();
            if ((changed | changed2) || rememberedValue == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                rememberedValue = new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.businesscustomers.ui.customerform.components.CustomerNameSectionKt$$ExternalSyntheticLambda7
                    @Override // kotlin.jvm.functions.Function1
                    public final java.lang.Object invoke(java.lang.Object obj) {
                        return com.paypal.oslo.feature.businesscustomers.ui.customerform.components.CustomerNameSectionKt.$r8$lambda$q26plEtZgU0a5Jja155Vq6Fg0jw(com.paypal.oslo.feature.businesscustomers.ui.model.NameInputState.this, function1, (java.lang.String) obj);
                    }
                };
                composer.updateRememberedValue(rememberedValue);
            }
            com.paypal.pds.components.TextInputKt.TextInput(lastName, (kotlin.jvm.functions.Function1<? super java.lang.String, kotlin.Unit>) rememberedValue, testTag, stringResource, (java.lang.String) null, (java.lang.String) null, false, false, (androidx.compose.foundation.text.KeyboardOptions) null, (kotlin.jvm.functions.Function1<? super kotlin.jvm.functions.Function0<kotlin.Unit>, kotlin.Unit>) null, (androidx.compose.foundation.interaction.MutableInteractionSource) null, false, (com.paypal.pds.components.textinput.VisualTransformation) null, (androidx.compose.ui.autofill.ContentType) null, (java.util.List<? extends com.paypal.pds.components.textinput.ValidationAlert>) null, (kotlin.jvm.functions.Function2<? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.Unit>) null, (kotlin.jvm.functions.Function2<? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.Unit>) null, composer, 384, 0, 131056);
            java.lang.String businessName = nameInputState.getName().getBusinessName();
            if (businessName == null) {
                businessName = "";
            }
            java.lang.String stringResource2 = androidx.compose.ui.res.StringResources_androidKt.stringResource(com.paypal.oslo.feature.businesscustomers.R.string.feature_business_customers_form_business_name_label, composer, 0);
            androidx.compose.ui.Modifier testTag2 = androidx.compose.ui.platform.TestTagKt.testTag(androidx.compose.ui.Modifier.INSTANCE, CustomerNameSectionBusinessNameInputTestTag);
            boolean changed3 = composer.changed(nameInputState);
            boolean changed4 = composer.changed(function1);
            java.lang.Object rememberedValue2 = composer.rememberedValue();
            if ((changed3 | changed4) || rememberedValue2 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                rememberedValue2 = new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.businesscustomers.ui.customerform.components.CustomerNameSectionKt$$ExternalSyntheticLambda8
                    @Override // kotlin.jvm.functions.Function1
                    public final java.lang.Object invoke(java.lang.Object obj) {
                        return com.paypal.oslo.feature.businesscustomers.ui.customerform.components.CustomerNameSectionKt.m12793$r8$lambda$DPpCqDFRqdjJ204V3Vv9EZjGU4(com.paypal.oslo.feature.businesscustomers.ui.model.NameInputState.this, function1, (java.lang.String) obj);
                    }
                };
                composer.updateRememberedValue(rememberedValue2);
            }
            com.paypal.pds.components.TextInputKt.TextInput(businessName, (kotlin.jvm.functions.Function1<? super java.lang.String, kotlin.Unit>) rememberedValue2, testTag2, stringResource2, (java.lang.String) null, (java.lang.String) null, false, false, (androidx.compose.foundation.text.KeyboardOptions) null, (kotlin.jvm.functions.Function1<? super kotlin.jvm.functions.Function0<kotlin.Unit>, kotlin.Unit>) null, (androidx.compose.foundation.interaction.MutableInteractionSource) null, false, (com.paypal.pds.components.textinput.VisualTransformation) null, (androidx.compose.ui.autofill.ContentType) null, (java.util.List<? extends com.paypal.pds.components.textinput.ValidationAlert>) null, (kotlin.jvm.functions.Function2<? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.Unit>) null, (kotlin.jvm.functions.Function2<? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.Unit>) null, composer, 384, 0, 131056);
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventEnd();
            }
        } else {
            composer.skipToGroupEnd();
        }
        return kotlin.Unit.INSTANCE;
    }

    /* renamed from: $r8$lambda$KGgHmvncP0IcVUkE05-nzfAxOQU, reason: not valid java name */
    public static /* synthetic */ com.paypal.oslo.feature.businesscustomers.ui.model.NameFields m12795$r8$lambda$KGgHmvncP0IcVUkE05nzfAxOQU(java.lang.String str, com.paypal.oslo.feature.businesscustomers.ui.model.NameFields nameFields) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(nameFields, "");
        return com.paypal.oslo.feature.businesscustomers.ui.model.NameFields.copy$default(nameFields, str, null, null, 6, null);
    }

    public static /* synthetic */ com.paypal.oslo.feature.businesscustomers.ui.model.NameFields $r8$lambda$QwRGVOUKxYFSipkYzVrBrZBHREw(java.lang.String str, com.paypal.oslo.feature.businesscustomers.ui.model.NameFields nameFields) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(nameFields, "");
        return com.paypal.oslo.feature.businesscustomers.ui.model.NameFields.copy$default(nameFields, null, str, null, 5, null);
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$RtY8SFeNpTK5mFNSZIgltNi5D10(final com.paypal.oslo.feature.businesscustomers.ui.model.NameInputState nameInputState, final kotlin.jvm.functions.Function1 function1, boolean z, androidx.compose.runtime.Composer composer, int i) {
        int i2;
        java.lang.String stringResource;
        if ((i & 6) == 0) {
            i2 = i | (composer.changed(z) ? 4 : 2);
        } else {
            i2 = i;
        }
        if (composer.shouldExecute((i2 & 19) != 18, i2 & 1)) {
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventStart(-186999477, i2, -1, "com.paypal.oslo.feature.businesscustomers.ui.customerform.components.CustomerNameSection.<anonymous> (CustomerNameSection.kt:50)");
            }
            java.lang.String firstName = nameInputState.getName().getFirstName();
            if (firstName == null) {
                firstName = "";
            }
            java.lang.String str = firstName;
            if (z) {
                composer.startReplaceGroup(-328497594);
                stringResource = androidx.compose.ui.res.StringResources_androidKt.stringResource(com.paypal.oslo.feature.businesscustomers.R.string.feature_business_customers_form_first_name_label, composer, 0);
                composer.endReplaceGroup();
            } else {
                composer.startReplaceGroup(-328379577);
                stringResource = androidx.compose.ui.res.StringResources_androidKt.stringResource(com.paypal.oslo.feature.businesscustomers.R.string.feature_business_customers_form_full_name_label, composer, 0);
                composer.endReplaceGroup();
            }
            java.lang.String str2 = stringResource;
            androidx.compose.ui.Modifier testTag = androidx.compose.ui.platform.TestTagKt.testTag(androidx.compose.ui.Modifier.INSTANCE, z ? CustomerNameSectionFirstNameInputTestTag : CustomerNameSectionFullNameInputTestTag);
            boolean changed = composer.changed(nameInputState);
            boolean changed2 = composer.changed(function1);
            java.lang.Object rememberedValue = composer.rememberedValue();
            if ((changed | changed2) || rememberedValue == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                rememberedValue = new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.businesscustomers.ui.customerform.components.CustomerNameSectionKt$$ExternalSyntheticLambda6
                    @Override // kotlin.jvm.functions.Function1
                    public final java.lang.Object invoke(java.lang.Object obj) {
                        return com.paypal.oslo.feature.businesscustomers.ui.customerform.components.CustomerNameSectionKt.$r8$lambda$8lXNAgU3ZbGErbuOK_fn98QMOyU(com.paypal.oslo.feature.businesscustomers.ui.model.NameInputState.this, function1, (java.lang.String) obj);
                    }
                };
                composer.updateRememberedValue(rememberedValue);
            }
            com.paypal.pds.components.TextInputKt.TextInput(str, (kotlin.jvm.functions.Function1<? super java.lang.String, kotlin.Unit>) rememberedValue, testTag, str2, (java.lang.String) null, (java.lang.String) null, false, false, (androidx.compose.foundation.text.KeyboardOptions) null, (kotlin.jvm.functions.Function1<? super kotlin.jvm.functions.Function0<kotlin.Unit>, kotlin.Unit>) null, (androidx.compose.foundation.interaction.MutableInteractionSource) null, false, (com.paypal.pds.components.textinput.VisualTransformation) null, (androidx.compose.ui.autofill.ContentType) null, (java.util.List<? extends com.paypal.pds.components.textinput.ValidationAlert>) null, (kotlin.jvm.functions.Function2<? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.Unit>) null, (kotlin.jvm.functions.Function2<? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.Unit>) null, composer, 0, 0, 131056);
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventEnd();
            }
        } else {
            composer.skipToGroupEnd();
        }
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$YyfjZtOU2Q59h5PkYZLn0i7mbVo(com.paypal.oslo.feature.businesscustomers.ui.model.NameInputState nameInputState) {
        nameInputState.splitName();
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$hFn_4gT0mIVCb63sXr55OTKorys(com.paypal.oslo.feature.businesscustomers.ui.model.NameInputState nameInputState, kotlin.jvm.functions.Function1 function1, androidx.compose.ui.Modifier modifier, int i, int i2, androidx.compose.runtime.Composer composer, int i3) {
        CustomerNameSection(nameInputState, function1, modifier, composer, androidx.compose.runtime.RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$ng5tqDgdxa81vXLDwiBrtf4Ydxc(int i, androidx.compose.runtime.Composer composer, int i2) {
        CustomerNameSectionPreview(composer, androidx.compose.runtime.RecomposeScopeImplKt.updateChangedFlags(i | 1));
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$q26plEtZgU0a5Jja155Vq6Fg0jw(com.paypal.oslo.feature.businesscustomers.ui.model.NameInputState nameInputState, kotlin.jvm.functions.Function1 function1, final java.lang.String str) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
        nameInputState.update(new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.businesscustomers.ui.customerform.components.CustomerNameSectionKt$$ExternalSyntheticLambda2
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return com.paypal.oslo.feature.businesscustomers.ui.customerform.components.CustomerNameSectionKt.$r8$lambda$QwRGVOUKxYFSipkYzVrBrZBHREw(str, (com.paypal.oslo.feature.businesscustomers.ui.model.NameFields) obj);
            }
        });
        function1.invoke(kotlin.collections.CollectionsKt.listOf(com.paypal.oslo.feature.businesscustomers.ui.customerform.CustomerFormError.EmptyName));
        return kotlin.Unit.INSTANCE;
    }
}
