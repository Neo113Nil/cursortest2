package com.chartboost.sdk.impl;

import com.google.android.exoplayer2.offline.Download;
import com.google.android.exoplayer2.offline.DownloadCursor;
import com.google.android.exoplayer2.offline.DownloadManager;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public abstract class bj {
    public static final List a(DownloadCursor downloadCursor) {
        Intrinsics.checkNotNullParameter(downloadCursor, "<this>");
        ArrayList arrayList = new ArrayList();
        while (downloadCursor.moveToNext()) {
            Download download = downloadCursor.getDownload();
            Intrinsics.checkNotNullExpressionValue(download, "getDownload(...)");
            arrayList.add(u6.a(download));
        }
        return arrayList;
    }

    public static final List a(DownloadManager downloadManager) {
        Intrinsics.checkNotNullParameter(downloadManager, "<this>");
        DownloadCursor downloads = downloadManager.getDownloadIndex().getDownloads(new int[0]);
        Intrinsics.checkNotNullExpressionValue(downloads, "getDownloads(...)");
        return a(downloads);
    }

    public static final t6 a(DownloadManager downloadManager, String id) {
        Intrinsics.checkNotNullParameter(downloadManager, "<this>");
        Intrinsics.checkNotNullParameter(id, "id");
        Download download = downloadManager.getDownloadIndex().getDownload(id);
        if (download != null) {
            return u6.a(download);
        }
        return null;
    }
}
