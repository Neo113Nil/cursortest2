package com.google.protobuf;

@com.google.protobuf.CheckReturnValue
/* loaded from: classes4.dex */
final class ManifestSchemaFactory implements com.google.protobuf.SchemaFactory {
    private static final com.google.protobuf.MessageInfoFactory EMPTY_FACTORY = new com.google.protobuf.MessageInfoFactory() { // from class: com.google.protobuf.ManifestSchemaFactory.1
        @Override // com.google.protobuf.MessageInfoFactory
        public boolean isSupported(java.lang.Class<?> clazz) {
            return false;
        }

        @Override // com.google.protobuf.MessageInfoFactory
        public com.google.protobuf.MessageInfo messageInfoFor(java.lang.Class<?> clazz) {
            throw new java.lang.IllegalStateException("This should never be called.");
        }
    };
    private final com.google.protobuf.MessageInfoFactory messageInfoFactory;

    public ManifestSchemaFactory() {
        this(getDefaultMessageInfoFactory());
    }

    private ManifestSchemaFactory(com.google.protobuf.MessageInfoFactory messageInfoFactory) {
        this.messageInfoFactory = (com.google.protobuf.MessageInfoFactory) com.google.protobuf.Internal.checkNotNull(messageInfoFactory, "messageInfoFactory");
    }

    @Override // com.google.protobuf.SchemaFactory
    public <T> com.google.protobuf.Schema<T> createSchema(java.lang.Class<T> messageType) {
        com.google.protobuf.SchemaUtil.requireGeneratedMessage(messageType);
        com.google.protobuf.MessageInfo messageInfoFor = this.messageInfoFactory.messageInfoFor(messageType);
        if (messageInfoFor.isMessageSetWireFormat()) {
            if (com.google.protobuf.GeneratedMessageLite.class.isAssignableFrom(messageType)) {
                return com.google.protobuf.MessageSetSchema.newSchema(com.google.protobuf.SchemaUtil.unknownFieldSetLiteSchema(), com.google.protobuf.ExtensionSchemas.lite(), messageInfoFor.getDefaultInstance());
            }
            return com.google.protobuf.MessageSetSchema.newSchema(com.google.protobuf.SchemaUtil.unknownFieldSetFullSchema(), com.google.protobuf.ExtensionSchemas.full(), messageInfoFor.getDefaultInstance());
        }
        return newSchema(messageType, messageInfoFor);
    }

    private static <T> com.google.protobuf.Schema<T> newSchema(java.lang.Class<T> messageType, com.google.protobuf.MessageInfo messageInfo) {
        if (com.google.protobuf.GeneratedMessageLite.class.isAssignableFrom(messageType)) {
            if (allowExtensions(messageInfo)) {
                return com.google.protobuf.MessageSchema.newSchema(messageType, messageInfo, com.google.protobuf.NewInstanceSchemas.lite(), com.google.protobuf.ListFieldSchema.lite(), com.google.protobuf.SchemaUtil.unknownFieldSetLiteSchema(), com.google.protobuf.ExtensionSchemas.lite(), com.google.protobuf.MapFieldSchemas.lite());
            }
            return com.google.protobuf.MessageSchema.newSchema(messageType, messageInfo, com.google.protobuf.NewInstanceSchemas.lite(), com.google.protobuf.ListFieldSchema.lite(), com.google.protobuf.SchemaUtil.unknownFieldSetLiteSchema(), null, com.google.protobuf.MapFieldSchemas.lite());
        }
        if (allowExtensions(messageInfo)) {
            return com.google.protobuf.MessageSchema.newSchema(messageType, messageInfo, com.google.protobuf.NewInstanceSchemas.full(), com.google.protobuf.ListFieldSchema.full(), com.google.protobuf.SchemaUtil.unknownFieldSetFullSchema(), com.google.protobuf.ExtensionSchemas.full(), com.google.protobuf.MapFieldSchemas.full());
        }
        return com.google.protobuf.MessageSchema.newSchema(messageType, messageInfo, com.google.protobuf.NewInstanceSchemas.full(), com.google.protobuf.ListFieldSchema.full(), com.google.protobuf.SchemaUtil.unknownFieldSetFullSchema(), null, com.google.protobuf.MapFieldSchemas.full());
    }

    /* renamed from: com.google.protobuf.ManifestSchemaFactory$2, reason: invalid class name */
    static /* synthetic */ class AnonymousClass2 {
        static final /* synthetic */ int[] $SwitchMap$com$google$protobuf$ProtoSyntax;

        static {
            int[] iArr = new int[com.google.protobuf.ProtoSyntax.values().length];
            $SwitchMap$com$google$protobuf$ProtoSyntax = iArr;
            try {
                iArr[com.google.protobuf.ProtoSyntax.PROTO3.ordinal()] = 1;
            } catch (java.lang.NoSuchFieldError unused) {
            }
        }
    }

    private static boolean allowExtensions(com.google.protobuf.MessageInfo messageInfo) {
        return com.google.protobuf.ManifestSchemaFactory.AnonymousClass2.$SwitchMap$com$google$protobuf$ProtoSyntax[messageInfo.getSyntax().ordinal()] != 1;
    }

    private static com.google.protobuf.MessageInfoFactory getDefaultMessageInfoFactory() {
        return new com.google.protobuf.ManifestSchemaFactory.CompositeMessageInfoFactory(com.google.protobuf.GeneratedMessageInfoFactory.getInstance(), getDescriptorMessageInfoFactory());
    }

    private static class CompositeMessageInfoFactory implements com.google.protobuf.MessageInfoFactory {
        private com.google.protobuf.MessageInfoFactory[] factories;

        CompositeMessageInfoFactory(com.google.protobuf.MessageInfoFactory... factories) {
            this.factories = factories;
        }

        @Override // com.google.protobuf.MessageInfoFactory
        public boolean isSupported(java.lang.Class<?> clazz) {
            for (com.google.protobuf.MessageInfoFactory messageInfoFactory : this.factories) {
                if (messageInfoFactory.isSupported(clazz)) {
                    return true;
                }
            }
            return false;
        }

        @Override // com.google.protobuf.MessageInfoFactory
        public com.google.protobuf.MessageInfo messageInfoFor(java.lang.Class<?> clazz) {
            for (com.google.protobuf.MessageInfoFactory messageInfoFactory : this.factories) {
                if (messageInfoFactory.isSupported(clazz)) {
                    return messageInfoFactory.messageInfoFor(clazz);
                }
            }
            throw new java.lang.UnsupportedOperationException("No factory is available for message type: " + clazz.getName());
        }
    }

    private static com.google.protobuf.MessageInfoFactory getDescriptorMessageInfoFactory() {
        try {
            return (com.google.protobuf.MessageInfoFactory) java.lang.Class.forName("com.google.protobuf.DescriptorMessageInfoFactory").getDeclaredMethod(com.unity3d.services.core.fid.Constants.GET_INSTANCE, new java.lang.Class[0]).invoke(null, new java.lang.Object[0]);
        } catch (java.lang.Exception unused) {
            return EMPTY_FACTORY;
        }
    }
}
