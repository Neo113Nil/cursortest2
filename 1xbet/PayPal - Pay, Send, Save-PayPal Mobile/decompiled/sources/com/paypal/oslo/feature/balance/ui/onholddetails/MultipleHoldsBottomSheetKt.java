package com.paypal.oslo.feature.balance.ui.onholddetails;

@kotlin.Metadata(d1 = {"\u00008\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\u001ao\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\u00032\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u00032(\u0010\u000b\u001a$\b\u0001\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\r\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u000e\u0012\u0006\u0012\u0004\u0018\u00010\u000f0\f2\u0006\u0010\u0010\u001a\u00020\u0011H\u0007¢\u0006\u0002\u0010\u0012\u001a\r\u0010\u0013\u001a\u00020\u0001H\u0003¢\u0006\u0002\u0010\u0014¨\u0006\u0015²\u0006\n\u0010\u0016\u001a\u00020\u0005X\u008a\u0084\u0002²\u0006\n\u0010\u0017\u001a\u00020\u0005X\u008a\u0084\u0002"}, d2 = {"MultipleHoldsBottomSheet", "", "taxHoldAmount", "Lcom/paypal/oslo/feature/balance/domain/model/Money;", "taxHoldTaxRate", "", "taxHoldNextWithholdingDate", "taxHoldAmountTaxIdRequired", "isTaxIdProvided", "", "otherHoldsAmount", "formatMoney", "Lkotlin/Function3;", "", "Lkotlin/coroutines/Continuation;", "", "appNavigator", "Lcom/paypal/oslo/core/navigation/AppNavigator;", "(Lcom/paypal/oslo/feature/balance/domain/model/Money;Ljava/lang/String;Ljava/lang/String;Lcom/paypal/oslo/feature/balance/domain/model/Money;ZLcom/paypal/oslo/feature/balance/domain/model/Money;Lkotlin/jvm/functions/Function3;Lcom/paypal/oslo/core/navigation/AppNavigator;Landroidx/compose/runtime/Composer;I)V", "MultipleHoldsBottomSheetPreview", "(Landroidx/compose/runtime/Composer;I)V", "balance_prodRelease", "formattedTaxHold", "formattedOtherHolds"}, k = 2, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class MultipleHoldsBottomSheetKt {
    public static final void MultipleHoldsBottomSheet(final com.paypal.oslo.feature.balance.domain.model.Money money, final java.lang.String str, final java.lang.String str2, final com.paypal.oslo.feature.balance.domain.model.Money money2, final boolean z, final com.paypal.oslo.feature.balance.domain.model.Money money3, final kotlin.jvm.functions.Function3<? super com.paypal.oslo.feature.balance.domain.model.Money, ? super java.lang.Integer, ? super kotlin.coroutines.Continuation<? super java.lang.String>, ? extends java.lang.Object> function3, final com.paypal.oslo.core.navigation.AppNavigator appNavigator, androidx.compose.runtime.Composer composer, final int i) {
        int i2;
        androidx.compose.runtime.Composer composer2;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(money, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str2, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(money2, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(money3, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(function3, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(appNavigator, "");
        androidx.compose.runtime.Composer startRestartGroup = composer.startRestartGroup(-1720012797);
        if ((i & 6) == 0) {
            i2 = (startRestartGroup.changed(money) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= startRestartGroup.changed(str) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= startRestartGroup.changed(str2) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= startRestartGroup.changed(money2) ? 2048 : 1024;
        }
        if ((i & 24576) == 0) {
            i2 |= startRestartGroup.changed(z) ? 16384 : 8192;
        }
        if ((196608 & i) == 0) {
            i2 |= startRestartGroup.changed(money3) ? 131072 : 65536;
        }
        if ((1572864 & i) == 0) {
            i2 |= startRestartGroup.changedInstance(function3) ? 1048576 : 524288;
        }
        if ((12582912 & i) == 0) {
            i2 |= startRestartGroup.changed(appNavigator) ? 8388608 : 4194304;
        }
        if (!startRestartGroup.shouldExecute((4793491 & i2) != 4793490, i2 & 1)) {
            composer2 = startRestartGroup;
            composer2.skipToGroupEnd();
        } else {
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventStart(-1720012797, i2, -1, "com.paypal.oslo.feature.balance.ui.onholddetails.MultipleHoldsBottomSheet (MultipleHoldsBottomSheet.kt:50)");
            }
            java.lang.String m12029getCurrencyCodehkTgrg = money.m12029getCurrencyCodehkTgrg();
            java.math.BigDecimal amount = money.getAmount();
            java.lang.StringBuilder sb = new java.lang.StringBuilder();
            sb.append(m12029getCurrencyCodehkTgrg);
            sb.append(" ");
            sb.append(amount);
            java.lang.String obj = sb.toString();
            boolean changedInstance = startRestartGroup.changedInstance(function3);
            boolean z2 = (i2 & 14) == 4;
            com.paypal.oslo.feature.balance.ui.onholddetails.MultipleHoldsBottomSheetKt$MultipleHoldsBottomSheet$formattedTaxHold$2$1 rememberedValue = startRestartGroup.rememberedValue();
            if ((z2 | changedInstance) || rememberedValue == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                rememberedValue = new com.paypal.oslo.feature.balance.ui.onholddetails.MultipleHoldsBottomSheetKt$MultipleHoldsBottomSheet$formattedTaxHold$2$1(function3, money, null);
                startRestartGroup.updateRememberedValue(rememberedValue);
            }
            androidx.compose.runtime.State produceState = androidx.compose.runtime.SnapshotStateKt.produceState(obj, money, (kotlin.jvm.functions.Function2<? super androidx.compose.runtime.ProduceStateScope<java.lang.String>, ? super kotlin.coroutines.Continuation<? super kotlin.Unit>, ? extends java.lang.Object>) rememberedValue, startRestartGroup, (i2 << 3) & 112);
            java.lang.String m12029getCurrencyCodehkTgrg2 = money3.m12029getCurrencyCodehkTgrg();
            java.math.BigDecimal amount2 = money3.getAmount();
            java.lang.StringBuilder sb2 = new java.lang.StringBuilder();
            sb2.append(m12029getCurrencyCodehkTgrg2);
            sb2.append(" ");
            sb2.append(amount2);
            java.lang.String obj2 = sb2.toString();
            boolean changedInstance2 = startRestartGroup.changedInstance(function3);
            boolean z3 = (458752 & i2) == 131072;
            com.paypal.oslo.feature.balance.ui.onholddetails.MultipleHoldsBottomSheetKt$MultipleHoldsBottomSheet$formattedOtherHolds$2$1 rememberedValue2 = startRestartGroup.rememberedValue();
            if ((changedInstance2 | z3) || rememberedValue2 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                rememberedValue2 = new com.paypal.oslo.feature.balance.ui.onholddetails.MultipleHoldsBottomSheetKt$MultipleHoldsBottomSheet$formattedOtherHolds$2$1(function3, money3, null);
                startRestartGroup.updateRememberedValue(rememberedValue2);
            }
            androidx.compose.runtime.State produceState2 = androidx.compose.runtime.SnapshotStateKt.produceState(obj2, money3, (kotlin.jvm.functions.Function2<? super androidx.compose.runtime.ProduceStateScope<java.lang.String>, ? super kotlin.coroutines.Continuation<? super kotlin.Unit>, ? extends java.lang.Object>) rememberedValue2, startRestartGroup, (i2 >> 12) & 112);
            androidx.compose.ui.Modifier testTag = androidx.compose.ui.platform.TestTagKt.testTag(androidx.compose.foundation.layout.PaddingKt.m1708paddingVpY3zN4$default(androidx.compose.ui.Modifier.INSTANCE, com.paypal.pds.core.ConstantsKt.getSpacing16(), 0.0f, 2, null), com.paypal.oslo.feature.balance.common.ui.BalanceTestTags.OnHoldDetails.MultipleHolds.BOTTOM_SHEET);
            com.paypal.pds.components.ListItem[] listItemArr = {new com.paypal.pds.components.ListItem((java.lang.String) produceState.getValue(), androidx.compose.ui.res.StringResources_androidKt.stringResource(com.paypal.oslo.feature.balance.R.string.feature_balance_tax_hold_title, startRestartGroup, 0), null, null, false, false, androidx.compose.runtime.internal.ComposableLambdaKt.rememberComposableLambda(1358884992, true, new kotlin.jvm.functions.Function2() { // from class: com.paypal.oslo.feature.balance.ui.onholddetails.MultipleHoldsBottomSheetKt$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function2
                public final java.lang.Object invoke(java.lang.Object obj3, java.lang.Object obj4) {
                    return com.paypal.oslo.feature.balance.ui.onholddetails.MultipleHoldsBottomSheetKt.$r8$lambda$2jLh4K9fdke7ogzz05iRk8LyRI4(com.paypal.oslo.core.navigation.AppNavigator.this, money, money2, z, str, str2, (androidx.compose.runtime.Composer) obj3, ((java.lang.Integer) obj4).intValue());
                }
            }, startRestartGroup, 54), null, null, null, null, null, null, 8124, null), new com.paypal.pds.components.ListItem((java.lang.String) produceState2.getValue(), androidx.compose.ui.res.StringResources_androidKt.stringResource(com.paypal.oslo.feature.balance.R.string.feature_balance_holds_other_label, startRestartGroup, 0), null, null, false, false, androidx.compose.runtime.internal.ComposableLambdaKt.rememberComposableLambda(-772780095, true, new kotlin.jvm.functions.Function2() { // from class: com.paypal.oslo.feature.balance.ui.onholddetails.MultipleHoldsBottomSheetKt$$ExternalSyntheticLambda1
                @Override // kotlin.jvm.functions.Function2
                public final java.lang.Object invoke(java.lang.Object obj3, java.lang.Object obj4) {
                    return com.paypal.oslo.feature.balance.ui.onholddetails.MultipleHoldsBottomSheetKt.$r8$lambda$vpvQFbOrkYuhPMNjPwDl3TQr9Qk(com.paypal.oslo.core.navigation.AppNavigator.this, money3, (androidx.compose.runtime.Composer) obj3, ((java.lang.Integer) obj4).intValue());
                }
            }, startRestartGroup, 54), null, null, null, null, null, null, 8124, null)};
            composer2 = startRestartGroup;
            com.paypal.pds.components.ListKt.List(kotlin.collections.CollectionsKt.listOf((java.lang.Object[]) listItemArr), testTag, null, null, null, null, null, false, false, null, null, composer2, com.paypal.pds.components.ListItem.$stable, 0, 2044);
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventEnd();
            }
        }
        androidx.compose.runtime.ScopeUpdateScope endRestartGroup = composer2.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new kotlin.jvm.functions.Function2() { // from class: com.paypal.oslo.feature.balance.ui.onholddetails.MultipleHoldsBottomSheetKt$$ExternalSyntheticLambda2
                @Override // kotlin.jvm.functions.Function2
                public final java.lang.Object invoke(java.lang.Object obj3, java.lang.Object obj4) {
                    return com.paypal.oslo.feature.balance.ui.onholddetails.MultipleHoldsBottomSheetKt.$r8$lambda$FBavP0D9pnVNeSNBr8BaNDv6I_0(com.paypal.oslo.feature.balance.domain.model.Money.this, str, str2, money2, z, money3, function3, appNavigator, i, (androidx.compose.runtime.Composer) obj3, ((java.lang.Integer) obj4).intValue());
                }
            });
        }
    }

    /* renamed from: $r8$lambda$0-UW0MF44vY6rAtZBMeRTlWfCt0, reason: not valid java name */
    public static /* synthetic */ kotlin.Unit m12187$r8$lambda$0UW0MF44vY6rAtZBMeRTlWfCt0(com.paypal.oslo.feature.balance.domain.model.Money money, com.paypal.oslo.core.navigation.AppNavigator.NavigationScope navigationScope) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(navigationScope, "");
        navigationScope.replaceTop(new com.paypal.oslo.feature.balance.navigation.BalanceMoneyOnHoldDetailsDestination(money.getAmount().doubleValue(), money.m12029getCurrencyCodehkTgrg()));
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$2HTpgc8Iy3xZvwMyEM2stRO992o(com.paypal.oslo.core.navigation.AppNavigator appNavigator, final com.paypal.oslo.feature.balance.domain.model.Money money) {
        appNavigator.navigate(new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.balance.ui.onholddetails.MultipleHoldsBottomSheetKt$$ExternalSyntheticLambda7
            private static final byte[] $$c = {4, Byte.MIN_VALUE, -54, 73};
            private static final int $$d = com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_DEPOSIT_SWITCH_IDENTITY_DARK_APPEARANCE_VALUE;
            private static int $10 = 0;
            private static int $11 = 1;
            private static final byte[] $$a = {69, -115, com.visa.cbp.getEncExpo.r8lambda7aWCLmlNPTirEoC8eOYg0rEvmus, -14, -31, -13, 7, -14, 16, 46, -34, -34, 1, com.google.common.base.Ascii.FF, 3, -13, 41, -45, 0, 7, -4, 1, -15, 2, 16, -20, 10, -7, 0, 32, -21, com.visa.cbp.getEncExpo.onUnminimized};
            private static final int $$b = 143;
            private static int getHighResolutionOutputSizeshNQ4ISI = 0;
            private static int getHighSpeedVideoSizes = 1;
            private static int Camera2StreamConfigurationMap = 1229026395;

            /* JADX WARN: Multi-variable type inference failed */
            /* JADX WARN: Type inference failed for: r7v10 */
            /* JADX WARN: Type inference failed for: r7v11 */
            /* JADX WARN: Type inference failed for: r7v3 */
            /* JADX WARN: Type inference failed for: r7v4 */
            /* JADX WARN: Type inference failed for: r7v7, types: [int] */
            private static java.lang.String $$e(short s, int i, byte b) {
                int i2 = (s * 2) + 4;
                byte[] bArr = $$c;
                int i3 = (b * 4) + 97;
                int i4 = i * 4;
                byte[] bArr2 = new byte[i4 + 1];
                int i5 = -1;
                ?? r7 = i3;
                if (bArr == null) {
                    i2++;
                    r7 = i2 + i3;
                }
                while (true) {
                    byte b2 = r7;
                    int i6 = i2;
                    i5++;
                    bArr2[i5] = b2;
                    if (i5 == i4) {
                        return new java.lang.String(bArr2, 0);
                    }
                    i2 = i6 + 1;
                    r7 = b2 + bArr[i6];
                }
            }

            /* JADX WARN: Removed duplicated region for block: B:10:0x0025  */
            /* JADX WARN: Removed duplicated region for block: B:7:0x001d  */
            /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0025 -> B:4:0x0030). Please report as a decompilation issue!!! */
            /*
                Code decompiled incorrectly, please refer to instructions dump.
            */
            private static void a(int i, byte b, byte b2, java.lang.Object[] objArr) {
                int i2;
                int i3 = b2 * 28;
                byte[] bArr = $$a;
                int i4 = b + 4;
                int i5 = 98 - (i * 31);
                byte[] bArr2 = new byte[29 - i3];
                int i6 = 28 - i3;
                if (bArr == null) {
                    int i7 = i4;
                    int i8 = i6;
                    int i9 = 0;
                    i5 = (i8 + (-i5)) - 1;
                    i4 = i7;
                    i2 = i9;
                    bArr2[i2] = (byte) i5;
                    if (i2 == i6) {
                        objArr[0] = new java.lang.String(bArr2, 0);
                        return;
                    }
                    int i10 = i4 + 1;
                    byte b3 = bArr[i10];
                    i8 = i5;
                    i5 = b3;
                    i9 = i2 + 1;
                    i7 = i10;
                    i5 = (i8 + (-i5)) - 1;
                    i4 = i7;
                    i2 = i9;
                    bArr2[i2] = (byte) i5;
                    if (i2 == i6) {
                    }
                } else {
                    i2 = 0;
                    bArr2[i2] = (byte) i5;
                    if (i2 == i6) {
                    }
                }
            }

            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                int i = 2 % 2;
                int i2 = getHighSpeedVideoSizes + 5;
                getHighResolutionOutputSizeshNQ4ISI = i2 % 128;
                java.lang.Object obj2 = null;
                if (i2 % 2 != 0) {
                    com.paypal.oslo.feature.balance.ui.onholddetails.MultipleHoldsBottomSheetKt.m12187$r8$lambda$0UW0MF44vY6rAtZBMeRTlWfCt0(com.paypal.oslo.feature.balance.domain.model.Money.this, (com.paypal.oslo.core.navigation.AppNavigator.NavigationScope) obj);
                    obj2.hashCode();
                    throw null;
                }
                kotlin.Unit m12187$r8$lambda$0UW0MF44vY6rAtZBMeRTlWfCt0 = com.paypal.oslo.feature.balance.ui.onholddetails.MultipleHoldsBottomSheetKt.m12187$r8$lambda$0UW0MF44vY6rAtZBMeRTlWfCt0(com.paypal.oslo.feature.balance.domain.model.Money.this, (com.paypal.oslo.core.navigation.AppNavigator.NavigationScope) obj);
                int i3 = getHighSpeedVideoSizes + 53;
                getHighResolutionOutputSizeshNQ4ISI = i3 % 128;
                if (i3 % 2 == 0) {
                    return m12187$r8$lambda$0UW0MF44vY6rAtZBMeRTlWfCt0;
                }
                obj2.hashCode();
                throw null;
            }

            private static void b(boolean z, int i, char[] cArr, int i2, int i3, java.lang.Object[] objArr) {
                int i4 = 2 % 2;
                o.getOutputStallDurationlomOqCM getoutputstalldurationlomoqcm = new o.getOutputStallDurationlomOqCM();
                char[] cArr2 = new char[i3];
                getoutputstalldurationlomoqcm.getHighSpeedVideoFpsRangesFor = 0;
                while (getoutputstalldurationlomoqcm.getHighSpeedVideoFpsRangesFor < i3) {
                    int i5 = $10 + 29;
                    $11 = i5 % 128;
                    int i6 = i5 % 2;
                    getoutputstalldurationlomoqcm.getHighSpeedVideoFpsRanges = cArr[getoutputstalldurationlomoqcm.getHighSpeedVideoFpsRangesFor];
                    cArr2[getoutputstalldurationlomoqcm.getHighSpeedVideoFpsRangesFor] = (char) (i + getoutputstalldurationlomoqcm.getHighSpeedVideoFpsRanges);
                    int i7 = getoutputstalldurationlomoqcm.getHighSpeedVideoFpsRangesFor;
                    try {
                        java.lang.Object[] objArr2 = {java.lang.Integer.valueOf(cArr2[i7]), java.lang.Integer.valueOf(Camera2StreamConfigurationMap)};
                        java.lang.Object Camera2StreamConfigurationMap2 = o.CoroutineDebuggingKt.Camera2StreamConfigurationMap(1585789956);
                        if (Camera2StreamConfigurationMap2 == null) {
                            byte b = (byte) 0;
                            byte b2 = b;
                            Camera2StreamConfigurationMap2 = o.CoroutineDebuggingKt.Camera2StreamConfigurationMap((char) (android.view.View.resolveSize(0, 0) + 17808), (android.view.ViewConfiguration.getJumpTapTimeout() >> 16) + 379, 17 - android.text.TextUtils.indexOf("", "", 0, 0), -1014629116, false, $$e(b, b2, b2), new java.lang.Class[]{java.lang.Integer.TYPE, java.lang.Integer.TYPE});
                        }
                        cArr2[i7] = ((java.lang.Character) ((java.lang.reflect.Method) Camera2StreamConfigurationMap2).invoke(null, objArr2)).charValue();
                        java.lang.Object[] objArr3 = {getoutputstalldurationlomoqcm, getoutputstalldurationlomoqcm};
                        java.lang.Object Camera2StreamConfigurationMap3 = o.CoroutineDebuggingKt.Camera2StreamConfigurationMap(1484703174);
                        if (Camera2StreamConfigurationMap3 == null) {
                            Camera2StreamConfigurationMap3 = o.CoroutineDebuggingKt.Camera2StreamConfigurationMap((char) (android.graphics.ImageFormat.getBitsPerPixel(0) + 32159), 90 - (android.view.ViewConfiguration.getMaximumDrawingCacheSize() >> 24), 11 - android.view.View.MeasureSpec.makeMeasureSpec(0, 0), -981596986, false, "d", new java.lang.Class[]{java.lang.Object.class, java.lang.Object.class});
                        }
                        ((java.lang.reflect.Method) Camera2StreamConfigurationMap3).invoke(null, objArr3);
                    } catch (java.lang.Throwable th) {
                        java.lang.Throwable cause = th.getCause();
                        if (cause == null) {
                            throw th;
                        }
                        throw cause;
                    }
                }
                if (i2 > 0) {
                    int i8 = $11 + 85;
                    $10 = i8 % 128;
                    int i9 = i8 % 2;
                    getoutputstalldurationlomoqcm.getHighResolutionOutputSizeshNQ4ISI = i2;
                    char[] cArr3 = new char[i3];
                    java.lang.System.arraycopy(cArr2, 0, cArr3, 0, i3);
                    java.lang.System.arraycopy(cArr3, 0, cArr2, i3 - getoutputstalldurationlomoqcm.getHighResolutionOutputSizeshNQ4ISI, getoutputstalldurationlomoqcm.getHighResolutionOutputSizeshNQ4ISI);
                    java.lang.System.arraycopy(cArr3, getoutputstalldurationlomoqcm.getHighResolutionOutputSizeshNQ4ISI, cArr2, 0, i3 - getoutputstalldurationlomoqcm.getHighResolutionOutputSizeshNQ4ISI);
                }
                if (z) {
                    char[] cArr4 = new char[i3];
                    getoutputstalldurationlomoqcm.getHighSpeedVideoFpsRangesFor = 0;
                    while (getoutputstalldurationlomoqcm.getHighSpeedVideoFpsRangesFor < i3) {
                        cArr4[getoutputstalldurationlomoqcm.getHighSpeedVideoFpsRangesFor] = cArr2[(i3 - getoutputstalldurationlomoqcm.getHighSpeedVideoFpsRangesFor) - 1];
                        try {
                            java.lang.Object[] objArr4 = {getoutputstalldurationlomoqcm, getoutputstalldurationlomoqcm};
                            java.lang.Object Camera2StreamConfigurationMap4 = o.CoroutineDebuggingKt.Camera2StreamConfigurationMap(1484703174);
                            if (Camera2StreamConfigurationMap4 == null) {
                                Camera2StreamConfigurationMap4 = o.CoroutineDebuggingKt.Camera2StreamConfigurationMap((char) ((android.media.AudioTrack.getMinVolume() > 0.0f ? 1 : (android.media.AudioTrack.getMinVolume() == 0.0f ? 0 : -1)) + 32158), android.view.Gravity.getAbsoluteGravity(0, 0) + 90, android.text.TextUtils.getCapsMode("", 0, 0) + 11, -981596986, false, "d", new java.lang.Class[]{java.lang.Object.class, java.lang.Object.class});
                            }
                            ((java.lang.reflect.Method) Camera2StreamConfigurationMap4).invoke(null, objArr4);
                            int i10 = $10 + 51;
                            $11 = i10 % 128;
                            int i11 = i10 % 2;
                        } catch (java.lang.Throwable th2) {
                            java.lang.Throwable cause2 = th2.getCause();
                            if (cause2 == null) {
                                throw th2;
                            }
                            throw cause2;
                        }
                    }
                    cArr2 = cArr4;
                }
                objArr[0] = new java.lang.String(cArr2);
            }

            /*  JADX ERROR: NoSuchElementException in pass: ReplaceNewArray
                java.util.NoSuchElementException
                	at java.base/java.util.TreeMap.key(TreeMap.java:1637)
                	at java.base/java.util.TreeMap.lastKey(TreeMap.java:309)
                	at jadx.core.dex.visitors.ReplaceNewArray.processNewArray(ReplaceNewArray.java:171)
                	at jadx.core.dex.visitors.ReplaceNewArray.processInsn(ReplaceNewArray.java:72)
                	at jadx.core.dex.visitors.ReplaceNewArray.visit(ReplaceNewArray.java:53)
                */
            public static java.lang.Object[] getHighSpeedVideoFpsRangesFor(int r31, int r32, int r33) {
                /*
                    Method dump skipped, instructions count: 1686
                    To view this dump add '--comments-level debug' option
                */
                throw new UnsupportedOperationException("Method not decompiled: com.paypal.oslo.feature.balance.ui.onholddetails.MultipleHoldsBottomSheetKt$$ExternalSyntheticLambda7.getHighSpeedVideoFpsRangesFor(int, int, int):java.lang.Object[]");
            }
        });
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$2jLh4K9fdke7ogzz05iRk8LyRI4(final com.paypal.oslo.core.navigation.AppNavigator appNavigator, final com.paypal.oslo.feature.balance.domain.model.Money money, final com.paypal.oslo.feature.balance.domain.model.Money money2, final boolean z, final java.lang.String str, final java.lang.String str2, androidx.compose.runtime.Composer composer, int i) {
        if (composer.shouldExecute((i & 3) != 2, i & 1)) {
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventStart(1358884992, i, -1, "com.paypal.oslo.feature.balance.ui.onholddetails.MultipleHoldsBottomSheet.<anonymous> (MultipleHoldsBottomSheet.kt:74)");
            }
            java.lang.String stringResource = androidx.compose.ui.res.StringResources_androidKt.stringResource(com.paypal.oslo.feature.balance.R.string.feature_balance_holds_resolve_button, composer, 0);
            com.paypal.pds.components.ButtonStyle.Secondary secondary = com.paypal.pds.components.ButtonStyle.Secondary.INSTANCE;
            com.paypal.pds.components.ButtonSize.Small small = com.paypal.pds.components.ButtonSize.Small.INSTANCE;
            androidx.compose.ui.Modifier item = com.paypal.oslo.core.telemetry.compose.ModifierExtensionsKt.item(androidx.compose.ui.Modifier.INSTANCE, com.paypal.oslo.feature.balance.analytics.BalanceAnalyticsConstants.BalanceOnHold.INSTANCE.getHOLD_DETAILS_RESOLVE_BUTTON());
            boolean changed = composer.changed(appNavigator);
            boolean changed2 = composer.changed(money);
            boolean changed3 = composer.changed(money2);
            boolean changed4 = composer.changed(z);
            boolean changed5 = composer.changed(str);
            boolean changed6 = composer.changed(str2);
            java.lang.Object rememberedValue = composer.rememberedValue();
            if ((changed | changed2 | changed3 | changed4 | changed5 | changed6) || rememberedValue == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                rememberedValue = new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.feature.balance.ui.onholddetails.MultipleHoldsBottomSheetKt$$ExternalSyntheticLambda4
                    @Override // kotlin.jvm.functions.Function0
                    public final java.lang.Object invoke() {
                        return com.paypal.oslo.feature.balance.ui.onholddetails.MultipleHoldsBottomSheetKt.m12188$r8$lambda$rMt2u4l5iYS4QWly03AxC1b_KA(com.paypal.oslo.core.navigation.AppNavigator.this, money, money2, z, str, str2);
                    }
                };
                composer.updateRememberedValue(rememberedValue);
            }
            com.paypal.pds.components.ButtonKt.Button((kotlin.jvm.functions.Function0) rememberedValue, stringResource, item, null, null, secondary, small, false, false, composer, 1769472, 408);
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventEnd();
            }
        } else {
            composer.skipToGroupEnd();
        }
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$8QqkuyzbVq4HY1jzBSVphwI4E_4(int i, androidx.compose.runtime.Composer composer, int i2) {
        final int updateChangedFlags = androidx.compose.runtime.RecomposeScopeImplKt.updateChangedFlags(i | 1);
        androidx.compose.runtime.Composer startRestartGroup = composer.startRestartGroup(411561367);
        if (!startRestartGroup.shouldExecute(updateChangedFlags != 0, updateChangedFlags & 1)) {
            startRestartGroup.skipToGroupEnd();
        } else {
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventStart(411561367, updateChangedFlags, -1, "com.paypal.oslo.feature.balance.ui.onholddetails.MultipleHoldsBottomSheetPreview (MultipleHoldsBottomSheet.kt:127)");
            }
            com.paypal.oslo.feature.balance.domain.model.Money money = new com.paypal.oslo.feature.balance.domain.model.Money(new java.math.BigDecimal("441.60"), com.paypal.oslo.core.i18n.domain.model.CurrencyCode.m11384constructorimpl("USD"), null);
            com.paypal.oslo.feature.balance.domain.model.Money money2 = new com.paypal.oslo.feature.balance.domain.model.Money(new java.math.BigDecimal("200.00"), com.paypal.oslo.core.i18n.domain.model.CurrencyCode.m11384constructorimpl("USD"), null);
            com.paypal.oslo.feature.balance.domain.model.Money money3 = new com.paypal.oslo.feature.balance.domain.model.Money(new java.math.BigDecimal("12.00"), com.paypal.oslo.core.i18n.domain.model.CurrencyCode.m11384constructorimpl("USD"), null);
            androidx.compose.ui.Modifier fillMaxWidth$default = androidx.compose.foundation.layout.SizeKt.fillMaxWidth$default(androidx.compose.ui.Modifier.INSTANCE, 0.0f, 1, null);
            androidx.compose.ui.layout.MeasurePolicy maybeCachedBoxMeasurePolicy = androidx.compose.foundation.layout.BoxKt.maybeCachedBoxMeasurePolicy(androidx.compose.ui.Alignment.INSTANCE.getTopStart(), false);
            int hashCode = java.lang.Long.hashCode(androidx.compose.runtime.ComposablesKt.getCurrentCompositeKeyHashCode(startRestartGroup, 0));
            androidx.compose.runtime.CompositionLocalMap currentCompositionLocalMap = startRestartGroup.getCurrentCompositionLocalMap();
            androidx.compose.ui.Modifier materializeModifier = androidx.compose.ui.ComposedModifierKt.materializeModifier(startRestartGroup, fillMaxWidth$default);
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
            com.paypal.oslo.core.navigation.AppNavigator appNavigator = new com.paypal.oslo.core.navigation.AppNavigator(null, null, 3, null);
            com.paypal.oslo.feature.balance.ui.onholddetails.MultipleHoldsBottomSheetKt$MultipleHoldsBottomSheetPreview$1$1$1 rememberedValue = startRestartGroup.rememberedValue();
            if (rememberedValue == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                rememberedValue = new com.paypal.oslo.feature.balance.ui.onholddetails.MultipleHoldsBottomSheetKt$MultipleHoldsBottomSheetPreview$1$1$1(null);
                startRestartGroup.updateRememberedValue(rememberedValue);
            }
            MultipleHoldsBottomSheet(money, "", "", money2, true, money3, (kotlin.jvm.functions.Function3) rememberedValue, appNavigator, startRestartGroup, 25008);
            startRestartGroup.endNode();
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventEnd();
            }
        }
        androidx.compose.runtime.ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new kotlin.jvm.functions.Function2() { // from class: com.paypal.oslo.feature.balance.ui.onholddetails.MultipleHoldsBottomSheetKt$$ExternalSyntheticLambda5
                @Override // kotlin.jvm.functions.Function2
                public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                    return com.paypal.oslo.feature.balance.ui.onholddetails.MultipleHoldsBottomSheetKt.$r8$lambda$8QqkuyzbVq4HY1jzBSVphwI4E_4(updateChangedFlags, (androidx.compose.runtime.Composer) obj, ((java.lang.Integer) obj2).intValue());
                }
            });
        }
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$FBavP0D9pnVNeSNBr8BaNDv6I_0(com.paypal.oslo.feature.balance.domain.model.Money money, java.lang.String str, java.lang.String str2, com.paypal.oslo.feature.balance.domain.model.Money money2, boolean z, com.paypal.oslo.feature.balance.domain.model.Money money3, kotlin.jvm.functions.Function3 function3, com.paypal.oslo.core.navigation.AppNavigator appNavigator, int i, androidx.compose.runtime.Composer composer, int i2) {
        MultipleHoldsBottomSheet(money, str, str2, money2, z, money3, function3, appNavigator, composer, androidx.compose.runtime.RecomposeScopeImplKt.updateChangedFlags(i | 1));
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$S9ttXYCD9ydE_0isijl9Gep5bLU(com.paypal.oslo.feature.balance.domain.model.Money money, com.paypal.oslo.feature.balance.domain.model.Money money2, boolean z, java.lang.String str, java.lang.String str2, com.paypal.oslo.core.navigation.AppNavigator.NavigationScope navigationScope) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(navigationScope, "");
        navigationScope.replaceTop(new com.paypal.oslo.feature.balance.navigation.BalanceTaxOnHoldDetailsDestination(z, money.getAmount().doubleValue(), money.m12029getCurrencyCodehkTgrg(), str, str2, money2.getAmount().doubleValue()));
        return kotlin.Unit.INSTANCE;
    }

    /* renamed from: $r8$lambda$rMt2u-4l5iYS4QWly03AxC1b_KA, reason: not valid java name */
    public static /* synthetic */ kotlin.Unit m12188$r8$lambda$rMt2u4l5iYS4QWly03AxC1b_KA(com.paypal.oslo.core.navigation.AppNavigator appNavigator, final com.paypal.oslo.feature.balance.domain.model.Money money, final com.paypal.oslo.feature.balance.domain.model.Money money2, final boolean z, final java.lang.String str, final java.lang.String str2) {
        appNavigator.navigate(new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.balance.ui.onholddetails.MultipleHoldsBottomSheetKt$$ExternalSyntheticLambda6
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return com.paypal.oslo.feature.balance.ui.onholddetails.MultipleHoldsBottomSheetKt.$r8$lambda$S9ttXYCD9ydE_0isijl9Gep5bLU(com.paypal.oslo.feature.balance.domain.model.Money.this, money2, z, str, str2, (com.paypal.oslo.core.navigation.AppNavigator.NavigationScope) obj);
            }
        });
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$vpvQFbOrkYuhPMNjPwDl3TQr9Qk(final com.paypal.oslo.core.navigation.AppNavigator appNavigator, final com.paypal.oslo.feature.balance.domain.model.Money money, androidx.compose.runtime.Composer composer, int i) {
        if (composer.shouldExecute((i & 3) != 2, i & 1)) {
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventStart(-772780095, i, -1, "com.paypal.oslo.feature.balance.ui.onholddetails.MultipleHoldsBottomSheet.<anonymous> (MultipleHoldsBottomSheet.kt:102)");
            }
            java.lang.String stringResource = androidx.compose.ui.res.StringResources_androidKt.stringResource(com.paypal.oslo.feature.balance.R.string.feature_balance_holds_learn_more, composer, 0);
            com.paypal.pds.components.ButtonStyle.Secondary secondary = com.paypal.pds.components.ButtonStyle.Secondary.INSTANCE;
            com.paypal.pds.components.ButtonSize.Small small = com.paypal.pds.components.ButtonSize.Small.INSTANCE;
            androidx.compose.ui.Modifier item = com.paypal.oslo.core.telemetry.compose.ModifierExtensionsKt.item(androidx.compose.ui.Modifier.INSTANCE, com.paypal.oslo.feature.balance.analytics.BalanceAnalyticsConstants.BalanceOnHold.INSTANCE.getHOLD_DETAILS_LEARN_MORE_BUTTON());
            boolean changed = composer.changed(appNavigator);
            boolean changed2 = composer.changed(money);
            java.lang.Object rememberedValue = composer.rememberedValue();
            if ((changed | changed2) || rememberedValue == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                rememberedValue = new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.feature.balance.ui.onholddetails.MultipleHoldsBottomSheetKt$$ExternalSyntheticLambda3
                    @Override // kotlin.jvm.functions.Function0
                    public final java.lang.Object invoke() {
                        return com.paypal.oslo.feature.balance.ui.onholddetails.MultipleHoldsBottomSheetKt.$r8$lambda$2HTpgc8Iy3xZvwMyEM2stRO992o(com.paypal.oslo.core.navigation.AppNavigator.this, money);
                    }
                };
                composer.updateRememberedValue(rememberedValue);
            }
            com.paypal.pds.components.ButtonKt.Button((kotlin.jvm.functions.Function0) rememberedValue, stringResource, item, null, null, secondary, small, false, false, composer, 1769472, 408);
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventEnd();
            }
        } else {
            composer.skipToGroupEnd();
        }
        return kotlin.Unit.INSTANCE;
    }
}
