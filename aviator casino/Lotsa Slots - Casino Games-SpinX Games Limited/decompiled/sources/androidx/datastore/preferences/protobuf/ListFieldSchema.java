package androidx.datastore.preferences.protobuf;

@androidx.datastore.preferences.protobuf.CheckReturnValue
/* loaded from: classes2.dex */
interface ListFieldSchema {
    void makeImmutableListAt(java.lang.Object msg, long offset);

    <L> void mergeListsAt(java.lang.Object msg, java.lang.Object otherMsg, long offset);

    <L> java.util.List<L> mutableListAt(java.lang.Object msg, long offset);
}
