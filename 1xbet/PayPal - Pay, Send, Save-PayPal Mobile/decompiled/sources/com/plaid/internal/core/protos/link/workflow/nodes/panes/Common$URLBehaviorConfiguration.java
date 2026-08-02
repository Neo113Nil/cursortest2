package com.plaid.internal.core.protos.link.workflow.nodes.panes;

/* loaded from: classes16.dex */
public final class Common$URLBehaviorConfiguration extends com.google.protobuf.GeneratedMessageLite<com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$URLBehaviorConfiguration, com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$URLBehaviorConfiguration.a> implements com.plaid.internal.core.protos.link.workflow.nodes.panes.X {
    public static final int BEHAVIOR_FIELD_NUMBER = 2;
    private static final com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$URLBehaviorConfiguration DEFAULT_INSTANCE;
    public static final int MATCHER_FIELD_NUMBER = 1;
    private static volatile com.google.protobuf.Parser<com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$URLBehaviorConfiguration> PARSER;
    private int behavior_;
    private int bitField0_;
    private com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$URLBehaviorConfiguration.Matcher matcher_;

    public static final class Matcher extends com.google.protobuf.GeneratedMessageLite<com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$URLBehaviorConfiguration.Matcher, com.plaid.internal.core.protos.link.workflow.nodes.panes.Common.URLBehaviorConfiguration.Matcher.a> implements com.google.protobuf.MessageLiteOrBuilder {
        private static final com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$URLBehaviorConfiguration.Matcher DEFAULT_INSTANCE;
        public static final int EXPECTED_QUERY_PARAMETERS_FIELD_NUMBER = 4;
        public static final int HOST_FIELD_NUMBER = 2;
        private static volatile com.google.protobuf.Parser<com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$URLBehaviorConfiguration.Matcher> PARSER = null;
        public static final int PATH_FIELD_NUMBER = 3;
        public static final int SCHEME_FIELD_NUMBER = 1;
        private java.lang.String scheme_ = "";
        private java.lang.String host_ = "";
        private java.lang.String path_ = "";
        private com.google.protobuf.Internal.ProtobufList<java.lang.String> expectedQueryParameters_ = com.google.protobuf.GeneratedMessageLite.emptyProtobufList();

        public static final class a extends com.google.protobuf.GeneratedMessageLite.Builder<com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$URLBehaviorConfiguration.Matcher, com.plaid.internal.core.protos.link.workflow.nodes.panes.Common.URLBehaviorConfiguration.Matcher.a> implements com.google.protobuf.MessageLiteOrBuilder {
            public a() {
                super(com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$URLBehaviorConfiguration.Matcher.DEFAULT_INSTANCE);
            }
        }

        static {
            com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$URLBehaviorConfiguration.Matcher matcher = new com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$URLBehaviorConfiguration.Matcher();
            DEFAULT_INSTANCE = matcher;
            com.google.protobuf.GeneratedMessageLite.registerDefaultInstance(com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$URLBehaviorConfiguration.Matcher.class, matcher);
        }

        private Matcher() {
        }

        private void addAllExpectedQueryParameters(java.lang.Iterable<java.lang.String> iterable) {
            ensureExpectedQueryParametersIsMutable();
            com.google.protobuf.AbstractMessageLite.addAll((java.lang.Iterable) iterable, (java.util.List) this.expectedQueryParameters_);
        }

        private void addExpectedQueryParametersBytes(com.google.protobuf.ByteString byteString) {
            com.google.protobuf.GeneratedMessageLite.checkByteStringIsUtf8(byteString);
            ensureExpectedQueryParametersIsMutable();
            this.expectedQueryParameters_.add(byteString.toStringUtf8());
        }

        private void clearExpectedQueryParameters() {
            this.expectedQueryParameters_ = com.google.protobuf.GeneratedMessageLite.emptyProtobufList();
        }

        private void clearHost() {
            this.host_ = getDefaultInstance().getHost();
        }

        private void clearPath() {
            this.path_ = getDefaultInstance().getPath();
        }

        private void clearScheme() {
            this.scheme_ = getDefaultInstance().getScheme();
        }

        private void ensureExpectedQueryParametersIsMutable() {
            com.google.protobuf.Internal.ProtobufList<java.lang.String> protobufList = this.expectedQueryParameters_;
            if (protobufList.isModifiable()) {
                return;
            }
            this.expectedQueryParameters_ = com.google.protobuf.GeneratedMessageLite.mutableCopy(protobufList);
        }

        public static com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$URLBehaviorConfiguration.Matcher getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static com.plaid.internal.core.protos.link.workflow.nodes.panes.Common.URLBehaviorConfiguration.Matcher.a newBuilder() {
            return DEFAULT_INSTANCE.createBuilder();
        }

        public static com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$URLBehaviorConfiguration.Matcher parseDelimitedFrom(java.io.InputStream inputStream) {
            return (com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$URLBehaviorConfiguration.Matcher) com.google.protobuf.GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$URLBehaviorConfiguration.Matcher parseFrom(java.nio.ByteBuffer byteBuffer) {
            return (com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$URLBehaviorConfiguration.Matcher) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
        }

        public static com.google.protobuf.Parser<com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$URLBehaviorConfiguration.Matcher> parser() {
            return DEFAULT_INSTANCE.getParserForType();
        }

        private void setHostBytes(com.google.protobuf.ByteString byteString) {
            com.google.protobuf.GeneratedMessageLite.checkByteStringIsUtf8(byteString);
            this.host_ = byteString.toStringUtf8();
        }

        private void setPathBytes(com.google.protobuf.ByteString byteString) {
            com.google.protobuf.GeneratedMessageLite.checkByteStringIsUtf8(byteString);
            this.path_ = byteString.toStringUtf8();
        }

        private void setSchemeBytes(com.google.protobuf.ByteString byteString) {
            com.google.protobuf.GeneratedMessageLite.checkByteStringIsUtf8(byteString);
            this.scheme_ = byteString.toStringUtf8();
        }

        @Override // com.google.protobuf.GeneratedMessageLite
        public final java.lang.Object dynamicMethod(com.google.protobuf.GeneratedMessageLite.MethodToInvoke methodToInvoke, java.lang.Object obj, java.lang.Object obj2) {
            com.google.protobuf.Parser parser;
            switch (com.plaid.internal.core.protos.link.workflow.nodes.panes.C0484j.f6305a[methodToInvoke.ordinal()]) {
                case 1:
                    return new com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$URLBehaviorConfiguration.Matcher();
                case 2:
                    return new com.plaid.internal.core.protos.link.workflow.nodes.panes.Common.URLBehaviorConfiguration.Matcher.a();
                case 3:
                    return com.google.protobuf.GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0004\u0000\u0000\u0001\u0004\u0004\u0000\u0001\u0000\u0001Ȉ\u0002Ȉ\u0003Ȉ\u0004Ț", new java.lang.Object[]{"scheme_", "host_", "path_", "expectedQueryParameters_"});
                case 4:
                    return DEFAULT_INSTANCE;
                case 5:
                    com.google.protobuf.Parser<com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$URLBehaviorConfiguration.Matcher> parser2 = PARSER;
                    if (parser2 != null) {
                        return parser2;
                    }
                    synchronized (com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$URLBehaviorConfiguration.Matcher.class) {
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

        public final java.lang.String getExpectedQueryParameters(int i) {
            return this.expectedQueryParameters_.get(i);
        }

        public final com.google.protobuf.ByteString getExpectedQueryParametersBytes(int i) {
            return com.google.protobuf.ByteString.copyFromUtf8(this.expectedQueryParameters_.get(i));
        }

        public final int getExpectedQueryParametersCount() {
            return this.expectedQueryParameters_.size();
        }

        public final java.util.List<java.lang.String> getExpectedQueryParametersList() {
            return this.expectedQueryParameters_;
        }

        public final java.lang.String getHost() {
            return this.host_;
        }

        public final com.google.protobuf.ByteString getHostBytes() {
            return com.google.protobuf.ByteString.copyFromUtf8(this.host_);
        }

        public final java.lang.String getPath() {
            return this.path_;
        }

        public final com.google.protobuf.ByteString getPathBytes() {
            return com.google.protobuf.ByteString.copyFromUtf8(this.path_);
        }

        public final java.lang.String getScheme() {
            return this.scheme_;
        }

        public final com.google.protobuf.ByteString getSchemeBytes() {
            return com.google.protobuf.ByteString.copyFromUtf8(this.scheme_);
        }

        private void addExpectedQueryParameters(java.lang.String str) {
            ensureExpectedQueryParametersIsMutable();
            this.expectedQueryParameters_.add(str);
        }

        public static com.plaid.internal.core.protos.link.workflow.nodes.panes.Common.URLBehaviorConfiguration.Matcher.a newBuilder(com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$URLBehaviorConfiguration.Matcher matcher) {
            return DEFAULT_INSTANCE.createBuilder(matcher);
        }

        public static com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$URLBehaviorConfiguration.Matcher parseDelimitedFrom(java.io.InputStream inputStream, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) {
            return (com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$URLBehaviorConfiguration.Matcher) com.google.protobuf.GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
        }

        public static com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$URLBehaviorConfiguration.Matcher parseFrom(java.nio.ByteBuffer byteBuffer, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) {
            return (com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$URLBehaviorConfiguration.Matcher) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
        }

        private void setExpectedQueryParameters(int i, java.lang.String str) {
            ensureExpectedQueryParametersIsMutable();
            this.expectedQueryParameters_.set(i, str);
        }

        public static com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$URLBehaviorConfiguration.Matcher parseFrom(com.google.protobuf.ByteString byteString) {
            return (com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$URLBehaviorConfiguration.Matcher) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
        }

        private void setHost(java.lang.String str) {
            this.host_ = str;
        }

        private void setPath(java.lang.String str) {
            this.path_ = str;
        }

        private void setScheme(java.lang.String str) {
            this.scheme_ = str;
        }

        public static com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$URLBehaviorConfiguration.Matcher parseFrom(com.google.protobuf.ByteString byteString, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) {
            return (com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$URLBehaviorConfiguration.Matcher) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
        }

        public static com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$URLBehaviorConfiguration.Matcher parseFrom(byte[] bArr) {
            return (com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$URLBehaviorConfiguration.Matcher) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
        }

        public static com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$URLBehaviorConfiguration.Matcher parseFrom(byte[] bArr, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) {
            return (com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$URLBehaviorConfiguration.Matcher) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
        }

        public static com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$URLBehaviorConfiguration.Matcher parseFrom(java.io.InputStream inputStream) {
            return (com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$URLBehaviorConfiguration.Matcher) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$URLBehaviorConfiguration.Matcher parseFrom(java.io.InputStream inputStream, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) {
            return (com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$URLBehaviorConfiguration.Matcher) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
        }

        public static com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$URLBehaviorConfiguration.Matcher parseFrom(com.google.protobuf.CodedInputStream codedInputStream) {
            return (com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$URLBehaviorConfiguration.Matcher) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
        }

        public static com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$URLBehaviorConfiguration.Matcher parseFrom(com.google.protobuf.CodedInputStream codedInputStream, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) {
            return (com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$URLBehaviorConfiguration.Matcher) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
        }
    }

    public static final class a extends com.google.protobuf.GeneratedMessageLite.Builder<com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$URLBehaviorConfiguration, com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$URLBehaviorConfiguration.a> implements com.plaid.internal.core.protos.link.workflow.nodes.panes.X {
        public a() {
            super(com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$URLBehaviorConfiguration.DEFAULT_INSTANCE);
        }
    }

    static {
        com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$URLBehaviorConfiguration common$URLBehaviorConfiguration = new com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$URLBehaviorConfiguration();
        DEFAULT_INSTANCE = common$URLBehaviorConfiguration;
        com.google.protobuf.GeneratedMessageLite.registerDefaultInstance(com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$URLBehaviorConfiguration.class, common$URLBehaviorConfiguration);
    }

    private Common$URLBehaviorConfiguration() {
    }

    private void clearBehavior() {
        this.behavior_ = 0;
    }

    private void clearMatcher() {
        this.matcher_ = null;
        this.bitField0_ &= -2;
    }

    public static com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$URLBehaviorConfiguration getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$URLBehaviorConfiguration.a newBuilder() {
        return DEFAULT_INSTANCE.createBuilder();
    }

    public static com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$URLBehaviorConfiguration parseDelimitedFrom(java.io.InputStream inputStream) {
        return (com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$URLBehaviorConfiguration) com.google.protobuf.GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$URLBehaviorConfiguration parseFrom(java.nio.ByteBuffer byteBuffer) {
        return (com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$URLBehaviorConfiguration) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static com.google.protobuf.Parser<com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$URLBehaviorConfiguration> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    private void setBehavior(com.plaid.internal.core.protos.link.workflow.nodes.panes.W w) {
        this.behavior_ = w.getNumber();
    }

    private void setBehaviorValue(int i) {
        this.behavior_ = i;
    }

    @Override // com.google.protobuf.GeneratedMessageLite
    public final java.lang.Object dynamicMethod(com.google.protobuf.GeneratedMessageLite.MethodToInvoke methodToInvoke, java.lang.Object obj, java.lang.Object obj2) {
        com.google.protobuf.Parser parser;
        switch (com.plaid.internal.core.protos.link.workflow.nodes.panes.C0484j.f6305a[methodToInvoke.ordinal()]) {
            case 1:
                return new com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$URLBehaviorConfiguration();
            case 2:
                return new com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$URLBehaviorConfiguration.a();
            case 3:
                return com.google.protobuf.GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဉ\u0000\u0002\f", new java.lang.Object[]{"bitField0_", "matcher_", "behavior_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                com.google.protobuf.Parser<com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$URLBehaviorConfiguration> parser2 = PARSER;
                if (parser2 != null) {
                    return parser2;
                }
                synchronized (com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$URLBehaviorConfiguration.class) {
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

    public final com.plaid.internal.core.protos.link.workflow.nodes.panes.W getBehavior() {
        com.plaid.internal.core.protos.link.workflow.nodes.panes.W forNumber = com.plaid.internal.core.protos.link.workflow.nodes.panes.W.forNumber(this.behavior_);
        return forNumber == null ? com.plaid.internal.core.protos.link.workflow.nodes.panes.W.UNRECOGNIZED : forNumber;
    }

    public final int getBehaviorValue() {
        return this.behavior_;
    }

    public final com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$URLBehaviorConfiguration.Matcher getMatcher() {
        com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$URLBehaviorConfiguration.Matcher matcher = this.matcher_;
        return matcher == null ? com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$URLBehaviorConfiguration.Matcher.getDefaultInstance() : matcher;
    }

    public final boolean hasMatcher() {
        return (this.bitField0_ & 1) != 0;
    }

    private void mergeMatcher(com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$URLBehaviorConfiguration.Matcher matcher) {
        com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$URLBehaviorConfiguration.Matcher matcher2 = this.matcher_;
        if (matcher2 == null || matcher2 == com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$URLBehaviorConfiguration.Matcher.getDefaultInstance()) {
            this.matcher_ = matcher;
        } else {
            this.matcher_ = com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$URLBehaviorConfiguration.Matcher.newBuilder(this.matcher_).mergeFrom((com.plaid.internal.core.protos.link.workflow.nodes.panes.Common.URLBehaviorConfiguration.Matcher.a) matcher).buildPartial();
        }
        this.bitField0_ |= 1;
    }

    public static com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$URLBehaviorConfiguration.a newBuilder(com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$URLBehaviorConfiguration common$URLBehaviorConfiguration) {
        return DEFAULT_INSTANCE.createBuilder(common$URLBehaviorConfiguration);
    }

    public static com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$URLBehaviorConfiguration parseDelimitedFrom(java.io.InputStream inputStream, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) {
        return (com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$URLBehaviorConfiguration) com.google.protobuf.GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$URLBehaviorConfiguration parseFrom(java.nio.ByteBuffer byteBuffer, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) {
        return (com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$URLBehaviorConfiguration) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
    }

    private void setMatcher(com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$URLBehaviorConfiguration.Matcher matcher) {
        this.matcher_ = matcher;
        this.bitField0_ |= 1;
    }

    public static com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$URLBehaviorConfiguration parseFrom(com.google.protobuf.ByteString byteString) {
        return (com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$URLBehaviorConfiguration) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
    }

    public static com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$URLBehaviorConfiguration parseFrom(com.google.protobuf.ByteString byteString, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) {
        return (com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$URLBehaviorConfiguration) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
    }

    public static com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$URLBehaviorConfiguration parseFrom(byte[] bArr) {
        return (com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$URLBehaviorConfiguration) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$URLBehaviorConfiguration parseFrom(byte[] bArr, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) {
        return (com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$URLBehaviorConfiguration) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
    }

    public static com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$URLBehaviorConfiguration parseFrom(java.io.InputStream inputStream) {
        return (com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$URLBehaviorConfiguration) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$URLBehaviorConfiguration parseFrom(java.io.InputStream inputStream, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) {
        return (com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$URLBehaviorConfiguration) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$URLBehaviorConfiguration parseFrom(com.google.protobuf.CodedInputStream codedInputStream) {
        return (com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$URLBehaviorConfiguration) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
    }

    public static com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$URLBehaviorConfiguration parseFrom(com.google.protobuf.CodedInputStream codedInputStream, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) {
        return (com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$URLBehaviorConfiguration) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
    }
}
