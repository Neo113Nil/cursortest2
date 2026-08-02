package com.google.protobuf;

/* loaded from: classes9.dex */
class GeneratedMessageInfoFactory implements com.google.protobuf.MessageInfoFactory {
    private static final com.google.protobuf.GeneratedMessageInfoFactory instance = new com.google.protobuf.GeneratedMessageInfoFactory();

    private GeneratedMessageInfoFactory() {
    }

    public static com.google.protobuf.GeneratedMessageInfoFactory getInstance() {
        return instance;
    }

    @Override // com.google.protobuf.MessageInfoFactory
    public boolean isSupported(java.lang.Class<?> cls) {
        return com.google.protobuf.GeneratedMessageLite.class.isAssignableFrom(cls);
    }

    @Override // com.google.protobuf.MessageInfoFactory
    public com.google.protobuf.MessageInfo messageInfoFor(java.lang.Class<?> cls) {
        if (!com.google.protobuf.GeneratedMessageLite.class.isAssignableFrom(cls)) {
            java.lang.StringBuilder sb = new java.lang.StringBuilder("Unsupported message type: ");
            sb.append(cls.getName());
            throw new java.lang.IllegalArgumentException(sb.toString());
        }
        try {
            return (com.google.protobuf.MessageInfo) com.google.protobuf.GeneratedMessageLite.getDefaultInstance(cls.asSubclass(com.google.protobuf.GeneratedMessageLite.class)).buildMessageInfo();
        } catch (java.lang.Exception e) {
            java.lang.StringBuilder sb2 = new java.lang.StringBuilder("Unable to get message info for ");
            sb2.append(cls.getName());
            throw new java.lang.RuntimeException(sb2.toString(), e);
        }
    }
}
