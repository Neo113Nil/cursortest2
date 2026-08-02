package com.paypal.oslo.feature.businessprofile.di;

@kotlin.Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\u001a\u001f\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\u0005\u0010\u0006\u001a\u001f\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\u0007\u0010\u0006"}, d2 = {"Lcom/paypal/oslo/core/navigation/AppNavigator;", "p0", "Lcom/paypal/oslo/feature/businessprofile/api/common/featuregate/BusinessProfileFeatureGatesManager;", "p1", "", "getHighSpeedVideoFpsRanges", "(Lcom/paypal/oslo/core/navigation/AppNavigator;Lcom/paypal/oslo/feature/businessprofile/api/common/featuregate/BusinessProfileFeatureGatesManager;Landroidx/compose/runtime/Composer;I)V", "Camera2StreamConfigurationMap"}, k = 2, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class NavigationModuleKt {
    /* JADX INFO: Access modifiers changed from: private */
    public static final void getHighSpeedVideoFpsRanges(final com.paypal.oslo.core.navigation.AppNavigator appNavigator, final com.paypal.oslo.feature.businessprofile.api.common.featuregate.BusinessProfileFeatureGatesManager businessProfileFeatureGatesManager, androidx.compose.runtime.Composer composer, final int i) {
        int i2;
        androidx.compose.runtime.Composer startRestartGroup = composer.startRestartGroup(-118238856);
        if ((i & 6) == 0) {
            i2 = (startRestartGroup.changed(appNavigator) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= startRestartGroup.changedInstance(businessProfileFeatureGatesManager) ? 32 : 16;
        }
        if (!startRestartGroup.shouldExecute((i2 & 19) != 18, i2 & 1)) {
            startRestartGroup.skipToGroupEnd();
        } else {
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventStart(-118238856, i2, -1, "com.paypal.oslo.feature.businessprofile.di.BusinessProfileDestinationScreen (NavigationModule.kt:54)");
            }
            com.paypal.oslo.feature.businessprofile.ui.landingpage.FeatureDisabledScreenKt.ShowContentOrFeatureDisabledScreen(businessProfileFeatureGatesManager.isBusinessProfileEnabled(), androidx.compose.ui.res.StringResources_androidKt.stringResource(com.paypal.oslo.feature.businessprofile.R.string.feature_business_profile_sales_tools_manage_business_business_profile_feature_name, startRestartGroup, 0), appNavigator, androidx.compose.runtime.internal.ComposableLambdaKt.rememberComposableLambda(86571367, true, new kotlin.jvm.functions.Function2() { // from class: com.paypal.oslo.feature.businessprofile.di.NavigationModuleKt$$ExternalSyntheticLambda6
                @Override // kotlin.jvm.functions.Function2
                public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                    return com.paypal.oslo.feature.businessprofile.di.NavigationModuleKt.m13369$r8$lambda$9SwXhY_zrVNnVcdSafzBh9cQAw(com.paypal.oslo.core.navigation.AppNavigator.this, (androidx.compose.runtime.Composer) obj, ((java.lang.Integer) obj2).intValue());
                }
            }, startRestartGroup, 54), startRestartGroup, ((i2 << 6) & 896) | 3072);
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventEnd();
            }
        }
        androidx.compose.runtime.ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new kotlin.jvm.functions.Function2() { // from class: com.paypal.oslo.feature.businessprofile.di.NavigationModuleKt$$ExternalSyntheticLambda7
                @Override // kotlin.jvm.functions.Function2
                public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                    return com.paypal.oslo.feature.businessprofile.di.NavigationModuleKt.$r8$lambda$O0Tw5gdhCQnYc_M_GJCsq6nCCd0(com.paypal.oslo.core.navigation.AppNavigator.this, businessProfileFeatureGatesManager, i, (androidx.compose.runtime.Composer) obj, ((java.lang.Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void Camera2StreamConfigurationMap(final com.paypal.oslo.core.navigation.AppNavigator appNavigator, final com.paypal.oslo.feature.businessprofile.api.common.featuregate.BusinessProfileFeatureGatesManager businessProfileFeatureGatesManager, androidx.compose.runtime.Composer composer, final int i) {
        int i2;
        androidx.compose.runtime.Composer startRestartGroup = composer.startRestartGroup(9547988);
        if ((i & 6) == 0) {
            i2 = (startRestartGroup.changed(appNavigator) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= startRestartGroup.changedInstance(businessProfileFeatureGatesManager) ? 32 : 16;
        }
        if (!startRestartGroup.shouldExecute((i2 & 19) != 18, i2 & 1)) {
            startRestartGroup.skipToGroupEnd();
        } else {
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventStart(9547988, i2, -1, "com.paypal.oslo.feature.businessprofile.di.InquiriesDestinationScreen (NavigationModule.kt:82)");
            }
            com.paypal.oslo.feature.businessprofile.ui.landingpage.FeatureDisabledScreenKt.ShowContentOrFeatureDisabledScreen(businessProfileFeatureGatesManager.isInquiriesEnabled(), androidx.compose.ui.res.StringResources_androidKt.stringResource(com.paypal.oslo.feature.businessprofile.R.string.feature_business_profile_sales_tools_manage_business_inquiries_feature_name, startRestartGroup, 0), appNavigator, androidx.compose.runtime.internal.ComposableLambdaKt.rememberComposableLambda(-2046609405, true, new kotlin.jvm.functions.Function2() { // from class: com.paypal.oslo.feature.businessprofile.di.NavigationModuleKt$$ExternalSyntheticLambda1
                @Override // kotlin.jvm.functions.Function2
                public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                    return com.paypal.oslo.feature.businessprofile.di.NavigationModuleKt.$r8$lambda$bDLBZCBQohpLiyOKLD8aAxP_j1s(com.paypal.oslo.core.navigation.AppNavigator.this, (androidx.compose.runtime.Composer) obj, ((java.lang.Integer) obj2).intValue());
                }
            }, startRestartGroup, 54), startRestartGroup, ((i2 << 6) & 896) | 3072);
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventEnd();
            }
        }
        androidx.compose.runtime.ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new kotlin.jvm.functions.Function2() { // from class: com.paypal.oslo.feature.businessprofile.di.NavigationModuleKt$$ExternalSyntheticLambda2
                @Override // kotlin.jvm.functions.Function2
                public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                    return com.paypal.oslo.feature.businessprofile.di.NavigationModuleKt.$r8$lambda$wYlE3SWrxSDIrfePYCFGPiTONlM(com.paypal.oslo.core.navigation.AppNavigator.this, businessProfileFeatureGatesManager, i, (androidx.compose.runtime.Composer) obj, ((java.lang.Integer) obj2).intValue());
                }
            });
        }
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$27UptCcv0VOQmIQaJlC_1NpdwuI(com.paypal.oslo.core.navigation.AppNavigator appNavigator) {
        appNavigator.navigate(new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.businessprofile.di.NavigationModuleKt$$ExternalSyntheticLambda8
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return com.paypal.oslo.feature.businessprofile.di.NavigationModuleKt.m13368$r8$lambda$4XCNc7g5Cs0E2Gaf47m1Dq1RaE((com.paypal.oslo.core.navigation.AppNavigator.NavigationScope) obj);
            }
        });
        return kotlin.Unit.INSTANCE;
    }

    /* renamed from: $r8$lambda$4XCNc-7g5Cs0E2Gaf47m1Dq1RaE, reason: not valid java name */
    public static /* synthetic */ kotlin.Unit m13368$r8$lambda$4XCNc7g5Cs0E2Gaf47m1Dq1RaE(com.paypal.oslo.core.navigation.AppNavigator.NavigationScope navigationScope) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(navigationScope, "");
        navigationScope.goBack();
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$86ky6869Yy3NAVdUZmphZD5BphM(com.paypal.oslo.core.navigation.AppNavigator appNavigator) {
        appNavigator.navigate(new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.businessprofile.di.NavigationModuleKt$$ExternalSyntheticLambda3
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return com.paypal.oslo.feature.businessprofile.di.NavigationModuleKt.$r8$lambda$KQZ_ZPz8KOlgx_yCOJkTnS6vSNo((com.paypal.oslo.core.navigation.AppNavigator.NavigationScope) obj);
            }
        });
        return kotlin.Unit.INSTANCE;
    }

    /* renamed from: $r8$lambda$9SwXhY_zrVNnVcdSafz-Bh9cQAw, reason: not valid java name */
    public static /* synthetic */ kotlin.Unit m13369$r8$lambda$9SwXhY_zrVNnVcdSafzBh9cQAw(final com.paypal.oslo.core.navigation.AppNavigator appNavigator, androidx.compose.runtime.Composer composer, int i) {
        if (composer.shouldExecute((i & 3) != 2, i & 1)) {
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventStart(86571367, i, -1, "com.paypal.oslo.feature.businessprofile.di.BusinessProfileDestinationScreen.<anonymous> (NavigationModule.kt:62)");
            }
            com.paypal.oslo.feature.businessprofile.ui.landingpage.SalesToolsWebViewKt.SalesToolsWebView(androidx.compose.ui.res.StringResources_androidKt.stringResource(com.paypal.oslo.feature.businessprofile.R.string.feature_business_profile_sales_tools_manage_business_business_profile_url, composer, 0), "business_profile_manage_profile_screen", androidx.compose.runtime.internal.ComposableLambdaKt.rememberComposableLambda(703168541, true, new kotlin.jvm.functions.Function4() { // from class: com.paypal.oslo.feature.businessprofile.di.NavigationModuleKt$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function4
                public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2, java.lang.Object obj3, java.lang.Object obj4) {
                    return com.paypal.oslo.feature.businessprofile.di.NavigationModuleKt.m13370$r8$lambda$jcPJP3oBUFW4bDpw0JDi2K9L8(com.paypal.oslo.core.navigation.AppNavigator.this, (com.paypal.oslo.core.webview.ui.config.SecureWebViewConfiguration) obj, (androidx.compose.ui.Modifier) obj2, (androidx.compose.runtime.Composer) obj3, ((java.lang.Integer) obj4).intValue());
                }
            }, composer, 54), composer, 432);
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventEnd();
            }
        } else {
            composer.skipToGroupEnd();
        }
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$KQZ_ZPz8KOlgx_yCOJkTnS6vSNo(com.paypal.oslo.core.navigation.AppNavigator.NavigationScope navigationScope) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(navigationScope, "");
        navigationScope.goBack();
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$O0Tw5gdhCQnYc_M_GJCsq6nCCd0(com.paypal.oslo.core.navigation.AppNavigator appNavigator, com.paypal.oslo.feature.businessprofile.api.common.featuregate.BusinessProfileFeatureGatesManager businessProfileFeatureGatesManager, int i, androidx.compose.runtime.Composer composer, int i2) {
        getHighSpeedVideoFpsRanges(appNavigator, businessProfileFeatureGatesManager, composer, androidx.compose.runtime.RecomposeScopeImplKt.updateChangedFlags(i | 1));
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$bDLBZCBQohpLiyOKLD8aAxP_j1s(final com.paypal.oslo.core.navigation.AppNavigator appNavigator, androidx.compose.runtime.Composer composer, int i) {
        if (composer.shouldExecute((i & 3) != 2, i & 1)) {
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventStart(-2046609405, i, -1, "com.paypal.oslo.feature.businessprofile.di.InquiriesDestinationScreen.<anonymous> (NavigationModule.kt:90)");
            }
            com.paypal.oslo.feature.businessprofile.ui.landingpage.SalesToolsWebViewKt.SalesToolsWebView(androidx.compose.ui.res.StringResources_androidKt.stringResource(com.paypal.oslo.feature.businessprofile.R.string.feature_business_profile_sales_tools_manage_business_inquiries_url, composer, 0), "business_profile_inquiries_screen", androidx.compose.runtime.internal.ComposableLambdaKt.rememberComposableLambda(1283751737, true, new kotlin.jvm.functions.Function4() { // from class: com.paypal.oslo.feature.businessprofile.di.NavigationModuleKt$$ExternalSyntheticLambda4
                @Override // kotlin.jvm.functions.Function4
                public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2, java.lang.Object obj3, java.lang.Object obj4) {
                    return com.paypal.oslo.feature.businessprofile.di.NavigationModuleKt.$r8$lambda$xP5v9PZ9WnpLbPEGW2pKOB4qJ_o(com.paypal.oslo.core.navigation.AppNavigator.this, (com.paypal.oslo.core.webview.ui.config.SecureWebViewConfiguration) obj, (androidx.compose.ui.Modifier) obj2, (androidx.compose.runtime.Composer) obj3, ((java.lang.Integer) obj4).intValue());
                }
            }, composer, 54), composer, 432);
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventEnd();
            }
        } else {
            composer.skipToGroupEnd();
        }
        return kotlin.Unit.INSTANCE;
    }

    /* renamed from: $r8$lambda$j-cP-JP3oBUFW4bDpw0JDi2K9L8, reason: not valid java name */
    public static /* synthetic */ kotlin.Unit m13370$r8$lambda$jcPJP3oBUFW4bDpw0JDi2K9L8(final com.paypal.oslo.core.navigation.AppNavigator appNavigator, com.paypal.oslo.core.webview.ui.config.SecureWebViewConfiguration secureWebViewConfiguration, androidx.compose.ui.Modifier modifier, androidx.compose.runtime.Composer composer, int i) {
        int i2;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(secureWebViewConfiguration, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(modifier, "");
        if ((i & 6) == 0) {
            i2 = ((i & 8) == 0 ? composer.changed(secureWebViewConfiguration) : composer.changedInstance(secureWebViewConfiguration) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= composer.changed(modifier) ? 32 : 16;
        }
        if (composer.shouldExecute((i2 & 147) != 146, i2 & 1)) {
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventStart(703168541, i2, -1, "com.paypal.oslo.feature.businessprofile.di.BusinessProfileDestinationScreen.<anonymous>.<anonymous> (NavigationModule.kt:68)");
            }
            boolean changed = composer.changed(appNavigator);
            java.lang.Object rememberedValue = composer.rememberedValue();
            if (changed || rememberedValue == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                rememberedValue = new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.feature.businessprofile.di.NavigationModuleKt$$ExternalSyntheticLambda9
                    @Override // kotlin.jvm.functions.Function0
                    public final java.lang.Object invoke() {
                        return com.paypal.oslo.feature.businessprofile.di.NavigationModuleKt.$r8$lambda$27UptCcv0VOQmIQaJlC_1NpdwuI(com.paypal.oslo.core.navigation.AppNavigator.this);
                    }
                };
                composer.updateRememberedValue(rememberedValue);
            }
            com.paypal.oslo.core.webview.ui.compose.SecureWebViewKt.SecureWebView(secureWebViewConfiguration, (kotlin.jvm.functions.Function0) rememberedValue, modifier, null, composer, com.paypal.oslo.core.webview.ui.config.SecureWebViewConfiguration.$stable | (i2 & 14) | ((i2 << 3) & 896), 8);
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventEnd();
            }
        } else {
            composer.skipToGroupEnd();
        }
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$wYlE3SWrxSDIrfePYCFGPiTONlM(com.paypal.oslo.core.navigation.AppNavigator appNavigator, com.paypal.oslo.feature.businessprofile.api.common.featuregate.BusinessProfileFeatureGatesManager businessProfileFeatureGatesManager, int i, androidx.compose.runtime.Composer composer, int i2) {
        Camera2StreamConfigurationMap(appNavigator, businessProfileFeatureGatesManager, composer, androidx.compose.runtime.RecomposeScopeImplKt.updateChangedFlags(i | 1));
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$xP5v9PZ9WnpLbPEGW2pKOB4qJ_o(final com.paypal.oslo.core.navigation.AppNavigator appNavigator, com.paypal.oslo.core.webview.ui.config.SecureWebViewConfiguration secureWebViewConfiguration, androidx.compose.ui.Modifier modifier, androidx.compose.runtime.Composer composer, int i) {
        int i2;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(secureWebViewConfiguration, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(modifier, "");
        if ((i & 6) == 0) {
            i2 = ((i & 8) == 0 ? composer.changed(secureWebViewConfiguration) : composer.changedInstance(secureWebViewConfiguration) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= composer.changed(modifier) ? 32 : 16;
        }
        if (composer.shouldExecute((i2 & 147) != 146, i2 & 1)) {
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventStart(1283751737, i2, -1, "com.paypal.oslo.feature.businessprofile.di.InquiriesDestinationScreen.<anonymous>.<anonymous> (NavigationModule.kt:96)");
            }
            boolean changed = composer.changed(appNavigator);
            java.lang.Object rememberedValue = composer.rememberedValue();
            if (changed || rememberedValue == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                rememberedValue = new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.feature.businessprofile.di.NavigationModuleKt$$ExternalSyntheticLambda5
                    @Override // kotlin.jvm.functions.Function0
                    public final java.lang.Object invoke() {
                        return com.paypal.oslo.feature.businessprofile.di.NavigationModuleKt.$r8$lambda$86ky6869Yy3NAVdUZmphZD5BphM(com.paypal.oslo.core.navigation.AppNavigator.this);
                    }
                };
                composer.updateRememberedValue(rememberedValue);
            }
            com.paypal.oslo.core.webview.ui.compose.SecureWebViewKt.SecureWebView(secureWebViewConfiguration, (kotlin.jvm.functions.Function0) rememberedValue, modifier, null, composer, com.paypal.oslo.core.webview.ui.config.SecureWebViewConfiguration.$stable | (i2 & 14) | ((i2 << 3) & 896), 8);
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventEnd();
            }
        } else {
            composer.skipToGroupEnd();
        }
        return kotlin.Unit.INSTANCE;
    }
}
