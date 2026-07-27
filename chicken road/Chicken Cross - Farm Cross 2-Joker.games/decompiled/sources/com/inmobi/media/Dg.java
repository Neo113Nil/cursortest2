package com.inmobi.media;

import java.util.Set;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes6.dex */
public final class Dg {

    /* renamed from: a, reason: collision with root package name */
    public final String f6514a;
    public final Set b;

    public Dg(String appVersion, Set reportedEvents) {
        Intrinsics.checkNotNullParameter(appVersion, "appVersion");
        Intrinsics.checkNotNullParameter(reportedEvents, "reportedEvents");
        this.f6514a = appVersion;
        this.b = reportedEvents;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Dg)) {
            return false;
        }
        Dg dg = (Dg) obj;
        return Intrinsics.areEqual(this.f6514a, dg.f6514a) && Intrinsics.areEqual(this.b, dg.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.f6514a.hashCode() * 31);
    }

    public final String toString() {
        return "ReporterState(appVersion=" + this.f6514a + ", reportedEvents=" + this.b + ")";
    }
}
