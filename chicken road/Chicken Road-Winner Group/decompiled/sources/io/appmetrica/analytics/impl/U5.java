package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.networktasks.internal.BaseRequestConfig;

/* loaded from: classes.dex */
public class U5 extends BaseRequestConfig {

    /* renamed from: a, reason: collision with root package name */
    public String f6714a;

    /* renamed from: b, reason: collision with root package name */
    public String f6715b;

    /* renamed from: c, reason: collision with root package name */
    public C0605jm f6716c;

    public final String b() {
        return this.f6715b;
    }

    @Override // io.appmetrica.analytics.networktasks.internal.BaseRequestConfig
    public String toString() {
        return "CoreRequestConfig{mAppDebuggable='" + this.f6714a + "', mAppSystem='" + this.f6715b + "', startupState=" + this.f6716c + '}';
    }

    public final String a() {
        return this.f6714a;
    }
}
