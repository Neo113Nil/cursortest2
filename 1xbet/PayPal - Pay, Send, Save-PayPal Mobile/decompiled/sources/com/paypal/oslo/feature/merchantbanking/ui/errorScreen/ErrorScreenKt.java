package com.paypal.oslo.feature.merchantbanking.ui.errorScreen;

@kotlin.Metadata(d1 = {"\u0000 \n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\u000b\u001a-\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00010\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u0007H\u0007¢\u0006\u0002\u0010\b\u001a-\u0010\t\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00072\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00010\u0005H\u0007¢\u0006\u0002\u0010\n\u001a,\u0010\u000b\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00010\u00052\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00010\u0005H\u0000¨\u0006\r²\u0006\n\u0010\u000e\u001a\u00020\u000fX\u008a\u008e\u0002"}, d2 = {"ErrorScreen", "", "errorScreenType", "Lcom/paypal/oslo/feature/merchantbanking/ui/errorScreen/ErrorScreenTypeEnum;", "onButtonClick", "Lkotlin/Function0;", "sourceScreen", "", "(Lcom/paypal/oslo/feature/merchantbanking/ui/errorScreen/ErrorScreenTypeEnum;Lkotlin/jvm/functions/Function0;Ljava/lang/String;Landroidx/compose/runtime/Composer;II)V", "ErrorScreenContent", "(Lcom/paypal/oslo/feature/merchantbanking/ui/errorScreen/ErrorScreenTypeEnum;Ljava/lang/String;Lkotlin/jvm/functions/Function0;Landroidx/compose/runtime/Composer;II)V", "handleRetryButtonClick", "setLoading", "merchant-banking_prodRelease", "isButtonLoading", ""}, k = 2, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class ErrorScreenKt {
    public static final void ErrorScreen(final com.paypal.oslo.feature.merchantbanking.ui.errorScreen.ErrorScreenTypeEnum errorScreenTypeEnum, final kotlin.jvm.functions.Function0<kotlin.Unit> function0, java.lang.String str, androidx.compose.runtime.Composer composer, final int i, final int i2) {
        int i3;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(errorScreenTypeEnum, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(function0, "");
        androidx.compose.runtime.Composer startRestartGroup = composer.startRestartGroup(-1831343001);
        if ((i & 6) == 0) {
            i3 = (startRestartGroup.changed(errorScreenTypeEnum.ordinal()) ? 4 : 2) | i;
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
            i3 |= startRestartGroup.changed(str) ? 256 : 128;
        }
        if (!startRestartGroup.shouldExecute((i3 & 147) != 146, i3 & 1)) {
            startRestartGroup.skipToGroupEnd();
        } else {
            if (i4 != 0) {
                str = "unknown";
            }
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventStart(-1831343001, i3, -1, "com.paypal.oslo.feature.merchantbanking.ui.errorScreen.ErrorScreen (ErrorScreen.kt:49)");
            }
            ErrorScreenContent(errorScreenTypeEnum, str, function0, startRestartGroup, (i3 & 14) | ((i3 >> 3) & 112) | ((i3 << 3) & 896), 0);
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventEnd();
            }
        }
        final java.lang.String str2 = str;
        androidx.compose.runtime.ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new kotlin.jvm.functions.Function2() { // from class: com.paypal.oslo.feature.merchantbanking.ui.errorScreen.ErrorScreenKt$$ExternalSyntheticLambda3
                @Override // kotlin.jvm.functions.Function2
                public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                    return com.paypal.oslo.feature.merchantbanking.ui.errorScreen.ErrorScreenKt.m15596$r8$lambda$kVC_T8iRApA_edS2r_Ex8o_xxk(com.paypal.oslo.feature.merchantbanking.ui.errorScreen.ErrorScreenTypeEnum.this, function0, str2, i, i2, (androidx.compose.runtime.Composer) obj, ((java.lang.Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:13:0x0051  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0066  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0071  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x02b6  */
    /* JADX WARN: Removed duplicated region for block: B:65:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:73:0x02ab  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x0068  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void ErrorScreenContent(final com.paypal.oslo.feature.merchantbanking.ui.errorScreen.ErrorScreenTypeEnum errorScreenTypeEnum, java.lang.String str, final kotlin.jvm.functions.Function0<kotlin.Unit> function0, androidx.compose.runtime.Composer composer, final int i, final int i2) {
        int i3;
        java.lang.String str2;
        int i4;
        java.lang.String str3;
        androidx.compose.runtime.ScopeUpdateScope endRestartGroup;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(errorScreenTypeEnum, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(function0, "");
        androidx.compose.runtime.Composer startRestartGroup = composer.startRestartGroup(-1913651182);
        if ((i & 6) == 0) {
            i3 = (startRestartGroup.changed(errorScreenTypeEnum.ordinal()) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        int i5 = i2 & 2;
        if (i5 != 0) {
            i3 |= 48;
        } else if ((i & 48) == 0) {
            str2 = str;
            i3 |= startRestartGroup.changed(str2) ? 32 : 16;
            if ((i & 384) == 0) {
                i3 |= startRestartGroup.changedInstance(function0) ? 256 : 128;
            }
            i4 = i3;
            if (startRestartGroup.shouldExecute((i4 & 147) == 146, i4 & 1)) {
                startRestartGroup.skipToGroupEnd();
                str3 = str2;
            } else {
                java.lang.String str4 = i5 != 0 ? "unknown" : str2;
                if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                    androidx.compose.runtime.ComposerKt.traceEventStart(-1913651182, i4, -1, "com.paypal.oslo.feature.merchantbanking.ui.errorScreen.ErrorScreenContent (ErrorScreen.kt:62)");
                }
                int i6 = i4 & 14;
                boolean z = i6 == 4;
                boolean z2 = (i4 & 112) == 32;
                com.paypal.oslo.feature.merchantbanking.ui.errorScreen.ErrorScreenKt$ErrorScreenContent$1$1 rememberedValue = startRestartGroup.rememberedValue();
                if ((z | z2) || rememberedValue == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                    rememberedValue = new com.paypal.oslo.feature.merchantbanking.ui.errorScreen.ErrorScreenKt$ErrorScreenContent$1$1(errorScreenTypeEnum, str4, null);
                    startRestartGroup.updateRememberedValue(rememberedValue);
                }
                androidx.compose.runtime.EffectsKt.LaunchedEffect(errorScreenTypeEnum, (kotlin.jvm.functions.Function2<? super kotlinx.coroutines.CoroutineScope, ? super kotlin.coroutines.Continuation<? super kotlin.Unit>, ? extends java.lang.Object>) rememberedValue, startRestartGroup, i6);
                java.lang.String stringResource = androidx.compose.ui.res.StringResources_androidKt.stringResource(errorScreenTypeEnum.getHeaderTextResId(), startRestartGroup, 0);
                java.lang.String stringResource2 = androidx.compose.ui.res.StringResources_androidKt.stringResource(errorScreenTypeEnum.getButtonTextResId(), startRestartGroup, 0);
                java.lang.String stringResource3 = androidx.compose.ui.res.StringResources_androidKt.stringResource(errorScreenTypeEnum.getBodyTextResId(), startRestartGroup, 0);
                com.paypal.pds.components.AvatarSource iconAvatarSource = errorScreenTypeEnum.getIconAvatarSource();
                java.lang.Object rememberedValue2 = startRestartGroup.rememberedValue();
                if (rememberedValue2 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                    rememberedValue2 = androidx.compose.runtime.SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(java.lang.Boolean.FALSE, null, 2, null);
                    startRestartGroup.updateRememberedValue(rememberedValue2);
                }
                final androidx.compose.runtime.MutableState mutableState = (androidx.compose.runtime.MutableState) rememberedValue2;
                androidx.compose.ui.Modifier m1708paddingVpY3zN4$default = androidx.compose.foundation.layout.PaddingKt.m1708paddingVpY3zN4$default(androidx.compose.foundation.layout.SizeKt.fillMaxSize$default(androidx.compose.ui.Modifier.INSTANCE, 0.0f, 1, null), com.paypal.pds.core.ConstantsKt.getSpacing16(), 0.0f, 2, null);
                androidx.compose.ui.layout.MeasurePolicy columnMeasurePolicy = androidx.compose.foundation.layout.ColumnKt.columnMeasurePolicy(androidx.compose.foundation.layout.Arrangement.INSTANCE.getCenter(), androidx.compose.ui.Alignment.INSTANCE.getCenterHorizontally(), startRestartGroup, 54);
                int hashCode = java.lang.Long.hashCode(androidx.compose.runtime.ComposablesKt.getCurrentCompositeKeyHashCode(startRestartGroup, 0));
                androidx.compose.runtime.CompositionLocalMap currentCompositionLocalMap = startRestartGroup.getCurrentCompositionLocalMap();
                androidx.compose.ui.Modifier materializeModifier = androidx.compose.ui.ComposedModifierKt.materializeModifier(startRestartGroup, m1708paddingVpY3zN4$default);
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
                str3 = str4;
                com.paypal.pds.components.AvatarKt.Avatar(iconAvatarSource, null, com.paypal.pds.components.AvatarSize.XLarge.INSTANCE, null, null, null, startRestartGroup, com.paypal.pds.components.AvatarSize.XLarge.$stable << 6, 58);
                com.paypal.pds.components.LabelKt.m21914LabelPL_sNV4(stringResource, androidx.compose.foundation.layout.PaddingKt.m1710paddingqDBjuR0$default(androidx.compose.ui.Modifier.INSTANCE, 0.0f, com.paypal.pds.core.ConstantsKt.getSpacing16(), 0.0f, 0.0f, 13, null), null, null, androidx.compose.ui.text.style.TextAlign.m8436boximpl(androidx.compose.ui.text.style.TextAlign.INSTANCE.m8443getCentere0LSkKk()), null, false, 0, 0, null, com.paypal.pds.core.Typography.HeadingSmall.INSTANCE, startRestartGroup, 0, 6, 1004);
                com.paypal.pds.components.LabelKt.m21914LabelPL_sNV4(stringResource3, androidx.compose.foundation.layout.PaddingKt.m1708paddingVpY3zN4$default(androidx.compose.ui.Modifier.INSTANCE, com.paypal.pds.core.ConstantsKt.getSpacing16(), 0.0f, 2, null), com.paypal.pds.core.Color.ContentMuted.INSTANCE, null, androidx.compose.ui.text.style.TextAlign.m8436boximpl(androidx.compose.ui.text.style.TextAlign.INSTANCE.m8443getCentere0LSkKk()), null, false, 0, 0, null, com.paypal.pds.core.Typography.BodyLarge.INSTANCE, startRestartGroup, 384, 6, 1000);
                com.paypal.pds.components.ButtonStyle.Secondary secondary = com.paypal.pds.components.ButtonStyle.Secondary.INSTANCE;
                boolean booleanValue = ((java.lang.Boolean) mutableState.getValue()).booleanValue();
                androidx.compose.ui.Modifier item = com.paypal.oslo.core.telemetry.compose.ModifierExtensionsKt.item(androidx.compose.foundation.layout.PaddingKt.m1710paddingqDBjuR0$default(androidx.compose.ui.Modifier.INSTANCE, 0.0f, com.paypal.pds.core.ConstantsKt.getSpacing16(), 0.0f, 0.0f, 13, null), new com.paypal.oslo.core.telemetry.analytics.schema.context.UIContext.Item(com.paypal.oslo.feature.merchantbanking.api.analytics.MerchantBankingAnalytics.ErrorScreen.RETRY_BUTTON, 0, 2, null));
                boolean z3 = i6 == 4;
                boolean z4 = (i4 & 896) == 256;
                java.lang.Object rememberedValue3 = startRestartGroup.rememberedValue();
                if ((z3 | z4) || rememberedValue3 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                    rememberedValue3 = new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.feature.merchantbanking.ui.errorScreen.ErrorScreenKt$$ExternalSyntheticLambda1
                        @Override // kotlin.jvm.functions.Function0
                        public final java.lang.Object invoke() {
                            return com.paypal.oslo.feature.merchantbanking.ui.errorScreen.ErrorScreenKt.$r8$lambda$hmoCtDpyfeKCH5ZCDgjG3sK3NTk(com.paypal.oslo.feature.merchantbanking.ui.errorScreen.ErrorScreenTypeEnum.this, function0, mutableState);
                        }
                    };
                    startRestartGroup.updateRememberedValue(rememberedValue3);
                }
                com.paypal.pds.components.ButtonKt.Button((kotlin.jvm.functions.Function0) rememberedValue3, stringResource2, item, null, null, secondary, null, false, booleanValue, startRestartGroup, androidx.profileinstaller.ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE, com.plaid.internal.EnumC0527g.SDK_ASSET_ICON_PRODUCT_MONITOR_VALUE);
                startRestartGroup.endNode();
                if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                    androidx.compose.runtime.ComposerKt.traceEventEnd();
                }
            }
            endRestartGroup = startRestartGroup.endRestartGroup();
            if (endRestartGroup == null) {
                final java.lang.String str5 = str3;
                endRestartGroup.updateScope(new kotlin.jvm.functions.Function2() { // from class: com.paypal.oslo.feature.merchantbanking.ui.errorScreen.ErrorScreenKt$$ExternalSyntheticLambda2
                    @Override // kotlin.jvm.functions.Function2
                    public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                        return com.paypal.oslo.feature.merchantbanking.ui.errorScreen.ErrorScreenKt.m15595$r8$lambda$fZjQArfE0Nri0TAYfZoiT0MDOU(com.paypal.oslo.feature.merchantbanking.ui.errorScreen.ErrorScreenTypeEnum.this, str5, function0, i, i2, (androidx.compose.runtime.Composer) obj, ((java.lang.Integer) obj2).intValue());
                    }
                });
                return;
            }
            return;
        }
        str2 = str;
        if ((i & 384) == 0) {
        }
        i4 = i3;
        if (startRestartGroup.shouldExecute((i4 & 147) == 146, i4 & 1)) {
        }
        endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup == null) {
        }
    }

    public static final void handleRetryButtonClick(com.paypal.oslo.feature.merchantbanking.ui.errorScreen.ErrorScreenTypeEnum errorScreenTypeEnum, kotlin.jvm.functions.Function0<kotlin.Unit> function0, kotlin.jvm.functions.Function0<kotlin.Unit> function02) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(errorScreenTypeEnum, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(function0, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(function02, "");
        if (errorScreenTypeEnum != com.paypal.oslo.feature.merchantbanking.ui.errorScreen.ErrorScreenTypeEnum.RISK_DECLINED) {
            function02.invoke();
        }
        function0.invoke();
    }

    /* renamed from: $r8$lambda$4ddUv-51B2Mm3mUmg6h6vxyrZXE, reason: not valid java name */
    public static /* synthetic */ kotlin.Unit m15594$r8$lambda$4ddUv51B2Mm3mUmg6h6vxyrZXE(androidx.compose.runtime.MutableState mutableState) {
        mutableState.setValue(java.lang.Boolean.TRUE);
        return kotlin.Unit.INSTANCE;
    }

    /* renamed from: $r8$lambda$fZjQArfE0Nri0TAYfZoiT0MD-OU, reason: not valid java name */
    public static /* synthetic */ kotlin.Unit m15595$r8$lambda$fZjQArfE0Nri0TAYfZoiT0MDOU(com.paypal.oslo.feature.merchantbanking.ui.errorScreen.ErrorScreenTypeEnum errorScreenTypeEnum, java.lang.String str, kotlin.jvm.functions.Function0 function0, int i, int i2, androidx.compose.runtime.Composer composer, int i3) {
        ErrorScreenContent(errorScreenTypeEnum, str, function0, composer, androidx.compose.runtime.RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$hmoCtDpyfeKCH5ZCDgjG3sK3NTk(com.paypal.oslo.feature.merchantbanking.ui.errorScreen.ErrorScreenTypeEnum errorScreenTypeEnum, kotlin.jvm.functions.Function0 function0, final androidx.compose.runtime.MutableState mutableState) {
        handleRetryButtonClick(errorScreenTypeEnum, function0, new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.feature.merchantbanking.ui.errorScreen.ErrorScreenKt$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return com.paypal.oslo.feature.merchantbanking.ui.errorScreen.ErrorScreenKt.m15594$r8$lambda$4ddUv51B2Mm3mUmg6h6vxyrZXE(androidx.compose.runtime.MutableState.this);
            }
        });
        return kotlin.Unit.INSTANCE;
    }

    /* renamed from: $r8$lambda$kVC_T8iRApA_edS2r_E-x8o_xxk, reason: not valid java name */
    public static /* synthetic */ kotlin.Unit m15596$r8$lambda$kVC_T8iRApA_edS2r_Ex8o_xxk(com.paypal.oslo.feature.merchantbanking.ui.errorScreen.ErrorScreenTypeEnum errorScreenTypeEnum, kotlin.jvm.functions.Function0 function0, java.lang.String str, int i, int i2, androidx.compose.runtime.Composer composer, int i3) {
        ErrorScreen(errorScreenTypeEnum, function0, str, composer, androidx.compose.runtime.RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
        return kotlin.Unit.INSTANCE;
    }
}
