package com.paypal.oslo.feature.debitcard.servicing.di;

@kotlin.Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u000e\u001a!\u0010\u0005\u001a\u00020\u0004*\b\u0012\u0004\u0012\u00020\u00010\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\u0000¢\u0006\u0004\b\u0005\u0010\u0006\u001a!\u0010\u0007\u001a\u00020\u0004*\b\u0012\u0004\u0012\u00020\u00010\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\u0000¢\u0006\u0004\b\u0007\u0010\u0006\u001a!\u0010\b\u001a\u00020\u0004*\b\u0012\u0004\u0012\u00020\u00010\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\u0000¢\u0006\u0004\b\b\u0010\u0006\u001a!\u0010\t\u001a\u00020\u0004*\b\u0012\u0004\u0012\u00020\u00010\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\u0000¢\u0006\u0004\b\t\u0010\u0006\u001a!\u0010\n\u001a\u00020\u0004*\b\u0012\u0004\u0012\u00020\u00010\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\u0000¢\u0006\u0004\b\n\u0010\u0006\u001a!\u0010\u000b\u001a\u00020\u0004*\b\u0012\u0004\u0012\u00020\u00010\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\u0000¢\u0006\u0004\b\u000b\u0010\u0006\u001a!\u0010\f\u001a\u00020\u0004*\b\u0012\u0004\u0012\u00020\u00010\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\u0000¢\u0006\u0004\b\f\u0010\u0006\u001a!\u0010\r\u001a\u00020\u0004*\b\u0012\u0004\u0012\u00020\u00010\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\u0000¢\u0006\u0004\b\r\u0010\u0006\u001a!\u0010\u000e\u001a\u00020\u0004*\b\u0012\u0004\u0012\u00020\u00010\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\u0000¢\u0006\u0004\b\u000e\u0010\u0006\u001a!\u0010\u000f\u001a\u00020\u0004*\b\u0012\u0004\u0012\u00020\u00010\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\u0000¢\u0006\u0004\b\u000f\u0010\u0006\u001a!\u0010\u0010\u001a\u00020\u0004*\b\u0012\u0004\u0012\u00020\u00010\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\u0000¢\u0006\u0004\b\u0010\u0010\u0006\u001a!\u0010\u0011\u001a\u00020\u0004*\b\u0012\u0004\u0012\u00020\u00010\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\u0000¢\u0006\u0004\b\u0011\u0010\u0006\u001a!\u0010\u0012\u001a\u00020\u0004*\b\u0012\u0004\u0012\u00020\u00010\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\u0000¢\u0006\u0004\b\u0012\u0010\u0006"}, d2 = {"Landroidx/navigation3/runtime/EntryProviderScope;", "", "Lcom/paypal/oslo/core/navigation/AppNavigator;", "navigator", "", "debitCardDestinationRouterEntry", "(Landroidx/navigation3/runtime/EntryProviderScope;Lcom/paypal/oslo/core/navigation/AppNavigator;)V", "debitCardServicingEntry", "debitCardActivationRouterEntry", "debitCardActivationEntry", "debitCardPinEntry", "debitCardViewPinEntry", "requestPhysicalCardEntry", "requestPhysicalCardDecisionEntry", "secondaryCardManagementEntry", "manageWalletEntry", "fundingSourceSelectorEntry", "manageSecondaryCardHolderEntry", "shippingAddressEntry"}, k = 2, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class ServicingNavigationEntriesKt {
    public static final void debitCardDestinationRouterEntry(androidx.navigation3.runtime.EntryProviderScope<java.lang.Object> entryProviderScope, final com.paypal.oslo.core.navigation.AppNavigator appNavigator) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(entryProviderScope, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(appNavigator, "");
        final java.util.Map l2Metadata$default = com.paypal.oslo.core.navigation.NavigationMetadataBuildersKt.l2Metadata$default(false, null, false, null, null, false, null, null, false, 510, null);
        androidx.compose.runtime.internal.ComposableLambda composableLambdaInstance = androidx.compose.runtime.internal.ComposableLambdaKt.composableLambdaInstance(1133782647, true, new kotlin.jvm.functions.Function3() { // from class: com.paypal.oslo.feature.debitcard.servicing.di.ServicingNavigationEntriesKt$$ExternalSyntheticLambda2
            @Override // kotlin.jvm.functions.Function3
            public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2, java.lang.Object obj3) {
                return com.paypal.oslo.feature.debitcard.servicing.di.ServicingNavigationEntriesKt.$r8$lambda$gjLpIamr16DlY0okUYUHp3VIKDQ(com.paypal.oslo.core.navigation.AppNavigator.this, (com.paypal.oslo.feature.debitcard.api.navigation.DebitCardDestination) obj, (androidx.compose.runtime.Composer) obj2, ((java.lang.Integer) obj3).intValue());
            }
        });
        entryProviderScope.addEntryProvider((kotlin.reflect.KClass) kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(com.paypal.oslo.feature.debitcard.api.navigation.DebitCardDestination.class), (kotlin.jvm.functions.Function1) new kotlin.jvm.functions.Function1<com.paypal.oslo.feature.debitcard.api.navigation.DebitCardDestination, java.lang.Object>() { // from class: com.paypal.oslo.feature.debitcard.servicing.di.ServicingNavigationEntriesKt$debitCardDestinationRouterEntry$$inlined$entry$default$1
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(com.paypal.oslo.feature.debitcard.api.navigation.DebitCardDestination debitCardDestination) {
                return androidx.navigation3.runtime.NavEntryKt.defaultContentKey(debitCardDestination);
            }
        }, (kotlin.jvm.functions.Function1) new kotlin.jvm.functions.Function1<com.paypal.oslo.feature.debitcard.api.navigation.DebitCardDestination, java.util.Map<java.lang.String, ? extends java.lang.Object>>() { // from class: com.paypal.oslo.feature.debitcard.servicing.di.ServicingNavigationEntriesKt$debitCardDestinationRouterEntry$$inlined$entry$default$2
            @Override // kotlin.jvm.functions.Function1
            public final java.util.Map<java.lang.String, ? extends java.lang.Object> invoke(com.paypal.oslo.feature.debitcard.api.navigation.DebitCardDestination debitCardDestination) {
                return l2Metadata$default;
            }
        }, (kotlin.jvm.functions.Function3) composableLambdaInstance);
    }

    public static final void debitCardServicingEntry(androidx.navigation3.runtime.EntryProviderScope<java.lang.Object> entryProviderScope, final com.paypal.oslo.core.navigation.AppNavigator appNavigator) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(entryProviderScope, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(appNavigator, "");
        final java.util.Map l2Metadata$default = com.paypal.oslo.core.navigation.NavigationMetadataBuildersKt.l2Metadata$default(false, null, false, null, null, false, null, null, false, 510, null);
        androidx.compose.runtime.internal.ComposableLambda composableLambdaInstance = androidx.compose.runtime.internal.ComposableLambdaKt.composableLambdaInstance(-502350132, true, new kotlin.jvm.functions.Function3() { // from class: com.paypal.oslo.feature.debitcard.servicing.di.ServicingNavigationEntriesKt$$ExternalSyntheticLambda11
            @Override // kotlin.jvm.functions.Function3
            public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2, java.lang.Object obj3) {
                return com.paypal.oslo.feature.debitcard.servicing.di.ServicingNavigationEntriesKt.$r8$lambda$JjNlmEQS1G5e9c0KQjozFDsuD2s(com.paypal.oslo.core.navigation.AppNavigator.this, (com.paypal.oslo.feature.debitcard.servicing.di.DebitCardServicingDestination) obj, (androidx.compose.runtime.Composer) obj2, ((java.lang.Integer) obj3).intValue());
            }
        });
        entryProviderScope.addEntryProvider((kotlin.reflect.KClass) kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(com.paypal.oslo.feature.debitcard.servicing.di.DebitCardServicingDestination.class), (kotlin.jvm.functions.Function1) new kotlin.jvm.functions.Function1<com.paypal.oslo.feature.debitcard.servicing.di.DebitCardServicingDestination, java.lang.Object>() { // from class: com.paypal.oslo.feature.debitcard.servicing.di.ServicingNavigationEntriesKt$debitCardServicingEntry$$inlined$entry$default$1
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(com.paypal.oslo.feature.debitcard.servicing.di.DebitCardServicingDestination debitCardServicingDestination) {
                return androidx.navigation3.runtime.NavEntryKt.defaultContentKey(debitCardServicingDestination);
            }
        }, (kotlin.jvm.functions.Function1) new kotlin.jvm.functions.Function1<com.paypal.oslo.feature.debitcard.servicing.di.DebitCardServicingDestination, java.util.Map<java.lang.String, ? extends java.lang.Object>>() { // from class: com.paypal.oslo.feature.debitcard.servicing.di.ServicingNavigationEntriesKt$debitCardServicingEntry$$inlined$entry$default$2
            @Override // kotlin.jvm.functions.Function1
            public final java.util.Map<java.lang.String, ? extends java.lang.Object> invoke(com.paypal.oslo.feature.debitcard.servicing.di.DebitCardServicingDestination debitCardServicingDestination) {
                return l2Metadata$default;
            }
        }, (kotlin.jvm.functions.Function3) composableLambdaInstance);
    }

    public static final void debitCardActivationRouterEntry(androidx.navigation3.runtime.EntryProviderScope<java.lang.Object> entryProviderScope, final com.paypal.oslo.core.navigation.AppNavigator appNavigator) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(entryProviderScope, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(appNavigator, "");
        final java.util.Map l2Metadata$default = com.paypal.oslo.core.navigation.NavigationMetadataBuildersKt.l2Metadata$default(false, null, false, null, null, false, null, null, false, 510, null);
        androidx.compose.runtime.internal.ComposableLambda composableLambdaInstance = androidx.compose.runtime.internal.ComposableLambdaKt.composableLambdaInstance(79325316, true, new kotlin.jvm.functions.Function3() { // from class: com.paypal.oslo.feature.debitcard.servicing.di.ServicingNavigationEntriesKt$$ExternalSyntheticLambda7
            @Override // kotlin.jvm.functions.Function3
            public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2, java.lang.Object obj3) {
                return com.paypal.oslo.feature.debitcard.servicing.di.ServicingNavigationEntriesKt.$r8$lambda$141MFTsO5mBfhYYqR8dR6skN0ho(com.paypal.oslo.core.navigation.AppNavigator.this, (com.paypal.oslo.feature.debitcard.servicing.di.DebitCardActivationRouterDestination) obj, (androidx.compose.runtime.Composer) obj2, ((java.lang.Integer) obj3).intValue());
            }
        });
        entryProviderScope.addEntryProvider((kotlin.reflect.KClass) kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(com.paypal.oslo.feature.debitcard.servicing.di.DebitCardActivationRouterDestination.class), (kotlin.jvm.functions.Function1) new kotlin.jvm.functions.Function1<com.paypal.oslo.feature.debitcard.servicing.di.DebitCardActivationRouterDestination, java.lang.Object>() { // from class: com.paypal.oslo.feature.debitcard.servicing.di.ServicingNavigationEntriesKt$debitCardActivationRouterEntry$$inlined$entry$default$1
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(com.paypal.oslo.feature.debitcard.servicing.di.DebitCardActivationRouterDestination debitCardActivationRouterDestination) {
                return androidx.navigation3.runtime.NavEntryKt.defaultContentKey(debitCardActivationRouterDestination);
            }
        }, (kotlin.jvm.functions.Function1) new kotlin.jvm.functions.Function1<com.paypal.oslo.feature.debitcard.servicing.di.DebitCardActivationRouterDestination, java.util.Map<java.lang.String, ? extends java.lang.Object>>() { // from class: com.paypal.oslo.feature.debitcard.servicing.di.ServicingNavigationEntriesKt$debitCardActivationRouterEntry$$inlined$entry$default$2
            @Override // kotlin.jvm.functions.Function1
            public final java.util.Map<java.lang.String, ? extends java.lang.Object> invoke(com.paypal.oslo.feature.debitcard.servicing.di.DebitCardActivationRouterDestination debitCardActivationRouterDestination) {
                return l2Metadata$default;
            }
        }, (kotlin.jvm.functions.Function3) composableLambdaInstance);
    }

    public static final void debitCardActivationEntry(androidx.navigation3.runtime.EntryProviderScope<java.lang.Object> entryProviderScope, final com.paypal.oslo.core.navigation.AppNavigator appNavigator) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(entryProviderScope, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(appNavigator, "");
        final java.util.Map l2Metadata$default = com.paypal.oslo.core.navigation.NavigationMetadataBuildersKt.l2Metadata$default(false, null, false, null, null, false, null, null, false, 510, null);
        androidx.compose.runtime.internal.ComposableLambda composableLambdaInstance = androidx.compose.runtime.internal.ComposableLambdaKt.composableLambdaInstance(2014006038, true, new kotlin.jvm.functions.Function3() { // from class: com.paypal.oslo.feature.debitcard.servicing.di.ServicingNavigationEntriesKt$$ExternalSyntheticLambda8
            @Override // kotlin.jvm.functions.Function3
            public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2, java.lang.Object obj3) {
                return com.paypal.oslo.feature.debitcard.servicing.di.ServicingNavigationEntriesKt.$r8$lambda$Qo5dfRFbOP9Kx_zOfaC5HeltkyY(com.paypal.oslo.core.navigation.AppNavigator.this, (com.paypal.oslo.feature.debitcard.servicing.di.DebitCardActivationDestination) obj, (androidx.compose.runtime.Composer) obj2, ((java.lang.Integer) obj3).intValue());
            }
        });
        entryProviderScope.addEntryProvider((kotlin.reflect.KClass) kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(com.paypal.oslo.feature.debitcard.servicing.di.DebitCardActivationDestination.class), (kotlin.jvm.functions.Function1) new kotlin.jvm.functions.Function1<com.paypal.oslo.feature.debitcard.servicing.di.DebitCardActivationDestination, java.lang.Object>() { // from class: com.paypal.oslo.feature.debitcard.servicing.di.ServicingNavigationEntriesKt$debitCardActivationEntry$$inlined$entry$default$1
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(com.paypal.oslo.feature.debitcard.servicing.di.DebitCardActivationDestination debitCardActivationDestination) {
                return androidx.navigation3.runtime.NavEntryKt.defaultContentKey(debitCardActivationDestination);
            }
        }, (kotlin.jvm.functions.Function1) new kotlin.jvm.functions.Function1<com.paypal.oslo.feature.debitcard.servicing.di.DebitCardActivationDestination, java.util.Map<java.lang.String, ? extends java.lang.Object>>() { // from class: com.paypal.oslo.feature.debitcard.servicing.di.ServicingNavigationEntriesKt$debitCardActivationEntry$$inlined$entry$default$2
            @Override // kotlin.jvm.functions.Function1
            public final java.util.Map<java.lang.String, ? extends java.lang.Object> invoke(com.paypal.oslo.feature.debitcard.servicing.di.DebitCardActivationDestination debitCardActivationDestination) {
                return l2Metadata$default;
            }
        }, (kotlin.jvm.functions.Function3) composableLambdaInstance);
    }

    public static final void debitCardPinEntry(androidx.navigation3.runtime.EntryProviderScope<java.lang.Object> entryProviderScope, final com.paypal.oslo.core.navigation.AppNavigator appNavigator) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(entryProviderScope, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(appNavigator, "");
        final java.util.Map l2Metadata$default = com.paypal.oslo.core.navigation.NavigationMetadataBuildersKt.l2Metadata$default(false, null, false, null, null, false, null, null, false, 510, null);
        androidx.compose.runtime.internal.ComposableLambda composableLambdaInstance = androidx.compose.runtime.internal.ComposableLambdaKt.composableLambdaInstance(1207956828, true, new kotlin.jvm.functions.Function3() { // from class: com.paypal.oslo.feature.debitcard.servicing.di.ServicingNavigationEntriesKt$$ExternalSyntheticLambda19
            @Override // kotlin.jvm.functions.Function3
            public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2, java.lang.Object obj3) {
                return com.paypal.oslo.feature.debitcard.servicing.di.ServicingNavigationEntriesKt.$r8$lambda$gOOeMQUdQWwsqPQid7mBVU_af_A(com.paypal.oslo.core.navigation.AppNavigator.this, (com.paypal.oslo.feature.debitcard.servicing.di.DebitPinDestination) obj, (androidx.compose.runtime.Composer) obj2, ((java.lang.Integer) obj3).intValue());
            }
        });
        entryProviderScope.addEntryProvider((kotlin.reflect.KClass) kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(com.paypal.oslo.feature.debitcard.servicing.di.DebitPinDestination.class), (kotlin.jvm.functions.Function1) new kotlin.jvm.functions.Function1<com.paypal.oslo.feature.debitcard.servicing.di.DebitPinDestination, java.lang.Object>() { // from class: com.paypal.oslo.feature.debitcard.servicing.di.ServicingNavigationEntriesKt$debitCardPinEntry$$inlined$entry$default$1
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(com.paypal.oslo.feature.debitcard.servicing.di.DebitPinDestination debitPinDestination) {
                return androidx.navigation3.runtime.NavEntryKt.defaultContentKey(debitPinDestination);
            }
        }, (kotlin.jvm.functions.Function1) new kotlin.jvm.functions.Function1<com.paypal.oslo.feature.debitcard.servicing.di.DebitPinDestination, java.util.Map<java.lang.String, ? extends java.lang.Object>>() { // from class: com.paypal.oslo.feature.debitcard.servicing.di.ServicingNavigationEntriesKt$debitCardPinEntry$$inlined$entry$default$2
            @Override // kotlin.jvm.functions.Function1
            public final java.util.Map<java.lang.String, ? extends java.lang.Object> invoke(com.paypal.oslo.feature.debitcard.servicing.di.DebitPinDestination debitPinDestination) {
                return l2Metadata$default;
            }
        }, (kotlin.jvm.functions.Function3) composableLambdaInstance);
    }

    public static final void debitCardViewPinEntry(androidx.navigation3.runtime.EntryProviderScope<java.lang.Object> entryProviderScope, final com.paypal.oslo.core.navigation.AppNavigator appNavigator) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(entryProviderScope, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(appNavigator, "");
        final java.util.Map l2Metadata$default = com.paypal.oslo.core.navigation.NavigationMetadataBuildersKt.l2Metadata$default(false, null, false, null, null, false, null, null, false, 510, null);
        androidx.compose.runtime.internal.ComposableLambda composableLambdaInstance = androidx.compose.runtime.internal.ComposableLambdaKt.composableLambdaInstance(-1497522254, true, new kotlin.jvm.functions.Function3() { // from class: com.paypal.oslo.feature.debitcard.servicing.di.ServicingNavigationEntriesKt$$ExternalSyntheticLambda6
            @Override // kotlin.jvm.functions.Function3
            public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2, java.lang.Object obj3) {
                return com.paypal.oslo.feature.debitcard.servicing.di.ServicingNavigationEntriesKt.m14306$r8$lambda$tGzraDlNyTMcSIuif5P5Tn3htI(com.paypal.oslo.core.navigation.AppNavigator.this, (com.paypal.oslo.feature.debitcard.servicing.di.ViewPinDestination) obj, (androidx.compose.runtime.Composer) obj2, ((java.lang.Integer) obj3).intValue());
            }
        });
        entryProviderScope.addEntryProvider((kotlin.reflect.KClass) kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(com.paypal.oslo.feature.debitcard.servicing.di.ViewPinDestination.class), (kotlin.jvm.functions.Function1) new kotlin.jvm.functions.Function1<com.paypal.oslo.feature.debitcard.servicing.di.ViewPinDestination, java.lang.Object>() { // from class: com.paypal.oslo.feature.debitcard.servicing.di.ServicingNavigationEntriesKt$debitCardViewPinEntry$$inlined$entry$default$1
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(com.paypal.oslo.feature.debitcard.servicing.di.ViewPinDestination viewPinDestination) {
                return androidx.navigation3.runtime.NavEntryKt.defaultContentKey(viewPinDestination);
            }
        }, (kotlin.jvm.functions.Function1) new kotlin.jvm.functions.Function1<com.paypal.oslo.feature.debitcard.servicing.di.ViewPinDestination, java.util.Map<java.lang.String, ? extends java.lang.Object>>() { // from class: com.paypal.oslo.feature.debitcard.servicing.di.ServicingNavigationEntriesKt$debitCardViewPinEntry$$inlined$entry$default$2
            @Override // kotlin.jvm.functions.Function1
            public final java.util.Map<java.lang.String, ? extends java.lang.Object> invoke(com.paypal.oslo.feature.debitcard.servicing.di.ViewPinDestination viewPinDestination) {
                return l2Metadata$default;
            }
        }, (kotlin.jvm.functions.Function3) composableLambdaInstance);
    }

    public static final void requestPhysicalCardEntry(androidx.navigation3.runtime.EntryProviderScope<java.lang.Object> entryProviderScope, final com.paypal.oslo.core.navigation.AppNavigator appNavigator) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(entryProviderScope, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(appNavigator, "");
        final java.util.Map l2Metadata$default = com.paypal.oslo.core.navigation.NavigationMetadataBuildersKt.l2Metadata$default(false, null, false, null, null, false, null, null, false, 510, null);
        androidx.compose.runtime.internal.ComposableLambda composableLambdaInstance = androidx.compose.runtime.internal.ComposableLambdaKt.composableLambdaInstance(-1563013810, true, new kotlin.jvm.functions.Function3() { // from class: com.paypal.oslo.feature.debitcard.servicing.di.ServicingNavigationEntriesKt$$ExternalSyntheticLambda15
            @Override // kotlin.jvm.functions.Function3
            public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2, java.lang.Object obj3) {
                return com.paypal.oslo.feature.debitcard.servicing.di.ServicingNavigationEntriesKt.$r8$lambda$FedTLALXKrCD_l6FnJoEvC3kIws(com.paypal.oslo.core.navigation.AppNavigator.this, (com.paypal.oslo.feature.debitcard.servicing.di.RequestPhysicalCardDestination) obj, (androidx.compose.runtime.Composer) obj2, ((java.lang.Integer) obj3).intValue());
            }
        });
        entryProviderScope.addEntryProvider((kotlin.reflect.KClass) kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(com.paypal.oslo.feature.debitcard.servicing.di.RequestPhysicalCardDestination.class), (kotlin.jvm.functions.Function1) new kotlin.jvm.functions.Function1<com.paypal.oslo.feature.debitcard.servicing.di.RequestPhysicalCardDestination, java.lang.Object>() { // from class: com.paypal.oslo.feature.debitcard.servicing.di.ServicingNavigationEntriesKt$requestPhysicalCardEntry$$inlined$entry$default$1
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(com.paypal.oslo.feature.debitcard.servicing.di.RequestPhysicalCardDestination requestPhysicalCardDestination) {
                return androidx.navigation3.runtime.NavEntryKt.defaultContentKey(requestPhysicalCardDestination);
            }
        }, (kotlin.jvm.functions.Function1) new kotlin.jvm.functions.Function1<com.paypal.oslo.feature.debitcard.servicing.di.RequestPhysicalCardDestination, java.util.Map<java.lang.String, ? extends java.lang.Object>>() { // from class: com.paypal.oslo.feature.debitcard.servicing.di.ServicingNavigationEntriesKt$requestPhysicalCardEntry$$inlined$entry$default$2
            @Override // kotlin.jvm.functions.Function1
            public final java.util.Map<java.lang.String, ? extends java.lang.Object> invoke(com.paypal.oslo.feature.debitcard.servicing.di.RequestPhysicalCardDestination requestPhysicalCardDestination) {
                return l2Metadata$default;
            }
        }, (kotlin.jvm.functions.Function3) composableLambdaInstance);
    }

    public static final void requestPhysicalCardDecisionEntry(androidx.navigation3.runtime.EntryProviderScope<java.lang.Object> entryProviderScope, final com.paypal.oslo.core.navigation.AppNavigator appNavigator) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(entryProviderScope, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(appNavigator, "");
        final java.util.Map l2Metadata$default = com.paypal.oslo.core.navigation.NavigationMetadataBuildersKt.l2Metadata$default(false, null, false, null, null, false, null, null, false, 510, null);
        androidx.compose.runtime.internal.ComposableLambda composableLambdaInstance = androidx.compose.runtime.internal.ComposableLambdaKt.composableLambdaInstance(1067000662, true, new kotlin.jvm.functions.Function3() { // from class: com.paypal.oslo.feature.debitcard.servicing.di.ServicingNavigationEntriesKt$$ExternalSyntheticLambda4
            @Override // kotlin.jvm.functions.Function3
            public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2, java.lang.Object obj3) {
                return com.paypal.oslo.feature.debitcard.servicing.di.ServicingNavigationEntriesKt.m14303$r8$lambda$8rDc7OiDEcQ1_thzjR1cEsQ8bU(com.paypal.oslo.core.navigation.AppNavigator.this, (com.paypal.oslo.feature.debitcard.servicing.di.RequestPhysicalCardDecisionDestination) obj, (androidx.compose.runtime.Composer) obj2, ((java.lang.Integer) obj3).intValue());
            }
        });
        entryProviderScope.addEntryProvider((kotlin.reflect.KClass) kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(com.paypal.oslo.feature.debitcard.servicing.di.RequestPhysicalCardDecisionDestination.class), (kotlin.jvm.functions.Function1) new kotlin.jvm.functions.Function1<com.paypal.oslo.feature.debitcard.servicing.di.RequestPhysicalCardDecisionDestination, java.lang.Object>() { // from class: com.paypal.oslo.feature.debitcard.servicing.di.ServicingNavigationEntriesKt$requestPhysicalCardDecisionEntry$$inlined$entry$default$1
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(com.paypal.oslo.feature.debitcard.servicing.di.RequestPhysicalCardDecisionDestination requestPhysicalCardDecisionDestination) {
                return androidx.navigation3.runtime.NavEntryKt.defaultContentKey(requestPhysicalCardDecisionDestination);
            }
        }, (kotlin.jvm.functions.Function1) new kotlin.jvm.functions.Function1<com.paypal.oslo.feature.debitcard.servicing.di.RequestPhysicalCardDecisionDestination, java.util.Map<java.lang.String, ? extends java.lang.Object>>() { // from class: com.paypal.oslo.feature.debitcard.servicing.di.ServicingNavigationEntriesKt$requestPhysicalCardDecisionEntry$$inlined$entry$default$2
            @Override // kotlin.jvm.functions.Function1
            public final java.util.Map<java.lang.String, ? extends java.lang.Object> invoke(com.paypal.oslo.feature.debitcard.servicing.di.RequestPhysicalCardDecisionDestination requestPhysicalCardDecisionDestination) {
                return l2Metadata$default;
            }
        }, (kotlin.jvm.functions.Function3) composableLambdaInstance);
    }

    public static final void secondaryCardManagementEntry(androidx.navigation3.runtime.EntryProviderScope<java.lang.Object> entryProviderScope, final com.paypal.oslo.core.navigation.AppNavigator appNavigator) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(entryProviderScope, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(appNavigator, "");
        final java.util.Map l2Metadata$default = com.paypal.oslo.core.navigation.NavigationMetadataBuildersKt.l2Metadata$default(false, null, false, null, null, false, null, null, false, 510, null);
        androidx.compose.runtime.internal.ComposableLambda composableLambdaInstance = androidx.compose.runtime.internal.ComposableLambdaKt.composableLambdaInstance(-1071622036, true, new kotlin.jvm.functions.Function3() { // from class: com.paypal.oslo.feature.debitcard.servicing.di.ServicingNavigationEntriesKt$$ExternalSyntheticLambda3
            @Override // kotlin.jvm.functions.Function3
            public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2, java.lang.Object obj3) {
                return com.paypal.oslo.feature.debitcard.servicing.di.ServicingNavigationEntriesKt.m14307$r8$lambda$u5zK9xvZ2AsS8Czjib_eBPAhpA(com.paypal.oslo.core.navigation.AppNavigator.this, (com.paypal.oslo.feature.debitcard.servicing.di.SecondaryCardManagementDestination) obj, (androidx.compose.runtime.Composer) obj2, ((java.lang.Integer) obj3).intValue());
            }
        });
        entryProviderScope.addEntryProvider((kotlin.reflect.KClass) kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(com.paypal.oslo.feature.debitcard.servicing.di.SecondaryCardManagementDestination.class), (kotlin.jvm.functions.Function1) new kotlin.jvm.functions.Function1<com.paypal.oslo.feature.debitcard.servicing.di.SecondaryCardManagementDestination, java.lang.Object>() { // from class: com.paypal.oslo.feature.debitcard.servicing.di.ServicingNavigationEntriesKt$secondaryCardManagementEntry$$inlined$entry$default$1
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(com.paypal.oslo.feature.debitcard.servicing.di.SecondaryCardManagementDestination secondaryCardManagementDestination) {
                return androidx.navigation3.runtime.NavEntryKt.defaultContentKey(secondaryCardManagementDestination);
            }
        }, (kotlin.jvm.functions.Function1) new kotlin.jvm.functions.Function1<com.paypal.oslo.feature.debitcard.servicing.di.SecondaryCardManagementDestination, java.util.Map<java.lang.String, ? extends java.lang.Object>>() { // from class: com.paypal.oslo.feature.debitcard.servicing.di.ServicingNavigationEntriesKt$secondaryCardManagementEntry$$inlined$entry$default$2
            @Override // kotlin.jvm.functions.Function1
            public final java.util.Map<java.lang.String, ? extends java.lang.Object> invoke(com.paypal.oslo.feature.debitcard.servicing.di.SecondaryCardManagementDestination secondaryCardManagementDestination) {
                return l2Metadata$default;
            }
        }, (kotlin.jvm.functions.Function3) composableLambdaInstance);
    }

    public static final void manageWalletEntry(androidx.navigation3.runtime.EntryProviderScope<java.lang.Object> entryProviderScope, final com.paypal.oslo.core.navigation.AppNavigator appNavigator) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(entryProviderScope, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(appNavigator, "");
        final java.util.Map l2Metadata$default = com.paypal.oslo.core.navigation.NavigationMetadataBuildersKt.l2Metadata$default(false, null, false, null, null, false, null, null, false, 510, null);
        androidx.compose.runtime.internal.ComposableLambda composableLambdaInstance = androidx.compose.runtime.internal.ComposableLambdaKt.composableLambdaInstance(28791184, true, new kotlin.jvm.functions.Function3() { // from class: com.paypal.oslo.feature.debitcard.servicing.di.ServicingNavigationEntriesKt$$ExternalSyntheticLambda16
            @Override // kotlin.jvm.functions.Function3
            public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2, java.lang.Object obj3) {
                return com.paypal.oslo.feature.debitcard.servicing.di.ServicingNavigationEntriesKt.$r8$lambda$0bQ4YFd2SEL8eKv2oldbkFSvVZs(com.paypal.oslo.core.navigation.AppNavigator.this, (com.paypal.oslo.feature.debitcard.servicing.di.DebitCardWalletManagementDestination) obj, (androidx.compose.runtime.Composer) obj2, ((java.lang.Integer) obj3).intValue());
            }
        });
        entryProviderScope.addEntryProvider((kotlin.reflect.KClass) kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(com.paypal.oslo.feature.debitcard.servicing.di.DebitCardWalletManagementDestination.class), (kotlin.jvm.functions.Function1) new kotlin.jvm.functions.Function1<com.paypal.oslo.feature.debitcard.servicing.di.DebitCardWalletManagementDestination, java.lang.Object>() { // from class: com.paypal.oslo.feature.debitcard.servicing.di.ServicingNavigationEntriesKt$manageWalletEntry$$inlined$entry$default$1
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(com.paypal.oslo.feature.debitcard.servicing.di.DebitCardWalletManagementDestination debitCardWalletManagementDestination) {
                return androidx.navigation3.runtime.NavEntryKt.defaultContentKey(debitCardWalletManagementDestination);
            }
        }, (kotlin.jvm.functions.Function1) new kotlin.jvm.functions.Function1<com.paypal.oslo.feature.debitcard.servicing.di.DebitCardWalletManagementDestination, java.util.Map<java.lang.String, ? extends java.lang.Object>>() { // from class: com.paypal.oslo.feature.debitcard.servicing.di.ServicingNavigationEntriesKt$manageWalletEntry$$inlined$entry$default$2
            @Override // kotlin.jvm.functions.Function1
            public final java.util.Map<java.lang.String, ? extends java.lang.Object> invoke(com.paypal.oslo.feature.debitcard.servicing.di.DebitCardWalletManagementDestination debitCardWalletManagementDestination) {
                return l2Metadata$default;
            }
        }, (kotlin.jvm.functions.Function3) composableLambdaInstance);
    }

    public static final void fundingSourceSelectorEntry(androidx.navigation3.runtime.EntryProviderScope<java.lang.Object> entryProviderScope, final com.paypal.oslo.core.navigation.AppNavigator appNavigator) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(entryProviderScope, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(appNavigator, "");
        final java.util.Map l2Metadata$default = com.paypal.oslo.core.navigation.NavigationMetadataBuildersKt.l2Metadata$default(false, null, false, null, null, false, null, null, false, 510, null);
        androidx.compose.runtime.internal.ComposableLambda composableLambdaInstance = androidx.compose.runtime.internal.ComposableLambdaKt.composableLambdaInstance(-866375924, true, new kotlin.jvm.functions.Function3() { // from class: com.paypal.oslo.feature.debitcard.servicing.di.ServicingNavigationEntriesKt$$ExternalSyntheticLambda1
            @Override // kotlin.jvm.functions.Function3
            public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2, java.lang.Object obj3) {
                return com.paypal.oslo.feature.debitcard.servicing.di.ServicingNavigationEntriesKt.$r8$lambda$K3geBQ3MxczAUyoRHe80eClV7ys(com.paypal.oslo.core.navigation.AppNavigator.this, (com.paypal.oslo.feature.debitcard.shared.di.FundingSourceSelectorDestination) obj, (androidx.compose.runtime.Composer) obj2, ((java.lang.Integer) obj3).intValue());
            }
        });
        entryProviderScope.addEntryProvider((kotlin.reflect.KClass) kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(com.paypal.oslo.feature.debitcard.shared.di.FundingSourceSelectorDestination.class), (kotlin.jvm.functions.Function1) new kotlin.jvm.functions.Function1<com.paypal.oslo.feature.debitcard.shared.di.FundingSourceSelectorDestination, java.lang.Object>() { // from class: com.paypal.oslo.feature.debitcard.servicing.di.ServicingNavigationEntriesKt$fundingSourceSelectorEntry$$inlined$entry$default$1
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(com.paypal.oslo.feature.debitcard.shared.di.FundingSourceSelectorDestination fundingSourceSelectorDestination) {
                return androidx.navigation3.runtime.NavEntryKt.defaultContentKey(fundingSourceSelectorDestination);
            }
        }, (kotlin.jvm.functions.Function1) new kotlin.jvm.functions.Function1<com.paypal.oslo.feature.debitcard.shared.di.FundingSourceSelectorDestination, java.util.Map<java.lang.String, ? extends java.lang.Object>>() { // from class: com.paypal.oslo.feature.debitcard.servicing.di.ServicingNavigationEntriesKt$fundingSourceSelectorEntry$$inlined$entry$default$2
            @Override // kotlin.jvm.functions.Function1
            public final java.util.Map<java.lang.String, ? extends java.lang.Object> invoke(com.paypal.oslo.feature.debitcard.shared.di.FundingSourceSelectorDestination fundingSourceSelectorDestination) {
                return l2Metadata$default;
            }
        }, (kotlin.jvm.functions.Function3) composableLambdaInstance);
    }

    public static final void manageSecondaryCardHolderEntry(androidx.navigation3.runtime.EntryProviderScope<java.lang.Object> entryProviderScope, final com.paypal.oslo.core.navigation.AppNavigator appNavigator) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(entryProviderScope, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(appNavigator, "");
        final java.util.Map l2Metadata$default = com.paypal.oslo.core.navigation.NavigationMetadataBuildersKt.l2Metadata$default(false, null, false, null, null, false, null, null, false, 510, null);
        androidx.compose.runtime.internal.ComposableLambda composableLambdaInstance = androidx.compose.runtime.internal.ComposableLambdaKt.composableLambdaInstance(-1847147164, true, new kotlin.jvm.functions.Function3() { // from class: com.paypal.oslo.feature.debitcard.servicing.di.ServicingNavigationEntriesKt$$ExternalSyntheticLambda17
            @Override // kotlin.jvm.functions.Function3
            public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2, java.lang.Object obj3) {
                return com.paypal.oslo.feature.debitcard.servicing.di.ServicingNavigationEntriesKt.$r8$lambda$Z6tvgV5KnVs9vBAJ5CYHAZjEl2U(com.paypal.oslo.core.navigation.AppNavigator.this, (com.paypal.oslo.feature.debitcard.servicing.di.ManageSecondaryCardHolderDestination) obj, (androidx.compose.runtime.Composer) obj2, ((java.lang.Integer) obj3).intValue());
            }
        });
        entryProviderScope.addEntryProvider((kotlin.reflect.KClass) kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(com.paypal.oslo.feature.debitcard.servicing.di.ManageSecondaryCardHolderDestination.class), (kotlin.jvm.functions.Function1) new kotlin.jvm.functions.Function1<com.paypal.oslo.feature.debitcard.servicing.di.ManageSecondaryCardHolderDestination, java.lang.Object>() { // from class: com.paypal.oslo.feature.debitcard.servicing.di.ServicingNavigationEntriesKt$manageSecondaryCardHolderEntry$$inlined$entry$default$1
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(com.paypal.oslo.feature.debitcard.servicing.di.ManageSecondaryCardHolderDestination manageSecondaryCardHolderDestination) {
                return androidx.navigation3.runtime.NavEntryKt.defaultContentKey(manageSecondaryCardHolderDestination);
            }
        }, (kotlin.jvm.functions.Function1) new kotlin.jvm.functions.Function1<com.paypal.oslo.feature.debitcard.servicing.di.ManageSecondaryCardHolderDestination, java.util.Map<java.lang.String, ? extends java.lang.Object>>() { // from class: com.paypal.oslo.feature.debitcard.servicing.di.ServicingNavigationEntriesKt$manageSecondaryCardHolderEntry$$inlined$entry$default$2
            @Override // kotlin.jvm.functions.Function1
            public final java.util.Map<java.lang.String, ? extends java.lang.Object> invoke(com.paypal.oslo.feature.debitcard.servicing.di.ManageSecondaryCardHolderDestination manageSecondaryCardHolderDestination) {
                return l2Metadata$default;
            }
        }, (kotlin.jvm.functions.Function3) composableLambdaInstance);
    }

    public static final void shippingAddressEntry(androidx.navigation3.runtime.EntryProviderScope<java.lang.Object> entryProviderScope, final com.paypal.oslo.core.navigation.AppNavigator appNavigator) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(entryProviderScope, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(appNavigator, "");
        final java.util.Map l2Metadata$default = com.paypal.oslo.core.navigation.NavigationMetadataBuildersKt.l2Metadata$default(false, null, false, null, null, false, null, null, false, 510, null);
        androidx.compose.runtime.internal.ComposableLambda composableLambdaInstance = androidx.compose.runtime.internal.ComposableLambdaKt.composableLambdaInstance(-774712978, true, new kotlin.jvm.functions.Function3() { // from class: com.paypal.oslo.feature.debitcard.servicing.di.ServicingNavigationEntriesKt$$ExternalSyntheticLambda20
            @Override // kotlin.jvm.functions.Function3
            public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2, java.lang.Object obj3) {
                return com.paypal.oslo.feature.debitcard.servicing.di.ServicingNavigationEntriesKt.m14308$r8$lambda$uDHcVVj6CBte23vu85hXkuLQ(com.paypal.oslo.core.navigation.AppNavigator.this, (com.paypal.oslo.feature.debitcard.servicing.di.ShippingAddressDestination) obj, (androidx.compose.runtime.Composer) obj2, ((java.lang.Integer) obj3).intValue());
            }
        });
        entryProviderScope.addEntryProvider((kotlin.reflect.KClass) kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(com.paypal.oslo.feature.debitcard.servicing.di.ShippingAddressDestination.class), (kotlin.jvm.functions.Function1) new kotlin.jvm.functions.Function1<com.paypal.oslo.feature.debitcard.servicing.di.ShippingAddressDestination, java.lang.Object>() { // from class: com.paypal.oslo.feature.debitcard.servicing.di.ServicingNavigationEntriesKt$shippingAddressEntry$$inlined$entry$default$1
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(com.paypal.oslo.feature.debitcard.servicing.di.ShippingAddressDestination shippingAddressDestination) {
                return androidx.navigation3.runtime.NavEntryKt.defaultContentKey(shippingAddressDestination);
            }
        }, (kotlin.jvm.functions.Function1) new kotlin.jvm.functions.Function1<com.paypal.oslo.feature.debitcard.servicing.di.ShippingAddressDestination, java.util.Map<java.lang.String, ? extends java.lang.Object>>() { // from class: com.paypal.oslo.feature.debitcard.servicing.di.ServicingNavigationEntriesKt$shippingAddressEntry$$inlined$entry$default$2
            @Override // kotlin.jvm.functions.Function1
            public final java.util.Map<java.lang.String, ? extends java.lang.Object> invoke(com.paypal.oslo.feature.debitcard.servicing.di.ShippingAddressDestination shippingAddressDestination) {
                return l2Metadata$default;
            }
        }, (kotlin.jvm.functions.Function3) composableLambdaInstance);
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$0bQ4YFd2SEL8eKv2oldbkFSvVZs(com.paypal.oslo.core.navigation.AppNavigator appNavigator, final com.paypal.oslo.feature.debitcard.servicing.di.DebitCardWalletManagementDestination debitCardWalletManagementDestination, androidx.compose.runtime.Composer composer, int i) {
        int i2;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(debitCardWalletManagementDestination, "");
        if ((i & 6) == 0) {
            i2 = (composer.changed(debitCardWalletManagementDestination) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if (composer.shouldExecute((i2 & 19) != 18, i2 & 1)) {
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventStart(28791184, i2, -1, "com.paypal.oslo.feature.debitcard.servicing.di.manageWalletEntry.<anonymous> (ServicingNavigationEntries.kt:205)");
            }
            boolean z = (i2 & 14) == 4;
            java.lang.Object rememberedValue = composer.rememberedValue();
            if (z || rememberedValue == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                rememberedValue = new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.debitcard.servicing.di.ServicingNavigationEntriesKt$$ExternalSyntheticLambda0
                    @Override // kotlin.jvm.functions.Function1
                    public final java.lang.Object invoke(java.lang.Object obj) {
                        return com.paypal.oslo.feature.debitcard.servicing.di.ServicingNavigationEntriesKt.$r8$lambda$tx0XhZMKCwiCUcnj9YZKF7TZJQQ(com.paypal.oslo.feature.debitcard.servicing.di.DebitCardWalletManagementDestination.this, (com.paypal.oslo.feature.debitcard.servicing.ui.managewallet.viewmodel.ManageWalletViewModel.Factory) obj);
                    }
                };
                composer.updateRememberedValue(rememberedValue);
            }
            kotlin.jvm.functions.Function1 function1 = (kotlin.jvm.functions.Function1) rememberedValue;
            androidx.view.ViewModelStoreOwner current = androidx.view.viewmodel.compose.LocalViewModelStoreOwner.INSTANCE.getCurrent(composer, androidx.view.viewmodel.compose.LocalViewModelStoreOwner.$stable);
            if (current == null) {
                throw new java.lang.IllegalStateException("No ViewModelStoreOwner was provided via LocalViewModelStoreOwner".toString());
            }
            com.paypal.oslo.feature.debitcard.servicing.ui.managewallet.ManageWalletScreenKt.ManageWalletScreen(appNavigator, null, (com.paypal.oslo.feature.debitcard.servicing.ui.managewallet.viewmodel.ManageWalletViewModel) androidx.view.viewmodel.compose.ViewModelKt.viewModel(kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(com.paypal.oslo.feature.debitcard.servicing.ui.managewallet.viewmodel.ManageWalletViewModel.class), current, (java.lang.String) null, androidx.hilt.lifecycle.viewmodel.compose.HiltViewModelKt.createHiltViewModelFactory(current, composer, 0), current instanceof androidx.view.HasDefaultViewModelProviderFactory ? dagger.hilt.android.lifecycle.HiltViewModelExtensions.withCreationCallback(((androidx.view.HasDefaultViewModelProviderFactory) current).getDefaultViewModelCreationExtras(), function1) : dagger.hilt.android.lifecycle.HiltViewModelExtensions.withCreationCallback(androidx.lifecycle.viewmodel.CreationExtras.Empty.INSTANCE, function1), composer, 0, 0), composer, 0, 2);
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventEnd();
            }
        } else {
            composer.skipToGroupEnd();
        }
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$141MFTsO5mBfhYYqR8dR6skN0ho(com.paypal.oslo.core.navigation.AppNavigator appNavigator, com.paypal.oslo.feature.debitcard.servicing.di.DebitCardActivationRouterDestination debitCardActivationRouterDestination, androidx.compose.runtime.Composer composer, int i) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(debitCardActivationRouterDestination, "");
        if ((i & 6) == 0) {
            i |= composer.changed(debitCardActivationRouterDestination) ? 4 : 2;
        }
        if (composer.shouldExecute((i & 19) != 18, i & 1)) {
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventStart(79325316, i, -1, "com.paypal.oslo.feature.debitcard.servicing.di.debitCardActivationRouterEntry.<anonymous> (ServicingNavigationEntries.kt:93)");
            }
            com.paypal.oslo.feature.debitcard.servicing.ui.activatecard.DebitCardActivationRouterKt.DebitCardActivationRouter(debitCardActivationRouterDestination.getDebitCardActivationInfo(), appNavigator, null, composer, 0, 4);
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventEnd();
            }
        } else {
            composer.skipToGroupEnd();
        }
        return kotlin.Unit.INSTANCE;
    }

    /* renamed from: $r8$lambda$1cbKdOXq4Qppm8_-H4y9ckwpJNQ, reason: not valid java name */
    public static /* synthetic */ kotlin.Unit m14302$r8$lambda$1cbKdOXq4Qppm8_H4y9ckwpJNQ(com.paypal.oslo.core.navigation.AppNavigator appNavigator, final java.lang.String str) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
        appNavigator.navigate(new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.debitcard.servicing.di.ServicingNavigationEntriesKt$$ExternalSyntheticLambda25
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return com.paypal.oslo.feature.debitcard.servicing.di.ServicingNavigationEntriesKt.$r8$lambda$2s94TRDBUiCLSj9R3TR5tvkrXLk(str, (com.paypal.oslo.core.navigation.AppNavigator.NavigationScope) obj);
            }
        });
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$2s94TRDBUiCLSj9R3TR5tvkrXLk(java.lang.String str, com.paypal.oslo.core.navigation.AppNavigator.NavigationScope navigationScope) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(navigationScope, "");
        navigationScope.goBackWithResult(new com.paypal.oslo.feature.debitcard.shared.navigation.result.FundingSourceSelectorNavResult(str));
        return kotlin.Unit.INSTANCE;
    }

    /* renamed from: $r8$lambda$8rDc7OiDEcQ1_-thzjR1cEsQ8bU, reason: not valid java name */
    public static /* synthetic */ kotlin.Unit m14303$r8$lambda$8rDc7OiDEcQ1_thzjR1cEsQ8bU(com.paypal.oslo.core.navigation.AppNavigator appNavigator, com.paypal.oslo.feature.debitcard.servicing.di.RequestPhysicalCardDecisionDestination requestPhysicalCardDecisionDestination, androidx.compose.runtime.Composer composer, int i) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(requestPhysicalCardDecisionDestination, "");
        if ((i & 6) == 0) {
            i |= composer.changed(requestPhysicalCardDecisionDestination) ? 4 : 2;
        }
        if (composer.shouldExecute((i & 19) != 18, i & 1)) {
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventStart(1067000662, i, -1, "com.paypal.oslo.feature.debitcard.servicing.di.requestPhysicalCardDecisionEntry.<anonymous> (ServicingNavigationEntries.kt:179)");
            }
            com.paypal.oslo.feature.debitcard.servicing.ui.requestphysicalcarddecision.RequestPhysicalCardRouterKt.RequestPhysicalCardRouter(appNavigator, requestPhysicalCardDecisionDestination.getRequestPhysicalCardInfo(), null, composer, 0, 4);
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventEnd();
            }
        } else {
            composer.skipToGroupEnd();
        }
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ com.paypal.oslo.feature.debitcard.servicing.ui.managesecondarycard.viewmodel.SecondaryCardManagementViewModel $r8$lambda$9QYMJ7DtA86TH2l7pj3QN6ioMHw(com.paypal.oslo.feature.debitcard.servicing.di.SecondaryCardManagementDestination secondaryCardManagementDestination, com.paypal.oslo.feature.debitcard.servicing.ui.managesecondarycard.viewmodel.SecondaryCardManagementViewModel.Factory factory) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(factory, "");
        return factory.create(secondaryCardManagementDestination.getProductName(), secondaryCardManagementDestination.getCardId());
    }

    /* renamed from: $r8$lambda$Bz4YniDoOKOdVTZ0Fgc5-SLBP6k, reason: not valid java name */
    public static /* synthetic */ com.paypal.oslo.feature.debitcard.servicing.ui.activatecard.viewmodel.DebitCardActivationViewModel m14304$r8$lambda$Bz4YniDoOKOdVTZ0Fgc5SLBP6k(com.paypal.oslo.feature.debitcard.servicing.di.DebitCardActivationDestination debitCardActivationDestination, com.paypal.oslo.feature.debitcard.servicing.ui.activatecard.viewmodel.DebitCardActivationViewModel.Factory factory) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(factory, "");
        return factory.create(debitCardActivationDestination.getActivateCardInfo());
    }

    public static /* synthetic */ com.paypal.oslo.feature.debitcard.servicing.ui.debitpin.viewmodel.DebitPinViewModel $r8$lambda$EkEhdC2K652YXQ1Aqi0MheR_tco(com.paypal.oslo.feature.debitcard.servicing.di.DebitPinDestination debitPinDestination, com.paypal.oslo.feature.debitcard.servicing.ui.debitpin.viewmodel.DebitPinViewModel.Factory factory) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(factory, "");
        return factory.create(debitPinDestination.getCardId(), debitPinDestination.getFlowType(), debitPinDestination.getPinMode());
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$FedTLALXKrCD_l6FnJoEvC3kIws(com.paypal.oslo.core.navigation.AppNavigator appNavigator, com.paypal.oslo.feature.debitcard.servicing.di.RequestPhysicalCardDestination requestPhysicalCardDestination, androidx.compose.runtime.Composer composer, int i) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(requestPhysicalCardDestination, "");
        if ((i & 6) == 0) {
            i |= composer.changed(requestPhysicalCardDestination) ? 4 : 2;
        }
        if (composer.shouldExecute((i & 19) != 18, i & 1)) {
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventStart(-1563013810, i, -1, "com.paypal.oslo.feature.debitcard.servicing.di.requestPhysicalCardEntry.<anonymous> (ServicingNavigationEntries.kt:170)");
            }
            com.paypal.oslo.feature.debitcard.servicing.ui.requestphysicalcard.RequestPhysicalCardScreenKt.RequestPhysicalCardScreen(appNavigator, requestPhysicalCardDestination.getRequestPhysicalCardInfo(), null, composer, 0, 4);
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventEnd();
            }
        } else {
            composer.skipToGroupEnd();
        }
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$G7QT7GXKRm8KjQkdYYQYhmvrD_k(com.paypal.oslo.core.navigation.AppNavigator appNavigator) {
        appNavigator.navigate(new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.debitcard.servicing.di.ServicingNavigationEntriesKt$$ExternalSyntheticLambda24
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return com.paypal.oslo.feature.debitcard.servicing.di.ServicingNavigationEntriesKt.$r8$lambda$jTiTvKvLylYXnjhmxK5iyZFaLF4((com.paypal.oslo.core.navigation.AppNavigator.NavigationScope) obj);
            }
        });
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$JjNlmEQS1G5e9c0KQjozFDsuD2s(com.paypal.oslo.core.navigation.AppNavigator appNavigator, final com.paypal.oslo.feature.debitcard.servicing.di.DebitCardServicingDestination debitCardServicingDestination, androidx.compose.runtime.Composer composer, int i) {
        int i2;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(debitCardServicingDestination, "");
        if ((i & 6) == 0) {
            i2 = (composer.changed(debitCardServicingDestination) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if (composer.shouldExecute((i2 & 19) != 18, i2 & 1)) {
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventStart(-502350132, i2, -1, "com.paypal.oslo.feature.debitcard.servicing.di.debitCardServicingEntry.<anonymous> (ServicingNavigationEntries.kt:70)");
            }
            final com.paypal.oslo.feature.debitcard.api.model.DebitCardFlow fromValue = com.paypal.oslo.feature.debitcard.api.model.DebitCardFlow.INSTANCE.fromValue(debitCardServicingDestination.getFlow());
            final com.paypal.oslo.feature.debitcard.api.model.DebitCardFlowIntent fromValue2 = com.paypal.oslo.feature.debitcard.api.model.DebitCardFlowIntent.INSTANCE.fromValue(debitCardServicingDestination.getFlowIntent());
            boolean z = (i2 & 14) == 4;
            boolean changed = composer.changed(fromValue == null ? -1 : fromValue.ordinal());
            boolean changed2 = composer.changed(fromValue2 != null ? fromValue2.ordinal() : -1);
            java.lang.Object rememberedValue = composer.rememberedValue();
            if ((changed | z | changed2) || rememberedValue == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                rememberedValue = new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.debitcard.servicing.di.ServicingNavigationEntriesKt$$ExternalSyntheticLambda12
                    @Override // kotlin.jvm.functions.Function1
                    public final java.lang.Object invoke(java.lang.Object obj) {
                        return com.paypal.oslo.feature.debitcard.servicing.di.ServicingNavigationEntriesKt.$r8$lambda$W4ruj1PexVmi1zNrG03ZfR8XaX4(com.paypal.oslo.feature.debitcard.servicing.di.DebitCardServicingDestination.this, fromValue, fromValue2, (com.paypal.oslo.feature.debitcard.servicing.ui.managecard.viewmodel.DebitCardManagementViewModel.Factory) obj);
                    }
                };
                composer.updateRememberedValue(rememberedValue);
            }
            kotlin.jvm.functions.Function1 function1 = (kotlin.jvm.functions.Function1) rememberedValue;
            androidx.view.ViewModelStoreOwner current = androidx.view.viewmodel.compose.LocalViewModelStoreOwner.INSTANCE.getCurrent(composer, androidx.view.viewmodel.compose.LocalViewModelStoreOwner.$stable);
            if (current == null) {
                throw new java.lang.IllegalStateException("No ViewModelStoreOwner was provided via LocalViewModelStoreOwner".toString());
            }
            com.paypal.oslo.feature.debitcard.servicing.ui.managecard.components.DebitCardManagementScreenKt.DebitCardManagementScreen(appNavigator, (com.paypal.oslo.feature.debitcard.servicing.ui.managecard.viewmodel.DebitCardManagementViewModel) androidx.view.viewmodel.compose.ViewModelKt.viewModel(kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(com.paypal.oslo.feature.debitcard.servicing.ui.managecard.viewmodel.DebitCardManagementViewModel.class), current, (java.lang.String) null, androidx.hilt.lifecycle.viewmodel.compose.HiltViewModelKt.createHiltViewModelFactory(current, composer, 0), current instanceof androidx.view.HasDefaultViewModelProviderFactory ? dagger.hilt.android.lifecycle.HiltViewModelExtensions.withCreationCallback(((androidx.view.HasDefaultViewModelProviderFactory) current).getDefaultViewModelCreationExtras(), function1) : dagger.hilt.android.lifecycle.HiltViewModelExtensions.withCreationCallback(androidx.lifecycle.viewmodel.CreationExtras.Empty.INSTANCE, function1), composer, 0, 0), composer, 0, 0);
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventEnd();
            }
        } else {
            composer.skipToGroupEnd();
        }
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$K3geBQ3MxczAUyoRHe80eClV7ys(final com.paypal.oslo.core.navigation.AppNavigator appNavigator, com.paypal.oslo.feature.debitcard.shared.di.FundingSourceSelectorDestination fundingSourceSelectorDestination, androidx.compose.runtime.Composer composer, int i) {
        int i2;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(fundingSourceSelectorDestination, "");
        if ((i & 6) == 0) {
            i2 = i | (composer.changed(fundingSourceSelectorDestination) ? 4 : 2);
        } else {
            i2 = i;
        }
        if (composer.shouldExecute((i2 & 19) != 18, i2 & 1)) {
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventStart(-866375924, i2, -1, "com.paypal.oslo.feature.debitcard.servicing.di.fundingSourceSelectorEntry.<anonymous> (ServicingNavigationEntries.kt:220)");
            }
            com.paypal.oslo.feature.debitcard.shared.ui.components.fsselector.FundingSourceSelectorConfig fundingSourceSelectorConfig = new com.paypal.oslo.feature.debitcard.shared.ui.components.fsselector.FundingSourceSelectorConfig(fundingSourceSelectorDestination.getVariant(), fundingSourceSelectorDestination.getProductName(), fundingSourceSelectorDestination.getInstrumentId(), fundingSourceSelectorDestination.getPreSelectedFundingSourceId(), com.paypal.oslo.feature.debitcard.shared.ui.components.fsselector.DisplayFormFactor.FULL_SCREEN, fundingSourceSelectorDestination.getEntryPoint());
            boolean changed = composer.changed(appNavigator);
            java.lang.Object rememberedValue = composer.rememberedValue();
            if (changed || rememberedValue == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                rememberedValue = new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.debitcard.servicing.di.ServicingNavigationEntriesKt$$ExternalSyntheticLambda9
                    @Override // kotlin.jvm.functions.Function1
                    public final java.lang.Object invoke(java.lang.Object obj) {
                        return com.paypal.oslo.feature.debitcard.servicing.di.ServicingNavigationEntriesKt.m14302$r8$lambda$1cbKdOXq4Qppm8_H4y9ckwpJNQ(com.paypal.oslo.core.navigation.AppNavigator.this, (java.lang.String) obj);
                    }
                };
                composer.updateRememberedValue(rememberedValue);
            }
            kotlin.jvm.functions.Function1 function1 = (kotlin.jvm.functions.Function1) rememberedValue;
            boolean changed2 = composer.changed(appNavigator);
            java.lang.Object rememberedValue2 = composer.rememberedValue();
            if (changed2 || rememberedValue2 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                rememberedValue2 = new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.feature.debitcard.servicing.di.ServicingNavigationEntriesKt$$ExternalSyntheticLambda10
                    @Override // kotlin.jvm.functions.Function0
                    public final java.lang.Object invoke() {
                        return com.paypal.oslo.feature.debitcard.servicing.di.ServicingNavigationEntriesKt.$r8$lambda$G7QT7GXKRm8KjQkdYYQYhmvrD_k(com.paypal.oslo.core.navigation.AppNavigator.this);
                    }
                };
                composer.updateRememberedValue(rememberedValue2);
            }
            com.paypal.oslo.feature.debitcard.shared.ui.components.fsselector.FundingSourceSelectorScreenKt.FundingSourceSelectorScreen(fundingSourceSelectorConfig, function1, appNavigator, null, (kotlin.jvm.functions.Function0) rememberedValue2, composer, 0, 8);
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventEnd();
            }
        } else {
            composer.skipToGroupEnd();
        }
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$Qo5dfRFbOP9Kx_zOfaC5HeltkyY(com.paypal.oslo.core.navigation.AppNavigator appNavigator, final com.paypal.oslo.feature.debitcard.servicing.di.DebitCardActivationDestination debitCardActivationDestination, androidx.compose.runtime.Composer composer, int i) {
        int i2;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(debitCardActivationDestination, "");
        if ((i & 6) == 0) {
            i2 = (composer.changed(debitCardActivationDestination) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if (composer.shouldExecute((i2 & 19) != 18, i2 & 1)) {
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventStart(2014006038, i2, -1, "com.paypal.oslo.feature.debitcard.servicing.di.debitCardActivationEntry.<anonymous> (ServicingNavigationEntries.kt:102)");
            }
            boolean z = (i2 & 14) == 4;
            java.lang.Object rememberedValue = composer.rememberedValue();
            if (z || rememberedValue == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                rememberedValue = new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.debitcard.servicing.di.ServicingNavigationEntriesKt$$ExternalSyntheticLambda18
                    @Override // kotlin.jvm.functions.Function1
                    public final java.lang.Object invoke(java.lang.Object obj) {
                        return com.paypal.oslo.feature.debitcard.servicing.di.ServicingNavigationEntriesKt.m14304$r8$lambda$Bz4YniDoOKOdVTZ0Fgc5SLBP6k(com.paypal.oslo.feature.debitcard.servicing.di.DebitCardActivationDestination.this, (com.paypal.oslo.feature.debitcard.servicing.ui.activatecard.viewmodel.DebitCardActivationViewModel.Factory) obj);
                    }
                };
                composer.updateRememberedValue(rememberedValue);
            }
            kotlin.jvm.functions.Function1 function1 = (kotlin.jvm.functions.Function1) rememberedValue;
            androidx.view.ViewModelStoreOwner current = androidx.view.viewmodel.compose.LocalViewModelStoreOwner.INSTANCE.getCurrent(composer, androidx.view.viewmodel.compose.LocalViewModelStoreOwner.$stable);
            if (current == null) {
                throw new java.lang.IllegalStateException("No ViewModelStoreOwner was provided via LocalViewModelStoreOwner".toString());
            }
            com.paypal.oslo.feature.debitcard.servicing.ui.activatecard.DebitCardActivationScreenKt.DebitCardActivationScreen(appNavigator, null, (com.paypal.oslo.feature.debitcard.servicing.ui.activatecard.viewmodel.DebitCardActivationViewModel) androidx.view.viewmodel.compose.ViewModelKt.viewModel(kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(com.paypal.oslo.feature.debitcard.servicing.ui.activatecard.viewmodel.DebitCardActivationViewModel.class), current, (java.lang.String) null, androidx.hilt.lifecycle.viewmodel.compose.HiltViewModelKt.createHiltViewModelFactory(current, composer, 0), current instanceof androidx.view.HasDefaultViewModelProviderFactory ? dagger.hilt.android.lifecycle.HiltViewModelExtensions.withCreationCallback(((androidx.view.HasDefaultViewModelProviderFactory) current).getDefaultViewModelCreationExtras(), function1) : dagger.hilt.android.lifecycle.HiltViewModelExtensions.withCreationCallback(androidx.lifecycle.viewmodel.CreationExtras.Empty.INSTANCE, function1), composer, 0, 0), composer, 0, 2);
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventEnd();
            }
        } else {
            composer.skipToGroupEnd();
        }
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$T4HZ0vmVqdUbwQpVZwhu2rG3Lq0(com.paypal.oslo.feature.debitcard.servicing.di.DebitPinDestination debitPinDestination, com.paypal.oslo.core.navigation.AppNavigator.NavigationScope navigationScope) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(navigationScope, "");
        navigationScope.popTo(new com.paypal.oslo.feature.debitcard.cardacquisition.di.DebitCardAcquisitionIntroDestination(com.paypal.oslo.feature.debitcard.api.model.DebitCardProductName.INSTANCE.fromValue(debitPinDestination.getProductName())));
        navigationScope.replaceTop(new com.paypal.oslo.feature.debitcard.cardacquisition.di.DebitCardCreationSuccessDestination(com.paypal.oslo.feature.debitcard.api.model.DebitCardProductName.INSTANCE.fromValue(debitPinDestination.getProductName()), debitPinDestination.isEligible()));
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ com.paypal.oslo.feature.debitcard.servicing.ui.managecard.viewmodel.DebitCardManagementViewModel $r8$lambda$W4ruj1PexVmi1zNrG03ZfR8XaX4(com.paypal.oslo.feature.debitcard.servicing.di.DebitCardServicingDestination debitCardServicingDestination, com.paypal.oslo.feature.debitcard.api.model.DebitCardFlow debitCardFlow, com.paypal.oslo.feature.debitcard.api.model.DebitCardFlowIntent debitCardFlowIntent, com.paypal.oslo.feature.debitcard.servicing.ui.managecard.viewmodel.DebitCardManagementViewModel.Factory factory) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(factory, "");
        return factory.create(debitCardServicingDestination.getProductName(), debitCardFlow, debitCardFlowIntent, debitCardServicingDestination.getDebitCardActivationResultType(), debitCardServicingDestination.getAcquisitionOnArrivalAction(), debitCardServicingDestination.getPostEnrollmentAction());
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$Z6tvgV5KnVs9vBAJ5CYHAZjEl2U(com.paypal.oslo.core.navigation.AppNavigator appNavigator, final com.paypal.oslo.feature.debitcard.servicing.di.ManageSecondaryCardHolderDestination manageSecondaryCardHolderDestination, androidx.compose.runtime.Composer composer, int i) {
        int i2;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(manageSecondaryCardHolderDestination, "");
        if ((i & 6) == 0) {
            i2 = (composer.changed(manageSecondaryCardHolderDestination) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if (composer.shouldExecute((i2 & 19) != 18, i2 & 1)) {
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventStart(-1847147164, i2, -1, "com.paypal.oslo.feature.debitcard.servicing.di.manageSecondaryCardHolderEntry.<anonymous> (ServicingNavigationEntries.kt:254)");
            }
            boolean z = (i2 & 14) == 4;
            java.lang.Object rememberedValue = composer.rememberedValue();
            if (z || rememberedValue == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                rememberedValue = new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.debitcard.servicing.di.ServicingNavigationEntriesKt$$ExternalSyntheticLambda23
                    @Override // kotlin.jvm.functions.Function1
                    public final java.lang.Object invoke(java.lang.Object obj) {
                        return com.paypal.oslo.feature.debitcard.servicing.di.ServicingNavigationEntriesKt.$r8$lambda$tsLxxsq45Iz6oJjxm9HasDh_NN0(com.paypal.oslo.feature.debitcard.servicing.di.ManageSecondaryCardHolderDestination.this, (com.paypal.oslo.feature.debitcard.servicing.ui.managesecondarycard.viewmodel.ManageSecondaryCardHolderViewModel.Factory) obj);
                    }
                };
                composer.updateRememberedValue(rememberedValue);
            }
            kotlin.jvm.functions.Function1 function1 = (kotlin.jvm.functions.Function1) rememberedValue;
            androidx.view.ViewModelStoreOwner current = androidx.view.viewmodel.compose.LocalViewModelStoreOwner.INSTANCE.getCurrent(composer, androidx.view.viewmodel.compose.LocalViewModelStoreOwner.$stable);
            if (current == null) {
                throw new java.lang.IllegalStateException("No ViewModelStoreOwner was provided via LocalViewModelStoreOwner".toString());
            }
            com.paypal.oslo.feature.debitcard.servicing.ui.managesecondarycard.ManageSecondaryCardHolderScreenKt.ManageSecondaryCardHolderScreen(appNavigator, (com.paypal.oslo.feature.debitcard.servicing.ui.managesecondarycard.viewmodel.ManageSecondaryCardHolderViewModel) androidx.view.viewmodel.compose.ViewModelKt.viewModel(kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(com.paypal.oslo.feature.debitcard.servicing.ui.managesecondarycard.viewmodel.ManageSecondaryCardHolderViewModel.class), current, (java.lang.String) null, androidx.hilt.lifecycle.viewmodel.compose.HiltViewModelKt.createHiltViewModelFactory(current, composer, 0), current instanceof androidx.view.HasDefaultViewModelProviderFactory ? dagger.hilt.android.lifecycle.HiltViewModelExtensions.withCreationCallback(((androidx.view.HasDefaultViewModelProviderFactory) current).getDefaultViewModelCreationExtras(), function1) : dagger.hilt.android.lifecycle.HiltViewModelExtensions.withCreationCallback(androidx.lifecycle.viewmodel.CreationExtras.Empty.INSTANCE, function1), composer, 0, 0), composer, 0);
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventEnd();
            }
        } else {
            composer.skipToGroupEnd();
        }
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$gOOeMQUdQWwsqPQid7mBVU_af_A(final com.paypal.oslo.core.navigation.AppNavigator appNavigator, final com.paypal.oslo.feature.debitcard.servicing.di.DebitPinDestination debitPinDestination, androidx.compose.runtime.Composer composer, int i) {
        int i2;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(debitPinDestination, "");
        if ((i & 6) == 0) {
            i2 = i | (composer.changed(debitPinDestination) ? 4 : 2);
        } else {
            i2 = i;
        }
        if (composer.shouldExecute((i2 & 19) != 18, i2 & 1)) {
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventStart(1207956828, i2, -1, "com.paypal.oslo.feature.debitcard.servicing.di.debitCardPinEntry.<anonymous> (ServicingNavigationEntries.kt:115)");
            }
            int i3 = i2 & 14;
            boolean z = i3 == 4;
            java.lang.Object rememberedValue = composer.rememberedValue();
            if (z || rememberedValue == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                rememberedValue = new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.debitcard.servicing.di.ServicingNavigationEntriesKt$$ExternalSyntheticLambda21
                    @Override // kotlin.jvm.functions.Function1
                    public final java.lang.Object invoke(java.lang.Object obj) {
                        return com.paypal.oslo.feature.debitcard.servicing.di.ServicingNavigationEntriesKt.$r8$lambda$EkEhdC2K652YXQ1Aqi0MheR_tco(com.paypal.oslo.feature.debitcard.servicing.di.DebitPinDestination.this, (com.paypal.oslo.feature.debitcard.servicing.ui.debitpin.viewmodel.DebitPinViewModel.Factory) obj);
                    }
                };
                composer.updateRememberedValue(rememberedValue);
            }
            kotlin.jvm.functions.Function1 function1 = (kotlin.jvm.functions.Function1) rememberedValue;
            androidx.view.ViewModelStoreOwner current = androidx.view.viewmodel.compose.LocalViewModelStoreOwner.INSTANCE.getCurrent(composer, androidx.view.viewmodel.compose.LocalViewModelStoreOwner.$stable);
            if (current == null) {
                throw new java.lang.IllegalStateException("No ViewModelStoreOwner was provided via LocalViewModelStoreOwner".toString());
            }
            com.paypal.oslo.feature.debitcard.servicing.ui.debitpin.viewmodel.DebitPinViewModel debitPinViewModel = (com.paypal.oslo.feature.debitcard.servicing.ui.debitpin.viewmodel.DebitPinViewModel) androidx.view.viewmodel.compose.ViewModelKt.viewModel(kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(com.paypal.oslo.feature.debitcard.servicing.ui.debitpin.viewmodel.DebitPinViewModel.class), current, (java.lang.String) null, androidx.hilt.lifecycle.viewmodel.compose.HiltViewModelKt.createHiltViewModelFactory(current, composer, 0), current instanceof androidx.view.HasDefaultViewModelProviderFactory ? dagger.hilt.android.lifecycle.HiltViewModelExtensions.withCreationCallback(((androidx.view.HasDefaultViewModelProviderFactory) current).getDefaultViewModelCreationExtras(), function1) : dagger.hilt.android.lifecycle.HiltViewModelExtensions.withCreationCallback(androidx.lifecycle.viewmodel.CreationExtras.Empty.INSTANCE, function1), composer, 0, 0);
            com.paypal.oslo.feature.debitcard.api.model.DebitCardProductName fromValue = com.paypal.oslo.feature.debitcard.api.model.DebitCardProductName.INSTANCE.fromValue(debitPinDestination.getProductName());
            boolean z2 = i3 == 4;
            boolean changed = composer.changed(appNavigator);
            java.lang.Object rememberedValue2 = composer.rememberedValue();
            if ((changed | z2) || rememberedValue2 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                rememberedValue2 = new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.debitcard.servicing.di.ServicingNavigationEntriesKt$$ExternalSyntheticLambda22
                    @Override // kotlin.jvm.functions.Function1
                    public final java.lang.Object invoke(java.lang.Object obj) {
                        return com.paypal.oslo.feature.debitcard.servicing.di.ServicingNavigationEntriesKt.$r8$lambda$m8BwD8WjNiPhmGiYWdyFcF5ekX0(com.paypal.oslo.feature.debitcard.servicing.di.DebitPinDestination.this, appNavigator, (java.lang.String) obj);
                    }
                };
                composer.updateRememberedValue(rememberedValue2);
            }
            com.paypal.oslo.feature.debitcard.servicing.ui.debitpin.DebitPinScreenKt.DebitPinScreen(appNavigator, null, fromValue, debitPinViewModel, (kotlin.jvm.functions.Function1) rememberedValue2, composer, 0, 2);
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventEnd();
            }
        } else {
            composer.skipToGroupEnd();
        }
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$gjLpIamr16DlY0okUYUHp3VIKDQ(com.paypal.oslo.core.navigation.AppNavigator appNavigator, com.paypal.oslo.feature.debitcard.api.navigation.DebitCardDestination debitCardDestination, androidx.compose.runtime.Composer composer, int i) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(debitCardDestination, "");
        if ((i & 6) == 0) {
            i |= (i & 8) == 0 ? composer.changed(debitCardDestination) : composer.changedInstance(debitCardDestination) ? 4 : 2;
        }
        if (composer.shouldExecute((i & 19) != 18, i & 1)) {
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventStart(1133782647, i, -1, "com.paypal.oslo.feature.debitcard.servicing.di.debitCardDestinationRouterEntry.<anonymous> (ServicingNavigationEntries.kt:60)");
            }
            com.paypal.oslo.feature.debitcard.api.model.DebitCardFlow fromValue = com.paypal.oslo.feature.debitcard.api.model.DebitCardFlow.INSTANCE.fromValue(debitCardDestination.getFlow());
            com.paypal.oslo.feature.debitcard.servicing.di.DebitCardServicingDestination debitCardAcquisitionIntroDestination = (fromValue != null && com.paypal.oslo.feature.debitcard.servicing.di.ServicingNavigationEntriesKt.WhenMappings.$EnumSwitchMapping$0[fromValue.ordinal()] == 1) ? new com.paypal.oslo.feature.debitcard.cardacquisition.di.DebitCardAcquisitionIntroDestination(debitCardDestination.getProductName()) : new com.paypal.oslo.feature.debitcard.servicing.di.DebitCardServicingDestination(debitCardDestination.getProductName(), debitCardDestination.getFlow(), debitCardDestination.getCardId(), debitCardDestination.getFlowIntent(), debitCardDestination.getEntryPoint(), (com.paypal.oslo.feature.debitcard.api.navigation.result.DebitCardActivationResultType) null, (com.paypal.oslo.feature.debitcard.api.navigation.DebitCardAcquisitionOnArrivalAction) null, (com.paypal.oslo.feature.debitcard.api.model.DebitCardPostEnrollmentAction) null, 224, (kotlin.jvm.internal.DefaultConstructorMarker) null);
            kotlin.Unit unit = kotlin.Unit.INSTANCE;
            boolean changed = composer.changed(appNavigator);
            boolean changedInstance = composer.changedInstance(debitCardAcquisitionIntroDestination);
            java.lang.Object rememberedValue = composer.rememberedValue();
            if ((changed | changedInstance) || rememberedValue == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                rememberedValue = (kotlin.jvm.functions.Function2) new com.paypal.oslo.feature.debitcard.servicing.di.ServicingNavigationEntriesKt$debitCardDestinationRouterEntry$1$1$1(appNavigator, debitCardAcquisitionIntroDestination, null);
                composer.updateRememberedValue(rememberedValue);
            }
            androidx.compose.runtime.EffectsKt.LaunchedEffect(unit, (kotlin.jvm.functions.Function2<? super kotlinx.coroutines.CoroutineScope, ? super kotlin.coroutines.Continuation<? super kotlin.Unit>, ? extends java.lang.Object>) rememberedValue, composer, 6);
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventEnd();
            }
        } else {
            composer.skipToGroupEnd();
        }
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$jTiTvKvLylYXnjhmxK5iyZFaLF4(com.paypal.oslo.core.navigation.AppNavigator.NavigationScope navigationScope) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(navigationScope, "");
        navigationScope.goBackWithResult(new com.paypal.oslo.feature.debitcard.shared.navigation.result.FundingSourceSelectorNavResult(null));
        return kotlin.Unit.INSTANCE;
    }

    /* renamed from: $r8$lambda$m-NjyPW56tsFCVaD2Au9TLltiaA, reason: not valid java name */
    public static /* synthetic */ com.paypal.oslo.feature.debitcard.servicing.ui.viewpin.viewmodel.ViewPinViewModel m14305$r8$lambda$mNjyPW56tsFCVaD2Au9TLltiaA(com.paypal.oslo.feature.debitcard.servicing.di.ViewPinDestination viewPinDestination, com.paypal.oslo.feature.debitcard.servicing.ui.viewpin.viewmodel.ViewPinViewModel.Factory factory) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(factory, "");
        return factory.create(viewPinDestination.getViewPinInfo().getDebitInstrumentId());
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$m8BwD8WjNiPhmGiYWdyFcF5ekX0(final com.paypal.oslo.feature.debitcard.servicing.di.DebitPinDestination debitPinDestination, com.paypal.oslo.core.navigation.AppNavigator appNavigator, java.lang.String str) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
        if (debitPinDestination.getFlowType() == com.paypal.oslo.feature.debitcard.servicing.domain.debitpin.model.SetDebitPinFlowType.ONBOARDING && debitPinDestination.getProductName() != null) {
            appNavigator.navigate(new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.debitcard.servicing.di.ServicingNavigationEntriesKt$$ExternalSyntheticLambda14
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj) {
                    return com.paypal.oslo.feature.debitcard.servicing.di.ServicingNavigationEntriesKt.$r8$lambda$T4HZ0vmVqdUbwQpVZwhu2rG3Lq0(com.paypal.oslo.feature.debitcard.servicing.di.DebitPinDestination.this, (com.paypal.oslo.core.navigation.AppNavigator.NavigationScope) obj);
                }
            });
        }
        return kotlin.Unit.INSTANCE;
    }

    /* renamed from: $r8$lambda$t-GzraDlNyTMcSIuif5P5Tn3htI, reason: not valid java name */
    public static /* synthetic */ kotlin.Unit m14306$r8$lambda$tGzraDlNyTMcSIuif5P5Tn3htI(com.paypal.oslo.core.navigation.AppNavigator appNavigator, final com.paypal.oslo.feature.debitcard.servicing.di.ViewPinDestination viewPinDestination, androidx.compose.runtime.Composer composer, int i) {
        int i2;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(viewPinDestination, "");
        if ((i & 6) == 0) {
            i2 = (composer.changed(viewPinDestination) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if (composer.shouldExecute((i2 & 19) != 18, i2 & 1)) {
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventStart(-1497522254, i2, -1, "com.paypal.oslo.feature.debitcard.servicing.di.debitCardViewPinEntry.<anonymous> (ServicingNavigationEntries.kt:155)");
            }
            boolean z = (i2 & 14) == 4;
            java.lang.Object rememberedValue = composer.rememberedValue();
            if (z || rememberedValue == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                rememberedValue = new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.debitcard.servicing.di.ServicingNavigationEntriesKt$$ExternalSyntheticLambda5
                    @Override // kotlin.jvm.functions.Function1
                    public final java.lang.Object invoke(java.lang.Object obj) {
                        return com.paypal.oslo.feature.debitcard.servicing.di.ServicingNavigationEntriesKt.m14305$r8$lambda$mNjyPW56tsFCVaD2Au9TLltiaA(com.paypal.oslo.feature.debitcard.servicing.di.ViewPinDestination.this, (com.paypal.oslo.feature.debitcard.servicing.ui.viewpin.viewmodel.ViewPinViewModel.Factory) obj);
                    }
                };
                composer.updateRememberedValue(rememberedValue);
            }
            kotlin.jvm.functions.Function1 function1 = (kotlin.jvm.functions.Function1) rememberedValue;
            androidx.view.ViewModelStoreOwner current = androidx.view.viewmodel.compose.LocalViewModelStoreOwner.INSTANCE.getCurrent(composer, androidx.view.viewmodel.compose.LocalViewModelStoreOwner.$stable);
            if (current == null) {
                throw new java.lang.IllegalStateException("No ViewModelStoreOwner was provided via LocalViewModelStoreOwner".toString());
            }
            com.paypal.oslo.feature.debitcard.servicing.ui.viewpin.ViewPinScreenKt.ViewPinScreen(appNavigator, viewPinDestination.getViewPinInfo(), null, (com.paypal.oslo.feature.debitcard.servicing.ui.viewpin.viewmodel.ViewPinViewModel) androidx.view.viewmodel.compose.ViewModelKt.viewModel(kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(com.paypal.oslo.feature.debitcard.servicing.ui.viewpin.viewmodel.ViewPinViewModel.class), current, (java.lang.String) null, androidx.hilt.lifecycle.viewmodel.compose.HiltViewModelKt.createHiltViewModelFactory(current, composer, 0), current instanceof androidx.view.HasDefaultViewModelProviderFactory ? dagger.hilt.android.lifecycle.HiltViewModelExtensions.withCreationCallback(((androidx.view.HasDefaultViewModelProviderFactory) current).getDefaultViewModelCreationExtras(), function1) : dagger.hilt.android.lifecycle.HiltViewModelExtensions.withCreationCallback(androidx.lifecycle.viewmodel.CreationExtras.Empty.INSTANCE, function1), composer, 0, 0), composer, 0, 4);
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventEnd();
            }
        } else {
            composer.skipToGroupEnd();
        }
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ com.paypal.oslo.feature.debitcard.servicing.ui.managesecondarycard.viewmodel.ManageSecondaryCardHolderViewModel $r8$lambda$tsLxxsq45Iz6oJjxm9HasDh_NN0(com.paypal.oslo.feature.debitcard.servicing.di.ManageSecondaryCardHolderDestination manageSecondaryCardHolderDestination, com.paypal.oslo.feature.debitcard.servicing.ui.managesecondarycard.viewmodel.ManageSecondaryCardHolderViewModel.Factory factory) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(factory, "");
        return factory.create(manageSecondaryCardHolderDestination.getProductName());
    }

    public static /* synthetic */ com.paypal.oslo.feature.debitcard.servicing.ui.managewallet.viewmodel.ManageWalletViewModel $r8$lambda$tx0XhZMKCwiCUcnj9YZKF7TZJQQ(com.paypal.oslo.feature.debitcard.servicing.di.DebitCardWalletManagementDestination debitCardWalletManagementDestination, com.paypal.oslo.feature.debitcard.servicing.ui.managewallet.viewmodel.ManageWalletViewModel.Factory factory) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(factory, "");
        return factory.create(debitCardWalletManagementDestination.getProductName(), debitCardWalletManagementDestination.getDisplayProductName());
    }

    /* renamed from: $r8$lambda$u5zK9xvZ2AsS8-Czjib_eBPAhpA, reason: not valid java name */
    public static /* synthetic */ kotlin.Unit m14307$r8$lambda$u5zK9xvZ2AsS8Czjib_eBPAhpA(com.paypal.oslo.core.navigation.AppNavigator appNavigator, final com.paypal.oslo.feature.debitcard.servicing.di.SecondaryCardManagementDestination secondaryCardManagementDestination, androidx.compose.runtime.Composer composer, int i) {
        int i2;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(secondaryCardManagementDestination, "");
        if ((i & 6) == 0) {
            i2 = (composer.changed(secondaryCardManagementDestination) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if (composer.shouldExecute((i2 & 19) != 18, i2 & 1)) {
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventStart(-1071622036, i2, -1, "com.paypal.oslo.feature.debitcard.servicing.di.secondaryCardManagementEntry.<anonymous> (ServicingNavigationEntries.kt:188)");
            }
            boolean z = (i2 & 14) == 4;
            java.lang.Object rememberedValue = composer.rememberedValue();
            if (z || rememberedValue == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                rememberedValue = new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.debitcard.servicing.di.ServicingNavigationEntriesKt$$ExternalSyntheticLambda13
                    @Override // kotlin.jvm.functions.Function1
                    public final java.lang.Object invoke(java.lang.Object obj) {
                        return com.paypal.oslo.feature.debitcard.servicing.di.ServicingNavigationEntriesKt.$r8$lambda$9QYMJ7DtA86TH2l7pj3QN6ioMHw(com.paypal.oslo.feature.debitcard.servicing.di.SecondaryCardManagementDestination.this, (com.paypal.oslo.feature.debitcard.servicing.ui.managesecondarycard.viewmodel.SecondaryCardManagementViewModel.Factory) obj);
                    }
                };
                composer.updateRememberedValue(rememberedValue);
            }
            kotlin.jvm.functions.Function1 function1 = (kotlin.jvm.functions.Function1) rememberedValue;
            androidx.view.ViewModelStoreOwner current = androidx.view.viewmodel.compose.LocalViewModelStoreOwner.INSTANCE.getCurrent(composer, androidx.view.viewmodel.compose.LocalViewModelStoreOwner.$stable);
            if (current == null) {
                throw new java.lang.IllegalStateException("No ViewModelStoreOwner was provided via LocalViewModelStoreOwner".toString());
            }
            com.paypal.oslo.feature.debitcard.servicing.ui.managesecondarycard.SecondaryCardManagementScreenKt.SecondaryCardManagementScreen((com.paypal.oslo.feature.debitcard.servicing.ui.managesecondarycard.viewmodel.SecondaryCardManagementViewModel) androidx.view.viewmodel.compose.ViewModelKt.viewModel(kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(com.paypal.oslo.feature.debitcard.servicing.ui.managesecondarycard.viewmodel.SecondaryCardManagementViewModel.class), current, (java.lang.String) null, androidx.hilt.lifecycle.viewmodel.compose.HiltViewModelKt.createHiltViewModelFactory(current, composer, 0), current instanceof androidx.view.HasDefaultViewModelProviderFactory ? dagger.hilt.android.lifecycle.HiltViewModelExtensions.withCreationCallback(((androidx.view.HasDefaultViewModelProviderFactory) current).getDefaultViewModelCreationExtras(), function1) : dagger.hilt.android.lifecycle.HiltViewModelExtensions.withCreationCallback(androidx.lifecycle.viewmodel.CreationExtras.Empty.INSTANCE, function1), composer, 0, 0), appNavigator, composer, 0);
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventEnd();
            }
        } else {
            composer.skipToGroupEnd();
        }
        return kotlin.Unit.INSTANCE;
    }

    /* renamed from: $r8$lambda$uDHc-VVj6CBt-e23v-u85hXkuLQ, reason: not valid java name */
    public static /* synthetic */ kotlin.Unit m14308$r8$lambda$uDHcVVj6CBte23vu85hXkuLQ(com.paypal.oslo.core.navigation.AppNavigator appNavigator, com.paypal.oslo.feature.debitcard.servicing.di.ShippingAddressDestination shippingAddressDestination, androidx.compose.runtime.Composer composer, int i) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(shippingAddressDestination, "");
        if ((i & 6) == 0) {
            i |= composer.changed(shippingAddressDestination) ? 4 : 2;
        }
        if (composer.shouldExecute((i & 19) != 18, i & 1)) {
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventStart(-774712978, i, -1, "com.paypal.oslo.feature.debitcard.servicing.di.shippingAddressEntry.<anonymous> (ServicingNavigationEntries.kt:265)");
            }
            com.paypal.oslo.feature.debitcard.shared.ui.addressselection.ShippingAddressSelectionScreenKt.ShippingAddressSelectionScreen(appNavigator, shippingAddressDestination.getDebitInstrumentId(), shippingAddressDestination.getProductName(), composer, 0);
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventEnd();
            }
        } else {
            composer.skipToGroupEnd();
        }
        return kotlin.Unit.INSTANCE;
    }

    @kotlin.Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[com.paypal.oslo.feature.debitcard.api.model.DebitCardFlow.values().length];
            try {
                iArr[com.paypal.oslo.feature.debitcard.api.model.DebitCardFlow.CREATE.ordinal()] = 1;
            } catch (java.lang.NoSuchFieldError unused) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }
}
