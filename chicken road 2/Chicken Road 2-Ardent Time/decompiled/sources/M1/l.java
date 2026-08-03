package M1;

/* loaded from: classes.dex */
public final class l {

    /* renamed from: e, reason: collision with root package name */
    public static M1.l f1085e;

    /* renamed from: f, reason: collision with root package name */
    public static io.flutter.view.q f1086f;

    /* renamed from: a, reason: collision with root package name */
    public long f1087a;

    /* renamed from: b, reason: collision with root package name */
    public final java.lang.Object f1088b;

    /* renamed from: c, reason: collision with root package name */
    public java.lang.Object f1089c;

    /* renamed from: d, reason: collision with root package name */
    public final java.lang.Object f1090d;

    public l(L1.d taskRunner, java.util.concurrent.TimeUnit timeUnit) {
        kotlin.jvm.internal.i.e(taskRunner, "taskRunner");
        this.f1087a = timeUnit.toNanos(5L);
        this.f1088b = taskRunner.e();
        this.f1089c = new L1.b(this, kotlin.jvm.internal.i.h(" ConnectionPool", J1.b.f937f));
        this.f1090d = new java.util.concurrent.ConcurrentLinkedQueue();
    }

    public static M1.l b(android.hardware.display.DisplayManager displayManager, io.flutter.embedding.engine.FlutterJNI flutterJNI) {
        if (f1085e == null) {
            f1085e = new M1.l(flutterJNI);
        }
        if (f1086f == null) {
            M1.l lVar = f1085e;
            java.util.Objects.requireNonNull(lVar);
            io.flutter.view.q qVar = new io.flutter.view.q(lVar, displayManager);
            f1086f = qVar;
            displayManager.registerDisplayListener(qVar, null);
        }
        if (f1085e.f1087a == -1) {
            float refreshRate = displayManager.getDisplay(0).getRefreshRate();
            f1085e.f1087a = (long) (1.0E9d / refreshRate);
            flutterJNI.setRefreshRateFPS(refreshRate);
        }
        return f1085e;
    }

    public boolean a(I1.C0026a c0026a, M1.i call, java.util.ArrayList arrayList, boolean z2) {
        kotlin.jvm.internal.i.e(call, "call");
        java.util.Iterator it = ((java.util.concurrent.ConcurrentLinkedQueue) this.f1090d).iterator();
        while (true) {
            if (!it.hasNext()) {
                return false;
            }
            M1.k connection = (M1.k) it.next();
            kotlin.jvm.internal.i.d(connection, "connection");
            synchronized (connection) {
                if (z2) {
                    if (!(connection.f1074g != null)) {
                    }
                }
                if (connection.h(c0026a, arrayList)) {
                    call.a(connection);
                    return true;
                }
            }
        }
    }

    public int c(M1.k kVar, long j2) {
        byte[] bArr = J1.b.f932a;
        java.util.ArrayList arrayList = kVar.f1083p;
        int i2 = 0;
        while (i2 < arrayList.size()) {
            java.lang.ref.Reference reference = (java.lang.ref.Reference) arrayList.get(i2);
            if (reference.get() != null) {
                i2++;
            } else {
                java.lang.String str = "A connection to " + kVar.f1069b.f660a.f677h + " was leaked. Did you forget to close a response body?";
                Q1.n nVar = Q1.n.f1644a;
                Q1.n.f1644a.j(((M1.g) reference).f1051a, str);
                arrayList.remove(i2);
                kVar.f1077j = true;
                if (arrayList.isEmpty()) {
                    kVar.f1084q = j2 - this.f1087a;
                    return 0;
                }
            }
        }
        return arrayList.size();
    }

    public l(io.flutter.embedding.engine.FlutterJNI flutterJNI) {
        this.f1087a = -1L;
        this.f1089c = new io.flutter.view.r(this, 0L);
        this.f1090d = new io.flutter.view.b(this);
        this.f1088b = flutterJNI;
    }
}
