package com.paypal.oslo.feature.inappcheckout;

@kotlin.Metadata(d1 = {"\u0000T\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\u001b\u0010\u0002\u001a\u0004\u0018\u00010\u00002\b\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\u0000¢\u0006\u0004\b\u0002\u0010\u0003\u001a\u001f\u0010\t\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0000¢\u0006\u0004\b\t\u0010\n\u001a-\u0010\u0010\u001a\u00020\u000e2\u0006\u0010\u000b\u001a\u00020\u00002\u0006\u0010\f\u001a\u00020\u00002\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u000e0\rH\u0000¢\u0006\u0004\b\u0010\u0010\u0011\u001a\u0017\u0010\u0014\u001a\u00020\u00002\u0006\u0010\u0013\u001a\u00020\u0012H\u0000¢\u0006\u0004\b\u0014\u0010\u0015\u001a\u001f\u0010\u0018\u001a\u00020\u000e2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0017\u001a\u00020\u0016H\u0000¢\u0006\u0004\b\u0018\u0010\u0019\u001a#\u0010\u001e\u001a\u00020\u001a*\u00020\u001a2\u0006\u0010\u001c\u001a\u00020\u001b2\u0006\u0010\u001d\u001a\u00020\u0016H\u0000¢\u0006\u0004\b\u001e\u0010\u001f\u001a)\u0010$\u001a\u00020\u000e2\b\u0010!\u001a\u0004\u0018\u00010 2\u0006\u0010\"\u001a\u00020\b2\b\b\u0002\u0010#\u001a\u00020\u0016¢\u0006\u0004\b$\u0010%\u001a\u0017\u0010(\u001a\u00020\u00162\u0006\u0010'\u001a\u00020&H\u0000¢\u0006\u0004\b(\u0010)"}, d2 = {"", com.datadog.android.rum.internal.metric.ViewEndedMetricDispatcher.KEY_VALUE, "normalizeNullString", "(Ljava/lang/String;)Ljava/lang/String;", "Lcom/paypal/oslo/feature/inappcheckout/domain/entity/FundingInstrumentType;", "type", "Lcom/paypal/oslo/feature/inappcheckout/domain/entity/FundingInstrument;", "instrument", "", "getFiSubTypeStringResId", "(Lcom/paypal/oslo/feature/inappcheckout/domain/entity/FundingInstrumentType;Lcom/paypal/oslo/feature/inappcheckout/domain/entity/FundingInstrument;)I", "message", "testTag", "Lkotlin/Function0;", "", "onToastDismiss", "ShowToast", "(Ljava/lang/String;Ljava/lang/String;Lkotlin/jvm/functions/Function0;Landroidx/compose/runtime/Composer;I)V", "Lcom/paypal/oslo/feature/inappcheckout/domain/entity/MerchantEntity;", "merchantEntity", "merchantNameOrDefault", "(Lcom/paypal/oslo/feature/inappcheckout/domain/entity/MerchantEntity;Landroidx/compose/runtime/Composer;I)Ljava/lang/String;", "", "isSelected", "SmartAuthMessage", "(Lcom/paypal/oslo/feature/inappcheckout/domain/entity/FundingInstrument;ZLandroidx/compose/runtime/Composer;I)V", "Landroidx/compose/ui/Modifier;", "Landroidx/compose/foundation/layout/RowScope;", com.paypal.oslo.feature.identity.connect.inboundconnect.utils.Constants.SCOPE_KEY, "condition", "alignCenterVerticallyIf", "(Landroidx/compose/ui/Modifier;Landroidx/compose/foundation/layout/RowScope;Z)Landroidx/compose/ui/Modifier;", "Landroid/app/Activity;", "activity", "colorRes", "lightStatusBar", "setupStatusBar", "(Landroid/app/Activity;IZ)V", "Landroid/content/res/Configuration;", com.miteksystems.misnap.core.serverconnection.MobileVerifyV2Request.CONFIG_KEY, "isDarkMode", "(Landroid/content/res/Configuration;)Z"}, k = 2, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class UtilsKt {
    public static final java.lang.String normalizeNullString(java.lang.String str) {
        if (str == null || kotlin.jvm.internal.Intrinsics.areEqual(str, "null")) {
            return null;
        }
        return str;
    }

    public static final int getFiSubTypeStringResId(com.paypal.oslo.feature.inappcheckout.domain.entity.FundingInstrumentType fundingInstrumentType, com.paypal.oslo.feature.inappcheckout.domain.entity.FundingInstrument fundingInstrument) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(fundingInstrumentType, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(fundingInstrument, "");
        com.paypal.oslo.feature.inappcheckout.domain.entity.FISubType cardSubtype = fundingInstrumentType == com.paypal.oslo.feature.inappcheckout.domain.entity.FundingInstrumentType.CARD ? fundingInstrument.getCardSubtype() : fundingInstrument.getBankSubtype();
        int i = cardSubtype == null ? -1 : com.paypal.oslo.feature.inappcheckout.UtilsKt.WhenMappings.$EnumSwitchMapping$0[cardSubtype.ordinal()];
        if (i == -1) {
            return com.paypal.oslo.feature.inappcheckout.R.string.feature_inappcheckout_fi_subtype_unknown;
        }
        if (i == 1) {
            return com.paypal.oslo.feature.inappcheckout.R.string.feature_inappcheckout_fi_subtype_debit;
        }
        if (i == 2) {
            return com.paypal.oslo.feature.inappcheckout.R.string.feature_inappcheckout_fi_subtype_credit;
        }
        if (i == 3) {
            return com.paypal.oslo.feature.inappcheckout.R.string.feature_inappcheckout_fi_subtype_savings;
        }
        if (i == 4) {
            return com.paypal.oslo.feature.inappcheckout.R.string.feature_inappcheckout_fi_subtype_checking;
        }
        if (i != 5) {
            throw new kotlin.NoWhenBranchMatchedException();
        }
        return com.paypal.oslo.feature.inappcheckout.R.string.feature_inappcheckout_fi_subtype_unknown;
    }

    public static final void ShowToast(final java.lang.String str, final java.lang.String str2, final kotlin.jvm.functions.Function0<kotlin.Unit> function0, androidx.compose.runtime.Composer composer, final int i) {
        int i2;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str2, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(function0, "");
        androidx.compose.runtime.Composer startRestartGroup = composer.startRestartGroup(-1143342166);
        if ((i & 6) == 0) {
            i2 = (startRestartGroup.changed(str) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= startRestartGroup.changed(str2) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= startRestartGroup.changedInstance(function0) ? 256 : 128;
        }
        if (!startRestartGroup.shouldExecute((i2 & 147) != 146, i2 & 1)) {
            startRestartGroup.skipToGroupEnd();
        } else {
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventStart(-1143342166, i2, -1, "com.paypal.oslo.feature.inappcheckout.ShowToast (Utils.kt:68)");
            }
            androidx.compose.ui.Modifier testTag = androidx.compose.ui.platform.TestTagKt.testTag(androidx.compose.foundation.layout.PaddingKt.m1710paddingqDBjuR0$default(androidx.compose.ui.Modifier.INSTANCE, 0.0f, com.paypal.pds.core.ConstantsKt.getSpacing16(), 0.0f, 0.0f, 13, null), str2);
            boolean z = (i2 & 896) == 256;
            java.lang.Object rememberedValue = startRestartGroup.rememberedValue();
            if (z || rememberedValue == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                rememberedValue = new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.inappcheckout.UtilsKt$$ExternalSyntheticLambda2
                    @Override // kotlin.jvm.functions.Function1
                    public final java.lang.Object invoke(java.lang.Object obj) {
                        return com.paypal.oslo.feature.inappcheckout.UtilsKt.$r8$lambda$KBINLA7u7_og9BPQKs4Oy9fipBY(kotlin.jvm.functions.Function0.this, ((java.lang.Boolean) obj).booleanValue());
                    }
                };
                startRestartGroup.updateRememberedValue(rememberedValue);
            }
            com.paypal.pds.components.ToastKt.Toast(str, testTag, null, (kotlin.jvm.functions.Function1) rememberedValue, startRestartGroup, i2 & 14, 4);
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventEnd();
            }
        }
        androidx.compose.runtime.ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new kotlin.jvm.functions.Function2() { // from class: com.paypal.oslo.feature.inappcheckout.UtilsKt$$ExternalSyntheticLambda3
                @Override // kotlin.jvm.functions.Function2
                public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                    return com.paypal.oslo.feature.inappcheckout.UtilsKt.$r8$lambda$GYMKRsu0KW1ofDz44rcESS1q19w(str, str2, function0, i, (androidx.compose.runtime.Composer) obj, ((java.lang.Integer) obj2).intValue());
                }
            });
        }
    }

    public static final java.lang.String merchantNameOrDefault(com.paypal.oslo.feature.inappcheckout.domain.entity.MerchantEntity merchantEntity, androidx.compose.runtime.Composer composer, int i) {
        java.lang.String rememberStringValue;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(merchantEntity, "");
        if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
            androidx.compose.runtime.ComposerKt.traceEventStart(1934639309, i, -1, "com.paypal.oslo.feature.inappcheckout.merchantNameOrDefault (Utils.kt:84)");
        }
        android.content.Context context = (android.content.Context) composer.consume(androidx.compose.ui.platform.AndroidCompositionLocals_androidKt.getLocalContext());
        java.lang.String name2 = merchantEntity.getName();
        if (name2 == null || kotlin.text.StringsKt.isBlank(name2)) {
            composer.startReplaceGroup(673670845);
            rememberStringValue = com.paypal.oslo.feature.inappcheckout.ui.UiUtilsKt.rememberStringValue(context, com.paypal.oslo.feature.inappcheckout.R.string.feature_inappcheckout_default_merchant_name, new java.lang.Object[0], composer, 0);
            composer.endReplaceGroup();
        } else {
            composer.startReplaceGroup(673793202);
            composer.endReplaceGroup();
            rememberStringValue = merchantEntity.getName();
        }
        if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
            androidx.compose.runtime.ComposerKt.traceEventEnd();
        }
        return rememberStringValue;
    }

    public static final void SmartAuthMessage(final com.paypal.oslo.feature.inappcheckout.domain.entity.FundingInstrument fundingInstrument, final boolean z, androidx.compose.runtime.Composer composer, final int i) {
        int i2;
        androidx.compose.runtime.Composer composer2;
        kotlin.jvm.functions.Function2<? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.Unit> function2;
        androidx.compose.runtime.ScopeUpdateScope scopeUpdateScope;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(fundingInstrument, "");
        androidx.compose.runtime.Composer startRestartGroup = composer.startRestartGroup(-2145937638);
        if ((i & 6) == 0) {
            i2 = (startRestartGroup.changed(fundingInstrument) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= startRestartGroup.changed(z) ? 32 : 16;
        }
        if (!startRestartGroup.shouldExecute((i2 & 19) != 18, i2 & 1)) {
            composer2 = startRestartGroup;
            composer2.skipToGroupEnd();
        } else {
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventStart(-2145937638, i2, -1, "com.paypal.oslo.feature.inappcheckout.SmartAuthMessage (Utils.kt:100)");
            }
            android.content.Context context = (android.content.Context) startRestartGroup.consume(androidx.compose.ui.platform.AndroidCompositionLocals_androidKt.getLocalContext());
            java.lang.String smartAuthFormattedAmount = fundingInstrument.getSmartAuthFormattedAmount();
            if (!z || smartAuthFormattedAmount == null) {
                if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                    androidx.compose.runtime.ComposerKt.traceEventEnd();
                }
                scopeUpdateScope = startRestartGroup.endRestartGroup();
                if (scopeUpdateScope != null) {
                    function2 = new kotlin.jvm.functions.Function2() { // from class: com.paypal.oslo.feature.inappcheckout.UtilsKt$$ExternalSyntheticLambda0
                        @Override // kotlin.jvm.functions.Function2
                        public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                            return com.paypal.oslo.feature.inappcheckout.UtilsKt.m15403$r8$lambda$XTZMWimn068knMpeMpQJgwvWzw(com.paypal.oslo.feature.inappcheckout.domain.entity.FundingInstrument.this, z, i, (androidx.compose.runtime.Composer) obj, ((java.lang.Integer) obj2).intValue());
                        }
                    };
                    scopeUpdateScope.updateScope(function2);
                }
                return;
            }
            composer2 = startRestartGroup;
            com.paypal.pds.components.LabelKt.m21914LabelPL_sNV4(com.paypal.oslo.feature.inappcheckout.ui.UiUtilsKt.rememberStringValue(context, com.paypal.oslo.feature.inappcheckout.R.string.feature_inappcheckout_smart_auth_expanded_message, new java.lang.Object[]{smartAuthFormattedAmount}, startRestartGroup, 0), androidx.compose.foundation.layout.PaddingKt.m1710paddingqDBjuR0$default(androidx.compose.foundation.layout.SizeKt.wrapContentHeight$default(androidx.compose.foundation.layout.SizeKt.fillMaxWidth$default(androidx.compose.ui.Modifier.INSTANCE, 0.0f, 1, null), null, false, 3, null), 0.0f, com.paypal.pds.core.ConstantsKt.getSize4(), 0.0f, 0.0f, 13, null), null, null, null, null, false, 0, 0, null, com.paypal.pds.core.Typography.BodyMedium.INSTANCE, startRestartGroup, 0, 6, 1020);
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventEnd();
            }
        }
        scopeUpdateScope = composer2.endRestartGroup();
        if (scopeUpdateScope != null) {
            function2 = new kotlin.jvm.functions.Function2() { // from class: com.paypal.oslo.feature.inappcheckout.UtilsKt$$ExternalSyntheticLambda1
                @Override // kotlin.jvm.functions.Function2
                public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                    return com.paypal.oslo.feature.inappcheckout.UtilsKt.m15404$r8$lambda$XgPnbx7ZF1fowGGNqDkLOTCW0(com.paypal.oslo.feature.inappcheckout.domain.entity.FundingInstrument.this, z, i, (androidx.compose.runtime.Composer) obj, ((java.lang.Integer) obj2).intValue());
                }
            };
            scopeUpdateScope.updateScope(function2);
        }
    }

    public static final androidx.compose.ui.Modifier alignCenterVerticallyIf(androidx.compose.ui.Modifier modifier, androidx.compose.foundation.layout.RowScope rowScope, boolean z) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(modifier, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(rowScope, "");
        return z ? rowScope.align(modifier, androidx.compose.ui.Alignment.INSTANCE.getCenterVertically()) : modifier;
    }

    public static /* synthetic */ void setupStatusBar$default(android.app.Activity activity, int i, boolean z, int i2, java.lang.Object obj) {
        if ((i2 & 4) != 0) {
            z = false;
        }
        setupStatusBar(activity, i, z);
    }

    public static final void setupStatusBar(android.app.Activity activity, int i, boolean z) {
        android.view.Window window;
        if (activity == null || (window = activity.getWindow()) == null) {
            return;
        }
        window.setStatusBarColor(androidx.core.content.ContextCompat.getColor(activity, i));
        if (android.os.Build.VERSION.SDK_INT < 30) {
            if (z) {
                window.getDecorView().setSystemUiVisibility(8192);
                return;
            } else {
                window.getDecorView().setSystemUiVisibility(0);
                return;
            }
        }
        if (z) {
            android.view.WindowInsetsController insetsController = window.getInsetsController();
            if (insetsController != null) {
                insetsController.setSystemBarsAppearance(8, 8);
                return;
            }
            return;
        }
        android.view.WindowInsetsController insetsController2 = window.getInsetsController();
        if (insetsController2 != null) {
            insetsController2.setSystemBarsAppearance(0, 8);
        }
    }

    public static final boolean isDarkMode(android.content.res.Configuration configuration) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(configuration, "");
        return (configuration.uiMode & 48) == 32;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$GYMKRsu0KW1ofDz44rcESS1q19w(java.lang.String str, java.lang.String str2, kotlin.jvm.functions.Function0 function0, int i, androidx.compose.runtime.Composer composer, int i2) {
        ShowToast(str, str2, function0, composer, androidx.compose.runtime.RecomposeScopeImplKt.updateChangedFlags(i | 1));
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$KBINLA7u7_og9BPQKs4Oy9fipBY(kotlin.jvm.functions.Function0 function0, boolean z) {
        if (!z) {
            function0.invoke();
        }
        return kotlin.Unit.INSTANCE;
    }

    /* renamed from: $r8$lambda$XTZMWimn068knMpeMpQ-JgwvWzw, reason: not valid java name */
    public static /* synthetic */ kotlin.Unit m15403$r8$lambda$XTZMWimn068knMpeMpQJgwvWzw(com.paypal.oslo.feature.inappcheckout.domain.entity.FundingInstrument fundingInstrument, boolean z, int i, androidx.compose.runtime.Composer composer, int i2) {
        SmartAuthMessage(fundingInstrument, z, composer, androidx.compose.runtime.RecomposeScopeImplKt.updateChangedFlags(i | 1));
        return kotlin.Unit.INSTANCE;
    }

    /* renamed from: $r8$lambda$XgPnb-x7ZF1fowG-GNqDkLOTCW0, reason: not valid java name */
    public static /* synthetic */ kotlin.Unit m15404$r8$lambda$XgPnbx7ZF1fowGGNqDkLOTCW0(com.paypal.oslo.feature.inappcheckout.domain.entity.FundingInstrument fundingInstrument, boolean z, int i, androidx.compose.runtime.Composer composer, int i2) {
        SmartAuthMessage(fundingInstrument, z, composer, androidx.compose.runtime.RecomposeScopeImplKt.updateChangedFlags(i | 1));
        return kotlin.Unit.INSTANCE;
    }

    @kotlin.Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[com.paypal.oslo.feature.inappcheckout.domain.entity.FISubType.values().length];
            try {
                iArr[com.paypal.oslo.feature.inappcheckout.domain.entity.FISubType.DEBIT.ordinal()] = 1;
            } catch (java.lang.NoSuchFieldError unused) {
            }
            try {
                iArr[com.paypal.oslo.feature.inappcheckout.domain.entity.FISubType.CREDIT.ordinal()] = 2;
            } catch (java.lang.NoSuchFieldError unused2) {
            }
            try {
                iArr[com.paypal.oslo.feature.inappcheckout.domain.entity.FISubType.SAVINGS.ordinal()] = 3;
            } catch (java.lang.NoSuchFieldError unused3) {
            }
            try {
                iArr[com.paypal.oslo.feature.inappcheckout.domain.entity.FISubType.CHECKING.ordinal()] = 4;
            } catch (java.lang.NoSuchFieldError unused4) {
            }
            try {
                iArr[com.paypal.oslo.feature.inappcheckout.domain.entity.FISubType.UNKNOWN__.ordinal()] = 5;
            } catch (java.lang.NoSuchFieldError unused5) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }
}
