package android.support.v4.media.session;

import android.media.MediaDescription;
import android.media.session.MediaSession;

/* JADX INFO: loaded from: classes.dex */
public abstract class r {
    public static MediaSession.QueueItem a(MediaDescription mediaDescription, long j) {
        return new MediaSession.QueueItem(mediaDescription, j);
    }

    public static MediaDescription b(MediaSession.QueueItem queueItem) {
        return queueItem.getDescription();
    }

    public static long c(MediaSession.QueueItem queueItem) {
        return queueItem.getQueueId();
    }
}
