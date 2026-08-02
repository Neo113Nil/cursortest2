package com.paypal.oslo.feature.pools.di;

@kotlin.Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÁ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003JL\u0010\u0011\u001a\u001d\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00010\r\u0012\u0004\u0012\u00020\u000e0\fj\u0002`\u000f¢\u0006\u0002\b\u00102\b\b\u0001\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\nH\u0007¢\u0006\u0004\b\u0011\u0010\u0012"}, d2 = {"Lcom/paypal/oslo/feature/pools/di/NavigationModule;", "", "<init>", "()V", "Landroid/content/Context;", "context", "Lcom/paypal/oslo/core/navigation/AppNavigator;", "navigator", "Lcom/paypal/oslo/feature/activity/api/provider/IActivityWidgetProvider;", "activityWidgetProvider", "Lcom/paypal/oslo/feature/pools/navigation/ErrorNavigationHandler;", "errorNavigationHandler", "Lkotlin/Function1;", "Landroidx/navigation3/runtime/EntryProviderScope;", "", "Lcom/paypal/oslo/core/navigation/EntryProviderInstaller;", "Lkotlin/ExtensionFunctionType;", "providePoolEntryProviderInstaller", "(Landroid/content/Context;Lcom/paypal/oslo/core/navigation/AppNavigator;Lcom/paypal/oslo/feature/activity/api/provider/IActivityWidgetProvider;Lcom/paypal/oslo/feature/pools/navigation/ErrorNavigationHandler;)Lkotlin/jvm/functions/Function1;"}, k = 1, mv = {2, 3, 0}, xi = 48)
@dagger.Module
/* loaded from: classes13.dex */
public final class NavigationModule {
    public static final int $stable = 0;
    public static final com.paypal.oslo.feature.pools.di.NavigationModule INSTANCE = new com.paypal.oslo.feature.pools.di.NavigationModule();

    private NavigationModule() {
    }

    @dagger.Provides
    @dagger.multibindings.IntoSet
    public final kotlin.jvm.functions.Function1<androidx.navigation3.runtime.EntryProviderScope<java.lang.Object>, kotlin.Unit> providePoolEntryProviderInstaller(@dagger.hilt.android.qualifiers.ApplicationContext final android.content.Context context, final com.paypal.oslo.core.navigation.AppNavigator navigator, final com.paypal.oslo.feature.activity.api.provider.IActivityWidgetProvider activityWidgetProvider, final com.paypal.oslo.feature.pools.navigation.ErrorNavigationHandler errorNavigationHandler) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(context, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(navigator, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(activityWidgetProvider, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(errorNavigationHandler, "");
        return new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.pools.di.NavigationModule$$ExternalSyntheticLambda19
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return com.paypal.oslo.feature.pools.di.NavigationModule.m17641$r8$lambda$U6BWltXMXcujqsz52uc22rPlE(context, navigator, activityWidgetProvider, errorNavigationHandler, (androidx.navigation3.runtime.EntryProviderScope) obj);
            }
        };
    }

    /* renamed from: $r8$lambda$-C0OtzbV5yAeKxGKiNZ-ZUU6YDM, reason: not valid java name */
    public static /* synthetic */ kotlin.Unit m17638$r8$lambda$C0OtzbV5yAeKxGKiNZZUU6YDM(com.paypal.oslo.core.navigation.AppNavigator appNavigator) {
        appNavigator.navigate(new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.pools.di.NavigationModule$$ExternalSyntheticLambda8
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return com.paypal.oslo.feature.pools.di.NavigationModule.m17640$r8$lambda$Mi4hWqMqq3FWRrUz1S_dDdhInI((com.paypal.oslo.core.navigation.AppNavigator.NavigationScope) obj);
            }
        });
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$6F1PT3nLS3TVKu80mGXeyG4VGJY(com.paypal.oslo.core.navigation.AppNavigator appNavigator, final com.paypal.oslo.feature.pools.shared.ui.error.ErrorNavArgs errorNavArgs) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(errorNavArgs, "");
        appNavigator.m11575navigateForResultInternaluBl809w(errorNavArgs.m17654getRequestIdQDVFmTU(), kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(com.paypal.oslo.feature.pools.shared.ui.error.navigation.result.ErrorActionNavResult.class).toString(), new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.pools.di.NavigationModule$$ExternalSyntheticLambda12
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return com.paypal.oslo.feature.pools.di.NavigationModule.$r8$lambda$E01S0ulRbDr5JdE3SbzTwYQYOYI(com.paypal.oslo.feature.pools.shared.ui.error.ErrorNavArgs.this, (com.paypal.oslo.core.navigation.AppNavigator.NavigationScope) obj);
            }
        });
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ com.paypal.oslo.feature.pools.ui.pooldetails.PoolDetailsViewModel $r8$lambda$9Rvh5IA30i8vlTuU4rdu0wPj6Jc(com.paypal.oslo.feature.pools.api.navigation.PoolDetailsDestination poolDetailsDestination, com.paypal.oslo.feature.pools.ui.pooldetails.PoolDetailsViewModel.Factory factory) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(factory, "");
        return factory.create(poolDetailsDestination);
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$AhF9_BrGPcU7XREUcRYhRJ3tgSY(com.paypal.oslo.core.navigation.AppNavigator appNavigator) {
        appNavigator.navigate(new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.pools.di.NavigationModule$$ExternalSyntheticLambda3
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return com.paypal.oslo.feature.pools.di.NavigationModule.m17639$r8$lambda$JTFJIXtEeVBL9NdA6C8eKqItjI((com.paypal.oslo.core.navigation.AppNavigator.NavigationScope) obj);
            }
        });
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$E01S0ulRbDr5JdE3SbzTwYQYOYI(com.paypal.oslo.feature.pools.shared.ui.error.ErrorNavArgs errorNavArgs, com.paypal.oslo.core.navigation.AppNavigator.NavigationScope navigationScope) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(navigationScope, "");
        navigationScope.push(new com.paypal.oslo.feature.pools.navigation.ErrorDestination(errorNavArgs.getTitleRes(), errorNavArgs.getPrimaryButtonRes(), errorNavArgs.getDescriptionRes(), (com.paypal.oslo.feature.pools.shared.ui.error.ErrorType) null, (java.lang.Integer) null, 24, (kotlin.jvm.internal.DefaultConstructorMarker) null));
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$HV3lYmSD_hnPlaLsC4DwMT3WpA4(com.paypal.oslo.core.navigation.AppNavigator appNavigator, final com.paypal.oslo.feature.pools.shared.ui.error.ErrorNavArgs errorNavArgs) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(errorNavArgs, "");
        appNavigator.m11575navigateForResultInternaluBl809w(errorNavArgs.m17654getRequestIdQDVFmTU(), kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(com.paypal.oslo.feature.pools.shared.ui.error.navigation.result.ErrorActionNavResult.class).toString(), new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.pools.di.NavigationModule$$ExternalSyntheticLambda9
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return com.paypal.oslo.feature.pools.di.NavigationModule.m17642$r8$lambda$ZolsdPvPHyClcn0pa1Pt2tN_M(com.paypal.oslo.feature.pools.shared.ui.error.ErrorNavArgs.this, (com.paypal.oslo.core.navigation.AppNavigator.NavigationScope) obj);
            }
        });
        return kotlin.Unit.INSTANCE;
    }

    /* renamed from: $r8$lambda$JTF-JIXtEeVBL9NdA6C8eKqItjI, reason: not valid java name */
    public static /* synthetic */ kotlin.Unit m17639$r8$lambda$JTFJIXtEeVBL9NdA6C8eKqItjI(com.paypal.oslo.core.navigation.AppNavigator.NavigationScope navigationScope) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(navigationScope, "");
        navigationScope.goBack();
        return kotlin.Unit.INSTANCE;
    }

    /* renamed from: $r8$lambda$Mi4hWqMqq3FWRrUz1S_d-DdhInI, reason: not valid java name */
    public static /* synthetic */ kotlin.Unit m17640$r8$lambda$Mi4hWqMqq3FWRrUz1S_dDdhInI(com.paypal.oslo.core.navigation.AppNavigator.NavigationScope navigationScope) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(navigationScope, "");
        navigationScope.goBack();
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$RGL0kKauGcmmWwNjojhlIr7wLiQ(com.paypal.oslo.feature.pools.navigation.ErrorNavigationHandler errorNavigationHandler, com.paypal.oslo.core.navigation.AppNavigator appNavigator) {
        errorNavigationHandler.handlePrimaryAction(appNavigator);
        return kotlin.Unit.INSTANCE;
    }

    /* renamed from: $r8$lambda$U6BWltXMXcujqsz5-2uc22-rPlE, reason: not valid java name */
    public static /* synthetic */ kotlin.Unit m17641$r8$lambda$U6BWltXMXcujqsz52uc22rPlE(android.content.Context context, final com.paypal.oslo.core.navigation.AppNavigator appNavigator, final com.paypal.oslo.feature.activity.api.provider.IActivityWidgetProvider iActivityWidgetProvider, final com.paypal.oslo.feature.pools.navigation.ErrorNavigationHandler errorNavigationHandler, androidx.navigation3.runtime.EntryProviderScope entryProviderScope) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(entryProviderScope, "");
        final java.util.Map l2Metadata$default = com.paypal.oslo.core.navigation.NavigationMetadataBuildersKt.l2Metadata$default(false, java.lang.Integer.valueOf(com.paypal.oslo.feature.pools.R.string.feature_pools_list_topbar_title), false, null, null, false, null, null, false, 509, null);
        androidx.compose.runtime.internal.ComposableLambda composableLambdaInstance = androidx.compose.runtime.internal.ComposableLambdaKt.composableLambdaInstance(1914248822, true, new kotlin.jvm.functions.Function3() { // from class: com.paypal.oslo.feature.pools.di.NavigationModule$$ExternalSyntheticLambda21
            @Override // kotlin.jvm.functions.Function3
            public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2, java.lang.Object obj3) {
                return com.paypal.oslo.feature.pools.di.NavigationModule.$r8$lambda$yQNFPRo5U74uAIsDLXHNfWMBrl4(com.paypal.oslo.core.navigation.AppNavigator.this, (com.paypal.oslo.feature.pools.api.navigation.PoolsListDestination) obj, (androidx.compose.runtime.Composer) obj2, ((java.lang.Integer) obj3).intValue());
            }
        });
        entryProviderScope.addEntryProvider(kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(com.paypal.oslo.feature.pools.api.navigation.PoolsListDestination.class), (kotlin.jvm.functions.Function1) new kotlin.jvm.functions.Function1<com.paypal.oslo.feature.pools.api.navigation.PoolsListDestination, java.lang.Object>() { // from class: com.paypal.oslo.feature.pools.di.NavigationModule$providePoolEntryProviderInstaller$lambda$0$$inlined$entry$default$1
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(com.paypal.oslo.feature.pools.api.navigation.PoolsListDestination poolsListDestination) {
                return androidx.navigation3.runtime.NavEntryKt.defaultContentKey(poolsListDestination);
            }
        }, (kotlin.jvm.functions.Function1) new kotlin.jvm.functions.Function1<com.paypal.oslo.feature.pools.api.navigation.PoolsListDestination, java.util.Map<java.lang.String, ? extends java.lang.Object>>() { // from class: com.paypal.oslo.feature.pools.di.NavigationModule$providePoolEntryProviderInstaller$lambda$0$$inlined$entry$default$2
            @Override // kotlin.jvm.functions.Function1
            public final java.util.Map<java.lang.String, ? extends java.lang.Object> invoke(com.paypal.oslo.feature.pools.api.navigation.PoolsListDestination poolsListDestination) {
                return l2Metadata$default;
            }
        }, (kotlin.jvm.functions.Function3) composableLambdaInstance);
        final java.util.Map l2Metadata$default2 = com.paypal.oslo.core.navigation.NavigationMetadataBuildersKt.l2Metadata$default(false, null, false, null, null, false, null, null, false, 511, null);
        androidx.compose.runtime.internal.ComposableLambda composableLambdaInstance2 = androidx.compose.runtime.internal.ComposableLambdaKt.composableLambdaInstance(1225560860, true, new kotlin.jvm.functions.Function3() { // from class: com.paypal.oslo.feature.pools.di.NavigationModule$$ExternalSyntheticLambda22
            @Override // kotlin.jvm.functions.Function3
            public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2, java.lang.Object obj3) {
                return com.paypal.oslo.feature.pools.di.NavigationModule.m17646$r8$lambda$sOBc_luwkGTMfFpFi2f1eaLP5w(com.paypal.oslo.feature.activity.api.provider.IActivityWidgetProvider.this, appNavigator, (com.paypal.oslo.feature.pools.api.navigation.PoolDetailsDestination) obj, (androidx.compose.runtime.Composer) obj2, ((java.lang.Integer) obj3).intValue());
            }
        });
        entryProviderScope.addEntryProvider(kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(com.paypal.oslo.feature.pools.api.navigation.PoolDetailsDestination.class), (kotlin.jvm.functions.Function1) new kotlin.jvm.functions.Function1<com.paypal.oslo.feature.pools.api.navigation.PoolDetailsDestination, java.lang.Object>() { // from class: com.paypal.oslo.feature.pools.di.NavigationModule$providePoolEntryProviderInstaller$lambda$0$$inlined$entry$default$3
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(com.paypal.oslo.feature.pools.api.navigation.PoolDetailsDestination poolDetailsDestination) {
                return androidx.navigation3.runtime.NavEntryKt.defaultContentKey(poolDetailsDestination);
            }
        }, (kotlin.jvm.functions.Function1) new kotlin.jvm.functions.Function1<com.paypal.oslo.feature.pools.api.navigation.PoolDetailsDestination, java.util.Map<java.lang.String, ? extends java.lang.Object>>() { // from class: com.paypal.oslo.feature.pools.di.NavigationModule$providePoolEntryProviderInstaller$lambda$0$$inlined$entry$default$4
            @Override // kotlin.jvm.functions.Function1
            public final java.util.Map<java.lang.String, ? extends java.lang.Object> invoke(com.paypal.oslo.feature.pools.api.navigation.PoolDetailsDestination poolDetailsDestination) {
                return l2Metadata$default2;
            }
        }, (kotlin.jvm.functions.Function3) composableLambdaInstance2);
        final java.util.Map bottomSheetMetadata$default = com.paypal.oslo.core.navigation.NavigationMetadataBuildersKt.bottomSheetMetadata$default(context.getString(com.paypal.oslo.feature.pools.R.string.feature_pools_transfer_modal_title), false, true, false, null, new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.feature.pools.di.NavigationModule$$ExternalSyntheticLambda23
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return com.paypal.oslo.feature.pools.di.NavigationModule.m17648$r8$lambda$zV2Og6LQerFti3k5HbFQ3sC9w(com.paypal.oslo.core.navigation.AppNavigator.this);
            }
        }, new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.feature.pools.di.NavigationModule$$ExternalSyntheticLambda1
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return com.paypal.oslo.feature.pools.di.NavigationModule.$r8$lambda$AhF9_BrGPcU7XREUcRYhRJ3tgSY(com.paypal.oslo.core.navigation.AppNavigator.this);
            }
        }, 18, null);
        kotlin.jvm.functions.Function3<com.paypal.oslo.feature.pools.navigation.PoolDetailsTransferModalDestination, androidx.compose.runtime.Composer, java.lang.Integer, kotlin.Unit> lambda$1789757169$pools_prodRelease = com.paypal.oslo.feature.pools.di.ComposableSingletons$NavigationModuleKt.INSTANCE.getLambda$1789757169$pools_prodRelease();
        entryProviderScope.addEntryProvider(kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(com.paypal.oslo.feature.pools.navigation.PoolDetailsTransferModalDestination.class), (kotlin.jvm.functions.Function1) new kotlin.jvm.functions.Function1<com.paypal.oslo.feature.pools.navigation.PoolDetailsTransferModalDestination, java.lang.Object>() { // from class: com.paypal.oslo.feature.pools.di.NavigationModule$providePoolEntryProviderInstaller$lambda$0$$inlined$entry$default$5
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(com.paypal.oslo.feature.pools.navigation.PoolDetailsTransferModalDestination poolDetailsTransferModalDestination) {
                return androidx.navigation3.runtime.NavEntryKt.defaultContentKey(poolDetailsTransferModalDestination);
            }
        }, (kotlin.jvm.functions.Function1) new kotlin.jvm.functions.Function1<com.paypal.oslo.feature.pools.navigation.PoolDetailsTransferModalDestination, java.util.Map<java.lang.String, ? extends java.lang.Object>>() { // from class: com.paypal.oslo.feature.pools.di.NavigationModule$providePoolEntryProviderInstaller$lambda$0$$inlined$entry$default$6
            @Override // kotlin.jvm.functions.Function1
            public final java.util.Map<java.lang.String, ? extends java.lang.Object> invoke(com.paypal.oslo.feature.pools.navigation.PoolDetailsTransferModalDestination poolDetailsTransferModalDestination) {
                return bottomSheetMetadata$default;
            }
        }, (kotlin.jvm.functions.Function3) lambda$1789757169$pools_prodRelease);
        final java.util.Map l2Metadata$default3 = com.paypal.oslo.core.navigation.NavigationMetadataBuildersKt.l2Metadata$default(false, null, false, null, null, false, null, null, false, 510, null);
        androidx.compose.runtime.internal.ComposableLambda composableLambdaInstance3 = androidx.compose.runtime.internal.ComposableLambdaKt.composableLambdaInstance(-538512228, true, new kotlin.jvm.functions.Function3() { // from class: com.paypal.oslo.feature.pools.di.NavigationModule$$ExternalSyntheticLambda2
            @Override // kotlin.jvm.functions.Function3
            public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2, java.lang.Object obj3) {
                return com.paypal.oslo.feature.pools.di.NavigationModule.$r8$lambda$cOkQ42TpVsB9JBIiFK1mJCapVS8(com.paypal.oslo.feature.pools.navigation.ErrorNavigationHandler.this, appNavigator, (com.paypal.oslo.feature.pools.navigation.ErrorDestination) obj, (androidx.compose.runtime.Composer) obj2, ((java.lang.Integer) obj3).intValue());
            }
        });
        entryProviderScope.addEntryProvider(kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(com.paypal.oslo.feature.pools.navigation.ErrorDestination.class), (kotlin.jvm.functions.Function1) new kotlin.jvm.functions.Function1<com.paypal.oslo.feature.pools.navigation.ErrorDestination, java.lang.Object>() { // from class: com.paypal.oslo.feature.pools.di.NavigationModule$providePoolEntryProviderInstaller$lambda$0$$inlined$entry$default$7
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(com.paypal.oslo.feature.pools.navigation.ErrorDestination errorDestination) {
                return androidx.navigation3.runtime.NavEntryKt.defaultContentKey(errorDestination);
            }
        }, (kotlin.jvm.functions.Function1) new kotlin.jvm.functions.Function1<com.paypal.oslo.feature.pools.navigation.ErrorDestination, java.util.Map<java.lang.String, ? extends java.lang.Object>>() { // from class: com.paypal.oslo.feature.pools.di.NavigationModule$providePoolEntryProviderInstaller$lambda$0$$inlined$entry$default$8
            @Override // kotlin.jvm.functions.Function1
            public final java.util.Map<java.lang.String, ? extends java.lang.Object> invoke(com.paypal.oslo.feature.pools.navigation.ErrorDestination errorDestination) {
                return l2Metadata$default3;
            }
        }, (kotlin.jvm.functions.Function3) composableLambdaInstance3);
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$UKhY8eW38qQXfoKi3sKXKpZEuV4(java.lang.String str, com.paypal.oslo.feature.pools.domain.models.PoolAmount poolAmount, com.paypal.oslo.core.navigation.AppNavigator.NavigationScope navigationScope) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(navigationScope, "");
        navigationScope.push(new com.paypal.oslo.feature.pools.navigation.PoolDetailsTransferModalDestination(str, poolAmount));
        return kotlin.Unit.INSTANCE;
    }

    /* renamed from: $r8$lambda$Z-olsdPvPHyClcn0pa1P-t2tN_M, reason: not valid java name */
    public static /* synthetic */ kotlin.Unit m17642$r8$lambda$ZolsdPvPHyClcn0pa1Pt2tN_M(com.paypal.oslo.feature.pools.shared.ui.error.ErrorNavArgs errorNavArgs, com.paypal.oslo.core.navigation.AppNavigator.NavigationScope navigationScope) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(navigationScope, "");
        navigationScope.push(new com.paypal.oslo.feature.pools.navigation.ErrorDestination(errorNavArgs.getTitleRes(), errorNavArgs.getPrimaryButtonRes(), (java.lang.Integer) null, com.paypal.oslo.feature.pools.shared.ui.error.ErrorType.LOAD_DATA, java.lang.Integer.valueOf(com.paypal.oslo.feature.pools.R.string.feature_pools_list_topbar_title), 4, (kotlin.jvm.internal.DefaultConstructorMarker) null));
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$ZHtyPz2FbPtSdmPbG2D4AeaF4UQ(com.paypal.oslo.feature.pools.navigation.ErrorNavigationHandler errorNavigationHandler, com.paypal.oslo.core.navigation.AppNavigator appNavigator) {
        errorNavigationHandler.handleDismiss(appNavigator);
        return kotlin.Unit.INSTANCE;
    }

    /* renamed from: $r8$lambda$_DEgpgNWAu-gyD5t5Tv67_I8TSw, reason: not valid java name */
    public static /* synthetic */ kotlin.Unit m17643$r8$lambda$_DEgpgNWAugyD5t5Tv67_I8TSw(com.paypal.oslo.core.navigation.AppNavigator appNavigator, final java.lang.String str, final com.paypal.oslo.feature.pools.domain.models.PoolAmount poolAmount) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(poolAmount, "");
        appNavigator.navigate(new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.pools.di.NavigationModule$$ExternalSyntheticLambda4
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return com.paypal.oslo.feature.pools.di.NavigationModule.$r8$lambda$UKhY8eW38qQXfoKi3sKXKpZEuV4(str, poolAmount, (com.paypal.oslo.core.navigation.AppNavigator.NavigationScope) obj);
            }
        });
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$cOkQ42TpVsB9JBIiFK1mJCapVS8(final com.paypal.oslo.feature.pools.navigation.ErrorNavigationHandler errorNavigationHandler, final com.paypal.oslo.core.navigation.AppNavigator appNavigator, com.paypal.oslo.feature.pools.navigation.ErrorDestination errorDestination, androidx.compose.runtime.Composer composer, int i) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(errorDestination, "");
        if ((i & 6) == 0) {
            i |= composer.changed(errorDestination) ? 4 : 2;
        }
        if (composer.shouldExecute((i & 19) != 18, i & 1)) {
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventStart(-538512228, i, -1, "com.paypal.oslo.feature.pools.di.NavigationModule.providePoolEntryProviderInstaller.<anonymous>.<anonymous> (NavigationModule.kt:152)");
            }
            com.paypal.oslo.feature.pools.shared.ui.error.ErrorScreenConfig errorScreenConfig = com.paypal.oslo.feature.pools.extensions.ErrorDestinationExtensionsKt.toErrorScreenConfig(errorDestination);
            boolean changed = composer.changed(errorNavigationHandler);
            boolean changed2 = composer.changed(appNavigator);
            java.lang.Object rememberedValue = composer.rememberedValue();
            if ((changed | changed2) || rememberedValue == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                rememberedValue = new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.feature.pools.di.NavigationModule$$ExternalSyntheticLambda5
                    @Override // kotlin.jvm.functions.Function0
                    public final java.lang.Object invoke() {
                        return com.paypal.oslo.feature.pools.di.NavigationModule.$r8$lambda$m9tfG6zEF0afHqXknRlwh37qRPE(com.paypal.oslo.feature.pools.navigation.ErrorNavigationHandler.this, appNavigator);
                    }
                };
                composer.updateRememberedValue(rememberedValue);
            }
            kotlin.jvm.functions.Function0 function0 = (kotlin.jvm.functions.Function0) rememberedValue;
            boolean changed3 = composer.changed(errorNavigationHandler);
            boolean changed4 = composer.changed(appNavigator);
            java.lang.Object rememberedValue2 = composer.rememberedValue();
            if ((changed3 | changed4) || rememberedValue2 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                rememberedValue2 = new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.feature.pools.di.NavigationModule$$ExternalSyntheticLambda6
                    @Override // kotlin.jvm.functions.Function0
                    public final java.lang.Object invoke() {
                        return com.paypal.oslo.feature.pools.di.NavigationModule.$r8$lambda$ZHtyPz2FbPtSdmPbG2D4AeaF4UQ(com.paypal.oslo.feature.pools.navigation.ErrorNavigationHandler.this, appNavigator);
                    }
                };
                composer.updateRememberedValue(rememberedValue2);
            }
            kotlin.jvm.functions.Function0 function02 = (kotlin.jvm.functions.Function0) rememberedValue2;
            boolean changed5 = composer.changed(errorNavigationHandler);
            boolean changed6 = composer.changed(appNavigator);
            java.lang.Object rememberedValue3 = composer.rememberedValue();
            if ((changed5 | changed6) || rememberedValue3 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                rememberedValue3 = new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.feature.pools.di.NavigationModule$$ExternalSyntheticLambda7
                    @Override // kotlin.jvm.functions.Function0
                    public final java.lang.Object invoke() {
                        return com.paypal.oslo.feature.pools.di.NavigationModule.$r8$lambda$RGL0kKauGcmmWwNjojhlIr7wLiQ(com.paypal.oslo.feature.pools.navigation.ErrorNavigationHandler.this, appNavigator);
                    }
                };
                composer.updateRememberedValue(rememberedValue3);
            }
            com.paypal.oslo.feature.pools.shared.ui.error.ErrorScreenKt.ErrorScreen(errorScreenConfig, null, function0, function02, (kotlin.jvm.functions.Function0) rememberedValue3, composer, 0, 2);
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventEnd();
            }
        } else {
            composer.skipToGroupEnd();
        }
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$m9tfG6zEF0afHqXknRlwh37qRPE(com.paypal.oslo.feature.pools.navigation.ErrorNavigationHandler errorNavigationHandler, com.paypal.oslo.core.navigation.AppNavigator appNavigator) {
        errorNavigationHandler.handleDismiss(appNavigator);
        return kotlin.Unit.INSTANCE;
    }

    /* renamed from: $r8$lambda$mmsrCQcUKJq-N-zfBPOXqrO9iQg, reason: not valid java name */
    public static /* synthetic */ kotlin.Unit m17644$r8$lambda$mmsrCQcUKJqNzfBPOXqrO9iQg(com.paypal.oslo.core.navigation.AppNavigator appNavigator) {
        appNavigator.navigate(new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.pools.di.NavigationModule$$ExternalSyntheticLambda20
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return com.paypal.oslo.feature.pools.di.NavigationModule.m17645$r8$lambda$moD4LobhODjfjaCz6ltw51SdgQ((com.paypal.oslo.core.navigation.AppNavigator.NavigationScope) obj);
            }
        });
        return kotlin.Unit.INSTANCE;
    }

    /* renamed from: $r8$lambda$moD4LobhODj-fjaCz6ltw51SdgQ, reason: not valid java name */
    public static /* synthetic */ kotlin.Unit m17645$r8$lambda$moD4LobhODjfjaCz6ltw51SdgQ(com.paypal.oslo.core.navigation.AppNavigator.NavigationScope navigationScope) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(navigationScope, "");
        navigationScope.goBack();
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$nIRqWCK7o83QlLZFbUQ2WFIfVkY(com.paypal.oslo.core.navigation.AppNavigator.NavigationScope navigationScope) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(navigationScope, "");
        navigationScope.goBack();
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$nNjVvXM8GPMHSmNQQzaDhB0vKZE(java.lang.String str, java.lang.String str2, com.paypal.oslo.feature.pools.domain.models.PoolUserRole poolUserRole, com.paypal.oslo.core.navigation.AppNavigator.NavigationScope navigationScope) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(navigationScope, "");
        navigationScope.push(new com.paypal.oslo.feature.pools.api.navigation.PoolDetailsDestination(str, str2, poolUserRole.getRawValue()));
        return kotlin.Unit.INSTANCE;
    }

    /* renamed from: $r8$lambda$sOBc_luwkGTMfFpFi2f1ea-LP5w, reason: not valid java name */
    public static /* synthetic */ kotlin.Unit m17646$r8$lambda$sOBc_luwkGTMfFpFi2f1eaLP5w(com.paypal.oslo.feature.activity.api.provider.IActivityWidgetProvider iActivityWidgetProvider, final com.paypal.oslo.core.navigation.AppNavigator appNavigator, final com.paypal.oslo.feature.pools.api.navigation.PoolDetailsDestination poolDetailsDestination, androidx.compose.runtime.Composer composer, int i) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(poolDetailsDestination, "");
        if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
            androidx.compose.runtime.ComposerKt.traceEventStart(1225560860, i, -1, "com.paypal.oslo.feature.pools.di.NavigationModule.providePoolEntryProviderInstaller.<anonymous>.<anonymous> (NavigationModule.kt:100)");
        }
        boolean changedInstance = composer.changedInstance(poolDetailsDestination);
        java.lang.Object rememberedValue = composer.rememberedValue();
        if (changedInstance || rememberedValue == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
            rememberedValue = new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.pools.di.NavigationModule$$ExternalSyntheticLambda11
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj) {
                    return com.paypal.oslo.feature.pools.di.NavigationModule.$r8$lambda$9Rvh5IA30i8vlTuU4rdu0wPj6Jc(com.paypal.oslo.feature.pools.api.navigation.PoolDetailsDestination.this, (com.paypal.oslo.feature.pools.ui.pooldetails.PoolDetailsViewModel.Factory) obj);
                }
            };
            composer.updateRememberedValue(rememberedValue);
        }
        kotlin.jvm.functions.Function1 function1 = (kotlin.jvm.functions.Function1) rememberedValue;
        androidx.view.ViewModelStoreOwner current = androidx.view.viewmodel.compose.LocalViewModelStoreOwner.INSTANCE.getCurrent(composer, androidx.view.viewmodel.compose.LocalViewModelStoreOwner.$stable);
        if (current == null) {
            throw new java.lang.IllegalStateException("No ViewModelStoreOwner was provided via LocalViewModelStoreOwner".toString());
        }
        com.paypal.oslo.feature.pools.ui.pooldetails.PoolDetailsViewModel poolDetailsViewModel = (com.paypal.oslo.feature.pools.ui.pooldetails.PoolDetailsViewModel) androidx.view.viewmodel.compose.ViewModelKt.viewModel(kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(com.paypal.oslo.feature.pools.ui.pooldetails.PoolDetailsViewModel.class), current, (java.lang.String) null, androidx.hilt.lifecycle.viewmodel.compose.HiltViewModelKt.createHiltViewModelFactory(current, composer, 0), current instanceof androidx.view.HasDefaultViewModelProviderFactory ? dagger.hilt.android.lifecycle.HiltViewModelExtensions.withCreationCallback(((androidx.view.HasDefaultViewModelProviderFactory) current).getDefaultViewModelCreationExtras(), function1) : dagger.hilt.android.lifecycle.HiltViewModelExtensions.withCreationCallback(androidx.lifecycle.viewmodel.CreationExtras.Empty.INSTANCE, function1), composer, 0, 0);
        com.paypal.oslo.core.navigation.result.NavResultManager navResultManager = appNavigator.getNavResultManager();
        androidx.compose.ui.Modifier displayCutoutPadding = androidx.compose.foundation.layout.WindowInsetsPadding_androidKt.displayCutoutPadding(androidx.compose.foundation.layout.WindowInsetsPadding_androidKt.statusBarsPadding(androidx.compose.foundation.layout.WindowInsetsPadding_androidKt.navigationBarsPadding(androidx.compose.ui.Modifier.INSTANCE)));
        boolean changed = composer.changed(appNavigator);
        java.lang.Object rememberedValue2 = composer.rememberedValue();
        if (changed || rememberedValue2 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
            rememberedValue2 = new kotlin.jvm.functions.Function2() { // from class: com.paypal.oslo.feature.pools.di.NavigationModule$$ExternalSyntheticLambda16
                @Override // kotlin.jvm.functions.Function2
                public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                    return com.paypal.oslo.feature.pools.di.NavigationModule.m17643$r8$lambda$_DEgpgNWAugyD5t5Tv67_I8TSw(com.paypal.oslo.core.navigation.AppNavigator.this, (java.lang.String) obj, (com.paypal.oslo.feature.pools.domain.models.PoolAmount) obj2);
                }
            };
            composer.updateRememberedValue(rememberedValue2);
        }
        kotlin.jvm.functions.Function2 function2 = (kotlin.jvm.functions.Function2) rememberedValue2;
        boolean changed2 = composer.changed(appNavigator);
        java.lang.Object rememberedValue3 = composer.rememberedValue();
        if (changed2 || rememberedValue3 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
            rememberedValue3 = new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.pools.di.NavigationModule$$ExternalSyntheticLambda17
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj) {
                    return com.paypal.oslo.feature.pools.di.NavigationModule.$r8$lambda$6F1PT3nLS3TVKu80mGXeyG4VGJY(com.paypal.oslo.core.navigation.AppNavigator.this, (com.paypal.oslo.feature.pools.shared.ui.error.ErrorNavArgs) obj);
                }
            };
            composer.updateRememberedValue(rememberedValue3);
        }
        kotlin.jvm.functions.Function1 function12 = (kotlin.jvm.functions.Function1) rememberedValue3;
        boolean changed3 = composer.changed(appNavigator);
        java.lang.Object rememberedValue4 = composer.rememberedValue();
        if (changed3 || rememberedValue4 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
            rememberedValue4 = new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.feature.pools.di.NavigationModule$$ExternalSyntheticLambda18
                @Override // kotlin.jvm.functions.Function0
                public final java.lang.Object invoke() {
                    return com.paypal.oslo.feature.pools.di.NavigationModule.m17638$r8$lambda$C0OtzbV5yAeKxGKiNZZUU6YDM(com.paypal.oslo.core.navigation.AppNavigator.this);
                }
            };
            composer.updateRememberedValue(rememberedValue4);
        }
        com.paypal.oslo.feature.pools.ui.pooldetails.PoolDetailsScreenKt.PoolDetailsScreen(iActivityWidgetProvider, navResultManager, displayCutoutPadding, poolDetailsViewModel, function2, function12, (kotlin.jvm.functions.Function0) rememberedValue4, composer, com.paypal.oslo.core.navigation.result.NavResultManager.$stable << 3, 0);
        if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
            androidx.compose.runtime.ComposerKt.traceEventEnd();
        }
        return kotlin.Unit.INSTANCE;
    }

    /* renamed from: $r8$lambda$xUuiOz6JAfexO6U7Ygn-Z9KNIaw, reason: not valid java name */
    public static /* synthetic */ kotlin.Unit m17647$r8$lambda$xUuiOz6JAfexO6U7YgnZ9KNIaw(com.paypal.oslo.core.navigation.AppNavigator appNavigator, final java.lang.String str, final java.lang.String str2, final com.paypal.oslo.feature.pools.domain.models.PoolUserRole poolUserRole) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str2, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(poolUserRole, "");
        appNavigator.navigate(new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.pools.di.NavigationModule$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return com.paypal.oslo.feature.pools.di.NavigationModule.$r8$lambda$nNjVvXM8GPMHSmNQQzaDhB0vKZE(str, str2, poolUserRole, (com.paypal.oslo.core.navigation.AppNavigator.NavigationScope) obj);
            }
        });
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$yQNFPRo5U74uAIsDLXHNfWMBrl4(final com.paypal.oslo.core.navigation.AppNavigator appNavigator, com.paypal.oslo.feature.pools.api.navigation.PoolsListDestination poolsListDestination, androidx.compose.runtime.Composer composer, int i) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(poolsListDestination, "");
        if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
            androidx.compose.runtime.ComposerKt.traceEventStart(1914248822, i, -1, "com.paypal.oslo.feature.pools.di.NavigationModule.providePoolEntryProviderInstaller.<anonymous>.<anonymous> (NavigationModule.kt:71)");
        }
        com.paypal.oslo.core.navigation.result.NavResultManager navResultManager = appNavigator.getNavResultManager();
        androidx.compose.ui.Modifier displayCutoutPadding = androidx.compose.foundation.layout.WindowInsetsPadding_androidKt.displayCutoutPadding(androidx.compose.foundation.layout.WindowInsetsPadding_androidKt.statusBarsPadding(androidx.compose.foundation.layout.WindowInsetsPadding_androidKt.navigationBarsPadding(androidx.compose.ui.Modifier.INSTANCE)));
        boolean changed = composer.changed(appNavigator);
        java.lang.Object rememberedValue = composer.rememberedValue();
        if (changed || rememberedValue == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
            rememberedValue = new kotlin.jvm.functions.Function3() { // from class: com.paypal.oslo.feature.pools.di.NavigationModule$$ExternalSyntheticLambda13
                @Override // kotlin.jvm.functions.Function3
                public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2, java.lang.Object obj3) {
                    return com.paypal.oslo.feature.pools.di.NavigationModule.m17647$r8$lambda$xUuiOz6JAfexO6U7YgnZ9KNIaw(com.paypal.oslo.core.navigation.AppNavigator.this, (java.lang.String) obj, (java.lang.String) obj2, (com.paypal.oslo.feature.pools.domain.models.PoolUserRole) obj3);
                }
            };
            composer.updateRememberedValue(rememberedValue);
        }
        kotlin.jvm.functions.Function3 function3 = (kotlin.jvm.functions.Function3) rememberedValue;
        boolean changed2 = composer.changed(appNavigator);
        java.lang.Object rememberedValue2 = composer.rememberedValue();
        if (changed2 || rememberedValue2 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
            rememberedValue2 = new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.pools.di.NavigationModule$$ExternalSyntheticLambda14
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj) {
                    return com.paypal.oslo.feature.pools.di.NavigationModule.$r8$lambda$HV3lYmSD_hnPlaLsC4DwMT3WpA4(com.paypal.oslo.core.navigation.AppNavigator.this, (com.paypal.oslo.feature.pools.shared.ui.error.ErrorNavArgs) obj);
                }
            };
            composer.updateRememberedValue(rememberedValue2);
        }
        kotlin.jvm.functions.Function1 function1 = (kotlin.jvm.functions.Function1) rememberedValue2;
        boolean changed3 = composer.changed(appNavigator);
        java.lang.Object rememberedValue3 = composer.rememberedValue();
        if (changed3 || rememberedValue3 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
            rememberedValue3 = new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.feature.pools.di.NavigationModule$$ExternalSyntheticLambda15
                @Override // kotlin.jvm.functions.Function0
                public final java.lang.Object invoke() {
                    return com.paypal.oslo.feature.pools.di.NavigationModule.m17644$r8$lambda$mmsrCQcUKJqNzfBPOXqrO9iQg(com.paypal.oslo.core.navigation.AppNavigator.this);
                }
            };
            composer.updateRememberedValue(rememberedValue3);
        }
        com.paypal.oslo.feature.pools.ui.poolslist.PoolsListScreenKt.PoolsListScreen(navResultManager, displayCutoutPadding, null, function3, function1, (kotlin.jvm.functions.Function0) rememberedValue3, composer, com.paypal.oslo.core.navigation.result.NavResultManager.$stable, 4);
        if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
            androidx.compose.runtime.ComposerKt.traceEventEnd();
        }
        return kotlin.Unit.INSTANCE;
    }

    /* renamed from: $r8$lambda$zV2Og6LQerFti3-k5Hb-FQ3sC9w, reason: not valid java name */
    public static /* synthetic */ kotlin.Unit m17648$r8$lambda$zV2Og6LQerFti3k5HbFQ3sC9w(com.paypal.oslo.core.navigation.AppNavigator appNavigator) {
        appNavigator.navigate(new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.pools.di.NavigationModule$$ExternalSyntheticLambda10
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return com.paypal.oslo.feature.pools.di.NavigationModule.$r8$lambda$nIRqWCK7o83QlLZFbUQ2WFIfVkY((com.paypal.oslo.core.navigation.AppNavigator.NavigationScope) obj);
            }
        });
        return kotlin.Unit.INSTANCE;
    }
}
