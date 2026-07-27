package com.inmobi.media;

import kotlin.jvm.internal.Intrinsics;

/* renamed from: com.inmobi.media.c7, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C3618c7 extends AbstractC3646d7 {

    /* renamed from: a, reason: collision with root package name */
    public final C4197wn f7042a;

    public C3618c7() {
        this.f7042a = null;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C3618c7) && Intrinsics.areEqual(this.f7042a, ((C3618c7) obj).f7042a);
    }

    public final int hashCode() {
        C4197wn c4197wn = this.f7042a;
        if (c4197wn == null) {
            return 0;
        }
        return c4197wn.hashCode();
    }

    public final String toString() {
        return "UnAvailable(vastBeaconData=" + this.f7042a + ")";
    }

    public C3618c7(C4197wn c4197wn) {
        this.f7042a = c4197wn;
    }
}
