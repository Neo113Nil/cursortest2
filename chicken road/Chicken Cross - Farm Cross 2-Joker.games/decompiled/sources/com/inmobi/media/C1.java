package com.inmobi.media;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes6.dex */
public final class C1 {

    /* renamed from: a, reason: collision with root package name */
    public final String f6485a;
    public final String b;

    public C1(String networkName, String format) {
        Intrinsics.checkNotNullParameter(networkName, "networkName");
        Intrinsics.checkNotNullParameter(format, "format");
        this.f6485a = networkName;
        this.b = format;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1)) {
            return false;
        }
        C1 c1 = (C1) obj;
        return Intrinsics.areEqual(this.f6485a, c1.f6485a) && Intrinsics.areEqual(this.b, c1.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.f6485a.hashCode() * 31);
    }

    public final String toString() {
        return "AppActivityMapping(networkName=" + this.f6485a + ", format=" + this.b + ")";
    }
}
