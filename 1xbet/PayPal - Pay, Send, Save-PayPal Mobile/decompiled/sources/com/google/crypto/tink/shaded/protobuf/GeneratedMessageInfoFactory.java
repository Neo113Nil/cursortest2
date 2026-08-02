package com.google.crypto.tink.shaded.protobuf;

/* loaded from: classes4.dex */
class GeneratedMessageInfoFactory implements com.google.crypto.tink.shaded.protobuf.MessageInfoFactory {
    private static final com.google.crypto.tink.shaded.protobuf.GeneratedMessageInfoFactory instance = new com.google.crypto.tink.shaded.protobuf.GeneratedMessageInfoFactory();

    private GeneratedMessageInfoFactory() {
    }

    public static com.google.crypto.tink.shaded.protobuf.GeneratedMessageInfoFactory getInstance() {
        return instance;
    }

    @Override // com.google.crypto.tink.shaded.protobuf.MessageInfoFactory
    public boolean isSupported(java.lang.Class<?> cls) {
        return com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite.class.isAssignableFrom(cls);
    }

    @Override // com.google.crypto.tink.shaded.protobuf.MessageInfoFactory
    public com.google.crypto.tink.shaded.protobuf.MessageInfo messageInfoFor(java.lang.Class<?> cls) {
        if (!com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite.class.isAssignableFrom(cls)) {
            java.lang.StringBuilder sb = new java.lang.StringBuilder("Unsupported message type: ");
            sb.append(cls.getName());
            throw new java.lang.IllegalArgumentException(sb.toString());
        }
        try {
            return (com.google.crypto.tink.shaded.protobuf.MessageInfo) com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite.getDefaultInstance(cls.asSubclass(com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite.class)).buildMessageInfo();
        } catch (java.lang.Exception e) {
            java.lang.StringBuilder sb2 = new java.lang.StringBuilder("Unable to get message info for ");
            sb2.append(cls.getName());
            throw new java.lang.RuntimeException(sb2.toString(), e);
        }
    }
}
