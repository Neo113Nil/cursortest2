package com.inmobi.media;

import kotlin.jvm.internal.Intrinsics;

/* renamed from: com.inmobi.media.yi, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C4246yi extends Ai {

    /* renamed from: a, reason: collision with root package name */
    public final int f7505a;
    public final String b;

    public C4246yi(String message, int i) {
        Intrinsics.checkNotNullParameter(message, "message");
        this.f7505a = i;
        this.b = message;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C4246yi)) {
            return false;
        }
        C4246yi c4246yi = (C4246yi) obj;
        return this.f7505a == c4246yi.f7505a && Intrinsics.areEqual(this.b, c4246yi.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (Integer.hashCode(this.f7505a) * 31);
    }

    public final String toString() {
        return "Failure(statusCode=" + this.f7505a + ", message=" + this.b + ")";
    }
}
