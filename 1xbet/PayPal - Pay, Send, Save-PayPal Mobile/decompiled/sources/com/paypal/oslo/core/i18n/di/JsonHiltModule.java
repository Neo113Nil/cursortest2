package com.paypal.oslo.core.i18n.di;

@kotlin.Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÁ\u0002\u0018\u00002\u00020\u0001:\u0001\u0007B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lcom/paypal/oslo/core/i18n/di/JsonHiltModule;", "", "<init>", "()V", "Lkotlinx/serialization/json/Json;", "provideJson", "()Lkotlinx/serialization/json/Json;", "LocaleResolverJson"}, k = 1, mv = {2, 3, 0}, xi = 48)
@dagger.Module
/* loaded from: classes2.dex */
public final class JsonHiltModule {
    public static final com.paypal.oslo.core.i18n.di.JsonHiltModule INSTANCE = new com.paypal.oslo.core.i18n.di.JsonHiltModule();

    @javax.inject.Qualifier
    @kotlin.Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\u0010\u001b\b\u0087\u0002\u0018\u00002\u00020\u0001B\u0000"}, d2 = {"Lcom/paypal/oslo/core/i18n/di/JsonHiltModule$LocaleResolverJson;", ""}, k = 1, mv = {2, 3, 0}, xi = 48)
    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.CLASS)
    @kotlin.annotation.Retention(kotlin.annotation.AnnotationRetention.BINARY)
    public @interface LocaleResolverJson {
    }

    private JsonHiltModule() {
    }

    @dagger.Provides
    public final kotlinx.serialization.json.Json provideJson() {
        return kotlinx.serialization.json.JsonKt.Json$default(null, new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.core.i18n.di.JsonHiltModule$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return com.paypal.oslo.core.i18n.di.JsonHiltModule.m11236$r8$lambda$JspDlhhDieZ4j5SE5lnPQm8c38((kotlinx.serialization.json.JsonBuilder) obj);
            }
        }, 1, null);
    }

    /* renamed from: $r8$lambda$JspDlhhDieZ-4j5SE5lnPQm8c38, reason: not valid java name */
    public static /* synthetic */ kotlin.Unit m11236$r8$lambda$JspDlhhDieZ4j5SE5lnPQm8c38(kotlinx.serialization.json.JsonBuilder jsonBuilder) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(jsonBuilder, "");
        jsonBuilder.setIgnoreUnknownKeys(true);
        jsonBuilder.setCoerceInputValues(true);
        jsonBuilder.setLenient(true);
        return kotlin.Unit.INSTANCE;
    }
}
