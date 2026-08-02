package org.chromium.net.impl;

/* loaded from: classes5.dex */
public abstract class CronetLogger {

    public static final class CronetEngineBuilderInitializedInfo {
        public org.chromium.net.impl.CronetLogger.CronetVersion apiVersion;
        public org.chromium.net.impl.CronetLogger.CronetEngineBuilderInitializedInfo.Author author;
        public java.lang.Boolean creationSuccessful;
        public long cronetInitializationRef;
        public org.chromium.net.impl.CronetLogger.CronetVersion implVersion;
        public int uid;
        public int engineBuilderCreatedLatencyMillis = -1;
        public org.chromium.net.impl.CronetLogger.CronetSource source = org.chromium.net.impl.CronetLogger.CronetSource.CRONET_SOURCE_UNSPECIFIED;

        public enum Author {
            API,
            IMPL
        }
    }

    /* loaded from: classes18.dex */
    public static final class CronetInitializedInfo {
        public java.lang.String cronetImplVersion;
        public long cronetInitializationRef;
        public java.util.List<java.lang.Long> httpFlagsNames;
        public java.lang.Boolean httpFlagsSuccessful;
        public java.util.List<java.lang.Long> httpFlagsValues;
        public int engineCreationLatencyMillis = -1;
        public int engineAsyncLatencyMillis = -1;
        public int httpFlagsLatencyMillis = -1;
        public org.chromium.net.impl.CronetLogger.CronetSource source = org.chromium.net.impl.CronetLogger.CronetSource.CRONET_SOURCE_UNSPECIFIED;
    }

    public enum CronetSource {
        CRONET_SOURCE_UNSPECIFIED,
        CRONET_SOURCE_STATICALLY_LINKED,
        CRONET_SOURCE_PLAY_SERVICES,
        CRONET_SOURCE_FALLBACK,
        CRONET_SOURCE_PLATFORM,
        CRONET_SOURCE_FAKE
    }

    public abstract long generateId();

    public abstract void logCronetEngineBuilderInitializedInfo(org.chromium.net.impl.CronetLogger.CronetEngineBuilderInitializedInfo cronetEngineBuilderInitializedInfo);

    public abstract void logCronetEngineCreation(long j, org.chromium.net.impl.CronetLogger.CronetEngineBuilderInfo cronetEngineBuilderInfo, org.chromium.net.impl.CronetLogger.CronetVersion cronetVersion, org.chromium.net.impl.CronetLogger.CronetSource cronetSource);

    public abstract void logCronetInitializedInfo(org.chromium.net.impl.CronetLogger.CronetInitializedInfo cronetInitializedInfo);

    public abstract void logCronetTrafficInfo(long j, org.chromium.net.impl.CronetLogger.CronetTrafficInfo cronetTrafficInfo);

    /* loaded from: classes18.dex */
    public static class CronetEngineBuilderInfo {
        private final boolean Camera2StreamConfigurationMap;
        private final java.lang.String getHighResolutionOutputSizeshNQ4ISI;
        private final int getHighSpeedVideoFpsRanges;
        private final boolean getHighSpeedVideoFpsRangesFor;
        private final long getHighSpeedVideoSizes;
        private final boolean getHighSpeedVideoSizesFor;
        private final boolean getInputFormats;
        private final boolean getInputSizeshNQ4ISI;
        private final int getOutputFormats;
        private final java.lang.String getOutputMinFrameDuration;
        private final java.lang.String getOutputStallDurationlomOqCM;

        public CronetEngineBuilderInfo(boolean z, java.lang.String str, java.lang.String str2, boolean z2, boolean z3, boolean z4, int i, java.lang.String str3, boolean z5, int i2, long j) {
            this.getHighSpeedVideoSizesFor = z;
            this.getOutputStallDurationlomOqCM = str;
            this.getOutputMinFrameDuration = str2;
            this.getInputFormats = z2;
            this.getHighSpeedVideoFpsRangesFor = z3;
            this.Camera2StreamConfigurationMap = z4;
            this.getHighSpeedVideoFpsRanges = i;
            this.getHighResolutionOutputSizeshNQ4ISI = str3;
            this.getInputSizeshNQ4ISI = z5;
            this.getOutputFormats = i2;
            this.getHighSpeedVideoSizes = j;
        }

        public boolean isPublicKeyPinningBypassForLocalTrustAnchorsEnabled() {
            return this.getHighSpeedVideoSizesFor;
        }

        public java.lang.String getUserAgent() {
            return this.getOutputStallDurationlomOqCM;
        }

        public java.lang.String getStoragePath() {
            return this.getOutputMinFrameDuration;
        }

        public boolean isQuicEnabled() {
            return this.getInputFormats;
        }

        public boolean isHttp2Enabled() {
            return this.getHighSpeedVideoFpsRangesFor;
        }

        public boolean isBrotliEnabled() {
            return this.Camera2StreamConfigurationMap;
        }

        public int getHttpCacheMode() {
            return this.getHighSpeedVideoFpsRanges;
        }

        public java.lang.String getExperimentalOptions() {
            return this.getHighResolutionOutputSizeshNQ4ISI;
        }

        public boolean isNetworkQualityEstimatorEnabled() {
            return this.getInputSizeshNQ4ISI;
        }

        public int getThreadPriority() {
            return this.getOutputFormats;
        }

        public long getCronetInitializationRef() {
            return this.getHighSpeedVideoSizes;
        }
    }

    public static class CronetTrafficInfo {
        private final org.chromium.net.impl.CronetLogger.CronetTrafficInfo.RequestTerminalState ArtificialStackFrames;
        private final java.lang.String Camera2StreamConfigurationMap;
        private final long CoroutineDebuggingKt;
        private final java.time.Duration _CREATION;

        /* renamed from: a, reason: collision with root package name */
        private final boolean f7054a;
        private final long accessartificialFrame;
        private final int b;
        private final long coroutineBoundary;
        private final long coroutineCreation;
        private final boolean getHighResolutionOutputSizeshNQ4ISI;
        private final boolean getHighSpeedVideoFpsRanges;
        private final org.chromium.net.impl.CronetLogger.CronetTrafficInfo.RequestFailureReason getHighSpeedVideoFpsRangesFor;
        private final org.chromium.net.impl.CronetLogger.CronetSource getHighSpeedVideoSizes;
        private final boolean getHighSpeedVideoSizesFor;
        private final java.time.Duration getInputFormats;
        private final java.lang.String getInputSizeshNQ4ISI;
        private final int getOutputFormats;
        private final int getOutputMinFrameDuration;
        private final int getOutputMinFrameDurationlomOqCM;
        private final long getOutputSizes;
        private final int getOutputSizeshNQ4ISI;
        private final long getOutputStallDuration;
        private final int getOutputStallDurationlomOqCM;
        private final long getValidOutputFormatsForInputhNQ4ISI;
        private final long isOutputSupportedFor;
        private final boolean isOutputSupportedForhNQ4ISI;
        private final int toString;
        private final int unwrapAs;

        public enum RequestFailureReason {
            UNKNOWN,
            NETWORK,
            OTHER
        }

        public enum RequestTerminalState {
            SUCCEEDED,
            ERROR,
            CANCELLED
        }

        public CronetTrafficInfo(long j, long j2, long j3, long j4, int i, java.time.Duration duration, java.time.Duration duration2, java.lang.String str, boolean z, boolean z2, org.chromium.net.impl.CronetLogger.CronetTrafficInfo.RequestTerminalState requestTerminalState, int i2, int i3, int i4, boolean z3, boolean z4, int i5, int i6, int i7, int i8, org.chromium.net.impl.CronetLogger.CronetTrafficInfo.RequestFailureReason requestFailureReason, boolean z5, java.lang.String str2, org.chromium.net.impl.CronetLogger.CronetSource cronetSource, long j5, long j6, long j7, long j8) {
            this.getOutputSizes = j;
            this.getOutputStallDuration = j2;
            this.getValidOutputFormatsForInputhNQ4ISI = j3;
            this.isOutputSupportedFor = j4;
            this.toString = i;
            this.getInputFormats = duration;
            this._CREATION = duration2;
            this.getInputSizeshNQ4ISI = str;
            this.f7054a = z;
            this.getHighSpeedVideoFpsRanges = z2;
            this.ArtificialStackFrames = requestTerminalState;
            this.getOutputMinFrameDuration = i2;
            this.getOutputSizeshNQ4ISI = i3;
            this.getOutputMinFrameDurationlomOqCM = i4;
            this.getHighSpeedVideoSizesFor = z3;
            this.getHighResolutionOutputSizeshNQ4ISI = z4;
            this.b = i5;
            this.getOutputFormats = i6;
            this.getOutputStallDurationlomOqCM = i7;
            this.unwrapAs = i8;
            this.getHighSpeedVideoFpsRangesFor = requestFailureReason;
            this.isOutputSupportedForhNQ4ISI = z5;
            this.Camera2StreamConfigurationMap = str2;
            this.getHighSpeedVideoSizes = cronetSource;
            this.accessartificialFrame = j5;
            this.coroutineCreation = j6;
            this.CoroutineDebuggingKt = j7;
            this.coroutineBoundary = j8;
        }

        public long getRequestHeaderSizeInBytes() {
            return this.getOutputSizes;
        }

        public long getRequestBodySizeInBytes() {
            return this.getOutputStallDuration;
        }

        public long getResponseHeaderSizeInBytes() {
            return this.getValidOutputFormatsForInputhNQ4ISI;
        }

        public long getResponseBodySizeInBytes() {
            return this.isOutputSupportedFor;
        }

        public int getResponseStatusCode() {
            return this.toString;
        }

        public java.time.Duration getHeadersLatency() {
            return this.getInputFormats;
        }

        public java.time.Duration getTotalLatency() {
            return this._CREATION;
        }

        public java.lang.String getNegotiatedProtocol() {
            return this.getInputSizeshNQ4ISI;
        }

        public boolean wasConnectionMigrationAttempted() {
            return this.f7054a;
        }

        public boolean didConnectionMigrationSucceed() {
            return this.getHighSpeedVideoFpsRanges;
        }

        public org.chromium.net.impl.CronetLogger.CronetTrafficInfo.RequestTerminalState getTerminalState() {
            return this.ArtificialStackFrames;
        }

        public int getNonfinalUserCallbackExceptionCount() {
            return this.getOutputMinFrameDuration;
        }

        public int getReadCount() {
            return this.getOutputSizeshNQ4ISI;
        }

        public int getOnUploadReadCount() {
            return this.getOutputMinFrameDurationlomOqCM;
        }

        public boolean getIsBidiStream() {
            return this.getHighSpeedVideoSizesFor;
        }

        public boolean getFinalUserCallbackThrew() {
            return this.getHighResolutionOutputSizeshNQ4ISI;
        }

        public int getUid() {
            return this.b;
        }

        public int getNetworkInternalErrorCode() {
            return this.getOutputFormats;
        }

        public int getQuicErrorCode() {
            return this.getOutputStallDurationlomOqCM;
        }

        public int getConnectionCloseSource() {
            return this.unwrapAs;
        }

        public org.chromium.net.impl.CronetLogger.CronetTrafficInfo.RequestFailureReason getFailureReason() {
            return this.getHighSpeedVideoFpsRangesFor;
        }

        public boolean getIsSocketReused() {
            return this.isOutputSupportedForhNQ4ISI;
        }

        public java.lang.String getCronetVersion() {
            return this.Camera2StreamConfigurationMap;
        }

        public org.chromium.net.impl.CronetLogger.CronetSource getCronetSource() {
            return this.getHighSpeedVideoSizes;
        }

        public long getTimeToEstablishDNSMillis() {
            return this.accessartificialFrame;
        }

        public long getTimeToEstablishSSLMillis() {
            return this.coroutineCreation;
        }

        public long getTimeToConnectMillis() {
            return this.CoroutineDebuggingKt;
        }

        public long getTimeToSendFirstByteMillis() {
            return this.coroutineBoundary;
        }
    }

    public static class CronetVersion {
        private final int Camera2StreamConfigurationMap;
        private final int getHighResolutionOutputSizeshNQ4ISI;
        private final int getHighSpeedVideoFpsRanges;
        private final int getHighSpeedVideoSizes;

        public CronetVersion(java.lang.String str) {
            java.lang.String[] split = str.split("\\.");
            this.getHighResolutionOutputSizeshNQ4ISI = java.lang.Integer.parseInt(split[0]);
            this.getHighSpeedVideoSizes = java.lang.Integer.parseInt(split[1]);
            this.Camera2StreamConfigurationMap = java.lang.Integer.parseInt(split[2]);
            this.getHighSpeedVideoFpsRanges = java.lang.Integer.parseInt(split[3]);
        }

        public int getMajorVersion() {
            return this.getHighResolutionOutputSizeshNQ4ISI;
        }

        public int getMinorVersion() {
            return this.getHighSpeedVideoSizes;
        }

        public int getBuildVersion() {
            return this.Camera2StreamConfigurationMap;
        }

        public int getPatchVersion() {
            return this.getHighSpeedVideoFpsRanges;
        }

        public java.lang.String toString() {
            int i = this.getHighResolutionOutputSizeshNQ4ISI;
            int i2 = this.getHighSpeedVideoSizes;
            int i3 = this.Camera2StreamConfigurationMap;
            int i4 = this.getHighSpeedVideoFpsRanges;
            java.lang.StringBuilder sb = new java.lang.StringBuilder();
            sb.append(i);
            sb.append(".");
            sb.append(i2);
            sb.append(".");
            sb.append(i3);
            sb.append(".");
            sb.append(i4);
            return sb.toString();
        }
    }
}
