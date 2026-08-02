package org.chromium.net.httpflags;

/* loaded from: classes18.dex */
public final class BaseFeatureOverrides extends com.google.protobuf.GeneratedMessageLite<org.chromium.net.httpflags.BaseFeatureOverrides, org.chromium.net.httpflags.BaseFeatureOverrides.Builder> implements org.chromium.net.httpflags.BaseFeatureOverridesOrBuilder {
    private static final org.chromium.net.httpflags.BaseFeatureOverrides Camera2StreamConfigurationMap;
    public static final int FEATURE_STATES_FIELD_NUMBER = 1;
    private static volatile com.google.protobuf.Parser<org.chromium.net.httpflags.BaseFeatureOverrides> getHighSpeedVideoFpsRanges;
    private com.google.protobuf.MapFieldLite<java.lang.String, org.chromium.net.httpflags.BaseFeatureOverrides.FeatureState> getHighSpeedVideoSizes = com.google.protobuf.MapFieldLite.emptyMapField();

    public interface FeatureStateOrBuilder extends com.google.protobuf.MessageLiteOrBuilder {
        boolean containsParams(java.lang.String str);

        boolean getEnabled();

        @java.lang.Deprecated
        java.util.Map<java.lang.String, com.google.protobuf.ByteString> getParams();

        int getParamsCount();

        java.util.Map<java.lang.String, com.google.protobuf.ByteString> getParamsMap();

        com.google.protobuf.ByteString getParamsOrDefault(java.lang.String str, com.google.protobuf.ByteString byteString);

        com.google.protobuf.ByteString getParamsOrThrow(java.lang.String str);

        boolean hasEnabled();
    }

    private BaseFeatureOverrides() {
    }

    public static final class FeatureState extends com.google.protobuf.GeneratedMessageLite<org.chromium.net.httpflags.BaseFeatureOverrides.FeatureState, org.chromium.net.httpflags.BaseFeatureOverrides.FeatureState.Builder> implements org.chromium.net.httpflags.BaseFeatureOverrides.FeatureStateOrBuilder {
        private static final org.chromium.net.httpflags.BaseFeatureOverrides.FeatureState Camera2StreamConfigurationMap;
        public static final int ENABLED_FIELD_NUMBER = 1;
        public static final int PARAMS_FIELD_NUMBER = 2;
        private static volatile com.google.protobuf.Parser<org.chromium.net.httpflags.BaseFeatureOverrides.FeatureState> getHighSpeedVideoFpsRangesFor;
        private int getHighResolutionOutputSizeshNQ4ISI;
        private boolean getHighSpeedVideoFpsRanges;
        private com.google.protobuf.MapFieldLite<java.lang.String, com.google.protobuf.ByteString> getHighSpeedVideoSizes = com.google.protobuf.MapFieldLite.emptyMapField();

        private FeatureState() {
        }

        @Override // org.chromium.net.httpflags.BaseFeatureOverrides.FeatureStateOrBuilder
        public final boolean hasEnabled() {
            return (this.getHighResolutionOutputSizeshNQ4ISI & 1) != 0;
        }

        @Override // org.chromium.net.httpflags.BaseFeatureOverrides.FeatureStateOrBuilder
        public final boolean getEnabled() {
            return this.getHighSpeedVideoFpsRanges;
        }

        static final class ParamsDefaultEntryHolder {
            static final com.google.protobuf.MapEntryLite<java.lang.String, com.google.protobuf.ByteString> getHighSpeedVideoSizes = com.google.protobuf.MapEntryLite.newDefaultInstance(com.google.protobuf.WireFormat.FieldType.STRING, "", com.google.protobuf.WireFormat.FieldType.BYTES, com.google.protobuf.ByteString.EMPTY);

            private ParamsDefaultEntryHolder() {
            }
        }

        @Override // org.chromium.net.httpflags.BaseFeatureOverrides.FeatureStateOrBuilder
        @java.lang.Deprecated
        public final java.util.Map<java.lang.String, com.google.protobuf.ByteString> getParams() {
            return getParamsMap();
        }

        public static org.chromium.net.httpflags.BaseFeatureOverrides.FeatureState parseFrom(java.nio.ByteBuffer byteBuffer) throws com.google.protobuf.InvalidProtocolBufferException {
            return (org.chromium.net.httpflags.BaseFeatureOverrides.FeatureState) com.google.protobuf.GeneratedMessageLite.parseFrom(Camera2StreamConfigurationMap, byteBuffer);
        }

        public static org.chromium.net.httpflags.BaseFeatureOverrides.FeatureState parseFrom(java.nio.ByteBuffer byteBuffer, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) throws com.google.protobuf.InvalidProtocolBufferException {
            return (org.chromium.net.httpflags.BaseFeatureOverrides.FeatureState) com.google.protobuf.GeneratedMessageLite.parseFrom(Camera2StreamConfigurationMap, byteBuffer, extensionRegistryLite);
        }

        public static org.chromium.net.httpflags.BaseFeatureOverrides.FeatureState parseFrom(com.google.protobuf.ByteString byteString) throws com.google.protobuf.InvalidProtocolBufferException {
            return (org.chromium.net.httpflags.BaseFeatureOverrides.FeatureState) com.google.protobuf.GeneratedMessageLite.parseFrom(Camera2StreamConfigurationMap, byteString);
        }

        public static org.chromium.net.httpflags.BaseFeatureOverrides.FeatureState parseFrom(com.google.protobuf.ByteString byteString, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) throws com.google.protobuf.InvalidProtocolBufferException {
            return (org.chromium.net.httpflags.BaseFeatureOverrides.FeatureState) com.google.protobuf.GeneratedMessageLite.parseFrom(Camera2StreamConfigurationMap, byteString, extensionRegistryLite);
        }

        public static org.chromium.net.httpflags.BaseFeatureOverrides.FeatureState parseFrom(byte[] bArr) throws com.google.protobuf.InvalidProtocolBufferException {
            return (org.chromium.net.httpflags.BaseFeatureOverrides.FeatureState) com.google.protobuf.GeneratedMessageLite.parseFrom(Camera2StreamConfigurationMap, bArr);
        }

        public static org.chromium.net.httpflags.BaseFeatureOverrides.FeatureState parseFrom(byte[] bArr, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) throws com.google.protobuf.InvalidProtocolBufferException {
            return (org.chromium.net.httpflags.BaseFeatureOverrides.FeatureState) com.google.protobuf.GeneratedMessageLite.parseFrom(Camera2StreamConfigurationMap, bArr, extensionRegistryLite);
        }

        public static org.chromium.net.httpflags.BaseFeatureOverrides.FeatureState parseFrom(java.io.InputStream inputStream) throws java.io.IOException {
            return (org.chromium.net.httpflags.BaseFeatureOverrides.FeatureState) com.google.protobuf.GeneratedMessageLite.parseFrom(Camera2StreamConfigurationMap, inputStream);
        }

        public static org.chromium.net.httpflags.BaseFeatureOverrides.FeatureState parseFrom(java.io.InputStream inputStream, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) throws java.io.IOException {
            return (org.chromium.net.httpflags.BaseFeatureOverrides.FeatureState) com.google.protobuf.GeneratedMessageLite.parseFrom(Camera2StreamConfigurationMap, inputStream, extensionRegistryLite);
        }

        public static org.chromium.net.httpflags.BaseFeatureOverrides.FeatureState parseDelimitedFrom(java.io.InputStream inputStream) throws java.io.IOException {
            return (org.chromium.net.httpflags.BaseFeatureOverrides.FeatureState) parseDelimitedFrom(Camera2StreamConfigurationMap, inputStream);
        }

        public static org.chromium.net.httpflags.BaseFeatureOverrides.FeatureState parseDelimitedFrom(java.io.InputStream inputStream, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) throws java.io.IOException {
            return (org.chromium.net.httpflags.BaseFeatureOverrides.FeatureState) parseDelimitedFrom(Camera2StreamConfigurationMap, inputStream, extensionRegistryLite);
        }

        public static org.chromium.net.httpflags.BaseFeatureOverrides.FeatureState parseFrom(com.google.protobuf.CodedInputStream codedInputStream) throws java.io.IOException {
            return (org.chromium.net.httpflags.BaseFeatureOverrides.FeatureState) com.google.protobuf.GeneratedMessageLite.parseFrom(Camera2StreamConfigurationMap, codedInputStream);
        }

        public static org.chromium.net.httpflags.BaseFeatureOverrides.FeatureState parseFrom(com.google.protobuf.CodedInputStream codedInputStream, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) throws java.io.IOException {
            return (org.chromium.net.httpflags.BaseFeatureOverrides.FeatureState) com.google.protobuf.GeneratedMessageLite.parseFrom(Camera2StreamConfigurationMap, codedInputStream, extensionRegistryLite);
        }

        public static org.chromium.net.httpflags.BaseFeatureOverrides.FeatureState.Builder newBuilder() {
            return Camera2StreamConfigurationMap.createBuilder();
        }

        public static org.chromium.net.httpflags.BaseFeatureOverrides.FeatureState.Builder newBuilder(org.chromium.net.httpflags.BaseFeatureOverrides.FeatureState featureState) {
            return Camera2StreamConfigurationMap.createBuilder(featureState);
        }

        public static final class Builder extends com.google.protobuf.GeneratedMessageLite.Builder<org.chromium.net.httpflags.BaseFeatureOverrides.FeatureState, org.chromium.net.httpflags.BaseFeatureOverrides.FeatureState.Builder> implements org.chromium.net.httpflags.BaseFeatureOverrides.FeatureStateOrBuilder {
            private Builder() {
                super(org.chromium.net.httpflags.BaseFeatureOverrides.FeatureState.Camera2StreamConfigurationMap);
            }

            @Override // org.chromium.net.httpflags.BaseFeatureOverrides.FeatureStateOrBuilder
            public final boolean hasEnabled() {
                return ((org.chromium.net.httpflags.BaseFeatureOverrides.FeatureState) this.instance).hasEnabled();
            }

            @Override // org.chromium.net.httpflags.BaseFeatureOverrides.FeatureStateOrBuilder
            public final boolean getEnabled() {
                return ((org.chromium.net.httpflags.BaseFeatureOverrides.FeatureState) this.instance).getEnabled();
            }

            public final org.chromium.net.httpflags.BaseFeatureOverrides.FeatureState.Builder setEnabled(boolean z) {
                copyOnWrite();
                org.chromium.net.httpflags.BaseFeatureOverrides.FeatureState.getHighSpeedVideoFpsRanges((org.chromium.net.httpflags.BaseFeatureOverrides.FeatureState) this.instance, z);
                return this;
            }

            public final org.chromium.net.httpflags.BaseFeatureOverrides.FeatureState.Builder clearEnabled() {
                copyOnWrite();
                org.chromium.net.httpflags.BaseFeatureOverrides.FeatureState.Camera2StreamConfigurationMap((org.chromium.net.httpflags.BaseFeatureOverrides.FeatureState) this.instance);
                return this;
            }

            @Override // org.chromium.net.httpflags.BaseFeatureOverrides.FeatureStateOrBuilder
            public final int getParamsCount() {
                return ((org.chromium.net.httpflags.BaseFeatureOverrides.FeatureState) this.instance).getParamsMap().size();
            }

            @Override // org.chromium.net.httpflags.BaseFeatureOverrides.FeatureStateOrBuilder
            public final boolean containsParams(java.lang.String str) {
                return ((org.chromium.net.httpflags.BaseFeatureOverrides.FeatureState) this.instance).getParamsMap().containsKey(str);
            }

            public final org.chromium.net.httpflags.BaseFeatureOverrides.FeatureState.Builder clearParams() {
                copyOnWrite();
                org.chromium.net.httpflags.BaseFeatureOverrides.FeatureState.getHighResolutionOutputSizeshNQ4ISI((org.chromium.net.httpflags.BaseFeatureOverrides.FeatureState) this.instance).clear();
                return this;
            }

            public final org.chromium.net.httpflags.BaseFeatureOverrides.FeatureState.Builder removeParams(java.lang.String str) {
                copyOnWrite();
                org.chromium.net.httpflags.BaseFeatureOverrides.FeatureState.getHighResolutionOutputSizeshNQ4ISI((org.chromium.net.httpflags.BaseFeatureOverrides.FeatureState) this.instance).remove(str);
                return this;
            }

            @Override // org.chromium.net.httpflags.BaseFeatureOverrides.FeatureStateOrBuilder
            @java.lang.Deprecated
            public final java.util.Map<java.lang.String, com.google.protobuf.ByteString> getParams() {
                return getParamsMap();
            }

            @Override // org.chromium.net.httpflags.BaseFeatureOverrides.FeatureStateOrBuilder
            public final java.util.Map<java.lang.String, com.google.protobuf.ByteString> getParamsMap() {
                return java.util.Collections.unmodifiableMap(((org.chromium.net.httpflags.BaseFeatureOverrides.FeatureState) this.instance).getParamsMap());
            }

            @Override // org.chromium.net.httpflags.BaseFeatureOverrides.FeatureStateOrBuilder
            public final com.google.protobuf.ByteString getParamsOrDefault(java.lang.String str, com.google.protobuf.ByteString byteString) {
                java.util.Map<java.lang.String, com.google.protobuf.ByteString> paramsMap = ((org.chromium.net.httpflags.BaseFeatureOverrides.FeatureState) this.instance).getParamsMap();
                return paramsMap.containsKey(str) ? paramsMap.get(str) : byteString;
            }

            @Override // org.chromium.net.httpflags.BaseFeatureOverrides.FeatureStateOrBuilder
            public final com.google.protobuf.ByteString getParamsOrThrow(java.lang.String str) {
                java.util.Map<java.lang.String, com.google.protobuf.ByteString> paramsMap = ((org.chromium.net.httpflags.BaseFeatureOverrides.FeatureState) this.instance).getParamsMap();
                if (!paramsMap.containsKey(str)) {
                    throw new java.lang.IllegalArgumentException();
                }
                return paramsMap.get(str);
            }

            public final org.chromium.net.httpflags.BaseFeatureOverrides.FeatureState.Builder putParams(java.lang.String str, com.google.protobuf.ByteString byteString) {
                copyOnWrite();
                org.chromium.net.httpflags.BaseFeatureOverrides.FeatureState.getHighResolutionOutputSizeshNQ4ISI((org.chromium.net.httpflags.BaseFeatureOverrides.FeatureState) this.instance).put(str, byteString);
                return this;
            }

            public final org.chromium.net.httpflags.BaseFeatureOverrides.FeatureState.Builder putAllParams(java.util.Map<java.lang.String, com.google.protobuf.ByteString> map) {
                copyOnWrite();
                org.chromium.net.httpflags.BaseFeatureOverrides.FeatureState.getHighResolutionOutputSizeshNQ4ISI((org.chromium.net.httpflags.BaseFeatureOverrides.FeatureState) this.instance).putAll(map);
                return this;
            }

            /* synthetic */ Builder(byte b) {
                this();
            }
        }

        @Override // com.google.protobuf.GeneratedMessageLite
        public final java.lang.Object dynamicMethod(com.google.protobuf.GeneratedMessageLite.MethodToInvoke methodToInvoke, java.lang.Object obj, java.lang.Object obj2) {
            com.google.protobuf.Parser parser;
            switch (org.chromium.net.httpflags.BaseFeatureOverrides.AnonymousClass1.getHighSpeedVideoFpsRangesFor[methodToInvoke.ordinal()]) {
                case 1:
                    return new org.chromium.net.httpflags.BaseFeatureOverrides.FeatureState();
                case 2:
                    return new org.chromium.net.httpflags.BaseFeatureOverrides.FeatureState.Builder((byte) 0);
                case 3:
                    return newMessageInfo(Camera2StreamConfigurationMap, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0001\u0000\u0000\u0001ဇ\u0000\u00022", new java.lang.Object[]{"bitField0_", "enabled_", "params_", org.chromium.net.httpflags.BaseFeatureOverrides.FeatureState.ParamsDefaultEntryHolder.getHighSpeedVideoSizes});
                case 4:
                    return Camera2StreamConfigurationMap;
                case 5:
                    com.google.protobuf.Parser<org.chromium.net.httpflags.BaseFeatureOverrides.FeatureState> parser2 = getHighSpeedVideoFpsRangesFor;
                    if (parser2 != null) {
                        return parser2;
                    }
                    synchronized (org.chromium.net.httpflags.BaseFeatureOverrides.FeatureState.class) {
                        parser = getHighSpeedVideoFpsRangesFor;
                        if (parser == null) {
                            parser = new com.google.protobuf.GeneratedMessageLite.DefaultInstanceBasedParser(Camera2StreamConfigurationMap);
                            getHighSpeedVideoFpsRangesFor = parser;
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
            org.chromium.net.httpflags.BaseFeatureOverrides.FeatureState featureState = new org.chromium.net.httpflags.BaseFeatureOverrides.FeatureState();
            Camera2StreamConfigurationMap = featureState;
            com.google.protobuf.GeneratedMessageLite.registerDefaultInstance(org.chromium.net.httpflags.BaseFeatureOverrides.FeatureState.class, featureState);
        }

        public static org.chromium.net.httpflags.BaseFeatureOverrides.FeatureState getDefaultInstance() {
            return Camera2StreamConfigurationMap;
        }

        public static com.google.protobuf.Parser<org.chromium.net.httpflags.BaseFeatureOverrides.FeatureState> parser() {
            return Camera2StreamConfigurationMap.getParserForType();
        }

        static /* bridge */ /* synthetic */ void Camera2StreamConfigurationMap(org.chromium.net.httpflags.BaseFeatureOverrides.FeatureState featureState) {
            featureState.getHighResolutionOutputSizeshNQ4ISI &= -2;
            featureState.getHighSpeedVideoFpsRanges = false;
        }

        static /* synthetic */ java.util.Map getHighResolutionOutputSizeshNQ4ISI(org.chromium.net.httpflags.BaseFeatureOverrides.FeatureState featureState) {
            if (!featureState.getHighSpeedVideoSizes.isMutable()) {
                featureState.getHighSpeedVideoSizes = featureState.getHighSpeedVideoSizes.mutableCopy();
            }
            return featureState.getHighSpeedVideoSizes;
        }

        static /* bridge */ /* synthetic */ void getHighSpeedVideoFpsRanges(org.chromium.net.httpflags.BaseFeatureOverrides.FeatureState featureState, boolean z) {
            featureState.getHighResolutionOutputSizeshNQ4ISI |= 1;
            featureState.getHighSpeedVideoFpsRanges = z;
        }

        @Override // org.chromium.net.httpflags.BaseFeatureOverrides.FeatureStateOrBuilder
        public final boolean containsParams(java.lang.String str) {
            return this.getHighSpeedVideoSizes.containsKey(str);
        }

        @Override // org.chromium.net.httpflags.BaseFeatureOverrides.FeatureStateOrBuilder
        public final int getParamsCount() {
            return this.getHighSpeedVideoSizes.size();
        }

        @Override // org.chromium.net.httpflags.BaseFeatureOverrides.FeatureStateOrBuilder
        public final java.util.Map<java.lang.String, com.google.protobuf.ByteString> getParamsMap() {
            return java.util.Collections.unmodifiableMap(this.getHighSpeedVideoSizes);
        }

        @Override // org.chromium.net.httpflags.BaseFeatureOverrides.FeatureStateOrBuilder
        public final com.google.protobuf.ByteString getParamsOrDefault(java.lang.String str, com.google.protobuf.ByteString byteString) {
            com.google.protobuf.MapFieldLite<java.lang.String, com.google.protobuf.ByteString> mapFieldLite = this.getHighSpeedVideoSizes;
            return mapFieldLite.containsKey(str) ? mapFieldLite.get(str) : byteString;
        }

        @Override // org.chromium.net.httpflags.BaseFeatureOverrides.FeatureStateOrBuilder
        public final com.google.protobuf.ByteString getParamsOrThrow(java.lang.String str) {
            com.google.protobuf.MapFieldLite<java.lang.String, com.google.protobuf.ByteString> mapFieldLite = this.getHighSpeedVideoSizes;
            if (!mapFieldLite.containsKey(str)) {
                throw new java.lang.IllegalArgumentException();
            }
            return mapFieldLite.get(str);
        }
    }

    /* renamed from: org.chromium.net.httpflags.BaseFeatureOverrides$1, reason: invalid class name */
    static /* synthetic */ class AnonymousClass1 {
        static final /* synthetic */ int[] getHighSpeedVideoFpsRangesFor;

        static {
            int[] iArr = new int[com.google.protobuf.GeneratedMessageLite.MethodToInvoke.values().length];
            getHighSpeedVideoFpsRangesFor = iArr;
            try {
                iArr[com.google.protobuf.GeneratedMessageLite.MethodToInvoke.NEW_MUTABLE_INSTANCE.ordinal()] = 1;
            } catch (java.lang.NoSuchFieldError unused) {
            }
            try {
                getHighSpeedVideoFpsRangesFor[com.google.protobuf.GeneratedMessageLite.MethodToInvoke.NEW_BUILDER.ordinal()] = 2;
            } catch (java.lang.NoSuchFieldError unused2) {
            }
            try {
                getHighSpeedVideoFpsRangesFor[com.google.protobuf.GeneratedMessageLite.MethodToInvoke.BUILD_MESSAGE_INFO.ordinal()] = 3;
            } catch (java.lang.NoSuchFieldError unused3) {
            }
            try {
                getHighSpeedVideoFpsRangesFor[com.google.protobuf.GeneratedMessageLite.MethodToInvoke.GET_DEFAULT_INSTANCE.ordinal()] = 4;
            } catch (java.lang.NoSuchFieldError unused4) {
            }
            try {
                getHighSpeedVideoFpsRangesFor[com.google.protobuf.GeneratedMessageLite.MethodToInvoke.GET_PARSER.ordinal()] = 5;
            } catch (java.lang.NoSuchFieldError unused5) {
            }
            try {
                getHighSpeedVideoFpsRangesFor[com.google.protobuf.GeneratedMessageLite.MethodToInvoke.GET_MEMOIZED_IS_INITIALIZED.ordinal()] = 6;
            } catch (java.lang.NoSuchFieldError unused6) {
            }
            try {
                getHighSpeedVideoFpsRangesFor[com.google.protobuf.GeneratedMessageLite.MethodToInvoke.SET_MEMOIZED_IS_INITIALIZED.ordinal()] = 7;
            } catch (java.lang.NoSuchFieldError unused7) {
            }
        }
    }

    static final class FeatureStatesDefaultEntryHolder {
        static final com.google.protobuf.MapEntryLite<java.lang.String, org.chromium.net.httpflags.BaseFeatureOverrides.FeatureState> Camera2StreamConfigurationMap = com.google.protobuf.MapEntryLite.newDefaultInstance(com.google.protobuf.WireFormat.FieldType.STRING, "", com.google.protobuf.WireFormat.FieldType.MESSAGE, org.chromium.net.httpflags.BaseFeatureOverrides.FeatureState.getDefaultInstance());

        private FeatureStatesDefaultEntryHolder() {
        }
    }

    @Override // org.chromium.net.httpflags.BaseFeatureOverridesOrBuilder
    @java.lang.Deprecated
    public final java.util.Map<java.lang.String, org.chromium.net.httpflags.BaseFeatureOverrides.FeatureState> getFeatureStates() {
        return getFeatureStatesMap();
    }

    public static org.chromium.net.httpflags.BaseFeatureOverrides parseFrom(java.nio.ByteBuffer byteBuffer) throws com.google.protobuf.InvalidProtocolBufferException {
        return (org.chromium.net.httpflags.BaseFeatureOverrides) com.google.protobuf.GeneratedMessageLite.parseFrom(Camera2StreamConfigurationMap, byteBuffer);
    }

    public static org.chromium.net.httpflags.BaseFeatureOverrides parseFrom(java.nio.ByteBuffer byteBuffer, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) throws com.google.protobuf.InvalidProtocolBufferException {
        return (org.chromium.net.httpflags.BaseFeatureOverrides) com.google.protobuf.GeneratedMessageLite.parseFrom(Camera2StreamConfigurationMap, byteBuffer, extensionRegistryLite);
    }

    public static org.chromium.net.httpflags.BaseFeatureOverrides parseFrom(com.google.protobuf.ByteString byteString) throws com.google.protobuf.InvalidProtocolBufferException {
        return (org.chromium.net.httpflags.BaseFeatureOverrides) com.google.protobuf.GeneratedMessageLite.parseFrom(Camera2StreamConfigurationMap, byteString);
    }

    public static org.chromium.net.httpflags.BaseFeatureOverrides parseFrom(com.google.protobuf.ByteString byteString, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) throws com.google.protobuf.InvalidProtocolBufferException {
        return (org.chromium.net.httpflags.BaseFeatureOverrides) com.google.protobuf.GeneratedMessageLite.parseFrom(Camera2StreamConfigurationMap, byteString, extensionRegistryLite);
    }

    public static org.chromium.net.httpflags.BaseFeatureOverrides parseFrom(byte[] bArr) throws com.google.protobuf.InvalidProtocolBufferException {
        return (org.chromium.net.httpflags.BaseFeatureOverrides) com.google.protobuf.GeneratedMessageLite.parseFrom(Camera2StreamConfigurationMap, bArr);
    }

    public static org.chromium.net.httpflags.BaseFeatureOverrides parseFrom(byte[] bArr, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) throws com.google.protobuf.InvalidProtocolBufferException {
        return (org.chromium.net.httpflags.BaseFeatureOverrides) com.google.protobuf.GeneratedMessageLite.parseFrom(Camera2StreamConfigurationMap, bArr, extensionRegistryLite);
    }

    public static org.chromium.net.httpflags.BaseFeatureOverrides parseFrom(java.io.InputStream inputStream) throws java.io.IOException {
        return (org.chromium.net.httpflags.BaseFeatureOverrides) com.google.protobuf.GeneratedMessageLite.parseFrom(Camera2StreamConfigurationMap, inputStream);
    }

    public static org.chromium.net.httpflags.BaseFeatureOverrides parseFrom(java.io.InputStream inputStream, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) throws java.io.IOException {
        return (org.chromium.net.httpflags.BaseFeatureOverrides) com.google.protobuf.GeneratedMessageLite.parseFrom(Camera2StreamConfigurationMap, inputStream, extensionRegistryLite);
    }

    public static org.chromium.net.httpflags.BaseFeatureOverrides parseDelimitedFrom(java.io.InputStream inputStream) throws java.io.IOException {
        return (org.chromium.net.httpflags.BaseFeatureOverrides) parseDelimitedFrom(Camera2StreamConfigurationMap, inputStream);
    }

    public static org.chromium.net.httpflags.BaseFeatureOverrides parseDelimitedFrom(java.io.InputStream inputStream, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) throws java.io.IOException {
        return (org.chromium.net.httpflags.BaseFeatureOverrides) parseDelimitedFrom(Camera2StreamConfigurationMap, inputStream, extensionRegistryLite);
    }

    public static org.chromium.net.httpflags.BaseFeatureOverrides parseFrom(com.google.protobuf.CodedInputStream codedInputStream) throws java.io.IOException {
        return (org.chromium.net.httpflags.BaseFeatureOverrides) com.google.protobuf.GeneratedMessageLite.parseFrom(Camera2StreamConfigurationMap, codedInputStream);
    }

    public static org.chromium.net.httpflags.BaseFeatureOverrides parseFrom(com.google.protobuf.CodedInputStream codedInputStream, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) throws java.io.IOException {
        return (org.chromium.net.httpflags.BaseFeatureOverrides) com.google.protobuf.GeneratedMessageLite.parseFrom(Camera2StreamConfigurationMap, codedInputStream, extensionRegistryLite);
    }

    public static org.chromium.net.httpflags.BaseFeatureOverrides.Builder newBuilder() {
        return Camera2StreamConfigurationMap.createBuilder();
    }

    public static org.chromium.net.httpflags.BaseFeatureOverrides.Builder newBuilder(org.chromium.net.httpflags.BaseFeatureOverrides baseFeatureOverrides) {
        return Camera2StreamConfigurationMap.createBuilder(baseFeatureOverrides);
    }

    public static final class Builder extends com.google.protobuf.GeneratedMessageLite.Builder<org.chromium.net.httpflags.BaseFeatureOverrides, org.chromium.net.httpflags.BaseFeatureOverrides.Builder> implements org.chromium.net.httpflags.BaseFeatureOverridesOrBuilder {
        private Builder() {
            super(org.chromium.net.httpflags.BaseFeatureOverrides.Camera2StreamConfigurationMap);
        }

        @Override // org.chromium.net.httpflags.BaseFeatureOverridesOrBuilder
        public final int getFeatureStatesCount() {
            return ((org.chromium.net.httpflags.BaseFeatureOverrides) this.instance).getFeatureStatesMap().size();
        }

        @Override // org.chromium.net.httpflags.BaseFeatureOverridesOrBuilder
        public final boolean containsFeatureStates(java.lang.String str) {
            return ((org.chromium.net.httpflags.BaseFeatureOverrides) this.instance).getFeatureStatesMap().containsKey(str);
        }

        public final org.chromium.net.httpflags.BaseFeatureOverrides.Builder clearFeatureStates() {
            copyOnWrite();
            org.chromium.net.httpflags.BaseFeatureOverrides.getHighResolutionOutputSizeshNQ4ISI((org.chromium.net.httpflags.BaseFeatureOverrides) this.instance).clear();
            return this;
        }

        public final org.chromium.net.httpflags.BaseFeatureOverrides.Builder removeFeatureStates(java.lang.String str) {
            copyOnWrite();
            org.chromium.net.httpflags.BaseFeatureOverrides.getHighResolutionOutputSizeshNQ4ISI((org.chromium.net.httpflags.BaseFeatureOverrides) this.instance).remove(str);
            return this;
        }

        @Override // org.chromium.net.httpflags.BaseFeatureOverridesOrBuilder
        @java.lang.Deprecated
        public final java.util.Map<java.lang.String, org.chromium.net.httpflags.BaseFeatureOverrides.FeatureState> getFeatureStates() {
            return getFeatureStatesMap();
        }

        @Override // org.chromium.net.httpflags.BaseFeatureOverridesOrBuilder
        public final java.util.Map<java.lang.String, org.chromium.net.httpflags.BaseFeatureOverrides.FeatureState> getFeatureStatesMap() {
            return java.util.Collections.unmodifiableMap(((org.chromium.net.httpflags.BaseFeatureOverrides) this.instance).getFeatureStatesMap());
        }

        @Override // org.chromium.net.httpflags.BaseFeatureOverridesOrBuilder
        public final org.chromium.net.httpflags.BaseFeatureOverrides.FeatureState getFeatureStatesOrDefault(java.lang.String str, org.chromium.net.httpflags.BaseFeatureOverrides.FeatureState featureState) {
            java.util.Map<java.lang.String, org.chromium.net.httpflags.BaseFeatureOverrides.FeatureState> featureStatesMap = ((org.chromium.net.httpflags.BaseFeatureOverrides) this.instance).getFeatureStatesMap();
            return featureStatesMap.containsKey(str) ? featureStatesMap.get(str) : featureState;
        }

        @Override // org.chromium.net.httpflags.BaseFeatureOverridesOrBuilder
        public final org.chromium.net.httpflags.BaseFeatureOverrides.FeatureState getFeatureStatesOrThrow(java.lang.String str) {
            java.util.Map<java.lang.String, org.chromium.net.httpflags.BaseFeatureOverrides.FeatureState> featureStatesMap = ((org.chromium.net.httpflags.BaseFeatureOverrides) this.instance).getFeatureStatesMap();
            if (!featureStatesMap.containsKey(str)) {
                throw new java.lang.IllegalArgumentException();
            }
            return featureStatesMap.get(str);
        }

        public final org.chromium.net.httpflags.BaseFeatureOverrides.Builder putFeatureStates(java.lang.String str, org.chromium.net.httpflags.BaseFeatureOverrides.FeatureState featureState) {
            copyOnWrite();
            org.chromium.net.httpflags.BaseFeatureOverrides.getHighResolutionOutputSizeshNQ4ISI((org.chromium.net.httpflags.BaseFeatureOverrides) this.instance).put(str, featureState);
            return this;
        }

        public final org.chromium.net.httpflags.BaseFeatureOverrides.Builder putAllFeatureStates(java.util.Map<java.lang.String, org.chromium.net.httpflags.BaseFeatureOverrides.FeatureState> map) {
            copyOnWrite();
            org.chromium.net.httpflags.BaseFeatureOverrides.getHighResolutionOutputSizeshNQ4ISI((org.chromium.net.httpflags.BaseFeatureOverrides) this.instance).putAll(map);
            return this;
        }

        /* synthetic */ Builder(byte b) {
            this();
        }
    }

    @Override // com.google.protobuf.GeneratedMessageLite
    public final java.lang.Object dynamicMethod(com.google.protobuf.GeneratedMessageLite.MethodToInvoke methodToInvoke, java.lang.Object obj, java.lang.Object obj2) {
        com.google.protobuf.Parser parser;
        switch (org.chromium.net.httpflags.BaseFeatureOverrides.AnonymousClass1.getHighSpeedVideoFpsRangesFor[methodToInvoke.ordinal()]) {
            case 1:
                return new org.chromium.net.httpflags.BaseFeatureOverrides();
            case 2:
                return new org.chromium.net.httpflags.BaseFeatureOverrides.Builder((byte) 0);
            case 3:
                return newMessageInfo(Camera2StreamConfigurationMap, "\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u00012", new java.lang.Object[]{"featureStates_", org.chromium.net.httpflags.BaseFeatureOverrides.FeatureStatesDefaultEntryHolder.Camera2StreamConfigurationMap});
            case 4:
                return Camera2StreamConfigurationMap;
            case 5:
                com.google.protobuf.Parser<org.chromium.net.httpflags.BaseFeatureOverrides> parser2 = getHighSpeedVideoFpsRanges;
                if (parser2 != null) {
                    return parser2;
                }
                synchronized (org.chromium.net.httpflags.BaseFeatureOverrides.class) {
                    parser = getHighSpeedVideoFpsRanges;
                    if (parser == null) {
                        parser = new com.google.protobuf.GeneratedMessageLite.DefaultInstanceBasedParser(Camera2StreamConfigurationMap);
                        getHighSpeedVideoFpsRanges = parser;
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
        org.chromium.net.httpflags.BaseFeatureOverrides baseFeatureOverrides = new org.chromium.net.httpflags.BaseFeatureOverrides();
        Camera2StreamConfigurationMap = baseFeatureOverrides;
        com.google.protobuf.GeneratedMessageLite.registerDefaultInstance(org.chromium.net.httpflags.BaseFeatureOverrides.class, baseFeatureOverrides);
    }

    public static org.chromium.net.httpflags.BaseFeatureOverrides getDefaultInstance() {
        return Camera2StreamConfigurationMap;
    }

    public static com.google.protobuf.Parser<org.chromium.net.httpflags.BaseFeatureOverrides> parser() {
        return Camera2StreamConfigurationMap.getParserForType();
    }

    static /* synthetic */ java.util.Map getHighResolutionOutputSizeshNQ4ISI(org.chromium.net.httpflags.BaseFeatureOverrides baseFeatureOverrides) {
        if (!baseFeatureOverrides.getHighSpeedVideoSizes.isMutable()) {
            baseFeatureOverrides.getHighSpeedVideoSizes = baseFeatureOverrides.getHighSpeedVideoSizes.mutableCopy();
        }
        return baseFeatureOverrides.getHighSpeedVideoSizes;
    }

    @Override // org.chromium.net.httpflags.BaseFeatureOverridesOrBuilder
    public final boolean containsFeatureStates(java.lang.String str) {
        return this.getHighSpeedVideoSizes.containsKey(str);
    }

    @Override // org.chromium.net.httpflags.BaseFeatureOverridesOrBuilder
    public final int getFeatureStatesCount() {
        return this.getHighSpeedVideoSizes.size();
    }

    @Override // org.chromium.net.httpflags.BaseFeatureOverridesOrBuilder
    public final java.util.Map<java.lang.String, org.chromium.net.httpflags.BaseFeatureOverrides.FeatureState> getFeatureStatesMap() {
        return java.util.Collections.unmodifiableMap(this.getHighSpeedVideoSizes);
    }

    @Override // org.chromium.net.httpflags.BaseFeatureOverridesOrBuilder
    public final org.chromium.net.httpflags.BaseFeatureOverrides.FeatureState getFeatureStatesOrDefault(java.lang.String str, org.chromium.net.httpflags.BaseFeatureOverrides.FeatureState featureState) {
        com.google.protobuf.MapFieldLite<java.lang.String, org.chromium.net.httpflags.BaseFeatureOverrides.FeatureState> mapFieldLite = this.getHighSpeedVideoSizes;
        return mapFieldLite.containsKey(str) ? mapFieldLite.get(str) : featureState;
    }

    @Override // org.chromium.net.httpflags.BaseFeatureOverridesOrBuilder
    public final org.chromium.net.httpflags.BaseFeatureOverrides.FeatureState getFeatureStatesOrThrow(java.lang.String str) {
        com.google.protobuf.MapFieldLite<java.lang.String, org.chromium.net.httpflags.BaseFeatureOverrides.FeatureState> mapFieldLite = this.getHighSpeedVideoSizes;
        if (!mapFieldLite.containsKey(str)) {
            throw new java.lang.IllegalArgumentException();
        }
        return mapFieldLite.get(str);
    }
}
