package com.google.protobuf;

@com.google.protobuf.CheckReturnValue
/* loaded from: classes4.dex */
interface MessageInfoFactory {
    boolean isSupported(java.lang.Class<?> clazz);

    com.google.protobuf.MessageInfo messageInfoFor(java.lang.Class<?> clazz);
}
