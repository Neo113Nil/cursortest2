package com.paypal.oslo.feature.messagecenter.di;

@kotlin.Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÁ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J*\u0010\t\u001a\u001d\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00010\u0005\u0012\u0004\u0012\u00020\u00060\u0004j\u0002`\u0007¢\u0006\u0002\b\bH\u0007¢\u0006\u0004\b\t\u0010\n"}, d2 = {"Lcom/paypal/oslo/feature/messagecenter/di/NavigationModule;", "", "<init>", "()V", "Lkotlin/Function1;", "Landroidx/navigation3/runtime/EntryProviderScope;", "", "Lcom/paypal/oslo/core/navigation/EntryProviderInstaller;", "Lkotlin/ExtensionFunctionType;", "provideMessageCenterEntryProviderInstaller", "()Lkotlin/jvm/functions/Function1;"}, k = 1, mv = {2, 3, 0}, xi = 48)
@dagger.Module
/* loaded from: classes13.dex */
public final class NavigationModule {
    public static final int $stable = 0;
    public static final com.paypal.oslo.feature.messagecenter.di.NavigationModule INSTANCE = new com.paypal.oslo.feature.messagecenter.di.NavigationModule();

    private NavigationModule() {
    }

    /* renamed from: $r8$lambda$LwNRV7_LH1n_unYaIJaRVD-ZxAA, reason: not valid java name */
    public static /* synthetic */ kotlin.Unit m15603$r8$lambda$LwNRV7_LH1n_unYaIJaRVDZxAA(androidx.navigation3.runtime.EntryProviderScope entryProviderScope) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(entryProviderScope, "");
        final java.util.Map l2Metadata$default = com.paypal.oslo.core.navigation.NavigationMetadataBuildersKt.l2Metadata$default(false, null, false, null, null, false, null, null, false, 511, null);
        kotlin.jvm.functions.Function3<com.paypal.oslo.feature.messagecenter.api.navigation.MessageCenterHome, androidx.compose.runtime.Composer, java.lang.Integer, kotlin.Unit> m15602getLambda$1552605633$message_center_prodRelease = com.paypal.oslo.feature.messagecenter.di.ComposableSingletons$NavigationModuleKt.INSTANCE.m15602getLambda$1552605633$message_center_prodRelease();
        entryProviderScope.addEntryProvider(kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(com.paypal.oslo.feature.messagecenter.api.navigation.MessageCenterHome.class), (kotlin.jvm.functions.Function1) new kotlin.jvm.functions.Function1<com.paypal.oslo.feature.messagecenter.api.navigation.MessageCenterHome, java.lang.Object>() { // from class: com.paypal.oslo.feature.messagecenter.di.NavigationModule$provideMessageCenterEntryProviderInstaller$lambda$0$$inlined$entry$default$1
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(com.paypal.oslo.feature.messagecenter.api.navigation.MessageCenterHome messageCenterHome) {
                return androidx.navigation3.runtime.NavEntryKt.defaultContentKey(messageCenterHome);
            }
        }, (kotlin.jvm.functions.Function1) new kotlin.jvm.functions.Function1<com.paypal.oslo.feature.messagecenter.api.navigation.MessageCenterHome, java.util.Map<java.lang.String, ? extends java.lang.Object>>() { // from class: com.paypal.oslo.feature.messagecenter.di.NavigationModule$provideMessageCenterEntryProviderInstaller$lambda$0$$inlined$entry$default$2
            @Override // kotlin.jvm.functions.Function1
            public final java.util.Map<java.lang.String, ? extends java.lang.Object> invoke(com.paypal.oslo.feature.messagecenter.api.navigation.MessageCenterHome messageCenterHome) {
                return l2Metadata$default;
            }
        }, (kotlin.jvm.functions.Function3) m15602getLambda$1552605633$message_center_prodRelease);
        return kotlin.Unit.INSTANCE;
    }

    @dagger.Provides
    @dagger.multibindings.IntoSet
    public final kotlin.jvm.functions.Function1<androidx.navigation3.runtime.EntryProviderScope<java.lang.Object>, kotlin.Unit> provideMessageCenterEntryProviderInstaller() {
        return new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.messagecenter.di.NavigationModule$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return com.paypal.oslo.feature.messagecenter.di.NavigationModule.m15603$r8$lambda$LwNRV7_LH1n_unYaIJaRVDZxAA((androidx.navigation3.runtime.EntryProviderScope) obj);
            }
        };
    }
}
