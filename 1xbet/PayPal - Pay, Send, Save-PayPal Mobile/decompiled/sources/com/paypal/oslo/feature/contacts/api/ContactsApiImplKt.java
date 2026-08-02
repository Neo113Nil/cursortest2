package com.paypal.oslo.feature.contacts.api;

@kotlin.Metadata(d1 = {"\u0000H\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\u001a)\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0012\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00010\u0005H\u0003¢\u0006\u0002\u0010\u0007\u001a1\u0010\b\u001a\u00020\u00012\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\f2\u0012\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00010\u0005H\u0003¢\u0006\u0002\u0010\r\u001a7\u0010\u000e\u001a\u00020\u00012\u0006\u0010\t\u001a\u00020\u000f2\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00120\u00112\u0012\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00010\u0005H\u0003¢\u0006\u0002\u0010\u0013\u001a-\u0010\u0014\u001a\u00020\u00012\f\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00010\u00162\u0006\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0017\u001a\u00020\u0018H\u0003¢\u0006\u0002\u0010\u0019\u001a\r\u0010\u001a\u001a\u00020\u0001H\u0003¢\u0006\u0002\u0010\u001b\u001a\r\u0010\u001c\u001a\u00020\u0001H\u0003¢\u0006\u0002\u0010\u001b¨\u0006\u001d"}, d2 = {"SearchBarSection", "", "placeholderText", "", "onEvent", "Lkotlin/Function1;", "Lcom/paypal/oslo/feature/contacts/api/callbacks/ContactsCallbackEvent;", "(Ljava/lang/String;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;I)V", "CTAGroupSection", "config", "Lcom/paypal/oslo/feature/contacts/api/configs/CTAGroupConfig;", "hasContacts", "", "(Lcom/paypal/oslo/feature/contacts/api/configs/CTAGroupConfig;ZLkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;I)V", "ContactsListSection", "Lcom/paypal/oslo/feature/contacts/api/configs/ContactsListConfig;", "contacts", "", "Lcom/paypal/oslo/feature/contacts/api/ContactSearchContactItem;", "(Lcom/paypal/oslo/feature/contacts/api/configs/ContactsListConfig;Ljava/util/List;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;I)V", "SearchContactsButtonContents", "onClickListener", "Lkotlin/Function0;", "modifier", "Landroidx/compose/ui/Modifier;", "(Lkotlin/jvm/functions/Function0;Ljava/lang/String;Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;II)V", "PreSearchContactViewNonEmptyPreview", "(Landroidx/compose/runtime/Composer;I)V", "PreSearchContactViewEmptyPreview", "contacts_prodRelease"}, k = 2, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class ContactsApiImplKt {
    /* JADX INFO: Access modifiers changed from: private */
    public static final void getHighSpeedVideoSizes(final java.lang.String str, final kotlin.jvm.functions.Function1<? super com.paypal.oslo.feature.contacts.api.callbacks.ContactsCallbackEvent, kotlin.Unit> function1, androidx.compose.runtime.Composer composer, final int i) {
        int i2;
        androidx.compose.runtime.Composer startRestartGroup = composer.startRestartGroup(1987098659);
        if ((i & 6) == 0) {
            i2 = (startRestartGroup.changed(str) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= startRestartGroup.changedInstance(function1) ? 32 : 16;
        }
        if (!startRestartGroup.shouldExecute((i2 & 19) != 18, i2 & 1)) {
            startRestartGroup.skipToGroupEnd();
        } else {
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventStart(1987098659, i2, -1, "com.paypal.oslo.feature.contacts.api.SearchBarSection (ContactsApiImpl.kt:115)");
            }
            boolean z = (i2 & 112) == 32;
            java.lang.Object rememberedValue = startRestartGroup.rememberedValue();
            if (z || rememberedValue == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                rememberedValue = new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.feature.contacts.api.ContactsApiImplKt$$ExternalSyntheticLambda12
                    @Override // kotlin.jvm.functions.Function0
                    public final java.lang.Object invoke() {
                        return com.paypal.oslo.feature.contacts.api.ContactsApiImplKt.$r8$lambda$KSewUJUkW5plCx5RMXk7qK90128(kotlin.jvm.functions.Function1.this);
                    }
                };
                startRestartGroup.updateRememberedValue(rememberedValue);
            }
            Camera2StreamConfigurationMap((kotlin.jvm.functions.Function0) rememberedValue, str, androidx.compose.ui.platform.TestTagKt.testTag(androidx.compose.ui.Modifier.INSTANCE, "SearchContactsButton"), startRestartGroup, ((i2 << 3) & 112) | 384, 0);
            androidx.compose.foundation.layout.SpacerKt.Spacer(androidx.compose.foundation.layout.SizeKt.m1726height3ABfNKs(androidx.compose.ui.Modifier.INSTANCE, com.paypal.pds.core.ConstantsKt.getSpacing16()), startRestartGroup, 0);
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventEnd();
            }
        }
        androidx.compose.runtime.ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new kotlin.jvm.functions.Function2() { // from class: com.paypal.oslo.feature.contacts.api.ContactsApiImplKt$$ExternalSyntheticLambda13
                @Override // kotlin.jvm.functions.Function2
                public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                    return com.paypal.oslo.feature.contacts.api.ContactsApiImplKt.$r8$lambda$vUP1VO29SXNhnOiOzfx1AO5NFvo(str, function1, i, (androidx.compose.runtime.Composer) obj, ((java.lang.Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void getHighSpeedVideoFpsRangesFor(final com.paypal.oslo.feature.contacts.api.configs.CTAGroupConfig cTAGroupConfig, final boolean z, final kotlin.jvm.functions.Function1<? super com.paypal.oslo.feature.contacts.api.callbacks.ContactsCallbackEvent, kotlin.Unit> function1, androidx.compose.runtime.Composer composer, final int i) {
        int i2;
        com.paypal.oslo.feature.contacts.ui.contacts.views.CTALayoutVariant cTALayoutVariant;
        androidx.compose.runtime.Composer startRestartGroup = composer.startRestartGroup(-445367169);
        if ((i & 6) == 0) {
            i2 = (startRestartGroup.changed(cTAGroupConfig) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= startRestartGroup.changed(z) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= startRestartGroup.changedInstance(function1) ? 256 : 128;
        }
        if (!startRestartGroup.shouldExecute((i2 & 147) != 146, i2 & 1)) {
            startRestartGroup.skipToGroupEnd();
        } else {
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventStart(-445367169, i2, -1, "com.paypal.oslo.feature.contacts.api.CTAGroupSection (ContactsApiImpl.kt:129)");
            }
            if (!cTAGroupConfig.getOrderedListOfCTA().isEmpty()) {
                startRestartGroup.startReplaceGroup(-779072822);
                if (z) {
                    cTALayoutVariant = com.paypal.oslo.feature.contacts.ui.contacts.views.CTALayoutVariant.COLLAPSED;
                } else {
                    cTALayoutVariant = com.paypal.oslo.feature.contacts.ui.contacts.views.CTALayoutVariant.EXPANDED;
                }
                com.paypal.oslo.feature.contacts.ui.contacts.views.CTALayoutVariant cTALayoutVariant2 = cTALayoutVariant;
                boolean z2 = (i2 & 896) == 256;
                java.lang.Object rememberedValue = startRestartGroup.rememberedValue();
                if (z2 || rememberedValue == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                    com.paypal.oslo.feature.contacts.ui.contacts.views.CTAGroupUIListenerSuite cTAGroupUIListenerSuite = new com.paypal.oslo.feature.contacts.ui.contacts.views.CTAGroupUIListenerSuite(new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.feature.contacts.api.ContactsApiImplKt$$ExternalSyntheticLambda14
                        @Override // kotlin.jvm.functions.Function0
                        public final java.lang.Object invoke() {
                            return com.paypal.oslo.feature.contacts.api.ContactsApiImplKt.$r8$lambda$i5ExQ3Z_xA2UJwESTEHISx1EZQs(kotlin.jvm.functions.Function1.this);
                        }
                    }, new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.feature.contacts.api.ContactsApiImplKt$$ExternalSyntheticLambda15
                        @Override // kotlin.jvm.functions.Function0
                        public final java.lang.Object invoke() {
                            return com.paypal.oslo.feature.contacts.api.ContactsApiImplKt.m13641$r8$lambda$wP6O8FsM9MtLwtbwRD0Ssbyozw(kotlin.jvm.functions.Function1.this);
                        }
                    }, new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.feature.contacts.api.ContactsApiImplKt$$ExternalSyntheticLambda16
                        @Override // kotlin.jvm.functions.Function0
                        public final java.lang.Object invoke() {
                            return com.paypal.oslo.feature.contacts.api.ContactsApiImplKt.$r8$lambda$pXBjhfFRUxtrKSolvU5wPrE_vEg(kotlin.jvm.functions.Function1.this);
                        }
                    }, new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.feature.contacts.api.ContactsApiImplKt$$ExternalSyntheticLambda17
                        @Override // kotlin.jvm.functions.Function0
                        public final java.lang.Object invoke() {
                            return com.paypal.oslo.feature.contacts.api.ContactsApiImplKt.$r8$lambda$qP8YXtHwDi0VKe_aRGaVcQG1KJo(kotlin.jvm.functions.Function1.this);
                        }
                    }, new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.feature.contacts.api.ContactsApiImplKt$$ExternalSyntheticLambda1
                        @Override // kotlin.jvm.functions.Function0
                        public final java.lang.Object invoke() {
                            return com.paypal.oslo.feature.contacts.api.ContactsApiImplKt.$r8$lambda$dnaAeRj8r2p2SLTd1UajyoWIm1g(kotlin.jvm.functions.Function1.this);
                        }
                    }, new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.feature.contacts.api.ContactsApiImplKt$$ExternalSyntheticLambda2
                        @Override // kotlin.jvm.functions.Function0
                        public final java.lang.Object invoke() {
                            return com.paypal.oslo.feature.contacts.api.ContactsApiImplKt.$r8$lambda$_jZHGiTdGKPe1iRiKYyKdybMOKM(kotlin.jvm.functions.Function1.this);
                        }
                    }, new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.feature.contacts.api.ContactsApiImplKt$$ExternalSyntheticLambda3
                        @Override // kotlin.jvm.functions.Function0
                        public final java.lang.Object invoke() {
                            return com.paypal.oslo.feature.contacts.api.ContactsApiImplKt.$r8$lambda$C6rT8uJPA8Yj0zEa2HT6ggqrM2U(kotlin.jvm.functions.Function1.this);
                        }
                    }, new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.feature.contacts.api.ContactsApiImplKt$$ExternalSyntheticLambda4
                        @Override // kotlin.jvm.functions.Function0
                        public final java.lang.Object invoke() {
                            return com.paypal.oslo.feature.contacts.api.ContactsApiImplKt.$r8$lambda$Y8IJglsR9DZ3foax6qJJyZtmwzI(kotlin.jvm.functions.Function1.this);
                        }
                    });
                    startRestartGroup.updateRememberedValue(cTAGroupUIListenerSuite);
                    rememberedValue = cTAGroupUIListenerSuite;
                }
                com.paypal.oslo.feature.contacts.ui.contacts.views.CTAGroupUIKt.CTAGroupUI(cTAGroupConfig, cTALayoutVariant2, (com.paypal.oslo.feature.contacts.ui.contacts.views.CTAGroupUIListenerSuite) rememberedValue, null, true, null, startRestartGroup, (i2 & 14) | 24576, 40);
                startRestartGroup.endReplaceGroup();
            } else {
                startRestartGroup.startReplaceGroup(-777019165);
                startRestartGroup.endReplaceGroup();
            }
            androidx.compose.foundation.layout.SpacerKt.Spacer(androidx.compose.foundation.layout.SizeKt.m1726height3ABfNKs(androidx.compose.ui.Modifier.INSTANCE, com.paypal.pds.core.ConstantsKt.getSpacing12()), startRestartGroup, 0);
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventEnd();
            }
        }
        androidx.compose.runtime.ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new kotlin.jvm.functions.Function2() { // from class: com.paypal.oslo.feature.contacts.api.ContactsApiImplKt$$ExternalSyntheticLambda5
                @Override // kotlin.jvm.functions.Function2
                public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                    return com.paypal.oslo.feature.contacts.api.ContactsApiImplKt.$r8$lambda$D9GqOPTm9Q5rOqnyS0FnbAACqVc(com.paypal.oslo.feature.contacts.api.configs.CTAGroupConfig.this, z, function1, i, (androidx.compose.runtime.Composer) obj, ((java.lang.Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void Camera2StreamConfigurationMap(final com.paypal.oslo.feature.contacts.api.configs.ContactsListConfig contactsListConfig, final java.util.List<? extends com.paypal.oslo.feature.contacts.api.ContactSearchContactItem> list, final kotlin.jvm.functions.Function1<? super com.paypal.oslo.feature.contacts.api.callbacks.ContactsCallbackEvent, kotlin.Unit> function1, androidx.compose.runtime.Composer composer, final int i) {
        int i2;
        androidx.compose.runtime.Composer startRestartGroup = composer.startRestartGroup(863123079);
        if ((i & 6) == 0) {
            i2 = (startRestartGroup.changed(contactsListConfig) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= startRestartGroup.changedInstance(list) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= startRestartGroup.changedInstance(function1) ? 256 : 128;
        }
        if (!startRestartGroup.shouldExecute((i2 & 147) != 146, i2 & 1)) {
            startRestartGroup.skipToGroupEnd();
        } else {
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventStart(863123079, i2, -1, "com.paypal.oslo.feature.contacts.api.ContactsListSection (ContactsApiImpl.kt:200)");
            }
            if (!list.isEmpty()) {
                startRestartGroup.startReplaceGroup(-669367917);
                com.paypal.oslo.feature.contacts.ui.contacts.views.ContactsListKt.ContactsListContent(contactsListConfig, list, function1, androidx.compose.ui.Modifier.INSTANCE, startRestartGroup, (i2 & 14) | 3072 | (i2 & 112) | (i2 & 896), 0);
                startRestartGroup.endReplaceGroup();
            } else {
                startRestartGroup.startReplaceGroup(-669206469);
                startRestartGroup.endReplaceGroup();
            }
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventEnd();
            }
        }
        androidx.compose.runtime.ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new kotlin.jvm.functions.Function2() { // from class: com.paypal.oslo.feature.contacts.api.ContactsApiImplKt$$ExternalSyntheticLambda6
                @Override // kotlin.jvm.functions.Function2
                public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                    return com.paypal.oslo.feature.contacts.api.ContactsApiImplKt.m13640$r8$lambda$HCKe64EVUMnBjJIQpShP77T8I(com.paypal.oslo.feature.contacts.api.configs.ContactsListConfig.this, list, function1, i, (androidx.compose.runtime.Composer) obj, ((java.lang.Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0054  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x005f  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x00cf  */
    /* JADX WARN: Removed duplicated region for block: B:44:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:47:0x00c5  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0056  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void Camera2StreamConfigurationMap(final kotlin.jvm.functions.Function0<kotlin.Unit> function0, final java.lang.String str, androidx.compose.ui.Modifier modifier, androidx.compose.runtime.Composer composer, final int i, final int i2) {
        int i3;
        androidx.compose.ui.Modifier modifier2;
        final androidx.compose.ui.Modifier modifier3;
        androidx.compose.runtime.ScopeUpdateScope endRestartGroup;
        androidx.compose.runtime.Composer startRestartGroup = composer.startRestartGroup(-395405104);
        if ((i & 6) == 0) {
            i3 = (startRestartGroup.changedInstance(function0) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i & 48) == 0) {
            i3 |= startRestartGroup.changed(str) ? 32 : 16;
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
                androidx.compose.ui.Modifier modifier4 = i4 != 0 ? androidx.compose.ui.Modifier.INSTANCE : modifier2;
                if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                    androidx.compose.runtime.ComposerKt.traceEventStart(-395405104, i3, -1, "com.paypal.oslo.feature.contacts.api.SearchContactsButtonContents (ContactsApiImpl.kt:223)");
                }
                boolean z = (i3 & 14) == 4;
                java.lang.Object rememberedValue = startRestartGroup.rememberedValue();
                if (z || rememberedValue == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                    rememberedValue = new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.feature.contacts.api.ContactsApiImplKt$$ExternalSyntheticLambda7
                        @Override // kotlin.jvm.functions.Function0
                        public final java.lang.Object invoke() {
                            return com.paypal.oslo.feature.contacts.api.ContactsApiImplKt.$r8$lambda$et5kqxV7a31pbbiELFQ7BdDEy3M(kotlin.jvm.functions.Function0.this);
                        }
                    };
                    startRestartGroup.updateRememberedValue(rememberedValue);
                }
                com.paypal.oslo.feature.contacts.ui.contacts.views.SearchContactKt.SearchContact(new com.paypal.oslo.feature.contacts.api.configs.SearchBarConfig(str, true, null, null, false, 28, null), new com.paypal.oslo.feature.contacts.ui.contacts.views.SearchContactListenerSuite(null, null, (kotlin.jvm.functions.Function0) rememberedValue, 3, null), modifier4, null, null, startRestartGroup, i3 & 896, 24);
                if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                    androidx.compose.runtime.ComposerKt.traceEventEnd();
                }
                modifier3 = modifier4;
            }
            endRestartGroup = startRestartGroup.endRestartGroup();
            if (endRestartGroup == null) {
                endRestartGroup.updateScope(new kotlin.jvm.functions.Function2() { // from class: com.paypal.oslo.feature.contacts.api.ContactsApiImplKt$$ExternalSyntheticLambda8
                    @Override // kotlin.jvm.functions.Function2
                    public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                        return com.paypal.oslo.feature.contacts.api.ContactsApiImplKt.m13639$r8$lambda$BVU0Nk9mpK9XbPzCk8hPEoTbM4(kotlin.jvm.functions.Function0.this, str, modifier3, i, i2, (androidx.compose.runtime.Composer) obj, ((java.lang.Integer) obj2).intValue());
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

    public static /* synthetic */ kotlin.Unit $r8$lambda$2e2J2WU8HYYgEkeiU2At7GvI_5U(int i, androidx.compose.runtime.Composer composer, int i2) {
        final int updateChangedFlags = androidx.compose.runtime.RecomposeScopeImplKt.updateChangedFlags(i | 1);
        androidx.compose.runtime.Composer startRestartGroup = composer.startRestartGroup(-512508595);
        if (!startRestartGroup.shouldExecute(updateChangedFlags != 0, updateChangedFlags & 1)) {
            startRestartGroup.skipToGroupEnd();
        } else {
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventStart(-512508595, updateChangedFlags, -1, "com.paypal.oslo.feature.contacts.api.PreSearchContactViewNonEmptyPreview (ContactsApiImpl.kt:238)");
            }
            com.paypal.oslo.feature.contacts.api.configs.PreSearchContactViewConfig preSearchContactViewConfig = new com.paypal.oslo.feature.contacts.api.configs.PreSearchContactViewConfig(new com.paypal.oslo.feature.contacts.api.configs.SearchBarConfig(androidx.compose.ui.res.StringResources_androidKt.stringResource(com.paypal.oslo.feature.contacts.R.string.feature_contacts_contacts_search_placeholder, startRestartGroup, 0), true, null, null, false, 28, null), new com.paypal.oslo.feature.contacts.api.configs.CTAGroupConfig(kotlin.collections.CollectionsKt.listOf((java.lang.Object[]) new com.paypal.oslo.feature.contacts.api.configs.ContactsCTAType[]{com.paypal.oslo.feature.contacts.api.configs.ContactsCTAType.LINK.INSTANCE, com.paypal.oslo.feature.contacts.api.configs.ContactsCTAType.SCAN.INSTANCE, com.paypal.oslo.feature.contacts.api.configs.ContactsCTAType.ADDCONTACT.INSTANCE})), new com.paypal.oslo.feature.contacts.api.configs.ContactsListConfig(true, false, false, 4, null));
            com.paypal.oslo.feature.contacts.api.ContactType contactType = null;
            java.lang.String str = null;
            boolean z = false;
            java.lang.String str2 = null;
            java.lang.String str3 = null;
            java.lang.String str4 = null;
            java.lang.String str5 = null;
            boolean z2 = false;
            boolean z3 = false;
            boolean z4 = false;
            int i3 = 0;
            com.paypal.oslo.feature.contacts.api.ContactNameType contactNameType = null;
            java.lang.String str6 = null;
            int i4 = 523144;
            kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker = null;
            com.paypal.oslo.feature.contacts.api.ContactType contactType2 = null;
            java.lang.String str7 = null;
            java.lang.String str8 = null;
            java.lang.String str9 = null;
            java.lang.String str10 = null;
            boolean z5 = false;
            boolean z6 = false;
            boolean z7 = false;
            int i5 = 0;
            com.paypal.oslo.feature.contacts.api.ContactNameType contactNameType2 = null;
            java.lang.String str11 = null;
            kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker2 = null;
            java.util.List listOf = kotlin.collections.CollectionsKt.listOf((java.lang.Object[]) new com.paypal.oslo.feature.contacts.domain.models.contacts.ContactSearch.ContactItem[]{new com.paypal.oslo.feature.contacts.domain.models.contacts.ContactSearch.ContactItem("1", "John", "Doe", contactType, "+1234567890", "john.doe@example.com", str, z, str2, str3, com.paypal.oslo.feature.contacts.api.ContactActionType.Info, str4, str5, z2, z3, z4, i3, contactNameType, str6, i4, defaultConstructorMarker), new com.paypal.oslo.feature.contacts.domain.models.contacts.ContactSearch.ContactItem(androidx.exifinterface.media.ExifInterface.GPS_MEASUREMENT_2D, "Jane", "Smith", contactType2, "+0987654321", "jane.smith@example.com", str7, false, null, str8, com.paypal.oslo.feature.contacts.api.ContactActionType.Info, str9, str10, z5, z6, z7, i5, contactNameType2, str11, 523144, defaultConstructorMarker2), new com.paypal.oslo.feature.contacts.domain.models.contacts.ContactSearch.ContactItem(androidx.exifinterface.media.ExifInterface.GPS_MEASUREMENT_3D, "Alice", "Johnson", contactType, null, "alice.johnson@example.com", str, z, str2, str3, com.paypal.oslo.feature.contacts.api.ContactActionType.Info, str4, str5, z2, z3, z4, i3, contactNameType, str6, i4, defaultConstructorMarker), new com.paypal.oslo.feature.contacts.domain.models.contacts.ContactSearch.ContactItem("4", "Bob", "Williams", contactType2, "+1122334455", null, str7, true, "Venmo", str8, com.paypal.oslo.feature.contacts.api.ContactActionType.Info, str9, str10, z5, z6, z7, i5, contactNameType2, str11, 522760, defaultConstructorMarker2)});
            java.lang.Object rememberedValue = startRestartGroup.rememberedValue();
            if (rememberedValue == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                rememberedValue = new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.contacts.api.ContactsApiImplKt$$ExternalSyntheticLambda10
                    @Override // kotlin.jvm.functions.Function1
                    public final java.lang.Object invoke(java.lang.Object obj) {
                        return com.paypal.oslo.feature.contacts.api.ContactsApiImplKt.$r8$lambda$ThnEScADNgVl2cNH2vE303AQn9g((com.paypal.oslo.feature.contacts.api.callbacks.ContactsCallbackEvent) obj);
                    }
                };
                startRestartGroup.updateRememberedValue(rememberedValue);
            }
            com.paypal.oslo.feature.contacts.api.ContactsApi.ComposeDefaultImpls.PreSearchContactView$default(preSearchContactViewConfig, listOf, (kotlin.jvm.functions.Function1) rememberedValue, new com.paypal.oslo.feature.contacts.api.configs.ContactsPayloadConfig(com.paypal.oslo.feature.contacts.api.ContactSearchNetworkType.SEND), androidx.compose.foundation.layout.PaddingKt.m1706padding3ABfNKs(androidx.compose.ui.Modifier.INSTANCE, com.paypal.pds.core.ConstantsKt.getSpacing12()), new com.paypal.oslo.feature.contacts.api.ContactsApiImpl(), startRestartGroup, 3456, 0);
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventEnd();
            }
        }
        androidx.compose.runtime.ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new kotlin.jvm.functions.Function2() { // from class: com.paypal.oslo.feature.contacts.api.ContactsApiImplKt$$ExternalSyntheticLambda11
                @Override // kotlin.jvm.functions.Function2
                public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                    return com.paypal.oslo.feature.contacts.api.ContactsApiImplKt.$r8$lambda$2e2J2WU8HYYgEkeiU2At7GvI_5U(updateChangedFlags, (androidx.compose.runtime.Composer) obj, ((java.lang.Integer) obj2).intValue());
                }
            });
        }
        return kotlin.Unit.INSTANCE;
    }

    /* renamed from: $r8$lambda$6H9aj9WoqzcJzP-ywlrkMqRwUYc, reason: not valid java name */
    public static /* synthetic */ kotlin.Unit m13638$r8$lambda$6H9aj9WoqzcJzPywlrkMqRwUYc(com.paypal.oslo.feature.contacts.api.callbacks.ContactsCallbackEvent contactsCallbackEvent) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(contactsCallbackEvent, "");
        return kotlin.Unit.INSTANCE;
    }

    /* renamed from: $r8$lambda$BVU0Nk9mpK9XbPzCk8hPEoTb-M4, reason: not valid java name */
    public static /* synthetic */ kotlin.Unit m13639$r8$lambda$BVU0Nk9mpK9XbPzCk8hPEoTbM4(kotlin.jvm.functions.Function0 function0, java.lang.String str, androidx.compose.ui.Modifier modifier, int i, int i2, androidx.compose.runtime.Composer composer, int i3) {
        Camera2StreamConfigurationMap(function0, str, modifier, composer, androidx.compose.runtime.RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$C6rT8uJPA8Yj0zEa2HT6ggqrM2U(kotlin.jvm.functions.Function1 function1) {
        function1.invoke(new com.paypal.oslo.feature.contacts.api.callbacks.ContactsCallbackEvent.CustomActionEvent.InfoIconClicked(com.paypal.oslo.feature.contacts.api.configs.ContactsCTAType.SCAN.INSTANCE));
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$D9GqOPTm9Q5rOqnyS0FnbAACqVc(com.paypal.oslo.feature.contacts.api.configs.CTAGroupConfig cTAGroupConfig, boolean z, kotlin.jvm.functions.Function1 function1, int i, androidx.compose.runtime.Composer composer, int i2) {
        getHighSpeedVideoFpsRangesFor(cTAGroupConfig, z, function1, composer, androidx.compose.runtime.RecomposeScopeImplKt.updateChangedFlags(i | 1));
        return kotlin.Unit.INSTANCE;
    }

    /* renamed from: $r8$lambda$HCKe64EVUMn-BjJIQpShP77T-8I, reason: not valid java name */
    public static /* synthetic */ kotlin.Unit m13640$r8$lambda$HCKe64EVUMnBjJIQpShP77T8I(com.paypal.oslo.feature.contacts.api.configs.ContactsListConfig contactsListConfig, java.util.List list, kotlin.jvm.functions.Function1 function1, int i, androidx.compose.runtime.Composer composer, int i2) {
        Camera2StreamConfigurationMap(contactsListConfig, list, function1, composer, androidx.compose.runtime.RecomposeScopeImplKt.updateChangedFlags(i | 1));
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$KSewUJUkW5plCx5RMXk7qK90128(kotlin.jvm.functions.Function1 function1) {
        function1.invoke(com.paypal.oslo.feature.contacts.api.callbacks.ContactsCallbackEvent.SearchEvent.SearchBarClicked.INSTANCE);
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$ThnEScADNgVl2cNH2vE303AQn9g(com.paypal.oslo.feature.contacts.api.callbacks.ContactsCallbackEvent contactsCallbackEvent) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(contactsCallbackEvent, "");
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$Y8IJglsR9DZ3foax6qJJyZtmwzI(kotlin.jvm.functions.Function1 function1) {
        function1.invoke(new com.paypal.oslo.feature.contacts.api.callbacks.ContactsCallbackEvent.CustomActionEvent.InfoIconClicked(com.paypal.oslo.feature.contacts.api.configs.ContactsCTAType.ADDCONTACT.INSTANCE));
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$_jZHGiTdGKPe1iRiKYyKdybMOKM(kotlin.jvm.functions.Function1 function1) {
        function1.invoke(new com.paypal.oslo.feature.contacts.api.callbacks.ContactsCallbackEvent.CustomActionEvent.InfoIconClicked(com.paypal.oslo.feature.contacts.api.configs.ContactsCTAType.LINK.INSTANCE));
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$c9yCbAOJZKGY0SMcFXVMOojCiJE(int i, androidx.compose.runtime.Composer composer, int i2) {
        final int updateChangedFlags = androidx.compose.runtime.RecomposeScopeImplKt.updateChangedFlags(i | 1);
        androidx.compose.runtime.Composer startRestartGroup = composer.startRestartGroup(62730058);
        if (!startRestartGroup.shouldExecute(updateChangedFlags != 0, updateChangedFlags & 1)) {
            startRestartGroup.skipToGroupEnd();
        } else {
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventStart(62730058, updateChangedFlags, -1, "com.paypal.oslo.feature.contacts.api.PreSearchContactViewEmptyPreview (ContactsApiImpl.kt:311)");
            }
            com.paypal.oslo.feature.contacts.api.configs.PreSearchContactViewConfig preSearchContactViewConfig = new com.paypal.oslo.feature.contacts.api.configs.PreSearchContactViewConfig(new com.paypal.oslo.feature.contacts.api.configs.SearchBarConfig(androidx.compose.ui.res.StringResources_androidKt.stringResource(com.paypal.oslo.feature.contacts.R.string.feature_contacts_contacts_search_placeholder, startRestartGroup, 0), true, null, null, false, 28, null), new com.paypal.oslo.feature.contacts.api.configs.CTAGroupConfig(kotlin.collections.CollectionsKt.listOf((java.lang.Object[]) new com.paypal.oslo.feature.contacts.api.configs.ContactsCTAType[]{com.paypal.oslo.feature.contacts.api.configs.ContactsCTAType.LINK.INSTANCE, com.paypal.oslo.feature.contacts.api.configs.ContactsCTAType.SCAN.INSTANCE, com.paypal.oslo.feature.contacts.api.configs.ContactsCTAType.ADDCONTACT.INSTANCE})), new com.paypal.oslo.feature.contacts.api.configs.ContactsListConfig(false, false, false, 7, null));
            java.util.List emptyList = kotlin.collections.CollectionsKt.emptyList();
            java.lang.Object rememberedValue = startRestartGroup.rememberedValue();
            if (rememberedValue == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                rememberedValue = new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.contacts.api.ContactsApiImplKt$$ExternalSyntheticLambda0
                    @Override // kotlin.jvm.functions.Function1
                    public final java.lang.Object invoke(java.lang.Object obj) {
                        return com.paypal.oslo.feature.contacts.api.ContactsApiImplKt.m13638$r8$lambda$6H9aj9WoqzcJzPywlrkMqRwUYc((com.paypal.oslo.feature.contacts.api.callbacks.ContactsCallbackEvent) obj);
                    }
                };
                startRestartGroup.updateRememberedValue(rememberedValue);
            }
            com.paypal.oslo.feature.contacts.api.ContactsApi.ComposeDefaultImpls.PreSearchContactView$default(preSearchContactViewConfig, emptyList, (kotlin.jvm.functions.Function1) rememberedValue, new com.paypal.oslo.feature.contacts.api.configs.ContactsPayloadConfig(com.paypal.oslo.feature.contacts.api.ContactSearchNetworkType.REQUEST), androidx.compose.foundation.layout.PaddingKt.m1706padding3ABfNKs(androidx.compose.ui.Modifier.INSTANCE, com.paypal.pds.core.ConstantsKt.getSpacing12()), new com.paypal.oslo.feature.contacts.api.ContactsApiImpl(), startRestartGroup, 3504, 0);
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventEnd();
            }
        }
        androidx.compose.runtime.ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new kotlin.jvm.functions.Function2() { // from class: com.paypal.oslo.feature.contacts.api.ContactsApiImplKt$$ExternalSyntheticLambda9
                @Override // kotlin.jvm.functions.Function2
                public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                    return com.paypal.oslo.feature.contacts.api.ContactsApiImplKt.$r8$lambda$c9yCbAOJZKGY0SMcFXVMOojCiJE(updateChangedFlags, (androidx.compose.runtime.Composer) obj, ((java.lang.Integer) obj2).intValue());
                }
            });
        }
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$dnaAeRj8r2p2SLTd1UajyoWIm1g(kotlin.jvm.functions.Function1 function1) {
        function1.invoke(new com.paypal.oslo.feature.contacts.api.callbacks.ContactsCallbackEvent.CustomActionEvent.InfoIconClicked(com.paypal.oslo.feature.contacts.api.configs.ContactsCTAType.SYNC.INSTANCE));
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$et5kqxV7a31pbbiELFQ7BdDEy3M(kotlin.jvm.functions.Function0 function0) {
        function0.invoke();
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$i5ExQ3Z_xA2UJwESTEHISx1EZQs(kotlin.jvm.functions.Function1 function1) {
        function1.invoke(new com.paypal.oslo.feature.contacts.api.callbacks.ContactsCallbackEvent.CustomActionEvent.CardClicked(com.paypal.oslo.feature.contacts.api.configs.ContactsCTAType.SYNC.INSTANCE));
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$pXBjhfFRUxtrKSolvU5wPrE_vEg(kotlin.jvm.functions.Function1 function1) {
        function1.invoke(new com.paypal.oslo.feature.contacts.api.callbacks.ContactsCallbackEvent.CustomActionEvent.CardClicked(com.paypal.oslo.feature.contacts.api.configs.ContactsCTAType.SCAN.INSTANCE));
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$qP8YXtHwDi0VKe_aRGaVcQG1KJo(kotlin.jvm.functions.Function1 function1) {
        function1.invoke(new com.paypal.oslo.feature.contacts.api.callbacks.ContactsCallbackEvent.CustomActionEvent.CardClicked(com.paypal.oslo.feature.contacts.api.configs.ContactsCTAType.ADDCONTACT.INSTANCE));
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$vUP1VO29SXNhnOiOzfx1AO5NFvo(java.lang.String str, kotlin.jvm.functions.Function1 function1, int i, androidx.compose.runtime.Composer composer, int i2) {
        getHighSpeedVideoSizes(str, function1, composer, androidx.compose.runtime.RecomposeScopeImplKt.updateChangedFlags(i | 1));
        return kotlin.Unit.INSTANCE;
    }

    /* renamed from: $r8$lambda$wP6-O8FsM9MtLwtbwRD0Ssbyozw, reason: not valid java name */
    public static /* synthetic */ kotlin.Unit m13641$r8$lambda$wP6O8FsM9MtLwtbwRD0Ssbyozw(kotlin.jvm.functions.Function1 function1) {
        function1.invoke(new com.paypal.oslo.feature.contacts.api.callbacks.ContactsCallbackEvent.CustomActionEvent.CardClicked(com.paypal.oslo.feature.contacts.api.configs.ContactsCTAType.LINK.INSTANCE));
        return kotlin.Unit.INSTANCE;
    }
}
