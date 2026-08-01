package com.ironsource;

import android.os.Debug;
import android.os.Handler;
import android.os.Looper;
import android.util.Log;

/* renamed from: com.ironsource.a, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public class C4282a extends Thread {
    private static final int l = 1;
    private static final InterfaceC4325b m = new C0321a();
    private static final InterfaceC4639s9 n = new b();
    private final int d;

    /* renamed from: a, reason: collision with root package name */
    private InterfaceC4325b f8055a = m;
    private InterfaceC4639s9 b = n;
    private final Handler c = new Handler(Looper.getMainLooper());
    private String e = "";
    private boolean f = false;
    private boolean g = false;
    private volatile int h = 0;
    private int i = 1;
    private int j = 0;
    private final Runnable k = new c();

    /* renamed from: com.ironsource.a$a, reason: collision with other inner class name */
    class C0321a implements InterfaceC4325b {
        C0321a() {
        }

        @Override // com.ironsource.InterfaceC4325b
        public void a() {
        }

        @Override // com.ironsource.InterfaceC4325b
        public void b() {
            throw new RuntimeException("ANRHandler has given up");
        }
    }

    /* renamed from: com.ironsource.a$b */
    class b implements InterfaceC4639s9 {
        b() {
        }

        @Override // com.ironsource.InterfaceC4639s9
        public void a(InterruptedException interruptedException) {
            Log.w("ANRHandler", "Interrupted: " + interruptedException.getMessage());
        }
    }

    /* renamed from: com.ironsource.a$c */
    class c implements Runnable {
        c() {
        }

        @Override // java.lang.Runnable
        public void run() {
            C4282a c4282a = C4282a.this;
            c4282a.h = (c4282a.h + 1) % Integer.MAX_VALUE;
        }
    }

    public C4282a(int i) {
        this.d = i;
    }

    public void a(int i) {
        this.i = i;
    }

    public int b() {
        return this.i;
    }

    public C4282a c() {
        this.e = null;
        return this;
    }

    @Override // java.lang.Thread, java.lang.Runnable
    public void run() {
        setName("|ANR-ANRHandler|");
        int i = -1;
        while (!isInterrupted() && this.j < this.i) {
            int i2 = this.h;
            this.c.post(this.k);
            try {
                Thread.sleep(this.d);
                if (this.h != i2) {
                    this.j = 0;
                } else if (this.g || !Debug.isDebuggerConnected()) {
                    this.j++;
                    this.f8055a.a();
                    String str = C4491k4.l;
                    if (str != null && !str.trim().isEmpty()) {
                        new I5(C4491k4.l, String.valueOf(System.currentTimeMillis()), "ANR").a();
                    }
                } else {
                    if (this.h != i) {
                        Log.w("ANRHandler", "An ANR was detected but ignored because the debugger is connected (you can prevent this with setIgnoreDebugger(true))");
                    }
                    i = this.h;
                }
            } catch (InterruptedException e) {
                this.b.a(e);
                return;
            }
        }
        if (this.j >= this.i) {
            this.f8055a.b();
        }
    }

    public int a() {
        return this.j;
    }

    public C4282a b(boolean z) {
        this.f = z;
        return this;
    }

    public C4282a a(InterfaceC4325b interfaceC4325b) {
        if (interfaceC4325b == null) {
            this.f8055a = m;
        } else {
            this.f8055a = interfaceC4325b;
        }
        return this;
    }

    public C4282a a(InterfaceC4639s9 interfaceC4639s9) {
        if (interfaceC4639s9 == null) {
            this.b = n;
        } else {
            this.b = interfaceC4639s9;
        }
        return this;
    }

    public C4282a a(String str) {
        if (str == null) {
            str = "";
        }
        this.e = str;
        return this;
    }

    public C4282a a(boolean z) {
        this.g = z;
        return this;
    }

    private String a(StackTraceElement[] stackTraceElementArr) {
        String str = "";
        if (stackTraceElementArr != null && stackTraceElementArr.length > 0) {
            for (StackTraceElement stackTraceElement : stackTraceElementArr) {
                if (stackTraceElement != null) {
                    str = str + stackTraceElement.toString() + ";\n";
                }
            }
        }
        return str;
    }
}
