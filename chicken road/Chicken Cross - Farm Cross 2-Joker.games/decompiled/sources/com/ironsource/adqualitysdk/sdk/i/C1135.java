package com.ironsource.adqualitysdk.sdk.i;

import android.os.Process;
import com.ironsource.adqualitysdk.sdk.StringFog;
import java.lang.Thread;

/* renamed from: com.ironsource.adqualitysdk.sdk.i.ﬥ, reason: contains not printable characters */
/* loaded from: classes6.dex */
public final class C1135 implements Thread.UncaughtExceptionHandler {

    /* renamed from: ﾒ, reason: contains not printable characters */
    public final /* synthetic */ C1050 f3271;

    public C1135(C1050 c1050) {
        this.f3271 = c1050;
    }

    @Override // java.lang.Thread.UncaughtExceptionHandler
    public final void uncaughtException(Thread thread, Throwable th) {
        try {
            AbstractC0480.m5463(StringFog.decrypt("M7clV7XbzawB\n", "ctlEO8yvpM8=\n"), StringFog.decrypt("ZW7Tt5sk6m4QZci1izP2c19u\n", "MACw1u5Dgho=\n"), StringFog.decrypt("LHuwBgMo/UoT\n", "eAnRZWZKnCk=\n"), th, null, null, false, false, false);
        } catch (Throwable unused) {
        }
        this.f3271.m5824();
        Thread.UncaughtExceptionHandler uncaughtExceptionHandler = this.f3271.f3121;
        if (uncaughtExceptionHandler != null) {
            uncaughtExceptionHandler.uncaughtException(thread, th);
            return;
        }
        try {
            Process.killProcess(Process.myPid());
            System.exit(10);
        } catch (SecurityException unused2) {
        }
    }
}
