package com.google.crypto.tink.shaded.protobuf;

@com.google.crypto.tink.shaded.protobuf.CheckReturnValue
/* loaded from: classes4.dex */
final class MapFieldSchemaLite implements com.google.crypto.tink.shaded.protobuf.MapFieldSchema {
    MapFieldSchemaLite() {
    }

    @Override // com.google.crypto.tink.shaded.protobuf.MapFieldSchema
    public final java.util.Map<?, ?> forMutableMapData(java.lang.Object obj) {
        return (com.google.crypto.tink.shaded.protobuf.MapFieldLite) obj;
    }

    @Override // com.google.crypto.tink.shaded.protobuf.MapFieldSchema
    public final com.google.crypto.tink.shaded.protobuf.MapEntryLite.Metadata<?, ?> forMapMetadata(java.lang.Object obj) {
        return ((com.google.crypto.tink.shaded.protobuf.MapEntryLite) obj).getMetadata();
    }

    @Override // com.google.crypto.tink.shaded.protobuf.MapFieldSchema
    public final java.util.Map<?, ?> forMapData(java.lang.Object obj) {
        return (com.google.crypto.tink.shaded.protobuf.MapFieldLite) obj;
    }

    @Override // com.google.crypto.tink.shaded.protobuf.MapFieldSchema
    public final boolean isImmutable(java.lang.Object obj) {
        return !((com.google.crypto.tink.shaded.protobuf.MapFieldLite) obj).isMutable();
    }

    @Override // com.google.crypto.tink.shaded.protobuf.MapFieldSchema
    public final java.lang.Object toImmutable(java.lang.Object obj) {
        ((com.google.crypto.tink.shaded.protobuf.MapFieldLite) obj).makeImmutable();
        return obj;
    }

    @Override // com.google.crypto.tink.shaded.protobuf.MapFieldSchema
    public final java.lang.Object newMapField(java.lang.Object obj) {
        return com.google.crypto.tink.shaded.protobuf.MapFieldLite.emptyMapField().mutableCopy();
    }

    @Override // com.google.crypto.tink.shaded.protobuf.MapFieldSchema
    public final java.lang.Object mergeFrom(java.lang.Object obj, java.lang.Object obj2) {
        return mergeFromLite(obj, obj2);
    }

    private static <K, V> com.google.crypto.tink.shaded.protobuf.MapFieldLite<K, V> mergeFromLite(java.lang.Object obj, java.lang.Object obj2) {
        com.google.crypto.tink.shaded.protobuf.MapFieldLite<K, V> mapFieldLite = (com.google.crypto.tink.shaded.protobuf.MapFieldLite) obj;
        com.google.crypto.tink.shaded.protobuf.MapFieldLite<K, V> mapFieldLite2 = (com.google.crypto.tink.shaded.protobuf.MapFieldLite) obj2;
        if (!mapFieldLite2.isEmpty()) {
            if (!mapFieldLite.isMutable()) {
                mapFieldLite = mapFieldLite.mutableCopy();
            }
            mapFieldLite.mergeFrom(mapFieldLite2);
        }
        return mapFieldLite;
    }

    @Override // com.google.crypto.tink.shaded.protobuf.MapFieldSchema
    public final int getSerializedSize(int i, java.lang.Object obj, java.lang.Object obj2) {
        return getSerializedSizeLite(i, obj, obj2);
    }

    private static <K, V> int getSerializedSizeLite(int i, java.lang.Object obj, java.lang.Object obj2) {
        com.google.crypto.tink.shaded.protobuf.MapFieldLite mapFieldLite = (com.google.crypto.tink.shaded.protobuf.MapFieldLite) obj;
        com.google.crypto.tink.shaded.protobuf.MapEntryLite mapEntryLite = (com.google.crypto.tink.shaded.protobuf.MapEntryLite) obj2;
        int i2 = 0;
        if (mapFieldLite.isEmpty()) {
            return 0;
        }
        for (java.util.Map.Entry<K, V> entry : mapFieldLite.entrySet()) {
            i2 += mapEntryLite.computeMessageSize(i, entry.getKey(), entry.getValue());
        }
        return i2;
    }
}
