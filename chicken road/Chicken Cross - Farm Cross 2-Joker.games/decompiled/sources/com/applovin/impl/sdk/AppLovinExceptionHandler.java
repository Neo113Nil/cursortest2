package com.applovin.impl.sdk;

import android.os.Process;
import android.text.TextUtils;
import com.applovin.impl.c5;
import com.applovin.impl.h2;
import com.applovin.impl.sdk.utils.CollectionUtils;
import com.ironsource.U3;
import java.lang.Thread;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;
import java.util.concurrent.atomic.AtomicBoolean;

/* loaded from: classes5.dex */
public class AppLovinExceptionHandler implements Thread.UncaughtExceptionHandler {
    private static final AppLovinExceptionHandler e = new AppLovinExceptionHandler();

    /* renamed from: a, reason: collision with root package name */
    private final Set f4440a = new HashSet(2);
    private final AtomicBoolean b = new AtomicBoolean();
    private final AtomicBoolean c = new AtomicBoolean();
    private Thread.UncaughtExceptionHandler d;

    private String a(Throwable th, int i) {
        StackTraceElement[] stackTrace = th.getStackTrace();
        return TextUtils.join("\n", (StackTraceElement[]) Arrays.copyOf(stackTrace, Math.min(i, stackTrace.length)));
    }

    public static AppLovinExceptionHandler shared() {
        return e;
    }

    public void addSdk(l lVar) {
        if (this.f4440a.contains(lVar)) {
            return;
        }
        this.f4440a.add(lVar);
    }

    public void enable() {
        if (this.b.compareAndSet(false, true)) {
            this.d = Thread.getDefaultUncaughtExceptionHandler();
            Thread.setDefaultUncaughtExceptionHandler(this);
        }
    }

    @Override // java.lang.Thread.UncaughtExceptionHandler
    public void uncaughtException(Thread thread, Throwable th) {
        if (this.c.getAndSet(true)) {
            Process.killProcess(Process.myPid());
            System.exit(1);
            return;
        }
        long j = 500;
        for (l lVar : this.f4440a) {
            lVar.Q();
            if (p.a()) {
                lVar.Q().a("AppLovinExceptionHandler", "Detected unhandled exception");
            }
            HashMap<String, String> hashMap = CollectionUtils.hashMap("top_main_method", th.toString());
            Integer num = (Integer) lVar.a(c5.P6);
            if (num.intValue() > 0) {
                hashMap.put("details", a(th, num.intValue()));
            }
            lVar.E().d(h2.b1, hashMap);
            lVar.G().trackEventSynchronously(U3.i.e0);
            j = ((Long) lVar.a(c5.v3)).longValue();
        }
        try {
            Thread.sleep(j);
        } catch (InterruptedException unused) {
        }
        Thread.UncaughtExceptionHandler uncaughtExceptionHandler = this.d;
        if (uncaughtExceptionHandler != null) {
            uncaughtExceptionHandler.uncaughtException(thread, th);
        } else {
            Process.killProcess(Process.myPid());
            System.exit(1);
        }
    }
}
