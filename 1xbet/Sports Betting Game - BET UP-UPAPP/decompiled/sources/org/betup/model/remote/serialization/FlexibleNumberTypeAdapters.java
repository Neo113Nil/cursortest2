package org.betup.model.remote.serialization;

import androidx.collection.SieveCacheKt;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.TypeAdapter;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonToken;
import com.google.gson.stream.JsonWriter;
import java.io.IOException;

/* loaded from: classes2.dex */
public final class FlexibleNumberTypeAdapters {
    public static final TypeAdapter<Long> LONG = new TypeAdapter<Long>() { // from class: org.betup.model.remote.serialization.FlexibleNumberTypeAdapters.1
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // com.google.gson.TypeAdapter
        /* renamed from: read */
        public Long read2(JsonReader in) throws IOException {
            JsonToken peek = in.peek();
            if (peek == JsonToken.NULL) {
                in.nextNull();
                return 0L;
            }
            if (peek == JsonToken.NUMBER) {
                return Long.valueOf((long) in.nextDouble());
            }
            if (peek == JsonToken.STRING) {
                String nextString = in.nextString();
                if (nextString != null && !nextString.isEmpty()) {
                    try {
                        return Long.valueOf((long) Double.parseDouble(nextString.trim()));
                    } catch (NumberFormatException unused) {
                    }
                }
                return 0L;
            }
            in.skipValue();
            return 0L;
        }

        @Override // com.google.gson.TypeAdapter
        public void write(JsonWriter out, Long value) throws IOException {
            out.value(value != null ? value.longValue() : 0L);
        }
    };
    public static final TypeAdapter<Integer> INTEGER = new TypeAdapter<Integer>() { // from class: org.betup.model.remote.serialization.FlexibleNumberTypeAdapters.2
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // com.google.gson.TypeAdapter
        /* renamed from: read */
        public Integer read2(JsonReader in) throws IOException {
            JsonToken peek = in.peek();
            if (peek == JsonToken.NULL) {
                in.nextNull();
                return 0;
            }
            if (peek == JsonToken.NUMBER) {
                return Integer.valueOf((int) Math.max(SieveCacheKt.NodeMetaAndPreviousMask, Math.min(SieveCacheKt.NodeLinkMask, (long) in.nextDouble())));
            }
            if (peek == JsonToken.STRING) {
                String nextString = in.nextString();
                if (nextString != null && !nextString.isEmpty()) {
                    try {
                        return Integer.valueOf((int) Math.max(SieveCacheKt.NodeMetaAndPreviousMask, Math.min(SieveCacheKt.NodeLinkMask, (long) Double.parseDouble(nextString.trim()))));
                    } catch (NumberFormatException unused) {
                    }
                }
                return 0;
            }
            in.skipValue();
            return 0;
        }

        @Override // com.google.gson.TypeAdapter
        public void write(JsonWriter out, Integer value) throws IOException {
            out.value(value != null ? value.intValue() : 0L);
        }
    };

    private FlexibleNumberTypeAdapters() {
    }

    public static Gson createApiGson() {
        GsonBuilder gsonBuilder = new GsonBuilder();
        TypeAdapter<Long> typeAdapter = LONG;
        GsonBuilder registerTypeAdapter = gsonBuilder.registerTypeAdapter(Long.class, typeAdapter).registerTypeAdapter(Long.TYPE, typeAdapter);
        TypeAdapter<Integer> typeAdapter2 = INTEGER;
        return registerTypeAdapter.registerTypeAdapter(Integer.class, typeAdapter2).registerTypeAdapter(Integer.TYPE, typeAdapter2).create();
    }
}
