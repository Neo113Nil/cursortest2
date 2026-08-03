package com.moloco.sdk;

/* loaded from: classes5.dex */
public final class IlrdRequest {

    public interface ImpressionLevelRevenueOrBuilder extends com.google.protobuf.MessageLiteOrBuilder {
        java.lang.String getEventId();

        com.google.protobuf.ByteString getEventIdBytes();

        com.moloco.sdk.IlrdRequest.LevelPlayImpression getLevelplay();

        com.moloco.sdk.IlrdRequest.MaxImpression getMax();

        com.moloco.sdk.IlrdRequest.ImpressionLevelRevenue.PlatformCase getPlatformCase();

        java.lang.String getSessionId();

        com.google.protobuf.ByteString getSessionIdBytes();

        boolean hasLevelplay();

        boolean hasMax();
    }

    public interface ImpressionRevenueRequestOrBuilder extends com.google.protobuf.MessageLiteOrBuilder {
        java.lang.String getDeviceId();

        com.google.protobuf.ByteString getDeviceIdBytes();

        com.moloco.sdk.IlrdRequest.ImpressionLevelRevenue getEvents(int i);

        int getEventsCount();

        java.util.List<com.moloco.sdk.IlrdRequest.ImpressionLevelRevenue> getEventsList();

        java.lang.String getIdfv();

        com.google.protobuf.ByteString getIdfvBytes();

        java.lang.String getOs();

        com.google.protobuf.ByteString getOsBytes();

        java.lang.String getPublisherAppId();

        com.google.protobuf.ByteString getPublisherAppIdBytes();

        java.lang.String getPublisherId();

        com.google.protobuf.ByteString getPublisherIdBytes();
    }

    public interface LevelPlayImpressionOrBuilder extends com.google.protobuf.MessageLiteOrBuilder {
        java.lang.String getAb();

        com.google.protobuf.ByteString getAbBytes();

        java.lang.String getAdFormat();

        com.google.protobuf.ByteString getAdFormatBytes();

        java.lang.String getAuctionId();

        com.google.protobuf.ByteString getAuctionIdBytes();

        java.lang.String getCountryCode();

        com.google.protobuf.ByteString getCountryCodeBytes();

        java.lang.String getCreativeId();

        com.google.protobuf.ByteString getCreativeIdBytes();

        java.lang.String getEncryptedCpm();

        com.google.protobuf.ByteString getEncryptedCpmBytes();

        java.lang.String getInstanceId();

        com.google.protobuf.ByteString getInstanceIdBytes();

        java.lang.String getInstanceName();

        com.google.protobuf.ByteString getInstanceNameBytes();

        double getLifetimeRevenue();

        java.lang.String getNetworkName();

        com.google.protobuf.ByteString getNetworkNameBytes();

        java.lang.String getPlacement();

        com.google.protobuf.ByteString getPlacementBytes();

        java.lang.String getPrecision();

        com.google.protobuf.ByteString getPrecisionBytes();

        double getRevenue();

        java.lang.String getSegmentName();

        com.google.protobuf.ByteString getSegmentNameBytes();
    }

    public interface MaxImpressionOrBuilder extends com.google.protobuf.MessageLiteOrBuilder {
        java.lang.String getAdFormat();

        com.google.protobuf.ByteString getAdFormatBytes();

        java.lang.String getCountryCode();

        com.google.protobuf.ByteString getCountryCodeBytes();

        java.lang.String getId();

        com.google.protobuf.ByteString getIdBytes();

        java.lang.String getMaxAdUnitId();

        com.google.protobuf.ByteString getMaxAdUnitIdBytes();

        java.lang.String getNetworkName();

        com.google.protobuf.ByteString getNetworkNameBytes();

        double getRevenue();

        java.lang.String getThirdPartyAdPlacementId();

        com.google.protobuf.ByteString getThirdPartyAdPlacementIdBytes();

        java.lang.String getUserSegment();

        com.google.protobuf.ByteString getUserSegmentBytes();
    }

    public static void registerAllExtensions(com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) {
    }

    private IlrdRequest() {
    }

    public static final class ImpressionRevenueRequest extends com.google.protobuf.GeneratedMessageLite<com.moloco.sdk.IlrdRequest.ImpressionRevenueRequest, com.moloco.sdk.IlrdRequest.ImpressionRevenueRequest.Builder> implements com.moloco.sdk.IlrdRequest.ImpressionRevenueRequestOrBuilder {
        private static final com.moloco.sdk.IlrdRequest.ImpressionRevenueRequest DEFAULT_INSTANCE;
        public static final int DEVICE_ID_FIELD_NUMBER = 1;
        public static final int EVENTS_FIELD_NUMBER = 6;
        public static final int IDFV_FIELD_NUMBER = 2;
        public static final int OS_FIELD_NUMBER = 3;
        private static volatile com.google.protobuf.Parser<com.moloco.sdk.IlrdRequest.ImpressionRevenueRequest> PARSER = null;
        public static final int PUBLISHER_APP_ID_FIELD_NUMBER = 5;
        public static final int PUBLISHER_ID_FIELD_NUMBER = 4;
        private java.lang.String deviceId_ = "";
        private java.lang.String idfv_ = "";
        private java.lang.String os_ = "";
        private java.lang.String publisherId_ = "";
        private java.lang.String publisherAppId_ = "";
        private com.google.protobuf.Internal.ProtobufList<com.moloco.sdk.IlrdRequest.ImpressionLevelRevenue> events_ = emptyProtobufList();

        private ImpressionRevenueRequest() {
        }

        @Override // com.moloco.sdk.IlrdRequest.ImpressionRevenueRequestOrBuilder
        public java.lang.String getDeviceId() {
            return this.deviceId_;
        }

        @Override // com.moloco.sdk.IlrdRequest.ImpressionRevenueRequestOrBuilder
        public com.google.protobuf.ByteString getDeviceIdBytes() {
            return com.google.protobuf.ByteString.copyFromUtf8(this.deviceId_);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setDeviceId(java.lang.String str) {
            str.getClass();
            this.deviceId_ = str;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearDeviceId() {
            this.deviceId_ = getDefaultInstance().getDeviceId();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setDeviceIdBytes(com.google.protobuf.ByteString byteString) {
            checkByteStringIsUtf8(byteString);
            this.deviceId_ = byteString.toStringUtf8();
        }

        @Override // com.moloco.sdk.IlrdRequest.ImpressionRevenueRequestOrBuilder
        public java.lang.String getIdfv() {
            return this.idfv_;
        }

        @Override // com.moloco.sdk.IlrdRequest.ImpressionRevenueRequestOrBuilder
        public com.google.protobuf.ByteString getIdfvBytes() {
            return com.google.protobuf.ByteString.copyFromUtf8(this.idfv_);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setIdfv(java.lang.String str) {
            str.getClass();
            this.idfv_ = str;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearIdfv() {
            this.idfv_ = getDefaultInstance().getIdfv();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setIdfvBytes(com.google.protobuf.ByteString byteString) {
            checkByteStringIsUtf8(byteString);
            this.idfv_ = byteString.toStringUtf8();
        }

        @Override // com.moloco.sdk.IlrdRequest.ImpressionRevenueRequestOrBuilder
        public java.lang.String getOs() {
            return this.os_;
        }

        @Override // com.moloco.sdk.IlrdRequest.ImpressionRevenueRequestOrBuilder
        public com.google.protobuf.ByteString getOsBytes() {
            return com.google.protobuf.ByteString.copyFromUtf8(this.os_);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setOs(java.lang.String str) {
            str.getClass();
            this.os_ = str;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearOs() {
            this.os_ = getDefaultInstance().getOs();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setOsBytes(com.google.protobuf.ByteString byteString) {
            checkByteStringIsUtf8(byteString);
            this.os_ = byteString.toStringUtf8();
        }

        @Override // com.moloco.sdk.IlrdRequest.ImpressionRevenueRequestOrBuilder
        public java.lang.String getPublisherId() {
            return this.publisherId_;
        }

        @Override // com.moloco.sdk.IlrdRequest.ImpressionRevenueRequestOrBuilder
        public com.google.protobuf.ByteString getPublisherIdBytes() {
            return com.google.protobuf.ByteString.copyFromUtf8(this.publisherId_);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setPublisherId(java.lang.String str) {
            str.getClass();
            this.publisherId_ = str;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearPublisherId() {
            this.publisherId_ = getDefaultInstance().getPublisherId();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setPublisherIdBytes(com.google.protobuf.ByteString byteString) {
            checkByteStringIsUtf8(byteString);
            this.publisherId_ = byteString.toStringUtf8();
        }

        @Override // com.moloco.sdk.IlrdRequest.ImpressionRevenueRequestOrBuilder
        public java.lang.String getPublisherAppId() {
            return this.publisherAppId_;
        }

        @Override // com.moloco.sdk.IlrdRequest.ImpressionRevenueRequestOrBuilder
        public com.google.protobuf.ByteString getPublisherAppIdBytes() {
            return com.google.protobuf.ByteString.copyFromUtf8(this.publisherAppId_);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setPublisherAppId(java.lang.String str) {
            str.getClass();
            this.publisherAppId_ = str;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearPublisherAppId() {
            this.publisherAppId_ = getDefaultInstance().getPublisherAppId();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setPublisherAppIdBytes(com.google.protobuf.ByteString byteString) {
            checkByteStringIsUtf8(byteString);
            this.publisherAppId_ = byteString.toStringUtf8();
        }

        @Override // com.moloco.sdk.IlrdRequest.ImpressionRevenueRequestOrBuilder
        public java.util.List<com.moloco.sdk.IlrdRequest.ImpressionLevelRevenue> getEventsList() {
            return this.events_;
        }

        public java.util.List<? extends com.moloco.sdk.IlrdRequest.ImpressionLevelRevenueOrBuilder> getEventsOrBuilderList() {
            return this.events_;
        }

        @Override // com.moloco.sdk.IlrdRequest.ImpressionRevenueRequestOrBuilder
        public int getEventsCount() {
            return this.events_.size();
        }

        @Override // com.moloco.sdk.IlrdRequest.ImpressionRevenueRequestOrBuilder
        public com.moloco.sdk.IlrdRequest.ImpressionLevelRevenue getEvents(int i) {
            return this.events_.get(i);
        }

        public com.moloco.sdk.IlrdRequest.ImpressionLevelRevenueOrBuilder getEventsOrBuilder(int i) {
            return this.events_.get(i);
        }

        private void ensureEventsIsMutable() {
            com.google.protobuf.Internal.ProtobufList<com.moloco.sdk.IlrdRequest.ImpressionLevelRevenue> protobufList = this.events_;
            if (protobufList.isModifiable()) {
                return;
            }
            this.events_ = com.google.protobuf.GeneratedMessageLite.mutableCopy(protobufList);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setEvents(int i, com.moloco.sdk.IlrdRequest.ImpressionLevelRevenue impressionLevelRevenue) {
            impressionLevelRevenue.getClass();
            ensureEventsIsMutable();
            this.events_.set(i, impressionLevelRevenue);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void addEvents(com.moloco.sdk.IlrdRequest.ImpressionLevelRevenue impressionLevelRevenue) {
            impressionLevelRevenue.getClass();
            ensureEventsIsMutable();
            this.events_.add(impressionLevelRevenue);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void addEvents(int i, com.moloco.sdk.IlrdRequest.ImpressionLevelRevenue impressionLevelRevenue) {
            impressionLevelRevenue.getClass();
            ensureEventsIsMutable();
            this.events_.add(i, impressionLevelRevenue);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void addAllEvents(java.lang.Iterable<? extends com.moloco.sdk.IlrdRequest.ImpressionLevelRevenue> iterable) {
            ensureEventsIsMutable();
            com.google.protobuf.AbstractMessageLite.addAll((java.lang.Iterable) iterable, (java.util.List) this.events_);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearEvents() {
            this.events_ = emptyProtobufList();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void removeEvents(int i) {
            ensureEventsIsMutable();
            this.events_.remove(i);
        }

        public static com.moloco.sdk.IlrdRequest.ImpressionRevenueRequest parseFrom(java.nio.ByteBuffer byteBuffer) throws com.google.protobuf.InvalidProtocolBufferException {
            return (com.moloco.sdk.IlrdRequest.ImpressionRevenueRequest) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
        }

        public static com.moloco.sdk.IlrdRequest.ImpressionRevenueRequest parseFrom(java.nio.ByteBuffer byteBuffer, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) throws com.google.protobuf.InvalidProtocolBufferException {
            return (com.moloco.sdk.IlrdRequest.ImpressionRevenueRequest) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
        }

        public static com.moloco.sdk.IlrdRequest.ImpressionRevenueRequest parseFrom(com.google.protobuf.ByteString byteString) throws com.google.protobuf.InvalidProtocolBufferException {
            return (com.moloco.sdk.IlrdRequest.ImpressionRevenueRequest) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
        }

        public static com.moloco.sdk.IlrdRequest.ImpressionRevenueRequest parseFrom(com.google.protobuf.ByteString byteString, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) throws com.google.protobuf.InvalidProtocolBufferException {
            return (com.moloco.sdk.IlrdRequest.ImpressionRevenueRequest) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
        }

        public static com.moloco.sdk.IlrdRequest.ImpressionRevenueRequest parseFrom(byte[] bArr) throws com.google.protobuf.InvalidProtocolBufferException {
            return (com.moloco.sdk.IlrdRequest.ImpressionRevenueRequest) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
        }

        public static com.moloco.sdk.IlrdRequest.ImpressionRevenueRequest parseFrom(byte[] bArr, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) throws com.google.protobuf.InvalidProtocolBufferException {
            return (com.moloco.sdk.IlrdRequest.ImpressionRevenueRequest) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
        }

        public static com.moloco.sdk.IlrdRequest.ImpressionRevenueRequest parseFrom(java.io.InputStream inputStream) throws java.io.IOException {
            return (com.moloco.sdk.IlrdRequest.ImpressionRevenueRequest) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static com.moloco.sdk.IlrdRequest.ImpressionRevenueRequest parseFrom(java.io.InputStream inputStream, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) throws java.io.IOException {
            return (com.moloco.sdk.IlrdRequest.ImpressionRevenueRequest) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
        }

        public static com.moloco.sdk.IlrdRequest.ImpressionRevenueRequest parseDelimitedFrom(java.io.InputStream inputStream) throws java.io.IOException {
            return (com.moloco.sdk.IlrdRequest.ImpressionRevenueRequest) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static com.moloco.sdk.IlrdRequest.ImpressionRevenueRequest parseDelimitedFrom(java.io.InputStream inputStream, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) throws java.io.IOException {
            return (com.moloco.sdk.IlrdRequest.ImpressionRevenueRequest) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
        }

        public static com.moloco.sdk.IlrdRequest.ImpressionRevenueRequest parseFrom(com.google.protobuf.CodedInputStream codedInputStream) throws java.io.IOException {
            return (com.moloco.sdk.IlrdRequest.ImpressionRevenueRequest) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
        }

        public static com.moloco.sdk.IlrdRequest.ImpressionRevenueRequest parseFrom(com.google.protobuf.CodedInputStream codedInputStream, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) throws java.io.IOException {
            return (com.moloco.sdk.IlrdRequest.ImpressionRevenueRequest) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
        }

        public static com.moloco.sdk.IlrdRequest.ImpressionRevenueRequest.Builder newBuilder() {
            return DEFAULT_INSTANCE.createBuilder();
        }

        public static com.moloco.sdk.IlrdRequest.ImpressionRevenueRequest.Builder newBuilder(com.moloco.sdk.IlrdRequest.ImpressionRevenueRequest impressionRevenueRequest) {
            return DEFAULT_INSTANCE.createBuilder(impressionRevenueRequest);
        }

        public static final class Builder extends com.google.protobuf.GeneratedMessageLite.Builder<com.moloco.sdk.IlrdRequest.ImpressionRevenueRequest, com.moloco.sdk.IlrdRequest.ImpressionRevenueRequest.Builder> implements com.moloco.sdk.IlrdRequest.ImpressionRevenueRequestOrBuilder {
            private Builder() {
                super(com.moloco.sdk.IlrdRequest.ImpressionRevenueRequest.DEFAULT_INSTANCE);
            }

            @Override // com.moloco.sdk.IlrdRequest.ImpressionRevenueRequestOrBuilder
            public java.lang.String getDeviceId() {
                return ((com.moloco.sdk.IlrdRequest.ImpressionRevenueRequest) this.instance).getDeviceId();
            }

            @Override // com.moloco.sdk.IlrdRequest.ImpressionRevenueRequestOrBuilder
            public com.google.protobuf.ByteString getDeviceIdBytes() {
                return ((com.moloco.sdk.IlrdRequest.ImpressionRevenueRequest) this.instance).getDeviceIdBytes();
            }

            public com.moloco.sdk.IlrdRequest.ImpressionRevenueRequest.Builder setDeviceId(java.lang.String str) {
                copyOnWrite();
                ((com.moloco.sdk.IlrdRequest.ImpressionRevenueRequest) this.instance).setDeviceId(str);
                return this;
            }

            public com.moloco.sdk.IlrdRequest.ImpressionRevenueRequest.Builder clearDeviceId() {
                copyOnWrite();
                ((com.moloco.sdk.IlrdRequest.ImpressionRevenueRequest) this.instance).clearDeviceId();
                return this;
            }

            public com.moloco.sdk.IlrdRequest.ImpressionRevenueRequest.Builder setDeviceIdBytes(com.google.protobuf.ByteString byteString) {
                copyOnWrite();
                ((com.moloco.sdk.IlrdRequest.ImpressionRevenueRequest) this.instance).setDeviceIdBytes(byteString);
                return this;
            }

            @Override // com.moloco.sdk.IlrdRequest.ImpressionRevenueRequestOrBuilder
            public java.lang.String getIdfv() {
                return ((com.moloco.sdk.IlrdRequest.ImpressionRevenueRequest) this.instance).getIdfv();
            }

            @Override // com.moloco.sdk.IlrdRequest.ImpressionRevenueRequestOrBuilder
            public com.google.protobuf.ByteString getIdfvBytes() {
                return ((com.moloco.sdk.IlrdRequest.ImpressionRevenueRequest) this.instance).getIdfvBytes();
            }

            public com.moloco.sdk.IlrdRequest.ImpressionRevenueRequest.Builder setIdfv(java.lang.String str) {
                copyOnWrite();
                ((com.moloco.sdk.IlrdRequest.ImpressionRevenueRequest) this.instance).setIdfv(str);
                return this;
            }

            public com.moloco.sdk.IlrdRequest.ImpressionRevenueRequest.Builder clearIdfv() {
                copyOnWrite();
                ((com.moloco.sdk.IlrdRequest.ImpressionRevenueRequest) this.instance).clearIdfv();
                return this;
            }

            public com.moloco.sdk.IlrdRequest.ImpressionRevenueRequest.Builder setIdfvBytes(com.google.protobuf.ByteString byteString) {
                copyOnWrite();
                ((com.moloco.sdk.IlrdRequest.ImpressionRevenueRequest) this.instance).setIdfvBytes(byteString);
                return this;
            }

            @Override // com.moloco.sdk.IlrdRequest.ImpressionRevenueRequestOrBuilder
            public java.lang.String getOs() {
                return ((com.moloco.sdk.IlrdRequest.ImpressionRevenueRequest) this.instance).getOs();
            }

            @Override // com.moloco.sdk.IlrdRequest.ImpressionRevenueRequestOrBuilder
            public com.google.protobuf.ByteString getOsBytes() {
                return ((com.moloco.sdk.IlrdRequest.ImpressionRevenueRequest) this.instance).getOsBytes();
            }

            public com.moloco.sdk.IlrdRequest.ImpressionRevenueRequest.Builder setOs(java.lang.String str) {
                copyOnWrite();
                ((com.moloco.sdk.IlrdRequest.ImpressionRevenueRequest) this.instance).setOs(str);
                return this;
            }

            public com.moloco.sdk.IlrdRequest.ImpressionRevenueRequest.Builder clearOs() {
                copyOnWrite();
                ((com.moloco.sdk.IlrdRequest.ImpressionRevenueRequest) this.instance).clearOs();
                return this;
            }

            public com.moloco.sdk.IlrdRequest.ImpressionRevenueRequest.Builder setOsBytes(com.google.protobuf.ByteString byteString) {
                copyOnWrite();
                ((com.moloco.sdk.IlrdRequest.ImpressionRevenueRequest) this.instance).setOsBytes(byteString);
                return this;
            }

            @Override // com.moloco.sdk.IlrdRequest.ImpressionRevenueRequestOrBuilder
            public java.lang.String getPublisherId() {
                return ((com.moloco.sdk.IlrdRequest.ImpressionRevenueRequest) this.instance).getPublisherId();
            }

            @Override // com.moloco.sdk.IlrdRequest.ImpressionRevenueRequestOrBuilder
            public com.google.protobuf.ByteString getPublisherIdBytes() {
                return ((com.moloco.sdk.IlrdRequest.ImpressionRevenueRequest) this.instance).getPublisherIdBytes();
            }

            public com.moloco.sdk.IlrdRequest.ImpressionRevenueRequest.Builder setPublisherId(java.lang.String str) {
                copyOnWrite();
                ((com.moloco.sdk.IlrdRequest.ImpressionRevenueRequest) this.instance).setPublisherId(str);
                return this;
            }

            public com.moloco.sdk.IlrdRequest.ImpressionRevenueRequest.Builder clearPublisherId() {
                copyOnWrite();
                ((com.moloco.sdk.IlrdRequest.ImpressionRevenueRequest) this.instance).clearPublisherId();
                return this;
            }

            public com.moloco.sdk.IlrdRequest.ImpressionRevenueRequest.Builder setPublisherIdBytes(com.google.protobuf.ByteString byteString) {
                copyOnWrite();
                ((com.moloco.sdk.IlrdRequest.ImpressionRevenueRequest) this.instance).setPublisherIdBytes(byteString);
                return this;
            }

            @Override // com.moloco.sdk.IlrdRequest.ImpressionRevenueRequestOrBuilder
            public java.lang.String getPublisherAppId() {
                return ((com.moloco.sdk.IlrdRequest.ImpressionRevenueRequest) this.instance).getPublisherAppId();
            }

            @Override // com.moloco.sdk.IlrdRequest.ImpressionRevenueRequestOrBuilder
            public com.google.protobuf.ByteString getPublisherAppIdBytes() {
                return ((com.moloco.sdk.IlrdRequest.ImpressionRevenueRequest) this.instance).getPublisherAppIdBytes();
            }

            public com.moloco.sdk.IlrdRequest.ImpressionRevenueRequest.Builder setPublisherAppId(java.lang.String str) {
                copyOnWrite();
                ((com.moloco.sdk.IlrdRequest.ImpressionRevenueRequest) this.instance).setPublisherAppId(str);
                return this;
            }

            public com.moloco.sdk.IlrdRequest.ImpressionRevenueRequest.Builder clearPublisherAppId() {
                copyOnWrite();
                ((com.moloco.sdk.IlrdRequest.ImpressionRevenueRequest) this.instance).clearPublisherAppId();
                return this;
            }

            public com.moloco.sdk.IlrdRequest.ImpressionRevenueRequest.Builder setPublisherAppIdBytes(com.google.protobuf.ByteString byteString) {
                copyOnWrite();
                ((com.moloco.sdk.IlrdRequest.ImpressionRevenueRequest) this.instance).setPublisherAppIdBytes(byteString);
                return this;
            }

            @Override // com.moloco.sdk.IlrdRequest.ImpressionRevenueRequestOrBuilder
            public java.util.List<com.moloco.sdk.IlrdRequest.ImpressionLevelRevenue> getEventsList() {
                return java.util.Collections.unmodifiableList(((com.moloco.sdk.IlrdRequest.ImpressionRevenueRequest) this.instance).getEventsList());
            }

            @Override // com.moloco.sdk.IlrdRequest.ImpressionRevenueRequestOrBuilder
            public int getEventsCount() {
                return ((com.moloco.sdk.IlrdRequest.ImpressionRevenueRequest) this.instance).getEventsCount();
            }

            @Override // com.moloco.sdk.IlrdRequest.ImpressionRevenueRequestOrBuilder
            public com.moloco.sdk.IlrdRequest.ImpressionLevelRevenue getEvents(int i) {
                return ((com.moloco.sdk.IlrdRequest.ImpressionRevenueRequest) this.instance).getEvents(i);
            }

            public com.moloco.sdk.IlrdRequest.ImpressionRevenueRequest.Builder setEvents(int i, com.moloco.sdk.IlrdRequest.ImpressionLevelRevenue impressionLevelRevenue) {
                copyOnWrite();
                ((com.moloco.sdk.IlrdRequest.ImpressionRevenueRequest) this.instance).setEvents(i, impressionLevelRevenue);
                return this;
            }

            public com.moloco.sdk.IlrdRequest.ImpressionRevenueRequest.Builder setEvents(int i, com.moloco.sdk.IlrdRequest.ImpressionLevelRevenue.Builder builder) {
                copyOnWrite();
                ((com.moloco.sdk.IlrdRequest.ImpressionRevenueRequest) this.instance).setEvents(i, builder.build());
                return this;
            }

            public com.moloco.sdk.IlrdRequest.ImpressionRevenueRequest.Builder addEvents(com.moloco.sdk.IlrdRequest.ImpressionLevelRevenue impressionLevelRevenue) {
                copyOnWrite();
                ((com.moloco.sdk.IlrdRequest.ImpressionRevenueRequest) this.instance).addEvents(impressionLevelRevenue);
                return this;
            }

            public com.moloco.sdk.IlrdRequest.ImpressionRevenueRequest.Builder addEvents(int i, com.moloco.sdk.IlrdRequest.ImpressionLevelRevenue impressionLevelRevenue) {
                copyOnWrite();
                ((com.moloco.sdk.IlrdRequest.ImpressionRevenueRequest) this.instance).addEvents(i, impressionLevelRevenue);
                return this;
            }

            public com.moloco.sdk.IlrdRequest.ImpressionRevenueRequest.Builder addEvents(com.moloco.sdk.IlrdRequest.ImpressionLevelRevenue.Builder builder) {
                copyOnWrite();
                ((com.moloco.sdk.IlrdRequest.ImpressionRevenueRequest) this.instance).addEvents(builder.build());
                return this;
            }

            public com.moloco.sdk.IlrdRequest.ImpressionRevenueRequest.Builder addEvents(int i, com.moloco.sdk.IlrdRequest.ImpressionLevelRevenue.Builder builder) {
                copyOnWrite();
                ((com.moloco.sdk.IlrdRequest.ImpressionRevenueRequest) this.instance).addEvents(i, builder.build());
                return this;
            }

            public com.moloco.sdk.IlrdRequest.ImpressionRevenueRequest.Builder addAllEvents(java.lang.Iterable<? extends com.moloco.sdk.IlrdRequest.ImpressionLevelRevenue> iterable) {
                copyOnWrite();
                ((com.moloco.sdk.IlrdRequest.ImpressionRevenueRequest) this.instance).addAllEvents(iterable);
                return this;
            }

            public com.moloco.sdk.IlrdRequest.ImpressionRevenueRequest.Builder clearEvents() {
                copyOnWrite();
                ((com.moloco.sdk.IlrdRequest.ImpressionRevenueRequest) this.instance).clearEvents();
                return this;
            }

            public com.moloco.sdk.IlrdRequest.ImpressionRevenueRequest.Builder removeEvents(int i) {
                copyOnWrite();
                ((com.moloco.sdk.IlrdRequest.ImpressionRevenueRequest) this.instance).removeEvents(i);
                return this;
            }
        }

        @Override // com.google.protobuf.GeneratedMessageLite
        protected final java.lang.Object dynamicMethod(com.google.protobuf.GeneratedMessageLite.MethodToInvoke methodToInvoke, java.lang.Object obj, java.lang.Object obj2) {
            switch (com.moloco.sdk.IlrdRequest.AnonymousClass1.$SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke[methodToInvoke.ordinal()]) {
                case 1:
                    return new com.moloco.sdk.IlrdRequest.ImpressionRevenueRequest();
                case 2:
                    return new com.moloco.sdk.IlrdRequest.ImpressionRevenueRequest.Builder();
                case 3:
                    return newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0006\u0000\u0000\u0001\u0006\u0006\u0000\u0001\u0000\u0001Ȉ\u0002Ȉ\u0003Ȉ\u0004Ȉ\u0005Ȉ\u0006\u001b", new java.lang.Object[]{"deviceId_", "idfv_", "os_", "publisherId_", "publisherAppId_", "events_", com.moloco.sdk.IlrdRequest.ImpressionLevelRevenue.class});
                case 4:
                    return DEFAULT_INSTANCE;
                case 5:
                    com.google.protobuf.Parser<com.moloco.sdk.IlrdRequest.ImpressionRevenueRequest> parser = PARSER;
                    if (parser == null) {
                        synchronized (com.moloco.sdk.IlrdRequest.ImpressionRevenueRequest.class) {
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
            com.moloco.sdk.IlrdRequest.ImpressionRevenueRequest impressionRevenueRequest = new com.moloco.sdk.IlrdRequest.ImpressionRevenueRequest();
            DEFAULT_INSTANCE = impressionRevenueRequest;
            com.google.protobuf.GeneratedMessageLite.registerDefaultInstance(com.moloco.sdk.IlrdRequest.ImpressionRevenueRequest.class, impressionRevenueRequest);
        }

        public static com.moloco.sdk.IlrdRequest.ImpressionRevenueRequest getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static com.google.protobuf.Parser<com.moloco.sdk.IlrdRequest.ImpressionRevenueRequest> parser() {
            return DEFAULT_INSTANCE.getParserForType();
        }
    }

    /* renamed from: com.moloco.sdk.IlrdRequest$1, reason: invalid class name */
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

    public static final class ImpressionLevelRevenue extends com.google.protobuf.GeneratedMessageLite<com.moloco.sdk.IlrdRequest.ImpressionLevelRevenue, com.moloco.sdk.IlrdRequest.ImpressionLevelRevenue.Builder> implements com.moloco.sdk.IlrdRequest.ImpressionLevelRevenueOrBuilder {
        private static final com.moloco.sdk.IlrdRequest.ImpressionLevelRevenue DEFAULT_INSTANCE;
        public static final int EVENT_ID_FIELD_NUMBER = 2;
        public static final int LEVELPLAY_FIELD_NUMBER = 4;
        public static final int MAX_FIELD_NUMBER = 3;
        private static volatile com.google.protobuf.Parser<com.moloco.sdk.IlrdRequest.ImpressionLevelRevenue> PARSER = null;
        public static final int SESSION_ID_FIELD_NUMBER = 1;
        private java.lang.Object platform_;
        private int platformCase_ = 0;
        private java.lang.String sessionId_ = "";
        private java.lang.String eventId_ = "";

        private ImpressionLevelRevenue() {
        }

        public enum PlatformCase {
            MAX(3),
            LEVELPLAY(4),
            PLATFORM_NOT_SET(0);

            private final int value;

            PlatformCase(int i) {
                this.value = i;
            }

            @java.lang.Deprecated
            public static com.moloco.sdk.IlrdRequest.ImpressionLevelRevenue.PlatformCase valueOf(int i) {
                return forNumber(i);
            }

            public static com.moloco.sdk.IlrdRequest.ImpressionLevelRevenue.PlatformCase forNumber(int i) {
                if (i == 0) {
                    return PLATFORM_NOT_SET;
                }
                if (i == 3) {
                    return MAX;
                }
                if (i != 4) {
                    return null;
                }
                return LEVELPLAY;
            }

            public int getNumber() {
                return this.value;
            }
        }

        @Override // com.moloco.sdk.IlrdRequest.ImpressionLevelRevenueOrBuilder
        public com.moloco.sdk.IlrdRequest.ImpressionLevelRevenue.PlatformCase getPlatformCase() {
            return com.moloco.sdk.IlrdRequest.ImpressionLevelRevenue.PlatformCase.forNumber(this.platformCase_);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearPlatform() {
            this.platformCase_ = 0;
            this.platform_ = null;
        }

        @Override // com.moloco.sdk.IlrdRequest.ImpressionLevelRevenueOrBuilder
        public java.lang.String getSessionId() {
            return this.sessionId_;
        }

        @Override // com.moloco.sdk.IlrdRequest.ImpressionLevelRevenueOrBuilder
        public com.google.protobuf.ByteString getSessionIdBytes() {
            return com.google.protobuf.ByteString.copyFromUtf8(this.sessionId_);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setSessionId(java.lang.String str) {
            str.getClass();
            this.sessionId_ = str;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearSessionId() {
            this.sessionId_ = getDefaultInstance().getSessionId();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setSessionIdBytes(com.google.protobuf.ByteString byteString) {
            checkByteStringIsUtf8(byteString);
            this.sessionId_ = byteString.toStringUtf8();
        }

        @Override // com.moloco.sdk.IlrdRequest.ImpressionLevelRevenueOrBuilder
        public java.lang.String getEventId() {
            return this.eventId_;
        }

        @Override // com.moloco.sdk.IlrdRequest.ImpressionLevelRevenueOrBuilder
        public com.google.protobuf.ByteString getEventIdBytes() {
            return com.google.protobuf.ByteString.copyFromUtf8(this.eventId_);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setEventId(java.lang.String str) {
            str.getClass();
            this.eventId_ = str;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearEventId() {
            this.eventId_ = getDefaultInstance().getEventId();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setEventIdBytes(com.google.protobuf.ByteString byteString) {
            checkByteStringIsUtf8(byteString);
            this.eventId_ = byteString.toStringUtf8();
        }

        @Override // com.moloco.sdk.IlrdRequest.ImpressionLevelRevenueOrBuilder
        public boolean hasMax() {
            return this.platformCase_ == 3;
        }

        @Override // com.moloco.sdk.IlrdRequest.ImpressionLevelRevenueOrBuilder
        public com.moloco.sdk.IlrdRequest.MaxImpression getMax() {
            if (this.platformCase_ == 3) {
                return (com.moloco.sdk.IlrdRequest.MaxImpression) this.platform_;
            }
            return com.moloco.sdk.IlrdRequest.MaxImpression.getDefaultInstance();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setMax(com.moloco.sdk.IlrdRequest.MaxImpression maxImpression) {
            maxImpression.getClass();
            this.platform_ = maxImpression;
            this.platformCase_ = 3;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void mergeMax(com.moloco.sdk.IlrdRequest.MaxImpression maxImpression) {
            maxImpression.getClass();
            if (this.platformCase_ == 3 && this.platform_ != com.moloco.sdk.IlrdRequest.MaxImpression.getDefaultInstance()) {
                this.platform_ = com.moloco.sdk.IlrdRequest.MaxImpression.newBuilder((com.moloco.sdk.IlrdRequest.MaxImpression) this.platform_).mergeFrom((com.moloco.sdk.IlrdRequest.MaxImpression.Builder) maxImpression).buildPartial();
            } else {
                this.platform_ = maxImpression;
            }
            this.platformCase_ = 3;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearMax() {
            if (this.platformCase_ == 3) {
                this.platformCase_ = 0;
                this.platform_ = null;
            }
        }

        @Override // com.moloco.sdk.IlrdRequest.ImpressionLevelRevenueOrBuilder
        public boolean hasLevelplay() {
            return this.platformCase_ == 4;
        }

        @Override // com.moloco.sdk.IlrdRequest.ImpressionLevelRevenueOrBuilder
        public com.moloco.sdk.IlrdRequest.LevelPlayImpression getLevelplay() {
            if (this.platformCase_ == 4) {
                return (com.moloco.sdk.IlrdRequest.LevelPlayImpression) this.platform_;
            }
            return com.moloco.sdk.IlrdRequest.LevelPlayImpression.getDefaultInstance();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setLevelplay(com.moloco.sdk.IlrdRequest.LevelPlayImpression levelPlayImpression) {
            levelPlayImpression.getClass();
            this.platform_ = levelPlayImpression;
            this.platformCase_ = 4;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void mergeLevelplay(com.moloco.sdk.IlrdRequest.LevelPlayImpression levelPlayImpression) {
            levelPlayImpression.getClass();
            if (this.platformCase_ == 4 && this.platform_ != com.moloco.sdk.IlrdRequest.LevelPlayImpression.getDefaultInstance()) {
                this.platform_ = com.moloco.sdk.IlrdRequest.LevelPlayImpression.newBuilder((com.moloco.sdk.IlrdRequest.LevelPlayImpression) this.platform_).mergeFrom((com.moloco.sdk.IlrdRequest.LevelPlayImpression.Builder) levelPlayImpression).buildPartial();
            } else {
                this.platform_ = levelPlayImpression;
            }
            this.platformCase_ = 4;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearLevelplay() {
            if (this.platformCase_ == 4) {
                this.platformCase_ = 0;
                this.platform_ = null;
            }
        }

        public static com.moloco.sdk.IlrdRequest.ImpressionLevelRevenue parseFrom(java.nio.ByteBuffer byteBuffer) throws com.google.protobuf.InvalidProtocolBufferException {
            return (com.moloco.sdk.IlrdRequest.ImpressionLevelRevenue) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
        }

        public static com.moloco.sdk.IlrdRequest.ImpressionLevelRevenue parseFrom(java.nio.ByteBuffer byteBuffer, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) throws com.google.protobuf.InvalidProtocolBufferException {
            return (com.moloco.sdk.IlrdRequest.ImpressionLevelRevenue) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
        }

        public static com.moloco.sdk.IlrdRequest.ImpressionLevelRevenue parseFrom(com.google.protobuf.ByteString byteString) throws com.google.protobuf.InvalidProtocolBufferException {
            return (com.moloco.sdk.IlrdRequest.ImpressionLevelRevenue) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
        }

        public static com.moloco.sdk.IlrdRequest.ImpressionLevelRevenue parseFrom(com.google.protobuf.ByteString byteString, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) throws com.google.protobuf.InvalidProtocolBufferException {
            return (com.moloco.sdk.IlrdRequest.ImpressionLevelRevenue) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
        }

        public static com.moloco.sdk.IlrdRequest.ImpressionLevelRevenue parseFrom(byte[] bArr) throws com.google.protobuf.InvalidProtocolBufferException {
            return (com.moloco.sdk.IlrdRequest.ImpressionLevelRevenue) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
        }

        public static com.moloco.sdk.IlrdRequest.ImpressionLevelRevenue parseFrom(byte[] bArr, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) throws com.google.protobuf.InvalidProtocolBufferException {
            return (com.moloco.sdk.IlrdRequest.ImpressionLevelRevenue) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
        }

        public static com.moloco.sdk.IlrdRequest.ImpressionLevelRevenue parseFrom(java.io.InputStream inputStream) throws java.io.IOException {
            return (com.moloco.sdk.IlrdRequest.ImpressionLevelRevenue) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static com.moloco.sdk.IlrdRequest.ImpressionLevelRevenue parseFrom(java.io.InputStream inputStream, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) throws java.io.IOException {
            return (com.moloco.sdk.IlrdRequest.ImpressionLevelRevenue) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
        }

        public static com.moloco.sdk.IlrdRequest.ImpressionLevelRevenue parseDelimitedFrom(java.io.InputStream inputStream) throws java.io.IOException {
            return (com.moloco.sdk.IlrdRequest.ImpressionLevelRevenue) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static com.moloco.sdk.IlrdRequest.ImpressionLevelRevenue parseDelimitedFrom(java.io.InputStream inputStream, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) throws java.io.IOException {
            return (com.moloco.sdk.IlrdRequest.ImpressionLevelRevenue) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
        }

        public static com.moloco.sdk.IlrdRequest.ImpressionLevelRevenue parseFrom(com.google.protobuf.CodedInputStream codedInputStream) throws java.io.IOException {
            return (com.moloco.sdk.IlrdRequest.ImpressionLevelRevenue) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
        }

        public static com.moloco.sdk.IlrdRequest.ImpressionLevelRevenue parseFrom(com.google.protobuf.CodedInputStream codedInputStream, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) throws java.io.IOException {
            return (com.moloco.sdk.IlrdRequest.ImpressionLevelRevenue) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
        }

        public static com.moloco.sdk.IlrdRequest.ImpressionLevelRevenue.Builder newBuilder() {
            return DEFAULT_INSTANCE.createBuilder();
        }

        public static com.moloco.sdk.IlrdRequest.ImpressionLevelRevenue.Builder newBuilder(com.moloco.sdk.IlrdRequest.ImpressionLevelRevenue impressionLevelRevenue) {
            return DEFAULT_INSTANCE.createBuilder(impressionLevelRevenue);
        }

        public static final class Builder extends com.google.protobuf.GeneratedMessageLite.Builder<com.moloco.sdk.IlrdRequest.ImpressionLevelRevenue, com.moloco.sdk.IlrdRequest.ImpressionLevelRevenue.Builder> implements com.moloco.sdk.IlrdRequest.ImpressionLevelRevenueOrBuilder {
            private Builder() {
                super(com.moloco.sdk.IlrdRequest.ImpressionLevelRevenue.DEFAULT_INSTANCE);
            }

            @Override // com.moloco.sdk.IlrdRequest.ImpressionLevelRevenueOrBuilder
            public com.moloco.sdk.IlrdRequest.ImpressionLevelRevenue.PlatformCase getPlatformCase() {
                return ((com.moloco.sdk.IlrdRequest.ImpressionLevelRevenue) this.instance).getPlatformCase();
            }

            public com.moloco.sdk.IlrdRequest.ImpressionLevelRevenue.Builder clearPlatform() {
                copyOnWrite();
                ((com.moloco.sdk.IlrdRequest.ImpressionLevelRevenue) this.instance).clearPlatform();
                return this;
            }

            @Override // com.moloco.sdk.IlrdRequest.ImpressionLevelRevenueOrBuilder
            public java.lang.String getSessionId() {
                return ((com.moloco.sdk.IlrdRequest.ImpressionLevelRevenue) this.instance).getSessionId();
            }

            @Override // com.moloco.sdk.IlrdRequest.ImpressionLevelRevenueOrBuilder
            public com.google.protobuf.ByteString getSessionIdBytes() {
                return ((com.moloco.sdk.IlrdRequest.ImpressionLevelRevenue) this.instance).getSessionIdBytes();
            }

            public com.moloco.sdk.IlrdRequest.ImpressionLevelRevenue.Builder setSessionId(java.lang.String str) {
                copyOnWrite();
                ((com.moloco.sdk.IlrdRequest.ImpressionLevelRevenue) this.instance).setSessionId(str);
                return this;
            }

            public com.moloco.sdk.IlrdRequest.ImpressionLevelRevenue.Builder clearSessionId() {
                copyOnWrite();
                ((com.moloco.sdk.IlrdRequest.ImpressionLevelRevenue) this.instance).clearSessionId();
                return this;
            }

            public com.moloco.sdk.IlrdRequest.ImpressionLevelRevenue.Builder setSessionIdBytes(com.google.protobuf.ByteString byteString) {
                copyOnWrite();
                ((com.moloco.sdk.IlrdRequest.ImpressionLevelRevenue) this.instance).setSessionIdBytes(byteString);
                return this;
            }

            @Override // com.moloco.sdk.IlrdRequest.ImpressionLevelRevenueOrBuilder
            public java.lang.String getEventId() {
                return ((com.moloco.sdk.IlrdRequest.ImpressionLevelRevenue) this.instance).getEventId();
            }

            @Override // com.moloco.sdk.IlrdRequest.ImpressionLevelRevenueOrBuilder
            public com.google.protobuf.ByteString getEventIdBytes() {
                return ((com.moloco.sdk.IlrdRequest.ImpressionLevelRevenue) this.instance).getEventIdBytes();
            }

            public com.moloco.sdk.IlrdRequest.ImpressionLevelRevenue.Builder setEventId(java.lang.String str) {
                copyOnWrite();
                ((com.moloco.sdk.IlrdRequest.ImpressionLevelRevenue) this.instance).setEventId(str);
                return this;
            }

            public com.moloco.sdk.IlrdRequest.ImpressionLevelRevenue.Builder clearEventId() {
                copyOnWrite();
                ((com.moloco.sdk.IlrdRequest.ImpressionLevelRevenue) this.instance).clearEventId();
                return this;
            }

            public com.moloco.sdk.IlrdRequest.ImpressionLevelRevenue.Builder setEventIdBytes(com.google.protobuf.ByteString byteString) {
                copyOnWrite();
                ((com.moloco.sdk.IlrdRequest.ImpressionLevelRevenue) this.instance).setEventIdBytes(byteString);
                return this;
            }

            @Override // com.moloco.sdk.IlrdRequest.ImpressionLevelRevenueOrBuilder
            public boolean hasMax() {
                return ((com.moloco.sdk.IlrdRequest.ImpressionLevelRevenue) this.instance).hasMax();
            }

            @Override // com.moloco.sdk.IlrdRequest.ImpressionLevelRevenueOrBuilder
            public com.moloco.sdk.IlrdRequest.MaxImpression getMax() {
                return ((com.moloco.sdk.IlrdRequest.ImpressionLevelRevenue) this.instance).getMax();
            }

            public com.moloco.sdk.IlrdRequest.ImpressionLevelRevenue.Builder setMax(com.moloco.sdk.IlrdRequest.MaxImpression maxImpression) {
                copyOnWrite();
                ((com.moloco.sdk.IlrdRequest.ImpressionLevelRevenue) this.instance).setMax(maxImpression);
                return this;
            }

            public com.moloco.sdk.IlrdRequest.ImpressionLevelRevenue.Builder setMax(com.moloco.sdk.IlrdRequest.MaxImpression.Builder builder) {
                copyOnWrite();
                ((com.moloco.sdk.IlrdRequest.ImpressionLevelRevenue) this.instance).setMax(builder.build());
                return this;
            }

            public com.moloco.sdk.IlrdRequest.ImpressionLevelRevenue.Builder mergeMax(com.moloco.sdk.IlrdRequest.MaxImpression maxImpression) {
                copyOnWrite();
                ((com.moloco.sdk.IlrdRequest.ImpressionLevelRevenue) this.instance).mergeMax(maxImpression);
                return this;
            }

            public com.moloco.sdk.IlrdRequest.ImpressionLevelRevenue.Builder clearMax() {
                copyOnWrite();
                ((com.moloco.sdk.IlrdRequest.ImpressionLevelRevenue) this.instance).clearMax();
                return this;
            }

            @Override // com.moloco.sdk.IlrdRequest.ImpressionLevelRevenueOrBuilder
            public boolean hasLevelplay() {
                return ((com.moloco.sdk.IlrdRequest.ImpressionLevelRevenue) this.instance).hasLevelplay();
            }

            @Override // com.moloco.sdk.IlrdRequest.ImpressionLevelRevenueOrBuilder
            public com.moloco.sdk.IlrdRequest.LevelPlayImpression getLevelplay() {
                return ((com.moloco.sdk.IlrdRequest.ImpressionLevelRevenue) this.instance).getLevelplay();
            }

            public com.moloco.sdk.IlrdRequest.ImpressionLevelRevenue.Builder setLevelplay(com.moloco.sdk.IlrdRequest.LevelPlayImpression levelPlayImpression) {
                copyOnWrite();
                ((com.moloco.sdk.IlrdRequest.ImpressionLevelRevenue) this.instance).setLevelplay(levelPlayImpression);
                return this;
            }

            public com.moloco.sdk.IlrdRequest.ImpressionLevelRevenue.Builder setLevelplay(com.moloco.sdk.IlrdRequest.LevelPlayImpression.Builder builder) {
                copyOnWrite();
                ((com.moloco.sdk.IlrdRequest.ImpressionLevelRevenue) this.instance).setLevelplay(builder.build());
                return this;
            }

            public com.moloco.sdk.IlrdRequest.ImpressionLevelRevenue.Builder mergeLevelplay(com.moloco.sdk.IlrdRequest.LevelPlayImpression levelPlayImpression) {
                copyOnWrite();
                ((com.moloco.sdk.IlrdRequest.ImpressionLevelRevenue) this.instance).mergeLevelplay(levelPlayImpression);
                return this;
            }

            public com.moloco.sdk.IlrdRequest.ImpressionLevelRevenue.Builder clearLevelplay() {
                copyOnWrite();
                ((com.moloco.sdk.IlrdRequest.ImpressionLevelRevenue) this.instance).clearLevelplay();
                return this;
            }
        }

        @Override // com.google.protobuf.GeneratedMessageLite
        protected final java.lang.Object dynamicMethod(com.google.protobuf.GeneratedMessageLite.MethodToInvoke methodToInvoke, java.lang.Object obj, java.lang.Object obj2) {
            switch (com.moloco.sdk.IlrdRequest.AnonymousClass1.$SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke[methodToInvoke.ordinal()]) {
                case 1:
                    return new com.moloco.sdk.IlrdRequest.ImpressionLevelRevenue();
                case 2:
                    return new com.moloco.sdk.IlrdRequest.ImpressionLevelRevenue.Builder();
                case 3:
                    return newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0004\u0001\u0000\u0001\u0004\u0004\u0000\u0000\u0000\u0001Ȉ\u0002Ȉ\u0003<\u0000\u0004<\u0000", new java.lang.Object[]{"platform_", "platformCase_", "sessionId_", "eventId_", com.moloco.sdk.IlrdRequest.MaxImpression.class, com.moloco.sdk.IlrdRequest.LevelPlayImpression.class});
                case 4:
                    return DEFAULT_INSTANCE;
                case 5:
                    com.google.protobuf.Parser<com.moloco.sdk.IlrdRequest.ImpressionLevelRevenue> parser = PARSER;
                    if (parser == null) {
                        synchronized (com.moloco.sdk.IlrdRequest.ImpressionLevelRevenue.class) {
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
            com.moloco.sdk.IlrdRequest.ImpressionLevelRevenue impressionLevelRevenue = new com.moloco.sdk.IlrdRequest.ImpressionLevelRevenue();
            DEFAULT_INSTANCE = impressionLevelRevenue;
            com.google.protobuf.GeneratedMessageLite.registerDefaultInstance(com.moloco.sdk.IlrdRequest.ImpressionLevelRevenue.class, impressionLevelRevenue);
        }

        public static com.moloco.sdk.IlrdRequest.ImpressionLevelRevenue getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static com.google.protobuf.Parser<com.moloco.sdk.IlrdRequest.ImpressionLevelRevenue> parser() {
            return DEFAULT_INSTANCE.getParserForType();
        }
    }

    public static final class MaxImpression extends com.google.protobuf.GeneratedMessageLite<com.moloco.sdk.IlrdRequest.MaxImpression, com.moloco.sdk.IlrdRequest.MaxImpression.Builder> implements com.moloco.sdk.IlrdRequest.MaxImpressionOrBuilder {
        public static final int AD_FORMAT_FIELD_NUMBER = 1;
        public static final int COUNTRY_CODE_FIELD_NUMBER = 2;
        private static final com.moloco.sdk.IlrdRequest.MaxImpression DEFAULT_INSTANCE;
        public static final int ID_FIELD_NUMBER = 3;
        public static final int MAX_AD_UNIT_ID_FIELD_NUMBER = 4;
        public static final int NETWORK_NAME_FIELD_NUMBER = 5;
        private static volatile com.google.protobuf.Parser<com.moloco.sdk.IlrdRequest.MaxImpression> PARSER = null;
        public static final int REVENUE_FIELD_NUMBER = 6;
        public static final int THIRD_PARTY_AD_PLACEMENT_ID_FIELD_NUMBER = 7;
        public static final int USER_SEGMENT_FIELD_NUMBER = 8;
        private double revenue_;
        private java.lang.String adFormat_ = "";
        private java.lang.String countryCode_ = "";
        private java.lang.String id_ = "";
        private java.lang.String maxAdUnitId_ = "";
        private java.lang.String networkName_ = "";
        private java.lang.String thirdPartyAdPlacementId_ = "";
        private java.lang.String userSegment_ = "";

        private MaxImpression() {
        }

        @Override // com.moloco.sdk.IlrdRequest.MaxImpressionOrBuilder
        public java.lang.String getAdFormat() {
            return this.adFormat_;
        }

        @Override // com.moloco.sdk.IlrdRequest.MaxImpressionOrBuilder
        public com.google.protobuf.ByteString getAdFormatBytes() {
            return com.google.protobuf.ByteString.copyFromUtf8(this.adFormat_);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setAdFormat(java.lang.String str) {
            str.getClass();
            this.adFormat_ = str;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearAdFormat() {
            this.adFormat_ = getDefaultInstance().getAdFormat();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setAdFormatBytes(com.google.protobuf.ByteString byteString) {
            checkByteStringIsUtf8(byteString);
            this.adFormat_ = byteString.toStringUtf8();
        }

        @Override // com.moloco.sdk.IlrdRequest.MaxImpressionOrBuilder
        public java.lang.String getCountryCode() {
            return this.countryCode_;
        }

        @Override // com.moloco.sdk.IlrdRequest.MaxImpressionOrBuilder
        public com.google.protobuf.ByteString getCountryCodeBytes() {
            return com.google.protobuf.ByteString.copyFromUtf8(this.countryCode_);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setCountryCode(java.lang.String str) {
            str.getClass();
            this.countryCode_ = str;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearCountryCode() {
            this.countryCode_ = getDefaultInstance().getCountryCode();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setCountryCodeBytes(com.google.protobuf.ByteString byteString) {
            checkByteStringIsUtf8(byteString);
            this.countryCode_ = byteString.toStringUtf8();
        }

        @Override // com.moloco.sdk.IlrdRequest.MaxImpressionOrBuilder
        public java.lang.String getId() {
            return this.id_;
        }

        @Override // com.moloco.sdk.IlrdRequest.MaxImpressionOrBuilder
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

        @Override // com.moloco.sdk.IlrdRequest.MaxImpressionOrBuilder
        public java.lang.String getMaxAdUnitId() {
            return this.maxAdUnitId_;
        }

        @Override // com.moloco.sdk.IlrdRequest.MaxImpressionOrBuilder
        public com.google.protobuf.ByteString getMaxAdUnitIdBytes() {
            return com.google.protobuf.ByteString.copyFromUtf8(this.maxAdUnitId_);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setMaxAdUnitId(java.lang.String str) {
            str.getClass();
            this.maxAdUnitId_ = str;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearMaxAdUnitId() {
            this.maxAdUnitId_ = getDefaultInstance().getMaxAdUnitId();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setMaxAdUnitIdBytes(com.google.protobuf.ByteString byteString) {
            checkByteStringIsUtf8(byteString);
            this.maxAdUnitId_ = byteString.toStringUtf8();
        }

        @Override // com.moloco.sdk.IlrdRequest.MaxImpressionOrBuilder
        public java.lang.String getNetworkName() {
            return this.networkName_;
        }

        @Override // com.moloco.sdk.IlrdRequest.MaxImpressionOrBuilder
        public com.google.protobuf.ByteString getNetworkNameBytes() {
            return com.google.protobuf.ByteString.copyFromUtf8(this.networkName_);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setNetworkName(java.lang.String str) {
            str.getClass();
            this.networkName_ = str;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearNetworkName() {
            this.networkName_ = getDefaultInstance().getNetworkName();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setNetworkNameBytes(com.google.protobuf.ByteString byteString) {
            checkByteStringIsUtf8(byteString);
            this.networkName_ = byteString.toStringUtf8();
        }

        @Override // com.moloco.sdk.IlrdRequest.MaxImpressionOrBuilder
        public double getRevenue() {
            return this.revenue_;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setRevenue(double d) {
            this.revenue_ = d;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearRevenue() {
            this.revenue_ = 0.0d;
        }

        @Override // com.moloco.sdk.IlrdRequest.MaxImpressionOrBuilder
        public java.lang.String getThirdPartyAdPlacementId() {
            return this.thirdPartyAdPlacementId_;
        }

        @Override // com.moloco.sdk.IlrdRequest.MaxImpressionOrBuilder
        public com.google.protobuf.ByteString getThirdPartyAdPlacementIdBytes() {
            return com.google.protobuf.ByteString.copyFromUtf8(this.thirdPartyAdPlacementId_);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setThirdPartyAdPlacementId(java.lang.String str) {
            str.getClass();
            this.thirdPartyAdPlacementId_ = str;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearThirdPartyAdPlacementId() {
            this.thirdPartyAdPlacementId_ = getDefaultInstance().getThirdPartyAdPlacementId();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setThirdPartyAdPlacementIdBytes(com.google.protobuf.ByteString byteString) {
            checkByteStringIsUtf8(byteString);
            this.thirdPartyAdPlacementId_ = byteString.toStringUtf8();
        }

        @Override // com.moloco.sdk.IlrdRequest.MaxImpressionOrBuilder
        public java.lang.String getUserSegment() {
            return this.userSegment_;
        }

        @Override // com.moloco.sdk.IlrdRequest.MaxImpressionOrBuilder
        public com.google.protobuf.ByteString getUserSegmentBytes() {
            return com.google.protobuf.ByteString.copyFromUtf8(this.userSegment_);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setUserSegment(java.lang.String str) {
            str.getClass();
            this.userSegment_ = str;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearUserSegment() {
            this.userSegment_ = getDefaultInstance().getUserSegment();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setUserSegmentBytes(com.google.protobuf.ByteString byteString) {
            checkByteStringIsUtf8(byteString);
            this.userSegment_ = byteString.toStringUtf8();
        }

        public static com.moloco.sdk.IlrdRequest.MaxImpression parseFrom(java.nio.ByteBuffer byteBuffer) throws com.google.protobuf.InvalidProtocolBufferException {
            return (com.moloco.sdk.IlrdRequest.MaxImpression) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
        }

        public static com.moloco.sdk.IlrdRequest.MaxImpression parseFrom(java.nio.ByteBuffer byteBuffer, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) throws com.google.protobuf.InvalidProtocolBufferException {
            return (com.moloco.sdk.IlrdRequest.MaxImpression) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
        }

        public static com.moloco.sdk.IlrdRequest.MaxImpression parseFrom(com.google.protobuf.ByteString byteString) throws com.google.protobuf.InvalidProtocolBufferException {
            return (com.moloco.sdk.IlrdRequest.MaxImpression) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
        }

        public static com.moloco.sdk.IlrdRequest.MaxImpression parseFrom(com.google.protobuf.ByteString byteString, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) throws com.google.protobuf.InvalidProtocolBufferException {
            return (com.moloco.sdk.IlrdRequest.MaxImpression) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
        }

        public static com.moloco.sdk.IlrdRequest.MaxImpression parseFrom(byte[] bArr) throws com.google.protobuf.InvalidProtocolBufferException {
            return (com.moloco.sdk.IlrdRequest.MaxImpression) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
        }

        public static com.moloco.sdk.IlrdRequest.MaxImpression parseFrom(byte[] bArr, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) throws com.google.protobuf.InvalidProtocolBufferException {
            return (com.moloco.sdk.IlrdRequest.MaxImpression) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
        }

        public static com.moloco.sdk.IlrdRequest.MaxImpression parseFrom(java.io.InputStream inputStream) throws java.io.IOException {
            return (com.moloco.sdk.IlrdRequest.MaxImpression) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static com.moloco.sdk.IlrdRequest.MaxImpression parseFrom(java.io.InputStream inputStream, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) throws java.io.IOException {
            return (com.moloco.sdk.IlrdRequest.MaxImpression) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
        }

        public static com.moloco.sdk.IlrdRequest.MaxImpression parseDelimitedFrom(java.io.InputStream inputStream) throws java.io.IOException {
            return (com.moloco.sdk.IlrdRequest.MaxImpression) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static com.moloco.sdk.IlrdRequest.MaxImpression parseDelimitedFrom(java.io.InputStream inputStream, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) throws java.io.IOException {
            return (com.moloco.sdk.IlrdRequest.MaxImpression) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
        }

        public static com.moloco.sdk.IlrdRequest.MaxImpression parseFrom(com.google.protobuf.CodedInputStream codedInputStream) throws java.io.IOException {
            return (com.moloco.sdk.IlrdRequest.MaxImpression) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
        }

        public static com.moloco.sdk.IlrdRequest.MaxImpression parseFrom(com.google.protobuf.CodedInputStream codedInputStream, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) throws java.io.IOException {
            return (com.moloco.sdk.IlrdRequest.MaxImpression) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
        }

        public static com.moloco.sdk.IlrdRequest.MaxImpression.Builder newBuilder() {
            return DEFAULT_INSTANCE.createBuilder();
        }

        public static com.moloco.sdk.IlrdRequest.MaxImpression.Builder newBuilder(com.moloco.sdk.IlrdRequest.MaxImpression maxImpression) {
            return DEFAULT_INSTANCE.createBuilder(maxImpression);
        }

        public static final class Builder extends com.google.protobuf.GeneratedMessageLite.Builder<com.moloco.sdk.IlrdRequest.MaxImpression, com.moloco.sdk.IlrdRequest.MaxImpression.Builder> implements com.moloco.sdk.IlrdRequest.MaxImpressionOrBuilder {
            private Builder() {
                super(com.moloco.sdk.IlrdRequest.MaxImpression.DEFAULT_INSTANCE);
            }

            @Override // com.moloco.sdk.IlrdRequest.MaxImpressionOrBuilder
            public java.lang.String getAdFormat() {
                return ((com.moloco.sdk.IlrdRequest.MaxImpression) this.instance).getAdFormat();
            }

            @Override // com.moloco.sdk.IlrdRequest.MaxImpressionOrBuilder
            public com.google.protobuf.ByteString getAdFormatBytes() {
                return ((com.moloco.sdk.IlrdRequest.MaxImpression) this.instance).getAdFormatBytes();
            }

            public com.moloco.sdk.IlrdRequest.MaxImpression.Builder setAdFormat(java.lang.String str) {
                copyOnWrite();
                ((com.moloco.sdk.IlrdRequest.MaxImpression) this.instance).setAdFormat(str);
                return this;
            }

            public com.moloco.sdk.IlrdRequest.MaxImpression.Builder clearAdFormat() {
                copyOnWrite();
                ((com.moloco.sdk.IlrdRequest.MaxImpression) this.instance).clearAdFormat();
                return this;
            }

            public com.moloco.sdk.IlrdRequest.MaxImpression.Builder setAdFormatBytes(com.google.protobuf.ByteString byteString) {
                copyOnWrite();
                ((com.moloco.sdk.IlrdRequest.MaxImpression) this.instance).setAdFormatBytes(byteString);
                return this;
            }

            @Override // com.moloco.sdk.IlrdRequest.MaxImpressionOrBuilder
            public java.lang.String getCountryCode() {
                return ((com.moloco.sdk.IlrdRequest.MaxImpression) this.instance).getCountryCode();
            }

            @Override // com.moloco.sdk.IlrdRequest.MaxImpressionOrBuilder
            public com.google.protobuf.ByteString getCountryCodeBytes() {
                return ((com.moloco.sdk.IlrdRequest.MaxImpression) this.instance).getCountryCodeBytes();
            }

            public com.moloco.sdk.IlrdRequest.MaxImpression.Builder setCountryCode(java.lang.String str) {
                copyOnWrite();
                ((com.moloco.sdk.IlrdRequest.MaxImpression) this.instance).setCountryCode(str);
                return this;
            }

            public com.moloco.sdk.IlrdRequest.MaxImpression.Builder clearCountryCode() {
                copyOnWrite();
                ((com.moloco.sdk.IlrdRequest.MaxImpression) this.instance).clearCountryCode();
                return this;
            }

            public com.moloco.sdk.IlrdRequest.MaxImpression.Builder setCountryCodeBytes(com.google.protobuf.ByteString byteString) {
                copyOnWrite();
                ((com.moloco.sdk.IlrdRequest.MaxImpression) this.instance).setCountryCodeBytes(byteString);
                return this;
            }

            @Override // com.moloco.sdk.IlrdRequest.MaxImpressionOrBuilder
            public java.lang.String getId() {
                return ((com.moloco.sdk.IlrdRequest.MaxImpression) this.instance).getId();
            }

            @Override // com.moloco.sdk.IlrdRequest.MaxImpressionOrBuilder
            public com.google.protobuf.ByteString getIdBytes() {
                return ((com.moloco.sdk.IlrdRequest.MaxImpression) this.instance).getIdBytes();
            }

            public com.moloco.sdk.IlrdRequest.MaxImpression.Builder setId(java.lang.String str) {
                copyOnWrite();
                ((com.moloco.sdk.IlrdRequest.MaxImpression) this.instance).setId(str);
                return this;
            }

            public com.moloco.sdk.IlrdRequest.MaxImpression.Builder clearId() {
                copyOnWrite();
                ((com.moloco.sdk.IlrdRequest.MaxImpression) this.instance).clearId();
                return this;
            }

            public com.moloco.sdk.IlrdRequest.MaxImpression.Builder setIdBytes(com.google.protobuf.ByteString byteString) {
                copyOnWrite();
                ((com.moloco.sdk.IlrdRequest.MaxImpression) this.instance).setIdBytes(byteString);
                return this;
            }

            @Override // com.moloco.sdk.IlrdRequest.MaxImpressionOrBuilder
            public java.lang.String getMaxAdUnitId() {
                return ((com.moloco.sdk.IlrdRequest.MaxImpression) this.instance).getMaxAdUnitId();
            }

            @Override // com.moloco.sdk.IlrdRequest.MaxImpressionOrBuilder
            public com.google.protobuf.ByteString getMaxAdUnitIdBytes() {
                return ((com.moloco.sdk.IlrdRequest.MaxImpression) this.instance).getMaxAdUnitIdBytes();
            }

            public com.moloco.sdk.IlrdRequest.MaxImpression.Builder setMaxAdUnitId(java.lang.String str) {
                copyOnWrite();
                ((com.moloco.sdk.IlrdRequest.MaxImpression) this.instance).setMaxAdUnitId(str);
                return this;
            }

            public com.moloco.sdk.IlrdRequest.MaxImpression.Builder clearMaxAdUnitId() {
                copyOnWrite();
                ((com.moloco.sdk.IlrdRequest.MaxImpression) this.instance).clearMaxAdUnitId();
                return this;
            }

            public com.moloco.sdk.IlrdRequest.MaxImpression.Builder setMaxAdUnitIdBytes(com.google.protobuf.ByteString byteString) {
                copyOnWrite();
                ((com.moloco.sdk.IlrdRequest.MaxImpression) this.instance).setMaxAdUnitIdBytes(byteString);
                return this;
            }

            @Override // com.moloco.sdk.IlrdRequest.MaxImpressionOrBuilder
            public java.lang.String getNetworkName() {
                return ((com.moloco.sdk.IlrdRequest.MaxImpression) this.instance).getNetworkName();
            }

            @Override // com.moloco.sdk.IlrdRequest.MaxImpressionOrBuilder
            public com.google.protobuf.ByteString getNetworkNameBytes() {
                return ((com.moloco.sdk.IlrdRequest.MaxImpression) this.instance).getNetworkNameBytes();
            }

            public com.moloco.sdk.IlrdRequest.MaxImpression.Builder setNetworkName(java.lang.String str) {
                copyOnWrite();
                ((com.moloco.sdk.IlrdRequest.MaxImpression) this.instance).setNetworkName(str);
                return this;
            }

            public com.moloco.sdk.IlrdRequest.MaxImpression.Builder clearNetworkName() {
                copyOnWrite();
                ((com.moloco.sdk.IlrdRequest.MaxImpression) this.instance).clearNetworkName();
                return this;
            }

            public com.moloco.sdk.IlrdRequest.MaxImpression.Builder setNetworkNameBytes(com.google.protobuf.ByteString byteString) {
                copyOnWrite();
                ((com.moloco.sdk.IlrdRequest.MaxImpression) this.instance).setNetworkNameBytes(byteString);
                return this;
            }

            @Override // com.moloco.sdk.IlrdRequest.MaxImpressionOrBuilder
            public double getRevenue() {
                return ((com.moloco.sdk.IlrdRequest.MaxImpression) this.instance).getRevenue();
            }

            public com.moloco.sdk.IlrdRequest.MaxImpression.Builder setRevenue(double d) {
                copyOnWrite();
                ((com.moloco.sdk.IlrdRequest.MaxImpression) this.instance).setRevenue(d);
                return this;
            }

            public com.moloco.sdk.IlrdRequest.MaxImpression.Builder clearRevenue() {
                copyOnWrite();
                ((com.moloco.sdk.IlrdRequest.MaxImpression) this.instance).clearRevenue();
                return this;
            }

            @Override // com.moloco.sdk.IlrdRequest.MaxImpressionOrBuilder
            public java.lang.String getThirdPartyAdPlacementId() {
                return ((com.moloco.sdk.IlrdRequest.MaxImpression) this.instance).getThirdPartyAdPlacementId();
            }

            @Override // com.moloco.sdk.IlrdRequest.MaxImpressionOrBuilder
            public com.google.protobuf.ByteString getThirdPartyAdPlacementIdBytes() {
                return ((com.moloco.sdk.IlrdRequest.MaxImpression) this.instance).getThirdPartyAdPlacementIdBytes();
            }

            public com.moloco.sdk.IlrdRequest.MaxImpression.Builder setThirdPartyAdPlacementId(java.lang.String str) {
                copyOnWrite();
                ((com.moloco.sdk.IlrdRequest.MaxImpression) this.instance).setThirdPartyAdPlacementId(str);
                return this;
            }

            public com.moloco.sdk.IlrdRequest.MaxImpression.Builder clearThirdPartyAdPlacementId() {
                copyOnWrite();
                ((com.moloco.sdk.IlrdRequest.MaxImpression) this.instance).clearThirdPartyAdPlacementId();
                return this;
            }

            public com.moloco.sdk.IlrdRequest.MaxImpression.Builder setThirdPartyAdPlacementIdBytes(com.google.protobuf.ByteString byteString) {
                copyOnWrite();
                ((com.moloco.sdk.IlrdRequest.MaxImpression) this.instance).setThirdPartyAdPlacementIdBytes(byteString);
                return this;
            }

            @Override // com.moloco.sdk.IlrdRequest.MaxImpressionOrBuilder
            public java.lang.String getUserSegment() {
                return ((com.moloco.sdk.IlrdRequest.MaxImpression) this.instance).getUserSegment();
            }

            @Override // com.moloco.sdk.IlrdRequest.MaxImpressionOrBuilder
            public com.google.protobuf.ByteString getUserSegmentBytes() {
                return ((com.moloco.sdk.IlrdRequest.MaxImpression) this.instance).getUserSegmentBytes();
            }

            public com.moloco.sdk.IlrdRequest.MaxImpression.Builder setUserSegment(java.lang.String str) {
                copyOnWrite();
                ((com.moloco.sdk.IlrdRequest.MaxImpression) this.instance).setUserSegment(str);
                return this;
            }

            public com.moloco.sdk.IlrdRequest.MaxImpression.Builder clearUserSegment() {
                copyOnWrite();
                ((com.moloco.sdk.IlrdRequest.MaxImpression) this.instance).clearUserSegment();
                return this;
            }

            public com.moloco.sdk.IlrdRequest.MaxImpression.Builder setUserSegmentBytes(com.google.protobuf.ByteString byteString) {
                copyOnWrite();
                ((com.moloco.sdk.IlrdRequest.MaxImpression) this.instance).setUserSegmentBytes(byteString);
                return this;
            }
        }

        @Override // com.google.protobuf.GeneratedMessageLite
        protected final java.lang.Object dynamicMethod(com.google.protobuf.GeneratedMessageLite.MethodToInvoke methodToInvoke, java.lang.Object obj, java.lang.Object obj2) {
            switch (com.moloco.sdk.IlrdRequest.AnonymousClass1.$SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke[methodToInvoke.ordinal()]) {
                case 1:
                    return new com.moloco.sdk.IlrdRequest.MaxImpression();
                case 2:
                    return new com.moloco.sdk.IlrdRequest.MaxImpression.Builder();
                case 3:
                    return newMessageInfo(DEFAULT_INSTANCE, "\u0000\b\u0000\u0000\u0001\b\b\u0000\u0000\u0000\u0001Ȉ\u0002Ȉ\u0003Ȉ\u0004Ȉ\u0005Ȉ\u0006\u0000\u0007Ȉ\bȈ", new java.lang.Object[]{"adFormat_", "countryCode_", "id_", "maxAdUnitId_", "networkName_", "revenue_", "thirdPartyAdPlacementId_", "userSegment_"});
                case 4:
                    return DEFAULT_INSTANCE;
                case 5:
                    com.google.protobuf.Parser<com.moloco.sdk.IlrdRequest.MaxImpression> parser = PARSER;
                    if (parser == null) {
                        synchronized (com.moloco.sdk.IlrdRequest.MaxImpression.class) {
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
            com.moloco.sdk.IlrdRequest.MaxImpression maxImpression = new com.moloco.sdk.IlrdRequest.MaxImpression();
            DEFAULT_INSTANCE = maxImpression;
            com.google.protobuf.GeneratedMessageLite.registerDefaultInstance(com.moloco.sdk.IlrdRequest.MaxImpression.class, maxImpression);
        }

        public static com.moloco.sdk.IlrdRequest.MaxImpression getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static com.google.protobuf.Parser<com.moloco.sdk.IlrdRequest.MaxImpression> parser() {
            return DEFAULT_INSTANCE.getParserForType();
        }
    }

    public static final class LevelPlayImpression extends com.google.protobuf.GeneratedMessageLite<com.moloco.sdk.IlrdRequest.LevelPlayImpression, com.moloco.sdk.IlrdRequest.LevelPlayImpression.Builder> implements com.moloco.sdk.IlrdRequest.LevelPlayImpressionOrBuilder {
        public static final int AB_FIELD_NUMBER = 10;
        public static final int AD_FORMAT_FIELD_NUMBER = 2;
        public static final int AUCTION_ID_FIELD_NUMBER = 1;
        public static final int COUNTRY_CODE_FIELD_NUMBER = 6;
        public static final int CREATIVE_ID_FIELD_NUMBER = 14;
        private static final com.moloco.sdk.IlrdRequest.LevelPlayImpression DEFAULT_INSTANCE;
        public static final int ENCRYPTED_CPM_FIELD_NUMBER = 13;
        public static final int INSTANCE_ID_FIELD_NUMBER = 5;
        public static final int INSTANCE_NAME_FIELD_NUMBER = 4;
        public static final int LIFETIME_REVENUE_FIELD_NUMBER = 12;
        public static final int NETWORK_NAME_FIELD_NUMBER = 3;
        private static volatile com.google.protobuf.Parser<com.moloco.sdk.IlrdRequest.LevelPlayImpression> PARSER = null;
        public static final int PLACEMENT_FIELD_NUMBER = 7;
        public static final int PRECISION_FIELD_NUMBER = 9;
        public static final int REVENUE_FIELD_NUMBER = 8;
        public static final int SEGMENT_NAME_FIELD_NUMBER = 11;
        private double lifetimeRevenue_;
        private double revenue_;
        private java.lang.String auctionId_ = "";
        private java.lang.String adFormat_ = "";
        private java.lang.String networkName_ = "";
        private java.lang.String instanceName_ = "";
        private java.lang.String instanceId_ = "";
        private java.lang.String countryCode_ = "";
        private java.lang.String placement_ = "";
        private java.lang.String precision_ = "";
        private java.lang.String ab_ = "";
        private java.lang.String segmentName_ = "";
        private java.lang.String encryptedCpm_ = "";
        private java.lang.String creativeId_ = "";

        private LevelPlayImpression() {
        }

        @Override // com.moloco.sdk.IlrdRequest.LevelPlayImpressionOrBuilder
        public java.lang.String getAuctionId() {
            return this.auctionId_;
        }

        @Override // com.moloco.sdk.IlrdRequest.LevelPlayImpressionOrBuilder
        public com.google.protobuf.ByteString getAuctionIdBytes() {
            return com.google.protobuf.ByteString.copyFromUtf8(this.auctionId_);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setAuctionId(java.lang.String str) {
            str.getClass();
            this.auctionId_ = str;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearAuctionId() {
            this.auctionId_ = getDefaultInstance().getAuctionId();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setAuctionIdBytes(com.google.protobuf.ByteString byteString) {
            checkByteStringIsUtf8(byteString);
            this.auctionId_ = byteString.toStringUtf8();
        }

        @Override // com.moloco.sdk.IlrdRequest.LevelPlayImpressionOrBuilder
        public java.lang.String getAdFormat() {
            return this.adFormat_;
        }

        @Override // com.moloco.sdk.IlrdRequest.LevelPlayImpressionOrBuilder
        public com.google.protobuf.ByteString getAdFormatBytes() {
            return com.google.protobuf.ByteString.copyFromUtf8(this.adFormat_);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setAdFormat(java.lang.String str) {
            str.getClass();
            this.adFormat_ = str;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearAdFormat() {
            this.adFormat_ = getDefaultInstance().getAdFormat();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setAdFormatBytes(com.google.protobuf.ByteString byteString) {
            checkByteStringIsUtf8(byteString);
            this.adFormat_ = byteString.toStringUtf8();
        }

        @Override // com.moloco.sdk.IlrdRequest.LevelPlayImpressionOrBuilder
        public java.lang.String getNetworkName() {
            return this.networkName_;
        }

        @Override // com.moloco.sdk.IlrdRequest.LevelPlayImpressionOrBuilder
        public com.google.protobuf.ByteString getNetworkNameBytes() {
            return com.google.protobuf.ByteString.copyFromUtf8(this.networkName_);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setNetworkName(java.lang.String str) {
            str.getClass();
            this.networkName_ = str;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearNetworkName() {
            this.networkName_ = getDefaultInstance().getNetworkName();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setNetworkNameBytes(com.google.protobuf.ByteString byteString) {
            checkByteStringIsUtf8(byteString);
            this.networkName_ = byteString.toStringUtf8();
        }

        @Override // com.moloco.sdk.IlrdRequest.LevelPlayImpressionOrBuilder
        public java.lang.String getInstanceName() {
            return this.instanceName_;
        }

        @Override // com.moloco.sdk.IlrdRequest.LevelPlayImpressionOrBuilder
        public com.google.protobuf.ByteString getInstanceNameBytes() {
            return com.google.protobuf.ByteString.copyFromUtf8(this.instanceName_);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setInstanceName(java.lang.String str) {
            str.getClass();
            this.instanceName_ = str;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearInstanceName() {
            this.instanceName_ = getDefaultInstance().getInstanceName();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setInstanceNameBytes(com.google.protobuf.ByteString byteString) {
            checkByteStringIsUtf8(byteString);
            this.instanceName_ = byteString.toStringUtf8();
        }

        @Override // com.moloco.sdk.IlrdRequest.LevelPlayImpressionOrBuilder
        public java.lang.String getInstanceId() {
            return this.instanceId_;
        }

        @Override // com.moloco.sdk.IlrdRequest.LevelPlayImpressionOrBuilder
        public com.google.protobuf.ByteString getInstanceIdBytes() {
            return com.google.protobuf.ByteString.copyFromUtf8(this.instanceId_);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setInstanceId(java.lang.String str) {
            str.getClass();
            this.instanceId_ = str;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearInstanceId() {
            this.instanceId_ = getDefaultInstance().getInstanceId();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setInstanceIdBytes(com.google.protobuf.ByteString byteString) {
            checkByteStringIsUtf8(byteString);
            this.instanceId_ = byteString.toStringUtf8();
        }

        @Override // com.moloco.sdk.IlrdRequest.LevelPlayImpressionOrBuilder
        public java.lang.String getCountryCode() {
            return this.countryCode_;
        }

        @Override // com.moloco.sdk.IlrdRequest.LevelPlayImpressionOrBuilder
        public com.google.protobuf.ByteString getCountryCodeBytes() {
            return com.google.protobuf.ByteString.copyFromUtf8(this.countryCode_);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setCountryCode(java.lang.String str) {
            str.getClass();
            this.countryCode_ = str;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearCountryCode() {
            this.countryCode_ = getDefaultInstance().getCountryCode();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setCountryCodeBytes(com.google.protobuf.ByteString byteString) {
            checkByteStringIsUtf8(byteString);
            this.countryCode_ = byteString.toStringUtf8();
        }

        @Override // com.moloco.sdk.IlrdRequest.LevelPlayImpressionOrBuilder
        public java.lang.String getPlacement() {
            return this.placement_;
        }

        @Override // com.moloco.sdk.IlrdRequest.LevelPlayImpressionOrBuilder
        public com.google.protobuf.ByteString getPlacementBytes() {
            return com.google.protobuf.ByteString.copyFromUtf8(this.placement_);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setPlacement(java.lang.String str) {
            str.getClass();
            this.placement_ = str;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearPlacement() {
            this.placement_ = getDefaultInstance().getPlacement();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setPlacementBytes(com.google.protobuf.ByteString byteString) {
            checkByteStringIsUtf8(byteString);
            this.placement_ = byteString.toStringUtf8();
        }

        @Override // com.moloco.sdk.IlrdRequest.LevelPlayImpressionOrBuilder
        public double getRevenue() {
            return this.revenue_;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setRevenue(double d) {
            this.revenue_ = d;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearRevenue() {
            this.revenue_ = 0.0d;
        }

        @Override // com.moloco.sdk.IlrdRequest.LevelPlayImpressionOrBuilder
        public java.lang.String getPrecision() {
            return this.precision_;
        }

        @Override // com.moloco.sdk.IlrdRequest.LevelPlayImpressionOrBuilder
        public com.google.protobuf.ByteString getPrecisionBytes() {
            return com.google.protobuf.ByteString.copyFromUtf8(this.precision_);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setPrecision(java.lang.String str) {
            str.getClass();
            this.precision_ = str;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearPrecision() {
            this.precision_ = getDefaultInstance().getPrecision();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setPrecisionBytes(com.google.protobuf.ByteString byteString) {
            checkByteStringIsUtf8(byteString);
            this.precision_ = byteString.toStringUtf8();
        }

        @Override // com.moloco.sdk.IlrdRequest.LevelPlayImpressionOrBuilder
        public java.lang.String getAb() {
            return this.ab_;
        }

        @Override // com.moloco.sdk.IlrdRequest.LevelPlayImpressionOrBuilder
        public com.google.protobuf.ByteString getAbBytes() {
            return com.google.protobuf.ByteString.copyFromUtf8(this.ab_);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setAb(java.lang.String str) {
            str.getClass();
            this.ab_ = str;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearAb() {
            this.ab_ = getDefaultInstance().getAb();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setAbBytes(com.google.protobuf.ByteString byteString) {
            checkByteStringIsUtf8(byteString);
            this.ab_ = byteString.toStringUtf8();
        }

        @Override // com.moloco.sdk.IlrdRequest.LevelPlayImpressionOrBuilder
        public java.lang.String getSegmentName() {
            return this.segmentName_;
        }

        @Override // com.moloco.sdk.IlrdRequest.LevelPlayImpressionOrBuilder
        public com.google.protobuf.ByteString getSegmentNameBytes() {
            return com.google.protobuf.ByteString.copyFromUtf8(this.segmentName_);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setSegmentName(java.lang.String str) {
            str.getClass();
            this.segmentName_ = str;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearSegmentName() {
            this.segmentName_ = getDefaultInstance().getSegmentName();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setSegmentNameBytes(com.google.protobuf.ByteString byteString) {
            checkByteStringIsUtf8(byteString);
            this.segmentName_ = byteString.toStringUtf8();
        }

        @Override // com.moloco.sdk.IlrdRequest.LevelPlayImpressionOrBuilder
        public double getLifetimeRevenue() {
            return this.lifetimeRevenue_;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setLifetimeRevenue(double d) {
            this.lifetimeRevenue_ = d;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearLifetimeRevenue() {
            this.lifetimeRevenue_ = 0.0d;
        }

        @Override // com.moloco.sdk.IlrdRequest.LevelPlayImpressionOrBuilder
        public java.lang.String getEncryptedCpm() {
            return this.encryptedCpm_;
        }

        @Override // com.moloco.sdk.IlrdRequest.LevelPlayImpressionOrBuilder
        public com.google.protobuf.ByteString getEncryptedCpmBytes() {
            return com.google.protobuf.ByteString.copyFromUtf8(this.encryptedCpm_);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setEncryptedCpm(java.lang.String str) {
            str.getClass();
            this.encryptedCpm_ = str;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearEncryptedCpm() {
            this.encryptedCpm_ = getDefaultInstance().getEncryptedCpm();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setEncryptedCpmBytes(com.google.protobuf.ByteString byteString) {
            checkByteStringIsUtf8(byteString);
            this.encryptedCpm_ = byteString.toStringUtf8();
        }

        @Override // com.moloco.sdk.IlrdRequest.LevelPlayImpressionOrBuilder
        public java.lang.String getCreativeId() {
            return this.creativeId_;
        }

        @Override // com.moloco.sdk.IlrdRequest.LevelPlayImpressionOrBuilder
        public com.google.protobuf.ByteString getCreativeIdBytes() {
            return com.google.protobuf.ByteString.copyFromUtf8(this.creativeId_);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setCreativeId(java.lang.String str) {
            str.getClass();
            this.creativeId_ = str;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearCreativeId() {
            this.creativeId_ = getDefaultInstance().getCreativeId();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setCreativeIdBytes(com.google.protobuf.ByteString byteString) {
            checkByteStringIsUtf8(byteString);
            this.creativeId_ = byteString.toStringUtf8();
        }

        public static com.moloco.sdk.IlrdRequest.LevelPlayImpression parseFrom(java.nio.ByteBuffer byteBuffer) throws com.google.protobuf.InvalidProtocolBufferException {
            return (com.moloco.sdk.IlrdRequest.LevelPlayImpression) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
        }

        public static com.moloco.sdk.IlrdRequest.LevelPlayImpression parseFrom(java.nio.ByteBuffer byteBuffer, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) throws com.google.protobuf.InvalidProtocolBufferException {
            return (com.moloco.sdk.IlrdRequest.LevelPlayImpression) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
        }

        public static com.moloco.sdk.IlrdRequest.LevelPlayImpression parseFrom(com.google.protobuf.ByteString byteString) throws com.google.protobuf.InvalidProtocolBufferException {
            return (com.moloco.sdk.IlrdRequest.LevelPlayImpression) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
        }

        public static com.moloco.sdk.IlrdRequest.LevelPlayImpression parseFrom(com.google.protobuf.ByteString byteString, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) throws com.google.protobuf.InvalidProtocolBufferException {
            return (com.moloco.sdk.IlrdRequest.LevelPlayImpression) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
        }

        public static com.moloco.sdk.IlrdRequest.LevelPlayImpression parseFrom(byte[] bArr) throws com.google.protobuf.InvalidProtocolBufferException {
            return (com.moloco.sdk.IlrdRequest.LevelPlayImpression) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
        }

        public static com.moloco.sdk.IlrdRequest.LevelPlayImpression parseFrom(byte[] bArr, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) throws com.google.protobuf.InvalidProtocolBufferException {
            return (com.moloco.sdk.IlrdRequest.LevelPlayImpression) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
        }

        public static com.moloco.sdk.IlrdRequest.LevelPlayImpression parseFrom(java.io.InputStream inputStream) throws java.io.IOException {
            return (com.moloco.sdk.IlrdRequest.LevelPlayImpression) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static com.moloco.sdk.IlrdRequest.LevelPlayImpression parseFrom(java.io.InputStream inputStream, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) throws java.io.IOException {
            return (com.moloco.sdk.IlrdRequest.LevelPlayImpression) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
        }

        public static com.moloco.sdk.IlrdRequest.LevelPlayImpression parseDelimitedFrom(java.io.InputStream inputStream) throws java.io.IOException {
            return (com.moloco.sdk.IlrdRequest.LevelPlayImpression) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static com.moloco.sdk.IlrdRequest.LevelPlayImpression parseDelimitedFrom(java.io.InputStream inputStream, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) throws java.io.IOException {
            return (com.moloco.sdk.IlrdRequest.LevelPlayImpression) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
        }

        public static com.moloco.sdk.IlrdRequest.LevelPlayImpression parseFrom(com.google.protobuf.CodedInputStream codedInputStream) throws java.io.IOException {
            return (com.moloco.sdk.IlrdRequest.LevelPlayImpression) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
        }

        public static com.moloco.sdk.IlrdRequest.LevelPlayImpression parseFrom(com.google.protobuf.CodedInputStream codedInputStream, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) throws java.io.IOException {
            return (com.moloco.sdk.IlrdRequest.LevelPlayImpression) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
        }

        public static com.moloco.sdk.IlrdRequest.LevelPlayImpression.Builder newBuilder() {
            return DEFAULT_INSTANCE.createBuilder();
        }

        public static com.moloco.sdk.IlrdRequest.LevelPlayImpression.Builder newBuilder(com.moloco.sdk.IlrdRequest.LevelPlayImpression levelPlayImpression) {
            return DEFAULT_INSTANCE.createBuilder(levelPlayImpression);
        }

        public static final class Builder extends com.google.protobuf.GeneratedMessageLite.Builder<com.moloco.sdk.IlrdRequest.LevelPlayImpression, com.moloco.sdk.IlrdRequest.LevelPlayImpression.Builder> implements com.moloco.sdk.IlrdRequest.LevelPlayImpressionOrBuilder {
            private Builder() {
                super(com.moloco.sdk.IlrdRequest.LevelPlayImpression.DEFAULT_INSTANCE);
            }

            @Override // com.moloco.sdk.IlrdRequest.LevelPlayImpressionOrBuilder
            public java.lang.String getAuctionId() {
                return ((com.moloco.sdk.IlrdRequest.LevelPlayImpression) this.instance).getAuctionId();
            }

            @Override // com.moloco.sdk.IlrdRequest.LevelPlayImpressionOrBuilder
            public com.google.protobuf.ByteString getAuctionIdBytes() {
                return ((com.moloco.sdk.IlrdRequest.LevelPlayImpression) this.instance).getAuctionIdBytes();
            }

            public com.moloco.sdk.IlrdRequest.LevelPlayImpression.Builder setAuctionId(java.lang.String str) {
                copyOnWrite();
                ((com.moloco.sdk.IlrdRequest.LevelPlayImpression) this.instance).setAuctionId(str);
                return this;
            }

            public com.moloco.sdk.IlrdRequest.LevelPlayImpression.Builder clearAuctionId() {
                copyOnWrite();
                ((com.moloco.sdk.IlrdRequest.LevelPlayImpression) this.instance).clearAuctionId();
                return this;
            }

            public com.moloco.sdk.IlrdRequest.LevelPlayImpression.Builder setAuctionIdBytes(com.google.protobuf.ByteString byteString) {
                copyOnWrite();
                ((com.moloco.sdk.IlrdRequest.LevelPlayImpression) this.instance).setAuctionIdBytes(byteString);
                return this;
            }

            @Override // com.moloco.sdk.IlrdRequest.LevelPlayImpressionOrBuilder
            public java.lang.String getAdFormat() {
                return ((com.moloco.sdk.IlrdRequest.LevelPlayImpression) this.instance).getAdFormat();
            }

            @Override // com.moloco.sdk.IlrdRequest.LevelPlayImpressionOrBuilder
            public com.google.protobuf.ByteString getAdFormatBytes() {
                return ((com.moloco.sdk.IlrdRequest.LevelPlayImpression) this.instance).getAdFormatBytes();
            }

            public com.moloco.sdk.IlrdRequest.LevelPlayImpression.Builder setAdFormat(java.lang.String str) {
                copyOnWrite();
                ((com.moloco.sdk.IlrdRequest.LevelPlayImpression) this.instance).setAdFormat(str);
                return this;
            }

            public com.moloco.sdk.IlrdRequest.LevelPlayImpression.Builder clearAdFormat() {
                copyOnWrite();
                ((com.moloco.sdk.IlrdRequest.LevelPlayImpression) this.instance).clearAdFormat();
                return this;
            }

            public com.moloco.sdk.IlrdRequest.LevelPlayImpression.Builder setAdFormatBytes(com.google.protobuf.ByteString byteString) {
                copyOnWrite();
                ((com.moloco.sdk.IlrdRequest.LevelPlayImpression) this.instance).setAdFormatBytes(byteString);
                return this;
            }

            @Override // com.moloco.sdk.IlrdRequest.LevelPlayImpressionOrBuilder
            public java.lang.String getNetworkName() {
                return ((com.moloco.sdk.IlrdRequest.LevelPlayImpression) this.instance).getNetworkName();
            }

            @Override // com.moloco.sdk.IlrdRequest.LevelPlayImpressionOrBuilder
            public com.google.protobuf.ByteString getNetworkNameBytes() {
                return ((com.moloco.sdk.IlrdRequest.LevelPlayImpression) this.instance).getNetworkNameBytes();
            }

            public com.moloco.sdk.IlrdRequest.LevelPlayImpression.Builder setNetworkName(java.lang.String str) {
                copyOnWrite();
                ((com.moloco.sdk.IlrdRequest.LevelPlayImpression) this.instance).setNetworkName(str);
                return this;
            }

            public com.moloco.sdk.IlrdRequest.LevelPlayImpression.Builder clearNetworkName() {
                copyOnWrite();
                ((com.moloco.sdk.IlrdRequest.LevelPlayImpression) this.instance).clearNetworkName();
                return this;
            }

            public com.moloco.sdk.IlrdRequest.LevelPlayImpression.Builder setNetworkNameBytes(com.google.protobuf.ByteString byteString) {
                copyOnWrite();
                ((com.moloco.sdk.IlrdRequest.LevelPlayImpression) this.instance).setNetworkNameBytes(byteString);
                return this;
            }

            @Override // com.moloco.sdk.IlrdRequest.LevelPlayImpressionOrBuilder
            public java.lang.String getInstanceName() {
                return ((com.moloco.sdk.IlrdRequest.LevelPlayImpression) this.instance).getInstanceName();
            }

            @Override // com.moloco.sdk.IlrdRequest.LevelPlayImpressionOrBuilder
            public com.google.protobuf.ByteString getInstanceNameBytes() {
                return ((com.moloco.sdk.IlrdRequest.LevelPlayImpression) this.instance).getInstanceNameBytes();
            }

            public com.moloco.sdk.IlrdRequest.LevelPlayImpression.Builder setInstanceName(java.lang.String str) {
                copyOnWrite();
                ((com.moloco.sdk.IlrdRequest.LevelPlayImpression) this.instance).setInstanceName(str);
                return this;
            }

            public com.moloco.sdk.IlrdRequest.LevelPlayImpression.Builder clearInstanceName() {
                copyOnWrite();
                ((com.moloco.sdk.IlrdRequest.LevelPlayImpression) this.instance).clearInstanceName();
                return this;
            }

            public com.moloco.sdk.IlrdRequest.LevelPlayImpression.Builder setInstanceNameBytes(com.google.protobuf.ByteString byteString) {
                copyOnWrite();
                ((com.moloco.sdk.IlrdRequest.LevelPlayImpression) this.instance).setInstanceNameBytes(byteString);
                return this;
            }

            @Override // com.moloco.sdk.IlrdRequest.LevelPlayImpressionOrBuilder
            public java.lang.String getInstanceId() {
                return ((com.moloco.sdk.IlrdRequest.LevelPlayImpression) this.instance).getInstanceId();
            }

            @Override // com.moloco.sdk.IlrdRequest.LevelPlayImpressionOrBuilder
            public com.google.protobuf.ByteString getInstanceIdBytes() {
                return ((com.moloco.sdk.IlrdRequest.LevelPlayImpression) this.instance).getInstanceIdBytes();
            }

            public com.moloco.sdk.IlrdRequest.LevelPlayImpression.Builder setInstanceId(java.lang.String str) {
                copyOnWrite();
                ((com.moloco.sdk.IlrdRequest.LevelPlayImpression) this.instance).setInstanceId(str);
                return this;
            }

            public com.moloco.sdk.IlrdRequest.LevelPlayImpression.Builder clearInstanceId() {
                copyOnWrite();
                ((com.moloco.sdk.IlrdRequest.LevelPlayImpression) this.instance).clearInstanceId();
                return this;
            }

            public com.moloco.sdk.IlrdRequest.LevelPlayImpression.Builder setInstanceIdBytes(com.google.protobuf.ByteString byteString) {
                copyOnWrite();
                ((com.moloco.sdk.IlrdRequest.LevelPlayImpression) this.instance).setInstanceIdBytes(byteString);
                return this;
            }

            @Override // com.moloco.sdk.IlrdRequest.LevelPlayImpressionOrBuilder
            public java.lang.String getCountryCode() {
                return ((com.moloco.sdk.IlrdRequest.LevelPlayImpression) this.instance).getCountryCode();
            }

            @Override // com.moloco.sdk.IlrdRequest.LevelPlayImpressionOrBuilder
            public com.google.protobuf.ByteString getCountryCodeBytes() {
                return ((com.moloco.sdk.IlrdRequest.LevelPlayImpression) this.instance).getCountryCodeBytes();
            }

            public com.moloco.sdk.IlrdRequest.LevelPlayImpression.Builder setCountryCode(java.lang.String str) {
                copyOnWrite();
                ((com.moloco.sdk.IlrdRequest.LevelPlayImpression) this.instance).setCountryCode(str);
                return this;
            }

            public com.moloco.sdk.IlrdRequest.LevelPlayImpression.Builder clearCountryCode() {
                copyOnWrite();
                ((com.moloco.sdk.IlrdRequest.LevelPlayImpression) this.instance).clearCountryCode();
                return this;
            }

            public com.moloco.sdk.IlrdRequest.LevelPlayImpression.Builder setCountryCodeBytes(com.google.protobuf.ByteString byteString) {
                copyOnWrite();
                ((com.moloco.sdk.IlrdRequest.LevelPlayImpression) this.instance).setCountryCodeBytes(byteString);
                return this;
            }

            @Override // com.moloco.sdk.IlrdRequest.LevelPlayImpressionOrBuilder
            public java.lang.String getPlacement() {
                return ((com.moloco.sdk.IlrdRequest.LevelPlayImpression) this.instance).getPlacement();
            }

            @Override // com.moloco.sdk.IlrdRequest.LevelPlayImpressionOrBuilder
            public com.google.protobuf.ByteString getPlacementBytes() {
                return ((com.moloco.sdk.IlrdRequest.LevelPlayImpression) this.instance).getPlacementBytes();
            }

            public com.moloco.sdk.IlrdRequest.LevelPlayImpression.Builder setPlacement(java.lang.String str) {
                copyOnWrite();
                ((com.moloco.sdk.IlrdRequest.LevelPlayImpression) this.instance).setPlacement(str);
                return this;
            }

            public com.moloco.sdk.IlrdRequest.LevelPlayImpression.Builder clearPlacement() {
                copyOnWrite();
                ((com.moloco.sdk.IlrdRequest.LevelPlayImpression) this.instance).clearPlacement();
                return this;
            }

            public com.moloco.sdk.IlrdRequest.LevelPlayImpression.Builder setPlacementBytes(com.google.protobuf.ByteString byteString) {
                copyOnWrite();
                ((com.moloco.sdk.IlrdRequest.LevelPlayImpression) this.instance).setPlacementBytes(byteString);
                return this;
            }

            @Override // com.moloco.sdk.IlrdRequest.LevelPlayImpressionOrBuilder
            public double getRevenue() {
                return ((com.moloco.sdk.IlrdRequest.LevelPlayImpression) this.instance).getRevenue();
            }

            public com.moloco.sdk.IlrdRequest.LevelPlayImpression.Builder setRevenue(double d) {
                copyOnWrite();
                ((com.moloco.sdk.IlrdRequest.LevelPlayImpression) this.instance).setRevenue(d);
                return this;
            }

            public com.moloco.sdk.IlrdRequest.LevelPlayImpression.Builder clearRevenue() {
                copyOnWrite();
                ((com.moloco.sdk.IlrdRequest.LevelPlayImpression) this.instance).clearRevenue();
                return this;
            }

            @Override // com.moloco.sdk.IlrdRequest.LevelPlayImpressionOrBuilder
            public java.lang.String getPrecision() {
                return ((com.moloco.sdk.IlrdRequest.LevelPlayImpression) this.instance).getPrecision();
            }

            @Override // com.moloco.sdk.IlrdRequest.LevelPlayImpressionOrBuilder
            public com.google.protobuf.ByteString getPrecisionBytes() {
                return ((com.moloco.sdk.IlrdRequest.LevelPlayImpression) this.instance).getPrecisionBytes();
            }

            public com.moloco.sdk.IlrdRequest.LevelPlayImpression.Builder setPrecision(java.lang.String str) {
                copyOnWrite();
                ((com.moloco.sdk.IlrdRequest.LevelPlayImpression) this.instance).setPrecision(str);
                return this;
            }

            public com.moloco.sdk.IlrdRequest.LevelPlayImpression.Builder clearPrecision() {
                copyOnWrite();
                ((com.moloco.sdk.IlrdRequest.LevelPlayImpression) this.instance).clearPrecision();
                return this;
            }

            public com.moloco.sdk.IlrdRequest.LevelPlayImpression.Builder setPrecisionBytes(com.google.protobuf.ByteString byteString) {
                copyOnWrite();
                ((com.moloco.sdk.IlrdRequest.LevelPlayImpression) this.instance).setPrecisionBytes(byteString);
                return this;
            }

            @Override // com.moloco.sdk.IlrdRequest.LevelPlayImpressionOrBuilder
            public java.lang.String getAb() {
                return ((com.moloco.sdk.IlrdRequest.LevelPlayImpression) this.instance).getAb();
            }

            @Override // com.moloco.sdk.IlrdRequest.LevelPlayImpressionOrBuilder
            public com.google.protobuf.ByteString getAbBytes() {
                return ((com.moloco.sdk.IlrdRequest.LevelPlayImpression) this.instance).getAbBytes();
            }

            public com.moloco.sdk.IlrdRequest.LevelPlayImpression.Builder setAb(java.lang.String str) {
                copyOnWrite();
                ((com.moloco.sdk.IlrdRequest.LevelPlayImpression) this.instance).setAb(str);
                return this;
            }

            public com.moloco.sdk.IlrdRequest.LevelPlayImpression.Builder clearAb() {
                copyOnWrite();
                ((com.moloco.sdk.IlrdRequest.LevelPlayImpression) this.instance).clearAb();
                return this;
            }

            public com.moloco.sdk.IlrdRequest.LevelPlayImpression.Builder setAbBytes(com.google.protobuf.ByteString byteString) {
                copyOnWrite();
                ((com.moloco.sdk.IlrdRequest.LevelPlayImpression) this.instance).setAbBytes(byteString);
                return this;
            }

            @Override // com.moloco.sdk.IlrdRequest.LevelPlayImpressionOrBuilder
            public java.lang.String getSegmentName() {
                return ((com.moloco.sdk.IlrdRequest.LevelPlayImpression) this.instance).getSegmentName();
            }

            @Override // com.moloco.sdk.IlrdRequest.LevelPlayImpressionOrBuilder
            public com.google.protobuf.ByteString getSegmentNameBytes() {
                return ((com.moloco.sdk.IlrdRequest.LevelPlayImpression) this.instance).getSegmentNameBytes();
            }

            public com.moloco.sdk.IlrdRequest.LevelPlayImpression.Builder setSegmentName(java.lang.String str) {
                copyOnWrite();
                ((com.moloco.sdk.IlrdRequest.LevelPlayImpression) this.instance).setSegmentName(str);
                return this;
            }

            public com.moloco.sdk.IlrdRequest.LevelPlayImpression.Builder clearSegmentName() {
                copyOnWrite();
                ((com.moloco.sdk.IlrdRequest.LevelPlayImpression) this.instance).clearSegmentName();
                return this;
            }

            public com.moloco.sdk.IlrdRequest.LevelPlayImpression.Builder setSegmentNameBytes(com.google.protobuf.ByteString byteString) {
                copyOnWrite();
                ((com.moloco.sdk.IlrdRequest.LevelPlayImpression) this.instance).setSegmentNameBytes(byteString);
                return this;
            }

            @Override // com.moloco.sdk.IlrdRequest.LevelPlayImpressionOrBuilder
            public double getLifetimeRevenue() {
                return ((com.moloco.sdk.IlrdRequest.LevelPlayImpression) this.instance).getLifetimeRevenue();
            }

            public com.moloco.sdk.IlrdRequest.LevelPlayImpression.Builder setLifetimeRevenue(double d) {
                copyOnWrite();
                ((com.moloco.sdk.IlrdRequest.LevelPlayImpression) this.instance).setLifetimeRevenue(d);
                return this;
            }

            public com.moloco.sdk.IlrdRequest.LevelPlayImpression.Builder clearLifetimeRevenue() {
                copyOnWrite();
                ((com.moloco.sdk.IlrdRequest.LevelPlayImpression) this.instance).clearLifetimeRevenue();
                return this;
            }

            @Override // com.moloco.sdk.IlrdRequest.LevelPlayImpressionOrBuilder
            public java.lang.String getEncryptedCpm() {
                return ((com.moloco.sdk.IlrdRequest.LevelPlayImpression) this.instance).getEncryptedCpm();
            }

            @Override // com.moloco.sdk.IlrdRequest.LevelPlayImpressionOrBuilder
            public com.google.protobuf.ByteString getEncryptedCpmBytes() {
                return ((com.moloco.sdk.IlrdRequest.LevelPlayImpression) this.instance).getEncryptedCpmBytes();
            }

            public com.moloco.sdk.IlrdRequest.LevelPlayImpression.Builder setEncryptedCpm(java.lang.String str) {
                copyOnWrite();
                ((com.moloco.sdk.IlrdRequest.LevelPlayImpression) this.instance).setEncryptedCpm(str);
                return this;
            }

            public com.moloco.sdk.IlrdRequest.LevelPlayImpression.Builder clearEncryptedCpm() {
                copyOnWrite();
                ((com.moloco.sdk.IlrdRequest.LevelPlayImpression) this.instance).clearEncryptedCpm();
                return this;
            }

            public com.moloco.sdk.IlrdRequest.LevelPlayImpression.Builder setEncryptedCpmBytes(com.google.protobuf.ByteString byteString) {
                copyOnWrite();
                ((com.moloco.sdk.IlrdRequest.LevelPlayImpression) this.instance).setEncryptedCpmBytes(byteString);
                return this;
            }

            @Override // com.moloco.sdk.IlrdRequest.LevelPlayImpressionOrBuilder
            public java.lang.String getCreativeId() {
                return ((com.moloco.sdk.IlrdRequest.LevelPlayImpression) this.instance).getCreativeId();
            }

            @Override // com.moloco.sdk.IlrdRequest.LevelPlayImpressionOrBuilder
            public com.google.protobuf.ByteString getCreativeIdBytes() {
                return ((com.moloco.sdk.IlrdRequest.LevelPlayImpression) this.instance).getCreativeIdBytes();
            }

            public com.moloco.sdk.IlrdRequest.LevelPlayImpression.Builder setCreativeId(java.lang.String str) {
                copyOnWrite();
                ((com.moloco.sdk.IlrdRequest.LevelPlayImpression) this.instance).setCreativeId(str);
                return this;
            }

            public com.moloco.sdk.IlrdRequest.LevelPlayImpression.Builder clearCreativeId() {
                copyOnWrite();
                ((com.moloco.sdk.IlrdRequest.LevelPlayImpression) this.instance).clearCreativeId();
                return this;
            }

            public com.moloco.sdk.IlrdRequest.LevelPlayImpression.Builder setCreativeIdBytes(com.google.protobuf.ByteString byteString) {
                copyOnWrite();
                ((com.moloco.sdk.IlrdRequest.LevelPlayImpression) this.instance).setCreativeIdBytes(byteString);
                return this;
            }
        }

        @Override // com.google.protobuf.GeneratedMessageLite
        protected final java.lang.Object dynamicMethod(com.google.protobuf.GeneratedMessageLite.MethodToInvoke methodToInvoke, java.lang.Object obj, java.lang.Object obj2) {
            switch (com.moloco.sdk.IlrdRequest.AnonymousClass1.$SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke[methodToInvoke.ordinal()]) {
                case 1:
                    return new com.moloco.sdk.IlrdRequest.LevelPlayImpression();
                case 2:
                    return new com.moloco.sdk.IlrdRequest.LevelPlayImpression.Builder();
                case 3:
                    return newMessageInfo(DEFAULT_INSTANCE, "\u0000\u000e\u0000\u0000\u0001\u000e\u000e\u0000\u0000\u0000\u0001Ȉ\u0002Ȉ\u0003Ȉ\u0004Ȉ\u0005Ȉ\u0006Ȉ\u0007Ȉ\b\u0000\tȈ\nȈ\u000bȈ\f\u0000\rȈ\u000eȈ", new java.lang.Object[]{"auctionId_", "adFormat_", "networkName_", "instanceName_", "instanceId_", "countryCode_", "placement_", "revenue_", "precision_", "ab_", "segmentName_", "lifetimeRevenue_", "encryptedCpm_", "creativeId_"});
                case 4:
                    return DEFAULT_INSTANCE;
                case 5:
                    com.google.protobuf.Parser<com.moloco.sdk.IlrdRequest.LevelPlayImpression> parser = PARSER;
                    if (parser == null) {
                        synchronized (com.moloco.sdk.IlrdRequest.LevelPlayImpression.class) {
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
            com.moloco.sdk.IlrdRequest.LevelPlayImpression levelPlayImpression = new com.moloco.sdk.IlrdRequest.LevelPlayImpression();
            DEFAULT_INSTANCE = levelPlayImpression;
            com.google.protobuf.GeneratedMessageLite.registerDefaultInstance(com.moloco.sdk.IlrdRequest.LevelPlayImpression.class, levelPlayImpression);
        }

        public static com.moloco.sdk.IlrdRequest.LevelPlayImpression getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static com.google.protobuf.Parser<com.moloco.sdk.IlrdRequest.LevelPlayImpression> parser() {
            return DEFAULT_INSTANCE.getParserForType();
        }
    }
}
