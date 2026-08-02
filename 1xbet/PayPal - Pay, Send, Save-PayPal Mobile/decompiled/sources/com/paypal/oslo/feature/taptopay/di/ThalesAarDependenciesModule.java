package com.paypal.oslo.feature.taptopay.di;

@kotlin.Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b!\u0018\u0000 \t2\u00020\u0001:\u0001\tB\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H'¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Lcom/paypal/oslo/feature/taptopay/di/ThalesAarDependenciesModule;", "", "<init>", "()V", "Lcom/paypal/oslo/feature/taptopay/data/thales/DefaultThalesInitializerFactory;", "impl", "Lcom/paypal/oslo/feature/taptopay/data/thales/ThalesInitializerFactory;", "bindThalesInitializerFactory", "(Lcom/paypal/oslo/feature/taptopay/data/thales/DefaultThalesInitializerFactory;)Lcom/paypal/oslo/feature/taptopay/data/thales/ThalesInitializerFactory;", "Companion"}, k = 1, mv = {2, 3, 0}, xi = 48)
@dagger.Module
/* loaded from: classes5.dex */
public abstract class ThalesAarDependenciesModule {
    public static final int $stable = 0;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final com.paypal.oslo.feature.taptopay.di.ThalesAarDependenciesModule.Companion INSTANCE = new com.paypal.oslo.feature.taptopay.di.ThalesAarDependenciesModule.Companion(null);

    @dagger.Binds
    public abstract com.paypal.oslo.feature.taptopay.data.thales.ThalesInitializerFactory bindThalesInitializerFactory(com.paypal.oslo.feature.taptopay.data.thales.DefaultThalesInitializerFactory impl);

    @kotlin.Metadata(d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J1\u0010\r\u001a\u00020\f2\u0006\u0010\u0005\u001a\u00020\u00042\b\b\u0001\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\nH\u0007¢\u0006\u0004\b\r\u0010\u000eJ\u001f\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0012\u001a\u00020\u0011H\u0007¢\u0006\u0004\b\u0014\u0010\u0015J1\u0010\u001b\u001a\u00020\u001a2\u0006\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0018\u001a\u00020\u00132\b\b\u0001\u0010\u0019\u001a\u00020\u0006H\u0007¢\u0006\u0004\b\u001b\u0010\u001cJ\u0019\u0010\u001d\u001a\u00020\u00062\b\b\u0001\u0010\u0007\u001a\u00020\u0006H\u0007¢\u0006\u0004\b\u001d\u0010\u001e"}, d2 = {"Lcom/paypal/oslo/feature/taptopay/di/ThalesAarDependenciesModule$Companion;", "", "<init>", "()V", "Lcom/paypal/android/taptopay/data/thales/fcm/PushNotificationTokenHandler;", "pushNotificationTokenHandler", "Landroid/content/Context;", "context", "Lcom/paypal/android/taptopay/data/thales/fcm/PushNotificationDataSource;", "pushNotificationDataSource", "Lkotlinx/coroutines/CoroutineDispatcher;", "ioDispatcher", "Lcom/paypal/android/taptopay/data/thales/fcm/FcmHandler;", "provideFcmHandler", "(Lcom/paypal/android/taptopay/data/thales/fcm/PushNotificationTokenHandler;Landroid/content/Context;Lcom/paypal/android/taptopay/data/thales/fcm/PushNotificationDataSource;Lkotlinx/coroutines/CoroutineDispatcher;)Lcom/paypal/android/taptopay/data/thales/fcm/FcmHandler;", "Lcom/paypal/android/taptopay/data/thales/fcm/PushNotificationTokenDataSource;", "pushNotificationTokenDataSource", "Lcom/paypal/android/taptopay/data/thales/card/CardDataSource;", "cardDataSource", "Lcom/paypal/android/taptopay/data/thales/card/ThalesDigitizeCardUseCase;", "provideThalesDigitizeCardUseCase", "(Lcom/paypal/android/taptopay/data/thales/fcm/PushNotificationTokenDataSource;Lcom/paypal/android/taptopay/data/thales/card/CardDataSource;)Lcom/paypal/android/taptopay/data/thales/card/ThalesDigitizeCardUseCase;", "Lcom/paypal/android/taptopay/data/thales/card/CardStateDataSource;", "cardStateDataSource", "digitizeCardUseCase", "appContext", "Lcom/paypal/android/taptopay/data/thales/card/ThalesCardRepository;", "provideThalesCardRepository", "(Lcom/paypal/android/taptopay/data/thales/card/CardStateDataSource;Lcom/paypal/android/taptopay/data/thales/card/CardDataSource;Lcom/paypal/android/taptopay/data/thales/card/ThalesDigitizeCardUseCase;Landroid/content/Context;)Lcom/paypal/android/taptopay/data/thales/card/ThalesCardRepository;", "provideContext", "(Landroid/content/Context;)Landroid/content/Context;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        @dagger.Provides
        @javax.inject.Singleton
        public final com.paypal.android.taptopay.data.thales.fcm.FcmHandler provideFcmHandler(com.paypal.android.taptopay.data.thales.fcm.PushNotificationTokenHandler pushNotificationTokenHandler, @dagger.hilt.android.qualifiers.ApplicationContext android.content.Context context, com.paypal.android.taptopay.data.thales.fcm.PushNotificationDataSource pushNotificationDataSource, kotlinx.coroutines.CoroutineDispatcher ioDispatcher) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(pushNotificationTokenHandler, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(context, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(pushNotificationDataSource, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(ioDispatcher, "");
            return new com.paypal.android.taptopay.data.thales.fcm.FcmHandler(pushNotificationTokenHandler, new com.paypal.android.taptopay.data.thales.fcm.PushNotificationHandler(context, pushNotificationDataSource), ioDispatcher);
        }

        @dagger.Provides
        public final com.paypal.android.taptopay.data.thales.card.ThalesDigitizeCardUseCase provideThalesDigitizeCardUseCase(com.paypal.android.taptopay.data.thales.fcm.PushNotificationTokenDataSource pushNotificationTokenDataSource, com.paypal.android.taptopay.data.thales.card.CardDataSource cardDataSource) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(pushNotificationTokenDataSource, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(cardDataSource, "");
            return new com.paypal.android.taptopay.data.thales.card.ThalesDigitizeCardUseCase(pushNotificationTokenDataSource, cardDataSource, null, 4, null);
        }

        @dagger.Provides
        @javax.inject.Singleton
        public final com.paypal.android.taptopay.data.thales.card.ThalesCardRepository provideThalesCardRepository(com.paypal.android.taptopay.data.thales.card.CardStateDataSource cardStateDataSource, com.paypal.android.taptopay.data.thales.card.CardDataSource cardDataSource, com.paypal.android.taptopay.data.thales.card.ThalesDigitizeCardUseCase digitizeCardUseCase, @dagger.hilt.android.qualifiers.ApplicationContext android.content.Context appContext) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(cardStateDataSource, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(cardDataSource, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(digitizeCardUseCase, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(appContext, "");
            return new com.paypal.android.taptopay.data.thales.card.ThalesCardRepository(cardStateDataSource, cardDataSource, digitizeCardUseCase, null, null, appContext, 24, null);
        }

        @dagger.Provides
        public final android.content.Context provideContext(@dagger.hilt.android.qualifiers.ApplicationContext android.content.Context context) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(context, "");
            return context;
        }

        public /* synthetic */ Companion(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }
}
