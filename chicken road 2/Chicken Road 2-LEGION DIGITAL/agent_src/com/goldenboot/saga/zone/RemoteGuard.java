package com.goldenboot.saga.zone;

import android.text.Spannable;
import com.goldenboot.saga.zone.AlarmEmitter;
import com.goldenboot.saga.zone.WatcherDelta;
import com.goldenboot.saga.zone.WaveMolder;
import java.util.List;
import kotlin.Metadata;

/* compiled from: r8-map-id-8a937589efc37ca14c210e73e18b8757b60a107ea08aacc80d18a198c868531e */
@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\u001a/\u0010\b\u001a\u00020\u0007*\u00020\u00002\u0012\u0010\u0004\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\u00020\u00012\u0006\u0010\u0006\u001a\u00020\u0005H\u0000¢\u0006\u0004\b\b\u0010\t\u001a3\u0010\u000e\u001a\u00020\u0007*\u00020\u00002\u0006\u0010\n\u001a\u00020\u00032\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\r\u001a\u00020\u000b2\u0006\u0010\u0006\u001a\u00020\u0005H\u0002¢\u0006\u0004\b\u000e\u0010\u000f\"\u001e\u0010\u0015\u001a\u00020\u000b*\u00020\u00108BX\u0082\u0004¢\u0006\f\u0012\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0011\u0010\u0012\"\u001e\u0010\u001b\u001a\u00020\u000b*\u00020\u00168BX\u0082\u0004¢\u0006\f\u0012\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u0017\u0010\u0018¨\u0006\u001c"}, d2 = {"Landroid/text/Spannable;", "", "Lcom/goldenboot/saga/zone/WatcherDelta$EndpointList;", "Lcom/goldenboot/saga/zone/PinchReducer;", "placeholders", "Lcom/goldenboot/saga/zone/BackgroundCollection;", "density", "Lcom/goldenboot/saga/zone/DpadBuilder;", "clipOrigin", "(Landroid/text/Spannable;Ljava/util/List;Lcom/goldenboot/saga/zone/BackgroundCollection;)V", "placeholder", "", "start", "end", "releaseHeader", "(Landroid/text/Spannable;Lcom/goldenboot/saga/zone/PinchReducer;IILcom/goldenboot/saga/zone/BackgroundCollection;)V", "Lcom/goldenboot/saga/zone/PooledStatus;", "evictLayout", "(J)I", "growPayload", "(J)V", "spanUnit", "Lcom/goldenboot/saga/zone/WaveMolder;", "injectMetric", "(I)I", "detachStream", "(I)V", "spanVerticalAlign", "ui-text"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes.dex */
public final class RemoteGuard {
    public static final void clipOrigin(Spannable spannable, List<WatcherDelta.Range<Placeholder>> list, BackgroundCollection backgroundCollection) {
        int size = list.size();
        for (int i = 0; i < size; i++) {
            WatcherDelta.Range<Placeholder> range = list.get(i);
            releaseHeader(spannable, range.evictLayout(), range.growPayload(), range.injectMetric(), backgroundCollection);
        }
    }

    private static final int evictLayout(long j) {
        long peekRevision = PooledStatus.peekRevision(j);
        AlarmEmitter.Companion companion = AlarmEmitter.INSTANCE;
        if (AlarmEmitter.flushSample(peekRevision, companion.growPayload())) {
            return 0;
        }
        return AlarmEmitter.flushSample(peekRevision, companion.evictLayout()) ? 1 : 2;
    }

    private static final int injectMetric(int i) {
        WaveMolder.Companion companion = WaveMolder.INSTANCE;
        if (WaveMolder.drawField(i, companion.evictLayout())) {
            return 0;
        }
        if (WaveMolder.drawField(i, companion.flushSample())) {
            return 1;
        }
        if (WaveMolder.drawField(i, companion.growPayload())) {
            return 2;
        }
        if (WaveMolder.drawField(i, companion.injectMetric())) {
            return 3;
        }
        if (WaveMolder.drawField(i, companion.clipOrigin())) {
            return 4;
        }
        if (WaveMolder.drawField(i, companion.detachStream())) {
            return 5;
        }
        if (WaveMolder.drawField(i, companion.releaseHeader())) {
            return 6;
        }
        throw new IllegalStateException("Invalid PlaceholderVerticalAlign");
    }

    private static final void releaseHeader(Spannable spannable, Placeholder placeholder, int i, int i2, BackgroundCollection backgroundCollection) {
        for (Object obj : spannable.getSpans(i, i2, SlideRecovery.class)) {
            spannable.removeSpan((SlideRecovery) obj);
        }
        SpanImporter.drawScope(spannable, new TransitionScheduler(PooledStatus.serializeOffset(placeholder.getWidth()), evictLayout(placeholder.getWidth()), PooledStatus.serializeOffset(placeholder.getHeight()), evictLayout(placeholder.getHeight()), backgroundCollection.getFontScale() * backgroundCollection.getDensity(), injectMetric(placeholder.getPlaceholderVerticalAlign())), i, i2);
    }

    private static /* synthetic */ void detachStream(int i) {
    }

    private static /* synthetic */ void growPayload(long j) {
    }
}
