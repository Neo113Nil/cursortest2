package K1;

import android.os.Build;
import android.os.Trace;
import android.util.Log;
import b2.AbstractC0164a;
import io.flutter.embedding.engine.FlutterJNI;
import java.nio.ByteBuffer;
import java.util.HashMap;
import java.util.List;
import java.util.WeakHashMap;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.atomic.AtomicBoolean;

/* loaded from: classes.dex */
public final class i implements T1.f, j {

    /* renamed from: a, reason: collision with root package name */
    public final FlutterJNI f942a;

    /* renamed from: b, reason: collision with root package name */
    public final HashMap f943b;

    /* renamed from: c, reason: collision with root package name */
    public final HashMap f944c;

    /* renamed from: d, reason: collision with root package name */
    public final Object f945d;

    /* renamed from: e, reason: collision with root package name */
    public final AtomicBoolean f946e;
    public final HashMap f;

    /* renamed from: g, reason: collision with root package name */
    public int f947g;

    /* renamed from: h, reason: collision with root package name */
    public final k f948h;

    /* renamed from: i, reason: collision with root package name */
    public final WeakHashMap f949i;

    /* renamed from: j, reason: collision with root package name */
    public final b0.i f950j;

    public i(FlutterJNI flutterJNI) {
        b0.i iVar = new b0.i(8);
        iVar.f2461b = (ExecutorService) A0.j.F().f68d;
        this.f943b = new HashMap();
        this.f944c = new HashMap();
        this.f945d = new Object();
        this.f946e = new AtomicBoolean(false);
        this.f = new HashMap();
        this.f947g = 1;
        this.f948h = new k();
        this.f949i = new WeakHashMap();
        this.f942a = flutterJNI;
        this.f950j = iVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v2, types: [K1.c] */
    public final void a(final String str, final f fVar, final ByteBuffer byteBuffer, final int i3, final long j3) {
        e eVar = fVar != null ? fVar.f935b : null;
        String a3 = AbstractC0164a.a("PlatformChannel ScheduleHandler on " + str);
        if (Build.VERSION.SDK_INT >= 29) {
            X.a.a(i3, X0.a.M(a3));
        } else {
            String M2 = X0.a.M(a3);
            try {
                if (X0.a.f1629e == null) {
                    X0.a.f1629e = Trace.class.getMethod("asyncTraceBegin", Long.TYPE, String.class, Integer.TYPE);
                }
                X0.a.f1629e.invoke(null, Long.valueOf(X0.a.f1627c), M2, Integer.valueOf(i3));
            } catch (Exception e3) {
                X0.a.w("asyncTraceBegin", e3);
            }
        }
        ?? r02 = new Runnable() { // from class: K1.c
            @Override // java.lang.Runnable
            public final void run() {
                long j4 = j3;
                FlutterJNI flutterJNI = i.this.f942a;
                StringBuilder sb = new StringBuilder("PlatformChannel ScheduleHandler on ");
                String str2 = str;
                sb.append(str2);
                String a4 = AbstractC0164a.a(sb.toString());
                int i4 = Build.VERSION.SDK_INT;
                int i5 = i3;
                if (i4 >= 29) {
                    X.a.b(i5, X0.a.M(a4));
                } else {
                    String M3 = X0.a.M(a4);
                    try {
                        if (X0.a.f == null) {
                            X0.a.f = Trace.class.getMethod("asyncTraceEnd", Long.TYPE, String.class, Integer.TYPE);
                        }
                        X0.a.f.invoke(null, Long.valueOf(X0.a.f1627c), M3, Integer.valueOf(i5));
                    } catch (Exception e4) {
                        X0.a.w("asyncTraceEnd", e4);
                    }
                }
                try {
                    AbstractC0164a.b("DartMessenger#handleMessageFromDart on " + str2);
                    f fVar2 = fVar;
                    ByteBuffer byteBuffer2 = byteBuffer;
                    try {
                        if (fVar2 != null) {
                            try {
                                try {
                                    fVar2.f934a.o(byteBuffer2, new g(flutterJNI, i5));
                                } catch (Exception e5) {
                                    Log.e("DartMessenger", "Uncaught exception in binary message listener", e5);
                                    flutterJNI.invokePlatformMessageEmptyResponseCallback(i5);
                                }
                            } catch (Error e6) {
                                Thread currentThread = Thread.currentThread();
                                if (currentThread.getUncaughtExceptionHandler() == null) {
                                    throw e6;
                                }
                                currentThread.getUncaughtExceptionHandler().uncaughtException(currentThread, e6);
                            }
                        } else {
                            flutterJNI.invokePlatformMessageEmptyResponseCallback(i5);
                        }
                        if (byteBuffer2 != null && byteBuffer2.isDirect()) {
                            byteBuffer2.limit(0);
                        }
                        Trace.endSection();
                    } finally {
                    }
                } finally {
                    flutterJNI.cleanupMessageData(j4);
                }
            }
        };
        e eVar2 = eVar;
        if (eVar == null) {
            eVar2 = this.f948h;
        }
        eVar2.a(r02);
    }

    @Override // T1.f
    public final void h(String str, T1.d dVar) {
        o(str, dVar, null);
    }

    @Override // T1.f
    public final void i(String str, ByteBuffer byteBuffer, T1.e eVar) {
        AbstractC0164a.b("DartMessenger#send on " + str);
        try {
            int i3 = this.f947g;
            this.f947g = i3 + 1;
            if (eVar != null) {
                this.f.put(Integer.valueOf(i3), eVar);
            }
            FlutterJNI flutterJNI = this.f942a;
            if (byteBuffer == null) {
                flutterJNI.dispatchEmptyPlatformMessage(str, i3);
            } else {
                flutterJNI.dispatchPlatformMessage(str, byteBuffer, byteBuffer.position(), i3);
            }
            Trace.endSection();
        } catch (Throwable th) {
            try {
                Trace.endSection();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    @Override // T1.f
    public final P0.j j(T1.j jVar) {
        b0.i iVar = this.f950j;
        iVar.getClass();
        h hVar = new h((ExecutorService) iVar.f2461b);
        P0.j jVar2 = new P0.j(6);
        this.f949i.put(jVar2, hVar);
        return jVar2;
    }

    @Override // T1.f
    public final void k(String str, ByteBuffer byteBuffer) {
        i(str, byteBuffer, null);
    }

    @Override // T1.f
    public final void o(String str, T1.d dVar, P0.j jVar) {
        e eVar;
        if (dVar == null) {
            synchronized (this.f945d) {
                this.f943b.remove(str);
            }
            return;
        }
        if (jVar != null) {
            eVar = (e) this.f949i.get(jVar);
            if (eVar == null) {
                throw new IllegalArgumentException("Unrecognized TaskQueue, use BinaryMessenger to create your TaskQueue (ex makeBackgroundTaskQueue).");
            }
        } else {
            eVar = null;
        }
        synchronized (this.f945d) {
            try {
                this.f943b.put(str, new f(dVar, eVar));
                List<d> list = (List) this.f944c.remove(str);
                if (list == null) {
                    return;
                }
                for (d dVar2 : list) {
                    a(str, (f) this.f943b.get(str), dVar2.f931a, dVar2.f932b, dVar2.f933c);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
