package com.paypal.oslo.feature.qrc.di;

@kotlin.Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\bÁ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003JJ\u0010\u0011\u001a\u001d\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00010\r\u0012\u0004\u0012\u00020\u000e0\fj\u0002`\u000f¢\u0006\u0002\b\u00102\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\nH\u0007¢\u0006\u0004\b\u0011\u0010\u0012J:\u0010\u0013\u001a\u001d\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00010\r\u0012\u0004\u0012\u00020\u000e0\fj\u0002`\u000f¢\u0006\u0002\b\u00102\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0007¢\u0006\u0004\b\u0013\u0010\u0014"}, d2 = {"Lcom/paypal/oslo/feature/qrc/di/NavigationModule;", "", "<init>", "()V", "Lcom/paypal/oslo/core/navigation/AppNavigator;", "navigator", "Lcom/paypal/oslo/feature/moneymovement/api/amount/AmountScreenComponents;", "amountScreenComponents", "Lcom/paypal/oslo/feature/moneymovement/api/shared/components/CommonComponents;", "commonComponents", "Lcom/paypal/oslo/feature/moneymovement/api/success/SuccessScreenComponents;", "successScreenComponents", "Lkotlin/Function1;", "Landroidx/navigation3/runtime/EntryProviderScope;", "", "Lcom/paypal/oslo/core/navigation/EntryProviderInstaller;", "Lkotlin/ExtensionFunctionType;", "provideEntryProviderInstaller", "(Lcom/paypal/oslo/core/navigation/AppNavigator;Lcom/paypal/oslo/feature/moneymovement/api/amount/AmountScreenComponents;Lcom/paypal/oslo/feature/moneymovement/api/shared/components/CommonComponents;Lcom/paypal/oslo/feature/moneymovement/api/success/SuccessScreenComponents;)Lkotlin/jvm/functions/Function1;", "provideShowToPayEntries", "(Lcom/paypal/oslo/core/navigation/AppNavigator;Lcom/paypal/oslo/feature/moneymovement/api/amount/AmountScreenComponents;)Lkotlin/jvm/functions/Function1;"}, k = 1, mv = {2, 3, 0}, xi = 48)
@dagger.Module
/* loaded from: classes14.dex */
public final class NavigationModule {
    public static final int $stable = 0;
    public static final com.paypal.oslo.feature.qrc.di.NavigationModule INSTANCE = new com.paypal.oslo.feature.qrc.di.NavigationModule();

    private NavigationModule() {
    }

    @dagger.Provides
    @dagger.multibindings.IntoSet
    public final kotlin.jvm.functions.Function1<androidx.navigation3.runtime.EntryProviderScope<java.lang.Object>, kotlin.Unit> provideEntryProviderInstaller(final com.paypal.oslo.core.navigation.AppNavigator navigator, final com.paypal.oslo.feature.moneymovement.api.amount.AmountScreenComponents amountScreenComponents, final com.paypal.oslo.feature.moneymovement.api.shared.components.CommonComponents commonComponents, final com.paypal.oslo.feature.moneymovement.api.success.SuccessScreenComponents successScreenComponents) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(navigator, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(amountScreenComponents, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(commonComponents, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(successScreenComponents, "");
        return new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.qrc.di.NavigationModule$$ExternalSyntheticLambda11
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return com.paypal.oslo.feature.qrc.di.NavigationModule.m17754$r8$lambda$B4A0bZUwUROGWe5x9J2O2NbuKk(com.paypal.oslo.core.navigation.AppNavigator.this, amountScreenComponents, commonComponents, successScreenComponents, (androidx.navigation3.runtime.EntryProviderScope) obj);
            }
        };
    }

    @dagger.Provides
    @dagger.multibindings.IntoSet
    public final kotlin.jvm.functions.Function1<androidx.navigation3.runtime.EntryProviderScope<java.lang.Object>, kotlin.Unit> provideShowToPayEntries(final com.paypal.oslo.core.navigation.AppNavigator navigator, final com.paypal.oslo.feature.moneymovement.api.amount.AmountScreenComponents amountScreenComponents) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(navigator, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(amountScreenComponents, "");
        return new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.qrc.di.NavigationModule$$ExternalSyntheticLambda1
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return com.paypal.oslo.feature.qrc.di.NavigationModule.$r8$lambda$EbnWWMYJGgpsaAt0tfO_nxh6EXA(com.paypal.oslo.core.navigation.AppNavigator.this, amountScreenComponents, (androidx.navigation3.runtime.EntryProviderScope) obj);
            }
        };
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$8iIsZTm2lSi4s6zkSVnNkpxWnYI(com.paypal.oslo.core.navigation.AppNavigator appNavigator, com.paypal.oslo.feature.qrc.navigation.QrcEnrollmentDestination qrcEnrollmentDestination, androidx.compose.runtime.Composer composer, int i) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(qrcEnrollmentDestination, "");
        if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
            androidx.compose.runtime.ComposerKt.traceEventStart(660123110, i, -1, "com.paypal.oslo.feature.qrc.di.NavigationModule.provideEntryProviderInstaller.<anonymous>.<anonymous> (NavigationModule.kt:62)");
        }
        com.paypal.oslo.feature.qrc.ui.enrollment.EnrollmentScreenKt.EnrollmentScreen(appNavigator, qrcEnrollmentDestination.getNavArgs(), null, null, composer, 0, 12);
        if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
            androidx.compose.runtime.ComposerKt.traceEventEnd();
        }
        return kotlin.Unit.INSTANCE;
    }

    /* renamed from: $r8$lambda$B-4A0bZUwUROGWe5x9J2O2NbuKk, reason: not valid java name */
    public static /* synthetic */ kotlin.Unit m17754$r8$lambda$B4A0bZUwUROGWe5x9J2O2NbuKk(final com.paypal.oslo.core.navigation.AppNavigator appNavigator, final com.paypal.oslo.feature.moneymovement.api.amount.AmountScreenComponents amountScreenComponents, final com.paypal.oslo.feature.moneymovement.api.shared.components.CommonComponents commonComponents, final com.paypal.oslo.feature.moneymovement.api.success.SuccessScreenComponents successScreenComponents, androidx.navigation3.runtime.EntryProviderScope entryProviderScope) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(entryProviderScope, "");
        final java.util.Map l2Metadata$default = com.paypal.oslo.core.navigation.NavigationMetadataBuildersKt.l2Metadata$default(false, null, false, null, null, false, null, null, false, 510, null);
        androidx.compose.runtime.internal.ComposableLambda composableLambdaInstance = androidx.compose.runtime.internal.ComposableLambdaKt.composableLambdaInstance(660123110, true, new kotlin.jvm.functions.Function3() { // from class: com.paypal.oslo.feature.qrc.di.NavigationModule$$ExternalSyntheticLambda6
            @Override // kotlin.jvm.functions.Function3
            public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2, java.lang.Object obj3) {
                return com.paypal.oslo.feature.qrc.di.NavigationModule.$r8$lambda$8iIsZTm2lSi4s6zkSVnNkpxWnYI(com.paypal.oslo.core.navigation.AppNavigator.this, (com.paypal.oslo.feature.qrc.navigation.QrcEnrollmentDestination) obj, (androidx.compose.runtime.Composer) obj2, ((java.lang.Integer) obj3).intValue());
            }
        });
        entryProviderScope.addEntryProvider(kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(com.paypal.oslo.feature.qrc.navigation.QrcEnrollmentDestination.class), (kotlin.jvm.functions.Function1) new kotlin.jvm.functions.Function1<com.paypal.oslo.feature.qrc.navigation.QrcEnrollmentDestination, java.lang.Object>() { // from class: com.paypal.oslo.feature.qrc.di.NavigationModule$provideEntryProviderInstaller$lambda$0$$inlined$entry$default$1
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(com.paypal.oslo.feature.qrc.navigation.QrcEnrollmentDestination qrcEnrollmentDestination) {
                return androidx.navigation3.runtime.NavEntryKt.defaultContentKey(qrcEnrollmentDestination);
            }
        }, (kotlin.jvm.functions.Function1) new kotlin.jvm.functions.Function1<com.paypal.oslo.feature.qrc.navigation.QrcEnrollmentDestination, java.util.Map<java.lang.String, ? extends java.lang.Object>>() { // from class: com.paypal.oslo.feature.qrc.di.NavigationModule$provideEntryProviderInstaller$lambda$0$$inlined$entry$default$2
            @Override // kotlin.jvm.functions.Function1
            public final java.util.Map<java.lang.String, ? extends java.lang.Object> invoke(com.paypal.oslo.feature.qrc.navigation.QrcEnrollmentDestination qrcEnrollmentDestination) {
                return l2Metadata$default;
            }
        }, (kotlin.jvm.functions.Function3) composableLambdaInstance);
        final java.util.Map l2Metadata$default2 = com.paypal.oslo.core.navigation.NavigationMetadataBuildersKt.l2Metadata$default(false, null, false, null, null, false, null, null, false, 510, null);
        androidx.compose.runtime.internal.ComposableLambda composableLambdaInstance2 = androidx.compose.runtime.internal.ComposableLambdaKt.composableLambdaInstance(-744122349, true, new kotlin.jvm.functions.Function3() { // from class: com.paypal.oslo.feature.qrc.di.NavigationModule$$ExternalSyntheticLambda7
            @Override // kotlin.jvm.functions.Function3
            public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2, java.lang.Object obj3) {
                return com.paypal.oslo.feature.qrc.di.NavigationModule.$r8$lambda$dJapCOFWhmZolrLuLf33kTzFHCY(com.paypal.oslo.core.navigation.AppNavigator.this, (com.paypal.oslo.feature.qrc.api.navigation.QrcPayFlowDestination) obj, (androidx.compose.runtime.Composer) obj2, ((java.lang.Integer) obj3).intValue());
            }
        });
        entryProviderScope.addEntryProvider(kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(com.paypal.oslo.feature.qrc.api.navigation.QrcPayFlowDestination.class), (kotlin.jvm.functions.Function1) new kotlin.jvm.functions.Function1<com.paypal.oslo.feature.qrc.api.navigation.QrcPayFlowDestination, java.lang.Object>() { // from class: com.paypal.oslo.feature.qrc.di.NavigationModule$provideEntryProviderInstaller$lambda$0$$inlined$entry$default$3
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(com.paypal.oslo.feature.qrc.api.navigation.QrcPayFlowDestination qrcPayFlowDestination) {
                return androidx.navigation3.runtime.NavEntryKt.defaultContentKey(qrcPayFlowDestination);
            }
        }, (kotlin.jvm.functions.Function1) new kotlin.jvm.functions.Function1<com.paypal.oslo.feature.qrc.api.navigation.QrcPayFlowDestination, java.util.Map<java.lang.String, ? extends java.lang.Object>>() { // from class: com.paypal.oslo.feature.qrc.di.NavigationModule$provideEntryProviderInstaller$lambda$0$$inlined$entry$default$4
            @Override // kotlin.jvm.functions.Function1
            public final java.util.Map<java.lang.String, ? extends java.lang.Object> invoke(com.paypal.oslo.feature.qrc.api.navigation.QrcPayFlowDestination qrcPayFlowDestination) {
                return l2Metadata$default2;
            }
        }, (kotlin.jvm.functions.Function3) composableLambdaInstance2);
        final java.util.Map l2Metadata$default3 = com.paypal.oslo.core.navigation.NavigationMetadataBuildersKt.l2Metadata$default(false, null, false, null, null, false, null, null, false, 510, null);
        androidx.compose.runtime.internal.ComposableLambda composableLambdaInstance3 = androidx.compose.runtime.internal.ComposableLambdaKt.composableLambdaInstance(-237147252, true, new kotlin.jvm.functions.Function3() { // from class: com.paypal.oslo.feature.qrc.di.NavigationModule$$ExternalSyntheticLambda8
            @Override // kotlin.jvm.functions.Function3
            public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2, java.lang.Object obj3) {
                return com.paypal.oslo.feature.qrc.di.NavigationModule.m17756$r8$lambda$TGumKTWsTxNKNiRDG_1rQ4IXvU(com.paypal.oslo.core.navigation.AppNavigator.this, amountScreenComponents, (com.paypal.oslo.feature.qrc.navigation.QrcEnterAmountDestination) obj, (androidx.compose.runtime.Composer) obj2, ((java.lang.Integer) obj3).intValue());
            }
        });
        entryProviderScope.addEntryProvider(kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(com.paypal.oslo.feature.qrc.navigation.QrcEnterAmountDestination.class), (kotlin.jvm.functions.Function1) new kotlin.jvm.functions.Function1<com.paypal.oslo.feature.qrc.navigation.QrcEnterAmountDestination, java.lang.Object>() { // from class: com.paypal.oslo.feature.qrc.di.NavigationModule$provideEntryProviderInstaller$lambda$0$$inlined$entry$default$5
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(com.paypal.oslo.feature.qrc.navigation.QrcEnterAmountDestination qrcEnterAmountDestination) {
                return androidx.navigation3.runtime.NavEntryKt.defaultContentKey(qrcEnterAmountDestination);
            }
        }, (kotlin.jvm.functions.Function1) new kotlin.jvm.functions.Function1<com.paypal.oslo.feature.qrc.navigation.QrcEnterAmountDestination, java.util.Map<java.lang.String, ? extends java.lang.Object>>() { // from class: com.paypal.oslo.feature.qrc.di.NavigationModule$provideEntryProviderInstaller$lambda$0$$inlined$entry$default$6
            @Override // kotlin.jvm.functions.Function1
            public final java.util.Map<java.lang.String, ? extends java.lang.Object> invoke(com.paypal.oslo.feature.qrc.navigation.QrcEnterAmountDestination qrcEnterAmountDestination) {
                return l2Metadata$default3;
            }
        }, (kotlin.jvm.functions.Function3) composableLambdaInstance3);
        final java.util.Map l2Metadata$default4 = com.paypal.oslo.core.navigation.NavigationMetadataBuildersKt.l2Metadata$default(false, null, false, null, null, false, null, null, false, 510, null);
        androidx.compose.runtime.internal.ComposableLambda composableLambdaInstance4 = androidx.compose.runtime.internal.ComposableLambdaKt.composableLambdaInstance(-733575783, true, new kotlin.jvm.functions.Function3() { // from class: com.paypal.oslo.feature.qrc.di.NavigationModule$$ExternalSyntheticLambda9
            @Override // kotlin.jvm.functions.Function3
            public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2, java.lang.Object obj3) {
                return com.paypal.oslo.feature.qrc.di.NavigationModule.m17757$r8$lambda$o95qd5xdxPIBiFECbfK21r8HI(com.paypal.oslo.core.navigation.AppNavigator.this, commonComponents, (com.paypal.oslo.feature.qrc.navigation.QrcPaymentReviewDestination) obj, (androidx.compose.runtime.Composer) obj2, ((java.lang.Integer) obj3).intValue());
            }
        });
        entryProviderScope.addEntryProvider(kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(com.paypal.oslo.feature.qrc.navigation.QrcPaymentReviewDestination.class), (kotlin.jvm.functions.Function1) new kotlin.jvm.functions.Function1<com.paypal.oslo.feature.qrc.navigation.QrcPaymentReviewDestination, java.lang.Object>() { // from class: com.paypal.oslo.feature.qrc.di.NavigationModule$provideEntryProviderInstaller$lambda$0$$inlined$entry$default$7
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(com.paypal.oslo.feature.qrc.navigation.QrcPaymentReviewDestination qrcPaymentReviewDestination) {
                return androidx.navigation3.runtime.NavEntryKt.defaultContentKey(qrcPaymentReviewDestination);
            }
        }, (kotlin.jvm.functions.Function1) new kotlin.jvm.functions.Function1<com.paypal.oslo.feature.qrc.navigation.QrcPaymentReviewDestination, java.util.Map<java.lang.String, ? extends java.lang.Object>>() { // from class: com.paypal.oslo.feature.qrc.di.NavigationModule$provideEntryProviderInstaller$lambda$0$$inlined$entry$default$8
            @Override // kotlin.jvm.functions.Function1
            public final java.util.Map<java.lang.String, ? extends java.lang.Object> invoke(com.paypal.oslo.feature.qrc.navigation.QrcPaymentReviewDestination qrcPaymentReviewDestination) {
                return l2Metadata$default4;
            }
        }, (kotlin.jvm.functions.Function3) composableLambdaInstance4);
        final java.util.Map l2Metadata$default5 = com.paypal.oslo.core.navigation.NavigationMetadataBuildersKt.l2Metadata$default(false, null, false, null, null, false, null, null, false, 510, null);
        androidx.compose.runtime.internal.ComposableLambda composableLambdaInstance5 = androidx.compose.runtime.internal.ComposableLambdaKt.composableLambdaInstance(741425029, true, new kotlin.jvm.functions.Function3() { // from class: com.paypal.oslo.feature.qrc.di.NavigationModule$$ExternalSyntheticLambda10
            @Override // kotlin.jvm.functions.Function3
            public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2, java.lang.Object obj3) {
                return com.paypal.oslo.feature.qrc.di.NavigationModule.m17755$r8$lambda$Q0cFvKfmKwM_38TAEuHhkOtnvE(com.paypal.oslo.core.navigation.AppNavigator.this, successScreenComponents, (com.paypal.oslo.feature.qrc.navigation.QrcPaymentSuccessDestination) obj, (androidx.compose.runtime.Composer) obj2, ((java.lang.Integer) obj3).intValue());
            }
        });
        entryProviderScope.addEntryProvider(kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(com.paypal.oslo.feature.qrc.navigation.QrcPaymentSuccessDestination.class), (kotlin.jvm.functions.Function1) new kotlin.jvm.functions.Function1<com.paypal.oslo.feature.qrc.navigation.QrcPaymentSuccessDestination, java.lang.Object>() { // from class: com.paypal.oslo.feature.qrc.di.NavigationModule$provideEntryProviderInstaller$lambda$0$$inlined$entry$default$9
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(com.paypal.oslo.feature.qrc.navigation.QrcPaymentSuccessDestination qrcPaymentSuccessDestination) {
                return androidx.navigation3.runtime.NavEntryKt.defaultContentKey(qrcPaymentSuccessDestination);
            }
        }, (kotlin.jvm.functions.Function1) new kotlin.jvm.functions.Function1<com.paypal.oslo.feature.qrc.navigation.QrcPaymentSuccessDestination, java.util.Map<java.lang.String, ? extends java.lang.Object>>() { // from class: com.paypal.oslo.feature.qrc.di.NavigationModule$provideEntryProviderInstaller$lambda$0$$inlined$entry$default$10
            @Override // kotlin.jvm.functions.Function1
            public final java.util.Map<java.lang.String, ? extends java.lang.Object> invoke(com.paypal.oslo.feature.qrc.navigation.QrcPaymentSuccessDestination qrcPaymentSuccessDestination) {
                return l2Metadata$default5;
            }
        }, (kotlin.jvm.functions.Function3) composableLambdaInstance5);
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$EbnWWMYJGgpsaAt0tfO_nxh6EXA(final com.paypal.oslo.core.navigation.AppNavigator appNavigator, final com.paypal.oslo.feature.moneymovement.api.amount.AmountScreenComponents amountScreenComponents, androidx.navigation3.runtime.EntryProviderScope entryProviderScope) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(entryProviderScope, "");
        final java.util.Map l2Metadata$default = com.paypal.oslo.core.navigation.NavigationMetadataBuildersKt.l2Metadata$default(false, null, false, null, null, false, null, null, false, 510, null);
        androidx.compose.runtime.internal.ComposableLambda composableLambdaInstance = androidx.compose.runtime.internal.ComposableLambdaKt.composableLambdaInstance(991877675, true, new kotlin.jvm.functions.Function3() { // from class: com.paypal.oslo.feature.qrc.di.NavigationModule$$ExternalSyntheticLambda3
            @Override // kotlin.jvm.functions.Function3
            public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2, java.lang.Object obj3) {
                return com.paypal.oslo.feature.qrc.di.NavigationModule.$r8$lambda$ljBqy4qVgPMQpzErxvc32pGg1eU(com.paypal.oslo.core.navigation.AppNavigator.this, (com.paypal.oslo.feature.qrc.navigation.ShowToPayLoadingDestination) obj, (androidx.compose.runtime.Composer) obj2, ((java.lang.Integer) obj3).intValue());
            }
        });
        entryProviderScope.addEntryProvider(kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(com.paypal.oslo.feature.qrc.navigation.ShowToPayLoadingDestination.class), (kotlin.jvm.functions.Function1) new kotlin.jvm.functions.Function1<com.paypal.oslo.feature.qrc.navigation.ShowToPayLoadingDestination, java.lang.Object>() { // from class: com.paypal.oslo.feature.qrc.di.NavigationModule$provideShowToPayEntries$lambda$0$$inlined$entry$default$1
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(com.paypal.oslo.feature.qrc.navigation.ShowToPayLoadingDestination showToPayLoadingDestination) {
                return androidx.navigation3.runtime.NavEntryKt.defaultContentKey(showToPayLoadingDestination);
            }
        }, (kotlin.jvm.functions.Function1) new kotlin.jvm.functions.Function1<com.paypal.oslo.feature.qrc.navigation.ShowToPayLoadingDestination, java.util.Map<java.lang.String, ? extends java.lang.Object>>() { // from class: com.paypal.oslo.feature.qrc.di.NavigationModule$provideShowToPayEntries$lambda$0$$inlined$entry$default$2
            @Override // kotlin.jvm.functions.Function1
            public final java.util.Map<java.lang.String, ? extends java.lang.Object> invoke(com.paypal.oslo.feature.qrc.navigation.ShowToPayLoadingDestination showToPayLoadingDestination) {
                return l2Metadata$default;
            }
        }, (kotlin.jvm.functions.Function3) composableLambdaInstance);
        final java.util.Map l2Metadata$default2 = com.paypal.oslo.core.navigation.NavigationMetadataBuildersKt.l2Metadata$default(false, null, false, null, null, false, null, null, false, 510, null);
        androidx.compose.runtime.internal.ComposableLambda composableLambdaInstance2 = androidx.compose.runtime.internal.ComposableLambdaKt.composableLambdaInstance(-67761156, true, new kotlin.jvm.functions.Function3() { // from class: com.paypal.oslo.feature.qrc.di.NavigationModule$$ExternalSyntheticLambda4
            @Override // kotlin.jvm.functions.Function3
            public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2, java.lang.Object obj3) {
                return com.paypal.oslo.feature.qrc.di.NavigationModule.$r8$lambda$I2aVqheqaJogfKJ1kmmyUSjwnVs(com.paypal.oslo.core.navigation.AppNavigator.this, amountScreenComponents, (com.paypal.oslo.feature.qrc.navigation.ShowToPayAmountDestination) obj, (androidx.compose.runtime.Composer) obj2, ((java.lang.Integer) obj3).intValue());
            }
        });
        entryProviderScope.addEntryProvider(kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(com.paypal.oslo.feature.qrc.navigation.ShowToPayAmountDestination.class), (kotlin.jvm.functions.Function1) new kotlin.jvm.functions.Function1<com.paypal.oslo.feature.qrc.navigation.ShowToPayAmountDestination, java.lang.Object>() { // from class: com.paypal.oslo.feature.qrc.di.NavigationModule$provideShowToPayEntries$lambda$0$$inlined$entry$default$3
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(com.paypal.oslo.feature.qrc.navigation.ShowToPayAmountDestination showToPayAmountDestination) {
                return androidx.navigation3.runtime.NavEntryKt.defaultContentKey(showToPayAmountDestination);
            }
        }, (kotlin.jvm.functions.Function1) new kotlin.jvm.functions.Function1<com.paypal.oslo.feature.qrc.navigation.ShowToPayAmountDestination, java.util.Map<java.lang.String, ? extends java.lang.Object>>() { // from class: com.paypal.oslo.feature.qrc.di.NavigationModule$provideShowToPayEntries$lambda$0$$inlined$entry$default$4
            @Override // kotlin.jvm.functions.Function1
            public final java.util.Map<java.lang.String, ? extends java.lang.Object> invoke(com.paypal.oslo.feature.qrc.navigation.ShowToPayAmountDestination showToPayAmountDestination) {
                return l2Metadata$default2;
            }
        }, (kotlin.jvm.functions.Function3) composableLambdaInstance2);
        final java.util.Map l2Metadata$default3 = com.paypal.oslo.core.navigation.NavigationMetadataBuildersKt.l2Metadata$default(false, null, false, null, null, false, null, null, false, 510, null);
        androidx.compose.runtime.internal.ComposableLambda composableLambdaInstance3 = androidx.compose.runtime.internal.ComposableLambdaKt.composableLambdaInstance(-909638426, true, new kotlin.jvm.functions.Function3() { // from class: com.paypal.oslo.feature.qrc.di.NavigationModule$$ExternalSyntheticLambda5
            @Override // kotlin.jvm.functions.Function3
            public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2, java.lang.Object obj3) {
                return com.paypal.oslo.feature.qrc.di.NavigationModule.$r8$lambda$Q0xYHuKD_S3jMfaKT6tFOmwh2Kc(com.paypal.oslo.core.navigation.AppNavigator.this, amountScreenComponents, (com.paypal.oslo.feature.qrc.navigation.PpwMerchantDestination) obj, (androidx.compose.runtime.Composer) obj2, ((java.lang.Integer) obj3).intValue());
            }
        });
        entryProviderScope.addEntryProvider(kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(com.paypal.oslo.feature.qrc.navigation.PpwMerchantDestination.class), (kotlin.jvm.functions.Function1) new kotlin.jvm.functions.Function1<com.paypal.oslo.feature.qrc.navigation.PpwMerchantDestination, java.lang.Object>() { // from class: com.paypal.oslo.feature.qrc.di.NavigationModule$provideShowToPayEntries$lambda$0$$inlined$entry$default$5
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(com.paypal.oslo.feature.qrc.navigation.PpwMerchantDestination ppwMerchantDestination) {
                return androidx.navigation3.runtime.NavEntryKt.defaultContentKey(ppwMerchantDestination);
            }
        }, (kotlin.jvm.functions.Function1) new kotlin.jvm.functions.Function1<com.paypal.oslo.feature.qrc.navigation.PpwMerchantDestination, java.util.Map<java.lang.String, ? extends java.lang.Object>>() { // from class: com.paypal.oslo.feature.qrc.di.NavigationModule$provideShowToPayEntries$lambda$0$$inlined$entry$default$6
            @Override // kotlin.jvm.functions.Function1
            public final java.util.Map<java.lang.String, ? extends java.lang.Object> invoke(com.paypal.oslo.feature.qrc.navigation.PpwMerchantDestination ppwMerchantDestination) {
                return l2Metadata$default3;
            }
        }, (kotlin.jvm.functions.Function3) composableLambdaInstance3);
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$I2aVqheqaJogfKJ1kmmyUSjwnVs(com.paypal.oslo.core.navigation.AppNavigator appNavigator, com.paypal.oslo.feature.moneymovement.api.amount.AmountScreenComponents amountScreenComponents, com.paypal.oslo.feature.qrc.navigation.ShowToPayAmountDestination showToPayAmountDestination, androidx.compose.runtime.Composer composer, int i) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(showToPayAmountDestination, "");
        if (composer.shouldExecute((i & 17) != 16, i & 1)) {
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventStart(-67761156, i, -1, "com.paypal.oslo.feature.qrc.di.NavigationModule.provideShowToPayEntries.<anonymous>.<anonymous> (NavigationModule.kt:144)");
            }
            com.paypal.oslo.feature.qrc.ui.showtopay.ppwenteramount.PpwEnterAmountScreenKt.PpwEnterAmountScreen(appNavigator, amountScreenComponents, null, null, composer, 0, 12);
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventEnd();
            }
        } else {
            composer.skipToGroupEnd();
        }
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$IQ8MgWEYgX4enLn1T53KsViBRGw(java.lang.Object obj, com.paypal.oslo.core.navigation.AppNavigator.NavigationScope navigationScope) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(navigationScope, "");
        navigationScope.replaceTop((androidx.navigation3.runtime.NavKey) obj);
        return kotlin.Unit.INSTANCE;
    }

    /* renamed from: $r8$lambda$Q0cFvKfmKwM_38-TAEuHhkOtnvE, reason: not valid java name */
    public static /* synthetic */ kotlin.Unit m17755$r8$lambda$Q0cFvKfmKwM_38TAEuHhkOtnvE(com.paypal.oslo.core.navigation.AppNavigator appNavigator, com.paypal.oslo.feature.moneymovement.api.success.SuccessScreenComponents successScreenComponents, com.paypal.oslo.feature.qrc.navigation.QrcPaymentSuccessDestination qrcPaymentSuccessDestination, androidx.compose.runtime.Composer composer, int i) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(qrcPaymentSuccessDestination, "");
        if ((i & 6) == 0) {
            i |= composer.changed(qrcPaymentSuccessDestination) ? 4 : 2;
        }
        if (composer.shouldExecute((i & 19) != 18, i & 1)) {
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventStart(741425029, i, -1, "com.paypal.oslo.feature.qrc.di.NavigationModule.provideEntryProviderInstaller.<anonymous>.<anonymous> (NavigationModule.kt:99)");
            }
            com.paypal.oslo.feature.qrc.ui.success.PaymentSuccessScreenKt.PaymentSuccessScreen(appNavigator, qrcPaymentSuccessDestination.getNavArgs(), successScreenComponents, null, null, composer, 0, 24);
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventEnd();
            }
        } else {
            composer.skipToGroupEnd();
        }
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$Q0xYHuKD_S3jMfaKT6tFOmwh2Kc(com.paypal.oslo.core.navigation.AppNavigator appNavigator, com.paypal.oslo.feature.moneymovement.api.amount.AmountScreenComponents amountScreenComponents, com.paypal.oslo.feature.qrc.navigation.PpwMerchantDestination ppwMerchantDestination, androidx.compose.runtime.Composer composer, int i) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(ppwMerchantDestination, "");
        if ((i & 6) == 0) {
            i |= composer.changed(ppwMerchantDestination) ? 4 : 2;
        }
        if (composer.shouldExecute((i & 19) != 18, i & 1)) {
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventStart(-909638426, i, -1, "com.paypal.oslo.feature.qrc.di.NavigationModule.provideShowToPayEntries.<anonymous>.<anonymous> (NavigationModule.kt:153)");
            }
            com.paypal.oslo.feature.qrc.ui.showtopay.ppwmerchant.PpwMerchantScreenKt.PpwMerchantScreen(appNavigator, ppwMerchantDestination.getNavArgs(), null, amountScreenComponents, null, composer, 0, 20);
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventEnd();
            }
        } else {
            composer.skipToGroupEnd();
        }
        return kotlin.Unit.INSTANCE;
    }

    /* renamed from: $r8$lambda$TGumKTWsTxNKNiR-DG_1rQ4IXvU, reason: not valid java name */
    public static /* synthetic */ kotlin.Unit m17756$r8$lambda$TGumKTWsTxNKNiRDG_1rQ4IXvU(com.paypal.oslo.core.navigation.AppNavigator appNavigator, com.paypal.oslo.feature.moneymovement.api.amount.AmountScreenComponents amountScreenComponents, com.paypal.oslo.feature.qrc.navigation.QrcEnterAmountDestination qrcEnterAmountDestination, androidx.compose.runtime.Composer composer, int i) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(qrcEnterAmountDestination, "");
        if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
            androidx.compose.runtime.ComposerKt.traceEventStart(-237147252, i, -1, "com.paypal.oslo.feature.qrc.di.NavigationModule.provideEntryProviderInstaller.<anonymous>.<anonymous> (NavigationModule.kt:79)");
        }
        com.paypal.oslo.feature.qrc.ui.enteramount.EnterAmountScreenKt.EnterAmountScreen(appNavigator, qrcEnterAmountDestination.getNavArgs(), amountScreenComponents, null, null, composer, 0, 24);
        if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
            androidx.compose.runtime.ComposerKt.traceEventEnd();
        }
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$dJapCOFWhmZolrLuLf33kTzFHCY(com.paypal.oslo.core.navigation.AppNavigator appNavigator, com.paypal.oslo.feature.qrc.api.navigation.QrcPayFlowDestination qrcPayFlowDestination, androidx.compose.runtime.Composer composer, int i) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(qrcPayFlowDestination, "");
        if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
            androidx.compose.runtime.ComposerKt.traceEventStart(-744122349, i, -1, "com.paypal.oslo.feature.qrc.di.NavigationModule.provideEntryProviderInstaller.<anonymous>.<anonymous> (NavigationModule.kt:71)");
        }
        com.paypal.oslo.feature.qrc.ui.payflowcontainer.PayFlowContainerScreenKt.PayFlowContainerScreen(appNavigator, null, null, composer, 0, 6);
        if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
            androidx.compose.runtime.ComposerKt.traceEventEnd();
        }
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$ljBqy4qVgPMQpzErxvc32pGg1eU(final com.paypal.oslo.core.navigation.AppNavigator appNavigator, final com.paypal.oslo.feature.qrc.navigation.ShowToPayLoadingDestination showToPayLoadingDestination, androidx.compose.runtime.Composer composer, int i) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(showToPayLoadingDestination, "");
        if ((i & 6) == 0) {
            i |= composer.changed(showToPayLoadingDestination) ? 4 : 2;
        }
        if (composer.shouldExecute((i & 19) != 18, i & 1)) {
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventStart(991877675, i, -1, "com.paypal.oslo.feature.qrc.di.NavigationModule.provideShowToPayEntries.<anonymous>.<anonymous> (NavigationModule.kt:116)");
            }
            java.lang.String title = showToPayLoadingDestination.getNavArgs().getTitle();
            java.lang.String subtitle = showToPayLoadingDestination.getNavArgs().getSubtitle();
            boolean z = (i & 14) == 4;
            boolean changed = composer.changed(appNavigator);
            java.lang.Object rememberedValue = composer.rememberedValue();
            if ((changed | z) || rememberedValue == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                rememberedValue = new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.feature.qrc.di.NavigationModule$$ExternalSyntheticLambda0
                    @Override // kotlin.jvm.functions.Function0
                    public final java.lang.Object invoke() {
                        return com.paypal.oslo.feature.qrc.di.NavigationModule.m17758$r8$lambda$yYDoRMGrgqi6R4rpRbX5YOgA6c(com.paypal.oslo.feature.qrc.navigation.ShowToPayLoadingDestination.this, appNavigator);
                    }
                };
                composer.updateRememberedValue(rememberedValue);
            }
            com.paypal.oslo.feature.qrc.ui.showtopay.home.components.PpwLoadingScreenKt.PpwLoadingScreen(title, subtitle, (kotlin.jvm.functions.Function0) rememberedValue, null, composer, 0, 8);
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventEnd();
            }
        } else {
            composer.skipToGroupEnd();
        }
        return kotlin.Unit.INSTANCE;
    }

    /* renamed from: $r8$lambda$o95qd5xdxPI-BiFE-CbfK21r8HI, reason: not valid java name */
    public static /* synthetic */ kotlin.Unit m17757$r8$lambda$o95qd5xdxPIBiFECbfK21r8HI(com.paypal.oslo.core.navigation.AppNavigator appNavigator, com.paypal.oslo.feature.moneymovement.api.shared.components.CommonComponents commonComponents, com.paypal.oslo.feature.qrc.navigation.QrcPaymentReviewDestination qrcPaymentReviewDestination, androidx.compose.runtime.Composer composer, int i) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(qrcPaymentReviewDestination, "");
        if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
            androidx.compose.runtime.ComposerKt.traceEventStart(-733575783, i, -1, "com.paypal.oslo.feature.qrc.di.NavigationModule.provideEntryProviderInstaller.<anonymous>.<anonymous> (NavigationModule.kt:89)");
        }
        com.paypal.oslo.feature.qrc.ui.review.PaymentReviewScreenKt.PaymentReviewScreen(appNavigator, qrcPaymentReviewDestination.getNavArgs(), commonComponents, null, null, composer, 0, 24);
        if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
            androidx.compose.runtime.ComposerKt.traceEventEnd();
        }
        return kotlin.Unit.INSTANCE;
    }

    /* renamed from: $r8$lambda$yYDoRMGrgqi6R4rp-RbX5YOgA6c, reason: not valid java name */
    public static /* synthetic */ kotlin.Unit m17758$r8$lambda$yYDoRMGrgqi6R4rpRbX5YOgA6c(com.paypal.oslo.feature.qrc.navigation.ShowToPayLoadingDestination showToPayLoadingDestination, com.paypal.oslo.core.navigation.AppNavigator appNavigator) {
        final java.lang.Object showToPayAmountDestination;
        if (showToPayLoadingDestination.getNavArgs().getNavigateToMerchant()) {
            showToPayAmountDestination = new com.paypal.oslo.feature.qrc.navigation.PpwMerchantDestination(new com.paypal.oslo.feature.qrc.ui.showtopay.ppwmerchant.PpwMerchantNavArgs(showToPayLoadingDestination.getNavArgs().getReceiverAmount(), showToPayLoadingDestination.getNavArgs().getSenderAmount(), showToPayLoadingDestination.getNavArgs().getSenderCurrencyCode(), showToPayLoadingDestination.getNavArgs().getReceiverCurrencyCode(), showToPayLoadingDestination.getNavArgs().getSenderCountryCode(), showToPayLoadingDestination.getNavArgs().getReceiverCountryCode()));
        } else {
            showToPayAmountDestination = new com.paypal.oslo.feature.qrc.navigation.ShowToPayAmountDestination(new com.paypal.oslo.feature.qrc.ui.showtopay.home.ShowToPayAmountNavArgs((java.lang.String) null, 1, (kotlin.jvm.internal.DefaultConstructorMarker) null));
        }
        appNavigator.navigate(new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.qrc.di.NavigationModule$$ExternalSyntheticLambda2
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return com.paypal.oslo.feature.qrc.di.NavigationModule.$r8$lambda$IQ8MgWEYgX4enLn1T53KsViBRGw(showToPayAmountDestination, (com.paypal.oslo.core.navigation.AppNavigator.NavigationScope) obj);
            }
        });
        return kotlin.Unit.INSTANCE;
    }
}
