package com.digitalturbine.ignite.authenticator.logger;

/* loaded from: classes4.dex */
public final class a {
    public static final a b = new a();

    /* renamed from: a, reason: collision with root package name */
    public ILogger f5159a;

    public static void a(String str, Object... objArr) {
        ILogger iLogger = b.f5159a;
        if (iLogger != null) {
            iLogger.d(str, objArr);
        }
    }

    public static void b(String str, Object... objArr) {
        ILogger iLogger = b.f5159a;
        if (iLogger != null) {
            iLogger.w(str, objArr);
        }
    }
}
