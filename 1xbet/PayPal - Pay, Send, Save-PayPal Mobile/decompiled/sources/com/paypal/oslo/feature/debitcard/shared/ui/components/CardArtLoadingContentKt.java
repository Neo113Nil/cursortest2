package com.paypal.oslo.feature.debitcard.shared.ui.components;

@kotlin.Metadata(d1 = {"\u0000*\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\b\u001ae\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\t2\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u00052\u0010\b\u0002\u0010\f\u001a\n\u0012\u0004\u0012\u00020\u0001\u0018\u00010\r2\b\b\u0002\u0010\u000e\u001a\u00020\u0007H\u0001¢\u0006\u0002\u0010\u000f\u001a\r\u0010\u0011\u001a\u00020\u0001H\u0003¢\u0006\u0002\u0010\u0012\u001a\r\u0010\u0013\u001a\u00020\u0001H\u0003¢\u0006\u0002\u0010\u0012\u001a\r\u0010\u0014\u001a\u00020\u0001H\u0003¢\u0006\u0002\u0010\u0012\"\u000e\u0010\u0010\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000¨\u0006\u0015"}, d2 = {"CardArtLoadingContent", "", "debitCardArtConfig", "Lcom/paypal/oslo/feature/debitcard/shared/ui/model/DebitCardArtConfig;", "title", "", "modifier", "Landroidx/compose/ui/Modifier;", "showLoader", "", com.paypal.oslo.feature.inappcheckout.domain.util.LoggerParameterKeys.DESCRIPTION, "ctaText", "onCtaClick", "Lkotlin/Function0;", "ctaModifier", "(Lcom/paypal/oslo/feature/debitcard/shared/ui/model/DebitCardArtConfig;Ljava/lang/String;Landroidx/compose/ui/Modifier;ZLjava/lang/String;Ljava/lang/String;Lkotlin/jvm/functions/Function0;Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;II)V", "PreviewCardImageUrl", "CardArtLoadingContentPreview", "(Landroidx/compose/runtime/Composer;I)V", "CardArtSuccessContentPreview", "CardArtSuccessContentWithDescriptionPreview", "debit-card_prodRelease"}, k = 2, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class CardArtLoadingContentKt {
    /* JADX WARN: Removed duplicated region for block: B:101:0x005c  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0059  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0075  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0093  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x00af  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00cd  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00f0  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x00fb  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x0191  */
    /* JADX WARN: Removed duplicated region for block: B:66:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:71:0x017e  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x00f2  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x00d2  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x00b4  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x0095  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x0078  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void CardArtLoadingContent(final com.paypal.oslo.feature.debitcard.shared.ui.model.DebitCardArtConfig debitCardArtConfig, final java.lang.String str, androidx.compose.ui.Modifier modifier, boolean z, java.lang.String str2, java.lang.String str3, kotlin.jvm.functions.Function0<kotlin.Unit> function0, androidx.compose.ui.Modifier modifier2, androidx.compose.runtime.Composer composer, final int i, final int i2) {
        int i3;
        int i4;
        int i5;
        java.lang.String str4;
        int i6;
        final java.lang.String str5;
        int i7;
        int i8;
        androidx.compose.ui.Modifier.Companion companion;
        final boolean z2;
        final kotlin.jvm.functions.Function0<kotlin.Unit> function02;
        androidx.compose.ui.Modifier modifier3;
        final java.lang.String str6;
        final java.lang.String str7;
        androidx.compose.runtime.ScopeUpdateScope endRestartGroup;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(debitCardArtConfig, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
        androidx.compose.runtime.Composer startRestartGroup = composer.startRestartGroup(1723465948);
        if ((i & 6) == 0) {
            i3 = (startRestartGroup.changed(debitCardArtConfig) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i & 48) == 0) {
            i3 |= startRestartGroup.changed(str) ? 32 : 16;
        }
        int i9 = i2 & 4;
        if (i9 != 0) {
            i3 |= 384;
        } else if ((i & 384) == 0) {
            i3 |= startRestartGroup.changed(modifier) ? 256 : 128;
            i4 = i2 & 8;
            if (i4 == 0) {
                i3 |= 3072;
            } else if ((i & 3072) == 0) {
                i3 |= startRestartGroup.changed(z) ? 2048 : 1024;
                i5 = i2 & 16;
                if (i5 != 0) {
                    i3 |= 24576;
                } else if ((i & 24576) == 0) {
                    str4 = str2;
                    i3 |= startRestartGroup.changed(str4) ? 16384 : 8192;
                    i6 = i2 & 32;
                    if (i6 == 0) {
                        i3 |= androidx.profileinstaller.ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE;
                    } else if ((196608 & i) == 0) {
                        str5 = str3;
                        i3 |= startRestartGroup.changed(str5) ? 131072 : 65536;
                        i7 = i2 & 64;
                        if (i7 != 0) {
                            i3 |= 1572864;
                        } else if ((i & 1572864) == 0) {
                            i3 |= startRestartGroup.changedInstance(function0) ? 1048576 : 524288;
                        }
                        i8 = i2 & 128;
                        if (i8 != 0) {
                            i3 |= 12582912;
                        } else if ((i & 12582912) == 0) {
                            i3 |= startRestartGroup.changed(modifier2) ? 8388608 : 4194304;
                        }
                        if (!startRestartGroup.shouldExecute((i3 & 4793491) != 4793490, i3 & 1)) {
                            startRestartGroup.skipToGroupEnd();
                            companion = modifier;
                            z2 = z;
                            function02 = function0;
                            modifier3 = modifier2;
                            str6 = str4;
                            str7 = str5;
                        } else {
                            companion = i9 != 0 ? androidx.compose.ui.Modifier.INSTANCE : modifier;
                            final boolean z3 = i4 != 0 ? true : z;
                            str6 = i5 != 0 ? null : str4;
                            if (i6 != 0) {
                                str5 = null;
                            }
                            function02 = i7 == 0 ? function0 : null;
                            final androidx.compose.ui.Modifier.Companion companion2 = i8 != 0 ? androidx.compose.ui.Modifier.INSTANCE : modifier2;
                            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                                androidx.compose.runtime.ComposerKt.traceEventStart(1723465948, i3, -1, "com.paypal.oslo.feature.debitcard.shared.ui.components.CardArtLoadingContent (CardArtLoadingContent.kt:80)");
                            }
                            java.lang.String str8 = str5;
                            com.paypal.pds.components.DockKt.Dock(androidx.compose.foundation.layout.WindowInsetsPaddingKt.windowInsetsPadding(com.paypal.oslo.core.telemetry.compose.ModifierExtensionsKt.component(companion, com.paypal.oslo.feature.debitcard.shared.analytics.CardArtLoadingContentAnalytics.INSTANCE.getCARD_ART_LOADING_CONTENT()), androidx.compose.foundation.layout.WindowInsets_androidKt.getSystemBars(androidx.compose.foundation.layout.WindowInsets.INSTANCE, startRestartGroup, 6)), null, null, androidx.compose.runtime.internal.ComposableLambdaKt.rememberComposableLambda(-1937251489, true, new kotlin.jvm.functions.Function2() { // from class: com.paypal.oslo.feature.debitcard.shared.ui.components.CardArtLoadingContentKt$$ExternalSyntheticLambda4
                                @Override // kotlin.jvm.functions.Function2
                                public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                                    return com.paypal.oslo.feature.debitcard.shared.ui.components.CardArtLoadingContentKt.m14601$r8$lambda$jTCbHvZ_FzA7Lq8J0CG0I33ZE8(str5, function02, companion2, (androidx.compose.runtime.Composer) obj, ((java.lang.Integer) obj2).intValue());
                                }
                            }, startRestartGroup, 54), androidx.compose.runtime.internal.ComposableLambdaKt.rememberComposableLambda(1997256096, true, new kotlin.jvm.functions.Function2() { // from class: com.paypal.oslo.feature.debitcard.shared.ui.components.CardArtLoadingContentKt$$ExternalSyntheticLambda5
                                @Override // kotlin.jvm.functions.Function2
                                public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                                    return com.paypal.oslo.feature.debitcard.shared.ui.components.CardArtLoadingContentKt.$r8$lambda$HV9QL1lMDt2g0LRJ4_PrXqFTApI(z3, debitCardArtConfig, str, str6, (androidx.compose.runtime.Composer) obj, ((java.lang.Integer) obj2).intValue());
                                }
                            }, startRestartGroup, 54), startRestartGroup, 27648, 6);
                            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                                androidx.compose.runtime.ComposerKt.traceEventEnd();
                            }
                            z2 = z3;
                            str7 = str8;
                            modifier3 = companion2;
                        }
                        endRestartGroup = startRestartGroup.endRestartGroup();
                        if (endRestartGroup != null) {
                            final androidx.compose.ui.Modifier modifier4 = companion;
                            final java.lang.String str9 = str6;
                            final androidx.compose.ui.Modifier modifier5 = modifier3;
                            endRestartGroup.updateScope(new kotlin.jvm.functions.Function2() { // from class: com.paypal.oslo.feature.debitcard.shared.ui.components.CardArtLoadingContentKt$$ExternalSyntheticLambda6
                                @Override // kotlin.jvm.functions.Function2
                                public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                                    return com.paypal.oslo.feature.debitcard.shared.ui.components.CardArtLoadingContentKt.$r8$lambda$aIP8meyI_C1i0WTsZn5VC0uXpfs(com.paypal.oslo.feature.debitcard.shared.ui.model.DebitCardArtConfig.this, str, modifier4, z2, str9, str7, function02, modifier5, i, i2, (androidx.compose.runtime.Composer) obj, ((java.lang.Integer) obj2).intValue());
                                }
                            });
                            return;
                        }
                        return;
                    }
                    str5 = str3;
                    i7 = i2 & 64;
                    if (i7 != 0) {
                    }
                    i8 = i2 & 128;
                    if (i8 != 0) {
                    }
                    if (!startRestartGroup.shouldExecute((i3 & 4793491) != 4793490, i3 & 1)) {
                    }
                    endRestartGroup = startRestartGroup.endRestartGroup();
                    if (endRestartGroup != null) {
                    }
                }
                str4 = str2;
                i6 = i2 & 32;
                if (i6 == 0) {
                }
                str5 = str3;
                i7 = i2 & 64;
                if (i7 != 0) {
                }
                i8 = i2 & 128;
                if (i8 != 0) {
                }
                if (!startRestartGroup.shouldExecute((i3 & 4793491) != 4793490, i3 & 1)) {
                }
                endRestartGroup = startRestartGroup.endRestartGroup();
                if (endRestartGroup != null) {
                }
            }
            i5 = i2 & 16;
            if (i5 != 0) {
            }
            str4 = str2;
            i6 = i2 & 32;
            if (i6 == 0) {
            }
            str5 = str3;
            i7 = i2 & 64;
            if (i7 != 0) {
            }
            i8 = i2 & 128;
            if (i8 != 0) {
            }
            if (!startRestartGroup.shouldExecute((i3 & 4793491) != 4793490, i3 & 1)) {
            }
            endRestartGroup = startRestartGroup.endRestartGroup();
            if (endRestartGroup != null) {
            }
        }
        i4 = i2 & 8;
        if (i4 == 0) {
        }
        i5 = i2 & 16;
        if (i5 != 0) {
        }
        str4 = str2;
        i6 = i2 & 32;
        if (i6 == 0) {
        }
        str5 = str3;
        i7 = i2 & 64;
        if (i7 != 0) {
        }
        i8 = i2 & 128;
        if (i8 != 0) {
        }
        if (!startRestartGroup.shouldExecute((i3 & 4793491) != 4793490, i3 & 1)) {
        }
        endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
        }
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$HV9QL1lMDt2g0LRJ4_PrXqFTApI(boolean z, com.paypal.oslo.feature.debitcard.shared.ui.model.DebitCardArtConfig debitCardArtConfig, java.lang.String str, java.lang.String str2, androidx.compose.runtime.Composer composer, int i) {
        if (composer.shouldExecute((i & 3) != 2, i & 1)) {
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventStart(1997256096, i, -1, "com.paypal.oslo.feature.debitcard.shared.ui.components.CardArtLoadingContent.<anonymous> (CardArtLoadingContent.kt:98)");
            }
            androidx.compose.ui.Modifier fillMaxSize$default = androidx.compose.foundation.layout.SizeKt.fillMaxSize$default(androidx.compose.ui.Modifier.INSTANCE, 0.0f, 1, null);
            androidx.compose.ui.layout.MeasurePolicy columnMeasurePolicy = androidx.compose.foundation.layout.ColumnKt.columnMeasurePolicy(androidx.compose.foundation.layout.Arrangement.INSTANCE.getCenter(), androidx.compose.ui.Alignment.INSTANCE.getCenterHorizontally(), composer, 54);
            int hashCode = java.lang.Long.hashCode(androidx.compose.runtime.ComposablesKt.getCurrentCompositeKeyHashCode(composer, 0));
            androidx.compose.runtime.CompositionLocalMap currentCompositionLocalMap = composer.getCurrentCompositionLocalMap();
            androidx.compose.ui.Modifier materializeModifier = androidx.compose.ui.ComposedModifierKt.materializeModifier(composer, fillMaxSize$default);
            kotlin.jvm.functions.Function0<androidx.compose.ui.node.ComposeUiNode> constructor = androidx.compose.ui.node.ComposeUiNode.INSTANCE.getConstructor();
            if (!(composer.getApplier() instanceof androidx.compose.runtime.Applier)) {
                androidx.compose.runtime.ComposablesKt.invalidApplier();
            }
            composer.startReusableNode();
            if (composer.getInserting()) {
                composer.createNode(constructor);
            } else {
                composer.useNode();
            }
            androidx.compose.runtime.Composer m5299constructorimpl = androidx.compose.runtime.Updater.m5299constructorimpl(composer);
            androidx.compose.runtime.Updater.m5307setimpl(m5299constructorimpl, columnMeasurePolicy, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetMeasurePolicy());
            androidx.compose.runtime.Updater.m5307setimpl(m5299constructorimpl, currentCompositionLocalMap, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
            androidx.compose.runtime.Updater.m5303initimpl(m5299constructorimpl, java.lang.Integer.valueOf(hashCode), androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetCompositeKeyHash());
            androidx.compose.runtime.Updater.m5305reconcileimpl(m5299constructorimpl, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getApplyOnDeactivatedNodeAssertion());
            androidx.compose.runtime.Updater.m5307setimpl(m5299constructorimpl, materializeModifier, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetModifier());
            androidx.compose.foundation.layout.ColumnScopeInstance columnScopeInstance = androidx.compose.foundation.layout.ColumnScopeInstance.INSTANCE;
            androidx.compose.ui.Modifier item = com.paypal.oslo.core.telemetry.compose.ModifierExtensionsKt.item(androidx.compose.ui.Modifier.INSTANCE, com.paypal.oslo.feature.debitcard.shared.analytics.CardArtLoadingContentAnalytics.INSTANCE.getCARD_ART_IMAGE());
            androidx.compose.ui.layout.MeasurePolicy maybeCachedBoxMeasurePolicy = androidx.compose.foundation.layout.BoxKt.maybeCachedBoxMeasurePolicy(androidx.compose.ui.Alignment.INSTANCE.getTopStart(), false);
            int hashCode2 = java.lang.Long.hashCode(androidx.compose.runtime.ComposablesKt.getCurrentCompositeKeyHashCode(composer, 0));
            androidx.compose.runtime.CompositionLocalMap currentCompositionLocalMap2 = composer.getCurrentCompositionLocalMap();
            androidx.compose.ui.Modifier materializeModifier2 = androidx.compose.ui.ComposedModifierKt.materializeModifier(composer, item);
            kotlin.jvm.functions.Function0<androidx.compose.ui.node.ComposeUiNode> constructor2 = androidx.compose.ui.node.ComposeUiNode.INSTANCE.getConstructor();
            if (!(composer.getApplier() instanceof androidx.compose.runtime.Applier)) {
                androidx.compose.runtime.ComposablesKt.invalidApplier();
            }
            composer.startReusableNode();
            if (composer.getInserting()) {
                composer.createNode(constructor2);
            } else {
                composer.useNode();
            }
            androidx.compose.runtime.Composer m5299constructorimpl2 = androidx.compose.runtime.Updater.m5299constructorimpl(composer);
            androidx.compose.runtime.Updater.m5307setimpl(m5299constructorimpl2, maybeCachedBoxMeasurePolicy, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetMeasurePolicy());
            androidx.compose.runtime.Updater.m5307setimpl(m5299constructorimpl2, currentCompositionLocalMap2, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
            androidx.compose.runtime.Updater.m5303initimpl(m5299constructorimpl2, java.lang.Integer.valueOf(hashCode2), androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetCompositeKeyHash());
            androidx.compose.runtime.Updater.m5305reconcileimpl(m5299constructorimpl2, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getApplyOnDeactivatedNodeAssertion());
            androidx.compose.runtime.Updater.m5307setimpl(m5299constructorimpl2, materializeModifier2, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetModifier());
            androidx.compose.foundation.layout.BoxScopeInstance boxScopeInstance = androidx.compose.foundation.layout.BoxScopeInstance.INSTANCE;
            com.paypal.oslo.feature.debitcard.shared.ui.components.DebitCardArtImageWithShimmerKt.DebitCardArtImageWithShimmer(debitCardArtConfig, composer, 0);
            composer.endNode();
            androidx.compose.ui.Modifier item2 = com.paypal.oslo.core.telemetry.compose.ModifierExtensionsKt.item(androidx.compose.ui.Modifier.INSTANCE, com.paypal.oslo.feature.debitcard.shared.analytics.CardArtLoadingContentAnalytics.INSTANCE.getCARD_ART_MESSAGE());
            androidx.compose.ui.layout.MeasurePolicy columnMeasurePolicy2 = androidx.compose.foundation.layout.ColumnKt.columnMeasurePolicy(androidx.compose.foundation.layout.Arrangement.INSTANCE.getTop(), androidx.compose.ui.Alignment.INSTANCE.getCenterHorizontally(), composer, 48);
            int hashCode3 = java.lang.Long.hashCode(androidx.compose.runtime.ComposablesKt.getCurrentCompositeKeyHashCode(composer, 0));
            androidx.compose.runtime.CompositionLocalMap currentCompositionLocalMap3 = composer.getCurrentCompositionLocalMap();
            androidx.compose.ui.Modifier materializeModifier3 = androidx.compose.ui.ComposedModifierKt.materializeModifier(composer, item2);
            kotlin.jvm.functions.Function0<androidx.compose.ui.node.ComposeUiNode> constructor3 = androidx.compose.ui.node.ComposeUiNode.INSTANCE.getConstructor();
            if (!(composer.getApplier() instanceof androidx.compose.runtime.Applier)) {
                androidx.compose.runtime.ComposablesKt.invalidApplier();
            }
            composer.startReusableNode();
            if (composer.getInserting()) {
                composer.createNode(constructor3);
            } else {
                composer.useNode();
            }
            androidx.compose.runtime.Composer m5299constructorimpl3 = androidx.compose.runtime.Updater.m5299constructorimpl(composer);
            androidx.compose.runtime.Updater.m5307setimpl(m5299constructorimpl3, columnMeasurePolicy2, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetMeasurePolicy());
            androidx.compose.runtime.Updater.m5307setimpl(m5299constructorimpl3, currentCompositionLocalMap3, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
            androidx.compose.runtime.Updater.m5303initimpl(m5299constructorimpl3, java.lang.Integer.valueOf(hashCode3), androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetCompositeKeyHash());
            androidx.compose.runtime.Updater.m5305reconcileimpl(m5299constructorimpl3, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getApplyOnDeactivatedNodeAssertion());
            androidx.compose.runtime.Updater.m5307setimpl(m5299constructorimpl3, materializeModifier3, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetModifier());
            androidx.compose.foundation.layout.ColumnScopeInstance columnScopeInstance2 = androidx.compose.foundation.layout.ColumnScopeInstance.INSTANCE;
            com.paypal.pds.core.Typography.HeadingSmall headingSmall = com.paypal.pds.core.Typography.HeadingSmall.INSTANCE;
            com.paypal.pds.core.Color.ContentBase contentBase = com.paypal.pds.core.Color.ContentBase.INSTANCE;
            int m8443getCentere0LSkKk = androidx.compose.ui.text.style.TextAlign.INSTANCE.m8443getCentere0LSkKk();
            androidx.compose.ui.Modifier m1708paddingVpY3zN4$default = androidx.compose.foundation.layout.PaddingKt.m1708paddingVpY3zN4$default(androidx.compose.foundation.layout.PaddingKt.m1710paddingqDBjuR0$default(androidx.compose.ui.Modifier.INSTANCE, 0.0f, com.paypal.pds.core.ConstantsKt.getSize40(), 0.0f, 0.0f, 13, null), com.paypal.pds.core.ConstantsKt.getSpacing16(), 0.0f, 2, null);
            java.lang.Object rememberedValue = composer.rememberedValue();
            if (rememberedValue == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                rememberedValue = new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.debitcard.shared.ui.components.CardArtLoadingContentKt$$ExternalSyntheticLambda0
                    @Override // kotlin.jvm.functions.Function1
                    public final java.lang.Object invoke(java.lang.Object obj) {
                        return com.paypal.oslo.feature.debitcard.shared.ui.components.CardArtLoadingContentKt.$r8$lambda$VGz0jCrKYEcztrUbGNU5nxX5czc((androidx.compose.ui.semantics.SemanticsPropertyReceiver) obj);
                    }
                };
                composer.updateRememberedValue(rememberedValue);
            }
            com.paypal.pds.components.LabelKt.m21914LabelPL_sNV4(str, androidx.compose.ui.semantics.SemanticsModifierKt.semantics$default(m1708paddingVpY3zN4$default, false, (kotlin.jvm.functions.Function1) rememberedValue, 1, null), contentBase, null, androidx.compose.ui.text.style.TextAlign.m8436boximpl(m8443getCentere0LSkKk), null, false, 0, 0, null, headingSmall, composer, 384, 6, 1000);
            if (str2 == null) {
                composer.startReplaceGroup(-364808502);
                composer.endReplaceGroup();
            } else {
                composer.startReplaceGroup(-364808501);
                com.paypal.pds.components.LabelKt.m21914LabelPL_sNV4(str2, androidx.compose.foundation.layout.PaddingKt.m1708paddingVpY3zN4$default(androidx.compose.foundation.layout.PaddingKt.m1710paddingqDBjuR0$default(androidx.compose.ui.Modifier.INSTANCE, 0.0f, com.paypal.pds.core.ConstantsKt.getSize16(), 0.0f, 0.0f, 13, null), com.paypal.pds.core.ConstantsKt.getSpacing16(), 0.0f, 2, null), com.paypal.pds.core.Color.ContentBase.INSTANCE, null, androidx.compose.ui.text.style.TextAlign.m8436boximpl(androidx.compose.ui.text.style.TextAlign.INSTANCE.m8443getCentere0LSkKk()), null, false, 0, 0, null, com.paypal.pds.core.Typography.BodyLarge.INSTANCE, composer, 384, 6, 1000);
                kotlin.Unit unit = kotlin.Unit.INSTANCE;
                composer.endReplaceGroup();
                kotlin.Unit unit2 = kotlin.Unit.INSTANCE;
            }
            composer.endNode();
            if (z) {
                composer.startReplaceGroup(-1874386232);
                com.paypal.pds.components.LoaderKt.Loader(androidx.compose.foundation.layout.PaddingKt.m1710paddingqDBjuR0$default(androidx.compose.ui.Modifier.INSTANCE, 0.0f, com.paypal.pds.core.ConstantsKt.getSize40(), 0.0f, 0.0f, 13, null), com.paypal.pds.components.LoaderSize.Large.INSTANCE, null, null, composer, com.paypal.pds.components.LoaderSize.Large.$stable << 3, 12);
                composer.endReplaceGroup();
            } else {
                composer.startReplaceGroup(-1874245492);
                composer.endReplaceGroup();
            }
            composer.endNode();
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventEnd();
            }
        } else {
            composer.skipToGroupEnd();
        }
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$VGz0jCrKYEcztrUbGNU5nxX5czc(androidx.compose.ui.semantics.SemanticsPropertyReceiver semanticsPropertyReceiver) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(semanticsPropertyReceiver, "");
        androidx.compose.ui.semantics.SemanticsPropertiesKt.m7814setLiveRegionhR3wRGc(semanticsPropertyReceiver, androidx.compose.ui.semantics.LiveRegionMode.INSTANCE.m7791getPolite0phEisY());
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$XbBtfNC6vS_YN0lyO1LBipxmu58(int i, androidx.compose.runtime.Composer composer, int i2) {
        final int updateChangedFlags = androidx.compose.runtime.RecomposeScopeImplKt.updateChangedFlags(i | 1);
        androidx.compose.runtime.Composer startRestartGroup = composer.startRestartGroup(1220181528);
        if (!startRestartGroup.shouldExecute(updateChangedFlags != 0, updateChangedFlags & 1)) {
            startRestartGroup.skipToGroupEnd();
        } else {
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventStart(1220181528, updateChangedFlags, -1, "com.paypal.oslo.feature.debitcard.shared.ui.components.CardArtLoadingContentPreview (CardArtLoadingContent.kt:153)");
            }
            CardArtLoadingContent(new com.paypal.oslo.feature.debitcard.shared.ui.model.DebitCardArtConfig("https://www.paypalobjects.com/ucs/card/ppdc/de/cons-debit-card-large.png", "Processing your request", null, null, false, 0.0f, 60, null), "Processing your request", null, false, null, null, null, null, startRestartGroup, 48, com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_ROUTING_NUMBER_CONFIRMED_CIRCLE_VALUE);
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventEnd();
            }
        }
        androidx.compose.runtime.ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new kotlin.jvm.functions.Function2() { // from class: com.paypal.oslo.feature.debitcard.shared.ui.components.CardArtLoadingContentKt$$ExternalSyntheticLambda1
                @Override // kotlin.jvm.functions.Function2
                public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                    return com.paypal.oslo.feature.debitcard.shared.ui.components.CardArtLoadingContentKt.$r8$lambda$XbBtfNC6vS_YN0lyO1LBipxmu58(updateChangedFlags, (androidx.compose.runtime.Composer) obj, ((java.lang.Integer) obj2).intValue());
                }
            });
        }
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$aIP8meyI_C1i0WTsZn5VC0uXpfs(com.paypal.oslo.feature.debitcard.shared.ui.model.DebitCardArtConfig debitCardArtConfig, java.lang.String str, androidx.compose.ui.Modifier modifier, boolean z, java.lang.String str2, java.lang.String str3, kotlin.jvm.functions.Function0 function0, androidx.compose.ui.Modifier modifier2, int i, int i2, androidx.compose.runtime.Composer composer, int i3) {
        CardArtLoadingContent(debitCardArtConfig, str, modifier, z, str2, str3, function0, modifier2, composer, androidx.compose.runtime.RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$gH5zjjffy3QcSkvD_Fx16RVYvOU(int i, androidx.compose.runtime.Composer composer, int i2) {
        final int updateChangedFlags = androidx.compose.runtime.RecomposeScopeImplKt.updateChangedFlags(i | 1);
        androidx.compose.runtime.Composer startRestartGroup = composer.startRestartGroup(-777779631);
        if (!startRestartGroup.shouldExecute(updateChangedFlags != 0, updateChangedFlags & 1)) {
            startRestartGroup.skipToGroupEnd();
        } else {
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventStart(-777779631, updateChangedFlags, -1, "com.paypal.oslo.feature.debitcard.shared.ui.components.CardArtSuccessContentWithDescriptionPreview (CardArtLoadingContent.kt:185)");
            }
            com.paypal.oslo.feature.debitcard.shared.ui.model.DebitCardArtConfig debitCardArtConfig = new com.paypal.oslo.feature.debitcard.shared.ui.model.DebitCardArtConfig("https://www.paypalobjects.com/ucs/card/ppdc/de/cons-debit-card-large.png", androidx.compose.ui.res.StringResources_androidKt.stringResource(com.paypal.oslo.feature.debitcard.R.string.feature_debit_card_report_card_success_description, startRestartGroup, 0), null, null, false, 0.0f, 60, null);
            java.lang.String stringResource = androidx.compose.ui.res.StringResources_androidKt.stringResource(com.paypal.oslo.feature.debitcard.R.string.feature_debit_card_report_card_damaged_success_title, startRestartGroup, 0);
            java.lang.String stringResource2 = androidx.compose.ui.res.StringResources_androidKt.stringResource(com.paypal.oslo.feature.debitcard.R.string.feature_debit_card_common_card_delivery_description, new java.lang.Object[]{"May 8"}, startRestartGroup, 0);
            java.lang.String stringResource3 = androidx.compose.ui.res.StringResources_androidKt.stringResource(com.paypal.oslo.feature.debitcard.R.string.feature_debit_card_common_ok, startRestartGroup, 0);
            androidx.compose.ui.Modifier background = com.paypal.pds.core.ModifierExtensionsKt.background(androidx.compose.foundation.layout.SizeKt.fillMaxSize$default(androidx.compose.ui.Modifier.INSTANCE, 0.0f, 1, null), (com.paypal.pds.core.Color) com.paypal.pds.core.Color.BackgroundBase.INSTANCE, (androidx.compose.ui.graphics.Shape) null, startRestartGroup, 54, 2);
            java.lang.Object rememberedValue = startRestartGroup.rememberedValue();
            if (rememberedValue == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                rememberedValue = new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.feature.debitcard.shared.ui.components.CardArtLoadingContentKt$$ExternalSyntheticLambda7
                    @Override // kotlin.jvm.functions.Function0
                    public final java.lang.Object invoke() {
                        kotlin.Unit unit;
                        unit = kotlin.Unit.INSTANCE;
                        return unit;
                    }
                };
                startRestartGroup.updateRememberedValue(rememberedValue);
            }
            CardArtLoadingContent(debitCardArtConfig, stringResource, background, false, stringResource2, stringResource3, (kotlin.jvm.functions.Function0) rememberedValue, null, startRestartGroup, 1575936, 128);
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventEnd();
            }
        }
        androidx.compose.runtime.ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new kotlin.jvm.functions.Function2() { // from class: com.paypal.oslo.feature.debitcard.shared.ui.components.CardArtLoadingContentKt$$ExternalSyntheticLambda8
                @Override // kotlin.jvm.functions.Function2
                public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                    return com.paypal.oslo.feature.debitcard.shared.ui.components.CardArtLoadingContentKt.$r8$lambda$gH5zjjffy3QcSkvD_Fx16RVYvOU(updateChangedFlags, (androidx.compose.runtime.Composer) obj, ((java.lang.Integer) obj2).intValue());
                }
            });
        }
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$hAtXbtN1OPKyyEzdMjVnEHlOqE4(int i, androidx.compose.runtime.Composer composer, int i2) {
        final int updateChangedFlags = androidx.compose.runtime.RecomposeScopeImplKt.updateChangedFlags(i | 1);
        androidx.compose.runtime.Composer startRestartGroup = composer.startRestartGroup(2016718513);
        if (!startRestartGroup.shouldExecute(updateChangedFlags != 0, updateChangedFlags & 1)) {
            startRestartGroup.skipToGroupEnd();
        } else {
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventStart(2016718513, updateChangedFlags, -1, "com.paypal.oslo.feature.debitcard.shared.ui.components.CardArtSuccessContentPreview (CardArtLoadingContent.kt:165)");
            }
            com.paypal.oslo.feature.debitcard.shared.ui.model.DebitCardArtConfig debitCardArtConfig = new com.paypal.oslo.feature.debitcard.shared.ui.model.DebitCardArtConfig("https://www.paypalobjects.com/ucs/card/ppdc/de/cons-debit-card-large.png", androidx.compose.ui.res.StringResources_androidKt.stringResource(com.paypal.oslo.feature.debitcard.R.string.feature_debit_card_report_card_success_description, startRestartGroup, 0), null, null, false, 0.0f, 60, null);
            java.lang.String stringResource = androidx.compose.ui.res.StringResources_androidKt.stringResource(com.paypal.oslo.feature.debitcard.R.string.feature_debit_card_common_card_delivery_description, new java.lang.Object[]{"May 8"}, startRestartGroup, 0);
            java.lang.String stringResource2 = androidx.compose.ui.res.StringResources_androidKt.stringResource(com.paypal.oslo.feature.debitcard.R.string.feature_debit_card_common_ok, startRestartGroup, 0);
            androidx.compose.ui.Modifier background = com.paypal.pds.core.ModifierExtensionsKt.background(androidx.compose.foundation.layout.SizeKt.fillMaxSize$default(androidx.compose.ui.Modifier.INSTANCE, 0.0f, 1, null), (com.paypal.pds.core.Color) com.paypal.pds.core.Color.BackgroundBase.INSTANCE, (androidx.compose.ui.graphics.Shape) null, startRestartGroup, 54, 2);
            java.lang.Object rememberedValue = startRestartGroup.rememberedValue();
            if (rememberedValue == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                rememberedValue = new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.feature.debitcard.shared.ui.components.CardArtLoadingContentKt$$ExternalSyntheticLambda2
                    @Override // kotlin.jvm.functions.Function0
                    public final java.lang.Object invoke() {
                        kotlin.Unit unit;
                        unit = kotlin.Unit.INSTANCE;
                        return unit;
                    }
                };
                startRestartGroup.updateRememberedValue(rememberedValue);
            }
            CardArtLoadingContent(debitCardArtConfig, stringResource, background, false, null, stringResource2, (kotlin.jvm.functions.Function0) rememberedValue, null, startRestartGroup, 1575936, 144);
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventEnd();
            }
        }
        androidx.compose.runtime.ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new kotlin.jvm.functions.Function2() { // from class: com.paypal.oslo.feature.debitcard.shared.ui.components.CardArtLoadingContentKt$$ExternalSyntheticLambda3
                @Override // kotlin.jvm.functions.Function2
                public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                    return com.paypal.oslo.feature.debitcard.shared.ui.components.CardArtLoadingContentKt.$r8$lambda$hAtXbtN1OPKyyEzdMjVnEHlOqE4(updateChangedFlags, (androidx.compose.runtime.Composer) obj, ((java.lang.Integer) obj2).intValue());
                }
            });
        }
        return kotlin.Unit.INSTANCE;
    }

    /* renamed from: $r8$lambda$jTCbHvZ_FzA7Lq8-J0CG0I33ZE8, reason: not valid java name */
    public static /* synthetic */ kotlin.Unit m14601$r8$lambda$jTCbHvZ_FzA7Lq8J0CG0I33ZE8(java.lang.String str, kotlin.jvm.functions.Function0 function0, androidx.compose.ui.Modifier modifier, androidx.compose.runtime.Composer composer, int i) {
        if (composer.shouldExecute((i & 3) != 2, i & 1)) {
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventStart(-1937251489, i, -1, "com.paypal.oslo.feature.debitcard.shared.ui.components.CardArtLoadingContent.<anonymous> (CardArtLoadingContent.kt:86)");
            }
            if (str == null || function0 == null) {
                composer.startReplaceGroup(-1183186397);
                composer.endReplaceGroup();
            } else {
                composer.startReplaceGroup(-1183469365);
                com.paypal.pds.components.ButtonKt.Button(function0, str, androidx.compose.foundation.layout.SizeKt.fillMaxWidth$default(modifier, 0.0f, 1, null), null, null, com.paypal.pds.components.ButtonStyle.Primary.INSTANCE, com.paypal.pds.components.ButtonSize.Large.INSTANCE, false, false, composer, 1769472, 408);
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
}
