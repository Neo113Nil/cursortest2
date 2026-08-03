package com.google.android.exoplayer2.offline;

/* loaded from: classes3.dex */
public interface DownloadIndex {
    com.google.android.exoplayer2.offline.Download getDownload(java.lang.String str) throws java.io.IOException;

    com.google.android.exoplayer2.offline.DownloadCursor getDownloads(int... iArr) throws java.io.IOException;
}
