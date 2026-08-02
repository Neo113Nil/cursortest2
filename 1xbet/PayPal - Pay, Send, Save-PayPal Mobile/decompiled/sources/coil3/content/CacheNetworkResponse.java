package coil3.content;

@kotlin.Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0015\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0007\u0010\bJ\u001d\u0010\r\u001a\u00020\f2\u0006\u0010\t\u001a\u00020\u00062\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\r\u0010\u000e"}, d2 = {"Lcoil3/network/CacheNetworkResponse;", "", "<init>", "()V", "Lokio/BufferedSource;", "source", "Lcoil3/network/NetworkResponse;", "readFrom", "(Lokio/BufferedSource;)Lcoil3/network/NetworkResponse;", "response", "Lokio/BufferedSink;", "sink", "", "writeTo", "(Lcoil3/network/NetworkResponse;Lokio/BufferedSink;)V"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes.dex */
public final class CacheNetworkResponse {
    public static final coil3.content.CacheNetworkResponse INSTANCE = new coil3.content.CacheNetworkResponse();

    private CacheNetworkResponse() {
    }

    public final coil3.content.NetworkResponse readFrom(okio.BufferedSource source) {
        int parseInt = java.lang.Integer.parseInt(source.readUtf8LineStrict());
        long parseLong = java.lang.Long.parseLong(source.readUtf8LineStrict());
        long parseLong2 = java.lang.Long.parseLong(source.readUtf8LineStrict());
        coil3.network.NetworkHeaders.Builder builder = new coil3.network.NetworkHeaders.Builder();
        int parseInt2 = java.lang.Integer.parseInt(source.readUtf8LineStrict());
        for (int i = 0; i < parseInt2; i++) {
            coil3.content.internal.UtilsKt.append(builder, source.readUtf8LineStrict());
        }
        return new coil3.content.NetworkResponse(parseInt, parseLong, parseLong2, builder.build(), null, null, 48, null);
    }

    public final void writeTo(coil3.content.NetworkResponse response, okio.BufferedSink sink) {
        sink.writeDecimalLong(response.getCode()).writeByte(10);
        sink.writeDecimalLong(response.getRequestMillis()).writeByte(10);
        sink.writeDecimalLong(response.getResponseMillis()).writeByte(10);
        java.util.Set<java.util.Map.Entry<java.lang.String, java.util.List<java.lang.String>>> entrySet = response.getHeaders().asMap().entrySet();
        java.util.Iterator<T> it = entrySet.iterator();
        int i = 0;
        while (it.hasNext()) {
            i += ((java.util.List) ((java.util.Map.Entry) it.next()).getValue()).size();
        }
        sink.writeDecimalLong(i).writeByte(10);
        for (java.util.Map.Entry<java.lang.String, java.util.List<java.lang.String>> entry : entrySet) {
            java.util.Iterator<java.lang.String> it2 = entry.getValue().iterator();
            while (it2.hasNext()) {
                sink.writeUtf8(entry.getKey()).writeUtf8(io.ktor.sse.ServerSentEventKt.COLON).writeUtf8(it2.next()).writeByte(10);
            }
        }
    }
}
