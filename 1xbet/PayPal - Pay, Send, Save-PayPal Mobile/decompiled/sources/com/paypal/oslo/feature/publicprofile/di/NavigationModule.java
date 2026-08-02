package com.paypal.oslo.feature.publicprofile.di;

@kotlin.Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÁ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J2\u0010\u000b\u001a\u001d\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00010\u0007\u0012\u0004\u0012\u00020\b0\u0006j\u0002`\t¢\u0006\u0002\b\n2\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u000b\u0010\f"}, d2 = {"Lcom/paypal/oslo/feature/publicprofile/di/NavigationModule;", "", "<init>", "()V", "Lcom/paypal/oslo/core/navigation/AppNavigator;", "navigator", "Lkotlin/Function1;", "Landroidx/navigation3/runtime/EntryProviderScope;", "", "Lcom/paypal/oslo/core/navigation/EntryProviderInstaller;", "Lkotlin/ExtensionFunctionType;", "providePublicProfileEntryProviderInstaller", "(Lcom/paypal/oslo/core/navigation/AppNavigator;)Lkotlin/jvm/functions/Function1;"}, k = 1, mv = {2, 3, 0}, xi = 48)
@dagger.Module
/* loaded from: classes13.dex */
public final class NavigationModule {
    public static final int $stable = 0;
    public static final com.paypal.oslo.feature.publicprofile.di.NavigationModule INSTANCE = new com.paypal.oslo.feature.publicprofile.di.NavigationModule();

    private NavigationModule() {
    }

    @dagger.Provides
    @dagger.multibindings.IntoSet
    public final kotlin.jvm.functions.Function1<androidx.navigation3.runtime.EntryProviderScope<java.lang.Object>, kotlin.Unit> providePublicProfileEntryProviderInstaller(final com.paypal.oslo.core.navigation.AppNavigator navigator) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(navigator, "");
        return new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.publicprofile.di.NavigationModule$$ExternalSyntheticLambda4
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return com.paypal.oslo.feature.publicprofile.di.NavigationModule.m17702$r8$lambda$S9OGkO4wYydnrKWQQR9YW2YgDo(com.paypal.oslo.core.navigation.AppNavigator.this, (androidx.navigation3.runtime.EntryProviderScope) obj);
            }
        };
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$2I6S1q3UeyyuL1lu1anjaOR5Y2M(final com.paypal.oslo.core.navigation.AppNavigator appNavigator, com.paypal.oslo.feature.publicprofile.navigation.PublicProfileReportDestination publicProfileReportDestination, androidx.compose.runtime.Composer composer, int i) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(publicProfileReportDestination, "");
        if ((i & 6) == 0) {
            i |= composer.changed(publicProfileReportDestination) ? 4 : 2;
        }
        if (composer.shouldExecute((i & 19) != 18, i & 1)) {
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventStart(1561333661, i, -1, "com.paypal.oslo.feature.publicprofile.di.NavigationModule.providePublicProfileEntryProviderInstaller.<anonymous>.<anonymous> (NavigationModule.kt:41)");
            }
            java.lang.String url = publicProfileReportDestination.getUrl();
            boolean changed = composer.changed(appNavigator);
            java.lang.Object rememberedValue = composer.rememberedValue();
            if (changed || rememberedValue == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                rememberedValue = new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.feature.publicprofile.di.NavigationModule$$ExternalSyntheticLambda0
                    @Override // kotlin.jvm.functions.Function0
                    public final java.lang.Object invoke() {
                        return com.paypal.oslo.feature.publicprofile.di.NavigationModule.$r8$lambda$9R4Stbc4W5wktHgRBQ5rUSVSz6c(com.paypal.oslo.core.navigation.AppNavigator.this);
                    }
                };
                composer.updateRememberedValue(rememberedValue);
            }
            com.paypal.oslo.feature.publicprofile.ui.report.PublicProfileReportScreenKt.PublicProfileReportScreen(url, (kotlin.jvm.functions.Function0) rememberedValue, null, com.paypal.oslo.feature.publicprofile.di.ComposableSingletons$NavigationModuleKt.INSTANCE.m17701getLambda$1385412226$public_profile_prodRelease(), composer, 3072, 4);
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventEnd();
            }
        } else {
            composer.skipToGroupEnd();
        }
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$9R4Stbc4W5wktHgRBQ5rUSVSz6c(com.paypal.oslo.core.navigation.AppNavigator appNavigator) {
        appNavigator.navigate(new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.publicprofile.di.NavigationModule$$ExternalSyntheticLambda3
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return com.paypal.oslo.feature.publicprofile.di.NavigationModule.$r8$lambda$RFwoVfsRuk5qaGZx4aZiSeO08CM((com.paypal.oslo.core.navigation.AppNavigator.NavigationScope) obj);
            }
        });
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$RFwoVfsRuk5qaGZx4aZiSeO08CM(com.paypal.oslo.core.navigation.AppNavigator.NavigationScope navigationScope) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(navigationScope, "");
        navigationScope.goBack();
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$Re2yNPzey7f4Nh7dY_gcbLJ_gOo(com.paypal.oslo.core.navigation.AppNavigator appNavigator, com.paypal.oslo.feature.publicprofile.api.navigation.PublicProfileDestination publicProfileDestination, androidx.compose.runtime.Composer composer, int i) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(publicProfileDestination, "");
        if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
            androidx.compose.runtime.ComposerKt.traceEventStart(-98816134, i, -1, "com.paypal.oslo.feature.publicprofile.di.NavigationModule.providePublicProfileEntryProviderInstaller.<anonymous>.<anonymous> (NavigationModule.kt:38)");
        }
        com.paypal.oslo.feature.publicprofile.ui.publicprofile.composable.PublicProfileScreenKt.PublicProfileScreen(publicProfileDestination, appNavigator, null, composer, i & 14, 4);
        if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
            androidx.compose.runtime.ComposerKt.traceEventEnd();
        }
        return kotlin.Unit.INSTANCE;
    }

    /* renamed from: $r8$lambda$S-9OGkO4wYydnrKWQQR9YW2YgDo, reason: not valid java name */
    public static /* synthetic */ kotlin.Unit m17702$r8$lambda$S9OGkO4wYydnrKWQQR9YW2YgDo(final com.paypal.oslo.core.navigation.AppNavigator appNavigator, androidx.navigation3.runtime.EntryProviderScope entryProviderScope) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(entryProviderScope, "");
        final java.util.Map l3Metadata$default = com.paypal.oslo.core.navigation.NavigationMetadataBuildersKt.l3Metadata$default(false, null, false, null, null, false, null, null, com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_SECOND_DEPOSIT_CIRCLE_VALUE, null);
        androidx.compose.runtime.internal.ComposableLambda composableLambdaInstance = androidx.compose.runtime.internal.ComposableLambdaKt.composableLambdaInstance(-98816134, true, new kotlin.jvm.functions.Function3() { // from class: com.paypal.oslo.feature.publicprofile.di.NavigationModule$$ExternalSyntheticLambda1
            @Override // kotlin.jvm.functions.Function3
            public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2, java.lang.Object obj3) {
                return com.paypal.oslo.feature.publicprofile.di.NavigationModule.$r8$lambda$Re2yNPzey7f4Nh7dY_gcbLJ_gOo(com.paypal.oslo.core.navigation.AppNavigator.this, (com.paypal.oslo.feature.publicprofile.api.navigation.PublicProfileDestination) obj, (androidx.compose.runtime.Composer) obj2, ((java.lang.Integer) obj3).intValue());
            }
        });
        entryProviderScope.addEntryProvider(kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(com.paypal.oslo.feature.publicprofile.api.navigation.PublicProfileDestination.class), (kotlin.jvm.functions.Function1) new kotlin.jvm.functions.Function1<com.paypal.oslo.feature.publicprofile.api.navigation.PublicProfileDestination, java.lang.Object>() { // from class: com.paypal.oslo.feature.publicprofile.di.NavigationModule$providePublicProfileEntryProviderInstaller$lambda$0$$inlined$entry$default$1
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(com.paypal.oslo.feature.publicprofile.api.navigation.PublicProfileDestination publicProfileDestination) {
                return androidx.navigation3.runtime.NavEntryKt.defaultContentKey(publicProfileDestination);
            }
        }, (kotlin.jvm.functions.Function1) new kotlin.jvm.functions.Function1<com.paypal.oslo.feature.publicprofile.api.navigation.PublicProfileDestination, java.util.Map<java.lang.String, ? extends java.lang.Object>>() { // from class: com.paypal.oslo.feature.publicprofile.di.NavigationModule$providePublicProfileEntryProviderInstaller$lambda$0$$inlined$entry$default$2
            @Override // kotlin.jvm.functions.Function1
            public final java.util.Map<java.lang.String, ? extends java.lang.Object> invoke(com.paypal.oslo.feature.publicprofile.api.navigation.PublicProfileDestination publicProfileDestination) {
                return l3Metadata$default;
            }
        }, (kotlin.jvm.functions.Function3) composableLambdaInstance);
        final java.util.Map l2Metadata$default = com.paypal.oslo.core.navigation.NavigationMetadataBuildersKt.l2Metadata$default(false, null, false, null, null, false, null, null, false, 510, null);
        androidx.compose.runtime.internal.ComposableLambda composableLambdaInstance2 = androidx.compose.runtime.internal.ComposableLambdaKt.composableLambdaInstance(1561333661, true, new kotlin.jvm.functions.Function3() { // from class: com.paypal.oslo.feature.publicprofile.di.NavigationModule$$ExternalSyntheticLambda2
            @Override // kotlin.jvm.functions.Function3
            public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2, java.lang.Object obj3) {
                return com.paypal.oslo.feature.publicprofile.di.NavigationModule.$r8$lambda$2I6S1q3UeyyuL1lu1anjaOR5Y2M(com.paypal.oslo.core.navigation.AppNavigator.this, (com.paypal.oslo.feature.publicprofile.navigation.PublicProfileReportDestination) obj, (androidx.compose.runtime.Composer) obj2, ((java.lang.Integer) obj3).intValue());
            }
        });
        entryProviderScope.addEntryProvider(kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(com.paypal.oslo.feature.publicprofile.navigation.PublicProfileReportDestination.class), (kotlin.jvm.functions.Function1) new kotlin.jvm.functions.Function1<com.paypal.oslo.feature.publicprofile.navigation.PublicProfileReportDestination, java.lang.Object>() { // from class: com.paypal.oslo.feature.publicprofile.di.NavigationModule$providePublicProfileEntryProviderInstaller$lambda$0$$inlined$entry$default$3
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(com.paypal.oslo.feature.publicprofile.navigation.PublicProfileReportDestination publicProfileReportDestination) {
                return androidx.navigation3.runtime.NavEntryKt.defaultContentKey(publicProfileReportDestination);
            }
        }, (kotlin.jvm.functions.Function1) new kotlin.jvm.functions.Function1<com.paypal.oslo.feature.publicprofile.navigation.PublicProfileReportDestination, java.util.Map<java.lang.String, ? extends java.lang.Object>>() { // from class: com.paypal.oslo.feature.publicprofile.di.NavigationModule$providePublicProfileEntryProviderInstaller$lambda$0$$inlined$entry$default$4
            @Override // kotlin.jvm.functions.Function1
            public final java.util.Map<java.lang.String, ? extends java.lang.Object> invoke(com.paypal.oslo.feature.publicprofile.navigation.PublicProfileReportDestination publicProfileReportDestination) {
                return l2Metadata$default;
            }
        }, (kotlin.jvm.functions.Function3) composableLambdaInstance2);
        return kotlin.Unit.INSTANCE;
    }
}
