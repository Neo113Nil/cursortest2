package com.inmobi.media;

/* renamed from: com.inmobi.media.xp, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C4226xp extends AbstractC3691eo {

    /* renamed from: a, reason: collision with root package name */
    public final long f7487a;

    public C4226xp(long j) {
        this.f7487a = j;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C4226xp) && this.f7487a == ((C4226xp) obj).f7487a;
    }

    public final int hashCode() {
        return Long.hashCode(this.f7487a);
    }

    public final String toString() {
        return "VideoSkipped(currentPlaybackTime=" + this.f7487a + ")";
    }
}
