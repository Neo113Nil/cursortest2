package com.paypal.oslo.downloads.impl.di;

@kotlin.Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÁ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lcom/paypal/oslo/downloads/impl/di/DownloadSerializationModule;", "", "<init>", "()V", "Lkotlinx/serialization/json/Json;", "provideJson", "()Lkotlinx/serialization/json/Json;"}, k = 1, mv = {2, 3, 0}, xi = 48)
@dagger.Module
/* loaded from: classes5.dex */
public final class DownloadSerializationModule {
    public static final com.paypal.oslo.downloads.impl.di.DownloadSerializationModule INSTANCE = new com.paypal.oslo.downloads.impl.di.DownloadSerializationModule();

    private DownloadSerializationModule() {
    }

    @dagger.Provides
    @javax.inject.Singleton
    public final kotlinx.serialization.json.Json provideJson() {
        return kotlinx.serialization.json.JsonKt.Json$default(null, new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.downloads.impl.di.DownloadSerializationModule$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return com.paypal.oslo.downloads.impl.di.DownloadSerializationModule.$r8$lambda$KhTzOHFtipSP6zkKya8BRi6GPU4((kotlinx.serialization.json.JsonBuilder) obj);
            }
        }, 1, null);
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$KhTzOHFtipSP6zkKya8BRi6GPU4(kotlinx.serialization.json.JsonBuilder jsonBuilder) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(jsonBuilder, "");
        jsonBuilder.setIgnoreUnknownKeys(true);
        jsonBuilder.setLenient(true);
        jsonBuilder.setEncodeDefaults(true);
        return kotlin.Unit.INSTANCE;
    }
}
