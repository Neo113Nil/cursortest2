package com.paypal.oslo.feature.businesscustomers.ui.customerform.components;

@kotlin.Metadata(d1 = {"\u0000\"\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\u001a\u001f\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\b\b\u0002\u0010\u0007\u001a\u00020\bH\u0001¢\u0006\u0002\u0010\t\u001a\r\u0010\n\u001a\u00020\u0004H\u0001¢\u0006\u0002\u0010\u000b\"\u000e\u0010\u0000\u001a\u00020\u0001X\u0080T¢\u0006\u0002\n\u0000\"\u000e\u0010\u0002\u001a\u00020\u0001X\u0080T¢\u0006\u0002\n\u0000¨\u0006\f²\u0006\n\u0010\r\u001a\u00020\u000eX\u008a\u008e\u0002"}, d2 = {"CustomerNotesSectionAccordionHeaderTestTag", "", "CustomerNotesSectionTextAreaTestTag", "CustomerNotesSection", "", "state", "Lcom/paypal/oslo/feature/businesscustomers/ui/model/NotesInputState;", "modifier", "Landroidx/compose/ui/Modifier;", "(Lcom/paypal/oslo/feature/businesscustomers/ui/model/NotesInputState;Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;II)V", "CustomerNotesSectionPreview", "(Landroidx/compose/runtime/Composer;I)V", "business-customers_prodRelease", com.paypal.oslo.feature.p2p.domain.constants.P2pConstants.Log.Attributes.IS_EXPANDED, ""}, k = 2, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class CustomerNotesSectionKt {
    public static final java.lang.String CustomerNotesSectionAccordionHeaderTestTag = "CustomerNotesSection_AccordionHeader";
    public static final java.lang.String CustomerNotesSectionTextAreaTestTag = "CustomerNotesSection_TextArea";

    /* JADX WARN: Removed duplicated region for block: B:13:0x0049  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0054  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0114  */
    /* JADX WARN: Removed duplicated region for block: B:45:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:51:0x010b  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x004b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void CustomerNotesSection(final com.paypal.oslo.feature.businesscustomers.ui.model.NotesInputState notesInputState, androidx.compose.ui.Modifier modifier, androidx.compose.runtime.Composer composer, final int i, final int i2) {
        int i3;
        final androidx.compose.ui.Modifier modifier2;
        androidx.compose.runtime.ScopeUpdateScope endRestartGroup;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(notesInputState, "");
        androidx.compose.runtime.Composer startRestartGroup = composer.startRestartGroup(-163867637);
        if ((i & 6) == 0) {
            i3 = (startRestartGroup.changed(notesInputState) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        int i4 = i2 & 2;
        if (i4 != 0) {
            i3 |= 48;
        } else if ((i & 48) == 0) {
            modifier2 = modifier;
            i3 |= startRestartGroup.changed(modifier2) ? 32 : 16;
            if (startRestartGroup.shouldExecute((i3 & 19) == 18, i3 & 1)) {
                startRestartGroup.skipToGroupEnd();
            } else {
                androidx.compose.ui.Modifier modifier3 = i4 != 0 ? androidx.compose.ui.Modifier.INSTANCE : modifier2;
                if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                    androidx.compose.runtime.ComposerKt.traceEventStart(-163867637, i3, -1, "com.paypal.oslo.feature.businesscustomers.ui.customerform.components.CustomerNotesSection (CustomerNotesSection.kt:40)");
                }
                java.lang.Object[] objArr = new java.lang.Object[0];
                boolean z = (i3 & 14) == 4;
                java.lang.Object rememberedValue = startRestartGroup.rememberedValue();
                if (z || rememberedValue == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                    rememberedValue = new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.feature.businesscustomers.ui.customerform.components.CustomerNotesSectionKt$$ExternalSyntheticLambda0
                        @Override // kotlin.jvm.functions.Function0
                        public final java.lang.Object invoke() {
                            androidx.compose.runtime.MutableState mutableStateOf$default;
                            com.paypal.oslo.feature.businesscustomers.ui.model.NotesInputState notesInputState2 = com.paypal.oslo.feature.businesscustomers.ui.model.NotesInputState.this;
                            mutableStateOf$default = androidx.compose.runtime.SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(java.lang.Boolean.valueOf(!kotlin.text.StringsKt.isBlank(notesInputState2.getInitialNotes())), null, 2, null);
                            return mutableStateOf$default;
                        }
                    };
                    startRestartGroup.updateRememberedValue(rememberedValue);
                }
                final androidx.compose.runtime.MutableState mutableState = (androidx.compose.runtime.MutableState) androidx.compose.runtime.saveable.RememberSaveableKt.rememberSaveable(objArr, (kotlin.jvm.functions.Function0) rememberedValue, startRestartGroup, 0);
                androidx.compose.ui.Modifier fillMaxWidth$default = androidx.compose.foundation.layout.SizeKt.fillMaxWidth$default(modifier3, 0.0f, 1, null);
                java.util.List listOf = kotlin.collections.CollectionsKt.listOf(androidx.compose.ui.res.StringResources_androidKt.stringResource(com.paypal.oslo.feature.businesscustomers.R.string.feature_business_customers_form_notes_header, startRestartGroup, 0));
                boolean changed = startRestartGroup.changed(mutableState);
                java.lang.Object rememberedValue2 = startRestartGroup.rememberedValue();
                if (changed || rememberedValue2 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                    rememberedValue2 = new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.businesscustomers.ui.customerform.components.CustomerNotesSectionKt$$ExternalSyntheticLambda1
                        @Override // kotlin.jvm.functions.Function1
                        public final java.lang.Object invoke(java.lang.Object obj) {
                            return java.lang.Boolean.valueOf(com.paypal.oslo.feature.businesscustomers.ui.customerform.components.CustomerNotesSectionKt.$r8$lambda$s0FdII9vxGR1P21fQrLCgFxiGLY(androidx.compose.runtime.MutableState.this, (java.lang.String) obj));
                        }
                    };
                    startRestartGroup.updateRememberedValue(rememberedValue2);
                }
                kotlin.jvm.functions.Function1 function1 = (kotlin.jvm.functions.Function1) rememberedValue2;
                boolean changed2 = startRestartGroup.changed(mutableState);
                java.lang.Object rememberedValue3 = startRestartGroup.rememberedValue();
                if (changed2 || rememberedValue3 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                    rememberedValue3 = new kotlin.jvm.functions.Function2() { // from class: com.paypal.oslo.feature.businesscustomers.ui.customerform.components.CustomerNotesSectionKt$$ExternalSyntheticLambda2
                        @Override // kotlin.jvm.functions.Function2
                        public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                            return com.paypal.oslo.feature.businesscustomers.ui.customerform.components.CustomerNotesSectionKt.$r8$lambda$Be6Yy8i9tomMEo4IeYvIR4zLyzA(androidx.compose.runtime.MutableState.this, (java.lang.String) obj, ((java.lang.Integer) obj2).intValue());
                        }
                    };
                    startRestartGroup.updateRememberedValue(rememberedValue3);
                }
                androidx.compose.ui.Modifier modifier4 = modifier3;
                com.paypal.pds.components.AccordionKt.Accordion(listOf, function1, fillMaxWidth$default, (kotlin.jvm.functions.Function2) rememberedValue3, false, com.paypal.oslo.feature.businesscustomers.ui.customerform.components.ComposableSingletons$CustomerNotesSectionKt.INSTANCE.m12773getLambda$1171662673$business_customers_prodRelease(), androidx.compose.runtime.internal.ComposableLambdaKt.rememberComposableLambda(241613051, true, new kotlin.jvm.functions.Function4() { // from class: com.paypal.oslo.feature.businesscustomers.ui.customerform.components.CustomerNotesSectionKt$$ExternalSyntheticLambda3
                    @Override // kotlin.jvm.functions.Function4
                    public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2, java.lang.Object obj3, java.lang.Object obj4) {
                        return com.paypal.oslo.feature.businesscustomers.ui.customerform.components.CustomerNotesSectionKt.$r8$lambda$iEqDV2d_1m56rRuYq0WkAPcCf3M(com.paypal.oslo.feature.businesscustomers.ui.model.NotesInputState.this, (com.paypal.pds.components.AccordionBodyScope) obj, (java.lang.String) obj2, (androidx.compose.runtime.Composer) obj3, ((java.lang.Integer) obj4).intValue());
                    }
                }, startRestartGroup, 54), null, startRestartGroup, 1794048, 128);
                if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                    androidx.compose.runtime.ComposerKt.traceEventEnd();
                }
                modifier2 = modifier4;
            }
            endRestartGroup = startRestartGroup.endRestartGroup();
            if (endRestartGroup == null) {
                endRestartGroup.updateScope(new kotlin.jvm.functions.Function2() { // from class: com.paypal.oslo.feature.businesscustomers.ui.customerform.components.CustomerNotesSectionKt$$ExternalSyntheticLambda4
                    @Override // kotlin.jvm.functions.Function2
                    public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                        return com.paypal.oslo.feature.businesscustomers.ui.customerform.components.CustomerNotesSectionKt.$r8$lambda$x6m4t1FLvtuVcCdv_QTxfotFRSw(com.paypal.oslo.feature.businesscustomers.ui.model.NotesInputState.this, modifier2, i, i2, (androidx.compose.runtime.Composer) obj, ((java.lang.Integer) obj2).intValue());
                    }
                });
                return;
            }
            return;
        }
        modifier2 = modifier;
        if (startRestartGroup.shouldExecute((i3 & 19) == 18, i3 & 1)) {
        }
        endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup == null) {
        }
    }

    public static final void CustomerNotesSectionPreview(androidx.compose.runtime.Composer composer, final int i) {
        androidx.compose.runtime.Composer startRestartGroup = composer.startRestartGroup(1754011950);
        if (!startRestartGroup.shouldExecute(i != 0, i & 1)) {
            startRestartGroup.skipToGroupEnd();
        } else {
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventStart(1754011950, i, -1, "com.paypal.oslo.feature.businesscustomers.ui.customerform.components.CustomerNotesSectionPreview (CustomerNotesSection.kt:71)");
            }
            java.lang.Object rememberedValue = startRestartGroup.rememberedValue();
            if (rememberedValue == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                rememberedValue = new com.paypal.oslo.feature.businesscustomers.ui.model.NotesInputState(com.paypal.oslo.feature.businesscustomers.ui.customerform.components.EditNotesItemKt.getCustomerNotesLoremIpsum());
                startRestartGroup.updateRememberedValue(rememberedValue);
            }
            CustomerNotesSection((com.paypal.oslo.feature.businesscustomers.ui.model.NotesInputState) rememberedValue, com.paypal.pds.core.ModifierExtensionsKt.background((androidx.compose.ui.Modifier) androidx.compose.ui.Modifier.INSTANCE, (com.paypal.pds.core.Color) com.paypal.pds.core.Color.BackgroundBase.INSTANCE, (androidx.compose.ui.graphics.Shape) null, startRestartGroup, 54, 2), startRestartGroup, 6, 0);
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventEnd();
            }
        }
        androidx.compose.runtime.ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new kotlin.jvm.functions.Function2() { // from class: com.paypal.oslo.feature.businesscustomers.ui.customerform.components.CustomerNotesSectionKt$$ExternalSyntheticLambda6
                @Override // kotlin.jvm.functions.Function2
                public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                    return com.paypal.oslo.feature.businesscustomers.ui.customerform.components.CustomerNotesSectionKt.m12797$r8$lambda$BdRs9N8iHxaIDyYsodNx52RYak(i, (androidx.compose.runtime.Composer) obj, ((java.lang.Integer) obj2).intValue());
                }
            });
        }
    }

    /* renamed from: $r8$lambda$BdRs9N8i-HxaIDyYsodNx52RYak, reason: not valid java name */
    public static /* synthetic */ kotlin.Unit m12797$r8$lambda$BdRs9N8iHxaIDyYsodNx52RYak(int i, androidx.compose.runtime.Composer composer, int i2) {
        CustomerNotesSectionPreview(composer, androidx.compose.runtime.RecomposeScopeImplKt.updateChangedFlags(i | 1));
        return kotlin.Unit.INSTANCE;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ kotlin.Unit $r8$lambda$Be6Yy8i9tomMEo4IeYvIR4zLyzA(androidx.compose.runtime.MutableState mutableState, java.lang.String str, int i) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
        mutableState.setValue(java.lang.Boolean.valueOf(!((java.lang.Boolean) mutableState.getValue()).booleanValue()));
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$iEqDV2d_1m56rRuYq0WkAPcCf3M(final com.paypal.oslo.feature.businesscustomers.ui.model.NotesInputState notesInputState, com.paypal.pds.components.AccordionBodyScope accordionBodyScope, java.lang.String str, androidx.compose.runtime.Composer composer, int i) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(accordionBodyScope, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
        if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
            androidx.compose.runtime.ComposerKt.traceEventStart(241613051, i, -1, "com.paypal.oslo.feature.businesscustomers.ui.customerform.components.CustomerNotesSection.<anonymous> (CustomerNotesSection.kt:60)");
        }
        java.lang.String notes = notesInputState.getNotes();
        boolean changed = composer.changed(notesInputState);
        java.lang.Object rememberedValue = composer.rememberedValue();
        if (changed || rememberedValue == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
            rememberedValue = new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.businesscustomers.ui.customerform.components.CustomerNotesSectionKt$$ExternalSyntheticLambda5
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj) {
                    return com.paypal.oslo.feature.businesscustomers.ui.customerform.components.CustomerNotesSectionKt.m12798$r8$lambda$uiHPIXspCFvUV42hHWDqfZsD4(com.paypal.oslo.feature.businesscustomers.ui.model.NotesInputState.this, (java.lang.String) obj);
                }
            };
            composer.updateRememberedValue(rememberedValue);
        }
        com.paypal.oslo.feature.businesscustomers.ui.customerform.components.EditNotesItemKt.EditNotesItem(notes, (kotlin.jvm.functions.Function1) rememberedValue, androidx.compose.ui.platform.TestTagKt.testTag(androidx.compose.ui.Modifier.INSTANCE, CustomerNotesSectionTextAreaTestTag), composer, 384, 0);
        if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
            androidx.compose.runtime.ComposerKt.traceEventEnd();
        }
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ java.lang.String $r8$lambda$qykEB4UHgewnpGu10q2ebkxNE7Q(java.lang.String str, java.lang.String str2) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str2, "");
        return str;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ boolean $r8$lambda$s0FdII9vxGR1P21fQrLCgFxiGLY(androidx.compose.runtime.MutableState mutableState, java.lang.String str) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
        return ((java.lang.Boolean) mutableState.getValue()).booleanValue();
    }

    /* renamed from: $r8$lambda$uiHPIXspC-FvUV42hHWDqfZsD-4, reason: not valid java name */
    public static /* synthetic */ kotlin.Unit m12798$r8$lambda$uiHPIXspCFvUV42hHWDqfZsD4(com.paypal.oslo.feature.businesscustomers.ui.model.NotesInputState notesInputState, final java.lang.String str) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
        notesInputState.update(new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.businesscustomers.ui.customerform.components.CustomerNotesSectionKt$$ExternalSyntheticLambda7
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return com.paypal.oslo.feature.businesscustomers.ui.customerform.components.CustomerNotesSectionKt.$r8$lambda$qykEB4UHgewnpGu10q2ebkxNE7Q(str, (java.lang.String) obj);
            }
        });
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$x6m4t1FLvtuVcCdv_QTxfotFRSw(com.paypal.oslo.feature.businesscustomers.ui.model.NotesInputState notesInputState, androidx.compose.ui.Modifier modifier, int i, int i2, androidx.compose.runtime.Composer composer, int i3) {
        CustomerNotesSection(notesInputState, modifier, composer, androidx.compose.runtime.RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
        return kotlin.Unit.INSTANCE;
    }
}
