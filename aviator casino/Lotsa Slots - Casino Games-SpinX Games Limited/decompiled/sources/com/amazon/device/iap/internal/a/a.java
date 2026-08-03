package com.amazon.device.iap.internal.a;

/* compiled from: SandboxLogHandler.java */
/* loaded from: classes2.dex */
public class a implements com.amazon.device.iap.internal.a {
    @Override // com.amazon.device.iap.internal.a
    public boolean a() {
        return true;
    }

    @Override // com.amazon.device.iap.internal.a
    public boolean b() {
        return true;
    }

    @Override // com.amazon.device.iap.internal.a
    public void a(java.lang.String str, java.lang.String str2) {
        android.util.Log.d(str, a(str2));
    }

    @Override // com.amazon.device.iap.internal.a
    public void b(java.lang.String str, java.lang.String str2) {
        android.util.Log.e(str, a(str2));
    }

    private static java.lang.String a(java.lang.String str) {
        return "In App Purchasing SDK - Sandbox Mode: " + str;
    }
}
