package com.digitalturbine.ignite.authenticator.logger;

/* loaded from: classes2.dex */
public final class a {
    public static final com.digitalturbine.ignite.authenticator.logger.a b = new com.digitalturbine.ignite.authenticator.logger.a();

    /* renamed from: a, reason: collision with root package name */
    public com.digitalturbine.ignite.authenticator.logger.ILogger f3510a;

    public static void a(java.lang.String str, java.lang.Object... objArr) {
        com.digitalturbine.ignite.authenticator.logger.ILogger iLogger = b.f3510a;
        if (iLogger != null) {
            iLogger.d(str, objArr);
        }
    }

    public static void b(java.lang.String str, java.lang.Object... objArr) {
        com.digitalturbine.ignite.authenticator.logger.ILogger iLogger = b.f3510a;
        if (iLogger != null) {
            iLogger.w(str, objArr);
        }
    }
}
