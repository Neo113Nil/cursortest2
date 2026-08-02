package androidx.content.preferences.protobuf;

@androidx.content.preferences.protobuf.CheckReturnValue
/* loaded from: classes3.dex */
final class MapFieldSchemaLite implements androidx.content.preferences.protobuf.MapFieldSchema {
    MapFieldSchemaLite() {
    }

    @Override // androidx.content.preferences.protobuf.MapFieldSchema
    public final java.util.Map<?, ?> getHighSpeedVideoSizes(java.lang.Object obj) {
        return (androidx.content.preferences.protobuf.MapFieldLite) obj;
    }

    @Override // androidx.content.preferences.protobuf.MapFieldSchema
    public final androidx.datastore.preferences.protobuf.MapEntryLite.Metadata<?, ?> getHighResolutionOutputSizeshNQ4ISI(java.lang.Object obj) {
        return ((androidx.content.preferences.protobuf.MapEntryLite) obj).getHighSpeedVideoFpsRangesFor;
    }

    @Override // androidx.content.preferences.protobuf.MapFieldSchema
    public final java.util.Map<?, ?> getHighSpeedVideoFpsRangesFor(java.lang.Object obj) {
        return (androidx.content.preferences.protobuf.MapFieldLite) obj;
    }

    @Override // androidx.content.preferences.protobuf.MapFieldSchema
    public final boolean getHighSpeedVideoFpsRanges(java.lang.Object obj) {
        return !((androidx.content.preferences.protobuf.MapFieldLite) obj).isMutable();
    }

    @Override // androidx.content.preferences.protobuf.MapFieldSchema
    public final java.lang.Object Camera2StreamConfigurationMap(java.lang.Object obj) {
        ((androidx.content.preferences.protobuf.MapFieldLite) obj).makeImmutable();
        return obj;
    }

    @Override // androidx.content.preferences.protobuf.MapFieldSchema
    public final java.lang.Object getHighSpeedVideoSizes() {
        return androidx.content.preferences.protobuf.MapFieldLite.emptyMapField().mutableCopy();
    }

    @Override // androidx.content.preferences.protobuf.MapFieldSchema
    public final int Camera2StreamConfigurationMap(int i, java.lang.Object obj, java.lang.Object obj2) {
        androidx.content.preferences.protobuf.MapFieldLite mapFieldLite = (androidx.content.preferences.protobuf.MapFieldLite) obj;
        androidx.content.preferences.protobuf.MapEntryLite mapEntryLite = (androidx.content.preferences.protobuf.MapEntryLite) obj2;
        int i2 = 0;
        if (mapFieldLite.isEmpty()) {
            return 0;
        }
        java.util.Iterator it = mapFieldLite.entrySet().iterator();
        while (it.hasNext()) {
            java.util.Map.Entry entry = (java.util.Map.Entry) it.next();
            i2 += mapEntryLite.computeMessageSize(i, entry.getKey(), entry.getValue());
        }
        return i2;
    }

    @Override // androidx.content.preferences.protobuf.MapFieldSchema
    public final java.lang.Object getHighSpeedVideoSizes(java.lang.Object obj, java.lang.Object obj2) {
        androidx.content.preferences.protobuf.MapFieldLite mapFieldLite = (androidx.content.preferences.protobuf.MapFieldLite) obj;
        androidx.content.preferences.protobuf.MapFieldLite mapFieldLite2 = (androidx.content.preferences.protobuf.MapFieldLite) obj2;
        if (!mapFieldLite2.isEmpty()) {
            if (!mapFieldLite.isMutable()) {
                mapFieldLite = mapFieldLite.mutableCopy();
            }
            mapFieldLite.mergeFrom(mapFieldLite2);
        }
        return mapFieldLite;
    }
}
