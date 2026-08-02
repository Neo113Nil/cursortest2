package com.paypal.oslo.feature.revolvingcreditservicing.ui.accountsummary.components;

@kotlin.Metadata(d1 = {"\u0000<\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u001au\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00010\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\t2\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u000b2\b\b\u0002\u0010\f\u001a\u00020\u00072\b\b\u0002\u0010\r\u001a\u00020\t2\u001c\u0010\u000e\u001a\u0018\u0012\u0004\u0012\u00020\u0010\u0012\u0004\u0012\u00020\u00010\u000f¢\u0006\u0002\b\u0011¢\u0006\u0002\b\u0012H\u0001¢\u0006\u0002\u0010\u0013\u001a\r\u0010\u0014\u001a\u00020\u0001H\u0003¢\u0006\u0002\u0010\u0015¨\u0006\u0016"}, d2 = {"AccountSummarySection", "", "title", "Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/common/components/UiString;", "onSeeAllClick", "Lkotlin/Function0;", "modifier", "Landroidx/compose/ui/Modifier;", "seeAllButtonVisible", "", "seeAllContentDescription", "", "seeAllModifier", "visible", "content", "Lkotlin/Function1;", "Landroidx/compose/foundation/layout/ColumnScope;", "Landroidx/compose/runtime/Composable;", "Lkotlin/ExtensionFunctionType;", "(Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/common/components/UiString;Lkotlin/jvm/functions/Function0;Landroidx/compose/ui/Modifier;ZLjava/lang/String;Landroidx/compose/ui/Modifier;ZLkotlin/jvm/functions/Function3;Landroidx/compose/runtime/Composer;II)V", "AccountSummarySectionPreview", "(Landroidx/compose/runtime/Composer;I)V", "revolvingcredit-servicing_prodRelease"}, k = 2, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class AccountSummarySectionKt {
    /* JADX WARN: Removed duplicated region for block: B:20:0x005c  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0078  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0096  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x00b4  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00d2  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00ec  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x00f8  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x0196  */
    /* JADX WARN: Removed duplicated region for block: B:67:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:73:0x0186  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x00ee  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x00b9  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x0098  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x007b  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x005f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void AccountSummarySection(final com.paypal.oslo.feature.revolvingcreditservicing.ui.common.components.UiString uiString, final kotlin.jvm.functions.Function0<kotlin.Unit> function0, androidx.compose.ui.Modifier modifier, boolean z, java.lang.String str, androidx.compose.ui.Modifier modifier2, boolean z2, final kotlin.jvm.functions.Function3<? super androidx.compose.foundation.layout.ColumnScope, ? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.Unit> function3, androidx.compose.runtime.Composer composer, final int i, final int i2) {
        int i3;
        int i4;
        boolean z3;
        int i5;
        java.lang.String str2;
        int i6;
        androidx.compose.ui.Modifier modifier3;
        int i7;
        boolean z4;
        androidx.compose.runtime.Composer composer2;
        final androidx.compose.ui.Modifier modifier4;
        final boolean z5;
        final java.lang.String str3;
        final boolean z6;
        final androidx.compose.ui.Modifier modifier5;
        androidx.compose.runtime.ScopeUpdateScope endRestartGroup;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(uiString, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(function0, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(function3, "");
        androidx.compose.runtime.Composer startRestartGroup = composer.startRestartGroup(-620652379);
        if ((i & 6) == 0) {
            i3 = (startRestartGroup.changed(uiString) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i & 48) == 0) {
            i3 |= startRestartGroup.changedInstance(function0) ? 32 : 16;
        }
        int i8 = i2 & 4;
        if (i8 != 0) {
            i3 |= 384;
        } else if ((i & 384) == 0) {
            i3 |= startRestartGroup.changed(modifier) ? 256 : 128;
            i4 = i2 & 8;
            if (i4 == 0) {
                i3 |= 3072;
            } else if ((i & 3072) == 0) {
                z3 = z;
                i3 |= startRestartGroup.changed(z3) ? 2048 : 1024;
                i5 = i2 & 16;
                if (i5 != 0) {
                    i3 |= 24576;
                } else if ((i & 24576) == 0) {
                    str2 = str;
                    i3 |= startRestartGroup.changed(str2) ? 16384 : 8192;
                    i6 = i2 & 32;
                    if (i6 == 0) {
                        i3 |= androidx.profileinstaller.ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE;
                    } else if ((i & androidx.profileinstaller.ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE) == 0) {
                        modifier3 = modifier2;
                        i3 |= startRestartGroup.changed(modifier3) ? 131072 : 65536;
                        i7 = i2 & 64;
                        if (i7 != 0) {
                            i3 |= 1572864;
                            z4 = z2;
                        } else {
                            z4 = z2;
                            if ((i & 1572864) == 0) {
                                i3 |= startRestartGroup.changed(z4) ? 1048576 : 524288;
                            }
                        }
                        if ((i & 12582912) == 0) {
                            i3 |= startRestartGroup.changedInstance(function3) ? 8388608 : 4194304;
                        }
                        if (!startRestartGroup.shouldExecute((i3 & 4793491) != 4793490, i3 & 1)) {
                            composer2 = startRestartGroup;
                            composer2.skipToGroupEnd();
                            modifier4 = modifier;
                            z5 = z3;
                            str3 = str2;
                            z6 = z4;
                            modifier5 = modifier3;
                        } else {
                            androidx.compose.ui.Modifier modifier6 = i8 != 0 ? androidx.compose.ui.Modifier.INSTANCE : modifier;
                            boolean z7 = i4 != 0 ? false : z3;
                            java.lang.String str4 = i5 != 0 ? null : str2;
                            androidx.compose.ui.Modifier modifier7 = i6 != 0 ? androidx.compose.ui.Modifier.INSTANCE : modifier3;
                            boolean z8 = i7 != 0 ? true : z4;
                            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                                androidx.compose.runtime.ComposerKt.traceEventStart(-620652379, i3, -1, "com.paypal.oslo.feature.revolvingcreditservicing.ui.accountsummary.components.AccountSummarySection (AccountSummarySection.kt:78)");
                            }
                            int i9 = i3;
                            final boolean z9 = z7;
                            final java.lang.String str5 = str4;
                            final androidx.compose.ui.Modifier modifier8 = modifier7;
                            composer2 = startRestartGroup;
                            androidx.compose.animation.AnimatedVisibilityKt.AnimatedVisibility(z8, modifier6, (androidx.compose.animation.EnterTransition) null, (androidx.compose.animation.ExitTransition) null, (java.lang.String) null, androidx.compose.runtime.internal.ComposableLambdaKt.rememberComposableLambda(353534669, true, new kotlin.jvm.functions.Function3() { // from class: com.paypal.oslo.feature.revolvingcreditservicing.ui.accountsummary.components.AccountSummarySectionKt$$ExternalSyntheticLambda3
                                @Override // kotlin.jvm.functions.Function3
                                public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2, java.lang.Object obj3) {
                                    return com.paypal.oslo.feature.revolvingcreditservicing.ui.accountsummary.components.AccountSummarySectionKt.$r8$lambda$eMZy21qYXDFZzl_NbTpnasCIrp8(z9, uiString, function3, str5, modifier8, function0, (androidx.compose.animation.AnimatedVisibilityScope) obj, (androidx.compose.runtime.Composer) obj2, ((java.lang.Integer) obj3).intValue());
                                }
                            }, startRestartGroup, 54), composer2, ((i9 >> 18) & 14) | androidx.profileinstaller.ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE | ((i9 >> 3) & 112), 28);
                            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                                androidx.compose.runtime.ComposerKt.traceEventEnd();
                            }
                            modifier4 = modifier6;
                            z5 = z7;
                            str3 = str4;
                            modifier5 = modifier7;
                            z6 = z8;
                        }
                        endRestartGroup = composer2.endRestartGroup();
                        if (endRestartGroup != null) {
                            endRestartGroup.updateScope(new kotlin.jvm.functions.Function2() { // from class: com.paypal.oslo.feature.revolvingcreditservicing.ui.accountsummary.components.AccountSummarySectionKt$$ExternalSyntheticLambda4
                                @Override // kotlin.jvm.functions.Function2
                                public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                                    return com.paypal.oslo.feature.revolvingcreditservicing.ui.accountsummary.components.AccountSummarySectionKt.m18179$r8$lambda$91Ts4wyWJOj_yV4fUecLg0GS0(com.paypal.oslo.feature.revolvingcreditservicing.ui.common.components.UiString.this, function0, modifier4, z5, str3, modifier5, z6, function3, i, i2, (androidx.compose.runtime.Composer) obj, ((java.lang.Integer) obj2).intValue());
                                }
                            });
                            return;
                        }
                        return;
                    }
                    modifier3 = modifier2;
                    i7 = i2 & 64;
                    if (i7 != 0) {
                    }
                    if ((i & 12582912) == 0) {
                    }
                    if (!startRestartGroup.shouldExecute((i3 & 4793491) != 4793490, i3 & 1)) {
                    }
                    endRestartGroup = composer2.endRestartGroup();
                    if (endRestartGroup != null) {
                    }
                }
                str2 = str;
                i6 = i2 & 32;
                if (i6 == 0) {
                }
                modifier3 = modifier2;
                i7 = i2 & 64;
                if (i7 != 0) {
                }
                if ((i & 12582912) == 0) {
                }
                if (!startRestartGroup.shouldExecute((i3 & 4793491) != 4793490, i3 & 1)) {
                }
                endRestartGroup = composer2.endRestartGroup();
                if (endRestartGroup != null) {
                }
            }
            z3 = z;
            i5 = i2 & 16;
            if (i5 != 0) {
            }
            str2 = str;
            i6 = i2 & 32;
            if (i6 == 0) {
            }
            modifier3 = modifier2;
            i7 = i2 & 64;
            if (i7 != 0) {
            }
            if ((i & 12582912) == 0) {
            }
            if (!startRestartGroup.shouldExecute((i3 & 4793491) != 4793490, i3 & 1)) {
            }
            endRestartGroup = composer2.endRestartGroup();
            if (endRestartGroup != null) {
            }
        }
        i4 = i2 & 8;
        if (i4 == 0) {
        }
        z3 = z;
        i5 = i2 & 16;
        if (i5 != 0) {
        }
        str2 = str;
        i6 = i2 & 32;
        if (i6 == 0) {
        }
        modifier3 = modifier2;
        i7 = i2 & 64;
        if (i7 != 0) {
        }
        if ((i & 12582912) == 0) {
        }
        if (!startRestartGroup.shouldExecute((i3 & 4793491) != 4793490, i3 & 1)) {
        }
        endRestartGroup = composer2.endRestartGroup();
        if (endRestartGroup != null) {
        }
    }

    /* renamed from: $r8$lambda$-91Ts4wyWJOj_yV4fU-ecLg0GS0, reason: not valid java name */
    public static /* synthetic */ kotlin.Unit m18179$r8$lambda$91Ts4wyWJOj_yV4fUecLg0GS0(com.paypal.oslo.feature.revolvingcreditservicing.ui.common.components.UiString uiString, kotlin.jvm.functions.Function0 function0, androidx.compose.ui.Modifier modifier, boolean z, java.lang.String str, androidx.compose.ui.Modifier modifier2, boolean z2, kotlin.jvm.functions.Function3 function3, int i, int i2, androidx.compose.runtime.Composer composer, int i3) {
        AccountSummarySection(uiString, function0, modifier, z, str, modifier2, z2, function3, composer, androidx.compose.runtime.RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$J1lha4mupGb5Z73aljzxkBjyeIA(int i, androidx.compose.runtime.Composer composer, int i2) {
        final int updateChangedFlags = androidx.compose.runtime.RecomposeScopeImplKt.updateChangedFlags(i | 1);
        androidx.compose.runtime.Composer startRestartGroup = composer.startRestartGroup(-154420435);
        if (!startRestartGroup.shouldExecute(updateChangedFlags != 0, updateChangedFlags & 1)) {
            startRestartGroup.skipToGroupEnd();
        } else {
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventStart(-154420435, updateChangedFlags, -1, "com.paypal.oslo.feature.revolvingcreditservicing.ui.accountsummary.components.AccountSummarySectionPreview (AccountSummarySection.kt:113)");
            }
            androidx.compose.ui.Modifier m1706padding3ABfNKs = androidx.compose.foundation.layout.PaddingKt.m1706padding3ABfNKs(androidx.compose.ui.Modifier.INSTANCE, com.paypal.pds.core.ConstantsKt.getSpacing16());
            com.paypal.oslo.feature.revolvingcreditservicing.ui.common.components.UiString.PlainString uiString = com.paypal.oslo.feature.revolvingcreditservicing.ui.common.components.UiStringKt.toUiString("Recent activity");
            java.lang.Object rememberedValue = startRestartGroup.rememberedValue();
            if (rememberedValue == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                rememberedValue = new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.feature.revolvingcreditservicing.ui.accountsummary.components.AccountSummarySectionKt$$ExternalSyntheticLambda0
                    @Override // kotlin.jvm.functions.Function0
                    public final java.lang.Object invoke() {
                        kotlin.Unit unit;
                        unit = kotlin.Unit.INSTANCE;
                        return unit;
                    }
                };
                startRestartGroup.updateRememberedValue(rememberedValue);
            }
            AccountSummarySection(uiString, (kotlin.jvm.functions.Function0) rememberedValue, m1706padding3ABfNKs, true, "See all activities", null, false, com.paypal.oslo.feature.revolvingcreditservicing.ui.accountsummary.components.ComposableSingletons$AccountSummarySectionKt.INSTANCE.m18188getLambda$1481053159$revolvingcredit_servicing_prodRelease(), startRestartGroup, 12610608, 96);
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventEnd();
            }
        }
        androidx.compose.runtime.ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new kotlin.jvm.functions.Function2() { // from class: com.paypal.oslo.feature.revolvingcreditservicing.ui.accountsummary.components.AccountSummarySectionKt$$ExternalSyntheticLambda1
                @Override // kotlin.jvm.functions.Function2
                public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                    return com.paypal.oslo.feature.revolvingcreditservicing.ui.accountsummary.components.AccountSummarySectionKt.$r8$lambda$J1lha4mupGb5Z73aljzxkBjyeIA(updateChangedFlags, (androidx.compose.runtime.Composer) obj, ((java.lang.Integer) obj2).intValue());
                }
            });
        }
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ boolean $r8$lambda$_R2NeNUb1P6RI5JULOazjSMD9bU(kotlin.jvm.functions.Function0 function0) {
        function0.invoke();
        return true;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$eMZy21qYXDFZzl_NbTpnasCIrp8(boolean z, com.paypal.oslo.feature.revolvingcreditservicing.ui.common.components.UiString uiString, kotlin.jvm.functions.Function3 function3, final java.lang.String str, final androidx.compose.ui.Modifier modifier, final kotlin.jvm.functions.Function0 function0, androidx.compose.animation.AnimatedVisibilityScope animatedVisibilityScope, androidx.compose.runtime.Composer composer, int i) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(animatedVisibilityScope, "");
        if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
            androidx.compose.runtime.ComposerKt.traceEventStart(353534669, i, -1, "com.paypal.oslo.feature.revolvingcreditservicing.ui.accountsummary.components.AccountSummarySection.<anonymous> (AccountSummarySection.kt:80)");
        }
        androidx.compose.ui.Modifier.Companion companion = androidx.compose.ui.Modifier.INSTANCE;
        androidx.compose.ui.layout.MeasurePolicy columnMeasurePolicy = androidx.compose.foundation.layout.ColumnKt.columnMeasurePolicy(androidx.compose.foundation.layout.Arrangement.INSTANCE.getTop(), androidx.compose.ui.Alignment.INSTANCE.getStart(), composer, 0);
        int hashCode = java.lang.Long.hashCode(androidx.compose.runtime.ComposablesKt.getCurrentCompositeKeyHashCode(composer, 0));
        androidx.compose.runtime.CompositionLocalMap currentCompositionLocalMap = composer.getCurrentCompositionLocalMap();
        androidx.compose.ui.Modifier materializeModifier = androidx.compose.ui.ComposedModifierKt.materializeModifier(composer, companion);
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
        if (z) {
            composer.startReplaceGroup(151556760);
            com.paypal.pds.components.SectionHeaderKt.SectionHeader(null, uiString.asString(composer, 0), null, androidx.compose.runtime.internal.ComposableLambdaKt.rememberComposableLambda(-1191163944, true, new kotlin.jvm.functions.Function2() { // from class: com.paypal.oslo.feature.revolvingcreditservicing.ui.accountsummary.components.AccountSummarySectionKt$$ExternalSyntheticLambda5
                @Override // kotlin.jvm.functions.Function2
                public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                    return com.paypal.oslo.feature.revolvingcreditservicing.ui.accountsummary.components.AccountSummarySectionKt.$r8$lambda$wX82AfrB5KmIecb88mhzr88vqS8(str, modifier, function0, (androidx.compose.runtime.Composer) obj, ((java.lang.Integer) obj2).intValue());
                }
            }, composer, 54), composer, 3072, 5);
            composer.endReplaceGroup();
        } else {
            composer.startReplaceGroup(152413476);
            com.paypal.pds.components.SectionHeaderKt.SectionHeader(null, uiString.asString(composer, 0), null, null, composer, 0, 13);
            composer.endReplaceGroup();
        }
        androidx.compose.foundation.layout.SpacerKt.Spacer(androidx.compose.foundation.layout.PaddingKt.m1706padding3ABfNKs(androidx.compose.ui.Modifier.INSTANCE, com.paypal.pds.core.ConstantsKt.getSpacing4()), composer, 0);
        function3.invoke(columnScopeInstance, composer, 6);
        composer.endNode();
        if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
            androidx.compose.runtime.ComposerKt.traceEventEnd();
        }
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$qepKveGgYDlSgk2nyfv1nN5Cpjw(java.lang.String str, final kotlin.jvm.functions.Function0 function0, androidx.compose.ui.semantics.SemanticsPropertyReceiver semanticsPropertyReceiver) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(semanticsPropertyReceiver, "");
        androidx.compose.ui.semantics.SemanticsPropertiesKt.m7815setRolekuIjeqM(semanticsPropertyReceiver, androidx.compose.ui.semantics.Role.INSTANCE.m7798getButtono7Vup1c());
        androidx.compose.ui.semantics.SemanticsPropertiesKt.setContentDescription(semanticsPropertyReceiver, str);
        androidx.compose.ui.semantics.SemanticsPropertiesKt.onClick$default(semanticsPropertyReceiver, null, new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.feature.revolvingcreditservicing.ui.accountsummary.components.AccountSummarySectionKt$$ExternalSyntheticLambda2
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return java.lang.Boolean.valueOf(com.paypal.oslo.feature.revolvingcreditservicing.ui.accountsummary.components.AccountSummarySectionKt.$r8$lambda$_R2NeNUb1P6RI5JULOazjSMD9bU(kotlin.jvm.functions.Function0.this));
            }
        }, 1, null);
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$wX82AfrB5KmIecb88mhzr88vqS8(final java.lang.String str, androidx.compose.ui.Modifier modifier, final kotlin.jvm.functions.Function0 function0, androidx.compose.runtime.Composer composer, int i) {
        androidx.compose.ui.Modifier modifier2;
        androidx.compose.ui.Modifier clearAndSetSemantics;
        if (composer.shouldExecute((i & 3) != 2, i & 1)) {
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventStart(-1191163944, i, -1, "com.paypal.oslo.feature.revolvingcreditservicing.ui.accountsummary.components.AccountSummarySection.<anonymous>.<anonymous>.<anonymous> (AccountSummarySection.kt:83)");
            }
            java.lang.String stringResource = androidx.compose.ui.res.StringResources_androidKt.stringResource(com.paypal.oslo.feature.revolvingcreditservicing.R.string.feature_revolvingcredit_servicing_common_see_all, composer, 0);
            com.paypal.pds.components.ButtonStyle.Secondary secondary = com.paypal.pds.components.ButtonStyle.Secondary.INSTANCE;
            com.paypal.pds.components.ButtonSize.Small small = com.paypal.pds.components.ButtonSize.Small.INSTANCE;
            if (str == null) {
                composer.startReplaceGroup(-944896458);
                composer.endReplaceGroup();
                clearAndSetSemantics = null;
                modifier2 = modifier;
            } else {
                composer.startReplaceGroup(-944896457);
                boolean changed = composer.changed(str);
                boolean changed2 = composer.changed(function0);
                java.lang.Object rememberedValue = composer.rememberedValue();
                if ((changed | changed2) || rememberedValue == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                    rememberedValue = new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.revolvingcreditservicing.ui.accountsummary.components.AccountSummarySectionKt$$ExternalSyntheticLambda6
                        @Override // kotlin.jvm.functions.Function1
                        public final java.lang.Object invoke(java.lang.Object obj) {
                            return com.paypal.oslo.feature.revolvingcreditservicing.ui.accountsummary.components.AccountSummarySectionKt.$r8$lambda$qepKveGgYDlSgk2nyfv1nN5Cpjw(str, function0, (androidx.compose.ui.semantics.SemanticsPropertyReceiver) obj);
                        }
                    };
                    composer.updateRememberedValue(rememberedValue);
                }
                modifier2 = modifier;
                clearAndSetSemantics = androidx.compose.ui.semantics.SemanticsModifierKt.clearAndSetSemantics(modifier, (kotlin.jvm.functions.Function1) rememberedValue);
                composer.endReplaceGroup();
            }
            if (clearAndSetSemantics == null) {
                clearAndSetSemantics = modifier2;
            }
            com.paypal.pds.components.ButtonKt.Button(function0, stringResource, clearAndSetSemantics, null, null, secondary, small, false, false, composer, 1769472, 408);
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventEnd();
            }
        } else {
            composer.skipToGroupEnd();
        }
        return kotlin.Unit.INSTANCE;
    }
}
