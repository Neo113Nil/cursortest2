package com.discover.mpos.sdk.logger;

@kotlin.Metadata(bv = {1, 0, 3}, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0003J\u0010\u0010\u0004\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0006H\u0016J\u001a\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\u0002H\u0016¨\u0006\f"}, d2 = {"Lcom/discover/mpos/sdk/logger/TcqGsonAdapter;", "Lcom/google/gson/TypeAdapter;", "Lcom/discover/mpos/sdk/cardreader/config/TerminalCapabilitiesQualifiers;", "()V", "read", "reader", "Lcom/google/gson/stream/JsonReader;", "write", "", "writer", "Lcom/google/gson/stream/JsonWriter;", "tcq", "mpos-sdk-card-reader_offlineRegularRelease"}, k = 1, mv = {1, 4, 1})
/* renamed from: com.discover.mpos.sdk.d.c, reason: from Kotlin metadata */
/* loaded from: classes8.dex */
public final class TcqGsonAdapter extends com.google.gson.TypeAdapter<com.discover.mpos.sdk.cardreader.config.TerminalCapabilitiesQualifiers> {
    @Override // com.google.gson.TypeAdapter
    /* renamed from: read */
    public final /* synthetic */ com.discover.mpos.sdk.cardreader.config.TerminalCapabilitiesQualifiers read2(com.google.gson.stream.JsonReader jsonReader) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(jsonReader, "");
        return new com.discover.mpos.sdk.cardreader.config.TerminalCapabilitiesQualifiers((java.util.List<com.discover.mpos.sdk.core.data.ByteInfo>) kotlin.collections.CollectionsKt.emptyList());
    }

    @Override // com.google.gson.TypeAdapter
    public final /* synthetic */ void write(com.google.gson.stream.JsonWriter jsonWriter, com.discover.mpos.sdk.cardreader.config.TerminalCapabilitiesQualifiers terminalCapabilitiesQualifiers) {
        java.lang.String hexString;
        com.discover.mpos.sdk.cardreader.config.TerminalCapabilitiesQualifiers terminalCapabilitiesQualifiers2 = terminalCapabilitiesQualifiers;
        java.lang.String str = "";
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(jsonWriter, "");
        jsonWriter.nullValue();
        jsonWriter.name("terminalCapabilities");
        if (terminalCapabilitiesQualifiers2 != null && (hexString = terminalCapabilitiesQualifiers2.toHexString()) != null) {
            str = hexString;
        }
        jsonWriter.value(str);
    }
}
