package gatewayprotocol.v1;

import com.google.protobuf.ByteString;
import com.google.protobuf.CodedInputStream;
import com.google.protobuf.ExtensionRegistryLite;
import com.google.protobuf.GeneratedMessageLite;
import com.google.protobuf.InvalidProtocolBufferException;
import com.google.protobuf.MessageLiteOrBuilder;
import com.google.protobuf.Parser;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;

/* loaded from: classes7.dex */
public final class ModuleOuterClass {

    public interface ModuleOrBuilder extends MessageLiteOrBuilder {
        ByteString getConfig();

        String getInitializerClass();

        ByteString getInitializerClassBytes();

        String getName();

        ByteString getNameBytes();
    }

    public static void registerAllExtensions(ExtensionRegistryLite extensionRegistryLite) {
    }

    private ModuleOuterClass() {
    }

    public static final class Module extends GeneratedMessageLite<Module, Builder> implements ModuleOrBuilder {
        public static final int CONFIG_FIELD_NUMBER = 3;
        private static final Module DEFAULT_INSTANCE;
        public static final int INITIALIZER_CLASS_FIELD_NUMBER = 2;
        public static final int NAME_FIELD_NUMBER = 1;
        private static volatile Parser<Module> PARSER;
        private String name_ = "";
        private String initializerClass_ = "";
        private ByteString config_ = ByteString.EMPTY;

        private Module() {
        }

        @Override // gatewayprotocol.v1.ModuleOuterClass.ModuleOrBuilder
        public String getName() {
            return this.name_;
        }

        @Override // gatewayprotocol.v1.ModuleOuterClass.ModuleOrBuilder
        public ByteString getNameBytes() {
            return ByteString.copyFromUtf8(this.name_);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setName(String str) {
            str.getClass();
            this.name_ = str;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearName() {
            this.name_ = getDefaultInstance().getName();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setNameBytes(ByteString byteString) {
            checkByteStringIsUtf8(byteString);
            this.name_ = byteString.toStringUtf8();
        }

        @Override // gatewayprotocol.v1.ModuleOuterClass.ModuleOrBuilder
        public String getInitializerClass() {
            return this.initializerClass_;
        }

        @Override // gatewayprotocol.v1.ModuleOuterClass.ModuleOrBuilder
        public ByteString getInitializerClassBytes() {
            return ByteString.copyFromUtf8(this.initializerClass_);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setInitializerClass(String str) {
            str.getClass();
            this.initializerClass_ = str;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearInitializerClass() {
            this.initializerClass_ = getDefaultInstance().getInitializerClass();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setInitializerClassBytes(ByteString byteString) {
            checkByteStringIsUtf8(byteString);
            this.initializerClass_ = byteString.toStringUtf8();
        }

        @Override // gatewayprotocol.v1.ModuleOuterClass.ModuleOrBuilder
        public ByteString getConfig() {
            return this.config_;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setConfig(ByteString byteString) {
            byteString.getClass();
            this.config_ = byteString;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearConfig() {
            this.config_ = getDefaultInstance().getConfig();
        }

        public static Module parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
            return (Module) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
        }

        public static Module parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            return (Module) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
        }

        public static Module parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
            return (Module) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
        }

        public static Module parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            return (Module) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
        }

        public static Module parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
            return (Module) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
        }

        public static Module parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            return (Module) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
        }

        public static Module parseFrom(InputStream inputStream) throws IOException {
            return (Module) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static Module parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            return (Module) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
        }

        public static Module parseDelimitedFrom(InputStream inputStream) throws IOException {
            return (Module) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static Module parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            return (Module) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
        }

        public static Module parseFrom(CodedInputStream codedInputStream) throws IOException {
            return (Module) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
        }

        public static Module parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            return (Module) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
        }

        public static Builder newBuilder() {
            return DEFAULT_INSTANCE.createBuilder();
        }

        public static Builder newBuilder(Module module) {
            return DEFAULT_INSTANCE.createBuilder(module);
        }

        public static final class Builder extends GeneratedMessageLite.Builder<Module, Builder> implements ModuleOrBuilder {
            /* synthetic */ Builder(AnonymousClass1 anonymousClass1) {
                this();
            }

            private Builder() {
                super(Module.DEFAULT_INSTANCE);
            }

            @Override // gatewayprotocol.v1.ModuleOuterClass.ModuleOrBuilder
            public String getName() {
                return ((Module) this.instance).getName();
            }

            @Override // gatewayprotocol.v1.ModuleOuterClass.ModuleOrBuilder
            public ByteString getNameBytes() {
                return ((Module) this.instance).getNameBytes();
            }

            public Builder setName(String str) {
                copyOnWrite();
                ((Module) this.instance).setName(str);
                return this;
            }

            public Builder clearName() {
                copyOnWrite();
                ((Module) this.instance).clearName();
                return this;
            }

            public Builder setNameBytes(ByteString byteString) {
                copyOnWrite();
                ((Module) this.instance).setNameBytes(byteString);
                return this;
            }

            @Override // gatewayprotocol.v1.ModuleOuterClass.ModuleOrBuilder
            public String getInitializerClass() {
                return ((Module) this.instance).getInitializerClass();
            }

            @Override // gatewayprotocol.v1.ModuleOuterClass.ModuleOrBuilder
            public ByteString getInitializerClassBytes() {
                return ((Module) this.instance).getInitializerClassBytes();
            }

            public Builder setInitializerClass(String str) {
                copyOnWrite();
                ((Module) this.instance).setInitializerClass(str);
                return this;
            }

            public Builder clearInitializerClass() {
                copyOnWrite();
                ((Module) this.instance).clearInitializerClass();
                return this;
            }

            public Builder setInitializerClassBytes(ByteString byteString) {
                copyOnWrite();
                ((Module) this.instance).setInitializerClassBytes(byteString);
                return this;
            }

            @Override // gatewayprotocol.v1.ModuleOuterClass.ModuleOrBuilder
            public ByteString getConfig() {
                return ((Module) this.instance).getConfig();
            }

            public Builder setConfig(ByteString byteString) {
                copyOnWrite();
                ((Module) this.instance).setConfig(byteString);
                return this;
            }

            public Builder clearConfig() {
                copyOnWrite();
                ((Module) this.instance).clearConfig();
                return this;
            }
        }

        @Override // com.google.protobuf.GeneratedMessageLite
        protected final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
            AnonymousClass1 anonymousClass1 = null;
            switch (AnonymousClass1.$SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke[methodToInvoke.ordinal()]) {
                case 1:
                    return new Module();
                case 2:
                    return new Builder(anonymousClass1);
                case 3:
                    return newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0000\u0000\u0001Ȉ\u0002Ȉ\u0003\n", new Object[]{"name_", "initializerClass_", "config_"});
                case 4:
                    return DEFAULT_INSTANCE;
                case 5:
                    Parser<Module> parser = PARSER;
                    if (parser == null) {
                        synchronized (Module.class) {
                            parser = PARSER;
                            if (parser == null) {
                                parser = new GeneratedMessageLite.DefaultInstanceBasedParser<>(DEFAULT_INSTANCE);
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
                    throw new UnsupportedOperationException();
            }
        }

        static {
            Module module = new Module();
            DEFAULT_INSTANCE = module;
            GeneratedMessageLite.registerDefaultInstance(Module.class, module);
        }

        public static Module getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static Parser<Module> parser() {
            return DEFAULT_INSTANCE.getParserForType();
        }
    }

    /* renamed from: gatewayprotocol.v1.ModuleOuterClass$1, reason: invalid class name */
    static /* synthetic */ class AnonymousClass1 {
        static final /* synthetic */ int[] $SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke;

        static {
            int[] iArr = new int[GeneratedMessageLite.MethodToInvoke.values().length];
            $SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke = iArr;
            try {
                iArr[GeneratedMessageLite.MethodToInvoke.NEW_MUTABLE_INSTANCE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                $SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke[GeneratedMessageLite.MethodToInvoke.NEW_BUILDER.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                $SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke[GeneratedMessageLite.MethodToInvoke.BUILD_MESSAGE_INFO.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                $SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke[GeneratedMessageLite.MethodToInvoke.GET_DEFAULT_INSTANCE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                $SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke[GeneratedMessageLite.MethodToInvoke.GET_PARSER.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                $SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke[GeneratedMessageLite.MethodToInvoke.GET_MEMOIZED_IS_INITIALIZED.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                $SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke[GeneratedMessageLite.MethodToInvoke.SET_MEMOIZED_IS_INITIALIZED.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
        }
    }
}
