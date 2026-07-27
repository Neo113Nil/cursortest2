package com.chartboost.sdk.impl;

import com.google.android.exoplayer2.MediaItem;
import com.google.android.exoplayer2.offline.Download;
import com.google.android.exoplayer2.offline.DownloadRequest;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public final class z7 {

    /* renamed from: a, reason: collision with root package name */
    public final s7 f5098a;

    public z7(s7 downloadManager) {
        Intrinsics.checkNotNullParameter(downloadManager, "downloadManager");
        this.f5098a = downloadManager;
    }

    public final MediaItem a(wj asset) {
        Download a2;
        DownloadRequest downloadRequest;
        Intrinsics.checkNotNullParameter(asset, "asset");
        t6 a3 = this.f5098a.a(asset.d());
        if (a3 == null || (a2 = a3.a()) == null || (downloadRequest = a2.request) == null) {
            return null;
        }
        return downloadRequest.toMediaItem();
    }
}
