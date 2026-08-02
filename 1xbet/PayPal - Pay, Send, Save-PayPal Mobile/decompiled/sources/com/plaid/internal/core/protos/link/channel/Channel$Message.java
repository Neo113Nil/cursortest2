package com.plaid.internal.core.protos.link.channel;

/* loaded from: classes16.dex */
public final class Channel$Message extends com.google.protobuf.GeneratedMessageLite<com.plaid.internal.core.protos.link.channel.Channel$Message, com.plaid.internal.core.protos.link.channel.Channel$Message.a> implements com.plaid.internal.core.protos.link.channel.b {
    private static final com.plaid.internal.core.protos.link.channel.Channel$Message DEFAULT_INSTANCE;
    public static final int EVENT_FIELD_NUMBER = 2;
    public static final int INTERNAL_EVENT_FIELD_NUMBER = 5;
    public static final int MESSAGE_ID_FIELD_NUMBER = 1;
    public static final int OOPWV_OPEN_MESSAGE_FIELD_NUMBER = 9;
    private static volatile com.google.protobuf.Parser<com.plaid.internal.core.protos.link.channel.Channel$Message> PARSER = null;
    public static final int PRE_COMPLETION_RESULT_FIELD_NUMBER = 6;
    public static final int RESULT_FIELD_NUMBER = 3;
    public static final int SYNC_REQUEST_FIELD_NUMBER = 7;
    public static final int SYNC_RESPONSE_FIELD_NUMBER = 8;
    public static final int TIMESTAMP_FIELD_NUMBER = 4;
    private int bitField0_;
    private java.lang.Object payload_;
    private com.google.protobuf.Timestamp timestamp_;
    private int payloadCase_ = 0;
    private java.lang.String messageId_ = "";

    public static final class OopwvOpenMessage extends com.google.protobuf.GeneratedMessageLite<com.plaid.internal.core.protos.link.channel.Channel$Message.OopwvOpenMessage, com.plaid.internal.core.protos.link.channel.Channel.Message.OopwvOpenMessage.a> implements com.google.protobuf.MessageLiteOrBuilder {
        private static final com.plaid.internal.core.protos.link.channel.Channel$Message.OopwvOpenMessage DEFAULT_INSTANCE;
        public static final int EVENT_FIELD_NUMBER = 1;
        private static volatile com.google.protobuf.Parser<com.plaid.internal.core.protos.link.channel.Channel$Message.OopwvOpenMessage> PARSER;
        private int event_;

        public static final class a extends com.google.protobuf.GeneratedMessageLite.Builder<com.plaid.internal.core.protos.link.channel.Channel$Message.OopwvOpenMessage, com.plaid.internal.core.protos.link.channel.Channel.Message.OopwvOpenMessage.a> implements com.google.protobuf.MessageLiteOrBuilder {
            public a() {
                super(com.plaid.internal.core.protos.link.channel.Channel$Message.OopwvOpenMessage.DEFAULT_INSTANCE);
            }
        }

        public enum b implements com.google.protobuf.Internal.EnumLite {
            OOPWV_EVENT_UNKNOWN(0),
            OOPWV_EVENT_FINISH(1),
            OOPWV_EVENT_CANCELLED(2),
            OOPWV_EVENT_IOS_DECLINED_DURING_OPEN_SESSION(3),
            UNRECOGNIZED(-1);

            public static final int OOPWV_EVENT_CANCELLED_VALUE = 2;
            public static final int OOPWV_EVENT_FINISH_VALUE = 1;
            public static final int OOPWV_EVENT_IOS_DECLINED_DURING_OPEN_SESSION_VALUE = 3;
            public static final int OOPWV_EVENT_UNKNOWN_VALUE = 0;
            public static final com.plaid.internal.core.protos.link.channel.Channel.Message.OopwvOpenMessage.b.a b = new com.plaid.internal.core.protos.link.channel.Channel.Message.OopwvOpenMessage.b.a();

            /* renamed from: a, reason: collision with root package name */
            public final int f6086a;

            public final class a implements com.google.protobuf.Internal.EnumLiteMap<com.plaid.internal.core.protos.link.channel.Channel.Message.OopwvOpenMessage.b> {
                @Override // com.google.protobuf.Internal.EnumLiteMap
                public final com.plaid.internal.core.protos.link.channel.Channel.Message.OopwvOpenMessage.b findValueByNumber(int i) {
                    return com.plaid.internal.core.protos.link.channel.Channel.Message.OopwvOpenMessage.b.forNumber(i);
                }
            }

            /* renamed from: com.plaid.internal.core.protos.link.channel.Channel$Message$OopwvOpenMessage$b$b, reason: collision with other inner class name */
            public static final class C0170b implements com.google.protobuf.Internal.EnumVerifier {

                /* renamed from: a, reason: collision with root package name */
                public static final com.plaid.internal.core.protos.link.channel.Channel.Message.OopwvOpenMessage.b.C0170b f6087a = new com.plaid.internal.core.protos.link.channel.Channel.Message.OopwvOpenMessage.b.C0170b();

                @Override // com.google.protobuf.Internal.EnumVerifier
                public final boolean isInRange(int i) {
                    return com.plaid.internal.core.protos.link.channel.Channel.Message.OopwvOpenMessage.b.forNumber(i) != null;
                }
            }

            b(int i) {
                this.f6086a = i;
            }

            public static com.plaid.internal.core.protos.link.channel.Channel.Message.OopwvOpenMessage.b forNumber(int i) {
                if (i == 0) {
                    return OOPWV_EVENT_UNKNOWN;
                }
                if (i == 1) {
                    return OOPWV_EVENT_FINISH;
                }
                if (i == 2) {
                    return OOPWV_EVENT_CANCELLED;
                }
                if (i != 3) {
                    return null;
                }
                return OOPWV_EVENT_IOS_DECLINED_DURING_OPEN_SESSION;
            }

            public static com.google.protobuf.Internal.EnumLiteMap<com.plaid.internal.core.protos.link.channel.Channel.Message.OopwvOpenMessage.b> internalGetValueMap() {
                return b;
            }

            public static com.google.protobuf.Internal.EnumVerifier internalGetVerifier() {
                return com.plaid.internal.core.protos.link.channel.Channel.Message.OopwvOpenMessage.b.C0170b.f6087a;
            }

            @Override // com.google.protobuf.Internal.EnumLite
            public final int getNumber() {
                if (this != UNRECOGNIZED) {
                    return this.f6086a;
                }
                throw new java.lang.IllegalArgumentException("Can't get the number of an unknown enum value.");
            }

            @java.lang.Deprecated
            public static com.plaid.internal.core.protos.link.channel.Channel.Message.OopwvOpenMessage.b valueOf(int i) {
                return forNumber(i);
            }
        }

        static {
            com.plaid.internal.core.protos.link.channel.Channel$Message.OopwvOpenMessage oopwvOpenMessage = new com.plaid.internal.core.protos.link.channel.Channel$Message.OopwvOpenMessage();
            DEFAULT_INSTANCE = oopwvOpenMessage;
            com.google.protobuf.GeneratedMessageLite.registerDefaultInstance(com.plaid.internal.core.protos.link.channel.Channel$Message.OopwvOpenMessage.class, oopwvOpenMessage);
        }

        private OopwvOpenMessage() {
        }

        private void clearEvent() {
            this.event_ = 0;
        }

        public static com.plaid.internal.core.protos.link.channel.Channel$Message.OopwvOpenMessage getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static com.plaid.internal.core.protos.link.channel.Channel.Message.OopwvOpenMessage.a newBuilder() {
            return DEFAULT_INSTANCE.createBuilder();
        }

        public static com.plaid.internal.core.protos.link.channel.Channel$Message.OopwvOpenMessage parseDelimitedFrom(java.io.InputStream inputStream) {
            return (com.plaid.internal.core.protos.link.channel.Channel$Message.OopwvOpenMessage) com.google.protobuf.GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static com.plaid.internal.core.protos.link.channel.Channel$Message.OopwvOpenMessage parseFrom(java.nio.ByteBuffer byteBuffer) {
            return (com.plaid.internal.core.protos.link.channel.Channel$Message.OopwvOpenMessage) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
        }

        public static com.google.protobuf.Parser<com.plaid.internal.core.protos.link.channel.Channel$Message.OopwvOpenMessage> parser() {
            return DEFAULT_INSTANCE.getParserForType();
        }

        private void setEvent(com.plaid.internal.core.protos.link.channel.Channel.Message.OopwvOpenMessage.b bVar) {
            this.event_ = bVar.getNumber();
        }

        private void setEventValue(int i) {
            this.event_ = i;
        }

        @Override // com.google.protobuf.GeneratedMessageLite
        public final java.lang.Object dynamicMethod(com.google.protobuf.GeneratedMessageLite.MethodToInvoke methodToInvoke, java.lang.Object obj, java.lang.Object obj2) {
            com.google.protobuf.Parser parser;
            switch (com.plaid.internal.core.protos.link.channel.a.f6090a[methodToInvoke.ordinal()]) {
                case 1:
                    return new com.plaid.internal.core.protos.link.channel.Channel$Message.OopwvOpenMessage();
                case 2:
                    return new com.plaid.internal.core.protos.link.channel.Channel.Message.OopwvOpenMessage.a();
                case 3:
                    return com.google.protobuf.GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0000\u0000\u0001\f", new java.lang.Object[]{"event_"});
                case 4:
                    return DEFAULT_INSTANCE;
                case 5:
                    com.google.protobuf.Parser<com.plaid.internal.core.protos.link.channel.Channel$Message.OopwvOpenMessage> parser2 = PARSER;
                    if (parser2 != null) {
                        return parser2;
                    }
                    synchronized (com.plaid.internal.core.protos.link.channel.Channel$Message.OopwvOpenMessage.class) {
                        parser = PARSER;
                        if (parser == null) {
                            parser = new com.google.protobuf.GeneratedMessageLite.DefaultInstanceBasedParser(DEFAULT_INSTANCE);
                            PARSER = parser;
                        }
                    }
                    return parser;
                case 6:
                    return (byte) 1;
                case 7:
                    return null;
                default:
                    throw new java.lang.UnsupportedOperationException();
            }
        }

        public final com.plaid.internal.core.protos.link.channel.Channel.Message.OopwvOpenMessage.b getEvent() {
            com.plaid.internal.core.protos.link.channel.Channel.Message.OopwvOpenMessage.b forNumber = com.plaid.internal.core.protos.link.channel.Channel.Message.OopwvOpenMessage.b.forNumber(this.event_);
            return forNumber == null ? com.plaid.internal.core.protos.link.channel.Channel.Message.OopwvOpenMessage.b.UNRECOGNIZED : forNumber;
        }

        public final int getEventValue() {
            return this.event_;
        }

        public static com.plaid.internal.core.protos.link.channel.Channel.Message.OopwvOpenMessage.a newBuilder(com.plaid.internal.core.protos.link.channel.Channel$Message.OopwvOpenMessage oopwvOpenMessage) {
            return DEFAULT_INSTANCE.createBuilder(oopwvOpenMessage);
        }

        public static com.plaid.internal.core.protos.link.channel.Channel$Message.OopwvOpenMessage parseDelimitedFrom(java.io.InputStream inputStream, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) {
            return (com.plaid.internal.core.protos.link.channel.Channel$Message.OopwvOpenMessage) com.google.protobuf.GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
        }

        public static com.plaid.internal.core.protos.link.channel.Channel$Message.OopwvOpenMessage parseFrom(java.nio.ByteBuffer byteBuffer, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) {
            return (com.plaid.internal.core.protos.link.channel.Channel$Message.OopwvOpenMessage) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
        }

        public static com.plaid.internal.core.protos.link.channel.Channel$Message.OopwvOpenMessage parseFrom(com.google.protobuf.ByteString byteString) {
            return (com.plaid.internal.core.protos.link.channel.Channel$Message.OopwvOpenMessage) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
        }

        public static com.plaid.internal.core.protos.link.channel.Channel$Message.OopwvOpenMessage parseFrom(com.google.protobuf.ByteString byteString, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) {
            return (com.plaid.internal.core.protos.link.channel.Channel$Message.OopwvOpenMessage) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
        }

        public static com.plaid.internal.core.protos.link.channel.Channel$Message.OopwvOpenMessage parseFrom(byte[] bArr) {
            return (com.plaid.internal.core.protos.link.channel.Channel$Message.OopwvOpenMessage) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
        }

        public static com.plaid.internal.core.protos.link.channel.Channel$Message.OopwvOpenMessage parseFrom(byte[] bArr, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) {
            return (com.plaid.internal.core.protos.link.channel.Channel$Message.OopwvOpenMessage) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
        }

        public static com.plaid.internal.core.protos.link.channel.Channel$Message.OopwvOpenMessage parseFrom(java.io.InputStream inputStream) {
            return (com.plaid.internal.core.protos.link.channel.Channel$Message.OopwvOpenMessage) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static com.plaid.internal.core.protos.link.channel.Channel$Message.OopwvOpenMessage parseFrom(java.io.InputStream inputStream, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) {
            return (com.plaid.internal.core.protos.link.channel.Channel$Message.OopwvOpenMessage) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
        }

        public static com.plaid.internal.core.protos.link.channel.Channel$Message.OopwvOpenMessage parseFrom(com.google.protobuf.CodedInputStream codedInputStream) {
            return (com.plaid.internal.core.protos.link.channel.Channel$Message.OopwvOpenMessage) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
        }

        public static com.plaid.internal.core.protos.link.channel.Channel$Message.OopwvOpenMessage parseFrom(com.google.protobuf.CodedInputStream codedInputStream, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) {
            return (com.plaid.internal.core.protos.link.channel.Channel$Message.OopwvOpenMessage) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
        }
    }

    public static final class SDKEvent extends com.google.protobuf.GeneratedMessageLite<com.plaid.internal.core.protos.link.channel.Channel$Message.SDKEvent, com.plaid.internal.core.protos.link.channel.Channel.Message.SDKEvent.a> implements com.google.protobuf.MessageLiteOrBuilder {
        private static final com.plaid.internal.core.protos.link.channel.Channel$Message.SDKEvent DEFAULT_INSTANCE;
        public static final int DELAY_MS_FIELD_NUMBER = 4;
        public static final int EVENT_NAME_FIELD_NUMBER = 1;
        public static final int METADATA_FIELD_NUMBER = 2;
        public static final int METADATA_JSON_FIELD_NUMBER = 3;
        private static volatile com.google.protobuf.Parser<com.plaid.internal.core.protos.link.channel.Channel$Message.SDKEvent> PARSER = null;
        public static final int QUEUE_BEHAVIOR_FIELD_NUMBER = 5;
        private int bitField0_;
        private com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$SDKEvent.Metadata metadata_;
        private java.lang.Object triggerBehavior_;
        private int triggerBehaviorCase_ = 0;
        private java.lang.String eventName_ = "";
        private java.lang.String metadataJson_ = "";

        public static final class a extends com.google.protobuf.GeneratedMessageLite.Builder<com.plaid.internal.core.protos.link.channel.Channel$Message.SDKEvent, com.plaid.internal.core.protos.link.channel.Channel.Message.SDKEvent.a> implements com.google.protobuf.MessageLiteOrBuilder {
            public a() {
                super(com.plaid.internal.core.protos.link.channel.Channel$Message.SDKEvent.DEFAULT_INSTANCE);
            }
        }

        public enum b {
            DELAY_MS(4),
            QUEUE_BEHAVIOR(5),
            TRIGGERBEHAVIOR_NOT_SET(0);


            /* renamed from: a, reason: collision with root package name */
            public final int f6088a;

            b(int i) {
                this.f6088a = i;
            }

            public static com.plaid.internal.core.protos.link.channel.Channel.Message.SDKEvent.b forNumber(int i) {
                if (i == 0) {
                    return TRIGGERBEHAVIOR_NOT_SET;
                }
                if (i == 4) {
                    return DELAY_MS;
                }
                if (i != 5) {
                    return null;
                }
                return QUEUE_BEHAVIOR;
            }

            public final int getNumber() {
                return this.f6088a;
            }

            @java.lang.Deprecated
            public static com.plaid.internal.core.protos.link.channel.Channel.Message.SDKEvent.b valueOf(int i) {
                return forNumber(i);
            }
        }

        static {
            com.plaid.internal.core.protos.link.channel.Channel$Message.SDKEvent sDKEvent = new com.plaid.internal.core.protos.link.channel.Channel$Message.SDKEvent();
            DEFAULT_INSTANCE = sDKEvent;
            com.google.protobuf.GeneratedMessageLite.registerDefaultInstance(com.plaid.internal.core.protos.link.channel.Channel$Message.SDKEvent.class, sDKEvent);
        }

        private SDKEvent() {
        }

        private void clearDelayMs() {
            if (this.triggerBehaviorCase_ == 4) {
                this.triggerBehaviorCase_ = 0;
                this.triggerBehavior_ = null;
            }
        }

        private void clearEventName() {
            this.eventName_ = getDefaultInstance().getEventName();
        }

        private void clearMetadata() {
            this.metadata_ = null;
            this.bitField0_ &= -2;
        }

        private void clearMetadataJson() {
            this.metadataJson_ = getDefaultInstance().getMetadataJson();
        }

        private void clearQueueBehavior() {
            if (this.triggerBehaviorCase_ == 5) {
                this.triggerBehaviorCase_ = 0;
                this.triggerBehavior_ = null;
            }
        }

        private void clearTriggerBehavior() {
            this.triggerBehaviorCase_ = 0;
            this.triggerBehavior_ = null;
        }

        public static com.plaid.internal.core.protos.link.channel.Channel$Message.SDKEvent getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static com.plaid.internal.core.protos.link.channel.Channel.Message.SDKEvent.a newBuilder() {
            return DEFAULT_INSTANCE.createBuilder();
        }

        public static com.plaid.internal.core.protos.link.channel.Channel$Message.SDKEvent parseDelimitedFrom(java.io.InputStream inputStream) {
            return (com.plaid.internal.core.protos.link.channel.Channel$Message.SDKEvent) com.google.protobuf.GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static com.plaid.internal.core.protos.link.channel.Channel$Message.SDKEvent parseFrom(java.nio.ByteBuffer byteBuffer) {
            return (com.plaid.internal.core.protos.link.channel.Channel$Message.SDKEvent) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
        }

        public static com.google.protobuf.Parser<com.plaid.internal.core.protos.link.channel.Channel$Message.SDKEvent> parser() {
            return DEFAULT_INSTANCE.getParserForType();
        }

        private void setDelayMs(int i) {
            this.triggerBehaviorCase_ = 4;
            this.triggerBehavior_ = java.lang.Integer.valueOf(i);
        }

        private void setEventNameBytes(com.google.protobuf.ByteString byteString) {
            com.google.protobuf.GeneratedMessageLite.checkByteStringIsUtf8(byteString);
            this.eventName_ = byteString.toStringUtf8();
        }

        private void setMetadataJsonBytes(com.google.protobuf.ByteString byteString) {
            com.google.protobuf.GeneratedMessageLite.checkByteStringIsUtf8(byteString);
            this.metadataJson_ = byteString.toStringUtf8();
        }

        private void setQueueBehavior(com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$SDKEvent.b bVar) {
            this.triggerBehavior_ = java.lang.Integer.valueOf(bVar.getNumber());
            this.triggerBehaviorCase_ = 5;
        }

        private void setQueueBehaviorValue(int i) {
            this.triggerBehaviorCase_ = 5;
            this.triggerBehavior_ = java.lang.Integer.valueOf(i);
        }

        @Override // com.google.protobuf.GeneratedMessageLite
        public final java.lang.Object dynamicMethod(com.google.protobuf.GeneratedMessageLite.MethodToInvoke methodToInvoke, java.lang.Object obj, java.lang.Object obj2) {
            com.google.protobuf.Parser parser;
            switch (com.plaid.internal.core.protos.link.channel.a.f6090a[methodToInvoke.ordinal()]) {
                case 1:
                    return new com.plaid.internal.core.protos.link.channel.Channel$Message.SDKEvent();
                case 2:
                    return new com.plaid.internal.core.protos.link.channel.Channel.Message.SDKEvent.a();
                case 3:
                    return com.google.protobuf.GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0005\u0001\u0001\u0001\u0005\u0005\u0000\u0000\u0000\u0001Ȉ\u0002ဉ\u0000\u0003Ȉ\u00047\u0000\u0005?\u0000", new java.lang.Object[]{"triggerBehavior_", "triggerBehaviorCase_", "bitField0_", "eventName_", "metadata_", "metadataJson_"});
                case 4:
                    return DEFAULT_INSTANCE;
                case 5:
                    com.google.protobuf.Parser<com.plaid.internal.core.protos.link.channel.Channel$Message.SDKEvent> parser2 = PARSER;
                    if (parser2 != null) {
                        return parser2;
                    }
                    synchronized (com.plaid.internal.core.protos.link.channel.Channel$Message.SDKEvent.class) {
                        parser = PARSER;
                        if (parser == null) {
                            parser = new com.google.protobuf.GeneratedMessageLite.DefaultInstanceBasedParser(DEFAULT_INSTANCE);
                            PARSER = parser;
                        }
                    }
                    return parser;
                case 6:
                    return (byte) 1;
                case 7:
                    return null;
                default:
                    throw new java.lang.UnsupportedOperationException();
            }
        }

        public final int getDelayMs() {
            if (this.triggerBehaviorCase_ == 4) {
                return ((java.lang.Integer) this.triggerBehavior_).intValue();
            }
            return 0;
        }

        public final java.lang.String getEventName() {
            return this.eventName_;
        }

        public final com.google.protobuf.ByteString getEventNameBytes() {
            return com.google.protobuf.ByteString.copyFromUtf8(this.eventName_);
        }

        public final com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$SDKEvent.Metadata getMetadata() {
            com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$SDKEvent.Metadata metadata = this.metadata_;
            return metadata == null ? com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$SDKEvent.Metadata.getDefaultInstance() : metadata;
        }

        public final java.lang.String getMetadataJson() {
            return this.metadataJson_;
        }

        public final com.google.protobuf.ByteString getMetadataJsonBytes() {
            return com.google.protobuf.ByteString.copyFromUtf8(this.metadataJson_);
        }

        public final com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$SDKEvent.b getQueueBehavior() {
            if (this.triggerBehaviorCase_ != 5) {
                return com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$SDKEvent.b.QUEUE_BEHAVIOR_UNKNOWN;
            }
            com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$SDKEvent.b forNumber = com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$SDKEvent.b.forNumber(((java.lang.Integer) this.triggerBehavior_).intValue());
            return forNumber == null ? com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$SDKEvent.b.UNRECOGNIZED : forNumber;
        }

        public final int getQueueBehaviorValue() {
            if (this.triggerBehaviorCase_ == 5) {
                return ((java.lang.Integer) this.triggerBehavior_).intValue();
            }
            return 0;
        }

        public final com.plaid.internal.core.protos.link.channel.Channel.Message.SDKEvent.b getTriggerBehaviorCase() {
            return com.plaid.internal.core.protos.link.channel.Channel.Message.SDKEvent.b.forNumber(this.triggerBehaviorCase_);
        }

        public final boolean hasDelayMs() {
            return this.triggerBehaviorCase_ == 4;
        }

        public final boolean hasMetadata() {
            return (this.bitField0_ & 1) != 0;
        }

        public final boolean hasQueueBehavior() {
            return this.triggerBehaviorCase_ == 5;
        }

        private void mergeMetadata(com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$SDKEvent.Metadata metadata) {
            com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$SDKEvent.Metadata metadata2 = this.metadata_;
            if (metadata2 == null || metadata2 == com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$SDKEvent.Metadata.getDefaultInstance()) {
                this.metadata_ = metadata;
            } else {
                this.metadata_ = com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$SDKEvent.Metadata.newBuilder(this.metadata_).mergeFrom((com.plaid.internal.core.protos.link.workflow.nodes.panes.Common.SDKEvent.Metadata.a) metadata).buildPartial();
            }
            this.bitField0_ |= 1;
        }

        public static com.plaid.internal.core.protos.link.channel.Channel.Message.SDKEvent.a newBuilder(com.plaid.internal.core.protos.link.channel.Channel$Message.SDKEvent sDKEvent) {
            return DEFAULT_INSTANCE.createBuilder(sDKEvent);
        }

        public static com.plaid.internal.core.protos.link.channel.Channel$Message.SDKEvent parseDelimitedFrom(java.io.InputStream inputStream, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) {
            return (com.plaid.internal.core.protos.link.channel.Channel$Message.SDKEvent) com.google.protobuf.GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
        }

        public static com.plaid.internal.core.protos.link.channel.Channel$Message.SDKEvent parseFrom(java.nio.ByteBuffer byteBuffer, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) {
            return (com.plaid.internal.core.protos.link.channel.Channel$Message.SDKEvent) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
        }

        private void setMetadata(com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$SDKEvent.Metadata metadata) {
            this.metadata_ = metadata;
            this.bitField0_ |= 1;
        }

        public static com.plaid.internal.core.protos.link.channel.Channel$Message.SDKEvent parseFrom(com.google.protobuf.ByteString byteString) {
            return (com.plaid.internal.core.protos.link.channel.Channel$Message.SDKEvent) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
        }

        private void setEventName(java.lang.String str) {
            this.eventName_ = str;
        }

        private void setMetadataJson(java.lang.String str) {
            this.metadataJson_ = str;
        }

        public static com.plaid.internal.core.protos.link.channel.Channel$Message.SDKEvent parseFrom(com.google.protobuf.ByteString byteString, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) {
            return (com.plaid.internal.core.protos.link.channel.Channel$Message.SDKEvent) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
        }

        public static com.plaid.internal.core.protos.link.channel.Channel$Message.SDKEvent parseFrom(byte[] bArr) {
            return (com.plaid.internal.core.protos.link.channel.Channel$Message.SDKEvent) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
        }

        public static com.plaid.internal.core.protos.link.channel.Channel$Message.SDKEvent parseFrom(byte[] bArr, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) {
            return (com.plaid.internal.core.protos.link.channel.Channel$Message.SDKEvent) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
        }

        public static com.plaid.internal.core.protos.link.channel.Channel$Message.SDKEvent parseFrom(java.io.InputStream inputStream) {
            return (com.plaid.internal.core.protos.link.channel.Channel$Message.SDKEvent) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static com.plaid.internal.core.protos.link.channel.Channel$Message.SDKEvent parseFrom(java.io.InputStream inputStream, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) {
            return (com.plaid.internal.core.protos.link.channel.Channel$Message.SDKEvent) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
        }

        public static com.plaid.internal.core.protos.link.channel.Channel$Message.SDKEvent parseFrom(com.google.protobuf.CodedInputStream codedInputStream) {
            return (com.plaid.internal.core.protos.link.channel.Channel$Message.SDKEvent) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
        }

        public static com.plaid.internal.core.protos.link.channel.Channel$Message.SDKEvent parseFrom(com.google.protobuf.CodedInputStream codedInputStream, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) {
            return (com.plaid.internal.core.protos.link.channel.Channel$Message.SDKEvent) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
        }
    }

    public static final class SDKResult extends com.google.protobuf.GeneratedMessageLite<com.plaid.internal.core.protos.link.channel.Channel$Message.SDKResult, com.plaid.internal.core.protos.link.channel.Channel.Message.SDKResult.a> implements com.google.protobuf.MessageLiteOrBuilder {
        public static final int CALLBACK_FIELD_NUMBER = 1;
        private static final com.plaid.internal.core.protos.link.channel.Channel$Message.SDKResult DEFAULT_INSTANCE;
        public static final int ERROR_FIELD_NUMBER = 3;
        public static final int ERROR_JSON_FIELD_NUMBER = 6;
        public static final int METADATA_FIELD_NUMBER = 4;
        public static final int METADATA_JSON_FIELD_NUMBER = 5;
        private static volatile com.google.protobuf.Parser<com.plaid.internal.core.protos.link.channel.Channel$Message.SDKResult> PARSER = null;
        public static final int PUBLIC_TOKEN_FIELD_NUMBER = 2;
        private int bitField0_;
        private int callback_;
        private com.plaid.internal.core.protos.link.workflow.primitives.SdkResult$SDKResult.Error error_;
        private com.plaid.internal.core.protos.link.workflow.primitives.SdkResult$SDKResult.Metadata metadata_;
        private java.lang.String publicToken_ = "";
        private java.lang.String metadataJson_ = "";
        private java.lang.String errorJson_ = "";

        public static final class a extends com.google.protobuf.GeneratedMessageLite.Builder<com.plaid.internal.core.protos.link.channel.Channel$Message.SDKResult, com.plaid.internal.core.protos.link.channel.Channel.Message.SDKResult.a> implements com.google.protobuf.MessageLiteOrBuilder {
            public a() {
                super(com.plaid.internal.core.protos.link.channel.Channel$Message.SDKResult.DEFAULT_INSTANCE);
            }
        }

        static {
            com.plaid.internal.core.protos.link.channel.Channel$Message.SDKResult sDKResult = new com.plaid.internal.core.protos.link.channel.Channel$Message.SDKResult();
            DEFAULT_INSTANCE = sDKResult;
            com.google.protobuf.GeneratedMessageLite.registerDefaultInstance(com.plaid.internal.core.protos.link.channel.Channel$Message.SDKResult.class, sDKResult);
        }

        private SDKResult() {
        }

        private void clearCallback() {
            this.callback_ = 0;
        }

        private void clearError() {
            this.error_ = null;
            this.bitField0_ &= -2;
        }

        private void clearErrorJson() {
            this.errorJson_ = getDefaultInstance().getErrorJson();
        }

        private void clearMetadata() {
            this.metadata_ = null;
            this.bitField0_ &= -3;
        }

        private void clearMetadataJson() {
            this.metadataJson_ = getDefaultInstance().getMetadataJson();
        }

        private void clearPublicToken() {
            this.publicToken_ = getDefaultInstance().getPublicToken();
        }

        public static com.plaid.internal.core.protos.link.channel.Channel$Message.SDKResult getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static com.plaid.internal.core.protos.link.channel.Channel.Message.SDKResult.a newBuilder() {
            return DEFAULT_INSTANCE.createBuilder();
        }

        public static com.plaid.internal.core.protos.link.channel.Channel$Message.SDKResult parseDelimitedFrom(java.io.InputStream inputStream) {
            return (com.plaid.internal.core.protos.link.channel.Channel$Message.SDKResult) com.google.protobuf.GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static com.plaid.internal.core.protos.link.channel.Channel$Message.SDKResult parseFrom(java.nio.ByteBuffer byteBuffer) {
            return (com.plaid.internal.core.protos.link.channel.Channel$Message.SDKResult) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
        }

        public static com.google.protobuf.Parser<com.plaid.internal.core.protos.link.channel.Channel$Message.SDKResult> parser() {
            return DEFAULT_INSTANCE.getParserForType();
        }

        private void setCallback(com.plaid.internal.core.protos.link.workflow.primitives.SdkResult$SDKResult.b bVar) {
            this.callback_ = bVar.getNumber();
        }

        private void setCallbackValue(int i) {
            this.callback_ = i;
        }

        private void setErrorJsonBytes(com.google.protobuf.ByteString byteString) {
            com.google.protobuf.GeneratedMessageLite.checkByteStringIsUtf8(byteString);
            this.errorJson_ = byteString.toStringUtf8();
        }

        private void setMetadataJsonBytes(com.google.protobuf.ByteString byteString) {
            com.google.protobuf.GeneratedMessageLite.checkByteStringIsUtf8(byteString);
            this.metadataJson_ = byteString.toStringUtf8();
        }

        private void setPublicTokenBytes(com.google.protobuf.ByteString byteString) {
            com.google.protobuf.GeneratedMessageLite.checkByteStringIsUtf8(byteString);
            this.publicToken_ = byteString.toStringUtf8();
        }

        @Override // com.google.protobuf.GeneratedMessageLite
        public final java.lang.Object dynamicMethod(com.google.protobuf.GeneratedMessageLite.MethodToInvoke methodToInvoke, java.lang.Object obj, java.lang.Object obj2) {
            com.google.protobuf.Parser parser;
            switch (com.plaid.internal.core.protos.link.channel.a.f6090a[methodToInvoke.ordinal()]) {
                case 1:
                    return new com.plaid.internal.core.protos.link.channel.Channel$Message.SDKResult();
                case 2:
                    return new com.plaid.internal.core.protos.link.channel.Channel.Message.SDKResult.a();
                case 3:
                    return com.google.protobuf.GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0006\u0000\u0001\u0001\u0006\u0006\u0000\u0000\u0000\u0001\f\u0002Ȉ\u0003ဉ\u0000\u0004ဉ\u0001\u0005Ȉ\u0006Ȉ", new java.lang.Object[]{"bitField0_", "callback_", "publicToken_", "error_", "metadata_", "metadataJson_", "errorJson_"});
                case 4:
                    return DEFAULT_INSTANCE;
                case 5:
                    com.google.protobuf.Parser<com.plaid.internal.core.protos.link.channel.Channel$Message.SDKResult> parser2 = PARSER;
                    if (parser2 != null) {
                        return parser2;
                    }
                    synchronized (com.plaid.internal.core.protos.link.channel.Channel$Message.SDKResult.class) {
                        parser = PARSER;
                        if (parser == null) {
                            parser = new com.google.protobuf.GeneratedMessageLite.DefaultInstanceBasedParser(DEFAULT_INSTANCE);
                            PARSER = parser;
                        }
                    }
                    return parser;
                case 6:
                    return (byte) 1;
                case 7:
                    return null;
                default:
                    throw new java.lang.UnsupportedOperationException();
            }
        }

        public final com.plaid.internal.core.protos.link.workflow.primitives.SdkResult$SDKResult.b getCallback() {
            com.plaid.internal.core.protos.link.workflow.primitives.SdkResult$SDKResult.b forNumber = com.plaid.internal.core.protos.link.workflow.primitives.SdkResult$SDKResult.b.forNumber(this.callback_);
            return forNumber == null ? com.plaid.internal.core.protos.link.workflow.primitives.SdkResult$SDKResult.b.UNRECOGNIZED : forNumber;
        }

        public final int getCallbackValue() {
            return this.callback_;
        }

        public final com.plaid.internal.core.protos.link.workflow.primitives.SdkResult$SDKResult.Error getError() {
            com.plaid.internal.core.protos.link.workflow.primitives.SdkResult$SDKResult.Error error = this.error_;
            return error == null ? com.plaid.internal.core.protos.link.workflow.primitives.SdkResult$SDKResult.Error.getDefaultInstance() : error;
        }

        public final java.lang.String getErrorJson() {
            return this.errorJson_;
        }

        public final com.google.protobuf.ByteString getErrorJsonBytes() {
            return com.google.protobuf.ByteString.copyFromUtf8(this.errorJson_);
        }

        public final com.plaid.internal.core.protos.link.workflow.primitives.SdkResult$SDKResult.Metadata getMetadata() {
            com.plaid.internal.core.protos.link.workflow.primitives.SdkResult$SDKResult.Metadata metadata = this.metadata_;
            return metadata == null ? com.plaid.internal.core.protos.link.workflow.primitives.SdkResult$SDKResult.Metadata.getDefaultInstance() : metadata;
        }

        public final java.lang.String getMetadataJson() {
            return this.metadataJson_;
        }

        public final com.google.protobuf.ByteString getMetadataJsonBytes() {
            return com.google.protobuf.ByteString.copyFromUtf8(this.metadataJson_);
        }

        public final java.lang.String getPublicToken() {
            return this.publicToken_;
        }

        public final com.google.protobuf.ByteString getPublicTokenBytes() {
            return com.google.protobuf.ByteString.copyFromUtf8(this.publicToken_);
        }

        public final boolean hasError() {
            return (this.bitField0_ & 1) != 0;
        }

        public final boolean hasMetadata() {
            return (this.bitField0_ & 2) != 0;
        }

        private void mergeError(com.plaid.internal.core.protos.link.workflow.primitives.SdkResult$SDKResult.Error error) {
            com.plaid.internal.core.protos.link.workflow.primitives.SdkResult$SDKResult.Error error2 = this.error_;
            if (error2 == null || error2 == com.plaid.internal.core.protos.link.workflow.primitives.SdkResult$SDKResult.Error.getDefaultInstance()) {
                this.error_ = error;
            } else {
                this.error_ = com.plaid.internal.core.protos.link.workflow.primitives.SdkResult$SDKResult.Error.newBuilder(this.error_).mergeFrom((com.plaid.internal.core.protos.link.workflow.primitives.SdkResult.SDKResult.Error.a) error).buildPartial();
            }
            this.bitField0_ |= 1;
        }

        private void mergeMetadata(com.plaid.internal.core.protos.link.workflow.primitives.SdkResult$SDKResult.Metadata metadata) {
            com.plaid.internal.core.protos.link.workflow.primitives.SdkResult$SDKResult.Metadata metadata2 = this.metadata_;
            if (metadata2 == null || metadata2 == com.plaid.internal.core.protos.link.workflow.primitives.SdkResult$SDKResult.Metadata.getDefaultInstance()) {
                this.metadata_ = metadata;
            } else {
                this.metadata_ = com.plaid.internal.core.protos.link.workflow.primitives.SdkResult$SDKResult.Metadata.newBuilder(this.metadata_).mergeFrom((com.plaid.internal.core.protos.link.workflow.primitives.SdkResult.SDKResult.Metadata.b) metadata).buildPartial();
            }
            this.bitField0_ |= 2;
        }

        public static com.plaid.internal.core.protos.link.channel.Channel.Message.SDKResult.a newBuilder(com.plaid.internal.core.protos.link.channel.Channel$Message.SDKResult sDKResult) {
            return DEFAULT_INSTANCE.createBuilder(sDKResult);
        }

        public static com.plaid.internal.core.protos.link.channel.Channel$Message.SDKResult parseDelimitedFrom(java.io.InputStream inputStream, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) {
            return (com.plaid.internal.core.protos.link.channel.Channel$Message.SDKResult) com.google.protobuf.GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
        }

        public static com.plaid.internal.core.protos.link.channel.Channel$Message.SDKResult parseFrom(java.nio.ByteBuffer byteBuffer, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) {
            return (com.plaid.internal.core.protos.link.channel.Channel$Message.SDKResult) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
        }

        private void setError(com.plaid.internal.core.protos.link.workflow.primitives.SdkResult$SDKResult.Error error) {
            this.error_ = error;
            this.bitField0_ |= 1;
        }

        private void setMetadata(com.plaid.internal.core.protos.link.workflow.primitives.SdkResult$SDKResult.Metadata metadata) {
            this.metadata_ = metadata;
            this.bitField0_ |= 2;
        }

        public static com.plaid.internal.core.protos.link.channel.Channel$Message.SDKResult parseFrom(com.google.protobuf.ByteString byteString) {
            return (com.plaid.internal.core.protos.link.channel.Channel$Message.SDKResult) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
        }

        private void setErrorJson(java.lang.String str) {
            this.errorJson_ = str;
        }

        private void setMetadataJson(java.lang.String str) {
            this.metadataJson_ = str;
        }

        private void setPublicToken(java.lang.String str) {
            this.publicToken_ = str;
        }

        public static com.plaid.internal.core.protos.link.channel.Channel$Message.SDKResult parseFrom(com.google.protobuf.ByteString byteString, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) {
            return (com.plaid.internal.core.protos.link.channel.Channel$Message.SDKResult) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
        }

        public static com.plaid.internal.core.protos.link.channel.Channel$Message.SDKResult parseFrom(byte[] bArr) {
            return (com.plaid.internal.core.protos.link.channel.Channel$Message.SDKResult) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
        }

        public static com.plaid.internal.core.protos.link.channel.Channel$Message.SDKResult parseFrom(byte[] bArr, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) {
            return (com.plaid.internal.core.protos.link.channel.Channel$Message.SDKResult) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
        }

        public static com.plaid.internal.core.protos.link.channel.Channel$Message.SDKResult parseFrom(java.io.InputStream inputStream) {
            return (com.plaid.internal.core.protos.link.channel.Channel$Message.SDKResult) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static com.plaid.internal.core.protos.link.channel.Channel$Message.SDKResult parseFrom(java.io.InputStream inputStream, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) {
            return (com.plaid.internal.core.protos.link.channel.Channel$Message.SDKResult) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
        }

        public static com.plaid.internal.core.protos.link.channel.Channel$Message.SDKResult parseFrom(com.google.protobuf.CodedInputStream codedInputStream) {
            return (com.plaid.internal.core.protos.link.channel.Channel$Message.SDKResult) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
        }

        public static com.plaid.internal.core.protos.link.channel.Channel$Message.SDKResult parseFrom(com.google.protobuf.CodedInputStream codedInputStream, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) {
            return (com.plaid.internal.core.protos.link.channel.Channel$Message.SDKResult) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
        }
    }

    public static final class a extends com.google.protobuf.GeneratedMessageLite.Builder<com.plaid.internal.core.protos.link.channel.Channel$Message, com.plaid.internal.core.protos.link.channel.Channel$Message.a> implements com.plaid.internal.core.protos.link.channel.b {
        public a() {
            super(com.plaid.internal.core.protos.link.channel.Channel$Message.DEFAULT_INSTANCE);
        }
    }

    public enum b {
        EVENT(2),
        RESULT(3),
        PRE_COMPLETION_RESULT(6),
        INTERNAL_EVENT(5),
        SYNC_REQUEST(7),
        SYNC_RESPONSE(8),
        OOPWV_OPEN_MESSAGE(9),
        PAYLOAD_NOT_SET(0);


        /* renamed from: a, reason: collision with root package name */
        public final int f6089a;

        b(int i) {
            this.f6089a = i;
        }

        public static com.plaid.internal.core.protos.link.channel.Channel$Message.b forNumber(int i) {
            if (i == 0) {
                return PAYLOAD_NOT_SET;
            }
            if (i == 2) {
                return EVENT;
            }
            if (i == 3) {
                return RESULT;
            }
            switch (i) {
                case 5:
                    return INTERNAL_EVENT;
                case 6:
                    return PRE_COMPLETION_RESULT;
                case 7:
                    return SYNC_REQUEST;
                case 8:
                    return SYNC_RESPONSE;
                case 9:
                    return OOPWV_OPEN_MESSAGE;
                default:
                    return null;
            }
        }

        public final int getNumber() {
            return this.f6089a;
        }

        @java.lang.Deprecated
        public static com.plaid.internal.core.protos.link.channel.Channel$Message.b valueOf(int i) {
            return forNumber(i);
        }
    }

    static {
        com.plaid.internal.core.protos.link.channel.Channel$Message channel$Message = new com.plaid.internal.core.protos.link.channel.Channel$Message();
        DEFAULT_INSTANCE = channel$Message;
        com.google.protobuf.GeneratedMessageLite.registerDefaultInstance(com.plaid.internal.core.protos.link.channel.Channel$Message.class, channel$Message);
    }

    private Channel$Message() {
    }

    private void clearEvent() {
        if (this.payloadCase_ == 2) {
            this.payloadCase_ = 0;
            this.payload_ = null;
        }
    }

    private void clearInternalEvent() {
        if (this.payloadCase_ == 5) {
            this.payloadCase_ = 0;
            this.payload_ = null;
        }
    }

    private void clearMessageId() {
        this.messageId_ = getDefaultInstance().getMessageId();
    }

    private void clearOopwvOpenMessage() {
        if (this.payloadCase_ == 9) {
            this.payloadCase_ = 0;
            this.payload_ = null;
        }
    }

    private void clearPayload() {
        this.payloadCase_ = 0;
        this.payload_ = null;
    }

    private void clearPreCompletionResult() {
        if (this.payloadCase_ == 6) {
            this.payloadCase_ = 0;
            this.payload_ = null;
        }
    }

    private void clearResult() {
        if (this.payloadCase_ == 3) {
            this.payloadCase_ = 0;
            this.payload_ = null;
        }
    }

    private void clearSyncRequest() {
        if (this.payloadCase_ == 7) {
            this.payloadCase_ = 0;
            this.payload_ = null;
        }
    }

    private void clearSyncResponse() {
        if (this.payloadCase_ == 8) {
            this.payloadCase_ = 0;
            this.payload_ = null;
        }
    }

    private void clearTimestamp() {
        this.timestamp_ = null;
        this.bitField0_ &= -2;
    }

    public static com.plaid.internal.core.protos.link.channel.Channel$Message getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static com.plaid.internal.core.protos.link.channel.Channel$Message.a newBuilder() {
        return DEFAULT_INSTANCE.createBuilder();
    }

    public static com.plaid.internal.core.protos.link.channel.Channel$Message parseDelimitedFrom(java.io.InputStream inputStream) {
        return (com.plaid.internal.core.protos.link.channel.Channel$Message) com.google.protobuf.GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static com.plaid.internal.core.protos.link.channel.Channel$Message parseFrom(java.nio.ByteBuffer byteBuffer) {
        return (com.plaid.internal.core.protos.link.channel.Channel$Message) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static com.google.protobuf.Parser<com.plaid.internal.core.protos.link.channel.Channel$Message> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    private void setMessageIdBytes(com.google.protobuf.ByteString byteString) {
        com.google.protobuf.GeneratedMessageLite.checkByteStringIsUtf8(byteString);
        this.messageId_ = byteString.toStringUtf8();
    }

    @Override // com.google.protobuf.GeneratedMessageLite
    public final java.lang.Object dynamicMethod(com.google.protobuf.GeneratedMessageLite.MethodToInvoke methodToInvoke, java.lang.Object obj, java.lang.Object obj2) {
        com.google.protobuf.Parser parser;
        switch (com.plaid.internal.core.protos.link.channel.a.f6090a[methodToInvoke.ordinal()]) {
            case 1:
                return new com.plaid.internal.core.protos.link.channel.Channel$Message();
            case 2:
                return new com.plaid.internal.core.protos.link.channel.Channel$Message.a();
            case 3:
                return com.google.protobuf.GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\t\u0001\u0001\u0001\t\t\u0000\u0000\u0000\u0001Ȉ\u0002<\u0000\u0003<\u0000\u0004ဉ\u0000\u0005<\u0000\u0006<\u0000\u0007<\u0000\b<\u0000\t<\u0000", new java.lang.Object[]{"payload_", "payloadCase_", "bitField0_", "messageId_", com.plaid.internal.core.protos.link.channel.Channel$Message.SDKEvent.class, com.plaid.internal.core.protos.link.channel.Channel$Message.SDKResult.class, "timestamp_", com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$SDKInternalEvent.class, com.plaid.internal.core.protos.link.channel.Channel$Message.SDKResult.class, com.plaid.internal.core.protos.link.sync.Sync$SyncRequest.class, com.plaid.internal.core.protos.link.sync.Sync$SyncResponse.class, com.plaid.internal.core.protos.link.channel.Channel$Message.OopwvOpenMessage.class});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                com.google.protobuf.Parser<com.plaid.internal.core.protos.link.channel.Channel$Message> parser2 = PARSER;
                if (parser2 != null) {
                    return parser2;
                }
                synchronized (com.plaid.internal.core.protos.link.channel.Channel$Message.class) {
                    parser = PARSER;
                    if (parser == null) {
                        parser = new com.google.protobuf.GeneratedMessageLite.DefaultInstanceBasedParser(DEFAULT_INSTANCE);
                        PARSER = parser;
                    }
                }
                return parser;
            case 6:
                return (byte) 1;
            case 7:
                return null;
            default:
                throw new java.lang.UnsupportedOperationException();
        }
    }

    public final com.plaid.internal.core.protos.link.channel.Channel$Message.SDKEvent getEvent() {
        return this.payloadCase_ == 2 ? (com.plaid.internal.core.protos.link.channel.Channel$Message.SDKEvent) this.payload_ : com.plaid.internal.core.protos.link.channel.Channel$Message.SDKEvent.getDefaultInstance();
    }

    public final com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$SDKInternalEvent getInternalEvent() {
        return this.payloadCase_ == 5 ? (com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$SDKInternalEvent) this.payload_ : com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$SDKInternalEvent.getDefaultInstance();
    }

    public final java.lang.String getMessageId() {
        return this.messageId_;
    }

    public final com.google.protobuf.ByteString getMessageIdBytes() {
        return com.google.protobuf.ByteString.copyFromUtf8(this.messageId_);
    }

    public final com.plaid.internal.core.protos.link.channel.Channel$Message.OopwvOpenMessage getOopwvOpenMessage() {
        return this.payloadCase_ == 9 ? (com.plaid.internal.core.protos.link.channel.Channel$Message.OopwvOpenMessage) this.payload_ : com.plaid.internal.core.protos.link.channel.Channel$Message.OopwvOpenMessage.getDefaultInstance();
    }

    public final com.plaid.internal.core.protos.link.channel.Channel$Message.b getPayloadCase() {
        return com.plaid.internal.core.protos.link.channel.Channel$Message.b.forNumber(this.payloadCase_);
    }

    public final com.plaid.internal.core.protos.link.channel.Channel$Message.SDKResult getPreCompletionResult() {
        return this.payloadCase_ == 6 ? (com.plaid.internal.core.protos.link.channel.Channel$Message.SDKResult) this.payload_ : com.plaid.internal.core.protos.link.channel.Channel$Message.SDKResult.getDefaultInstance();
    }

    public final com.plaid.internal.core.protos.link.channel.Channel$Message.SDKResult getResult() {
        return this.payloadCase_ == 3 ? (com.plaid.internal.core.protos.link.channel.Channel$Message.SDKResult) this.payload_ : com.plaid.internal.core.protos.link.channel.Channel$Message.SDKResult.getDefaultInstance();
    }

    public final com.plaid.internal.core.protos.link.sync.Sync$SyncRequest getSyncRequest() {
        return this.payloadCase_ == 7 ? (com.plaid.internal.core.protos.link.sync.Sync$SyncRequest) this.payload_ : com.plaid.internal.core.protos.link.sync.Sync$SyncRequest.getDefaultInstance();
    }

    public final com.plaid.internal.core.protos.link.sync.Sync$SyncResponse getSyncResponse() {
        return this.payloadCase_ == 8 ? (com.plaid.internal.core.protos.link.sync.Sync$SyncResponse) this.payload_ : com.plaid.internal.core.protos.link.sync.Sync$SyncResponse.getDefaultInstance();
    }

    public final com.google.protobuf.Timestamp getTimestamp() {
        com.google.protobuf.Timestamp timestamp = this.timestamp_;
        return timestamp == null ? com.google.protobuf.Timestamp.getDefaultInstance() : timestamp;
    }

    public final boolean hasEvent() {
        return this.payloadCase_ == 2;
    }

    public final boolean hasInternalEvent() {
        return this.payloadCase_ == 5;
    }

    public final boolean hasOopwvOpenMessage() {
        return this.payloadCase_ == 9;
    }

    public final boolean hasPreCompletionResult() {
        return this.payloadCase_ == 6;
    }

    public final boolean hasResult() {
        return this.payloadCase_ == 3;
    }

    public final boolean hasSyncRequest() {
        return this.payloadCase_ == 7;
    }

    public final boolean hasSyncResponse() {
        return this.payloadCase_ == 8;
    }

    public final boolean hasTimestamp() {
        return (this.bitField0_ & 1) != 0;
    }

    private void mergeEvent(com.plaid.internal.core.protos.link.channel.Channel$Message.SDKEvent sDKEvent) {
        if (this.payloadCase_ != 2 || this.payload_ == com.plaid.internal.core.protos.link.channel.Channel$Message.SDKEvent.getDefaultInstance()) {
            this.payload_ = sDKEvent;
        } else {
            this.payload_ = com.plaid.internal.core.protos.link.channel.Channel$Message.SDKEvent.newBuilder((com.plaid.internal.core.protos.link.channel.Channel$Message.SDKEvent) this.payload_).mergeFrom((com.plaid.internal.core.protos.link.channel.Channel.Message.SDKEvent.a) sDKEvent).buildPartial();
        }
        this.payloadCase_ = 2;
    }

    private void mergeInternalEvent(com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$SDKInternalEvent common$SDKInternalEvent) {
        if (this.payloadCase_ != 5 || this.payload_ == com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$SDKInternalEvent.getDefaultInstance()) {
            this.payload_ = common$SDKInternalEvent;
        } else {
            this.payload_ = com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$SDKInternalEvent.newBuilder((com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$SDKInternalEvent) this.payload_).mergeFrom((com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$SDKInternalEvent.a) common$SDKInternalEvent).buildPartial();
        }
        this.payloadCase_ = 5;
    }

    private void mergeOopwvOpenMessage(com.plaid.internal.core.protos.link.channel.Channel$Message.OopwvOpenMessage oopwvOpenMessage) {
        if (this.payloadCase_ != 9 || this.payload_ == com.plaid.internal.core.protos.link.channel.Channel$Message.OopwvOpenMessage.getDefaultInstance()) {
            this.payload_ = oopwvOpenMessage;
        } else {
            this.payload_ = com.plaid.internal.core.protos.link.channel.Channel$Message.OopwvOpenMessage.newBuilder((com.plaid.internal.core.protos.link.channel.Channel$Message.OopwvOpenMessage) this.payload_).mergeFrom((com.plaid.internal.core.protos.link.channel.Channel.Message.OopwvOpenMessage.a) oopwvOpenMessage).buildPartial();
        }
        this.payloadCase_ = 9;
    }

    private void mergePreCompletionResult(com.plaid.internal.core.protos.link.channel.Channel$Message.SDKResult sDKResult) {
        if (this.payloadCase_ != 6 || this.payload_ == com.plaid.internal.core.protos.link.channel.Channel$Message.SDKResult.getDefaultInstance()) {
            this.payload_ = sDKResult;
        } else {
            this.payload_ = com.plaid.internal.core.protos.link.channel.Channel$Message.SDKResult.newBuilder((com.plaid.internal.core.protos.link.channel.Channel$Message.SDKResult) this.payload_).mergeFrom((com.plaid.internal.core.protos.link.channel.Channel.Message.SDKResult.a) sDKResult).buildPartial();
        }
        this.payloadCase_ = 6;
    }

    private void mergeResult(com.plaid.internal.core.protos.link.channel.Channel$Message.SDKResult sDKResult) {
        if (this.payloadCase_ != 3 || this.payload_ == com.plaid.internal.core.protos.link.channel.Channel$Message.SDKResult.getDefaultInstance()) {
            this.payload_ = sDKResult;
        } else {
            this.payload_ = com.plaid.internal.core.protos.link.channel.Channel$Message.SDKResult.newBuilder((com.plaid.internal.core.protos.link.channel.Channel$Message.SDKResult) this.payload_).mergeFrom((com.plaid.internal.core.protos.link.channel.Channel.Message.SDKResult.a) sDKResult).buildPartial();
        }
        this.payloadCase_ = 3;
    }

    private void mergeSyncRequest(com.plaid.internal.core.protos.link.sync.Sync$SyncRequest sync$SyncRequest) {
        if (this.payloadCase_ != 7 || this.payload_ == com.plaid.internal.core.protos.link.sync.Sync$SyncRequest.getDefaultInstance()) {
            this.payload_ = sync$SyncRequest;
        } else {
            this.payload_ = com.plaid.internal.core.protos.link.sync.Sync$SyncRequest.newBuilder((com.plaid.internal.core.protos.link.sync.Sync$SyncRequest) this.payload_).mergeFrom((com.plaid.internal.core.protos.link.sync.Sync$SyncRequest.a) sync$SyncRequest).buildPartial();
        }
        this.payloadCase_ = 7;
    }

    private void mergeSyncResponse(com.plaid.internal.core.protos.link.sync.Sync$SyncResponse sync$SyncResponse) {
        if (this.payloadCase_ != 8 || this.payload_ == com.plaid.internal.core.protos.link.sync.Sync$SyncResponse.getDefaultInstance()) {
            this.payload_ = sync$SyncResponse;
        } else {
            this.payload_ = com.plaid.internal.core.protos.link.sync.Sync$SyncResponse.newBuilder((com.plaid.internal.core.protos.link.sync.Sync$SyncResponse) this.payload_).mergeFrom((com.plaid.internal.core.protos.link.sync.Sync$SyncResponse.a) sync$SyncResponse).buildPartial();
        }
        this.payloadCase_ = 8;
    }

    private void mergeTimestamp(com.google.protobuf.Timestamp timestamp) {
        com.google.protobuf.Timestamp timestamp2 = this.timestamp_;
        if (timestamp2 == null || timestamp2 == com.google.protobuf.Timestamp.getDefaultInstance()) {
            this.timestamp_ = timestamp;
        } else {
            this.timestamp_ = com.google.protobuf.Timestamp.newBuilder(this.timestamp_).mergeFrom((com.google.protobuf.Timestamp.Builder) timestamp).buildPartial();
        }
        this.bitField0_ |= 1;
    }

    public static com.plaid.internal.core.protos.link.channel.Channel$Message.a newBuilder(com.plaid.internal.core.protos.link.channel.Channel$Message channel$Message) {
        return DEFAULT_INSTANCE.createBuilder(channel$Message);
    }

    public static com.plaid.internal.core.protos.link.channel.Channel$Message parseDelimitedFrom(java.io.InputStream inputStream, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) {
        return (com.plaid.internal.core.protos.link.channel.Channel$Message) com.google.protobuf.GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static com.plaid.internal.core.protos.link.channel.Channel$Message parseFrom(java.nio.ByteBuffer byteBuffer, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) {
        return (com.plaid.internal.core.protos.link.channel.Channel$Message) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
    }

    private void setEvent(com.plaid.internal.core.protos.link.channel.Channel$Message.SDKEvent sDKEvent) {
        this.payload_ = sDKEvent;
        this.payloadCase_ = 2;
    }

    private void setInternalEvent(com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$SDKInternalEvent common$SDKInternalEvent) {
        this.payload_ = common$SDKInternalEvent;
        this.payloadCase_ = 5;
    }

    private void setOopwvOpenMessage(com.plaid.internal.core.protos.link.channel.Channel$Message.OopwvOpenMessage oopwvOpenMessage) {
        this.payload_ = oopwvOpenMessage;
        this.payloadCase_ = 9;
    }

    private void setPreCompletionResult(com.plaid.internal.core.protos.link.channel.Channel$Message.SDKResult sDKResult) {
        this.payload_ = sDKResult;
        this.payloadCase_ = 6;
    }

    private void setResult(com.plaid.internal.core.protos.link.channel.Channel$Message.SDKResult sDKResult) {
        this.payload_ = sDKResult;
        this.payloadCase_ = 3;
    }

    private void setSyncRequest(com.plaid.internal.core.protos.link.sync.Sync$SyncRequest sync$SyncRequest) {
        this.payload_ = sync$SyncRequest;
        this.payloadCase_ = 7;
    }

    private void setSyncResponse(com.plaid.internal.core.protos.link.sync.Sync$SyncResponse sync$SyncResponse) {
        this.payload_ = sync$SyncResponse;
        this.payloadCase_ = 8;
    }

    private void setTimestamp(com.google.protobuf.Timestamp timestamp) {
        this.timestamp_ = timestamp;
        this.bitField0_ |= 1;
    }

    public static com.plaid.internal.core.protos.link.channel.Channel$Message parseFrom(com.google.protobuf.ByteString byteString) {
        return (com.plaid.internal.core.protos.link.channel.Channel$Message) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
    }

    private void setMessageId(java.lang.String str) {
        this.messageId_ = str;
    }

    public static com.plaid.internal.core.protos.link.channel.Channel$Message parseFrom(com.google.protobuf.ByteString byteString, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) {
        return (com.plaid.internal.core.protos.link.channel.Channel$Message) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
    }

    public static com.plaid.internal.core.protos.link.channel.Channel$Message parseFrom(byte[] bArr) {
        return (com.plaid.internal.core.protos.link.channel.Channel$Message) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static com.plaid.internal.core.protos.link.channel.Channel$Message parseFrom(byte[] bArr, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) {
        return (com.plaid.internal.core.protos.link.channel.Channel$Message) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
    }

    public static com.plaid.internal.core.protos.link.channel.Channel$Message parseFrom(java.io.InputStream inputStream) {
        return (com.plaid.internal.core.protos.link.channel.Channel$Message) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static com.plaid.internal.core.protos.link.channel.Channel$Message parseFrom(java.io.InputStream inputStream, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) {
        return (com.plaid.internal.core.protos.link.channel.Channel$Message) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static com.plaid.internal.core.protos.link.channel.Channel$Message parseFrom(com.google.protobuf.CodedInputStream codedInputStream) {
        return (com.plaid.internal.core.protos.link.channel.Channel$Message) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
    }

    public static com.plaid.internal.core.protos.link.channel.Channel$Message parseFrom(com.google.protobuf.CodedInputStream codedInputStream, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) {
        return (com.plaid.internal.core.protos.link.channel.Channel$Message) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
    }
}
