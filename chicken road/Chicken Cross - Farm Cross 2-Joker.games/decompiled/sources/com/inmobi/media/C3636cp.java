package com.inmobi.media;

/* renamed from: com.inmobi.media.cp, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C3636cp extends AbstractC3691eo {

    /* renamed from: a, reason: collision with root package name */
    public final long f7056a;

    public C3636cp(long j) {
        this.f7056a = j;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C3636cp) && this.f7056a == ((C3636cp) obj).f7056a;
    }

    public final int hashCode() {
        return Long.hashCode(this.f7056a);
    }

    public final String toString() {
        return "VideoPause(currentPlaybackTime=" + this.f7056a + ")";
    }
}
