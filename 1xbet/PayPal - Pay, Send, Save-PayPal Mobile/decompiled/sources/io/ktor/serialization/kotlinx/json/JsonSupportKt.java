package io.ktor.serialization.kotlinx.json;

@kotlin.Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0006\u001a%\u0010\u0002\u001a\u00020\u0005*\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00012\b\b\u0002\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0002\u0010\u0006\u001a'\u0010\u0007\u001a\u00020\u0005*\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00012\b\b\u0002\u0010\u0004\u001a\u00020\u0003H\u0007¢\u0006\u0004\b\u0007\u0010\u0006\"\u0017\u0010\b\u001a\u00020\u00018\u0007¢\u0006\f\n\u0004\b\b\u0010\t\u001a\u0004\b\n\u0010\u000b"}, d2 = {"Lio/ktor/serialization/Configuration;", "Lkotlinx/serialization/json/Json;", "json", "Lio/ktor/http/ContentType;", org.bouncycastle.cms.CMSAttributeTableGenerator.CONTENT_TYPE, "", "(Lio/ktor/serialization/Configuration;Lkotlinx/serialization/json/Json;Lio/ktor/http/ContentType;)V", "jsonIo", "DefaultJson", "Lkotlinx/serialization/json/Json;", "getDefaultJson", "()Lkotlinx/serialization/json/Json;"}, k = 2, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes17.dex */
public final class JsonSupportKt {
    private static final kotlinx.serialization.json.Json DefaultJson = kotlinx.serialization.json.JsonKt.Json$default(null, new kotlin.jvm.functions.Function1() { // from class: io.ktor.serialization.kotlinx.json.JsonSupportKt$$ExternalSyntheticLambda0
        @Override // kotlin.jvm.functions.Function1
        public final java.lang.Object invoke(java.lang.Object obj) {
            return io.ktor.serialization.kotlinx.json.JsonSupportKt.$r8$lambda$yXuQhMk58mYvnDuu99j2VUInQf0((kotlinx.serialization.json.JsonBuilder) obj);
        }
    }, 1, null);

    public static final kotlinx.serialization.json.Json getDefaultJson() {
        return DefaultJson;
    }

    public static /* synthetic */ void json$default(io.ktor.serialization.Configuration configuration, kotlinx.serialization.json.Json json, io.ktor.http.ContentType contentType, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            json = DefaultJson;
        }
        if ((i & 2) != 0) {
            contentType = io.ktor.http.ContentType.Application.INSTANCE.getJson();
        }
        json(configuration, json, contentType);
    }

    public static final void json(io.ktor.serialization.Configuration configuration, kotlinx.serialization.json.Json json, io.ktor.http.ContentType contentType) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(configuration, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(json, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(contentType, "");
        io.ktor.serialization.kotlinx.KotlinxSerializationConverterKt.serialization(configuration, contentType, json);
    }

    public static /* synthetic */ void jsonIo$default(io.ktor.serialization.Configuration configuration, kotlinx.serialization.json.Json json, io.ktor.http.ContentType contentType, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            json = DefaultJson;
        }
        if ((i & 2) != 0) {
            contentType = io.ktor.http.ContentType.Application.INSTANCE.getJson();
        }
        jsonIo(configuration, json, contentType);
    }

    @kotlinx.serialization.ExperimentalSerializationApi
    public static final void jsonIo(io.ktor.serialization.Configuration configuration, kotlinx.serialization.json.Json json, io.ktor.http.ContentType contentType) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(configuration, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(json, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(contentType, "");
        io.ktor.serialization.Configuration.DefaultImpls.register$default(configuration, contentType, new io.ktor.serialization.kotlinx.json.ExperimentalJsonConverter(json), null, 4, null);
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$yXuQhMk58mYvnDuu99j2VUInQf0(kotlinx.serialization.json.JsonBuilder jsonBuilder) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(jsonBuilder, "");
        jsonBuilder.setEncodeDefaults(true);
        jsonBuilder.setLenient(true);
        jsonBuilder.setAllowSpecialFloatingPointValues(true);
        jsonBuilder.setAllowStructuredMapKeys(true);
        jsonBuilder.setPrettyPrint(false);
        jsonBuilder.setUseArrayPolymorphism(false);
        return kotlin.Unit.INSTANCE;
    }
}
