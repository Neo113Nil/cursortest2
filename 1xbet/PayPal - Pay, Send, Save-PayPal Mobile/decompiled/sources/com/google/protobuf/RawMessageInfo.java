package com.google.protobuf;

@com.google.protobuf.CheckReturnValue
/* loaded from: classes9.dex */
final class RawMessageInfo implements com.google.protobuf.MessageInfo {
    private static final int IS_EDITION_BIT = 4;
    private static final int IS_PROTO2_BIT = 1;
    private final com.google.protobuf.MessageLite defaultInstance;
    private final int flags;
    private final java.lang.String info;
    private final java.lang.Object[] objects;

    RawMessageInfo(com.google.protobuf.MessageLite messageLite, java.lang.String str, java.lang.Object[] objArr) {
        this.defaultInstance = messageLite;
        this.info = str;
        this.objects = objArr;
        char charAt = str.charAt(0);
        if (charAt < 55296) {
            this.flags = charAt;
            return;
        }
        int i = charAt & 8191;
        int i2 = 1;
        int i3 = 13;
        while (true) {
            char charAt2 = str.charAt(i2);
            if (charAt2 < 55296) {
                this.flags = i | (charAt2 << i3);
                return;
            } else {
                i |= (charAt2 & 8191) << i3;
                i3 += 13;
                i2++;
            }
        }
    }

    final java.lang.String getStringInfo() {
        return this.info;
    }

    final java.lang.Object[] getObjects() {
        return this.objects;
    }

    @Override // com.google.protobuf.MessageInfo
    public final com.google.protobuf.MessageLite getDefaultInstance() {
        return this.defaultInstance;
    }

    @Override // com.google.protobuf.MessageInfo
    public final com.google.protobuf.ProtoSyntax getSyntax() {
        int i = this.flags;
        if ((i & 1) != 0) {
            return com.google.protobuf.ProtoSyntax.PROTO2;
        }
        if ((i & 4) == 4) {
            return com.google.protobuf.ProtoSyntax.EDITIONS;
        }
        return com.google.protobuf.ProtoSyntax.PROTO3;
    }

    @Override // com.google.protobuf.MessageInfo
    public final boolean isMessageSetWireFormat() {
        return (this.flags & 2) == 2;
    }
}
