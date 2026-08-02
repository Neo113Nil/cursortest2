package com.paypal.oslo.feature.qrc.ui.common;

@kotlin.Metadata(d1 = {"\u0000 \n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0006\u001ao\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00032\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00010\u00062\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00032\u0010\b\u0002\u0010\t\u001a\n\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u00062\u000e\b\u0002\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00010\u00062\b\b\u0002\u0010\u000b\u001a\u00020\fH\u0001¢\u0006\u0002\u0010\r\u001a\r\u0010\u000e\u001a\u00020\u0001H\u0003¢\u0006\u0002\u0010\u000f\u001a\r\u0010\u0010\u001a\u00020\u0001H\u0003¢\u0006\u0002\u0010\u000f\u001a\r\u0010\u0011\u001a\u00020\u0001H\u0003¢\u0006\u0002\u0010\u000f¨\u0006\u0012"}, d2 = {"QrcCommonDialog", "", "title", "", "primaryButtonText", "onPrimaryButtonClick", "Lkotlin/Function0;", com.paypal.oslo.feature.inappcheckout.domain.util.LoggerParameterKeys.DESCRIPTION, "secondaryButtonText", "onSecondaryButtonClick", "onDismissRequest", "isPrimaryButtonLoading", "", "(Ljava/lang/String;Ljava/lang/String;Lkotlin/jvm/functions/Function0;Ljava/lang/String;Ljava/lang/String;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;ZLandroidx/compose/runtime/Composer;II)V", "CancelPaymentDialogPreview", "(Landroidx/compose/runtime/Composer;I)V", "CancelPaymentDialogLoadingPreview", "PayingInSellerCurrencyDialogPreview", "qrc_prodRelease"}, k = 2, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class QrcCommonDialogKt {
    /* JADX WARN: Removed duplicated region for block: B:102:0x008e  */
    /* JADX WARN: Removed duplicated region for block: B:109:0x0071  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x006e  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x008c  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00a8  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x00c5  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00ea  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x00f6  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x01f8  */
    /* JADX WARN: Removed duplicated region for block: B:76:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:86:0x01e6  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x00ec  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x00ca  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x00aa  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void QrcCommonDialog(final java.lang.String str, final java.lang.String str2, final kotlin.jvm.functions.Function0<kotlin.Unit> function0, java.lang.String str3, java.lang.String str4, kotlin.jvm.functions.Function0<kotlin.Unit> function02, kotlin.jvm.functions.Function0<kotlin.Unit> function03, boolean z, androidx.compose.runtime.Composer composer, final int i, final int i2) {
        int i3;
        int i4;
        int i5;
        int i6;
        kotlin.jvm.functions.Function0<kotlin.Unit> function04;
        int i7;
        final java.lang.String str5;
        final java.lang.String str6;
        final kotlin.jvm.functions.Function0<kotlin.Unit> function05;
        final boolean z2;
        final kotlin.jvm.functions.Function0<kotlin.Unit> function06;
        androidx.compose.runtime.ScopeUpdateScope endRestartGroup;
        final androidx.compose.runtime.internal.ComposableLambda rememberComposableLambda;
        kotlin.jvm.functions.Function0<kotlin.Unit> function07;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str2, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(function0, "");
        androidx.compose.runtime.Composer startRestartGroup = composer.startRestartGroup(-1075815874);
        if ((i & 6) == 0) {
            i3 = (startRestartGroup.changed(str) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i & 48) == 0) {
            i3 |= startRestartGroup.changed(str2) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i3 |= startRestartGroup.changedInstance(function0) ? 256 : 128;
        }
        int i8 = i2 & 8;
        if (i8 != 0) {
            i3 |= 3072;
        } else if ((i & 3072) == 0) {
            i3 |= startRestartGroup.changed(str3) ? 2048 : 1024;
            i4 = i2 & 16;
            if (i4 == 0) {
                i3 |= 24576;
            } else if ((i & 24576) == 0) {
                i3 |= startRestartGroup.changed(str4) ? 16384 : 8192;
                i5 = i2 & 32;
                if (i5 != 0) {
                    i3 |= androidx.profileinstaller.ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE;
                } else if ((196608 & i) == 0) {
                    i3 |= startRestartGroup.changedInstance(function02) ? 131072 : 65536;
                    i6 = i2 & 64;
                    if (i6 == 0) {
                        i3 |= 1572864;
                    } else if ((1572864 & i) == 0) {
                        function04 = function03;
                        i3 |= startRestartGroup.changedInstance(function04) ? 1048576 : 524288;
                        i7 = i2 & 128;
                        if (i7 != 0) {
                            i3 |= 12582912;
                        } else if ((i & 12582912) == 0) {
                            i3 |= startRestartGroup.changed(z) ? 8388608 : 4194304;
                        }
                        if (!startRestartGroup.shouldExecute((i3 & 4793491) != 4793490, i3 & 1)) {
                            startRestartGroup.skipToGroupEnd();
                            str5 = str3;
                            str6 = str4;
                            function05 = function02;
                            z2 = z;
                            function06 = function04;
                        } else {
                            java.lang.String str7 = i8 != 0 ? null : str3;
                            java.lang.String str8 = i4 != 0 ? null : str4;
                            kotlin.jvm.functions.Function0<kotlin.Unit> function08 = i5 != 0 ? null : function02;
                            if (i6 != 0) {
                                java.lang.Object rememberedValue = startRestartGroup.rememberedValue();
                                if (rememberedValue == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                                    rememberedValue = new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.feature.qrc.ui.common.QrcCommonDialogKt$$ExternalSyntheticLambda5
                                        @Override // kotlin.jvm.functions.Function0
                                        public final java.lang.Object invoke() {
                                            kotlin.Unit unit;
                                            unit = kotlin.Unit.INSTANCE;
                                            return unit;
                                        }
                                    };
                                    startRestartGroup.updateRememberedValue(rememberedValue);
                                }
                                function04 = (kotlin.jvm.functions.Function0) rememberedValue;
                            }
                            z2 = i7 != 0 ? false : z;
                            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                                androidx.compose.runtime.ComposerKt.traceEventStart(-1075815874, i3, -1, "com.paypal.oslo.feature.qrc.ui.common.QrcCommonDialog (QrcCommonDialog.kt:39)");
                            }
                            if (str8 != null) {
                                startRestartGroup.startReplaceGroup(-584345105);
                                final boolean z3 = z2;
                                final java.lang.String str9 = str8;
                                final kotlin.jvm.functions.Function0<kotlin.Unit> function09 = function08;
                                rememberComposableLambda = androidx.compose.runtime.internal.ComposableLambdaKt.rememberComposableLambda(582084762, true, new kotlin.jvm.functions.Function2() { // from class: com.paypal.oslo.feature.qrc.ui.common.QrcCommonDialogKt$$ExternalSyntheticLambda6
                                    @Override // kotlin.jvm.functions.Function2
                                    public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                                        return com.paypal.oslo.feature.qrc.ui.common.QrcCommonDialogKt.$r8$lambda$PWMzvRvXF2DbaDVgGAInpa66Z6M(z3, function0, str2, str9, function09, (androidx.compose.runtime.Composer) obj, ((java.lang.Integer) obj2).intValue());
                                    }
                                }, startRestartGroup, 54);
                                startRestartGroup.endReplaceGroup();
                            } else {
                                startRestartGroup.startReplaceGroup(-583508198);
                                rememberComposableLambda = androidx.compose.runtime.internal.ComposableLambdaKt.rememberComposableLambda(1656577265, true, new kotlin.jvm.functions.Function2() { // from class: com.paypal.oslo.feature.qrc.ui.common.QrcCommonDialogKt$$ExternalSyntheticLambda7
                                    @Override // kotlin.jvm.functions.Function2
                                    public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                                        return com.paypal.oslo.feature.qrc.ui.common.QrcCommonDialogKt.$r8$lambda$kRHENVmfP0KKhRPA1S_mERxjVHY(z2, function0, str2, (androidx.compose.runtime.Composer) obj, ((java.lang.Integer) obj2).intValue());
                                    }
                                }, startRestartGroup, 54);
                                startRestartGroup.endReplaceGroup();
                            }
                            if (!z2) {
                                startRestartGroup.startReplaceGroup(-582976548);
                                startRestartGroup.endReplaceGroup();
                                function07 = function04;
                            } else {
                                startRestartGroup.startReplaceGroup(-582931350);
                                java.lang.Object rememberedValue2 = startRestartGroup.rememberedValue();
                                if (rememberedValue2 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                                    rememberedValue2 = new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.feature.qrc.ui.common.QrcCommonDialogKt$$ExternalSyntheticLambda8
                                        @Override // kotlin.jvm.functions.Function0
                                        public final java.lang.Object invoke() {
                                            kotlin.Unit unit;
                                            unit = kotlin.Unit.INSTANCE;
                                            return unit;
                                        }
                                    };
                                    startRestartGroup.updateRememberedValue(rememberedValue2);
                                }
                                startRestartGroup.endReplaceGroup();
                                function07 = (kotlin.jvm.functions.Function0) rememberedValue2;
                            }
                            com.paypal.pds.components.DialogKt.Dialog(str, androidx.compose.ui.platform.TestTagKt.testTag(androidx.compose.ui.Modifier.INSTANCE, com.paypal.oslo.feature.qrc.ui.common.QrcCommonDialogTestTags.DIALOG_CONTAINER), str7, androidx.compose.runtime.internal.ComposableLambdaKt.rememberComposableLambda(-1390152218, true, new kotlin.jvm.functions.Function2() { // from class: com.paypal.oslo.feature.qrc.ui.common.QrcCommonDialogKt$$ExternalSyntheticLambda9
                                @Override // kotlin.jvm.functions.Function2
                                public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                                    return com.paypal.oslo.feature.qrc.ui.common.QrcCommonDialogKt.$r8$lambda$n7482XOhIcGTxqBUKVdaRO0HBY4(kotlin.jvm.functions.Function2.this, (androidx.compose.runtime.Composer) obj, ((java.lang.Integer) obj2).intValue());
                                }
                            }, startRestartGroup, 54), function07, startRestartGroup, (i3 & 14) | 3120 | ((i3 >> 3) & 896), 0);
                            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                                androidx.compose.runtime.ComposerKt.traceEventEnd();
                            }
                            function06 = function04;
                            str5 = str7;
                            str6 = str8;
                            function05 = function08;
                        }
                        endRestartGroup = startRestartGroup.endRestartGroup();
                        if (endRestartGroup != null) {
                            final boolean z4 = z2;
                            endRestartGroup.updateScope(new kotlin.jvm.functions.Function2() { // from class: com.paypal.oslo.feature.qrc.ui.common.QrcCommonDialogKt$$ExternalSyntheticLambda10
                                @Override // kotlin.jvm.functions.Function2
                                public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                                    return com.paypal.oslo.feature.qrc.ui.common.QrcCommonDialogKt.$r8$lambda$QYu5IVk1WDPALuHaW6wemlU2lv8(str, str2, function0, str5, str6, function05, function06, z4, i, i2, (androidx.compose.runtime.Composer) obj, ((java.lang.Integer) obj2).intValue());
                                }
                            });
                            return;
                        }
                        return;
                    }
                    function04 = function03;
                    i7 = i2 & 128;
                    if (i7 != 0) {
                    }
                    if (!startRestartGroup.shouldExecute((i3 & 4793491) != 4793490, i3 & 1)) {
                    }
                    endRestartGroup = startRestartGroup.endRestartGroup();
                    if (endRestartGroup != null) {
                    }
                }
                i6 = i2 & 64;
                if (i6 == 0) {
                }
                function04 = function03;
                i7 = i2 & 128;
                if (i7 != 0) {
                }
                if (!startRestartGroup.shouldExecute((i3 & 4793491) != 4793490, i3 & 1)) {
                }
                endRestartGroup = startRestartGroup.endRestartGroup();
                if (endRestartGroup != null) {
                }
            }
            i5 = i2 & 32;
            if (i5 != 0) {
            }
            i6 = i2 & 64;
            if (i6 == 0) {
            }
            function04 = function03;
            i7 = i2 & 128;
            if (i7 != 0) {
            }
            if (!startRestartGroup.shouldExecute((i3 & 4793491) != 4793490, i3 & 1)) {
            }
            endRestartGroup = startRestartGroup.endRestartGroup();
            if (endRestartGroup != null) {
            }
        }
        i4 = i2 & 16;
        if (i4 == 0) {
        }
        i5 = i2 & 32;
        if (i5 != 0) {
        }
        i6 = i2 & 64;
        if (i6 == 0) {
        }
        function04 = function03;
        i7 = i2 & 128;
        if (i7 != 0) {
        }
        if (!startRestartGroup.shouldExecute((i3 & 4793491) != 4793490, i3 & 1)) {
        }
        endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
        }
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$1GdAhOPPHx5IWdnVwR8xcljdguM(int i, androidx.compose.runtime.Composer composer, int i2) {
        final int updateChangedFlags = androidx.compose.runtime.RecomposeScopeImplKt.updateChangedFlags(i | 1);
        androidx.compose.runtime.Composer startRestartGroup = composer.startRestartGroup(993882595);
        if (!startRestartGroup.shouldExecute(updateChangedFlags != 0, updateChangedFlags & 1)) {
            startRestartGroup.skipToGroupEnd();
        } else {
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventStart(993882595, updateChangedFlags, -1, "com.paypal.oslo.feature.qrc.ui.common.CancelPaymentDialogPreview (QrcCommonDialog.kt:92)");
            }
            java.lang.String stringResource = androidx.compose.ui.res.StringResources_androidKt.stringResource(com.paypal.oslo.feature.qrc.R.string.feature_qrc_cancel_payment_title, startRestartGroup, 0);
            java.lang.String stringResource2 = androidx.compose.ui.res.StringResources_androidKt.stringResource(com.paypal.oslo.feature.qrc.R.string.feature_qrc_cancel_payment_desc, startRestartGroup, 0);
            java.lang.String stringResource3 = androidx.compose.ui.res.StringResources_androidKt.stringResource(com.paypal.oslo.feature.qrc.R.string.feature_qrc_cancel_payment_button, startRestartGroup, 0);
            java.lang.String stringResource4 = androidx.compose.ui.res.StringResources_androidKt.stringResource(com.paypal.oslo.feature.qrc.R.string.feature_qrc_button_go_back, startRestartGroup, 0);
            java.lang.Object rememberedValue = startRestartGroup.rememberedValue();
            if (rememberedValue == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                rememberedValue = new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.feature.qrc.ui.common.QrcCommonDialogKt$$ExternalSyntheticLambda2
                    @Override // kotlin.jvm.functions.Function0
                    public final java.lang.Object invoke() {
                        kotlin.Unit unit;
                        unit = kotlin.Unit.INSTANCE;
                        return unit;
                    }
                };
                startRestartGroup.updateRememberedValue(rememberedValue);
            }
            QrcCommonDialog(stringResource, stringResource3, (kotlin.jvm.functions.Function0) rememberedValue, stringResource2, stringResource4, null, null, false, startRestartGroup, 384, 224);
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventEnd();
            }
        }
        androidx.compose.runtime.ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new kotlin.jvm.functions.Function2() { // from class: com.paypal.oslo.feature.qrc.ui.common.QrcCommonDialogKt$$ExternalSyntheticLambda3
                @Override // kotlin.jvm.functions.Function2
                public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                    return com.paypal.oslo.feature.qrc.ui.common.QrcCommonDialogKt.$r8$lambda$1GdAhOPPHx5IWdnVwR8xcljdguM(updateChangedFlags, (androidx.compose.runtime.Composer) obj, ((java.lang.Integer) obj2).intValue());
                }
            });
        }
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$PWMzvRvXF2DbaDVgGAInpa66Z6M(boolean z, kotlin.jvm.functions.Function0 function0, java.lang.String str, java.lang.String str2, final kotlin.jvm.functions.Function0 function02, androidx.compose.runtime.Composer composer, int i) {
        if (composer.shouldExecute((i & 3) != 2, i & 1)) {
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventStart(582084762, i, -1, "com.paypal.oslo.feature.qrc.ui.common.QrcCommonDialog.<anonymous> (QrcCommonDialog.kt:42)");
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
            boolean z2 = !z;
            com.paypal.pds.components.ButtonKt.Button(function0, str, androidx.compose.foundation.layout.SizeKt.fillMaxWidth$default(androidx.compose.ui.Modifier.INSTANCE, 0.0f, 1, null), null, null, com.paypal.pds.components.ButtonStyle.Primary.INSTANCE, null, z2, z, composer, 196992, 88);
            androidx.compose.foundation.layout.SpacerKt.Spacer(androidx.compose.foundation.layout.SizeKt.m1726height3ABfNKs(androidx.compose.ui.Modifier.INSTANCE, com.paypal.pds.core.ConstantsKt.getSpacing8()), composer, 0);
            com.paypal.pds.components.ButtonStyle.Secondary secondary = com.paypal.pds.components.ButtonStyle.Secondary.INSTANCE;
            androidx.compose.ui.Modifier fillMaxWidth$default = androidx.compose.foundation.layout.SizeKt.fillMaxWidth$default(androidx.compose.ui.Modifier.INSTANCE, 0.0f, 1, null);
            boolean changed = composer.changed(function02);
            java.lang.Object rememberedValue = composer.rememberedValue();
            if (changed || rememberedValue == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                rememberedValue = new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.feature.qrc.ui.common.QrcCommonDialogKt$$ExternalSyntheticLambda1
                    @Override // kotlin.jvm.functions.Function0
                    public final java.lang.Object invoke() {
                        return com.paypal.oslo.feature.qrc.ui.common.QrcCommonDialogKt.$r8$lambda$c3qesfTYub5XTlaiinUH4TuWVtg(kotlin.jvm.functions.Function0.this);
                    }
                };
                composer.updateRememberedValue(rememberedValue);
            }
            com.paypal.pds.components.ButtonKt.Button((kotlin.jvm.functions.Function0) rememberedValue, str2, fillMaxWidth$default, null, null, secondary, null, z2, false, composer, 196992, my.com.softspace.reader.internal.kernelconfig.EmvConstants.EMV_READER_CURRENCY_CODE_HKD);
            composer.endNode();
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventEnd();
            }
        } else {
            composer.skipToGroupEnd();
        }
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$QYu5IVk1WDPALuHaW6wemlU2lv8(java.lang.String str, java.lang.String str2, kotlin.jvm.functions.Function0 function0, java.lang.String str3, java.lang.String str4, kotlin.jvm.functions.Function0 function02, kotlin.jvm.functions.Function0 function03, boolean z, int i, int i2, androidx.compose.runtime.Composer composer, int i3) {
        QrcCommonDialog(str, str2, function0, str3, str4, function02, function03, z, composer, androidx.compose.runtime.RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$TXxH0UsxKpMbCLc37qvJLaRIl58(int i, androidx.compose.runtime.Composer composer, int i2) {
        final int updateChangedFlags = androidx.compose.runtime.RecomposeScopeImplKt.updateChangedFlags(i | 1);
        androidx.compose.runtime.Composer startRestartGroup = composer.startRestartGroup(-886263356);
        if (!startRestartGroup.shouldExecute(updateChangedFlags != 0, updateChangedFlags & 1)) {
            startRestartGroup.skipToGroupEnd();
        } else {
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventStart(-886263356, updateChangedFlags, -1, "com.paypal.oslo.feature.qrc.ui.common.PayingInSellerCurrencyDialogPreview (QrcCommonDialog.kt:123)");
            }
            java.lang.String stringResource = androidx.compose.ui.res.StringResources_androidKt.stringResource(com.paypal.oslo.feature.qrc.R.string.feature_qrc_cancel_payment_title_cancel_paying_in_seller_currency_dialog, startRestartGroup, 0);
            java.lang.String stringResource2 = androidx.compose.ui.res.StringResources_androidKt.stringResource(com.paypal.oslo.feature.qrc.R.string.feature_qrc_cancel_payment_desc_cancel_paying_in_seller_currency_dialog, startRestartGroup, 0);
            java.lang.String stringResource3 = androidx.compose.ui.res.StringResources_androidKt.stringResource(com.paypal.oslo.feature.qrc.R.string.feature_qrc_button_pay_now, startRestartGroup, 0);
            java.lang.String stringResource4 = androidx.compose.ui.res.StringResources_androidKt.stringResource(com.paypal.oslo.feature.qrc.R.string.feature_qrc_button_cancel, startRestartGroup, 0);
            java.lang.Object rememberedValue = startRestartGroup.rememberedValue();
            if (rememberedValue == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                rememberedValue = new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.feature.qrc.ui.common.QrcCommonDialogKt$$ExternalSyntheticLambda11
                    @Override // kotlin.jvm.functions.Function0
                    public final java.lang.Object invoke() {
                        kotlin.Unit unit;
                        unit = kotlin.Unit.INSTANCE;
                        return unit;
                    }
                };
                startRestartGroup.updateRememberedValue(rememberedValue);
            }
            QrcCommonDialog(stringResource, stringResource3, (kotlin.jvm.functions.Function0) rememberedValue, stringResource2, stringResource4, null, null, false, startRestartGroup, 384, 224);
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventEnd();
            }
        }
        androidx.compose.runtime.ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new kotlin.jvm.functions.Function2() { // from class: com.paypal.oslo.feature.qrc.ui.common.QrcCommonDialogKt$$ExternalSyntheticLambda12
                @Override // kotlin.jvm.functions.Function2
                public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                    return com.paypal.oslo.feature.qrc.ui.common.QrcCommonDialogKt.$r8$lambda$TXxH0UsxKpMbCLc37qvJLaRIl58(updateChangedFlags, (androidx.compose.runtime.Composer) obj, ((java.lang.Integer) obj2).intValue());
                }
            });
        }
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$c3qesfTYub5XTlaiinUH4TuWVtg(kotlin.jvm.functions.Function0 function0) {
        if (function0 != null) {
            function0.invoke();
        }
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$grIaBuxmsrnuoi6xhkvzXQ3XeGw(int i, androidx.compose.runtime.Composer composer, int i2) {
        final int updateChangedFlags = androidx.compose.runtime.RecomposeScopeImplKt.updateChangedFlags(i | 1);
        androidx.compose.runtime.Composer startRestartGroup = composer.startRestartGroup(785815507);
        if (!startRestartGroup.shouldExecute(updateChangedFlags != 0, updateChangedFlags & 1)) {
            startRestartGroup.skipToGroupEnd();
        } else {
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventStart(785815507, updateChangedFlags, -1, "com.paypal.oslo.feature.qrc.ui.common.CancelPaymentDialogLoadingPreview (QrcCommonDialog.kt:107)");
            }
            java.lang.String stringResource = androidx.compose.ui.res.StringResources_androidKt.stringResource(com.paypal.oslo.feature.qrc.R.string.feature_qrc_cancel_payment_title, startRestartGroup, 0);
            java.lang.String stringResource2 = androidx.compose.ui.res.StringResources_androidKt.stringResource(com.paypal.oslo.feature.qrc.R.string.feature_qrc_cancel_payment_desc, startRestartGroup, 0);
            java.lang.String stringResource3 = androidx.compose.ui.res.StringResources_androidKt.stringResource(com.paypal.oslo.feature.qrc.R.string.feature_qrc_cancel_payment_button, startRestartGroup, 0);
            java.lang.String stringResource4 = androidx.compose.ui.res.StringResources_androidKt.stringResource(com.paypal.oslo.feature.qrc.R.string.feature_qrc_button_go_back, startRestartGroup, 0);
            java.lang.Object rememberedValue = startRestartGroup.rememberedValue();
            if (rememberedValue == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                rememberedValue = new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.feature.qrc.ui.common.QrcCommonDialogKt$$ExternalSyntheticLambda0
                    @Override // kotlin.jvm.functions.Function0
                    public final java.lang.Object invoke() {
                        kotlin.Unit unit;
                        unit = kotlin.Unit.INSTANCE;
                        return unit;
                    }
                };
                startRestartGroup.updateRememberedValue(rememberedValue);
            }
            QrcCommonDialog(stringResource, stringResource3, (kotlin.jvm.functions.Function0) rememberedValue, stringResource2, stringResource4, null, null, true, startRestartGroup, 12583296, 96);
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventEnd();
            }
        }
        androidx.compose.runtime.ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new kotlin.jvm.functions.Function2() { // from class: com.paypal.oslo.feature.qrc.ui.common.QrcCommonDialogKt$$ExternalSyntheticLambda4
                @Override // kotlin.jvm.functions.Function2
                public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                    return com.paypal.oslo.feature.qrc.ui.common.QrcCommonDialogKt.$r8$lambda$grIaBuxmsrnuoi6xhkvzXQ3XeGw(updateChangedFlags, (androidx.compose.runtime.Composer) obj, ((java.lang.Integer) obj2).intValue());
                }
            });
        }
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$kRHENVmfP0KKhRPA1S_mERxjVHY(boolean z, kotlin.jvm.functions.Function0 function0, java.lang.String str, androidx.compose.runtime.Composer composer, int i) {
        if (composer.shouldExecute((i & 3) != 2, i & 1)) {
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventStart(1656577265, i, -1, "com.paypal.oslo.feature.qrc.ui.common.QrcCommonDialog.<anonymous> (QrcCommonDialog.kt:65)");
            }
            com.paypal.pds.components.ButtonKt.Button(function0, str, androidx.compose.foundation.layout.SizeKt.fillMaxWidth$default(androidx.compose.ui.Modifier.INSTANCE, 0.0f, 1, null), null, null, com.paypal.pds.components.ButtonStyle.Primary.INSTANCE, null, !z, z, composer, 196992, 88);
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventEnd();
            }
        } else {
            composer.skipToGroupEnd();
        }
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$n7482XOhIcGTxqBUKVdaRO0HBY4(kotlin.jvm.functions.Function2 function2, androidx.compose.runtime.Composer composer, int i) {
        if (composer.shouldExecute((i & 3) != 2, i & 1)) {
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventStart(-1390152218, i, -1, "com.paypal.oslo.feature.qrc.ui.common.QrcCommonDialog.<anonymous> (QrcCommonDialog.kt:79)");
            }
            function2.invoke(composer, 0);
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventEnd();
            }
        } else {
            composer.skipToGroupEnd();
        }
        return kotlin.Unit.INSTANCE;
    }
}
