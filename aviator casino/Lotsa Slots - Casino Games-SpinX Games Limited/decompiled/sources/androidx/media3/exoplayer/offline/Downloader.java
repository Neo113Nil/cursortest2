package androidx.media3.exoplayer.offline;

/* loaded from: classes2.dex */
public interface Downloader {

    public interface ProgressListener {
        void onProgress(long j, long j2, float f);
    }

    void cancel();

    void download(androidx.media3.exoplayer.offline.Downloader.ProgressListener progressListener) throws java.io.IOException, java.lang.InterruptedException;

    void remove();
}
