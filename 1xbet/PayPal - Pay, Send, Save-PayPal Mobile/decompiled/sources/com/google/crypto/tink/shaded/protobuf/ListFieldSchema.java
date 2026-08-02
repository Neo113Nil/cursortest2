package com.google.crypto.tink.shaded.protobuf;

@com.google.crypto.tink.shaded.protobuf.CheckReturnValue
/* loaded from: classes4.dex */
interface ListFieldSchema {
    void makeImmutableListAt(java.lang.Object obj, long j);

    <L> void mergeListsAt(java.lang.Object obj, java.lang.Object obj2, long j);

    <L> java.util.List<L> mutableListAt(java.lang.Object obj, long j);
}
