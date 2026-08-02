package com.google.crypto.tink.shaded.protobuf;

@com.google.crypto.tink.shaded.protobuf.CheckReturnValue
/* loaded from: classes4.dex */
final class ManifestSchemaFactory implements com.google.crypto.tink.shaded.protobuf.SchemaFactory {
    private static final com.google.crypto.tink.shaded.protobuf.MessageInfoFactory EMPTY_FACTORY = new com.google.crypto.tink.shaded.protobuf.MessageInfoFactory() { // from class: com.google.crypto.tink.shaded.protobuf.ManifestSchemaFactory.1
        @Override // com.google.crypto.tink.shaded.protobuf.MessageInfoFactory
        public boolean isSupported(java.lang.Class<?> cls) {
            return false;
        }

        @Override // com.google.crypto.tink.shaded.protobuf.MessageInfoFactory
        public com.google.crypto.tink.shaded.protobuf.MessageInfo messageInfoFor(java.lang.Class<?> cls) {
            throw new java.lang.IllegalStateException("This should never be called.");
        }
    };
    private final com.google.crypto.tink.shaded.protobuf.MessageInfoFactory messageInfoFactory;

    public ManifestSchemaFactory() {
        this(getDefaultMessageInfoFactory());
    }

    private ManifestSchemaFactory(com.google.crypto.tink.shaded.protobuf.MessageInfoFactory messageInfoFactory) {
        this.messageInfoFactory = (com.google.crypto.tink.shaded.protobuf.MessageInfoFactory) com.google.crypto.tink.shaded.protobuf.Internal.checkNotNull(messageInfoFactory, "messageInfoFactory");
    }

    @Override // com.google.crypto.tink.shaded.protobuf.SchemaFactory
    public final <T> com.google.crypto.tink.shaded.protobuf.Schema<T> createSchema(java.lang.Class<T> cls) {
        com.google.crypto.tink.shaded.protobuf.SchemaUtil.requireGeneratedMessage(cls);
        com.google.crypto.tink.shaded.protobuf.MessageInfo messageInfoFor = this.messageInfoFactory.messageInfoFor(cls);
        if (messageInfoFor.isMessageSetWireFormat()) {
            if (useLiteRuntime(cls)) {
                return com.google.crypto.tink.shaded.protobuf.MessageSetSchema.newSchema(com.google.crypto.tink.shaded.protobuf.SchemaUtil.unknownFieldSetLiteSchema(), com.google.crypto.tink.shaded.protobuf.ExtensionSchemas.lite(), messageInfoFor.getDefaultInstance());
            }
            return com.google.crypto.tink.shaded.protobuf.MessageSetSchema.newSchema(com.google.crypto.tink.shaded.protobuf.SchemaUtil.unknownFieldSetFullSchema(), com.google.crypto.tink.shaded.protobuf.ExtensionSchemas.full(), messageInfoFor.getDefaultInstance());
        }
        return newSchema(cls, messageInfoFor);
    }

    private static <T> com.google.crypto.tink.shaded.protobuf.Schema<T> newSchema(java.lang.Class<T> cls, com.google.crypto.tink.shaded.protobuf.MessageInfo messageInfo) {
        if (useLiteRuntime(cls)) {
            return com.google.crypto.tink.shaded.protobuf.MessageSchema.newSchema(cls, messageInfo, com.google.crypto.tink.shaded.protobuf.NewInstanceSchemas.lite(), com.google.crypto.tink.shaded.protobuf.ListFieldSchemas.lite(), com.google.crypto.tink.shaded.protobuf.SchemaUtil.unknownFieldSetLiteSchema(), allowExtensions(messageInfo) ? com.google.crypto.tink.shaded.protobuf.ExtensionSchemas.lite() : null, com.google.crypto.tink.shaded.protobuf.MapFieldSchemas.lite());
        }
        return com.google.crypto.tink.shaded.protobuf.MessageSchema.newSchema(cls, messageInfo, com.google.crypto.tink.shaded.protobuf.NewInstanceSchemas.full(), com.google.crypto.tink.shaded.protobuf.ListFieldSchemas.full(), com.google.crypto.tink.shaded.protobuf.SchemaUtil.unknownFieldSetFullSchema(), allowExtensions(messageInfo) ? com.google.crypto.tink.shaded.protobuf.ExtensionSchemas.full() : null, com.google.crypto.tink.shaded.protobuf.MapFieldSchemas.full());
    }

    /* renamed from: com.google.crypto.tink.shaded.protobuf.ManifestSchemaFactory$2, reason: invalid class name */
    static /* synthetic */ class AnonymousClass2 {
        static final /* synthetic */ int[] $SwitchMap$com$google$protobuf$ProtoSyntax;

        static {
            int[] iArr = new int[com.google.crypto.tink.shaded.protobuf.ProtoSyntax.values().length];
            $SwitchMap$com$google$protobuf$ProtoSyntax = iArr;
            try {
                iArr[com.google.crypto.tink.shaded.protobuf.ProtoSyntax.PROTO3.ordinal()] = 1;
            } catch (java.lang.NoSuchFieldError unused) {
            }
        }
    }

    private static boolean allowExtensions(com.google.crypto.tink.shaded.protobuf.MessageInfo messageInfo) {
        return com.google.crypto.tink.shaded.protobuf.ManifestSchemaFactory.AnonymousClass2.$SwitchMap$com$google$protobuf$ProtoSyntax[messageInfo.getSyntax().ordinal()] != 1;
    }

    private static com.google.crypto.tink.shaded.protobuf.MessageInfoFactory getDefaultMessageInfoFactory() {
        return new com.google.crypto.tink.shaded.protobuf.ManifestSchemaFactory.CompositeMessageInfoFactory(com.google.crypto.tink.shaded.protobuf.GeneratedMessageInfoFactory.getInstance(), getDescriptorMessageInfoFactory());
    }

    static class CompositeMessageInfoFactory implements com.google.crypto.tink.shaded.protobuf.MessageInfoFactory {
        private com.google.crypto.tink.shaded.protobuf.MessageInfoFactory[] factories;

        CompositeMessageInfoFactory(com.google.crypto.tink.shaded.protobuf.MessageInfoFactory... messageInfoFactoryArr) {
            this.factories = messageInfoFactoryArr;
        }

        @Override // com.google.crypto.tink.shaded.protobuf.MessageInfoFactory
        public boolean isSupported(java.lang.Class<?> cls) {
            for (com.google.crypto.tink.shaded.protobuf.MessageInfoFactory messageInfoFactory : this.factories) {
                if (messageInfoFactory.isSupported(cls)) {
                    return true;
                }
            }
            return false;
        }

        @Override // com.google.crypto.tink.shaded.protobuf.MessageInfoFactory
        public com.google.crypto.tink.shaded.protobuf.MessageInfo messageInfoFor(java.lang.Class<?> cls) {
            for (com.google.crypto.tink.shaded.protobuf.MessageInfoFactory messageInfoFactory : this.factories) {
                if (messageInfoFactory.isSupported(cls)) {
                    return messageInfoFactory.messageInfoFor(cls);
                }
            }
            java.lang.StringBuilder sb = new java.lang.StringBuilder("No factory is available for message type: ");
            sb.append(cls.getName());
            throw new java.lang.UnsupportedOperationException(sb.toString());
        }
    }

    private static com.google.crypto.tink.shaded.protobuf.MessageInfoFactory getDescriptorMessageInfoFactory() {
        if (com.google.crypto.tink.shaded.protobuf.Protobuf.assumeLiteRuntime) {
            return EMPTY_FACTORY;
        }
        try {
            return (com.google.crypto.tink.shaded.protobuf.MessageInfoFactory) java.lang.Class.forName("com.google.crypto.tink.shaded.protobuf.DescriptorMessageInfoFactory").getDeclaredMethod("getInstance", new java.lang.Class[0]).invoke(null, new java.lang.Object[0]);
        } catch (java.lang.Exception unused) {
            return EMPTY_FACTORY;
        }
    }

    private static boolean useLiteRuntime(java.lang.Class<?> cls) {
        return com.google.crypto.tink.shaded.protobuf.Protobuf.assumeLiteRuntime || com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite.class.isAssignableFrom(cls);
    }
}
