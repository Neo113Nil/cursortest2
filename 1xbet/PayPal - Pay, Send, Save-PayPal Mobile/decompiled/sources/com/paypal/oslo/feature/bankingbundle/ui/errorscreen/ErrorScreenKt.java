package com.paypal.oslo.feature.bankingbundle.ui.errorscreen;

@kotlin.Metadata(d1 = {"\u0000(\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\b\u001aC\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00010\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\t2\b\b\u0002\u0010\n\u001a\u00020\u000bH\u0001¢\u0006\u0002\u0010\f\u001a+\u0010\r\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u00072\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00010\u0005H\u0003¢\u0006\u0002\u0010\u000e\u001a\r\u0010\u000f\u001a\u00020\u0001H\u0003¢\u0006\u0002\u0010\u0010\u001a\r\u0010\u0011\u001a\u00020\u0001H\u0003¢\u0006\u0002\u0010\u0010\u001a\r\u0010\u0012\u001a\u00020\u0001H\u0003¢\u0006\u0002\u0010\u0010¨\u0006\u0013"}, d2 = {"ErrorScreen", "", "errorScreenType", "Lcom/paypal/oslo/feature/bankingbundle/ui/errorscreen/ErrorScreenTypeEnum;", "onButtonClick", "Lkotlin/Function0;", "isLoading", "", "errorDetail", "Lcom/paypal/oslo/feature/bankingbundle/domain/error/ErrorDetail;", "sourceScreen", "", "(Lcom/paypal/oslo/feature/bankingbundle/ui/errorscreen/ErrorScreenTypeEnum;Lkotlin/jvm/functions/Function0;ZLcom/paypal/oslo/feature/bankingbundle/domain/error/ErrorDetail;Ljava/lang/String;Landroidx/compose/runtime/Composer;II)V", "ErrorScreenContent", "(Lcom/paypal/oslo/feature/bankingbundle/ui/errorscreen/ErrorScreenTypeEnum;ZLkotlin/jvm/functions/Function0;Landroidx/compose/runtime/Composer;I)V", "ErrorScreenGenericErrorPreview", "(Landroidx/compose/runtime/Composer;I)V", "ErrorScreenIneligiblePreview", "ErrorScreenLoadingPreview", "banking-bundle_prodRelease"}, k = 2, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class ErrorScreenKt {
    /* JADX WARN: Removed duplicated region for block: B:20:0x005f  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x007d  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x009f  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x00ac  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x0137  */
    /* JADX WARN: Removed duplicated region for block: B:63:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:68:0x012b  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x00a2  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x0080  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x0062  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void ErrorScreen(final com.paypal.oslo.feature.bankingbundle.ui.errorscreen.ErrorScreenTypeEnum errorScreenTypeEnum, final kotlin.jvm.functions.Function0<kotlin.Unit> function0, boolean z, com.paypal.oslo.feature.bankingbundle.domain.error.ErrorDetail errorDetail, java.lang.String str, androidx.compose.runtime.Composer composer, final int i, final int i2) {
        int i3;
        boolean z2;
        int i4;
        com.paypal.oslo.feature.bankingbundle.domain.error.ErrorDetail errorDetail2;
        int i5;
        java.lang.String str2;
        int i6;
        final boolean z3;
        androidx.compose.runtime.ScopeUpdateScope endRestartGroup;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(errorScreenTypeEnum, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(function0, "");
        androidx.compose.runtime.Composer startRestartGroup = composer.startRestartGroup(1426145492);
        if ((i & 6) == 0) {
            i3 = (startRestartGroup.changed(errorScreenTypeEnum.ordinal()) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i & 48) == 0) {
            i3 |= startRestartGroup.changedInstance(function0) ? 32 : 16;
        }
        int i7 = i2 & 4;
        if (i7 != 0) {
            i3 |= 384;
        } else if ((i & 384) == 0) {
            z2 = z;
            i3 |= startRestartGroup.changed(z2) ? 256 : 128;
            i4 = i2 & 8;
            if (i4 == 0) {
                i3 |= 3072;
            } else if ((i & 3072) == 0) {
                errorDetail2 = errorDetail;
                i3 |= startRestartGroup.changed(errorDetail2) ? 2048 : 1024;
                i5 = i2 & 16;
                if (i5 != 0) {
                    i3 |= 24576;
                } else if ((i & 24576) == 0) {
                    str2 = str;
                    i3 |= startRestartGroup.changed(str2) ? 16384 : 8192;
                    i6 = i3;
                    if (startRestartGroup.shouldExecute((i6 & 9363) == 9362, i6 & 1)) {
                        startRestartGroup.skipToGroupEnd();
                        z3 = z2;
                    } else {
                        boolean z4 = i7 != 0 ? false : z2;
                        if (i4 != 0) {
                            errorDetail2 = null;
                        }
                        if (i5 != 0) {
                            str2 = "unknown";
                        }
                        if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                            androidx.compose.runtime.ComposerKt.traceEventStart(1426145492, i6, -1, "com.paypal.oslo.feature.bankingbundle.ui.errorscreen.ErrorScreen (ErrorScreen.kt:59)");
                        }
                        int i8 = i6 & 14;
                        boolean z5 = i8 == 4;
                        boolean z6 = (57344 & i6) == 16384;
                        boolean z7 = (i6 & 7168) == 2048;
                        com.paypal.oslo.feature.bankingbundle.ui.errorscreen.ErrorScreenKt$ErrorScreen$1$1 rememberedValue = startRestartGroup.rememberedValue();
                        if ((z5 | z6 | z7) || rememberedValue == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                            rememberedValue = new com.paypal.oslo.feature.bankingbundle.ui.errorscreen.ErrorScreenKt$ErrorScreen$1$1(errorScreenTypeEnum, str2, errorDetail2, null);
                            startRestartGroup.updateRememberedValue(rememberedValue);
                        }
                        int i9 = i6 >> 6;
                        androidx.compose.runtime.EffectsKt.LaunchedEffect(errorScreenTypeEnum, errorDetail2, str2, (kotlin.jvm.functions.Function2) rememberedValue, startRestartGroup, (i9 & 112) | i8 | (i9 & 896));
                        getHighSpeedVideoFpsRangesFor(errorScreenTypeEnum, z4, function0, startRestartGroup, ((i6 >> 3) & 112) | i8 | ((i6 << 3) & 896));
                        if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                            androidx.compose.runtime.ComposerKt.traceEventEnd();
                        }
                        z3 = z4;
                    }
                    final com.paypal.oslo.feature.bankingbundle.domain.error.ErrorDetail errorDetail3 = errorDetail2;
                    final java.lang.String str3 = str2;
                    endRestartGroup = startRestartGroup.endRestartGroup();
                    if (endRestartGroup == null) {
                        endRestartGroup.updateScope(new kotlin.jvm.functions.Function2() { // from class: com.paypal.oslo.feature.bankingbundle.ui.errorscreen.ErrorScreenKt$$ExternalSyntheticLambda0
                            @Override // kotlin.jvm.functions.Function2
                            public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                                return com.paypal.oslo.feature.bankingbundle.ui.errorscreen.ErrorScreenKt.$r8$lambda$IlFk5tniGdCfw63qkkI8TYMVbWc(com.paypal.oslo.feature.bankingbundle.ui.errorscreen.ErrorScreenTypeEnum.this, function0, z3, errorDetail3, str3, i, i2, (androidx.compose.runtime.Composer) obj, ((java.lang.Integer) obj2).intValue());
                            }
                        });
                        return;
                    }
                    return;
                }
                str2 = str;
                i6 = i3;
                if (startRestartGroup.shouldExecute((i6 & 9363) == 9362, i6 & 1)) {
                }
                final com.paypal.oslo.feature.bankingbundle.domain.error.ErrorDetail errorDetail32 = errorDetail2;
                final java.lang.String str32 = str2;
                endRestartGroup = startRestartGroup.endRestartGroup();
                if (endRestartGroup == null) {
                }
            }
            errorDetail2 = errorDetail;
            i5 = i2 & 16;
            if (i5 != 0) {
            }
            str2 = str;
            i6 = i3;
            if (startRestartGroup.shouldExecute((i6 & 9363) == 9362, i6 & 1)) {
            }
            final com.paypal.oslo.feature.bankingbundle.domain.error.ErrorDetail errorDetail322 = errorDetail2;
            final java.lang.String str322 = str2;
            endRestartGroup = startRestartGroup.endRestartGroup();
            if (endRestartGroup == null) {
            }
        }
        z2 = z;
        i4 = i2 & 8;
        if (i4 == 0) {
        }
        errorDetail2 = errorDetail;
        i5 = i2 & 16;
        if (i5 != 0) {
        }
        str2 = str;
        i6 = i3;
        if (startRestartGroup.shouldExecute((i6 & 9363) == 9362, i6 & 1)) {
        }
        final com.paypal.oslo.feature.bankingbundle.domain.error.ErrorDetail errorDetail3222 = errorDetail2;
        final java.lang.String str3222 = str2;
        endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup == null) {
        }
    }

    private static final void getHighSpeedVideoFpsRangesFor(final com.paypal.oslo.feature.bankingbundle.ui.errorscreen.ErrorScreenTypeEnum errorScreenTypeEnum, final boolean z, final kotlin.jvm.functions.Function0<kotlin.Unit> function0, androidx.compose.runtime.Composer composer, final int i) {
        int i2;
        androidx.compose.runtime.Composer composer2;
        androidx.compose.runtime.Composer startRestartGroup = composer.startRestartGroup(567530715);
        if ((i & 6) == 0) {
            i2 = (startRestartGroup.changed(errorScreenTypeEnum.ordinal()) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= startRestartGroup.changed(z) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= startRestartGroup.changedInstance(function0) ? 256 : 128;
        }
        int i3 = i2;
        if (!startRestartGroup.shouldExecute((i3 & 147) != 146, i3 & 1)) {
            composer2 = startRestartGroup;
            composer2.skipToGroupEnd();
        } else {
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventStart(567530715, i3, -1, "com.paypal.oslo.feature.bankingbundle.ui.errorscreen.ErrorScreenContent (ErrorScreen.kt:98)");
            }
            java.lang.String stringResource = androidx.compose.ui.res.StringResources_androidKt.stringResource(errorScreenTypeEnum.getHeaderTextResId(), startRestartGroup, 0);
            java.lang.String stringResource2 = androidx.compose.ui.res.StringResources_androidKt.stringResource(errorScreenTypeEnum.getButtonTextResId(), startRestartGroup, 0);
            java.lang.String stringResource3 = androidx.compose.ui.res.StringResources_androidKt.stringResource(errorScreenTypeEnum.getBodyTextResId(), startRestartGroup, 0);
            com.paypal.pds.components.AvatarSource iconAvatarSource = errorScreenTypeEnum.getIconAvatarSource();
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
            com.paypal.pds.components.AvatarKt.Avatar(iconAvatarSource, null, com.paypal.pds.components.AvatarSize.XLarge.INSTANCE, null, null, null, startRestartGroup, com.paypal.pds.components.AvatarSize.XLarge.$stable << 6, 58);
            com.paypal.pds.components.LabelKt.m21914LabelPL_sNV4(stringResource, androidx.compose.foundation.layout.PaddingKt.m1710paddingqDBjuR0$default(androidx.compose.ui.Modifier.INSTANCE, 0.0f, com.paypal.pds.core.ConstantsKt.getSpacing16(), 0.0f, 0.0f, 13, null), null, null, androidx.compose.ui.text.style.TextAlign.m8436boximpl(androidx.compose.ui.text.style.TextAlign.INSTANCE.m8443getCentere0LSkKk()), null, false, 0, 0, null, com.paypal.pds.core.Typography.HeadingSmall.INSTANCE, startRestartGroup, 0, 6, 1004);
            com.paypal.pds.components.LabelKt.m21914LabelPL_sNV4(stringResource3, androidx.compose.foundation.layout.PaddingKt.m1708paddingVpY3zN4$default(androidx.compose.ui.Modifier.INSTANCE, com.paypal.pds.core.ConstantsKt.getSpacing16(), 0.0f, 2, null), com.paypal.pds.core.Color.ContentMuted.INSTANCE, null, androidx.compose.ui.text.style.TextAlign.m8436boximpl(androidx.compose.ui.text.style.TextAlign.INSTANCE.m8443getCentere0LSkKk()), null, false, 0, 0, null, com.paypal.pds.core.Typography.BodyLarge.INSTANCE, startRestartGroup, 384, 6, 1000);
            composer2 = startRestartGroup;
            com.paypal.pds.components.ButtonKt.Button(function0, stringResource2, com.paypal.oslo.core.telemetry.compose.ModifierExtensionsKt.item(androidx.compose.foundation.layout.PaddingKt.m1710paddingqDBjuR0$default(androidx.compose.ui.Modifier.INSTANCE, 0.0f, com.paypal.pds.core.ConstantsKt.getSpacing16(), 0.0f, 0.0f, 13, null), com.paypal.oslo.feature.bankingbundle.api.analytics.BankingBundleAnalytics.ErrorScreen.INSTANCE.getOK_BUTTON()), null, null, com.paypal.pds.components.ButtonStyle.Secondary.INSTANCE, null, false, z, startRestartGroup, ((i3 >> 6) & 14) | androidx.profileinstaller.ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE | ((i3 << 21) & 234881024), com.plaid.internal.EnumC0527g.SDK_ASSET_ICON_PRODUCT_MONITOR_VALUE);
            composer2.endNode();
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventEnd();
            }
        }
        androidx.compose.runtime.ScopeUpdateScope endRestartGroup = composer2.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new kotlin.jvm.functions.Function2() { // from class: com.paypal.oslo.feature.bankingbundle.ui.errorscreen.ErrorScreenKt$$ExternalSyntheticLambda7
                @Override // kotlin.jvm.functions.Function2
                public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                    return com.paypal.oslo.feature.bankingbundle.ui.errorscreen.ErrorScreenKt.$r8$lambda$SdQuqJOcqjf70luKllGTdDx1kko(com.paypal.oslo.feature.bankingbundle.ui.errorscreen.ErrorScreenTypeEnum.this, z, function0, i, (androidx.compose.runtime.Composer) obj, ((java.lang.Integer) obj2).intValue());
                }
            });
        }
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$3BYhqYJOGNsYgeA0CylD8MlMhYI(int i, androidx.compose.runtime.Composer composer, int i2) {
        final int updateChangedFlags = androidx.compose.runtime.RecomposeScopeImplKt.updateChangedFlags(i | 1);
        androidx.compose.runtime.Composer startRestartGroup = composer.startRestartGroup(-11413072);
        if (!startRestartGroup.shouldExecute(updateChangedFlags != 0, updateChangedFlags & 1)) {
            startRestartGroup.skipToGroupEnd();
        } else {
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventStart(-11413072, updateChangedFlags, -1, "com.paypal.oslo.feature.bankingbundle.ui.errorscreen.ErrorScreenGenericErrorPreview (ErrorScreen.kt:142)");
            }
            com.paypal.oslo.feature.bankingbundle.ui.errorscreen.ErrorScreenTypeEnum errorScreenTypeEnum = com.paypal.oslo.feature.bankingbundle.ui.errorscreen.ErrorScreenTypeEnum.GENERIC_ERROR;
            java.lang.Object rememberedValue = startRestartGroup.rememberedValue();
            if (rememberedValue == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                rememberedValue = new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.feature.bankingbundle.ui.errorscreen.ErrorScreenKt$$ExternalSyntheticLambda1
                    @Override // kotlin.jvm.functions.Function0
                    public final java.lang.Object invoke() {
                        kotlin.Unit unit;
                        unit = kotlin.Unit.INSTANCE;
                        return unit;
                    }
                };
                startRestartGroup.updateRememberedValue(rememberedValue);
            }
            ErrorScreen(errorScreenTypeEnum, (kotlin.jvm.functions.Function0) rememberedValue, false, null, null, startRestartGroup, 54, 28);
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventEnd();
            }
        }
        androidx.compose.runtime.ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new kotlin.jvm.functions.Function2() { // from class: com.paypal.oslo.feature.bankingbundle.ui.errorscreen.ErrorScreenKt$$ExternalSyntheticLambda2
                @Override // kotlin.jvm.functions.Function2
                public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                    return com.paypal.oslo.feature.bankingbundle.ui.errorscreen.ErrorScreenKt.$r8$lambda$3BYhqYJOGNsYgeA0CylD8MlMhYI(updateChangedFlags, (androidx.compose.runtime.Composer) obj, ((java.lang.Integer) obj2).intValue());
                }
            });
        }
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$IlFk5tniGdCfw63qkkI8TYMVbWc(com.paypal.oslo.feature.bankingbundle.ui.errorscreen.ErrorScreenTypeEnum errorScreenTypeEnum, kotlin.jvm.functions.Function0 function0, boolean z, com.paypal.oslo.feature.bankingbundle.domain.error.ErrorDetail errorDetail, java.lang.String str, int i, int i2, androidx.compose.runtime.Composer composer, int i3) {
        ErrorScreen(errorScreenTypeEnum, function0, z, errorDetail, str, composer, androidx.compose.runtime.RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$SdQuqJOcqjf70luKllGTdDx1kko(com.paypal.oslo.feature.bankingbundle.ui.errorscreen.ErrorScreenTypeEnum errorScreenTypeEnum, boolean z, kotlin.jvm.functions.Function0 function0, int i, androidx.compose.runtime.Composer composer, int i2) {
        getHighSpeedVideoFpsRangesFor(errorScreenTypeEnum, z, function0, composer, androidx.compose.runtime.RecomposeScopeImplKt.updateChangedFlags(i | 1));
        return kotlin.Unit.INSTANCE;
    }

    /* renamed from: $r8$lambda$TRLezCGL0cmlkf-dE9ipo2tGyKQ, reason: not valid java name */
    public static /* synthetic */ kotlin.Unit m12259$r8$lambda$TRLezCGL0cmlkfdE9ipo2tGyKQ(int i, androidx.compose.runtime.Composer composer, int i2) {
        final int updateChangedFlags = androidx.compose.runtime.RecomposeScopeImplKt.updateChangedFlags(i | 1);
        androidx.compose.runtime.Composer startRestartGroup = composer.startRestartGroup(-897757329);
        if (!startRestartGroup.shouldExecute(updateChangedFlags != 0, updateChangedFlags & 1)) {
            startRestartGroup.skipToGroupEnd();
        } else {
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventStart(-897757329, updateChangedFlags, -1, "com.paypal.oslo.feature.bankingbundle.ui.errorscreen.ErrorScreenLoadingPreview (ErrorScreen.kt:160)");
            }
            com.paypal.oslo.feature.bankingbundle.ui.errorscreen.ErrorScreenTypeEnum errorScreenTypeEnum = com.paypal.oslo.feature.bankingbundle.ui.errorscreen.ErrorScreenTypeEnum.GENERIC_ERROR;
            java.lang.Object rememberedValue = startRestartGroup.rememberedValue();
            if (rememberedValue == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                rememberedValue = new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.feature.bankingbundle.ui.errorscreen.ErrorScreenKt$$ExternalSyntheticLambda5
                    @Override // kotlin.jvm.functions.Function0
                    public final java.lang.Object invoke() {
                        kotlin.Unit unit;
                        unit = kotlin.Unit.INSTANCE;
                        return unit;
                    }
                };
                startRestartGroup.updateRememberedValue(rememberedValue);
            }
            ErrorScreen(errorScreenTypeEnum, (kotlin.jvm.functions.Function0) rememberedValue, true, null, null, startRestartGroup, 438, 24);
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventEnd();
            }
        }
        androidx.compose.runtime.ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new kotlin.jvm.functions.Function2() { // from class: com.paypal.oslo.feature.bankingbundle.ui.errorscreen.ErrorScreenKt$$ExternalSyntheticLambda6
                @Override // kotlin.jvm.functions.Function2
                public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                    return com.paypal.oslo.feature.bankingbundle.ui.errorscreen.ErrorScreenKt.m12259$r8$lambda$TRLezCGL0cmlkfdE9ipo2tGyKQ(updateChangedFlags, (androidx.compose.runtime.Composer) obj, ((java.lang.Integer) obj2).intValue());
                }
            });
        }
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$jukJXFJkhqXL_Q9d50g8WdubKzo(int i, androidx.compose.runtime.Composer composer, int i2) {
        final int updateChangedFlags = androidx.compose.runtime.RecomposeScopeImplKt.updateChangedFlags(i | 1);
        androidx.compose.runtime.Composer startRestartGroup = composer.startRestartGroup(-227950853);
        if (!startRestartGroup.shouldExecute(updateChangedFlags != 0, updateChangedFlags & 1)) {
            startRestartGroup.skipToGroupEnd();
        } else {
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventStart(-227950853, updateChangedFlags, -1, "com.paypal.oslo.feature.bankingbundle.ui.errorscreen.ErrorScreenIneligiblePreview (ErrorScreen.kt:151)");
            }
            com.paypal.oslo.feature.bankingbundle.ui.errorscreen.ErrorScreenTypeEnum errorScreenTypeEnum = com.paypal.oslo.feature.bankingbundle.ui.errorscreen.ErrorScreenTypeEnum.INELIGIBLE;
            java.lang.Object rememberedValue = startRestartGroup.rememberedValue();
            if (rememberedValue == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                rememberedValue = new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.feature.bankingbundle.ui.errorscreen.ErrorScreenKt$$ExternalSyntheticLambda3
                    @Override // kotlin.jvm.functions.Function0
                    public final java.lang.Object invoke() {
                        kotlin.Unit unit;
                        unit = kotlin.Unit.INSTANCE;
                        return unit;
                    }
                };
                startRestartGroup.updateRememberedValue(rememberedValue);
            }
            ErrorScreen(errorScreenTypeEnum, (kotlin.jvm.functions.Function0) rememberedValue, false, null, null, startRestartGroup, 54, 28);
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventEnd();
            }
        }
        androidx.compose.runtime.ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new kotlin.jvm.functions.Function2() { // from class: com.paypal.oslo.feature.bankingbundle.ui.errorscreen.ErrorScreenKt$$ExternalSyntheticLambda4
                @Override // kotlin.jvm.functions.Function2
                public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                    return com.paypal.oslo.feature.bankingbundle.ui.errorscreen.ErrorScreenKt.$r8$lambda$jukJXFJkhqXL_Q9d50g8WdubKzo(updateChangedFlags, (androidx.compose.runtime.Composer) obj, ((java.lang.Integer) obj2).intValue());
                }
            });
        }
        return kotlin.Unit.INSTANCE;
    }
}
