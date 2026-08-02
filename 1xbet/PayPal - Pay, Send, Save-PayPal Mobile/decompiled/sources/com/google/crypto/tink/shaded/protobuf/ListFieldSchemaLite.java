package com.google.crypto.tink.shaded.protobuf;

/* loaded from: classes4.dex */
final class ListFieldSchemaLite implements com.google.crypto.tink.shaded.protobuf.ListFieldSchema {
    ListFieldSchemaLite() {
    }

    @Override // com.google.crypto.tink.shaded.protobuf.ListFieldSchema
    public final <L> java.util.List<L> mutableListAt(java.lang.Object obj, long j) {
        com.google.crypto.tink.shaded.protobuf.Internal.ProtobufList protobufList = getProtobufList(obj, j);
        if (protobufList.isModifiable()) {
            return protobufList;
        }
        int size = protobufList.size();
        com.google.crypto.tink.shaded.protobuf.Internal.ProtobufList mutableCopyWithCapacity2 = protobufList.mutableCopyWithCapacity2(size == 0 ? 10 : size * 2);
        com.google.crypto.tink.shaded.protobuf.UnsafeUtil.putObject(obj, j, mutableCopyWithCapacity2);
        return mutableCopyWithCapacity2;
    }

    @Override // com.google.crypto.tink.shaded.protobuf.ListFieldSchema
    public final void makeImmutableListAt(java.lang.Object obj, long j) {
        getProtobufList(obj, j).makeImmutable();
    }

    @Override // com.google.crypto.tink.shaded.protobuf.ListFieldSchema
    public final <E> void mergeListsAt(java.lang.Object obj, java.lang.Object obj2, long j) {
        com.google.crypto.tink.shaded.protobuf.Internal.ProtobufList protobufList = getProtobufList(obj, j);
        com.google.crypto.tink.shaded.protobuf.Internal.ProtobufList protobufList2 = getProtobufList(obj2, j);
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
        com.google.crypto.tink.shaded.protobuf.UnsafeUtil.putObject(obj, j, protobufList2);
    }

    static <E> com.google.crypto.tink.shaded.protobuf.Internal.ProtobufList<E> getProtobufList(java.lang.Object obj, long j) {
        return (com.google.crypto.tink.shaded.protobuf.Internal.ProtobufList) com.google.crypto.tink.shaded.protobuf.UnsafeUtil.getObject(obj, j);
    }
}
