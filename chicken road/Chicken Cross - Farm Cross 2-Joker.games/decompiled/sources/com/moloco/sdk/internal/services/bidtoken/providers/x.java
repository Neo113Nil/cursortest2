package com.moloco.sdk.internal.services.bidtoken.providers;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes7.dex */
public final class x {
    public static final int b = 0;

    /* renamed from: a, reason: collision with root package name */
    public final String f10766a;

    public x(String str) {
        this.f10766a = str;
    }

    public final String a() {
        return this.f10766a;
    }

    public final String b() {
        return this.f10766a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof x) && Intrinsics.areEqual(this.f10766a, ((x) obj).f10766a);
    }

    public int hashCode() {
        String str = this.f10766a;
        if (str == null) {
            return 0;
        }
        return str.hashCode();
    }

    public String toString() {
        return "TestConfigSignal(configJson=" + this.f10766a + ')';
    }

    public final x a(String str) {
        return new x(str);
    }

    public static /* synthetic */ x a(x xVar, String str, int i, Object obj) {
        if ((i & 1) != 0) {
            str = xVar.f10766a;
        }
        return xVar.a(str);
    }
}
