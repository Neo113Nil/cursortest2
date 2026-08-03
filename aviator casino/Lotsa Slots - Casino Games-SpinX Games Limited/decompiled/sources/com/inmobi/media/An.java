package com.inmobi.media;

/* loaded from: classes5.dex */
public final class An extends com.inmobi.media.AbstractC2493im {

    /* renamed from: a, reason: collision with root package name */
    public final long f4609a;

    public An(long j) {
        this.f4609a = j;
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof com.inmobi.media.An) && this.f4609a == ((com.inmobi.media.An) obj).f4609a;
    }

    public final int hashCode() {
        return kotlin.UByte$$ExternalSyntheticBackport0.m(this.f4609a);
    }

    public final java.lang.String toString() {
        return "VideoSkipped(currentPlaybackTime=" + this.f4609a + ")";
    }
}
