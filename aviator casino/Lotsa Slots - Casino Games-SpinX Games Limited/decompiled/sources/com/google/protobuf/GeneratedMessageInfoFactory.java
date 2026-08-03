package com.google.protobuf;

/* loaded from: classes4.dex */
class GeneratedMessageInfoFactory implements com.google.protobuf.MessageInfoFactory {
    private static final com.google.protobuf.GeneratedMessageInfoFactory instance = new com.google.protobuf.GeneratedMessageInfoFactory();

    private GeneratedMessageInfoFactory() {
    }

    public static com.google.protobuf.GeneratedMessageInfoFactory getInstance() {
        return instance;
    }

    @Override // com.google.protobuf.MessageInfoFactory
    public boolean isSupported(java.lang.Class<?> messageType) {
        return com.google.protobuf.GeneratedMessageLite.class.isAssignableFrom(messageType);
    }

    @Override // com.google.protobuf.MessageInfoFactory
    public com.google.protobuf.MessageInfo messageInfoFor(java.lang.Class<?> messageType) {
        if (!com.google.protobuf.GeneratedMessageLite.class.isAssignableFrom(messageType)) {
            throw new java.lang.IllegalArgumentException("Unsupported message type: " + messageType.getName());
        }
        try {
            return (com.google.protobuf.MessageInfo) com.google.protobuf.GeneratedMessageLite.getDefaultInstance(messageType.asSubclass(com.google.protobuf.GeneratedMessageLite.class)).buildMessageInfo();
        } catch (java.lang.Exception e) {
            throw new java.lang.RuntimeException("Unable to get message info for " + messageType.getName(), e);
        }
    }
}
