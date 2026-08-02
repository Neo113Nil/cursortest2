package com.paypal.oslo.feature.inappcheckout.di;

@kotlin.Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bÁ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0007\u0010\bJ\u001f\u0010\f\u001a\u00020\u000b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\n\u001a\u00020\tH\u0007¢\u0006\u0004\b\f\u0010\rJ\u000f\u0010\u000f\u001a\u00020\u000eH\u0007¢\u0006\u0004\b\u000f\u0010\u0010J\u000f\u0010\u0012\u001a\u00020\u0011H\u0007¢\u0006\u0004\b\u0012\u0010\u0013J\u0019\u0010\u0017\u001a\u00020\u00162\b\b\u0001\u0010\u0015\u001a\u00020\u0014H\u0007¢\u0006\u0004\b\u0017\u0010\u0018"}, d2 = {"Lcom/paypal/oslo/feature/inappcheckout/di/InAppCheckoutModule;", "", "<init>", "()V", "Lcom/paypal/oslo/core/navigation/AppNavigator;", "appNavigator", "Lcom/paypal/oslo/feature/inappcheckout/navigation/coordinator/InAppCheckoutCoordinator;", "provideInAppCheckoutCoordinator", "(Lcom/paypal/oslo/core/navigation/AppNavigator;)Lcom/paypal/oslo/feature/inappcheckout/navigation/coordinator/InAppCheckoutCoordinator;", "Lcom/paypal/oslo/feature/inappcheckout/features/logger/CheckoutLogger;", "logger", "Lcom/paypal/oslo/feature/inappcheckout/navigation/coordinator/InAppCheckoutWebViewCoordinator;", "provideInAppCheckoutWebViewCoordinator", "(Lcom/paypal/oslo/core/navigation/AppNavigator;Lcom/paypal/oslo/feature/inappcheckout/features/logger/CheckoutLogger;)Lcom/paypal/oslo/feature/inappcheckout/navigation/coordinator/InAppCheckoutWebViewCoordinator;", "Lkotlinx/coroutines/CoroutineDispatcher;", "ioDispatcher", "()Lkotlinx/coroutines/CoroutineDispatcher;", "Lkotlinx/serialization/json/Json;", "provideJson", "()Lkotlinx/serialization/json/Json;", "Landroid/content/Context;", "context", "Lcom/paypal/oslo/feature/inappcheckout/domain/util/InAppCheckoutStringsProvider;", "provideInAppCheckoutStringsProvider", "(Landroid/content/Context;)Lcom/paypal/oslo/feature/inappcheckout/domain/util/InAppCheckoutStringsProvider;"}, k = 1, mv = {2, 3, 0}, xi = 48)
@dagger.Module
/* loaded from: classes13.dex */
public final class InAppCheckoutModule {
    public static final int $stable = 0;
    public static final com.paypal.oslo.feature.inappcheckout.di.InAppCheckoutModule INSTANCE = new com.paypal.oslo.feature.inappcheckout.di.InAppCheckoutModule();

    private InAppCheckoutModule() {
    }

    @dagger.Provides
    public final com.paypal.oslo.feature.inappcheckout.navigation.coordinator.InAppCheckoutCoordinator provideInAppCheckoutCoordinator(com.paypal.oslo.core.navigation.AppNavigator appNavigator) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(appNavigator, "");
        return new com.paypal.oslo.feature.inappcheckout.navigation.coordinator.InAppCheckoutCoordinator(appNavigator);
    }

    @dagger.Provides
    public final com.paypal.oslo.feature.inappcheckout.navigation.coordinator.InAppCheckoutWebViewCoordinator provideInAppCheckoutWebViewCoordinator(com.paypal.oslo.core.navigation.AppNavigator appNavigator, com.paypal.oslo.feature.inappcheckout.features.logger.CheckoutLogger logger) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(appNavigator, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(logger, "");
        return new com.paypal.oslo.feature.inappcheckout.navigation.coordinator.InAppCheckoutWebViewCoordinator(appNavigator, logger);
    }

    @dagger.Provides
    public final kotlinx.coroutines.CoroutineDispatcher ioDispatcher() {
        return kotlinx.coroutines.Dispatchers.getIO();
    }

    @dagger.Provides
    public final com.paypal.oslo.feature.inappcheckout.domain.util.InAppCheckoutStringsProvider provideInAppCheckoutStringsProvider(@dagger.hilt.android.qualifiers.ApplicationContext android.content.Context context) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(context, "");
        android.content.res.Resources resources = context.getResources();
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(resources, "");
        return new com.paypal.oslo.feature.inappcheckout.ui.util.InAppCheckoutStringsProviderImpl(resources);
    }

    @dagger.Provides
    public final kotlinx.serialization.json.Json provideJson() {
        kotlinx.serialization.modules.SerializersModuleBuilder serializersModuleBuilder = new kotlinx.serialization.modules.SerializersModuleBuilder();
        kotlinx.serialization.modules.PolymorphicModuleBuilder polymorphicModuleBuilder = new kotlinx.serialization.modules.PolymorphicModuleBuilder(kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(com.paypal.oslo.feature.inappcheckout.data.dto.ContingencyDTO.class), null);
        polymorphicModuleBuilder.defaultDeserializer(new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.inappcheckout.di.InAppCheckoutModule$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                kotlinx.serialization.DeserializationStrategy deserializationStrategy;
                deserializationStrategy = com.paypal.oslo.feature.inappcheckout.data.serializer.ContingencyDTOSerializer.INSTANCE;
                return deserializationStrategy;
            }
        });
        polymorphicModuleBuilder.buildTo(serializersModuleBuilder);
        final kotlinx.serialization.modules.SerializersModule build = serializersModuleBuilder.build();
        return kotlinx.serialization.json.JsonKt.Json$default(null, new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.inappcheckout.di.InAppCheckoutModule$$ExternalSyntheticLambda1
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return com.paypal.oslo.feature.inappcheckout.di.InAppCheckoutModule.$r8$lambda$MGMMqdbhY2c1jsIyy3SY_J6HjpI(kotlinx.serialization.modules.SerializersModule.this, (kotlinx.serialization.json.JsonBuilder) obj);
            }
        }, 1, null);
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$MGMMqdbhY2c1jsIyy3SY_J6HjpI(kotlinx.serialization.modules.SerializersModule serializersModule, kotlinx.serialization.json.JsonBuilder jsonBuilder) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(jsonBuilder, "");
        jsonBuilder.setIgnoreUnknownKeys(true);
        jsonBuilder.setLenient(true);
        jsonBuilder.setSerializersModule(serializersModule);
        return kotlin.Unit.INSTANCE;
    }
}
