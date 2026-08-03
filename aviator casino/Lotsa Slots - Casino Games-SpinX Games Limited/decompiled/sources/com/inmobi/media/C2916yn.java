package com.inmobi.media;

/* renamed from: com.inmobi.media.yn, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C2916yn extends com.inmobi.media.AbstractC2493im {

    /* renamed from: a, reason: collision with root package name */
    public final long f5577a;

    public C2916yn(long j) {
        this.f5577a = j;
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof com.inmobi.media.C2916yn) && this.f5577a == ((com.inmobi.media.C2916yn) obj).f5577a;
    }

    public final int hashCode() {
        return kotlin.UByte$$ExternalSyntheticBackport0.m(this.f5577a);
    }

    public final java.lang.String toString() {
        return "VideoResume(currentPlaybackTime=" + this.f5577a + ")";
    }
}
