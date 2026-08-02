package com.discover.mpos.sdk.core.debug.logger;

@kotlin.Metadata(bv = {1, 0, 3}, d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\r\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0005\u0010\u0006J)\u0010\r\u001a\u00020\f\"\u0004\b\u0000\u0010\u00072\u0006\u0010\t\u001a\u00020\b2\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00028\u00000\n¢\u0006\u0004\b\r\u0010\u000eR\u0016\u0010\u000f\u001a\u00020\u00048\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010R\u0018\u0010\u0012\u001a\u0006*\u00020\u00110\u00118\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013"}, d2 = {"Lcom/discover/mpos/sdk/core/debug/logger/PrettifiedGson;", "", "<init>", "()V", "Lcom/google/gson/Gson;", "gsonInstance", "()Lcom/google/gson/Gson;", "T", "Ljava/lang/reflect/Type;", "type", "Lcom/google/gson/TypeAdapter;", "typeAdapter", "", "registerTypeAdapter", "(Ljava/lang/reflect/Type;Lcom/google/gson/TypeAdapter;)V", "gson", "Lcom/google/gson/Gson;", "Lcom/google/gson/GsonBuilder;", "gsonBuilderInstance", "Lcom/google/gson/GsonBuilder;"}, k = 1, mv = {1, 4, 1})
/* loaded from: classes8.dex */
public final class PrettifiedGson {
    private static com.google.gson.Gson gson;
    public static final com.discover.mpos.sdk.core.debug.logger.PrettifiedGson INSTANCE = new com.discover.mpos.sdk.core.debug.logger.PrettifiedGson();
    private static final com.google.gson.GsonBuilder gsonBuilderInstance = new com.google.gson.GsonBuilder().disableHtmlEscaping().registerTypeAdapter(com.discover.mpos.sdk.core.data.ByteInfo.class, new com.discover.mpos.sdk.core.debug.logger.ByteInfoGsonAdapter()).registerTypeAdapter(com.discover.mpos.sdk.core.emv.tlv.Tlv.class, new com.discover.mpos.sdk.core.debug.logger.TlvGsonAdapter()).registerTypeAdapter(byte[].class, new com.discover.mpos.sdk.core.debug.logger.ByteArrayGsonAdapter()).setPrettyPrinting();

    private PrettifiedGson() {
    }

    public static final /* synthetic */ com.google.gson.Gson access$getGson$p(com.discover.mpos.sdk.core.debug.logger.PrettifiedGson prettifiedGson) {
        com.google.gson.Gson gson2 = gson;
        if (gson2 == null) {
            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("");
        }
        return gson2;
    }

    public final <T> void registerTypeAdapter(java.lang.reflect.Type type, com.google.gson.TypeAdapter<T> typeAdapter) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(type, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(typeAdapter, "");
        gsonBuilderInstance.registerTypeAdapter(type, typeAdapter);
    }

    public final com.google.gson.Gson gsonInstance() {
        com.google.gson.Gson gson2 = gson;
        if (gson2 != null) {
            if (gson2 == null) {
                kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("");
            }
            return gson2;
        }
        com.google.gson.Gson create = gsonBuilderInstance.create();
        gson = create;
        if (create == null) {
            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("");
        }
        return create;
    }
}
