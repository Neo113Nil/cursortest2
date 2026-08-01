package com.inmobi.media;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes6.dex */
public final class Cl extends El {

    /* renamed from: a, reason: collision with root package name */
    public final String f6498a;
    public final short b;
    public final String c;
    public final Throwable d;

    public Cl(String collectorId, short s, String str, Exception exc, int i) {
        str = (i & 4) != 0 ? null : str;
        exc = (i & 8) != 0 ? null : exc;
        Intrinsics.checkNotNullParameter(collectorId, "collectorId");
        this.f6498a = collectorId;
        this.b = s;
        this.c = str;
        this.d = exc;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Cl)) {
            return false;
        }
        Cl cl = (Cl) obj;
        return Intrinsics.areEqual(this.f6498a, cl.f6498a) && this.b == cl.b && Intrinsics.areEqual(this.c, cl.c) && Intrinsics.areEqual(this.d, cl.d);
    }

    public final int hashCode() {
        int hashCode = (Short.hashCode(this.b) + (this.f6498a.hashCode() * 31)) * 31;
        String str = this.c;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        Throwable th = this.d;
        return hashCode2 + (th != null ? th.hashCode() : 0);
    }

    public final String toString() {
        String str = this.f6498a;
        short s = this.b;
        return "Failure(collectorId=" + str + ", errorCode=" + ((int) s) + ", reason=" + this.c + ", throwable=" + this.d + ")";
    }
}
