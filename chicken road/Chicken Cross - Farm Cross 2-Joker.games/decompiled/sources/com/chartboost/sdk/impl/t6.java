package com.chartboost.sdk.impl;

import com.google.android.exoplayer2.offline.Download;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public final class t6 {

    /* renamed from: a, reason: collision with root package name */
    public final Download f5013a;

    public t6(Download download) {
        Intrinsics.checkNotNullParameter(download, "download");
        this.f5013a = download;
    }

    public final Download a() {
        return this.f5013a;
    }

    public final String b() {
        String id = this.f5013a.request.id;
        Intrinsics.checkNotNullExpressionValue(id, "id");
        return id;
    }

    public final float c() {
        return this.f5013a.getPercentDownloaded();
    }

    public final int d() {
        return this.f5013a.state;
    }

    public final long e() {
        return this.f5013a.updateTimeMs;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof t6) && Intrinsics.areEqual(this.f5013a, ((t6) obj).f5013a);
    }

    public final String f() {
        String uri = this.f5013a.request.uri.toString();
        Intrinsics.checkNotNullExpressionValue(uri, "toString(...)");
        return uri;
    }

    public int hashCode() {
        return this.f5013a.hashCode();
    }

    public String toString() {
        return "DownloadWrapper(download=" + this.f5013a + ")";
    }
}
