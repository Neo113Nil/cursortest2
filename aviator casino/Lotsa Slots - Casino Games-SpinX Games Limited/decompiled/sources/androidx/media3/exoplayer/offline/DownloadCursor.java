package androidx.media3.exoplayer.offline;

/* loaded from: classes2.dex */
public interface DownloadCursor extends java.io.Closeable {
    @Override // java.io.Closeable, java.lang.AutoCloseable
    void close();

    int getCount();

    androidx.media3.exoplayer.offline.Download getDownload();

    int getPosition();

    boolean isAfterLast();

    boolean isBeforeFirst();

    boolean isClosed();

    boolean isFirst();

    boolean isLast();

    boolean moveToFirst();

    boolean moveToLast();

    boolean moveToNext();

    boolean moveToPosition(int i);

    boolean moveToPrevious();

    /* renamed from: androidx.media3.exoplayer.offline.DownloadCursor$-CC, reason: invalid class name */
    public final /* synthetic */ class CC {
        public static boolean $default$isFirst(androidx.media3.exoplayer.offline.DownloadCursor _this) {
            return _this.getPosition() == 0 && _this.getCount() != 0;
        }

        public static boolean $default$isLast(androidx.media3.exoplayer.offline.DownloadCursor _this) {
            int count = _this.getCount();
            return _this.getPosition() == count + (-1) && count != 0;
        }

        public static boolean $default$isBeforeFirst(androidx.media3.exoplayer.offline.DownloadCursor _this) {
            return _this.getCount() == 0 || _this.getPosition() == -1;
        }

        public static boolean $default$isAfterLast(androidx.media3.exoplayer.offline.DownloadCursor _this) {
            return _this.getCount() == 0 || _this.getPosition() == _this.getCount();
        }
    }
}
