package com.paypal.oslo.feature.businesscustomers.ui.customerform.components;

@kotlin.Metadata(d1 = {"\u00000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u001aU\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\b2\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\b2\u0018\u0010\u000b\u001a\u0014\u0012\n\u0012\b\u0012\u0004\u0012\u00020\t0\b\u0012\u0004\u0012\u00020\u00040\f2\b\b\u0002\u0010\r\u001a\u00020\u000eH\u0001¢\u0006\u0002\u0010\u000f\u001a\r\u0010\u0010\u001a\u00020\u0004H\u0001¢\u0006\u0002\u0010\u0011\"\u000e\u0010\u0000\u001a\u00020\u0001X\u0080T¢\u0006\u0002\n\u0000\"\u000e\u0010\u0002\u001a\u00020\u0001X\u0080T¢\u0006\u0002\n\u0000¨\u0006\u0012"}, d2 = {"CustomerContactSectionEmailInputTestTag", "", "CustomerContactSectionPhoneInputTestTag", "CustomerContactSection", "", "state", "Lcom/paypal/oslo/feature/businesscustomers/ui/model/ContactMeansInputState;", "emailErrors", "", "Lcom/paypal/oslo/feature/businesscustomers/ui/customerform/CustomerFormError;", "phoneErrors", "onClearErrors", "Lkotlin/Function1;", "modifier", "Landroidx/compose/ui/Modifier;", "(Lcom/paypal/oslo/feature/businesscustomers/ui/model/ContactMeansInputState;Ljava/util/List;Ljava/util/List;Lkotlin/jvm/functions/Function1;Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;II)V", "CustomerContactSectionPreview", "(Landroidx/compose/runtime/Composer;I)V", "business-customers_prodRelease"}, k = 2, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class CustomerContactSectionKt {
    public static final java.lang.String CustomerContactSectionEmailInputTestTag = "CustomerContactSection_EmailInput";
    public static final java.lang.String CustomerContactSectionPhoneInputTestTag = "CustomerContactSection_PhoneInput";

    /* JADX WARN: Removed duplicated region for block: B:34:0x0085  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0090  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x0114  */
    /* JADX WARN: Removed duplicated region for block: B:54:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:57:0x010b  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x0087  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void CustomerContactSection(final com.paypal.oslo.feature.businesscustomers.ui.model.ContactMeansInputState contactMeansInputState, final java.util.List<? extends com.paypal.oslo.feature.businesscustomers.ui.customerform.CustomerFormError> list, final java.util.List<? extends com.paypal.oslo.feature.businesscustomers.ui.customerform.CustomerFormError> list2, final kotlin.jvm.functions.Function1<? super java.util.List<? extends com.paypal.oslo.feature.businesscustomers.ui.customerform.CustomerFormError>, kotlin.Unit> function1, androidx.compose.ui.Modifier modifier, androidx.compose.runtime.Composer composer, final int i, final int i2) {
        int i3;
        androidx.compose.ui.Modifier modifier2;
        androidx.compose.runtime.ScopeUpdateScope endRestartGroup;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(contactMeansInputState, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(list, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(list2, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(function1, "");
        androidx.compose.runtime.Composer startRestartGroup = composer.startRestartGroup(1013537107);
        if ((i & 6) == 0) {
            i3 = (startRestartGroup.changed(contactMeansInputState) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i & 48) == 0) {
            i3 |= startRestartGroup.changedInstance(list) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i3 |= startRestartGroup.changedInstance(list2) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i3 |= startRestartGroup.changedInstance(function1) ? 2048 : 1024;
        }
        int i4 = i2 & 16;
        if (i4 != 0) {
            i3 |= 24576;
        } else if ((i & 24576) == 0) {
            modifier2 = modifier;
            i3 |= startRestartGroup.changed(modifier2) ? 16384 : 8192;
            if (startRestartGroup.shouldExecute((i3 & 9363) == 9362, i3 & 1)) {
                startRestartGroup.skipToGroupEnd();
            } else {
                androidx.compose.ui.Modifier modifier3 = i4 != 0 ? androidx.compose.ui.Modifier.INSTANCE : modifier2;
                if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                    androidx.compose.runtime.ComposerKt.traceEventStart(1013537107, i3, -1, "com.paypal.oslo.feature.businesscustomers.ui.customerform.components.CustomerContactSection (CustomerContactSection.kt:44)");
                }
                com.paypal.oslo.feature.businesscustomers.ui.customerform.components.ExpandableInputSectionKt.ExpandableInputSection(androidx.compose.ui.res.StringResources_androidKt.stringResource(com.paypal.oslo.feature.businesscustomers.R.string.feature_business_customers_form_add_phone_label, startRestartGroup, 0), modifier3, new com.paypal.oslo.feature.businesscustomers.ui.utils.TrackedElement.Item("add_phone_button", null, null, null, 14, null), contactMeansInputState.getPhoneNumber() != null, null, androidx.compose.runtime.internal.ComposableLambdaKt.rememberComposableLambda(395619330, true, new kotlin.jvm.functions.Function3() { // from class: com.paypal.oslo.feature.businesscustomers.ui.customerform.components.CustomerContactSectionKt$$ExternalSyntheticLambda2
                    @Override // kotlin.jvm.functions.Function3
                    public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2, java.lang.Object obj3) {
                        return com.paypal.oslo.feature.businesscustomers.ui.customerform.components.CustomerContactSectionKt.$r8$lambda$r7nJzmmChwXR89AvQ8dWbQnAbzs(com.paypal.oslo.feature.businesscustomers.ui.model.ContactMeansInputState.this, list, function1, ((java.lang.Boolean) obj).booleanValue(), (androidx.compose.runtime.Composer) obj2, ((java.lang.Integer) obj3).intValue());
                    }
                }, startRestartGroup, 54), androidx.compose.runtime.internal.ComposableLambdaKt.rememberComposableLambda(117793973, true, new kotlin.jvm.functions.Function2() { // from class: com.paypal.oslo.feature.businesscustomers.ui.customerform.components.CustomerContactSectionKt$$ExternalSyntheticLambda3
                    @Override // kotlin.jvm.functions.Function2
                    public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                        return com.paypal.oslo.feature.businesscustomers.ui.customerform.components.CustomerContactSectionKt.$r8$lambda$lv6Io7MnQl_GzNqXwLWFYWUpLJg(com.paypal.oslo.feature.businesscustomers.ui.model.ContactMeansInputState.this, list2, function1, (androidx.compose.runtime.Composer) obj, ((java.lang.Integer) obj2).intValue());
                    }
                }, startRestartGroup, 54), startRestartGroup, ((i3 >> 9) & 112) | 1769472, 16);
                if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                    androidx.compose.runtime.ComposerKt.traceEventEnd();
                }
                modifier2 = modifier3;
            }
            endRestartGroup = startRestartGroup.endRestartGroup();
            if (endRestartGroup == null) {
                final androidx.compose.ui.Modifier modifier4 = modifier2;
                endRestartGroup.updateScope(new kotlin.jvm.functions.Function2() { // from class: com.paypal.oslo.feature.businesscustomers.ui.customerform.components.CustomerContactSectionKt$$ExternalSyntheticLambda4
                    @Override // kotlin.jvm.functions.Function2
                    public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                        return com.paypal.oslo.feature.businesscustomers.ui.customerform.components.CustomerContactSectionKt.$r8$lambda$bPnrzLoWgdjEMQCZySoe5c2ia_0(com.paypal.oslo.feature.businesscustomers.ui.model.ContactMeansInputState.this, list, list2, function1, modifier4, i, i2, (androidx.compose.runtime.Composer) obj, ((java.lang.Integer) obj2).intValue());
                    }
                });
                return;
            }
            return;
        }
        modifier2 = modifier;
        if (startRestartGroup.shouldExecute((i3 & 9363) == 9362, i3 & 1)) {
        }
        endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup == null) {
        }
    }

    public static final void CustomerContactSectionPreview(androidx.compose.runtime.Composer composer, final int i) {
        androidx.compose.runtime.Composer startRestartGroup = composer.startRestartGroup(538040556);
        if (!startRestartGroup.shouldExecute(i != 0, i & 1)) {
            startRestartGroup.skipToGroupEnd();
        } else {
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventStart(538040556, i, -1, "com.paypal.oslo.feature.businesscustomers.ui.customerform.components.CustomerContactSectionPreview (CustomerContactSection.kt:99)");
            }
            androidx.compose.ui.Modifier background = com.paypal.pds.core.ModifierExtensionsKt.background((androidx.compose.ui.Modifier) androidx.compose.ui.Modifier.INSTANCE, (com.paypal.pds.core.Color) com.paypal.pds.core.Color.BackgroundBase.INSTANCE, (androidx.compose.ui.graphics.Shape) null, startRestartGroup, 54, 2);
            java.lang.Object rememberedValue = startRestartGroup.rememberedValue();
            if (rememberedValue == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                rememberedValue = new com.paypal.oslo.feature.businesscustomers.ui.model.ContactMeansInputState(null, null, 3, null);
                startRestartGroup.updateRememberedValue(rememberedValue);
            }
            com.paypal.oslo.feature.businesscustomers.ui.model.ContactMeansInputState contactMeansInputState = (com.paypal.oslo.feature.businesscustomers.ui.model.ContactMeansInputState) rememberedValue;
            java.util.List emptyList = kotlin.collections.CollectionsKt.emptyList();
            java.util.List emptyList2 = kotlin.collections.CollectionsKt.emptyList();
            java.lang.Object rememberedValue2 = startRestartGroup.rememberedValue();
            if (rememberedValue2 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                rememberedValue2 = new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.businesscustomers.ui.customerform.components.CustomerContactSectionKt$$ExternalSyntheticLambda0
                    @Override // kotlin.jvm.functions.Function1
                    public final java.lang.Object invoke(java.lang.Object obj) {
                        return com.paypal.oslo.feature.businesscustomers.ui.customerform.components.CustomerContactSectionKt.m12791$r8$lambda$XJD8WJlgDV10UYpft5roWdXQpw((java.util.List) obj);
                    }
                };
                startRestartGroup.updateRememberedValue(rememberedValue2);
            }
            CustomerContactSection(contactMeansInputState, emptyList, emptyList2, (kotlin.jvm.functions.Function1) rememberedValue2, background, startRestartGroup, 3510, 0);
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventEnd();
            }
        }
        androidx.compose.runtime.ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new kotlin.jvm.functions.Function2() { // from class: com.paypal.oslo.feature.businesscustomers.ui.customerform.components.CustomerContactSectionKt$$ExternalSyntheticLambda1
                @Override // kotlin.jvm.functions.Function2
                public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                    return com.paypal.oslo.feature.businesscustomers.ui.customerform.components.CustomerContactSectionKt.$r8$lambda$KIi_gIAiLeAq70h6tfBwDcSsq70(i, (androidx.compose.runtime.Composer) obj, ((java.lang.Integer) obj2).intValue());
                }
            });
        }
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$BFPvWKnrR0JzHFpp1PEGrqABAkA(com.paypal.oslo.feature.businesscustomers.ui.model.ContactMeansInputState contactMeansInputState, kotlin.jvm.functions.Function1 function1, java.lang.String str) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
        contactMeansInputState.updateEmail(str);
        function1.invoke(kotlin.collections.CollectionsKt.listOf((java.lang.Object[]) new com.paypal.oslo.feature.businesscustomers.ui.customerform.CustomerFormError[]{com.paypal.oslo.feature.businesscustomers.ui.customerform.CustomerFormError.EmptyEmail, com.paypal.oslo.feature.businesscustomers.ui.customerform.CustomerFormError.InvalidEmail}));
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$KIi_gIAiLeAq70h6tfBwDcSsq70(int i, androidx.compose.runtime.Composer composer, int i2) {
        CustomerContactSectionPreview(composer, androidx.compose.runtime.RecomposeScopeImplKt.updateChangedFlags(i | 1));
        return kotlin.Unit.INSTANCE;
    }

    /* renamed from: $r8$lambda$X2Pe9-NjG4Y_bZJiWZJgf6kG3aM, reason: not valid java name */
    public static /* synthetic */ kotlin.Unit m12790$r8$lambda$X2Pe9NjG4Y_bZJiWZJgf6kG3aM(com.paypal.oslo.feature.businesscustomers.ui.model.ContactMeansInputState contactMeansInputState, kotlin.jvm.functions.Function1 function1, java.lang.String str) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
        contactMeansInputState.updatePhoneNumber(str);
        function1.invoke(kotlin.collections.CollectionsKt.listOf(com.paypal.oslo.feature.businesscustomers.ui.customerform.CustomerFormError.InvalidPhone));
        return kotlin.Unit.INSTANCE;
    }

    /* renamed from: $r8$lambda$XJD8WJlgDV10UYpft5ro-WdXQpw, reason: not valid java name */
    public static /* synthetic */ kotlin.Unit m12791$r8$lambda$XJD8WJlgDV10UYpft5roWdXQpw(java.util.List list) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(list, "");
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$bPnrzLoWgdjEMQCZySoe5c2ia_0(com.paypal.oslo.feature.businesscustomers.ui.model.ContactMeansInputState contactMeansInputState, java.util.List list, java.util.List list2, kotlin.jvm.functions.Function1 function1, androidx.compose.ui.Modifier modifier, int i, int i2, androidx.compose.runtime.Composer composer, int i3) {
        CustomerContactSection(contactMeansInputState, list, list2, function1, modifier, composer, androidx.compose.runtime.RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$lv6Io7MnQl_GzNqXwLWFYWUpLJg(final com.paypal.oslo.feature.businesscustomers.ui.model.ContactMeansInputState contactMeansInputState, java.util.List list, final kotlin.jvm.functions.Function1 function1, androidx.compose.runtime.Composer composer, int i) {
        if (composer.shouldExecute((i & 3) != 2, i & 1)) {
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventStart(117793973, i, -1, "com.paypal.oslo.feature.businesscustomers.ui.customerform.components.CustomerContactSection.<anonymous> (CustomerContactSection.kt:73)");
            }
            java.lang.String phoneNumber = contactMeansInputState.getPhoneNumber();
            if (phoneNumber == null) {
                phoneNumber = "";
            }
            java.lang.String stringResource = androidx.compose.ui.res.StringResources_androidKt.stringResource(com.paypal.oslo.feature.businesscustomers.R.string.feature_business_customers_form_phone_label, composer, 0);
            composer.startReplaceGroup(1530873027);
            java.util.List list2 = list;
            java.util.ArrayList arrayList = new java.util.ArrayList(kotlin.collections.CollectionsKt.collectionSizeOrDefault(list2, 10));
            java.util.Iterator it = list2.iterator();
            while (it.hasNext()) {
                final java.lang.String errorMessage = com.paypal.oslo.feature.businesscustomers.ui.customerform.CustomerFormErrorToErrorMessageKt.toErrorMessage((com.paypal.oslo.feature.businesscustomers.ui.customerform.CustomerFormError) it.next(), composer, 0);
                com.paypal.pds.components.textinput.ValidationAlert.Companion companion = com.paypal.pds.components.textinput.ValidationAlert.INSTANCE;
                boolean changed = composer.changed(errorMessage);
                java.lang.Object rememberedValue = composer.rememberedValue();
                if (changed || rememberedValue == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                    rememberedValue = new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.businesscustomers.ui.customerform.components.CustomerContactSectionKt$$ExternalSyntheticLambda7
                        @Override // kotlin.jvm.functions.Function1
                        public final java.lang.Object invoke(java.lang.Object obj) {
                            return com.paypal.oslo.feature.businesscustomers.ui.customerform.components.CustomerContactSectionKt.$r8$lambda$nETbNLFs7_moIlFojKm8AIGqySU(errorMessage, (java.lang.String) obj);
                        }
                    };
                    composer.updateRememberedValue(rememberedValue);
                }
                arrayList.add(companion.invoke((kotlin.jvm.functions.Function1) rememberedValue));
            }
            java.util.ArrayList arrayList2 = arrayList;
            composer.endReplaceGroup();
            androidx.compose.ui.Modifier testTag = androidx.compose.ui.platform.TestTagKt.testTag(androidx.compose.ui.Modifier.INSTANCE, CustomerContactSectionPhoneInputTestTag);
            boolean changed2 = composer.changed(contactMeansInputState);
            boolean changed3 = composer.changed(function1);
            java.lang.Object rememberedValue2 = composer.rememberedValue();
            if ((changed2 | changed3) || rememberedValue2 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                rememberedValue2 = new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.businesscustomers.ui.customerform.components.CustomerContactSectionKt$$ExternalSyntheticLambda8
                    @Override // kotlin.jvm.functions.Function1
                    public final java.lang.Object invoke(java.lang.Object obj) {
                        return com.paypal.oslo.feature.businesscustomers.ui.customerform.components.CustomerContactSectionKt.m12790$r8$lambda$X2Pe9NjG4Y_bZJiWZJgf6kG3aM(com.paypal.oslo.feature.businesscustomers.ui.model.ContactMeansInputState.this, function1, (java.lang.String) obj);
                    }
                };
                composer.updateRememberedValue(rememberedValue2);
            }
            com.paypal.pds.components.TextInputKt.TextInput(phoneNumber, (kotlin.jvm.functions.Function1<? super java.lang.String, kotlin.Unit>) rememberedValue2, testTag, stringResource, (java.lang.String) null, (java.lang.String) null, false, false, (androidx.compose.foundation.text.KeyboardOptions) null, (kotlin.jvm.functions.Function1<? super kotlin.jvm.functions.Function0<kotlin.Unit>, kotlin.Unit>) null, (androidx.compose.foundation.interaction.MutableInteractionSource) null, false, (com.paypal.pds.components.textinput.VisualTransformation) null, (androidx.compose.ui.autofill.ContentType) null, (java.util.List<? extends com.paypal.pds.components.textinput.ValidationAlert>) arrayList2, (kotlin.jvm.functions.Function2<? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.Unit>) null, (kotlin.jvm.functions.Function2<? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.Unit>) null, composer, 384, 0, 114672);
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventEnd();
            }
        } else {
            composer.skipToGroupEnd();
        }
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ com.paypal.pds.components.textinput.ValidationAlertData $r8$lambda$nETbNLFs7_moIlFojKm8AIGqySU(java.lang.String str, java.lang.String str2) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str2, "");
        return new com.paypal.pds.components.textinput.ValidationAlertData(str, com.paypal.pds.components.ContextualAlertStyle.Negative.INSTANCE, false, null, null, 28, null);
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$r7nJzmmChwXR89AvQ8dWbQnAbzs(final com.paypal.oslo.feature.businesscustomers.ui.model.ContactMeansInputState contactMeansInputState, java.util.List list, final kotlin.jvm.functions.Function1 function1, boolean z, androidx.compose.runtime.Composer composer, int i) {
        if (composer.shouldExecute((i & 17) != 16, i & 1)) {
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventStart(395619330, i, -1, "com.paypal.oslo.feature.businesscustomers.ui.customerform.components.CustomerContactSection.<anonymous> (CustomerContactSection.kt:51)");
            }
            java.lang.String emailAddress = contactMeansInputState.getEmailAddress();
            if (emailAddress == null) {
                emailAddress = "";
            }
            java.lang.String stringResource = androidx.compose.ui.res.StringResources_androidKt.stringResource(com.paypal.oslo.feature.businesscustomers.R.string.feature_business_customers_form_email_label, composer, 0);
            composer.startReplaceGroup(-2061897744);
            java.util.List list2 = list;
            java.util.ArrayList arrayList = new java.util.ArrayList(kotlin.collections.CollectionsKt.collectionSizeOrDefault(list2, 10));
            java.util.Iterator it = list2.iterator();
            while (it.hasNext()) {
                final java.lang.String errorMessage = com.paypal.oslo.feature.businesscustomers.ui.customerform.CustomerFormErrorToErrorMessageKt.toErrorMessage((com.paypal.oslo.feature.businesscustomers.ui.customerform.CustomerFormError) it.next(), composer, 0);
                com.paypal.pds.components.textinput.ValidationAlert.Companion companion = com.paypal.pds.components.textinput.ValidationAlert.INSTANCE;
                boolean changed = composer.changed(errorMessage);
                java.lang.Object rememberedValue = composer.rememberedValue();
                if (changed || rememberedValue == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                    rememberedValue = new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.businesscustomers.ui.customerform.components.CustomerContactSectionKt$$ExternalSyntheticLambda5
                        @Override // kotlin.jvm.functions.Function1
                        public final java.lang.Object invoke(java.lang.Object obj) {
                            return com.paypal.oslo.feature.businesscustomers.ui.customerform.components.CustomerContactSectionKt.m12792$r8$lambda$v_efD1eyV9IaKPsG63PqMDol0(errorMessage, (java.lang.String) obj);
                        }
                    };
                    composer.updateRememberedValue(rememberedValue);
                }
                arrayList.add(companion.invoke((kotlin.jvm.functions.Function1) rememberedValue));
            }
            java.util.ArrayList arrayList2 = arrayList;
            composer.endReplaceGroup();
            androidx.compose.ui.Modifier testTag = androidx.compose.ui.platform.TestTagKt.testTag(androidx.compose.ui.Modifier.INSTANCE, CustomerContactSectionEmailInputTestTag);
            boolean changed2 = composer.changed(contactMeansInputState);
            boolean changed3 = composer.changed(function1);
            java.lang.Object rememberedValue2 = composer.rememberedValue();
            if ((changed2 | changed3) || rememberedValue2 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                rememberedValue2 = new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.businesscustomers.ui.customerform.components.CustomerContactSectionKt$$ExternalSyntheticLambda6
                    @Override // kotlin.jvm.functions.Function1
                    public final java.lang.Object invoke(java.lang.Object obj) {
                        return com.paypal.oslo.feature.businesscustomers.ui.customerform.components.CustomerContactSectionKt.$r8$lambda$BFPvWKnrR0JzHFpp1PEGrqABAkA(com.paypal.oslo.feature.businesscustomers.ui.model.ContactMeansInputState.this, function1, (java.lang.String) obj);
                    }
                };
                composer.updateRememberedValue(rememberedValue2);
            }
            com.paypal.pds.components.TextInputKt.TextInput(emailAddress, (kotlin.jvm.functions.Function1<? super java.lang.String, kotlin.Unit>) rememberedValue2, testTag, stringResource, (java.lang.String) null, (java.lang.String) null, false, false, (androidx.compose.foundation.text.KeyboardOptions) null, (kotlin.jvm.functions.Function1<? super kotlin.jvm.functions.Function0<kotlin.Unit>, kotlin.Unit>) null, (androidx.compose.foundation.interaction.MutableInteractionSource) null, false, (com.paypal.pds.components.textinput.VisualTransformation) null, (androidx.compose.ui.autofill.ContentType) null, (java.util.List<? extends com.paypal.pds.components.textinput.ValidationAlert>) arrayList2, (kotlin.jvm.functions.Function2<? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.Unit>) null, (kotlin.jvm.functions.Function2<? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.Unit>) null, composer, 384, 0, 114672);
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventEnd();
            }
        } else {
            composer.skipToGroupEnd();
        }
        return kotlin.Unit.INSTANCE;
    }

    /* renamed from: $r8$lambda$v-_efD1eyV9IaK-PsG63PqMDol0, reason: not valid java name */
    public static /* synthetic */ com.paypal.pds.components.textinput.ValidationAlertData m12792$r8$lambda$v_efD1eyV9IaKPsG63PqMDol0(java.lang.String str, java.lang.String str2) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str2, "");
        return new com.paypal.pds.components.textinput.ValidationAlertData(str, com.paypal.pds.components.ContextualAlertStyle.Negative.INSTANCE, false, null, null, 28, null);
    }
}
