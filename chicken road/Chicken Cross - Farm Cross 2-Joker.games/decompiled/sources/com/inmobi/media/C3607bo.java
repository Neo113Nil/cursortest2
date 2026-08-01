package com.inmobi.media;

/* renamed from: com.inmobi.media.bo, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C3607bo extends AbstractC3691eo {

    /* renamed from: a, reason: collision with root package name */
    public final long f7034a;

    public C3607bo(long j) {
        this.f7034a = j;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C3607bo) && this.f7034a == ((C3607bo) obj).f7034a;
    }

    public final int hashCode() {
        return Long.hashCode(this.f7034a);
    }

    public final String toString() {
        return "VideoComplete(duration=" + this.f7034a + ")";
    }
}
