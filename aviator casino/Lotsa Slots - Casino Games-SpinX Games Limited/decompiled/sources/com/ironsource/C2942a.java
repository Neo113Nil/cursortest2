package com.ironsource;

/* renamed from: com.ironsource.a, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public class C2942a extends java.lang.Thread {
    private static final int l = 1;
    private static final com.ironsource.InterfaceC2960b m = new com.ironsource.C2942a.C0132a();
    private static final com.ironsource.InterfaceC3274s9 n = new com.ironsource.C2942a.b();
    private final int d;

    /* renamed from: a, reason: collision with root package name */
    private com.ironsource.InterfaceC2960b f6127a = m;
    private com.ironsource.InterfaceC3274s9 b = n;
    private final android.os.Handler c = new android.os.Handler(android.os.Looper.getMainLooper());
    private java.lang.String e = "";
    private boolean f = false;
    private boolean g = false;
    private volatile int h = 0;
    private int i = 1;
    private int j = 0;
    private final java.lang.Runnable k = new com.ironsource.C2942a.c();

    /* renamed from: com.ironsource.a$a, reason: collision with other inner class name */
    class C0132a implements com.ironsource.InterfaceC2960b {
        C0132a() {
        }

        @Override // com.ironsource.InterfaceC2960b
        public void a() {
        }

        @Override // com.ironsource.InterfaceC2960b
        public void b() {
            throw new java.lang.RuntimeException("ANRHandler has given up");
        }
    }

    /* renamed from: com.ironsource.a$b */
    class b implements com.ironsource.InterfaceC3274s9 {
        b() {
        }

        @Override // com.ironsource.InterfaceC3274s9
        public void a(java.lang.InterruptedException interruptedException) {
            android.util.Log.w("ANRHandler", "Interrupted: " + interruptedException.getMessage());
        }
    }

    /* renamed from: com.ironsource.a$c */
    class c implements java.lang.Runnable {
        c() {
        }

        @Override // java.lang.Runnable
        public void run() {
            com.ironsource.C2942a c2942a = com.ironsource.C2942a.this;
            c2942a.h = (c2942a.h + 1) % Integer.MAX_VALUE;
        }
    }

    public C2942a(int i) {
        this.d = i;
    }

    public void a(int i) {
        this.i = i;
    }

    public int b() {
        return this.i;
    }

    public com.ironsource.C2942a c() {
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
                java.lang.Thread.sleep(this.d);
                if (this.h != i2) {
                    this.j = 0;
                } else if (this.g || !android.os.Debug.isDebuggerConnected()) {
                    this.j++;
                    this.f6127a.a();
                    java.lang.String str = com.ironsource.C3180n4.l;
                    if (str != null && !str.trim().isEmpty()) {
                        new com.ironsource.K5(com.ironsource.C3180n4.l, java.lang.String.valueOf(java.lang.System.currentTimeMillis()), "ANR").a();
                    }
                } else {
                    if (this.h != i) {
                        android.util.Log.w("ANRHandler", "An ANR was detected but ignored because the debugger is connected (you can prevent this with setIgnoreDebugger(true))");
                    }
                    i = this.h;
                }
            } catch (java.lang.InterruptedException e) {
                this.b.a(e);
                return;
            }
        }
        if (this.j >= this.i) {
            this.f6127a.b();
        }
    }

    public int a() {
        return this.j;
    }

    public com.ironsource.C2942a b(boolean z) {
        this.f = z;
        return this;
    }

    public com.ironsource.C2942a a(com.ironsource.InterfaceC2960b interfaceC2960b) {
        if (interfaceC2960b == null) {
            this.f6127a = m;
        } else {
            this.f6127a = interfaceC2960b;
        }
        return this;
    }

    public com.ironsource.C2942a a(com.ironsource.InterfaceC3274s9 interfaceC3274s9) {
        if (interfaceC3274s9 == null) {
            this.b = n;
        } else {
            this.b = interfaceC3274s9;
        }
        return this;
    }

    public com.ironsource.C2942a a(java.lang.String str) {
        if (str == null) {
            str = "";
        }
        this.e = str;
        return this;
    }

    public com.ironsource.C2942a a(boolean z) {
        this.g = z;
        return this;
    }

    private java.lang.String a(java.lang.StackTraceElement[] stackTraceElementArr) {
        java.lang.String str = "";
        if (stackTraceElementArr != null && stackTraceElementArr.length > 0) {
            for (java.lang.StackTraceElement stackTraceElement : stackTraceElementArr) {
                if (stackTraceElement != null) {
                    str = str + stackTraceElement.toString() + ";\n";
                }
            }
        }
        return str;
    }
}
