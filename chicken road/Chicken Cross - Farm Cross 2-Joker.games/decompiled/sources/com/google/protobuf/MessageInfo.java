package com.google.protobuf;

@CheckReturnValue
/* loaded from: classes8.dex */
interface MessageInfo {
    MessageLite getDefaultInstance();

    ProtoSyntax getSyntax();

    boolean isMessageSetWireFormat();
}
