package gatewayprotocol.v1;

import com.google.protobuf.ByteString;
import com.google.protobuf.CodedInputStream;
import com.google.protobuf.ExtensionRegistryLite;
import com.google.protobuf.GeneratedMessageLite;
import com.google.protobuf.Internal;
import com.google.protobuf.InvalidProtocolBufferException;
import com.google.protobuf.MessageLiteOrBuilder;
import com.google.protobuf.Parser;
import gatewayprotocol.v1.DynamicDeviceInfoOuterClass;
import gatewayprotocol.v1.StaticDeviceInfoOuterClass;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;

/* loaded from: classes7.dex */
public final class LifecycleEventRequestOuterClass {

    public interface LifecycleEventRequestOrBuilder extends MessageLiteOrBuilder {
        DynamicDeviceInfoOuterClass.DynamicDeviceInfo getDynamicDeviceInfo();

        ByteString getEventId();

        LifecycleEventType getLifecycleEventType();

        int getLifecycleEventTypeValue();

        StaticDeviceInfoOuterClass.StaticDeviceInfo getStaticDeviceInfo();

        boolean hasDynamicDeviceInfo();

        boolean hasStaticDeviceInfo();
    }

    public static void registerAllExtensions(ExtensionRegistryLite extensionRegistryLite) {
    }

    private LifecycleEventRequestOuterClass() {
    }

    public enum LifecycleEventType implements Internal.EnumLite {
        LIFECYCLE_EVENT_TYPE_UNSPECIFIED(0),
        LIFECYCLE_EVENT_TYPE_BACKGROUND(1),
        LIFECYCLE_EVENT_TYPE_FOREGROUND(2),
        UNRECOGNIZED(-1);

        public static final int LIFECYCLE_EVENT_TYPE_BACKGROUND_VALUE = 1;
        public static final int LIFECYCLE_EVENT_TYPE_FOREGROUND_VALUE = 2;
        public static final int LIFECYCLE_EVENT_TYPE_UNSPECIFIED_VALUE = 0;
        private static final Internal.EnumLiteMap<LifecycleEventType> internalValueMap = new Internal.EnumLiteMap<LifecycleEventType>() { // from class: gatewayprotocol.v1.LifecycleEventRequestOuterClass.LifecycleEventType.1
            @Override // com.google.protobuf.Internal.EnumLiteMap
            public LifecycleEventType findValueByNumber(int i) {
                return LifecycleEventType.forNumber(i);
            }
        };
        private final int value;

        @Override // com.google.protobuf.Internal.EnumLite
        public final int getNumber() {
            if (this == UNRECOGNIZED) {
                throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
            }
            return this.value;
        }

        @Deprecated
        public static LifecycleEventType valueOf(int i) {
            return forNumber(i);
        }

        public static LifecycleEventType forNumber(int i) {
            if (i == 0) {
                return LIFECYCLE_EVENT_TYPE_UNSPECIFIED;
            }
            if (i == 1) {
                return LIFECYCLE_EVENT_TYPE_BACKGROUND;
            }
            if (i != 2) {
                return null;
            }
            return LIFECYCLE_EVENT_TYPE_FOREGROUND;
        }

        public static Internal.EnumLiteMap<LifecycleEventType> internalGetValueMap() {
            return internalValueMap;
        }

        public static Internal.EnumVerifier internalGetVerifier() {
            return LifecycleEventTypeVerifier.INSTANCE;
        }

        private static final class LifecycleEventTypeVerifier implements Internal.EnumVerifier {
            static final Internal.EnumVerifier INSTANCE = new LifecycleEventTypeVerifier();

            private LifecycleEventTypeVerifier() {
            }

            @Override // com.google.protobuf.Internal.EnumVerifier
            public boolean isInRange(int i) {
                return LifecycleEventType.forNumber(i) != null;
            }
        }

        LifecycleEventType(int i) {
            this.value = i;
        }
    }

    public static final class LifecycleEventRequest extends GeneratedMessageLite<LifecycleEventRequest, Builder> implements LifecycleEventRequestOrBuilder {
        private static final LifecycleEventRequest DEFAULT_INSTANCE;
        public static final int DYNAMIC_DEVICE_INFO_FIELD_NUMBER = 2;
        public static final int EVENT_ID_FIELD_NUMBER = 4;
        public static final int LIFECYCLE_EVENT_TYPE_FIELD_NUMBER = 3;
        private static volatile Parser<LifecycleEventRequest> PARSER = null;
        public static final int STATIC_DEVICE_INFO_FIELD_NUMBER = 1;
        private int bitField0_;
        private DynamicDeviceInfoOuterClass.DynamicDeviceInfo dynamicDeviceInfo_;
        private ByteString eventId_ = ByteString.EMPTY;
        private int lifecycleEventType_;
        private StaticDeviceInfoOuterClass.StaticDeviceInfo staticDeviceInfo_;

        private LifecycleEventRequest() {
        }

        @Override // gatewayprotocol.v1.LifecycleEventRequestOuterClass.LifecycleEventRequestOrBuilder
        public boolean hasStaticDeviceInfo() {
            return (this.bitField0_ & 1) != 0;
        }

        @Override // gatewayprotocol.v1.LifecycleEventRequestOuterClass.LifecycleEventRequestOrBuilder
        public StaticDeviceInfoOuterClass.StaticDeviceInfo getStaticDeviceInfo() {
            StaticDeviceInfoOuterClass.StaticDeviceInfo staticDeviceInfo = this.staticDeviceInfo_;
            return staticDeviceInfo == null ? StaticDeviceInfoOuterClass.StaticDeviceInfo.getDefaultInstance() : staticDeviceInfo;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setStaticDeviceInfo(StaticDeviceInfoOuterClass.StaticDeviceInfo staticDeviceInfo) {
            staticDeviceInfo.getClass();
            this.staticDeviceInfo_ = staticDeviceInfo;
            this.bitField0_ |= 1;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void mergeStaticDeviceInfo(StaticDeviceInfoOuterClass.StaticDeviceInfo staticDeviceInfo) {
            staticDeviceInfo.getClass();
            StaticDeviceInfoOuterClass.StaticDeviceInfo staticDeviceInfo2 = this.staticDeviceInfo_;
            if (staticDeviceInfo2 != null && staticDeviceInfo2 != StaticDeviceInfoOuterClass.StaticDeviceInfo.getDefaultInstance()) {
                this.staticDeviceInfo_ = StaticDeviceInfoOuterClass.StaticDeviceInfo.newBuilder(this.staticDeviceInfo_).mergeFrom((StaticDeviceInfoOuterClass.StaticDeviceInfo.Builder) staticDeviceInfo).buildPartial();
            } else {
                this.staticDeviceInfo_ = staticDeviceInfo;
            }
            this.bitField0_ |= 1;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearStaticDeviceInfo() {
            this.staticDeviceInfo_ = null;
            this.bitField0_ &= -2;
        }

        @Override // gatewayprotocol.v1.LifecycleEventRequestOuterClass.LifecycleEventRequestOrBuilder
        public boolean hasDynamicDeviceInfo() {
            return (this.bitField0_ & 2) != 0;
        }

        @Override // gatewayprotocol.v1.LifecycleEventRequestOuterClass.LifecycleEventRequestOrBuilder
        public DynamicDeviceInfoOuterClass.DynamicDeviceInfo getDynamicDeviceInfo() {
            DynamicDeviceInfoOuterClass.DynamicDeviceInfo dynamicDeviceInfo = this.dynamicDeviceInfo_;
            return dynamicDeviceInfo == null ? DynamicDeviceInfoOuterClass.DynamicDeviceInfo.getDefaultInstance() : dynamicDeviceInfo;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setDynamicDeviceInfo(DynamicDeviceInfoOuterClass.DynamicDeviceInfo dynamicDeviceInfo) {
            dynamicDeviceInfo.getClass();
            this.dynamicDeviceInfo_ = dynamicDeviceInfo;
            this.bitField0_ |= 2;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void mergeDynamicDeviceInfo(DynamicDeviceInfoOuterClass.DynamicDeviceInfo dynamicDeviceInfo) {
            dynamicDeviceInfo.getClass();
            DynamicDeviceInfoOuterClass.DynamicDeviceInfo dynamicDeviceInfo2 = this.dynamicDeviceInfo_;
            if (dynamicDeviceInfo2 != null && dynamicDeviceInfo2 != DynamicDeviceInfoOuterClass.DynamicDeviceInfo.getDefaultInstance()) {
                this.dynamicDeviceInfo_ = DynamicDeviceInfoOuterClass.DynamicDeviceInfo.newBuilder(this.dynamicDeviceInfo_).mergeFrom((DynamicDeviceInfoOuterClass.DynamicDeviceInfo.Builder) dynamicDeviceInfo).buildPartial();
            } else {
                this.dynamicDeviceInfo_ = dynamicDeviceInfo;
            }
            this.bitField0_ |= 2;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearDynamicDeviceInfo() {
            this.dynamicDeviceInfo_ = null;
            this.bitField0_ &= -3;
        }

        @Override // gatewayprotocol.v1.LifecycleEventRequestOuterClass.LifecycleEventRequestOrBuilder
        public int getLifecycleEventTypeValue() {
            return this.lifecycleEventType_;
        }

        @Override // gatewayprotocol.v1.LifecycleEventRequestOuterClass.LifecycleEventRequestOrBuilder
        public LifecycleEventType getLifecycleEventType() {
            LifecycleEventType forNumber = LifecycleEventType.forNumber(this.lifecycleEventType_);
            return forNumber == null ? LifecycleEventType.UNRECOGNIZED : forNumber;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setLifecycleEventTypeValue(int i) {
            this.lifecycleEventType_ = i;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setLifecycleEventType(LifecycleEventType lifecycleEventType) {
            this.lifecycleEventType_ = lifecycleEventType.getNumber();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearLifecycleEventType() {
            this.lifecycleEventType_ = 0;
        }

        @Override // gatewayprotocol.v1.LifecycleEventRequestOuterClass.LifecycleEventRequestOrBuilder
        public ByteString getEventId() {
            return this.eventId_;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setEventId(ByteString byteString) {
            byteString.getClass();
            this.eventId_ = byteString;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearEventId() {
            this.eventId_ = getDefaultInstance().getEventId();
        }

        public static LifecycleEventRequest parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
            return (LifecycleEventRequest) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
        }

        public static LifecycleEventRequest parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            return (LifecycleEventRequest) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
        }

        public static LifecycleEventRequest parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
            return (LifecycleEventRequest) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
        }

        public static LifecycleEventRequest parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            return (LifecycleEventRequest) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
        }

        public static LifecycleEventRequest parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
            return (LifecycleEventRequest) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
        }

        public static LifecycleEventRequest parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            return (LifecycleEventRequest) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
        }

        public static LifecycleEventRequest parseFrom(InputStream inputStream) throws IOException {
            return (LifecycleEventRequest) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static LifecycleEventRequest parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            return (LifecycleEventRequest) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
        }

        public static LifecycleEventRequest parseDelimitedFrom(InputStream inputStream) throws IOException {
            return (LifecycleEventRequest) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static LifecycleEventRequest parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            return (LifecycleEventRequest) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
        }

        public static LifecycleEventRequest parseFrom(CodedInputStream codedInputStream) throws IOException {
            return (LifecycleEventRequest) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
        }

        public static LifecycleEventRequest parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            return (LifecycleEventRequest) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
        }

        public static Builder newBuilder() {
            return DEFAULT_INSTANCE.createBuilder();
        }

        public static Builder newBuilder(LifecycleEventRequest lifecycleEventRequest) {
            return DEFAULT_INSTANCE.createBuilder(lifecycleEventRequest);
        }

        public static final class Builder extends GeneratedMessageLite.Builder<LifecycleEventRequest, Builder> implements LifecycleEventRequestOrBuilder {
            /* synthetic */ Builder(AnonymousClass1 anonymousClass1) {
                this();
            }

            private Builder() {
                super(LifecycleEventRequest.DEFAULT_INSTANCE);
            }

            @Override // gatewayprotocol.v1.LifecycleEventRequestOuterClass.LifecycleEventRequestOrBuilder
            public boolean hasStaticDeviceInfo() {
                return ((LifecycleEventRequest) this.instance).hasStaticDeviceInfo();
            }

            @Override // gatewayprotocol.v1.LifecycleEventRequestOuterClass.LifecycleEventRequestOrBuilder
            public StaticDeviceInfoOuterClass.StaticDeviceInfo getStaticDeviceInfo() {
                return ((LifecycleEventRequest) this.instance).getStaticDeviceInfo();
            }

            public Builder setStaticDeviceInfo(StaticDeviceInfoOuterClass.StaticDeviceInfo staticDeviceInfo) {
                copyOnWrite();
                ((LifecycleEventRequest) this.instance).setStaticDeviceInfo(staticDeviceInfo);
                return this;
            }

            public Builder setStaticDeviceInfo(StaticDeviceInfoOuterClass.StaticDeviceInfo.Builder builder) {
                copyOnWrite();
                ((LifecycleEventRequest) this.instance).setStaticDeviceInfo(builder.build());
                return this;
            }

            public Builder mergeStaticDeviceInfo(StaticDeviceInfoOuterClass.StaticDeviceInfo staticDeviceInfo) {
                copyOnWrite();
                ((LifecycleEventRequest) this.instance).mergeStaticDeviceInfo(staticDeviceInfo);
                return this;
            }

            public Builder clearStaticDeviceInfo() {
                copyOnWrite();
                ((LifecycleEventRequest) this.instance).clearStaticDeviceInfo();
                return this;
            }

            @Override // gatewayprotocol.v1.LifecycleEventRequestOuterClass.LifecycleEventRequestOrBuilder
            public boolean hasDynamicDeviceInfo() {
                return ((LifecycleEventRequest) this.instance).hasDynamicDeviceInfo();
            }

            @Override // gatewayprotocol.v1.LifecycleEventRequestOuterClass.LifecycleEventRequestOrBuilder
            public DynamicDeviceInfoOuterClass.DynamicDeviceInfo getDynamicDeviceInfo() {
                return ((LifecycleEventRequest) this.instance).getDynamicDeviceInfo();
            }

            public Builder setDynamicDeviceInfo(DynamicDeviceInfoOuterClass.DynamicDeviceInfo dynamicDeviceInfo) {
                copyOnWrite();
                ((LifecycleEventRequest) this.instance).setDynamicDeviceInfo(dynamicDeviceInfo);
                return this;
            }

            public Builder setDynamicDeviceInfo(DynamicDeviceInfoOuterClass.DynamicDeviceInfo.Builder builder) {
                copyOnWrite();
                ((LifecycleEventRequest) this.instance).setDynamicDeviceInfo(builder.build());
                return this;
            }

            public Builder mergeDynamicDeviceInfo(DynamicDeviceInfoOuterClass.DynamicDeviceInfo dynamicDeviceInfo) {
                copyOnWrite();
                ((LifecycleEventRequest) this.instance).mergeDynamicDeviceInfo(dynamicDeviceInfo);
                return this;
            }

            public Builder clearDynamicDeviceInfo() {
                copyOnWrite();
                ((LifecycleEventRequest) this.instance).clearDynamicDeviceInfo();
                return this;
            }

            @Override // gatewayprotocol.v1.LifecycleEventRequestOuterClass.LifecycleEventRequestOrBuilder
            public int getLifecycleEventTypeValue() {
                return ((LifecycleEventRequest) this.instance).getLifecycleEventTypeValue();
            }

            public Builder setLifecycleEventTypeValue(int i) {
                copyOnWrite();
                ((LifecycleEventRequest) this.instance).setLifecycleEventTypeValue(i);
                return this;
            }

            @Override // gatewayprotocol.v1.LifecycleEventRequestOuterClass.LifecycleEventRequestOrBuilder
            public LifecycleEventType getLifecycleEventType() {
                return ((LifecycleEventRequest) this.instance).getLifecycleEventType();
            }

            public Builder setLifecycleEventType(LifecycleEventType lifecycleEventType) {
                copyOnWrite();
                ((LifecycleEventRequest) this.instance).setLifecycleEventType(lifecycleEventType);
                return this;
            }

            public Builder clearLifecycleEventType() {
                copyOnWrite();
                ((LifecycleEventRequest) this.instance).clearLifecycleEventType();
                return this;
            }

            @Override // gatewayprotocol.v1.LifecycleEventRequestOuterClass.LifecycleEventRequestOrBuilder
            public ByteString getEventId() {
                return ((LifecycleEventRequest) this.instance).getEventId();
            }

            public Builder setEventId(ByteString byteString) {
                copyOnWrite();
                ((LifecycleEventRequest) this.instance).setEventId(byteString);
                return this;
            }

            public Builder clearEventId() {
                copyOnWrite();
                ((LifecycleEventRequest) this.instance).clearEventId();
                return this;
            }
        }

        @Override // com.google.protobuf.GeneratedMessageLite
        protected final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
            AnonymousClass1 anonymousClass1 = null;
            switch (AnonymousClass1.$SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke[methodToInvoke.ordinal()]) {
                case 1:
                    return new LifecycleEventRequest();
                case 2:
                    return new Builder(anonymousClass1);
                case 3:
                    return newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001ဉ\u0000\u0002ဉ\u0001\u0003\f\u0004\n", new Object[]{"bitField0_", "staticDeviceInfo_", "dynamicDeviceInfo_", "lifecycleEventType_", "eventId_"});
                case 4:
                    return DEFAULT_INSTANCE;
                case 5:
                    Parser<LifecycleEventRequest> parser = PARSER;
                    if (parser == null) {
                        synchronized (LifecycleEventRequest.class) {
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
            LifecycleEventRequest lifecycleEventRequest = new LifecycleEventRequest();
            DEFAULT_INSTANCE = lifecycleEventRequest;
            GeneratedMessageLite.registerDefaultInstance(LifecycleEventRequest.class, lifecycleEventRequest);
        }

        public static LifecycleEventRequest getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static Parser<LifecycleEventRequest> parser() {
            return DEFAULT_INSTANCE.getParserForType();
        }
    }

    /* renamed from: gatewayprotocol.v1.LifecycleEventRequestOuterClass$1, reason: invalid class name */
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
