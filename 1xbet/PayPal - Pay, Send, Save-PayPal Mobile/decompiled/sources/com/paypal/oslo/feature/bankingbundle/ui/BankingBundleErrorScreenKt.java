package com.paypal.oslo.feature.bankingbundle.ui;

@kotlin.Metadata(d1 = {"\u0000$\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\u001aM\u0010\u0000\u001a\u00020\u00012\u000e\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u00032\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00010\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00062\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\b2\b\b\u0002\u0010\t\u001a\u00020\nH\u0001¢\u0006\u0002\u0010\u000b\u001a\r\u0010\f\u001a\u00020\u0001H\u0003¢\u0006\u0002\u0010\r\u001a\r\u0010\u000e\u001a\u00020\u0001H\u0003¢\u0006\u0002\u0010\r¨\u0006\u000f"}, d2 = {"BankingBundleErrorScreen", "", "onClose", "Lkotlin/Function0;", "onRetry", "isRetryable", "", "errorDetail", "Lcom/paypal/oslo/feature/bankingbundle/domain/error/ErrorDetail;", "sourceScreen", "", "(Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;ZLcom/paypal/oslo/feature/bankingbundle/domain/error/ErrorDetail;Ljava/lang/String;Landroidx/compose/runtime/Composer;II)V", "BankingBundleErrorScreenPreview", "(Landroidx/compose/runtime/Composer;I)V", "BankingBundleErrorScreenRetryablePreview", "banking-bundle_prodRelease"}, k = 2, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class BankingBundleErrorScreenKt {
    /* JADX WARN: Removed duplicated region for block: B:105:0x0068  */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0049  */
    /* JADX WARN: Removed duplicated region for block: B:112:0x004c  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0065  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0081  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x00a1  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x00ac  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x025e  */
    /* JADX WARN: Removed duplicated region for block: B:82:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:96:0x0251  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x00a3  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x0084  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void BankingBundleErrorScreen(kotlin.jvm.functions.Function0<kotlin.Unit> function0, kotlin.jvm.functions.Function0<kotlin.Unit> function02, boolean z, com.paypal.oslo.feature.bankingbundle.domain.error.ErrorDetail errorDetail, java.lang.String str, androidx.compose.runtime.Composer composer, final int i, final int i2) {
        kotlin.jvm.functions.Function0<kotlin.Unit> function03;
        int i3;
        kotlin.jvm.functions.Function0<kotlin.Unit> function04;
        int i4;
        boolean z2;
        int i5;
        com.paypal.oslo.feature.bankingbundle.domain.error.ErrorDetail errorDetail2;
        int i6;
        java.lang.String str2;
        kotlin.jvm.functions.Function0<kotlin.Unit> function05;
        kotlin.jvm.functions.Function0<kotlin.Unit> function06;
        final java.lang.String str3;
        final com.paypal.oslo.feature.bankingbundle.domain.error.ErrorDetail errorDetail3;
        androidx.compose.runtime.ScopeUpdateScope endRestartGroup;
        java.lang.String stringResource;
        java.lang.String stringResource2;
        androidx.compose.runtime.Composer startRestartGroup = composer.startRestartGroup(-974011395);
        int i7 = i2 & 1;
        if (i7 != 0) {
            i3 = i | 6;
            function03 = function0;
        } else if ((i & 6) == 0) {
            function03 = function0;
            i3 = (startRestartGroup.changedInstance(function03) ? 4 : 2) | i;
        } else {
            function03 = function0;
            i3 = i;
        }
        int i8 = i2 & 2;
        if (i8 != 0) {
            i3 |= 48;
        } else if ((i & 48) == 0) {
            function04 = function02;
            i3 |= startRestartGroup.changedInstance(function04) ? 32 : 16;
            i4 = i2 & 4;
            if (i4 == 0) {
                i3 |= 384;
            } else if ((i & 384) == 0) {
                z2 = z;
                i3 |= startRestartGroup.changed(z2) ? 256 : 128;
                i5 = i2 & 8;
                if (i5 != 0) {
                    i3 |= 3072;
                } else if ((i & 3072) == 0) {
                    errorDetail2 = errorDetail;
                    i3 |= startRestartGroup.changed(errorDetail2) ? 2048 : 1024;
                    i6 = i2 & 16;
                    if (i6 == 0) {
                        i3 |= 24576;
                    } else if ((i & 24576) == 0) {
                        str2 = str;
                        i3 |= startRestartGroup.changed(str2) ? 16384 : 8192;
                        if (!startRestartGroup.shouldExecute((i3 & 9363) != 9362, i3 & 1)) {
                            startRestartGroup.skipToGroupEnd();
                            function05 = function03;
                            function06 = function04;
                            str3 = str2;
                            errorDetail3 = errorDetail2;
                        } else {
                            if (i7 != 0) {
                                java.lang.Object rememberedValue = startRestartGroup.rememberedValue();
                                if (rememberedValue == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                                    rememberedValue = new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.feature.bankingbundle.ui.BankingBundleErrorScreenKt$$ExternalSyntheticLambda1
                                        @Override // kotlin.jvm.functions.Function0
                                        public final java.lang.Object invoke() {
                                            kotlin.Unit unit;
                                            unit = kotlin.Unit.INSTANCE;
                                            return unit;
                                        }
                                    };
                                    startRestartGroup.updateRememberedValue(rememberedValue);
                                }
                                function05 = (kotlin.jvm.functions.Function0) rememberedValue;
                            } else {
                                function05 = function03;
                            }
                            if (i8 != 0) {
                                java.lang.Object rememberedValue2 = startRestartGroup.rememberedValue();
                                if (rememberedValue2 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                                    rememberedValue2 = new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.feature.bankingbundle.ui.BankingBundleErrorScreenKt$$ExternalSyntheticLambda2
                                        @Override // kotlin.jvm.functions.Function0
                                        public final java.lang.Object invoke() {
                                            kotlin.Unit unit;
                                            unit = kotlin.Unit.INSTANCE;
                                            return unit;
                                        }
                                    };
                                    startRestartGroup.updateRememberedValue(rememberedValue2);
                                }
                                function06 = (kotlin.jvm.functions.Function0) rememberedValue2;
                            } else {
                                function06 = function04;
                            }
                            boolean z3 = i4 != 0 ? false : z2;
                            com.paypal.oslo.feature.bankingbundle.domain.error.ErrorDetail errorDetail4 = i5 != 0 ? null : errorDetail2;
                            java.lang.String str4 = i6 != 0 ? "unknown" : str2;
                            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                                androidx.compose.runtime.ComposerKt.traceEventStart(-974011395, i3, -1, "com.paypal.oslo.feature.bankingbundle.ui.BankingBundleErrorScreen (BankingBundleErrorScreen.kt:65)");
                            }
                            int i9 = i3 & 896;
                            boolean z4 = i9 == 256;
                            boolean z5 = (57344 & i3) == 16384;
                            boolean z6 = (i3 & 7168) == 2048;
                            com.paypal.oslo.feature.bankingbundle.ui.BankingBundleErrorScreenKt$BankingBundleErrorScreen$3$1 rememberedValue3 = startRestartGroup.rememberedValue();
                            if ((z4 | z5 | z6) || rememberedValue3 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                                rememberedValue3 = new com.paypal.oslo.feature.bankingbundle.ui.BankingBundleErrorScreenKt$BankingBundleErrorScreen$3$1(z3, str4, errorDetail4, null);
                                startRestartGroup.updateRememberedValue(rememberedValue3);
                            }
                            androidx.compose.runtime.EffectsKt.LaunchedEffect(errorDetail4, str4, java.lang.Boolean.valueOf(z3), (kotlin.jvm.functions.Function2) rememberedValue3, startRestartGroup, ((i3 >> 9) & 126) | i9);
                            androidx.compose.ui.Modifier m1706padding3ABfNKs = androidx.compose.foundation.layout.PaddingKt.m1706padding3ABfNKs(androidx.compose.foundation.layout.WindowInsetsPadding_androidKt.statusBarsPadding(androidx.compose.foundation.layout.SizeKt.fillMaxSize$default(androidx.compose.ui.Modifier.INSTANCE, 0.0f, 1, null)), com.paypal.pds.core.ConstantsKt.getSpacing16());
                            androidx.compose.ui.layout.MeasurePolicy maybeCachedBoxMeasurePolicy = androidx.compose.foundation.layout.BoxKt.maybeCachedBoxMeasurePolicy(androidx.compose.ui.Alignment.INSTANCE.getCenter(), false);
                            int hashCode = java.lang.Long.hashCode(androidx.compose.runtime.ComposablesKt.getCurrentCompositeKeyHashCode(startRestartGroup, 0));
                            androidx.compose.runtime.CompositionLocalMap currentCompositionLocalMap = startRestartGroup.getCurrentCompositionLocalMap();
                            androidx.compose.ui.Modifier materializeModifier = androidx.compose.ui.ComposedModifierKt.materializeModifier(startRestartGroup, m1706padding3ABfNKs);
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
                            androidx.compose.runtime.Updater.m5307setimpl(m5299constructorimpl, maybeCachedBoxMeasurePolicy, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetMeasurePolicy());
                            androidx.compose.runtime.Updater.m5307setimpl(m5299constructorimpl, currentCompositionLocalMap, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
                            androidx.compose.runtime.Updater.m5303initimpl(m5299constructorimpl, java.lang.Integer.valueOf(hashCode), androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetCompositeKeyHash());
                            androidx.compose.runtime.Updater.m5305reconcileimpl(m5299constructorimpl, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getApplyOnDeactivatedNodeAssertion());
                            androidx.compose.runtime.Updater.m5307setimpl(m5299constructorimpl, materializeModifier, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetModifier());
                            androidx.compose.foundation.layout.BoxScopeInstance boxScopeInstance = androidx.compose.foundation.layout.BoxScopeInstance.INSTANCE;
                            com.paypal.pds.core.Icon.Info info = com.paypal.pds.core.Icon.Info.INSTANCE;
                            java.lang.String stringResource3 = androidx.compose.ui.res.StringResources_androidKt.stringResource(com.paypal.oslo.feature.bankingbundle.R.string.feature_banking_bundle_error_title, startRestartGroup, 0);
                            if (z3) {
                                startRestartGroup.startReplaceGroup(536485731);
                                stringResource = androidx.compose.ui.res.StringResources_androidKt.stringResource(com.paypal.oslo.feature.bankingbundle.R.string.feature_banking_bundle_error_server_description, startRestartGroup, 0);
                                startRestartGroup.endReplaceGroup();
                            } else {
                                startRestartGroup.startReplaceGroup(536594851);
                                stringResource = androidx.compose.ui.res.StringResources_androidKt.stringResource(com.paypal.oslo.feature.bankingbundle.R.string.feature_banking_bundle_error_client_description, startRestartGroup, 0);
                                startRestartGroup.endReplaceGroup();
                            }
                            java.lang.String str5 = stringResource;
                            if (z3) {
                                startRestartGroup.startReplaceGroup(536741605);
                                stringResource2 = androidx.compose.ui.res.StringResources_androidKt.stringResource(com.paypal.oslo.feature.bankingbundle.R.string.feature_banking_bundle_error_try_again_button, startRestartGroup, 0);
                                startRestartGroup.endReplaceGroup();
                            } else {
                                startRestartGroup.startReplaceGroup(536848524);
                                stringResource2 = androidx.compose.ui.res.StringResources_androidKt.stringResource(com.paypal.oslo.feature.bankingbundle.R.string.feature_banking_bundle_error_ok_button, startRestartGroup, 0);
                                startRestartGroup.endReplaceGroup();
                            }
                            java.lang.String str6 = str4;
                            com.paypal.oslo.feature.bankingbundle.domain.error.ErrorDetail errorDetail5 = errorDetail4;
                            com.paypal.pds.components.EmptyStateKt.EmptyState(info, null, null, stringResource3, str5, stringResource2, z3 ? function06 : function05, startRestartGroup, 6, 6);
                            startRestartGroup.endNode();
                            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                                androidx.compose.runtime.ComposerKt.traceEventEnd();
                            }
                            z2 = z3;
                            str3 = str6;
                            errorDetail3 = errorDetail5;
                        }
                        endRestartGroup = startRestartGroup.endRestartGroup();
                        if (endRestartGroup != null) {
                            final kotlin.jvm.functions.Function0<kotlin.Unit> function07 = function05;
                            final kotlin.jvm.functions.Function0<kotlin.Unit> function08 = function06;
                            final boolean z7 = z2;
                            endRestartGroup.updateScope(new kotlin.jvm.functions.Function2() { // from class: com.paypal.oslo.feature.bankingbundle.ui.BankingBundleErrorScreenKt$$ExternalSyntheticLambda3
                                @Override // kotlin.jvm.functions.Function2
                                public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                                    return com.paypal.oslo.feature.bankingbundle.ui.BankingBundleErrorScreenKt.$r8$lambda$FhJviCGRIzOAbYqGsLn3LqQX2HY(kotlin.jvm.functions.Function0.this, function08, z7, errorDetail3, str3, i, i2, (androidx.compose.runtime.Composer) obj, ((java.lang.Integer) obj2).intValue());
                                }
                            });
                            return;
                        }
                        return;
                    }
                    str2 = str;
                    if (!startRestartGroup.shouldExecute((i3 & 9363) != 9362, i3 & 1)) {
                    }
                    endRestartGroup = startRestartGroup.endRestartGroup();
                    if (endRestartGroup != null) {
                    }
                }
                errorDetail2 = errorDetail;
                i6 = i2 & 16;
                if (i6 == 0) {
                }
                str2 = str;
                if (!startRestartGroup.shouldExecute((i3 & 9363) != 9362, i3 & 1)) {
                }
                endRestartGroup = startRestartGroup.endRestartGroup();
                if (endRestartGroup != null) {
                }
            }
            z2 = z;
            i5 = i2 & 8;
            if (i5 != 0) {
            }
            errorDetail2 = errorDetail;
            i6 = i2 & 16;
            if (i6 == 0) {
            }
            str2 = str;
            if (!startRestartGroup.shouldExecute((i3 & 9363) != 9362, i3 & 1)) {
            }
            endRestartGroup = startRestartGroup.endRestartGroup();
            if (endRestartGroup != null) {
            }
        }
        function04 = function02;
        i4 = i2 & 4;
        if (i4 == 0) {
        }
        z2 = z;
        i5 = i2 & 8;
        if (i5 != 0) {
        }
        errorDetail2 = errorDetail;
        i6 = i2 & 16;
        if (i6 == 0) {
        }
        str2 = str;
        if (!startRestartGroup.shouldExecute((i3 & 9363) != 9362, i3 & 1)) {
        }
        endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
        }
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$FhJviCGRIzOAbYqGsLn3LqQX2HY(kotlin.jvm.functions.Function0 function0, kotlin.jvm.functions.Function0 function02, boolean z, com.paypal.oslo.feature.bankingbundle.domain.error.ErrorDetail errorDetail, java.lang.String str, int i, int i2, androidx.compose.runtime.Composer composer, int i3) {
        BankingBundleErrorScreen(function0, function02, z, errorDetail, str, composer, androidx.compose.runtime.RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$HPWW8AwfNexNXr0wIjmZiEdxiTU(int i, androidx.compose.runtime.Composer composer, int i2) {
        final int updateChangedFlags = androidx.compose.runtime.RecomposeScopeImplKt.updateChangedFlags(i | 1);
        androidx.compose.runtime.Composer startRestartGroup = composer.startRestartGroup(-332076557);
        if (!startRestartGroup.shouldExecute(updateChangedFlags != 0, updateChangedFlags & 1)) {
            startRestartGroup.skipToGroupEnd();
        } else {
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventStart(-332076557, updateChangedFlags, -1, "com.paypal.oslo.feature.bankingbundle.ui.BankingBundleErrorScreenRetryablePreview (BankingBundleErrorScreen.kt:127)");
            }
            BankingBundleErrorScreen(null, null, true, null, null, startRestartGroup, 384, 27);
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventEnd();
            }
        }
        androidx.compose.runtime.ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new kotlin.jvm.functions.Function2() { // from class: com.paypal.oslo.feature.bankingbundle.ui.BankingBundleErrorScreenKt$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function2
                public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                    return com.paypal.oslo.feature.bankingbundle.ui.BankingBundleErrorScreenKt.$r8$lambda$HPWW8AwfNexNXr0wIjmZiEdxiTU(updateChangedFlags, (androidx.compose.runtime.Composer) obj, ((java.lang.Integer) obj2).intValue());
                }
            });
        }
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$tiQDYh6yJ65zoeGNcYLmfNCf27k(int i, androidx.compose.runtime.Composer composer, int i2) {
        final int updateChangedFlags = androidx.compose.runtime.RecomposeScopeImplKt.updateChangedFlags(i | 1);
        androidx.compose.runtime.Composer startRestartGroup = composer.startRestartGroup(863922209);
        if (!startRestartGroup.shouldExecute(updateChangedFlags != 0, updateChangedFlags & 1)) {
            startRestartGroup.skipToGroupEnd();
        } else {
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventStart(863922209, updateChangedFlags, -1, "com.paypal.oslo.feature.bankingbundle.ui.BankingBundleErrorScreenPreview (BankingBundleErrorScreen.kt:121)");
            }
            BankingBundleErrorScreen(null, null, false, null, null, startRestartGroup, 384, 27);
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventEnd();
            }
        }
        androidx.compose.runtime.ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new kotlin.jvm.functions.Function2() { // from class: com.paypal.oslo.feature.bankingbundle.ui.BankingBundleErrorScreenKt$$ExternalSyntheticLambda4
                @Override // kotlin.jvm.functions.Function2
                public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                    return com.paypal.oslo.feature.bankingbundle.ui.BankingBundleErrorScreenKt.$r8$lambda$tiQDYh6yJ65zoeGNcYLmfNCf27k(updateChangedFlags, (androidx.compose.runtime.Composer) obj, ((java.lang.Integer) obj2).intValue());
                }
            });
        }
        return kotlin.Unit.INSTANCE;
    }
}
