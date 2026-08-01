package com.inmobi.media;

import com.inmobi.media.ads.nativeAd.MediaView;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: com.inmobi.media.b7, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C3589b7 extends AbstractC3646d7 {

    /* renamed from: a, reason: collision with root package name */
    public final MediaView f7025a;
    public final C4197wn b;

    public C3589b7(MediaView mediaView, C4197wn c4197wn) {
        Intrinsics.checkNotNullParameter(mediaView, "mediaView");
        this.f7025a = mediaView;
        this.b = c4197wn;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C3589b7)) {
            return false;
        }
        C3589b7 c3589b7 = (C3589b7) obj;
        return Intrinsics.areEqual(this.f7025a, c3589b7.f7025a) && Intrinsics.areEqual(this.b, c3589b7.b);
    }

    public final int hashCode() {
        int hashCode = this.f7025a.hashCode() * 31;
        C4197wn c4197wn = this.b;
        return hashCode + (c4197wn == null ? 0 : c4197wn.hashCode());
    }

    public final String toString() {
        return "Success(mediaView=" + this.f7025a + ", vastBeaconData=" + this.b + ")";
    }
}
