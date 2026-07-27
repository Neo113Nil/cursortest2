package io.appmetrica.analytics.impl;

/* loaded from: classes.dex */
public final class Hl {

    /* renamed from: a, reason: collision with root package name */
    public final String f6043a;

    /* renamed from: b, reason: collision with root package name */
    public final String f6044b;

    /* renamed from: c, reason: collision with root package name */
    public final Integer f6045c;

    /* renamed from: d, reason: collision with root package name */
    public final Integer f6046d;

    /* renamed from: e, reason: collision with root package name */
    public final String f6047e;
    public final Boolean f;

    public Hl(String str, String str2, Integer num, Integer num2, String str3, Boolean bool) {
        this.f6043a = str;
        this.f6044b = str2;
        this.f6045c = num;
        this.f6046d = num2;
        this.f6047e = str3;
        this.f = bool;
    }

    public Hl(StackTraceElement stackTraceElement) {
        this(stackTraceElement.getClassName(), stackTraceElement.getFileName(), Integer.valueOf(stackTraceElement.getLineNumber()), null, stackTraceElement.getMethodName(), Boolean.valueOf(stackTraceElement.isNativeMethod()));
    }
}
