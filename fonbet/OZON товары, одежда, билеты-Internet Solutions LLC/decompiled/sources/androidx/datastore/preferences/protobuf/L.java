package androidx.datastore.preferences.protobuf;

import androidx.datastore.preferences.protobuf.J;

/* loaded from: classes.dex */
interface L {
    K a();

    K forMapData(Object obj);

    J.a<?, ?> forMapMetadata(Object obj);

    K forMutableMapData(Object obj);

    int getSerializedSize(int i11, Object obj, Object obj2);

    boolean isImmutable(Object obj);

    K mergeFrom(Object obj, Object obj2);

    Object toImmutable(Object obj);
}
