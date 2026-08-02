package androidx.media3.session;

import androidx.annotation.Nullable;
import androidx.media3.common.MediaItem;
import androidx.media3.common.Timeline;
import androidx.media3.common.util.Assertions;
import androidx.media3.common.util.Util;
import androidx.media3.session.legacy.MediaSessionCompat;
import com.google.common.collect.G;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/* loaded from: classes3.dex */
final class QueueTimeline extends Timeline {
    public static final QueueTimeline DEFAULT;
    private static final Object FAKE_WINDOW_UID;

    @Nullable
    private final QueuedMediaItem fakeQueuedMediaItem;
    private final com.google.common.collect.G<QueuedMediaItem> queuedMediaItems;

    public static final class QueuedMediaItem {
        public final long durationMs;
        public final MediaItem mediaItem;
        public final long queueId;

        public QueuedMediaItem(MediaItem mediaItem, long j, long j2) {
            this.mediaItem = mediaItem;
            this.queueId = j;
            this.durationMs = j2;
        }

        public boolean equals(@Nullable Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof QueuedMediaItem)) {
                return false;
            }
            QueuedMediaItem queuedMediaItem = (QueuedMediaItem) obj;
            return this.queueId == queuedMediaItem.queueId && this.mediaItem.equals(queuedMediaItem.mediaItem) && this.durationMs == queuedMediaItem.durationMs;
        }

        public int hashCode() {
            long j = this.queueId;
            int hashCode = (this.mediaItem.hashCode() + ((217 + ((int) (j ^ (j >>> 32)))) * 31)) * 31;
            long j2 = this.durationMs;
            return hashCode + ((int) ((j2 >>> 32) ^ j2));
        }
    }

    static {
        G.b bVar = com.google.common.collect.G.b;
        DEFAULT = new QueueTimeline(com.google.common.collect.i0.e, null);
        FAKE_WINDOW_UID = new Object();
    }

    private QueueTimeline(com.google.common.collect.G<QueuedMediaItem> g, @Nullable QueuedMediaItem queuedMediaItem) {
        this.queuedMediaItems = g;
        this.fakeQueuedMediaItem = queuedMediaItem;
    }

    public static QueueTimeline create(List<MediaSessionCompat.QueueItem> list) {
        G.a aVar = new G.a();
        for (int i = 0; i < list.size(); i++) {
            MediaSessionCompat.QueueItem queueItem = list.get(i);
            aVar.c(new QueuedMediaItem(LegacyConversions.convertToMediaItem(queueItem), queueItem.getQueueId(), -9223372036854775807L));
        }
        return new QueueTimeline(aVar.g(), null);
    }

    private QueuedMediaItem getQueuedMediaItem(int i) {
        QueuedMediaItem queuedMediaItem;
        return (i != this.queuedMediaItems.size() || (queuedMediaItem = this.fakeQueuedMediaItem) == null) ? this.queuedMediaItems.get(i) : queuedMediaItem;
    }

    public boolean contains(MediaItem mediaItem) {
        QueuedMediaItem queuedMediaItem = this.fakeQueuedMediaItem;
        if (queuedMediaItem != null && mediaItem.equals(queuedMediaItem.mediaItem)) {
            return true;
        }
        for (int i = 0; i < this.queuedMediaItems.size(); i++) {
            if (mediaItem.equals(this.queuedMediaItems.get(i).mediaItem)) {
                return true;
            }
        }
        return false;
    }

    public QueueTimeline copy() {
        return new QueueTimeline(this.queuedMediaItems, this.fakeQueuedMediaItem);
    }

    public QueueTimeline copyWithClearedFakeMediaItem() {
        return new QueueTimeline(this.queuedMediaItems, null);
    }

    public QueueTimeline copyWithFakeMediaItem(MediaItem mediaItem, long j) {
        return new QueueTimeline(this.queuedMediaItems, new QueuedMediaItem(mediaItem, -1L, j));
    }

    public QueueTimeline copyWithMovedMediaItems(int i, int i2, int i3) {
        ArrayList arrayList = new ArrayList(this.queuedMediaItems);
        Util.moveItems(arrayList, i, i2, i3);
        return new QueueTimeline(com.google.common.collect.G.j(arrayList), this.fakeQueuedMediaItem);
    }

    public QueueTimeline copyWithNewMediaItem(int i, MediaItem mediaItem, long j) {
        Assertions.checkArgument(i < this.queuedMediaItems.size() || (i == this.queuedMediaItems.size() && this.fakeQueuedMediaItem != null));
        if (i == this.queuedMediaItems.size()) {
            return new QueueTimeline(this.queuedMediaItems, new QueuedMediaItem(mediaItem, -1L, j));
        }
        long j2 = this.queuedMediaItems.get(i).queueId;
        G.a aVar = new G.a();
        aVar.e(this.queuedMediaItems.subList(0, i));
        aVar.c(new QueuedMediaItem(mediaItem, j2, j));
        com.google.common.collect.G<QueuedMediaItem> g = this.queuedMediaItems;
        aVar.e(g.subList(i + 1, g.size()));
        return new QueueTimeline(aVar.g(), this.fakeQueuedMediaItem);
    }

    public QueueTimeline copyWithNewMediaItems(int i, List<MediaItem> list) {
        G.a aVar = new G.a();
        aVar.e(this.queuedMediaItems.subList(0, i));
        for (int i2 = 0; i2 < list.size(); i2++) {
            aVar.c(new QueuedMediaItem(list.get(i2), -1L, -9223372036854775807L));
        }
        com.google.common.collect.G<QueuedMediaItem> g = this.queuedMediaItems;
        aVar.e(g.subList(i, g.size()));
        return new QueueTimeline(aVar.g(), this.fakeQueuedMediaItem);
    }

    public QueueTimeline copyWithRemovedMediaItems(int i, int i2) {
        G.a aVar = new G.a();
        aVar.e(this.queuedMediaItems.subList(0, i));
        com.google.common.collect.G<QueuedMediaItem> g = this.queuedMediaItems;
        aVar.e(g.subList(i2, g.size()));
        return new QueueTimeline(aVar.g(), this.fakeQueuedMediaItem);
    }

    @Override // androidx.media3.common.Timeline
    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof QueueTimeline)) {
            return false;
        }
        QueueTimeline queueTimeline = (QueueTimeline) obj;
        return Objects.equals(this.queuedMediaItems, queueTimeline.queuedMediaItems) && Objects.equals(this.fakeQueuedMediaItem, queueTimeline.fakeQueuedMediaItem);
    }

    @Override // androidx.media3.common.Timeline
    public int getIndexOfPeriod(Object obj) {
        throw new UnsupportedOperationException();
    }

    @Nullable
    public MediaItem getMediaItemAt(int i) {
        if (i >= getWindowCount()) {
            return null;
        }
        return getQueuedMediaItem(i).mediaItem;
    }

    @Override // androidx.media3.common.Timeline
    public Timeline.Period getPeriod(int i, Timeline.Period period, boolean z) {
        QueuedMediaItem queuedMediaItem = getQueuedMediaItem(i);
        period.set(Long.valueOf(queuedMediaItem.queueId), null, i, Util.msToUs(queuedMediaItem.durationMs), 0L);
        return period;
    }

    @Override // androidx.media3.common.Timeline
    public int getPeriodCount() {
        return getWindowCount();
    }

    public long getQueueId(int i) {
        if (i < 0 || i >= this.queuedMediaItems.size()) {
            return -1L;
        }
        return this.queuedMediaItems.get(i).queueId;
    }

    @Override // androidx.media3.common.Timeline
    public Object getUidOfPeriod(int i) {
        throw new UnsupportedOperationException();
    }

    @Override // androidx.media3.common.Timeline
    public Timeline.Window getWindow(int i, Timeline.Window window, long j) {
        QueuedMediaItem queuedMediaItem = getQueuedMediaItem(i);
        window.set(FAKE_WINDOW_UID, queuedMediaItem.mediaItem, null, -9223372036854775807L, -9223372036854775807L, -9223372036854775807L, true, false, null, 0L, Util.msToUs(queuedMediaItem.durationMs), i, i, 0L);
        return window;
    }

    @Override // androidx.media3.common.Timeline
    public int getWindowCount() {
        return this.queuedMediaItems.size() + (this.fakeQueuedMediaItem == null ? 0 : 1);
    }

    @Override // androidx.media3.common.Timeline
    public int hashCode() {
        return Objects.hash(this.queuedMediaItems, this.fakeQueuedMediaItem);
    }
}
