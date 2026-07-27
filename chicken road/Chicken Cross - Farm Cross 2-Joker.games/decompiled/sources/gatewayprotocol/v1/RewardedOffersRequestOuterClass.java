package gatewayprotocol.v1;

import com.google.protobuf.ByteString;
import com.google.protobuf.CodedInputStream;
import com.google.protobuf.ExtensionRegistryLite;
import com.google.protobuf.GeneratedMessageLite;
import com.google.protobuf.Internal;
import com.google.protobuf.InvalidProtocolBufferException;
import com.google.protobuf.MessageLiteOrBuilder;
import com.google.protobuf.Parser;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;

/* loaded from: classes7.dex */
public final class RewardedOffersRequestOuterClass {

    public interface RewardedOffersRequestOrBuilder extends MessageLiteOrBuilder {
        ByteString getCursor();

        RewardedOffersEntryPoint getEntryPoint();

        int getEntryPointValue();
    }

    public static void registerAllExtensions(ExtensionRegistryLite extensionRegistryLite) {
    }

    private RewardedOffersRequestOuterClass() {
    }

    public enum RewardedOffersEntryPoint implements Internal.EnumLite {
        REWARDED_OFFERS_ENTRY_POINT_UNSPECIFIED(0),
        REWARDED_OFFERS_ENTRY_POINT_BRIDGE(1),
        REWARDED_OFFERS_ENTRY_POINT_OFFERWALL(2),
        UNRECOGNIZED(-1);

        public static final int REWARDED_OFFERS_ENTRY_POINT_BRIDGE_VALUE = 1;
        public static final int REWARDED_OFFERS_ENTRY_POINT_OFFERWALL_VALUE = 2;
        public static final int REWARDED_OFFERS_ENTRY_POINT_UNSPECIFIED_VALUE = 0;
        private static final Internal.EnumLiteMap<RewardedOffersEntryPoint> internalValueMap = new Internal.EnumLiteMap<RewardedOffersEntryPoint>() { // from class: gatewayprotocol.v1.RewardedOffersRequestOuterClass.RewardedOffersEntryPoint.1
            @Override // com.google.protobuf.Internal.EnumLiteMap
            public RewardedOffersEntryPoint findValueByNumber(int i) {
                return RewardedOffersEntryPoint.forNumber(i);
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
        public static RewardedOffersEntryPoint valueOf(int i) {
            return forNumber(i);
        }

        public static RewardedOffersEntryPoint forNumber(int i) {
            if (i == 0) {
                return REWARDED_OFFERS_ENTRY_POINT_UNSPECIFIED;
            }
            if (i == 1) {
                return REWARDED_OFFERS_ENTRY_POINT_BRIDGE;
            }
            if (i != 2) {
                return null;
            }
            return REWARDED_OFFERS_ENTRY_POINT_OFFERWALL;
        }

        public static Internal.EnumLiteMap<RewardedOffersEntryPoint> internalGetValueMap() {
            return internalValueMap;
        }

        public static Internal.EnumVerifier internalGetVerifier() {
            return RewardedOffersEntryPointVerifier.INSTANCE;
        }

        private static final class RewardedOffersEntryPointVerifier implements Internal.EnumVerifier {
            static final Internal.EnumVerifier INSTANCE = new RewardedOffersEntryPointVerifier();

            private RewardedOffersEntryPointVerifier() {
            }

            @Override // com.google.protobuf.Internal.EnumVerifier
            public boolean isInRange(int i) {
                return RewardedOffersEntryPoint.forNumber(i) != null;
            }
        }

        RewardedOffersEntryPoint(int i) {
            this.value = i;
        }
    }

    public static final class RewardedOffersRequest extends GeneratedMessageLite<RewardedOffersRequest, Builder> implements RewardedOffersRequestOrBuilder {
        public static final int CURSOR_FIELD_NUMBER = 2;
        private static final RewardedOffersRequest DEFAULT_INSTANCE;
        public static final int ENTRY_POINT_FIELD_NUMBER = 1;
        private static volatile Parser<RewardedOffersRequest> PARSER;
        private ByteString cursor_ = ByteString.EMPTY;
        private int entryPoint_;

        private RewardedOffersRequest() {
        }

        @Override // gatewayprotocol.v1.RewardedOffersRequestOuterClass.RewardedOffersRequestOrBuilder
        public int getEntryPointValue() {
            return this.entryPoint_;
        }

        @Override // gatewayprotocol.v1.RewardedOffersRequestOuterClass.RewardedOffersRequestOrBuilder
        public RewardedOffersEntryPoint getEntryPoint() {
            RewardedOffersEntryPoint forNumber = RewardedOffersEntryPoint.forNumber(this.entryPoint_);
            return forNumber == null ? RewardedOffersEntryPoint.UNRECOGNIZED : forNumber;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setEntryPointValue(int i) {
            this.entryPoint_ = i;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setEntryPoint(RewardedOffersEntryPoint rewardedOffersEntryPoint) {
            this.entryPoint_ = rewardedOffersEntryPoint.getNumber();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearEntryPoint() {
            this.entryPoint_ = 0;
        }

        @Override // gatewayprotocol.v1.RewardedOffersRequestOuterClass.RewardedOffersRequestOrBuilder
        public ByteString getCursor() {
            return this.cursor_;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setCursor(ByteString byteString) {
            byteString.getClass();
            this.cursor_ = byteString;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearCursor() {
            this.cursor_ = getDefaultInstance().getCursor();
        }

        public static RewardedOffersRequest parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
            return (RewardedOffersRequest) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
        }

        public static RewardedOffersRequest parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            return (RewardedOffersRequest) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
        }

        public static RewardedOffersRequest parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
            return (RewardedOffersRequest) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
        }

        public static RewardedOffersRequest parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            return (RewardedOffersRequest) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
        }

        public static RewardedOffersRequest parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
            return (RewardedOffersRequest) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
        }

        public static RewardedOffersRequest parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            return (RewardedOffersRequest) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
        }

        public static RewardedOffersRequest parseFrom(InputStream inputStream) throws IOException {
            return (RewardedOffersRequest) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static RewardedOffersRequest parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            return (RewardedOffersRequest) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
        }

        public static RewardedOffersRequest parseDelimitedFrom(InputStream inputStream) throws IOException {
            return (RewardedOffersRequest) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static RewardedOffersRequest parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            return (RewardedOffersRequest) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
        }

        public static RewardedOffersRequest parseFrom(CodedInputStream codedInputStream) throws IOException {
            return (RewardedOffersRequest) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
        }

        public static RewardedOffersRequest parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            return (RewardedOffersRequest) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
        }

        public static Builder newBuilder() {
            return DEFAULT_INSTANCE.createBuilder();
        }

        public static Builder newBuilder(RewardedOffersRequest rewardedOffersRequest) {
            return DEFAULT_INSTANCE.createBuilder(rewardedOffersRequest);
        }

        public static final class Builder extends GeneratedMessageLite.Builder<RewardedOffersRequest, Builder> implements RewardedOffersRequestOrBuilder {
            /* synthetic */ Builder(AnonymousClass1 anonymousClass1) {
                this();
            }

            private Builder() {
                super(RewardedOffersRequest.DEFAULT_INSTANCE);
            }

            @Override // gatewayprotocol.v1.RewardedOffersRequestOuterClass.RewardedOffersRequestOrBuilder
            public int getEntryPointValue() {
                return ((RewardedOffersRequest) this.instance).getEntryPointValue();
            }

            public Builder setEntryPointValue(int i) {
                copyOnWrite();
                ((RewardedOffersRequest) this.instance).setEntryPointValue(i);
                return this;
            }

            @Override // gatewayprotocol.v1.RewardedOffersRequestOuterClass.RewardedOffersRequestOrBuilder
            public RewardedOffersEntryPoint getEntryPoint() {
                return ((RewardedOffersRequest) this.instance).getEntryPoint();
            }

            public Builder setEntryPoint(RewardedOffersEntryPoint rewardedOffersEntryPoint) {
                copyOnWrite();
                ((RewardedOffersRequest) this.instance).setEntryPoint(rewardedOffersEntryPoint);
                return this;
            }

            public Builder clearEntryPoint() {
                copyOnWrite();
                ((RewardedOffersRequest) this.instance).clearEntryPoint();
                return this;
            }

            @Override // gatewayprotocol.v1.RewardedOffersRequestOuterClass.RewardedOffersRequestOrBuilder
            public ByteString getCursor() {
                return ((RewardedOffersRequest) this.instance).getCursor();
            }

            public Builder setCursor(ByteString byteString) {
                copyOnWrite();
                ((RewardedOffersRequest) this.instance).setCursor(byteString);
                return this;
            }

            public Builder clearCursor() {
                copyOnWrite();
                ((RewardedOffersRequest) this.instance).clearCursor();
                return this;
            }
        }

        @Override // com.google.protobuf.GeneratedMessageLite
        protected final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
            AnonymousClass1 anonymousClass1 = null;
            switch (AnonymousClass1.$SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke[methodToInvoke.ordinal()]) {
                case 1:
                    return new RewardedOffersRequest();
                case 2:
                    return new Builder(anonymousClass1);
                case 3:
                    return newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001\f\u0002\n", new Object[]{"entryPoint_", "cursor_"});
                case 4:
                    return DEFAULT_INSTANCE;
                case 5:
                    Parser<RewardedOffersRequest> parser = PARSER;
                    if (parser == null) {
                        synchronized (RewardedOffersRequest.class) {
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
            RewardedOffersRequest rewardedOffersRequest = new RewardedOffersRequest();
            DEFAULT_INSTANCE = rewardedOffersRequest;
            GeneratedMessageLite.registerDefaultInstance(RewardedOffersRequest.class, rewardedOffersRequest);
        }

        public static RewardedOffersRequest getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static Parser<RewardedOffersRequest> parser() {
            return DEFAULT_INSTANCE.getParserForType();
        }
    }

    /* renamed from: gatewayprotocol.v1.RewardedOffersRequestOuterClass$1, reason: invalid class name */
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
