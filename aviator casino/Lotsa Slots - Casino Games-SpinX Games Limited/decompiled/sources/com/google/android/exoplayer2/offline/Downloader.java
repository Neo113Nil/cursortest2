package com.google.android.exoplayer2.offline;

/* loaded from: classes3.dex */
public interface Downloader {

    public interface ProgressListener {
        void onProgress(long j, long j2, float f);
    }

    void cancel();

    void download(com.google.android.exoplayer2.offline.Downloader.ProgressListener progressListener) throws java.io.IOException, java.lang.InterruptedException;

    void remove();
}
