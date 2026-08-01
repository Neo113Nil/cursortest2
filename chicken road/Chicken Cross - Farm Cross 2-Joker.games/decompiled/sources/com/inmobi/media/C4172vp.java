package com.inmobi.media;

/* renamed from: com.inmobi.media.vp, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C4172vp extends AbstractC3691eo {

    /* renamed from: a, reason: collision with root package name */
    public final long f7445a;

    public C4172vp(long j) {
        this.f7445a = j;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C4172vp) && this.f7445a == ((C4172vp) obj).f7445a;
    }

    public final int hashCode() {
        return Long.hashCode(this.f7445a);
    }

    public final String toString() {
        return "VideoResume(currentPlaybackTime=" + this.f7445a + ")";
    }
}
