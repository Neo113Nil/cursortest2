package com.plaid.internal.core.protos.link.sdkevents;

/* loaded from: classes16.dex */
public final class SdkEvent$SDKEvent extends com.google.protobuf.GeneratedMessageLite<com.plaid.internal.core.protos.link.sdkevents.SdkEvent$SDKEvent, com.plaid.internal.core.protos.link.sdkevents.SdkEvent$SDKEvent.a> implements com.plaid.internal.core.protos.link.sdkevents.b {
    private static final com.plaid.internal.core.protos.link.sdkevents.SdkEvent$SDKEvent DEFAULT_INSTANCE;
    public static final int DELAY_MS_FIELD_NUMBER = 4;
    public static final int EVENT_NAME_FIELD_NUMBER = 1;
    public static final int METADATA_FIELD_NUMBER = 2;
    private static volatile com.google.protobuf.Parser<com.plaid.internal.core.protos.link.sdkevents.SdkEvent$SDKEvent> PARSER = null;
    public static final int QUEUE_BEHAVIOR_FIELD_NUMBER = 5;
    public static final int WEBVIEW_REDIRECT_URI_FIELD_NUMBER = 3;
    private int bitField0_;
    private com.plaid.internal.core.protos.link.sdkevents.SdkEvent$SDKEvent.Metadata metadata_;
    private java.lang.Object triggerBehavior_;
    private int triggerBehaviorCase_ = 0;
    private java.lang.String eventName_ = "";
    private java.lang.String webviewRedirectUri_ = "";

    public static final class Metadata extends com.google.protobuf.GeneratedMessageLite<com.plaid.internal.core.protos.link.sdkevents.SdkEvent$SDKEvent.Metadata, com.plaid.internal.core.protos.link.sdkevents.SdkEvent.SDKEvent.Metadata.a> implements com.google.protobuf.MessageLiteOrBuilder {
        public static final int ACCOUNT_NUMBER_MASK_FIELD_NUMBER = 17;
        public static final int BRAND_NAME_FIELD_NUMBER = 14;
        private static final com.plaid.internal.core.protos.link.sdkevents.SdkEvent$SDKEvent.Metadata DEFAULT_INSTANCE;
        public static final int ERROR_CODE_FIELD_NUMBER = 1;
        public static final int ERROR_MESSAGE_FIELD_NUMBER = 2;
        public static final int ERROR_TYPE_FIELD_NUMBER = 3;
        public static final int EXIT_STATUS_FIELD_NUMBER = 4;
        public static final int INSTITUTION_ID_FIELD_NUMBER = 5;
        public static final int INSTITUTION_NAME_FIELD_NUMBER = 6;
        public static final int INSTITUTION_SEARCH_QUERY_FIELD_NUMBER = 7;
        public static final int IS_UPDATE_MODE_FIELD_NUMBER = 19;
        public static final int LINK_SESSION_ID_FIELD_NUMBER = 9;
        public static final int MATCH_REASON_FIELD_NUMBER = 15;
        public static final int MFA_TYPE_FIELD_NUMBER = 10;
        private static volatile com.google.protobuf.Parser<com.plaid.internal.core.protos.link.sdkevents.SdkEvent$SDKEvent.Metadata> PARSER = null;
        public static final int REQUEST_ID_FIELD_NUMBER = 8;
        public static final int ROUTING_NUMBER_FIELD_NUMBER = 16;
        public static final int SELECTION_FIELD_NUMBER = 13;
        public static final int TIMESTAMP_FIELD_NUMBER = 12;
        public static final int VIEW_NAME_FIELD_NUMBER = 11;
        public static final int VIEW_VARIANT_FIELD_NUMBER = 18;
        private java.lang.String errorCode_ = "";
        private java.lang.String errorMessage_ = "";
        private java.lang.String errorType_ = "";
        private java.lang.String exitStatus_ = "";
        private java.lang.String institutionId_ = "";
        private java.lang.String institutionName_ = "";
        private java.lang.String institutionSearchQuery_ = "";
        private java.lang.String requestId_ = "";
        private java.lang.String linkSessionId_ = "";
        private java.lang.String mfaType_ = "";
        private java.lang.String viewName_ = "";
        private java.lang.String timestamp_ = "";
        private java.lang.String selection_ = "";
        private java.lang.String brandName_ = "";
        private java.lang.String matchReason_ = "";
        private java.lang.String routingNumber_ = "";
        private java.lang.String accountNumberMask_ = "";
        private java.lang.String viewVariant_ = "";
        private java.lang.String isUpdateMode_ = "";

        public static final class a extends com.google.protobuf.GeneratedMessageLite.Builder<com.plaid.internal.core.protos.link.sdkevents.SdkEvent$SDKEvent.Metadata, com.plaid.internal.core.protos.link.sdkevents.SdkEvent.SDKEvent.Metadata.a> implements com.google.protobuf.MessageLiteOrBuilder {
            public a() {
                super(com.plaid.internal.core.protos.link.sdkevents.SdkEvent$SDKEvent.Metadata.DEFAULT_INSTANCE);
            }
        }

        static {
            com.plaid.internal.core.protos.link.sdkevents.SdkEvent$SDKEvent.Metadata metadata = new com.plaid.internal.core.protos.link.sdkevents.SdkEvent$SDKEvent.Metadata();
            DEFAULT_INSTANCE = metadata;
            com.google.protobuf.GeneratedMessageLite.registerDefaultInstance(com.plaid.internal.core.protos.link.sdkevents.SdkEvent$SDKEvent.Metadata.class, metadata);
        }

        private Metadata() {
        }

        private void clearAccountNumberMask() {
            this.accountNumberMask_ = getDefaultInstance().getAccountNumberMask();
        }

        private void clearBrandName() {
            this.brandName_ = getDefaultInstance().getBrandName();
        }

        private void clearErrorCode() {
            this.errorCode_ = getDefaultInstance().getErrorCode();
        }

        private void clearErrorMessage() {
            this.errorMessage_ = getDefaultInstance().getErrorMessage();
        }

        private void clearErrorType() {
            this.errorType_ = getDefaultInstance().getErrorType();
        }

        private void clearExitStatus() {
            this.exitStatus_ = getDefaultInstance().getExitStatus();
        }

        private void clearInstitutionId() {
            this.institutionId_ = getDefaultInstance().getInstitutionId();
        }

        private void clearInstitutionName() {
            this.institutionName_ = getDefaultInstance().getInstitutionName();
        }

        private void clearInstitutionSearchQuery() {
            this.institutionSearchQuery_ = getDefaultInstance().getInstitutionSearchQuery();
        }

        private void clearIsUpdateMode() {
            this.isUpdateMode_ = getDefaultInstance().getIsUpdateMode();
        }

        private void clearLinkSessionId() {
            this.linkSessionId_ = getDefaultInstance().getLinkSessionId();
        }

        private void clearMatchReason() {
            this.matchReason_ = getDefaultInstance().getMatchReason();
        }

        private void clearMfaType() {
            this.mfaType_ = getDefaultInstance().getMfaType();
        }

        private void clearRequestId() {
            this.requestId_ = getDefaultInstance().getRequestId();
        }

        private void clearRoutingNumber() {
            this.routingNumber_ = getDefaultInstance().getRoutingNumber();
        }

        private void clearSelection() {
            this.selection_ = getDefaultInstance().getSelection();
        }

        private void clearTimestamp() {
            this.timestamp_ = getDefaultInstance().getTimestamp();
        }

        private void clearViewName() {
            this.viewName_ = getDefaultInstance().getViewName();
        }

        private void clearViewVariant() {
            this.viewVariant_ = getDefaultInstance().getViewVariant();
        }

        public static com.plaid.internal.core.protos.link.sdkevents.SdkEvent$SDKEvent.Metadata getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static com.plaid.internal.core.protos.link.sdkevents.SdkEvent.SDKEvent.Metadata.a newBuilder() {
            return DEFAULT_INSTANCE.createBuilder();
        }

        public static com.plaid.internal.core.protos.link.sdkevents.SdkEvent$SDKEvent.Metadata parseDelimitedFrom(java.io.InputStream inputStream) {
            return (com.plaid.internal.core.protos.link.sdkevents.SdkEvent$SDKEvent.Metadata) com.google.protobuf.GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static com.plaid.internal.core.protos.link.sdkevents.SdkEvent$SDKEvent.Metadata parseFrom(java.nio.ByteBuffer byteBuffer) {
            return (com.plaid.internal.core.protos.link.sdkevents.SdkEvent$SDKEvent.Metadata) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
        }

        public static com.google.protobuf.Parser<com.plaid.internal.core.protos.link.sdkevents.SdkEvent$SDKEvent.Metadata> parser() {
            return DEFAULT_INSTANCE.getParserForType();
        }

        private void setAccountNumberMaskBytes(com.google.protobuf.ByteString byteString) {
            com.google.protobuf.GeneratedMessageLite.checkByteStringIsUtf8(byteString);
            this.accountNumberMask_ = byteString.toStringUtf8();
        }

        private void setBrandNameBytes(com.google.protobuf.ByteString byteString) {
            com.google.protobuf.GeneratedMessageLite.checkByteStringIsUtf8(byteString);
            this.brandName_ = byteString.toStringUtf8();
        }

        private void setErrorCodeBytes(com.google.protobuf.ByteString byteString) {
            com.google.protobuf.GeneratedMessageLite.checkByteStringIsUtf8(byteString);
            this.errorCode_ = byteString.toStringUtf8();
        }

        private void setErrorMessageBytes(com.google.protobuf.ByteString byteString) {
            com.google.protobuf.GeneratedMessageLite.checkByteStringIsUtf8(byteString);
            this.errorMessage_ = byteString.toStringUtf8();
        }

        private void setErrorTypeBytes(com.google.protobuf.ByteString byteString) {
            com.google.protobuf.GeneratedMessageLite.checkByteStringIsUtf8(byteString);
            this.errorType_ = byteString.toStringUtf8();
        }

        private void setExitStatusBytes(com.google.protobuf.ByteString byteString) {
            com.google.protobuf.GeneratedMessageLite.checkByteStringIsUtf8(byteString);
            this.exitStatus_ = byteString.toStringUtf8();
        }

        private void setInstitutionIdBytes(com.google.protobuf.ByteString byteString) {
            com.google.protobuf.GeneratedMessageLite.checkByteStringIsUtf8(byteString);
            this.institutionId_ = byteString.toStringUtf8();
        }

        private void setInstitutionNameBytes(com.google.protobuf.ByteString byteString) {
            com.google.protobuf.GeneratedMessageLite.checkByteStringIsUtf8(byteString);
            this.institutionName_ = byteString.toStringUtf8();
        }

        private void setInstitutionSearchQueryBytes(com.google.protobuf.ByteString byteString) {
            com.google.protobuf.GeneratedMessageLite.checkByteStringIsUtf8(byteString);
            this.institutionSearchQuery_ = byteString.toStringUtf8();
        }

        private void setIsUpdateModeBytes(com.google.protobuf.ByteString byteString) {
            com.google.protobuf.GeneratedMessageLite.checkByteStringIsUtf8(byteString);
            this.isUpdateMode_ = byteString.toStringUtf8();
        }

        private void setLinkSessionIdBytes(com.google.protobuf.ByteString byteString) {
            com.google.protobuf.GeneratedMessageLite.checkByteStringIsUtf8(byteString);
            this.linkSessionId_ = byteString.toStringUtf8();
        }

        private void setMatchReasonBytes(com.google.protobuf.ByteString byteString) {
            com.google.protobuf.GeneratedMessageLite.checkByteStringIsUtf8(byteString);
            this.matchReason_ = byteString.toStringUtf8();
        }

        private void setMfaTypeBytes(com.google.protobuf.ByteString byteString) {
            com.google.protobuf.GeneratedMessageLite.checkByteStringIsUtf8(byteString);
            this.mfaType_ = byteString.toStringUtf8();
        }

        private void setRequestIdBytes(com.google.protobuf.ByteString byteString) {
            com.google.protobuf.GeneratedMessageLite.checkByteStringIsUtf8(byteString);
            this.requestId_ = byteString.toStringUtf8();
        }

        private void setRoutingNumberBytes(com.google.protobuf.ByteString byteString) {
            com.google.protobuf.GeneratedMessageLite.checkByteStringIsUtf8(byteString);
            this.routingNumber_ = byteString.toStringUtf8();
        }

        private void setSelectionBytes(com.google.protobuf.ByteString byteString) {
            com.google.protobuf.GeneratedMessageLite.checkByteStringIsUtf8(byteString);
            this.selection_ = byteString.toStringUtf8();
        }

        private void setTimestampBytes(com.google.protobuf.ByteString byteString) {
            com.google.protobuf.GeneratedMessageLite.checkByteStringIsUtf8(byteString);
            this.timestamp_ = byteString.toStringUtf8();
        }

        private void setViewNameBytes(com.google.protobuf.ByteString byteString) {
            com.google.protobuf.GeneratedMessageLite.checkByteStringIsUtf8(byteString);
            this.viewName_ = byteString.toStringUtf8();
        }

        private void setViewVariantBytes(com.google.protobuf.ByteString byteString) {
            com.google.protobuf.GeneratedMessageLite.checkByteStringIsUtf8(byteString);
            this.viewVariant_ = byteString.toStringUtf8();
        }

        @Override // com.google.protobuf.GeneratedMessageLite
        public final java.lang.Object dynamicMethod(com.google.protobuf.GeneratedMessageLite.MethodToInvoke methodToInvoke, java.lang.Object obj, java.lang.Object obj2) {
            com.google.protobuf.Parser parser;
            switch (com.plaid.internal.core.protos.link.sdkevents.a.f6094a[methodToInvoke.ordinal()]) {
                case 1:
                    return new com.plaid.internal.core.protos.link.sdkevents.SdkEvent$SDKEvent.Metadata();
                case 2:
                    return new com.plaid.internal.core.protos.link.sdkevents.SdkEvent.SDKEvent.Metadata.a();
                case 3:
                    return com.google.protobuf.GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0013\u0000\u0000\u0001\u0013\u0013\u0000\u0000\u0000\u0001Ȉ\u0002Ȉ\u0003Ȉ\u0004Ȉ\u0005Ȉ\u0006Ȉ\u0007Ȉ\bȈ\tȈ\nȈ\u000bȈ\fȈ\rȈ\u000eȈ\u000fȈ\u0010Ȉ\u0011Ȉ\u0012Ȉ\u0013Ȉ", new java.lang.Object[]{"errorCode_", "errorMessage_", "errorType_", "exitStatus_", "institutionId_", "institutionName_", "institutionSearchQuery_", "requestId_", "linkSessionId_", "mfaType_", "viewName_", "timestamp_", "selection_", "brandName_", "matchReason_", "routingNumber_", "accountNumberMask_", "viewVariant_", "isUpdateMode_"});
                case 4:
                    return DEFAULT_INSTANCE;
                case 5:
                    com.google.protobuf.Parser<com.plaid.internal.core.protos.link.sdkevents.SdkEvent$SDKEvent.Metadata> parser2 = PARSER;
                    if (parser2 != null) {
                        return parser2;
                    }
                    synchronized (com.plaid.internal.core.protos.link.sdkevents.SdkEvent$SDKEvent.Metadata.class) {
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

        public final java.lang.String getAccountNumberMask() {
            return this.accountNumberMask_;
        }

        public final com.google.protobuf.ByteString getAccountNumberMaskBytes() {
            return com.google.protobuf.ByteString.copyFromUtf8(this.accountNumberMask_);
        }

        public final java.lang.String getBrandName() {
            return this.brandName_;
        }

        public final com.google.protobuf.ByteString getBrandNameBytes() {
            return com.google.protobuf.ByteString.copyFromUtf8(this.brandName_);
        }

        public final java.lang.String getErrorCode() {
            return this.errorCode_;
        }

        public final com.google.protobuf.ByteString getErrorCodeBytes() {
            return com.google.protobuf.ByteString.copyFromUtf8(this.errorCode_);
        }

        public final java.lang.String getErrorMessage() {
            return this.errorMessage_;
        }

        public final com.google.protobuf.ByteString getErrorMessageBytes() {
            return com.google.protobuf.ByteString.copyFromUtf8(this.errorMessage_);
        }

        public final java.lang.String getErrorType() {
            return this.errorType_;
        }

        public final com.google.protobuf.ByteString getErrorTypeBytes() {
            return com.google.protobuf.ByteString.copyFromUtf8(this.errorType_);
        }

        public final java.lang.String getExitStatus() {
            return this.exitStatus_;
        }

        public final com.google.protobuf.ByteString getExitStatusBytes() {
            return com.google.protobuf.ByteString.copyFromUtf8(this.exitStatus_);
        }

        public final java.lang.String getInstitutionId() {
            return this.institutionId_;
        }

        public final com.google.protobuf.ByteString getInstitutionIdBytes() {
            return com.google.protobuf.ByteString.copyFromUtf8(this.institutionId_);
        }

        public final java.lang.String getInstitutionName() {
            return this.institutionName_;
        }

        public final com.google.protobuf.ByteString getInstitutionNameBytes() {
            return com.google.protobuf.ByteString.copyFromUtf8(this.institutionName_);
        }

        public final java.lang.String getInstitutionSearchQuery() {
            return this.institutionSearchQuery_;
        }

        public final com.google.protobuf.ByteString getInstitutionSearchQueryBytes() {
            return com.google.protobuf.ByteString.copyFromUtf8(this.institutionSearchQuery_);
        }

        public final java.lang.String getIsUpdateMode() {
            return this.isUpdateMode_;
        }

        public final com.google.protobuf.ByteString getIsUpdateModeBytes() {
            return com.google.protobuf.ByteString.copyFromUtf8(this.isUpdateMode_);
        }

        public final java.lang.String getLinkSessionId() {
            return this.linkSessionId_;
        }

        public final com.google.protobuf.ByteString getLinkSessionIdBytes() {
            return com.google.protobuf.ByteString.copyFromUtf8(this.linkSessionId_);
        }

        public final java.lang.String getMatchReason() {
            return this.matchReason_;
        }

        public final com.google.protobuf.ByteString getMatchReasonBytes() {
            return com.google.protobuf.ByteString.copyFromUtf8(this.matchReason_);
        }

        public final java.lang.String getMfaType() {
            return this.mfaType_;
        }

        public final com.google.protobuf.ByteString getMfaTypeBytes() {
            return com.google.protobuf.ByteString.copyFromUtf8(this.mfaType_);
        }

        public final java.lang.String getRequestId() {
            return this.requestId_;
        }

        public final com.google.protobuf.ByteString getRequestIdBytes() {
            return com.google.protobuf.ByteString.copyFromUtf8(this.requestId_);
        }

        public final java.lang.String getRoutingNumber() {
            return this.routingNumber_;
        }

        public final com.google.protobuf.ByteString getRoutingNumberBytes() {
            return com.google.protobuf.ByteString.copyFromUtf8(this.routingNumber_);
        }

        public final java.lang.String getSelection() {
            return this.selection_;
        }

        public final com.google.protobuf.ByteString getSelectionBytes() {
            return com.google.protobuf.ByteString.copyFromUtf8(this.selection_);
        }

        public final java.lang.String getTimestamp() {
            return this.timestamp_;
        }

        public final com.google.protobuf.ByteString getTimestampBytes() {
            return com.google.protobuf.ByteString.copyFromUtf8(this.timestamp_);
        }

        public final java.lang.String getViewName() {
            return this.viewName_;
        }

        public final com.google.protobuf.ByteString getViewNameBytes() {
            return com.google.protobuf.ByteString.copyFromUtf8(this.viewName_);
        }

        public final java.lang.String getViewVariant() {
            return this.viewVariant_;
        }

        public final com.google.protobuf.ByteString getViewVariantBytes() {
            return com.google.protobuf.ByteString.copyFromUtf8(this.viewVariant_);
        }

        public static com.plaid.internal.core.protos.link.sdkevents.SdkEvent.SDKEvent.Metadata.a newBuilder(com.plaid.internal.core.protos.link.sdkevents.SdkEvent$SDKEvent.Metadata metadata) {
            return DEFAULT_INSTANCE.createBuilder(metadata);
        }

        public static com.plaid.internal.core.protos.link.sdkevents.SdkEvent$SDKEvent.Metadata parseDelimitedFrom(java.io.InputStream inputStream, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) {
            return (com.plaid.internal.core.protos.link.sdkevents.SdkEvent$SDKEvent.Metadata) com.google.protobuf.GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
        }

        public static com.plaid.internal.core.protos.link.sdkevents.SdkEvent$SDKEvent.Metadata parseFrom(java.nio.ByteBuffer byteBuffer, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) {
            return (com.plaid.internal.core.protos.link.sdkevents.SdkEvent$SDKEvent.Metadata) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
        }

        public static com.plaid.internal.core.protos.link.sdkevents.SdkEvent$SDKEvent.Metadata parseFrom(com.google.protobuf.ByteString byteString) {
            return (com.plaid.internal.core.protos.link.sdkevents.SdkEvent$SDKEvent.Metadata) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
        }

        private void setAccountNumberMask(java.lang.String str) {
            this.accountNumberMask_ = str;
        }

        private void setBrandName(java.lang.String str) {
            this.brandName_ = str;
        }

        private void setErrorCode(java.lang.String str) {
            this.errorCode_ = str;
        }

        private void setErrorMessage(java.lang.String str) {
            this.errorMessage_ = str;
        }

        private void setErrorType(java.lang.String str) {
            this.errorType_ = str;
        }

        private void setExitStatus(java.lang.String str) {
            this.exitStatus_ = str;
        }

        private void setInstitutionId(java.lang.String str) {
            this.institutionId_ = str;
        }

        private void setInstitutionName(java.lang.String str) {
            this.institutionName_ = str;
        }

        private void setInstitutionSearchQuery(java.lang.String str) {
            this.institutionSearchQuery_ = str;
        }

        private void setIsUpdateMode(java.lang.String str) {
            this.isUpdateMode_ = str;
        }

        private void setLinkSessionId(java.lang.String str) {
            this.linkSessionId_ = str;
        }

        private void setMatchReason(java.lang.String str) {
            this.matchReason_ = str;
        }

        private void setMfaType(java.lang.String str) {
            this.mfaType_ = str;
        }

        private void setRequestId(java.lang.String str) {
            this.requestId_ = str;
        }

        private void setRoutingNumber(java.lang.String str) {
            this.routingNumber_ = str;
        }

        private void setSelection(java.lang.String str) {
            this.selection_ = str;
        }

        private void setTimestamp(java.lang.String str) {
            this.timestamp_ = str;
        }

        private void setViewName(java.lang.String str) {
            this.viewName_ = str;
        }

        private void setViewVariant(java.lang.String str) {
            this.viewVariant_ = str;
        }

        public static com.plaid.internal.core.protos.link.sdkevents.SdkEvent$SDKEvent.Metadata parseFrom(com.google.protobuf.ByteString byteString, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) {
            return (com.plaid.internal.core.protos.link.sdkevents.SdkEvent$SDKEvent.Metadata) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
        }

        public static com.plaid.internal.core.protos.link.sdkevents.SdkEvent$SDKEvent.Metadata parseFrom(byte[] bArr) {
            return (com.plaid.internal.core.protos.link.sdkevents.SdkEvent$SDKEvent.Metadata) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
        }

        public static com.plaid.internal.core.protos.link.sdkevents.SdkEvent$SDKEvent.Metadata parseFrom(byte[] bArr, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) {
            return (com.plaid.internal.core.protos.link.sdkevents.SdkEvent$SDKEvent.Metadata) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
        }

        public static com.plaid.internal.core.protos.link.sdkevents.SdkEvent$SDKEvent.Metadata parseFrom(java.io.InputStream inputStream) {
            return (com.plaid.internal.core.protos.link.sdkevents.SdkEvent$SDKEvent.Metadata) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static com.plaid.internal.core.protos.link.sdkevents.SdkEvent$SDKEvent.Metadata parseFrom(java.io.InputStream inputStream, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) {
            return (com.plaid.internal.core.protos.link.sdkevents.SdkEvent$SDKEvent.Metadata) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
        }

        public static com.plaid.internal.core.protos.link.sdkevents.SdkEvent$SDKEvent.Metadata parseFrom(com.google.protobuf.CodedInputStream codedInputStream) {
            return (com.plaid.internal.core.protos.link.sdkevents.SdkEvent$SDKEvent.Metadata) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
        }

        public static com.plaid.internal.core.protos.link.sdkevents.SdkEvent$SDKEvent.Metadata parseFrom(com.google.protobuf.CodedInputStream codedInputStream, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) {
            return (com.plaid.internal.core.protos.link.sdkevents.SdkEvent$SDKEvent.Metadata) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
        }
    }

    public static final class a extends com.google.protobuf.GeneratedMessageLite.Builder<com.plaid.internal.core.protos.link.sdkevents.SdkEvent$SDKEvent, com.plaid.internal.core.protos.link.sdkevents.SdkEvent$SDKEvent.a> implements com.plaid.internal.core.protos.link.sdkevents.b {
        public a() {
            super(com.plaid.internal.core.protos.link.sdkevents.SdkEvent$SDKEvent.DEFAULT_INSTANCE);
        }
    }

    public enum b implements com.google.protobuf.Internal.EnumLite {
        QUEUE_BEHAVIOR_UNKNOWN(0),
        QUEUE_BEHAVIOR_NO_ENQUEUE(1),
        QUEUE_BEHAVIOR_ENQUEUE(2),
        QUEUE_BEHAVIOR_ENQUEUE_AND_FLUSH(3),
        UNRECOGNIZED(-1);

        public static final int QUEUE_BEHAVIOR_ENQUEUE_AND_FLUSH_VALUE = 3;
        public static final int QUEUE_BEHAVIOR_ENQUEUE_VALUE = 2;
        public static final int QUEUE_BEHAVIOR_NO_ENQUEUE_VALUE = 1;
        public static final int QUEUE_BEHAVIOR_UNKNOWN_VALUE = 0;
        public static final com.plaid.internal.core.protos.link.sdkevents.SdkEvent.SDKEvent.b.a b = new com.plaid.internal.core.protos.link.sdkevents.SdkEvent.SDKEvent.b.a();

        /* renamed from: a, reason: collision with root package name */
        public final int f6091a;

        public final class a implements com.google.protobuf.Internal.EnumLiteMap<com.plaid.internal.core.protos.link.sdkevents.SdkEvent$SDKEvent.b> {
            @Override // com.google.protobuf.Internal.EnumLiteMap
            public final com.plaid.internal.core.protos.link.sdkevents.SdkEvent$SDKEvent.b findValueByNumber(int i) {
                return com.plaid.internal.core.protos.link.sdkevents.SdkEvent$SDKEvent.b.forNumber(i);
            }
        }

        /* renamed from: com.plaid.internal.core.protos.link.sdkevents.SdkEvent$SDKEvent$b$b, reason: collision with other inner class name */
        public static final class C0171b implements com.google.protobuf.Internal.EnumVerifier {

            /* renamed from: a, reason: collision with root package name */
            public static final com.plaid.internal.core.protos.link.sdkevents.SdkEvent$SDKEvent.b.C0171b f6092a = new com.plaid.internal.core.protos.link.sdkevents.SdkEvent$SDKEvent.b.C0171b();

            @Override // com.google.protobuf.Internal.EnumVerifier
            public final boolean isInRange(int i) {
                return com.plaid.internal.core.protos.link.sdkevents.SdkEvent$SDKEvent.b.forNumber(i) != null;
            }
        }

        b(int i) {
            this.f6091a = i;
        }

        public static com.plaid.internal.core.protos.link.sdkevents.SdkEvent$SDKEvent.b forNumber(int i) {
            if (i == 0) {
                return QUEUE_BEHAVIOR_UNKNOWN;
            }
            if (i == 1) {
                return QUEUE_BEHAVIOR_NO_ENQUEUE;
            }
            if (i == 2) {
                return QUEUE_BEHAVIOR_ENQUEUE;
            }
            if (i != 3) {
                return null;
            }
            return QUEUE_BEHAVIOR_ENQUEUE_AND_FLUSH;
        }

        public static com.google.protobuf.Internal.EnumLiteMap<com.plaid.internal.core.protos.link.sdkevents.SdkEvent$SDKEvent.b> internalGetValueMap() {
            return b;
        }

        public static com.google.protobuf.Internal.EnumVerifier internalGetVerifier() {
            return com.plaid.internal.core.protos.link.sdkevents.SdkEvent$SDKEvent.b.C0171b.f6092a;
        }

        @Override // com.google.protobuf.Internal.EnumLite
        public final int getNumber() {
            if (this != UNRECOGNIZED) {
                return this.f6091a;
            }
            throw new java.lang.IllegalArgumentException("Can't get the number of an unknown enum value.");
        }

        @java.lang.Deprecated
        public static com.plaid.internal.core.protos.link.sdkevents.SdkEvent$SDKEvent.b valueOf(int i) {
            return forNumber(i);
        }
    }

    public enum c {
        DELAY_MS(4),
        QUEUE_BEHAVIOR(5),
        TRIGGERBEHAVIOR_NOT_SET(0);


        /* renamed from: a, reason: collision with root package name */
        public final int f6093a;

        c(int i) {
            this.f6093a = i;
        }

        public static com.plaid.internal.core.protos.link.sdkevents.SdkEvent$SDKEvent.c forNumber(int i) {
            if (i == 0) {
                return TRIGGERBEHAVIOR_NOT_SET;
            }
            if (i == 4) {
                return DELAY_MS;
            }
            if (i != 5) {
                return null;
            }
            return QUEUE_BEHAVIOR;
        }

        public final int getNumber() {
            return this.f6093a;
        }

        @java.lang.Deprecated
        public static com.plaid.internal.core.protos.link.sdkevents.SdkEvent$SDKEvent.c valueOf(int i) {
            return forNumber(i);
        }
    }

    static {
        com.plaid.internal.core.protos.link.sdkevents.SdkEvent$SDKEvent sdkEvent$SDKEvent = new com.plaid.internal.core.protos.link.sdkevents.SdkEvent$SDKEvent();
        DEFAULT_INSTANCE = sdkEvent$SDKEvent;
        com.google.protobuf.GeneratedMessageLite.registerDefaultInstance(com.plaid.internal.core.protos.link.sdkevents.SdkEvent$SDKEvent.class, sdkEvent$SDKEvent);
    }

    private SdkEvent$SDKEvent() {
    }

    private void clearDelayMs() {
        if (this.triggerBehaviorCase_ == 4) {
            this.triggerBehaviorCase_ = 0;
            this.triggerBehavior_ = null;
        }
    }

    private void clearEventName() {
        this.eventName_ = getDefaultInstance().getEventName();
    }

    private void clearMetadata() {
        this.metadata_ = null;
        this.bitField0_ &= -2;
    }

    private void clearQueueBehavior() {
        if (this.triggerBehaviorCase_ == 5) {
            this.triggerBehaviorCase_ = 0;
            this.triggerBehavior_ = null;
        }
    }

    private void clearTriggerBehavior() {
        this.triggerBehaviorCase_ = 0;
        this.triggerBehavior_ = null;
    }

    private void clearWebviewRedirectUri() {
        this.webviewRedirectUri_ = getDefaultInstance().getWebviewRedirectUri();
    }

    public static com.plaid.internal.core.protos.link.sdkevents.SdkEvent$SDKEvent getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static com.plaid.internal.core.protos.link.sdkevents.SdkEvent$SDKEvent.a newBuilder() {
        return DEFAULT_INSTANCE.createBuilder();
    }

    public static com.plaid.internal.core.protos.link.sdkevents.SdkEvent$SDKEvent parseDelimitedFrom(java.io.InputStream inputStream) {
        return (com.plaid.internal.core.protos.link.sdkevents.SdkEvent$SDKEvent) com.google.protobuf.GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static com.plaid.internal.core.protos.link.sdkevents.SdkEvent$SDKEvent parseFrom(java.nio.ByteBuffer byteBuffer) {
        return (com.plaid.internal.core.protos.link.sdkevents.SdkEvent$SDKEvent) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static com.google.protobuf.Parser<com.plaid.internal.core.protos.link.sdkevents.SdkEvent$SDKEvent> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    private void setDelayMs(int i) {
        this.triggerBehaviorCase_ = 4;
        this.triggerBehavior_ = java.lang.Integer.valueOf(i);
    }

    private void setEventNameBytes(com.google.protobuf.ByteString byteString) {
        com.google.protobuf.GeneratedMessageLite.checkByteStringIsUtf8(byteString);
        this.eventName_ = byteString.toStringUtf8();
    }

    private void setQueueBehavior(com.plaid.internal.core.protos.link.sdkevents.SdkEvent$SDKEvent.b bVar) {
        this.triggerBehavior_ = java.lang.Integer.valueOf(bVar.getNumber());
        this.triggerBehaviorCase_ = 5;
    }

    private void setQueueBehaviorValue(int i) {
        this.triggerBehaviorCase_ = 5;
        this.triggerBehavior_ = java.lang.Integer.valueOf(i);
    }

    private void setWebviewRedirectUriBytes(com.google.protobuf.ByteString byteString) {
        com.google.protobuf.GeneratedMessageLite.checkByteStringIsUtf8(byteString);
        this.webviewRedirectUri_ = byteString.toStringUtf8();
    }

    @Override // com.google.protobuf.GeneratedMessageLite
    public final java.lang.Object dynamicMethod(com.google.protobuf.GeneratedMessageLite.MethodToInvoke methodToInvoke, java.lang.Object obj, java.lang.Object obj2) {
        com.google.protobuf.Parser parser;
        switch (com.plaid.internal.core.protos.link.sdkevents.a.f6094a[methodToInvoke.ordinal()]) {
            case 1:
                return new com.plaid.internal.core.protos.link.sdkevents.SdkEvent$SDKEvent();
            case 2:
                return new com.plaid.internal.core.protos.link.sdkevents.SdkEvent$SDKEvent.a();
            case 3:
                return com.google.protobuf.GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0005\u0001\u0001\u0001\u0005\u0005\u0000\u0000\u0000\u0001Ȉ\u0002ဉ\u0000\u0003Ȉ\u00047\u0000\u0005?\u0000", new java.lang.Object[]{"triggerBehavior_", "triggerBehaviorCase_", "bitField0_", "eventName_", "metadata_", "webviewRedirectUri_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                com.google.protobuf.Parser<com.plaid.internal.core.protos.link.sdkevents.SdkEvent$SDKEvent> parser2 = PARSER;
                if (parser2 != null) {
                    return parser2;
                }
                synchronized (com.plaid.internal.core.protos.link.sdkevents.SdkEvent$SDKEvent.class) {
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

    public final int getDelayMs() {
        if (this.triggerBehaviorCase_ == 4) {
            return ((java.lang.Integer) this.triggerBehavior_).intValue();
        }
        return 0;
    }

    public final java.lang.String getEventName() {
        return this.eventName_;
    }

    public final com.google.protobuf.ByteString getEventNameBytes() {
        return com.google.protobuf.ByteString.copyFromUtf8(this.eventName_);
    }

    public final com.plaid.internal.core.protos.link.sdkevents.SdkEvent$SDKEvent.Metadata getMetadata() {
        com.plaid.internal.core.protos.link.sdkevents.SdkEvent$SDKEvent.Metadata metadata = this.metadata_;
        return metadata == null ? com.plaid.internal.core.protos.link.sdkevents.SdkEvent$SDKEvent.Metadata.getDefaultInstance() : metadata;
    }

    public final com.plaid.internal.core.protos.link.sdkevents.SdkEvent$SDKEvent.b getQueueBehavior() {
        if (this.triggerBehaviorCase_ != 5) {
            return com.plaid.internal.core.protos.link.sdkevents.SdkEvent$SDKEvent.b.QUEUE_BEHAVIOR_UNKNOWN;
        }
        com.plaid.internal.core.protos.link.sdkevents.SdkEvent$SDKEvent.b forNumber = com.plaid.internal.core.protos.link.sdkevents.SdkEvent$SDKEvent.b.forNumber(((java.lang.Integer) this.triggerBehavior_).intValue());
        return forNumber == null ? com.plaid.internal.core.protos.link.sdkevents.SdkEvent$SDKEvent.b.UNRECOGNIZED : forNumber;
    }

    public final int getQueueBehaviorValue() {
        if (this.triggerBehaviorCase_ == 5) {
            return ((java.lang.Integer) this.triggerBehavior_).intValue();
        }
        return 0;
    }

    public final com.plaid.internal.core.protos.link.sdkevents.SdkEvent$SDKEvent.c getTriggerBehaviorCase() {
        return com.plaid.internal.core.protos.link.sdkevents.SdkEvent$SDKEvent.c.forNumber(this.triggerBehaviorCase_);
    }

    public final java.lang.String getWebviewRedirectUri() {
        return this.webviewRedirectUri_;
    }

    public final com.google.protobuf.ByteString getWebviewRedirectUriBytes() {
        return com.google.protobuf.ByteString.copyFromUtf8(this.webviewRedirectUri_);
    }

    public final boolean hasDelayMs() {
        return this.triggerBehaviorCase_ == 4;
    }

    public final boolean hasMetadata() {
        return (this.bitField0_ & 1) != 0;
    }

    public final boolean hasQueueBehavior() {
        return this.triggerBehaviorCase_ == 5;
    }

    private void mergeMetadata(com.plaid.internal.core.protos.link.sdkevents.SdkEvent$SDKEvent.Metadata metadata) {
        com.plaid.internal.core.protos.link.sdkevents.SdkEvent$SDKEvent.Metadata metadata2 = this.metadata_;
        if (metadata2 == null || metadata2 == com.plaid.internal.core.protos.link.sdkevents.SdkEvent$SDKEvent.Metadata.getDefaultInstance()) {
            this.metadata_ = metadata;
        } else {
            this.metadata_ = com.plaid.internal.core.protos.link.sdkevents.SdkEvent$SDKEvent.Metadata.newBuilder(this.metadata_).mergeFrom((com.plaid.internal.core.protos.link.sdkevents.SdkEvent.SDKEvent.Metadata.a) metadata).buildPartial();
        }
        this.bitField0_ |= 1;
    }

    public static com.plaid.internal.core.protos.link.sdkevents.SdkEvent$SDKEvent.a newBuilder(com.plaid.internal.core.protos.link.sdkevents.SdkEvent$SDKEvent sdkEvent$SDKEvent) {
        return DEFAULT_INSTANCE.createBuilder(sdkEvent$SDKEvent);
    }

    public static com.plaid.internal.core.protos.link.sdkevents.SdkEvent$SDKEvent parseDelimitedFrom(java.io.InputStream inputStream, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) {
        return (com.plaid.internal.core.protos.link.sdkevents.SdkEvent$SDKEvent) com.google.protobuf.GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static com.plaid.internal.core.protos.link.sdkevents.SdkEvent$SDKEvent parseFrom(java.nio.ByteBuffer byteBuffer, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) {
        return (com.plaid.internal.core.protos.link.sdkevents.SdkEvent$SDKEvent) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
    }

    private void setMetadata(com.plaid.internal.core.protos.link.sdkevents.SdkEvent$SDKEvent.Metadata metadata) {
        this.metadata_ = metadata;
        this.bitField0_ |= 1;
    }

    public static com.plaid.internal.core.protos.link.sdkevents.SdkEvent$SDKEvent parseFrom(com.google.protobuf.ByteString byteString) {
        return (com.plaid.internal.core.protos.link.sdkevents.SdkEvent$SDKEvent) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
    }

    private void setEventName(java.lang.String str) {
        this.eventName_ = str;
    }

    private void setWebviewRedirectUri(java.lang.String str) {
        this.webviewRedirectUri_ = str;
    }

    public static com.plaid.internal.core.protos.link.sdkevents.SdkEvent$SDKEvent parseFrom(com.google.protobuf.ByteString byteString, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) {
        return (com.plaid.internal.core.protos.link.sdkevents.SdkEvent$SDKEvent) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
    }

    public static com.plaid.internal.core.protos.link.sdkevents.SdkEvent$SDKEvent parseFrom(byte[] bArr) {
        return (com.plaid.internal.core.protos.link.sdkevents.SdkEvent$SDKEvent) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static com.plaid.internal.core.protos.link.sdkevents.SdkEvent$SDKEvent parseFrom(byte[] bArr, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) {
        return (com.plaid.internal.core.protos.link.sdkevents.SdkEvent$SDKEvent) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
    }

    public static com.plaid.internal.core.protos.link.sdkevents.SdkEvent$SDKEvent parseFrom(java.io.InputStream inputStream) {
        return (com.plaid.internal.core.protos.link.sdkevents.SdkEvent$SDKEvent) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static com.plaid.internal.core.protos.link.sdkevents.SdkEvent$SDKEvent parseFrom(java.io.InputStream inputStream, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) {
        return (com.plaid.internal.core.protos.link.sdkevents.SdkEvent$SDKEvent) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static com.plaid.internal.core.protos.link.sdkevents.SdkEvent$SDKEvent parseFrom(com.google.protobuf.CodedInputStream codedInputStream) {
        return (com.plaid.internal.core.protos.link.sdkevents.SdkEvent$SDKEvent) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
    }

    public static com.plaid.internal.core.protos.link.sdkevents.SdkEvent$SDKEvent parseFrom(com.google.protobuf.CodedInputStream codedInputStream, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) {
        return (com.plaid.internal.core.protos.link.sdkevents.SdkEvent$SDKEvent) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
    }
}
