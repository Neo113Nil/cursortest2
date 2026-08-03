package io.appmetrica.analytics.impl;

/* loaded from: classes.dex */
public final class Dl {

    /* renamed from: a, reason: collision with root package name */
    public final java.lang.String f4230a;

    /* renamed from: b, reason: collision with root package name */
    public final java.lang.String f4231b;

    /* renamed from: c, reason: collision with root package name */
    public final java.lang.Integer f4232c;

    /* renamed from: d, reason: collision with root package name */
    public final java.lang.Integer f4233d;

    /* renamed from: e, reason: collision with root package name */
    public final java.lang.String f4234e;

    /* renamed from: f, reason: collision with root package name */
    public final java.lang.Boolean f4235f;

    public Dl(java.lang.String str, java.lang.String str2, java.lang.Integer num, java.lang.Integer num2, java.lang.String str3, java.lang.Boolean bool) {
        this.f4230a = str;
        this.f4231b = str2;
        this.f4232c = num;
        this.f4233d = num2;
        this.f4234e = str3;
        this.f4235f = bool;
    }

    public Dl(java.lang.StackTraceElement stackTraceElement) {
        this(stackTraceElement.getClassName(), stackTraceElement.getFileName(), java.lang.Integer.valueOf(stackTraceElement.getLineNumber()), null, stackTraceElement.getMethodName(), java.lang.Boolean.valueOf(stackTraceElement.isNativeMethod()));
    }
}
