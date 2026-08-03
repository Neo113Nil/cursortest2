package io.ktor.client.plugins;

/* compiled from: DefaultResponseValidation.kt */
@kotlin.Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\u001a\u0015\u0010\u0002\u001a\u00020\u0001*\u0006\u0012\u0002\b\u00030\u0000¢\u0006\u0004\b\u0002\u0010\u0003\"\u001a\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00010\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006\"\u0018\u0010\t\u001a\u00060\u0007j\u0002`\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010\n\"\u0014\u0010\f\u001a\u00020\u000b8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\f\u0010\r\"\u0014\u0010\u000e\u001a\u00020\u000b8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u000e\u0010\r\"\u0014\u0010\u000f\u001a\u00020\u000b8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u000f\u0010\r¨\u0006\u0010"}, d2 = {"Lio/ktor/client/HttpClientConfig;", "", "addDefaultResponseValidation", "(Lio/ktor/client/HttpClientConfig;)V", "Lio/ktor/util/AttributeKey;", "ValidateMark", "Lio/ktor/util/AttributeKey;", "Lorg/slf4j/Logger;", "Lio/ktor/util/logging/Logger;", "LOGGER", "Lorg/slf4j/Logger;", "", "NO_RESPONSE_TEXT", "Ljava/lang/String;", "BODY_FAILED_DECODING", "DEPRECATED_EXCEPTION_CTOR", "ktor-client-core"}, k = 2, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class DefaultResponseValidationKt {
    private static final java.lang.String BODY_FAILED_DECODING = "<body failed decoding>";
    private static final java.lang.String DEPRECATED_EXCEPTION_CTOR = "Please, provide response text in constructor";
    private static final org.slf4j.Logger LOGGER;
    private static final java.lang.String NO_RESPONSE_TEXT = "<no response text provided>";
    private static final io.ktor.util.AttributeKey<kotlin.Unit> ValidateMark;

    public static final void addDefaultResponseValidation(final io.ktor.client.HttpClientConfig<?> httpClientConfig) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(httpClientConfig, "<this>");
        io.ktor.client.plugins.HttpCallValidatorKt.HttpResponseValidator(httpClientConfig, new kotlin.jvm.functions.Function1() { // from class: io.ktor.client.plugins.DefaultResponseValidationKt$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                kotlin.Unit addDefaultResponseValidation$lambda$0;
                addDefaultResponseValidation$lambda$0 = io.ktor.client.plugins.DefaultResponseValidationKt.addDefaultResponseValidation$lambda$0(io.ktor.client.HttpClientConfig.this, (io.ktor.client.plugins.HttpCallValidatorConfig) obj);
                return addDefaultResponseValidation$lambda$0;
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final kotlin.Unit addDefaultResponseValidation$lambda$0(io.ktor.client.HttpClientConfig httpClientConfig, io.ktor.client.plugins.HttpCallValidatorConfig HttpResponseValidator) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(HttpResponseValidator, "$this$HttpResponseValidator");
        HttpResponseValidator.setExpectSuccess$ktor_client_core(httpClientConfig.getExpectSuccess());
        HttpResponseValidator.validateResponse(new io.ktor.client.plugins.DefaultResponseValidationKt$addDefaultResponseValidation$1$1(null));
        return kotlin.Unit.INSTANCE;
    }

    static {
        kotlin.reflect.KType kType;
        kotlin.reflect.KClass orCreateKotlinClass = kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(kotlin.Unit.class);
        try {
            kType = kotlin.jvm.internal.Reflection.typeOf(kotlin.Unit.class);
        } catch (java.lang.Throwable unused) {
            kType = null;
        }
        ValidateMark = new io.ktor.util.AttributeKey<>("ValidateMark", new io.ktor.util.reflect.TypeInfo(orCreateKotlinClass, kType));
        LOGGER = io.ktor.util.logging.KtorSimpleLoggerJvmKt.KtorSimpleLogger("io.ktor.client.plugins.DefaultResponseValidation");
    }
}
