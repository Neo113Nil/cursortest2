package com.paypal.oslo.app.navigation.di;

@kotlin.Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J2\u0010\u000b\u001a\u001d\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00010\u0007\u0012\u0004\u0012\u00020\b0\u0006j\u0002`\t¢\u0006\u0002\b\n2\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u000b\u0010\f"}, d2 = {"Lcom/paypal/oslo/app/navigation/di/DemoModule;", "", "<init>", "()V", "Lcom/paypal/oslo/core/navigation/AppNavigator;", "navigator", "Lkotlin/Function1;", "Landroidx/navigation3/runtime/EntryProviderScope;", "", "Lcom/paypal/oslo/core/navigation/EntryProviderInstaller;", "Lkotlin/ExtensionFunctionType;", "provideL1EntryProviderInstaller", "(Lcom/paypal/oslo/core/navigation/AppNavigator;)Lkotlin/jvm/functions/Function1;"}, k = 1, mv = {2, 3, 0}, xi = 48)
@dagger.Module
/* loaded from: classes10.dex */
public final class DemoModule {
    public static final int $stable = 0;
    public static final com.paypal.oslo.app.navigation.di.DemoModule INSTANCE = new com.paypal.oslo.app.navigation.di.DemoModule();

    private DemoModule() {
    }

    @dagger.Provides
    @dagger.multibindings.IntoSet
    public final kotlin.jvm.functions.Function1<androidx.navigation3.runtime.EntryProviderScope<java.lang.Object>, kotlin.Unit> provideL1EntryProviderInstaller(final com.paypal.oslo.core.navigation.AppNavigator navigator) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(navigator, "");
        return new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.app.navigation.di.DemoModule$$ExternalSyntheticLambda3
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return com.paypal.oslo.app.navigation.di.DemoModule.$r8$lambda$BIa95pckVo_auIu_gWPHv6SfwSk(com.paypal.oslo.core.navigation.AppNavigator.this, (androidx.navigation3.runtime.EntryProviderScope) obj);
            }
        };
    }

    /* renamed from: $r8$lambda$9fSrqnntlcvZ1dE4oXsN7im-2Jk, reason: not valid java name */
    public static /* synthetic */ kotlin.Unit m11077$r8$lambda$9fSrqnntlcvZ1dE4oXsN7im2Jk(com.paypal.oslo.core.navigation.AppNavigator appNavigator, com.paypal.oslo.core.navigation.MeSubsDestination meSubsDestination, androidx.compose.runtime.Composer composer, int i) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(meSubsDestination, "");
        if ((i & 6) == 0) {
            i |= (i & 8) == 0 ? composer.changed(meSubsDestination) : composer.changedInstance(meSubsDestination) ? 4 : 2;
        }
        if (composer.shouldExecute((i & 19) != 18, i & 1)) {
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventStart(38054787, i, -1, "com.paypal.oslo.app.navigation.di.DemoModule.provideL1EntryProviderInstaller.<anonymous>.<anonymous> (DemoModule.kt:71)");
            }
            com.paypal.oslo.app.navigation.DemoScreensKt.Me(meSubsDestination, appNavigator, composer, (i & 14) | com.paypal.oslo.core.navigation.MeSubsDestination.$stable);
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventEnd();
            }
        } else {
            composer.skipToGroupEnd();
        }
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$BIa95pckVo_auIu_gWPHv6SfwSk(final com.paypal.oslo.core.navigation.AppNavigator appNavigator, androidx.navigation3.runtime.EntryProviderScope entryProviderScope) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(entryProviderScope, "");
        final java.util.Map<java.lang.String, java.lang.Object> l1TabbedMetadata = com.paypal.oslo.core.navigation.NavigationMetadataBuildersKt.l1TabbedMetadata("Me");
        androidx.compose.runtime.internal.ComposableLambda composableLambdaInstance = androidx.compose.runtime.internal.ComposableLambdaKt.composableLambdaInstance(-2064460603, true, new kotlin.jvm.functions.Function3() { // from class: com.paypal.oslo.app.navigation.di.DemoModule$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function3
            public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2, java.lang.Object obj3) {
                return com.paypal.oslo.app.navigation.di.DemoModule.m11078$r8$lambda$UFMaZwOhEgkWI1fQlxHq8Y900s(com.paypal.oslo.core.navigation.AppNavigator.this, (com.paypal.oslo.core.navigation.MeWalletDestination) obj, (androidx.compose.runtime.Composer) obj2, ((java.lang.Integer) obj3).intValue());
            }
        });
        entryProviderScope.addEntryProvider(kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(com.paypal.oslo.core.navigation.MeWalletDestination.class), (kotlin.jvm.functions.Function1) new kotlin.jvm.functions.Function1<com.paypal.oslo.core.navigation.MeWalletDestination, java.lang.Object>() { // from class: com.paypal.oslo.app.navigation.di.DemoModule$provideL1EntryProviderInstaller$lambda$0$$inlined$entry$default$1
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(com.paypal.oslo.core.navigation.MeWalletDestination meWalletDestination) {
                return androidx.navigation3.runtime.NavEntryKt.defaultContentKey(meWalletDestination);
            }
        }, (kotlin.jvm.functions.Function1) new kotlin.jvm.functions.Function1<com.paypal.oslo.core.navigation.MeWalletDestination, java.util.Map<java.lang.String, ? extends java.lang.Object>>() { // from class: com.paypal.oslo.app.navigation.di.DemoModule$provideL1EntryProviderInstaller$lambda$0$$inlined$entry$default$2
            @Override // kotlin.jvm.functions.Function1
            public final java.util.Map<java.lang.String, ? extends java.lang.Object> invoke(com.paypal.oslo.core.navigation.MeWalletDestination meWalletDestination) {
                return l1TabbedMetadata;
            }
        }, (kotlin.jvm.functions.Function3) composableLambdaInstance);
        final java.util.Map<java.lang.String, java.lang.Object> l1TabbedMetadata2 = com.paypal.oslo.core.navigation.NavigationMetadataBuildersKt.l1TabbedMetadata("Me");
        androidx.compose.runtime.internal.ComposableLambda composableLambdaInstance2 = androidx.compose.runtime.internal.ComposableLambdaKt.composableLambdaInstance(-2041003674, true, new kotlin.jvm.functions.Function3() { // from class: com.paypal.oslo.app.navigation.di.DemoModule$$ExternalSyntheticLambda1
            @Override // kotlin.jvm.functions.Function3
            public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2, java.lang.Object obj3) {
                return com.paypal.oslo.app.navigation.di.DemoModule.$r8$lambda$OAVmSaEMN1RxEOXOTt_J_K71ISw(com.paypal.oslo.core.navigation.AppNavigator.this, (com.paypal.oslo.core.navigation.MeActivityDestination) obj, (androidx.compose.runtime.Composer) obj2, ((java.lang.Integer) obj3).intValue());
            }
        });
        entryProviderScope.addEntryProvider(kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(com.paypal.oslo.core.navigation.MeActivityDestination.class), (kotlin.jvm.functions.Function1) new kotlin.jvm.functions.Function1<com.paypal.oslo.core.navigation.MeActivityDestination, java.lang.Object>() { // from class: com.paypal.oslo.app.navigation.di.DemoModule$provideL1EntryProviderInstaller$lambda$0$$inlined$entry$default$3
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(com.paypal.oslo.core.navigation.MeActivityDestination meActivityDestination) {
                return androidx.navigation3.runtime.NavEntryKt.defaultContentKey(meActivityDestination);
            }
        }, (kotlin.jvm.functions.Function1) new kotlin.jvm.functions.Function1<com.paypal.oslo.core.navigation.MeActivityDestination, java.util.Map<java.lang.String, ? extends java.lang.Object>>() { // from class: com.paypal.oslo.app.navigation.di.DemoModule$provideL1EntryProviderInstaller$lambda$0$$inlined$entry$default$4
            @Override // kotlin.jvm.functions.Function1
            public final java.util.Map<java.lang.String, ? extends java.lang.Object> invoke(com.paypal.oslo.core.navigation.MeActivityDestination meActivityDestination) {
                return l1TabbedMetadata2;
            }
        }, (kotlin.jvm.functions.Function3) composableLambdaInstance2);
        final java.util.Map<java.lang.String, java.lang.Object> l1TabbedMetadata3 = com.paypal.oslo.core.navigation.NavigationMetadataBuildersKt.l1TabbedMetadata("Me");
        androidx.compose.runtime.internal.ComposableLambda composableLambdaInstance3 = androidx.compose.runtime.internal.ComposableLambdaKt.composableLambdaInstance(38054787, true, new kotlin.jvm.functions.Function3() { // from class: com.paypal.oslo.app.navigation.di.DemoModule$$ExternalSyntheticLambda2
            @Override // kotlin.jvm.functions.Function3
            public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2, java.lang.Object obj3) {
                return com.paypal.oslo.app.navigation.di.DemoModule.m11077$r8$lambda$9fSrqnntlcvZ1dE4oXsN7im2Jk(com.paypal.oslo.core.navigation.AppNavigator.this, (com.paypal.oslo.core.navigation.MeSubsDestination) obj, (androidx.compose.runtime.Composer) obj2, ((java.lang.Integer) obj3).intValue());
            }
        });
        entryProviderScope.addEntryProvider(kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(com.paypal.oslo.core.navigation.MeSubsDestination.class), (kotlin.jvm.functions.Function1) new kotlin.jvm.functions.Function1<com.paypal.oslo.core.navigation.MeSubsDestination, java.lang.Object>() { // from class: com.paypal.oslo.app.navigation.di.DemoModule$provideL1EntryProviderInstaller$lambda$0$$inlined$entry$default$5
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(com.paypal.oslo.core.navigation.MeSubsDestination meSubsDestination) {
                return androidx.navigation3.runtime.NavEntryKt.defaultContentKey(meSubsDestination);
            }
        }, (kotlin.jvm.functions.Function1) new kotlin.jvm.functions.Function1<com.paypal.oslo.core.navigation.MeSubsDestination, java.util.Map<java.lang.String, ? extends java.lang.Object>>() { // from class: com.paypal.oslo.app.navigation.di.DemoModule$provideL1EntryProviderInstaller$lambda$0$$inlined$entry$default$6
            @Override // kotlin.jvm.functions.Function1
            public final java.util.Map<java.lang.String, ? extends java.lang.Object> invoke(com.paypal.oslo.core.navigation.MeSubsDestination meSubsDestination) {
                return l1TabbedMetadata3;
            }
        }, (kotlin.jvm.functions.Function3) composableLambdaInstance3);
        final java.util.Map l2Metadata$default = com.paypal.oslo.core.navigation.NavigationMetadataBuildersKt.l2Metadata$default(false, null, false, null, null, false, null, null, false, 511, null);
        kotlin.jvm.functions.Function3<com.paypal.oslo.core.navigation.DemoL2Destination, androidx.compose.runtime.Composer, java.lang.Integer, kotlin.Unit> m11076getLambda$830716186$app_prodRelease = com.paypal.oslo.app.navigation.di.ComposableSingletons$DemoModuleKt.INSTANCE.m11076getLambda$830716186$app_prodRelease();
        entryProviderScope.addEntryProvider(kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(com.paypal.oslo.core.navigation.DemoL2Destination.class), (kotlin.jvm.functions.Function1) new kotlin.jvm.functions.Function1<com.paypal.oslo.core.navigation.DemoL2Destination, java.lang.Object>() { // from class: com.paypal.oslo.app.navigation.di.DemoModule$provideL1EntryProviderInstaller$lambda$0$$inlined$entry$default$7
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(com.paypal.oslo.core.navigation.DemoL2Destination demoL2Destination) {
                return androidx.navigation3.runtime.NavEntryKt.defaultContentKey(demoL2Destination);
            }
        }, (kotlin.jvm.functions.Function1) new kotlin.jvm.functions.Function1<com.paypal.oslo.core.navigation.DemoL2Destination, java.util.Map<java.lang.String, ? extends java.lang.Object>>() { // from class: com.paypal.oslo.app.navigation.di.DemoModule$provideL1EntryProviderInstaller$lambda$0$$inlined$entry$default$8
            @Override // kotlin.jvm.functions.Function1
            public final java.util.Map<java.lang.String, ? extends java.lang.Object> invoke(com.paypal.oslo.core.navigation.DemoL2Destination demoL2Destination) {
                return l2Metadata$default;
            }
        }, (kotlin.jvm.functions.Function3) m11076getLambda$830716186$app_prodRelease);
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$OAVmSaEMN1RxEOXOTt_J_K71ISw(com.paypal.oslo.core.navigation.AppNavigator appNavigator, com.paypal.oslo.core.navigation.MeActivityDestination meActivityDestination, androidx.compose.runtime.Composer composer, int i) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(meActivityDestination, "");
        if ((i & 6) == 0) {
            i |= (i & 8) == 0 ? composer.changed(meActivityDestination) : composer.changedInstance(meActivityDestination) ? 4 : 2;
        }
        if (composer.shouldExecute((i & 19) != 18, i & 1)) {
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventStart(-2041003674, i, -1, "com.paypal.oslo.app.navigation.di.DemoModule.provideL1EntryProviderInstaller.<anonymous>.<anonymous> (DemoModule.kt:65)");
            }
            com.paypal.oslo.app.navigation.DemoScreensKt.Me(meActivityDestination, appNavigator, composer, (i & 14) | com.paypal.oslo.core.navigation.MeActivityDestination.$stable);
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventEnd();
            }
        } else {
            composer.skipToGroupEnd();
        }
        return kotlin.Unit.INSTANCE;
    }

    /* renamed from: $r8$lambda$UFMaZwOhEgkWI-1fQlxHq8Y900s, reason: not valid java name */
    public static /* synthetic */ kotlin.Unit m11078$r8$lambda$UFMaZwOhEgkWI1fQlxHq8Y900s(com.paypal.oslo.core.navigation.AppNavigator appNavigator, com.paypal.oslo.core.navigation.MeWalletDestination meWalletDestination, androidx.compose.runtime.Composer composer, int i) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(meWalletDestination, "");
        if ((i & 6) == 0) {
            i |= (i & 8) == 0 ? composer.changed(meWalletDestination) : composer.changedInstance(meWalletDestination) ? 4 : 2;
        }
        if (composer.shouldExecute((i & 19) != 18, i & 1)) {
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventStart(-2064460603, i, -1, "com.paypal.oslo.app.navigation.di.DemoModule.provideL1EntryProviderInstaller.<anonymous>.<anonymous> (DemoModule.kt:59)");
            }
            com.paypal.oslo.app.navigation.DemoScreensKt.Me(meWalletDestination, appNavigator, composer, (i & 14) | com.paypal.oslo.core.navigation.MeWalletDestination.$stable);
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventEnd();
            }
        } else {
            composer.skipToGroupEnd();
        }
        return kotlin.Unit.INSTANCE;
    }
}
