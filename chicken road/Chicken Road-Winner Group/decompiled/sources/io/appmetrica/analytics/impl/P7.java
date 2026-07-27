package io.appmetrica.analytics.impl;

import java.util.HashMap;
import java.util.Map;

/* loaded from: classes.dex */
public final class P7 {

    /* renamed from: a, reason: collision with root package name */
    public final Map f6410a;

    /* renamed from: b, reason: collision with root package name */
    public final String f6411b;

    /* renamed from: c, reason: collision with root package name */
    public final String f6412c;

    public P7(String str, HashMap hashMap, String str2) {
        this.f6411b = str;
        this.f6410a = hashMap;
        this.f6412c = str2;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("DeferredDeeplinkState{mParameters=");
        sb.append(this.f6410a);
        sb.append(", mDeeplink='");
        sb.append(this.f6411b);
        sb.append("', mUnparsedReferrer='");
        return B0.c.l(sb, this.f6412c, "'}");
    }
}
