package com.chartboost.sdk.impl;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public final class u8 implements qj {

    /* renamed from: a, reason: collision with root package name */
    public final String f5028a;

    public u8(String str) {
        this.f5028a = str;
    }

    public final String a() {
        return this.f5028a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof u8) && Intrinsics.areEqual(this.f5028a, ((u8) obj).f5028a);
    }

    public int hashCode() {
        String str = this.f5028a;
        if (str == null) {
            return 0;
        }
        return str.hashCode();
    }

    public String toString() {
        return "HtmlResource(html=" + this.f5028a + ")";
    }
}
