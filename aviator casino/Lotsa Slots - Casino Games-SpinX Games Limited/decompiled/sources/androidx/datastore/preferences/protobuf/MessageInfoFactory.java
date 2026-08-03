package androidx.datastore.preferences.protobuf;

@androidx.datastore.preferences.protobuf.CheckReturnValue
/* loaded from: classes2.dex */
interface MessageInfoFactory {
    boolean isSupported(java.lang.Class<?> clazz);

    androidx.datastore.preferences.protobuf.MessageInfo messageInfoFor(java.lang.Class<?> clazz);
}
