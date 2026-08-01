package com.chartboost.sdk.impl;

import com.ironsource.mediationsdk.utils.IronSourceConstants;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONObject;

/* loaded from: classes4.dex */
public final class k5 {
    public static final a c = new a(null);

    /* renamed from: a, reason: collision with root package name */
    public final long f4837a;
    public final long b;

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final k5 a(JSONObject jsonObject) {
            Intrinsics.checkNotNullParameter(jsonObject, "jsonObject");
            return new k5(jsonObject.optLong(IronSourceConstants.EVENTS_DURATION, 30L), jsonObject.optLong("delay"));
        }

        public a() {
        }
    }

    public k5(long j, long j2) {
        this.f4837a = j;
        this.b = j2;
    }

    public final long a() {
        return this.b;
    }

    public final long b() {
        return this.f4837a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof k5)) {
            return false;
        }
        k5 k5Var = (k5) obj;
        return this.f4837a == k5Var.f4837a && this.b == k5Var.b;
    }

    public int hashCode() {
        return (Long.hashCode(this.f4837a) * 31) + Long.hashCode(this.b);
    }

    public String toString() {
        return "Countdown(duration=" + this.f4837a + ", delay=" + this.b + ")";
    }
}
