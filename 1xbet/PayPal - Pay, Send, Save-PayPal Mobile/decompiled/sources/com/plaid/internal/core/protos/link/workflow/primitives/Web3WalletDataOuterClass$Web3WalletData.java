package com.plaid.internal.core.protos.link.workflow.primitives;

/* loaded from: classes16.dex */
public final class Web3WalletDataOuterClass$Web3WalletData extends com.google.protobuf.GeneratedMessageLite<com.plaid.internal.core.protos.link.workflow.primitives.Web3WalletDataOuterClass$Web3WalletData, com.plaid.internal.core.protos.link.workflow.primitives.Web3WalletDataOuterClass$Web3WalletData.b> implements com.google.protobuf.MessageLiteOrBuilder {
    public static final int ANDROID_APP_INSTALL_URL_FIELD_NUMBER = 8;
    public static final int BROWSER_APP_INSTALL_URL_FIELD_NUMBER = 12;
    public static final int CHROME_PLUGIN_INSTALL_URL_FIELD_NUMBER = 13;
    private static final com.plaid.internal.core.protos.link.workflow.primitives.Web3WalletDataOuterClass$Web3WalletData DEFAULT_INSTANCE;
    public static final int DISPLAY_URL_FIELD_NUMBER = 4;
    public static final int EDGE_PLUGIN_INSTALL_URL_FIELD_NUMBER = 16;
    public static final int FIREFOX_PLUGIN_INSTALL_URL_FIELD_NUMBER = 14;
    public static final int IOS_APP_INSTALL_URL_FIELD_NUMBER = 7;
    public static final int LINUX_APP_INSTALL_URL_FIELD_NUMBER = 11;
    public static final int LOGO_FIELD_NUMBER = 6;
    public static final int MAC_APP_INSTALL_URL_FIELD_NUMBER = 9;
    private static volatile com.google.protobuf.Parser<com.plaid.internal.core.protos.link.workflow.primitives.Web3WalletDataOuterClass$Web3WalletData> PARSER = null;
    public static final int SAFARI_PLUGIN_INSTALL_URL_FIELD_NUMBER = 15;
    public static final int SHORT_DISPLAY_NAME_FIELD_NUMBER = 3;
    public static final int SOLANA_PLUGIN_ID_FIELD_NUMBER = 25;
    public static final int WALLET_BRAND_ID_FIELD_NUMBER = 17;
    public static final int WALLET_CONNECT_V1_FIELD_NUMBER = 24;
    public static final int WEB3_WALLET_CONNECTION_PROTOCOLS_FIELD_NUMBER = 1;
    public static final int WINDOWS_APP_INSTALL_URL_FIELD_NUMBER = 10;
    private static final com.google.protobuf.Internal.ListAdapter.Converter<java.lang.Integer, com.plaid.internal.core.protos.link.workflow.primitives.u> web3WalletConnectionProtocols_converter_ = new com.plaid.internal.core.protos.link.workflow.primitives.Web3WalletDataOuterClass$Web3WalletData.a();
    private int bitField0_;
    private com.plaid.internal.core.protos.link.workflow.primitives.Web3WalletDataOuterClass$Web3WalletData.WalletConnectV1 walletConnectV1_;
    private int web3WalletConnectionProtocolsMemoizedSerializedSize;
    private java.lang.String walletBrandId_ = "";
    private com.google.protobuf.ByteString logo_ = com.google.protobuf.ByteString.EMPTY;
    private java.lang.String shortDisplayName_ = "";
    private java.lang.String displayUrl_ = "";
    private com.google.protobuf.Internal.IntList web3WalletConnectionProtocols_ = com.google.protobuf.GeneratedMessageLite.emptyIntList();
    private java.lang.String iosAppInstallUrl_ = "";
    private java.lang.String androidAppInstallUrl_ = "";
    private java.lang.String macAppInstallUrl_ = "";
    private java.lang.String windowsAppInstallUrl_ = "";
    private java.lang.String linuxAppInstallUrl_ = "";
    private java.lang.String browserAppInstallUrl_ = "";
    private java.lang.String chromePluginInstallUrl_ = "";
    private java.lang.String firefoxPluginInstallUrl_ = "";
    private java.lang.String safariPluginInstallUrl_ = "";
    private java.lang.String edgePluginInstallUrl_ = "";
    private java.lang.String solanaPluginId_ = "";

    public static final class WalletConnectV1 extends com.google.protobuf.GeneratedMessageLite<com.plaid.internal.core.protos.link.workflow.primitives.Web3WalletDataOuterClass$Web3WalletData.WalletConnectV1, com.plaid.internal.core.protos.link.workflow.primitives.Web3WalletDataOuterClass.Web3WalletData.WalletConnectV1.a> implements com.google.protobuf.MessageLiteOrBuilder {
        public static final int ANDROID_CONNECTION_PREFIX_FIELD_NUMBER = 1;
        private static final com.plaid.internal.core.protos.link.workflow.primitives.Web3WalletDataOuterClass$Web3WalletData.WalletConnectV1 DEFAULT_INSTANCE;
        public static final int DESKTOP_CONNECTION_PREFIX_FIELD_NUMBER = 3;
        public static final int IOS_CONNECTION_PREFIX_FIELD_NUMBER = 2;
        private static volatile com.google.protobuf.Parser<com.plaid.internal.core.protos.link.workflow.primitives.Web3WalletDataOuterClass$Web3WalletData.WalletConnectV1> PARSER = null;
        public static final int QR_CODE_PREFIX_FIELD_NUMBER = 4;
        private java.lang.String androidConnectionPrefix_ = "";
        private java.lang.String iosConnectionPrefix_ = "";
        private java.lang.String desktopConnectionPrefix_ = "";
        private java.lang.String qrCodePrefix_ = "";

        public static final class a extends com.google.protobuf.GeneratedMessageLite.Builder<com.plaid.internal.core.protos.link.workflow.primitives.Web3WalletDataOuterClass$Web3WalletData.WalletConnectV1, com.plaid.internal.core.protos.link.workflow.primitives.Web3WalletDataOuterClass.Web3WalletData.WalletConnectV1.a> implements com.google.protobuf.MessageLiteOrBuilder {
            public a() {
                super(com.plaid.internal.core.protos.link.workflow.primitives.Web3WalletDataOuterClass$Web3WalletData.WalletConnectV1.DEFAULT_INSTANCE);
            }
        }

        static {
            com.plaid.internal.core.protos.link.workflow.primitives.Web3WalletDataOuterClass$Web3WalletData.WalletConnectV1 walletConnectV1 = new com.plaid.internal.core.protos.link.workflow.primitives.Web3WalletDataOuterClass$Web3WalletData.WalletConnectV1();
            DEFAULT_INSTANCE = walletConnectV1;
            com.google.protobuf.GeneratedMessageLite.registerDefaultInstance(com.plaid.internal.core.protos.link.workflow.primitives.Web3WalletDataOuterClass$Web3WalletData.WalletConnectV1.class, walletConnectV1);
        }

        private WalletConnectV1() {
        }

        private void clearAndroidConnectionPrefix() {
            this.androidConnectionPrefix_ = getDefaultInstance().getAndroidConnectionPrefix();
        }

        private void clearDesktopConnectionPrefix() {
            this.desktopConnectionPrefix_ = getDefaultInstance().getDesktopConnectionPrefix();
        }

        private void clearIosConnectionPrefix() {
            this.iosConnectionPrefix_ = getDefaultInstance().getIosConnectionPrefix();
        }

        private void clearQrCodePrefix() {
            this.qrCodePrefix_ = getDefaultInstance().getQrCodePrefix();
        }

        public static com.plaid.internal.core.protos.link.workflow.primitives.Web3WalletDataOuterClass$Web3WalletData.WalletConnectV1 getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static com.plaid.internal.core.protos.link.workflow.primitives.Web3WalletDataOuterClass.Web3WalletData.WalletConnectV1.a newBuilder() {
            return DEFAULT_INSTANCE.createBuilder();
        }

        public static com.plaid.internal.core.protos.link.workflow.primitives.Web3WalletDataOuterClass$Web3WalletData.WalletConnectV1 parseDelimitedFrom(java.io.InputStream inputStream) {
            return (com.plaid.internal.core.protos.link.workflow.primitives.Web3WalletDataOuterClass$Web3WalletData.WalletConnectV1) com.google.protobuf.GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static com.plaid.internal.core.protos.link.workflow.primitives.Web3WalletDataOuterClass$Web3WalletData.WalletConnectV1 parseFrom(java.nio.ByteBuffer byteBuffer) {
            return (com.plaid.internal.core.protos.link.workflow.primitives.Web3WalletDataOuterClass$Web3WalletData.WalletConnectV1) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
        }

        public static com.google.protobuf.Parser<com.plaid.internal.core.protos.link.workflow.primitives.Web3WalletDataOuterClass$Web3WalletData.WalletConnectV1> parser() {
            return DEFAULT_INSTANCE.getParserForType();
        }

        private void setAndroidConnectionPrefixBytes(com.google.protobuf.ByteString byteString) {
            com.google.protobuf.GeneratedMessageLite.checkByteStringIsUtf8(byteString);
            this.androidConnectionPrefix_ = byteString.toStringUtf8();
        }

        private void setDesktopConnectionPrefixBytes(com.google.protobuf.ByteString byteString) {
            com.google.protobuf.GeneratedMessageLite.checkByteStringIsUtf8(byteString);
            this.desktopConnectionPrefix_ = byteString.toStringUtf8();
        }

        private void setIosConnectionPrefixBytes(com.google.protobuf.ByteString byteString) {
            com.google.protobuf.GeneratedMessageLite.checkByteStringIsUtf8(byteString);
            this.iosConnectionPrefix_ = byteString.toStringUtf8();
        }

        private void setQrCodePrefixBytes(com.google.protobuf.ByteString byteString) {
            com.google.protobuf.GeneratedMessageLite.checkByteStringIsUtf8(byteString);
            this.qrCodePrefix_ = byteString.toStringUtf8();
        }

        @Override // com.google.protobuf.GeneratedMessageLite
        public final java.lang.Object dynamicMethod(com.google.protobuf.GeneratedMessageLite.MethodToInvoke methodToInvoke, java.lang.Object obj, java.lang.Object obj2) {
            com.google.protobuf.Parser parser;
            switch (com.plaid.internal.core.protos.link.workflow.primitives.t.f6383a[methodToInvoke.ordinal()]) {
                case 1:
                    return new com.plaid.internal.core.protos.link.workflow.primitives.Web3WalletDataOuterClass$Web3WalletData.WalletConnectV1();
                case 2:
                    return new com.plaid.internal.core.protos.link.workflow.primitives.Web3WalletDataOuterClass.Web3WalletData.WalletConnectV1.a();
                case 3:
                    return com.google.protobuf.GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0004\u0000\u0000\u0001\u0004\u0004\u0000\u0000\u0000\u0001Ȉ\u0002Ȉ\u0003Ȉ\u0004Ȉ", new java.lang.Object[]{"androidConnectionPrefix_", "iosConnectionPrefix_", "desktopConnectionPrefix_", "qrCodePrefix_"});
                case 4:
                    return DEFAULT_INSTANCE;
                case 5:
                    com.google.protobuf.Parser<com.plaid.internal.core.protos.link.workflow.primitives.Web3WalletDataOuterClass$Web3WalletData.WalletConnectV1> parser2 = PARSER;
                    if (parser2 != null) {
                        return parser2;
                    }
                    synchronized (com.plaid.internal.core.protos.link.workflow.primitives.Web3WalletDataOuterClass$Web3WalletData.WalletConnectV1.class) {
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

        public final java.lang.String getAndroidConnectionPrefix() {
            return this.androidConnectionPrefix_;
        }

        public final com.google.protobuf.ByteString getAndroidConnectionPrefixBytes() {
            return com.google.protobuf.ByteString.copyFromUtf8(this.androidConnectionPrefix_);
        }

        public final java.lang.String getDesktopConnectionPrefix() {
            return this.desktopConnectionPrefix_;
        }

        public final com.google.protobuf.ByteString getDesktopConnectionPrefixBytes() {
            return com.google.protobuf.ByteString.copyFromUtf8(this.desktopConnectionPrefix_);
        }

        public final java.lang.String getIosConnectionPrefix() {
            return this.iosConnectionPrefix_;
        }

        public final com.google.protobuf.ByteString getIosConnectionPrefixBytes() {
            return com.google.protobuf.ByteString.copyFromUtf8(this.iosConnectionPrefix_);
        }

        public final java.lang.String getQrCodePrefix() {
            return this.qrCodePrefix_;
        }

        public final com.google.protobuf.ByteString getQrCodePrefixBytes() {
            return com.google.protobuf.ByteString.copyFromUtf8(this.qrCodePrefix_);
        }

        public static com.plaid.internal.core.protos.link.workflow.primitives.Web3WalletDataOuterClass.Web3WalletData.WalletConnectV1.a newBuilder(com.plaid.internal.core.protos.link.workflow.primitives.Web3WalletDataOuterClass$Web3WalletData.WalletConnectV1 walletConnectV1) {
            return DEFAULT_INSTANCE.createBuilder(walletConnectV1);
        }

        public static com.plaid.internal.core.protos.link.workflow.primitives.Web3WalletDataOuterClass$Web3WalletData.WalletConnectV1 parseDelimitedFrom(java.io.InputStream inputStream, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) {
            return (com.plaid.internal.core.protos.link.workflow.primitives.Web3WalletDataOuterClass$Web3WalletData.WalletConnectV1) com.google.protobuf.GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
        }

        public static com.plaid.internal.core.protos.link.workflow.primitives.Web3WalletDataOuterClass$Web3WalletData.WalletConnectV1 parseFrom(java.nio.ByteBuffer byteBuffer, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) {
            return (com.plaid.internal.core.protos.link.workflow.primitives.Web3WalletDataOuterClass$Web3WalletData.WalletConnectV1) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
        }

        public static com.plaid.internal.core.protos.link.workflow.primitives.Web3WalletDataOuterClass$Web3WalletData.WalletConnectV1 parseFrom(com.google.protobuf.ByteString byteString) {
            return (com.plaid.internal.core.protos.link.workflow.primitives.Web3WalletDataOuterClass$Web3WalletData.WalletConnectV1) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
        }

        private void setAndroidConnectionPrefix(java.lang.String str) {
            this.androidConnectionPrefix_ = str;
        }

        private void setDesktopConnectionPrefix(java.lang.String str) {
            this.desktopConnectionPrefix_ = str;
        }

        private void setIosConnectionPrefix(java.lang.String str) {
            this.iosConnectionPrefix_ = str;
        }

        private void setQrCodePrefix(java.lang.String str) {
            this.qrCodePrefix_ = str;
        }

        public static com.plaid.internal.core.protos.link.workflow.primitives.Web3WalletDataOuterClass$Web3WalletData.WalletConnectV1 parseFrom(com.google.protobuf.ByteString byteString, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) {
            return (com.plaid.internal.core.protos.link.workflow.primitives.Web3WalletDataOuterClass$Web3WalletData.WalletConnectV1) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
        }

        public static com.plaid.internal.core.protos.link.workflow.primitives.Web3WalletDataOuterClass$Web3WalletData.WalletConnectV1 parseFrom(byte[] bArr) {
            return (com.plaid.internal.core.protos.link.workflow.primitives.Web3WalletDataOuterClass$Web3WalletData.WalletConnectV1) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
        }

        public static com.plaid.internal.core.protos.link.workflow.primitives.Web3WalletDataOuterClass$Web3WalletData.WalletConnectV1 parseFrom(byte[] bArr, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) {
            return (com.plaid.internal.core.protos.link.workflow.primitives.Web3WalletDataOuterClass$Web3WalletData.WalletConnectV1) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
        }

        public static com.plaid.internal.core.protos.link.workflow.primitives.Web3WalletDataOuterClass$Web3WalletData.WalletConnectV1 parseFrom(java.io.InputStream inputStream) {
            return (com.plaid.internal.core.protos.link.workflow.primitives.Web3WalletDataOuterClass$Web3WalletData.WalletConnectV1) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static com.plaid.internal.core.protos.link.workflow.primitives.Web3WalletDataOuterClass$Web3WalletData.WalletConnectV1 parseFrom(java.io.InputStream inputStream, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) {
            return (com.plaid.internal.core.protos.link.workflow.primitives.Web3WalletDataOuterClass$Web3WalletData.WalletConnectV1) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
        }

        public static com.plaid.internal.core.protos.link.workflow.primitives.Web3WalletDataOuterClass$Web3WalletData.WalletConnectV1 parseFrom(com.google.protobuf.CodedInputStream codedInputStream) {
            return (com.plaid.internal.core.protos.link.workflow.primitives.Web3WalletDataOuterClass$Web3WalletData.WalletConnectV1) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
        }

        public static com.plaid.internal.core.protos.link.workflow.primitives.Web3WalletDataOuterClass$Web3WalletData.WalletConnectV1 parseFrom(com.google.protobuf.CodedInputStream codedInputStream, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) {
            return (com.plaid.internal.core.protos.link.workflow.primitives.Web3WalletDataOuterClass$Web3WalletData.WalletConnectV1) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
        }
    }

    public final class a implements com.google.protobuf.Internal.ListAdapter.Converter<java.lang.Integer, com.plaid.internal.core.protos.link.workflow.primitives.u> {
        @Override // com.google.protobuf.Internal.ListAdapter.Converter
        public final com.plaid.internal.core.protos.link.workflow.primitives.u convert(java.lang.Integer num) {
            com.plaid.internal.core.protos.link.workflow.primitives.u forNumber = com.plaid.internal.core.protos.link.workflow.primitives.u.forNumber(num.intValue());
            return forNumber == null ? com.plaid.internal.core.protos.link.workflow.primitives.u.UNRECOGNIZED : forNumber;
        }
    }

    public static final class b extends com.google.protobuf.GeneratedMessageLite.Builder<com.plaid.internal.core.protos.link.workflow.primitives.Web3WalletDataOuterClass$Web3WalletData, com.plaid.internal.core.protos.link.workflow.primitives.Web3WalletDataOuterClass$Web3WalletData.b> implements com.google.protobuf.MessageLiteOrBuilder {
        public b() {
            super(com.plaid.internal.core.protos.link.workflow.primitives.Web3WalletDataOuterClass$Web3WalletData.DEFAULT_INSTANCE);
        }
    }

    static {
        com.plaid.internal.core.protos.link.workflow.primitives.Web3WalletDataOuterClass$Web3WalletData web3WalletDataOuterClass$Web3WalletData = new com.plaid.internal.core.protos.link.workflow.primitives.Web3WalletDataOuterClass$Web3WalletData();
        DEFAULT_INSTANCE = web3WalletDataOuterClass$Web3WalletData;
        com.google.protobuf.GeneratedMessageLite.registerDefaultInstance(com.plaid.internal.core.protos.link.workflow.primitives.Web3WalletDataOuterClass$Web3WalletData.class, web3WalletDataOuterClass$Web3WalletData);
    }

    private Web3WalletDataOuterClass$Web3WalletData() {
    }

    private void addAllWeb3WalletConnectionProtocols(java.lang.Iterable<? extends com.plaid.internal.core.protos.link.workflow.primitives.u> iterable) {
        ensureWeb3WalletConnectionProtocolsIsMutable();
        java.util.Iterator<? extends com.plaid.internal.core.protos.link.workflow.primitives.u> it = iterable.iterator();
        while (it.hasNext()) {
            this.web3WalletConnectionProtocols_.addInt(it.next().getNumber());
        }
    }

    private void addAllWeb3WalletConnectionProtocolsValue(java.lang.Iterable<java.lang.Integer> iterable) {
        ensureWeb3WalletConnectionProtocolsIsMutable();
        java.util.Iterator<java.lang.Integer> it = iterable.iterator();
        while (it.hasNext()) {
            this.web3WalletConnectionProtocols_.addInt(it.next().intValue());
        }
    }

    private void addWeb3WalletConnectionProtocolsValue(int i) {
        ensureWeb3WalletConnectionProtocolsIsMutable();
        this.web3WalletConnectionProtocols_.addInt(i);
    }

    private void clearAndroidAppInstallUrl() {
        this.androidAppInstallUrl_ = getDefaultInstance().getAndroidAppInstallUrl();
    }

    private void clearBrowserAppInstallUrl() {
        this.browserAppInstallUrl_ = getDefaultInstance().getBrowserAppInstallUrl();
    }

    private void clearChromePluginInstallUrl() {
        this.chromePluginInstallUrl_ = getDefaultInstance().getChromePluginInstallUrl();
    }

    private void clearDisplayUrl() {
        this.displayUrl_ = getDefaultInstance().getDisplayUrl();
    }

    private void clearEdgePluginInstallUrl() {
        this.edgePluginInstallUrl_ = getDefaultInstance().getEdgePluginInstallUrl();
    }

    private void clearFirefoxPluginInstallUrl() {
        this.firefoxPluginInstallUrl_ = getDefaultInstance().getFirefoxPluginInstallUrl();
    }

    private void clearIosAppInstallUrl() {
        this.iosAppInstallUrl_ = getDefaultInstance().getIosAppInstallUrl();
    }

    private void clearLinuxAppInstallUrl() {
        this.linuxAppInstallUrl_ = getDefaultInstance().getLinuxAppInstallUrl();
    }

    private void clearLogo() {
        this.logo_ = getDefaultInstance().getLogo();
    }

    private void clearMacAppInstallUrl() {
        this.macAppInstallUrl_ = getDefaultInstance().getMacAppInstallUrl();
    }

    private void clearSafariPluginInstallUrl() {
        this.safariPluginInstallUrl_ = getDefaultInstance().getSafariPluginInstallUrl();
    }

    private void clearShortDisplayName() {
        this.shortDisplayName_ = getDefaultInstance().getShortDisplayName();
    }

    private void clearSolanaPluginId() {
        this.solanaPluginId_ = getDefaultInstance().getSolanaPluginId();
    }

    private void clearWalletBrandId() {
        this.walletBrandId_ = getDefaultInstance().getWalletBrandId();
    }

    private void clearWalletConnectV1() {
        this.walletConnectV1_ = null;
        this.bitField0_ &= -2;
    }

    private void clearWeb3WalletConnectionProtocols() {
        this.web3WalletConnectionProtocols_ = com.google.protobuf.GeneratedMessageLite.emptyIntList();
    }

    private void clearWindowsAppInstallUrl() {
        this.windowsAppInstallUrl_ = getDefaultInstance().getWindowsAppInstallUrl();
    }

    private void ensureWeb3WalletConnectionProtocolsIsMutable() {
        com.google.protobuf.Internal.IntList intList = this.web3WalletConnectionProtocols_;
        if (intList.isModifiable()) {
            return;
        }
        this.web3WalletConnectionProtocols_ = com.google.protobuf.GeneratedMessageLite.mutableCopy(intList);
    }

    public static com.plaid.internal.core.protos.link.workflow.primitives.Web3WalletDataOuterClass$Web3WalletData getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static com.plaid.internal.core.protos.link.workflow.primitives.Web3WalletDataOuterClass$Web3WalletData.b newBuilder() {
        return DEFAULT_INSTANCE.createBuilder();
    }

    public static com.plaid.internal.core.protos.link.workflow.primitives.Web3WalletDataOuterClass$Web3WalletData parseDelimitedFrom(java.io.InputStream inputStream) {
        return (com.plaid.internal.core.protos.link.workflow.primitives.Web3WalletDataOuterClass$Web3WalletData) com.google.protobuf.GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static com.plaid.internal.core.protos.link.workflow.primitives.Web3WalletDataOuterClass$Web3WalletData parseFrom(java.nio.ByteBuffer byteBuffer) {
        return (com.plaid.internal.core.protos.link.workflow.primitives.Web3WalletDataOuterClass$Web3WalletData) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static com.google.protobuf.Parser<com.plaid.internal.core.protos.link.workflow.primitives.Web3WalletDataOuterClass$Web3WalletData> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    private void setAndroidAppInstallUrlBytes(com.google.protobuf.ByteString byteString) {
        com.google.protobuf.GeneratedMessageLite.checkByteStringIsUtf8(byteString);
        this.androidAppInstallUrl_ = byteString.toStringUtf8();
    }

    private void setBrowserAppInstallUrlBytes(com.google.protobuf.ByteString byteString) {
        com.google.protobuf.GeneratedMessageLite.checkByteStringIsUtf8(byteString);
        this.browserAppInstallUrl_ = byteString.toStringUtf8();
    }

    private void setChromePluginInstallUrlBytes(com.google.protobuf.ByteString byteString) {
        com.google.protobuf.GeneratedMessageLite.checkByteStringIsUtf8(byteString);
        this.chromePluginInstallUrl_ = byteString.toStringUtf8();
    }

    private void setDisplayUrlBytes(com.google.protobuf.ByteString byteString) {
        com.google.protobuf.GeneratedMessageLite.checkByteStringIsUtf8(byteString);
        this.displayUrl_ = byteString.toStringUtf8();
    }

    private void setEdgePluginInstallUrlBytes(com.google.protobuf.ByteString byteString) {
        com.google.protobuf.GeneratedMessageLite.checkByteStringIsUtf8(byteString);
        this.edgePluginInstallUrl_ = byteString.toStringUtf8();
    }

    private void setFirefoxPluginInstallUrlBytes(com.google.protobuf.ByteString byteString) {
        com.google.protobuf.GeneratedMessageLite.checkByteStringIsUtf8(byteString);
        this.firefoxPluginInstallUrl_ = byteString.toStringUtf8();
    }

    private void setIosAppInstallUrlBytes(com.google.protobuf.ByteString byteString) {
        com.google.protobuf.GeneratedMessageLite.checkByteStringIsUtf8(byteString);
        this.iosAppInstallUrl_ = byteString.toStringUtf8();
    }

    private void setLinuxAppInstallUrlBytes(com.google.protobuf.ByteString byteString) {
        com.google.protobuf.GeneratedMessageLite.checkByteStringIsUtf8(byteString);
        this.linuxAppInstallUrl_ = byteString.toStringUtf8();
    }

    private void setMacAppInstallUrlBytes(com.google.protobuf.ByteString byteString) {
        com.google.protobuf.GeneratedMessageLite.checkByteStringIsUtf8(byteString);
        this.macAppInstallUrl_ = byteString.toStringUtf8();
    }

    private void setSafariPluginInstallUrlBytes(com.google.protobuf.ByteString byteString) {
        com.google.protobuf.GeneratedMessageLite.checkByteStringIsUtf8(byteString);
        this.safariPluginInstallUrl_ = byteString.toStringUtf8();
    }

    private void setShortDisplayNameBytes(com.google.protobuf.ByteString byteString) {
        com.google.protobuf.GeneratedMessageLite.checkByteStringIsUtf8(byteString);
        this.shortDisplayName_ = byteString.toStringUtf8();
    }

    private void setSolanaPluginIdBytes(com.google.protobuf.ByteString byteString) {
        com.google.protobuf.GeneratedMessageLite.checkByteStringIsUtf8(byteString);
        this.solanaPluginId_ = byteString.toStringUtf8();
    }

    private void setWalletBrandIdBytes(com.google.protobuf.ByteString byteString) {
        com.google.protobuf.GeneratedMessageLite.checkByteStringIsUtf8(byteString);
        this.walletBrandId_ = byteString.toStringUtf8();
    }

    private void setWeb3WalletConnectionProtocolsValue(int i, int i2) {
        ensureWeb3WalletConnectionProtocolsIsMutable();
        this.web3WalletConnectionProtocols_.setInt(i, i2);
    }

    private void setWindowsAppInstallUrlBytes(com.google.protobuf.ByteString byteString) {
        com.google.protobuf.GeneratedMessageLite.checkByteStringIsUtf8(byteString);
        this.windowsAppInstallUrl_ = byteString.toStringUtf8();
    }

    @Override // com.google.protobuf.GeneratedMessageLite
    public final java.lang.Object dynamicMethod(com.google.protobuf.GeneratedMessageLite.MethodToInvoke methodToInvoke, java.lang.Object obj, java.lang.Object obj2) {
        com.google.protobuf.Parser parser;
        switch (com.plaid.internal.core.protos.link.workflow.primitives.t.f6383a[methodToInvoke.ordinal()]) {
            case 1:
                return new com.plaid.internal.core.protos.link.workflow.primitives.Web3WalletDataOuterClass$Web3WalletData();
            case 2:
                return new com.plaid.internal.core.protos.link.workflow.primitives.Web3WalletDataOuterClass$Web3WalletData.b();
            case 3:
                return com.google.protobuf.GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0011\u0000\u0001\u0001\u0019\u0011\u0000\u0001\u0000\u0001,\u0003Ȉ\u0004Ȉ\u0006\n\u0007Ȉ\bȈ\tȈ\nȈ\u000bȈ\fȈ\rȈ\u000eȈ\u000fȈ\u0010Ȉ\u0011Ȉ\u0018ဉ\u0000\u0019Ȉ", new java.lang.Object[]{"bitField0_", "web3WalletConnectionProtocols_", "shortDisplayName_", "displayUrl_", "logo_", "iosAppInstallUrl_", "androidAppInstallUrl_", "macAppInstallUrl_", "windowsAppInstallUrl_", "linuxAppInstallUrl_", "browserAppInstallUrl_", "chromePluginInstallUrl_", "firefoxPluginInstallUrl_", "safariPluginInstallUrl_", "edgePluginInstallUrl_", "walletBrandId_", "walletConnectV1_", "solanaPluginId_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                com.google.protobuf.Parser<com.plaid.internal.core.protos.link.workflow.primitives.Web3WalletDataOuterClass$Web3WalletData> parser2 = PARSER;
                if (parser2 != null) {
                    return parser2;
                }
                synchronized (com.plaid.internal.core.protos.link.workflow.primitives.Web3WalletDataOuterClass$Web3WalletData.class) {
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

    public final java.lang.String getAndroidAppInstallUrl() {
        return this.androidAppInstallUrl_;
    }

    public final com.google.protobuf.ByteString getAndroidAppInstallUrlBytes() {
        return com.google.protobuf.ByteString.copyFromUtf8(this.androidAppInstallUrl_);
    }

    public final java.lang.String getBrowserAppInstallUrl() {
        return this.browserAppInstallUrl_;
    }

    public final com.google.protobuf.ByteString getBrowserAppInstallUrlBytes() {
        return com.google.protobuf.ByteString.copyFromUtf8(this.browserAppInstallUrl_);
    }

    public final java.lang.String getChromePluginInstallUrl() {
        return this.chromePluginInstallUrl_;
    }

    public final com.google.protobuf.ByteString getChromePluginInstallUrlBytes() {
        return com.google.protobuf.ByteString.copyFromUtf8(this.chromePluginInstallUrl_);
    }

    public final java.lang.String getDisplayUrl() {
        return this.displayUrl_;
    }

    public final com.google.protobuf.ByteString getDisplayUrlBytes() {
        return com.google.protobuf.ByteString.copyFromUtf8(this.displayUrl_);
    }

    public final java.lang.String getEdgePluginInstallUrl() {
        return this.edgePluginInstallUrl_;
    }

    public final com.google.protobuf.ByteString getEdgePluginInstallUrlBytes() {
        return com.google.protobuf.ByteString.copyFromUtf8(this.edgePluginInstallUrl_);
    }

    public final java.lang.String getFirefoxPluginInstallUrl() {
        return this.firefoxPluginInstallUrl_;
    }

    public final com.google.protobuf.ByteString getFirefoxPluginInstallUrlBytes() {
        return com.google.protobuf.ByteString.copyFromUtf8(this.firefoxPluginInstallUrl_);
    }

    public final java.lang.String getIosAppInstallUrl() {
        return this.iosAppInstallUrl_;
    }

    public final com.google.protobuf.ByteString getIosAppInstallUrlBytes() {
        return com.google.protobuf.ByteString.copyFromUtf8(this.iosAppInstallUrl_);
    }

    public final java.lang.String getLinuxAppInstallUrl() {
        return this.linuxAppInstallUrl_;
    }

    public final com.google.protobuf.ByteString getLinuxAppInstallUrlBytes() {
        return com.google.protobuf.ByteString.copyFromUtf8(this.linuxAppInstallUrl_);
    }

    public final com.google.protobuf.ByteString getLogo() {
        return this.logo_;
    }

    public final java.lang.String getMacAppInstallUrl() {
        return this.macAppInstallUrl_;
    }

    public final com.google.protobuf.ByteString getMacAppInstallUrlBytes() {
        return com.google.protobuf.ByteString.copyFromUtf8(this.macAppInstallUrl_);
    }

    public final java.lang.String getSafariPluginInstallUrl() {
        return this.safariPluginInstallUrl_;
    }

    public final com.google.protobuf.ByteString getSafariPluginInstallUrlBytes() {
        return com.google.protobuf.ByteString.copyFromUtf8(this.safariPluginInstallUrl_);
    }

    public final java.lang.String getShortDisplayName() {
        return this.shortDisplayName_;
    }

    public final com.google.protobuf.ByteString getShortDisplayNameBytes() {
        return com.google.protobuf.ByteString.copyFromUtf8(this.shortDisplayName_);
    }

    public final java.lang.String getSolanaPluginId() {
        return this.solanaPluginId_;
    }

    public final com.google.protobuf.ByteString getSolanaPluginIdBytes() {
        return com.google.protobuf.ByteString.copyFromUtf8(this.solanaPluginId_);
    }

    public final java.lang.String getWalletBrandId() {
        return this.walletBrandId_;
    }

    public final com.google.protobuf.ByteString getWalletBrandIdBytes() {
        return com.google.protobuf.ByteString.copyFromUtf8(this.walletBrandId_);
    }

    public final com.plaid.internal.core.protos.link.workflow.primitives.Web3WalletDataOuterClass$Web3WalletData.WalletConnectV1 getWalletConnectV1() {
        com.plaid.internal.core.protos.link.workflow.primitives.Web3WalletDataOuterClass$Web3WalletData.WalletConnectV1 walletConnectV1 = this.walletConnectV1_;
        return walletConnectV1 == null ? com.plaid.internal.core.protos.link.workflow.primitives.Web3WalletDataOuterClass$Web3WalletData.WalletConnectV1.getDefaultInstance() : walletConnectV1;
    }

    public final com.plaid.internal.core.protos.link.workflow.primitives.u getWeb3WalletConnectionProtocols(int i) {
        com.plaid.internal.core.protos.link.workflow.primitives.u forNumber = com.plaid.internal.core.protos.link.workflow.primitives.u.forNumber(this.web3WalletConnectionProtocols_.getInt(i));
        return forNumber == null ? com.plaid.internal.core.protos.link.workflow.primitives.u.UNRECOGNIZED : forNumber;
    }

    public final int getWeb3WalletConnectionProtocolsCount() {
        return this.web3WalletConnectionProtocols_.size();
    }

    public final java.util.List<com.plaid.internal.core.protos.link.workflow.primitives.u> getWeb3WalletConnectionProtocolsList() {
        return new com.google.protobuf.Internal.ListAdapter(this.web3WalletConnectionProtocols_, web3WalletConnectionProtocols_converter_);
    }

    public final int getWeb3WalletConnectionProtocolsValue(int i) {
        return this.web3WalletConnectionProtocols_.getInt(i);
    }

    public final java.util.List<java.lang.Integer> getWeb3WalletConnectionProtocolsValueList() {
        return this.web3WalletConnectionProtocols_;
    }

    public final java.lang.String getWindowsAppInstallUrl() {
        return this.windowsAppInstallUrl_;
    }

    public final com.google.protobuf.ByteString getWindowsAppInstallUrlBytes() {
        return com.google.protobuf.ByteString.copyFromUtf8(this.windowsAppInstallUrl_);
    }

    public final boolean hasWalletConnectV1() {
        return (this.bitField0_ & 1) != 0;
    }

    private void addWeb3WalletConnectionProtocols(com.plaid.internal.core.protos.link.workflow.primitives.u uVar) {
        ensureWeb3WalletConnectionProtocolsIsMutable();
        this.web3WalletConnectionProtocols_.addInt(uVar.getNumber());
    }

    private void mergeWalletConnectV1(com.plaid.internal.core.protos.link.workflow.primitives.Web3WalletDataOuterClass$Web3WalletData.WalletConnectV1 walletConnectV1) {
        com.plaid.internal.core.protos.link.workflow.primitives.Web3WalletDataOuterClass$Web3WalletData.WalletConnectV1 walletConnectV12 = this.walletConnectV1_;
        if (walletConnectV12 == null || walletConnectV12 == com.plaid.internal.core.protos.link.workflow.primitives.Web3WalletDataOuterClass$Web3WalletData.WalletConnectV1.getDefaultInstance()) {
            this.walletConnectV1_ = walletConnectV1;
        } else {
            this.walletConnectV1_ = com.plaid.internal.core.protos.link.workflow.primitives.Web3WalletDataOuterClass$Web3WalletData.WalletConnectV1.newBuilder(this.walletConnectV1_).mergeFrom((com.plaid.internal.core.protos.link.workflow.primitives.Web3WalletDataOuterClass.Web3WalletData.WalletConnectV1.a) walletConnectV1).buildPartial();
        }
        this.bitField0_ |= 1;
    }

    public static com.plaid.internal.core.protos.link.workflow.primitives.Web3WalletDataOuterClass$Web3WalletData.b newBuilder(com.plaid.internal.core.protos.link.workflow.primitives.Web3WalletDataOuterClass$Web3WalletData web3WalletDataOuterClass$Web3WalletData) {
        return DEFAULT_INSTANCE.createBuilder(web3WalletDataOuterClass$Web3WalletData);
    }

    public static com.plaid.internal.core.protos.link.workflow.primitives.Web3WalletDataOuterClass$Web3WalletData parseDelimitedFrom(java.io.InputStream inputStream, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) {
        return (com.plaid.internal.core.protos.link.workflow.primitives.Web3WalletDataOuterClass$Web3WalletData) com.google.protobuf.GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static com.plaid.internal.core.protos.link.workflow.primitives.Web3WalletDataOuterClass$Web3WalletData parseFrom(java.nio.ByteBuffer byteBuffer, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) {
        return (com.plaid.internal.core.protos.link.workflow.primitives.Web3WalletDataOuterClass$Web3WalletData) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
    }

    private void setWalletConnectV1(com.plaid.internal.core.protos.link.workflow.primitives.Web3WalletDataOuterClass$Web3WalletData.WalletConnectV1 walletConnectV1) {
        this.walletConnectV1_ = walletConnectV1;
        this.bitField0_ |= 1;
    }

    private void setWeb3WalletConnectionProtocols(int i, com.plaid.internal.core.protos.link.workflow.primitives.u uVar) {
        ensureWeb3WalletConnectionProtocolsIsMutable();
        this.web3WalletConnectionProtocols_.setInt(i, uVar.getNumber());
    }

    public static com.plaid.internal.core.protos.link.workflow.primitives.Web3WalletDataOuterClass$Web3WalletData parseFrom(com.google.protobuf.ByteString byteString) {
        return (com.plaid.internal.core.protos.link.workflow.primitives.Web3WalletDataOuterClass$Web3WalletData) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
    }

    private void setAndroidAppInstallUrl(java.lang.String str) {
        this.androidAppInstallUrl_ = str;
    }

    private void setBrowserAppInstallUrl(java.lang.String str) {
        this.browserAppInstallUrl_ = str;
    }

    private void setChromePluginInstallUrl(java.lang.String str) {
        this.chromePluginInstallUrl_ = str;
    }

    private void setDisplayUrl(java.lang.String str) {
        this.displayUrl_ = str;
    }

    private void setEdgePluginInstallUrl(java.lang.String str) {
        this.edgePluginInstallUrl_ = str;
    }

    private void setFirefoxPluginInstallUrl(java.lang.String str) {
        this.firefoxPluginInstallUrl_ = str;
    }

    private void setIosAppInstallUrl(java.lang.String str) {
        this.iosAppInstallUrl_ = str;
    }

    private void setLinuxAppInstallUrl(java.lang.String str) {
        this.linuxAppInstallUrl_ = str;
    }

    private void setLogo(com.google.protobuf.ByteString byteString) {
        this.logo_ = byteString;
    }

    private void setMacAppInstallUrl(java.lang.String str) {
        this.macAppInstallUrl_ = str;
    }

    private void setSafariPluginInstallUrl(java.lang.String str) {
        this.safariPluginInstallUrl_ = str;
    }

    private void setShortDisplayName(java.lang.String str) {
        this.shortDisplayName_ = str;
    }

    private void setSolanaPluginId(java.lang.String str) {
        this.solanaPluginId_ = str;
    }

    private void setWalletBrandId(java.lang.String str) {
        this.walletBrandId_ = str;
    }

    private void setWindowsAppInstallUrl(java.lang.String str) {
        this.windowsAppInstallUrl_ = str;
    }

    public static com.plaid.internal.core.protos.link.workflow.primitives.Web3WalletDataOuterClass$Web3WalletData parseFrom(com.google.protobuf.ByteString byteString, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) {
        return (com.plaid.internal.core.protos.link.workflow.primitives.Web3WalletDataOuterClass$Web3WalletData) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
    }

    public static com.plaid.internal.core.protos.link.workflow.primitives.Web3WalletDataOuterClass$Web3WalletData parseFrom(byte[] bArr) {
        return (com.plaid.internal.core.protos.link.workflow.primitives.Web3WalletDataOuterClass$Web3WalletData) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static com.plaid.internal.core.protos.link.workflow.primitives.Web3WalletDataOuterClass$Web3WalletData parseFrom(byte[] bArr, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) {
        return (com.plaid.internal.core.protos.link.workflow.primitives.Web3WalletDataOuterClass$Web3WalletData) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
    }

    public static com.plaid.internal.core.protos.link.workflow.primitives.Web3WalletDataOuterClass$Web3WalletData parseFrom(java.io.InputStream inputStream) {
        return (com.plaid.internal.core.protos.link.workflow.primitives.Web3WalletDataOuterClass$Web3WalletData) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static com.plaid.internal.core.protos.link.workflow.primitives.Web3WalletDataOuterClass$Web3WalletData parseFrom(java.io.InputStream inputStream, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) {
        return (com.plaid.internal.core.protos.link.workflow.primitives.Web3WalletDataOuterClass$Web3WalletData) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static com.plaid.internal.core.protos.link.workflow.primitives.Web3WalletDataOuterClass$Web3WalletData parseFrom(com.google.protobuf.CodedInputStream codedInputStream) {
        return (com.plaid.internal.core.protos.link.workflow.primitives.Web3WalletDataOuterClass$Web3WalletData) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
    }

    public static com.plaid.internal.core.protos.link.workflow.primitives.Web3WalletDataOuterClass$Web3WalletData parseFrom(com.google.protobuf.CodedInputStream codedInputStream, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) {
        return (com.plaid.internal.core.protos.link.workflow.primitives.Web3WalletDataOuterClass$Web3WalletData) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
    }
}
