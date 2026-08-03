package com.vungle.ads.internal.network.converters;

/* compiled from: JsonConverter.kt */
@kotlin.Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u0000 \n*\u0004\b\u0000\u0010\u00012\u0010\u0012\u0006\u0012\u0004\u0018\u00010\u0003\u0012\u0004\u0012\u0002H\u00010\u0002:\u0001\nB\r\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\u0019\u0010\u0007\u001a\u0004\u0018\u00018\u00002\b\u0010\b\u001a\u0004\u0018\u00010\u0003H\u0016¢\u0006\u0002\u0010\tR\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u000b"}, d2 = {"Lcom/vungle/ads/internal/network/converters/JsonConverter;", androidx.exifinterface.media.ExifInterface.LONGITUDE_EAST, "Lcom/vungle/ads/internal/network/converters/Converter;", "Lokhttp3/ResponseBody;", "kType", "Lkotlin/reflect/KType;", "(Lkotlin/reflect/KType;)V", "convert", "responseBody", "(Lokhttp3/ResponseBody;)Ljava/lang/Object;", com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.k.M, "vungle-ads_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
/* loaded from: classes6.dex */
public final class JsonConverter<E> implements com.vungle.ads.internal.network.converters.Converter<okhttp3.ResponseBody, E> {
    private static final kotlinx.serialization.json.Json json = kotlinx.serialization.json.JsonKt.Json$default(null, new kotlin.jvm.functions.Function1<kotlinx.serialization.json.JsonBuilder, kotlin.Unit>() { // from class: com.vungle.ads.internal.network.converters.JsonConverter$Companion$json$1
        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ kotlin.Unit invoke(kotlinx.serialization.json.JsonBuilder jsonBuilder) {
            invoke2(jsonBuilder);
            return kotlin.Unit.INSTANCE;
        }

        /* renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2(kotlinx.serialization.json.JsonBuilder Json) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(Json, "$this$Json");
            Json.setIgnoreUnknownKeys(true);
            Json.setEncodeDefaults(true);
            Json.setExplicitNulls(false);
            Json.setAllowStructuredMapKeys(true);
        }
    }, 1, null);
    private final kotlin.reflect.KType kType;

    public JsonConverter(kotlin.reflect.KType kType) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(kType, "kType");
        this.kType = kType;
    }

    @Override // com.vungle.ads.internal.network.converters.Converter
    public E convert(okhttp3.ResponseBody responseBody) throws java.io.IOException {
        java.io.InputStream byteStream;
        okhttp3.ResponseBody responseBody2 = responseBody;
        try {
            okhttp3.ResponseBody responseBody3 = responseBody2;
            if (responseBody3 != null && (byteStream = responseBody3.byteStream()) != null) {
                E e = (E) kotlinx.serialization.json.JvmStreamsKt.decodeFromStream(json, kotlinx.serialization.SerializersKt.serializer(kotlinx.serialization.json.Json.INSTANCE.getSerializersModule(), this.kType), byteStream);
                kotlin.io.CloseableKt.closeFinally(responseBody2, null);
                return e;
            }
            kotlin.io.CloseableKt.closeFinally(responseBody2, null);
            return null;
        } finally {
        }
    }
}
