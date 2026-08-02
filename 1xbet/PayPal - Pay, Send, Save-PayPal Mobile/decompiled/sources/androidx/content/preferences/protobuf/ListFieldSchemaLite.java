package androidx.content.preferences.protobuf;

/* loaded from: classes3.dex */
final class ListFieldSchemaLite implements androidx.content.preferences.protobuf.ListFieldSchema {
    ListFieldSchemaLite() {
    }

    @Override // androidx.content.preferences.protobuf.ListFieldSchema
    public final void getHighSpeedVideoFpsRangesFor(java.lang.Object obj, long j) {
        ((androidx.datastore.preferences.protobuf.Internal.ProtobufList) androidx.content.preferences.protobuf.UnsafeUtil.getOutputFormats(obj, j)).makeImmutable();
    }

    @Override // androidx.content.preferences.protobuf.ListFieldSchema
    public final <E> void getHighSpeedVideoSizes(java.lang.Object obj, java.lang.Object obj2, long j) {
        androidx.datastore.preferences.protobuf.Internal.ProtobufList protobufList = (androidx.datastore.preferences.protobuf.Internal.ProtobufList) androidx.content.preferences.protobuf.UnsafeUtil.getOutputFormats(obj, j);
        androidx.datastore.preferences.protobuf.Internal.ProtobufList protobufList2 = (androidx.datastore.preferences.protobuf.Internal.ProtobufList) androidx.content.preferences.protobuf.UnsafeUtil.getOutputFormats(obj2, j);
        int size = protobufList.size();
        int size2 = protobufList2.size();
        if (size > 0 && size2 > 0) {
            if (!protobufList.isModifiable()) {
                protobufList = protobufList.mutableCopyWithCapacity2(size2 + size);
            }
            protobufList.addAll(protobufList2);
        }
        if (size > 0) {
            protobufList2 = protobufList;
        }
        androidx.content.preferences.protobuf.UnsafeUtil.getHighSpeedVideoSizes(obj, j, protobufList2);
    }

    @Override // androidx.content.preferences.protobuf.ListFieldSchema
    public final <L> java.util.List<L> getHighResolutionOutputSizeshNQ4ISI(java.lang.Object obj, long j) {
        androidx.datastore.preferences.protobuf.Internal.ProtobufList protobufList = (androidx.datastore.preferences.protobuf.Internal.ProtobufList) androidx.content.preferences.protobuf.UnsafeUtil.getOutputFormats(obj, j);
        if (protobufList.isModifiable()) {
            return protobufList;
        }
        int size = protobufList.size();
        androidx.datastore.preferences.protobuf.Internal.ProtobufList mutableCopyWithCapacity2 = protobufList.mutableCopyWithCapacity2(size == 0 ? 10 : size * 2);
        androidx.content.preferences.protobuf.UnsafeUtil.getHighSpeedVideoSizes(obj, j, mutableCopyWithCapacity2);
        return mutableCopyWithCapacity2;
    }
}
