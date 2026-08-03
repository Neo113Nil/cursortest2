package com.inmobi.media;

/* renamed from: com.inmobi.media.fn, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C2417fn extends com.inmobi.media.AbstractC2493im {

    /* renamed from: a, reason: collision with root package name */
    public final long f5207a;

    public C2417fn(long j) {
        this.f5207a = j;
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof com.inmobi.media.C2417fn) && this.f5207a == ((com.inmobi.media.C2417fn) obj).f5207a;
    }

    public final int hashCode() {
        return kotlin.UByte$$ExternalSyntheticBackport0.m(this.f5207a);
    }

    public final java.lang.String toString() {
        return "VideoPause(currentPlaybackTime=" + this.f5207a + ")";
    }
}
