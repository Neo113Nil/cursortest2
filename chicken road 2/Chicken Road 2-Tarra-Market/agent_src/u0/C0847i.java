package u0;

import a.AbstractC0009a;
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

/* renamed from: u0.i, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0847i implements D0.f, InterfaceC0848j {

    /* renamed from: a, reason: collision with root package name */
    public final FlutterJNI f6720a;

    /* renamed from: b, reason: collision with root package name */
    public final HashMap f6721b;

    /* renamed from: c, reason: collision with root package name */
    public final HashMap f6722c;

    /* renamed from: d, reason: collision with root package name */
    public final Object f6723d;

    /* renamed from: e, reason: collision with root package name */
    public final AtomicBoolean f6724e;

    /* renamed from: f, reason: collision with root package name */
    public final HashMap f6725f;

    /* renamed from: g, reason: collision with root package name */
    public int f6726g;

    /* renamed from: h, reason: collision with root package name */
    public final C0849k f6727h;

    /* renamed from: i, reason: collision with root package name */
    public final WeakHashMap f6728i;

    /* renamed from: j, reason: collision with root package name */
    public final io.flutter.plugin.editing.a f6729j;

    public C0847i(FlutterJNI flutterJNI) {
        io.flutter.plugin.editing.a aVar = new io.flutter.plugin.editing.a(12);
        aVar.f5792b = (ExecutorService) C0.b.i().f56d;
        this.f6721b = new HashMap();
        this.f6722c = new HashMap();
        this.f6723d = new Object();
        this.f6724e = new AtomicBoolean(false);
        this.f6725f = new HashMap();
        this.f6726g = 1;
        this.f6727h = new C0849k();
        this.f6728i = new WeakHashMap();
        this.f6720a = flutterJNI;
        this.f6729j = aVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v2, types: [u0.c] */
    public final void a(final String str, final C0844f c0844f, final ByteBuffer byteBuffer, final int i2, final long j2) {
        InterfaceC0843e interfaceC0843e = c0844f != null ? c0844f.f6713b : null;
        String a2 = J0.a.a("PlatformChannel ScheduleHandler on " + str);
        if (Build.VERSION.SDK_INT >= 29) {
            u.a.a(i2, AbstractC0009a.H(a2));
        } else {
            String H2 = AbstractC0009a.H(a2);
            try {
                if (AbstractC0009a.f544h == null) {
                    AbstractC0009a.f544h = Trace.class.getMethod("asyncTraceBegin", Long.TYPE, String.class, Integer.TYPE);
                }
                AbstractC0009a.f544h.invoke(null, Long.valueOf(AbstractC0009a.f542f), H2, Integer.valueOf(i2));
            } catch (Exception e2) {
                AbstractC0009a.p("asyncTraceBegin", e2);
            }
        }
        ?? r02 = new Runnable() { // from class: u0.c
            @Override // java.lang.Runnable
            public final void run() {
                long j3 = j2;
                FlutterJNI flutterJNI = C0847i.this.f6720a;
                StringBuilder sb = new StringBuilder("PlatformChannel ScheduleHandler on ");
                String str2 = str;
                sb.append(str2);
                String a3 = J0.a.a(sb.toString());
                int i3 = Build.VERSION.SDK_INT;
                int i4 = i2;
                if (i3 >= 29) {
                    u.a.b(i4, AbstractC0009a.H(a3));
                } else {
                    String H3 = AbstractC0009a.H(a3);
                    try {
                        if (AbstractC0009a.f545i == null) {
                            AbstractC0009a.f545i = Trace.class.getMethod("asyncTraceEnd", Long.TYPE, String.class, Integer.TYPE);
                        }
                        AbstractC0009a.f545i.invoke(null, Long.valueOf(AbstractC0009a.f542f), H3, Integer.valueOf(i4));
                    } catch (Exception e3) {
                        AbstractC0009a.p("asyncTraceEnd", e3);
                    }
                }
                try {
                    J0.a.b("DartMessenger#handleMessageFromDart on " + str2);
                    C0844f c0844f2 = c0844f;
                    ByteBuffer byteBuffer2 = byteBuffer;
                    try {
                        if (c0844f2 != null) {
                            try {
                                try {
                                    c0844f2.f6712a.h(byteBuffer2, new C0845g(flutterJNI, i4));
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
        InterfaceC0843e interfaceC0843e2 = interfaceC0843e;
        if (interfaceC0843e == null) {
            interfaceC0843e2 = this.f6727h;
        }
        interfaceC0843e2.a(r02);
    }

    @Override // D0.f
    public final void b(String str, D0.d dVar) {
        f(str, dVar, null);
    }

    @Override // D0.f
    public final N.i d(D0.h hVar) {
        io.flutter.plugin.editing.a aVar = this.f6729j;
        aVar.getClass();
        C0846h c0846h = new C0846h((ExecutorService) aVar.f5792b);
        N.i iVar = new N.i(19);
        this.f6728i.put(iVar, c0846h);
        return iVar;
    }

    @Override // D0.f
    public final void f(String str, D0.d dVar, N.i iVar) {
        InterfaceC0843e interfaceC0843e;
        if (dVar == null) {
            synchronized (this.f6723d) {
                this.f6721b.remove(str);
            }
            return;
        }
        if (iVar != null) {
            interfaceC0843e = (InterfaceC0843e) this.f6728i.get(iVar);
            if (interfaceC0843e == null) {
                throw new IllegalArgumentException("Unrecognized TaskQueue, use BinaryMessenger to create your TaskQueue (ex makeBackgroundTaskQueue).");
            }
        } else {
            interfaceC0843e = null;
        }
        synchronized (this.f6723d) {
            try {
                this.f6721b.put(str, new C0844f(dVar, interfaceC0843e));
                List<C0842d> list = (List) this.f6722c.remove(str);
                if (list == null) {
                    return;
                }
                for (C0842d c0842d : list) {
                    a(str, (C0844f) this.f6721b.get(str), c0842d.f6709a, c0842d.f6710b, c0842d.f6711c);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // D0.f
    public final void g(String str, ByteBuffer byteBuffer, D0.e eVar) {
        J0.a.b("DartMessenger#send on " + str);
        try {
            int i2 = this.f6726g;
            this.f6726g = i2 + 1;
            if (eVar != null) {
                this.f6725f.put(Integer.valueOf(i2), eVar);
            }
            FlutterJNI flutterJNI = this.f6720a;
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
}
