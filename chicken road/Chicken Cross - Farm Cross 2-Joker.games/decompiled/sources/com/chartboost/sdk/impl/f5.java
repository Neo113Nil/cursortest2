package com.chartboost.sdk.impl;

import com.chartboost.sdk.internal.Model.EndpointConfig;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public final class f5 {

    /* renamed from: a, reason: collision with root package name */
    public final String f4765a;
    public final boolean b;
    public final String c;
    public final boolean d;
    public final EndpointConfig e;

    public f5(String str, boolean z, String webViewVersion, boolean z2, EndpointConfig nrpWaterfallEndpoints) {
        Intrinsics.checkNotNullParameter(webViewVersion, "webViewVersion");
        Intrinsics.checkNotNullParameter(nrpWaterfallEndpoints, "nrpWaterfallEndpoints");
        this.f4765a = str;
        this.b = z;
        this.c = webViewVersion;
        this.d = z2;
        this.e = nrpWaterfallEndpoints;
    }

    public final String a() {
        return this.f4765a;
    }

    public final boolean b() {
        return this.d;
    }

    public final EndpointConfig c() {
        return this.e;
    }

    public final boolean d() {
        return this.b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof f5)) {
            return false;
        }
        f5 f5Var = (f5) obj;
        return Intrinsics.areEqual(this.f4765a, f5Var.f4765a) && this.b == f5Var.b && Intrinsics.areEqual(this.c, f5Var.c) && this.d == f5Var.d && Intrinsics.areEqual(this.e, f5Var.e);
    }

    public int hashCode() {
        String str = this.f4765a;
        return ((((((((str == null ? 0 : str.hashCode()) * 31) + Boolean.hashCode(this.b)) * 31) + this.c.hashCode()) * 31) + Boolean.hashCode(this.d)) * 31) + this.e.hashCode();
    }

    public String toString() {
        return "ConfigurationBodyFields(configVariant=" + this.f4765a + ", webViewEnabled=" + this.b + ", webViewVersion=" + this.c + ", nrpWaterfallEnabled=" + this.d + ", nrpWaterfallEndpoints=" + this.e + ")";
    }
}
