package com.paypal.oslo.feature.contacts.ui.contacts.views;

@kotlin.Metadata(d1 = {"\u0000(\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\u001a-\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00030\u00072\b\b\u0002\u0010\b\u001a\u00020\tH\u0001¢\u0006\u0002\u0010\n\u001a1\u0010\u0002\u001a\u00020\u0003*\u00020\u000b2\u0006\u0010\u0004\u001a\u00020\u00052\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00030\u00072\b\b\u0002\u0010\b\u001a\u00020\tH\u0001¢\u0006\u0002\u0010\f\u001a-\u0010\r\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00030\u00072\b\b\u0002\u0010\b\u001a\u00020\tH\u0003¢\u0006\u0002\u0010\n\u001a\r\u0010\u000e\u001a\u00020\u0003H\u0003¢\u0006\u0002\u0010\u000f\u001a\r\u0010\u0010\u001a\u00020\u0003H\u0003¢\u0006\u0002\u0010\u000f\"\u000e\u0010\u0000\u001a\u00020\u0001X\u0086T¢\u0006\u0002\n\u0000¨\u0006\u0011"}, d2 = {"HeaderActionTag", "", "ContactHeaderItem", "", com.paypal.oslo.feature.p2p.ui.success.utils.SuccessConstants.HEADER, "Lcom/paypal/oslo/feature/contacts/api/ContactSearchHeaderItem;", "onHeaderActionClick", "Lkotlin/Function0;", "modifier", "Landroidx/compose/ui/Modifier;", "(Lcom/paypal/oslo/feature/contacts/api/ContactSearchHeaderItem;Lkotlin/jvm/functions/Function0;Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;II)V", "Landroidx/compose/foundation/lazy/LazyItemScope;", "(Landroidx/compose/foundation/lazy/LazyItemScope;Lcom/paypal/oslo/feature/contacts/api/ContactSearchHeaderItem;Lkotlin/jvm/functions/Function0;Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;II)V", "ContactHeaderItemContent", "ContactHeaderItemWithActionPreview", "(Landroidx/compose/runtime/Composer;I)V", "ContactHeaderItemWithoutActionPreview", "contacts_prodRelease"}, k = 2, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class ContactHeaderItemKt {
    public static final java.lang.String HeaderActionTag = "header_action_tag";

    public static final void ContactHeaderItem(final com.paypal.oslo.feature.contacts.api.ContactSearchHeaderItem contactSearchHeaderItem, final kotlin.jvm.functions.Function0<kotlin.Unit> function0, androidx.compose.ui.Modifier modifier, androidx.compose.runtime.Composer composer, final int i, final int i2) {
        int i3;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(contactSearchHeaderItem, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(function0, "");
        androidx.compose.runtime.Composer startRestartGroup = composer.startRestartGroup(1896186500);
        if ((i & 6) == 0) {
            i3 = (startRestartGroup.changedInstance(contactSearchHeaderItem) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i & 48) == 0) {
            i3 |= startRestartGroup.changedInstance(function0) ? 32 : 16;
        }
        int i4 = i2 & 4;
        if (i4 != 0) {
            i3 |= 384;
        } else if ((i & 384) == 0) {
            i3 |= startRestartGroup.changed(modifier) ? 256 : 128;
        }
        if (!startRestartGroup.shouldExecute((i3 & 147) != 146, i3 & 1)) {
            startRestartGroup.skipToGroupEnd();
        } else {
            if (i4 != 0) {
                modifier = androidx.compose.ui.Modifier.INSTANCE;
            }
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventStart(1896186500, i3, -1, "com.paypal.oslo.feature.contacts.ui.contacts.views.ContactHeaderItem (ContactHeaderItem.kt:49)");
            }
            getHighResolutionOutputSizeshNQ4ISI(contactSearchHeaderItem, function0, modifier, startRestartGroup, i3 & org.apache.commons.imaging.formats.jpeg.iptc.IptcConstants.IMAGE_RESOURCE_BLOCK_QUICK_MASK_INFO, 0);
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventEnd();
            }
        }
        final androidx.compose.ui.Modifier modifier2 = modifier;
        androidx.compose.runtime.ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new kotlin.jvm.functions.Function2() { // from class: com.paypal.oslo.feature.contacts.ui.contacts.views.ContactHeaderItemKt$$ExternalSyntheticLambda7
                @Override // kotlin.jvm.functions.Function2
                public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                    return com.paypal.oslo.feature.contacts.ui.contacts.views.ContactHeaderItemKt.m13656$r8$lambda$S48bVfPXyS7GjzXyRWl8zrOzXg(com.paypal.oslo.feature.contacts.api.ContactSearchHeaderItem.this, function0, modifier2, i, i2, (androidx.compose.runtime.Composer) obj, ((java.lang.Integer) obj2).intValue());
                }
            });
        }
    }

    public static final void ContactHeaderItem(final androidx.compose.foundation.lazy.LazyItemScope lazyItemScope, final com.paypal.oslo.feature.contacts.api.ContactSearchHeaderItem contactSearchHeaderItem, final kotlin.jvm.functions.Function0<kotlin.Unit> function0, androidx.compose.ui.Modifier modifier, androidx.compose.runtime.Composer composer, final int i, final int i2) {
        int i3;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(lazyItemScope, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(contactSearchHeaderItem, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(function0, "");
        androidx.compose.runtime.Composer startRestartGroup = composer.startRestartGroup(-509872187);
        if ((i & 6) == 0) {
            i3 = (startRestartGroup.changed(lazyItemScope) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i & 48) == 0) {
            i3 |= startRestartGroup.changedInstance(contactSearchHeaderItem) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i3 |= startRestartGroup.changedInstance(function0) ? 256 : 128;
        }
        int i4 = i2 & 4;
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
                androidx.compose.runtime.ComposerKt.traceEventStart(-509872187, i3, -1, "com.paypal.oslo.feature.contacts.ui.contacts.views.ContactHeaderItem (ContactHeaderItem.kt:72)");
            }
            getHighResolutionOutputSizeshNQ4ISI(contactSearchHeaderItem, function0, androidx.compose.foundation.lazy.LazyItemScope.animateItem$default(lazyItemScope, modifier, null, null, null, 7, null), startRestartGroup, (i3 >> 3) & 126, 0);
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventEnd();
            }
        }
        final androidx.compose.ui.Modifier modifier2 = modifier;
        androidx.compose.runtime.ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new kotlin.jvm.functions.Function2() { // from class: com.paypal.oslo.feature.contacts.ui.contacts.views.ContactHeaderItemKt$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function2
                public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                    return com.paypal.oslo.feature.contacts.ui.contacts.views.ContactHeaderItemKt.$r8$lambda$Yp0npawM7efTbCzM22lyTPpWbBA(androidx.compose.foundation.lazy.LazyItemScope.this, contactSearchHeaderItem, function0, modifier2, i, i2, (androidx.compose.runtime.Composer) obj, ((java.lang.Integer) obj2).intValue());
                }
            });
        }
    }

    private static final void getHighResolutionOutputSizeshNQ4ISI(final com.paypal.oslo.feature.contacts.api.ContactSearchHeaderItem contactSearchHeaderItem, final kotlin.jvm.functions.Function0<kotlin.Unit> function0, androidx.compose.ui.Modifier modifier, androidx.compose.runtime.Composer composer, final int i, final int i2) {
        int i3;
        androidx.compose.runtime.Composer startRestartGroup = composer.startRestartGroup(523622959);
        if ((i & 6) == 0) {
            i3 = (startRestartGroup.changedInstance(contactSearchHeaderItem) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i & 48) == 0) {
            i3 |= startRestartGroup.changedInstance(function0) ? 32 : 16;
        }
        int i4 = i2 & 4;
        if (i4 != 0) {
            i3 |= 384;
        } else if ((i & 384) == 0) {
            i3 |= startRestartGroup.changed(modifier) ? 256 : 128;
        }
        if (!startRestartGroup.shouldExecute((i3 & 147) != 146, i3 & 1)) {
            startRestartGroup.skipToGroupEnd();
        } else {
            if (i4 != 0) {
                modifier = androidx.compose.ui.Modifier.INSTANCE;
            }
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventStart(523622959, i3, -1, "com.paypal.oslo.feature.contacts.ui.contacts.views.ContactHeaderItemContent (ContactHeaderItem.kt:92)");
            }
            final com.paypal.oslo.feature.contacts.api.HeaderAction action = contactSearchHeaderItem.getAction();
            com.paypal.pds.components.SectionHeaderKt.SectionHeader(androidx.compose.foundation.layout.PaddingKt.m1708paddingVpY3zN4$default(androidx.compose.foundation.layout.SizeKt.fillMaxWidth$default(modifier, 0.0f, 1, null), 0.0f, action == null ? com.paypal.pds.core.ConstantsKt.getSpacing8() : com.paypal.pds.core.ConstantsKt.getSpacing0(), 1, null), contactSearchHeaderItem.getTitle(), null, androidx.compose.runtime.internal.ComposableLambdaKt.rememberComposableLambda(818306547, true, new kotlin.jvm.functions.Function2() { // from class: com.paypal.oslo.feature.contacts.ui.contacts.views.ContactHeaderItemKt$$ExternalSyntheticLambda1
                @Override // kotlin.jvm.functions.Function2
                public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                    return com.paypal.oslo.feature.contacts.ui.contacts.views.ContactHeaderItemKt.m13653$r8$lambda$0pqfcqQ0Kssav_KyZWv0xGcVM(com.paypal.oslo.feature.contacts.api.HeaderAction.this, function0, (androidx.compose.runtime.Composer) obj, ((java.lang.Integer) obj2).intValue());
                }
            }, startRestartGroup, 54), startRestartGroup, 3072, 4);
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventEnd();
            }
        }
        final androidx.compose.ui.Modifier modifier2 = modifier;
        androidx.compose.runtime.ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new kotlin.jvm.functions.Function2() { // from class: com.paypal.oslo.feature.contacts.ui.contacts.views.ContactHeaderItemKt$$ExternalSyntheticLambda2
                @Override // kotlin.jvm.functions.Function2
                public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                    return com.paypal.oslo.feature.contacts.ui.contacts.views.ContactHeaderItemKt.m13654$r8$lambda$76Rz0q0e1tcqLXjqz_HUvPYJpk(com.paypal.oslo.feature.contacts.api.ContactSearchHeaderItem.this, function0, modifier2, i, i2, (androidx.compose.runtime.Composer) obj, ((java.lang.Integer) obj2).intValue());
                }
            });
        }
    }

    /* renamed from: $r8$lambda$0pqf-cqQ-0Kssav_KyZWv0xGcVM, reason: not valid java name */
    public static /* synthetic */ kotlin.Unit m13653$r8$lambda$0pqfcqQ0Kssav_KyZWv0xGcVM(com.paypal.oslo.feature.contacts.api.HeaderAction headerAction, kotlin.jvm.functions.Function0 function0, androidx.compose.runtime.Composer composer, int i) {
        if (composer.shouldExecute((i & 3) != 2, i & 1)) {
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventStart(818306547, i, -1, "com.paypal.oslo.feature.contacts.ui.contacts.views.ContactHeaderItemContent.<anonymous> (ContactHeaderItem.kt:101)");
            }
            if (headerAction != null) {
                composer.startReplaceGroup(-63978182);
                com.paypal.pds.components.ButtonKt.Button(function0, headerAction.getLabel(), androidx.compose.foundation.layout.OffsetKt.m1679offsetVpY3zN4$default(androidx.compose.ui.platform.TestTagKt.testTag(androidx.compose.ui.Modifier.INSTANCE, HeaderActionTag), com.paypal.pds.core.ConstantsKt.getSpacing16(), 0.0f, 2, null), null, null, com.paypal.pds.components.ButtonStyle.Tertiary.INSTANCE, null, false, false, composer, androidx.profileinstaller.ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE, 472);
                composer.endReplaceGroup();
            } else {
                composer.startReplaceGroup(-63702065);
                composer.endReplaceGroup();
            }
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventEnd();
            }
        } else {
            composer.skipToGroupEnd();
        }
        return kotlin.Unit.INSTANCE;
    }

    /* renamed from: $r8$lambda$76Rz0q0e1tcq-LXjqz_HUvPYJpk, reason: not valid java name */
    public static /* synthetic */ kotlin.Unit m13654$r8$lambda$76Rz0q0e1tcqLXjqz_HUvPYJpk(com.paypal.oslo.feature.contacts.api.ContactSearchHeaderItem contactSearchHeaderItem, kotlin.jvm.functions.Function0 function0, androidx.compose.ui.Modifier modifier, int i, int i2, androidx.compose.runtime.Composer composer, int i3) {
        getHighResolutionOutputSizeshNQ4ISI(contactSearchHeaderItem, function0, modifier, composer, androidx.compose.runtime.RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
        return kotlin.Unit.INSTANCE;
    }

    /* renamed from: $r8$lambda$EyfCNGTCY9ZzjMsW2wxf-QMHQ4A, reason: not valid java name */
    public static /* synthetic */ kotlin.Unit m13655$r8$lambda$EyfCNGTCY9ZzjMsW2wxfQMHQ4A(int i, androidx.compose.runtime.Composer composer, int i2) {
        final int updateChangedFlags = androidx.compose.runtime.RecomposeScopeImplKt.updateChangedFlags(i | 1);
        androidx.compose.runtime.Composer startRestartGroup = composer.startRestartGroup(2077622221);
        if (!startRestartGroup.shouldExecute(updateChangedFlags != 0, updateChangedFlags & 1)) {
            startRestartGroup.skipToGroupEnd();
        } else {
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventStart(2077622221, updateChangedFlags, -1, "com.paypal.oslo.feature.contacts.ui.contacts.views.ContactHeaderItemWithActionPreview (ContactHeaderItem.kt:117)");
            }
            com.paypal.oslo.feature.contacts.domain.models.contacts.ContactSearch.HeaderItem headerItem = new com.paypal.oslo.feature.contacts.domain.models.contacts.ContactSearch.HeaderItem("Recent", new com.paypal.oslo.feature.contacts.api.HeaderAction("Clear All", com.paypal.oslo.feature.contacts.api.HeaderActionType.INSTANCE.getClearAll()));
            java.lang.Object rememberedValue = startRestartGroup.rememberedValue();
            if (rememberedValue == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                rememberedValue = new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.feature.contacts.ui.contacts.views.ContactHeaderItemKt$$ExternalSyntheticLambda5
                    @Override // kotlin.jvm.functions.Function0
                    public final java.lang.Object invoke() {
                        kotlin.Unit unit;
                        unit = kotlin.Unit.INSTANCE;
                        return unit;
                    }
                };
                startRestartGroup.updateRememberedValue(rememberedValue);
            }
            ContactHeaderItem(headerItem, (kotlin.jvm.functions.Function0) rememberedValue, null, startRestartGroup, com.paypal.oslo.feature.contacts.api.HeaderAction.$stable | 48, 4);
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventEnd();
            }
        }
        androidx.compose.runtime.ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new kotlin.jvm.functions.Function2() { // from class: com.paypal.oslo.feature.contacts.ui.contacts.views.ContactHeaderItemKt$$ExternalSyntheticLambda6
                @Override // kotlin.jvm.functions.Function2
                public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                    return com.paypal.oslo.feature.contacts.ui.contacts.views.ContactHeaderItemKt.m13655$r8$lambda$EyfCNGTCY9ZzjMsW2wxfQMHQ4A(updateChangedFlags, (androidx.compose.runtime.Composer) obj, ((java.lang.Integer) obj2).intValue());
                }
            });
        }
        return kotlin.Unit.INSTANCE;
    }

    /* renamed from: $r8$lambda$S48bVfPXyS-7GjzXyRWl8zrOzXg, reason: not valid java name */
    public static /* synthetic */ kotlin.Unit m13656$r8$lambda$S48bVfPXyS7GjzXyRWl8zrOzXg(com.paypal.oslo.feature.contacts.api.ContactSearchHeaderItem contactSearchHeaderItem, kotlin.jvm.functions.Function0 function0, androidx.compose.ui.Modifier modifier, int i, int i2, androidx.compose.runtime.Composer composer, int i3) {
        ContactHeaderItem(contactSearchHeaderItem, function0, modifier, composer, androidx.compose.runtime.RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$Yp0npawM7efTbCzM22lyTPpWbBA(androidx.compose.foundation.lazy.LazyItemScope lazyItemScope, com.paypal.oslo.feature.contacts.api.ContactSearchHeaderItem contactSearchHeaderItem, kotlin.jvm.functions.Function0 function0, androidx.compose.ui.Modifier modifier, int i, int i2, androidx.compose.runtime.Composer composer, int i3) {
        ContactHeaderItem(lazyItemScope, contactSearchHeaderItem, function0, modifier, composer, androidx.compose.runtime.RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$rKUYIm3oFInmvxGFGyQt8jINdk0(int i, androidx.compose.runtime.Composer composer, int i2) {
        final int updateChangedFlags = androidx.compose.runtime.RecomposeScopeImplKt.updateChangedFlags(i | 1);
        androidx.compose.runtime.Composer startRestartGroup = composer.startRestartGroup(1267224619);
        if (!startRestartGroup.shouldExecute(updateChangedFlags != 0, updateChangedFlags & 1)) {
            startRestartGroup.skipToGroupEnd();
        } else {
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventStart(1267224619, updateChangedFlags, -1, "com.paypal.oslo.feature.contacts.ui.contacts.views.ContactHeaderItemWithoutActionPreview (ContactHeaderItem.kt:131)");
            }
            com.paypal.oslo.feature.contacts.domain.models.contacts.ContactSearch.HeaderItem headerItem = new com.paypal.oslo.feature.contacts.domain.models.contacts.ContactSearch.HeaderItem("Your Contacts", null, 2, null);
            java.lang.Object rememberedValue = startRestartGroup.rememberedValue();
            if (rememberedValue == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                rememberedValue = new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.feature.contacts.ui.contacts.views.ContactHeaderItemKt$$ExternalSyntheticLambda3
                    @Override // kotlin.jvm.functions.Function0
                    public final java.lang.Object invoke() {
                        kotlin.Unit unit;
                        unit = kotlin.Unit.INSTANCE;
                        return unit;
                    }
                };
                startRestartGroup.updateRememberedValue(rememberedValue);
            }
            ContactHeaderItem(headerItem, (kotlin.jvm.functions.Function0) rememberedValue, null, startRestartGroup, com.paypal.oslo.feature.contacts.api.HeaderAction.$stable | 48, 4);
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventEnd();
            }
        }
        androidx.compose.runtime.ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new kotlin.jvm.functions.Function2() { // from class: com.paypal.oslo.feature.contacts.ui.contacts.views.ContactHeaderItemKt$$ExternalSyntheticLambda4
                @Override // kotlin.jvm.functions.Function2
                public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                    return com.paypal.oslo.feature.contacts.ui.contacts.views.ContactHeaderItemKt.$r8$lambda$rKUYIm3oFInmvxGFGyQt8jINdk0(updateChangedFlags, (androidx.compose.runtime.Composer) obj, ((java.lang.Integer) obj2).intValue());
                }
            });
        }
        return kotlin.Unit.INSTANCE;
    }
}
