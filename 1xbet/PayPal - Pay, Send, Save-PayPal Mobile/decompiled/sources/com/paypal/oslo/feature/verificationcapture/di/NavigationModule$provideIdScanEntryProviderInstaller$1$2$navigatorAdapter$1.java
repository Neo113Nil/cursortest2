package com.paypal.oslo.feature.verificationcapture.di;

@kotlin.Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\b\n\u0018\u00002\u00020\u0001J!\u0010\u0006\u001a\u00020\u0005\"\b\b\u0000\u0010\u0003*\u00020\u00022\u0006\u0010\u0004\u001a\u00028\u0000H\u0016¢\u0006\u0004\b\u0006\u0010\u0007J\u001f\u0010\f\u001a\u00020\u00052\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u0004\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\n\u0010\u000bJ\u000f\u0010\r\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\r\u0010\u000eJ3\u0010\r\u001a\u00020\u0005\"\b\b\u0000\u0010\u0003*\u00020\u0002\"\b\b\u0001\u0010\u0010*\u00020\u000f2\u0006\u0010\u0011\u001a\u00028\u00002\u0006\u0010\u0012\u001a\u00028\u0001H\u0016¢\u0006\u0004\b\r\u0010\u0013"}, d2 = {"Lcom/paypal/oslo/feature/verificationcapture/di/NavigationModule$provideIdScanEntryProviderInstaller$1$2$navigatorAdapter$1;", "Lcom/paypal/oslo/feature/verificationcapture/ui/util/Navigator;", "Landroidx/navigation3/runtime/NavKey;", "T", "destination", "", "navigate", "(Landroidx/navigation3/runtime/NavKey;)V", "Lcom/paypal/oslo/core/navigation/result/NavResultRequestId;", "requestId", "navigateForResult-qCNXlvQ", "(Ljava/lang/String;Landroidx/navigation3/runtime/NavKey;)V", "navigateForResult", "popBackStack", "()V", "Lcom/paypal/oslo/core/navigation/result/NavResult;", com.adobe.marketing.mobile.internal.CoreConstants.Wrapper.Type.REACT_NATIVE, "key", "result", "(Landroidx/navigation3/runtime/NavKey;Lcom/paypal/oslo/core/navigation/result/NavResult;)V"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class NavigationModule$provideIdScanEntryProviderInstaller$1$2$navigatorAdapter$1 implements com.paypal.oslo.feature.verificationcapture.ui.util.Navigator {
    final /* synthetic */ com.paypal.oslo.core.navigation.AppNavigator getHighSpeedVideoFpsRanges;

    NavigationModule$provideIdScanEntryProviderInstaller$1$2$navigatorAdapter$1(com.paypal.oslo.core.navigation.AppNavigator appNavigator) {
        this.getHighSpeedVideoFpsRanges = appNavigator;
    }

    @Override // com.paypal.oslo.feature.verificationcapture.ui.util.Navigator
    public final <T extends androidx.navigation3.runtime.NavKey> void navigate(final T destination) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(destination, "");
        this.getHighSpeedVideoFpsRanges.navigate(new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.verificationcapture.di.NavigationModule$provideIdScanEntryProviderInstaller$1$2$navigatorAdapter$1$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return com.paypal.oslo.feature.verificationcapture.di.NavigationModule$provideIdScanEntryProviderInstaller$1$2$navigatorAdapter$1.$r8$lambda$kPNc9H_2jdfvmX2Ef3tyxPC5Sw8(androidx.navigation3.runtime.NavKey.this, (com.paypal.oslo.core.navigation.AppNavigator.NavigationScope) obj);
            }
        });
    }

    @Override // com.paypal.oslo.feature.verificationcapture.ui.util.Navigator
    /* renamed from: navigateForResult-qCNXlvQ, reason: not valid java name */
    public final void mo20615navigateForResultqCNXlvQ(java.lang.String requestId, final androidx.navigation3.runtime.NavKey destination) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(requestId, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(destination, "");
        if (destination instanceof com.paypal.oslo.feature.verificationcapture.api.navigation.VerificationCaptureLivenessDestination) {
            this.getHighSpeedVideoFpsRanges.m11575navigateForResultInternaluBl809w(requestId, kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(com.paypal.oslo.feature.verificationcapture.api.navigation.result.LivenessNavResult.class).toString(), new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.verificationcapture.di.NavigationModule$provideIdScanEntryProviderInstaller$1$2$navigatorAdapter$1$$ExternalSyntheticLambda3
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj) {
                    return com.paypal.oslo.feature.verificationcapture.di.NavigationModule$provideIdScanEntryProviderInstaller$1$2$navigatorAdapter$1.$r8$lambda$8hqKS761PWk9y6VOdesbFfdSAjA(androidx.navigation3.runtime.NavKey.this, (com.paypal.oslo.core.navigation.AppNavigator.NavigationScope) obj);
                }
            });
        } else {
            this.getHighSpeedVideoFpsRanges.m11575navigateForResultInternaluBl809w(requestId, kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(com.paypal.oslo.feature.verificationcapture.navigation.DocumentCaptureNavResult.class).toString(), new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.verificationcapture.di.NavigationModule$provideIdScanEntryProviderInstaller$1$2$navigatorAdapter$1$$ExternalSyntheticLambda4
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj) {
                    return com.paypal.oslo.feature.verificationcapture.di.NavigationModule$provideIdScanEntryProviderInstaller$1$2$navigatorAdapter$1.$r8$lambda$QS8hS3T1KYdPMpl60LYhmtu_X8k(androidx.navigation3.runtime.NavKey.this, (com.paypal.oslo.core.navigation.AppNavigator.NavigationScope) obj);
                }
            });
        }
    }

    @Override // com.paypal.oslo.feature.verificationcapture.ui.util.Navigator
    public final void popBackStack() {
        this.getHighSpeedVideoFpsRanges.navigate(new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.verificationcapture.di.NavigationModule$provideIdScanEntryProviderInstaller$1$2$navigatorAdapter$1$$ExternalSyntheticLambda2
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return com.paypal.oslo.feature.verificationcapture.di.NavigationModule$provideIdScanEntryProviderInstaller$1$2$navigatorAdapter$1.$r8$lambda$KEPvu7uWhUyxER3qXybLawZRaAs((com.paypal.oslo.core.navigation.AppNavigator.NavigationScope) obj);
            }
        });
    }

    @Override // com.paypal.oslo.feature.verificationcapture.ui.util.Navigator
    public final <T extends androidx.navigation3.runtime.NavKey, R extends com.paypal.oslo.core.navigation.result.NavResult> void popBackStack(T key, final R result) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(key, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(result, "");
        this.getHighSpeedVideoFpsRanges.navigate(new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.verificationcapture.di.NavigationModule$provideIdScanEntryProviderInstaller$1$2$navigatorAdapter$1$$ExternalSyntheticLambda1
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return com.paypal.oslo.feature.verificationcapture.di.NavigationModule$provideIdScanEntryProviderInstaller$1$2$navigatorAdapter$1.m20614$r8$lambda$3k0I9pxLbtYkFB2_EnRAP19e8(com.paypal.oslo.core.navigation.result.NavResult.this, (com.paypal.oslo.core.navigation.AppNavigator.NavigationScope) obj);
            }
        });
    }

    /* renamed from: $r8$lambda$3k0I9pxLbtYkFB2_--EnRAP19e8, reason: not valid java name */
    public static /* synthetic */ kotlin.Unit m20614$r8$lambda$3k0I9pxLbtYkFB2_EnRAP19e8(com.paypal.oslo.core.navigation.result.NavResult navResult, com.paypal.oslo.core.navigation.AppNavigator.NavigationScope navigationScope) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(navigationScope, "");
        navigationScope.goBackWithResult(navResult);
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$8hqKS761PWk9y6VOdesbFfdSAjA(androidx.navigation3.runtime.NavKey navKey, com.paypal.oslo.core.navigation.AppNavigator.NavigationScope navigationScope) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(navigationScope, "");
        navigationScope.push(navKey);
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$KEPvu7uWhUyxER3qXybLawZRaAs(com.paypal.oslo.core.navigation.AppNavigator.NavigationScope navigationScope) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(navigationScope, "");
        navigationScope.goBack();
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$QS8hS3T1KYdPMpl60LYhmtu_X8k(androidx.navigation3.runtime.NavKey navKey, com.paypal.oslo.core.navigation.AppNavigator.NavigationScope navigationScope) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(navigationScope, "");
        navigationScope.push(navKey);
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$kPNc9H_2jdfvmX2Ef3tyxPC5Sw8(androidx.navigation3.runtime.NavKey navKey, com.paypal.oslo.core.navigation.AppNavigator.NavigationScope navigationScope) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(navigationScope, "");
        navigationScope.push(navKey);
        return kotlin.Unit.INSTANCE;
    }
}
