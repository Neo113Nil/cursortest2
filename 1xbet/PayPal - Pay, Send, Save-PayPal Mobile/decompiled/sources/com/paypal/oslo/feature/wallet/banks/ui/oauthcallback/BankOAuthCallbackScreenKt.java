package com.paypal.oslo.feature.wallet.banks.ui.oauthcallback;

@kotlin.Metadata(d1 = {"\u0000\u0016\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u001a]\u0010\u000b\u001a\u00020\n2\b\u0010\u0001\u001a\u0004\u0018\u00010\u00002\b\u0010\u0002\u001a\u0004\u0018\u00010\u00002\b\u0010\u0003\u001a\u0004\u0018\u00010\u00002\b\u0010\u0004\u001a\u0004\u0018\u00010\u00002\b\u0010\u0005\u001a\u0004\u0018\u00010\u00002\b\u0010\u0006\u001a\u0004\u0018\u00010\u00002\b\u0010\u0007\u001a\u0004\u0018\u00010\u00002\u0006\u0010\t\u001a\u00020\bH\u0000¢\u0006\u0004\b\u000b\u0010\f"}, d2 = {"", "aggregatorName", "externalBankId", "countryCode", com.paypal.oslo.feature.inappcheckout.domain.util.LoggerParameterKeys.INTEGRATION_TYPE_KEY, "bankName", "code", "error", "Lcom/paypal/oslo/core/navigation/AppNavigator;", "navigator", "", "BankOAuthCallbackScreen", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/paypal/oslo/core/navigation/AppNavigator;Landroidx/compose/runtime/Composer;I)V"}, k = 2, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class BankOAuthCallbackScreenKt {
    public static final void BankOAuthCallbackScreen(final java.lang.String str, final java.lang.String str2, final java.lang.String str3, final java.lang.String str4, final java.lang.String str5, final java.lang.String str6, final java.lang.String str7, final com.paypal.oslo.core.navigation.AppNavigator appNavigator, androidx.compose.runtime.Composer composer, final int i) {
        int i2;
        kotlin.Unit unit;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(appNavigator, "");
        androidx.compose.runtime.Composer startRestartGroup = composer.startRestartGroup(115487744);
        if ((i & 6) == 0) {
            i2 = (startRestartGroup.changed(str) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= startRestartGroup.changed(str2) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= startRestartGroup.changed(str3) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= startRestartGroup.changed(str4) ? 2048 : 1024;
        }
        if ((i & 24576) == 0) {
            i2 |= startRestartGroup.changed(str5) ? 16384 : 8192;
        }
        if ((196608 & i) == 0) {
            i2 |= startRestartGroup.changed(str6) ? 131072 : 65536;
        }
        if ((i & 1572864) == 0) {
            i2 |= startRestartGroup.changed(str7) ? 1048576 : 524288;
        }
        if ((i & 12582912) == 0) {
            i2 |= startRestartGroup.changed(appNavigator) ? 8388608 : 4194304;
        }
        if (!startRestartGroup.shouldExecute((i2 & 4793491) != 4793490, i2 & 1)) {
            startRestartGroup.skipToGroupEnd();
        } else {
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventStart(115487744, i2, -1, "com.paypal.oslo.feature.wallet.banks.ui.oauthcallback.BankOAuthCallbackScreen (BankOAuthCallbackScreen.kt:48)");
            }
            kotlin.Unit unit2 = kotlin.Unit.INSTANCE;
            boolean z = (i2 & 112) == 32;
            boolean z2 = (458752 & i2) == 131072;
            boolean z3 = (i2 & 14) == 4;
            boolean z4 = (i2 & 896) == 256;
            boolean z5 = (i2 & 7168) == 2048;
            boolean z6 = (57344 & i2) == 16384;
            boolean z7 = (3670016 & i2) == 1048576;
            boolean z8 = (i2 & 29360128) == 8388608;
            com.paypal.oslo.feature.wallet.banks.ui.oauthcallback.BankOAuthCallbackScreenKt$BankOAuthCallbackScreen$1$1 rememberedValue = startRestartGroup.rememberedValue();
            if (((z | z2 | z3 | z4 | z5 | z6 | z7) || z8) || rememberedValue == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                unit = unit2;
                rememberedValue = new com.paypal.oslo.feature.wallet.banks.ui.oauthcallback.BankOAuthCallbackScreenKt$BankOAuthCallbackScreen$1$1(str2, str6, str, str3, str4, str5, str7, appNavigator, null);
                startRestartGroup.updateRememberedValue(rememberedValue);
            } else {
                unit = unit2;
            }
            androidx.compose.runtime.EffectsKt.LaunchedEffect(unit, (kotlin.jvm.functions.Function2<? super kotlinx.coroutines.CoroutineScope, ? super kotlin.coroutines.Continuation<? super kotlin.Unit>, ? extends java.lang.Object>) rememberedValue, startRestartGroup, 6);
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventEnd();
            }
        }
        androidx.compose.runtime.ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new kotlin.jvm.functions.Function2() { // from class: com.paypal.oslo.feature.wallet.banks.ui.oauthcallback.BankOAuthCallbackScreenKt$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function2
                public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                    return com.paypal.oslo.feature.wallet.banks.ui.oauthcallback.BankOAuthCallbackScreenKt.m20916$r8$lambda$FKhUmvC7UGwvOni5rhhBIqPxU(str, str2, str3, str4, str5, str6, str7, appNavigator, i, (androidx.compose.runtime.Composer) obj, ((java.lang.Integer) obj2).intValue());
                }
            });
        }
    }

    /* renamed from: $r8$lambda$FKh-UmvC7UGwvOni5rhh-BIqPxU, reason: not valid java name */
    public static /* synthetic */ kotlin.Unit m20916$r8$lambda$FKhUmvC7UGwvOni5rhhBIqPxU(java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.String str4, java.lang.String str5, java.lang.String str6, java.lang.String str7, com.paypal.oslo.core.navigation.AppNavigator appNavigator, int i, androidx.compose.runtime.Composer composer, int i2) {
        BankOAuthCallbackScreen(str, str2, str3, str4, str5, str6, str7, appNavigator, composer, androidx.compose.runtime.RecomposeScopeImplKt.updateChangedFlags(i | 1));
        return kotlin.Unit.INSTANCE;
    }
}
