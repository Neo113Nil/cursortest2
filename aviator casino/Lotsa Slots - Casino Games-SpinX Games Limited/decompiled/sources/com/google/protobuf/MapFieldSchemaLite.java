package com.google.protobuf;

@com.google.protobuf.CheckReturnValue
/* loaded from: classes4.dex */
class MapFieldSchemaLite implements com.google.protobuf.MapFieldSchema {
    MapFieldSchemaLite() {
    }

    @Override // com.google.protobuf.MapFieldSchema
    public java.util.Map<?, ?> forMutableMapData(java.lang.Object mapField) {
        return (com.google.protobuf.MapFieldLite) mapField;
    }

    @Override // com.google.protobuf.MapFieldSchema
    public com.google.protobuf.MapEntryLite.Metadata<?, ?> forMapMetadata(java.lang.Object mapDefaultEntry) {
        return ((com.google.protobuf.MapEntryLite) mapDefaultEntry).getMetadata();
    }

    @Override // com.google.protobuf.MapFieldSchema
    public java.util.Map<?, ?> forMapData(java.lang.Object mapField) {
        return (com.google.protobuf.MapFieldLite) mapField;
    }

    @Override // com.google.protobuf.MapFieldSchema
    public boolean isImmutable(java.lang.Object mapField) {
        return !((com.google.protobuf.MapFieldLite) mapField).isMutable();
    }

    @Override // com.google.protobuf.MapFieldSchema
    public java.lang.Object toImmutable(java.lang.Object mapField) {
        ((com.google.protobuf.MapFieldLite) mapField).makeImmutable();
        return mapField;
    }

    @Override // com.google.protobuf.MapFieldSchema
    public java.lang.Object newMapField(java.lang.Object unused) {
        return com.google.protobuf.MapFieldLite.emptyMapField().mutableCopy();
    }

    @Override // com.google.protobuf.MapFieldSchema
    public java.lang.Object mergeFrom(java.lang.Object destMapField, java.lang.Object srcMapField) {
        return mergeFromLite(destMapField, srcMapField);
    }

    private static <K, V> com.google.protobuf.MapFieldLite<K, V> mergeFromLite(java.lang.Object destMapField, java.lang.Object srcMapField) {
        com.google.protobuf.MapFieldLite<K, V> mapFieldLite = (com.google.protobuf.MapFieldLite) destMapField;
        com.google.protobuf.MapFieldLite<K, V> mapFieldLite2 = (com.google.protobuf.MapFieldLite) srcMapField;
        if (!mapFieldLite2.isEmpty()) {
            if (!mapFieldLite.isMutable()) {
                mapFieldLite = mapFieldLite.mutableCopy();
            }
            mapFieldLite.mergeFrom(mapFieldLite2);
        }
        return mapFieldLite;
    }

    @Override // com.google.protobuf.MapFieldSchema
    public int getSerializedSize(int fieldNumber, java.lang.Object mapField, java.lang.Object mapDefaultEntry) {
        return getSerializedSizeLite(fieldNumber, mapField, mapDefaultEntry);
    }

    private static <K, V> int getSerializedSizeLite(int fieldNumber, java.lang.Object mapField, java.lang.Object defaultEntry) {
        com.google.protobuf.MapFieldLite mapFieldLite = (com.google.protobuf.MapFieldLite) mapField;
        com.google.protobuf.MapEntryLite mapEntryLite = (com.google.protobuf.MapEntryLite) defaultEntry;
        int i = 0;
        if (mapFieldLite.isEmpty()) {
            return 0;
        }
        for (java.util.Map.Entry<K, V> entry : mapFieldLite.entrySet()) {
            i += mapEntryLite.computeMessageSize(fieldNumber, entry.getKey(), entry.getValue());
        }
        return i;
    }
}
