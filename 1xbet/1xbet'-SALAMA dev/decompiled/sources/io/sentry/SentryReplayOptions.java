package io.sentry;

import io.sentry.protocol.SdkVersion;
import io.sentry.util.SampleRateUtils;
import java.util.Locale;
import java.util.Set;
import java.util.concurrent.CopyOnWriteArraySet;

/* JADX INFO: loaded from: classes2.dex */
public final class SentryReplayOptions {
    public static final String ANDROIDX_MEDIA_VIEW_CLASS_NAME = "androidx.media3.ui.PlayerView";
    public static final String EXOPLAYER_CLASS_NAME = "com.google.android.exoplayer2.ui.PlayerView";
    public static final String EXOPLAYER_STYLED_CLASS_NAME = "com.google.android.exoplayer2.ui.StyledPlayerView";
    public static final String IMAGE_VIEW_CLASS_NAME = "android.widget.ImageView";
    public static final String TEXT_VIEW_CLASS_NAME = "android.widget.TextView";
    public static final String VIDEO_VIEW_CLASS_NAME = "android.widget.VideoView";
    public static final String WEB_VIEW_CLASS_NAME = "android.webkit.WebView";
    private boolean debug;
    private long errorReplayDuration;
    private int frameRate;
    private Set<String> maskViewClasses;
    private String maskViewContainerClass;
    private Double onErrorSampleRate;
    private SentryReplayQuality quality;
    private SdkVersion sdkVersion;
    private long sessionDuration;
    private Double sessionSampleRate;
    private long sessionSegmentDuration;
    private boolean trackConfiguration;
    private Set<String> unmaskViewClasses;
    private String unmaskViewContainerClass;

    public enum SentryReplayQuality {
        LOW(0.8f, 50000, 10),
        MEDIUM(1.0f, 75000, 30),
        HIGH(1.0f, 100000, 50);

        public final int bitRate;
        public final int screenshotQuality;
        public final float sizeScale;

        SentryReplayQuality(float f7, int i7, int i8) {
            this.sizeScale = f7;
            this.bitRate = i7;
            this.screenshotQuality = i8;
        }

        public String serializedName() {
            return name().toLowerCase(Locale.ROOT);
        }
    }

    public SentryReplayOptions(boolean z4, SdkVersion sdkVersion) {
        this.maskViewClasses = new CopyOnWriteArraySet();
        this.unmaskViewClasses = new CopyOnWriteArraySet();
        this.maskViewContainerClass = null;
        this.unmaskViewContainerClass = null;
        this.quality = SentryReplayQuality.MEDIUM;
        this.frameRate = 1;
        this.errorReplayDuration = TransactionOptions.DEFAULT_DEADLINE_TIMEOUT_AUTO_TRANSACTION;
        this.sessionSegmentDuration = 5000L;
        this.sessionDuration = 3600000L;
        this.trackConfiguration = true;
        this.debug = false;
        if (z4) {
            return;
        }
        setMaskAllText(true);
        setMaskAllImages(true);
        this.maskViewClasses.add(WEB_VIEW_CLASS_NAME);
        this.maskViewClasses.add(VIDEO_VIEW_CLASS_NAME);
        this.maskViewClasses.add(ANDROIDX_MEDIA_VIEW_CLASS_NAME);
        this.maskViewClasses.add(EXOPLAYER_CLASS_NAME);
        this.maskViewClasses.add(EXOPLAYER_STYLED_CLASS_NAME);
        this.sdkVersion = sdkVersion;
    }

    public void addMaskViewClass(String str) {
        this.maskViewClasses.add(str);
    }

    public void addUnmaskViewClass(String str) {
        this.unmaskViewClasses.add(str);
    }

    public long getErrorReplayDuration() {
        return this.errorReplayDuration;
    }

    public int getFrameRate() {
        return this.frameRate;
    }

    public Set<String> getMaskViewClasses() {
        return this.maskViewClasses;
    }

    public String getMaskViewContainerClass() {
        return this.maskViewContainerClass;
    }

    public Double getOnErrorSampleRate() {
        return this.onErrorSampleRate;
    }

    public SentryReplayQuality getQuality() {
        return this.quality;
    }

    public SdkVersion getSdkVersion() {
        return this.sdkVersion;
    }

    public long getSessionDuration() {
        return this.sessionDuration;
    }

    public Double getSessionSampleRate() {
        return this.sessionSampleRate;
    }

    public long getSessionSegmentDuration() {
        return this.sessionSegmentDuration;
    }

    public Set<String> getUnmaskViewClasses() {
        return this.unmaskViewClasses;
    }

    public String getUnmaskViewContainerClass() {
        return this.unmaskViewContainerClass;
    }

    public boolean isDebug() {
        return this.debug;
    }

    public boolean isSessionReplayEnabled() {
        return getSessionSampleRate() != null && getSessionSampleRate().doubleValue() > 0.0d;
    }

    public boolean isSessionReplayForErrorsEnabled() {
        return getOnErrorSampleRate() != null && getOnErrorSampleRate().doubleValue() > 0.0d;
    }

    public boolean isTrackConfiguration() {
        return this.trackConfiguration;
    }

    public void setDebug(boolean z4) {
        this.debug = z4;
    }

    public void setMaskAllImages(boolean z4) {
        if (z4) {
            addMaskViewClass(IMAGE_VIEW_CLASS_NAME);
            this.unmaskViewClasses.remove(IMAGE_VIEW_CLASS_NAME);
        } else {
            addUnmaskViewClass(IMAGE_VIEW_CLASS_NAME);
            this.maskViewClasses.remove(IMAGE_VIEW_CLASS_NAME);
        }
    }

    public void setMaskAllText(boolean z4) {
        if (z4) {
            addMaskViewClass(TEXT_VIEW_CLASS_NAME);
            this.unmaskViewClasses.remove(TEXT_VIEW_CLASS_NAME);
        } else {
            addUnmaskViewClass(TEXT_VIEW_CLASS_NAME);
            this.maskViewClasses.remove(TEXT_VIEW_CLASS_NAME);
        }
    }

    public void setMaskViewContainerClass(String str) {
        addMaskViewClass(str);
        this.maskViewContainerClass = str;
    }

    public void setOnErrorSampleRate(Double d7) {
        if (SampleRateUtils.isValidSampleRate(d7)) {
            this.onErrorSampleRate = d7;
            return;
        }
        throw new IllegalArgumentException("The value " + d7 + " is not valid. Use null to disable or values >= 0.0 and <= 1.0.");
    }

    public void setQuality(SentryReplayQuality sentryReplayQuality) {
        this.quality = sentryReplayQuality;
    }

    public void setSdkVersion(SdkVersion sdkVersion) {
        this.sdkVersion = sdkVersion;
    }

    public void setSessionSampleRate(Double d7) {
        if (SampleRateUtils.isValidSampleRate(d7)) {
            this.sessionSampleRate = d7;
            return;
        }
        throw new IllegalArgumentException("The value " + d7 + " is not valid. Use null to disable or values >= 0.0 and <= 1.0.");
    }

    public void setTrackConfiguration(boolean z4) {
        this.trackConfiguration = z4;
    }

    public void setUnmaskViewContainerClass(String str) {
        this.unmaskViewContainerClass = str;
    }

    public SentryReplayOptions(Double d7, Double d8, SdkVersion sdkVersion) {
        this(false, sdkVersion);
        this.sessionSampleRate = d7;
        this.onErrorSampleRate = d8;
        this.sdkVersion = sdkVersion;
    }
}
