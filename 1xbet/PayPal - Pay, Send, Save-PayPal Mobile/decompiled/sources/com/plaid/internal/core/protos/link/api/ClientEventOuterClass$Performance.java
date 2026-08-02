package com.plaid.internal.core.protos.link.api;

/* loaded from: classes16.dex */
public final class ClientEventOuterClass$Performance extends com.google.protobuf.GeneratedMessageLite<com.plaid.internal.core.protos.link.api.ClientEventOuterClass$Performance, com.plaid.internal.core.protos.link.api.ClientEventOuterClass$Performance.a> implements com.google.protobuf.MessageLiteOrBuilder {
    private static final com.plaid.internal.core.protos.link.api.ClientEventOuterClass$Performance DEFAULT_INSTANCE;
    private static volatile com.google.protobuf.Parser<com.plaid.internal.core.protos.link.api.ClientEventOuterClass$Performance> PARSER;

    public static final class NavigationTiming extends com.google.protobuf.GeneratedMessageLite<com.plaid.internal.core.protos.link.api.ClientEventOuterClass$Performance.NavigationTiming, com.plaid.internal.core.protos.link.api.ClientEventOuterClass.Performance.NavigationTiming.a> implements com.google.protobuf.MessageLiteOrBuilder {
        private static final com.plaid.internal.core.protos.link.api.ClientEventOuterClass$Performance.NavigationTiming DEFAULT_INSTANCE;
        public static final int DOM_COMPLETE_MS_FIELD_NUMBER = 5;
        public static final int DURATION_MS_FIELD_NUMBER = 6;
        private static volatile com.google.protobuf.Parser<com.plaid.internal.core.protos.link.api.ClientEventOuterClass$Performance.NavigationTiming> PARSER = null;
        public static final int REQUEST_START_MS_FIELD_NUMBER = 2;
        public static final int RESPONSE_END_MS_FIELD_NUMBER = 4;
        public static final int RESPONSE_START_MS_FIELD_NUMBER = 3;
        public static final int START_TIME_MS_FIELD_NUMBER = 1;
        private long domCompleteMs_;
        private long durationMs_;
        private long requestStartMs_;
        private long responseEndMs_;
        private long responseStartMs_;
        private long startTimeMs_;

        public static final class a extends com.google.protobuf.GeneratedMessageLite.Builder<com.plaid.internal.core.protos.link.api.ClientEventOuterClass$Performance.NavigationTiming, com.plaid.internal.core.protos.link.api.ClientEventOuterClass.Performance.NavigationTiming.a> implements com.google.protobuf.MessageLiteOrBuilder {
            public a() {
                super(com.plaid.internal.core.protos.link.api.ClientEventOuterClass$Performance.NavigationTiming.DEFAULT_INSTANCE);
            }
        }

        static {
            com.plaid.internal.core.protos.link.api.ClientEventOuterClass$Performance.NavigationTiming navigationTiming = new com.plaid.internal.core.protos.link.api.ClientEventOuterClass$Performance.NavigationTiming();
            DEFAULT_INSTANCE = navigationTiming;
            com.google.protobuf.GeneratedMessageLite.registerDefaultInstance(com.plaid.internal.core.protos.link.api.ClientEventOuterClass$Performance.NavigationTiming.class, navigationTiming);
        }

        private NavigationTiming() {
        }

        private void clearDomCompleteMs() {
            this.domCompleteMs_ = 0L;
        }

        private void clearDurationMs() {
            this.durationMs_ = 0L;
        }

        private void clearRequestStartMs() {
            this.requestStartMs_ = 0L;
        }

        private void clearResponseEndMs() {
            this.responseEndMs_ = 0L;
        }

        private void clearResponseStartMs() {
            this.responseStartMs_ = 0L;
        }

        private void clearStartTimeMs() {
            this.startTimeMs_ = 0L;
        }

        public static com.plaid.internal.core.protos.link.api.ClientEventOuterClass$Performance.NavigationTiming getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static com.plaid.internal.core.protos.link.api.ClientEventOuterClass.Performance.NavigationTiming.a newBuilder() {
            return DEFAULT_INSTANCE.createBuilder();
        }

        public static com.plaid.internal.core.protos.link.api.ClientEventOuterClass$Performance.NavigationTiming parseDelimitedFrom(java.io.InputStream inputStream) {
            return (com.plaid.internal.core.protos.link.api.ClientEventOuterClass$Performance.NavigationTiming) com.google.protobuf.GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static com.plaid.internal.core.protos.link.api.ClientEventOuterClass$Performance.NavigationTiming parseFrom(java.nio.ByteBuffer byteBuffer) {
            return (com.plaid.internal.core.protos.link.api.ClientEventOuterClass$Performance.NavigationTiming) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
        }

        public static com.google.protobuf.Parser<com.plaid.internal.core.protos.link.api.ClientEventOuterClass$Performance.NavigationTiming> parser() {
            return DEFAULT_INSTANCE.getParserForType();
        }

        private void setDomCompleteMs(long j) {
            this.domCompleteMs_ = j;
        }

        private void setDurationMs(long j) {
            this.durationMs_ = j;
        }

        private void setRequestStartMs(long j) {
            this.requestStartMs_ = j;
        }

        private void setResponseEndMs(long j) {
            this.responseEndMs_ = j;
        }

        private void setResponseStartMs(long j) {
            this.responseStartMs_ = j;
        }

        private void setStartTimeMs(long j) {
            this.startTimeMs_ = j;
        }

        @Override // com.google.protobuf.GeneratedMessageLite
        public final java.lang.Object dynamicMethod(com.google.protobuf.GeneratedMessageLite.MethodToInvoke methodToInvoke, java.lang.Object obj, java.lang.Object obj2) {
            com.google.protobuf.Parser parser;
            switch (com.plaid.internal.core.protos.link.api.b.f6081a[methodToInvoke.ordinal()]) {
                case 1:
                    return new com.plaid.internal.core.protos.link.api.ClientEventOuterClass$Performance.NavigationTiming();
                case 2:
                    return new com.plaid.internal.core.protos.link.api.ClientEventOuterClass.Performance.NavigationTiming.a();
                case 3:
                    return com.google.protobuf.GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0006\u0000\u0000\u0001\u0006\u0006\u0000\u0000\u0000\u0001\u0002\u0002\u0002\u0003\u0002\u0004\u0002\u0005\u0002\u0006\u0002", new java.lang.Object[]{"startTimeMs_", "requestStartMs_", "responseStartMs_", "responseEndMs_", "domCompleteMs_", "durationMs_"});
                case 4:
                    return DEFAULT_INSTANCE;
                case 5:
                    com.google.protobuf.Parser<com.plaid.internal.core.protos.link.api.ClientEventOuterClass$Performance.NavigationTiming> parser2 = PARSER;
                    if (parser2 != null) {
                        return parser2;
                    }
                    synchronized (com.plaid.internal.core.protos.link.api.ClientEventOuterClass$Performance.NavigationTiming.class) {
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

        public final long getDomCompleteMs() {
            return this.domCompleteMs_;
        }

        public final long getDurationMs() {
            return this.durationMs_;
        }

        public final long getRequestStartMs() {
            return this.requestStartMs_;
        }

        public final long getResponseEndMs() {
            return this.responseEndMs_;
        }

        public final long getResponseStartMs() {
            return this.responseStartMs_;
        }

        public final long getStartTimeMs() {
            return this.startTimeMs_;
        }

        public static com.plaid.internal.core.protos.link.api.ClientEventOuterClass.Performance.NavigationTiming.a newBuilder(com.plaid.internal.core.protos.link.api.ClientEventOuterClass$Performance.NavigationTiming navigationTiming) {
            return DEFAULT_INSTANCE.createBuilder(navigationTiming);
        }

        public static com.plaid.internal.core.protos.link.api.ClientEventOuterClass$Performance.NavigationTiming parseDelimitedFrom(java.io.InputStream inputStream, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) {
            return (com.plaid.internal.core.protos.link.api.ClientEventOuterClass$Performance.NavigationTiming) com.google.protobuf.GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
        }

        public static com.plaid.internal.core.protos.link.api.ClientEventOuterClass$Performance.NavigationTiming parseFrom(java.nio.ByteBuffer byteBuffer, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) {
            return (com.plaid.internal.core.protos.link.api.ClientEventOuterClass$Performance.NavigationTiming) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
        }

        public static com.plaid.internal.core.protos.link.api.ClientEventOuterClass$Performance.NavigationTiming parseFrom(com.google.protobuf.ByteString byteString) {
            return (com.plaid.internal.core.protos.link.api.ClientEventOuterClass$Performance.NavigationTiming) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
        }

        public static com.plaid.internal.core.protos.link.api.ClientEventOuterClass$Performance.NavigationTiming parseFrom(com.google.protobuf.ByteString byteString, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) {
            return (com.plaid.internal.core.protos.link.api.ClientEventOuterClass$Performance.NavigationTiming) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
        }

        public static com.plaid.internal.core.protos.link.api.ClientEventOuterClass$Performance.NavigationTiming parseFrom(byte[] bArr) {
            return (com.plaid.internal.core.protos.link.api.ClientEventOuterClass$Performance.NavigationTiming) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
        }

        public static com.plaid.internal.core.protos.link.api.ClientEventOuterClass$Performance.NavigationTiming parseFrom(byte[] bArr, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) {
            return (com.plaid.internal.core.protos.link.api.ClientEventOuterClass$Performance.NavigationTiming) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
        }

        public static com.plaid.internal.core.protos.link.api.ClientEventOuterClass$Performance.NavigationTiming parseFrom(java.io.InputStream inputStream) {
            return (com.plaid.internal.core.protos.link.api.ClientEventOuterClass$Performance.NavigationTiming) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static com.plaid.internal.core.protos.link.api.ClientEventOuterClass$Performance.NavigationTiming parseFrom(java.io.InputStream inputStream, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) {
            return (com.plaid.internal.core.protos.link.api.ClientEventOuterClass$Performance.NavigationTiming) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
        }

        public static com.plaid.internal.core.protos.link.api.ClientEventOuterClass$Performance.NavigationTiming parseFrom(com.google.protobuf.CodedInputStream codedInputStream) {
            return (com.plaid.internal.core.protos.link.api.ClientEventOuterClass$Performance.NavigationTiming) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
        }

        public static com.plaid.internal.core.protos.link.api.ClientEventOuterClass$Performance.NavigationTiming parseFrom(com.google.protobuf.CodedInputStream codedInputStream, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) {
            return (com.plaid.internal.core.protos.link.api.ClientEventOuterClass$Performance.NavigationTiming) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
        }
    }

    public static final class ResourceTiming extends com.google.protobuf.GeneratedMessageLite<com.plaid.internal.core.protos.link.api.ClientEventOuterClass$Performance.ResourceTiming, com.plaid.internal.core.protos.link.api.ClientEventOuterClass.Performance.ResourceTiming.a> implements com.google.protobuf.MessageLiteOrBuilder {
        private static final com.plaid.internal.core.protos.link.api.ClientEventOuterClass$Performance.ResourceTiming DEFAULT_INSTANCE;
        public static final int DURATION_MS_FIELD_NUMBER = 5;
        private static volatile com.google.protobuf.Parser<com.plaid.internal.core.protos.link.api.ClientEventOuterClass$Performance.ResourceTiming> PARSER = null;
        public static final int REQUEST_START_MS_FIELD_NUMBER = 2;
        public static final int RESPONSE_END_MS_FIELD_NUMBER = 4;
        public static final int RESPONSE_START_MS_FIELD_NUMBER = 3;
        public static final int START_TIME_MS_FIELD_NUMBER = 1;
        public static final int TRANSFER_SIZE_FIELD_NUMBER = 6;
        private long durationMs_;
        private long requestStartMs_;
        private long responseEndMs_;
        private long responseStartMs_;
        private long startTimeMs_;
        private long transferSize_;

        public static final class a extends com.google.protobuf.GeneratedMessageLite.Builder<com.plaid.internal.core.protos.link.api.ClientEventOuterClass$Performance.ResourceTiming, com.plaid.internal.core.protos.link.api.ClientEventOuterClass.Performance.ResourceTiming.a> implements com.google.protobuf.MessageLiteOrBuilder {
            public a() {
                super(com.plaid.internal.core.protos.link.api.ClientEventOuterClass$Performance.ResourceTiming.DEFAULT_INSTANCE);
            }
        }

        static {
            com.plaid.internal.core.protos.link.api.ClientEventOuterClass$Performance.ResourceTiming resourceTiming = new com.plaid.internal.core.protos.link.api.ClientEventOuterClass$Performance.ResourceTiming();
            DEFAULT_INSTANCE = resourceTiming;
            com.google.protobuf.GeneratedMessageLite.registerDefaultInstance(com.plaid.internal.core.protos.link.api.ClientEventOuterClass$Performance.ResourceTiming.class, resourceTiming);
        }

        private ResourceTiming() {
        }

        private void clearDurationMs() {
            this.durationMs_ = 0L;
        }

        private void clearRequestStartMs() {
            this.requestStartMs_ = 0L;
        }

        private void clearResponseEndMs() {
            this.responseEndMs_ = 0L;
        }

        private void clearResponseStartMs() {
            this.responseStartMs_ = 0L;
        }

        private void clearStartTimeMs() {
            this.startTimeMs_ = 0L;
        }

        private void clearTransferSize() {
            this.transferSize_ = 0L;
        }

        public static com.plaid.internal.core.protos.link.api.ClientEventOuterClass$Performance.ResourceTiming getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static com.plaid.internal.core.protos.link.api.ClientEventOuterClass.Performance.ResourceTiming.a newBuilder() {
            return DEFAULT_INSTANCE.createBuilder();
        }

        public static com.plaid.internal.core.protos.link.api.ClientEventOuterClass$Performance.ResourceTiming parseDelimitedFrom(java.io.InputStream inputStream) {
            return (com.plaid.internal.core.protos.link.api.ClientEventOuterClass$Performance.ResourceTiming) com.google.protobuf.GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static com.plaid.internal.core.protos.link.api.ClientEventOuterClass$Performance.ResourceTiming parseFrom(java.nio.ByteBuffer byteBuffer) {
            return (com.plaid.internal.core.protos.link.api.ClientEventOuterClass$Performance.ResourceTiming) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
        }

        public static com.google.protobuf.Parser<com.plaid.internal.core.protos.link.api.ClientEventOuterClass$Performance.ResourceTiming> parser() {
            return DEFAULT_INSTANCE.getParserForType();
        }

        private void setDurationMs(long j) {
            this.durationMs_ = j;
        }

        private void setRequestStartMs(long j) {
            this.requestStartMs_ = j;
        }

        private void setResponseEndMs(long j) {
            this.responseEndMs_ = j;
        }

        private void setResponseStartMs(long j) {
            this.responseStartMs_ = j;
        }

        private void setStartTimeMs(long j) {
            this.startTimeMs_ = j;
        }

        private void setTransferSize(long j) {
            this.transferSize_ = j;
        }

        @Override // com.google.protobuf.GeneratedMessageLite
        public final java.lang.Object dynamicMethod(com.google.protobuf.GeneratedMessageLite.MethodToInvoke methodToInvoke, java.lang.Object obj, java.lang.Object obj2) {
            com.google.protobuf.Parser parser;
            switch (com.plaid.internal.core.protos.link.api.b.f6081a[methodToInvoke.ordinal()]) {
                case 1:
                    return new com.plaid.internal.core.protos.link.api.ClientEventOuterClass$Performance.ResourceTiming();
                case 2:
                    return new com.plaid.internal.core.protos.link.api.ClientEventOuterClass.Performance.ResourceTiming.a();
                case 3:
                    return com.google.protobuf.GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0006\u0000\u0000\u0001\u0006\u0006\u0000\u0000\u0000\u0001\u0002\u0002\u0002\u0003\u0002\u0004\u0002\u0005\u0002\u0006\u0002", new java.lang.Object[]{"startTimeMs_", "requestStartMs_", "responseStartMs_", "responseEndMs_", "durationMs_", "transferSize_"});
                case 4:
                    return DEFAULT_INSTANCE;
                case 5:
                    com.google.protobuf.Parser<com.plaid.internal.core.protos.link.api.ClientEventOuterClass$Performance.ResourceTiming> parser2 = PARSER;
                    if (parser2 != null) {
                        return parser2;
                    }
                    synchronized (com.plaid.internal.core.protos.link.api.ClientEventOuterClass$Performance.ResourceTiming.class) {
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

        public final long getDurationMs() {
            return this.durationMs_;
        }

        public final long getRequestStartMs() {
            return this.requestStartMs_;
        }

        public final long getResponseEndMs() {
            return this.responseEndMs_;
        }

        public final long getResponseStartMs() {
            return this.responseStartMs_;
        }

        public final long getStartTimeMs() {
            return this.startTimeMs_;
        }

        public final long getTransferSize() {
            return this.transferSize_;
        }

        public static com.plaid.internal.core.protos.link.api.ClientEventOuterClass.Performance.ResourceTiming.a newBuilder(com.plaid.internal.core.protos.link.api.ClientEventOuterClass$Performance.ResourceTiming resourceTiming) {
            return DEFAULT_INSTANCE.createBuilder(resourceTiming);
        }

        public static com.plaid.internal.core.protos.link.api.ClientEventOuterClass$Performance.ResourceTiming parseDelimitedFrom(java.io.InputStream inputStream, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) {
            return (com.plaid.internal.core.protos.link.api.ClientEventOuterClass$Performance.ResourceTiming) com.google.protobuf.GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
        }

        public static com.plaid.internal.core.protos.link.api.ClientEventOuterClass$Performance.ResourceTiming parseFrom(java.nio.ByteBuffer byteBuffer, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) {
            return (com.plaid.internal.core.protos.link.api.ClientEventOuterClass$Performance.ResourceTiming) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
        }

        public static com.plaid.internal.core.protos.link.api.ClientEventOuterClass$Performance.ResourceTiming parseFrom(com.google.protobuf.ByteString byteString) {
            return (com.plaid.internal.core.protos.link.api.ClientEventOuterClass$Performance.ResourceTiming) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
        }

        public static com.plaid.internal.core.protos.link.api.ClientEventOuterClass$Performance.ResourceTiming parseFrom(com.google.protobuf.ByteString byteString, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) {
            return (com.plaid.internal.core.protos.link.api.ClientEventOuterClass$Performance.ResourceTiming) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
        }

        public static com.plaid.internal.core.protos.link.api.ClientEventOuterClass$Performance.ResourceTiming parseFrom(byte[] bArr) {
            return (com.plaid.internal.core.protos.link.api.ClientEventOuterClass$Performance.ResourceTiming) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
        }

        public static com.plaid.internal.core.protos.link.api.ClientEventOuterClass$Performance.ResourceTiming parseFrom(byte[] bArr, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) {
            return (com.plaid.internal.core.protos.link.api.ClientEventOuterClass$Performance.ResourceTiming) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
        }

        public static com.plaid.internal.core.protos.link.api.ClientEventOuterClass$Performance.ResourceTiming parseFrom(java.io.InputStream inputStream) {
            return (com.plaid.internal.core.protos.link.api.ClientEventOuterClass$Performance.ResourceTiming) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static com.plaid.internal.core.protos.link.api.ClientEventOuterClass$Performance.ResourceTiming parseFrom(java.io.InputStream inputStream, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) {
            return (com.plaid.internal.core.protos.link.api.ClientEventOuterClass$Performance.ResourceTiming) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
        }

        public static com.plaid.internal.core.protos.link.api.ClientEventOuterClass$Performance.ResourceTiming parseFrom(com.google.protobuf.CodedInputStream codedInputStream) {
            return (com.plaid.internal.core.protos.link.api.ClientEventOuterClass$Performance.ResourceTiming) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
        }

        public static com.plaid.internal.core.protos.link.api.ClientEventOuterClass$Performance.ResourceTiming parseFrom(com.google.protobuf.CodedInputStream codedInputStream, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) {
            return (com.plaid.internal.core.protos.link.api.ClientEventOuterClass$Performance.ResourceTiming) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
        }
    }

    public static final class a extends com.google.protobuf.GeneratedMessageLite.Builder<com.plaid.internal.core.protos.link.api.ClientEventOuterClass$Performance, com.plaid.internal.core.protos.link.api.ClientEventOuterClass$Performance.a> implements com.google.protobuf.MessageLiteOrBuilder {
        public a() {
            super(com.plaid.internal.core.protos.link.api.ClientEventOuterClass$Performance.DEFAULT_INSTANCE);
        }
    }

    static {
        com.plaid.internal.core.protos.link.api.ClientEventOuterClass$Performance clientEventOuterClass$Performance = new com.plaid.internal.core.protos.link.api.ClientEventOuterClass$Performance();
        DEFAULT_INSTANCE = clientEventOuterClass$Performance;
        com.google.protobuf.GeneratedMessageLite.registerDefaultInstance(com.plaid.internal.core.protos.link.api.ClientEventOuterClass$Performance.class, clientEventOuterClass$Performance);
    }

    private ClientEventOuterClass$Performance() {
    }

    public static com.plaid.internal.core.protos.link.api.ClientEventOuterClass$Performance getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static com.plaid.internal.core.protos.link.api.ClientEventOuterClass$Performance.a newBuilder() {
        return DEFAULT_INSTANCE.createBuilder();
    }

    public static com.plaid.internal.core.protos.link.api.ClientEventOuterClass$Performance parseDelimitedFrom(java.io.InputStream inputStream) {
        return (com.plaid.internal.core.protos.link.api.ClientEventOuterClass$Performance) com.google.protobuf.GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static com.plaid.internal.core.protos.link.api.ClientEventOuterClass$Performance parseFrom(java.nio.ByteBuffer byteBuffer) {
        return (com.plaid.internal.core.protos.link.api.ClientEventOuterClass$Performance) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static com.google.protobuf.Parser<com.plaid.internal.core.protos.link.api.ClientEventOuterClass$Performance> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    @Override // com.google.protobuf.GeneratedMessageLite
    public final java.lang.Object dynamicMethod(com.google.protobuf.GeneratedMessageLite.MethodToInvoke methodToInvoke, java.lang.Object obj, java.lang.Object obj2) {
        com.google.protobuf.Parser parser;
        switch (com.plaid.internal.core.protos.link.api.b.f6081a[methodToInvoke.ordinal()]) {
            case 1:
                return new com.plaid.internal.core.protos.link.api.ClientEventOuterClass$Performance();
            case 2:
                return new com.plaid.internal.core.protos.link.api.ClientEventOuterClass$Performance.a();
            case 3:
                return com.google.protobuf.GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0000", null);
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                com.google.protobuf.Parser<com.plaid.internal.core.protos.link.api.ClientEventOuterClass$Performance> parser2 = PARSER;
                if (parser2 != null) {
                    return parser2;
                }
                synchronized (com.plaid.internal.core.protos.link.api.ClientEventOuterClass$Performance.class) {
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

    public static com.plaid.internal.core.protos.link.api.ClientEventOuterClass$Performance.a newBuilder(com.plaid.internal.core.protos.link.api.ClientEventOuterClass$Performance clientEventOuterClass$Performance) {
        return DEFAULT_INSTANCE.createBuilder(clientEventOuterClass$Performance);
    }

    public static com.plaid.internal.core.protos.link.api.ClientEventOuterClass$Performance parseDelimitedFrom(java.io.InputStream inputStream, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) {
        return (com.plaid.internal.core.protos.link.api.ClientEventOuterClass$Performance) com.google.protobuf.GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static com.plaid.internal.core.protos.link.api.ClientEventOuterClass$Performance parseFrom(java.nio.ByteBuffer byteBuffer, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) {
        return (com.plaid.internal.core.protos.link.api.ClientEventOuterClass$Performance) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
    }

    public static com.plaid.internal.core.protos.link.api.ClientEventOuterClass$Performance parseFrom(com.google.protobuf.ByteString byteString) {
        return (com.plaid.internal.core.protos.link.api.ClientEventOuterClass$Performance) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
    }

    public static com.plaid.internal.core.protos.link.api.ClientEventOuterClass$Performance parseFrom(com.google.protobuf.ByteString byteString, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) {
        return (com.plaid.internal.core.protos.link.api.ClientEventOuterClass$Performance) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
    }

    public static com.plaid.internal.core.protos.link.api.ClientEventOuterClass$Performance parseFrom(byte[] bArr) {
        return (com.plaid.internal.core.protos.link.api.ClientEventOuterClass$Performance) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static com.plaid.internal.core.protos.link.api.ClientEventOuterClass$Performance parseFrom(byte[] bArr, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) {
        return (com.plaid.internal.core.protos.link.api.ClientEventOuterClass$Performance) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
    }

    public static com.plaid.internal.core.protos.link.api.ClientEventOuterClass$Performance parseFrom(java.io.InputStream inputStream) {
        return (com.plaid.internal.core.protos.link.api.ClientEventOuterClass$Performance) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static com.plaid.internal.core.protos.link.api.ClientEventOuterClass$Performance parseFrom(java.io.InputStream inputStream, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) {
        return (com.plaid.internal.core.protos.link.api.ClientEventOuterClass$Performance) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static com.plaid.internal.core.protos.link.api.ClientEventOuterClass$Performance parseFrom(com.google.protobuf.CodedInputStream codedInputStream) {
        return (com.plaid.internal.core.protos.link.api.ClientEventOuterClass$Performance) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
    }

    public static com.plaid.internal.core.protos.link.api.ClientEventOuterClass$Performance parseFrom(com.google.protobuf.CodedInputStream codedInputStream, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) {
        return (com.plaid.internal.core.protos.link.api.ClientEventOuterClass$Performance) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
    }
}
