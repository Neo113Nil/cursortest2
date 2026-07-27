package com.inmobi.media;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes6.dex */
public final class Tb {

    /* renamed from: a, reason: collision with root package name */
    public final int f6870a;
    public final Integer b;

    public Tb(int i) {
        this.f6870a = i;
        this.b = null;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Tb)) {
            return false;
        }
        Tb tb = (Tb) obj;
        return this.f6870a == tb.f6870a && Intrinsics.areEqual(this.b, tb.b);
    }

    public final int hashCode() {
        int hashCode = Integer.hashCode(this.f6870a) * 31;
        Integer num = this.b;
        return hashCode + (num == null ? 0 : num.hashCode());
    }

    public final String toString() {
        return "OpenRequestResultData(result=" + this.f6870a + ", errorCode=" + this.b + ")";
    }

    public Tb(int i, Integer num) {
        this.f6870a = i;
        this.b = num;
    }
}
