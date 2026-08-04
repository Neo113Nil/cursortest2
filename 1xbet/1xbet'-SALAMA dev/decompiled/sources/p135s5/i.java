package p135s5;

import A5.d;
import A5.e;
import A5.f;
import A5.m;
import B4.V;
import R4.c;
import S5.a;
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

/* JADX INFO: loaded from: classes2.dex */
public final class i implements f, j {

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    public final c f16209A;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final FlutterJNI f16210a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final HashMap f16211b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final HashMap f16212c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Object f16213d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final AtomicBoolean f16214e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final HashMap f16215f;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public int f16216x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final k f16217y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public final WeakHashMap f16218z;

    public i(FlutterJNI flutterJNI) {
        c cVar = new c(24, false);
        cVar.f6064b = (ExecutorService) t.l0().f8078d;
        this.f16211b = new HashMap();
        this.f16212c = new HashMap();
        this.f16213d = new Object();
        this.f16214e = new AtomicBoolean(false);
        this.f16215f = new HashMap();
        this.f16216x = 1;
        this.f16217y = new k();
        this.f16218z = new WeakHashMap();
        this.f16210a = flutterJNI;
        this.f16209A = cVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v2, types: [s5.b] */
    public final void a(final String str, final e eVar, final ByteBuffer byteBuffer, final int i7, final long j) {
        d dVar = eVar != null ? eVar.f16200b : null;
        String strA = a.a("PlatformChannel ScheduleHandler on " + str);
        if (Build.VERSION.SDK_INT >= 29) {
            N0.a.a(i7, p097n3.a.W(strA));
        } else {
            String strW = p097n3.a.W(strA);
            try {
                if (p097n3.a.f15356e == null) {
                    p097n3.a.f15356e = Trace.class.getMethod("asyncTraceBegin", Long.TYPE, String.class, Integer.TYPE);
                }
                p097n3.a.f15356e.invoke(null, Long.valueOf(p097n3.a.f15354c), strW, Integer.valueOf(i7));
            } catch (Exception e7) {
                p097n3.a.y("asyncTraceBegin", e7);
            }
        }
        ?? r7 = new Runnable() { // from class: s5.b
            @Override // java.lang.Runnable
            public final void run() {
                long j3 = j;
                FlutterJNI flutterJNI = this.f16190a.f16210a;
                StringBuilder sb = new StringBuilder("PlatformChannel ScheduleHandler on ");
                String str2 = str;
                sb.append(str2);
                String strA2 = a.a(sb.toString());
                int i8 = Build.VERSION.SDK_INT;
                int i9 = i7;
                if (i8 >= 29) {
                    N0.a.b(i9, p097n3.a.W(strA2));
                } else {
                    String strW2 = p097n3.a.W(strA2);
                    try {
                        if (p097n3.a.f15357f == null) {
                            p097n3.a.f15357f = Trace.class.getMethod("asyncTraceEnd", Long.TYPE, String.class, Integer.TYPE);
                        }
                        p097n3.a.f15357f.invoke(null, Long.valueOf(p097n3.a.f15354c), strW2, Integer.valueOf(i9));
                    } catch (Exception e8) {
                        p097n3.a.y("asyncTraceEnd", e8);
                    }
                }
                try {
                    a.b("DartMessenger#handleMessageFromDart on " + str2);
                    e eVar2 = eVar;
                    ByteBuffer byteBuffer2 = byteBuffer;
                    try {
                        if (eVar2 != null) {
                            try {
                                try {
                                    eVar2.f16199a.p(byteBuffer2, new f(flutterJNI, i9));
                                } catch (Exception e9) {
                                    Log.e("DartMessenger", "Uncaught exception in binary message listener", e9);
                                    flutterJNI.invokePlatformMessageEmptyResponseCallback(i9);
                                }
                            } catch (Error e10) {
                                Thread threadCurrentThread = Thread.currentThread();
                                if (threadCurrentThread.getUncaughtExceptionHandler() == null) {
                                    throw e10;
                                }
                                threadCurrentThread.getUncaughtExceptionHandler().uncaughtException(threadCurrentThread, e10);
                            }
                        } else {
                            flutterJNI.invokePlatformMessageEmptyResponseCallback(i9);
                        }
                        if (byteBuffer2 != null && byteBuffer2.isDirect()) {
                            byteBuffer2.limit(0);
                        }
                        Trace.endSection();
                        flutterJNI.cleanupMessageData(j3);
                    } catch (Throwable th) {
                        try {
                            Trace.endSection();
                        } catch (Throwable th2) {
                            th.addSuppressed(th2);
                        }
                        throw th;
                    }
                } catch (Throwable th3) {
                    flutterJNI.cleanupMessageData(j3);
                    throw th3;
                }
            }
        };
        d dVar2 = dVar;
        if (dVar == null) {
            dVar2 = this.f16217y;
        }
        dVar2.a(r7);
    }

    @Override // A5.f
    public final void c(String str, d dVar) {
        n(str, dVar, null);
    }

    @Override // A5.f
    public final void j(String str, ByteBuffer byteBuffer) {
        k(str, byteBuffer, null);
    }

    @Override // A5.f
    public final void k(String str, ByteBuffer byteBuffer, e eVar) {
        a.b("DartMessenger#send on " + str);
        try {
            int i7 = this.f16216x;
            this.f16216x = i7 + 1;
            if (eVar != null) {
                this.f16215f.put(Integer.valueOf(i7), eVar);
            }
            FlutterJNI flutterJNI = this.f16210a;
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
        c cVar = this.f16209A;
        cVar.getClass();
        h hVar = new h((ExecutorService) cVar.f6064b);
        V v6 = new V(24);
        this.f16218z.put(v6, hVar);
        return v6;
    }

    @Override // A5.f
    public final void n(String str, d dVar, V v6) {
        d dVar2;
        if (dVar == null) {
            synchronized (this.f16213d) {
                this.f16211b.remove(str);
            }
            return;
        }
        if (v6 != null) {
            dVar2 = (d) this.f16218z.get(v6);
            if (dVar2 == null) {
                throw new IllegalArgumentException("Unrecognized TaskQueue, use BinaryMessenger to create your TaskQueue (ex makeBackgroundTaskQueue).");
            }
        } else {
            dVar2 = null;
        }
        synchronized (this.f16213d) {
            try {
                this.f16211b.put(str, new e(dVar, dVar2));
                List<c> list = (List) this.f16212c.remove(str);
                if (list == null) {
                    return;
                }
                for (c cVar : list) {
                    a(str, (e) this.f16211b.get(str), cVar.f16196a, cVar.f16197b, cVar.f16198c);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
