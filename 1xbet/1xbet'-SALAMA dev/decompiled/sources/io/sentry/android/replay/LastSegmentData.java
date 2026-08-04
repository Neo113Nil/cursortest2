package io.sentry.android.replay;

import androidx.compose.runtime.internal.StabilityInferred;
import io.sentry.SentryReplayEvent;
import io.sentry.rrweb.RRWebEvent;
import java.util.Date;
import java.util.List;
import t6.h;

/* JADX INFO: loaded from: classes2.dex */
@StabilityInferred(parameters = 0)
public final class LastSegmentData {
    public static final int $stable = 8;
    private final ReplayCache cache;
    private final long duration;
    private final List<RRWebEvent> events;
    private final int id;
    private final ScreenshotRecorderConfig recorderConfig;
    private final SentryReplayEvent.ReplayType replayType;
    private final String screenAtStart;
    private final Date timestamp;

    /* JADX WARN: Multi-variable type inference failed */
    public LastSegmentData(ScreenshotRecorderConfig screenshotRecorderConfig, ReplayCache replayCache, Date date, int i7, long j, SentryReplayEvent.ReplayType replayType, String str, List<? extends RRWebEvent> list) {
        h.e(screenshotRecorderConfig, "recorderConfig");
        h.e(replayCache, "cache");
        h.e(date, "timestamp");
        h.e(replayType, "replayType");
        h.e(list, "events");
        this.recorderConfig = screenshotRecorderConfig;
        this.cache = replayCache;
        this.timestamp = date;
        this.id = i7;
        this.duration = j;
        this.replayType = replayType;
        this.screenAtStart = str;
        this.events = list;
    }

    public final ScreenshotRecorderConfig component1() {
        return this.recorderConfig;
    }

    public final ReplayCache component2() {
        return this.cache;
    }

    public final Date component3() {
        return this.timestamp;
    }

    public final int component4() {
        return this.id;
    }

    public final long component5() {
        return this.duration;
    }

    public final SentryReplayEvent.ReplayType component6() {
        return this.replayType;
    }

    public final String component7() {
        return this.screenAtStart;
    }

    public final List<RRWebEvent> component8() {
        return this.events;
    }

    public final LastSegmentData copy(ScreenshotRecorderConfig screenshotRecorderConfig, ReplayCache replayCache, Date date, int i7, long j, SentryReplayEvent.ReplayType replayType, String str, List<? extends RRWebEvent> list) {
        h.e(screenshotRecorderConfig, "recorderConfig");
        h.e(replayCache, "cache");
        h.e(date, "timestamp");
        h.e(replayType, "replayType");
        h.e(list, "events");
        return new LastSegmentData(screenshotRecorderConfig, replayCache, date, i7, j, replayType, str, list);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof LastSegmentData)) {
            return false;
        }
        LastSegmentData lastSegmentData = (LastSegmentData) obj;
        return h.a(this.recorderConfig, lastSegmentData.recorderConfig) && h.a(this.cache, lastSegmentData.cache) && h.a(this.timestamp, lastSegmentData.timestamp) && this.id == lastSegmentData.id && this.duration == lastSegmentData.duration && this.replayType == lastSegmentData.replayType && h.a(this.screenAtStart, lastSegmentData.screenAtStart) && h.a(this.events, lastSegmentData.events);
    }

    public final ReplayCache getCache() {
        return this.cache;
    }

    public final long getDuration() {
        return this.duration;
    }

    public final List<RRWebEvent> getEvents() {
        return this.events;
    }

    public final int getId() {
        return this.id;
    }

    public final ScreenshotRecorderConfig getRecorderConfig() {
        return this.recorderConfig;
    }

    public final SentryReplayEvent.ReplayType getReplayType() {
        return this.replayType;
    }

    public final String getScreenAtStart() {
        return this.screenAtStart;
    }

    public final Date getTimestamp() {
        return this.timestamp;
    }

    public int hashCode() {
        int iHashCode = (this.replayType.hashCode() + ((Long.hashCode(this.duration) + ((Integer.hashCode(this.id) + ((this.timestamp.hashCode() + ((this.cache.hashCode() + (this.recorderConfig.hashCode() * 31)) * 31)) * 31)) * 31)) * 31)) * 31;
        String str = this.screenAtStart;
        return this.events.hashCode() + ((iHashCode + (str == null ? 0 : str.hashCode())) * 31);
    }

    public String toString() {
        return "LastSegmentData(recorderConfig=" + this.recorderConfig + ", cache=" + this.cache + ", timestamp=" + this.timestamp + ", id=" + this.id + ", duration=" + this.duration + ", replayType=" + this.replayType + ", screenAtStart=" + this.screenAtStart + ", events=" + this.events + ')';
    }
}
