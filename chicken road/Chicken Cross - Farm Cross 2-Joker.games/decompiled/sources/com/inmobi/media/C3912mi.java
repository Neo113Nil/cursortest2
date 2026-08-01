package com.inmobi.media;

import android.view.View;
import com.inmobi.media.ads.nativeAd.InMobiNativeViewData;
import com.inmobi.media.ads.nativeAd.MediaView;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: com.inmobi.media.mi, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C3912mi {

    /* renamed from: a, reason: collision with root package name */
    public final InMobiNativeViewData f7250a;
    public final MediaView b;
    public final View c;

    public C3912mi(InMobiNativeViewData pubView, MediaView mediaView, View view) {
        Intrinsics.checkNotNullParameter(pubView, "pubView");
        this.f7250a = pubView;
        this.b = mediaView;
        this.c = view;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C3912mi)) {
            return false;
        }
        C3912mi c3912mi = (C3912mi) obj;
        return Intrinsics.areEqual(this.f7250a, c3912mi.f7250a) && Intrinsics.areEqual(this.b, c3912mi.b) && Intrinsics.areEqual(this.c, c3912mi.c);
    }

    public final int hashCode() {
        int hashCode = this.f7250a.hashCode() * 31;
        MediaView mediaView = this.b;
        int hashCode2 = (hashCode + (mediaView == null ? 0 : mediaView.hashCode())) * 31;
        View view = this.c;
        return hashCode2 + (view != null ? view.hashCode() : 0);
    }

    public final String toString() {
        return "PublisherNativeViewData(pubView=" + this.f7250a + ", mediaView=" + this.b + ", adChoice=" + this.c + ")";
    }
}
