package com.google.protobuf;

@com.google.protobuf.CheckReturnValue
/* loaded from: classes9.dex */
interface MessageInfoFactory {
    boolean isSupported(java.lang.Class<?> cls);

    com.google.protobuf.MessageInfo messageInfoFor(java.lang.Class<?> cls);
}
