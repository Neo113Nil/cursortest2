package io.ktor.client.plugins;

@kotlin.Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\u0015\u0010\u0002\u001a\u00020\u0001*\u0006\u0012\u0002\b\u00030\u0000¢\u0006\u0004\b\u0002\u0010\u0003\"\u001a\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00010\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006\"\u0018\u0010\u000b\u001a\u00060\u0007j\u0002`\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010\n"}, d2 = {"Lio/ktor/client/HttpClientConfig;", "", "addDefaultResponseValidation", "(Lio/ktor/client/HttpClientConfig;)V", "Lio/ktor/util/AttributeKey;", "getHighSpeedVideoFpsRanges", "Lio/ktor/util/AttributeKey;", "Lorg/slf4j/Logger;", "Lio/ktor/util/logging/Logger;", "getHighSpeedVideoFpsRangesFor", "Lorg/slf4j/Logger;", "getHighResolutionOutputSizeshNQ4ISI"}, k = 2, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes17.dex */
public final class DefaultResponseValidationKt {
    private static final io.ktor.util.AttributeKey<kotlin.Unit> getHighSpeedVideoFpsRanges;
    private static final org.slf4j.Logger getHighSpeedVideoFpsRangesFor;

    public static final void addDefaultResponseValidation(final io.ktor.client.HttpClientConfig<?> httpClientConfig) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(httpClientConfig, "");
        io.ktor.client.plugins.HttpCallValidatorKt.HttpResponseValidator(httpClientConfig, new kotlin.jvm.functions.Function1() { // from class: io.ktor.client.plugins.DefaultResponseValidationKt$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return io.ktor.client.plugins.DefaultResponseValidationKt.$r8$lambda$bfGvFfm952MdfIzjni0wiqlulto(io.ktor.client.HttpClientConfig.this, (io.ktor.client.plugins.HttpCallValidatorConfig) obj);
            }
        });
    }

    static {
        kotlin.reflect.KType kType;
        kotlin.reflect.KClass orCreateKotlinClass = kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(kotlin.Unit.class);
        try {
            kType = kotlin.jvm.internal.Reflection.typeOf(kotlin.Unit.class);
        } catch (java.lang.Throwable unused) {
            kType = null;
        }
        getHighSpeedVideoFpsRanges = new io.ktor.util.AttributeKey<>("ValidateMark", new io.ktor.util.reflect.TypeInfo(orCreateKotlinClass, kType));
        getHighSpeedVideoFpsRangesFor = io.ktor.util.logging.KtorSimpleLoggerJvmKt.KtorSimpleLogger("io.ktor.client.plugins.DefaultResponseValidation");
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$bfGvFfm952MdfIzjni0wiqlulto(io.ktor.client.HttpClientConfig httpClientConfig, io.ktor.client.plugins.HttpCallValidatorConfig httpCallValidatorConfig) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(httpCallValidatorConfig, "");
        httpCallValidatorConfig.setExpectSuccess$ktor_client_core(httpClientConfig.getExpectSuccess());
        httpCallValidatorConfig.validateResponse(new io.ktor.client.plugins.DefaultResponseValidationKt$addDefaultResponseValidation$1$1(null));
        return kotlin.Unit.INSTANCE;
    }
}
