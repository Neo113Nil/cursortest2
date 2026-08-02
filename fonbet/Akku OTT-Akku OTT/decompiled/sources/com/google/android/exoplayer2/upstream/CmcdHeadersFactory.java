package com.google.android.exoplayer2.upstream;

import android.text.TextUtils;
import androidx.annotation.Nullable;
import com.google.android.exoplayer2.source.TrackGroup;
import com.google.android.exoplayer2.trackselection.ExoTrackSelection;
import com.google.android.exoplayer2.util.Assertions;
import com.google.android.exoplayer2.util.MimeTypes;
import com.google.android.exoplayer2.util.Util;
import com.google.common.collect.I;
import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Deprecated
/* loaded from: classes4.dex */
public final class CmcdHeadersFactory {
    public static final String OBJECT_TYPE_AUDIO_ONLY = "a";
    public static final String OBJECT_TYPE_INIT_SEGMENT = "i";
    public static final String OBJECT_TYPE_MUXED_AUDIO_AND_VIDEO = "av";
    public static final String OBJECT_TYPE_VIDEO_ONLY = "v";
    public static final String STREAMING_FORMAT_DASH = "d";
    public static final String STREAMING_FORMAT_HLS = "h";
    public static final String STREAMING_FORMAT_SS = "s";
    public static final String STREAM_TYPE_LIVE = "l";
    public static final String STREAM_TYPE_VOD = "v";
    private final long bufferedDurationUs;
    private long chunkDurationUs;
    private final CmcdConfiguration cmcdConfiguration;
    private final boolean isLive;

    @Nullable
    private String objectType;
    private final String streamingFormat;
    private final ExoTrackSelection trackSelection;

    public static final class CmcdObject {
        public final int bitrateKbps;

        @Nullable
        public final String customData;
        public final long objectDurationMs;

        @Nullable
        public final String objectType;
        public final int topBitrateKbps;

        public static final class Builder {

            @Nullable
            private String customData;

            @Nullable
            private String objectType;
            private int bitrateKbps = -2147483647;
            private int topBitrateKbps = -2147483647;
            private long objectDurationMs = -9223372036854775807L;

            public CmcdObject build() {
                return new CmcdObject(this);
            }

            public Builder setBitrateKbps(int i) {
                this.bitrateKbps = i;
                return this;
            }

            public Builder setCustomData(@Nullable String str) {
                this.customData = str;
                return this;
            }

            public Builder setObjectDurationMs(long j) {
                Assertions.checkArgument(j >= 0);
                this.objectDurationMs = j;
                return this;
            }

            public Builder setObjectType(@Nullable String str) {
                this.objectType = str;
                return this;
            }

            public Builder setTopBitrateKbps(int i) {
                this.topBitrateKbps = i;
                return this;
            }
        }

        public void populateHttpRequestHeaders(I.a<String, String> aVar) {
            StringBuilder sb = new StringBuilder();
            int i = this.bitrateKbps;
            if (i != -2147483647) {
                sb.append(Util.formatInvariant("%s=%d,", "br", Integer.valueOf(i)));
            }
            int i2 = this.topBitrateKbps;
            if (i2 != -2147483647) {
                sb.append(Util.formatInvariant("%s=%d,", "tb", Integer.valueOf(i2)));
            }
            long j = this.objectDurationMs;
            if (j != -9223372036854775807L) {
                sb.append(Util.formatInvariant("%s=%d,", "d", Long.valueOf(j)));
            }
            if (!TextUtils.isEmpty(this.objectType)) {
                sb.append(Util.formatInvariant("%s=%s,", "ot", this.objectType));
            }
            if (!TextUtils.isEmpty(this.customData)) {
                sb.append(Util.formatInvariant("%s,", this.customData));
            }
            if (sb.length() == 0) {
                return;
            }
            sb.setLength(sb.length() - 1);
            aVar.d("CMCD-Object", sb.toString());
        }

        private CmcdObject(Builder builder) {
            this.bitrateKbps = builder.bitrateKbps;
            this.topBitrateKbps = builder.topBitrateKbps;
            this.objectDurationMs = builder.objectDurationMs;
            this.objectType = builder.objectType;
            this.customData = builder.customData;
        }
    }

    public static final class CmcdRequest {
        public final long bufferLengthMs;

        @Nullable
        public final String customData;
        public final long measuredThroughputInKbps;

        public static final class Builder {

            @Nullable
            private String customData;
            private long bufferLengthMs = -9223372036854775807L;
            private long measuredThroughputInKbps = Long.MIN_VALUE;

            public CmcdRequest build() {
                return new CmcdRequest(this);
            }

            public Builder setBufferLengthMs(long j) {
                Assertions.checkArgument(j >= 0);
                this.bufferLengthMs = ((j + 50) / 100) * 100;
                return this;
            }

            public Builder setCustomData(@Nullable String str) {
                this.customData = str;
                return this;
            }

            public Builder setMeasuredThroughputInKbps(long j) {
                Assertions.checkArgument(j >= 0);
                this.measuredThroughputInKbps = ((j + 50) / 100) * 100;
                return this;
            }
        }

        public void populateHttpRequestHeaders(I.a<String, String> aVar) {
            StringBuilder sb = new StringBuilder();
            long j = this.bufferLengthMs;
            if (j != -9223372036854775807L) {
                sb.append(Util.formatInvariant("%s=%d,", "bl", Long.valueOf(j)));
            }
            long j2 = this.measuredThroughputInKbps;
            if (j2 != Long.MIN_VALUE) {
                sb.append(Util.formatInvariant("%s=%d,", "mtp", Long.valueOf(j2)));
            }
            if (!TextUtils.isEmpty(this.customData)) {
                sb.append(Util.formatInvariant("%s,", this.customData));
            }
            if (sb.length() == 0) {
                return;
            }
            sb.setLength(sb.length() - 1);
            aVar.d("CMCD-Request", sb.toString());
        }

        private CmcdRequest(Builder builder) {
            this.bufferLengthMs = builder.bufferLengthMs;
            this.measuredThroughputInKbps = builder.measuredThroughputInKbps;
            this.customData = builder.customData;
        }
    }

    public static final class CmcdSession {
        public static final int VERSION = 1;

        @Nullable
        public final String contentId;

        @Nullable
        public final String customData;

        @Nullable
        public final String sessionId;

        @Nullable
        public final String streamType;

        @Nullable
        public final String streamingFormat;

        public static final class Builder {

            @Nullable
            private String contentId;

            @Nullable
            private String customData;

            @Nullable
            private String sessionId;

            @Nullable
            private String streamType;

            @Nullable
            private String streamingFormat;

            public CmcdSession build() {
                return new CmcdSession(this);
            }

            public Builder setContentId(@Nullable String str) {
                Assertions.checkArgument(str == null || str.length() <= 64);
                this.contentId = str;
                return this;
            }

            public Builder setCustomData(@Nullable String str) {
                this.customData = str;
                return this;
            }

            public Builder setSessionId(@Nullable String str) {
                Assertions.checkArgument(str == null || str.length() <= 64);
                this.sessionId = str;
                return this;
            }

            public Builder setStreamType(@Nullable String str) {
                this.streamType = str;
                return this;
            }

            public Builder setStreamingFormat(@Nullable String str) {
                this.streamingFormat = str;
                return this;
            }
        }

        public void populateHttpRequestHeaders(I.a<String, String> aVar) {
            StringBuilder sb = new StringBuilder();
            if (!TextUtils.isEmpty(this.contentId)) {
                sb.append(Util.formatInvariant("%s=\"%s\",", "cid", this.contentId));
            }
            if (!TextUtils.isEmpty(this.sessionId)) {
                sb.append(Util.formatInvariant("%s=\"%s\",", "sid", this.sessionId));
            }
            if (!TextUtils.isEmpty(this.streamingFormat)) {
                sb.append(Util.formatInvariant("%s=%s,", "sf", this.streamingFormat));
            }
            if (!TextUtils.isEmpty(this.streamType)) {
                sb.append(Util.formatInvariant("%s=%s,", "st", this.streamType));
            }
            if (!TextUtils.isEmpty(this.customData)) {
                sb.append(Util.formatInvariant("%s,", this.customData));
            }
            if (sb.length() == 0) {
                return;
            }
            sb.setLength(sb.length() - 1);
            aVar.d("CMCD-Session", sb.toString());
        }

        private CmcdSession(Builder builder) {
            this.contentId = builder.contentId;
            this.sessionId = builder.sessionId;
            this.streamingFormat = builder.streamingFormat;
            this.streamType = builder.streamType;
            this.customData = builder.customData;
        }
    }

    public static final class CmcdStatus {

        @Nullable
        public final String customData;
        public final int maximumRequestedThroughputKbps;

        public static final class Builder {

            @Nullable
            private String customData;
            private int maximumRequestedThroughputKbps = -2147483647;

            public CmcdStatus build() {
                return new CmcdStatus(this);
            }

            public Builder setCustomData(@Nullable String str) {
                this.customData = str;
                return this;
            }

            public Builder setMaximumRequestedThroughputKbps(int i) {
                Assertions.checkArgument(i == -2147483647 || i >= 0);
                if (i != -2147483647) {
                    i = ((i + 50) / 100) * 100;
                }
                this.maximumRequestedThroughputKbps = i;
                return this;
            }
        }

        public void populateHttpRequestHeaders(I.a<String, String> aVar) {
            StringBuilder sb = new StringBuilder();
            int i = this.maximumRequestedThroughputKbps;
            if (i != -2147483647) {
                sb.append(Util.formatInvariant("%s=%d,", "rtp", Integer.valueOf(i)));
            }
            if (!TextUtils.isEmpty(this.customData)) {
                sb.append(Util.formatInvariant("%s,", this.customData));
            }
            if (sb.length() == 0) {
                return;
            }
            sb.setLength(sb.length() - 1);
            aVar.d("CMCD-Status", sb.toString());
        }

        private CmcdStatus(Builder builder) {
            this.maximumRequestedThroughputKbps = builder.maximumRequestedThroughputKbps;
            this.customData = builder.customData;
        }
    }

    @Target({ElementType.TYPE_USE})
    @Documented
    @Retention(RetentionPolicy.SOURCE)
    public @interface ObjectType {
    }

    @Target({ElementType.TYPE_USE})
    @Documented
    @Retention(RetentionPolicy.SOURCE)
    public @interface StreamType {
    }

    @Target({ElementType.TYPE_USE})
    @Documented
    @Retention(RetentionPolicy.SOURCE)
    public @interface StreamingFormat {
    }

    public CmcdHeadersFactory(CmcdConfiguration cmcdConfiguration, ExoTrackSelection exoTrackSelection, long j, String str, boolean z) {
        Assertions.checkArgument(j >= 0);
        this.cmcdConfiguration = cmcdConfiguration;
        this.trackSelection = exoTrackSelection;
        this.bufferedDurationUs = j;
        this.streamingFormat = str;
        this.isLive = z;
        this.chunkDurationUs = -9223372036854775807L;
    }

    private boolean getIsInitSegment() {
        String str = this.objectType;
        return str != null && str.equals("i");
    }

    @Nullable
    public static String getObjectType(ExoTrackSelection exoTrackSelection) {
        Assertions.checkArgument(exoTrackSelection != null);
        int trackType = MimeTypes.getTrackType(exoTrackSelection.getSelectedFormat().sampleMimeType);
        if (trackType == -1) {
            trackType = MimeTypes.getTrackType(exoTrackSelection.getSelectedFormat().containerMimeType);
        }
        if (trackType == 1) {
            return "a";
        }
        if (trackType == 2) {
            return "v";
        }
        return null;
    }

    public I<String, String> createHttpRequestHeaders() {
        I<String, String> customData = this.cmcdConfiguration.requestConfig.getCustomData();
        int ceilDivide = Util.ceilDivide(this.trackSelection.getSelectedFormat().bitrate, 1000);
        CmcdObject.Builder customData2 = new CmcdObject.Builder().setCustomData(customData.get("CMCD-Object"));
        if (!getIsInitSegment()) {
            if (this.cmcdConfiguration.isBitrateLoggingAllowed()) {
                customData2.setBitrateKbps(ceilDivide);
            }
            if (this.cmcdConfiguration.isTopBitrateLoggingAllowed()) {
                TrackGroup trackGroup = this.trackSelection.getTrackGroup();
                int i = this.trackSelection.getSelectedFormat().bitrate;
                for (int i2 = 0; i2 < trackGroup.length; i2++) {
                    i = Math.max(i, trackGroup.getFormat(i2).bitrate);
                }
                customData2.setTopBitrateKbps(Util.ceilDivide(i, 1000));
            }
            if (this.cmcdConfiguration.isObjectDurationLoggingAllowed()) {
                long j = this.chunkDurationUs;
                if (j != -9223372036854775807L) {
                    customData2.setObjectDurationMs(j / 1000);
                }
            }
        }
        if (this.cmcdConfiguration.isObjectTypeLoggingAllowed()) {
            customData2.setObjectType(this.objectType);
        }
        CmcdRequest.Builder customData3 = new CmcdRequest.Builder().setCustomData(customData.get("CMCD-Request"));
        if (!getIsInitSegment() && this.cmcdConfiguration.isBufferLengthLoggingAllowed()) {
            customData3.setBufferLengthMs(this.bufferedDurationUs / 1000);
        }
        if (this.cmcdConfiguration.isMeasuredThroughputLoggingAllowed() && this.trackSelection.getLatestBitrateEstimate() != Long.MIN_VALUE) {
            customData3.setMeasuredThroughputInKbps(Util.ceilDivide(this.trackSelection.getLatestBitrateEstimate(), 1000L));
        }
        CmcdSession.Builder customData4 = new CmcdSession.Builder().setCustomData(customData.get("CMCD-Session"));
        if (this.cmcdConfiguration.isContentIdLoggingAllowed()) {
            customData4.setContentId(this.cmcdConfiguration.contentId);
        }
        if (this.cmcdConfiguration.isSessionIdLoggingAllowed()) {
            customData4.setSessionId(this.cmcdConfiguration.sessionId);
        }
        if (this.cmcdConfiguration.isStreamingFormatLoggingAllowed()) {
            customData4.setStreamingFormat(this.streamingFormat);
        }
        if (this.cmcdConfiguration.isStreamTypeLoggingAllowed()) {
            customData4.setStreamType(this.isLive ? "l" : "v");
        }
        CmcdStatus.Builder customData5 = new CmcdStatus.Builder().setCustomData(customData.get("CMCD-Status"));
        if (this.cmcdConfiguration.isMaximumRequestThroughputLoggingAllowed()) {
            customData5.setMaximumRequestedThroughputKbps(this.cmcdConfiguration.requestConfig.getRequestedMaximumThroughputKbps(ceilDivide));
        }
        I.a<String, String> a = I.a();
        customData2.build().populateHttpRequestHeaders(a);
        customData3.build().populateHttpRequestHeaders(a);
        customData4.build().populateHttpRequestHeaders(a);
        customData5.build().populateHttpRequestHeaders(a);
        return a.a(true);
    }

    public CmcdHeadersFactory setChunkDurationUs(long j) {
        Assertions.checkArgument(j >= 0);
        this.chunkDurationUs = j;
        return this;
    }

    public CmcdHeadersFactory setObjectType(@Nullable String str) {
        this.objectType = str;
        return this;
    }
}
