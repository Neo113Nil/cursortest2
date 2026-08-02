package kotlin.reflect.jvm.internal.impl.metadata;

/* loaded from: classes5.dex */
public final class ProtoBuf {

    public interface AnnotationOrBuilder extends kotlin.reflect.jvm.internal.impl.protobuf.MessageLiteOrBuilder {
    }

    public interface ClassOrBuilder extends kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite.ExtendableMessageOrBuilder {
    }

    public interface CompilerPluginDataOrBuilder extends kotlin.reflect.jvm.internal.impl.protobuf.MessageLiteOrBuilder {
    }

    public interface ConstructorOrBuilder extends kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite.ExtendableMessageOrBuilder {
    }

    public interface ContractOrBuilder extends kotlin.reflect.jvm.internal.impl.protobuf.MessageLiteOrBuilder {
    }

    public interface EffectOrBuilder extends kotlin.reflect.jvm.internal.impl.protobuf.MessageLiteOrBuilder {
    }

    public interface EnumEntryOrBuilder extends kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite.ExtendableMessageOrBuilder {
    }

    public interface ExpressionOrBuilder extends kotlin.reflect.jvm.internal.impl.protobuf.MessageLiteOrBuilder {
    }

    public interface FunctionOrBuilder extends kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite.ExtendableMessageOrBuilder {
    }

    public interface PackageFragmentOrBuilder extends kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite.ExtendableMessageOrBuilder {
    }

    public interface PackageOrBuilder extends kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite.ExtendableMessageOrBuilder {
    }

    public interface PropertyOrBuilder extends kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite.ExtendableMessageOrBuilder {
    }

    public interface QualifiedNameTableOrBuilder extends kotlin.reflect.jvm.internal.impl.protobuf.MessageLiteOrBuilder {
    }

    public interface StringTableOrBuilder extends kotlin.reflect.jvm.internal.impl.protobuf.MessageLiteOrBuilder {
    }

    public interface TypeAliasOrBuilder extends kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite.ExtendableMessageOrBuilder {
    }

    public interface TypeOrBuilder extends kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite.ExtendableMessageOrBuilder {
    }

    public interface TypeParameterOrBuilder extends kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite.ExtendableMessageOrBuilder {
    }

    public interface TypeTableOrBuilder extends kotlin.reflect.jvm.internal.impl.protobuf.MessageLiteOrBuilder {
    }

    public interface ValueParameterOrBuilder extends kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite.ExtendableMessageOrBuilder {
    }

    public interface VersionRequirementOrBuilder extends kotlin.reflect.jvm.internal.impl.protobuf.MessageLiteOrBuilder {
    }

    public interface VersionRequirementTableOrBuilder extends kotlin.reflect.jvm.internal.impl.protobuf.MessageLiteOrBuilder {
    }

    public enum Modality implements kotlin.reflect.jvm.internal.impl.protobuf.Internal.EnumLite {
        FINAL(0),
        OPEN(1),
        ABSTRACT(2),
        SEALED(3);

        private static kotlin.reflect.jvm.internal.impl.protobuf.Internal.EnumLiteMap<kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Modality> getHighSpeedVideoFpsRangesFor = new kotlin.reflect.jvm.internal.impl.protobuf.Internal.EnumLiteMap<kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Modality>() { // from class: kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Modality.1
            @Override // kotlin.reflect.jvm.internal.impl.protobuf.Internal.EnumLiteMap
            public final /* synthetic */ kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Modality findValueByNumber(int i) {
                return kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Modality.valueOf(i);
            }
        };
        private final int getHighResolutionOutputSizeshNQ4ISI;

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.Internal.EnumLite
        public final int getNumber() {
            return this.getHighResolutionOutputSizeshNQ4ISI;
        }

        public static kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Modality valueOf(int i) {
            if (i == 0) {
                return FINAL;
            }
            if (i == 1) {
                return OPEN;
            }
            if (i == 2) {
                return ABSTRACT;
            }
            if (i != 3) {
                return null;
            }
            return SEALED;
        }

        Modality(int i) {
            this.getHighResolutionOutputSizeshNQ4ISI = i;
        }
    }

    public enum Visibility implements kotlin.reflect.jvm.internal.impl.protobuf.Internal.EnumLite {
        INTERNAL(0),
        PRIVATE(1),
        PROTECTED(2),
        PUBLIC(3),
        PRIVATE_TO_THIS(4),
        LOCAL(5);

        private static kotlin.reflect.jvm.internal.impl.protobuf.Internal.EnumLiteMap<kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Visibility> getHighResolutionOutputSizeshNQ4ISI = new kotlin.reflect.jvm.internal.impl.protobuf.Internal.EnumLiteMap<kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Visibility>() { // from class: kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Visibility.1
            @Override // kotlin.reflect.jvm.internal.impl.protobuf.Internal.EnumLiteMap
            public final /* synthetic */ kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Visibility findValueByNumber(int i) {
                return kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Visibility.valueOf(i);
            }
        };
        private final int getHighSpeedVideoFpsRangesFor;

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.Internal.EnumLite
        public final int getNumber() {
            return this.getHighSpeedVideoFpsRangesFor;
        }

        public static kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Visibility valueOf(int i) {
            if (i == 0) {
                return INTERNAL;
            }
            if (i == 1) {
                return PRIVATE;
            }
            if (i == 2) {
                return PROTECTED;
            }
            if (i == 3) {
                return PUBLIC;
            }
            if (i == 4) {
                return PRIVATE_TO_THIS;
            }
            if (i != 5) {
                return null;
            }
            return LOCAL;
        }

        Visibility(int i) {
            this.getHighSpeedVideoFpsRangesFor = i;
        }
    }

    public enum MemberKind implements kotlin.reflect.jvm.internal.impl.protobuf.Internal.EnumLite {
        DECLARATION(0),
        FAKE_OVERRIDE(1),
        DELEGATION(2),
        SYNTHESIZED(3);

        private static kotlin.reflect.jvm.internal.impl.protobuf.Internal.EnumLiteMap<kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.MemberKind> getHighResolutionOutputSizeshNQ4ISI = new kotlin.reflect.jvm.internal.impl.protobuf.Internal.EnumLiteMap<kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.MemberKind>() { // from class: kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.MemberKind.1
            @Override // kotlin.reflect.jvm.internal.impl.protobuf.Internal.EnumLiteMap
            public final /* synthetic */ kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.MemberKind findValueByNumber(int i) {
                return kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.MemberKind.valueOf(i);
            }
        };
        private final int Camera2StreamConfigurationMap;

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.Internal.EnumLite
        public final int getNumber() {
            return this.Camera2StreamConfigurationMap;
        }

        public static kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.MemberKind valueOf(int i) {
            if (i == 0) {
                return DECLARATION;
            }
            if (i == 1) {
                return FAKE_OVERRIDE;
            }
            if (i == 2) {
                return DELEGATION;
            }
            if (i != 3) {
                return null;
            }
            return SYNTHESIZED;
        }

        MemberKind(int i) {
            this.Camera2StreamConfigurationMap = i;
        }
    }

    public enum ReturnValueStatus implements kotlin.reflect.jvm.internal.impl.protobuf.Internal.EnumLite {
        UNSPECIFIED(0),
        MUST_USE(1),
        EXPLICITLY_IGNORABLE(2);

        private static kotlin.reflect.jvm.internal.impl.protobuf.Internal.EnumLiteMap<kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.ReturnValueStatus> getHighSpeedVideoSizes = new kotlin.reflect.jvm.internal.impl.protobuf.Internal.EnumLiteMap<kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.ReturnValueStatus>() { // from class: kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.ReturnValueStatus.1
            @Override // kotlin.reflect.jvm.internal.impl.protobuf.Internal.EnumLiteMap
            public final /* synthetic */ kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.ReturnValueStatus findValueByNumber(int i) {
                return kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.ReturnValueStatus.valueOf(i);
            }
        };
        private final int getHighResolutionOutputSizeshNQ4ISI;

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.Internal.EnumLite
        public final int getNumber() {
            return this.getHighResolutionOutputSizeshNQ4ISI;
        }

        public static kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.ReturnValueStatus valueOf(int i) {
            if (i == 0) {
                return UNSPECIFIED;
            }
            if (i == 1) {
                return MUST_USE;
            }
            if (i != 2) {
                return null;
            }
            return EXPLICITLY_IGNORABLE;
        }

        ReturnValueStatus(int i) {
            this.getHighResolutionOutputSizeshNQ4ISI = i;
        }
    }

    public static final class StringTable extends kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite implements kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.StringTableOrBuilder {
        public static kotlin.reflect.jvm.internal.impl.protobuf.Parser<kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.StringTable> PARSER = new kotlin.reflect.jvm.internal.impl.protobuf.AbstractParser<kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.StringTable>() { // from class: kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.StringTable.1
            @Override // kotlin.reflect.jvm.internal.impl.protobuf.Parser
            public final /* synthetic */ java.lang.Object parsePartialFrom(kotlin.reflect.jvm.internal.impl.protobuf.CodedInputStream codedInputStream, kotlin.reflect.jvm.internal.impl.protobuf.ExtensionRegistryLite extensionRegistryLite) throws kotlin.reflect.jvm.internal.impl.protobuf.InvalidProtocolBufferException {
                return new kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.StringTable(codedInputStream, extensionRegistryLite, (byte) 0);
            }
        };
        private static final kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.StringTable getHighSpeedVideoSizes;
        private int Camera2StreamConfigurationMap;
        private final kotlin.reflect.jvm.internal.impl.protobuf.ByteString getHighResolutionOutputSizeshNQ4ISI;
        private byte getHighSpeedVideoFpsRanges;
        private kotlin.reflect.jvm.internal.impl.protobuf.LazyStringList getHighSpeedVideoFpsRangesFor;

        /* synthetic */ StringTable(kotlin.reflect.jvm.internal.impl.protobuf.CodedInputStream codedInputStream, kotlin.reflect.jvm.internal.impl.protobuf.ExtensionRegistryLite extensionRegistryLite, byte b) throws kotlin.reflect.jvm.internal.impl.protobuf.InvalidProtocolBufferException {
            this(codedInputStream, extensionRegistryLite);
        }

        /* synthetic */ StringTable(kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite.Builder builder, byte b) {
            this(builder);
        }

        private StringTable(kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite.Builder builder) {
            super(builder);
            this.getHighSpeedVideoFpsRanges = (byte) -1;
            this.Camera2StreamConfigurationMap = -1;
            this.getHighResolutionOutputSizeshNQ4ISI = builder.getUnknownFields();
        }

        private StringTable() {
            this.getHighSpeedVideoFpsRanges = (byte) -1;
            this.Camera2StreamConfigurationMap = -1;
            this.getHighResolutionOutputSizeshNQ4ISI = kotlin.reflect.jvm.internal.impl.protobuf.ByteString.EMPTY;
        }

        public static kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.StringTable getDefaultInstance() {
            return getHighSpeedVideoSizes;
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.MessageLiteOrBuilder
        public final kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.StringTable getDefaultInstanceForType() {
            return getHighSpeedVideoSizes;
        }

        private StringTable(kotlin.reflect.jvm.internal.impl.protobuf.CodedInputStream codedInputStream, kotlin.reflect.jvm.internal.impl.protobuf.ExtensionRegistryLite extensionRegistryLite) throws kotlin.reflect.jvm.internal.impl.protobuf.InvalidProtocolBufferException {
            this.getHighSpeedVideoFpsRanges = (byte) -1;
            this.Camera2StreamConfigurationMap = -1;
            this.getHighSpeedVideoFpsRangesFor = kotlin.reflect.jvm.internal.impl.protobuf.LazyStringArrayList.EMPTY;
            kotlin.reflect.jvm.internal.impl.protobuf.ByteString.Output newOutput = kotlin.reflect.jvm.internal.impl.protobuf.ByteString.newOutput();
            kotlin.reflect.jvm.internal.impl.protobuf.CodedOutputStream newInstance = kotlin.reflect.jvm.internal.impl.protobuf.CodedOutputStream.newInstance(newOutput, 1);
            boolean z = false;
            boolean z2 = false;
            while (!z) {
                try {
                    try {
                        try {
                            int readTag = codedInputStream.readTag();
                            if (readTag != 0) {
                                if (readTag == 10) {
                                    kotlin.reflect.jvm.internal.impl.protobuf.ByteString readBytes = codedInputStream.readBytes();
                                    if (!z2) {
                                        this.getHighSpeedVideoFpsRangesFor = new kotlin.reflect.jvm.internal.impl.protobuf.LazyStringArrayList();
                                        z2 = true;
                                    }
                                    this.getHighSpeedVideoFpsRangesFor.add(readBytes);
                                } else if (!parseUnknownField(codedInputStream, newInstance, extensionRegistryLite, readTag)) {
                                }
                            }
                            z = true;
                        } catch (kotlin.reflect.jvm.internal.impl.protobuf.InvalidProtocolBufferException e) {
                            throw e.setUnfinishedMessage(this);
                        }
                    } catch (java.io.IOException e2) {
                        throw new kotlin.reflect.jvm.internal.impl.protobuf.InvalidProtocolBufferException(e2.getMessage()).setUnfinishedMessage(this);
                    }
                } catch (java.lang.Throwable th) {
                    if (z2) {
                        this.getHighSpeedVideoFpsRangesFor = this.getHighSpeedVideoFpsRangesFor.getUnmodifiableView();
                    }
                    try {
                        newInstance.flush();
                    } catch (java.io.IOException unused) {
                    } catch (java.lang.Throwable th2) {
                        this.getHighResolutionOutputSizeshNQ4ISI = newOutput.toByteString();
                        throw th2;
                    }
                    this.getHighResolutionOutputSizeshNQ4ISI = newOutput.toByteString();
                    makeExtensionsImmutable();
                    throw th;
                }
            }
            if (z2) {
                this.getHighSpeedVideoFpsRangesFor = this.getHighSpeedVideoFpsRangesFor.getUnmodifiableView();
            }
            try {
                newInstance.flush();
            } catch (java.io.IOException unused2) {
            } catch (java.lang.Throwable th3) {
                this.getHighResolutionOutputSizeshNQ4ISI = newOutput.toByteString();
                throw th3;
            }
            this.getHighResolutionOutputSizeshNQ4ISI = newOutput.toByteString();
            makeExtensionsImmutable();
        }

        static {
            kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.StringTable stringTable = new kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.StringTable();
            getHighSpeedVideoSizes = stringTable;
            stringTable.getHighSpeedVideoFpsRangesFor = kotlin.reflect.jvm.internal.impl.protobuf.LazyStringArrayList.EMPTY;
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite, kotlin.reflect.jvm.internal.impl.protobuf.MessageLite
        public final kotlin.reflect.jvm.internal.impl.protobuf.Parser<kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.StringTable> getParserForType() {
            return PARSER;
        }

        public final kotlin.reflect.jvm.internal.impl.protobuf.ProtocolStringList getStringList() {
            return this.getHighSpeedVideoFpsRangesFor;
        }

        public final java.lang.String getString(int i) {
            return (java.lang.String) this.getHighSpeedVideoFpsRangesFor.get(i);
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.MessageLiteOrBuilder
        public final boolean isInitialized() {
            byte b = this.getHighSpeedVideoFpsRanges;
            if (b == 1) {
                return true;
            }
            if (b == 0) {
                return false;
            }
            this.getHighSpeedVideoFpsRanges = (byte) 1;
            return true;
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.MessageLite
        public final void writeTo(kotlin.reflect.jvm.internal.impl.protobuf.CodedOutputStream codedOutputStream) throws java.io.IOException {
            getSerializedSize();
            for (int i = 0; i < this.getHighSpeedVideoFpsRangesFor.size(); i++) {
                codedOutputStream.writeBytes(1, this.getHighSpeedVideoFpsRangesFor.getByteString(i));
            }
            codedOutputStream.writeRawBytes(this.getHighResolutionOutputSizeshNQ4ISI);
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.MessageLite
        public final int getSerializedSize() {
            int i = this.Camera2StreamConfigurationMap;
            if (i != -1) {
                return i;
            }
            int i2 = 0;
            for (int i3 = 0; i3 < this.getHighSpeedVideoFpsRangesFor.size(); i3++) {
                i2 += kotlin.reflect.jvm.internal.impl.protobuf.CodedOutputStream.computeBytesSizeNoTag(this.getHighSpeedVideoFpsRangesFor.getByteString(i3));
            }
            int size = i2 + getStringList().size() + this.getHighResolutionOutputSizeshNQ4ISI.size();
            this.Camera2StreamConfigurationMap = size;
            return size;
        }

        public static kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.StringTable.Builder newBuilder() {
            return kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.StringTable.Builder.getHighSpeedVideoSizes();
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.MessageLite
        public final kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.StringTable.Builder newBuilderForType() {
            return newBuilder();
        }

        public static kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.StringTable.Builder newBuilder(kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.StringTable stringTable) {
            return newBuilder().mergeFrom(stringTable);
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.MessageLite
        public final kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.StringTable.Builder toBuilder() {
            return newBuilder(this);
        }

        public static final class Builder extends kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite.Builder<kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.StringTable, kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.StringTable.Builder> implements kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.StringTableOrBuilder {
            private int Camera2StreamConfigurationMap;
            private kotlin.reflect.jvm.internal.impl.protobuf.LazyStringList getHighSpeedVideoFpsRangesFor = kotlin.reflect.jvm.internal.impl.protobuf.LazyStringArrayList.EMPTY;

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.MessageLiteOrBuilder
            public final boolean isInitialized() {
                return true;
            }

            private Builder() {
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite.Builder, kotlin.reflect.jvm.internal.impl.protobuf.MessageLiteOrBuilder
            public final kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.StringTable getDefaultInstanceForType() {
                return kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.StringTable.getDefaultInstance();
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.MessageLite.Builder
            public final kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.StringTable build() {
                kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.StringTable buildPartial = buildPartial();
                if (buildPartial.isInitialized()) {
                    return buildPartial;
                }
                throw newUninitializedMessageException(buildPartial);
            }

            public final kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.StringTable buildPartial() {
                kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.StringTable stringTable = new kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.StringTable((kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite.Builder) this, (byte) 0);
                if ((this.Camera2StreamConfigurationMap & 1) == 1) {
                    this.getHighSpeedVideoFpsRangesFor = this.getHighSpeedVideoFpsRangesFor.getUnmodifiableView();
                    this.Camera2StreamConfigurationMap &= -2;
                }
                stringTable.getHighSpeedVideoFpsRangesFor = this.getHighSpeedVideoFpsRangesFor;
                return stringTable;
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite.Builder
            public final kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.StringTable.Builder mergeFrom(kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.StringTable stringTable) {
                if (stringTable == kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.StringTable.getDefaultInstance()) {
                    return this;
                }
                if (!stringTable.getHighSpeedVideoFpsRangesFor.isEmpty()) {
                    if (this.getHighSpeedVideoFpsRangesFor.isEmpty()) {
                        this.getHighSpeedVideoFpsRangesFor = stringTable.getHighSpeedVideoFpsRangesFor;
                        this.Camera2StreamConfigurationMap &= -2;
                    } else {
                        if ((this.Camera2StreamConfigurationMap & 1) != 1) {
                            this.getHighSpeedVideoFpsRangesFor = new kotlin.reflect.jvm.internal.impl.protobuf.LazyStringArrayList(this.getHighSpeedVideoFpsRangesFor);
                            this.Camera2StreamConfigurationMap |= 1;
                        }
                        this.getHighSpeedVideoFpsRangesFor.addAll(stringTable.getHighSpeedVideoFpsRangesFor);
                    }
                }
                setUnknownFields(getUnknownFields().concat(stringTable.getHighResolutionOutputSizeshNQ4ISI));
                return this;
            }

            /* JADX WARN: Removed duplicated region for block: B:15:0x001d  */
            @Override // kotlin.reflect.jvm.internal.impl.protobuf.AbstractMessageLite.Builder, kotlin.reflect.jvm.internal.impl.protobuf.MessageLite.Builder
            /*
                Code decompiled incorrectly, please refer to instructions dump.
            */
            public final kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.StringTable.Builder mergeFrom(kotlin.reflect.jvm.internal.impl.protobuf.CodedInputStream codedInputStream, kotlin.reflect.jvm.internal.impl.protobuf.ExtensionRegistryLite extensionRegistryLite) throws java.io.IOException {
                kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.StringTable stringTable;
                try {
                    try {
                        kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.StringTable parsePartialFrom = kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.StringTable.PARSER.parsePartialFrom(codedInputStream, extensionRegistryLite);
                        if (parsePartialFrom != null) {
                            mergeFrom(parsePartialFrom);
                        }
                        return this;
                    } catch (kotlin.reflect.jvm.internal.impl.protobuf.InvalidProtocolBufferException e) {
                        stringTable = (kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.StringTable) e.getUnfinishedMessage();
                        try {
                            throw e;
                        } catch (java.lang.Throwable th) {
                            th = th;
                            if (stringTable != null) {
                                mergeFrom(stringTable);
                            }
                            throw th;
                        }
                    }
                } catch (java.lang.Throwable th2) {
                    th = th2;
                    stringTable = null;
                    if (stringTable != null) {
                    }
                    throw th;
                }
            }

            static /* synthetic */ kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.StringTable.Builder getHighSpeedVideoSizes() {
                return new kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.StringTable.Builder();
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite.Builder, kotlin.reflect.jvm.internal.impl.protobuf.AbstractMessageLite.Builder
            /* renamed from: clone */
            public final kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.StringTable.Builder mo23897clone() {
                return new kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.StringTable.Builder().mergeFrom(buildPartial());
            }
        }
    }

    public static final class QualifiedNameTable extends kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite implements kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.QualifiedNameTableOrBuilder {
        private static final kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.QualifiedNameTable Camera2StreamConfigurationMap;
        public static kotlin.reflect.jvm.internal.impl.protobuf.Parser<kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.QualifiedNameTable> PARSER = new kotlin.reflect.jvm.internal.impl.protobuf.AbstractParser<kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.QualifiedNameTable>() { // from class: kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.QualifiedNameTable.1
            @Override // kotlin.reflect.jvm.internal.impl.protobuf.Parser
            public final /* synthetic */ java.lang.Object parsePartialFrom(kotlin.reflect.jvm.internal.impl.protobuf.CodedInputStream codedInputStream, kotlin.reflect.jvm.internal.impl.protobuf.ExtensionRegistryLite extensionRegistryLite) throws kotlin.reflect.jvm.internal.impl.protobuf.InvalidProtocolBufferException {
                return new kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.QualifiedNameTable(codedInputStream, extensionRegistryLite, (byte) 0);
            }
        };
        private int getHighResolutionOutputSizeshNQ4ISI;
        private java.util.List<kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.QualifiedNameTable.QualifiedName> getHighSpeedVideoFpsRanges;
        private final kotlin.reflect.jvm.internal.impl.protobuf.ByteString getHighSpeedVideoFpsRangesFor;
        private byte getHighSpeedVideoSizes;

        public interface QualifiedNameOrBuilder extends kotlin.reflect.jvm.internal.impl.protobuf.MessageLiteOrBuilder {
        }

        /* synthetic */ QualifiedNameTable(kotlin.reflect.jvm.internal.impl.protobuf.CodedInputStream codedInputStream, kotlin.reflect.jvm.internal.impl.protobuf.ExtensionRegistryLite extensionRegistryLite, byte b) throws kotlin.reflect.jvm.internal.impl.protobuf.InvalidProtocolBufferException {
            this(codedInputStream, extensionRegistryLite);
        }

        /* synthetic */ QualifiedNameTable(kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite.Builder builder, byte b) {
            this(builder);
        }

        private QualifiedNameTable(kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite.Builder builder) {
            super(builder);
            this.getHighSpeedVideoSizes = (byte) -1;
            this.getHighResolutionOutputSizeshNQ4ISI = -1;
            this.getHighSpeedVideoFpsRangesFor = builder.getUnknownFields();
        }

        private QualifiedNameTable() {
            this.getHighSpeedVideoSizes = (byte) -1;
            this.getHighResolutionOutputSizeshNQ4ISI = -1;
            this.getHighSpeedVideoFpsRangesFor = kotlin.reflect.jvm.internal.impl.protobuf.ByteString.EMPTY;
        }

        public static kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.QualifiedNameTable getDefaultInstance() {
            return Camera2StreamConfigurationMap;
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.MessageLiteOrBuilder
        public final kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.QualifiedNameTable getDefaultInstanceForType() {
            return Camera2StreamConfigurationMap;
        }

        /* JADX WARN: Multi-variable type inference failed */
        private QualifiedNameTable(kotlin.reflect.jvm.internal.impl.protobuf.CodedInputStream codedInputStream, kotlin.reflect.jvm.internal.impl.protobuf.ExtensionRegistryLite extensionRegistryLite) throws kotlin.reflect.jvm.internal.impl.protobuf.InvalidProtocolBufferException {
            this.getHighSpeedVideoSizes = (byte) -1;
            this.getHighResolutionOutputSizeshNQ4ISI = -1;
            this.getHighSpeedVideoFpsRanges = java.util.Collections.emptyList();
            kotlin.reflect.jvm.internal.impl.protobuf.ByteString.Output newOutput = kotlin.reflect.jvm.internal.impl.protobuf.ByteString.newOutput();
            kotlin.reflect.jvm.internal.impl.protobuf.CodedOutputStream newInstance = kotlin.reflect.jvm.internal.impl.protobuf.CodedOutputStream.newInstance(newOutput, 1);
            boolean z = false;
            boolean z2 = false;
            while (!z) {
                try {
                    try {
                        int readTag = codedInputStream.readTag();
                        if (readTag != 0) {
                            if (readTag == 10) {
                                if (!z2) {
                                    this.getHighSpeedVideoFpsRanges = new java.util.ArrayList();
                                    z2 = true;
                                }
                                this.getHighSpeedVideoFpsRanges.add(codedInputStream.readMessage(kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.QualifiedNameTable.QualifiedName.PARSER, extensionRegistryLite));
                            } else if (!parseUnknownField(codedInputStream, newInstance, extensionRegistryLite, readTag)) {
                            }
                        }
                        z = true;
                    } catch (kotlin.reflect.jvm.internal.impl.protobuf.InvalidProtocolBufferException e) {
                        throw e.setUnfinishedMessage(this);
                    } catch (java.io.IOException e2) {
                        throw new kotlin.reflect.jvm.internal.impl.protobuf.InvalidProtocolBufferException(e2.getMessage()).setUnfinishedMessage(this);
                    }
                } catch (java.lang.Throwable th) {
                    if (z2) {
                        this.getHighSpeedVideoFpsRanges = java.util.Collections.unmodifiableList(this.getHighSpeedVideoFpsRanges);
                    }
                    try {
                        newInstance.flush();
                    } catch (java.io.IOException unused) {
                    } catch (java.lang.Throwable th2) {
                        this.getHighSpeedVideoFpsRangesFor = newOutput.toByteString();
                        throw th2;
                    }
                    this.getHighSpeedVideoFpsRangesFor = newOutput.toByteString();
                    makeExtensionsImmutable();
                    throw th;
                }
            }
            if (z2) {
                this.getHighSpeedVideoFpsRanges = java.util.Collections.unmodifiableList(this.getHighSpeedVideoFpsRanges);
            }
            try {
                newInstance.flush();
            } catch (java.io.IOException unused2) {
            } catch (java.lang.Throwable th3) {
                this.getHighSpeedVideoFpsRangesFor = newOutput.toByteString();
                throw th3;
            }
            this.getHighSpeedVideoFpsRangesFor = newOutput.toByteString();
            makeExtensionsImmutable();
        }

        static {
            kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.QualifiedNameTable qualifiedNameTable = new kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.QualifiedNameTable();
            Camera2StreamConfigurationMap = qualifiedNameTable;
            qualifiedNameTable.getHighSpeedVideoFpsRanges = java.util.Collections.emptyList();
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite, kotlin.reflect.jvm.internal.impl.protobuf.MessageLite
        public final kotlin.reflect.jvm.internal.impl.protobuf.Parser<kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.QualifiedNameTable> getParserForType() {
            return PARSER;
        }

        public static final class QualifiedName extends kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite implements kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.QualifiedNameTable.QualifiedNameOrBuilder {
            public static kotlin.reflect.jvm.internal.impl.protobuf.Parser<kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.QualifiedNameTable.QualifiedName> PARSER = new kotlin.reflect.jvm.internal.impl.protobuf.AbstractParser<kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.QualifiedNameTable.QualifiedName>() { // from class: kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.QualifiedNameTable.QualifiedName.1
                @Override // kotlin.reflect.jvm.internal.impl.protobuf.Parser
                public final /* synthetic */ java.lang.Object parsePartialFrom(kotlin.reflect.jvm.internal.impl.protobuf.CodedInputStream codedInputStream, kotlin.reflect.jvm.internal.impl.protobuf.ExtensionRegistryLite extensionRegistryLite) throws kotlin.reflect.jvm.internal.impl.protobuf.InvalidProtocolBufferException {
                    return new kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.QualifiedNameTable.QualifiedName(codedInputStream, extensionRegistryLite, (byte) 0);
                }
            };
            private static final kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.QualifiedNameTable.QualifiedName getHighSpeedVideoFpsRangesFor;
            private int Camera2StreamConfigurationMap;
            private int getHighResolutionOutputSizeshNQ4ISI;
            private byte getHighSpeedVideoFpsRanges;
            private kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.QualifiedNameTable.QualifiedName.Kind getHighSpeedVideoSizes;
            private int getHighSpeedVideoSizesFor;
            private final kotlin.reflect.jvm.internal.impl.protobuf.ByteString getInputSizeshNQ4ISI;
            private int getOutputMinFrameDuration;

            /* synthetic */ QualifiedName(kotlin.reflect.jvm.internal.impl.protobuf.CodedInputStream codedInputStream, kotlin.reflect.jvm.internal.impl.protobuf.ExtensionRegistryLite extensionRegistryLite, byte b) throws kotlin.reflect.jvm.internal.impl.protobuf.InvalidProtocolBufferException {
                this(codedInputStream, extensionRegistryLite);
            }

            /* synthetic */ QualifiedName(kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite.Builder builder, byte b) {
                this(builder);
            }

            private QualifiedName(kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite.Builder builder) {
                super(builder);
                this.getHighSpeedVideoFpsRanges = (byte) -1;
                this.getHighResolutionOutputSizeshNQ4ISI = -1;
                this.getInputSizeshNQ4ISI = builder.getUnknownFields();
            }

            private QualifiedName() {
                this.getHighSpeedVideoFpsRanges = (byte) -1;
                this.getHighResolutionOutputSizeshNQ4ISI = -1;
                this.getInputSizeshNQ4ISI = kotlin.reflect.jvm.internal.impl.protobuf.ByteString.EMPTY;
            }

            public static kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.QualifiedNameTable.QualifiedName getDefaultInstance() {
                return getHighSpeedVideoFpsRangesFor;
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.MessageLiteOrBuilder
            public final kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.QualifiedNameTable.QualifiedName getDefaultInstanceForType() {
                return getHighSpeedVideoFpsRangesFor;
            }

            private QualifiedName(kotlin.reflect.jvm.internal.impl.protobuf.CodedInputStream codedInputStream, kotlin.reflect.jvm.internal.impl.protobuf.ExtensionRegistryLite extensionRegistryLite) throws kotlin.reflect.jvm.internal.impl.protobuf.InvalidProtocolBufferException {
                this.getHighSpeedVideoFpsRanges = (byte) -1;
                this.getHighResolutionOutputSizeshNQ4ISI = -1;
                this.getOutputMinFrameDuration = -1;
                boolean z = false;
                this.getHighSpeedVideoSizesFor = 0;
                this.getHighSpeedVideoSizes = kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.QualifiedNameTable.QualifiedName.Kind.PACKAGE;
                kotlin.reflect.jvm.internal.impl.protobuf.ByteString.Output newOutput = kotlin.reflect.jvm.internal.impl.protobuf.ByteString.newOutput();
                kotlin.reflect.jvm.internal.impl.protobuf.CodedOutputStream newInstance = kotlin.reflect.jvm.internal.impl.protobuf.CodedOutputStream.newInstance(newOutput, 1);
                while (!z) {
                    try {
                        try {
                            try {
                                int readTag = codedInputStream.readTag();
                                if (readTag != 0) {
                                    if (readTag == 8) {
                                        this.Camera2StreamConfigurationMap |= 1;
                                        this.getOutputMinFrameDuration = codedInputStream.readInt32();
                                    } else if (readTag == 16) {
                                        this.Camera2StreamConfigurationMap |= 2;
                                        this.getHighSpeedVideoSizesFor = codedInputStream.readInt32();
                                    } else if (readTag == 24) {
                                        int readEnum = codedInputStream.readEnum();
                                        kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.QualifiedNameTable.QualifiedName.Kind valueOf = kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.QualifiedNameTable.QualifiedName.Kind.valueOf(readEnum);
                                        if (valueOf == null) {
                                            newInstance.writeRawVarint32(readTag);
                                            newInstance.writeRawVarint32(readEnum);
                                        } else {
                                            this.Camera2StreamConfigurationMap |= 4;
                                            this.getHighSpeedVideoSizes = valueOf;
                                        }
                                    } else if (!parseUnknownField(codedInputStream, newInstance, extensionRegistryLite, readTag)) {
                                    }
                                }
                                z = true;
                            } catch (kotlin.reflect.jvm.internal.impl.protobuf.InvalidProtocolBufferException e) {
                                throw e.setUnfinishedMessage(this);
                            }
                        } catch (java.io.IOException e2) {
                            throw new kotlin.reflect.jvm.internal.impl.protobuf.InvalidProtocolBufferException(e2.getMessage()).setUnfinishedMessage(this);
                        }
                    } catch (java.lang.Throwable th) {
                        try {
                            newInstance.flush();
                        } catch (java.io.IOException unused) {
                        } catch (java.lang.Throwable th2) {
                            this.getInputSizeshNQ4ISI = newOutput.toByteString();
                            throw th2;
                        }
                        this.getInputSizeshNQ4ISI = newOutput.toByteString();
                        makeExtensionsImmutable();
                        throw th;
                    }
                }
                try {
                    newInstance.flush();
                } catch (java.io.IOException unused2) {
                } catch (java.lang.Throwable th3) {
                    this.getInputSizeshNQ4ISI = newOutput.toByteString();
                    throw th3;
                }
                this.getInputSizeshNQ4ISI = newOutput.toByteString();
                makeExtensionsImmutable();
            }

            static {
                kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.QualifiedNameTable.QualifiedName qualifiedName = new kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.QualifiedNameTable.QualifiedName();
                getHighSpeedVideoFpsRangesFor = qualifiedName;
                qualifiedName.getOutputMinFrameDuration = -1;
                qualifiedName.getHighSpeedVideoSizesFor = 0;
                qualifiedName.getHighSpeedVideoSizes = kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.QualifiedNameTable.QualifiedName.Kind.PACKAGE;
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite, kotlin.reflect.jvm.internal.impl.protobuf.MessageLite
            public final kotlin.reflect.jvm.internal.impl.protobuf.Parser<kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.QualifiedNameTable.QualifiedName> getParserForType() {
                return PARSER;
            }

            public enum Kind implements kotlin.reflect.jvm.internal.impl.protobuf.Internal.EnumLite {
                CLASS(0),
                PACKAGE(1),
                LOCAL(2);

                private static kotlin.reflect.jvm.internal.impl.protobuf.Internal.EnumLiteMap<kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.QualifiedNameTable.QualifiedName.Kind> getHighSpeedVideoFpsRangesFor = new kotlin.reflect.jvm.internal.impl.protobuf.Internal.EnumLiteMap<kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.QualifiedNameTable.QualifiedName.Kind>() { // from class: kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.QualifiedNameTable.QualifiedName.Kind.1
                    @Override // kotlin.reflect.jvm.internal.impl.protobuf.Internal.EnumLiteMap
                    public final /* synthetic */ kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.QualifiedNameTable.QualifiedName.Kind findValueByNumber(int i) {
                        return kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.QualifiedNameTable.QualifiedName.Kind.valueOf(i);
                    }
                };
                private final int Camera2StreamConfigurationMap;

                @Override // kotlin.reflect.jvm.internal.impl.protobuf.Internal.EnumLite
                public final int getNumber() {
                    return this.Camera2StreamConfigurationMap;
                }

                public static kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.QualifiedNameTable.QualifiedName.Kind valueOf(int i) {
                    if (i == 0) {
                        return CLASS;
                    }
                    if (i == 1) {
                        return PACKAGE;
                    }
                    if (i != 2) {
                        return null;
                    }
                    return LOCAL;
                }

                Kind(int i) {
                    this.Camera2StreamConfigurationMap = i;
                }
            }

            public final boolean hasParentQualifiedName() {
                return (this.Camera2StreamConfigurationMap & 1) == 1;
            }

            public final int getParentQualifiedName() {
                return this.getOutputMinFrameDuration;
            }

            public final boolean hasShortName() {
                return (this.Camera2StreamConfigurationMap & 2) == 2;
            }

            public final int getShortName() {
                return this.getHighSpeedVideoSizesFor;
            }

            public final boolean hasKind() {
                return (this.Camera2StreamConfigurationMap & 4) == 4;
            }

            public final kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.QualifiedNameTable.QualifiedName.Kind getKind() {
                return this.getHighSpeedVideoSizes;
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.MessageLiteOrBuilder
            public final boolean isInitialized() {
                byte b = this.getHighSpeedVideoFpsRanges;
                if (b == 1) {
                    return true;
                }
                if (b == 0) {
                    return false;
                }
                if (!hasShortName()) {
                    this.getHighSpeedVideoFpsRanges = (byte) 0;
                    return false;
                }
                this.getHighSpeedVideoFpsRanges = (byte) 1;
                return true;
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.MessageLite
            public final void writeTo(kotlin.reflect.jvm.internal.impl.protobuf.CodedOutputStream codedOutputStream) throws java.io.IOException {
                getSerializedSize();
                if ((this.Camera2StreamConfigurationMap & 1) == 1) {
                    codedOutputStream.writeInt32(1, this.getOutputMinFrameDuration);
                }
                if ((this.Camera2StreamConfigurationMap & 2) == 2) {
                    codedOutputStream.writeInt32(2, this.getHighSpeedVideoSizesFor);
                }
                if ((this.Camera2StreamConfigurationMap & 4) == 4) {
                    codedOutputStream.writeEnum(3, this.getHighSpeedVideoSizes.getNumber());
                }
                codedOutputStream.writeRawBytes(this.getInputSizeshNQ4ISI);
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.MessageLite
            public final int getSerializedSize() {
                int i = this.getHighResolutionOutputSizeshNQ4ISI;
                if (i != -1) {
                    return i;
                }
                int computeInt32Size = (this.Camera2StreamConfigurationMap & 1) == 1 ? kotlin.reflect.jvm.internal.impl.protobuf.CodedOutputStream.computeInt32Size(1, this.getOutputMinFrameDuration) : 0;
                if ((this.Camera2StreamConfigurationMap & 2) == 2) {
                    computeInt32Size += kotlin.reflect.jvm.internal.impl.protobuf.CodedOutputStream.computeInt32Size(2, this.getHighSpeedVideoSizesFor);
                }
                if ((this.Camera2StreamConfigurationMap & 4) == 4) {
                    computeInt32Size += kotlin.reflect.jvm.internal.impl.protobuf.CodedOutputStream.computeEnumSize(3, this.getHighSpeedVideoSizes.getNumber());
                }
                int size = computeInt32Size + this.getInputSizeshNQ4ISI.size();
                this.getHighResolutionOutputSizeshNQ4ISI = size;
                return size;
            }

            public static kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.QualifiedNameTable.QualifiedName.Builder newBuilder() {
                return kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.QualifiedNameTable.QualifiedName.Builder.getHighSpeedVideoSizes();
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.MessageLite
            public final kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.QualifiedNameTable.QualifiedName.Builder newBuilderForType() {
                return newBuilder();
            }

            public static kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.QualifiedNameTable.QualifiedName.Builder newBuilder(kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.QualifiedNameTable.QualifiedName qualifiedName) {
                return newBuilder().mergeFrom(qualifiedName);
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.MessageLite
            public final kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.QualifiedNameTable.QualifiedName.Builder toBuilder() {
                return newBuilder(this);
            }

            public static final class Builder extends kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite.Builder<kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.QualifiedNameTable.QualifiedName, kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.QualifiedNameTable.QualifiedName.Builder> implements kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.QualifiedNameTable.QualifiedNameOrBuilder {
                private int getHighResolutionOutputSizeshNQ4ISI;
                private int getHighSpeedVideoSizes;
                private int Camera2StreamConfigurationMap = -1;
                private kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.QualifiedNameTable.QualifiedName.Kind getHighSpeedVideoFpsRanges = kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.QualifiedNameTable.QualifiedName.Kind.PACKAGE;

                private Builder() {
                }

                @Override // kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite.Builder, kotlin.reflect.jvm.internal.impl.protobuf.MessageLiteOrBuilder
                public final kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.QualifiedNameTable.QualifiedName getDefaultInstanceForType() {
                    return kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.QualifiedNameTable.QualifiedName.getDefaultInstance();
                }

                @Override // kotlin.reflect.jvm.internal.impl.protobuf.MessageLite.Builder
                public final kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.QualifiedNameTable.QualifiedName build() {
                    kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.QualifiedNameTable.QualifiedName buildPartial = buildPartial();
                    if (buildPartial.isInitialized()) {
                        return buildPartial;
                    }
                    throw newUninitializedMessageException(buildPartial);
                }

                /* JADX WARN: Multi-variable type inference failed */
                public final kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.QualifiedNameTable.QualifiedName buildPartial() {
                    kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.QualifiedNameTable.QualifiedName qualifiedName = new kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.QualifiedNameTable.QualifiedName((kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite.Builder) this, (byte) (0 == true ? 1 : 0));
                    int i = this.getHighResolutionOutputSizeshNQ4ISI;
                    int i2 = (i & 1) == 1 ? 1 : 0;
                    qualifiedName.getOutputMinFrameDuration = this.Camera2StreamConfigurationMap;
                    if ((i & 2) == 2) {
                        i2 |= 2;
                    }
                    qualifiedName.getHighSpeedVideoSizesFor = this.getHighSpeedVideoSizes;
                    if ((i & 4) == 4) {
                        i2 |= 4;
                    }
                    qualifiedName.getHighSpeedVideoSizes = this.getHighSpeedVideoFpsRanges;
                    qualifiedName.Camera2StreamConfigurationMap = i2;
                    return qualifiedName;
                }

                @Override // kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite.Builder
                public final kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.QualifiedNameTable.QualifiedName.Builder mergeFrom(kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.QualifiedNameTable.QualifiedName qualifiedName) {
                    if (qualifiedName == kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.QualifiedNameTable.QualifiedName.getDefaultInstance()) {
                        return this;
                    }
                    if (qualifiedName.hasParentQualifiedName()) {
                        setParentQualifiedName(qualifiedName.getParentQualifiedName());
                    }
                    if (qualifiedName.hasShortName()) {
                        setShortName(qualifiedName.getShortName());
                    }
                    if (qualifiedName.hasKind()) {
                        setKind(qualifiedName.getKind());
                    }
                    setUnknownFields(getUnknownFields().concat(qualifiedName.getInputSizeshNQ4ISI));
                    return this;
                }

                @Override // kotlin.reflect.jvm.internal.impl.protobuf.MessageLiteOrBuilder
                public final boolean isInitialized() {
                    return hasShortName();
                }

                /* JADX WARN: Removed duplicated region for block: B:15:0x001d  */
                @Override // kotlin.reflect.jvm.internal.impl.protobuf.AbstractMessageLite.Builder, kotlin.reflect.jvm.internal.impl.protobuf.MessageLite.Builder
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                */
                public final kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.QualifiedNameTable.QualifiedName.Builder mergeFrom(kotlin.reflect.jvm.internal.impl.protobuf.CodedInputStream codedInputStream, kotlin.reflect.jvm.internal.impl.protobuf.ExtensionRegistryLite extensionRegistryLite) throws java.io.IOException {
                    kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.QualifiedNameTable.QualifiedName qualifiedName;
                    try {
                        try {
                            kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.QualifiedNameTable.QualifiedName parsePartialFrom = kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.QualifiedNameTable.QualifiedName.PARSER.parsePartialFrom(codedInputStream, extensionRegistryLite);
                            if (parsePartialFrom != null) {
                                mergeFrom(parsePartialFrom);
                            }
                            return this;
                        } catch (kotlin.reflect.jvm.internal.impl.protobuf.InvalidProtocolBufferException e) {
                            qualifiedName = (kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.QualifiedNameTable.QualifiedName) e.getUnfinishedMessage();
                            try {
                                throw e;
                            } catch (java.lang.Throwable th) {
                                th = th;
                                if (qualifiedName != null) {
                                    mergeFrom(qualifiedName);
                                }
                                throw th;
                            }
                        }
                    } catch (java.lang.Throwable th2) {
                        th = th2;
                        qualifiedName = null;
                        if (qualifiedName != null) {
                        }
                        throw th;
                    }
                }

                public final kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.QualifiedNameTable.QualifiedName.Builder setParentQualifiedName(int i) {
                    this.getHighResolutionOutputSizeshNQ4ISI |= 1;
                    this.Camera2StreamConfigurationMap = i;
                    return this;
                }

                public final boolean hasShortName() {
                    return (this.getHighResolutionOutputSizeshNQ4ISI & 2) == 2;
                }

                public final kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.QualifiedNameTable.QualifiedName.Builder setShortName(int i) {
                    this.getHighResolutionOutputSizeshNQ4ISI |= 2;
                    this.getHighSpeedVideoSizes = i;
                    return this;
                }

                public final kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.QualifiedNameTable.QualifiedName.Builder setKind(kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.QualifiedNameTable.QualifiedName.Kind kind) {
                    this.getHighResolutionOutputSizeshNQ4ISI |= 4;
                    this.getHighSpeedVideoFpsRanges = kind;
                    return this;
                }

                static /* synthetic */ kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.QualifiedNameTable.QualifiedName.Builder getHighSpeedVideoSizes() {
                    return new kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.QualifiedNameTable.QualifiedName.Builder();
                }

                @Override // kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite.Builder, kotlin.reflect.jvm.internal.impl.protobuf.AbstractMessageLite.Builder
                /* renamed from: clone */
                public final kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.QualifiedNameTable.QualifiedName.Builder mo23897clone() {
                    return new kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.QualifiedNameTable.QualifiedName.Builder().mergeFrom(buildPartial());
                }
            }
        }

        public final int getQualifiedNameCount() {
            return this.getHighSpeedVideoFpsRanges.size();
        }

        public final kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.QualifiedNameTable.QualifiedName getQualifiedName(int i) {
            return this.getHighSpeedVideoFpsRanges.get(i);
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.MessageLiteOrBuilder
        public final boolean isInitialized() {
            byte b = this.getHighSpeedVideoSizes;
            if (b == 1) {
                return true;
            }
            if (b == 0) {
                return false;
            }
            for (int i = 0; i < getQualifiedNameCount(); i++) {
                if (!getQualifiedName(i).isInitialized()) {
                    this.getHighSpeedVideoSizes = (byte) 0;
                    return false;
                }
            }
            this.getHighSpeedVideoSizes = (byte) 1;
            return true;
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.MessageLite
        public final void writeTo(kotlin.reflect.jvm.internal.impl.protobuf.CodedOutputStream codedOutputStream) throws java.io.IOException {
            getSerializedSize();
            for (int i = 0; i < this.getHighSpeedVideoFpsRanges.size(); i++) {
                codedOutputStream.writeMessage(1, this.getHighSpeedVideoFpsRanges.get(i));
            }
            codedOutputStream.writeRawBytes(this.getHighSpeedVideoFpsRangesFor);
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.MessageLite
        public final int getSerializedSize() {
            int i = this.getHighResolutionOutputSizeshNQ4ISI;
            if (i != -1) {
                return i;
            }
            int i2 = 0;
            for (int i3 = 0; i3 < this.getHighSpeedVideoFpsRanges.size(); i3++) {
                i2 += kotlin.reflect.jvm.internal.impl.protobuf.CodedOutputStream.computeMessageSize(1, this.getHighSpeedVideoFpsRanges.get(i3));
            }
            int size = i2 + this.getHighSpeedVideoFpsRangesFor.size();
            this.getHighResolutionOutputSizeshNQ4ISI = size;
            return size;
        }

        public static kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.QualifiedNameTable.Builder newBuilder() {
            return kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.QualifiedNameTable.Builder.getHighSpeedVideoFpsRanges();
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.MessageLite
        public final kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.QualifiedNameTable.Builder newBuilderForType() {
            return newBuilder();
        }

        public static kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.QualifiedNameTable.Builder newBuilder(kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.QualifiedNameTable qualifiedNameTable) {
            return newBuilder().mergeFrom(qualifiedNameTable);
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.MessageLite
        public final kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.QualifiedNameTable.Builder toBuilder() {
            return newBuilder(this);
        }

        public static final class Builder extends kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite.Builder<kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.QualifiedNameTable, kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.QualifiedNameTable.Builder> implements kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.QualifiedNameTableOrBuilder {
            private int getHighSpeedVideoFpsRanges;
            private java.util.List<kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.QualifiedNameTable.QualifiedName> getHighSpeedVideoFpsRangesFor = java.util.Collections.emptyList();

            private Builder() {
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite.Builder, kotlin.reflect.jvm.internal.impl.protobuf.MessageLiteOrBuilder
            public final kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.QualifiedNameTable getDefaultInstanceForType() {
                return kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.QualifiedNameTable.getDefaultInstance();
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.MessageLite.Builder
            public final kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.QualifiedNameTable build() {
                kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.QualifiedNameTable buildPartial = buildPartial();
                if (buildPartial.isInitialized()) {
                    return buildPartial;
                }
                throw newUninitializedMessageException(buildPartial);
            }

            public final kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.QualifiedNameTable buildPartial() {
                kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.QualifiedNameTable qualifiedNameTable = new kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.QualifiedNameTable((kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite.Builder) this, (byte) 0);
                if ((this.getHighSpeedVideoFpsRanges & 1) == 1) {
                    this.getHighSpeedVideoFpsRangesFor = java.util.Collections.unmodifiableList(this.getHighSpeedVideoFpsRangesFor);
                    this.getHighSpeedVideoFpsRanges &= -2;
                }
                qualifiedNameTable.getHighSpeedVideoFpsRanges = this.getHighSpeedVideoFpsRangesFor;
                return qualifiedNameTable;
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite.Builder
            public final kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.QualifiedNameTable.Builder mergeFrom(kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.QualifiedNameTable qualifiedNameTable) {
                if (qualifiedNameTable == kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.QualifiedNameTable.getDefaultInstance()) {
                    return this;
                }
                if (!qualifiedNameTable.getHighSpeedVideoFpsRanges.isEmpty()) {
                    if (this.getHighSpeedVideoFpsRangesFor.isEmpty()) {
                        this.getHighSpeedVideoFpsRangesFor = qualifiedNameTable.getHighSpeedVideoFpsRanges;
                        this.getHighSpeedVideoFpsRanges &= -2;
                    } else {
                        if ((this.getHighSpeedVideoFpsRanges & 1) != 1) {
                            this.getHighSpeedVideoFpsRangesFor = new java.util.ArrayList(this.getHighSpeedVideoFpsRangesFor);
                            this.getHighSpeedVideoFpsRanges |= 1;
                        }
                        this.getHighSpeedVideoFpsRangesFor.addAll(qualifiedNameTable.getHighSpeedVideoFpsRanges);
                    }
                }
                setUnknownFields(getUnknownFields().concat(qualifiedNameTable.getHighSpeedVideoFpsRangesFor));
                return this;
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.MessageLiteOrBuilder
            public final boolean isInitialized() {
                for (int i = 0; i < getQualifiedNameCount(); i++) {
                    if (!getQualifiedName(i).isInitialized()) {
                        return false;
                    }
                }
                return true;
            }

            /* JADX WARN: Removed duplicated region for block: B:15:0x001d  */
            @Override // kotlin.reflect.jvm.internal.impl.protobuf.AbstractMessageLite.Builder, kotlin.reflect.jvm.internal.impl.protobuf.MessageLite.Builder
            /*
                Code decompiled incorrectly, please refer to instructions dump.
            */
            public final kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.QualifiedNameTable.Builder mergeFrom(kotlin.reflect.jvm.internal.impl.protobuf.CodedInputStream codedInputStream, kotlin.reflect.jvm.internal.impl.protobuf.ExtensionRegistryLite extensionRegistryLite) throws java.io.IOException {
                kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.QualifiedNameTable qualifiedNameTable;
                try {
                    try {
                        kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.QualifiedNameTable parsePartialFrom = kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.QualifiedNameTable.PARSER.parsePartialFrom(codedInputStream, extensionRegistryLite);
                        if (parsePartialFrom != null) {
                            mergeFrom(parsePartialFrom);
                        }
                        return this;
                    } catch (kotlin.reflect.jvm.internal.impl.protobuf.InvalidProtocolBufferException e) {
                        qualifiedNameTable = (kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.QualifiedNameTable) e.getUnfinishedMessage();
                        try {
                            throw e;
                        } catch (java.lang.Throwable th) {
                            th = th;
                            if (qualifiedNameTable != null) {
                                mergeFrom(qualifiedNameTable);
                            }
                            throw th;
                        }
                    }
                } catch (java.lang.Throwable th2) {
                    th = th2;
                    qualifiedNameTable = null;
                    if (qualifiedNameTable != null) {
                    }
                    throw th;
                }
            }

            public final int getQualifiedNameCount() {
                return this.getHighSpeedVideoFpsRangesFor.size();
            }

            public final kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.QualifiedNameTable.QualifiedName getQualifiedName(int i) {
                return this.getHighSpeedVideoFpsRangesFor.get(i);
            }

            static /* synthetic */ kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.QualifiedNameTable.Builder getHighSpeedVideoFpsRanges() {
                return new kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.QualifiedNameTable.Builder();
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite.Builder, kotlin.reflect.jvm.internal.impl.protobuf.AbstractMessageLite.Builder
            /* renamed from: clone */
            public final kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.QualifiedNameTable.Builder mo23897clone() {
                return new kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.QualifiedNameTable.Builder().mergeFrom(buildPartial());
            }
        }
    }

    public static final class Annotation extends kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite implements kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.AnnotationOrBuilder {
        public static kotlin.reflect.jvm.internal.impl.protobuf.Parser<kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Annotation> PARSER = new kotlin.reflect.jvm.internal.impl.protobuf.AbstractParser<kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Annotation>() { // from class: kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Annotation.1
            @Override // kotlin.reflect.jvm.internal.impl.protobuf.Parser
            public final /* synthetic */ java.lang.Object parsePartialFrom(kotlin.reflect.jvm.internal.impl.protobuf.CodedInputStream codedInputStream, kotlin.reflect.jvm.internal.impl.protobuf.ExtensionRegistryLite extensionRegistryLite) throws kotlin.reflect.jvm.internal.impl.protobuf.InvalidProtocolBufferException {
                return new kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Annotation(codedInputStream, extensionRegistryLite, (byte) 0);
            }
        };
        private static final kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Annotation getHighSpeedVideoFpsRangesFor;
        private java.util.List<kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Annotation.Argument> Camera2StreamConfigurationMap;
        private byte getHighResolutionOutputSizeshNQ4ISI;
        private int getHighSpeedVideoFpsRanges;
        private int getHighSpeedVideoSizes;
        private int getOutputFormats;
        private final kotlin.reflect.jvm.internal.impl.protobuf.ByteString getOutputMinFrameDuration;

        public interface ArgumentOrBuilder extends kotlin.reflect.jvm.internal.impl.protobuf.MessageLiteOrBuilder {
        }

        /* synthetic */ Annotation(kotlin.reflect.jvm.internal.impl.protobuf.CodedInputStream codedInputStream, kotlin.reflect.jvm.internal.impl.protobuf.ExtensionRegistryLite extensionRegistryLite, byte b) throws kotlin.reflect.jvm.internal.impl.protobuf.InvalidProtocolBufferException {
            this(codedInputStream, extensionRegistryLite);
        }

        /* synthetic */ Annotation(kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite.Builder builder, byte b) {
            this(builder);
        }

        private Annotation(kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite.Builder builder) {
            super(builder);
            this.getHighResolutionOutputSizeshNQ4ISI = (byte) -1;
            this.getOutputFormats = -1;
            this.getOutputMinFrameDuration = builder.getUnknownFields();
        }

        private Annotation() {
            this.getHighResolutionOutputSizeshNQ4ISI = (byte) -1;
            this.getOutputFormats = -1;
            this.getOutputMinFrameDuration = kotlin.reflect.jvm.internal.impl.protobuf.ByteString.EMPTY;
        }

        public static kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Annotation getDefaultInstance() {
            return getHighSpeedVideoFpsRangesFor;
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.MessageLiteOrBuilder
        public final kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Annotation getDefaultInstanceForType() {
            return getHighSpeedVideoFpsRangesFor;
        }

        /* JADX WARN: Multi-variable type inference failed */
        private Annotation(kotlin.reflect.jvm.internal.impl.protobuf.CodedInputStream codedInputStream, kotlin.reflect.jvm.internal.impl.protobuf.ExtensionRegistryLite extensionRegistryLite) throws kotlin.reflect.jvm.internal.impl.protobuf.InvalidProtocolBufferException {
            this.getHighResolutionOutputSizeshNQ4ISI = (byte) -1;
            this.getOutputFormats = -1;
            boolean z = false;
            this.getHighSpeedVideoFpsRanges = 0;
            this.Camera2StreamConfigurationMap = java.util.Collections.emptyList();
            kotlin.reflect.jvm.internal.impl.protobuf.ByteString.Output newOutput = kotlin.reflect.jvm.internal.impl.protobuf.ByteString.newOutput();
            kotlin.reflect.jvm.internal.impl.protobuf.CodedOutputStream newInstance = kotlin.reflect.jvm.internal.impl.protobuf.CodedOutputStream.newInstance(newOutput, 1);
            char c = 0;
            while (!z) {
                try {
                    try {
                        try {
                            int readTag = codedInputStream.readTag();
                            if (readTag != 0) {
                                if (readTag == 8) {
                                    this.getHighSpeedVideoSizes |= 1;
                                    this.getHighSpeedVideoFpsRanges = codedInputStream.readInt32();
                                } else if (readTag == 18) {
                                    if ((c & 2) != 2) {
                                        this.Camera2StreamConfigurationMap = new java.util.ArrayList();
                                        c = 2;
                                    }
                                    this.Camera2StreamConfigurationMap.add(codedInputStream.readMessage(kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Annotation.Argument.PARSER, extensionRegistryLite));
                                } else if (!parseUnknownField(codedInputStream, newInstance, extensionRegistryLite, readTag)) {
                                }
                            }
                            z = true;
                        } catch (java.io.IOException e) {
                            throw new kotlin.reflect.jvm.internal.impl.protobuf.InvalidProtocolBufferException(e.getMessage()).setUnfinishedMessage(this);
                        }
                    } catch (kotlin.reflect.jvm.internal.impl.protobuf.InvalidProtocolBufferException e2) {
                        throw e2.setUnfinishedMessage(this);
                    }
                } catch (java.lang.Throwable th) {
                    if ((c & 2) == 2) {
                        this.Camera2StreamConfigurationMap = java.util.Collections.unmodifiableList(this.Camera2StreamConfigurationMap);
                    }
                    try {
                        newInstance.flush();
                    } catch (java.io.IOException unused) {
                    } catch (java.lang.Throwable th2) {
                        this.getOutputMinFrameDuration = newOutput.toByteString();
                        throw th2;
                    }
                    this.getOutputMinFrameDuration = newOutput.toByteString();
                    makeExtensionsImmutable();
                    throw th;
                }
            }
            if ((c & 2) == 2) {
                this.Camera2StreamConfigurationMap = java.util.Collections.unmodifiableList(this.Camera2StreamConfigurationMap);
            }
            try {
                newInstance.flush();
            } catch (java.io.IOException unused2) {
            } catch (java.lang.Throwable th3) {
                this.getOutputMinFrameDuration = newOutput.toByteString();
                throw th3;
            }
            this.getOutputMinFrameDuration = newOutput.toByteString();
            makeExtensionsImmutable();
        }

        static {
            kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Annotation annotation = new kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Annotation();
            getHighSpeedVideoFpsRangesFor = annotation;
            annotation.getHighSpeedVideoFpsRanges = 0;
            annotation.Camera2StreamConfigurationMap = java.util.Collections.emptyList();
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite, kotlin.reflect.jvm.internal.impl.protobuf.MessageLite
        public final kotlin.reflect.jvm.internal.impl.protobuf.Parser<kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Annotation> getParserForType() {
            return PARSER;
        }

        public static final class Argument extends kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite implements kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Annotation.ArgumentOrBuilder {
            private static final kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Annotation.Argument Camera2StreamConfigurationMap;
            public static kotlin.reflect.jvm.internal.impl.protobuf.Parser<kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Annotation.Argument> PARSER = new kotlin.reflect.jvm.internal.impl.protobuf.AbstractParser<kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Annotation.Argument>() { // from class: kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Annotation.Argument.1
                @Override // kotlin.reflect.jvm.internal.impl.protobuf.Parser
                public final /* synthetic */ java.lang.Object parsePartialFrom(kotlin.reflect.jvm.internal.impl.protobuf.CodedInputStream codedInputStream, kotlin.reflect.jvm.internal.impl.protobuf.ExtensionRegistryLite extensionRegistryLite) throws kotlin.reflect.jvm.internal.impl.protobuf.InvalidProtocolBufferException {
                    return new kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Annotation.Argument(codedInputStream, extensionRegistryLite, (byte) 0);
                }
            };
            private byte getHighResolutionOutputSizeshNQ4ISI;
            private int getHighSpeedVideoFpsRanges;
            private int getHighSpeedVideoFpsRangesFor;
            private int getHighSpeedVideoSizes;
            private final kotlin.reflect.jvm.internal.impl.protobuf.ByteString getInputFormats;
            private kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Annotation.Argument.Value getOutputFormats;

            public interface ValueOrBuilder extends kotlin.reflect.jvm.internal.impl.protobuf.MessageLiteOrBuilder {
            }

            /* synthetic */ Argument(kotlin.reflect.jvm.internal.impl.protobuf.CodedInputStream codedInputStream, kotlin.reflect.jvm.internal.impl.protobuf.ExtensionRegistryLite extensionRegistryLite, byte b) throws kotlin.reflect.jvm.internal.impl.protobuf.InvalidProtocolBufferException {
                this(codedInputStream, extensionRegistryLite);
            }

            /* synthetic */ Argument(kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite.Builder builder, byte b) {
                this(builder);
            }

            private Argument(kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite.Builder builder) {
                super(builder);
                this.getHighResolutionOutputSizeshNQ4ISI = (byte) -1;
                this.getHighSpeedVideoSizes = -1;
                this.getInputFormats = builder.getUnknownFields();
            }

            private Argument() {
                this.getHighResolutionOutputSizeshNQ4ISI = (byte) -1;
                this.getHighSpeedVideoSizes = -1;
                this.getInputFormats = kotlin.reflect.jvm.internal.impl.protobuf.ByteString.EMPTY;
            }

            public static kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Annotation.Argument getDefaultInstance() {
                return Camera2StreamConfigurationMap;
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.MessageLiteOrBuilder
            public final kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Annotation.Argument getDefaultInstanceForType() {
                return Camera2StreamConfigurationMap;
            }

            private Argument(kotlin.reflect.jvm.internal.impl.protobuf.CodedInputStream codedInputStream, kotlin.reflect.jvm.internal.impl.protobuf.ExtensionRegistryLite extensionRegistryLite) throws kotlin.reflect.jvm.internal.impl.protobuf.InvalidProtocolBufferException {
                this.getHighResolutionOutputSizeshNQ4ISI = (byte) -1;
                this.getHighSpeedVideoSizes = -1;
                boolean z = false;
                this.getHighSpeedVideoFpsRanges = 0;
                this.getOutputFormats = kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Annotation.Argument.Value.getDefaultInstance();
                kotlin.reflect.jvm.internal.impl.protobuf.ByteString.Output newOutput = kotlin.reflect.jvm.internal.impl.protobuf.ByteString.newOutput();
                kotlin.reflect.jvm.internal.impl.protobuf.CodedOutputStream newInstance = kotlin.reflect.jvm.internal.impl.protobuf.CodedOutputStream.newInstance(newOutput, 1);
                while (!z) {
                    try {
                        try {
                            int readTag = codedInputStream.readTag();
                            if (readTag != 0) {
                                if (readTag == 8) {
                                    this.getHighSpeedVideoFpsRangesFor |= 1;
                                    this.getHighSpeedVideoFpsRanges = codedInputStream.readInt32();
                                } else if (readTag == 18) {
                                    kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Annotation.Argument.Value.Builder builder = (this.getHighSpeedVideoFpsRangesFor & 2) == 2 ? this.getOutputFormats.toBuilder() : null;
                                    kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Annotation.Argument.Value value = (kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Annotation.Argument.Value) codedInputStream.readMessage(kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Annotation.Argument.Value.PARSER, extensionRegistryLite);
                                    this.getOutputFormats = value;
                                    if (builder != null) {
                                        builder.mergeFrom(value);
                                        this.getOutputFormats = builder.buildPartial();
                                    }
                                    this.getHighSpeedVideoFpsRangesFor |= 2;
                                } else if (!parseUnknownField(codedInputStream, newInstance, extensionRegistryLite, readTag)) {
                                }
                            }
                            z = true;
                        } catch (kotlin.reflect.jvm.internal.impl.protobuf.InvalidProtocolBufferException e) {
                            throw e.setUnfinishedMessage(this);
                        } catch (java.io.IOException e2) {
                            throw new kotlin.reflect.jvm.internal.impl.protobuf.InvalidProtocolBufferException(e2.getMessage()).setUnfinishedMessage(this);
                        }
                    } catch (java.lang.Throwable th) {
                        try {
                            newInstance.flush();
                        } catch (java.io.IOException unused) {
                        } catch (java.lang.Throwable th2) {
                            this.getInputFormats = newOutput.toByteString();
                            throw th2;
                        }
                        this.getInputFormats = newOutput.toByteString();
                        makeExtensionsImmutable();
                        throw th;
                    }
                }
                try {
                    newInstance.flush();
                } catch (java.io.IOException unused2) {
                } catch (java.lang.Throwable th3) {
                    this.getInputFormats = newOutput.toByteString();
                    throw th3;
                }
                this.getInputFormats = newOutput.toByteString();
                makeExtensionsImmutable();
            }

            static {
                kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Annotation.Argument argument = new kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Annotation.Argument();
                Camera2StreamConfigurationMap = argument;
                argument.getHighSpeedVideoFpsRanges = 0;
                argument.getOutputFormats = kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Annotation.Argument.Value.getDefaultInstance();
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite, kotlin.reflect.jvm.internal.impl.protobuf.MessageLite
            public final kotlin.reflect.jvm.internal.impl.protobuf.Parser<kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Annotation.Argument> getParserForType() {
                return PARSER;
            }

            public static final class Value extends kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite implements kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Annotation.Argument.ValueOrBuilder {
                public static kotlin.reflect.jvm.internal.impl.protobuf.Parser<kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Annotation.Argument.Value> PARSER = new kotlin.reflect.jvm.internal.impl.protobuf.AbstractParser<kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Annotation.Argument.Value>() { // from class: kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Annotation.Argument.Value.1
                    @Override // kotlin.reflect.jvm.internal.impl.protobuf.Parser
                    public final /* synthetic */ java.lang.Object parsePartialFrom(kotlin.reflect.jvm.internal.impl.protobuf.CodedInputStream codedInputStream, kotlin.reflect.jvm.internal.impl.protobuf.ExtensionRegistryLite extensionRegistryLite) throws kotlin.reflect.jvm.internal.impl.protobuf.InvalidProtocolBufferException {
                        return new kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Annotation.Argument.Value(codedInputStream, extensionRegistryLite, (byte) 0);
                    }
                };
                private static final kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Annotation.Argument.Value getHighSpeedVideoFpsRanges;
                private int Camera2StreamConfigurationMap;
                private int getHighResolutionOutputSizeshNQ4ISI;
                private kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Annotation getHighSpeedVideoFpsRangesFor;
                private java.util.List<kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Annotation.Argument.Value> getHighSpeedVideoSizes;
                private int getHighSpeedVideoSizesFor;
                private double getInputFormats;
                private float getInputSizeshNQ4ISI;
                private int getOutputFormats;
                private int getOutputMinFrameDuration;
                private kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Annotation.Argument.Value.Type getOutputMinFrameDurationlomOqCM;
                private int getOutputSizes;
                private long getOutputSizeshNQ4ISI;
                private int getOutputStallDuration;
                private byte getOutputStallDurationlomOqCM;
                private final kotlin.reflect.jvm.internal.impl.protobuf.ByteString isOutputSupportedForhNQ4ISI;

                /* synthetic */ Value(kotlin.reflect.jvm.internal.impl.protobuf.CodedInputStream codedInputStream, kotlin.reflect.jvm.internal.impl.protobuf.ExtensionRegistryLite extensionRegistryLite, byte b) throws kotlin.reflect.jvm.internal.impl.protobuf.InvalidProtocolBufferException {
                    this(codedInputStream, extensionRegistryLite);
                }

                /* synthetic */ Value(kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite.Builder builder, byte b) {
                    this(builder);
                }

                private Value(kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite.Builder builder) {
                    super(builder);
                    this.getOutputStallDurationlomOqCM = (byte) -1;
                    this.getOutputStallDuration = -1;
                    this.isOutputSupportedForhNQ4ISI = builder.getUnknownFields();
                }

                private Value() {
                    this.getOutputStallDurationlomOqCM = (byte) -1;
                    this.getOutputStallDuration = -1;
                    this.isOutputSupportedForhNQ4ISI = kotlin.reflect.jvm.internal.impl.protobuf.ByteString.EMPTY;
                }

                public static kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Annotation.Argument.Value getDefaultInstance() {
                    return getHighSpeedVideoFpsRanges;
                }

                @Override // kotlin.reflect.jvm.internal.impl.protobuf.MessageLiteOrBuilder
                public final kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Annotation.Argument.Value getDefaultInstanceForType() {
                    return getHighSpeedVideoFpsRanges;
                }

                /* JADX WARN: Multi-variable type inference failed */
                /* JADX WARN: Type inference failed for: r5v0 */
                /* JADX WARN: Type inference failed for: r5v1 */
                /* JADX WARN: Type inference failed for: r5v2, types: [boolean] */
                private Value(kotlin.reflect.jvm.internal.impl.protobuf.CodedInputStream codedInputStream, kotlin.reflect.jvm.internal.impl.protobuf.ExtensionRegistryLite extensionRegistryLite) throws kotlin.reflect.jvm.internal.impl.protobuf.InvalidProtocolBufferException {
                    this.getOutputStallDurationlomOqCM = (byte) -1;
                    this.getOutputStallDuration = -1;
                    getHighResolutionOutputSizeshNQ4ISI();
                    kotlin.reflect.jvm.internal.impl.protobuf.ByteString.Output newOutput = kotlin.reflect.jvm.internal.impl.protobuf.ByteString.newOutput();
                    kotlin.reflect.jvm.internal.impl.protobuf.CodedOutputStream newInstance = kotlin.reflect.jvm.internal.impl.protobuf.CodedOutputStream.newInstance(newOutput, 1);
                    boolean z = false;
                    char c = 0;
                    while (true) {
                        ?? r5 = 256;
                        if (z) {
                            if ((c & 256) == 256) {
                                this.getHighSpeedVideoSizes = java.util.Collections.unmodifiableList(this.getHighSpeedVideoSizes);
                            }
                            try {
                                newInstance.flush();
                            } catch (java.io.IOException unused) {
                            } catch (java.lang.Throwable th) {
                                this.isOutputSupportedForhNQ4ISI = newOutput.toByteString();
                                throw th;
                            }
                            this.isOutputSupportedForhNQ4ISI = newOutput.toByteString();
                            makeExtensionsImmutable();
                            return;
                        }
                        try {
                            try {
                                int readTag = codedInputStream.readTag();
                                switch (readTag) {
                                    case 0:
                                        z = true;
                                    case 8:
                                        int readEnum = codedInputStream.readEnum();
                                        kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Annotation.Argument.Value.Type valueOf = kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Annotation.Argument.Value.Type.valueOf(readEnum);
                                        if (valueOf == null) {
                                            newInstance.writeRawVarint32(readTag);
                                            newInstance.writeRawVarint32(readEnum);
                                        } else {
                                            this.getHighResolutionOutputSizeshNQ4ISI |= 1;
                                            this.getOutputMinFrameDurationlomOqCM = valueOf;
                                        }
                                    case 16:
                                        this.getHighResolutionOutputSizeshNQ4ISI |= 2;
                                        this.getOutputSizeshNQ4ISI = codedInputStream.readSInt64();
                                    case 29:
                                        this.getHighResolutionOutputSizeshNQ4ISI |= 4;
                                        this.getInputSizeshNQ4ISI = codedInputStream.readFloat();
                                    case 33:
                                        this.getHighResolutionOutputSizeshNQ4ISI |= 8;
                                        this.getInputFormats = codedInputStream.readDouble();
                                    case 40:
                                        this.getHighResolutionOutputSizeshNQ4ISI |= 16;
                                        this.getOutputSizes = codedInputStream.readInt32();
                                    case 48:
                                        this.getHighResolutionOutputSizeshNQ4ISI |= 32;
                                        this.getOutputMinFrameDuration = codedInputStream.readInt32();
                                    case 56:
                                        this.getHighResolutionOutputSizeshNQ4ISI |= 64;
                                        this.getHighSpeedVideoSizesFor = codedInputStream.readInt32();
                                    case 66:
                                        kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Annotation.Builder builder = (this.getHighResolutionOutputSizeshNQ4ISI & 128) == 128 ? this.getHighSpeedVideoFpsRangesFor.toBuilder() : null;
                                        kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Annotation annotation = (kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Annotation) codedInputStream.readMessage(kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Annotation.PARSER, extensionRegistryLite);
                                        this.getHighSpeedVideoFpsRangesFor = annotation;
                                        if (builder != null) {
                                            builder.mergeFrom(annotation);
                                            this.getHighSpeedVideoFpsRangesFor = builder.buildPartial();
                                        }
                                        this.getHighResolutionOutputSizeshNQ4ISI |= 128;
                                    case 74:
                                        if ((c & 256) != 256) {
                                            this.getHighSpeedVideoSizes = new java.util.ArrayList();
                                            c = 256;
                                        }
                                        this.getHighSpeedVideoSizes.add(codedInputStream.readMessage(PARSER, extensionRegistryLite));
                                    case 80:
                                        this.getHighResolutionOutputSizeshNQ4ISI |= 512;
                                        this.getOutputFormats = codedInputStream.readInt32();
                                    case 88:
                                        this.getHighResolutionOutputSizeshNQ4ISI |= 256;
                                        this.Camera2StreamConfigurationMap = codedInputStream.readInt32();
                                    default:
                                        r5 = parseUnknownField(codedInputStream, newInstance, extensionRegistryLite, readTag);
                                        if (r5 == 0) {
                                            z = true;
                                        }
                                }
                            } catch (kotlin.reflect.jvm.internal.impl.protobuf.InvalidProtocolBufferException e) {
                                throw e.setUnfinishedMessage(this);
                            } catch (java.io.IOException e2) {
                                throw new kotlin.reflect.jvm.internal.impl.protobuf.InvalidProtocolBufferException(e2.getMessage()).setUnfinishedMessage(this);
                            }
                        } catch (java.lang.Throwable th2) {
                            if ((c & 256) == r5) {
                                this.getHighSpeedVideoSizes = java.util.Collections.unmodifiableList(this.getHighSpeedVideoSizes);
                            }
                            try {
                                newInstance.flush();
                            } catch (java.io.IOException unused2) {
                            } catch (java.lang.Throwable th3) {
                                this.isOutputSupportedForhNQ4ISI = newOutput.toByteString();
                                throw th3;
                            }
                            this.isOutputSupportedForhNQ4ISI = newOutput.toByteString();
                            makeExtensionsImmutable();
                            throw th2;
                        }
                    }
                }

                static {
                    kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Annotation.Argument.Value value = new kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Annotation.Argument.Value();
                    getHighSpeedVideoFpsRanges = value;
                    value.getHighResolutionOutputSizeshNQ4ISI();
                }

                @Override // kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite, kotlin.reflect.jvm.internal.impl.protobuf.MessageLite
                public final kotlin.reflect.jvm.internal.impl.protobuf.Parser<kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Annotation.Argument.Value> getParserForType() {
                    return PARSER;
                }

                public enum Type implements kotlin.reflect.jvm.internal.impl.protobuf.Internal.EnumLite {
                    BYTE(0),
                    CHAR(1),
                    SHORT(2),
                    INT(3),
                    LONG(4),
                    FLOAT(5),
                    DOUBLE(6),
                    BOOLEAN(7),
                    STRING(8),
                    CLASS(9),
                    ENUM(10),
                    ANNOTATION(11),
                    ARRAY(12);

                    private static kotlin.reflect.jvm.internal.impl.protobuf.Internal.EnumLiteMap<kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Annotation.Argument.Value.Type> getHighSpeedVideoFpsRanges = new kotlin.reflect.jvm.internal.impl.protobuf.Internal.EnumLiteMap<kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Annotation.Argument.Value.Type>() { // from class: kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Annotation.Argument.Value.Type.1
                        @Override // kotlin.reflect.jvm.internal.impl.protobuf.Internal.EnumLiteMap
                        public final /* synthetic */ kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Annotation.Argument.Value.Type findValueByNumber(int i) {
                            return kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Annotation.Argument.Value.Type.valueOf(i);
                        }
                    };
                    private final int getHighResolutionOutputSizeshNQ4ISI;

                    @Override // kotlin.reflect.jvm.internal.impl.protobuf.Internal.EnumLite
                    public final int getNumber() {
                        return this.getHighResolutionOutputSizeshNQ4ISI;
                    }

                    public static kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Annotation.Argument.Value.Type valueOf(int i) {
                        switch (i) {
                            case 0:
                                return BYTE;
                            case 1:
                                return CHAR;
                            case 2:
                                return SHORT;
                            case 3:
                                return INT;
                            case 4:
                                return LONG;
                            case 5:
                                return FLOAT;
                            case 6:
                                return DOUBLE;
                            case 7:
                                return BOOLEAN;
                            case 8:
                                return STRING;
                            case 9:
                                return CLASS;
                            case 10:
                                return ENUM;
                            case 11:
                                return ANNOTATION;
                            case 12:
                                return ARRAY;
                            default:
                                return null;
                        }
                    }

                    Type(int i) {
                        this.getHighResolutionOutputSizeshNQ4ISI = i;
                    }
                }

                public final boolean hasType() {
                    return (this.getHighResolutionOutputSizeshNQ4ISI & 1) == 1;
                }

                public final kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Annotation.Argument.Value.Type getType() {
                    return this.getOutputMinFrameDurationlomOqCM;
                }

                public final boolean hasIntValue() {
                    return (this.getHighResolutionOutputSizeshNQ4ISI & 2) == 2;
                }

                public final long getIntValue() {
                    return this.getOutputSizeshNQ4ISI;
                }

                public final boolean hasFloatValue() {
                    return (this.getHighResolutionOutputSizeshNQ4ISI & 4) == 4;
                }

                public final float getFloatValue() {
                    return this.getInputSizeshNQ4ISI;
                }

                public final boolean hasDoubleValue() {
                    return (this.getHighResolutionOutputSizeshNQ4ISI & 8) == 8;
                }

                public final double getDoubleValue() {
                    return this.getInputFormats;
                }

                public final boolean hasStringValue() {
                    return (this.getHighResolutionOutputSizeshNQ4ISI & 16) == 16;
                }

                public final int getStringValue() {
                    return this.getOutputSizes;
                }

                public final boolean hasClassId() {
                    return (this.getHighResolutionOutputSizeshNQ4ISI & 32) == 32;
                }

                public final int getClassId() {
                    return this.getOutputMinFrameDuration;
                }

                public final boolean hasEnumValueId() {
                    return (this.getHighResolutionOutputSizeshNQ4ISI & 64) == 64;
                }

                public final int getEnumValueId() {
                    return this.getHighSpeedVideoSizesFor;
                }

                public final boolean hasAnnotation() {
                    return (this.getHighResolutionOutputSizeshNQ4ISI & 128) == 128;
                }

                public final kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Annotation getAnnotation() {
                    return this.getHighSpeedVideoFpsRangesFor;
                }

                public final java.util.List<kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Annotation.Argument.Value> getArrayElementList() {
                    return this.getHighSpeedVideoSizes;
                }

                public final int getArrayElementCount() {
                    return this.getHighSpeedVideoSizes.size();
                }

                public final kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Annotation.Argument.Value getArrayElement(int i) {
                    return this.getHighSpeedVideoSizes.get(i);
                }

                public final boolean hasArrayDimensionCount() {
                    return (this.getHighResolutionOutputSizeshNQ4ISI & 256) == 256;
                }

                public final int getArrayDimensionCount() {
                    return this.Camera2StreamConfigurationMap;
                }

                public final boolean hasFlags() {
                    return (this.getHighResolutionOutputSizeshNQ4ISI & 512) == 512;
                }

                public final int getFlags() {
                    return this.getOutputFormats;
                }

                private void getHighResolutionOutputSizeshNQ4ISI() {
                    this.getOutputMinFrameDurationlomOqCM = kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Annotation.Argument.Value.Type.BYTE;
                    this.getOutputSizeshNQ4ISI = 0L;
                    this.getInputSizeshNQ4ISI = 0.0f;
                    this.getInputFormats = 0.0d;
                    this.getOutputSizes = 0;
                    this.getOutputMinFrameDuration = 0;
                    this.getHighSpeedVideoSizesFor = 0;
                    this.getHighSpeedVideoFpsRangesFor = kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Annotation.getDefaultInstance();
                    this.getHighSpeedVideoSizes = java.util.Collections.emptyList();
                    this.Camera2StreamConfigurationMap = 0;
                    this.getOutputFormats = 0;
                }

                @Override // kotlin.reflect.jvm.internal.impl.protobuf.MessageLiteOrBuilder
                public final boolean isInitialized() {
                    byte b = this.getOutputStallDurationlomOqCM;
                    if (b == 1) {
                        return true;
                    }
                    if (b == 0) {
                        return false;
                    }
                    if (hasAnnotation() && !getAnnotation().isInitialized()) {
                        this.getOutputStallDurationlomOqCM = (byte) 0;
                        return false;
                    }
                    for (int i = 0; i < getArrayElementCount(); i++) {
                        if (!getArrayElement(i).isInitialized()) {
                            this.getOutputStallDurationlomOqCM = (byte) 0;
                            return false;
                        }
                    }
                    this.getOutputStallDurationlomOqCM = (byte) 1;
                    return true;
                }

                @Override // kotlin.reflect.jvm.internal.impl.protobuf.MessageLite
                public final void writeTo(kotlin.reflect.jvm.internal.impl.protobuf.CodedOutputStream codedOutputStream) throws java.io.IOException {
                    getSerializedSize();
                    if ((this.getHighResolutionOutputSizeshNQ4ISI & 1) == 1) {
                        codedOutputStream.writeEnum(1, this.getOutputMinFrameDurationlomOqCM.getNumber());
                    }
                    if ((this.getHighResolutionOutputSizeshNQ4ISI & 2) == 2) {
                        codedOutputStream.writeSInt64(2, this.getOutputSizeshNQ4ISI);
                    }
                    if ((this.getHighResolutionOutputSizeshNQ4ISI & 4) == 4) {
                        codedOutputStream.writeFloat(3, this.getInputSizeshNQ4ISI);
                    }
                    if ((this.getHighResolutionOutputSizeshNQ4ISI & 8) == 8) {
                        codedOutputStream.writeDouble(4, this.getInputFormats);
                    }
                    if ((this.getHighResolutionOutputSizeshNQ4ISI & 16) == 16) {
                        codedOutputStream.writeInt32(5, this.getOutputSizes);
                    }
                    if ((this.getHighResolutionOutputSizeshNQ4ISI & 32) == 32) {
                        codedOutputStream.writeInt32(6, this.getOutputMinFrameDuration);
                    }
                    if ((this.getHighResolutionOutputSizeshNQ4ISI & 64) == 64) {
                        codedOutputStream.writeInt32(7, this.getHighSpeedVideoSizesFor);
                    }
                    if ((this.getHighResolutionOutputSizeshNQ4ISI & 128) == 128) {
                        codedOutputStream.writeMessage(8, this.getHighSpeedVideoFpsRangesFor);
                    }
                    for (int i = 0; i < this.getHighSpeedVideoSizes.size(); i++) {
                        codedOutputStream.writeMessage(9, this.getHighSpeedVideoSizes.get(i));
                    }
                    if ((this.getHighResolutionOutputSizeshNQ4ISI & 512) == 512) {
                        codedOutputStream.writeInt32(10, this.getOutputFormats);
                    }
                    if ((this.getHighResolutionOutputSizeshNQ4ISI & 256) == 256) {
                        codedOutputStream.writeInt32(11, this.Camera2StreamConfigurationMap);
                    }
                    codedOutputStream.writeRawBytes(this.isOutputSupportedForhNQ4ISI);
                }

                @Override // kotlin.reflect.jvm.internal.impl.protobuf.MessageLite
                public final int getSerializedSize() {
                    int i = this.getOutputStallDuration;
                    if (i != -1) {
                        return i;
                    }
                    int computeEnumSize = (this.getHighResolutionOutputSizeshNQ4ISI & 1) == 1 ? kotlin.reflect.jvm.internal.impl.protobuf.CodedOutputStream.computeEnumSize(1, this.getOutputMinFrameDurationlomOqCM.getNumber()) : 0;
                    if ((this.getHighResolutionOutputSizeshNQ4ISI & 2) == 2) {
                        computeEnumSize += kotlin.reflect.jvm.internal.impl.protobuf.CodedOutputStream.computeSInt64Size(2, this.getOutputSizeshNQ4ISI);
                    }
                    if ((this.getHighResolutionOutputSizeshNQ4ISI & 4) == 4) {
                        computeEnumSize += kotlin.reflect.jvm.internal.impl.protobuf.CodedOutputStream.computeFloatSize(3, this.getInputSizeshNQ4ISI);
                    }
                    if ((this.getHighResolutionOutputSizeshNQ4ISI & 8) == 8) {
                        computeEnumSize += kotlin.reflect.jvm.internal.impl.protobuf.CodedOutputStream.computeDoubleSize(4, this.getInputFormats);
                    }
                    if ((this.getHighResolutionOutputSizeshNQ4ISI & 16) == 16) {
                        computeEnumSize += kotlin.reflect.jvm.internal.impl.protobuf.CodedOutputStream.computeInt32Size(5, this.getOutputSizes);
                    }
                    if ((this.getHighResolutionOutputSizeshNQ4ISI & 32) == 32) {
                        computeEnumSize += kotlin.reflect.jvm.internal.impl.protobuf.CodedOutputStream.computeInt32Size(6, this.getOutputMinFrameDuration);
                    }
                    if ((this.getHighResolutionOutputSizeshNQ4ISI & 64) == 64) {
                        computeEnumSize += kotlin.reflect.jvm.internal.impl.protobuf.CodedOutputStream.computeInt32Size(7, this.getHighSpeedVideoSizesFor);
                    }
                    if ((this.getHighResolutionOutputSizeshNQ4ISI & 128) == 128) {
                        computeEnumSize += kotlin.reflect.jvm.internal.impl.protobuf.CodedOutputStream.computeMessageSize(8, this.getHighSpeedVideoFpsRangesFor);
                    }
                    for (int i2 = 0; i2 < this.getHighSpeedVideoSizes.size(); i2++) {
                        computeEnumSize += kotlin.reflect.jvm.internal.impl.protobuf.CodedOutputStream.computeMessageSize(9, this.getHighSpeedVideoSizes.get(i2));
                    }
                    if ((this.getHighResolutionOutputSizeshNQ4ISI & 512) == 512) {
                        computeEnumSize += kotlin.reflect.jvm.internal.impl.protobuf.CodedOutputStream.computeInt32Size(10, this.getOutputFormats);
                    }
                    if ((this.getHighResolutionOutputSizeshNQ4ISI & 256) == 256) {
                        computeEnumSize += kotlin.reflect.jvm.internal.impl.protobuf.CodedOutputStream.computeInt32Size(11, this.Camera2StreamConfigurationMap);
                    }
                    int size = computeEnumSize + this.isOutputSupportedForhNQ4ISI.size();
                    this.getOutputStallDuration = size;
                    return size;
                }

                public static kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Annotation.Argument.Value.Builder newBuilder() {
                    return kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Annotation.Argument.Value.Builder.getHighResolutionOutputSizeshNQ4ISI();
                }

                @Override // kotlin.reflect.jvm.internal.impl.protobuf.MessageLite
                public final kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Annotation.Argument.Value.Builder newBuilderForType() {
                    return newBuilder();
                }

                public static kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Annotation.Argument.Value.Builder newBuilder(kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Annotation.Argument.Value value) {
                    return newBuilder().mergeFrom(value);
                }

                @Override // kotlin.reflect.jvm.internal.impl.protobuf.MessageLite
                public final kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Annotation.Argument.Value.Builder toBuilder() {
                    return newBuilder(this);
                }

                public static final class Builder extends kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite.Builder<kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Annotation.Argument.Value, kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Annotation.Argument.Value.Builder> implements kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Annotation.Argument.ValueOrBuilder {
                    private int Camera2StreamConfigurationMap;
                    private int getHighResolutionOutputSizeshNQ4ISI;
                    private int getHighSpeedVideoFpsRangesFor;
                    private double getHighSpeedVideoSizesFor;
                    private int getInputFormats;
                    private int getInputSizeshNQ4ISI;
                    private float getOutputFormats;
                    private long getOutputMinFrameDuration;
                    private int getOutputStallDuration;
                    private kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Annotation.Argument.Value.Type getOutputStallDurationlomOqCM = kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Annotation.Argument.Value.Type.BYTE;
                    private kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Annotation getHighSpeedVideoSizes = kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Annotation.getDefaultInstance();
                    private java.util.List<kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Annotation.Argument.Value> getHighSpeedVideoFpsRanges = java.util.Collections.emptyList();

                    private Builder() {
                    }

                    @Override // kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite.Builder, kotlin.reflect.jvm.internal.impl.protobuf.MessageLiteOrBuilder
                    public final kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Annotation.Argument.Value getDefaultInstanceForType() {
                        return kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Annotation.Argument.Value.getDefaultInstance();
                    }

                    @Override // kotlin.reflect.jvm.internal.impl.protobuf.MessageLite.Builder
                    public final kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Annotation.Argument.Value build() {
                        kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Annotation.Argument.Value buildPartial = buildPartial();
                        if (buildPartial.isInitialized()) {
                            return buildPartial;
                        }
                        throw newUninitializedMessageException(buildPartial);
                    }

                    /* JADX WARN: Multi-variable type inference failed */
                    public final kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Annotation.Argument.Value buildPartial() {
                        kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Annotation.Argument.Value value = new kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Annotation.Argument.Value((kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite.Builder) this, (byte) (0 == true ? 1 : 0));
                        int i = this.getHighSpeedVideoFpsRangesFor;
                        int i2 = (i & 1) == 1 ? 1 : 0;
                        value.getOutputMinFrameDurationlomOqCM = this.getOutputStallDurationlomOqCM;
                        if ((i & 2) == 2) {
                            i2 |= 2;
                        }
                        value.getOutputSizeshNQ4ISI = this.getOutputMinFrameDuration;
                        if ((i & 4) == 4) {
                            i2 |= 4;
                        }
                        value.getInputSizeshNQ4ISI = this.getOutputFormats;
                        if ((i & 8) == 8) {
                            i2 |= 8;
                        }
                        value.getInputFormats = this.getHighSpeedVideoSizesFor;
                        if ((i & 16) == 16) {
                            i2 |= 16;
                        }
                        value.getOutputSizes = this.getOutputStallDuration;
                        if ((i & 32) == 32) {
                            i2 |= 32;
                        }
                        value.getOutputMinFrameDuration = this.getHighResolutionOutputSizeshNQ4ISI;
                        if ((i & 64) == 64) {
                            i2 |= 64;
                        }
                        value.getHighSpeedVideoSizesFor = this.getInputSizeshNQ4ISI;
                        if ((i & 128) == 128) {
                            i2 |= 128;
                        }
                        value.getHighSpeedVideoFpsRangesFor = this.getHighSpeedVideoSizes;
                        if ((this.getHighSpeedVideoFpsRangesFor & 256) == 256) {
                            this.getHighSpeedVideoFpsRanges = java.util.Collections.unmodifiableList(this.getHighSpeedVideoFpsRanges);
                            this.getHighSpeedVideoFpsRangesFor &= -257;
                        }
                        value.getHighSpeedVideoSizes = this.getHighSpeedVideoFpsRanges;
                        if ((i & 512) == 512) {
                            i2 |= 256;
                        }
                        value.Camera2StreamConfigurationMap = this.Camera2StreamConfigurationMap;
                        if ((i & 1024) == 1024) {
                            i2 |= 512;
                        }
                        value.getOutputFormats = this.getInputFormats;
                        value.getHighResolutionOutputSizeshNQ4ISI = i2;
                        return value;
                    }

                    @Override // kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite.Builder
                    public final kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Annotation.Argument.Value.Builder mergeFrom(kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Annotation.Argument.Value value) {
                        if (value == kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Annotation.Argument.Value.getDefaultInstance()) {
                            return this;
                        }
                        if (value.hasType()) {
                            setType(value.getType());
                        }
                        if (value.hasIntValue()) {
                            setIntValue(value.getIntValue());
                        }
                        if (value.hasFloatValue()) {
                            setFloatValue(value.getFloatValue());
                        }
                        if (value.hasDoubleValue()) {
                            setDoubleValue(value.getDoubleValue());
                        }
                        if (value.hasStringValue()) {
                            setStringValue(value.getStringValue());
                        }
                        if (value.hasClassId()) {
                            setClassId(value.getClassId());
                        }
                        if (value.hasEnumValueId()) {
                            setEnumValueId(value.getEnumValueId());
                        }
                        if (value.hasAnnotation()) {
                            mergeAnnotation(value.getAnnotation());
                        }
                        if (!value.getHighSpeedVideoSizes.isEmpty()) {
                            if (this.getHighSpeedVideoFpsRanges.isEmpty()) {
                                this.getHighSpeedVideoFpsRanges = value.getHighSpeedVideoSizes;
                                this.getHighSpeedVideoFpsRangesFor &= -257;
                            } else {
                                Camera2StreamConfigurationMap();
                                this.getHighSpeedVideoFpsRanges.addAll(value.getHighSpeedVideoSizes);
                            }
                        }
                        if (value.hasArrayDimensionCount()) {
                            setArrayDimensionCount(value.getArrayDimensionCount());
                        }
                        if (value.hasFlags()) {
                            setFlags(value.getFlags());
                        }
                        setUnknownFields(getUnknownFields().concat(value.isOutputSupportedForhNQ4ISI));
                        return this;
                    }

                    @Override // kotlin.reflect.jvm.internal.impl.protobuf.MessageLiteOrBuilder
                    public final boolean isInitialized() {
                        if (hasAnnotation() && !getAnnotation().isInitialized()) {
                            return false;
                        }
                        for (int i = 0; i < getArrayElementCount(); i++) {
                            if (!getArrayElement(i).isInitialized()) {
                                return false;
                            }
                        }
                        return true;
                    }

                    /* JADX WARN: Removed duplicated region for block: B:15:0x001d  */
                    @Override // kotlin.reflect.jvm.internal.impl.protobuf.AbstractMessageLite.Builder, kotlin.reflect.jvm.internal.impl.protobuf.MessageLite.Builder
                    /*
                        Code decompiled incorrectly, please refer to instructions dump.
                    */
                    public final kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Annotation.Argument.Value.Builder mergeFrom(kotlin.reflect.jvm.internal.impl.protobuf.CodedInputStream codedInputStream, kotlin.reflect.jvm.internal.impl.protobuf.ExtensionRegistryLite extensionRegistryLite) throws java.io.IOException {
                        kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Annotation.Argument.Value value;
                        try {
                            try {
                                kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Annotation.Argument.Value parsePartialFrom = kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Annotation.Argument.Value.PARSER.parsePartialFrom(codedInputStream, extensionRegistryLite);
                                if (parsePartialFrom != null) {
                                    mergeFrom(parsePartialFrom);
                                }
                                return this;
                            } catch (kotlin.reflect.jvm.internal.impl.protobuf.InvalidProtocolBufferException e) {
                                value = (kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Annotation.Argument.Value) e.getUnfinishedMessage();
                                try {
                                    throw e;
                                } catch (java.lang.Throwable th) {
                                    th = th;
                                    if (value != null) {
                                        mergeFrom(value);
                                    }
                                    throw th;
                                }
                            }
                        } catch (java.lang.Throwable th2) {
                            th = th2;
                            value = null;
                            if (value != null) {
                            }
                            throw th;
                        }
                    }

                    public final kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Annotation.Argument.Value.Builder setType(kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Annotation.Argument.Value.Type type) {
                        this.getHighSpeedVideoFpsRangesFor |= 1;
                        this.getOutputStallDurationlomOqCM = type;
                        return this;
                    }

                    public final kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Annotation.Argument.Value.Builder setIntValue(long j) {
                        this.getHighSpeedVideoFpsRangesFor |= 2;
                        this.getOutputMinFrameDuration = j;
                        return this;
                    }

                    public final kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Annotation.Argument.Value.Builder setFloatValue(float f) {
                        this.getHighSpeedVideoFpsRangesFor |= 4;
                        this.getOutputFormats = f;
                        return this;
                    }

                    public final kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Annotation.Argument.Value.Builder setDoubleValue(double d) {
                        this.getHighSpeedVideoFpsRangesFor |= 8;
                        this.getHighSpeedVideoSizesFor = d;
                        return this;
                    }

                    public final kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Annotation.Argument.Value.Builder setStringValue(int i) {
                        this.getHighSpeedVideoFpsRangesFor |= 16;
                        this.getOutputStallDuration = i;
                        return this;
                    }

                    public final kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Annotation.Argument.Value.Builder setClassId(int i) {
                        this.getHighSpeedVideoFpsRangesFor |= 32;
                        this.getHighResolutionOutputSizeshNQ4ISI = i;
                        return this;
                    }

                    public final kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Annotation.Argument.Value.Builder setEnumValueId(int i) {
                        this.getHighSpeedVideoFpsRangesFor |= 64;
                        this.getInputSizeshNQ4ISI = i;
                        return this;
                    }

                    public final boolean hasAnnotation() {
                        return (this.getHighSpeedVideoFpsRangesFor & 128) == 128;
                    }

                    public final kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Annotation getAnnotation() {
                        return this.getHighSpeedVideoSizes;
                    }

                    public final kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Annotation.Argument.Value.Builder setAnnotation(kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Annotation annotation) {
                        this.getHighSpeedVideoSizes = annotation;
                        this.getHighSpeedVideoFpsRangesFor |= 128;
                        return this;
                    }

                    public final kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Annotation.Argument.Value.Builder mergeAnnotation(kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Annotation annotation) {
                        if ((this.getHighSpeedVideoFpsRangesFor & 128) == 128 && this.getHighSpeedVideoSizes != kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Annotation.getDefaultInstance()) {
                            this.getHighSpeedVideoSizes = kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Annotation.newBuilder(this.getHighSpeedVideoSizes).mergeFrom(annotation).buildPartial();
                        } else {
                            this.getHighSpeedVideoSizes = annotation;
                        }
                        this.getHighSpeedVideoFpsRangesFor |= 128;
                        return this;
                    }

                    private void Camera2StreamConfigurationMap() {
                        if ((this.getHighSpeedVideoFpsRangesFor & 256) != 256) {
                            this.getHighSpeedVideoFpsRanges = new java.util.ArrayList(this.getHighSpeedVideoFpsRanges);
                            this.getHighSpeedVideoFpsRangesFor |= 256;
                        }
                    }

                    public final int getArrayElementCount() {
                        return this.getHighSpeedVideoFpsRanges.size();
                    }

                    public final kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Annotation.Argument.Value getArrayElement(int i) {
                        return this.getHighSpeedVideoFpsRanges.get(i);
                    }

                    public final kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Annotation.Argument.Value.Builder addArrayElement(kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Annotation.Argument.Value.Builder builder) {
                        Camera2StreamConfigurationMap();
                        this.getHighSpeedVideoFpsRanges.add(builder.build());
                        return this;
                    }

                    public final kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Annotation.Argument.Value.Builder setArrayDimensionCount(int i) {
                        this.getHighSpeedVideoFpsRangesFor |= 512;
                        this.Camera2StreamConfigurationMap = i;
                        return this;
                    }

                    public final kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Annotation.Argument.Value.Builder setFlags(int i) {
                        this.getHighSpeedVideoFpsRangesFor |= 1024;
                        this.getInputFormats = i;
                        return this;
                    }

                    static /* synthetic */ kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Annotation.Argument.Value.Builder getHighResolutionOutputSizeshNQ4ISI() {
                        return new kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Annotation.Argument.Value.Builder();
                    }

                    @Override // kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite.Builder, kotlin.reflect.jvm.internal.impl.protobuf.AbstractMessageLite.Builder
                    /* renamed from: clone */
                    public final kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Annotation.Argument.Value.Builder mo23897clone() {
                        return new kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Annotation.Argument.Value.Builder().mergeFrom(buildPartial());
                    }
                }
            }

            public final boolean hasNameId() {
                return (this.getHighSpeedVideoFpsRangesFor & 1) == 1;
            }

            public final int getNameId() {
                return this.getHighSpeedVideoFpsRanges;
            }

            public final boolean hasValue() {
                return (this.getHighSpeedVideoFpsRangesFor & 2) == 2;
            }

            public final kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Annotation.Argument.Value getValue() {
                return this.getOutputFormats;
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.MessageLiteOrBuilder
            public final boolean isInitialized() {
                byte b = this.getHighResolutionOutputSizeshNQ4ISI;
                if (b == 1) {
                    return true;
                }
                if (b == 0) {
                    return false;
                }
                if (!hasNameId()) {
                    this.getHighResolutionOutputSizeshNQ4ISI = (byte) 0;
                    return false;
                }
                if (!hasValue()) {
                    this.getHighResolutionOutputSizeshNQ4ISI = (byte) 0;
                    return false;
                }
                if (!getValue().isInitialized()) {
                    this.getHighResolutionOutputSizeshNQ4ISI = (byte) 0;
                    return false;
                }
                this.getHighResolutionOutputSizeshNQ4ISI = (byte) 1;
                return true;
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.MessageLite
            public final void writeTo(kotlin.reflect.jvm.internal.impl.protobuf.CodedOutputStream codedOutputStream) throws java.io.IOException {
                getSerializedSize();
                if ((this.getHighSpeedVideoFpsRangesFor & 1) == 1) {
                    codedOutputStream.writeInt32(1, this.getHighSpeedVideoFpsRanges);
                }
                if ((this.getHighSpeedVideoFpsRangesFor & 2) == 2) {
                    codedOutputStream.writeMessage(2, this.getOutputFormats);
                }
                codedOutputStream.writeRawBytes(this.getInputFormats);
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.MessageLite
            public final int getSerializedSize() {
                int i = this.getHighSpeedVideoSizes;
                if (i != -1) {
                    return i;
                }
                int computeInt32Size = (this.getHighSpeedVideoFpsRangesFor & 1) == 1 ? kotlin.reflect.jvm.internal.impl.protobuf.CodedOutputStream.computeInt32Size(1, this.getHighSpeedVideoFpsRanges) : 0;
                if ((this.getHighSpeedVideoFpsRangesFor & 2) == 2) {
                    computeInt32Size += kotlin.reflect.jvm.internal.impl.protobuf.CodedOutputStream.computeMessageSize(2, this.getOutputFormats);
                }
                int size = computeInt32Size + this.getInputFormats.size();
                this.getHighSpeedVideoSizes = size;
                return size;
            }

            public static kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Annotation.Argument.Builder newBuilder() {
                return kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Annotation.Argument.Builder.getHighSpeedVideoFpsRanges();
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.MessageLite
            public final kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Annotation.Argument.Builder newBuilderForType() {
                return newBuilder();
            }

            public static kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Annotation.Argument.Builder newBuilder(kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Annotation.Argument argument) {
                return newBuilder().mergeFrom(argument);
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.MessageLite
            public final kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Annotation.Argument.Builder toBuilder() {
                return newBuilder(this);
            }

            public static final class Builder extends kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite.Builder<kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Annotation.Argument, kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Annotation.Argument.Builder> implements kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Annotation.ArgumentOrBuilder {
                private kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Annotation.Argument.Value getHighResolutionOutputSizeshNQ4ISI = kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Annotation.Argument.Value.getDefaultInstance();
                private int getHighSpeedVideoFpsRangesFor;
                private int getHighSpeedVideoSizes;

                private Builder() {
                }

                @Override // kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite.Builder, kotlin.reflect.jvm.internal.impl.protobuf.MessageLiteOrBuilder
                public final kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Annotation.Argument getDefaultInstanceForType() {
                    return kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Annotation.Argument.getDefaultInstance();
                }

                @Override // kotlin.reflect.jvm.internal.impl.protobuf.MessageLite.Builder
                public final kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Annotation.Argument build() {
                    kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Annotation.Argument buildPartial = buildPartial();
                    if (buildPartial.isInitialized()) {
                        return buildPartial;
                    }
                    throw newUninitializedMessageException(buildPartial);
                }

                /* JADX WARN: Multi-variable type inference failed */
                public final kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Annotation.Argument buildPartial() {
                    kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Annotation.Argument argument = new kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Annotation.Argument((kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite.Builder) this, (byte) (0 == true ? 1 : 0));
                    int i = this.getHighSpeedVideoSizes;
                    int i2 = (i & 1) == 1 ? 1 : 0;
                    argument.getHighSpeedVideoFpsRanges = this.getHighSpeedVideoFpsRangesFor;
                    if ((i & 2) == 2) {
                        i2 |= 2;
                    }
                    argument.getOutputFormats = this.getHighResolutionOutputSizeshNQ4ISI;
                    argument.getHighSpeedVideoFpsRangesFor = i2;
                    return argument;
                }

                @Override // kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite.Builder
                public final kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Annotation.Argument.Builder mergeFrom(kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Annotation.Argument argument) {
                    if (argument == kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Annotation.Argument.getDefaultInstance()) {
                        return this;
                    }
                    if (argument.hasNameId()) {
                        setNameId(argument.getNameId());
                    }
                    if (argument.hasValue()) {
                        mergeValue(argument.getValue());
                    }
                    setUnknownFields(getUnknownFields().concat(argument.getInputFormats));
                    return this;
                }

                @Override // kotlin.reflect.jvm.internal.impl.protobuf.MessageLiteOrBuilder
                public final boolean isInitialized() {
                    return hasNameId() && hasValue() && getValue().isInitialized();
                }

                /* JADX WARN: Removed duplicated region for block: B:15:0x001d  */
                @Override // kotlin.reflect.jvm.internal.impl.protobuf.AbstractMessageLite.Builder, kotlin.reflect.jvm.internal.impl.protobuf.MessageLite.Builder
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                */
                public final kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Annotation.Argument.Builder mergeFrom(kotlin.reflect.jvm.internal.impl.protobuf.CodedInputStream codedInputStream, kotlin.reflect.jvm.internal.impl.protobuf.ExtensionRegistryLite extensionRegistryLite) throws java.io.IOException {
                    kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Annotation.Argument argument;
                    try {
                        try {
                            kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Annotation.Argument parsePartialFrom = kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Annotation.Argument.PARSER.parsePartialFrom(codedInputStream, extensionRegistryLite);
                            if (parsePartialFrom != null) {
                                mergeFrom(parsePartialFrom);
                            }
                            return this;
                        } catch (kotlin.reflect.jvm.internal.impl.protobuf.InvalidProtocolBufferException e) {
                            argument = (kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Annotation.Argument) e.getUnfinishedMessage();
                            try {
                                throw e;
                            } catch (java.lang.Throwable th) {
                                th = th;
                                if (argument != null) {
                                    mergeFrom(argument);
                                }
                                throw th;
                            }
                        }
                    } catch (java.lang.Throwable th2) {
                        th = th2;
                        argument = null;
                        if (argument != null) {
                        }
                        throw th;
                    }
                }

                public final boolean hasNameId() {
                    return (this.getHighSpeedVideoSizes & 1) == 1;
                }

                public final kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Annotation.Argument.Builder setNameId(int i) {
                    this.getHighSpeedVideoSizes |= 1;
                    this.getHighSpeedVideoFpsRangesFor = i;
                    return this;
                }

                public final boolean hasValue() {
                    return (this.getHighSpeedVideoSizes & 2) == 2;
                }

                public final kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Annotation.Argument.Value getValue() {
                    return this.getHighResolutionOutputSizeshNQ4ISI;
                }

                public final kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Annotation.Argument.Builder setValue(kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Annotation.Argument.Value value) {
                    this.getHighResolutionOutputSizeshNQ4ISI = value;
                    this.getHighSpeedVideoSizes |= 2;
                    return this;
                }

                public final kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Annotation.Argument.Builder mergeValue(kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Annotation.Argument.Value value) {
                    if ((this.getHighSpeedVideoSizes & 2) == 2 && this.getHighResolutionOutputSizeshNQ4ISI != kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Annotation.Argument.Value.getDefaultInstance()) {
                        this.getHighResolutionOutputSizeshNQ4ISI = kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Annotation.Argument.Value.newBuilder(this.getHighResolutionOutputSizeshNQ4ISI).mergeFrom(value).buildPartial();
                    } else {
                        this.getHighResolutionOutputSizeshNQ4ISI = value;
                    }
                    this.getHighSpeedVideoSizes |= 2;
                    return this;
                }

                static /* synthetic */ kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Annotation.Argument.Builder getHighSpeedVideoFpsRanges() {
                    return new kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Annotation.Argument.Builder();
                }

                @Override // kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite.Builder, kotlin.reflect.jvm.internal.impl.protobuf.AbstractMessageLite.Builder
                /* renamed from: clone, reason: merged with bridge method [inline-methods] */
                public final kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Annotation.Argument.Builder mo23897clone() {
                    return new kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Annotation.Argument.Builder().mergeFrom(buildPartial());
                }
            }
        }

        public final boolean hasId() {
            return (this.getHighSpeedVideoSizes & 1) == 1;
        }

        public final int getId() {
            return this.getHighSpeedVideoFpsRanges;
        }

        public final java.util.List<kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Annotation.Argument> getArgumentList() {
            return this.Camera2StreamConfigurationMap;
        }

        public final int getArgumentCount() {
            return this.Camera2StreamConfigurationMap.size();
        }

        public final kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Annotation.Argument getArgument(int i) {
            return this.Camera2StreamConfigurationMap.get(i);
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.MessageLiteOrBuilder
        public final boolean isInitialized() {
            byte b = this.getHighResolutionOutputSizeshNQ4ISI;
            if (b == 1) {
                return true;
            }
            if (b == 0) {
                return false;
            }
            if (!hasId()) {
                this.getHighResolutionOutputSizeshNQ4ISI = (byte) 0;
                return false;
            }
            for (int i = 0; i < getArgumentCount(); i++) {
                if (!getArgument(i).isInitialized()) {
                    this.getHighResolutionOutputSizeshNQ4ISI = (byte) 0;
                    return false;
                }
            }
            this.getHighResolutionOutputSizeshNQ4ISI = (byte) 1;
            return true;
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.MessageLite
        public final void writeTo(kotlin.reflect.jvm.internal.impl.protobuf.CodedOutputStream codedOutputStream) throws java.io.IOException {
            getSerializedSize();
            if ((this.getHighSpeedVideoSizes & 1) == 1) {
                codedOutputStream.writeInt32(1, this.getHighSpeedVideoFpsRanges);
            }
            for (int i = 0; i < this.Camera2StreamConfigurationMap.size(); i++) {
                codedOutputStream.writeMessage(2, this.Camera2StreamConfigurationMap.get(i));
            }
            codedOutputStream.writeRawBytes(this.getOutputMinFrameDuration);
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.MessageLite
        public final int getSerializedSize() {
            int i = this.getOutputFormats;
            if (i != -1) {
                return i;
            }
            int computeInt32Size = (this.getHighSpeedVideoSizes & 1) == 1 ? kotlin.reflect.jvm.internal.impl.protobuf.CodedOutputStream.computeInt32Size(1, this.getHighSpeedVideoFpsRanges) : 0;
            for (int i2 = 0; i2 < this.Camera2StreamConfigurationMap.size(); i2++) {
                computeInt32Size += kotlin.reflect.jvm.internal.impl.protobuf.CodedOutputStream.computeMessageSize(2, this.Camera2StreamConfigurationMap.get(i2));
            }
            int size = computeInt32Size + this.getOutputMinFrameDuration.size();
            this.getOutputFormats = size;
            return size;
        }

        public static kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Annotation.Builder newBuilder() {
            return kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Annotation.Builder.getHighResolutionOutputSizeshNQ4ISI();
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.MessageLite
        public final kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Annotation.Builder newBuilderForType() {
            return newBuilder();
        }

        public static kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Annotation.Builder newBuilder(kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Annotation annotation) {
            return newBuilder().mergeFrom(annotation);
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.MessageLite
        public final kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Annotation.Builder toBuilder() {
            return newBuilder(this);
        }

        public static final class Builder extends kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite.Builder<kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Annotation, kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Annotation.Builder> implements kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.AnnotationOrBuilder {
            private int getHighResolutionOutputSizeshNQ4ISI;
            private java.util.List<kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Annotation.Argument> getHighSpeedVideoFpsRangesFor = java.util.Collections.emptyList();
            private int getHighSpeedVideoSizes;

            private Builder() {
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite.Builder, kotlin.reflect.jvm.internal.impl.protobuf.MessageLiteOrBuilder
            public final kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Annotation getDefaultInstanceForType() {
                return kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Annotation.getDefaultInstance();
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.MessageLite.Builder
            public final kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Annotation build() {
                kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Annotation buildPartial = buildPartial();
                if (buildPartial.isInitialized()) {
                    return buildPartial;
                }
                throw newUninitializedMessageException(buildPartial);
            }

            public final kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Annotation buildPartial() {
                kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Annotation annotation = new kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Annotation((kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite.Builder) this, (byte) 0);
                byte b = (this.getHighResolutionOutputSizeshNQ4ISI & 1) == 1 ? (byte) 1 : (byte) 0;
                annotation.getHighSpeedVideoFpsRanges = this.getHighSpeedVideoSizes;
                if ((this.getHighResolutionOutputSizeshNQ4ISI & 2) == 2) {
                    this.getHighSpeedVideoFpsRangesFor = java.util.Collections.unmodifiableList(this.getHighSpeedVideoFpsRangesFor);
                    this.getHighResolutionOutputSizeshNQ4ISI &= -3;
                }
                annotation.Camera2StreamConfigurationMap = this.getHighSpeedVideoFpsRangesFor;
                annotation.getHighSpeedVideoSizes = b;
                return annotation;
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite.Builder
            public final kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Annotation.Builder mergeFrom(kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Annotation annotation) {
                if (annotation == kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Annotation.getDefaultInstance()) {
                    return this;
                }
                if (annotation.hasId()) {
                    setId(annotation.getId());
                }
                if (!annotation.Camera2StreamConfigurationMap.isEmpty()) {
                    if (this.getHighSpeedVideoFpsRangesFor.isEmpty()) {
                        this.getHighSpeedVideoFpsRangesFor = annotation.Camera2StreamConfigurationMap;
                        this.getHighResolutionOutputSizeshNQ4ISI &= -3;
                    } else {
                        getHighSpeedVideoSizes();
                        this.getHighSpeedVideoFpsRangesFor.addAll(annotation.Camera2StreamConfigurationMap);
                    }
                }
                setUnknownFields(getUnknownFields().concat(annotation.getOutputMinFrameDuration));
                return this;
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.MessageLiteOrBuilder
            public final boolean isInitialized() {
                if (!hasId()) {
                    return false;
                }
                for (int i = 0; i < getArgumentCount(); i++) {
                    if (!getArgument(i).isInitialized()) {
                        return false;
                    }
                }
                return true;
            }

            /* JADX WARN: Removed duplicated region for block: B:15:0x001d  */
            @Override // kotlin.reflect.jvm.internal.impl.protobuf.AbstractMessageLite.Builder, kotlin.reflect.jvm.internal.impl.protobuf.MessageLite.Builder
            /*
                Code decompiled incorrectly, please refer to instructions dump.
            */
            public final kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Annotation.Builder mergeFrom(kotlin.reflect.jvm.internal.impl.protobuf.CodedInputStream codedInputStream, kotlin.reflect.jvm.internal.impl.protobuf.ExtensionRegistryLite extensionRegistryLite) throws java.io.IOException {
                kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Annotation annotation;
                try {
                    try {
                        kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Annotation parsePartialFrom = kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Annotation.PARSER.parsePartialFrom(codedInputStream, extensionRegistryLite);
                        if (parsePartialFrom != null) {
                            mergeFrom(parsePartialFrom);
                        }
                        return this;
                    } catch (kotlin.reflect.jvm.internal.impl.protobuf.InvalidProtocolBufferException e) {
                        annotation = (kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Annotation) e.getUnfinishedMessage();
                        try {
                            throw e;
                        } catch (java.lang.Throwable th) {
                            th = th;
                            if (annotation != null) {
                                mergeFrom(annotation);
                            }
                            throw th;
                        }
                    }
                } catch (java.lang.Throwable th2) {
                    th = th2;
                    annotation = null;
                    if (annotation != null) {
                    }
                    throw th;
                }
            }

            public final boolean hasId() {
                return (this.getHighResolutionOutputSizeshNQ4ISI & 1) == 1;
            }

            public final kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Annotation.Builder setId(int i) {
                this.getHighResolutionOutputSizeshNQ4ISI |= 1;
                this.getHighSpeedVideoSizes = i;
                return this;
            }

            private void getHighSpeedVideoSizes() {
                if ((this.getHighResolutionOutputSizeshNQ4ISI & 2) != 2) {
                    this.getHighSpeedVideoFpsRangesFor = new java.util.ArrayList(this.getHighSpeedVideoFpsRangesFor);
                    this.getHighResolutionOutputSizeshNQ4ISI |= 2;
                }
            }

            public final int getArgumentCount() {
                return this.getHighSpeedVideoFpsRangesFor.size();
            }

            public final kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Annotation.Argument getArgument(int i) {
                return this.getHighSpeedVideoFpsRangesFor.get(i);
            }

            public final kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Annotation.Builder addArgument(kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Annotation.Argument.Builder builder) {
                getHighSpeedVideoSizes();
                this.getHighSpeedVideoFpsRangesFor.add(builder.build());
                return this;
            }

            static /* synthetic */ kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Annotation.Builder getHighResolutionOutputSizeshNQ4ISI() {
                return new kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Annotation.Builder();
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite.Builder, kotlin.reflect.jvm.internal.impl.protobuf.AbstractMessageLite.Builder
            /* renamed from: clone */
            public final kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Annotation.Builder mo23897clone() {
                return new kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Annotation.Builder().mergeFrom(buildPartial());
            }
        }
    }

    public static final class Type extends kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite.ExtendableMessage<kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Type> implements kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.TypeOrBuilder {
        public static kotlin.reflect.jvm.internal.impl.protobuf.Parser<kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Type> PARSER = new kotlin.reflect.jvm.internal.impl.protobuf.AbstractParser<kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Type>() { // from class: kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Type.1
            @Override // kotlin.reflect.jvm.internal.impl.protobuf.Parser
            public final /* synthetic */ java.lang.Object parsePartialFrom(kotlin.reflect.jvm.internal.impl.protobuf.CodedInputStream codedInputStream, kotlin.reflect.jvm.internal.impl.protobuf.ExtensionRegistryLite extensionRegistryLite) throws kotlin.reflect.jvm.internal.impl.protobuf.InvalidProtocolBufferException {
                return new kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Type(codedInputStream, extensionRegistryLite, (byte) 0);
            }
        };
        private static final kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Type getHighSpeedVideoFpsRangesFor;
        private java.util.List<kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Type.Argument> Camera2StreamConfigurationMap;
        private int getHighResolutionOutputSizeshNQ4ISI;
        private kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Type getHighSpeedVideoFpsRanges;
        private java.util.List<kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Annotation> getHighSpeedVideoSizes;
        private int getHighSpeedVideoSizesFor;
        private int getInputFormats;
        private int getInputSizeshNQ4ISI;
        private int getOutputFormats;
        private int getOutputMinFrameDuration;
        private byte getOutputMinFrameDurationlomOqCM;
        private int getOutputSizes;
        private boolean getOutputSizeshNQ4ISI;
        private int getOutputStallDuration;
        private kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Type getOutputStallDurationlomOqCM;
        private int getValidOutputFormatsForInputhNQ4ISI;
        private final kotlin.reflect.jvm.internal.impl.protobuf.ByteString isOutputSupportedFor;
        private int isOutputSupportedForhNQ4ISI;
        private int toString;
        private kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Type unwrapAs;

        public interface ArgumentOrBuilder extends kotlin.reflect.jvm.internal.impl.protobuf.MessageLiteOrBuilder {
        }

        /* synthetic */ Type(kotlin.reflect.jvm.internal.impl.protobuf.CodedInputStream codedInputStream, kotlin.reflect.jvm.internal.impl.protobuf.ExtensionRegistryLite extensionRegistryLite, byte b) throws kotlin.reflect.jvm.internal.impl.protobuf.InvalidProtocolBufferException {
            this(codedInputStream, extensionRegistryLite);
        }

        /* synthetic */ Type(kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite.ExtendableBuilder extendableBuilder, byte b) {
            this(extendableBuilder);
        }

        private Type(kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite.ExtendableBuilder<kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Type, ?> extendableBuilder) {
            super(extendableBuilder);
            this.getOutputMinFrameDurationlomOqCM = (byte) -1;
            this.getOutputSizes = -1;
            this.isOutputSupportedFor = extendableBuilder.getUnknownFields();
        }

        private Type() {
            this.getOutputMinFrameDurationlomOqCM = (byte) -1;
            this.getOutputSizes = -1;
            this.isOutputSupportedFor = kotlin.reflect.jvm.internal.impl.protobuf.ByteString.EMPTY;
        }

        public static kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Type getDefaultInstance() {
            return getHighSpeedVideoFpsRangesFor;
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.MessageLiteOrBuilder
        public final kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Type getDefaultInstanceForType() {
            return getHighSpeedVideoFpsRangesFor;
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r5v0 */
        /* JADX WARN: Type inference failed for: r5v1 */
        /* JADX WARN: Type inference failed for: r5v2, types: [boolean] */
        private Type(kotlin.reflect.jvm.internal.impl.protobuf.CodedInputStream codedInputStream, kotlin.reflect.jvm.internal.impl.protobuf.ExtensionRegistryLite extensionRegistryLite) throws kotlin.reflect.jvm.internal.impl.protobuf.InvalidProtocolBufferException {
            kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Type.Builder builder;
            this.getOutputMinFrameDurationlomOqCM = (byte) -1;
            this.getOutputSizes = -1;
            getHighResolutionOutputSizeshNQ4ISI();
            kotlin.reflect.jvm.internal.impl.protobuf.ByteString.Output newOutput = kotlin.reflect.jvm.internal.impl.protobuf.ByteString.newOutput();
            kotlin.reflect.jvm.internal.impl.protobuf.CodedOutputStream newInstance = kotlin.reflect.jvm.internal.impl.protobuf.CodedOutputStream.newInstance(newOutput, 1);
            boolean z = false;
            int i = 0;
            while (true) {
                ?? r5 = 16384;
                if (z) {
                    if ((i & 1) == 1) {
                        this.Camera2StreamConfigurationMap = java.util.Collections.unmodifiableList(this.Camera2StreamConfigurationMap);
                    }
                    if ((i & 16384) == 16384) {
                        this.getHighSpeedVideoSizes = java.util.Collections.unmodifiableList(this.getHighSpeedVideoSizes);
                    }
                    try {
                        newInstance.flush();
                    } catch (java.io.IOException unused) {
                    } catch (java.lang.Throwable th) {
                        this.isOutputSupportedFor = newOutput.toByteString();
                        throw th;
                    }
                    this.isOutputSupportedFor = newOutput.toByteString();
                    makeExtensionsImmutable();
                    return;
                }
                try {
                    try {
                        try {
                            int readTag = codedInputStream.readTag();
                            switch (readTag) {
                                case 0:
                                    z = true;
                                case 8:
                                    this.getInputSizeshNQ4ISI |= 4096;
                                    this.getHighSpeedVideoSizesFor = codedInputStream.readInt32();
                                case 18:
                                    if ((i & 1) != 1) {
                                        this.Camera2StreamConfigurationMap = new java.util.ArrayList();
                                        i |= 1;
                                    }
                                    this.Camera2StreamConfigurationMap.add(codedInputStream.readMessage(kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Type.Argument.PARSER, extensionRegistryLite));
                                case 24:
                                    this.getInputSizeshNQ4ISI |= 1;
                                    this.getOutputSizeshNQ4ISI = codedInputStream.readBool();
                                case 32:
                                    this.getInputSizeshNQ4ISI |= 2;
                                    this.getOutputFormats = codedInputStream.readInt32();
                                case 42:
                                    builder = (this.getInputSizeshNQ4ISI & 4) == 4 ? this.getOutputStallDurationlomOqCM.toBuilder() : null;
                                    kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Type type = (kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Type) codedInputStream.readMessage(PARSER, extensionRegistryLite);
                                    this.getOutputStallDurationlomOqCM = type;
                                    if (builder != null) {
                                        builder.mergeFrom(type);
                                        this.getOutputStallDurationlomOqCM = builder.buildPartial();
                                    }
                                    this.getInputSizeshNQ4ISI |= 4;
                                case 48:
                                    this.getInputSizeshNQ4ISI |= 16;
                                    this.getOutputMinFrameDuration = codedInputStream.readInt32();
                                case 56:
                                    this.getInputSizeshNQ4ISI |= 32;
                                    this.toString = codedInputStream.readInt32();
                                case 64:
                                    this.getInputSizeshNQ4ISI |= 8;
                                    this.getInputFormats = codedInputStream.readInt32();
                                case 72:
                                    this.getInputSizeshNQ4ISI |= 64;
                                    this.getValidOutputFormatsForInputhNQ4ISI = codedInputStream.readInt32();
                                case 82:
                                    builder = (this.getInputSizeshNQ4ISI & 256) == 256 ? this.unwrapAs.toBuilder() : null;
                                    kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Type type2 = (kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Type) codedInputStream.readMessage(PARSER, extensionRegistryLite);
                                    this.unwrapAs = type2;
                                    if (builder != null) {
                                        builder.mergeFrom(type2);
                                        this.unwrapAs = builder.buildPartial();
                                    }
                                    this.getInputSizeshNQ4ISI |= 256;
                                case 88:
                                    this.getInputSizeshNQ4ISI |= 512;
                                    this.getOutputStallDuration = codedInputStream.readInt32();
                                case 96:
                                    this.getInputSizeshNQ4ISI |= 128;
                                    this.isOutputSupportedForhNQ4ISI = codedInputStream.readInt32();
                                case 106:
                                    builder = (this.getInputSizeshNQ4ISI & 1024) == 1024 ? this.getHighSpeedVideoFpsRanges.toBuilder() : null;
                                    kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Type type3 = (kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Type) codedInputStream.readMessage(PARSER, extensionRegistryLite);
                                    this.getHighSpeedVideoFpsRanges = type3;
                                    if (builder != null) {
                                        builder.mergeFrom(type3);
                                        this.getHighSpeedVideoFpsRanges = builder.buildPartial();
                                    }
                                    this.getInputSizeshNQ4ISI |= 1024;
                                case 112:
                                    this.getInputSizeshNQ4ISI |= 2048;
                                    this.getHighResolutionOutputSizeshNQ4ISI = codedInputStream.readInt32();
                                case 802:
                                    if ((i & 16384) != 16384) {
                                        this.getHighSpeedVideoSizes = new java.util.ArrayList();
                                        i |= 16384;
                                    }
                                    this.getHighSpeedVideoSizes.add(codedInputStream.readMessage(kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Annotation.PARSER, extensionRegistryLite));
                                default:
                                    r5 = parseUnknownField(codedInputStream, newInstance, extensionRegistryLite, readTag);
                                    if (r5 == 0) {
                                        z = true;
                                    }
                            }
                        } catch (java.io.IOException e) {
                            throw new kotlin.reflect.jvm.internal.impl.protobuf.InvalidProtocolBufferException(e.getMessage()).setUnfinishedMessage(this);
                        }
                    } catch (kotlin.reflect.jvm.internal.impl.protobuf.InvalidProtocolBufferException e2) {
                        throw e2.setUnfinishedMessage(this);
                    }
                } catch (java.lang.Throwable th2) {
                    if ((i & 1) == 1) {
                        this.Camera2StreamConfigurationMap = java.util.Collections.unmodifiableList(this.Camera2StreamConfigurationMap);
                    }
                    if ((i & 16384) == r5) {
                        this.getHighSpeedVideoSizes = java.util.Collections.unmodifiableList(this.getHighSpeedVideoSizes);
                    }
                    try {
                        newInstance.flush();
                    } catch (java.io.IOException unused2) {
                    } catch (java.lang.Throwable th3) {
                        this.isOutputSupportedFor = newOutput.toByteString();
                        throw th3;
                    }
                    this.isOutputSupportedFor = newOutput.toByteString();
                    makeExtensionsImmutable();
                    throw th2;
                }
            }
        }

        static {
            kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Type type = new kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Type();
            getHighSpeedVideoFpsRangesFor = type;
            type.getHighResolutionOutputSizeshNQ4ISI();
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite, kotlin.reflect.jvm.internal.impl.protobuf.MessageLite
        public final kotlin.reflect.jvm.internal.impl.protobuf.Parser<kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Type> getParserForType() {
            return PARSER;
        }

        public static final class Argument extends kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite implements kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Type.ArgumentOrBuilder {
            public static kotlin.reflect.jvm.internal.impl.protobuf.Parser<kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Type.Argument> PARSER = new kotlin.reflect.jvm.internal.impl.protobuf.AbstractParser<kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Type.Argument>() { // from class: kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Type.Argument.1
                @Override // kotlin.reflect.jvm.internal.impl.protobuf.Parser
                public final /* synthetic */ java.lang.Object parsePartialFrom(kotlin.reflect.jvm.internal.impl.protobuf.CodedInputStream codedInputStream, kotlin.reflect.jvm.internal.impl.protobuf.ExtensionRegistryLite extensionRegistryLite) throws kotlin.reflect.jvm.internal.impl.protobuf.InvalidProtocolBufferException {
                    return new kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Type.Argument(codedInputStream, extensionRegistryLite, (byte) 0);
                }
            };
            private static final kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Type.Argument getHighResolutionOutputSizeshNQ4ISI;
            private kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Type.Argument.Projection Camera2StreamConfigurationMap;
            private int getHighSpeedVideoFpsRanges;
            private byte getHighSpeedVideoFpsRangesFor;
            private int getHighSpeedVideoSizes;
            private kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Type getHighSpeedVideoSizesFor;
            private final kotlin.reflect.jvm.internal.impl.protobuf.ByteString getOutputFormats;
            private int getOutputMinFrameDuration;

            /* synthetic */ Argument(kotlin.reflect.jvm.internal.impl.protobuf.CodedInputStream codedInputStream, kotlin.reflect.jvm.internal.impl.protobuf.ExtensionRegistryLite extensionRegistryLite, byte b) throws kotlin.reflect.jvm.internal.impl.protobuf.InvalidProtocolBufferException {
                this(codedInputStream, extensionRegistryLite);
            }

            /* synthetic */ Argument(kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite.Builder builder, byte b) {
                this(builder);
            }

            private Argument(kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite.Builder builder) {
                super(builder);
                this.getHighSpeedVideoFpsRangesFor = (byte) -1;
                this.getHighSpeedVideoFpsRanges = -1;
                this.getOutputFormats = builder.getUnknownFields();
            }

            private Argument() {
                this.getHighSpeedVideoFpsRangesFor = (byte) -1;
                this.getHighSpeedVideoFpsRanges = -1;
                this.getOutputFormats = kotlin.reflect.jvm.internal.impl.protobuf.ByteString.EMPTY;
            }

            public static kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Type.Argument getDefaultInstance() {
                return getHighResolutionOutputSizeshNQ4ISI;
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.MessageLiteOrBuilder
            public final kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Type.Argument getDefaultInstanceForType() {
                return getHighResolutionOutputSizeshNQ4ISI;
            }

            private Argument(kotlin.reflect.jvm.internal.impl.protobuf.CodedInputStream codedInputStream, kotlin.reflect.jvm.internal.impl.protobuf.ExtensionRegistryLite extensionRegistryLite) throws kotlin.reflect.jvm.internal.impl.protobuf.InvalidProtocolBufferException {
                this.getHighSpeedVideoFpsRangesFor = (byte) -1;
                this.getHighSpeedVideoFpsRanges = -1;
                this.Camera2StreamConfigurationMap = kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Type.Argument.Projection.INV;
                this.getHighSpeedVideoSizesFor = kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Type.getDefaultInstance();
                boolean z = false;
                this.getOutputMinFrameDuration = 0;
                kotlin.reflect.jvm.internal.impl.protobuf.ByteString.Output newOutput = kotlin.reflect.jvm.internal.impl.protobuf.ByteString.newOutput();
                kotlin.reflect.jvm.internal.impl.protobuf.CodedOutputStream newInstance = kotlin.reflect.jvm.internal.impl.protobuf.CodedOutputStream.newInstance(newOutput, 1);
                while (!z) {
                    try {
                        try {
                            try {
                                int readTag = codedInputStream.readTag();
                                if (readTag != 0) {
                                    if (readTag == 8) {
                                        int readEnum = codedInputStream.readEnum();
                                        kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Type.Argument.Projection valueOf = kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Type.Argument.Projection.valueOf(readEnum);
                                        if (valueOf == null) {
                                            newInstance.writeRawVarint32(readTag);
                                            newInstance.writeRawVarint32(readEnum);
                                        } else {
                                            this.getHighSpeedVideoSizes |= 1;
                                            this.Camera2StreamConfigurationMap = valueOf;
                                        }
                                    } else if (readTag == 18) {
                                        kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Type.Builder builder = (this.getHighSpeedVideoSizes & 2) == 2 ? this.getHighSpeedVideoSizesFor.toBuilder() : null;
                                        kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Type type = (kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Type) codedInputStream.readMessage(kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Type.PARSER, extensionRegistryLite);
                                        this.getHighSpeedVideoSizesFor = type;
                                        if (builder != null) {
                                            builder.mergeFrom(type);
                                            this.getHighSpeedVideoSizesFor = builder.buildPartial();
                                        }
                                        this.getHighSpeedVideoSizes |= 2;
                                    } else if (readTag == 24) {
                                        this.getHighSpeedVideoSizes |= 4;
                                        this.getOutputMinFrameDuration = codedInputStream.readInt32();
                                    } else if (!parseUnknownField(codedInputStream, newInstance, extensionRegistryLite, readTag)) {
                                    }
                                }
                                z = true;
                            } catch (kotlin.reflect.jvm.internal.impl.protobuf.InvalidProtocolBufferException e) {
                                throw e.setUnfinishedMessage(this);
                            }
                        } catch (java.io.IOException e2) {
                            throw new kotlin.reflect.jvm.internal.impl.protobuf.InvalidProtocolBufferException(e2.getMessage()).setUnfinishedMessage(this);
                        }
                    } catch (java.lang.Throwable th) {
                        try {
                            newInstance.flush();
                        } catch (java.io.IOException unused) {
                        } catch (java.lang.Throwable th2) {
                            this.getOutputFormats = newOutput.toByteString();
                            throw th2;
                        }
                        this.getOutputFormats = newOutput.toByteString();
                        makeExtensionsImmutable();
                        throw th;
                    }
                }
                try {
                    newInstance.flush();
                } catch (java.io.IOException unused2) {
                } catch (java.lang.Throwable th3) {
                    this.getOutputFormats = newOutput.toByteString();
                    throw th3;
                }
                this.getOutputFormats = newOutput.toByteString();
                makeExtensionsImmutable();
            }

            static {
                kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Type.Argument argument = new kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Type.Argument();
                getHighResolutionOutputSizeshNQ4ISI = argument;
                argument.Camera2StreamConfigurationMap = kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Type.Argument.Projection.INV;
                argument.getHighSpeedVideoSizesFor = kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Type.getDefaultInstance();
                argument.getOutputMinFrameDuration = 0;
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite, kotlin.reflect.jvm.internal.impl.protobuf.MessageLite
            public final kotlin.reflect.jvm.internal.impl.protobuf.Parser<kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Type.Argument> getParserForType() {
                return PARSER;
            }

            public enum Projection implements kotlin.reflect.jvm.internal.impl.protobuf.Internal.EnumLite {
                IN(0),
                OUT(1),
                INV(2),
                STAR(3);

                private static kotlin.reflect.jvm.internal.impl.protobuf.Internal.EnumLiteMap<kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Type.Argument.Projection> getHighResolutionOutputSizeshNQ4ISI = new kotlin.reflect.jvm.internal.impl.protobuf.Internal.EnumLiteMap<kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Type.Argument.Projection>() { // from class: kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Type.Argument.Projection.1
                    @Override // kotlin.reflect.jvm.internal.impl.protobuf.Internal.EnumLiteMap
                    public final /* synthetic */ kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Type.Argument.Projection findValueByNumber(int i) {
                        return kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Type.Argument.Projection.valueOf(i);
                    }
                };
                private final int getHighSpeedVideoSizes;

                @Override // kotlin.reflect.jvm.internal.impl.protobuf.Internal.EnumLite
                public final int getNumber() {
                    return this.getHighSpeedVideoSizes;
                }

                public static kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Type.Argument.Projection valueOf(int i) {
                    if (i == 0) {
                        return IN;
                    }
                    if (i == 1) {
                        return OUT;
                    }
                    if (i == 2) {
                        return INV;
                    }
                    if (i != 3) {
                        return null;
                    }
                    return STAR;
                }

                Projection(int i) {
                    this.getHighSpeedVideoSizes = i;
                }
            }

            public final boolean hasProjection() {
                return (this.getHighSpeedVideoSizes & 1) == 1;
            }

            public final kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Type.Argument.Projection getProjection() {
                return this.Camera2StreamConfigurationMap;
            }

            public final boolean hasType() {
                return (this.getHighSpeedVideoSizes & 2) == 2;
            }

            public final kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Type getType() {
                return this.getHighSpeedVideoSizesFor;
            }

            public final boolean hasTypeId() {
                return (this.getHighSpeedVideoSizes & 4) == 4;
            }

            public final int getTypeId() {
                return this.getOutputMinFrameDuration;
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.MessageLiteOrBuilder
            public final boolean isInitialized() {
                byte b = this.getHighSpeedVideoFpsRangesFor;
                if (b == 1) {
                    return true;
                }
                if (b == 0) {
                    return false;
                }
                if (hasType() && !getType().isInitialized()) {
                    this.getHighSpeedVideoFpsRangesFor = (byte) 0;
                    return false;
                }
                this.getHighSpeedVideoFpsRangesFor = (byte) 1;
                return true;
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.MessageLite
            public final void writeTo(kotlin.reflect.jvm.internal.impl.protobuf.CodedOutputStream codedOutputStream) throws java.io.IOException {
                getSerializedSize();
                if ((this.getHighSpeedVideoSizes & 1) == 1) {
                    codedOutputStream.writeEnum(1, this.Camera2StreamConfigurationMap.getNumber());
                }
                if ((this.getHighSpeedVideoSizes & 2) == 2) {
                    codedOutputStream.writeMessage(2, this.getHighSpeedVideoSizesFor);
                }
                if ((this.getHighSpeedVideoSizes & 4) == 4) {
                    codedOutputStream.writeInt32(3, this.getOutputMinFrameDuration);
                }
                codedOutputStream.writeRawBytes(this.getOutputFormats);
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.MessageLite
            public final int getSerializedSize() {
                int i = this.getHighSpeedVideoFpsRanges;
                if (i != -1) {
                    return i;
                }
                int computeEnumSize = (this.getHighSpeedVideoSizes & 1) == 1 ? kotlin.reflect.jvm.internal.impl.protobuf.CodedOutputStream.computeEnumSize(1, this.Camera2StreamConfigurationMap.getNumber()) : 0;
                if ((this.getHighSpeedVideoSizes & 2) == 2) {
                    computeEnumSize += kotlin.reflect.jvm.internal.impl.protobuf.CodedOutputStream.computeMessageSize(2, this.getHighSpeedVideoSizesFor);
                }
                if ((this.getHighSpeedVideoSizes & 4) == 4) {
                    computeEnumSize += kotlin.reflect.jvm.internal.impl.protobuf.CodedOutputStream.computeInt32Size(3, this.getOutputMinFrameDuration);
                }
                int size = computeEnumSize + this.getOutputFormats.size();
                this.getHighSpeedVideoFpsRanges = size;
                return size;
            }

            public static kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Type.Argument.Builder newBuilder() {
                return kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Type.Argument.Builder.getHighSpeedVideoFpsRangesFor();
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.MessageLite
            public final kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Type.Argument.Builder newBuilderForType() {
                return newBuilder();
            }

            public static kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Type.Argument.Builder newBuilder(kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Type.Argument argument) {
                return newBuilder().mergeFrom(argument);
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.MessageLite
            public final kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Type.Argument.Builder toBuilder() {
                return newBuilder(this);
            }

            public static final class Builder extends kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite.Builder<kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Type.Argument, kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Type.Argument.Builder> implements kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Type.ArgumentOrBuilder {
                private int getHighSpeedVideoFpsRangesFor;
                private int getHighSpeedVideoSizes;
                private kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Type.Argument.Projection getHighSpeedVideoFpsRanges = kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Type.Argument.Projection.INV;
                private kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Type Camera2StreamConfigurationMap = kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Type.getDefaultInstance();

                private Builder() {
                }

                @Override // kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite.Builder, kotlin.reflect.jvm.internal.impl.protobuf.MessageLiteOrBuilder
                public final kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Type.Argument getDefaultInstanceForType() {
                    return kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Type.Argument.getDefaultInstance();
                }

                @Override // kotlin.reflect.jvm.internal.impl.protobuf.MessageLite.Builder
                public final kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Type.Argument build() {
                    kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Type.Argument buildPartial = buildPartial();
                    if (buildPartial.isInitialized()) {
                        return buildPartial;
                    }
                    throw newUninitializedMessageException(buildPartial);
                }

                /* JADX WARN: Multi-variable type inference failed */
                public final kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Type.Argument buildPartial() {
                    kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Type.Argument argument = new kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Type.Argument((kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite.Builder) this, (byte) (0 == true ? 1 : 0));
                    int i = this.getHighSpeedVideoFpsRangesFor;
                    int i2 = (i & 1) == 1 ? 1 : 0;
                    argument.Camera2StreamConfigurationMap = this.getHighSpeedVideoFpsRanges;
                    if ((i & 2) == 2) {
                        i2 |= 2;
                    }
                    argument.getHighSpeedVideoSizesFor = this.Camera2StreamConfigurationMap;
                    if ((i & 4) == 4) {
                        i2 |= 4;
                    }
                    argument.getOutputMinFrameDuration = this.getHighSpeedVideoSizes;
                    argument.getHighSpeedVideoSizes = i2;
                    return argument;
                }

                @Override // kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite.Builder
                public final kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Type.Argument.Builder mergeFrom(kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Type.Argument argument) {
                    if (argument == kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Type.Argument.getDefaultInstance()) {
                        return this;
                    }
                    if (argument.hasProjection()) {
                        setProjection(argument.getProjection());
                    }
                    if (argument.hasType()) {
                        mergeType(argument.getType());
                    }
                    if (argument.hasTypeId()) {
                        setTypeId(argument.getTypeId());
                    }
                    setUnknownFields(getUnknownFields().concat(argument.getOutputFormats));
                    return this;
                }

                @Override // kotlin.reflect.jvm.internal.impl.protobuf.MessageLiteOrBuilder
                public final boolean isInitialized() {
                    return !hasType() || getType().isInitialized();
                }

                /* JADX WARN: Removed duplicated region for block: B:15:0x001d  */
                @Override // kotlin.reflect.jvm.internal.impl.protobuf.AbstractMessageLite.Builder, kotlin.reflect.jvm.internal.impl.protobuf.MessageLite.Builder
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                */
                public final kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Type.Argument.Builder mergeFrom(kotlin.reflect.jvm.internal.impl.protobuf.CodedInputStream codedInputStream, kotlin.reflect.jvm.internal.impl.protobuf.ExtensionRegistryLite extensionRegistryLite) throws java.io.IOException {
                    kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Type.Argument argument;
                    try {
                        try {
                            kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Type.Argument parsePartialFrom = kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Type.Argument.PARSER.parsePartialFrom(codedInputStream, extensionRegistryLite);
                            if (parsePartialFrom != null) {
                                mergeFrom(parsePartialFrom);
                            }
                            return this;
                        } catch (kotlin.reflect.jvm.internal.impl.protobuf.InvalidProtocolBufferException e) {
                            argument = (kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Type.Argument) e.getUnfinishedMessage();
                            try {
                                throw e;
                            } catch (java.lang.Throwable th) {
                                th = th;
                                if (argument != null) {
                                    mergeFrom(argument);
                                }
                                throw th;
                            }
                        }
                    } catch (java.lang.Throwable th2) {
                        th = th2;
                        argument = null;
                        if (argument != null) {
                        }
                        throw th;
                    }
                }

                public final kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Type.Argument.Builder setProjection(kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Type.Argument.Projection projection) {
                    this.getHighSpeedVideoFpsRangesFor |= 1;
                    this.getHighSpeedVideoFpsRanges = projection;
                    return this;
                }

                public final boolean hasType() {
                    return (this.getHighSpeedVideoFpsRangesFor & 2) == 2;
                }

                public final kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Type getType() {
                    return this.Camera2StreamConfigurationMap;
                }

                public final kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Type.Argument.Builder setType(kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Type type) {
                    this.Camera2StreamConfigurationMap = type;
                    this.getHighSpeedVideoFpsRangesFor |= 2;
                    return this;
                }

                public final kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Type.Argument.Builder mergeType(kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Type type) {
                    if ((this.getHighSpeedVideoFpsRangesFor & 2) == 2 && this.Camera2StreamConfigurationMap != kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Type.getDefaultInstance()) {
                        this.Camera2StreamConfigurationMap = kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Type.newBuilder(this.Camera2StreamConfigurationMap).mergeFrom(type).buildPartial();
                    } else {
                        this.Camera2StreamConfigurationMap = type;
                    }
                    this.getHighSpeedVideoFpsRangesFor |= 2;
                    return this;
                }

                public final kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Type.Argument.Builder setTypeId(int i) {
                    this.getHighSpeedVideoFpsRangesFor |= 4;
                    this.getHighSpeedVideoSizes = i;
                    return this;
                }

                static /* synthetic */ kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Type.Argument.Builder getHighSpeedVideoFpsRangesFor() {
                    return new kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Type.Argument.Builder();
                }

                @Override // kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite.Builder, kotlin.reflect.jvm.internal.impl.protobuf.AbstractMessageLite.Builder
                /* renamed from: clone */
                public final kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Type.Argument.Builder mo23897clone() {
                    return new kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Type.Argument.Builder().mergeFrom(buildPartial());
                }
            }
        }

        public final java.util.List<kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Type.Argument> getArgumentList() {
            return this.Camera2StreamConfigurationMap;
        }

        public final int getArgumentCount() {
            return this.Camera2StreamConfigurationMap.size();
        }

        public final kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Type.Argument getArgument(int i) {
            return this.Camera2StreamConfigurationMap.get(i);
        }

        public final boolean hasNullable() {
            return (this.getInputSizeshNQ4ISI & 1) == 1;
        }

        public final boolean getNullable() {
            return this.getOutputSizeshNQ4ISI;
        }

        public final boolean hasFlexibleTypeCapabilitiesId() {
            return (this.getInputSizeshNQ4ISI & 2) == 2;
        }

        public final int getFlexibleTypeCapabilitiesId() {
            return this.getOutputFormats;
        }

        public final boolean hasFlexibleUpperBound() {
            return (this.getInputSizeshNQ4ISI & 4) == 4;
        }

        public final kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Type getFlexibleUpperBound() {
            return this.getOutputStallDurationlomOqCM;
        }

        public final boolean hasFlexibleUpperBoundId() {
            return (this.getInputSizeshNQ4ISI & 8) == 8;
        }

        public final int getFlexibleUpperBoundId() {
            return this.getInputFormats;
        }

        public final boolean hasClassName() {
            return (this.getInputSizeshNQ4ISI & 16) == 16;
        }

        public final int getClassName() {
            return this.getOutputMinFrameDuration;
        }

        public final boolean hasTypeParameter() {
            return (this.getInputSizeshNQ4ISI & 32) == 32;
        }

        public final int getTypeParameter() {
            return this.toString;
        }

        public final boolean hasTypeParameterName() {
            return (this.getInputSizeshNQ4ISI & 64) == 64;
        }

        public final int getTypeParameterName() {
            return this.getValidOutputFormatsForInputhNQ4ISI;
        }

        public final boolean hasTypeAliasName() {
            return (this.getInputSizeshNQ4ISI & 128) == 128;
        }

        public final int getTypeAliasName() {
            return this.isOutputSupportedForhNQ4ISI;
        }

        public final boolean hasOuterType() {
            return (this.getInputSizeshNQ4ISI & 256) == 256;
        }

        public final kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Type getOuterType() {
            return this.unwrapAs;
        }

        public final boolean hasOuterTypeId() {
            return (this.getInputSizeshNQ4ISI & 512) == 512;
        }

        public final int getOuterTypeId() {
            return this.getOutputStallDuration;
        }

        public final boolean hasAbbreviatedType() {
            return (this.getInputSizeshNQ4ISI & 1024) == 1024;
        }

        public final kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Type getAbbreviatedType() {
            return this.getHighSpeedVideoFpsRanges;
        }

        public final boolean hasAbbreviatedTypeId() {
            return (this.getInputSizeshNQ4ISI & 2048) == 2048;
        }

        public final int getAbbreviatedTypeId() {
            return this.getHighResolutionOutputSizeshNQ4ISI;
        }

        public final boolean hasFlags() {
            return (this.getInputSizeshNQ4ISI & 4096) == 4096;
        }

        public final int getFlags() {
            return this.getHighSpeedVideoSizesFor;
        }

        public final java.util.List<kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Annotation> getAnnotationList() {
            return this.getHighSpeedVideoSizes;
        }

        public final int getAnnotationCount() {
            return this.getHighSpeedVideoSizes.size();
        }

        public final kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Annotation getAnnotation(int i) {
            return this.getHighSpeedVideoSizes.get(i);
        }

        private void getHighResolutionOutputSizeshNQ4ISI() {
            this.Camera2StreamConfigurationMap = java.util.Collections.emptyList();
            this.getOutputSizeshNQ4ISI = false;
            this.getOutputFormats = 0;
            this.getOutputStallDurationlomOqCM = getDefaultInstance();
            this.getInputFormats = 0;
            this.getOutputMinFrameDuration = 0;
            this.toString = 0;
            this.getValidOutputFormatsForInputhNQ4ISI = 0;
            this.isOutputSupportedForhNQ4ISI = 0;
            this.unwrapAs = getDefaultInstance();
            this.getOutputStallDuration = 0;
            this.getHighSpeedVideoFpsRanges = getDefaultInstance();
            this.getHighResolutionOutputSizeshNQ4ISI = 0;
            this.getHighSpeedVideoSizesFor = 0;
            this.getHighSpeedVideoSizes = java.util.Collections.emptyList();
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.MessageLiteOrBuilder
        public final boolean isInitialized() {
            byte b = this.getOutputMinFrameDurationlomOqCM;
            if (b == 1) {
                return true;
            }
            if (b == 0) {
                return false;
            }
            for (int i = 0; i < getArgumentCount(); i++) {
                if (!getArgument(i).isInitialized()) {
                    this.getOutputMinFrameDurationlomOqCM = (byte) 0;
                    return false;
                }
            }
            if (hasFlexibleUpperBound() && !getFlexibleUpperBound().isInitialized()) {
                this.getOutputMinFrameDurationlomOqCM = (byte) 0;
                return false;
            }
            if (hasOuterType() && !getOuterType().isInitialized()) {
                this.getOutputMinFrameDurationlomOqCM = (byte) 0;
                return false;
            }
            if (hasAbbreviatedType() && !getAbbreviatedType().isInitialized()) {
                this.getOutputMinFrameDurationlomOqCM = (byte) 0;
                return false;
            }
            for (int i2 = 0; i2 < getAnnotationCount(); i2++) {
                if (!getAnnotation(i2).isInitialized()) {
                    this.getOutputMinFrameDurationlomOqCM = (byte) 0;
                    return false;
                }
            }
            if (!extensionsAreInitialized()) {
                this.getOutputMinFrameDurationlomOqCM = (byte) 0;
                return false;
            }
            this.getOutputMinFrameDurationlomOqCM = (byte) 1;
            return true;
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.MessageLite
        public final void writeTo(kotlin.reflect.jvm.internal.impl.protobuf.CodedOutputStream codedOutputStream) throws java.io.IOException {
            getSerializedSize();
            kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite.ExtendableMessage<MessageType>.ExtensionWriter newExtensionWriter = newExtensionWriter();
            if ((this.getInputSizeshNQ4ISI & 4096) == 4096) {
                codedOutputStream.writeInt32(1, this.getHighSpeedVideoSizesFor);
            }
            for (int i = 0; i < this.Camera2StreamConfigurationMap.size(); i++) {
                codedOutputStream.writeMessage(2, this.Camera2StreamConfigurationMap.get(i));
            }
            if ((this.getInputSizeshNQ4ISI & 1) == 1) {
                codedOutputStream.writeBool(3, this.getOutputSizeshNQ4ISI);
            }
            if ((this.getInputSizeshNQ4ISI & 2) == 2) {
                codedOutputStream.writeInt32(4, this.getOutputFormats);
            }
            if ((this.getInputSizeshNQ4ISI & 4) == 4) {
                codedOutputStream.writeMessage(5, this.getOutputStallDurationlomOqCM);
            }
            if ((this.getInputSizeshNQ4ISI & 16) == 16) {
                codedOutputStream.writeInt32(6, this.getOutputMinFrameDuration);
            }
            if ((this.getInputSizeshNQ4ISI & 32) == 32) {
                codedOutputStream.writeInt32(7, this.toString);
            }
            if ((this.getInputSizeshNQ4ISI & 8) == 8) {
                codedOutputStream.writeInt32(8, this.getInputFormats);
            }
            if ((this.getInputSizeshNQ4ISI & 64) == 64) {
                codedOutputStream.writeInt32(9, this.getValidOutputFormatsForInputhNQ4ISI);
            }
            if ((this.getInputSizeshNQ4ISI & 256) == 256) {
                codedOutputStream.writeMessage(10, this.unwrapAs);
            }
            if ((this.getInputSizeshNQ4ISI & 512) == 512) {
                codedOutputStream.writeInt32(11, this.getOutputStallDuration);
            }
            if ((this.getInputSizeshNQ4ISI & 128) == 128) {
                codedOutputStream.writeInt32(12, this.isOutputSupportedForhNQ4ISI);
            }
            if ((this.getInputSizeshNQ4ISI & 1024) == 1024) {
                codedOutputStream.writeMessage(13, this.getHighSpeedVideoFpsRanges);
            }
            if ((this.getInputSizeshNQ4ISI & 2048) == 2048) {
                codedOutputStream.writeInt32(14, this.getHighResolutionOutputSizeshNQ4ISI);
            }
            for (int i2 = 0; i2 < this.getHighSpeedVideoSizes.size(); i2++) {
                codedOutputStream.writeMessage(100, this.getHighSpeedVideoSizes.get(i2));
            }
            newExtensionWriter.writeUntil(200, codedOutputStream);
            codedOutputStream.writeRawBytes(this.isOutputSupportedFor);
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.MessageLite
        public final int getSerializedSize() {
            int i = this.getOutputSizes;
            if (i != -1) {
                return i;
            }
            int computeInt32Size = (this.getInputSizeshNQ4ISI & 4096) == 4096 ? kotlin.reflect.jvm.internal.impl.protobuf.CodedOutputStream.computeInt32Size(1, this.getHighSpeedVideoSizesFor) : 0;
            for (int i2 = 0; i2 < this.Camera2StreamConfigurationMap.size(); i2++) {
                computeInt32Size += kotlin.reflect.jvm.internal.impl.protobuf.CodedOutputStream.computeMessageSize(2, this.Camera2StreamConfigurationMap.get(i2));
            }
            if ((this.getInputSizeshNQ4ISI & 1) == 1) {
                computeInt32Size += kotlin.reflect.jvm.internal.impl.protobuf.CodedOutputStream.computeBoolSize(3, this.getOutputSizeshNQ4ISI);
            }
            if ((this.getInputSizeshNQ4ISI & 2) == 2) {
                computeInt32Size += kotlin.reflect.jvm.internal.impl.protobuf.CodedOutputStream.computeInt32Size(4, this.getOutputFormats);
            }
            if ((this.getInputSizeshNQ4ISI & 4) == 4) {
                computeInt32Size += kotlin.reflect.jvm.internal.impl.protobuf.CodedOutputStream.computeMessageSize(5, this.getOutputStallDurationlomOqCM);
            }
            if ((this.getInputSizeshNQ4ISI & 16) == 16) {
                computeInt32Size += kotlin.reflect.jvm.internal.impl.protobuf.CodedOutputStream.computeInt32Size(6, this.getOutputMinFrameDuration);
            }
            if ((this.getInputSizeshNQ4ISI & 32) == 32) {
                computeInt32Size += kotlin.reflect.jvm.internal.impl.protobuf.CodedOutputStream.computeInt32Size(7, this.toString);
            }
            if ((this.getInputSizeshNQ4ISI & 8) == 8) {
                computeInt32Size += kotlin.reflect.jvm.internal.impl.protobuf.CodedOutputStream.computeInt32Size(8, this.getInputFormats);
            }
            if ((this.getInputSizeshNQ4ISI & 64) == 64) {
                computeInt32Size += kotlin.reflect.jvm.internal.impl.protobuf.CodedOutputStream.computeInt32Size(9, this.getValidOutputFormatsForInputhNQ4ISI);
            }
            if ((this.getInputSizeshNQ4ISI & 256) == 256) {
                computeInt32Size += kotlin.reflect.jvm.internal.impl.protobuf.CodedOutputStream.computeMessageSize(10, this.unwrapAs);
            }
            if ((this.getInputSizeshNQ4ISI & 512) == 512) {
                computeInt32Size += kotlin.reflect.jvm.internal.impl.protobuf.CodedOutputStream.computeInt32Size(11, this.getOutputStallDuration);
            }
            if ((this.getInputSizeshNQ4ISI & 128) == 128) {
                computeInt32Size += kotlin.reflect.jvm.internal.impl.protobuf.CodedOutputStream.computeInt32Size(12, this.isOutputSupportedForhNQ4ISI);
            }
            if ((this.getInputSizeshNQ4ISI & 1024) == 1024) {
                computeInt32Size += kotlin.reflect.jvm.internal.impl.protobuf.CodedOutputStream.computeMessageSize(13, this.getHighSpeedVideoFpsRanges);
            }
            if ((this.getInputSizeshNQ4ISI & 2048) == 2048) {
                computeInt32Size += kotlin.reflect.jvm.internal.impl.protobuf.CodedOutputStream.computeInt32Size(14, this.getHighResolutionOutputSizeshNQ4ISI);
            }
            for (int i3 = 0; i3 < this.getHighSpeedVideoSizes.size(); i3++) {
                computeInt32Size += kotlin.reflect.jvm.internal.impl.protobuf.CodedOutputStream.computeMessageSize(100, this.getHighSpeedVideoSizes.get(i3));
            }
            int extensionsSerializedSize = computeInt32Size + extensionsSerializedSize() + this.isOutputSupportedFor.size();
            this.getOutputSizes = extensionsSerializedSize;
            return extensionsSerializedSize;
        }

        public static kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Type.Builder newBuilder() {
            return kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Type.Builder.Camera2StreamConfigurationMap();
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.MessageLite
        public final kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Type.Builder newBuilderForType() {
            return newBuilder();
        }

        public static kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Type.Builder newBuilder(kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Type type) {
            return newBuilder().mergeFrom(type);
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.MessageLite
        public final kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Type.Builder toBuilder() {
            return newBuilder(this);
        }

        public static final class Builder extends kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite.ExtendableBuilder<kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Type, kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Type.Builder> implements kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.TypeOrBuilder {
            private int getHighSpeedVideoFpsRanges;
            private int getHighSpeedVideoSizes;
            private int getHighSpeedVideoSizesFor;
            private int getInputSizeshNQ4ISI;
            private int getOutputFormats;
            private int getOutputMinFrameDuration;
            private boolean getOutputMinFrameDurationlomOqCM;
            private int getOutputSizes;
            private int getOutputStallDuration;
            private int getOutputStallDurationlomOqCM;
            private int isOutputSupportedForhNQ4ISI;
            private java.util.List<kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Type.Argument> getHighResolutionOutputSizeshNQ4ISI = java.util.Collections.emptyList();
            private kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Type getInputFormats = kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Type.getDefaultInstance();
            private kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Type getOutputSizeshNQ4ISI = kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Type.getDefaultInstance();
            private kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Type Camera2StreamConfigurationMap = kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Type.getDefaultInstance();
            private java.util.List<kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Annotation> getHighSpeedVideoFpsRangesFor = java.util.Collections.emptyList();

            private Builder() {
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite.Builder, kotlin.reflect.jvm.internal.impl.protobuf.MessageLiteOrBuilder
            public final kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Type getDefaultInstanceForType() {
                return kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Type.getDefaultInstance();
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.MessageLite.Builder
            public final kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Type build() {
                kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Type buildPartial = buildPartial();
                if (buildPartial.isInitialized()) {
                    return buildPartial;
                }
                throw newUninitializedMessageException(buildPartial);
            }

            /* JADX WARN: Multi-variable type inference failed */
            public final kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Type buildPartial() {
                kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Type type = new kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Type((kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite.ExtendableBuilder) this, (byte) (0 == true ? 1 : 0));
                int i = this.getHighSpeedVideoFpsRanges;
                if ((i & 1) == 1) {
                    this.getHighResolutionOutputSizeshNQ4ISI = java.util.Collections.unmodifiableList(this.getHighResolutionOutputSizeshNQ4ISI);
                    this.getHighSpeedVideoFpsRanges &= -2;
                }
                type.Camera2StreamConfigurationMap = this.getHighResolutionOutputSizeshNQ4ISI;
                int i2 = (i & 2) == 2 ? 1 : 0;
                type.getOutputSizeshNQ4ISI = this.getOutputMinFrameDurationlomOqCM;
                if ((i & 4) == 4) {
                    i2 |= 2;
                }
                type.getOutputFormats = this.getInputSizeshNQ4ISI;
                if ((i & 8) == 8) {
                    i2 |= 4;
                }
                type.getOutputStallDurationlomOqCM = this.getInputFormats;
                if ((i & 16) == 16) {
                    i2 |= 8;
                }
                type.getInputFormats = this.getHighSpeedVideoSizesFor;
                if ((i & 32) == 32) {
                    i2 |= 16;
                }
                type.getOutputMinFrameDuration = this.getOutputFormats;
                if ((i & 64) == 64) {
                    i2 |= 32;
                }
                type.toString = this.isOutputSupportedForhNQ4ISI;
                if ((i & 128) == 128) {
                    i2 |= 64;
                }
                type.getValidOutputFormatsForInputhNQ4ISI = this.getOutputStallDurationlomOqCM;
                if ((i & 256) == 256) {
                    i2 |= 128;
                }
                type.isOutputSupportedForhNQ4ISI = this.getOutputStallDuration;
                if ((i & 512) == 512) {
                    i2 |= 256;
                }
                type.unwrapAs = this.getOutputSizeshNQ4ISI;
                if ((i & 1024) == 1024) {
                    i2 |= 512;
                }
                type.getOutputStallDuration = this.getOutputSizes;
                if ((i & 2048) == 2048) {
                    i2 |= 1024;
                }
                type.getHighSpeedVideoFpsRanges = this.Camera2StreamConfigurationMap;
                if ((i & 4096) == 4096) {
                    i2 |= 2048;
                }
                type.getHighResolutionOutputSizeshNQ4ISI = this.getHighSpeedVideoSizes;
                if ((i & 8192) == 8192) {
                    i2 |= 4096;
                }
                type.getHighSpeedVideoSizesFor = this.getOutputMinFrameDuration;
                if ((this.getHighSpeedVideoFpsRanges & 16384) == 16384) {
                    this.getHighSpeedVideoFpsRangesFor = java.util.Collections.unmodifiableList(this.getHighSpeedVideoFpsRangesFor);
                    this.getHighSpeedVideoFpsRanges &= -16385;
                }
                type.getHighSpeedVideoSizes = this.getHighSpeedVideoFpsRangesFor;
                type.getInputSizeshNQ4ISI = i2;
                return type;
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite.Builder
            public final kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Type.Builder mergeFrom(kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Type type) {
                if (type == kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Type.getDefaultInstance()) {
                    return this;
                }
                if (!type.Camera2StreamConfigurationMap.isEmpty()) {
                    if (this.getHighResolutionOutputSizeshNQ4ISI.isEmpty()) {
                        this.getHighResolutionOutputSizeshNQ4ISI = type.Camera2StreamConfigurationMap;
                        this.getHighSpeedVideoFpsRanges &= -2;
                    } else {
                        getHighSpeedVideoFpsRangesFor();
                        this.getHighResolutionOutputSizeshNQ4ISI.addAll(type.Camera2StreamConfigurationMap);
                    }
                }
                if (type.hasNullable()) {
                    setNullable(type.getNullable());
                }
                if (type.hasFlexibleTypeCapabilitiesId()) {
                    setFlexibleTypeCapabilitiesId(type.getFlexibleTypeCapabilitiesId());
                }
                if (type.hasFlexibleUpperBound()) {
                    mergeFlexibleUpperBound(type.getFlexibleUpperBound());
                }
                if (type.hasFlexibleUpperBoundId()) {
                    setFlexibleUpperBoundId(type.getFlexibleUpperBoundId());
                }
                if (type.hasClassName()) {
                    setClassName(type.getClassName());
                }
                if (type.hasTypeParameter()) {
                    setTypeParameter(type.getTypeParameter());
                }
                if (type.hasTypeParameterName()) {
                    setTypeParameterName(type.getTypeParameterName());
                }
                if (type.hasTypeAliasName()) {
                    setTypeAliasName(type.getTypeAliasName());
                }
                if (type.hasOuterType()) {
                    mergeOuterType(type.getOuterType());
                }
                if (type.hasOuterTypeId()) {
                    setOuterTypeId(type.getOuterTypeId());
                }
                if (type.hasAbbreviatedType()) {
                    mergeAbbreviatedType(type.getAbbreviatedType());
                }
                if (type.hasAbbreviatedTypeId()) {
                    setAbbreviatedTypeId(type.getAbbreviatedTypeId());
                }
                if (type.hasFlags()) {
                    setFlags(type.getFlags());
                }
                if (!type.getHighSpeedVideoSizes.isEmpty()) {
                    if (this.getHighSpeedVideoFpsRangesFor.isEmpty()) {
                        this.getHighSpeedVideoFpsRangesFor = type.getHighSpeedVideoSizes;
                        this.getHighSpeedVideoFpsRanges &= -16385;
                    } else {
                        getHighResolutionOutputSizeshNQ4ISI();
                        this.getHighSpeedVideoFpsRangesFor.addAll(type.getHighSpeedVideoSizes);
                    }
                }
                mergeExtensionFields(type);
                setUnknownFields(getUnknownFields().concat(type.isOutputSupportedFor));
                return this;
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.MessageLiteOrBuilder
            public final boolean isInitialized() {
                for (int i = 0; i < getArgumentCount(); i++) {
                    if (!getArgument(i).isInitialized()) {
                        return false;
                    }
                }
                if (hasFlexibleUpperBound() && !getFlexibleUpperBound().isInitialized()) {
                    return false;
                }
                if (hasOuterType() && !getOuterType().isInitialized()) {
                    return false;
                }
                if (hasAbbreviatedType() && !getAbbreviatedType().isInitialized()) {
                    return false;
                }
                for (int i2 = 0; i2 < getAnnotationCount(); i2++) {
                    if (!getAnnotation(i2).isInitialized()) {
                        return false;
                    }
                }
                return extensionsAreInitialized();
            }

            /* JADX WARN: Removed duplicated region for block: B:15:0x001d  */
            @Override // kotlin.reflect.jvm.internal.impl.protobuf.AbstractMessageLite.Builder, kotlin.reflect.jvm.internal.impl.protobuf.MessageLite.Builder
            /*
                Code decompiled incorrectly, please refer to instructions dump.
            */
            public final kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Type.Builder mergeFrom(kotlin.reflect.jvm.internal.impl.protobuf.CodedInputStream codedInputStream, kotlin.reflect.jvm.internal.impl.protobuf.ExtensionRegistryLite extensionRegistryLite) throws java.io.IOException {
                kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Type type;
                try {
                    try {
                        kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Type parsePartialFrom = kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Type.PARSER.parsePartialFrom(codedInputStream, extensionRegistryLite);
                        if (parsePartialFrom != null) {
                            mergeFrom(parsePartialFrom);
                        }
                        return this;
                    } catch (kotlin.reflect.jvm.internal.impl.protobuf.InvalidProtocolBufferException e) {
                        type = (kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Type) e.getUnfinishedMessage();
                        try {
                            throw e;
                        } catch (java.lang.Throwable th) {
                            th = th;
                            if (type != null) {
                                mergeFrom(type);
                            }
                            throw th;
                        }
                    }
                } catch (java.lang.Throwable th2) {
                    th = th2;
                    type = null;
                    if (type != null) {
                    }
                    throw th;
                }
            }

            private void getHighSpeedVideoFpsRangesFor() {
                if ((this.getHighSpeedVideoFpsRanges & 1) != 1) {
                    this.getHighResolutionOutputSizeshNQ4ISI = new java.util.ArrayList(this.getHighResolutionOutputSizeshNQ4ISI);
                    this.getHighSpeedVideoFpsRanges |= 1;
                }
            }

            public final int getArgumentCount() {
                return this.getHighResolutionOutputSizeshNQ4ISI.size();
            }

            public final kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Type.Argument getArgument(int i) {
                return this.getHighResolutionOutputSizeshNQ4ISI.get(i);
            }

            public final kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Type.Builder addArgument(kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Type.Argument.Builder builder) {
                getHighSpeedVideoFpsRangesFor();
                this.getHighResolutionOutputSizeshNQ4ISI.add(builder.build());
                return this;
            }

            public final kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Type.Builder setNullable(boolean z) {
                this.getHighSpeedVideoFpsRanges |= 2;
                this.getOutputMinFrameDurationlomOqCM = z;
                return this;
            }

            public final kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Type.Builder setFlexibleTypeCapabilitiesId(int i) {
                this.getHighSpeedVideoFpsRanges |= 4;
                this.getInputSizeshNQ4ISI = i;
                return this;
            }

            public final boolean hasFlexibleUpperBound() {
                return (this.getHighSpeedVideoFpsRanges & 8) == 8;
            }

            public final kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Type getFlexibleUpperBound() {
                return this.getInputFormats;
            }

            public final kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Type.Builder setFlexibleUpperBound(kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Type type) {
                this.getInputFormats = type;
                this.getHighSpeedVideoFpsRanges |= 8;
                return this;
            }

            public final kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Type.Builder mergeFlexibleUpperBound(kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Type type) {
                if ((this.getHighSpeedVideoFpsRanges & 8) == 8 && this.getInputFormats != kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Type.getDefaultInstance()) {
                    this.getInputFormats = kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Type.newBuilder(this.getInputFormats).mergeFrom(type).buildPartial();
                } else {
                    this.getInputFormats = type;
                }
                this.getHighSpeedVideoFpsRanges |= 8;
                return this;
            }

            public final kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Type.Builder setFlexibleUpperBoundId(int i) {
                this.getHighSpeedVideoFpsRanges |= 16;
                this.getHighSpeedVideoSizesFor = i;
                return this;
            }

            public final kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Type.Builder setClassName(int i) {
                this.getHighSpeedVideoFpsRanges |= 32;
                this.getOutputFormats = i;
                return this;
            }

            public final kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Type.Builder setTypeParameter(int i) {
                this.getHighSpeedVideoFpsRanges |= 64;
                this.isOutputSupportedForhNQ4ISI = i;
                return this;
            }

            public final kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Type.Builder setTypeParameterName(int i) {
                this.getHighSpeedVideoFpsRanges |= 128;
                this.getOutputStallDurationlomOqCM = i;
                return this;
            }

            public final kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Type.Builder setTypeAliasName(int i) {
                this.getHighSpeedVideoFpsRanges |= 256;
                this.getOutputStallDuration = i;
                return this;
            }

            public final boolean hasOuterType() {
                return (this.getHighSpeedVideoFpsRanges & 512) == 512;
            }

            public final kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Type getOuterType() {
                return this.getOutputSizeshNQ4ISI;
            }

            public final kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Type.Builder setOuterType(kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Type type) {
                this.getOutputSizeshNQ4ISI = type;
                this.getHighSpeedVideoFpsRanges |= 512;
                return this;
            }

            public final kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Type.Builder mergeOuterType(kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Type type) {
                if ((this.getHighSpeedVideoFpsRanges & 512) == 512 && this.getOutputSizeshNQ4ISI != kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Type.getDefaultInstance()) {
                    this.getOutputSizeshNQ4ISI = kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Type.newBuilder(this.getOutputSizeshNQ4ISI).mergeFrom(type).buildPartial();
                } else {
                    this.getOutputSizeshNQ4ISI = type;
                }
                this.getHighSpeedVideoFpsRanges |= 512;
                return this;
            }

            public final kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Type.Builder setOuterTypeId(int i) {
                this.getHighSpeedVideoFpsRanges |= 1024;
                this.getOutputSizes = i;
                return this;
            }

            public final boolean hasAbbreviatedType() {
                return (this.getHighSpeedVideoFpsRanges & 2048) == 2048;
            }

            public final kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Type getAbbreviatedType() {
                return this.Camera2StreamConfigurationMap;
            }

            public final kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Type.Builder setAbbreviatedType(kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Type type) {
                this.Camera2StreamConfigurationMap = type;
                this.getHighSpeedVideoFpsRanges |= 2048;
                return this;
            }

            public final kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Type.Builder mergeAbbreviatedType(kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Type type) {
                if ((this.getHighSpeedVideoFpsRanges & 2048) == 2048 && this.Camera2StreamConfigurationMap != kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Type.getDefaultInstance()) {
                    this.Camera2StreamConfigurationMap = kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Type.newBuilder(this.Camera2StreamConfigurationMap).mergeFrom(type).buildPartial();
                } else {
                    this.Camera2StreamConfigurationMap = type;
                }
                this.getHighSpeedVideoFpsRanges |= 2048;
                return this;
            }

            public final kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Type.Builder setAbbreviatedTypeId(int i) {
                this.getHighSpeedVideoFpsRanges |= 4096;
                this.getHighSpeedVideoSizes = i;
                return this;
            }

            public final kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Type.Builder setFlags(int i) {
                this.getHighSpeedVideoFpsRanges |= 8192;
                this.getOutputMinFrameDuration = i;
                return this;
            }

            private void getHighResolutionOutputSizeshNQ4ISI() {
                if ((this.getHighSpeedVideoFpsRanges & 16384) != 16384) {
                    this.getHighSpeedVideoFpsRangesFor = new java.util.ArrayList(this.getHighSpeedVideoFpsRangesFor);
                    this.getHighSpeedVideoFpsRanges |= 16384;
                }
            }

            public final int getAnnotationCount() {
                return this.getHighSpeedVideoFpsRangesFor.size();
            }

            public final kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Annotation getAnnotation(int i) {
                return this.getHighSpeedVideoFpsRangesFor.get(i);
            }

            public final kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Type.Builder addAnnotation(kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Annotation annotation) {
                getHighResolutionOutputSizeshNQ4ISI();
                this.getHighSpeedVideoFpsRangesFor.add(annotation);
                return this;
            }

            static /* synthetic */ kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Type.Builder Camera2StreamConfigurationMap() {
                return new kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Type.Builder();
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite.ExtendableBuilder, kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite.Builder, kotlin.reflect.jvm.internal.impl.protobuf.AbstractMessageLite.Builder
            /* renamed from: clone */
            public final kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Type.Builder mo23897clone() {
                return new kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Type.Builder().mergeFrom(buildPartial());
            }
        }
    }

    public static final class TypeParameter extends kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite.ExtendableMessage<kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.TypeParameter> implements kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.TypeParameterOrBuilder {
        private static final kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.TypeParameter Camera2StreamConfigurationMap;
        public static kotlin.reflect.jvm.internal.impl.protobuf.Parser<kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.TypeParameter> PARSER = new kotlin.reflect.jvm.internal.impl.protobuf.AbstractParser<kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.TypeParameter>() { // from class: kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.TypeParameter.1
            @Override // kotlin.reflect.jvm.internal.impl.protobuf.Parser
            public final /* synthetic */ java.lang.Object parsePartialFrom(kotlin.reflect.jvm.internal.impl.protobuf.CodedInputStream codedInputStream, kotlin.reflect.jvm.internal.impl.protobuf.ExtensionRegistryLite extensionRegistryLite) throws kotlin.reflect.jvm.internal.impl.protobuf.InvalidProtocolBufferException {
                return new kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.TypeParameter(codedInputStream, extensionRegistryLite, (byte) 0);
            }
        };
        private byte getHighResolutionOutputSizeshNQ4ISI;
        private int getHighSpeedVideoFpsRanges;
        private java.util.List<kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Annotation> getHighSpeedVideoFpsRangesFor;
        private int getHighSpeedVideoSizes;
        private int getHighSpeedVideoSizesFor;
        private boolean getInputFormats;
        private int getInputSizeshNQ4ISI;
        private final kotlin.reflect.jvm.internal.impl.protobuf.ByteString getOutputFormats;
        private int getOutputMinFrameDuration;
        private java.util.List<kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Type> getOutputMinFrameDurationlomOqCM;
        private java.util.List<java.lang.Integer> getOutputSizes;
        private kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.TypeParameter.Variance getOutputStallDurationlomOqCM;

        /* synthetic */ TypeParameter(kotlin.reflect.jvm.internal.impl.protobuf.CodedInputStream codedInputStream, kotlin.reflect.jvm.internal.impl.protobuf.ExtensionRegistryLite extensionRegistryLite, byte b) throws kotlin.reflect.jvm.internal.impl.protobuf.InvalidProtocolBufferException {
            this(codedInputStream, extensionRegistryLite);
        }

        /* synthetic */ TypeParameter(kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite.ExtendableBuilder extendableBuilder, byte b) {
            this(extendableBuilder);
        }

        private TypeParameter(kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite.ExtendableBuilder<kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.TypeParameter, ?> extendableBuilder) {
            super(extendableBuilder);
            this.getHighSpeedVideoSizesFor = -1;
            this.getHighResolutionOutputSizeshNQ4ISI = (byte) -1;
            this.getOutputMinFrameDuration = -1;
            this.getOutputFormats = extendableBuilder.getUnknownFields();
        }

        private TypeParameter() {
            this.getHighSpeedVideoSizesFor = -1;
            this.getHighResolutionOutputSizeshNQ4ISI = (byte) -1;
            this.getOutputMinFrameDuration = -1;
            this.getOutputFormats = kotlin.reflect.jvm.internal.impl.protobuf.ByteString.EMPTY;
        }

        public static kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.TypeParameter getDefaultInstance() {
            return Camera2StreamConfigurationMap;
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.MessageLiteOrBuilder
        public final kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.TypeParameter getDefaultInstanceForType() {
            return Camera2StreamConfigurationMap;
        }

        /* JADX WARN: Multi-variable type inference failed */
        private TypeParameter(kotlin.reflect.jvm.internal.impl.protobuf.CodedInputStream codedInputStream, kotlin.reflect.jvm.internal.impl.protobuf.ExtensionRegistryLite extensionRegistryLite) throws kotlin.reflect.jvm.internal.impl.protobuf.InvalidProtocolBufferException {
            this.getHighSpeedVideoSizesFor = -1;
            this.getHighResolutionOutputSizeshNQ4ISI = (byte) -1;
            this.getOutputMinFrameDuration = -1;
            Camera2StreamConfigurationMap();
            kotlin.reflect.jvm.internal.impl.protobuf.ByteString.Output newOutput = kotlin.reflect.jvm.internal.impl.protobuf.ByteString.newOutput();
            kotlin.reflect.jvm.internal.impl.protobuf.CodedOutputStream newInstance = kotlin.reflect.jvm.internal.impl.protobuf.CodedOutputStream.newInstance(newOutput, 1);
            boolean z = false;
            int i = 0;
            while (!z) {
                try {
                    try {
                        try {
                            int readTag = codedInputStream.readTag();
                            if (readTag != 0) {
                                if (readTag == 8) {
                                    this.getHighSpeedVideoSizes |= 1;
                                    this.getHighSpeedVideoFpsRanges = codedInputStream.readInt32();
                                } else if (readTag == 16) {
                                    this.getHighSpeedVideoSizes |= 2;
                                    this.getInputSizeshNQ4ISI = codedInputStream.readInt32();
                                } else if (readTag == 24) {
                                    this.getHighSpeedVideoSizes |= 4;
                                    this.getInputFormats = codedInputStream.readBool();
                                } else if (readTag == 32) {
                                    int readEnum = codedInputStream.readEnum();
                                    kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.TypeParameter.Variance valueOf = kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.TypeParameter.Variance.valueOf(readEnum);
                                    if (valueOf == null) {
                                        newInstance.writeRawVarint32(readTag);
                                        newInstance.writeRawVarint32(readEnum);
                                    } else {
                                        this.getHighSpeedVideoSizes |= 8;
                                        this.getOutputStallDurationlomOqCM = valueOf;
                                    }
                                } else if (readTag == 42) {
                                    if ((i & 16) != 16) {
                                        this.getOutputMinFrameDurationlomOqCM = new java.util.ArrayList();
                                        i |= 16;
                                    }
                                    this.getOutputMinFrameDurationlomOqCM.add(codedInputStream.readMessage(kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Type.PARSER, extensionRegistryLite));
                                } else if (readTag == 48) {
                                    if ((i & 32) != 32) {
                                        this.getOutputSizes = new java.util.ArrayList();
                                        i |= 32;
                                    }
                                    this.getOutputSizes.add(java.lang.Integer.valueOf(codedInputStream.readInt32()));
                                } else if (readTag == 50) {
                                    int pushLimit = codedInputStream.pushLimit(codedInputStream.readRawVarint32());
                                    if ((i & 32) != 32 && codedInputStream.getBytesUntilLimit() > 0) {
                                        this.getOutputSizes = new java.util.ArrayList();
                                        i |= 32;
                                    }
                                    while (codedInputStream.getBytesUntilLimit() > 0) {
                                        this.getOutputSizes.add(java.lang.Integer.valueOf(codedInputStream.readInt32()));
                                    }
                                    codedInputStream.popLimit(pushLimit);
                                } else if (readTag == 802) {
                                    if ((i & 64) != 64) {
                                        this.getHighSpeedVideoFpsRangesFor = new java.util.ArrayList();
                                        i |= 64;
                                    }
                                    this.getHighSpeedVideoFpsRangesFor.add(codedInputStream.readMessage(kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Annotation.PARSER, extensionRegistryLite));
                                } else if (!parseUnknownField(codedInputStream, newInstance, extensionRegistryLite, readTag)) {
                                }
                            }
                            z = true;
                        } catch (java.io.IOException e) {
                            throw new kotlin.reflect.jvm.internal.impl.protobuf.InvalidProtocolBufferException(e.getMessage()).setUnfinishedMessage(this);
                        }
                    } catch (kotlin.reflect.jvm.internal.impl.protobuf.InvalidProtocolBufferException e2) {
                        throw e2.setUnfinishedMessage(this);
                    }
                } catch (java.lang.Throwable th) {
                    if ((i & 16) == 16) {
                        this.getOutputMinFrameDurationlomOqCM = java.util.Collections.unmodifiableList(this.getOutputMinFrameDurationlomOqCM);
                    }
                    if ((i & 32) == 32) {
                        this.getOutputSizes = java.util.Collections.unmodifiableList(this.getOutputSizes);
                    }
                    if ((i & 64) == 64) {
                        this.getHighSpeedVideoFpsRangesFor = java.util.Collections.unmodifiableList(this.getHighSpeedVideoFpsRangesFor);
                    }
                    try {
                        newInstance.flush();
                    } catch (java.io.IOException unused) {
                    } catch (java.lang.Throwable th2) {
                        this.getOutputFormats = newOutput.toByteString();
                        throw th2;
                    }
                    this.getOutputFormats = newOutput.toByteString();
                    makeExtensionsImmutable();
                    throw th;
                }
            }
            if ((i & 16) == 16) {
                this.getOutputMinFrameDurationlomOqCM = java.util.Collections.unmodifiableList(this.getOutputMinFrameDurationlomOqCM);
            }
            if ((i & 32) == 32) {
                this.getOutputSizes = java.util.Collections.unmodifiableList(this.getOutputSizes);
            }
            if ((i & 64) == 64) {
                this.getHighSpeedVideoFpsRangesFor = java.util.Collections.unmodifiableList(this.getHighSpeedVideoFpsRangesFor);
            }
            try {
                newInstance.flush();
            } catch (java.io.IOException unused2) {
            } catch (java.lang.Throwable th3) {
                this.getOutputFormats = newOutput.toByteString();
                throw th3;
            }
            this.getOutputFormats = newOutput.toByteString();
            makeExtensionsImmutable();
        }

        static {
            kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.TypeParameter typeParameter = new kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.TypeParameter();
            Camera2StreamConfigurationMap = typeParameter;
            typeParameter.Camera2StreamConfigurationMap();
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite, kotlin.reflect.jvm.internal.impl.protobuf.MessageLite
        public final kotlin.reflect.jvm.internal.impl.protobuf.Parser<kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.TypeParameter> getParserForType() {
            return PARSER;
        }

        public enum Variance implements kotlin.reflect.jvm.internal.impl.protobuf.Internal.EnumLite {
            IN(0),
            OUT(1),
            INV(2);

            private static kotlin.reflect.jvm.internal.impl.protobuf.Internal.EnumLiteMap<kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.TypeParameter.Variance> getHighSpeedVideoFpsRangesFor = new kotlin.reflect.jvm.internal.impl.protobuf.Internal.EnumLiteMap<kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.TypeParameter.Variance>() { // from class: kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.TypeParameter.Variance.1
                @Override // kotlin.reflect.jvm.internal.impl.protobuf.Internal.EnumLiteMap
                public final /* synthetic */ kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.TypeParameter.Variance findValueByNumber(int i) {
                    return kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.TypeParameter.Variance.valueOf(i);
                }
            };
            private final int getHighSpeedVideoFpsRanges;

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.Internal.EnumLite
            public final int getNumber() {
                return this.getHighSpeedVideoFpsRanges;
            }

            public static kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.TypeParameter.Variance valueOf(int i) {
                if (i == 0) {
                    return IN;
                }
                if (i == 1) {
                    return OUT;
                }
                if (i != 2) {
                    return null;
                }
                return INV;
            }

            Variance(int i) {
                this.getHighSpeedVideoFpsRanges = i;
            }
        }

        public final boolean hasId() {
            return (this.getHighSpeedVideoSizes & 1) == 1;
        }

        public final int getId() {
            return this.getHighSpeedVideoFpsRanges;
        }

        public final boolean hasName() {
            return (this.getHighSpeedVideoSizes & 2) == 2;
        }

        public final int getName() {
            return this.getInputSizeshNQ4ISI;
        }

        public final boolean hasReified() {
            return (this.getHighSpeedVideoSizes & 4) == 4;
        }

        public final boolean getReified() {
            return this.getInputFormats;
        }

        public final boolean hasVariance() {
            return (this.getHighSpeedVideoSizes & 8) == 8;
        }

        public final kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.TypeParameter.Variance getVariance() {
            return this.getOutputStallDurationlomOqCM;
        }

        public final java.util.List<kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Type> getUpperBoundList() {
            return this.getOutputMinFrameDurationlomOqCM;
        }

        public final int getUpperBoundCount() {
            return this.getOutputMinFrameDurationlomOqCM.size();
        }

        public final kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Type getUpperBound(int i) {
            return this.getOutputMinFrameDurationlomOqCM.get(i);
        }

        public final java.util.List<java.lang.Integer> getUpperBoundIdList() {
            return this.getOutputSizes;
        }

        public final java.util.List<kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Annotation> getAnnotationList() {
            return this.getHighSpeedVideoFpsRangesFor;
        }

        public final int getAnnotationCount() {
            return this.getHighSpeedVideoFpsRangesFor.size();
        }

        public final kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Annotation getAnnotation(int i) {
            return this.getHighSpeedVideoFpsRangesFor.get(i);
        }

        private void Camera2StreamConfigurationMap() {
            this.getHighSpeedVideoFpsRanges = 0;
            this.getInputSizeshNQ4ISI = 0;
            this.getInputFormats = false;
            this.getOutputStallDurationlomOqCM = kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.TypeParameter.Variance.INV;
            this.getOutputMinFrameDurationlomOqCM = java.util.Collections.emptyList();
            this.getOutputSizes = java.util.Collections.emptyList();
            this.getHighSpeedVideoFpsRangesFor = java.util.Collections.emptyList();
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.MessageLiteOrBuilder
        public final boolean isInitialized() {
            byte b = this.getHighResolutionOutputSizeshNQ4ISI;
            if (b == 1) {
                return true;
            }
            if (b == 0) {
                return false;
            }
            if (!hasId()) {
                this.getHighResolutionOutputSizeshNQ4ISI = (byte) 0;
                return false;
            }
            if (!hasName()) {
                this.getHighResolutionOutputSizeshNQ4ISI = (byte) 0;
                return false;
            }
            for (int i = 0; i < getUpperBoundCount(); i++) {
                if (!getUpperBound(i).isInitialized()) {
                    this.getHighResolutionOutputSizeshNQ4ISI = (byte) 0;
                    return false;
                }
            }
            for (int i2 = 0; i2 < getAnnotationCount(); i2++) {
                if (!getAnnotation(i2).isInitialized()) {
                    this.getHighResolutionOutputSizeshNQ4ISI = (byte) 0;
                    return false;
                }
            }
            if (!extensionsAreInitialized()) {
                this.getHighResolutionOutputSizeshNQ4ISI = (byte) 0;
                return false;
            }
            this.getHighResolutionOutputSizeshNQ4ISI = (byte) 1;
            return true;
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.MessageLite
        public final void writeTo(kotlin.reflect.jvm.internal.impl.protobuf.CodedOutputStream codedOutputStream) throws java.io.IOException {
            getSerializedSize();
            kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite.ExtendableMessage<MessageType>.ExtensionWriter newExtensionWriter = newExtensionWriter();
            if ((this.getHighSpeedVideoSizes & 1) == 1) {
                codedOutputStream.writeInt32(1, this.getHighSpeedVideoFpsRanges);
            }
            if ((this.getHighSpeedVideoSizes & 2) == 2) {
                codedOutputStream.writeInt32(2, this.getInputSizeshNQ4ISI);
            }
            if ((this.getHighSpeedVideoSizes & 4) == 4) {
                codedOutputStream.writeBool(3, this.getInputFormats);
            }
            if ((this.getHighSpeedVideoSizes & 8) == 8) {
                codedOutputStream.writeEnum(4, this.getOutputStallDurationlomOqCM.getNumber());
            }
            for (int i = 0; i < this.getOutputMinFrameDurationlomOqCM.size(); i++) {
                codedOutputStream.writeMessage(5, this.getOutputMinFrameDurationlomOqCM.get(i));
            }
            if (getUpperBoundIdList().size() > 0) {
                codedOutputStream.writeRawVarint32(50);
                codedOutputStream.writeRawVarint32(this.getHighSpeedVideoSizesFor);
            }
            for (int i2 = 0; i2 < this.getOutputSizes.size(); i2++) {
                codedOutputStream.writeInt32NoTag(this.getOutputSizes.get(i2).intValue());
            }
            for (int i3 = 0; i3 < this.getHighSpeedVideoFpsRangesFor.size(); i3++) {
                codedOutputStream.writeMessage(100, this.getHighSpeedVideoFpsRangesFor.get(i3));
            }
            newExtensionWriter.writeUntil(1000, codedOutputStream);
            codedOutputStream.writeRawBytes(this.getOutputFormats);
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.MessageLite
        public final int getSerializedSize() {
            int i = this.getOutputMinFrameDuration;
            if (i != -1) {
                return i;
            }
            int computeInt32Size = (this.getHighSpeedVideoSizes & 1) == 1 ? kotlin.reflect.jvm.internal.impl.protobuf.CodedOutputStream.computeInt32Size(1, this.getHighSpeedVideoFpsRanges) : 0;
            if ((this.getHighSpeedVideoSizes & 2) == 2) {
                computeInt32Size += kotlin.reflect.jvm.internal.impl.protobuf.CodedOutputStream.computeInt32Size(2, this.getInputSizeshNQ4ISI);
            }
            if ((this.getHighSpeedVideoSizes & 4) == 4) {
                computeInt32Size += kotlin.reflect.jvm.internal.impl.protobuf.CodedOutputStream.computeBoolSize(3, this.getInputFormats);
            }
            if ((this.getHighSpeedVideoSizes & 8) == 8) {
                computeInt32Size += kotlin.reflect.jvm.internal.impl.protobuf.CodedOutputStream.computeEnumSize(4, this.getOutputStallDurationlomOqCM.getNumber());
            }
            for (int i2 = 0; i2 < this.getOutputMinFrameDurationlomOqCM.size(); i2++) {
                computeInt32Size += kotlin.reflect.jvm.internal.impl.protobuf.CodedOutputStream.computeMessageSize(5, this.getOutputMinFrameDurationlomOqCM.get(i2));
            }
            int i3 = 0;
            for (int i4 = 0; i4 < this.getOutputSizes.size(); i4++) {
                i3 += kotlin.reflect.jvm.internal.impl.protobuf.CodedOutputStream.computeInt32SizeNoTag(this.getOutputSizes.get(i4).intValue());
            }
            int i5 = computeInt32Size + i3;
            if (!getUpperBoundIdList().isEmpty()) {
                i5 = i5 + 1 + kotlin.reflect.jvm.internal.impl.protobuf.CodedOutputStream.computeInt32SizeNoTag(i3);
            }
            this.getHighSpeedVideoSizesFor = i3;
            for (int i6 = 0; i6 < this.getHighSpeedVideoFpsRangesFor.size(); i6++) {
                i5 += kotlin.reflect.jvm.internal.impl.protobuf.CodedOutputStream.computeMessageSize(100, this.getHighSpeedVideoFpsRangesFor.get(i6));
            }
            int extensionsSerializedSize = i5 + extensionsSerializedSize() + this.getOutputFormats.size();
            this.getOutputMinFrameDuration = extensionsSerializedSize;
            return extensionsSerializedSize;
        }

        public static kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.TypeParameter.Builder newBuilder() {
            return kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.TypeParameter.Builder.getHighResolutionOutputSizeshNQ4ISI();
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.MessageLite
        public final kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.TypeParameter.Builder newBuilderForType() {
            return newBuilder();
        }

        public static kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.TypeParameter.Builder newBuilder(kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.TypeParameter typeParameter) {
            return newBuilder().mergeFrom(typeParameter);
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.MessageLite
        public final kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.TypeParameter.Builder toBuilder() {
            return newBuilder(this);
        }

        public static final class Builder extends kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite.ExtendableBuilder<kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.TypeParameter, kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.TypeParameter.Builder> implements kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.TypeParameterOrBuilder {
            private int Camera2StreamConfigurationMap;
            private boolean getHighResolutionOutputSizeshNQ4ISI;
            private int getHighSpeedVideoFpsRangesFor;
            private int getHighSpeedVideoSizes;
            private kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.TypeParameter.Variance getOutputMinFrameDuration = kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.TypeParameter.Variance.INV;
            private java.util.List<kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Type> getInputSizeshNQ4ISI = java.util.Collections.emptyList();
            private java.util.List<java.lang.Integer> getHighSpeedVideoSizesFor = java.util.Collections.emptyList();
            private java.util.List<kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Annotation> getHighSpeedVideoFpsRanges = java.util.Collections.emptyList();

            private Builder() {
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite.Builder, kotlin.reflect.jvm.internal.impl.protobuf.MessageLiteOrBuilder
            public final kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.TypeParameter getDefaultInstanceForType() {
                return kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.TypeParameter.getDefaultInstance();
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.MessageLite.Builder
            public final kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.TypeParameter build() {
                kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.TypeParameter buildPartial = buildPartial();
                if (buildPartial.isInitialized()) {
                    return buildPartial;
                }
                throw newUninitializedMessageException(buildPartial);
            }

            /* JADX WARN: Multi-variable type inference failed */
            public final kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.TypeParameter buildPartial() {
                kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.TypeParameter typeParameter = new kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.TypeParameter((kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite.ExtendableBuilder) this, (byte) (0 == true ? 1 : 0));
                int i = this.Camera2StreamConfigurationMap;
                int i2 = (i & 1) == 1 ? 1 : 0;
                typeParameter.getHighSpeedVideoFpsRanges = this.getHighSpeedVideoFpsRangesFor;
                if ((i & 2) == 2) {
                    i2 |= 2;
                }
                typeParameter.getInputSizeshNQ4ISI = this.getHighSpeedVideoSizes;
                if ((i & 4) == 4) {
                    i2 |= 4;
                }
                typeParameter.getInputFormats = this.getHighResolutionOutputSizeshNQ4ISI;
                if ((i & 8) == 8) {
                    i2 |= 8;
                }
                typeParameter.getOutputStallDurationlomOqCM = this.getOutputMinFrameDuration;
                if ((this.Camera2StreamConfigurationMap & 16) == 16) {
                    this.getInputSizeshNQ4ISI = java.util.Collections.unmodifiableList(this.getInputSizeshNQ4ISI);
                    this.Camera2StreamConfigurationMap &= -17;
                }
                typeParameter.getOutputMinFrameDurationlomOqCM = this.getInputSizeshNQ4ISI;
                if ((this.Camera2StreamConfigurationMap & 32) == 32) {
                    this.getHighSpeedVideoSizesFor = java.util.Collections.unmodifiableList(this.getHighSpeedVideoSizesFor);
                    this.Camera2StreamConfigurationMap &= -33;
                }
                typeParameter.getOutputSizes = this.getHighSpeedVideoSizesFor;
                if ((this.Camera2StreamConfigurationMap & 64) == 64) {
                    this.getHighSpeedVideoFpsRanges = java.util.Collections.unmodifiableList(this.getHighSpeedVideoFpsRanges);
                    this.Camera2StreamConfigurationMap &= -65;
                }
                typeParameter.getHighSpeedVideoFpsRangesFor = this.getHighSpeedVideoFpsRanges;
                typeParameter.getHighSpeedVideoSizes = i2;
                return typeParameter;
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite.Builder
            public final kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.TypeParameter.Builder mergeFrom(kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.TypeParameter typeParameter) {
                if (typeParameter == kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.TypeParameter.getDefaultInstance()) {
                    return this;
                }
                if (typeParameter.hasId()) {
                    setId(typeParameter.getId());
                }
                if (typeParameter.hasName()) {
                    setName(typeParameter.getName());
                }
                if (typeParameter.hasReified()) {
                    setReified(typeParameter.getReified());
                }
                if (typeParameter.hasVariance()) {
                    setVariance(typeParameter.getVariance());
                }
                if (!typeParameter.getOutputMinFrameDurationlomOqCM.isEmpty()) {
                    if (this.getInputSizeshNQ4ISI.isEmpty()) {
                        this.getInputSizeshNQ4ISI = typeParameter.getOutputMinFrameDurationlomOqCM;
                        this.Camera2StreamConfigurationMap &= -17;
                    } else {
                        getHighSpeedVideoFpsRangesFor();
                        this.getInputSizeshNQ4ISI.addAll(typeParameter.getOutputMinFrameDurationlomOqCM);
                    }
                }
                if (!typeParameter.getOutputSizes.isEmpty()) {
                    if (this.getHighSpeedVideoSizesFor.isEmpty()) {
                        this.getHighSpeedVideoSizesFor = typeParameter.getOutputSizes;
                        this.Camera2StreamConfigurationMap &= -33;
                    } else {
                        if ((this.Camera2StreamConfigurationMap & 32) != 32) {
                            this.getHighSpeedVideoSizesFor = new java.util.ArrayList(this.getHighSpeedVideoSizesFor);
                            this.Camera2StreamConfigurationMap |= 32;
                        }
                        this.getHighSpeedVideoSizesFor.addAll(typeParameter.getOutputSizes);
                    }
                }
                if (!typeParameter.getHighSpeedVideoFpsRangesFor.isEmpty()) {
                    if (this.getHighSpeedVideoFpsRanges.isEmpty()) {
                        this.getHighSpeedVideoFpsRanges = typeParameter.getHighSpeedVideoFpsRangesFor;
                        this.Camera2StreamConfigurationMap &= -65;
                    } else {
                        Camera2StreamConfigurationMap();
                        this.getHighSpeedVideoFpsRanges.addAll(typeParameter.getHighSpeedVideoFpsRangesFor);
                    }
                }
                mergeExtensionFields(typeParameter);
                setUnknownFields(getUnknownFields().concat(typeParameter.getOutputFormats));
                return this;
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.MessageLiteOrBuilder
            public final boolean isInitialized() {
                if (!hasId() || !hasName()) {
                    return false;
                }
                for (int i = 0; i < getUpperBoundCount(); i++) {
                    if (!getUpperBound(i).isInitialized()) {
                        return false;
                    }
                }
                for (int i2 = 0; i2 < getAnnotationCount(); i2++) {
                    if (!getAnnotation(i2).isInitialized()) {
                        return false;
                    }
                }
                return extensionsAreInitialized();
            }

            /* JADX WARN: Removed duplicated region for block: B:15:0x001d  */
            @Override // kotlin.reflect.jvm.internal.impl.protobuf.AbstractMessageLite.Builder, kotlin.reflect.jvm.internal.impl.protobuf.MessageLite.Builder
            /*
                Code decompiled incorrectly, please refer to instructions dump.
            */
            public final kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.TypeParameter.Builder mergeFrom(kotlin.reflect.jvm.internal.impl.protobuf.CodedInputStream codedInputStream, kotlin.reflect.jvm.internal.impl.protobuf.ExtensionRegistryLite extensionRegistryLite) throws java.io.IOException {
                kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.TypeParameter typeParameter;
                try {
                    try {
                        kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.TypeParameter parsePartialFrom = kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.TypeParameter.PARSER.parsePartialFrom(codedInputStream, extensionRegistryLite);
                        if (parsePartialFrom != null) {
                            mergeFrom(parsePartialFrom);
                        }
                        return this;
                    } catch (kotlin.reflect.jvm.internal.impl.protobuf.InvalidProtocolBufferException e) {
                        typeParameter = (kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.TypeParameter) e.getUnfinishedMessage();
                        try {
                            throw e;
                        } catch (java.lang.Throwable th) {
                            th = th;
                            if (typeParameter != null) {
                                mergeFrom(typeParameter);
                            }
                            throw th;
                        }
                    }
                } catch (java.lang.Throwable th2) {
                    th = th2;
                    typeParameter = null;
                    if (typeParameter != null) {
                    }
                    throw th;
                }
            }

            public final boolean hasId() {
                return (this.Camera2StreamConfigurationMap & 1) == 1;
            }

            public final kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.TypeParameter.Builder setId(int i) {
                this.Camera2StreamConfigurationMap |= 1;
                this.getHighSpeedVideoFpsRangesFor = i;
                return this;
            }

            public final boolean hasName() {
                return (this.Camera2StreamConfigurationMap & 2) == 2;
            }

            public final kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.TypeParameter.Builder setName(int i) {
                this.Camera2StreamConfigurationMap |= 2;
                this.getHighSpeedVideoSizes = i;
                return this;
            }

            public final kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.TypeParameter.Builder setReified(boolean z) {
                this.Camera2StreamConfigurationMap |= 4;
                this.getHighResolutionOutputSizeshNQ4ISI = z;
                return this;
            }

            public final kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.TypeParameter.Builder setVariance(kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.TypeParameter.Variance variance) {
                this.Camera2StreamConfigurationMap |= 8;
                this.getOutputMinFrameDuration = variance;
                return this;
            }

            private void getHighSpeedVideoFpsRangesFor() {
                if ((this.Camera2StreamConfigurationMap & 16) != 16) {
                    this.getInputSizeshNQ4ISI = new java.util.ArrayList(this.getInputSizeshNQ4ISI);
                    this.Camera2StreamConfigurationMap |= 16;
                }
            }

            public final int getUpperBoundCount() {
                return this.getInputSizeshNQ4ISI.size();
            }

            public final kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Type getUpperBound(int i) {
                return this.getInputSizeshNQ4ISI.get(i);
            }

            public final kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.TypeParameter.Builder addUpperBound(kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Type type) {
                getHighSpeedVideoFpsRangesFor();
                this.getInputSizeshNQ4ISI.add(type);
                return this;
            }

            private void Camera2StreamConfigurationMap() {
                if ((this.Camera2StreamConfigurationMap & 64) != 64) {
                    this.getHighSpeedVideoFpsRanges = new java.util.ArrayList(this.getHighSpeedVideoFpsRanges);
                    this.Camera2StreamConfigurationMap |= 64;
                }
            }

            public final int getAnnotationCount() {
                return this.getHighSpeedVideoFpsRanges.size();
            }

            public final kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Annotation getAnnotation(int i) {
                return this.getHighSpeedVideoFpsRanges.get(i);
            }

            public final kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.TypeParameter.Builder addAnnotation(kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Annotation annotation) {
                Camera2StreamConfigurationMap();
                this.getHighSpeedVideoFpsRanges.add(annotation);
                return this;
            }

            static /* synthetic */ kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.TypeParameter.Builder getHighResolutionOutputSizeshNQ4ISI() {
                return new kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.TypeParameter.Builder();
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite.ExtendableBuilder, kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite.Builder, kotlin.reflect.jvm.internal.impl.protobuf.AbstractMessageLite.Builder
            /* renamed from: clone */
            public final kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.TypeParameter.Builder mo23897clone() {
                return new kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.TypeParameter.Builder().mergeFrom(buildPartial());
            }
        }
    }

    public static final class Class extends kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite.ExtendableMessage<kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Class> implements kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.ClassOrBuilder {
        public static kotlin.reflect.jvm.internal.impl.protobuf.Parser<kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Class> PARSER = new kotlin.reflect.jvm.internal.impl.protobuf.AbstractParser<kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Class>() { // from class: kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Class.1
            @Override // kotlin.reflect.jvm.internal.impl.protobuf.Parser
            public final /* synthetic */ java.lang.Object parsePartialFrom(kotlin.reflect.jvm.internal.impl.protobuf.CodedInputStream codedInputStream, kotlin.reflect.jvm.internal.impl.protobuf.ExtensionRegistryLite extensionRegistryLite) throws kotlin.reflect.jvm.internal.impl.protobuf.InvalidProtocolBufferException {
                return new kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Class(codedInputStream, extensionRegistryLite, (byte) 0);
            }
        };
        private static final kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Class getHighSpeedVideoFpsRangesFor;
        private kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.VersionRequirementTable AMEXKernel;
        private int ArtificialStackFrames;
        private int Camera2StreamConfigurationMap;
        private java.util.List<java.lang.Integer> CoroutineDebuggingKt;
        private java.util.List<kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.TypeAlias> _BOUNDARY;
        private java.util.List<kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Type> _CREATION;

        /* renamed from: a, reason: collision with root package name */
        private final kotlin.reflect.jvm.internal.impl.protobuf.ByteString f6920a;
        private java.util.List<kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Property> accessartificialFrame;
        private java.util.List<kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.TypeParameter> b;
        private int coroutineBoundary;
        private java.util.List<java.lang.Integer> coroutineCreation;
        private kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.TypeTable getARTIFICIAL_FRAME_PACKAGE_NAME;
        private java.util.List<kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.CompilerPluginData> getHighResolutionOutputSizeshNQ4ISI;
        private java.util.List<kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Annotation> getHighSpeedVideoFpsRanges;
        private int getHighSpeedVideoSizes;
        private java.util.List<kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Type> getHighSpeedVideoSizesFor;
        private java.util.List<kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.EnumEntry> getInputFormats;
        private java.util.List<kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Constructor> getInputSizeshNQ4ISI;
        private int getOutputFormats;
        private java.util.List<java.lang.Integer> getOutputMinFrameDuration;
        private int getOutputMinFrameDurationlomOqCM;
        private java.util.List<kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Function> getOutputSizes;
        private int getOutputSizeshNQ4ISI;
        private int getOutputStallDuration;
        private int getOutputStallDurationlomOqCM;
        private kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Type getValidOutputFormatsForInputhNQ4ISI;
        private java.util.List<java.lang.Integer> init;
        private int isOutputSupportedFor;
        private byte isOutputSupportedForhNQ4ISI;
        private int toString;
        private java.util.List<java.lang.Integer> unwrapAs;

        /* synthetic */ Class(kotlin.reflect.jvm.internal.impl.protobuf.CodedInputStream codedInputStream, kotlin.reflect.jvm.internal.impl.protobuf.ExtensionRegistryLite extensionRegistryLite, byte b) throws kotlin.reflect.jvm.internal.impl.protobuf.InvalidProtocolBufferException {
            this(codedInputStream, extensionRegistryLite);
        }

        /* synthetic */ Class(kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite.ExtendableBuilder extendableBuilder, byte b) {
            this(extendableBuilder);
        }

        private Class(kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite.ExtendableBuilder<kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Class, ?> extendableBuilder) {
            super(extendableBuilder);
            this.coroutineBoundary = -1;
            this.isOutputSupportedFor = -1;
            this.getOutputFormats = -1;
            this.ArtificialStackFrames = -1;
            this.isOutputSupportedForhNQ4ISI = (byte) -1;
            this.toString = -1;
            this.f6920a = extendableBuilder.getUnknownFields();
        }

        private Class() {
            this.coroutineBoundary = -1;
            this.isOutputSupportedFor = -1;
            this.getOutputFormats = -1;
            this.ArtificialStackFrames = -1;
            this.isOutputSupportedForhNQ4ISI = (byte) -1;
            this.toString = -1;
            this.f6920a = kotlin.reflect.jvm.internal.impl.protobuf.ByteString.EMPTY;
        }

        public static kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Class getDefaultInstance() {
            return getHighSpeedVideoFpsRangesFor;
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.MessageLiteOrBuilder
        public final kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Class getDefaultInstanceForType() {
            return getHighSpeedVideoFpsRangesFor;
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r5v1 */
        /* JADX WARN: Type inference failed for: r5v11, types: [boolean] */
        /* JADX WARN: Type inference failed for: r5v2 */
        /* JADX WARN: Type inference failed for: r8v11 */
        /* JADX WARN: Type inference failed for: r8v13 */
        /* JADX WARN: Type inference failed for: r8v15 */
        /* JADX WARN: Type inference failed for: r8v17 */
        /* JADX WARN: Type inference failed for: r8v19 */
        /* JADX WARN: Type inference failed for: r8v21 */
        /* JADX WARN: Type inference failed for: r8v23 */
        /* JADX WARN: Type inference failed for: r8v25 */
        /* JADX WARN: Type inference failed for: r8v27 */
        /* JADX WARN: Type inference failed for: r8v29 */
        /* JADX WARN: Type inference failed for: r8v3 */
        /* JADX WARN: Type inference failed for: r8v31 */
        /* JADX WARN: Type inference failed for: r8v33 */
        /* JADX WARN: Type inference failed for: r8v35 */
        /* JADX WARN: Type inference failed for: r8v37 */
        /* JADX WARN: Type inference failed for: r8v39 */
        /* JADX WARN: Type inference failed for: r8v42 */
        /* JADX WARN: Type inference failed for: r8v5 */
        /* JADX WARN: Type inference failed for: r8v7 */
        /* JADX WARN: Type inference failed for: r8v9 */
        private Class(kotlin.reflect.jvm.internal.impl.protobuf.CodedInputStream codedInputStream, kotlin.reflect.jvm.internal.impl.protobuf.ExtensionRegistryLite extensionRegistryLite) throws kotlin.reflect.jvm.internal.impl.protobuf.InvalidProtocolBufferException {
            boolean z;
            this.coroutineBoundary = -1;
            this.isOutputSupportedFor = -1;
            this.getOutputFormats = -1;
            this.ArtificialStackFrames = -1;
            this.isOutputSupportedForhNQ4ISI = (byte) -1;
            this.toString = -1;
            getHighSpeedVideoSizes();
            kotlin.reflect.jvm.internal.impl.protobuf.ByteString.Output newOutput = kotlin.reflect.jvm.internal.impl.protobuf.ByteString.newOutput();
            kotlin.reflect.jvm.internal.impl.protobuf.CodedOutputStream newInstance = kotlin.reflect.jvm.internal.impl.protobuf.CodedOutputStream.newInstance(newOutput, 1);
            boolean z2 = false;
            char c = 0;
            while (true) {
                ?? r5 = 64;
                if (z2) {
                    if (((c == true ? 1 : 0) & 32) == 32) {
                        this.coroutineCreation = java.util.Collections.unmodifiableList(this.coroutineCreation);
                    }
                    if (((c == true ? 1 : 0) & 8) == 8) {
                        this.b = java.util.Collections.unmodifiableList(this.b);
                    }
                    if (((c == true ? 1 : 0) & 16) == 16) {
                        this._CREATION = java.util.Collections.unmodifiableList(this._CREATION);
                    }
                    if (((c == true ? 1 : 0) & 64) == 64) {
                        this.unwrapAs = java.util.Collections.unmodifiableList(this.unwrapAs);
                    }
                    if (((c == true ? 1 : 0) & 512) == 512) {
                        this.getInputSizeshNQ4ISI = java.util.Collections.unmodifiableList(this.getInputSizeshNQ4ISI);
                    }
                    if (((c == true ? 1 : 0) & 1024) == 1024) {
                        this.getOutputSizes = java.util.Collections.unmodifiableList(this.getOutputSizes);
                    }
                    if (((c == true ? 1 : 0) & 2048) == 2048) {
                        this.accessartificialFrame = java.util.Collections.unmodifiableList(this.accessartificialFrame);
                    }
                    if (((c == true ? 1 : 0) & 4096) == 4096) {
                        this._BOUNDARY = java.util.Collections.unmodifiableList(this._BOUNDARY);
                    }
                    if (((c == true ? 1 : 0) & 8192) == 8192) {
                        this.getInputFormats = java.util.Collections.unmodifiableList(this.getInputFormats);
                    }
                    if (((c == true ? 1 : 0) & 16384) == 16384) {
                        this.CoroutineDebuggingKt = java.util.Collections.unmodifiableList(this.CoroutineDebuggingKt);
                    }
                    if (((c == true ? 1 : 0) & 128) == 128) {
                        this.getHighSpeedVideoSizesFor = java.util.Collections.unmodifiableList(this.getHighSpeedVideoSizesFor);
                    }
                    if (((c == true ? 1 : 0) & 256) == 256) {
                        this.getOutputMinFrameDuration = java.util.Collections.unmodifiableList(this.getOutputMinFrameDuration);
                    }
                    if (((c == true ? 1 : 0) & 262144) == 262144) {
                        this.getHighSpeedVideoFpsRanges = java.util.Collections.unmodifiableList(this.getHighSpeedVideoFpsRanges);
                    }
                    if (((c == true ? 1 : 0) & 1048576) == 1048576) {
                        this.init = java.util.Collections.unmodifiableList(this.init);
                    }
                    if (((c == true ? 1 : 0) & 4194304) == 4194304) {
                        this.getHighResolutionOutputSizeshNQ4ISI = java.util.Collections.unmodifiableList(this.getHighResolutionOutputSizeshNQ4ISI);
                    }
                    try {
                        newInstance.flush();
                    } catch (java.io.IOException unused) {
                    } catch (java.lang.Throwable th) {
                        this.f6920a = newOutput.toByteString();
                        throw th;
                    }
                    this.f6920a = newOutput.toByteString();
                    makeExtensionsImmutable();
                    return;
                }
                try {
                    try {
                        int readTag = codedInputStream.readTag();
                        switch (readTag) {
                            case 0:
                                z = true;
                                z2 = z;
                            case 8:
                                z = true;
                                this.getHighSpeedVideoSizes |= 1;
                                this.getOutputStallDuration = codedInputStream.readInt32();
                            case 16:
                                int i = (c == true ? 1 : 0) & 32;
                                char c2 = c;
                                if (i != 32) {
                                    this.coroutineCreation = new java.util.ArrayList();
                                    c2 = (c == true ? 1 : 0) | ' ';
                                }
                                this.coroutineCreation.add(java.lang.Integer.valueOf(codedInputStream.readInt32()));
                                c = c2;
                                z = true;
                            case 18:
                                int pushLimit = codedInputStream.pushLimit(codedInputStream.readRawVarint32());
                                int i2 = (c == true ? 1 : 0) & 32;
                                char c3 = c;
                                if (i2 != 32) {
                                    c3 = c;
                                    if (codedInputStream.getBytesUntilLimit() > 0) {
                                        this.coroutineCreation = new java.util.ArrayList();
                                        c3 = (c == true ? 1 : 0) | ' ';
                                    }
                                }
                                while (codedInputStream.getBytesUntilLimit() > 0) {
                                    this.coroutineCreation.add(java.lang.Integer.valueOf(codedInputStream.readInt32()));
                                }
                                codedInputStream.popLimit(pushLimit);
                                c = c3;
                                z = true;
                            case 24:
                                this.getHighSpeedVideoSizes |= 2;
                                this.getOutputSizeshNQ4ISI = codedInputStream.readInt32();
                                c = c;
                                z = true;
                            case 32:
                                this.getHighSpeedVideoSizes |= 4;
                                this.Camera2StreamConfigurationMap = codedInputStream.readInt32();
                                c = c;
                                z = true;
                            case 42:
                                int i3 = (c == true ? 1 : 0) & 8;
                                char c4 = c;
                                if (i3 != 8) {
                                    this.b = new java.util.ArrayList();
                                    c4 = (c == true ? 1 : 0) | '\b';
                                }
                                this.b.add(codedInputStream.readMessage(kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.TypeParameter.PARSER, extensionRegistryLite));
                                c = c4;
                                z = true;
                            case 50:
                                int i4 = (c == true ? 1 : 0) & 16;
                                char c5 = c;
                                if (i4 != 16) {
                                    this._CREATION = new java.util.ArrayList();
                                    c5 = (c == true ? 1 : 0) | 16;
                                }
                                this._CREATION.add(codedInputStream.readMessage(kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Type.PARSER, extensionRegistryLite));
                                c = c5;
                                z = true;
                            case 56:
                                int i5 = (c == true ? 1 : 0) & 64;
                                char c6 = c;
                                if (i5 != 64) {
                                    this.unwrapAs = new java.util.ArrayList();
                                    c6 = (c == true ? 1 : 0) | '@';
                                }
                                this.unwrapAs.add(java.lang.Integer.valueOf(codedInputStream.readInt32()));
                                c = c6;
                                z = true;
                            case 58:
                                int pushLimit2 = codedInputStream.pushLimit(codedInputStream.readRawVarint32());
                                int i6 = (c == true ? 1 : 0) & 64;
                                char c7 = c;
                                if (i6 != 64) {
                                    c7 = c;
                                    if (codedInputStream.getBytesUntilLimit() > 0) {
                                        this.unwrapAs = new java.util.ArrayList();
                                        c7 = (c == true ? 1 : 0) | '@';
                                    }
                                }
                                while (codedInputStream.getBytesUntilLimit() > 0) {
                                    this.unwrapAs.add(java.lang.Integer.valueOf(codedInputStream.readInt32()));
                                }
                                codedInputStream.popLimit(pushLimit2);
                                c = c7;
                                z = true;
                            case 66:
                                int i7 = (c == true ? 1 : 0) & 512;
                                char c8 = c;
                                if (i7 != 512) {
                                    this.getInputSizeshNQ4ISI = new java.util.ArrayList();
                                    c8 = (c == true ? 1 : 0) | 512;
                                }
                                this.getInputSizeshNQ4ISI.add(codedInputStream.readMessage(kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Constructor.PARSER, extensionRegistryLite));
                                c = c8;
                                z = true;
                            case 74:
                                int i8 = (c == true ? 1 : 0) & 1024;
                                char c9 = c;
                                if (i8 != 1024) {
                                    this.getOutputSizes = new java.util.ArrayList();
                                    c9 = (c == true ? 1 : 0) | 1024;
                                }
                                this.getOutputSizes.add(codedInputStream.readMessage(kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Function.PARSER, extensionRegistryLite));
                                c = c9;
                                z = true;
                            case 82:
                                int i9 = (c == true ? 1 : 0) & 2048;
                                char c10 = c;
                                if (i9 != 2048) {
                                    this.accessartificialFrame = new java.util.ArrayList();
                                    c10 = (c == true ? 1 : 0) | 2048;
                                }
                                this.accessartificialFrame.add(codedInputStream.readMessage(kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Property.PARSER, extensionRegistryLite));
                                c = c10;
                                z = true;
                            case 90:
                                int i10 = (c == true ? 1 : 0) & 4096;
                                char c11 = c;
                                if (i10 != 4096) {
                                    this._BOUNDARY = new java.util.ArrayList();
                                    c11 = (c == true ? 1 : 0) | 4096;
                                }
                                this._BOUNDARY.add(codedInputStream.readMessage(kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.TypeAlias.PARSER, extensionRegistryLite));
                                c = c11;
                                z = true;
                            case 106:
                                int i11 = (c == true ? 1 : 0) & 8192;
                                char c12 = c;
                                if (i11 != 8192) {
                                    this.getInputFormats = new java.util.ArrayList();
                                    c12 = (c == true ? 1 : 0) | 8192;
                                }
                                this.getInputFormats.add(codedInputStream.readMessage(kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.EnumEntry.PARSER, extensionRegistryLite));
                                c = c12;
                                z = true;
                            case 128:
                                int i12 = (c == true ? 1 : 0) & 16384;
                                char c13 = c;
                                if (i12 != 16384) {
                                    this.CoroutineDebuggingKt = new java.util.ArrayList();
                                    c13 = (c == true ? 1 : 0) | 16384;
                                }
                                this.CoroutineDebuggingKt.add(java.lang.Integer.valueOf(codedInputStream.readInt32()));
                                c = c13;
                                z = true;
                            case 130:
                                int pushLimit3 = codedInputStream.pushLimit(codedInputStream.readRawVarint32());
                                int i13 = (c == true ? 1 : 0) & 16384;
                                char c14 = c;
                                if (i13 != 16384) {
                                    c14 = c;
                                    if (codedInputStream.getBytesUntilLimit() > 0) {
                                        this.CoroutineDebuggingKt = new java.util.ArrayList();
                                        c14 = (c == true ? 1 : 0) | 16384;
                                    }
                                }
                                while (codedInputStream.getBytesUntilLimit() > 0) {
                                    this.CoroutineDebuggingKt.add(java.lang.Integer.valueOf(codedInputStream.readInt32()));
                                }
                                codedInputStream.popLimit(pushLimit3);
                                c = c14;
                                z = true;
                            case 136:
                                this.getHighSpeedVideoSizes |= 8;
                                this.getOutputMinFrameDurationlomOqCM = codedInputStream.readInt32();
                                c = c;
                                z = true;
                            case 146:
                                kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Type.Builder builder = (this.getHighSpeedVideoSizes & 16) == 16 ? this.getValidOutputFormatsForInputhNQ4ISI.toBuilder() : null;
                                kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Type type = (kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Type) codedInputStream.readMessage(kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Type.PARSER, extensionRegistryLite);
                                this.getValidOutputFormatsForInputhNQ4ISI = type;
                                if (builder != null) {
                                    builder.mergeFrom(type);
                                    this.getValidOutputFormatsForInputhNQ4ISI = builder.buildPartial();
                                }
                                this.getHighSpeedVideoSizes |= 16;
                                c = c;
                                z = true;
                            case 152:
                                this.getHighSpeedVideoSizes |= 32;
                                this.getOutputStallDurationlomOqCM = codedInputStream.readInt32();
                                c = c;
                                z = true;
                            case SDK_ASSET_ILLUSTRATION_SUPPORT_VALUE:
                                int i14 = (c == true ? 1 : 0) & 128;
                                char c15 = c;
                                if (i14 != 128) {
                                    this.getHighSpeedVideoSizesFor = new java.util.ArrayList();
                                    c15 = (c == true ? 1 : 0) | 128;
                                }
                                this.getHighSpeedVideoSizesFor.add(codedInputStream.readMessage(kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Type.PARSER, extensionRegistryLite));
                                c = c15;
                                z = true;
                            case SDK_ASSET_ILLUSTRATION_CODE_ACCOUNT_VERIFICATION_VALUE:
                                int i15 = (c == true ? 1 : 0) & 256;
                                char c16 = c;
                                if (i15 != 256) {
                                    this.getOutputMinFrameDuration = new java.util.ArrayList();
                                    c16 = (c == true ? 1 : 0) | 256;
                                }
                                this.getOutputMinFrameDuration.add(java.lang.Integer.valueOf(codedInputStream.readInt32()));
                                c = c16;
                                z = true;
                            case SDK_ASSET_ILLUSTRATION_INCOME_PAYROLL_URL_VALUE:
                                int pushLimit4 = codedInputStream.pushLimit(codedInputStream.readRawVarint32());
                                int i16 = (c == true ? 1 : 0) & 256;
                                char c17 = c;
                                if (i16 != 256) {
                                    c17 = c;
                                    if (codedInputStream.getBytesUntilLimit() > 0) {
                                        this.getOutputMinFrameDuration = new java.util.ArrayList();
                                        c17 = (c == true ? 1 : 0) | 256;
                                    }
                                }
                                while (codedInputStream.getBytesUntilLimit() > 0) {
                                    this.getOutputMinFrameDuration.add(java.lang.Integer.valueOf(codedInputStream.readInt32()));
                                }
                                codedInputStream.popLimit(pushLimit4);
                                c = c17;
                                z = true;
                            case 202:
                                int i17 = (c == true ? 1 : 0) & 262144;
                                char c18 = c;
                                if (i17 != 262144) {
                                    this.getHighSpeedVideoFpsRanges = new java.util.ArrayList();
                                    c18 = (c == true ? 1 : 0) | 0;
                                }
                                this.getHighSpeedVideoFpsRanges.add(codedInputStream.readMessage(kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Annotation.PARSER, extensionRegistryLite));
                                c = c18;
                                z = true;
                            case SDK_ASSET_ILLUSTRATION_PLAID_OVERLAY_ACCOUNT_NUMBER_CONFIRMED_VALUE:
                                kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.TypeTable.Builder builder2 = (this.getHighSpeedVideoSizes & 64) == 64 ? this.getARTIFICIAL_FRAME_PACKAGE_NAME.toBuilder() : null;
                                kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.TypeTable typeTable = (kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.TypeTable) codedInputStream.readMessage(kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.TypeTable.PARSER, extensionRegistryLite);
                                this.getARTIFICIAL_FRAME_PACKAGE_NAME = typeTable;
                                if (builder2 != null) {
                                    builder2.mergeFrom(typeTable);
                                    this.getARTIFICIAL_FRAME_PACKAGE_NAME = builder2.buildPartial();
                                }
                                this.getHighSpeedVideoSizes |= 64;
                                c = c;
                                z = true;
                            case SDK_ASSET_ILLUSTRATION_PLAID_OVERLAY_INSTITUTION_TRANSFER_VALUE:
                                int i18 = (c == true ? 1 : 0) & 1048576;
                                char c19 = c;
                                if (i18 != 1048576) {
                                    this.init = new java.util.ArrayList();
                                    c19 = (c == true ? 1 : 0) | 0;
                                }
                                this.init.add(java.lang.Integer.valueOf(codedInputStream.readInt32()));
                                c = c19;
                                z = true;
                            case 250:
                                int pushLimit5 = codedInputStream.pushLimit(codedInputStream.readRawVarint32());
                                int i19 = (c == true ? 1 : 0) & 1048576;
                                char c20 = c;
                                if (i19 != 1048576) {
                                    c20 = c;
                                    if (codedInputStream.getBytesUntilLimit() > 0) {
                                        this.init = new java.util.ArrayList();
                                        c20 = (c == true ? 1 : 0) | 0;
                                    }
                                }
                                while (codedInputStream.getBytesUntilLimit() > 0) {
                                    this.init.add(java.lang.Integer.valueOf(codedInputStream.readInt32()));
                                }
                                codedInputStream.popLimit(pushLimit5);
                                c = c20;
                                z = true;
                            case 258:
                                kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.VersionRequirementTable.Builder builder3 = (this.getHighSpeedVideoSizes & 128) == 128 ? this.AMEXKernel.toBuilder() : null;
                                kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.VersionRequirementTable versionRequirementTable = (kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.VersionRequirementTable) codedInputStream.readMessage(kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.VersionRequirementTable.PARSER, extensionRegistryLite);
                                this.AMEXKernel = versionRequirementTable;
                                if (builder3 != null) {
                                    builder3.mergeFrom(versionRequirementTable);
                                    this.AMEXKernel = builder3.buildPartial();
                                }
                                this.getHighSpeedVideoSizes |= 128;
                                c = c;
                                z = true;
                            case SDK_ASSET_ILLUSTRATION_CRA_OVERLAY_ACCOUNT_VALUE:
                                int i20 = (c == true ? 1 : 0) & 4194304;
                                char c21 = c;
                                if (i20 != 4194304) {
                                    this.getHighResolutionOutputSizeshNQ4ISI = new java.util.ArrayList();
                                    c21 = (c == true ? 1 : 0) | 0;
                                }
                                this.getHighResolutionOutputSizeshNQ4ISI.add(codedInputStream.readMessage(kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.CompilerPluginData.PARSER, extensionRegistryLite));
                                c = c21;
                                z = true;
                            default:
                                z = true;
                                r5 = parseUnknownField(codedInputStream, newInstance, extensionRegistryLite, readTag);
                                c = r5 != 0 ? c : c;
                                z2 = z;
                        }
                    } catch (kotlin.reflect.jvm.internal.impl.protobuf.InvalidProtocolBufferException e) {
                        throw e.setUnfinishedMessage(this);
                    } catch (java.io.IOException e2) {
                        throw new kotlin.reflect.jvm.internal.impl.protobuf.InvalidProtocolBufferException(e2.getMessage()).setUnfinishedMessage(this);
                    }
                } catch (java.lang.Throwable th2) {
                    if (((c == true ? 1 : 0) & 32) == 32) {
                        this.coroutineCreation = java.util.Collections.unmodifiableList(this.coroutineCreation);
                    }
                    if (((c == true ? 1 : 0) & 8) == 8) {
                        this.b = java.util.Collections.unmodifiableList(this.b);
                    }
                    if (((c == true ? 1 : 0) & 16) == 16) {
                        this._CREATION = java.util.Collections.unmodifiableList(this._CREATION);
                    }
                    if (((c == true ? 1 : 0) & 64) == r5) {
                        this.unwrapAs = java.util.Collections.unmodifiableList(this.unwrapAs);
                    }
                    if (((c == true ? 1 : 0) & 512) == 512) {
                        this.getInputSizeshNQ4ISI = java.util.Collections.unmodifiableList(this.getInputSizeshNQ4ISI);
                    }
                    if (((c == true ? 1 : 0) & 1024) == 1024) {
                        this.getOutputSizes = java.util.Collections.unmodifiableList(this.getOutputSizes);
                    }
                    if (((c == true ? 1 : 0) & 2048) == 2048) {
                        this.accessartificialFrame = java.util.Collections.unmodifiableList(this.accessartificialFrame);
                    }
                    if (((c == true ? 1 : 0) & 4096) == 4096) {
                        this._BOUNDARY = java.util.Collections.unmodifiableList(this._BOUNDARY);
                    }
                    if (((c == true ? 1 : 0) & 8192) == 8192) {
                        this.getInputFormats = java.util.Collections.unmodifiableList(this.getInputFormats);
                    }
                    if (((c == true ? 1 : 0) & 16384) == 16384) {
                        this.CoroutineDebuggingKt = java.util.Collections.unmodifiableList(this.CoroutineDebuggingKt);
                    }
                    if (((c == true ? 1 : 0) & 128) == 128) {
                        this.getHighSpeedVideoSizesFor = java.util.Collections.unmodifiableList(this.getHighSpeedVideoSizesFor);
                    }
                    if (((c == true ? 1 : 0) & 256) == 256) {
                        this.getOutputMinFrameDuration = java.util.Collections.unmodifiableList(this.getOutputMinFrameDuration);
                    }
                    if (((c == true ? 1 : 0) & 262144) == 262144) {
                        this.getHighSpeedVideoFpsRanges = java.util.Collections.unmodifiableList(this.getHighSpeedVideoFpsRanges);
                    }
                    if (((c == true ? 1 : 0) & 1048576) == 1048576) {
                        this.init = java.util.Collections.unmodifiableList(this.init);
                    }
                    if (((c == true ? 1 : 0) & 4194304) == 4194304) {
                        this.getHighResolutionOutputSizeshNQ4ISI = java.util.Collections.unmodifiableList(this.getHighResolutionOutputSizeshNQ4ISI);
                    }
                    try {
                        newInstance.flush();
                    } catch (java.io.IOException unused2) {
                    } catch (java.lang.Throwable th3) {
                        this.f6920a = newOutput.toByteString();
                        throw th3;
                    }
                    this.f6920a = newOutput.toByteString();
                    makeExtensionsImmutable();
                    throw th2;
                }
            }
        }

        static {
            kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Class r0 = new kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Class();
            getHighSpeedVideoFpsRangesFor = r0;
            r0.getHighSpeedVideoSizes();
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite, kotlin.reflect.jvm.internal.impl.protobuf.MessageLite
        public final kotlin.reflect.jvm.internal.impl.protobuf.Parser<kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Class> getParserForType() {
            return PARSER;
        }

        public enum Kind implements kotlin.reflect.jvm.internal.impl.protobuf.Internal.EnumLite {
            CLASS(0),
            INTERFACE(1),
            ENUM_CLASS(2),
            ENUM_ENTRY(3),
            ANNOTATION_CLASS(4),
            OBJECT(5),
            COMPANION_OBJECT(6);

            private static kotlin.reflect.jvm.internal.impl.protobuf.Internal.EnumLiteMap<kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Class.Kind> Camera2StreamConfigurationMap = new kotlin.reflect.jvm.internal.impl.protobuf.Internal.EnumLiteMap<kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Class.Kind>() { // from class: kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Class.Kind.1
                @Override // kotlin.reflect.jvm.internal.impl.protobuf.Internal.EnumLiteMap
                public final /* synthetic */ kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Class.Kind findValueByNumber(int i) {
                    return kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Class.Kind.valueOf(i);
                }
            };
            private final int getHighSpeedVideoSizes;

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.Internal.EnumLite
            public final int getNumber() {
                return this.getHighSpeedVideoSizes;
            }

            public static kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Class.Kind valueOf(int i) {
                switch (i) {
                    case 0:
                        return CLASS;
                    case 1:
                        return INTERFACE;
                    case 2:
                        return ENUM_CLASS;
                    case 3:
                        return ENUM_ENTRY;
                    case 4:
                        return ANNOTATION_CLASS;
                    case 5:
                        return OBJECT;
                    case 6:
                        return COMPANION_OBJECT;
                    default:
                        return null;
                }
            }

            Kind(int i) {
                this.getHighSpeedVideoSizes = i;
            }
        }

        public final boolean hasFlags() {
            return (this.getHighSpeedVideoSizes & 1) == 1;
        }

        public final int getFlags() {
            return this.getOutputStallDuration;
        }

        public final boolean hasFqName() {
            return (this.getHighSpeedVideoSizes & 2) == 2;
        }

        public final int getFqName() {
            return this.getOutputSizeshNQ4ISI;
        }

        public final boolean hasCompanionObjectName() {
            return (this.getHighSpeedVideoSizes & 4) == 4;
        }

        public final int getCompanionObjectName() {
            return this.Camera2StreamConfigurationMap;
        }

        public final java.util.List<kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.TypeParameter> getTypeParameterList() {
            return this.b;
        }

        public final int getTypeParameterCount() {
            return this.b.size();
        }

        public final kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.TypeParameter getTypeParameter(int i) {
            return this.b.get(i);
        }

        public final java.util.List<kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Type> getSupertypeList() {
            return this._CREATION;
        }

        public final int getSupertypeCount() {
            return this._CREATION.size();
        }

        public final kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Type getSupertype(int i) {
            return this._CREATION.get(i);
        }

        public final java.util.List<java.lang.Integer> getSupertypeIdList() {
            return this.coroutineCreation;
        }

        public final java.util.List<java.lang.Integer> getNestedClassNameList() {
            return this.unwrapAs;
        }

        public final java.util.List<kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Type> getContextReceiverTypeList() {
            return this.getHighSpeedVideoSizesFor;
        }

        public final int getContextReceiverTypeCount() {
            return this.getHighSpeedVideoSizesFor.size();
        }

        public final kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Type getContextReceiverType(int i) {
            return this.getHighSpeedVideoSizesFor.get(i);
        }

        public final java.util.List<java.lang.Integer> getContextReceiverTypeIdList() {
            return this.getOutputMinFrameDuration;
        }

        public final java.util.List<kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Constructor> getConstructorList() {
            return this.getInputSizeshNQ4ISI;
        }

        public final int getConstructorCount() {
            return this.getInputSizeshNQ4ISI.size();
        }

        public final kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Constructor getConstructor(int i) {
            return this.getInputSizeshNQ4ISI.get(i);
        }

        public final java.util.List<kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Function> getFunctionList() {
            return this.getOutputSizes;
        }

        public final int getFunctionCount() {
            return this.getOutputSizes.size();
        }

        public final kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Function getFunction(int i) {
            return this.getOutputSizes.get(i);
        }

        public final java.util.List<kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Property> getPropertyList() {
            return this.accessartificialFrame;
        }

        public final int getPropertyCount() {
            return this.accessartificialFrame.size();
        }

        public final kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Property getProperty(int i) {
            return this.accessartificialFrame.get(i);
        }

        public final java.util.List<kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.TypeAlias> getTypeAliasList() {
            return this._BOUNDARY;
        }

        public final int getTypeAliasCount() {
            return this._BOUNDARY.size();
        }

        public final kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.TypeAlias getTypeAlias(int i) {
            return this._BOUNDARY.get(i);
        }

        public final java.util.List<kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.EnumEntry> getEnumEntryList() {
            return this.getInputFormats;
        }

        public final int getEnumEntryCount() {
            return this.getInputFormats.size();
        }

        public final kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.EnumEntry getEnumEntry(int i) {
            return this.getInputFormats.get(i);
        }

        public final java.util.List<java.lang.Integer> getSealedSubclassFqNameList() {
            return this.CoroutineDebuggingKt;
        }

        public final boolean hasInlineClassUnderlyingPropertyName() {
            return (this.getHighSpeedVideoSizes & 8) == 8;
        }

        public final int getInlineClassUnderlyingPropertyName() {
            return this.getOutputMinFrameDurationlomOqCM;
        }

        public final boolean hasInlineClassUnderlyingType() {
            return (this.getHighSpeedVideoSizes & 16) == 16;
        }

        public final kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Type getInlineClassUnderlyingType() {
            return this.getValidOutputFormatsForInputhNQ4ISI;
        }

        public final boolean hasInlineClassUnderlyingTypeId() {
            return (this.getHighSpeedVideoSizes & 32) == 32;
        }

        public final int getInlineClassUnderlyingTypeId() {
            return this.getOutputStallDurationlomOqCM;
        }

        public final java.util.List<kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Annotation> getAnnotationList() {
            return this.getHighSpeedVideoFpsRanges;
        }

        public final int getAnnotationCount() {
            return this.getHighSpeedVideoFpsRanges.size();
        }

        public final kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Annotation getAnnotation(int i) {
            return this.getHighSpeedVideoFpsRanges.get(i);
        }

        public final boolean hasTypeTable() {
            return (this.getHighSpeedVideoSizes & 64) == 64;
        }

        public final kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.TypeTable getTypeTable() {
            return this.getARTIFICIAL_FRAME_PACKAGE_NAME;
        }

        public final java.util.List<java.lang.Integer> getVersionRequirementList() {
            return this.init;
        }

        public final boolean hasVersionRequirementTable() {
            return (this.getHighSpeedVideoSizes & 128) == 128;
        }

        public final kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.VersionRequirementTable getVersionRequirementTable() {
            return this.AMEXKernel;
        }

        public final int getCompilerPluginDataCount() {
            return this.getHighResolutionOutputSizeshNQ4ISI.size();
        }

        public final kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.CompilerPluginData getCompilerPluginData(int i) {
            return this.getHighResolutionOutputSizeshNQ4ISI.get(i);
        }

        private void getHighSpeedVideoSizes() {
            this.getOutputStallDuration = 6;
            this.getOutputSizeshNQ4ISI = 0;
            this.Camera2StreamConfigurationMap = 0;
            this.b = java.util.Collections.emptyList();
            this._CREATION = java.util.Collections.emptyList();
            this.coroutineCreation = java.util.Collections.emptyList();
            this.unwrapAs = java.util.Collections.emptyList();
            this.getHighSpeedVideoSizesFor = java.util.Collections.emptyList();
            this.getOutputMinFrameDuration = java.util.Collections.emptyList();
            this.getInputSizeshNQ4ISI = java.util.Collections.emptyList();
            this.getOutputSizes = java.util.Collections.emptyList();
            this.accessartificialFrame = java.util.Collections.emptyList();
            this._BOUNDARY = java.util.Collections.emptyList();
            this.getInputFormats = java.util.Collections.emptyList();
            this.CoroutineDebuggingKt = java.util.Collections.emptyList();
            this.getOutputMinFrameDurationlomOqCM = 0;
            this.getValidOutputFormatsForInputhNQ4ISI = kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Type.getDefaultInstance();
            this.getOutputStallDurationlomOqCM = 0;
            this.getHighSpeedVideoFpsRanges = java.util.Collections.emptyList();
            this.getARTIFICIAL_FRAME_PACKAGE_NAME = kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.TypeTable.getDefaultInstance();
            this.init = java.util.Collections.emptyList();
            this.AMEXKernel = kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.VersionRequirementTable.getDefaultInstance();
            this.getHighResolutionOutputSizeshNQ4ISI = java.util.Collections.emptyList();
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.MessageLiteOrBuilder
        public final boolean isInitialized() {
            byte b = this.isOutputSupportedForhNQ4ISI;
            if (b == 1) {
                return true;
            }
            if (b == 0) {
                return false;
            }
            if (!hasFqName()) {
                this.isOutputSupportedForhNQ4ISI = (byte) 0;
                return false;
            }
            for (int i = 0; i < getTypeParameterCount(); i++) {
                if (!getTypeParameter(i).isInitialized()) {
                    this.isOutputSupportedForhNQ4ISI = (byte) 0;
                    return false;
                }
            }
            for (int i2 = 0; i2 < getSupertypeCount(); i2++) {
                if (!getSupertype(i2).isInitialized()) {
                    this.isOutputSupportedForhNQ4ISI = (byte) 0;
                    return false;
                }
            }
            for (int i3 = 0; i3 < getContextReceiverTypeCount(); i3++) {
                if (!getContextReceiverType(i3).isInitialized()) {
                    this.isOutputSupportedForhNQ4ISI = (byte) 0;
                    return false;
                }
            }
            for (int i4 = 0; i4 < getConstructorCount(); i4++) {
                if (!getConstructor(i4).isInitialized()) {
                    this.isOutputSupportedForhNQ4ISI = (byte) 0;
                    return false;
                }
            }
            for (int i5 = 0; i5 < getFunctionCount(); i5++) {
                if (!getFunction(i5).isInitialized()) {
                    this.isOutputSupportedForhNQ4ISI = (byte) 0;
                    return false;
                }
            }
            for (int i6 = 0; i6 < getPropertyCount(); i6++) {
                if (!getProperty(i6).isInitialized()) {
                    this.isOutputSupportedForhNQ4ISI = (byte) 0;
                    return false;
                }
            }
            for (int i7 = 0; i7 < getTypeAliasCount(); i7++) {
                if (!getTypeAlias(i7).isInitialized()) {
                    this.isOutputSupportedForhNQ4ISI = (byte) 0;
                    return false;
                }
            }
            for (int i8 = 0; i8 < getEnumEntryCount(); i8++) {
                if (!getEnumEntry(i8).isInitialized()) {
                    this.isOutputSupportedForhNQ4ISI = (byte) 0;
                    return false;
                }
            }
            if (hasInlineClassUnderlyingType() && !getInlineClassUnderlyingType().isInitialized()) {
                this.isOutputSupportedForhNQ4ISI = (byte) 0;
                return false;
            }
            for (int i9 = 0; i9 < getAnnotationCount(); i9++) {
                if (!getAnnotation(i9).isInitialized()) {
                    this.isOutputSupportedForhNQ4ISI = (byte) 0;
                    return false;
                }
            }
            if (hasTypeTable() && !getTypeTable().isInitialized()) {
                this.isOutputSupportedForhNQ4ISI = (byte) 0;
                return false;
            }
            for (int i10 = 0; i10 < getCompilerPluginDataCount(); i10++) {
                if (!getCompilerPluginData(i10).isInitialized()) {
                    this.isOutputSupportedForhNQ4ISI = (byte) 0;
                    return false;
                }
            }
            if (!extensionsAreInitialized()) {
                this.isOutputSupportedForhNQ4ISI = (byte) 0;
                return false;
            }
            this.isOutputSupportedForhNQ4ISI = (byte) 1;
            return true;
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.MessageLite
        public final void writeTo(kotlin.reflect.jvm.internal.impl.protobuf.CodedOutputStream codedOutputStream) throws java.io.IOException {
            getSerializedSize();
            kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite.ExtendableMessage<MessageType>.ExtensionWriter newExtensionWriter = newExtensionWriter();
            if ((this.getHighSpeedVideoSizes & 1) == 1) {
                codedOutputStream.writeInt32(1, this.getOutputStallDuration);
            }
            if (getSupertypeIdList().size() > 0) {
                codedOutputStream.writeRawVarint32(18);
                codedOutputStream.writeRawVarint32(this.coroutineBoundary);
            }
            for (int i = 0; i < this.coroutineCreation.size(); i++) {
                codedOutputStream.writeInt32NoTag(this.coroutineCreation.get(i).intValue());
            }
            if ((this.getHighSpeedVideoSizes & 2) == 2) {
                codedOutputStream.writeInt32(3, this.getOutputSizeshNQ4ISI);
            }
            if ((this.getHighSpeedVideoSizes & 4) == 4) {
                codedOutputStream.writeInt32(4, this.Camera2StreamConfigurationMap);
            }
            for (int i2 = 0; i2 < this.b.size(); i2++) {
                codedOutputStream.writeMessage(5, this.b.get(i2));
            }
            for (int i3 = 0; i3 < this._CREATION.size(); i3++) {
                codedOutputStream.writeMessage(6, this._CREATION.get(i3));
            }
            if (getNestedClassNameList().size() > 0) {
                codedOutputStream.writeRawVarint32(58);
                codedOutputStream.writeRawVarint32(this.isOutputSupportedFor);
            }
            for (int i4 = 0; i4 < this.unwrapAs.size(); i4++) {
                codedOutputStream.writeInt32NoTag(this.unwrapAs.get(i4).intValue());
            }
            for (int i5 = 0; i5 < this.getInputSizeshNQ4ISI.size(); i5++) {
                codedOutputStream.writeMessage(8, this.getInputSizeshNQ4ISI.get(i5));
            }
            for (int i6 = 0; i6 < this.getOutputSizes.size(); i6++) {
                codedOutputStream.writeMessage(9, this.getOutputSizes.get(i6));
            }
            for (int i7 = 0; i7 < this.accessartificialFrame.size(); i7++) {
                codedOutputStream.writeMessage(10, this.accessartificialFrame.get(i7));
            }
            for (int i8 = 0; i8 < this._BOUNDARY.size(); i8++) {
                codedOutputStream.writeMessage(11, this._BOUNDARY.get(i8));
            }
            for (int i9 = 0; i9 < this.getInputFormats.size(); i9++) {
                codedOutputStream.writeMessage(13, this.getInputFormats.get(i9));
            }
            if (getSealedSubclassFqNameList().size() > 0) {
                codedOutputStream.writeRawVarint32(130);
                codedOutputStream.writeRawVarint32(this.ArtificialStackFrames);
            }
            for (int i10 = 0; i10 < this.CoroutineDebuggingKt.size(); i10++) {
                codedOutputStream.writeInt32NoTag(this.CoroutineDebuggingKt.get(i10).intValue());
            }
            if ((this.getHighSpeedVideoSizes & 8) == 8) {
                codedOutputStream.writeInt32(17, this.getOutputMinFrameDurationlomOqCM);
            }
            if ((this.getHighSpeedVideoSizes & 16) == 16) {
                codedOutputStream.writeMessage(18, this.getValidOutputFormatsForInputhNQ4ISI);
            }
            if ((this.getHighSpeedVideoSizes & 32) == 32) {
                codedOutputStream.writeInt32(19, this.getOutputStallDurationlomOqCM);
            }
            for (int i11 = 0; i11 < this.getHighSpeedVideoSizesFor.size(); i11++) {
                codedOutputStream.writeMessage(20, this.getHighSpeedVideoSizesFor.get(i11));
            }
            if (getContextReceiverTypeIdList().size() > 0) {
                codedOutputStream.writeRawVarint32(com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_INCOME_PAYROLL_URL_VALUE);
                codedOutputStream.writeRawVarint32(this.getOutputFormats);
            }
            for (int i12 = 0; i12 < this.getOutputMinFrameDuration.size(); i12++) {
                codedOutputStream.writeInt32NoTag(this.getOutputMinFrameDuration.get(i12).intValue());
            }
            for (int i13 = 0; i13 < this.getHighSpeedVideoFpsRanges.size(); i13++) {
                codedOutputStream.writeMessage(25, this.getHighSpeedVideoFpsRanges.get(i13));
            }
            if ((this.getHighSpeedVideoSizes & 64) == 64) {
                codedOutputStream.writeMessage(30, this.getARTIFICIAL_FRAME_PACKAGE_NAME);
            }
            for (int i14 = 0; i14 < this.init.size(); i14++) {
                codedOutputStream.writeInt32(31, this.init.get(i14).intValue());
            }
            if ((this.getHighSpeedVideoSizes & 128) == 128) {
                codedOutputStream.writeMessage(32, this.AMEXKernel);
            }
            for (int i15 = 0; i15 < this.getHighResolutionOutputSizeshNQ4ISI.size(); i15++) {
                codedOutputStream.writeMessage(33, this.getHighResolutionOutputSizeshNQ4ISI.get(i15));
            }
            newExtensionWriter.writeUntil(19000, codedOutputStream);
            codedOutputStream.writeRawBytes(this.f6920a);
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.MessageLite
        public final int getSerializedSize() {
            int i = this.toString;
            if (i != -1) {
                return i;
            }
            int computeInt32Size = (this.getHighSpeedVideoSizes & 1) == 1 ? kotlin.reflect.jvm.internal.impl.protobuf.CodedOutputStream.computeInt32Size(1, this.getOutputStallDuration) : 0;
            int i2 = 0;
            for (int i3 = 0; i3 < this.coroutineCreation.size(); i3++) {
                i2 += kotlin.reflect.jvm.internal.impl.protobuf.CodedOutputStream.computeInt32SizeNoTag(this.coroutineCreation.get(i3).intValue());
            }
            int i4 = computeInt32Size + i2;
            if (!getSupertypeIdList().isEmpty()) {
                i4 = i4 + 1 + kotlin.reflect.jvm.internal.impl.protobuf.CodedOutputStream.computeInt32SizeNoTag(i2);
            }
            this.coroutineBoundary = i2;
            if ((this.getHighSpeedVideoSizes & 2) == 2) {
                i4 += kotlin.reflect.jvm.internal.impl.protobuf.CodedOutputStream.computeInt32Size(3, this.getOutputSizeshNQ4ISI);
            }
            if ((this.getHighSpeedVideoSizes & 4) == 4) {
                i4 += kotlin.reflect.jvm.internal.impl.protobuf.CodedOutputStream.computeInt32Size(4, this.Camera2StreamConfigurationMap);
            }
            for (int i5 = 0; i5 < this.b.size(); i5++) {
                i4 += kotlin.reflect.jvm.internal.impl.protobuf.CodedOutputStream.computeMessageSize(5, this.b.get(i5));
            }
            for (int i6 = 0; i6 < this._CREATION.size(); i6++) {
                i4 += kotlin.reflect.jvm.internal.impl.protobuf.CodedOutputStream.computeMessageSize(6, this._CREATION.get(i6));
            }
            int i7 = 0;
            for (int i8 = 0; i8 < this.unwrapAs.size(); i8++) {
                i7 += kotlin.reflect.jvm.internal.impl.protobuf.CodedOutputStream.computeInt32SizeNoTag(this.unwrapAs.get(i8).intValue());
            }
            int i9 = i4 + i7;
            if (!getNestedClassNameList().isEmpty()) {
                i9 = i9 + 1 + kotlin.reflect.jvm.internal.impl.protobuf.CodedOutputStream.computeInt32SizeNoTag(i7);
            }
            this.isOutputSupportedFor = i7;
            for (int i10 = 0; i10 < this.getInputSizeshNQ4ISI.size(); i10++) {
                i9 += kotlin.reflect.jvm.internal.impl.protobuf.CodedOutputStream.computeMessageSize(8, this.getInputSizeshNQ4ISI.get(i10));
            }
            for (int i11 = 0; i11 < this.getOutputSizes.size(); i11++) {
                i9 += kotlin.reflect.jvm.internal.impl.protobuf.CodedOutputStream.computeMessageSize(9, this.getOutputSizes.get(i11));
            }
            for (int i12 = 0; i12 < this.accessartificialFrame.size(); i12++) {
                i9 += kotlin.reflect.jvm.internal.impl.protobuf.CodedOutputStream.computeMessageSize(10, this.accessartificialFrame.get(i12));
            }
            for (int i13 = 0; i13 < this._BOUNDARY.size(); i13++) {
                i9 += kotlin.reflect.jvm.internal.impl.protobuf.CodedOutputStream.computeMessageSize(11, this._BOUNDARY.get(i13));
            }
            for (int i14 = 0; i14 < this.getInputFormats.size(); i14++) {
                i9 += kotlin.reflect.jvm.internal.impl.protobuf.CodedOutputStream.computeMessageSize(13, this.getInputFormats.get(i14));
            }
            int i15 = 0;
            for (int i16 = 0; i16 < this.CoroutineDebuggingKt.size(); i16++) {
                i15 += kotlin.reflect.jvm.internal.impl.protobuf.CodedOutputStream.computeInt32SizeNoTag(this.CoroutineDebuggingKt.get(i16).intValue());
            }
            int i17 = i9 + i15;
            if (!getSealedSubclassFqNameList().isEmpty()) {
                i17 = i17 + 2 + kotlin.reflect.jvm.internal.impl.protobuf.CodedOutputStream.computeInt32SizeNoTag(i15);
            }
            this.ArtificialStackFrames = i15;
            if ((this.getHighSpeedVideoSizes & 8) == 8) {
                i17 += kotlin.reflect.jvm.internal.impl.protobuf.CodedOutputStream.computeInt32Size(17, this.getOutputMinFrameDurationlomOqCM);
            }
            if ((this.getHighSpeedVideoSizes & 16) == 16) {
                i17 += kotlin.reflect.jvm.internal.impl.protobuf.CodedOutputStream.computeMessageSize(18, this.getValidOutputFormatsForInputhNQ4ISI);
            }
            if ((this.getHighSpeedVideoSizes & 32) == 32) {
                i17 += kotlin.reflect.jvm.internal.impl.protobuf.CodedOutputStream.computeInt32Size(19, this.getOutputStallDurationlomOqCM);
            }
            for (int i18 = 0; i18 < this.getHighSpeedVideoSizesFor.size(); i18++) {
                i17 += kotlin.reflect.jvm.internal.impl.protobuf.CodedOutputStream.computeMessageSize(20, this.getHighSpeedVideoSizesFor.get(i18));
            }
            int i19 = 0;
            for (int i20 = 0; i20 < this.getOutputMinFrameDuration.size(); i20++) {
                i19 += kotlin.reflect.jvm.internal.impl.protobuf.CodedOutputStream.computeInt32SizeNoTag(this.getOutputMinFrameDuration.get(i20).intValue());
            }
            int i21 = i17 + i19;
            if (!getContextReceiverTypeIdList().isEmpty()) {
                i21 = i21 + 2 + kotlin.reflect.jvm.internal.impl.protobuf.CodedOutputStream.computeInt32SizeNoTag(i19);
            }
            this.getOutputFormats = i19;
            for (int i22 = 0; i22 < this.getHighSpeedVideoFpsRanges.size(); i22++) {
                i21 += kotlin.reflect.jvm.internal.impl.protobuf.CodedOutputStream.computeMessageSize(25, this.getHighSpeedVideoFpsRanges.get(i22));
            }
            if ((this.getHighSpeedVideoSizes & 64) == 64) {
                i21 += kotlin.reflect.jvm.internal.impl.protobuf.CodedOutputStream.computeMessageSize(30, this.getARTIFICIAL_FRAME_PACKAGE_NAME);
            }
            int i23 = 0;
            for (int i24 = 0; i24 < this.init.size(); i24++) {
                i23 += kotlin.reflect.jvm.internal.impl.protobuf.CodedOutputStream.computeInt32SizeNoTag(this.init.get(i24).intValue());
            }
            int size = i21 + i23 + (getVersionRequirementList().size() * 2);
            if ((this.getHighSpeedVideoSizes & 128) == 128) {
                size += kotlin.reflect.jvm.internal.impl.protobuf.CodedOutputStream.computeMessageSize(32, this.AMEXKernel);
            }
            for (int i25 = 0; i25 < this.getHighResolutionOutputSizeshNQ4ISI.size(); i25++) {
                size += kotlin.reflect.jvm.internal.impl.protobuf.CodedOutputStream.computeMessageSize(33, this.getHighResolutionOutputSizeshNQ4ISI.get(i25));
            }
            int extensionsSerializedSize = size + extensionsSerializedSize() + this.f6920a.size();
            this.toString = extensionsSerializedSize;
            return extensionsSerializedSize;
        }

        public static kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Class parseFrom(java.io.InputStream inputStream, kotlin.reflect.jvm.internal.impl.protobuf.ExtensionRegistryLite extensionRegistryLite) throws java.io.IOException {
            return PARSER.parseFrom(inputStream, extensionRegistryLite);
        }

        public static kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Class.Builder newBuilder() {
            return kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Class.Builder.getHighSpeedVideoSizes();
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.MessageLite
        public final kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Class.Builder newBuilderForType() {
            return newBuilder();
        }

        public static kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Class.Builder newBuilder(kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Class r1) {
            return newBuilder().mergeFrom(r1);
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.MessageLite
        public final kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Class.Builder toBuilder() {
            return newBuilder(this);
        }

        public static final class Builder extends kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite.ExtendableBuilder<kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Class, kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Class.Builder> implements kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.ClassOrBuilder {
            private int getHighResolutionOutputSizeshNQ4ISI;
            private int getHighSpeedVideoFpsRanges;
            private int getHighSpeedVideoSizesFor;
            private int getOutputMinFrameDurationlomOqCM;
            private int getOutputSizeshNQ4ISI;
            private int getOutputFormats = 6;
            private java.util.List<kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.TypeParameter> accessartificialFrame = java.util.Collections.emptyList();
            private java.util.List<kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Type> unwrapAs = java.util.Collections.emptyList();
            private java.util.List<java.lang.Integer> toString = java.util.Collections.emptyList();
            private java.util.List<java.lang.Integer> getOutputStallDuration = java.util.Collections.emptyList();
            private java.util.List<kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Type> getInputSizeshNQ4ISI = java.util.Collections.emptyList();
            private java.util.List<java.lang.Integer> getOutputMinFrameDuration = java.util.Collections.emptyList();
            private java.util.List<kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Constructor> Camera2StreamConfigurationMap = java.util.Collections.emptyList();
            private java.util.List<kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Function> getOutputSizes = java.util.Collections.emptyList();
            private java.util.List<kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Property> isOutputSupportedFor = java.util.Collections.emptyList();
            private java.util.List<kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.TypeAlias> getValidOutputFormatsForInputhNQ4ISI = java.util.Collections.emptyList();
            private java.util.List<kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.EnumEntry> getInputFormats = java.util.Collections.emptyList();
            private java.util.List<java.lang.Integer> isOutputSupportedForhNQ4ISI = java.util.Collections.emptyList();
            private kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Type getOutputStallDurationlomOqCM = kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Type.getDefaultInstance();
            private java.util.List<kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Annotation> getHighSpeedVideoFpsRangesFor = java.util.Collections.emptyList();
            private kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.TypeTable ArtificialStackFrames = kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.TypeTable.getDefaultInstance();
            private java.util.List<java.lang.Integer> coroutineBoundary = java.util.Collections.emptyList();
            private kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.VersionRequirementTable CoroutineDebuggingKt = kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.VersionRequirementTable.getDefaultInstance();
            private java.util.List<kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.CompilerPluginData> getHighSpeedVideoSizes = java.util.Collections.emptyList();

            private Builder() {
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite.Builder, kotlin.reflect.jvm.internal.impl.protobuf.MessageLiteOrBuilder
            public final kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Class getDefaultInstanceForType() {
                return kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Class.getDefaultInstance();
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.MessageLite.Builder
            public final kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Class build() {
                kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Class buildPartial = buildPartial();
                if (buildPartial.isInitialized()) {
                    return buildPartial;
                }
                throw newUninitializedMessageException(buildPartial);
            }

            /* JADX WARN: Multi-variable type inference failed */
            public final kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Class buildPartial() {
                kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Class r0 = new kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Class((kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite.ExtendableBuilder) this, (byte) (0 == true ? 1 : 0));
                int i = this.getHighSpeedVideoFpsRanges;
                int i2 = (i & 1) == 1 ? 1 : 0;
                r0.getOutputStallDuration = this.getOutputFormats;
                if ((i & 2) == 2) {
                    i2 |= 2;
                }
                r0.getOutputSizeshNQ4ISI = this.getHighSpeedVideoSizesFor;
                if ((i & 4) == 4) {
                    i2 |= 4;
                }
                r0.Camera2StreamConfigurationMap = this.getHighResolutionOutputSizeshNQ4ISI;
                if ((this.getHighSpeedVideoFpsRanges & 8) == 8) {
                    this.accessartificialFrame = java.util.Collections.unmodifiableList(this.accessartificialFrame);
                    this.getHighSpeedVideoFpsRanges &= -9;
                }
                r0.b = this.accessartificialFrame;
                if ((this.getHighSpeedVideoFpsRanges & 16) == 16) {
                    this.unwrapAs = java.util.Collections.unmodifiableList(this.unwrapAs);
                    this.getHighSpeedVideoFpsRanges &= -17;
                }
                r0._CREATION = this.unwrapAs;
                if ((this.getHighSpeedVideoFpsRanges & 32) == 32) {
                    this.toString = java.util.Collections.unmodifiableList(this.toString);
                    this.getHighSpeedVideoFpsRanges &= -33;
                }
                r0.coroutineCreation = this.toString;
                if ((this.getHighSpeedVideoFpsRanges & 64) == 64) {
                    this.getOutputStallDuration = java.util.Collections.unmodifiableList(this.getOutputStallDuration);
                    this.getHighSpeedVideoFpsRanges &= -65;
                }
                r0.unwrapAs = this.getOutputStallDuration;
                if ((this.getHighSpeedVideoFpsRanges & 128) == 128) {
                    this.getInputSizeshNQ4ISI = java.util.Collections.unmodifiableList(this.getInputSizeshNQ4ISI);
                    this.getHighSpeedVideoFpsRanges &= -129;
                }
                r0.getHighSpeedVideoSizesFor = this.getInputSizeshNQ4ISI;
                if ((this.getHighSpeedVideoFpsRanges & 256) == 256) {
                    this.getOutputMinFrameDuration = java.util.Collections.unmodifiableList(this.getOutputMinFrameDuration);
                    this.getHighSpeedVideoFpsRanges &= -257;
                }
                r0.getOutputMinFrameDuration = this.getOutputMinFrameDuration;
                if ((this.getHighSpeedVideoFpsRanges & 512) == 512) {
                    this.Camera2StreamConfigurationMap = java.util.Collections.unmodifiableList(this.Camera2StreamConfigurationMap);
                    this.getHighSpeedVideoFpsRanges &= -513;
                }
                r0.getInputSizeshNQ4ISI = this.Camera2StreamConfigurationMap;
                if ((this.getHighSpeedVideoFpsRanges & 1024) == 1024) {
                    this.getOutputSizes = java.util.Collections.unmodifiableList(this.getOutputSizes);
                    this.getHighSpeedVideoFpsRanges &= -1025;
                }
                r0.getOutputSizes = this.getOutputSizes;
                if ((this.getHighSpeedVideoFpsRanges & 2048) == 2048) {
                    this.isOutputSupportedFor = java.util.Collections.unmodifiableList(this.isOutputSupportedFor);
                    this.getHighSpeedVideoFpsRanges &= -2049;
                }
                r0.accessartificialFrame = this.isOutputSupportedFor;
                if ((this.getHighSpeedVideoFpsRanges & 4096) == 4096) {
                    this.getValidOutputFormatsForInputhNQ4ISI = java.util.Collections.unmodifiableList(this.getValidOutputFormatsForInputhNQ4ISI);
                    this.getHighSpeedVideoFpsRanges &= -4097;
                }
                r0._BOUNDARY = this.getValidOutputFormatsForInputhNQ4ISI;
                if ((this.getHighSpeedVideoFpsRanges & 8192) == 8192) {
                    this.getInputFormats = java.util.Collections.unmodifiableList(this.getInputFormats);
                    this.getHighSpeedVideoFpsRanges &= -8193;
                }
                r0.getInputFormats = this.getInputFormats;
                if ((this.getHighSpeedVideoFpsRanges & 16384) == 16384) {
                    this.isOutputSupportedForhNQ4ISI = java.util.Collections.unmodifiableList(this.isOutputSupportedForhNQ4ISI);
                    this.getHighSpeedVideoFpsRanges &= -16385;
                }
                r0.CoroutineDebuggingKt = this.isOutputSupportedForhNQ4ISI;
                if ((i & 32768) == 32768) {
                    i2 |= 8;
                }
                r0.getOutputMinFrameDurationlomOqCM = this.getOutputMinFrameDurationlomOqCM;
                if ((i & 65536) == 65536) {
                    i2 |= 16;
                }
                r0.getValidOutputFormatsForInputhNQ4ISI = this.getOutputStallDurationlomOqCM;
                if ((i & 131072) == 131072) {
                    i2 |= 32;
                }
                r0.getOutputStallDurationlomOqCM = this.getOutputSizeshNQ4ISI;
                if ((this.getHighSpeedVideoFpsRanges & 262144) == 262144) {
                    this.getHighSpeedVideoFpsRangesFor = java.util.Collections.unmodifiableList(this.getHighSpeedVideoFpsRangesFor);
                    this.getHighSpeedVideoFpsRanges &= -262145;
                }
                r0.getHighSpeedVideoFpsRanges = this.getHighSpeedVideoFpsRangesFor;
                if ((i & 524288) == 524288) {
                    i2 |= 64;
                }
                r0.getARTIFICIAL_FRAME_PACKAGE_NAME = this.ArtificialStackFrames;
                if ((this.getHighSpeedVideoFpsRanges & 1048576) == 1048576) {
                    this.coroutineBoundary = java.util.Collections.unmodifiableList(this.coroutineBoundary);
                    this.getHighSpeedVideoFpsRanges &= -1048577;
                }
                r0.init = this.coroutineBoundary;
                if ((i & 2097152) == 2097152) {
                    i2 |= 128;
                }
                r0.AMEXKernel = this.CoroutineDebuggingKt;
                if ((this.getHighSpeedVideoFpsRanges & 4194304) == 4194304) {
                    this.getHighSpeedVideoSizes = java.util.Collections.unmodifiableList(this.getHighSpeedVideoSizes);
                    this.getHighSpeedVideoFpsRanges &= -4194305;
                }
                r0.getHighResolutionOutputSizeshNQ4ISI = this.getHighSpeedVideoSizes;
                r0.getHighSpeedVideoSizes = i2;
                return r0;
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite.Builder
            public final kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Class.Builder mergeFrom(kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Class r4) {
                if (r4 == kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Class.getDefaultInstance()) {
                    return this;
                }
                if (r4.hasFlags()) {
                    setFlags(r4.getFlags());
                }
                if (r4.hasFqName()) {
                    setFqName(r4.getFqName());
                }
                if (r4.hasCompanionObjectName()) {
                    setCompanionObjectName(r4.getCompanionObjectName());
                }
                if (!r4.b.isEmpty()) {
                    if (this.accessartificialFrame.isEmpty()) {
                        this.accessartificialFrame = r4.b;
                        this.getHighSpeedVideoFpsRanges &= -9;
                    } else {
                        if ((this.getHighSpeedVideoFpsRanges & 8) != 8) {
                            this.accessartificialFrame = new java.util.ArrayList(this.accessartificialFrame);
                            this.getHighSpeedVideoFpsRanges |= 8;
                        }
                        this.accessartificialFrame.addAll(r4.b);
                    }
                }
                if (!r4._CREATION.isEmpty()) {
                    if (this.unwrapAs.isEmpty()) {
                        this.unwrapAs = r4._CREATION;
                        this.getHighSpeedVideoFpsRanges &= -17;
                    } else {
                        if ((this.getHighSpeedVideoFpsRanges & 16) != 16) {
                            this.unwrapAs = new java.util.ArrayList(this.unwrapAs);
                            this.getHighSpeedVideoFpsRanges |= 16;
                        }
                        this.unwrapAs.addAll(r4._CREATION);
                    }
                }
                if (!r4.coroutineCreation.isEmpty()) {
                    if (this.toString.isEmpty()) {
                        this.toString = r4.coroutineCreation;
                        this.getHighSpeedVideoFpsRanges &= -33;
                    } else {
                        if ((this.getHighSpeedVideoFpsRanges & 32) != 32) {
                            this.toString = new java.util.ArrayList(this.toString);
                            this.getHighSpeedVideoFpsRanges |= 32;
                        }
                        this.toString.addAll(r4.coroutineCreation);
                    }
                }
                if (!r4.unwrapAs.isEmpty()) {
                    if (this.getOutputStallDuration.isEmpty()) {
                        this.getOutputStallDuration = r4.unwrapAs;
                        this.getHighSpeedVideoFpsRanges &= -65;
                    } else {
                        if ((this.getHighSpeedVideoFpsRanges & 64) != 64) {
                            this.getOutputStallDuration = new java.util.ArrayList(this.getOutputStallDuration);
                            this.getHighSpeedVideoFpsRanges |= 64;
                        }
                        this.getOutputStallDuration.addAll(r4.unwrapAs);
                    }
                }
                if (!r4.getHighSpeedVideoSizesFor.isEmpty()) {
                    if (this.getInputSizeshNQ4ISI.isEmpty()) {
                        this.getInputSizeshNQ4ISI = r4.getHighSpeedVideoSizesFor;
                        this.getHighSpeedVideoFpsRanges &= -129;
                    } else {
                        if ((this.getHighSpeedVideoFpsRanges & 128) != 128) {
                            this.getInputSizeshNQ4ISI = new java.util.ArrayList(this.getInputSizeshNQ4ISI);
                            this.getHighSpeedVideoFpsRanges |= 128;
                        }
                        this.getInputSizeshNQ4ISI.addAll(r4.getHighSpeedVideoSizesFor);
                    }
                }
                if (!r4.getOutputMinFrameDuration.isEmpty()) {
                    if (this.getOutputMinFrameDuration.isEmpty()) {
                        this.getOutputMinFrameDuration = r4.getOutputMinFrameDuration;
                        this.getHighSpeedVideoFpsRanges &= -257;
                    } else {
                        if ((this.getHighSpeedVideoFpsRanges & 256) != 256) {
                            this.getOutputMinFrameDuration = new java.util.ArrayList(this.getOutputMinFrameDuration);
                            this.getHighSpeedVideoFpsRanges |= 256;
                        }
                        this.getOutputMinFrameDuration.addAll(r4.getOutputMinFrameDuration);
                    }
                }
                if (!r4.getInputSizeshNQ4ISI.isEmpty()) {
                    if (this.Camera2StreamConfigurationMap.isEmpty()) {
                        this.Camera2StreamConfigurationMap = r4.getInputSizeshNQ4ISI;
                        this.getHighSpeedVideoFpsRanges &= -513;
                    } else {
                        if ((this.getHighSpeedVideoFpsRanges & 512) != 512) {
                            this.Camera2StreamConfigurationMap = new java.util.ArrayList(this.Camera2StreamConfigurationMap);
                            this.getHighSpeedVideoFpsRanges |= 512;
                        }
                        this.Camera2StreamConfigurationMap.addAll(r4.getInputSizeshNQ4ISI);
                    }
                }
                if (!r4.getOutputSizes.isEmpty()) {
                    if (this.getOutputSizes.isEmpty()) {
                        this.getOutputSizes = r4.getOutputSizes;
                        this.getHighSpeedVideoFpsRanges &= -1025;
                    } else {
                        if ((this.getHighSpeedVideoFpsRanges & 1024) != 1024) {
                            this.getOutputSizes = new java.util.ArrayList(this.getOutputSizes);
                            this.getHighSpeedVideoFpsRanges |= 1024;
                        }
                        this.getOutputSizes.addAll(r4.getOutputSizes);
                    }
                }
                if (!r4.accessartificialFrame.isEmpty()) {
                    if (this.isOutputSupportedFor.isEmpty()) {
                        this.isOutputSupportedFor = r4.accessartificialFrame;
                        this.getHighSpeedVideoFpsRanges &= -2049;
                    } else {
                        if ((this.getHighSpeedVideoFpsRanges & 2048) != 2048) {
                            this.isOutputSupportedFor = new java.util.ArrayList(this.isOutputSupportedFor);
                            this.getHighSpeedVideoFpsRanges |= 2048;
                        }
                        this.isOutputSupportedFor.addAll(r4.accessartificialFrame);
                    }
                }
                if (!r4._BOUNDARY.isEmpty()) {
                    if (this.getValidOutputFormatsForInputhNQ4ISI.isEmpty()) {
                        this.getValidOutputFormatsForInputhNQ4ISI = r4._BOUNDARY;
                        this.getHighSpeedVideoFpsRanges &= -4097;
                    } else {
                        if ((this.getHighSpeedVideoFpsRanges & 4096) != 4096) {
                            this.getValidOutputFormatsForInputhNQ4ISI = new java.util.ArrayList(this.getValidOutputFormatsForInputhNQ4ISI);
                            this.getHighSpeedVideoFpsRanges |= 4096;
                        }
                        this.getValidOutputFormatsForInputhNQ4ISI.addAll(r4._BOUNDARY);
                    }
                }
                if (!r4.getInputFormats.isEmpty()) {
                    if (this.getInputFormats.isEmpty()) {
                        this.getInputFormats = r4.getInputFormats;
                        this.getHighSpeedVideoFpsRanges &= -8193;
                    } else {
                        if ((this.getHighSpeedVideoFpsRanges & 8192) != 8192) {
                            this.getInputFormats = new java.util.ArrayList(this.getInputFormats);
                            this.getHighSpeedVideoFpsRanges |= 8192;
                        }
                        this.getInputFormats.addAll(r4.getInputFormats);
                    }
                }
                if (!r4.CoroutineDebuggingKt.isEmpty()) {
                    if (this.isOutputSupportedForhNQ4ISI.isEmpty()) {
                        this.isOutputSupportedForhNQ4ISI = r4.CoroutineDebuggingKt;
                        this.getHighSpeedVideoFpsRanges &= -16385;
                    } else {
                        if ((this.getHighSpeedVideoFpsRanges & 16384) != 16384) {
                            this.isOutputSupportedForhNQ4ISI = new java.util.ArrayList(this.isOutputSupportedForhNQ4ISI);
                            this.getHighSpeedVideoFpsRanges |= 16384;
                        }
                        this.isOutputSupportedForhNQ4ISI.addAll(r4.CoroutineDebuggingKt);
                    }
                }
                if (r4.hasInlineClassUnderlyingPropertyName()) {
                    setInlineClassUnderlyingPropertyName(r4.getInlineClassUnderlyingPropertyName());
                }
                if (r4.hasInlineClassUnderlyingType()) {
                    mergeInlineClassUnderlyingType(r4.getInlineClassUnderlyingType());
                }
                if (r4.hasInlineClassUnderlyingTypeId()) {
                    setInlineClassUnderlyingTypeId(r4.getInlineClassUnderlyingTypeId());
                }
                if (!r4.getHighSpeedVideoFpsRanges.isEmpty()) {
                    if (this.getHighSpeedVideoFpsRangesFor.isEmpty()) {
                        this.getHighSpeedVideoFpsRangesFor = r4.getHighSpeedVideoFpsRanges;
                        this.getHighSpeedVideoFpsRanges &= -262145;
                    } else {
                        getHighResolutionOutputSizeshNQ4ISI();
                        this.getHighSpeedVideoFpsRangesFor.addAll(r4.getHighSpeedVideoFpsRanges);
                    }
                }
                if (r4.hasTypeTable()) {
                    mergeTypeTable(r4.getTypeTable());
                }
                if (!r4.init.isEmpty()) {
                    if (this.coroutineBoundary.isEmpty()) {
                        this.coroutineBoundary = r4.init;
                        this.getHighSpeedVideoFpsRanges &= -1048577;
                    } else {
                        if ((this.getHighSpeedVideoFpsRanges & 1048576) != 1048576) {
                            this.coroutineBoundary = new java.util.ArrayList(this.coroutineBoundary);
                            this.getHighSpeedVideoFpsRanges |= 1048576;
                        }
                        this.coroutineBoundary.addAll(r4.init);
                    }
                }
                if (r4.hasVersionRequirementTable()) {
                    mergeVersionRequirementTable(r4.getVersionRequirementTable());
                }
                if (!r4.getHighResolutionOutputSizeshNQ4ISI.isEmpty()) {
                    if (this.getHighSpeedVideoSizes.isEmpty()) {
                        this.getHighSpeedVideoSizes = r4.getHighResolutionOutputSizeshNQ4ISI;
                        this.getHighSpeedVideoFpsRanges &= -4194305;
                    } else {
                        if ((this.getHighSpeedVideoFpsRanges & 4194304) != 4194304) {
                            this.getHighSpeedVideoSizes = new java.util.ArrayList(this.getHighSpeedVideoSizes);
                            this.getHighSpeedVideoFpsRanges |= 4194304;
                        }
                        this.getHighSpeedVideoSizes.addAll(r4.getHighResolutionOutputSizeshNQ4ISI);
                    }
                }
                mergeExtensionFields(r4);
                setUnknownFields(getUnknownFields().concat(r4.f6920a));
                return this;
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.MessageLiteOrBuilder
            public final boolean isInitialized() {
                if (!hasFqName()) {
                    return false;
                }
                for (int i = 0; i < getTypeParameterCount(); i++) {
                    if (!getTypeParameter(i).isInitialized()) {
                        return false;
                    }
                }
                for (int i2 = 0; i2 < getSupertypeCount(); i2++) {
                    if (!getSupertype(i2).isInitialized()) {
                        return false;
                    }
                }
                for (int i3 = 0; i3 < getContextReceiverTypeCount(); i3++) {
                    if (!getContextReceiverType(i3).isInitialized()) {
                        return false;
                    }
                }
                for (int i4 = 0; i4 < getConstructorCount(); i4++) {
                    if (!getConstructor(i4).isInitialized()) {
                        return false;
                    }
                }
                for (int i5 = 0; i5 < getFunctionCount(); i5++) {
                    if (!getFunction(i5).isInitialized()) {
                        return false;
                    }
                }
                for (int i6 = 0; i6 < getPropertyCount(); i6++) {
                    if (!getProperty(i6).isInitialized()) {
                        return false;
                    }
                }
                for (int i7 = 0; i7 < getTypeAliasCount(); i7++) {
                    if (!getTypeAlias(i7).isInitialized()) {
                        return false;
                    }
                }
                for (int i8 = 0; i8 < getEnumEntryCount(); i8++) {
                    if (!getEnumEntry(i8).isInitialized()) {
                        return false;
                    }
                }
                if (hasInlineClassUnderlyingType() && !getInlineClassUnderlyingType().isInitialized()) {
                    return false;
                }
                for (int i9 = 0; i9 < getAnnotationCount(); i9++) {
                    if (!getAnnotation(i9).isInitialized()) {
                        return false;
                    }
                }
                if (hasTypeTable() && !getTypeTable().isInitialized()) {
                    return false;
                }
                for (int i10 = 0; i10 < getCompilerPluginDataCount(); i10++) {
                    if (!getCompilerPluginData(i10).isInitialized()) {
                        return false;
                    }
                }
                return extensionsAreInitialized();
            }

            /* JADX WARN: Removed duplicated region for block: B:15:0x001d  */
            @Override // kotlin.reflect.jvm.internal.impl.protobuf.AbstractMessageLite.Builder, kotlin.reflect.jvm.internal.impl.protobuf.MessageLite.Builder
            /*
                Code decompiled incorrectly, please refer to instructions dump.
            */
            public final kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Class.Builder mergeFrom(kotlin.reflect.jvm.internal.impl.protobuf.CodedInputStream codedInputStream, kotlin.reflect.jvm.internal.impl.protobuf.ExtensionRegistryLite extensionRegistryLite) throws java.io.IOException {
                kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Class r3;
                try {
                    try {
                        kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Class parsePartialFrom = kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Class.PARSER.parsePartialFrom(codedInputStream, extensionRegistryLite);
                        if (parsePartialFrom != null) {
                            mergeFrom(parsePartialFrom);
                        }
                        return this;
                    } catch (kotlin.reflect.jvm.internal.impl.protobuf.InvalidProtocolBufferException e) {
                        r3 = (kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Class) e.getUnfinishedMessage();
                        try {
                            throw e;
                        } catch (java.lang.Throwable th) {
                            th = th;
                            if (r3 != null) {
                                mergeFrom(r3);
                            }
                            throw th;
                        }
                    }
                } catch (java.lang.Throwable th2) {
                    th = th2;
                    r3 = null;
                    if (r3 != null) {
                    }
                    throw th;
                }
            }

            public final kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Class.Builder setFlags(int i) {
                this.getHighSpeedVideoFpsRanges |= 1;
                this.getOutputFormats = i;
                return this;
            }

            public final boolean hasFqName() {
                return (this.getHighSpeedVideoFpsRanges & 2) == 2;
            }

            public final kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Class.Builder setFqName(int i) {
                this.getHighSpeedVideoFpsRanges |= 2;
                this.getHighSpeedVideoSizesFor = i;
                return this;
            }

            public final kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Class.Builder setCompanionObjectName(int i) {
                this.getHighSpeedVideoFpsRanges |= 4;
                this.getHighResolutionOutputSizeshNQ4ISI = i;
                return this;
            }

            public final int getTypeParameterCount() {
                return this.accessartificialFrame.size();
            }

            public final kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.TypeParameter getTypeParameter(int i) {
                return this.accessartificialFrame.get(i);
            }

            public final int getSupertypeCount() {
                return this.unwrapAs.size();
            }

            public final kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Type getSupertype(int i) {
                return this.unwrapAs.get(i);
            }

            public final int getContextReceiverTypeCount() {
                return this.getInputSizeshNQ4ISI.size();
            }

            public final kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Type getContextReceiverType(int i) {
                return this.getInputSizeshNQ4ISI.get(i);
            }

            public final int getConstructorCount() {
                return this.Camera2StreamConfigurationMap.size();
            }

            public final kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Constructor getConstructor(int i) {
                return this.Camera2StreamConfigurationMap.get(i);
            }

            public final int getFunctionCount() {
                return this.getOutputSizes.size();
            }

            public final kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Function getFunction(int i) {
                return this.getOutputSizes.get(i);
            }

            public final int getPropertyCount() {
                return this.isOutputSupportedFor.size();
            }

            public final kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Property getProperty(int i) {
                return this.isOutputSupportedFor.get(i);
            }

            public final int getTypeAliasCount() {
                return this.getValidOutputFormatsForInputhNQ4ISI.size();
            }

            public final kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.TypeAlias getTypeAlias(int i) {
                return this.getValidOutputFormatsForInputhNQ4ISI.get(i);
            }

            public final int getEnumEntryCount() {
                return this.getInputFormats.size();
            }

            public final kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.EnumEntry getEnumEntry(int i) {
                return this.getInputFormats.get(i);
            }

            public final kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Class.Builder setInlineClassUnderlyingPropertyName(int i) {
                this.getHighSpeedVideoFpsRanges |= 32768;
                this.getOutputMinFrameDurationlomOqCM = i;
                return this;
            }

            public final boolean hasInlineClassUnderlyingType() {
                return (this.getHighSpeedVideoFpsRanges & 65536) == 65536;
            }

            public final kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Type getInlineClassUnderlyingType() {
                return this.getOutputStallDurationlomOqCM;
            }

            public final kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Class.Builder mergeInlineClassUnderlyingType(kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Type type) {
                if ((this.getHighSpeedVideoFpsRanges & 65536) == 65536 && this.getOutputStallDurationlomOqCM != kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Type.getDefaultInstance()) {
                    this.getOutputStallDurationlomOqCM = kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Type.newBuilder(this.getOutputStallDurationlomOqCM).mergeFrom(type).buildPartial();
                } else {
                    this.getOutputStallDurationlomOqCM = type;
                }
                this.getHighSpeedVideoFpsRanges |= 65536;
                return this;
            }

            public final kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Class.Builder setInlineClassUnderlyingTypeId(int i) {
                this.getHighSpeedVideoFpsRanges |= 131072;
                this.getOutputSizeshNQ4ISI = i;
                return this;
            }

            private void getHighResolutionOutputSizeshNQ4ISI() {
                if ((this.getHighSpeedVideoFpsRanges & 262144) != 262144) {
                    this.getHighSpeedVideoFpsRangesFor = new java.util.ArrayList(this.getHighSpeedVideoFpsRangesFor);
                    this.getHighSpeedVideoFpsRanges |= 262144;
                }
            }

            public final int getAnnotationCount() {
                return this.getHighSpeedVideoFpsRangesFor.size();
            }

            public final kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Annotation getAnnotation(int i) {
                return this.getHighSpeedVideoFpsRangesFor.get(i);
            }

            public final kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Class.Builder addAllAnnotation(java.lang.Iterable<? extends kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Annotation> iterable) {
                getHighResolutionOutputSizeshNQ4ISI();
                kotlin.reflect.jvm.internal.impl.protobuf.AbstractMessageLite.Builder.addAll(iterable, this.getHighSpeedVideoFpsRangesFor);
                return this;
            }

            public final boolean hasTypeTable() {
                return (this.getHighSpeedVideoFpsRanges & 524288) == 524288;
            }

            public final kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.TypeTable getTypeTable() {
                return this.ArtificialStackFrames;
            }

            public final kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Class.Builder mergeTypeTable(kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.TypeTable typeTable) {
                if ((this.getHighSpeedVideoFpsRanges & 524288) == 524288 && this.ArtificialStackFrames != kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.TypeTable.getDefaultInstance()) {
                    this.ArtificialStackFrames = kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.TypeTable.newBuilder(this.ArtificialStackFrames).mergeFrom(typeTable).buildPartial();
                } else {
                    this.ArtificialStackFrames = typeTable;
                }
                this.getHighSpeedVideoFpsRanges |= 524288;
                return this;
            }

            public final kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Class.Builder mergeVersionRequirementTable(kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.VersionRequirementTable versionRequirementTable) {
                if ((this.getHighSpeedVideoFpsRanges & 2097152) == 2097152 && this.CoroutineDebuggingKt != kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.VersionRequirementTable.getDefaultInstance()) {
                    this.CoroutineDebuggingKt = kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.VersionRequirementTable.newBuilder(this.CoroutineDebuggingKt).mergeFrom(versionRequirementTable).buildPartial();
                } else {
                    this.CoroutineDebuggingKt = versionRequirementTable;
                }
                this.getHighSpeedVideoFpsRanges |= 2097152;
                return this;
            }

            public final int getCompilerPluginDataCount() {
                return this.getHighSpeedVideoSizes.size();
            }

            public final kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.CompilerPluginData getCompilerPluginData(int i) {
                return this.getHighSpeedVideoSizes.get(i);
            }

            static /* synthetic */ kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Class.Builder getHighSpeedVideoSizes() {
                return new kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Class.Builder();
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite.ExtendableBuilder, kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite.Builder, kotlin.reflect.jvm.internal.impl.protobuf.AbstractMessageLite.Builder
            /* renamed from: clone */
            public final kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Class.Builder mo23897clone() {
                return new kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Class.Builder().mergeFrom(buildPartial());
            }
        }
    }

    public static final class Package extends kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite.ExtendableMessage<kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Package> implements kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.PackageOrBuilder {
        public static kotlin.reflect.jvm.internal.impl.protobuf.Parser<kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Package> PARSER = new kotlin.reflect.jvm.internal.impl.protobuf.AbstractParser<kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Package>() { // from class: kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Package.1
            @Override // kotlin.reflect.jvm.internal.impl.protobuf.Parser
            public final /* synthetic */ java.lang.Object parsePartialFrom(kotlin.reflect.jvm.internal.impl.protobuf.CodedInputStream codedInputStream, kotlin.reflect.jvm.internal.impl.protobuf.ExtensionRegistryLite extensionRegistryLite) throws kotlin.reflect.jvm.internal.impl.protobuf.InvalidProtocolBufferException {
                return new kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Package(codedInputStream, extensionRegistryLite, (byte) 0);
            }
        };
        private static final kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Package getHighSpeedVideoSizes;
        private byte Camera2StreamConfigurationMap;
        private java.util.List<kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Function> getHighResolutionOutputSizeshNQ4ISI;
        private int getHighSpeedVideoFpsRanges;
        private int getHighSpeedVideoFpsRangesFor;
        private java.util.List<kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Property> getHighSpeedVideoSizesFor;
        private java.util.List<kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.TypeAlias> getInputFormats;
        private final kotlin.reflect.jvm.internal.impl.protobuf.ByteString getInputSizeshNQ4ISI;
        private kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.TypeTable getOutputFormats;
        private kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.VersionRequirementTable getOutputMinFrameDuration;

        /* synthetic */ Package(kotlin.reflect.jvm.internal.impl.protobuf.CodedInputStream codedInputStream, kotlin.reflect.jvm.internal.impl.protobuf.ExtensionRegistryLite extensionRegistryLite, byte b) throws kotlin.reflect.jvm.internal.impl.protobuf.InvalidProtocolBufferException {
            this(codedInputStream, extensionRegistryLite);
        }

        /* synthetic */ Package(kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite.ExtendableBuilder extendableBuilder, byte b) {
            this(extendableBuilder);
        }

        private Package(kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite.ExtendableBuilder<kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Package, ?> extendableBuilder) {
            super(extendableBuilder);
            this.Camera2StreamConfigurationMap = (byte) -1;
            this.getHighSpeedVideoFpsRangesFor = -1;
            this.getInputSizeshNQ4ISI = extendableBuilder.getUnknownFields();
        }

        private Package() {
            this.Camera2StreamConfigurationMap = (byte) -1;
            this.getHighSpeedVideoFpsRangesFor = -1;
            this.getInputSizeshNQ4ISI = kotlin.reflect.jvm.internal.impl.protobuf.ByteString.EMPTY;
        }

        public static kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Package getDefaultInstance() {
            return getHighSpeedVideoSizes;
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.MessageLiteOrBuilder
        public final kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Package getDefaultInstanceForType() {
            return getHighSpeedVideoSizes;
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r4v4 */
        /* JADX WARN: Type inference failed for: r4v6 */
        /* JADX WARN: Type inference failed for: r4v8 */
        private Package(kotlin.reflect.jvm.internal.impl.protobuf.CodedInputStream codedInputStream, kotlin.reflect.jvm.internal.impl.protobuf.ExtensionRegistryLite extensionRegistryLite) throws kotlin.reflect.jvm.internal.impl.protobuf.InvalidProtocolBufferException {
            this.Camera2StreamConfigurationMap = (byte) -1;
            this.getHighSpeedVideoFpsRangesFor = -1;
            getHighSpeedVideoFpsRangesFor();
            kotlin.reflect.jvm.internal.impl.protobuf.ByteString.Output newOutput = kotlin.reflect.jvm.internal.impl.protobuf.ByteString.newOutput();
            kotlin.reflect.jvm.internal.impl.protobuf.CodedOutputStream newInstance = kotlin.reflect.jvm.internal.impl.protobuf.CodedOutputStream.newInstance(newOutput, 1);
            boolean z = false;
            char c = 0;
            while (!z) {
                try {
                    try {
                        try {
                            int readTag = codedInputStream.readTag();
                            if (readTag != 0) {
                                if (readTag == 26) {
                                    int i = (c == true ? 1 : 0) & 1;
                                    c = c;
                                    if (i != 1) {
                                        this.getHighResolutionOutputSizeshNQ4ISI = new java.util.ArrayList();
                                        c = (c == true ? 1 : 0) | 1;
                                    }
                                    this.getHighResolutionOutputSizeshNQ4ISI.add(codedInputStream.readMessage(kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Function.PARSER, extensionRegistryLite));
                                } else if (readTag == 34) {
                                    int i2 = (c == true ? 1 : 0) & 2;
                                    c = c;
                                    if (i2 != 2) {
                                        this.getHighSpeedVideoSizesFor = new java.util.ArrayList();
                                        c = (c == true ? 1 : 0) | 2;
                                    }
                                    this.getHighSpeedVideoSizesFor.add(codedInputStream.readMessage(kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Property.PARSER, extensionRegistryLite));
                                } else if (readTag != 42) {
                                    if (readTag == 242) {
                                        kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.TypeTable.Builder builder = (this.getHighSpeedVideoFpsRanges & 1) == 1 ? this.getOutputFormats.toBuilder() : null;
                                        kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.TypeTable typeTable = (kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.TypeTable) codedInputStream.readMessage(kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.TypeTable.PARSER, extensionRegistryLite);
                                        this.getOutputFormats = typeTable;
                                        if (builder != null) {
                                            builder.mergeFrom(typeTable);
                                            this.getOutputFormats = builder.buildPartial();
                                        }
                                        this.getHighSpeedVideoFpsRanges |= 1;
                                    } else if (readTag == 258) {
                                        kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.VersionRequirementTable.Builder builder2 = (this.getHighSpeedVideoFpsRanges & 2) == 2 ? this.getOutputMinFrameDuration.toBuilder() : null;
                                        kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.VersionRequirementTable versionRequirementTable = (kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.VersionRequirementTable) codedInputStream.readMessage(kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.VersionRequirementTable.PARSER, extensionRegistryLite);
                                        this.getOutputMinFrameDuration = versionRequirementTable;
                                        if (builder2 != null) {
                                            builder2.mergeFrom(versionRequirementTable);
                                            this.getOutputMinFrameDuration = builder2.buildPartial();
                                        }
                                        this.getHighSpeedVideoFpsRanges |= 2;
                                    } else if (!parseUnknownField(codedInputStream, newInstance, extensionRegistryLite, readTag)) {
                                    }
                                } else {
                                    int i3 = (c == true ? 1 : 0) & 4;
                                    c = c;
                                    if (i3 != 4) {
                                        this.getInputFormats = new java.util.ArrayList();
                                        c = (c == true ? 1 : 0) | 4;
                                    }
                                    this.getInputFormats.add(codedInputStream.readMessage(kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.TypeAlias.PARSER, extensionRegistryLite));
                                }
                            }
                            z = true;
                        } catch (kotlin.reflect.jvm.internal.impl.protobuf.InvalidProtocolBufferException e) {
                            throw e.setUnfinishedMessage(this);
                        }
                    } catch (java.io.IOException e2) {
                        throw new kotlin.reflect.jvm.internal.impl.protobuf.InvalidProtocolBufferException(e2.getMessage()).setUnfinishedMessage(this);
                    }
                } catch (java.lang.Throwable th) {
                    if (((c == true ? 1 : 0) & 1) == 1) {
                        this.getHighResolutionOutputSizeshNQ4ISI = java.util.Collections.unmodifiableList(this.getHighResolutionOutputSizeshNQ4ISI);
                    }
                    if (((c == true ? 1 : 0) & 2) == 2) {
                        this.getHighSpeedVideoSizesFor = java.util.Collections.unmodifiableList(this.getHighSpeedVideoSizesFor);
                    }
                    if (((c == true ? 1 : 0) & 4) == 4) {
                        this.getInputFormats = java.util.Collections.unmodifiableList(this.getInputFormats);
                    }
                    try {
                        newInstance.flush();
                    } catch (java.io.IOException unused) {
                    } catch (java.lang.Throwable th2) {
                        this.getInputSizeshNQ4ISI = newOutput.toByteString();
                        throw th2;
                    }
                    this.getInputSizeshNQ4ISI = newOutput.toByteString();
                    makeExtensionsImmutable();
                    throw th;
                }
            }
            if (((c == true ? 1 : 0) & 1) == 1) {
                this.getHighResolutionOutputSizeshNQ4ISI = java.util.Collections.unmodifiableList(this.getHighResolutionOutputSizeshNQ4ISI);
            }
            if (((c == true ? 1 : 0) & 2) == 2) {
                this.getHighSpeedVideoSizesFor = java.util.Collections.unmodifiableList(this.getHighSpeedVideoSizesFor);
            }
            if (((c == true ? 1 : 0) & 4) == 4) {
                this.getInputFormats = java.util.Collections.unmodifiableList(this.getInputFormats);
            }
            try {
                newInstance.flush();
            } catch (java.io.IOException unused2) {
            } catch (java.lang.Throwable th3) {
                this.getInputSizeshNQ4ISI = newOutput.toByteString();
                throw th3;
            }
            this.getInputSizeshNQ4ISI = newOutput.toByteString();
            makeExtensionsImmutable();
        }

        static {
            kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Package r0 = new kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Package();
            getHighSpeedVideoSizes = r0;
            r0.getHighSpeedVideoFpsRangesFor();
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite, kotlin.reflect.jvm.internal.impl.protobuf.MessageLite
        public final kotlin.reflect.jvm.internal.impl.protobuf.Parser<kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Package> getParserForType() {
            return PARSER;
        }

        public final java.util.List<kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Function> getFunctionList() {
            return this.getHighResolutionOutputSizeshNQ4ISI;
        }

        public final int getFunctionCount() {
            return this.getHighResolutionOutputSizeshNQ4ISI.size();
        }

        public final kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Function getFunction(int i) {
            return this.getHighResolutionOutputSizeshNQ4ISI.get(i);
        }

        public final java.util.List<kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Property> getPropertyList() {
            return this.getHighSpeedVideoSizesFor;
        }

        public final int getPropertyCount() {
            return this.getHighSpeedVideoSizesFor.size();
        }

        public final kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Property getProperty(int i) {
            return this.getHighSpeedVideoSizesFor.get(i);
        }

        public final java.util.List<kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.TypeAlias> getTypeAliasList() {
            return this.getInputFormats;
        }

        public final int getTypeAliasCount() {
            return this.getInputFormats.size();
        }

        public final kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.TypeAlias getTypeAlias(int i) {
            return this.getInputFormats.get(i);
        }

        public final boolean hasTypeTable() {
            return (this.getHighSpeedVideoFpsRanges & 1) == 1;
        }

        public final kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.TypeTable getTypeTable() {
            return this.getOutputFormats;
        }

        public final boolean hasVersionRequirementTable() {
            return (this.getHighSpeedVideoFpsRanges & 2) == 2;
        }

        public final kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.VersionRequirementTable getVersionRequirementTable() {
            return this.getOutputMinFrameDuration;
        }

        private void getHighSpeedVideoFpsRangesFor() {
            this.getHighResolutionOutputSizeshNQ4ISI = java.util.Collections.emptyList();
            this.getHighSpeedVideoSizesFor = java.util.Collections.emptyList();
            this.getInputFormats = java.util.Collections.emptyList();
            this.getOutputFormats = kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.TypeTable.getDefaultInstance();
            this.getOutputMinFrameDuration = kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.VersionRequirementTable.getDefaultInstance();
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.MessageLiteOrBuilder
        public final boolean isInitialized() {
            byte b = this.Camera2StreamConfigurationMap;
            if (b == 1) {
                return true;
            }
            if (b == 0) {
                return false;
            }
            for (int i = 0; i < getFunctionCount(); i++) {
                if (!getFunction(i).isInitialized()) {
                    this.Camera2StreamConfigurationMap = (byte) 0;
                    return false;
                }
            }
            for (int i2 = 0; i2 < getPropertyCount(); i2++) {
                if (!getProperty(i2).isInitialized()) {
                    this.Camera2StreamConfigurationMap = (byte) 0;
                    return false;
                }
            }
            for (int i3 = 0; i3 < getTypeAliasCount(); i3++) {
                if (!getTypeAlias(i3).isInitialized()) {
                    this.Camera2StreamConfigurationMap = (byte) 0;
                    return false;
                }
            }
            if (hasTypeTable() && !getTypeTable().isInitialized()) {
                this.Camera2StreamConfigurationMap = (byte) 0;
                return false;
            }
            if (!extensionsAreInitialized()) {
                this.Camera2StreamConfigurationMap = (byte) 0;
                return false;
            }
            this.Camera2StreamConfigurationMap = (byte) 1;
            return true;
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.MessageLite
        public final void writeTo(kotlin.reflect.jvm.internal.impl.protobuf.CodedOutputStream codedOutputStream) throws java.io.IOException {
            getSerializedSize();
            kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite.ExtendableMessage<MessageType>.ExtensionWriter newExtensionWriter = newExtensionWriter();
            for (int i = 0; i < this.getHighResolutionOutputSizeshNQ4ISI.size(); i++) {
                codedOutputStream.writeMessage(3, this.getHighResolutionOutputSizeshNQ4ISI.get(i));
            }
            for (int i2 = 0; i2 < this.getHighSpeedVideoSizesFor.size(); i2++) {
                codedOutputStream.writeMessage(4, this.getHighSpeedVideoSizesFor.get(i2));
            }
            for (int i3 = 0; i3 < this.getInputFormats.size(); i3++) {
                codedOutputStream.writeMessage(5, this.getInputFormats.get(i3));
            }
            if ((this.getHighSpeedVideoFpsRanges & 1) == 1) {
                codedOutputStream.writeMessage(30, this.getOutputFormats);
            }
            if ((this.getHighSpeedVideoFpsRanges & 2) == 2) {
                codedOutputStream.writeMessage(32, this.getOutputMinFrameDuration);
            }
            newExtensionWriter.writeUntil(200, codedOutputStream);
            codedOutputStream.writeRawBytes(this.getInputSizeshNQ4ISI);
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.MessageLite
        public final int getSerializedSize() {
            int i = this.getHighSpeedVideoFpsRangesFor;
            if (i != -1) {
                return i;
            }
            int i2 = 0;
            for (int i3 = 0; i3 < this.getHighResolutionOutputSizeshNQ4ISI.size(); i3++) {
                i2 += kotlin.reflect.jvm.internal.impl.protobuf.CodedOutputStream.computeMessageSize(3, this.getHighResolutionOutputSizeshNQ4ISI.get(i3));
            }
            for (int i4 = 0; i4 < this.getHighSpeedVideoSizesFor.size(); i4++) {
                i2 += kotlin.reflect.jvm.internal.impl.protobuf.CodedOutputStream.computeMessageSize(4, this.getHighSpeedVideoSizesFor.get(i4));
            }
            for (int i5 = 0; i5 < this.getInputFormats.size(); i5++) {
                i2 += kotlin.reflect.jvm.internal.impl.protobuf.CodedOutputStream.computeMessageSize(5, this.getInputFormats.get(i5));
            }
            if ((this.getHighSpeedVideoFpsRanges & 1) == 1) {
                i2 += kotlin.reflect.jvm.internal.impl.protobuf.CodedOutputStream.computeMessageSize(30, this.getOutputFormats);
            }
            if ((this.getHighSpeedVideoFpsRanges & 2) == 2) {
                i2 += kotlin.reflect.jvm.internal.impl.protobuf.CodedOutputStream.computeMessageSize(32, this.getOutputMinFrameDuration);
            }
            int extensionsSerializedSize = i2 + extensionsSerializedSize() + this.getInputSizeshNQ4ISI.size();
            this.getHighSpeedVideoFpsRangesFor = extensionsSerializedSize;
            return extensionsSerializedSize;
        }

        public static kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Package parseFrom(java.io.InputStream inputStream, kotlin.reflect.jvm.internal.impl.protobuf.ExtensionRegistryLite extensionRegistryLite) throws java.io.IOException {
            return PARSER.parseFrom(inputStream, extensionRegistryLite);
        }

        public static kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Package.Builder newBuilder() {
            return kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Package.Builder.getHighSpeedVideoFpsRanges();
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.MessageLite
        public final kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Package.Builder newBuilderForType() {
            return newBuilder();
        }

        public static kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Package.Builder newBuilder(kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Package r1) {
            return newBuilder().mergeFrom(r1);
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.MessageLite
        public final kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Package.Builder toBuilder() {
            return newBuilder(this);
        }

        public static final class Builder extends kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite.ExtendableBuilder<kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Package, kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Package.Builder> implements kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.PackageOrBuilder {
            private int getHighResolutionOutputSizeshNQ4ISI;
            private java.util.List<kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Function> getHighSpeedVideoFpsRanges = java.util.Collections.emptyList();
            private java.util.List<kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Property> Camera2StreamConfigurationMap = java.util.Collections.emptyList();
            private java.util.List<kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.TypeAlias> getHighSpeedVideoSizes = java.util.Collections.emptyList();
            private kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.TypeTable getHighSpeedVideoFpsRangesFor = kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.TypeTable.getDefaultInstance();
            private kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.VersionRequirementTable getOutputFormats = kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.VersionRequirementTable.getDefaultInstance();

            private Builder() {
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite.Builder, kotlin.reflect.jvm.internal.impl.protobuf.MessageLiteOrBuilder
            public final kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Package getDefaultInstanceForType() {
                return kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Package.getDefaultInstance();
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.MessageLite.Builder
            public final kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Package build() {
                kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Package buildPartial = buildPartial();
                if (buildPartial.isInitialized()) {
                    return buildPartial;
                }
                throw newUninitializedMessageException(buildPartial);
            }

            /* JADX WARN: Multi-variable type inference failed */
            public final kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Package buildPartial() {
                kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Package r0 = new kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Package((kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite.ExtendableBuilder) this, (byte) (0 == true ? 1 : 0));
                int i = this.getHighResolutionOutputSizeshNQ4ISI;
                if ((i & 1) == 1) {
                    this.getHighSpeedVideoFpsRanges = java.util.Collections.unmodifiableList(this.getHighSpeedVideoFpsRanges);
                    this.getHighResolutionOutputSizeshNQ4ISI &= -2;
                }
                r0.getHighResolutionOutputSizeshNQ4ISI = this.getHighSpeedVideoFpsRanges;
                if ((this.getHighResolutionOutputSizeshNQ4ISI & 2) == 2) {
                    this.Camera2StreamConfigurationMap = java.util.Collections.unmodifiableList(this.Camera2StreamConfigurationMap);
                    this.getHighResolutionOutputSizeshNQ4ISI &= -3;
                }
                r0.getHighSpeedVideoSizesFor = this.Camera2StreamConfigurationMap;
                if ((this.getHighResolutionOutputSizeshNQ4ISI & 4) == 4) {
                    this.getHighSpeedVideoSizes = java.util.Collections.unmodifiableList(this.getHighSpeedVideoSizes);
                    this.getHighResolutionOutputSizeshNQ4ISI &= -5;
                }
                r0.getInputFormats = this.getHighSpeedVideoSizes;
                int i2 = (i & 8) == 8 ? 1 : 0;
                r0.getOutputFormats = this.getHighSpeedVideoFpsRangesFor;
                if ((i & 16) == 16) {
                    i2 |= 2;
                }
                r0.getOutputMinFrameDuration = this.getOutputFormats;
                r0.getHighSpeedVideoFpsRanges = i2;
                return r0;
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite.Builder
            public final kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Package.Builder mergeFrom(kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Package r4) {
                if (r4 == kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Package.getDefaultInstance()) {
                    return this;
                }
                if (!r4.getHighResolutionOutputSizeshNQ4ISI.isEmpty()) {
                    if (this.getHighSpeedVideoFpsRanges.isEmpty()) {
                        this.getHighSpeedVideoFpsRanges = r4.getHighResolutionOutputSizeshNQ4ISI;
                        this.getHighResolutionOutputSizeshNQ4ISI &= -2;
                    } else {
                        if ((this.getHighResolutionOutputSizeshNQ4ISI & 1) != 1) {
                            this.getHighSpeedVideoFpsRanges = new java.util.ArrayList(this.getHighSpeedVideoFpsRanges);
                            this.getHighResolutionOutputSizeshNQ4ISI |= 1;
                        }
                        this.getHighSpeedVideoFpsRanges.addAll(r4.getHighResolutionOutputSizeshNQ4ISI);
                    }
                }
                if (!r4.getHighSpeedVideoSizesFor.isEmpty()) {
                    if (this.Camera2StreamConfigurationMap.isEmpty()) {
                        this.Camera2StreamConfigurationMap = r4.getHighSpeedVideoSizesFor;
                        this.getHighResolutionOutputSizeshNQ4ISI &= -3;
                    } else {
                        if ((this.getHighResolutionOutputSizeshNQ4ISI & 2) != 2) {
                            this.Camera2StreamConfigurationMap = new java.util.ArrayList(this.Camera2StreamConfigurationMap);
                            this.getHighResolutionOutputSizeshNQ4ISI |= 2;
                        }
                        this.Camera2StreamConfigurationMap.addAll(r4.getHighSpeedVideoSizesFor);
                    }
                }
                if (!r4.getInputFormats.isEmpty()) {
                    if (this.getHighSpeedVideoSizes.isEmpty()) {
                        this.getHighSpeedVideoSizes = r4.getInputFormats;
                        this.getHighResolutionOutputSizeshNQ4ISI &= -5;
                    } else {
                        if ((this.getHighResolutionOutputSizeshNQ4ISI & 4) != 4) {
                            this.getHighSpeedVideoSizes = new java.util.ArrayList(this.getHighSpeedVideoSizes);
                            this.getHighResolutionOutputSizeshNQ4ISI |= 4;
                        }
                        this.getHighSpeedVideoSizes.addAll(r4.getInputFormats);
                    }
                }
                if (r4.hasTypeTable()) {
                    mergeTypeTable(r4.getTypeTable());
                }
                if (r4.hasVersionRequirementTable()) {
                    mergeVersionRequirementTable(r4.getVersionRequirementTable());
                }
                mergeExtensionFields(r4);
                setUnknownFields(getUnknownFields().concat(r4.getInputSizeshNQ4ISI));
                return this;
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.MessageLiteOrBuilder
            public final boolean isInitialized() {
                for (int i = 0; i < getFunctionCount(); i++) {
                    if (!getFunction(i).isInitialized()) {
                        return false;
                    }
                }
                for (int i2 = 0; i2 < getPropertyCount(); i2++) {
                    if (!getProperty(i2).isInitialized()) {
                        return false;
                    }
                }
                for (int i3 = 0; i3 < getTypeAliasCount(); i3++) {
                    if (!getTypeAlias(i3).isInitialized()) {
                        return false;
                    }
                }
                return (!hasTypeTable() || getTypeTable().isInitialized()) && extensionsAreInitialized();
            }

            /* JADX WARN: Removed duplicated region for block: B:15:0x001d  */
            @Override // kotlin.reflect.jvm.internal.impl.protobuf.AbstractMessageLite.Builder, kotlin.reflect.jvm.internal.impl.protobuf.MessageLite.Builder
            /*
                Code decompiled incorrectly, please refer to instructions dump.
            */
            public final kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Package.Builder mergeFrom(kotlin.reflect.jvm.internal.impl.protobuf.CodedInputStream codedInputStream, kotlin.reflect.jvm.internal.impl.protobuf.ExtensionRegistryLite extensionRegistryLite) throws java.io.IOException {
                kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Package r3;
                try {
                    try {
                        kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Package parsePartialFrom = kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Package.PARSER.parsePartialFrom(codedInputStream, extensionRegistryLite);
                        if (parsePartialFrom != null) {
                            mergeFrom(parsePartialFrom);
                        }
                        return this;
                    } catch (kotlin.reflect.jvm.internal.impl.protobuf.InvalidProtocolBufferException e) {
                        r3 = (kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Package) e.getUnfinishedMessage();
                        try {
                            throw e;
                        } catch (java.lang.Throwable th) {
                            th = th;
                            if (r3 != null) {
                                mergeFrom(r3);
                            }
                            throw th;
                        }
                    }
                } catch (java.lang.Throwable th2) {
                    th = th2;
                    r3 = null;
                    if (r3 != null) {
                    }
                    throw th;
                }
            }

            public final int getFunctionCount() {
                return this.getHighSpeedVideoFpsRanges.size();
            }

            public final kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Function getFunction(int i) {
                return this.getHighSpeedVideoFpsRanges.get(i);
            }

            public final int getPropertyCount() {
                return this.Camera2StreamConfigurationMap.size();
            }

            public final kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Property getProperty(int i) {
                return this.Camera2StreamConfigurationMap.get(i);
            }

            public final int getTypeAliasCount() {
                return this.getHighSpeedVideoSizes.size();
            }

            public final kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.TypeAlias getTypeAlias(int i) {
                return this.getHighSpeedVideoSizes.get(i);
            }

            public final boolean hasTypeTable() {
                return (this.getHighResolutionOutputSizeshNQ4ISI & 8) == 8;
            }

            public final kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.TypeTable getTypeTable() {
                return this.getHighSpeedVideoFpsRangesFor;
            }

            public final kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Package.Builder mergeTypeTable(kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.TypeTable typeTable) {
                if ((this.getHighResolutionOutputSizeshNQ4ISI & 8) == 8 && this.getHighSpeedVideoFpsRangesFor != kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.TypeTable.getDefaultInstance()) {
                    this.getHighSpeedVideoFpsRangesFor = kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.TypeTable.newBuilder(this.getHighSpeedVideoFpsRangesFor).mergeFrom(typeTable).buildPartial();
                } else {
                    this.getHighSpeedVideoFpsRangesFor = typeTable;
                }
                this.getHighResolutionOutputSizeshNQ4ISI |= 8;
                return this;
            }

            public final kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Package.Builder mergeVersionRequirementTable(kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.VersionRequirementTable versionRequirementTable) {
                if ((this.getHighResolutionOutputSizeshNQ4ISI & 16) == 16 && this.getOutputFormats != kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.VersionRequirementTable.getDefaultInstance()) {
                    this.getOutputFormats = kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.VersionRequirementTable.newBuilder(this.getOutputFormats).mergeFrom(versionRequirementTable).buildPartial();
                } else {
                    this.getOutputFormats = versionRequirementTable;
                }
                this.getHighResolutionOutputSizeshNQ4ISI |= 16;
                return this;
            }

            static /* synthetic */ kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Package.Builder getHighSpeedVideoFpsRanges() {
                return new kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Package.Builder();
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite.ExtendableBuilder, kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite.Builder, kotlin.reflect.jvm.internal.impl.protobuf.AbstractMessageLite.Builder
            /* renamed from: clone */
            public final kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Package.Builder mo23897clone() {
                return new kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Package.Builder().mergeFrom(buildPartial());
            }
        }
    }

    public static final class TypeTable extends kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite implements kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.TypeTableOrBuilder {
        public static kotlin.reflect.jvm.internal.impl.protobuf.Parser<kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.TypeTable> PARSER = new kotlin.reflect.jvm.internal.impl.protobuf.AbstractParser<kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.TypeTable>() { // from class: kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.TypeTable.1
            @Override // kotlin.reflect.jvm.internal.impl.protobuf.Parser
            public final /* synthetic */ java.lang.Object parsePartialFrom(kotlin.reflect.jvm.internal.impl.protobuf.CodedInputStream codedInputStream, kotlin.reflect.jvm.internal.impl.protobuf.ExtensionRegistryLite extensionRegistryLite) throws kotlin.reflect.jvm.internal.impl.protobuf.InvalidProtocolBufferException {
                return new kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.TypeTable(codedInputStream, extensionRegistryLite, (byte) 0);
            }
        };
        private static final kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.TypeTable getHighResolutionOutputSizeshNQ4ISI;
        private int Camera2StreamConfigurationMap;
        private byte getHighSpeedVideoFpsRanges;
        private int getHighSpeedVideoFpsRangesFor;
        private int getHighSpeedVideoSizes;
        private final kotlin.reflect.jvm.internal.impl.protobuf.ByteString getOutputFormats;
        private java.util.List<kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Type> getOutputMinFrameDuration;

        /* synthetic */ TypeTable(kotlin.reflect.jvm.internal.impl.protobuf.CodedInputStream codedInputStream, kotlin.reflect.jvm.internal.impl.protobuf.ExtensionRegistryLite extensionRegistryLite, byte b) throws kotlin.reflect.jvm.internal.impl.protobuf.InvalidProtocolBufferException {
            this(codedInputStream, extensionRegistryLite);
        }

        /* synthetic */ TypeTable(kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite.Builder builder, byte b) {
            this(builder);
        }

        private TypeTable(kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite.Builder builder) {
            super(builder);
            this.getHighSpeedVideoFpsRanges = (byte) -1;
            this.getHighSpeedVideoFpsRangesFor = -1;
            this.getOutputFormats = builder.getUnknownFields();
        }

        private TypeTable() {
            this.getHighSpeedVideoFpsRanges = (byte) -1;
            this.getHighSpeedVideoFpsRangesFor = -1;
            this.getOutputFormats = kotlin.reflect.jvm.internal.impl.protobuf.ByteString.EMPTY;
        }

        public static kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.TypeTable getDefaultInstance() {
            return getHighResolutionOutputSizeshNQ4ISI;
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.MessageLiteOrBuilder
        public final kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.TypeTable getDefaultInstanceForType() {
            return getHighResolutionOutputSizeshNQ4ISI;
        }

        /* JADX WARN: Multi-variable type inference failed */
        private TypeTable(kotlin.reflect.jvm.internal.impl.protobuf.CodedInputStream codedInputStream, kotlin.reflect.jvm.internal.impl.protobuf.ExtensionRegistryLite extensionRegistryLite) throws kotlin.reflect.jvm.internal.impl.protobuf.InvalidProtocolBufferException {
            this.getHighSpeedVideoFpsRanges = (byte) -1;
            this.getHighSpeedVideoFpsRangesFor = -1;
            this.getOutputMinFrameDuration = java.util.Collections.emptyList();
            this.Camera2StreamConfigurationMap = -1;
            kotlin.reflect.jvm.internal.impl.protobuf.ByteString.Output newOutput = kotlin.reflect.jvm.internal.impl.protobuf.ByteString.newOutput();
            kotlin.reflect.jvm.internal.impl.protobuf.CodedOutputStream newInstance = kotlin.reflect.jvm.internal.impl.protobuf.CodedOutputStream.newInstance(newOutput, 1);
            boolean z = false;
            boolean z2 = false;
            while (!z) {
                try {
                    try {
                        int readTag = codedInputStream.readTag();
                        if (readTag != 0) {
                            if (readTag == 10) {
                                if (!z2) {
                                    this.getOutputMinFrameDuration = new java.util.ArrayList();
                                    z2 = true;
                                }
                                this.getOutputMinFrameDuration.add(codedInputStream.readMessage(kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Type.PARSER, extensionRegistryLite));
                            } else if (readTag == 16) {
                                this.getHighSpeedVideoSizes |= 1;
                                this.Camera2StreamConfigurationMap = codedInputStream.readInt32();
                            } else if (!parseUnknownField(codedInputStream, newInstance, extensionRegistryLite, readTag)) {
                            }
                        }
                        z = true;
                    } catch (kotlin.reflect.jvm.internal.impl.protobuf.InvalidProtocolBufferException e) {
                        throw e.setUnfinishedMessage(this);
                    } catch (java.io.IOException e2) {
                        throw new kotlin.reflect.jvm.internal.impl.protobuf.InvalidProtocolBufferException(e2.getMessage()).setUnfinishedMessage(this);
                    }
                } catch (java.lang.Throwable th) {
                    if (z2) {
                        this.getOutputMinFrameDuration = java.util.Collections.unmodifiableList(this.getOutputMinFrameDuration);
                    }
                    try {
                        newInstance.flush();
                    } catch (java.io.IOException unused) {
                    } catch (java.lang.Throwable th2) {
                        this.getOutputFormats = newOutput.toByteString();
                        throw th2;
                    }
                    this.getOutputFormats = newOutput.toByteString();
                    makeExtensionsImmutable();
                    throw th;
                }
            }
            if (z2) {
                this.getOutputMinFrameDuration = java.util.Collections.unmodifiableList(this.getOutputMinFrameDuration);
            }
            try {
                newInstance.flush();
            } catch (java.io.IOException unused2) {
            } catch (java.lang.Throwable th3) {
                this.getOutputFormats = newOutput.toByteString();
                throw th3;
            }
            this.getOutputFormats = newOutput.toByteString();
            makeExtensionsImmutable();
        }

        static {
            kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.TypeTable typeTable = new kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.TypeTable();
            getHighResolutionOutputSizeshNQ4ISI = typeTable;
            typeTable.getOutputMinFrameDuration = java.util.Collections.emptyList();
            typeTable.Camera2StreamConfigurationMap = -1;
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite, kotlin.reflect.jvm.internal.impl.protobuf.MessageLite
        public final kotlin.reflect.jvm.internal.impl.protobuf.Parser<kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.TypeTable> getParserForType() {
            return PARSER;
        }

        public final java.util.List<kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Type> getTypeList() {
            return this.getOutputMinFrameDuration;
        }

        public final int getTypeCount() {
            return this.getOutputMinFrameDuration.size();
        }

        public final kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Type getType(int i) {
            return this.getOutputMinFrameDuration.get(i);
        }

        public final boolean hasFirstNullable() {
            return (this.getHighSpeedVideoSizes & 1) == 1;
        }

        public final int getFirstNullable() {
            return this.Camera2StreamConfigurationMap;
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.MessageLiteOrBuilder
        public final boolean isInitialized() {
            byte b = this.getHighSpeedVideoFpsRanges;
            if (b == 1) {
                return true;
            }
            if (b == 0) {
                return false;
            }
            for (int i = 0; i < getTypeCount(); i++) {
                if (!getType(i).isInitialized()) {
                    this.getHighSpeedVideoFpsRanges = (byte) 0;
                    return false;
                }
            }
            this.getHighSpeedVideoFpsRanges = (byte) 1;
            return true;
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.MessageLite
        public final void writeTo(kotlin.reflect.jvm.internal.impl.protobuf.CodedOutputStream codedOutputStream) throws java.io.IOException {
            getSerializedSize();
            for (int i = 0; i < this.getOutputMinFrameDuration.size(); i++) {
                codedOutputStream.writeMessage(1, this.getOutputMinFrameDuration.get(i));
            }
            if ((this.getHighSpeedVideoSizes & 1) == 1) {
                codedOutputStream.writeInt32(2, this.Camera2StreamConfigurationMap);
            }
            codedOutputStream.writeRawBytes(this.getOutputFormats);
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.MessageLite
        public final int getSerializedSize() {
            int i = this.getHighSpeedVideoFpsRangesFor;
            if (i != -1) {
                return i;
            }
            int i2 = 0;
            for (int i3 = 0; i3 < this.getOutputMinFrameDuration.size(); i3++) {
                i2 += kotlin.reflect.jvm.internal.impl.protobuf.CodedOutputStream.computeMessageSize(1, this.getOutputMinFrameDuration.get(i3));
            }
            if ((this.getHighSpeedVideoSizes & 1) == 1) {
                i2 += kotlin.reflect.jvm.internal.impl.protobuf.CodedOutputStream.computeInt32Size(2, this.Camera2StreamConfigurationMap);
            }
            int size = i2 + this.getOutputFormats.size();
            this.getHighSpeedVideoFpsRangesFor = size;
            return size;
        }

        public static kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.TypeTable.Builder newBuilder() {
            return kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.TypeTable.Builder.getHighSpeedVideoFpsRanges();
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.MessageLite
        public final kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.TypeTable.Builder newBuilderForType() {
            return newBuilder();
        }

        public static kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.TypeTable.Builder newBuilder(kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.TypeTable typeTable) {
            return newBuilder().mergeFrom(typeTable);
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.MessageLite
        public final kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.TypeTable.Builder toBuilder() {
            return newBuilder(this);
        }

        public static final class Builder extends kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite.Builder<kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.TypeTable, kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.TypeTable.Builder> implements kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.TypeTableOrBuilder {
            private int getHighResolutionOutputSizeshNQ4ISI;
            private java.util.List<kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Type> getHighSpeedVideoFpsRanges = java.util.Collections.emptyList();
            private int Camera2StreamConfigurationMap = -1;

            private Builder() {
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite.Builder, kotlin.reflect.jvm.internal.impl.protobuf.MessageLiteOrBuilder
            public final kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.TypeTable getDefaultInstanceForType() {
                return kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.TypeTable.getDefaultInstance();
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.MessageLite.Builder
            public final kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.TypeTable build() {
                kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.TypeTable buildPartial = buildPartial();
                if (buildPartial.isInitialized()) {
                    return buildPartial;
                }
                throw newUninitializedMessageException(buildPartial);
            }

            public final kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.TypeTable buildPartial() {
                kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.TypeTable typeTable = new kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.TypeTable((kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite.Builder) this, (byte) 0);
                int i = this.getHighResolutionOutputSizeshNQ4ISI;
                if ((i & 1) == 1) {
                    this.getHighSpeedVideoFpsRanges = java.util.Collections.unmodifiableList(this.getHighSpeedVideoFpsRanges);
                    this.getHighResolutionOutputSizeshNQ4ISI &= -2;
                }
                typeTable.getOutputMinFrameDuration = this.getHighSpeedVideoFpsRanges;
                byte b = (i & 2) == 2 ? (byte) 1 : (byte) 0;
                typeTable.Camera2StreamConfigurationMap = this.Camera2StreamConfigurationMap;
                typeTable.getHighSpeedVideoSizes = b;
                return typeTable;
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite.Builder
            public final kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.TypeTable.Builder mergeFrom(kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.TypeTable typeTable) {
                if (typeTable == kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.TypeTable.getDefaultInstance()) {
                    return this;
                }
                if (!typeTable.getOutputMinFrameDuration.isEmpty()) {
                    if (this.getHighSpeedVideoFpsRanges.isEmpty()) {
                        this.getHighSpeedVideoFpsRanges = typeTable.getOutputMinFrameDuration;
                        this.getHighResolutionOutputSizeshNQ4ISI &= -2;
                    } else {
                        if ((this.getHighResolutionOutputSizeshNQ4ISI & 1) != 1) {
                            this.getHighSpeedVideoFpsRanges = new java.util.ArrayList(this.getHighSpeedVideoFpsRanges);
                            this.getHighResolutionOutputSizeshNQ4ISI |= 1;
                        }
                        this.getHighSpeedVideoFpsRanges.addAll(typeTable.getOutputMinFrameDuration);
                    }
                }
                if (typeTable.hasFirstNullable()) {
                    setFirstNullable(typeTable.getFirstNullable());
                }
                setUnknownFields(getUnknownFields().concat(typeTable.getOutputFormats));
                return this;
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.MessageLiteOrBuilder
            public final boolean isInitialized() {
                for (int i = 0; i < getTypeCount(); i++) {
                    if (!getType(i).isInitialized()) {
                        return false;
                    }
                }
                return true;
            }

            /* JADX WARN: Removed duplicated region for block: B:15:0x001d  */
            @Override // kotlin.reflect.jvm.internal.impl.protobuf.AbstractMessageLite.Builder, kotlin.reflect.jvm.internal.impl.protobuf.MessageLite.Builder
            /*
                Code decompiled incorrectly, please refer to instructions dump.
            */
            public final kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.TypeTable.Builder mergeFrom(kotlin.reflect.jvm.internal.impl.protobuf.CodedInputStream codedInputStream, kotlin.reflect.jvm.internal.impl.protobuf.ExtensionRegistryLite extensionRegistryLite) throws java.io.IOException {
                kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.TypeTable typeTable;
                try {
                    try {
                        kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.TypeTable parsePartialFrom = kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.TypeTable.PARSER.parsePartialFrom(codedInputStream, extensionRegistryLite);
                        if (parsePartialFrom != null) {
                            mergeFrom(parsePartialFrom);
                        }
                        return this;
                    } catch (kotlin.reflect.jvm.internal.impl.protobuf.InvalidProtocolBufferException e) {
                        typeTable = (kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.TypeTable) e.getUnfinishedMessage();
                        try {
                            throw e;
                        } catch (java.lang.Throwable th) {
                            th = th;
                            if (typeTable != null) {
                                mergeFrom(typeTable);
                            }
                            throw th;
                        }
                    }
                } catch (java.lang.Throwable th2) {
                    th = th2;
                    typeTable = null;
                    if (typeTable != null) {
                    }
                    throw th;
                }
            }

            public final int getTypeCount() {
                return this.getHighSpeedVideoFpsRanges.size();
            }

            public final kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Type getType(int i) {
                return this.getHighSpeedVideoFpsRanges.get(i);
            }

            public final kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.TypeTable.Builder setFirstNullable(int i) {
                this.getHighResolutionOutputSizeshNQ4ISI |= 2;
                this.Camera2StreamConfigurationMap = i;
                return this;
            }

            static /* synthetic */ kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.TypeTable.Builder getHighSpeedVideoFpsRanges() {
                return new kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.TypeTable.Builder();
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite.Builder, kotlin.reflect.jvm.internal.impl.protobuf.AbstractMessageLite.Builder
            /* renamed from: clone */
            public final kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.TypeTable.Builder mo23897clone() {
                return new kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.TypeTable.Builder().mergeFrom(buildPartial());
            }
        }
    }

    public static final class Constructor extends kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite.ExtendableMessage<kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Constructor> implements kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.ConstructorOrBuilder {
        private static final kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Constructor Camera2StreamConfigurationMap;
        public static kotlin.reflect.jvm.internal.impl.protobuf.Parser<kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Constructor> PARSER = new kotlin.reflect.jvm.internal.impl.protobuf.AbstractParser<kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Constructor>() { // from class: kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Constructor.1
            @Override // kotlin.reflect.jvm.internal.impl.protobuf.Parser
            public final /* synthetic */ java.lang.Object parsePartialFrom(kotlin.reflect.jvm.internal.impl.protobuf.CodedInputStream codedInputStream, kotlin.reflect.jvm.internal.impl.protobuf.ExtensionRegistryLite extensionRegistryLite) throws kotlin.reflect.jvm.internal.impl.protobuf.InvalidProtocolBufferException {
                return new kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Constructor(codedInputStream, extensionRegistryLite, (byte) 0);
            }
        };
        private int getHighResolutionOutputSizeshNQ4ISI;
        private int getHighSpeedVideoFpsRanges;
        private java.util.List<kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Annotation> getHighSpeedVideoFpsRangesFor;
        private java.util.List<kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.CompilerPluginData> getHighSpeedVideoSizes;
        private byte getHighSpeedVideoSizesFor;
        private java.util.List<kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.ValueParameter> getInputFormats;
        private int getInputSizeshNQ4ISI;
        private final kotlin.reflect.jvm.internal.impl.protobuf.ByteString getOutputFormats;
        private java.util.List<java.lang.Integer> getOutputMinFrameDuration;

        /* synthetic */ Constructor(kotlin.reflect.jvm.internal.impl.protobuf.CodedInputStream codedInputStream, kotlin.reflect.jvm.internal.impl.protobuf.ExtensionRegistryLite extensionRegistryLite, byte b) throws kotlin.reflect.jvm.internal.impl.protobuf.InvalidProtocolBufferException {
            this(codedInputStream, extensionRegistryLite);
        }

        /* synthetic */ Constructor(kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite.ExtendableBuilder extendableBuilder, byte b) {
            this(extendableBuilder);
        }

        private Constructor(kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite.ExtendableBuilder<kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Constructor, ?> extendableBuilder) {
            super(extendableBuilder);
            this.getHighSpeedVideoSizesFor = (byte) -1;
            this.getInputSizeshNQ4ISI = -1;
            this.getOutputFormats = extendableBuilder.getUnknownFields();
        }

        private Constructor() {
            this.getHighSpeedVideoSizesFor = (byte) -1;
            this.getInputSizeshNQ4ISI = -1;
            this.getOutputFormats = kotlin.reflect.jvm.internal.impl.protobuf.ByteString.EMPTY;
        }

        public static kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Constructor getDefaultInstance() {
            return Camera2StreamConfigurationMap;
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.MessageLiteOrBuilder
        public final kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Constructor getDefaultInstanceForType() {
            return Camera2StreamConfigurationMap;
        }

        /* JADX WARN: Multi-variable type inference failed */
        private Constructor(kotlin.reflect.jvm.internal.impl.protobuf.CodedInputStream codedInputStream, kotlin.reflect.jvm.internal.impl.protobuf.ExtensionRegistryLite extensionRegistryLite) throws kotlin.reflect.jvm.internal.impl.protobuf.InvalidProtocolBufferException {
            this.getHighSpeedVideoSizesFor = (byte) -1;
            this.getInputSizeshNQ4ISI = -1;
            getHighSpeedVideoFpsRanges();
            kotlin.reflect.jvm.internal.impl.protobuf.ByteString.Output newOutput = kotlin.reflect.jvm.internal.impl.protobuf.ByteString.newOutput();
            kotlin.reflect.jvm.internal.impl.protobuf.CodedOutputStream newInstance = kotlin.reflect.jvm.internal.impl.protobuf.CodedOutputStream.newInstance(newOutput, 1);
            boolean z = false;
            int i = 0;
            while (!z) {
                try {
                    try {
                        int readTag = codedInputStream.readTag();
                        if (readTag != 0) {
                            if (readTag == 8) {
                                this.getHighResolutionOutputSizeshNQ4ISI |= 1;
                                this.getHighSpeedVideoFpsRanges = codedInputStream.readInt32();
                            } else if (readTag == 18) {
                                if ((i & 2) != 2) {
                                    this.getInputFormats = new java.util.ArrayList();
                                    i |= 2;
                                }
                                this.getInputFormats.add(codedInputStream.readMessage(kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.ValueParameter.PARSER, extensionRegistryLite));
                            } else if (readTag == 26) {
                                if ((i & 16) != 16) {
                                    this.getHighSpeedVideoFpsRangesFor = new java.util.ArrayList();
                                    i |= 16;
                                }
                                this.getHighSpeedVideoFpsRangesFor.add(codedInputStream.readMessage(kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Annotation.PARSER, extensionRegistryLite));
                            } else if (readTag == 248) {
                                if ((i & 4) != 4) {
                                    this.getOutputMinFrameDuration = new java.util.ArrayList();
                                    i |= 4;
                                }
                                this.getOutputMinFrameDuration.add(java.lang.Integer.valueOf(codedInputStream.readInt32()));
                            } else if (readTag == 250) {
                                int pushLimit = codedInputStream.pushLimit(codedInputStream.readRawVarint32());
                                if ((i & 4) != 4 && codedInputStream.getBytesUntilLimit() > 0) {
                                    this.getOutputMinFrameDuration = new java.util.ArrayList();
                                    i |= 4;
                                }
                                while (codedInputStream.getBytesUntilLimit() > 0) {
                                    this.getOutputMinFrameDuration.add(java.lang.Integer.valueOf(codedInputStream.readInt32()));
                                }
                                codedInputStream.popLimit(pushLimit);
                            } else if (readTag == 258) {
                                if ((i & 8) != 8) {
                                    this.getHighSpeedVideoSizes = new java.util.ArrayList();
                                    i |= 8;
                                }
                                this.getHighSpeedVideoSizes.add(codedInputStream.readMessage(kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.CompilerPluginData.PARSER, extensionRegistryLite));
                            } else if (!parseUnknownField(codedInputStream, newInstance, extensionRegistryLite, readTag)) {
                            }
                        }
                        z = true;
                    } catch (java.lang.Throwable th) {
                        if ((i & 2) == 2) {
                            this.getInputFormats = java.util.Collections.unmodifiableList(this.getInputFormats);
                        }
                        if ((i & 16) == 16) {
                            this.getHighSpeedVideoFpsRangesFor = java.util.Collections.unmodifiableList(this.getHighSpeedVideoFpsRangesFor);
                        }
                        if ((i & 4) == 4) {
                            this.getOutputMinFrameDuration = java.util.Collections.unmodifiableList(this.getOutputMinFrameDuration);
                        }
                        if ((i & 8) == 8) {
                            this.getHighSpeedVideoSizes = java.util.Collections.unmodifiableList(this.getHighSpeedVideoSizes);
                        }
                        try {
                            newInstance.flush();
                        } catch (java.io.IOException unused) {
                        } catch (java.lang.Throwable th2) {
                            this.getOutputFormats = newOutput.toByteString();
                            throw th2;
                        }
                        this.getOutputFormats = newOutput.toByteString();
                        makeExtensionsImmutable();
                        throw th;
                    }
                } catch (kotlin.reflect.jvm.internal.impl.protobuf.InvalidProtocolBufferException e) {
                    throw e.setUnfinishedMessage(this);
                } catch (java.io.IOException e2) {
                    throw new kotlin.reflect.jvm.internal.impl.protobuf.InvalidProtocolBufferException(e2.getMessage()).setUnfinishedMessage(this);
                }
            }
            if ((i & 2) == 2) {
                this.getInputFormats = java.util.Collections.unmodifiableList(this.getInputFormats);
            }
            if ((i & 16) == 16) {
                this.getHighSpeedVideoFpsRangesFor = java.util.Collections.unmodifiableList(this.getHighSpeedVideoFpsRangesFor);
            }
            if ((i & 4) == 4) {
                this.getOutputMinFrameDuration = java.util.Collections.unmodifiableList(this.getOutputMinFrameDuration);
            }
            if ((i & 8) == 8) {
                this.getHighSpeedVideoSizes = java.util.Collections.unmodifiableList(this.getHighSpeedVideoSizes);
            }
            try {
                newInstance.flush();
            } catch (java.io.IOException unused2) {
            } catch (java.lang.Throwable th3) {
                this.getOutputFormats = newOutput.toByteString();
                throw th3;
            }
            this.getOutputFormats = newOutput.toByteString();
            makeExtensionsImmutable();
        }

        static {
            kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Constructor constructor = new kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Constructor();
            Camera2StreamConfigurationMap = constructor;
            constructor.getHighSpeedVideoFpsRanges();
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite, kotlin.reflect.jvm.internal.impl.protobuf.MessageLite
        public final kotlin.reflect.jvm.internal.impl.protobuf.Parser<kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Constructor> getParserForType() {
            return PARSER;
        }

        public final boolean hasFlags() {
            return (this.getHighResolutionOutputSizeshNQ4ISI & 1) == 1;
        }

        public final int getFlags() {
            return this.getHighSpeedVideoFpsRanges;
        }

        public final java.util.List<kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.ValueParameter> getValueParameterList() {
            return this.getInputFormats;
        }

        public final int getValueParameterCount() {
            return this.getInputFormats.size();
        }

        public final kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.ValueParameter getValueParameter(int i) {
            return this.getInputFormats.get(i);
        }

        public final java.util.List<java.lang.Integer> getVersionRequirementList() {
            return this.getOutputMinFrameDuration;
        }

        public final int getCompilerPluginDataCount() {
            return this.getHighSpeedVideoSizes.size();
        }

        public final kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.CompilerPluginData getCompilerPluginData(int i) {
            return this.getHighSpeedVideoSizes.get(i);
        }

        public final java.util.List<kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Annotation> getAnnotationList() {
            return this.getHighSpeedVideoFpsRangesFor;
        }

        public final int getAnnotationCount() {
            return this.getHighSpeedVideoFpsRangesFor.size();
        }

        public final kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Annotation getAnnotation(int i) {
            return this.getHighSpeedVideoFpsRangesFor.get(i);
        }

        private void getHighSpeedVideoFpsRanges() {
            this.getHighSpeedVideoFpsRanges = 6;
            this.getInputFormats = java.util.Collections.emptyList();
            this.getOutputMinFrameDuration = java.util.Collections.emptyList();
            this.getHighSpeedVideoSizes = java.util.Collections.emptyList();
            this.getHighSpeedVideoFpsRangesFor = java.util.Collections.emptyList();
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.MessageLiteOrBuilder
        public final boolean isInitialized() {
            byte b = this.getHighSpeedVideoSizesFor;
            if (b == 1) {
                return true;
            }
            if (b == 0) {
                return false;
            }
            for (int i = 0; i < getValueParameterCount(); i++) {
                if (!getValueParameter(i).isInitialized()) {
                    this.getHighSpeedVideoSizesFor = (byte) 0;
                    return false;
                }
            }
            for (int i2 = 0; i2 < getCompilerPluginDataCount(); i2++) {
                if (!getCompilerPluginData(i2).isInitialized()) {
                    this.getHighSpeedVideoSizesFor = (byte) 0;
                    return false;
                }
            }
            for (int i3 = 0; i3 < getAnnotationCount(); i3++) {
                if (!getAnnotation(i3).isInitialized()) {
                    this.getHighSpeedVideoSizesFor = (byte) 0;
                    return false;
                }
            }
            if (!extensionsAreInitialized()) {
                this.getHighSpeedVideoSizesFor = (byte) 0;
                return false;
            }
            this.getHighSpeedVideoSizesFor = (byte) 1;
            return true;
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.MessageLite
        public final void writeTo(kotlin.reflect.jvm.internal.impl.protobuf.CodedOutputStream codedOutputStream) throws java.io.IOException {
            getSerializedSize();
            kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite.ExtendableMessage<MessageType>.ExtensionWriter newExtensionWriter = newExtensionWriter();
            if ((this.getHighResolutionOutputSizeshNQ4ISI & 1) == 1) {
                codedOutputStream.writeInt32(1, this.getHighSpeedVideoFpsRanges);
            }
            for (int i = 0; i < this.getInputFormats.size(); i++) {
                codedOutputStream.writeMessage(2, this.getInputFormats.get(i));
            }
            for (int i2 = 0; i2 < this.getHighSpeedVideoFpsRangesFor.size(); i2++) {
                codedOutputStream.writeMessage(3, this.getHighSpeedVideoFpsRangesFor.get(i2));
            }
            for (int i3 = 0; i3 < this.getOutputMinFrameDuration.size(); i3++) {
                codedOutputStream.writeInt32(31, this.getOutputMinFrameDuration.get(i3).intValue());
            }
            for (int i4 = 0; i4 < this.getHighSpeedVideoSizes.size(); i4++) {
                codedOutputStream.writeMessage(32, this.getHighSpeedVideoSizes.get(i4));
            }
            newExtensionWriter.writeUntil(19000, codedOutputStream);
            codedOutputStream.writeRawBytes(this.getOutputFormats);
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.MessageLite
        public final int getSerializedSize() {
            int i = this.getInputSizeshNQ4ISI;
            if (i != -1) {
                return i;
            }
            int computeInt32Size = (this.getHighResolutionOutputSizeshNQ4ISI & 1) == 1 ? kotlin.reflect.jvm.internal.impl.protobuf.CodedOutputStream.computeInt32Size(1, this.getHighSpeedVideoFpsRanges) : 0;
            for (int i2 = 0; i2 < this.getInputFormats.size(); i2++) {
                computeInt32Size += kotlin.reflect.jvm.internal.impl.protobuf.CodedOutputStream.computeMessageSize(2, this.getInputFormats.get(i2));
            }
            for (int i3 = 0; i3 < this.getHighSpeedVideoFpsRangesFor.size(); i3++) {
                computeInt32Size += kotlin.reflect.jvm.internal.impl.protobuf.CodedOutputStream.computeMessageSize(3, this.getHighSpeedVideoFpsRangesFor.get(i3));
            }
            int i4 = 0;
            for (int i5 = 0; i5 < this.getOutputMinFrameDuration.size(); i5++) {
                i4 += kotlin.reflect.jvm.internal.impl.protobuf.CodedOutputStream.computeInt32SizeNoTag(this.getOutputMinFrameDuration.get(i5).intValue());
            }
            int size = computeInt32Size + i4 + (getVersionRequirementList().size() * 2);
            for (int i6 = 0; i6 < this.getHighSpeedVideoSizes.size(); i6++) {
                size += kotlin.reflect.jvm.internal.impl.protobuf.CodedOutputStream.computeMessageSize(32, this.getHighSpeedVideoSizes.get(i6));
            }
            int extensionsSerializedSize = size + extensionsSerializedSize() + this.getOutputFormats.size();
            this.getInputSizeshNQ4ISI = extensionsSerializedSize;
            return extensionsSerializedSize;
        }

        public static kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Constructor.Builder newBuilder() {
            return kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Constructor.Builder.Camera2StreamConfigurationMap();
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.MessageLite
        public final kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Constructor.Builder newBuilderForType() {
            return newBuilder();
        }

        public static kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Constructor.Builder newBuilder(kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Constructor constructor) {
            return newBuilder().mergeFrom(constructor);
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.MessageLite
        public final kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Constructor.Builder toBuilder() {
            return newBuilder(this);
        }

        public static final class Builder extends kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite.ExtendableBuilder<kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Constructor, kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Constructor.Builder> implements kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.ConstructorOrBuilder {
            private int getHighResolutionOutputSizeshNQ4ISI;
            private int getHighSpeedVideoSizes = 6;
            private java.util.List<kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.ValueParameter> Camera2StreamConfigurationMap = java.util.Collections.emptyList();
            private java.util.List<java.lang.Integer> getOutputFormats = java.util.Collections.emptyList();
            private java.util.List<kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.CompilerPluginData> getHighSpeedVideoFpsRangesFor = java.util.Collections.emptyList();
            private java.util.List<kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Annotation> getHighSpeedVideoFpsRanges = java.util.Collections.emptyList();

            private Builder() {
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite.Builder, kotlin.reflect.jvm.internal.impl.protobuf.MessageLiteOrBuilder
            public final kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Constructor getDefaultInstanceForType() {
                return kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Constructor.getDefaultInstance();
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.MessageLite.Builder
            public final kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Constructor build() {
                kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Constructor buildPartial = buildPartial();
                if (buildPartial.isInitialized()) {
                    return buildPartial;
                }
                throw newUninitializedMessageException(buildPartial);
            }

            public final kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Constructor buildPartial() {
                kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Constructor constructor = new kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Constructor((kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite.ExtendableBuilder) this, (byte) 0);
                byte b = (this.getHighResolutionOutputSizeshNQ4ISI & 1) == 1 ? (byte) 1 : (byte) 0;
                constructor.getHighSpeedVideoFpsRanges = this.getHighSpeedVideoSizes;
                if ((this.getHighResolutionOutputSizeshNQ4ISI & 2) == 2) {
                    this.Camera2StreamConfigurationMap = java.util.Collections.unmodifiableList(this.Camera2StreamConfigurationMap);
                    this.getHighResolutionOutputSizeshNQ4ISI &= -3;
                }
                constructor.getInputFormats = this.Camera2StreamConfigurationMap;
                if ((this.getHighResolutionOutputSizeshNQ4ISI & 4) == 4) {
                    this.getOutputFormats = java.util.Collections.unmodifiableList(this.getOutputFormats);
                    this.getHighResolutionOutputSizeshNQ4ISI &= -5;
                }
                constructor.getOutputMinFrameDuration = this.getOutputFormats;
                if ((this.getHighResolutionOutputSizeshNQ4ISI & 8) == 8) {
                    this.getHighSpeedVideoFpsRangesFor = java.util.Collections.unmodifiableList(this.getHighSpeedVideoFpsRangesFor);
                    this.getHighResolutionOutputSizeshNQ4ISI &= -9;
                }
                constructor.getHighSpeedVideoSizes = this.getHighSpeedVideoFpsRangesFor;
                if ((this.getHighResolutionOutputSizeshNQ4ISI & 16) == 16) {
                    this.getHighSpeedVideoFpsRanges = java.util.Collections.unmodifiableList(this.getHighSpeedVideoFpsRanges);
                    this.getHighResolutionOutputSizeshNQ4ISI &= -17;
                }
                constructor.getHighSpeedVideoFpsRangesFor = this.getHighSpeedVideoFpsRanges;
                constructor.getHighResolutionOutputSizeshNQ4ISI = b;
                return constructor;
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite.Builder
            public final kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Constructor.Builder mergeFrom(kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Constructor constructor) {
                if (constructor == kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Constructor.getDefaultInstance()) {
                    return this;
                }
                if (constructor.hasFlags()) {
                    setFlags(constructor.getFlags());
                }
                if (!constructor.getInputFormats.isEmpty()) {
                    if (this.Camera2StreamConfigurationMap.isEmpty()) {
                        this.Camera2StreamConfigurationMap = constructor.getInputFormats;
                        this.getHighResolutionOutputSizeshNQ4ISI &= -3;
                    } else {
                        if ((this.getHighResolutionOutputSizeshNQ4ISI & 2) != 2) {
                            this.Camera2StreamConfigurationMap = new java.util.ArrayList(this.Camera2StreamConfigurationMap);
                            this.getHighResolutionOutputSizeshNQ4ISI |= 2;
                        }
                        this.Camera2StreamConfigurationMap.addAll(constructor.getInputFormats);
                    }
                }
                if (!constructor.getOutputMinFrameDuration.isEmpty()) {
                    if (this.getOutputFormats.isEmpty()) {
                        this.getOutputFormats = constructor.getOutputMinFrameDuration;
                        this.getHighResolutionOutputSizeshNQ4ISI &= -5;
                    } else {
                        if ((this.getHighResolutionOutputSizeshNQ4ISI & 4) != 4) {
                            this.getOutputFormats = new java.util.ArrayList(this.getOutputFormats);
                            this.getHighResolutionOutputSizeshNQ4ISI |= 4;
                        }
                        this.getOutputFormats.addAll(constructor.getOutputMinFrameDuration);
                    }
                }
                if (!constructor.getHighSpeedVideoSizes.isEmpty()) {
                    if (this.getHighSpeedVideoFpsRangesFor.isEmpty()) {
                        this.getHighSpeedVideoFpsRangesFor = constructor.getHighSpeedVideoSizes;
                        this.getHighResolutionOutputSizeshNQ4ISI &= -9;
                    } else {
                        if ((this.getHighResolutionOutputSizeshNQ4ISI & 8) != 8) {
                            this.getHighSpeedVideoFpsRangesFor = new java.util.ArrayList(this.getHighSpeedVideoFpsRangesFor);
                            this.getHighResolutionOutputSizeshNQ4ISI |= 8;
                        }
                        this.getHighSpeedVideoFpsRangesFor.addAll(constructor.getHighSpeedVideoSizes);
                    }
                }
                if (!constructor.getHighSpeedVideoFpsRangesFor.isEmpty()) {
                    if (this.getHighSpeedVideoFpsRanges.isEmpty()) {
                        this.getHighSpeedVideoFpsRanges = constructor.getHighSpeedVideoFpsRangesFor;
                        this.getHighResolutionOutputSizeshNQ4ISI &= -17;
                    } else {
                        getHighSpeedVideoSizes();
                        this.getHighSpeedVideoFpsRanges.addAll(constructor.getHighSpeedVideoFpsRangesFor);
                    }
                }
                mergeExtensionFields(constructor);
                setUnknownFields(getUnknownFields().concat(constructor.getOutputFormats));
                return this;
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.MessageLiteOrBuilder
            public final boolean isInitialized() {
                for (int i = 0; i < getValueParameterCount(); i++) {
                    if (!getValueParameter(i).isInitialized()) {
                        return false;
                    }
                }
                for (int i2 = 0; i2 < getCompilerPluginDataCount(); i2++) {
                    if (!getCompilerPluginData(i2).isInitialized()) {
                        return false;
                    }
                }
                for (int i3 = 0; i3 < getAnnotationCount(); i3++) {
                    if (!getAnnotation(i3).isInitialized()) {
                        return false;
                    }
                }
                return extensionsAreInitialized();
            }

            /* JADX WARN: Removed duplicated region for block: B:15:0x001d  */
            @Override // kotlin.reflect.jvm.internal.impl.protobuf.AbstractMessageLite.Builder, kotlin.reflect.jvm.internal.impl.protobuf.MessageLite.Builder
            /*
                Code decompiled incorrectly, please refer to instructions dump.
            */
            public final kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Constructor.Builder mergeFrom(kotlin.reflect.jvm.internal.impl.protobuf.CodedInputStream codedInputStream, kotlin.reflect.jvm.internal.impl.protobuf.ExtensionRegistryLite extensionRegistryLite) throws java.io.IOException {
                kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Constructor constructor;
                try {
                    try {
                        kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Constructor parsePartialFrom = kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Constructor.PARSER.parsePartialFrom(codedInputStream, extensionRegistryLite);
                        if (parsePartialFrom != null) {
                            mergeFrom(parsePartialFrom);
                        }
                        return this;
                    } catch (kotlin.reflect.jvm.internal.impl.protobuf.InvalidProtocolBufferException e) {
                        constructor = (kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Constructor) e.getUnfinishedMessage();
                        try {
                            throw e;
                        } catch (java.lang.Throwable th) {
                            th = th;
                            if (constructor != null) {
                                mergeFrom(constructor);
                            }
                            throw th;
                        }
                    }
                } catch (java.lang.Throwable th2) {
                    th = th2;
                    constructor = null;
                    if (constructor != null) {
                    }
                    throw th;
                }
            }

            public final kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Constructor.Builder setFlags(int i) {
                this.getHighResolutionOutputSizeshNQ4ISI |= 1;
                this.getHighSpeedVideoSizes = i;
                return this;
            }

            public final int getValueParameterCount() {
                return this.Camera2StreamConfigurationMap.size();
            }

            public final kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.ValueParameter getValueParameter(int i) {
                return this.Camera2StreamConfigurationMap.get(i);
            }

            public final int getCompilerPluginDataCount() {
                return this.getHighSpeedVideoFpsRangesFor.size();
            }

            public final kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.CompilerPluginData getCompilerPluginData(int i) {
                return this.getHighSpeedVideoFpsRangesFor.get(i);
            }

            private void getHighSpeedVideoSizes() {
                if ((this.getHighResolutionOutputSizeshNQ4ISI & 16) != 16) {
                    this.getHighSpeedVideoFpsRanges = new java.util.ArrayList(this.getHighSpeedVideoFpsRanges);
                    this.getHighResolutionOutputSizeshNQ4ISI |= 16;
                }
            }

            public final int getAnnotationCount() {
                return this.getHighSpeedVideoFpsRanges.size();
            }

            public final kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Annotation getAnnotation(int i) {
                return this.getHighSpeedVideoFpsRanges.get(i);
            }

            public final kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Constructor.Builder addAllAnnotation(java.lang.Iterable<? extends kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Annotation> iterable) {
                getHighSpeedVideoSizes();
                kotlin.reflect.jvm.internal.impl.protobuf.AbstractMessageLite.Builder.addAll(iterable, this.getHighSpeedVideoFpsRanges);
                return this;
            }

            static /* synthetic */ kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Constructor.Builder Camera2StreamConfigurationMap() {
                return new kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Constructor.Builder();
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite.ExtendableBuilder, kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite.Builder, kotlin.reflect.jvm.internal.impl.protobuf.AbstractMessageLite.Builder
            /* renamed from: clone */
            public final kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Constructor.Builder mo23897clone() {
                return new kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Constructor.Builder().mergeFrom(buildPartial());
            }
        }
    }

    public static final class Function extends kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite.ExtendableMessage<kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Function> implements kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.FunctionOrBuilder {
        private static final kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Function Camera2StreamConfigurationMap;
        public static kotlin.reflect.jvm.internal.impl.protobuf.Parser<kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Function> PARSER = new kotlin.reflect.jvm.internal.impl.protobuf.AbstractParser<kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Function>() { // from class: kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Function.1
            @Override // kotlin.reflect.jvm.internal.impl.protobuf.Parser
            public final /* synthetic */ java.lang.Object parsePartialFrom(kotlin.reflect.jvm.internal.impl.protobuf.CodedInputStream codedInputStream, kotlin.reflect.jvm.internal.impl.protobuf.ExtensionRegistryLite extensionRegistryLite) throws kotlin.reflect.jvm.internal.impl.protobuf.InvalidProtocolBufferException {
                return new kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Function(codedInputStream, extensionRegistryLite, (byte) 0);
            }
        };
        private final kotlin.reflect.jvm.internal.impl.protobuf.ByteString ArtificialStackFrames;
        private java.util.List<java.lang.Integer> accessartificialFrame;
        private kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.TypeTable coroutineBoundary;
        private java.util.List<kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.ValueParameter> coroutineCreation;
        private java.util.List<kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.ValueParameter> getHighResolutionOutputSizeshNQ4ISI;
        private int getHighSpeedVideoFpsRanges;
        private java.util.List<kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Annotation> getHighSpeedVideoFpsRangesFor;
        private java.util.List<kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.CompilerPluginData> getHighSpeedVideoSizes;
        private java.util.List<java.lang.Integer> getHighSpeedVideoSizesFor;
        private java.util.List<kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Type> getInputFormats;
        private kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Contract getInputSizeshNQ4ISI;
        private int getOutputFormats;
        private java.util.List<kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Annotation> getOutputMinFrameDuration;
        private int getOutputMinFrameDurationlomOqCM;
        private byte getOutputSizes;
        private int getOutputSizeshNQ4ISI;
        private int getOutputStallDuration;
        private int getOutputStallDurationlomOqCM;
        private kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Type getValidOutputFormatsForInputhNQ4ISI;
        private kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Type isOutputSupportedFor;
        private int isOutputSupportedForhNQ4ISI;
        private int toString;
        private java.util.List<kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.TypeParameter> unwrapAs;

        /* synthetic */ Function(kotlin.reflect.jvm.internal.impl.protobuf.CodedInputStream codedInputStream, kotlin.reflect.jvm.internal.impl.protobuf.ExtensionRegistryLite extensionRegistryLite, byte b) throws kotlin.reflect.jvm.internal.impl.protobuf.InvalidProtocolBufferException {
            this(codedInputStream, extensionRegistryLite);
        }

        /* synthetic */ Function(kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite.ExtendableBuilder extendableBuilder, byte b) {
            this(extendableBuilder);
        }

        private Function(kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite.ExtendableBuilder<kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Function, ?> extendableBuilder) {
            super(extendableBuilder);
            this.getOutputFormats = -1;
            this.getOutputSizes = (byte) -1;
            this.getOutputMinFrameDurationlomOqCM = -1;
            this.ArtificialStackFrames = extendableBuilder.getUnknownFields();
        }

        private Function() {
            this.getOutputFormats = -1;
            this.getOutputSizes = (byte) -1;
            this.getOutputMinFrameDurationlomOqCM = -1;
            this.ArtificialStackFrames = kotlin.reflect.jvm.internal.impl.protobuf.ByteString.EMPTY;
        }

        public static kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Function getDefaultInstance() {
            return Camera2StreamConfigurationMap;
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.MessageLiteOrBuilder
        public final kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Function getDefaultInstanceForType() {
            return Camera2StreamConfigurationMap;
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r7v11 */
        /* JADX WARN: Type inference failed for: r7v13 */
        /* JADX WARN: Type inference failed for: r7v15 */
        /* JADX WARN: Type inference failed for: r7v17 */
        /* JADX WARN: Type inference failed for: r7v19 */
        /* JADX WARN: Type inference failed for: r7v21 */
        /* JADX WARN: Type inference failed for: r7v24 */
        /* JADX WARN: Type inference failed for: r7v3 */
        /* JADX WARN: Type inference failed for: r7v5 */
        /* JADX WARN: Type inference failed for: r7v7 */
        /* JADX WARN: Type inference failed for: r7v9 */
        private Function(kotlin.reflect.jvm.internal.impl.protobuf.CodedInputStream codedInputStream, kotlin.reflect.jvm.internal.impl.protobuf.ExtensionRegistryLite extensionRegistryLite) throws kotlin.reflect.jvm.internal.impl.protobuf.InvalidProtocolBufferException {
            this.getOutputFormats = -1;
            this.getOutputSizes = (byte) -1;
            this.getOutputMinFrameDurationlomOqCM = -1;
            getHighSpeedVideoFpsRangesFor();
            kotlin.reflect.jvm.internal.impl.protobuf.ByteString.Output newOutput = kotlin.reflect.jvm.internal.impl.protobuf.ByteString.newOutput();
            kotlin.reflect.jvm.internal.impl.protobuf.CodedOutputStream newInstance = kotlin.reflect.jvm.internal.impl.protobuf.CodedOutputStream.newInstance(newOutput, 1);
            boolean z = false;
            char c = 0;
            while (!z) {
                try {
                    try {
                        int readTag = codedInputStream.readTag();
                        switch (readTag) {
                            case 0:
                                z = true;
                            case 8:
                                this.getHighSpeedVideoFpsRanges |= 2;
                                this.getOutputStallDuration = codedInputStream.readInt32();
                            case 16:
                                this.getHighSpeedVideoFpsRanges |= 4;
                                this.getOutputStallDurationlomOqCM = codedInputStream.readInt32();
                            case 26:
                                kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Type.Builder builder = (this.getHighSpeedVideoFpsRanges & 8) == 8 ? this.isOutputSupportedFor.toBuilder() : null;
                                kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Type type = (kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Type) codedInputStream.readMessage(kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Type.PARSER, extensionRegistryLite);
                                this.isOutputSupportedFor = type;
                                if (builder != null) {
                                    builder.mergeFrom(type);
                                    this.isOutputSupportedFor = builder.buildPartial();
                                }
                                this.getHighSpeedVideoFpsRanges |= 8;
                            case 34:
                                int i = (c == true ? 1 : 0) & 32;
                                c = c;
                                if (i != 32) {
                                    this.unwrapAs = new java.util.ArrayList();
                                    c = (c == true ? 1 : 0) | ' ';
                                }
                                this.unwrapAs.add(codedInputStream.readMessage(kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.TypeParameter.PARSER, extensionRegistryLite));
                            case 42:
                                kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Type.Builder builder2 = (this.getHighSpeedVideoFpsRanges & 32) == 32 ? this.getValidOutputFormatsForInputhNQ4ISI.toBuilder() : null;
                                kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Type type2 = (kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Type) codedInputStream.readMessage(kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Type.PARSER, extensionRegistryLite);
                                this.getValidOutputFormatsForInputhNQ4ISI = type2;
                                if (builder2 != null) {
                                    builder2.mergeFrom(type2);
                                    this.getValidOutputFormatsForInputhNQ4ISI = builder2.buildPartial();
                                }
                                this.getHighSpeedVideoFpsRanges |= 32;
                            case 50:
                                int i2 = (c == true ? 1 : 0) & 2048;
                                c = c;
                                if (i2 != 2048) {
                                    this.coroutineCreation = new java.util.ArrayList();
                                    c = (c == true ? 1 : 0) | 2048;
                                }
                                this.coroutineCreation.add(codedInputStream.readMessage(kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.ValueParameter.PARSER, extensionRegistryLite));
                            case 56:
                                this.getHighSpeedVideoFpsRanges |= 16;
                                this.isOutputSupportedForhNQ4ISI = codedInputStream.readInt32();
                            case 64:
                                this.getHighSpeedVideoFpsRanges |= 64;
                                this.toString = codedInputStream.readInt32();
                            case 72:
                                this.getHighSpeedVideoFpsRanges |= 1;
                                this.getOutputSizeshNQ4ISI = codedInputStream.readInt32();
                            case 82:
                                int i3 = (c == true ? 1 : 0) & 256;
                                c = c;
                                if (i3 != 256) {
                                    this.getInputFormats = new java.util.ArrayList();
                                    c = (c == true ? 1 : 0) | 256;
                                }
                                this.getInputFormats.add(codedInputStream.readMessage(kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Type.PARSER, extensionRegistryLite));
                            case 88:
                                int i4 = (c == true ? 1 : 0) & 512;
                                c = c;
                                if (i4 != 512) {
                                    this.getHighSpeedVideoSizesFor = new java.util.ArrayList();
                                    c = (c == true ? 1 : 0) | 512;
                                }
                                this.getHighSpeedVideoSizesFor.add(java.lang.Integer.valueOf(codedInputStream.readInt32()));
                            case 90:
                                int pushLimit = codedInputStream.pushLimit(codedInputStream.readRawVarint32());
                                int i5 = (c == true ? 1 : 0) & 512;
                                c = c;
                                if (i5 != 512) {
                                    c = c;
                                    if (codedInputStream.getBytesUntilLimit() > 0) {
                                        this.getHighSpeedVideoSizesFor = new java.util.ArrayList();
                                        c = (c == true ? 1 : 0) | 512;
                                    }
                                }
                                while (codedInputStream.getBytesUntilLimit() > 0) {
                                    this.getHighSpeedVideoSizesFor.add(java.lang.Integer.valueOf(codedInputStream.readInt32()));
                                }
                                codedInputStream.popLimit(pushLimit);
                            case 98:
                                int i6 = (c == true ? 1 : 0) & 65536;
                                c = c;
                                if (i6 != 65536) {
                                    this.getHighSpeedVideoFpsRangesFor = new java.util.ArrayList();
                                    c = (c == true ? 1 : 0) | 0;
                                }
                                this.getHighSpeedVideoFpsRangesFor.add(codedInputStream.readMessage(kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Annotation.PARSER, extensionRegistryLite));
                            case 106:
                                int i7 = (c == true ? 1 : 0) & 1024;
                                c = c;
                                if (i7 != 1024) {
                                    this.getHighResolutionOutputSizeshNQ4ISI = new java.util.ArrayList();
                                    c = (c == true ? 1 : 0) | 1024;
                                }
                                this.getHighResolutionOutputSizeshNQ4ISI.add(codedInputStream.readMessage(kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.ValueParameter.PARSER, extensionRegistryLite));
                            case SDK_ASSET_ILLUSTRATION_PLAID_OVERLAY_ACCOUNT_NUMBER_CONFIRMED_VALUE:
                                kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.TypeTable.Builder builder3 = (this.getHighSpeedVideoFpsRanges & 128) == 128 ? this.coroutineBoundary.toBuilder() : null;
                                kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.TypeTable typeTable = (kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.TypeTable) codedInputStream.readMessage(kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.TypeTable.PARSER, extensionRegistryLite);
                                this.coroutineBoundary = typeTable;
                                if (builder3 != null) {
                                    builder3.mergeFrom(typeTable);
                                    this.coroutineBoundary = builder3.buildPartial();
                                }
                                this.getHighSpeedVideoFpsRanges |= 128;
                            case SDK_ASSET_ILLUSTRATION_PLAID_OVERLAY_INSTITUTION_TRANSFER_VALUE:
                                int i8 = (c == true ? 1 : 0) & 8192;
                                c = c;
                                if (i8 != 8192) {
                                    this.accessartificialFrame = new java.util.ArrayList();
                                    c = (c == true ? 1 : 0) | 8192;
                                }
                                this.accessartificialFrame.add(java.lang.Integer.valueOf(codedInputStream.readInt32()));
                            case 250:
                                int pushLimit2 = codedInputStream.pushLimit(codedInputStream.readRawVarint32());
                                int i9 = (c == true ? 1 : 0) & 8192;
                                c = c;
                                if (i9 != 8192) {
                                    c = c;
                                    if (codedInputStream.getBytesUntilLimit() > 0) {
                                        this.accessartificialFrame = new java.util.ArrayList();
                                        c = (c == true ? 1 : 0) | 8192;
                                    }
                                }
                                while (codedInputStream.getBytesUntilLimit() > 0) {
                                    this.accessartificialFrame.add(java.lang.Integer.valueOf(codedInputStream.readInt32()));
                                }
                                codedInputStream.popLimit(pushLimit2);
                            case 258:
                                kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Contract.Builder builder4 = (this.getHighSpeedVideoFpsRanges & 256) == 256 ? this.getInputSizeshNQ4ISI.toBuilder() : null;
                                kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Contract contract = (kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Contract) codedInputStream.readMessage(kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Contract.PARSER, extensionRegistryLite);
                                this.getInputSizeshNQ4ISI = contract;
                                if (builder4 != null) {
                                    builder4.mergeFrom(contract);
                                    this.getInputSizeshNQ4ISI = builder4.buildPartial();
                                }
                                this.getHighSpeedVideoFpsRanges |= 256;
                            case SDK_ASSET_ILLUSTRATION_CRA_OVERLAY_ACCOUNT_VALUE:
                                int i10 = (c == true ? 1 : 0) & 32768;
                                c = c;
                                if (i10 != 32768) {
                                    this.getHighSpeedVideoSizes = new java.util.ArrayList();
                                    c = (c == true ? 1 : 0) | 32768;
                                }
                                this.getHighSpeedVideoSizes.add(codedInputStream.readMessage(kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.CompilerPluginData.PARSER, extensionRegistryLite));
                            case SDK_ASSET_ILLUSTRATION_SUCCESS_BRUSHSTROKE_VALUE:
                                int i11 = (c == true ? 1 : 0) & 131072;
                                c = c;
                                if (i11 != 131072) {
                                    this.getOutputMinFrameDuration = new java.util.ArrayList();
                                    c = (c == true ? 1 : 0) | 0;
                                }
                                this.getOutputMinFrameDuration.add(codedInputStream.readMessage(kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Annotation.PARSER, extensionRegistryLite));
                            default:
                                if (!parseUnknownField(codedInputStream, newInstance, extensionRegistryLite, readTag)) {
                                    z = true;
                                }
                        }
                    } catch (java.lang.Throwable th) {
                        if (((c == true ? 1 : 0) & 32) == 32) {
                            this.unwrapAs = java.util.Collections.unmodifiableList(this.unwrapAs);
                        }
                        if (((c == true ? 1 : 0) & 2048) == 2048) {
                            this.coroutineCreation = java.util.Collections.unmodifiableList(this.coroutineCreation);
                        }
                        if (((c == true ? 1 : 0) & 256) == 256) {
                            this.getInputFormats = java.util.Collections.unmodifiableList(this.getInputFormats);
                        }
                        if (((c == true ? 1 : 0) & 512) == 512) {
                            this.getHighSpeedVideoSizesFor = java.util.Collections.unmodifiableList(this.getHighSpeedVideoSizesFor);
                        }
                        if (((c == true ? 1 : 0) & 65536) == 65536) {
                            this.getHighSpeedVideoFpsRangesFor = java.util.Collections.unmodifiableList(this.getHighSpeedVideoFpsRangesFor);
                        }
                        if (((c == true ? 1 : 0) & 1024) == 1024) {
                            this.getHighResolutionOutputSizeshNQ4ISI = java.util.Collections.unmodifiableList(this.getHighResolutionOutputSizeshNQ4ISI);
                        }
                        if (((c == true ? 1 : 0) & 8192) == 8192) {
                            this.accessartificialFrame = java.util.Collections.unmodifiableList(this.accessartificialFrame);
                        }
                        if (((c == true ? 1 : 0) & 32768) == 32768) {
                            this.getHighSpeedVideoSizes = java.util.Collections.unmodifiableList(this.getHighSpeedVideoSizes);
                        }
                        if (((c == true ? 1 : 0) & 131072) == 131072) {
                            this.getOutputMinFrameDuration = java.util.Collections.unmodifiableList(this.getOutputMinFrameDuration);
                        }
                        try {
                            newInstance.flush();
                        } catch (java.io.IOException unused) {
                        } catch (java.lang.Throwable th2) {
                            this.ArtificialStackFrames = newOutput.toByteString();
                            throw th2;
                        }
                        this.ArtificialStackFrames = newOutput.toByteString();
                        makeExtensionsImmutable();
                        throw th;
                    }
                } catch (kotlin.reflect.jvm.internal.impl.protobuf.InvalidProtocolBufferException e) {
                    throw e.setUnfinishedMessage(this);
                } catch (java.io.IOException e2) {
                    throw new kotlin.reflect.jvm.internal.impl.protobuf.InvalidProtocolBufferException(e2.getMessage()).setUnfinishedMessage(this);
                }
            }
            if (((c == true ? 1 : 0) & 32) == 32) {
                this.unwrapAs = java.util.Collections.unmodifiableList(this.unwrapAs);
            }
            if (((c == true ? 1 : 0) & 2048) == 2048) {
                this.coroutineCreation = java.util.Collections.unmodifiableList(this.coroutineCreation);
            }
            if (((c == true ? 1 : 0) & 256) == 256) {
                this.getInputFormats = java.util.Collections.unmodifiableList(this.getInputFormats);
            }
            if (((c == true ? 1 : 0) & 512) == 512) {
                this.getHighSpeedVideoSizesFor = java.util.Collections.unmodifiableList(this.getHighSpeedVideoSizesFor);
            }
            if (((c == true ? 1 : 0) & 65536) == 65536) {
                this.getHighSpeedVideoFpsRangesFor = java.util.Collections.unmodifiableList(this.getHighSpeedVideoFpsRangesFor);
            }
            if (((c == true ? 1 : 0) & 1024) == 1024) {
                this.getHighResolutionOutputSizeshNQ4ISI = java.util.Collections.unmodifiableList(this.getHighResolutionOutputSizeshNQ4ISI);
            }
            if (((c == true ? 1 : 0) & 8192) == 8192) {
                this.accessartificialFrame = java.util.Collections.unmodifiableList(this.accessartificialFrame);
            }
            if (((c == true ? 1 : 0) & 32768) == 32768) {
                this.getHighSpeedVideoSizes = java.util.Collections.unmodifiableList(this.getHighSpeedVideoSizes);
            }
            if (((c == true ? 1 : 0) & 131072) == 131072) {
                this.getOutputMinFrameDuration = java.util.Collections.unmodifiableList(this.getOutputMinFrameDuration);
            }
            try {
                newInstance.flush();
            } catch (java.io.IOException unused2) {
            } catch (java.lang.Throwable th3) {
                this.ArtificialStackFrames = newOutput.toByteString();
                throw th3;
            }
            this.ArtificialStackFrames = newOutput.toByteString();
            makeExtensionsImmutable();
        }

        static {
            kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Function function = new kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Function();
            Camera2StreamConfigurationMap = function;
            function.getHighSpeedVideoFpsRangesFor();
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite, kotlin.reflect.jvm.internal.impl.protobuf.MessageLite
        public final kotlin.reflect.jvm.internal.impl.protobuf.Parser<kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Function> getParserForType() {
            return PARSER;
        }

        public final boolean hasFlags() {
            return (this.getHighSpeedVideoFpsRanges & 1) == 1;
        }

        public final int getFlags() {
            return this.getOutputSizeshNQ4ISI;
        }

        public final boolean hasOldFlags() {
            return (this.getHighSpeedVideoFpsRanges & 2) == 2;
        }

        public final int getOldFlags() {
            return this.getOutputStallDuration;
        }

        public final boolean hasName() {
            return (this.getHighSpeedVideoFpsRanges & 4) == 4;
        }

        public final int getName() {
            return this.getOutputStallDurationlomOqCM;
        }

        public final boolean hasReturnType() {
            return (this.getHighSpeedVideoFpsRanges & 8) == 8;
        }

        public final kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Type getReturnType() {
            return this.isOutputSupportedFor;
        }

        public final boolean hasReturnTypeId() {
            return (this.getHighSpeedVideoFpsRanges & 16) == 16;
        }

        public final int getReturnTypeId() {
            return this.isOutputSupportedForhNQ4ISI;
        }

        public final java.util.List<kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.TypeParameter> getTypeParameterList() {
            return this.unwrapAs;
        }

        public final int getTypeParameterCount() {
            return this.unwrapAs.size();
        }

        public final kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.TypeParameter getTypeParameter(int i) {
            return this.unwrapAs.get(i);
        }

        public final boolean hasReceiverType() {
            return (this.getHighSpeedVideoFpsRanges & 32) == 32;
        }

        public final kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Type getReceiverType() {
            return this.getValidOutputFormatsForInputhNQ4ISI;
        }

        public final boolean hasReceiverTypeId() {
            return (this.getHighSpeedVideoFpsRanges & 64) == 64;
        }

        public final int getReceiverTypeId() {
            return this.toString;
        }

        public final java.util.List<kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Type> getContextReceiverTypeList() {
            return this.getInputFormats;
        }

        public final int getContextReceiverTypeCount() {
            return this.getInputFormats.size();
        }

        public final kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Type getContextReceiverType(int i) {
            return this.getInputFormats.get(i);
        }

        public final java.util.List<java.lang.Integer> getContextReceiverTypeIdList() {
            return this.getHighSpeedVideoSizesFor;
        }

        public final java.util.List<kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.ValueParameter> getContextParameterList() {
            return this.getHighResolutionOutputSizeshNQ4ISI;
        }

        public final int getContextParameterCount() {
            return this.getHighResolutionOutputSizeshNQ4ISI.size();
        }

        public final kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.ValueParameter getContextParameter(int i) {
            return this.getHighResolutionOutputSizeshNQ4ISI.get(i);
        }

        public final java.util.List<kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.ValueParameter> getValueParameterList() {
            return this.coroutineCreation;
        }

        public final int getValueParameterCount() {
            return this.coroutineCreation.size();
        }

        public final kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.ValueParameter getValueParameter(int i) {
            return this.coroutineCreation.get(i);
        }

        public final boolean hasTypeTable() {
            return (this.getHighSpeedVideoFpsRanges & 128) == 128;
        }

        public final kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.TypeTable getTypeTable() {
            return this.coroutineBoundary;
        }

        public final java.util.List<java.lang.Integer> getVersionRequirementList() {
            return this.accessartificialFrame;
        }

        public final boolean hasContract() {
            return (this.getHighSpeedVideoFpsRanges & 256) == 256;
        }

        public final kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Contract getContract() {
            return this.getInputSizeshNQ4ISI;
        }

        public final int getCompilerPluginDataCount() {
            return this.getHighSpeedVideoSizes.size();
        }

        public final kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.CompilerPluginData getCompilerPluginData(int i) {
            return this.getHighSpeedVideoSizes.get(i);
        }

        public final java.util.List<kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Annotation> getAnnotationList() {
            return this.getHighSpeedVideoFpsRangesFor;
        }

        public final int getAnnotationCount() {
            return this.getHighSpeedVideoFpsRangesFor.size();
        }

        public final kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Annotation getAnnotation(int i) {
            return this.getHighSpeedVideoFpsRangesFor.get(i);
        }

        public final java.util.List<kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Annotation> getExtensionReceiverAnnotationList() {
            return this.getOutputMinFrameDuration;
        }

        public final int getExtensionReceiverAnnotationCount() {
            return this.getOutputMinFrameDuration.size();
        }

        public final kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Annotation getExtensionReceiverAnnotation(int i) {
            return this.getOutputMinFrameDuration.get(i);
        }

        private void getHighSpeedVideoFpsRangesFor() {
            this.getOutputSizeshNQ4ISI = 6;
            this.getOutputStallDuration = 6;
            this.getOutputStallDurationlomOqCM = 0;
            this.isOutputSupportedFor = kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Type.getDefaultInstance();
            this.isOutputSupportedForhNQ4ISI = 0;
            this.unwrapAs = java.util.Collections.emptyList();
            this.getValidOutputFormatsForInputhNQ4ISI = kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Type.getDefaultInstance();
            this.toString = 0;
            this.getInputFormats = java.util.Collections.emptyList();
            this.getHighSpeedVideoSizesFor = java.util.Collections.emptyList();
            this.getHighResolutionOutputSizeshNQ4ISI = java.util.Collections.emptyList();
            this.coroutineCreation = java.util.Collections.emptyList();
            this.coroutineBoundary = kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.TypeTable.getDefaultInstance();
            this.accessartificialFrame = java.util.Collections.emptyList();
            this.getInputSizeshNQ4ISI = kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Contract.getDefaultInstance();
            this.getHighSpeedVideoSizes = java.util.Collections.emptyList();
            this.getHighSpeedVideoFpsRangesFor = java.util.Collections.emptyList();
            this.getOutputMinFrameDuration = java.util.Collections.emptyList();
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.MessageLiteOrBuilder
        public final boolean isInitialized() {
            byte b = this.getOutputSizes;
            if (b == 1) {
                return true;
            }
            if (b == 0) {
                return false;
            }
            if (!hasName()) {
                this.getOutputSizes = (byte) 0;
                return false;
            }
            if (hasReturnType() && !getReturnType().isInitialized()) {
                this.getOutputSizes = (byte) 0;
                return false;
            }
            for (int i = 0; i < getTypeParameterCount(); i++) {
                if (!getTypeParameter(i).isInitialized()) {
                    this.getOutputSizes = (byte) 0;
                    return false;
                }
            }
            if (hasReceiverType() && !getReceiverType().isInitialized()) {
                this.getOutputSizes = (byte) 0;
                return false;
            }
            for (int i2 = 0; i2 < getContextReceiverTypeCount(); i2++) {
                if (!getContextReceiverType(i2).isInitialized()) {
                    this.getOutputSizes = (byte) 0;
                    return false;
                }
            }
            for (int i3 = 0; i3 < getContextParameterCount(); i3++) {
                if (!getContextParameter(i3).isInitialized()) {
                    this.getOutputSizes = (byte) 0;
                    return false;
                }
            }
            for (int i4 = 0; i4 < getValueParameterCount(); i4++) {
                if (!getValueParameter(i4).isInitialized()) {
                    this.getOutputSizes = (byte) 0;
                    return false;
                }
            }
            if (hasTypeTable() && !getTypeTable().isInitialized()) {
                this.getOutputSizes = (byte) 0;
                return false;
            }
            if (hasContract() && !getContract().isInitialized()) {
                this.getOutputSizes = (byte) 0;
                return false;
            }
            for (int i5 = 0; i5 < getCompilerPluginDataCount(); i5++) {
                if (!getCompilerPluginData(i5).isInitialized()) {
                    this.getOutputSizes = (byte) 0;
                    return false;
                }
            }
            for (int i6 = 0; i6 < getAnnotationCount(); i6++) {
                if (!getAnnotation(i6).isInitialized()) {
                    this.getOutputSizes = (byte) 0;
                    return false;
                }
            }
            for (int i7 = 0; i7 < getExtensionReceiverAnnotationCount(); i7++) {
                if (!getExtensionReceiverAnnotation(i7).isInitialized()) {
                    this.getOutputSizes = (byte) 0;
                    return false;
                }
            }
            if (!extensionsAreInitialized()) {
                this.getOutputSizes = (byte) 0;
                return false;
            }
            this.getOutputSizes = (byte) 1;
            return true;
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.MessageLite
        public final void writeTo(kotlin.reflect.jvm.internal.impl.protobuf.CodedOutputStream codedOutputStream) throws java.io.IOException {
            getSerializedSize();
            kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite.ExtendableMessage<MessageType>.ExtensionWriter newExtensionWriter = newExtensionWriter();
            if ((this.getHighSpeedVideoFpsRanges & 2) == 2) {
                codedOutputStream.writeInt32(1, this.getOutputStallDuration);
            }
            if ((this.getHighSpeedVideoFpsRanges & 4) == 4) {
                codedOutputStream.writeInt32(2, this.getOutputStallDurationlomOqCM);
            }
            if ((this.getHighSpeedVideoFpsRanges & 8) == 8) {
                codedOutputStream.writeMessage(3, this.isOutputSupportedFor);
            }
            for (int i = 0; i < this.unwrapAs.size(); i++) {
                codedOutputStream.writeMessage(4, this.unwrapAs.get(i));
            }
            if ((this.getHighSpeedVideoFpsRanges & 32) == 32) {
                codedOutputStream.writeMessage(5, this.getValidOutputFormatsForInputhNQ4ISI);
            }
            for (int i2 = 0; i2 < this.coroutineCreation.size(); i2++) {
                codedOutputStream.writeMessage(6, this.coroutineCreation.get(i2));
            }
            if ((this.getHighSpeedVideoFpsRanges & 16) == 16) {
                codedOutputStream.writeInt32(7, this.isOutputSupportedForhNQ4ISI);
            }
            if ((this.getHighSpeedVideoFpsRanges & 64) == 64) {
                codedOutputStream.writeInt32(8, this.toString);
            }
            if ((this.getHighSpeedVideoFpsRanges & 1) == 1) {
                codedOutputStream.writeInt32(9, this.getOutputSizeshNQ4ISI);
            }
            for (int i3 = 0; i3 < this.getInputFormats.size(); i3++) {
                codedOutputStream.writeMessage(10, this.getInputFormats.get(i3));
            }
            if (getContextReceiverTypeIdList().size() > 0) {
                codedOutputStream.writeRawVarint32(90);
                codedOutputStream.writeRawVarint32(this.getOutputFormats);
            }
            for (int i4 = 0; i4 < this.getHighSpeedVideoSizesFor.size(); i4++) {
                codedOutputStream.writeInt32NoTag(this.getHighSpeedVideoSizesFor.get(i4).intValue());
            }
            for (int i5 = 0; i5 < this.getHighSpeedVideoFpsRangesFor.size(); i5++) {
                codedOutputStream.writeMessage(12, this.getHighSpeedVideoFpsRangesFor.get(i5));
            }
            for (int i6 = 0; i6 < this.getHighResolutionOutputSizeshNQ4ISI.size(); i6++) {
                codedOutputStream.writeMessage(13, this.getHighResolutionOutputSizeshNQ4ISI.get(i6));
            }
            if ((this.getHighSpeedVideoFpsRanges & 128) == 128) {
                codedOutputStream.writeMessage(30, this.coroutineBoundary);
            }
            for (int i7 = 0; i7 < this.accessartificialFrame.size(); i7++) {
                codedOutputStream.writeInt32(31, this.accessartificialFrame.get(i7).intValue());
            }
            if ((this.getHighSpeedVideoFpsRanges & 256) == 256) {
                codedOutputStream.writeMessage(32, this.getInputSizeshNQ4ISI);
            }
            for (int i8 = 0; i8 < this.getHighSpeedVideoSizes.size(); i8++) {
                codedOutputStream.writeMessage(33, this.getHighSpeedVideoSizes.get(i8));
            }
            for (int i9 = 0; i9 < this.getOutputMinFrameDuration.size(); i9++) {
                codedOutputStream.writeMessage(34, this.getOutputMinFrameDuration.get(i9));
            }
            newExtensionWriter.writeUntil(19000, codedOutputStream);
            codedOutputStream.writeRawBytes(this.ArtificialStackFrames);
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.MessageLite
        public final int getSerializedSize() {
            int i = this.getOutputMinFrameDurationlomOqCM;
            if (i != -1) {
                return i;
            }
            int computeInt32Size = (this.getHighSpeedVideoFpsRanges & 2) == 2 ? kotlin.reflect.jvm.internal.impl.protobuf.CodedOutputStream.computeInt32Size(1, this.getOutputStallDuration) : 0;
            if ((this.getHighSpeedVideoFpsRanges & 4) == 4) {
                computeInt32Size += kotlin.reflect.jvm.internal.impl.protobuf.CodedOutputStream.computeInt32Size(2, this.getOutputStallDurationlomOqCM);
            }
            if ((this.getHighSpeedVideoFpsRanges & 8) == 8) {
                computeInt32Size += kotlin.reflect.jvm.internal.impl.protobuf.CodedOutputStream.computeMessageSize(3, this.isOutputSupportedFor);
            }
            for (int i2 = 0; i2 < this.unwrapAs.size(); i2++) {
                computeInt32Size += kotlin.reflect.jvm.internal.impl.protobuf.CodedOutputStream.computeMessageSize(4, this.unwrapAs.get(i2));
            }
            if ((this.getHighSpeedVideoFpsRanges & 32) == 32) {
                computeInt32Size += kotlin.reflect.jvm.internal.impl.protobuf.CodedOutputStream.computeMessageSize(5, this.getValidOutputFormatsForInputhNQ4ISI);
            }
            for (int i3 = 0; i3 < this.coroutineCreation.size(); i3++) {
                computeInt32Size += kotlin.reflect.jvm.internal.impl.protobuf.CodedOutputStream.computeMessageSize(6, this.coroutineCreation.get(i3));
            }
            if ((this.getHighSpeedVideoFpsRanges & 16) == 16) {
                computeInt32Size += kotlin.reflect.jvm.internal.impl.protobuf.CodedOutputStream.computeInt32Size(7, this.isOutputSupportedForhNQ4ISI);
            }
            if ((this.getHighSpeedVideoFpsRanges & 64) == 64) {
                computeInt32Size += kotlin.reflect.jvm.internal.impl.protobuf.CodedOutputStream.computeInt32Size(8, this.toString);
            }
            if ((this.getHighSpeedVideoFpsRanges & 1) == 1) {
                computeInt32Size += kotlin.reflect.jvm.internal.impl.protobuf.CodedOutputStream.computeInt32Size(9, this.getOutputSizeshNQ4ISI);
            }
            for (int i4 = 0; i4 < this.getInputFormats.size(); i4++) {
                computeInt32Size += kotlin.reflect.jvm.internal.impl.protobuf.CodedOutputStream.computeMessageSize(10, this.getInputFormats.get(i4));
            }
            int i5 = 0;
            for (int i6 = 0; i6 < this.getHighSpeedVideoSizesFor.size(); i6++) {
                i5 += kotlin.reflect.jvm.internal.impl.protobuf.CodedOutputStream.computeInt32SizeNoTag(this.getHighSpeedVideoSizesFor.get(i6).intValue());
            }
            int i7 = computeInt32Size + i5;
            if (!getContextReceiverTypeIdList().isEmpty()) {
                i7 = i7 + 1 + kotlin.reflect.jvm.internal.impl.protobuf.CodedOutputStream.computeInt32SizeNoTag(i5);
            }
            this.getOutputFormats = i5;
            for (int i8 = 0; i8 < this.getHighSpeedVideoFpsRangesFor.size(); i8++) {
                i7 += kotlin.reflect.jvm.internal.impl.protobuf.CodedOutputStream.computeMessageSize(12, this.getHighSpeedVideoFpsRangesFor.get(i8));
            }
            for (int i9 = 0; i9 < this.getHighResolutionOutputSizeshNQ4ISI.size(); i9++) {
                i7 += kotlin.reflect.jvm.internal.impl.protobuf.CodedOutputStream.computeMessageSize(13, this.getHighResolutionOutputSizeshNQ4ISI.get(i9));
            }
            if ((this.getHighSpeedVideoFpsRanges & 128) == 128) {
                i7 += kotlin.reflect.jvm.internal.impl.protobuf.CodedOutputStream.computeMessageSize(30, this.coroutineBoundary);
            }
            int i10 = 0;
            for (int i11 = 0; i11 < this.accessartificialFrame.size(); i11++) {
                i10 += kotlin.reflect.jvm.internal.impl.protobuf.CodedOutputStream.computeInt32SizeNoTag(this.accessartificialFrame.get(i11).intValue());
            }
            int size = i7 + i10 + (getVersionRequirementList().size() * 2);
            if ((this.getHighSpeedVideoFpsRanges & 256) == 256) {
                size += kotlin.reflect.jvm.internal.impl.protobuf.CodedOutputStream.computeMessageSize(32, this.getInputSizeshNQ4ISI);
            }
            for (int i12 = 0; i12 < this.getHighSpeedVideoSizes.size(); i12++) {
                size += kotlin.reflect.jvm.internal.impl.protobuf.CodedOutputStream.computeMessageSize(33, this.getHighSpeedVideoSizes.get(i12));
            }
            for (int i13 = 0; i13 < this.getOutputMinFrameDuration.size(); i13++) {
                size += kotlin.reflect.jvm.internal.impl.protobuf.CodedOutputStream.computeMessageSize(34, this.getOutputMinFrameDuration.get(i13));
            }
            int extensionsSerializedSize = size + extensionsSerializedSize() + this.ArtificialStackFrames.size();
            this.getOutputMinFrameDurationlomOqCM = extensionsSerializedSize;
            return extensionsSerializedSize;
        }

        public static kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Function parseFrom(java.io.InputStream inputStream, kotlin.reflect.jvm.internal.impl.protobuf.ExtensionRegistryLite extensionRegistryLite) throws java.io.IOException {
            return PARSER.parseFrom(inputStream, extensionRegistryLite);
        }

        public static kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Function.Builder newBuilder() {
            return kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Function.Builder.getHighResolutionOutputSizeshNQ4ISI();
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.MessageLite
        public final kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Function.Builder newBuilderForType() {
            return newBuilder();
        }

        public static kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Function.Builder newBuilder(kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Function function) {
            return newBuilder().mergeFrom(function);
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.MessageLite
        public final kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Function.Builder toBuilder() {
            return newBuilder(this);
        }

        public static final class Builder extends kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite.ExtendableBuilder<kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Function, kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Function.Builder> implements kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.FunctionOrBuilder {
            private int getHighSpeedVideoSizes;
            private int getInputSizeshNQ4ISI;
            private int getOutputMinFrameDurationlomOqCM;
            private int getOutputStallDurationlomOqCM;
            private int getOutputFormats = 6;
            private int getOutputSizeshNQ4ISI = 6;
            private kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Type getOutputSizes = kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Type.getDefaultInstance();
            private java.util.List<kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.TypeParameter> unwrapAs = java.util.Collections.emptyList();
            private kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Type getOutputStallDuration = kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Type.getDefaultInstance();
            private java.util.List<kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Type> getOutputMinFrameDuration = java.util.Collections.emptyList();
            private java.util.List<java.lang.Integer> getHighResolutionOutputSizeshNQ4ISI = java.util.Collections.emptyList();
            private java.util.List<kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.ValueParameter> getHighSpeedVideoFpsRanges = java.util.Collections.emptyList();
            private java.util.List<kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.ValueParameter> getValidOutputFormatsForInputhNQ4ISI = java.util.Collections.emptyList();
            private kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.TypeTable isOutputSupportedFor = kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.TypeTable.getDefaultInstance();
            private java.util.List<java.lang.Integer> isOutputSupportedForhNQ4ISI = java.util.Collections.emptyList();
            private kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Contract getInputFormats = kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Contract.getDefaultInstance();
            private java.util.List<kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.CompilerPluginData> getHighSpeedVideoFpsRangesFor = java.util.Collections.emptyList();
            private java.util.List<kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Annotation> Camera2StreamConfigurationMap = java.util.Collections.emptyList();
            private java.util.List<kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Annotation> getHighSpeedVideoSizesFor = java.util.Collections.emptyList();

            private Builder() {
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite.Builder, kotlin.reflect.jvm.internal.impl.protobuf.MessageLiteOrBuilder
            public final kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Function getDefaultInstanceForType() {
                return kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Function.getDefaultInstance();
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.MessageLite.Builder
            public final kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Function build() {
                kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Function buildPartial = buildPartial();
                if (buildPartial.isInitialized()) {
                    return buildPartial;
                }
                throw newUninitializedMessageException(buildPartial);
            }

            /* JADX WARN: Multi-variable type inference failed */
            public final kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Function buildPartial() {
                kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Function function = new kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Function((kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite.ExtendableBuilder) this, (byte) (0 == true ? 1 : 0));
                int i = this.getHighSpeedVideoSizes;
                int i2 = (i & 1) == 1 ? 1 : 0;
                function.getOutputSizeshNQ4ISI = this.getOutputFormats;
                if ((i & 2) == 2) {
                    i2 |= 2;
                }
                function.getOutputStallDuration = this.getOutputSizeshNQ4ISI;
                if ((i & 4) == 4) {
                    i2 |= 4;
                }
                function.getOutputStallDurationlomOqCM = this.getInputSizeshNQ4ISI;
                if ((i & 8) == 8) {
                    i2 |= 8;
                }
                function.isOutputSupportedFor = this.getOutputSizes;
                if ((i & 16) == 16) {
                    i2 |= 16;
                }
                function.isOutputSupportedForhNQ4ISI = this.getOutputMinFrameDurationlomOqCM;
                if ((this.getHighSpeedVideoSizes & 32) == 32) {
                    this.unwrapAs = java.util.Collections.unmodifiableList(this.unwrapAs);
                    this.getHighSpeedVideoSizes &= -33;
                }
                function.unwrapAs = this.unwrapAs;
                if ((i & 64) == 64) {
                    i2 |= 32;
                }
                function.getValidOutputFormatsForInputhNQ4ISI = this.getOutputStallDuration;
                if ((i & 128) == 128) {
                    i2 |= 64;
                }
                function.toString = this.getOutputStallDurationlomOqCM;
                if ((this.getHighSpeedVideoSizes & 256) == 256) {
                    this.getOutputMinFrameDuration = java.util.Collections.unmodifiableList(this.getOutputMinFrameDuration);
                    this.getHighSpeedVideoSizes &= -257;
                }
                function.getInputFormats = this.getOutputMinFrameDuration;
                if ((this.getHighSpeedVideoSizes & 512) == 512) {
                    this.getHighResolutionOutputSizeshNQ4ISI = java.util.Collections.unmodifiableList(this.getHighResolutionOutputSizeshNQ4ISI);
                    this.getHighSpeedVideoSizes &= -513;
                }
                function.getHighSpeedVideoSizesFor = this.getHighResolutionOutputSizeshNQ4ISI;
                if ((this.getHighSpeedVideoSizes & 1024) == 1024) {
                    this.getHighSpeedVideoFpsRanges = java.util.Collections.unmodifiableList(this.getHighSpeedVideoFpsRanges);
                    this.getHighSpeedVideoSizes &= -1025;
                }
                function.getHighResolutionOutputSizeshNQ4ISI = this.getHighSpeedVideoFpsRanges;
                if ((this.getHighSpeedVideoSizes & 2048) == 2048) {
                    this.getValidOutputFormatsForInputhNQ4ISI = java.util.Collections.unmodifiableList(this.getValidOutputFormatsForInputhNQ4ISI);
                    this.getHighSpeedVideoSizes &= -2049;
                }
                function.coroutineCreation = this.getValidOutputFormatsForInputhNQ4ISI;
                if ((i & 4096) == 4096) {
                    i2 |= 128;
                }
                function.coroutineBoundary = this.isOutputSupportedFor;
                if ((this.getHighSpeedVideoSizes & 8192) == 8192) {
                    this.isOutputSupportedForhNQ4ISI = java.util.Collections.unmodifiableList(this.isOutputSupportedForhNQ4ISI);
                    this.getHighSpeedVideoSizes &= -8193;
                }
                function.accessartificialFrame = this.isOutputSupportedForhNQ4ISI;
                if ((i & 16384) == 16384) {
                    i2 |= 256;
                }
                function.getInputSizeshNQ4ISI = this.getInputFormats;
                if ((this.getHighSpeedVideoSizes & 32768) == 32768) {
                    this.getHighSpeedVideoFpsRangesFor = java.util.Collections.unmodifiableList(this.getHighSpeedVideoFpsRangesFor);
                    this.getHighSpeedVideoSizes &= -32769;
                }
                function.getHighSpeedVideoSizes = this.getHighSpeedVideoFpsRangesFor;
                if ((this.getHighSpeedVideoSizes & 65536) == 65536) {
                    this.Camera2StreamConfigurationMap = java.util.Collections.unmodifiableList(this.Camera2StreamConfigurationMap);
                    this.getHighSpeedVideoSizes &= -65537;
                }
                function.getHighSpeedVideoFpsRangesFor = this.Camera2StreamConfigurationMap;
                if ((this.getHighSpeedVideoSizes & 131072) == 131072) {
                    this.getHighSpeedVideoSizesFor = java.util.Collections.unmodifiableList(this.getHighSpeedVideoSizesFor);
                    this.getHighSpeedVideoSizes &= -131073;
                }
                function.getOutputMinFrameDuration = this.getHighSpeedVideoSizesFor;
                function.getHighSpeedVideoFpsRanges = i2;
                return function;
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite.Builder
            public final kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Function.Builder mergeFrom(kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Function function) {
                if (function == kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Function.getDefaultInstance()) {
                    return this;
                }
                if (function.hasFlags()) {
                    setFlags(function.getFlags());
                }
                if (function.hasOldFlags()) {
                    setOldFlags(function.getOldFlags());
                }
                if (function.hasName()) {
                    setName(function.getName());
                }
                if (function.hasReturnType()) {
                    mergeReturnType(function.getReturnType());
                }
                if (function.hasReturnTypeId()) {
                    setReturnTypeId(function.getReturnTypeId());
                }
                if (!function.unwrapAs.isEmpty()) {
                    if (this.unwrapAs.isEmpty()) {
                        this.unwrapAs = function.unwrapAs;
                        this.getHighSpeedVideoSizes &= -33;
                    } else {
                        if ((this.getHighSpeedVideoSizes & 32) != 32) {
                            this.unwrapAs = new java.util.ArrayList(this.unwrapAs);
                            this.getHighSpeedVideoSizes |= 32;
                        }
                        this.unwrapAs.addAll(function.unwrapAs);
                    }
                }
                if (function.hasReceiverType()) {
                    mergeReceiverType(function.getReceiverType());
                }
                if (function.hasReceiverTypeId()) {
                    setReceiverTypeId(function.getReceiverTypeId());
                }
                if (!function.getInputFormats.isEmpty()) {
                    if (this.getOutputMinFrameDuration.isEmpty()) {
                        this.getOutputMinFrameDuration = function.getInputFormats;
                        this.getHighSpeedVideoSizes &= -257;
                    } else {
                        if ((this.getHighSpeedVideoSizes & 256) != 256) {
                            this.getOutputMinFrameDuration = new java.util.ArrayList(this.getOutputMinFrameDuration);
                            this.getHighSpeedVideoSizes |= 256;
                        }
                        this.getOutputMinFrameDuration.addAll(function.getInputFormats);
                    }
                }
                if (!function.getHighSpeedVideoSizesFor.isEmpty()) {
                    if (this.getHighResolutionOutputSizeshNQ4ISI.isEmpty()) {
                        this.getHighResolutionOutputSizeshNQ4ISI = function.getHighSpeedVideoSizesFor;
                        this.getHighSpeedVideoSizes &= -513;
                    } else {
                        if ((this.getHighSpeedVideoSizes & 512) != 512) {
                            this.getHighResolutionOutputSizeshNQ4ISI = new java.util.ArrayList(this.getHighResolutionOutputSizeshNQ4ISI);
                            this.getHighSpeedVideoSizes |= 512;
                        }
                        this.getHighResolutionOutputSizeshNQ4ISI.addAll(function.getHighSpeedVideoSizesFor);
                    }
                }
                if (!function.getHighResolutionOutputSizeshNQ4ISI.isEmpty()) {
                    if (this.getHighSpeedVideoFpsRanges.isEmpty()) {
                        this.getHighSpeedVideoFpsRanges = function.getHighResolutionOutputSizeshNQ4ISI;
                        this.getHighSpeedVideoSizes &= -1025;
                    } else {
                        if ((this.getHighSpeedVideoSizes & 1024) != 1024) {
                            this.getHighSpeedVideoFpsRanges = new java.util.ArrayList(this.getHighSpeedVideoFpsRanges);
                            this.getHighSpeedVideoSizes |= 1024;
                        }
                        this.getHighSpeedVideoFpsRanges.addAll(function.getHighResolutionOutputSizeshNQ4ISI);
                    }
                }
                if (!function.coroutineCreation.isEmpty()) {
                    if (this.getValidOutputFormatsForInputhNQ4ISI.isEmpty()) {
                        this.getValidOutputFormatsForInputhNQ4ISI = function.coroutineCreation;
                        this.getHighSpeedVideoSizes &= -2049;
                    } else {
                        if ((this.getHighSpeedVideoSizes & 2048) != 2048) {
                            this.getValidOutputFormatsForInputhNQ4ISI = new java.util.ArrayList(this.getValidOutputFormatsForInputhNQ4ISI);
                            this.getHighSpeedVideoSizes |= 2048;
                        }
                        this.getValidOutputFormatsForInputhNQ4ISI.addAll(function.coroutineCreation);
                    }
                }
                if (function.hasTypeTable()) {
                    mergeTypeTable(function.getTypeTable());
                }
                if (!function.accessartificialFrame.isEmpty()) {
                    if (this.isOutputSupportedForhNQ4ISI.isEmpty()) {
                        this.isOutputSupportedForhNQ4ISI = function.accessartificialFrame;
                        this.getHighSpeedVideoSizes &= -8193;
                    } else {
                        if ((this.getHighSpeedVideoSizes & 8192) != 8192) {
                            this.isOutputSupportedForhNQ4ISI = new java.util.ArrayList(this.isOutputSupportedForhNQ4ISI);
                            this.getHighSpeedVideoSizes |= 8192;
                        }
                        this.isOutputSupportedForhNQ4ISI.addAll(function.accessartificialFrame);
                    }
                }
                if (function.hasContract()) {
                    mergeContract(function.getContract());
                }
                if (!function.getHighSpeedVideoSizes.isEmpty()) {
                    if (this.getHighSpeedVideoFpsRangesFor.isEmpty()) {
                        this.getHighSpeedVideoFpsRangesFor = function.getHighSpeedVideoSizes;
                        this.getHighSpeedVideoSizes &= -32769;
                    } else {
                        if ((this.getHighSpeedVideoSizes & 32768) != 32768) {
                            this.getHighSpeedVideoFpsRangesFor = new java.util.ArrayList(this.getHighSpeedVideoFpsRangesFor);
                            this.getHighSpeedVideoSizes |= 32768;
                        }
                        this.getHighSpeedVideoFpsRangesFor.addAll(function.getHighSpeedVideoSizes);
                    }
                }
                if (!function.getHighSpeedVideoFpsRangesFor.isEmpty()) {
                    if (this.Camera2StreamConfigurationMap.isEmpty()) {
                        this.Camera2StreamConfigurationMap = function.getHighSpeedVideoFpsRangesFor;
                        this.getHighSpeedVideoSizes &= -65537;
                    } else {
                        getHighSpeedVideoFpsRanges();
                        this.Camera2StreamConfigurationMap.addAll(function.getHighSpeedVideoFpsRangesFor);
                    }
                }
                if (!function.getOutputMinFrameDuration.isEmpty()) {
                    if (this.getHighSpeedVideoSizesFor.isEmpty()) {
                        this.getHighSpeedVideoSizesFor = function.getOutputMinFrameDuration;
                        this.getHighSpeedVideoSizes &= -131073;
                    } else {
                        getHighSpeedVideoSizes();
                        this.getHighSpeedVideoSizesFor.addAll(function.getOutputMinFrameDuration);
                    }
                }
                mergeExtensionFields(function);
                setUnknownFields(getUnknownFields().concat(function.ArtificialStackFrames));
                return this;
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.MessageLiteOrBuilder
            public final boolean isInitialized() {
                if (!hasName()) {
                    return false;
                }
                if (hasReturnType() && !getReturnType().isInitialized()) {
                    return false;
                }
                for (int i = 0; i < getTypeParameterCount(); i++) {
                    if (!getTypeParameter(i).isInitialized()) {
                        return false;
                    }
                }
                if (hasReceiverType() && !getReceiverType().isInitialized()) {
                    return false;
                }
                for (int i2 = 0; i2 < getContextReceiverTypeCount(); i2++) {
                    if (!getContextReceiverType(i2).isInitialized()) {
                        return false;
                    }
                }
                for (int i3 = 0; i3 < getContextParameterCount(); i3++) {
                    if (!getContextParameter(i3).isInitialized()) {
                        return false;
                    }
                }
                for (int i4 = 0; i4 < getValueParameterCount(); i4++) {
                    if (!getValueParameter(i4).isInitialized()) {
                        return false;
                    }
                }
                if (hasTypeTable() && !getTypeTable().isInitialized()) {
                    return false;
                }
                if (hasContract() && !getContract().isInitialized()) {
                    return false;
                }
                for (int i5 = 0; i5 < getCompilerPluginDataCount(); i5++) {
                    if (!getCompilerPluginData(i5).isInitialized()) {
                        return false;
                    }
                }
                for (int i6 = 0; i6 < getAnnotationCount(); i6++) {
                    if (!getAnnotation(i6).isInitialized()) {
                        return false;
                    }
                }
                for (int i7 = 0; i7 < getExtensionReceiverAnnotationCount(); i7++) {
                    if (!getExtensionReceiverAnnotation(i7).isInitialized()) {
                        return false;
                    }
                }
                return extensionsAreInitialized();
            }

            /* JADX WARN: Removed duplicated region for block: B:15:0x001d  */
            @Override // kotlin.reflect.jvm.internal.impl.protobuf.AbstractMessageLite.Builder, kotlin.reflect.jvm.internal.impl.protobuf.MessageLite.Builder
            /*
                Code decompiled incorrectly, please refer to instructions dump.
            */
            public final kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Function.Builder mergeFrom(kotlin.reflect.jvm.internal.impl.protobuf.CodedInputStream codedInputStream, kotlin.reflect.jvm.internal.impl.protobuf.ExtensionRegistryLite extensionRegistryLite) throws java.io.IOException {
                kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Function function;
                try {
                    try {
                        kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Function parsePartialFrom = kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Function.PARSER.parsePartialFrom(codedInputStream, extensionRegistryLite);
                        if (parsePartialFrom != null) {
                            mergeFrom(parsePartialFrom);
                        }
                        return this;
                    } catch (kotlin.reflect.jvm.internal.impl.protobuf.InvalidProtocolBufferException e) {
                        function = (kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Function) e.getUnfinishedMessage();
                        try {
                            throw e;
                        } catch (java.lang.Throwable th) {
                            th = th;
                            if (function != null) {
                                mergeFrom(function);
                            }
                            throw th;
                        }
                    }
                } catch (java.lang.Throwable th2) {
                    th = th2;
                    function = null;
                    if (function != null) {
                    }
                    throw th;
                }
            }

            public final kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Function.Builder setFlags(int i) {
                this.getHighSpeedVideoSizes |= 1;
                this.getOutputFormats = i;
                return this;
            }

            public final kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Function.Builder setOldFlags(int i) {
                this.getHighSpeedVideoSizes |= 2;
                this.getOutputSizeshNQ4ISI = i;
                return this;
            }

            public final boolean hasName() {
                return (this.getHighSpeedVideoSizes & 4) == 4;
            }

            public final kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Function.Builder setName(int i) {
                this.getHighSpeedVideoSizes |= 4;
                this.getInputSizeshNQ4ISI = i;
                return this;
            }

            public final boolean hasReturnType() {
                return (this.getHighSpeedVideoSizes & 8) == 8;
            }

            public final kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Type getReturnType() {
                return this.getOutputSizes;
            }

            public final kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Function.Builder mergeReturnType(kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Type type) {
                if ((this.getHighSpeedVideoSizes & 8) == 8 && this.getOutputSizes != kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Type.getDefaultInstance()) {
                    this.getOutputSizes = kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Type.newBuilder(this.getOutputSizes).mergeFrom(type).buildPartial();
                } else {
                    this.getOutputSizes = type;
                }
                this.getHighSpeedVideoSizes |= 8;
                return this;
            }

            public final kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Function.Builder setReturnTypeId(int i) {
                this.getHighSpeedVideoSizes |= 16;
                this.getOutputMinFrameDurationlomOqCM = i;
                return this;
            }

            public final int getTypeParameterCount() {
                return this.unwrapAs.size();
            }

            public final kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.TypeParameter getTypeParameter(int i) {
                return this.unwrapAs.get(i);
            }

            public final boolean hasReceiverType() {
                return (this.getHighSpeedVideoSizes & 64) == 64;
            }

            public final kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Type getReceiverType() {
                return this.getOutputStallDuration;
            }

            public final kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Function.Builder mergeReceiverType(kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Type type) {
                if ((this.getHighSpeedVideoSizes & 64) == 64 && this.getOutputStallDuration != kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Type.getDefaultInstance()) {
                    this.getOutputStallDuration = kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Type.newBuilder(this.getOutputStallDuration).mergeFrom(type).buildPartial();
                } else {
                    this.getOutputStallDuration = type;
                }
                this.getHighSpeedVideoSizes |= 64;
                return this;
            }

            public final kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Function.Builder setReceiverTypeId(int i) {
                this.getHighSpeedVideoSizes |= 128;
                this.getOutputStallDurationlomOqCM = i;
                return this;
            }

            public final int getContextReceiverTypeCount() {
                return this.getOutputMinFrameDuration.size();
            }

            public final kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Type getContextReceiverType(int i) {
                return this.getOutputMinFrameDuration.get(i);
            }

            public final int getContextParameterCount() {
                return this.getHighSpeedVideoFpsRanges.size();
            }

            public final kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.ValueParameter getContextParameter(int i) {
                return this.getHighSpeedVideoFpsRanges.get(i);
            }

            public final int getValueParameterCount() {
                return this.getValidOutputFormatsForInputhNQ4ISI.size();
            }

            public final kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.ValueParameter getValueParameter(int i) {
                return this.getValidOutputFormatsForInputhNQ4ISI.get(i);
            }

            public final boolean hasTypeTable() {
                return (this.getHighSpeedVideoSizes & 4096) == 4096;
            }

            public final kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.TypeTable getTypeTable() {
                return this.isOutputSupportedFor;
            }

            public final kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Function.Builder mergeTypeTable(kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.TypeTable typeTable) {
                if ((this.getHighSpeedVideoSizes & 4096) == 4096 && this.isOutputSupportedFor != kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.TypeTable.getDefaultInstance()) {
                    this.isOutputSupportedFor = kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.TypeTable.newBuilder(this.isOutputSupportedFor).mergeFrom(typeTable).buildPartial();
                } else {
                    this.isOutputSupportedFor = typeTable;
                }
                this.getHighSpeedVideoSizes |= 4096;
                return this;
            }

            public final boolean hasContract() {
                return (this.getHighSpeedVideoSizes & 16384) == 16384;
            }

            public final kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Contract getContract() {
                return this.getInputFormats;
            }

            public final kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Function.Builder mergeContract(kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Contract contract) {
                if ((this.getHighSpeedVideoSizes & 16384) == 16384 && this.getInputFormats != kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Contract.getDefaultInstance()) {
                    this.getInputFormats = kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Contract.newBuilder(this.getInputFormats).mergeFrom(contract).buildPartial();
                } else {
                    this.getInputFormats = contract;
                }
                this.getHighSpeedVideoSizes |= 16384;
                return this;
            }

            public final int getCompilerPluginDataCount() {
                return this.getHighSpeedVideoFpsRangesFor.size();
            }

            public final kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.CompilerPluginData getCompilerPluginData(int i) {
                return this.getHighSpeedVideoFpsRangesFor.get(i);
            }

            private void getHighSpeedVideoFpsRanges() {
                if ((this.getHighSpeedVideoSizes & 65536) != 65536) {
                    this.Camera2StreamConfigurationMap = new java.util.ArrayList(this.Camera2StreamConfigurationMap);
                    this.getHighSpeedVideoSizes |= 65536;
                }
            }

            public final int getAnnotationCount() {
                return this.Camera2StreamConfigurationMap.size();
            }

            public final kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Annotation getAnnotation(int i) {
                return this.Camera2StreamConfigurationMap.get(i);
            }

            public final kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Function.Builder addAllAnnotation(java.lang.Iterable<? extends kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Annotation> iterable) {
                getHighSpeedVideoFpsRanges();
                kotlin.reflect.jvm.internal.impl.protobuf.AbstractMessageLite.Builder.addAll(iterable, this.Camera2StreamConfigurationMap);
                return this;
            }

            private void getHighSpeedVideoSizes() {
                if ((this.getHighSpeedVideoSizes & 131072) != 131072) {
                    this.getHighSpeedVideoSizesFor = new java.util.ArrayList(this.getHighSpeedVideoSizesFor);
                    this.getHighSpeedVideoSizes |= 131072;
                }
            }

            public final int getExtensionReceiverAnnotationCount() {
                return this.getHighSpeedVideoSizesFor.size();
            }

            public final kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Annotation getExtensionReceiverAnnotation(int i) {
                return this.getHighSpeedVideoSizesFor.get(i);
            }

            public final kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Function.Builder addAllExtensionReceiverAnnotation(java.lang.Iterable<? extends kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Annotation> iterable) {
                getHighSpeedVideoSizes();
                kotlin.reflect.jvm.internal.impl.protobuf.AbstractMessageLite.Builder.addAll(iterable, this.getHighSpeedVideoSizesFor);
                return this;
            }

            static /* synthetic */ kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Function.Builder getHighResolutionOutputSizeshNQ4ISI() {
                return new kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Function.Builder();
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite.ExtendableBuilder, kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite.Builder, kotlin.reflect.jvm.internal.impl.protobuf.AbstractMessageLite.Builder
            /* renamed from: clone */
            public final kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Function.Builder mo23897clone() {
                return new kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Function.Builder().mergeFrom(buildPartial());
            }
        }
    }

    public static final class Property extends kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite.ExtendableMessage<kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Property> implements kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.PropertyOrBuilder {
        public static kotlin.reflect.jvm.internal.impl.protobuf.Parser<kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Property> PARSER = new kotlin.reflect.jvm.internal.impl.protobuf.AbstractParser<kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Property>() { // from class: kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Property.1
            @Override // kotlin.reflect.jvm.internal.impl.protobuf.Parser
            public final /* synthetic */ java.lang.Object parsePartialFrom(kotlin.reflect.jvm.internal.impl.protobuf.CodedInputStream codedInputStream, kotlin.reflect.jvm.internal.impl.protobuf.ExtensionRegistryLite extensionRegistryLite) throws kotlin.reflect.jvm.internal.impl.protobuf.InvalidProtocolBufferException {
                return new kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Property(codedInputStream, extensionRegistryLite, (byte) 0);
            }
        };
        private static final kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Property getHighSpeedVideoFpsRanges;
        private java.util.List<kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Annotation> ArtificialStackFrames;
        private int Camera2StreamConfigurationMap;
        private kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Contract CoroutineDebuggingKt;
        private java.util.List<java.lang.Integer> _BOUNDARY;
        private final kotlin.reflect.jvm.internal.impl.protobuf.ByteString _CREATION;

        /* renamed from: a, reason: collision with root package name */
        private java.util.List<kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.TypeParameter> f6921a;
        private kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Type accessartificialFrame;
        private int b;
        private int coroutineBoundary;
        private kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Type coroutineCreation;
        private kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.ValueParameter getARTIFICIAL_FRAME_PACKAGE_NAME;
        private java.util.List<kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.CompilerPluginData> getHighResolutionOutputSizeshNQ4ISI;
        private java.util.List<kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Annotation> getHighSpeedVideoFpsRangesFor;
        private java.util.List<kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Annotation> getHighSpeedVideoSizes;
        private java.util.List<kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Type> getHighSpeedVideoSizesFor;
        private java.util.List<kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.ValueParameter> getInputFormats;
        private int getInputSizeshNQ4ISI;
        private java.util.List<kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Annotation> getOutputFormats;
        private java.util.List<java.lang.Integer> getOutputMinFrameDuration;
        private java.util.List<kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Annotation> getOutputMinFrameDurationlomOqCM;
        private kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Contract getOutputSizes;
        private int getOutputSizeshNQ4ISI;
        private int getOutputStallDuration;
        private java.util.List<kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Annotation> getOutputStallDurationlomOqCM;
        private int getValidOutputFormatsForInputhNQ4ISI;
        private int isOutputSupportedFor;
        private byte isOutputSupportedForhNQ4ISI;
        private int toString;
        private int unwrapAs;

        /* synthetic */ Property(kotlin.reflect.jvm.internal.impl.protobuf.CodedInputStream codedInputStream, kotlin.reflect.jvm.internal.impl.protobuf.ExtensionRegistryLite extensionRegistryLite, byte b) throws kotlin.reflect.jvm.internal.impl.protobuf.InvalidProtocolBufferException {
            this(codedInputStream, extensionRegistryLite);
        }

        /* synthetic */ Property(kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite.ExtendableBuilder extendableBuilder, byte b) {
            this(extendableBuilder);
        }

        private Property(kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite.ExtendableBuilder<kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Property, ?> extendableBuilder) {
            super(extendableBuilder);
            this.getInputSizeshNQ4ISI = -1;
            this.isOutputSupportedForhNQ4ISI = (byte) -1;
            this.getValidOutputFormatsForInputhNQ4ISI = -1;
            this._CREATION = extendableBuilder.getUnknownFields();
        }

        private Property() {
            this.getInputSizeshNQ4ISI = -1;
            this.isOutputSupportedForhNQ4ISI = (byte) -1;
            this.getValidOutputFormatsForInputhNQ4ISI = -1;
            this._CREATION = kotlin.reflect.jvm.internal.impl.protobuf.ByteString.EMPTY;
        }

        public static kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Property getDefaultInstance() {
            return getHighSpeedVideoFpsRanges;
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.MessageLiteOrBuilder
        public final kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Property getDefaultInstanceForType() {
            return getHighSpeedVideoFpsRanges;
        }

        /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r8v11 */
        /* JADX WARN: Type inference failed for: r8v13 */
        /* JADX WARN: Type inference failed for: r8v15 */
        /* JADX WARN: Type inference failed for: r8v17 */
        /* JADX WARN: Type inference failed for: r8v19 */
        /* JADX WARN: Type inference failed for: r8v21 */
        /* JADX WARN: Type inference failed for: r8v23 */
        /* JADX WARN: Type inference failed for: r8v25 */
        /* JADX WARN: Type inference failed for: r8v27 */
        /* JADX WARN: Type inference failed for: r8v29 */
        /* JADX WARN: Type inference failed for: r8v3 */
        /* JADX WARN: Type inference failed for: r8v5 */
        /* JADX WARN: Type inference failed for: r8v7 */
        /* JADX WARN: Type inference failed for: r8v9 */
        private Property(kotlin.reflect.jvm.internal.impl.protobuf.CodedInputStream codedInputStream, kotlin.reflect.jvm.internal.impl.protobuf.ExtensionRegistryLite extensionRegistryLite) throws kotlin.reflect.jvm.internal.impl.protobuf.InvalidProtocolBufferException {
            this.getInputSizeshNQ4ISI = -1;
            this.isOutputSupportedForhNQ4ISI = (byte) -1;
            this.getValidOutputFormatsForInputhNQ4ISI = -1;
            getHighSpeedVideoSizes();
            kotlin.reflect.jvm.internal.impl.protobuf.ByteString.Output newOutput = kotlin.reflect.jvm.internal.impl.protobuf.ByteString.newOutput();
            kotlin.reflect.jvm.internal.impl.protobuf.CodedOutputStream newInstance = kotlin.reflect.jvm.internal.impl.protobuf.CodedOutputStream.newInstance(newOutput, 1);
            boolean z = false;
            char c = 0;
            while (!z) {
                try {
                    try {
                        int readTag = codedInputStream.readTag();
                        switch (readTag) {
                            case 0:
                                z = true;
                            case 8:
                                this.Camera2StreamConfigurationMap |= 2;
                                this.isOutputSupportedFor = codedInputStream.readInt32();
                            case 16:
                                this.Camera2StreamConfigurationMap |= 4;
                                this.unwrapAs = codedInputStream.readInt32();
                            case 26:
                                kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Type.Builder builder = (this.Camera2StreamConfigurationMap & 8) == 8 ? this.coroutineCreation.toBuilder() : null;
                                kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Type type = (kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Type) codedInputStream.readMessage(kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Type.PARSER, extensionRegistryLite);
                                this.coroutineCreation = type;
                                if (builder != null) {
                                    builder.mergeFrom(type);
                                    this.coroutineCreation = builder.buildPartial();
                                }
                                this.Camera2StreamConfigurationMap |= 8;
                            case 34:
                                int i = (c == true ? 1 : 0) & 32;
                                c = c;
                                if (i != 32) {
                                    this.f6921a = new java.util.ArrayList();
                                    c = (c == true ? 1 : 0) | ' ';
                                }
                                this.f6921a.add(codedInputStream.readMessage(kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.TypeParameter.PARSER, extensionRegistryLite));
                            case 42:
                                kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Type.Builder builder2 = (this.Camera2StreamConfigurationMap & 32) == 32 ? this.accessartificialFrame.toBuilder() : null;
                                kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Type type2 = (kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Type) codedInputStream.readMessage(kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Type.PARSER, extensionRegistryLite);
                                this.accessartificialFrame = type2;
                                if (builder2 != null) {
                                    builder2.mergeFrom(type2);
                                    this.accessartificialFrame = builder2.buildPartial();
                                }
                                this.Camera2StreamConfigurationMap |= 32;
                            case 50:
                                kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.ValueParameter.Builder builder3 = (this.Camera2StreamConfigurationMap & 128) == 128 ? this.getARTIFICIAL_FRAME_PACKAGE_NAME.toBuilder() : null;
                                kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.ValueParameter valueParameter = (kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.ValueParameter) codedInputStream.readMessage(kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.ValueParameter.PARSER, extensionRegistryLite);
                                this.getARTIFICIAL_FRAME_PACKAGE_NAME = valueParameter;
                                if (builder3 != null) {
                                    builder3.mergeFrom(valueParameter);
                                    this.getARTIFICIAL_FRAME_PACKAGE_NAME = builder3.buildPartial();
                                }
                                this.Camera2StreamConfigurationMap |= 128;
                            case 56:
                                this.Camera2StreamConfigurationMap |= 256;
                                this.getOutputStallDuration = codedInputStream.readInt32();
                            case 64:
                                this.Camera2StreamConfigurationMap |= 512;
                                this.b = codedInputStream.readInt32();
                            case 72:
                                this.Camera2StreamConfigurationMap |= 16;
                                this.coroutineBoundary = codedInputStream.readInt32();
                            case 80:
                                this.Camera2StreamConfigurationMap |= 64;
                                this.toString = codedInputStream.readInt32();
                            case 88:
                                this.Camera2StreamConfigurationMap |= 1;
                                this.getOutputSizeshNQ4ISI = codedInputStream.readInt32();
                            case 98:
                                int i2 = (c == true ? 1 : 0) & 256;
                                c = c;
                                if (i2 != 256) {
                                    this.getHighSpeedVideoSizesFor = new java.util.ArrayList();
                                    c = (c == true ? 1 : 0) | 256;
                                }
                                this.getHighSpeedVideoSizesFor.add(codedInputStream.readMessage(kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Type.PARSER, extensionRegistryLite));
                            case 104:
                                int i3 = (c == true ? 1 : 0) & 512;
                                c = c;
                                if (i3 != 512) {
                                    this.getOutputMinFrameDuration = new java.util.ArrayList();
                                    c = (c == true ? 1 : 0) | 512;
                                }
                                this.getOutputMinFrameDuration.add(java.lang.Integer.valueOf(codedInputStream.readInt32()));
                            case 106:
                                int pushLimit = codedInputStream.pushLimit(codedInputStream.readRawVarint32());
                                int i4 = (c == true ? 1 : 0) & 512;
                                c = c;
                                if (i4 != 512) {
                                    c = c;
                                    if (codedInputStream.getBytesUntilLimit() > 0) {
                                        this.getOutputMinFrameDuration = new java.util.ArrayList();
                                        c = (c == true ? 1 : 0) | 512;
                                    }
                                }
                                while (codedInputStream.getBytesUntilLimit() > 0) {
                                    this.getOutputMinFrameDuration.add(java.lang.Integer.valueOf(codedInputStream.readInt32()));
                                }
                                codedInputStream.popLimit(pushLimit);
                            case 114:
                                int i5 = (c == true ? 1 : 0) & 65536;
                                c = c;
                                if (i5 != 65536) {
                                    this.getHighSpeedVideoSizes = new java.util.ArrayList();
                                    c = (c == true ? 1 : 0) | 0;
                                }
                                this.getHighSpeedVideoSizes.add(codedInputStream.readMessage(kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Annotation.PARSER, extensionRegistryLite));
                            case SDK_ASSET_ILLUSTRATION_DEPOSIT_VALUE:
                                int i6 = (c == true ? 1 : 0) & 131072;
                                c = c;
                                if (i6 != 131072) {
                                    this.getOutputStallDurationlomOqCM = new java.util.ArrayList();
                                    c = (c == true ? 1 : 0) | 0;
                                }
                                this.getOutputStallDurationlomOqCM.add(codedInputStream.readMessage(kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Annotation.PARSER, extensionRegistryLite));
                            case 130:
                                int i7 = (c == true ? 1 : 0) & 262144;
                                c = c;
                                if (i7 != 262144) {
                                    this.ArtificialStackFrames = new java.util.ArrayList();
                                    c = (c == true ? 1 : 0) | 0;
                                }
                                this.ArtificialStackFrames.add(codedInputStream.readMessage(kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Annotation.PARSER, extensionRegistryLite));
                            case 138:
                                int i8 = (c == true ? 1 : 0) & 1024;
                                c = c;
                                if (i8 != 1024) {
                                    this.getInputFormats = new java.util.ArrayList();
                                    c = (c == true ? 1 : 0) | 1024;
                                }
                                this.getInputFormats.add(codedInputStream.readMessage(kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.ValueParameter.PARSER, extensionRegistryLite));
                            case SDK_ASSET_ILLUSTRATION_PLAID_OVERLAY_INSTITUTION_TRANSFER_VALUE:
                                int i9 = (c == true ? 1 : 0) & 16384;
                                c = c;
                                if (i9 != 16384) {
                                    this._BOUNDARY = new java.util.ArrayList();
                                    c = (c == true ? 1 : 0) | 16384;
                                }
                                this._BOUNDARY.add(java.lang.Integer.valueOf(codedInputStream.readInt32()));
                            case 250:
                                int pushLimit2 = codedInputStream.pushLimit(codedInputStream.readRawVarint32());
                                int i10 = (c == true ? 1 : 0) & 16384;
                                c = c;
                                if (i10 != 16384) {
                                    c = c;
                                    if (codedInputStream.getBytesUntilLimit() > 0) {
                                        this._BOUNDARY = new java.util.ArrayList();
                                        c = (c == true ? 1 : 0) | 16384;
                                    }
                                }
                                while (codedInputStream.getBytesUntilLimit() > 0) {
                                    this._BOUNDARY.add(java.lang.Integer.valueOf(codedInputStream.readInt32()));
                                }
                                codedInputStream.popLimit(pushLimit2);
                            case 258:
                                int i11 = (c == true ? 1 : 0) & 32768;
                                c = c;
                                if (i11 != 32768) {
                                    this.getHighResolutionOutputSizeshNQ4ISI = new java.util.ArrayList();
                                    c = (c == true ? 1 : 0) | 32768;
                                }
                                this.getHighResolutionOutputSizeshNQ4ISI.add(codedInputStream.readMessage(kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.CompilerPluginData.PARSER, extensionRegistryLite));
                            case SDK_ASSET_ILLUSTRATION_CRA_OVERLAY_ACCOUNT_VALUE:
                                int i12 = (c == true ? 1 : 0) & 524288;
                                c = c;
                                if (i12 != 524288) {
                                    this.getOutputMinFrameDurationlomOqCM = new java.util.ArrayList();
                                    c = (c == true ? 1 : 0) | 0;
                                }
                                this.getOutputMinFrameDurationlomOqCM.add(codedInputStream.readMessage(kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Annotation.PARSER, extensionRegistryLite));
                            case SDK_ASSET_ILLUSTRATION_SUCCESS_BRUSHSTROKE_VALUE:
                                int i13 = (c == true ? 1 : 0) & 1048576;
                                c = c;
                                if (i13 != 1048576) {
                                    this.getHighSpeedVideoFpsRangesFor = new java.util.ArrayList();
                                    c = (c == true ? 1 : 0) | 0;
                                }
                                this.getHighSpeedVideoFpsRangesFor.add(codedInputStream.readMessage(kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Annotation.PARSER, extensionRegistryLite));
                            case 282:
                                int i14 = (c == true ? 1 : 0) & 2097152;
                                c = c;
                                if (i14 != 2097152) {
                                    this.getOutputFormats = new java.util.ArrayList();
                                    c = (c == true ? 1 : 0) | 0;
                                }
                                this.getOutputFormats.add(codedInputStream.readMessage(kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Annotation.PARSER, extensionRegistryLite));
                            case 322:
                                kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Contract.Builder builder4 = (this.Camera2StreamConfigurationMap & 1024) == 1024 ? this.getOutputSizes.toBuilder() : null;
                                kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Contract contract = (kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Contract) codedInputStream.readMessage(kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Contract.PARSER, extensionRegistryLite);
                                this.getOutputSizes = contract;
                                if (builder4 != null) {
                                    builder4.mergeFrom(contract);
                                    this.getOutputSizes = builder4.buildPartial();
                                }
                                this.Camera2StreamConfigurationMap |= 1024;
                            case com.visa.cbp.getCertUsage.setAucAID /* 330 */:
                                kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Contract.Builder builder5 = (this.Camera2StreamConfigurationMap & 2048) == 2048 ? this.CoroutineDebuggingKt.toBuilder() : null;
                                kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Contract contract2 = (kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Contract) codedInputStream.readMessage(kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Contract.PARSER, extensionRegistryLite);
                                this.CoroutineDebuggingKt = contract2;
                                if (builder5 != null) {
                                    builder5.mergeFrom(contract2);
                                    this.CoroutineDebuggingKt = builder5.buildPartial();
                                }
                                this.Camera2StreamConfigurationMap |= 2048;
                            default:
                                c = parseUnknownField(codedInputStream, newInstance, extensionRegistryLite, readTag) ? c : c;
                                z = true;
                        }
                    } catch (kotlin.reflect.jvm.internal.impl.protobuf.InvalidProtocolBufferException e) {
                        throw e.setUnfinishedMessage(this);
                    } catch (java.io.IOException e2) {
                        throw new kotlin.reflect.jvm.internal.impl.protobuf.InvalidProtocolBufferException(e2.getMessage()).setUnfinishedMessage(this);
                    }
                } catch (java.lang.Throwable th) {
                    if (((c == true ? 1 : 0) & 32) == 32) {
                        this.f6921a = java.util.Collections.unmodifiableList(this.f6921a);
                    }
                    if (((c == true ? 1 : 0) & 256) == 256) {
                        this.getHighSpeedVideoSizesFor = java.util.Collections.unmodifiableList(this.getHighSpeedVideoSizesFor);
                    }
                    if (((c == true ? 1 : 0) & 512) == 512) {
                        this.getOutputMinFrameDuration = java.util.Collections.unmodifiableList(this.getOutputMinFrameDuration);
                    }
                    if (((c == true ? 1 : 0) & 65536) == 65536) {
                        this.getHighSpeedVideoSizes = java.util.Collections.unmodifiableList(this.getHighSpeedVideoSizes);
                    }
                    if (((c == true ? 1 : 0) & 131072) == 131072) {
                        this.getOutputStallDurationlomOqCM = java.util.Collections.unmodifiableList(this.getOutputStallDurationlomOqCM);
                    }
                    if (((c == true ? 1 : 0) & 262144) == 262144) {
                        this.ArtificialStackFrames = java.util.Collections.unmodifiableList(this.ArtificialStackFrames);
                    }
                    if (((c == true ? 1 : 0) & 1024) == 1024) {
                        this.getInputFormats = java.util.Collections.unmodifiableList(this.getInputFormats);
                    }
                    if (((c == true ? 1 : 0) & 16384) == 16384) {
                        this._BOUNDARY = java.util.Collections.unmodifiableList(this._BOUNDARY);
                    }
                    if (((c == true ? 1 : 0) & 32768) == 32768) {
                        this.getHighResolutionOutputSizeshNQ4ISI = java.util.Collections.unmodifiableList(this.getHighResolutionOutputSizeshNQ4ISI);
                    }
                    if (((c == true ? 1 : 0) & 524288) == 524288) {
                        this.getOutputMinFrameDurationlomOqCM = java.util.Collections.unmodifiableList(this.getOutputMinFrameDurationlomOqCM);
                    }
                    if (((c == true ? 1 : 0) & 1048576) == 1048576) {
                        this.getHighSpeedVideoFpsRangesFor = java.util.Collections.unmodifiableList(this.getHighSpeedVideoFpsRangesFor);
                    }
                    if (((c == true ? 1 : 0) & 2097152) == 2097152) {
                        this.getOutputFormats = java.util.Collections.unmodifiableList(this.getOutputFormats);
                    }
                    try {
                        newInstance.flush();
                    } catch (java.io.IOException unused) {
                    } catch (java.lang.Throwable th2) {
                        this._CREATION = newOutput.toByteString();
                        throw th2;
                    }
                    this._CREATION = newOutput.toByteString();
                    makeExtensionsImmutable();
                    throw th;
                }
            }
            if (((c == true ? 1 : 0) & 32) == 32) {
                this.f6921a = java.util.Collections.unmodifiableList(this.f6921a);
            }
            if (((c == true ? 1 : 0) & 256) == 256) {
                this.getHighSpeedVideoSizesFor = java.util.Collections.unmodifiableList(this.getHighSpeedVideoSizesFor);
            }
            if (((c == true ? 1 : 0) & 512) == 512) {
                this.getOutputMinFrameDuration = java.util.Collections.unmodifiableList(this.getOutputMinFrameDuration);
            }
            if (((c == true ? 1 : 0) & 65536) == 65536) {
                this.getHighSpeedVideoSizes = java.util.Collections.unmodifiableList(this.getHighSpeedVideoSizes);
            }
            if (((c == true ? 1 : 0) & 131072) == 131072) {
                this.getOutputStallDurationlomOqCM = java.util.Collections.unmodifiableList(this.getOutputStallDurationlomOqCM);
            }
            if (((c == true ? 1 : 0) & 262144) == 262144) {
                this.ArtificialStackFrames = java.util.Collections.unmodifiableList(this.ArtificialStackFrames);
            }
            if (((c == true ? 1 : 0) & 1024) == 1024) {
                this.getInputFormats = java.util.Collections.unmodifiableList(this.getInputFormats);
            }
            if (((c == true ? 1 : 0) & 16384) == 16384) {
                this._BOUNDARY = java.util.Collections.unmodifiableList(this._BOUNDARY);
            }
            if (((c == true ? 1 : 0) & 32768) == 32768) {
                this.getHighResolutionOutputSizeshNQ4ISI = java.util.Collections.unmodifiableList(this.getHighResolutionOutputSizeshNQ4ISI);
            }
            if (((c == true ? 1 : 0) & 524288) == 524288) {
                this.getOutputMinFrameDurationlomOqCM = java.util.Collections.unmodifiableList(this.getOutputMinFrameDurationlomOqCM);
            }
            if (((c == true ? 1 : 0) & 1048576) == 1048576) {
                this.getHighSpeedVideoFpsRangesFor = java.util.Collections.unmodifiableList(this.getHighSpeedVideoFpsRangesFor);
            }
            if (((c == true ? 1 : 0) & 2097152) == 2097152) {
                this.getOutputFormats = java.util.Collections.unmodifiableList(this.getOutputFormats);
            }
            try {
                newInstance.flush();
            } catch (java.io.IOException unused2) {
            } catch (java.lang.Throwable th3) {
                this._CREATION = newOutput.toByteString();
                throw th3;
            }
            this._CREATION = newOutput.toByteString();
            makeExtensionsImmutable();
        }

        static {
            kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Property property = new kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Property();
            getHighSpeedVideoFpsRanges = property;
            property.getHighSpeedVideoSizes();
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite, kotlin.reflect.jvm.internal.impl.protobuf.MessageLite
        public final kotlin.reflect.jvm.internal.impl.protobuf.Parser<kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Property> getParserForType() {
            return PARSER;
        }

        public final boolean hasFlags() {
            return (this.Camera2StreamConfigurationMap & 1) == 1;
        }

        public final int getFlags() {
            return this.getOutputSizeshNQ4ISI;
        }

        public final boolean hasOldFlags() {
            return (this.Camera2StreamConfigurationMap & 2) == 2;
        }

        public final int getOldFlags() {
            return this.isOutputSupportedFor;
        }

        public final boolean hasName() {
            return (this.Camera2StreamConfigurationMap & 4) == 4;
        }

        public final int getName() {
            return this.unwrapAs;
        }

        public final boolean hasReturnType() {
            return (this.Camera2StreamConfigurationMap & 8) == 8;
        }

        public final kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Type getReturnType() {
            return this.coroutineCreation;
        }

        public final boolean hasReturnTypeId() {
            return (this.Camera2StreamConfigurationMap & 16) == 16;
        }

        public final int getReturnTypeId() {
            return this.coroutineBoundary;
        }

        public final java.util.List<kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.TypeParameter> getTypeParameterList() {
            return this.f6921a;
        }

        public final int getTypeParameterCount() {
            return this.f6921a.size();
        }

        public final kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.TypeParameter getTypeParameter(int i) {
            return this.f6921a.get(i);
        }

        public final boolean hasReceiverType() {
            return (this.Camera2StreamConfigurationMap & 32) == 32;
        }

        public final kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Type getReceiverType() {
            return this.accessartificialFrame;
        }

        public final boolean hasReceiverTypeId() {
            return (this.Camera2StreamConfigurationMap & 64) == 64;
        }

        public final int getReceiverTypeId() {
            return this.toString;
        }

        public final java.util.List<kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Type> getContextReceiverTypeList() {
            return this.getHighSpeedVideoSizesFor;
        }

        public final int getContextReceiverTypeCount() {
            return this.getHighSpeedVideoSizesFor.size();
        }

        public final kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Type getContextReceiverType(int i) {
            return this.getHighSpeedVideoSizesFor.get(i);
        }

        public final java.util.List<java.lang.Integer> getContextReceiverTypeIdList() {
            return this.getOutputMinFrameDuration;
        }

        public final java.util.List<kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.ValueParameter> getContextParameterList() {
            return this.getInputFormats;
        }

        public final int getContextParameterCount() {
            return this.getInputFormats.size();
        }

        public final kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.ValueParameter getContextParameter(int i) {
            return this.getInputFormats.get(i);
        }

        public final boolean hasSetterValueParameter() {
            return (this.Camera2StreamConfigurationMap & 128) == 128;
        }

        public final kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.ValueParameter getSetterValueParameter() {
            return this.getARTIFICIAL_FRAME_PACKAGE_NAME;
        }

        public final boolean hasGetterFlags() {
            return (this.Camera2StreamConfigurationMap & 256) == 256;
        }

        public final int getGetterFlags() {
            return this.getOutputStallDuration;
        }

        public final boolean hasSetterFlags() {
            return (this.Camera2StreamConfigurationMap & 512) == 512;
        }

        public final int getSetterFlags() {
            return this.b;
        }

        public final java.util.List<java.lang.Integer> getVersionRequirementList() {
            return this._BOUNDARY;
        }

        public final int getCompilerPluginDataCount() {
            return this.getHighResolutionOutputSizeshNQ4ISI.size();
        }

        public final kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.CompilerPluginData getCompilerPluginData(int i) {
            return this.getHighResolutionOutputSizeshNQ4ISI.get(i);
        }

        public final java.util.List<kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Annotation> getAnnotationList() {
            return this.getHighSpeedVideoSizes;
        }

        public final int getAnnotationCount() {
            return this.getHighSpeedVideoSizes.size();
        }

        public final kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Annotation getAnnotation(int i) {
            return this.getHighSpeedVideoSizes.get(i);
        }

        public final java.util.List<kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Annotation> getGetterAnnotationList() {
            return this.getOutputStallDurationlomOqCM;
        }

        public final int getGetterAnnotationCount() {
            return this.getOutputStallDurationlomOqCM.size();
        }

        public final kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Annotation getGetterAnnotation(int i) {
            return this.getOutputStallDurationlomOqCM.get(i);
        }

        public final java.util.List<kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Annotation> getSetterAnnotationList() {
            return this.ArtificialStackFrames;
        }

        public final int getSetterAnnotationCount() {
            return this.ArtificialStackFrames.size();
        }

        public final kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Annotation getSetterAnnotation(int i) {
            return this.ArtificialStackFrames.get(i);
        }

        public final java.util.List<kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Annotation> getExtensionReceiverAnnotationList() {
            return this.getOutputMinFrameDurationlomOqCM;
        }

        public final int getExtensionReceiverAnnotationCount() {
            return this.getOutputMinFrameDurationlomOqCM.size();
        }

        public final kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Annotation getExtensionReceiverAnnotation(int i) {
            return this.getOutputMinFrameDurationlomOqCM.get(i);
        }

        public final java.util.List<kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Annotation> getBackingFieldAnnotationList() {
            return this.getHighSpeedVideoFpsRangesFor;
        }

        public final int getBackingFieldAnnotationCount() {
            return this.getHighSpeedVideoFpsRangesFor.size();
        }

        public final kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Annotation getBackingFieldAnnotation(int i) {
            return this.getHighSpeedVideoFpsRangesFor.get(i);
        }

        public final java.util.List<kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Annotation> getDelegateFieldAnnotationList() {
            return this.getOutputFormats;
        }

        public final int getDelegateFieldAnnotationCount() {
            return this.getOutputFormats.size();
        }

        public final kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Annotation getDelegateFieldAnnotation(int i) {
            return this.getOutputFormats.get(i);
        }

        public final boolean hasGetterContract() {
            return (this.Camera2StreamConfigurationMap & 1024) == 1024;
        }

        public final kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Contract getGetterContract() {
            return this.getOutputSizes;
        }

        public final boolean hasSetterContract() {
            return (this.Camera2StreamConfigurationMap & 2048) == 2048;
        }

        public final kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Contract getSetterContract() {
            return this.CoroutineDebuggingKt;
        }

        private void getHighSpeedVideoSizes() {
            this.getOutputSizeshNQ4ISI = my.com.softspace.ssfasstapsdk.pog.AttestationPOG.POGStatusCodes.RST_POG_CERTIFICATE_NOT_FOUND;
            this.isOutputSupportedFor = 2054;
            this.unwrapAs = 0;
            this.coroutineCreation = kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Type.getDefaultInstance();
            this.coroutineBoundary = 0;
            this.f6921a = java.util.Collections.emptyList();
            this.accessartificialFrame = kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Type.getDefaultInstance();
            this.toString = 0;
            this.getHighSpeedVideoSizesFor = java.util.Collections.emptyList();
            this.getOutputMinFrameDuration = java.util.Collections.emptyList();
            this.getInputFormats = java.util.Collections.emptyList();
            this.getARTIFICIAL_FRAME_PACKAGE_NAME = kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.ValueParameter.getDefaultInstance();
            this.getOutputStallDuration = 0;
            this.b = 0;
            this._BOUNDARY = java.util.Collections.emptyList();
            this.getHighResolutionOutputSizeshNQ4ISI = java.util.Collections.emptyList();
            this.getHighSpeedVideoSizes = java.util.Collections.emptyList();
            this.getOutputStallDurationlomOqCM = java.util.Collections.emptyList();
            this.ArtificialStackFrames = java.util.Collections.emptyList();
            this.getOutputMinFrameDurationlomOqCM = java.util.Collections.emptyList();
            this.getHighSpeedVideoFpsRangesFor = java.util.Collections.emptyList();
            this.getOutputFormats = java.util.Collections.emptyList();
            this.getOutputSizes = kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Contract.getDefaultInstance();
            this.CoroutineDebuggingKt = kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Contract.getDefaultInstance();
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.MessageLiteOrBuilder
        public final boolean isInitialized() {
            byte b = this.isOutputSupportedForhNQ4ISI;
            if (b == 1) {
                return true;
            }
            if (b == 0) {
                return false;
            }
            if (!hasName()) {
                this.isOutputSupportedForhNQ4ISI = (byte) 0;
                return false;
            }
            if (hasReturnType() && !getReturnType().isInitialized()) {
                this.isOutputSupportedForhNQ4ISI = (byte) 0;
                return false;
            }
            for (int i = 0; i < getTypeParameterCount(); i++) {
                if (!getTypeParameter(i).isInitialized()) {
                    this.isOutputSupportedForhNQ4ISI = (byte) 0;
                    return false;
                }
            }
            if (hasReceiverType() && !getReceiverType().isInitialized()) {
                this.isOutputSupportedForhNQ4ISI = (byte) 0;
                return false;
            }
            for (int i2 = 0; i2 < getContextReceiverTypeCount(); i2++) {
                if (!getContextReceiverType(i2).isInitialized()) {
                    this.isOutputSupportedForhNQ4ISI = (byte) 0;
                    return false;
                }
            }
            for (int i3 = 0; i3 < getContextParameterCount(); i3++) {
                if (!getContextParameter(i3).isInitialized()) {
                    this.isOutputSupportedForhNQ4ISI = (byte) 0;
                    return false;
                }
            }
            if (hasSetterValueParameter() && !getSetterValueParameter().isInitialized()) {
                this.isOutputSupportedForhNQ4ISI = (byte) 0;
                return false;
            }
            for (int i4 = 0; i4 < getCompilerPluginDataCount(); i4++) {
                if (!getCompilerPluginData(i4).isInitialized()) {
                    this.isOutputSupportedForhNQ4ISI = (byte) 0;
                    return false;
                }
            }
            for (int i5 = 0; i5 < getAnnotationCount(); i5++) {
                if (!getAnnotation(i5).isInitialized()) {
                    this.isOutputSupportedForhNQ4ISI = (byte) 0;
                    return false;
                }
            }
            for (int i6 = 0; i6 < getGetterAnnotationCount(); i6++) {
                if (!getGetterAnnotation(i6).isInitialized()) {
                    this.isOutputSupportedForhNQ4ISI = (byte) 0;
                    return false;
                }
            }
            for (int i7 = 0; i7 < getSetterAnnotationCount(); i7++) {
                if (!getSetterAnnotation(i7).isInitialized()) {
                    this.isOutputSupportedForhNQ4ISI = (byte) 0;
                    return false;
                }
            }
            for (int i8 = 0; i8 < getExtensionReceiverAnnotationCount(); i8++) {
                if (!getExtensionReceiverAnnotation(i8).isInitialized()) {
                    this.isOutputSupportedForhNQ4ISI = (byte) 0;
                    return false;
                }
            }
            for (int i9 = 0; i9 < getBackingFieldAnnotationCount(); i9++) {
                if (!getBackingFieldAnnotation(i9).isInitialized()) {
                    this.isOutputSupportedForhNQ4ISI = (byte) 0;
                    return false;
                }
            }
            for (int i10 = 0; i10 < getDelegateFieldAnnotationCount(); i10++) {
                if (!getDelegateFieldAnnotation(i10).isInitialized()) {
                    this.isOutputSupportedForhNQ4ISI = (byte) 0;
                    return false;
                }
            }
            if (hasGetterContract() && !getGetterContract().isInitialized()) {
                this.isOutputSupportedForhNQ4ISI = (byte) 0;
                return false;
            }
            if (hasSetterContract() && !getSetterContract().isInitialized()) {
                this.isOutputSupportedForhNQ4ISI = (byte) 0;
                return false;
            }
            if (!extensionsAreInitialized()) {
                this.isOutputSupportedForhNQ4ISI = (byte) 0;
                return false;
            }
            this.isOutputSupportedForhNQ4ISI = (byte) 1;
            return true;
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.MessageLite
        public final void writeTo(kotlin.reflect.jvm.internal.impl.protobuf.CodedOutputStream codedOutputStream) throws java.io.IOException {
            getSerializedSize();
            kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite.ExtendableMessage<MessageType>.ExtensionWriter newExtensionWriter = newExtensionWriter();
            if ((this.Camera2StreamConfigurationMap & 2) == 2) {
                codedOutputStream.writeInt32(1, this.isOutputSupportedFor);
            }
            if ((this.Camera2StreamConfigurationMap & 4) == 4) {
                codedOutputStream.writeInt32(2, this.unwrapAs);
            }
            if ((this.Camera2StreamConfigurationMap & 8) == 8) {
                codedOutputStream.writeMessage(3, this.coroutineCreation);
            }
            for (int i = 0; i < this.f6921a.size(); i++) {
                codedOutputStream.writeMessage(4, this.f6921a.get(i));
            }
            if ((this.Camera2StreamConfigurationMap & 32) == 32) {
                codedOutputStream.writeMessage(5, this.accessartificialFrame);
            }
            if ((this.Camera2StreamConfigurationMap & 128) == 128) {
                codedOutputStream.writeMessage(6, this.getARTIFICIAL_FRAME_PACKAGE_NAME);
            }
            if ((this.Camera2StreamConfigurationMap & 256) == 256) {
                codedOutputStream.writeInt32(7, this.getOutputStallDuration);
            }
            if ((this.Camera2StreamConfigurationMap & 512) == 512) {
                codedOutputStream.writeInt32(8, this.b);
            }
            if ((this.Camera2StreamConfigurationMap & 16) == 16) {
                codedOutputStream.writeInt32(9, this.coroutineBoundary);
            }
            if ((this.Camera2StreamConfigurationMap & 64) == 64) {
                codedOutputStream.writeInt32(10, this.toString);
            }
            if ((this.Camera2StreamConfigurationMap & 1) == 1) {
                codedOutputStream.writeInt32(11, this.getOutputSizeshNQ4ISI);
            }
            for (int i2 = 0; i2 < this.getHighSpeedVideoSizesFor.size(); i2++) {
                codedOutputStream.writeMessage(12, this.getHighSpeedVideoSizesFor.get(i2));
            }
            if (getContextReceiverTypeIdList().size() > 0) {
                codedOutputStream.writeRawVarint32(106);
                codedOutputStream.writeRawVarint32(this.getInputSizeshNQ4ISI);
            }
            for (int i3 = 0; i3 < this.getOutputMinFrameDuration.size(); i3++) {
                codedOutputStream.writeInt32NoTag(this.getOutputMinFrameDuration.get(i3).intValue());
            }
            for (int i4 = 0; i4 < this.getHighSpeedVideoSizes.size(); i4++) {
                codedOutputStream.writeMessage(14, this.getHighSpeedVideoSizes.get(i4));
            }
            for (int i5 = 0; i5 < this.getOutputStallDurationlomOqCM.size(); i5++) {
                codedOutputStream.writeMessage(15, this.getOutputStallDurationlomOqCM.get(i5));
            }
            for (int i6 = 0; i6 < this.ArtificialStackFrames.size(); i6++) {
                codedOutputStream.writeMessage(16, this.ArtificialStackFrames.get(i6));
            }
            for (int i7 = 0; i7 < this.getInputFormats.size(); i7++) {
                codedOutputStream.writeMessage(17, this.getInputFormats.get(i7));
            }
            for (int i8 = 0; i8 < this._BOUNDARY.size(); i8++) {
                codedOutputStream.writeInt32(31, this._BOUNDARY.get(i8).intValue());
            }
            for (int i9 = 0; i9 < this.getHighResolutionOutputSizeshNQ4ISI.size(); i9++) {
                codedOutputStream.writeMessage(32, this.getHighResolutionOutputSizeshNQ4ISI.get(i9));
            }
            for (int i10 = 0; i10 < this.getOutputMinFrameDurationlomOqCM.size(); i10++) {
                codedOutputStream.writeMessage(33, this.getOutputMinFrameDurationlomOqCM.get(i10));
            }
            for (int i11 = 0; i11 < this.getHighSpeedVideoFpsRangesFor.size(); i11++) {
                codedOutputStream.writeMessage(34, this.getHighSpeedVideoFpsRangesFor.get(i11));
            }
            for (int i12 = 0; i12 < this.getOutputFormats.size(); i12++) {
                codedOutputStream.writeMessage(35, this.getOutputFormats.get(i12));
            }
            if ((this.Camera2StreamConfigurationMap & 1024) == 1024) {
                codedOutputStream.writeMessage(40, this.getOutputSizes);
            }
            if ((this.Camera2StreamConfigurationMap & 2048) == 2048) {
                codedOutputStream.writeMessage(41, this.CoroutineDebuggingKt);
            }
            newExtensionWriter.writeUntil(19000, codedOutputStream);
            codedOutputStream.writeRawBytes(this._CREATION);
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.MessageLite
        public final int getSerializedSize() {
            int i = this.getValidOutputFormatsForInputhNQ4ISI;
            if (i != -1) {
                return i;
            }
            int computeInt32Size = (this.Camera2StreamConfigurationMap & 2) == 2 ? kotlin.reflect.jvm.internal.impl.protobuf.CodedOutputStream.computeInt32Size(1, this.isOutputSupportedFor) : 0;
            if ((this.Camera2StreamConfigurationMap & 4) == 4) {
                computeInt32Size += kotlin.reflect.jvm.internal.impl.protobuf.CodedOutputStream.computeInt32Size(2, this.unwrapAs);
            }
            if ((this.Camera2StreamConfigurationMap & 8) == 8) {
                computeInt32Size += kotlin.reflect.jvm.internal.impl.protobuf.CodedOutputStream.computeMessageSize(3, this.coroutineCreation);
            }
            for (int i2 = 0; i2 < this.f6921a.size(); i2++) {
                computeInt32Size += kotlin.reflect.jvm.internal.impl.protobuf.CodedOutputStream.computeMessageSize(4, this.f6921a.get(i2));
            }
            if ((this.Camera2StreamConfigurationMap & 32) == 32) {
                computeInt32Size += kotlin.reflect.jvm.internal.impl.protobuf.CodedOutputStream.computeMessageSize(5, this.accessartificialFrame);
            }
            if ((this.Camera2StreamConfigurationMap & 128) == 128) {
                computeInt32Size += kotlin.reflect.jvm.internal.impl.protobuf.CodedOutputStream.computeMessageSize(6, this.getARTIFICIAL_FRAME_PACKAGE_NAME);
            }
            if ((this.Camera2StreamConfigurationMap & 256) == 256) {
                computeInt32Size += kotlin.reflect.jvm.internal.impl.protobuf.CodedOutputStream.computeInt32Size(7, this.getOutputStallDuration);
            }
            if ((this.Camera2StreamConfigurationMap & 512) == 512) {
                computeInt32Size += kotlin.reflect.jvm.internal.impl.protobuf.CodedOutputStream.computeInt32Size(8, this.b);
            }
            if ((this.Camera2StreamConfigurationMap & 16) == 16) {
                computeInt32Size += kotlin.reflect.jvm.internal.impl.protobuf.CodedOutputStream.computeInt32Size(9, this.coroutineBoundary);
            }
            if ((this.Camera2StreamConfigurationMap & 64) == 64) {
                computeInt32Size += kotlin.reflect.jvm.internal.impl.protobuf.CodedOutputStream.computeInt32Size(10, this.toString);
            }
            if ((this.Camera2StreamConfigurationMap & 1) == 1) {
                computeInt32Size += kotlin.reflect.jvm.internal.impl.protobuf.CodedOutputStream.computeInt32Size(11, this.getOutputSizeshNQ4ISI);
            }
            for (int i3 = 0; i3 < this.getHighSpeedVideoSizesFor.size(); i3++) {
                computeInt32Size += kotlin.reflect.jvm.internal.impl.protobuf.CodedOutputStream.computeMessageSize(12, this.getHighSpeedVideoSizesFor.get(i3));
            }
            int i4 = 0;
            for (int i5 = 0; i5 < this.getOutputMinFrameDuration.size(); i5++) {
                i4 += kotlin.reflect.jvm.internal.impl.protobuf.CodedOutputStream.computeInt32SizeNoTag(this.getOutputMinFrameDuration.get(i5).intValue());
            }
            int i6 = computeInt32Size + i4;
            if (!getContextReceiverTypeIdList().isEmpty()) {
                i6 = i6 + 1 + kotlin.reflect.jvm.internal.impl.protobuf.CodedOutputStream.computeInt32SizeNoTag(i4);
            }
            this.getInputSizeshNQ4ISI = i4;
            for (int i7 = 0; i7 < this.getHighSpeedVideoSizes.size(); i7++) {
                i6 += kotlin.reflect.jvm.internal.impl.protobuf.CodedOutputStream.computeMessageSize(14, this.getHighSpeedVideoSizes.get(i7));
            }
            for (int i8 = 0; i8 < this.getOutputStallDurationlomOqCM.size(); i8++) {
                i6 += kotlin.reflect.jvm.internal.impl.protobuf.CodedOutputStream.computeMessageSize(15, this.getOutputStallDurationlomOqCM.get(i8));
            }
            for (int i9 = 0; i9 < this.ArtificialStackFrames.size(); i9++) {
                i6 += kotlin.reflect.jvm.internal.impl.protobuf.CodedOutputStream.computeMessageSize(16, this.ArtificialStackFrames.get(i9));
            }
            for (int i10 = 0; i10 < this.getInputFormats.size(); i10++) {
                i6 += kotlin.reflect.jvm.internal.impl.protobuf.CodedOutputStream.computeMessageSize(17, this.getInputFormats.get(i10));
            }
            int i11 = 0;
            for (int i12 = 0; i12 < this._BOUNDARY.size(); i12++) {
                i11 += kotlin.reflect.jvm.internal.impl.protobuf.CodedOutputStream.computeInt32SizeNoTag(this._BOUNDARY.get(i12).intValue());
            }
            int size = i6 + i11 + (getVersionRequirementList().size() * 2);
            for (int i13 = 0; i13 < this.getHighResolutionOutputSizeshNQ4ISI.size(); i13++) {
                size += kotlin.reflect.jvm.internal.impl.protobuf.CodedOutputStream.computeMessageSize(32, this.getHighResolutionOutputSizeshNQ4ISI.get(i13));
            }
            for (int i14 = 0; i14 < this.getOutputMinFrameDurationlomOqCM.size(); i14++) {
                size += kotlin.reflect.jvm.internal.impl.protobuf.CodedOutputStream.computeMessageSize(33, this.getOutputMinFrameDurationlomOqCM.get(i14));
            }
            for (int i15 = 0; i15 < this.getHighSpeedVideoFpsRangesFor.size(); i15++) {
                size += kotlin.reflect.jvm.internal.impl.protobuf.CodedOutputStream.computeMessageSize(34, this.getHighSpeedVideoFpsRangesFor.get(i15));
            }
            for (int i16 = 0; i16 < this.getOutputFormats.size(); i16++) {
                size += kotlin.reflect.jvm.internal.impl.protobuf.CodedOutputStream.computeMessageSize(35, this.getOutputFormats.get(i16));
            }
            if ((this.Camera2StreamConfigurationMap & 1024) == 1024) {
                size += kotlin.reflect.jvm.internal.impl.protobuf.CodedOutputStream.computeMessageSize(40, this.getOutputSizes);
            }
            if ((this.Camera2StreamConfigurationMap & 2048) == 2048) {
                size += kotlin.reflect.jvm.internal.impl.protobuf.CodedOutputStream.computeMessageSize(41, this.CoroutineDebuggingKt);
            }
            int extensionsSerializedSize = size + extensionsSerializedSize() + this._CREATION.size();
            this.getValidOutputFormatsForInputhNQ4ISI = extensionsSerializedSize;
            return extensionsSerializedSize;
        }

        public static kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Property.Builder newBuilder() {
            return kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Property.Builder.getHighResolutionOutputSizeshNQ4ISI();
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.MessageLite
        public final kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Property.Builder newBuilderForType() {
            return newBuilder();
        }

        public static kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Property.Builder newBuilder(kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Property property) {
            return newBuilder().mergeFrom(property);
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.MessageLite
        public final kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Property.Builder toBuilder() {
            return newBuilder(this);
        }

        public static final class Builder extends kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite.ExtendableBuilder<kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Property, kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Property.Builder> implements kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.PropertyOrBuilder {
            private int accessartificialFrame;
            private int getHighSpeedVideoSizes;
            private int getOutputMinFrameDurationlomOqCM;
            private int getOutputSizeshNQ4ISI;
            private int getValidOutputFormatsForInputhNQ4ISI;
            private int toString;
            private int getHighSpeedVideoSizesFor = my.com.softspace.ssfasstapsdk.pog.AttestationPOG.POGStatusCodes.RST_POG_CERTIFICATE_NOT_FOUND;
            private int getOutputSizes = 2054;
            private kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Type isOutputSupportedForhNQ4ISI = kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Type.getDefaultInstance();
            private java.util.List<kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.TypeParameter> ArtificialStackFrames = java.util.Collections.emptyList();
            private kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Type unwrapAs = kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Type.getDefaultInstance();
            private java.util.List<kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Type> getOutputFormats = java.util.Collections.emptyList();
            private java.util.List<java.lang.Integer> getInputSizeshNQ4ISI = java.util.Collections.emptyList();
            private java.util.List<kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.ValueParameter> getHighSpeedVideoFpsRangesFor = java.util.Collections.emptyList();
            private kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.ValueParameter coroutineBoundary = kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.ValueParameter.getDefaultInstance();
            private java.util.List<java.lang.Integer> coroutineCreation = java.util.Collections.emptyList();
            private java.util.List<kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.CompilerPluginData> getHighResolutionOutputSizeshNQ4ISI = java.util.Collections.emptyList();
            private java.util.List<kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Annotation> Camera2StreamConfigurationMap = java.util.Collections.emptyList();
            private java.util.List<kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Annotation> getOutputStallDuration = java.util.Collections.emptyList();
            private java.util.List<kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Annotation> isOutputSupportedFor = java.util.Collections.emptyList();
            private java.util.List<kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Annotation> getOutputMinFrameDuration = java.util.Collections.emptyList();
            private java.util.List<kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Annotation> getHighSpeedVideoFpsRanges = java.util.Collections.emptyList();
            private java.util.List<kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Annotation> getInputFormats = java.util.Collections.emptyList();
            private kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Contract getOutputStallDurationlomOqCM = kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Contract.getDefaultInstance();
            private kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Contract CoroutineDebuggingKt = kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Contract.getDefaultInstance();

            private Builder() {
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite.Builder, kotlin.reflect.jvm.internal.impl.protobuf.MessageLiteOrBuilder
            public final kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Property getDefaultInstanceForType() {
                return kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Property.getDefaultInstance();
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.MessageLite.Builder
            public final kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Property build() {
                kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Property buildPartial = buildPartial();
                if (buildPartial.isInitialized()) {
                    return buildPartial;
                }
                throw newUninitializedMessageException(buildPartial);
            }

            /* JADX WARN: Multi-variable type inference failed */
            public final kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Property buildPartial() {
                kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Property property = new kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Property((kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite.ExtendableBuilder) this, (byte) (0 == true ? 1 : 0));
                int i = this.getHighSpeedVideoSizes;
                int i2 = (i & 1) == 1 ? 1 : 0;
                property.getOutputSizeshNQ4ISI = this.getHighSpeedVideoSizesFor;
                if ((i & 2) == 2) {
                    i2 |= 2;
                }
                property.isOutputSupportedFor = this.getOutputSizes;
                if ((i & 4) == 4) {
                    i2 |= 4;
                }
                property.unwrapAs = this.getOutputMinFrameDurationlomOqCM;
                if ((i & 8) == 8) {
                    i2 |= 8;
                }
                property.coroutineCreation = this.isOutputSupportedForhNQ4ISI;
                if ((i & 16) == 16) {
                    i2 |= 16;
                }
                property.coroutineBoundary = this.getValidOutputFormatsForInputhNQ4ISI;
                if ((this.getHighSpeedVideoSizes & 32) == 32) {
                    this.ArtificialStackFrames = java.util.Collections.unmodifiableList(this.ArtificialStackFrames);
                    this.getHighSpeedVideoSizes &= -33;
                }
                property.f6921a = this.ArtificialStackFrames;
                if ((i & 64) == 64) {
                    i2 |= 32;
                }
                property.accessartificialFrame = this.unwrapAs;
                if ((i & 128) == 128) {
                    i2 |= 64;
                }
                property.toString = this.toString;
                if ((this.getHighSpeedVideoSizes & 256) == 256) {
                    this.getOutputFormats = java.util.Collections.unmodifiableList(this.getOutputFormats);
                    this.getHighSpeedVideoSizes &= -257;
                }
                property.getHighSpeedVideoSizesFor = this.getOutputFormats;
                if ((this.getHighSpeedVideoSizes & 512) == 512) {
                    this.getInputSizeshNQ4ISI = java.util.Collections.unmodifiableList(this.getInputSizeshNQ4ISI);
                    this.getHighSpeedVideoSizes &= -513;
                }
                property.getOutputMinFrameDuration = this.getInputSizeshNQ4ISI;
                if ((this.getHighSpeedVideoSizes & 1024) == 1024) {
                    this.getHighSpeedVideoFpsRangesFor = java.util.Collections.unmodifiableList(this.getHighSpeedVideoFpsRangesFor);
                    this.getHighSpeedVideoSizes &= -1025;
                }
                property.getInputFormats = this.getHighSpeedVideoFpsRangesFor;
                if ((i & 2048) == 2048) {
                    i2 |= 128;
                }
                property.getARTIFICIAL_FRAME_PACKAGE_NAME = this.coroutineBoundary;
                if ((i & 4096) == 4096) {
                    i2 |= 256;
                }
                property.getOutputStallDuration = this.getOutputSizeshNQ4ISI;
                if ((i & 8192) == 8192) {
                    i2 |= 512;
                }
                property.b = this.accessartificialFrame;
                if ((this.getHighSpeedVideoSizes & 16384) == 16384) {
                    this.coroutineCreation = java.util.Collections.unmodifiableList(this.coroutineCreation);
                    this.getHighSpeedVideoSizes &= -16385;
                }
                property._BOUNDARY = this.coroutineCreation;
                if ((this.getHighSpeedVideoSizes & 32768) == 32768) {
                    this.getHighResolutionOutputSizeshNQ4ISI = java.util.Collections.unmodifiableList(this.getHighResolutionOutputSizeshNQ4ISI);
                    this.getHighSpeedVideoSizes &= -32769;
                }
                property.getHighResolutionOutputSizeshNQ4ISI = this.getHighResolutionOutputSizeshNQ4ISI;
                if ((this.getHighSpeedVideoSizes & 65536) == 65536) {
                    this.Camera2StreamConfigurationMap = java.util.Collections.unmodifiableList(this.Camera2StreamConfigurationMap);
                    this.getHighSpeedVideoSizes &= -65537;
                }
                property.getHighSpeedVideoSizes = this.Camera2StreamConfigurationMap;
                if ((this.getHighSpeedVideoSizes & 131072) == 131072) {
                    this.getOutputStallDuration = java.util.Collections.unmodifiableList(this.getOutputStallDuration);
                    this.getHighSpeedVideoSizes &= -131073;
                }
                property.getOutputStallDurationlomOqCM = this.getOutputStallDuration;
                if ((this.getHighSpeedVideoSizes & 262144) == 262144) {
                    this.isOutputSupportedFor = java.util.Collections.unmodifiableList(this.isOutputSupportedFor);
                    this.getHighSpeedVideoSizes &= -262145;
                }
                property.ArtificialStackFrames = this.isOutputSupportedFor;
                if ((this.getHighSpeedVideoSizes & 524288) == 524288) {
                    this.getOutputMinFrameDuration = java.util.Collections.unmodifiableList(this.getOutputMinFrameDuration);
                    this.getHighSpeedVideoSizes &= -524289;
                }
                property.getOutputMinFrameDurationlomOqCM = this.getOutputMinFrameDuration;
                if ((this.getHighSpeedVideoSizes & 1048576) == 1048576) {
                    this.getHighSpeedVideoFpsRanges = java.util.Collections.unmodifiableList(this.getHighSpeedVideoFpsRanges);
                    this.getHighSpeedVideoSizes &= -1048577;
                }
                property.getHighSpeedVideoFpsRangesFor = this.getHighSpeedVideoFpsRanges;
                if ((this.getHighSpeedVideoSizes & 2097152) == 2097152) {
                    this.getInputFormats = java.util.Collections.unmodifiableList(this.getInputFormats);
                    this.getHighSpeedVideoSizes &= -2097153;
                }
                property.getOutputFormats = this.getInputFormats;
                if ((4194304 & i) == 4194304) {
                    i2 |= 1024;
                }
                property.getOutputSizes = this.getOutputStallDurationlomOqCM;
                if ((i & 8388608) == 8388608) {
                    i2 |= 2048;
                }
                property.CoroutineDebuggingKt = this.CoroutineDebuggingKt;
                property.Camera2StreamConfigurationMap = i2;
                return property;
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite.Builder
            public final kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Property.Builder mergeFrom(kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Property property) {
                if (property == kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Property.getDefaultInstance()) {
                    return this;
                }
                if (property.hasFlags()) {
                    setFlags(property.getFlags());
                }
                if (property.hasOldFlags()) {
                    setOldFlags(property.getOldFlags());
                }
                if (property.hasName()) {
                    setName(property.getName());
                }
                if (property.hasReturnType()) {
                    mergeReturnType(property.getReturnType());
                }
                if (property.hasReturnTypeId()) {
                    setReturnTypeId(property.getReturnTypeId());
                }
                if (!property.f6921a.isEmpty()) {
                    if (this.ArtificialStackFrames.isEmpty()) {
                        this.ArtificialStackFrames = property.f6921a;
                        this.getHighSpeedVideoSizes &= -33;
                    } else {
                        getInputSizeshNQ4ISI();
                        this.ArtificialStackFrames.addAll(property.f6921a);
                    }
                }
                if (property.hasReceiverType()) {
                    mergeReceiverType(property.getReceiverType());
                }
                if (property.hasReceiverTypeId()) {
                    setReceiverTypeId(property.getReceiverTypeId());
                }
                if (!property.getHighSpeedVideoSizesFor.isEmpty()) {
                    if (this.getOutputFormats.isEmpty()) {
                        this.getOutputFormats = property.getHighSpeedVideoSizesFor;
                        this.getHighSpeedVideoSizes &= -257;
                    } else {
                        getHighSpeedVideoSizes();
                        this.getOutputFormats.addAll(property.getHighSpeedVideoSizesFor);
                    }
                }
                if (!property.getOutputMinFrameDuration.isEmpty()) {
                    if (this.getInputSizeshNQ4ISI.isEmpty()) {
                        this.getInputSizeshNQ4ISI = property.getOutputMinFrameDuration;
                        this.getHighSpeedVideoSizes &= -513;
                    } else {
                        if ((this.getHighSpeedVideoSizes & 512) != 512) {
                            this.getInputSizeshNQ4ISI = new java.util.ArrayList(this.getInputSizeshNQ4ISI);
                            this.getHighSpeedVideoSizes |= 512;
                        }
                        this.getInputSizeshNQ4ISI.addAll(property.getOutputMinFrameDuration);
                    }
                }
                if (!property.getInputFormats.isEmpty()) {
                    if (this.getHighSpeedVideoFpsRangesFor.isEmpty()) {
                        this.getHighSpeedVideoFpsRangesFor = property.getInputFormats;
                        this.getHighSpeedVideoSizes &= -1025;
                    } else {
                        getHighSpeedVideoFpsRanges();
                        this.getHighSpeedVideoFpsRangesFor.addAll(property.getInputFormats);
                    }
                }
                if (property.hasSetterValueParameter()) {
                    mergeSetterValueParameter(property.getSetterValueParameter());
                }
                if (property.hasGetterFlags()) {
                    setGetterFlags(property.getGetterFlags());
                }
                if (property.hasSetterFlags()) {
                    setSetterFlags(property.getSetterFlags());
                }
                if (!property._BOUNDARY.isEmpty()) {
                    if (this.coroutineCreation.isEmpty()) {
                        this.coroutineCreation = property._BOUNDARY;
                        this.getHighSpeedVideoSizes &= -16385;
                    } else {
                        getOutputStallDuration();
                        this.coroutineCreation.addAll(property._BOUNDARY);
                    }
                }
                if (!property.getHighResolutionOutputSizeshNQ4ISI.isEmpty()) {
                    if (this.getHighResolutionOutputSizeshNQ4ISI.isEmpty()) {
                        this.getHighResolutionOutputSizeshNQ4ISI = property.getHighResolutionOutputSizeshNQ4ISI;
                        this.getHighSpeedVideoSizes &= -32769;
                    } else {
                        if ((this.getHighSpeedVideoSizes & 32768) != 32768) {
                            this.getHighResolutionOutputSizeshNQ4ISI = new java.util.ArrayList(this.getHighResolutionOutputSizeshNQ4ISI);
                            this.getHighSpeedVideoSizes |= 32768;
                        }
                        this.getHighResolutionOutputSizeshNQ4ISI.addAll(property.getHighResolutionOutputSizeshNQ4ISI);
                    }
                }
                if (!property.getHighSpeedVideoSizes.isEmpty()) {
                    if (this.Camera2StreamConfigurationMap.isEmpty()) {
                        this.Camera2StreamConfigurationMap = property.getHighSpeedVideoSizes;
                        this.getHighSpeedVideoSizes &= -65537;
                    } else {
                        getHighSpeedVideoFpsRangesFor();
                        this.Camera2StreamConfigurationMap.addAll(property.getHighSpeedVideoSizes);
                    }
                }
                if (!property.getOutputStallDurationlomOqCM.isEmpty()) {
                    if (this.getOutputStallDuration.isEmpty()) {
                        this.getOutputStallDuration = property.getOutputStallDurationlomOqCM;
                        this.getHighSpeedVideoSizes &= -131073;
                    } else {
                        getInputFormats();
                        this.getOutputStallDuration.addAll(property.getOutputStallDurationlomOqCM);
                    }
                }
                if (!property.ArtificialStackFrames.isEmpty()) {
                    if (this.isOutputSupportedFor.isEmpty()) {
                        this.isOutputSupportedFor = property.ArtificialStackFrames;
                        this.getHighSpeedVideoSizes &= -262145;
                    } else {
                        getOutputFormats();
                        this.isOutputSupportedFor.addAll(property.ArtificialStackFrames);
                    }
                }
                if (!property.getOutputMinFrameDurationlomOqCM.isEmpty()) {
                    if (this.getOutputMinFrameDuration.isEmpty()) {
                        this.getOutputMinFrameDuration = property.getOutputMinFrameDurationlomOqCM;
                        this.getHighSpeedVideoSizes &= -524289;
                    } else {
                        getHighSpeedVideoSizesFor();
                        this.getOutputMinFrameDuration.addAll(property.getOutputMinFrameDurationlomOqCM);
                    }
                }
                if (!property.getHighSpeedVideoFpsRangesFor.isEmpty()) {
                    if (this.getHighSpeedVideoFpsRanges.isEmpty()) {
                        this.getHighSpeedVideoFpsRanges = property.getHighSpeedVideoFpsRangesFor;
                        this.getHighSpeedVideoSizes &= -1048577;
                    } else {
                        Camera2StreamConfigurationMap();
                        this.getHighSpeedVideoFpsRanges.addAll(property.getHighSpeedVideoFpsRangesFor);
                    }
                }
                if (!property.getOutputFormats.isEmpty()) {
                    if (this.getInputFormats.isEmpty()) {
                        this.getInputFormats = property.getOutputFormats;
                        this.getHighSpeedVideoSizes &= -2097153;
                    } else {
                        getOutputMinFrameDuration();
                        this.getInputFormats.addAll(property.getOutputFormats);
                    }
                }
                if (property.hasGetterContract()) {
                    mergeGetterContract(property.getGetterContract());
                }
                if (property.hasSetterContract()) {
                    mergeSetterContract(property.getSetterContract());
                }
                mergeExtensionFields(property);
                setUnknownFields(getUnknownFields().concat(property._CREATION));
                return this;
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.MessageLiteOrBuilder
            public final boolean isInitialized() {
                if (!hasName()) {
                    return false;
                }
                if (hasReturnType() && !getReturnType().isInitialized()) {
                    return false;
                }
                for (int i = 0; i < getTypeParameterCount(); i++) {
                    if (!getTypeParameter(i).isInitialized()) {
                        return false;
                    }
                }
                if (hasReceiverType() && !getReceiverType().isInitialized()) {
                    return false;
                }
                for (int i2 = 0; i2 < getContextReceiverTypeCount(); i2++) {
                    if (!getContextReceiverType(i2).isInitialized()) {
                        return false;
                    }
                }
                for (int i3 = 0; i3 < getContextParameterCount(); i3++) {
                    if (!getContextParameter(i3).isInitialized()) {
                        return false;
                    }
                }
                if (hasSetterValueParameter() && !getSetterValueParameter().isInitialized()) {
                    return false;
                }
                for (int i4 = 0; i4 < getCompilerPluginDataCount(); i4++) {
                    if (!getCompilerPluginData(i4).isInitialized()) {
                        return false;
                    }
                }
                for (int i5 = 0; i5 < getAnnotationCount(); i5++) {
                    if (!getAnnotation(i5).isInitialized()) {
                        return false;
                    }
                }
                for (int i6 = 0; i6 < getGetterAnnotationCount(); i6++) {
                    if (!getGetterAnnotation(i6).isInitialized()) {
                        return false;
                    }
                }
                for (int i7 = 0; i7 < getSetterAnnotationCount(); i7++) {
                    if (!getSetterAnnotation(i7).isInitialized()) {
                        return false;
                    }
                }
                for (int i8 = 0; i8 < getExtensionReceiverAnnotationCount(); i8++) {
                    if (!getExtensionReceiverAnnotation(i8).isInitialized()) {
                        return false;
                    }
                }
                for (int i9 = 0; i9 < getBackingFieldAnnotationCount(); i9++) {
                    if (!getBackingFieldAnnotation(i9).isInitialized()) {
                        return false;
                    }
                }
                for (int i10 = 0; i10 < getDelegateFieldAnnotationCount(); i10++) {
                    if (!getDelegateFieldAnnotation(i10).isInitialized()) {
                        return false;
                    }
                }
                if (!hasGetterContract() || getGetterContract().isInitialized()) {
                    return (!hasSetterContract() || getSetterContract().isInitialized()) && extensionsAreInitialized();
                }
                return false;
            }

            /* JADX WARN: Removed duplicated region for block: B:15:0x001d  */
            @Override // kotlin.reflect.jvm.internal.impl.protobuf.AbstractMessageLite.Builder, kotlin.reflect.jvm.internal.impl.protobuf.MessageLite.Builder
            /*
                Code decompiled incorrectly, please refer to instructions dump.
            */
            public final kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Property.Builder mergeFrom(kotlin.reflect.jvm.internal.impl.protobuf.CodedInputStream codedInputStream, kotlin.reflect.jvm.internal.impl.protobuf.ExtensionRegistryLite extensionRegistryLite) throws java.io.IOException {
                kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Property property;
                try {
                    try {
                        kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Property parsePartialFrom = kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Property.PARSER.parsePartialFrom(codedInputStream, extensionRegistryLite);
                        if (parsePartialFrom != null) {
                            mergeFrom(parsePartialFrom);
                        }
                        return this;
                    } catch (kotlin.reflect.jvm.internal.impl.protobuf.InvalidProtocolBufferException e) {
                        property = (kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Property) e.getUnfinishedMessage();
                        try {
                            throw e;
                        } catch (java.lang.Throwable th) {
                            th = th;
                            if (property != null) {
                                mergeFrom(property);
                            }
                            throw th;
                        }
                    }
                } catch (java.lang.Throwable th2) {
                    th = th2;
                    property = null;
                    if (property != null) {
                    }
                    throw th;
                }
            }

            public final kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Property.Builder setFlags(int i) {
                this.getHighSpeedVideoSizes |= 1;
                this.getHighSpeedVideoSizesFor = i;
                return this;
            }

            public final kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Property.Builder setOldFlags(int i) {
                this.getHighSpeedVideoSizes |= 2;
                this.getOutputSizes = i;
                return this;
            }

            public final boolean hasName() {
                return (this.getHighSpeedVideoSizes & 4) == 4;
            }

            public final kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Property.Builder setName(int i) {
                this.getHighSpeedVideoSizes |= 4;
                this.getOutputMinFrameDurationlomOqCM = i;
                return this;
            }

            public final boolean hasReturnType() {
                return (this.getHighSpeedVideoSizes & 8) == 8;
            }

            public final kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Type getReturnType() {
                return this.isOutputSupportedForhNQ4ISI;
            }

            public final kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Property.Builder setReturnType(kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Type type) {
                this.isOutputSupportedForhNQ4ISI = type;
                this.getHighSpeedVideoSizes |= 8;
                return this;
            }

            public final kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Property.Builder mergeReturnType(kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Type type) {
                if ((this.getHighSpeedVideoSizes & 8) == 8 && this.isOutputSupportedForhNQ4ISI != kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Type.getDefaultInstance()) {
                    this.isOutputSupportedForhNQ4ISI = kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Type.newBuilder(this.isOutputSupportedForhNQ4ISI).mergeFrom(type).buildPartial();
                } else {
                    this.isOutputSupportedForhNQ4ISI = type;
                }
                this.getHighSpeedVideoSizes |= 8;
                return this;
            }

            public final kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Property.Builder setReturnTypeId(int i) {
                this.getHighSpeedVideoSizes |= 16;
                this.getValidOutputFormatsForInputhNQ4ISI = i;
                return this;
            }

            private void getInputSizeshNQ4ISI() {
                if ((this.getHighSpeedVideoSizes & 32) != 32) {
                    this.ArtificialStackFrames = new java.util.ArrayList(this.ArtificialStackFrames);
                    this.getHighSpeedVideoSizes |= 32;
                }
            }

            public final int getTypeParameterCount() {
                return this.ArtificialStackFrames.size();
            }

            public final kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.TypeParameter getTypeParameter(int i) {
                return this.ArtificialStackFrames.get(i);
            }

            public final kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Property.Builder addTypeParameter(kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.TypeParameter typeParameter) {
                getInputSizeshNQ4ISI();
                this.ArtificialStackFrames.add(typeParameter);
                return this;
            }

            public final boolean hasReceiverType() {
                return (this.getHighSpeedVideoSizes & 64) == 64;
            }

            public final kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Type getReceiverType() {
                return this.unwrapAs;
            }

            public final kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Property.Builder setReceiverType(kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Type type) {
                this.unwrapAs = type;
                this.getHighSpeedVideoSizes |= 64;
                return this;
            }

            public final kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Property.Builder mergeReceiverType(kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Type type) {
                if ((this.getHighSpeedVideoSizes & 64) == 64 && this.unwrapAs != kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Type.getDefaultInstance()) {
                    this.unwrapAs = kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Type.newBuilder(this.unwrapAs).mergeFrom(type).buildPartial();
                } else {
                    this.unwrapAs = type;
                }
                this.getHighSpeedVideoSizes |= 64;
                return this;
            }

            public final kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Property.Builder setReceiverTypeId(int i) {
                this.getHighSpeedVideoSizes |= 128;
                this.toString = i;
                return this;
            }

            private void getHighSpeedVideoSizes() {
                if ((this.getHighSpeedVideoSizes & 256) != 256) {
                    this.getOutputFormats = new java.util.ArrayList(this.getOutputFormats);
                    this.getHighSpeedVideoSizes |= 256;
                }
            }

            public final int getContextReceiverTypeCount() {
                return this.getOutputFormats.size();
            }

            public final kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Type getContextReceiverType(int i) {
                return this.getOutputFormats.get(i);
            }

            public final kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Property.Builder addAllContextReceiverType(java.lang.Iterable<? extends kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Type> iterable) {
                getHighSpeedVideoSizes();
                kotlin.reflect.jvm.internal.impl.protobuf.AbstractMessageLite.Builder.addAll(iterable, this.getOutputFormats);
                return this;
            }

            private void getHighSpeedVideoFpsRanges() {
                if ((this.getHighSpeedVideoSizes & 1024) != 1024) {
                    this.getHighSpeedVideoFpsRangesFor = new java.util.ArrayList(this.getHighSpeedVideoFpsRangesFor);
                    this.getHighSpeedVideoSizes |= 1024;
                }
            }

            public final int getContextParameterCount() {
                return this.getHighSpeedVideoFpsRangesFor.size();
            }

            public final kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.ValueParameter getContextParameter(int i) {
                return this.getHighSpeedVideoFpsRangesFor.get(i);
            }

            public final kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Property.Builder addAllContextParameter(java.lang.Iterable<? extends kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.ValueParameter> iterable) {
                getHighSpeedVideoFpsRanges();
                kotlin.reflect.jvm.internal.impl.protobuf.AbstractMessageLite.Builder.addAll(iterable, this.getHighSpeedVideoFpsRangesFor);
                return this;
            }

            public final boolean hasSetterValueParameter() {
                return (this.getHighSpeedVideoSizes & 2048) == 2048;
            }

            public final kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.ValueParameter getSetterValueParameter() {
                return this.coroutineBoundary;
            }

            public final kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Property.Builder setSetterValueParameter(kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.ValueParameter valueParameter) {
                this.coroutineBoundary = valueParameter;
                this.getHighSpeedVideoSizes |= 2048;
                return this;
            }

            public final kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Property.Builder mergeSetterValueParameter(kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.ValueParameter valueParameter) {
                if ((this.getHighSpeedVideoSizes & 2048) == 2048 && this.coroutineBoundary != kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.ValueParameter.getDefaultInstance()) {
                    this.coroutineBoundary = kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.ValueParameter.newBuilder(this.coroutineBoundary).mergeFrom(valueParameter).buildPartial();
                } else {
                    this.coroutineBoundary = valueParameter;
                }
                this.getHighSpeedVideoSizes |= 2048;
                return this;
            }

            public final kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Property.Builder setGetterFlags(int i) {
                this.getHighSpeedVideoSizes |= 4096;
                this.getOutputSizeshNQ4ISI = i;
                return this;
            }

            public final kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Property.Builder setSetterFlags(int i) {
                this.getHighSpeedVideoSizes |= 8192;
                this.accessartificialFrame = i;
                return this;
            }

            private void getOutputStallDuration() {
                if ((this.getHighSpeedVideoSizes & 16384) != 16384) {
                    this.coroutineCreation = new java.util.ArrayList(this.coroutineCreation);
                    this.getHighSpeedVideoSizes |= 16384;
                }
            }

            public final kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Property.Builder addAllVersionRequirement(java.lang.Iterable<? extends java.lang.Integer> iterable) {
                getOutputStallDuration();
                kotlin.reflect.jvm.internal.impl.protobuf.AbstractMessageLite.Builder.addAll(iterable, this.coroutineCreation);
                return this;
            }

            public final int getCompilerPluginDataCount() {
                return this.getHighResolutionOutputSizeshNQ4ISI.size();
            }

            public final kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.CompilerPluginData getCompilerPluginData(int i) {
                return this.getHighResolutionOutputSizeshNQ4ISI.get(i);
            }

            private void getHighSpeedVideoFpsRangesFor() {
                if ((this.getHighSpeedVideoSizes & 65536) != 65536) {
                    this.Camera2StreamConfigurationMap = new java.util.ArrayList(this.Camera2StreamConfigurationMap);
                    this.getHighSpeedVideoSizes |= 65536;
                }
            }

            public final int getAnnotationCount() {
                return this.Camera2StreamConfigurationMap.size();
            }

            public final kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Annotation getAnnotation(int i) {
                return this.Camera2StreamConfigurationMap.get(i);
            }

            public final kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Property.Builder addAllAnnotation(java.lang.Iterable<? extends kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Annotation> iterable) {
                getHighSpeedVideoFpsRangesFor();
                kotlin.reflect.jvm.internal.impl.protobuf.AbstractMessageLite.Builder.addAll(iterable, this.Camera2StreamConfigurationMap);
                return this;
            }

            private void getInputFormats() {
                if ((this.getHighSpeedVideoSizes & 131072) != 131072) {
                    this.getOutputStallDuration = new java.util.ArrayList(this.getOutputStallDuration);
                    this.getHighSpeedVideoSizes |= 131072;
                }
            }

            public final int getGetterAnnotationCount() {
                return this.getOutputStallDuration.size();
            }

            public final kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Annotation getGetterAnnotation(int i) {
                return this.getOutputStallDuration.get(i);
            }

            public final kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Property.Builder addAllGetterAnnotation(java.lang.Iterable<? extends kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Annotation> iterable) {
                getInputFormats();
                kotlin.reflect.jvm.internal.impl.protobuf.AbstractMessageLite.Builder.addAll(iterable, this.getOutputStallDuration);
                return this;
            }

            private void getOutputFormats() {
                if ((this.getHighSpeedVideoSizes & 262144) != 262144) {
                    this.isOutputSupportedFor = new java.util.ArrayList(this.isOutputSupportedFor);
                    this.getHighSpeedVideoSizes |= 262144;
                }
            }

            public final int getSetterAnnotationCount() {
                return this.isOutputSupportedFor.size();
            }

            public final kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Annotation getSetterAnnotation(int i) {
                return this.isOutputSupportedFor.get(i);
            }

            public final kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Property.Builder addAllSetterAnnotation(java.lang.Iterable<? extends kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Annotation> iterable) {
                getOutputFormats();
                kotlin.reflect.jvm.internal.impl.protobuf.AbstractMessageLite.Builder.addAll(iterable, this.isOutputSupportedFor);
                return this;
            }

            private void getHighSpeedVideoSizesFor() {
                if ((this.getHighSpeedVideoSizes & 524288) != 524288) {
                    this.getOutputMinFrameDuration = new java.util.ArrayList(this.getOutputMinFrameDuration);
                    this.getHighSpeedVideoSizes |= 524288;
                }
            }

            public final int getExtensionReceiverAnnotationCount() {
                return this.getOutputMinFrameDuration.size();
            }

            public final kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Annotation getExtensionReceiverAnnotation(int i) {
                return this.getOutputMinFrameDuration.get(i);
            }

            public final kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Property.Builder addAllExtensionReceiverAnnotation(java.lang.Iterable<? extends kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Annotation> iterable) {
                getHighSpeedVideoSizesFor();
                kotlin.reflect.jvm.internal.impl.protobuf.AbstractMessageLite.Builder.addAll(iterable, this.getOutputMinFrameDuration);
                return this;
            }

            private void Camera2StreamConfigurationMap() {
                if ((this.getHighSpeedVideoSizes & 1048576) != 1048576) {
                    this.getHighSpeedVideoFpsRanges = new java.util.ArrayList(this.getHighSpeedVideoFpsRanges);
                    this.getHighSpeedVideoSizes |= 1048576;
                }
            }

            public final int getBackingFieldAnnotationCount() {
                return this.getHighSpeedVideoFpsRanges.size();
            }

            public final kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Annotation getBackingFieldAnnotation(int i) {
                return this.getHighSpeedVideoFpsRanges.get(i);
            }

            public final kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Property.Builder addAllBackingFieldAnnotation(java.lang.Iterable<? extends kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Annotation> iterable) {
                Camera2StreamConfigurationMap();
                kotlin.reflect.jvm.internal.impl.protobuf.AbstractMessageLite.Builder.addAll(iterable, this.getHighSpeedVideoFpsRanges);
                return this;
            }

            private void getOutputMinFrameDuration() {
                if ((this.getHighSpeedVideoSizes & 2097152) != 2097152) {
                    this.getInputFormats = new java.util.ArrayList(this.getInputFormats);
                    this.getHighSpeedVideoSizes |= 2097152;
                }
            }

            public final int getDelegateFieldAnnotationCount() {
                return this.getInputFormats.size();
            }

            public final kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Annotation getDelegateFieldAnnotation(int i) {
                return this.getInputFormats.get(i);
            }

            public final kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Property.Builder addAllDelegateFieldAnnotation(java.lang.Iterable<? extends kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Annotation> iterable) {
                getOutputMinFrameDuration();
                kotlin.reflect.jvm.internal.impl.protobuf.AbstractMessageLite.Builder.addAll(iterable, this.getInputFormats);
                return this;
            }

            public final boolean hasGetterContract() {
                return (this.getHighSpeedVideoSizes & 4194304) == 4194304;
            }

            public final kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Contract getGetterContract() {
                return this.getOutputStallDurationlomOqCM;
            }

            public final kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Property.Builder mergeGetterContract(kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Contract contract) {
                if ((this.getHighSpeedVideoSizes & 4194304) == 4194304 && this.getOutputStallDurationlomOqCM != kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Contract.getDefaultInstance()) {
                    this.getOutputStallDurationlomOqCM = kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Contract.newBuilder(this.getOutputStallDurationlomOqCM).mergeFrom(contract).buildPartial();
                } else {
                    this.getOutputStallDurationlomOqCM = contract;
                }
                this.getHighSpeedVideoSizes |= 4194304;
                return this;
            }

            public final boolean hasSetterContract() {
                return (this.getHighSpeedVideoSizes & 8388608) == 8388608;
            }

            public final kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Contract getSetterContract() {
                return this.CoroutineDebuggingKt;
            }

            public final kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Property.Builder mergeSetterContract(kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Contract contract) {
                if ((this.getHighSpeedVideoSizes & 8388608) == 8388608 && this.CoroutineDebuggingKt != kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Contract.getDefaultInstance()) {
                    this.CoroutineDebuggingKt = kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Contract.newBuilder(this.CoroutineDebuggingKt).mergeFrom(contract).buildPartial();
                } else {
                    this.CoroutineDebuggingKt = contract;
                }
                this.getHighSpeedVideoSizes |= 8388608;
                return this;
            }

            static /* synthetic */ kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Property.Builder getHighResolutionOutputSizeshNQ4ISI() {
                return new kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Property.Builder();
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite.ExtendableBuilder, kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite.Builder, kotlin.reflect.jvm.internal.impl.protobuf.AbstractMessageLite.Builder
            /* renamed from: clone */
            public final kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Property.Builder mo23897clone() {
                return new kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Property.Builder().mergeFrom(buildPartial());
            }
        }
    }

    public static final class ValueParameter extends kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite.ExtendableMessage<kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.ValueParameter> implements kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.ValueParameterOrBuilder {
        public static kotlin.reflect.jvm.internal.impl.protobuf.Parser<kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.ValueParameter> PARSER = new kotlin.reflect.jvm.internal.impl.protobuf.AbstractParser<kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.ValueParameter>() { // from class: kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.ValueParameter.1
            @Override // kotlin.reflect.jvm.internal.impl.protobuf.Parser
            public final /* synthetic */ java.lang.Object parsePartialFrom(kotlin.reflect.jvm.internal.impl.protobuf.CodedInputStream codedInputStream, kotlin.reflect.jvm.internal.impl.protobuf.ExtensionRegistryLite extensionRegistryLite) throws kotlin.reflect.jvm.internal.impl.protobuf.InvalidProtocolBufferException {
                return new kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.ValueParameter(codedInputStream, extensionRegistryLite, (byte) 0);
            }
        };
        private static final kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.ValueParameter getHighSpeedVideoFpsRanges;
        private int Camera2StreamConfigurationMap;
        private java.util.List<kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Annotation> getHighResolutionOutputSizeshNQ4ISI;
        private kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Annotation.Argument.Value getHighSpeedVideoFpsRangesFor;
        private int getHighSpeedVideoSizes;
        private int getHighSpeedVideoSizesFor;
        private int getInputFormats;
        private byte getInputSizeshNQ4ISI;
        private int getOutputFormats;
        private kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Type getOutputMinFrameDuration;
        private kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Type getOutputMinFrameDurationlomOqCM;
        private int getOutputSizeshNQ4ISI;
        private final kotlin.reflect.jvm.internal.impl.protobuf.ByteString getOutputStallDuration;

        /* synthetic */ ValueParameter(kotlin.reflect.jvm.internal.impl.protobuf.CodedInputStream codedInputStream, kotlin.reflect.jvm.internal.impl.protobuf.ExtensionRegistryLite extensionRegistryLite, byte b) throws kotlin.reflect.jvm.internal.impl.protobuf.InvalidProtocolBufferException {
            this(codedInputStream, extensionRegistryLite);
        }

        /* synthetic */ ValueParameter(kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite.ExtendableBuilder extendableBuilder, byte b) {
            this(extendableBuilder);
        }

        private ValueParameter(kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite.ExtendableBuilder<kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.ValueParameter, ?> extendableBuilder) {
            super(extendableBuilder);
            this.getInputSizeshNQ4ISI = (byte) -1;
            this.getInputFormats = -1;
            this.getOutputStallDuration = extendableBuilder.getUnknownFields();
        }

        private ValueParameter() {
            this.getInputSizeshNQ4ISI = (byte) -1;
            this.getInputFormats = -1;
            this.getOutputStallDuration = kotlin.reflect.jvm.internal.impl.protobuf.ByteString.EMPTY;
        }

        public static kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.ValueParameter getDefaultInstance() {
            return getHighSpeedVideoFpsRanges;
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.MessageLiteOrBuilder
        public final kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.ValueParameter getDefaultInstanceForType() {
            return getHighSpeedVideoFpsRanges;
        }

        /* JADX WARN: Multi-variable type inference failed */
        private ValueParameter(kotlin.reflect.jvm.internal.impl.protobuf.CodedInputStream codedInputStream, kotlin.reflect.jvm.internal.impl.protobuf.ExtensionRegistryLite extensionRegistryLite) throws kotlin.reflect.jvm.internal.impl.protobuf.InvalidProtocolBufferException {
            this.getInputSizeshNQ4ISI = (byte) -1;
            this.getInputFormats = -1;
            getHighSpeedVideoSizes();
            kotlin.reflect.jvm.internal.impl.protobuf.ByteString.Output newOutput = kotlin.reflect.jvm.internal.impl.protobuf.ByteString.newOutput();
            kotlin.reflect.jvm.internal.impl.protobuf.CodedOutputStream newInstance = kotlin.reflect.jvm.internal.impl.protobuf.CodedOutputStream.newInstance(newOutput, 1);
            boolean z = false;
            char c = 0;
            while (!z) {
                try {
                    try {
                        int readTag = codedInputStream.readTag();
                        if (readTag != 0) {
                            if (readTag == 8) {
                                this.Camera2StreamConfigurationMap |= 1;
                                this.getHighSpeedVideoSizes = codedInputStream.readInt32();
                            } else if (readTag != 16) {
                                if (readTag == 26) {
                                    kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Type.Builder builder = (this.Camera2StreamConfigurationMap & 4) == 4 ? this.getOutputMinFrameDuration.toBuilder() : null;
                                    kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Type type = (kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Type) codedInputStream.readMessage(kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Type.PARSER, extensionRegistryLite);
                                    this.getOutputMinFrameDuration = type;
                                    if (builder != null) {
                                        builder.mergeFrom(type);
                                        this.getOutputMinFrameDuration = builder.buildPartial();
                                    }
                                    this.Camera2StreamConfigurationMap |= 4;
                                } else if (readTag == 34) {
                                    kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Type.Builder builder2 = (this.Camera2StreamConfigurationMap & 16) == 16 ? this.getOutputMinFrameDurationlomOqCM.toBuilder() : null;
                                    kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Type type2 = (kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Type) codedInputStream.readMessage(kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Type.PARSER, extensionRegistryLite);
                                    this.getOutputMinFrameDurationlomOqCM = type2;
                                    if (builder2 != null) {
                                        builder2.mergeFrom(type2);
                                        this.getOutputMinFrameDurationlomOqCM = builder2.buildPartial();
                                    }
                                    this.Camera2StreamConfigurationMap |= 16;
                                } else if (readTag == 40) {
                                    this.Camera2StreamConfigurationMap |= 8;
                                    this.getOutputFormats = codedInputStream.readInt32();
                                } else if (readTag == 48) {
                                    this.Camera2StreamConfigurationMap |= 32;
                                    this.getOutputSizeshNQ4ISI = codedInputStream.readInt32();
                                } else if (readTag == 58) {
                                    int i = (c == true ? 1 : 0) & '@';
                                    c = c;
                                    if (i != 64) {
                                        this.getHighResolutionOutputSizeshNQ4ISI = new java.util.ArrayList();
                                        c = '@';
                                    }
                                    this.getHighResolutionOutputSizeshNQ4ISI.add(codedInputStream.readMessage(kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Annotation.PARSER, extensionRegistryLite));
                                } else if (readTag == 66) {
                                    kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Annotation.Argument.Value.Builder builder3 = (this.Camera2StreamConfigurationMap & 64) == 64 ? this.getHighSpeedVideoFpsRangesFor.toBuilder() : null;
                                    kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Annotation.Argument.Value value = (kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Annotation.Argument.Value) codedInputStream.readMessage(kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Annotation.Argument.Value.PARSER, extensionRegistryLite);
                                    this.getHighSpeedVideoFpsRangesFor = value;
                                    if (builder3 != null) {
                                        builder3.mergeFrom(value);
                                        this.getHighSpeedVideoFpsRangesFor = builder3.buildPartial();
                                    }
                                    this.Camera2StreamConfigurationMap |= 64;
                                } else if (!parseUnknownField(codedInputStream, newInstance, extensionRegistryLite, readTag)) {
                                }
                            } else {
                                this.Camera2StreamConfigurationMap |= 2;
                                this.getHighSpeedVideoSizesFor = codedInputStream.readInt32();
                            }
                        }
                        z = true;
                    } catch (java.lang.Throwable th) {
                        if (((c == true ? 1 : 0) & '@') == 64) {
                            this.getHighResolutionOutputSizeshNQ4ISI = java.util.Collections.unmodifiableList(this.getHighResolutionOutputSizeshNQ4ISI);
                        }
                        try {
                            newInstance.flush();
                        } catch (java.io.IOException unused) {
                        } catch (java.lang.Throwable th2) {
                            this.getOutputStallDuration = newOutput.toByteString();
                            throw th2;
                        }
                        this.getOutputStallDuration = newOutput.toByteString();
                        makeExtensionsImmutable();
                        throw th;
                    }
                } catch (kotlin.reflect.jvm.internal.impl.protobuf.InvalidProtocolBufferException e) {
                    throw e.setUnfinishedMessage(this);
                } catch (java.io.IOException e2) {
                    throw new kotlin.reflect.jvm.internal.impl.protobuf.InvalidProtocolBufferException(e2.getMessage()).setUnfinishedMessage(this);
                }
            }
            if (((c == true ? 1 : 0) & '@') == 64) {
                this.getHighResolutionOutputSizeshNQ4ISI = java.util.Collections.unmodifiableList(this.getHighResolutionOutputSizeshNQ4ISI);
            }
            try {
                newInstance.flush();
            } catch (java.io.IOException unused2) {
            } catch (java.lang.Throwable th3) {
                this.getOutputStallDuration = newOutput.toByteString();
                throw th3;
            }
            this.getOutputStallDuration = newOutput.toByteString();
            makeExtensionsImmutable();
        }

        static {
            kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.ValueParameter valueParameter = new kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.ValueParameter();
            getHighSpeedVideoFpsRanges = valueParameter;
            valueParameter.getHighSpeedVideoSizes();
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite, kotlin.reflect.jvm.internal.impl.protobuf.MessageLite
        public final kotlin.reflect.jvm.internal.impl.protobuf.Parser<kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.ValueParameter> getParserForType() {
            return PARSER;
        }

        public final boolean hasFlags() {
            return (this.Camera2StreamConfigurationMap & 1) == 1;
        }

        public final int getFlags() {
            return this.getHighSpeedVideoSizes;
        }

        public final boolean hasName() {
            return (this.Camera2StreamConfigurationMap & 2) == 2;
        }

        public final int getName() {
            return this.getHighSpeedVideoSizesFor;
        }

        public final boolean hasType() {
            return (this.Camera2StreamConfigurationMap & 4) == 4;
        }

        public final kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Type getType() {
            return this.getOutputMinFrameDuration;
        }

        public final boolean hasTypeId() {
            return (this.Camera2StreamConfigurationMap & 8) == 8;
        }

        public final int getTypeId() {
            return this.getOutputFormats;
        }

        public final boolean hasVarargElementType() {
            return (this.Camera2StreamConfigurationMap & 16) == 16;
        }

        public final kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Type getVarargElementType() {
            return this.getOutputMinFrameDurationlomOqCM;
        }

        public final boolean hasVarargElementTypeId() {
            return (this.Camera2StreamConfigurationMap & 32) == 32;
        }

        public final int getVarargElementTypeId() {
            return this.getOutputSizeshNQ4ISI;
        }

        public final java.util.List<kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Annotation> getAnnotationList() {
            return this.getHighResolutionOutputSizeshNQ4ISI;
        }

        public final int getAnnotationCount() {
            return this.getHighResolutionOutputSizeshNQ4ISI.size();
        }

        public final kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Annotation getAnnotation(int i) {
            return this.getHighResolutionOutputSizeshNQ4ISI.get(i);
        }

        public final boolean hasAnnotationParameterDefaultValue() {
            return (this.Camera2StreamConfigurationMap & 64) == 64;
        }

        public final kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Annotation.Argument.Value getAnnotationParameterDefaultValue() {
            return this.getHighSpeedVideoFpsRangesFor;
        }

        private void getHighSpeedVideoSizes() {
            this.getHighSpeedVideoSizes = 0;
            this.getHighSpeedVideoSizesFor = 0;
            this.getOutputMinFrameDuration = kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Type.getDefaultInstance();
            this.getOutputFormats = 0;
            this.getOutputMinFrameDurationlomOqCM = kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Type.getDefaultInstance();
            this.getOutputSizeshNQ4ISI = 0;
            this.getHighResolutionOutputSizeshNQ4ISI = java.util.Collections.emptyList();
            this.getHighSpeedVideoFpsRangesFor = kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Annotation.Argument.Value.getDefaultInstance();
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.MessageLiteOrBuilder
        public final boolean isInitialized() {
            byte b = this.getInputSizeshNQ4ISI;
            if (b == 1) {
                return true;
            }
            if (b == 0) {
                return false;
            }
            if (!hasName()) {
                this.getInputSizeshNQ4ISI = (byte) 0;
                return false;
            }
            if (hasType() && !getType().isInitialized()) {
                this.getInputSizeshNQ4ISI = (byte) 0;
                return false;
            }
            if (hasVarargElementType() && !getVarargElementType().isInitialized()) {
                this.getInputSizeshNQ4ISI = (byte) 0;
                return false;
            }
            for (int i = 0; i < getAnnotationCount(); i++) {
                if (!getAnnotation(i).isInitialized()) {
                    this.getInputSizeshNQ4ISI = (byte) 0;
                    return false;
                }
            }
            if (hasAnnotationParameterDefaultValue() && !getAnnotationParameterDefaultValue().isInitialized()) {
                this.getInputSizeshNQ4ISI = (byte) 0;
                return false;
            }
            if (!extensionsAreInitialized()) {
                this.getInputSizeshNQ4ISI = (byte) 0;
                return false;
            }
            this.getInputSizeshNQ4ISI = (byte) 1;
            return true;
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.MessageLite
        public final void writeTo(kotlin.reflect.jvm.internal.impl.protobuf.CodedOutputStream codedOutputStream) throws java.io.IOException {
            getSerializedSize();
            kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite.ExtendableMessage<MessageType>.ExtensionWriter newExtensionWriter = newExtensionWriter();
            if ((this.Camera2StreamConfigurationMap & 1) == 1) {
                codedOutputStream.writeInt32(1, this.getHighSpeedVideoSizes);
            }
            if ((this.Camera2StreamConfigurationMap & 2) == 2) {
                codedOutputStream.writeInt32(2, this.getHighSpeedVideoSizesFor);
            }
            if ((this.Camera2StreamConfigurationMap & 4) == 4) {
                codedOutputStream.writeMessage(3, this.getOutputMinFrameDuration);
            }
            if ((this.Camera2StreamConfigurationMap & 16) == 16) {
                codedOutputStream.writeMessage(4, this.getOutputMinFrameDurationlomOqCM);
            }
            if ((this.Camera2StreamConfigurationMap & 8) == 8) {
                codedOutputStream.writeInt32(5, this.getOutputFormats);
            }
            if ((this.Camera2StreamConfigurationMap & 32) == 32) {
                codedOutputStream.writeInt32(6, this.getOutputSizeshNQ4ISI);
            }
            for (int i = 0; i < this.getHighResolutionOutputSizeshNQ4ISI.size(); i++) {
                codedOutputStream.writeMessage(7, this.getHighResolutionOutputSizeshNQ4ISI.get(i));
            }
            if ((this.Camera2StreamConfigurationMap & 64) == 64) {
                codedOutputStream.writeMessage(8, this.getHighSpeedVideoFpsRangesFor);
            }
            newExtensionWriter.writeUntil(200, codedOutputStream);
            codedOutputStream.writeRawBytes(this.getOutputStallDuration);
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.MessageLite
        public final int getSerializedSize() {
            int i = this.getInputFormats;
            if (i != -1) {
                return i;
            }
            int computeInt32Size = (this.Camera2StreamConfigurationMap & 1) == 1 ? kotlin.reflect.jvm.internal.impl.protobuf.CodedOutputStream.computeInt32Size(1, this.getHighSpeedVideoSizes) : 0;
            if ((this.Camera2StreamConfigurationMap & 2) == 2) {
                computeInt32Size += kotlin.reflect.jvm.internal.impl.protobuf.CodedOutputStream.computeInt32Size(2, this.getHighSpeedVideoSizesFor);
            }
            if ((this.Camera2StreamConfigurationMap & 4) == 4) {
                computeInt32Size += kotlin.reflect.jvm.internal.impl.protobuf.CodedOutputStream.computeMessageSize(3, this.getOutputMinFrameDuration);
            }
            if ((this.Camera2StreamConfigurationMap & 16) == 16) {
                computeInt32Size += kotlin.reflect.jvm.internal.impl.protobuf.CodedOutputStream.computeMessageSize(4, this.getOutputMinFrameDurationlomOqCM);
            }
            if ((this.Camera2StreamConfigurationMap & 8) == 8) {
                computeInt32Size += kotlin.reflect.jvm.internal.impl.protobuf.CodedOutputStream.computeInt32Size(5, this.getOutputFormats);
            }
            if ((this.Camera2StreamConfigurationMap & 32) == 32) {
                computeInt32Size += kotlin.reflect.jvm.internal.impl.protobuf.CodedOutputStream.computeInt32Size(6, this.getOutputSizeshNQ4ISI);
            }
            for (int i2 = 0; i2 < this.getHighResolutionOutputSizeshNQ4ISI.size(); i2++) {
                computeInt32Size += kotlin.reflect.jvm.internal.impl.protobuf.CodedOutputStream.computeMessageSize(7, this.getHighResolutionOutputSizeshNQ4ISI.get(i2));
            }
            if ((this.Camera2StreamConfigurationMap & 64) == 64) {
                computeInt32Size += kotlin.reflect.jvm.internal.impl.protobuf.CodedOutputStream.computeMessageSize(8, this.getHighSpeedVideoFpsRangesFor);
            }
            int extensionsSerializedSize = computeInt32Size + extensionsSerializedSize() + this.getOutputStallDuration.size();
            this.getInputFormats = extensionsSerializedSize;
            return extensionsSerializedSize;
        }

        public static kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.ValueParameter.Builder newBuilder() {
            return kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.ValueParameter.Builder.getHighSpeedVideoFpsRanges();
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.MessageLite
        public final kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.ValueParameter.Builder newBuilderForType() {
            return newBuilder();
        }

        public static kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.ValueParameter.Builder newBuilder(kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.ValueParameter valueParameter) {
            return newBuilder().mergeFrom(valueParameter);
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.MessageLite
        public final kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.ValueParameter.Builder toBuilder() {
            return newBuilder(this);
        }

        public static final class Builder extends kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite.ExtendableBuilder<kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.ValueParameter, kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.ValueParameter.Builder> implements kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.ValueParameterOrBuilder {
            private int Camera2StreamConfigurationMap;
            private int getHighResolutionOutputSizeshNQ4ISI;
            private int getHighSpeedVideoFpsRanges;
            private int getInputSizeshNQ4ISI;
            private int getOutputFormats;
            private kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Type getHighSpeedVideoSizesFor = kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Type.getDefaultInstance();
            private kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Type getInputFormats = kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Type.getDefaultInstance();
            private java.util.List<kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Annotation> getHighSpeedVideoFpsRangesFor = java.util.Collections.emptyList();
            private kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Annotation.Argument.Value getHighSpeedVideoSizes = kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Annotation.Argument.Value.getDefaultInstance();

            private Builder() {
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite.Builder, kotlin.reflect.jvm.internal.impl.protobuf.MessageLiteOrBuilder
            public final kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.ValueParameter getDefaultInstanceForType() {
                return kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.ValueParameter.getDefaultInstance();
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.MessageLite.Builder
            public final kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.ValueParameter build() {
                kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.ValueParameter buildPartial = buildPartial();
                if (buildPartial.isInitialized()) {
                    return buildPartial;
                }
                throw newUninitializedMessageException(buildPartial);
            }

            /* JADX WARN: Multi-variable type inference failed */
            public final kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.ValueParameter buildPartial() {
                kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.ValueParameter valueParameter = new kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.ValueParameter((kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite.ExtendableBuilder) this, (byte) (0 == true ? 1 : 0));
                int i = this.Camera2StreamConfigurationMap;
                int i2 = (i & 1) == 1 ? 1 : 0;
                valueParameter.getHighSpeedVideoSizes = this.getHighResolutionOutputSizeshNQ4ISI;
                if ((i & 2) == 2) {
                    i2 |= 2;
                }
                valueParameter.getHighSpeedVideoSizesFor = this.getHighSpeedVideoFpsRanges;
                if ((i & 4) == 4) {
                    i2 |= 4;
                }
                valueParameter.getOutputMinFrameDuration = this.getHighSpeedVideoSizesFor;
                if ((i & 8) == 8) {
                    i2 |= 8;
                }
                valueParameter.getOutputFormats = this.getInputSizeshNQ4ISI;
                if ((i & 16) == 16) {
                    i2 |= 16;
                }
                valueParameter.getOutputMinFrameDurationlomOqCM = this.getInputFormats;
                if ((i & 32) == 32) {
                    i2 |= 32;
                }
                valueParameter.getOutputSizeshNQ4ISI = this.getOutputFormats;
                if ((this.Camera2StreamConfigurationMap & 64) == 64) {
                    this.getHighSpeedVideoFpsRangesFor = java.util.Collections.unmodifiableList(this.getHighSpeedVideoFpsRangesFor);
                    this.Camera2StreamConfigurationMap &= -65;
                }
                valueParameter.getHighResolutionOutputSizeshNQ4ISI = this.getHighSpeedVideoFpsRangesFor;
                if ((i & 128) == 128) {
                    i2 |= 64;
                }
                valueParameter.getHighSpeedVideoFpsRangesFor = this.getHighSpeedVideoSizes;
                valueParameter.Camera2StreamConfigurationMap = i2;
                return valueParameter;
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite.Builder
            public final kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.ValueParameter.Builder mergeFrom(kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.ValueParameter valueParameter) {
                if (valueParameter == kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.ValueParameter.getDefaultInstance()) {
                    return this;
                }
                if (valueParameter.hasFlags()) {
                    setFlags(valueParameter.getFlags());
                }
                if (valueParameter.hasName()) {
                    setName(valueParameter.getName());
                }
                if (valueParameter.hasType()) {
                    mergeType(valueParameter.getType());
                }
                if (valueParameter.hasTypeId()) {
                    setTypeId(valueParameter.getTypeId());
                }
                if (valueParameter.hasVarargElementType()) {
                    mergeVarargElementType(valueParameter.getVarargElementType());
                }
                if (valueParameter.hasVarargElementTypeId()) {
                    setVarargElementTypeId(valueParameter.getVarargElementTypeId());
                }
                if (!valueParameter.getHighResolutionOutputSizeshNQ4ISI.isEmpty()) {
                    if (this.getHighSpeedVideoFpsRangesFor.isEmpty()) {
                        this.getHighSpeedVideoFpsRangesFor = valueParameter.getHighResolutionOutputSizeshNQ4ISI;
                        this.Camera2StreamConfigurationMap &= -65;
                    } else {
                        getHighSpeedVideoFpsRangesFor();
                        this.getHighSpeedVideoFpsRangesFor.addAll(valueParameter.getHighResolutionOutputSizeshNQ4ISI);
                    }
                }
                if (valueParameter.hasAnnotationParameterDefaultValue()) {
                    mergeAnnotationParameterDefaultValue(valueParameter.getAnnotationParameterDefaultValue());
                }
                mergeExtensionFields(valueParameter);
                setUnknownFields(getUnknownFields().concat(valueParameter.getOutputStallDuration));
                return this;
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.MessageLiteOrBuilder
            public final boolean isInitialized() {
                if (!hasName()) {
                    return false;
                }
                if (hasType() && !getType().isInitialized()) {
                    return false;
                }
                if (hasVarargElementType() && !getVarargElementType().isInitialized()) {
                    return false;
                }
                for (int i = 0; i < getAnnotationCount(); i++) {
                    if (!getAnnotation(i).isInitialized()) {
                        return false;
                    }
                }
                return (!hasAnnotationParameterDefaultValue() || getAnnotationParameterDefaultValue().isInitialized()) && extensionsAreInitialized();
            }

            /* JADX WARN: Removed duplicated region for block: B:15:0x001d  */
            @Override // kotlin.reflect.jvm.internal.impl.protobuf.AbstractMessageLite.Builder, kotlin.reflect.jvm.internal.impl.protobuf.MessageLite.Builder
            /*
                Code decompiled incorrectly, please refer to instructions dump.
            */
            public final kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.ValueParameter.Builder mergeFrom(kotlin.reflect.jvm.internal.impl.protobuf.CodedInputStream codedInputStream, kotlin.reflect.jvm.internal.impl.protobuf.ExtensionRegistryLite extensionRegistryLite) throws java.io.IOException {
                kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.ValueParameter valueParameter;
                try {
                    try {
                        kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.ValueParameter parsePartialFrom = kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.ValueParameter.PARSER.parsePartialFrom(codedInputStream, extensionRegistryLite);
                        if (parsePartialFrom != null) {
                            mergeFrom(parsePartialFrom);
                        }
                        return this;
                    } catch (kotlin.reflect.jvm.internal.impl.protobuf.InvalidProtocolBufferException e) {
                        valueParameter = (kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.ValueParameter) e.getUnfinishedMessage();
                        try {
                            throw e;
                        } catch (java.lang.Throwable th) {
                            th = th;
                            if (valueParameter != null) {
                                mergeFrom(valueParameter);
                            }
                            throw th;
                        }
                    }
                } catch (java.lang.Throwable th2) {
                    th = th2;
                    valueParameter = null;
                    if (valueParameter != null) {
                    }
                    throw th;
                }
            }

            public final kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.ValueParameter.Builder setFlags(int i) {
                this.Camera2StreamConfigurationMap |= 1;
                this.getHighResolutionOutputSizeshNQ4ISI = i;
                return this;
            }

            public final boolean hasName() {
                return (this.Camera2StreamConfigurationMap & 2) == 2;
            }

            public final kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.ValueParameter.Builder setName(int i) {
                this.Camera2StreamConfigurationMap |= 2;
                this.getHighSpeedVideoFpsRanges = i;
                return this;
            }

            public final boolean hasType() {
                return (this.Camera2StreamConfigurationMap & 4) == 4;
            }

            public final kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Type getType() {
                return this.getHighSpeedVideoSizesFor;
            }

            public final kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.ValueParameter.Builder setType(kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Type type) {
                this.getHighSpeedVideoSizesFor = type;
                this.Camera2StreamConfigurationMap |= 4;
                return this;
            }

            public final kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.ValueParameter.Builder mergeType(kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Type type) {
                if ((this.Camera2StreamConfigurationMap & 4) == 4 && this.getHighSpeedVideoSizesFor != kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Type.getDefaultInstance()) {
                    this.getHighSpeedVideoSizesFor = kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Type.newBuilder(this.getHighSpeedVideoSizesFor).mergeFrom(type).buildPartial();
                } else {
                    this.getHighSpeedVideoSizesFor = type;
                }
                this.Camera2StreamConfigurationMap |= 4;
                return this;
            }

            public final kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.ValueParameter.Builder setTypeId(int i) {
                this.Camera2StreamConfigurationMap |= 8;
                this.getInputSizeshNQ4ISI = i;
                return this;
            }

            public final boolean hasVarargElementType() {
                return (this.Camera2StreamConfigurationMap & 16) == 16;
            }

            public final kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Type getVarargElementType() {
                return this.getInputFormats;
            }

            public final kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.ValueParameter.Builder setVarargElementType(kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Type type) {
                this.getInputFormats = type;
                this.Camera2StreamConfigurationMap |= 16;
                return this;
            }

            public final kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.ValueParameter.Builder mergeVarargElementType(kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Type type) {
                if ((this.Camera2StreamConfigurationMap & 16) == 16 && this.getInputFormats != kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Type.getDefaultInstance()) {
                    this.getInputFormats = kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Type.newBuilder(this.getInputFormats).mergeFrom(type).buildPartial();
                } else {
                    this.getInputFormats = type;
                }
                this.Camera2StreamConfigurationMap |= 16;
                return this;
            }

            public final kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.ValueParameter.Builder setVarargElementTypeId(int i) {
                this.Camera2StreamConfigurationMap |= 32;
                this.getOutputFormats = i;
                return this;
            }

            private void getHighSpeedVideoFpsRangesFor() {
                if ((this.Camera2StreamConfigurationMap & 64) != 64) {
                    this.getHighSpeedVideoFpsRangesFor = new java.util.ArrayList(this.getHighSpeedVideoFpsRangesFor);
                    this.Camera2StreamConfigurationMap |= 64;
                }
            }

            public final int getAnnotationCount() {
                return this.getHighSpeedVideoFpsRangesFor.size();
            }

            public final kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Annotation getAnnotation(int i) {
                return this.getHighSpeedVideoFpsRangesFor.get(i);
            }

            public final kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.ValueParameter.Builder addAllAnnotation(java.lang.Iterable<? extends kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Annotation> iterable) {
                getHighSpeedVideoFpsRangesFor();
                kotlin.reflect.jvm.internal.impl.protobuf.AbstractMessageLite.Builder.addAll(iterable, this.getHighSpeedVideoFpsRangesFor);
                return this;
            }

            public final boolean hasAnnotationParameterDefaultValue() {
                return (this.Camera2StreamConfigurationMap & 128) == 128;
            }

            public final kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Annotation.Argument.Value getAnnotationParameterDefaultValue() {
                return this.getHighSpeedVideoSizes;
            }

            public final kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.ValueParameter.Builder setAnnotationParameterDefaultValue(kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Annotation.Argument.Value value) {
                this.getHighSpeedVideoSizes = value;
                this.Camera2StreamConfigurationMap |= 128;
                return this;
            }

            public final kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.ValueParameter.Builder mergeAnnotationParameterDefaultValue(kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Annotation.Argument.Value value) {
                if ((this.Camera2StreamConfigurationMap & 128) == 128 && this.getHighSpeedVideoSizes != kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Annotation.Argument.Value.getDefaultInstance()) {
                    this.getHighSpeedVideoSizes = kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Annotation.Argument.Value.newBuilder(this.getHighSpeedVideoSizes).mergeFrom(value).buildPartial();
                } else {
                    this.getHighSpeedVideoSizes = value;
                }
                this.Camera2StreamConfigurationMap |= 128;
                return this;
            }

            static /* synthetic */ kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.ValueParameter.Builder getHighSpeedVideoFpsRanges() {
                return new kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.ValueParameter.Builder();
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite.ExtendableBuilder, kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite.Builder, kotlin.reflect.jvm.internal.impl.protobuf.AbstractMessageLite.Builder
            /* renamed from: clone */
            public final kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.ValueParameter.Builder mo23897clone() {
                return new kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.ValueParameter.Builder().mergeFrom(buildPartial());
            }
        }
    }

    public static final class TypeAlias extends kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite.ExtendableMessage<kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.TypeAlias> implements kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.TypeAliasOrBuilder {
        public static kotlin.reflect.jvm.internal.impl.protobuf.Parser<kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.TypeAlias> PARSER = new kotlin.reflect.jvm.internal.impl.protobuf.AbstractParser<kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.TypeAlias>() { // from class: kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.TypeAlias.1
            @Override // kotlin.reflect.jvm.internal.impl.protobuf.Parser
            public final /* synthetic */ java.lang.Object parsePartialFrom(kotlin.reflect.jvm.internal.impl.protobuf.CodedInputStream codedInputStream, kotlin.reflect.jvm.internal.impl.protobuf.ExtensionRegistryLite extensionRegistryLite) throws kotlin.reflect.jvm.internal.impl.protobuf.InvalidProtocolBufferException {
                return new kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.TypeAlias(codedInputStream, extensionRegistryLite, (byte) 0);
            }
        };
        private static final kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.TypeAlias getHighSpeedVideoFpsRangesFor;
        private int Camera2StreamConfigurationMap;
        private java.util.List<kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Annotation> getHighResolutionOutputSizeshNQ4ISI;
        private java.util.List<kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.CompilerPluginData> getHighSpeedVideoFpsRanges;
        private int getHighSpeedVideoSizes;
        private int getHighSpeedVideoSizesFor;
        private byte getInputFormats;
        private kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Type getInputSizeshNQ4ISI;
        private int getOutputFormats;
        private int getOutputMinFrameDuration;
        private int getOutputMinFrameDurationlomOqCM;
        private kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Type getOutputSizes;
        private java.util.List<kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.TypeParameter> getOutputSizeshNQ4ISI;
        private final kotlin.reflect.jvm.internal.impl.protobuf.ByteString getOutputStallDuration;
        private java.util.List<java.lang.Integer> getOutputStallDurationlomOqCM;

        /* synthetic */ TypeAlias(kotlin.reflect.jvm.internal.impl.protobuf.CodedInputStream codedInputStream, kotlin.reflect.jvm.internal.impl.protobuf.ExtensionRegistryLite extensionRegistryLite, byte b) throws kotlin.reflect.jvm.internal.impl.protobuf.InvalidProtocolBufferException {
            this(codedInputStream, extensionRegistryLite);
        }

        /* synthetic */ TypeAlias(kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite.ExtendableBuilder extendableBuilder, byte b) {
            this(extendableBuilder);
        }

        private TypeAlias(kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite.ExtendableBuilder<kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.TypeAlias, ?> extendableBuilder) {
            super(extendableBuilder);
            this.getInputFormats = (byte) -1;
            this.getHighSpeedVideoSizesFor = -1;
            this.getOutputStallDuration = extendableBuilder.getUnknownFields();
        }

        private TypeAlias() {
            this.getInputFormats = (byte) -1;
            this.getHighSpeedVideoSizesFor = -1;
            this.getOutputStallDuration = kotlin.reflect.jvm.internal.impl.protobuf.ByteString.EMPTY;
        }

        public static kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.TypeAlias getDefaultInstance() {
            return getHighSpeedVideoFpsRangesFor;
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.MessageLiteOrBuilder
        public final kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.TypeAlias getDefaultInstanceForType() {
            return getHighSpeedVideoFpsRangesFor;
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r5v0 */
        /* JADX WARN: Type inference failed for: r5v1 */
        /* JADX WARN: Type inference failed for: r5v2, types: [boolean] */
        private TypeAlias(kotlin.reflect.jvm.internal.impl.protobuf.CodedInputStream codedInputStream, kotlin.reflect.jvm.internal.impl.protobuf.ExtensionRegistryLite extensionRegistryLite) throws kotlin.reflect.jvm.internal.impl.protobuf.InvalidProtocolBufferException {
            kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Type.Builder builder;
            this.getInputFormats = (byte) -1;
            this.getHighSpeedVideoSizesFor = -1;
            getHighSpeedVideoFpsRanges();
            kotlin.reflect.jvm.internal.impl.protobuf.ByteString.Output newOutput = kotlin.reflect.jvm.internal.impl.protobuf.ByteString.newOutput();
            kotlin.reflect.jvm.internal.impl.protobuf.CodedOutputStream newInstance = kotlin.reflect.jvm.internal.impl.protobuf.CodedOutputStream.newInstance(newOutput, 1);
            boolean z = false;
            int i = 0;
            while (true) {
                ?? r5 = 512;
                if (z) {
                    if ((i & 4) == 4) {
                        this.getOutputSizeshNQ4ISI = java.util.Collections.unmodifiableList(this.getOutputSizeshNQ4ISI);
                    }
                    if ((i & 128) == 128) {
                        this.getHighResolutionOutputSizeshNQ4ISI = java.util.Collections.unmodifiableList(this.getHighResolutionOutputSizeshNQ4ISI);
                    }
                    if ((i & 256) == 256) {
                        this.getOutputStallDurationlomOqCM = java.util.Collections.unmodifiableList(this.getOutputStallDurationlomOqCM);
                    }
                    if ((i & 512) == 512) {
                        this.getHighSpeedVideoFpsRanges = java.util.Collections.unmodifiableList(this.getHighSpeedVideoFpsRanges);
                    }
                    try {
                        newInstance.flush();
                    } catch (java.io.IOException unused) {
                    } catch (java.lang.Throwable th) {
                        this.getOutputStallDuration = newOutput.toByteString();
                        throw th;
                    }
                    this.getOutputStallDuration = newOutput.toByteString();
                    makeExtensionsImmutable();
                    return;
                }
                try {
                    try {
                        int readTag = codedInputStream.readTag();
                        switch (readTag) {
                            case 0:
                                z = true;
                            case 8:
                                this.Camera2StreamConfigurationMap |= 1;
                                this.getOutputMinFrameDuration = codedInputStream.readInt32();
                            case 16:
                                this.Camera2StreamConfigurationMap |= 2;
                                this.getOutputFormats = codedInputStream.readInt32();
                            case 26:
                                if ((i & 4) != 4) {
                                    this.getOutputSizeshNQ4ISI = new java.util.ArrayList();
                                    i |= 4;
                                }
                                this.getOutputSizeshNQ4ISI.add(codedInputStream.readMessage(kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.TypeParameter.PARSER, extensionRegistryLite));
                            case 34:
                                builder = (this.Camera2StreamConfigurationMap & 4) == 4 ? this.getOutputSizes.toBuilder() : null;
                                kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Type type = (kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Type) codedInputStream.readMessage(kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Type.PARSER, extensionRegistryLite);
                                this.getOutputSizes = type;
                                if (builder != null) {
                                    builder.mergeFrom(type);
                                    this.getOutputSizes = builder.buildPartial();
                                }
                                this.Camera2StreamConfigurationMap |= 4;
                            case 40:
                                this.Camera2StreamConfigurationMap |= 8;
                                this.getOutputMinFrameDurationlomOqCM = codedInputStream.readInt32();
                            case 50:
                                builder = (this.Camera2StreamConfigurationMap & 16) == 16 ? this.getInputSizeshNQ4ISI.toBuilder() : null;
                                kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Type type2 = (kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Type) codedInputStream.readMessage(kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Type.PARSER, extensionRegistryLite);
                                this.getInputSizeshNQ4ISI = type2;
                                if (builder != null) {
                                    builder.mergeFrom(type2);
                                    this.getInputSizeshNQ4ISI = builder.buildPartial();
                                }
                                this.Camera2StreamConfigurationMap |= 16;
                            case 56:
                                this.Camera2StreamConfigurationMap |= 32;
                                this.getHighSpeedVideoSizes = codedInputStream.readInt32();
                            case 66:
                                if ((i & 128) != 128) {
                                    this.getHighResolutionOutputSizeshNQ4ISI = new java.util.ArrayList();
                                    i |= 128;
                                }
                                this.getHighResolutionOutputSizeshNQ4ISI.add(codedInputStream.readMessage(kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Annotation.PARSER, extensionRegistryLite));
                            case SDK_ASSET_ILLUSTRATION_PLAID_OVERLAY_INSTITUTION_TRANSFER_VALUE:
                                if ((i & 256) != 256) {
                                    this.getOutputStallDurationlomOqCM = new java.util.ArrayList();
                                    i |= 256;
                                }
                                this.getOutputStallDurationlomOqCM.add(java.lang.Integer.valueOf(codedInputStream.readInt32()));
                            case 250:
                                int pushLimit = codedInputStream.pushLimit(codedInputStream.readRawVarint32());
                                if ((i & 256) != 256 && codedInputStream.getBytesUntilLimit() > 0) {
                                    this.getOutputStallDurationlomOqCM = new java.util.ArrayList();
                                    i |= 256;
                                }
                                while (codedInputStream.getBytesUntilLimit() > 0) {
                                    this.getOutputStallDurationlomOqCM.add(java.lang.Integer.valueOf(codedInputStream.readInt32()));
                                }
                                codedInputStream.popLimit(pushLimit);
                                break;
                            case 258:
                                if ((i & 512) != 512) {
                                    this.getHighSpeedVideoFpsRanges = new java.util.ArrayList();
                                    i |= 512;
                                }
                                this.getHighSpeedVideoFpsRanges.add(codedInputStream.readMessage(kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.CompilerPluginData.PARSER, extensionRegistryLite));
                            default:
                                r5 = parseUnknownField(codedInputStream, newInstance, extensionRegistryLite, readTag);
                                if (r5 == 0) {
                                    z = true;
                                }
                        }
                    } catch (java.lang.Throwable th2) {
                        if ((i & 4) == 4) {
                            this.getOutputSizeshNQ4ISI = java.util.Collections.unmodifiableList(this.getOutputSizeshNQ4ISI);
                        }
                        if ((i & 128) == 128) {
                            this.getHighResolutionOutputSizeshNQ4ISI = java.util.Collections.unmodifiableList(this.getHighResolutionOutputSizeshNQ4ISI);
                        }
                        if ((i & 256) == 256) {
                            this.getOutputStallDurationlomOqCM = java.util.Collections.unmodifiableList(this.getOutputStallDurationlomOqCM);
                        }
                        if ((i & 512) == r5) {
                            this.getHighSpeedVideoFpsRanges = java.util.Collections.unmodifiableList(this.getHighSpeedVideoFpsRanges);
                        }
                        try {
                            newInstance.flush();
                        } catch (java.io.IOException unused2) {
                        } catch (java.lang.Throwable th3) {
                            this.getOutputStallDuration = newOutput.toByteString();
                            throw th3;
                        }
                        this.getOutputStallDuration = newOutput.toByteString();
                        makeExtensionsImmutable();
                        throw th2;
                    }
                } catch (kotlin.reflect.jvm.internal.impl.protobuf.InvalidProtocolBufferException e) {
                    throw e.setUnfinishedMessage(this);
                } catch (java.io.IOException e2) {
                    throw new kotlin.reflect.jvm.internal.impl.protobuf.InvalidProtocolBufferException(e2.getMessage()).setUnfinishedMessage(this);
                }
            }
        }

        static {
            kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.TypeAlias typeAlias = new kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.TypeAlias();
            getHighSpeedVideoFpsRangesFor = typeAlias;
            typeAlias.getHighSpeedVideoFpsRanges();
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite, kotlin.reflect.jvm.internal.impl.protobuf.MessageLite
        public final kotlin.reflect.jvm.internal.impl.protobuf.Parser<kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.TypeAlias> getParserForType() {
            return PARSER;
        }

        public final boolean hasFlags() {
            return (this.Camera2StreamConfigurationMap & 1) == 1;
        }

        public final int getFlags() {
            return this.getOutputMinFrameDuration;
        }

        public final boolean hasName() {
            return (this.Camera2StreamConfigurationMap & 2) == 2;
        }

        public final int getName() {
            return this.getOutputFormats;
        }

        public final java.util.List<kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.TypeParameter> getTypeParameterList() {
            return this.getOutputSizeshNQ4ISI;
        }

        public final int getTypeParameterCount() {
            return this.getOutputSizeshNQ4ISI.size();
        }

        public final kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.TypeParameter getTypeParameter(int i) {
            return this.getOutputSizeshNQ4ISI.get(i);
        }

        public final boolean hasUnderlyingType() {
            return (this.Camera2StreamConfigurationMap & 4) == 4;
        }

        public final kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Type getUnderlyingType() {
            return this.getOutputSizes;
        }

        public final boolean hasUnderlyingTypeId() {
            return (this.Camera2StreamConfigurationMap & 8) == 8;
        }

        public final int getUnderlyingTypeId() {
            return this.getOutputMinFrameDurationlomOqCM;
        }

        public final boolean hasExpandedType() {
            return (this.Camera2StreamConfigurationMap & 16) == 16;
        }

        public final kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Type getExpandedType() {
            return this.getInputSizeshNQ4ISI;
        }

        public final boolean hasExpandedTypeId() {
            return (this.Camera2StreamConfigurationMap & 32) == 32;
        }

        public final int getExpandedTypeId() {
            return this.getHighSpeedVideoSizes;
        }

        public final java.util.List<kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Annotation> getAnnotationList() {
            return this.getHighResolutionOutputSizeshNQ4ISI;
        }

        public final int getAnnotationCount() {
            return this.getHighResolutionOutputSizeshNQ4ISI.size();
        }

        public final kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Annotation getAnnotation(int i) {
            return this.getHighResolutionOutputSizeshNQ4ISI.get(i);
        }

        public final java.util.List<java.lang.Integer> getVersionRequirementList() {
            return this.getOutputStallDurationlomOqCM;
        }

        public final int getCompilerPluginDataCount() {
            return this.getHighSpeedVideoFpsRanges.size();
        }

        public final kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.CompilerPluginData getCompilerPluginData(int i) {
            return this.getHighSpeedVideoFpsRanges.get(i);
        }

        private void getHighSpeedVideoFpsRanges() {
            this.getOutputMinFrameDuration = 6;
            this.getOutputFormats = 0;
            this.getOutputSizeshNQ4ISI = java.util.Collections.emptyList();
            this.getOutputSizes = kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Type.getDefaultInstance();
            this.getOutputMinFrameDurationlomOqCM = 0;
            this.getInputSizeshNQ4ISI = kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Type.getDefaultInstance();
            this.getHighSpeedVideoSizes = 0;
            this.getHighResolutionOutputSizeshNQ4ISI = java.util.Collections.emptyList();
            this.getOutputStallDurationlomOqCM = java.util.Collections.emptyList();
            this.getHighSpeedVideoFpsRanges = java.util.Collections.emptyList();
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.MessageLiteOrBuilder
        public final boolean isInitialized() {
            byte b = this.getInputFormats;
            if (b == 1) {
                return true;
            }
            if (b == 0) {
                return false;
            }
            if (!hasName()) {
                this.getInputFormats = (byte) 0;
                return false;
            }
            for (int i = 0; i < getTypeParameterCount(); i++) {
                if (!getTypeParameter(i).isInitialized()) {
                    this.getInputFormats = (byte) 0;
                    return false;
                }
            }
            if (hasUnderlyingType() && !getUnderlyingType().isInitialized()) {
                this.getInputFormats = (byte) 0;
                return false;
            }
            if (hasExpandedType() && !getExpandedType().isInitialized()) {
                this.getInputFormats = (byte) 0;
                return false;
            }
            for (int i2 = 0; i2 < getAnnotationCount(); i2++) {
                if (!getAnnotation(i2).isInitialized()) {
                    this.getInputFormats = (byte) 0;
                    return false;
                }
            }
            for (int i3 = 0; i3 < getCompilerPluginDataCount(); i3++) {
                if (!getCompilerPluginData(i3).isInitialized()) {
                    this.getInputFormats = (byte) 0;
                    return false;
                }
            }
            if (!extensionsAreInitialized()) {
                this.getInputFormats = (byte) 0;
                return false;
            }
            this.getInputFormats = (byte) 1;
            return true;
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.MessageLite
        public final void writeTo(kotlin.reflect.jvm.internal.impl.protobuf.CodedOutputStream codedOutputStream) throws java.io.IOException {
            getSerializedSize();
            kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite.ExtendableMessage<MessageType>.ExtensionWriter newExtensionWriter = newExtensionWriter();
            if ((this.Camera2StreamConfigurationMap & 1) == 1) {
                codedOutputStream.writeInt32(1, this.getOutputMinFrameDuration);
            }
            if ((this.Camera2StreamConfigurationMap & 2) == 2) {
                codedOutputStream.writeInt32(2, this.getOutputFormats);
            }
            for (int i = 0; i < this.getOutputSizeshNQ4ISI.size(); i++) {
                codedOutputStream.writeMessage(3, this.getOutputSizeshNQ4ISI.get(i));
            }
            if ((this.Camera2StreamConfigurationMap & 4) == 4) {
                codedOutputStream.writeMessage(4, this.getOutputSizes);
            }
            if ((this.Camera2StreamConfigurationMap & 8) == 8) {
                codedOutputStream.writeInt32(5, this.getOutputMinFrameDurationlomOqCM);
            }
            if ((this.Camera2StreamConfigurationMap & 16) == 16) {
                codedOutputStream.writeMessage(6, this.getInputSizeshNQ4ISI);
            }
            if ((this.Camera2StreamConfigurationMap & 32) == 32) {
                codedOutputStream.writeInt32(7, this.getHighSpeedVideoSizes);
            }
            for (int i2 = 0; i2 < this.getHighResolutionOutputSizeshNQ4ISI.size(); i2++) {
                codedOutputStream.writeMessage(8, this.getHighResolutionOutputSizeshNQ4ISI.get(i2));
            }
            for (int i3 = 0; i3 < this.getOutputStallDurationlomOqCM.size(); i3++) {
                codedOutputStream.writeInt32(31, this.getOutputStallDurationlomOqCM.get(i3).intValue());
            }
            for (int i4 = 0; i4 < this.getHighSpeedVideoFpsRanges.size(); i4++) {
                codedOutputStream.writeMessage(32, this.getHighSpeedVideoFpsRanges.get(i4));
            }
            newExtensionWriter.writeUntil(200, codedOutputStream);
            codedOutputStream.writeRawBytes(this.getOutputStallDuration);
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.MessageLite
        public final int getSerializedSize() {
            int i = this.getHighSpeedVideoSizesFor;
            if (i != -1) {
                return i;
            }
            int computeInt32Size = (this.Camera2StreamConfigurationMap & 1) == 1 ? kotlin.reflect.jvm.internal.impl.protobuf.CodedOutputStream.computeInt32Size(1, this.getOutputMinFrameDuration) : 0;
            if ((this.Camera2StreamConfigurationMap & 2) == 2) {
                computeInt32Size += kotlin.reflect.jvm.internal.impl.protobuf.CodedOutputStream.computeInt32Size(2, this.getOutputFormats);
            }
            for (int i2 = 0; i2 < this.getOutputSizeshNQ4ISI.size(); i2++) {
                computeInt32Size += kotlin.reflect.jvm.internal.impl.protobuf.CodedOutputStream.computeMessageSize(3, this.getOutputSizeshNQ4ISI.get(i2));
            }
            if ((this.Camera2StreamConfigurationMap & 4) == 4) {
                computeInt32Size += kotlin.reflect.jvm.internal.impl.protobuf.CodedOutputStream.computeMessageSize(4, this.getOutputSizes);
            }
            if ((this.Camera2StreamConfigurationMap & 8) == 8) {
                computeInt32Size += kotlin.reflect.jvm.internal.impl.protobuf.CodedOutputStream.computeInt32Size(5, this.getOutputMinFrameDurationlomOqCM);
            }
            if ((this.Camera2StreamConfigurationMap & 16) == 16) {
                computeInt32Size += kotlin.reflect.jvm.internal.impl.protobuf.CodedOutputStream.computeMessageSize(6, this.getInputSizeshNQ4ISI);
            }
            if ((this.Camera2StreamConfigurationMap & 32) == 32) {
                computeInt32Size += kotlin.reflect.jvm.internal.impl.protobuf.CodedOutputStream.computeInt32Size(7, this.getHighSpeedVideoSizes);
            }
            for (int i3 = 0; i3 < this.getHighResolutionOutputSizeshNQ4ISI.size(); i3++) {
                computeInt32Size += kotlin.reflect.jvm.internal.impl.protobuf.CodedOutputStream.computeMessageSize(8, this.getHighResolutionOutputSizeshNQ4ISI.get(i3));
            }
            int i4 = 0;
            for (int i5 = 0; i5 < this.getOutputStallDurationlomOqCM.size(); i5++) {
                i4 += kotlin.reflect.jvm.internal.impl.protobuf.CodedOutputStream.computeInt32SizeNoTag(this.getOutputStallDurationlomOqCM.get(i5).intValue());
            }
            int size = computeInt32Size + i4 + (getVersionRequirementList().size() * 2);
            for (int i6 = 0; i6 < this.getHighSpeedVideoFpsRanges.size(); i6++) {
                size += kotlin.reflect.jvm.internal.impl.protobuf.CodedOutputStream.computeMessageSize(32, this.getHighSpeedVideoFpsRanges.get(i6));
            }
            int extensionsSerializedSize = size + extensionsSerializedSize() + this.getOutputStallDuration.size();
            this.getHighSpeedVideoSizesFor = extensionsSerializedSize;
            return extensionsSerializedSize;
        }

        public static kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.TypeAlias parseDelimitedFrom(java.io.InputStream inputStream, kotlin.reflect.jvm.internal.impl.protobuf.ExtensionRegistryLite extensionRegistryLite) throws java.io.IOException {
            return PARSER.parseDelimitedFrom(inputStream, extensionRegistryLite);
        }

        public static kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.TypeAlias.Builder newBuilder() {
            return kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.TypeAlias.Builder.getHighSpeedVideoFpsRanges();
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.MessageLite
        public final kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.TypeAlias.Builder newBuilderForType() {
            return newBuilder();
        }

        public static kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.TypeAlias.Builder newBuilder(kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.TypeAlias typeAlias) {
            return newBuilder().mergeFrom(typeAlias);
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.MessageLite
        public final kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.TypeAlias.Builder toBuilder() {
            return newBuilder(this);
        }

        public static final class Builder extends kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite.ExtendableBuilder<kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.TypeAlias, kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.TypeAlias.Builder> implements kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.TypeAliasOrBuilder {
            private int Camera2StreamConfigurationMap;
            private int getHighSpeedVideoFpsRangesFor;
            private int getHighSpeedVideoSizesFor;
            private int getOutputMinFrameDuration;
            private int getOutputFormats = 6;
            private java.util.List<kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.TypeParameter> getInputSizeshNQ4ISI = java.util.Collections.emptyList();
            private kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Type getInputFormats = kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Type.getDefaultInstance();
            private kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Type getHighResolutionOutputSizeshNQ4ISI = kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Type.getDefaultInstance();
            private java.util.List<kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Annotation> getHighSpeedVideoFpsRanges = java.util.Collections.emptyList();
            private java.util.List<java.lang.Integer> getOutputMinFrameDurationlomOqCM = java.util.Collections.emptyList();
            private java.util.List<kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.CompilerPluginData> getHighSpeedVideoSizes = java.util.Collections.emptyList();

            private Builder() {
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite.Builder, kotlin.reflect.jvm.internal.impl.protobuf.MessageLiteOrBuilder
            public final kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.TypeAlias getDefaultInstanceForType() {
                return kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.TypeAlias.getDefaultInstance();
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.MessageLite.Builder
            public final kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.TypeAlias build() {
                kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.TypeAlias buildPartial = buildPartial();
                if (buildPartial.isInitialized()) {
                    return buildPartial;
                }
                throw newUninitializedMessageException(buildPartial);
            }

            /* JADX WARN: Multi-variable type inference failed */
            public final kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.TypeAlias buildPartial() {
                kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.TypeAlias typeAlias = new kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.TypeAlias((kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite.ExtendableBuilder) this, (byte) (0 == true ? 1 : 0));
                int i = this.Camera2StreamConfigurationMap;
                int i2 = (i & 1) == 1 ? 1 : 0;
                typeAlias.getOutputMinFrameDuration = this.getOutputFormats;
                if ((i & 2) == 2) {
                    i2 |= 2;
                }
                typeAlias.getOutputFormats = this.getOutputMinFrameDuration;
                if ((this.Camera2StreamConfigurationMap & 4) == 4) {
                    this.getInputSizeshNQ4ISI = java.util.Collections.unmodifiableList(this.getInputSizeshNQ4ISI);
                    this.Camera2StreamConfigurationMap &= -5;
                }
                typeAlias.getOutputSizeshNQ4ISI = this.getInputSizeshNQ4ISI;
                if ((i & 8) == 8) {
                    i2 |= 4;
                }
                typeAlias.getOutputSizes = this.getInputFormats;
                if ((i & 16) == 16) {
                    i2 |= 8;
                }
                typeAlias.getOutputMinFrameDurationlomOqCM = this.getHighSpeedVideoSizesFor;
                if ((i & 32) == 32) {
                    i2 |= 16;
                }
                typeAlias.getInputSizeshNQ4ISI = this.getHighResolutionOutputSizeshNQ4ISI;
                if ((i & 64) == 64) {
                    i2 |= 32;
                }
                typeAlias.getHighSpeedVideoSizes = this.getHighSpeedVideoFpsRangesFor;
                if ((this.Camera2StreamConfigurationMap & 128) == 128) {
                    this.getHighSpeedVideoFpsRanges = java.util.Collections.unmodifiableList(this.getHighSpeedVideoFpsRanges);
                    this.Camera2StreamConfigurationMap &= -129;
                }
                typeAlias.getHighResolutionOutputSizeshNQ4ISI = this.getHighSpeedVideoFpsRanges;
                if ((this.Camera2StreamConfigurationMap & 256) == 256) {
                    this.getOutputMinFrameDurationlomOqCM = java.util.Collections.unmodifiableList(this.getOutputMinFrameDurationlomOqCM);
                    this.Camera2StreamConfigurationMap &= -257;
                }
                typeAlias.getOutputStallDurationlomOqCM = this.getOutputMinFrameDurationlomOqCM;
                if ((this.Camera2StreamConfigurationMap & 512) == 512) {
                    this.getHighSpeedVideoSizes = java.util.Collections.unmodifiableList(this.getHighSpeedVideoSizes);
                    this.Camera2StreamConfigurationMap &= -513;
                }
                typeAlias.getHighSpeedVideoFpsRanges = this.getHighSpeedVideoSizes;
                typeAlias.Camera2StreamConfigurationMap = i2;
                return typeAlias;
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite.Builder
            public final kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.TypeAlias.Builder mergeFrom(kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.TypeAlias typeAlias) {
                if (typeAlias == kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.TypeAlias.getDefaultInstance()) {
                    return this;
                }
                if (typeAlias.hasFlags()) {
                    setFlags(typeAlias.getFlags());
                }
                if (typeAlias.hasName()) {
                    setName(typeAlias.getName());
                }
                if (!typeAlias.getOutputSizeshNQ4ISI.isEmpty()) {
                    if (this.getInputSizeshNQ4ISI.isEmpty()) {
                        this.getInputSizeshNQ4ISI = typeAlias.getOutputSizeshNQ4ISI;
                        this.Camera2StreamConfigurationMap &= -5;
                    } else {
                        if ((this.Camera2StreamConfigurationMap & 4) != 4) {
                            this.getInputSizeshNQ4ISI = new java.util.ArrayList(this.getInputSizeshNQ4ISI);
                            this.Camera2StreamConfigurationMap |= 4;
                        }
                        this.getInputSizeshNQ4ISI.addAll(typeAlias.getOutputSizeshNQ4ISI);
                    }
                }
                if (typeAlias.hasUnderlyingType()) {
                    mergeUnderlyingType(typeAlias.getUnderlyingType());
                }
                if (typeAlias.hasUnderlyingTypeId()) {
                    setUnderlyingTypeId(typeAlias.getUnderlyingTypeId());
                }
                if (typeAlias.hasExpandedType()) {
                    mergeExpandedType(typeAlias.getExpandedType());
                }
                if (typeAlias.hasExpandedTypeId()) {
                    setExpandedTypeId(typeAlias.getExpandedTypeId());
                }
                if (!typeAlias.getHighResolutionOutputSizeshNQ4ISI.isEmpty()) {
                    if (this.getHighSpeedVideoFpsRanges.isEmpty()) {
                        this.getHighSpeedVideoFpsRanges = typeAlias.getHighResolutionOutputSizeshNQ4ISI;
                        this.Camera2StreamConfigurationMap &= -129;
                    } else {
                        if ((this.Camera2StreamConfigurationMap & 128) != 128) {
                            this.getHighSpeedVideoFpsRanges = new java.util.ArrayList(this.getHighSpeedVideoFpsRanges);
                            this.Camera2StreamConfigurationMap |= 128;
                        }
                        this.getHighSpeedVideoFpsRanges.addAll(typeAlias.getHighResolutionOutputSizeshNQ4ISI);
                    }
                }
                if (!typeAlias.getOutputStallDurationlomOqCM.isEmpty()) {
                    if (this.getOutputMinFrameDurationlomOqCM.isEmpty()) {
                        this.getOutputMinFrameDurationlomOqCM = typeAlias.getOutputStallDurationlomOqCM;
                        this.Camera2StreamConfigurationMap &= -257;
                    } else {
                        if ((this.Camera2StreamConfigurationMap & 256) != 256) {
                            this.getOutputMinFrameDurationlomOqCM = new java.util.ArrayList(this.getOutputMinFrameDurationlomOqCM);
                            this.Camera2StreamConfigurationMap |= 256;
                        }
                        this.getOutputMinFrameDurationlomOqCM.addAll(typeAlias.getOutputStallDurationlomOqCM);
                    }
                }
                if (!typeAlias.getHighSpeedVideoFpsRanges.isEmpty()) {
                    if (this.getHighSpeedVideoSizes.isEmpty()) {
                        this.getHighSpeedVideoSizes = typeAlias.getHighSpeedVideoFpsRanges;
                        this.Camera2StreamConfigurationMap &= -513;
                    } else {
                        if ((this.Camera2StreamConfigurationMap & 512) != 512) {
                            this.getHighSpeedVideoSizes = new java.util.ArrayList(this.getHighSpeedVideoSizes);
                            this.Camera2StreamConfigurationMap |= 512;
                        }
                        this.getHighSpeedVideoSizes.addAll(typeAlias.getHighSpeedVideoFpsRanges);
                    }
                }
                mergeExtensionFields(typeAlias);
                setUnknownFields(getUnknownFields().concat(typeAlias.getOutputStallDuration));
                return this;
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.MessageLiteOrBuilder
            public final boolean isInitialized() {
                if (!hasName()) {
                    return false;
                }
                for (int i = 0; i < getTypeParameterCount(); i++) {
                    if (!getTypeParameter(i).isInitialized()) {
                        return false;
                    }
                }
                if (hasUnderlyingType() && !getUnderlyingType().isInitialized()) {
                    return false;
                }
                if (hasExpandedType() && !getExpandedType().isInitialized()) {
                    return false;
                }
                for (int i2 = 0; i2 < getAnnotationCount(); i2++) {
                    if (!getAnnotation(i2).isInitialized()) {
                        return false;
                    }
                }
                for (int i3 = 0; i3 < getCompilerPluginDataCount(); i3++) {
                    if (!getCompilerPluginData(i3).isInitialized()) {
                        return false;
                    }
                }
                return extensionsAreInitialized();
            }

            /* JADX WARN: Removed duplicated region for block: B:15:0x001d  */
            @Override // kotlin.reflect.jvm.internal.impl.protobuf.AbstractMessageLite.Builder, kotlin.reflect.jvm.internal.impl.protobuf.MessageLite.Builder
            /*
                Code decompiled incorrectly, please refer to instructions dump.
            */
            public final kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.TypeAlias.Builder mergeFrom(kotlin.reflect.jvm.internal.impl.protobuf.CodedInputStream codedInputStream, kotlin.reflect.jvm.internal.impl.protobuf.ExtensionRegistryLite extensionRegistryLite) throws java.io.IOException {
                kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.TypeAlias typeAlias;
                try {
                    try {
                        kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.TypeAlias parsePartialFrom = kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.TypeAlias.PARSER.parsePartialFrom(codedInputStream, extensionRegistryLite);
                        if (parsePartialFrom != null) {
                            mergeFrom(parsePartialFrom);
                        }
                        return this;
                    } catch (kotlin.reflect.jvm.internal.impl.protobuf.InvalidProtocolBufferException e) {
                        typeAlias = (kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.TypeAlias) e.getUnfinishedMessage();
                        try {
                            throw e;
                        } catch (java.lang.Throwable th) {
                            th = th;
                            if (typeAlias != null) {
                                mergeFrom(typeAlias);
                            }
                            throw th;
                        }
                    }
                } catch (java.lang.Throwable th2) {
                    th = th2;
                    typeAlias = null;
                    if (typeAlias != null) {
                    }
                    throw th;
                }
            }

            public final kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.TypeAlias.Builder setFlags(int i) {
                this.Camera2StreamConfigurationMap |= 1;
                this.getOutputFormats = i;
                return this;
            }

            public final boolean hasName() {
                return (this.Camera2StreamConfigurationMap & 2) == 2;
            }

            public final kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.TypeAlias.Builder setName(int i) {
                this.Camera2StreamConfigurationMap |= 2;
                this.getOutputMinFrameDuration = i;
                return this;
            }

            public final int getTypeParameterCount() {
                return this.getInputSizeshNQ4ISI.size();
            }

            public final kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.TypeParameter getTypeParameter(int i) {
                return this.getInputSizeshNQ4ISI.get(i);
            }

            public final boolean hasUnderlyingType() {
                return (this.Camera2StreamConfigurationMap & 8) == 8;
            }

            public final kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Type getUnderlyingType() {
                return this.getInputFormats;
            }

            public final kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.TypeAlias.Builder mergeUnderlyingType(kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Type type) {
                if ((this.Camera2StreamConfigurationMap & 8) == 8 && this.getInputFormats != kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Type.getDefaultInstance()) {
                    this.getInputFormats = kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Type.newBuilder(this.getInputFormats).mergeFrom(type).buildPartial();
                } else {
                    this.getInputFormats = type;
                }
                this.Camera2StreamConfigurationMap |= 8;
                return this;
            }

            public final kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.TypeAlias.Builder setUnderlyingTypeId(int i) {
                this.Camera2StreamConfigurationMap |= 16;
                this.getHighSpeedVideoSizesFor = i;
                return this;
            }

            public final boolean hasExpandedType() {
                return (this.Camera2StreamConfigurationMap & 32) == 32;
            }

            public final kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Type getExpandedType() {
                return this.getHighResolutionOutputSizeshNQ4ISI;
            }

            public final kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.TypeAlias.Builder mergeExpandedType(kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Type type) {
                if ((this.Camera2StreamConfigurationMap & 32) == 32 && this.getHighResolutionOutputSizeshNQ4ISI != kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Type.getDefaultInstance()) {
                    this.getHighResolutionOutputSizeshNQ4ISI = kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Type.newBuilder(this.getHighResolutionOutputSizeshNQ4ISI).mergeFrom(type).buildPartial();
                } else {
                    this.getHighResolutionOutputSizeshNQ4ISI = type;
                }
                this.Camera2StreamConfigurationMap |= 32;
                return this;
            }

            public final kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.TypeAlias.Builder setExpandedTypeId(int i) {
                this.Camera2StreamConfigurationMap |= 64;
                this.getHighSpeedVideoFpsRangesFor = i;
                return this;
            }

            public final int getAnnotationCount() {
                return this.getHighSpeedVideoFpsRanges.size();
            }

            public final kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Annotation getAnnotation(int i) {
                return this.getHighSpeedVideoFpsRanges.get(i);
            }

            public final int getCompilerPluginDataCount() {
                return this.getHighSpeedVideoSizes.size();
            }

            public final kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.CompilerPluginData getCompilerPluginData(int i) {
                return this.getHighSpeedVideoSizes.get(i);
            }

            static /* synthetic */ kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.TypeAlias.Builder getHighSpeedVideoFpsRanges() {
                return new kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.TypeAlias.Builder();
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite.ExtendableBuilder, kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite.Builder, kotlin.reflect.jvm.internal.impl.protobuf.AbstractMessageLite.Builder
            /* renamed from: clone */
            public final kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.TypeAlias.Builder mo23897clone() {
                return new kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.TypeAlias.Builder().mergeFrom(buildPartial());
            }
        }
    }

    public static final class EnumEntry extends kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite.ExtendableMessage<kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.EnumEntry> implements kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.EnumEntryOrBuilder {
        public static kotlin.reflect.jvm.internal.impl.protobuf.Parser<kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.EnumEntry> PARSER = new kotlin.reflect.jvm.internal.impl.protobuf.AbstractParser<kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.EnumEntry>() { // from class: kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.EnumEntry.1
            @Override // kotlin.reflect.jvm.internal.impl.protobuf.Parser
            public final /* synthetic */ java.lang.Object parsePartialFrom(kotlin.reflect.jvm.internal.impl.protobuf.CodedInputStream codedInputStream, kotlin.reflect.jvm.internal.impl.protobuf.ExtensionRegistryLite extensionRegistryLite) throws kotlin.reflect.jvm.internal.impl.protobuf.InvalidProtocolBufferException {
                return new kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.EnumEntry(codedInputStream, extensionRegistryLite, (byte) 0);
            }
        };
        private static final kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.EnumEntry getHighSpeedVideoFpsRangesFor;
        private int Camera2StreamConfigurationMap;
        private int getHighResolutionOutputSizeshNQ4ISI;
        private java.util.List<kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Annotation> getHighSpeedVideoFpsRanges;
        private byte getHighSpeedVideoSizes;
        private final kotlin.reflect.jvm.internal.impl.protobuf.ByteString getInputSizeshNQ4ISI;
        private int getOutputFormats;

        /* synthetic */ EnumEntry(kotlin.reflect.jvm.internal.impl.protobuf.CodedInputStream codedInputStream, kotlin.reflect.jvm.internal.impl.protobuf.ExtensionRegistryLite extensionRegistryLite, byte b) throws kotlin.reflect.jvm.internal.impl.protobuf.InvalidProtocolBufferException {
            this(codedInputStream, extensionRegistryLite);
        }

        /* synthetic */ EnumEntry(kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite.ExtendableBuilder extendableBuilder, byte b) {
            this(extendableBuilder);
        }

        private EnumEntry(kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite.ExtendableBuilder<kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.EnumEntry, ?> extendableBuilder) {
            super(extendableBuilder);
            this.getHighSpeedVideoSizes = (byte) -1;
            this.Camera2StreamConfigurationMap = -1;
            this.getInputSizeshNQ4ISI = extendableBuilder.getUnknownFields();
        }

        private EnumEntry() {
            this.getHighSpeedVideoSizes = (byte) -1;
            this.Camera2StreamConfigurationMap = -1;
            this.getInputSizeshNQ4ISI = kotlin.reflect.jvm.internal.impl.protobuf.ByteString.EMPTY;
        }

        public static kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.EnumEntry getDefaultInstance() {
            return getHighSpeedVideoFpsRangesFor;
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.MessageLiteOrBuilder
        public final kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.EnumEntry getDefaultInstanceForType() {
            return getHighSpeedVideoFpsRangesFor;
        }

        /* JADX WARN: Multi-variable type inference failed */
        private EnumEntry(kotlin.reflect.jvm.internal.impl.protobuf.CodedInputStream codedInputStream, kotlin.reflect.jvm.internal.impl.protobuf.ExtensionRegistryLite extensionRegistryLite) throws kotlin.reflect.jvm.internal.impl.protobuf.InvalidProtocolBufferException {
            this.getHighSpeedVideoSizes = (byte) -1;
            this.Camera2StreamConfigurationMap = -1;
            boolean z = false;
            this.getOutputFormats = 0;
            this.getHighSpeedVideoFpsRanges = java.util.Collections.emptyList();
            kotlin.reflect.jvm.internal.impl.protobuf.ByteString.Output newOutput = kotlin.reflect.jvm.internal.impl.protobuf.ByteString.newOutput();
            kotlin.reflect.jvm.internal.impl.protobuf.CodedOutputStream newInstance = kotlin.reflect.jvm.internal.impl.protobuf.CodedOutputStream.newInstance(newOutput, 1);
            char c = 0;
            while (!z) {
                try {
                    try {
                        try {
                            int readTag = codedInputStream.readTag();
                            if (readTag != 0) {
                                if (readTag == 8) {
                                    this.getHighResolutionOutputSizeshNQ4ISI |= 1;
                                    this.getOutputFormats = codedInputStream.readInt32();
                                } else if (readTag == 18) {
                                    if ((c & 2) != 2) {
                                        this.getHighSpeedVideoFpsRanges = new java.util.ArrayList();
                                        c = 2;
                                    }
                                    this.getHighSpeedVideoFpsRanges.add(codedInputStream.readMessage(kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Annotation.PARSER, extensionRegistryLite));
                                } else if (!parseUnknownField(codedInputStream, newInstance, extensionRegistryLite, readTag)) {
                                }
                            }
                            z = true;
                        } catch (java.io.IOException e) {
                            throw new kotlin.reflect.jvm.internal.impl.protobuf.InvalidProtocolBufferException(e.getMessage()).setUnfinishedMessage(this);
                        }
                    } catch (kotlin.reflect.jvm.internal.impl.protobuf.InvalidProtocolBufferException e2) {
                        throw e2.setUnfinishedMessage(this);
                    }
                } catch (java.lang.Throwable th) {
                    if ((c & 2) == 2) {
                        this.getHighSpeedVideoFpsRanges = java.util.Collections.unmodifiableList(this.getHighSpeedVideoFpsRanges);
                    }
                    try {
                        newInstance.flush();
                    } catch (java.io.IOException unused) {
                    } catch (java.lang.Throwable th2) {
                        this.getInputSizeshNQ4ISI = newOutput.toByteString();
                        throw th2;
                    }
                    this.getInputSizeshNQ4ISI = newOutput.toByteString();
                    makeExtensionsImmutable();
                    throw th;
                }
            }
            if ((c & 2) == 2) {
                this.getHighSpeedVideoFpsRanges = java.util.Collections.unmodifiableList(this.getHighSpeedVideoFpsRanges);
            }
            try {
                newInstance.flush();
            } catch (java.io.IOException unused2) {
            } catch (java.lang.Throwable th3) {
                this.getInputSizeshNQ4ISI = newOutput.toByteString();
                throw th3;
            }
            this.getInputSizeshNQ4ISI = newOutput.toByteString();
            makeExtensionsImmutable();
        }

        static {
            kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.EnumEntry enumEntry = new kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.EnumEntry();
            getHighSpeedVideoFpsRangesFor = enumEntry;
            enumEntry.getOutputFormats = 0;
            enumEntry.getHighSpeedVideoFpsRanges = java.util.Collections.emptyList();
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite, kotlin.reflect.jvm.internal.impl.protobuf.MessageLite
        public final kotlin.reflect.jvm.internal.impl.protobuf.Parser<kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.EnumEntry> getParserForType() {
            return PARSER;
        }

        public final boolean hasName() {
            return (this.getHighResolutionOutputSizeshNQ4ISI & 1) == 1;
        }

        public final int getName() {
            return this.getOutputFormats;
        }

        public final java.util.List<kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Annotation> getAnnotationList() {
            return this.getHighSpeedVideoFpsRanges;
        }

        public final int getAnnotationCount() {
            return this.getHighSpeedVideoFpsRanges.size();
        }

        public final kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Annotation getAnnotation(int i) {
            return this.getHighSpeedVideoFpsRanges.get(i);
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.MessageLiteOrBuilder
        public final boolean isInitialized() {
            byte b = this.getHighSpeedVideoSizes;
            if (b == 1) {
                return true;
            }
            if (b == 0) {
                return false;
            }
            for (int i = 0; i < getAnnotationCount(); i++) {
                if (!getAnnotation(i).isInitialized()) {
                    this.getHighSpeedVideoSizes = (byte) 0;
                    return false;
                }
            }
            if (!extensionsAreInitialized()) {
                this.getHighSpeedVideoSizes = (byte) 0;
                return false;
            }
            this.getHighSpeedVideoSizes = (byte) 1;
            return true;
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.MessageLite
        public final void writeTo(kotlin.reflect.jvm.internal.impl.protobuf.CodedOutputStream codedOutputStream) throws java.io.IOException {
            getSerializedSize();
            kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite.ExtendableMessage<MessageType>.ExtensionWriter newExtensionWriter = newExtensionWriter();
            if ((this.getHighResolutionOutputSizeshNQ4ISI & 1) == 1) {
                codedOutputStream.writeInt32(1, this.getOutputFormats);
            }
            for (int i = 0; i < this.getHighSpeedVideoFpsRanges.size(); i++) {
                codedOutputStream.writeMessage(2, this.getHighSpeedVideoFpsRanges.get(i));
            }
            newExtensionWriter.writeUntil(200, codedOutputStream);
            codedOutputStream.writeRawBytes(this.getInputSizeshNQ4ISI);
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.MessageLite
        public final int getSerializedSize() {
            int i = this.Camera2StreamConfigurationMap;
            if (i != -1) {
                return i;
            }
            int computeInt32Size = (this.getHighResolutionOutputSizeshNQ4ISI & 1) == 1 ? kotlin.reflect.jvm.internal.impl.protobuf.CodedOutputStream.computeInt32Size(1, this.getOutputFormats) : 0;
            for (int i2 = 0; i2 < this.getHighSpeedVideoFpsRanges.size(); i2++) {
                computeInt32Size += kotlin.reflect.jvm.internal.impl.protobuf.CodedOutputStream.computeMessageSize(2, this.getHighSpeedVideoFpsRanges.get(i2));
            }
            int extensionsSerializedSize = computeInt32Size + extensionsSerializedSize() + this.getInputSizeshNQ4ISI.size();
            this.Camera2StreamConfigurationMap = extensionsSerializedSize;
            return extensionsSerializedSize;
        }

        public static kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.EnumEntry.Builder newBuilder() {
            return kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.EnumEntry.Builder.getHighResolutionOutputSizeshNQ4ISI();
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.MessageLite
        public final kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.EnumEntry.Builder newBuilderForType() {
            return newBuilder();
        }

        public static kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.EnumEntry.Builder newBuilder(kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.EnumEntry enumEntry) {
            return newBuilder().mergeFrom(enumEntry);
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.MessageLite
        public final kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.EnumEntry.Builder toBuilder() {
            return newBuilder(this);
        }

        public static final class Builder extends kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite.ExtendableBuilder<kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.EnumEntry, kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.EnumEntry.Builder> implements kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.EnumEntryOrBuilder {
            private java.util.List<kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Annotation> Camera2StreamConfigurationMap = java.util.Collections.emptyList();
            private int getHighSpeedVideoFpsRanges;
            private int getHighSpeedVideoFpsRangesFor;

            private Builder() {
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite.Builder, kotlin.reflect.jvm.internal.impl.protobuf.MessageLiteOrBuilder
            public final kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.EnumEntry getDefaultInstanceForType() {
                return kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.EnumEntry.getDefaultInstance();
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.MessageLite.Builder
            public final kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.EnumEntry build() {
                kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.EnumEntry buildPartial = buildPartial();
                if (buildPartial.isInitialized()) {
                    return buildPartial;
                }
                throw newUninitializedMessageException(buildPartial);
            }

            public final kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.EnumEntry buildPartial() {
                kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.EnumEntry enumEntry = new kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.EnumEntry((kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite.ExtendableBuilder) this, (byte) 0);
                byte b = (this.getHighSpeedVideoFpsRangesFor & 1) == 1 ? (byte) 1 : (byte) 0;
                enumEntry.getOutputFormats = this.getHighSpeedVideoFpsRanges;
                if ((this.getHighSpeedVideoFpsRangesFor & 2) == 2) {
                    this.Camera2StreamConfigurationMap = java.util.Collections.unmodifiableList(this.Camera2StreamConfigurationMap);
                    this.getHighSpeedVideoFpsRangesFor &= -3;
                }
                enumEntry.getHighSpeedVideoFpsRanges = this.Camera2StreamConfigurationMap;
                enumEntry.getHighResolutionOutputSizeshNQ4ISI = b;
                return enumEntry;
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite.Builder
            public final kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.EnumEntry.Builder mergeFrom(kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.EnumEntry enumEntry) {
                if (enumEntry == kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.EnumEntry.getDefaultInstance()) {
                    return this;
                }
                if (enumEntry.hasName()) {
                    setName(enumEntry.getName());
                }
                if (!enumEntry.getHighSpeedVideoFpsRanges.isEmpty()) {
                    if (this.Camera2StreamConfigurationMap.isEmpty()) {
                        this.Camera2StreamConfigurationMap = enumEntry.getHighSpeedVideoFpsRanges;
                        this.getHighSpeedVideoFpsRangesFor &= -3;
                    } else {
                        getHighSpeedVideoFpsRangesFor();
                        this.Camera2StreamConfigurationMap.addAll(enumEntry.getHighSpeedVideoFpsRanges);
                    }
                }
                mergeExtensionFields(enumEntry);
                setUnknownFields(getUnknownFields().concat(enumEntry.getInputSizeshNQ4ISI));
                return this;
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.MessageLiteOrBuilder
            public final boolean isInitialized() {
                for (int i = 0; i < getAnnotationCount(); i++) {
                    if (!getAnnotation(i).isInitialized()) {
                        return false;
                    }
                }
                return extensionsAreInitialized();
            }

            /* JADX WARN: Removed duplicated region for block: B:15:0x001d  */
            @Override // kotlin.reflect.jvm.internal.impl.protobuf.AbstractMessageLite.Builder, kotlin.reflect.jvm.internal.impl.protobuf.MessageLite.Builder
            /*
                Code decompiled incorrectly, please refer to instructions dump.
            */
            public final kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.EnumEntry.Builder mergeFrom(kotlin.reflect.jvm.internal.impl.protobuf.CodedInputStream codedInputStream, kotlin.reflect.jvm.internal.impl.protobuf.ExtensionRegistryLite extensionRegistryLite) throws java.io.IOException {
                kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.EnumEntry enumEntry;
                try {
                    try {
                        kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.EnumEntry parsePartialFrom = kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.EnumEntry.PARSER.parsePartialFrom(codedInputStream, extensionRegistryLite);
                        if (parsePartialFrom != null) {
                            mergeFrom(parsePartialFrom);
                        }
                        return this;
                    } catch (kotlin.reflect.jvm.internal.impl.protobuf.InvalidProtocolBufferException e) {
                        enumEntry = (kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.EnumEntry) e.getUnfinishedMessage();
                        try {
                            throw e;
                        } catch (java.lang.Throwable th) {
                            th = th;
                            if (enumEntry != null) {
                                mergeFrom(enumEntry);
                            }
                            throw th;
                        }
                    }
                } catch (java.lang.Throwable th2) {
                    th = th2;
                    enumEntry = null;
                    if (enumEntry != null) {
                    }
                    throw th;
                }
            }

            public final kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.EnumEntry.Builder setName(int i) {
                this.getHighSpeedVideoFpsRangesFor |= 1;
                this.getHighSpeedVideoFpsRanges = i;
                return this;
            }

            private void getHighSpeedVideoFpsRangesFor() {
                if ((this.getHighSpeedVideoFpsRangesFor & 2) != 2) {
                    this.Camera2StreamConfigurationMap = new java.util.ArrayList(this.Camera2StreamConfigurationMap);
                    this.getHighSpeedVideoFpsRangesFor |= 2;
                }
            }

            public final int getAnnotationCount() {
                return this.Camera2StreamConfigurationMap.size();
            }

            public final kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Annotation getAnnotation(int i) {
                return this.Camera2StreamConfigurationMap.get(i);
            }

            public final kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.EnumEntry.Builder addAnnotation(kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Annotation annotation) {
                getHighSpeedVideoFpsRangesFor();
                this.Camera2StreamConfigurationMap.add(annotation);
                return this;
            }

            static /* synthetic */ kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.EnumEntry.Builder getHighResolutionOutputSizeshNQ4ISI() {
                return new kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.EnumEntry.Builder();
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite.ExtendableBuilder, kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite.Builder, kotlin.reflect.jvm.internal.impl.protobuf.AbstractMessageLite.Builder
            /* renamed from: clone */
            public final kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.EnumEntry.Builder mo23897clone() {
                return new kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.EnumEntry.Builder().mergeFrom(buildPartial());
            }
        }
    }

    public static final class VersionRequirement extends kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite implements kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.VersionRequirementOrBuilder {
        public static kotlin.reflect.jvm.internal.impl.protobuf.Parser<kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.VersionRequirement> PARSER = new kotlin.reflect.jvm.internal.impl.protobuf.AbstractParser<kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.VersionRequirement>() { // from class: kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.VersionRequirement.1
            @Override // kotlin.reflect.jvm.internal.impl.protobuf.Parser
            public final /* synthetic */ java.lang.Object parsePartialFrom(kotlin.reflect.jvm.internal.impl.protobuf.CodedInputStream codedInputStream, kotlin.reflect.jvm.internal.impl.protobuf.ExtensionRegistryLite extensionRegistryLite) throws kotlin.reflect.jvm.internal.impl.protobuf.InvalidProtocolBufferException {
                return new kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.VersionRequirement(codedInputStream, extensionRegistryLite, (byte) 0);
            }
        };
        private static final kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.VersionRequirement getHighSpeedVideoFpsRangesFor;
        private int Camera2StreamConfigurationMap;
        private kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.VersionRequirement.Level getHighResolutionOutputSizeshNQ4ISI;
        private int getHighSpeedVideoFpsRanges;
        private byte getHighSpeedVideoSizes;
        private final kotlin.reflect.jvm.internal.impl.protobuf.ByteString getHighSpeedVideoSizesFor;
        private kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.VersionRequirement.VersionKind getInputFormats;
        private int getInputSizeshNQ4ISI;
        private int getOutputFormats;
        private int getOutputMinFrameDuration;
        private int getOutputStallDurationlomOqCM;

        /* synthetic */ VersionRequirement(kotlin.reflect.jvm.internal.impl.protobuf.CodedInputStream codedInputStream, kotlin.reflect.jvm.internal.impl.protobuf.ExtensionRegistryLite extensionRegistryLite, byte b) throws kotlin.reflect.jvm.internal.impl.protobuf.InvalidProtocolBufferException {
            this(codedInputStream, extensionRegistryLite);
        }

        /* synthetic */ VersionRequirement(kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite.Builder builder, byte b) {
            this(builder);
        }

        private VersionRequirement(kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite.Builder builder) {
            super(builder);
            this.getHighSpeedVideoSizes = (byte) -1;
            this.getInputSizeshNQ4ISI = -1;
            this.getHighSpeedVideoSizesFor = builder.getUnknownFields();
        }

        private VersionRequirement() {
            this.getHighSpeedVideoSizes = (byte) -1;
            this.getInputSizeshNQ4ISI = -1;
            this.getHighSpeedVideoSizesFor = kotlin.reflect.jvm.internal.impl.protobuf.ByteString.EMPTY;
        }

        public static kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.VersionRequirement getDefaultInstance() {
            return getHighSpeedVideoFpsRangesFor;
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.MessageLiteOrBuilder
        public final kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.VersionRequirement getDefaultInstanceForType() {
            return getHighSpeedVideoFpsRangesFor;
        }

        private VersionRequirement(kotlin.reflect.jvm.internal.impl.protobuf.CodedInputStream codedInputStream, kotlin.reflect.jvm.internal.impl.protobuf.ExtensionRegistryLite extensionRegistryLite) throws kotlin.reflect.jvm.internal.impl.protobuf.InvalidProtocolBufferException {
            this.getHighSpeedVideoSizes = (byte) -1;
            this.getInputSizeshNQ4ISI = -1;
            Camera2StreamConfigurationMap();
            kotlin.reflect.jvm.internal.impl.protobuf.ByteString.Output newOutput = kotlin.reflect.jvm.internal.impl.protobuf.ByteString.newOutput();
            kotlin.reflect.jvm.internal.impl.protobuf.CodedOutputStream newInstance = kotlin.reflect.jvm.internal.impl.protobuf.CodedOutputStream.newInstance(newOutput, 1);
            boolean z = false;
            while (!z) {
                try {
                    try {
                        int readTag = codedInputStream.readTag();
                        if (readTag != 0) {
                            if (readTag == 8) {
                                this.Camera2StreamConfigurationMap |= 1;
                                this.getOutputStallDurationlomOqCM = codedInputStream.readInt32();
                            } else if (readTag == 16) {
                                this.Camera2StreamConfigurationMap |= 2;
                                this.getOutputMinFrameDuration = codedInputStream.readInt32();
                            } else if (readTag == 24) {
                                int readEnum = codedInputStream.readEnum();
                                kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.VersionRequirement.Level valueOf = kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.VersionRequirement.Level.valueOf(readEnum);
                                if (valueOf == null) {
                                    newInstance.writeRawVarint32(readTag);
                                    newInstance.writeRawVarint32(readEnum);
                                } else {
                                    this.Camera2StreamConfigurationMap |= 4;
                                    this.getHighResolutionOutputSizeshNQ4ISI = valueOf;
                                }
                            } else if (readTag == 32) {
                                this.Camera2StreamConfigurationMap |= 8;
                                this.getHighSpeedVideoFpsRanges = codedInputStream.readInt32();
                            } else if (readTag == 40) {
                                this.Camera2StreamConfigurationMap |= 16;
                                this.getOutputFormats = codedInputStream.readInt32();
                            } else if (readTag == 48) {
                                int readEnum2 = codedInputStream.readEnum();
                                kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.VersionRequirement.VersionKind valueOf2 = kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.VersionRequirement.VersionKind.valueOf(readEnum2);
                                if (valueOf2 == null) {
                                    newInstance.writeRawVarint32(readTag);
                                    newInstance.writeRawVarint32(readEnum2);
                                } else {
                                    this.Camera2StreamConfigurationMap |= 32;
                                    this.getInputFormats = valueOf2;
                                }
                            } else if (!parseUnknownField(codedInputStream, newInstance, extensionRegistryLite, readTag)) {
                            }
                        }
                        z = true;
                    } catch (java.lang.Throwable th) {
                        try {
                            newInstance.flush();
                        } catch (java.io.IOException unused) {
                        } catch (java.lang.Throwable th2) {
                            this.getHighSpeedVideoSizesFor = newOutput.toByteString();
                            throw th2;
                        }
                        this.getHighSpeedVideoSizesFor = newOutput.toByteString();
                        makeExtensionsImmutable();
                        throw th;
                    }
                } catch (kotlin.reflect.jvm.internal.impl.protobuf.InvalidProtocolBufferException e) {
                    throw e.setUnfinishedMessage(this);
                } catch (java.io.IOException e2) {
                    throw new kotlin.reflect.jvm.internal.impl.protobuf.InvalidProtocolBufferException(e2.getMessage()).setUnfinishedMessage(this);
                }
            }
            try {
                newInstance.flush();
            } catch (java.io.IOException unused2) {
            } catch (java.lang.Throwable th3) {
                this.getHighSpeedVideoSizesFor = newOutput.toByteString();
                throw th3;
            }
            this.getHighSpeedVideoSizesFor = newOutput.toByteString();
            makeExtensionsImmutable();
        }

        static {
            kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.VersionRequirement versionRequirement = new kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.VersionRequirement();
            getHighSpeedVideoFpsRangesFor = versionRequirement;
            versionRequirement.Camera2StreamConfigurationMap();
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite, kotlin.reflect.jvm.internal.impl.protobuf.MessageLite
        public final kotlin.reflect.jvm.internal.impl.protobuf.Parser<kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.VersionRequirement> getParserForType() {
            return PARSER;
        }

        public enum Level implements kotlin.reflect.jvm.internal.impl.protobuf.Internal.EnumLite {
            WARNING(0),
            ERROR(1),
            HIDDEN(2);

            private static kotlin.reflect.jvm.internal.impl.protobuf.Internal.EnumLiteMap<kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.VersionRequirement.Level> getHighSpeedVideoFpsRangesFor = new kotlin.reflect.jvm.internal.impl.protobuf.Internal.EnumLiteMap<kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.VersionRequirement.Level>() { // from class: kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.VersionRequirement.Level.1
                @Override // kotlin.reflect.jvm.internal.impl.protobuf.Internal.EnumLiteMap
                public final /* synthetic */ kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.VersionRequirement.Level findValueByNumber(int i) {
                    return kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.VersionRequirement.Level.valueOf(i);
                }
            };
            private final int getHighResolutionOutputSizeshNQ4ISI;

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.Internal.EnumLite
            public final int getNumber() {
                return this.getHighResolutionOutputSizeshNQ4ISI;
            }

            public static kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.VersionRequirement.Level valueOf(int i) {
                if (i == 0) {
                    return WARNING;
                }
                if (i == 1) {
                    return ERROR;
                }
                if (i != 2) {
                    return null;
                }
                return HIDDEN;
            }

            Level(int i) {
                this.getHighResolutionOutputSizeshNQ4ISI = i;
            }
        }

        public enum VersionKind implements kotlin.reflect.jvm.internal.impl.protobuf.Internal.EnumLite {
            LANGUAGE_VERSION(0),
            COMPILER_VERSION(1),
            API_VERSION(2);

            private static kotlin.reflect.jvm.internal.impl.protobuf.Internal.EnumLiteMap<kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.VersionRequirement.VersionKind> Camera2StreamConfigurationMap = new kotlin.reflect.jvm.internal.impl.protobuf.Internal.EnumLiteMap<kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.VersionRequirement.VersionKind>() { // from class: kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.VersionRequirement.VersionKind.1
                @Override // kotlin.reflect.jvm.internal.impl.protobuf.Internal.EnumLiteMap
                public final /* synthetic */ kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.VersionRequirement.VersionKind findValueByNumber(int i) {
                    return kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.VersionRequirement.VersionKind.valueOf(i);
                }
            };
            private final int getHighResolutionOutputSizeshNQ4ISI;

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.Internal.EnumLite
            public final int getNumber() {
                return this.getHighResolutionOutputSizeshNQ4ISI;
            }

            public static kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.VersionRequirement.VersionKind valueOf(int i) {
                if (i == 0) {
                    return LANGUAGE_VERSION;
                }
                if (i == 1) {
                    return COMPILER_VERSION;
                }
                if (i != 2) {
                    return null;
                }
                return API_VERSION;
            }

            VersionKind(int i) {
                this.getHighResolutionOutputSizeshNQ4ISI = i;
            }
        }

        public final boolean hasVersion() {
            return (this.Camera2StreamConfigurationMap & 1) == 1;
        }

        public final int getVersion() {
            return this.getOutputStallDurationlomOqCM;
        }

        public final boolean hasVersionFull() {
            return (this.Camera2StreamConfigurationMap & 2) == 2;
        }

        public final int getVersionFull() {
            return this.getOutputMinFrameDuration;
        }

        public final boolean hasLevel() {
            return (this.Camera2StreamConfigurationMap & 4) == 4;
        }

        public final kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.VersionRequirement.Level getLevel() {
            return this.getHighResolutionOutputSizeshNQ4ISI;
        }

        public final boolean hasErrorCode() {
            return (this.Camera2StreamConfigurationMap & 8) == 8;
        }

        public final int getErrorCode() {
            return this.getHighSpeedVideoFpsRanges;
        }

        public final boolean hasMessage() {
            return (this.Camera2StreamConfigurationMap & 16) == 16;
        }

        public final int getMessage() {
            return this.getOutputFormats;
        }

        public final boolean hasVersionKind() {
            return (this.Camera2StreamConfigurationMap & 32) == 32;
        }

        public final kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.VersionRequirement.VersionKind getVersionKind() {
            return this.getInputFormats;
        }

        private void Camera2StreamConfigurationMap() {
            this.getOutputStallDurationlomOqCM = 0;
            this.getOutputMinFrameDuration = 0;
            this.getHighResolutionOutputSizeshNQ4ISI = kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.VersionRequirement.Level.ERROR;
            this.getHighSpeedVideoFpsRanges = 0;
            this.getOutputFormats = 0;
            this.getInputFormats = kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.VersionRequirement.VersionKind.LANGUAGE_VERSION;
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.MessageLiteOrBuilder
        public final boolean isInitialized() {
            byte b = this.getHighSpeedVideoSizes;
            if (b == 1) {
                return true;
            }
            if (b == 0) {
                return false;
            }
            this.getHighSpeedVideoSizes = (byte) 1;
            return true;
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.MessageLite
        public final void writeTo(kotlin.reflect.jvm.internal.impl.protobuf.CodedOutputStream codedOutputStream) throws java.io.IOException {
            getSerializedSize();
            if ((this.Camera2StreamConfigurationMap & 1) == 1) {
                codedOutputStream.writeInt32(1, this.getOutputStallDurationlomOqCM);
            }
            if ((this.Camera2StreamConfigurationMap & 2) == 2) {
                codedOutputStream.writeInt32(2, this.getOutputMinFrameDuration);
            }
            if ((this.Camera2StreamConfigurationMap & 4) == 4) {
                codedOutputStream.writeEnum(3, this.getHighResolutionOutputSizeshNQ4ISI.getNumber());
            }
            if ((this.Camera2StreamConfigurationMap & 8) == 8) {
                codedOutputStream.writeInt32(4, this.getHighSpeedVideoFpsRanges);
            }
            if ((this.Camera2StreamConfigurationMap & 16) == 16) {
                codedOutputStream.writeInt32(5, this.getOutputFormats);
            }
            if ((this.Camera2StreamConfigurationMap & 32) == 32) {
                codedOutputStream.writeEnum(6, this.getInputFormats.getNumber());
            }
            codedOutputStream.writeRawBytes(this.getHighSpeedVideoSizesFor);
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.MessageLite
        public final int getSerializedSize() {
            int i = this.getInputSizeshNQ4ISI;
            if (i != -1) {
                return i;
            }
            int computeInt32Size = (this.Camera2StreamConfigurationMap & 1) == 1 ? kotlin.reflect.jvm.internal.impl.protobuf.CodedOutputStream.computeInt32Size(1, this.getOutputStallDurationlomOqCM) : 0;
            if ((this.Camera2StreamConfigurationMap & 2) == 2) {
                computeInt32Size += kotlin.reflect.jvm.internal.impl.protobuf.CodedOutputStream.computeInt32Size(2, this.getOutputMinFrameDuration);
            }
            if ((this.Camera2StreamConfigurationMap & 4) == 4) {
                computeInt32Size += kotlin.reflect.jvm.internal.impl.protobuf.CodedOutputStream.computeEnumSize(3, this.getHighResolutionOutputSizeshNQ4ISI.getNumber());
            }
            if ((this.Camera2StreamConfigurationMap & 8) == 8) {
                computeInt32Size += kotlin.reflect.jvm.internal.impl.protobuf.CodedOutputStream.computeInt32Size(4, this.getHighSpeedVideoFpsRanges);
            }
            if ((this.Camera2StreamConfigurationMap & 16) == 16) {
                computeInt32Size += kotlin.reflect.jvm.internal.impl.protobuf.CodedOutputStream.computeInt32Size(5, this.getOutputFormats);
            }
            if ((this.Camera2StreamConfigurationMap & 32) == 32) {
                computeInt32Size += kotlin.reflect.jvm.internal.impl.protobuf.CodedOutputStream.computeEnumSize(6, this.getInputFormats.getNumber());
            }
            int size = computeInt32Size + this.getHighSpeedVideoSizesFor.size();
            this.getInputSizeshNQ4ISI = size;
            return size;
        }

        public static kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.VersionRequirement.Builder newBuilder() {
            return kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.VersionRequirement.Builder.getHighResolutionOutputSizeshNQ4ISI();
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.MessageLite
        public final kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.VersionRequirement.Builder newBuilderForType() {
            return newBuilder();
        }

        public static kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.VersionRequirement.Builder newBuilder(kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.VersionRequirement versionRequirement) {
            return newBuilder().mergeFrom(versionRequirement);
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.MessageLite
        public final kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.VersionRequirement.Builder toBuilder() {
            return newBuilder(this);
        }

        public static final class Builder extends kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite.Builder<kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.VersionRequirement, kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.VersionRequirement.Builder> implements kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.VersionRequirementOrBuilder {
            private int Camera2StreamConfigurationMap;
            private int getHighResolutionOutputSizeshNQ4ISI;
            private int getHighSpeedVideoFpsRanges;
            private int getHighSpeedVideoFpsRangesFor;
            private int getInputSizeshNQ4ISI;
            private kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.VersionRequirement.Level getHighSpeedVideoSizes = kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.VersionRequirement.Level.ERROR;
            private kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.VersionRequirement.VersionKind getOutputMinFrameDuration = kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.VersionRequirement.VersionKind.LANGUAGE_VERSION;

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.MessageLiteOrBuilder
            public final boolean isInitialized() {
                return true;
            }

            private Builder() {
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite.Builder, kotlin.reflect.jvm.internal.impl.protobuf.MessageLiteOrBuilder
            public final kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.VersionRequirement getDefaultInstanceForType() {
                return kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.VersionRequirement.getDefaultInstance();
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.MessageLite.Builder
            public final kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.VersionRequirement build() {
                kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.VersionRequirement buildPartial = buildPartial();
                if (buildPartial.isInitialized()) {
                    return buildPartial;
                }
                throw newUninitializedMessageException(buildPartial);
            }

            /* JADX WARN: Multi-variable type inference failed */
            public final kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.VersionRequirement buildPartial() {
                kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.VersionRequirement versionRequirement = new kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.VersionRequirement((kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite.Builder) this, (byte) (0 == true ? 1 : 0));
                int i = this.getHighResolutionOutputSizeshNQ4ISI;
                int i2 = (i & 1) == 1 ? 1 : 0;
                versionRequirement.getOutputStallDurationlomOqCM = this.getInputSizeshNQ4ISI;
                if ((i & 2) == 2) {
                    i2 |= 2;
                }
                versionRequirement.getOutputMinFrameDuration = this.getHighSpeedVideoFpsRanges;
                if ((i & 4) == 4) {
                    i2 |= 4;
                }
                versionRequirement.getHighResolutionOutputSizeshNQ4ISI = this.getHighSpeedVideoSizes;
                if ((i & 8) == 8) {
                    i2 |= 8;
                }
                versionRequirement.getHighSpeedVideoFpsRanges = this.Camera2StreamConfigurationMap;
                if ((i & 16) == 16) {
                    i2 |= 16;
                }
                versionRequirement.getOutputFormats = this.getHighSpeedVideoFpsRangesFor;
                if ((i & 32) == 32) {
                    i2 |= 32;
                }
                versionRequirement.getInputFormats = this.getOutputMinFrameDuration;
                versionRequirement.Camera2StreamConfigurationMap = i2;
                return versionRequirement;
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite.Builder
            public final kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.VersionRequirement.Builder mergeFrom(kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.VersionRequirement versionRequirement) {
                if (versionRequirement == kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.VersionRequirement.getDefaultInstance()) {
                    return this;
                }
                if (versionRequirement.hasVersion()) {
                    setVersion(versionRequirement.getVersion());
                }
                if (versionRequirement.hasVersionFull()) {
                    setVersionFull(versionRequirement.getVersionFull());
                }
                if (versionRequirement.hasLevel()) {
                    setLevel(versionRequirement.getLevel());
                }
                if (versionRequirement.hasErrorCode()) {
                    setErrorCode(versionRequirement.getErrorCode());
                }
                if (versionRequirement.hasMessage()) {
                    setMessage(versionRequirement.getMessage());
                }
                if (versionRequirement.hasVersionKind()) {
                    setVersionKind(versionRequirement.getVersionKind());
                }
                setUnknownFields(getUnknownFields().concat(versionRequirement.getHighSpeedVideoSizesFor));
                return this;
            }

            /* JADX WARN: Removed duplicated region for block: B:15:0x001d  */
            @Override // kotlin.reflect.jvm.internal.impl.protobuf.AbstractMessageLite.Builder, kotlin.reflect.jvm.internal.impl.protobuf.MessageLite.Builder
            /*
                Code decompiled incorrectly, please refer to instructions dump.
            */
            public final kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.VersionRequirement.Builder mergeFrom(kotlin.reflect.jvm.internal.impl.protobuf.CodedInputStream codedInputStream, kotlin.reflect.jvm.internal.impl.protobuf.ExtensionRegistryLite extensionRegistryLite) throws java.io.IOException {
                kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.VersionRequirement versionRequirement;
                try {
                    try {
                        kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.VersionRequirement parsePartialFrom = kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.VersionRequirement.PARSER.parsePartialFrom(codedInputStream, extensionRegistryLite);
                        if (parsePartialFrom != null) {
                            mergeFrom(parsePartialFrom);
                        }
                        return this;
                    } catch (kotlin.reflect.jvm.internal.impl.protobuf.InvalidProtocolBufferException e) {
                        versionRequirement = (kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.VersionRequirement) e.getUnfinishedMessage();
                        try {
                            throw e;
                        } catch (java.lang.Throwable th) {
                            th = th;
                            if (versionRequirement != null) {
                                mergeFrom(versionRequirement);
                            }
                            throw th;
                        }
                    }
                } catch (java.lang.Throwable th2) {
                    th = th2;
                    versionRequirement = null;
                    if (versionRequirement != null) {
                    }
                    throw th;
                }
            }

            public final kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.VersionRequirement.Builder setVersion(int i) {
                this.getHighResolutionOutputSizeshNQ4ISI |= 1;
                this.getInputSizeshNQ4ISI = i;
                return this;
            }

            public final kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.VersionRequirement.Builder setVersionFull(int i) {
                this.getHighResolutionOutputSizeshNQ4ISI |= 2;
                this.getHighSpeedVideoFpsRanges = i;
                return this;
            }

            public final kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.VersionRequirement.Builder setLevel(kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.VersionRequirement.Level level) {
                this.getHighResolutionOutputSizeshNQ4ISI |= 4;
                this.getHighSpeedVideoSizes = level;
                return this;
            }

            public final kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.VersionRequirement.Builder setErrorCode(int i) {
                this.getHighResolutionOutputSizeshNQ4ISI |= 8;
                this.Camera2StreamConfigurationMap = i;
                return this;
            }

            public final kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.VersionRequirement.Builder setMessage(int i) {
                this.getHighResolutionOutputSizeshNQ4ISI |= 16;
                this.getHighSpeedVideoFpsRangesFor = i;
                return this;
            }

            public final kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.VersionRequirement.Builder setVersionKind(kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.VersionRequirement.VersionKind versionKind) {
                this.getHighResolutionOutputSizeshNQ4ISI |= 32;
                this.getOutputMinFrameDuration = versionKind;
                return this;
            }

            static /* synthetic */ kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.VersionRequirement.Builder getHighResolutionOutputSizeshNQ4ISI() {
                return new kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.VersionRequirement.Builder();
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite.Builder, kotlin.reflect.jvm.internal.impl.protobuf.AbstractMessageLite.Builder
            /* renamed from: clone */
            public final kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.VersionRequirement.Builder mo23897clone() {
                return new kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.VersionRequirement.Builder().mergeFrom(buildPartial());
            }
        }
    }

    public static final class VersionRequirementTable extends kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite implements kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.VersionRequirementTableOrBuilder {
        public static kotlin.reflect.jvm.internal.impl.protobuf.Parser<kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.VersionRequirementTable> PARSER = new kotlin.reflect.jvm.internal.impl.protobuf.AbstractParser<kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.VersionRequirementTable>() { // from class: kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.VersionRequirementTable.1
            @Override // kotlin.reflect.jvm.internal.impl.protobuf.Parser
            public final /* synthetic */ java.lang.Object parsePartialFrom(kotlin.reflect.jvm.internal.impl.protobuf.CodedInputStream codedInputStream, kotlin.reflect.jvm.internal.impl.protobuf.ExtensionRegistryLite extensionRegistryLite) throws kotlin.reflect.jvm.internal.impl.protobuf.InvalidProtocolBufferException {
                return new kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.VersionRequirementTable(codedInputStream, extensionRegistryLite, (byte) 0);
            }
        };
        private static final kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.VersionRequirementTable getHighSpeedVideoFpsRangesFor;
        private int Camera2StreamConfigurationMap;
        private java.util.List<kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.VersionRequirement> getHighResolutionOutputSizeshNQ4ISI;
        private final kotlin.reflect.jvm.internal.impl.protobuf.ByteString getHighSpeedVideoFpsRanges;
        private byte getHighSpeedVideoSizes;

        /* synthetic */ VersionRequirementTable(kotlin.reflect.jvm.internal.impl.protobuf.CodedInputStream codedInputStream, kotlin.reflect.jvm.internal.impl.protobuf.ExtensionRegistryLite extensionRegistryLite, byte b) throws kotlin.reflect.jvm.internal.impl.protobuf.InvalidProtocolBufferException {
            this(codedInputStream, extensionRegistryLite);
        }

        /* synthetic */ VersionRequirementTable(kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite.Builder builder, byte b) {
            this(builder);
        }

        private VersionRequirementTable(kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite.Builder builder) {
            super(builder);
            this.getHighSpeedVideoSizes = (byte) -1;
            this.Camera2StreamConfigurationMap = -1;
            this.getHighSpeedVideoFpsRanges = builder.getUnknownFields();
        }

        private VersionRequirementTable() {
            this.getHighSpeedVideoSizes = (byte) -1;
            this.Camera2StreamConfigurationMap = -1;
            this.getHighSpeedVideoFpsRanges = kotlin.reflect.jvm.internal.impl.protobuf.ByteString.EMPTY;
        }

        public static kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.VersionRequirementTable getDefaultInstance() {
            return getHighSpeedVideoFpsRangesFor;
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.MessageLiteOrBuilder
        public final kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.VersionRequirementTable getDefaultInstanceForType() {
            return getHighSpeedVideoFpsRangesFor;
        }

        /* JADX WARN: Multi-variable type inference failed */
        private VersionRequirementTable(kotlin.reflect.jvm.internal.impl.protobuf.CodedInputStream codedInputStream, kotlin.reflect.jvm.internal.impl.protobuf.ExtensionRegistryLite extensionRegistryLite) throws kotlin.reflect.jvm.internal.impl.protobuf.InvalidProtocolBufferException {
            this.getHighSpeedVideoSizes = (byte) -1;
            this.Camera2StreamConfigurationMap = -1;
            this.getHighResolutionOutputSizeshNQ4ISI = java.util.Collections.emptyList();
            kotlin.reflect.jvm.internal.impl.protobuf.ByteString.Output newOutput = kotlin.reflect.jvm.internal.impl.protobuf.ByteString.newOutput();
            kotlin.reflect.jvm.internal.impl.protobuf.CodedOutputStream newInstance = kotlin.reflect.jvm.internal.impl.protobuf.CodedOutputStream.newInstance(newOutput, 1);
            boolean z = false;
            boolean z2 = false;
            while (!z) {
                try {
                    try {
                        int readTag = codedInputStream.readTag();
                        if (readTag != 0) {
                            if (readTag == 10) {
                                if (!z2) {
                                    this.getHighResolutionOutputSizeshNQ4ISI = new java.util.ArrayList();
                                    z2 = true;
                                }
                                this.getHighResolutionOutputSizeshNQ4ISI.add(codedInputStream.readMessage(kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.VersionRequirement.PARSER, extensionRegistryLite));
                            } else if (!parseUnknownField(codedInputStream, newInstance, extensionRegistryLite, readTag)) {
                            }
                        }
                        z = true;
                    } catch (kotlin.reflect.jvm.internal.impl.protobuf.InvalidProtocolBufferException e) {
                        throw e.setUnfinishedMessage(this);
                    } catch (java.io.IOException e2) {
                        throw new kotlin.reflect.jvm.internal.impl.protobuf.InvalidProtocolBufferException(e2.getMessage()).setUnfinishedMessage(this);
                    }
                } catch (java.lang.Throwable th) {
                    if (z2) {
                        this.getHighResolutionOutputSizeshNQ4ISI = java.util.Collections.unmodifiableList(this.getHighResolutionOutputSizeshNQ4ISI);
                    }
                    try {
                        newInstance.flush();
                    } catch (java.io.IOException unused) {
                    } catch (java.lang.Throwable th2) {
                        this.getHighSpeedVideoFpsRanges = newOutput.toByteString();
                        throw th2;
                    }
                    this.getHighSpeedVideoFpsRanges = newOutput.toByteString();
                    makeExtensionsImmutable();
                    throw th;
                }
            }
            if (z2) {
                this.getHighResolutionOutputSizeshNQ4ISI = java.util.Collections.unmodifiableList(this.getHighResolutionOutputSizeshNQ4ISI);
            }
            try {
                newInstance.flush();
            } catch (java.io.IOException unused2) {
            } catch (java.lang.Throwable th3) {
                this.getHighSpeedVideoFpsRanges = newOutput.toByteString();
                throw th3;
            }
            this.getHighSpeedVideoFpsRanges = newOutput.toByteString();
            makeExtensionsImmutable();
        }

        static {
            kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.VersionRequirementTable versionRequirementTable = new kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.VersionRequirementTable();
            getHighSpeedVideoFpsRangesFor = versionRequirementTable;
            versionRequirementTable.getHighResolutionOutputSizeshNQ4ISI = java.util.Collections.emptyList();
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite, kotlin.reflect.jvm.internal.impl.protobuf.MessageLite
        public final kotlin.reflect.jvm.internal.impl.protobuf.Parser<kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.VersionRequirementTable> getParserForType() {
            return PARSER;
        }

        public final java.util.List<kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.VersionRequirement> getRequirementList() {
            return this.getHighResolutionOutputSizeshNQ4ISI;
        }

        public final int getRequirementCount() {
            return this.getHighResolutionOutputSizeshNQ4ISI.size();
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.MessageLiteOrBuilder
        public final boolean isInitialized() {
            byte b = this.getHighSpeedVideoSizes;
            if (b == 1) {
                return true;
            }
            if (b == 0) {
                return false;
            }
            this.getHighSpeedVideoSizes = (byte) 1;
            return true;
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.MessageLite
        public final void writeTo(kotlin.reflect.jvm.internal.impl.protobuf.CodedOutputStream codedOutputStream) throws java.io.IOException {
            getSerializedSize();
            for (int i = 0; i < this.getHighResolutionOutputSizeshNQ4ISI.size(); i++) {
                codedOutputStream.writeMessage(1, this.getHighResolutionOutputSizeshNQ4ISI.get(i));
            }
            codedOutputStream.writeRawBytes(this.getHighSpeedVideoFpsRanges);
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.MessageLite
        public final int getSerializedSize() {
            int i = this.Camera2StreamConfigurationMap;
            if (i != -1) {
                return i;
            }
            int i2 = 0;
            for (int i3 = 0; i3 < this.getHighResolutionOutputSizeshNQ4ISI.size(); i3++) {
                i2 += kotlin.reflect.jvm.internal.impl.protobuf.CodedOutputStream.computeMessageSize(1, this.getHighResolutionOutputSizeshNQ4ISI.get(i3));
            }
            int size = i2 + this.getHighSpeedVideoFpsRanges.size();
            this.Camera2StreamConfigurationMap = size;
            return size;
        }

        public static kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.VersionRequirementTable.Builder newBuilder() {
            return kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.VersionRequirementTable.Builder.getHighSpeedVideoFpsRanges();
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.MessageLite
        public final kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.VersionRequirementTable.Builder newBuilderForType() {
            return newBuilder();
        }

        public static kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.VersionRequirementTable.Builder newBuilder(kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.VersionRequirementTable versionRequirementTable) {
            return newBuilder().mergeFrom(versionRequirementTable);
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.MessageLite
        public final kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.VersionRequirementTable.Builder toBuilder() {
            return newBuilder(this);
        }

        public static final class Builder extends kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite.Builder<kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.VersionRequirementTable, kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.VersionRequirementTable.Builder> implements kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.VersionRequirementTableOrBuilder {
            private java.util.List<kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.VersionRequirement> getHighResolutionOutputSizeshNQ4ISI = java.util.Collections.emptyList();
            private int getHighSpeedVideoFpsRanges;

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.MessageLiteOrBuilder
            public final boolean isInitialized() {
                return true;
            }

            private Builder() {
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite.Builder, kotlin.reflect.jvm.internal.impl.protobuf.MessageLiteOrBuilder
            public final kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.VersionRequirementTable getDefaultInstanceForType() {
                return kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.VersionRequirementTable.getDefaultInstance();
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.MessageLite.Builder
            public final kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.VersionRequirementTable build() {
                kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.VersionRequirementTable buildPartial = buildPartial();
                if (buildPartial.isInitialized()) {
                    return buildPartial;
                }
                throw newUninitializedMessageException(buildPartial);
            }

            public final kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.VersionRequirementTable buildPartial() {
                kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.VersionRequirementTable versionRequirementTable = new kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.VersionRequirementTable((kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite.Builder) this, (byte) 0);
                if ((this.getHighSpeedVideoFpsRanges & 1) == 1) {
                    this.getHighResolutionOutputSizeshNQ4ISI = java.util.Collections.unmodifiableList(this.getHighResolutionOutputSizeshNQ4ISI);
                    this.getHighSpeedVideoFpsRanges &= -2;
                }
                versionRequirementTable.getHighResolutionOutputSizeshNQ4ISI = this.getHighResolutionOutputSizeshNQ4ISI;
                return versionRequirementTable;
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite.Builder
            public final kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.VersionRequirementTable.Builder mergeFrom(kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.VersionRequirementTable versionRequirementTable) {
                if (versionRequirementTable == kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.VersionRequirementTable.getDefaultInstance()) {
                    return this;
                }
                if (!versionRequirementTable.getHighResolutionOutputSizeshNQ4ISI.isEmpty()) {
                    if (this.getHighResolutionOutputSizeshNQ4ISI.isEmpty()) {
                        this.getHighResolutionOutputSizeshNQ4ISI = versionRequirementTable.getHighResolutionOutputSizeshNQ4ISI;
                        this.getHighSpeedVideoFpsRanges &= -2;
                    } else {
                        if ((this.getHighSpeedVideoFpsRanges & 1) != 1) {
                            this.getHighResolutionOutputSizeshNQ4ISI = new java.util.ArrayList(this.getHighResolutionOutputSizeshNQ4ISI);
                            this.getHighSpeedVideoFpsRanges |= 1;
                        }
                        this.getHighResolutionOutputSizeshNQ4ISI.addAll(versionRequirementTable.getHighResolutionOutputSizeshNQ4ISI);
                    }
                }
                setUnknownFields(getUnknownFields().concat(versionRequirementTable.getHighSpeedVideoFpsRanges));
                return this;
            }

            /* JADX WARN: Removed duplicated region for block: B:15:0x001d  */
            @Override // kotlin.reflect.jvm.internal.impl.protobuf.AbstractMessageLite.Builder, kotlin.reflect.jvm.internal.impl.protobuf.MessageLite.Builder
            /*
                Code decompiled incorrectly, please refer to instructions dump.
            */
            public final kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.VersionRequirementTable.Builder mergeFrom(kotlin.reflect.jvm.internal.impl.protobuf.CodedInputStream codedInputStream, kotlin.reflect.jvm.internal.impl.protobuf.ExtensionRegistryLite extensionRegistryLite) throws java.io.IOException {
                kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.VersionRequirementTable versionRequirementTable;
                try {
                    try {
                        kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.VersionRequirementTable parsePartialFrom = kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.VersionRequirementTable.PARSER.parsePartialFrom(codedInputStream, extensionRegistryLite);
                        if (parsePartialFrom != null) {
                            mergeFrom(parsePartialFrom);
                        }
                        return this;
                    } catch (kotlin.reflect.jvm.internal.impl.protobuf.InvalidProtocolBufferException e) {
                        versionRequirementTable = (kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.VersionRequirementTable) e.getUnfinishedMessage();
                        try {
                            throw e;
                        } catch (java.lang.Throwable th) {
                            th = th;
                            if (versionRequirementTable != null) {
                                mergeFrom(versionRequirementTable);
                            }
                            throw th;
                        }
                    }
                } catch (java.lang.Throwable th2) {
                    th = th2;
                    versionRequirementTable = null;
                    if (versionRequirementTable != null) {
                    }
                    throw th;
                }
            }

            static /* synthetic */ kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.VersionRequirementTable.Builder getHighSpeedVideoFpsRanges() {
                return new kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.VersionRequirementTable.Builder();
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite.Builder, kotlin.reflect.jvm.internal.impl.protobuf.AbstractMessageLite.Builder
            /* renamed from: clone */
            public final kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.VersionRequirementTable.Builder mo23897clone() {
                return new kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.VersionRequirementTable.Builder().mergeFrom(buildPartial());
            }
        }
    }

    public static final class PackageFragment extends kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite.ExtendableMessage<kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.PackageFragment> implements kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.PackageFragmentOrBuilder {
        public static kotlin.reflect.jvm.internal.impl.protobuf.Parser<kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.PackageFragment> PARSER = new kotlin.reflect.jvm.internal.impl.protobuf.AbstractParser<kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.PackageFragment>() { // from class: kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.PackageFragment.1
            @Override // kotlin.reflect.jvm.internal.impl.protobuf.Parser
            public final /* synthetic */ java.lang.Object parsePartialFrom(kotlin.reflect.jvm.internal.impl.protobuf.CodedInputStream codedInputStream, kotlin.reflect.jvm.internal.impl.protobuf.ExtensionRegistryLite extensionRegistryLite) throws kotlin.reflect.jvm.internal.impl.protobuf.InvalidProtocolBufferException {
                return new kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.PackageFragment(codedInputStream, extensionRegistryLite, (byte) 0);
            }
        };
        private static final kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.PackageFragment getHighSpeedVideoFpsRanges;
        private byte Camera2StreamConfigurationMap;
        private java.util.List<kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Class> getHighResolutionOutputSizeshNQ4ISI;
        private int getHighSpeedVideoFpsRangesFor;
        private int getHighSpeedVideoSizes;
        private final kotlin.reflect.jvm.internal.impl.protobuf.ByteString getHighSpeedVideoSizesFor;
        private kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Package getInputFormats;
        private kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.StringTable getInputSizeshNQ4ISI;
        private kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.QualifiedNameTable getOutputMinFrameDuration;

        /* synthetic */ PackageFragment(kotlin.reflect.jvm.internal.impl.protobuf.CodedInputStream codedInputStream, kotlin.reflect.jvm.internal.impl.protobuf.ExtensionRegistryLite extensionRegistryLite, byte b) throws kotlin.reflect.jvm.internal.impl.protobuf.InvalidProtocolBufferException {
            this(codedInputStream, extensionRegistryLite);
        }

        /* synthetic */ PackageFragment(kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite.ExtendableBuilder extendableBuilder, byte b) {
            this(extendableBuilder);
        }

        private PackageFragment(kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite.ExtendableBuilder<kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.PackageFragment, ?> extendableBuilder) {
            super(extendableBuilder);
            this.Camera2StreamConfigurationMap = (byte) -1;
            this.getHighSpeedVideoFpsRangesFor = -1;
            this.getHighSpeedVideoSizesFor = extendableBuilder.getUnknownFields();
        }

        private PackageFragment() {
            this.Camera2StreamConfigurationMap = (byte) -1;
            this.getHighSpeedVideoFpsRangesFor = -1;
            this.getHighSpeedVideoSizesFor = kotlin.reflect.jvm.internal.impl.protobuf.ByteString.EMPTY;
        }

        public static kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.PackageFragment getDefaultInstance() {
            return getHighSpeedVideoFpsRanges;
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.MessageLiteOrBuilder
        public final kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.PackageFragment getDefaultInstanceForType() {
            return getHighSpeedVideoFpsRanges;
        }

        /* JADX WARN: Multi-variable type inference failed */
        private PackageFragment(kotlin.reflect.jvm.internal.impl.protobuf.CodedInputStream codedInputStream, kotlin.reflect.jvm.internal.impl.protobuf.ExtensionRegistryLite extensionRegistryLite) throws kotlin.reflect.jvm.internal.impl.protobuf.InvalidProtocolBufferException {
            this.Camera2StreamConfigurationMap = (byte) -1;
            this.getHighSpeedVideoFpsRangesFor = -1;
            this.getInputSizeshNQ4ISI = kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.StringTable.getDefaultInstance();
            this.getOutputMinFrameDuration = kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.QualifiedNameTable.getDefaultInstance();
            this.getInputFormats = kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Package.getDefaultInstance();
            this.getHighResolutionOutputSizeshNQ4ISI = java.util.Collections.emptyList();
            kotlin.reflect.jvm.internal.impl.protobuf.ByteString.Output newOutput = kotlin.reflect.jvm.internal.impl.protobuf.ByteString.newOutput();
            kotlin.reflect.jvm.internal.impl.protobuf.CodedOutputStream newInstance = kotlin.reflect.jvm.internal.impl.protobuf.CodedOutputStream.newInstance(newOutput, 1);
            boolean z = false;
            char c = 0;
            while (!z) {
                try {
                    try {
                        int readTag = codedInputStream.readTag();
                        if (readTag != 0) {
                            if (readTag == 10) {
                                kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.StringTable.Builder builder = (this.getHighSpeedVideoSizes & 1) == 1 ? this.getInputSizeshNQ4ISI.toBuilder() : null;
                                kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.StringTable stringTable = (kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.StringTable) codedInputStream.readMessage(kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.StringTable.PARSER, extensionRegistryLite);
                                this.getInputSizeshNQ4ISI = stringTable;
                                if (builder != null) {
                                    builder.mergeFrom(stringTable);
                                    this.getInputSizeshNQ4ISI = builder.buildPartial();
                                }
                                this.getHighSpeedVideoSizes |= 1;
                            } else if (readTag == 18) {
                                kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.QualifiedNameTable.Builder builder2 = (this.getHighSpeedVideoSizes & 2) == 2 ? this.getOutputMinFrameDuration.toBuilder() : null;
                                kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.QualifiedNameTable qualifiedNameTable = (kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.QualifiedNameTable) codedInputStream.readMessage(kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.QualifiedNameTable.PARSER, extensionRegistryLite);
                                this.getOutputMinFrameDuration = qualifiedNameTable;
                                if (builder2 != null) {
                                    builder2.mergeFrom(qualifiedNameTable);
                                    this.getOutputMinFrameDuration = builder2.buildPartial();
                                }
                                this.getHighSpeedVideoSizes |= 2;
                            } else if (readTag == 26) {
                                kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Package.Builder builder3 = (this.getHighSpeedVideoSizes & 4) == 4 ? this.getInputFormats.toBuilder() : null;
                                kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Package r6 = (kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Package) codedInputStream.readMessage(kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Package.PARSER, extensionRegistryLite);
                                this.getInputFormats = r6;
                                if (builder3 != null) {
                                    builder3.mergeFrom(r6);
                                    this.getInputFormats = builder3.buildPartial();
                                }
                                this.getHighSpeedVideoSizes |= 4;
                            } else if (readTag == 34) {
                                int i = (c == true ? 1 : 0) & '\b';
                                c = c;
                                if (i != 8) {
                                    this.getHighResolutionOutputSizeshNQ4ISI = new java.util.ArrayList();
                                    c = '\b';
                                }
                                this.getHighResolutionOutputSizeshNQ4ISI.add(codedInputStream.readMessage(kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Class.PARSER, extensionRegistryLite));
                            } else if (!parseUnknownField(codedInputStream, newInstance, extensionRegistryLite, readTag)) {
                            }
                        }
                        z = true;
                    } catch (java.lang.Throwable th) {
                        if (((c == true ? 1 : 0) & '\b') == 8) {
                            this.getHighResolutionOutputSizeshNQ4ISI = java.util.Collections.unmodifiableList(this.getHighResolutionOutputSizeshNQ4ISI);
                        }
                        try {
                            newInstance.flush();
                        } catch (java.io.IOException unused) {
                        } catch (java.lang.Throwable th2) {
                            this.getHighSpeedVideoSizesFor = newOutput.toByteString();
                            throw th2;
                        }
                        this.getHighSpeedVideoSizesFor = newOutput.toByteString();
                        makeExtensionsImmutable();
                        throw th;
                    }
                } catch (kotlin.reflect.jvm.internal.impl.protobuf.InvalidProtocolBufferException e) {
                    throw e.setUnfinishedMessage(this);
                } catch (java.io.IOException e2) {
                    throw new kotlin.reflect.jvm.internal.impl.protobuf.InvalidProtocolBufferException(e2.getMessage()).setUnfinishedMessage(this);
                }
            }
            if (((c == true ? 1 : 0) & '\b') == 8) {
                this.getHighResolutionOutputSizeshNQ4ISI = java.util.Collections.unmodifiableList(this.getHighResolutionOutputSizeshNQ4ISI);
            }
            try {
                newInstance.flush();
            } catch (java.io.IOException unused2) {
            } catch (java.lang.Throwable th3) {
                this.getHighSpeedVideoSizesFor = newOutput.toByteString();
                throw th3;
            }
            this.getHighSpeedVideoSizesFor = newOutput.toByteString();
            makeExtensionsImmutable();
        }

        static {
            kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.PackageFragment packageFragment = new kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.PackageFragment();
            getHighSpeedVideoFpsRanges = packageFragment;
            packageFragment.getInputSizeshNQ4ISI = kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.StringTable.getDefaultInstance();
            packageFragment.getOutputMinFrameDuration = kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.QualifiedNameTable.getDefaultInstance();
            packageFragment.getInputFormats = kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Package.getDefaultInstance();
            packageFragment.getHighResolutionOutputSizeshNQ4ISI = java.util.Collections.emptyList();
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite, kotlin.reflect.jvm.internal.impl.protobuf.MessageLite
        public final kotlin.reflect.jvm.internal.impl.protobuf.Parser<kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.PackageFragment> getParserForType() {
            return PARSER;
        }

        public final boolean hasStrings() {
            return (this.getHighSpeedVideoSizes & 1) == 1;
        }

        public final kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.StringTable getStrings() {
            return this.getInputSizeshNQ4ISI;
        }

        public final boolean hasQualifiedNames() {
            return (this.getHighSpeedVideoSizes & 2) == 2;
        }

        public final kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.QualifiedNameTable getQualifiedNames() {
            return this.getOutputMinFrameDuration;
        }

        public final boolean hasPackage() {
            return (this.getHighSpeedVideoSizes & 4) == 4;
        }

        public final kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Package getPackage() {
            return this.getInputFormats;
        }

        public final java.util.List<kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Class> getClass_List() {
            return this.getHighResolutionOutputSizeshNQ4ISI;
        }

        public final int getClass_Count() {
            return this.getHighResolutionOutputSizeshNQ4ISI.size();
        }

        public final kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Class getClass_(int i) {
            return this.getHighResolutionOutputSizeshNQ4ISI.get(i);
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.MessageLiteOrBuilder
        public final boolean isInitialized() {
            byte b = this.Camera2StreamConfigurationMap;
            if (b == 1) {
                return true;
            }
            if (b == 0) {
                return false;
            }
            if (hasQualifiedNames() && !getQualifiedNames().isInitialized()) {
                this.Camera2StreamConfigurationMap = (byte) 0;
                return false;
            }
            if (hasPackage() && !getPackage().isInitialized()) {
                this.Camera2StreamConfigurationMap = (byte) 0;
                return false;
            }
            for (int i = 0; i < getClass_Count(); i++) {
                if (!getClass_(i).isInitialized()) {
                    this.Camera2StreamConfigurationMap = (byte) 0;
                    return false;
                }
            }
            if (!extensionsAreInitialized()) {
                this.Camera2StreamConfigurationMap = (byte) 0;
                return false;
            }
            this.Camera2StreamConfigurationMap = (byte) 1;
            return true;
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.MessageLite
        public final void writeTo(kotlin.reflect.jvm.internal.impl.protobuf.CodedOutputStream codedOutputStream) throws java.io.IOException {
            getSerializedSize();
            kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite.ExtendableMessage<MessageType>.ExtensionWriter newExtensionWriter = newExtensionWriter();
            if ((this.getHighSpeedVideoSizes & 1) == 1) {
                codedOutputStream.writeMessage(1, this.getInputSizeshNQ4ISI);
            }
            if ((this.getHighSpeedVideoSizes & 2) == 2) {
                codedOutputStream.writeMessage(2, this.getOutputMinFrameDuration);
            }
            if ((this.getHighSpeedVideoSizes & 4) == 4) {
                codedOutputStream.writeMessage(3, this.getInputFormats);
            }
            for (int i = 0; i < this.getHighResolutionOutputSizeshNQ4ISI.size(); i++) {
                codedOutputStream.writeMessage(4, this.getHighResolutionOutputSizeshNQ4ISI.get(i));
            }
            newExtensionWriter.writeUntil(200, codedOutputStream);
            codedOutputStream.writeRawBytes(this.getHighSpeedVideoSizesFor);
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.MessageLite
        public final int getSerializedSize() {
            int i = this.getHighSpeedVideoFpsRangesFor;
            if (i != -1) {
                return i;
            }
            int computeMessageSize = (this.getHighSpeedVideoSizes & 1) == 1 ? kotlin.reflect.jvm.internal.impl.protobuf.CodedOutputStream.computeMessageSize(1, this.getInputSizeshNQ4ISI) : 0;
            if ((this.getHighSpeedVideoSizes & 2) == 2) {
                computeMessageSize += kotlin.reflect.jvm.internal.impl.protobuf.CodedOutputStream.computeMessageSize(2, this.getOutputMinFrameDuration);
            }
            if ((this.getHighSpeedVideoSizes & 4) == 4) {
                computeMessageSize += kotlin.reflect.jvm.internal.impl.protobuf.CodedOutputStream.computeMessageSize(3, this.getInputFormats);
            }
            for (int i2 = 0; i2 < this.getHighResolutionOutputSizeshNQ4ISI.size(); i2++) {
                computeMessageSize += kotlin.reflect.jvm.internal.impl.protobuf.CodedOutputStream.computeMessageSize(4, this.getHighResolutionOutputSizeshNQ4ISI.get(i2));
            }
            int extensionsSerializedSize = computeMessageSize + extensionsSerializedSize() + this.getHighSpeedVideoSizesFor.size();
            this.getHighSpeedVideoFpsRangesFor = extensionsSerializedSize;
            return extensionsSerializedSize;
        }

        public static kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.PackageFragment parseFrom(java.io.InputStream inputStream, kotlin.reflect.jvm.internal.impl.protobuf.ExtensionRegistryLite extensionRegistryLite) throws java.io.IOException {
            return PARSER.parseFrom(inputStream, extensionRegistryLite);
        }

        public static kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.PackageFragment.Builder newBuilder() {
            return kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.PackageFragment.Builder.getHighSpeedVideoSizes();
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.MessageLite
        public final kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.PackageFragment.Builder newBuilderForType() {
            return newBuilder();
        }

        public static kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.PackageFragment.Builder newBuilder(kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.PackageFragment packageFragment) {
            return newBuilder().mergeFrom(packageFragment);
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.MessageLite
        public final kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.PackageFragment.Builder toBuilder() {
            return newBuilder(this);
        }

        public static final class Builder extends kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite.ExtendableBuilder<kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.PackageFragment, kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.PackageFragment.Builder> implements kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.PackageFragmentOrBuilder {
            private int getHighResolutionOutputSizeshNQ4ISI;
            private kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.StringTable getHighSpeedVideoSizes = kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.StringTable.getDefaultInstance();
            private kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.QualifiedNameTable getHighSpeedVideoFpsRangesFor = kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.QualifiedNameTable.getDefaultInstance();
            private kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Package Camera2StreamConfigurationMap = kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Package.getDefaultInstance();
            private java.util.List<kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Class> getHighSpeedVideoFpsRanges = java.util.Collections.emptyList();

            private Builder() {
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite.Builder, kotlin.reflect.jvm.internal.impl.protobuf.MessageLiteOrBuilder
            public final kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.PackageFragment getDefaultInstanceForType() {
                return kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.PackageFragment.getDefaultInstance();
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.MessageLite.Builder
            public final kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.PackageFragment build() {
                kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.PackageFragment buildPartial = buildPartial();
                if (buildPartial.isInitialized()) {
                    return buildPartial;
                }
                throw newUninitializedMessageException(buildPartial);
            }

            /* JADX WARN: Multi-variable type inference failed */
            public final kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.PackageFragment buildPartial() {
                kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.PackageFragment packageFragment = new kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.PackageFragment((kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite.ExtendableBuilder) this, (byte) (0 == true ? 1 : 0));
                int i = this.getHighResolutionOutputSizeshNQ4ISI;
                int i2 = (i & 1) == 1 ? 1 : 0;
                packageFragment.getInputSizeshNQ4ISI = this.getHighSpeedVideoSizes;
                if ((i & 2) == 2) {
                    i2 |= 2;
                }
                packageFragment.getOutputMinFrameDuration = this.getHighSpeedVideoFpsRangesFor;
                if ((i & 4) == 4) {
                    i2 |= 4;
                }
                packageFragment.getInputFormats = this.Camera2StreamConfigurationMap;
                if ((this.getHighResolutionOutputSizeshNQ4ISI & 8) == 8) {
                    this.getHighSpeedVideoFpsRanges = java.util.Collections.unmodifiableList(this.getHighSpeedVideoFpsRanges);
                    this.getHighResolutionOutputSizeshNQ4ISI &= -9;
                }
                packageFragment.getHighResolutionOutputSizeshNQ4ISI = this.getHighSpeedVideoFpsRanges;
                packageFragment.getHighSpeedVideoSizes = i2;
                return packageFragment;
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite.Builder
            public final kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.PackageFragment.Builder mergeFrom(kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.PackageFragment packageFragment) {
                if (packageFragment == kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.PackageFragment.getDefaultInstance()) {
                    return this;
                }
                if (packageFragment.hasStrings()) {
                    mergeStrings(packageFragment.getStrings());
                }
                if (packageFragment.hasQualifiedNames()) {
                    mergeQualifiedNames(packageFragment.getQualifiedNames());
                }
                if (packageFragment.hasPackage()) {
                    mergePackage(packageFragment.getPackage());
                }
                if (!packageFragment.getHighResolutionOutputSizeshNQ4ISI.isEmpty()) {
                    if (this.getHighSpeedVideoFpsRanges.isEmpty()) {
                        this.getHighSpeedVideoFpsRanges = packageFragment.getHighResolutionOutputSizeshNQ4ISI;
                        this.getHighResolutionOutputSizeshNQ4ISI &= -9;
                    } else {
                        if ((this.getHighResolutionOutputSizeshNQ4ISI & 8) != 8) {
                            this.getHighSpeedVideoFpsRanges = new java.util.ArrayList(this.getHighSpeedVideoFpsRanges);
                            this.getHighResolutionOutputSizeshNQ4ISI |= 8;
                        }
                        this.getHighSpeedVideoFpsRanges.addAll(packageFragment.getHighResolutionOutputSizeshNQ4ISI);
                    }
                }
                mergeExtensionFields(packageFragment);
                setUnknownFields(getUnknownFields().concat(packageFragment.getHighSpeedVideoSizesFor));
                return this;
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.MessageLiteOrBuilder
            public final boolean isInitialized() {
                if (hasQualifiedNames() && !getQualifiedNames().isInitialized()) {
                    return false;
                }
                if (hasPackage() && !getPackage().isInitialized()) {
                    return false;
                }
                for (int i = 0; i < getClass_Count(); i++) {
                    if (!getClass_(i).isInitialized()) {
                        return false;
                    }
                }
                return extensionsAreInitialized();
            }

            /* JADX WARN: Removed duplicated region for block: B:15:0x001d  */
            @Override // kotlin.reflect.jvm.internal.impl.protobuf.AbstractMessageLite.Builder, kotlin.reflect.jvm.internal.impl.protobuf.MessageLite.Builder
            /*
                Code decompiled incorrectly, please refer to instructions dump.
            */
            public final kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.PackageFragment.Builder mergeFrom(kotlin.reflect.jvm.internal.impl.protobuf.CodedInputStream codedInputStream, kotlin.reflect.jvm.internal.impl.protobuf.ExtensionRegistryLite extensionRegistryLite) throws java.io.IOException {
                kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.PackageFragment packageFragment;
                try {
                    try {
                        kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.PackageFragment parsePartialFrom = kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.PackageFragment.PARSER.parsePartialFrom(codedInputStream, extensionRegistryLite);
                        if (parsePartialFrom != null) {
                            mergeFrom(parsePartialFrom);
                        }
                        return this;
                    } catch (kotlin.reflect.jvm.internal.impl.protobuf.InvalidProtocolBufferException e) {
                        packageFragment = (kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.PackageFragment) e.getUnfinishedMessage();
                        try {
                            throw e;
                        } catch (java.lang.Throwable th) {
                            th = th;
                            if (packageFragment != null) {
                                mergeFrom(packageFragment);
                            }
                            throw th;
                        }
                    }
                } catch (java.lang.Throwable th2) {
                    th = th2;
                    packageFragment = null;
                    if (packageFragment != null) {
                    }
                    throw th;
                }
            }

            public final kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.PackageFragment.Builder mergeStrings(kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.StringTable stringTable) {
                if ((this.getHighResolutionOutputSizeshNQ4ISI & 1) == 1 && this.getHighSpeedVideoSizes != kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.StringTable.getDefaultInstance()) {
                    this.getHighSpeedVideoSizes = kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.StringTable.newBuilder(this.getHighSpeedVideoSizes).mergeFrom(stringTable).buildPartial();
                } else {
                    this.getHighSpeedVideoSizes = stringTable;
                }
                this.getHighResolutionOutputSizeshNQ4ISI |= 1;
                return this;
            }

            public final boolean hasQualifiedNames() {
                return (this.getHighResolutionOutputSizeshNQ4ISI & 2) == 2;
            }

            public final kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.QualifiedNameTable getQualifiedNames() {
                return this.getHighSpeedVideoFpsRangesFor;
            }

            public final kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.PackageFragment.Builder mergeQualifiedNames(kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.QualifiedNameTable qualifiedNameTable) {
                if ((this.getHighResolutionOutputSizeshNQ4ISI & 2) == 2 && this.getHighSpeedVideoFpsRangesFor != kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.QualifiedNameTable.getDefaultInstance()) {
                    this.getHighSpeedVideoFpsRangesFor = kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.QualifiedNameTable.newBuilder(this.getHighSpeedVideoFpsRangesFor).mergeFrom(qualifiedNameTable).buildPartial();
                } else {
                    this.getHighSpeedVideoFpsRangesFor = qualifiedNameTable;
                }
                this.getHighResolutionOutputSizeshNQ4ISI |= 2;
                return this;
            }

            public final boolean hasPackage() {
                return (this.getHighResolutionOutputSizeshNQ4ISI & 4) == 4;
            }

            public final kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Package getPackage() {
                return this.Camera2StreamConfigurationMap;
            }

            public final kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.PackageFragment.Builder mergePackage(kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Package r4) {
                if ((this.getHighResolutionOutputSizeshNQ4ISI & 4) == 4 && this.Camera2StreamConfigurationMap != kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Package.getDefaultInstance()) {
                    this.Camera2StreamConfigurationMap = kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Package.newBuilder(this.Camera2StreamConfigurationMap).mergeFrom(r4).buildPartial();
                } else {
                    this.Camera2StreamConfigurationMap = r4;
                }
                this.getHighResolutionOutputSizeshNQ4ISI |= 4;
                return this;
            }

            public final int getClass_Count() {
                return this.getHighSpeedVideoFpsRanges.size();
            }

            public final kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Class getClass_(int i) {
                return this.getHighSpeedVideoFpsRanges.get(i);
            }

            static /* synthetic */ kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.PackageFragment.Builder getHighSpeedVideoSizes() {
                return new kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.PackageFragment.Builder();
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite.ExtendableBuilder, kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite.Builder, kotlin.reflect.jvm.internal.impl.protobuf.AbstractMessageLite.Builder
            /* renamed from: clone */
            public final kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.PackageFragment.Builder mo23897clone() {
                return new kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.PackageFragment.Builder().mergeFrom(buildPartial());
            }
        }
    }

    public static final class Contract extends kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite implements kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.ContractOrBuilder {
        public static kotlin.reflect.jvm.internal.impl.protobuf.Parser<kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Contract> PARSER = new kotlin.reflect.jvm.internal.impl.protobuf.AbstractParser<kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Contract>() { // from class: kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Contract.1
            @Override // kotlin.reflect.jvm.internal.impl.protobuf.Parser
            public final /* synthetic */ java.lang.Object parsePartialFrom(kotlin.reflect.jvm.internal.impl.protobuf.CodedInputStream codedInputStream, kotlin.reflect.jvm.internal.impl.protobuf.ExtensionRegistryLite extensionRegistryLite) throws kotlin.reflect.jvm.internal.impl.protobuf.InvalidProtocolBufferException {
                return new kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Contract(codedInputStream, extensionRegistryLite, (byte) 0);
            }
        };
        private static final kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Contract getHighResolutionOutputSizeshNQ4ISI;
        private final kotlin.reflect.jvm.internal.impl.protobuf.ByteString Camera2StreamConfigurationMap;
        private java.util.List<kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Effect> getHighSpeedVideoFpsRanges;
        private int getHighSpeedVideoFpsRangesFor;
        private byte getHighSpeedVideoSizes;

        /* synthetic */ Contract(kotlin.reflect.jvm.internal.impl.protobuf.CodedInputStream codedInputStream, kotlin.reflect.jvm.internal.impl.protobuf.ExtensionRegistryLite extensionRegistryLite, byte b) throws kotlin.reflect.jvm.internal.impl.protobuf.InvalidProtocolBufferException {
            this(codedInputStream, extensionRegistryLite);
        }

        /* synthetic */ Contract(kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite.Builder builder, byte b) {
            this(builder);
        }

        private Contract(kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite.Builder builder) {
            super(builder);
            this.getHighSpeedVideoSizes = (byte) -1;
            this.getHighSpeedVideoFpsRangesFor = -1;
            this.Camera2StreamConfigurationMap = builder.getUnknownFields();
        }

        private Contract() {
            this.getHighSpeedVideoSizes = (byte) -1;
            this.getHighSpeedVideoFpsRangesFor = -1;
            this.Camera2StreamConfigurationMap = kotlin.reflect.jvm.internal.impl.protobuf.ByteString.EMPTY;
        }

        public static kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Contract getDefaultInstance() {
            return getHighResolutionOutputSizeshNQ4ISI;
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.MessageLiteOrBuilder
        public final kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Contract getDefaultInstanceForType() {
            return getHighResolutionOutputSizeshNQ4ISI;
        }

        /* JADX WARN: Multi-variable type inference failed */
        private Contract(kotlin.reflect.jvm.internal.impl.protobuf.CodedInputStream codedInputStream, kotlin.reflect.jvm.internal.impl.protobuf.ExtensionRegistryLite extensionRegistryLite) throws kotlin.reflect.jvm.internal.impl.protobuf.InvalidProtocolBufferException {
            this.getHighSpeedVideoSizes = (byte) -1;
            this.getHighSpeedVideoFpsRangesFor = -1;
            this.getHighSpeedVideoFpsRanges = java.util.Collections.emptyList();
            kotlin.reflect.jvm.internal.impl.protobuf.ByteString.Output newOutput = kotlin.reflect.jvm.internal.impl.protobuf.ByteString.newOutput();
            kotlin.reflect.jvm.internal.impl.protobuf.CodedOutputStream newInstance = kotlin.reflect.jvm.internal.impl.protobuf.CodedOutputStream.newInstance(newOutput, 1);
            boolean z = false;
            boolean z2 = false;
            while (!z) {
                try {
                    try {
                        int readTag = codedInputStream.readTag();
                        if (readTag != 0) {
                            if (readTag == 10) {
                                if (!z2) {
                                    this.getHighSpeedVideoFpsRanges = new java.util.ArrayList();
                                    z2 = true;
                                }
                                this.getHighSpeedVideoFpsRanges.add(codedInputStream.readMessage(kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Effect.PARSER, extensionRegistryLite));
                            } else if (!parseUnknownField(codedInputStream, newInstance, extensionRegistryLite, readTag)) {
                            }
                        }
                        z = true;
                    } catch (kotlin.reflect.jvm.internal.impl.protobuf.InvalidProtocolBufferException e) {
                        throw e.setUnfinishedMessage(this);
                    } catch (java.io.IOException e2) {
                        throw new kotlin.reflect.jvm.internal.impl.protobuf.InvalidProtocolBufferException(e2.getMessage()).setUnfinishedMessage(this);
                    }
                } catch (java.lang.Throwable th) {
                    if (z2) {
                        this.getHighSpeedVideoFpsRanges = java.util.Collections.unmodifiableList(this.getHighSpeedVideoFpsRanges);
                    }
                    try {
                        newInstance.flush();
                    } catch (java.io.IOException unused) {
                    } catch (java.lang.Throwable th2) {
                        this.Camera2StreamConfigurationMap = newOutput.toByteString();
                        throw th2;
                    }
                    this.Camera2StreamConfigurationMap = newOutput.toByteString();
                    makeExtensionsImmutable();
                    throw th;
                }
            }
            if (z2) {
                this.getHighSpeedVideoFpsRanges = java.util.Collections.unmodifiableList(this.getHighSpeedVideoFpsRanges);
            }
            try {
                newInstance.flush();
            } catch (java.io.IOException unused2) {
            } catch (java.lang.Throwable th3) {
                this.Camera2StreamConfigurationMap = newOutput.toByteString();
                throw th3;
            }
            this.Camera2StreamConfigurationMap = newOutput.toByteString();
            makeExtensionsImmutable();
        }

        static {
            kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Contract contract = new kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Contract();
            getHighResolutionOutputSizeshNQ4ISI = contract;
            contract.getHighSpeedVideoFpsRanges = java.util.Collections.emptyList();
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite, kotlin.reflect.jvm.internal.impl.protobuf.MessageLite
        public final kotlin.reflect.jvm.internal.impl.protobuf.Parser<kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Contract> getParserForType() {
            return PARSER;
        }

        public final java.util.List<kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Effect> getEffectList() {
            return this.getHighSpeedVideoFpsRanges;
        }

        public final int getEffectCount() {
            return this.getHighSpeedVideoFpsRanges.size();
        }

        public final kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Effect getEffect(int i) {
            return this.getHighSpeedVideoFpsRanges.get(i);
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.MessageLiteOrBuilder
        public final boolean isInitialized() {
            byte b = this.getHighSpeedVideoSizes;
            if (b == 1) {
                return true;
            }
            if (b == 0) {
                return false;
            }
            for (int i = 0; i < getEffectCount(); i++) {
                if (!getEffect(i).isInitialized()) {
                    this.getHighSpeedVideoSizes = (byte) 0;
                    return false;
                }
            }
            this.getHighSpeedVideoSizes = (byte) 1;
            return true;
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.MessageLite
        public final void writeTo(kotlin.reflect.jvm.internal.impl.protobuf.CodedOutputStream codedOutputStream) throws java.io.IOException {
            getSerializedSize();
            for (int i = 0; i < this.getHighSpeedVideoFpsRanges.size(); i++) {
                codedOutputStream.writeMessage(1, this.getHighSpeedVideoFpsRanges.get(i));
            }
            codedOutputStream.writeRawBytes(this.Camera2StreamConfigurationMap);
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.MessageLite
        public final int getSerializedSize() {
            int i = this.getHighSpeedVideoFpsRangesFor;
            if (i != -1) {
                return i;
            }
            int i2 = 0;
            for (int i3 = 0; i3 < this.getHighSpeedVideoFpsRanges.size(); i3++) {
                i2 += kotlin.reflect.jvm.internal.impl.protobuf.CodedOutputStream.computeMessageSize(1, this.getHighSpeedVideoFpsRanges.get(i3));
            }
            int size = i2 + this.Camera2StreamConfigurationMap.size();
            this.getHighSpeedVideoFpsRangesFor = size;
            return size;
        }

        public static kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Contract.Builder newBuilder() {
            return kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Contract.Builder.getHighResolutionOutputSizeshNQ4ISI();
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.MessageLite
        public final kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Contract.Builder newBuilderForType() {
            return newBuilder();
        }

        public static kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Contract.Builder newBuilder(kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Contract contract) {
            return newBuilder().mergeFrom(contract);
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.MessageLite
        public final kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Contract.Builder toBuilder() {
            return newBuilder(this);
        }

        public static final class Builder extends kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite.Builder<kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Contract, kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Contract.Builder> implements kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.ContractOrBuilder {
            private java.util.List<kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Effect> getHighResolutionOutputSizeshNQ4ISI = java.util.Collections.emptyList();
            private int getHighSpeedVideoFpsRangesFor;

            private Builder() {
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite.Builder, kotlin.reflect.jvm.internal.impl.protobuf.MessageLiteOrBuilder
            public final kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Contract getDefaultInstanceForType() {
                return kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Contract.getDefaultInstance();
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.MessageLite.Builder
            public final kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Contract build() {
                kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Contract buildPartial = buildPartial();
                if (buildPartial.isInitialized()) {
                    return buildPartial;
                }
                throw newUninitializedMessageException(buildPartial);
            }

            public final kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Contract buildPartial() {
                kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Contract contract = new kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Contract((kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite.Builder) this, (byte) 0);
                if ((this.getHighSpeedVideoFpsRangesFor & 1) == 1) {
                    this.getHighResolutionOutputSizeshNQ4ISI = java.util.Collections.unmodifiableList(this.getHighResolutionOutputSizeshNQ4ISI);
                    this.getHighSpeedVideoFpsRangesFor &= -2;
                }
                contract.getHighSpeedVideoFpsRanges = this.getHighResolutionOutputSizeshNQ4ISI;
                return contract;
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite.Builder
            public final kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Contract.Builder mergeFrom(kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Contract contract) {
                if (contract == kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Contract.getDefaultInstance()) {
                    return this;
                }
                if (!contract.getHighSpeedVideoFpsRanges.isEmpty()) {
                    if (this.getHighResolutionOutputSizeshNQ4ISI.isEmpty()) {
                        this.getHighResolutionOutputSizeshNQ4ISI = contract.getHighSpeedVideoFpsRanges;
                        this.getHighSpeedVideoFpsRangesFor &= -2;
                    } else {
                        if ((this.getHighSpeedVideoFpsRangesFor & 1) != 1) {
                            this.getHighResolutionOutputSizeshNQ4ISI = new java.util.ArrayList(this.getHighResolutionOutputSizeshNQ4ISI);
                            this.getHighSpeedVideoFpsRangesFor |= 1;
                        }
                        this.getHighResolutionOutputSizeshNQ4ISI.addAll(contract.getHighSpeedVideoFpsRanges);
                    }
                }
                setUnknownFields(getUnknownFields().concat(contract.Camera2StreamConfigurationMap));
                return this;
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.MessageLiteOrBuilder
            public final boolean isInitialized() {
                for (int i = 0; i < getEffectCount(); i++) {
                    if (!getEffect(i).isInitialized()) {
                        return false;
                    }
                }
                return true;
            }

            /* JADX WARN: Removed duplicated region for block: B:15:0x001d  */
            @Override // kotlin.reflect.jvm.internal.impl.protobuf.AbstractMessageLite.Builder, kotlin.reflect.jvm.internal.impl.protobuf.MessageLite.Builder
            /*
                Code decompiled incorrectly, please refer to instructions dump.
            */
            public final kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Contract.Builder mergeFrom(kotlin.reflect.jvm.internal.impl.protobuf.CodedInputStream codedInputStream, kotlin.reflect.jvm.internal.impl.protobuf.ExtensionRegistryLite extensionRegistryLite) throws java.io.IOException {
                kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Contract contract;
                try {
                    try {
                        kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Contract parsePartialFrom = kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Contract.PARSER.parsePartialFrom(codedInputStream, extensionRegistryLite);
                        if (parsePartialFrom != null) {
                            mergeFrom(parsePartialFrom);
                        }
                        return this;
                    } catch (kotlin.reflect.jvm.internal.impl.protobuf.InvalidProtocolBufferException e) {
                        contract = (kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Contract) e.getUnfinishedMessage();
                        try {
                            throw e;
                        } catch (java.lang.Throwable th) {
                            th = th;
                            if (contract != null) {
                                mergeFrom(contract);
                            }
                            throw th;
                        }
                    }
                } catch (java.lang.Throwable th2) {
                    th = th2;
                    contract = null;
                    if (contract != null) {
                    }
                    throw th;
                }
            }

            public final int getEffectCount() {
                return this.getHighResolutionOutputSizeshNQ4ISI.size();
            }

            public final kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Effect getEffect(int i) {
                return this.getHighResolutionOutputSizeshNQ4ISI.get(i);
            }

            static /* synthetic */ kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Contract.Builder getHighResolutionOutputSizeshNQ4ISI() {
                return new kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Contract.Builder();
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite.Builder, kotlin.reflect.jvm.internal.impl.protobuf.AbstractMessageLite.Builder
            /* renamed from: clone */
            public final kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Contract.Builder mo23897clone() {
                return new kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Contract.Builder().mergeFrom(buildPartial());
            }
        }
    }

    public static final class Effect extends kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite implements kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.EffectOrBuilder {
        public static kotlin.reflect.jvm.internal.impl.protobuf.Parser<kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Effect> PARSER = new kotlin.reflect.jvm.internal.impl.protobuf.AbstractParser<kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Effect>() { // from class: kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Effect.1
            @Override // kotlin.reflect.jvm.internal.impl.protobuf.Parser
            public final /* synthetic */ java.lang.Object parsePartialFrom(kotlin.reflect.jvm.internal.impl.protobuf.CodedInputStream codedInputStream, kotlin.reflect.jvm.internal.impl.protobuf.ExtensionRegistryLite extensionRegistryLite) throws kotlin.reflect.jvm.internal.impl.protobuf.InvalidProtocolBufferException {
                return new kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Effect(codedInputStream, extensionRegistryLite, (byte) 0);
            }
        };
        private static final kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Effect getHighSpeedVideoSizes;
        private int Camera2StreamConfigurationMap;
        private kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Expression getHighResolutionOutputSizeshNQ4ISI;
        private kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Effect.EffectConditionKind getHighSpeedVideoFpsRanges;
        private java.util.List<kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Expression> getHighSpeedVideoFpsRangesFor;
        private int getHighSpeedVideoSizesFor;
        private kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Effect.InvocationKind getInputFormats;
        private byte getInputSizeshNQ4ISI;
        private kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Effect.EffectType getOutputFormats;
        private final kotlin.reflect.jvm.internal.impl.protobuf.ByteString getOutputMinFrameDuration;

        /* synthetic */ Effect(kotlin.reflect.jvm.internal.impl.protobuf.CodedInputStream codedInputStream, kotlin.reflect.jvm.internal.impl.protobuf.ExtensionRegistryLite extensionRegistryLite, byte b) throws kotlin.reflect.jvm.internal.impl.protobuf.InvalidProtocolBufferException {
            this(codedInputStream, extensionRegistryLite);
        }

        /* synthetic */ Effect(kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite.Builder builder, byte b) {
            this(builder);
        }

        private Effect(kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite.Builder builder) {
            super(builder);
            this.getInputSizeshNQ4ISI = (byte) -1;
            this.getHighSpeedVideoSizesFor = -1;
            this.getOutputMinFrameDuration = builder.getUnknownFields();
        }

        private Effect() {
            this.getInputSizeshNQ4ISI = (byte) -1;
            this.getHighSpeedVideoSizesFor = -1;
            this.getOutputMinFrameDuration = kotlin.reflect.jvm.internal.impl.protobuf.ByteString.EMPTY;
        }

        public static kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Effect getDefaultInstance() {
            return getHighSpeedVideoSizes;
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.MessageLiteOrBuilder
        public final kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Effect getDefaultInstanceForType() {
            return getHighSpeedVideoSizes;
        }

        /* JADX WARN: Multi-variable type inference failed */
        private Effect(kotlin.reflect.jvm.internal.impl.protobuf.CodedInputStream codedInputStream, kotlin.reflect.jvm.internal.impl.protobuf.ExtensionRegistryLite extensionRegistryLite) throws kotlin.reflect.jvm.internal.impl.protobuf.InvalidProtocolBufferException {
            this.getInputSizeshNQ4ISI = (byte) -1;
            this.getHighSpeedVideoSizesFor = -1;
            getHighSpeedVideoFpsRanges();
            kotlin.reflect.jvm.internal.impl.protobuf.ByteString.Output newOutput = kotlin.reflect.jvm.internal.impl.protobuf.ByteString.newOutput();
            kotlin.reflect.jvm.internal.impl.protobuf.CodedOutputStream newInstance = kotlin.reflect.jvm.internal.impl.protobuf.CodedOutputStream.newInstance(newOutput, 1);
            boolean z = false;
            char c = 0;
            while (!z) {
                try {
                    try {
                        int readTag = codedInputStream.readTag();
                        if (readTag != 0) {
                            if (readTag == 8) {
                                int readEnum = codedInputStream.readEnum();
                                kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Effect.EffectType valueOf = kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Effect.EffectType.valueOf(readEnum);
                                if (valueOf == null) {
                                    newInstance.writeRawVarint32(readTag);
                                    newInstance.writeRawVarint32(readEnum);
                                } else {
                                    this.Camera2StreamConfigurationMap |= 1;
                                    this.getOutputFormats = valueOf;
                                }
                            } else if (readTag == 18) {
                                if ((c & 2) != 2) {
                                    this.getHighSpeedVideoFpsRangesFor = new java.util.ArrayList();
                                    c = 2;
                                }
                                this.getHighSpeedVideoFpsRangesFor.add(codedInputStream.readMessage(kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Expression.PARSER, extensionRegistryLite));
                            } else if (readTag == 26) {
                                kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Expression.Builder builder = (this.Camera2StreamConfigurationMap & 2) == 2 ? this.getHighResolutionOutputSizeshNQ4ISI.toBuilder() : null;
                                kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Expression expression = (kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Expression) codedInputStream.readMessage(kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Expression.PARSER, extensionRegistryLite);
                                this.getHighResolutionOutputSizeshNQ4ISI = expression;
                                if (builder != null) {
                                    builder.mergeFrom(expression);
                                    this.getHighResolutionOutputSizeshNQ4ISI = builder.buildPartial();
                                }
                                this.Camera2StreamConfigurationMap |= 2;
                            } else if (readTag == 32) {
                                int readEnum2 = codedInputStream.readEnum();
                                kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Effect.InvocationKind valueOf2 = kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Effect.InvocationKind.valueOf(readEnum2);
                                if (valueOf2 == null) {
                                    newInstance.writeRawVarint32(readTag);
                                    newInstance.writeRawVarint32(readEnum2);
                                } else {
                                    this.Camera2StreamConfigurationMap |= 4;
                                    this.getInputFormats = valueOf2;
                                }
                            } else if (readTag == 40) {
                                int readEnum3 = codedInputStream.readEnum();
                                kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Effect.EffectConditionKind valueOf3 = kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Effect.EffectConditionKind.valueOf(readEnum3);
                                if (valueOf3 == null) {
                                    newInstance.writeRawVarint32(readTag);
                                    newInstance.writeRawVarint32(readEnum3);
                                } else {
                                    this.Camera2StreamConfigurationMap |= 8;
                                    this.getHighSpeedVideoFpsRanges = valueOf3;
                                }
                            } else if (!parseUnknownField(codedInputStream, newInstance, extensionRegistryLite, readTag)) {
                            }
                        }
                        z = true;
                    } catch (java.lang.Throwable th) {
                        if ((c & 2) == 2) {
                            this.getHighSpeedVideoFpsRangesFor = java.util.Collections.unmodifiableList(this.getHighSpeedVideoFpsRangesFor);
                        }
                        try {
                            newInstance.flush();
                        } catch (java.io.IOException unused) {
                        } catch (java.lang.Throwable th2) {
                            this.getOutputMinFrameDuration = newOutput.toByteString();
                            throw th2;
                        }
                        this.getOutputMinFrameDuration = newOutput.toByteString();
                        makeExtensionsImmutable();
                        throw th;
                    }
                } catch (kotlin.reflect.jvm.internal.impl.protobuf.InvalidProtocolBufferException e) {
                    throw e.setUnfinishedMessage(this);
                } catch (java.io.IOException e2) {
                    throw new kotlin.reflect.jvm.internal.impl.protobuf.InvalidProtocolBufferException(e2.getMessage()).setUnfinishedMessage(this);
                }
            }
            if ((c & 2) == 2) {
                this.getHighSpeedVideoFpsRangesFor = java.util.Collections.unmodifiableList(this.getHighSpeedVideoFpsRangesFor);
            }
            try {
                newInstance.flush();
            } catch (java.io.IOException unused2) {
            } catch (java.lang.Throwable th3) {
                this.getOutputMinFrameDuration = newOutput.toByteString();
                throw th3;
            }
            this.getOutputMinFrameDuration = newOutput.toByteString();
            makeExtensionsImmutable();
        }

        static {
            kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Effect effect = new kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Effect();
            getHighSpeedVideoSizes = effect;
            effect.getHighSpeedVideoFpsRanges();
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite, kotlin.reflect.jvm.internal.impl.protobuf.MessageLite
        public final kotlin.reflect.jvm.internal.impl.protobuf.Parser<kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Effect> getParserForType() {
            return PARSER;
        }

        public enum EffectType implements kotlin.reflect.jvm.internal.impl.protobuf.Internal.EnumLite {
            RETURNS_CONSTANT(0),
            CALLS(1),
            RETURNS_NOT_NULL(2);

            private static kotlin.reflect.jvm.internal.impl.protobuf.Internal.EnumLiteMap<kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Effect.EffectType> getHighSpeedVideoFpsRangesFor = new kotlin.reflect.jvm.internal.impl.protobuf.Internal.EnumLiteMap<kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Effect.EffectType>() { // from class: kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Effect.EffectType.1
                @Override // kotlin.reflect.jvm.internal.impl.protobuf.Internal.EnumLiteMap
                public final /* synthetic */ kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Effect.EffectType findValueByNumber(int i) {
                    return kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Effect.EffectType.valueOf(i);
                }
            };
            private final int Camera2StreamConfigurationMap;

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.Internal.EnumLite
            public final int getNumber() {
                return this.Camera2StreamConfigurationMap;
            }

            public static kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Effect.EffectType valueOf(int i) {
                if (i == 0) {
                    return RETURNS_CONSTANT;
                }
                if (i == 1) {
                    return CALLS;
                }
                if (i != 2) {
                    return null;
                }
                return RETURNS_NOT_NULL;
            }

            EffectType(int i) {
                this.Camera2StreamConfigurationMap = i;
            }
        }

        public enum InvocationKind implements kotlin.reflect.jvm.internal.impl.protobuf.Internal.EnumLite {
            AT_MOST_ONCE(0),
            EXACTLY_ONCE(1),
            AT_LEAST_ONCE(2);

            private static kotlin.reflect.jvm.internal.impl.protobuf.Internal.EnumLiteMap<kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Effect.InvocationKind> getHighResolutionOutputSizeshNQ4ISI = new kotlin.reflect.jvm.internal.impl.protobuf.Internal.EnumLiteMap<kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Effect.InvocationKind>() { // from class: kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Effect.InvocationKind.1
                @Override // kotlin.reflect.jvm.internal.impl.protobuf.Internal.EnumLiteMap
                public final /* synthetic */ kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Effect.InvocationKind findValueByNumber(int i) {
                    return kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Effect.InvocationKind.valueOf(i);
                }
            };
            private final int getHighSpeedVideoSizes;

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.Internal.EnumLite
            public final int getNumber() {
                return this.getHighSpeedVideoSizes;
            }

            public static kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Effect.InvocationKind valueOf(int i) {
                if (i == 0) {
                    return AT_MOST_ONCE;
                }
                if (i == 1) {
                    return EXACTLY_ONCE;
                }
                if (i != 2) {
                    return null;
                }
                return AT_LEAST_ONCE;
            }

            InvocationKind(int i) {
                this.getHighSpeedVideoSizes = i;
            }
        }

        public enum EffectConditionKind implements kotlin.reflect.jvm.internal.impl.protobuf.Internal.EnumLite {
            CONCLUSION_CONDITION(0),
            RETURNS_CONDITION(1),
            HOLDSIN_CONDITION(2);

            private static kotlin.reflect.jvm.internal.impl.protobuf.Internal.EnumLiteMap<kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Effect.EffectConditionKind> getHighSpeedVideoSizes = new kotlin.reflect.jvm.internal.impl.protobuf.Internal.EnumLiteMap<kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Effect.EffectConditionKind>() { // from class: kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Effect.EffectConditionKind.1
                @Override // kotlin.reflect.jvm.internal.impl.protobuf.Internal.EnumLiteMap
                public final /* synthetic */ kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Effect.EffectConditionKind findValueByNumber(int i) {
                    return kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Effect.EffectConditionKind.valueOf(i);
                }
            };
            private final int getHighResolutionOutputSizeshNQ4ISI;

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.Internal.EnumLite
            public final int getNumber() {
                return this.getHighResolutionOutputSizeshNQ4ISI;
            }

            public static kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Effect.EffectConditionKind valueOf(int i) {
                if (i == 0) {
                    return CONCLUSION_CONDITION;
                }
                if (i == 1) {
                    return RETURNS_CONDITION;
                }
                if (i != 2) {
                    return null;
                }
                return HOLDSIN_CONDITION;
            }

            EffectConditionKind(int i) {
                this.getHighResolutionOutputSizeshNQ4ISI = i;
            }
        }

        public final boolean hasEffectType() {
            return (this.Camera2StreamConfigurationMap & 1) == 1;
        }

        public final kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Effect.EffectType getEffectType() {
            return this.getOutputFormats;
        }

        public final java.util.List<kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Expression> getEffectConstructorArgumentList() {
            return this.getHighSpeedVideoFpsRangesFor;
        }

        public final int getEffectConstructorArgumentCount() {
            return this.getHighSpeedVideoFpsRangesFor.size();
        }

        public final kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Expression getEffectConstructorArgument(int i) {
            return this.getHighSpeedVideoFpsRangesFor.get(i);
        }

        public final boolean hasConclusionOfConditionalEffect() {
            return (this.Camera2StreamConfigurationMap & 2) == 2;
        }

        public final kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Expression getConclusionOfConditionalEffect() {
            return this.getHighResolutionOutputSizeshNQ4ISI;
        }

        public final boolean hasKind() {
            return (this.Camera2StreamConfigurationMap & 4) == 4;
        }

        public final kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Effect.InvocationKind getKind() {
            return this.getInputFormats;
        }

        public final boolean hasConditionKind() {
            return (this.Camera2StreamConfigurationMap & 8) == 8;
        }

        public final kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Effect.EffectConditionKind getConditionKind() {
            return this.getHighSpeedVideoFpsRanges;
        }

        private void getHighSpeedVideoFpsRanges() {
            this.getOutputFormats = kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Effect.EffectType.RETURNS_CONSTANT;
            this.getHighSpeedVideoFpsRangesFor = java.util.Collections.emptyList();
            this.getHighResolutionOutputSizeshNQ4ISI = kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Expression.getDefaultInstance();
            this.getInputFormats = kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Effect.InvocationKind.AT_MOST_ONCE;
            this.getHighSpeedVideoFpsRanges = kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Effect.EffectConditionKind.CONCLUSION_CONDITION;
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.MessageLiteOrBuilder
        public final boolean isInitialized() {
            byte b = this.getInputSizeshNQ4ISI;
            if (b == 1) {
                return true;
            }
            if (b == 0) {
                return false;
            }
            for (int i = 0; i < getEffectConstructorArgumentCount(); i++) {
                if (!getEffectConstructorArgument(i).isInitialized()) {
                    this.getInputSizeshNQ4ISI = (byte) 0;
                    return false;
                }
            }
            if (hasConclusionOfConditionalEffect() && !getConclusionOfConditionalEffect().isInitialized()) {
                this.getInputSizeshNQ4ISI = (byte) 0;
                return false;
            }
            this.getInputSizeshNQ4ISI = (byte) 1;
            return true;
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.MessageLite
        public final void writeTo(kotlin.reflect.jvm.internal.impl.protobuf.CodedOutputStream codedOutputStream) throws java.io.IOException {
            getSerializedSize();
            if ((this.Camera2StreamConfigurationMap & 1) == 1) {
                codedOutputStream.writeEnum(1, this.getOutputFormats.getNumber());
            }
            for (int i = 0; i < this.getHighSpeedVideoFpsRangesFor.size(); i++) {
                codedOutputStream.writeMessage(2, this.getHighSpeedVideoFpsRangesFor.get(i));
            }
            if ((this.Camera2StreamConfigurationMap & 2) == 2) {
                codedOutputStream.writeMessage(3, this.getHighResolutionOutputSizeshNQ4ISI);
            }
            if ((this.Camera2StreamConfigurationMap & 4) == 4) {
                codedOutputStream.writeEnum(4, this.getInputFormats.getNumber());
            }
            if ((this.Camera2StreamConfigurationMap & 8) == 8) {
                codedOutputStream.writeEnum(5, this.getHighSpeedVideoFpsRanges.getNumber());
            }
            codedOutputStream.writeRawBytes(this.getOutputMinFrameDuration);
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.MessageLite
        public final int getSerializedSize() {
            int i = this.getHighSpeedVideoSizesFor;
            if (i != -1) {
                return i;
            }
            int computeEnumSize = (this.Camera2StreamConfigurationMap & 1) == 1 ? kotlin.reflect.jvm.internal.impl.protobuf.CodedOutputStream.computeEnumSize(1, this.getOutputFormats.getNumber()) : 0;
            for (int i2 = 0; i2 < this.getHighSpeedVideoFpsRangesFor.size(); i2++) {
                computeEnumSize += kotlin.reflect.jvm.internal.impl.protobuf.CodedOutputStream.computeMessageSize(2, this.getHighSpeedVideoFpsRangesFor.get(i2));
            }
            if ((this.Camera2StreamConfigurationMap & 2) == 2) {
                computeEnumSize += kotlin.reflect.jvm.internal.impl.protobuf.CodedOutputStream.computeMessageSize(3, this.getHighResolutionOutputSizeshNQ4ISI);
            }
            if ((this.Camera2StreamConfigurationMap & 4) == 4) {
                computeEnumSize += kotlin.reflect.jvm.internal.impl.protobuf.CodedOutputStream.computeEnumSize(4, this.getInputFormats.getNumber());
            }
            if ((this.Camera2StreamConfigurationMap & 8) == 8) {
                computeEnumSize += kotlin.reflect.jvm.internal.impl.protobuf.CodedOutputStream.computeEnumSize(5, this.getHighSpeedVideoFpsRanges.getNumber());
            }
            int size = computeEnumSize + this.getOutputMinFrameDuration.size();
            this.getHighSpeedVideoSizesFor = size;
            return size;
        }

        public static kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Effect.Builder newBuilder() {
            return kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Effect.Builder.getHighSpeedVideoSizes();
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.MessageLite
        public final kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Effect.Builder newBuilderForType() {
            return newBuilder();
        }

        public static kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Effect.Builder newBuilder(kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Effect effect) {
            return newBuilder().mergeFrom(effect);
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.MessageLite
        public final kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Effect.Builder toBuilder() {
            return newBuilder(this);
        }

        public static final class Builder extends kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite.Builder<kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Effect, kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Effect.Builder> implements kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.EffectOrBuilder {
            private int getHighResolutionOutputSizeshNQ4ISI;
            private kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Effect.EffectType getHighSpeedVideoFpsRangesFor = kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Effect.EffectType.RETURNS_CONSTANT;
            private java.util.List<kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Expression> getHighSpeedVideoFpsRanges = java.util.Collections.emptyList();
            private kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Expression Camera2StreamConfigurationMap = kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Expression.getDefaultInstance();
            private kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Effect.InvocationKind getOutputMinFrameDuration = kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Effect.InvocationKind.AT_MOST_ONCE;
            private kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Effect.EffectConditionKind getHighSpeedVideoSizes = kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Effect.EffectConditionKind.CONCLUSION_CONDITION;

            private Builder() {
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite.Builder, kotlin.reflect.jvm.internal.impl.protobuf.MessageLiteOrBuilder
            public final kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Effect getDefaultInstanceForType() {
                return kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Effect.getDefaultInstance();
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.MessageLite.Builder
            public final kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Effect build() {
                kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Effect buildPartial = buildPartial();
                if (buildPartial.isInitialized()) {
                    return buildPartial;
                }
                throw newUninitializedMessageException(buildPartial);
            }

            /* JADX WARN: Multi-variable type inference failed */
            public final kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Effect buildPartial() {
                kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Effect effect = new kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Effect((kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite.Builder) this, (byte) (0 == true ? 1 : 0));
                int i = this.getHighResolutionOutputSizeshNQ4ISI;
                int i2 = (i & 1) == 1 ? 1 : 0;
                effect.getOutputFormats = this.getHighSpeedVideoFpsRangesFor;
                if ((this.getHighResolutionOutputSizeshNQ4ISI & 2) == 2) {
                    this.getHighSpeedVideoFpsRanges = java.util.Collections.unmodifiableList(this.getHighSpeedVideoFpsRanges);
                    this.getHighResolutionOutputSizeshNQ4ISI &= -3;
                }
                effect.getHighSpeedVideoFpsRangesFor = this.getHighSpeedVideoFpsRanges;
                if ((i & 4) == 4) {
                    i2 |= 2;
                }
                effect.getHighResolutionOutputSizeshNQ4ISI = this.Camera2StreamConfigurationMap;
                if ((i & 8) == 8) {
                    i2 |= 4;
                }
                effect.getInputFormats = this.getOutputMinFrameDuration;
                if ((i & 16) == 16) {
                    i2 |= 8;
                }
                effect.getHighSpeedVideoFpsRanges = this.getHighSpeedVideoSizes;
                effect.Camera2StreamConfigurationMap = i2;
                return effect;
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite.Builder
            public final kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Effect.Builder mergeFrom(kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Effect effect) {
                if (effect == kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Effect.getDefaultInstance()) {
                    return this;
                }
                if (effect.hasEffectType()) {
                    setEffectType(effect.getEffectType());
                }
                if (!effect.getHighSpeedVideoFpsRangesFor.isEmpty()) {
                    if (this.getHighSpeedVideoFpsRanges.isEmpty()) {
                        this.getHighSpeedVideoFpsRanges = effect.getHighSpeedVideoFpsRangesFor;
                        this.getHighResolutionOutputSizeshNQ4ISI &= -3;
                    } else {
                        if ((this.getHighResolutionOutputSizeshNQ4ISI & 2) != 2) {
                            this.getHighSpeedVideoFpsRanges = new java.util.ArrayList(this.getHighSpeedVideoFpsRanges);
                            this.getHighResolutionOutputSizeshNQ4ISI |= 2;
                        }
                        this.getHighSpeedVideoFpsRanges.addAll(effect.getHighSpeedVideoFpsRangesFor);
                    }
                }
                if (effect.hasConclusionOfConditionalEffect()) {
                    mergeConclusionOfConditionalEffect(effect.getConclusionOfConditionalEffect());
                }
                if (effect.hasKind()) {
                    setKind(effect.getKind());
                }
                if (effect.hasConditionKind()) {
                    setConditionKind(effect.getConditionKind());
                }
                setUnknownFields(getUnknownFields().concat(effect.getOutputMinFrameDuration));
                return this;
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.MessageLiteOrBuilder
            public final boolean isInitialized() {
                for (int i = 0; i < getEffectConstructorArgumentCount(); i++) {
                    if (!getEffectConstructorArgument(i).isInitialized()) {
                        return false;
                    }
                }
                return !hasConclusionOfConditionalEffect() || getConclusionOfConditionalEffect().isInitialized();
            }

            /* JADX WARN: Removed duplicated region for block: B:15:0x001d  */
            @Override // kotlin.reflect.jvm.internal.impl.protobuf.AbstractMessageLite.Builder, kotlin.reflect.jvm.internal.impl.protobuf.MessageLite.Builder
            /*
                Code decompiled incorrectly, please refer to instructions dump.
            */
            public final kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Effect.Builder mergeFrom(kotlin.reflect.jvm.internal.impl.protobuf.CodedInputStream codedInputStream, kotlin.reflect.jvm.internal.impl.protobuf.ExtensionRegistryLite extensionRegistryLite) throws java.io.IOException {
                kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Effect effect;
                try {
                    try {
                        kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Effect parsePartialFrom = kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Effect.PARSER.parsePartialFrom(codedInputStream, extensionRegistryLite);
                        if (parsePartialFrom != null) {
                            mergeFrom(parsePartialFrom);
                        }
                        return this;
                    } catch (kotlin.reflect.jvm.internal.impl.protobuf.InvalidProtocolBufferException e) {
                        effect = (kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Effect) e.getUnfinishedMessage();
                        try {
                            throw e;
                        } catch (java.lang.Throwable th) {
                            th = th;
                            if (effect != null) {
                                mergeFrom(effect);
                            }
                            throw th;
                        }
                    }
                } catch (java.lang.Throwable th2) {
                    th = th2;
                    effect = null;
                    if (effect != null) {
                    }
                    throw th;
                }
            }

            public final kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Effect.Builder setEffectType(kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Effect.EffectType effectType) {
                this.getHighResolutionOutputSizeshNQ4ISI |= 1;
                this.getHighSpeedVideoFpsRangesFor = effectType;
                return this;
            }

            public final int getEffectConstructorArgumentCount() {
                return this.getHighSpeedVideoFpsRanges.size();
            }

            public final kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Expression getEffectConstructorArgument(int i) {
                return this.getHighSpeedVideoFpsRanges.get(i);
            }

            public final boolean hasConclusionOfConditionalEffect() {
                return (this.getHighResolutionOutputSizeshNQ4ISI & 4) == 4;
            }

            public final kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Expression getConclusionOfConditionalEffect() {
                return this.Camera2StreamConfigurationMap;
            }

            public final kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Effect.Builder mergeConclusionOfConditionalEffect(kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Expression expression) {
                if ((this.getHighResolutionOutputSizeshNQ4ISI & 4) == 4 && this.Camera2StreamConfigurationMap != kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Expression.getDefaultInstance()) {
                    this.Camera2StreamConfigurationMap = kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Expression.newBuilder(this.Camera2StreamConfigurationMap).mergeFrom(expression).buildPartial();
                } else {
                    this.Camera2StreamConfigurationMap = expression;
                }
                this.getHighResolutionOutputSizeshNQ4ISI |= 4;
                return this;
            }

            public final kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Effect.Builder setKind(kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Effect.InvocationKind invocationKind) {
                this.getHighResolutionOutputSizeshNQ4ISI |= 8;
                this.getOutputMinFrameDuration = invocationKind;
                return this;
            }

            public final kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Effect.Builder setConditionKind(kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Effect.EffectConditionKind effectConditionKind) {
                this.getHighResolutionOutputSizeshNQ4ISI |= 16;
                this.getHighSpeedVideoSizes = effectConditionKind;
                return this;
            }

            static /* synthetic */ kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Effect.Builder getHighSpeedVideoSizes() {
                return new kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Effect.Builder();
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite.Builder, kotlin.reflect.jvm.internal.impl.protobuf.AbstractMessageLite.Builder
            /* renamed from: clone */
            public final kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Effect.Builder mo23897clone() {
                return new kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Effect.Builder().mergeFrom(buildPartial());
            }
        }
    }

    public static final class Expression extends kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite implements kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.ExpressionOrBuilder {
        public static kotlin.reflect.jvm.internal.impl.protobuf.Parser<kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Expression> PARSER = new kotlin.reflect.jvm.internal.impl.protobuf.AbstractParser<kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Expression>() { // from class: kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Expression.1
            @Override // kotlin.reflect.jvm.internal.impl.protobuf.Parser
            public final /* synthetic */ java.lang.Object parsePartialFrom(kotlin.reflect.jvm.internal.impl.protobuf.CodedInputStream codedInputStream, kotlin.reflect.jvm.internal.impl.protobuf.ExtensionRegistryLite extensionRegistryLite) throws kotlin.reflect.jvm.internal.impl.protobuf.InvalidProtocolBufferException {
                return new kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Expression(codedInputStream, extensionRegistryLite, (byte) 0);
            }
        };
        private static final kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Expression getHighSpeedVideoFpsRangesFor;
        private int Camera2StreamConfigurationMap;
        private int getHighResolutionOutputSizeshNQ4ISI;
        private java.util.List<kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Expression> getHighSpeedVideoFpsRanges;
        private kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Expression.ConstantValue getHighSpeedVideoSizes;
        private byte getHighSpeedVideoSizesFor;
        private int getInputFormats;
        private int getInputSizeshNQ4ISI;
        private kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Type getOutputFormats;
        private java.util.List<kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Expression> getOutputMinFrameDuration;
        private int getOutputSizes;
        private final kotlin.reflect.jvm.internal.impl.protobuf.ByteString getOutputStallDurationlomOqCM;

        /* synthetic */ Expression(kotlin.reflect.jvm.internal.impl.protobuf.CodedInputStream codedInputStream, kotlin.reflect.jvm.internal.impl.protobuf.ExtensionRegistryLite extensionRegistryLite, byte b) throws kotlin.reflect.jvm.internal.impl.protobuf.InvalidProtocolBufferException {
            this(codedInputStream, extensionRegistryLite);
        }

        /* synthetic */ Expression(kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite.Builder builder, byte b) {
            this(builder);
        }

        private Expression(kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite.Builder builder) {
            super(builder);
            this.getHighSpeedVideoSizesFor = (byte) -1;
            this.getInputSizeshNQ4ISI = -1;
            this.getOutputStallDurationlomOqCM = builder.getUnknownFields();
        }

        private Expression() {
            this.getHighSpeedVideoSizesFor = (byte) -1;
            this.getInputSizeshNQ4ISI = -1;
            this.getOutputStallDurationlomOqCM = kotlin.reflect.jvm.internal.impl.protobuf.ByteString.EMPTY;
        }

        public static kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Expression getDefaultInstance() {
            return getHighSpeedVideoFpsRangesFor;
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.MessageLiteOrBuilder
        public final kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Expression getDefaultInstanceForType() {
            return getHighSpeedVideoFpsRangesFor;
        }

        /* JADX WARN: Multi-variable type inference failed */
        private Expression(kotlin.reflect.jvm.internal.impl.protobuf.CodedInputStream codedInputStream, kotlin.reflect.jvm.internal.impl.protobuf.ExtensionRegistryLite extensionRegistryLite) throws kotlin.reflect.jvm.internal.impl.protobuf.InvalidProtocolBufferException {
            this.getHighSpeedVideoSizesFor = (byte) -1;
            this.getInputSizeshNQ4ISI = -1;
            getHighSpeedVideoFpsRangesFor();
            kotlin.reflect.jvm.internal.impl.protobuf.ByteString.Output newOutput = kotlin.reflect.jvm.internal.impl.protobuf.ByteString.newOutput();
            kotlin.reflect.jvm.internal.impl.protobuf.CodedOutputStream newInstance = kotlin.reflect.jvm.internal.impl.protobuf.CodedOutputStream.newInstance(newOutput, 1);
            boolean z = false;
            int i = 0;
            while (!z) {
                try {
                    try {
                        int readTag = codedInputStream.readTag();
                        if (readTag != 0) {
                            if (readTag == 8) {
                                this.Camera2StreamConfigurationMap |= 1;
                                this.getHighResolutionOutputSizeshNQ4ISI = codedInputStream.readInt32();
                            } else if (readTag == 16) {
                                this.Camera2StreamConfigurationMap |= 2;
                                this.getOutputSizes = codedInputStream.readInt32();
                            } else if (readTag == 24) {
                                int readEnum = codedInputStream.readEnum();
                                kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Expression.ConstantValue valueOf = kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Expression.ConstantValue.valueOf(readEnum);
                                if (valueOf == null) {
                                    newInstance.writeRawVarint32(readTag);
                                    newInstance.writeRawVarint32(readEnum);
                                } else {
                                    this.Camera2StreamConfigurationMap |= 4;
                                    this.getHighSpeedVideoSizes = valueOf;
                                }
                            } else if (readTag == 34) {
                                kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Type.Builder builder = (this.Camera2StreamConfigurationMap & 8) == 8 ? this.getOutputFormats.toBuilder() : null;
                                kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Type type = (kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Type) codedInputStream.readMessage(kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Type.PARSER, extensionRegistryLite);
                                this.getOutputFormats = type;
                                if (builder != null) {
                                    builder.mergeFrom(type);
                                    this.getOutputFormats = builder.buildPartial();
                                }
                                this.Camera2StreamConfigurationMap |= 8;
                            } else if (readTag == 40) {
                                this.Camera2StreamConfigurationMap |= 16;
                                this.getInputFormats = codedInputStream.readInt32();
                            } else if (readTag == 50) {
                                if ((i & 32) != 32) {
                                    this.getHighSpeedVideoFpsRanges = new java.util.ArrayList();
                                    i |= 32;
                                }
                                this.getHighSpeedVideoFpsRanges.add(codedInputStream.readMessage(PARSER, extensionRegistryLite));
                            } else if (readTag == 58) {
                                if ((i & 64) != 64) {
                                    this.getOutputMinFrameDuration = new java.util.ArrayList();
                                    i |= 64;
                                }
                                this.getOutputMinFrameDuration.add(codedInputStream.readMessage(PARSER, extensionRegistryLite));
                            } else if (!parseUnknownField(codedInputStream, newInstance, extensionRegistryLite, readTag)) {
                            }
                        }
                        z = true;
                    } catch (kotlin.reflect.jvm.internal.impl.protobuf.InvalidProtocolBufferException e) {
                        throw e.setUnfinishedMessage(this);
                    } catch (java.io.IOException e2) {
                        throw new kotlin.reflect.jvm.internal.impl.protobuf.InvalidProtocolBufferException(e2.getMessage()).setUnfinishedMessage(this);
                    }
                } catch (java.lang.Throwable th) {
                    if ((i & 32) == 32) {
                        this.getHighSpeedVideoFpsRanges = java.util.Collections.unmodifiableList(this.getHighSpeedVideoFpsRanges);
                    }
                    if ((i & 64) == 64) {
                        this.getOutputMinFrameDuration = java.util.Collections.unmodifiableList(this.getOutputMinFrameDuration);
                    }
                    try {
                        newInstance.flush();
                    } catch (java.io.IOException unused) {
                    } catch (java.lang.Throwable th2) {
                        this.getOutputStallDurationlomOqCM = newOutput.toByteString();
                        throw th2;
                    }
                    this.getOutputStallDurationlomOqCM = newOutput.toByteString();
                    makeExtensionsImmutable();
                    throw th;
                }
            }
            if ((i & 32) == 32) {
                this.getHighSpeedVideoFpsRanges = java.util.Collections.unmodifiableList(this.getHighSpeedVideoFpsRanges);
            }
            if ((i & 64) == 64) {
                this.getOutputMinFrameDuration = java.util.Collections.unmodifiableList(this.getOutputMinFrameDuration);
            }
            try {
                newInstance.flush();
            } catch (java.io.IOException unused2) {
            } catch (java.lang.Throwable th3) {
                this.getOutputStallDurationlomOqCM = newOutput.toByteString();
                throw th3;
            }
            this.getOutputStallDurationlomOqCM = newOutput.toByteString();
            makeExtensionsImmutable();
        }

        static {
            kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Expression expression = new kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Expression();
            getHighSpeedVideoFpsRangesFor = expression;
            expression.getHighSpeedVideoFpsRangesFor();
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite, kotlin.reflect.jvm.internal.impl.protobuf.MessageLite
        public final kotlin.reflect.jvm.internal.impl.protobuf.Parser<kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Expression> getParserForType() {
            return PARSER;
        }

        public enum ConstantValue implements kotlin.reflect.jvm.internal.impl.protobuf.Internal.EnumLite {
            TRUE(0),
            FALSE(1),
            NULL(2);

            private static kotlin.reflect.jvm.internal.impl.protobuf.Internal.EnumLiteMap<kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Expression.ConstantValue> getHighSpeedVideoFpsRangesFor = new kotlin.reflect.jvm.internal.impl.protobuf.Internal.EnumLiteMap<kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Expression.ConstantValue>() { // from class: kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Expression.ConstantValue.1
                @Override // kotlin.reflect.jvm.internal.impl.protobuf.Internal.EnumLiteMap
                public final /* synthetic */ kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Expression.ConstantValue findValueByNumber(int i) {
                    return kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Expression.ConstantValue.valueOf(i);
                }
            };
            private final int getHighSpeedVideoSizes;

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.Internal.EnumLite
            public final int getNumber() {
                return this.getHighSpeedVideoSizes;
            }

            public static kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Expression.ConstantValue valueOf(int i) {
                if (i == 0) {
                    return TRUE;
                }
                if (i == 1) {
                    return FALSE;
                }
                if (i != 2) {
                    return null;
                }
                return NULL;
            }

            ConstantValue(int i) {
                this.getHighSpeedVideoSizes = i;
            }
        }

        public final boolean hasFlags() {
            return (this.Camera2StreamConfigurationMap & 1) == 1;
        }

        public final int getFlags() {
            return this.getHighResolutionOutputSizeshNQ4ISI;
        }

        public final boolean hasValueParameterReference() {
            return (this.Camera2StreamConfigurationMap & 2) == 2;
        }

        public final int getValueParameterReference() {
            return this.getOutputSizes;
        }

        public final boolean hasConstantValue() {
            return (this.Camera2StreamConfigurationMap & 4) == 4;
        }

        public final kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Expression.ConstantValue getConstantValue() {
            return this.getHighSpeedVideoSizes;
        }

        public final boolean hasIsInstanceType() {
            return (this.Camera2StreamConfigurationMap & 8) == 8;
        }

        public final kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Type getIsInstanceType() {
            return this.getOutputFormats;
        }

        public final boolean hasIsInstanceTypeId() {
            return (this.Camera2StreamConfigurationMap & 16) == 16;
        }

        public final int getIsInstanceTypeId() {
            return this.getInputFormats;
        }

        public final java.util.List<kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Expression> getAndArgumentList() {
            return this.getHighSpeedVideoFpsRanges;
        }

        public final int getAndArgumentCount() {
            return this.getHighSpeedVideoFpsRanges.size();
        }

        public final kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Expression getAndArgument(int i) {
            return this.getHighSpeedVideoFpsRanges.get(i);
        }

        public final java.util.List<kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Expression> getOrArgumentList() {
            return this.getOutputMinFrameDuration;
        }

        public final int getOrArgumentCount() {
            return this.getOutputMinFrameDuration.size();
        }

        public final kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Expression getOrArgument(int i) {
            return this.getOutputMinFrameDuration.get(i);
        }

        private void getHighSpeedVideoFpsRangesFor() {
            this.getHighResolutionOutputSizeshNQ4ISI = 0;
            this.getOutputSizes = 0;
            this.getHighSpeedVideoSizes = kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Expression.ConstantValue.TRUE;
            this.getOutputFormats = kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Type.getDefaultInstance();
            this.getInputFormats = 0;
            this.getHighSpeedVideoFpsRanges = java.util.Collections.emptyList();
            this.getOutputMinFrameDuration = java.util.Collections.emptyList();
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.MessageLiteOrBuilder
        public final boolean isInitialized() {
            byte b = this.getHighSpeedVideoSizesFor;
            if (b == 1) {
                return true;
            }
            if (b == 0) {
                return false;
            }
            if (hasIsInstanceType() && !getIsInstanceType().isInitialized()) {
                this.getHighSpeedVideoSizesFor = (byte) 0;
                return false;
            }
            for (int i = 0; i < getAndArgumentCount(); i++) {
                if (!getAndArgument(i).isInitialized()) {
                    this.getHighSpeedVideoSizesFor = (byte) 0;
                    return false;
                }
            }
            for (int i2 = 0; i2 < getOrArgumentCount(); i2++) {
                if (!getOrArgument(i2).isInitialized()) {
                    this.getHighSpeedVideoSizesFor = (byte) 0;
                    return false;
                }
            }
            this.getHighSpeedVideoSizesFor = (byte) 1;
            return true;
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.MessageLite
        public final void writeTo(kotlin.reflect.jvm.internal.impl.protobuf.CodedOutputStream codedOutputStream) throws java.io.IOException {
            getSerializedSize();
            if ((this.Camera2StreamConfigurationMap & 1) == 1) {
                codedOutputStream.writeInt32(1, this.getHighResolutionOutputSizeshNQ4ISI);
            }
            if ((this.Camera2StreamConfigurationMap & 2) == 2) {
                codedOutputStream.writeInt32(2, this.getOutputSizes);
            }
            if ((this.Camera2StreamConfigurationMap & 4) == 4) {
                codedOutputStream.writeEnum(3, this.getHighSpeedVideoSizes.getNumber());
            }
            if ((this.Camera2StreamConfigurationMap & 8) == 8) {
                codedOutputStream.writeMessage(4, this.getOutputFormats);
            }
            if ((this.Camera2StreamConfigurationMap & 16) == 16) {
                codedOutputStream.writeInt32(5, this.getInputFormats);
            }
            for (int i = 0; i < this.getHighSpeedVideoFpsRanges.size(); i++) {
                codedOutputStream.writeMessage(6, this.getHighSpeedVideoFpsRanges.get(i));
            }
            for (int i2 = 0; i2 < this.getOutputMinFrameDuration.size(); i2++) {
                codedOutputStream.writeMessage(7, this.getOutputMinFrameDuration.get(i2));
            }
            codedOutputStream.writeRawBytes(this.getOutputStallDurationlomOqCM);
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.MessageLite
        public final int getSerializedSize() {
            int i = this.getInputSizeshNQ4ISI;
            if (i != -1) {
                return i;
            }
            int computeInt32Size = (this.Camera2StreamConfigurationMap & 1) == 1 ? kotlin.reflect.jvm.internal.impl.protobuf.CodedOutputStream.computeInt32Size(1, this.getHighResolutionOutputSizeshNQ4ISI) : 0;
            if ((this.Camera2StreamConfigurationMap & 2) == 2) {
                computeInt32Size += kotlin.reflect.jvm.internal.impl.protobuf.CodedOutputStream.computeInt32Size(2, this.getOutputSizes);
            }
            if ((this.Camera2StreamConfigurationMap & 4) == 4) {
                computeInt32Size += kotlin.reflect.jvm.internal.impl.protobuf.CodedOutputStream.computeEnumSize(3, this.getHighSpeedVideoSizes.getNumber());
            }
            if ((this.Camera2StreamConfigurationMap & 8) == 8) {
                computeInt32Size += kotlin.reflect.jvm.internal.impl.protobuf.CodedOutputStream.computeMessageSize(4, this.getOutputFormats);
            }
            if ((this.Camera2StreamConfigurationMap & 16) == 16) {
                computeInt32Size += kotlin.reflect.jvm.internal.impl.protobuf.CodedOutputStream.computeInt32Size(5, this.getInputFormats);
            }
            for (int i2 = 0; i2 < this.getHighSpeedVideoFpsRanges.size(); i2++) {
                computeInt32Size += kotlin.reflect.jvm.internal.impl.protobuf.CodedOutputStream.computeMessageSize(6, this.getHighSpeedVideoFpsRanges.get(i2));
            }
            for (int i3 = 0; i3 < this.getOutputMinFrameDuration.size(); i3++) {
                computeInt32Size += kotlin.reflect.jvm.internal.impl.protobuf.CodedOutputStream.computeMessageSize(7, this.getOutputMinFrameDuration.get(i3));
            }
            int size = computeInt32Size + this.getOutputStallDurationlomOqCM.size();
            this.getInputSizeshNQ4ISI = size;
            return size;
        }

        public static kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Expression.Builder newBuilder() {
            return kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Expression.Builder.getHighSpeedVideoFpsRangesFor();
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.MessageLite
        public final kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Expression.Builder newBuilderForType() {
            return newBuilder();
        }

        public static kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Expression.Builder newBuilder(kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Expression expression) {
            return newBuilder().mergeFrom(expression);
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.MessageLite
        public final kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Expression.Builder toBuilder() {
            return newBuilder(this);
        }

        public static final class Builder extends kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite.Builder<kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Expression, kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Expression.Builder> implements kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.ExpressionOrBuilder {
            private int getHighResolutionOutputSizeshNQ4ISI;
            private int getHighSpeedVideoFpsRanges;
            private int getHighSpeedVideoSizes;
            private int getOutputFormats;
            private kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Expression.ConstantValue Camera2StreamConfigurationMap = kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Expression.ConstantValue.TRUE;
            private kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Type getHighSpeedVideoSizesFor = kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Type.getDefaultInstance();
            private java.util.List<kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Expression> getHighSpeedVideoFpsRangesFor = java.util.Collections.emptyList();
            private java.util.List<kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Expression> getOutputMinFrameDuration = java.util.Collections.emptyList();

            static /* synthetic */ kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Expression.Builder getHighSpeedVideoFpsRangesFor() {
                return new kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Expression.Builder();
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite.Builder, kotlin.reflect.jvm.internal.impl.protobuf.AbstractMessageLite.Builder
            /* renamed from: clone */
            public final kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Expression.Builder mo23897clone() {
                return new kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Expression.Builder().mergeFrom(buildPartial());
            }

            private Builder() {
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite.Builder, kotlin.reflect.jvm.internal.impl.protobuf.MessageLiteOrBuilder
            public final kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Expression getDefaultInstanceForType() {
                return kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Expression.getDefaultInstance();
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.MessageLite.Builder
            public final kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Expression build() {
                kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Expression buildPartial = buildPartial();
                if (buildPartial.isInitialized()) {
                    return buildPartial;
                }
                throw newUninitializedMessageException(buildPartial);
            }

            /* JADX WARN: Multi-variable type inference failed */
            public final kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Expression buildPartial() {
                kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Expression expression = new kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Expression((kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite.Builder) this, (byte) (0 == true ? 1 : 0));
                int i = this.getHighSpeedVideoSizes;
                int i2 = (i & 1) == 1 ? 1 : 0;
                expression.getHighResolutionOutputSizeshNQ4ISI = this.getHighResolutionOutputSizeshNQ4ISI;
                if ((i & 2) == 2) {
                    i2 |= 2;
                }
                expression.getOutputSizes = this.getOutputFormats;
                if ((i & 4) == 4) {
                    i2 |= 4;
                }
                expression.getHighSpeedVideoSizes = this.Camera2StreamConfigurationMap;
                if ((i & 8) == 8) {
                    i2 |= 8;
                }
                expression.getOutputFormats = this.getHighSpeedVideoSizesFor;
                if ((i & 16) == 16) {
                    i2 |= 16;
                }
                expression.getInputFormats = this.getHighSpeedVideoFpsRanges;
                if ((this.getHighSpeedVideoSizes & 32) == 32) {
                    this.getHighSpeedVideoFpsRangesFor = java.util.Collections.unmodifiableList(this.getHighSpeedVideoFpsRangesFor);
                    this.getHighSpeedVideoSizes &= -33;
                }
                expression.getHighSpeedVideoFpsRanges = this.getHighSpeedVideoFpsRangesFor;
                if ((this.getHighSpeedVideoSizes & 64) == 64) {
                    this.getOutputMinFrameDuration = java.util.Collections.unmodifiableList(this.getOutputMinFrameDuration);
                    this.getHighSpeedVideoSizes &= -65;
                }
                expression.getOutputMinFrameDuration = this.getOutputMinFrameDuration;
                expression.Camera2StreamConfigurationMap = i2;
                return expression;
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite.Builder
            public final kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Expression.Builder mergeFrom(kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Expression expression) {
                if (expression == kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Expression.getDefaultInstance()) {
                    return this;
                }
                if (expression.hasFlags()) {
                    setFlags(expression.getFlags());
                }
                if (expression.hasValueParameterReference()) {
                    setValueParameterReference(expression.getValueParameterReference());
                }
                if (expression.hasConstantValue()) {
                    setConstantValue(expression.getConstantValue());
                }
                if (expression.hasIsInstanceType()) {
                    mergeIsInstanceType(expression.getIsInstanceType());
                }
                if (expression.hasIsInstanceTypeId()) {
                    setIsInstanceTypeId(expression.getIsInstanceTypeId());
                }
                if (!expression.getHighSpeedVideoFpsRanges.isEmpty()) {
                    if (this.getHighSpeedVideoFpsRangesFor.isEmpty()) {
                        this.getHighSpeedVideoFpsRangesFor = expression.getHighSpeedVideoFpsRanges;
                        this.getHighSpeedVideoSizes &= -33;
                    } else {
                        if ((this.getHighSpeedVideoSizes & 32) != 32) {
                            this.getHighSpeedVideoFpsRangesFor = new java.util.ArrayList(this.getHighSpeedVideoFpsRangesFor);
                            this.getHighSpeedVideoSizes |= 32;
                        }
                        this.getHighSpeedVideoFpsRangesFor.addAll(expression.getHighSpeedVideoFpsRanges);
                    }
                }
                if (!expression.getOutputMinFrameDuration.isEmpty()) {
                    if (this.getOutputMinFrameDuration.isEmpty()) {
                        this.getOutputMinFrameDuration = expression.getOutputMinFrameDuration;
                        this.getHighSpeedVideoSizes &= -65;
                    } else {
                        if ((this.getHighSpeedVideoSizes & 64) != 64) {
                            this.getOutputMinFrameDuration = new java.util.ArrayList(this.getOutputMinFrameDuration);
                            this.getHighSpeedVideoSizes |= 64;
                        }
                        this.getOutputMinFrameDuration.addAll(expression.getOutputMinFrameDuration);
                    }
                }
                setUnknownFields(getUnknownFields().concat(expression.getOutputStallDurationlomOqCM));
                return this;
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.MessageLiteOrBuilder
            public final boolean isInitialized() {
                if (hasIsInstanceType() && !getIsInstanceType().isInitialized()) {
                    return false;
                }
                for (int i = 0; i < getAndArgumentCount(); i++) {
                    if (!getAndArgument(i).isInitialized()) {
                        return false;
                    }
                }
                for (int i2 = 0; i2 < getOrArgumentCount(); i2++) {
                    if (!getOrArgument(i2).isInitialized()) {
                        return false;
                    }
                }
                return true;
            }

            /* JADX WARN: Removed duplicated region for block: B:15:0x001d  */
            @Override // kotlin.reflect.jvm.internal.impl.protobuf.AbstractMessageLite.Builder, kotlin.reflect.jvm.internal.impl.protobuf.MessageLite.Builder
            /*
                Code decompiled incorrectly, please refer to instructions dump.
            */
            public final kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Expression.Builder mergeFrom(kotlin.reflect.jvm.internal.impl.protobuf.CodedInputStream codedInputStream, kotlin.reflect.jvm.internal.impl.protobuf.ExtensionRegistryLite extensionRegistryLite) throws java.io.IOException {
                kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Expression expression;
                try {
                    try {
                        kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Expression parsePartialFrom = kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Expression.PARSER.parsePartialFrom(codedInputStream, extensionRegistryLite);
                        if (parsePartialFrom != null) {
                            mergeFrom(parsePartialFrom);
                        }
                        return this;
                    } catch (kotlin.reflect.jvm.internal.impl.protobuf.InvalidProtocolBufferException e) {
                        expression = (kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Expression) e.getUnfinishedMessage();
                        try {
                            throw e;
                        } catch (java.lang.Throwable th) {
                            th = th;
                            if (expression != null) {
                                mergeFrom(expression);
                            }
                            throw th;
                        }
                    }
                } catch (java.lang.Throwable th2) {
                    th = th2;
                    expression = null;
                    if (expression != null) {
                    }
                    throw th;
                }
            }

            public final kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Expression.Builder setFlags(int i) {
                this.getHighSpeedVideoSizes |= 1;
                this.getHighResolutionOutputSizeshNQ4ISI = i;
                return this;
            }

            public final kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Expression.Builder setValueParameterReference(int i) {
                this.getHighSpeedVideoSizes |= 2;
                this.getOutputFormats = i;
                return this;
            }

            public final kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Expression.Builder setConstantValue(kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Expression.ConstantValue constantValue) {
                this.getHighSpeedVideoSizes |= 4;
                this.Camera2StreamConfigurationMap = constantValue;
                return this;
            }

            public final boolean hasIsInstanceType() {
                return (this.getHighSpeedVideoSizes & 8) == 8;
            }

            public final kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Type getIsInstanceType() {
                return this.getHighSpeedVideoSizesFor;
            }

            public final kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Expression.Builder mergeIsInstanceType(kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Type type) {
                if ((this.getHighSpeedVideoSizes & 8) == 8 && this.getHighSpeedVideoSizesFor != kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Type.getDefaultInstance()) {
                    this.getHighSpeedVideoSizesFor = kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Type.newBuilder(this.getHighSpeedVideoSizesFor).mergeFrom(type).buildPartial();
                } else {
                    this.getHighSpeedVideoSizesFor = type;
                }
                this.getHighSpeedVideoSizes |= 8;
                return this;
            }

            public final kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Expression.Builder setIsInstanceTypeId(int i) {
                this.getHighSpeedVideoSizes |= 16;
                this.getHighSpeedVideoFpsRanges = i;
                return this;
            }

            public final int getAndArgumentCount() {
                return this.getHighSpeedVideoFpsRangesFor.size();
            }

            public final kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Expression getAndArgument(int i) {
                return this.getHighSpeedVideoFpsRangesFor.get(i);
            }

            public final int getOrArgumentCount() {
                return this.getOutputMinFrameDuration.size();
            }

            public final kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Expression getOrArgument(int i) {
                return this.getOutputMinFrameDuration.get(i);
            }
        }
    }

    public static final class CompilerPluginData extends kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite implements kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.CompilerPluginDataOrBuilder {
        public static kotlin.reflect.jvm.internal.impl.protobuf.Parser<kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.CompilerPluginData> PARSER = new kotlin.reflect.jvm.internal.impl.protobuf.AbstractParser<kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.CompilerPluginData>() { // from class: kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.CompilerPluginData.1
            @Override // kotlin.reflect.jvm.internal.impl.protobuf.Parser
            public final /* synthetic */ java.lang.Object parsePartialFrom(kotlin.reflect.jvm.internal.impl.protobuf.CodedInputStream codedInputStream, kotlin.reflect.jvm.internal.impl.protobuf.ExtensionRegistryLite extensionRegistryLite) throws kotlin.reflect.jvm.internal.impl.protobuf.InvalidProtocolBufferException {
                return new kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.CompilerPluginData(codedInputStream, extensionRegistryLite, (byte) 0);
            }
        };
        private static final kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.CompilerPluginData getHighSpeedVideoSizes;
        private kotlin.reflect.jvm.internal.impl.protobuf.ByteString Camera2StreamConfigurationMap;
        private byte getHighResolutionOutputSizeshNQ4ISI;
        private int getHighSpeedVideoFpsRanges;
        private int getHighSpeedVideoFpsRangesFor;
        private int getInputFormats;
        private final kotlin.reflect.jvm.internal.impl.protobuf.ByteString getInputSizeshNQ4ISI;

        /* synthetic */ CompilerPluginData(kotlin.reflect.jvm.internal.impl.protobuf.CodedInputStream codedInputStream, kotlin.reflect.jvm.internal.impl.protobuf.ExtensionRegistryLite extensionRegistryLite, byte b) throws kotlin.reflect.jvm.internal.impl.protobuf.InvalidProtocolBufferException {
            this(codedInputStream, extensionRegistryLite);
        }

        /* synthetic */ CompilerPluginData(kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite.Builder builder, byte b) {
            this(builder);
        }

        private CompilerPluginData(kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite.Builder builder) {
            super(builder);
            this.getHighResolutionOutputSizeshNQ4ISI = (byte) -1;
            this.getHighSpeedVideoFpsRanges = -1;
            this.getInputSizeshNQ4ISI = builder.getUnknownFields();
        }

        private CompilerPluginData() {
            this.getHighResolutionOutputSizeshNQ4ISI = (byte) -1;
            this.getHighSpeedVideoFpsRanges = -1;
            this.getInputSizeshNQ4ISI = kotlin.reflect.jvm.internal.impl.protobuf.ByteString.EMPTY;
        }

        public static kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.CompilerPluginData getDefaultInstance() {
            return getHighSpeedVideoSizes;
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.MessageLiteOrBuilder
        public final kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.CompilerPluginData getDefaultInstanceForType() {
            return getHighSpeedVideoSizes;
        }

        private CompilerPluginData(kotlin.reflect.jvm.internal.impl.protobuf.CodedInputStream codedInputStream, kotlin.reflect.jvm.internal.impl.protobuf.ExtensionRegistryLite extensionRegistryLite) throws kotlin.reflect.jvm.internal.impl.protobuf.InvalidProtocolBufferException {
            this.getHighResolutionOutputSizeshNQ4ISI = (byte) -1;
            this.getHighSpeedVideoFpsRanges = -1;
            boolean z = false;
            this.getInputFormats = 0;
            this.Camera2StreamConfigurationMap = kotlin.reflect.jvm.internal.impl.protobuf.ByteString.EMPTY;
            kotlin.reflect.jvm.internal.impl.protobuf.ByteString.Output newOutput = kotlin.reflect.jvm.internal.impl.protobuf.ByteString.newOutput();
            kotlin.reflect.jvm.internal.impl.protobuf.CodedOutputStream newInstance = kotlin.reflect.jvm.internal.impl.protobuf.CodedOutputStream.newInstance(newOutput, 1);
            while (!z) {
                try {
                    try {
                        try {
                            int readTag = codedInputStream.readTag();
                            if (readTag != 0) {
                                if (readTag == 8) {
                                    this.getHighSpeedVideoFpsRangesFor |= 1;
                                    this.getInputFormats = codedInputStream.readInt32();
                                } else if (readTag == 18) {
                                    this.getHighSpeedVideoFpsRangesFor |= 2;
                                    this.Camera2StreamConfigurationMap = codedInputStream.readBytes();
                                } else if (!parseUnknownField(codedInputStream, newInstance, extensionRegistryLite, readTag)) {
                                }
                            }
                            z = true;
                        } catch (kotlin.reflect.jvm.internal.impl.protobuf.InvalidProtocolBufferException e) {
                            throw e.setUnfinishedMessage(this);
                        }
                    } catch (java.io.IOException e2) {
                        throw new kotlin.reflect.jvm.internal.impl.protobuf.InvalidProtocolBufferException(e2.getMessage()).setUnfinishedMessage(this);
                    }
                } catch (java.lang.Throwable th) {
                    try {
                        newInstance.flush();
                    } catch (java.io.IOException unused) {
                    } catch (java.lang.Throwable th2) {
                        this.getInputSizeshNQ4ISI = newOutput.toByteString();
                        throw th2;
                    }
                    this.getInputSizeshNQ4ISI = newOutput.toByteString();
                    makeExtensionsImmutable();
                    throw th;
                }
            }
            try {
                newInstance.flush();
            } catch (java.io.IOException unused2) {
            } catch (java.lang.Throwable th3) {
                this.getInputSizeshNQ4ISI = newOutput.toByteString();
                throw th3;
            }
            this.getInputSizeshNQ4ISI = newOutput.toByteString();
            makeExtensionsImmutable();
        }

        static {
            kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.CompilerPluginData compilerPluginData = new kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.CompilerPluginData();
            getHighSpeedVideoSizes = compilerPluginData;
            compilerPluginData.getInputFormats = 0;
            compilerPluginData.Camera2StreamConfigurationMap = kotlin.reflect.jvm.internal.impl.protobuf.ByteString.EMPTY;
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite, kotlin.reflect.jvm.internal.impl.protobuf.MessageLite
        public final kotlin.reflect.jvm.internal.impl.protobuf.Parser<kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.CompilerPluginData> getParserForType() {
            return PARSER;
        }

        public final boolean hasPluginId() {
            return (this.getHighSpeedVideoFpsRangesFor & 1) == 1;
        }

        public final int getPluginId() {
            return this.getInputFormats;
        }

        public final boolean hasData() {
            return (this.getHighSpeedVideoFpsRangesFor & 2) == 2;
        }

        public final kotlin.reflect.jvm.internal.impl.protobuf.ByteString getData() {
            return this.Camera2StreamConfigurationMap;
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.MessageLiteOrBuilder
        public final boolean isInitialized() {
            byte b = this.getHighResolutionOutputSizeshNQ4ISI;
            if (b == 1) {
                return true;
            }
            if (b == 0) {
                return false;
            }
            if (!hasPluginId()) {
                this.getHighResolutionOutputSizeshNQ4ISI = (byte) 0;
                return false;
            }
            if (!hasData()) {
                this.getHighResolutionOutputSizeshNQ4ISI = (byte) 0;
                return false;
            }
            this.getHighResolutionOutputSizeshNQ4ISI = (byte) 1;
            return true;
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.MessageLite
        public final void writeTo(kotlin.reflect.jvm.internal.impl.protobuf.CodedOutputStream codedOutputStream) throws java.io.IOException {
            getSerializedSize();
            if ((this.getHighSpeedVideoFpsRangesFor & 1) == 1) {
                codedOutputStream.writeInt32(1, this.getInputFormats);
            }
            if ((this.getHighSpeedVideoFpsRangesFor & 2) == 2) {
                codedOutputStream.writeBytes(2, this.Camera2StreamConfigurationMap);
            }
            codedOutputStream.writeRawBytes(this.getInputSizeshNQ4ISI);
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.MessageLite
        public final int getSerializedSize() {
            int i = this.getHighSpeedVideoFpsRanges;
            if (i != -1) {
                return i;
            }
            int computeInt32Size = (this.getHighSpeedVideoFpsRangesFor & 1) == 1 ? kotlin.reflect.jvm.internal.impl.protobuf.CodedOutputStream.computeInt32Size(1, this.getInputFormats) : 0;
            if ((this.getHighSpeedVideoFpsRangesFor & 2) == 2) {
                computeInt32Size += kotlin.reflect.jvm.internal.impl.protobuf.CodedOutputStream.computeBytesSize(2, this.Camera2StreamConfigurationMap);
            }
            int size = computeInt32Size + this.getInputSizeshNQ4ISI.size();
            this.getHighSpeedVideoFpsRanges = size;
            return size;
        }

        public static kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.CompilerPluginData.Builder newBuilder() {
            return kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.CompilerPluginData.Builder.getHighSpeedVideoFpsRanges();
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.MessageLite
        public final kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.CompilerPluginData.Builder newBuilderForType() {
            return newBuilder();
        }

        public static kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.CompilerPluginData.Builder newBuilder(kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.CompilerPluginData compilerPluginData) {
            return newBuilder().mergeFrom(compilerPluginData);
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.MessageLite
        public final kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.CompilerPluginData.Builder toBuilder() {
            return newBuilder(this);
        }

        public static final class Builder extends kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite.Builder<kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.CompilerPluginData, kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.CompilerPluginData.Builder> implements kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.CompilerPluginDataOrBuilder {
            private int getHighResolutionOutputSizeshNQ4ISI;
            private kotlin.reflect.jvm.internal.impl.protobuf.ByteString getHighSpeedVideoFpsRanges = kotlin.reflect.jvm.internal.impl.protobuf.ByteString.EMPTY;
            private int getHighSpeedVideoSizes;

            static /* synthetic */ kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.CompilerPluginData.Builder getHighSpeedVideoFpsRanges() {
                return new kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.CompilerPluginData.Builder();
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite.Builder, kotlin.reflect.jvm.internal.impl.protobuf.AbstractMessageLite.Builder
            /* renamed from: clone */
            public final kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.CompilerPluginData.Builder mo23897clone() {
                return new kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.CompilerPluginData.Builder().mergeFrom(buildPartial());
            }

            private Builder() {
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite.Builder, kotlin.reflect.jvm.internal.impl.protobuf.MessageLiteOrBuilder
            public final kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.CompilerPluginData getDefaultInstanceForType() {
                return kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.CompilerPluginData.getDefaultInstance();
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.MessageLite.Builder
            public final kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.CompilerPluginData build() {
                kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.CompilerPluginData buildPartial = buildPartial();
                if (buildPartial.isInitialized()) {
                    return buildPartial;
                }
                throw newUninitializedMessageException(buildPartial);
            }

            /* JADX WARN: Multi-variable type inference failed */
            public final kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.CompilerPluginData buildPartial() {
                kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.CompilerPluginData compilerPluginData = new kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.CompilerPluginData((kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite.Builder) this, (byte) (0 == true ? 1 : 0));
                int i = this.getHighSpeedVideoSizes;
                int i2 = (i & 1) == 1 ? 1 : 0;
                compilerPluginData.getInputFormats = this.getHighResolutionOutputSizeshNQ4ISI;
                if ((i & 2) == 2) {
                    i2 |= 2;
                }
                compilerPluginData.Camera2StreamConfigurationMap = this.getHighSpeedVideoFpsRanges;
                compilerPluginData.getHighSpeedVideoFpsRangesFor = i2;
                return compilerPluginData;
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite.Builder
            public final kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.CompilerPluginData.Builder mergeFrom(kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.CompilerPluginData compilerPluginData) {
                if (compilerPluginData == kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.CompilerPluginData.getDefaultInstance()) {
                    return this;
                }
                if (compilerPluginData.hasPluginId()) {
                    setPluginId(compilerPluginData.getPluginId());
                }
                if (compilerPluginData.hasData()) {
                    setData(compilerPluginData.getData());
                }
                setUnknownFields(getUnknownFields().concat(compilerPluginData.getInputSizeshNQ4ISI));
                return this;
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.MessageLiteOrBuilder
            public final boolean isInitialized() {
                return hasPluginId() && hasData();
            }

            /* JADX WARN: Removed duplicated region for block: B:15:0x001d  */
            @Override // kotlin.reflect.jvm.internal.impl.protobuf.AbstractMessageLite.Builder, kotlin.reflect.jvm.internal.impl.protobuf.MessageLite.Builder
            /*
                Code decompiled incorrectly, please refer to instructions dump.
            */
            public final kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.CompilerPluginData.Builder mergeFrom(kotlin.reflect.jvm.internal.impl.protobuf.CodedInputStream codedInputStream, kotlin.reflect.jvm.internal.impl.protobuf.ExtensionRegistryLite extensionRegistryLite) throws java.io.IOException {
                kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.CompilerPluginData compilerPluginData;
                try {
                    try {
                        kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.CompilerPluginData parsePartialFrom = kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.CompilerPluginData.PARSER.parsePartialFrom(codedInputStream, extensionRegistryLite);
                        if (parsePartialFrom != null) {
                            mergeFrom(parsePartialFrom);
                        }
                        return this;
                    } catch (kotlin.reflect.jvm.internal.impl.protobuf.InvalidProtocolBufferException e) {
                        compilerPluginData = (kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.CompilerPluginData) e.getUnfinishedMessage();
                        try {
                            throw e;
                        } catch (java.lang.Throwable th) {
                            th = th;
                            if (compilerPluginData != null) {
                                mergeFrom(compilerPluginData);
                            }
                            throw th;
                        }
                    }
                } catch (java.lang.Throwable th2) {
                    th = th2;
                    compilerPluginData = null;
                    if (compilerPluginData != null) {
                    }
                    throw th;
                }
            }

            public final boolean hasPluginId() {
                return (this.getHighSpeedVideoSizes & 1) == 1;
            }

            public final kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.CompilerPluginData.Builder setPluginId(int i) {
                this.getHighSpeedVideoSizes |= 1;
                this.getHighResolutionOutputSizeshNQ4ISI = i;
                return this;
            }

            public final boolean hasData() {
                return (this.getHighSpeedVideoSizes & 2) == 2;
            }

            public final kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.CompilerPluginData.Builder setData(kotlin.reflect.jvm.internal.impl.protobuf.ByteString byteString) {
                this.getHighSpeedVideoSizes |= 2;
                this.getHighSpeedVideoFpsRanges = byteString;
                return this;
            }
        }
    }
}
