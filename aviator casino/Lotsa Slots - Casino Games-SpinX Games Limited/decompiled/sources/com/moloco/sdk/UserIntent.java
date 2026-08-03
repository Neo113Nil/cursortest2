package com.moloco.sdk;

/* loaded from: classes5.dex */
public final class UserIntent {

    public interface UserAdInteractionExtOrBuilder extends com.google.protobuf.MessageLiteOrBuilder {
        java.lang.String getAdvertisingId();

        com.google.protobuf.ByteString getAdvertisingIdBytes();

        com.moloco.sdk.UserIntent.UserAdInteractionExt.App getApp();

        com.moloco.sdk.UserIntent.UserAdInteractionExt.AppBackgroundingInteraction getAppBackgroundingInteraction();

        com.moloco.sdk.UserIntent.UserAdInteractionExt.AppForegroundingInteraction getAppForegroundingInteraction();

        com.moloco.sdk.UserIntent.UserAdInteractionExt.ClickInteraction getClickInteraction();

        long getClientTimestamp();

        com.moloco.sdk.UserIntent.UserAdInteractionExt.Device getDevice();

        com.moloco.sdk.UserIntent.UserAdInteractionExt.ImpressionInteraction getImpInteraction();

        com.moloco.sdk.UserIntent.UserAdInteractionExt.InfoExtCase getInfoExtCase();

        java.lang.String getMref();

        com.google.protobuf.ByteString getMrefBytes();

        com.moloco.sdk.UserIntent.UserAdInteractionExt.Network getNetwork();

        com.moloco.sdk.UserIntent.UserAdInteractionExt.MolocoSDK getSdk();

        boolean hasApp();

        boolean hasAppBackgroundingInteraction();

        boolean hasAppForegroundingInteraction();

        boolean hasClickInteraction();

        boolean hasDevice();

        boolean hasImpInteraction();

        boolean hasNetwork();

        boolean hasSdk();
    }

    public static void registerAllExtensions(com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) {
    }

    private UserIntent() {
    }

    public static final class UserAdInteractionExt extends com.google.protobuf.GeneratedMessageLite<com.moloco.sdk.UserIntent.UserAdInteractionExt, com.moloco.sdk.UserIntent.UserAdInteractionExt.Builder> implements com.moloco.sdk.UserIntent.UserAdInteractionExtOrBuilder {
        public static final int ADVERTISING_ID_FIELD_NUMBER = 3;
        public static final int APP_BACKGROUNDING_INTERACTION_FIELD_NUMBER = 103;
        public static final int APP_FIELD_NUMBER = 5;
        public static final int APP_FOREGROUNDING_INTERACTION_FIELD_NUMBER = 102;
        public static final int CLICK_INTERACTION_FIELD_NUMBER = 101;
        public static final int CLIENT_TIMESTAMP_FIELD_NUMBER = 2;
        private static final com.moloco.sdk.UserIntent.UserAdInteractionExt DEFAULT_INSTANCE;
        public static final int DEVICE_FIELD_NUMBER = 4;
        public static final int IMP_INTERACTION_FIELD_NUMBER = 100;
        public static final int MREF_FIELD_NUMBER = 1;
        public static final int NETWORK_FIELD_NUMBER = 6;
        private static volatile com.google.protobuf.Parser<com.moloco.sdk.UserIntent.UserAdInteractionExt> PARSER = null;
        public static final int SDK_FIELD_NUMBER = 7;
        private com.moloco.sdk.UserIntent.UserAdInteractionExt.App app_;
        private long clientTimestamp_;
        private com.moloco.sdk.UserIntent.UserAdInteractionExt.Device device_;
        private java.lang.Object infoExt_;
        private com.moloco.sdk.UserIntent.UserAdInteractionExt.Network network_;
        private com.moloco.sdk.UserIntent.UserAdInteractionExt.MolocoSDK sdk_;
        private int infoExtCase_ = 0;
        private java.lang.String mref_ = "";
        private java.lang.String advertisingId_ = "";

        public interface AppBackgroundingInteractionOrBuilder extends com.google.protobuf.MessageLiteOrBuilder {
        }

        public interface AppForegroundingInteractionOrBuilder extends com.google.protobuf.MessageLiteOrBuilder {
            long getBgTsMs();
        }

        public interface AppOrBuilder extends com.google.protobuf.MessageLiteOrBuilder {
            java.lang.String getId();

            com.google.protobuf.ByteString getIdBytes();

            java.lang.String getVer();

            com.google.protobuf.ByteString getVerBytes();
        }

        public interface ButtonOrBuilder extends com.google.protobuf.MessageLiteOrBuilder {
            com.moloco.sdk.UserIntent.UserAdInteractionExt.Position getPos();

            com.moloco.sdk.UserIntent.UserAdInteractionExt.Size getSize();

            com.moloco.sdk.UserIntent.UserAdInteractionExt.Button.Type getType();

            int getTypeValue();

            boolean hasPos();

            boolean hasSize();
        }

        public interface ClickInteractionOrBuilder extends com.google.protobuf.MessageLiteOrBuilder {
            com.moloco.sdk.UserIntent.UserAdInteractionExt.Button getButtons(int i);

            int getButtonsCount();

            java.util.List<com.moloco.sdk.UserIntent.UserAdInteractionExt.Button> getButtonsList();

            com.moloco.sdk.UserIntent.UserAdInteractionExt.Position getClickPos();

            com.moloco.sdk.UserIntent.UserAdInteractionExt.Size getScreenSize();

            com.moloco.sdk.UserIntent.UserAdInteractionExt.Position getViewPos();

            com.moloco.sdk.UserIntent.UserAdInteractionExt.Size getViewSize();

            boolean hasClickPos();

            boolean hasScreenSize();

            boolean hasViewPos();

            boolean hasViewSize();
        }

        public interface DeviceOrBuilder extends com.google.protobuf.MessageLiteOrBuilder {
            java.lang.String getModel();

            com.google.protobuf.ByteString getModelBytes();

            com.moloco.sdk.UserIntent.UserAdInteractionExt.Device.OsType getOs();

            int getOsValue();

            java.lang.String getOsVer();

            com.google.protobuf.ByteString getOsVerBytes();

            float getScreenScale();
        }

        public interface ImpressionInteractionOrBuilder extends com.google.protobuf.MessageLiteOrBuilder {
        }

        public interface MolocoSDKOrBuilder extends com.google.protobuf.MessageLiteOrBuilder {
            java.lang.String getAdapterVer();

            com.google.protobuf.ByteString getAdapterVerBytes();

            java.lang.String getCoreVer();

            com.google.protobuf.ByteString getCoreVerBytes();
        }

        public interface NetworkOrBuilder extends com.google.protobuf.MessageLiteOrBuilder {
            java.lang.String getCarrier();

            com.google.protobuf.ByteString getCarrierBytes();

            com.moloco.sdk.UserIntent.UserAdInteractionExt.Network.ConnectionType getConnectionType();

            int getConnectionTypeValue();
        }

        public interface PositionOrBuilder extends com.google.protobuf.MessageLiteOrBuilder {
            float getX();

            float getY();
        }

        public interface SizeOrBuilder extends com.google.protobuf.MessageLiteOrBuilder {
            float getH();

            float getW();
        }

        private UserAdInteractionExt() {
        }

        public static final class Device extends com.google.protobuf.GeneratedMessageLite<com.moloco.sdk.UserIntent.UserAdInteractionExt.Device, com.moloco.sdk.UserIntent.UserAdInteractionExt.Device.Builder> implements com.moloco.sdk.UserIntent.UserAdInteractionExt.DeviceOrBuilder {
            private static final com.moloco.sdk.UserIntent.UserAdInteractionExt.Device DEFAULT_INSTANCE;
            public static final int MODEL_FIELD_NUMBER = 3;
            public static final int OS_FIELD_NUMBER = 1;
            public static final int OS_VER_FIELD_NUMBER = 2;
            private static volatile com.google.protobuf.Parser<com.moloco.sdk.UserIntent.UserAdInteractionExt.Device> PARSER = null;
            public static final int SCREEN_SCALE_FIELD_NUMBER = 4;
            private int os_;
            private float screenScale_;
            private java.lang.String osVer_ = "";
            private java.lang.String model_ = "";

            private Device() {
            }

            public enum OsType implements com.google.protobuf.Internal.EnumLite {
                UNKNOWN(0),
                ANDROID(1),
                IOS(2),
                UNRECOGNIZED(-1);

                public static final int ANDROID_VALUE = 1;
                public static final int IOS_VALUE = 2;
                public static final int UNKNOWN_VALUE = 0;
                private static final com.google.protobuf.Internal.EnumLiteMap<com.moloco.sdk.UserIntent.UserAdInteractionExt.Device.OsType> internalValueMap = new com.google.protobuf.Internal.EnumLiteMap<com.moloco.sdk.UserIntent.UserAdInteractionExt.Device.OsType>() { // from class: com.moloco.sdk.UserIntent.UserAdInteractionExt.Device.OsType.1
                    @Override // com.google.protobuf.Internal.EnumLiteMap
                    public com.moloco.sdk.UserIntent.UserAdInteractionExt.Device.OsType findValueByNumber(int i) {
                        return com.moloco.sdk.UserIntent.UserAdInteractionExt.Device.OsType.forNumber(i);
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
                public static com.moloco.sdk.UserIntent.UserAdInteractionExt.Device.OsType valueOf(int i) {
                    return forNumber(i);
                }

                public static com.moloco.sdk.UserIntent.UserAdInteractionExt.Device.OsType forNumber(int i) {
                    if (i == 0) {
                        return UNKNOWN;
                    }
                    if (i == 1) {
                        return ANDROID;
                    }
                    if (i != 2) {
                        return null;
                    }
                    return IOS;
                }

                public static com.google.protobuf.Internal.EnumLiteMap<com.moloco.sdk.UserIntent.UserAdInteractionExt.Device.OsType> internalGetValueMap() {
                    return internalValueMap;
                }

                public static com.google.protobuf.Internal.EnumVerifier internalGetVerifier() {
                    return com.moloco.sdk.UserIntent.UserAdInteractionExt.Device.OsType.OsTypeVerifier.INSTANCE;
                }

                private static final class OsTypeVerifier implements com.google.protobuf.Internal.EnumVerifier {
                    static final com.google.protobuf.Internal.EnumVerifier INSTANCE = new com.moloco.sdk.UserIntent.UserAdInteractionExt.Device.OsType.OsTypeVerifier();

                    private OsTypeVerifier() {
                    }

                    @Override // com.google.protobuf.Internal.EnumVerifier
                    public boolean isInRange(int i) {
                        return com.moloco.sdk.UserIntent.UserAdInteractionExt.Device.OsType.forNumber(i) != null;
                    }
                }

                OsType(int i) {
                    this.value = i;
                }
            }

            @Override // com.moloco.sdk.UserIntent.UserAdInteractionExt.DeviceOrBuilder
            public int getOsValue() {
                return this.os_;
            }

            @Override // com.moloco.sdk.UserIntent.UserAdInteractionExt.DeviceOrBuilder
            public com.moloco.sdk.UserIntent.UserAdInteractionExt.Device.OsType getOs() {
                com.moloco.sdk.UserIntent.UserAdInteractionExt.Device.OsType forNumber = com.moloco.sdk.UserIntent.UserAdInteractionExt.Device.OsType.forNumber(this.os_);
                return forNumber == null ? com.moloco.sdk.UserIntent.UserAdInteractionExt.Device.OsType.UNRECOGNIZED : forNumber;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public void setOsValue(int i) {
                this.os_ = i;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public void setOs(com.moloco.sdk.UserIntent.UserAdInteractionExt.Device.OsType osType) {
                this.os_ = osType.getNumber();
            }

            /* JADX INFO: Access modifiers changed from: private */
            public void clearOs() {
                this.os_ = 0;
            }

            @Override // com.moloco.sdk.UserIntent.UserAdInteractionExt.DeviceOrBuilder
            public java.lang.String getOsVer() {
                return this.osVer_;
            }

            @Override // com.moloco.sdk.UserIntent.UserAdInteractionExt.DeviceOrBuilder
            public com.google.protobuf.ByteString getOsVerBytes() {
                return com.google.protobuf.ByteString.copyFromUtf8(this.osVer_);
            }

            /* JADX INFO: Access modifiers changed from: private */
            public void setOsVer(java.lang.String str) {
                str.getClass();
                this.osVer_ = str;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public void clearOsVer() {
                this.osVer_ = getDefaultInstance().getOsVer();
            }

            /* JADX INFO: Access modifiers changed from: private */
            public void setOsVerBytes(com.google.protobuf.ByteString byteString) {
                checkByteStringIsUtf8(byteString);
                this.osVer_ = byteString.toStringUtf8();
            }

            @Override // com.moloco.sdk.UserIntent.UserAdInteractionExt.DeviceOrBuilder
            public java.lang.String getModel() {
                return this.model_;
            }

            @Override // com.moloco.sdk.UserIntent.UserAdInteractionExt.DeviceOrBuilder
            public com.google.protobuf.ByteString getModelBytes() {
                return com.google.protobuf.ByteString.copyFromUtf8(this.model_);
            }

            /* JADX INFO: Access modifiers changed from: private */
            public void setModel(java.lang.String str) {
                str.getClass();
                this.model_ = str;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public void clearModel() {
                this.model_ = getDefaultInstance().getModel();
            }

            /* JADX INFO: Access modifiers changed from: private */
            public void setModelBytes(com.google.protobuf.ByteString byteString) {
                checkByteStringIsUtf8(byteString);
                this.model_ = byteString.toStringUtf8();
            }

            @Override // com.moloco.sdk.UserIntent.UserAdInteractionExt.DeviceOrBuilder
            public float getScreenScale() {
                return this.screenScale_;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public void setScreenScale(float f) {
                this.screenScale_ = f;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public void clearScreenScale() {
                this.screenScale_ = 0.0f;
            }

            public static com.moloco.sdk.UserIntent.UserAdInteractionExt.Device parseFrom(java.nio.ByteBuffer byteBuffer) throws com.google.protobuf.InvalidProtocolBufferException {
                return (com.moloco.sdk.UserIntent.UserAdInteractionExt.Device) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
            }

            public static com.moloco.sdk.UserIntent.UserAdInteractionExt.Device parseFrom(java.nio.ByteBuffer byteBuffer, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) throws com.google.protobuf.InvalidProtocolBufferException {
                return (com.moloco.sdk.UserIntent.UserAdInteractionExt.Device) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
            }

            public static com.moloco.sdk.UserIntent.UserAdInteractionExt.Device parseFrom(com.google.protobuf.ByteString byteString) throws com.google.protobuf.InvalidProtocolBufferException {
                return (com.moloco.sdk.UserIntent.UserAdInteractionExt.Device) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
            }

            public static com.moloco.sdk.UserIntent.UserAdInteractionExt.Device parseFrom(com.google.protobuf.ByteString byteString, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) throws com.google.protobuf.InvalidProtocolBufferException {
                return (com.moloco.sdk.UserIntent.UserAdInteractionExt.Device) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
            }

            public static com.moloco.sdk.UserIntent.UserAdInteractionExt.Device parseFrom(byte[] bArr) throws com.google.protobuf.InvalidProtocolBufferException {
                return (com.moloco.sdk.UserIntent.UserAdInteractionExt.Device) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
            }

            public static com.moloco.sdk.UserIntent.UserAdInteractionExt.Device parseFrom(byte[] bArr, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) throws com.google.protobuf.InvalidProtocolBufferException {
                return (com.moloco.sdk.UserIntent.UserAdInteractionExt.Device) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
            }

            public static com.moloco.sdk.UserIntent.UserAdInteractionExt.Device parseFrom(java.io.InputStream inputStream) throws java.io.IOException {
                return (com.moloco.sdk.UserIntent.UserAdInteractionExt.Device) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
            }

            public static com.moloco.sdk.UserIntent.UserAdInteractionExt.Device parseFrom(java.io.InputStream inputStream, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) throws java.io.IOException {
                return (com.moloco.sdk.UserIntent.UserAdInteractionExt.Device) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
            }

            public static com.moloco.sdk.UserIntent.UserAdInteractionExt.Device parseDelimitedFrom(java.io.InputStream inputStream) throws java.io.IOException {
                return (com.moloco.sdk.UserIntent.UserAdInteractionExt.Device) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
            }

            public static com.moloco.sdk.UserIntent.UserAdInteractionExt.Device parseDelimitedFrom(java.io.InputStream inputStream, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) throws java.io.IOException {
                return (com.moloco.sdk.UserIntent.UserAdInteractionExt.Device) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
            }

            public static com.moloco.sdk.UserIntent.UserAdInteractionExt.Device parseFrom(com.google.protobuf.CodedInputStream codedInputStream) throws java.io.IOException {
                return (com.moloco.sdk.UserIntent.UserAdInteractionExt.Device) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
            }

            public static com.moloco.sdk.UserIntent.UserAdInteractionExt.Device parseFrom(com.google.protobuf.CodedInputStream codedInputStream, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) throws java.io.IOException {
                return (com.moloco.sdk.UserIntent.UserAdInteractionExt.Device) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
            }

            public static com.moloco.sdk.UserIntent.UserAdInteractionExt.Device.Builder newBuilder() {
                return DEFAULT_INSTANCE.createBuilder();
            }

            public static com.moloco.sdk.UserIntent.UserAdInteractionExt.Device.Builder newBuilder(com.moloco.sdk.UserIntent.UserAdInteractionExt.Device device) {
                return DEFAULT_INSTANCE.createBuilder(device);
            }

            public static final class Builder extends com.google.protobuf.GeneratedMessageLite.Builder<com.moloco.sdk.UserIntent.UserAdInteractionExt.Device, com.moloco.sdk.UserIntent.UserAdInteractionExt.Device.Builder> implements com.moloco.sdk.UserIntent.UserAdInteractionExt.DeviceOrBuilder {
                private Builder() {
                    super(com.moloco.sdk.UserIntent.UserAdInteractionExt.Device.DEFAULT_INSTANCE);
                }

                @Override // com.moloco.sdk.UserIntent.UserAdInteractionExt.DeviceOrBuilder
                public int getOsValue() {
                    return ((com.moloco.sdk.UserIntent.UserAdInteractionExt.Device) this.instance).getOsValue();
                }

                public com.moloco.sdk.UserIntent.UserAdInteractionExt.Device.Builder setOsValue(int i) {
                    copyOnWrite();
                    ((com.moloco.sdk.UserIntent.UserAdInteractionExt.Device) this.instance).setOsValue(i);
                    return this;
                }

                @Override // com.moloco.sdk.UserIntent.UserAdInteractionExt.DeviceOrBuilder
                public com.moloco.sdk.UserIntent.UserAdInteractionExt.Device.OsType getOs() {
                    return ((com.moloco.sdk.UserIntent.UserAdInteractionExt.Device) this.instance).getOs();
                }

                public com.moloco.sdk.UserIntent.UserAdInteractionExt.Device.Builder setOs(com.moloco.sdk.UserIntent.UserAdInteractionExt.Device.OsType osType) {
                    copyOnWrite();
                    ((com.moloco.sdk.UserIntent.UserAdInteractionExt.Device) this.instance).setOs(osType);
                    return this;
                }

                public com.moloco.sdk.UserIntent.UserAdInteractionExt.Device.Builder clearOs() {
                    copyOnWrite();
                    ((com.moloco.sdk.UserIntent.UserAdInteractionExt.Device) this.instance).clearOs();
                    return this;
                }

                @Override // com.moloco.sdk.UserIntent.UserAdInteractionExt.DeviceOrBuilder
                public java.lang.String getOsVer() {
                    return ((com.moloco.sdk.UserIntent.UserAdInteractionExt.Device) this.instance).getOsVer();
                }

                @Override // com.moloco.sdk.UserIntent.UserAdInteractionExt.DeviceOrBuilder
                public com.google.protobuf.ByteString getOsVerBytes() {
                    return ((com.moloco.sdk.UserIntent.UserAdInteractionExt.Device) this.instance).getOsVerBytes();
                }

                public com.moloco.sdk.UserIntent.UserAdInteractionExt.Device.Builder setOsVer(java.lang.String str) {
                    copyOnWrite();
                    ((com.moloco.sdk.UserIntent.UserAdInteractionExt.Device) this.instance).setOsVer(str);
                    return this;
                }

                public com.moloco.sdk.UserIntent.UserAdInteractionExt.Device.Builder clearOsVer() {
                    copyOnWrite();
                    ((com.moloco.sdk.UserIntent.UserAdInteractionExt.Device) this.instance).clearOsVer();
                    return this;
                }

                public com.moloco.sdk.UserIntent.UserAdInteractionExt.Device.Builder setOsVerBytes(com.google.protobuf.ByteString byteString) {
                    copyOnWrite();
                    ((com.moloco.sdk.UserIntent.UserAdInteractionExt.Device) this.instance).setOsVerBytes(byteString);
                    return this;
                }

                @Override // com.moloco.sdk.UserIntent.UserAdInteractionExt.DeviceOrBuilder
                public java.lang.String getModel() {
                    return ((com.moloco.sdk.UserIntent.UserAdInteractionExt.Device) this.instance).getModel();
                }

                @Override // com.moloco.sdk.UserIntent.UserAdInteractionExt.DeviceOrBuilder
                public com.google.protobuf.ByteString getModelBytes() {
                    return ((com.moloco.sdk.UserIntent.UserAdInteractionExt.Device) this.instance).getModelBytes();
                }

                public com.moloco.sdk.UserIntent.UserAdInteractionExt.Device.Builder setModel(java.lang.String str) {
                    copyOnWrite();
                    ((com.moloco.sdk.UserIntent.UserAdInteractionExt.Device) this.instance).setModel(str);
                    return this;
                }

                public com.moloco.sdk.UserIntent.UserAdInteractionExt.Device.Builder clearModel() {
                    copyOnWrite();
                    ((com.moloco.sdk.UserIntent.UserAdInteractionExt.Device) this.instance).clearModel();
                    return this;
                }

                public com.moloco.sdk.UserIntent.UserAdInteractionExt.Device.Builder setModelBytes(com.google.protobuf.ByteString byteString) {
                    copyOnWrite();
                    ((com.moloco.sdk.UserIntent.UserAdInteractionExt.Device) this.instance).setModelBytes(byteString);
                    return this;
                }

                @Override // com.moloco.sdk.UserIntent.UserAdInteractionExt.DeviceOrBuilder
                public float getScreenScale() {
                    return ((com.moloco.sdk.UserIntent.UserAdInteractionExt.Device) this.instance).getScreenScale();
                }

                public com.moloco.sdk.UserIntent.UserAdInteractionExt.Device.Builder setScreenScale(float f) {
                    copyOnWrite();
                    ((com.moloco.sdk.UserIntent.UserAdInteractionExt.Device) this.instance).setScreenScale(f);
                    return this;
                }

                public com.moloco.sdk.UserIntent.UserAdInteractionExt.Device.Builder clearScreenScale() {
                    copyOnWrite();
                    ((com.moloco.sdk.UserIntent.UserAdInteractionExt.Device) this.instance).clearScreenScale();
                    return this;
                }
            }

            @Override // com.google.protobuf.GeneratedMessageLite
            protected final java.lang.Object dynamicMethod(com.google.protobuf.GeneratedMessageLite.MethodToInvoke methodToInvoke, java.lang.Object obj, java.lang.Object obj2) {
                switch (com.moloco.sdk.UserIntent.AnonymousClass1.$SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke[methodToInvoke.ordinal()]) {
                    case 1:
                        return new com.moloco.sdk.UserIntent.UserAdInteractionExt.Device();
                    case 2:
                        return new com.moloco.sdk.UserIntent.UserAdInteractionExt.Device.Builder();
                    case 3:
                        return newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0004\u0000\u0000\u0001\u0004\u0004\u0000\u0000\u0000\u0001\f\u0002Ȉ\u0003Ȉ\u0004\u0001", new java.lang.Object[]{"os_", "osVer_", "model_", "screenScale_"});
                    case 4:
                        return DEFAULT_INSTANCE;
                    case 5:
                        com.google.protobuf.Parser<com.moloco.sdk.UserIntent.UserAdInteractionExt.Device> parser = PARSER;
                        if (parser == null) {
                            synchronized (com.moloco.sdk.UserIntent.UserAdInteractionExt.Device.class) {
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
                com.moloco.sdk.UserIntent.UserAdInteractionExt.Device device = new com.moloco.sdk.UserIntent.UserAdInteractionExt.Device();
                DEFAULT_INSTANCE = device;
                com.google.protobuf.GeneratedMessageLite.registerDefaultInstance(com.moloco.sdk.UserIntent.UserAdInteractionExt.Device.class, device);
            }

            public static com.moloco.sdk.UserIntent.UserAdInteractionExt.Device getDefaultInstance() {
                return DEFAULT_INSTANCE;
            }

            public static com.google.protobuf.Parser<com.moloco.sdk.UserIntent.UserAdInteractionExt.Device> parser() {
                return DEFAULT_INSTANCE.getParserForType();
            }
        }

        public static final class App extends com.google.protobuf.GeneratedMessageLite<com.moloco.sdk.UserIntent.UserAdInteractionExt.App, com.moloco.sdk.UserIntent.UserAdInteractionExt.App.Builder> implements com.moloco.sdk.UserIntent.UserAdInteractionExt.AppOrBuilder {
            private static final com.moloco.sdk.UserIntent.UserAdInteractionExt.App DEFAULT_INSTANCE;
            public static final int ID_FIELD_NUMBER = 1;
            private static volatile com.google.protobuf.Parser<com.moloco.sdk.UserIntent.UserAdInteractionExt.App> PARSER = null;
            public static final int VER_FIELD_NUMBER = 2;
            private java.lang.String id_ = "";
            private java.lang.String ver_ = "";

            private App() {
            }

            @Override // com.moloco.sdk.UserIntent.UserAdInteractionExt.AppOrBuilder
            public java.lang.String getId() {
                return this.id_;
            }

            @Override // com.moloco.sdk.UserIntent.UserAdInteractionExt.AppOrBuilder
            public com.google.protobuf.ByteString getIdBytes() {
                return com.google.protobuf.ByteString.copyFromUtf8(this.id_);
            }

            /* JADX INFO: Access modifiers changed from: private */
            public void setId(java.lang.String str) {
                str.getClass();
                this.id_ = str;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public void clearId() {
                this.id_ = getDefaultInstance().getId();
            }

            /* JADX INFO: Access modifiers changed from: private */
            public void setIdBytes(com.google.protobuf.ByteString byteString) {
                checkByteStringIsUtf8(byteString);
                this.id_ = byteString.toStringUtf8();
            }

            @Override // com.moloco.sdk.UserIntent.UserAdInteractionExt.AppOrBuilder
            public java.lang.String getVer() {
                return this.ver_;
            }

            @Override // com.moloco.sdk.UserIntent.UserAdInteractionExt.AppOrBuilder
            public com.google.protobuf.ByteString getVerBytes() {
                return com.google.protobuf.ByteString.copyFromUtf8(this.ver_);
            }

            /* JADX INFO: Access modifiers changed from: private */
            public void setVer(java.lang.String str) {
                str.getClass();
                this.ver_ = str;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public void clearVer() {
                this.ver_ = getDefaultInstance().getVer();
            }

            /* JADX INFO: Access modifiers changed from: private */
            public void setVerBytes(com.google.protobuf.ByteString byteString) {
                checkByteStringIsUtf8(byteString);
                this.ver_ = byteString.toStringUtf8();
            }

            public static com.moloco.sdk.UserIntent.UserAdInteractionExt.App parseFrom(java.nio.ByteBuffer byteBuffer) throws com.google.protobuf.InvalidProtocolBufferException {
                return (com.moloco.sdk.UserIntent.UserAdInteractionExt.App) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
            }

            public static com.moloco.sdk.UserIntent.UserAdInteractionExt.App parseFrom(java.nio.ByteBuffer byteBuffer, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) throws com.google.protobuf.InvalidProtocolBufferException {
                return (com.moloco.sdk.UserIntent.UserAdInteractionExt.App) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
            }

            public static com.moloco.sdk.UserIntent.UserAdInteractionExt.App parseFrom(com.google.protobuf.ByteString byteString) throws com.google.protobuf.InvalidProtocolBufferException {
                return (com.moloco.sdk.UserIntent.UserAdInteractionExt.App) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
            }

            public static com.moloco.sdk.UserIntent.UserAdInteractionExt.App parseFrom(com.google.protobuf.ByteString byteString, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) throws com.google.protobuf.InvalidProtocolBufferException {
                return (com.moloco.sdk.UserIntent.UserAdInteractionExt.App) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
            }

            public static com.moloco.sdk.UserIntent.UserAdInteractionExt.App parseFrom(byte[] bArr) throws com.google.protobuf.InvalidProtocolBufferException {
                return (com.moloco.sdk.UserIntent.UserAdInteractionExt.App) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
            }

            public static com.moloco.sdk.UserIntent.UserAdInteractionExt.App parseFrom(byte[] bArr, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) throws com.google.protobuf.InvalidProtocolBufferException {
                return (com.moloco.sdk.UserIntent.UserAdInteractionExt.App) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
            }

            public static com.moloco.sdk.UserIntent.UserAdInteractionExt.App parseFrom(java.io.InputStream inputStream) throws java.io.IOException {
                return (com.moloco.sdk.UserIntent.UserAdInteractionExt.App) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
            }

            public static com.moloco.sdk.UserIntent.UserAdInteractionExt.App parseFrom(java.io.InputStream inputStream, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) throws java.io.IOException {
                return (com.moloco.sdk.UserIntent.UserAdInteractionExt.App) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
            }

            public static com.moloco.sdk.UserIntent.UserAdInteractionExt.App parseDelimitedFrom(java.io.InputStream inputStream) throws java.io.IOException {
                return (com.moloco.sdk.UserIntent.UserAdInteractionExt.App) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
            }

            public static com.moloco.sdk.UserIntent.UserAdInteractionExt.App parseDelimitedFrom(java.io.InputStream inputStream, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) throws java.io.IOException {
                return (com.moloco.sdk.UserIntent.UserAdInteractionExt.App) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
            }

            public static com.moloco.sdk.UserIntent.UserAdInteractionExt.App parseFrom(com.google.protobuf.CodedInputStream codedInputStream) throws java.io.IOException {
                return (com.moloco.sdk.UserIntent.UserAdInteractionExt.App) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
            }

            public static com.moloco.sdk.UserIntent.UserAdInteractionExt.App parseFrom(com.google.protobuf.CodedInputStream codedInputStream, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) throws java.io.IOException {
                return (com.moloco.sdk.UserIntent.UserAdInteractionExt.App) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
            }

            public static com.moloco.sdk.UserIntent.UserAdInteractionExt.App.Builder newBuilder() {
                return DEFAULT_INSTANCE.createBuilder();
            }

            public static com.moloco.sdk.UserIntent.UserAdInteractionExt.App.Builder newBuilder(com.moloco.sdk.UserIntent.UserAdInteractionExt.App app) {
                return DEFAULT_INSTANCE.createBuilder(app);
            }

            public static final class Builder extends com.google.protobuf.GeneratedMessageLite.Builder<com.moloco.sdk.UserIntent.UserAdInteractionExt.App, com.moloco.sdk.UserIntent.UserAdInteractionExt.App.Builder> implements com.moloco.sdk.UserIntent.UserAdInteractionExt.AppOrBuilder {
                private Builder() {
                    super(com.moloco.sdk.UserIntent.UserAdInteractionExt.App.DEFAULT_INSTANCE);
                }

                @Override // com.moloco.sdk.UserIntent.UserAdInteractionExt.AppOrBuilder
                public java.lang.String getId() {
                    return ((com.moloco.sdk.UserIntent.UserAdInteractionExt.App) this.instance).getId();
                }

                @Override // com.moloco.sdk.UserIntent.UserAdInteractionExt.AppOrBuilder
                public com.google.protobuf.ByteString getIdBytes() {
                    return ((com.moloco.sdk.UserIntent.UserAdInteractionExt.App) this.instance).getIdBytes();
                }

                public com.moloco.sdk.UserIntent.UserAdInteractionExt.App.Builder setId(java.lang.String str) {
                    copyOnWrite();
                    ((com.moloco.sdk.UserIntent.UserAdInteractionExt.App) this.instance).setId(str);
                    return this;
                }

                public com.moloco.sdk.UserIntent.UserAdInteractionExt.App.Builder clearId() {
                    copyOnWrite();
                    ((com.moloco.sdk.UserIntent.UserAdInteractionExt.App) this.instance).clearId();
                    return this;
                }

                public com.moloco.sdk.UserIntent.UserAdInteractionExt.App.Builder setIdBytes(com.google.protobuf.ByteString byteString) {
                    copyOnWrite();
                    ((com.moloco.sdk.UserIntent.UserAdInteractionExt.App) this.instance).setIdBytes(byteString);
                    return this;
                }

                @Override // com.moloco.sdk.UserIntent.UserAdInteractionExt.AppOrBuilder
                public java.lang.String getVer() {
                    return ((com.moloco.sdk.UserIntent.UserAdInteractionExt.App) this.instance).getVer();
                }

                @Override // com.moloco.sdk.UserIntent.UserAdInteractionExt.AppOrBuilder
                public com.google.protobuf.ByteString getVerBytes() {
                    return ((com.moloco.sdk.UserIntent.UserAdInteractionExt.App) this.instance).getVerBytes();
                }

                public com.moloco.sdk.UserIntent.UserAdInteractionExt.App.Builder setVer(java.lang.String str) {
                    copyOnWrite();
                    ((com.moloco.sdk.UserIntent.UserAdInteractionExt.App) this.instance).setVer(str);
                    return this;
                }

                public com.moloco.sdk.UserIntent.UserAdInteractionExt.App.Builder clearVer() {
                    copyOnWrite();
                    ((com.moloco.sdk.UserIntent.UserAdInteractionExt.App) this.instance).clearVer();
                    return this;
                }

                public com.moloco.sdk.UserIntent.UserAdInteractionExt.App.Builder setVerBytes(com.google.protobuf.ByteString byteString) {
                    copyOnWrite();
                    ((com.moloco.sdk.UserIntent.UserAdInteractionExt.App) this.instance).setVerBytes(byteString);
                    return this;
                }
            }

            @Override // com.google.protobuf.GeneratedMessageLite
            protected final java.lang.Object dynamicMethod(com.google.protobuf.GeneratedMessageLite.MethodToInvoke methodToInvoke, java.lang.Object obj, java.lang.Object obj2) {
                switch (com.moloco.sdk.UserIntent.AnonymousClass1.$SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke[methodToInvoke.ordinal()]) {
                    case 1:
                        return new com.moloco.sdk.UserIntent.UserAdInteractionExt.App();
                    case 2:
                        return new com.moloco.sdk.UserIntent.UserAdInteractionExt.App.Builder();
                    case 3:
                        return newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001Ȉ\u0002Ȉ", new java.lang.Object[]{"id_", "ver_"});
                    case 4:
                        return DEFAULT_INSTANCE;
                    case 5:
                        com.google.protobuf.Parser<com.moloco.sdk.UserIntent.UserAdInteractionExt.App> parser = PARSER;
                        if (parser == null) {
                            synchronized (com.moloco.sdk.UserIntent.UserAdInteractionExt.App.class) {
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
                com.moloco.sdk.UserIntent.UserAdInteractionExt.App app = new com.moloco.sdk.UserIntent.UserAdInteractionExt.App();
                DEFAULT_INSTANCE = app;
                com.google.protobuf.GeneratedMessageLite.registerDefaultInstance(com.moloco.sdk.UserIntent.UserAdInteractionExt.App.class, app);
            }

            public static com.moloco.sdk.UserIntent.UserAdInteractionExt.App getDefaultInstance() {
                return DEFAULT_INSTANCE;
            }

            public static com.google.protobuf.Parser<com.moloco.sdk.UserIntent.UserAdInteractionExt.App> parser() {
                return DEFAULT_INSTANCE.getParserForType();
            }
        }

        public static final class Network extends com.google.protobuf.GeneratedMessageLite<com.moloco.sdk.UserIntent.UserAdInteractionExt.Network, com.moloco.sdk.UserIntent.UserAdInteractionExt.Network.Builder> implements com.moloco.sdk.UserIntent.UserAdInteractionExt.NetworkOrBuilder {
            public static final int CARRIER_FIELD_NUMBER = 2;
            public static final int CONNECTION_TYPE_FIELD_NUMBER = 1;
            private static final com.moloco.sdk.UserIntent.UserAdInteractionExt.Network DEFAULT_INSTANCE;
            private static volatile com.google.protobuf.Parser<com.moloco.sdk.UserIntent.UserAdInteractionExt.Network> PARSER;
            private java.lang.String carrier_ = "";
            private int connectionType_;

            private Network() {
            }

            public enum ConnectionType implements com.google.protobuf.Internal.EnumLite {
                UNKNOWN(0),
                WIFI(1),
                CELLULAR(2),
                UNRECOGNIZED(-1);

                public static final int CELLULAR_VALUE = 2;
                public static final int UNKNOWN_VALUE = 0;
                public static final int WIFI_VALUE = 1;
                private static final com.google.protobuf.Internal.EnumLiteMap<com.moloco.sdk.UserIntent.UserAdInteractionExt.Network.ConnectionType> internalValueMap = new com.google.protobuf.Internal.EnumLiteMap<com.moloco.sdk.UserIntent.UserAdInteractionExt.Network.ConnectionType>() { // from class: com.moloco.sdk.UserIntent.UserAdInteractionExt.Network.ConnectionType.1
                    @Override // com.google.protobuf.Internal.EnumLiteMap
                    public com.moloco.sdk.UserIntent.UserAdInteractionExt.Network.ConnectionType findValueByNumber(int i) {
                        return com.moloco.sdk.UserIntent.UserAdInteractionExt.Network.ConnectionType.forNumber(i);
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
                public static com.moloco.sdk.UserIntent.UserAdInteractionExt.Network.ConnectionType valueOf(int i) {
                    return forNumber(i);
                }

                public static com.moloco.sdk.UserIntent.UserAdInteractionExt.Network.ConnectionType forNumber(int i) {
                    if (i == 0) {
                        return UNKNOWN;
                    }
                    if (i == 1) {
                        return WIFI;
                    }
                    if (i != 2) {
                        return null;
                    }
                    return CELLULAR;
                }

                public static com.google.protobuf.Internal.EnumLiteMap<com.moloco.sdk.UserIntent.UserAdInteractionExt.Network.ConnectionType> internalGetValueMap() {
                    return internalValueMap;
                }

                public static com.google.protobuf.Internal.EnumVerifier internalGetVerifier() {
                    return com.moloco.sdk.UserIntent.UserAdInteractionExt.Network.ConnectionType.ConnectionTypeVerifier.INSTANCE;
                }

                private static final class ConnectionTypeVerifier implements com.google.protobuf.Internal.EnumVerifier {
                    static final com.google.protobuf.Internal.EnumVerifier INSTANCE = new com.moloco.sdk.UserIntent.UserAdInteractionExt.Network.ConnectionType.ConnectionTypeVerifier();

                    private ConnectionTypeVerifier() {
                    }

                    @Override // com.google.protobuf.Internal.EnumVerifier
                    public boolean isInRange(int i) {
                        return com.moloco.sdk.UserIntent.UserAdInteractionExt.Network.ConnectionType.forNumber(i) != null;
                    }
                }

                ConnectionType(int i) {
                    this.value = i;
                }
            }

            @Override // com.moloco.sdk.UserIntent.UserAdInteractionExt.NetworkOrBuilder
            public int getConnectionTypeValue() {
                return this.connectionType_;
            }

            @Override // com.moloco.sdk.UserIntent.UserAdInteractionExt.NetworkOrBuilder
            public com.moloco.sdk.UserIntent.UserAdInteractionExt.Network.ConnectionType getConnectionType() {
                com.moloco.sdk.UserIntent.UserAdInteractionExt.Network.ConnectionType forNumber = com.moloco.sdk.UserIntent.UserAdInteractionExt.Network.ConnectionType.forNumber(this.connectionType_);
                return forNumber == null ? com.moloco.sdk.UserIntent.UserAdInteractionExt.Network.ConnectionType.UNRECOGNIZED : forNumber;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public void setConnectionTypeValue(int i) {
                this.connectionType_ = i;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public void setConnectionType(com.moloco.sdk.UserIntent.UserAdInteractionExt.Network.ConnectionType connectionType) {
                this.connectionType_ = connectionType.getNumber();
            }

            /* JADX INFO: Access modifiers changed from: private */
            public void clearConnectionType() {
                this.connectionType_ = 0;
            }

            @Override // com.moloco.sdk.UserIntent.UserAdInteractionExt.NetworkOrBuilder
            public java.lang.String getCarrier() {
                return this.carrier_;
            }

            @Override // com.moloco.sdk.UserIntent.UserAdInteractionExt.NetworkOrBuilder
            public com.google.protobuf.ByteString getCarrierBytes() {
                return com.google.protobuf.ByteString.copyFromUtf8(this.carrier_);
            }

            /* JADX INFO: Access modifiers changed from: private */
            public void setCarrier(java.lang.String str) {
                str.getClass();
                this.carrier_ = str;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public void clearCarrier() {
                this.carrier_ = getDefaultInstance().getCarrier();
            }

            /* JADX INFO: Access modifiers changed from: private */
            public void setCarrierBytes(com.google.protobuf.ByteString byteString) {
                checkByteStringIsUtf8(byteString);
                this.carrier_ = byteString.toStringUtf8();
            }

            public static com.moloco.sdk.UserIntent.UserAdInteractionExt.Network parseFrom(java.nio.ByteBuffer byteBuffer) throws com.google.protobuf.InvalidProtocolBufferException {
                return (com.moloco.sdk.UserIntent.UserAdInteractionExt.Network) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
            }

            public static com.moloco.sdk.UserIntent.UserAdInteractionExt.Network parseFrom(java.nio.ByteBuffer byteBuffer, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) throws com.google.protobuf.InvalidProtocolBufferException {
                return (com.moloco.sdk.UserIntent.UserAdInteractionExt.Network) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
            }

            public static com.moloco.sdk.UserIntent.UserAdInteractionExt.Network parseFrom(com.google.protobuf.ByteString byteString) throws com.google.protobuf.InvalidProtocolBufferException {
                return (com.moloco.sdk.UserIntent.UserAdInteractionExt.Network) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
            }

            public static com.moloco.sdk.UserIntent.UserAdInteractionExt.Network parseFrom(com.google.protobuf.ByteString byteString, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) throws com.google.protobuf.InvalidProtocolBufferException {
                return (com.moloco.sdk.UserIntent.UserAdInteractionExt.Network) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
            }

            public static com.moloco.sdk.UserIntent.UserAdInteractionExt.Network parseFrom(byte[] bArr) throws com.google.protobuf.InvalidProtocolBufferException {
                return (com.moloco.sdk.UserIntent.UserAdInteractionExt.Network) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
            }

            public static com.moloco.sdk.UserIntent.UserAdInteractionExt.Network parseFrom(byte[] bArr, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) throws com.google.protobuf.InvalidProtocolBufferException {
                return (com.moloco.sdk.UserIntent.UserAdInteractionExt.Network) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
            }

            public static com.moloco.sdk.UserIntent.UserAdInteractionExt.Network parseFrom(java.io.InputStream inputStream) throws java.io.IOException {
                return (com.moloco.sdk.UserIntent.UserAdInteractionExt.Network) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
            }

            public static com.moloco.sdk.UserIntent.UserAdInteractionExt.Network parseFrom(java.io.InputStream inputStream, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) throws java.io.IOException {
                return (com.moloco.sdk.UserIntent.UserAdInteractionExt.Network) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
            }

            public static com.moloco.sdk.UserIntent.UserAdInteractionExt.Network parseDelimitedFrom(java.io.InputStream inputStream) throws java.io.IOException {
                return (com.moloco.sdk.UserIntent.UserAdInteractionExt.Network) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
            }

            public static com.moloco.sdk.UserIntent.UserAdInteractionExt.Network parseDelimitedFrom(java.io.InputStream inputStream, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) throws java.io.IOException {
                return (com.moloco.sdk.UserIntent.UserAdInteractionExt.Network) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
            }

            public static com.moloco.sdk.UserIntent.UserAdInteractionExt.Network parseFrom(com.google.protobuf.CodedInputStream codedInputStream) throws java.io.IOException {
                return (com.moloco.sdk.UserIntent.UserAdInteractionExt.Network) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
            }

            public static com.moloco.sdk.UserIntent.UserAdInteractionExt.Network parseFrom(com.google.protobuf.CodedInputStream codedInputStream, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) throws java.io.IOException {
                return (com.moloco.sdk.UserIntent.UserAdInteractionExt.Network) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
            }

            public static com.moloco.sdk.UserIntent.UserAdInteractionExt.Network.Builder newBuilder() {
                return DEFAULT_INSTANCE.createBuilder();
            }

            public static com.moloco.sdk.UserIntent.UserAdInteractionExt.Network.Builder newBuilder(com.moloco.sdk.UserIntent.UserAdInteractionExt.Network network) {
                return DEFAULT_INSTANCE.createBuilder(network);
            }

            public static final class Builder extends com.google.protobuf.GeneratedMessageLite.Builder<com.moloco.sdk.UserIntent.UserAdInteractionExt.Network, com.moloco.sdk.UserIntent.UserAdInteractionExt.Network.Builder> implements com.moloco.sdk.UserIntent.UserAdInteractionExt.NetworkOrBuilder {
                private Builder() {
                    super(com.moloco.sdk.UserIntent.UserAdInteractionExt.Network.DEFAULT_INSTANCE);
                }

                @Override // com.moloco.sdk.UserIntent.UserAdInteractionExt.NetworkOrBuilder
                public int getConnectionTypeValue() {
                    return ((com.moloco.sdk.UserIntent.UserAdInteractionExt.Network) this.instance).getConnectionTypeValue();
                }

                public com.moloco.sdk.UserIntent.UserAdInteractionExt.Network.Builder setConnectionTypeValue(int i) {
                    copyOnWrite();
                    ((com.moloco.sdk.UserIntent.UserAdInteractionExt.Network) this.instance).setConnectionTypeValue(i);
                    return this;
                }

                @Override // com.moloco.sdk.UserIntent.UserAdInteractionExt.NetworkOrBuilder
                public com.moloco.sdk.UserIntent.UserAdInteractionExt.Network.ConnectionType getConnectionType() {
                    return ((com.moloco.sdk.UserIntent.UserAdInteractionExt.Network) this.instance).getConnectionType();
                }

                public com.moloco.sdk.UserIntent.UserAdInteractionExt.Network.Builder setConnectionType(com.moloco.sdk.UserIntent.UserAdInteractionExt.Network.ConnectionType connectionType) {
                    copyOnWrite();
                    ((com.moloco.sdk.UserIntent.UserAdInteractionExt.Network) this.instance).setConnectionType(connectionType);
                    return this;
                }

                public com.moloco.sdk.UserIntent.UserAdInteractionExt.Network.Builder clearConnectionType() {
                    copyOnWrite();
                    ((com.moloco.sdk.UserIntent.UserAdInteractionExt.Network) this.instance).clearConnectionType();
                    return this;
                }

                @Override // com.moloco.sdk.UserIntent.UserAdInteractionExt.NetworkOrBuilder
                public java.lang.String getCarrier() {
                    return ((com.moloco.sdk.UserIntent.UserAdInteractionExt.Network) this.instance).getCarrier();
                }

                @Override // com.moloco.sdk.UserIntent.UserAdInteractionExt.NetworkOrBuilder
                public com.google.protobuf.ByteString getCarrierBytes() {
                    return ((com.moloco.sdk.UserIntent.UserAdInteractionExt.Network) this.instance).getCarrierBytes();
                }

                public com.moloco.sdk.UserIntent.UserAdInteractionExt.Network.Builder setCarrier(java.lang.String str) {
                    copyOnWrite();
                    ((com.moloco.sdk.UserIntent.UserAdInteractionExt.Network) this.instance).setCarrier(str);
                    return this;
                }

                public com.moloco.sdk.UserIntent.UserAdInteractionExt.Network.Builder clearCarrier() {
                    copyOnWrite();
                    ((com.moloco.sdk.UserIntent.UserAdInteractionExt.Network) this.instance).clearCarrier();
                    return this;
                }

                public com.moloco.sdk.UserIntent.UserAdInteractionExt.Network.Builder setCarrierBytes(com.google.protobuf.ByteString byteString) {
                    copyOnWrite();
                    ((com.moloco.sdk.UserIntent.UserAdInteractionExt.Network) this.instance).setCarrierBytes(byteString);
                    return this;
                }
            }

            @Override // com.google.protobuf.GeneratedMessageLite
            protected final java.lang.Object dynamicMethod(com.google.protobuf.GeneratedMessageLite.MethodToInvoke methodToInvoke, java.lang.Object obj, java.lang.Object obj2) {
                switch (com.moloco.sdk.UserIntent.AnonymousClass1.$SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke[methodToInvoke.ordinal()]) {
                    case 1:
                        return new com.moloco.sdk.UserIntent.UserAdInteractionExt.Network();
                    case 2:
                        return new com.moloco.sdk.UserIntent.UserAdInteractionExt.Network.Builder();
                    case 3:
                        return newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001\f\u0002Ȉ", new java.lang.Object[]{"connectionType_", "carrier_"});
                    case 4:
                        return DEFAULT_INSTANCE;
                    case 5:
                        com.google.protobuf.Parser<com.moloco.sdk.UserIntent.UserAdInteractionExt.Network> parser = PARSER;
                        if (parser == null) {
                            synchronized (com.moloco.sdk.UserIntent.UserAdInteractionExt.Network.class) {
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
                com.moloco.sdk.UserIntent.UserAdInteractionExt.Network network = new com.moloco.sdk.UserIntent.UserAdInteractionExt.Network();
                DEFAULT_INSTANCE = network;
                com.google.protobuf.GeneratedMessageLite.registerDefaultInstance(com.moloco.sdk.UserIntent.UserAdInteractionExt.Network.class, network);
            }

            public static com.moloco.sdk.UserIntent.UserAdInteractionExt.Network getDefaultInstance() {
                return DEFAULT_INSTANCE;
            }

            public static com.google.protobuf.Parser<com.moloco.sdk.UserIntent.UserAdInteractionExt.Network> parser() {
                return DEFAULT_INSTANCE.getParserForType();
            }
        }

        public static final class MolocoSDK extends com.google.protobuf.GeneratedMessageLite<com.moloco.sdk.UserIntent.UserAdInteractionExt.MolocoSDK, com.moloco.sdk.UserIntent.UserAdInteractionExt.MolocoSDK.Builder> implements com.moloco.sdk.UserIntent.UserAdInteractionExt.MolocoSDKOrBuilder {
            public static final int ADAPTER_VER_FIELD_NUMBER = 2;
            public static final int CORE_VER_FIELD_NUMBER = 1;
            private static final com.moloco.sdk.UserIntent.UserAdInteractionExt.MolocoSDK DEFAULT_INSTANCE;
            private static volatile com.google.protobuf.Parser<com.moloco.sdk.UserIntent.UserAdInteractionExt.MolocoSDK> PARSER;
            private java.lang.String coreVer_ = "";
            private java.lang.String adapterVer_ = "";

            private MolocoSDK() {
            }

            @Override // com.moloco.sdk.UserIntent.UserAdInteractionExt.MolocoSDKOrBuilder
            public java.lang.String getCoreVer() {
                return this.coreVer_;
            }

            @Override // com.moloco.sdk.UserIntent.UserAdInteractionExt.MolocoSDKOrBuilder
            public com.google.protobuf.ByteString getCoreVerBytes() {
                return com.google.protobuf.ByteString.copyFromUtf8(this.coreVer_);
            }

            /* JADX INFO: Access modifiers changed from: private */
            public void setCoreVer(java.lang.String str) {
                str.getClass();
                this.coreVer_ = str;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public void clearCoreVer() {
                this.coreVer_ = getDefaultInstance().getCoreVer();
            }

            /* JADX INFO: Access modifiers changed from: private */
            public void setCoreVerBytes(com.google.protobuf.ByteString byteString) {
                checkByteStringIsUtf8(byteString);
                this.coreVer_ = byteString.toStringUtf8();
            }

            @Override // com.moloco.sdk.UserIntent.UserAdInteractionExt.MolocoSDKOrBuilder
            public java.lang.String getAdapterVer() {
                return this.adapterVer_;
            }

            @Override // com.moloco.sdk.UserIntent.UserAdInteractionExt.MolocoSDKOrBuilder
            public com.google.protobuf.ByteString getAdapterVerBytes() {
                return com.google.protobuf.ByteString.copyFromUtf8(this.adapterVer_);
            }

            /* JADX INFO: Access modifiers changed from: private */
            public void setAdapterVer(java.lang.String str) {
                str.getClass();
                this.adapterVer_ = str;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public void clearAdapterVer() {
                this.adapterVer_ = getDefaultInstance().getAdapterVer();
            }

            /* JADX INFO: Access modifiers changed from: private */
            public void setAdapterVerBytes(com.google.protobuf.ByteString byteString) {
                checkByteStringIsUtf8(byteString);
                this.adapterVer_ = byteString.toStringUtf8();
            }

            public static com.moloco.sdk.UserIntent.UserAdInteractionExt.MolocoSDK parseFrom(java.nio.ByteBuffer byteBuffer) throws com.google.protobuf.InvalidProtocolBufferException {
                return (com.moloco.sdk.UserIntent.UserAdInteractionExt.MolocoSDK) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
            }

            public static com.moloco.sdk.UserIntent.UserAdInteractionExt.MolocoSDK parseFrom(java.nio.ByteBuffer byteBuffer, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) throws com.google.protobuf.InvalidProtocolBufferException {
                return (com.moloco.sdk.UserIntent.UserAdInteractionExt.MolocoSDK) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
            }

            public static com.moloco.sdk.UserIntent.UserAdInteractionExt.MolocoSDK parseFrom(com.google.protobuf.ByteString byteString) throws com.google.protobuf.InvalidProtocolBufferException {
                return (com.moloco.sdk.UserIntent.UserAdInteractionExt.MolocoSDK) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
            }

            public static com.moloco.sdk.UserIntent.UserAdInteractionExt.MolocoSDK parseFrom(com.google.protobuf.ByteString byteString, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) throws com.google.protobuf.InvalidProtocolBufferException {
                return (com.moloco.sdk.UserIntent.UserAdInteractionExt.MolocoSDK) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
            }

            public static com.moloco.sdk.UserIntent.UserAdInteractionExt.MolocoSDK parseFrom(byte[] bArr) throws com.google.protobuf.InvalidProtocolBufferException {
                return (com.moloco.sdk.UserIntent.UserAdInteractionExt.MolocoSDK) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
            }

            public static com.moloco.sdk.UserIntent.UserAdInteractionExt.MolocoSDK parseFrom(byte[] bArr, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) throws com.google.protobuf.InvalidProtocolBufferException {
                return (com.moloco.sdk.UserIntent.UserAdInteractionExt.MolocoSDK) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
            }

            public static com.moloco.sdk.UserIntent.UserAdInteractionExt.MolocoSDK parseFrom(java.io.InputStream inputStream) throws java.io.IOException {
                return (com.moloco.sdk.UserIntent.UserAdInteractionExt.MolocoSDK) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
            }

            public static com.moloco.sdk.UserIntent.UserAdInteractionExt.MolocoSDK parseFrom(java.io.InputStream inputStream, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) throws java.io.IOException {
                return (com.moloco.sdk.UserIntent.UserAdInteractionExt.MolocoSDK) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
            }

            public static com.moloco.sdk.UserIntent.UserAdInteractionExt.MolocoSDK parseDelimitedFrom(java.io.InputStream inputStream) throws java.io.IOException {
                return (com.moloco.sdk.UserIntent.UserAdInteractionExt.MolocoSDK) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
            }

            public static com.moloco.sdk.UserIntent.UserAdInteractionExt.MolocoSDK parseDelimitedFrom(java.io.InputStream inputStream, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) throws java.io.IOException {
                return (com.moloco.sdk.UserIntent.UserAdInteractionExt.MolocoSDK) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
            }

            public static com.moloco.sdk.UserIntent.UserAdInteractionExt.MolocoSDK parseFrom(com.google.protobuf.CodedInputStream codedInputStream) throws java.io.IOException {
                return (com.moloco.sdk.UserIntent.UserAdInteractionExt.MolocoSDK) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
            }

            public static com.moloco.sdk.UserIntent.UserAdInteractionExt.MolocoSDK parseFrom(com.google.protobuf.CodedInputStream codedInputStream, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) throws java.io.IOException {
                return (com.moloco.sdk.UserIntent.UserAdInteractionExt.MolocoSDK) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
            }

            public static com.moloco.sdk.UserIntent.UserAdInteractionExt.MolocoSDK.Builder newBuilder() {
                return DEFAULT_INSTANCE.createBuilder();
            }

            public static com.moloco.sdk.UserIntent.UserAdInteractionExt.MolocoSDK.Builder newBuilder(com.moloco.sdk.UserIntent.UserAdInteractionExt.MolocoSDK molocoSDK) {
                return DEFAULT_INSTANCE.createBuilder(molocoSDK);
            }

            public static final class Builder extends com.google.protobuf.GeneratedMessageLite.Builder<com.moloco.sdk.UserIntent.UserAdInteractionExt.MolocoSDK, com.moloco.sdk.UserIntent.UserAdInteractionExt.MolocoSDK.Builder> implements com.moloco.sdk.UserIntent.UserAdInteractionExt.MolocoSDKOrBuilder {
                private Builder() {
                    super(com.moloco.sdk.UserIntent.UserAdInteractionExt.MolocoSDK.DEFAULT_INSTANCE);
                }

                @Override // com.moloco.sdk.UserIntent.UserAdInteractionExt.MolocoSDKOrBuilder
                public java.lang.String getCoreVer() {
                    return ((com.moloco.sdk.UserIntent.UserAdInteractionExt.MolocoSDK) this.instance).getCoreVer();
                }

                @Override // com.moloco.sdk.UserIntent.UserAdInteractionExt.MolocoSDKOrBuilder
                public com.google.protobuf.ByteString getCoreVerBytes() {
                    return ((com.moloco.sdk.UserIntent.UserAdInteractionExt.MolocoSDK) this.instance).getCoreVerBytes();
                }

                public com.moloco.sdk.UserIntent.UserAdInteractionExt.MolocoSDK.Builder setCoreVer(java.lang.String str) {
                    copyOnWrite();
                    ((com.moloco.sdk.UserIntent.UserAdInteractionExt.MolocoSDK) this.instance).setCoreVer(str);
                    return this;
                }

                public com.moloco.sdk.UserIntent.UserAdInteractionExt.MolocoSDK.Builder clearCoreVer() {
                    copyOnWrite();
                    ((com.moloco.sdk.UserIntent.UserAdInteractionExt.MolocoSDK) this.instance).clearCoreVer();
                    return this;
                }

                public com.moloco.sdk.UserIntent.UserAdInteractionExt.MolocoSDK.Builder setCoreVerBytes(com.google.protobuf.ByteString byteString) {
                    copyOnWrite();
                    ((com.moloco.sdk.UserIntent.UserAdInteractionExt.MolocoSDK) this.instance).setCoreVerBytes(byteString);
                    return this;
                }

                @Override // com.moloco.sdk.UserIntent.UserAdInteractionExt.MolocoSDKOrBuilder
                public java.lang.String getAdapterVer() {
                    return ((com.moloco.sdk.UserIntent.UserAdInteractionExt.MolocoSDK) this.instance).getAdapterVer();
                }

                @Override // com.moloco.sdk.UserIntent.UserAdInteractionExt.MolocoSDKOrBuilder
                public com.google.protobuf.ByteString getAdapterVerBytes() {
                    return ((com.moloco.sdk.UserIntent.UserAdInteractionExt.MolocoSDK) this.instance).getAdapterVerBytes();
                }

                public com.moloco.sdk.UserIntent.UserAdInteractionExt.MolocoSDK.Builder setAdapterVer(java.lang.String str) {
                    copyOnWrite();
                    ((com.moloco.sdk.UserIntent.UserAdInteractionExt.MolocoSDK) this.instance).setAdapterVer(str);
                    return this;
                }

                public com.moloco.sdk.UserIntent.UserAdInteractionExt.MolocoSDK.Builder clearAdapterVer() {
                    copyOnWrite();
                    ((com.moloco.sdk.UserIntent.UserAdInteractionExt.MolocoSDK) this.instance).clearAdapterVer();
                    return this;
                }

                public com.moloco.sdk.UserIntent.UserAdInteractionExt.MolocoSDK.Builder setAdapterVerBytes(com.google.protobuf.ByteString byteString) {
                    copyOnWrite();
                    ((com.moloco.sdk.UserIntent.UserAdInteractionExt.MolocoSDK) this.instance).setAdapterVerBytes(byteString);
                    return this;
                }
            }

            @Override // com.google.protobuf.GeneratedMessageLite
            protected final java.lang.Object dynamicMethod(com.google.protobuf.GeneratedMessageLite.MethodToInvoke methodToInvoke, java.lang.Object obj, java.lang.Object obj2) {
                switch (com.moloco.sdk.UserIntent.AnonymousClass1.$SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke[methodToInvoke.ordinal()]) {
                    case 1:
                        return new com.moloco.sdk.UserIntent.UserAdInteractionExt.MolocoSDK();
                    case 2:
                        return new com.moloco.sdk.UserIntent.UserAdInteractionExt.MolocoSDK.Builder();
                    case 3:
                        return newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001Ȉ\u0002Ȉ", new java.lang.Object[]{"coreVer_", "adapterVer_"});
                    case 4:
                        return DEFAULT_INSTANCE;
                    case 5:
                        com.google.protobuf.Parser<com.moloco.sdk.UserIntent.UserAdInteractionExt.MolocoSDK> parser = PARSER;
                        if (parser == null) {
                            synchronized (com.moloco.sdk.UserIntent.UserAdInteractionExt.MolocoSDK.class) {
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
                com.moloco.sdk.UserIntent.UserAdInteractionExt.MolocoSDK molocoSDK = new com.moloco.sdk.UserIntent.UserAdInteractionExt.MolocoSDK();
                DEFAULT_INSTANCE = molocoSDK;
                com.google.protobuf.GeneratedMessageLite.registerDefaultInstance(com.moloco.sdk.UserIntent.UserAdInteractionExt.MolocoSDK.class, molocoSDK);
            }

            public static com.moloco.sdk.UserIntent.UserAdInteractionExt.MolocoSDK getDefaultInstance() {
                return DEFAULT_INSTANCE;
            }

            public static com.google.protobuf.Parser<com.moloco.sdk.UserIntent.UserAdInteractionExt.MolocoSDK> parser() {
                return DEFAULT_INSTANCE.getParserForType();
            }
        }

        public static final class ImpressionInteraction extends com.google.protobuf.GeneratedMessageLite<com.moloco.sdk.UserIntent.UserAdInteractionExt.ImpressionInteraction, com.moloco.sdk.UserIntent.UserAdInteractionExt.ImpressionInteraction.Builder> implements com.moloco.sdk.UserIntent.UserAdInteractionExt.ImpressionInteractionOrBuilder {
            private static final com.moloco.sdk.UserIntent.UserAdInteractionExt.ImpressionInteraction DEFAULT_INSTANCE;
            private static volatile com.google.protobuf.Parser<com.moloco.sdk.UserIntent.UserAdInteractionExt.ImpressionInteraction> PARSER;

            private ImpressionInteraction() {
            }

            public static com.moloco.sdk.UserIntent.UserAdInteractionExt.ImpressionInteraction parseFrom(java.nio.ByteBuffer byteBuffer) throws com.google.protobuf.InvalidProtocolBufferException {
                return (com.moloco.sdk.UserIntent.UserAdInteractionExt.ImpressionInteraction) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
            }

            public static com.moloco.sdk.UserIntent.UserAdInteractionExt.ImpressionInteraction parseFrom(java.nio.ByteBuffer byteBuffer, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) throws com.google.protobuf.InvalidProtocolBufferException {
                return (com.moloco.sdk.UserIntent.UserAdInteractionExt.ImpressionInteraction) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
            }

            public static com.moloco.sdk.UserIntent.UserAdInteractionExt.ImpressionInteraction parseFrom(com.google.protobuf.ByteString byteString) throws com.google.protobuf.InvalidProtocolBufferException {
                return (com.moloco.sdk.UserIntent.UserAdInteractionExt.ImpressionInteraction) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
            }

            public static com.moloco.sdk.UserIntent.UserAdInteractionExt.ImpressionInteraction parseFrom(com.google.protobuf.ByteString byteString, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) throws com.google.protobuf.InvalidProtocolBufferException {
                return (com.moloco.sdk.UserIntent.UserAdInteractionExt.ImpressionInteraction) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
            }

            public static com.moloco.sdk.UserIntent.UserAdInteractionExt.ImpressionInteraction parseFrom(byte[] bArr) throws com.google.protobuf.InvalidProtocolBufferException {
                return (com.moloco.sdk.UserIntent.UserAdInteractionExt.ImpressionInteraction) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
            }

            public static com.moloco.sdk.UserIntent.UserAdInteractionExt.ImpressionInteraction parseFrom(byte[] bArr, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) throws com.google.protobuf.InvalidProtocolBufferException {
                return (com.moloco.sdk.UserIntent.UserAdInteractionExt.ImpressionInteraction) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
            }

            public static com.moloco.sdk.UserIntent.UserAdInteractionExt.ImpressionInteraction parseFrom(java.io.InputStream inputStream) throws java.io.IOException {
                return (com.moloco.sdk.UserIntent.UserAdInteractionExt.ImpressionInteraction) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
            }

            public static com.moloco.sdk.UserIntent.UserAdInteractionExt.ImpressionInteraction parseFrom(java.io.InputStream inputStream, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) throws java.io.IOException {
                return (com.moloco.sdk.UserIntent.UserAdInteractionExt.ImpressionInteraction) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
            }

            public static com.moloco.sdk.UserIntent.UserAdInteractionExt.ImpressionInteraction parseDelimitedFrom(java.io.InputStream inputStream) throws java.io.IOException {
                return (com.moloco.sdk.UserIntent.UserAdInteractionExt.ImpressionInteraction) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
            }

            public static com.moloco.sdk.UserIntent.UserAdInteractionExt.ImpressionInteraction parseDelimitedFrom(java.io.InputStream inputStream, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) throws java.io.IOException {
                return (com.moloco.sdk.UserIntent.UserAdInteractionExt.ImpressionInteraction) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
            }

            public static com.moloco.sdk.UserIntent.UserAdInteractionExt.ImpressionInteraction parseFrom(com.google.protobuf.CodedInputStream codedInputStream) throws java.io.IOException {
                return (com.moloco.sdk.UserIntent.UserAdInteractionExt.ImpressionInteraction) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
            }

            public static com.moloco.sdk.UserIntent.UserAdInteractionExt.ImpressionInteraction parseFrom(com.google.protobuf.CodedInputStream codedInputStream, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) throws java.io.IOException {
                return (com.moloco.sdk.UserIntent.UserAdInteractionExt.ImpressionInteraction) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
            }

            public static com.moloco.sdk.UserIntent.UserAdInteractionExt.ImpressionInteraction.Builder newBuilder() {
                return DEFAULT_INSTANCE.createBuilder();
            }

            public static com.moloco.sdk.UserIntent.UserAdInteractionExt.ImpressionInteraction.Builder newBuilder(com.moloco.sdk.UserIntent.UserAdInteractionExt.ImpressionInteraction impressionInteraction) {
                return DEFAULT_INSTANCE.createBuilder(impressionInteraction);
            }

            public static final class Builder extends com.google.protobuf.GeneratedMessageLite.Builder<com.moloco.sdk.UserIntent.UserAdInteractionExt.ImpressionInteraction, com.moloco.sdk.UserIntent.UserAdInteractionExt.ImpressionInteraction.Builder> implements com.moloco.sdk.UserIntent.UserAdInteractionExt.ImpressionInteractionOrBuilder {
                private Builder() {
                    super(com.moloco.sdk.UserIntent.UserAdInteractionExt.ImpressionInteraction.DEFAULT_INSTANCE);
                }
            }

            @Override // com.google.protobuf.GeneratedMessageLite
            protected final java.lang.Object dynamicMethod(com.google.protobuf.GeneratedMessageLite.MethodToInvoke methodToInvoke, java.lang.Object obj, java.lang.Object obj2) {
                switch (com.moloco.sdk.UserIntent.AnonymousClass1.$SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke[methodToInvoke.ordinal()]) {
                    case 1:
                        return new com.moloco.sdk.UserIntent.UserAdInteractionExt.ImpressionInteraction();
                    case 2:
                        return new com.moloco.sdk.UserIntent.UserAdInteractionExt.ImpressionInteraction.Builder();
                    case 3:
                        return newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0000", null);
                    case 4:
                        return DEFAULT_INSTANCE;
                    case 5:
                        com.google.protobuf.Parser<com.moloco.sdk.UserIntent.UserAdInteractionExt.ImpressionInteraction> parser = PARSER;
                        if (parser == null) {
                            synchronized (com.moloco.sdk.UserIntent.UserAdInteractionExt.ImpressionInteraction.class) {
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
                com.moloco.sdk.UserIntent.UserAdInteractionExt.ImpressionInteraction impressionInteraction = new com.moloco.sdk.UserIntent.UserAdInteractionExt.ImpressionInteraction();
                DEFAULT_INSTANCE = impressionInteraction;
                com.google.protobuf.GeneratedMessageLite.registerDefaultInstance(com.moloco.sdk.UserIntent.UserAdInteractionExt.ImpressionInteraction.class, impressionInteraction);
            }

            public static com.moloco.sdk.UserIntent.UserAdInteractionExt.ImpressionInteraction getDefaultInstance() {
                return DEFAULT_INSTANCE;
            }

            public static com.google.protobuf.Parser<com.moloco.sdk.UserIntent.UserAdInteractionExt.ImpressionInteraction> parser() {
                return DEFAULT_INSTANCE.getParserForType();
            }
        }

        public static final class Position extends com.google.protobuf.GeneratedMessageLite<com.moloco.sdk.UserIntent.UserAdInteractionExt.Position, com.moloco.sdk.UserIntent.UserAdInteractionExt.Position.Builder> implements com.moloco.sdk.UserIntent.UserAdInteractionExt.PositionOrBuilder {
            private static final com.moloco.sdk.UserIntent.UserAdInteractionExt.Position DEFAULT_INSTANCE;
            private static volatile com.google.protobuf.Parser<com.moloco.sdk.UserIntent.UserAdInteractionExt.Position> PARSER = null;
            public static final int X_FIELD_NUMBER = 1;
            public static final int Y_FIELD_NUMBER = 2;
            private float x_;
            private float y_;

            private Position() {
            }

            @Override // com.moloco.sdk.UserIntent.UserAdInteractionExt.PositionOrBuilder
            public float getX() {
                return this.x_;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public void setX(float f) {
                this.x_ = f;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public void clearX() {
                this.x_ = 0.0f;
            }

            @Override // com.moloco.sdk.UserIntent.UserAdInteractionExt.PositionOrBuilder
            public float getY() {
                return this.y_;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public void setY(float f) {
                this.y_ = f;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public void clearY() {
                this.y_ = 0.0f;
            }

            public static com.moloco.sdk.UserIntent.UserAdInteractionExt.Position parseFrom(java.nio.ByteBuffer byteBuffer) throws com.google.protobuf.InvalidProtocolBufferException {
                return (com.moloco.sdk.UserIntent.UserAdInteractionExt.Position) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
            }

            public static com.moloco.sdk.UserIntent.UserAdInteractionExt.Position parseFrom(java.nio.ByteBuffer byteBuffer, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) throws com.google.protobuf.InvalidProtocolBufferException {
                return (com.moloco.sdk.UserIntent.UserAdInteractionExt.Position) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
            }

            public static com.moloco.sdk.UserIntent.UserAdInteractionExt.Position parseFrom(com.google.protobuf.ByteString byteString) throws com.google.protobuf.InvalidProtocolBufferException {
                return (com.moloco.sdk.UserIntent.UserAdInteractionExt.Position) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
            }

            public static com.moloco.sdk.UserIntent.UserAdInteractionExt.Position parseFrom(com.google.protobuf.ByteString byteString, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) throws com.google.protobuf.InvalidProtocolBufferException {
                return (com.moloco.sdk.UserIntent.UserAdInteractionExt.Position) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
            }

            public static com.moloco.sdk.UserIntent.UserAdInteractionExt.Position parseFrom(byte[] bArr) throws com.google.protobuf.InvalidProtocolBufferException {
                return (com.moloco.sdk.UserIntent.UserAdInteractionExt.Position) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
            }

            public static com.moloco.sdk.UserIntent.UserAdInteractionExt.Position parseFrom(byte[] bArr, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) throws com.google.protobuf.InvalidProtocolBufferException {
                return (com.moloco.sdk.UserIntent.UserAdInteractionExt.Position) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
            }

            public static com.moloco.sdk.UserIntent.UserAdInteractionExt.Position parseFrom(java.io.InputStream inputStream) throws java.io.IOException {
                return (com.moloco.sdk.UserIntent.UserAdInteractionExt.Position) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
            }

            public static com.moloco.sdk.UserIntent.UserAdInteractionExt.Position parseFrom(java.io.InputStream inputStream, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) throws java.io.IOException {
                return (com.moloco.sdk.UserIntent.UserAdInteractionExt.Position) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
            }

            public static com.moloco.sdk.UserIntent.UserAdInteractionExt.Position parseDelimitedFrom(java.io.InputStream inputStream) throws java.io.IOException {
                return (com.moloco.sdk.UserIntent.UserAdInteractionExt.Position) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
            }

            public static com.moloco.sdk.UserIntent.UserAdInteractionExt.Position parseDelimitedFrom(java.io.InputStream inputStream, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) throws java.io.IOException {
                return (com.moloco.sdk.UserIntent.UserAdInteractionExt.Position) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
            }

            public static com.moloco.sdk.UserIntent.UserAdInteractionExt.Position parseFrom(com.google.protobuf.CodedInputStream codedInputStream) throws java.io.IOException {
                return (com.moloco.sdk.UserIntent.UserAdInteractionExt.Position) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
            }

            public static com.moloco.sdk.UserIntent.UserAdInteractionExt.Position parseFrom(com.google.protobuf.CodedInputStream codedInputStream, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) throws java.io.IOException {
                return (com.moloco.sdk.UserIntent.UserAdInteractionExt.Position) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
            }

            public static com.moloco.sdk.UserIntent.UserAdInteractionExt.Position.Builder newBuilder() {
                return DEFAULT_INSTANCE.createBuilder();
            }

            public static com.moloco.sdk.UserIntent.UserAdInteractionExt.Position.Builder newBuilder(com.moloco.sdk.UserIntent.UserAdInteractionExt.Position position) {
                return DEFAULT_INSTANCE.createBuilder(position);
            }

            public static final class Builder extends com.google.protobuf.GeneratedMessageLite.Builder<com.moloco.sdk.UserIntent.UserAdInteractionExt.Position, com.moloco.sdk.UserIntent.UserAdInteractionExt.Position.Builder> implements com.moloco.sdk.UserIntent.UserAdInteractionExt.PositionOrBuilder {
                private Builder() {
                    super(com.moloco.sdk.UserIntent.UserAdInteractionExt.Position.DEFAULT_INSTANCE);
                }

                @Override // com.moloco.sdk.UserIntent.UserAdInteractionExt.PositionOrBuilder
                public float getX() {
                    return ((com.moloco.sdk.UserIntent.UserAdInteractionExt.Position) this.instance).getX();
                }

                public com.moloco.sdk.UserIntent.UserAdInteractionExt.Position.Builder setX(float f) {
                    copyOnWrite();
                    ((com.moloco.sdk.UserIntent.UserAdInteractionExt.Position) this.instance).setX(f);
                    return this;
                }

                public com.moloco.sdk.UserIntent.UserAdInteractionExt.Position.Builder clearX() {
                    copyOnWrite();
                    ((com.moloco.sdk.UserIntent.UserAdInteractionExt.Position) this.instance).clearX();
                    return this;
                }

                @Override // com.moloco.sdk.UserIntent.UserAdInteractionExt.PositionOrBuilder
                public float getY() {
                    return ((com.moloco.sdk.UserIntent.UserAdInteractionExt.Position) this.instance).getY();
                }

                public com.moloco.sdk.UserIntent.UserAdInteractionExt.Position.Builder setY(float f) {
                    copyOnWrite();
                    ((com.moloco.sdk.UserIntent.UserAdInteractionExt.Position) this.instance).setY(f);
                    return this;
                }

                public com.moloco.sdk.UserIntent.UserAdInteractionExt.Position.Builder clearY() {
                    copyOnWrite();
                    ((com.moloco.sdk.UserIntent.UserAdInteractionExt.Position) this.instance).clearY();
                    return this;
                }
            }

            @Override // com.google.protobuf.GeneratedMessageLite
            protected final java.lang.Object dynamicMethod(com.google.protobuf.GeneratedMessageLite.MethodToInvoke methodToInvoke, java.lang.Object obj, java.lang.Object obj2) {
                switch (com.moloco.sdk.UserIntent.AnonymousClass1.$SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke[methodToInvoke.ordinal()]) {
                    case 1:
                        return new com.moloco.sdk.UserIntent.UserAdInteractionExt.Position();
                    case 2:
                        return new com.moloco.sdk.UserIntent.UserAdInteractionExt.Position.Builder();
                    case 3:
                        return newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001\u0001\u0002\u0001", new java.lang.Object[]{"x_", "y_"});
                    case 4:
                        return DEFAULT_INSTANCE;
                    case 5:
                        com.google.protobuf.Parser<com.moloco.sdk.UserIntent.UserAdInteractionExt.Position> parser = PARSER;
                        if (parser == null) {
                            synchronized (com.moloco.sdk.UserIntent.UserAdInteractionExt.Position.class) {
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
                com.moloco.sdk.UserIntent.UserAdInteractionExt.Position position = new com.moloco.sdk.UserIntent.UserAdInteractionExt.Position();
                DEFAULT_INSTANCE = position;
                com.google.protobuf.GeneratedMessageLite.registerDefaultInstance(com.moloco.sdk.UserIntent.UserAdInteractionExt.Position.class, position);
            }

            public static com.moloco.sdk.UserIntent.UserAdInteractionExt.Position getDefaultInstance() {
                return DEFAULT_INSTANCE;
            }

            public static com.google.protobuf.Parser<com.moloco.sdk.UserIntent.UserAdInteractionExt.Position> parser() {
                return DEFAULT_INSTANCE.getParserForType();
            }
        }

        public static final class Size extends com.google.protobuf.GeneratedMessageLite<com.moloco.sdk.UserIntent.UserAdInteractionExt.Size, com.moloco.sdk.UserIntent.UserAdInteractionExt.Size.Builder> implements com.moloco.sdk.UserIntent.UserAdInteractionExt.SizeOrBuilder {
            private static final com.moloco.sdk.UserIntent.UserAdInteractionExt.Size DEFAULT_INSTANCE;
            public static final int H_FIELD_NUMBER = 2;
            private static volatile com.google.protobuf.Parser<com.moloco.sdk.UserIntent.UserAdInteractionExt.Size> PARSER = null;
            public static final int W_FIELD_NUMBER = 1;
            private float h_;
            private float w_;

            private Size() {
            }

            @Override // com.moloco.sdk.UserIntent.UserAdInteractionExt.SizeOrBuilder
            public float getW() {
                return this.w_;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public void setW(float f) {
                this.w_ = f;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public void clearW() {
                this.w_ = 0.0f;
            }

            @Override // com.moloco.sdk.UserIntent.UserAdInteractionExt.SizeOrBuilder
            public float getH() {
                return this.h_;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public void setH(float f) {
                this.h_ = f;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public void clearH() {
                this.h_ = 0.0f;
            }

            public static com.moloco.sdk.UserIntent.UserAdInteractionExt.Size parseFrom(java.nio.ByteBuffer byteBuffer) throws com.google.protobuf.InvalidProtocolBufferException {
                return (com.moloco.sdk.UserIntent.UserAdInteractionExt.Size) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
            }

            public static com.moloco.sdk.UserIntent.UserAdInteractionExt.Size parseFrom(java.nio.ByteBuffer byteBuffer, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) throws com.google.protobuf.InvalidProtocolBufferException {
                return (com.moloco.sdk.UserIntent.UserAdInteractionExt.Size) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
            }

            public static com.moloco.sdk.UserIntent.UserAdInteractionExt.Size parseFrom(com.google.protobuf.ByteString byteString) throws com.google.protobuf.InvalidProtocolBufferException {
                return (com.moloco.sdk.UserIntent.UserAdInteractionExt.Size) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
            }

            public static com.moloco.sdk.UserIntent.UserAdInteractionExt.Size parseFrom(com.google.protobuf.ByteString byteString, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) throws com.google.protobuf.InvalidProtocolBufferException {
                return (com.moloco.sdk.UserIntent.UserAdInteractionExt.Size) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
            }

            public static com.moloco.sdk.UserIntent.UserAdInteractionExt.Size parseFrom(byte[] bArr) throws com.google.protobuf.InvalidProtocolBufferException {
                return (com.moloco.sdk.UserIntent.UserAdInteractionExt.Size) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
            }

            public static com.moloco.sdk.UserIntent.UserAdInteractionExt.Size parseFrom(byte[] bArr, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) throws com.google.protobuf.InvalidProtocolBufferException {
                return (com.moloco.sdk.UserIntent.UserAdInteractionExt.Size) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
            }

            public static com.moloco.sdk.UserIntent.UserAdInteractionExt.Size parseFrom(java.io.InputStream inputStream) throws java.io.IOException {
                return (com.moloco.sdk.UserIntent.UserAdInteractionExt.Size) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
            }

            public static com.moloco.sdk.UserIntent.UserAdInteractionExt.Size parseFrom(java.io.InputStream inputStream, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) throws java.io.IOException {
                return (com.moloco.sdk.UserIntent.UserAdInteractionExt.Size) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
            }

            public static com.moloco.sdk.UserIntent.UserAdInteractionExt.Size parseDelimitedFrom(java.io.InputStream inputStream) throws java.io.IOException {
                return (com.moloco.sdk.UserIntent.UserAdInteractionExt.Size) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
            }

            public static com.moloco.sdk.UserIntent.UserAdInteractionExt.Size parseDelimitedFrom(java.io.InputStream inputStream, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) throws java.io.IOException {
                return (com.moloco.sdk.UserIntent.UserAdInteractionExt.Size) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
            }

            public static com.moloco.sdk.UserIntent.UserAdInteractionExt.Size parseFrom(com.google.protobuf.CodedInputStream codedInputStream) throws java.io.IOException {
                return (com.moloco.sdk.UserIntent.UserAdInteractionExt.Size) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
            }

            public static com.moloco.sdk.UserIntent.UserAdInteractionExt.Size parseFrom(com.google.protobuf.CodedInputStream codedInputStream, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) throws java.io.IOException {
                return (com.moloco.sdk.UserIntent.UserAdInteractionExt.Size) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
            }

            public static com.moloco.sdk.UserIntent.UserAdInteractionExt.Size.Builder newBuilder() {
                return DEFAULT_INSTANCE.createBuilder();
            }

            public static com.moloco.sdk.UserIntent.UserAdInteractionExt.Size.Builder newBuilder(com.moloco.sdk.UserIntent.UserAdInteractionExt.Size size) {
                return DEFAULT_INSTANCE.createBuilder(size);
            }

            public static final class Builder extends com.google.protobuf.GeneratedMessageLite.Builder<com.moloco.sdk.UserIntent.UserAdInteractionExt.Size, com.moloco.sdk.UserIntent.UserAdInteractionExt.Size.Builder> implements com.moloco.sdk.UserIntent.UserAdInteractionExt.SizeOrBuilder {
                private Builder() {
                    super(com.moloco.sdk.UserIntent.UserAdInteractionExt.Size.DEFAULT_INSTANCE);
                }

                @Override // com.moloco.sdk.UserIntent.UserAdInteractionExt.SizeOrBuilder
                public float getW() {
                    return ((com.moloco.sdk.UserIntent.UserAdInteractionExt.Size) this.instance).getW();
                }

                public com.moloco.sdk.UserIntent.UserAdInteractionExt.Size.Builder setW(float f) {
                    copyOnWrite();
                    ((com.moloco.sdk.UserIntent.UserAdInteractionExt.Size) this.instance).setW(f);
                    return this;
                }

                public com.moloco.sdk.UserIntent.UserAdInteractionExt.Size.Builder clearW() {
                    copyOnWrite();
                    ((com.moloco.sdk.UserIntent.UserAdInteractionExt.Size) this.instance).clearW();
                    return this;
                }

                @Override // com.moloco.sdk.UserIntent.UserAdInteractionExt.SizeOrBuilder
                public float getH() {
                    return ((com.moloco.sdk.UserIntent.UserAdInteractionExt.Size) this.instance).getH();
                }

                public com.moloco.sdk.UserIntent.UserAdInteractionExt.Size.Builder setH(float f) {
                    copyOnWrite();
                    ((com.moloco.sdk.UserIntent.UserAdInteractionExt.Size) this.instance).setH(f);
                    return this;
                }

                public com.moloco.sdk.UserIntent.UserAdInteractionExt.Size.Builder clearH() {
                    copyOnWrite();
                    ((com.moloco.sdk.UserIntent.UserAdInteractionExt.Size) this.instance).clearH();
                    return this;
                }
            }

            @Override // com.google.protobuf.GeneratedMessageLite
            protected final java.lang.Object dynamicMethod(com.google.protobuf.GeneratedMessageLite.MethodToInvoke methodToInvoke, java.lang.Object obj, java.lang.Object obj2) {
                switch (com.moloco.sdk.UserIntent.AnonymousClass1.$SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke[methodToInvoke.ordinal()]) {
                    case 1:
                        return new com.moloco.sdk.UserIntent.UserAdInteractionExt.Size();
                    case 2:
                        return new com.moloco.sdk.UserIntent.UserAdInteractionExt.Size.Builder();
                    case 3:
                        return newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001\u0001\u0002\u0001", new java.lang.Object[]{"w_", "h_"});
                    case 4:
                        return DEFAULT_INSTANCE;
                    case 5:
                        com.google.protobuf.Parser<com.moloco.sdk.UserIntent.UserAdInteractionExt.Size> parser = PARSER;
                        if (parser == null) {
                            synchronized (com.moloco.sdk.UserIntent.UserAdInteractionExt.Size.class) {
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
                com.moloco.sdk.UserIntent.UserAdInteractionExt.Size size = new com.moloco.sdk.UserIntent.UserAdInteractionExt.Size();
                DEFAULT_INSTANCE = size;
                com.google.protobuf.GeneratedMessageLite.registerDefaultInstance(com.moloco.sdk.UserIntent.UserAdInteractionExt.Size.class, size);
            }

            public static com.moloco.sdk.UserIntent.UserAdInteractionExt.Size getDefaultInstance() {
                return DEFAULT_INSTANCE;
            }

            public static com.google.protobuf.Parser<com.moloco.sdk.UserIntent.UserAdInteractionExt.Size> parser() {
                return DEFAULT_INSTANCE.getParserForType();
            }
        }

        public static final class Button extends com.google.protobuf.GeneratedMessageLite<com.moloco.sdk.UserIntent.UserAdInteractionExt.Button, com.moloco.sdk.UserIntent.UserAdInteractionExt.Button.Builder> implements com.moloco.sdk.UserIntent.UserAdInteractionExt.ButtonOrBuilder {
            private static final com.moloco.sdk.UserIntent.UserAdInteractionExt.Button DEFAULT_INSTANCE;
            private static volatile com.google.protobuf.Parser<com.moloco.sdk.UserIntent.UserAdInteractionExt.Button> PARSER = null;
            public static final int POS_FIELD_NUMBER = 2;
            public static final int SIZE_FIELD_NUMBER = 3;
            public static final int TYPE_FIELD_NUMBER = 1;
            private com.moloco.sdk.UserIntent.UserAdInteractionExt.Position pos_;
            private com.moloco.sdk.UserIntent.UserAdInteractionExt.Size size_;
            private int type_;

            private Button() {
            }

            public enum Type implements com.google.protobuf.Internal.EnumLite {
                NONE(0),
                CLOSE(1),
                SKIP(2),
                MUTE(3),
                UNMUTE(4),
                CTA(5),
                REPLAY(6),
                DEC_SKIP(7),
                AD_BADGE(8),
                UNRECOGNIZED(-1);

                public static final int AD_BADGE_VALUE = 8;
                public static final int CLOSE_VALUE = 1;
                public static final int CTA_VALUE = 5;
                public static final int DEC_SKIP_VALUE = 7;
                public static final int MUTE_VALUE = 3;
                public static final int NONE_VALUE = 0;
                public static final int REPLAY_VALUE = 6;
                public static final int SKIP_VALUE = 2;
                public static final int UNMUTE_VALUE = 4;
                private static final com.google.protobuf.Internal.EnumLiteMap<com.moloco.sdk.UserIntent.UserAdInteractionExt.Button.Type> internalValueMap = new com.google.protobuf.Internal.EnumLiteMap<com.moloco.sdk.UserIntent.UserAdInteractionExt.Button.Type>() { // from class: com.moloco.sdk.UserIntent.UserAdInteractionExt.Button.Type.1
                    @Override // com.google.protobuf.Internal.EnumLiteMap
                    public com.moloco.sdk.UserIntent.UserAdInteractionExt.Button.Type findValueByNumber(int i) {
                        return com.moloco.sdk.UserIntent.UserAdInteractionExt.Button.Type.forNumber(i);
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
                public static com.moloco.sdk.UserIntent.UserAdInteractionExt.Button.Type valueOf(int i) {
                    return forNumber(i);
                }

                public static com.moloco.sdk.UserIntent.UserAdInteractionExt.Button.Type forNumber(int i) {
                    switch (i) {
                        case 0:
                            return NONE;
                        case 1:
                            return CLOSE;
                        case 2:
                            return SKIP;
                        case 3:
                            return MUTE;
                        case 4:
                            return UNMUTE;
                        case 5:
                            return CTA;
                        case 6:
                            return REPLAY;
                        case 7:
                            return DEC_SKIP;
                        case 8:
                            return AD_BADGE;
                        default:
                            return null;
                    }
                }

                public static com.google.protobuf.Internal.EnumLiteMap<com.moloco.sdk.UserIntent.UserAdInteractionExt.Button.Type> internalGetValueMap() {
                    return internalValueMap;
                }

                public static com.google.protobuf.Internal.EnumVerifier internalGetVerifier() {
                    return com.moloco.sdk.UserIntent.UserAdInteractionExt.Button.Type.TypeVerifier.INSTANCE;
                }

                private static final class TypeVerifier implements com.google.protobuf.Internal.EnumVerifier {
                    static final com.google.protobuf.Internal.EnumVerifier INSTANCE = new com.moloco.sdk.UserIntent.UserAdInteractionExt.Button.Type.TypeVerifier();

                    private TypeVerifier() {
                    }

                    @Override // com.google.protobuf.Internal.EnumVerifier
                    public boolean isInRange(int i) {
                        return com.moloco.sdk.UserIntent.UserAdInteractionExt.Button.Type.forNumber(i) != null;
                    }
                }

                Type(int i) {
                    this.value = i;
                }
            }

            @Override // com.moloco.sdk.UserIntent.UserAdInteractionExt.ButtonOrBuilder
            public int getTypeValue() {
                return this.type_;
            }

            @Override // com.moloco.sdk.UserIntent.UserAdInteractionExt.ButtonOrBuilder
            public com.moloco.sdk.UserIntent.UserAdInteractionExt.Button.Type getType() {
                com.moloco.sdk.UserIntent.UserAdInteractionExt.Button.Type forNumber = com.moloco.sdk.UserIntent.UserAdInteractionExt.Button.Type.forNumber(this.type_);
                return forNumber == null ? com.moloco.sdk.UserIntent.UserAdInteractionExt.Button.Type.UNRECOGNIZED : forNumber;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public void setTypeValue(int i) {
                this.type_ = i;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public void setType(com.moloco.sdk.UserIntent.UserAdInteractionExt.Button.Type type) {
                this.type_ = type.getNumber();
            }

            /* JADX INFO: Access modifiers changed from: private */
            public void clearType() {
                this.type_ = 0;
            }

            @Override // com.moloco.sdk.UserIntent.UserAdInteractionExt.ButtonOrBuilder
            public boolean hasPos() {
                return this.pos_ != null;
            }

            @Override // com.moloco.sdk.UserIntent.UserAdInteractionExt.ButtonOrBuilder
            public com.moloco.sdk.UserIntent.UserAdInteractionExt.Position getPos() {
                com.moloco.sdk.UserIntent.UserAdInteractionExt.Position position = this.pos_;
                return position == null ? com.moloco.sdk.UserIntent.UserAdInteractionExt.Position.getDefaultInstance() : position;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public void setPos(com.moloco.sdk.UserIntent.UserAdInteractionExt.Position position) {
                position.getClass();
                this.pos_ = position;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public void mergePos(com.moloco.sdk.UserIntent.UserAdInteractionExt.Position position) {
                position.getClass();
                com.moloco.sdk.UserIntent.UserAdInteractionExt.Position position2 = this.pos_;
                if (position2 != null && position2 != com.moloco.sdk.UserIntent.UserAdInteractionExt.Position.getDefaultInstance()) {
                    this.pos_ = com.moloco.sdk.UserIntent.UserAdInteractionExt.Position.newBuilder(this.pos_).mergeFrom((com.moloco.sdk.UserIntent.UserAdInteractionExt.Position.Builder) position).buildPartial();
                } else {
                    this.pos_ = position;
                }
            }

            /* JADX INFO: Access modifiers changed from: private */
            public void clearPos() {
                this.pos_ = null;
            }

            @Override // com.moloco.sdk.UserIntent.UserAdInteractionExt.ButtonOrBuilder
            public boolean hasSize() {
                return this.size_ != null;
            }

            @Override // com.moloco.sdk.UserIntent.UserAdInteractionExt.ButtonOrBuilder
            public com.moloco.sdk.UserIntent.UserAdInteractionExt.Size getSize() {
                com.moloco.sdk.UserIntent.UserAdInteractionExt.Size size = this.size_;
                return size == null ? com.moloco.sdk.UserIntent.UserAdInteractionExt.Size.getDefaultInstance() : size;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public void setSize(com.moloco.sdk.UserIntent.UserAdInteractionExt.Size size) {
                size.getClass();
                this.size_ = size;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public void mergeSize(com.moloco.sdk.UserIntent.UserAdInteractionExt.Size size) {
                size.getClass();
                com.moloco.sdk.UserIntent.UserAdInteractionExt.Size size2 = this.size_;
                if (size2 != null && size2 != com.moloco.sdk.UserIntent.UserAdInteractionExt.Size.getDefaultInstance()) {
                    this.size_ = com.moloco.sdk.UserIntent.UserAdInteractionExt.Size.newBuilder(this.size_).mergeFrom((com.moloco.sdk.UserIntent.UserAdInteractionExt.Size.Builder) size).buildPartial();
                } else {
                    this.size_ = size;
                }
            }

            /* JADX INFO: Access modifiers changed from: private */
            public void clearSize() {
                this.size_ = null;
            }

            public static com.moloco.sdk.UserIntent.UserAdInteractionExt.Button parseFrom(java.nio.ByteBuffer byteBuffer) throws com.google.protobuf.InvalidProtocolBufferException {
                return (com.moloco.sdk.UserIntent.UserAdInteractionExt.Button) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
            }

            public static com.moloco.sdk.UserIntent.UserAdInteractionExt.Button parseFrom(java.nio.ByteBuffer byteBuffer, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) throws com.google.protobuf.InvalidProtocolBufferException {
                return (com.moloco.sdk.UserIntent.UserAdInteractionExt.Button) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
            }

            public static com.moloco.sdk.UserIntent.UserAdInteractionExt.Button parseFrom(com.google.protobuf.ByteString byteString) throws com.google.protobuf.InvalidProtocolBufferException {
                return (com.moloco.sdk.UserIntent.UserAdInteractionExt.Button) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
            }

            public static com.moloco.sdk.UserIntent.UserAdInteractionExt.Button parseFrom(com.google.protobuf.ByteString byteString, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) throws com.google.protobuf.InvalidProtocolBufferException {
                return (com.moloco.sdk.UserIntent.UserAdInteractionExt.Button) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
            }

            public static com.moloco.sdk.UserIntent.UserAdInteractionExt.Button parseFrom(byte[] bArr) throws com.google.protobuf.InvalidProtocolBufferException {
                return (com.moloco.sdk.UserIntent.UserAdInteractionExt.Button) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
            }

            public static com.moloco.sdk.UserIntent.UserAdInteractionExt.Button parseFrom(byte[] bArr, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) throws com.google.protobuf.InvalidProtocolBufferException {
                return (com.moloco.sdk.UserIntent.UserAdInteractionExt.Button) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
            }

            public static com.moloco.sdk.UserIntent.UserAdInteractionExt.Button parseFrom(java.io.InputStream inputStream) throws java.io.IOException {
                return (com.moloco.sdk.UserIntent.UserAdInteractionExt.Button) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
            }

            public static com.moloco.sdk.UserIntent.UserAdInteractionExt.Button parseFrom(java.io.InputStream inputStream, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) throws java.io.IOException {
                return (com.moloco.sdk.UserIntent.UserAdInteractionExt.Button) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
            }

            public static com.moloco.sdk.UserIntent.UserAdInteractionExt.Button parseDelimitedFrom(java.io.InputStream inputStream) throws java.io.IOException {
                return (com.moloco.sdk.UserIntent.UserAdInteractionExt.Button) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
            }

            public static com.moloco.sdk.UserIntent.UserAdInteractionExt.Button parseDelimitedFrom(java.io.InputStream inputStream, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) throws java.io.IOException {
                return (com.moloco.sdk.UserIntent.UserAdInteractionExt.Button) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
            }

            public static com.moloco.sdk.UserIntent.UserAdInteractionExt.Button parseFrom(com.google.protobuf.CodedInputStream codedInputStream) throws java.io.IOException {
                return (com.moloco.sdk.UserIntent.UserAdInteractionExt.Button) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
            }

            public static com.moloco.sdk.UserIntent.UserAdInteractionExt.Button parseFrom(com.google.protobuf.CodedInputStream codedInputStream, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) throws java.io.IOException {
                return (com.moloco.sdk.UserIntent.UserAdInteractionExt.Button) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
            }

            public static com.moloco.sdk.UserIntent.UserAdInteractionExt.Button.Builder newBuilder() {
                return DEFAULT_INSTANCE.createBuilder();
            }

            public static com.moloco.sdk.UserIntent.UserAdInteractionExt.Button.Builder newBuilder(com.moloco.sdk.UserIntent.UserAdInteractionExt.Button button) {
                return DEFAULT_INSTANCE.createBuilder(button);
            }

            public static final class Builder extends com.google.protobuf.GeneratedMessageLite.Builder<com.moloco.sdk.UserIntent.UserAdInteractionExt.Button, com.moloco.sdk.UserIntent.UserAdInteractionExt.Button.Builder> implements com.moloco.sdk.UserIntent.UserAdInteractionExt.ButtonOrBuilder {
                private Builder() {
                    super(com.moloco.sdk.UserIntent.UserAdInteractionExt.Button.DEFAULT_INSTANCE);
                }

                @Override // com.moloco.sdk.UserIntent.UserAdInteractionExt.ButtonOrBuilder
                public int getTypeValue() {
                    return ((com.moloco.sdk.UserIntent.UserAdInteractionExt.Button) this.instance).getTypeValue();
                }

                public com.moloco.sdk.UserIntent.UserAdInteractionExt.Button.Builder setTypeValue(int i) {
                    copyOnWrite();
                    ((com.moloco.sdk.UserIntent.UserAdInteractionExt.Button) this.instance).setTypeValue(i);
                    return this;
                }

                @Override // com.moloco.sdk.UserIntent.UserAdInteractionExt.ButtonOrBuilder
                public com.moloco.sdk.UserIntent.UserAdInteractionExt.Button.Type getType() {
                    return ((com.moloco.sdk.UserIntent.UserAdInteractionExt.Button) this.instance).getType();
                }

                public com.moloco.sdk.UserIntent.UserAdInteractionExt.Button.Builder setType(com.moloco.sdk.UserIntent.UserAdInteractionExt.Button.Type type) {
                    copyOnWrite();
                    ((com.moloco.sdk.UserIntent.UserAdInteractionExt.Button) this.instance).setType(type);
                    return this;
                }

                public com.moloco.sdk.UserIntent.UserAdInteractionExt.Button.Builder clearType() {
                    copyOnWrite();
                    ((com.moloco.sdk.UserIntent.UserAdInteractionExt.Button) this.instance).clearType();
                    return this;
                }

                @Override // com.moloco.sdk.UserIntent.UserAdInteractionExt.ButtonOrBuilder
                public boolean hasPos() {
                    return ((com.moloco.sdk.UserIntent.UserAdInteractionExt.Button) this.instance).hasPos();
                }

                @Override // com.moloco.sdk.UserIntent.UserAdInteractionExt.ButtonOrBuilder
                public com.moloco.sdk.UserIntent.UserAdInteractionExt.Position getPos() {
                    return ((com.moloco.sdk.UserIntent.UserAdInteractionExt.Button) this.instance).getPos();
                }

                public com.moloco.sdk.UserIntent.UserAdInteractionExt.Button.Builder setPos(com.moloco.sdk.UserIntent.UserAdInteractionExt.Position position) {
                    copyOnWrite();
                    ((com.moloco.sdk.UserIntent.UserAdInteractionExt.Button) this.instance).setPos(position);
                    return this;
                }

                public com.moloco.sdk.UserIntent.UserAdInteractionExt.Button.Builder setPos(com.moloco.sdk.UserIntent.UserAdInteractionExt.Position.Builder builder) {
                    copyOnWrite();
                    ((com.moloco.sdk.UserIntent.UserAdInteractionExt.Button) this.instance).setPos(builder.build());
                    return this;
                }

                public com.moloco.sdk.UserIntent.UserAdInteractionExt.Button.Builder mergePos(com.moloco.sdk.UserIntent.UserAdInteractionExt.Position position) {
                    copyOnWrite();
                    ((com.moloco.sdk.UserIntent.UserAdInteractionExt.Button) this.instance).mergePos(position);
                    return this;
                }

                public com.moloco.sdk.UserIntent.UserAdInteractionExt.Button.Builder clearPos() {
                    copyOnWrite();
                    ((com.moloco.sdk.UserIntent.UserAdInteractionExt.Button) this.instance).clearPos();
                    return this;
                }

                @Override // com.moloco.sdk.UserIntent.UserAdInteractionExt.ButtonOrBuilder
                public boolean hasSize() {
                    return ((com.moloco.sdk.UserIntent.UserAdInteractionExt.Button) this.instance).hasSize();
                }

                @Override // com.moloco.sdk.UserIntent.UserAdInteractionExt.ButtonOrBuilder
                public com.moloco.sdk.UserIntent.UserAdInteractionExt.Size getSize() {
                    return ((com.moloco.sdk.UserIntent.UserAdInteractionExt.Button) this.instance).getSize();
                }

                public com.moloco.sdk.UserIntent.UserAdInteractionExt.Button.Builder setSize(com.moloco.sdk.UserIntent.UserAdInteractionExt.Size size) {
                    copyOnWrite();
                    ((com.moloco.sdk.UserIntent.UserAdInteractionExt.Button) this.instance).setSize(size);
                    return this;
                }

                public com.moloco.sdk.UserIntent.UserAdInteractionExt.Button.Builder setSize(com.moloco.sdk.UserIntent.UserAdInteractionExt.Size.Builder builder) {
                    copyOnWrite();
                    ((com.moloco.sdk.UserIntent.UserAdInteractionExt.Button) this.instance).setSize(builder.build());
                    return this;
                }

                public com.moloco.sdk.UserIntent.UserAdInteractionExt.Button.Builder mergeSize(com.moloco.sdk.UserIntent.UserAdInteractionExt.Size size) {
                    copyOnWrite();
                    ((com.moloco.sdk.UserIntent.UserAdInteractionExt.Button) this.instance).mergeSize(size);
                    return this;
                }

                public com.moloco.sdk.UserIntent.UserAdInteractionExt.Button.Builder clearSize() {
                    copyOnWrite();
                    ((com.moloco.sdk.UserIntent.UserAdInteractionExt.Button) this.instance).clearSize();
                    return this;
                }
            }

            @Override // com.google.protobuf.GeneratedMessageLite
            protected final java.lang.Object dynamicMethod(com.google.protobuf.GeneratedMessageLite.MethodToInvoke methodToInvoke, java.lang.Object obj, java.lang.Object obj2) {
                switch (com.moloco.sdk.UserIntent.AnonymousClass1.$SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke[methodToInvoke.ordinal()]) {
                    case 1:
                        return new com.moloco.sdk.UserIntent.UserAdInteractionExt.Button();
                    case 2:
                        return new com.moloco.sdk.UserIntent.UserAdInteractionExt.Button.Builder();
                    case 3:
                        return newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0000\u0000\u0001\f\u0002\t\u0003\t", new java.lang.Object[]{"type_", "pos_", "size_"});
                    case 4:
                        return DEFAULT_INSTANCE;
                    case 5:
                        com.google.protobuf.Parser<com.moloco.sdk.UserIntent.UserAdInteractionExt.Button> parser = PARSER;
                        if (parser == null) {
                            synchronized (com.moloco.sdk.UserIntent.UserAdInteractionExt.Button.class) {
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
                com.moloco.sdk.UserIntent.UserAdInteractionExt.Button button = new com.moloco.sdk.UserIntent.UserAdInteractionExt.Button();
                DEFAULT_INSTANCE = button;
                com.google.protobuf.GeneratedMessageLite.registerDefaultInstance(com.moloco.sdk.UserIntent.UserAdInteractionExt.Button.class, button);
            }

            public static com.moloco.sdk.UserIntent.UserAdInteractionExt.Button getDefaultInstance() {
                return DEFAULT_INSTANCE;
            }

            public static com.google.protobuf.Parser<com.moloco.sdk.UserIntent.UserAdInteractionExt.Button> parser() {
                return DEFAULT_INSTANCE.getParserForType();
            }
        }

        public static final class ClickInteraction extends com.google.protobuf.GeneratedMessageLite<com.moloco.sdk.UserIntent.UserAdInteractionExt.ClickInteraction, com.moloco.sdk.UserIntent.UserAdInteractionExt.ClickInteraction.Builder> implements com.moloco.sdk.UserIntent.UserAdInteractionExt.ClickInteractionOrBuilder {
            public static final int BUTTONS_FIELD_NUMBER = 5;
            public static final int CLICK_POS_FIELD_NUMBER = 1;
            private static final com.moloco.sdk.UserIntent.UserAdInteractionExt.ClickInteraction DEFAULT_INSTANCE;
            private static volatile com.google.protobuf.Parser<com.moloco.sdk.UserIntent.UserAdInteractionExt.ClickInteraction> PARSER = null;
            public static final int SCREEN_SIZE_FIELD_NUMBER = 2;
            public static final int VIEW_POS_FIELD_NUMBER = 3;
            public static final int VIEW_SIZE_FIELD_NUMBER = 4;
            private com.google.protobuf.Internal.ProtobufList<com.moloco.sdk.UserIntent.UserAdInteractionExt.Button> buttons_ = emptyProtobufList();
            private com.moloco.sdk.UserIntent.UserAdInteractionExt.Position clickPos_;
            private com.moloco.sdk.UserIntent.UserAdInteractionExt.Size screenSize_;
            private com.moloco.sdk.UserIntent.UserAdInteractionExt.Position viewPos_;
            private com.moloco.sdk.UserIntent.UserAdInteractionExt.Size viewSize_;

            private ClickInteraction() {
            }

            @Override // com.moloco.sdk.UserIntent.UserAdInteractionExt.ClickInteractionOrBuilder
            public boolean hasClickPos() {
                return this.clickPos_ != null;
            }

            @Override // com.moloco.sdk.UserIntent.UserAdInteractionExt.ClickInteractionOrBuilder
            public com.moloco.sdk.UserIntent.UserAdInteractionExt.Position getClickPos() {
                com.moloco.sdk.UserIntent.UserAdInteractionExt.Position position = this.clickPos_;
                return position == null ? com.moloco.sdk.UserIntent.UserAdInteractionExt.Position.getDefaultInstance() : position;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public void setClickPos(com.moloco.sdk.UserIntent.UserAdInteractionExt.Position position) {
                position.getClass();
                this.clickPos_ = position;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public void mergeClickPos(com.moloco.sdk.UserIntent.UserAdInteractionExt.Position position) {
                position.getClass();
                com.moloco.sdk.UserIntent.UserAdInteractionExt.Position position2 = this.clickPos_;
                if (position2 != null && position2 != com.moloco.sdk.UserIntent.UserAdInteractionExt.Position.getDefaultInstance()) {
                    this.clickPos_ = com.moloco.sdk.UserIntent.UserAdInteractionExt.Position.newBuilder(this.clickPos_).mergeFrom((com.moloco.sdk.UserIntent.UserAdInteractionExt.Position.Builder) position).buildPartial();
                } else {
                    this.clickPos_ = position;
                }
            }

            /* JADX INFO: Access modifiers changed from: private */
            public void clearClickPos() {
                this.clickPos_ = null;
            }

            @Override // com.moloco.sdk.UserIntent.UserAdInteractionExt.ClickInteractionOrBuilder
            public boolean hasScreenSize() {
                return this.screenSize_ != null;
            }

            @Override // com.moloco.sdk.UserIntent.UserAdInteractionExt.ClickInteractionOrBuilder
            public com.moloco.sdk.UserIntent.UserAdInteractionExt.Size getScreenSize() {
                com.moloco.sdk.UserIntent.UserAdInteractionExt.Size size = this.screenSize_;
                return size == null ? com.moloco.sdk.UserIntent.UserAdInteractionExt.Size.getDefaultInstance() : size;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public void setScreenSize(com.moloco.sdk.UserIntent.UserAdInteractionExt.Size size) {
                size.getClass();
                this.screenSize_ = size;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public void mergeScreenSize(com.moloco.sdk.UserIntent.UserAdInteractionExt.Size size) {
                size.getClass();
                com.moloco.sdk.UserIntent.UserAdInteractionExt.Size size2 = this.screenSize_;
                if (size2 != null && size2 != com.moloco.sdk.UserIntent.UserAdInteractionExt.Size.getDefaultInstance()) {
                    this.screenSize_ = com.moloco.sdk.UserIntent.UserAdInteractionExt.Size.newBuilder(this.screenSize_).mergeFrom((com.moloco.sdk.UserIntent.UserAdInteractionExt.Size.Builder) size).buildPartial();
                } else {
                    this.screenSize_ = size;
                }
            }

            /* JADX INFO: Access modifiers changed from: private */
            public void clearScreenSize() {
                this.screenSize_ = null;
            }

            @Override // com.moloco.sdk.UserIntent.UserAdInteractionExt.ClickInteractionOrBuilder
            public boolean hasViewPos() {
                return this.viewPos_ != null;
            }

            @Override // com.moloco.sdk.UserIntent.UserAdInteractionExt.ClickInteractionOrBuilder
            public com.moloco.sdk.UserIntent.UserAdInteractionExt.Position getViewPos() {
                com.moloco.sdk.UserIntent.UserAdInteractionExt.Position position = this.viewPos_;
                return position == null ? com.moloco.sdk.UserIntent.UserAdInteractionExt.Position.getDefaultInstance() : position;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public void setViewPos(com.moloco.sdk.UserIntent.UserAdInteractionExt.Position position) {
                position.getClass();
                this.viewPos_ = position;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public void mergeViewPos(com.moloco.sdk.UserIntent.UserAdInteractionExt.Position position) {
                position.getClass();
                com.moloco.sdk.UserIntent.UserAdInteractionExt.Position position2 = this.viewPos_;
                if (position2 != null && position2 != com.moloco.sdk.UserIntent.UserAdInteractionExt.Position.getDefaultInstance()) {
                    this.viewPos_ = com.moloco.sdk.UserIntent.UserAdInteractionExt.Position.newBuilder(this.viewPos_).mergeFrom((com.moloco.sdk.UserIntent.UserAdInteractionExt.Position.Builder) position).buildPartial();
                } else {
                    this.viewPos_ = position;
                }
            }

            /* JADX INFO: Access modifiers changed from: private */
            public void clearViewPos() {
                this.viewPos_ = null;
            }

            @Override // com.moloco.sdk.UserIntent.UserAdInteractionExt.ClickInteractionOrBuilder
            public boolean hasViewSize() {
                return this.viewSize_ != null;
            }

            @Override // com.moloco.sdk.UserIntent.UserAdInteractionExt.ClickInteractionOrBuilder
            public com.moloco.sdk.UserIntent.UserAdInteractionExt.Size getViewSize() {
                com.moloco.sdk.UserIntent.UserAdInteractionExt.Size size = this.viewSize_;
                return size == null ? com.moloco.sdk.UserIntent.UserAdInteractionExt.Size.getDefaultInstance() : size;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public void setViewSize(com.moloco.sdk.UserIntent.UserAdInteractionExt.Size size) {
                size.getClass();
                this.viewSize_ = size;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public void mergeViewSize(com.moloco.sdk.UserIntent.UserAdInteractionExt.Size size) {
                size.getClass();
                com.moloco.sdk.UserIntent.UserAdInteractionExt.Size size2 = this.viewSize_;
                if (size2 != null && size2 != com.moloco.sdk.UserIntent.UserAdInteractionExt.Size.getDefaultInstance()) {
                    this.viewSize_ = com.moloco.sdk.UserIntent.UserAdInteractionExt.Size.newBuilder(this.viewSize_).mergeFrom((com.moloco.sdk.UserIntent.UserAdInteractionExt.Size.Builder) size).buildPartial();
                } else {
                    this.viewSize_ = size;
                }
            }

            /* JADX INFO: Access modifiers changed from: private */
            public void clearViewSize() {
                this.viewSize_ = null;
            }

            @Override // com.moloco.sdk.UserIntent.UserAdInteractionExt.ClickInteractionOrBuilder
            public java.util.List<com.moloco.sdk.UserIntent.UserAdInteractionExt.Button> getButtonsList() {
                return this.buttons_;
            }

            public java.util.List<? extends com.moloco.sdk.UserIntent.UserAdInteractionExt.ButtonOrBuilder> getButtonsOrBuilderList() {
                return this.buttons_;
            }

            @Override // com.moloco.sdk.UserIntent.UserAdInteractionExt.ClickInteractionOrBuilder
            public int getButtonsCount() {
                return this.buttons_.size();
            }

            @Override // com.moloco.sdk.UserIntent.UserAdInteractionExt.ClickInteractionOrBuilder
            public com.moloco.sdk.UserIntent.UserAdInteractionExt.Button getButtons(int i) {
                return this.buttons_.get(i);
            }

            public com.moloco.sdk.UserIntent.UserAdInteractionExt.ButtonOrBuilder getButtonsOrBuilder(int i) {
                return this.buttons_.get(i);
            }

            private void ensureButtonsIsMutable() {
                com.google.protobuf.Internal.ProtobufList<com.moloco.sdk.UserIntent.UserAdInteractionExt.Button> protobufList = this.buttons_;
                if (protobufList.isModifiable()) {
                    return;
                }
                this.buttons_ = com.google.protobuf.GeneratedMessageLite.mutableCopy(protobufList);
            }

            /* JADX INFO: Access modifiers changed from: private */
            public void setButtons(int i, com.moloco.sdk.UserIntent.UserAdInteractionExt.Button button) {
                button.getClass();
                ensureButtonsIsMutable();
                this.buttons_.set(i, button);
            }

            /* JADX INFO: Access modifiers changed from: private */
            public void addButtons(com.moloco.sdk.UserIntent.UserAdInteractionExt.Button button) {
                button.getClass();
                ensureButtonsIsMutable();
                this.buttons_.add(button);
            }

            /* JADX INFO: Access modifiers changed from: private */
            public void addButtons(int i, com.moloco.sdk.UserIntent.UserAdInteractionExt.Button button) {
                button.getClass();
                ensureButtonsIsMutable();
                this.buttons_.add(i, button);
            }

            /* JADX INFO: Access modifiers changed from: private */
            public void addAllButtons(java.lang.Iterable<? extends com.moloco.sdk.UserIntent.UserAdInteractionExt.Button> iterable) {
                ensureButtonsIsMutable();
                com.google.protobuf.AbstractMessageLite.addAll((java.lang.Iterable) iterable, (java.util.List) this.buttons_);
            }

            /* JADX INFO: Access modifiers changed from: private */
            public void clearButtons() {
                this.buttons_ = emptyProtobufList();
            }

            /* JADX INFO: Access modifiers changed from: private */
            public void removeButtons(int i) {
                ensureButtonsIsMutable();
                this.buttons_.remove(i);
            }

            public static com.moloco.sdk.UserIntent.UserAdInteractionExt.ClickInteraction parseFrom(java.nio.ByteBuffer byteBuffer) throws com.google.protobuf.InvalidProtocolBufferException {
                return (com.moloco.sdk.UserIntent.UserAdInteractionExt.ClickInteraction) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
            }

            public static com.moloco.sdk.UserIntent.UserAdInteractionExt.ClickInteraction parseFrom(java.nio.ByteBuffer byteBuffer, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) throws com.google.protobuf.InvalidProtocolBufferException {
                return (com.moloco.sdk.UserIntent.UserAdInteractionExt.ClickInteraction) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
            }

            public static com.moloco.sdk.UserIntent.UserAdInteractionExt.ClickInteraction parseFrom(com.google.protobuf.ByteString byteString) throws com.google.protobuf.InvalidProtocolBufferException {
                return (com.moloco.sdk.UserIntent.UserAdInteractionExt.ClickInteraction) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
            }

            public static com.moloco.sdk.UserIntent.UserAdInteractionExt.ClickInteraction parseFrom(com.google.protobuf.ByteString byteString, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) throws com.google.protobuf.InvalidProtocolBufferException {
                return (com.moloco.sdk.UserIntent.UserAdInteractionExt.ClickInteraction) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
            }

            public static com.moloco.sdk.UserIntent.UserAdInteractionExt.ClickInteraction parseFrom(byte[] bArr) throws com.google.protobuf.InvalidProtocolBufferException {
                return (com.moloco.sdk.UserIntent.UserAdInteractionExt.ClickInteraction) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
            }

            public static com.moloco.sdk.UserIntent.UserAdInteractionExt.ClickInteraction parseFrom(byte[] bArr, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) throws com.google.protobuf.InvalidProtocolBufferException {
                return (com.moloco.sdk.UserIntent.UserAdInteractionExt.ClickInteraction) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
            }

            public static com.moloco.sdk.UserIntent.UserAdInteractionExt.ClickInteraction parseFrom(java.io.InputStream inputStream) throws java.io.IOException {
                return (com.moloco.sdk.UserIntent.UserAdInteractionExt.ClickInteraction) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
            }

            public static com.moloco.sdk.UserIntent.UserAdInteractionExt.ClickInteraction parseFrom(java.io.InputStream inputStream, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) throws java.io.IOException {
                return (com.moloco.sdk.UserIntent.UserAdInteractionExt.ClickInteraction) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
            }

            public static com.moloco.sdk.UserIntent.UserAdInteractionExt.ClickInteraction parseDelimitedFrom(java.io.InputStream inputStream) throws java.io.IOException {
                return (com.moloco.sdk.UserIntent.UserAdInteractionExt.ClickInteraction) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
            }

            public static com.moloco.sdk.UserIntent.UserAdInteractionExt.ClickInteraction parseDelimitedFrom(java.io.InputStream inputStream, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) throws java.io.IOException {
                return (com.moloco.sdk.UserIntent.UserAdInteractionExt.ClickInteraction) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
            }

            public static com.moloco.sdk.UserIntent.UserAdInteractionExt.ClickInteraction parseFrom(com.google.protobuf.CodedInputStream codedInputStream) throws java.io.IOException {
                return (com.moloco.sdk.UserIntent.UserAdInteractionExt.ClickInteraction) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
            }

            public static com.moloco.sdk.UserIntent.UserAdInteractionExt.ClickInteraction parseFrom(com.google.protobuf.CodedInputStream codedInputStream, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) throws java.io.IOException {
                return (com.moloco.sdk.UserIntent.UserAdInteractionExt.ClickInteraction) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
            }

            public static com.moloco.sdk.UserIntent.UserAdInteractionExt.ClickInteraction.Builder newBuilder() {
                return DEFAULT_INSTANCE.createBuilder();
            }

            public static com.moloco.sdk.UserIntent.UserAdInteractionExt.ClickInteraction.Builder newBuilder(com.moloco.sdk.UserIntent.UserAdInteractionExt.ClickInteraction clickInteraction) {
                return DEFAULT_INSTANCE.createBuilder(clickInteraction);
            }

            public static final class Builder extends com.google.protobuf.GeneratedMessageLite.Builder<com.moloco.sdk.UserIntent.UserAdInteractionExt.ClickInteraction, com.moloco.sdk.UserIntent.UserAdInteractionExt.ClickInteraction.Builder> implements com.moloco.sdk.UserIntent.UserAdInteractionExt.ClickInteractionOrBuilder {
                private Builder() {
                    super(com.moloco.sdk.UserIntent.UserAdInteractionExt.ClickInteraction.DEFAULT_INSTANCE);
                }

                @Override // com.moloco.sdk.UserIntent.UserAdInteractionExt.ClickInteractionOrBuilder
                public boolean hasClickPos() {
                    return ((com.moloco.sdk.UserIntent.UserAdInteractionExt.ClickInteraction) this.instance).hasClickPos();
                }

                @Override // com.moloco.sdk.UserIntent.UserAdInteractionExt.ClickInteractionOrBuilder
                public com.moloco.sdk.UserIntent.UserAdInteractionExt.Position getClickPos() {
                    return ((com.moloco.sdk.UserIntent.UserAdInteractionExt.ClickInteraction) this.instance).getClickPos();
                }

                public com.moloco.sdk.UserIntent.UserAdInteractionExt.ClickInteraction.Builder setClickPos(com.moloco.sdk.UserIntent.UserAdInteractionExt.Position position) {
                    copyOnWrite();
                    ((com.moloco.sdk.UserIntent.UserAdInteractionExt.ClickInteraction) this.instance).setClickPos(position);
                    return this;
                }

                public com.moloco.sdk.UserIntent.UserAdInteractionExt.ClickInteraction.Builder setClickPos(com.moloco.sdk.UserIntent.UserAdInteractionExt.Position.Builder builder) {
                    copyOnWrite();
                    ((com.moloco.sdk.UserIntent.UserAdInteractionExt.ClickInteraction) this.instance).setClickPos(builder.build());
                    return this;
                }

                public com.moloco.sdk.UserIntent.UserAdInteractionExt.ClickInteraction.Builder mergeClickPos(com.moloco.sdk.UserIntent.UserAdInteractionExt.Position position) {
                    copyOnWrite();
                    ((com.moloco.sdk.UserIntent.UserAdInteractionExt.ClickInteraction) this.instance).mergeClickPos(position);
                    return this;
                }

                public com.moloco.sdk.UserIntent.UserAdInteractionExt.ClickInteraction.Builder clearClickPos() {
                    copyOnWrite();
                    ((com.moloco.sdk.UserIntent.UserAdInteractionExt.ClickInteraction) this.instance).clearClickPos();
                    return this;
                }

                @Override // com.moloco.sdk.UserIntent.UserAdInteractionExt.ClickInteractionOrBuilder
                public boolean hasScreenSize() {
                    return ((com.moloco.sdk.UserIntent.UserAdInteractionExt.ClickInteraction) this.instance).hasScreenSize();
                }

                @Override // com.moloco.sdk.UserIntent.UserAdInteractionExt.ClickInteractionOrBuilder
                public com.moloco.sdk.UserIntent.UserAdInteractionExt.Size getScreenSize() {
                    return ((com.moloco.sdk.UserIntent.UserAdInteractionExt.ClickInteraction) this.instance).getScreenSize();
                }

                public com.moloco.sdk.UserIntent.UserAdInteractionExt.ClickInteraction.Builder setScreenSize(com.moloco.sdk.UserIntent.UserAdInteractionExt.Size size) {
                    copyOnWrite();
                    ((com.moloco.sdk.UserIntent.UserAdInteractionExt.ClickInteraction) this.instance).setScreenSize(size);
                    return this;
                }

                public com.moloco.sdk.UserIntent.UserAdInteractionExt.ClickInteraction.Builder setScreenSize(com.moloco.sdk.UserIntent.UserAdInteractionExt.Size.Builder builder) {
                    copyOnWrite();
                    ((com.moloco.sdk.UserIntent.UserAdInteractionExt.ClickInteraction) this.instance).setScreenSize(builder.build());
                    return this;
                }

                public com.moloco.sdk.UserIntent.UserAdInteractionExt.ClickInteraction.Builder mergeScreenSize(com.moloco.sdk.UserIntent.UserAdInteractionExt.Size size) {
                    copyOnWrite();
                    ((com.moloco.sdk.UserIntent.UserAdInteractionExt.ClickInteraction) this.instance).mergeScreenSize(size);
                    return this;
                }

                public com.moloco.sdk.UserIntent.UserAdInteractionExt.ClickInteraction.Builder clearScreenSize() {
                    copyOnWrite();
                    ((com.moloco.sdk.UserIntent.UserAdInteractionExt.ClickInteraction) this.instance).clearScreenSize();
                    return this;
                }

                @Override // com.moloco.sdk.UserIntent.UserAdInteractionExt.ClickInteractionOrBuilder
                public boolean hasViewPos() {
                    return ((com.moloco.sdk.UserIntent.UserAdInteractionExt.ClickInteraction) this.instance).hasViewPos();
                }

                @Override // com.moloco.sdk.UserIntent.UserAdInteractionExt.ClickInteractionOrBuilder
                public com.moloco.sdk.UserIntent.UserAdInteractionExt.Position getViewPos() {
                    return ((com.moloco.sdk.UserIntent.UserAdInteractionExt.ClickInteraction) this.instance).getViewPos();
                }

                public com.moloco.sdk.UserIntent.UserAdInteractionExt.ClickInteraction.Builder setViewPos(com.moloco.sdk.UserIntent.UserAdInteractionExt.Position position) {
                    copyOnWrite();
                    ((com.moloco.sdk.UserIntent.UserAdInteractionExt.ClickInteraction) this.instance).setViewPos(position);
                    return this;
                }

                public com.moloco.sdk.UserIntent.UserAdInteractionExt.ClickInteraction.Builder setViewPos(com.moloco.sdk.UserIntent.UserAdInteractionExt.Position.Builder builder) {
                    copyOnWrite();
                    ((com.moloco.sdk.UserIntent.UserAdInteractionExt.ClickInteraction) this.instance).setViewPos(builder.build());
                    return this;
                }

                public com.moloco.sdk.UserIntent.UserAdInteractionExt.ClickInteraction.Builder mergeViewPos(com.moloco.sdk.UserIntent.UserAdInteractionExt.Position position) {
                    copyOnWrite();
                    ((com.moloco.sdk.UserIntent.UserAdInteractionExt.ClickInteraction) this.instance).mergeViewPos(position);
                    return this;
                }

                public com.moloco.sdk.UserIntent.UserAdInteractionExt.ClickInteraction.Builder clearViewPos() {
                    copyOnWrite();
                    ((com.moloco.sdk.UserIntent.UserAdInteractionExt.ClickInteraction) this.instance).clearViewPos();
                    return this;
                }

                @Override // com.moloco.sdk.UserIntent.UserAdInteractionExt.ClickInteractionOrBuilder
                public boolean hasViewSize() {
                    return ((com.moloco.sdk.UserIntent.UserAdInteractionExt.ClickInteraction) this.instance).hasViewSize();
                }

                @Override // com.moloco.sdk.UserIntent.UserAdInteractionExt.ClickInteractionOrBuilder
                public com.moloco.sdk.UserIntent.UserAdInteractionExt.Size getViewSize() {
                    return ((com.moloco.sdk.UserIntent.UserAdInteractionExt.ClickInteraction) this.instance).getViewSize();
                }

                public com.moloco.sdk.UserIntent.UserAdInteractionExt.ClickInteraction.Builder setViewSize(com.moloco.sdk.UserIntent.UserAdInteractionExt.Size size) {
                    copyOnWrite();
                    ((com.moloco.sdk.UserIntent.UserAdInteractionExt.ClickInteraction) this.instance).setViewSize(size);
                    return this;
                }

                public com.moloco.sdk.UserIntent.UserAdInteractionExt.ClickInteraction.Builder setViewSize(com.moloco.sdk.UserIntent.UserAdInteractionExt.Size.Builder builder) {
                    copyOnWrite();
                    ((com.moloco.sdk.UserIntent.UserAdInteractionExt.ClickInteraction) this.instance).setViewSize(builder.build());
                    return this;
                }

                public com.moloco.sdk.UserIntent.UserAdInteractionExt.ClickInteraction.Builder mergeViewSize(com.moloco.sdk.UserIntent.UserAdInteractionExt.Size size) {
                    copyOnWrite();
                    ((com.moloco.sdk.UserIntent.UserAdInteractionExt.ClickInteraction) this.instance).mergeViewSize(size);
                    return this;
                }

                public com.moloco.sdk.UserIntent.UserAdInteractionExt.ClickInteraction.Builder clearViewSize() {
                    copyOnWrite();
                    ((com.moloco.sdk.UserIntent.UserAdInteractionExt.ClickInteraction) this.instance).clearViewSize();
                    return this;
                }

                @Override // com.moloco.sdk.UserIntent.UserAdInteractionExt.ClickInteractionOrBuilder
                public java.util.List<com.moloco.sdk.UserIntent.UserAdInteractionExt.Button> getButtonsList() {
                    return java.util.Collections.unmodifiableList(((com.moloco.sdk.UserIntent.UserAdInteractionExt.ClickInteraction) this.instance).getButtonsList());
                }

                @Override // com.moloco.sdk.UserIntent.UserAdInteractionExt.ClickInteractionOrBuilder
                public int getButtonsCount() {
                    return ((com.moloco.sdk.UserIntent.UserAdInteractionExt.ClickInteraction) this.instance).getButtonsCount();
                }

                @Override // com.moloco.sdk.UserIntent.UserAdInteractionExt.ClickInteractionOrBuilder
                public com.moloco.sdk.UserIntent.UserAdInteractionExt.Button getButtons(int i) {
                    return ((com.moloco.sdk.UserIntent.UserAdInteractionExt.ClickInteraction) this.instance).getButtons(i);
                }

                public com.moloco.sdk.UserIntent.UserAdInteractionExt.ClickInteraction.Builder setButtons(int i, com.moloco.sdk.UserIntent.UserAdInteractionExt.Button button) {
                    copyOnWrite();
                    ((com.moloco.sdk.UserIntent.UserAdInteractionExt.ClickInteraction) this.instance).setButtons(i, button);
                    return this;
                }

                public com.moloco.sdk.UserIntent.UserAdInteractionExt.ClickInteraction.Builder setButtons(int i, com.moloco.sdk.UserIntent.UserAdInteractionExt.Button.Builder builder) {
                    copyOnWrite();
                    ((com.moloco.sdk.UserIntent.UserAdInteractionExt.ClickInteraction) this.instance).setButtons(i, builder.build());
                    return this;
                }

                public com.moloco.sdk.UserIntent.UserAdInteractionExt.ClickInteraction.Builder addButtons(com.moloco.sdk.UserIntent.UserAdInteractionExt.Button button) {
                    copyOnWrite();
                    ((com.moloco.sdk.UserIntent.UserAdInteractionExt.ClickInteraction) this.instance).addButtons(button);
                    return this;
                }

                public com.moloco.sdk.UserIntent.UserAdInteractionExt.ClickInteraction.Builder addButtons(int i, com.moloco.sdk.UserIntent.UserAdInteractionExt.Button button) {
                    copyOnWrite();
                    ((com.moloco.sdk.UserIntent.UserAdInteractionExt.ClickInteraction) this.instance).addButtons(i, button);
                    return this;
                }

                public com.moloco.sdk.UserIntent.UserAdInteractionExt.ClickInteraction.Builder addButtons(com.moloco.sdk.UserIntent.UserAdInteractionExt.Button.Builder builder) {
                    copyOnWrite();
                    ((com.moloco.sdk.UserIntent.UserAdInteractionExt.ClickInteraction) this.instance).addButtons(builder.build());
                    return this;
                }

                public com.moloco.sdk.UserIntent.UserAdInteractionExt.ClickInteraction.Builder addButtons(int i, com.moloco.sdk.UserIntent.UserAdInteractionExt.Button.Builder builder) {
                    copyOnWrite();
                    ((com.moloco.sdk.UserIntent.UserAdInteractionExt.ClickInteraction) this.instance).addButtons(i, builder.build());
                    return this;
                }

                public com.moloco.sdk.UserIntent.UserAdInteractionExt.ClickInteraction.Builder addAllButtons(java.lang.Iterable<? extends com.moloco.sdk.UserIntent.UserAdInteractionExt.Button> iterable) {
                    copyOnWrite();
                    ((com.moloco.sdk.UserIntent.UserAdInteractionExt.ClickInteraction) this.instance).addAllButtons(iterable);
                    return this;
                }

                public com.moloco.sdk.UserIntent.UserAdInteractionExt.ClickInteraction.Builder clearButtons() {
                    copyOnWrite();
                    ((com.moloco.sdk.UserIntent.UserAdInteractionExt.ClickInteraction) this.instance).clearButtons();
                    return this;
                }

                public com.moloco.sdk.UserIntent.UserAdInteractionExt.ClickInteraction.Builder removeButtons(int i) {
                    copyOnWrite();
                    ((com.moloco.sdk.UserIntent.UserAdInteractionExt.ClickInteraction) this.instance).removeButtons(i);
                    return this;
                }
            }

            @Override // com.google.protobuf.GeneratedMessageLite
            protected final java.lang.Object dynamicMethod(com.google.protobuf.GeneratedMessageLite.MethodToInvoke methodToInvoke, java.lang.Object obj, java.lang.Object obj2) {
                switch (com.moloco.sdk.UserIntent.AnonymousClass1.$SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke[methodToInvoke.ordinal()]) {
                    case 1:
                        return new com.moloco.sdk.UserIntent.UserAdInteractionExt.ClickInteraction();
                    case 2:
                        return new com.moloco.sdk.UserIntent.UserAdInteractionExt.ClickInteraction.Builder();
                    case 3:
                        return newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0005\u0000\u0000\u0001\u0005\u0005\u0000\u0001\u0000\u0001\t\u0002\t\u0003\t\u0004\t\u0005\u001b", new java.lang.Object[]{"clickPos_", "screenSize_", "viewPos_", "viewSize_", "buttons_", com.moloco.sdk.UserIntent.UserAdInteractionExt.Button.class});
                    case 4:
                        return DEFAULT_INSTANCE;
                    case 5:
                        com.google.protobuf.Parser<com.moloco.sdk.UserIntent.UserAdInteractionExt.ClickInteraction> parser = PARSER;
                        if (parser == null) {
                            synchronized (com.moloco.sdk.UserIntent.UserAdInteractionExt.ClickInteraction.class) {
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
                com.moloco.sdk.UserIntent.UserAdInteractionExt.ClickInteraction clickInteraction = new com.moloco.sdk.UserIntent.UserAdInteractionExt.ClickInteraction();
                DEFAULT_INSTANCE = clickInteraction;
                com.google.protobuf.GeneratedMessageLite.registerDefaultInstance(com.moloco.sdk.UserIntent.UserAdInteractionExt.ClickInteraction.class, clickInteraction);
            }

            public static com.moloco.sdk.UserIntent.UserAdInteractionExt.ClickInteraction getDefaultInstance() {
                return DEFAULT_INSTANCE;
            }

            public static com.google.protobuf.Parser<com.moloco.sdk.UserIntent.UserAdInteractionExt.ClickInteraction> parser() {
                return DEFAULT_INSTANCE.getParserForType();
            }
        }

        public static final class AppForegroundingInteraction extends com.google.protobuf.GeneratedMessageLite<com.moloco.sdk.UserIntent.UserAdInteractionExt.AppForegroundingInteraction, com.moloco.sdk.UserIntent.UserAdInteractionExt.AppForegroundingInteraction.Builder> implements com.moloco.sdk.UserIntent.UserAdInteractionExt.AppForegroundingInteractionOrBuilder {
            public static final int BG_TS_MS_FIELD_NUMBER = 1;
            private static final com.moloco.sdk.UserIntent.UserAdInteractionExt.AppForegroundingInteraction DEFAULT_INSTANCE;
            private static volatile com.google.protobuf.Parser<com.moloco.sdk.UserIntent.UserAdInteractionExt.AppForegroundingInteraction> PARSER;
            private long bgTsMs_;

            private AppForegroundingInteraction() {
            }

            @Override // com.moloco.sdk.UserIntent.UserAdInteractionExt.AppForegroundingInteractionOrBuilder
            public long getBgTsMs() {
                return this.bgTsMs_;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public void setBgTsMs(long j) {
                this.bgTsMs_ = j;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public void clearBgTsMs() {
                this.bgTsMs_ = 0L;
            }

            public static com.moloco.sdk.UserIntent.UserAdInteractionExt.AppForegroundingInteraction parseFrom(java.nio.ByteBuffer byteBuffer) throws com.google.protobuf.InvalidProtocolBufferException {
                return (com.moloco.sdk.UserIntent.UserAdInteractionExt.AppForegroundingInteraction) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
            }

            public static com.moloco.sdk.UserIntent.UserAdInteractionExt.AppForegroundingInteraction parseFrom(java.nio.ByteBuffer byteBuffer, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) throws com.google.protobuf.InvalidProtocolBufferException {
                return (com.moloco.sdk.UserIntent.UserAdInteractionExt.AppForegroundingInteraction) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
            }

            public static com.moloco.sdk.UserIntent.UserAdInteractionExt.AppForegroundingInteraction parseFrom(com.google.protobuf.ByteString byteString) throws com.google.protobuf.InvalidProtocolBufferException {
                return (com.moloco.sdk.UserIntent.UserAdInteractionExt.AppForegroundingInteraction) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
            }

            public static com.moloco.sdk.UserIntent.UserAdInteractionExt.AppForegroundingInteraction parseFrom(com.google.protobuf.ByteString byteString, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) throws com.google.protobuf.InvalidProtocolBufferException {
                return (com.moloco.sdk.UserIntent.UserAdInteractionExt.AppForegroundingInteraction) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
            }

            public static com.moloco.sdk.UserIntent.UserAdInteractionExt.AppForegroundingInteraction parseFrom(byte[] bArr) throws com.google.protobuf.InvalidProtocolBufferException {
                return (com.moloco.sdk.UserIntent.UserAdInteractionExt.AppForegroundingInteraction) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
            }

            public static com.moloco.sdk.UserIntent.UserAdInteractionExt.AppForegroundingInteraction parseFrom(byte[] bArr, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) throws com.google.protobuf.InvalidProtocolBufferException {
                return (com.moloco.sdk.UserIntent.UserAdInteractionExt.AppForegroundingInteraction) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
            }

            public static com.moloco.sdk.UserIntent.UserAdInteractionExt.AppForegroundingInteraction parseFrom(java.io.InputStream inputStream) throws java.io.IOException {
                return (com.moloco.sdk.UserIntent.UserAdInteractionExt.AppForegroundingInteraction) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
            }

            public static com.moloco.sdk.UserIntent.UserAdInteractionExt.AppForegroundingInteraction parseFrom(java.io.InputStream inputStream, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) throws java.io.IOException {
                return (com.moloco.sdk.UserIntent.UserAdInteractionExt.AppForegroundingInteraction) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
            }

            public static com.moloco.sdk.UserIntent.UserAdInteractionExt.AppForegroundingInteraction parseDelimitedFrom(java.io.InputStream inputStream) throws java.io.IOException {
                return (com.moloco.sdk.UserIntent.UserAdInteractionExt.AppForegroundingInteraction) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
            }

            public static com.moloco.sdk.UserIntent.UserAdInteractionExt.AppForegroundingInteraction parseDelimitedFrom(java.io.InputStream inputStream, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) throws java.io.IOException {
                return (com.moloco.sdk.UserIntent.UserAdInteractionExt.AppForegroundingInteraction) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
            }

            public static com.moloco.sdk.UserIntent.UserAdInteractionExt.AppForegroundingInteraction parseFrom(com.google.protobuf.CodedInputStream codedInputStream) throws java.io.IOException {
                return (com.moloco.sdk.UserIntent.UserAdInteractionExt.AppForegroundingInteraction) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
            }

            public static com.moloco.sdk.UserIntent.UserAdInteractionExt.AppForegroundingInteraction parseFrom(com.google.protobuf.CodedInputStream codedInputStream, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) throws java.io.IOException {
                return (com.moloco.sdk.UserIntent.UserAdInteractionExt.AppForegroundingInteraction) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
            }

            public static com.moloco.sdk.UserIntent.UserAdInteractionExt.AppForegroundingInteraction.Builder newBuilder() {
                return DEFAULT_INSTANCE.createBuilder();
            }

            public static com.moloco.sdk.UserIntent.UserAdInteractionExt.AppForegroundingInteraction.Builder newBuilder(com.moloco.sdk.UserIntent.UserAdInteractionExt.AppForegroundingInteraction appForegroundingInteraction) {
                return DEFAULT_INSTANCE.createBuilder(appForegroundingInteraction);
            }

            public static final class Builder extends com.google.protobuf.GeneratedMessageLite.Builder<com.moloco.sdk.UserIntent.UserAdInteractionExt.AppForegroundingInteraction, com.moloco.sdk.UserIntent.UserAdInteractionExt.AppForegroundingInteraction.Builder> implements com.moloco.sdk.UserIntent.UserAdInteractionExt.AppForegroundingInteractionOrBuilder {
                private Builder() {
                    super(com.moloco.sdk.UserIntent.UserAdInteractionExt.AppForegroundingInteraction.DEFAULT_INSTANCE);
                }

                @Override // com.moloco.sdk.UserIntent.UserAdInteractionExt.AppForegroundingInteractionOrBuilder
                public long getBgTsMs() {
                    return ((com.moloco.sdk.UserIntent.UserAdInteractionExt.AppForegroundingInteraction) this.instance).getBgTsMs();
                }

                public com.moloco.sdk.UserIntent.UserAdInteractionExt.AppForegroundingInteraction.Builder setBgTsMs(long j) {
                    copyOnWrite();
                    ((com.moloco.sdk.UserIntent.UserAdInteractionExt.AppForegroundingInteraction) this.instance).setBgTsMs(j);
                    return this;
                }

                public com.moloco.sdk.UserIntent.UserAdInteractionExt.AppForegroundingInteraction.Builder clearBgTsMs() {
                    copyOnWrite();
                    ((com.moloco.sdk.UserIntent.UserAdInteractionExt.AppForegroundingInteraction) this.instance).clearBgTsMs();
                    return this;
                }
            }

            @Override // com.google.protobuf.GeneratedMessageLite
            protected final java.lang.Object dynamicMethod(com.google.protobuf.GeneratedMessageLite.MethodToInvoke methodToInvoke, java.lang.Object obj, java.lang.Object obj2) {
                switch (com.moloco.sdk.UserIntent.AnonymousClass1.$SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke[methodToInvoke.ordinal()]) {
                    case 1:
                        return new com.moloco.sdk.UserIntent.UserAdInteractionExt.AppForegroundingInteraction();
                    case 2:
                        return new com.moloco.sdk.UserIntent.UserAdInteractionExt.AppForegroundingInteraction.Builder();
                    case 3:
                        return newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0000\u0000\u0001\u0002", new java.lang.Object[]{"bgTsMs_"});
                    case 4:
                        return DEFAULT_INSTANCE;
                    case 5:
                        com.google.protobuf.Parser<com.moloco.sdk.UserIntent.UserAdInteractionExt.AppForegroundingInteraction> parser = PARSER;
                        if (parser == null) {
                            synchronized (com.moloco.sdk.UserIntent.UserAdInteractionExt.AppForegroundingInteraction.class) {
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
                com.moloco.sdk.UserIntent.UserAdInteractionExt.AppForegroundingInteraction appForegroundingInteraction = new com.moloco.sdk.UserIntent.UserAdInteractionExt.AppForegroundingInteraction();
                DEFAULT_INSTANCE = appForegroundingInteraction;
                com.google.protobuf.GeneratedMessageLite.registerDefaultInstance(com.moloco.sdk.UserIntent.UserAdInteractionExt.AppForegroundingInteraction.class, appForegroundingInteraction);
            }

            public static com.moloco.sdk.UserIntent.UserAdInteractionExt.AppForegroundingInteraction getDefaultInstance() {
                return DEFAULT_INSTANCE;
            }

            public static com.google.protobuf.Parser<com.moloco.sdk.UserIntent.UserAdInteractionExt.AppForegroundingInteraction> parser() {
                return DEFAULT_INSTANCE.getParserForType();
            }
        }

        public static final class AppBackgroundingInteraction extends com.google.protobuf.GeneratedMessageLite<com.moloco.sdk.UserIntent.UserAdInteractionExt.AppBackgroundingInteraction, com.moloco.sdk.UserIntent.UserAdInteractionExt.AppBackgroundingInteraction.Builder> implements com.moloco.sdk.UserIntent.UserAdInteractionExt.AppBackgroundingInteractionOrBuilder {
            private static final com.moloco.sdk.UserIntent.UserAdInteractionExt.AppBackgroundingInteraction DEFAULT_INSTANCE;
            private static volatile com.google.protobuf.Parser<com.moloco.sdk.UserIntent.UserAdInteractionExt.AppBackgroundingInteraction> PARSER;

            private AppBackgroundingInteraction() {
            }

            public static com.moloco.sdk.UserIntent.UserAdInteractionExt.AppBackgroundingInteraction parseFrom(java.nio.ByteBuffer byteBuffer) throws com.google.protobuf.InvalidProtocolBufferException {
                return (com.moloco.sdk.UserIntent.UserAdInteractionExt.AppBackgroundingInteraction) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
            }

            public static com.moloco.sdk.UserIntent.UserAdInteractionExt.AppBackgroundingInteraction parseFrom(java.nio.ByteBuffer byteBuffer, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) throws com.google.protobuf.InvalidProtocolBufferException {
                return (com.moloco.sdk.UserIntent.UserAdInteractionExt.AppBackgroundingInteraction) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
            }

            public static com.moloco.sdk.UserIntent.UserAdInteractionExt.AppBackgroundingInteraction parseFrom(com.google.protobuf.ByteString byteString) throws com.google.protobuf.InvalidProtocolBufferException {
                return (com.moloco.sdk.UserIntent.UserAdInteractionExt.AppBackgroundingInteraction) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
            }

            public static com.moloco.sdk.UserIntent.UserAdInteractionExt.AppBackgroundingInteraction parseFrom(com.google.protobuf.ByteString byteString, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) throws com.google.protobuf.InvalidProtocolBufferException {
                return (com.moloco.sdk.UserIntent.UserAdInteractionExt.AppBackgroundingInteraction) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
            }

            public static com.moloco.sdk.UserIntent.UserAdInteractionExt.AppBackgroundingInteraction parseFrom(byte[] bArr) throws com.google.protobuf.InvalidProtocolBufferException {
                return (com.moloco.sdk.UserIntent.UserAdInteractionExt.AppBackgroundingInteraction) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
            }

            public static com.moloco.sdk.UserIntent.UserAdInteractionExt.AppBackgroundingInteraction parseFrom(byte[] bArr, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) throws com.google.protobuf.InvalidProtocolBufferException {
                return (com.moloco.sdk.UserIntent.UserAdInteractionExt.AppBackgroundingInteraction) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
            }

            public static com.moloco.sdk.UserIntent.UserAdInteractionExt.AppBackgroundingInteraction parseFrom(java.io.InputStream inputStream) throws java.io.IOException {
                return (com.moloco.sdk.UserIntent.UserAdInteractionExt.AppBackgroundingInteraction) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
            }

            public static com.moloco.sdk.UserIntent.UserAdInteractionExt.AppBackgroundingInteraction parseFrom(java.io.InputStream inputStream, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) throws java.io.IOException {
                return (com.moloco.sdk.UserIntent.UserAdInteractionExt.AppBackgroundingInteraction) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
            }

            public static com.moloco.sdk.UserIntent.UserAdInteractionExt.AppBackgroundingInteraction parseDelimitedFrom(java.io.InputStream inputStream) throws java.io.IOException {
                return (com.moloco.sdk.UserIntent.UserAdInteractionExt.AppBackgroundingInteraction) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
            }

            public static com.moloco.sdk.UserIntent.UserAdInteractionExt.AppBackgroundingInteraction parseDelimitedFrom(java.io.InputStream inputStream, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) throws java.io.IOException {
                return (com.moloco.sdk.UserIntent.UserAdInteractionExt.AppBackgroundingInteraction) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
            }

            public static com.moloco.sdk.UserIntent.UserAdInteractionExt.AppBackgroundingInteraction parseFrom(com.google.protobuf.CodedInputStream codedInputStream) throws java.io.IOException {
                return (com.moloco.sdk.UserIntent.UserAdInteractionExt.AppBackgroundingInteraction) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
            }

            public static com.moloco.sdk.UserIntent.UserAdInteractionExt.AppBackgroundingInteraction parseFrom(com.google.protobuf.CodedInputStream codedInputStream, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) throws java.io.IOException {
                return (com.moloco.sdk.UserIntent.UserAdInteractionExt.AppBackgroundingInteraction) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
            }

            public static com.moloco.sdk.UserIntent.UserAdInteractionExt.AppBackgroundingInteraction.Builder newBuilder() {
                return DEFAULT_INSTANCE.createBuilder();
            }

            public static com.moloco.sdk.UserIntent.UserAdInteractionExt.AppBackgroundingInteraction.Builder newBuilder(com.moloco.sdk.UserIntent.UserAdInteractionExt.AppBackgroundingInteraction appBackgroundingInteraction) {
                return DEFAULT_INSTANCE.createBuilder(appBackgroundingInteraction);
            }

            public static final class Builder extends com.google.protobuf.GeneratedMessageLite.Builder<com.moloco.sdk.UserIntent.UserAdInteractionExt.AppBackgroundingInteraction, com.moloco.sdk.UserIntent.UserAdInteractionExt.AppBackgroundingInteraction.Builder> implements com.moloco.sdk.UserIntent.UserAdInteractionExt.AppBackgroundingInteractionOrBuilder {
                private Builder() {
                    super(com.moloco.sdk.UserIntent.UserAdInteractionExt.AppBackgroundingInteraction.DEFAULT_INSTANCE);
                }
            }

            @Override // com.google.protobuf.GeneratedMessageLite
            protected final java.lang.Object dynamicMethod(com.google.protobuf.GeneratedMessageLite.MethodToInvoke methodToInvoke, java.lang.Object obj, java.lang.Object obj2) {
                switch (com.moloco.sdk.UserIntent.AnonymousClass1.$SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke[methodToInvoke.ordinal()]) {
                    case 1:
                        return new com.moloco.sdk.UserIntent.UserAdInteractionExt.AppBackgroundingInteraction();
                    case 2:
                        return new com.moloco.sdk.UserIntent.UserAdInteractionExt.AppBackgroundingInteraction.Builder();
                    case 3:
                        return newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0000", null);
                    case 4:
                        return DEFAULT_INSTANCE;
                    case 5:
                        com.google.protobuf.Parser<com.moloco.sdk.UserIntent.UserAdInteractionExt.AppBackgroundingInteraction> parser = PARSER;
                        if (parser == null) {
                            synchronized (com.moloco.sdk.UserIntent.UserAdInteractionExt.AppBackgroundingInteraction.class) {
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
                com.moloco.sdk.UserIntent.UserAdInteractionExt.AppBackgroundingInteraction appBackgroundingInteraction = new com.moloco.sdk.UserIntent.UserAdInteractionExt.AppBackgroundingInteraction();
                DEFAULT_INSTANCE = appBackgroundingInteraction;
                com.google.protobuf.GeneratedMessageLite.registerDefaultInstance(com.moloco.sdk.UserIntent.UserAdInteractionExt.AppBackgroundingInteraction.class, appBackgroundingInteraction);
            }

            public static com.moloco.sdk.UserIntent.UserAdInteractionExt.AppBackgroundingInteraction getDefaultInstance() {
                return DEFAULT_INSTANCE;
            }

            public static com.google.protobuf.Parser<com.moloco.sdk.UserIntent.UserAdInteractionExt.AppBackgroundingInteraction> parser() {
                return DEFAULT_INSTANCE.getParserForType();
            }
        }

        public enum InfoExtCase {
            IMP_INTERACTION(100),
            CLICK_INTERACTION(101),
            APP_FOREGROUNDING_INTERACTION(102),
            APP_BACKGROUNDING_INTERACTION(103),
            INFOEXT_NOT_SET(0);

            private final int value;

            InfoExtCase(int i) {
                this.value = i;
            }

            @java.lang.Deprecated
            public static com.moloco.sdk.UserIntent.UserAdInteractionExt.InfoExtCase valueOf(int i) {
                return forNumber(i);
            }

            public static com.moloco.sdk.UserIntent.UserAdInteractionExt.InfoExtCase forNumber(int i) {
                if (i != 0) {
                    switch (i) {
                        case 100:
                            return IMP_INTERACTION;
                        case 101:
                            return CLICK_INTERACTION;
                        case 102:
                            return APP_FOREGROUNDING_INTERACTION;
                        case 103:
                            return APP_BACKGROUNDING_INTERACTION;
                        default:
                            return null;
                    }
                }
                return INFOEXT_NOT_SET;
            }

            public int getNumber() {
                return this.value;
            }
        }

        @Override // com.moloco.sdk.UserIntent.UserAdInteractionExtOrBuilder
        public com.moloco.sdk.UserIntent.UserAdInteractionExt.InfoExtCase getInfoExtCase() {
            return com.moloco.sdk.UserIntent.UserAdInteractionExt.InfoExtCase.forNumber(this.infoExtCase_);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearInfoExt() {
            this.infoExtCase_ = 0;
            this.infoExt_ = null;
        }

        @Override // com.moloco.sdk.UserIntent.UserAdInteractionExtOrBuilder
        public java.lang.String getMref() {
            return this.mref_;
        }

        @Override // com.moloco.sdk.UserIntent.UserAdInteractionExtOrBuilder
        public com.google.protobuf.ByteString getMrefBytes() {
            return com.google.protobuf.ByteString.copyFromUtf8(this.mref_);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setMref(java.lang.String str) {
            str.getClass();
            this.mref_ = str;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearMref() {
            this.mref_ = getDefaultInstance().getMref();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setMrefBytes(com.google.protobuf.ByteString byteString) {
            checkByteStringIsUtf8(byteString);
            this.mref_ = byteString.toStringUtf8();
        }

        @Override // com.moloco.sdk.UserIntent.UserAdInteractionExtOrBuilder
        public long getClientTimestamp() {
            return this.clientTimestamp_;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setClientTimestamp(long j) {
            this.clientTimestamp_ = j;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearClientTimestamp() {
            this.clientTimestamp_ = 0L;
        }

        @Override // com.moloco.sdk.UserIntent.UserAdInteractionExtOrBuilder
        public java.lang.String getAdvertisingId() {
            return this.advertisingId_;
        }

        @Override // com.moloco.sdk.UserIntent.UserAdInteractionExtOrBuilder
        public com.google.protobuf.ByteString getAdvertisingIdBytes() {
            return com.google.protobuf.ByteString.copyFromUtf8(this.advertisingId_);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setAdvertisingId(java.lang.String str) {
            str.getClass();
            this.advertisingId_ = str;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearAdvertisingId() {
            this.advertisingId_ = getDefaultInstance().getAdvertisingId();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setAdvertisingIdBytes(com.google.protobuf.ByteString byteString) {
            checkByteStringIsUtf8(byteString);
            this.advertisingId_ = byteString.toStringUtf8();
        }

        @Override // com.moloco.sdk.UserIntent.UserAdInteractionExtOrBuilder
        public boolean hasDevice() {
            return this.device_ != null;
        }

        @Override // com.moloco.sdk.UserIntent.UserAdInteractionExtOrBuilder
        public com.moloco.sdk.UserIntent.UserAdInteractionExt.Device getDevice() {
            com.moloco.sdk.UserIntent.UserAdInteractionExt.Device device = this.device_;
            return device == null ? com.moloco.sdk.UserIntent.UserAdInteractionExt.Device.getDefaultInstance() : device;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setDevice(com.moloco.sdk.UserIntent.UserAdInteractionExt.Device device) {
            device.getClass();
            this.device_ = device;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void mergeDevice(com.moloco.sdk.UserIntent.UserAdInteractionExt.Device device) {
            device.getClass();
            com.moloco.sdk.UserIntent.UserAdInteractionExt.Device device2 = this.device_;
            if (device2 != null && device2 != com.moloco.sdk.UserIntent.UserAdInteractionExt.Device.getDefaultInstance()) {
                this.device_ = com.moloco.sdk.UserIntent.UserAdInteractionExt.Device.newBuilder(this.device_).mergeFrom((com.moloco.sdk.UserIntent.UserAdInteractionExt.Device.Builder) device).buildPartial();
            } else {
                this.device_ = device;
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearDevice() {
            this.device_ = null;
        }

        @Override // com.moloco.sdk.UserIntent.UserAdInteractionExtOrBuilder
        public boolean hasApp() {
            return this.app_ != null;
        }

        @Override // com.moloco.sdk.UserIntent.UserAdInteractionExtOrBuilder
        public com.moloco.sdk.UserIntent.UserAdInteractionExt.App getApp() {
            com.moloco.sdk.UserIntent.UserAdInteractionExt.App app = this.app_;
            return app == null ? com.moloco.sdk.UserIntent.UserAdInteractionExt.App.getDefaultInstance() : app;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setApp(com.moloco.sdk.UserIntent.UserAdInteractionExt.App app) {
            app.getClass();
            this.app_ = app;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void mergeApp(com.moloco.sdk.UserIntent.UserAdInteractionExt.App app) {
            app.getClass();
            com.moloco.sdk.UserIntent.UserAdInteractionExt.App app2 = this.app_;
            if (app2 != null && app2 != com.moloco.sdk.UserIntent.UserAdInteractionExt.App.getDefaultInstance()) {
                this.app_ = com.moloco.sdk.UserIntent.UserAdInteractionExt.App.newBuilder(this.app_).mergeFrom((com.moloco.sdk.UserIntent.UserAdInteractionExt.App.Builder) app).buildPartial();
            } else {
                this.app_ = app;
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearApp() {
            this.app_ = null;
        }

        @Override // com.moloco.sdk.UserIntent.UserAdInteractionExtOrBuilder
        public boolean hasNetwork() {
            return this.network_ != null;
        }

        @Override // com.moloco.sdk.UserIntent.UserAdInteractionExtOrBuilder
        public com.moloco.sdk.UserIntent.UserAdInteractionExt.Network getNetwork() {
            com.moloco.sdk.UserIntent.UserAdInteractionExt.Network network = this.network_;
            return network == null ? com.moloco.sdk.UserIntent.UserAdInteractionExt.Network.getDefaultInstance() : network;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setNetwork(com.moloco.sdk.UserIntent.UserAdInteractionExt.Network network) {
            network.getClass();
            this.network_ = network;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void mergeNetwork(com.moloco.sdk.UserIntent.UserAdInteractionExt.Network network) {
            network.getClass();
            com.moloco.sdk.UserIntent.UserAdInteractionExt.Network network2 = this.network_;
            if (network2 != null && network2 != com.moloco.sdk.UserIntent.UserAdInteractionExt.Network.getDefaultInstance()) {
                this.network_ = com.moloco.sdk.UserIntent.UserAdInteractionExt.Network.newBuilder(this.network_).mergeFrom((com.moloco.sdk.UserIntent.UserAdInteractionExt.Network.Builder) network).buildPartial();
            } else {
                this.network_ = network;
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearNetwork() {
            this.network_ = null;
        }

        @Override // com.moloco.sdk.UserIntent.UserAdInteractionExtOrBuilder
        public boolean hasSdk() {
            return this.sdk_ != null;
        }

        @Override // com.moloco.sdk.UserIntent.UserAdInteractionExtOrBuilder
        public com.moloco.sdk.UserIntent.UserAdInteractionExt.MolocoSDK getSdk() {
            com.moloco.sdk.UserIntent.UserAdInteractionExt.MolocoSDK molocoSDK = this.sdk_;
            return molocoSDK == null ? com.moloco.sdk.UserIntent.UserAdInteractionExt.MolocoSDK.getDefaultInstance() : molocoSDK;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setSdk(com.moloco.sdk.UserIntent.UserAdInteractionExt.MolocoSDK molocoSDK) {
            molocoSDK.getClass();
            this.sdk_ = molocoSDK;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void mergeSdk(com.moloco.sdk.UserIntent.UserAdInteractionExt.MolocoSDK molocoSDK) {
            molocoSDK.getClass();
            com.moloco.sdk.UserIntent.UserAdInteractionExt.MolocoSDK molocoSDK2 = this.sdk_;
            if (molocoSDK2 != null && molocoSDK2 != com.moloco.sdk.UserIntent.UserAdInteractionExt.MolocoSDK.getDefaultInstance()) {
                this.sdk_ = com.moloco.sdk.UserIntent.UserAdInteractionExt.MolocoSDK.newBuilder(this.sdk_).mergeFrom((com.moloco.sdk.UserIntent.UserAdInteractionExt.MolocoSDK.Builder) molocoSDK).buildPartial();
            } else {
                this.sdk_ = molocoSDK;
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearSdk() {
            this.sdk_ = null;
        }

        @Override // com.moloco.sdk.UserIntent.UserAdInteractionExtOrBuilder
        public boolean hasImpInteraction() {
            return this.infoExtCase_ == 100;
        }

        @Override // com.moloco.sdk.UserIntent.UserAdInteractionExtOrBuilder
        public com.moloco.sdk.UserIntent.UserAdInteractionExt.ImpressionInteraction getImpInteraction() {
            if (this.infoExtCase_ == 100) {
                return (com.moloco.sdk.UserIntent.UserAdInteractionExt.ImpressionInteraction) this.infoExt_;
            }
            return com.moloco.sdk.UserIntent.UserAdInteractionExt.ImpressionInteraction.getDefaultInstance();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setImpInteraction(com.moloco.sdk.UserIntent.UserAdInteractionExt.ImpressionInteraction impressionInteraction) {
            impressionInteraction.getClass();
            this.infoExt_ = impressionInteraction;
            this.infoExtCase_ = 100;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void mergeImpInteraction(com.moloco.sdk.UserIntent.UserAdInteractionExt.ImpressionInteraction impressionInteraction) {
            impressionInteraction.getClass();
            if (this.infoExtCase_ == 100 && this.infoExt_ != com.moloco.sdk.UserIntent.UserAdInteractionExt.ImpressionInteraction.getDefaultInstance()) {
                this.infoExt_ = com.moloco.sdk.UserIntent.UserAdInteractionExt.ImpressionInteraction.newBuilder((com.moloco.sdk.UserIntent.UserAdInteractionExt.ImpressionInteraction) this.infoExt_).mergeFrom((com.moloco.sdk.UserIntent.UserAdInteractionExt.ImpressionInteraction.Builder) impressionInteraction).buildPartial();
            } else {
                this.infoExt_ = impressionInteraction;
            }
            this.infoExtCase_ = 100;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearImpInteraction() {
            if (this.infoExtCase_ == 100) {
                this.infoExtCase_ = 0;
                this.infoExt_ = null;
            }
        }

        @Override // com.moloco.sdk.UserIntent.UserAdInteractionExtOrBuilder
        public boolean hasClickInteraction() {
            return this.infoExtCase_ == 101;
        }

        @Override // com.moloco.sdk.UserIntent.UserAdInteractionExtOrBuilder
        public com.moloco.sdk.UserIntent.UserAdInteractionExt.ClickInteraction getClickInteraction() {
            if (this.infoExtCase_ == 101) {
                return (com.moloco.sdk.UserIntent.UserAdInteractionExt.ClickInteraction) this.infoExt_;
            }
            return com.moloco.sdk.UserIntent.UserAdInteractionExt.ClickInteraction.getDefaultInstance();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setClickInteraction(com.moloco.sdk.UserIntent.UserAdInteractionExt.ClickInteraction clickInteraction) {
            clickInteraction.getClass();
            this.infoExt_ = clickInteraction;
            this.infoExtCase_ = 101;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void mergeClickInteraction(com.moloco.sdk.UserIntent.UserAdInteractionExt.ClickInteraction clickInteraction) {
            clickInteraction.getClass();
            if (this.infoExtCase_ == 101 && this.infoExt_ != com.moloco.sdk.UserIntent.UserAdInteractionExt.ClickInteraction.getDefaultInstance()) {
                this.infoExt_ = com.moloco.sdk.UserIntent.UserAdInteractionExt.ClickInteraction.newBuilder((com.moloco.sdk.UserIntent.UserAdInteractionExt.ClickInteraction) this.infoExt_).mergeFrom((com.moloco.sdk.UserIntent.UserAdInteractionExt.ClickInteraction.Builder) clickInteraction).buildPartial();
            } else {
                this.infoExt_ = clickInteraction;
            }
            this.infoExtCase_ = 101;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearClickInteraction() {
            if (this.infoExtCase_ == 101) {
                this.infoExtCase_ = 0;
                this.infoExt_ = null;
            }
        }

        @Override // com.moloco.sdk.UserIntent.UserAdInteractionExtOrBuilder
        public boolean hasAppForegroundingInteraction() {
            return this.infoExtCase_ == 102;
        }

        @Override // com.moloco.sdk.UserIntent.UserAdInteractionExtOrBuilder
        public com.moloco.sdk.UserIntent.UserAdInteractionExt.AppForegroundingInteraction getAppForegroundingInteraction() {
            if (this.infoExtCase_ == 102) {
                return (com.moloco.sdk.UserIntent.UserAdInteractionExt.AppForegroundingInteraction) this.infoExt_;
            }
            return com.moloco.sdk.UserIntent.UserAdInteractionExt.AppForegroundingInteraction.getDefaultInstance();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setAppForegroundingInteraction(com.moloco.sdk.UserIntent.UserAdInteractionExt.AppForegroundingInteraction appForegroundingInteraction) {
            appForegroundingInteraction.getClass();
            this.infoExt_ = appForegroundingInteraction;
            this.infoExtCase_ = 102;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void mergeAppForegroundingInteraction(com.moloco.sdk.UserIntent.UserAdInteractionExt.AppForegroundingInteraction appForegroundingInteraction) {
            appForegroundingInteraction.getClass();
            if (this.infoExtCase_ == 102 && this.infoExt_ != com.moloco.sdk.UserIntent.UserAdInteractionExt.AppForegroundingInteraction.getDefaultInstance()) {
                this.infoExt_ = com.moloco.sdk.UserIntent.UserAdInteractionExt.AppForegroundingInteraction.newBuilder((com.moloco.sdk.UserIntent.UserAdInteractionExt.AppForegroundingInteraction) this.infoExt_).mergeFrom((com.moloco.sdk.UserIntent.UserAdInteractionExt.AppForegroundingInteraction.Builder) appForegroundingInteraction).buildPartial();
            } else {
                this.infoExt_ = appForegroundingInteraction;
            }
            this.infoExtCase_ = 102;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearAppForegroundingInteraction() {
            if (this.infoExtCase_ == 102) {
                this.infoExtCase_ = 0;
                this.infoExt_ = null;
            }
        }

        @Override // com.moloco.sdk.UserIntent.UserAdInteractionExtOrBuilder
        public boolean hasAppBackgroundingInteraction() {
            return this.infoExtCase_ == 103;
        }

        @Override // com.moloco.sdk.UserIntent.UserAdInteractionExtOrBuilder
        public com.moloco.sdk.UserIntent.UserAdInteractionExt.AppBackgroundingInteraction getAppBackgroundingInteraction() {
            if (this.infoExtCase_ == 103) {
                return (com.moloco.sdk.UserIntent.UserAdInteractionExt.AppBackgroundingInteraction) this.infoExt_;
            }
            return com.moloco.sdk.UserIntent.UserAdInteractionExt.AppBackgroundingInteraction.getDefaultInstance();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setAppBackgroundingInteraction(com.moloco.sdk.UserIntent.UserAdInteractionExt.AppBackgroundingInteraction appBackgroundingInteraction) {
            appBackgroundingInteraction.getClass();
            this.infoExt_ = appBackgroundingInteraction;
            this.infoExtCase_ = 103;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void mergeAppBackgroundingInteraction(com.moloco.sdk.UserIntent.UserAdInteractionExt.AppBackgroundingInteraction appBackgroundingInteraction) {
            appBackgroundingInteraction.getClass();
            if (this.infoExtCase_ == 103 && this.infoExt_ != com.moloco.sdk.UserIntent.UserAdInteractionExt.AppBackgroundingInteraction.getDefaultInstance()) {
                this.infoExt_ = com.moloco.sdk.UserIntent.UserAdInteractionExt.AppBackgroundingInteraction.newBuilder((com.moloco.sdk.UserIntent.UserAdInteractionExt.AppBackgroundingInteraction) this.infoExt_).mergeFrom((com.moloco.sdk.UserIntent.UserAdInteractionExt.AppBackgroundingInteraction.Builder) appBackgroundingInteraction).buildPartial();
            } else {
                this.infoExt_ = appBackgroundingInteraction;
            }
            this.infoExtCase_ = 103;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearAppBackgroundingInteraction() {
            if (this.infoExtCase_ == 103) {
                this.infoExtCase_ = 0;
                this.infoExt_ = null;
            }
        }

        public static com.moloco.sdk.UserIntent.UserAdInteractionExt parseFrom(java.nio.ByteBuffer byteBuffer) throws com.google.protobuf.InvalidProtocolBufferException {
            return (com.moloco.sdk.UserIntent.UserAdInteractionExt) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
        }

        public static com.moloco.sdk.UserIntent.UserAdInteractionExt parseFrom(java.nio.ByteBuffer byteBuffer, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) throws com.google.protobuf.InvalidProtocolBufferException {
            return (com.moloco.sdk.UserIntent.UserAdInteractionExt) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
        }

        public static com.moloco.sdk.UserIntent.UserAdInteractionExt parseFrom(com.google.protobuf.ByteString byteString) throws com.google.protobuf.InvalidProtocolBufferException {
            return (com.moloco.sdk.UserIntent.UserAdInteractionExt) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
        }

        public static com.moloco.sdk.UserIntent.UserAdInteractionExt parseFrom(com.google.protobuf.ByteString byteString, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) throws com.google.protobuf.InvalidProtocolBufferException {
            return (com.moloco.sdk.UserIntent.UserAdInteractionExt) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
        }

        public static com.moloco.sdk.UserIntent.UserAdInteractionExt parseFrom(byte[] bArr) throws com.google.protobuf.InvalidProtocolBufferException {
            return (com.moloco.sdk.UserIntent.UserAdInteractionExt) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
        }

        public static com.moloco.sdk.UserIntent.UserAdInteractionExt parseFrom(byte[] bArr, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) throws com.google.protobuf.InvalidProtocolBufferException {
            return (com.moloco.sdk.UserIntent.UserAdInteractionExt) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
        }

        public static com.moloco.sdk.UserIntent.UserAdInteractionExt parseFrom(java.io.InputStream inputStream) throws java.io.IOException {
            return (com.moloco.sdk.UserIntent.UserAdInteractionExt) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static com.moloco.sdk.UserIntent.UserAdInteractionExt parseFrom(java.io.InputStream inputStream, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) throws java.io.IOException {
            return (com.moloco.sdk.UserIntent.UserAdInteractionExt) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
        }

        public static com.moloco.sdk.UserIntent.UserAdInteractionExt parseDelimitedFrom(java.io.InputStream inputStream) throws java.io.IOException {
            return (com.moloco.sdk.UserIntent.UserAdInteractionExt) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static com.moloco.sdk.UserIntent.UserAdInteractionExt parseDelimitedFrom(java.io.InputStream inputStream, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) throws java.io.IOException {
            return (com.moloco.sdk.UserIntent.UserAdInteractionExt) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
        }

        public static com.moloco.sdk.UserIntent.UserAdInteractionExt parseFrom(com.google.protobuf.CodedInputStream codedInputStream) throws java.io.IOException {
            return (com.moloco.sdk.UserIntent.UserAdInteractionExt) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
        }

        public static com.moloco.sdk.UserIntent.UserAdInteractionExt parseFrom(com.google.protobuf.CodedInputStream codedInputStream, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) throws java.io.IOException {
            return (com.moloco.sdk.UserIntent.UserAdInteractionExt) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
        }

        public static com.moloco.sdk.UserIntent.UserAdInteractionExt.Builder newBuilder() {
            return DEFAULT_INSTANCE.createBuilder();
        }

        public static com.moloco.sdk.UserIntent.UserAdInteractionExt.Builder newBuilder(com.moloco.sdk.UserIntent.UserAdInteractionExt userAdInteractionExt) {
            return DEFAULT_INSTANCE.createBuilder(userAdInteractionExt);
        }

        public static final class Builder extends com.google.protobuf.GeneratedMessageLite.Builder<com.moloco.sdk.UserIntent.UserAdInteractionExt, com.moloco.sdk.UserIntent.UserAdInteractionExt.Builder> implements com.moloco.sdk.UserIntent.UserAdInteractionExtOrBuilder {
            private Builder() {
                super(com.moloco.sdk.UserIntent.UserAdInteractionExt.DEFAULT_INSTANCE);
            }

            @Override // com.moloco.sdk.UserIntent.UserAdInteractionExtOrBuilder
            public com.moloco.sdk.UserIntent.UserAdInteractionExt.InfoExtCase getInfoExtCase() {
                return ((com.moloco.sdk.UserIntent.UserAdInteractionExt) this.instance).getInfoExtCase();
            }

            public com.moloco.sdk.UserIntent.UserAdInteractionExt.Builder clearInfoExt() {
                copyOnWrite();
                ((com.moloco.sdk.UserIntent.UserAdInteractionExt) this.instance).clearInfoExt();
                return this;
            }

            @Override // com.moloco.sdk.UserIntent.UserAdInteractionExtOrBuilder
            public java.lang.String getMref() {
                return ((com.moloco.sdk.UserIntent.UserAdInteractionExt) this.instance).getMref();
            }

            @Override // com.moloco.sdk.UserIntent.UserAdInteractionExtOrBuilder
            public com.google.protobuf.ByteString getMrefBytes() {
                return ((com.moloco.sdk.UserIntent.UserAdInteractionExt) this.instance).getMrefBytes();
            }

            public com.moloco.sdk.UserIntent.UserAdInteractionExt.Builder setMref(java.lang.String str) {
                copyOnWrite();
                ((com.moloco.sdk.UserIntent.UserAdInteractionExt) this.instance).setMref(str);
                return this;
            }

            public com.moloco.sdk.UserIntent.UserAdInteractionExt.Builder clearMref() {
                copyOnWrite();
                ((com.moloco.sdk.UserIntent.UserAdInteractionExt) this.instance).clearMref();
                return this;
            }

            public com.moloco.sdk.UserIntent.UserAdInteractionExt.Builder setMrefBytes(com.google.protobuf.ByteString byteString) {
                copyOnWrite();
                ((com.moloco.sdk.UserIntent.UserAdInteractionExt) this.instance).setMrefBytes(byteString);
                return this;
            }

            @Override // com.moloco.sdk.UserIntent.UserAdInteractionExtOrBuilder
            public long getClientTimestamp() {
                return ((com.moloco.sdk.UserIntent.UserAdInteractionExt) this.instance).getClientTimestamp();
            }

            public com.moloco.sdk.UserIntent.UserAdInteractionExt.Builder setClientTimestamp(long j) {
                copyOnWrite();
                ((com.moloco.sdk.UserIntent.UserAdInteractionExt) this.instance).setClientTimestamp(j);
                return this;
            }

            public com.moloco.sdk.UserIntent.UserAdInteractionExt.Builder clearClientTimestamp() {
                copyOnWrite();
                ((com.moloco.sdk.UserIntent.UserAdInteractionExt) this.instance).clearClientTimestamp();
                return this;
            }

            @Override // com.moloco.sdk.UserIntent.UserAdInteractionExtOrBuilder
            public java.lang.String getAdvertisingId() {
                return ((com.moloco.sdk.UserIntent.UserAdInteractionExt) this.instance).getAdvertisingId();
            }

            @Override // com.moloco.sdk.UserIntent.UserAdInteractionExtOrBuilder
            public com.google.protobuf.ByteString getAdvertisingIdBytes() {
                return ((com.moloco.sdk.UserIntent.UserAdInteractionExt) this.instance).getAdvertisingIdBytes();
            }

            public com.moloco.sdk.UserIntent.UserAdInteractionExt.Builder setAdvertisingId(java.lang.String str) {
                copyOnWrite();
                ((com.moloco.sdk.UserIntent.UserAdInteractionExt) this.instance).setAdvertisingId(str);
                return this;
            }

            public com.moloco.sdk.UserIntent.UserAdInteractionExt.Builder clearAdvertisingId() {
                copyOnWrite();
                ((com.moloco.sdk.UserIntent.UserAdInteractionExt) this.instance).clearAdvertisingId();
                return this;
            }

            public com.moloco.sdk.UserIntent.UserAdInteractionExt.Builder setAdvertisingIdBytes(com.google.protobuf.ByteString byteString) {
                copyOnWrite();
                ((com.moloco.sdk.UserIntent.UserAdInteractionExt) this.instance).setAdvertisingIdBytes(byteString);
                return this;
            }

            @Override // com.moloco.sdk.UserIntent.UserAdInteractionExtOrBuilder
            public boolean hasDevice() {
                return ((com.moloco.sdk.UserIntent.UserAdInteractionExt) this.instance).hasDevice();
            }

            @Override // com.moloco.sdk.UserIntent.UserAdInteractionExtOrBuilder
            public com.moloco.sdk.UserIntent.UserAdInteractionExt.Device getDevice() {
                return ((com.moloco.sdk.UserIntent.UserAdInteractionExt) this.instance).getDevice();
            }

            public com.moloco.sdk.UserIntent.UserAdInteractionExt.Builder setDevice(com.moloco.sdk.UserIntent.UserAdInteractionExt.Device device) {
                copyOnWrite();
                ((com.moloco.sdk.UserIntent.UserAdInteractionExt) this.instance).setDevice(device);
                return this;
            }

            public com.moloco.sdk.UserIntent.UserAdInteractionExt.Builder setDevice(com.moloco.sdk.UserIntent.UserAdInteractionExt.Device.Builder builder) {
                copyOnWrite();
                ((com.moloco.sdk.UserIntent.UserAdInteractionExt) this.instance).setDevice(builder.build());
                return this;
            }

            public com.moloco.sdk.UserIntent.UserAdInteractionExt.Builder mergeDevice(com.moloco.sdk.UserIntent.UserAdInteractionExt.Device device) {
                copyOnWrite();
                ((com.moloco.sdk.UserIntent.UserAdInteractionExt) this.instance).mergeDevice(device);
                return this;
            }

            public com.moloco.sdk.UserIntent.UserAdInteractionExt.Builder clearDevice() {
                copyOnWrite();
                ((com.moloco.sdk.UserIntent.UserAdInteractionExt) this.instance).clearDevice();
                return this;
            }

            @Override // com.moloco.sdk.UserIntent.UserAdInteractionExtOrBuilder
            public boolean hasApp() {
                return ((com.moloco.sdk.UserIntent.UserAdInteractionExt) this.instance).hasApp();
            }

            @Override // com.moloco.sdk.UserIntent.UserAdInteractionExtOrBuilder
            public com.moloco.sdk.UserIntent.UserAdInteractionExt.App getApp() {
                return ((com.moloco.sdk.UserIntent.UserAdInteractionExt) this.instance).getApp();
            }

            public com.moloco.sdk.UserIntent.UserAdInteractionExt.Builder setApp(com.moloco.sdk.UserIntent.UserAdInteractionExt.App app) {
                copyOnWrite();
                ((com.moloco.sdk.UserIntent.UserAdInteractionExt) this.instance).setApp(app);
                return this;
            }

            public com.moloco.sdk.UserIntent.UserAdInteractionExt.Builder setApp(com.moloco.sdk.UserIntent.UserAdInteractionExt.App.Builder builder) {
                copyOnWrite();
                ((com.moloco.sdk.UserIntent.UserAdInteractionExt) this.instance).setApp(builder.build());
                return this;
            }

            public com.moloco.sdk.UserIntent.UserAdInteractionExt.Builder mergeApp(com.moloco.sdk.UserIntent.UserAdInteractionExt.App app) {
                copyOnWrite();
                ((com.moloco.sdk.UserIntent.UserAdInteractionExt) this.instance).mergeApp(app);
                return this;
            }

            public com.moloco.sdk.UserIntent.UserAdInteractionExt.Builder clearApp() {
                copyOnWrite();
                ((com.moloco.sdk.UserIntent.UserAdInteractionExt) this.instance).clearApp();
                return this;
            }

            @Override // com.moloco.sdk.UserIntent.UserAdInteractionExtOrBuilder
            public boolean hasNetwork() {
                return ((com.moloco.sdk.UserIntent.UserAdInteractionExt) this.instance).hasNetwork();
            }

            @Override // com.moloco.sdk.UserIntent.UserAdInteractionExtOrBuilder
            public com.moloco.sdk.UserIntent.UserAdInteractionExt.Network getNetwork() {
                return ((com.moloco.sdk.UserIntent.UserAdInteractionExt) this.instance).getNetwork();
            }

            public com.moloco.sdk.UserIntent.UserAdInteractionExt.Builder setNetwork(com.moloco.sdk.UserIntent.UserAdInteractionExt.Network network) {
                copyOnWrite();
                ((com.moloco.sdk.UserIntent.UserAdInteractionExt) this.instance).setNetwork(network);
                return this;
            }

            public com.moloco.sdk.UserIntent.UserAdInteractionExt.Builder setNetwork(com.moloco.sdk.UserIntent.UserAdInteractionExt.Network.Builder builder) {
                copyOnWrite();
                ((com.moloco.sdk.UserIntent.UserAdInteractionExt) this.instance).setNetwork(builder.build());
                return this;
            }

            public com.moloco.sdk.UserIntent.UserAdInteractionExt.Builder mergeNetwork(com.moloco.sdk.UserIntent.UserAdInteractionExt.Network network) {
                copyOnWrite();
                ((com.moloco.sdk.UserIntent.UserAdInteractionExt) this.instance).mergeNetwork(network);
                return this;
            }

            public com.moloco.sdk.UserIntent.UserAdInteractionExt.Builder clearNetwork() {
                copyOnWrite();
                ((com.moloco.sdk.UserIntent.UserAdInteractionExt) this.instance).clearNetwork();
                return this;
            }

            @Override // com.moloco.sdk.UserIntent.UserAdInteractionExtOrBuilder
            public boolean hasSdk() {
                return ((com.moloco.sdk.UserIntent.UserAdInteractionExt) this.instance).hasSdk();
            }

            @Override // com.moloco.sdk.UserIntent.UserAdInteractionExtOrBuilder
            public com.moloco.sdk.UserIntent.UserAdInteractionExt.MolocoSDK getSdk() {
                return ((com.moloco.sdk.UserIntent.UserAdInteractionExt) this.instance).getSdk();
            }

            public com.moloco.sdk.UserIntent.UserAdInteractionExt.Builder setSdk(com.moloco.sdk.UserIntent.UserAdInteractionExt.MolocoSDK molocoSDK) {
                copyOnWrite();
                ((com.moloco.sdk.UserIntent.UserAdInteractionExt) this.instance).setSdk(molocoSDK);
                return this;
            }

            public com.moloco.sdk.UserIntent.UserAdInteractionExt.Builder setSdk(com.moloco.sdk.UserIntent.UserAdInteractionExt.MolocoSDK.Builder builder) {
                copyOnWrite();
                ((com.moloco.sdk.UserIntent.UserAdInteractionExt) this.instance).setSdk(builder.build());
                return this;
            }

            public com.moloco.sdk.UserIntent.UserAdInteractionExt.Builder mergeSdk(com.moloco.sdk.UserIntent.UserAdInteractionExt.MolocoSDK molocoSDK) {
                copyOnWrite();
                ((com.moloco.sdk.UserIntent.UserAdInteractionExt) this.instance).mergeSdk(molocoSDK);
                return this;
            }

            public com.moloco.sdk.UserIntent.UserAdInteractionExt.Builder clearSdk() {
                copyOnWrite();
                ((com.moloco.sdk.UserIntent.UserAdInteractionExt) this.instance).clearSdk();
                return this;
            }

            @Override // com.moloco.sdk.UserIntent.UserAdInteractionExtOrBuilder
            public boolean hasImpInteraction() {
                return ((com.moloco.sdk.UserIntent.UserAdInteractionExt) this.instance).hasImpInteraction();
            }

            @Override // com.moloco.sdk.UserIntent.UserAdInteractionExtOrBuilder
            public com.moloco.sdk.UserIntent.UserAdInteractionExt.ImpressionInteraction getImpInteraction() {
                return ((com.moloco.sdk.UserIntent.UserAdInteractionExt) this.instance).getImpInteraction();
            }

            public com.moloco.sdk.UserIntent.UserAdInteractionExt.Builder setImpInteraction(com.moloco.sdk.UserIntent.UserAdInteractionExt.ImpressionInteraction impressionInteraction) {
                copyOnWrite();
                ((com.moloco.sdk.UserIntent.UserAdInteractionExt) this.instance).setImpInteraction(impressionInteraction);
                return this;
            }

            public com.moloco.sdk.UserIntent.UserAdInteractionExt.Builder setImpInteraction(com.moloco.sdk.UserIntent.UserAdInteractionExt.ImpressionInteraction.Builder builder) {
                copyOnWrite();
                ((com.moloco.sdk.UserIntent.UserAdInteractionExt) this.instance).setImpInteraction(builder.build());
                return this;
            }

            public com.moloco.sdk.UserIntent.UserAdInteractionExt.Builder mergeImpInteraction(com.moloco.sdk.UserIntent.UserAdInteractionExt.ImpressionInteraction impressionInteraction) {
                copyOnWrite();
                ((com.moloco.sdk.UserIntent.UserAdInteractionExt) this.instance).mergeImpInteraction(impressionInteraction);
                return this;
            }

            public com.moloco.sdk.UserIntent.UserAdInteractionExt.Builder clearImpInteraction() {
                copyOnWrite();
                ((com.moloco.sdk.UserIntent.UserAdInteractionExt) this.instance).clearImpInteraction();
                return this;
            }

            @Override // com.moloco.sdk.UserIntent.UserAdInteractionExtOrBuilder
            public boolean hasClickInteraction() {
                return ((com.moloco.sdk.UserIntent.UserAdInteractionExt) this.instance).hasClickInteraction();
            }

            @Override // com.moloco.sdk.UserIntent.UserAdInteractionExtOrBuilder
            public com.moloco.sdk.UserIntent.UserAdInteractionExt.ClickInteraction getClickInteraction() {
                return ((com.moloco.sdk.UserIntent.UserAdInteractionExt) this.instance).getClickInteraction();
            }

            public com.moloco.sdk.UserIntent.UserAdInteractionExt.Builder setClickInteraction(com.moloco.sdk.UserIntent.UserAdInteractionExt.ClickInteraction clickInteraction) {
                copyOnWrite();
                ((com.moloco.sdk.UserIntent.UserAdInteractionExt) this.instance).setClickInteraction(clickInteraction);
                return this;
            }

            public com.moloco.sdk.UserIntent.UserAdInteractionExt.Builder setClickInteraction(com.moloco.sdk.UserIntent.UserAdInteractionExt.ClickInteraction.Builder builder) {
                copyOnWrite();
                ((com.moloco.sdk.UserIntent.UserAdInteractionExt) this.instance).setClickInteraction(builder.build());
                return this;
            }

            public com.moloco.sdk.UserIntent.UserAdInteractionExt.Builder mergeClickInteraction(com.moloco.sdk.UserIntent.UserAdInteractionExt.ClickInteraction clickInteraction) {
                copyOnWrite();
                ((com.moloco.sdk.UserIntent.UserAdInteractionExt) this.instance).mergeClickInteraction(clickInteraction);
                return this;
            }

            public com.moloco.sdk.UserIntent.UserAdInteractionExt.Builder clearClickInteraction() {
                copyOnWrite();
                ((com.moloco.sdk.UserIntent.UserAdInteractionExt) this.instance).clearClickInteraction();
                return this;
            }

            @Override // com.moloco.sdk.UserIntent.UserAdInteractionExtOrBuilder
            public boolean hasAppForegroundingInteraction() {
                return ((com.moloco.sdk.UserIntent.UserAdInteractionExt) this.instance).hasAppForegroundingInteraction();
            }

            @Override // com.moloco.sdk.UserIntent.UserAdInteractionExtOrBuilder
            public com.moloco.sdk.UserIntent.UserAdInteractionExt.AppForegroundingInteraction getAppForegroundingInteraction() {
                return ((com.moloco.sdk.UserIntent.UserAdInteractionExt) this.instance).getAppForegroundingInteraction();
            }

            public com.moloco.sdk.UserIntent.UserAdInteractionExt.Builder setAppForegroundingInteraction(com.moloco.sdk.UserIntent.UserAdInteractionExt.AppForegroundingInteraction appForegroundingInteraction) {
                copyOnWrite();
                ((com.moloco.sdk.UserIntent.UserAdInteractionExt) this.instance).setAppForegroundingInteraction(appForegroundingInteraction);
                return this;
            }

            public com.moloco.sdk.UserIntent.UserAdInteractionExt.Builder setAppForegroundingInteraction(com.moloco.sdk.UserIntent.UserAdInteractionExt.AppForegroundingInteraction.Builder builder) {
                copyOnWrite();
                ((com.moloco.sdk.UserIntent.UserAdInteractionExt) this.instance).setAppForegroundingInteraction(builder.build());
                return this;
            }

            public com.moloco.sdk.UserIntent.UserAdInteractionExt.Builder mergeAppForegroundingInteraction(com.moloco.sdk.UserIntent.UserAdInteractionExt.AppForegroundingInteraction appForegroundingInteraction) {
                copyOnWrite();
                ((com.moloco.sdk.UserIntent.UserAdInteractionExt) this.instance).mergeAppForegroundingInteraction(appForegroundingInteraction);
                return this;
            }

            public com.moloco.sdk.UserIntent.UserAdInteractionExt.Builder clearAppForegroundingInteraction() {
                copyOnWrite();
                ((com.moloco.sdk.UserIntent.UserAdInteractionExt) this.instance).clearAppForegroundingInteraction();
                return this;
            }

            @Override // com.moloco.sdk.UserIntent.UserAdInteractionExtOrBuilder
            public boolean hasAppBackgroundingInteraction() {
                return ((com.moloco.sdk.UserIntent.UserAdInteractionExt) this.instance).hasAppBackgroundingInteraction();
            }

            @Override // com.moloco.sdk.UserIntent.UserAdInteractionExtOrBuilder
            public com.moloco.sdk.UserIntent.UserAdInteractionExt.AppBackgroundingInteraction getAppBackgroundingInteraction() {
                return ((com.moloco.sdk.UserIntent.UserAdInteractionExt) this.instance).getAppBackgroundingInteraction();
            }

            public com.moloco.sdk.UserIntent.UserAdInteractionExt.Builder setAppBackgroundingInteraction(com.moloco.sdk.UserIntent.UserAdInteractionExt.AppBackgroundingInteraction appBackgroundingInteraction) {
                copyOnWrite();
                ((com.moloco.sdk.UserIntent.UserAdInteractionExt) this.instance).setAppBackgroundingInteraction(appBackgroundingInteraction);
                return this;
            }

            public com.moloco.sdk.UserIntent.UserAdInteractionExt.Builder setAppBackgroundingInteraction(com.moloco.sdk.UserIntent.UserAdInteractionExt.AppBackgroundingInteraction.Builder builder) {
                copyOnWrite();
                ((com.moloco.sdk.UserIntent.UserAdInteractionExt) this.instance).setAppBackgroundingInteraction(builder.build());
                return this;
            }

            public com.moloco.sdk.UserIntent.UserAdInteractionExt.Builder mergeAppBackgroundingInteraction(com.moloco.sdk.UserIntent.UserAdInteractionExt.AppBackgroundingInteraction appBackgroundingInteraction) {
                copyOnWrite();
                ((com.moloco.sdk.UserIntent.UserAdInteractionExt) this.instance).mergeAppBackgroundingInteraction(appBackgroundingInteraction);
                return this;
            }

            public com.moloco.sdk.UserIntent.UserAdInteractionExt.Builder clearAppBackgroundingInteraction() {
                copyOnWrite();
                ((com.moloco.sdk.UserIntent.UserAdInteractionExt) this.instance).clearAppBackgroundingInteraction();
                return this;
            }
        }

        @Override // com.google.protobuf.GeneratedMessageLite
        protected final java.lang.Object dynamicMethod(com.google.protobuf.GeneratedMessageLite.MethodToInvoke methodToInvoke, java.lang.Object obj, java.lang.Object obj2) {
            switch (com.moloco.sdk.UserIntent.AnonymousClass1.$SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke[methodToInvoke.ordinal()]) {
                case 1:
                    return new com.moloco.sdk.UserIntent.UserAdInteractionExt();
                case 2:
                    return new com.moloco.sdk.UserIntent.UserAdInteractionExt.Builder();
                case 3:
                    return newMessageInfo(DEFAULT_INSTANCE, "\u0000\u000b\u0001\u0000\u0001g\u000b\u0000\u0000\u0000\u0001Ȉ\u0002\u0002\u0003Ȉ\u0004\t\u0005\t\u0006\t\u0007\td<\u0000e<\u0000f<\u0000g<\u0000", new java.lang.Object[]{"infoExt_", "infoExtCase_", "mref_", "clientTimestamp_", "advertisingId_", "device_", "app_", "network_", "sdk_", com.moloco.sdk.UserIntent.UserAdInteractionExt.ImpressionInteraction.class, com.moloco.sdk.UserIntent.UserAdInteractionExt.ClickInteraction.class, com.moloco.sdk.UserIntent.UserAdInteractionExt.AppForegroundingInteraction.class, com.moloco.sdk.UserIntent.UserAdInteractionExt.AppBackgroundingInteraction.class});
                case 4:
                    return DEFAULT_INSTANCE;
                case 5:
                    com.google.protobuf.Parser<com.moloco.sdk.UserIntent.UserAdInteractionExt> parser = PARSER;
                    if (parser == null) {
                        synchronized (com.moloco.sdk.UserIntent.UserAdInteractionExt.class) {
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
            com.moloco.sdk.UserIntent.UserAdInteractionExt userAdInteractionExt = new com.moloco.sdk.UserIntent.UserAdInteractionExt();
            DEFAULT_INSTANCE = userAdInteractionExt;
            com.google.protobuf.GeneratedMessageLite.registerDefaultInstance(com.moloco.sdk.UserIntent.UserAdInteractionExt.class, userAdInteractionExt);
        }

        public static com.moloco.sdk.UserIntent.UserAdInteractionExt getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static com.google.protobuf.Parser<com.moloco.sdk.UserIntent.UserAdInteractionExt> parser() {
            return DEFAULT_INSTANCE.getParserForType();
        }
    }

    /* renamed from: com.moloco.sdk.UserIntent$1, reason: invalid class name */
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
}
