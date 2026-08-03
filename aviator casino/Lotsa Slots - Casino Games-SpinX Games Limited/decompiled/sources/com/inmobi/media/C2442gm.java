package com.inmobi.media;

/* renamed from: com.inmobi.media.gm, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C2442gm extends com.inmobi.media.AbstractC2493im {

    /* renamed from: a, reason: collision with root package name */
    public final long f5226a;

    public C2442gm(long j) {
        this.f5226a = j;
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof com.inmobi.media.C2442gm) && this.f5226a == ((com.inmobi.media.C2442gm) obj).f5226a;
    }

    public final int hashCode() {
        return kotlin.UByte$$ExternalSyntheticBackport0.m(this.f5226a);
    }

    public final java.lang.String toString() {
        return "VideoComplete(duration=" + this.f5226a + ")";
    }
}
