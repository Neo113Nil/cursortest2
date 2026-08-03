package androidx.media3.exoplayer.offline;

/* loaded from: classes2.dex */
public interface DownloadIndex {
    androidx.media3.exoplayer.offline.Download getDownload(java.lang.String str) throws java.io.IOException;

    androidx.media3.exoplayer.offline.DownloadCursor getDownloads(int... iArr) throws java.io.IOException;
}
