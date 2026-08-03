package gatewayprotocol.v1;

/* loaded from: classes6.dex */
public final class NativeConfigurationOuterClass {

    public interface AdOperationsConfigurationOrBuilder extends com.google.protobuf.MessageLiteOrBuilder {
        int getGetTokenTimeoutMs();

        int getLoadTimeoutMs();

        int getShowTimeoutMs();
    }

    public interface CachedAssetsConfigurationOrBuilder extends com.google.protobuf.MessageLiteOrBuilder {
        long getMaxCachedAssetAgeMs();

        int getMaxCachedAssetSizeMb();
    }

    public interface DebugSettingsOrBuilder extends com.google.protobuf.MessageLiteOrBuilder {
        boolean getCleanCache();

        boolean getEnableTracing();

        boolean getWebviewInspectable();
    }

    public interface DiagnosticEventsConfigurationOrBuilder extends com.google.protobuf.MessageLiteOrBuilder {
        gatewayprotocol.v1.DiagnosticEventRequestOuterClass.DiagnosticEventType getAllowedEvents(int i);

        int getAllowedEventsCount();

        java.util.List<gatewayprotocol.v1.DiagnosticEventRequestOuterClass.DiagnosticEventType> getAllowedEventsList();

        int getAllowedEventsValue(int i);

        java.util.List<java.lang.Integer> getAllowedEventsValueList();

        gatewayprotocol.v1.DiagnosticEventRequestOuterClass.DiagnosticEventType getBlockedEvents(int i);

        int getBlockedEventsCount();

        java.util.List<gatewayprotocol.v1.DiagnosticEventRequestOuterClass.DiagnosticEventType> getBlockedEventsList();

        int getBlockedEventsValue(int i);

        java.util.List<java.lang.Integer> getBlockedEventsValueList();

        boolean getEnabled();

        int getMaxBatchIntervalMs();

        int getMaxBatchSize();

        gatewayprotocol.v1.DiagnosticEventRequestOuterClass.DiagnosticEventsSeverity getSeverity();

        int getSeverityValue();

        boolean getTtmEnabled();
    }

    public interface FeatureFlagsOrBuilder extends com.google.protobuf.MessageLiteOrBuilder {
        boolean getAppSheetBugCheckEnabled();

        boolean getBoldSdkNextSessionEnabled();

        boolean getOpenglGpuEnabled();

        boolean getOpportunityIdPlacementValidation();

        boolean getRecoverTerminatedWebviews();

        boolean getShouldHandleWebviewCaching();

        boolean getShouldSendIapHistory();
    }

    public interface NativeConfigurationOrBuilder extends com.google.protobuf.MessageLiteOrBuilder {
        gatewayprotocol.v1.NativeConfigurationOuterClass.AdOperationsConfiguration getAdOperations();

        gatewayprotocol.v1.NativeConfigurationOuterClass.RequestPolicy getAdPolicy();

        java.lang.String getAdditionalStorePackages(int i);

        com.google.protobuf.ByteString getAdditionalStorePackagesBytes(int i);

        int getAdditionalStorePackagesCount();

        java.util.List<java.lang.String> getAdditionalStorePackagesList();

        gatewayprotocol.v1.NativeConfigurationOuterClass.CachedAssetsConfiguration getCachedAssetsConfiguration();

        gatewayprotocol.v1.NativeConfigurationOuterClass.CachedAssetsConfiguration getCachedWebviewFilesConfiguration();

        gatewayprotocol.v1.NativeConfigurationOuterClass.DebugSettings getDebugSettings();

        gatewayprotocol.v1.NativeConfigurationOuterClass.ShowCompletionState getDefaultShowCompletionState();

        int getDefaultShowCompletionStateValue();

        gatewayprotocol.v1.NativeConfigurationOuterClass.DiagnosticEventsConfiguration getDiagnosticEvents();

        gatewayprotocol.v1.NativeConfigurationOuterClass.RequestPolicy getDownloadPolicy();

        boolean getEnableIapEvent();

        boolean getEnableOm();

        gatewayprotocol.v1.NativeConfigurationOuterClass.FeatureFlags getFeatureFlags();

        gatewayprotocol.v1.NativeConfigurationOuterClass.RequestPolicy getInitPolicy();

        int getMaxExtrasSizeKb();

        com.google.protobuf.ByteString getObservableAndroidActivities(int i);

        int getObservableAndroidActivitiesCount();

        java.util.List<com.google.protobuf.ByteString> getObservableAndroidActivitiesList();

        gatewayprotocol.v1.NativeConfigurationOuterClass.RequestPolicy getOperativeEventPolicy();

        gatewayprotocol.v1.NativeConfigurationOuterClass.RequestPolicy getOtherPolicy();

        boolean hasAdOperations();

        boolean hasAdPolicy();

        boolean hasCachedAssetsConfiguration();

        boolean hasCachedWebviewFilesConfiguration();

        boolean hasDebugSettings();

        boolean hasDiagnosticEvents();

        boolean hasDownloadPolicy();

        boolean hasFeatureFlags();

        boolean hasInitPolicy();

        boolean hasOperativeEventPolicy();

        boolean hasOtherPolicy();
    }

    public interface RequestPolicyOrBuilder extends com.google.protobuf.MessageLiteOrBuilder {
        gatewayprotocol.v1.NativeConfigurationOuterClass.RequestRetryPolicy getRetryPolicy();

        gatewayprotocol.v1.NativeConfigurationOuterClass.RequestTimeoutPolicy getTimeoutPolicy();

        boolean hasRetryPolicy();

        boolean hasTimeoutPolicy();
    }

    public interface RequestRetryPolicyOrBuilder extends com.google.protobuf.MessageLiteOrBuilder {
        int getMaxDuration();

        float getRetryJitterPct();

        int getRetryMaxInterval();

        float getRetryScalingFactor();

        int getRetryWaitBase();

        boolean getShouldStoreLocally();
    }

    public interface RequestTimeoutPolicyOrBuilder extends com.google.protobuf.MessageLiteOrBuilder {
        int getConnectTimeoutMs();

        int getOverallTimeoutMs();

        int getReadTimeoutMs();

        int getWriteTimeoutMs();
    }

    public static void registerAllExtensions(com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) {
    }

    private NativeConfigurationOuterClass() {
    }

    public enum ShowCompletionState implements com.google.protobuf.Internal.EnumLite {
        SHOW_COMPLETION_STATE_UNSPECIFIED(0),
        SHOW_COMPLETION_STATE_SKIPPED(1),
        SHOW_COMPLETION_STATE_COMPLETED(2),
        UNRECOGNIZED(-1);

        public static final int SHOW_COMPLETION_STATE_COMPLETED_VALUE = 2;
        public static final int SHOW_COMPLETION_STATE_SKIPPED_VALUE = 1;
        public static final int SHOW_COMPLETION_STATE_UNSPECIFIED_VALUE = 0;
        private static final com.google.protobuf.Internal.EnumLiteMap<gatewayprotocol.v1.NativeConfigurationOuterClass.ShowCompletionState> internalValueMap = new com.google.protobuf.Internal.EnumLiteMap<gatewayprotocol.v1.NativeConfigurationOuterClass.ShowCompletionState>() { // from class: gatewayprotocol.v1.NativeConfigurationOuterClass.ShowCompletionState.1
            @Override // com.google.protobuf.Internal.EnumLiteMap
            public gatewayprotocol.v1.NativeConfigurationOuterClass.ShowCompletionState findValueByNumber(int i) {
                return gatewayprotocol.v1.NativeConfigurationOuterClass.ShowCompletionState.forNumber(i);
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
        public static gatewayprotocol.v1.NativeConfigurationOuterClass.ShowCompletionState valueOf(int i) {
            return forNumber(i);
        }

        public static gatewayprotocol.v1.NativeConfigurationOuterClass.ShowCompletionState forNumber(int i) {
            if (i == 0) {
                return SHOW_COMPLETION_STATE_UNSPECIFIED;
            }
            if (i == 1) {
                return SHOW_COMPLETION_STATE_SKIPPED;
            }
            if (i != 2) {
                return null;
            }
            return SHOW_COMPLETION_STATE_COMPLETED;
        }

        public static com.google.protobuf.Internal.EnumLiteMap<gatewayprotocol.v1.NativeConfigurationOuterClass.ShowCompletionState> internalGetValueMap() {
            return internalValueMap;
        }

        public static com.google.protobuf.Internal.EnumVerifier internalGetVerifier() {
            return gatewayprotocol.v1.NativeConfigurationOuterClass.ShowCompletionState.ShowCompletionStateVerifier.INSTANCE;
        }

        private static final class ShowCompletionStateVerifier implements com.google.protobuf.Internal.EnumVerifier {
            static final com.google.protobuf.Internal.EnumVerifier INSTANCE = new gatewayprotocol.v1.NativeConfigurationOuterClass.ShowCompletionState.ShowCompletionStateVerifier();

            private ShowCompletionStateVerifier() {
            }

            @Override // com.google.protobuf.Internal.EnumVerifier
            public boolean isInRange(int i) {
                return gatewayprotocol.v1.NativeConfigurationOuterClass.ShowCompletionState.forNumber(i) != null;
            }
        }

        ShowCompletionState(int i) {
            this.value = i;
        }
    }

    public static final class RequestRetryPolicy extends com.google.protobuf.GeneratedMessageLite<gatewayprotocol.v1.NativeConfigurationOuterClass.RequestRetryPolicy, gatewayprotocol.v1.NativeConfigurationOuterClass.RequestRetryPolicy.Builder> implements gatewayprotocol.v1.NativeConfigurationOuterClass.RequestRetryPolicyOrBuilder {
        private static final gatewayprotocol.v1.NativeConfigurationOuterClass.RequestRetryPolicy DEFAULT_INSTANCE;
        public static final int MAX_DURATION_FIELD_NUMBER = 1;
        private static volatile com.google.protobuf.Parser<gatewayprotocol.v1.NativeConfigurationOuterClass.RequestRetryPolicy> PARSER = null;
        public static final int RETRY_JITTER_PCT_FIELD_NUMBER = 4;
        public static final int RETRY_MAX_INTERVAL_FIELD_NUMBER = 3;
        public static final int RETRY_SCALING_FACTOR_FIELD_NUMBER = 5;
        public static final int RETRY_WAIT_BASE_FIELD_NUMBER = 2;
        public static final int SHOULD_STORE_LOCALLY_FIELD_NUMBER = 6;
        private int maxDuration_;
        private float retryJitterPct_;
        private int retryMaxInterval_;
        private float retryScalingFactor_;
        private int retryWaitBase_;
        private boolean shouldStoreLocally_;

        private RequestRetryPolicy() {
        }

        @Override // gatewayprotocol.v1.NativeConfigurationOuterClass.RequestRetryPolicyOrBuilder
        public int getMaxDuration() {
            return this.maxDuration_;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setMaxDuration(int i) {
            this.maxDuration_ = i;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearMaxDuration() {
            this.maxDuration_ = 0;
        }

        @Override // gatewayprotocol.v1.NativeConfigurationOuterClass.RequestRetryPolicyOrBuilder
        public int getRetryWaitBase() {
            return this.retryWaitBase_;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setRetryWaitBase(int i) {
            this.retryWaitBase_ = i;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearRetryWaitBase() {
            this.retryWaitBase_ = 0;
        }

        @Override // gatewayprotocol.v1.NativeConfigurationOuterClass.RequestRetryPolicyOrBuilder
        public int getRetryMaxInterval() {
            return this.retryMaxInterval_;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setRetryMaxInterval(int i) {
            this.retryMaxInterval_ = i;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearRetryMaxInterval() {
            this.retryMaxInterval_ = 0;
        }

        @Override // gatewayprotocol.v1.NativeConfigurationOuterClass.RequestRetryPolicyOrBuilder
        public float getRetryJitterPct() {
            return this.retryJitterPct_;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setRetryJitterPct(float f) {
            this.retryJitterPct_ = f;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearRetryJitterPct() {
            this.retryJitterPct_ = 0.0f;
        }

        @Override // gatewayprotocol.v1.NativeConfigurationOuterClass.RequestRetryPolicyOrBuilder
        public float getRetryScalingFactor() {
            return this.retryScalingFactor_;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setRetryScalingFactor(float f) {
            this.retryScalingFactor_ = f;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearRetryScalingFactor() {
            this.retryScalingFactor_ = 0.0f;
        }

        @Override // gatewayprotocol.v1.NativeConfigurationOuterClass.RequestRetryPolicyOrBuilder
        public boolean getShouldStoreLocally() {
            return this.shouldStoreLocally_;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setShouldStoreLocally(boolean z) {
            this.shouldStoreLocally_ = z;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearShouldStoreLocally() {
            this.shouldStoreLocally_ = false;
        }

        public static gatewayprotocol.v1.NativeConfigurationOuterClass.RequestRetryPolicy parseFrom(java.nio.ByteBuffer byteBuffer) throws com.google.protobuf.InvalidProtocolBufferException {
            return (gatewayprotocol.v1.NativeConfigurationOuterClass.RequestRetryPolicy) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
        }

        public static gatewayprotocol.v1.NativeConfigurationOuterClass.RequestRetryPolicy parseFrom(java.nio.ByteBuffer byteBuffer, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) throws com.google.protobuf.InvalidProtocolBufferException {
            return (gatewayprotocol.v1.NativeConfigurationOuterClass.RequestRetryPolicy) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
        }

        public static gatewayprotocol.v1.NativeConfigurationOuterClass.RequestRetryPolicy parseFrom(com.google.protobuf.ByteString byteString) throws com.google.protobuf.InvalidProtocolBufferException {
            return (gatewayprotocol.v1.NativeConfigurationOuterClass.RequestRetryPolicy) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
        }

        public static gatewayprotocol.v1.NativeConfigurationOuterClass.RequestRetryPolicy parseFrom(com.google.protobuf.ByteString byteString, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) throws com.google.protobuf.InvalidProtocolBufferException {
            return (gatewayprotocol.v1.NativeConfigurationOuterClass.RequestRetryPolicy) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
        }

        public static gatewayprotocol.v1.NativeConfigurationOuterClass.RequestRetryPolicy parseFrom(byte[] bArr) throws com.google.protobuf.InvalidProtocolBufferException {
            return (gatewayprotocol.v1.NativeConfigurationOuterClass.RequestRetryPolicy) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
        }

        public static gatewayprotocol.v1.NativeConfigurationOuterClass.RequestRetryPolicy parseFrom(byte[] bArr, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) throws com.google.protobuf.InvalidProtocolBufferException {
            return (gatewayprotocol.v1.NativeConfigurationOuterClass.RequestRetryPolicy) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
        }

        public static gatewayprotocol.v1.NativeConfigurationOuterClass.RequestRetryPolicy parseFrom(java.io.InputStream inputStream) throws java.io.IOException {
            return (gatewayprotocol.v1.NativeConfigurationOuterClass.RequestRetryPolicy) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static gatewayprotocol.v1.NativeConfigurationOuterClass.RequestRetryPolicy parseFrom(java.io.InputStream inputStream, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) throws java.io.IOException {
            return (gatewayprotocol.v1.NativeConfigurationOuterClass.RequestRetryPolicy) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
        }

        public static gatewayprotocol.v1.NativeConfigurationOuterClass.RequestRetryPolicy parseDelimitedFrom(java.io.InputStream inputStream) throws java.io.IOException {
            return (gatewayprotocol.v1.NativeConfigurationOuterClass.RequestRetryPolicy) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static gatewayprotocol.v1.NativeConfigurationOuterClass.RequestRetryPolicy parseDelimitedFrom(java.io.InputStream inputStream, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) throws java.io.IOException {
            return (gatewayprotocol.v1.NativeConfigurationOuterClass.RequestRetryPolicy) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
        }

        public static gatewayprotocol.v1.NativeConfigurationOuterClass.RequestRetryPolicy parseFrom(com.google.protobuf.CodedInputStream codedInputStream) throws java.io.IOException {
            return (gatewayprotocol.v1.NativeConfigurationOuterClass.RequestRetryPolicy) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
        }

        public static gatewayprotocol.v1.NativeConfigurationOuterClass.RequestRetryPolicy parseFrom(com.google.protobuf.CodedInputStream codedInputStream, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) throws java.io.IOException {
            return (gatewayprotocol.v1.NativeConfigurationOuterClass.RequestRetryPolicy) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
        }

        public static gatewayprotocol.v1.NativeConfigurationOuterClass.RequestRetryPolicy.Builder newBuilder() {
            return DEFAULT_INSTANCE.createBuilder();
        }

        public static gatewayprotocol.v1.NativeConfigurationOuterClass.RequestRetryPolicy.Builder newBuilder(gatewayprotocol.v1.NativeConfigurationOuterClass.RequestRetryPolicy requestRetryPolicy) {
            return DEFAULT_INSTANCE.createBuilder(requestRetryPolicy);
        }

        public static final class Builder extends com.google.protobuf.GeneratedMessageLite.Builder<gatewayprotocol.v1.NativeConfigurationOuterClass.RequestRetryPolicy, gatewayprotocol.v1.NativeConfigurationOuterClass.RequestRetryPolicy.Builder> implements gatewayprotocol.v1.NativeConfigurationOuterClass.RequestRetryPolicyOrBuilder {
            /* synthetic */ Builder(gatewayprotocol.v1.NativeConfigurationOuterClass.AnonymousClass1 anonymousClass1) {
                this();
            }

            private Builder() {
                super(gatewayprotocol.v1.NativeConfigurationOuterClass.RequestRetryPolicy.DEFAULT_INSTANCE);
            }

            @Override // gatewayprotocol.v1.NativeConfigurationOuterClass.RequestRetryPolicyOrBuilder
            public int getMaxDuration() {
                return ((gatewayprotocol.v1.NativeConfigurationOuterClass.RequestRetryPolicy) this.instance).getMaxDuration();
            }

            public gatewayprotocol.v1.NativeConfigurationOuterClass.RequestRetryPolicy.Builder setMaxDuration(int i) {
                copyOnWrite();
                ((gatewayprotocol.v1.NativeConfigurationOuterClass.RequestRetryPolicy) this.instance).setMaxDuration(i);
                return this;
            }

            public gatewayprotocol.v1.NativeConfigurationOuterClass.RequestRetryPolicy.Builder clearMaxDuration() {
                copyOnWrite();
                ((gatewayprotocol.v1.NativeConfigurationOuterClass.RequestRetryPolicy) this.instance).clearMaxDuration();
                return this;
            }

            @Override // gatewayprotocol.v1.NativeConfigurationOuterClass.RequestRetryPolicyOrBuilder
            public int getRetryWaitBase() {
                return ((gatewayprotocol.v1.NativeConfigurationOuterClass.RequestRetryPolicy) this.instance).getRetryWaitBase();
            }

            public gatewayprotocol.v1.NativeConfigurationOuterClass.RequestRetryPolicy.Builder setRetryWaitBase(int i) {
                copyOnWrite();
                ((gatewayprotocol.v1.NativeConfigurationOuterClass.RequestRetryPolicy) this.instance).setRetryWaitBase(i);
                return this;
            }

            public gatewayprotocol.v1.NativeConfigurationOuterClass.RequestRetryPolicy.Builder clearRetryWaitBase() {
                copyOnWrite();
                ((gatewayprotocol.v1.NativeConfigurationOuterClass.RequestRetryPolicy) this.instance).clearRetryWaitBase();
                return this;
            }

            @Override // gatewayprotocol.v1.NativeConfigurationOuterClass.RequestRetryPolicyOrBuilder
            public int getRetryMaxInterval() {
                return ((gatewayprotocol.v1.NativeConfigurationOuterClass.RequestRetryPolicy) this.instance).getRetryMaxInterval();
            }

            public gatewayprotocol.v1.NativeConfigurationOuterClass.RequestRetryPolicy.Builder setRetryMaxInterval(int i) {
                copyOnWrite();
                ((gatewayprotocol.v1.NativeConfigurationOuterClass.RequestRetryPolicy) this.instance).setRetryMaxInterval(i);
                return this;
            }

            public gatewayprotocol.v1.NativeConfigurationOuterClass.RequestRetryPolicy.Builder clearRetryMaxInterval() {
                copyOnWrite();
                ((gatewayprotocol.v1.NativeConfigurationOuterClass.RequestRetryPolicy) this.instance).clearRetryMaxInterval();
                return this;
            }

            @Override // gatewayprotocol.v1.NativeConfigurationOuterClass.RequestRetryPolicyOrBuilder
            public float getRetryJitterPct() {
                return ((gatewayprotocol.v1.NativeConfigurationOuterClass.RequestRetryPolicy) this.instance).getRetryJitterPct();
            }

            public gatewayprotocol.v1.NativeConfigurationOuterClass.RequestRetryPolicy.Builder setRetryJitterPct(float f) {
                copyOnWrite();
                ((gatewayprotocol.v1.NativeConfigurationOuterClass.RequestRetryPolicy) this.instance).setRetryJitterPct(f);
                return this;
            }

            public gatewayprotocol.v1.NativeConfigurationOuterClass.RequestRetryPolicy.Builder clearRetryJitterPct() {
                copyOnWrite();
                ((gatewayprotocol.v1.NativeConfigurationOuterClass.RequestRetryPolicy) this.instance).clearRetryJitterPct();
                return this;
            }

            @Override // gatewayprotocol.v1.NativeConfigurationOuterClass.RequestRetryPolicyOrBuilder
            public float getRetryScalingFactor() {
                return ((gatewayprotocol.v1.NativeConfigurationOuterClass.RequestRetryPolicy) this.instance).getRetryScalingFactor();
            }

            public gatewayprotocol.v1.NativeConfigurationOuterClass.RequestRetryPolicy.Builder setRetryScalingFactor(float f) {
                copyOnWrite();
                ((gatewayprotocol.v1.NativeConfigurationOuterClass.RequestRetryPolicy) this.instance).setRetryScalingFactor(f);
                return this;
            }

            public gatewayprotocol.v1.NativeConfigurationOuterClass.RequestRetryPolicy.Builder clearRetryScalingFactor() {
                copyOnWrite();
                ((gatewayprotocol.v1.NativeConfigurationOuterClass.RequestRetryPolicy) this.instance).clearRetryScalingFactor();
                return this;
            }

            @Override // gatewayprotocol.v1.NativeConfigurationOuterClass.RequestRetryPolicyOrBuilder
            public boolean getShouldStoreLocally() {
                return ((gatewayprotocol.v1.NativeConfigurationOuterClass.RequestRetryPolicy) this.instance).getShouldStoreLocally();
            }

            public gatewayprotocol.v1.NativeConfigurationOuterClass.RequestRetryPolicy.Builder setShouldStoreLocally(boolean z) {
                copyOnWrite();
                ((gatewayprotocol.v1.NativeConfigurationOuterClass.RequestRetryPolicy) this.instance).setShouldStoreLocally(z);
                return this;
            }

            public gatewayprotocol.v1.NativeConfigurationOuterClass.RequestRetryPolicy.Builder clearShouldStoreLocally() {
                copyOnWrite();
                ((gatewayprotocol.v1.NativeConfigurationOuterClass.RequestRetryPolicy) this.instance).clearShouldStoreLocally();
                return this;
            }
        }

        @Override // com.google.protobuf.GeneratedMessageLite
        protected final java.lang.Object dynamicMethod(com.google.protobuf.GeneratedMessageLite.MethodToInvoke methodToInvoke, java.lang.Object obj, java.lang.Object obj2) {
            gatewayprotocol.v1.NativeConfigurationOuterClass.AnonymousClass1 anonymousClass1 = null;
            switch (gatewayprotocol.v1.NativeConfigurationOuterClass.AnonymousClass1.$SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke[methodToInvoke.ordinal()]) {
                case 1:
                    return new gatewayprotocol.v1.NativeConfigurationOuterClass.RequestRetryPolicy();
                case 2:
                    return new gatewayprotocol.v1.NativeConfigurationOuterClass.RequestRetryPolicy.Builder(anonymousClass1);
                case 3:
                    return newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0006\u0000\u0000\u0001\u0006\u0006\u0000\u0000\u0000\u0001\u0004\u0002\u0004\u0003\u0004\u0004\u0001\u0005\u0001\u0006\u0007", new java.lang.Object[]{"maxDuration_", "retryWaitBase_", "retryMaxInterval_", "retryJitterPct_", "retryScalingFactor_", "shouldStoreLocally_"});
                case 4:
                    return DEFAULT_INSTANCE;
                case 5:
                    com.google.protobuf.Parser<gatewayprotocol.v1.NativeConfigurationOuterClass.RequestRetryPolicy> parser = PARSER;
                    if (parser == null) {
                        synchronized (gatewayprotocol.v1.NativeConfigurationOuterClass.RequestRetryPolicy.class) {
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
            gatewayprotocol.v1.NativeConfigurationOuterClass.RequestRetryPolicy requestRetryPolicy = new gatewayprotocol.v1.NativeConfigurationOuterClass.RequestRetryPolicy();
            DEFAULT_INSTANCE = requestRetryPolicy;
            com.google.protobuf.GeneratedMessageLite.registerDefaultInstance(gatewayprotocol.v1.NativeConfigurationOuterClass.RequestRetryPolicy.class, requestRetryPolicy);
        }

        public static gatewayprotocol.v1.NativeConfigurationOuterClass.RequestRetryPolicy getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static com.google.protobuf.Parser<gatewayprotocol.v1.NativeConfigurationOuterClass.RequestRetryPolicy> parser() {
            return DEFAULT_INSTANCE.getParserForType();
        }
    }

    /* renamed from: gatewayprotocol.v1.NativeConfigurationOuterClass$1, reason: invalid class name */
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

    public static final class RequestTimeoutPolicy extends com.google.protobuf.GeneratedMessageLite<gatewayprotocol.v1.NativeConfigurationOuterClass.RequestTimeoutPolicy, gatewayprotocol.v1.NativeConfigurationOuterClass.RequestTimeoutPolicy.Builder> implements gatewayprotocol.v1.NativeConfigurationOuterClass.RequestTimeoutPolicyOrBuilder {
        public static final int CONNECT_TIMEOUT_MS_FIELD_NUMBER = 1;
        private static final gatewayprotocol.v1.NativeConfigurationOuterClass.RequestTimeoutPolicy DEFAULT_INSTANCE;
        public static final int OVERALL_TIMEOUT_MS_FIELD_NUMBER = 4;
        private static volatile com.google.protobuf.Parser<gatewayprotocol.v1.NativeConfigurationOuterClass.RequestTimeoutPolicy> PARSER = null;
        public static final int READ_TIMEOUT_MS_FIELD_NUMBER = 2;
        public static final int WRITE_TIMEOUT_MS_FIELD_NUMBER = 3;
        private int connectTimeoutMs_;
        private int overallTimeoutMs_;
        private int readTimeoutMs_;
        private int writeTimeoutMs_;

        private RequestTimeoutPolicy() {
        }

        @Override // gatewayprotocol.v1.NativeConfigurationOuterClass.RequestTimeoutPolicyOrBuilder
        public int getConnectTimeoutMs() {
            return this.connectTimeoutMs_;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setConnectTimeoutMs(int i) {
            this.connectTimeoutMs_ = i;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearConnectTimeoutMs() {
            this.connectTimeoutMs_ = 0;
        }

        @Override // gatewayprotocol.v1.NativeConfigurationOuterClass.RequestTimeoutPolicyOrBuilder
        public int getReadTimeoutMs() {
            return this.readTimeoutMs_;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setReadTimeoutMs(int i) {
            this.readTimeoutMs_ = i;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearReadTimeoutMs() {
            this.readTimeoutMs_ = 0;
        }

        @Override // gatewayprotocol.v1.NativeConfigurationOuterClass.RequestTimeoutPolicyOrBuilder
        public int getWriteTimeoutMs() {
            return this.writeTimeoutMs_;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setWriteTimeoutMs(int i) {
            this.writeTimeoutMs_ = i;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearWriteTimeoutMs() {
            this.writeTimeoutMs_ = 0;
        }

        @Override // gatewayprotocol.v1.NativeConfigurationOuterClass.RequestTimeoutPolicyOrBuilder
        public int getOverallTimeoutMs() {
            return this.overallTimeoutMs_;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setOverallTimeoutMs(int i) {
            this.overallTimeoutMs_ = i;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearOverallTimeoutMs() {
            this.overallTimeoutMs_ = 0;
        }

        public static gatewayprotocol.v1.NativeConfigurationOuterClass.RequestTimeoutPolicy parseFrom(java.nio.ByteBuffer byteBuffer) throws com.google.protobuf.InvalidProtocolBufferException {
            return (gatewayprotocol.v1.NativeConfigurationOuterClass.RequestTimeoutPolicy) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
        }

        public static gatewayprotocol.v1.NativeConfigurationOuterClass.RequestTimeoutPolicy parseFrom(java.nio.ByteBuffer byteBuffer, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) throws com.google.protobuf.InvalidProtocolBufferException {
            return (gatewayprotocol.v1.NativeConfigurationOuterClass.RequestTimeoutPolicy) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
        }

        public static gatewayprotocol.v1.NativeConfigurationOuterClass.RequestTimeoutPolicy parseFrom(com.google.protobuf.ByteString byteString) throws com.google.protobuf.InvalidProtocolBufferException {
            return (gatewayprotocol.v1.NativeConfigurationOuterClass.RequestTimeoutPolicy) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
        }

        public static gatewayprotocol.v1.NativeConfigurationOuterClass.RequestTimeoutPolicy parseFrom(com.google.protobuf.ByteString byteString, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) throws com.google.protobuf.InvalidProtocolBufferException {
            return (gatewayprotocol.v1.NativeConfigurationOuterClass.RequestTimeoutPolicy) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
        }

        public static gatewayprotocol.v1.NativeConfigurationOuterClass.RequestTimeoutPolicy parseFrom(byte[] bArr) throws com.google.protobuf.InvalidProtocolBufferException {
            return (gatewayprotocol.v1.NativeConfigurationOuterClass.RequestTimeoutPolicy) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
        }

        public static gatewayprotocol.v1.NativeConfigurationOuterClass.RequestTimeoutPolicy parseFrom(byte[] bArr, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) throws com.google.protobuf.InvalidProtocolBufferException {
            return (gatewayprotocol.v1.NativeConfigurationOuterClass.RequestTimeoutPolicy) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
        }

        public static gatewayprotocol.v1.NativeConfigurationOuterClass.RequestTimeoutPolicy parseFrom(java.io.InputStream inputStream) throws java.io.IOException {
            return (gatewayprotocol.v1.NativeConfigurationOuterClass.RequestTimeoutPolicy) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static gatewayprotocol.v1.NativeConfigurationOuterClass.RequestTimeoutPolicy parseFrom(java.io.InputStream inputStream, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) throws java.io.IOException {
            return (gatewayprotocol.v1.NativeConfigurationOuterClass.RequestTimeoutPolicy) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
        }

        public static gatewayprotocol.v1.NativeConfigurationOuterClass.RequestTimeoutPolicy parseDelimitedFrom(java.io.InputStream inputStream) throws java.io.IOException {
            return (gatewayprotocol.v1.NativeConfigurationOuterClass.RequestTimeoutPolicy) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static gatewayprotocol.v1.NativeConfigurationOuterClass.RequestTimeoutPolicy parseDelimitedFrom(java.io.InputStream inputStream, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) throws java.io.IOException {
            return (gatewayprotocol.v1.NativeConfigurationOuterClass.RequestTimeoutPolicy) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
        }

        public static gatewayprotocol.v1.NativeConfigurationOuterClass.RequestTimeoutPolicy parseFrom(com.google.protobuf.CodedInputStream codedInputStream) throws java.io.IOException {
            return (gatewayprotocol.v1.NativeConfigurationOuterClass.RequestTimeoutPolicy) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
        }

        public static gatewayprotocol.v1.NativeConfigurationOuterClass.RequestTimeoutPolicy parseFrom(com.google.protobuf.CodedInputStream codedInputStream, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) throws java.io.IOException {
            return (gatewayprotocol.v1.NativeConfigurationOuterClass.RequestTimeoutPolicy) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
        }

        public static gatewayprotocol.v1.NativeConfigurationOuterClass.RequestTimeoutPolicy.Builder newBuilder() {
            return DEFAULT_INSTANCE.createBuilder();
        }

        public static gatewayprotocol.v1.NativeConfigurationOuterClass.RequestTimeoutPolicy.Builder newBuilder(gatewayprotocol.v1.NativeConfigurationOuterClass.RequestTimeoutPolicy requestTimeoutPolicy) {
            return DEFAULT_INSTANCE.createBuilder(requestTimeoutPolicy);
        }

        public static final class Builder extends com.google.protobuf.GeneratedMessageLite.Builder<gatewayprotocol.v1.NativeConfigurationOuterClass.RequestTimeoutPolicy, gatewayprotocol.v1.NativeConfigurationOuterClass.RequestTimeoutPolicy.Builder> implements gatewayprotocol.v1.NativeConfigurationOuterClass.RequestTimeoutPolicyOrBuilder {
            /* synthetic */ Builder(gatewayprotocol.v1.NativeConfigurationOuterClass.AnonymousClass1 anonymousClass1) {
                this();
            }

            private Builder() {
                super(gatewayprotocol.v1.NativeConfigurationOuterClass.RequestTimeoutPolicy.DEFAULT_INSTANCE);
            }

            @Override // gatewayprotocol.v1.NativeConfigurationOuterClass.RequestTimeoutPolicyOrBuilder
            public int getConnectTimeoutMs() {
                return ((gatewayprotocol.v1.NativeConfigurationOuterClass.RequestTimeoutPolicy) this.instance).getConnectTimeoutMs();
            }

            public gatewayprotocol.v1.NativeConfigurationOuterClass.RequestTimeoutPolicy.Builder setConnectTimeoutMs(int i) {
                copyOnWrite();
                ((gatewayprotocol.v1.NativeConfigurationOuterClass.RequestTimeoutPolicy) this.instance).setConnectTimeoutMs(i);
                return this;
            }

            public gatewayprotocol.v1.NativeConfigurationOuterClass.RequestTimeoutPolicy.Builder clearConnectTimeoutMs() {
                copyOnWrite();
                ((gatewayprotocol.v1.NativeConfigurationOuterClass.RequestTimeoutPolicy) this.instance).clearConnectTimeoutMs();
                return this;
            }

            @Override // gatewayprotocol.v1.NativeConfigurationOuterClass.RequestTimeoutPolicyOrBuilder
            public int getReadTimeoutMs() {
                return ((gatewayprotocol.v1.NativeConfigurationOuterClass.RequestTimeoutPolicy) this.instance).getReadTimeoutMs();
            }

            public gatewayprotocol.v1.NativeConfigurationOuterClass.RequestTimeoutPolicy.Builder setReadTimeoutMs(int i) {
                copyOnWrite();
                ((gatewayprotocol.v1.NativeConfigurationOuterClass.RequestTimeoutPolicy) this.instance).setReadTimeoutMs(i);
                return this;
            }

            public gatewayprotocol.v1.NativeConfigurationOuterClass.RequestTimeoutPolicy.Builder clearReadTimeoutMs() {
                copyOnWrite();
                ((gatewayprotocol.v1.NativeConfigurationOuterClass.RequestTimeoutPolicy) this.instance).clearReadTimeoutMs();
                return this;
            }

            @Override // gatewayprotocol.v1.NativeConfigurationOuterClass.RequestTimeoutPolicyOrBuilder
            public int getWriteTimeoutMs() {
                return ((gatewayprotocol.v1.NativeConfigurationOuterClass.RequestTimeoutPolicy) this.instance).getWriteTimeoutMs();
            }

            public gatewayprotocol.v1.NativeConfigurationOuterClass.RequestTimeoutPolicy.Builder setWriteTimeoutMs(int i) {
                copyOnWrite();
                ((gatewayprotocol.v1.NativeConfigurationOuterClass.RequestTimeoutPolicy) this.instance).setWriteTimeoutMs(i);
                return this;
            }

            public gatewayprotocol.v1.NativeConfigurationOuterClass.RequestTimeoutPolicy.Builder clearWriteTimeoutMs() {
                copyOnWrite();
                ((gatewayprotocol.v1.NativeConfigurationOuterClass.RequestTimeoutPolicy) this.instance).clearWriteTimeoutMs();
                return this;
            }

            @Override // gatewayprotocol.v1.NativeConfigurationOuterClass.RequestTimeoutPolicyOrBuilder
            public int getOverallTimeoutMs() {
                return ((gatewayprotocol.v1.NativeConfigurationOuterClass.RequestTimeoutPolicy) this.instance).getOverallTimeoutMs();
            }

            public gatewayprotocol.v1.NativeConfigurationOuterClass.RequestTimeoutPolicy.Builder setOverallTimeoutMs(int i) {
                copyOnWrite();
                ((gatewayprotocol.v1.NativeConfigurationOuterClass.RequestTimeoutPolicy) this.instance).setOverallTimeoutMs(i);
                return this;
            }

            public gatewayprotocol.v1.NativeConfigurationOuterClass.RequestTimeoutPolicy.Builder clearOverallTimeoutMs() {
                copyOnWrite();
                ((gatewayprotocol.v1.NativeConfigurationOuterClass.RequestTimeoutPolicy) this.instance).clearOverallTimeoutMs();
                return this;
            }
        }

        @Override // com.google.protobuf.GeneratedMessageLite
        protected final java.lang.Object dynamicMethod(com.google.protobuf.GeneratedMessageLite.MethodToInvoke methodToInvoke, java.lang.Object obj, java.lang.Object obj2) {
            gatewayprotocol.v1.NativeConfigurationOuterClass.AnonymousClass1 anonymousClass1 = null;
            switch (gatewayprotocol.v1.NativeConfigurationOuterClass.AnonymousClass1.$SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke[methodToInvoke.ordinal()]) {
                case 1:
                    return new gatewayprotocol.v1.NativeConfigurationOuterClass.RequestTimeoutPolicy();
                case 2:
                    return new gatewayprotocol.v1.NativeConfigurationOuterClass.RequestTimeoutPolicy.Builder(anonymousClass1);
                case 3:
                    return newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0004\u0000\u0000\u0001\u0004\u0004\u0000\u0000\u0000\u0001\u0004\u0002\u0004\u0003\u0004\u0004\u0004", new java.lang.Object[]{"connectTimeoutMs_", "readTimeoutMs_", "writeTimeoutMs_", "overallTimeoutMs_"});
                case 4:
                    return DEFAULT_INSTANCE;
                case 5:
                    com.google.protobuf.Parser<gatewayprotocol.v1.NativeConfigurationOuterClass.RequestTimeoutPolicy> parser = PARSER;
                    if (parser == null) {
                        synchronized (gatewayprotocol.v1.NativeConfigurationOuterClass.RequestTimeoutPolicy.class) {
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
            gatewayprotocol.v1.NativeConfigurationOuterClass.RequestTimeoutPolicy requestTimeoutPolicy = new gatewayprotocol.v1.NativeConfigurationOuterClass.RequestTimeoutPolicy();
            DEFAULT_INSTANCE = requestTimeoutPolicy;
            com.google.protobuf.GeneratedMessageLite.registerDefaultInstance(gatewayprotocol.v1.NativeConfigurationOuterClass.RequestTimeoutPolicy.class, requestTimeoutPolicy);
        }

        public static gatewayprotocol.v1.NativeConfigurationOuterClass.RequestTimeoutPolicy getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static com.google.protobuf.Parser<gatewayprotocol.v1.NativeConfigurationOuterClass.RequestTimeoutPolicy> parser() {
            return DEFAULT_INSTANCE.getParserForType();
        }
    }

    public static final class RequestPolicy extends com.google.protobuf.GeneratedMessageLite<gatewayprotocol.v1.NativeConfigurationOuterClass.RequestPolicy, gatewayprotocol.v1.NativeConfigurationOuterClass.RequestPolicy.Builder> implements gatewayprotocol.v1.NativeConfigurationOuterClass.RequestPolicyOrBuilder {
        private static final gatewayprotocol.v1.NativeConfigurationOuterClass.RequestPolicy DEFAULT_INSTANCE;
        private static volatile com.google.protobuf.Parser<gatewayprotocol.v1.NativeConfigurationOuterClass.RequestPolicy> PARSER = null;
        public static final int RETRY_POLICY_FIELD_NUMBER = 1;
        public static final int TIMEOUT_POLICY_FIELD_NUMBER = 2;
        private int bitField0_;
        private gatewayprotocol.v1.NativeConfigurationOuterClass.RequestRetryPolicy retryPolicy_;
        private gatewayprotocol.v1.NativeConfigurationOuterClass.RequestTimeoutPolicy timeoutPolicy_;

        private RequestPolicy() {
        }

        @Override // gatewayprotocol.v1.NativeConfigurationOuterClass.RequestPolicyOrBuilder
        public boolean hasRetryPolicy() {
            return (this.bitField0_ & 1) != 0;
        }

        @Override // gatewayprotocol.v1.NativeConfigurationOuterClass.RequestPolicyOrBuilder
        public gatewayprotocol.v1.NativeConfigurationOuterClass.RequestRetryPolicy getRetryPolicy() {
            gatewayprotocol.v1.NativeConfigurationOuterClass.RequestRetryPolicy requestRetryPolicy = this.retryPolicy_;
            return requestRetryPolicy == null ? gatewayprotocol.v1.NativeConfigurationOuterClass.RequestRetryPolicy.getDefaultInstance() : requestRetryPolicy;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setRetryPolicy(gatewayprotocol.v1.NativeConfigurationOuterClass.RequestRetryPolicy requestRetryPolicy) {
            requestRetryPolicy.getClass();
            this.retryPolicy_ = requestRetryPolicy;
            this.bitField0_ |= 1;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void mergeRetryPolicy(gatewayprotocol.v1.NativeConfigurationOuterClass.RequestRetryPolicy requestRetryPolicy) {
            requestRetryPolicy.getClass();
            gatewayprotocol.v1.NativeConfigurationOuterClass.RequestRetryPolicy requestRetryPolicy2 = this.retryPolicy_;
            if (requestRetryPolicy2 != null && requestRetryPolicy2 != gatewayprotocol.v1.NativeConfigurationOuterClass.RequestRetryPolicy.getDefaultInstance()) {
                this.retryPolicy_ = gatewayprotocol.v1.NativeConfigurationOuterClass.RequestRetryPolicy.newBuilder(this.retryPolicy_).mergeFrom((gatewayprotocol.v1.NativeConfigurationOuterClass.RequestRetryPolicy.Builder) requestRetryPolicy).buildPartial();
            } else {
                this.retryPolicy_ = requestRetryPolicy;
            }
            this.bitField0_ |= 1;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearRetryPolicy() {
            this.retryPolicy_ = null;
            this.bitField0_ &= -2;
        }

        @Override // gatewayprotocol.v1.NativeConfigurationOuterClass.RequestPolicyOrBuilder
        public boolean hasTimeoutPolicy() {
            return (this.bitField0_ & 2) != 0;
        }

        @Override // gatewayprotocol.v1.NativeConfigurationOuterClass.RequestPolicyOrBuilder
        public gatewayprotocol.v1.NativeConfigurationOuterClass.RequestTimeoutPolicy getTimeoutPolicy() {
            gatewayprotocol.v1.NativeConfigurationOuterClass.RequestTimeoutPolicy requestTimeoutPolicy = this.timeoutPolicy_;
            return requestTimeoutPolicy == null ? gatewayprotocol.v1.NativeConfigurationOuterClass.RequestTimeoutPolicy.getDefaultInstance() : requestTimeoutPolicy;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setTimeoutPolicy(gatewayprotocol.v1.NativeConfigurationOuterClass.RequestTimeoutPolicy requestTimeoutPolicy) {
            requestTimeoutPolicy.getClass();
            this.timeoutPolicy_ = requestTimeoutPolicy;
            this.bitField0_ |= 2;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void mergeTimeoutPolicy(gatewayprotocol.v1.NativeConfigurationOuterClass.RequestTimeoutPolicy requestTimeoutPolicy) {
            requestTimeoutPolicy.getClass();
            gatewayprotocol.v1.NativeConfigurationOuterClass.RequestTimeoutPolicy requestTimeoutPolicy2 = this.timeoutPolicy_;
            if (requestTimeoutPolicy2 != null && requestTimeoutPolicy2 != gatewayprotocol.v1.NativeConfigurationOuterClass.RequestTimeoutPolicy.getDefaultInstance()) {
                this.timeoutPolicy_ = gatewayprotocol.v1.NativeConfigurationOuterClass.RequestTimeoutPolicy.newBuilder(this.timeoutPolicy_).mergeFrom((gatewayprotocol.v1.NativeConfigurationOuterClass.RequestTimeoutPolicy.Builder) requestTimeoutPolicy).buildPartial();
            } else {
                this.timeoutPolicy_ = requestTimeoutPolicy;
            }
            this.bitField0_ |= 2;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearTimeoutPolicy() {
            this.timeoutPolicy_ = null;
            this.bitField0_ &= -3;
        }

        public static gatewayprotocol.v1.NativeConfigurationOuterClass.RequestPolicy parseFrom(java.nio.ByteBuffer byteBuffer) throws com.google.protobuf.InvalidProtocolBufferException {
            return (gatewayprotocol.v1.NativeConfigurationOuterClass.RequestPolicy) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
        }

        public static gatewayprotocol.v1.NativeConfigurationOuterClass.RequestPolicy parseFrom(java.nio.ByteBuffer byteBuffer, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) throws com.google.protobuf.InvalidProtocolBufferException {
            return (gatewayprotocol.v1.NativeConfigurationOuterClass.RequestPolicy) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
        }

        public static gatewayprotocol.v1.NativeConfigurationOuterClass.RequestPolicy parseFrom(com.google.protobuf.ByteString byteString) throws com.google.protobuf.InvalidProtocolBufferException {
            return (gatewayprotocol.v1.NativeConfigurationOuterClass.RequestPolicy) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
        }

        public static gatewayprotocol.v1.NativeConfigurationOuterClass.RequestPolicy parseFrom(com.google.protobuf.ByteString byteString, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) throws com.google.protobuf.InvalidProtocolBufferException {
            return (gatewayprotocol.v1.NativeConfigurationOuterClass.RequestPolicy) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
        }

        public static gatewayprotocol.v1.NativeConfigurationOuterClass.RequestPolicy parseFrom(byte[] bArr) throws com.google.protobuf.InvalidProtocolBufferException {
            return (gatewayprotocol.v1.NativeConfigurationOuterClass.RequestPolicy) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
        }

        public static gatewayprotocol.v1.NativeConfigurationOuterClass.RequestPolicy parseFrom(byte[] bArr, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) throws com.google.protobuf.InvalidProtocolBufferException {
            return (gatewayprotocol.v1.NativeConfigurationOuterClass.RequestPolicy) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
        }

        public static gatewayprotocol.v1.NativeConfigurationOuterClass.RequestPolicy parseFrom(java.io.InputStream inputStream) throws java.io.IOException {
            return (gatewayprotocol.v1.NativeConfigurationOuterClass.RequestPolicy) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static gatewayprotocol.v1.NativeConfigurationOuterClass.RequestPolicy parseFrom(java.io.InputStream inputStream, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) throws java.io.IOException {
            return (gatewayprotocol.v1.NativeConfigurationOuterClass.RequestPolicy) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
        }

        public static gatewayprotocol.v1.NativeConfigurationOuterClass.RequestPolicy parseDelimitedFrom(java.io.InputStream inputStream) throws java.io.IOException {
            return (gatewayprotocol.v1.NativeConfigurationOuterClass.RequestPolicy) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static gatewayprotocol.v1.NativeConfigurationOuterClass.RequestPolicy parseDelimitedFrom(java.io.InputStream inputStream, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) throws java.io.IOException {
            return (gatewayprotocol.v1.NativeConfigurationOuterClass.RequestPolicy) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
        }

        public static gatewayprotocol.v1.NativeConfigurationOuterClass.RequestPolicy parseFrom(com.google.protobuf.CodedInputStream codedInputStream) throws java.io.IOException {
            return (gatewayprotocol.v1.NativeConfigurationOuterClass.RequestPolicy) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
        }

        public static gatewayprotocol.v1.NativeConfigurationOuterClass.RequestPolicy parseFrom(com.google.protobuf.CodedInputStream codedInputStream, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) throws java.io.IOException {
            return (gatewayprotocol.v1.NativeConfigurationOuterClass.RequestPolicy) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
        }

        public static gatewayprotocol.v1.NativeConfigurationOuterClass.RequestPolicy.Builder newBuilder() {
            return DEFAULT_INSTANCE.createBuilder();
        }

        public static gatewayprotocol.v1.NativeConfigurationOuterClass.RequestPolicy.Builder newBuilder(gatewayprotocol.v1.NativeConfigurationOuterClass.RequestPolicy requestPolicy) {
            return DEFAULT_INSTANCE.createBuilder(requestPolicy);
        }

        public static final class Builder extends com.google.protobuf.GeneratedMessageLite.Builder<gatewayprotocol.v1.NativeConfigurationOuterClass.RequestPolicy, gatewayprotocol.v1.NativeConfigurationOuterClass.RequestPolicy.Builder> implements gatewayprotocol.v1.NativeConfigurationOuterClass.RequestPolicyOrBuilder {
            /* synthetic */ Builder(gatewayprotocol.v1.NativeConfigurationOuterClass.AnonymousClass1 anonymousClass1) {
                this();
            }

            private Builder() {
                super(gatewayprotocol.v1.NativeConfigurationOuterClass.RequestPolicy.DEFAULT_INSTANCE);
            }

            @Override // gatewayprotocol.v1.NativeConfigurationOuterClass.RequestPolicyOrBuilder
            public boolean hasRetryPolicy() {
                return ((gatewayprotocol.v1.NativeConfigurationOuterClass.RequestPolicy) this.instance).hasRetryPolicy();
            }

            @Override // gatewayprotocol.v1.NativeConfigurationOuterClass.RequestPolicyOrBuilder
            public gatewayprotocol.v1.NativeConfigurationOuterClass.RequestRetryPolicy getRetryPolicy() {
                return ((gatewayprotocol.v1.NativeConfigurationOuterClass.RequestPolicy) this.instance).getRetryPolicy();
            }

            public gatewayprotocol.v1.NativeConfigurationOuterClass.RequestPolicy.Builder setRetryPolicy(gatewayprotocol.v1.NativeConfigurationOuterClass.RequestRetryPolicy requestRetryPolicy) {
                copyOnWrite();
                ((gatewayprotocol.v1.NativeConfigurationOuterClass.RequestPolicy) this.instance).setRetryPolicy(requestRetryPolicy);
                return this;
            }

            public gatewayprotocol.v1.NativeConfigurationOuterClass.RequestPolicy.Builder setRetryPolicy(gatewayprotocol.v1.NativeConfigurationOuterClass.RequestRetryPolicy.Builder builder) {
                copyOnWrite();
                ((gatewayprotocol.v1.NativeConfigurationOuterClass.RequestPolicy) this.instance).setRetryPolicy(builder.build());
                return this;
            }

            public gatewayprotocol.v1.NativeConfigurationOuterClass.RequestPolicy.Builder mergeRetryPolicy(gatewayprotocol.v1.NativeConfigurationOuterClass.RequestRetryPolicy requestRetryPolicy) {
                copyOnWrite();
                ((gatewayprotocol.v1.NativeConfigurationOuterClass.RequestPolicy) this.instance).mergeRetryPolicy(requestRetryPolicy);
                return this;
            }

            public gatewayprotocol.v1.NativeConfigurationOuterClass.RequestPolicy.Builder clearRetryPolicy() {
                copyOnWrite();
                ((gatewayprotocol.v1.NativeConfigurationOuterClass.RequestPolicy) this.instance).clearRetryPolicy();
                return this;
            }

            @Override // gatewayprotocol.v1.NativeConfigurationOuterClass.RequestPolicyOrBuilder
            public boolean hasTimeoutPolicy() {
                return ((gatewayprotocol.v1.NativeConfigurationOuterClass.RequestPolicy) this.instance).hasTimeoutPolicy();
            }

            @Override // gatewayprotocol.v1.NativeConfigurationOuterClass.RequestPolicyOrBuilder
            public gatewayprotocol.v1.NativeConfigurationOuterClass.RequestTimeoutPolicy getTimeoutPolicy() {
                return ((gatewayprotocol.v1.NativeConfigurationOuterClass.RequestPolicy) this.instance).getTimeoutPolicy();
            }

            public gatewayprotocol.v1.NativeConfigurationOuterClass.RequestPolicy.Builder setTimeoutPolicy(gatewayprotocol.v1.NativeConfigurationOuterClass.RequestTimeoutPolicy requestTimeoutPolicy) {
                copyOnWrite();
                ((gatewayprotocol.v1.NativeConfigurationOuterClass.RequestPolicy) this.instance).setTimeoutPolicy(requestTimeoutPolicy);
                return this;
            }

            public gatewayprotocol.v1.NativeConfigurationOuterClass.RequestPolicy.Builder setTimeoutPolicy(gatewayprotocol.v1.NativeConfigurationOuterClass.RequestTimeoutPolicy.Builder builder) {
                copyOnWrite();
                ((gatewayprotocol.v1.NativeConfigurationOuterClass.RequestPolicy) this.instance).setTimeoutPolicy(builder.build());
                return this;
            }

            public gatewayprotocol.v1.NativeConfigurationOuterClass.RequestPolicy.Builder mergeTimeoutPolicy(gatewayprotocol.v1.NativeConfigurationOuterClass.RequestTimeoutPolicy requestTimeoutPolicy) {
                copyOnWrite();
                ((gatewayprotocol.v1.NativeConfigurationOuterClass.RequestPolicy) this.instance).mergeTimeoutPolicy(requestTimeoutPolicy);
                return this;
            }

            public gatewayprotocol.v1.NativeConfigurationOuterClass.RequestPolicy.Builder clearTimeoutPolicy() {
                copyOnWrite();
                ((gatewayprotocol.v1.NativeConfigurationOuterClass.RequestPolicy) this.instance).clearTimeoutPolicy();
                return this;
            }
        }

        @Override // com.google.protobuf.GeneratedMessageLite
        protected final java.lang.Object dynamicMethod(com.google.protobuf.GeneratedMessageLite.MethodToInvoke methodToInvoke, java.lang.Object obj, java.lang.Object obj2) {
            gatewayprotocol.v1.NativeConfigurationOuterClass.AnonymousClass1 anonymousClass1 = null;
            switch (gatewayprotocol.v1.NativeConfigurationOuterClass.AnonymousClass1.$SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke[methodToInvoke.ordinal()]) {
                case 1:
                    return new gatewayprotocol.v1.NativeConfigurationOuterClass.RequestPolicy();
                case 2:
                    return new gatewayprotocol.v1.NativeConfigurationOuterClass.RequestPolicy.Builder(anonymousClass1);
                case 3:
                    return newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဉ\u0000\u0002ဉ\u0001", new java.lang.Object[]{"bitField0_", "retryPolicy_", "timeoutPolicy_"});
                case 4:
                    return DEFAULT_INSTANCE;
                case 5:
                    com.google.protobuf.Parser<gatewayprotocol.v1.NativeConfigurationOuterClass.RequestPolicy> parser = PARSER;
                    if (parser == null) {
                        synchronized (gatewayprotocol.v1.NativeConfigurationOuterClass.RequestPolicy.class) {
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
            gatewayprotocol.v1.NativeConfigurationOuterClass.RequestPolicy requestPolicy = new gatewayprotocol.v1.NativeConfigurationOuterClass.RequestPolicy();
            DEFAULT_INSTANCE = requestPolicy;
            com.google.protobuf.GeneratedMessageLite.registerDefaultInstance(gatewayprotocol.v1.NativeConfigurationOuterClass.RequestPolicy.class, requestPolicy);
        }

        public static gatewayprotocol.v1.NativeConfigurationOuterClass.RequestPolicy getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static com.google.protobuf.Parser<gatewayprotocol.v1.NativeConfigurationOuterClass.RequestPolicy> parser() {
            return DEFAULT_INSTANCE.getParserForType();
        }
    }

    public static final class DiagnosticEventsConfiguration extends com.google.protobuf.GeneratedMessageLite<gatewayprotocol.v1.NativeConfigurationOuterClass.DiagnosticEventsConfiguration, gatewayprotocol.v1.NativeConfigurationOuterClass.DiagnosticEventsConfiguration.Builder> implements gatewayprotocol.v1.NativeConfigurationOuterClass.DiagnosticEventsConfigurationOrBuilder {
        public static final int ALLOWED_EVENTS_FIELD_NUMBER = 6;
        public static final int BLOCKED_EVENTS_FIELD_NUMBER = 7;
        private static final gatewayprotocol.v1.NativeConfigurationOuterClass.DiagnosticEventsConfiguration DEFAULT_INSTANCE;
        public static final int ENABLED_FIELD_NUMBER = 1;
        public static final int MAX_BATCH_INTERVAL_MS_FIELD_NUMBER = 3;
        public static final int MAX_BATCH_SIZE_FIELD_NUMBER = 2;
        private static volatile com.google.protobuf.Parser<gatewayprotocol.v1.NativeConfigurationOuterClass.DiagnosticEventsConfiguration> PARSER = null;
        public static final int SEVERITY_FIELD_NUMBER = 5;
        public static final int TTM_ENABLED_FIELD_NUMBER = 4;
        private static final com.google.protobuf.Internal.ListAdapter.Converter<java.lang.Integer, gatewayprotocol.v1.DiagnosticEventRequestOuterClass.DiagnosticEventType> allowedEvents_converter_ = new com.google.protobuf.Internal.ListAdapter.Converter<java.lang.Integer, gatewayprotocol.v1.DiagnosticEventRequestOuterClass.DiagnosticEventType>() { // from class: gatewayprotocol.v1.NativeConfigurationOuterClass.DiagnosticEventsConfiguration.1
            @Override // com.google.protobuf.Internal.ListAdapter.Converter
            public gatewayprotocol.v1.DiagnosticEventRequestOuterClass.DiagnosticEventType convert(java.lang.Integer num) {
                gatewayprotocol.v1.DiagnosticEventRequestOuterClass.DiagnosticEventType forNumber = gatewayprotocol.v1.DiagnosticEventRequestOuterClass.DiagnosticEventType.forNumber(num.intValue());
                return forNumber == null ? gatewayprotocol.v1.DiagnosticEventRequestOuterClass.DiagnosticEventType.UNRECOGNIZED : forNumber;
            }
        };
        private static final com.google.protobuf.Internal.ListAdapter.Converter<java.lang.Integer, gatewayprotocol.v1.DiagnosticEventRequestOuterClass.DiagnosticEventType> blockedEvents_converter_ = new com.google.protobuf.Internal.ListAdapter.Converter<java.lang.Integer, gatewayprotocol.v1.DiagnosticEventRequestOuterClass.DiagnosticEventType>() { // from class: gatewayprotocol.v1.NativeConfigurationOuterClass.DiagnosticEventsConfiguration.2
            @Override // com.google.protobuf.Internal.ListAdapter.Converter
            public gatewayprotocol.v1.DiagnosticEventRequestOuterClass.DiagnosticEventType convert(java.lang.Integer num) {
                gatewayprotocol.v1.DiagnosticEventRequestOuterClass.DiagnosticEventType forNumber = gatewayprotocol.v1.DiagnosticEventRequestOuterClass.DiagnosticEventType.forNumber(num.intValue());
                return forNumber == null ? gatewayprotocol.v1.DiagnosticEventRequestOuterClass.DiagnosticEventType.UNRECOGNIZED : forNumber;
            }
        };
        private int allowedEventsMemoizedSerializedSize;
        private int blockedEventsMemoizedSerializedSize;
        private boolean enabled_;
        private int maxBatchIntervalMs_;
        private int maxBatchSize_;
        private int severity_;
        private boolean ttmEnabled_;
        private com.google.protobuf.Internal.IntList allowedEvents_ = emptyIntList();
        private com.google.protobuf.Internal.IntList blockedEvents_ = emptyIntList();

        private DiagnosticEventsConfiguration() {
        }

        @Override // gatewayprotocol.v1.NativeConfigurationOuterClass.DiagnosticEventsConfigurationOrBuilder
        public boolean getEnabled() {
            return this.enabled_;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setEnabled(boolean z) {
            this.enabled_ = z;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearEnabled() {
            this.enabled_ = false;
        }

        @Override // gatewayprotocol.v1.NativeConfigurationOuterClass.DiagnosticEventsConfigurationOrBuilder
        public int getMaxBatchSize() {
            return this.maxBatchSize_;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setMaxBatchSize(int i) {
            this.maxBatchSize_ = i;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearMaxBatchSize() {
            this.maxBatchSize_ = 0;
        }

        @Override // gatewayprotocol.v1.NativeConfigurationOuterClass.DiagnosticEventsConfigurationOrBuilder
        public int getMaxBatchIntervalMs() {
            return this.maxBatchIntervalMs_;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setMaxBatchIntervalMs(int i) {
            this.maxBatchIntervalMs_ = i;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearMaxBatchIntervalMs() {
            this.maxBatchIntervalMs_ = 0;
        }

        @Override // gatewayprotocol.v1.NativeConfigurationOuterClass.DiagnosticEventsConfigurationOrBuilder
        public boolean getTtmEnabled() {
            return this.ttmEnabled_;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setTtmEnabled(boolean z) {
            this.ttmEnabled_ = z;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearTtmEnabled() {
            this.ttmEnabled_ = false;
        }

        @Override // gatewayprotocol.v1.NativeConfigurationOuterClass.DiagnosticEventsConfigurationOrBuilder
        public int getSeverityValue() {
            return this.severity_;
        }

        @Override // gatewayprotocol.v1.NativeConfigurationOuterClass.DiagnosticEventsConfigurationOrBuilder
        public gatewayprotocol.v1.DiagnosticEventRequestOuterClass.DiagnosticEventsSeverity getSeverity() {
            gatewayprotocol.v1.DiagnosticEventRequestOuterClass.DiagnosticEventsSeverity forNumber = gatewayprotocol.v1.DiagnosticEventRequestOuterClass.DiagnosticEventsSeverity.forNumber(this.severity_);
            return forNumber == null ? gatewayprotocol.v1.DiagnosticEventRequestOuterClass.DiagnosticEventsSeverity.UNRECOGNIZED : forNumber;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setSeverityValue(int i) {
            this.severity_ = i;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setSeverity(gatewayprotocol.v1.DiagnosticEventRequestOuterClass.DiagnosticEventsSeverity diagnosticEventsSeverity) {
            this.severity_ = diagnosticEventsSeverity.getNumber();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearSeverity() {
            this.severity_ = 0;
        }

        static {
            gatewayprotocol.v1.NativeConfigurationOuterClass.DiagnosticEventsConfiguration diagnosticEventsConfiguration = new gatewayprotocol.v1.NativeConfigurationOuterClass.DiagnosticEventsConfiguration();
            DEFAULT_INSTANCE = diagnosticEventsConfiguration;
            com.google.protobuf.GeneratedMessageLite.registerDefaultInstance(gatewayprotocol.v1.NativeConfigurationOuterClass.DiagnosticEventsConfiguration.class, diagnosticEventsConfiguration);
        }

        @Override // gatewayprotocol.v1.NativeConfigurationOuterClass.DiagnosticEventsConfigurationOrBuilder
        public java.util.List<gatewayprotocol.v1.DiagnosticEventRequestOuterClass.DiagnosticEventType> getAllowedEventsList() {
            return new com.google.protobuf.Internal.ListAdapter(this.allowedEvents_, allowedEvents_converter_);
        }

        @Override // gatewayprotocol.v1.NativeConfigurationOuterClass.DiagnosticEventsConfigurationOrBuilder
        public int getAllowedEventsCount() {
            return this.allowedEvents_.size();
        }

        @Override // gatewayprotocol.v1.NativeConfigurationOuterClass.DiagnosticEventsConfigurationOrBuilder
        public gatewayprotocol.v1.DiagnosticEventRequestOuterClass.DiagnosticEventType getAllowedEvents(int i) {
            gatewayprotocol.v1.DiagnosticEventRequestOuterClass.DiagnosticEventType forNumber = gatewayprotocol.v1.DiagnosticEventRequestOuterClass.DiagnosticEventType.forNumber(this.allowedEvents_.getInt(i));
            return forNumber == null ? gatewayprotocol.v1.DiagnosticEventRequestOuterClass.DiagnosticEventType.UNRECOGNIZED : forNumber;
        }

        @Override // gatewayprotocol.v1.NativeConfigurationOuterClass.DiagnosticEventsConfigurationOrBuilder
        public java.util.List<java.lang.Integer> getAllowedEventsValueList() {
            return this.allowedEvents_;
        }

        @Override // gatewayprotocol.v1.NativeConfigurationOuterClass.DiagnosticEventsConfigurationOrBuilder
        public int getAllowedEventsValue(int i) {
            return this.allowedEvents_.getInt(i);
        }

        private void ensureAllowedEventsIsMutable() {
            com.google.protobuf.Internal.IntList intList = this.allowedEvents_;
            if (intList.isModifiable()) {
                return;
            }
            this.allowedEvents_ = com.google.protobuf.GeneratedMessageLite.mutableCopy(intList);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setAllowedEvents(int i, gatewayprotocol.v1.DiagnosticEventRequestOuterClass.DiagnosticEventType diagnosticEventType) {
            diagnosticEventType.getClass();
            ensureAllowedEventsIsMutable();
            this.allowedEvents_.setInt(i, diagnosticEventType.getNumber());
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void addAllowedEvents(gatewayprotocol.v1.DiagnosticEventRequestOuterClass.DiagnosticEventType diagnosticEventType) {
            diagnosticEventType.getClass();
            ensureAllowedEventsIsMutable();
            this.allowedEvents_.addInt(diagnosticEventType.getNumber());
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void addAllAllowedEvents(java.lang.Iterable<? extends gatewayprotocol.v1.DiagnosticEventRequestOuterClass.DiagnosticEventType> iterable) {
            ensureAllowedEventsIsMutable();
            java.util.Iterator<? extends gatewayprotocol.v1.DiagnosticEventRequestOuterClass.DiagnosticEventType> it = iterable.iterator();
            while (it.hasNext()) {
                this.allowedEvents_.addInt(it.next().getNumber());
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearAllowedEvents() {
            this.allowedEvents_ = emptyIntList();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setAllowedEventsValue(int i, int i2) {
            ensureAllowedEventsIsMutable();
            this.allowedEvents_.setInt(i, i2);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void addAllowedEventsValue(int i) {
            ensureAllowedEventsIsMutable();
            this.allowedEvents_.addInt(i);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void addAllAllowedEventsValue(java.lang.Iterable<java.lang.Integer> iterable) {
            ensureAllowedEventsIsMutable();
            java.util.Iterator<java.lang.Integer> it = iterable.iterator();
            while (it.hasNext()) {
                this.allowedEvents_.addInt(it.next().intValue());
            }
        }

        @Override // gatewayprotocol.v1.NativeConfigurationOuterClass.DiagnosticEventsConfigurationOrBuilder
        public java.util.List<gatewayprotocol.v1.DiagnosticEventRequestOuterClass.DiagnosticEventType> getBlockedEventsList() {
            return new com.google.protobuf.Internal.ListAdapter(this.blockedEvents_, blockedEvents_converter_);
        }

        @Override // gatewayprotocol.v1.NativeConfigurationOuterClass.DiagnosticEventsConfigurationOrBuilder
        public int getBlockedEventsCount() {
            return this.blockedEvents_.size();
        }

        @Override // gatewayprotocol.v1.NativeConfigurationOuterClass.DiagnosticEventsConfigurationOrBuilder
        public gatewayprotocol.v1.DiagnosticEventRequestOuterClass.DiagnosticEventType getBlockedEvents(int i) {
            gatewayprotocol.v1.DiagnosticEventRequestOuterClass.DiagnosticEventType forNumber = gatewayprotocol.v1.DiagnosticEventRequestOuterClass.DiagnosticEventType.forNumber(this.blockedEvents_.getInt(i));
            return forNumber == null ? gatewayprotocol.v1.DiagnosticEventRequestOuterClass.DiagnosticEventType.UNRECOGNIZED : forNumber;
        }

        @Override // gatewayprotocol.v1.NativeConfigurationOuterClass.DiagnosticEventsConfigurationOrBuilder
        public java.util.List<java.lang.Integer> getBlockedEventsValueList() {
            return this.blockedEvents_;
        }

        @Override // gatewayprotocol.v1.NativeConfigurationOuterClass.DiagnosticEventsConfigurationOrBuilder
        public int getBlockedEventsValue(int i) {
            return this.blockedEvents_.getInt(i);
        }

        private void ensureBlockedEventsIsMutable() {
            com.google.protobuf.Internal.IntList intList = this.blockedEvents_;
            if (intList.isModifiable()) {
                return;
            }
            this.blockedEvents_ = com.google.protobuf.GeneratedMessageLite.mutableCopy(intList);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setBlockedEvents(int i, gatewayprotocol.v1.DiagnosticEventRequestOuterClass.DiagnosticEventType diagnosticEventType) {
            diagnosticEventType.getClass();
            ensureBlockedEventsIsMutable();
            this.blockedEvents_.setInt(i, diagnosticEventType.getNumber());
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void addBlockedEvents(gatewayprotocol.v1.DiagnosticEventRequestOuterClass.DiagnosticEventType diagnosticEventType) {
            diagnosticEventType.getClass();
            ensureBlockedEventsIsMutable();
            this.blockedEvents_.addInt(diagnosticEventType.getNumber());
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void addAllBlockedEvents(java.lang.Iterable<? extends gatewayprotocol.v1.DiagnosticEventRequestOuterClass.DiagnosticEventType> iterable) {
            ensureBlockedEventsIsMutable();
            java.util.Iterator<? extends gatewayprotocol.v1.DiagnosticEventRequestOuterClass.DiagnosticEventType> it = iterable.iterator();
            while (it.hasNext()) {
                this.blockedEvents_.addInt(it.next().getNumber());
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearBlockedEvents() {
            this.blockedEvents_ = emptyIntList();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setBlockedEventsValue(int i, int i2) {
            ensureBlockedEventsIsMutable();
            this.blockedEvents_.setInt(i, i2);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void addBlockedEventsValue(int i) {
            ensureBlockedEventsIsMutable();
            this.blockedEvents_.addInt(i);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void addAllBlockedEventsValue(java.lang.Iterable<java.lang.Integer> iterable) {
            ensureBlockedEventsIsMutable();
            java.util.Iterator<java.lang.Integer> it = iterable.iterator();
            while (it.hasNext()) {
                this.blockedEvents_.addInt(it.next().intValue());
            }
        }

        public static gatewayprotocol.v1.NativeConfigurationOuterClass.DiagnosticEventsConfiguration parseFrom(java.nio.ByteBuffer byteBuffer) throws com.google.protobuf.InvalidProtocolBufferException {
            return (gatewayprotocol.v1.NativeConfigurationOuterClass.DiagnosticEventsConfiguration) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
        }

        public static gatewayprotocol.v1.NativeConfigurationOuterClass.DiagnosticEventsConfiguration parseFrom(java.nio.ByteBuffer byteBuffer, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) throws com.google.protobuf.InvalidProtocolBufferException {
            return (gatewayprotocol.v1.NativeConfigurationOuterClass.DiagnosticEventsConfiguration) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
        }

        public static gatewayprotocol.v1.NativeConfigurationOuterClass.DiagnosticEventsConfiguration parseFrom(com.google.protobuf.ByteString byteString) throws com.google.protobuf.InvalidProtocolBufferException {
            return (gatewayprotocol.v1.NativeConfigurationOuterClass.DiagnosticEventsConfiguration) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
        }

        public static gatewayprotocol.v1.NativeConfigurationOuterClass.DiagnosticEventsConfiguration parseFrom(com.google.protobuf.ByteString byteString, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) throws com.google.protobuf.InvalidProtocolBufferException {
            return (gatewayprotocol.v1.NativeConfigurationOuterClass.DiagnosticEventsConfiguration) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
        }

        public static gatewayprotocol.v1.NativeConfigurationOuterClass.DiagnosticEventsConfiguration parseFrom(byte[] bArr) throws com.google.protobuf.InvalidProtocolBufferException {
            return (gatewayprotocol.v1.NativeConfigurationOuterClass.DiagnosticEventsConfiguration) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
        }

        public static gatewayprotocol.v1.NativeConfigurationOuterClass.DiagnosticEventsConfiguration parseFrom(byte[] bArr, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) throws com.google.protobuf.InvalidProtocolBufferException {
            return (gatewayprotocol.v1.NativeConfigurationOuterClass.DiagnosticEventsConfiguration) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
        }

        public static gatewayprotocol.v1.NativeConfigurationOuterClass.DiagnosticEventsConfiguration parseFrom(java.io.InputStream inputStream) throws java.io.IOException {
            return (gatewayprotocol.v1.NativeConfigurationOuterClass.DiagnosticEventsConfiguration) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static gatewayprotocol.v1.NativeConfigurationOuterClass.DiagnosticEventsConfiguration parseFrom(java.io.InputStream inputStream, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) throws java.io.IOException {
            return (gatewayprotocol.v1.NativeConfigurationOuterClass.DiagnosticEventsConfiguration) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
        }

        public static gatewayprotocol.v1.NativeConfigurationOuterClass.DiagnosticEventsConfiguration parseDelimitedFrom(java.io.InputStream inputStream) throws java.io.IOException {
            return (gatewayprotocol.v1.NativeConfigurationOuterClass.DiagnosticEventsConfiguration) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static gatewayprotocol.v1.NativeConfigurationOuterClass.DiagnosticEventsConfiguration parseDelimitedFrom(java.io.InputStream inputStream, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) throws java.io.IOException {
            return (gatewayprotocol.v1.NativeConfigurationOuterClass.DiagnosticEventsConfiguration) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
        }

        public static gatewayprotocol.v1.NativeConfigurationOuterClass.DiagnosticEventsConfiguration parseFrom(com.google.protobuf.CodedInputStream codedInputStream) throws java.io.IOException {
            return (gatewayprotocol.v1.NativeConfigurationOuterClass.DiagnosticEventsConfiguration) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
        }

        public static gatewayprotocol.v1.NativeConfigurationOuterClass.DiagnosticEventsConfiguration parseFrom(com.google.protobuf.CodedInputStream codedInputStream, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) throws java.io.IOException {
            return (gatewayprotocol.v1.NativeConfigurationOuterClass.DiagnosticEventsConfiguration) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
        }

        public static gatewayprotocol.v1.NativeConfigurationOuterClass.DiagnosticEventsConfiguration.Builder newBuilder() {
            return DEFAULT_INSTANCE.createBuilder();
        }

        public static gatewayprotocol.v1.NativeConfigurationOuterClass.DiagnosticEventsConfiguration.Builder newBuilder(gatewayprotocol.v1.NativeConfigurationOuterClass.DiagnosticEventsConfiguration diagnosticEventsConfiguration) {
            return DEFAULT_INSTANCE.createBuilder(diagnosticEventsConfiguration);
        }

        public static final class Builder extends com.google.protobuf.GeneratedMessageLite.Builder<gatewayprotocol.v1.NativeConfigurationOuterClass.DiagnosticEventsConfiguration, gatewayprotocol.v1.NativeConfigurationOuterClass.DiagnosticEventsConfiguration.Builder> implements gatewayprotocol.v1.NativeConfigurationOuterClass.DiagnosticEventsConfigurationOrBuilder {
            /* synthetic */ Builder(gatewayprotocol.v1.NativeConfigurationOuterClass.AnonymousClass1 anonymousClass1) {
                this();
            }

            private Builder() {
                super(gatewayprotocol.v1.NativeConfigurationOuterClass.DiagnosticEventsConfiguration.DEFAULT_INSTANCE);
            }

            @Override // gatewayprotocol.v1.NativeConfigurationOuterClass.DiagnosticEventsConfigurationOrBuilder
            public boolean getEnabled() {
                return ((gatewayprotocol.v1.NativeConfigurationOuterClass.DiagnosticEventsConfiguration) this.instance).getEnabled();
            }

            public gatewayprotocol.v1.NativeConfigurationOuterClass.DiagnosticEventsConfiguration.Builder setEnabled(boolean z) {
                copyOnWrite();
                ((gatewayprotocol.v1.NativeConfigurationOuterClass.DiagnosticEventsConfiguration) this.instance).setEnabled(z);
                return this;
            }

            public gatewayprotocol.v1.NativeConfigurationOuterClass.DiagnosticEventsConfiguration.Builder clearEnabled() {
                copyOnWrite();
                ((gatewayprotocol.v1.NativeConfigurationOuterClass.DiagnosticEventsConfiguration) this.instance).clearEnabled();
                return this;
            }

            @Override // gatewayprotocol.v1.NativeConfigurationOuterClass.DiagnosticEventsConfigurationOrBuilder
            public int getMaxBatchSize() {
                return ((gatewayprotocol.v1.NativeConfigurationOuterClass.DiagnosticEventsConfiguration) this.instance).getMaxBatchSize();
            }

            public gatewayprotocol.v1.NativeConfigurationOuterClass.DiagnosticEventsConfiguration.Builder setMaxBatchSize(int i) {
                copyOnWrite();
                ((gatewayprotocol.v1.NativeConfigurationOuterClass.DiagnosticEventsConfiguration) this.instance).setMaxBatchSize(i);
                return this;
            }

            public gatewayprotocol.v1.NativeConfigurationOuterClass.DiagnosticEventsConfiguration.Builder clearMaxBatchSize() {
                copyOnWrite();
                ((gatewayprotocol.v1.NativeConfigurationOuterClass.DiagnosticEventsConfiguration) this.instance).clearMaxBatchSize();
                return this;
            }

            @Override // gatewayprotocol.v1.NativeConfigurationOuterClass.DiagnosticEventsConfigurationOrBuilder
            public int getMaxBatchIntervalMs() {
                return ((gatewayprotocol.v1.NativeConfigurationOuterClass.DiagnosticEventsConfiguration) this.instance).getMaxBatchIntervalMs();
            }

            public gatewayprotocol.v1.NativeConfigurationOuterClass.DiagnosticEventsConfiguration.Builder setMaxBatchIntervalMs(int i) {
                copyOnWrite();
                ((gatewayprotocol.v1.NativeConfigurationOuterClass.DiagnosticEventsConfiguration) this.instance).setMaxBatchIntervalMs(i);
                return this;
            }

            public gatewayprotocol.v1.NativeConfigurationOuterClass.DiagnosticEventsConfiguration.Builder clearMaxBatchIntervalMs() {
                copyOnWrite();
                ((gatewayprotocol.v1.NativeConfigurationOuterClass.DiagnosticEventsConfiguration) this.instance).clearMaxBatchIntervalMs();
                return this;
            }

            @Override // gatewayprotocol.v1.NativeConfigurationOuterClass.DiagnosticEventsConfigurationOrBuilder
            public boolean getTtmEnabled() {
                return ((gatewayprotocol.v1.NativeConfigurationOuterClass.DiagnosticEventsConfiguration) this.instance).getTtmEnabled();
            }

            public gatewayprotocol.v1.NativeConfigurationOuterClass.DiagnosticEventsConfiguration.Builder setTtmEnabled(boolean z) {
                copyOnWrite();
                ((gatewayprotocol.v1.NativeConfigurationOuterClass.DiagnosticEventsConfiguration) this.instance).setTtmEnabled(z);
                return this;
            }

            public gatewayprotocol.v1.NativeConfigurationOuterClass.DiagnosticEventsConfiguration.Builder clearTtmEnabled() {
                copyOnWrite();
                ((gatewayprotocol.v1.NativeConfigurationOuterClass.DiagnosticEventsConfiguration) this.instance).clearTtmEnabled();
                return this;
            }

            @Override // gatewayprotocol.v1.NativeConfigurationOuterClass.DiagnosticEventsConfigurationOrBuilder
            public int getSeverityValue() {
                return ((gatewayprotocol.v1.NativeConfigurationOuterClass.DiagnosticEventsConfiguration) this.instance).getSeverityValue();
            }

            public gatewayprotocol.v1.NativeConfigurationOuterClass.DiagnosticEventsConfiguration.Builder setSeverityValue(int i) {
                copyOnWrite();
                ((gatewayprotocol.v1.NativeConfigurationOuterClass.DiagnosticEventsConfiguration) this.instance).setSeverityValue(i);
                return this;
            }

            @Override // gatewayprotocol.v1.NativeConfigurationOuterClass.DiagnosticEventsConfigurationOrBuilder
            public gatewayprotocol.v1.DiagnosticEventRequestOuterClass.DiagnosticEventsSeverity getSeverity() {
                return ((gatewayprotocol.v1.NativeConfigurationOuterClass.DiagnosticEventsConfiguration) this.instance).getSeverity();
            }

            public gatewayprotocol.v1.NativeConfigurationOuterClass.DiagnosticEventsConfiguration.Builder setSeverity(gatewayprotocol.v1.DiagnosticEventRequestOuterClass.DiagnosticEventsSeverity diagnosticEventsSeverity) {
                copyOnWrite();
                ((gatewayprotocol.v1.NativeConfigurationOuterClass.DiagnosticEventsConfiguration) this.instance).setSeverity(diagnosticEventsSeverity);
                return this;
            }

            public gatewayprotocol.v1.NativeConfigurationOuterClass.DiagnosticEventsConfiguration.Builder clearSeverity() {
                copyOnWrite();
                ((gatewayprotocol.v1.NativeConfigurationOuterClass.DiagnosticEventsConfiguration) this.instance).clearSeverity();
                return this;
            }

            @Override // gatewayprotocol.v1.NativeConfigurationOuterClass.DiagnosticEventsConfigurationOrBuilder
            public java.util.List<gatewayprotocol.v1.DiagnosticEventRequestOuterClass.DiagnosticEventType> getAllowedEventsList() {
                return ((gatewayprotocol.v1.NativeConfigurationOuterClass.DiagnosticEventsConfiguration) this.instance).getAllowedEventsList();
            }

            @Override // gatewayprotocol.v1.NativeConfigurationOuterClass.DiagnosticEventsConfigurationOrBuilder
            public int getAllowedEventsCount() {
                return ((gatewayprotocol.v1.NativeConfigurationOuterClass.DiagnosticEventsConfiguration) this.instance).getAllowedEventsCount();
            }

            @Override // gatewayprotocol.v1.NativeConfigurationOuterClass.DiagnosticEventsConfigurationOrBuilder
            public gatewayprotocol.v1.DiagnosticEventRequestOuterClass.DiagnosticEventType getAllowedEvents(int i) {
                return ((gatewayprotocol.v1.NativeConfigurationOuterClass.DiagnosticEventsConfiguration) this.instance).getAllowedEvents(i);
            }

            public gatewayprotocol.v1.NativeConfigurationOuterClass.DiagnosticEventsConfiguration.Builder setAllowedEvents(int i, gatewayprotocol.v1.DiagnosticEventRequestOuterClass.DiagnosticEventType diagnosticEventType) {
                copyOnWrite();
                ((gatewayprotocol.v1.NativeConfigurationOuterClass.DiagnosticEventsConfiguration) this.instance).setAllowedEvents(i, diagnosticEventType);
                return this;
            }

            public gatewayprotocol.v1.NativeConfigurationOuterClass.DiagnosticEventsConfiguration.Builder addAllowedEvents(gatewayprotocol.v1.DiagnosticEventRequestOuterClass.DiagnosticEventType diagnosticEventType) {
                copyOnWrite();
                ((gatewayprotocol.v1.NativeConfigurationOuterClass.DiagnosticEventsConfiguration) this.instance).addAllowedEvents(diagnosticEventType);
                return this;
            }

            public gatewayprotocol.v1.NativeConfigurationOuterClass.DiagnosticEventsConfiguration.Builder addAllAllowedEvents(java.lang.Iterable<? extends gatewayprotocol.v1.DiagnosticEventRequestOuterClass.DiagnosticEventType> iterable) {
                copyOnWrite();
                ((gatewayprotocol.v1.NativeConfigurationOuterClass.DiagnosticEventsConfiguration) this.instance).addAllAllowedEvents(iterable);
                return this;
            }

            public gatewayprotocol.v1.NativeConfigurationOuterClass.DiagnosticEventsConfiguration.Builder clearAllowedEvents() {
                copyOnWrite();
                ((gatewayprotocol.v1.NativeConfigurationOuterClass.DiagnosticEventsConfiguration) this.instance).clearAllowedEvents();
                return this;
            }

            @Override // gatewayprotocol.v1.NativeConfigurationOuterClass.DiagnosticEventsConfigurationOrBuilder
            public java.util.List<java.lang.Integer> getAllowedEventsValueList() {
                return java.util.Collections.unmodifiableList(((gatewayprotocol.v1.NativeConfigurationOuterClass.DiagnosticEventsConfiguration) this.instance).getAllowedEventsValueList());
            }

            @Override // gatewayprotocol.v1.NativeConfigurationOuterClass.DiagnosticEventsConfigurationOrBuilder
            public int getAllowedEventsValue(int i) {
                return ((gatewayprotocol.v1.NativeConfigurationOuterClass.DiagnosticEventsConfiguration) this.instance).getAllowedEventsValue(i);
            }

            public gatewayprotocol.v1.NativeConfigurationOuterClass.DiagnosticEventsConfiguration.Builder setAllowedEventsValue(int i, int i2) {
                copyOnWrite();
                ((gatewayprotocol.v1.NativeConfigurationOuterClass.DiagnosticEventsConfiguration) this.instance).setAllowedEventsValue(i, i2);
                return this;
            }

            public gatewayprotocol.v1.NativeConfigurationOuterClass.DiagnosticEventsConfiguration.Builder addAllowedEventsValue(int i) {
                copyOnWrite();
                ((gatewayprotocol.v1.NativeConfigurationOuterClass.DiagnosticEventsConfiguration) this.instance).addAllowedEventsValue(i);
                return this;
            }

            public gatewayprotocol.v1.NativeConfigurationOuterClass.DiagnosticEventsConfiguration.Builder addAllAllowedEventsValue(java.lang.Iterable<java.lang.Integer> iterable) {
                copyOnWrite();
                ((gatewayprotocol.v1.NativeConfigurationOuterClass.DiagnosticEventsConfiguration) this.instance).addAllAllowedEventsValue(iterable);
                return this;
            }

            @Override // gatewayprotocol.v1.NativeConfigurationOuterClass.DiagnosticEventsConfigurationOrBuilder
            public java.util.List<gatewayprotocol.v1.DiagnosticEventRequestOuterClass.DiagnosticEventType> getBlockedEventsList() {
                return ((gatewayprotocol.v1.NativeConfigurationOuterClass.DiagnosticEventsConfiguration) this.instance).getBlockedEventsList();
            }

            @Override // gatewayprotocol.v1.NativeConfigurationOuterClass.DiagnosticEventsConfigurationOrBuilder
            public int getBlockedEventsCount() {
                return ((gatewayprotocol.v1.NativeConfigurationOuterClass.DiagnosticEventsConfiguration) this.instance).getBlockedEventsCount();
            }

            @Override // gatewayprotocol.v1.NativeConfigurationOuterClass.DiagnosticEventsConfigurationOrBuilder
            public gatewayprotocol.v1.DiagnosticEventRequestOuterClass.DiagnosticEventType getBlockedEvents(int i) {
                return ((gatewayprotocol.v1.NativeConfigurationOuterClass.DiagnosticEventsConfiguration) this.instance).getBlockedEvents(i);
            }

            public gatewayprotocol.v1.NativeConfigurationOuterClass.DiagnosticEventsConfiguration.Builder setBlockedEvents(int i, gatewayprotocol.v1.DiagnosticEventRequestOuterClass.DiagnosticEventType diagnosticEventType) {
                copyOnWrite();
                ((gatewayprotocol.v1.NativeConfigurationOuterClass.DiagnosticEventsConfiguration) this.instance).setBlockedEvents(i, diagnosticEventType);
                return this;
            }

            public gatewayprotocol.v1.NativeConfigurationOuterClass.DiagnosticEventsConfiguration.Builder addBlockedEvents(gatewayprotocol.v1.DiagnosticEventRequestOuterClass.DiagnosticEventType diagnosticEventType) {
                copyOnWrite();
                ((gatewayprotocol.v1.NativeConfigurationOuterClass.DiagnosticEventsConfiguration) this.instance).addBlockedEvents(diagnosticEventType);
                return this;
            }

            public gatewayprotocol.v1.NativeConfigurationOuterClass.DiagnosticEventsConfiguration.Builder addAllBlockedEvents(java.lang.Iterable<? extends gatewayprotocol.v1.DiagnosticEventRequestOuterClass.DiagnosticEventType> iterable) {
                copyOnWrite();
                ((gatewayprotocol.v1.NativeConfigurationOuterClass.DiagnosticEventsConfiguration) this.instance).addAllBlockedEvents(iterable);
                return this;
            }

            public gatewayprotocol.v1.NativeConfigurationOuterClass.DiagnosticEventsConfiguration.Builder clearBlockedEvents() {
                copyOnWrite();
                ((gatewayprotocol.v1.NativeConfigurationOuterClass.DiagnosticEventsConfiguration) this.instance).clearBlockedEvents();
                return this;
            }

            @Override // gatewayprotocol.v1.NativeConfigurationOuterClass.DiagnosticEventsConfigurationOrBuilder
            public java.util.List<java.lang.Integer> getBlockedEventsValueList() {
                return java.util.Collections.unmodifiableList(((gatewayprotocol.v1.NativeConfigurationOuterClass.DiagnosticEventsConfiguration) this.instance).getBlockedEventsValueList());
            }

            @Override // gatewayprotocol.v1.NativeConfigurationOuterClass.DiagnosticEventsConfigurationOrBuilder
            public int getBlockedEventsValue(int i) {
                return ((gatewayprotocol.v1.NativeConfigurationOuterClass.DiagnosticEventsConfiguration) this.instance).getBlockedEventsValue(i);
            }

            public gatewayprotocol.v1.NativeConfigurationOuterClass.DiagnosticEventsConfiguration.Builder setBlockedEventsValue(int i, int i2) {
                copyOnWrite();
                ((gatewayprotocol.v1.NativeConfigurationOuterClass.DiagnosticEventsConfiguration) this.instance).setBlockedEventsValue(i, i2);
                return this;
            }

            public gatewayprotocol.v1.NativeConfigurationOuterClass.DiagnosticEventsConfiguration.Builder addBlockedEventsValue(int i) {
                copyOnWrite();
                ((gatewayprotocol.v1.NativeConfigurationOuterClass.DiagnosticEventsConfiguration) this.instance).addBlockedEventsValue(i);
                return this;
            }

            public gatewayprotocol.v1.NativeConfigurationOuterClass.DiagnosticEventsConfiguration.Builder addAllBlockedEventsValue(java.lang.Iterable<java.lang.Integer> iterable) {
                copyOnWrite();
                ((gatewayprotocol.v1.NativeConfigurationOuterClass.DiagnosticEventsConfiguration) this.instance).addAllBlockedEventsValue(iterable);
                return this;
            }
        }

        @Override // com.google.protobuf.GeneratedMessageLite
        protected final java.lang.Object dynamicMethod(com.google.protobuf.GeneratedMessageLite.MethodToInvoke methodToInvoke, java.lang.Object obj, java.lang.Object obj2) {
            gatewayprotocol.v1.NativeConfigurationOuterClass.AnonymousClass1 anonymousClass1 = null;
            switch (gatewayprotocol.v1.NativeConfigurationOuterClass.AnonymousClass1.$SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke[methodToInvoke.ordinal()]) {
                case 1:
                    return new gatewayprotocol.v1.NativeConfigurationOuterClass.DiagnosticEventsConfiguration();
                case 2:
                    return new gatewayprotocol.v1.NativeConfigurationOuterClass.DiagnosticEventsConfiguration.Builder(anonymousClass1);
                case 3:
                    return newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0007\u0000\u0000\u0001\u0007\u0007\u0000\u0002\u0000\u0001\u0007\u0002\u0004\u0003\u0004\u0004\u0007\u0005\f\u0006,\u0007,", new java.lang.Object[]{"enabled_", "maxBatchSize_", "maxBatchIntervalMs_", "ttmEnabled_", "severity_", "allowedEvents_", "blockedEvents_"});
                case 4:
                    return DEFAULT_INSTANCE;
                case 5:
                    com.google.protobuf.Parser<gatewayprotocol.v1.NativeConfigurationOuterClass.DiagnosticEventsConfiguration> parser = PARSER;
                    if (parser == null) {
                        synchronized (gatewayprotocol.v1.NativeConfigurationOuterClass.DiagnosticEventsConfiguration.class) {
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

        public static gatewayprotocol.v1.NativeConfigurationOuterClass.DiagnosticEventsConfiguration getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static com.google.protobuf.Parser<gatewayprotocol.v1.NativeConfigurationOuterClass.DiagnosticEventsConfiguration> parser() {
            return DEFAULT_INSTANCE.getParserForType();
        }
    }

    public static final class AdOperationsConfiguration extends com.google.protobuf.GeneratedMessageLite<gatewayprotocol.v1.NativeConfigurationOuterClass.AdOperationsConfiguration, gatewayprotocol.v1.NativeConfigurationOuterClass.AdOperationsConfiguration.Builder> implements gatewayprotocol.v1.NativeConfigurationOuterClass.AdOperationsConfigurationOrBuilder {
        private static final gatewayprotocol.v1.NativeConfigurationOuterClass.AdOperationsConfiguration DEFAULT_INSTANCE;
        public static final int GET_TOKEN_TIMEOUT_MS_FIELD_NUMBER = 3;
        public static final int LOAD_TIMEOUT_MS_FIELD_NUMBER = 1;
        private static volatile com.google.protobuf.Parser<gatewayprotocol.v1.NativeConfigurationOuterClass.AdOperationsConfiguration> PARSER = null;
        public static final int SHOW_TIMEOUT_MS_FIELD_NUMBER = 2;
        private int getTokenTimeoutMs_;
        private int loadTimeoutMs_;
        private int showTimeoutMs_;

        private AdOperationsConfiguration() {
        }

        @Override // gatewayprotocol.v1.NativeConfigurationOuterClass.AdOperationsConfigurationOrBuilder
        public int getLoadTimeoutMs() {
            return this.loadTimeoutMs_;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setLoadTimeoutMs(int i) {
            this.loadTimeoutMs_ = i;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearLoadTimeoutMs() {
            this.loadTimeoutMs_ = 0;
        }

        @Override // gatewayprotocol.v1.NativeConfigurationOuterClass.AdOperationsConfigurationOrBuilder
        public int getShowTimeoutMs() {
            return this.showTimeoutMs_;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setShowTimeoutMs(int i) {
            this.showTimeoutMs_ = i;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearShowTimeoutMs() {
            this.showTimeoutMs_ = 0;
        }

        @Override // gatewayprotocol.v1.NativeConfigurationOuterClass.AdOperationsConfigurationOrBuilder
        public int getGetTokenTimeoutMs() {
            return this.getTokenTimeoutMs_;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setGetTokenTimeoutMs(int i) {
            this.getTokenTimeoutMs_ = i;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearGetTokenTimeoutMs() {
            this.getTokenTimeoutMs_ = 0;
        }

        public static gatewayprotocol.v1.NativeConfigurationOuterClass.AdOperationsConfiguration parseFrom(java.nio.ByteBuffer byteBuffer) throws com.google.protobuf.InvalidProtocolBufferException {
            return (gatewayprotocol.v1.NativeConfigurationOuterClass.AdOperationsConfiguration) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
        }

        public static gatewayprotocol.v1.NativeConfigurationOuterClass.AdOperationsConfiguration parseFrom(java.nio.ByteBuffer byteBuffer, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) throws com.google.protobuf.InvalidProtocolBufferException {
            return (gatewayprotocol.v1.NativeConfigurationOuterClass.AdOperationsConfiguration) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
        }

        public static gatewayprotocol.v1.NativeConfigurationOuterClass.AdOperationsConfiguration parseFrom(com.google.protobuf.ByteString byteString) throws com.google.protobuf.InvalidProtocolBufferException {
            return (gatewayprotocol.v1.NativeConfigurationOuterClass.AdOperationsConfiguration) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
        }

        public static gatewayprotocol.v1.NativeConfigurationOuterClass.AdOperationsConfiguration parseFrom(com.google.protobuf.ByteString byteString, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) throws com.google.protobuf.InvalidProtocolBufferException {
            return (gatewayprotocol.v1.NativeConfigurationOuterClass.AdOperationsConfiguration) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
        }

        public static gatewayprotocol.v1.NativeConfigurationOuterClass.AdOperationsConfiguration parseFrom(byte[] bArr) throws com.google.protobuf.InvalidProtocolBufferException {
            return (gatewayprotocol.v1.NativeConfigurationOuterClass.AdOperationsConfiguration) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
        }

        public static gatewayprotocol.v1.NativeConfigurationOuterClass.AdOperationsConfiguration parseFrom(byte[] bArr, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) throws com.google.protobuf.InvalidProtocolBufferException {
            return (gatewayprotocol.v1.NativeConfigurationOuterClass.AdOperationsConfiguration) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
        }

        public static gatewayprotocol.v1.NativeConfigurationOuterClass.AdOperationsConfiguration parseFrom(java.io.InputStream inputStream) throws java.io.IOException {
            return (gatewayprotocol.v1.NativeConfigurationOuterClass.AdOperationsConfiguration) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static gatewayprotocol.v1.NativeConfigurationOuterClass.AdOperationsConfiguration parseFrom(java.io.InputStream inputStream, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) throws java.io.IOException {
            return (gatewayprotocol.v1.NativeConfigurationOuterClass.AdOperationsConfiguration) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
        }

        public static gatewayprotocol.v1.NativeConfigurationOuterClass.AdOperationsConfiguration parseDelimitedFrom(java.io.InputStream inputStream) throws java.io.IOException {
            return (gatewayprotocol.v1.NativeConfigurationOuterClass.AdOperationsConfiguration) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static gatewayprotocol.v1.NativeConfigurationOuterClass.AdOperationsConfiguration parseDelimitedFrom(java.io.InputStream inputStream, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) throws java.io.IOException {
            return (gatewayprotocol.v1.NativeConfigurationOuterClass.AdOperationsConfiguration) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
        }

        public static gatewayprotocol.v1.NativeConfigurationOuterClass.AdOperationsConfiguration parseFrom(com.google.protobuf.CodedInputStream codedInputStream) throws java.io.IOException {
            return (gatewayprotocol.v1.NativeConfigurationOuterClass.AdOperationsConfiguration) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
        }

        public static gatewayprotocol.v1.NativeConfigurationOuterClass.AdOperationsConfiguration parseFrom(com.google.protobuf.CodedInputStream codedInputStream, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) throws java.io.IOException {
            return (gatewayprotocol.v1.NativeConfigurationOuterClass.AdOperationsConfiguration) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
        }

        public static gatewayprotocol.v1.NativeConfigurationOuterClass.AdOperationsConfiguration.Builder newBuilder() {
            return DEFAULT_INSTANCE.createBuilder();
        }

        public static gatewayprotocol.v1.NativeConfigurationOuterClass.AdOperationsConfiguration.Builder newBuilder(gatewayprotocol.v1.NativeConfigurationOuterClass.AdOperationsConfiguration adOperationsConfiguration) {
            return DEFAULT_INSTANCE.createBuilder(adOperationsConfiguration);
        }

        public static final class Builder extends com.google.protobuf.GeneratedMessageLite.Builder<gatewayprotocol.v1.NativeConfigurationOuterClass.AdOperationsConfiguration, gatewayprotocol.v1.NativeConfigurationOuterClass.AdOperationsConfiguration.Builder> implements gatewayprotocol.v1.NativeConfigurationOuterClass.AdOperationsConfigurationOrBuilder {
            /* synthetic */ Builder(gatewayprotocol.v1.NativeConfigurationOuterClass.AnonymousClass1 anonymousClass1) {
                this();
            }

            private Builder() {
                super(gatewayprotocol.v1.NativeConfigurationOuterClass.AdOperationsConfiguration.DEFAULT_INSTANCE);
            }

            @Override // gatewayprotocol.v1.NativeConfigurationOuterClass.AdOperationsConfigurationOrBuilder
            public int getLoadTimeoutMs() {
                return ((gatewayprotocol.v1.NativeConfigurationOuterClass.AdOperationsConfiguration) this.instance).getLoadTimeoutMs();
            }

            public gatewayprotocol.v1.NativeConfigurationOuterClass.AdOperationsConfiguration.Builder setLoadTimeoutMs(int i) {
                copyOnWrite();
                ((gatewayprotocol.v1.NativeConfigurationOuterClass.AdOperationsConfiguration) this.instance).setLoadTimeoutMs(i);
                return this;
            }

            public gatewayprotocol.v1.NativeConfigurationOuterClass.AdOperationsConfiguration.Builder clearLoadTimeoutMs() {
                copyOnWrite();
                ((gatewayprotocol.v1.NativeConfigurationOuterClass.AdOperationsConfiguration) this.instance).clearLoadTimeoutMs();
                return this;
            }

            @Override // gatewayprotocol.v1.NativeConfigurationOuterClass.AdOperationsConfigurationOrBuilder
            public int getShowTimeoutMs() {
                return ((gatewayprotocol.v1.NativeConfigurationOuterClass.AdOperationsConfiguration) this.instance).getShowTimeoutMs();
            }

            public gatewayprotocol.v1.NativeConfigurationOuterClass.AdOperationsConfiguration.Builder setShowTimeoutMs(int i) {
                copyOnWrite();
                ((gatewayprotocol.v1.NativeConfigurationOuterClass.AdOperationsConfiguration) this.instance).setShowTimeoutMs(i);
                return this;
            }

            public gatewayprotocol.v1.NativeConfigurationOuterClass.AdOperationsConfiguration.Builder clearShowTimeoutMs() {
                copyOnWrite();
                ((gatewayprotocol.v1.NativeConfigurationOuterClass.AdOperationsConfiguration) this.instance).clearShowTimeoutMs();
                return this;
            }

            @Override // gatewayprotocol.v1.NativeConfigurationOuterClass.AdOperationsConfigurationOrBuilder
            public int getGetTokenTimeoutMs() {
                return ((gatewayprotocol.v1.NativeConfigurationOuterClass.AdOperationsConfiguration) this.instance).getGetTokenTimeoutMs();
            }

            public gatewayprotocol.v1.NativeConfigurationOuterClass.AdOperationsConfiguration.Builder setGetTokenTimeoutMs(int i) {
                copyOnWrite();
                ((gatewayprotocol.v1.NativeConfigurationOuterClass.AdOperationsConfiguration) this.instance).setGetTokenTimeoutMs(i);
                return this;
            }

            public gatewayprotocol.v1.NativeConfigurationOuterClass.AdOperationsConfiguration.Builder clearGetTokenTimeoutMs() {
                copyOnWrite();
                ((gatewayprotocol.v1.NativeConfigurationOuterClass.AdOperationsConfiguration) this.instance).clearGetTokenTimeoutMs();
                return this;
            }
        }

        @Override // com.google.protobuf.GeneratedMessageLite
        protected final java.lang.Object dynamicMethod(com.google.protobuf.GeneratedMessageLite.MethodToInvoke methodToInvoke, java.lang.Object obj, java.lang.Object obj2) {
            gatewayprotocol.v1.NativeConfigurationOuterClass.AnonymousClass1 anonymousClass1 = null;
            switch (gatewayprotocol.v1.NativeConfigurationOuterClass.AnonymousClass1.$SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke[methodToInvoke.ordinal()]) {
                case 1:
                    return new gatewayprotocol.v1.NativeConfigurationOuterClass.AdOperationsConfiguration();
                case 2:
                    return new gatewayprotocol.v1.NativeConfigurationOuterClass.AdOperationsConfiguration.Builder(anonymousClass1);
                case 3:
                    return newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0000\u0000\u0001\u0004\u0002\u0004\u0003\u0004", new java.lang.Object[]{"loadTimeoutMs_", "showTimeoutMs_", "getTokenTimeoutMs_"});
                case 4:
                    return DEFAULT_INSTANCE;
                case 5:
                    com.google.protobuf.Parser<gatewayprotocol.v1.NativeConfigurationOuterClass.AdOperationsConfiguration> parser = PARSER;
                    if (parser == null) {
                        synchronized (gatewayprotocol.v1.NativeConfigurationOuterClass.AdOperationsConfiguration.class) {
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
            gatewayprotocol.v1.NativeConfigurationOuterClass.AdOperationsConfiguration adOperationsConfiguration = new gatewayprotocol.v1.NativeConfigurationOuterClass.AdOperationsConfiguration();
            DEFAULT_INSTANCE = adOperationsConfiguration;
            com.google.protobuf.GeneratedMessageLite.registerDefaultInstance(gatewayprotocol.v1.NativeConfigurationOuterClass.AdOperationsConfiguration.class, adOperationsConfiguration);
        }

        public static gatewayprotocol.v1.NativeConfigurationOuterClass.AdOperationsConfiguration getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static com.google.protobuf.Parser<gatewayprotocol.v1.NativeConfigurationOuterClass.AdOperationsConfiguration> parser() {
            return DEFAULT_INSTANCE.getParserForType();
        }
    }

    public static final class CachedAssetsConfiguration extends com.google.protobuf.GeneratedMessageLite<gatewayprotocol.v1.NativeConfigurationOuterClass.CachedAssetsConfiguration, gatewayprotocol.v1.NativeConfigurationOuterClass.CachedAssetsConfiguration.Builder> implements gatewayprotocol.v1.NativeConfigurationOuterClass.CachedAssetsConfigurationOrBuilder {
        private static final gatewayprotocol.v1.NativeConfigurationOuterClass.CachedAssetsConfiguration DEFAULT_INSTANCE;
        public static final int MAX_CACHED_ASSET_AGE_MS_FIELD_NUMBER = 1;
        public static final int MAX_CACHED_ASSET_SIZE_MB_FIELD_NUMBER = 2;
        private static volatile com.google.protobuf.Parser<gatewayprotocol.v1.NativeConfigurationOuterClass.CachedAssetsConfiguration> PARSER;
        private long maxCachedAssetAgeMs_;
        private int maxCachedAssetSizeMb_;

        private CachedAssetsConfiguration() {
        }

        @Override // gatewayprotocol.v1.NativeConfigurationOuterClass.CachedAssetsConfigurationOrBuilder
        public long getMaxCachedAssetAgeMs() {
            return this.maxCachedAssetAgeMs_;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setMaxCachedAssetAgeMs(long j) {
            this.maxCachedAssetAgeMs_ = j;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearMaxCachedAssetAgeMs() {
            this.maxCachedAssetAgeMs_ = 0L;
        }

        @Override // gatewayprotocol.v1.NativeConfigurationOuterClass.CachedAssetsConfigurationOrBuilder
        public int getMaxCachedAssetSizeMb() {
            return this.maxCachedAssetSizeMb_;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setMaxCachedAssetSizeMb(int i) {
            this.maxCachedAssetSizeMb_ = i;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearMaxCachedAssetSizeMb() {
            this.maxCachedAssetSizeMb_ = 0;
        }

        public static gatewayprotocol.v1.NativeConfigurationOuterClass.CachedAssetsConfiguration parseFrom(java.nio.ByteBuffer byteBuffer) throws com.google.protobuf.InvalidProtocolBufferException {
            return (gatewayprotocol.v1.NativeConfigurationOuterClass.CachedAssetsConfiguration) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
        }

        public static gatewayprotocol.v1.NativeConfigurationOuterClass.CachedAssetsConfiguration parseFrom(java.nio.ByteBuffer byteBuffer, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) throws com.google.protobuf.InvalidProtocolBufferException {
            return (gatewayprotocol.v1.NativeConfigurationOuterClass.CachedAssetsConfiguration) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
        }

        public static gatewayprotocol.v1.NativeConfigurationOuterClass.CachedAssetsConfiguration parseFrom(com.google.protobuf.ByteString byteString) throws com.google.protobuf.InvalidProtocolBufferException {
            return (gatewayprotocol.v1.NativeConfigurationOuterClass.CachedAssetsConfiguration) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
        }

        public static gatewayprotocol.v1.NativeConfigurationOuterClass.CachedAssetsConfiguration parseFrom(com.google.protobuf.ByteString byteString, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) throws com.google.protobuf.InvalidProtocolBufferException {
            return (gatewayprotocol.v1.NativeConfigurationOuterClass.CachedAssetsConfiguration) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
        }

        public static gatewayprotocol.v1.NativeConfigurationOuterClass.CachedAssetsConfiguration parseFrom(byte[] bArr) throws com.google.protobuf.InvalidProtocolBufferException {
            return (gatewayprotocol.v1.NativeConfigurationOuterClass.CachedAssetsConfiguration) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
        }

        public static gatewayprotocol.v1.NativeConfigurationOuterClass.CachedAssetsConfiguration parseFrom(byte[] bArr, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) throws com.google.protobuf.InvalidProtocolBufferException {
            return (gatewayprotocol.v1.NativeConfigurationOuterClass.CachedAssetsConfiguration) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
        }

        public static gatewayprotocol.v1.NativeConfigurationOuterClass.CachedAssetsConfiguration parseFrom(java.io.InputStream inputStream) throws java.io.IOException {
            return (gatewayprotocol.v1.NativeConfigurationOuterClass.CachedAssetsConfiguration) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static gatewayprotocol.v1.NativeConfigurationOuterClass.CachedAssetsConfiguration parseFrom(java.io.InputStream inputStream, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) throws java.io.IOException {
            return (gatewayprotocol.v1.NativeConfigurationOuterClass.CachedAssetsConfiguration) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
        }

        public static gatewayprotocol.v1.NativeConfigurationOuterClass.CachedAssetsConfiguration parseDelimitedFrom(java.io.InputStream inputStream) throws java.io.IOException {
            return (gatewayprotocol.v1.NativeConfigurationOuterClass.CachedAssetsConfiguration) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static gatewayprotocol.v1.NativeConfigurationOuterClass.CachedAssetsConfiguration parseDelimitedFrom(java.io.InputStream inputStream, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) throws java.io.IOException {
            return (gatewayprotocol.v1.NativeConfigurationOuterClass.CachedAssetsConfiguration) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
        }

        public static gatewayprotocol.v1.NativeConfigurationOuterClass.CachedAssetsConfiguration parseFrom(com.google.protobuf.CodedInputStream codedInputStream) throws java.io.IOException {
            return (gatewayprotocol.v1.NativeConfigurationOuterClass.CachedAssetsConfiguration) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
        }

        public static gatewayprotocol.v1.NativeConfigurationOuterClass.CachedAssetsConfiguration parseFrom(com.google.protobuf.CodedInputStream codedInputStream, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) throws java.io.IOException {
            return (gatewayprotocol.v1.NativeConfigurationOuterClass.CachedAssetsConfiguration) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
        }

        public static gatewayprotocol.v1.NativeConfigurationOuterClass.CachedAssetsConfiguration.Builder newBuilder() {
            return DEFAULT_INSTANCE.createBuilder();
        }

        public static gatewayprotocol.v1.NativeConfigurationOuterClass.CachedAssetsConfiguration.Builder newBuilder(gatewayprotocol.v1.NativeConfigurationOuterClass.CachedAssetsConfiguration cachedAssetsConfiguration) {
            return DEFAULT_INSTANCE.createBuilder(cachedAssetsConfiguration);
        }

        public static final class Builder extends com.google.protobuf.GeneratedMessageLite.Builder<gatewayprotocol.v1.NativeConfigurationOuterClass.CachedAssetsConfiguration, gatewayprotocol.v1.NativeConfigurationOuterClass.CachedAssetsConfiguration.Builder> implements gatewayprotocol.v1.NativeConfigurationOuterClass.CachedAssetsConfigurationOrBuilder {
            /* synthetic */ Builder(gatewayprotocol.v1.NativeConfigurationOuterClass.AnonymousClass1 anonymousClass1) {
                this();
            }

            private Builder() {
                super(gatewayprotocol.v1.NativeConfigurationOuterClass.CachedAssetsConfiguration.DEFAULT_INSTANCE);
            }

            @Override // gatewayprotocol.v1.NativeConfigurationOuterClass.CachedAssetsConfigurationOrBuilder
            public long getMaxCachedAssetAgeMs() {
                return ((gatewayprotocol.v1.NativeConfigurationOuterClass.CachedAssetsConfiguration) this.instance).getMaxCachedAssetAgeMs();
            }

            public gatewayprotocol.v1.NativeConfigurationOuterClass.CachedAssetsConfiguration.Builder setMaxCachedAssetAgeMs(long j) {
                copyOnWrite();
                ((gatewayprotocol.v1.NativeConfigurationOuterClass.CachedAssetsConfiguration) this.instance).setMaxCachedAssetAgeMs(j);
                return this;
            }

            public gatewayprotocol.v1.NativeConfigurationOuterClass.CachedAssetsConfiguration.Builder clearMaxCachedAssetAgeMs() {
                copyOnWrite();
                ((gatewayprotocol.v1.NativeConfigurationOuterClass.CachedAssetsConfiguration) this.instance).clearMaxCachedAssetAgeMs();
                return this;
            }

            @Override // gatewayprotocol.v1.NativeConfigurationOuterClass.CachedAssetsConfigurationOrBuilder
            public int getMaxCachedAssetSizeMb() {
                return ((gatewayprotocol.v1.NativeConfigurationOuterClass.CachedAssetsConfiguration) this.instance).getMaxCachedAssetSizeMb();
            }

            public gatewayprotocol.v1.NativeConfigurationOuterClass.CachedAssetsConfiguration.Builder setMaxCachedAssetSizeMb(int i) {
                copyOnWrite();
                ((gatewayprotocol.v1.NativeConfigurationOuterClass.CachedAssetsConfiguration) this.instance).setMaxCachedAssetSizeMb(i);
                return this;
            }

            public gatewayprotocol.v1.NativeConfigurationOuterClass.CachedAssetsConfiguration.Builder clearMaxCachedAssetSizeMb() {
                copyOnWrite();
                ((gatewayprotocol.v1.NativeConfigurationOuterClass.CachedAssetsConfiguration) this.instance).clearMaxCachedAssetSizeMb();
                return this;
            }
        }

        @Override // com.google.protobuf.GeneratedMessageLite
        protected final java.lang.Object dynamicMethod(com.google.protobuf.GeneratedMessageLite.MethodToInvoke methodToInvoke, java.lang.Object obj, java.lang.Object obj2) {
            gatewayprotocol.v1.NativeConfigurationOuterClass.AnonymousClass1 anonymousClass1 = null;
            switch (gatewayprotocol.v1.NativeConfigurationOuterClass.AnonymousClass1.$SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke[methodToInvoke.ordinal()]) {
                case 1:
                    return new gatewayprotocol.v1.NativeConfigurationOuterClass.CachedAssetsConfiguration();
                case 2:
                    return new gatewayprotocol.v1.NativeConfigurationOuterClass.CachedAssetsConfiguration.Builder(anonymousClass1);
                case 3:
                    return newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001\u0002\u0002\u0004", new java.lang.Object[]{"maxCachedAssetAgeMs_", "maxCachedAssetSizeMb_"});
                case 4:
                    return DEFAULT_INSTANCE;
                case 5:
                    com.google.protobuf.Parser<gatewayprotocol.v1.NativeConfigurationOuterClass.CachedAssetsConfiguration> parser = PARSER;
                    if (parser == null) {
                        synchronized (gatewayprotocol.v1.NativeConfigurationOuterClass.CachedAssetsConfiguration.class) {
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
            gatewayprotocol.v1.NativeConfigurationOuterClass.CachedAssetsConfiguration cachedAssetsConfiguration = new gatewayprotocol.v1.NativeConfigurationOuterClass.CachedAssetsConfiguration();
            DEFAULT_INSTANCE = cachedAssetsConfiguration;
            com.google.protobuf.GeneratedMessageLite.registerDefaultInstance(gatewayprotocol.v1.NativeConfigurationOuterClass.CachedAssetsConfiguration.class, cachedAssetsConfiguration);
        }

        public static gatewayprotocol.v1.NativeConfigurationOuterClass.CachedAssetsConfiguration getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static com.google.protobuf.Parser<gatewayprotocol.v1.NativeConfigurationOuterClass.CachedAssetsConfiguration> parser() {
            return DEFAULT_INSTANCE.getParserForType();
        }
    }

    public static final class NativeConfiguration extends com.google.protobuf.GeneratedMessageLite<gatewayprotocol.v1.NativeConfigurationOuterClass.NativeConfiguration, gatewayprotocol.v1.NativeConfigurationOuterClass.NativeConfiguration.Builder> implements gatewayprotocol.v1.NativeConfigurationOuterClass.NativeConfigurationOrBuilder {
        public static final int ADDITIONAL_STORE_PACKAGES_FIELD_NUMBER = 10;
        public static final int AD_OPERATIONS_FIELD_NUMBER = 6;
        public static final int AD_POLICY_FIELD_NUMBER = 3;
        public static final int CACHED_ASSETS_CONFIGURATION_FIELD_NUMBER = 11;
        public static final int CACHED_WEBVIEW_FILES_CONFIGURATION_FIELD_NUMBER = 13;
        public static final int DEBUG_SETTINGS_FIELD_NUMBER = 16;
        private static final gatewayprotocol.v1.NativeConfigurationOuterClass.NativeConfiguration DEFAULT_INSTANCE;
        public static final int DEFAULT_SHOW_COMPLETION_STATE_FIELD_NUMBER = 14;
        public static final int DIAGNOSTIC_EVENTS_FIELD_NUMBER = 1;
        public static final int DOWNLOAD_POLICY_FIELD_NUMBER = 15;
        public static final int ENABLE_IAP_EVENT_FIELD_NUMBER = 8;
        public static final int ENABLE_OM_FIELD_NUMBER = 9;
        public static final int FEATURE_FLAGS_FIELD_NUMBER = 7;
        public static final int INIT_POLICY_FIELD_NUMBER = 2;
        public static final int MAX_EXTRAS_SIZE_KB_FIELD_NUMBER = 17;
        public static final int OBSERVABLE_ANDROID_ACTIVITIES_FIELD_NUMBER = 12;
        public static final int OPERATIVE_EVENT_POLICY_FIELD_NUMBER = 4;
        public static final int OTHER_POLICY_FIELD_NUMBER = 5;
        private static volatile com.google.protobuf.Parser<gatewayprotocol.v1.NativeConfigurationOuterClass.NativeConfiguration> PARSER;
        private gatewayprotocol.v1.NativeConfigurationOuterClass.AdOperationsConfiguration adOperations_;
        private gatewayprotocol.v1.NativeConfigurationOuterClass.RequestPolicy adPolicy_;
        private int bitField0_;
        private gatewayprotocol.v1.NativeConfigurationOuterClass.CachedAssetsConfiguration cachedAssetsConfiguration_;
        private gatewayprotocol.v1.NativeConfigurationOuterClass.CachedAssetsConfiguration cachedWebviewFilesConfiguration_;
        private gatewayprotocol.v1.NativeConfigurationOuterClass.DebugSettings debugSettings_;
        private int defaultShowCompletionState_;
        private gatewayprotocol.v1.NativeConfigurationOuterClass.DiagnosticEventsConfiguration diagnosticEvents_;
        private gatewayprotocol.v1.NativeConfigurationOuterClass.RequestPolicy downloadPolicy_;
        private boolean enableIapEvent_;
        private boolean enableOm_;
        private gatewayprotocol.v1.NativeConfigurationOuterClass.FeatureFlags featureFlags_;
        private gatewayprotocol.v1.NativeConfigurationOuterClass.RequestPolicy initPolicy_;
        private int maxExtrasSizeKb_;
        private gatewayprotocol.v1.NativeConfigurationOuterClass.RequestPolicy operativeEventPolicy_;
        private gatewayprotocol.v1.NativeConfigurationOuterClass.RequestPolicy otherPolicy_;
        private com.google.protobuf.Internal.ProtobufList<java.lang.String> additionalStorePackages_ = com.google.protobuf.GeneratedMessageLite.emptyProtobufList();
        private com.google.protobuf.Internal.ProtobufList<com.google.protobuf.ByteString> observableAndroidActivities_ = emptyProtobufList();

        private NativeConfiguration() {
        }

        @Override // gatewayprotocol.v1.NativeConfigurationOuterClass.NativeConfigurationOrBuilder
        public boolean hasDiagnosticEvents() {
            return (this.bitField0_ & 1) != 0;
        }

        @Override // gatewayprotocol.v1.NativeConfigurationOuterClass.NativeConfigurationOrBuilder
        public gatewayprotocol.v1.NativeConfigurationOuterClass.DiagnosticEventsConfiguration getDiagnosticEvents() {
            gatewayprotocol.v1.NativeConfigurationOuterClass.DiagnosticEventsConfiguration diagnosticEventsConfiguration = this.diagnosticEvents_;
            return diagnosticEventsConfiguration == null ? gatewayprotocol.v1.NativeConfigurationOuterClass.DiagnosticEventsConfiguration.getDefaultInstance() : diagnosticEventsConfiguration;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setDiagnosticEvents(gatewayprotocol.v1.NativeConfigurationOuterClass.DiagnosticEventsConfiguration diagnosticEventsConfiguration) {
            diagnosticEventsConfiguration.getClass();
            this.diagnosticEvents_ = diagnosticEventsConfiguration;
            this.bitField0_ |= 1;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void mergeDiagnosticEvents(gatewayprotocol.v1.NativeConfigurationOuterClass.DiagnosticEventsConfiguration diagnosticEventsConfiguration) {
            diagnosticEventsConfiguration.getClass();
            gatewayprotocol.v1.NativeConfigurationOuterClass.DiagnosticEventsConfiguration diagnosticEventsConfiguration2 = this.diagnosticEvents_;
            if (diagnosticEventsConfiguration2 != null && diagnosticEventsConfiguration2 != gatewayprotocol.v1.NativeConfigurationOuterClass.DiagnosticEventsConfiguration.getDefaultInstance()) {
                this.diagnosticEvents_ = gatewayprotocol.v1.NativeConfigurationOuterClass.DiagnosticEventsConfiguration.newBuilder(this.diagnosticEvents_).mergeFrom((gatewayprotocol.v1.NativeConfigurationOuterClass.DiagnosticEventsConfiguration.Builder) diagnosticEventsConfiguration).buildPartial();
            } else {
                this.diagnosticEvents_ = diagnosticEventsConfiguration;
            }
            this.bitField0_ |= 1;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearDiagnosticEvents() {
            this.diagnosticEvents_ = null;
            this.bitField0_ &= -2;
        }

        @Override // gatewayprotocol.v1.NativeConfigurationOuterClass.NativeConfigurationOrBuilder
        public boolean hasInitPolicy() {
            return (this.bitField0_ & 2) != 0;
        }

        @Override // gatewayprotocol.v1.NativeConfigurationOuterClass.NativeConfigurationOrBuilder
        public gatewayprotocol.v1.NativeConfigurationOuterClass.RequestPolicy getInitPolicy() {
            gatewayprotocol.v1.NativeConfigurationOuterClass.RequestPolicy requestPolicy = this.initPolicy_;
            return requestPolicy == null ? gatewayprotocol.v1.NativeConfigurationOuterClass.RequestPolicy.getDefaultInstance() : requestPolicy;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setInitPolicy(gatewayprotocol.v1.NativeConfigurationOuterClass.RequestPolicy requestPolicy) {
            requestPolicy.getClass();
            this.initPolicy_ = requestPolicy;
            this.bitField0_ |= 2;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void mergeInitPolicy(gatewayprotocol.v1.NativeConfigurationOuterClass.RequestPolicy requestPolicy) {
            requestPolicy.getClass();
            gatewayprotocol.v1.NativeConfigurationOuterClass.RequestPolicy requestPolicy2 = this.initPolicy_;
            if (requestPolicy2 != null && requestPolicy2 != gatewayprotocol.v1.NativeConfigurationOuterClass.RequestPolicy.getDefaultInstance()) {
                this.initPolicy_ = gatewayprotocol.v1.NativeConfigurationOuterClass.RequestPolicy.newBuilder(this.initPolicy_).mergeFrom((gatewayprotocol.v1.NativeConfigurationOuterClass.RequestPolicy.Builder) requestPolicy).buildPartial();
            } else {
                this.initPolicy_ = requestPolicy;
            }
            this.bitField0_ |= 2;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearInitPolicy() {
            this.initPolicy_ = null;
            this.bitField0_ &= -3;
        }

        @Override // gatewayprotocol.v1.NativeConfigurationOuterClass.NativeConfigurationOrBuilder
        public boolean hasAdPolicy() {
            return (this.bitField0_ & 4) != 0;
        }

        @Override // gatewayprotocol.v1.NativeConfigurationOuterClass.NativeConfigurationOrBuilder
        public gatewayprotocol.v1.NativeConfigurationOuterClass.RequestPolicy getAdPolicy() {
            gatewayprotocol.v1.NativeConfigurationOuterClass.RequestPolicy requestPolicy = this.adPolicy_;
            return requestPolicy == null ? gatewayprotocol.v1.NativeConfigurationOuterClass.RequestPolicy.getDefaultInstance() : requestPolicy;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setAdPolicy(gatewayprotocol.v1.NativeConfigurationOuterClass.RequestPolicy requestPolicy) {
            requestPolicy.getClass();
            this.adPolicy_ = requestPolicy;
            this.bitField0_ |= 4;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void mergeAdPolicy(gatewayprotocol.v1.NativeConfigurationOuterClass.RequestPolicy requestPolicy) {
            requestPolicy.getClass();
            gatewayprotocol.v1.NativeConfigurationOuterClass.RequestPolicy requestPolicy2 = this.adPolicy_;
            if (requestPolicy2 != null && requestPolicy2 != gatewayprotocol.v1.NativeConfigurationOuterClass.RequestPolicy.getDefaultInstance()) {
                this.adPolicy_ = gatewayprotocol.v1.NativeConfigurationOuterClass.RequestPolicy.newBuilder(this.adPolicy_).mergeFrom((gatewayprotocol.v1.NativeConfigurationOuterClass.RequestPolicy.Builder) requestPolicy).buildPartial();
            } else {
                this.adPolicy_ = requestPolicy;
            }
            this.bitField0_ |= 4;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearAdPolicy() {
            this.adPolicy_ = null;
            this.bitField0_ &= -5;
        }

        @Override // gatewayprotocol.v1.NativeConfigurationOuterClass.NativeConfigurationOrBuilder
        public boolean hasOperativeEventPolicy() {
            return (this.bitField0_ & 8) != 0;
        }

        @Override // gatewayprotocol.v1.NativeConfigurationOuterClass.NativeConfigurationOrBuilder
        public gatewayprotocol.v1.NativeConfigurationOuterClass.RequestPolicy getOperativeEventPolicy() {
            gatewayprotocol.v1.NativeConfigurationOuterClass.RequestPolicy requestPolicy = this.operativeEventPolicy_;
            return requestPolicy == null ? gatewayprotocol.v1.NativeConfigurationOuterClass.RequestPolicy.getDefaultInstance() : requestPolicy;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setOperativeEventPolicy(gatewayprotocol.v1.NativeConfigurationOuterClass.RequestPolicy requestPolicy) {
            requestPolicy.getClass();
            this.operativeEventPolicy_ = requestPolicy;
            this.bitField0_ |= 8;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void mergeOperativeEventPolicy(gatewayprotocol.v1.NativeConfigurationOuterClass.RequestPolicy requestPolicy) {
            requestPolicy.getClass();
            gatewayprotocol.v1.NativeConfigurationOuterClass.RequestPolicy requestPolicy2 = this.operativeEventPolicy_;
            if (requestPolicy2 != null && requestPolicy2 != gatewayprotocol.v1.NativeConfigurationOuterClass.RequestPolicy.getDefaultInstance()) {
                this.operativeEventPolicy_ = gatewayprotocol.v1.NativeConfigurationOuterClass.RequestPolicy.newBuilder(this.operativeEventPolicy_).mergeFrom((gatewayprotocol.v1.NativeConfigurationOuterClass.RequestPolicy.Builder) requestPolicy).buildPartial();
            } else {
                this.operativeEventPolicy_ = requestPolicy;
            }
            this.bitField0_ |= 8;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearOperativeEventPolicy() {
            this.operativeEventPolicy_ = null;
            this.bitField0_ &= -9;
        }

        @Override // gatewayprotocol.v1.NativeConfigurationOuterClass.NativeConfigurationOrBuilder
        public boolean hasOtherPolicy() {
            return (this.bitField0_ & 16) != 0;
        }

        @Override // gatewayprotocol.v1.NativeConfigurationOuterClass.NativeConfigurationOrBuilder
        public gatewayprotocol.v1.NativeConfigurationOuterClass.RequestPolicy getOtherPolicy() {
            gatewayprotocol.v1.NativeConfigurationOuterClass.RequestPolicy requestPolicy = this.otherPolicy_;
            return requestPolicy == null ? gatewayprotocol.v1.NativeConfigurationOuterClass.RequestPolicy.getDefaultInstance() : requestPolicy;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setOtherPolicy(gatewayprotocol.v1.NativeConfigurationOuterClass.RequestPolicy requestPolicy) {
            requestPolicy.getClass();
            this.otherPolicy_ = requestPolicy;
            this.bitField0_ |= 16;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void mergeOtherPolicy(gatewayprotocol.v1.NativeConfigurationOuterClass.RequestPolicy requestPolicy) {
            requestPolicy.getClass();
            gatewayprotocol.v1.NativeConfigurationOuterClass.RequestPolicy requestPolicy2 = this.otherPolicy_;
            if (requestPolicy2 != null && requestPolicy2 != gatewayprotocol.v1.NativeConfigurationOuterClass.RequestPolicy.getDefaultInstance()) {
                this.otherPolicy_ = gatewayprotocol.v1.NativeConfigurationOuterClass.RequestPolicy.newBuilder(this.otherPolicy_).mergeFrom((gatewayprotocol.v1.NativeConfigurationOuterClass.RequestPolicy.Builder) requestPolicy).buildPartial();
            } else {
                this.otherPolicy_ = requestPolicy;
            }
            this.bitField0_ |= 16;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearOtherPolicy() {
            this.otherPolicy_ = null;
            this.bitField0_ &= -17;
        }

        @Override // gatewayprotocol.v1.NativeConfigurationOuterClass.NativeConfigurationOrBuilder
        public boolean hasAdOperations() {
            return (this.bitField0_ & 32) != 0;
        }

        @Override // gatewayprotocol.v1.NativeConfigurationOuterClass.NativeConfigurationOrBuilder
        public gatewayprotocol.v1.NativeConfigurationOuterClass.AdOperationsConfiguration getAdOperations() {
            gatewayprotocol.v1.NativeConfigurationOuterClass.AdOperationsConfiguration adOperationsConfiguration = this.adOperations_;
            return adOperationsConfiguration == null ? gatewayprotocol.v1.NativeConfigurationOuterClass.AdOperationsConfiguration.getDefaultInstance() : adOperationsConfiguration;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setAdOperations(gatewayprotocol.v1.NativeConfigurationOuterClass.AdOperationsConfiguration adOperationsConfiguration) {
            adOperationsConfiguration.getClass();
            this.adOperations_ = adOperationsConfiguration;
            this.bitField0_ |= 32;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void mergeAdOperations(gatewayprotocol.v1.NativeConfigurationOuterClass.AdOperationsConfiguration adOperationsConfiguration) {
            adOperationsConfiguration.getClass();
            gatewayprotocol.v1.NativeConfigurationOuterClass.AdOperationsConfiguration adOperationsConfiguration2 = this.adOperations_;
            if (adOperationsConfiguration2 != null && adOperationsConfiguration2 != gatewayprotocol.v1.NativeConfigurationOuterClass.AdOperationsConfiguration.getDefaultInstance()) {
                this.adOperations_ = gatewayprotocol.v1.NativeConfigurationOuterClass.AdOperationsConfiguration.newBuilder(this.adOperations_).mergeFrom((gatewayprotocol.v1.NativeConfigurationOuterClass.AdOperationsConfiguration.Builder) adOperationsConfiguration).buildPartial();
            } else {
                this.adOperations_ = adOperationsConfiguration;
            }
            this.bitField0_ |= 32;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearAdOperations() {
            this.adOperations_ = null;
            this.bitField0_ &= -33;
        }

        @Override // gatewayprotocol.v1.NativeConfigurationOuterClass.NativeConfigurationOrBuilder
        public boolean hasFeatureFlags() {
            return (this.bitField0_ & 64) != 0;
        }

        @Override // gatewayprotocol.v1.NativeConfigurationOuterClass.NativeConfigurationOrBuilder
        public gatewayprotocol.v1.NativeConfigurationOuterClass.FeatureFlags getFeatureFlags() {
            gatewayprotocol.v1.NativeConfigurationOuterClass.FeatureFlags featureFlags = this.featureFlags_;
            return featureFlags == null ? gatewayprotocol.v1.NativeConfigurationOuterClass.FeatureFlags.getDefaultInstance() : featureFlags;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setFeatureFlags(gatewayprotocol.v1.NativeConfigurationOuterClass.FeatureFlags featureFlags) {
            featureFlags.getClass();
            this.featureFlags_ = featureFlags;
            this.bitField0_ |= 64;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void mergeFeatureFlags(gatewayprotocol.v1.NativeConfigurationOuterClass.FeatureFlags featureFlags) {
            featureFlags.getClass();
            gatewayprotocol.v1.NativeConfigurationOuterClass.FeatureFlags featureFlags2 = this.featureFlags_;
            if (featureFlags2 != null && featureFlags2 != gatewayprotocol.v1.NativeConfigurationOuterClass.FeatureFlags.getDefaultInstance()) {
                this.featureFlags_ = gatewayprotocol.v1.NativeConfigurationOuterClass.FeatureFlags.newBuilder(this.featureFlags_).mergeFrom((gatewayprotocol.v1.NativeConfigurationOuterClass.FeatureFlags.Builder) featureFlags).buildPartial();
            } else {
                this.featureFlags_ = featureFlags;
            }
            this.bitField0_ |= 64;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearFeatureFlags() {
            this.featureFlags_ = null;
            this.bitField0_ &= -65;
        }

        @Override // gatewayprotocol.v1.NativeConfigurationOuterClass.NativeConfigurationOrBuilder
        public boolean getEnableIapEvent() {
            return this.enableIapEvent_;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setEnableIapEvent(boolean z) {
            this.enableIapEvent_ = z;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearEnableIapEvent() {
            this.enableIapEvent_ = false;
        }

        @Override // gatewayprotocol.v1.NativeConfigurationOuterClass.NativeConfigurationOrBuilder
        public boolean getEnableOm() {
            return this.enableOm_;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setEnableOm(boolean z) {
            this.enableOm_ = z;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearEnableOm() {
            this.enableOm_ = false;
        }

        @Override // gatewayprotocol.v1.NativeConfigurationOuterClass.NativeConfigurationOrBuilder
        public java.util.List<java.lang.String> getAdditionalStorePackagesList() {
            return this.additionalStorePackages_;
        }

        @Override // gatewayprotocol.v1.NativeConfigurationOuterClass.NativeConfigurationOrBuilder
        public int getAdditionalStorePackagesCount() {
            return this.additionalStorePackages_.size();
        }

        @Override // gatewayprotocol.v1.NativeConfigurationOuterClass.NativeConfigurationOrBuilder
        public java.lang.String getAdditionalStorePackages(int i) {
            return this.additionalStorePackages_.get(i);
        }

        @Override // gatewayprotocol.v1.NativeConfigurationOuterClass.NativeConfigurationOrBuilder
        public com.google.protobuf.ByteString getAdditionalStorePackagesBytes(int i) {
            return com.google.protobuf.ByteString.copyFromUtf8(this.additionalStorePackages_.get(i));
        }

        private void ensureAdditionalStorePackagesIsMutable() {
            com.google.protobuf.Internal.ProtobufList<java.lang.String> protobufList = this.additionalStorePackages_;
            if (protobufList.isModifiable()) {
                return;
            }
            this.additionalStorePackages_ = com.google.protobuf.GeneratedMessageLite.mutableCopy(protobufList);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setAdditionalStorePackages(int i, java.lang.String str) {
            str.getClass();
            ensureAdditionalStorePackagesIsMutable();
            this.additionalStorePackages_.set(i, str);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void addAdditionalStorePackages(java.lang.String str) {
            str.getClass();
            ensureAdditionalStorePackagesIsMutable();
            this.additionalStorePackages_.add(str);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void addAllAdditionalStorePackages(java.lang.Iterable<java.lang.String> iterable) {
            ensureAdditionalStorePackagesIsMutable();
            com.google.protobuf.AbstractMessageLite.addAll((java.lang.Iterable) iterable, (java.util.List) this.additionalStorePackages_);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearAdditionalStorePackages() {
            this.additionalStorePackages_ = com.google.protobuf.GeneratedMessageLite.emptyProtobufList();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void addAdditionalStorePackagesBytes(com.google.protobuf.ByteString byteString) {
            checkByteStringIsUtf8(byteString);
            ensureAdditionalStorePackagesIsMutable();
            this.additionalStorePackages_.add(byteString.toStringUtf8());
        }

        @Override // gatewayprotocol.v1.NativeConfigurationOuterClass.NativeConfigurationOrBuilder
        public boolean hasCachedAssetsConfiguration() {
            return (this.bitField0_ & 128) != 0;
        }

        @Override // gatewayprotocol.v1.NativeConfigurationOuterClass.NativeConfigurationOrBuilder
        public gatewayprotocol.v1.NativeConfigurationOuterClass.CachedAssetsConfiguration getCachedAssetsConfiguration() {
            gatewayprotocol.v1.NativeConfigurationOuterClass.CachedAssetsConfiguration cachedAssetsConfiguration = this.cachedAssetsConfiguration_;
            return cachedAssetsConfiguration == null ? gatewayprotocol.v1.NativeConfigurationOuterClass.CachedAssetsConfiguration.getDefaultInstance() : cachedAssetsConfiguration;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setCachedAssetsConfiguration(gatewayprotocol.v1.NativeConfigurationOuterClass.CachedAssetsConfiguration cachedAssetsConfiguration) {
            cachedAssetsConfiguration.getClass();
            this.cachedAssetsConfiguration_ = cachedAssetsConfiguration;
            this.bitField0_ |= 128;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void mergeCachedAssetsConfiguration(gatewayprotocol.v1.NativeConfigurationOuterClass.CachedAssetsConfiguration cachedAssetsConfiguration) {
            cachedAssetsConfiguration.getClass();
            gatewayprotocol.v1.NativeConfigurationOuterClass.CachedAssetsConfiguration cachedAssetsConfiguration2 = this.cachedAssetsConfiguration_;
            if (cachedAssetsConfiguration2 != null && cachedAssetsConfiguration2 != gatewayprotocol.v1.NativeConfigurationOuterClass.CachedAssetsConfiguration.getDefaultInstance()) {
                this.cachedAssetsConfiguration_ = gatewayprotocol.v1.NativeConfigurationOuterClass.CachedAssetsConfiguration.newBuilder(this.cachedAssetsConfiguration_).mergeFrom((gatewayprotocol.v1.NativeConfigurationOuterClass.CachedAssetsConfiguration.Builder) cachedAssetsConfiguration).buildPartial();
            } else {
                this.cachedAssetsConfiguration_ = cachedAssetsConfiguration;
            }
            this.bitField0_ |= 128;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearCachedAssetsConfiguration() {
            this.cachedAssetsConfiguration_ = null;
            this.bitField0_ &= -129;
        }

        @Override // gatewayprotocol.v1.NativeConfigurationOuterClass.NativeConfigurationOrBuilder
        public java.util.List<com.google.protobuf.ByteString> getObservableAndroidActivitiesList() {
            return this.observableAndroidActivities_;
        }

        @Override // gatewayprotocol.v1.NativeConfigurationOuterClass.NativeConfigurationOrBuilder
        public int getObservableAndroidActivitiesCount() {
            return this.observableAndroidActivities_.size();
        }

        @Override // gatewayprotocol.v1.NativeConfigurationOuterClass.NativeConfigurationOrBuilder
        public com.google.protobuf.ByteString getObservableAndroidActivities(int i) {
            return this.observableAndroidActivities_.get(i);
        }

        private void ensureObservableAndroidActivitiesIsMutable() {
            com.google.protobuf.Internal.ProtobufList<com.google.protobuf.ByteString> protobufList = this.observableAndroidActivities_;
            if (protobufList.isModifiable()) {
                return;
            }
            this.observableAndroidActivities_ = com.google.protobuf.GeneratedMessageLite.mutableCopy(protobufList);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setObservableAndroidActivities(int i, com.google.protobuf.ByteString byteString) {
            byteString.getClass();
            ensureObservableAndroidActivitiesIsMutable();
            this.observableAndroidActivities_.set(i, byteString);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void addObservableAndroidActivities(com.google.protobuf.ByteString byteString) {
            byteString.getClass();
            ensureObservableAndroidActivitiesIsMutable();
            this.observableAndroidActivities_.add(byteString);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void addAllObservableAndroidActivities(java.lang.Iterable<? extends com.google.protobuf.ByteString> iterable) {
            ensureObservableAndroidActivitiesIsMutable();
            com.google.protobuf.AbstractMessageLite.addAll((java.lang.Iterable) iterable, (java.util.List) this.observableAndroidActivities_);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearObservableAndroidActivities() {
            this.observableAndroidActivities_ = emptyProtobufList();
        }

        @Override // gatewayprotocol.v1.NativeConfigurationOuterClass.NativeConfigurationOrBuilder
        public boolean hasCachedWebviewFilesConfiguration() {
            return (this.bitField0_ & 256) != 0;
        }

        @Override // gatewayprotocol.v1.NativeConfigurationOuterClass.NativeConfigurationOrBuilder
        public gatewayprotocol.v1.NativeConfigurationOuterClass.CachedAssetsConfiguration getCachedWebviewFilesConfiguration() {
            gatewayprotocol.v1.NativeConfigurationOuterClass.CachedAssetsConfiguration cachedAssetsConfiguration = this.cachedWebviewFilesConfiguration_;
            return cachedAssetsConfiguration == null ? gatewayprotocol.v1.NativeConfigurationOuterClass.CachedAssetsConfiguration.getDefaultInstance() : cachedAssetsConfiguration;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setCachedWebviewFilesConfiguration(gatewayprotocol.v1.NativeConfigurationOuterClass.CachedAssetsConfiguration cachedAssetsConfiguration) {
            cachedAssetsConfiguration.getClass();
            this.cachedWebviewFilesConfiguration_ = cachedAssetsConfiguration;
            this.bitField0_ |= 256;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void mergeCachedWebviewFilesConfiguration(gatewayprotocol.v1.NativeConfigurationOuterClass.CachedAssetsConfiguration cachedAssetsConfiguration) {
            cachedAssetsConfiguration.getClass();
            gatewayprotocol.v1.NativeConfigurationOuterClass.CachedAssetsConfiguration cachedAssetsConfiguration2 = this.cachedWebviewFilesConfiguration_;
            if (cachedAssetsConfiguration2 != null && cachedAssetsConfiguration2 != gatewayprotocol.v1.NativeConfigurationOuterClass.CachedAssetsConfiguration.getDefaultInstance()) {
                this.cachedWebviewFilesConfiguration_ = gatewayprotocol.v1.NativeConfigurationOuterClass.CachedAssetsConfiguration.newBuilder(this.cachedWebviewFilesConfiguration_).mergeFrom((gatewayprotocol.v1.NativeConfigurationOuterClass.CachedAssetsConfiguration.Builder) cachedAssetsConfiguration).buildPartial();
            } else {
                this.cachedWebviewFilesConfiguration_ = cachedAssetsConfiguration;
            }
            this.bitField0_ |= 256;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearCachedWebviewFilesConfiguration() {
            this.cachedWebviewFilesConfiguration_ = null;
            this.bitField0_ &= -257;
        }

        @Override // gatewayprotocol.v1.NativeConfigurationOuterClass.NativeConfigurationOrBuilder
        public int getDefaultShowCompletionStateValue() {
            return this.defaultShowCompletionState_;
        }

        @Override // gatewayprotocol.v1.NativeConfigurationOuterClass.NativeConfigurationOrBuilder
        public gatewayprotocol.v1.NativeConfigurationOuterClass.ShowCompletionState getDefaultShowCompletionState() {
            gatewayprotocol.v1.NativeConfigurationOuterClass.ShowCompletionState forNumber = gatewayprotocol.v1.NativeConfigurationOuterClass.ShowCompletionState.forNumber(this.defaultShowCompletionState_);
            return forNumber == null ? gatewayprotocol.v1.NativeConfigurationOuterClass.ShowCompletionState.UNRECOGNIZED : forNumber;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setDefaultShowCompletionStateValue(int i) {
            this.defaultShowCompletionState_ = i;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setDefaultShowCompletionState(gatewayprotocol.v1.NativeConfigurationOuterClass.ShowCompletionState showCompletionState) {
            this.defaultShowCompletionState_ = showCompletionState.getNumber();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearDefaultShowCompletionState() {
            this.defaultShowCompletionState_ = 0;
        }

        @Override // gatewayprotocol.v1.NativeConfigurationOuterClass.NativeConfigurationOrBuilder
        public boolean hasDownloadPolicy() {
            return (this.bitField0_ & 512) != 0;
        }

        @Override // gatewayprotocol.v1.NativeConfigurationOuterClass.NativeConfigurationOrBuilder
        public gatewayprotocol.v1.NativeConfigurationOuterClass.RequestPolicy getDownloadPolicy() {
            gatewayprotocol.v1.NativeConfigurationOuterClass.RequestPolicy requestPolicy = this.downloadPolicy_;
            return requestPolicy == null ? gatewayprotocol.v1.NativeConfigurationOuterClass.RequestPolicy.getDefaultInstance() : requestPolicy;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setDownloadPolicy(gatewayprotocol.v1.NativeConfigurationOuterClass.RequestPolicy requestPolicy) {
            requestPolicy.getClass();
            this.downloadPolicy_ = requestPolicy;
            this.bitField0_ |= 512;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void mergeDownloadPolicy(gatewayprotocol.v1.NativeConfigurationOuterClass.RequestPolicy requestPolicy) {
            requestPolicy.getClass();
            gatewayprotocol.v1.NativeConfigurationOuterClass.RequestPolicy requestPolicy2 = this.downloadPolicy_;
            if (requestPolicy2 != null && requestPolicy2 != gatewayprotocol.v1.NativeConfigurationOuterClass.RequestPolicy.getDefaultInstance()) {
                this.downloadPolicy_ = gatewayprotocol.v1.NativeConfigurationOuterClass.RequestPolicy.newBuilder(this.downloadPolicy_).mergeFrom((gatewayprotocol.v1.NativeConfigurationOuterClass.RequestPolicy.Builder) requestPolicy).buildPartial();
            } else {
                this.downloadPolicy_ = requestPolicy;
            }
            this.bitField0_ |= 512;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearDownloadPolicy() {
            this.downloadPolicy_ = null;
            this.bitField0_ &= -513;
        }

        @Override // gatewayprotocol.v1.NativeConfigurationOuterClass.NativeConfigurationOrBuilder
        public boolean hasDebugSettings() {
            return (this.bitField0_ & 1024) != 0;
        }

        @Override // gatewayprotocol.v1.NativeConfigurationOuterClass.NativeConfigurationOrBuilder
        public gatewayprotocol.v1.NativeConfigurationOuterClass.DebugSettings getDebugSettings() {
            gatewayprotocol.v1.NativeConfigurationOuterClass.DebugSettings debugSettings = this.debugSettings_;
            return debugSettings == null ? gatewayprotocol.v1.NativeConfigurationOuterClass.DebugSettings.getDefaultInstance() : debugSettings;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setDebugSettings(gatewayprotocol.v1.NativeConfigurationOuterClass.DebugSettings debugSettings) {
            debugSettings.getClass();
            this.debugSettings_ = debugSettings;
            this.bitField0_ |= 1024;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void mergeDebugSettings(gatewayprotocol.v1.NativeConfigurationOuterClass.DebugSettings debugSettings) {
            debugSettings.getClass();
            gatewayprotocol.v1.NativeConfigurationOuterClass.DebugSettings debugSettings2 = this.debugSettings_;
            if (debugSettings2 != null && debugSettings2 != gatewayprotocol.v1.NativeConfigurationOuterClass.DebugSettings.getDefaultInstance()) {
                this.debugSettings_ = gatewayprotocol.v1.NativeConfigurationOuterClass.DebugSettings.newBuilder(this.debugSettings_).mergeFrom((gatewayprotocol.v1.NativeConfigurationOuterClass.DebugSettings.Builder) debugSettings).buildPartial();
            } else {
                this.debugSettings_ = debugSettings;
            }
            this.bitField0_ |= 1024;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearDebugSettings() {
            this.debugSettings_ = null;
            this.bitField0_ &= -1025;
        }

        @Override // gatewayprotocol.v1.NativeConfigurationOuterClass.NativeConfigurationOrBuilder
        public int getMaxExtrasSizeKb() {
            return this.maxExtrasSizeKb_;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setMaxExtrasSizeKb(int i) {
            this.maxExtrasSizeKb_ = i;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearMaxExtrasSizeKb() {
            this.maxExtrasSizeKb_ = 0;
        }

        public static gatewayprotocol.v1.NativeConfigurationOuterClass.NativeConfiguration parseFrom(java.nio.ByteBuffer byteBuffer) throws com.google.protobuf.InvalidProtocolBufferException {
            return (gatewayprotocol.v1.NativeConfigurationOuterClass.NativeConfiguration) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
        }

        public static gatewayprotocol.v1.NativeConfigurationOuterClass.NativeConfiguration parseFrom(java.nio.ByteBuffer byteBuffer, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) throws com.google.protobuf.InvalidProtocolBufferException {
            return (gatewayprotocol.v1.NativeConfigurationOuterClass.NativeConfiguration) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
        }

        public static gatewayprotocol.v1.NativeConfigurationOuterClass.NativeConfiguration parseFrom(com.google.protobuf.ByteString byteString) throws com.google.protobuf.InvalidProtocolBufferException {
            return (gatewayprotocol.v1.NativeConfigurationOuterClass.NativeConfiguration) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
        }

        public static gatewayprotocol.v1.NativeConfigurationOuterClass.NativeConfiguration parseFrom(com.google.protobuf.ByteString byteString, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) throws com.google.protobuf.InvalidProtocolBufferException {
            return (gatewayprotocol.v1.NativeConfigurationOuterClass.NativeConfiguration) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
        }

        public static gatewayprotocol.v1.NativeConfigurationOuterClass.NativeConfiguration parseFrom(byte[] bArr) throws com.google.protobuf.InvalidProtocolBufferException {
            return (gatewayprotocol.v1.NativeConfigurationOuterClass.NativeConfiguration) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
        }

        public static gatewayprotocol.v1.NativeConfigurationOuterClass.NativeConfiguration parseFrom(byte[] bArr, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) throws com.google.protobuf.InvalidProtocolBufferException {
            return (gatewayprotocol.v1.NativeConfigurationOuterClass.NativeConfiguration) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
        }

        public static gatewayprotocol.v1.NativeConfigurationOuterClass.NativeConfiguration parseFrom(java.io.InputStream inputStream) throws java.io.IOException {
            return (gatewayprotocol.v1.NativeConfigurationOuterClass.NativeConfiguration) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static gatewayprotocol.v1.NativeConfigurationOuterClass.NativeConfiguration parseFrom(java.io.InputStream inputStream, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) throws java.io.IOException {
            return (gatewayprotocol.v1.NativeConfigurationOuterClass.NativeConfiguration) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
        }

        public static gatewayprotocol.v1.NativeConfigurationOuterClass.NativeConfiguration parseDelimitedFrom(java.io.InputStream inputStream) throws java.io.IOException {
            return (gatewayprotocol.v1.NativeConfigurationOuterClass.NativeConfiguration) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static gatewayprotocol.v1.NativeConfigurationOuterClass.NativeConfiguration parseDelimitedFrom(java.io.InputStream inputStream, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) throws java.io.IOException {
            return (gatewayprotocol.v1.NativeConfigurationOuterClass.NativeConfiguration) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
        }

        public static gatewayprotocol.v1.NativeConfigurationOuterClass.NativeConfiguration parseFrom(com.google.protobuf.CodedInputStream codedInputStream) throws java.io.IOException {
            return (gatewayprotocol.v1.NativeConfigurationOuterClass.NativeConfiguration) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
        }

        public static gatewayprotocol.v1.NativeConfigurationOuterClass.NativeConfiguration parseFrom(com.google.protobuf.CodedInputStream codedInputStream, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) throws java.io.IOException {
            return (gatewayprotocol.v1.NativeConfigurationOuterClass.NativeConfiguration) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
        }

        public static gatewayprotocol.v1.NativeConfigurationOuterClass.NativeConfiguration.Builder newBuilder() {
            return DEFAULT_INSTANCE.createBuilder();
        }

        public static gatewayprotocol.v1.NativeConfigurationOuterClass.NativeConfiguration.Builder newBuilder(gatewayprotocol.v1.NativeConfigurationOuterClass.NativeConfiguration nativeConfiguration) {
            return DEFAULT_INSTANCE.createBuilder(nativeConfiguration);
        }

        public static final class Builder extends com.google.protobuf.GeneratedMessageLite.Builder<gatewayprotocol.v1.NativeConfigurationOuterClass.NativeConfiguration, gatewayprotocol.v1.NativeConfigurationOuterClass.NativeConfiguration.Builder> implements gatewayprotocol.v1.NativeConfigurationOuterClass.NativeConfigurationOrBuilder {
            /* synthetic */ Builder(gatewayprotocol.v1.NativeConfigurationOuterClass.AnonymousClass1 anonymousClass1) {
                this();
            }

            private Builder() {
                super(gatewayprotocol.v1.NativeConfigurationOuterClass.NativeConfiguration.DEFAULT_INSTANCE);
            }

            @Override // gatewayprotocol.v1.NativeConfigurationOuterClass.NativeConfigurationOrBuilder
            public boolean hasDiagnosticEvents() {
                return ((gatewayprotocol.v1.NativeConfigurationOuterClass.NativeConfiguration) this.instance).hasDiagnosticEvents();
            }

            @Override // gatewayprotocol.v1.NativeConfigurationOuterClass.NativeConfigurationOrBuilder
            public gatewayprotocol.v1.NativeConfigurationOuterClass.DiagnosticEventsConfiguration getDiagnosticEvents() {
                return ((gatewayprotocol.v1.NativeConfigurationOuterClass.NativeConfiguration) this.instance).getDiagnosticEvents();
            }

            public gatewayprotocol.v1.NativeConfigurationOuterClass.NativeConfiguration.Builder setDiagnosticEvents(gatewayprotocol.v1.NativeConfigurationOuterClass.DiagnosticEventsConfiguration diagnosticEventsConfiguration) {
                copyOnWrite();
                ((gatewayprotocol.v1.NativeConfigurationOuterClass.NativeConfiguration) this.instance).setDiagnosticEvents(diagnosticEventsConfiguration);
                return this;
            }

            public gatewayprotocol.v1.NativeConfigurationOuterClass.NativeConfiguration.Builder setDiagnosticEvents(gatewayprotocol.v1.NativeConfigurationOuterClass.DiagnosticEventsConfiguration.Builder builder) {
                copyOnWrite();
                ((gatewayprotocol.v1.NativeConfigurationOuterClass.NativeConfiguration) this.instance).setDiagnosticEvents(builder.build());
                return this;
            }

            public gatewayprotocol.v1.NativeConfigurationOuterClass.NativeConfiguration.Builder mergeDiagnosticEvents(gatewayprotocol.v1.NativeConfigurationOuterClass.DiagnosticEventsConfiguration diagnosticEventsConfiguration) {
                copyOnWrite();
                ((gatewayprotocol.v1.NativeConfigurationOuterClass.NativeConfiguration) this.instance).mergeDiagnosticEvents(diagnosticEventsConfiguration);
                return this;
            }

            public gatewayprotocol.v1.NativeConfigurationOuterClass.NativeConfiguration.Builder clearDiagnosticEvents() {
                copyOnWrite();
                ((gatewayprotocol.v1.NativeConfigurationOuterClass.NativeConfiguration) this.instance).clearDiagnosticEvents();
                return this;
            }

            @Override // gatewayprotocol.v1.NativeConfigurationOuterClass.NativeConfigurationOrBuilder
            public boolean hasInitPolicy() {
                return ((gatewayprotocol.v1.NativeConfigurationOuterClass.NativeConfiguration) this.instance).hasInitPolicy();
            }

            @Override // gatewayprotocol.v1.NativeConfigurationOuterClass.NativeConfigurationOrBuilder
            public gatewayprotocol.v1.NativeConfigurationOuterClass.RequestPolicy getInitPolicy() {
                return ((gatewayprotocol.v1.NativeConfigurationOuterClass.NativeConfiguration) this.instance).getInitPolicy();
            }

            public gatewayprotocol.v1.NativeConfigurationOuterClass.NativeConfiguration.Builder setInitPolicy(gatewayprotocol.v1.NativeConfigurationOuterClass.RequestPolicy requestPolicy) {
                copyOnWrite();
                ((gatewayprotocol.v1.NativeConfigurationOuterClass.NativeConfiguration) this.instance).setInitPolicy(requestPolicy);
                return this;
            }

            public gatewayprotocol.v1.NativeConfigurationOuterClass.NativeConfiguration.Builder setInitPolicy(gatewayprotocol.v1.NativeConfigurationOuterClass.RequestPolicy.Builder builder) {
                copyOnWrite();
                ((gatewayprotocol.v1.NativeConfigurationOuterClass.NativeConfiguration) this.instance).setInitPolicy(builder.build());
                return this;
            }

            public gatewayprotocol.v1.NativeConfigurationOuterClass.NativeConfiguration.Builder mergeInitPolicy(gatewayprotocol.v1.NativeConfigurationOuterClass.RequestPolicy requestPolicy) {
                copyOnWrite();
                ((gatewayprotocol.v1.NativeConfigurationOuterClass.NativeConfiguration) this.instance).mergeInitPolicy(requestPolicy);
                return this;
            }

            public gatewayprotocol.v1.NativeConfigurationOuterClass.NativeConfiguration.Builder clearInitPolicy() {
                copyOnWrite();
                ((gatewayprotocol.v1.NativeConfigurationOuterClass.NativeConfiguration) this.instance).clearInitPolicy();
                return this;
            }

            @Override // gatewayprotocol.v1.NativeConfigurationOuterClass.NativeConfigurationOrBuilder
            public boolean hasAdPolicy() {
                return ((gatewayprotocol.v1.NativeConfigurationOuterClass.NativeConfiguration) this.instance).hasAdPolicy();
            }

            @Override // gatewayprotocol.v1.NativeConfigurationOuterClass.NativeConfigurationOrBuilder
            public gatewayprotocol.v1.NativeConfigurationOuterClass.RequestPolicy getAdPolicy() {
                return ((gatewayprotocol.v1.NativeConfigurationOuterClass.NativeConfiguration) this.instance).getAdPolicy();
            }

            public gatewayprotocol.v1.NativeConfigurationOuterClass.NativeConfiguration.Builder setAdPolicy(gatewayprotocol.v1.NativeConfigurationOuterClass.RequestPolicy requestPolicy) {
                copyOnWrite();
                ((gatewayprotocol.v1.NativeConfigurationOuterClass.NativeConfiguration) this.instance).setAdPolicy(requestPolicy);
                return this;
            }

            public gatewayprotocol.v1.NativeConfigurationOuterClass.NativeConfiguration.Builder setAdPolicy(gatewayprotocol.v1.NativeConfigurationOuterClass.RequestPolicy.Builder builder) {
                copyOnWrite();
                ((gatewayprotocol.v1.NativeConfigurationOuterClass.NativeConfiguration) this.instance).setAdPolicy(builder.build());
                return this;
            }

            public gatewayprotocol.v1.NativeConfigurationOuterClass.NativeConfiguration.Builder mergeAdPolicy(gatewayprotocol.v1.NativeConfigurationOuterClass.RequestPolicy requestPolicy) {
                copyOnWrite();
                ((gatewayprotocol.v1.NativeConfigurationOuterClass.NativeConfiguration) this.instance).mergeAdPolicy(requestPolicy);
                return this;
            }

            public gatewayprotocol.v1.NativeConfigurationOuterClass.NativeConfiguration.Builder clearAdPolicy() {
                copyOnWrite();
                ((gatewayprotocol.v1.NativeConfigurationOuterClass.NativeConfiguration) this.instance).clearAdPolicy();
                return this;
            }

            @Override // gatewayprotocol.v1.NativeConfigurationOuterClass.NativeConfigurationOrBuilder
            public boolean hasOperativeEventPolicy() {
                return ((gatewayprotocol.v1.NativeConfigurationOuterClass.NativeConfiguration) this.instance).hasOperativeEventPolicy();
            }

            @Override // gatewayprotocol.v1.NativeConfigurationOuterClass.NativeConfigurationOrBuilder
            public gatewayprotocol.v1.NativeConfigurationOuterClass.RequestPolicy getOperativeEventPolicy() {
                return ((gatewayprotocol.v1.NativeConfigurationOuterClass.NativeConfiguration) this.instance).getOperativeEventPolicy();
            }

            public gatewayprotocol.v1.NativeConfigurationOuterClass.NativeConfiguration.Builder setOperativeEventPolicy(gatewayprotocol.v1.NativeConfigurationOuterClass.RequestPolicy requestPolicy) {
                copyOnWrite();
                ((gatewayprotocol.v1.NativeConfigurationOuterClass.NativeConfiguration) this.instance).setOperativeEventPolicy(requestPolicy);
                return this;
            }

            public gatewayprotocol.v1.NativeConfigurationOuterClass.NativeConfiguration.Builder setOperativeEventPolicy(gatewayprotocol.v1.NativeConfigurationOuterClass.RequestPolicy.Builder builder) {
                copyOnWrite();
                ((gatewayprotocol.v1.NativeConfigurationOuterClass.NativeConfiguration) this.instance).setOperativeEventPolicy(builder.build());
                return this;
            }

            public gatewayprotocol.v1.NativeConfigurationOuterClass.NativeConfiguration.Builder mergeOperativeEventPolicy(gatewayprotocol.v1.NativeConfigurationOuterClass.RequestPolicy requestPolicy) {
                copyOnWrite();
                ((gatewayprotocol.v1.NativeConfigurationOuterClass.NativeConfiguration) this.instance).mergeOperativeEventPolicy(requestPolicy);
                return this;
            }

            public gatewayprotocol.v1.NativeConfigurationOuterClass.NativeConfiguration.Builder clearOperativeEventPolicy() {
                copyOnWrite();
                ((gatewayprotocol.v1.NativeConfigurationOuterClass.NativeConfiguration) this.instance).clearOperativeEventPolicy();
                return this;
            }

            @Override // gatewayprotocol.v1.NativeConfigurationOuterClass.NativeConfigurationOrBuilder
            public boolean hasOtherPolicy() {
                return ((gatewayprotocol.v1.NativeConfigurationOuterClass.NativeConfiguration) this.instance).hasOtherPolicy();
            }

            @Override // gatewayprotocol.v1.NativeConfigurationOuterClass.NativeConfigurationOrBuilder
            public gatewayprotocol.v1.NativeConfigurationOuterClass.RequestPolicy getOtherPolicy() {
                return ((gatewayprotocol.v1.NativeConfigurationOuterClass.NativeConfiguration) this.instance).getOtherPolicy();
            }

            public gatewayprotocol.v1.NativeConfigurationOuterClass.NativeConfiguration.Builder setOtherPolicy(gatewayprotocol.v1.NativeConfigurationOuterClass.RequestPolicy requestPolicy) {
                copyOnWrite();
                ((gatewayprotocol.v1.NativeConfigurationOuterClass.NativeConfiguration) this.instance).setOtherPolicy(requestPolicy);
                return this;
            }

            public gatewayprotocol.v1.NativeConfigurationOuterClass.NativeConfiguration.Builder setOtherPolicy(gatewayprotocol.v1.NativeConfigurationOuterClass.RequestPolicy.Builder builder) {
                copyOnWrite();
                ((gatewayprotocol.v1.NativeConfigurationOuterClass.NativeConfiguration) this.instance).setOtherPolicy(builder.build());
                return this;
            }

            public gatewayprotocol.v1.NativeConfigurationOuterClass.NativeConfiguration.Builder mergeOtherPolicy(gatewayprotocol.v1.NativeConfigurationOuterClass.RequestPolicy requestPolicy) {
                copyOnWrite();
                ((gatewayprotocol.v1.NativeConfigurationOuterClass.NativeConfiguration) this.instance).mergeOtherPolicy(requestPolicy);
                return this;
            }

            public gatewayprotocol.v1.NativeConfigurationOuterClass.NativeConfiguration.Builder clearOtherPolicy() {
                copyOnWrite();
                ((gatewayprotocol.v1.NativeConfigurationOuterClass.NativeConfiguration) this.instance).clearOtherPolicy();
                return this;
            }

            @Override // gatewayprotocol.v1.NativeConfigurationOuterClass.NativeConfigurationOrBuilder
            public boolean hasAdOperations() {
                return ((gatewayprotocol.v1.NativeConfigurationOuterClass.NativeConfiguration) this.instance).hasAdOperations();
            }

            @Override // gatewayprotocol.v1.NativeConfigurationOuterClass.NativeConfigurationOrBuilder
            public gatewayprotocol.v1.NativeConfigurationOuterClass.AdOperationsConfiguration getAdOperations() {
                return ((gatewayprotocol.v1.NativeConfigurationOuterClass.NativeConfiguration) this.instance).getAdOperations();
            }

            public gatewayprotocol.v1.NativeConfigurationOuterClass.NativeConfiguration.Builder setAdOperations(gatewayprotocol.v1.NativeConfigurationOuterClass.AdOperationsConfiguration adOperationsConfiguration) {
                copyOnWrite();
                ((gatewayprotocol.v1.NativeConfigurationOuterClass.NativeConfiguration) this.instance).setAdOperations(adOperationsConfiguration);
                return this;
            }

            public gatewayprotocol.v1.NativeConfigurationOuterClass.NativeConfiguration.Builder setAdOperations(gatewayprotocol.v1.NativeConfigurationOuterClass.AdOperationsConfiguration.Builder builder) {
                copyOnWrite();
                ((gatewayprotocol.v1.NativeConfigurationOuterClass.NativeConfiguration) this.instance).setAdOperations(builder.build());
                return this;
            }

            public gatewayprotocol.v1.NativeConfigurationOuterClass.NativeConfiguration.Builder mergeAdOperations(gatewayprotocol.v1.NativeConfigurationOuterClass.AdOperationsConfiguration adOperationsConfiguration) {
                copyOnWrite();
                ((gatewayprotocol.v1.NativeConfigurationOuterClass.NativeConfiguration) this.instance).mergeAdOperations(adOperationsConfiguration);
                return this;
            }

            public gatewayprotocol.v1.NativeConfigurationOuterClass.NativeConfiguration.Builder clearAdOperations() {
                copyOnWrite();
                ((gatewayprotocol.v1.NativeConfigurationOuterClass.NativeConfiguration) this.instance).clearAdOperations();
                return this;
            }

            @Override // gatewayprotocol.v1.NativeConfigurationOuterClass.NativeConfigurationOrBuilder
            public boolean hasFeatureFlags() {
                return ((gatewayprotocol.v1.NativeConfigurationOuterClass.NativeConfiguration) this.instance).hasFeatureFlags();
            }

            @Override // gatewayprotocol.v1.NativeConfigurationOuterClass.NativeConfigurationOrBuilder
            public gatewayprotocol.v1.NativeConfigurationOuterClass.FeatureFlags getFeatureFlags() {
                return ((gatewayprotocol.v1.NativeConfigurationOuterClass.NativeConfiguration) this.instance).getFeatureFlags();
            }

            public gatewayprotocol.v1.NativeConfigurationOuterClass.NativeConfiguration.Builder setFeatureFlags(gatewayprotocol.v1.NativeConfigurationOuterClass.FeatureFlags featureFlags) {
                copyOnWrite();
                ((gatewayprotocol.v1.NativeConfigurationOuterClass.NativeConfiguration) this.instance).setFeatureFlags(featureFlags);
                return this;
            }

            public gatewayprotocol.v1.NativeConfigurationOuterClass.NativeConfiguration.Builder setFeatureFlags(gatewayprotocol.v1.NativeConfigurationOuterClass.FeatureFlags.Builder builder) {
                copyOnWrite();
                ((gatewayprotocol.v1.NativeConfigurationOuterClass.NativeConfiguration) this.instance).setFeatureFlags(builder.build());
                return this;
            }

            public gatewayprotocol.v1.NativeConfigurationOuterClass.NativeConfiguration.Builder mergeFeatureFlags(gatewayprotocol.v1.NativeConfigurationOuterClass.FeatureFlags featureFlags) {
                copyOnWrite();
                ((gatewayprotocol.v1.NativeConfigurationOuterClass.NativeConfiguration) this.instance).mergeFeatureFlags(featureFlags);
                return this;
            }

            public gatewayprotocol.v1.NativeConfigurationOuterClass.NativeConfiguration.Builder clearFeatureFlags() {
                copyOnWrite();
                ((gatewayprotocol.v1.NativeConfigurationOuterClass.NativeConfiguration) this.instance).clearFeatureFlags();
                return this;
            }

            @Override // gatewayprotocol.v1.NativeConfigurationOuterClass.NativeConfigurationOrBuilder
            public boolean getEnableIapEvent() {
                return ((gatewayprotocol.v1.NativeConfigurationOuterClass.NativeConfiguration) this.instance).getEnableIapEvent();
            }

            public gatewayprotocol.v1.NativeConfigurationOuterClass.NativeConfiguration.Builder setEnableIapEvent(boolean z) {
                copyOnWrite();
                ((gatewayprotocol.v1.NativeConfigurationOuterClass.NativeConfiguration) this.instance).setEnableIapEvent(z);
                return this;
            }

            public gatewayprotocol.v1.NativeConfigurationOuterClass.NativeConfiguration.Builder clearEnableIapEvent() {
                copyOnWrite();
                ((gatewayprotocol.v1.NativeConfigurationOuterClass.NativeConfiguration) this.instance).clearEnableIapEvent();
                return this;
            }

            @Override // gatewayprotocol.v1.NativeConfigurationOuterClass.NativeConfigurationOrBuilder
            public boolean getEnableOm() {
                return ((gatewayprotocol.v1.NativeConfigurationOuterClass.NativeConfiguration) this.instance).getEnableOm();
            }

            public gatewayprotocol.v1.NativeConfigurationOuterClass.NativeConfiguration.Builder setEnableOm(boolean z) {
                copyOnWrite();
                ((gatewayprotocol.v1.NativeConfigurationOuterClass.NativeConfiguration) this.instance).setEnableOm(z);
                return this;
            }

            public gatewayprotocol.v1.NativeConfigurationOuterClass.NativeConfiguration.Builder clearEnableOm() {
                copyOnWrite();
                ((gatewayprotocol.v1.NativeConfigurationOuterClass.NativeConfiguration) this.instance).clearEnableOm();
                return this;
            }

            @Override // gatewayprotocol.v1.NativeConfigurationOuterClass.NativeConfigurationOrBuilder
            public java.util.List<java.lang.String> getAdditionalStorePackagesList() {
                return java.util.Collections.unmodifiableList(((gatewayprotocol.v1.NativeConfigurationOuterClass.NativeConfiguration) this.instance).getAdditionalStorePackagesList());
            }

            @Override // gatewayprotocol.v1.NativeConfigurationOuterClass.NativeConfigurationOrBuilder
            public int getAdditionalStorePackagesCount() {
                return ((gatewayprotocol.v1.NativeConfigurationOuterClass.NativeConfiguration) this.instance).getAdditionalStorePackagesCount();
            }

            @Override // gatewayprotocol.v1.NativeConfigurationOuterClass.NativeConfigurationOrBuilder
            public java.lang.String getAdditionalStorePackages(int i) {
                return ((gatewayprotocol.v1.NativeConfigurationOuterClass.NativeConfiguration) this.instance).getAdditionalStorePackages(i);
            }

            @Override // gatewayprotocol.v1.NativeConfigurationOuterClass.NativeConfigurationOrBuilder
            public com.google.protobuf.ByteString getAdditionalStorePackagesBytes(int i) {
                return ((gatewayprotocol.v1.NativeConfigurationOuterClass.NativeConfiguration) this.instance).getAdditionalStorePackagesBytes(i);
            }

            public gatewayprotocol.v1.NativeConfigurationOuterClass.NativeConfiguration.Builder setAdditionalStorePackages(int i, java.lang.String str) {
                copyOnWrite();
                ((gatewayprotocol.v1.NativeConfigurationOuterClass.NativeConfiguration) this.instance).setAdditionalStorePackages(i, str);
                return this;
            }

            public gatewayprotocol.v1.NativeConfigurationOuterClass.NativeConfiguration.Builder addAdditionalStorePackages(java.lang.String str) {
                copyOnWrite();
                ((gatewayprotocol.v1.NativeConfigurationOuterClass.NativeConfiguration) this.instance).addAdditionalStorePackages(str);
                return this;
            }

            public gatewayprotocol.v1.NativeConfigurationOuterClass.NativeConfiguration.Builder addAllAdditionalStorePackages(java.lang.Iterable<java.lang.String> iterable) {
                copyOnWrite();
                ((gatewayprotocol.v1.NativeConfigurationOuterClass.NativeConfiguration) this.instance).addAllAdditionalStorePackages(iterable);
                return this;
            }

            public gatewayprotocol.v1.NativeConfigurationOuterClass.NativeConfiguration.Builder clearAdditionalStorePackages() {
                copyOnWrite();
                ((gatewayprotocol.v1.NativeConfigurationOuterClass.NativeConfiguration) this.instance).clearAdditionalStorePackages();
                return this;
            }

            public gatewayprotocol.v1.NativeConfigurationOuterClass.NativeConfiguration.Builder addAdditionalStorePackagesBytes(com.google.protobuf.ByteString byteString) {
                copyOnWrite();
                ((gatewayprotocol.v1.NativeConfigurationOuterClass.NativeConfiguration) this.instance).addAdditionalStorePackagesBytes(byteString);
                return this;
            }

            @Override // gatewayprotocol.v1.NativeConfigurationOuterClass.NativeConfigurationOrBuilder
            public boolean hasCachedAssetsConfiguration() {
                return ((gatewayprotocol.v1.NativeConfigurationOuterClass.NativeConfiguration) this.instance).hasCachedAssetsConfiguration();
            }

            @Override // gatewayprotocol.v1.NativeConfigurationOuterClass.NativeConfigurationOrBuilder
            public gatewayprotocol.v1.NativeConfigurationOuterClass.CachedAssetsConfiguration getCachedAssetsConfiguration() {
                return ((gatewayprotocol.v1.NativeConfigurationOuterClass.NativeConfiguration) this.instance).getCachedAssetsConfiguration();
            }

            public gatewayprotocol.v1.NativeConfigurationOuterClass.NativeConfiguration.Builder setCachedAssetsConfiguration(gatewayprotocol.v1.NativeConfigurationOuterClass.CachedAssetsConfiguration cachedAssetsConfiguration) {
                copyOnWrite();
                ((gatewayprotocol.v1.NativeConfigurationOuterClass.NativeConfiguration) this.instance).setCachedAssetsConfiguration(cachedAssetsConfiguration);
                return this;
            }

            public gatewayprotocol.v1.NativeConfigurationOuterClass.NativeConfiguration.Builder setCachedAssetsConfiguration(gatewayprotocol.v1.NativeConfigurationOuterClass.CachedAssetsConfiguration.Builder builder) {
                copyOnWrite();
                ((gatewayprotocol.v1.NativeConfigurationOuterClass.NativeConfiguration) this.instance).setCachedAssetsConfiguration(builder.build());
                return this;
            }

            public gatewayprotocol.v1.NativeConfigurationOuterClass.NativeConfiguration.Builder mergeCachedAssetsConfiguration(gatewayprotocol.v1.NativeConfigurationOuterClass.CachedAssetsConfiguration cachedAssetsConfiguration) {
                copyOnWrite();
                ((gatewayprotocol.v1.NativeConfigurationOuterClass.NativeConfiguration) this.instance).mergeCachedAssetsConfiguration(cachedAssetsConfiguration);
                return this;
            }

            public gatewayprotocol.v1.NativeConfigurationOuterClass.NativeConfiguration.Builder clearCachedAssetsConfiguration() {
                copyOnWrite();
                ((gatewayprotocol.v1.NativeConfigurationOuterClass.NativeConfiguration) this.instance).clearCachedAssetsConfiguration();
                return this;
            }

            @Override // gatewayprotocol.v1.NativeConfigurationOuterClass.NativeConfigurationOrBuilder
            public java.util.List<com.google.protobuf.ByteString> getObservableAndroidActivitiesList() {
                return java.util.Collections.unmodifiableList(((gatewayprotocol.v1.NativeConfigurationOuterClass.NativeConfiguration) this.instance).getObservableAndroidActivitiesList());
            }

            @Override // gatewayprotocol.v1.NativeConfigurationOuterClass.NativeConfigurationOrBuilder
            public int getObservableAndroidActivitiesCount() {
                return ((gatewayprotocol.v1.NativeConfigurationOuterClass.NativeConfiguration) this.instance).getObservableAndroidActivitiesCount();
            }

            @Override // gatewayprotocol.v1.NativeConfigurationOuterClass.NativeConfigurationOrBuilder
            public com.google.protobuf.ByteString getObservableAndroidActivities(int i) {
                return ((gatewayprotocol.v1.NativeConfigurationOuterClass.NativeConfiguration) this.instance).getObservableAndroidActivities(i);
            }

            public gatewayprotocol.v1.NativeConfigurationOuterClass.NativeConfiguration.Builder setObservableAndroidActivities(int i, com.google.protobuf.ByteString byteString) {
                copyOnWrite();
                ((gatewayprotocol.v1.NativeConfigurationOuterClass.NativeConfiguration) this.instance).setObservableAndroidActivities(i, byteString);
                return this;
            }

            public gatewayprotocol.v1.NativeConfigurationOuterClass.NativeConfiguration.Builder addObservableAndroidActivities(com.google.protobuf.ByteString byteString) {
                copyOnWrite();
                ((gatewayprotocol.v1.NativeConfigurationOuterClass.NativeConfiguration) this.instance).addObservableAndroidActivities(byteString);
                return this;
            }

            public gatewayprotocol.v1.NativeConfigurationOuterClass.NativeConfiguration.Builder addAllObservableAndroidActivities(java.lang.Iterable<? extends com.google.protobuf.ByteString> iterable) {
                copyOnWrite();
                ((gatewayprotocol.v1.NativeConfigurationOuterClass.NativeConfiguration) this.instance).addAllObservableAndroidActivities(iterable);
                return this;
            }

            public gatewayprotocol.v1.NativeConfigurationOuterClass.NativeConfiguration.Builder clearObservableAndroidActivities() {
                copyOnWrite();
                ((gatewayprotocol.v1.NativeConfigurationOuterClass.NativeConfiguration) this.instance).clearObservableAndroidActivities();
                return this;
            }

            @Override // gatewayprotocol.v1.NativeConfigurationOuterClass.NativeConfigurationOrBuilder
            public boolean hasCachedWebviewFilesConfiguration() {
                return ((gatewayprotocol.v1.NativeConfigurationOuterClass.NativeConfiguration) this.instance).hasCachedWebviewFilesConfiguration();
            }

            @Override // gatewayprotocol.v1.NativeConfigurationOuterClass.NativeConfigurationOrBuilder
            public gatewayprotocol.v1.NativeConfigurationOuterClass.CachedAssetsConfiguration getCachedWebviewFilesConfiguration() {
                return ((gatewayprotocol.v1.NativeConfigurationOuterClass.NativeConfiguration) this.instance).getCachedWebviewFilesConfiguration();
            }

            public gatewayprotocol.v1.NativeConfigurationOuterClass.NativeConfiguration.Builder setCachedWebviewFilesConfiguration(gatewayprotocol.v1.NativeConfigurationOuterClass.CachedAssetsConfiguration cachedAssetsConfiguration) {
                copyOnWrite();
                ((gatewayprotocol.v1.NativeConfigurationOuterClass.NativeConfiguration) this.instance).setCachedWebviewFilesConfiguration(cachedAssetsConfiguration);
                return this;
            }

            public gatewayprotocol.v1.NativeConfigurationOuterClass.NativeConfiguration.Builder setCachedWebviewFilesConfiguration(gatewayprotocol.v1.NativeConfigurationOuterClass.CachedAssetsConfiguration.Builder builder) {
                copyOnWrite();
                ((gatewayprotocol.v1.NativeConfigurationOuterClass.NativeConfiguration) this.instance).setCachedWebviewFilesConfiguration(builder.build());
                return this;
            }

            public gatewayprotocol.v1.NativeConfigurationOuterClass.NativeConfiguration.Builder mergeCachedWebviewFilesConfiguration(gatewayprotocol.v1.NativeConfigurationOuterClass.CachedAssetsConfiguration cachedAssetsConfiguration) {
                copyOnWrite();
                ((gatewayprotocol.v1.NativeConfigurationOuterClass.NativeConfiguration) this.instance).mergeCachedWebviewFilesConfiguration(cachedAssetsConfiguration);
                return this;
            }

            public gatewayprotocol.v1.NativeConfigurationOuterClass.NativeConfiguration.Builder clearCachedWebviewFilesConfiguration() {
                copyOnWrite();
                ((gatewayprotocol.v1.NativeConfigurationOuterClass.NativeConfiguration) this.instance).clearCachedWebviewFilesConfiguration();
                return this;
            }

            @Override // gatewayprotocol.v1.NativeConfigurationOuterClass.NativeConfigurationOrBuilder
            public int getDefaultShowCompletionStateValue() {
                return ((gatewayprotocol.v1.NativeConfigurationOuterClass.NativeConfiguration) this.instance).getDefaultShowCompletionStateValue();
            }

            public gatewayprotocol.v1.NativeConfigurationOuterClass.NativeConfiguration.Builder setDefaultShowCompletionStateValue(int i) {
                copyOnWrite();
                ((gatewayprotocol.v1.NativeConfigurationOuterClass.NativeConfiguration) this.instance).setDefaultShowCompletionStateValue(i);
                return this;
            }

            @Override // gatewayprotocol.v1.NativeConfigurationOuterClass.NativeConfigurationOrBuilder
            public gatewayprotocol.v1.NativeConfigurationOuterClass.ShowCompletionState getDefaultShowCompletionState() {
                return ((gatewayprotocol.v1.NativeConfigurationOuterClass.NativeConfiguration) this.instance).getDefaultShowCompletionState();
            }

            public gatewayprotocol.v1.NativeConfigurationOuterClass.NativeConfiguration.Builder setDefaultShowCompletionState(gatewayprotocol.v1.NativeConfigurationOuterClass.ShowCompletionState showCompletionState) {
                copyOnWrite();
                ((gatewayprotocol.v1.NativeConfigurationOuterClass.NativeConfiguration) this.instance).setDefaultShowCompletionState(showCompletionState);
                return this;
            }

            public gatewayprotocol.v1.NativeConfigurationOuterClass.NativeConfiguration.Builder clearDefaultShowCompletionState() {
                copyOnWrite();
                ((gatewayprotocol.v1.NativeConfigurationOuterClass.NativeConfiguration) this.instance).clearDefaultShowCompletionState();
                return this;
            }

            @Override // gatewayprotocol.v1.NativeConfigurationOuterClass.NativeConfigurationOrBuilder
            public boolean hasDownloadPolicy() {
                return ((gatewayprotocol.v1.NativeConfigurationOuterClass.NativeConfiguration) this.instance).hasDownloadPolicy();
            }

            @Override // gatewayprotocol.v1.NativeConfigurationOuterClass.NativeConfigurationOrBuilder
            public gatewayprotocol.v1.NativeConfigurationOuterClass.RequestPolicy getDownloadPolicy() {
                return ((gatewayprotocol.v1.NativeConfigurationOuterClass.NativeConfiguration) this.instance).getDownloadPolicy();
            }

            public gatewayprotocol.v1.NativeConfigurationOuterClass.NativeConfiguration.Builder setDownloadPolicy(gatewayprotocol.v1.NativeConfigurationOuterClass.RequestPolicy requestPolicy) {
                copyOnWrite();
                ((gatewayprotocol.v1.NativeConfigurationOuterClass.NativeConfiguration) this.instance).setDownloadPolicy(requestPolicy);
                return this;
            }

            public gatewayprotocol.v1.NativeConfigurationOuterClass.NativeConfiguration.Builder setDownloadPolicy(gatewayprotocol.v1.NativeConfigurationOuterClass.RequestPolicy.Builder builder) {
                copyOnWrite();
                ((gatewayprotocol.v1.NativeConfigurationOuterClass.NativeConfiguration) this.instance).setDownloadPolicy(builder.build());
                return this;
            }

            public gatewayprotocol.v1.NativeConfigurationOuterClass.NativeConfiguration.Builder mergeDownloadPolicy(gatewayprotocol.v1.NativeConfigurationOuterClass.RequestPolicy requestPolicy) {
                copyOnWrite();
                ((gatewayprotocol.v1.NativeConfigurationOuterClass.NativeConfiguration) this.instance).mergeDownloadPolicy(requestPolicy);
                return this;
            }

            public gatewayprotocol.v1.NativeConfigurationOuterClass.NativeConfiguration.Builder clearDownloadPolicy() {
                copyOnWrite();
                ((gatewayprotocol.v1.NativeConfigurationOuterClass.NativeConfiguration) this.instance).clearDownloadPolicy();
                return this;
            }

            @Override // gatewayprotocol.v1.NativeConfigurationOuterClass.NativeConfigurationOrBuilder
            public boolean hasDebugSettings() {
                return ((gatewayprotocol.v1.NativeConfigurationOuterClass.NativeConfiguration) this.instance).hasDebugSettings();
            }

            @Override // gatewayprotocol.v1.NativeConfigurationOuterClass.NativeConfigurationOrBuilder
            public gatewayprotocol.v1.NativeConfigurationOuterClass.DebugSettings getDebugSettings() {
                return ((gatewayprotocol.v1.NativeConfigurationOuterClass.NativeConfiguration) this.instance).getDebugSettings();
            }

            public gatewayprotocol.v1.NativeConfigurationOuterClass.NativeConfiguration.Builder setDebugSettings(gatewayprotocol.v1.NativeConfigurationOuterClass.DebugSettings debugSettings) {
                copyOnWrite();
                ((gatewayprotocol.v1.NativeConfigurationOuterClass.NativeConfiguration) this.instance).setDebugSettings(debugSettings);
                return this;
            }

            public gatewayprotocol.v1.NativeConfigurationOuterClass.NativeConfiguration.Builder setDebugSettings(gatewayprotocol.v1.NativeConfigurationOuterClass.DebugSettings.Builder builder) {
                copyOnWrite();
                ((gatewayprotocol.v1.NativeConfigurationOuterClass.NativeConfiguration) this.instance).setDebugSettings(builder.build());
                return this;
            }

            public gatewayprotocol.v1.NativeConfigurationOuterClass.NativeConfiguration.Builder mergeDebugSettings(gatewayprotocol.v1.NativeConfigurationOuterClass.DebugSettings debugSettings) {
                copyOnWrite();
                ((gatewayprotocol.v1.NativeConfigurationOuterClass.NativeConfiguration) this.instance).mergeDebugSettings(debugSettings);
                return this;
            }

            public gatewayprotocol.v1.NativeConfigurationOuterClass.NativeConfiguration.Builder clearDebugSettings() {
                copyOnWrite();
                ((gatewayprotocol.v1.NativeConfigurationOuterClass.NativeConfiguration) this.instance).clearDebugSettings();
                return this;
            }

            @Override // gatewayprotocol.v1.NativeConfigurationOuterClass.NativeConfigurationOrBuilder
            public int getMaxExtrasSizeKb() {
                return ((gatewayprotocol.v1.NativeConfigurationOuterClass.NativeConfiguration) this.instance).getMaxExtrasSizeKb();
            }

            public gatewayprotocol.v1.NativeConfigurationOuterClass.NativeConfiguration.Builder setMaxExtrasSizeKb(int i) {
                copyOnWrite();
                ((gatewayprotocol.v1.NativeConfigurationOuterClass.NativeConfiguration) this.instance).setMaxExtrasSizeKb(i);
                return this;
            }

            public gatewayprotocol.v1.NativeConfigurationOuterClass.NativeConfiguration.Builder clearMaxExtrasSizeKb() {
                copyOnWrite();
                ((gatewayprotocol.v1.NativeConfigurationOuterClass.NativeConfiguration) this.instance).clearMaxExtrasSizeKb();
                return this;
            }
        }

        @Override // com.google.protobuf.GeneratedMessageLite
        protected final java.lang.Object dynamicMethod(com.google.protobuf.GeneratedMessageLite.MethodToInvoke methodToInvoke, java.lang.Object obj, java.lang.Object obj2) {
            gatewayprotocol.v1.NativeConfigurationOuterClass.AnonymousClass1 anonymousClass1 = null;
            switch (gatewayprotocol.v1.NativeConfigurationOuterClass.AnonymousClass1.$SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke[methodToInvoke.ordinal()]) {
                case 1:
                    return new gatewayprotocol.v1.NativeConfigurationOuterClass.NativeConfiguration();
                case 2:
                    return new gatewayprotocol.v1.NativeConfigurationOuterClass.NativeConfiguration.Builder(anonymousClass1);
                case 3:
                    return newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0011\u0000\u0001\u0001\u0011\u0011\u0000\u0002\u0000\u0001ဉ\u0000\u0002ဉ\u0001\u0003ဉ\u0002\u0004ဉ\u0003\u0005ဉ\u0004\u0006ဉ\u0005\u0007ဉ\u0006\b\u0007\t\u0007\nȚ\u000bဉ\u0007\f\u001c\rဉ\b\u000e\f\u000fဉ\t\u0010ဉ\n\u0011\u0004", new java.lang.Object[]{"bitField0_", "diagnosticEvents_", "initPolicy_", "adPolicy_", "operativeEventPolicy_", "otherPolicy_", "adOperations_", "featureFlags_", "enableIapEvent_", "enableOm_", "additionalStorePackages_", "cachedAssetsConfiguration_", "observableAndroidActivities_", "cachedWebviewFilesConfiguration_", "defaultShowCompletionState_", "downloadPolicy_", "debugSettings_", "maxExtrasSizeKb_"});
                case 4:
                    return DEFAULT_INSTANCE;
                case 5:
                    com.google.protobuf.Parser<gatewayprotocol.v1.NativeConfigurationOuterClass.NativeConfiguration> parser = PARSER;
                    if (parser == null) {
                        synchronized (gatewayprotocol.v1.NativeConfigurationOuterClass.NativeConfiguration.class) {
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
            gatewayprotocol.v1.NativeConfigurationOuterClass.NativeConfiguration nativeConfiguration = new gatewayprotocol.v1.NativeConfigurationOuterClass.NativeConfiguration();
            DEFAULT_INSTANCE = nativeConfiguration;
            com.google.protobuf.GeneratedMessageLite.registerDefaultInstance(gatewayprotocol.v1.NativeConfigurationOuterClass.NativeConfiguration.class, nativeConfiguration);
        }

        public static gatewayprotocol.v1.NativeConfigurationOuterClass.NativeConfiguration getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static com.google.protobuf.Parser<gatewayprotocol.v1.NativeConfigurationOuterClass.NativeConfiguration> parser() {
            return DEFAULT_INSTANCE.getParserForType();
        }
    }

    public static final class FeatureFlags extends com.google.protobuf.GeneratedMessageLite<gatewayprotocol.v1.NativeConfigurationOuterClass.FeatureFlags, gatewayprotocol.v1.NativeConfigurationOuterClass.FeatureFlags.Builder> implements gatewayprotocol.v1.NativeConfigurationOuterClass.FeatureFlagsOrBuilder {
        public static final int APP_SHEET_BUG_CHECK_ENABLED_FIELD_NUMBER = 4;
        public static final int BOLD_SDK_NEXT_SESSION_ENABLED_FIELD_NUMBER = 3;
        private static final gatewayprotocol.v1.NativeConfigurationOuterClass.FeatureFlags DEFAULT_INSTANCE;
        public static final int OPENGL_GPU_ENABLED_FIELD_NUMBER = 1;
        public static final int OPPORTUNITY_ID_PLACEMENT_VALIDATION_FIELD_NUMBER = 2;
        private static volatile com.google.protobuf.Parser<gatewayprotocol.v1.NativeConfigurationOuterClass.FeatureFlags> PARSER = null;
        public static final int RECOVER_TERMINATED_WEBVIEWS_FIELD_NUMBER = 5;
        public static final int SHOULD_HANDLE_WEBVIEW_CACHING_FIELD_NUMBER = 6;
        public static final int SHOULD_SEND_IAP_HISTORY_FIELD_NUMBER = 7;
        private boolean appSheetBugCheckEnabled_;
        private boolean boldSdkNextSessionEnabled_;
        private boolean openglGpuEnabled_;
        private boolean opportunityIdPlacementValidation_;
        private boolean recoverTerminatedWebviews_;
        private boolean shouldHandleWebviewCaching_;
        private boolean shouldSendIapHistory_;

        private FeatureFlags() {
        }

        @Override // gatewayprotocol.v1.NativeConfigurationOuterClass.FeatureFlagsOrBuilder
        public boolean getOpenglGpuEnabled() {
            return this.openglGpuEnabled_;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setOpenglGpuEnabled(boolean z) {
            this.openglGpuEnabled_ = z;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearOpenglGpuEnabled() {
            this.openglGpuEnabled_ = false;
        }

        @Override // gatewayprotocol.v1.NativeConfigurationOuterClass.FeatureFlagsOrBuilder
        public boolean getOpportunityIdPlacementValidation() {
            return this.opportunityIdPlacementValidation_;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setOpportunityIdPlacementValidation(boolean z) {
            this.opportunityIdPlacementValidation_ = z;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearOpportunityIdPlacementValidation() {
            this.opportunityIdPlacementValidation_ = false;
        }

        @Override // gatewayprotocol.v1.NativeConfigurationOuterClass.FeatureFlagsOrBuilder
        public boolean getBoldSdkNextSessionEnabled() {
            return this.boldSdkNextSessionEnabled_;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setBoldSdkNextSessionEnabled(boolean z) {
            this.boldSdkNextSessionEnabled_ = z;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearBoldSdkNextSessionEnabled() {
            this.boldSdkNextSessionEnabled_ = false;
        }

        @Override // gatewayprotocol.v1.NativeConfigurationOuterClass.FeatureFlagsOrBuilder
        public boolean getAppSheetBugCheckEnabled() {
            return this.appSheetBugCheckEnabled_;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setAppSheetBugCheckEnabled(boolean z) {
            this.appSheetBugCheckEnabled_ = z;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearAppSheetBugCheckEnabled() {
            this.appSheetBugCheckEnabled_ = false;
        }

        @Override // gatewayprotocol.v1.NativeConfigurationOuterClass.FeatureFlagsOrBuilder
        public boolean getRecoverTerminatedWebviews() {
            return this.recoverTerminatedWebviews_;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setRecoverTerminatedWebviews(boolean z) {
            this.recoverTerminatedWebviews_ = z;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearRecoverTerminatedWebviews() {
            this.recoverTerminatedWebviews_ = false;
        }

        @Override // gatewayprotocol.v1.NativeConfigurationOuterClass.FeatureFlagsOrBuilder
        public boolean getShouldHandleWebviewCaching() {
            return this.shouldHandleWebviewCaching_;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setShouldHandleWebviewCaching(boolean z) {
            this.shouldHandleWebviewCaching_ = z;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearShouldHandleWebviewCaching() {
            this.shouldHandleWebviewCaching_ = false;
        }

        @Override // gatewayprotocol.v1.NativeConfigurationOuterClass.FeatureFlagsOrBuilder
        public boolean getShouldSendIapHistory() {
            return this.shouldSendIapHistory_;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setShouldSendIapHistory(boolean z) {
            this.shouldSendIapHistory_ = z;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearShouldSendIapHistory() {
            this.shouldSendIapHistory_ = false;
        }

        public static gatewayprotocol.v1.NativeConfigurationOuterClass.FeatureFlags parseFrom(java.nio.ByteBuffer byteBuffer) throws com.google.protobuf.InvalidProtocolBufferException {
            return (gatewayprotocol.v1.NativeConfigurationOuterClass.FeatureFlags) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
        }

        public static gatewayprotocol.v1.NativeConfigurationOuterClass.FeatureFlags parseFrom(java.nio.ByteBuffer byteBuffer, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) throws com.google.protobuf.InvalidProtocolBufferException {
            return (gatewayprotocol.v1.NativeConfigurationOuterClass.FeatureFlags) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
        }

        public static gatewayprotocol.v1.NativeConfigurationOuterClass.FeatureFlags parseFrom(com.google.protobuf.ByteString byteString) throws com.google.protobuf.InvalidProtocolBufferException {
            return (gatewayprotocol.v1.NativeConfigurationOuterClass.FeatureFlags) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
        }

        public static gatewayprotocol.v1.NativeConfigurationOuterClass.FeatureFlags parseFrom(com.google.protobuf.ByteString byteString, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) throws com.google.protobuf.InvalidProtocolBufferException {
            return (gatewayprotocol.v1.NativeConfigurationOuterClass.FeatureFlags) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
        }

        public static gatewayprotocol.v1.NativeConfigurationOuterClass.FeatureFlags parseFrom(byte[] bArr) throws com.google.protobuf.InvalidProtocolBufferException {
            return (gatewayprotocol.v1.NativeConfigurationOuterClass.FeatureFlags) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
        }

        public static gatewayprotocol.v1.NativeConfigurationOuterClass.FeatureFlags parseFrom(byte[] bArr, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) throws com.google.protobuf.InvalidProtocolBufferException {
            return (gatewayprotocol.v1.NativeConfigurationOuterClass.FeatureFlags) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
        }

        public static gatewayprotocol.v1.NativeConfigurationOuterClass.FeatureFlags parseFrom(java.io.InputStream inputStream) throws java.io.IOException {
            return (gatewayprotocol.v1.NativeConfigurationOuterClass.FeatureFlags) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static gatewayprotocol.v1.NativeConfigurationOuterClass.FeatureFlags parseFrom(java.io.InputStream inputStream, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) throws java.io.IOException {
            return (gatewayprotocol.v1.NativeConfigurationOuterClass.FeatureFlags) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
        }

        public static gatewayprotocol.v1.NativeConfigurationOuterClass.FeatureFlags parseDelimitedFrom(java.io.InputStream inputStream) throws java.io.IOException {
            return (gatewayprotocol.v1.NativeConfigurationOuterClass.FeatureFlags) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static gatewayprotocol.v1.NativeConfigurationOuterClass.FeatureFlags parseDelimitedFrom(java.io.InputStream inputStream, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) throws java.io.IOException {
            return (gatewayprotocol.v1.NativeConfigurationOuterClass.FeatureFlags) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
        }

        public static gatewayprotocol.v1.NativeConfigurationOuterClass.FeatureFlags parseFrom(com.google.protobuf.CodedInputStream codedInputStream) throws java.io.IOException {
            return (gatewayprotocol.v1.NativeConfigurationOuterClass.FeatureFlags) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
        }

        public static gatewayprotocol.v1.NativeConfigurationOuterClass.FeatureFlags parseFrom(com.google.protobuf.CodedInputStream codedInputStream, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) throws java.io.IOException {
            return (gatewayprotocol.v1.NativeConfigurationOuterClass.FeatureFlags) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
        }

        public static gatewayprotocol.v1.NativeConfigurationOuterClass.FeatureFlags.Builder newBuilder() {
            return DEFAULT_INSTANCE.createBuilder();
        }

        public static gatewayprotocol.v1.NativeConfigurationOuterClass.FeatureFlags.Builder newBuilder(gatewayprotocol.v1.NativeConfigurationOuterClass.FeatureFlags featureFlags) {
            return DEFAULT_INSTANCE.createBuilder(featureFlags);
        }

        public static final class Builder extends com.google.protobuf.GeneratedMessageLite.Builder<gatewayprotocol.v1.NativeConfigurationOuterClass.FeatureFlags, gatewayprotocol.v1.NativeConfigurationOuterClass.FeatureFlags.Builder> implements gatewayprotocol.v1.NativeConfigurationOuterClass.FeatureFlagsOrBuilder {
            /* synthetic */ Builder(gatewayprotocol.v1.NativeConfigurationOuterClass.AnonymousClass1 anonymousClass1) {
                this();
            }

            private Builder() {
                super(gatewayprotocol.v1.NativeConfigurationOuterClass.FeatureFlags.DEFAULT_INSTANCE);
            }

            @Override // gatewayprotocol.v1.NativeConfigurationOuterClass.FeatureFlagsOrBuilder
            public boolean getOpenglGpuEnabled() {
                return ((gatewayprotocol.v1.NativeConfigurationOuterClass.FeatureFlags) this.instance).getOpenglGpuEnabled();
            }

            public gatewayprotocol.v1.NativeConfigurationOuterClass.FeatureFlags.Builder setOpenglGpuEnabled(boolean z) {
                copyOnWrite();
                ((gatewayprotocol.v1.NativeConfigurationOuterClass.FeatureFlags) this.instance).setOpenglGpuEnabled(z);
                return this;
            }

            public gatewayprotocol.v1.NativeConfigurationOuterClass.FeatureFlags.Builder clearOpenglGpuEnabled() {
                copyOnWrite();
                ((gatewayprotocol.v1.NativeConfigurationOuterClass.FeatureFlags) this.instance).clearOpenglGpuEnabled();
                return this;
            }

            @Override // gatewayprotocol.v1.NativeConfigurationOuterClass.FeatureFlagsOrBuilder
            public boolean getOpportunityIdPlacementValidation() {
                return ((gatewayprotocol.v1.NativeConfigurationOuterClass.FeatureFlags) this.instance).getOpportunityIdPlacementValidation();
            }

            public gatewayprotocol.v1.NativeConfigurationOuterClass.FeatureFlags.Builder setOpportunityIdPlacementValidation(boolean z) {
                copyOnWrite();
                ((gatewayprotocol.v1.NativeConfigurationOuterClass.FeatureFlags) this.instance).setOpportunityIdPlacementValidation(z);
                return this;
            }

            public gatewayprotocol.v1.NativeConfigurationOuterClass.FeatureFlags.Builder clearOpportunityIdPlacementValidation() {
                copyOnWrite();
                ((gatewayprotocol.v1.NativeConfigurationOuterClass.FeatureFlags) this.instance).clearOpportunityIdPlacementValidation();
                return this;
            }

            @Override // gatewayprotocol.v1.NativeConfigurationOuterClass.FeatureFlagsOrBuilder
            public boolean getBoldSdkNextSessionEnabled() {
                return ((gatewayprotocol.v1.NativeConfigurationOuterClass.FeatureFlags) this.instance).getBoldSdkNextSessionEnabled();
            }

            public gatewayprotocol.v1.NativeConfigurationOuterClass.FeatureFlags.Builder setBoldSdkNextSessionEnabled(boolean z) {
                copyOnWrite();
                ((gatewayprotocol.v1.NativeConfigurationOuterClass.FeatureFlags) this.instance).setBoldSdkNextSessionEnabled(z);
                return this;
            }

            public gatewayprotocol.v1.NativeConfigurationOuterClass.FeatureFlags.Builder clearBoldSdkNextSessionEnabled() {
                copyOnWrite();
                ((gatewayprotocol.v1.NativeConfigurationOuterClass.FeatureFlags) this.instance).clearBoldSdkNextSessionEnabled();
                return this;
            }

            @Override // gatewayprotocol.v1.NativeConfigurationOuterClass.FeatureFlagsOrBuilder
            public boolean getAppSheetBugCheckEnabled() {
                return ((gatewayprotocol.v1.NativeConfigurationOuterClass.FeatureFlags) this.instance).getAppSheetBugCheckEnabled();
            }

            public gatewayprotocol.v1.NativeConfigurationOuterClass.FeatureFlags.Builder setAppSheetBugCheckEnabled(boolean z) {
                copyOnWrite();
                ((gatewayprotocol.v1.NativeConfigurationOuterClass.FeatureFlags) this.instance).setAppSheetBugCheckEnabled(z);
                return this;
            }

            public gatewayprotocol.v1.NativeConfigurationOuterClass.FeatureFlags.Builder clearAppSheetBugCheckEnabled() {
                copyOnWrite();
                ((gatewayprotocol.v1.NativeConfigurationOuterClass.FeatureFlags) this.instance).clearAppSheetBugCheckEnabled();
                return this;
            }

            @Override // gatewayprotocol.v1.NativeConfigurationOuterClass.FeatureFlagsOrBuilder
            public boolean getRecoverTerminatedWebviews() {
                return ((gatewayprotocol.v1.NativeConfigurationOuterClass.FeatureFlags) this.instance).getRecoverTerminatedWebviews();
            }

            public gatewayprotocol.v1.NativeConfigurationOuterClass.FeatureFlags.Builder setRecoverTerminatedWebviews(boolean z) {
                copyOnWrite();
                ((gatewayprotocol.v1.NativeConfigurationOuterClass.FeatureFlags) this.instance).setRecoverTerminatedWebviews(z);
                return this;
            }

            public gatewayprotocol.v1.NativeConfigurationOuterClass.FeatureFlags.Builder clearRecoverTerminatedWebviews() {
                copyOnWrite();
                ((gatewayprotocol.v1.NativeConfigurationOuterClass.FeatureFlags) this.instance).clearRecoverTerminatedWebviews();
                return this;
            }

            @Override // gatewayprotocol.v1.NativeConfigurationOuterClass.FeatureFlagsOrBuilder
            public boolean getShouldHandleWebviewCaching() {
                return ((gatewayprotocol.v1.NativeConfigurationOuterClass.FeatureFlags) this.instance).getShouldHandleWebviewCaching();
            }

            public gatewayprotocol.v1.NativeConfigurationOuterClass.FeatureFlags.Builder setShouldHandleWebviewCaching(boolean z) {
                copyOnWrite();
                ((gatewayprotocol.v1.NativeConfigurationOuterClass.FeatureFlags) this.instance).setShouldHandleWebviewCaching(z);
                return this;
            }

            public gatewayprotocol.v1.NativeConfigurationOuterClass.FeatureFlags.Builder clearShouldHandleWebviewCaching() {
                copyOnWrite();
                ((gatewayprotocol.v1.NativeConfigurationOuterClass.FeatureFlags) this.instance).clearShouldHandleWebviewCaching();
                return this;
            }

            @Override // gatewayprotocol.v1.NativeConfigurationOuterClass.FeatureFlagsOrBuilder
            public boolean getShouldSendIapHistory() {
                return ((gatewayprotocol.v1.NativeConfigurationOuterClass.FeatureFlags) this.instance).getShouldSendIapHistory();
            }

            public gatewayprotocol.v1.NativeConfigurationOuterClass.FeatureFlags.Builder setShouldSendIapHistory(boolean z) {
                copyOnWrite();
                ((gatewayprotocol.v1.NativeConfigurationOuterClass.FeatureFlags) this.instance).setShouldSendIapHistory(z);
                return this;
            }

            public gatewayprotocol.v1.NativeConfigurationOuterClass.FeatureFlags.Builder clearShouldSendIapHistory() {
                copyOnWrite();
                ((gatewayprotocol.v1.NativeConfigurationOuterClass.FeatureFlags) this.instance).clearShouldSendIapHistory();
                return this;
            }
        }

        @Override // com.google.protobuf.GeneratedMessageLite
        protected final java.lang.Object dynamicMethod(com.google.protobuf.GeneratedMessageLite.MethodToInvoke methodToInvoke, java.lang.Object obj, java.lang.Object obj2) {
            gatewayprotocol.v1.NativeConfigurationOuterClass.AnonymousClass1 anonymousClass1 = null;
            switch (gatewayprotocol.v1.NativeConfigurationOuterClass.AnonymousClass1.$SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke[methodToInvoke.ordinal()]) {
                case 1:
                    return new gatewayprotocol.v1.NativeConfigurationOuterClass.FeatureFlags();
                case 2:
                    return new gatewayprotocol.v1.NativeConfigurationOuterClass.FeatureFlags.Builder(anonymousClass1);
                case 3:
                    return newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0007\u0000\u0000\u0001\u0007\u0007\u0000\u0000\u0000\u0001\u0007\u0002\u0007\u0003\u0007\u0004\u0007\u0005\u0007\u0006\u0007\u0007\u0007", new java.lang.Object[]{"openglGpuEnabled_", "opportunityIdPlacementValidation_", "boldSdkNextSessionEnabled_", "appSheetBugCheckEnabled_", "recoverTerminatedWebviews_", "shouldHandleWebviewCaching_", "shouldSendIapHistory_"});
                case 4:
                    return DEFAULT_INSTANCE;
                case 5:
                    com.google.protobuf.Parser<gatewayprotocol.v1.NativeConfigurationOuterClass.FeatureFlags> parser = PARSER;
                    if (parser == null) {
                        synchronized (gatewayprotocol.v1.NativeConfigurationOuterClass.FeatureFlags.class) {
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
            gatewayprotocol.v1.NativeConfigurationOuterClass.FeatureFlags featureFlags = new gatewayprotocol.v1.NativeConfigurationOuterClass.FeatureFlags();
            DEFAULT_INSTANCE = featureFlags;
            com.google.protobuf.GeneratedMessageLite.registerDefaultInstance(gatewayprotocol.v1.NativeConfigurationOuterClass.FeatureFlags.class, featureFlags);
        }

        public static gatewayprotocol.v1.NativeConfigurationOuterClass.FeatureFlags getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static com.google.protobuf.Parser<gatewayprotocol.v1.NativeConfigurationOuterClass.FeatureFlags> parser() {
            return DEFAULT_INSTANCE.getParserForType();
        }
    }

    public static final class DebugSettings extends com.google.protobuf.GeneratedMessageLite<gatewayprotocol.v1.NativeConfigurationOuterClass.DebugSettings, gatewayprotocol.v1.NativeConfigurationOuterClass.DebugSettings.Builder> implements gatewayprotocol.v1.NativeConfigurationOuterClass.DebugSettingsOrBuilder {
        public static final int CLEAN_CACHE_FIELD_NUMBER = 3;
        private static final gatewayprotocol.v1.NativeConfigurationOuterClass.DebugSettings DEFAULT_INSTANCE;
        public static final int ENABLE_TRACING_FIELD_NUMBER = 2;
        private static volatile com.google.protobuf.Parser<gatewayprotocol.v1.NativeConfigurationOuterClass.DebugSettings> PARSER = null;
        public static final int WEBVIEW_INSPECTABLE_FIELD_NUMBER = 1;
        private boolean cleanCache_;
        private boolean enableTracing_;
        private boolean webviewInspectable_;

        private DebugSettings() {
        }

        @Override // gatewayprotocol.v1.NativeConfigurationOuterClass.DebugSettingsOrBuilder
        public boolean getWebviewInspectable() {
            return this.webviewInspectable_;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setWebviewInspectable(boolean z) {
            this.webviewInspectable_ = z;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearWebviewInspectable() {
            this.webviewInspectable_ = false;
        }

        @Override // gatewayprotocol.v1.NativeConfigurationOuterClass.DebugSettingsOrBuilder
        public boolean getEnableTracing() {
            return this.enableTracing_;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setEnableTracing(boolean z) {
            this.enableTracing_ = z;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearEnableTracing() {
            this.enableTracing_ = false;
        }

        @Override // gatewayprotocol.v1.NativeConfigurationOuterClass.DebugSettingsOrBuilder
        public boolean getCleanCache() {
            return this.cleanCache_;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setCleanCache(boolean z) {
            this.cleanCache_ = z;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearCleanCache() {
            this.cleanCache_ = false;
        }

        public static gatewayprotocol.v1.NativeConfigurationOuterClass.DebugSettings parseFrom(java.nio.ByteBuffer byteBuffer) throws com.google.protobuf.InvalidProtocolBufferException {
            return (gatewayprotocol.v1.NativeConfigurationOuterClass.DebugSettings) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
        }

        public static gatewayprotocol.v1.NativeConfigurationOuterClass.DebugSettings parseFrom(java.nio.ByteBuffer byteBuffer, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) throws com.google.protobuf.InvalidProtocolBufferException {
            return (gatewayprotocol.v1.NativeConfigurationOuterClass.DebugSettings) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
        }

        public static gatewayprotocol.v1.NativeConfigurationOuterClass.DebugSettings parseFrom(com.google.protobuf.ByteString byteString) throws com.google.protobuf.InvalidProtocolBufferException {
            return (gatewayprotocol.v1.NativeConfigurationOuterClass.DebugSettings) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
        }

        public static gatewayprotocol.v1.NativeConfigurationOuterClass.DebugSettings parseFrom(com.google.protobuf.ByteString byteString, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) throws com.google.protobuf.InvalidProtocolBufferException {
            return (gatewayprotocol.v1.NativeConfigurationOuterClass.DebugSettings) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
        }

        public static gatewayprotocol.v1.NativeConfigurationOuterClass.DebugSettings parseFrom(byte[] bArr) throws com.google.protobuf.InvalidProtocolBufferException {
            return (gatewayprotocol.v1.NativeConfigurationOuterClass.DebugSettings) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
        }

        public static gatewayprotocol.v1.NativeConfigurationOuterClass.DebugSettings parseFrom(byte[] bArr, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) throws com.google.protobuf.InvalidProtocolBufferException {
            return (gatewayprotocol.v1.NativeConfigurationOuterClass.DebugSettings) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
        }

        public static gatewayprotocol.v1.NativeConfigurationOuterClass.DebugSettings parseFrom(java.io.InputStream inputStream) throws java.io.IOException {
            return (gatewayprotocol.v1.NativeConfigurationOuterClass.DebugSettings) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static gatewayprotocol.v1.NativeConfigurationOuterClass.DebugSettings parseFrom(java.io.InputStream inputStream, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) throws java.io.IOException {
            return (gatewayprotocol.v1.NativeConfigurationOuterClass.DebugSettings) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
        }

        public static gatewayprotocol.v1.NativeConfigurationOuterClass.DebugSettings parseDelimitedFrom(java.io.InputStream inputStream) throws java.io.IOException {
            return (gatewayprotocol.v1.NativeConfigurationOuterClass.DebugSettings) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static gatewayprotocol.v1.NativeConfigurationOuterClass.DebugSettings parseDelimitedFrom(java.io.InputStream inputStream, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) throws java.io.IOException {
            return (gatewayprotocol.v1.NativeConfigurationOuterClass.DebugSettings) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
        }

        public static gatewayprotocol.v1.NativeConfigurationOuterClass.DebugSettings parseFrom(com.google.protobuf.CodedInputStream codedInputStream) throws java.io.IOException {
            return (gatewayprotocol.v1.NativeConfigurationOuterClass.DebugSettings) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
        }

        public static gatewayprotocol.v1.NativeConfigurationOuterClass.DebugSettings parseFrom(com.google.protobuf.CodedInputStream codedInputStream, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) throws java.io.IOException {
            return (gatewayprotocol.v1.NativeConfigurationOuterClass.DebugSettings) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
        }

        public static gatewayprotocol.v1.NativeConfigurationOuterClass.DebugSettings.Builder newBuilder() {
            return DEFAULT_INSTANCE.createBuilder();
        }

        public static gatewayprotocol.v1.NativeConfigurationOuterClass.DebugSettings.Builder newBuilder(gatewayprotocol.v1.NativeConfigurationOuterClass.DebugSettings debugSettings) {
            return DEFAULT_INSTANCE.createBuilder(debugSettings);
        }

        public static final class Builder extends com.google.protobuf.GeneratedMessageLite.Builder<gatewayprotocol.v1.NativeConfigurationOuterClass.DebugSettings, gatewayprotocol.v1.NativeConfigurationOuterClass.DebugSettings.Builder> implements gatewayprotocol.v1.NativeConfigurationOuterClass.DebugSettingsOrBuilder {
            /* synthetic */ Builder(gatewayprotocol.v1.NativeConfigurationOuterClass.AnonymousClass1 anonymousClass1) {
                this();
            }

            private Builder() {
                super(gatewayprotocol.v1.NativeConfigurationOuterClass.DebugSettings.DEFAULT_INSTANCE);
            }

            @Override // gatewayprotocol.v1.NativeConfigurationOuterClass.DebugSettingsOrBuilder
            public boolean getWebviewInspectable() {
                return ((gatewayprotocol.v1.NativeConfigurationOuterClass.DebugSettings) this.instance).getWebviewInspectable();
            }

            public gatewayprotocol.v1.NativeConfigurationOuterClass.DebugSettings.Builder setWebviewInspectable(boolean z) {
                copyOnWrite();
                ((gatewayprotocol.v1.NativeConfigurationOuterClass.DebugSettings) this.instance).setWebviewInspectable(z);
                return this;
            }

            public gatewayprotocol.v1.NativeConfigurationOuterClass.DebugSettings.Builder clearWebviewInspectable() {
                copyOnWrite();
                ((gatewayprotocol.v1.NativeConfigurationOuterClass.DebugSettings) this.instance).clearWebviewInspectable();
                return this;
            }

            @Override // gatewayprotocol.v1.NativeConfigurationOuterClass.DebugSettingsOrBuilder
            public boolean getEnableTracing() {
                return ((gatewayprotocol.v1.NativeConfigurationOuterClass.DebugSettings) this.instance).getEnableTracing();
            }

            public gatewayprotocol.v1.NativeConfigurationOuterClass.DebugSettings.Builder setEnableTracing(boolean z) {
                copyOnWrite();
                ((gatewayprotocol.v1.NativeConfigurationOuterClass.DebugSettings) this.instance).setEnableTracing(z);
                return this;
            }

            public gatewayprotocol.v1.NativeConfigurationOuterClass.DebugSettings.Builder clearEnableTracing() {
                copyOnWrite();
                ((gatewayprotocol.v1.NativeConfigurationOuterClass.DebugSettings) this.instance).clearEnableTracing();
                return this;
            }

            @Override // gatewayprotocol.v1.NativeConfigurationOuterClass.DebugSettingsOrBuilder
            public boolean getCleanCache() {
                return ((gatewayprotocol.v1.NativeConfigurationOuterClass.DebugSettings) this.instance).getCleanCache();
            }

            public gatewayprotocol.v1.NativeConfigurationOuterClass.DebugSettings.Builder setCleanCache(boolean z) {
                copyOnWrite();
                ((gatewayprotocol.v1.NativeConfigurationOuterClass.DebugSettings) this.instance).setCleanCache(z);
                return this;
            }

            public gatewayprotocol.v1.NativeConfigurationOuterClass.DebugSettings.Builder clearCleanCache() {
                copyOnWrite();
                ((gatewayprotocol.v1.NativeConfigurationOuterClass.DebugSettings) this.instance).clearCleanCache();
                return this;
            }
        }

        @Override // com.google.protobuf.GeneratedMessageLite
        protected final java.lang.Object dynamicMethod(com.google.protobuf.GeneratedMessageLite.MethodToInvoke methodToInvoke, java.lang.Object obj, java.lang.Object obj2) {
            gatewayprotocol.v1.NativeConfigurationOuterClass.AnonymousClass1 anonymousClass1 = null;
            switch (gatewayprotocol.v1.NativeConfigurationOuterClass.AnonymousClass1.$SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke[methodToInvoke.ordinal()]) {
                case 1:
                    return new gatewayprotocol.v1.NativeConfigurationOuterClass.DebugSettings();
                case 2:
                    return new gatewayprotocol.v1.NativeConfigurationOuterClass.DebugSettings.Builder(anonymousClass1);
                case 3:
                    return newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0000\u0000\u0001\u0007\u0002\u0007\u0003\u0007", new java.lang.Object[]{"webviewInspectable_", "enableTracing_", "cleanCache_"});
                case 4:
                    return DEFAULT_INSTANCE;
                case 5:
                    com.google.protobuf.Parser<gatewayprotocol.v1.NativeConfigurationOuterClass.DebugSettings> parser = PARSER;
                    if (parser == null) {
                        synchronized (gatewayprotocol.v1.NativeConfigurationOuterClass.DebugSettings.class) {
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
            gatewayprotocol.v1.NativeConfigurationOuterClass.DebugSettings debugSettings = new gatewayprotocol.v1.NativeConfigurationOuterClass.DebugSettings();
            DEFAULT_INSTANCE = debugSettings;
            com.google.protobuf.GeneratedMessageLite.registerDefaultInstance(gatewayprotocol.v1.NativeConfigurationOuterClass.DebugSettings.class, debugSettings);
        }

        public static gatewayprotocol.v1.NativeConfigurationOuterClass.DebugSettings getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static com.google.protobuf.Parser<gatewayprotocol.v1.NativeConfigurationOuterClass.DebugSettings> parser() {
            return DEFAULT_INSTANCE.getParserForType();
        }
    }
}
