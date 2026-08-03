package com.inmobi.media;

/* renamed from: com.inmobi.media.pk, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C2677pk {

    /* renamed from: a, reason: collision with root package name */
    public final boolean f5395a;
    public final boolean b;
    public final boolean c;
    public final boolean d;
    public final boolean e;
    public final java.util.List f;
    public final double g;

    public C2677pk(boolean z, boolean z2, boolean z3, boolean z4, boolean z5, java.util.List priorityEventsList, double d) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(priorityEventsList, "priorityEventsList");
        this.f5395a = z;
        this.b = z2;
        this.c = z3;
        this.d = z4;
        this.e = z5;
        this.f = priorityEventsList;
        this.g = d;
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof com.inmobi.media.C2677pk)) {
            return false;
        }
        com.inmobi.media.C2677pk c2677pk = (com.inmobi.media.C2677pk) obj;
        return this.f5395a == c2677pk.f5395a && this.b == c2677pk.b && this.c == c2677pk.c && this.d == c2677pk.d && this.e == c2677pk.e && kotlin.jvm.internal.Intrinsics.areEqual(this.f, c2677pk.f) && java.lang.Double.compare(this.g, c2677pk.g) == 0;
    }

    public final int hashCode() {
        return androidx.compose.animation.core.ComplexDouble$$ExternalSyntheticBackport0.m(this.g) + ((this.f.hashCode() + ((kotlin.UByte$$ExternalSyntheticBackport0.m(this.e) + ((kotlin.UByte$$ExternalSyntheticBackport0.m(this.d) + ((kotlin.UByte$$ExternalSyntheticBackport0.m(this.c) + ((kotlin.UByte$$ExternalSyntheticBackport0.m(this.b) + (kotlin.UByte$$ExternalSyntheticBackport0.m(this.f5395a) * 31)) * 31)) * 31)) * 31)) * 31)) * 31);
    }

    public final java.lang.String toString() {
        return "TelemetryConfigMetaData(isTelemetryEnabled=" + this.f5395a + ", isImageEnabled=" + this.b + ", isGIFEnabled=" + this.c + ", isVideoEnabled=" + this.d + ", isGeneralEventsDisabled=" + this.e + ", priorityEventsList=" + this.f + ", samplingFactor=" + this.g + ")";
    }
}
