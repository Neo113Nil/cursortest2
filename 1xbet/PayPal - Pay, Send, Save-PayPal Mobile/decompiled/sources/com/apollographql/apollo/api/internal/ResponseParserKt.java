package com.apollographql.apollo.api.internal;

@kotlin.Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a\u0013\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u0002¢\u0006\u0004\b\u0002\u0010\u0003\u001a\u001b\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0004*\u00020\u0000H\u0002¢\u0006\u0004\b\u0006\u0010\u0007\u001a\u001b\u0010\t\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u0004*\u00020\u0000H\u0002¢\u0006\u0004\b\t\u0010\u0007\u001a\u0013\u0010\n\u001a\u00020\b*\u00020\u0000H\u0002¢\u0006\u0004\b\n\u0010\u000b\u001a\u0017\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00010\u0004*\u00020\u0000¢\u0006\u0004\b\f\u0010\u0007"}, d2 = {"Lcom/apollographql/apollo/api/json/JsonReader;", "Lcom/apollographql/apollo/api/Error;", "Camera2StreamConfigurationMap", "(Lcom/apollographql/apollo/api/json/JsonReader;)Lcom/apollographql/apollo/api/Error;", "", "", "getHighSpeedVideoFpsRanges", "(Lcom/apollographql/apollo/api/json/JsonReader;)Ljava/util/List;", "Lcom/apollographql/apollo/api/Error$Location;", "getHighSpeedVideoFpsRangesFor", "getHighSpeedVideoSizes", "(Lcom/apollographql/apollo/api/json/JsonReader;)Lcom/apollographql/apollo/api/Error$Location;", "readErrors"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class ResponseParserKt {
    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:15:0x005f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final com.apollographql.apollo.api.Error Camera2StreamConfigurationMap(com.apollographql.apollo.api.json.JsonReader jsonReader) {
        jsonReader.beginObject();
        java.lang.String str = "";
        java.util.List<com.apollographql.apollo.api.Error.Location> list = null;
        java.util.List<java.lang.Object> list2 = null;
        java.util.Map map = null;
        java.util.LinkedHashMap linkedHashMap = null;
        while (jsonReader.hasNext()) {
            java.lang.String nextName = jsonReader.nextName();
            switch (nextName.hashCode()) {
                case -1809421292:
                    if (!nextName.equals(com.adobe.marketing.mobile.internal.eventhub.EventHubConstants.EventDataKeys.EXTENSIONS)) {
                        if (linkedHashMap == null) {
                            linkedHashMap = new java.util.LinkedHashMap();
                        }
                        linkedHashMap.put(nextName, com.apollographql.apollo.api.json.JsonReaders.readAny(jsonReader));
                        break;
                    } else {
                        java.lang.Object readAny = com.apollographql.apollo.api.json.JsonReaders.readAny(jsonReader);
                        if (!(readAny instanceof java.util.Map)) {
                            map = null;
                            break;
                        } else {
                            map = (java.util.Map) readAny;
                            break;
                        }
                    }
                case -1197189282:
                    if (!nextName.equals("locations")) {
                        if (linkedHashMap == null) {
                        }
                        linkedHashMap.put(nextName, com.apollographql.apollo.api.json.JsonReaders.readAny(jsonReader));
                        break;
                    } else {
                        list = getHighSpeedVideoFpsRangesFor(jsonReader);
                        break;
                    }
                case 3433509:
                    if (!nextName.equals("path")) {
                        if (linkedHashMap == null) {
                        }
                        linkedHashMap.put(nextName, com.apollographql.apollo.api.json.JsonReaders.readAny(jsonReader));
                        break;
                    } else {
                        list2 = getHighSpeedVideoFpsRanges(jsonReader);
                        break;
                    }
                case 954925063:
                    if (!nextName.equals("message")) {
                        if (linkedHashMap == null) {
                        }
                        linkedHashMap.put(nextName, com.apollographql.apollo.api.json.JsonReaders.readAny(jsonReader));
                        break;
                    } else {
                        str = jsonReader.nextString();
                        if (str != null) {
                            break;
                        } else {
                            str = "";
                            break;
                        }
                    }
                default:
                    if (linkedHashMap == null) {
                    }
                    linkedHashMap.put(nextName, com.apollographql.apollo.api.json.JsonReaders.readAny(jsonReader));
                    break;
            }
        }
        jsonReader.endObject();
        return new com.apollographql.apollo.api.Error(str, list, list2, map, linkedHashMap);
    }

    private static final java.util.List<java.lang.Object> getHighSpeedVideoFpsRanges(com.apollographql.apollo.api.json.JsonReader jsonReader) {
        if (jsonReader.getCamera2StreamConfigurationMap() == com.apollographql.apollo.api.json.JsonReader.Token.NULL) {
            return (java.util.List) jsonReader.nextNull();
        }
        java.util.ArrayList arrayList = new java.util.ArrayList();
        jsonReader.beginArray();
        while (jsonReader.hasNext()) {
            int i = com.apollographql.apollo.api.internal.ResponseParserKt.WhenMappings.$EnumSwitchMapping$0[jsonReader.getCamera2StreamConfigurationMap().ordinal()];
            if (i == 1 || i == 2) {
                arrayList.add(java.lang.Integer.valueOf(jsonReader.nextInt()));
            } else {
                java.lang.String nextString = jsonReader.nextString();
                kotlin.jvm.internal.Intrinsics.checkNotNull(nextString);
                arrayList.add(nextString);
            }
        }
        jsonReader.endArray();
        return arrayList;
    }

    private static final java.util.List<com.apollographql.apollo.api.Error.Location> getHighSpeedVideoFpsRangesFor(com.apollographql.apollo.api.json.JsonReader jsonReader) {
        if (jsonReader.getCamera2StreamConfigurationMap() == com.apollographql.apollo.api.json.JsonReader.Token.NULL) {
            return (java.util.List) jsonReader.nextNull();
        }
        java.util.ArrayList arrayList = new java.util.ArrayList();
        jsonReader.beginArray();
        while (jsonReader.hasNext()) {
            arrayList.add(getHighSpeedVideoSizes(jsonReader));
        }
        jsonReader.endArray();
        return arrayList;
    }

    private static final com.apollographql.apollo.api.Error.Location getHighSpeedVideoSizes(com.apollographql.apollo.api.json.JsonReader jsonReader) {
        jsonReader.beginObject();
        int i = -1;
        int i2 = -1;
        while (jsonReader.hasNext()) {
            java.lang.String nextName = jsonReader.nextName();
            if (kotlin.jvm.internal.Intrinsics.areEqual(nextName, "line")) {
                i = jsonReader.nextInt();
            } else if (kotlin.jvm.internal.Intrinsics.areEqual(nextName, "column")) {
                i2 = jsonReader.nextInt();
            } else {
                jsonReader.skipValue();
            }
        }
        jsonReader.endObject();
        return new com.apollographql.apollo.api.Error.Location(i, i2);
    }

    public static final java.util.List<com.apollographql.apollo.api.Error> readErrors(com.apollographql.apollo.api.json.JsonReader jsonReader) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(jsonReader, "");
        if (jsonReader.getCamera2StreamConfigurationMap() == com.apollographql.apollo.api.json.JsonReader.Token.NULL) {
            jsonReader.nextNull();
            return kotlin.collections.CollectionsKt.emptyList();
        }
        jsonReader.beginArray();
        java.util.ArrayList arrayList = new java.util.ArrayList();
        while (jsonReader.hasNext()) {
            arrayList.add(Camera2StreamConfigurationMap(jsonReader));
        }
        jsonReader.endArray();
        return arrayList;
    }

    @kotlin.Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public final /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[com.apollographql.apollo.api.json.JsonReader.Token.values().length];
            try {
                iArr[com.apollographql.apollo.api.json.JsonReader.Token.NUMBER.ordinal()] = 1;
            } catch (java.lang.NoSuchFieldError unused) {
            }
            try {
                iArr[com.apollographql.apollo.api.json.JsonReader.Token.LONG.ordinal()] = 2;
            } catch (java.lang.NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }
}
