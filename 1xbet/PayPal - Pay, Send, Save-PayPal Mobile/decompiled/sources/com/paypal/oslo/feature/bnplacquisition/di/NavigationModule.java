package com.paypal.oslo.feature.bnplacquisition.di;

@kotlin.Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÁ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J:\u0010\r\u001a\u001d\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00010\t\u0012\u0004\u0012\u00020\n0\bj\u0002`\u000b¢\u0006\u0002\b\f2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0007¢\u0006\u0004\b\r\u0010\u000e"}, d2 = {"Lcom/paypal/oslo/feature/bnplacquisition/di/NavigationModule;", "", "<init>", "()V", "Lcom/paypal/oslo/core/navigation/AppNavigator;", "appNavigator", "Lcom/paypal/oslo/feature/bnplacquisition/ui/SessionStorage;", "sessionStorage", "Lkotlin/Function1;", "Landroidx/navigation3/runtime/EntryProviderScope;", "", "Lcom/paypal/oslo/core/navigation/EntryProviderInstaller;", "Lkotlin/ExtensionFunctionType;", "provideBnplAcquisitionEntry", "(Lcom/paypal/oslo/core/navigation/AppNavigator;Lcom/paypal/oslo/feature/bnplacquisition/ui/SessionStorage;)Lkotlin/jvm/functions/Function1;"}, k = 1, mv = {2, 3, 0}, xi = 48)
@dagger.Module
/* loaded from: classes11.dex */
public final class NavigationModule {
    public static final int $stable = 0;
    public static final com.paypal.oslo.feature.bnplacquisition.di.NavigationModule INSTANCE = new com.paypal.oslo.feature.bnplacquisition.di.NavigationModule();

    private NavigationModule() {
    }

    @dagger.Provides
    @dagger.multibindings.IntoSet
    public final kotlin.jvm.functions.Function1<androidx.navigation3.runtime.EntryProviderScope<java.lang.Object>, kotlin.Unit> provideBnplAcquisitionEntry(final com.paypal.oslo.core.navigation.AppNavigator appNavigator, final com.paypal.oslo.feature.bnplacquisition.ui.SessionStorage sessionStorage) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(appNavigator, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(sessionStorage, "");
        return new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.bnplacquisition.di.NavigationModule$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return com.paypal.oslo.feature.bnplacquisition.di.NavigationModule.$r8$lambda$WKNligKiJasZNMJX1j8__KksmOE(com.paypal.oslo.core.navigation.AppNavigator.this, sessionStorage, (androidx.navigation3.runtime.EntryProviderScope) obj);
            }
        };
    }

    /* renamed from: $r8$lambda$48dH1_1wPRW_BAPBhmM3GpR-yUI, reason: not valid java name */
    public static /* synthetic */ kotlin.Unit m12270$r8$lambda$48dH1_1wPRW_BAPBhmM3GpRyUI(com.paypal.oslo.feature.bnplacquisition.ui.SessionStorage sessionStorage, com.paypal.oslo.core.navigation.AppNavigator appNavigator, com.paypal.oslo.feature.bnplacquisition.api.navigation.VirtualCardOverviewDestination virtualCardOverviewDestination, androidx.compose.runtime.Composer composer, int i) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(virtualCardOverviewDestination, "");
        if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
            androidx.compose.runtime.ComposerKt.traceEventStart(-513065854, i, -1, "com.paypal.oslo.feature.bnplacquisition.di.NavigationModule.provideBnplAcquisitionEntry.<anonymous>.<anonymous> (NavigationModule.kt:168)");
        }
        sessionStorage.setCreditAccountId(virtualCardOverviewDestination.getCreditAccountId());
        com.paypal.oslo.feature.bnplacquisition.ui.virtualcardoverview.VirtualCardOverviewScreenKt.VirtualCardOverviewScreen(appNavigator, null, null, null, null, null, null, null, composer, 0, com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_SECOND_DEPOSIT_CIRCLE_VALUE);
        if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
            androidx.compose.runtime.ComposerKt.traceEventEnd();
        }
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$BJrLx4dew0v4Wdp9d8UM6Nxhc9o(com.paypal.oslo.core.navigation.AppNavigator appNavigator, com.paypal.oslo.feature.bnplacquisition.navigation.OffersDestination offersDestination, androidx.compose.runtime.Composer composer, int i) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(offersDestination, "");
        if (composer.shouldExecute((i & 17) != 16, i & 1)) {
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventStart(-213809404, i, -1, "com.paypal.oslo.feature.bnplacquisition.di.NavigationModule.provideBnplAcquisitionEntry.<anonymous>.<anonymous> (NavigationModule.kt:105)");
            }
            com.paypal.oslo.feature.bnplacquisition.ui.offers.OffersScreenKt.OffersScreen(appNavigator, null, null, composer, 0, 6);
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventEnd();
            }
        } else {
            composer.skipToGroupEnd();
        }
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$Bubi9mNPZ71hBuwcBQtFshVU00k(com.paypal.oslo.core.navigation.AppNavigator appNavigator, com.paypal.oslo.feature.bnplacquisition.navigation.PersonalInfoDestination personalInfoDestination, androidx.compose.runtime.Composer composer, int i) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(personalInfoDestination, "");
        if (composer.shouldExecute((i & 17) != 16, i & 1)) {
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventStart(-1128560532, i, -1, "com.paypal.oslo.feature.bnplacquisition.di.NavigationModule.provideBnplAcquisitionEntry.<anonymous>.<anonymous> (NavigationModule.kt:94)");
            }
            com.paypal.oslo.feature.bnplacquisition.ui.personalinfo.PersonalInfoScreenKt.PersonalInfoScreen(appNavigator, null, null, composer, 0, 6);
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventEnd();
            }
        } else {
            composer.skipToGroupEnd();
        }
        return kotlin.Unit.INSTANCE;
    }

    /* renamed from: $r8$lambda$Mo5pZcz73lm4-a9v2SFLmYGmfCo, reason: not valid java name */
    public static /* synthetic */ java.lang.Object m12271$r8$lambda$Mo5pZcz73lm4a9v2SFLmYGmfCo(com.paypal.oslo.feature.bnplacquisition.navigation.AcquisitionDeepLinkEntryDestination acquisitionDeepLinkEntryDestination) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(acquisitionDeepLinkEntryDestination, "");
        return "BnplAcquisitionFlow";
    }

    /* renamed from: $r8$lambda$Q64Bpt-GpCZ5D93UGfmrh7rRP-c, reason: not valid java name */
    public static /* synthetic */ java.lang.Object m12272$r8$lambda$Q64BptGpCZ5D93UGfmrh7rRPc(com.paypal.oslo.feature.bnplacquisition.navigation.PersonalInfoDestination personalInfoDestination) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(personalInfoDestination, "");
        return "BnplAcquisitionFlow";
    }

    public static /* synthetic */ java.lang.Object $r8$lambda$QlMW04LyaHqNdWsfYprwtUxY2vU(com.paypal.oslo.feature.bnplacquisition.api.navigation.VirtualCardOverviewDestination virtualCardOverviewDestination) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(virtualCardOverviewDestination, "");
        return "BnplAcquisitionFlow";
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$RG0UCiUHq6u9jmFC0Zy5kccltAw(com.paypal.oslo.core.navigation.AppNavigator appNavigator, com.paypal.oslo.feature.bnplacquisition.navigation.AcquisitionDeepLinkEntryDestination acquisitionDeepLinkEntryDestination, androidx.compose.runtime.Composer composer, int i) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(acquisitionDeepLinkEntryDestination, "");
        if ((i & 6) == 0) {
            i |= composer.changed(acquisitionDeepLinkEntryDestination) ? 4 : 2;
        }
        if (composer.shouldExecute((i & 19) != 18, i & 1)) {
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventStart(954793891, i, -1, "com.paypal.oslo.feature.bnplacquisition.di.NavigationModule.provideBnplAcquisitionEntry.<anonymous>.<anonymous> (NavigationModule.kt:69)");
            }
            com.paypal.oslo.feature.bnplacquisition.ui.intermediaryloading.IntermediaryLoadingScreenKt.IntermediaryLoadingScreen(appNavigator, acquisitionDeepLinkEntryDestination.getPaylaterSource(), null, null, composer, 0, 12);
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventEnd();
            }
        } else {
            composer.skipToGroupEnd();
        }
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ java.lang.Object $r8$lambda$TvEQVWQlXNRqnEP_6eCKdeslYMQ(com.paypal.oslo.feature.bnplacquisition.navigation.RepaymentsDestination repaymentsDestination) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(repaymentsDestination, "");
        return "BnplAcquisitionFlow";
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$UJpIeZc6gtPL0dW4nKP1ixVfUZU(com.paypal.oslo.core.navigation.AppNavigator appNavigator, com.paypal.oslo.feature.bnplacquisition.navigation.RepaymentsDestination repaymentsDestination, androidx.compose.runtime.Composer composer, int i) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(repaymentsDestination, "");
        if (composer.shouldExecute((i & 17) != 16, i & 1)) {
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventStart(-1324814499, i, -1, "com.paypal.oslo.feature.bnplacquisition.di.NavigationModule.provideBnplAcquisitionEntry.<anonymous>.<anonymous> (NavigationModule.kt:127)");
            }
            com.paypal.oslo.feature.bnplacquisition.ui.repayments.RepaymentsScreenKt.RepaymentsScreen(appNavigator, null, null, composer, 0, 6);
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventEnd();
            }
        } else {
            composer.skipToGroupEnd();
        }
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$WKNligKiJasZNMJX1j8__KksmOE(final com.paypal.oslo.core.navigation.AppNavigator appNavigator, final com.paypal.oslo.feature.bnplacquisition.ui.SessionStorage sessionStorage, androidx.navigation3.runtime.EntryProviderScope entryProviderScope) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(entryProviderScope, "");
        final java.util.Map l3Metadata$default = com.paypal.oslo.core.navigation.NavigationMetadataBuildersKt.l3Metadata$default(false, null, false, null, null, false, null, null, com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_SECOND_DEPOSIT_CIRCLE_VALUE, null);
        entryProviderScope.addEntryProvider(kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(com.paypal.oslo.feature.bnplacquisition.navigation.AcquisitionDeepLinkEntryDestination.class), new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.bnplacquisition.di.NavigationModule$$ExternalSyntheticLambda11
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return com.paypal.oslo.feature.bnplacquisition.di.NavigationModule.m12271$r8$lambda$Mo5pZcz73lm4a9v2SFLmYGmfCo((com.paypal.oslo.feature.bnplacquisition.navigation.AcquisitionDeepLinkEntryDestination) obj);
            }
        }, (kotlin.jvm.functions.Function1) new kotlin.jvm.functions.Function1<com.paypal.oslo.feature.bnplacquisition.navigation.AcquisitionDeepLinkEntryDestination, java.util.Map<java.lang.String, ? extends java.lang.Object>>() { // from class: com.paypal.oslo.feature.bnplacquisition.di.NavigationModule$provideBnplAcquisitionEntry$lambda$0$$inlined$entry$1
            @Override // kotlin.jvm.functions.Function1
            public final java.util.Map<java.lang.String, ? extends java.lang.Object> invoke(com.paypal.oslo.feature.bnplacquisition.navigation.AcquisitionDeepLinkEntryDestination acquisitionDeepLinkEntryDestination) {
                return l3Metadata$default;
            }
        }, (kotlin.jvm.functions.Function3) androidx.compose.runtime.internal.ComposableLambdaKt.composableLambdaInstance(954793891, true, new kotlin.jvm.functions.Function3() { // from class: com.paypal.oslo.feature.bnplacquisition.di.NavigationModule$$ExternalSyntheticLambda3
            @Override // kotlin.jvm.functions.Function3
            public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2, java.lang.Object obj3) {
                return com.paypal.oslo.feature.bnplacquisition.di.NavigationModule.$r8$lambda$RG0UCiUHq6u9jmFC0Zy5kccltAw(com.paypal.oslo.core.navigation.AppNavigator.this, (com.paypal.oslo.feature.bnplacquisition.navigation.AcquisitionDeepLinkEntryDestination) obj, (androidx.compose.runtime.Composer) obj2, ((java.lang.Integer) obj3).intValue());
            }
        }));
        final java.util.Map l3Metadata$default2 = com.paypal.oslo.core.navigation.NavigationMetadataBuildersKt.l3Metadata$default(false, null, false, null, null, false, null, null, com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_SECOND_DEPOSIT_CIRCLE_VALUE, null);
        entryProviderScope.addEntryProvider(kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(com.paypal.oslo.feature.bnplacquisition.api.navigation.EnterAmountDestination.class), new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.bnplacquisition.di.NavigationModule$$ExternalSyntheticLambda4
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return com.paypal.oslo.feature.bnplacquisition.di.NavigationModule.$r8$lambda$t_W7WOPHXwy6nNvjzca0iUtEGTE((com.paypal.oslo.feature.bnplacquisition.api.navigation.EnterAmountDestination) obj);
            }
        }, (kotlin.jvm.functions.Function1) new kotlin.jvm.functions.Function1<com.paypal.oslo.feature.bnplacquisition.api.navigation.EnterAmountDestination, java.util.Map<java.lang.String, ? extends java.lang.Object>>() { // from class: com.paypal.oslo.feature.bnplacquisition.di.NavigationModule$provideBnplAcquisitionEntry$lambda$0$$inlined$entry$2
            @Override // kotlin.jvm.functions.Function1
            public final java.util.Map<java.lang.String, ? extends java.lang.Object> invoke(com.paypal.oslo.feature.bnplacquisition.api.navigation.EnterAmountDestination enterAmountDestination) {
                return l3Metadata$default2;
            }
        }, (kotlin.jvm.functions.Function3) androidx.compose.runtime.internal.ComposableLambdaKt.composableLambdaInstance(177104191, true, new kotlin.jvm.functions.Function3() { // from class: com.paypal.oslo.feature.bnplacquisition.di.NavigationModule$$ExternalSyntheticLambda5
            @Override // kotlin.jvm.functions.Function3
            public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2, java.lang.Object obj3) {
                return com.paypal.oslo.feature.bnplacquisition.di.NavigationModule.$r8$lambda$h3_y3cAErFJnFuWLWa8nuAqxRPc(com.paypal.oslo.core.navigation.AppNavigator.this, (com.paypal.oslo.feature.bnplacquisition.api.navigation.EnterAmountDestination) obj, (androidx.compose.runtime.Composer) obj2, ((java.lang.Integer) obj3).intValue());
            }
        }));
        final java.util.Map l3Metadata$default3 = com.paypal.oslo.core.navigation.NavigationMetadataBuildersKt.l3Metadata$default(false, null, false, null, null, false, null, null, com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_SECOND_DEPOSIT_CIRCLE_VALUE, null);
        entryProviderScope.addEntryProvider(kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(com.paypal.oslo.feature.bnplacquisition.navigation.PersonalInfoDestination.class), new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.bnplacquisition.di.NavigationModule$$ExternalSyntheticLambda6
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return com.paypal.oslo.feature.bnplacquisition.di.NavigationModule.m12272$r8$lambda$Q64BptGpCZ5D93UGfmrh7rRPc((com.paypal.oslo.feature.bnplacquisition.navigation.PersonalInfoDestination) obj);
            }
        }, (kotlin.jvm.functions.Function1) new kotlin.jvm.functions.Function1<com.paypal.oslo.feature.bnplacquisition.navigation.PersonalInfoDestination, java.util.Map<java.lang.String, ? extends java.lang.Object>>() { // from class: com.paypal.oslo.feature.bnplacquisition.di.NavigationModule$provideBnplAcquisitionEntry$lambda$0$$inlined$entry$3
            @Override // kotlin.jvm.functions.Function1
            public final java.util.Map<java.lang.String, ? extends java.lang.Object> invoke(com.paypal.oslo.feature.bnplacquisition.navigation.PersonalInfoDestination personalInfoDestination) {
                return l3Metadata$default3;
            }
        }, (kotlin.jvm.functions.Function3) androidx.compose.runtime.internal.ComposableLambdaKt.composableLambdaInstance(-1128560532, true, new kotlin.jvm.functions.Function3() { // from class: com.paypal.oslo.feature.bnplacquisition.di.NavigationModule$$ExternalSyntheticLambda7
            @Override // kotlin.jvm.functions.Function3
            public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2, java.lang.Object obj3) {
                return com.paypal.oslo.feature.bnplacquisition.di.NavigationModule.$r8$lambda$Bubi9mNPZ71hBuwcBQtFshVU00k(com.paypal.oslo.core.navigation.AppNavigator.this, (com.paypal.oslo.feature.bnplacquisition.navigation.PersonalInfoDestination) obj, (androidx.compose.runtime.Composer) obj2, ((java.lang.Integer) obj3).intValue());
            }
        }));
        final java.util.Map l3Metadata$default4 = com.paypal.oslo.core.navigation.NavigationMetadataBuildersKt.l3Metadata$default(false, null, false, null, null, false, null, null, com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_SECOND_DEPOSIT_CIRCLE_VALUE, null);
        entryProviderScope.addEntryProvider(kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(com.paypal.oslo.feature.bnplacquisition.navigation.OffersDestination.class), new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.bnplacquisition.di.NavigationModule$$ExternalSyntheticLambda8
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return com.paypal.oslo.feature.bnplacquisition.di.NavigationModule.$r8$lambda$hMp1s2AM5Uo2uASJsp4gxHdViC0((com.paypal.oslo.feature.bnplacquisition.navigation.OffersDestination) obj);
            }
        }, (kotlin.jvm.functions.Function1) new kotlin.jvm.functions.Function1<com.paypal.oslo.feature.bnplacquisition.navigation.OffersDestination, java.util.Map<java.lang.String, ? extends java.lang.Object>>() { // from class: com.paypal.oslo.feature.bnplacquisition.di.NavigationModule$provideBnplAcquisitionEntry$lambda$0$$inlined$entry$4
            @Override // kotlin.jvm.functions.Function1
            public final java.util.Map<java.lang.String, ? extends java.lang.Object> invoke(com.paypal.oslo.feature.bnplacquisition.navigation.OffersDestination offersDestination) {
                return l3Metadata$default4;
            }
        }, (kotlin.jvm.functions.Function3) androidx.compose.runtime.internal.ComposableLambdaKt.composableLambdaInstance(-213809404, true, new kotlin.jvm.functions.Function3() { // from class: com.paypal.oslo.feature.bnplacquisition.di.NavigationModule$$ExternalSyntheticLambda9
            @Override // kotlin.jvm.functions.Function3
            public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2, java.lang.Object obj3) {
                return com.paypal.oslo.feature.bnplacquisition.di.NavigationModule.$r8$lambda$BJrLx4dew0v4Wdp9d8UM6Nxhc9o(com.paypal.oslo.core.navigation.AppNavigator.this, (com.paypal.oslo.feature.bnplacquisition.navigation.OffersDestination) obj, (androidx.compose.runtime.Composer) obj2, ((java.lang.Integer) obj3).intValue());
            }
        }));
        final java.util.Map l3Metadata$default5 = com.paypal.oslo.core.navigation.NavigationMetadataBuildersKt.l3Metadata$default(false, null, false, null, null, false, null, null, com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_SECOND_DEPOSIT_CIRCLE_VALUE, null);
        entryProviderScope.addEntryProvider(kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(com.paypal.oslo.feature.bnplacquisition.navigation.ReviewTermsDestination.class), new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.bnplacquisition.di.NavigationModule$$ExternalSyntheticLambda10
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return com.paypal.oslo.feature.bnplacquisition.di.NavigationModule.m12275$r8$lambda$jeg09rHwsQKojF4n_NjKW17qwk((com.paypal.oslo.feature.bnplacquisition.navigation.ReviewTermsDestination) obj);
            }
        }, (kotlin.jvm.functions.Function1) new kotlin.jvm.functions.Function1<com.paypal.oslo.feature.bnplacquisition.navigation.ReviewTermsDestination, java.util.Map<java.lang.String, ? extends java.lang.Object>>() { // from class: com.paypal.oslo.feature.bnplacquisition.di.NavigationModule$provideBnplAcquisitionEntry$lambda$0$$inlined$entry$5
            @Override // kotlin.jvm.functions.Function1
            public final java.util.Map<java.lang.String, ? extends java.lang.Object> invoke(com.paypal.oslo.feature.bnplacquisition.navigation.ReviewTermsDestination reviewTermsDestination) {
                return l3Metadata$default5;
            }
        }, (kotlin.jvm.functions.Function3) androidx.compose.runtime.internal.ComposableLambdaKt.composableLambdaInstance(-323248605, true, new kotlin.jvm.functions.Function3() { // from class: com.paypal.oslo.feature.bnplacquisition.di.NavigationModule$$ExternalSyntheticLambda12
            @Override // kotlin.jvm.functions.Function3
            public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2, java.lang.Object obj3) {
                return com.paypal.oslo.feature.bnplacquisition.di.NavigationModule.$r8$lambda$kQBZBBplxg3wqkWWiWugKRNQkBU(com.paypal.oslo.core.navigation.AppNavigator.this, (com.paypal.oslo.feature.bnplacquisition.navigation.ReviewTermsDestination) obj, (androidx.compose.runtime.Composer) obj2, ((java.lang.Integer) obj3).intValue());
            }
        }));
        final java.util.Map l3Metadata$default6 = com.paypal.oslo.core.navigation.NavigationMetadataBuildersKt.l3Metadata$default(false, null, false, null, null, false, null, null, com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_SECOND_DEPOSIT_CIRCLE_VALUE, null);
        entryProviderScope.addEntryProvider(kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(com.paypal.oslo.feature.bnplacquisition.navigation.RepaymentsDestination.class), new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.bnplacquisition.di.NavigationModule$$ExternalSyntheticLambda13
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return com.paypal.oslo.feature.bnplacquisition.di.NavigationModule.$r8$lambda$TvEQVWQlXNRqnEP_6eCKdeslYMQ((com.paypal.oslo.feature.bnplacquisition.navigation.RepaymentsDestination) obj);
            }
        }, (kotlin.jvm.functions.Function1) new kotlin.jvm.functions.Function1<com.paypal.oslo.feature.bnplacquisition.navigation.RepaymentsDestination, java.util.Map<java.lang.String, ? extends java.lang.Object>>() { // from class: com.paypal.oslo.feature.bnplacquisition.di.NavigationModule$provideBnplAcquisitionEntry$lambda$0$$inlined$entry$6
            @Override // kotlin.jvm.functions.Function1
            public final java.util.Map<java.lang.String, ? extends java.lang.Object> invoke(com.paypal.oslo.feature.bnplacquisition.navigation.RepaymentsDestination repaymentsDestination) {
                return l3Metadata$default6;
            }
        }, (kotlin.jvm.functions.Function3) androidx.compose.runtime.internal.ComposableLambdaKt.composableLambdaInstance(-1324814499, true, new kotlin.jvm.functions.Function3() { // from class: com.paypal.oslo.feature.bnplacquisition.di.NavigationModule$$ExternalSyntheticLambda14
            @Override // kotlin.jvm.functions.Function3
            public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2, java.lang.Object obj3) {
                return com.paypal.oslo.feature.bnplacquisition.di.NavigationModule.$r8$lambda$UJpIeZc6gtPL0dW4nKP1ixVfUZU(com.paypal.oslo.core.navigation.AppNavigator.this, (com.paypal.oslo.feature.bnplacquisition.navigation.RepaymentsDestination) obj, (androidx.compose.runtime.Composer) obj2, ((java.lang.Integer) obj3).intValue());
            }
        }));
        final java.util.Map l3Metadata$default7 = com.paypal.oslo.core.navigation.NavigationMetadataBuildersKt.l3Metadata$default(false, null, false, null, null, false, null, null, com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_SECOND_DEPOSIT_CIRCLE_VALUE, null);
        entryProviderScope.addEntryProvider(kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(com.paypal.oslo.feature.bnplacquisition.navigation.ContentViewerDestination.class), new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.bnplacquisition.di.NavigationModule$$ExternalSyntheticLambda15
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return com.paypal.oslo.feature.bnplacquisition.di.NavigationModule.m12274$r8$lambda$d9ANyFEVPdd85qHiDA9ahP3lk((com.paypal.oslo.feature.bnplacquisition.navigation.ContentViewerDestination) obj);
            }
        }, (kotlin.jvm.functions.Function1) new kotlin.jvm.functions.Function1<com.paypal.oslo.feature.bnplacquisition.navigation.ContentViewerDestination, java.util.Map<java.lang.String, ? extends java.lang.Object>>() { // from class: com.paypal.oslo.feature.bnplacquisition.di.NavigationModule$provideBnplAcquisitionEntry$lambda$0$$inlined$entry$7
            @Override // kotlin.jvm.functions.Function1
            public final java.util.Map<java.lang.String, ? extends java.lang.Object> invoke(com.paypal.oslo.feature.bnplacquisition.navigation.ContentViewerDestination contentViewerDestination) {
                return l3Metadata$default7;
            }
        }, (kotlin.jvm.functions.Function3) androidx.compose.runtime.internal.ComposableLambdaKt.composableLambdaInstance(299968649, true, new kotlin.jvm.functions.Function3() { // from class: com.paypal.oslo.feature.bnplacquisition.di.NavigationModule$$ExternalSyntheticLambda16
            @Override // kotlin.jvm.functions.Function3
            public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2, java.lang.Object obj3) {
                return com.paypal.oslo.feature.bnplacquisition.di.NavigationModule.$r8$lambda$mvGFbi4nnHyYHG3yzyo2WxRkcC0(com.paypal.oslo.core.navigation.AppNavigator.this, (com.paypal.oslo.feature.bnplacquisition.navigation.ContentViewerDestination) obj, (androidx.compose.runtime.Composer) obj2, ((java.lang.Integer) obj3).intValue());
            }
        }));
        final java.util.Map l3Metadata$default8 = com.paypal.oslo.core.navigation.NavigationMetadataBuildersKt.l3Metadata$default(false, null, false, null, null, false, null, null, com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_SECOND_DEPOSIT_CIRCLE_VALUE, null);
        entryProviderScope.addEntryProvider(kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(com.paypal.oslo.feature.bnplacquisition.navigation.AdditionalInfoDestination.class), new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.bnplacquisition.di.NavigationModule$$ExternalSyntheticLambda17
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return com.paypal.oslo.feature.bnplacquisition.di.NavigationModule.$r8$lambda$wQAUFlWBqJa2cueu7XvcBzgnoSs((com.paypal.oslo.feature.bnplacquisition.navigation.AdditionalInfoDestination) obj);
            }
        }, (kotlin.jvm.functions.Function1) new kotlin.jvm.functions.Function1<com.paypal.oslo.feature.bnplacquisition.navigation.AdditionalInfoDestination, java.util.Map<java.lang.String, ? extends java.lang.Object>>() { // from class: com.paypal.oslo.feature.bnplacquisition.di.NavigationModule$provideBnplAcquisitionEntry$lambda$0$$inlined$entry$8
            @Override // kotlin.jvm.functions.Function1
            public final java.util.Map<java.lang.String, ? extends java.lang.Object> invoke(com.paypal.oslo.feature.bnplacquisition.navigation.AdditionalInfoDestination additionalInfoDestination) {
                return l3Metadata$default8;
            }
        }, (kotlin.jvm.functions.Function3) androidx.compose.runtime.internal.ComposableLambdaKt.composableLambdaInstance(-216258838, true, new kotlin.jvm.functions.Function3() { // from class: com.paypal.oslo.feature.bnplacquisition.di.NavigationModule$$ExternalSyntheticLambda18
            @Override // kotlin.jvm.functions.Function3
            public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2, java.lang.Object obj3) {
                return com.paypal.oslo.feature.bnplacquisition.di.NavigationModule.$r8$lambda$t63wtvfCePW9dB_0SOYeA5SKfb8(com.paypal.oslo.core.navigation.AppNavigator.this, (com.paypal.oslo.feature.bnplacquisition.navigation.AdditionalInfoDestination) obj, (androidx.compose.runtime.Composer) obj2, ((java.lang.Integer) obj3).intValue());
            }
        }));
        final java.util.Map l3Metadata$default9 = com.paypal.oslo.core.navigation.NavigationMetadataBuildersKt.l3Metadata$default(false, null, false, null, null, false, null, null, com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_SECOND_DEPOSIT_CIRCLE_VALUE, null);
        entryProviderScope.addEntryProvider(kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(com.paypal.oslo.feature.bnplacquisition.api.navigation.VirtualCardOverviewDestination.class), new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.bnplacquisition.di.NavigationModule$$ExternalSyntheticLambda19
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return com.paypal.oslo.feature.bnplacquisition.di.NavigationModule.$r8$lambda$QlMW04LyaHqNdWsfYprwtUxY2vU((com.paypal.oslo.feature.bnplacquisition.api.navigation.VirtualCardOverviewDestination) obj);
            }
        }, (kotlin.jvm.functions.Function1) new kotlin.jvm.functions.Function1<com.paypal.oslo.feature.bnplacquisition.api.navigation.VirtualCardOverviewDestination, java.util.Map<java.lang.String, ? extends java.lang.Object>>() { // from class: com.paypal.oslo.feature.bnplacquisition.di.NavigationModule$provideBnplAcquisitionEntry$lambda$0$$inlined$entry$9
            @Override // kotlin.jvm.functions.Function1
            public final java.util.Map<java.lang.String, ? extends java.lang.Object> invoke(com.paypal.oslo.feature.bnplacquisition.api.navigation.VirtualCardOverviewDestination virtualCardOverviewDestination) {
                return l3Metadata$default9;
            }
        }, (kotlin.jvm.functions.Function3) androidx.compose.runtime.internal.ComposableLambdaKt.composableLambdaInstance(-513065854, true, new kotlin.jvm.functions.Function3() { // from class: com.paypal.oslo.feature.bnplacquisition.di.NavigationModule$$ExternalSyntheticLambda20
            @Override // kotlin.jvm.functions.Function3
            public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2, java.lang.Object obj3) {
                return com.paypal.oslo.feature.bnplacquisition.di.NavigationModule.m12270$r8$lambda$48dH1_1wPRW_BAPBhmM3GpRyUI(com.paypal.oslo.feature.bnplacquisition.ui.SessionStorage.this, appNavigator, (com.paypal.oslo.feature.bnplacquisition.api.navigation.VirtualCardOverviewDestination) obj, (androidx.compose.runtime.Composer) obj2, ((java.lang.Integer) obj3).intValue());
            }
        }));
        final java.util.Map l3Metadata$default10 = com.paypal.oslo.core.navigation.NavigationMetadataBuildersKt.l3Metadata$default(false, null, false, null, null, false, null, null, com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_SECOND_DEPOSIT_CIRCLE_VALUE, null);
        entryProviderScope.addEntryProvider(kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(com.paypal.oslo.feature.bnplacquisition.navigation.ReviewPlanDestination.class), new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.bnplacquisition.di.NavigationModule$$ExternalSyntheticLambda1
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return com.paypal.oslo.feature.bnplacquisition.di.NavigationModule.m12273$r8$lambda$bxTY9gLCQV69Ye5gba9Opm4GIg((com.paypal.oslo.feature.bnplacquisition.navigation.ReviewPlanDestination) obj);
            }
        }, (kotlin.jvm.functions.Function1) new kotlin.jvm.functions.Function1<com.paypal.oslo.feature.bnplacquisition.navigation.ReviewPlanDestination, java.util.Map<java.lang.String, ? extends java.lang.Object>>() { // from class: com.paypal.oslo.feature.bnplacquisition.di.NavigationModule$provideBnplAcquisitionEntry$lambda$0$$inlined$entry$10
            @Override // kotlin.jvm.functions.Function1
            public final java.util.Map<java.lang.String, ? extends java.lang.Object> invoke(com.paypal.oslo.feature.bnplacquisition.navigation.ReviewPlanDestination reviewPlanDestination) {
                return l3Metadata$default10;
            }
        }, (kotlin.jvm.functions.Function3) androidx.compose.runtime.internal.ComposableLambdaKt.composableLambdaInstance(1744744000, true, new kotlin.jvm.functions.Function3() { // from class: com.paypal.oslo.feature.bnplacquisition.di.NavigationModule$$ExternalSyntheticLambda2
            @Override // kotlin.jvm.functions.Function3
            public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2, java.lang.Object obj3) {
                return com.paypal.oslo.feature.bnplacquisition.di.NavigationModule.$r8$lambda$e8NEG_3AXnUd7Bfbtqj4I0DvBKA(com.paypal.oslo.core.navigation.AppNavigator.this, (com.paypal.oslo.feature.bnplacquisition.navigation.ReviewPlanDestination) obj, (androidx.compose.runtime.Composer) obj2, ((java.lang.Integer) obj3).intValue());
            }
        }));
        return kotlin.Unit.INSTANCE;
    }

    /* renamed from: $r8$lambda$bxTY9gL-CQV69Ye5gba9Opm4GIg, reason: not valid java name */
    public static /* synthetic */ java.lang.Object m12273$r8$lambda$bxTY9gLCQV69Ye5gba9Opm4GIg(com.paypal.oslo.feature.bnplacquisition.navigation.ReviewPlanDestination reviewPlanDestination) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(reviewPlanDestination, "");
        return "BnplAcquisitionFlow";
    }

    /* renamed from: $r8$lambda$d9ANyFEVPdd8-5qH-iDA9ahP3lk, reason: not valid java name */
    public static /* synthetic */ java.lang.Object m12274$r8$lambda$d9ANyFEVPdd85qHiDA9ahP3lk(com.paypal.oslo.feature.bnplacquisition.navigation.ContentViewerDestination contentViewerDestination) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(contentViewerDestination, "");
        return "BnplAcquisitionFlow";
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$e8NEG_3AXnUd7Bfbtqj4I0DvBKA(com.paypal.oslo.core.navigation.AppNavigator appNavigator, com.paypal.oslo.feature.bnplacquisition.navigation.ReviewPlanDestination reviewPlanDestination, androidx.compose.runtime.Composer composer, int i) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(reviewPlanDestination, "");
        if (composer.shouldExecute((i & 17) != 16, i & 1)) {
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventStart(1744744000, i, -1, "com.paypal.oslo.feature.bnplacquisition.di.NavigationModule.provideBnplAcquisitionEntry.<anonymous>.<anonymous> (NavigationModule.kt:180)");
            }
            com.paypal.oslo.feature.bnplacquisition.ui.reviewplan.ReviewPlanScreenKt.ReviewPlanScreen(appNavigator, null, null, composer, 0, 6);
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventEnd();
            }
        } else {
            composer.skipToGroupEnd();
        }
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$h3_y3cAErFJnFuWLWa8nuAqxRPc(com.paypal.oslo.core.navigation.AppNavigator appNavigator, com.paypal.oslo.feature.bnplacquisition.api.navigation.EnterAmountDestination enterAmountDestination, androidx.compose.runtime.Composer composer, int i) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(enterAmountDestination, "");
        if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
            androidx.compose.runtime.ComposerKt.traceEventStart(177104191, i, -1, "com.paypal.oslo.feature.bnplacquisition.di.NavigationModule.provideBnplAcquisitionEntry.<anonymous>.<anonymous> (NavigationModule.kt:81)");
        }
        com.paypal.oslo.feature.bnplacquisition.ui.enteramount.EnterAmountScreenKt.EnterAmountScreen(appNavigator, enterAmountDestination.getToastMessage(), enterAmountDestination.getEntryPoint(), null, null, composer, 0, 24);
        if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
            androidx.compose.runtime.ComposerKt.traceEventEnd();
        }
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ java.lang.Object $r8$lambda$hMp1s2AM5Uo2uASJsp4gxHdViC0(com.paypal.oslo.feature.bnplacquisition.navigation.OffersDestination offersDestination) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(offersDestination, "");
        return "BnplAcquisitionFlow";
    }

    /* renamed from: $r8$lambda$jeg0-9rHwsQKojF4n_NjKW17qwk, reason: not valid java name */
    public static /* synthetic */ java.lang.Object m12275$r8$lambda$jeg09rHwsQKojF4n_NjKW17qwk(com.paypal.oslo.feature.bnplacquisition.navigation.ReviewTermsDestination reviewTermsDestination) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(reviewTermsDestination, "");
        return "BnplAcquisitionFlow";
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$kQBZBBplxg3wqkWWiWugKRNQkBU(com.paypal.oslo.core.navigation.AppNavigator appNavigator, com.paypal.oslo.feature.bnplacquisition.navigation.ReviewTermsDestination reviewTermsDestination, androidx.compose.runtime.Composer composer, int i) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(reviewTermsDestination, "");
        if (composer.shouldExecute((i & 17) != 16, i & 1)) {
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventStart(-323248605, i, -1, "com.paypal.oslo.feature.bnplacquisition.di.NavigationModule.provideBnplAcquisitionEntry.<anonymous>.<anonymous> (NavigationModule.kt:116)");
            }
            com.paypal.oslo.feature.bnplacquisition.ui.reviewterms.ReviewTermsScreenKt.ReviewTermsScreen(appNavigator, null, null, null, composer, 0, 14);
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventEnd();
            }
        } else {
            composer.skipToGroupEnd();
        }
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$mvGFbi4nnHyYHG3yzyo2WxRkcC0(com.paypal.oslo.core.navigation.AppNavigator appNavigator, com.paypal.oslo.feature.bnplacquisition.navigation.ContentViewerDestination contentViewerDestination, androidx.compose.runtime.Composer composer, int i) {
        int i2;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(contentViewerDestination, "");
        if ((i & 6) == 0) {
            i2 = i | (composer.changed(contentViewerDestination) ? 4 : 2);
        } else {
            i2 = i;
        }
        if (composer.shouldExecute((i2 & 19) != 18, i2 & 1)) {
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventStart(299968649, i2, -1, "com.paypal.oslo.feature.bnplacquisition.di.NavigationModule.provideBnplAcquisitionEntry.<anonymous>.<anonymous> (NavigationModule.kt:138)");
            }
            com.paypal.oslo.feature.bnplacquisition.ui.contentviewer.ContentViewerScreenKt.ContentViewerScreen(appNavigator, contentViewerDestination.getSource(), contentViewerDestination.getUrl(), contentViewerDestination.getHtml(), contentViewerDestination.getDownloadStaticUrl(), contentViewerDestination.getDownloadRelativePath(), contentViewerDestination.getDownloadFileName(), null, null, null, composer, 0, 896);
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventEnd();
            }
        } else {
            composer.skipToGroupEnd();
        }
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$t63wtvfCePW9dB_0SOYeA5SKfb8(com.paypal.oslo.core.navigation.AppNavigator appNavigator, com.paypal.oslo.feature.bnplacquisition.navigation.AdditionalInfoDestination additionalInfoDestination, androidx.compose.runtime.Composer composer, int i) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(additionalInfoDestination, "");
        if ((i & 6) == 0) {
            i |= composer.changed(additionalInfoDestination) ? 4 : 2;
        }
        if (composer.shouldExecute((i & 19) != 18, i & 1)) {
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventStart(-216258838, i, -1, "com.paypal.oslo.feature.bnplacquisition.di.NavigationModule.provideBnplAcquisitionEntry.<anonymous>.<anonymous> (NavigationModule.kt:155)");
            }
            com.paypal.oslo.feature.bnplacquisition.ui.additionalinfo.AdditionalInfoScreenKt.AdditionalInfoScreen(appNavigator, additionalInfoDestination.getFormattedAmount(), additionalInfoDestination.getSelectedOfferId(), null, null, composer, 0, 24);
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventEnd();
            }
        } else {
            composer.skipToGroupEnd();
        }
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ java.lang.Object $r8$lambda$t_W7WOPHXwy6nNvjzca0iUtEGTE(com.paypal.oslo.feature.bnplacquisition.api.navigation.EnterAmountDestination enterAmountDestination) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(enterAmountDestination, "");
        return "BnplAcquisitionFlow";
    }

    public static /* synthetic */ java.lang.Object $r8$lambda$wQAUFlWBqJa2cueu7XvcBzgnoSs(com.paypal.oslo.feature.bnplacquisition.navigation.AdditionalInfoDestination additionalInfoDestination) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(additionalInfoDestination, "");
        return "BnplAcquisitionFlow";
    }
}
