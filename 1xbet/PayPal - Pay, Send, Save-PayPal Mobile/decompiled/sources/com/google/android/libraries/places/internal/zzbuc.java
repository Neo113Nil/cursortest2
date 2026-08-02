package com.google.android.libraries.places.internal;

/* loaded from: classes4.dex */
public final class zzbuc {
    private static final java.util.logging.Logger zza = java.util.logging.Logger.getLogger(com.google.android.libraries.places.internal.zzbuc.class.getName());

    public static java.lang.Object zza(java.lang.String str) throws java.io.IOException {
        com.google.gson.stream.JsonReader jsonReader = new com.google.gson.stream.JsonReader(new java.io.StringReader(str));
        try {
            java.lang.Object zzb = zzb(jsonReader);
            try {
                return zzb;
            } catch (java.io.IOException e) {
                return zzb;
            }
        } finally {
            try {
                jsonReader.close();
            } catch (java.io.IOException e2) {
                zza.logp(java.util.logging.Level.WARNING, "io.grpc.internal.JsonParser", "parse", "Failed to close", (java.lang.Throwable) e2);
            }
        }
    }

    private static java.lang.Object zzb(com.google.gson.stream.JsonReader jsonReader) throws java.io.IOException {
        com.google.common.base.Preconditions.checkState(jsonReader.hasNext(), "unexpected end of JSON");
        switch (com.google.android.libraries.places.internal.zzbub.zza[jsonReader.peek().ordinal()]) {
            case 1:
                jsonReader.beginArray();
                java.util.ArrayList arrayList = new java.util.ArrayList();
                while (jsonReader.hasNext()) {
                    arrayList.add(zzb(jsonReader));
                }
                com.google.common.base.Preconditions.checkState(jsonReader.peek() == com.google.gson.stream.JsonToken.END_ARRAY, "Bad token: ".concat(java.lang.String.valueOf(jsonReader.getPath())));
                jsonReader.endArray();
                return java.util.Collections.unmodifiableList(arrayList);
            case 2:
                jsonReader.beginObject();
                java.util.LinkedHashMap linkedHashMap = new java.util.LinkedHashMap();
                while (jsonReader.hasNext()) {
                    java.lang.String nextName = jsonReader.nextName();
                    com.google.common.base.Preconditions.checkArgument(!linkedHashMap.containsKey(nextName), "Duplicate key found: %s", nextName);
                    linkedHashMap.put(nextName, zzb(jsonReader));
                }
                com.google.common.base.Preconditions.checkState(jsonReader.peek() == com.google.gson.stream.JsonToken.END_OBJECT, "Bad token: ".concat(java.lang.String.valueOf(jsonReader.getPath())));
                jsonReader.endObject();
                return java.util.Collections.unmodifiableMap(linkedHashMap);
            case 3:
                return jsonReader.nextString();
            case 4:
                return java.lang.Double.valueOf(jsonReader.nextDouble());
            case 5:
                return java.lang.Boolean.valueOf(jsonReader.nextBoolean());
            case 6:
                jsonReader.nextNull();
                return null;
            default:
                throw new java.lang.IllegalStateException("Bad token: ".concat(java.lang.String.valueOf(jsonReader.getPath())));
        }
    }

    private zzbuc() {
    }
}
