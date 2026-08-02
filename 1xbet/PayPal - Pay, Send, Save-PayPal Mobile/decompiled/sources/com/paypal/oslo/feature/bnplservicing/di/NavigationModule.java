package com.paypal.oslo.feature.bnplservicing.di;

@kotlin.Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J2\u0010\u000b\u001a\u001d\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00010\u0007\u0012\u0004\u0012\u00020\b0\u0006j\u0002`\t¢\u0006\u0002\b\n2\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u000b\u0010\f"}, d2 = {"Lcom/paypal/oslo/feature/bnplservicing/di/NavigationModule;", "", "<init>", "()V", "Lcom/paypal/oslo/core/navigation/AppNavigator;", "appNavigator", "Lkotlin/Function1;", "Landroidx/navigation3/runtime/EntryProviderScope;", "", "Lcom/paypal/oslo/core/navigation/EntryProviderInstaller;", "Lkotlin/ExtensionFunctionType;", "providesBNPLServicingEntry", "(Lcom/paypal/oslo/core/navigation/AppNavigator;)Lkotlin/jvm/functions/Function1;"}, k = 1, mv = {2, 3, 0}, xi = 48)
@dagger.Module
/* loaded from: classes11.dex */
public final class NavigationModule {
    public static final int $stable = 0;
    public static final com.paypal.oslo.feature.bnplservicing.di.NavigationModule INSTANCE = new com.paypal.oslo.feature.bnplservicing.di.NavigationModule();

    private NavigationModule() {
    }

    @dagger.Provides
    @dagger.multibindings.IntoSet
    public final kotlin.jvm.functions.Function1<androidx.navigation3.runtime.EntryProviderScope<java.lang.Object>, kotlin.Unit> providesBNPLServicingEntry(final com.paypal.oslo.core.navigation.AppNavigator appNavigator) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(appNavigator, "");
        return new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.bnplservicing.di.NavigationModule$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return com.paypal.oslo.feature.bnplservicing.di.NavigationModule.m12514$r8$lambda$OfEB8XLB8GaXFLIj7EijluvCjQ(com.paypal.oslo.core.navigation.AppNavigator.this, (androidx.navigation3.runtime.EntryProviderScope) obj);
            }
        };
    }

    /* renamed from: $r8$lambda$2ti4i1-KWB62QU3v9BPG1rOESNw, reason: not valid java name */
    public static /* synthetic */ kotlin.Unit m12513$r8$lambda$2ti4i1KWB62QU3v9BPG1rOESNw(com.paypal.oslo.core.navigation.AppNavigator appNavigator, com.paypal.oslo.feature.bnplservicing.api.navigation.PreQualDestination preQualDestination, androidx.compose.runtime.Composer composer, int i) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(preQualDestination, "");
        if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
            androidx.compose.runtime.ComposerKt.traceEventStart(2111882783, i, -1, "com.paypal.oslo.feature.bnplservicing.di.NavigationModule.providesBNPLServicingEntry.<anonymous>.<anonymous> (NavigationModule.kt:74)");
        }
        com.paypal.oslo.feature.bnplservicing.ui.prequal.PreQualScreenKt.PreQualScreen(appNavigator, null, composer, 0, 2);
        if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
            androidx.compose.runtime.ComposerKt.traceEventEnd();
        }
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$9V1JErZ7z_8N160vMRvc0qt6loM(com.paypal.oslo.core.navigation.AppNavigator appNavigator, com.paypal.oslo.feature.bnplservicing.api.navigation.PayLaterHubDestination payLaterHubDestination, androidx.compose.runtime.Composer composer, int i) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(payLaterHubDestination, "");
        if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
            androidx.compose.runtime.ComposerKt.traceEventStart(-264913855, i, -1, "com.paypal.oslo.feature.bnplservicing.di.NavigationModule.providesBNPLServicingEntry.<anonymous>.<anonymous> (NavigationModule.kt:82)");
        }
        com.paypal.oslo.feature.bnplservicing.ui.paylaterhub.PayLaterHubScreenKt.PayLaterHubScreen(appNavigator, null, composer, 0, 2);
        if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
            androidx.compose.runtime.ComposerKt.traceEventEnd();
        }
        return kotlin.Unit.INSTANCE;
    }

    /* renamed from: $r8$lambda$OfEB8XLB8-GaXFLIj7EijluvCjQ, reason: not valid java name */
    public static /* synthetic */ kotlin.Unit m12514$r8$lambda$OfEB8XLB8GaXFLIj7EijluvCjQ(final com.paypal.oslo.core.navigation.AppNavigator appNavigator, androidx.navigation3.runtime.EntryProviderScope entryProviderScope) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(entryProviderScope, "");
        final java.util.Map l2Metadata$default = com.paypal.oslo.core.navigation.NavigationMetadataBuildersKt.l2Metadata$default(false, java.lang.Integer.valueOf(com.paypal.oslo.feature.bnplservicing.R.string.feature_bnpl_servicing_make_a_payment_title), false, null, java.lang.Integer.valueOf(com.paypal.oslo.core.navigation.R.string.core_navigation_back_button_description), false, null, null, false, 493, null);
        androidx.compose.runtime.internal.ComposableLambda composableLambdaInstance = androidx.compose.runtime.internal.ComposableLambdaKt.composableLambdaInstance(-1803174511, true, new kotlin.jvm.functions.Function3() { // from class: com.paypal.oslo.feature.bnplservicing.di.NavigationModule$$ExternalSyntheticLambda3
            @Override // kotlin.jvm.functions.Function3
            public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2, java.lang.Object obj3) {
                return com.paypal.oslo.feature.bnplservicing.di.NavigationModule.$r8$lambda$T4XUNzhdLTBnnNlNmLWOIKqB1BI(com.paypal.oslo.core.navigation.AppNavigator.this, (com.paypal.oslo.feature.bnplservicing.navigation.MakeAPaymentDestination) obj, (androidx.compose.runtime.Composer) obj2, ((java.lang.Integer) obj3).intValue());
            }
        });
        entryProviderScope.addEntryProvider(kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(com.paypal.oslo.feature.bnplservicing.navigation.MakeAPaymentDestination.class), (kotlin.jvm.functions.Function1) new kotlin.jvm.functions.Function1<com.paypal.oslo.feature.bnplservicing.navigation.MakeAPaymentDestination, java.lang.Object>() { // from class: com.paypal.oslo.feature.bnplservicing.di.NavigationModule$providesBNPLServicingEntry$lambda$0$$inlined$entry$default$1
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(com.paypal.oslo.feature.bnplservicing.navigation.MakeAPaymentDestination makeAPaymentDestination) {
                return androidx.navigation3.runtime.NavEntryKt.defaultContentKey(makeAPaymentDestination);
            }
        }, (kotlin.jvm.functions.Function1) new kotlin.jvm.functions.Function1<com.paypal.oslo.feature.bnplservicing.navigation.MakeAPaymentDestination, java.util.Map<java.lang.String, ? extends java.lang.Object>>() { // from class: com.paypal.oslo.feature.bnplservicing.di.NavigationModule$providesBNPLServicingEntry$lambda$0$$inlined$entry$default$2
            @Override // kotlin.jvm.functions.Function1
            public final java.util.Map<java.lang.String, ? extends java.lang.Object> invoke(com.paypal.oslo.feature.bnplservicing.navigation.MakeAPaymentDestination makeAPaymentDestination) {
                return l2Metadata$default;
            }
        }, (kotlin.jvm.functions.Function3) composableLambdaInstance);
        final java.util.Map l2Metadata$default2 = com.paypal.oslo.core.navigation.NavigationMetadataBuildersKt.l2Metadata$default(false, null, false, null, null, false, null, null, false, 510, null);
        androidx.compose.runtime.internal.ComposableLambda composableLambdaInstance2 = androidx.compose.runtime.internal.ComposableLambdaKt.composableLambdaInstance(2111882783, true, new kotlin.jvm.functions.Function3() { // from class: com.paypal.oslo.feature.bnplservicing.di.NavigationModule$$ExternalSyntheticLambda4
            @Override // kotlin.jvm.functions.Function3
            public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2, java.lang.Object obj3) {
                return com.paypal.oslo.feature.bnplservicing.di.NavigationModule.m12513$r8$lambda$2ti4i1KWB62QU3v9BPG1rOESNw(com.paypal.oslo.core.navigation.AppNavigator.this, (com.paypal.oslo.feature.bnplservicing.api.navigation.PreQualDestination) obj, (androidx.compose.runtime.Composer) obj2, ((java.lang.Integer) obj3).intValue());
            }
        });
        entryProviderScope.addEntryProvider(kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(com.paypal.oslo.feature.bnplservicing.api.navigation.PreQualDestination.class), (kotlin.jvm.functions.Function1) new kotlin.jvm.functions.Function1<com.paypal.oslo.feature.bnplservicing.api.navigation.PreQualDestination, java.lang.Object>() { // from class: com.paypal.oslo.feature.bnplservicing.di.NavigationModule$providesBNPLServicingEntry$lambda$0$$inlined$entry$default$3
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(com.paypal.oslo.feature.bnplservicing.api.navigation.PreQualDestination preQualDestination) {
                return androidx.navigation3.runtime.NavEntryKt.defaultContentKey(preQualDestination);
            }
        }, (kotlin.jvm.functions.Function1) new kotlin.jvm.functions.Function1<com.paypal.oslo.feature.bnplservicing.api.navigation.PreQualDestination, java.util.Map<java.lang.String, ? extends java.lang.Object>>() { // from class: com.paypal.oslo.feature.bnplservicing.di.NavigationModule$providesBNPLServicingEntry$lambda$0$$inlined$entry$default$4
            @Override // kotlin.jvm.functions.Function1
            public final java.util.Map<java.lang.String, ? extends java.lang.Object> invoke(com.paypal.oslo.feature.bnplservicing.api.navigation.PreQualDestination preQualDestination) {
                return l2Metadata$default2;
            }
        }, (kotlin.jvm.functions.Function3) composableLambdaInstance2);
        final java.util.Map l2Metadata$default3 = com.paypal.oslo.core.navigation.NavigationMetadataBuildersKt.l2Metadata$default(false, null, false, null, null, false, null, null, false, 510, null);
        androidx.compose.runtime.internal.ComposableLambda composableLambdaInstance3 = androidx.compose.runtime.internal.ComposableLambdaKt.composableLambdaInstance(-264913855, true, new kotlin.jvm.functions.Function3() { // from class: com.paypal.oslo.feature.bnplservicing.di.NavigationModule$$ExternalSyntheticLambda5
            @Override // kotlin.jvm.functions.Function3
            public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2, java.lang.Object obj3) {
                return com.paypal.oslo.feature.bnplservicing.di.NavigationModule.$r8$lambda$9V1JErZ7z_8N160vMRvc0qt6loM(com.paypal.oslo.core.navigation.AppNavigator.this, (com.paypal.oslo.feature.bnplservicing.api.navigation.PayLaterHubDestination) obj, (androidx.compose.runtime.Composer) obj2, ((java.lang.Integer) obj3).intValue());
            }
        });
        entryProviderScope.addEntryProvider(kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(com.paypal.oslo.feature.bnplservicing.api.navigation.PayLaterHubDestination.class), (kotlin.jvm.functions.Function1) new kotlin.jvm.functions.Function1<com.paypal.oslo.feature.bnplservicing.api.navigation.PayLaterHubDestination, java.lang.Object>() { // from class: com.paypal.oslo.feature.bnplservicing.di.NavigationModule$providesBNPLServicingEntry$lambda$0$$inlined$entry$default$5
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(com.paypal.oslo.feature.bnplservicing.api.navigation.PayLaterHubDestination payLaterHubDestination) {
                return androidx.navigation3.runtime.NavEntryKt.defaultContentKey(payLaterHubDestination);
            }
        }, (kotlin.jvm.functions.Function1) new kotlin.jvm.functions.Function1<com.paypal.oslo.feature.bnplservicing.api.navigation.PayLaterHubDestination, java.util.Map<java.lang.String, ? extends java.lang.Object>>() { // from class: com.paypal.oslo.feature.bnplservicing.di.NavigationModule$providesBNPLServicingEntry$lambda$0$$inlined$entry$default$6
            @Override // kotlin.jvm.functions.Function1
            public final java.util.Map<java.lang.String, ? extends java.lang.Object> invoke(com.paypal.oslo.feature.bnplservicing.api.navigation.PayLaterHubDestination payLaterHubDestination) {
                return l2Metadata$default3;
            }
        }, (kotlin.jvm.functions.Function3) composableLambdaInstance3);
        final java.util.Map l3Metadata$default = com.paypal.oslo.core.navigation.NavigationMetadataBuildersKt.l3Metadata$default(false, null, false, null, null, false, null, null, com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_SECOND_DEPOSIT_CIRCLE_VALUE, null);
        androidx.compose.runtime.internal.ComposableLambda composableLambdaInstance4 = androidx.compose.runtime.internal.ComposableLambdaKt.composableLambdaInstance(-1283555206, true, new kotlin.jvm.functions.Function3() { // from class: com.paypal.oslo.feature.bnplservicing.di.NavigationModule$$ExternalSyntheticLambda6
            @Override // kotlin.jvm.functions.Function3
            public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2, java.lang.Object obj3) {
                return com.paypal.oslo.feature.bnplservicing.di.NavigationModule.$r8$lambda$jZ473KB5kGAGhM3LbDRrArGMQts(com.paypal.oslo.core.navigation.AppNavigator.this, (com.paypal.oslo.feature.bnplservicing.navigation.PlanDetailsDestination) obj, (androidx.compose.runtime.Composer) obj2, ((java.lang.Integer) obj3).intValue());
            }
        });
        entryProviderScope.addEntryProvider(kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(com.paypal.oslo.feature.bnplservicing.navigation.PlanDetailsDestination.class), (kotlin.jvm.functions.Function1) new kotlin.jvm.functions.Function1<com.paypal.oslo.feature.bnplservicing.navigation.PlanDetailsDestination, java.lang.Object>() { // from class: com.paypal.oslo.feature.bnplservicing.di.NavigationModule$providesBNPLServicingEntry$lambda$0$$inlined$entry$default$7
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(com.paypal.oslo.feature.bnplservicing.navigation.PlanDetailsDestination planDetailsDestination) {
                return androidx.navigation3.runtime.NavEntryKt.defaultContentKey(planDetailsDestination);
            }
        }, (kotlin.jvm.functions.Function1) new kotlin.jvm.functions.Function1<com.paypal.oslo.feature.bnplservicing.navigation.PlanDetailsDestination, java.util.Map<java.lang.String, ? extends java.lang.Object>>() { // from class: com.paypal.oslo.feature.bnplservicing.di.NavigationModule$providesBNPLServicingEntry$lambda$0$$inlined$entry$default$8
            @Override // kotlin.jvm.functions.Function1
            public final java.util.Map<java.lang.String, ? extends java.lang.Object> invoke(com.paypal.oslo.feature.bnplservicing.navigation.PlanDetailsDestination planDetailsDestination) {
                return l3Metadata$default;
            }
        }, (kotlin.jvm.functions.Function3) composableLambdaInstance4);
        final java.util.Map l2Metadata$default4 = com.paypal.oslo.core.navigation.NavigationMetadataBuildersKt.l2Metadata$default(false, java.lang.Integer.valueOf(com.paypal.oslo.feature.bnplservicing.R.string.feature_bnpl_servicing_pay_later_screen_title), false, null, java.lang.Integer.valueOf(com.paypal.oslo.core.navigation.R.string.core_navigation_back_button_description), false, null, null, false, 493, null);
        androidx.compose.runtime.internal.ComposableLambda composableLambdaInstance5 = androidx.compose.runtime.internal.ComposableLambdaKt.composableLambdaInstance(-965370217, true, new kotlin.jvm.functions.Function3() { // from class: com.paypal.oslo.feature.bnplservicing.di.NavigationModule$$ExternalSyntheticLambda7
            @Override // kotlin.jvm.functions.Function3
            public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2, java.lang.Object obj3) {
                return com.paypal.oslo.feature.bnplservicing.di.NavigationModule.m12515$r8$lambda$XigsUzD0zUPaEpTwPBS1MHVOxg(com.paypal.oslo.core.navigation.AppNavigator.this, (com.paypal.oslo.feature.bnplservicing.navigation.PlanListDestination) obj, (androidx.compose.runtime.Composer) obj2, ((java.lang.Integer) obj3).intValue());
            }
        });
        entryProviderScope.addEntryProvider(kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(com.paypal.oslo.feature.bnplservicing.navigation.PlanListDestination.class), (kotlin.jvm.functions.Function1) new kotlin.jvm.functions.Function1<com.paypal.oslo.feature.bnplservicing.navigation.PlanListDestination, java.lang.Object>() { // from class: com.paypal.oslo.feature.bnplservicing.di.NavigationModule$providesBNPLServicingEntry$lambda$0$$inlined$entry$default$9
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(com.paypal.oslo.feature.bnplservicing.navigation.PlanListDestination planListDestination) {
                return androidx.navigation3.runtime.NavEntryKt.defaultContentKey(planListDestination);
            }
        }, (kotlin.jvm.functions.Function1) new kotlin.jvm.functions.Function1<com.paypal.oslo.feature.bnplservicing.navigation.PlanListDestination, java.util.Map<java.lang.String, ? extends java.lang.Object>>() { // from class: com.paypal.oslo.feature.bnplservicing.di.NavigationModule$providesBNPLServicingEntry$lambda$0$$inlined$entry$default$10
            @Override // kotlin.jvm.functions.Function1
            public final java.util.Map<java.lang.String, ? extends java.lang.Object> invoke(com.paypal.oslo.feature.bnplservicing.navigation.PlanListDestination planListDestination) {
                return l2Metadata$default4;
            }
        }, (kotlin.jvm.functions.Function3) composableLambdaInstance5);
        final java.util.Map l2Metadata$default5 = com.paypal.oslo.core.navigation.NavigationMetadataBuildersKt.l2Metadata$default(false, java.lang.Integer.valueOf(com.paypal.oslo.feature.bnplservicing.R.string.feature_bnpl_servicing_pay_later_screen_title), false, null, java.lang.Integer.valueOf(com.paypal.oslo.core.navigation.R.string.core_navigation_back_button_description), false, null, null, false, 493, null);
        androidx.compose.runtime.internal.ComposableLambda composableLambdaInstance6 = androidx.compose.runtime.internal.ComposableLambdaKt.composableLambdaInstance(-1181023497, true, new kotlin.jvm.functions.Function3() { // from class: com.paypal.oslo.feature.bnplservicing.di.NavigationModule$$ExternalSyntheticLambda8
            @Override // kotlin.jvm.functions.Function3
            public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2, java.lang.Object obj3) {
                return com.paypal.oslo.feature.bnplservicing.di.NavigationModule.$r8$lambda$PQxTDjErYoQjbDo0i9WAA8rhiPU(com.paypal.oslo.core.navigation.AppNavigator.this, (com.paypal.oslo.feature.bnplservicing.navigation.PlanListHistoryTabDestination) obj, (androidx.compose.runtime.Composer) obj2, ((java.lang.Integer) obj3).intValue());
            }
        });
        entryProviderScope.addEntryProvider(kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(com.paypal.oslo.feature.bnplservicing.navigation.PlanListHistoryTabDestination.class), (kotlin.jvm.functions.Function1) new kotlin.jvm.functions.Function1<com.paypal.oslo.feature.bnplservicing.navigation.PlanListHistoryTabDestination, java.lang.Object>() { // from class: com.paypal.oslo.feature.bnplservicing.di.NavigationModule$providesBNPLServicingEntry$lambda$0$$inlined$entry$default$11
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(com.paypal.oslo.feature.bnplservicing.navigation.PlanListHistoryTabDestination planListHistoryTabDestination) {
                return androidx.navigation3.runtime.NavEntryKt.defaultContentKey(planListHistoryTabDestination);
            }
        }, (kotlin.jvm.functions.Function1) new kotlin.jvm.functions.Function1<com.paypal.oslo.feature.bnplservicing.navigation.PlanListHistoryTabDestination, java.util.Map<java.lang.String, ? extends java.lang.Object>>() { // from class: com.paypal.oslo.feature.bnplservicing.di.NavigationModule$providesBNPLServicingEntry$lambda$0$$inlined$entry$default$12
            @Override // kotlin.jvm.functions.Function1
            public final java.util.Map<java.lang.String, ? extends java.lang.Object> invoke(com.paypal.oslo.feature.bnplservicing.navigation.PlanListHistoryTabDestination planListHistoryTabDestination) {
                return l2Metadata$default5;
            }
        }, (kotlin.jvm.functions.Function3) composableLambdaInstance6);
        final java.util.Map l2Metadata$default6 = com.paypal.oslo.core.navigation.NavigationMetadataBuildersKt.l2Metadata$default(false, null, false, null, null, false, null, null, false, 510, null);
        androidx.compose.runtime.internal.ComposableLambda composableLambdaInstance7 = androidx.compose.runtime.internal.ComposableLambdaKt.composableLambdaInstance(1201923383, true, new kotlin.jvm.functions.Function3() { // from class: com.paypal.oslo.feature.bnplservicing.di.NavigationModule$$ExternalSyntheticLambda9
            @Override // kotlin.jvm.functions.Function3
            public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2, java.lang.Object obj3) {
                return com.paypal.oslo.feature.bnplservicing.di.NavigationModule.$r8$lambda$lPaCnIG6jgDlzfSXp5ORf6DZ8JY(com.paypal.oslo.core.navigation.AppNavigator.this, (com.paypal.oslo.feature.bnplservicing.navigation.BnplServicingWebView) obj, (androidx.compose.runtime.Composer) obj2, ((java.lang.Integer) obj3).intValue());
            }
        });
        entryProviderScope.addEntryProvider(kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(com.paypal.oslo.feature.bnplservicing.navigation.BnplServicingWebView.class), (kotlin.jvm.functions.Function1) new kotlin.jvm.functions.Function1<com.paypal.oslo.feature.bnplservicing.navigation.BnplServicingWebView, java.lang.Object>() { // from class: com.paypal.oslo.feature.bnplservicing.di.NavigationModule$providesBNPLServicingEntry$lambda$0$$inlined$entry$default$13
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(com.paypal.oslo.feature.bnplservicing.navigation.BnplServicingWebView bnplServicingWebView) {
                return androidx.navigation3.runtime.NavEntryKt.defaultContentKey(bnplServicingWebView);
            }
        }, (kotlin.jvm.functions.Function1) new kotlin.jvm.functions.Function1<com.paypal.oslo.feature.bnplservicing.navigation.BnplServicingWebView, java.util.Map<java.lang.String, ? extends java.lang.Object>>() { // from class: com.paypal.oslo.feature.bnplservicing.di.NavigationModule$providesBNPLServicingEntry$lambda$0$$inlined$entry$default$14
            @Override // kotlin.jvm.functions.Function1
            public final java.util.Map<java.lang.String, ? extends java.lang.Object> invoke(com.paypal.oslo.feature.bnplservicing.navigation.BnplServicingWebView bnplServicingWebView) {
                return l2Metadata$default6;
            }
        }, (kotlin.jvm.functions.Function3) composableLambdaInstance7);
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$PQxTDjErYoQjbDo0i9WAA8rhiPU(com.paypal.oslo.core.navigation.AppNavigator appNavigator, com.paypal.oslo.feature.bnplservicing.navigation.PlanListHistoryTabDestination planListHistoryTabDestination, androidx.compose.runtime.Composer composer, int i) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(planListHistoryTabDestination, "");
        if (composer.shouldExecute((i & 17) != 16, i & 1)) {
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventStart(-1181023497, i, -1, "com.paypal.oslo.feature.bnplservicing.di.NavigationModule.providesBNPLServicingEntry.<anonymous>.<anonymous> (NavigationModule.kt:116)");
            }
            com.paypal.oslo.feature.bnplservicing.ui.planlist.PlanListScreenKt.PlanListScreen(appNavigator, null, 1, composer, 384, 2);
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventEnd();
            }
        } else {
            composer.skipToGroupEnd();
        }
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$T4XUNzhdLTBnnNlNmLWOIKqB1BI(com.paypal.oslo.core.navigation.AppNavigator appNavigator, final com.paypal.oslo.feature.bnplservicing.navigation.MakeAPaymentDestination makeAPaymentDestination, androidx.compose.runtime.Composer composer, int i) {
        int i2;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(makeAPaymentDestination, "");
        if ((i & 6) == 0) {
            i2 = (composer.changed(makeAPaymentDestination) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if (composer.shouldExecute((i2 & 19) != 18, i2 & 1)) {
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventStart(-1803174511, i2, -1, "com.paypal.oslo.feature.bnplservicing.di.NavigationModule.providesBNPLServicingEntry.<anonymous>.<anonymous> (NavigationModule.kt:58)");
            }
            boolean z = (i2 & 14) == 4;
            java.lang.Object rememberedValue = composer.rememberedValue();
            if (z || rememberedValue == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                rememberedValue = new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.bnplservicing.di.NavigationModule$$ExternalSyntheticLambda2
                    @Override // kotlin.jvm.functions.Function1
                    public final java.lang.Object invoke(java.lang.Object obj) {
                        return com.paypal.oslo.feature.bnplservicing.di.NavigationModule.$r8$lambda$ylDAaxaXj44WMHyg67Tw9CO_XWs(com.paypal.oslo.feature.bnplservicing.navigation.MakeAPaymentDestination.this, (com.paypal.oslo.feature.bnplservicing.ui.makepayment.MakeAPaymentViewModel.Factory) obj);
                    }
                };
                composer.updateRememberedValue(rememberedValue);
            }
            kotlin.jvm.functions.Function1 function1 = (kotlin.jvm.functions.Function1) rememberedValue;
            androidx.view.ViewModelStoreOwner current = androidx.view.viewmodel.compose.LocalViewModelStoreOwner.INSTANCE.getCurrent(composer, androidx.view.viewmodel.compose.LocalViewModelStoreOwner.$stable);
            if (current == null) {
                throw new java.lang.IllegalStateException("No ViewModelStoreOwner was provided via LocalViewModelStoreOwner".toString());
            }
            com.paypal.oslo.feature.bnplservicing.ui.makepayment.MakeAPaymentScreenKt.MakeAPaymentScreen(appNavigator, (com.paypal.oslo.feature.bnplservicing.ui.makepayment.MakeAPaymentViewModel) androidx.view.viewmodel.compose.ViewModelKt.viewModel(kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(com.paypal.oslo.feature.bnplservicing.ui.makepayment.MakeAPaymentViewModel.class), current, (java.lang.String) null, androidx.hilt.lifecycle.viewmodel.compose.HiltViewModelKt.createHiltViewModelFactory(current, composer, 0), current instanceof androidx.view.HasDefaultViewModelProviderFactory ? dagger.hilt.android.lifecycle.HiltViewModelExtensions.withCreationCallback(((androidx.view.HasDefaultViewModelProviderFactory) current).getDefaultViewModelCreationExtras(), function1) : dagger.hilt.android.lifecycle.HiltViewModelExtensions.withCreationCallback(androidx.lifecycle.viewmodel.CreationExtras.Empty.INSTANCE, function1), composer, 0, 0), composer, 0, 0);
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventEnd();
            }
        } else {
            composer.skipToGroupEnd();
        }
        return kotlin.Unit.INSTANCE;
    }

    /* renamed from: $r8$lambda$XigsUzD0zUPaEp-TwPBS1MHVOxg, reason: not valid java name */
    public static /* synthetic */ kotlin.Unit m12515$r8$lambda$XigsUzD0zUPaEpTwPBS1MHVOxg(com.paypal.oslo.core.navigation.AppNavigator appNavigator, com.paypal.oslo.feature.bnplservicing.navigation.PlanListDestination planListDestination, androidx.compose.runtime.Composer composer, int i) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(planListDestination, "");
        if (composer.shouldExecute((i & 17) != 16, i & 1)) {
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventStart(-965370217, i, -1, "com.paypal.oslo.feature.bnplservicing.di.NavigationModule.providesBNPLServicingEntry.<anonymous>.<anonymous> (NavigationModule.kt:107)");
            }
            com.paypal.oslo.feature.bnplservicing.ui.planlist.PlanListScreenKt.PlanListScreen(appNavigator, null, 0, composer, 0, 6);
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventEnd();
            }
        } else {
            composer.skipToGroupEnd();
        }
        return kotlin.Unit.INSTANCE;
    }

    /* renamed from: $r8$lambda$c6LvEDPATvR6GVf9-l1QCN2ZRyc, reason: not valid java name */
    public static /* synthetic */ com.paypal.oslo.feature.bnplservicing.ui.plandetails.PlanDetailsViewModel m12516$r8$lambda$c6LvEDPATvR6GVf9l1QCN2ZRyc(com.paypal.oslo.feature.bnplservicing.navigation.PlanDetailsDestination planDetailsDestination, com.paypal.oslo.feature.bnplservicing.ui.plandetails.PlanDetailsViewModel.Factory factory) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(factory, "");
        java.lang.String creditProductId = planDetailsDestination.getCreditProductId();
        java.lang.String source = planDetailsDestination.getSource();
        if (source == null) {
            source = com.paypal.oslo.feature.bnplservicing.common.PayLaterSource.Unknown.INSTANCE.getValue();
        }
        return factory.create(creditProductId, source);
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$jZ473KB5kGAGhM3LbDRrArGMQts(com.paypal.oslo.core.navigation.AppNavigator appNavigator, final com.paypal.oslo.feature.bnplservicing.navigation.PlanDetailsDestination planDetailsDestination, androidx.compose.runtime.Composer composer, int i) {
        int i2;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(planDetailsDestination, "");
        if ((i & 6) == 0) {
            i2 = (composer.changed(planDetailsDestination) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if (composer.shouldExecute((i2 & 19) != 18, i2 & 1)) {
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventStart(-1283555206, i2, -1, "com.paypal.oslo.feature.bnplservicing.di.NavigationModule.providesBNPLServicingEntry.<anonymous>.<anonymous> (NavigationModule.kt:90)");
            }
            boolean z = (i2 & 14) == 4;
            java.lang.Object rememberedValue = composer.rememberedValue();
            if (z || rememberedValue == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                rememberedValue = new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.bnplservicing.di.NavigationModule$$ExternalSyntheticLambda10
                    @Override // kotlin.jvm.functions.Function1
                    public final java.lang.Object invoke(java.lang.Object obj) {
                        return com.paypal.oslo.feature.bnplservicing.di.NavigationModule.m12516$r8$lambda$c6LvEDPATvR6GVf9l1QCN2ZRyc(com.paypal.oslo.feature.bnplservicing.navigation.PlanDetailsDestination.this, (com.paypal.oslo.feature.bnplservicing.ui.plandetails.PlanDetailsViewModel.Factory) obj);
                    }
                };
                composer.updateRememberedValue(rememberedValue);
            }
            kotlin.jvm.functions.Function1 function1 = (kotlin.jvm.functions.Function1) rememberedValue;
            androidx.view.ViewModelStoreOwner current = androidx.view.viewmodel.compose.LocalViewModelStoreOwner.INSTANCE.getCurrent(composer, androidx.view.viewmodel.compose.LocalViewModelStoreOwner.$stable);
            if (current == null) {
                throw new java.lang.IllegalStateException("No ViewModelStoreOwner was provided via LocalViewModelStoreOwner".toString());
            }
            com.paypal.oslo.feature.bnplservicing.ui.plandetails.PlanDetailsScreenKt.PlanDetailsScreen(appNavigator, (com.paypal.oslo.feature.bnplservicing.ui.plandetails.PlanDetailsViewModel) androidx.view.viewmodel.compose.ViewModelKt.viewModel(kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(com.paypal.oslo.feature.bnplservicing.ui.plandetails.PlanDetailsViewModel.class), current, (java.lang.String) null, androidx.hilt.lifecycle.viewmodel.compose.HiltViewModelKt.createHiltViewModelFactory(current, composer, 0), current instanceof androidx.view.HasDefaultViewModelProviderFactory ? dagger.hilt.android.lifecycle.HiltViewModelExtensions.withCreationCallback(((androidx.view.HasDefaultViewModelProviderFactory) current).getDefaultViewModelCreationExtras(), function1) : dagger.hilt.android.lifecycle.HiltViewModelExtensions.withCreationCallback(androidx.lifecycle.viewmodel.CreationExtras.Empty.INSTANCE, function1), composer, 0, 0), composer, 0, 0);
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventEnd();
            }
        } else {
            composer.skipToGroupEnd();
        }
        return kotlin.Unit.INSTANCE;
    }

    /* renamed from: $r8$lambda$lAni8VUKc-7kB1CQOMXd0Hk28Wc, reason: not valid java name */
    public static /* synthetic */ com.paypal.oslo.feature.bnplservicing.ui.webview.BnplServicingWebViewViewModel m12517$r8$lambda$lAni8VUKc7kB1CQOMXd0Hk28Wc(com.paypal.oslo.feature.bnplservicing.navigation.BnplServicingWebView bnplServicingWebView, com.paypal.oslo.feature.bnplservicing.ui.webview.BnplServicingWebViewViewModel.Factory factory) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(factory, "");
        return factory.create(new com.paypal.oslo.feature.bnplservicing.ui.webview.BnplServicingWebViewUIModel(bnplServicingWebView.getUrl(), bnplServicingWebView.getToolbarTitle(), bnplServicingWebView.getRequiresAuth(), bnplServicingWebView.getBypassUrlValidation(), bnplServicingWebView.getShowProgress(), bnplServicingWebView.getShowBackButton()));
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$lPaCnIG6jgDlzfSXp5ORf6DZ8JY(com.paypal.oslo.core.navigation.AppNavigator appNavigator, final com.paypal.oslo.feature.bnplservicing.navigation.BnplServicingWebView bnplServicingWebView, androidx.compose.runtime.Composer composer, int i) {
        int i2;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(bnplServicingWebView, "");
        if ((i & 6) == 0) {
            i2 = (composer.changed(bnplServicingWebView) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if (composer.shouldExecute((i2 & 19) != 18, i2 & 1)) {
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventStart(1201923383, i2, -1, "com.paypal.oslo.feature.bnplservicing.di.NavigationModule.providesBNPLServicingEntry.<anonymous>.<anonymous> (NavigationModule.kt:124)");
            }
            boolean z = (i2 & 14) == 4;
            java.lang.Object rememberedValue = composer.rememberedValue();
            if (z || rememberedValue == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                rememberedValue = new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.bnplservicing.di.NavigationModule$$ExternalSyntheticLambda1
                    @Override // kotlin.jvm.functions.Function1
                    public final java.lang.Object invoke(java.lang.Object obj) {
                        return com.paypal.oslo.feature.bnplservicing.di.NavigationModule.m12517$r8$lambda$lAni8VUKc7kB1CQOMXd0Hk28Wc(com.paypal.oslo.feature.bnplservicing.navigation.BnplServicingWebView.this, (com.paypal.oslo.feature.bnplservicing.ui.webview.BnplServicingWebViewViewModel.Factory) obj);
                    }
                };
                composer.updateRememberedValue(rememberedValue);
            }
            kotlin.jvm.functions.Function1 function1 = (kotlin.jvm.functions.Function1) rememberedValue;
            androidx.view.ViewModelStoreOwner current = androidx.view.viewmodel.compose.LocalViewModelStoreOwner.INSTANCE.getCurrent(composer, androidx.view.viewmodel.compose.LocalViewModelStoreOwner.$stable);
            if (current == null) {
                throw new java.lang.IllegalStateException("No ViewModelStoreOwner was provided via LocalViewModelStoreOwner".toString());
            }
            com.paypal.oslo.feature.bnplservicing.ui.webview.BnplServicingWebViewScreenKt.BnplServicingWebViewScreen(appNavigator, (com.paypal.oslo.feature.bnplservicing.ui.webview.BnplServicingWebViewViewModel) androidx.view.viewmodel.compose.ViewModelKt.viewModel(kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(com.paypal.oslo.feature.bnplservicing.ui.webview.BnplServicingWebViewViewModel.class), current, (java.lang.String) null, androidx.hilt.lifecycle.viewmodel.compose.HiltViewModelKt.createHiltViewModelFactory(current, composer, 0), current instanceof androidx.view.HasDefaultViewModelProviderFactory ? dagger.hilt.android.lifecycle.HiltViewModelExtensions.withCreationCallback(((androidx.view.HasDefaultViewModelProviderFactory) current).getDefaultViewModelCreationExtras(), function1) : dagger.hilt.android.lifecycle.HiltViewModelExtensions.withCreationCallback(androidx.lifecycle.viewmodel.CreationExtras.Empty.INSTANCE, function1), composer, 0, 0), null, null, composer, 0, 12);
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventEnd();
            }
        } else {
            composer.skipToGroupEnd();
        }
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ com.paypal.oslo.feature.bnplservicing.ui.makepayment.MakeAPaymentViewModel $r8$lambda$ylDAaxaXj44WMHyg67Tw9CO_XWs(com.paypal.oslo.feature.bnplservicing.navigation.MakeAPaymentDestination makeAPaymentDestination, com.paypal.oslo.feature.bnplservicing.ui.makepayment.MakeAPaymentViewModel.Factory factory) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(factory, "");
        java.lang.String creditAccountId = makeAPaymentDestination.getCreditAccountId();
        java.lang.String source = makeAPaymentDestination.getSource();
        return factory.create(creditAccountId, source != null ? source : "");
    }
}
