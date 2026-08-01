package com.inmobi.media;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes6.dex */
public final class W5 {

    /* renamed from: a, reason: collision with root package name */
    public final boolean f6924a;
    public final String b;

    public W5(String str, boolean z) {
        this.f6924a = z;
        this.b = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof W5)) {
            return false;
        }
        W5 w5 = (W5) obj;
        return this.f6924a == w5.f6924a && Intrinsics.areEqual(this.b, w5.b);
    }

    public final int hashCode() {
        int hashCode = Boolean.hashCode(this.f6924a) * 31;
        String str = this.b;
        return hashCode + (str == null ? 0 : str.hashCode());
    }

    public final String toString() {
        return "PlayStoreSnapshot(disabled=" + this.f6924a + ", version=" + this.b + ")";
    }
}
