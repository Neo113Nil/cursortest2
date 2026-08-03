package com.amazon.device.iap.internal.b;

/* compiled from: KiwiLogHandler.java */
/* loaded from: classes2.dex */
public class f implements com.amazon.device.iap.internal.a {

    /* renamed from: a, reason: collision with root package name */
    private static com.amazon.android.framework.util.KiwiLogger f3478a = new com.amazon.android.framework.util.KiwiLogger("In App Purchasing SDK - Production Mode");

    @Override // com.amazon.device.iap.internal.a
    public boolean a() {
        return com.amazon.android.framework.util.KiwiLogger.TRACE_ON;
    }

    @Override // com.amazon.device.iap.internal.a
    public boolean b() {
        return com.amazon.android.framework.util.KiwiLogger.ERROR_ON;
    }

    @Override // com.amazon.device.iap.internal.a
    public void a(java.lang.String str, java.lang.String str2) {
        f3478a.trace(c(str, str2));
    }

    @Override // com.amazon.device.iap.internal.a
    public void b(java.lang.String str, java.lang.String str2) {
        f3478a.error(c(str, str2));
    }

    private static java.lang.String c(java.lang.String str, java.lang.String str2) {
        return str + ": " + str2;
    }
}
