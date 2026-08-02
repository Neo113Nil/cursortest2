package com.paypal.oslo.feature.shoppingrewards.shopping.common.di;

@kotlin.Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÁ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J2\u0010\u000b\u001a\u001d\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00010\u0007\u0012\u0004\u0012\u00020\b0\u0006j\u0002`\t¢\u0006\u0002\b\n2\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u000b\u0010\f"}, d2 = {"Lcom/paypal/oslo/feature/shoppingrewards/shopping/common/di/ShoppingUiModule;", "", "<init>", "()V", "Lcom/paypal/oslo/core/navigation/AppNavigator;", "navigator", "Lkotlin/Function1;", "Landroidx/navigation3/runtime/EntryProviderScope;", "", "Lcom/paypal/oslo/core/navigation/EntryProviderInstaller;", "Lkotlin/ExtensionFunctionType;", "provideShoppingIABEntryProviderInstaller", "(Lcom/paypal/oslo/core/navigation/AppNavigator;)Lkotlin/jvm/functions/Function1;"}, k = 1, mv = {2, 3, 0}, xi = 48)
@dagger.Module
/* loaded from: classes15.dex */
public final class ShoppingUiModule {
    public static final int $stable = 0;
    public static final com.paypal.oslo.feature.shoppingrewards.shopping.common.di.ShoppingUiModule INSTANCE = new com.paypal.oslo.feature.shoppingrewards.shopping.common.di.ShoppingUiModule();

    private ShoppingUiModule() {
    }

    @dagger.Provides
    @dagger.multibindings.IntoSet
    public final kotlin.jvm.functions.Function1<androidx.navigation3.runtime.EntryProviderScope<java.lang.Object>, kotlin.Unit> provideShoppingIABEntryProviderInstaller(final com.paypal.oslo.core.navigation.AppNavigator navigator) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(navigator, "");
        return new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.shoppingrewards.shopping.common.di.ShoppingUiModule$$ExternalSyntheticLambda4
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return com.paypal.oslo.feature.shoppingrewards.shopping.common.di.ShoppingUiModule.$r8$lambda$2GkA3wsEwgcJWSPm3Unsl83PGuI(com.paypal.oslo.core.navigation.AppNavigator.this, (androidx.navigation3.runtime.EntryProviderScope) obj);
            }
        };
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$2GkA3wsEwgcJWSPm3Unsl83PGuI(final com.paypal.oslo.core.navigation.AppNavigator appNavigator, androidx.navigation3.runtime.EntryProviderScope entryProviderScope) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(entryProviderScope, "");
        final java.util.Map l2Metadata$default = com.paypal.oslo.core.navigation.NavigationMetadataBuildersKt.l2Metadata$default(false, null, false, null, null, false, null, null, false, 510, null);
        androidx.compose.runtime.internal.ComposableLambda composableLambdaInstance = androidx.compose.runtime.internal.ComposableLambdaKt.composableLambdaInstance(-1314380967, true, new kotlin.jvm.functions.Function3() { // from class: com.paypal.oslo.feature.shoppingrewards.shopping.common.di.ShoppingUiModule$$ExternalSyntheticLambda3
            @Override // kotlin.jvm.functions.Function3
            public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2, java.lang.Object obj3) {
                return com.paypal.oslo.feature.shoppingrewards.shopping.common.di.ShoppingUiModule.$r8$lambda$WLbwBGbYEiANF4kuENfLIVrTpiI(com.paypal.oslo.core.navigation.AppNavigator.this, (com.paypal.oslo.feature.shoppingrewards.api.shopping.navigation.ShoppingIABDestination) obj, (androidx.compose.runtime.Composer) obj2, ((java.lang.Integer) obj3).intValue());
            }
        });
        entryProviderScope.addEntryProvider(kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(com.paypal.oslo.feature.shoppingrewards.api.shopping.navigation.ShoppingIABDestination.class), (kotlin.jvm.functions.Function1) new kotlin.jvm.functions.Function1<com.paypal.oslo.feature.shoppingrewards.api.shopping.navigation.ShoppingIABDestination, java.lang.Object>() { // from class: com.paypal.oslo.feature.shoppingrewards.shopping.common.di.ShoppingUiModule$provideShoppingIABEntryProviderInstaller$lambda$0$$inlined$entry$default$1
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(com.paypal.oslo.feature.shoppingrewards.api.shopping.navigation.ShoppingIABDestination shoppingIABDestination) {
                return androidx.navigation3.runtime.NavEntryKt.defaultContentKey(shoppingIABDestination);
            }
        }, (kotlin.jvm.functions.Function1) new kotlin.jvm.functions.Function1<com.paypal.oslo.feature.shoppingrewards.api.shopping.navigation.ShoppingIABDestination, java.util.Map<java.lang.String, ? extends java.lang.Object>>() { // from class: com.paypal.oslo.feature.shoppingrewards.shopping.common.di.ShoppingUiModule$provideShoppingIABEntryProviderInstaller$lambda$0$$inlined$entry$default$2
            @Override // kotlin.jvm.functions.Function1
            public final java.util.Map<java.lang.String, ? extends java.lang.Object> invoke(com.paypal.oslo.feature.shoppingrewards.api.shopping.navigation.ShoppingIABDestination shoppingIABDestination) {
                return l2Metadata$default;
            }
        }, (kotlin.jvm.functions.Function3) composableLambdaInstance);
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$9LwJaPd0y1vzmz703VZsLB5JVig(com.paypal.oslo.core.navigation.AppNavigator appNavigator) {
        appNavigator.navigate(new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.shoppingrewards.shopping.common.di.ShoppingUiModule$$ExternalSyntheticLambda5
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return com.paypal.oslo.feature.shoppingrewards.shopping.common.di.ShoppingUiModule.$r8$lambda$seWb9z1KA4L7gCEmXe7k0n4QWgE((com.paypal.oslo.core.navigation.AppNavigator.NavigationScope) obj);
            }
        });
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$KvjocWieSQ3Ya_Z7pL50YXKRYPw(com.paypal.oslo.core.navigation.AppNavigator appNavigator, final java.lang.String str) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
        if (!kotlin.text.StringsKt.isBlank(str)) {
            com.paypal.android.logger.Logger.d$default(com.paypal.oslo.feature.shoppingrewards.LoggerKt.log, "Launching terms view", null, kotlin.collections.MapsKt.mapOf(kotlin.TuplesKt.to("url", str)), 2, null);
            appNavigator.navigate(new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.shoppingrewards.shopping.common.di.ShoppingUiModule$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj) {
                    return com.paypal.oslo.feature.shoppingrewards.shopping.common.di.ShoppingUiModule.$r8$lambda$PUjegi8N5PgGIDtcY9QQ8LgwrDg(str, (com.paypal.oslo.core.navigation.AppNavigator.NavigationScope) obj);
                }
            });
        }
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$PUjegi8N5PgGIDtcY9QQ8LgwrDg(java.lang.String str, com.paypal.oslo.core.navigation.AppNavigator.NavigationScope navigationScope) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(navigationScope, "");
        navigationScope.push(new com.paypal.oslo.feature.shoppingrewards.api.rewards.common.navigation.TermsWebViewDestination(str, (java.lang.String) null, 2, (kotlin.jvm.internal.DefaultConstructorMarker) null));
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$WLbwBGbYEiANF4kuENfLIVrTpiI(final com.paypal.oslo.core.navigation.AppNavigator appNavigator, com.paypal.oslo.feature.shoppingrewards.api.shopping.navigation.ShoppingIABDestination shoppingIABDestination, androidx.compose.runtime.Composer composer, int i) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(shoppingIABDestination, "");
        if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
            androidx.compose.runtime.ComposerKt.traceEventStart(-1314380967, i, -1, "com.paypal.oslo.feature.shoppingrewards.shopping.common.di.ShoppingUiModule.provideShoppingIABEntryProviderInstaller.<anonymous>.<anonymous> (ShoppingUiModule.kt:80)");
        }
        boolean changed = composer.changed(appNavigator);
        java.lang.Object rememberedValue = composer.rememberedValue();
        if (changed || rememberedValue == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
            rememberedValue = new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.feature.shoppingrewards.shopping.common.di.ShoppingUiModule$$ExternalSyntheticLambda1
                @Override // kotlin.jvm.functions.Function0
                public final java.lang.Object invoke() {
                    return com.paypal.oslo.feature.shoppingrewards.shopping.common.di.ShoppingUiModule.$r8$lambda$9LwJaPd0y1vzmz703VZsLB5JVig(com.paypal.oslo.core.navigation.AppNavigator.this);
                }
            };
            composer.updateRememberedValue(rememberedValue);
        }
        kotlin.jvm.functions.Function0 function0 = (kotlin.jvm.functions.Function0) rememberedValue;
        boolean changed2 = composer.changed(appNavigator);
        java.lang.Object rememberedValue2 = composer.rememberedValue();
        if (changed2 || rememberedValue2 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
            rememberedValue2 = new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.shoppingrewards.shopping.common.di.ShoppingUiModule$$ExternalSyntheticLambda2
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj) {
                    return com.paypal.oslo.feature.shoppingrewards.shopping.common.di.ShoppingUiModule.$r8$lambda$KvjocWieSQ3Ya_Z7pL50YXKRYPw(com.paypal.oslo.core.navigation.AppNavigator.this, (java.lang.String) obj);
                }
            };
            composer.updateRememberedValue(rememberedValue2);
        }
        com.paypal.oslo.feature.shoppingrewards.shopping.iab.ui.ShoppingIABScreenKt.ShoppingIABScreen(function0, null, (kotlin.jvm.functions.Function1) rememberedValue2, new com.paypal.oslo.feature.shoppingrewards.shopping.common.domain.IabOfferDetails(shoppingIABDestination.getMerchantUrl(), shoppingIABDestination.getMerchantName(), null, null, shoppingIABDestination.getMerchantLogoUrl(), null, null, shoppingIABDestination.getHoneyStoreId(), null, com.paypal.oslo.feature.shoppingrewards.shopping.common.domain.IabOfferDetailsKt.toInternalBenefitTypes(shoppingIABDestination.getBenefitTypes()), shoppingIABDestination.getBenefitsMetadata(), null, null, null, 14700, null), null, composer, 0, 18);
        if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
            androidx.compose.runtime.ComposerKt.traceEventEnd();
        }
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$seWb9z1KA4L7gCEmXe7k0n4QWgE(com.paypal.oslo.core.navigation.AppNavigator.NavigationScope navigationScope) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(navigationScope, "");
        navigationScope.goBack();
        return kotlin.Unit.INSTANCE;
    }
}
