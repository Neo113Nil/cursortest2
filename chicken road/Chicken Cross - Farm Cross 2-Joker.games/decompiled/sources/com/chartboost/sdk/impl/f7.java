package com.chartboost.sdk.impl;

import com.chartboost.sdk.Mediation;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public final class f7 {

    /* renamed from: a, reason: collision with root package name */
    public final jh f4766a;
    public final List b;
    public final String c;
    public final Mediation d;
    public final List e;

    public f7(jh eventData, List pendingTrackers, String str, Mediation mediation, List trackingErrorTrackers) {
        Intrinsics.checkNotNullParameter(eventData, "eventData");
        Intrinsics.checkNotNullParameter(pendingTrackers, "pendingTrackers");
        Intrinsics.checkNotNullParameter(trackingErrorTrackers, "trackingErrorTrackers");
        this.f4766a = eventData;
        this.b = pendingTrackers;
        this.c = str;
        this.d = mediation;
        this.e = trackingErrorTrackers;
    }

    public final jh a() {
        return this.f4766a;
    }

    public final String b() {
        return this.c;
    }

    public final Mediation c() {
        return this.d;
    }

    public final List d() {
        return this.b;
    }

    public final List e() {
        return this.e;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof f7)) {
            return false;
        }
        f7 f7Var = (f7) obj;
        return Intrinsics.areEqual(this.f4766a, f7Var.f4766a) && Intrinsics.areEqual(this.b, f7Var.b) && Intrinsics.areEqual(this.c, f7Var.c) && Intrinsics.areEqual(this.d, f7Var.d) && Intrinsics.areEqual(this.e, f7Var.e);
    }

    public int hashCode() {
        int hashCode = ((this.f4766a.hashCode() * 31) + this.b.hashCode()) * 31;
        String str = this.c;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        Mediation mediation = this.d;
        return ((hashCode2 + (mediation != null ? mediation.hashCode() : 0)) * 31) + this.e.hashCode();
    }

    public String toString() {
        return "EventProcessingRequest(eventData=" + this.f4766a + ", pendingTrackers=" + this.b + ", eventTypeName=" + this.c + ", mediation=" + this.d + ", trackingErrorTrackers=" + this.e + ")";
    }
}
