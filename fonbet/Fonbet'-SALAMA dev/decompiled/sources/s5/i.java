package s5;

import A5.m;
import B4.V;
import android.os.Build;
import android.os.Trace;
import android.support.v4.media.session.t;
import android.util.Log;
import io.flutter.embedding.engine.FlutterJNI;
import java.nio.ByteBuffer;
import java.util.HashMap;
import java.util.List;
import java.util.WeakHashMap;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.atomic.AtomicBoolean;
import n3.AbstractC1464a;

/* loaded from: classes2.dex */
public final class i implements A5.f, j {

    /* renamed from: A, reason: collision with root package name */
    public final R4.c f16203A;

    /* renamed from: a, reason: collision with root package name */
    public final FlutterJNI f16204a;

    /* renamed from: b, reason: collision with root package name */
    public final HashMap f16205b;

    /* renamed from: c, reason: collision with root package name */
    public final HashMap f16206c;

    /* renamed from: d, reason: collision with root package name */
    public final Object f16207d;

    /* renamed from: e, reason: collision with root package name */
    public final AtomicBoolean f16208e;

    /* renamed from: f, reason: collision with root package name */
    public final HashMap f16209f;

    /* renamed from: x, reason: collision with root package name */
    public int f16210x;

    /* renamed from: y, reason: collision with root package name */
    public final k f16211y;

    /* renamed from: z, reason: collision with root package name */
    public final WeakHashMap f16212z;

    public i(FlutterJNI flutterJNI) {
        R4.c cVar = new R4.c(24, false);
        cVar.f6064b = (ExecutorService) t.l0().f8078d;
        this.f16205b = new HashMap();
        this.f16206c = new HashMap();
        this.f16207d = new Object();
        this.f16208e = new AtomicBoolean(false);
        this.f16209f = new HashMap();
        this.f16210x = 1;
        this.f16211y = new k();
        this.f16212z = new WeakHashMap();
        this.f16204a = flutterJNI;
        this.f16203A = cVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v2, types: [s5.b] */
    public final void a(final String str, final e eVar, final ByteBuffer byteBuffer, final int i7, final long j) {
        d dVar = eVar != null ? eVar.f16194b : null;
        String a2 = S5.a.a("PlatformChannel ScheduleHandler on " + str);
        if (Build.VERSION.SDK_INT >= 29) {
            N0.a.a(i7, AbstractC1464a.W(a2));
        } else {
            String W6 = AbstractC1464a.W(a2);
            try {
                if (AbstractC1464a.f15350e == null) {
                    AbstractC1464a.f15350e = Trace.class.getMethod("asyncTraceBegin", Long.TYPE, String.class, Integer.TYPE);
                }
                AbstractC1464a.f15350e.invoke(null, Long.valueOf(AbstractC1464a.f15348c), W6, Integer.valueOf(i7));
            } catch (Exception e7) {
                AbstractC1464a.y("asyncTraceBegin", e7);
            }
        }
        ?? r02 = new Runnable() { // from class: s5.b
            @Override // java.lang.Runnable
            public final void run() {
                long j3 = j;
                FlutterJNI flutterJNI = i.this.f16204a;
                StringBuilder sb = new StringBuilder("PlatformChannel ScheduleHandler on ");
                String str2 = str;
                sb.append(str2);
                String a4 = S5.a.a(sb.toString());
                int i8 = Build.VERSION.SDK_INT;
                int i9 = i7;
                if (i8 >= 29) {
                    N0.a.b(i9, AbstractC1464a.W(a4));
                } else {
                    String W7 = AbstractC1464a.W(a4);
                    try {
                        if (AbstractC1464a.f15351f == null) {
                            AbstractC1464a.f15351f = Trace.class.getMethod("asyncTraceEnd", Long.TYPE, String.class, Integer.TYPE);
                        }
                        AbstractC1464a.f15351f.invoke(null, Long.valueOf(AbstractC1464a.f15348c), W7, Integer.valueOf(i9));
                    } catch (Exception e8) {
                        AbstractC1464a.y("asyncTraceEnd", e8);
                    }
                }
                try {
                    S5.a.b("DartMessenger#handleMessageFromDart on " + str2);
                    e eVar2 = eVar;
                    ByteBuffer byteBuffer2 = byteBuffer;
                    try {
                        if (eVar2 != null) {
                            try {
                                try {
                                    eVar2.f16193a.p(byteBuffer2, new f(flutterJNI, i9));
                                } catch (Exception e9) {
                                    Log.e("DartMessenger", "Uncaught exception in binary message listener", e9);
                                    flutterJNI.invokePlatformMessageEmptyResponseCallback(i9);
                                }
                            } catch (Error e10) {
                                Thread currentThread = Thread.currentThread();
                                if (currentThread.getUncaughtExceptionHandler() == null) {
                                    throw e10;
                                }
                                currentThread.getUncaughtExceptionHandler().uncaughtException(currentThread, e10);
                            }
                        } else {
                            flutterJNI.invokePlatformMessageEmptyResponseCallback(i9);
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
        d dVar2 = dVar;
        if (dVar == null) {
            dVar2 = this.f16211y;
        }
        dVar2.a(r02);
    }

    @Override // A5.f
    public final void c(String str, A5.d dVar) {
        n(str, dVar, null);
    }

    @Override // A5.f
    public final void j(String str, ByteBuffer byteBuffer) {
        k(str, byteBuffer, null);
    }

    @Override // A5.f
    public final void k(String str, ByteBuffer byteBuffer, A5.e eVar) {
        S5.a.b("DartMessenger#send on " + str);
        try {
            int i7 = this.f16210x;
            this.f16210x = i7 + 1;
            if (eVar != null) {
                this.f16209f.put(Integer.valueOf(i7), eVar);
            }
            FlutterJNI flutterJNI = this.f16204a;
            if (byteBuffer == null) {
                flutterJNI.dispatchEmptyPlatformMessage(str, i7);
            } else {
                flutterJNI.dispatchPlatformMessage(str, byteBuffer, byteBuffer.position(), i7);
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

    @Override // A5.f
    public final V m(m mVar) {
        R4.c cVar = this.f16203A;
        cVar.getClass();
        h hVar = new h((ExecutorService) cVar.f6064b);
        V v6 = new V(24);
        this.f16212z.put(v6, hVar);
        return v6;
    }

    @Override // A5.f
    public final void n(String str, A5.d dVar, V v6) {
        d dVar2;
        if (dVar == null) {
            synchronized (this.f16207d) {
                this.f16205b.remove(str);
            }
            return;
        }
        if (v6 != null) {
            dVar2 = (d) this.f16212z.get(v6);
            if (dVar2 == null) {
                throw new IllegalArgumentException("Unrecognized TaskQueue, use BinaryMessenger to create your TaskQueue (ex makeBackgroundTaskQueue).");
            }
        } else {
            dVar2 = null;
        }
        synchronized (this.f16207d) {
            try {
                this.f16205b.put(str, new e(dVar, dVar2));
                List<C1601c> list = (List) this.f16206c.remove(str);
                if (list == null) {
                    return;
                }
                for (C1601c c1601c : list) {
                    a(str, (e) this.f16205b.get(str), c1601c.f16190a, c1601c.f16191b, c1601c.f16192c);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
