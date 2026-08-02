package com.discover.mpos.sdk.core.debug.logger;

@kotlin.Metadata(bv = {1, 0, 3}, k = 3, mv = {1, 4, 1})
/* loaded from: classes8.dex */
final /* synthetic */ class PrettifiedGson$gsonInstance$1 extends kotlin.jvm.internal.MutablePropertyReference0Impl {
    @Override // kotlin.jvm.internal.MutablePropertyReference0Impl, kotlin.reflect.KProperty0
    public final java.lang.Object get() {
        return com.discover.mpos.sdk.core.debug.logger.PrettifiedGson.access$getGson$p((com.discover.mpos.sdk.core.debug.logger.PrettifiedGson) this.receiver);
    }

    @Override // kotlin.jvm.internal.MutablePropertyReference0Impl, kotlin.reflect.KMutableProperty0
    public final void set(java.lang.Object obj) {
        com.discover.mpos.sdk.core.debug.logger.PrettifiedGson.gson = (com.google.gson.Gson) obj;
    }

    PrettifiedGson$gsonInstance$1(com.discover.mpos.sdk.core.debug.logger.PrettifiedGson prettifiedGson) {
        super(prettifiedGson, com.discover.mpos.sdk.core.debug.logger.PrettifiedGson.class, "gson", "getGson()Lcom/google/gson/Gson;", 0);
    }
}
