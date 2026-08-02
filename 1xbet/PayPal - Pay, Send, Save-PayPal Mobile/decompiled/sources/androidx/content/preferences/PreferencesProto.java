package androidx.content.preferences;

/* loaded from: classes3.dex */
public final class PreferencesProto {

    public interface PreferenceMapOrBuilder extends androidx.content.preferences.protobuf.MessageLiteOrBuilder {
        boolean containsPreferences(java.lang.String str);

        @java.lang.Deprecated
        java.util.Map<java.lang.String, androidx.datastore.preferences.PreferencesProto.Value> getPreferences();

        int getPreferencesCount();

        java.util.Map<java.lang.String, androidx.datastore.preferences.PreferencesProto.Value> getPreferencesMap();

        androidx.datastore.preferences.PreferencesProto.Value getPreferencesOrDefault(java.lang.String str, androidx.datastore.preferences.PreferencesProto.Value value);

        androidx.datastore.preferences.PreferencesProto.Value getPreferencesOrThrow(java.lang.String str);
    }

    public interface StringSetOrBuilder extends androidx.content.preferences.protobuf.MessageLiteOrBuilder {
        java.lang.String getStrings(int i);

        androidx.content.preferences.protobuf.ByteString getStringsBytes(int i);

        int getStringsCount();

        java.util.List<java.lang.String> getStringsList();
    }

    public interface ValueOrBuilder extends androidx.content.preferences.protobuf.MessageLiteOrBuilder {
        boolean getBoolean();

        androidx.content.preferences.protobuf.ByteString getBytes();

        double getDouble();

        float getFloat();

        int getInteger();

        long getLong();

        java.lang.String getString();

        androidx.content.preferences.protobuf.ByteString getStringBytes();

        androidx.datastore.preferences.PreferencesProto.StringSet getStringSet();

        androidx.datastore.preferences.PreferencesProto.Value.ValueCase getValueCase();

        boolean hasBoolean();

        boolean hasBytes();

        boolean hasDouble();

        boolean hasFloat();

        boolean hasInteger();

        boolean hasLong();

        boolean hasString();

        boolean hasStringSet();
    }

    public static void registerAllExtensions(androidx.content.preferences.protobuf.ExtensionRegistryLite extensionRegistryLite) {
    }

    private PreferencesProto() {
    }

    public static final class PreferenceMap extends androidx.content.preferences.protobuf.GeneratedMessageLite<androidx.datastore.preferences.PreferencesProto.PreferenceMap, androidx.datastore.preferences.PreferencesProto.PreferenceMap.Builder> implements androidx.datastore.preferences.PreferencesProto.PreferenceMapOrBuilder {
        private static final androidx.datastore.preferences.PreferencesProto.PreferenceMap DEFAULT_INSTANCE;
        private static volatile androidx.content.preferences.protobuf.Parser<androidx.datastore.preferences.PreferencesProto.PreferenceMap> PARSER = null;
        public static final int PREFERENCES_FIELD_NUMBER = 1;
        private androidx.content.preferences.protobuf.MapFieldLite<java.lang.String, androidx.datastore.preferences.PreferencesProto.Value> preferences_ = androidx.content.preferences.protobuf.MapFieldLite.emptyMapField();

        private PreferenceMap() {
        }

        static final class PreferencesDefaultEntryHolder {
            static final androidx.content.preferences.protobuf.MapEntryLite<java.lang.String, androidx.datastore.preferences.PreferencesProto.Value> getHighSpeedVideoFpsRangesFor = androidx.content.preferences.protobuf.MapEntryLite.newDefaultInstance(androidx.datastore.preferences.protobuf.WireFormat.FieldType.STRING, "", androidx.datastore.preferences.protobuf.WireFormat.FieldType.MESSAGE, androidx.datastore.preferences.PreferencesProto.Value.getDefaultInstance());

            private PreferencesDefaultEntryHolder() {
            }
        }

        @Override // androidx.datastore.preferences.PreferencesProto.PreferenceMapOrBuilder
        @java.lang.Deprecated
        public final java.util.Map<java.lang.String, androidx.datastore.preferences.PreferencesProto.Value> getPreferences() {
            return getPreferencesMap();
        }

        public static androidx.datastore.preferences.PreferencesProto.PreferenceMap parseFrom(java.nio.ByteBuffer byteBuffer) throws androidx.content.preferences.protobuf.InvalidProtocolBufferException {
            return (androidx.datastore.preferences.PreferencesProto.PreferenceMap) androidx.content.preferences.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
        }

        public static androidx.datastore.preferences.PreferencesProto.PreferenceMap parseFrom(java.nio.ByteBuffer byteBuffer, androidx.content.preferences.protobuf.ExtensionRegistryLite extensionRegistryLite) throws androidx.content.preferences.protobuf.InvalidProtocolBufferException {
            return (androidx.datastore.preferences.PreferencesProto.PreferenceMap) androidx.content.preferences.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
        }

        public static androidx.datastore.preferences.PreferencesProto.PreferenceMap parseFrom(androidx.content.preferences.protobuf.ByteString byteString) throws androidx.content.preferences.protobuf.InvalidProtocolBufferException {
            return (androidx.datastore.preferences.PreferencesProto.PreferenceMap) androidx.content.preferences.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
        }

        public static androidx.datastore.preferences.PreferencesProto.PreferenceMap parseFrom(androidx.content.preferences.protobuf.ByteString byteString, androidx.content.preferences.protobuf.ExtensionRegistryLite extensionRegistryLite) throws androidx.content.preferences.protobuf.InvalidProtocolBufferException {
            return (androidx.datastore.preferences.PreferencesProto.PreferenceMap) androidx.content.preferences.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
        }

        public static androidx.datastore.preferences.PreferencesProto.PreferenceMap parseFrom(byte[] bArr) throws androidx.content.preferences.protobuf.InvalidProtocolBufferException {
            return (androidx.datastore.preferences.PreferencesProto.PreferenceMap) androidx.content.preferences.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
        }

        public static androidx.datastore.preferences.PreferencesProto.PreferenceMap parseFrom(byte[] bArr, androidx.content.preferences.protobuf.ExtensionRegistryLite extensionRegistryLite) throws androidx.content.preferences.protobuf.InvalidProtocolBufferException {
            return (androidx.datastore.preferences.PreferencesProto.PreferenceMap) androidx.content.preferences.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
        }

        public static androidx.datastore.preferences.PreferencesProto.PreferenceMap parseFrom(java.io.InputStream inputStream) throws java.io.IOException {
            return (androidx.datastore.preferences.PreferencesProto.PreferenceMap) androidx.content.preferences.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static androidx.datastore.preferences.PreferencesProto.PreferenceMap parseFrom(java.io.InputStream inputStream, androidx.content.preferences.protobuf.ExtensionRegistryLite extensionRegistryLite) throws java.io.IOException {
            return (androidx.datastore.preferences.PreferencesProto.PreferenceMap) androidx.content.preferences.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
        }

        public static androidx.datastore.preferences.PreferencesProto.PreferenceMap parseDelimitedFrom(java.io.InputStream inputStream) throws java.io.IOException {
            return (androidx.datastore.preferences.PreferencesProto.PreferenceMap) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static androidx.datastore.preferences.PreferencesProto.PreferenceMap parseDelimitedFrom(java.io.InputStream inputStream, androidx.content.preferences.protobuf.ExtensionRegistryLite extensionRegistryLite) throws java.io.IOException {
            return (androidx.datastore.preferences.PreferencesProto.PreferenceMap) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
        }

        public static androidx.datastore.preferences.PreferencesProto.PreferenceMap parseFrom(androidx.content.preferences.protobuf.CodedInputStream codedInputStream) throws java.io.IOException {
            return (androidx.datastore.preferences.PreferencesProto.PreferenceMap) androidx.content.preferences.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
        }

        public static androidx.datastore.preferences.PreferencesProto.PreferenceMap parseFrom(androidx.content.preferences.protobuf.CodedInputStream codedInputStream, androidx.content.preferences.protobuf.ExtensionRegistryLite extensionRegistryLite) throws java.io.IOException {
            return (androidx.datastore.preferences.PreferencesProto.PreferenceMap) androidx.content.preferences.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
        }

        public static androidx.datastore.preferences.PreferencesProto.PreferenceMap.Builder newBuilder() {
            return DEFAULT_INSTANCE.createBuilder();
        }

        public static androidx.datastore.preferences.PreferencesProto.PreferenceMap.Builder newBuilder(androidx.datastore.preferences.PreferencesProto.PreferenceMap preferenceMap) {
            return DEFAULT_INSTANCE.createBuilder(preferenceMap);
        }

        public static final class Builder extends androidx.datastore.preferences.protobuf.GeneratedMessageLite.Builder<androidx.datastore.preferences.PreferencesProto.PreferenceMap, androidx.datastore.preferences.PreferencesProto.PreferenceMap.Builder> implements androidx.datastore.preferences.PreferencesProto.PreferenceMapOrBuilder {
            /* synthetic */ Builder(byte b) {
                this();
            }

            private Builder() {
                super(androidx.datastore.preferences.PreferencesProto.PreferenceMap.DEFAULT_INSTANCE);
            }

            @Override // androidx.datastore.preferences.PreferencesProto.PreferenceMapOrBuilder
            public final int getPreferencesCount() {
                return ((androidx.datastore.preferences.PreferencesProto.PreferenceMap) this.instance).getPreferencesMap().size();
            }

            @Override // androidx.datastore.preferences.PreferencesProto.PreferenceMapOrBuilder
            public final boolean containsPreferences(java.lang.String str) {
                return ((androidx.datastore.preferences.PreferencesProto.PreferenceMap) this.instance).getPreferencesMap().containsKey(str);
            }

            public final androidx.datastore.preferences.PreferencesProto.PreferenceMap.Builder clearPreferences() {
                copyOnWrite();
                androidx.datastore.preferences.PreferencesProto.PreferenceMap.getHighSpeedVideoSizes((androidx.datastore.preferences.PreferencesProto.PreferenceMap) this.instance).clear();
                return this;
            }

            public final androidx.datastore.preferences.PreferencesProto.PreferenceMap.Builder removePreferences(java.lang.String str) {
                copyOnWrite();
                androidx.datastore.preferences.PreferencesProto.PreferenceMap.getHighSpeedVideoSizes((androidx.datastore.preferences.PreferencesProto.PreferenceMap) this.instance).remove(str);
                return this;
            }

            @Override // androidx.datastore.preferences.PreferencesProto.PreferenceMapOrBuilder
            @java.lang.Deprecated
            public final java.util.Map<java.lang.String, androidx.datastore.preferences.PreferencesProto.Value> getPreferences() {
                return getPreferencesMap();
            }

            @Override // androidx.datastore.preferences.PreferencesProto.PreferenceMapOrBuilder
            public final java.util.Map<java.lang.String, androidx.datastore.preferences.PreferencesProto.Value> getPreferencesMap() {
                return java.util.Collections.unmodifiableMap(((androidx.datastore.preferences.PreferencesProto.PreferenceMap) this.instance).getPreferencesMap());
            }

            @Override // androidx.datastore.preferences.PreferencesProto.PreferenceMapOrBuilder
            public final androidx.datastore.preferences.PreferencesProto.Value getPreferencesOrDefault(java.lang.String str, androidx.datastore.preferences.PreferencesProto.Value value) {
                java.util.Map<java.lang.String, androidx.datastore.preferences.PreferencesProto.Value> preferencesMap = ((androidx.datastore.preferences.PreferencesProto.PreferenceMap) this.instance).getPreferencesMap();
                return preferencesMap.containsKey(str) ? preferencesMap.get(str) : value;
            }

            @Override // androidx.datastore.preferences.PreferencesProto.PreferenceMapOrBuilder
            public final androidx.datastore.preferences.PreferencesProto.Value getPreferencesOrThrow(java.lang.String str) {
                java.util.Map<java.lang.String, androidx.datastore.preferences.PreferencesProto.Value> preferencesMap = ((androidx.datastore.preferences.PreferencesProto.PreferenceMap) this.instance).getPreferencesMap();
                if (!preferencesMap.containsKey(str)) {
                    throw new java.lang.IllegalArgumentException();
                }
                return preferencesMap.get(str);
            }

            public final androidx.datastore.preferences.PreferencesProto.PreferenceMap.Builder putPreferences(java.lang.String str, androidx.datastore.preferences.PreferencesProto.Value value) {
                copyOnWrite();
                androidx.datastore.preferences.PreferencesProto.PreferenceMap.getHighSpeedVideoSizes((androidx.datastore.preferences.PreferencesProto.PreferenceMap) this.instance).put(str, value);
                return this;
            }

            public final androidx.datastore.preferences.PreferencesProto.PreferenceMap.Builder putAllPreferences(java.util.Map<java.lang.String, androidx.datastore.preferences.PreferencesProto.Value> map) {
                copyOnWrite();
                androidx.datastore.preferences.PreferencesProto.PreferenceMap.getHighSpeedVideoSizes((androidx.datastore.preferences.PreferencesProto.PreferenceMap) this.instance).putAll(map);
                return this;
            }
        }

        @Override // androidx.content.preferences.protobuf.GeneratedMessageLite
        public final java.lang.Object dynamicMethod(androidx.datastore.preferences.protobuf.GeneratedMessageLite.MethodToInvoke methodToInvoke, java.lang.Object obj, java.lang.Object obj2) {
            androidx.content.preferences.protobuf.Parser parser;
            switch (androidx.content.preferences.PreferencesProto.AnonymousClass1.getHighResolutionOutputSizeshNQ4ISI[methodToInvoke.ordinal()]) {
                case 1:
                    return new androidx.datastore.preferences.PreferencesProto.PreferenceMap();
                case 2:
                    return new androidx.datastore.preferences.PreferencesProto.PreferenceMap.Builder((byte) 0);
                case 3:
                    return newMessageInfo(DEFAULT_INSTANCE, "\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u00012", new java.lang.Object[]{"preferences_", androidx.datastore.preferences.PreferencesProto.PreferenceMap.PreferencesDefaultEntryHolder.getHighSpeedVideoFpsRangesFor});
                case 4:
                    return DEFAULT_INSTANCE;
                case 5:
                    androidx.content.preferences.protobuf.Parser<androidx.datastore.preferences.PreferencesProto.PreferenceMap> parser2 = PARSER;
                    if (parser2 != null) {
                        return parser2;
                    }
                    synchronized (androidx.datastore.preferences.PreferencesProto.PreferenceMap.class) {
                        parser = PARSER;
                        if (parser == null) {
                            parser = new androidx.datastore.preferences.protobuf.GeneratedMessageLite.DefaultInstanceBasedParser(DEFAULT_INSTANCE);
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

        static {
            androidx.datastore.preferences.PreferencesProto.PreferenceMap preferenceMap = new androidx.datastore.preferences.PreferencesProto.PreferenceMap();
            DEFAULT_INSTANCE = preferenceMap;
            androidx.content.preferences.protobuf.GeneratedMessageLite.registerDefaultInstance(androidx.datastore.preferences.PreferencesProto.PreferenceMap.class, preferenceMap);
        }

        public static androidx.datastore.preferences.PreferencesProto.PreferenceMap getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static androidx.content.preferences.protobuf.Parser<androidx.datastore.preferences.PreferencesProto.PreferenceMap> parser() {
            return DEFAULT_INSTANCE.getParserForType();
        }

        static /* synthetic */ java.util.Map getHighSpeedVideoSizes(androidx.datastore.preferences.PreferencesProto.PreferenceMap preferenceMap) {
            if (!preferenceMap.preferences_.isMutable()) {
                preferenceMap.preferences_ = preferenceMap.preferences_.mutableCopy();
            }
            return preferenceMap.preferences_;
        }

        @Override // androidx.datastore.preferences.PreferencesProto.PreferenceMapOrBuilder
        public final boolean containsPreferences(java.lang.String str) {
            return this.preferences_.containsKey(str);
        }

        @Override // androidx.datastore.preferences.PreferencesProto.PreferenceMapOrBuilder
        public final int getPreferencesCount() {
            return this.preferences_.size();
        }

        @Override // androidx.datastore.preferences.PreferencesProto.PreferenceMapOrBuilder
        public final java.util.Map<java.lang.String, androidx.datastore.preferences.PreferencesProto.Value> getPreferencesMap() {
            return java.util.Collections.unmodifiableMap(this.preferences_);
        }

        @Override // androidx.datastore.preferences.PreferencesProto.PreferenceMapOrBuilder
        public final androidx.datastore.preferences.PreferencesProto.Value getPreferencesOrDefault(java.lang.String str, androidx.datastore.preferences.PreferencesProto.Value value) {
            androidx.content.preferences.protobuf.MapFieldLite<java.lang.String, androidx.datastore.preferences.PreferencesProto.Value> mapFieldLite = this.preferences_;
            return mapFieldLite.containsKey(str) ? mapFieldLite.get(str) : value;
        }

        @Override // androidx.datastore.preferences.PreferencesProto.PreferenceMapOrBuilder
        public final androidx.datastore.preferences.PreferencesProto.Value getPreferencesOrThrow(java.lang.String str) {
            androidx.content.preferences.protobuf.MapFieldLite<java.lang.String, androidx.datastore.preferences.PreferencesProto.Value> mapFieldLite = this.preferences_;
            if (!mapFieldLite.containsKey(str)) {
                throw new java.lang.IllegalArgumentException();
            }
            return mapFieldLite.get(str);
        }
    }

    /* renamed from: androidx.datastore.preferences.PreferencesProto$1, reason: invalid class name */
    static /* synthetic */ class AnonymousClass1 {
        static final /* synthetic */ int[] getHighResolutionOutputSizeshNQ4ISI;

        static {
            int[] iArr = new int[androidx.datastore.preferences.protobuf.GeneratedMessageLite.MethodToInvoke.values().length];
            getHighResolutionOutputSizeshNQ4ISI = iArr;
            try {
                iArr[androidx.datastore.preferences.protobuf.GeneratedMessageLite.MethodToInvoke.NEW_MUTABLE_INSTANCE.ordinal()] = 1;
            } catch (java.lang.NoSuchFieldError unused) {
            }
            try {
                getHighResolutionOutputSizeshNQ4ISI[androidx.datastore.preferences.protobuf.GeneratedMessageLite.MethodToInvoke.NEW_BUILDER.ordinal()] = 2;
            } catch (java.lang.NoSuchFieldError unused2) {
            }
            try {
                getHighResolutionOutputSizeshNQ4ISI[androidx.datastore.preferences.protobuf.GeneratedMessageLite.MethodToInvoke.BUILD_MESSAGE_INFO.ordinal()] = 3;
            } catch (java.lang.NoSuchFieldError unused3) {
            }
            try {
                getHighResolutionOutputSizeshNQ4ISI[androidx.datastore.preferences.protobuf.GeneratedMessageLite.MethodToInvoke.GET_DEFAULT_INSTANCE.ordinal()] = 4;
            } catch (java.lang.NoSuchFieldError unused4) {
            }
            try {
                getHighResolutionOutputSizeshNQ4ISI[androidx.datastore.preferences.protobuf.GeneratedMessageLite.MethodToInvoke.GET_PARSER.ordinal()] = 5;
            } catch (java.lang.NoSuchFieldError unused5) {
            }
            try {
                getHighResolutionOutputSizeshNQ4ISI[androidx.datastore.preferences.protobuf.GeneratedMessageLite.MethodToInvoke.GET_MEMOIZED_IS_INITIALIZED.ordinal()] = 6;
            } catch (java.lang.NoSuchFieldError unused6) {
            }
            try {
                getHighResolutionOutputSizeshNQ4ISI[androidx.datastore.preferences.protobuf.GeneratedMessageLite.MethodToInvoke.SET_MEMOIZED_IS_INITIALIZED.ordinal()] = 7;
            } catch (java.lang.NoSuchFieldError unused7) {
            }
        }
    }

    public static final class Value extends androidx.content.preferences.protobuf.GeneratedMessageLite<androidx.datastore.preferences.PreferencesProto.Value, androidx.datastore.preferences.PreferencesProto.Value.Builder> implements androidx.datastore.preferences.PreferencesProto.ValueOrBuilder {
        public static final int BOOLEAN_FIELD_NUMBER = 1;
        public static final int BYTES_FIELD_NUMBER = 8;
        private static final androidx.datastore.preferences.PreferencesProto.Value DEFAULT_INSTANCE;
        public static final int DOUBLE_FIELD_NUMBER = 7;
        public static final int FLOAT_FIELD_NUMBER = 2;
        public static final int INTEGER_FIELD_NUMBER = 3;
        public static final int LONG_FIELD_NUMBER = 4;
        private static volatile androidx.content.preferences.protobuf.Parser<androidx.datastore.preferences.PreferencesProto.Value> PARSER = null;
        public static final int STRING_FIELD_NUMBER = 5;
        public static final int STRING_SET_FIELD_NUMBER = 6;
        private int valueCase_ = 0;
        private java.lang.Object value_;

        private Value() {
        }

        public enum ValueCase {
            BOOLEAN(1),
            FLOAT(2),
            INTEGER(3),
            LONG(4),
            STRING(5),
            STRING_SET(6),
            DOUBLE(7),
            BYTES(8),
            VALUE_NOT_SET(0);

            private final int getHighResolutionOutputSizeshNQ4ISI;

            ValueCase(int i) {
                this.getHighResolutionOutputSizeshNQ4ISI = i;
            }

            @java.lang.Deprecated
            public static androidx.datastore.preferences.PreferencesProto.Value.ValueCase valueOf(int i) {
                return forNumber(i);
            }

            public static androidx.datastore.preferences.PreferencesProto.Value.ValueCase forNumber(int i) {
                switch (i) {
                    case 0:
                        return VALUE_NOT_SET;
                    case 1:
                        return BOOLEAN;
                    case 2:
                        return FLOAT;
                    case 3:
                        return INTEGER;
                    case 4:
                        return LONG;
                    case 5:
                        return STRING;
                    case 6:
                        return STRING_SET;
                    case 7:
                        return DOUBLE;
                    case 8:
                        return BYTES;
                    default:
                        return null;
                }
            }

            public final int getNumber() {
                return this.getHighResolutionOutputSizeshNQ4ISI;
            }
        }

        @Override // androidx.datastore.preferences.PreferencesProto.ValueOrBuilder
        public final androidx.datastore.preferences.PreferencesProto.Value.ValueCase getValueCase() {
            return androidx.datastore.preferences.PreferencesProto.Value.ValueCase.forNumber(this.valueCase_);
        }

        @Override // androidx.datastore.preferences.PreferencesProto.ValueOrBuilder
        public final boolean hasBoolean() {
            return this.valueCase_ == 1;
        }

        @Override // androidx.datastore.preferences.PreferencesProto.ValueOrBuilder
        public final boolean getBoolean() {
            if (this.valueCase_ == 1) {
                return ((java.lang.Boolean) this.value_).booleanValue();
            }
            return false;
        }

        @Override // androidx.datastore.preferences.PreferencesProto.ValueOrBuilder
        public final boolean hasFloat() {
            return this.valueCase_ == 2;
        }

        @Override // androidx.datastore.preferences.PreferencesProto.ValueOrBuilder
        public final float getFloat() {
            if (this.valueCase_ == 2) {
                return ((java.lang.Float) this.value_).floatValue();
            }
            return 0.0f;
        }

        @Override // androidx.datastore.preferences.PreferencesProto.ValueOrBuilder
        public final boolean hasInteger() {
            return this.valueCase_ == 3;
        }

        @Override // androidx.datastore.preferences.PreferencesProto.ValueOrBuilder
        public final int getInteger() {
            if (this.valueCase_ == 3) {
                return ((java.lang.Integer) this.value_).intValue();
            }
            return 0;
        }

        @Override // androidx.datastore.preferences.PreferencesProto.ValueOrBuilder
        public final boolean hasLong() {
            return this.valueCase_ == 4;
        }

        @Override // androidx.datastore.preferences.PreferencesProto.ValueOrBuilder
        public final long getLong() {
            if (this.valueCase_ == 4) {
                return ((java.lang.Long) this.value_).longValue();
            }
            return 0L;
        }

        @Override // androidx.datastore.preferences.PreferencesProto.ValueOrBuilder
        public final boolean hasString() {
            return this.valueCase_ == 5;
        }

        @Override // androidx.datastore.preferences.PreferencesProto.ValueOrBuilder
        public final java.lang.String getString() {
            if (this.valueCase_ == 5) {
                return (java.lang.String) this.value_;
            }
            return "";
        }

        @Override // androidx.datastore.preferences.PreferencesProto.ValueOrBuilder
        public final androidx.content.preferences.protobuf.ByteString getStringBytes() {
            java.lang.String str;
            if (this.valueCase_ != 5) {
                str = "";
            } else {
                str = (java.lang.String) this.value_;
            }
            return androidx.content.preferences.protobuf.ByteString.copyFromUtf8(str);
        }

        @Override // androidx.datastore.preferences.PreferencesProto.ValueOrBuilder
        public final boolean hasStringSet() {
            return this.valueCase_ == 6;
        }

        @Override // androidx.datastore.preferences.PreferencesProto.ValueOrBuilder
        public final androidx.datastore.preferences.PreferencesProto.StringSet getStringSet() {
            if (this.valueCase_ == 6) {
                return (androidx.datastore.preferences.PreferencesProto.StringSet) this.value_;
            }
            return androidx.datastore.preferences.PreferencesProto.StringSet.getDefaultInstance();
        }

        @Override // androidx.datastore.preferences.PreferencesProto.ValueOrBuilder
        public final boolean hasDouble() {
            return this.valueCase_ == 7;
        }

        @Override // androidx.datastore.preferences.PreferencesProto.ValueOrBuilder
        public final double getDouble() {
            if (this.valueCase_ == 7) {
                return ((java.lang.Double) this.value_).doubleValue();
            }
            return 0.0d;
        }

        @Override // androidx.datastore.preferences.PreferencesProto.ValueOrBuilder
        public final boolean hasBytes() {
            return this.valueCase_ == 8;
        }

        @Override // androidx.datastore.preferences.PreferencesProto.ValueOrBuilder
        public final androidx.content.preferences.protobuf.ByteString getBytes() {
            if (this.valueCase_ == 8) {
                return (androidx.content.preferences.protobuf.ByteString) this.value_;
            }
            return androidx.content.preferences.protobuf.ByteString.EMPTY;
        }

        public static androidx.datastore.preferences.PreferencesProto.Value parseFrom(java.nio.ByteBuffer byteBuffer) throws androidx.content.preferences.protobuf.InvalidProtocolBufferException {
            return (androidx.datastore.preferences.PreferencesProto.Value) androidx.content.preferences.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
        }

        public static androidx.datastore.preferences.PreferencesProto.Value parseFrom(java.nio.ByteBuffer byteBuffer, androidx.content.preferences.protobuf.ExtensionRegistryLite extensionRegistryLite) throws androidx.content.preferences.protobuf.InvalidProtocolBufferException {
            return (androidx.datastore.preferences.PreferencesProto.Value) androidx.content.preferences.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
        }

        public static androidx.datastore.preferences.PreferencesProto.Value parseFrom(androidx.content.preferences.protobuf.ByteString byteString) throws androidx.content.preferences.protobuf.InvalidProtocolBufferException {
            return (androidx.datastore.preferences.PreferencesProto.Value) androidx.content.preferences.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
        }

        public static androidx.datastore.preferences.PreferencesProto.Value parseFrom(androidx.content.preferences.protobuf.ByteString byteString, androidx.content.preferences.protobuf.ExtensionRegistryLite extensionRegistryLite) throws androidx.content.preferences.protobuf.InvalidProtocolBufferException {
            return (androidx.datastore.preferences.PreferencesProto.Value) androidx.content.preferences.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
        }

        public static androidx.datastore.preferences.PreferencesProto.Value parseFrom(byte[] bArr) throws androidx.content.preferences.protobuf.InvalidProtocolBufferException {
            return (androidx.datastore.preferences.PreferencesProto.Value) androidx.content.preferences.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
        }

        public static androidx.datastore.preferences.PreferencesProto.Value parseFrom(byte[] bArr, androidx.content.preferences.protobuf.ExtensionRegistryLite extensionRegistryLite) throws androidx.content.preferences.protobuf.InvalidProtocolBufferException {
            return (androidx.datastore.preferences.PreferencesProto.Value) androidx.content.preferences.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
        }

        public static androidx.datastore.preferences.PreferencesProto.Value parseFrom(java.io.InputStream inputStream) throws java.io.IOException {
            return (androidx.datastore.preferences.PreferencesProto.Value) androidx.content.preferences.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static androidx.datastore.preferences.PreferencesProto.Value parseFrom(java.io.InputStream inputStream, androidx.content.preferences.protobuf.ExtensionRegistryLite extensionRegistryLite) throws java.io.IOException {
            return (androidx.datastore.preferences.PreferencesProto.Value) androidx.content.preferences.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
        }

        public static androidx.datastore.preferences.PreferencesProto.Value parseDelimitedFrom(java.io.InputStream inputStream) throws java.io.IOException {
            return (androidx.datastore.preferences.PreferencesProto.Value) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static androidx.datastore.preferences.PreferencesProto.Value parseDelimitedFrom(java.io.InputStream inputStream, androidx.content.preferences.protobuf.ExtensionRegistryLite extensionRegistryLite) throws java.io.IOException {
            return (androidx.datastore.preferences.PreferencesProto.Value) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
        }

        public static androidx.datastore.preferences.PreferencesProto.Value parseFrom(androidx.content.preferences.protobuf.CodedInputStream codedInputStream) throws java.io.IOException {
            return (androidx.datastore.preferences.PreferencesProto.Value) androidx.content.preferences.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
        }

        public static androidx.datastore.preferences.PreferencesProto.Value parseFrom(androidx.content.preferences.protobuf.CodedInputStream codedInputStream, androidx.content.preferences.protobuf.ExtensionRegistryLite extensionRegistryLite) throws java.io.IOException {
            return (androidx.datastore.preferences.PreferencesProto.Value) androidx.content.preferences.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
        }

        public static androidx.datastore.preferences.PreferencesProto.Value.Builder newBuilder() {
            return DEFAULT_INSTANCE.createBuilder();
        }

        public static androidx.datastore.preferences.PreferencesProto.Value.Builder newBuilder(androidx.datastore.preferences.PreferencesProto.Value value) {
            return DEFAULT_INSTANCE.createBuilder(value);
        }

        public static final class Builder extends androidx.datastore.preferences.protobuf.GeneratedMessageLite.Builder<androidx.datastore.preferences.PreferencesProto.Value, androidx.datastore.preferences.PreferencesProto.Value.Builder> implements androidx.datastore.preferences.PreferencesProto.ValueOrBuilder {
            /* synthetic */ Builder(byte b) {
                this();
            }

            private Builder() {
                super(androidx.datastore.preferences.PreferencesProto.Value.DEFAULT_INSTANCE);
            }

            @Override // androidx.datastore.preferences.PreferencesProto.ValueOrBuilder
            public final androidx.datastore.preferences.PreferencesProto.Value.ValueCase getValueCase() {
                return ((androidx.datastore.preferences.PreferencesProto.Value) this.instance).getValueCase();
            }

            public final androidx.datastore.preferences.PreferencesProto.Value.Builder clearValue() {
                copyOnWrite();
                androidx.datastore.preferences.PreferencesProto.Value.getOutputMinFrameDuration((androidx.datastore.preferences.PreferencesProto.Value) this.instance);
                return this;
            }

            @Override // androidx.datastore.preferences.PreferencesProto.ValueOrBuilder
            public final boolean hasBoolean() {
                return ((androidx.datastore.preferences.PreferencesProto.Value) this.instance).hasBoolean();
            }

            @Override // androidx.datastore.preferences.PreferencesProto.ValueOrBuilder
            public final boolean getBoolean() {
                return ((androidx.datastore.preferences.PreferencesProto.Value) this.instance).getBoolean();
            }

            public final androidx.datastore.preferences.PreferencesProto.Value.Builder setBoolean(boolean z) {
                copyOnWrite();
                androidx.datastore.preferences.PreferencesProto.Value.getHighSpeedVideoFpsRanges((androidx.datastore.preferences.PreferencesProto.Value) this.instance, z);
                return this;
            }

            public final androidx.datastore.preferences.PreferencesProto.Value.Builder clearBoolean() {
                copyOnWrite();
                androidx.datastore.preferences.PreferencesProto.Value.getInputSizeshNQ4ISI((androidx.datastore.preferences.PreferencesProto.Value) this.instance);
                return this;
            }

            @Override // androidx.datastore.preferences.PreferencesProto.ValueOrBuilder
            public final boolean hasFloat() {
                return ((androidx.datastore.preferences.PreferencesProto.Value) this.instance).hasFloat();
            }

            @Override // androidx.datastore.preferences.PreferencesProto.ValueOrBuilder
            public final float getFloat() {
                return ((androidx.datastore.preferences.PreferencesProto.Value) this.instance).getFloat();
            }

            public final androidx.datastore.preferences.PreferencesProto.Value.Builder setFloat(float f) {
                copyOnWrite();
                androidx.datastore.preferences.PreferencesProto.Value.getHighSpeedVideoFpsRanges((androidx.datastore.preferences.PreferencesProto.Value) this.instance, f);
                return this;
            }

            public final androidx.datastore.preferences.PreferencesProto.Value.Builder clearFloat() {
                copyOnWrite();
                androidx.datastore.preferences.PreferencesProto.Value.getOutputFormats((androidx.datastore.preferences.PreferencesProto.Value) this.instance);
                return this;
            }

            @Override // androidx.datastore.preferences.PreferencesProto.ValueOrBuilder
            public final boolean hasInteger() {
                return ((androidx.datastore.preferences.PreferencesProto.Value) this.instance).hasInteger();
            }

            @Override // androidx.datastore.preferences.PreferencesProto.ValueOrBuilder
            public final int getInteger() {
                return ((androidx.datastore.preferences.PreferencesProto.Value) this.instance).getInteger();
            }

            public final androidx.datastore.preferences.PreferencesProto.Value.Builder setInteger(int i) {
                copyOnWrite();
                androidx.datastore.preferences.PreferencesProto.Value.Camera2StreamConfigurationMap((androidx.datastore.preferences.PreferencesProto.Value) this.instance, i);
                return this;
            }

            public final androidx.datastore.preferences.PreferencesProto.Value.Builder clearInteger() {
                copyOnWrite();
                androidx.datastore.preferences.PreferencesProto.Value.getHighResolutionOutputSizeshNQ4ISI((androidx.datastore.preferences.PreferencesProto.Value) this.instance);
                return this;
            }

            @Override // androidx.datastore.preferences.PreferencesProto.ValueOrBuilder
            public final boolean hasLong() {
                return ((androidx.datastore.preferences.PreferencesProto.Value) this.instance).hasLong();
            }

            @Override // androidx.datastore.preferences.PreferencesProto.ValueOrBuilder
            public final long getLong() {
                return ((androidx.datastore.preferences.PreferencesProto.Value) this.instance).getLong();
            }

            public final androidx.datastore.preferences.PreferencesProto.Value.Builder setLong(long j) {
                copyOnWrite();
                androidx.datastore.preferences.PreferencesProto.Value.getHighSpeedVideoFpsRangesFor((androidx.datastore.preferences.PreferencesProto.Value) this.instance, j);
                return this;
            }

            public final androidx.datastore.preferences.PreferencesProto.Value.Builder clearLong() {
                copyOnWrite();
                androidx.datastore.preferences.PreferencesProto.Value.getHighSpeedVideoFpsRangesFor((androidx.datastore.preferences.PreferencesProto.Value) this.instance);
                return this;
            }

            @Override // androidx.datastore.preferences.PreferencesProto.ValueOrBuilder
            public final boolean hasString() {
                return ((androidx.datastore.preferences.PreferencesProto.Value) this.instance).hasString();
            }

            @Override // androidx.datastore.preferences.PreferencesProto.ValueOrBuilder
            public final java.lang.String getString() {
                return ((androidx.datastore.preferences.PreferencesProto.Value) this.instance).getString();
            }

            @Override // androidx.datastore.preferences.PreferencesProto.ValueOrBuilder
            public final androidx.content.preferences.protobuf.ByteString getStringBytes() {
                return ((androidx.datastore.preferences.PreferencesProto.Value) this.instance).getStringBytes();
            }

            public final androidx.datastore.preferences.PreferencesProto.Value.Builder setString(java.lang.String str) {
                copyOnWrite();
                androidx.datastore.preferences.PreferencesProto.Value.getHighResolutionOutputSizeshNQ4ISI((androidx.datastore.preferences.PreferencesProto.Value) this.instance, str);
                return this;
            }

            public final androidx.datastore.preferences.PreferencesProto.Value.Builder clearString() {
                copyOnWrite();
                androidx.datastore.preferences.PreferencesProto.Value.Camera2StreamConfigurationMap((androidx.datastore.preferences.PreferencesProto.Value) this.instance);
                return this;
            }

            public final androidx.datastore.preferences.PreferencesProto.Value.Builder setStringBytes(androidx.content.preferences.protobuf.ByteString byteString) {
                copyOnWrite();
                androidx.datastore.preferences.PreferencesProto.Value.getHighSpeedVideoFpsRangesFor((androidx.datastore.preferences.PreferencesProto.Value) this.instance, byteString);
                return this;
            }

            @Override // androidx.datastore.preferences.PreferencesProto.ValueOrBuilder
            public final boolean hasStringSet() {
                return ((androidx.datastore.preferences.PreferencesProto.Value) this.instance).hasStringSet();
            }

            @Override // androidx.datastore.preferences.PreferencesProto.ValueOrBuilder
            public final androidx.datastore.preferences.PreferencesProto.StringSet getStringSet() {
                return ((androidx.datastore.preferences.PreferencesProto.Value) this.instance).getStringSet();
            }

            public final androidx.datastore.preferences.PreferencesProto.Value.Builder setStringSet(androidx.datastore.preferences.PreferencesProto.StringSet stringSet) {
                copyOnWrite();
                androidx.datastore.preferences.PreferencesProto.Value.getHighSpeedVideoFpsRangesFor((androidx.datastore.preferences.PreferencesProto.Value) this.instance, stringSet);
                return this;
            }

            public final androidx.datastore.preferences.PreferencesProto.Value.Builder setStringSet(androidx.datastore.preferences.PreferencesProto.StringSet.Builder builder) {
                copyOnWrite();
                androidx.datastore.preferences.PreferencesProto.Value.getHighSpeedVideoFpsRangesFor((androidx.datastore.preferences.PreferencesProto.Value) this.instance, builder.build());
                return this;
            }

            public final androidx.datastore.preferences.PreferencesProto.Value.Builder mergeStringSet(androidx.datastore.preferences.PreferencesProto.StringSet stringSet) {
                copyOnWrite();
                androidx.datastore.preferences.PreferencesProto.Value.getHighResolutionOutputSizeshNQ4ISI((androidx.datastore.preferences.PreferencesProto.Value) this.instance, stringSet);
                return this;
            }

            public final androidx.datastore.preferences.PreferencesProto.Value.Builder clearStringSet() {
                copyOnWrite();
                androidx.datastore.preferences.PreferencesProto.Value.getHighSpeedVideoFpsRanges((androidx.datastore.preferences.PreferencesProto.Value) this.instance);
                return this;
            }

            @Override // androidx.datastore.preferences.PreferencesProto.ValueOrBuilder
            public final boolean hasDouble() {
                return ((androidx.datastore.preferences.PreferencesProto.Value) this.instance).hasDouble();
            }

            @Override // androidx.datastore.preferences.PreferencesProto.ValueOrBuilder
            public final double getDouble() {
                return ((androidx.datastore.preferences.PreferencesProto.Value) this.instance).getDouble();
            }

            public final androidx.datastore.preferences.PreferencesProto.Value.Builder setDouble(double d) {
                copyOnWrite();
                androidx.datastore.preferences.PreferencesProto.Value.getHighSpeedVideoSizes((androidx.datastore.preferences.PreferencesProto.Value) this.instance, d);
                return this;
            }

            public final androidx.datastore.preferences.PreferencesProto.Value.Builder clearDouble() {
                copyOnWrite();
                androidx.datastore.preferences.PreferencesProto.Value.getHighSpeedVideoSizes((androidx.datastore.preferences.PreferencesProto.Value) this.instance);
                return this;
            }

            @Override // androidx.datastore.preferences.PreferencesProto.ValueOrBuilder
            public final boolean hasBytes() {
                return ((androidx.datastore.preferences.PreferencesProto.Value) this.instance).hasBytes();
            }

            @Override // androidx.datastore.preferences.PreferencesProto.ValueOrBuilder
            public final androidx.content.preferences.protobuf.ByteString getBytes() {
                return ((androidx.datastore.preferences.PreferencesProto.Value) this.instance).getBytes();
            }

            public final androidx.datastore.preferences.PreferencesProto.Value.Builder setBytes(androidx.content.preferences.protobuf.ByteString byteString) {
                copyOnWrite();
                androidx.datastore.preferences.PreferencesProto.Value.getHighSpeedVideoFpsRanges((androidx.datastore.preferences.PreferencesProto.Value) this.instance, byteString);
                return this;
            }

            public final androidx.datastore.preferences.PreferencesProto.Value.Builder clearBytes() {
                copyOnWrite();
                androidx.datastore.preferences.PreferencesProto.Value.getInputFormats((androidx.datastore.preferences.PreferencesProto.Value) this.instance);
                return this;
            }
        }

        @Override // androidx.content.preferences.protobuf.GeneratedMessageLite
        public final java.lang.Object dynamicMethod(androidx.datastore.preferences.protobuf.GeneratedMessageLite.MethodToInvoke methodToInvoke, java.lang.Object obj, java.lang.Object obj2) {
            androidx.content.preferences.protobuf.Parser parser;
            switch (androidx.content.preferences.PreferencesProto.AnonymousClass1.getHighResolutionOutputSizeshNQ4ISI[methodToInvoke.ordinal()]) {
                case 1:
                    return new androidx.datastore.preferences.PreferencesProto.Value();
                case 2:
                    return new androidx.datastore.preferences.PreferencesProto.Value.Builder((byte) 0);
                case 3:
                    return newMessageInfo(DEFAULT_INSTANCE, "\u0001\b\u0001\u0000\u0001\b\b\u0000\u0000\u0000\u0001:\u0000\u00024\u0000\u00037\u0000\u00045\u0000\u0005;\u0000\u0006<\u0000\u00073\u0000\b=\u0000", new java.lang.Object[]{"value_", "valueCase_", androidx.datastore.preferences.PreferencesProto.StringSet.class});
                case 4:
                    return DEFAULT_INSTANCE;
                case 5:
                    androidx.content.preferences.protobuf.Parser<androidx.datastore.preferences.PreferencesProto.Value> parser2 = PARSER;
                    if (parser2 != null) {
                        return parser2;
                    }
                    synchronized (androidx.datastore.preferences.PreferencesProto.Value.class) {
                        parser = PARSER;
                        if (parser == null) {
                            parser = new androidx.datastore.preferences.protobuf.GeneratedMessageLite.DefaultInstanceBasedParser(DEFAULT_INSTANCE);
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

        static {
            androidx.datastore.preferences.PreferencesProto.Value value = new androidx.datastore.preferences.PreferencesProto.Value();
            DEFAULT_INSTANCE = value;
            androidx.content.preferences.protobuf.GeneratedMessageLite.registerDefaultInstance(androidx.datastore.preferences.PreferencesProto.Value.class, value);
        }

        public static androidx.datastore.preferences.PreferencesProto.Value getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static androidx.content.preferences.protobuf.Parser<androidx.datastore.preferences.PreferencesProto.Value> parser() {
            return DEFAULT_INSTANCE.getParserForType();
        }

        static /* synthetic */ void getHighResolutionOutputSizeshNQ4ISI(androidx.datastore.preferences.PreferencesProto.Value value) {
            if (value.valueCase_ == 3) {
                value.valueCase_ = 0;
                value.value_ = null;
            }
        }

        static /* synthetic */ void getHighSpeedVideoFpsRangesFor(androidx.datastore.preferences.PreferencesProto.Value value, long j) {
            value.valueCase_ = 4;
            value.value_ = java.lang.Long.valueOf(j);
        }

        static /* synthetic */ void getHighSpeedVideoFpsRangesFor(androidx.datastore.preferences.PreferencesProto.Value value) {
            if (value.valueCase_ == 4) {
                value.valueCase_ = 0;
                value.value_ = null;
            }
        }

        static /* synthetic */ void getHighResolutionOutputSizeshNQ4ISI(androidx.datastore.preferences.PreferencesProto.Value value, java.lang.String str) {
            value.valueCase_ = 5;
            value.value_ = str;
        }

        static /* synthetic */ void Camera2StreamConfigurationMap(androidx.datastore.preferences.PreferencesProto.Value value) {
            if (value.valueCase_ == 5) {
                value.valueCase_ = 0;
                value.value_ = null;
            }
        }

        static /* synthetic */ void getHighSpeedVideoFpsRangesFor(androidx.datastore.preferences.PreferencesProto.Value value, androidx.content.preferences.protobuf.ByteString byteString) {
            value.value_ = byteString.toStringUtf8();
            value.valueCase_ = 5;
        }

        static /* synthetic */ void getHighSpeedVideoFpsRangesFor(androidx.datastore.preferences.PreferencesProto.Value value, androidx.datastore.preferences.PreferencesProto.StringSet stringSet) {
            value.value_ = stringSet;
            value.valueCase_ = 6;
        }

        static /* synthetic */ void getHighResolutionOutputSizeshNQ4ISI(androidx.datastore.preferences.PreferencesProto.Value value, androidx.datastore.preferences.PreferencesProto.StringSet stringSet) {
            if (value.valueCase_ == 6 && value.value_ != androidx.datastore.preferences.PreferencesProto.StringSet.getDefaultInstance()) {
                value.value_ = androidx.datastore.preferences.PreferencesProto.StringSet.newBuilder((androidx.datastore.preferences.PreferencesProto.StringSet) value.value_).mergeFrom((androidx.datastore.preferences.PreferencesProto.StringSet.Builder) stringSet).buildPartial();
            } else {
                value.value_ = stringSet;
            }
            value.valueCase_ = 6;
        }

        static /* synthetic */ void getHighSpeedVideoFpsRanges(androidx.datastore.preferences.PreferencesProto.Value value) {
            if (value.valueCase_ == 6) {
                value.valueCase_ = 0;
                value.value_ = null;
            }
        }

        static /* synthetic */ void getHighSpeedVideoSizes(androidx.datastore.preferences.PreferencesProto.Value value, double d) {
            value.valueCase_ = 7;
            value.value_ = java.lang.Double.valueOf(d);
        }

        static /* synthetic */ void getHighSpeedVideoSizes(androidx.datastore.preferences.PreferencesProto.Value value) {
            if (value.valueCase_ == 7) {
                value.valueCase_ = 0;
                value.value_ = null;
            }
        }

        static /* synthetic */ void getHighSpeedVideoFpsRanges(androidx.datastore.preferences.PreferencesProto.Value value, androidx.content.preferences.protobuf.ByteString byteString) {
            value.valueCase_ = 8;
            value.value_ = byteString;
        }

        static /* synthetic */ void getInputFormats(androidx.datastore.preferences.PreferencesProto.Value value) {
            if (value.valueCase_ == 8) {
                value.valueCase_ = 0;
                value.value_ = null;
            }
        }

        static /* synthetic */ void getOutputMinFrameDuration(androidx.datastore.preferences.PreferencesProto.Value value) {
            value.valueCase_ = 0;
            value.value_ = null;
        }

        static /* synthetic */ void getHighSpeedVideoFpsRanges(androidx.datastore.preferences.PreferencesProto.Value value, boolean z) {
            value.valueCase_ = 1;
            value.value_ = java.lang.Boolean.valueOf(z);
        }

        static /* synthetic */ void getInputSizeshNQ4ISI(androidx.datastore.preferences.PreferencesProto.Value value) {
            if (value.valueCase_ == 1) {
                value.valueCase_ = 0;
                value.value_ = null;
            }
        }

        static /* synthetic */ void getHighSpeedVideoFpsRanges(androidx.datastore.preferences.PreferencesProto.Value value, float f) {
            value.valueCase_ = 2;
            value.value_ = java.lang.Float.valueOf(f);
        }

        static /* synthetic */ void getOutputFormats(androidx.datastore.preferences.PreferencesProto.Value value) {
            if (value.valueCase_ == 2) {
                value.valueCase_ = 0;
                value.value_ = null;
            }
        }

        static /* synthetic */ void Camera2StreamConfigurationMap(androidx.datastore.preferences.PreferencesProto.Value value, int i) {
            value.valueCase_ = 3;
            value.value_ = java.lang.Integer.valueOf(i);
        }
    }

    public static final class StringSet extends androidx.content.preferences.protobuf.GeneratedMessageLite<androidx.datastore.preferences.PreferencesProto.StringSet, androidx.datastore.preferences.PreferencesProto.StringSet.Builder> implements androidx.datastore.preferences.PreferencesProto.StringSetOrBuilder {
        private static final androidx.datastore.preferences.PreferencesProto.StringSet DEFAULT_INSTANCE;
        private static volatile androidx.content.preferences.protobuf.Parser<androidx.datastore.preferences.PreferencesProto.StringSet> PARSER = null;
        public static final int STRINGS_FIELD_NUMBER = 1;
        private androidx.datastore.preferences.protobuf.Internal.ProtobufList<java.lang.String> strings_ = androidx.content.preferences.protobuf.GeneratedMessageLite.emptyProtobufList();

        private StringSet() {
        }

        @Override // androidx.datastore.preferences.PreferencesProto.StringSetOrBuilder
        public final java.util.List<java.lang.String> getStringsList() {
            return this.strings_;
        }

        @Override // androidx.datastore.preferences.PreferencesProto.StringSetOrBuilder
        public final int getStringsCount() {
            return this.strings_.size();
        }

        @Override // androidx.datastore.preferences.PreferencesProto.StringSetOrBuilder
        public final java.lang.String getStrings(int i) {
            return this.strings_.get(i);
        }

        @Override // androidx.datastore.preferences.PreferencesProto.StringSetOrBuilder
        public final androidx.content.preferences.protobuf.ByteString getStringsBytes(int i) {
            return androidx.content.preferences.protobuf.ByteString.copyFromUtf8(this.strings_.get(i));
        }

        public static androidx.datastore.preferences.PreferencesProto.StringSet parseFrom(java.nio.ByteBuffer byteBuffer) throws androidx.content.preferences.protobuf.InvalidProtocolBufferException {
            return (androidx.datastore.preferences.PreferencesProto.StringSet) androidx.content.preferences.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
        }

        public static androidx.datastore.preferences.PreferencesProto.StringSet parseFrom(java.nio.ByteBuffer byteBuffer, androidx.content.preferences.protobuf.ExtensionRegistryLite extensionRegistryLite) throws androidx.content.preferences.protobuf.InvalidProtocolBufferException {
            return (androidx.datastore.preferences.PreferencesProto.StringSet) androidx.content.preferences.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
        }

        public static androidx.datastore.preferences.PreferencesProto.StringSet parseFrom(androidx.content.preferences.protobuf.ByteString byteString) throws androidx.content.preferences.protobuf.InvalidProtocolBufferException {
            return (androidx.datastore.preferences.PreferencesProto.StringSet) androidx.content.preferences.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
        }

        public static androidx.datastore.preferences.PreferencesProto.StringSet parseFrom(androidx.content.preferences.protobuf.ByteString byteString, androidx.content.preferences.protobuf.ExtensionRegistryLite extensionRegistryLite) throws androidx.content.preferences.protobuf.InvalidProtocolBufferException {
            return (androidx.datastore.preferences.PreferencesProto.StringSet) androidx.content.preferences.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
        }

        public static androidx.datastore.preferences.PreferencesProto.StringSet parseFrom(byte[] bArr) throws androidx.content.preferences.protobuf.InvalidProtocolBufferException {
            return (androidx.datastore.preferences.PreferencesProto.StringSet) androidx.content.preferences.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
        }

        public static androidx.datastore.preferences.PreferencesProto.StringSet parseFrom(byte[] bArr, androidx.content.preferences.protobuf.ExtensionRegistryLite extensionRegistryLite) throws androidx.content.preferences.protobuf.InvalidProtocolBufferException {
            return (androidx.datastore.preferences.PreferencesProto.StringSet) androidx.content.preferences.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
        }

        public static androidx.datastore.preferences.PreferencesProto.StringSet parseFrom(java.io.InputStream inputStream) throws java.io.IOException {
            return (androidx.datastore.preferences.PreferencesProto.StringSet) androidx.content.preferences.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static androidx.datastore.preferences.PreferencesProto.StringSet parseFrom(java.io.InputStream inputStream, androidx.content.preferences.protobuf.ExtensionRegistryLite extensionRegistryLite) throws java.io.IOException {
            return (androidx.datastore.preferences.PreferencesProto.StringSet) androidx.content.preferences.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
        }

        public static androidx.datastore.preferences.PreferencesProto.StringSet parseDelimitedFrom(java.io.InputStream inputStream) throws java.io.IOException {
            return (androidx.datastore.preferences.PreferencesProto.StringSet) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static androidx.datastore.preferences.PreferencesProto.StringSet parseDelimitedFrom(java.io.InputStream inputStream, androidx.content.preferences.protobuf.ExtensionRegistryLite extensionRegistryLite) throws java.io.IOException {
            return (androidx.datastore.preferences.PreferencesProto.StringSet) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
        }

        public static androidx.datastore.preferences.PreferencesProto.StringSet parseFrom(androidx.content.preferences.protobuf.CodedInputStream codedInputStream) throws java.io.IOException {
            return (androidx.datastore.preferences.PreferencesProto.StringSet) androidx.content.preferences.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
        }

        public static androidx.datastore.preferences.PreferencesProto.StringSet parseFrom(androidx.content.preferences.protobuf.CodedInputStream codedInputStream, androidx.content.preferences.protobuf.ExtensionRegistryLite extensionRegistryLite) throws java.io.IOException {
            return (androidx.datastore.preferences.PreferencesProto.StringSet) androidx.content.preferences.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
        }

        public static androidx.datastore.preferences.PreferencesProto.StringSet.Builder newBuilder() {
            return DEFAULT_INSTANCE.createBuilder();
        }

        public static androidx.datastore.preferences.PreferencesProto.StringSet.Builder newBuilder(androidx.datastore.preferences.PreferencesProto.StringSet stringSet) {
            return DEFAULT_INSTANCE.createBuilder(stringSet);
        }

        public static final class Builder extends androidx.datastore.preferences.protobuf.GeneratedMessageLite.Builder<androidx.datastore.preferences.PreferencesProto.StringSet, androidx.datastore.preferences.PreferencesProto.StringSet.Builder> implements androidx.datastore.preferences.PreferencesProto.StringSetOrBuilder {
            /* synthetic */ Builder(byte b) {
                this();
            }

            private Builder() {
                super(androidx.datastore.preferences.PreferencesProto.StringSet.DEFAULT_INSTANCE);
            }

            @Override // androidx.datastore.preferences.PreferencesProto.StringSetOrBuilder
            public final java.util.List<java.lang.String> getStringsList() {
                return java.util.Collections.unmodifiableList(((androidx.datastore.preferences.PreferencesProto.StringSet) this.instance).getStringsList());
            }

            @Override // androidx.datastore.preferences.PreferencesProto.StringSetOrBuilder
            public final int getStringsCount() {
                return ((androidx.datastore.preferences.PreferencesProto.StringSet) this.instance).getStringsCount();
            }

            @Override // androidx.datastore.preferences.PreferencesProto.StringSetOrBuilder
            public final java.lang.String getStrings(int i) {
                return ((androidx.datastore.preferences.PreferencesProto.StringSet) this.instance).getStrings(i);
            }

            @Override // androidx.datastore.preferences.PreferencesProto.StringSetOrBuilder
            public final androidx.content.preferences.protobuf.ByteString getStringsBytes(int i) {
                return ((androidx.datastore.preferences.PreferencesProto.StringSet) this.instance).getStringsBytes(i);
            }

            public final androidx.datastore.preferences.PreferencesProto.StringSet.Builder setStrings(int i, java.lang.String str) {
                copyOnWrite();
                androidx.datastore.preferences.PreferencesProto.StringSet.getHighResolutionOutputSizeshNQ4ISI((androidx.datastore.preferences.PreferencesProto.StringSet) this.instance, i, str);
                return this;
            }

            public final androidx.datastore.preferences.PreferencesProto.StringSet.Builder addStrings(java.lang.String str) {
                copyOnWrite();
                androidx.datastore.preferences.PreferencesProto.StringSet.getHighSpeedVideoFpsRanges((androidx.datastore.preferences.PreferencesProto.StringSet) this.instance, str);
                return this;
            }

            public final androidx.datastore.preferences.PreferencesProto.StringSet.Builder addAllStrings(java.lang.Iterable<java.lang.String> iterable) {
                copyOnWrite();
                androidx.datastore.preferences.PreferencesProto.StringSet.getHighSpeedVideoFpsRangesFor((androidx.datastore.preferences.PreferencesProto.StringSet) this.instance, iterable);
                return this;
            }

            public final androidx.datastore.preferences.PreferencesProto.StringSet.Builder clearStrings() {
                copyOnWrite();
                androidx.datastore.preferences.PreferencesProto.StringSet.getHighSpeedVideoFpsRanges((androidx.datastore.preferences.PreferencesProto.StringSet) this.instance);
                return this;
            }

            public final androidx.datastore.preferences.PreferencesProto.StringSet.Builder addStringsBytes(androidx.content.preferences.protobuf.ByteString byteString) {
                copyOnWrite();
                androidx.datastore.preferences.PreferencesProto.StringSet.Camera2StreamConfigurationMap((androidx.datastore.preferences.PreferencesProto.StringSet) this.instance, byteString);
                return this;
            }
        }

        @Override // androidx.content.preferences.protobuf.GeneratedMessageLite
        public final java.lang.Object dynamicMethod(androidx.datastore.preferences.protobuf.GeneratedMessageLite.MethodToInvoke methodToInvoke, java.lang.Object obj, java.lang.Object obj2) {
            androidx.content.preferences.protobuf.Parser parser;
            switch (androidx.content.preferences.PreferencesProto.AnonymousClass1.getHighResolutionOutputSizeshNQ4ISI[methodToInvoke.ordinal()]) {
                case 1:
                    return new androidx.datastore.preferences.PreferencesProto.StringSet();
                case 2:
                    return new androidx.datastore.preferences.PreferencesProto.StringSet.Builder((byte) 0);
                case 3:
                    return newMessageInfo(DEFAULT_INSTANCE, "\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001a", new java.lang.Object[]{"strings_"});
                case 4:
                    return DEFAULT_INSTANCE;
                case 5:
                    androidx.content.preferences.protobuf.Parser<androidx.datastore.preferences.PreferencesProto.StringSet> parser2 = PARSER;
                    if (parser2 != null) {
                        return parser2;
                    }
                    synchronized (androidx.datastore.preferences.PreferencesProto.StringSet.class) {
                        parser = PARSER;
                        if (parser == null) {
                            parser = new androidx.datastore.preferences.protobuf.GeneratedMessageLite.DefaultInstanceBasedParser(DEFAULT_INSTANCE);
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

        static {
            androidx.datastore.preferences.PreferencesProto.StringSet stringSet = new androidx.datastore.preferences.PreferencesProto.StringSet();
            DEFAULT_INSTANCE = stringSet;
            androidx.content.preferences.protobuf.GeneratedMessageLite.registerDefaultInstance(androidx.datastore.preferences.PreferencesProto.StringSet.class, stringSet);
        }

        public static androidx.datastore.preferences.PreferencesProto.StringSet getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static androidx.content.preferences.protobuf.Parser<androidx.datastore.preferences.PreferencesProto.StringSet> parser() {
            return DEFAULT_INSTANCE.getParserForType();
        }

        static /* synthetic */ void getHighResolutionOutputSizeshNQ4ISI(androidx.datastore.preferences.PreferencesProto.StringSet stringSet, int i, java.lang.String str) {
            androidx.datastore.preferences.protobuf.Internal.ProtobufList<java.lang.String> protobufList = stringSet.strings_;
            if (!protobufList.isModifiable()) {
                stringSet.strings_ = androidx.content.preferences.protobuf.GeneratedMessageLite.mutableCopy(protobufList);
            }
            stringSet.strings_.set(i, str);
        }

        static /* synthetic */ void getHighSpeedVideoFpsRanges(androidx.datastore.preferences.PreferencesProto.StringSet stringSet, java.lang.String str) {
            androidx.datastore.preferences.protobuf.Internal.ProtobufList<java.lang.String> protobufList = stringSet.strings_;
            if (!protobufList.isModifiable()) {
                stringSet.strings_ = androidx.content.preferences.protobuf.GeneratedMessageLite.mutableCopy(protobufList);
            }
            stringSet.strings_.add(str);
        }

        static /* synthetic */ void getHighSpeedVideoFpsRangesFor(androidx.datastore.preferences.PreferencesProto.StringSet stringSet, java.lang.Iterable iterable) {
            androidx.datastore.preferences.protobuf.Internal.ProtobufList<java.lang.String> protobufList = stringSet.strings_;
            if (!protobufList.isModifiable()) {
                stringSet.strings_ = androidx.content.preferences.protobuf.GeneratedMessageLite.mutableCopy(protobufList);
            }
            androidx.content.preferences.protobuf.AbstractMessageLite.addAll(iterable, stringSet.strings_);
        }

        static /* synthetic */ void getHighSpeedVideoFpsRanges(androidx.datastore.preferences.PreferencesProto.StringSet stringSet) {
            stringSet.strings_ = androidx.content.preferences.protobuf.GeneratedMessageLite.emptyProtobufList();
        }

        static /* synthetic */ void Camera2StreamConfigurationMap(androidx.datastore.preferences.PreferencesProto.StringSet stringSet, androidx.content.preferences.protobuf.ByteString byteString) {
            androidx.datastore.preferences.protobuf.Internal.ProtobufList<java.lang.String> protobufList = stringSet.strings_;
            if (!protobufList.isModifiable()) {
                stringSet.strings_ = androidx.content.preferences.protobuf.GeneratedMessageLite.mutableCopy(protobufList);
            }
            stringSet.strings_.add(byteString.toStringUtf8());
        }
    }
}
