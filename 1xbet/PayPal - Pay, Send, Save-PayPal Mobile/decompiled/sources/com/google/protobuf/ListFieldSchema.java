package com.google.protobuf;

@com.google.protobuf.CheckReturnValue
/* loaded from: classes9.dex */
abstract class ListFieldSchema {
    private static final com.google.protobuf.ListFieldSchema FULL_INSTANCE;
    private static final com.google.protobuf.ListFieldSchema LITE_INSTANCE;

    abstract void makeImmutableListAt(java.lang.Object obj, long j);

    abstract <L> void mergeListsAt(java.lang.Object obj, java.lang.Object obj2, long j);

    abstract <L> java.util.List<L> mutableListAt(java.lang.Object obj, long j);

    private ListFieldSchema() {
    }

    static {
        FULL_INSTANCE = new com.google.protobuf.ListFieldSchema.ListFieldSchemaFull();
        LITE_INSTANCE = new com.google.protobuf.ListFieldSchema.ListFieldSchemaLite();
    }

    static com.google.protobuf.ListFieldSchema full() {
        return FULL_INSTANCE;
    }

    static com.google.protobuf.ListFieldSchema lite() {
        return LITE_INSTANCE;
    }

    static final class ListFieldSchemaFull extends com.google.protobuf.ListFieldSchema {
        private static final java.lang.Class<?> UNMODIFIABLE_LIST_CLASS = java.util.Collections.unmodifiableList(java.util.Collections.emptyList()).getClass();

        private ListFieldSchemaFull() {
            super();
        }

        @Override // com.google.protobuf.ListFieldSchema
        final <L> java.util.List<L> mutableListAt(java.lang.Object obj, long j) {
            return mutableListAt(obj, j, 10);
        }

        @Override // com.google.protobuf.ListFieldSchema
        final void makeImmutableListAt(java.lang.Object obj, long j) {
            java.lang.Object unmodifiableList;
            java.util.List list = (java.util.List) com.google.protobuf.UnsafeUtil.getObject(obj, j);
            if (list instanceof com.google.protobuf.LazyStringList) {
                unmodifiableList = ((com.google.protobuf.LazyStringList) list).getUnmodifiableView();
            } else {
                if (UNMODIFIABLE_LIST_CLASS.isAssignableFrom(list.getClass())) {
                    return;
                }
                if ((list instanceof com.google.protobuf.PrimitiveNonBoxingCollection) && (list instanceof com.google.protobuf.Internal.ProtobufList)) {
                    com.google.protobuf.Internal.ProtobufList protobufList = (com.google.protobuf.Internal.ProtobufList) list;
                    if (protobufList.isModifiable()) {
                        protobufList.makeImmutable();
                        return;
                    }
                    return;
                }
                unmodifiableList = java.util.Collections.unmodifiableList(list);
            }
            com.google.protobuf.UnsafeUtil.putObject(obj, j, unmodifiableList);
        }

        private static <L> java.util.List<L> mutableListAt(java.lang.Object obj, long j, int i) {
            java.util.List<L> arrayList;
            java.util.List<L> list = getList(obj, j);
            if (list.isEmpty()) {
                if (list instanceof com.google.protobuf.LazyStringList) {
                    arrayList = new com.google.protobuf.LazyStringArrayList(i);
                } else if ((list instanceof com.google.protobuf.PrimitiveNonBoxingCollection) && (list instanceof com.google.protobuf.Internal.ProtobufList)) {
                    arrayList = ((com.google.protobuf.Internal.ProtobufList) list).mutableCopyWithCapacity2(i);
                } else {
                    arrayList = new java.util.ArrayList<>(i);
                }
                com.google.protobuf.UnsafeUtil.putObject(obj, j, arrayList);
                return arrayList;
            }
            if (UNMODIFIABLE_LIST_CLASS.isAssignableFrom(list.getClass())) {
                java.util.ArrayList arrayList2 = new java.util.ArrayList(list.size() + i);
                arrayList2.addAll(list);
                com.google.protobuf.UnsafeUtil.putObject(obj, j, arrayList2);
                return arrayList2;
            }
            if (list instanceof com.google.protobuf.UnmodifiableLazyStringList) {
                com.google.protobuf.LazyStringArrayList lazyStringArrayList = new com.google.protobuf.LazyStringArrayList(list.size() + i);
                lazyStringArrayList.addAll((com.google.protobuf.UnmodifiableLazyStringList) list);
                com.google.protobuf.UnsafeUtil.putObject(obj, j, lazyStringArrayList);
                return lazyStringArrayList;
            }
            if ((list instanceof com.google.protobuf.PrimitiveNonBoxingCollection) && (list instanceof com.google.protobuf.Internal.ProtobufList)) {
                com.google.protobuf.Internal.ProtobufList protobufList = (com.google.protobuf.Internal.ProtobufList) list;
                if (!protobufList.isModifiable()) {
                    com.google.protobuf.Internal.ProtobufList mutableCopyWithCapacity2 = protobufList.mutableCopyWithCapacity2(list.size() + i);
                    com.google.protobuf.UnsafeUtil.putObject(obj, j, mutableCopyWithCapacity2);
                    return mutableCopyWithCapacity2;
                }
            }
            return list;
        }

        @Override // com.google.protobuf.ListFieldSchema
        final <E> void mergeListsAt(java.lang.Object obj, java.lang.Object obj2, long j) {
            java.util.List list = getList(obj2, j);
            java.util.List mutableListAt = mutableListAt(obj, j, list.size());
            int size = mutableListAt.size();
            int size2 = list.size();
            if (size > 0 && size2 > 0) {
                mutableListAt.addAll(list);
            }
            if (size > 0) {
                list = mutableListAt;
            }
            com.google.protobuf.UnsafeUtil.putObject(obj, j, list);
        }

        static <E> java.util.List<E> getList(java.lang.Object obj, long j) {
            return (java.util.List) com.google.protobuf.UnsafeUtil.getObject(obj, j);
        }
    }

    static final class ListFieldSchemaLite extends com.google.protobuf.ListFieldSchema {
        private ListFieldSchemaLite() {
            super();
        }

        @Override // com.google.protobuf.ListFieldSchema
        final <L> java.util.List<L> mutableListAt(java.lang.Object obj, long j) {
            com.google.protobuf.Internal.ProtobufList protobufList = getProtobufList(obj, j);
            if (protobufList.isModifiable()) {
                return protobufList;
            }
            int size = protobufList.size();
            com.google.protobuf.Internal.ProtobufList mutableCopyWithCapacity2 = protobufList.mutableCopyWithCapacity2(size == 0 ? 10 : size * 2);
            com.google.protobuf.UnsafeUtil.putObject(obj, j, mutableCopyWithCapacity2);
            return mutableCopyWithCapacity2;
        }

        @Override // com.google.protobuf.ListFieldSchema
        final void makeImmutableListAt(java.lang.Object obj, long j) {
            getProtobufList(obj, j).makeImmutable();
        }

        @Override // com.google.protobuf.ListFieldSchema
        final <E> void mergeListsAt(java.lang.Object obj, java.lang.Object obj2, long j) {
            com.google.protobuf.Internal.ProtobufList protobufList = getProtobufList(obj, j);
            com.google.protobuf.Internal.ProtobufList protobufList2 = getProtobufList(obj2, j);
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
            com.google.protobuf.UnsafeUtil.putObject(obj, j, protobufList2);
        }

        static <E> com.google.protobuf.Internal.ProtobufList<E> getProtobufList(java.lang.Object obj, long j) {
            return (com.google.protobuf.Internal.ProtobufList) com.google.protobuf.UnsafeUtil.getObject(obj, j);
        }
    }
}
