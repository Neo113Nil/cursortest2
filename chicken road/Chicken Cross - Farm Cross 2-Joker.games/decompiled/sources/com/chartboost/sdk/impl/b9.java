package com.chartboost.sdk.impl;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public final class b9 implements qj {

    /* renamed from: a, reason: collision with root package name */
    public final String f4690a;

    public b9(String str) {
        this.f4690a = str;
    }

    public final String a() {
        return this.f4690a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof b9) && Intrinsics.areEqual(this.f4690a, ((b9) obj).f4690a);
    }

    public int hashCode() {
        String str = this.f4690a;
        if (str == null) {
            return 0;
        }
        return str.hashCode();
    }

    public String toString() {
        return "IFrameResource(url=" + this.f4690a + ")";
    }
}
