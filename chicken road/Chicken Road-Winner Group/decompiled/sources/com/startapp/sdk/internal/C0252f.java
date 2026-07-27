package com.startapp.sdk.internal;

import android.os.Debug;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.text.TextUtils;
import android.util.Printer;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;

/* renamed from: com.startapp.sdk.internal.f, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0252f extends Thread implements Handler.Callback, Printer {

    /* renamed from: a, reason: collision with root package name */
    public InterfaceC0250d f3661a;

    /* renamed from: b, reason: collision with root package name */
    public InterfaceC0251e f3662b;

    /* renamed from: c, reason: collision with root package name */
    public final C0249c f3663c;

    /* renamed from: d, reason: collision with root package name */
    public x3 f3664d;

    /* renamed from: e, reason: collision with root package name */
    public final Handler f3665e;
    public final AtomicLong f;

    /* renamed from: g, reason: collision with root package name */
    public final long f3666g;

    /* renamed from: h, reason: collision with root package name */
    public final AtomicReference f3667h;

    /* renamed from: i, reason: collision with root package name */
    public final boolean f3668i;

    public C0252f(long j3, boolean z3) {
        super("startapp-anr");
        this.f3661a = new C0247a();
        this.f3662b = new C0248b();
        this.f3663c = new C0249c();
        this.f3665e = new Handler(Looper.getMainLooper(), this);
        this.f = new AtomicLong(0L);
        this.f3667h = new AtomicReference("");
        this.f3666g = j3;
        this.f3668i = z3;
    }

    public final void a() {
        long j3 = this.f3666g;
        boolean z3 = false;
        boolean z4 = true;
        while (!isInterrupted()) {
            if (this.f.getAndAdd(j3) == 0) {
                if (z3 && !a((String) this.f3667h.get())) {
                    this.f3661a.remove();
                    z3 = false;
                }
                this.f3665e.sendEmptyMessage(101);
                z4 = true;
            }
            try {
                synchronized (this) {
                    wait(j3);
                }
                long j4 = this.f.get();
                String str = (String) this.f3667h.get();
                if (j4 > 0 && !z3 && (z4 || a(str))) {
                    if (Debug.isDebuggerConnected() || Debug.waitingForDebugger()) {
                        z3 = true;
                    } else {
                        j3 = this.f3662b.a(j4);
                        if (j3 > 0) {
                            z4 = false;
                        } else {
                            z3 = this.f3661a.a(str, j4);
                            j3 = this.f3666g;
                        }
                    }
                }
            } catch (InterruptedException unused) {
                this.f3663c.getClass();
                return;
            } catch (Throwable unused2) {
                return;
            }
        }
    }

    @Override // android.os.Handler.Callback
    public final boolean handleMessage(Message message) {
        this.f.set(0L);
        return true;
    }

    @Override // android.util.Printer
    public final void println(String str) {
        if (str.startsWith(">>>>>")) {
            this.f3667h.set(str);
        } else if (str.startsWith("<<<<<")) {
            this.f3667h.set("");
            this.f.set(0L);
        }
    }

    @Override // java.lang.Thread, java.lang.Runnable
    public final void run() {
        try {
            a();
        } catch (Throwable unused) {
        }
    }

    @Override // java.lang.Thread
    public final void start() {
        this.f3661a.a();
        this.f3661a.remove();
        if (this.f3668i) {
            Looper.getMainLooper().setMessageLogging(this);
        }
        super.start();
    }

    public final boolean a(String str) {
        boolean z3 = (this.f3668i && TextUtils.isEmpty(str)) ? false : true;
        x3 x3Var = this.f3664d;
        return z3 && (x3Var == null || !si.c(x3Var.f4623a.f4410a));
    }
}
