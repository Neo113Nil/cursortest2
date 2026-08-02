package com.discover.mpos.sdk.core.debug.logger;

@kotlin.Metadata(bv = {1, 0, 3}, d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0012\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u0017\u0010\u0007\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\u0007\u0010\bJ#\u0010\r\u001a\u00020\f2\b\u0010\n\u001a\u0004\u0018\u00010\t2\b\u0010\u000b\u001a\u0004\u0018\u00010\u0002H\u0016¢\u0006\u0004\b\r\u0010\u000e"}, d2 = {"Lcom/discover/mpos/sdk/core/debug/logger/ByteArrayGsonAdapter;", "Lcom/google/gson/TypeAdapter;", "", "<init>", "()V", "Lcom/google/gson/stream/JsonReader;", "reader", "read", "(Lcom/google/gson/stream/JsonReader;)[B", "Lcom/google/gson/stream/JsonWriter;", "out", com.datadog.android.rum.internal.metric.ViewEndedMetricDispatcher.KEY_VALUE, "", "write", "(Lcom/google/gson/stream/JsonWriter;[B)V"}, k = 1, mv = {1, 4, 1})
/* loaded from: classes8.dex */
public final class ByteArrayGsonAdapter extends com.google.gson.TypeAdapter<byte[]> {
    @Override // com.google.gson.TypeAdapter
    /* renamed from: read, reason: avoid collision after fix types in other method */
    public final byte[] read2(com.google.gson.stream.JsonReader reader) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(reader, "");
        return new byte[0];
    }

    @Override // com.google.gson.TypeAdapter
    public final void write(com.google.gson.stream.JsonWriter out, byte[] value) {
        if (out != null) {
            out.value(value != null ? com.discover.mpos.sdk.core.extensions.ByteArrayExtensionsKt.toHexString(value) : null);
        }
    }
}
