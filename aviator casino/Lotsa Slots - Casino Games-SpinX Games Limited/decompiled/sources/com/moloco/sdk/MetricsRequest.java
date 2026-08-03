package com.moloco.sdk;

/* loaded from: classes5.dex */
public final class MetricsRequest {

    public interface PostMetricsRequestOrBuilder extends com.google.protobuf.MessageLiteOrBuilder {
        com.moloco.sdk.MetricsRequest.PostMetricsRequest.CountEvent getCounts(int i);

        int getCountsCount();

        java.util.List<com.moloco.sdk.MetricsRequest.PostMetricsRequest.CountEvent> getCountsList();

        com.moloco.sdk.MetricsRequest.PostMetricsRequest.TimerEvent getDurations(int i);

        int getDurationsCount();

        java.util.List<com.moloco.sdk.MetricsRequest.PostMetricsRequest.TimerEvent> getDurationsList();
    }

    public interface SDKInitFailureTrackingRequestOrBuilder extends com.google.protobuf.MessageLiteOrBuilder {
        com.moloco.sdk.MetricsRequest.SDKInitFailureTrackingRequest.ClientError getClientError();

        com.moloco.sdk.MetricsRequest.SDKInitFailureTrackingRequest.ErrorTypeCase getErrorTypeCase();

        com.moloco.sdk.MetricsRequest.SDKInitFailureTrackingRequest.ServerError getServerError();

        boolean hasClientError();

        boolean hasServerError();
    }

    public interface SDKInitSuccessTrackingRequestOrBuilder extends com.google.protobuf.MessageLiteOrBuilder {
    }

    public interface SDKInitTrackingRequestOrBuilder extends com.google.protobuf.MessageLiteOrBuilder {
        com.moloco.sdk.MetricsRequest.SDKInitFailureTrackingRequest getFailure();

        com.moloco.sdk.MetricsRequest.SDKInitTrackingRequest.InitStatusCase getInitStatusCase();

        long getLatencyMs();

        com.moloco.sdk.MetricsRequest.SDKInitSuccessTrackingRequest getSuccess();

        boolean hasFailure();

        boolean hasLatencyMs();

        boolean hasSuccess();
    }

    public interface SDKInitTrackingResponseOrBuilder extends com.google.protobuf.MessageLiteOrBuilder {
    }

    public static void registerAllExtensions(com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) {
    }

    private MetricsRequest() {
    }

    public static final class PostMetricsRequest extends com.google.protobuf.GeneratedMessageLite<com.moloco.sdk.MetricsRequest.PostMetricsRequest, com.moloco.sdk.MetricsRequest.PostMetricsRequest.Builder> implements com.moloco.sdk.MetricsRequest.PostMetricsRequestOrBuilder {
        public static final int COUNTS_FIELD_NUMBER = 1;
        private static final com.moloco.sdk.MetricsRequest.PostMetricsRequest DEFAULT_INSTANCE;
        public static final int DURATIONS_FIELD_NUMBER = 2;
        private static volatile com.google.protobuf.Parser<com.moloco.sdk.MetricsRequest.PostMetricsRequest> PARSER;
        private com.google.protobuf.Internal.ProtobufList<com.moloco.sdk.MetricsRequest.PostMetricsRequest.CountEvent> counts_ = emptyProtobufList();
        private com.google.protobuf.Internal.ProtobufList<com.moloco.sdk.MetricsRequest.PostMetricsRequest.TimerEvent> durations_ = emptyProtobufList();

        public interface CountEventOrBuilder extends com.google.protobuf.MessageLiteOrBuilder {
            int getCount();

            java.lang.String getName();

            com.google.protobuf.ByteString getNameBytes();

            java.lang.String getTags(int i);

            com.google.protobuf.ByteString getTagsBytes(int i);

            int getTagsCount();

            java.util.List<java.lang.String> getTagsList();
        }

        public interface TimerEventOrBuilder extends com.google.protobuf.MessageLiteOrBuilder {
            long getElapsedTimeMillis();

            java.lang.String getName();

            com.google.protobuf.ByteString getNameBytes();

            java.lang.String getTags(int i);

            com.google.protobuf.ByteString getTagsBytes(int i);

            int getTagsCount();

            java.util.List<java.lang.String> getTagsList();
        }

        private PostMetricsRequest() {
        }

        public static final class CountEvent extends com.google.protobuf.GeneratedMessageLite<com.moloco.sdk.MetricsRequest.PostMetricsRequest.CountEvent, com.moloco.sdk.MetricsRequest.PostMetricsRequest.CountEvent.Builder> implements com.moloco.sdk.MetricsRequest.PostMetricsRequest.CountEventOrBuilder {
            public static final int COUNT_FIELD_NUMBER = 2;
            private static final com.moloco.sdk.MetricsRequest.PostMetricsRequest.CountEvent DEFAULT_INSTANCE;
            public static final int NAME_FIELD_NUMBER = 1;
            private static volatile com.google.protobuf.Parser<com.moloco.sdk.MetricsRequest.PostMetricsRequest.CountEvent> PARSER = null;
            public static final int TAGS_FIELD_NUMBER = 3;
            private int count_;
            private java.lang.String name_ = "";
            private com.google.protobuf.Internal.ProtobufList<java.lang.String> tags_ = com.google.protobuf.GeneratedMessageLite.emptyProtobufList();

            private CountEvent() {
            }

            @Override // com.moloco.sdk.MetricsRequest.PostMetricsRequest.CountEventOrBuilder
            public java.lang.String getName() {
                return this.name_;
            }

            @Override // com.moloco.sdk.MetricsRequest.PostMetricsRequest.CountEventOrBuilder
            public com.google.protobuf.ByteString getNameBytes() {
                return com.google.protobuf.ByteString.copyFromUtf8(this.name_);
            }

            /* JADX INFO: Access modifiers changed from: private */
            public void setName(java.lang.String str) {
                str.getClass();
                this.name_ = str;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public void clearName() {
                this.name_ = getDefaultInstance().getName();
            }

            /* JADX INFO: Access modifiers changed from: private */
            public void setNameBytes(com.google.protobuf.ByteString byteString) {
                checkByteStringIsUtf8(byteString);
                this.name_ = byteString.toStringUtf8();
            }

            @Override // com.moloco.sdk.MetricsRequest.PostMetricsRequest.CountEventOrBuilder
            public int getCount() {
                return this.count_;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public void setCount(int i) {
                this.count_ = i;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public void clearCount() {
                this.count_ = 0;
            }

            @Override // com.moloco.sdk.MetricsRequest.PostMetricsRequest.CountEventOrBuilder
            public java.util.List<java.lang.String> getTagsList() {
                return this.tags_;
            }

            @Override // com.moloco.sdk.MetricsRequest.PostMetricsRequest.CountEventOrBuilder
            public int getTagsCount() {
                return this.tags_.size();
            }

            @Override // com.moloco.sdk.MetricsRequest.PostMetricsRequest.CountEventOrBuilder
            public java.lang.String getTags(int i) {
                return this.tags_.get(i);
            }

            @Override // com.moloco.sdk.MetricsRequest.PostMetricsRequest.CountEventOrBuilder
            public com.google.protobuf.ByteString getTagsBytes(int i) {
                return com.google.protobuf.ByteString.copyFromUtf8(this.tags_.get(i));
            }

            private void ensureTagsIsMutable() {
                com.google.protobuf.Internal.ProtobufList<java.lang.String> protobufList = this.tags_;
                if (protobufList.isModifiable()) {
                    return;
                }
                this.tags_ = com.google.protobuf.GeneratedMessageLite.mutableCopy(protobufList);
            }

            /* JADX INFO: Access modifiers changed from: private */
            public void setTags(int i, java.lang.String str) {
                str.getClass();
                ensureTagsIsMutable();
                this.tags_.set(i, str);
            }

            /* JADX INFO: Access modifiers changed from: private */
            public void addTags(java.lang.String str) {
                str.getClass();
                ensureTagsIsMutable();
                this.tags_.add(str);
            }

            /* JADX INFO: Access modifiers changed from: private */
            public void addAllTags(java.lang.Iterable<java.lang.String> iterable) {
                ensureTagsIsMutable();
                com.google.protobuf.AbstractMessageLite.addAll((java.lang.Iterable) iterable, (java.util.List) this.tags_);
            }

            /* JADX INFO: Access modifiers changed from: private */
            public void clearTags() {
                this.tags_ = com.google.protobuf.GeneratedMessageLite.emptyProtobufList();
            }

            /* JADX INFO: Access modifiers changed from: private */
            public void addTagsBytes(com.google.protobuf.ByteString byteString) {
                checkByteStringIsUtf8(byteString);
                ensureTagsIsMutable();
                this.tags_.add(byteString.toStringUtf8());
            }

            public static com.moloco.sdk.MetricsRequest.PostMetricsRequest.CountEvent parseFrom(java.nio.ByteBuffer byteBuffer) throws com.google.protobuf.InvalidProtocolBufferException {
                return (com.moloco.sdk.MetricsRequest.PostMetricsRequest.CountEvent) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
            }

            public static com.moloco.sdk.MetricsRequest.PostMetricsRequest.CountEvent parseFrom(java.nio.ByteBuffer byteBuffer, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) throws com.google.protobuf.InvalidProtocolBufferException {
                return (com.moloco.sdk.MetricsRequest.PostMetricsRequest.CountEvent) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
            }

            public static com.moloco.sdk.MetricsRequest.PostMetricsRequest.CountEvent parseFrom(com.google.protobuf.ByteString byteString) throws com.google.protobuf.InvalidProtocolBufferException {
                return (com.moloco.sdk.MetricsRequest.PostMetricsRequest.CountEvent) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
            }

            public static com.moloco.sdk.MetricsRequest.PostMetricsRequest.CountEvent parseFrom(com.google.protobuf.ByteString byteString, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) throws com.google.protobuf.InvalidProtocolBufferException {
                return (com.moloco.sdk.MetricsRequest.PostMetricsRequest.CountEvent) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
            }

            public static com.moloco.sdk.MetricsRequest.PostMetricsRequest.CountEvent parseFrom(byte[] bArr) throws com.google.protobuf.InvalidProtocolBufferException {
                return (com.moloco.sdk.MetricsRequest.PostMetricsRequest.CountEvent) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
            }

            public static com.moloco.sdk.MetricsRequest.PostMetricsRequest.CountEvent parseFrom(byte[] bArr, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) throws com.google.protobuf.InvalidProtocolBufferException {
                return (com.moloco.sdk.MetricsRequest.PostMetricsRequest.CountEvent) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
            }

            public static com.moloco.sdk.MetricsRequest.PostMetricsRequest.CountEvent parseFrom(java.io.InputStream inputStream) throws java.io.IOException {
                return (com.moloco.sdk.MetricsRequest.PostMetricsRequest.CountEvent) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
            }

            public static com.moloco.sdk.MetricsRequest.PostMetricsRequest.CountEvent parseFrom(java.io.InputStream inputStream, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) throws java.io.IOException {
                return (com.moloco.sdk.MetricsRequest.PostMetricsRequest.CountEvent) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
            }

            public static com.moloco.sdk.MetricsRequest.PostMetricsRequest.CountEvent parseDelimitedFrom(java.io.InputStream inputStream) throws java.io.IOException {
                return (com.moloco.sdk.MetricsRequest.PostMetricsRequest.CountEvent) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
            }

            public static com.moloco.sdk.MetricsRequest.PostMetricsRequest.CountEvent parseDelimitedFrom(java.io.InputStream inputStream, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) throws java.io.IOException {
                return (com.moloco.sdk.MetricsRequest.PostMetricsRequest.CountEvent) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
            }

            public static com.moloco.sdk.MetricsRequest.PostMetricsRequest.CountEvent parseFrom(com.google.protobuf.CodedInputStream codedInputStream) throws java.io.IOException {
                return (com.moloco.sdk.MetricsRequest.PostMetricsRequest.CountEvent) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
            }

            public static com.moloco.sdk.MetricsRequest.PostMetricsRequest.CountEvent parseFrom(com.google.protobuf.CodedInputStream codedInputStream, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) throws java.io.IOException {
                return (com.moloco.sdk.MetricsRequest.PostMetricsRequest.CountEvent) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
            }

            public static com.moloco.sdk.MetricsRequest.PostMetricsRequest.CountEvent.Builder newBuilder() {
                return DEFAULT_INSTANCE.createBuilder();
            }

            public static com.moloco.sdk.MetricsRequest.PostMetricsRequest.CountEvent.Builder newBuilder(com.moloco.sdk.MetricsRequest.PostMetricsRequest.CountEvent countEvent) {
                return DEFAULT_INSTANCE.createBuilder(countEvent);
            }

            public static final class Builder extends com.google.protobuf.GeneratedMessageLite.Builder<com.moloco.sdk.MetricsRequest.PostMetricsRequest.CountEvent, com.moloco.sdk.MetricsRequest.PostMetricsRequest.CountEvent.Builder> implements com.moloco.sdk.MetricsRequest.PostMetricsRequest.CountEventOrBuilder {
                private Builder() {
                    super(com.moloco.sdk.MetricsRequest.PostMetricsRequest.CountEvent.DEFAULT_INSTANCE);
                }

                @Override // com.moloco.sdk.MetricsRequest.PostMetricsRequest.CountEventOrBuilder
                public java.lang.String getName() {
                    return ((com.moloco.sdk.MetricsRequest.PostMetricsRequest.CountEvent) this.instance).getName();
                }

                @Override // com.moloco.sdk.MetricsRequest.PostMetricsRequest.CountEventOrBuilder
                public com.google.protobuf.ByteString getNameBytes() {
                    return ((com.moloco.sdk.MetricsRequest.PostMetricsRequest.CountEvent) this.instance).getNameBytes();
                }

                public com.moloco.sdk.MetricsRequest.PostMetricsRequest.CountEvent.Builder setName(java.lang.String str) {
                    copyOnWrite();
                    ((com.moloco.sdk.MetricsRequest.PostMetricsRequest.CountEvent) this.instance).setName(str);
                    return this;
                }

                public com.moloco.sdk.MetricsRequest.PostMetricsRequest.CountEvent.Builder clearName() {
                    copyOnWrite();
                    ((com.moloco.sdk.MetricsRequest.PostMetricsRequest.CountEvent) this.instance).clearName();
                    return this;
                }

                public com.moloco.sdk.MetricsRequest.PostMetricsRequest.CountEvent.Builder setNameBytes(com.google.protobuf.ByteString byteString) {
                    copyOnWrite();
                    ((com.moloco.sdk.MetricsRequest.PostMetricsRequest.CountEvent) this.instance).setNameBytes(byteString);
                    return this;
                }

                @Override // com.moloco.sdk.MetricsRequest.PostMetricsRequest.CountEventOrBuilder
                public int getCount() {
                    return ((com.moloco.sdk.MetricsRequest.PostMetricsRequest.CountEvent) this.instance).getCount();
                }

                public com.moloco.sdk.MetricsRequest.PostMetricsRequest.CountEvent.Builder setCount(int i) {
                    copyOnWrite();
                    ((com.moloco.sdk.MetricsRequest.PostMetricsRequest.CountEvent) this.instance).setCount(i);
                    return this;
                }

                public com.moloco.sdk.MetricsRequest.PostMetricsRequest.CountEvent.Builder clearCount() {
                    copyOnWrite();
                    ((com.moloco.sdk.MetricsRequest.PostMetricsRequest.CountEvent) this.instance).clearCount();
                    return this;
                }

                @Override // com.moloco.sdk.MetricsRequest.PostMetricsRequest.CountEventOrBuilder
                public java.util.List<java.lang.String> getTagsList() {
                    return java.util.Collections.unmodifiableList(((com.moloco.sdk.MetricsRequest.PostMetricsRequest.CountEvent) this.instance).getTagsList());
                }

                @Override // com.moloco.sdk.MetricsRequest.PostMetricsRequest.CountEventOrBuilder
                public int getTagsCount() {
                    return ((com.moloco.sdk.MetricsRequest.PostMetricsRequest.CountEvent) this.instance).getTagsCount();
                }

                @Override // com.moloco.sdk.MetricsRequest.PostMetricsRequest.CountEventOrBuilder
                public java.lang.String getTags(int i) {
                    return ((com.moloco.sdk.MetricsRequest.PostMetricsRequest.CountEvent) this.instance).getTags(i);
                }

                @Override // com.moloco.sdk.MetricsRequest.PostMetricsRequest.CountEventOrBuilder
                public com.google.protobuf.ByteString getTagsBytes(int i) {
                    return ((com.moloco.sdk.MetricsRequest.PostMetricsRequest.CountEvent) this.instance).getTagsBytes(i);
                }

                public com.moloco.sdk.MetricsRequest.PostMetricsRequest.CountEvent.Builder setTags(int i, java.lang.String str) {
                    copyOnWrite();
                    ((com.moloco.sdk.MetricsRequest.PostMetricsRequest.CountEvent) this.instance).setTags(i, str);
                    return this;
                }

                public com.moloco.sdk.MetricsRequest.PostMetricsRequest.CountEvent.Builder addTags(java.lang.String str) {
                    copyOnWrite();
                    ((com.moloco.sdk.MetricsRequest.PostMetricsRequest.CountEvent) this.instance).addTags(str);
                    return this;
                }

                public com.moloco.sdk.MetricsRequest.PostMetricsRequest.CountEvent.Builder addAllTags(java.lang.Iterable<java.lang.String> iterable) {
                    copyOnWrite();
                    ((com.moloco.sdk.MetricsRequest.PostMetricsRequest.CountEvent) this.instance).addAllTags(iterable);
                    return this;
                }

                public com.moloco.sdk.MetricsRequest.PostMetricsRequest.CountEvent.Builder clearTags() {
                    copyOnWrite();
                    ((com.moloco.sdk.MetricsRequest.PostMetricsRequest.CountEvent) this.instance).clearTags();
                    return this;
                }

                public com.moloco.sdk.MetricsRequest.PostMetricsRequest.CountEvent.Builder addTagsBytes(com.google.protobuf.ByteString byteString) {
                    copyOnWrite();
                    ((com.moloco.sdk.MetricsRequest.PostMetricsRequest.CountEvent) this.instance).addTagsBytes(byteString);
                    return this;
                }
            }

            @Override // com.google.protobuf.GeneratedMessageLite
            protected final java.lang.Object dynamicMethod(com.google.protobuf.GeneratedMessageLite.MethodToInvoke methodToInvoke, java.lang.Object obj, java.lang.Object obj2) {
                switch (com.moloco.sdk.MetricsRequest.AnonymousClass1.$SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke[methodToInvoke.ordinal()]) {
                    case 1:
                        return new com.moloco.sdk.MetricsRequest.PostMetricsRequest.CountEvent();
                    case 2:
                        return new com.moloco.sdk.MetricsRequest.PostMetricsRequest.CountEvent.Builder();
                    case 3:
                        return newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0001\u0000\u0001Ȉ\u0002\u000b\u0003Ț", new java.lang.Object[]{"name_", "count_", "tags_"});
                    case 4:
                        return DEFAULT_INSTANCE;
                    case 5:
                        com.google.protobuf.Parser<com.moloco.sdk.MetricsRequest.PostMetricsRequest.CountEvent> parser = PARSER;
                        if (parser == null) {
                            synchronized (com.moloco.sdk.MetricsRequest.PostMetricsRequest.CountEvent.class) {
                                parser = PARSER;
                                if (parser == null) {
                                    parser = new com.google.protobuf.GeneratedMessageLite.DefaultInstanceBasedParser<>(DEFAULT_INSTANCE);
                                    PARSER = parser;
                                }
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

            static {
                com.moloco.sdk.MetricsRequest.PostMetricsRequest.CountEvent countEvent = new com.moloco.sdk.MetricsRequest.PostMetricsRequest.CountEvent();
                DEFAULT_INSTANCE = countEvent;
                com.google.protobuf.GeneratedMessageLite.registerDefaultInstance(com.moloco.sdk.MetricsRequest.PostMetricsRequest.CountEvent.class, countEvent);
            }

            public static com.moloco.sdk.MetricsRequest.PostMetricsRequest.CountEvent getDefaultInstance() {
                return DEFAULT_INSTANCE;
            }

            public static com.google.protobuf.Parser<com.moloco.sdk.MetricsRequest.PostMetricsRequest.CountEvent> parser() {
                return DEFAULT_INSTANCE.getParserForType();
            }
        }

        public static final class TimerEvent extends com.google.protobuf.GeneratedMessageLite<com.moloco.sdk.MetricsRequest.PostMetricsRequest.TimerEvent, com.moloco.sdk.MetricsRequest.PostMetricsRequest.TimerEvent.Builder> implements com.moloco.sdk.MetricsRequest.PostMetricsRequest.TimerEventOrBuilder {
            private static final com.moloco.sdk.MetricsRequest.PostMetricsRequest.TimerEvent DEFAULT_INSTANCE;
            public static final int ELAPSED_TIME_MILLIS_FIELD_NUMBER = 2;
            public static final int NAME_FIELD_NUMBER = 1;
            private static volatile com.google.protobuf.Parser<com.moloco.sdk.MetricsRequest.PostMetricsRequest.TimerEvent> PARSER = null;
            public static final int TAGS_FIELD_NUMBER = 3;
            private long elapsedTimeMillis_;
            private java.lang.String name_ = "";
            private com.google.protobuf.Internal.ProtobufList<java.lang.String> tags_ = com.google.protobuf.GeneratedMessageLite.emptyProtobufList();

            private TimerEvent() {
            }

            @Override // com.moloco.sdk.MetricsRequest.PostMetricsRequest.TimerEventOrBuilder
            public java.lang.String getName() {
                return this.name_;
            }

            @Override // com.moloco.sdk.MetricsRequest.PostMetricsRequest.TimerEventOrBuilder
            public com.google.protobuf.ByteString getNameBytes() {
                return com.google.protobuf.ByteString.copyFromUtf8(this.name_);
            }

            /* JADX INFO: Access modifiers changed from: private */
            public void setName(java.lang.String str) {
                str.getClass();
                this.name_ = str;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public void clearName() {
                this.name_ = getDefaultInstance().getName();
            }

            /* JADX INFO: Access modifiers changed from: private */
            public void setNameBytes(com.google.protobuf.ByteString byteString) {
                checkByteStringIsUtf8(byteString);
                this.name_ = byteString.toStringUtf8();
            }

            @Override // com.moloco.sdk.MetricsRequest.PostMetricsRequest.TimerEventOrBuilder
            public long getElapsedTimeMillis() {
                return this.elapsedTimeMillis_;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public void setElapsedTimeMillis(long j) {
                this.elapsedTimeMillis_ = j;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public void clearElapsedTimeMillis() {
                this.elapsedTimeMillis_ = 0L;
            }

            @Override // com.moloco.sdk.MetricsRequest.PostMetricsRequest.TimerEventOrBuilder
            public java.util.List<java.lang.String> getTagsList() {
                return this.tags_;
            }

            @Override // com.moloco.sdk.MetricsRequest.PostMetricsRequest.TimerEventOrBuilder
            public int getTagsCount() {
                return this.tags_.size();
            }

            @Override // com.moloco.sdk.MetricsRequest.PostMetricsRequest.TimerEventOrBuilder
            public java.lang.String getTags(int i) {
                return this.tags_.get(i);
            }

            @Override // com.moloco.sdk.MetricsRequest.PostMetricsRequest.TimerEventOrBuilder
            public com.google.protobuf.ByteString getTagsBytes(int i) {
                return com.google.protobuf.ByteString.copyFromUtf8(this.tags_.get(i));
            }

            private void ensureTagsIsMutable() {
                com.google.protobuf.Internal.ProtobufList<java.lang.String> protobufList = this.tags_;
                if (protobufList.isModifiable()) {
                    return;
                }
                this.tags_ = com.google.protobuf.GeneratedMessageLite.mutableCopy(protobufList);
            }

            /* JADX INFO: Access modifiers changed from: private */
            public void setTags(int i, java.lang.String str) {
                str.getClass();
                ensureTagsIsMutable();
                this.tags_.set(i, str);
            }

            /* JADX INFO: Access modifiers changed from: private */
            public void addTags(java.lang.String str) {
                str.getClass();
                ensureTagsIsMutable();
                this.tags_.add(str);
            }

            /* JADX INFO: Access modifiers changed from: private */
            public void addAllTags(java.lang.Iterable<java.lang.String> iterable) {
                ensureTagsIsMutable();
                com.google.protobuf.AbstractMessageLite.addAll((java.lang.Iterable) iterable, (java.util.List) this.tags_);
            }

            /* JADX INFO: Access modifiers changed from: private */
            public void clearTags() {
                this.tags_ = com.google.protobuf.GeneratedMessageLite.emptyProtobufList();
            }

            /* JADX INFO: Access modifiers changed from: private */
            public void addTagsBytes(com.google.protobuf.ByteString byteString) {
                checkByteStringIsUtf8(byteString);
                ensureTagsIsMutable();
                this.tags_.add(byteString.toStringUtf8());
            }

            public static com.moloco.sdk.MetricsRequest.PostMetricsRequest.TimerEvent parseFrom(java.nio.ByteBuffer byteBuffer) throws com.google.protobuf.InvalidProtocolBufferException {
                return (com.moloco.sdk.MetricsRequest.PostMetricsRequest.TimerEvent) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
            }

            public static com.moloco.sdk.MetricsRequest.PostMetricsRequest.TimerEvent parseFrom(java.nio.ByteBuffer byteBuffer, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) throws com.google.protobuf.InvalidProtocolBufferException {
                return (com.moloco.sdk.MetricsRequest.PostMetricsRequest.TimerEvent) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
            }

            public static com.moloco.sdk.MetricsRequest.PostMetricsRequest.TimerEvent parseFrom(com.google.protobuf.ByteString byteString) throws com.google.protobuf.InvalidProtocolBufferException {
                return (com.moloco.sdk.MetricsRequest.PostMetricsRequest.TimerEvent) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
            }

            public static com.moloco.sdk.MetricsRequest.PostMetricsRequest.TimerEvent parseFrom(com.google.protobuf.ByteString byteString, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) throws com.google.protobuf.InvalidProtocolBufferException {
                return (com.moloco.sdk.MetricsRequest.PostMetricsRequest.TimerEvent) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
            }

            public static com.moloco.sdk.MetricsRequest.PostMetricsRequest.TimerEvent parseFrom(byte[] bArr) throws com.google.protobuf.InvalidProtocolBufferException {
                return (com.moloco.sdk.MetricsRequest.PostMetricsRequest.TimerEvent) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
            }

            public static com.moloco.sdk.MetricsRequest.PostMetricsRequest.TimerEvent parseFrom(byte[] bArr, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) throws com.google.protobuf.InvalidProtocolBufferException {
                return (com.moloco.sdk.MetricsRequest.PostMetricsRequest.TimerEvent) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
            }

            public static com.moloco.sdk.MetricsRequest.PostMetricsRequest.TimerEvent parseFrom(java.io.InputStream inputStream) throws java.io.IOException {
                return (com.moloco.sdk.MetricsRequest.PostMetricsRequest.TimerEvent) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
            }

            public static com.moloco.sdk.MetricsRequest.PostMetricsRequest.TimerEvent parseFrom(java.io.InputStream inputStream, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) throws java.io.IOException {
                return (com.moloco.sdk.MetricsRequest.PostMetricsRequest.TimerEvent) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
            }

            public static com.moloco.sdk.MetricsRequest.PostMetricsRequest.TimerEvent parseDelimitedFrom(java.io.InputStream inputStream) throws java.io.IOException {
                return (com.moloco.sdk.MetricsRequest.PostMetricsRequest.TimerEvent) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
            }

            public static com.moloco.sdk.MetricsRequest.PostMetricsRequest.TimerEvent parseDelimitedFrom(java.io.InputStream inputStream, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) throws java.io.IOException {
                return (com.moloco.sdk.MetricsRequest.PostMetricsRequest.TimerEvent) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
            }

            public static com.moloco.sdk.MetricsRequest.PostMetricsRequest.TimerEvent parseFrom(com.google.protobuf.CodedInputStream codedInputStream) throws java.io.IOException {
                return (com.moloco.sdk.MetricsRequest.PostMetricsRequest.TimerEvent) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
            }

            public static com.moloco.sdk.MetricsRequest.PostMetricsRequest.TimerEvent parseFrom(com.google.protobuf.CodedInputStream codedInputStream, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) throws java.io.IOException {
                return (com.moloco.sdk.MetricsRequest.PostMetricsRequest.TimerEvent) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
            }

            public static com.moloco.sdk.MetricsRequest.PostMetricsRequest.TimerEvent.Builder newBuilder() {
                return DEFAULT_INSTANCE.createBuilder();
            }

            public static com.moloco.sdk.MetricsRequest.PostMetricsRequest.TimerEvent.Builder newBuilder(com.moloco.sdk.MetricsRequest.PostMetricsRequest.TimerEvent timerEvent) {
                return DEFAULT_INSTANCE.createBuilder(timerEvent);
            }

            public static final class Builder extends com.google.protobuf.GeneratedMessageLite.Builder<com.moloco.sdk.MetricsRequest.PostMetricsRequest.TimerEvent, com.moloco.sdk.MetricsRequest.PostMetricsRequest.TimerEvent.Builder> implements com.moloco.sdk.MetricsRequest.PostMetricsRequest.TimerEventOrBuilder {
                private Builder() {
                    super(com.moloco.sdk.MetricsRequest.PostMetricsRequest.TimerEvent.DEFAULT_INSTANCE);
                }

                @Override // com.moloco.sdk.MetricsRequest.PostMetricsRequest.TimerEventOrBuilder
                public java.lang.String getName() {
                    return ((com.moloco.sdk.MetricsRequest.PostMetricsRequest.TimerEvent) this.instance).getName();
                }

                @Override // com.moloco.sdk.MetricsRequest.PostMetricsRequest.TimerEventOrBuilder
                public com.google.protobuf.ByteString getNameBytes() {
                    return ((com.moloco.sdk.MetricsRequest.PostMetricsRequest.TimerEvent) this.instance).getNameBytes();
                }

                public com.moloco.sdk.MetricsRequest.PostMetricsRequest.TimerEvent.Builder setName(java.lang.String str) {
                    copyOnWrite();
                    ((com.moloco.sdk.MetricsRequest.PostMetricsRequest.TimerEvent) this.instance).setName(str);
                    return this;
                }

                public com.moloco.sdk.MetricsRequest.PostMetricsRequest.TimerEvent.Builder clearName() {
                    copyOnWrite();
                    ((com.moloco.sdk.MetricsRequest.PostMetricsRequest.TimerEvent) this.instance).clearName();
                    return this;
                }

                public com.moloco.sdk.MetricsRequest.PostMetricsRequest.TimerEvent.Builder setNameBytes(com.google.protobuf.ByteString byteString) {
                    copyOnWrite();
                    ((com.moloco.sdk.MetricsRequest.PostMetricsRequest.TimerEvent) this.instance).setNameBytes(byteString);
                    return this;
                }

                @Override // com.moloco.sdk.MetricsRequest.PostMetricsRequest.TimerEventOrBuilder
                public long getElapsedTimeMillis() {
                    return ((com.moloco.sdk.MetricsRequest.PostMetricsRequest.TimerEvent) this.instance).getElapsedTimeMillis();
                }

                public com.moloco.sdk.MetricsRequest.PostMetricsRequest.TimerEvent.Builder setElapsedTimeMillis(long j) {
                    copyOnWrite();
                    ((com.moloco.sdk.MetricsRequest.PostMetricsRequest.TimerEvent) this.instance).setElapsedTimeMillis(j);
                    return this;
                }

                public com.moloco.sdk.MetricsRequest.PostMetricsRequest.TimerEvent.Builder clearElapsedTimeMillis() {
                    copyOnWrite();
                    ((com.moloco.sdk.MetricsRequest.PostMetricsRequest.TimerEvent) this.instance).clearElapsedTimeMillis();
                    return this;
                }

                @Override // com.moloco.sdk.MetricsRequest.PostMetricsRequest.TimerEventOrBuilder
                public java.util.List<java.lang.String> getTagsList() {
                    return java.util.Collections.unmodifiableList(((com.moloco.sdk.MetricsRequest.PostMetricsRequest.TimerEvent) this.instance).getTagsList());
                }

                @Override // com.moloco.sdk.MetricsRequest.PostMetricsRequest.TimerEventOrBuilder
                public int getTagsCount() {
                    return ((com.moloco.sdk.MetricsRequest.PostMetricsRequest.TimerEvent) this.instance).getTagsCount();
                }

                @Override // com.moloco.sdk.MetricsRequest.PostMetricsRequest.TimerEventOrBuilder
                public java.lang.String getTags(int i) {
                    return ((com.moloco.sdk.MetricsRequest.PostMetricsRequest.TimerEvent) this.instance).getTags(i);
                }

                @Override // com.moloco.sdk.MetricsRequest.PostMetricsRequest.TimerEventOrBuilder
                public com.google.protobuf.ByteString getTagsBytes(int i) {
                    return ((com.moloco.sdk.MetricsRequest.PostMetricsRequest.TimerEvent) this.instance).getTagsBytes(i);
                }

                public com.moloco.sdk.MetricsRequest.PostMetricsRequest.TimerEvent.Builder setTags(int i, java.lang.String str) {
                    copyOnWrite();
                    ((com.moloco.sdk.MetricsRequest.PostMetricsRequest.TimerEvent) this.instance).setTags(i, str);
                    return this;
                }

                public com.moloco.sdk.MetricsRequest.PostMetricsRequest.TimerEvent.Builder addTags(java.lang.String str) {
                    copyOnWrite();
                    ((com.moloco.sdk.MetricsRequest.PostMetricsRequest.TimerEvent) this.instance).addTags(str);
                    return this;
                }

                public com.moloco.sdk.MetricsRequest.PostMetricsRequest.TimerEvent.Builder addAllTags(java.lang.Iterable<java.lang.String> iterable) {
                    copyOnWrite();
                    ((com.moloco.sdk.MetricsRequest.PostMetricsRequest.TimerEvent) this.instance).addAllTags(iterable);
                    return this;
                }

                public com.moloco.sdk.MetricsRequest.PostMetricsRequest.TimerEvent.Builder clearTags() {
                    copyOnWrite();
                    ((com.moloco.sdk.MetricsRequest.PostMetricsRequest.TimerEvent) this.instance).clearTags();
                    return this;
                }

                public com.moloco.sdk.MetricsRequest.PostMetricsRequest.TimerEvent.Builder addTagsBytes(com.google.protobuf.ByteString byteString) {
                    copyOnWrite();
                    ((com.moloco.sdk.MetricsRequest.PostMetricsRequest.TimerEvent) this.instance).addTagsBytes(byteString);
                    return this;
                }
            }

            @Override // com.google.protobuf.GeneratedMessageLite
            protected final java.lang.Object dynamicMethod(com.google.protobuf.GeneratedMessageLite.MethodToInvoke methodToInvoke, java.lang.Object obj, java.lang.Object obj2) {
                switch (com.moloco.sdk.MetricsRequest.AnonymousClass1.$SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke[methodToInvoke.ordinal()]) {
                    case 1:
                        return new com.moloco.sdk.MetricsRequest.PostMetricsRequest.TimerEvent();
                    case 2:
                        return new com.moloco.sdk.MetricsRequest.PostMetricsRequest.TimerEvent.Builder();
                    case 3:
                        return newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0001\u0000\u0001Ȉ\u0002\u0003\u0003Ț", new java.lang.Object[]{"name_", "elapsedTimeMillis_", "tags_"});
                    case 4:
                        return DEFAULT_INSTANCE;
                    case 5:
                        com.google.protobuf.Parser<com.moloco.sdk.MetricsRequest.PostMetricsRequest.TimerEvent> parser = PARSER;
                        if (parser == null) {
                            synchronized (com.moloco.sdk.MetricsRequest.PostMetricsRequest.TimerEvent.class) {
                                parser = PARSER;
                                if (parser == null) {
                                    parser = new com.google.protobuf.GeneratedMessageLite.DefaultInstanceBasedParser<>(DEFAULT_INSTANCE);
                                    PARSER = parser;
                                }
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

            static {
                com.moloco.sdk.MetricsRequest.PostMetricsRequest.TimerEvent timerEvent = new com.moloco.sdk.MetricsRequest.PostMetricsRequest.TimerEvent();
                DEFAULT_INSTANCE = timerEvent;
                com.google.protobuf.GeneratedMessageLite.registerDefaultInstance(com.moloco.sdk.MetricsRequest.PostMetricsRequest.TimerEvent.class, timerEvent);
            }

            public static com.moloco.sdk.MetricsRequest.PostMetricsRequest.TimerEvent getDefaultInstance() {
                return DEFAULT_INSTANCE;
            }

            public static com.google.protobuf.Parser<com.moloco.sdk.MetricsRequest.PostMetricsRequest.TimerEvent> parser() {
                return DEFAULT_INSTANCE.getParserForType();
            }
        }

        @Override // com.moloco.sdk.MetricsRequest.PostMetricsRequestOrBuilder
        public java.util.List<com.moloco.sdk.MetricsRequest.PostMetricsRequest.CountEvent> getCountsList() {
            return this.counts_;
        }

        public java.util.List<? extends com.moloco.sdk.MetricsRequest.PostMetricsRequest.CountEventOrBuilder> getCountsOrBuilderList() {
            return this.counts_;
        }

        @Override // com.moloco.sdk.MetricsRequest.PostMetricsRequestOrBuilder
        public int getCountsCount() {
            return this.counts_.size();
        }

        @Override // com.moloco.sdk.MetricsRequest.PostMetricsRequestOrBuilder
        public com.moloco.sdk.MetricsRequest.PostMetricsRequest.CountEvent getCounts(int i) {
            return this.counts_.get(i);
        }

        public com.moloco.sdk.MetricsRequest.PostMetricsRequest.CountEventOrBuilder getCountsOrBuilder(int i) {
            return this.counts_.get(i);
        }

        private void ensureCountsIsMutable() {
            com.google.protobuf.Internal.ProtobufList<com.moloco.sdk.MetricsRequest.PostMetricsRequest.CountEvent> protobufList = this.counts_;
            if (protobufList.isModifiable()) {
                return;
            }
            this.counts_ = com.google.protobuf.GeneratedMessageLite.mutableCopy(protobufList);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setCounts(int i, com.moloco.sdk.MetricsRequest.PostMetricsRequest.CountEvent countEvent) {
            countEvent.getClass();
            ensureCountsIsMutable();
            this.counts_.set(i, countEvent);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void addCounts(com.moloco.sdk.MetricsRequest.PostMetricsRequest.CountEvent countEvent) {
            countEvent.getClass();
            ensureCountsIsMutable();
            this.counts_.add(countEvent);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void addCounts(int i, com.moloco.sdk.MetricsRequest.PostMetricsRequest.CountEvent countEvent) {
            countEvent.getClass();
            ensureCountsIsMutable();
            this.counts_.add(i, countEvent);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void addAllCounts(java.lang.Iterable<? extends com.moloco.sdk.MetricsRequest.PostMetricsRequest.CountEvent> iterable) {
            ensureCountsIsMutable();
            com.google.protobuf.AbstractMessageLite.addAll((java.lang.Iterable) iterable, (java.util.List) this.counts_);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearCounts() {
            this.counts_ = emptyProtobufList();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void removeCounts(int i) {
            ensureCountsIsMutable();
            this.counts_.remove(i);
        }

        @Override // com.moloco.sdk.MetricsRequest.PostMetricsRequestOrBuilder
        public java.util.List<com.moloco.sdk.MetricsRequest.PostMetricsRequest.TimerEvent> getDurationsList() {
            return this.durations_;
        }

        public java.util.List<? extends com.moloco.sdk.MetricsRequest.PostMetricsRequest.TimerEventOrBuilder> getDurationsOrBuilderList() {
            return this.durations_;
        }

        @Override // com.moloco.sdk.MetricsRequest.PostMetricsRequestOrBuilder
        public int getDurationsCount() {
            return this.durations_.size();
        }

        @Override // com.moloco.sdk.MetricsRequest.PostMetricsRequestOrBuilder
        public com.moloco.sdk.MetricsRequest.PostMetricsRequest.TimerEvent getDurations(int i) {
            return this.durations_.get(i);
        }

        public com.moloco.sdk.MetricsRequest.PostMetricsRequest.TimerEventOrBuilder getDurationsOrBuilder(int i) {
            return this.durations_.get(i);
        }

        private void ensureDurationsIsMutable() {
            com.google.protobuf.Internal.ProtobufList<com.moloco.sdk.MetricsRequest.PostMetricsRequest.TimerEvent> protobufList = this.durations_;
            if (protobufList.isModifiable()) {
                return;
            }
            this.durations_ = com.google.protobuf.GeneratedMessageLite.mutableCopy(protobufList);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setDurations(int i, com.moloco.sdk.MetricsRequest.PostMetricsRequest.TimerEvent timerEvent) {
            timerEvent.getClass();
            ensureDurationsIsMutable();
            this.durations_.set(i, timerEvent);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void addDurations(com.moloco.sdk.MetricsRequest.PostMetricsRequest.TimerEvent timerEvent) {
            timerEvent.getClass();
            ensureDurationsIsMutable();
            this.durations_.add(timerEvent);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void addDurations(int i, com.moloco.sdk.MetricsRequest.PostMetricsRequest.TimerEvent timerEvent) {
            timerEvent.getClass();
            ensureDurationsIsMutable();
            this.durations_.add(i, timerEvent);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void addAllDurations(java.lang.Iterable<? extends com.moloco.sdk.MetricsRequest.PostMetricsRequest.TimerEvent> iterable) {
            ensureDurationsIsMutable();
            com.google.protobuf.AbstractMessageLite.addAll((java.lang.Iterable) iterable, (java.util.List) this.durations_);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearDurations() {
            this.durations_ = emptyProtobufList();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void removeDurations(int i) {
            ensureDurationsIsMutable();
            this.durations_.remove(i);
        }

        public static com.moloco.sdk.MetricsRequest.PostMetricsRequest parseFrom(java.nio.ByteBuffer byteBuffer) throws com.google.protobuf.InvalidProtocolBufferException {
            return (com.moloco.sdk.MetricsRequest.PostMetricsRequest) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
        }

        public static com.moloco.sdk.MetricsRequest.PostMetricsRequest parseFrom(java.nio.ByteBuffer byteBuffer, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) throws com.google.protobuf.InvalidProtocolBufferException {
            return (com.moloco.sdk.MetricsRequest.PostMetricsRequest) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
        }

        public static com.moloco.sdk.MetricsRequest.PostMetricsRequest parseFrom(com.google.protobuf.ByteString byteString) throws com.google.protobuf.InvalidProtocolBufferException {
            return (com.moloco.sdk.MetricsRequest.PostMetricsRequest) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
        }

        public static com.moloco.sdk.MetricsRequest.PostMetricsRequest parseFrom(com.google.protobuf.ByteString byteString, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) throws com.google.protobuf.InvalidProtocolBufferException {
            return (com.moloco.sdk.MetricsRequest.PostMetricsRequest) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
        }

        public static com.moloco.sdk.MetricsRequest.PostMetricsRequest parseFrom(byte[] bArr) throws com.google.protobuf.InvalidProtocolBufferException {
            return (com.moloco.sdk.MetricsRequest.PostMetricsRequest) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
        }

        public static com.moloco.sdk.MetricsRequest.PostMetricsRequest parseFrom(byte[] bArr, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) throws com.google.protobuf.InvalidProtocolBufferException {
            return (com.moloco.sdk.MetricsRequest.PostMetricsRequest) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
        }

        public static com.moloco.sdk.MetricsRequest.PostMetricsRequest parseFrom(java.io.InputStream inputStream) throws java.io.IOException {
            return (com.moloco.sdk.MetricsRequest.PostMetricsRequest) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static com.moloco.sdk.MetricsRequest.PostMetricsRequest parseFrom(java.io.InputStream inputStream, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) throws java.io.IOException {
            return (com.moloco.sdk.MetricsRequest.PostMetricsRequest) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
        }

        public static com.moloco.sdk.MetricsRequest.PostMetricsRequest parseDelimitedFrom(java.io.InputStream inputStream) throws java.io.IOException {
            return (com.moloco.sdk.MetricsRequest.PostMetricsRequest) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static com.moloco.sdk.MetricsRequest.PostMetricsRequest parseDelimitedFrom(java.io.InputStream inputStream, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) throws java.io.IOException {
            return (com.moloco.sdk.MetricsRequest.PostMetricsRequest) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
        }

        public static com.moloco.sdk.MetricsRequest.PostMetricsRequest parseFrom(com.google.protobuf.CodedInputStream codedInputStream) throws java.io.IOException {
            return (com.moloco.sdk.MetricsRequest.PostMetricsRequest) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
        }

        public static com.moloco.sdk.MetricsRequest.PostMetricsRequest parseFrom(com.google.protobuf.CodedInputStream codedInputStream, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) throws java.io.IOException {
            return (com.moloco.sdk.MetricsRequest.PostMetricsRequest) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
        }

        public static com.moloco.sdk.MetricsRequest.PostMetricsRequest.Builder newBuilder() {
            return DEFAULT_INSTANCE.createBuilder();
        }

        public static com.moloco.sdk.MetricsRequest.PostMetricsRequest.Builder newBuilder(com.moloco.sdk.MetricsRequest.PostMetricsRequest postMetricsRequest) {
            return DEFAULT_INSTANCE.createBuilder(postMetricsRequest);
        }

        public static final class Builder extends com.google.protobuf.GeneratedMessageLite.Builder<com.moloco.sdk.MetricsRequest.PostMetricsRequest, com.moloco.sdk.MetricsRequest.PostMetricsRequest.Builder> implements com.moloco.sdk.MetricsRequest.PostMetricsRequestOrBuilder {
            private Builder() {
                super(com.moloco.sdk.MetricsRequest.PostMetricsRequest.DEFAULT_INSTANCE);
            }

            @Override // com.moloco.sdk.MetricsRequest.PostMetricsRequestOrBuilder
            public java.util.List<com.moloco.sdk.MetricsRequest.PostMetricsRequest.CountEvent> getCountsList() {
                return java.util.Collections.unmodifiableList(((com.moloco.sdk.MetricsRequest.PostMetricsRequest) this.instance).getCountsList());
            }

            @Override // com.moloco.sdk.MetricsRequest.PostMetricsRequestOrBuilder
            public int getCountsCount() {
                return ((com.moloco.sdk.MetricsRequest.PostMetricsRequest) this.instance).getCountsCount();
            }

            @Override // com.moloco.sdk.MetricsRequest.PostMetricsRequestOrBuilder
            public com.moloco.sdk.MetricsRequest.PostMetricsRequest.CountEvent getCounts(int i) {
                return ((com.moloco.sdk.MetricsRequest.PostMetricsRequest) this.instance).getCounts(i);
            }

            public com.moloco.sdk.MetricsRequest.PostMetricsRequest.Builder setCounts(int i, com.moloco.sdk.MetricsRequest.PostMetricsRequest.CountEvent countEvent) {
                copyOnWrite();
                ((com.moloco.sdk.MetricsRequest.PostMetricsRequest) this.instance).setCounts(i, countEvent);
                return this;
            }

            public com.moloco.sdk.MetricsRequest.PostMetricsRequest.Builder setCounts(int i, com.moloco.sdk.MetricsRequest.PostMetricsRequest.CountEvent.Builder builder) {
                copyOnWrite();
                ((com.moloco.sdk.MetricsRequest.PostMetricsRequest) this.instance).setCounts(i, builder.build());
                return this;
            }

            public com.moloco.sdk.MetricsRequest.PostMetricsRequest.Builder addCounts(com.moloco.sdk.MetricsRequest.PostMetricsRequest.CountEvent countEvent) {
                copyOnWrite();
                ((com.moloco.sdk.MetricsRequest.PostMetricsRequest) this.instance).addCounts(countEvent);
                return this;
            }

            public com.moloco.sdk.MetricsRequest.PostMetricsRequest.Builder addCounts(int i, com.moloco.sdk.MetricsRequest.PostMetricsRequest.CountEvent countEvent) {
                copyOnWrite();
                ((com.moloco.sdk.MetricsRequest.PostMetricsRequest) this.instance).addCounts(i, countEvent);
                return this;
            }

            public com.moloco.sdk.MetricsRequest.PostMetricsRequest.Builder addCounts(com.moloco.sdk.MetricsRequest.PostMetricsRequest.CountEvent.Builder builder) {
                copyOnWrite();
                ((com.moloco.sdk.MetricsRequest.PostMetricsRequest) this.instance).addCounts(builder.build());
                return this;
            }

            public com.moloco.sdk.MetricsRequest.PostMetricsRequest.Builder addCounts(int i, com.moloco.sdk.MetricsRequest.PostMetricsRequest.CountEvent.Builder builder) {
                copyOnWrite();
                ((com.moloco.sdk.MetricsRequest.PostMetricsRequest) this.instance).addCounts(i, builder.build());
                return this;
            }

            public com.moloco.sdk.MetricsRequest.PostMetricsRequest.Builder addAllCounts(java.lang.Iterable<? extends com.moloco.sdk.MetricsRequest.PostMetricsRequest.CountEvent> iterable) {
                copyOnWrite();
                ((com.moloco.sdk.MetricsRequest.PostMetricsRequest) this.instance).addAllCounts(iterable);
                return this;
            }

            public com.moloco.sdk.MetricsRequest.PostMetricsRequest.Builder clearCounts() {
                copyOnWrite();
                ((com.moloco.sdk.MetricsRequest.PostMetricsRequest) this.instance).clearCounts();
                return this;
            }

            public com.moloco.sdk.MetricsRequest.PostMetricsRequest.Builder removeCounts(int i) {
                copyOnWrite();
                ((com.moloco.sdk.MetricsRequest.PostMetricsRequest) this.instance).removeCounts(i);
                return this;
            }

            @Override // com.moloco.sdk.MetricsRequest.PostMetricsRequestOrBuilder
            public java.util.List<com.moloco.sdk.MetricsRequest.PostMetricsRequest.TimerEvent> getDurationsList() {
                return java.util.Collections.unmodifiableList(((com.moloco.sdk.MetricsRequest.PostMetricsRequest) this.instance).getDurationsList());
            }

            @Override // com.moloco.sdk.MetricsRequest.PostMetricsRequestOrBuilder
            public int getDurationsCount() {
                return ((com.moloco.sdk.MetricsRequest.PostMetricsRequest) this.instance).getDurationsCount();
            }

            @Override // com.moloco.sdk.MetricsRequest.PostMetricsRequestOrBuilder
            public com.moloco.sdk.MetricsRequest.PostMetricsRequest.TimerEvent getDurations(int i) {
                return ((com.moloco.sdk.MetricsRequest.PostMetricsRequest) this.instance).getDurations(i);
            }

            public com.moloco.sdk.MetricsRequest.PostMetricsRequest.Builder setDurations(int i, com.moloco.sdk.MetricsRequest.PostMetricsRequest.TimerEvent timerEvent) {
                copyOnWrite();
                ((com.moloco.sdk.MetricsRequest.PostMetricsRequest) this.instance).setDurations(i, timerEvent);
                return this;
            }

            public com.moloco.sdk.MetricsRequest.PostMetricsRequest.Builder setDurations(int i, com.moloco.sdk.MetricsRequest.PostMetricsRequest.TimerEvent.Builder builder) {
                copyOnWrite();
                ((com.moloco.sdk.MetricsRequest.PostMetricsRequest) this.instance).setDurations(i, builder.build());
                return this;
            }

            public com.moloco.sdk.MetricsRequest.PostMetricsRequest.Builder addDurations(com.moloco.sdk.MetricsRequest.PostMetricsRequest.TimerEvent timerEvent) {
                copyOnWrite();
                ((com.moloco.sdk.MetricsRequest.PostMetricsRequest) this.instance).addDurations(timerEvent);
                return this;
            }

            public com.moloco.sdk.MetricsRequest.PostMetricsRequest.Builder addDurations(int i, com.moloco.sdk.MetricsRequest.PostMetricsRequest.TimerEvent timerEvent) {
                copyOnWrite();
                ((com.moloco.sdk.MetricsRequest.PostMetricsRequest) this.instance).addDurations(i, timerEvent);
                return this;
            }

            public com.moloco.sdk.MetricsRequest.PostMetricsRequest.Builder addDurations(com.moloco.sdk.MetricsRequest.PostMetricsRequest.TimerEvent.Builder builder) {
                copyOnWrite();
                ((com.moloco.sdk.MetricsRequest.PostMetricsRequest) this.instance).addDurations(builder.build());
                return this;
            }

            public com.moloco.sdk.MetricsRequest.PostMetricsRequest.Builder addDurations(int i, com.moloco.sdk.MetricsRequest.PostMetricsRequest.TimerEvent.Builder builder) {
                copyOnWrite();
                ((com.moloco.sdk.MetricsRequest.PostMetricsRequest) this.instance).addDurations(i, builder.build());
                return this;
            }

            public com.moloco.sdk.MetricsRequest.PostMetricsRequest.Builder addAllDurations(java.lang.Iterable<? extends com.moloco.sdk.MetricsRequest.PostMetricsRequest.TimerEvent> iterable) {
                copyOnWrite();
                ((com.moloco.sdk.MetricsRequest.PostMetricsRequest) this.instance).addAllDurations(iterable);
                return this;
            }

            public com.moloco.sdk.MetricsRequest.PostMetricsRequest.Builder clearDurations() {
                copyOnWrite();
                ((com.moloco.sdk.MetricsRequest.PostMetricsRequest) this.instance).clearDurations();
                return this;
            }

            public com.moloco.sdk.MetricsRequest.PostMetricsRequest.Builder removeDurations(int i) {
                copyOnWrite();
                ((com.moloco.sdk.MetricsRequest.PostMetricsRequest) this.instance).removeDurations(i);
                return this;
            }
        }

        @Override // com.google.protobuf.GeneratedMessageLite
        protected final java.lang.Object dynamicMethod(com.google.protobuf.GeneratedMessageLite.MethodToInvoke methodToInvoke, java.lang.Object obj, java.lang.Object obj2) {
            switch (com.moloco.sdk.MetricsRequest.AnonymousClass1.$SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke[methodToInvoke.ordinal()]) {
                case 1:
                    return new com.moloco.sdk.MetricsRequest.PostMetricsRequest();
                case 2:
                    return new com.moloco.sdk.MetricsRequest.PostMetricsRequest.Builder();
                case 3:
                    return newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0002\u0000\u0001\u001b\u0002\u001b", new java.lang.Object[]{"counts_", com.moloco.sdk.MetricsRequest.PostMetricsRequest.CountEvent.class, "durations_", com.moloco.sdk.MetricsRequest.PostMetricsRequest.TimerEvent.class});
                case 4:
                    return DEFAULT_INSTANCE;
                case 5:
                    com.google.protobuf.Parser<com.moloco.sdk.MetricsRequest.PostMetricsRequest> parser = PARSER;
                    if (parser == null) {
                        synchronized (com.moloco.sdk.MetricsRequest.PostMetricsRequest.class) {
                            parser = PARSER;
                            if (parser == null) {
                                parser = new com.google.protobuf.GeneratedMessageLite.DefaultInstanceBasedParser<>(DEFAULT_INSTANCE);
                                PARSER = parser;
                            }
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

        static {
            com.moloco.sdk.MetricsRequest.PostMetricsRequest postMetricsRequest = new com.moloco.sdk.MetricsRequest.PostMetricsRequest();
            DEFAULT_INSTANCE = postMetricsRequest;
            com.google.protobuf.GeneratedMessageLite.registerDefaultInstance(com.moloco.sdk.MetricsRequest.PostMetricsRequest.class, postMetricsRequest);
        }

        public static com.moloco.sdk.MetricsRequest.PostMetricsRequest getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static com.google.protobuf.Parser<com.moloco.sdk.MetricsRequest.PostMetricsRequest> parser() {
            return DEFAULT_INSTANCE.getParserForType();
        }
    }

    /* renamed from: com.moloco.sdk.MetricsRequest$1, reason: invalid class name */
    static /* synthetic */ class AnonymousClass1 {
        static final /* synthetic */ int[] $SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke;

        static {
            int[] iArr = new int[com.google.protobuf.GeneratedMessageLite.MethodToInvoke.values().length];
            $SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke = iArr;
            try {
                iArr[com.google.protobuf.GeneratedMessageLite.MethodToInvoke.NEW_MUTABLE_INSTANCE.ordinal()] = 1;
            } catch (java.lang.NoSuchFieldError unused) {
            }
            try {
                $SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke[com.google.protobuf.GeneratedMessageLite.MethodToInvoke.NEW_BUILDER.ordinal()] = 2;
            } catch (java.lang.NoSuchFieldError unused2) {
            }
            try {
                $SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke[com.google.protobuf.GeneratedMessageLite.MethodToInvoke.BUILD_MESSAGE_INFO.ordinal()] = 3;
            } catch (java.lang.NoSuchFieldError unused3) {
            }
            try {
                $SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke[com.google.protobuf.GeneratedMessageLite.MethodToInvoke.GET_DEFAULT_INSTANCE.ordinal()] = 4;
            } catch (java.lang.NoSuchFieldError unused4) {
            }
            try {
                $SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke[com.google.protobuf.GeneratedMessageLite.MethodToInvoke.GET_PARSER.ordinal()] = 5;
            } catch (java.lang.NoSuchFieldError unused5) {
            }
            try {
                $SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke[com.google.protobuf.GeneratedMessageLite.MethodToInvoke.GET_MEMOIZED_IS_INITIALIZED.ordinal()] = 6;
            } catch (java.lang.NoSuchFieldError unused6) {
            }
            try {
                $SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke[com.google.protobuf.GeneratedMessageLite.MethodToInvoke.SET_MEMOIZED_IS_INITIALIZED.ordinal()] = 7;
            } catch (java.lang.NoSuchFieldError unused7) {
            }
        }
    }

    public static final class SDKInitTrackingRequest extends com.google.protobuf.GeneratedMessageLite<com.moloco.sdk.MetricsRequest.SDKInitTrackingRequest, com.moloco.sdk.MetricsRequest.SDKInitTrackingRequest.Builder> implements com.moloco.sdk.MetricsRequest.SDKInitTrackingRequestOrBuilder {
        private static final com.moloco.sdk.MetricsRequest.SDKInitTrackingRequest DEFAULT_INSTANCE;
        public static final int FAILURE_FIELD_NUMBER = 2;
        public static final int LATENCY_MS_FIELD_NUMBER = 3;
        private static volatile com.google.protobuf.Parser<com.moloco.sdk.MetricsRequest.SDKInitTrackingRequest> PARSER = null;
        public static final int SUCCESS_FIELD_NUMBER = 1;
        private int bitField0_;
        private int initStatusCase_ = 0;
        private java.lang.Object initStatus_;
        private long latencyMs_;

        private SDKInitTrackingRequest() {
        }

        public enum InitStatusCase {
            SUCCESS(1),
            FAILURE(2),
            INITSTATUS_NOT_SET(0);

            private final int value;

            InitStatusCase(int i) {
                this.value = i;
            }

            @java.lang.Deprecated
            public static com.moloco.sdk.MetricsRequest.SDKInitTrackingRequest.InitStatusCase valueOf(int i) {
                return forNumber(i);
            }

            public static com.moloco.sdk.MetricsRequest.SDKInitTrackingRequest.InitStatusCase forNumber(int i) {
                if (i == 0) {
                    return INITSTATUS_NOT_SET;
                }
                if (i == 1) {
                    return SUCCESS;
                }
                if (i != 2) {
                    return null;
                }
                return FAILURE;
            }

            public int getNumber() {
                return this.value;
            }
        }

        @Override // com.moloco.sdk.MetricsRequest.SDKInitTrackingRequestOrBuilder
        public com.moloco.sdk.MetricsRequest.SDKInitTrackingRequest.InitStatusCase getInitStatusCase() {
            return com.moloco.sdk.MetricsRequest.SDKInitTrackingRequest.InitStatusCase.forNumber(this.initStatusCase_);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearInitStatus() {
            this.initStatusCase_ = 0;
            this.initStatus_ = null;
        }

        @Override // com.moloco.sdk.MetricsRequest.SDKInitTrackingRequestOrBuilder
        public boolean hasSuccess() {
            return this.initStatusCase_ == 1;
        }

        @Override // com.moloco.sdk.MetricsRequest.SDKInitTrackingRequestOrBuilder
        public com.moloco.sdk.MetricsRequest.SDKInitSuccessTrackingRequest getSuccess() {
            if (this.initStatusCase_ == 1) {
                return (com.moloco.sdk.MetricsRequest.SDKInitSuccessTrackingRequest) this.initStatus_;
            }
            return com.moloco.sdk.MetricsRequest.SDKInitSuccessTrackingRequest.getDefaultInstance();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setSuccess(com.moloco.sdk.MetricsRequest.SDKInitSuccessTrackingRequest sDKInitSuccessTrackingRequest) {
            sDKInitSuccessTrackingRequest.getClass();
            this.initStatus_ = sDKInitSuccessTrackingRequest;
            this.initStatusCase_ = 1;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void mergeSuccess(com.moloco.sdk.MetricsRequest.SDKInitSuccessTrackingRequest sDKInitSuccessTrackingRequest) {
            sDKInitSuccessTrackingRequest.getClass();
            if (this.initStatusCase_ == 1 && this.initStatus_ != com.moloco.sdk.MetricsRequest.SDKInitSuccessTrackingRequest.getDefaultInstance()) {
                this.initStatus_ = com.moloco.sdk.MetricsRequest.SDKInitSuccessTrackingRequest.newBuilder((com.moloco.sdk.MetricsRequest.SDKInitSuccessTrackingRequest) this.initStatus_).mergeFrom((com.moloco.sdk.MetricsRequest.SDKInitSuccessTrackingRequest.Builder) sDKInitSuccessTrackingRequest).buildPartial();
            } else {
                this.initStatus_ = sDKInitSuccessTrackingRequest;
            }
            this.initStatusCase_ = 1;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearSuccess() {
            if (this.initStatusCase_ == 1) {
                this.initStatusCase_ = 0;
                this.initStatus_ = null;
            }
        }

        @Override // com.moloco.sdk.MetricsRequest.SDKInitTrackingRequestOrBuilder
        public boolean hasFailure() {
            return this.initStatusCase_ == 2;
        }

        @Override // com.moloco.sdk.MetricsRequest.SDKInitTrackingRequestOrBuilder
        public com.moloco.sdk.MetricsRequest.SDKInitFailureTrackingRequest getFailure() {
            if (this.initStatusCase_ == 2) {
                return (com.moloco.sdk.MetricsRequest.SDKInitFailureTrackingRequest) this.initStatus_;
            }
            return com.moloco.sdk.MetricsRequest.SDKInitFailureTrackingRequest.getDefaultInstance();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setFailure(com.moloco.sdk.MetricsRequest.SDKInitFailureTrackingRequest sDKInitFailureTrackingRequest) {
            sDKInitFailureTrackingRequest.getClass();
            this.initStatus_ = sDKInitFailureTrackingRequest;
            this.initStatusCase_ = 2;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void mergeFailure(com.moloco.sdk.MetricsRequest.SDKInitFailureTrackingRequest sDKInitFailureTrackingRequest) {
            sDKInitFailureTrackingRequest.getClass();
            if (this.initStatusCase_ == 2 && this.initStatus_ != com.moloco.sdk.MetricsRequest.SDKInitFailureTrackingRequest.getDefaultInstance()) {
                this.initStatus_ = com.moloco.sdk.MetricsRequest.SDKInitFailureTrackingRequest.newBuilder((com.moloco.sdk.MetricsRequest.SDKInitFailureTrackingRequest) this.initStatus_).mergeFrom((com.moloco.sdk.MetricsRequest.SDKInitFailureTrackingRequest.Builder) sDKInitFailureTrackingRequest).buildPartial();
            } else {
                this.initStatus_ = sDKInitFailureTrackingRequest;
            }
            this.initStatusCase_ = 2;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearFailure() {
            if (this.initStatusCase_ == 2) {
                this.initStatusCase_ = 0;
                this.initStatus_ = null;
            }
        }

        @Override // com.moloco.sdk.MetricsRequest.SDKInitTrackingRequestOrBuilder
        public boolean hasLatencyMs() {
            return (this.bitField0_ & 1) != 0;
        }

        @Override // com.moloco.sdk.MetricsRequest.SDKInitTrackingRequestOrBuilder
        public long getLatencyMs() {
            return this.latencyMs_;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setLatencyMs(long j) {
            this.bitField0_ |= 1;
            this.latencyMs_ = j;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearLatencyMs() {
            this.bitField0_ &= -2;
            this.latencyMs_ = 0L;
        }

        public static com.moloco.sdk.MetricsRequest.SDKInitTrackingRequest parseFrom(java.nio.ByteBuffer byteBuffer) throws com.google.protobuf.InvalidProtocolBufferException {
            return (com.moloco.sdk.MetricsRequest.SDKInitTrackingRequest) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
        }

        public static com.moloco.sdk.MetricsRequest.SDKInitTrackingRequest parseFrom(java.nio.ByteBuffer byteBuffer, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) throws com.google.protobuf.InvalidProtocolBufferException {
            return (com.moloco.sdk.MetricsRequest.SDKInitTrackingRequest) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
        }

        public static com.moloco.sdk.MetricsRequest.SDKInitTrackingRequest parseFrom(com.google.protobuf.ByteString byteString) throws com.google.protobuf.InvalidProtocolBufferException {
            return (com.moloco.sdk.MetricsRequest.SDKInitTrackingRequest) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
        }

        public static com.moloco.sdk.MetricsRequest.SDKInitTrackingRequest parseFrom(com.google.protobuf.ByteString byteString, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) throws com.google.protobuf.InvalidProtocolBufferException {
            return (com.moloco.sdk.MetricsRequest.SDKInitTrackingRequest) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
        }

        public static com.moloco.sdk.MetricsRequest.SDKInitTrackingRequest parseFrom(byte[] bArr) throws com.google.protobuf.InvalidProtocolBufferException {
            return (com.moloco.sdk.MetricsRequest.SDKInitTrackingRequest) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
        }

        public static com.moloco.sdk.MetricsRequest.SDKInitTrackingRequest parseFrom(byte[] bArr, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) throws com.google.protobuf.InvalidProtocolBufferException {
            return (com.moloco.sdk.MetricsRequest.SDKInitTrackingRequest) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
        }

        public static com.moloco.sdk.MetricsRequest.SDKInitTrackingRequest parseFrom(java.io.InputStream inputStream) throws java.io.IOException {
            return (com.moloco.sdk.MetricsRequest.SDKInitTrackingRequest) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static com.moloco.sdk.MetricsRequest.SDKInitTrackingRequest parseFrom(java.io.InputStream inputStream, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) throws java.io.IOException {
            return (com.moloco.sdk.MetricsRequest.SDKInitTrackingRequest) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
        }

        public static com.moloco.sdk.MetricsRequest.SDKInitTrackingRequest parseDelimitedFrom(java.io.InputStream inputStream) throws java.io.IOException {
            return (com.moloco.sdk.MetricsRequest.SDKInitTrackingRequest) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static com.moloco.sdk.MetricsRequest.SDKInitTrackingRequest parseDelimitedFrom(java.io.InputStream inputStream, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) throws java.io.IOException {
            return (com.moloco.sdk.MetricsRequest.SDKInitTrackingRequest) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
        }

        public static com.moloco.sdk.MetricsRequest.SDKInitTrackingRequest parseFrom(com.google.protobuf.CodedInputStream codedInputStream) throws java.io.IOException {
            return (com.moloco.sdk.MetricsRequest.SDKInitTrackingRequest) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
        }

        public static com.moloco.sdk.MetricsRequest.SDKInitTrackingRequest parseFrom(com.google.protobuf.CodedInputStream codedInputStream, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) throws java.io.IOException {
            return (com.moloco.sdk.MetricsRequest.SDKInitTrackingRequest) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
        }

        public static com.moloco.sdk.MetricsRequest.SDKInitTrackingRequest.Builder newBuilder() {
            return DEFAULT_INSTANCE.createBuilder();
        }

        public static com.moloco.sdk.MetricsRequest.SDKInitTrackingRequest.Builder newBuilder(com.moloco.sdk.MetricsRequest.SDKInitTrackingRequest sDKInitTrackingRequest) {
            return DEFAULT_INSTANCE.createBuilder(sDKInitTrackingRequest);
        }

        public static final class Builder extends com.google.protobuf.GeneratedMessageLite.Builder<com.moloco.sdk.MetricsRequest.SDKInitTrackingRequest, com.moloco.sdk.MetricsRequest.SDKInitTrackingRequest.Builder> implements com.moloco.sdk.MetricsRequest.SDKInitTrackingRequestOrBuilder {
            private Builder() {
                super(com.moloco.sdk.MetricsRequest.SDKInitTrackingRequest.DEFAULT_INSTANCE);
            }

            @Override // com.moloco.sdk.MetricsRequest.SDKInitTrackingRequestOrBuilder
            public com.moloco.sdk.MetricsRequest.SDKInitTrackingRequest.InitStatusCase getInitStatusCase() {
                return ((com.moloco.sdk.MetricsRequest.SDKInitTrackingRequest) this.instance).getInitStatusCase();
            }

            public com.moloco.sdk.MetricsRequest.SDKInitTrackingRequest.Builder clearInitStatus() {
                copyOnWrite();
                ((com.moloco.sdk.MetricsRequest.SDKInitTrackingRequest) this.instance).clearInitStatus();
                return this;
            }

            @Override // com.moloco.sdk.MetricsRequest.SDKInitTrackingRequestOrBuilder
            public boolean hasSuccess() {
                return ((com.moloco.sdk.MetricsRequest.SDKInitTrackingRequest) this.instance).hasSuccess();
            }

            @Override // com.moloco.sdk.MetricsRequest.SDKInitTrackingRequestOrBuilder
            public com.moloco.sdk.MetricsRequest.SDKInitSuccessTrackingRequest getSuccess() {
                return ((com.moloco.sdk.MetricsRequest.SDKInitTrackingRequest) this.instance).getSuccess();
            }

            public com.moloco.sdk.MetricsRequest.SDKInitTrackingRequest.Builder setSuccess(com.moloco.sdk.MetricsRequest.SDKInitSuccessTrackingRequest sDKInitSuccessTrackingRequest) {
                copyOnWrite();
                ((com.moloco.sdk.MetricsRequest.SDKInitTrackingRequest) this.instance).setSuccess(sDKInitSuccessTrackingRequest);
                return this;
            }

            public com.moloco.sdk.MetricsRequest.SDKInitTrackingRequest.Builder setSuccess(com.moloco.sdk.MetricsRequest.SDKInitSuccessTrackingRequest.Builder builder) {
                copyOnWrite();
                ((com.moloco.sdk.MetricsRequest.SDKInitTrackingRequest) this.instance).setSuccess(builder.build());
                return this;
            }

            public com.moloco.sdk.MetricsRequest.SDKInitTrackingRequest.Builder mergeSuccess(com.moloco.sdk.MetricsRequest.SDKInitSuccessTrackingRequest sDKInitSuccessTrackingRequest) {
                copyOnWrite();
                ((com.moloco.sdk.MetricsRequest.SDKInitTrackingRequest) this.instance).mergeSuccess(sDKInitSuccessTrackingRequest);
                return this;
            }

            public com.moloco.sdk.MetricsRequest.SDKInitTrackingRequest.Builder clearSuccess() {
                copyOnWrite();
                ((com.moloco.sdk.MetricsRequest.SDKInitTrackingRequest) this.instance).clearSuccess();
                return this;
            }

            @Override // com.moloco.sdk.MetricsRequest.SDKInitTrackingRequestOrBuilder
            public boolean hasFailure() {
                return ((com.moloco.sdk.MetricsRequest.SDKInitTrackingRequest) this.instance).hasFailure();
            }

            @Override // com.moloco.sdk.MetricsRequest.SDKInitTrackingRequestOrBuilder
            public com.moloco.sdk.MetricsRequest.SDKInitFailureTrackingRequest getFailure() {
                return ((com.moloco.sdk.MetricsRequest.SDKInitTrackingRequest) this.instance).getFailure();
            }

            public com.moloco.sdk.MetricsRequest.SDKInitTrackingRequest.Builder setFailure(com.moloco.sdk.MetricsRequest.SDKInitFailureTrackingRequest sDKInitFailureTrackingRequest) {
                copyOnWrite();
                ((com.moloco.sdk.MetricsRequest.SDKInitTrackingRequest) this.instance).setFailure(sDKInitFailureTrackingRequest);
                return this;
            }

            public com.moloco.sdk.MetricsRequest.SDKInitTrackingRequest.Builder setFailure(com.moloco.sdk.MetricsRequest.SDKInitFailureTrackingRequest.Builder builder) {
                copyOnWrite();
                ((com.moloco.sdk.MetricsRequest.SDKInitTrackingRequest) this.instance).setFailure(builder.build());
                return this;
            }

            public com.moloco.sdk.MetricsRequest.SDKInitTrackingRequest.Builder mergeFailure(com.moloco.sdk.MetricsRequest.SDKInitFailureTrackingRequest sDKInitFailureTrackingRequest) {
                copyOnWrite();
                ((com.moloco.sdk.MetricsRequest.SDKInitTrackingRequest) this.instance).mergeFailure(sDKInitFailureTrackingRequest);
                return this;
            }

            public com.moloco.sdk.MetricsRequest.SDKInitTrackingRequest.Builder clearFailure() {
                copyOnWrite();
                ((com.moloco.sdk.MetricsRequest.SDKInitTrackingRequest) this.instance).clearFailure();
                return this;
            }

            @Override // com.moloco.sdk.MetricsRequest.SDKInitTrackingRequestOrBuilder
            public boolean hasLatencyMs() {
                return ((com.moloco.sdk.MetricsRequest.SDKInitTrackingRequest) this.instance).hasLatencyMs();
            }

            @Override // com.moloco.sdk.MetricsRequest.SDKInitTrackingRequestOrBuilder
            public long getLatencyMs() {
                return ((com.moloco.sdk.MetricsRequest.SDKInitTrackingRequest) this.instance).getLatencyMs();
            }

            public com.moloco.sdk.MetricsRequest.SDKInitTrackingRequest.Builder setLatencyMs(long j) {
                copyOnWrite();
                ((com.moloco.sdk.MetricsRequest.SDKInitTrackingRequest) this.instance).setLatencyMs(j);
                return this;
            }

            public com.moloco.sdk.MetricsRequest.SDKInitTrackingRequest.Builder clearLatencyMs() {
                copyOnWrite();
                ((com.moloco.sdk.MetricsRequest.SDKInitTrackingRequest) this.instance).clearLatencyMs();
                return this;
            }
        }

        @Override // com.google.protobuf.GeneratedMessageLite
        protected final java.lang.Object dynamicMethod(com.google.protobuf.GeneratedMessageLite.MethodToInvoke methodToInvoke, java.lang.Object obj, java.lang.Object obj2) {
            switch (com.moloco.sdk.MetricsRequest.AnonymousClass1.$SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke[methodToInvoke.ordinal()]) {
                case 1:
                    return new com.moloco.sdk.MetricsRequest.SDKInitTrackingRequest();
                case 2:
                    return new com.moloco.sdk.MetricsRequest.SDKInitTrackingRequest.Builder();
                case 3:
                    return newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0003\u0001\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001<\u0000\u0002<\u0000\u0003ဃ\u0000", new java.lang.Object[]{"initStatus_", "initStatusCase_", "bitField0_", com.moloco.sdk.MetricsRequest.SDKInitSuccessTrackingRequest.class, com.moloco.sdk.MetricsRequest.SDKInitFailureTrackingRequest.class, "latencyMs_"});
                case 4:
                    return DEFAULT_INSTANCE;
                case 5:
                    com.google.protobuf.Parser<com.moloco.sdk.MetricsRequest.SDKInitTrackingRequest> parser = PARSER;
                    if (parser == null) {
                        synchronized (com.moloco.sdk.MetricsRequest.SDKInitTrackingRequest.class) {
                            parser = PARSER;
                            if (parser == null) {
                                parser = new com.google.protobuf.GeneratedMessageLite.DefaultInstanceBasedParser<>(DEFAULT_INSTANCE);
                                PARSER = parser;
                            }
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

        static {
            com.moloco.sdk.MetricsRequest.SDKInitTrackingRequest sDKInitTrackingRequest = new com.moloco.sdk.MetricsRequest.SDKInitTrackingRequest();
            DEFAULT_INSTANCE = sDKInitTrackingRequest;
            com.google.protobuf.GeneratedMessageLite.registerDefaultInstance(com.moloco.sdk.MetricsRequest.SDKInitTrackingRequest.class, sDKInitTrackingRequest);
        }

        public static com.moloco.sdk.MetricsRequest.SDKInitTrackingRequest getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static com.google.protobuf.Parser<com.moloco.sdk.MetricsRequest.SDKInitTrackingRequest> parser() {
            return DEFAULT_INSTANCE.getParserForType();
        }
    }

    public static final class SDKInitSuccessTrackingRequest extends com.google.protobuf.GeneratedMessageLite<com.moloco.sdk.MetricsRequest.SDKInitSuccessTrackingRequest, com.moloco.sdk.MetricsRequest.SDKInitSuccessTrackingRequest.Builder> implements com.moloco.sdk.MetricsRequest.SDKInitSuccessTrackingRequestOrBuilder {
        private static final com.moloco.sdk.MetricsRequest.SDKInitSuccessTrackingRequest DEFAULT_INSTANCE;
        private static volatile com.google.protobuf.Parser<com.moloco.sdk.MetricsRequest.SDKInitSuccessTrackingRequest> PARSER;

        private SDKInitSuccessTrackingRequest() {
        }

        public static com.moloco.sdk.MetricsRequest.SDKInitSuccessTrackingRequest parseFrom(java.nio.ByteBuffer byteBuffer) throws com.google.protobuf.InvalidProtocolBufferException {
            return (com.moloco.sdk.MetricsRequest.SDKInitSuccessTrackingRequest) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
        }

        public static com.moloco.sdk.MetricsRequest.SDKInitSuccessTrackingRequest parseFrom(java.nio.ByteBuffer byteBuffer, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) throws com.google.protobuf.InvalidProtocolBufferException {
            return (com.moloco.sdk.MetricsRequest.SDKInitSuccessTrackingRequest) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
        }

        public static com.moloco.sdk.MetricsRequest.SDKInitSuccessTrackingRequest parseFrom(com.google.protobuf.ByteString byteString) throws com.google.protobuf.InvalidProtocolBufferException {
            return (com.moloco.sdk.MetricsRequest.SDKInitSuccessTrackingRequest) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
        }

        public static com.moloco.sdk.MetricsRequest.SDKInitSuccessTrackingRequest parseFrom(com.google.protobuf.ByteString byteString, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) throws com.google.protobuf.InvalidProtocolBufferException {
            return (com.moloco.sdk.MetricsRequest.SDKInitSuccessTrackingRequest) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
        }

        public static com.moloco.sdk.MetricsRequest.SDKInitSuccessTrackingRequest parseFrom(byte[] bArr) throws com.google.protobuf.InvalidProtocolBufferException {
            return (com.moloco.sdk.MetricsRequest.SDKInitSuccessTrackingRequest) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
        }

        public static com.moloco.sdk.MetricsRequest.SDKInitSuccessTrackingRequest parseFrom(byte[] bArr, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) throws com.google.protobuf.InvalidProtocolBufferException {
            return (com.moloco.sdk.MetricsRequest.SDKInitSuccessTrackingRequest) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
        }

        public static com.moloco.sdk.MetricsRequest.SDKInitSuccessTrackingRequest parseFrom(java.io.InputStream inputStream) throws java.io.IOException {
            return (com.moloco.sdk.MetricsRequest.SDKInitSuccessTrackingRequest) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static com.moloco.sdk.MetricsRequest.SDKInitSuccessTrackingRequest parseFrom(java.io.InputStream inputStream, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) throws java.io.IOException {
            return (com.moloco.sdk.MetricsRequest.SDKInitSuccessTrackingRequest) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
        }

        public static com.moloco.sdk.MetricsRequest.SDKInitSuccessTrackingRequest parseDelimitedFrom(java.io.InputStream inputStream) throws java.io.IOException {
            return (com.moloco.sdk.MetricsRequest.SDKInitSuccessTrackingRequest) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static com.moloco.sdk.MetricsRequest.SDKInitSuccessTrackingRequest parseDelimitedFrom(java.io.InputStream inputStream, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) throws java.io.IOException {
            return (com.moloco.sdk.MetricsRequest.SDKInitSuccessTrackingRequest) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
        }

        public static com.moloco.sdk.MetricsRequest.SDKInitSuccessTrackingRequest parseFrom(com.google.protobuf.CodedInputStream codedInputStream) throws java.io.IOException {
            return (com.moloco.sdk.MetricsRequest.SDKInitSuccessTrackingRequest) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
        }

        public static com.moloco.sdk.MetricsRequest.SDKInitSuccessTrackingRequest parseFrom(com.google.protobuf.CodedInputStream codedInputStream, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) throws java.io.IOException {
            return (com.moloco.sdk.MetricsRequest.SDKInitSuccessTrackingRequest) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
        }

        public static com.moloco.sdk.MetricsRequest.SDKInitSuccessTrackingRequest.Builder newBuilder() {
            return DEFAULT_INSTANCE.createBuilder();
        }

        public static com.moloco.sdk.MetricsRequest.SDKInitSuccessTrackingRequest.Builder newBuilder(com.moloco.sdk.MetricsRequest.SDKInitSuccessTrackingRequest sDKInitSuccessTrackingRequest) {
            return DEFAULT_INSTANCE.createBuilder(sDKInitSuccessTrackingRequest);
        }

        public static final class Builder extends com.google.protobuf.GeneratedMessageLite.Builder<com.moloco.sdk.MetricsRequest.SDKInitSuccessTrackingRequest, com.moloco.sdk.MetricsRequest.SDKInitSuccessTrackingRequest.Builder> implements com.moloco.sdk.MetricsRequest.SDKInitSuccessTrackingRequestOrBuilder {
            private Builder() {
                super(com.moloco.sdk.MetricsRequest.SDKInitSuccessTrackingRequest.DEFAULT_INSTANCE);
            }
        }

        @Override // com.google.protobuf.GeneratedMessageLite
        protected final java.lang.Object dynamicMethod(com.google.protobuf.GeneratedMessageLite.MethodToInvoke methodToInvoke, java.lang.Object obj, java.lang.Object obj2) {
            switch (com.moloco.sdk.MetricsRequest.AnonymousClass1.$SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke[methodToInvoke.ordinal()]) {
                case 1:
                    return new com.moloco.sdk.MetricsRequest.SDKInitSuccessTrackingRequest();
                case 2:
                    return new com.moloco.sdk.MetricsRequest.SDKInitSuccessTrackingRequest.Builder();
                case 3:
                    return newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0000", null);
                case 4:
                    return DEFAULT_INSTANCE;
                case 5:
                    com.google.protobuf.Parser<com.moloco.sdk.MetricsRequest.SDKInitSuccessTrackingRequest> parser = PARSER;
                    if (parser == null) {
                        synchronized (com.moloco.sdk.MetricsRequest.SDKInitSuccessTrackingRequest.class) {
                            parser = PARSER;
                            if (parser == null) {
                                parser = new com.google.protobuf.GeneratedMessageLite.DefaultInstanceBasedParser<>(DEFAULT_INSTANCE);
                                PARSER = parser;
                            }
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

        static {
            com.moloco.sdk.MetricsRequest.SDKInitSuccessTrackingRequest sDKInitSuccessTrackingRequest = new com.moloco.sdk.MetricsRequest.SDKInitSuccessTrackingRequest();
            DEFAULT_INSTANCE = sDKInitSuccessTrackingRequest;
            com.google.protobuf.GeneratedMessageLite.registerDefaultInstance(com.moloco.sdk.MetricsRequest.SDKInitSuccessTrackingRequest.class, sDKInitSuccessTrackingRequest);
        }

        public static com.moloco.sdk.MetricsRequest.SDKInitSuccessTrackingRequest getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static com.google.protobuf.Parser<com.moloco.sdk.MetricsRequest.SDKInitSuccessTrackingRequest> parser() {
            return DEFAULT_INSTANCE.getParserForType();
        }
    }

    public static final class SDKInitFailureTrackingRequest extends com.google.protobuf.GeneratedMessageLite<com.moloco.sdk.MetricsRequest.SDKInitFailureTrackingRequest, com.moloco.sdk.MetricsRequest.SDKInitFailureTrackingRequest.Builder> implements com.moloco.sdk.MetricsRequest.SDKInitFailureTrackingRequestOrBuilder {
        public static final int CLIENT_ERROR_FIELD_NUMBER = 2;
        private static final com.moloco.sdk.MetricsRequest.SDKInitFailureTrackingRequest DEFAULT_INSTANCE;
        private static volatile com.google.protobuf.Parser<com.moloco.sdk.MetricsRequest.SDKInitFailureTrackingRequest> PARSER = null;
        public static final int SERVER_ERROR_FIELD_NUMBER = 1;
        private int errorTypeCase_ = 0;
        private java.lang.Object errorType_;

        public interface ClientErrorOrBuilder extends com.google.protobuf.MessageLiteOrBuilder {
            com.moloco.sdk.MetricsRequest.SDKInitFailureTrackingRequest.ClientError.ClientErrorTypes getClientFailureType();

            int getClientFailureTypeValue();

            boolean hasClientFailureType();
        }

        public interface ServerErrorOrBuilder extends com.google.protobuf.MessageLiteOrBuilder {
            int getServerHttpStatus();

            boolean hasServerHttpStatus();
        }

        private SDKInitFailureTrackingRequest() {
        }

        public static final class ServerError extends com.google.protobuf.GeneratedMessageLite<com.moloco.sdk.MetricsRequest.SDKInitFailureTrackingRequest.ServerError, com.moloco.sdk.MetricsRequest.SDKInitFailureTrackingRequest.ServerError.Builder> implements com.moloco.sdk.MetricsRequest.SDKInitFailureTrackingRequest.ServerErrorOrBuilder {
            private static final com.moloco.sdk.MetricsRequest.SDKInitFailureTrackingRequest.ServerError DEFAULT_INSTANCE;
            private static volatile com.google.protobuf.Parser<com.moloco.sdk.MetricsRequest.SDKInitFailureTrackingRequest.ServerError> PARSER = null;
            public static final int SERVER_HTTP_STATUS_FIELD_NUMBER = 1;
            private int bitField0_;
            private int serverHttpStatus_;

            private ServerError() {
            }

            @Override // com.moloco.sdk.MetricsRequest.SDKInitFailureTrackingRequest.ServerErrorOrBuilder
            public boolean hasServerHttpStatus() {
                return (this.bitField0_ & 1) != 0;
            }

            @Override // com.moloco.sdk.MetricsRequest.SDKInitFailureTrackingRequest.ServerErrorOrBuilder
            public int getServerHttpStatus() {
                return this.serverHttpStatus_;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public void setServerHttpStatus(int i) {
                this.bitField0_ |= 1;
                this.serverHttpStatus_ = i;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public void clearServerHttpStatus() {
                this.bitField0_ &= -2;
                this.serverHttpStatus_ = 0;
            }

            public static com.moloco.sdk.MetricsRequest.SDKInitFailureTrackingRequest.ServerError parseFrom(java.nio.ByteBuffer byteBuffer) throws com.google.protobuf.InvalidProtocolBufferException {
                return (com.moloco.sdk.MetricsRequest.SDKInitFailureTrackingRequest.ServerError) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
            }

            public static com.moloco.sdk.MetricsRequest.SDKInitFailureTrackingRequest.ServerError parseFrom(java.nio.ByteBuffer byteBuffer, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) throws com.google.protobuf.InvalidProtocolBufferException {
                return (com.moloco.sdk.MetricsRequest.SDKInitFailureTrackingRequest.ServerError) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
            }

            public static com.moloco.sdk.MetricsRequest.SDKInitFailureTrackingRequest.ServerError parseFrom(com.google.protobuf.ByteString byteString) throws com.google.protobuf.InvalidProtocolBufferException {
                return (com.moloco.sdk.MetricsRequest.SDKInitFailureTrackingRequest.ServerError) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
            }

            public static com.moloco.sdk.MetricsRequest.SDKInitFailureTrackingRequest.ServerError parseFrom(com.google.protobuf.ByteString byteString, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) throws com.google.protobuf.InvalidProtocolBufferException {
                return (com.moloco.sdk.MetricsRequest.SDKInitFailureTrackingRequest.ServerError) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
            }

            public static com.moloco.sdk.MetricsRequest.SDKInitFailureTrackingRequest.ServerError parseFrom(byte[] bArr) throws com.google.protobuf.InvalidProtocolBufferException {
                return (com.moloco.sdk.MetricsRequest.SDKInitFailureTrackingRequest.ServerError) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
            }

            public static com.moloco.sdk.MetricsRequest.SDKInitFailureTrackingRequest.ServerError parseFrom(byte[] bArr, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) throws com.google.protobuf.InvalidProtocolBufferException {
                return (com.moloco.sdk.MetricsRequest.SDKInitFailureTrackingRequest.ServerError) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
            }

            public static com.moloco.sdk.MetricsRequest.SDKInitFailureTrackingRequest.ServerError parseFrom(java.io.InputStream inputStream) throws java.io.IOException {
                return (com.moloco.sdk.MetricsRequest.SDKInitFailureTrackingRequest.ServerError) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
            }

            public static com.moloco.sdk.MetricsRequest.SDKInitFailureTrackingRequest.ServerError parseFrom(java.io.InputStream inputStream, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) throws java.io.IOException {
                return (com.moloco.sdk.MetricsRequest.SDKInitFailureTrackingRequest.ServerError) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
            }

            public static com.moloco.sdk.MetricsRequest.SDKInitFailureTrackingRequest.ServerError parseDelimitedFrom(java.io.InputStream inputStream) throws java.io.IOException {
                return (com.moloco.sdk.MetricsRequest.SDKInitFailureTrackingRequest.ServerError) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
            }

            public static com.moloco.sdk.MetricsRequest.SDKInitFailureTrackingRequest.ServerError parseDelimitedFrom(java.io.InputStream inputStream, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) throws java.io.IOException {
                return (com.moloco.sdk.MetricsRequest.SDKInitFailureTrackingRequest.ServerError) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
            }

            public static com.moloco.sdk.MetricsRequest.SDKInitFailureTrackingRequest.ServerError parseFrom(com.google.protobuf.CodedInputStream codedInputStream) throws java.io.IOException {
                return (com.moloco.sdk.MetricsRequest.SDKInitFailureTrackingRequest.ServerError) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
            }

            public static com.moloco.sdk.MetricsRequest.SDKInitFailureTrackingRequest.ServerError parseFrom(com.google.protobuf.CodedInputStream codedInputStream, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) throws java.io.IOException {
                return (com.moloco.sdk.MetricsRequest.SDKInitFailureTrackingRequest.ServerError) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
            }

            public static com.moloco.sdk.MetricsRequest.SDKInitFailureTrackingRequest.ServerError.Builder newBuilder() {
                return DEFAULT_INSTANCE.createBuilder();
            }

            public static com.moloco.sdk.MetricsRequest.SDKInitFailureTrackingRequest.ServerError.Builder newBuilder(com.moloco.sdk.MetricsRequest.SDKInitFailureTrackingRequest.ServerError serverError) {
                return DEFAULT_INSTANCE.createBuilder(serverError);
            }

            public static final class Builder extends com.google.protobuf.GeneratedMessageLite.Builder<com.moloco.sdk.MetricsRequest.SDKInitFailureTrackingRequest.ServerError, com.moloco.sdk.MetricsRequest.SDKInitFailureTrackingRequest.ServerError.Builder> implements com.moloco.sdk.MetricsRequest.SDKInitFailureTrackingRequest.ServerErrorOrBuilder {
                private Builder() {
                    super(com.moloco.sdk.MetricsRequest.SDKInitFailureTrackingRequest.ServerError.DEFAULT_INSTANCE);
                }

                @Override // com.moloco.sdk.MetricsRequest.SDKInitFailureTrackingRequest.ServerErrorOrBuilder
                public boolean hasServerHttpStatus() {
                    return ((com.moloco.sdk.MetricsRequest.SDKInitFailureTrackingRequest.ServerError) this.instance).hasServerHttpStatus();
                }

                @Override // com.moloco.sdk.MetricsRequest.SDKInitFailureTrackingRequest.ServerErrorOrBuilder
                public int getServerHttpStatus() {
                    return ((com.moloco.sdk.MetricsRequest.SDKInitFailureTrackingRequest.ServerError) this.instance).getServerHttpStatus();
                }

                public com.moloco.sdk.MetricsRequest.SDKInitFailureTrackingRequest.ServerError.Builder setServerHttpStatus(int i) {
                    copyOnWrite();
                    ((com.moloco.sdk.MetricsRequest.SDKInitFailureTrackingRequest.ServerError) this.instance).setServerHttpStatus(i);
                    return this;
                }

                public com.moloco.sdk.MetricsRequest.SDKInitFailureTrackingRequest.ServerError.Builder clearServerHttpStatus() {
                    copyOnWrite();
                    ((com.moloco.sdk.MetricsRequest.SDKInitFailureTrackingRequest.ServerError) this.instance).clearServerHttpStatus();
                    return this;
                }
            }

            @Override // com.google.protobuf.GeneratedMessageLite
            protected final java.lang.Object dynamicMethod(com.google.protobuf.GeneratedMessageLite.MethodToInvoke methodToInvoke, java.lang.Object obj, java.lang.Object obj2) {
                switch (com.moloco.sdk.MetricsRequest.AnonymousClass1.$SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke[methodToInvoke.ordinal()]) {
                    case 1:
                        return new com.moloco.sdk.MetricsRequest.SDKInitFailureTrackingRequest.ServerError();
                    case 2:
                        return new com.moloco.sdk.MetricsRequest.SDKInitFailureTrackingRequest.ServerError.Builder();
                    case 3:
                        return newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဋ\u0000", new java.lang.Object[]{"bitField0_", "serverHttpStatus_"});
                    case 4:
                        return DEFAULT_INSTANCE;
                    case 5:
                        com.google.protobuf.Parser<com.moloco.sdk.MetricsRequest.SDKInitFailureTrackingRequest.ServerError> parser = PARSER;
                        if (parser == null) {
                            synchronized (com.moloco.sdk.MetricsRequest.SDKInitFailureTrackingRequest.ServerError.class) {
                                parser = PARSER;
                                if (parser == null) {
                                    parser = new com.google.protobuf.GeneratedMessageLite.DefaultInstanceBasedParser<>(DEFAULT_INSTANCE);
                                    PARSER = parser;
                                }
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

            static {
                com.moloco.sdk.MetricsRequest.SDKInitFailureTrackingRequest.ServerError serverError = new com.moloco.sdk.MetricsRequest.SDKInitFailureTrackingRequest.ServerError();
                DEFAULT_INSTANCE = serverError;
                com.google.protobuf.GeneratedMessageLite.registerDefaultInstance(com.moloco.sdk.MetricsRequest.SDKInitFailureTrackingRequest.ServerError.class, serverError);
            }

            public static com.moloco.sdk.MetricsRequest.SDKInitFailureTrackingRequest.ServerError getDefaultInstance() {
                return DEFAULT_INSTANCE;
            }

            public static com.google.protobuf.Parser<com.moloco.sdk.MetricsRequest.SDKInitFailureTrackingRequest.ServerError> parser() {
                return DEFAULT_INSTANCE.getParserForType();
            }
        }

        public static final class ClientError extends com.google.protobuf.GeneratedMessageLite<com.moloco.sdk.MetricsRequest.SDKInitFailureTrackingRequest.ClientError, com.moloco.sdk.MetricsRequest.SDKInitFailureTrackingRequest.ClientError.Builder> implements com.moloco.sdk.MetricsRequest.SDKInitFailureTrackingRequest.ClientErrorOrBuilder {
            public static final int CLIENT_FAILURE_TYPE_FIELD_NUMBER = 1;
            private static final com.moloco.sdk.MetricsRequest.SDKInitFailureTrackingRequest.ClientError DEFAULT_INSTANCE;
            private static volatile com.google.protobuf.Parser<com.moloco.sdk.MetricsRequest.SDKInitFailureTrackingRequest.ClientError> PARSER;
            private int bitField0_;
            private int clientFailureType_;

            private ClientError() {
            }

            public enum ClientErrorTypes implements com.google.protobuf.Internal.EnumLite {
                UNKNOWN(0),
                HTTP_SSL_ERROR(1),
                HTTP_UKNOWN_HOST(2),
                HTTP_REQUEST_TIMEOUT(3),
                HTTP_SOCKET(4),
                ANDROID_WORK_MANAGER_ISSUE(5),
                UNRECOGNIZED(-1);

                public static final int ANDROID_WORK_MANAGER_ISSUE_VALUE = 5;
                public static final int HTTP_REQUEST_TIMEOUT_VALUE = 3;
                public static final int HTTP_SOCKET_VALUE = 4;
                public static final int HTTP_SSL_ERROR_VALUE = 1;
                public static final int HTTP_UKNOWN_HOST_VALUE = 2;
                public static final int UNKNOWN_VALUE = 0;
                private static final com.google.protobuf.Internal.EnumLiteMap<com.moloco.sdk.MetricsRequest.SDKInitFailureTrackingRequest.ClientError.ClientErrorTypes> internalValueMap = new com.google.protobuf.Internal.EnumLiteMap<com.moloco.sdk.MetricsRequest.SDKInitFailureTrackingRequest.ClientError.ClientErrorTypes>() { // from class: com.moloco.sdk.MetricsRequest.SDKInitFailureTrackingRequest.ClientError.ClientErrorTypes.1
                    @Override // com.google.protobuf.Internal.EnumLiteMap
                    public com.moloco.sdk.MetricsRequest.SDKInitFailureTrackingRequest.ClientError.ClientErrorTypes findValueByNumber(int i) {
                        return com.moloco.sdk.MetricsRequest.SDKInitFailureTrackingRequest.ClientError.ClientErrorTypes.forNumber(i);
                    }
                };
                private final int value;

                @Override // com.google.protobuf.Internal.EnumLite
                public final int getNumber() {
                    if (this == UNRECOGNIZED) {
                        throw new java.lang.IllegalArgumentException("Can't get the number of an unknown enum value.");
                    }
                    return this.value;
                }

                @java.lang.Deprecated
                public static com.moloco.sdk.MetricsRequest.SDKInitFailureTrackingRequest.ClientError.ClientErrorTypes valueOf(int i) {
                    return forNumber(i);
                }

                public static com.moloco.sdk.MetricsRequest.SDKInitFailureTrackingRequest.ClientError.ClientErrorTypes forNumber(int i) {
                    if (i == 0) {
                        return UNKNOWN;
                    }
                    if (i == 1) {
                        return HTTP_SSL_ERROR;
                    }
                    if (i == 2) {
                        return HTTP_UKNOWN_HOST;
                    }
                    if (i == 3) {
                        return HTTP_REQUEST_TIMEOUT;
                    }
                    if (i == 4) {
                        return HTTP_SOCKET;
                    }
                    if (i != 5) {
                        return null;
                    }
                    return ANDROID_WORK_MANAGER_ISSUE;
                }

                public static com.google.protobuf.Internal.EnumLiteMap<com.moloco.sdk.MetricsRequest.SDKInitFailureTrackingRequest.ClientError.ClientErrorTypes> internalGetValueMap() {
                    return internalValueMap;
                }

                public static com.google.protobuf.Internal.EnumVerifier internalGetVerifier() {
                    return com.moloco.sdk.MetricsRequest.SDKInitFailureTrackingRequest.ClientError.ClientErrorTypes.ClientErrorTypesVerifier.INSTANCE;
                }

                private static final class ClientErrorTypesVerifier implements com.google.protobuf.Internal.EnumVerifier {
                    static final com.google.protobuf.Internal.EnumVerifier INSTANCE = new com.moloco.sdk.MetricsRequest.SDKInitFailureTrackingRequest.ClientError.ClientErrorTypes.ClientErrorTypesVerifier();

                    private ClientErrorTypesVerifier() {
                    }

                    @Override // com.google.protobuf.Internal.EnumVerifier
                    public boolean isInRange(int i) {
                        return com.moloco.sdk.MetricsRequest.SDKInitFailureTrackingRequest.ClientError.ClientErrorTypes.forNumber(i) != null;
                    }
                }

                ClientErrorTypes(int i) {
                    this.value = i;
                }
            }

            @Override // com.moloco.sdk.MetricsRequest.SDKInitFailureTrackingRequest.ClientErrorOrBuilder
            public boolean hasClientFailureType() {
                return (this.bitField0_ & 1) != 0;
            }

            @Override // com.moloco.sdk.MetricsRequest.SDKInitFailureTrackingRequest.ClientErrorOrBuilder
            public int getClientFailureTypeValue() {
                return this.clientFailureType_;
            }

            @Override // com.moloco.sdk.MetricsRequest.SDKInitFailureTrackingRequest.ClientErrorOrBuilder
            public com.moloco.sdk.MetricsRequest.SDKInitFailureTrackingRequest.ClientError.ClientErrorTypes getClientFailureType() {
                com.moloco.sdk.MetricsRequest.SDKInitFailureTrackingRequest.ClientError.ClientErrorTypes forNumber = com.moloco.sdk.MetricsRequest.SDKInitFailureTrackingRequest.ClientError.ClientErrorTypes.forNumber(this.clientFailureType_);
                return forNumber == null ? com.moloco.sdk.MetricsRequest.SDKInitFailureTrackingRequest.ClientError.ClientErrorTypes.UNRECOGNIZED : forNumber;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public void setClientFailureTypeValue(int i) {
                this.bitField0_ |= 1;
                this.clientFailureType_ = i;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public void setClientFailureType(com.moloco.sdk.MetricsRequest.SDKInitFailureTrackingRequest.ClientError.ClientErrorTypes clientErrorTypes) {
                this.clientFailureType_ = clientErrorTypes.getNumber();
                this.bitField0_ |= 1;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public void clearClientFailureType() {
                this.bitField0_ &= -2;
                this.clientFailureType_ = 0;
            }

            public static com.moloco.sdk.MetricsRequest.SDKInitFailureTrackingRequest.ClientError parseFrom(java.nio.ByteBuffer byteBuffer) throws com.google.protobuf.InvalidProtocolBufferException {
                return (com.moloco.sdk.MetricsRequest.SDKInitFailureTrackingRequest.ClientError) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
            }

            public static com.moloco.sdk.MetricsRequest.SDKInitFailureTrackingRequest.ClientError parseFrom(java.nio.ByteBuffer byteBuffer, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) throws com.google.protobuf.InvalidProtocolBufferException {
                return (com.moloco.sdk.MetricsRequest.SDKInitFailureTrackingRequest.ClientError) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
            }

            public static com.moloco.sdk.MetricsRequest.SDKInitFailureTrackingRequest.ClientError parseFrom(com.google.protobuf.ByteString byteString) throws com.google.protobuf.InvalidProtocolBufferException {
                return (com.moloco.sdk.MetricsRequest.SDKInitFailureTrackingRequest.ClientError) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
            }

            public static com.moloco.sdk.MetricsRequest.SDKInitFailureTrackingRequest.ClientError parseFrom(com.google.protobuf.ByteString byteString, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) throws com.google.protobuf.InvalidProtocolBufferException {
                return (com.moloco.sdk.MetricsRequest.SDKInitFailureTrackingRequest.ClientError) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
            }

            public static com.moloco.sdk.MetricsRequest.SDKInitFailureTrackingRequest.ClientError parseFrom(byte[] bArr) throws com.google.protobuf.InvalidProtocolBufferException {
                return (com.moloco.sdk.MetricsRequest.SDKInitFailureTrackingRequest.ClientError) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
            }

            public static com.moloco.sdk.MetricsRequest.SDKInitFailureTrackingRequest.ClientError parseFrom(byte[] bArr, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) throws com.google.protobuf.InvalidProtocolBufferException {
                return (com.moloco.sdk.MetricsRequest.SDKInitFailureTrackingRequest.ClientError) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
            }

            public static com.moloco.sdk.MetricsRequest.SDKInitFailureTrackingRequest.ClientError parseFrom(java.io.InputStream inputStream) throws java.io.IOException {
                return (com.moloco.sdk.MetricsRequest.SDKInitFailureTrackingRequest.ClientError) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
            }

            public static com.moloco.sdk.MetricsRequest.SDKInitFailureTrackingRequest.ClientError parseFrom(java.io.InputStream inputStream, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) throws java.io.IOException {
                return (com.moloco.sdk.MetricsRequest.SDKInitFailureTrackingRequest.ClientError) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
            }

            public static com.moloco.sdk.MetricsRequest.SDKInitFailureTrackingRequest.ClientError parseDelimitedFrom(java.io.InputStream inputStream) throws java.io.IOException {
                return (com.moloco.sdk.MetricsRequest.SDKInitFailureTrackingRequest.ClientError) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
            }

            public static com.moloco.sdk.MetricsRequest.SDKInitFailureTrackingRequest.ClientError parseDelimitedFrom(java.io.InputStream inputStream, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) throws java.io.IOException {
                return (com.moloco.sdk.MetricsRequest.SDKInitFailureTrackingRequest.ClientError) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
            }

            public static com.moloco.sdk.MetricsRequest.SDKInitFailureTrackingRequest.ClientError parseFrom(com.google.protobuf.CodedInputStream codedInputStream) throws java.io.IOException {
                return (com.moloco.sdk.MetricsRequest.SDKInitFailureTrackingRequest.ClientError) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
            }

            public static com.moloco.sdk.MetricsRequest.SDKInitFailureTrackingRequest.ClientError parseFrom(com.google.protobuf.CodedInputStream codedInputStream, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) throws java.io.IOException {
                return (com.moloco.sdk.MetricsRequest.SDKInitFailureTrackingRequest.ClientError) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
            }

            public static com.moloco.sdk.MetricsRequest.SDKInitFailureTrackingRequest.ClientError.Builder newBuilder() {
                return DEFAULT_INSTANCE.createBuilder();
            }

            public static com.moloco.sdk.MetricsRequest.SDKInitFailureTrackingRequest.ClientError.Builder newBuilder(com.moloco.sdk.MetricsRequest.SDKInitFailureTrackingRequest.ClientError clientError) {
                return DEFAULT_INSTANCE.createBuilder(clientError);
            }

            public static final class Builder extends com.google.protobuf.GeneratedMessageLite.Builder<com.moloco.sdk.MetricsRequest.SDKInitFailureTrackingRequest.ClientError, com.moloco.sdk.MetricsRequest.SDKInitFailureTrackingRequest.ClientError.Builder> implements com.moloco.sdk.MetricsRequest.SDKInitFailureTrackingRequest.ClientErrorOrBuilder {
                private Builder() {
                    super(com.moloco.sdk.MetricsRequest.SDKInitFailureTrackingRequest.ClientError.DEFAULT_INSTANCE);
                }

                @Override // com.moloco.sdk.MetricsRequest.SDKInitFailureTrackingRequest.ClientErrorOrBuilder
                public boolean hasClientFailureType() {
                    return ((com.moloco.sdk.MetricsRequest.SDKInitFailureTrackingRequest.ClientError) this.instance).hasClientFailureType();
                }

                @Override // com.moloco.sdk.MetricsRequest.SDKInitFailureTrackingRequest.ClientErrorOrBuilder
                public int getClientFailureTypeValue() {
                    return ((com.moloco.sdk.MetricsRequest.SDKInitFailureTrackingRequest.ClientError) this.instance).getClientFailureTypeValue();
                }

                public com.moloco.sdk.MetricsRequest.SDKInitFailureTrackingRequest.ClientError.Builder setClientFailureTypeValue(int i) {
                    copyOnWrite();
                    ((com.moloco.sdk.MetricsRequest.SDKInitFailureTrackingRequest.ClientError) this.instance).setClientFailureTypeValue(i);
                    return this;
                }

                @Override // com.moloco.sdk.MetricsRequest.SDKInitFailureTrackingRequest.ClientErrorOrBuilder
                public com.moloco.sdk.MetricsRequest.SDKInitFailureTrackingRequest.ClientError.ClientErrorTypes getClientFailureType() {
                    return ((com.moloco.sdk.MetricsRequest.SDKInitFailureTrackingRequest.ClientError) this.instance).getClientFailureType();
                }

                public com.moloco.sdk.MetricsRequest.SDKInitFailureTrackingRequest.ClientError.Builder setClientFailureType(com.moloco.sdk.MetricsRequest.SDKInitFailureTrackingRequest.ClientError.ClientErrorTypes clientErrorTypes) {
                    copyOnWrite();
                    ((com.moloco.sdk.MetricsRequest.SDKInitFailureTrackingRequest.ClientError) this.instance).setClientFailureType(clientErrorTypes);
                    return this;
                }

                public com.moloco.sdk.MetricsRequest.SDKInitFailureTrackingRequest.ClientError.Builder clearClientFailureType() {
                    copyOnWrite();
                    ((com.moloco.sdk.MetricsRequest.SDKInitFailureTrackingRequest.ClientError) this.instance).clearClientFailureType();
                    return this;
                }
            }

            @Override // com.google.protobuf.GeneratedMessageLite
            protected final java.lang.Object dynamicMethod(com.google.protobuf.GeneratedMessageLite.MethodToInvoke methodToInvoke, java.lang.Object obj, java.lang.Object obj2) {
                switch (com.moloco.sdk.MetricsRequest.AnonymousClass1.$SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke[methodToInvoke.ordinal()]) {
                    case 1:
                        return new com.moloco.sdk.MetricsRequest.SDKInitFailureTrackingRequest.ClientError();
                    case 2:
                        return new com.moloco.sdk.MetricsRequest.SDKInitFailureTrackingRequest.ClientError.Builder();
                    case 3:
                        return newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဌ\u0000", new java.lang.Object[]{"bitField0_", "clientFailureType_"});
                    case 4:
                        return DEFAULT_INSTANCE;
                    case 5:
                        com.google.protobuf.Parser<com.moloco.sdk.MetricsRequest.SDKInitFailureTrackingRequest.ClientError> parser = PARSER;
                        if (parser == null) {
                            synchronized (com.moloco.sdk.MetricsRequest.SDKInitFailureTrackingRequest.ClientError.class) {
                                parser = PARSER;
                                if (parser == null) {
                                    parser = new com.google.protobuf.GeneratedMessageLite.DefaultInstanceBasedParser<>(DEFAULT_INSTANCE);
                                    PARSER = parser;
                                }
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

            static {
                com.moloco.sdk.MetricsRequest.SDKInitFailureTrackingRequest.ClientError clientError = new com.moloco.sdk.MetricsRequest.SDKInitFailureTrackingRequest.ClientError();
                DEFAULT_INSTANCE = clientError;
                com.google.protobuf.GeneratedMessageLite.registerDefaultInstance(com.moloco.sdk.MetricsRequest.SDKInitFailureTrackingRequest.ClientError.class, clientError);
            }

            public static com.moloco.sdk.MetricsRequest.SDKInitFailureTrackingRequest.ClientError getDefaultInstance() {
                return DEFAULT_INSTANCE;
            }

            public static com.google.protobuf.Parser<com.moloco.sdk.MetricsRequest.SDKInitFailureTrackingRequest.ClientError> parser() {
                return DEFAULT_INSTANCE.getParserForType();
            }
        }

        public enum ErrorTypeCase {
            SERVER_ERROR(1),
            CLIENT_ERROR(2),
            ERRORTYPE_NOT_SET(0);

            private final int value;

            ErrorTypeCase(int i) {
                this.value = i;
            }

            @java.lang.Deprecated
            public static com.moloco.sdk.MetricsRequest.SDKInitFailureTrackingRequest.ErrorTypeCase valueOf(int i) {
                return forNumber(i);
            }

            public static com.moloco.sdk.MetricsRequest.SDKInitFailureTrackingRequest.ErrorTypeCase forNumber(int i) {
                if (i == 0) {
                    return ERRORTYPE_NOT_SET;
                }
                if (i == 1) {
                    return SERVER_ERROR;
                }
                if (i != 2) {
                    return null;
                }
                return CLIENT_ERROR;
            }

            public int getNumber() {
                return this.value;
            }
        }

        @Override // com.moloco.sdk.MetricsRequest.SDKInitFailureTrackingRequestOrBuilder
        public com.moloco.sdk.MetricsRequest.SDKInitFailureTrackingRequest.ErrorTypeCase getErrorTypeCase() {
            return com.moloco.sdk.MetricsRequest.SDKInitFailureTrackingRequest.ErrorTypeCase.forNumber(this.errorTypeCase_);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearErrorType() {
            this.errorTypeCase_ = 0;
            this.errorType_ = null;
        }

        @Override // com.moloco.sdk.MetricsRequest.SDKInitFailureTrackingRequestOrBuilder
        public boolean hasServerError() {
            return this.errorTypeCase_ == 1;
        }

        @Override // com.moloco.sdk.MetricsRequest.SDKInitFailureTrackingRequestOrBuilder
        public com.moloco.sdk.MetricsRequest.SDKInitFailureTrackingRequest.ServerError getServerError() {
            if (this.errorTypeCase_ == 1) {
                return (com.moloco.sdk.MetricsRequest.SDKInitFailureTrackingRequest.ServerError) this.errorType_;
            }
            return com.moloco.sdk.MetricsRequest.SDKInitFailureTrackingRequest.ServerError.getDefaultInstance();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setServerError(com.moloco.sdk.MetricsRequest.SDKInitFailureTrackingRequest.ServerError serverError) {
            serverError.getClass();
            this.errorType_ = serverError;
            this.errorTypeCase_ = 1;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void mergeServerError(com.moloco.sdk.MetricsRequest.SDKInitFailureTrackingRequest.ServerError serverError) {
            serverError.getClass();
            if (this.errorTypeCase_ == 1 && this.errorType_ != com.moloco.sdk.MetricsRequest.SDKInitFailureTrackingRequest.ServerError.getDefaultInstance()) {
                this.errorType_ = com.moloco.sdk.MetricsRequest.SDKInitFailureTrackingRequest.ServerError.newBuilder((com.moloco.sdk.MetricsRequest.SDKInitFailureTrackingRequest.ServerError) this.errorType_).mergeFrom((com.moloco.sdk.MetricsRequest.SDKInitFailureTrackingRequest.ServerError.Builder) serverError).buildPartial();
            } else {
                this.errorType_ = serverError;
            }
            this.errorTypeCase_ = 1;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearServerError() {
            if (this.errorTypeCase_ == 1) {
                this.errorTypeCase_ = 0;
                this.errorType_ = null;
            }
        }

        @Override // com.moloco.sdk.MetricsRequest.SDKInitFailureTrackingRequestOrBuilder
        public boolean hasClientError() {
            return this.errorTypeCase_ == 2;
        }

        @Override // com.moloco.sdk.MetricsRequest.SDKInitFailureTrackingRequestOrBuilder
        public com.moloco.sdk.MetricsRequest.SDKInitFailureTrackingRequest.ClientError getClientError() {
            if (this.errorTypeCase_ == 2) {
                return (com.moloco.sdk.MetricsRequest.SDKInitFailureTrackingRequest.ClientError) this.errorType_;
            }
            return com.moloco.sdk.MetricsRequest.SDKInitFailureTrackingRequest.ClientError.getDefaultInstance();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setClientError(com.moloco.sdk.MetricsRequest.SDKInitFailureTrackingRequest.ClientError clientError) {
            clientError.getClass();
            this.errorType_ = clientError;
            this.errorTypeCase_ = 2;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void mergeClientError(com.moloco.sdk.MetricsRequest.SDKInitFailureTrackingRequest.ClientError clientError) {
            clientError.getClass();
            if (this.errorTypeCase_ == 2 && this.errorType_ != com.moloco.sdk.MetricsRequest.SDKInitFailureTrackingRequest.ClientError.getDefaultInstance()) {
                this.errorType_ = com.moloco.sdk.MetricsRequest.SDKInitFailureTrackingRequest.ClientError.newBuilder((com.moloco.sdk.MetricsRequest.SDKInitFailureTrackingRequest.ClientError) this.errorType_).mergeFrom((com.moloco.sdk.MetricsRequest.SDKInitFailureTrackingRequest.ClientError.Builder) clientError).buildPartial();
            } else {
                this.errorType_ = clientError;
            }
            this.errorTypeCase_ = 2;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearClientError() {
            if (this.errorTypeCase_ == 2) {
                this.errorTypeCase_ = 0;
                this.errorType_ = null;
            }
        }

        public static com.moloco.sdk.MetricsRequest.SDKInitFailureTrackingRequest parseFrom(java.nio.ByteBuffer byteBuffer) throws com.google.protobuf.InvalidProtocolBufferException {
            return (com.moloco.sdk.MetricsRequest.SDKInitFailureTrackingRequest) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
        }

        public static com.moloco.sdk.MetricsRequest.SDKInitFailureTrackingRequest parseFrom(java.nio.ByteBuffer byteBuffer, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) throws com.google.protobuf.InvalidProtocolBufferException {
            return (com.moloco.sdk.MetricsRequest.SDKInitFailureTrackingRequest) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
        }

        public static com.moloco.sdk.MetricsRequest.SDKInitFailureTrackingRequest parseFrom(com.google.protobuf.ByteString byteString) throws com.google.protobuf.InvalidProtocolBufferException {
            return (com.moloco.sdk.MetricsRequest.SDKInitFailureTrackingRequest) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
        }

        public static com.moloco.sdk.MetricsRequest.SDKInitFailureTrackingRequest parseFrom(com.google.protobuf.ByteString byteString, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) throws com.google.protobuf.InvalidProtocolBufferException {
            return (com.moloco.sdk.MetricsRequest.SDKInitFailureTrackingRequest) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
        }

        public static com.moloco.sdk.MetricsRequest.SDKInitFailureTrackingRequest parseFrom(byte[] bArr) throws com.google.protobuf.InvalidProtocolBufferException {
            return (com.moloco.sdk.MetricsRequest.SDKInitFailureTrackingRequest) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
        }

        public static com.moloco.sdk.MetricsRequest.SDKInitFailureTrackingRequest parseFrom(byte[] bArr, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) throws com.google.protobuf.InvalidProtocolBufferException {
            return (com.moloco.sdk.MetricsRequest.SDKInitFailureTrackingRequest) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
        }

        public static com.moloco.sdk.MetricsRequest.SDKInitFailureTrackingRequest parseFrom(java.io.InputStream inputStream) throws java.io.IOException {
            return (com.moloco.sdk.MetricsRequest.SDKInitFailureTrackingRequest) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static com.moloco.sdk.MetricsRequest.SDKInitFailureTrackingRequest parseFrom(java.io.InputStream inputStream, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) throws java.io.IOException {
            return (com.moloco.sdk.MetricsRequest.SDKInitFailureTrackingRequest) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
        }

        public static com.moloco.sdk.MetricsRequest.SDKInitFailureTrackingRequest parseDelimitedFrom(java.io.InputStream inputStream) throws java.io.IOException {
            return (com.moloco.sdk.MetricsRequest.SDKInitFailureTrackingRequest) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static com.moloco.sdk.MetricsRequest.SDKInitFailureTrackingRequest parseDelimitedFrom(java.io.InputStream inputStream, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) throws java.io.IOException {
            return (com.moloco.sdk.MetricsRequest.SDKInitFailureTrackingRequest) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
        }

        public static com.moloco.sdk.MetricsRequest.SDKInitFailureTrackingRequest parseFrom(com.google.protobuf.CodedInputStream codedInputStream) throws java.io.IOException {
            return (com.moloco.sdk.MetricsRequest.SDKInitFailureTrackingRequest) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
        }

        public static com.moloco.sdk.MetricsRequest.SDKInitFailureTrackingRequest parseFrom(com.google.protobuf.CodedInputStream codedInputStream, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) throws java.io.IOException {
            return (com.moloco.sdk.MetricsRequest.SDKInitFailureTrackingRequest) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
        }

        public static com.moloco.sdk.MetricsRequest.SDKInitFailureTrackingRequest.Builder newBuilder() {
            return DEFAULT_INSTANCE.createBuilder();
        }

        public static com.moloco.sdk.MetricsRequest.SDKInitFailureTrackingRequest.Builder newBuilder(com.moloco.sdk.MetricsRequest.SDKInitFailureTrackingRequest sDKInitFailureTrackingRequest) {
            return DEFAULT_INSTANCE.createBuilder(sDKInitFailureTrackingRequest);
        }

        public static final class Builder extends com.google.protobuf.GeneratedMessageLite.Builder<com.moloco.sdk.MetricsRequest.SDKInitFailureTrackingRequest, com.moloco.sdk.MetricsRequest.SDKInitFailureTrackingRequest.Builder> implements com.moloco.sdk.MetricsRequest.SDKInitFailureTrackingRequestOrBuilder {
            private Builder() {
                super(com.moloco.sdk.MetricsRequest.SDKInitFailureTrackingRequest.DEFAULT_INSTANCE);
            }

            @Override // com.moloco.sdk.MetricsRequest.SDKInitFailureTrackingRequestOrBuilder
            public com.moloco.sdk.MetricsRequest.SDKInitFailureTrackingRequest.ErrorTypeCase getErrorTypeCase() {
                return ((com.moloco.sdk.MetricsRequest.SDKInitFailureTrackingRequest) this.instance).getErrorTypeCase();
            }

            public com.moloco.sdk.MetricsRequest.SDKInitFailureTrackingRequest.Builder clearErrorType() {
                copyOnWrite();
                ((com.moloco.sdk.MetricsRequest.SDKInitFailureTrackingRequest) this.instance).clearErrorType();
                return this;
            }

            @Override // com.moloco.sdk.MetricsRequest.SDKInitFailureTrackingRequestOrBuilder
            public boolean hasServerError() {
                return ((com.moloco.sdk.MetricsRequest.SDKInitFailureTrackingRequest) this.instance).hasServerError();
            }

            @Override // com.moloco.sdk.MetricsRequest.SDKInitFailureTrackingRequestOrBuilder
            public com.moloco.sdk.MetricsRequest.SDKInitFailureTrackingRequest.ServerError getServerError() {
                return ((com.moloco.sdk.MetricsRequest.SDKInitFailureTrackingRequest) this.instance).getServerError();
            }

            public com.moloco.sdk.MetricsRequest.SDKInitFailureTrackingRequest.Builder setServerError(com.moloco.sdk.MetricsRequest.SDKInitFailureTrackingRequest.ServerError serverError) {
                copyOnWrite();
                ((com.moloco.sdk.MetricsRequest.SDKInitFailureTrackingRequest) this.instance).setServerError(serverError);
                return this;
            }

            public com.moloco.sdk.MetricsRequest.SDKInitFailureTrackingRequest.Builder setServerError(com.moloco.sdk.MetricsRequest.SDKInitFailureTrackingRequest.ServerError.Builder builder) {
                copyOnWrite();
                ((com.moloco.sdk.MetricsRequest.SDKInitFailureTrackingRequest) this.instance).setServerError(builder.build());
                return this;
            }

            public com.moloco.sdk.MetricsRequest.SDKInitFailureTrackingRequest.Builder mergeServerError(com.moloco.sdk.MetricsRequest.SDKInitFailureTrackingRequest.ServerError serverError) {
                copyOnWrite();
                ((com.moloco.sdk.MetricsRequest.SDKInitFailureTrackingRequest) this.instance).mergeServerError(serverError);
                return this;
            }

            public com.moloco.sdk.MetricsRequest.SDKInitFailureTrackingRequest.Builder clearServerError() {
                copyOnWrite();
                ((com.moloco.sdk.MetricsRequest.SDKInitFailureTrackingRequest) this.instance).clearServerError();
                return this;
            }

            @Override // com.moloco.sdk.MetricsRequest.SDKInitFailureTrackingRequestOrBuilder
            public boolean hasClientError() {
                return ((com.moloco.sdk.MetricsRequest.SDKInitFailureTrackingRequest) this.instance).hasClientError();
            }

            @Override // com.moloco.sdk.MetricsRequest.SDKInitFailureTrackingRequestOrBuilder
            public com.moloco.sdk.MetricsRequest.SDKInitFailureTrackingRequest.ClientError getClientError() {
                return ((com.moloco.sdk.MetricsRequest.SDKInitFailureTrackingRequest) this.instance).getClientError();
            }

            public com.moloco.sdk.MetricsRequest.SDKInitFailureTrackingRequest.Builder setClientError(com.moloco.sdk.MetricsRequest.SDKInitFailureTrackingRequest.ClientError clientError) {
                copyOnWrite();
                ((com.moloco.sdk.MetricsRequest.SDKInitFailureTrackingRequest) this.instance).setClientError(clientError);
                return this;
            }

            public com.moloco.sdk.MetricsRequest.SDKInitFailureTrackingRequest.Builder setClientError(com.moloco.sdk.MetricsRequest.SDKInitFailureTrackingRequest.ClientError.Builder builder) {
                copyOnWrite();
                ((com.moloco.sdk.MetricsRequest.SDKInitFailureTrackingRequest) this.instance).setClientError(builder.build());
                return this;
            }

            public com.moloco.sdk.MetricsRequest.SDKInitFailureTrackingRequest.Builder mergeClientError(com.moloco.sdk.MetricsRequest.SDKInitFailureTrackingRequest.ClientError clientError) {
                copyOnWrite();
                ((com.moloco.sdk.MetricsRequest.SDKInitFailureTrackingRequest) this.instance).mergeClientError(clientError);
                return this;
            }

            public com.moloco.sdk.MetricsRequest.SDKInitFailureTrackingRequest.Builder clearClientError() {
                copyOnWrite();
                ((com.moloco.sdk.MetricsRequest.SDKInitFailureTrackingRequest) this.instance).clearClientError();
                return this;
            }
        }

        @Override // com.google.protobuf.GeneratedMessageLite
        protected final java.lang.Object dynamicMethod(com.google.protobuf.GeneratedMessageLite.MethodToInvoke methodToInvoke, java.lang.Object obj, java.lang.Object obj2) {
            switch (com.moloco.sdk.MetricsRequest.AnonymousClass1.$SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke[methodToInvoke.ordinal()]) {
                case 1:
                    return new com.moloco.sdk.MetricsRequest.SDKInitFailureTrackingRequest();
                case 2:
                    return new com.moloco.sdk.MetricsRequest.SDKInitFailureTrackingRequest.Builder();
                case 3:
                    return newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0002\u0001\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001<\u0000\u0002<\u0000", new java.lang.Object[]{"errorType_", "errorTypeCase_", com.moloco.sdk.MetricsRequest.SDKInitFailureTrackingRequest.ServerError.class, com.moloco.sdk.MetricsRequest.SDKInitFailureTrackingRequest.ClientError.class});
                case 4:
                    return DEFAULT_INSTANCE;
                case 5:
                    com.google.protobuf.Parser<com.moloco.sdk.MetricsRequest.SDKInitFailureTrackingRequest> parser = PARSER;
                    if (parser == null) {
                        synchronized (com.moloco.sdk.MetricsRequest.SDKInitFailureTrackingRequest.class) {
                            parser = PARSER;
                            if (parser == null) {
                                parser = new com.google.protobuf.GeneratedMessageLite.DefaultInstanceBasedParser<>(DEFAULT_INSTANCE);
                                PARSER = parser;
                            }
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

        static {
            com.moloco.sdk.MetricsRequest.SDKInitFailureTrackingRequest sDKInitFailureTrackingRequest = new com.moloco.sdk.MetricsRequest.SDKInitFailureTrackingRequest();
            DEFAULT_INSTANCE = sDKInitFailureTrackingRequest;
            com.google.protobuf.GeneratedMessageLite.registerDefaultInstance(com.moloco.sdk.MetricsRequest.SDKInitFailureTrackingRequest.class, sDKInitFailureTrackingRequest);
        }

        public static com.moloco.sdk.MetricsRequest.SDKInitFailureTrackingRequest getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static com.google.protobuf.Parser<com.moloco.sdk.MetricsRequest.SDKInitFailureTrackingRequest> parser() {
            return DEFAULT_INSTANCE.getParserForType();
        }
    }

    public static final class SDKInitTrackingResponse extends com.google.protobuf.GeneratedMessageLite<com.moloco.sdk.MetricsRequest.SDKInitTrackingResponse, com.moloco.sdk.MetricsRequest.SDKInitTrackingResponse.Builder> implements com.moloco.sdk.MetricsRequest.SDKInitTrackingResponseOrBuilder {
        private static final com.moloco.sdk.MetricsRequest.SDKInitTrackingResponse DEFAULT_INSTANCE;
        private static volatile com.google.protobuf.Parser<com.moloco.sdk.MetricsRequest.SDKInitTrackingResponse> PARSER;

        private SDKInitTrackingResponse() {
        }

        public static com.moloco.sdk.MetricsRequest.SDKInitTrackingResponse parseFrom(java.nio.ByteBuffer byteBuffer) throws com.google.protobuf.InvalidProtocolBufferException {
            return (com.moloco.sdk.MetricsRequest.SDKInitTrackingResponse) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
        }

        public static com.moloco.sdk.MetricsRequest.SDKInitTrackingResponse parseFrom(java.nio.ByteBuffer byteBuffer, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) throws com.google.protobuf.InvalidProtocolBufferException {
            return (com.moloco.sdk.MetricsRequest.SDKInitTrackingResponse) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
        }

        public static com.moloco.sdk.MetricsRequest.SDKInitTrackingResponse parseFrom(com.google.protobuf.ByteString byteString) throws com.google.protobuf.InvalidProtocolBufferException {
            return (com.moloco.sdk.MetricsRequest.SDKInitTrackingResponse) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
        }

        public static com.moloco.sdk.MetricsRequest.SDKInitTrackingResponse parseFrom(com.google.protobuf.ByteString byteString, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) throws com.google.protobuf.InvalidProtocolBufferException {
            return (com.moloco.sdk.MetricsRequest.SDKInitTrackingResponse) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
        }

        public static com.moloco.sdk.MetricsRequest.SDKInitTrackingResponse parseFrom(byte[] bArr) throws com.google.protobuf.InvalidProtocolBufferException {
            return (com.moloco.sdk.MetricsRequest.SDKInitTrackingResponse) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
        }

        public static com.moloco.sdk.MetricsRequest.SDKInitTrackingResponse parseFrom(byte[] bArr, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) throws com.google.protobuf.InvalidProtocolBufferException {
            return (com.moloco.sdk.MetricsRequest.SDKInitTrackingResponse) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
        }

        public static com.moloco.sdk.MetricsRequest.SDKInitTrackingResponse parseFrom(java.io.InputStream inputStream) throws java.io.IOException {
            return (com.moloco.sdk.MetricsRequest.SDKInitTrackingResponse) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static com.moloco.sdk.MetricsRequest.SDKInitTrackingResponse parseFrom(java.io.InputStream inputStream, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) throws java.io.IOException {
            return (com.moloco.sdk.MetricsRequest.SDKInitTrackingResponse) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
        }

        public static com.moloco.sdk.MetricsRequest.SDKInitTrackingResponse parseDelimitedFrom(java.io.InputStream inputStream) throws java.io.IOException {
            return (com.moloco.sdk.MetricsRequest.SDKInitTrackingResponse) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static com.moloco.sdk.MetricsRequest.SDKInitTrackingResponse parseDelimitedFrom(java.io.InputStream inputStream, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) throws java.io.IOException {
            return (com.moloco.sdk.MetricsRequest.SDKInitTrackingResponse) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
        }

        public static com.moloco.sdk.MetricsRequest.SDKInitTrackingResponse parseFrom(com.google.protobuf.CodedInputStream codedInputStream) throws java.io.IOException {
            return (com.moloco.sdk.MetricsRequest.SDKInitTrackingResponse) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
        }

        public static com.moloco.sdk.MetricsRequest.SDKInitTrackingResponse parseFrom(com.google.protobuf.CodedInputStream codedInputStream, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) throws java.io.IOException {
            return (com.moloco.sdk.MetricsRequest.SDKInitTrackingResponse) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
        }

        public static com.moloco.sdk.MetricsRequest.SDKInitTrackingResponse.Builder newBuilder() {
            return DEFAULT_INSTANCE.createBuilder();
        }

        public static com.moloco.sdk.MetricsRequest.SDKInitTrackingResponse.Builder newBuilder(com.moloco.sdk.MetricsRequest.SDKInitTrackingResponse sDKInitTrackingResponse) {
            return DEFAULT_INSTANCE.createBuilder(sDKInitTrackingResponse);
        }

        public static final class Builder extends com.google.protobuf.GeneratedMessageLite.Builder<com.moloco.sdk.MetricsRequest.SDKInitTrackingResponse, com.moloco.sdk.MetricsRequest.SDKInitTrackingResponse.Builder> implements com.moloco.sdk.MetricsRequest.SDKInitTrackingResponseOrBuilder {
            private Builder() {
                super(com.moloco.sdk.MetricsRequest.SDKInitTrackingResponse.DEFAULT_INSTANCE);
            }
        }

        @Override // com.google.protobuf.GeneratedMessageLite
        protected final java.lang.Object dynamicMethod(com.google.protobuf.GeneratedMessageLite.MethodToInvoke methodToInvoke, java.lang.Object obj, java.lang.Object obj2) {
            switch (com.moloco.sdk.MetricsRequest.AnonymousClass1.$SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke[methodToInvoke.ordinal()]) {
                case 1:
                    return new com.moloco.sdk.MetricsRequest.SDKInitTrackingResponse();
                case 2:
                    return new com.moloco.sdk.MetricsRequest.SDKInitTrackingResponse.Builder();
                case 3:
                    return newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0000", null);
                case 4:
                    return DEFAULT_INSTANCE;
                case 5:
                    com.google.protobuf.Parser<com.moloco.sdk.MetricsRequest.SDKInitTrackingResponse> parser = PARSER;
                    if (parser == null) {
                        synchronized (com.moloco.sdk.MetricsRequest.SDKInitTrackingResponse.class) {
                            parser = PARSER;
                            if (parser == null) {
                                parser = new com.google.protobuf.GeneratedMessageLite.DefaultInstanceBasedParser<>(DEFAULT_INSTANCE);
                                PARSER = parser;
                            }
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

        static {
            com.moloco.sdk.MetricsRequest.SDKInitTrackingResponse sDKInitTrackingResponse = new com.moloco.sdk.MetricsRequest.SDKInitTrackingResponse();
            DEFAULT_INSTANCE = sDKInitTrackingResponse;
            com.google.protobuf.GeneratedMessageLite.registerDefaultInstance(com.moloco.sdk.MetricsRequest.SDKInitTrackingResponse.class, sDKInitTrackingResponse);
        }

        public static com.moloco.sdk.MetricsRequest.SDKInitTrackingResponse getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static com.google.protobuf.Parser<com.moloco.sdk.MetricsRequest.SDKInitTrackingResponse> parser() {
            return DEFAULT_INSTANCE.getParserForType();
        }
    }
}
