package io.appmetrica.analytics.impl;

import java.util.HashMap;

/* loaded from: classes.dex */
public final class Ah {

    /* renamed from: a, reason: collision with root package name */
    public final W5 f5699a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f5700b;

    /* renamed from: c, reason: collision with root package name */
    public final int f5701c;

    /* renamed from: d, reason: collision with root package name */
    public final HashMap f5702d;

    /* renamed from: e, reason: collision with root package name */
    public final Kh f5703e;

    public Ah(W5 w5, boolean z3, int i3, HashMap hashMap, Kh kh) {
        this.f5699a = w5;
        this.f5700b = z3;
        this.f5701c = i3;
        this.f5702d = hashMap;
        this.f5703e = kh;
    }

    public final String toString() {
        return "ReportToSend(report=" + this.f5699a + ", serviceDataReporterType=" + this.f5701c + ", environment=" + this.f5703e + ", isCrashReport=" + this.f5700b + ", trimmedFields=" + this.f5702d + ')';
    }
}
