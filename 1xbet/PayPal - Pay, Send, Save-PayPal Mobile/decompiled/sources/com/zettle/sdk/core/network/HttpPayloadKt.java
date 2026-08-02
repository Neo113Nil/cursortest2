package com.zettle.sdk.core.network;

@kotlin.Metadata(d1 = {"\u0000\u0016\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\"\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002\"\u0006\b\u0000\u0010\u0000\u0018\u0001*\u00020\u0001H\u0080\b¢\u0006\u0004\b\u0003\u0010\u0004\"\u0014\u0010\b\u001a\u00020\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010\u0007"}, d2 = {"T", "Lokhttp3/Response;", "Lcom/zettle/sdk/core/network/HttpPayload;", "toHttpPayload", "(Lokhttp3/Response;)Lcom/zettle/sdk/core/network/HttpPayload;", "Lkotlinx/serialization/json/Json;", "getHighResolutionOutputSizeshNQ4ISI", "Lkotlinx/serialization/json/Json;", "getHighSpeedVideoFpsRanges"}, k = 2, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes17.dex */
public final class HttpPayloadKt {
    private static final kotlinx.serialization.json.Json getHighResolutionOutputSizeshNQ4ISI = kotlinx.serialization.json.JsonKt.Json$default(null, new kotlin.jvm.functions.Function1<kotlinx.serialization.json.JsonBuilder, kotlin.Unit>() { // from class: com.zettle.sdk.core.network.HttpPayloadKt$json$1
        public final void getHighResolutionOutputSizeshNQ4ISI(kotlinx.serialization.json.JsonBuilder jsonBuilder) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(jsonBuilder, "");
            jsonBuilder.setIgnoreUnknownKeys(true);
        }

        @Override // kotlin.jvm.functions.Function1
        public final /* synthetic */ kotlin.Unit invoke(kotlinx.serialization.json.JsonBuilder jsonBuilder) {
            getHighResolutionOutputSizeshNQ4ISI(jsonBuilder);
            return kotlin.Unit.INSTANCE;
        }
    }, 1, null);

    public static final /* synthetic */ <T> com.zettle.sdk.core.network.HttpPayload<T> toHttpPayload(okhttp3.Response response) {
        java.lang.Object decodeFromString;
        java.lang.String string;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(response, "");
        okhttp3.ResponseBody body = response.body();
        java.lang.String str = (body == null || (string = body.string()) == null) ? "" : string;
        int code = response.code();
        java.lang.String message = response.message();
        java.util.List<kotlin.Pair> list = kotlin.collections.CollectionsKt.toList(response.headers());
        java.util.ArrayList arrayList = new java.util.ArrayList(kotlin.collections.CollectionsKt.collectionSizeOrDefault(list, 10));
        for (kotlin.Pair pair : list) {
            java.lang.Object first = pair.getFirst();
            java.lang.Object second = pair.getSecond();
            java.lang.StringBuilder sb = new java.lang.StringBuilder();
            sb.append(first);
            sb.append(": ");
            sb.append(second);
            arrayList.add(sb.toString());
        }
        java.util.ArrayList arrayList2 = arrayList;
        int code2 = response.code();
        java.lang.Object obj = null;
        if (200 <= code2 && code2 < 300) {
            kotlinx.serialization.json.Json json = getHighResolutionOutputSizeshNQ4ISI;
            kotlin.jvm.internal.Intrinsics.reifiedOperationMarker(6, "T");
            kotlin.jvm.internal.MagicApiIntrinsics.voidMagicApiCall("kotlinx.serialization.serializer.simple");
            obj = json.decodeFromString(kotlinx.serialization.SerializersKt.serializer((kotlin.reflect.KType) null), str);
        } else if (code2 == 499) {
            kotlinx.serialization.json.Json json2 = getHighResolutionOutputSizeshNQ4ISI;
            kotlin.jvm.internal.Intrinsics.reifiedOperationMarker(6, "T");
            kotlin.jvm.internal.MagicApiIntrinsics.voidMagicApiCall("kotlinx.serialization.serializer.simple");
            decodeFromString = json2.decodeFromString(kotlinx.serialization.SerializersKt.serializer((kotlin.reflect.KType) null), str);
            return new com.zettle.sdk.core.network.HttpPayload<>(code, message, arrayList2, str, decodeFromString);
        }
        decodeFromString = obj;
        return new com.zettle.sdk.core.network.HttpPayload<>(code, message, arrayList2, str, decodeFromString);
    }
}
