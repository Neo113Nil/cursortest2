package com.inmobi.media;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: com.inmobi.media.lm, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C3888lm {

    /* renamed from: a, reason: collision with root package name */
    public final boolean f7231a;
    public final boolean b;
    public final boolean c;
    public final boolean d;
    public final boolean e;
    public final List f;
    public final double g;

    public C3888lm(boolean z, boolean z2, boolean z3, boolean z4, boolean z5, List priorityEventsList, double d) {
        Intrinsics.checkNotNullParameter(priorityEventsList, "priorityEventsList");
        this.f7231a = z;
        this.b = z2;
        this.c = z3;
        this.d = z4;
        this.e = z5;
        this.f = priorityEventsList;
        this.g = d;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C3888lm)) {
            return false;
        }
        C3888lm c3888lm = (C3888lm) obj;
        return this.f7231a == c3888lm.f7231a && this.b == c3888lm.b && this.c == c3888lm.c && this.d == c3888lm.d && this.e == c3888lm.e && Intrinsics.areEqual(this.f, c3888lm.f) && Double.compare(this.g, c3888lm.g) == 0;
    }

    public final int hashCode() {
        return Double.hashCode(this.g) + ((this.f.hashCode() + ((Boolean.hashCode(this.e) + ((Boolean.hashCode(this.d) + ((Boolean.hashCode(this.c) + ((Boolean.hashCode(this.b) + (Boolean.hashCode(this.f7231a) * 31)) * 31)) * 31)) * 31)) * 31)) * 31);
    }

    public final String toString() {
        return "TelemetryConfigMetaData(isTelemetryEnabled=" + this.f7231a + ", isImageEnabled=" + this.b + ", isGIFEnabled=" + this.c + ", isVideoEnabled=" + this.d + ", isGeneralEventsDisabled=" + this.e + ", priorityEventsList=" + this.f + ", samplingFactor=" + this.g + ")";
    }
}
