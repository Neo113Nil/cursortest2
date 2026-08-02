package com.paypal.oslo.feature.debitcard.servicing.di;

@kotlin.Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u001a!\u0010\u0005\u001a\u00020\u0004*\b\u0012\u0004\u0012\u00020\u00010\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\u0000¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Landroidx/navigation3/runtime/EntryProviderScope;", "", "Lcom/paypal/oslo/core/navigation/AppNavigator;", "navigator", "", "cardConnectEntry", "(Landroidx/navigation3/runtime/EntryProviderScope;Lcom/paypal/oslo/core/navigation/AppNavigator;)V"}, k = 2, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class CardConnectNavigationEntriesKt {
    public static final void cardConnectEntry(androidx.navigation3.runtime.EntryProviderScope<java.lang.Object> entryProviderScope, final com.paypal.oslo.core.navigation.AppNavigator appNavigator) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(entryProviderScope, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(appNavigator, "");
        final java.util.Map l2Metadata$default = com.paypal.oslo.core.navigation.NavigationMetadataBuildersKt.l2Metadata$default(false, null, false, null, null, false, null, null, false, 510, null);
        androidx.compose.runtime.internal.ComposableLambda composableLambdaInstance = androidx.compose.runtime.internal.ComposableLambdaKt.composableLambdaInstance(-2116448114, true, new kotlin.jvm.functions.Function3() { // from class: com.paypal.oslo.feature.debitcard.servicing.di.CardConnectNavigationEntriesKt$$ExternalSyntheticLambda1
            @Override // kotlin.jvm.functions.Function3
            public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2, java.lang.Object obj3) {
                return com.paypal.oslo.feature.debitcard.servicing.di.CardConnectNavigationEntriesKt.m14292$r8$lambda$PFk1TXejfk95fGXXZjp0sY4kcA(com.paypal.oslo.core.navigation.AppNavigator.this, (com.paypal.oslo.feature.debitcard.api.navigation.CardConnectDestination) obj, (androidx.compose.runtime.Composer) obj2, ((java.lang.Integer) obj3).intValue());
            }
        });
        entryProviderScope.addEntryProvider((kotlin.reflect.KClass) kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(com.paypal.oslo.feature.debitcard.api.navigation.CardConnectDestination.class), (kotlin.jvm.functions.Function1) new kotlin.jvm.functions.Function1<com.paypal.oslo.feature.debitcard.api.navigation.CardConnectDestination, java.lang.Object>() { // from class: com.paypal.oslo.feature.debitcard.servicing.di.CardConnectNavigationEntriesKt$cardConnectEntry$$inlined$entry$default$1
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(com.paypal.oslo.feature.debitcard.api.navigation.CardConnectDestination cardConnectDestination) {
                return androidx.navigation3.runtime.NavEntryKt.defaultContentKey(cardConnectDestination);
            }
        }, (kotlin.jvm.functions.Function1) new kotlin.jvm.functions.Function1<com.paypal.oslo.feature.debitcard.api.navigation.CardConnectDestination, java.util.Map<java.lang.String, ? extends java.lang.Object>>() { // from class: com.paypal.oslo.feature.debitcard.servicing.di.CardConnectNavigationEntriesKt$cardConnectEntry$$inlined$entry$default$2
            @Override // kotlin.jvm.functions.Function1
            public final java.util.Map<java.lang.String, ? extends java.lang.Object> invoke(com.paypal.oslo.feature.debitcard.api.navigation.CardConnectDestination cardConnectDestination) {
                return l2Metadata$default;
            }
        }, (kotlin.jvm.functions.Function3) composableLambdaInstance);
    }

    public static /* synthetic */ com.paypal.oslo.feature.debitcard.servicing.ui.cardconnect.viewmodel.CardConnectViewModel $r8$lambda$CKY7TKPXhgr1SAUuQOSj_sy0xsw(com.paypal.oslo.feature.debitcard.api.navigation.CardConnectDestination cardConnectDestination, com.paypal.oslo.feature.debitcard.servicing.ui.cardconnect.viewmodel.CardConnectViewModel.Factory factory) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(factory, "");
        return factory.create(cardConnectDestination.getCardProduct(), cardConnectDestination.getInstrumentId());
    }

    /* renamed from: $r8$lambda$PFk-1TXejfk95fGXXZjp0sY4kcA, reason: not valid java name */
    public static /* synthetic */ kotlin.Unit m14292$r8$lambda$PFk1TXejfk95fGXXZjp0sY4kcA(com.paypal.oslo.core.navigation.AppNavigator appNavigator, final com.paypal.oslo.feature.debitcard.api.navigation.CardConnectDestination cardConnectDestination, androidx.compose.runtime.Composer composer, int i) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(cardConnectDestination, "");
        if ((i & 6) == 0) {
            i |= (i & 8) == 0 ? composer.changed(cardConnectDestination) : composer.changedInstance(cardConnectDestination) ? 4 : 2;
        }
        boolean z = true;
        if (composer.shouldExecute((i & 19) != 18, i & 1)) {
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventStart(-2116448114, i, -1, "com.paypal.oslo.feature.debitcard.servicing.di.cardConnectEntry.<anonymous> (CardConnectNavigationEntries.kt:23)");
            }
            if ((i & 14) != 4 && ((i & 8) == 0 || !composer.changedInstance(cardConnectDestination))) {
                z = false;
            }
            java.lang.Object rememberedValue = composer.rememberedValue();
            if (z || rememberedValue == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                rememberedValue = new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.debitcard.servicing.di.CardConnectNavigationEntriesKt$$ExternalSyntheticLambda0
                    @Override // kotlin.jvm.functions.Function1
                    public final java.lang.Object invoke(java.lang.Object obj) {
                        return com.paypal.oslo.feature.debitcard.servicing.di.CardConnectNavigationEntriesKt.$r8$lambda$CKY7TKPXhgr1SAUuQOSj_sy0xsw(com.paypal.oslo.feature.debitcard.api.navigation.CardConnectDestination.this, (com.paypal.oslo.feature.debitcard.servicing.ui.cardconnect.viewmodel.CardConnectViewModel.Factory) obj);
                    }
                };
                composer.updateRememberedValue(rememberedValue);
            }
            kotlin.jvm.functions.Function1 function1 = (kotlin.jvm.functions.Function1) rememberedValue;
            androidx.view.ViewModelStoreOwner current = androidx.view.viewmodel.compose.LocalViewModelStoreOwner.INSTANCE.getCurrent(composer, androidx.view.viewmodel.compose.LocalViewModelStoreOwner.$stable);
            if (current == null) {
                throw new java.lang.IllegalStateException("No ViewModelStoreOwner was provided via LocalViewModelStoreOwner".toString());
            }
            com.paypal.oslo.feature.debitcard.servicing.ui.cardconnect.CardConnectScreenKt.CardConnectScreen(appNavigator, (com.paypal.oslo.feature.debitcard.servicing.ui.cardconnect.viewmodel.CardConnectViewModel) androidx.view.viewmodel.compose.ViewModelKt.viewModel(kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(com.paypal.oslo.feature.debitcard.servicing.ui.cardconnect.viewmodel.CardConnectViewModel.class), current, (java.lang.String) null, androidx.hilt.lifecycle.viewmodel.compose.HiltViewModelKt.createHiltViewModelFactory(current, composer, 0), current instanceof androidx.view.HasDefaultViewModelProviderFactory ? dagger.hilt.android.lifecycle.HiltViewModelExtensions.withCreationCallback(((androidx.view.HasDefaultViewModelProviderFactory) current).getDefaultViewModelCreationExtras(), function1) : dagger.hilt.android.lifecycle.HiltViewModelExtensions.withCreationCallback(androidx.lifecycle.viewmodel.CreationExtras.Empty.INSTANCE, function1), composer, 0, 0), null, composer, 0, 4);
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventEnd();
            }
        } else {
            composer.skipToGroupEnd();
        }
        return kotlin.Unit.INSTANCE;
    }
}
