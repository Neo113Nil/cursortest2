package com.discover.mpos.sdk.core.debug.logger;

@kotlin.Metadata(bv = {1, 0, 3}, d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u0017\u0010\u0007\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\u0007\u0010\bJ\u001f\u0010\r\u001a\u00020\f2\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\u000b\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\r\u0010\u000eR\u0014\u0010\u0010\u001a\u00020\u000f8\u0002X\u0082D¢\u0006\u0006\n\u0004\b\u0010\u0010\u0011"}, d2 = {"Lcom/discover/mpos/sdk/core/debug/logger/ByteInfoGsonAdapter;", "Lcom/google/gson/TypeAdapter;", "Lcom/discover/mpos/sdk/core/data/ByteInfo;", "<init>", "()V", "Lcom/google/gson/stream/JsonReader;", "reader", "read", "(Lcom/google/gson/stream/JsonReader;)Lcom/discover/mpos/sdk/core/data/ByteInfo;", "Lcom/google/gson/stream/JsonWriter;", "writer", "byteInfo", "", "write", "(Lcom/google/gson/stream/JsonWriter;Lcom/discover/mpos/sdk/core/data/ByteInfo;)V", "", "byteInfoFieldName", "Ljava/lang/String;"}, k = 1, mv = {1, 4, 1})
/* loaded from: classes8.dex */
public final class ByteInfoGsonAdapter extends com.google.gson.TypeAdapter<com.discover.mpos.sdk.core.data.ByteInfo> {
    private final java.lang.String byteInfoFieldName = "byteInfo";

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // com.google.gson.TypeAdapter
    /* renamed from: read */
    public final com.discover.mpos.sdk.core.data.ByteInfo read2(com.google.gson.stream.JsonReader reader) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(reader, "");
        return new com.discover.mpos.sdk.core.data.ByteInfo(new boolean[0]);
    }

    @Override // com.google.gson.TypeAdapter
    public final void write(com.google.gson.stream.JsonWriter writer, com.discover.mpos.sdk.core.data.ByteInfo byteInfo) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(writer, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(byteInfo, "");
        writer.beginObject();
        writer.name(this.byteInfoFieldName);
        writer.value(byteInfo.toString());
        writer.endObject();
    }
}
