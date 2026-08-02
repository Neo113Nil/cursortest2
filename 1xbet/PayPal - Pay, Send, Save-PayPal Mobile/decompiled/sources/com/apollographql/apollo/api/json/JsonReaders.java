package com.apollographql.apollo.api.json;

@kotlin.Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\u0011\u0010\u0002\u001a\u00020\u0001*\u00020\u0000¢\u0006\u0004\b\u0002\u0010\u0003\u001a\u001f\u0010\u0002\u001a\u00020\u0001*\u0010\u0012\u0004\u0012\u00020\u0005\u0012\u0006\u0012\u0004\u0018\u00010\u00060\u0004¢\u0006\u0004\b\u0002\u0010\u0007\u001a\u0019\u0010\t\u001a\n\u0018\u00010\u0006j\u0004\u0018\u0001`\b*\u00020\u0001¢\u0006\u0004\b\t\u0010\n\u001a\u0013\u0010\u000b\u001a\u00020\u0006*\u00020\u0001H\u0002¢\u0006\u0004\b\u000b\u0010\n"}, d2 = {"Lokio/BufferedSource;", "Lcom/apollographql/apollo/api/json/JsonReader;", "jsonReader", "(Lokio/BufferedSource;)Lcom/apollographql/apollo/api/json/JsonReader;", "", "", "", "(Ljava/util/Map;)Lcom/apollographql/apollo/api/json/JsonReader;", "Lcom/apollographql/apollo/api/json/ApolloJsonElement;", "readAny", "(Lcom/apollographql/apollo/api/json/JsonReader;)Ljava/lang/Object;", "getHighSpeedVideoSizes"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* renamed from: com.apollographql.apollo.api.json.-JsonReaders, reason: invalid class name */
/* loaded from: classes.dex */
public final class JsonReaders {
    public static final com.apollographql.apollo.api.json.JsonReader jsonReader(okio.BufferedSource bufferedSource) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(bufferedSource, "");
        return new com.apollographql.apollo.api.json.BufferedSourceJsonReader(bufferedSource);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final com.apollographql.apollo.api.json.JsonReader jsonReader(java.util.Map<java.lang.String, ? extends java.lang.Object> map) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(map, "");
        return new com.apollographql.apollo.api.json.MapJsonReader(map, null, 2, 0 == true ? 1 : 0);
    }

    public static final java.lang.Object readAny(com.apollographql.apollo.api.json.JsonReader jsonReader) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(jsonReader, "");
        com.apollographql.apollo.api.json.JsonReader.Token camera2StreamConfigurationMap = jsonReader.getCamera2StreamConfigurationMap();
        switch (com.apollographql.apollo.api.json.JsonReaders.WhenMappings.$EnumSwitchMapping$0[camera2StreamConfigurationMap.ordinal()]) {
            case 1:
                return jsonReader.nextNull();
            case 2:
                return java.lang.Boolean.valueOf(jsonReader.nextBoolean());
            case 3:
            case 4:
                return getHighSpeedVideoSizes(jsonReader);
            case 5:
                return jsonReader.nextString();
            case 6:
                jsonReader.beginObject();
                java.util.LinkedHashMap linkedHashMap = new java.util.LinkedHashMap();
                while (jsonReader.hasNext()) {
                    linkedHashMap.put(jsonReader.nextName(), readAny(jsonReader));
                }
                jsonReader.endObject();
                return linkedHashMap;
            case 7:
                jsonReader.beginArray();
                java.util.ArrayList arrayList = new java.util.ArrayList();
                while (jsonReader.hasNext()) {
                    arrayList.add(readAny(jsonReader));
                }
                jsonReader.endArray();
                return arrayList;
            default:
                throw new java.lang.IllegalStateException("unknown token ".concat(java.lang.String.valueOf(camera2StreamConfigurationMap)).toString());
        }
    }

    private static final java.lang.Object getHighSpeedVideoSizes(com.apollographql.apollo.api.json.JsonReader jsonReader) {
        try {
            try {
                try {
                    return java.lang.Integer.valueOf(jsonReader.nextInt());
                } catch (java.lang.Exception unused) {
                    return jsonReader.nextNumber();
                }
            } catch (java.lang.Exception unused2) {
                return java.lang.Long.valueOf(jsonReader.nextLong());
            }
        } catch (java.lang.Exception unused3) {
            return java.lang.Double.valueOf(jsonReader.nextDouble());
        }
    }

    @kotlin.Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    /* renamed from: com.apollographql.apollo.api.json.-JsonReaders$WhenMappings */
    /* loaded from: classes3.dex */
    public final /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[com.apollographql.apollo.api.json.JsonReader.Token.values().length];
            try {
                iArr[com.apollographql.apollo.api.json.JsonReader.Token.NULL.ordinal()] = 1;
            } catch (java.lang.NoSuchFieldError unused) {
            }
            try {
                iArr[com.apollographql.apollo.api.json.JsonReader.Token.BOOLEAN.ordinal()] = 2;
            } catch (java.lang.NoSuchFieldError unused2) {
            }
            try {
                iArr[com.apollographql.apollo.api.json.JsonReader.Token.LONG.ordinal()] = 3;
            } catch (java.lang.NoSuchFieldError unused3) {
            }
            try {
                iArr[com.apollographql.apollo.api.json.JsonReader.Token.NUMBER.ordinal()] = 4;
            } catch (java.lang.NoSuchFieldError unused4) {
            }
            try {
                iArr[com.apollographql.apollo.api.json.JsonReader.Token.STRING.ordinal()] = 5;
            } catch (java.lang.NoSuchFieldError unused5) {
            }
            try {
                iArr[com.apollographql.apollo.api.json.JsonReader.Token.BEGIN_OBJECT.ordinal()] = 6;
            } catch (java.lang.NoSuchFieldError unused6) {
            }
            try {
                iArr[com.apollographql.apollo.api.json.JsonReader.Token.BEGIN_ARRAY.ordinal()] = 7;
            } catch (java.lang.NoSuchFieldError unused7) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }
}
