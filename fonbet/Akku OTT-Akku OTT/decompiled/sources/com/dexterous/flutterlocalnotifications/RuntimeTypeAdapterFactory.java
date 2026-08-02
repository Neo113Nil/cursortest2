package com.dexterous.flutterlocalnotifications;

import androidx.annotation.Keep;
import com.google.gson.Gson;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParseException;
import com.google.gson.JsonPrimitive;
import com.google.gson.TypeAdapter;
import com.google.gson.TypeAdapterFactory;
import com.google.gson.internal.Streams;
import com.google.gson.reflect.TypeToken;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import java.io.IOException;
import java.util.LinkedHashMap;
import java.util.Map;

@Keep
/* loaded from: classes3.dex */
public final class RuntimeTypeAdapterFactory<T> implements TypeAdapterFactory {
    private final Class<?> baseType;
    private final Map<String, Class<?>> labelToSubtype = new LinkedHashMap();
    private final Map<Class<?>, String> subtypeToLabel = new LinkedHashMap();
    private final String typeFieldName;

    /* JADX INFO: Add missing generic type declarations: [R] */
    public class a<R> extends TypeAdapter<R> {
        public final /* synthetic */ LinkedHashMap a;
        public final /* synthetic */ LinkedHashMap b;

        public a(LinkedHashMap linkedHashMap, LinkedHashMap linkedHashMap2) {
            this.a = linkedHashMap;
            this.b = linkedHashMap2;
        }

        @Override // com.google.gson.TypeAdapter
        /* renamed from: read */
        public final R read2(JsonReader jsonReader) throws IOException {
            JsonElement parse = Streams.parse(jsonReader);
            JsonObject asJsonObject = parse.getAsJsonObject();
            RuntimeTypeAdapterFactory runtimeTypeAdapterFactory = RuntimeTypeAdapterFactory.this;
            JsonElement remove = asJsonObject.remove(runtimeTypeAdapterFactory.typeFieldName);
            if (remove == null) {
                throw new JsonParseException("cannot deserialize " + runtimeTypeAdapterFactory.baseType + " because it does not define a field named " + runtimeTypeAdapterFactory.typeFieldName);
            }
            String asString = remove.getAsString();
            TypeAdapter typeAdapter = (TypeAdapter) this.a.get(asString);
            if (typeAdapter != null) {
                return (R) typeAdapter.fromJsonTree(parse);
            }
            throw new JsonParseException("cannot deserialize " + runtimeTypeAdapterFactory.baseType + " subtype named " + asString + "; did you forget to register a subtype?");
        }

        @Override // com.google.gson.TypeAdapter
        public final void write(JsonWriter jsonWriter, R r) throws IOException {
            Class<?> cls = r.getClass();
            RuntimeTypeAdapterFactory runtimeTypeAdapterFactory = RuntimeTypeAdapterFactory.this;
            String str = (String) runtimeTypeAdapterFactory.subtypeToLabel.get(cls);
            TypeAdapter typeAdapter = (TypeAdapter) this.b.get(cls);
            if (typeAdapter == null) {
                throw new JsonParseException("cannot serialize " + cls.getName() + "; did you forget to register a subtype?");
            }
            JsonObject asJsonObject = typeAdapter.toJsonTree(r).getAsJsonObject();
            if (asJsonObject.has(runtimeTypeAdapterFactory.typeFieldName)) {
                throw new JsonParseException("cannot serialize " + cls.getName() + " because it already defines a field named " + runtimeTypeAdapterFactory.typeFieldName);
            }
            JsonObject jsonObject = new JsonObject();
            jsonObject.add(runtimeTypeAdapterFactory.typeFieldName, new JsonPrimitive(str));
            for (Map.Entry<String, JsonElement> entry : asJsonObject.entrySet()) {
                jsonObject.add(entry.getKey(), entry.getValue());
            }
            Streams.write(jsonObject, jsonWriter);
        }
    }

    private RuntimeTypeAdapterFactory(Class<?> cls, String str) {
        if (str == null || cls == null) {
            throw null;
        }
        this.baseType = cls;
        this.typeFieldName = str;
    }

    public static <T> RuntimeTypeAdapterFactory<T> of(Class<T> cls, String str) {
        return new RuntimeTypeAdapterFactory<>(cls, str);
    }

    @Override // com.google.gson.TypeAdapterFactory
    public <R> TypeAdapter<R> create(Gson gson, TypeToken<R> typeToken) {
        if (typeToken.getRawType() != this.baseType) {
            return null;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        LinkedHashMap linkedHashMap2 = new LinkedHashMap();
        for (Map.Entry<String, Class<?>> entry : this.labelToSubtype.entrySet()) {
            TypeAdapter<T> delegateAdapter = gson.getDelegateAdapter(this, TypeToken.get((Class) entry.getValue()));
            linkedHashMap.put(entry.getKey(), delegateAdapter);
            linkedHashMap2.put(entry.getValue(), delegateAdapter);
        }
        return new a(linkedHashMap, linkedHashMap2).nullSafe();
    }

    public RuntimeTypeAdapterFactory<T> registerSubtype(Class<? extends T> cls, String str) {
        if (cls == null || str == null) {
            throw null;
        }
        if (this.subtypeToLabel.containsKey(cls) || this.labelToSubtype.containsKey(str)) {
            throw new IllegalArgumentException("types and labels must be unique");
        }
        this.labelToSubtype.put(str, cls);
        this.subtypeToLabel.put(cls, str);
        return this;
    }

    public static <T> RuntimeTypeAdapterFactory<T> of(Class<T> cls) {
        return new RuntimeTypeAdapterFactory<>(cls, "type");
    }

    public RuntimeTypeAdapterFactory<T> registerSubtype(Class<? extends T> cls) {
        return registerSubtype(cls, cls.getSimpleName());
    }
}
