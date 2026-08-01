package com.moloco.sdk.internal.services.init;

import com.moloco.sdk.Init;
import com.moloco.sdk.internal.x;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes7.dex */
public final class c {
    public static final int c = 0;

    /* renamed from: a, reason: collision with root package name */
    public final x<Init.SDKInitResponse, j> f10803a;
    public final String b;

    public c(x<Init.SDKInitResponse, j> sdkInitResult, String fetchType) {
        Intrinsics.checkNotNullParameter(sdkInitResult, "sdkInitResult");
        Intrinsics.checkNotNullParameter(fetchType, "fetchType");
        this.f10803a = sdkInitResult;
        this.b = fetchType;
    }

    public final x<Init.SDKInitResponse, j> a() {
        return this.f10803a;
    }

    public final String b() {
        return this.b;
    }

    public final String c() {
        return this.b;
    }

    public final x<Init.SDKInitResponse, j> d() {
        return this.f10803a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c)) {
            return false;
        }
        c cVar = (c) obj;
        return Intrinsics.areEqual(this.f10803a, cVar.f10803a) && Intrinsics.areEqual(this.b, cVar.b);
    }

    public int hashCode() {
        return (this.f10803a.hashCode() * 31) + this.b.hashCode();
    }

    public String toString() {
        return "FetchState(sdkInitResult=" + this.f10803a + ", fetchType=" + this.b + ')';
    }

    public final c a(x<Init.SDKInitResponse, j> sdkInitResult, String fetchType) {
        Intrinsics.checkNotNullParameter(sdkInitResult, "sdkInitResult");
        Intrinsics.checkNotNullParameter(fetchType, "fetchType");
        return new c(sdkInitResult, fetchType);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ c a(c cVar, x xVar, String str, int i, Object obj) {
        if ((i & 1) != 0) {
            xVar = cVar.f10803a;
        }
        if ((i & 2) != 0) {
            str = cVar.b;
        }
        return cVar.a(xVar, str);
    }
}
