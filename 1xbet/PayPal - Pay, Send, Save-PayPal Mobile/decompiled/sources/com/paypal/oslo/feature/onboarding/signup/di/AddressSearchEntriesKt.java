package com.paypal.oslo.feature.onboarding.signup.di;

@kotlin.Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u001a!\u0010\u0005\u001a\u00020\u0004*\b\u0012\u0004\u0012\u00020\u00010\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\u0000¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Landroidx/navigation3/runtime/EntryProviderScope;", "", "Lcom/paypal/oslo/core/navigation/AppNavigator;", "navigator", "", "addressSearchModalEntry", "(Landroidx/navigation3/runtime/EntryProviderScope;Lcom/paypal/oslo/core/navigation/AppNavigator;)V"}, k = 2, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class AddressSearchEntriesKt {
    /* JADX WARN: Type inference failed for: r1v0, types: [T, com.paypal.oslo.feature.onboarding.signup.di.AddressSearchEntriesKt$$ExternalSyntheticLambda1] */
    public static final void addressSearchModalEntry(androidx.navigation3.runtime.EntryProviderScope<java.lang.Object> entryProviderScope, final com.paypal.oslo.core.navigation.AppNavigator appNavigator) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(entryProviderScope, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(appNavigator, "");
        final kotlin.jvm.internal.Ref.ObjectRef objectRef = new kotlin.jvm.internal.Ref.ObjectRef();
        objectRef.element = new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.feature.onboarding.signup.di.AddressSearchEntriesKt$$ExternalSyntheticLambda1
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                kotlin.Unit unit;
                unit = kotlin.Unit.INSTANCE;
                return unit;
            }
        };
        kotlin.jvm.functions.Function0 function0 = new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.feature.onboarding.signup.di.AddressSearchEntriesKt$$ExternalSyntheticLambda2
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return com.paypal.oslo.feature.onboarding.signup.di.AddressSearchEntriesKt.$r8$lambda$fKOLGffUnjn_Mi2i0sLOvbS1joI(kotlin.jvm.internal.Ref.ObjectRef.this);
            }
        };
        final java.util.Map bottomSheetMetadata$default = com.paypal.oslo.core.navigation.NavigationMetadataBuildersKt.bottomSheetMetadata$default("", false, false, false, null, function0, function0, 22, null);
        androidx.compose.runtime.internal.ComposableLambda composableLambdaInstance = androidx.compose.runtime.internal.ComposableLambdaKt.composableLambdaInstance(-878436659, true, new kotlin.jvm.functions.Function3() { // from class: com.paypal.oslo.feature.onboarding.signup.di.AddressSearchEntriesKt$$ExternalSyntheticLambda3
            @Override // kotlin.jvm.functions.Function3
            public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2, java.lang.Object obj3) {
                return com.paypal.oslo.feature.onboarding.signup.di.AddressSearchEntriesKt.$r8$lambda$0CCfPt7ilSiK5ADlJFjGEjGyVYI(kotlin.jvm.internal.Ref.ObjectRef.this, appNavigator, (com.paypal.oslo.feature.onboarding.api.navigation.AddressSearchModalDestination) obj, (androidx.compose.runtime.Composer) obj2, ((java.lang.Integer) obj3).intValue());
            }
        });
        entryProviderScope.addEntryProvider((kotlin.reflect.KClass) kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(com.paypal.oslo.feature.onboarding.api.navigation.AddressSearchModalDestination.class), (kotlin.jvm.functions.Function1) new kotlin.jvm.functions.Function1<com.paypal.oslo.feature.onboarding.api.navigation.AddressSearchModalDestination, java.lang.Object>() { // from class: com.paypal.oslo.feature.onboarding.signup.di.AddressSearchEntriesKt$addressSearchModalEntry$$inlined$entry$default$1
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(com.paypal.oslo.feature.onboarding.api.navigation.AddressSearchModalDestination addressSearchModalDestination) {
                return androidx.navigation3.runtime.NavEntryKt.defaultContentKey(addressSearchModalDestination);
            }
        }, (kotlin.jvm.functions.Function1) new kotlin.jvm.functions.Function1<com.paypal.oslo.feature.onboarding.api.navigation.AddressSearchModalDestination, java.util.Map<java.lang.String, ? extends java.lang.Object>>() { // from class: com.paypal.oslo.feature.onboarding.signup.di.AddressSearchEntriesKt$addressSearchModalEntry$$inlined$entry$default$2
            @Override // kotlin.jvm.functions.Function1
            public final java.util.Map<java.lang.String, ? extends java.lang.Object> invoke(com.paypal.oslo.feature.onboarding.api.navigation.AddressSearchModalDestination addressSearchModalDestination) {
                return bottomSheetMetadata$default;
            }
        }, (kotlin.jvm.functions.Function3) composableLambdaInstance);
    }

    /* JADX WARN: Type inference failed for: r1v3, types: [T, kotlin.jvm.functions.Function0] */
    public static /* synthetic */ kotlin.Unit $r8$lambda$0CCfPt7ilSiK5ADlJFjGEjGyVYI(kotlin.jvm.internal.Ref.ObjectRef objectRef, final com.paypal.oslo.core.navigation.AppNavigator appNavigator, final com.paypal.oslo.feature.onboarding.api.navigation.AddressSearchModalDestination addressSearchModalDestination, androidx.compose.runtime.Composer composer, int i) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(addressSearchModalDestination, "");
        if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
            androidx.compose.runtime.ComposerKt.traceEventStart(-878436659, i, -1, "com.paypal.oslo.feature.onboarding.signup.di.addressSearchModalEntry.<anonymous> (AddressSearchEntries.kt:45)");
        }
        boolean changedInstance = composer.changedInstance(addressSearchModalDestination);
        boolean changed = composer.changed(appNavigator);
        java.lang.Object rememberedValue = composer.rememberedValue();
        if ((changedInstance | changed) || rememberedValue == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
            rememberedValue = new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.feature.onboarding.signup.di.AddressSearchEntriesKt$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function0
                public final java.lang.Object invoke() {
                    return com.paypal.oslo.feature.onboarding.signup.di.AddressSearchEntriesKt.$r8$lambda$3JE84ByIg73aPhiUazxtULQwGb0(com.paypal.oslo.feature.onboarding.api.navigation.AddressSearchModalDestination.this, appNavigator);
                }
            };
            composer.updateRememberedValue(rememberedValue);
        }
        objectRef.element = (kotlin.jvm.functions.Function0) rememberedValue;
        com.paypal.oslo.feature.onboarding.signup.address.ui.AddressSearchScreenKt.m16223AddressSearchScreenPMBouqM(addressSearchModalDestination.m15884getCountryCodeALGuh4w(), addressSearchModalDestination.getFlowName(), appNavigator, null, null, composer, 0, 24);
        if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
            androidx.compose.runtime.ComposerKt.traceEventEnd();
        }
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$3JE84ByIg73aPhiUazxtULQwGb0(com.paypal.oslo.feature.onboarding.api.navigation.AddressSearchModalDestination addressSearchModalDestination, com.paypal.oslo.core.navigation.AppNavigator appNavigator) {
        com.paypal.oslo.feature.onboarding.signup.address.analytics.AddressSearchAnalytics.INSTANCE.trackDismiss$onboarding_prodRelease(addressSearchModalDestination.getFlowName());
        appNavigator.navigate(new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.onboarding.signup.di.AddressSearchEntriesKt$$ExternalSyntheticLambda4
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return com.paypal.oslo.feature.onboarding.signup.di.AddressSearchEntriesKt.m16286$r8$lambda$YUCOvQl0BUJGhjfFwfaC3hfHI((com.paypal.oslo.core.navigation.AppNavigator.NavigationScope) obj);
            }
        });
        return kotlin.Unit.INSTANCE;
    }

    /* renamed from: $r8$lambda$Y-UCOvQl0BUJGh-jfFwfaC3hfHI, reason: not valid java name */
    public static /* synthetic */ kotlin.Unit m16286$r8$lambda$YUCOvQl0BUJGhjfFwfaC3hfHI(com.paypal.oslo.core.navigation.AppNavigator.NavigationScope navigationScope) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(navigationScope, "");
        navigationScope.goBack();
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$fKOLGffUnjn_Mi2i0sLOvbS1joI(kotlin.jvm.internal.Ref.ObjectRef objectRef) {
        ((kotlin.jvm.functions.Function0) objectRef.element).invoke();
        return kotlin.Unit.INSTANCE;
    }
}
