package H;

import F.t;
import a.AbstractC0018a;
import android.os.Build;
import android.os.Trace;
import android.util.Log;
import io.flutter.embedding.engine.FlutterJNI;
import java.nio.ByteBuffer;
import java.util.HashMap;
import java.util.List;
import java.util.WeakHashMap;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.atomic.AtomicBoolean;
import q.AbstractC0086a;

/* loaded from: classes.dex */
public final class j implements P.f, k {

    /* renamed from: b, reason: collision with root package name */
    public final FlutterJNI f245b;

    /* renamed from: c, reason: collision with root package name */
    public final HashMap f246c;

    /* renamed from: d, reason: collision with root package name */
    public final HashMap f247d;

    /* renamed from: e, reason: collision with root package name */
    public final Object f248e;

    /* renamed from: f, reason: collision with root package name */
    public final AtomicBoolean f249f;

    /* renamed from: g, reason: collision with root package name */
    public final HashMap f250g;

    /* renamed from: h, reason: collision with root package name */
    public int f251h;

    /* renamed from: i, reason: collision with root package name */
    public final l f252i;

    /* renamed from: j, reason: collision with root package name */
    public final WeakHashMap f253j;

    /* renamed from: k, reason: collision with root package name */
    public final t f254k;

    public j(FlutterJNI flutterJNI) {
        t tVar = new t();
        tVar.f114c = (ExecutorService) E.b.d().f20c;
        this.f246c = new HashMap();
        this.f247d = new HashMap();
        this.f248e = new Object();
        this.f249f = new AtomicBoolean(false);
        this.f250g = new HashMap();
        this.f251h = 1;
        this.f252i = new l();
        this.f253j = new WeakHashMap();
        this.f245b = flutterJNI;
        this.f254k = tVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v2, types: [H.c] */
    public final void a(final String str, final f fVar, final ByteBuffer byteBuffer, final int i2, final long j2) {
        e eVar = fVar != null ? fVar.f236b : null;
        String a2 = V.a.a("PlatformChannel ScheduleHandler on " + str);
        if (Build.VERSION.SDK_INT >= 29) {
            AbstractC0086a.a(AbstractC0018a.D(a2), i2);
        } else {
            String D2 = AbstractC0018a.D(a2);
            try {
                if (AbstractC0018a.f415d == null) {
                    AbstractC0018a.f415d = Trace.class.getMethod("asyncTraceBegin", Long.TYPE, String.class, Integer.TYPE);
                }
                AbstractC0018a.f415d.invoke(null, Long.valueOf(AbstractC0018a.f413b), D2, Integer.valueOf(i2));
            } catch (Exception e2) {
                AbstractC0018a.m("asyncTraceBegin", e2);
            }
        }
        ?? r02 = new Runnable() { // from class: H.c
            @Override // java.lang.Runnable
            public final void run() {
                long j3 = j2;
                FlutterJNI flutterJNI = j.this.f245b;
                StringBuilder sb = new StringBuilder("PlatformChannel ScheduleHandler on ");
                String str2 = str;
                sb.append(str2);
                String a3 = V.a.a(sb.toString());
                int i3 = Build.VERSION.SDK_INT;
                int i4 = i2;
                if (i3 >= 29) {
                    AbstractC0086a.b(AbstractC0018a.D(a3), i4);
                } else {
                    String D3 = AbstractC0018a.D(a3);
                    try {
                        if (AbstractC0018a.f416e == null) {
                            AbstractC0018a.f416e = Trace.class.getMethod("asyncTraceEnd", Long.TYPE, String.class, Integer.TYPE);
                        }
                        AbstractC0018a.f416e.invoke(null, Long.valueOf(AbstractC0018a.f413b), D3, Integer.valueOf(i4));
                    } catch (Exception e3) {
                        AbstractC0018a.m("asyncTraceEnd", e3);
                    }
                }
                try {
                    V.a.b("DartMessenger#handleMessageFromDart on " + str2);
                    f fVar2 = fVar;
                    ByteBuffer byteBuffer2 = byteBuffer;
                    try {
                        if (fVar2 != null) {
                            try {
                                try {
                                    fVar2.f235a.i(byteBuffer2, new g(flutterJNI, i4));
                                } catch (Exception e4) {
                                    Log.e("DartMessenger", "Uncaught exception in binary message listener", e4);
                                    flutterJNI.invokePlatformMessageEmptyResponseCallback(i4);
                                }
                            } catch (Error e5) {
                                Thread currentThread = Thread.currentThread();
                                if (currentThread.getUncaughtExceptionHandler() == null) {
                                    throw e5;
                                }
                                currentThread.getUncaughtExceptionHandler().uncaughtException(currentThread, e5);
                            }
                        } else {
                            flutterJNI.invokePlatformMessageEmptyResponseCallback(i4);
                        }
                        if (byteBuffer2 != null && byteBuffer2.isDirect()) {
                            byteBuffer2.limit(0);
                        }
                        Trace.endSection();
                    } finally {
                    }
                } finally {
                    flutterJNI.cleanupMessageData(j3);
                }
            }
        };
        e eVar2 = eVar;
        if (eVar == null) {
            eVar2 = this.f252i;
        }
        eVar2.a(r02);
    }

    @Override // P.f
    public final void b(String str, ByteBuffer byteBuffer, P.e eVar) {
        V.a.b("DartMessenger#send on " + str);
        try {
            int i2 = this.f251h;
            this.f251h = i2 + 1;
            if (eVar != null) {
                this.f250g.put(Integer.valueOf(i2), eVar);
            }
            FlutterJNI flutterJNI = this.f245b;
            if (byteBuffer == null) {
                flutterJNI.dispatchEmptyPlatformMessage(str, i2);
            } else {
                flutterJNI.dispatchPlatformMessage(str, byteBuffer, byteBuffer.position(), i2);
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

    @Override // P.f
    public final C.b c(P.h hVar) {
        t tVar = this.f254k;
        tVar.getClass();
        i iVar = new i((ExecutorService) tVar.f114c);
        C.b bVar = new C.b(4);
        this.f253j.put(bVar, iVar);
        return bVar;
    }

    @Override // P.f
    public final void i(String str, P.d dVar) {
        j(str, dVar, null);
    }

    @Override // P.f
    public final void j(String str, P.d dVar, C.b bVar) {
        e eVar;
        if (dVar == null) {
            synchronized (this.f248e) {
                this.f246c.remove(str);
            }
            return;
        }
        if (bVar != null) {
            eVar = (e) this.f253j.get(bVar);
            if (eVar == null) {
                throw new IllegalArgumentException("Unrecognized TaskQueue, use BinaryMessenger to create your TaskQueue (ex makeBackgroundTaskQueue).");
            }
        } else {
            eVar = null;
        }
        synchronized (this.f248e) {
            try {
                this.f246c.put(str, new f(dVar, eVar));
                List<d> list = (List) this.f247d.remove(str);
                if (list == null) {
                    return;
                }
                for (d dVar2 : list) {
                    a(str, (f) this.f246c.get(str), dVar2.f232a, dVar2.f233b, dVar2.f234c);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
