package io.ktor.client.plugins.contentnegotiation;

@io.ktor.utils.io.KtorDsl
@kotlin.Metadata(d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010#\n\u0002\b\u0004\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0006\n\u0002\b\u0007\b\u0007\u0018\u00002\u00020\u0001:\u0001+B\u0007¢\u0006\u0004\b\u0002\u0010\u0003JB\u0010\r\u001a\u00020\n\"\b\b\u0000\u0010\u0005*\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\b\u001a\u00028\u00002\u0017\u0010\f\u001a\u0013\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\n0\t¢\u0006\u0002\b\u000bH\u0016¢\u0006\u0004\b\r\u0010\u000eJH\u0010\r\u001a\u00020\n\"\b\b\u0000\u0010\u0005*\u00020\u00042\u0006\u0010\u000f\u001a\u00020\u00062\u0006\u0010\b\u001a\u00028\u00002\u0006\u0010\u0011\u001a\u00020\u00102\u0017\u0010\f\u001a\u0013\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\n0\t¢\u0006\u0002\b\u000b¢\u0006\u0004\b\r\u0010\u0012J\u0018\u0010\u0013\u001a\u00020\n\"\u0006\b\u0000\u0010\u0005\u0018\u0001H\u0086\b¢\u0006\u0004\b\u0013\u0010\u0003J\u0018\u0010\u0014\u001a\u00020\n\"\u0006\b\u0000\u0010\u0005\u0018\u0001H\u0086\b¢\u0006\u0004\b\u0014\u0010\u0003J\u0019\u0010\u0014\u001a\u00020\n2\n\u0010\u0016\u001a\u0006\u0012\u0002\b\u00030\u0015¢\u0006\u0004\b\u0014\u0010\u0017J\u0019\u0010\u0013\u001a\u00020\n2\n\u0010\u0016\u001a\u0006\u0012\u0002\b\u00030\u0015¢\u0006\u0004\b\u0013\u0010\u0017J\r\u0010\u0018\u001a\u00020\n¢\u0006\u0004\b\u0018\u0010\u0003R$\u0010\u001a\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00150\u00198\u0001X\u0080\u0004¢\u0006\f\n\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u001c\u0010\u001dR \u0010 \u001a\b\u0012\u0004\u0012\u00020\u001f0\u001e8\u0001X\u0081\u0004¢\u0006\f\n\u0004\b \u0010!\u001a\u0004\b\"\u0010#R$\u0010%\u001a\u0004\u0018\u00010$8\u0007@\u0007X\u0087\u000e¢\u0006\u0012\n\u0004\b%\u0010&\u001a\u0004\b'\u0010(\"\u0004\b)\u0010*"}, d2 = {"Lio/ktor/client/plugins/contentnegotiation/ContentNegotiationConfig;", "Lio/ktor/serialization/Configuration;", "<init>", "()V", "Lio/ktor/serialization/ContentConverter;", "T", "Lio/ktor/http/ContentType;", org.bouncycastle.cms.CMSAttributeTableGenerator.CONTENT_TYPE, "converter", "Lkotlin/Function1;", "", "Lkotlin/ExtensionFunctionType;", com.miteksystems.misnap.core.serverconnection.MobileVerifyV2Request.CONFIG_KEY, "register", "(Lio/ktor/http/ContentType;Lio/ktor/serialization/ContentConverter;Lkotlin/jvm/functions/Function1;)V", "contentTypeToSend", "Lio/ktor/http/ContentTypeMatcher;", "contentTypeMatcher", "(Lio/ktor/http/ContentType;Lio/ktor/serialization/ContentConverter;Lio/ktor/http/ContentTypeMatcher;Lkotlin/jvm/functions/Function1;)V", "ignoreType", "removeIgnoredType", "Lkotlin/reflect/KClass;", "type", "(Lkotlin/reflect/KClass;)V", "clearIgnoredTypes", "", "ignoredTypes", "Ljava/util/Set;", "getIgnoredTypes$ktor_client_content_negotiation", "()Ljava/util/Set;", "", "Lio/ktor/client/plugins/contentnegotiation/ContentNegotiationConfig$ConverterRegistration;", "registrations", "Ljava/util/List;", "getRegistrations$ktor_client_content_negotiation", "()Ljava/util/List;", "", "defaultAcceptHeaderQValue", "Ljava/lang/Double;", "getDefaultAcceptHeaderQValue", "()Ljava/lang/Double;", "setDefaultAcceptHeaderQValue", "(Ljava/lang/Double;)V", "ConverterRegistration"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes17.dex */
public final class ContentNegotiationConfig implements io.ktor.serialization.Configuration {
    private java.lang.Double defaultAcceptHeaderQValue;
    private final java.util.Set<kotlin.reflect.KClass<?>> ignoredTypes = kotlin.collections.CollectionsKt.toMutableSet(kotlin.collections.SetsKt.plus((java.util.Set) io.ktor.client.plugins.contentnegotiation.DefaultIgnoredTypesJvmKt.getDefaultIgnoredTypes(), (java.lang.Iterable) io.ktor.client.plugins.contentnegotiation.ContentNegotiationKt.getDefaultCommonIgnoredTypes()));
    private final java.util.List<io.ktor.client.plugins.contentnegotiation.ContentNegotiationConfig.ConverterRegistration> registrations = new java.util.ArrayList();

    @kotlin.Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\f\b\u0000\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tR\u001a\u0010\u0003\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\n\u001a\u0004\b\u000b\u0010\fR\u001a\u0010\u0005\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\r\u001a\u0004\b\u000e\u0010\u000fR\u001a\u0010\u0007\u001a\u00020\u00068\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012"}, d2 = {"Lio/ktor/client/plugins/contentnegotiation/ContentNegotiationConfig$ConverterRegistration;", "", "Lio/ktor/serialization/ContentConverter;", "converter", "Lio/ktor/http/ContentType;", "contentTypeToSend", "Lio/ktor/http/ContentTypeMatcher;", "contentTypeMatcher", "<init>", "(Lio/ktor/serialization/ContentConverter;Lio/ktor/http/ContentType;Lio/ktor/http/ContentTypeMatcher;)V", "Lio/ktor/serialization/ContentConverter;", "getConverter", "()Lio/ktor/serialization/ContentConverter;", "Lio/ktor/http/ContentType;", "getContentTypeToSend", "()Lio/ktor/http/ContentType;", "Lio/ktor/http/ContentTypeMatcher;", "getContentTypeMatcher", "()Lio/ktor/http/ContentTypeMatcher;"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class ConverterRegistration {
        private final io.ktor.http.ContentTypeMatcher contentTypeMatcher;
        private final io.ktor.http.ContentType contentTypeToSend;
        private final io.ktor.serialization.ContentConverter converter;

        public ConverterRegistration(io.ktor.serialization.ContentConverter contentConverter, io.ktor.http.ContentType contentType, io.ktor.http.ContentTypeMatcher contentTypeMatcher) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(contentConverter, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(contentType, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(contentTypeMatcher, "");
            this.converter = contentConverter;
            this.contentTypeToSend = contentType;
            this.contentTypeMatcher = contentTypeMatcher;
        }

        public final io.ktor.serialization.ContentConverter getConverter() {
            return this.converter;
        }

        public final io.ktor.http.ContentType getContentTypeToSend() {
            return this.contentTypeToSend;
        }

        public final io.ktor.http.ContentTypeMatcher getContentTypeMatcher() {
            return this.contentTypeMatcher;
        }
    }

    public final java.util.Set<kotlin.reflect.KClass<?>> getIgnoredTypes$ktor_client_content_negotiation() {
        return this.ignoredTypes;
    }

    public final java.util.List<io.ktor.client.plugins.contentnegotiation.ContentNegotiationConfig.ConverterRegistration> getRegistrations$ktor_client_content_negotiation() {
        return this.registrations;
    }

    public final java.lang.Double getDefaultAcceptHeaderQValue() {
        return this.defaultAcceptHeaderQValue;
    }

    public final void setDefaultAcceptHeaderQValue(java.lang.Double d) {
        this.defaultAcceptHeaderQValue = d;
    }

    @Override // io.ktor.serialization.Configuration
    public final <T extends io.ktor.serialization.ContentConverter> void register(final io.ktor.http.ContentType contentType, T converter, kotlin.jvm.functions.Function1<? super T, kotlin.Unit> configuration) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(contentType, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(converter, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(configuration, "");
        register(contentType, converter, contentType.match(io.ktor.http.ContentType.Application.INSTANCE.getJson()) ? io.ktor.client.plugins.contentnegotiation.JsonContentTypeMatcher.INSTANCE : new io.ktor.http.ContentTypeMatcher() { // from class: io.ktor.client.plugins.contentnegotiation.ContentNegotiationConfig$defaultMatcher$1
            @Override // io.ktor.http.ContentTypeMatcher
            public final boolean contains(io.ktor.http.ContentType contentType2) {
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(contentType2, "");
                return contentType2.match(io.ktor.http.ContentType.this);
            }
        }, configuration);
    }

    public final <T extends io.ktor.serialization.ContentConverter> void register(io.ktor.http.ContentType contentTypeToSend, T converter, io.ktor.http.ContentTypeMatcher contentTypeMatcher, kotlin.jvm.functions.Function1<? super T, kotlin.Unit> configuration) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(contentTypeToSend, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(converter, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(contentTypeMatcher, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(configuration, "");
        configuration.invoke(converter);
        this.registrations.add(new io.ktor.client.plugins.contentnegotiation.ContentNegotiationConfig.ConverterRegistration(converter, contentTypeToSend, contentTypeMatcher));
    }

    public final /* synthetic */ <T> void ignoreType() {
        kotlin.jvm.internal.Intrinsics.reifiedOperationMarker(4, "T");
        ignoreType(kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(java.lang.Object.class));
    }

    public final /* synthetic */ <T> void removeIgnoredType() {
        kotlin.jvm.internal.Intrinsics.reifiedOperationMarker(4, "T");
        removeIgnoredType(kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(java.lang.Object.class));
    }

    public final void removeIgnoredType(kotlin.reflect.KClass<?> type) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(type, "");
        this.ignoredTypes.remove(type);
    }

    public final void ignoreType(kotlin.reflect.KClass<?> type) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(type, "");
        this.ignoredTypes.add(type);
    }

    public final void clearIgnoredTypes() {
        this.ignoredTypes.clear();
    }
}
