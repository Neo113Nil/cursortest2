package org.chromium.net.httpflags;

/* loaded from: classes18.dex */
public final class Flags extends com.google.protobuf.GeneratedMessageLite<org.chromium.net.httpflags.Flags, org.chromium.net.httpflags.Flags.Builder> implements org.chromium.net.httpflags.FlagsOrBuilder {
    public static final int FLAGS_FIELD_NUMBER = 1;
    private static final org.chromium.net.httpflags.Flags getHighResolutionOutputSizeshNQ4ISI;
    private static volatile com.google.protobuf.Parser<org.chromium.net.httpflags.Flags> getHighSpeedVideoFpsRangesFor;
    private com.google.protobuf.MapFieldLite<java.lang.String, org.chromium.net.httpflags.FlagValue> getHighSpeedVideoSizes = com.google.protobuf.MapFieldLite.emptyMapField();

    private Flags() {
    }

    static final class FlagsDefaultEntryHolder {
        static final com.google.protobuf.MapEntryLite<java.lang.String, org.chromium.net.httpflags.FlagValue> Camera2StreamConfigurationMap = com.google.protobuf.MapEntryLite.newDefaultInstance(com.google.protobuf.WireFormat.FieldType.STRING, "", com.google.protobuf.WireFormat.FieldType.MESSAGE, org.chromium.net.httpflags.FlagValue.getDefaultInstance());

        private FlagsDefaultEntryHolder() {
        }
    }

    @Override // org.chromium.net.httpflags.FlagsOrBuilder
    @java.lang.Deprecated
    public final java.util.Map<java.lang.String, org.chromium.net.httpflags.FlagValue> getFlags() {
        return getFlagsMap();
    }

    public static org.chromium.net.httpflags.Flags parseFrom(java.nio.ByteBuffer byteBuffer) throws com.google.protobuf.InvalidProtocolBufferException {
        return (org.chromium.net.httpflags.Flags) com.google.protobuf.GeneratedMessageLite.parseFrom(getHighResolutionOutputSizeshNQ4ISI, byteBuffer);
    }

    public static org.chromium.net.httpflags.Flags parseFrom(java.nio.ByteBuffer byteBuffer, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) throws com.google.protobuf.InvalidProtocolBufferException {
        return (org.chromium.net.httpflags.Flags) com.google.protobuf.GeneratedMessageLite.parseFrom(getHighResolutionOutputSizeshNQ4ISI, byteBuffer, extensionRegistryLite);
    }

    public static org.chromium.net.httpflags.Flags parseFrom(com.google.protobuf.ByteString byteString) throws com.google.protobuf.InvalidProtocolBufferException {
        return (org.chromium.net.httpflags.Flags) com.google.protobuf.GeneratedMessageLite.parseFrom(getHighResolutionOutputSizeshNQ4ISI, byteString);
    }

    public static org.chromium.net.httpflags.Flags parseFrom(com.google.protobuf.ByteString byteString, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) throws com.google.protobuf.InvalidProtocolBufferException {
        return (org.chromium.net.httpflags.Flags) com.google.protobuf.GeneratedMessageLite.parseFrom(getHighResolutionOutputSizeshNQ4ISI, byteString, extensionRegistryLite);
    }

    public static org.chromium.net.httpflags.Flags parseFrom(byte[] bArr) throws com.google.protobuf.InvalidProtocolBufferException {
        return (org.chromium.net.httpflags.Flags) com.google.protobuf.GeneratedMessageLite.parseFrom(getHighResolutionOutputSizeshNQ4ISI, bArr);
    }

    public static org.chromium.net.httpflags.Flags parseFrom(byte[] bArr, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) throws com.google.protobuf.InvalidProtocolBufferException {
        return (org.chromium.net.httpflags.Flags) com.google.protobuf.GeneratedMessageLite.parseFrom(getHighResolutionOutputSizeshNQ4ISI, bArr, extensionRegistryLite);
    }

    public static org.chromium.net.httpflags.Flags parseFrom(java.io.InputStream inputStream) throws java.io.IOException {
        return (org.chromium.net.httpflags.Flags) com.google.protobuf.GeneratedMessageLite.parseFrom(getHighResolutionOutputSizeshNQ4ISI, inputStream);
    }

    public static org.chromium.net.httpflags.Flags parseFrom(java.io.InputStream inputStream, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) throws java.io.IOException {
        return (org.chromium.net.httpflags.Flags) com.google.protobuf.GeneratedMessageLite.parseFrom(getHighResolutionOutputSizeshNQ4ISI, inputStream, extensionRegistryLite);
    }

    public static org.chromium.net.httpflags.Flags parseDelimitedFrom(java.io.InputStream inputStream) throws java.io.IOException {
        return (org.chromium.net.httpflags.Flags) parseDelimitedFrom(getHighResolutionOutputSizeshNQ4ISI, inputStream);
    }

    public static org.chromium.net.httpflags.Flags parseDelimitedFrom(java.io.InputStream inputStream, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) throws java.io.IOException {
        return (org.chromium.net.httpflags.Flags) parseDelimitedFrom(getHighResolutionOutputSizeshNQ4ISI, inputStream, extensionRegistryLite);
    }

    public static org.chromium.net.httpflags.Flags parseFrom(com.google.protobuf.CodedInputStream codedInputStream) throws java.io.IOException {
        return (org.chromium.net.httpflags.Flags) com.google.protobuf.GeneratedMessageLite.parseFrom(getHighResolutionOutputSizeshNQ4ISI, codedInputStream);
    }

    public static org.chromium.net.httpflags.Flags parseFrom(com.google.protobuf.CodedInputStream codedInputStream, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) throws java.io.IOException {
        return (org.chromium.net.httpflags.Flags) com.google.protobuf.GeneratedMessageLite.parseFrom(getHighResolutionOutputSizeshNQ4ISI, codedInputStream, extensionRegistryLite);
    }

    public static org.chromium.net.httpflags.Flags.Builder newBuilder() {
        return getHighResolutionOutputSizeshNQ4ISI.createBuilder();
    }

    public static org.chromium.net.httpflags.Flags.Builder newBuilder(org.chromium.net.httpflags.Flags flags) {
        return getHighResolutionOutputSizeshNQ4ISI.createBuilder(flags);
    }

    public static final class Builder extends com.google.protobuf.GeneratedMessageLite.Builder<org.chromium.net.httpflags.Flags, org.chromium.net.httpflags.Flags.Builder> implements org.chromium.net.httpflags.FlagsOrBuilder {
        private Builder() {
            super(org.chromium.net.httpflags.Flags.getHighResolutionOutputSizeshNQ4ISI);
        }

        @Override // org.chromium.net.httpflags.FlagsOrBuilder
        public final int getFlagsCount() {
            return ((org.chromium.net.httpflags.Flags) this.instance).getFlagsMap().size();
        }

        @Override // org.chromium.net.httpflags.FlagsOrBuilder
        public final boolean containsFlags(java.lang.String str) {
            return ((org.chromium.net.httpflags.Flags) this.instance).getFlagsMap().containsKey(str);
        }

        public final org.chromium.net.httpflags.Flags.Builder clearFlags() {
            copyOnWrite();
            org.chromium.net.httpflags.Flags.Camera2StreamConfigurationMap((org.chromium.net.httpflags.Flags) this.instance).clear();
            return this;
        }

        public final org.chromium.net.httpflags.Flags.Builder removeFlags(java.lang.String str) {
            copyOnWrite();
            org.chromium.net.httpflags.Flags.Camera2StreamConfigurationMap((org.chromium.net.httpflags.Flags) this.instance).remove(str);
            return this;
        }

        @Override // org.chromium.net.httpflags.FlagsOrBuilder
        @java.lang.Deprecated
        public final java.util.Map<java.lang.String, org.chromium.net.httpflags.FlagValue> getFlags() {
            return getFlagsMap();
        }

        @Override // org.chromium.net.httpflags.FlagsOrBuilder
        public final java.util.Map<java.lang.String, org.chromium.net.httpflags.FlagValue> getFlagsMap() {
            return java.util.Collections.unmodifiableMap(((org.chromium.net.httpflags.Flags) this.instance).getFlagsMap());
        }

        @Override // org.chromium.net.httpflags.FlagsOrBuilder
        public final org.chromium.net.httpflags.FlagValue getFlagsOrDefault(java.lang.String str, org.chromium.net.httpflags.FlagValue flagValue) {
            java.util.Map<java.lang.String, org.chromium.net.httpflags.FlagValue> flagsMap = ((org.chromium.net.httpflags.Flags) this.instance).getFlagsMap();
            return flagsMap.containsKey(str) ? flagsMap.get(str) : flagValue;
        }

        @Override // org.chromium.net.httpflags.FlagsOrBuilder
        public final org.chromium.net.httpflags.FlagValue getFlagsOrThrow(java.lang.String str) {
            java.util.Map<java.lang.String, org.chromium.net.httpflags.FlagValue> flagsMap = ((org.chromium.net.httpflags.Flags) this.instance).getFlagsMap();
            if (!flagsMap.containsKey(str)) {
                throw new java.lang.IllegalArgumentException();
            }
            return flagsMap.get(str);
        }

        public final org.chromium.net.httpflags.Flags.Builder putFlags(java.lang.String str, org.chromium.net.httpflags.FlagValue flagValue) {
            copyOnWrite();
            org.chromium.net.httpflags.Flags.Camera2StreamConfigurationMap((org.chromium.net.httpflags.Flags) this.instance).put(str, flagValue);
            return this;
        }

        public final org.chromium.net.httpflags.Flags.Builder putAllFlags(java.util.Map<java.lang.String, org.chromium.net.httpflags.FlagValue> map) {
            copyOnWrite();
            org.chromium.net.httpflags.Flags.Camera2StreamConfigurationMap((org.chromium.net.httpflags.Flags) this.instance).putAll(map);
            return this;
        }

        /* synthetic */ Builder(byte b) {
            this();
        }
    }

    /* renamed from: org.chromium.net.httpflags.Flags$1, reason: invalid class name */
    static /* synthetic */ class AnonymousClass1 {
        static final /* synthetic */ int[] Camera2StreamConfigurationMap;

        static {
            int[] iArr = new int[com.google.protobuf.GeneratedMessageLite.MethodToInvoke.values().length];
            Camera2StreamConfigurationMap = iArr;
            try {
                iArr[com.google.protobuf.GeneratedMessageLite.MethodToInvoke.NEW_MUTABLE_INSTANCE.ordinal()] = 1;
            } catch (java.lang.NoSuchFieldError unused) {
            }
            try {
                Camera2StreamConfigurationMap[com.google.protobuf.GeneratedMessageLite.MethodToInvoke.NEW_BUILDER.ordinal()] = 2;
            } catch (java.lang.NoSuchFieldError unused2) {
            }
            try {
                Camera2StreamConfigurationMap[com.google.protobuf.GeneratedMessageLite.MethodToInvoke.BUILD_MESSAGE_INFO.ordinal()] = 3;
            } catch (java.lang.NoSuchFieldError unused3) {
            }
            try {
                Camera2StreamConfigurationMap[com.google.protobuf.GeneratedMessageLite.MethodToInvoke.GET_DEFAULT_INSTANCE.ordinal()] = 4;
            } catch (java.lang.NoSuchFieldError unused4) {
            }
            try {
                Camera2StreamConfigurationMap[com.google.protobuf.GeneratedMessageLite.MethodToInvoke.GET_PARSER.ordinal()] = 5;
            } catch (java.lang.NoSuchFieldError unused5) {
            }
            try {
                Camera2StreamConfigurationMap[com.google.protobuf.GeneratedMessageLite.MethodToInvoke.GET_MEMOIZED_IS_INITIALIZED.ordinal()] = 6;
            } catch (java.lang.NoSuchFieldError unused6) {
            }
            try {
                Camera2StreamConfigurationMap[com.google.protobuf.GeneratedMessageLite.MethodToInvoke.SET_MEMOIZED_IS_INITIALIZED.ordinal()] = 7;
            } catch (java.lang.NoSuchFieldError unused7) {
            }
        }
    }

    @Override // com.google.protobuf.GeneratedMessageLite
    public final java.lang.Object dynamicMethod(com.google.protobuf.GeneratedMessageLite.MethodToInvoke methodToInvoke, java.lang.Object obj, java.lang.Object obj2) {
        com.google.protobuf.Parser parser;
        switch (org.chromium.net.httpflags.Flags.AnonymousClass1.Camera2StreamConfigurationMap[methodToInvoke.ordinal()]) {
            case 1:
                return new org.chromium.net.httpflags.Flags();
            case 2:
                return new org.chromium.net.httpflags.Flags.Builder((byte) 0);
            case 3:
                return newMessageInfo(getHighResolutionOutputSizeshNQ4ISI, "\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u00012", new java.lang.Object[]{"flags_", org.chromium.net.httpflags.Flags.FlagsDefaultEntryHolder.Camera2StreamConfigurationMap});
            case 4:
                return getHighResolutionOutputSizeshNQ4ISI;
            case 5:
                com.google.protobuf.Parser<org.chromium.net.httpflags.Flags> parser2 = getHighSpeedVideoFpsRangesFor;
                if (parser2 != null) {
                    return parser2;
                }
                synchronized (org.chromium.net.httpflags.Flags.class) {
                    parser = getHighSpeedVideoFpsRangesFor;
                    if (parser == null) {
                        parser = new com.google.protobuf.GeneratedMessageLite.DefaultInstanceBasedParser(getHighResolutionOutputSizeshNQ4ISI);
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
        org.chromium.net.httpflags.Flags flags = new org.chromium.net.httpflags.Flags();
        getHighResolutionOutputSizeshNQ4ISI = flags;
        com.google.protobuf.GeneratedMessageLite.registerDefaultInstance(org.chromium.net.httpflags.Flags.class, flags);
    }

    public static org.chromium.net.httpflags.Flags getDefaultInstance() {
        return getHighResolutionOutputSizeshNQ4ISI;
    }

    public static com.google.protobuf.Parser<org.chromium.net.httpflags.Flags> parser() {
        return getHighResolutionOutputSizeshNQ4ISI.getParserForType();
    }

    static /* synthetic */ java.util.Map Camera2StreamConfigurationMap(org.chromium.net.httpflags.Flags flags) {
        if (!flags.getHighSpeedVideoSizes.isMutable()) {
            flags.getHighSpeedVideoSizes = flags.getHighSpeedVideoSizes.mutableCopy();
        }
        return flags.getHighSpeedVideoSizes;
    }

    @Override // org.chromium.net.httpflags.FlagsOrBuilder
    public final boolean containsFlags(java.lang.String str) {
        return this.getHighSpeedVideoSizes.containsKey(str);
    }

    @Override // org.chromium.net.httpflags.FlagsOrBuilder
    public final int getFlagsCount() {
        return this.getHighSpeedVideoSizes.size();
    }

    @Override // org.chromium.net.httpflags.FlagsOrBuilder
    public final java.util.Map<java.lang.String, org.chromium.net.httpflags.FlagValue> getFlagsMap() {
        return java.util.Collections.unmodifiableMap(this.getHighSpeedVideoSizes);
    }

    @Override // org.chromium.net.httpflags.FlagsOrBuilder
    public final org.chromium.net.httpflags.FlagValue getFlagsOrDefault(java.lang.String str, org.chromium.net.httpflags.FlagValue flagValue) {
        com.google.protobuf.MapFieldLite<java.lang.String, org.chromium.net.httpflags.FlagValue> mapFieldLite = this.getHighSpeedVideoSizes;
        return mapFieldLite.containsKey(str) ? mapFieldLite.get(str) : flagValue;
    }

    @Override // org.chromium.net.httpflags.FlagsOrBuilder
    public final org.chromium.net.httpflags.FlagValue getFlagsOrThrow(java.lang.String str) {
        com.google.protobuf.MapFieldLite<java.lang.String, org.chromium.net.httpflags.FlagValue> mapFieldLite = this.getHighSpeedVideoSizes;
        if (!mapFieldLite.containsKey(str)) {
            throw new java.lang.IllegalArgumentException();
        }
        return mapFieldLite.get(str);
    }
}
