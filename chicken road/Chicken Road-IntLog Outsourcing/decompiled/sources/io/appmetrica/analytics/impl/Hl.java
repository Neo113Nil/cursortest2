package io.appmetrica.analytics.impl;

/* loaded from: classes.dex */
public final class Hl {

    /* renamed from: a, reason: collision with root package name */
    public final String f6890a;

    /* renamed from: b, reason: collision with root package name */
    public final String f6891b;

    /* renamed from: c, reason: collision with root package name */
    public final Integer f6892c;

    /* renamed from: d, reason: collision with root package name */
    public final Integer f6893d;

    /* renamed from: e, reason: collision with root package name */
    public final String f6894e;

    /* renamed from: f, reason: collision with root package name */
    public final Boolean f6895f;

    public Hl(String str, String str2, Integer num, Integer num2, String str3, Boolean bool) {
        this.f6890a = str;
        this.f6891b = str2;
        this.f6892c = num;
        this.f6893d = num2;
        this.f6894e = str3;
        this.f6895f = bool;
    }

    public Hl(StackTraceElement stackTraceElement) {
        this(stackTraceElement.getClassName(), stackTraceElement.getFileName(), Integer.valueOf(stackTraceElement.getLineNumber()), null, stackTraceElement.getMethodName(), Boolean.valueOf(stackTraceElement.isNativeMethod()));
    }
}
